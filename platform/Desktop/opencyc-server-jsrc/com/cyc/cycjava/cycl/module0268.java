package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0268 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0268";
    public static final String myFingerPrint = "808d5bf93878759c6fac0905615033cfbabbc2d6ddcbd28503da9773de20fb68";
    private static SubLSymbol $g2531$;
    private static SubLSymbol $g2532$;
    public static SubLSymbol $g2533$;
    public static SubLSymbol $g2534$;
    public static SubLSymbol $g2535$;
    public static SubLSymbol $g2536$;
    public static SubLSymbol $g2537$;
    private static SubLSymbol $g2538$;
    public static SubLSymbol $g2539$;
    public static SubLSymbol $g2540$;
    public static SubLSymbol $g2541$;
    public static SubLSymbol $g2542$;
    public static SubLSymbol $g2543$;
    public static SubLSymbol $g2544$;
    public static SubLSymbol $g2545$;
    public static SubLSymbol $g2546$;
    public static SubLSymbol $g2547$;
    public static SubLSymbol $g2548$;
    public static SubLSymbol $g2549$;
    public static SubLSymbol $g2550$;
    public static SubLSymbol $g2551$;
    public static SubLSymbol $g2552$;
    public static SubLSymbol $g2553$;
    public static SubLSymbol $g2554$;
    public static SubLSymbol $g2555$;
    private static SubLSymbol $g2556$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    
    public static SubLObject f17598() {
        module0268.$g2531$.setGlobalValue((SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17599() {
        return module0268.$g2531$.getGlobalValue();
    }
    
    public static SubLObject f17600(final SubLObject var1) {
        if (module0268.NIL == conses_high.member(var1, module0268.$g2543$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0268.EQL), Symbols.symbol_function((SubLObject)module0268.IDENTITY))) {
            module0268.$g2543$.setGlobalValue((SubLObject)ConsesLow.cons(var1, module0268.$g2543$.getGlobalValue()));
        }
        module0268.$g2546$.setGlobalValue(ConsesLow.append(module0268.$g2542$.getGlobalValue(), module0268.$g2543$.getGlobalValue(), module0268.$g2544$.getGlobalValue(), module0268.$g2545$.getGlobalValue()));
        module0268.$g2547$.setGlobalValue(module0078.f5367(Sequences.reverse(module0268.$g2546$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        SubLObject var3;
        final SubLObject var2 = var3 = module0035.remove_if_not((SubLObject)module0268.$ic13$, module0259.f16847(var1), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        SubLObject var4 = (SubLObject)module0268.NIL;
        var4 = var3.first();
        while (module0268.NIL != var3) {
            f17601(module0268.$ic14$, var4, (SubLObject)module0268.T);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var1;
    }
    
    public static SubLObject f17602() {
        return module0268.$g2546$.getGlobalValue();
    }
    
    public static SubLObject f17603(final SubLObject var6) {
        return f17604(var6, module0268.$ic14$);
    }
    
    public static SubLObject f17605(final SubLObject var1) {
        if (module0268.NIL == conses_high.member(var1, module0268.$g2551$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0268.EQL), Symbols.symbol_function((SubLObject)module0268.IDENTITY))) {
            module0268.$g2551$.setGlobalValue((SubLObject)ConsesLow.cons(var1, module0268.$g2551$.getGlobalValue()));
        }
        module0268.$g2552$.setGlobalValue(module0078.f5367(Sequences.reverse(module0268.$g2551$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        SubLObject var3;
        final SubLObject var2 = var3 = module0035.remove_if_not((SubLObject)module0268.$ic13$, module0259.f16995(var1), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        SubLObject var4 = (SubLObject)module0268.NIL;
        var4 = var3.first();
        while (module0268.NIL != var3) {
            f17601(module0268.$ic19$, var4, (SubLObject)module0268.T);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var1;
    }
    
    public static SubLObject f17606(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic23$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)module0268.NIL;
        SubLObject var16 = (SubLObject)module0268.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic23$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic23$);
        var16 = var13.first();
        var13 = var13.rest();
        if (module0268.NIL == var13) {
            final SubLObject var17;
            var13 = (var17 = var14);
            return (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic24$, (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic25$, var16)), ConsesLow.append(var17, (SubLObject)module0268.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0268.$ic23$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17604(final SubLObject var18, final SubLObject var16) {
        return module0077.f5320(var18, f17607(var16));
    }
    
    public static SubLObject f17608(final SubLObject var19, final SubLObject var18) {
        return (SubLObject)((module0268.NIL != module0173.f10955(var18)) ? module0173.f10990(var19, var18) : module0268.NIL);
    }
    
    public static SubLObject f17607(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            return module0268.$g2547$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic19$)) {
            return module0268.$g2552$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic26$)) {
            return module0268.$g2539$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic27$)) {
            return module0268.$g2533$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic28$)) {
            return module0268.$g2533$.getGlobalValue();
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17609(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            return module0268.$g2546$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic19$)) {
            return module0268.$g2551$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic26$)) {
            return module0268.$g2538$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic27$)) {
            return module0268.$g2532$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic28$)) {
            return module0268.$g2532$.getGlobalValue();
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17610(final SubLObject var16) {
        return f17604(var16, module0268.$ic27$);
    }
    
    public static SubLObject f17611(final SubLObject var21) {
        return f17604(var21, module0268.$ic14$);
    }
    
    public static SubLObject f17612(final SubLObject var21) {
        return f17604(var21, module0268.$ic26$);
    }
    
    public static SubLObject f17613(final SubLObject var16) {
        return module0004.f104(var16, module0268.$g2555$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
    }
    
    public static SubLObject f17614(SubLObject var22) {
        if (var22 == module0268.UNPROVIDED) {
            var22 = (SubLObject)module0268.TEN_INTEGER;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (!module0268.$g2556$.getDynamicValue(var23).isHashtable()) {
            Errors.error((SubLObject)module0268.$ic29$);
        }
        else {
            SubLObject var24 = module0035.f2124(var22, Sort.sort(Sequences.remove_duplicates(module0030.f1627(module0268.$g2556$.getDynamicValue(var23)), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED), (SubLObject)module0268.$ic31$, (SubLObject)module0268.UNPROVIDED));
            SubLObject var25 = (SubLObject)module0268.NIL;
            var25 = var24.first();
            while (module0268.NIL != var24) {
                SubLObject var4_25 = module0030.f1628(module0268.$g2556$.getDynamicValue(var23), var25, (SubLObject)module0268.UNPROVIDED);
                SubLObject var26 = (SubLObject)module0268.NIL;
                var26 = var4_25.first();
                while (module0268.NIL != var4_25) {
                    PrintLow.format((SubLObject)module0268.T, (SubLObject)module0268.$ic30$, var25, var26);
                    var4_25 = var4_25.rest();
                    var26 = var4_25.first();
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17615(final SubLObject var16, final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != module0136.f8877() && module0268.NIL != f17613(var16) && module0268.NIL != module0173.f10955(var27) && module0268.NIL != f17604(var28, var16));
        if (module0268.$g2556$.getDynamicValue(var29).isHashtable() && module0268.NIL != module0173.f10955(var27) && module0268.NIL != module0136.f8877() && module0268.NIL == var30) {
            module0030.f1615((SubLObject)ConsesLow.list(var16, var28), module0268.$g2556$.getDynamicValue(var29), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        return var30;
    }
    
    public static SubLObject f17616(final SubLObject var16, final SubLObject var30, final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != module0136.f8877() && module0268.NIL != f17613(var16) && module0268.NIL != module0035.f2370((SubLObject)module0268.$ic13$, var30, (SubLObject)module0268.UNPROVIDED) && module0268.NIL != f17604(var18, var16));
    }
    
    public static SubLObject f17617(final SubLObject var16, final SubLObject var31, final SubLObject var18, SubLObject var32) {
        if (var32 == module0268.UNPROVIDED) {
            var32 = (SubLObject)module0268.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        module0413.f28798();
        f17618(var16, var18);
        SubLObject var34 = (SubLObject)module0268.NIL;
        final SubLObject var35 = var32;
        final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
        final SubLObject var37 = module0147.$g2094$.currentBinding(var33);
        final SubLObject var38 = module0147.$g2096$.currentBinding(var33);
        try {
            module0147.$g2095$.bind(module0147.f9545(var35), var33);
            module0147.$g2094$.bind(module0147.f9546(var35), var33);
            module0147.$g2096$.bind(module0147.f9549(var35), var33);
            var34 = f17619(var16, var31, var18);
        }
        finally {
            module0147.$g2096$.rebind(var38, var33);
            module0147.$g2094$.rebind(var37, var33);
            module0147.$g2095$.rebind(var36, var33);
        }
        if (module0268.NIL != var34) {
            module0413.f28800();
        }
        return var34;
    }
    
    public static SubLObject f17620(final SubLObject var16, final SubLObject var18, SubLObject var32) {
        if (var32 == module0268.UNPROVIDED) {
            var32 = (SubLObject)module0268.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0268.NIL;
        final SubLObject var35 = var32;
        final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
        final SubLObject var37 = module0147.$g2094$.currentBinding(var33);
        final SubLObject var38 = module0147.$g2096$.currentBinding(var33);
        try {
            module0147.$g2095$.bind(module0147.f9545(var35), var33);
            module0147.$g2094$.bind(module0147.f9546(var35), var33);
            module0147.$g2096$.bind(module0147.f9549(var35), var33);
            var34 = f17621(var16, var18);
        }
        finally {
            module0147.$g2096$.rebind(var38, var33);
            module0147.$g2094$.rebind(var37, var33);
            module0147.$g2095$.rebind(var36, var33);
        }
        return var34;
    }
    
    public static SubLObject f17622(final SubLObject var16, final SubLObject var37) {
        return module0067.f4902(module0067.f4884(f17623(var16), var37, (SubLObject)module0268.UNPROVIDED));
    }
    
    public static SubLObject f17619(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        return (module0268.NIL != module0147.f9513()) ? f17624(var16, var31, var18) : f17625(var16, var31, var18);
    }
    
    public static SubLObject f17621(final SubLObject var16, final SubLObject var18) {
        return (module0268.NIL != module0147.f9513()) ? f17626(var16, var18) : f17627(var16, var18);
    }
    
    public static SubLObject f17623(final SubLObject var16) {
        f17628(var16);
        return f17629(var16);
    }
    
    public static SubLObject f17629(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            return module0268.$g2548$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic19$)) {
            return module0268.$g2553$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic27$)) {
            return module0268.$g2534$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic28$)) {
            return module0268.$g2535$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic26$)) {
            return module0268.$g2540$.getGlobalValue();
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17630(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        assert module0268.NIL != module0244.f15730(var16) : var16;
        final SubLObject var32 = f17623(var16);
        if (module0268.NIL != var32) {
            final SubLObject var33 = module0067.f4885(var32, var18, (SubLObject)module0268.UNPROVIDED);
            return (SubLObject)((module0268.NIL != var33) ? module0067.f4885(var33, var31, (SubLObject)module0268.UNPROVIDED) : module0268.NIL);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17625(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        return module0147.f9560(f17630(var16, var31, var18));
    }
    
    public static SubLObject f17631(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic33$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)module0268.NIL;
        SubLObject var16 = (SubLObject)module0268.NIL;
        SubLObject var17 = (SubLObject)module0268.NIL;
        SubLObject var18 = (SubLObject)module0268.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic33$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic33$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic33$);
        var17 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic33$);
        var18 = var13.first();
        var13 = var13.rest();
        if (module0268.NIL == var13) {
            final SubLObject var19;
            var13 = (var19 = var14);
            final SubLObject var20 = (SubLObject)module0268.$ic34$;
            return (SubLObject)ConsesLow.list((SubLObject)module0268.$ic35$, (SubLObject)ConsesLow.list(var15, var20, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic36$, var18)), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic38$, var20), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic40$, var20, var17))), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic37$, var16, ConsesLow.append(var19, (SubLObject)module0268.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0268.$ic33$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17627(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0268.NIL;
        SubLObject var21;
        for (var21 = module0066.f4838(module0067.f4891(f17623(var16))); module0268.NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
            var19.resetMultipleValues();
            final SubLObject var22 = module0066.f4839(var21);
            final SubLObject var23 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (module0268.NIL != module0067.f4852(var23)) {
                final SubLObject var24 = module0067.f4884(var23, var18, (SubLObject)module0268.UNPROVIDED);
                if (module0268.NIL != var24 && module0268.NIL != module0147.f9560(var24)) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
        }
        module0066.f4842(var21);
        return var20;
    }
    
    public static SubLObject f17632(final SubLObject var16, final SubLObject var31, final SubLObject var18, final SubLObject var32) {
        return module0004.f104(var32, module0067.f4884(module0067.f4884(f17623(var16), var18, (SubLObject)module0268.UNPROVIDED), var31, (SubLObject)module0268.UNPROVIDED), (SubLObject)module0268.$ic41$, (SubLObject)module0268.UNPROVIDED);
    }
    
    public static SubLObject f17633(final SubLObject var16) {
        return Equality.eql(var16, module0268.$ic14$);
    }
    
    public static SubLObject f17634(final SubLObject var16) {
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17635(final SubLObject var16) {
        f17628(var16);
        return f17636(var16);
    }
    
    public static SubLObject f17636(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            return module0268.$g2550$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic19$)) {
            return module0268.$g2554$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic27$)) {
            return module0268.$g2536$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic28$)) {
            return module0268.$g2537$.getGlobalValue();
        }
        if (var16.eql(module0268.$ic26$)) {
            return module0268.$g2541$.getGlobalValue();
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17628(final SubLObject var16) {
        if (module0268.NIL == f17636(var16) || module0268.NIL == f17629(var16)) {
            f17637(var16);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17637(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0012.$g71$.currentBinding(var17);
        final SubLObject var19 = module0012.$g72$.currentBinding(var17);
        try {
            module0012.$g71$.bind((SubLObject)module0268.TWO_INTEGER, var17);
            module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)module0268.$ic42$, new SubLObject[] { module0006.f203(var16), module0268.$ic43$ }), var17);
            final SubLObject var20 = Sequences.cconcatenate((SubLObject)module0268.$ic42$, new SubLObject[] { module0006.f203(var16), module0268.$ic43$ });
            final SubLObject var34_50 = module0012.$g73$.currentBinding(var17);
            final SubLObject var35_51 = module0012.$g65$.currentBinding(var17);
            final SubLObject var21 = module0012.$g67$.currentBinding(var17);
            final SubLObject var22 = module0012.$g68$.currentBinding(var17);
            final SubLObject var23 = module0012.$g66$.currentBinding(var17);
            final SubLObject var24 = module0012.$g69$.currentBinding(var17);
            final SubLObject var25 = module0012.$g70$.currentBinding(var17);
            final SubLObject var26 = module0012.$silent_progressP$.currentBinding(var17);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var17);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var17), var17);
                module0012.$g67$.bind((SubLObject)module0268.ONE_INTEGER, var17);
                module0012.$g68$.bind((SubLObject)module0268.ZERO_INTEGER, var17);
                module0012.$g66$.bind((SubLObject)module0268.ZERO_INTEGER, var17);
                module0012.$g69$.bind((SubLObject)module0268.ZERO_INTEGER, var17);
                module0012.$g70$.bind((SubLObject)module0268.T, var17);
                module0012.$silent_progressP$.bind((SubLObject)((module0268.NIL != var20) ? module0012.$silent_progressP$.getDynamicValue(var17) : module0268.T), var17);
                module0012.f474(var20);
                f17638(var16);
                f17639(var16);
                f17640(var16);
                f17641(var16);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var26, var17);
                module0012.$g70$.rebind(var25, var17);
                module0012.$g69$.rebind(var24, var17);
                module0012.$g66$.rebind(var23, var17);
                module0012.$g68$.rebind(var22, var17);
                module0012.$g67$.rebind(var21, var17);
                module0012.$g65$.rebind(var35_51, var17);
                module0012.$g73$.rebind(var34_50, var17);
            }
        }
        finally {
            module0012.$g72$.rebind(var19, var17);
            module0012.$g71$.rebind(var18, var17);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17618(final SubLObject var16, final SubLObject var18) {
        f17628(var16);
        if (module0268.NIL == module0084.f5808(f17629(var16), var18) && module0268.NIL != f17604(var18, var16) && module0268.NIL != module0220.f14556(var18, var16, (SubLObject)module0268.TWO_INTEGER, (SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.UNPROVIDED)) {
            f17642(var16, var18);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17642(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (var16.eql(module0268.$ic14$)) {
            final SubLObject var20 = module0012.$g71$.currentBinding(var19);
            final SubLObject var21 = module0012.$g72$.currentBinding(var19);
            try {
                module0012.$g71$.bind((SubLObject)module0268.TWO_INTEGER, var19);
                module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)module0268.$ic44$, new SubLObject[] { module0006.f203(var18), module0268.$ic45$, module0006.f203(var16), module0268.$ic43$ }), var19);
                final SubLObject var22 = Sequences.cconcatenate((SubLObject)module0268.$ic44$, new SubLObject[] { module0006.f203(var18), module0268.$ic45$, module0006.f203(var16), module0268.$ic43$ });
                final SubLObject var34_57 = module0012.$g73$.currentBinding(var19);
                final SubLObject var35_58 = module0012.$g65$.currentBinding(var19);
                final SubLObject var23 = module0012.$g67$.currentBinding(var19);
                final SubLObject var24 = module0012.$g68$.currentBinding(var19);
                final SubLObject var25 = module0012.$g66$.currentBinding(var19);
                final SubLObject var26 = module0012.$g69$.currentBinding(var19);
                final SubLObject var27 = module0012.$g70$.currentBinding(var19);
                final SubLObject var28 = module0012.$silent_progressP$.currentBinding(var19);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var19);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                    module0012.$g67$.bind((SubLObject)module0268.ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)module0268.T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((module0268.NIL != var22) ? module0012.$silent_progressP$.getDynamicValue(var19) : module0268.T), var19);
                    module0012.f474(var22);
                    f17600(var18);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var28, var19);
                    module0012.$g70$.rebind(var27, var19);
                    module0012.$g69$.rebind(var26, var19);
                    module0012.$g66$.rebind(var25, var19);
                    module0012.$g68$.rebind(var24, var19);
                    module0012.$g67$.rebind(var23, var19);
                    module0012.$g65$.rebind(var35_58, var19);
                    module0012.$g73$.rebind(var34_57, var19);
                }
            }
            finally {
                module0012.$g72$.rebind(var21, var19);
                module0012.$g71$.rebind(var20, var19);
            }
        }
        else if (var16.eql(module0268.$ic19$)) {
            final SubLObject var20 = module0012.$g71$.currentBinding(var19);
            final SubLObject var21 = module0012.$g72$.currentBinding(var19);
            try {
                module0012.$g71$.bind((SubLObject)module0268.TWO_INTEGER, var19);
                module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)module0268.$ic44$, new SubLObject[] { module0006.f203(var18), module0268.$ic45$, module0006.f203(var16), module0268.$ic43$ }), var19);
                final SubLObject var22 = Sequences.cconcatenate((SubLObject)module0268.$ic44$, new SubLObject[] { module0006.f203(var18), module0268.$ic45$, module0006.f203(var16), module0268.$ic43$ });
                final SubLObject var34_58 = module0012.$g73$.currentBinding(var19);
                final SubLObject var35_59 = module0012.$g65$.currentBinding(var19);
                final SubLObject var23 = module0012.$g67$.currentBinding(var19);
                final SubLObject var24 = module0012.$g68$.currentBinding(var19);
                final SubLObject var25 = module0012.$g66$.currentBinding(var19);
                final SubLObject var26 = module0012.$g69$.currentBinding(var19);
                final SubLObject var27 = module0012.$g70$.currentBinding(var19);
                final SubLObject var28 = module0012.$silent_progressP$.currentBinding(var19);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var19);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                    module0012.$g67$.bind((SubLObject)module0268.ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)module0268.ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)module0268.T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((module0268.NIL != var22) ? module0012.$silent_progressP$.getDynamicValue(var19) : module0268.T), var19);
                    module0012.f474(var22);
                    f17605(var18);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var28, var19);
                    module0012.$g70$.rebind(var27, var19);
                    module0012.$g69$.rebind(var26, var19);
                    module0012.$g66$.rebind(var25, var19);
                    module0012.$g68$.rebind(var24, var19);
                    module0012.$g67$.rebind(var23, var19);
                    module0012.$g65$.rebind(var35_59, var19);
                    module0012.$g73$.rebind(var34_58, var19);
                }
            }
            finally {
                module0012.$g72$.rebind(var21, var19);
                module0012.$g71$.rebind(var20, var19);
            }
        }
        else {
            f17637(var16);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17624(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        final SubLObject var32 = f17633(var16);
        final SubLObject var33 = f17635(var16);
        final SubLObject var34 = (module0268.NIL != var32) ? f17608(var33, var31) : module0067.f4885(var33, var18, (SubLObject)module0268.UNPROVIDED);
        return (SubLObject)((module0268.NIL != module0077.f5302(var34)) ? ((module0268.NIL != var32) ? module0077.f5320(var18, var34) : module0077.f5320(var31, var34)) : module0268.NIL);
    }
    
    public static SubLObject f17626(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0268.NIL != f17633(var16)) {
            final SubLObject var20 = f17608(f17635(var16), var18);
            return (SubLObject)((module0268.NIL != module0077.f5302(var20)) ? module0077.f5312(var20) : module0268.NIL);
        }
        SubLObject var21 = (SubLObject)module0268.NIL;
        SubLObject var22;
        for (var22 = module0066.f4838(module0067.f4891(f17635(var16))); module0268.NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
            var19.resetMultipleValues();
            final SubLObject var23 = module0066.f4839(var22);
            final SubLObject var24 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (module0268.NIL != module0077.f5320(var18, var24)) {
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
        }
        module0066.f4842(var22);
        return var21;
    }
    
    public static SubLObject f17643(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic46$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)module0268.NIL;
        SubLObject var16 = (SubLObject)module0268.NIL;
        SubLObject var17 = (SubLObject)module0268.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic46$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic46$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic46$);
        var17 = var13.first();
        var13 = var13.rest();
        if (module0268.NIL == var13) {
            final SubLObject var18;
            var13 = (var18 = var14);
            final SubLObject var19 = (SubLObject)module0268.$ic47$;
            final SubLObject var20 = (SubLObject)module0268.$ic48$;
            final SubLObject var21 = (SubLObject)module0268.$ic49$;
            return (SubLObject)ConsesLow.list((SubLObject)module0268.$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic50$, var17))), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic52$, var21), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic53$, (SubLObject)ConsesLow.list(var16, var20, var21), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic24$, (SubLObject)ConsesLow.list(var15, var20), ConsesLow.append(var18, (SubLObject)module0268.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic35$, (SubLObject)ConsesLow.list(var15, var19, var21), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic24$, (SubLObject)ConsesLow.list(var16, var19), ConsesLow.append(var18, (SubLObject)module0268.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0268.$ic46$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17644(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic54$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)module0268.NIL;
        SubLObject var16 = (SubLObject)module0268.NIL;
        SubLObject var17 = (SubLObject)module0268.NIL;
        SubLObject var18 = (SubLObject)module0268.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic54$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic54$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic54$);
        var17 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic54$);
        var18 = var13.first();
        var13 = var13.rest();
        if (module0268.NIL == var13) {
            final SubLObject var19;
            var13 = (var19 = var14);
            final SubLObject var20 = (SubLObject)module0268.$ic55$;
            final SubLObject var21 = (SubLObject)module0268.$ic56$;
            return (SubLObject)ConsesLow.list((SubLObject)module0268.$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic36$, var16))), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic35$, (SubLObject)ConsesLow.list(var15, var21, var20), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic57$, var18, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic40$, var21, var17)), ConsesLow.append(var19, (SubLObject)module0268.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0268.$ic54$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17645(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic58$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)module0268.NIL;
        SubLObject var16 = (SubLObject)module0268.NIL;
        SubLObject var17 = (SubLObject)module0268.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic58$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic58$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0268.$ic58$);
        var17 = var13.first();
        var13 = var13.rest();
        if (module0268.NIL == var13) {
            final SubLObject var18;
            var13 = (var18 = var14);
            final SubLObject var19 = (SubLObject)module0268.$ic59$;
            final SubLObject var20 = (SubLObject)module0268.$ic60$;
            return (SubLObject)ConsesLow.list((SubLObject)module0268.$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic50$, var16))), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic61$, var16), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic24$, (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic62$, var19, var17)), ConsesLow.append(var18, (SubLObject)module0268.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0268.$ic35$, (SubLObject)ConsesLow.list(var15, var20, var19), (SubLObject)ConsesLow.listS((SubLObject)module0268.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0268.$ic63$, var17, var20), ConsesLow.append(var18, (SubLObject)module0268.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0268.$ic58$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17646() {
        f17639(module0268.$ic27$);
        f17639(module0268.$ic28$);
        f17639(module0268.$ic26$);
        f17639(module0268.$ic14$);
        f17639(module0268.$ic19$);
        SubLObject var4 = (SubLObject)module0268.$ic64$;
        SubLObject var5 = (SubLObject)module0268.NIL;
        var5 = var4.first();
        while (module0268.NIL != var4) {
            if (module0268.NIL != var5) {
                final SubLObject var6 = module0077.f5333(f17607(var5));
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var7 = module0032.f1741(var6), var8 = (SubLObject)module0268.NIL, var8 = module0032.f1742(var7, var6); module0268.NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                    var9 = module0032.f1745(var7, var8);
                    if (module0268.NIL != module0032.f1746(var8, var9)) {
                        var10 = f17647();
                        module0067.f4886(f17629(var5), var9, var10);
                    }
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17639(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            module0268.$g2548$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic19$)) {
            module0268.$g2553$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic27$)) {
            module0268.$g2534$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic28$)) {
            module0268.$g2535$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic26$)) {
            module0268.$g2540$.setGlobalValue(f17648());
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17649() {
        f17638(module0268.$ic27$);
        f17638(module0268.$ic28$);
        f17638(module0268.$ic26$);
        f17638(module0268.$ic14$);
        f17638(module0268.$ic19$);
        f17650();
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17638(final SubLObject var16) {
        if (var16.eql(module0268.$ic14$)) {
            module0268.$g2550$.setGlobalValue(module0173.f10985());
        }
        else if (var16.eql(module0268.$ic19$)) {
            module0268.$g2554$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic27$)) {
            module0268.$g2536$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic28$)) {
            module0268.$g2537$.setGlobalValue(f17648());
        }
        else if (var16.eql(module0268.$ic26$)) {
            module0268.$g2541$.setGlobalValue(f17648());
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17648() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
    }
    
    public static SubLObject f17647() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
    }
    
    public static SubLObject f17650() {
        module0268.$g2549$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        module0067.f4886(module0268.$g2549$.getGlobalValue(), module0268.$ic65$, (SubLObject)ConsesLow.list(module0268.$ic66$, module0268.$ic67$, module0268.$ic68$, module0268.$ic69$));
        return module0268.$g2549$.getGlobalValue();
    }
    
    public static SubLObject f17651() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0110.$g1374$.currentBinding(var23);
        try {
            module0110.$g1374$.bind((SubLObject)module0268.T, var23);
            f17649();
            f17646();
            SubLObject var25 = (SubLObject)module0268.$ic64$;
            module0012.$g82$.setDynamicValue((SubLObject)module0268.$ic70$, var23);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var23);
            module0012.$g83$.setDynamicValue(Sequences.length(var25), var23);
            module0012.$g84$.setDynamicValue((SubLObject)module0268.ZERO_INTEGER, var23);
            final SubLObject var34_85 = module0012.$g75$.currentBinding(var23);
            SubLObject var26 = module0012.$g76$.currentBinding(var23);
            SubLObject var27 = module0012.$g77$.currentBinding(var23);
            SubLObject var28 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)module0268.ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)module0268.NIL, var23);
                module0012.$g77$.bind((SubLObject)module0268.T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(module0012.$g82$.getDynamicValue(var23));
                SubLObject var29 = var25;
                SubLObject var30 = (SubLObject)module0268.NIL;
                var30 = var29.first();
                while (module0268.NIL != var29) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var23), module0012.$g83$.getDynamicValue(var23));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var23), (SubLObject)module0268.ONE_INTEGER), var23);
                    f17640(var30);
                    var29 = var29.rest();
                    var30 = var29.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var28, var23);
                module0012.$g77$.rebind(var27, var23);
                module0012.$g76$.rebind(var26, var23);
                module0012.$g75$.rebind(var34_85, var23);
            }
            var25 = (SubLObject)module0268.$ic64$;
            module0012.$g82$.setDynamicValue((SubLObject)module0268.$ic71$, var23);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var23);
            module0012.$g83$.setDynamicValue(Sequences.length(var25), var23);
            module0012.$g84$.setDynamicValue((SubLObject)module0268.ZERO_INTEGER, var23);
            final SubLObject var34_86 = module0012.$g75$.currentBinding(var23);
            var26 = module0012.$g76$.currentBinding(var23);
            var27 = module0012.$g77$.currentBinding(var23);
            var28 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)module0268.ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)module0268.NIL, var23);
                module0012.$g77$.bind((SubLObject)module0268.T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(module0012.$g82$.getDynamicValue(var23));
                SubLObject var29 = var25;
                SubLObject var30 = (SubLObject)module0268.NIL;
                var30 = var29.first();
                while (module0268.NIL != var29) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var23), module0012.$g83$.getDynamicValue(var23));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var23), (SubLObject)module0268.ONE_INTEGER), var23);
                    f17641(var30);
                    var29 = var29.rest();
                    var30 = var29.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var28, var23);
                module0012.$g77$.rebind(var27, var23);
                module0012.$g76$.rebind(var26, var23);
                module0012.$g75$.rebind(var34_86, var23);
            }
        }
        finally {
            module0110.$g1374$.rebind(var24, var23);
        }
        module0268.$g2531$.setGlobalValue((SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17640(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0136.$g1597$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0136.$g1597$.bind((SubLObject)module0268.T, var17);
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var17);
            module0147.$g2095$.bind(module0268.$ic73$, var17);
            if (var16.eql(module0268.$ic27$) || var16.eql(module0268.$ic28$)) {
                f17652();
            }
            else if (var16.eql(module0268.$ic26$)) {
                f17653();
            }
            else if (var16.eql(module0268.$ic14$)) {
                f17654();
            }
            else if (var16.eql(module0268.$ic19$)) {
                f17655();
            }
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
            module0136.$g1597$.rebind(var18, var17);
        }
        if (module0268.NIL != f17633(var16)) {
            f17634(var16);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17641(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0136.$g1597$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0136.$g1597$.bind((SubLObject)module0268.T, var17);
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var17);
            module0147.$g2095$.bind(module0268.$ic73$, var17);
            if (var16.eql(module0268.$ic27$)) {
                f17656();
            }
            else if (var16.eql(module0268.$ic28$)) {
                f17657();
            }
            else if (var16.eql(module0268.$ic26$)) {
                f17658();
            }
            else if (var16.eql(module0268.$ic14$)) {
                f17659();
            }
            else if (var16.eql(module0268.$ic19$)) {
                f17660();
            }
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
            module0136.$g1597$.rebind(var18, var17);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17661(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        f17662(var16, var18, var31, var32);
        f17663(var16, var18, var31);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17662(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        final SubLObject var33 = f17623(var16);
        SubLObject var34 = module0067.f4884(var33, var18, (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL == var34) {
            var34 = module0067.f4880(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
        }
        module0084.f5765(var34, var31, var32, Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
        module0067.f4886(var33, var18, var34);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17664(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = module0253.f16446(module0137.f8955(var16), var31, var18, (SubLObject)module0268.UNPROVIDED);
        SubLObject var34 = (SubLObject)module0268.NIL;
        var34 = var33.first();
        while (module0268.NIL != var33) {
            f17662(var16, var18, var31, var34);
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f17663(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        final SubLObject var32 = f17635(var16);
        if (module0268.NIL != f17633(var16)) {
            SubLObject var33 = f17608(var32, var31);
            if (module0268.NIL == var33) {
                var33 = module0077.f5313(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
            }
            module0077.f5326(var18, var33);
            module0173.f10991(var32, var31, var33);
        }
        else {
            SubLObject var34 = module0067.f4884(var32, var18, (SubLObject)module0268.UNPROVIDED);
            if (module0268.NIL == var34) {
                var34 = module0077.f5313(Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
            }
            module0077.f5326(var31, var34);
            module0067.f4886(var32, var18, var34);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17665(final SubLObject var88) {
        if (module0268.NIL != f17666() && module0268.NIL != module0178.f11343(var88, (SubLObject)module0268.$ic74$)) {
            final SubLObject var90;
            final SubLObject var89 = var90 = module0178.f11332(var88);
            if (var90.eql(module0268.$ic14$)) {
                f17667(var88);
            }
            else if (var90.eql(module0268.$ic19$)) {
                f17668(var88);
            }
            else if (var90.eql(module0268.$ic26$)) {
                f17669(var88);
            }
            else if (var90.eql(module0268.$ic27$)) {
                f17670(var88);
            }
            else if (var90.eql(module0268.$ic28$)) {
                f17670(var88);
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17671(final SubLObject var88, final SubLObject var89, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0268.NIL;
        final SubLObject var93 = module0136.$g1597$.currentBinding(var91);
        try {
            module0136.$g1597$.bind((SubLObject)module0268.T, var91);
            final SubLObject var94 = module0178.f11334(var88);
            final SubLObject var95 = module0178.f11335(var88);
            final SubLObject var96 = f17672(var89, var95, var90);
            final SubLObject var97 = f17626(var90, var94);
            SubLObject var99;
            final SubLObject var98 = var99 = conses_high.set_difference(var96, var97, Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
            SubLObject var100 = (SubLObject)module0268.NIL;
            var100 = var99.first();
            while (module0268.NIL != var99) {
                var92 = (SubLObject)module0268.T;
                f17663(var90, var100, var94);
                var99 = var99.rest();
                var100 = var99.first();
            }
            var99 = var96;
            SubLObject var101 = (SubLObject)module0268.NIL;
            var101 = var99.first();
            while (module0268.NIL != var99) {
                SubLObject var4_99 = module0253.f16446(module0137.f8955(var90), var94, var95, (SubLObject)module0268.UNPROVIDED);
                SubLObject var102 = (SubLObject)module0268.NIL;
                var102 = var4_99.first();
                while (module0268.NIL != var4_99) {
                    if (module0268.NIL == f17632(var90, var94, var101, var102)) {
                        var92 = (SubLObject)module0268.T;
                        f17662(var90, var101, var94, var102);
                    }
                    var4_99 = var4_99.rest();
                    var102 = var4_99.first();
                }
                var99 = var99.rest();
                var101 = var99.first();
            }
        }
        finally {
            module0136.$g1597$.rebind(var93, var91);
        }
        return var92;
    }
    
    public static SubLObject f17673(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        SubLObject var33 = (SubLObject)module0268.NIL;
        var33 = f17674(var16, var18, var31, var32);
        if (module0268.NIL != var33) {
            f17675(var16, var18, var31);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17674(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        final SubLObject var33 = module0067.f4884(f17623(var16), var18, (SubLObject)module0268.UNPROVIDED);
        final SubLObject var34 = module0067.f4884(var33, var31, (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL != module0035.f1997(var34) && var32.eql(var34.first())) {
            module0067.f4887(var33, var31);
            return (SubLObject)module0268.T;
        }
        module0084.f5771(var33, var31, var32, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17675(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        final SubLObject var32 = f17635(var16);
        if (module0268.NIL != f17633(var16)) {
            final SubLObject var33 = f17608(var32, var31);
            module0077.f5327(var18, var33);
            if (module0268.NIL != module0077.f5316(var33)) {
                module0173.f10992(var32, var31);
            }
            else {
                module0173.f10991(var32, var31, var33);
            }
        }
        else {
            final SubLObject var34 = module0067.f4884(var32, var18, (SubLObject)module0268.UNPROVIDED);
            module0077.f5327(var31, var34);
            if (module0268.NIL != module0077.f5316(var34)) {
                module0067.f4887(var32, var18);
            }
            else {
                module0067.f4886(var32, var18, var34);
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17676(final SubLObject var88) {
        if (module0268.NIL != f17666() && module0268.NIL != module0178.f11343(var88, (SubLObject)module0268.$ic74$)) {
            final SubLObject var90;
            final SubLObject var89 = var90 = module0178.f11332(var88);
            if (var90.eql(module0268.$ic14$)) {
                f17677(var88);
            }
            else if (var90.eql(module0268.$ic19$)) {
                f17678(var88);
            }
            else if (var90.eql(module0268.$ic26$)) {
                f17679(var88);
            }
            else if (var90.eql(module0268.$ic27$)) {
                f17680(var88);
            }
            else if (var90.eql(module0268.$ic28$)) {
                f17680(var88);
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17681(final SubLObject var16, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)module0268.NIL;
        final SubLObject var91 = module0136.$g1597$.currentBinding(var89);
        try {
            module0136.$g1597$.bind((SubLObject)module0268.T, var89);
            final SubLObject var92 = module0178.f11334(var88);
            final SubLObject var93 = module0178.f11287(var88);
            final SubLObject var94 = f17626(var16, var92);
            final SubLObject var95 = f17672(var16, var92, var16);
            SubLObject var97;
            final SubLObject var96 = var97 = conses_high.set_difference(var94, var95, Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
            SubLObject var98 = (SubLObject)module0268.NIL;
            var98 = var97.first();
            while (module0268.NIL != var97) {
                var90 = (SubLObject)module0268.T;
                f17675(var16, var98, var92);
                var97 = var97.rest();
                var98 = var97.first();
            }
            final SubLObject var99 = module0248.f15936(module0137.f8955(var16), var92, var93);
            final SubLObject var100 = f17623(var16);
            SubLObject var101;
            for (var101 = module0066.f4838(module0067.f4891(var100)); module0268.NIL == module0066.f4841(var101); var101 = module0066.f4840(var101)) {
                var89.resetMultipleValues();
                final SubLObject var102 = module0066.f4839(var101);
                final SubLObject var103 = var89.secondMultipleValue();
                var89.resetMultipleValues();
                if (module0268.NIL != module0004.f104(var93, module0067.f4884(var103, var92, (SubLObject)module0268.UNPROVIDED), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) {
                    final SubLObject var104 = module0202.f12768(var16, var92, var102);
                    final SubLObject var105 = (module0268.NIL != module0226.f14824(var104)) ? module0226.f14826(var104) : var93;
                    if (module0268.NIL == var99 || module0268.NIL == module0252.f16335(module0137.f8955(var16), var92, var102, var105, (SubLObject)module0268.UNPROVIDED)) {
                        var90 = (SubLObject)module0268.T;
                        f17674(var16, var102, var92, var105);
                    }
                }
            }
            module0066.f4842(var101);
        }
        finally {
            module0136.$g1597$.rebind(var91, var89);
        }
        return var90;
    }
    
    public static SubLObject f17666() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != module0136.f8877() && module0268.NIL == module0136.$g1596$.getDynamicValue(var23));
    }
    
    public static SubLObject f17682(final SubLObject var16, final SubLObject var31, final SubLObject var18, final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != f17624(var16, var31, var18) && module0268.NIL != f17632(var16, var31, var18, var32));
    }
    
    public static SubLObject f17672(final SubLObject var16, final SubLObject var18, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = f17609(var90);
        SubLObject var93 = (SubLObject)module0268.NIL;
        final SubLObject var94 = module0147.$g2094$.currentBinding(var91);
        final SubLObject var95 = module0147.$g2095$.currentBinding(var91);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var91);
            module0147.$g2095$.bind(module0268.$ic73$, var91);
            var93 = module0252.f16320(module0137.f8955(var16), var18, var92, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var95, var91);
            module0147.$g2094$.rebind(var94, var91);
        }
        return var93;
    }
    
    public static SubLObject f17683(final SubLObject var16, final SubLObject var18, final SubLObject var90, final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        final SubLObject var116 = f17609(var90);
        SubLObject var117 = (SubLObject)module0268.NIL;
        final SubLObject var118 = module0147.$g2094$.currentBinding(var115);
        final SubLObject var119 = module0147.$g2095$.currentBinding(var115);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var115);
            module0147.$g2095$.bind(module0268.$ic73$, var115);
            var117 = module0252.f16323(module0137.f8955(var16), var18, var116, var114, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var119, var115);
            module0147.$g2094$.rebind(var118, var115);
        }
        return var117;
    }
    
    public static SubLObject f17684(final SubLObject var18, final SubLObject var16) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0268.NIL != f17633(var16)) {
            module0173.f10992(f17635(var16), var18);
        }
        else {
            final SubLObject var20 = f17635(var16);
            final SubLObject var115_116 = f17635(var16);
            if (module0268.NIL != f17633(var16)) {
                final SubLObject var21 = module0077.f5333(f17608(var115_116, var18));
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                for (var22 = module0032.f1741(var21), var23 = (SubLObject)module0268.NIL, var23 = module0032.f1742(var22, var21); module0268.NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
                    var24 = module0032.f1745(var22, var23);
                    if (module0268.NIL != module0032.f1746(var23, var24)) {
                        var25 = module0067.f4884(var20, var24, (SubLObject)module0268.UNPROVIDED);
                        if (module0268.NIL != var25) {
                            module0077.f5327(var18, var25);
                        }
                    }
                }
            }
            else {
                SubLObject var26;
                for (var26 = module0066.f4838(module0067.f4891(var115_116)); module0268.NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
                    var19.resetMultipleValues();
                    final SubLObject var27 = module0066.f4839(var26);
                    final SubLObject var28 = var19.secondMultipleValue();
                    var19.resetMultipleValues();
                    if (module0268.NIL != module0077.f5320(var18, var28)) {
                        final SubLObject var29 = module0067.f4884(var20, var27, (SubLObject)module0268.UNPROVIDED);
                        if (module0268.NIL != var29) {
                            module0077.f5327(var18, var29);
                        }
                    }
                }
                module0066.f4842(var26);
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17685(final SubLObject var18, final SubLObject var16) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20;
        for (var20 = module0066.f4838(module0067.f4891(f17623(var16))); module0268.NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
            var19.resetMultipleValues();
            final SubLObject var21 = module0066.f4839(var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (module0268.NIL != module0067.f4852(var22)) {
                module0067.f4887(var22, var18);
            }
        }
        module0066.f4842(var20);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17601(final SubLObject var16, final SubLObject var18, SubLObject var120) {
        if (var120 == module0268.UNPROVIDED) {
            var120 = (SubLObject)module0268.T;
        }
        final SubLThread var121 = SubLProcess.currentSubLThread();
        final SubLObject var122 = module0136.$g1597$.currentBinding(var121);
        final SubLObject var123 = module0147.$g2094$.currentBinding(var121);
        final SubLObject var124 = module0147.$g2095$.currentBinding(var121);
        try {
            module0136.$g1597$.bind((SubLObject)module0268.T, var121);
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var121);
            module0147.$g2095$.bind(module0268.$ic73$, var121);
            if (module0268.NIL != var120) {
                f17684(var18, var16);
                f17685(var18, var16);
            }
            SubLObject var126;
            final SubLObject var125 = var126 = f17672(var16, var18, var16);
            SubLObject var127 = (SubLObject)module0268.NIL;
            var127 = var126.first();
            while (module0268.NIL != var126) {
                f17663(var16, var127, var18);
                if (module0268.NIL != module0244.f15772(module0137.f8955(var16)) && var127.eql(var18)) {
                    f17662(var16, var18, var18, module0268.$ic75$);
                }
                else {
                    f17664(var16, var127, var18);
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var124, var121);
            module0147.$g2094$.rebind(var123, var121);
            module0136.$g1597$.rebind(var122, var121);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17652() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607(module0268.$ic27$));
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        SubLObject var34_126;
        SubLObject var34;
        SubLObject var35;
        SubLObject var34_127;
        SubLObject var35_128;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var34_128;
        SubLObject var35_129;
        SubLObject var36_131;
        SubLObject var121_132;
        SubLObject var39;
        SubLObject var40;
        SubLObject var34_129;
        SubLObject var41;
        SubLObject var43;
        SubLObject var42;
        SubLObject var44;
        SubLObject var34_130;
        SubLObject var35_130;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var34_131;
        SubLObject var46_147;
        SubLObject var51;
        SubLObject var52;
        SubLObject var34_132;
        SubLObject var53;
        SubLObject var80_152;
        SubLObject var81_153;
        SubLObject var82_154;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var4_157;
        SubLObject var57;
        SubLObject var58;
        SubLObject var34_133;
        SubLObject var60;
        SubLObject var59;
        SubLObject var80_153;
        SubLObject var81_154;
        SubLObject var82_155;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)module0268.NIL, var26 = module0032.f1742(var25, var24); module0268.NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (module0268.NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = (SubLObject)module0268.$ic78$;
                var30 = module0056.f4145(var29);
                var31 = (SubLObject)module0268.NIL;
                var32 = module0139.$g1635$.currentBinding(var23);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var23);
                    var33 = (SubLObject)module0268.NIL;
                    var34_126 = module0141.$g1714$.currentBinding(var23);
                    var34 = module0141.$g1715$.currentBinding(var23);
                    try {
                        module0141.$g1714$.bind((module0268.NIL != var33) ? var33 : module0141.f9283(), var23);
                        module0141.$g1715$.bind((SubLObject)((module0268.NIL != var33) ? module0268.$ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                        if (module0268.NIL != var33 && module0268.NIL != module0136.f8864() && module0268.NIL == module0141.f9279(var33)) {
                            var35 = module0136.$g1591$.getDynamicValue(var23);
                            if (var35.eql((SubLObject)module0268.$ic80$)) {
                                module0136.f8870((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                            else if (var35.eql((SubLObject)module0268.$ic83$)) {
                                module0136.f8871((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                            else if (var35.eql((SubLObject)module0268.$ic85$)) {
                                Errors.warn((SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                            }
                            else {
                                Errors.warn((SubLObject)module0268.$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                Errors.cerror((SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                            }
                        }
                        var34_127 = module0141.$g1670$.currentBinding(var23);
                        var35_128 = module0141.$g1671$.currentBinding(var23);
                        var36 = module0141.$g1672$.currentBinding(var23);
                        var37 = module0141.$g1674$.currentBinding(var23);
                        var38 = module0137.$g1605$.currentBinding(var23);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0268.$ic27$), var23);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0268.$ic27$)), var23);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0268.$ic27$)), var23);
                            module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                            module0137.$g1605$.bind(module0137.f8955(module0268.$ic27$), var23);
                            if (module0268.NIL != module0136.f8865() || module0268.NIL != module0244.f15795(var27, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                var34_128 = module0141.$g1677$.currentBinding(var23);
                                var35_129 = module0138.$g1619$.currentBinding(var23);
                                var36_131 = module0141.$g1674$.currentBinding(var23);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var23);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0268.$ic27$)), var23);
                                    module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                    module0249.f16055(var28, (SubLObject)module0268.UNPROVIDED);
                                    for (var31 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); module0268.NIL != var31; var31 = module0056.f4150(var30)) {
                                        var121_132 = var31.first();
                                        var39 = conses_high.second(var31);
                                        var40 = var121_132;
                                        var34_129 = module0141.$g1674$.currentBinding(var23);
                                        try {
                                            module0141.$g1674$.bind(var39, var23);
                                            var41 = var39;
                                            if (module0268.NIL != module0173.f10955(var40)) {
                                                if (module0268.NIL != var41) {
                                                    f17663(module0268.$ic28$, var27, var40);
                                                }
                                                else {
                                                    f17663(module0268.$ic27$, var27, var40);
                                                }
                                            }
                                            var42 = (var43 = module0200.f12443(module0137.f8955(module0268.$ic27$)));
                                            var44 = (SubLObject)module0268.NIL;
                                            var44 = var43.first();
                                            while (module0268.NIL != var43) {
                                                var34_130 = module0137.$g1605$.currentBinding(var23);
                                                var35_130 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var44, var23);
                                                    module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var45 = module0228.f15229(var121_132);
                                                    if (module0268.NIL != module0138.f8992(var45)) {
                                                        var46 = module0242.f15664(var45, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var46) {
                                                            var47 = module0245.f15834(var46, module0138.f8979(), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                            if (module0268.NIL != var47) {
                                                                for (var48 = module0066.f4838(module0067.f4891(var47)); module0268.NIL == module0066.f4841(var48); var48 = module0066.f4840(var48)) {
                                                                    var23.resetMultipleValues();
                                                                    var49 = module0066.f4839(var48);
                                                                    var50 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (module0268.NIL != module0147.f9507(var49)) {
                                                                        var34_131 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var49, var23);
                                                                            for (var46_147 = module0066.f4838(module0067.f4891(var50)); module0268.NIL == module0066.f4841(var46_147); var46_147 = module0066.f4840(var46_147)) {
                                                                                var23.resetMultipleValues();
                                                                                var51 = module0066.f4839(var46_147);
                                                                                var52 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (module0268.NIL != module0141.f9289(var51)) {
                                                                                    var34_132 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var51, var23);
                                                                                        var53 = var52;
                                                                                        if (module0268.NIL != module0077.f5302(var53)) {
                                                                                            var80_152 = module0077.f5333(var53);
                                                                                            for (var81_153 = module0032.f1741(var80_152), var82_154 = (SubLObject)module0268.NIL, var82_154 = module0032.f1742(var81_153, var80_152); module0268.NIL == module0032.f1744(var81_153, var82_154); var82_154 = module0032.f1743(var82_154)) {
                                                                                                var54 = module0032.f1745(var81_153, var82_154);
                                                                                                if (module0268.NIL != module0032.f1746(var82_154, var54) && module0268.NIL == module0249.f16059(var54, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var54, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var30);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var53.isList()) {
                                                                                            var55 = var53;
                                                                                            var56 = (SubLObject)module0268.NIL;
                                                                                            var56 = var55.first();
                                                                                            while (module0268.NIL != var55) {
                                                                                                if (module0268.NIL == module0249.f16059(var56, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var56, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var56, module0141.f9195()), var30);
                                                                                                }
                                                                                                var55 = var55.rest();
                                                                                                var56 = var55.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0268.$ic87$, var53);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var34_132, var23);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var46_147);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_131, var23);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var48);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0268.NIL != module0155.f9785(var45, (SubLObject)module0268.UNPROVIDED)) {
                                                        var57 = (var4_157 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                        var58 = (SubLObject)module0268.NIL;
                                                        var58 = var4_157.first();
                                                        while (module0268.NIL != var4_157) {
                                                            var34_133 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var58, var23);
                                                                var59 = (var60 = Functions.funcall(var58, var45));
                                                                if (module0268.NIL != module0077.f5302(var60)) {
                                                                    var80_153 = module0077.f5333(var60);
                                                                    for (var81_154 = module0032.f1741(var80_153), var82_155 = (SubLObject)module0268.NIL, var82_155 = module0032.f1742(var81_154, var80_153); module0268.NIL == module0032.f1744(var81_154, var82_155); var82_155 = module0032.f1743(var82_155)) {
                                                                        var61 = module0032.f1745(var81_154, var82_155);
                                                                        if (module0268.NIL != module0032.f1746(var82_155, var61) && module0268.NIL == module0249.f16059(var61, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var61, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var61, module0141.f9195()), var30);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var60.isList()) {
                                                                    var62 = var60;
                                                                    var63 = (SubLObject)module0268.NIL;
                                                                    var63 = var62.first();
                                                                    while (module0268.NIL != var62) {
                                                                        if (module0268.NIL == module0249.f16059(var63, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var63, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var63, module0141.f9195()), var30);
                                                                        }
                                                                        var62 = var62.rest();
                                                                        var63 = var62.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0268.$ic87$, var60);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var34_133, var23);
                                                            }
                                                            var4_157 = var4_157.rest();
                                                            var58 = var4_157.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var35_130, var23);
                                                    module0137.$g1605$.rebind(var34_130, var23);
                                                }
                                                var43 = var43.rest();
                                                var44 = var43.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var34_129, var23);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var36_131, var23);
                                    module0138.$g1619$.rebind(var35_129, var23);
                                    module0141.$g1677$.rebind(var34_128, var23);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0268.TWO_INTEGER, (SubLObject)module0268.$ic89$, var27, module0244.f15748(module0137.f8955((SubLObject)module0268.UNPROVIDED)), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var38, var23);
                            module0141.$g1674$.rebind(var37, var23);
                            module0141.$g1672$.rebind(var36, var23);
                            module0141.$g1671$.rebind(var35_128, var23);
                            module0141.$g1670$.rebind(var34_127, var23);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var34, var23);
                        module0141.$g1714$.rebind(var34_126, var23);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var23));
                }
                finally {
                    module0139.$g1635$.rebind(var32, var23);
                }
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17656() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635(module0268.$ic27$);
        if (module0268.NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_167 = var26;
                if (module0268.NIL == module0065.f4775(var166_167, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_167);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var31 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0166.f10752(var31);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17662(module0268.$ic27$, var37, var37, module0268.$ic75$);
                                        f17664(module0268.$ic27$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_175 = var26;
                if (module0268.NIL == module0065.f4777(var174_175)) {
                    final SubLObject var38 = module0065.f4738(var174_175);
                    SubLObject var39 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0166.f10752(var39);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17662(module0268.$ic27$, var47, var47, module0268.$ic75$);
                                        f17664(module0268.$ic27$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
            var26 = module0173.f11000(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_168 = var26;
                if (module0268.NIL == module0065.f4775(var166_168, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_168);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var48 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17662(module0268.$ic27$, var37, var37, module0268.$ic75$);
                                        f17664(module0268.$ic27$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_176 = var26;
                if (module0268.NIL == module0065.f4777(var174_176)) {
                    final SubLObject var38 = module0065.f4738(var174_176);
                    SubLObject var49 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17662(module0268.$ic27$, var47, var47, module0268.$ic75$);
                                        f17664(module0268.$ic27$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
        }
        else {
            SubLObject var50;
            for (var50 = module0066.f4838(module0067.f4891(var24)); module0268.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0268.NIL, var55 = module0032.f1742(var54, var53); module0268.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (module0268.NIL != module0032.f1746(var55, var56)) {
                        f17662(module0268.$ic27$, var51, var51, module0268.$ic75$);
                        f17664(module0268.$ic27$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17657() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635(module0268.$ic28$);
        if (module0268.NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_183 = var26;
                if (module0268.NIL == module0065.f4775(var166_183, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_183);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var31 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0166.f10752(var31);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic28$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_184 = var26;
                if (module0268.NIL == module0065.f4777(var174_184)) {
                    final SubLObject var38 = module0065.f4738(var174_184);
                    SubLObject var39 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0166.f10752(var39);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic28$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
            var26 = module0173.f11000(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_184 = var26;
                if (module0268.NIL == module0065.f4775(var166_184, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_184);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var48 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic28$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_185 = var26;
                if (module0268.NIL == module0065.f4777(var174_185)) {
                    final SubLObject var38 = module0065.f4738(var174_185);
                    SubLObject var49 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic28$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
        }
        else {
            SubLObject var50;
            for (var50 = module0066.f4838(module0067.f4891(var24)); module0268.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0268.NIL, var55 = module0032.f1742(var54, var53); module0268.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (module0268.NIL != module0032.f1746(var55, var56)) {
                        f17664(module0268.$ic28$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17670(final SubLObject var88) {
        SubLObject var89 = (SubLObject)module0268.NIL;
        final SubLObject var90 = module0178.f11332(var88);
        if (var90.eql(module0268.$ic27$)) {
            final SubLObject var91 = f17671(var88, module0268.$ic27$, module0268.$ic27$);
            final SubLObject var92 = f17671(var88, module0268.$ic28$, module0268.$ic28$);
            var89 = (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != var91 || module0268.NIL != var92);
        }
        else if (var90.eql(module0268.$ic28$)) {
            final SubLObject var91 = f17671(var88, module0268.$ic27$, module0268.$ic28$);
            final SubLObject var92 = f17671(var88, module0268.$ic28$, module0268.$ic27$);
            var89 = (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != var91 || module0268.NIL != var92);
        }
        else {
            module0136.f8870((SubLObject)module0268.THREE_INTEGER, (SubLObject)module0268.$ic91$, module0178.f11332(var88), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        if (module0268.NIL != var89) {
            final SubLObject var93 = module0178.f11334(var88);
            f17686(var93);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17680(final SubLObject var88) {
        final SubLObject var89 = f17681(module0268.$ic27$, var88);
        final SubLObject var90 = f17681(module0268.$ic28$, var88);
        final SubLObject var91 = (SubLObject)SubLObjectFactory.makeBoolean(module0268.NIL != var89 || module0268.NIL != var90);
        if (module0268.NIL != var91) {
            final SubLObject var92 = module0178.f11334(var88);
            f17686(var92);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17686(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var17);
        final SubLObject var20 = module0136.$g1597$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var17);
            module0147.$g2095$.bind(module0268.$ic73$, var17);
            module0136.$g1597$.bind((SubLObject)module0268.T, var17);
            module0260.f17064((SubLObject)module0268.$ic92$, var16, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var20, var17);
            module0147.$g2095$.rebind(var19, var17);
            module0147.$g2094$.rebind(var18, var17);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17687(final SubLObject var16) {
        f17601(module0268.$ic27$, var16, (SubLObject)module0268.T);
        f17601(module0268.$ic28$, var16, (SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17653() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607(module0268.$ic26$));
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var34_197;
        SubLObject var33;
        SubLObject var34;
        SubLObject var34_198;
        SubLObject var35_199;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var34_199;
        SubLObject var35_200;
        SubLObject var36_202;
        SubLObject var38;
        SubLObject var40;
        SubLObject var39;
        SubLObject var41;
        SubLObject var34_200;
        SubLObject var35_201;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var34_201;
        SubLObject var46_206;
        SubLObject var48;
        SubLObject var49;
        SubLObject var34_202;
        SubLObject var50;
        SubLObject var80_208;
        SubLObject var81_209;
        SubLObject var82_210;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var4_212;
        SubLObject var54;
        SubLObject var55;
        SubLObject var34_203;
        SubLObject var57;
        SubLObject var56;
        SubLObject var80_209;
        SubLObject var81_210;
        SubLObject var82_211;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)module0268.NIL, var26 = module0032.f1742(var25, var24); module0268.NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (module0268.NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = (SubLObject)module0268.$ic77$;
                var30 = module0056.f4145(var29);
                var31 = module0139.$g1635$.currentBinding(var23);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var23);
                    var32 = (SubLObject)module0268.NIL;
                    var34_197 = module0141.$g1714$.currentBinding(var23);
                    var33 = module0141.$g1715$.currentBinding(var23);
                    try {
                        module0141.$g1714$.bind((module0268.NIL != var32) ? var32 : module0141.f9283(), var23);
                        module0141.$g1715$.bind((SubLObject)((module0268.NIL != var32) ? module0268.$ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                        if (module0268.NIL != var32 && module0268.NIL != module0136.f8864() && module0268.NIL == module0141.f9279(var32)) {
                            var34 = module0136.$g1591$.getDynamicValue(var23);
                            if (var34.eql((SubLObject)module0268.$ic80$)) {
                                module0136.f8870((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic81$, var32, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                            else if (var34.eql((SubLObject)module0268.$ic83$)) {
                                module0136.f8871((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var32, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                            else if (var34.eql((SubLObject)module0268.$ic85$)) {
                                Errors.warn((SubLObject)module0268.$ic81$, var32, (SubLObject)module0268.$ic82$);
                            }
                            else {
                                Errors.warn((SubLObject)module0268.$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                Errors.cerror((SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var32, (SubLObject)module0268.$ic82$);
                            }
                        }
                        var34_198 = module0141.$g1670$.currentBinding(var23);
                        var35_199 = module0141.$g1671$.currentBinding(var23);
                        var35 = module0141.$g1672$.currentBinding(var23);
                        var36 = module0141.$g1674$.currentBinding(var23);
                        var37 = module0137.$g1605$.currentBinding(var23);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0268.$ic26$), var23);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0268.$ic26$)), var23);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0268.$ic26$)), var23);
                            module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                            module0137.$g1605$.bind(module0137.f8955(module0268.$ic26$), var23);
                            if (module0268.NIL != module0136.f8865() || module0268.NIL != module0244.f15795(var27, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                var34_199 = module0141.$g1677$.currentBinding(var23);
                                var35_200 = module0138.$g1619$.currentBinding(var23);
                                var36_202 = module0141.$g1674$.currentBinding(var23);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var23);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0268.$ic26$)), var23);
                                    module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                    module0249.f16055(var28, (SubLObject)module0268.UNPROVIDED);
                                    while (module0268.NIL != var28) {
                                        var38 = var28;
                                        if (module0268.NIL != module0173.f10955(var38)) {
                                            f17663(module0268.$ic26$, var27, var38);
                                        }
                                        var39 = (var40 = module0200.f12443(module0137.f8955(module0268.$ic26$)));
                                        var41 = (SubLObject)module0268.NIL;
                                        var41 = var40.first();
                                        while (module0268.NIL != var40) {
                                            var34_200 = module0137.$g1605$.currentBinding(var23);
                                            var35_201 = module0141.$g1674$.currentBinding(var23);
                                            try {
                                                module0137.$g1605$.bind(var41, var23);
                                                module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                var42 = module0228.f15229(var28);
                                                if (module0268.NIL != module0138.f8992(var42)) {
                                                    var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                    if (module0268.NIL != var43) {
                                                        var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var44) {
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); module0268.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var23.resetMultipleValues();
                                                                var46 = module0066.f4839(var45);
                                                                var47 = var23.secondMultipleValue();
                                                                var23.resetMultipleValues();
                                                                if (module0268.NIL != module0147.f9507(var46)) {
                                                                    var34_201 = module0138.$g1623$.currentBinding(var23);
                                                                    try {
                                                                        module0138.$g1623$.bind(var46, var23);
                                                                        for (var46_206 = module0066.f4838(module0067.f4891(var47)); module0268.NIL == module0066.f4841(var46_206); var46_206 = module0066.f4840(var46_206)) {
                                                                            var23.resetMultipleValues();
                                                                            var48 = module0066.f4839(var46_206);
                                                                            var49 = var23.secondMultipleValue();
                                                                            var23.resetMultipleValues();
                                                                            if (module0268.NIL != module0141.f9289(var48)) {
                                                                                var34_202 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48, var23);
                                                                                    var50 = var49;
                                                                                    if (module0268.NIL != module0077.f5302(var50)) {
                                                                                        var80_208 = module0077.f5333(var50);
                                                                                        for (var81_209 = module0032.f1741(var80_208), var82_210 = (SubLObject)module0268.NIL, var82_210 = module0032.f1742(var81_209, var80_208); module0268.NIL == module0032.f1744(var81_209, var82_210); var82_210 = module0032.f1743(var82_210)) {
                                                                                            var51 = module0032.f1745(var81_209, var82_210);
                                                                                            if (module0268.NIL != module0032.f1746(var82_210, var51) && module0268.NIL == module0249.f16059(var51, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                module0249.f16055(var51, (SubLObject)module0268.UNPROVIDED);
                                                                                                module0056.f4149(var51, var30);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var52 = var50;
                                                                                        var53 = (SubLObject)module0268.NIL;
                                                                                        var53 = var52.first();
                                                                                        while (module0268.NIL != var52) {
                                                                                            if (module0268.NIL == module0249.f16059(var53, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                module0249.f16055(var53, (SubLObject)module0268.UNPROVIDED);
                                                                                                module0056.f4149(var53, var30);
                                                                                            }
                                                                                            var52 = var52.rest();
                                                                                            var53 = var52.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0268.$ic87$, var50);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var34_202, var23);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var46_206);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var34_201, var23);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var45);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0268.NIL != module0155.f9785(var42, (SubLObject)module0268.UNPROVIDED)) {
                                                    var54 = (var4_212 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                    var55 = (SubLObject)module0268.NIL;
                                                    var55 = var4_212.first();
                                                    while (module0268.NIL != var4_212) {
                                                        var34_203 = module0138.$g1625$.currentBinding(var23);
                                                        try {
                                                            module0138.$g1625$.bind(var55, var23);
                                                            var56 = (var57 = Functions.funcall(var55, var42));
                                                            if (module0268.NIL != module0077.f5302(var57)) {
                                                                var80_209 = module0077.f5333(var57);
                                                                for (var81_210 = module0032.f1741(var80_209), var82_211 = (SubLObject)module0268.NIL, var82_211 = module0032.f1742(var81_210, var80_209); module0268.NIL == module0032.f1744(var81_210, var82_211); var82_211 = module0032.f1743(var82_211)) {
                                                                    var58 = module0032.f1745(var81_210, var82_211);
                                                                    if (module0268.NIL != module0032.f1746(var82_211, var58) && module0268.NIL == module0249.f16059(var58, (SubLObject)module0268.UNPROVIDED)) {
                                                                        module0249.f16055(var58, (SubLObject)module0268.UNPROVIDED);
                                                                        module0056.f4149(var58, var30);
                                                                    }
                                                                }
                                                            }
                                                            else if (var57.isList()) {
                                                                var59 = var57;
                                                                var60 = (SubLObject)module0268.NIL;
                                                                var60 = var59.first();
                                                                while (module0268.NIL != var59) {
                                                                    if (module0268.NIL == module0249.f16059(var60, (SubLObject)module0268.UNPROVIDED)) {
                                                                        module0249.f16055(var60, (SubLObject)module0268.UNPROVIDED);
                                                                        module0056.f4149(var60, var30);
                                                                    }
                                                                    var59 = var59.rest();
                                                                    var60 = var59.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0268.$ic87$, var57);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var34_203, var23);
                                                        }
                                                        var4_212 = var4_212.rest();
                                                        var55 = var4_212.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var35_201, var23);
                                                module0137.$g1605$.rebind(var34_200, var23);
                                            }
                                            var40 = var40.rest();
                                            var41 = var40.first();
                                        }
                                        var28 = module0056.f4150(var30);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var36_202, var23);
                                    module0138.$g1619$.rebind(var35_200, var23);
                                    module0141.$g1677$.rebind(var34_199, var23);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0268.TWO_INTEGER, (SubLObject)module0268.$ic89$, var27, module0244.f15748(module0137.f8955((SubLObject)module0268.UNPROVIDED)), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var37, var23);
                            module0141.$g1674$.rebind(var36, var23);
                            module0141.$g1672$.rebind(var35, var23);
                            module0141.$g1671$.rebind(var35_199, var23);
                            module0141.$g1670$.rebind(var34_198, var23);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var33, var23);
                        module0141.$g1714$.rebind(var34_197, var23);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var23));
                }
                finally {
                    module0139.$g1635$.rebind(var31, var23);
                }
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17658() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635(module0268.$ic26$);
        if (module0268.NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_217 = var26;
                if (module0268.NIL == module0065.f4775(var166_217, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_217);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var31 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0166.f10752(var31);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17662(module0268.$ic26$, var37, var37, module0268.$ic75$);
                                        f17664(module0268.$ic26$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_218 = var26;
                if (module0268.NIL == module0065.f4777(var174_218)) {
                    final SubLObject var38 = module0065.f4738(var174_218);
                    SubLObject var39 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0166.f10752(var39);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17662(module0268.$ic26$, var47, var47, module0268.$ic75$);
                                        f17664(module0268.$ic26$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
            var26 = module0173.f11000(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_218 = var26;
                if (module0268.NIL == module0065.f4775(var166_218, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_218);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var48 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17662(module0268.$ic26$, var37, var37, module0268.$ic75$);
                                        f17664(module0268.$ic26$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_219 = var26;
                if (module0268.NIL == module0065.f4777(var174_219)) {
                    final SubLObject var38 = module0065.f4738(var174_219);
                    SubLObject var49 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17662(module0268.$ic26$, var47, var47, module0268.$ic75$);
                                        f17664(module0268.$ic26$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
        }
        else {
            SubLObject var50;
            for (var50 = module0066.f4838(module0067.f4891(var24)); module0268.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0268.NIL, var55 = module0032.f1742(var54, var53); module0268.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (module0268.NIL != module0032.f1746(var55, var56)) {
                        f17662(module0268.$ic26$, var51, var51, module0268.$ic75$);
                        f17664(module0268.$ic26$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17669(final SubLObject var88) {
        final SubLObject var89 = module0178.f11334(var88);
        final SubLObject var90 = module0178.f11335(var88);
        SubLObject var91 = (SubLObject)module0268.NIL;
        var91 = f17671(var88, module0268.$ic26$, module0268.$ic26$);
        if (module0268.NIL != var91) {
            f17688(var89);
        }
        final SubLObject var92 = f17672(module0268.$ic26$, var89, module0268.$ic14$);
        final SubLObject var93 = f17683(module0268.$ic26$, var89, module0268.$ic14$, var90);
        SubLObject var94 = conses_high.set_difference(var92, var93, Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL != var94) {
            f17689(var89);
        }
        final SubLObject var95 = f17672(module0268.$ic26$, var89, module0268.$ic19$);
        final SubLObject var96 = f17683(module0268.$ic26$, var89, module0268.$ic19$, var90);
        var94 = conses_high.set_difference(var95, var96, Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL != var94) {
            f17690(var89);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17679(final SubLObject var88) {
        final SubLObject var89 = module0178.f11334(var88);
        final SubLObject var90 = module0178.f11335(var88);
        SubLObject var91 = (SubLObject)module0268.NIL;
        var91 = f17681(module0268.$ic26$, var88);
        if (module0268.NIL != var91) {
            f17688(var89);
        }
        final SubLObject var92 = f17672(module0268.$ic26$, var89, module0268.$ic14$);
        final SubLObject var93 = f17672(module0268.$ic26$, var90, module0268.$ic14$);
        SubLObject var94 = conses_high.set_difference(var93, var92, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL != var94) {
            f17689(var89);
        }
        final SubLObject var95 = f17672(module0268.$ic26$, var89, module0268.$ic19$);
        final SubLObject var96 = f17672(module0268.$ic26$, var90, module0268.$ic19$);
        var94 = conses_high.set_difference(var96, var95, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        if (module0268.NIL != var94) {
            f17690(var89);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17689(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var22);
            module0147.$g2095$.bind(module0268.$ic73$, var22);
            module0136.$g1597$.bind((SubLObject)module0268.T, var22);
            module0259.f16869((SubLObject)module0268.$ic94$, var21, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17690(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var22);
            module0147.$g2095$.bind(module0268.$ic73$, var22);
            module0136.$g1597$.bind((SubLObject)module0268.T, var22);
            module0259.f16869((SubLObject)module0268.$ic95$, var21, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17688(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)module0268.$ic72$, var22);
            module0147.$g2095$.bind(module0268.$ic73$, var22);
            module0136.$g1597$.bind((SubLObject)module0268.T, var22);
            module0256.f16586((SubLObject)module0268.$ic96$, var21, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17691(final SubLObject var21) {
        f17601(module0268.$ic26$, var21, (SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17654() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607(module0268.$ic14$));
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var194_228;
        SubLObject var31;
        SubLObject var32;
        SubLObject var34_229;
        SubLObject var33;
        SubLObject var34_230;
        SubLObject var35_231;
        SubLObject var34;
        SubLObject var34_231;
        SubLObject var35_232;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var34_232;
        SubLObject var35_233;
        SubLObject var36_236;
        SubLObject var38;
        SubLObject var40;
        SubLObject var39;
        SubLObject var41;
        SubLObject var34_233;
        SubLObject var35_234;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var34_234;
        SubLObject var46_242;
        SubLObject var48;
        SubLObject var49;
        SubLObject var34_235;
        SubLObject var50;
        SubLObject var80_245;
        SubLObject var81_246;
        SubLObject var82_247;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var57;
        SubLObject var56;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var34_236;
        SubLObject var34_237;
        SubLObject var61;
        SubLObject var80_246;
        SubLObject var81_247;
        SubLObject var82_248;
        SubLObject var86_259;
        SubLObject var4_260;
        SubLObject var62;
        SubLObject var63;
        SubLObject var34_238;
        SubLObject var65;
        SubLObject var64;
        SubLObject var80_247;
        SubLObject var81_248;
        SubLObject var82_249;
        SubLObject var66;
        SubLObject var67;
        SubLObject var68;
        SubLObject var70;
        SubLObject var69;
        SubLObject var71;
        SubLObject var34_239;
        SubLObject var35_235;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var34_240;
        SubLObject var46_243;
        SubLObject var78;
        SubLObject var79;
        SubLObject var34_241;
        SubLObject var80;
        SubLObject var80_248;
        SubLObject var81_249;
        SubLObject var82_250;
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        SubLObject var4_261;
        SubLObject var84;
        SubLObject var85;
        SubLObject var34_242;
        SubLObject var87;
        SubLObject var86;
        SubLObject var80_249;
        SubLObject var81_250;
        SubLObject var82_251;
        SubLObject var88;
        SubLObject var89;
        SubLObject var90;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)module0268.NIL, var26 = module0032.f1742(var25, var24); module0268.NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (module0268.NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = module0137.$g1605$.currentBinding(var23);
                var30 = module0139.$g1636$.currentBinding(var23);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0268.$ic14$), var23);
                    module0139.$g1636$.bind(module0139.f9007(), var23);
                    var194_228 = var28;
                    var31 = (SubLObject)module0268.$ic77$;
                    var32 = module0056.f4145(var31);
                    var34_229 = module0139.$g1635$.currentBinding(var23);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var23);
                        var33 = (SubLObject)module0268.NIL;
                        var34_230 = module0141.$g1714$.currentBinding(var23);
                        var35_231 = module0141.$g1715$.currentBinding(var23);
                        try {
                            module0141.$g1714$.bind((module0268.NIL != var33) ? var33 : module0141.f9283(), var23);
                            module0141.$g1715$.bind((SubLObject)((module0268.NIL != var33) ? module0268.$ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                            if (module0268.NIL != var33 && module0268.NIL != module0136.f8864() && module0268.NIL == module0141.f9279(var33)) {
                                var34 = module0136.$g1591$.getDynamicValue(var23);
                                if (var34.eql((SubLObject)module0268.$ic80$)) {
                                    module0136.f8870((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)module0268.$ic83$)) {
                                    module0136.f8871((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)module0268.$ic85$)) {
                                    Errors.warn((SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0268.$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                    Errors.cerror((SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                                }
                            }
                            var34_231 = module0141.$g1670$.currentBinding(var23);
                            var35_232 = module0141.$g1671$.currentBinding(var23);
                            var35 = module0141.$g1672$.currentBinding(var23);
                            var36 = module0141.$g1674$.currentBinding(var23);
                            var37 = module0137.$g1605$.currentBinding(var23);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0268.$ic14$)), var23);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0268.$ic14$))), var23);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0268.$ic14$))), var23);
                                module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0268.$ic14$)), var23);
                                if (module0268.NIL != module0136.f8865() || module0268.NIL != module0244.f15795(var28, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                    var34_232 = module0141.$g1677$.currentBinding(var23);
                                    var35_233 = module0138.$g1619$.currentBinding(var23);
                                    var36_236 = module0141.$g1674$.currentBinding(var23);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var23);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0268.$ic14$))), var23);
                                        module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                        module0249.f16055(var194_228, (SubLObject)module0268.UNPROVIDED);
                                        while (module0268.NIL != var194_228) {
                                            var38 = var194_228;
                                            var39 = (var40 = module0200.f12443(module0137.f8955(module0268.$ic14$)));
                                            var41 = (SubLObject)module0268.NIL;
                                            var41 = var40.first();
                                            while (module0268.NIL != var40) {
                                                var34_233 = module0137.$g1605$.currentBinding(var23);
                                                var35_234 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var41, var23);
                                                    module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var42 = module0228.f15229(var38);
                                                    if (module0268.NIL != module0138.f8992(var42)) {
                                                        var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var43) {
                                                            var44 = module0245.f15834(var43, module0244.f15780(module0137.f8955(module0268.$ic14$)), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                            if (module0268.NIL != var44) {
                                                                for (var45 = module0066.f4838(module0067.f4891(var44)); module0268.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                    var23.resetMultipleValues();
                                                                    var46 = module0066.f4839(var45);
                                                                    var47 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (module0268.NIL != module0147.f9507(var46)) {
                                                                        var34_234 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var46, var23);
                                                                            for (var46_242 = module0066.f4838(module0067.f4891(var47)); module0268.NIL == module0066.f4841(var46_242); var46_242 = module0066.f4840(var46_242)) {
                                                                                var23.resetMultipleValues();
                                                                                var48 = module0066.f4839(var46_242);
                                                                                var49 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (module0268.NIL != module0141.f9289(var48)) {
                                                                                    var34_235 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var48, var23);
                                                                                        var50 = var49;
                                                                                        if (module0268.NIL != module0077.f5302(var50)) {
                                                                                            var80_245 = module0077.f5333(var50);
                                                                                            for (var81_246 = module0032.f1741(var80_245), var82_247 = (SubLObject)module0268.NIL, var82_247 = module0032.f1742(var81_246, var80_245); module0268.NIL == module0032.f1744(var81_246, var82_247); var82_247 = module0032.f1743(var82_247)) {
                                                                                                var51 = module0032.f1745(var81_246, var82_247);
                                                                                                if (module0268.NIL != module0032.f1746(var82_247, var51) && module0268.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (module0268.NIL != module0173.f10955(var51)) {
                                                                                                        f17663(module0268.$ic14$, var27, var51);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var50.isList()) {
                                                                                            var52 = var50;
                                                                                            var53 = (SubLObject)module0268.NIL;
                                                                                            var53 = var52.first();
                                                                                            while (module0268.NIL != var52) {
                                                                                                if (module0268.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (module0268.NIL != module0173.f10955(var53)) {
                                                                                                        f17663(module0268.$ic14$, var27, var53);
                                                                                                    }
                                                                                                }
                                                                                                var52 = var52.rest();
                                                                                                var53 = var52.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0268.$ic87$, var50);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var34_235, var23);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var46_242);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_234, var23);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var45);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                        }
                                                        if (module0268.NIL != module0200.f12419(var42, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                                            var54 = module0248.f15995(var42);
                                                            var55 = (SubLObject)module0268.NIL;
                                                            var55 = var54.first();
                                                            while (module0268.NIL != var54) {
                                                                var56 = (var57 = var55);
                                                                var58 = (SubLObject)module0268.NIL;
                                                                var59 = (SubLObject)module0268.NIL;
                                                                var60 = (SubLObject)module0268.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var58 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var59 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var60 = var57.first();
                                                                var57 = var57.rest();
                                                                if (module0268.NIL == var57) {
                                                                    if (module0268.NIL != module0147.f9507(var59)) {
                                                                        var34_236 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var59, var23);
                                                                            if (module0268.NIL != module0141.f9289(var60)) {
                                                                                var34_237 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60, var23);
                                                                                    var61 = (var50 = (SubLObject)ConsesLow.list(var58));
                                                                                    if (module0268.NIL != module0077.f5302(var50)) {
                                                                                        var80_246 = module0077.f5333(var50);
                                                                                        for (var81_247 = module0032.f1741(var80_246), var82_248 = (SubLObject)module0268.NIL, var82_248 = module0032.f1742(var81_247, var80_246); module0268.NIL == module0032.f1744(var81_247, var82_248); var82_248 = module0032.f1743(var82_248)) {
                                                                                            var51 = module0032.f1745(var81_247, var82_248);
                                                                                            if (module0268.NIL != module0032.f1746(var82_248, var51) && module0268.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (module0268.NIL != module0173.f10955(var51)) {
                                                                                                    f17663(module0268.$ic14$, var27, var51);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var86_259 = var50;
                                                                                        var53 = (SubLObject)module0268.NIL;
                                                                                        var53 = var86_259.first();
                                                                                        while (module0268.NIL != var86_259) {
                                                                                            if (module0268.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (module0268.NIL != module0173.f10955(var53)) {
                                                                                                    f17663(module0268.$ic14$, var27, var53);
                                                                                                }
                                                                                            }
                                                                                            var86_259 = var86_259.rest();
                                                                                            var53 = var86_259.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0268.$ic87$, var50);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var34_237, var23);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_236, var23);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)module0268.$ic97$);
                                                                }
                                                                var54 = var54.rest();
                                                                var55 = var54.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0268.NIL != module0155.f9785(var42, (SubLObject)module0268.UNPROVIDED)) {
                                                        var62 = (var4_260 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0268.$ic14$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0268.$ic14$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                        var63 = (SubLObject)module0268.NIL;
                                                        var63 = var4_260.first();
                                                        while (module0268.NIL != var4_260) {
                                                            var34_238 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var63, var23);
                                                                var64 = (var65 = Functions.funcall(var63, var42));
                                                                if (module0268.NIL != module0077.f5302(var65)) {
                                                                    var80_247 = module0077.f5333(var65);
                                                                    for (var81_248 = module0032.f1741(var80_247), var82_249 = (SubLObject)module0268.NIL, var82_249 = module0032.f1742(var81_248, var80_247); module0268.NIL == module0032.f1744(var81_248, var82_249); var82_249 = module0032.f1743(var82_249)) {
                                                                        var66 = module0032.f1745(var81_248, var82_249);
                                                                        if (module0268.NIL != module0032.f1746(var82_249, var66) && module0268.NIL == module0249.f16059(var66, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var66, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (module0268.NIL != module0173.f10955(var66)) {
                                                                                f17663(module0268.$ic14$, var27, var66);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var65.isList()) {
                                                                    var67 = var65;
                                                                    var68 = (SubLObject)module0268.NIL;
                                                                    var68 = var67.first();
                                                                    while (module0268.NIL != var67) {
                                                                        if (module0268.NIL == module0249.f16059(var68, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var68, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (module0268.NIL != module0173.f10955(var68)) {
                                                                                f17663(module0268.$ic14$, var27, var68);
                                                                            }
                                                                        }
                                                                        var67 = var67.rest();
                                                                        var68 = var67.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0268.$ic87$, var65);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var34_238, var23);
                                                            }
                                                            var4_260 = var4_260.rest();
                                                            var63 = var4_260.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var35_234, var23);
                                                    module0137.$g1605$.rebind(var34_233, var23);
                                                }
                                                var40 = var40.rest();
                                                var41 = var40.first();
                                            }
                                            var69 = (var70 = module0200.f12443(module0244.f15771(module0137.f8955(module0268.$ic14$))));
                                            var71 = (SubLObject)module0268.NIL;
                                            var71 = var70.first();
                                            while (module0268.NIL != var70) {
                                                var34_239 = module0137.$g1605$.currentBinding(var23);
                                                var35_235 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var71, var23);
                                                    module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var72 = module0228.f15229(var194_228);
                                                    if (module0268.NIL != module0138.f8992(var72)) {
                                                        var73 = module0242.f15664(var72, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var73) {
                                                            var74 = module0245.f15834(var73, module0138.f8979(), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                            if (module0268.NIL != var74) {
                                                                for (var75 = module0066.f4838(module0067.f4891(var74)); module0268.NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                                                                    var23.resetMultipleValues();
                                                                    var76 = module0066.f4839(var75);
                                                                    var77 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (module0268.NIL != module0147.f9507(var76)) {
                                                                        var34_240 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var76, var23);
                                                                            for (var46_243 = module0066.f4838(module0067.f4891(var77)); module0268.NIL == module0066.f4841(var46_243); var46_243 = module0066.f4840(var46_243)) {
                                                                                var23.resetMultipleValues();
                                                                                var78 = module0066.f4839(var46_243);
                                                                                var79 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (module0268.NIL != module0141.f9289(var78)) {
                                                                                    var34_241 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var78, var23);
                                                                                        var80 = var79;
                                                                                        if (module0268.NIL != module0077.f5302(var80)) {
                                                                                            var80_248 = module0077.f5333(var80);
                                                                                            for (var81_249 = module0032.f1741(var80_248), var82_250 = (SubLObject)module0268.NIL, var82_250 = module0032.f1742(var81_249, var80_248); module0268.NIL == module0032.f1744(var81_249, var82_250); var82_250 = module0032.f1743(var82_250)) {
                                                                                                var81 = module0032.f1745(var81_249, var82_250);
                                                                                                if (module0268.NIL != module0032.f1746(var82_250, var81) && module0268.NIL == module0249.f16059(var81, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var81, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149(var81, var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var80.isList()) {
                                                                                            var82 = var80;
                                                                                            var83 = (SubLObject)module0268.NIL;
                                                                                            var83 = var82.first();
                                                                                            while (module0268.NIL != var82) {
                                                                                                if (module0268.NIL == module0249.f16059(var83, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149(var83, var32);
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0268.$ic87$, var80);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var34_241, var23);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var46_243);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_240, var23);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var75);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0268.NIL != module0155.f9785(var72, (SubLObject)module0268.UNPROVIDED)) {
                                                        var84 = (var4_261 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                        var85 = (SubLObject)module0268.NIL;
                                                        var85 = var4_261.first();
                                                        while (module0268.NIL != var4_261) {
                                                            var34_242 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var85, var23);
                                                                var86 = (var87 = Functions.funcall(var85, var72));
                                                                if (module0268.NIL != module0077.f5302(var87)) {
                                                                    var80_249 = module0077.f5333(var87);
                                                                    for (var81_250 = module0032.f1741(var80_249), var82_251 = (SubLObject)module0268.NIL, var82_251 = module0032.f1742(var81_250, var80_249); module0268.NIL == module0032.f1744(var81_250, var82_251); var82_251 = module0032.f1743(var82_251)) {
                                                                        var88 = module0032.f1745(var81_250, var82_251);
                                                                        if (module0268.NIL != module0032.f1746(var82_251, var88) && module0268.NIL == module0249.f16059(var88, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var88, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149(var88, var32);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var87.isList()) {
                                                                    var89 = var87;
                                                                    var90 = (SubLObject)module0268.NIL;
                                                                    var90 = var89.first();
                                                                    while (module0268.NIL != var89) {
                                                                        if (module0268.NIL == module0249.f16059(var90, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var90, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149(var90, var32);
                                                                        }
                                                                        var89 = var89.rest();
                                                                        var90 = var89.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0268.$ic87$, var87);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var34_242, var23);
                                                            }
                                                            var4_261 = var4_261.rest();
                                                            var85 = var4_261.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var35_235, var23);
                                                    module0137.$g1605$.rebind(var34_239, var23);
                                                }
                                                var70 = var70.rest();
                                                var71 = var70.first();
                                            }
                                            var194_228 = module0056.f4150(var32);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var36_236, var23);
                                        module0138.$g1619$.rebind(var35_233, var23);
                                        module0141.$g1677$.rebind(var34_232, var23);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0268.TWO_INTEGER, (SubLObject)module0268.$ic89$, var28, module0244.f15748(module0137.f8955((SubLObject)module0268.UNPROVIDED)), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var37, var23);
                                module0141.$g1674$.rebind(var36, var23);
                                module0141.$g1672$.rebind(var35, var23);
                                module0141.$g1671$.rebind(var35_232, var23);
                                module0141.$g1670$.rebind(var34_231, var23);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var35_231, var23);
                            module0141.$g1714$.rebind(var34_230, var23);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var23));
                    }
                    finally {
                        module0139.$g1635$.rebind(var34_229, var23);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var23));
                }
                finally {
                    module0139.$g1636$.rebind(var30, var23);
                    module0137.$g1605$.rebind(var29, var23);
                }
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17659() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635(module0268.$ic14$);
        if (module0268.NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_278 = var26;
                if (module0268.NIL == module0065.f4775(var166_278, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_278);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var31 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0166.f10752(var31);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic14$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_279 = var26;
                if (module0268.NIL == module0065.f4777(var174_279)) {
                    final SubLObject var38 = module0065.f4738(var174_279);
                    SubLObject var39 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0166.f10752(var39);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic14$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
            var26 = module0173.f11000(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_279 = var26;
                if (module0268.NIL == module0065.f4775(var166_279, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_279);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var48 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic14$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_280 = var26;
                if (module0268.NIL == module0065.f4777(var174_280)) {
                    final SubLObject var38 = module0065.f4738(var174_280);
                    SubLObject var49 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic14$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
        }
        else {
            SubLObject var50;
            for (var50 = module0066.f4838(module0067.f4891(var24)); module0268.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0268.NIL, var55 = module0032.f1742(var54, var53); module0268.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (module0268.NIL != module0032.f1746(var55, var56)) {
                        f17664(module0268.$ic14$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17667(final SubLObject var88) {
        f17671(var88, module0268.$ic26$, module0268.$ic14$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17677(final SubLObject var88) {
        f17681(module0268.$ic14$, var88);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17692(final SubLObject var18) {
        f17601(module0268.$ic14$, var18, (SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17655() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607(module0268.$ic19$));
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var194_282;
        SubLObject var31;
        SubLObject var32;
        SubLObject var34_283;
        SubLObject var33;
        SubLObject var34_284;
        SubLObject var35_285;
        SubLObject var34;
        SubLObject var34_285;
        SubLObject var35_286;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var34_286;
        SubLObject var35_287;
        SubLObject var36_290;
        SubLObject var38;
        SubLObject var40;
        SubLObject var39;
        SubLObject var41;
        SubLObject var34_287;
        SubLObject var35_288;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var34_288;
        SubLObject var46_294;
        SubLObject var48;
        SubLObject var49;
        SubLObject var34_289;
        SubLObject var50;
        SubLObject var80_296;
        SubLObject var81_297;
        SubLObject var82_298;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var57;
        SubLObject var56;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var34_290;
        SubLObject var34_291;
        SubLObject var61;
        SubLObject var80_297;
        SubLObject var81_298;
        SubLObject var82_299;
        SubLObject var86_306;
        SubLObject var4_307;
        SubLObject var62;
        SubLObject var63;
        SubLObject var34_292;
        SubLObject var65;
        SubLObject var64;
        SubLObject var80_298;
        SubLObject var81_299;
        SubLObject var82_300;
        SubLObject var66;
        SubLObject var67;
        SubLObject var68;
        SubLObject var70;
        SubLObject var69;
        SubLObject var71;
        SubLObject var34_293;
        SubLObject var35_289;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var34_294;
        SubLObject var46_295;
        SubLObject var78;
        SubLObject var79;
        SubLObject var34_295;
        SubLObject var80;
        SubLObject var80_299;
        SubLObject var81_300;
        SubLObject var82_301;
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        SubLObject var4_308;
        SubLObject var84;
        SubLObject var85;
        SubLObject var34_296;
        SubLObject var87;
        SubLObject var86;
        SubLObject var80_300;
        SubLObject var81_301;
        SubLObject var82_302;
        SubLObject var88;
        SubLObject var89;
        SubLObject var90;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)module0268.NIL, var26 = module0032.f1742(var25, var24); module0268.NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (module0268.NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = module0137.$g1605$.currentBinding(var23);
                var30 = module0139.$g1636$.currentBinding(var23);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0268.$ic19$), var23);
                    module0139.$g1636$.bind(module0139.f9007(), var23);
                    var194_282 = var28;
                    var31 = (SubLObject)module0268.$ic77$;
                    var32 = module0056.f4145(var31);
                    var34_283 = module0139.$g1635$.currentBinding(var23);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var23);
                        var33 = (SubLObject)module0268.NIL;
                        var34_284 = module0141.$g1714$.currentBinding(var23);
                        var35_285 = module0141.$g1715$.currentBinding(var23);
                        try {
                            module0141.$g1714$.bind((module0268.NIL != var33) ? var33 : module0141.f9283(), var23);
                            module0141.$g1715$.bind((SubLObject)((module0268.NIL != var33) ? module0268.$ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                            if (module0268.NIL != var33 && module0268.NIL != module0136.f8864() && module0268.NIL == module0141.f9279(var33)) {
                                var34 = module0136.$g1591$.getDynamicValue(var23);
                                if (var34.eql((SubLObject)module0268.$ic80$)) {
                                    module0136.f8870((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)module0268.$ic83$)) {
                                    module0136.f8871((SubLObject)module0268.ONE_INTEGER, (SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)module0268.$ic85$)) {
                                    Errors.warn((SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0268.$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                    Errors.cerror((SubLObject)module0268.$ic84$, (SubLObject)module0268.$ic81$, var33, (SubLObject)module0268.$ic82$);
                                }
                            }
                            var34_285 = module0141.$g1670$.currentBinding(var23);
                            var35_286 = module0141.$g1671$.currentBinding(var23);
                            var35 = module0141.$g1672$.currentBinding(var23);
                            var36 = module0141.$g1674$.currentBinding(var23);
                            var37 = module0137.$g1605$.currentBinding(var23);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0268.$ic19$)), var23);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0268.$ic19$))), var23);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0268.$ic19$))), var23);
                                module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0268.$ic19$)), var23);
                                if (module0268.NIL != module0136.f8865() || module0268.NIL != module0244.f15795(var28, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                    var34_286 = module0141.$g1677$.currentBinding(var23);
                                    var35_287 = module0138.$g1619$.currentBinding(var23);
                                    var36_290 = module0141.$g1674$.currentBinding(var23);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var23);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0268.$ic19$))), var23);
                                        module0141.$g1674$.bind((SubLObject)module0268.NIL, var23);
                                        module0249.f16055(var194_282, (SubLObject)module0268.UNPROVIDED);
                                        while (module0268.NIL != var194_282) {
                                            var38 = var194_282;
                                            var39 = (var40 = module0200.f12443(module0137.f8955(module0268.$ic19$)));
                                            var41 = (SubLObject)module0268.NIL;
                                            var41 = var40.first();
                                            while (module0268.NIL != var40) {
                                                var34_287 = module0137.$g1605$.currentBinding(var23);
                                                var35_288 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var41, var23);
                                                    module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var42 = module0228.f15229(var38);
                                                    if (module0268.NIL != module0138.f8992(var42)) {
                                                        var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var43) {
                                                            var44 = module0245.f15834(var43, module0244.f15780(module0137.f8955(module0268.$ic19$)), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                            if (module0268.NIL != var44) {
                                                                for (var45 = module0066.f4838(module0067.f4891(var44)); module0268.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                    var23.resetMultipleValues();
                                                                    var46 = module0066.f4839(var45);
                                                                    var47 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (module0268.NIL != module0147.f9507(var46)) {
                                                                        var34_288 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var46, var23);
                                                                            for (var46_294 = module0066.f4838(module0067.f4891(var47)); module0268.NIL == module0066.f4841(var46_294); var46_294 = module0066.f4840(var46_294)) {
                                                                                var23.resetMultipleValues();
                                                                                var48 = module0066.f4839(var46_294);
                                                                                var49 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (module0268.NIL != module0141.f9289(var48)) {
                                                                                    var34_289 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var48, var23);
                                                                                        var50 = var49;
                                                                                        if (module0268.NIL != module0077.f5302(var50)) {
                                                                                            var80_296 = module0077.f5333(var50);
                                                                                            for (var81_297 = module0032.f1741(var80_296), var82_298 = (SubLObject)module0268.NIL, var82_298 = module0032.f1742(var81_297, var80_296); module0268.NIL == module0032.f1744(var81_297, var82_298); var82_298 = module0032.f1743(var82_298)) {
                                                                                                var51 = module0032.f1745(var81_297, var82_298);
                                                                                                if (module0268.NIL != module0032.f1746(var82_298, var51) && module0268.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (module0268.NIL != module0173.f10955(var51)) {
                                                                                                        f17663(module0268.$ic19$, var27, var51);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var50.isList()) {
                                                                                            var52 = var50;
                                                                                            var53 = (SubLObject)module0268.NIL;
                                                                                            var53 = var52.first();
                                                                                            while (module0268.NIL != var52) {
                                                                                                if (module0268.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (module0268.NIL != module0173.f10955(var53)) {
                                                                                                        f17663(module0268.$ic19$, var27, var53);
                                                                                                    }
                                                                                                }
                                                                                                var52 = var52.rest();
                                                                                                var53 = var52.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0268.$ic87$, var50);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var34_289, var23);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var46_294);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_288, var23);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var45);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                        }
                                                        if (module0268.NIL != module0200.f12419(var42, module0137.f8955((SubLObject)module0268.UNPROVIDED))) {
                                                            var54 = module0248.f15995(var42);
                                                            var55 = (SubLObject)module0268.NIL;
                                                            var55 = var54.first();
                                                            while (module0268.NIL != var54) {
                                                                var56 = (var57 = var55);
                                                                var58 = (SubLObject)module0268.NIL;
                                                                var59 = (SubLObject)module0268.NIL;
                                                                var60 = (SubLObject)module0268.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var58 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var59 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0268.$ic97$);
                                                                var60 = var57.first();
                                                                var57 = var57.rest();
                                                                if (module0268.NIL == var57) {
                                                                    if (module0268.NIL != module0147.f9507(var59)) {
                                                                        var34_290 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var59, var23);
                                                                            if (module0268.NIL != module0141.f9289(var60)) {
                                                                                var34_291 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60, var23);
                                                                                    var61 = (var50 = (SubLObject)ConsesLow.list(var58));
                                                                                    if (module0268.NIL != module0077.f5302(var50)) {
                                                                                        var80_297 = module0077.f5333(var50);
                                                                                        for (var81_298 = module0032.f1741(var80_297), var82_299 = (SubLObject)module0268.NIL, var82_299 = module0032.f1742(var81_298, var80_297); module0268.NIL == module0032.f1744(var81_298, var82_299); var82_299 = module0032.f1743(var82_299)) {
                                                                                            var51 = module0032.f1745(var81_298, var82_299);
                                                                                            if (module0268.NIL != module0032.f1746(var82_299, var51) && module0268.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (module0268.NIL != module0173.f10955(var51)) {
                                                                                                    f17663(module0268.$ic19$, var27, var51);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var86_306 = var50;
                                                                                        var53 = (SubLObject)module0268.NIL;
                                                                                        var53 = var86_306.first();
                                                                                        while (module0268.NIL != var86_306) {
                                                                                            if (module0268.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (module0268.NIL != module0173.f10955(var53)) {
                                                                                                    f17663(module0268.$ic19$, var27, var53);
                                                                                                }
                                                                                            }
                                                                                            var86_306 = var86_306.rest();
                                                                                            var53 = var86_306.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0268.$ic87$, var50);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var34_291, var23);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_290, var23);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)module0268.$ic97$);
                                                                }
                                                                var54 = var54.rest();
                                                                var55 = var54.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0268.NIL != module0155.f9785(var42, (SubLObject)module0268.UNPROVIDED)) {
                                                        var62 = (var4_307 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0268.$ic19$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0268.$ic19$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                        var63 = (SubLObject)module0268.NIL;
                                                        var63 = var4_307.first();
                                                        while (module0268.NIL != var4_307) {
                                                            var34_292 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var63, var23);
                                                                var64 = (var65 = Functions.funcall(var63, var42));
                                                                if (module0268.NIL != module0077.f5302(var65)) {
                                                                    var80_298 = module0077.f5333(var65);
                                                                    for (var81_299 = module0032.f1741(var80_298), var82_300 = (SubLObject)module0268.NIL, var82_300 = module0032.f1742(var81_299, var80_298); module0268.NIL == module0032.f1744(var81_299, var82_300); var82_300 = module0032.f1743(var82_300)) {
                                                                        var66 = module0032.f1745(var81_299, var82_300);
                                                                        if (module0268.NIL != module0032.f1746(var82_300, var66) && module0268.NIL == module0249.f16059(var66, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var66, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (module0268.NIL != module0173.f10955(var66)) {
                                                                                f17663(module0268.$ic19$, var27, var66);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var65.isList()) {
                                                                    var67 = var65;
                                                                    var68 = (SubLObject)module0268.NIL;
                                                                    var68 = var67.first();
                                                                    while (module0268.NIL != var67) {
                                                                        if (module0268.NIL == module0249.f16059(var68, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var68, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (module0268.NIL != module0173.f10955(var68)) {
                                                                                f17663(module0268.$ic19$, var27, var68);
                                                                            }
                                                                        }
                                                                        var67 = var67.rest();
                                                                        var68 = var67.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0268.$ic87$, var65);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var34_292, var23);
                                                            }
                                                            var4_307 = var4_307.rest();
                                                            var63 = var4_307.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var35_288, var23);
                                                    module0137.$g1605$.rebind(var34_287, var23);
                                                }
                                                var40 = var40.rest();
                                                var41 = var40.first();
                                            }
                                            var69 = (var70 = module0200.f12443(module0244.f15771(module0137.f8955(module0268.$ic19$))));
                                            var71 = (SubLObject)module0268.NIL;
                                            var71 = var70.first();
                                            while (module0268.NIL != var70) {
                                                var34_293 = module0137.$g1605$.currentBinding(var23);
                                                var35_289 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var71, var23);
                                                    module0141.$g1674$.bind((SubLObject)((module0268.NIL != module0141.f9205((SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0268.NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var72 = module0228.f15229(var194_282);
                                                    if (module0268.NIL != module0138.f8992(var72)) {
                                                        var73 = module0242.f15664(var72, module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                        if (module0268.NIL != var73) {
                                                            var74 = module0245.f15834(var73, module0138.f8979(), module0137.f8955((SubLObject)module0268.UNPROVIDED));
                                                            if (module0268.NIL != var74) {
                                                                for (var75 = module0066.f4838(module0067.f4891(var74)); module0268.NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                                                                    var23.resetMultipleValues();
                                                                    var76 = module0066.f4839(var75);
                                                                    var77 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (module0268.NIL != module0147.f9507(var76)) {
                                                                        var34_294 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var76, var23);
                                                                            for (var46_295 = module0066.f4838(module0067.f4891(var77)); module0268.NIL == module0066.f4841(var46_295); var46_295 = module0066.f4840(var46_295)) {
                                                                                var23.resetMultipleValues();
                                                                                var78 = module0066.f4839(var46_295);
                                                                                var79 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (module0268.NIL != module0141.f9289(var78)) {
                                                                                    var34_295 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var78, var23);
                                                                                        var80 = var79;
                                                                                        if (module0268.NIL != module0077.f5302(var80)) {
                                                                                            var80_299 = module0077.f5333(var80);
                                                                                            for (var81_300 = module0032.f1741(var80_299), var82_301 = (SubLObject)module0268.NIL, var82_301 = module0032.f1742(var81_300, var80_299); module0268.NIL == module0032.f1744(var81_300, var82_301); var82_301 = module0032.f1743(var82_301)) {
                                                                                                var81 = module0032.f1745(var81_300, var82_301);
                                                                                                if (module0268.NIL != module0032.f1746(var82_301, var81) && module0268.NIL == module0249.f16059(var81, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var81, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149(var81, var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var80.isList()) {
                                                                                            var82 = var80;
                                                                                            var83 = (SubLObject)module0268.NIL;
                                                                                            var83 = var82.first();
                                                                                            while (module0268.NIL != var82) {
                                                                                                if (module0268.NIL == module0249.f16059(var83, (SubLObject)module0268.UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)module0268.UNPROVIDED);
                                                                                                    module0056.f4149(var83, var32);
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0268.$ic87$, var80);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var34_295, var23);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var46_295);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var34_294, var23);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var75);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0268.FIVE_INTEGER, (SubLObject)module0268.$ic88$, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0268.NIL != module0155.f9785(var72, (SubLObject)module0268.UNPROVIDED)) {
                                                        var84 = (var4_308 = ((module0268.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)module0268.UNPROVIDED))));
                                                        var85 = (SubLObject)module0268.NIL;
                                                        var85 = var4_308.first();
                                                        while (module0268.NIL != var4_308) {
                                                            var34_296 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var85, var23);
                                                                var86 = (var87 = Functions.funcall(var85, var72));
                                                                if (module0268.NIL != module0077.f5302(var87)) {
                                                                    var80_300 = module0077.f5333(var87);
                                                                    for (var81_301 = module0032.f1741(var80_300), var82_302 = (SubLObject)module0268.NIL, var82_302 = module0032.f1742(var81_301, var80_300); module0268.NIL == module0032.f1744(var81_301, var82_302); var82_302 = module0032.f1743(var82_302)) {
                                                                        var88 = module0032.f1745(var81_301, var82_302);
                                                                        if (module0268.NIL != module0032.f1746(var82_302, var88) && module0268.NIL == module0249.f16059(var88, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var88, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149(var88, var32);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var87.isList()) {
                                                                    var89 = var87;
                                                                    var90 = (SubLObject)module0268.NIL;
                                                                    var90 = var89.first();
                                                                    while (module0268.NIL != var89) {
                                                                        if (module0268.NIL == module0249.f16059(var90, (SubLObject)module0268.UNPROVIDED)) {
                                                                            module0249.f16055(var90, (SubLObject)module0268.UNPROVIDED);
                                                                            module0056.f4149(var90, var32);
                                                                        }
                                                                        var89 = var89.rest();
                                                                        var90 = var89.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0268.$ic87$, var87);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var34_296, var23);
                                                            }
                                                            var4_308 = var4_308.rest();
                                                            var85 = var4_308.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var35_289, var23);
                                                    module0137.$g1605$.rebind(var34_293, var23);
                                                }
                                                var70 = var70.rest();
                                                var71 = var70.first();
                                            }
                                            var194_282 = module0056.f4150(var32);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var36_290, var23);
                                        module0138.$g1619$.rebind(var35_287, var23);
                                        module0141.$g1677$.rebind(var34_286, var23);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0268.TWO_INTEGER, (SubLObject)module0268.$ic89$, var28, module0244.f15748(module0137.f8955((SubLObject)module0268.UNPROVIDED)), (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED, (SubLObject)module0268.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var37, var23);
                                module0141.$g1674$.rebind(var36, var23);
                                module0141.$g1672$.rebind(var35, var23);
                                module0141.$g1671$.rebind(var35_286, var23);
                                module0141.$g1670$.rebind(var34_285, var23);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var35_285, var23);
                            module0141.$g1714$.rebind(var34_284, var23);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var23));
                    }
                    finally {
                        module0139.$g1635$.rebind(var34_283, var23);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var23));
                }
                finally {
                    module0139.$g1636$.rebind(var30, var23);
                    module0137.$g1605$.rebind(var29, var23);
                }
            }
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17660() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635(module0268.$ic19$);
        if (module0268.NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_325 = var26;
                if (module0268.NIL == module0065.f4775(var166_325, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_325);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var31 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0166.f10752(var31);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic19$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_326 = var26;
                if (module0268.NIL == module0065.f4777(var174_326)) {
                    final SubLObject var38 = module0065.f4738(var174_326);
                    SubLObject var39 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0166.f10752(var39);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic19$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
            var26 = module0173.f11000(var25);
            if (module0268.NIL == module0065.f4772(var26, (SubLObject)module0268.$ic90$)) {
                final SubLObject var166_326 = var26;
                if (module0268.NIL == module0065.f4775(var166_326, (SubLObject)module0268.$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_326);
                    final SubLObject var28 = (SubLObject)module0268.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0268.NIL, var30 = (SubLObject)module0268.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0268.ONE_INTEGER)) {
                        var48 = ((module0268.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0268.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (module0268.NIL == module0065.f4749(var32) || module0268.NIL == module0065.f4773((SubLObject)module0268.$ic90$)) {
                            if (module0268.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0268.$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (module0268.NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0268.NIL, var36 = module0032.f1742(var35, var34); module0268.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (module0268.NIL != module0032.f1746(var36, var37)) {
                                        f17664(module0268.$ic19$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_327 = var26;
                if (module0268.NIL == module0065.f4777(var174_327)) {
                    final SubLObject var38 = module0065.f4738(var174_327);
                    SubLObject var49 = (SubLObject)module0268.NIL;
                    SubLObject var40 = (SubLObject)module0268.NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (module0268.NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0268.NIL, var46 = module0032.f1742(var45, var44); module0268.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (module0268.NIL != module0032.f1746(var46, var47)) {
                                        f17664(module0268.$ic19$, var47, var43);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var41);
                    }
                }
            }
        }
        else {
            SubLObject var50;
            for (var50 = module0066.f4838(module0067.f4891(var24)); module0268.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0268.NIL, var55 = module0032.f1742(var54, var53); module0268.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (module0268.NIL != module0032.f1746(var55, var56)) {
                        f17664(module0268.$ic19$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17668(final SubLObject var88) {
        f17671(var88, module0268.$ic26$, module0268.$ic19$);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17678(final SubLObject var88) {
        f17681(module0268.$ic19$, var88);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17693(final SubLObject var18) {
        f17601(module0268.$ic19$, var18, (SubLObject)module0268.T);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17694() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17598", "S#20165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17599", "S#11074", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17600", "S#20166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17602", "S#20167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17603", "S#19515", 1, 0, false);
        new $f17603$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17605", "S#20168", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0268", "f17606", "S#20169");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17604", "S#20170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17608", "S#20171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17607", "S#20172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17609", "S#20173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17610", "S#20174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17611", "S#19511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17612", "S#20175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17613", "S#20176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17614", "S#20177", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17615", "S#18979", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17616", "S#18982", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17617", "SBHL-CACHED-PREDICATE-RELATION-P", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17620", "SBHL-CACHED-RELATIONS-FOR-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17622", "S#20178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17619", "S#20179", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17621", "S#20180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17623", "S#20181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17629", "S#20182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17630", "S#20183", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17625", "S#20184", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0268", "f17631", "S#20185");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17627", "S#20186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17632", "S#20187", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17633", "S#20188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17634", "S#20189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17635", "S#20190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17636", "S#20191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17628", "S#20192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17637", "S#20193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17618", "S#20194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17642", "S#20195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17624", "S#20196", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17626", "S#20197", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0268", "f17643", "S#20198");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0268", "f17644", "S#20199");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0268", "f17645", "S#20200");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17646", "S#20201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17639", "S#20202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17649", "S#20203", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17638", "S#20204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17648", "S#20205", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17647", "S#20206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17650", "S#20207", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17651", "INITIALIZE-ALL-SBHL-CACHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17640", "S#20208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17641", "S#20209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17661", "S#20210", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17662", "S#20211", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17664", "S#20212", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17663", "S#20213", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17665", "S#19271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17671", "S#20214", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17673", "S#20215", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17674", "S#20216", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17675", "S#20217", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17676", "S#19278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17681", "S#20218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17666", "S#20219", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17682", "S#20220", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17672", "S#20221", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17683", "S#20222", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17684", "S#20223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17685", "S#20224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17601", "S#20225", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17652", "S#20226", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17656", "S#20227", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17657", "S#20228", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17670", "S#20229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17680", "S#20230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17686", "S#20231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17687", "S#20232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17653", "S#20233", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17658", "S#20234", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17669", "S#20235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17679", "S#20236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17689", "S#20237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17690", "S#20238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17688", "S#20239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17691", "S#20240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17654", "S#20241", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17659", "S#20242", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17667", "S#20243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17677", "S#20244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17692", "S#20245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17655", "S#20246", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17660", "S#20247", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17668", "S#20248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17678", "S#20249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0268", "f17693", "S#20250", 1, 0, false);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17695() {
        module0268.$g2531$ = SubLFiles.deflexical("S#20251", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic0$)) ? module0268.$g2531$.getGlobalValue() : module0268.NIL));
        module0268.$g2532$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES*", (SubLObject)module0268.$ic1$);
        module0268.$g2533$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES-SET*", module0078.f5367(module0268.$g2532$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        module0268.$g2534$ = SubLFiles.deflexical("S#20252", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic2$)) ? module0268.$g2534$.getGlobalValue() : module0268.NIL));
        module0268.$g2535$ = SubLFiles.deflexical("S#20253", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic3$)) ? module0268.$g2535$.getGlobalValue() : module0268.NIL));
        module0268.$g2536$ = SubLFiles.deflexical("S#20254", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic4$)) ? module0268.$g2536$.getGlobalValue() : module0268.NIL));
        module0268.$g2537$ = SubLFiles.deflexical("S#20255", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic5$)) ? module0268.$g2537$.getGlobalValue() : module0268.NIL));
        module0268.$g2538$ = SubLFiles.deflexical("*CACHED-GENLS*", (SubLObject)module0268.$ic6$);
        module0268.$g2539$ = SubLFiles.deflexical("*CACHED-GENLS-SET*", module0078.f5367(module0268.$g2538$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        module0268.$g2540$ = SubLFiles.deflexical("S#20256", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic7$)) ? module0268.$g2540$.getGlobalValue() : module0268.NIL));
        module0268.$g2541$ = SubLFiles.deflexical("S#20257", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic8$)) ? module0268.$g2541$.getGlobalValue() : module0268.NIL));
        module0268.$g2542$ = SubLFiles.defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)module0268.$ic9$);
        module0268.$g2543$ = SubLFiles.deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)module0268.$ic10$);
        module0268.$g2544$ = SubLFiles.defconstant("S#20258", (SubLObject)module0268.$ic11$);
        module0268.$g2545$ = SubLFiles.deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", (SubLObject)module0268.$ic12$);
        module0268.$g2546$ = SubLFiles.deflexical("*CACHED-ISAS*", ConsesLow.append(module0268.$g2542$.getGlobalValue(), module0268.$g2543$.getGlobalValue(), module0268.$g2544$.getGlobalValue(), module0268.$g2545$.getGlobalValue()));
        module0268.$g2547$ = SubLFiles.deflexical("*CACHED-ISAS-SET*", module0078.f5367(Sequences.reverse(module0268.$g2546$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        module0268.$g2548$ = SubLFiles.deflexical("S#20259", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic15$)) ? module0268.$g2548$.getGlobalValue() : module0268.NIL));
        module0268.$g2549$ = SubLFiles.deflexical("S#20260", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic16$)) ? module0268.$g2549$.getGlobalValue() : module0268.NIL));
        module0268.$g2550$ = SubLFiles.deflexical("S#20261", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic17$)) ? module0268.$g2550$.getGlobalValue() : module0268.NIL));
        module0268.$g2551$ = SubLFiles.deflexical("S#20262", (SubLObject)module0268.$ic18$);
        module0268.$g2552$ = SubLFiles.deflexical("S#20263", module0078.f5367(Sequences.reverse(module0268.$g2551$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0268.EQL), (SubLObject)module0268.UNPROVIDED));
        module0268.$g2553$ = SubLFiles.deflexical("S#20264", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic20$)) ? module0268.$g2553$.getGlobalValue() : module0268.NIL));
        module0268.$g2554$ = SubLFiles.deflexical("S#20265", (SubLObject)((module0268.NIL != Symbols.boundp((SubLObject)module0268.$ic21$)) ? module0268.$g2554$.getGlobalValue() : module0268.NIL));
        module0268.$g2555$ = SubLFiles.deflexical("S#20266", (SubLObject)module0268.$ic22$);
        module0268.$g2556$ = SubLFiles.defparameter("S#20267", (SubLObject)module0268.NIL);
        return (SubLObject)module0268.NIL;
    }
    
    public static SubLObject f17696() {
        module0003.f57((SubLObject)module0268.$ic0$);
        module0003.f57((SubLObject)module0268.$ic2$);
        module0003.f57((SubLObject)module0268.$ic3$);
        module0003.f57((SubLObject)module0268.$ic4$);
        module0003.f57((SubLObject)module0268.$ic5$);
        module0003.f57((SubLObject)module0268.$ic7$);
        module0003.f57((SubLObject)module0268.$ic8$);
        module0003.f57((SubLObject)module0268.$ic15$);
        module0003.f57((SubLObject)module0268.$ic16$);
        module0003.f57((SubLObject)module0268.$ic17$);
        module0003.f57((SubLObject)module0268.$ic20$);
        module0003.f57((SubLObject)module0268.$ic21$);
        return (SubLObject)module0268.NIL;
    }
    
    public void declareFunctions() {
        f17694();
    }
    
    public void initializeVariables() {
        f17695();
    }
    
    public void runTopLevelForms() {
        f17696();
    }
    
    static {
        me = (SubLFile)new module0268();
        module0268.$g2531$ = null;
        module0268.$g2532$ = null;
        module0268.$g2533$ = null;
        module0268.$g2534$ = null;
        module0268.$g2535$ = null;
        module0268.$g2536$ = null;
        module0268.$g2537$ = null;
        module0268.$g2538$ = null;
        module0268.$g2539$ = null;
        module0268.$g2540$ = null;
        module0268.$g2541$ = null;
        module0268.$g2542$ = null;
        module0268.$g2543$ = null;
        module0268.$g2544$ = null;
        module0268.$g2545$ = null;
        module0268.$g2546$ = null;
        module0268.$g2547$ = null;
        module0268.$g2548$ = null;
        module0268.$g2549$ = null;
        module0268.$g2550$ = null;
        module0268.$g2551$ = null;
        module0268.$g2552$ = null;
        module0268.$g2553$ = null;
        module0268.$g2554$ = null;
        module0268.$g2555$ = null;
        module0268.$g2556$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#20251", "CYC");
        $ic1$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termPhrases")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $ic2$ = SubLObjectFactory.makeSymbol("S#20252", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#20253", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#20254", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#20255", "CYC");
        $ic6$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLAssertion")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpression")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLFormula")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLIndexedTerm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence-Askable")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLList")) });
        $ic7$ = SubLObjectFactory.makeSymbol("S#20256", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#20257", "CYC");
        $ic9$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic10$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("AntiSymmetricBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AntiTransitiveBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArgTypeBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArgTypeTernaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarCoveringType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CommutativeRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DistributingMetaKnowledgePredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ELRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatableRelation-Contextualized")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier-Bounded")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalConnective")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MicrotheoryDesignatingRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativeRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quantifier")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReifiableFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScopingRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TruthFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnknownScalarInterval")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("VariableArityRelation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondOrderCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThirdOrderCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("FourthOrderCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")) });
        $ic11$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("CSQLComparisonPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CSQLConstantFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CSQLFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CSQLLogicalConnective")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CSQLQuantifier")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CytologicalProcessProjectKBContentTestQuery")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLDefinitenessAttribute")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLQuantAttribute")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSIContentMicrotheory")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSIExternalTermDenotingFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedComparisonPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpeechPart")) });
        $ic12$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation")));
        $ic13$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#20259", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#20260", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#20261", "CYC");
        $ic18$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalFieldIndexical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NonSkolemIndeterminateTerm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhysicalFieldIndexical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermExemptFromUniqueNamesAssumption")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermAcceptableForQuerySearch-TriggerOnly")));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic20$ = SubLObjectFactory.makeSymbol("S#20264", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#20265", "CYC");
        $ic22$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11392", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#708", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#20172", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic29$ = SubLObjectFactory.makeString("*sbhl-cache-misses-hash-table* is not a hash table");
        $ic30$ = SubLObjectFactory.makeString("~A: ~S~%");
        $ic31$ = SubLObjectFactory.makeSymbol(">");
        $ic32$ = SubLObjectFactory.makeSymbol("S#16712", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20270", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#764E76D");
        $ic35$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic36$ = SubLObjectFactory.makeSymbol("S#20181", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic38$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("CLET");
        $ic40$ = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $ic41$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic42$ = SubLObjectFactory.makeString("Initializing SBHL cache for ");
        $ic43$ = SubLObjectFactory.makeString(".");
        $ic44$ = SubLObjectFactory.makeString("Adding ");
        $ic45$ = SubLObjectFactory.makeString(" to SBHL cache for ");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic47$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF0F");
        $ic48$ = SubLObjectFactory.makeUninternedSymbol("US#13E5957");
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#7063A5B");
        $ic50$ = SubLObjectFactory.makeSymbol("S#20190", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("PIF");
        $ic52$ = SubLObjectFactory.makeSymbol("S#13757", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#13790", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20270", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic55$ = SubLObjectFactory.makeUninternedSymbol("US#7063A5B");
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#1C6BDEC");
        $ic57$ = SubLObjectFactory.makeSymbol("MEMBER?");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20270", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic59$ = SubLObjectFactory.makeUninternedSymbol("US#7063A5B");
        $ic60$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF0F");
        $ic61$ = SubLObjectFactory.makeSymbol("S#20188", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#20171", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#3287", "CYC");
        $ic64$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $ic65$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalConnective"));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quantifier"));
        $ic70$ = SubLObjectFactory.makeString("Computing all-mts SBHL caches.");
        $ic71$ = SubLObjectFactory.makeString("Computing SBHL caches from all-mts caches.");
        $ic72$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic74$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic76$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic77$ = SubLObjectFactory.makeKeyword("STACK");
        $ic78$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic79$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic80$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic81$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic82$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic83$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic84$ = SubLObjectFactory.makeString("continue anyway");
        $ic85$ = SubLObjectFactory.makeKeyword("WARN");
        $ic86$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic87$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic88$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic89$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic90$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic91$ = SubLObjectFactory.makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");
        $ic92$ = SubLObjectFactory.makeSymbol("S#20232", "CYC");
        $ic93$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic94$ = SubLObjectFactory.makeSymbol("S#20245", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#20250", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#20240", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
    }
    
    public static final class $f17603$UnaryFunction extends UnaryFunction
    {
        public $f17603$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19515"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0268.f17603(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0268.class
	Total time: 2841 ms
	
	Decompiled with Procyon 0.5.32.
*/