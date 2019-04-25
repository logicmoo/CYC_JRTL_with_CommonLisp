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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        $g2531$.setGlobalValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17599() {
        return $g2531$.getGlobalValue();
    }
    
    public static SubLObject f17600(final SubLObject var1) {
        if (NIL == conses_high.member(var1, $g2543$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2543$.setGlobalValue((SubLObject)ConsesLow.cons(var1, $g2543$.getGlobalValue()));
        }
        $g2546$.setGlobalValue(ConsesLow.append($g2542$.getGlobalValue(), $g2543$.getGlobalValue(), $g2544$.getGlobalValue(), $g2545$.getGlobalValue()));
        $g2547$.setGlobalValue(module0078.f5367(Sequences.reverse($g2546$.getGlobalValue()), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        SubLObject var3;
        final SubLObject var2 = var3 = module0035.remove_if_not((SubLObject)$ic13$, module0259.f16847(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            f17601($ic14$, var4, (SubLObject)T);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var1;
    }
    
    public static SubLObject f17602() {
        return $g2546$.getGlobalValue();
    }
    
    public static SubLObject f17603(final SubLObject var6) {
        return f17604(var6, $ic14$);
    }
    
    public static SubLObject f17605(final SubLObject var1) {
        if (NIL == conses_high.member(var1, $g2551$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2551$.setGlobalValue((SubLObject)ConsesLow.cons(var1, $g2551$.getGlobalValue()));
        }
        $g2552$.setGlobalValue(module0078.f5367(Sequences.reverse($g2551$.getGlobalValue()), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        SubLObject var3;
        final SubLObject var2 = var3 = module0035.remove_if_not((SubLObject)$ic13$, module0259.f16995(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            f17601($ic19$, var4, (SubLObject)T);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var1;
    }
    
    public static SubLObject f17606(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic23$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic23$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic23$);
        var16 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var17;
            var13 = (var17 = var14);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic25$, var16)), ConsesLow.append(var17, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17604(final SubLObject var18, final SubLObject var16) {
        return module0077.f5320(var18, f17607(var16));
    }
    
    public static SubLObject f17608(final SubLObject var19, final SubLObject var18) {
        return (SubLObject)((NIL != module0173.f10955(var18)) ? module0173.f10990(var19, var18) : NIL);
    }
    
    public static SubLObject f17607(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            return $g2547$.getGlobalValue();
        }
        if (var16.eql($ic19$)) {
            return $g2552$.getGlobalValue();
        }
        if (var16.eql($ic26$)) {
            return $g2539$.getGlobalValue();
        }
        if (var16.eql($ic27$)) {
            return $g2533$.getGlobalValue();
        }
        if (var16.eql($ic28$)) {
            return $g2533$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17609(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            return $g2546$.getGlobalValue();
        }
        if (var16.eql($ic19$)) {
            return $g2551$.getGlobalValue();
        }
        if (var16.eql($ic26$)) {
            return $g2538$.getGlobalValue();
        }
        if (var16.eql($ic27$)) {
            return $g2532$.getGlobalValue();
        }
        if (var16.eql($ic28$)) {
            return $g2532$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17610(final SubLObject var16) {
        return f17604(var16, $ic27$);
    }
    
    public static SubLObject f17611(final SubLObject var21) {
        return f17604(var21, $ic14$);
    }
    
    public static SubLObject f17612(final SubLObject var21) {
        return f17604(var21, $ic26$);
    }
    
    public static SubLObject f17613(final SubLObject var16) {
        return module0004.f104(var16, $g2555$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17614(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)TEN_INTEGER;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (!$g2556$.getDynamicValue(var23).isHashtable()) {
            Errors.error((SubLObject)$ic29$);
        }
        else {
            SubLObject var24 = module0035.f2124(var22, Sort.sort(Sequences.remove_duplicates(module0030.f1627($g2556$.getDynamicValue(var23)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic31$, (SubLObject)UNPROVIDED));
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                SubLObject var4_25 = module0030.f1628($g2556$.getDynamicValue(var23), var25, (SubLObject)UNPROVIDED);
                SubLObject var26 = (SubLObject)NIL;
                var26 = var4_25.first();
                while (NIL != var4_25) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic30$, var25, var26);
                    var4_25 = var4_25.rest();
                    var26 = var4_25.first();
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17615(final SubLObject var16, final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = (SubLObject)makeBoolean(NIL != module0136.f8877() && NIL != f17613(var16) && NIL != module0173.f10955(var27) && NIL != f17604(var28, var16));
        if ($g2556$.getDynamicValue(var29).isHashtable() && NIL != module0173.f10955(var27) && NIL != module0136.f8877() && NIL == var30) {
            module0030.f1615((SubLObject)ConsesLow.list(var16, var28), $g2556$.getDynamicValue(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var30;
    }
    
    public static SubLObject f17616(final SubLObject var16, final SubLObject var30, final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != module0136.f8877() && NIL != f17613(var16) && NIL != module0035.f2370((SubLObject)$ic13$, var30, (SubLObject)UNPROVIDED) && NIL != f17604(var18, var16));
    }
    
    public static SubLObject f17617(final SubLObject var16, final SubLObject var31, final SubLObject var18, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        module0413.f28798();
        f17618(var16, var18);
        SubLObject var34 = (SubLObject)NIL;
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
        if (NIL != var34) {
            module0413.f28800();
        }
        return var34;
    }
    
    public static SubLObject f17620(final SubLObject var16, final SubLObject var18, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)NIL;
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
        return module0067.f4902(module0067.f4884(f17623(var16), var37, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f17619(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        return (NIL != module0147.f9513()) ? f17624(var16, var31, var18) : f17625(var16, var31, var18);
    }
    
    public static SubLObject f17621(final SubLObject var16, final SubLObject var18) {
        return (NIL != module0147.f9513()) ? f17626(var16, var18) : f17627(var16, var18);
    }
    
    public static SubLObject f17623(final SubLObject var16) {
        f17628(var16);
        return f17629(var16);
    }
    
    public static SubLObject f17629(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            return $g2548$.getGlobalValue();
        }
        if (var16.eql($ic19$)) {
            return $g2553$.getGlobalValue();
        }
        if (var16.eql($ic27$)) {
            return $g2534$.getGlobalValue();
        }
        if (var16.eql($ic28$)) {
            return $g2535$.getGlobalValue();
        }
        if (var16.eql($ic26$)) {
            return $g2540$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17630(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        assert NIL != module0244.f15730(var16) : var16;
        final SubLObject var32 = f17623(var16);
        if (NIL != var32) {
            final SubLObject var33 = module0067.f4885(var32, var18, (SubLObject)UNPROVIDED);
            return (SubLObject)((NIL != var33) ? module0067.f4885(var33, var31, (SubLObject)UNPROVIDED) : NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17625(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        return module0147.f9560(f17630(var16, var31, var18));
    }
    
    public static SubLObject f17631(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic33$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic33$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic33$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic33$);
        var17 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic33$);
        var18 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var19;
            var13 = (var19 = var14);
            final SubLObject var20 = (SubLObject)$ic34$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list(var15, var20, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var18)), (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var20), (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var20, var17))), (SubLObject)ConsesLow.listS((SubLObject)$ic37$, var16, ConsesLow.append(var19, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17627(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21;
        for (var21 = module0066.f4838(module0067.f4891(f17623(var16))); NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
            var19.resetMultipleValues();
            final SubLObject var22 = module0066.f4839(var21);
            final SubLObject var23 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != module0067.f4852(var23)) {
                final SubLObject var24 = module0067.f4884(var23, var18, (SubLObject)UNPROVIDED);
                if (NIL != var24 && NIL != module0147.f9560(var24)) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
        }
        module0066.f4842(var21);
        return var20;
    }
    
    public static SubLObject f17632(final SubLObject var16, final SubLObject var31, final SubLObject var18, final SubLObject var32) {
        return module0004.f104(var32, module0067.f4884(module0067.f4884(f17623(var16), var18, (SubLObject)UNPROVIDED), var31, (SubLObject)UNPROVIDED), (SubLObject)$ic41$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17633(final SubLObject var16) {
        return Equality.eql(var16, $ic14$);
    }
    
    public static SubLObject f17634(final SubLObject var16) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17635(final SubLObject var16) {
        f17628(var16);
        return f17636(var16);
    }
    
    public static SubLObject f17636(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            return $g2550$.getGlobalValue();
        }
        if (var16.eql($ic19$)) {
            return $g2554$.getGlobalValue();
        }
        if (var16.eql($ic27$)) {
            return $g2536$.getGlobalValue();
        }
        if (var16.eql($ic28$)) {
            return $g2537$.getGlobalValue();
        }
        if (var16.eql($ic26$)) {
            return $g2541$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17628(final SubLObject var16) {
        if (NIL == f17636(var16) || NIL == f17629(var16)) {
            f17637(var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17637(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0012.$g71$.currentBinding(var17);
        final SubLObject var19 = module0012.$g72$.currentBinding(var17);
        try {
            module0012.$g71$.bind((SubLObject)TWO_INTEGER, var17);
            module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)$ic42$, new SubLObject[] { module0006.f203(var16), $ic43$ }), var17);
            final SubLObject var20 = Sequences.cconcatenate((SubLObject)$ic42$, new SubLObject[] { module0006.f203(var16), $ic43$ });
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
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var17);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var17);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var17);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var17);
                module0012.$g70$.bind((SubLObject)T, var17);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var20) ? module0012.$silent_progressP$.getDynamicValue(var17) : T), var17);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17618(final SubLObject var16, final SubLObject var18) {
        f17628(var16);
        if (NIL == module0084.f5808(f17629(var16), var18) && NIL != f17604(var18, var16) && NIL != module0220.f14556(var18, var16, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            f17642(var16, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17642(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (var16.eql($ic14$)) {
            final SubLObject var20 = module0012.$g71$.currentBinding(var19);
            final SubLObject var21 = module0012.$g72$.currentBinding(var19);
            try {
                module0012.$g71$.bind((SubLObject)TWO_INTEGER, var19);
                module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)$ic44$, new SubLObject[] { module0006.f203(var18), $ic45$, module0006.f203(var16), $ic43$ }), var19);
                final SubLObject var22 = Sequences.cconcatenate((SubLObject)$ic44$, new SubLObject[] { module0006.f203(var18), $ic45$, module0006.f203(var16), $ic43$ });
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
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var22) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
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
        else if (var16.eql($ic19$)) {
            final SubLObject var20 = module0012.$g71$.currentBinding(var19);
            final SubLObject var21 = module0012.$g72$.currentBinding(var19);
            try {
                module0012.$g71$.bind((SubLObject)TWO_INTEGER, var19);
                module0012.$g72$.bind(Sequences.cconcatenate((SubLObject)$ic44$, new SubLObject[] { module0006.f203(var18), $ic45$, module0006.f203(var16), $ic43$ }), var19);
                final SubLObject var22 = Sequences.cconcatenate((SubLObject)$ic44$, new SubLObject[] { module0006.f203(var18), $ic45$, module0006.f203(var16), $ic43$ });
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
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var22) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17624(final SubLObject var16, final SubLObject var31, final SubLObject var18) {
        final SubLObject var32 = f17633(var16);
        final SubLObject var33 = f17635(var16);
        final SubLObject var34 = (NIL != var32) ? f17608(var33, var31) : module0067.f4885(var33, var18, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != module0077.f5302(var34)) ? ((NIL != var32) ? module0077.f5320(var18, var34) : module0077.f5320(var31, var34)) : NIL);
    }
    
    public static SubLObject f17626(final SubLObject var16, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != f17633(var16)) {
            final SubLObject var20 = f17608(f17635(var16), var18);
            return (SubLObject)((NIL != module0077.f5302(var20)) ? module0077.f5312(var20) : NIL);
        }
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22;
        for (var22 = module0066.f4838(module0067.f4891(f17635(var16))); NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
            var19.resetMultipleValues();
            final SubLObject var23 = module0066.f4839(var22);
            final SubLObject var24 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != module0077.f5320(var18, var24)) {
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
        }
        module0066.f4842(var22);
        return var21;
    }
    
    public static SubLObject f17643(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic46$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic46$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic46$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic46$);
        var17 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var18;
            var13 = (var18 = var14);
            final SubLObject var19 = (SubLObject)$ic47$;
            final SubLObject var20 = (SubLObject)$ic48$;
            final SubLObject var21 = (SubLObject)$ic49$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var17))), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var21), (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list(var16, var20, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var15, var20), ConsesLow.append(var18, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list(var15, var19, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var16, var19), ConsesLow.append(var18, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17644(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic54$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic54$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic54$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic54$);
        var17 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic54$);
        var18 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var19;
            var13 = (var19 = var14);
            final SubLObject var20 = (SubLObject)$ic55$;
            final SubLObject var21 = (SubLObject)$ic56$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list(var15, var21, var20), (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic57$, var18, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var21, var17)), ConsesLow.append(var19, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17645(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic58$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic58$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic58$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic58$);
        var17 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var18;
            var13 = (var18 = var14);
            final SubLObject var19 = (SubLObject)$ic59$;
            final SubLObject var20 = (SubLObject)$ic60$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic62$, var19, var17)), ConsesLow.append(var18, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list(var15, var20, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic63$, var17, var20), ConsesLow.append(var18, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17646() {
        f17639($ic27$);
        f17639($ic28$);
        f17639($ic26$);
        f17639($ic14$);
        f17639($ic19$);
        SubLObject var4 = (SubLObject)$ic64$;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != var5) {
                final SubLObject var6 = module0077.f5333(f17607(var5));
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                    var9 = module0032.f1745(var7, var8);
                    if (NIL != module0032.f1746(var8, var9)) {
                        var10 = f17647();
                        module0067.f4886(f17629(var5), var9, var10);
                    }
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17639(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            $g2548$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic19$)) {
            $g2553$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic27$)) {
            $g2534$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic28$)) {
            $g2535$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic26$)) {
            $g2540$.setGlobalValue(f17648());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17649() {
        f17638($ic27$);
        f17638($ic28$);
        f17638($ic26$);
        f17638($ic14$);
        f17638($ic19$);
        f17650();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17638(final SubLObject var16) {
        if (var16.eql($ic14$)) {
            $g2550$.setGlobalValue(module0173.f10985());
        }
        else if (var16.eql($ic19$)) {
            $g2554$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic27$)) {
            $g2536$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic28$)) {
            $g2537$.setGlobalValue(f17648());
        }
        else if (var16.eql($ic26$)) {
            $g2541$.setGlobalValue(f17648());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17648() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17647() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17650() {
        $g2549$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        module0067.f4886($g2549$.getGlobalValue(), $ic65$, (SubLObject)ConsesLow.list($ic66$, $ic67$, $ic68$, $ic69$));
        return $g2549$.getGlobalValue();
    }
    
    public static SubLObject f17651() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0110.$g1374$.currentBinding(var23);
        try {
            module0110.$g1374$.bind((SubLObject)T, var23);
            f17649();
            f17646();
            SubLObject var25 = (SubLObject)$ic64$;
            module0012.$g82$.setDynamicValue((SubLObject)$ic70$, var23);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var23);
            module0012.$g83$.setDynamicValue(Sequences.length(var25), var23);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var23);
            final SubLObject var34_85 = module0012.$g75$.currentBinding(var23);
            SubLObject var26 = module0012.$g76$.currentBinding(var23);
            SubLObject var27 = module0012.$g77$.currentBinding(var23);
            SubLObject var28 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)NIL, var23);
                module0012.$g77$.bind((SubLObject)T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(module0012.$g82$.getDynamicValue(var23));
                SubLObject var29 = var25;
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL != var29) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var23), module0012.$g83$.getDynamicValue(var23));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var23), (SubLObject)ONE_INTEGER), var23);
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
            var25 = (SubLObject)$ic64$;
            module0012.$g82$.setDynamicValue((SubLObject)$ic71$, var23);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var23);
            module0012.$g83$.setDynamicValue(Sequences.length(var25), var23);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var23);
            final SubLObject var34_86 = module0012.$g75$.currentBinding(var23);
            var26 = module0012.$g76$.currentBinding(var23);
            var27 = module0012.$g77$.currentBinding(var23);
            var28 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)NIL, var23);
                module0012.$g77$.bind((SubLObject)T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(module0012.$g82$.getDynamicValue(var23));
                SubLObject var29 = var25;
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL != var29) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var23), module0012.$g83$.getDynamicValue(var23));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var23), (SubLObject)ONE_INTEGER), var23);
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
        $g2531$.setGlobalValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17640(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0136.$g1597$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0136.$g1597$.bind((SubLObject)T, var17);
            module0147.$g2094$.bind((SubLObject)$ic72$, var17);
            module0147.$g2095$.bind($ic73$, var17);
            if (var16.eql($ic27$) || var16.eql($ic28$)) {
                f17652();
            }
            else if (var16.eql($ic26$)) {
                f17653();
            }
            else if (var16.eql($ic14$)) {
                f17654();
            }
            else if (var16.eql($ic19$)) {
                f17655();
            }
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
            module0136.$g1597$.rebind(var18, var17);
        }
        if (NIL != f17633(var16)) {
            f17634(var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17641(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0136.$g1597$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0136.$g1597$.bind((SubLObject)T, var17);
            module0147.$g2094$.bind((SubLObject)$ic72$, var17);
            module0147.$g2095$.bind($ic73$, var17);
            if (var16.eql($ic27$)) {
                f17656();
            }
            else if (var16.eql($ic28$)) {
                f17657();
            }
            else if (var16.eql($ic26$)) {
                f17658();
            }
            else if (var16.eql($ic14$)) {
                f17659();
            }
            else if (var16.eql($ic19$)) {
                f17660();
            }
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
            module0136.$g1597$.rebind(var18, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17661(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        f17662(var16, var18, var31, var32);
        f17663(var16, var18, var31);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17662(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        final SubLObject var33 = f17623(var16);
        SubLObject var34 = module0067.f4884(var33, var18, (SubLObject)UNPROVIDED);
        if (NIL == var34) {
            var34 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        module0084.f5765(var34, var31, var32, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        module0067.f4886(var33, var18, var34);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17664(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = module0253.f16446(module0137.f8955(var16), var31, var18, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            f17662(var16, var18, var31, var34);
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f17663(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        final SubLObject var32 = f17635(var16);
        if (NIL != f17633(var16)) {
            SubLObject var33 = f17608(var32, var31);
            if (NIL == var33) {
                var33 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            }
            module0077.f5326(var18, var33);
            module0173.f10991(var32, var31, var33);
        }
        else {
            SubLObject var34 = module0067.f4884(var32, var18, (SubLObject)UNPROVIDED);
            if (NIL == var34) {
                var34 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            }
            module0077.f5326(var31, var34);
            module0067.f4886(var32, var18, var34);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17665(final SubLObject var88) {
        if (NIL != f17666() && NIL != module0178.f11343(var88, (SubLObject)$ic74$)) {
            final SubLObject var90;
            final SubLObject var89 = var90 = module0178.f11332(var88);
            if (var90.eql($ic14$)) {
                f17667(var88);
            }
            else if (var90.eql($ic19$)) {
                f17668(var88);
            }
            else if (var90.eql($ic26$)) {
                f17669(var88);
            }
            else if (var90.eql($ic27$)) {
                f17670(var88);
            }
            else if (var90.eql($ic28$)) {
                f17670(var88);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17671(final SubLObject var88, final SubLObject var89, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)NIL;
        final SubLObject var93 = module0136.$g1597$.currentBinding(var91);
        try {
            module0136.$g1597$.bind((SubLObject)T, var91);
            final SubLObject var94 = module0178.f11334(var88);
            final SubLObject var95 = module0178.f11335(var88);
            final SubLObject var96 = f17672(var89, var95, var90);
            final SubLObject var97 = f17626(var90, var94);
            SubLObject var99;
            final SubLObject var98 = var99 = conses_high.set_difference(var96, var97, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            SubLObject var100 = (SubLObject)NIL;
            var100 = var99.first();
            while (NIL != var99) {
                var92 = (SubLObject)T;
                f17663(var90, var100, var94);
                var99 = var99.rest();
                var100 = var99.first();
            }
            var99 = var96;
            SubLObject var101 = (SubLObject)NIL;
            var101 = var99.first();
            while (NIL != var99) {
                SubLObject var4_99 = module0253.f16446(module0137.f8955(var90), var94, var95, (SubLObject)UNPROVIDED);
                SubLObject var102 = (SubLObject)NIL;
                var102 = var4_99.first();
                while (NIL != var4_99) {
                    if (NIL == f17632(var90, var94, var101, var102)) {
                        var92 = (SubLObject)T;
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
        SubLObject var33 = (SubLObject)NIL;
        var33 = f17674(var16, var18, var31, var32);
        if (NIL != var33) {
            f17675(var16, var18, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17674(final SubLObject var16, final SubLObject var18, final SubLObject var31, final SubLObject var32) {
        final SubLObject var33 = module0067.f4884(f17623(var16), var18, (SubLObject)UNPROVIDED);
        final SubLObject var34 = module0067.f4884(var33, var31, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var34) && var32.eql(var34.first())) {
            module0067.f4887(var33, var31);
            return (SubLObject)T;
        }
        module0084.f5771(var33, var31, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17675(final SubLObject var16, final SubLObject var18, final SubLObject var31) {
        final SubLObject var32 = f17635(var16);
        if (NIL != f17633(var16)) {
            final SubLObject var33 = f17608(var32, var31);
            module0077.f5327(var18, var33);
            if (NIL != module0077.f5316(var33)) {
                module0173.f10992(var32, var31);
            }
            else {
                module0173.f10991(var32, var31, var33);
            }
        }
        else {
            final SubLObject var34 = module0067.f4884(var32, var18, (SubLObject)UNPROVIDED);
            module0077.f5327(var31, var34);
            if (NIL != module0077.f5316(var34)) {
                module0067.f4887(var32, var18);
            }
            else {
                module0067.f4886(var32, var18, var34);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17676(final SubLObject var88) {
        if (NIL != f17666() && NIL != module0178.f11343(var88, (SubLObject)$ic74$)) {
            final SubLObject var90;
            final SubLObject var89 = var90 = module0178.f11332(var88);
            if (var90.eql($ic14$)) {
                f17677(var88);
            }
            else if (var90.eql($ic19$)) {
                f17678(var88);
            }
            else if (var90.eql($ic26$)) {
                f17679(var88);
            }
            else if (var90.eql($ic27$)) {
                f17680(var88);
            }
            else if (var90.eql($ic28$)) {
                f17680(var88);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17681(final SubLObject var16, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)NIL;
        final SubLObject var91 = module0136.$g1597$.currentBinding(var89);
        try {
            module0136.$g1597$.bind((SubLObject)T, var89);
            final SubLObject var92 = module0178.f11334(var88);
            final SubLObject var93 = module0178.f11287(var88);
            final SubLObject var94 = f17626(var16, var92);
            final SubLObject var95 = f17672(var16, var92, var16);
            SubLObject var97;
            final SubLObject var96 = var97 = conses_high.set_difference(var94, var95, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            SubLObject var98 = (SubLObject)NIL;
            var98 = var97.first();
            while (NIL != var97) {
                var90 = (SubLObject)T;
                f17675(var16, var98, var92);
                var97 = var97.rest();
                var98 = var97.first();
            }
            final SubLObject var99 = module0248.f15936(module0137.f8955(var16), var92, var93);
            final SubLObject var100 = f17623(var16);
            SubLObject var101;
            for (var101 = module0066.f4838(module0067.f4891(var100)); NIL == module0066.f4841(var101); var101 = module0066.f4840(var101)) {
                var89.resetMultipleValues();
                final SubLObject var102 = module0066.f4839(var101);
                final SubLObject var103 = var89.secondMultipleValue();
                var89.resetMultipleValues();
                if (NIL != module0004.f104(var93, module0067.f4884(var103, var92, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var104 = module0202.f12768(var16, var92, var102);
                    final SubLObject var105 = (NIL != module0226.f14824(var104)) ? module0226.f14826(var104) : var93;
                    if (NIL == var99 || NIL == module0252.f16335(module0137.f8955(var16), var92, var102, var105, (SubLObject)UNPROVIDED)) {
                        var90 = (SubLObject)T;
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
        return (SubLObject)makeBoolean(NIL != module0136.f8877() && NIL == module0136.$g1596$.getDynamicValue(var23));
    }
    
    public static SubLObject f17682(final SubLObject var16, final SubLObject var31, final SubLObject var18, final SubLObject var32) {
        return (SubLObject)makeBoolean(NIL != f17624(var16, var31, var18) && NIL != f17632(var16, var31, var18, var32));
    }
    
    public static SubLObject f17672(final SubLObject var16, final SubLObject var18, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = f17609(var90);
        SubLObject var93 = (SubLObject)NIL;
        final SubLObject var94 = module0147.$g2094$.currentBinding(var91);
        final SubLObject var95 = module0147.$g2095$.currentBinding(var91);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var91);
            module0147.$g2095$.bind($ic73$, var91);
            var93 = module0252.f16320(module0137.f8955(var16), var18, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        SubLObject var117 = (SubLObject)NIL;
        final SubLObject var118 = module0147.$g2094$.currentBinding(var115);
        final SubLObject var119 = module0147.$g2095$.currentBinding(var115);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var115);
            module0147.$g2095$.bind($ic73$, var115);
            var117 = module0252.f16323(module0137.f8955(var16), var18, var116, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var119, var115);
            module0147.$g2094$.rebind(var118, var115);
        }
        return var117;
    }
    
    public static SubLObject f17684(final SubLObject var18, final SubLObject var16) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != f17633(var16)) {
            module0173.f10992(f17635(var16), var18);
        }
        else {
            final SubLObject var20 = f17635(var16);
            final SubLObject var115_116 = f17635(var16);
            if (NIL != f17633(var16)) {
                final SubLObject var21 = module0077.f5333(f17608(var115_116, var18));
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                for (var22 = module0032.f1741(var21), var23 = (SubLObject)NIL, var23 = module0032.f1742(var22, var21); NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
                    var24 = module0032.f1745(var22, var23);
                    if (NIL != module0032.f1746(var23, var24)) {
                        var25 = module0067.f4884(var20, var24, (SubLObject)UNPROVIDED);
                        if (NIL != var25) {
                            module0077.f5327(var18, var25);
                        }
                    }
                }
            }
            else {
                SubLObject var26;
                for (var26 = module0066.f4838(module0067.f4891(var115_116)); NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
                    var19.resetMultipleValues();
                    final SubLObject var27 = module0066.f4839(var26);
                    final SubLObject var28 = var19.secondMultipleValue();
                    var19.resetMultipleValues();
                    if (NIL != module0077.f5320(var18, var28)) {
                        final SubLObject var29 = module0067.f4884(var20, var27, (SubLObject)UNPROVIDED);
                        if (NIL != var29) {
                            module0077.f5327(var18, var29);
                        }
                    }
                }
                module0066.f4842(var26);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17685(final SubLObject var18, final SubLObject var16) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20;
        for (var20 = module0066.f4838(module0067.f4891(f17623(var16))); NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
            var19.resetMultipleValues();
            final SubLObject var21 = module0066.f4839(var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != module0067.f4852(var22)) {
                module0067.f4887(var22, var18);
            }
        }
        module0066.f4842(var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17601(final SubLObject var16, final SubLObject var18, SubLObject var120) {
        if (var120 == UNPROVIDED) {
            var120 = (SubLObject)T;
        }
        final SubLThread var121 = SubLProcess.currentSubLThread();
        final SubLObject var122 = module0136.$g1597$.currentBinding(var121);
        final SubLObject var123 = module0147.$g2094$.currentBinding(var121);
        final SubLObject var124 = module0147.$g2095$.currentBinding(var121);
        try {
            module0136.$g1597$.bind((SubLObject)T, var121);
            module0147.$g2094$.bind((SubLObject)$ic72$, var121);
            module0147.$g2095$.bind($ic73$, var121);
            if (NIL != var120) {
                f17684(var18, var16);
                f17685(var18, var16);
            }
            SubLObject var126;
            final SubLObject var125 = var126 = f17672(var16, var18, var16);
            SubLObject var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                f17663(var16, var127, var18);
                if (NIL != module0244.f15772(module0137.f8955(var16)) && var127.eql(var18)) {
                    f17662(var16, var18, var18, $ic75$);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17652() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607($ic27$));
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
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = (SubLObject)$ic78$;
                var30 = module0056.f4145(var29);
                var31 = (SubLObject)NIL;
                var32 = module0139.$g1635$.currentBinding(var23);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var23);
                    var33 = (SubLObject)NIL;
                    var34_126 = module0141.$g1714$.currentBinding(var23);
                    var34 = module0141.$g1715$.currentBinding(var23);
                    try {
                        module0141.$g1714$.bind((NIL != var33) ? var33 : module0141.f9283(), var23);
                        module0141.$g1715$.bind((SubLObject)((NIL != var33) ? $ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                        if (NIL != var33 && NIL != module0136.f8864() && NIL == module0141.f9279(var33)) {
                            var35 = module0136.$g1591$.getDynamicValue(var23);
                            if (var35.eql((SubLObject)$ic80$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var35.eql((SubLObject)$ic83$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var35.eql((SubLObject)$ic85$)) {
                                Errors.warn((SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                Errors.cerror((SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                            }
                        }
                        var34_127 = module0141.$g1670$.currentBinding(var23);
                        var35_128 = module0141.$g1671$.currentBinding(var23);
                        var36 = module0141.$g1672$.currentBinding(var23);
                        var37 = module0141.$g1674$.currentBinding(var23);
                        var38 = module0137.$g1605$.currentBinding(var23);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic27$), var23);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic27$)), var23);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic27$)), var23);
                            module0141.$g1674$.bind((SubLObject)NIL, var23);
                            module0137.$g1605$.bind(module0137.f8955($ic27$), var23);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                var34_128 = module0141.$g1677$.currentBinding(var23);
                                var35_129 = module0138.$g1619$.currentBinding(var23);
                                var36_131 = module0141.$g1674$.currentBinding(var23);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var23);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic27$)), var23);
                                    module0141.$g1674$.bind((SubLObject)NIL, var23);
                                    module0249.f16055(var28, (SubLObject)UNPROVIDED);
                                    for (var31 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var31; var31 = module0056.f4150(var30)) {
                                        var121_132 = var31.first();
                                        var39 = conses_high.second(var31);
                                        var40 = var121_132;
                                        var34_129 = module0141.$g1674$.currentBinding(var23);
                                        try {
                                            module0141.$g1674$.bind(var39, var23);
                                            var41 = var39;
                                            if (NIL != module0173.f10955(var40)) {
                                                if (NIL != var41) {
                                                    f17663($ic28$, var27, var40);
                                                }
                                                else {
                                                    f17663($ic27$, var27, var40);
                                                }
                                            }
                                            var42 = (var43 = module0200.f12443(module0137.f8955($ic27$)));
                                            var44 = (SubLObject)NIL;
                                            var44 = var43.first();
                                            while (NIL != var43) {
                                                var34_130 = module0137.$g1605$.currentBinding(var23);
                                                var35_130 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var44, var23);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var45 = module0228.f15229(var121_132);
                                                    if (NIL != module0138.f8992(var45)) {
                                                        var46 = module0242.f15664(var45, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var46) {
                                                            var47 = module0245.f15834(var46, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var47) {
                                                                for (var48 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var48); var48 = module0066.f4840(var48)) {
                                                                    var23.resetMultipleValues();
                                                                    var49 = module0066.f4839(var48);
                                                                    var50 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var49)) {
                                                                        var34_131 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var49, var23);
                                                                            for (var46_147 = module0066.f4838(module0067.f4891(var50)); NIL == module0066.f4841(var46_147); var46_147 = module0066.f4840(var46_147)) {
                                                                                var23.resetMultipleValues();
                                                                                var51 = module0066.f4839(var46_147);
                                                                                var52 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var51)) {
                                                                                    var34_132 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var51, var23);
                                                                                        var53 = var52;
                                                                                        if (NIL != module0077.f5302(var53)) {
                                                                                            var80_152 = module0077.f5333(var53);
                                                                                            for (var81_153 = module0032.f1741(var80_152), var82_154 = (SubLObject)NIL, var82_154 = module0032.f1742(var81_153, var80_152); NIL == module0032.f1744(var81_153, var82_154); var82_154 = module0032.f1743(var82_154)) {
                                                                                                var54 = module0032.f1745(var81_153, var82_154);
                                                                                                if (NIL != module0032.f1746(var82_154, var54) && NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var30);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var53.isList()) {
                                                                                            var55 = var53;
                                                                                            var56 = (SubLObject)NIL;
                                                                                            var56 = var55.first();
                                                                                            while (NIL != var55) {
                                                                                                if (NIL == module0249.f16059(var56, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var56, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var56, module0141.f9195()), var30);
                                                                                                }
                                                                                                var55 = var55.rest();
                                                                                                var56 = var55.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic87$, var53);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var45, (SubLObject)UNPROVIDED)) {
                                                        var57 = (var4_157 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                        var58 = (SubLObject)NIL;
                                                        var58 = var4_157.first();
                                                        while (NIL != var4_157) {
                                                            var34_133 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var58, var23);
                                                                var59 = (var60 = Functions.funcall(var58, var45));
                                                                if (NIL != module0077.f5302(var60)) {
                                                                    var80_153 = module0077.f5333(var60);
                                                                    for (var81_154 = module0032.f1741(var80_153), var82_155 = (SubLObject)NIL, var82_155 = module0032.f1742(var81_154, var80_153); NIL == module0032.f1744(var81_154, var82_155); var82_155 = module0032.f1743(var82_155)) {
                                                                        var61 = module0032.f1745(var81_154, var82_155);
                                                                        if (NIL != module0032.f1746(var82_155, var61) && NIL == module0249.f16059(var61, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var61, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var61, module0141.f9195()), var30);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var60.isList()) {
                                                                    var62 = var60;
                                                                    var63 = (SubLObject)NIL;
                                                                    var63 = var62.first();
                                                                    while (NIL != var62) {
                                                                        if (NIL == module0249.f16059(var63, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var63, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var63, module0141.f9195()), var30);
                                                                        }
                                                                        var62 = var62.rest();
                                                                        var63 = var62.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic87$, var60);
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
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic89$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17656() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635($ic27$);
        if (NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_167 = var26;
                if (NIL == module0065.f4775(var166_167, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_167);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var31 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = constants_high_oc.f10752(var31);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17662($ic27$, var37, var37, $ic75$);
                                        f17664($ic27$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_175 = var26;
                if (NIL == module0065.f4777(var174_175)) {
                    final SubLObject var38 = module0065.f4738(var174_175);
                    SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = constants_high_oc.f10752(var39);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17662($ic27$, var47, var47, $ic75$);
                                        f17664($ic27$, var47, var43);
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
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_168 = var26;
                if (NIL == module0065.f4775(var166_168, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_168);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var48 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17662($ic27$, var37, var37, $ic75$);
                                        f17664($ic27$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_176 = var26;
                if (NIL == module0065.f4777(var174_176)) {
                    final SubLObject var38 = module0065.f4738(var174_176);
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17662($ic27$, var47, var47, $ic75$);
                                        f17664($ic27$, var47, var43);
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
            for (var50 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (NIL != module0032.f1746(var55, var56)) {
                        f17662($ic27$, var51, var51, $ic75$);
                        f17664($ic27$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17657() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635($ic28$);
        if (NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_183 = var26;
                if (NIL == module0065.f4775(var166_183, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_183);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var31 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = constants_high_oc.f10752(var31);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic28$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_184 = var26;
                if (NIL == module0065.f4777(var174_184)) {
                    final SubLObject var38 = module0065.f4738(var174_184);
                    SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = constants_high_oc.f10752(var39);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic28$, var47, var43);
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
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_184 = var26;
                if (NIL == module0065.f4775(var166_184, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_184);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var48 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic28$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_185 = var26;
                if (NIL == module0065.f4777(var174_185)) {
                    final SubLObject var38 = module0065.f4738(var174_185);
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic28$, var47, var43);
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
            for (var50 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (NIL != module0032.f1746(var55, var56)) {
                        f17664($ic28$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17670(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = module0178.f11332(var88);
        if (var90.eql($ic27$)) {
            final SubLObject var91 = f17671(var88, $ic27$, $ic27$);
            final SubLObject var92 = f17671(var88, $ic28$, $ic28$);
            var89 = (SubLObject)makeBoolean(NIL != var91 || NIL != var92);
        }
        else if (var90.eql($ic28$)) {
            final SubLObject var91 = f17671(var88, $ic27$, $ic28$);
            final SubLObject var92 = f17671(var88, $ic28$, $ic27$);
            var89 = (SubLObject)makeBoolean(NIL != var91 || NIL != var92);
        }
        else {
            module0136.f8870((SubLObject)THREE_INTEGER, (SubLObject)$ic91$, module0178.f11332(var88), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var89) {
            final SubLObject var93 = module0178.f11334(var88);
            f17686(var93);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17680(final SubLObject var88) {
        final SubLObject var89 = f17681($ic27$, var88);
        final SubLObject var90 = f17681($ic28$, var88);
        final SubLObject var91 = (SubLObject)makeBoolean(NIL != var89 || NIL != var90);
        if (NIL != var91) {
            final SubLObject var92 = module0178.f11334(var88);
            f17686(var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17686(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var17);
        final SubLObject var20 = module0136.$g1597$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var17);
            module0147.$g2095$.bind($ic73$, var17);
            module0136.$g1597$.bind((SubLObject)T, var17);
            module0260.f17064((SubLObject)$ic92$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var20, var17);
            module0147.$g2095$.rebind(var19, var17);
            module0147.$g2094$.rebind(var18, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17687(final SubLObject var16) {
        f17601($ic27$, var16, (SubLObject)T);
        f17601($ic28$, var16, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17653() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607($ic26$));
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
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = (SubLObject)$ic77$;
                var30 = module0056.f4145(var29);
                var31 = module0139.$g1635$.currentBinding(var23);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var23);
                    var32 = (SubLObject)NIL;
                    var34_197 = module0141.$g1714$.currentBinding(var23);
                    var33 = module0141.$g1715$.currentBinding(var23);
                    try {
                        module0141.$g1714$.bind((NIL != var32) ? var32 : module0141.f9283(), var23);
                        module0141.$g1715$.bind((SubLObject)((NIL != var32) ? $ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                        if (NIL != var32 && NIL != module0136.f8864() && NIL == module0141.f9279(var32)) {
                            var34 = module0136.$g1591$.getDynamicValue(var23);
                            if (var34.eql((SubLObject)$ic80$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic81$, var32, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var34.eql((SubLObject)$ic83$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic84$, (SubLObject)$ic81$, var32, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var34.eql((SubLObject)$ic85$)) {
                                Errors.warn((SubLObject)$ic81$, var32, (SubLObject)$ic82$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                Errors.cerror((SubLObject)$ic84$, (SubLObject)$ic81$, var32, (SubLObject)$ic82$);
                            }
                        }
                        var34_198 = module0141.$g1670$.currentBinding(var23);
                        var35_199 = module0141.$g1671$.currentBinding(var23);
                        var35 = module0141.$g1672$.currentBinding(var23);
                        var36 = module0141.$g1674$.currentBinding(var23);
                        var37 = module0137.$g1605$.currentBinding(var23);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic26$), var23);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic26$)), var23);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic26$)), var23);
                            module0141.$g1674$.bind((SubLObject)NIL, var23);
                            module0137.$g1605$.bind(module0137.f8955($ic26$), var23);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                var34_199 = module0141.$g1677$.currentBinding(var23);
                                var35_200 = module0138.$g1619$.currentBinding(var23);
                                var36_202 = module0141.$g1674$.currentBinding(var23);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var23);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic26$)), var23);
                                    module0141.$g1674$.bind((SubLObject)NIL, var23);
                                    module0249.f16055(var28, (SubLObject)UNPROVIDED);
                                    while (NIL != var28) {
                                        var38 = var28;
                                        if (NIL != module0173.f10955(var38)) {
                                            f17663($ic26$, var27, var38);
                                        }
                                        var39 = (var40 = module0200.f12443(module0137.f8955($ic26$)));
                                        var41 = (SubLObject)NIL;
                                        var41 = var40.first();
                                        while (NIL != var40) {
                                            var34_200 = module0137.$g1605$.currentBinding(var23);
                                            var35_201 = module0141.$g1674$.currentBinding(var23);
                                            try {
                                                module0137.$g1605$.bind(var41, var23);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                var42 = module0228.f15229(var28);
                                                if (NIL != module0138.f8992(var42)) {
                                                    var43 = module0242.f15664(var42, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var43) {
                                                        var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var44) {
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var23.resetMultipleValues();
                                                                var46 = module0066.f4839(var45);
                                                                var47 = var23.secondMultipleValue();
                                                                var23.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var46)) {
                                                                    var34_201 = module0138.$g1623$.currentBinding(var23);
                                                                    try {
                                                                        module0138.$g1623$.bind(var46, var23);
                                                                        for (var46_206 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var46_206); var46_206 = module0066.f4840(var46_206)) {
                                                                            var23.resetMultipleValues();
                                                                            var48 = module0066.f4839(var46_206);
                                                                            var49 = var23.secondMultipleValue();
                                                                            var23.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var48)) {
                                                                                var34_202 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48, var23);
                                                                                    var50 = var49;
                                                                                    if (NIL != module0077.f5302(var50)) {
                                                                                        var80_208 = module0077.f5333(var50);
                                                                                        for (var81_209 = module0032.f1741(var80_208), var82_210 = (SubLObject)NIL, var82_210 = module0032.f1742(var81_209, var80_208); NIL == module0032.f1744(var81_209, var82_210); var82_210 = module0032.f1743(var82_210)) {
                                                                                            var51 = module0032.f1745(var81_209, var82_210);
                                                                                            if (NIL != module0032.f1746(var82_210, var51) && NIL == module0249.f16059(var51, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var51, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var51, var30);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var52 = var50;
                                                                                        var53 = (SubLObject)NIL;
                                                                                        var53 = var52.first();
                                                                                        while (NIL != var52) {
                                                                                            if (NIL == module0249.f16059(var53, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var53, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var53, var30);
                                                                                            }
                                                                                            var52 = var52.rest();
                                                                                            var53 = var52.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic87$, var50);
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
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var42, (SubLObject)UNPROVIDED)) {
                                                    var54 = (var4_212 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                    var55 = (SubLObject)NIL;
                                                    var55 = var4_212.first();
                                                    while (NIL != var4_212) {
                                                        var34_203 = module0138.$g1625$.currentBinding(var23);
                                                        try {
                                                            module0138.$g1625$.bind(var55, var23);
                                                            var56 = (var57 = Functions.funcall(var55, var42));
                                                            if (NIL != module0077.f5302(var57)) {
                                                                var80_209 = module0077.f5333(var57);
                                                                for (var81_210 = module0032.f1741(var80_209), var82_211 = (SubLObject)NIL, var82_211 = module0032.f1742(var81_210, var80_209); NIL == module0032.f1744(var81_210, var82_211); var82_211 = module0032.f1743(var82_211)) {
                                                                    var58 = module0032.f1745(var81_210, var82_211);
                                                                    if (NIL != module0032.f1746(var82_211, var58) && NIL == module0249.f16059(var58, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var58, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var58, var30);
                                                                    }
                                                                }
                                                            }
                                                            else if (var57.isList()) {
                                                                var59 = var57;
                                                                var60 = (SubLObject)NIL;
                                                                var60 = var59.first();
                                                                while (NIL != var59) {
                                                                    if (NIL == module0249.f16059(var60, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var60, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var60, var30);
                                                                    }
                                                                    var59 = var59.rest();
                                                                    var60 = var59.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic87$, var57);
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
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic89$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17658() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635($ic26$);
        if (NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_217 = var26;
                if (NIL == module0065.f4775(var166_217, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_217);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var31 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = constants_high_oc.f10752(var31);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17662($ic26$, var37, var37, $ic75$);
                                        f17664($ic26$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_218 = var26;
                if (NIL == module0065.f4777(var174_218)) {
                    final SubLObject var38 = module0065.f4738(var174_218);
                    SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = constants_high_oc.f10752(var39);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17662($ic26$, var47, var47, $ic75$);
                                        f17664($ic26$, var47, var43);
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
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_218 = var26;
                if (NIL == module0065.f4775(var166_218, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_218);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var48 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17662($ic26$, var37, var37, $ic75$);
                                        f17664($ic26$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_219 = var26;
                if (NIL == module0065.f4777(var174_219)) {
                    final SubLObject var38 = module0065.f4738(var174_219);
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17662($ic26$, var47, var47, $ic75$);
                                        f17664($ic26$, var47, var43);
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
            for (var50 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (NIL != module0032.f1746(var55, var56)) {
                        f17662($ic26$, var51, var51, $ic75$);
                        f17664($ic26$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17669(final SubLObject var88) {
        final SubLObject var89 = module0178.f11334(var88);
        final SubLObject var90 = module0178.f11335(var88);
        SubLObject var91 = (SubLObject)NIL;
        var91 = f17671(var88, $ic26$, $ic26$);
        if (NIL != var91) {
            f17688(var89);
        }
        final SubLObject var92 = f17672($ic26$, var89, $ic14$);
        final SubLObject var93 = f17683($ic26$, var89, $ic14$, var90);
        SubLObject var94 = conses_high.set_difference(var92, var93, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        if (NIL != var94) {
            f17689(var89);
        }
        final SubLObject var95 = f17672($ic26$, var89, $ic19$);
        final SubLObject var96 = f17683($ic26$, var89, $ic19$, var90);
        var94 = conses_high.set_difference(var95, var96, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        if (NIL != var94) {
            f17690(var89);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17679(final SubLObject var88) {
        final SubLObject var89 = module0178.f11334(var88);
        final SubLObject var90 = module0178.f11335(var88);
        SubLObject var91 = (SubLObject)NIL;
        var91 = f17681($ic26$, var88);
        if (NIL != var91) {
            f17688(var89);
        }
        final SubLObject var92 = f17672($ic26$, var89, $ic14$);
        final SubLObject var93 = f17672($ic26$, var90, $ic14$);
        SubLObject var94 = conses_high.set_difference(var93, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var94) {
            f17689(var89);
        }
        final SubLObject var95 = f17672($ic26$, var89, $ic19$);
        final SubLObject var96 = f17672($ic26$, var90, $ic19$);
        var94 = conses_high.set_difference(var96, var95, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var94) {
            f17690(var89);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17689(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var22);
            module0147.$g2095$.bind($ic73$, var22);
            module0136.$g1597$.bind((SubLObject)T, var22);
            module0259.f16869((SubLObject)$ic94$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17690(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var22);
            module0147.$g2095$.bind($ic73$, var22);
            module0136.$g1597$.bind((SubLObject)T, var22);
            module0259.f16869((SubLObject)$ic95$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17688(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var25 = module0136.$g1597$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)$ic72$, var22);
            module0147.$g2095$.bind($ic73$, var22);
            module0136.$g1597$.bind((SubLObject)T, var22);
            module0256.f16586((SubLObject)$ic96$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0136.$g1597$.rebind(var25, var22);
            module0147.$g2095$.rebind(var24, var22);
            module0147.$g2094$.rebind(var23, var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17691(final SubLObject var21) {
        f17601($ic26$, var21, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17654() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607($ic14$));
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
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = module0137.$g1605$.currentBinding(var23);
                var30 = module0139.$g1636$.currentBinding(var23);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic14$), var23);
                    module0139.$g1636$.bind(module0139.f9007(), var23);
                    var194_228 = var28;
                    var31 = (SubLObject)$ic77$;
                    var32 = module0056.f4145(var31);
                    var34_229 = module0139.$g1635$.currentBinding(var23);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var23);
                        var33 = (SubLObject)NIL;
                        var34_230 = module0141.$g1714$.currentBinding(var23);
                        var35_231 = module0141.$g1715$.currentBinding(var23);
                        try {
                            module0141.$g1714$.bind((NIL != var33) ? var33 : module0141.f9283(), var23);
                            module0141.$g1715$.bind((SubLObject)((NIL != var33) ? $ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                            if (NIL != var33 && NIL != module0136.f8864() && NIL == module0141.f9279(var33)) {
                                var34 = module0136.$g1591$.getDynamicValue(var23);
                                if (var34.eql((SubLObject)$ic80$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)$ic83$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)$ic85$)) {
                                    Errors.warn((SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                    Errors.cerror((SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                                }
                            }
                            var34_231 = module0141.$g1670$.currentBinding(var23);
                            var35_232 = module0141.$g1671$.currentBinding(var23);
                            var35 = module0141.$g1672$.currentBinding(var23);
                            var36 = module0141.$g1674$.currentBinding(var23);
                            var37 = module0137.$g1605$.currentBinding(var23);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic14$)), var23);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic14$))), var23);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic14$))), var23);
                                module0141.$g1674$.bind((SubLObject)NIL, var23);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic14$)), var23);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var28, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    var34_232 = module0141.$g1677$.currentBinding(var23);
                                    var35_233 = module0138.$g1619$.currentBinding(var23);
                                    var36_236 = module0141.$g1674$.currentBinding(var23);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var23);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic14$))), var23);
                                        module0141.$g1674$.bind((SubLObject)NIL, var23);
                                        module0249.f16055(var194_228, (SubLObject)UNPROVIDED);
                                        while (NIL != var194_228) {
                                            var38 = var194_228;
                                            var39 = (var40 = module0200.f12443(module0137.f8955($ic14$)));
                                            var41 = (SubLObject)NIL;
                                            var41 = var40.first();
                                            while (NIL != var40) {
                                                var34_233 = module0137.$g1605$.currentBinding(var23);
                                                var35_234 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var41, var23);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var42 = module0228.f15229(var38);
                                                    if (NIL != module0138.f8992(var42)) {
                                                        var43 = module0242.f15664(var42, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var43) {
                                                            var44 = module0245.f15834(var43, module0244.f15780(module0137.f8955($ic14$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var44) {
                                                                for (var45 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                    var23.resetMultipleValues();
                                                                    var46 = module0066.f4839(var45);
                                                                    var47 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var46)) {
                                                                        var34_234 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var46, var23);
                                                                            for (var46_242 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var46_242); var46_242 = module0066.f4840(var46_242)) {
                                                                                var23.resetMultipleValues();
                                                                                var48 = module0066.f4839(var46_242);
                                                                                var49 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var48)) {
                                                                                    var34_235 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var48, var23);
                                                                                        var50 = var49;
                                                                                        if (NIL != module0077.f5302(var50)) {
                                                                                            var80_245 = module0077.f5333(var50);
                                                                                            for (var81_246 = module0032.f1741(var80_245), var82_247 = (SubLObject)NIL, var82_247 = module0032.f1742(var81_246, var80_245); NIL == module0032.f1744(var81_246, var82_247); var82_247 = module0032.f1743(var82_247)) {
                                                                                                var51 = module0032.f1745(var81_246, var82_247);
                                                                                                if (NIL != module0032.f1746(var82_247, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (NIL != module0173.f10955(var51)) {
                                                                                                        f17663($ic14$, var27, var51);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var50.isList()) {
                                                                                            var52 = var50;
                                                                                            var53 = (SubLObject)NIL;
                                                                                            var53 = var52.first();
                                                                                            while (NIL != var52) {
                                                                                                if (NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (NIL != module0173.f10955(var53)) {
                                                                                                        f17663($ic14$, var27, var53);
                                                                                                    }
                                                                                                }
                                                                                                var52 = var52.rest();
                                                                                                var53 = var52.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic87$, var50);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var42, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            var54 = module0248.f15995(var42);
                                                            var55 = (SubLObject)NIL;
                                                            var55 = var54.first();
                                                            while (NIL != var54) {
                                                                var56 = (var57 = var55);
                                                                var58 = (SubLObject)NIL;
                                                                var59 = (SubLObject)NIL;
                                                                var60 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var58 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var59 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var60 = var57.first();
                                                                var57 = var57.rest();
                                                                if (NIL == var57) {
                                                                    if (NIL != module0147.f9507(var59)) {
                                                                        var34_236 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var59, var23);
                                                                            if (NIL != module0141.f9289(var60)) {
                                                                                var34_237 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60, var23);
                                                                                    var61 = (var50 = (SubLObject)ConsesLow.list(var58));
                                                                                    if (NIL != module0077.f5302(var50)) {
                                                                                        var80_246 = module0077.f5333(var50);
                                                                                        for (var81_247 = module0032.f1741(var80_246), var82_248 = (SubLObject)NIL, var82_248 = module0032.f1742(var81_247, var80_246); NIL == module0032.f1744(var81_247, var82_248); var82_248 = module0032.f1743(var82_248)) {
                                                                                            var51 = module0032.f1745(var81_247, var82_248);
                                                                                            if (NIL != module0032.f1746(var82_248, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (NIL != module0173.f10955(var51)) {
                                                                                                    f17663($ic14$, var27, var51);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var86_259 = var50;
                                                                                        var53 = (SubLObject)NIL;
                                                                                        var53 = var86_259.first();
                                                                                        while (NIL != var86_259) {
                                                                                            if (NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (NIL != module0173.f10955(var53)) {
                                                                                                    f17663($ic14$, var27, var53);
                                                                                                }
                                                                                            }
                                                                                            var86_259 = var86_259.rest();
                                                                                            var53 = var86_259.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic87$, var50);
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
                                                                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic97$);
                                                                }
                                                                var54 = var54.rest();
                                                                var55 = var54.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var42, (SubLObject)UNPROVIDED)) {
                                                        var62 = (var4_260 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic14$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic14$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                        var63 = (SubLObject)NIL;
                                                        var63 = var4_260.first();
                                                        while (NIL != var4_260) {
                                                            var34_238 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var63, var23);
                                                                var64 = (var65 = Functions.funcall(var63, var42));
                                                                if (NIL != module0077.f5302(var65)) {
                                                                    var80_247 = module0077.f5333(var65);
                                                                    for (var81_248 = module0032.f1741(var80_247), var82_249 = (SubLObject)NIL, var82_249 = module0032.f1742(var81_248, var80_247); NIL == module0032.f1744(var81_248, var82_249); var82_249 = module0032.f1743(var82_249)) {
                                                                        var66 = module0032.f1745(var81_248, var82_249);
                                                                        if (NIL != module0032.f1746(var82_249, var66) && NIL == module0249.f16059(var66, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var66, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (NIL != module0173.f10955(var66)) {
                                                                                f17663($ic14$, var27, var66);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var65.isList()) {
                                                                    var67 = var65;
                                                                    var68 = (SubLObject)NIL;
                                                                    var68 = var67.first();
                                                                    while (NIL != var67) {
                                                                        if (NIL == module0249.f16059(var68, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var68, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (NIL != module0173.f10955(var68)) {
                                                                                f17663($ic14$, var27, var68);
                                                                            }
                                                                        }
                                                                        var67 = var67.rest();
                                                                        var68 = var67.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic87$, var65);
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
                                            var69 = (var70 = module0200.f12443(module0244.f15771(module0137.f8955($ic14$))));
                                            var71 = (SubLObject)NIL;
                                            var71 = var70.first();
                                            while (NIL != var70) {
                                                var34_239 = module0137.$g1605$.currentBinding(var23);
                                                var35_235 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var71, var23);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var72 = module0228.f15229(var194_228);
                                                    if (NIL != module0138.f8992(var72)) {
                                                        var73 = module0242.f15664(var72, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var73) {
                                                            var74 = module0245.f15834(var73, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var74) {
                                                                for (var75 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                                                                    var23.resetMultipleValues();
                                                                    var76 = module0066.f4839(var75);
                                                                    var77 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var76)) {
                                                                        var34_240 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var76, var23);
                                                                            for (var46_243 = module0066.f4838(module0067.f4891(var77)); NIL == module0066.f4841(var46_243); var46_243 = module0066.f4840(var46_243)) {
                                                                                var23.resetMultipleValues();
                                                                                var78 = module0066.f4839(var46_243);
                                                                                var79 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var78)) {
                                                                                    var34_241 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var78, var23);
                                                                                        var80 = var79;
                                                                                        if (NIL != module0077.f5302(var80)) {
                                                                                            var80_248 = module0077.f5333(var80);
                                                                                            for (var81_249 = module0032.f1741(var80_248), var82_250 = (SubLObject)NIL, var82_250 = module0032.f1742(var81_249, var80_248); NIL == module0032.f1744(var81_249, var82_250); var82_250 = module0032.f1743(var82_250)) {
                                                                                                var81 = module0032.f1745(var81_249, var82_250);
                                                                                                if (NIL != module0032.f1746(var82_250, var81) && NIL == module0249.f16059(var81, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var81, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var81, var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var80.isList()) {
                                                                                            var82 = var80;
                                                                                            var83 = (SubLObject)NIL;
                                                                                            var83 = var82.first();
                                                                                            while (NIL != var82) {
                                                                                                if (NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var83, var32);
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic87$, var80);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var72, (SubLObject)UNPROVIDED)) {
                                                        var84 = (var4_261 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                        var85 = (SubLObject)NIL;
                                                        var85 = var4_261.first();
                                                        while (NIL != var4_261) {
                                                            var34_242 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var85, var23);
                                                                var86 = (var87 = Functions.funcall(var85, var72));
                                                                if (NIL != module0077.f5302(var87)) {
                                                                    var80_249 = module0077.f5333(var87);
                                                                    for (var81_250 = module0032.f1741(var80_249), var82_251 = (SubLObject)NIL, var82_251 = module0032.f1742(var81_250, var80_249); NIL == module0032.f1744(var81_250, var82_251); var82_251 = module0032.f1743(var82_251)) {
                                                                        var88 = module0032.f1745(var81_250, var82_251);
                                                                        if (NIL != module0032.f1746(var82_251, var88) && NIL == module0249.f16059(var88, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var88, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var88, var32);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var87.isList()) {
                                                                    var89 = var87;
                                                                    var90 = (SubLObject)NIL;
                                                                    var90 = var89.first();
                                                                    while (NIL != var89) {
                                                                        if (NIL == module0249.f16059(var90, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var90, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var90, var32);
                                                                        }
                                                                        var89 = var89.rest();
                                                                        var90 = var89.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic87$, var87);
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
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic89$, var28, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17659() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635($ic14$);
        if (NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_278 = var26;
                if (NIL == module0065.f4775(var166_278, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_278);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var31 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = constants_high_oc.f10752(var31);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic14$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_279 = var26;
                if (NIL == module0065.f4777(var174_279)) {
                    final SubLObject var38 = module0065.f4738(var174_279);
                    SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = constants_high_oc.f10752(var39);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic14$, var47, var43);
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
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_279 = var26;
                if (NIL == module0065.f4775(var166_279, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_279);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var48 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic14$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_280 = var26;
                if (NIL == module0065.f4777(var174_280)) {
                    final SubLObject var38 = module0065.f4738(var174_280);
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic14$, var47, var43);
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
            for (var50 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (NIL != module0032.f1746(var55, var56)) {
                        f17664($ic14$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17667(final SubLObject var88) {
        f17671(var88, $ic26$, $ic14$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17677(final SubLObject var88) {
        f17681($ic14$, var88);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17692(final SubLObject var18) {
        f17601($ic14$, var18, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17655() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0077.f5333(f17607($ic19$));
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
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27)) {
                var28 = var27;
                var29 = module0137.$g1605$.currentBinding(var23);
                var30 = module0139.$g1636$.currentBinding(var23);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic19$), var23);
                    module0139.$g1636$.bind(module0139.f9007(), var23);
                    var194_282 = var28;
                    var31 = (SubLObject)$ic77$;
                    var32 = module0056.f4145(var31);
                    var34_283 = module0139.$g1635$.currentBinding(var23);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var23);
                        var33 = (SubLObject)NIL;
                        var34_284 = module0141.$g1714$.currentBinding(var23);
                        var35_285 = module0141.$g1715$.currentBinding(var23);
                        try {
                            module0141.$g1714$.bind((NIL != var33) ? var33 : module0141.f9283(), var23);
                            module0141.$g1715$.bind((SubLObject)((NIL != var33) ? $ic79$ : module0141.$g1715$.getDynamicValue(var23)), var23);
                            if (NIL != var33 && NIL != module0136.f8864() && NIL == module0141.f9279(var33)) {
                                var34 = module0136.$g1591$.getDynamicValue(var23);
                                if (var34.eql((SubLObject)$ic80$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)$ic83$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var34.eql((SubLObject)$ic85$)) {
                                    Errors.warn((SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic86$, module0136.$g1591$.getDynamicValue(var23));
                                    Errors.cerror((SubLObject)$ic84$, (SubLObject)$ic81$, var33, (SubLObject)$ic82$);
                                }
                            }
                            var34_285 = module0141.$g1670$.currentBinding(var23);
                            var35_286 = module0141.$g1671$.currentBinding(var23);
                            var35 = module0141.$g1672$.currentBinding(var23);
                            var36 = module0141.$g1674$.currentBinding(var23);
                            var37 = module0137.$g1605$.currentBinding(var23);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic19$)), var23);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic19$))), var23);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic19$))), var23);
                                module0141.$g1674$.bind((SubLObject)NIL, var23);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic19$)), var23);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var28, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    var34_286 = module0141.$g1677$.currentBinding(var23);
                                    var35_287 = module0138.$g1619$.currentBinding(var23);
                                    var36_290 = module0141.$g1674$.currentBinding(var23);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var23);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic19$))), var23);
                                        module0141.$g1674$.bind((SubLObject)NIL, var23);
                                        module0249.f16055(var194_282, (SubLObject)UNPROVIDED);
                                        while (NIL != var194_282) {
                                            var38 = var194_282;
                                            var39 = (var40 = module0200.f12443(module0137.f8955($ic19$)));
                                            var41 = (SubLObject)NIL;
                                            var41 = var40.first();
                                            while (NIL != var40) {
                                                var34_287 = module0137.$g1605$.currentBinding(var23);
                                                var35_288 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var41, var23);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var42 = module0228.f15229(var38);
                                                    if (NIL != module0138.f8992(var42)) {
                                                        var43 = module0242.f15664(var42, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var43) {
                                                            var44 = module0245.f15834(var43, module0244.f15780(module0137.f8955($ic19$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var44) {
                                                                for (var45 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                    var23.resetMultipleValues();
                                                                    var46 = module0066.f4839(var45);
                                                                    var47 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var46)) {
                                                                        var34_288 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var46, var23);
                                                                            for (var46_294 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var46_294); var46_294 = module0066.f4840(var46_294)) {
                                                                                var23.resetMultipleValues();
                                                                                var48 = module0066.f4839(var46_294);
                                                                                var49 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var48)) {
                                                                                    var34_289 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var48, var23);
                                                                                        var50 = var49;
                                                                                        if (NIL != module0077.f5302(var50)) {
                                                                                            var80_296 = module0077.f5333(var50);
                                                                                            for (var81_297 = module0032.f1741(var80_296), var82_298 = (SubLObject)NIL, var82_298 = module0032.f1742(var81_297, var80_296); NIL == module0032.f1744(var81_297, var82_298); var82_298 = module0032.f1743(var82_298)) {
                                                                                                var51 = module0032.f1745(var81_297, var82_298);
                                                                                                if (NIL != module0032.f1746(var82_298, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (NIL != module0173.f10955(var51)) {
                                                                                                        f17663($ic19$, var27, var51);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var50.isList()) {
                                                                                            var52 = var50;
                                                                                            var53 = (SubLObject)NIL;
                                                                                            var53 = var52.first();
                                                                                            while (NIL != var52) {
                                                                                                if (NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                    module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                    if (NIL != module0173.f10955(var53)) {
                                                                                                        f17663($ic19$, var27, var53);
                                                                                                    }
                                                                                                }
                                                                                                var52 = var52.rest();
                                                                                                var53 = var52.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic87$, var50);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var42, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            var54 = module0248.f15995(var42);
                                                            var55 = (SubLObject)NIL;
                                                            var55 = var54.first();
                                                            while (NIL != var54) {
                                                                var56 = (var57 = var55);
                                                                var58 = (SubLObject)NIL;
                                                                var59 = (SubLObject)NIL;
                                                                var60 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var58 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var59 = var57.first();
                                                                var57 = var57.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic97$);
                                                                var60 = var57.first();
                                                                var57 = var57.rest();
                                                                if (NIL == var57) {
                                                                    if (NIL != module0147.f9507(var59)) {
                                                                        var34_290 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var59, var23);
                                                                            if (NIL != module0141.f9289(var60)) {
                                                                                var34_291 = module0138.$g1624$.currentBinding(var23);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60, var23);
                                                                                    var61 = (var50 = (SubLObject)ConsesLow.list(var58));
                                                                                    if (NIL != module0077.f5302(var50)) {
                                                                                        var80_297 = module0077.f5333(var50);
                                                                                        for (var81_298 = module0032.f1741(var80_297), var82_299 = (SubLObject)NIL, var82_299 = module0032.f1742(var81_298, var80_297); NIL == module0032.f1744(var81_298, var82_299); var82_299 = module0032.f1743(var82_299)) {
                                                                                            var51 = module0032.f1745(var81_298, var82_299);
                                                                                            if (NIL != module0032.f1746(var82_299, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (NIL != module0173.f10955(var51)) {
                                                                                                    f17663($ic19$, var27, var51);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        var86_306 = var50;
                                                                                        var53 = (SubLObject)NIL;
                                                                                        var53 = var86_306.first();
                                                                                        while (NIL != var86_306) {
                                                                                            if (NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var23))) {
                                                                                                module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var23));
                                                                                                if (NIL != module0173.f10955(var53)) {
                                                                                                    f17663($ic19$, var27, var53);
                                                                                                }
                                                                                            }
                                                                                            var86_306 = var86_306.rest();
                                                                                            var53 = var86_306.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic87$, var50);
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
                                                                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic97$);
                                                                }
                                                                var54 = var54.rest();
                                                                var55 = var54.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var42, (SubLObject)UNPROVIDED)) {
                                                        var62 = (var4_307 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic19$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic19$)), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                        var63 = (SubLObject)NIL;
                                                        var63 = var4_307.first();
                                                        while (NIL != var4_307) {
                                                            var34_292 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var63, var23);
                                                                var64 = (var65 = Functions.funcall(var63, var42));
                                                                if (NIL != module0077.f5302(var65)) {
                                                                    var80_298 = module0077.f5333(var65);
                                                                    for (var81_299 = module0032.f1741(var80_298), var82_300 = (SubLObject)NIL, var82_300 = module0032.f1742(var81_299, var80_298); NIL == module0032.f1744(var81_299, var82_300); var82_300 = module0032.f1743(var82_300)) {
                                                                        var66 = module0032.f1745(var81_299, var82_300);
                                                                        if (NIL != module0032.f1746(var82_300, var66) && NIL == module0249.f16059(var66, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var66, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (NIL != module0173.f10955(var66)) {
                                                                                f17663($ic19$, var27, var66);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var65.isList()) {
                                                                    var67 = var65;
                                                                    var68 = (SubLObject)NIL;
                                                                    var68 = var67.first();
                                                                    while (NIL != var67) {
                                                                        if (NIL == module0249.f16059(var68, module0139.$g1636$.getDynamicValue(var23))) {
                                                                            module0249.f16055(var68, module0139.$g1636$.getDynamicValue(var23));
                                                                            if (NIL != module0173.f10955(var68)) {
                                                                                f17663($ic19$, var27, var68);
                                                                            }
                                                                        }
                                                                        var67 = var67.rest();
                                                                        var68 = var67.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic87$, var65);
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
                                            var69 = (var70 = module0200.f12443(module0244.f15771(module0137.f8955($ic19$))));
                                            var71 = (SubLObject)NIL;
                                            var71 = var70.first();
                                            while (NIL != var70) {
                                                var34_293 = module0137.$g1605$.currentBinding(var23);
                                                var35_289 = module0141.$g1674$.currentBinding(var23);
                                                try {
                                                    module0137.$g1605$.bind(var71, var23);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var23)) : module0141.$g1674$.getDynamicValue(var23)), var23);
                                                    var72 = module0228.f15229(var194_282);
                                                    if (NIL != module0138.f8992(var72)) {
                                                        var73 = module0242.f15664(var72, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var73) {
                                                            var74 = module0245.f15834(var73, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var74) {
                                                                for (var75 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                                                                    var23.resetMultipleValues();
                                                                    var76 = module0066.f4839(var75);
                                                                    var77 = var23.secondMultipleValue();
                                                                    var23.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var76)) {
                                                                        var34_294 = module0138.$g1623$.currentBinding(var23);
                                                                        try {
                                                                            module0138.$g1623$.bind(var76, var23);
                                                                            for (var46_295 = module0066.f4838(module0067.f4891(var77)); NIL == module0066.f4841(var46_295); var46_295 = module0066.f4840(var46_295)) {
                                                                                var23.resetMultipleValues();
                                                                                var78 = module0066.f4839(var46_295);
                                                                                var79 = var23.secondMultipleValue();
                                                                                var23.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var78)) {
                                                                                    var34_295 = module0138.$g1624$.currentBinding(var23);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var78, var23);
                                                                                        var80 = var79;
                                                                                        if (NIL != module0077.f5302(var80)) {
                                                                                            var80_299 = module0077.f5333(var80);
                                                                                            for (var81_300 = module0032.f1741(var80_299), var82_301 = (SubLObject)NIL, var82_301 = module0032.f1742(var81_300, var80_299); NIL == module0032.f1744(var81_300, var82_301); var82_301 = module0032.f1743(var82_301)) {
                                                                                                var81 = module0032.f1745(var81_300, var82_301);
                                                                                                if (NIL != module0032.f1746(var82_301, var81) && NIL == module0249.f16059(var81, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var81, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var81, var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var80.isList()) {
                                                                                            var82 = var80;
                                                                                            var83 = (SubLObject)NIL;
                                                                                            var83 = var82.first();
                                                                                            while (NIL != var82) {
                                                                                                if (NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var83, var32);
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic87$, var80);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var72, (SubLObject)UNPROVIDED)) {
                                                        var84 = (var4_308 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var23), module0137.f8955((SubLObject)UNPROVIDED))));
                                                        var85 = (SubLObject)NIL;
                                                        var85 = var4_308.first();
                                                        while (NIL != var4_308) {
                                                            var34_296 = module0138.$g1625$.currentBinding(var23);
                                                            try {
                                                                module0138.$g1625$.bind(var85, var23);
                                                                var86 = (var87 = Functions.funcall(var85, var72));
                                                                if (NIL != module0077.f5302(var87)) {
                                                                    var80_300 = module0077.f5333(var87);
                                                                    for (var81_301 = module0032.f1741(var80_300), var82_302 = (SubLObject)NIL, var82_302 = module0032.f1742(var81_301, var80_300); NIL == module0032.f1744(var81_301, var82_302); var82_302 = module0032.f1743(var82_302)) {
                                                                        var88 = module0032.f1745(var81_301, var82_302);
                                                                        if (NIL != module0032.f1746(var82_302, var88) && NIL == module0249.f16059(var88, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var88, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var88, var32);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var87.isList()) {
                                                                    var89 = var87;
                                                                    var90 = (SubLObject)NIL;
                                                                    var90 = var89.first();
                                                                    while (NIL != var89) {
                                                                        if (NIL == module0249.f16059(var90, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var90, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var90, var32);
                                                                        }
                                                                        var89 = var89.rest();
                                                                        var90 = var89.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic87$, var87);
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
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic89$, var28, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17660() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f17635($ic19$);
        if (NIL != module0173.f10976(var24)) {
            final SubLObject var25 = var24;
            SubLObject var26 = module0173.f10998(var25);
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_325 = var26;
                if (NIL == module0065.f4775(var166_325, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_325);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var31 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = constants_high_oc.f10752(var31);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic19$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_326 = var26;
                if (NIL == module0065.f4777(var174_326)) {
                    final SubLObject var38 = module0065.f4738(var174_326);
                    SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var39 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = constants_high_oc.f10752(var39);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic19$, var47, var43);
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
            if (NIL == module0065.f4772(var26, (SubLObject)$ic90$)) {
                final SubLObject var166_326 = var26;
                if (NIL == module0065.f4775(var166_326, (SubLObject)$ic90$)) {
                    final SubLObject var27 = module0065.f4740(var166_326);
                    final SubLObject var28 = (SubLObject)NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var48;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)NIL, var30 = (SubLObject)ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER)) {
                        var48 = ((NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var48);
                        if (NIL == module0065.f4749(var32) || NIL == module0065.f4773((SubLObject)$ic90$)) {
                            if (NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)$ic90$;
                            }
                            var33 = module0167.f10832(var48);
                            if (NIL != var33) {
                                var34 = module0077.f5333(var32);
                                for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                    var37 = module0032.f1745(var35, var36);
                                    if (NIL != module0032.f1746(var36, var37)) {
                                        f17664($ic19$, var37, var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var174_327 = var26;
                if (NIL == module0065.f4777(var174_327)) {
                    final SubLObject var38 = module0065.f4738(var174_327);
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var40 = (SubLObject)NIL;
                    final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                    try {
                        while (Hashtables.iteratorHasNext(var41)) {
                            final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                            var49 = Hashtables.getEntryKey(var42);
                            var40 = Hashtables.getEntryValue(var42);
                            final SubLObject var43 = module0167.f10832(var49);
                            if (NIL != var43) {
                                final SubLObject var44 = module0077.f5333(var40);
                                SubLObject var45;
                                SubLObject var46;
                                SubLObject var47;
                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                    var47 = module0032.f1745(var45, var46);
                                    if (NIL != module0032.f1746(var46, var47)) {
                                        f17664($ic19$, var47, var43);
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
            for (var50 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                var23.resetMultipleValues();
                final SubLObject var51 = module0066.f4839(var50);
                final SubLObject var52 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                final SubLObject var53 = module0077.f5333(var52);
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                    var56 = module0032.f1745(var54, var55);
                    if (NIL != module0032.f1746(var55, var56)) {
                        f17664($ic19$, var51, var56);
                    }
                }
            }
            module0066.f4842(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17668(final SubLObject var88) {
        f17671(var88, $ic26$, $ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17678(final SubLObject var88) {
        f17681($ic19$, var88);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17693(final SubLObject var18) {
        f17601($ic19$, var18, (SubLObject)T);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17695() {
        $g2531$ = SubLFiles.deflexical("S#20251", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2531$.getGlobalValue() : NIL));
        $g2532$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES*", (SubLObject)$ic1$);
        $g2533$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES-SET*", module0078.f5367($g2532$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2534$ = SubLFiles.deflexical("S#20252", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2534$.getGlobalValue() : NIL));
        $g2535$ = SubLFiles.deflexical("S#20253", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2535$.getGlobalValue() : NIL));
        $g2536$ = SubLFiles.deflexical("S#20254", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2536$.getGlobalValue() : NIL));
        $g2537$ = SubLFiles.deflexical("S#20255", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g2537$.getGlobalValue() : NIL));
        $g2538$ = SubLFiles.deflexical("*CACHED-GENLS*", (SubLObject)$ic6$);
        $g2539$ = SubLFiles.deflexical("*CACHED-GENLS-SET*", module0078.f5367($g2538$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2540$ = SubLFiles.deflexical("S#20256", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g2540$.getGlobalValue() : NIL));
        $g2541$ = SubLFiles.deflexical("S#20257", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g2541$.getGlobalValue() : NIL));
        $g2542$ = SubLFiles.defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)$ic9$);
        $g2543$ = SubLFiles.deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)$ic10$);
        $g2544$ = SubLFiles.defconstant("S#20258", (SubLObject)$ic11$);
        $g2545$ = SubLFiles.deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", (SubLObject)$ic12$);
        $g2546$ = SubLFiles.deflexical("*CACHED-ISAS*", ConsesLow.append($g2542$.getGlobalValue(), $g2543$.getGlobalValue(), $g2544$.getGlobalValue(), $g2545$.getGlobalValue()));
        $g2547$ = SubLFiles.deflexical("*CACHED-ISAS-SET*", module0078.f5367(Sequences.reverse($g2546$.getGlobalValue()), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2548$ = SubLFiles.deflexical("S#20259", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g2548$.getGlobalValue() : NIL));
        $g2549$ = SubLFiles.deflexical("S#20260", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g2549$.getGlobalValue() : NIL));
        $g2550$ = SubLFiles.deflexical("S#20261", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g2550$.getGlobalValue() : NIL));
        $g2551$ = SubLFiles.deflexical("S#20262", (SubLObject)$ic18$);
        $g2552$ = SubLFiles.deflexical("S#20263", module0078.f5367(Sequences.reverse($g2551$.getGlobalValue()), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2553$ = SubLFiles.deflexical("S#20264", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic20$)) ? $g2553$.getGlobalValue() : NIL));
        $g2554$ = SubLFiles.deflexical("S#20265", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic21$)) ? $g2554$.getGlobalValue() : NIL));
        $g2555$ = SubLFiles.deflexical("S#20266", (SubLObject)$ic22$);
        $g2556$ = SubLFiles.defparameter("S#20267", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17696() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic15$);
        module0003.f57((SubLObject)$ic16$);
        module0003.f57((SubLObject)$ic17$);
        module0003.f57((SubLObject)$ic20$);
        module0003.f57((SubLObject)$ic21$);
        return (SubLObject)NIL;
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
        $g2531$ = null;
        $g2532$ = null;
        $g2533$ = null;
        $g2534$ = null;
        $g2535$ = null;
        $g2536$ = null;
        $g2537$ = null;
        $g2538$ = null;
        $g2539$ = null;
        $g2540$ = null;
        $g2541$ = null;
        $g2542$ = null;
        $g2543$ = null;
        $g2544$ = null;
        $g2545$ = null;
        $g2546$ = null;
        $g2547$ = null;
        $g2548$ = null;
        $g2549$ = null;
        $g2550$ = null;
        $g2551$ = null;
        $g2552$ = null;
        $g2553$ = null;
        $g2554$ = null;
        $g2555$ = null;
        $g2556$ = null;
        $ic0$ = makeSymbol("S#20251", "CYC");
        $ic1$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("conceptuallyRelated")), constant_handles_oc.f8479((SubLObject)makeString("equals")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), constant_handles_oc.f8479((SubLObject)makeString("termStrings")));
        $ic2$ = makeSymbol("S#20252", "CYC");
        $ic3$ = makeSymbol("S#20253", "CYC");
        $ic4$ = makeSymbol("S#20254", "CYC");
        $ic5$ = makeSymbol("S#20255", "CYC");
        $ic6$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion")), constant_handles_oc.f8479((SubLObject)makeString("CycLExpression")), constant_handles_oc.f8479((SubLObject)makeString("CycLFormula")), constant_handles_oc.f8479((SubLObject)makeString("CycLIndexedTerm")), constant_handles_oc.f8479((SubLObject)makeString("CycLReifiableDenotationalTerm")), constant_handles_oc.f8479((SubLObject)makeString("CycLSentence")), constant_handles_oc.f8479((SubLObject)makeString("CycLSentence-Askable")), constant_handles_oc.f8479((SubLObject)makeString("CycLSentence-Assertible")), constant_handles_oc.f8479((SubLObject)makeString("Microtheory")), constant_handles_oc.f8479((SubLObject)makeString("SubLList")) });
        $ic7$ = makeSymbol("S#20256", "CYC");
        $ic8$ = makeSymbol("S#20257", "CYC");
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Collection")), constant_handles_oc.f8479((SubLObject)makeString("Predicate")), constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational")), constant_handles_oc.f8479((SubLObject)makeString("Microtheory")));
        $ic10$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("AntiSymmetricBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("AntiTransitiveBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ArgTypeBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ArgTypeTernaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("AsymmetricBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("BookkeepingPredicate")), constant_handles_oc.f8479((SubLObject)makeString("BroadMicrotheory")), constant_handles_oc.f8479((SubLObject)makeString("CalendarCoveringType")), constant_handles_oc.f8479((SubLObject)makeString("CommutativeRelation")), constant_handles_oc.f8479((SubLObject)makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")), constant_handles_oc.f8479((SubLObject)makeString("DefaultMonotonicPredicate")), constant_handles_oc.f8479((SubLObject)makeString("DisjointCollectionType")), constant_handles_oc.f8479((SubLObject)makeString("DistributingMetaKnowledgePredicate")), constant_handles_oc.f8479((SubLObject)makeString("DocumentationPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ELRelation")), constant_handles_oc.f8479((SubLObject)makeString("EvaluatableFunction")), constant_handles_oc.f8479((SubLObject)makeString("EvaluatablePredicate")), constant_handles_oc.f8479((SubLObject)makeString("EvaluatableRelation-Contextualized")), constant_handles_oc.f8479((SubLObject)makeString("ExistentialQuantifier")), constant_handles_oc.f8479((SubLObject)makeString("ExistentialQuantifier-Bounded")), constant_handles_oc.f8479((SubLObject)makeString("IrreflexiveBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("LogicalConnective")), constant_handles_oc.f8479((SubLObject)makeString("MicrotheoryDesignatingRelation")), constant_handles_oc.f8479((SubLObject)makeString("PartiallyCommutativePredicate")), constant_handles_oc.f8479((SubLObject)makeString("PartiallyCommutativeRelation")), constant_handles_oc.f8479((SubLObject)makeString("ProblemSolvingCntxt")), constant_handles_oc.f8479((SubLObject)makeString("Quantifier")), constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ReifiableFunction")), constant_handles_oc.f8479((SubLObject)makeString("RuleMacroPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ScopingRelation")), constant_handles_oc.f8479((SubLObject)makeString("SiblingDisjointCollectionType")), constant_handles_oc.f8479((SubLObject)makeString("SkolemFunction")), constant_handles_oc.f8479((SubLObject)makeString("SymmetricBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("TransitiveBinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("TruthFunction")), constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasure")), constant_handles_oc.f8479((SubLObject)makeString("UnknownScalarInterval")), constant_handles_oc.f8479((SubLObject)makeString("VariableArityRelation")), constant_handles_oc.f8479((SubLObject)makeString("FirstOrderCollection")), constant_handles_oc.f8479((SubLObject)makeString("SecondOrderCollection")), constant_handles_oc.f8479((SubLObject)makeString("ThirdOrderCollection")), constant_handles_oc.f8479((SubLObject)makeString("FourthOrderCollection")), constant_handles_oc.f8479((SubLObject)makeString("CollectionDenotingFunction")) });
        $ic11$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("CSQLComparisonPredicate")), constant_handles_oc.f8479((SubLObject)makeString("CSQLConstantFunction")), constant_handles_oc.f8479((SubLObject)makeString("CSQLFunction")), constant_handles_oc.f8479((SubLObject)makeString("CSQLLogicalConnective")), constant_handles_oc.f8479((SubLObject)makeString("CSQLQuantifier")), constant_handles_oc.f8479((SubLObject)makeString("CytologicalProcessProjectKBContentTestQuery")), constant_handles_oc.f8479((SubLObject)makeString("NLDefinitenessAttribute")), constant_handles_oc.f8479((SubLObject)makeString("NLQuantAttribute")), constant_handles_oc.f8479((SubLObject)makeString("NLSemanticPredicate")), constant_handles_oc.f8479((SubLObject)makeString("ProperNamePredicate-Strict")), constant_handles_oc.f8479((SubLObject)makeString("SKSIContentMicrotheory")), constant_handles_oc.f8479((SubLObject)makeString("SKSIExternalTermDenotingFunction")), constant_handles_oc.f8479((SubLObject)makeString("SKSISupportedComparisonPredicate")), constant_handles_oc.f8479((SubLObject)makeString("SKSISupportedConstant")), constant_handles_oc.f8479((SubLObject)makeString("SKSISupportedFunction")), constant_handles_oc.f8479((SubLObject)makeString("SpeechPart")) });
        $ic12$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Relation")));
        $ic13$ = makeSymbol("FORT-P");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic15$ = makeSymbol("S#20259", "CYC");
        $ic16$ = makeSymbol("S#20260", "CYC");
        $ic17$ = makeSymbol("S#20261", "CYC");
        $ic18$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTerm")), constant_handles_oc.f8479((SubLObject)makeString("LogicalFieldIndexical")), constant_handles_oc.f8479((SubLObject)makeString("NonSkolemIndeterminateTerm")), constant_handles_oc.f8479((SubLObject)makeString("PhysicalFieldIndexical")), constant_handles_oc.f8479((SubLObject)makeString("TermExemptFromUniqueNamesAssumption")), constant_handles_oc.f8479((SubLObject)makeString("TermAcceptableForQuerySearch-TriggerOnly")));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic20$ = makeSymbol("S#20264", "CYC");
        $ic21$ = makeSymbol("S#20265", "CYC");
        $ic22$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11392", "CYC"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic24$ = makeSymbol("S#708", "CYC");
        $ic25$ = makeSymbol("S#20172", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic29$ = makeString("*sbhl-cache-misses-hash-table* is not a hash table");
        $ic30$ = makeString("~A: ~S~%");
        $ic31$ = makeSymbol(">");
        $ic32$ = makeSymbol("S#16712", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#20268", "CYC"), (SubLObject)makeSymbol("S#20269", "CYC"), (SubLObject)makeSymbol("S#20270", "CYC"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic34$ = makeUninternedSymbol("US#764E76D");
        $ic35$ = makeSymbol("DO-DICTIONARY");
        $ic36$ = makeSymbol("S#20181", "CYC");
        $ic37$ = makeSymbol("PWHEN");
        $ic38$ = makeSymbol("S#6424", "CYC");
        $ic39$ = makeSymbol("CLET");
        $ic40$ = makeSymbol("DICTIONARY-LOOKUP");
        $ic41$ = makeSymbol("HLMT-EQUAL");
        $ic42$ = makeString("Initializing SBHL cache for ");
        $ic43$ = makeString(".");
        $ic44$ = makeString("Adding ");
        $ic45$ = makeString(" to SBHL cache for ");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15352", "CYC"), (SubLObject)makeSymbol("S#20271", "CYC"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic47$ = makeUninternedSymbol("US#5E7BF0F");
        $ic48$ = makeUninternedSymbol("US#13E5957");
        $ic49$ = makeUninternedSymbol("US#7063A5B");
        $ic50$ = makeSymbol("S#20190", "CYC");
        $ic51$ = makeSymbol("PIF");
        $ic52$ = makeSymbol("S#13757", "CYC");
        $ic53$ = makeSymbol("S#13790", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#20272", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#20270", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = makeUninternedSymbol("US#7063A5B");
        $ic56$ = makeUninternedSymbol("US#1C6BDEC");
        $ic57$ = makeSymbol("MEMBER?");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#20272", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#20270", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic59$ = makeUninternedSymbol("US#7063A5B");
        $ic60$ = makeUninternedSymbol("US#5E7BF0F");
        $ic61$ = makeSymbol("S#20188", "CYC");
        $ic62$ = makeSymbol("S#20171", "CYC");
        $ic63$ = makeSymbol("S#3287", "CYC");
        $ic64$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("LogicalConnective"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("Quantifier"));
        $ic70$ = makeString("Computing all-mts SBHL caches.");
        $ic71$ = makeString("Computing SBHL caches from all-mts caches.");
        $ic72$ = makeSymbol("S#12274", "CYC");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic74$ = makeKeyword("TRUE");
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic76$ = makeKeyword("DEPTH");
        $ic77$ = makeKeyword("STACK");
        $ic78$ = makeKeyword("QUEUE");
        $ic79$ = makeSymbol("S#11450", "CYC");
        $ic80$ = makeKeyword("ERROR");
        $ic81$ = makeString("~A is not a ~A");
        $ic82$ = makeSymbol("S#11592", "CYC");
        $ic83$ = makeKeyword("CERROR");
        $ic84$ = makeString("continue anyway");
        $ic85$ = makeKeyword("WARN");
        $ic86$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic87$ = makeString("~A is neither SET-P nor LISTP.");
        $ic88$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic89$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic90$ = makeKeyword("SKIP");
        $ic91$ = makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");
        $ic92$ = makeSymbol("S#20232", "CYC");
        $ic93$ = makeKeyword("BREADTH");
        $ic94$ = makeSymbol("S#20245", "CYC");
        $ic95$ = makeSymbol("S#20250", "CYC");
        $ic96$ = makeSymbol("S#20240", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
    }
    
    public static final class $f17603$UnaryFunction extends UnaryFunction
    {
        public $f17603$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19515"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f17603(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2841 ms
	
	Decompiled with Procyon 0.5.32.
*/