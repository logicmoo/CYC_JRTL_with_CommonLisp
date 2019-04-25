package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0370 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0370";
    public static final String myFingerPrint = "fa24a13b375a54a7c7113fc3af66329e95a1c60a2952eb2e9400b0773a7cdda2";
    private static SubLSymbol $g3153$;
    private static SubLSymbol $g3154$;
    private static SubLSymbol $g3155$;
    private static SubLSymbol $g3156$;
    private static SubLSymbol $g3157$;
    private static SubLSymbol $g3158$;
    private static SubLSymbol $g3159$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLList $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    
    public static SubLObject f25838(SubLObject var1) {
        var1 = conses_high.copy_tree(var1);
        final SubLObject var2 = f25839(var1);
        final SubLObject var3 = f25840(var2);
        final SubLObject var4 = f25841(var3);
        final SubLObject var5 = f25842(var4);
        return f25843(var5);
    }
    
    public static SubLObject f25841(SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var6;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            SubLObject var11 = module0232.f15306(var10);
            if (NIL != var11 && NIL == module0035.f1997(var11)) {
                var7.resetMultipleValues();
                final SubLObject var12 = f25844(var11);
                final SubLObject var13 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                module0232.f15307(var10, var12);
                if (NIL != var13) {
                    var8 = (SubLObject)T;
                }
            }
            var11 = module0232.f15308(var10);
            if (NIL != var11 && NIL == module0035.f1997(var11)) {
                var7.resetMultipleValues();
                final SubLObject var12 = f25844(var11);
                final SubLObject var13 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                module0232.f15309(var10, var12);
                if (NIL != var13) {
                    var8 = (SubLObject)T;
                }
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        if (NIL != var8) {
            var6 = f25840(var6);
        }
        return var6;
    }
    
    public static SubLObject f25842(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var6)) {
            return var6;
        }
        var7.resetMultipleValues();
        SubLObject var8 = f25845(var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var9) {
            var8 = f25840(var8);
        }
        return var8;
    }
    
    public static SubLObject f25844(final SubLObject var11) {
        final SubLObject var12 = Sequences.length(var11);
        final SubLObject var13 = module0035.f2288(var11, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var14 = Sequences.length(var13);
        final SubLObject var15 = Numbers.numL(var14, var12);
        return Values.values(var13, var15);
    }
    
    public static SubLObject f25845(final SubLObject var17) {
        final SubLObject var18 = Sequences.length(var17);
        final SubLObject var19 = module0035.f2288(var17, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var20 = Sequences.length(var19);
        final SubLObject var21 = Numbers.numL(var20, var18);
        return Values.values(var19, var21);
    }
    
    public static SubLObject f25839(final SubLObject var6) {
        SubLObject var7 = var6;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            f25846(var8);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f25846(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22;
        SubLObject var23;
        for (var22 = (SubLObject)NIL, var22 = f25847(var20); !var22.isAtom(); var22 = var22.rest()) {
            var23 = var22.first();
            if (NIL != module0202.f12889(module0362.f24436(var23))) {
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
            else {
                ConsesLow.rplaca(var22, f25848(var23));
            }
        }
        if (NIL != var21) {
            SubLObject var24 = f25847(var20);
            SubLObject var25 = var21;
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                var24 = Sequences.delete(var26, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var25 = var25.rest();
                var26 = var25.first();
            }
            module0232.f15307(var20, var24);
            final SubLObject var27 = module0035.f2076((SubLObject)$ic0$, var21);
            module0232.f15309(var20, ConsesLow.nconc(var27, f25849(var20)));
        }
        SubLObject var28;
        SubLObject var29;
        for (var28 = (SubLObject)NIL, var28 = f25849(var20); !var28.isAtom(); var28 = var28.rest()) {
            var29 = var28.first();
            ConsesLow.rplaca(var28, f25848(var29));
        }
        return var20;
    }
    
    public static SubLObject f25850(final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)$ic1$);
        var29 = var28.first();
        SubLObject var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic1$);
        var30 = var31.first();
        var31 = var31.rest();
        if (NIL == var31) {
            final SubLObject var32 = module0205.f13379(var30, (SubLObject)UNPROVIDED);
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            if (NIL != module0201.f12584(var32)) {
                var34 = var28;
            }
            else if (var32.eql($ic2$)) {
                var33 = $ic3$;
                var34 = f25851((SubLObject)ConsesLow.list($ic4$, var33), var29);
            }
            else {
                var34 = f25851((SubLObject)ConsesLow.list($ic4$, f25852(module0205.f13338(var32), var29, (SubLObject)UNPROVIDED)), var29);
            }
            return f25848(var34);
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25852(final SubLObject var36, final SubLObject var31, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0146.$g2017$.currentBinding(var38);
        final SubLObject var41 = module0146.$g2025$.currentBinding(var38);
        try {
            module0146.$g2017$.bind((SubLObject)NIL, var38);
            module0146.$g2025$.bind(var37, var38);
            var39 = module0282.f18738(var36, var31);
        }
        finally {
            module0146.$g2025$.rebind(var41, var38);
            module0146.$g2017$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f25848(final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)$ic5$);
        var29 = var28.first();
        SubLObject var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic5$);
        var30 = var31.first();
        var31 = var31.rest();
        if (NIL == var31) {
            if (NIL != module0202.f12884(var30) && NIL != module0193.f12105(module0202.f12906(var30))) {
                final SubLObject var32 = module0202.f12887(var30);
                final SubLObject var33 = module0202.f12906(var30);
                return f25851(var32, var33);
            }
            if (NIL != module0202.f12890(var30)) {
                final SubLObject var32 = module0205.f13379(var30, (SubLObject)UNPROVIDED);
                return f25851(var32, var29);
            }
            if (!$ic6$.eql(module0205.f13333(var30)) || NIL == module0337.f22628((SubLObject)$ic7$, var30)) {
                return var28;
            }
            final SubLObject var34 = module0205.f13387(var30, (SubLObject)UNPROVIDED);
            final SubLObject var35 = module0205.f13387(module0205.f13388(var30, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            final SubLObject var36 = module0205.f13388(module0205.f13388(var30, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0205.f13387(var36, (SubLObject)UNPROVIDED);
            final SubLObject var38 = module0205.f13388(var36, (SubLObject)UNPROVIDED);
            if (NIL != module0206.f13500(var34) && NIL != module0206.f13497(var35) && NIL != module0206.f13497(var37) && var35.eql(var37)) {
                return f25851((SubLObject)ConsesLow.list($ic8$, var34, var38), var29);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic5$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25840(final SubLObject var6) {
        if (NIL != module0035.f1997(var6)) {
            final SubLObject var7 = var6.first();
            final SubLObject var8 = f25853(var7);
            return (SubLObject)ConsesLow.list(var8);
        }
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var6;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = (SubLObject)ConsesLow.cons(f25853(var11), var9);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return f25854(var9);
    }
    
    public static SubLObject f25853(final SubLObject var20) {
        final SubLObject var21 = f25847(var20);
        final SubLObject var22 = f25849(var20);
        final SubLObject var23 = f25855(var21);
        final SubLObject var24 = f25855(var22);
        if (var21.eql(var23) && var22.eql(var24)) {
            return var20;
        }
        final SubLObject var25 = module0232.f15305(var23, var24);
        return var25;
    }
    
    public static SubLObject f25854(final SubLObject var55) {
        return Sort.sort(var55, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25855(final SubLObject var11) {
        return f25856(var11);
    }
    
    public static SubLObject f25857(final SubLObject var11) {
        return Sort.sort(var11, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25858(final SubLObject var56, final SubLObject var57) {
        return f25859(var56, var57);
    }
    
    public static SubLObject f25860(final SubLObject var58, final SubLObject var59) {
        return f25859(var58, var59);
    }
    
    public static SubLObject f25859(final SubLObject var62, final SubLObject var63) {
        return f25861(var62, var63);
    }
    
    public static SubLObject f25861(final SubLObject var64, final SubLObject var65) {
        if (NIL != module0202.f12729(var64, var65, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12731(var64, var65, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var66 = module0202.f12714(var64);
        final SubLObject var67 = module0202.f12714(var65);
        if (NIL == var66 && NIL != var67) {
            return (SubLObject)T;
        }
        if (NIL != var66 && NIL == var67) {
            return (SubLObject)NIL;
        }
        final SubLObject var68 = module0205.f13180(var64, (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0205.f13180(var65, (SubLObject)UNPROVIDED);
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71_72 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var74_75 = (SubLObject)NIL;
        var70 = var68;
        var71_72 = var70.first();
        var71 = var69;
        var74_75 = var71.first();
        while (NIL != var71 || NIL != var70) {
            if (NIL != f25862(var71_72, var74_75)) {
                return (SubLObject)T;
            }
            if (NIL != f25863(var71_72, var74_75)) {
                return (SubLObject)NIL;
            }
            var70 = var70.rest();
            var71_72 = var70.first();
            var71 = var71.rest();
            var74_75 = var71.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25862(final SubLObject var71, final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        if (var71.eql(var74)) {
            return (SubLObject)NIL;
        }
        final SubLObject var76 = f25864(var71);
        final SubLObject var77 = f25864(var74);
        if (var76.numL(var77)) {
            return (SubLObject)T;
        }
        if (var76.numG(var77)) {
            return (SubLObject)NIL;
        }
        if (NIL != constant_handles_oc.f8449(var71)) {
            return f25865(var71, var74);
        }
        if (NIL != module0167.f10813(var71)) {
            return f25866(var71, var74);
        }
        if (NIL != f25867(var71)) {
            return Numbers.numL(f25868(var71), f25868(var74));
        }
        if (NIL != module0193.f12067(var71)) {
            if (NIL != $g3153$.getDynamicValue(var75)) {
                return (SubLObject)NIL;
            }
            return Numbers.numL(module0193.f12073(var71), module0193.f12073(var74));
        }
        else {
            if (NIL != module0201.f12546(var71)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0201.f12568(var71)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0202.f12590(var71)) {
                return f25861(var71, var74);
            }
            if (var71.isNumber()) {
                return Numbers.numL(var71, var74);
            }
            if (var71.isString()) {
                return Strings.stringL(var71, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var71.isSymbol()) {
                return Strings.stringL(Symbols.symbol_name(var71), Symbols.symbol_name(var74), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var71.isChar()) {
                return Characters.charL(var71, var74);
            }
            if (NIL != assertion_handles_oc.f11035(var71)) {
                return f25862(module0538.f33367(var71, (SubLObject)UNPROVIDED), module0538.f33367(var74, (SubLObject)UNPROVIDED));
            }
            Errors.error((SubLObject)$ic11$, var71);
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f25863(final SubLObject var71, final SubLObject var74) {
        return f25862(var74, var71);
    }
    
    public static SubLObject f25864(final SubLObject var78) {
        if (NIL != constant_handles_oc.f8449(var78)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != module0167.f10813(var78)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL != f25867(var78)) {
            return (SubLObject)ELEVEN_INTEGER;
        }
        if (NIL != module0193.f12067(var78)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (NIL != module0201.f12546(var78)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (NIL != module0201.f12568(var78)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (NIL != module0202.f12590(var78)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var78.isNumber()) {
            return (SubLObject)SIX_INTEGER;
        }
        if (var78.isString()) {
            return (SubLObject)SEVEN_INTEGER;
        }
        if (var78.isSymbol()) {
            return (SubLObject)EIGHT_INTEGER;
        }
        if (var78.isChar()) {
            return (SubLObject)NINE_INTEGER;
        }
        if (NIL != assertion_handles_oc.f11035(var78)) {
            return (SubLObject)TEN_INTEGER;
        }
        Errors.error((SubLObject)$ic12$, var78);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25865(final SubLObject var79, final SubLObject var80) {
        final SubLObject var81 = constant_handles_oc.f8440(var79);
        final SubLObject var82 = constant_handles_oc.f8440(var80);
        return Numbers.numL(var81, var82);
    }
    
    public static SubLObject f25866(final SubLObject var83, final SubLObject var84) {
        final SubLObject var85 = module0167.f10803(var83);
        final SubLObject var86 = module0167.f10803(var84);
        return Numbers.numL(var85, var86);
    }
    
    public static SubLObject f25869(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0035.f2292($g3154$.getDynamicValue(var86)) && NIL != module0206.f13500(var85) && NIL == module0035.f2302($g3154$.getDynamicValue(var86), var85, Symbols.symbol_function((SubLObject)EQL)));
    }
    
    public static SubLObject f25867(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0035.f2292($g3154$.getDynamicValue(var86)) && NIL != module0206.f13500(var85) && NIL != module0035.f2302($g3154$.getDynamicValue(var86), var85, Symbols.symbol_function((SubLObject)EQL)));
    }
    
    public static SubLObject f25870(final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL == module0035.f2439((SubLObject)$ic13$, var86, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f25868(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        return module0035.f2294($g3154$.getDynamicValue(var88), var87, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25871(final SubLObject var87) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, f25868(var87));
    }
    
    public static SubLObject f25872(final SubLObject var85) {
        return module0035.f2523(var85, (SubLObject)$ic14$);
    }
    
    public static SubLObject f25873(final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        return module0035.f2304($g3154$.getDynamicValue(var89), conses_high.second(var88), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25874(final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)NIL;
        final SubLObject var92 = module0035.f2294($g3156$.getDynamicValue(var90), var89, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic15$);
        if ($ic15$ == var92) {
            var91 = (SubLObject)makeBoolean(NIL != module0193.f12067(var89) || NIL != module0269.f17699(var89, $ic16$) || NIL != module0269.f17699(var89, $ic17$));
            $g3156$.setDynamicValue(module0035.f2063($g3156$.getDynamicValue(var90), var89, var91, Symbols.symbol_function((SubLObject)EQL)), var90);
        }
        else {
            var91 = var92;
        }
        return var91;
    }
    
    public static SubLObject f25875(final SubLObject var89) {
        return (SubLObject)makeBoolean(NIL == f25874(var89));
    }
    
    public static SubLObject f25876(final SubLObject var28) {
        final SubLObject var29 = module0362.f24436(var28);
        final SubLObject var30 = module0205.f13333(var29);
        return f25875(var30);
    }
    
    public static SubLObject f25877(final SubLObject var28) {
        final SubLObject var29 = module0362.f24436(var28);
        final SubLObject var30 = module0205.f13333(var29);
        return f25874(var30);
    }
    
    public static SubLObject f25856(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = $g3154$.currentBinding(var12);
        final SubLObject var15 = $g3155$.currentBinding(var12);
        final SubLObject var16 = $g3156$.currentBinding(var12);
        try {
            $g3154$.bind((SubLObject)NIL, var12);
            $g3155$.bind((SubLObject)ZERO_INTEGER, var12);
            $g3156$.bind((SubLObject)NIL, var12);
            var13 = f25878((SubLObject)NIL, var11);
        }
        finally {
            $g3156$.rebind(var16, var12);
            $g3155$.rebind(var15, var12);
            $g3154$.rebind(var14, var12);
        }
        return var13;
    }
    
    public static SubLObject f25878(SubLObject var93, SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        while (NIL == var96) {
            if (NIL == var94) {
                var96 = (SubLObject)T;
            }
            else {
                var95.resetMultipleValues();
                final SubLObject var98 = f25879(var94, var97);
                final SubLObject var99 = var95.secondMultipleValue();
                var95.resetMultipleValues();
                var97 = var99;
                var93 = ConsesLow.nconc(var93, var98);
                var94 = conses_high.set_difference(var94, var98, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                if (NIL == var94) {
                    continue;
                }
                f25880(var98);
            }
        }
        return var93;
    }
    
    public static SubLObject f25879(final SubLObject var94, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var94)) {
            return Values.values(conses_high.copy_list(var94), (SubLObject)NIL);
        }
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)T;
        if (NIL == var99) {
            var101 = f25881(var94);
        }
        if (NIL != var101) {
            var102 = (SubLObject)T;
        }
        else {
            var101 = f25882(var94);
        }
        if (NIL == var101) {
            var101 = f25883(var94);
        }
        if (NIL == var101) {
            var101 = var94;
            var103 = (SubLObject)NIL;
        }
        final SubLObject var104 = $g3153$.currentBinding(var100);
        try {
            $g3153$.bind(var103, var100);
            var101 = f25857(var101);
        }
        finally {
            $g3153$.rebind(var104, var100);
        }
        return Values.values(var101, var102);
    }
    
    public static SubLObject f25881(final SubLObject var94) {
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = var94;
        SubLObject var97 = (SubLObject)NIL;
        var97 = var96.first();
        while (NIL != var96) {
            if (NIL != f25870(var97) && NIL != f25876(var97)) {
                var95 = (SubLObject)ConsesLow.cons(var97, var95);
            }
            var96 = var96.rest();
            var97 = var96.first();
        }
        return var95;
    }
    
    public static SubLObject f25884(SubLObject var104) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)NIL;
        }
        return $g3157$.getGlobalValue();
    }
    
    public static SubLObject f25885(final SubLObject var28) {
        final SubLObject var29 = module0362.f24437(var28);
        if (NIL != module0193.f12067(var29)) {
            return $g3157$.getGlobalValue();
        }
        return var29;
    }
    
    public static SubLObject f25882(final SubLObject var94) {
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = var94;
        SubLObject var97 = (SubLObject)NIL;
        var97 = var96.first();
        while (NIL != var96) {
            if (NIL != f25877(var97)) {
                var95 = module0035.f2313(var95, f25885(var97), var97, Symbols.symbol_function((SubLObject)EQ));
            }
            var96 = var96.rest();
            var97 = var96.first();
        }
        if (NIL == var95) {
            return (SubLObject)NIL;
        }
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var99 = var95;
        SubLObject var100 = (SubLObject)NIL;
        var100 = var99.first();
        while (NIL != var99) {
            SubLObject var102;
            final SubLObject var101 = var102 = var100;
            SubLObject var103 = (SubLObject)NIL;
            SubLObject var104 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic20$);
            var103 = var102.first();
            var102 = (var104 = var102.rest());
            if (NIL != module0035.f1997(var104)) {
                var98 = (SubLObject)ConsesLow.cons(module0035.f2113(var104), var98);
            }
            var99 = var99.rest();
            var100 = var99.first();
        }
        if (NIL == var98) {
            SubLObject var105 = (SubLObject)NIL;
            SubLObject var106 = var95;
            SubLObject var107 = (SubLObject)NIL;
            var107 = var106.first();
            while (NIL != var106) {
                SubLObject var109;
                final SubLObject var108 = var109 = var107;
                SubLObject var110 = (SubLObject)NIL;
                SubLObject var111 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)$ic20$);
                var110 = var109.first();
                var109 = var109.rest();
                SubLObject var9_114;
                var111 = (var9_114 = var109);
                SubLObject var112 = (SubLObject)NIL;
                var112 = var9_114.first();
                while (NIL != var9_114) {
                    var105 = module0035.f2313(var105, module0205.f13316(var112), var112, Symbols.symbol_function((SubLObject)EQUAL));
                    var9_114 = var9_114.rest();
                    var112 = var9_114.first();
                }
                var106 = var106.rest();
                var107 = var106.first();
            }
            var106 = var105;
            var107 = (SubLObject)NIL;
            var107 = var106.first();
            while (NIL != var106) {
                SubLObject var114;
                final SubLObject var113 = var114 = var107;
                SubLObject var110 = (SubLObject)NIL;
                SubLObject var111 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic20$);
                var110 = var114.first();
                var114 = (var111 = var114.rest());
                if (NIL != module0035.f1997(var111)) {
                    var98 = (SubLObject)ConsesLow.cons(module0035.f2113(var111), var98);
                }
                var106 = var106.rest();
                var107 = var106.first();
            }
        }
        return var98;
    }
    
    public static SubLObject f25883(final SubLObject var94) {
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = var94;
        SubLObject var98 = (SubLObject)NIL;
        var98 = var97.first();
        while (NIL != var97) {
            if (NIL != f25876(var98)) {
                final SubLObject var99 = module0036.f2531(var98, (SubLObject)$ic13$, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
                final SubLObject var100 = conses_high.assoc(var99, var96, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                if (NIL != var100) {
                    ConsesLow.rplacd(var100, (SubLObject)$ic22$);
                }
                else {
                    final SubLObject var101 = (SubLObject)ConsesLow.cons(var99, var98);
                    var96 = (SubLObject)ConsesLow.cons(var101, var96);
                }
            }
            var97 = var97.rest();
            var98 = var97.first();
        }
        var97 = var96;
        SubLObject var102 = (SubLObject)NIL;
        var102 = var97.first();
        while (NIL != var97) {
            SubLObject var104;
            final SubLObject var103 = var104 = var102;
            SubLObject var105 = (SubLObject)NIL;
            SubLObject var106 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic23$);
            var105 = var104.first();
            var104 = (var106 = var104.rest());
            if ($ic22$ != var106) {
                var95 = (SubLObject)ConsesLow.cons(var106, var95);
            }
            var97 = var97.rest();
            var102 = var97.first();
        }
        return var95;
    }
    
    public static SubLObject f25880(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = module0035.f2399(var124, (SubLObject)$ic24$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            if (NIL != f25869(var127)) {
                $g3154$.setDynamicValue(module0035.f2063($g3154$.getDynamicValue(var125), var127, $g3155$.getDynamicValue(var125), Symbols.symbol_function((SubLObject)EQL)), var125);
                $g3155$.setDynamicValue(Numbers.add($g3155$.getDynamicValue(var125), (SubLObject)ONE_INTEGER), var125);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25843(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12690(var6)) {
            return Values.values(var6, (SubLObject)NIL);
        }
        var7.resetMultipleValues();
        final SubLObject var8 = f25886(var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var8) {
            return Values.values(var6, f25887(var9));
        }
        final SubLObject var10 = f25888(var6);
        return Values.values(module0233.f15379(var10, var6), module0233.f15386(var10));
    }
    
    public static SubLObject f25887(final SubLObject var129) {
        return module0233.f15346(module0048.f_1X(var129));
    }
    
    public static SubLObject f25889(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        if (NIL == module0206.f13500(var85)) {
            return (SubLObject)NIL;
        }
        final SubLObject var87 = module0193.f12073(var85);
        if (var87.numLE($g3158$.getDynamicValue(var86))) {
            return (SubLObject)NIL;
        }
        if (var87.numE(module0048.f_1X($g3158$.getDynamicValue(var86)))) {
            $g3158$.setDynamicValue(var87, var86);
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f25886(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = $g3158$.currentBinding(var7);
        try {
            $g3158$.bind((SubLObject)MINUS_ONE_INTEGER, var7);
            var8 = (SubLObject)makeBoolean(NIL == module0035.f2439((SubLObject)$ic26$, var6, (SubLObject)UNPROVIDED));
            var9 = $g3158$.getDynamicValue(var7);
        }
        finally {
            $g3158$.rebind(var10, var7);
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f25890(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        if (NIL != module0206.f13500(var85)) {
            final SubLObject var87 = conses_high.assoc(var85, $g3159$.getDynamicValue(var86), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var87) {
                final SubLObject var88 = module0048.f_1X($g3158$.getDynamicValue(var86));
                final SubLObject var89 = module0193.f12075(var88);
                $g3158$.setDynamicValue(var88, var86);
                $g3159$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var85, var89), $g3159$.getDynamicValue(var86)), var86);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25888(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g3158$.currentBinding(var7);
        final SubLObject var10 = $g3159$.currentBinding(var7);
        try {
            $g3158$.bind((SubLObject)MINUS_ONE_INTEGER, var7);
            $g3159$.bind((SubLObject)NIL, var7);
            module0035.f2439((SubLObject)$ic27$, var6, (SubLObject)UNPROVIDED);
            var8 = Sequences.nreverse($g3159$.getDynamicValue(var7));
        }
        finally {
            $g3159$.rebind(var10, var7);
            $g3158$.rebind(var9, var7);
        }
        return var8;
    }
    
    public static SubLObject f25891(final SubLObject var135, final SubLObject var136, final SubLObject var137) {
        if (var135.eql((SubLObject)$ic28$)) {
            if (NIL != module0035.f2201(var136, var137, (SubLObject)UNPROVIDED)) {
                return var136;
            }
            return (SubLObject)$ic29$;
        }
        else {
            if (var135.eql((SubLObject)$ic30$)) {
                return conses_high.intersection(var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var135.eql((SubLObject)$ic31$)) {
                return conses_high.union(var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return Errors.error((SubLObject)$ic32$, var135);
        }
    }
    
    public static SubLObject f25892(final SubLObject var139, final SubLObject var31, final SubLObject var140) {
        return f25893(var139, var31, var140);
    }
    
    public static SubLObject f25894(final SubLObject var139, final SubLObject var31, final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = module0034.$g879$.getDynamicValue(var141);
        SubLObject var143 = (SubLObject)NIL;
        if (NIL == var142) {
            return f25892(var139, var31, var140);
        }
        var143 = module0034.f1857(var142, (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
        if (NIL == var143) {
            var143 = module0034.f1807(module0034.f1842(var142), (SubLObject)$ic33$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var142, (SubLObject)$ic33$, var143);
        }
        final SubLObject var144 = module0034.f1781(var139, var31, var140);
        final SubLObject var145 = module0034.f1814(var143, var144, (SubLObject)UNPROVIDED);
        if (var145 != $ic34$) {
            SubLObject var146 = var145;
            SubLObject var147 = (SubLObject)NIL;
            var147 = var146.first();
            while (NIL != var146) {
                SubLObject var148 = var147.first();
                final SubLObject var149 = conses_high.second(var147);
                if (var139.equal(var148.first())) {
                    var148 = var148.rest();
                    if (var31.equal(var148.first())) {
                        var148 = var148.rest();
                        if (NIL != var148 && NIL == var148.rest() && var140.equal(var148.first())) {
                            return module0034.f1959(var149);
                        }
                    }
                }
                var146 = var146.rest();
                var147 = var146.first();
            }
        }
        final SubLObject var150 = Values.arg2(var141.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f25892(var139, var31, var140)));
        module0034.f1836(var143, var144, var145, var150, (SubLObject)ConsesLow.list(var139, var31, var140));
        return module0034.f1959(var150);
    }
    
    public static SubLObject f25893(final SubLObject var139, SubLObject var31, final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        SubLObject var142 = (SubLObject)NIL;
        if (NIL == var31) {
            var31 = module0147.$g2095$.getDynamicValue(var141);
        }
        final SubLObject var143 = module0146.$g2019$.currentBinding(var141);
        try {
            module0146.$g2019$.bind((SubLObject)T, var141);
            var141.resetMultipleValues();
            final SubLObject var150_151 = module0285.f18909(var139, var31);
            final SubLObject var152_153 = var141.secondMultipleValue();
            var141.resetMultipleValues();
            var142 = var150_151;
            var31 = var152_153;
        }
        finally {
            module0146.$g2019$.rebind(var143, var141);
        }
        if (NIL == var142) {
            return Values.values((SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != module0206.f13427(var142)) {
            return Values.values(var142, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (!var142.isCons()) {
            Errors.error((SubLObject)$ic36$, var142);
            return (SubLObject)NIL;
        }
        SubLObject var144 = (SubLObject)NIL;
        var141.resetMultipleValues();
        final SubLObject var145 = f25895(var142, var140, var139);
        final SubLObject var146 = var141.secondMultipleValue();
        final SubLObject var147 = var141.thirdMultipleValue();
        var141.resetMultipleValues();
        if ($ic35$ == var145) {
            return Values.values((SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var148 = var145;
        SubLObject var149 = (SubLObject)NIL;
        var149 = var148.first();
        while (NIL != var148) {
            final SubLObject var150 = f25896(var149, var31, var140);
            var144 = (SubLObject)ConsesLow.cons(var150, var144);
            var148 = var148.rest();
            var149 = var148.first();
        }
        return Values.values(var144, var146, var147);
    }
    
    public static SubLObject f25895(final SubLObject var149, final SubLObject var140, final SubLObject var139) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        SubLObject var151 = (SubLObject)NIL;
        SubLObject var152 = (SubLObject)NIL;
        SubLObject var153 = (SubLObject)NIL;
        if (NIL != module0035.f1997(var149)) {
            SubLObject var154 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var149, var149, (SubLObject)$ic37$);
            var154 = var149.first();
            final SubLObject var155 = var149.rest();
            if (NIL == var155) {
                SubLObject var164_165;
                final SubLObject var162_163 = var164_165 = var154;
                SubLObject var156 = (SubLObject)NIL;
                SubLObject var157 = (SubLObject)NIL;
                SubLObject var158 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic38$);
                var156 = var164_165.first();
                var164_165 = var164_165.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic38$);
                var157 = var164_165.first();
                var164_165 = var164_165.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic38$);
                var158 = var164_165.first();
                var164_165 = var164_165.rest();
                if (NIL == var164_165) {
                    var151 = (SubLObject)ConsesLow.list(var156);
                    var152 = var157;
                    var153 = var158;
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var162_163, (SubLObject)$ic38$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)$ic37$);
            }
        }
        else {
            var150.resetMultipleValues();
            final SubLObject var167_168 = f25897(var149, var140);
            final SubLObject var169_170 = var150.secondMultipleValue();
            var150.resetMultipleValues();
            var152 = var167_168;
            var153 = var169_170;
            if (var152 == $ic35$) {
                return Values.values((SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)NIL);
            }
            SubLObject var159 = var149;
            SubLObject var160 = (SubLObject)NIL;
            var160 = var159.first();
            while (NIL != var159) {
                SubLObject var162;
                final SubLObject var161 = var162 = var160;
                SubLObject var163 = (SubLObject)NIL;
                SubLObject var164 = (SubLObject)NIL;
                SubLObject var165 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var162, var161, (SubLObject)$ic39$);
                var163 = var162.first();
                var162 = var162.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var162, var161, (SubLObject)$ic39$);
                var164 = var162.first();
                var162 = var162.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var162, var161, (SubLObject)$ic39$);
                var165 = var162.first();
                var162 = var162.rest();
                if (NIL == var162) {
                    final SubLObject var166 = module0233.f15376(var164, var163);
                    final SubLObject var167 = module0233.f15362(var152, var166);
                    var151 = (SubLObject)ConsesLow.cons(var167, var151);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var161, (SubLObject)$ic39$);
                }
                var159 = var159.rest();
                var160 = var159.first();
            }
            var151 = Sequences.nreverse(var151);
        }
        var153 = f25898(var153, var139);
        var152 = module0233.f15399(var152, var153);
        return Values.values(var151, var152, var153);
    }
    
    public static SubLObject f25897(final SubLObject var149, final SubLObject var140) {
        SubLObject var150 = (SubLObject)$ic40$;
        SubLObject var151 = (SubLObject)NIL;
        SubLObject var152 = var149;
        SubLObject var153 = (SubLObject)NIL;
        var153 = var152.first();
        while (NIL != var152) {
            SubLObject var155;
            final SubLObject var154 = var155 = var153;
            SubLObject var156 = (SubLObject)NIL;
            SubLObject var157 = (SubLObject)NIL;
            SubLObject var158 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var155, var154, (SubLObject)$ic41$);
            var156 = var155.first();
            var155 = var155.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var155, var154, (SubLObject)$ic41$);
            var157 = var155.first();
            var155 = var155.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var155, var154, (SubLObject)$ic41$);
            var158 = var155.first();
            var155 = var155.rest();
            if (NIL == var155) {
                final SubLObject var159 = module0233.f15376(var157, var158);
                final SubLObject var160 = module0233.f15372(var157);
                var151 = ConsesLow.append(var160, var151);
                if ($ic40$ == var150) {
                    var150 = var159;
                }
                else {
                    final SubLObject var161 = f25891(var140, var150, var159);
                    if ($ic29$ == var161) {
                        return Values.values((SubLObject)$ic35$, (SubLObject)NIL);
                    }
                    var150 = var161;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var154, (SubLObject)$ic41$);
            }
            var152 = var152.rest();
            var153 = var152.first();
        }
        var150 = module0035.f2269(var150, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var150 = f25899(var150);
        var151 = module0035.f2269(var151, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var151 = f25899(var151);
        SubLObject var162 = (SubLObject)NIL;
        SubLObject var163 = (SubLObject)NIL;
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)NIL;
        var163 = var151;
        var164 = var163.first();
        for (var165 = (SubLObject)ZERO_INTEGER; NIL != var163; var163 = var163.rest(), var164 = var163.first(), var165 = Numbers.add((SubLObject)ONE_INTEGER, var165)) {
            final SubLObject var166 = module0193.f12079(var165);
            var162 = module0233.f15345(var164, var166, var162);
        }
        var162 = Sequences.nreverse(var162);
        return Values.values(var162, var150);
    }
    
    public static SubLObject f25899(final SubLObject var187) {
        return Sort.sort(var187, (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25898(final SubLObject var155, final SubLObject var139) {
        final SubLObject var156 = module0035.f2399(var139, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var157 = module0035.f2344(var155, var156, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var157;
    }
    
    public static SubLObject f25900(final SubLObject var55) {
        final SubLObject var56 = f25901(var55);
        final SubLObject var57 = f25902(var55, var56);
        return Values.values(var57, var56);
    }
    
    public static SubLObject f25902(final SubLObject var55, final SubLObject var31) {
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            var56 = (SubLObject)ConsesLow.cons(f25903(var58, var31), var56);
            var57 = var57.rest();
            var58 = var57.first();
        }
        return var56;
    }
    
    public static SubLObject f25903(final SubLObject var20, final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = module0232.f15306(var20);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            var32 = (SubLObject)ConsesLow.cons(f25904(var35, var31), var32);
            var34 = var34.rest();
            var35 = var34.first();
        }
        var34 = module0232.f15308(var20);
        SubLObject var36 = (SubLObject)NIL;
        var36 = var34.first();
        while (NIL != var34) {
            var33 = (SubLObject)ConsesLow.cons(f25904(var36, var31), var33);
            var34 = var34.rest();
            var36 = var34.first();
        }
        return module0232.f15305(Sequences.nreverse(var32), Sequences.nreverse(var33));
    }
    
    public static SubLObject f25905(final SubLObject var17, final SubLObject var31, SubLObject var140) {
        if (var140 == UNPROVIDED) {
            var140 = module0360.$g3101$.getGlobalValue();
        }
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = var17;
        SubLObject var143 = (SubLObject)NIL;
        var143 = var142.first();
        while (NIL != var142) {
            var141 = (SubLObject)ConsesLow.cons(f25896(var143, var31, var140), var141);
            var142 = var142.rest();
            var143 = var142.first();
        }
        return Sequences.nreverse(var141);
    }
    
    public static SubLObject f25906(final SubLObject var193, final SubLObject var31) {
        return (SubLObject)ConsesLow.list(f25896(var193, var31, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f25896(final SubLObject var156, final SubLObject var31, SubLObject var140) {
        if (var140 == UNPROVIDED) {
            var140 = module0360.$g3101$.getGlobalValue();
        }
        final SubLObject var157 = f25907(module0232.f15306(var156), var31);
        final SubLObject var158 = f25907(module0232.f15308(var156), var31);
        final SubLObject var159 = module0232.f15305(var157, var158);
        return f25908(var159, var140);
    }
    
    public static SubLObject f25908(final SubLObject var20, SubLObject var140) {
        if (var140 == UNPROVIDED) {
            var140 = module0360.$g3101$.getGlobalValue();
        }
        final SubLThread var141 = SubLProcess.currentSubLThread();
        if (NIL == module0232.f15312(var20) || NIL == module0202.f12634(module0205.f13333(module0362.f24436(module0204.f13052(var20))))) {
            return var20;
        }
        final SubLObject var142 = module0204.f13052(var20);
        final SubLObject var143 = module0362.f24436(var142);
        final SubLObject var144 = module0362.f24435(var142);
        final SubLObject var145 = f25894(var143, var144, var140);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var141) && NIL == module0035.f1997(var145)) {
            Errors.error((SubLObject)$ic44$, var20);
        }
        return var145.first();
    }
    
    public static SubLObject f25907(final SubLObject var197, final SubLObject var31) {
        SubLObject var198 = (SubLObject)NIL;
        SubLObject var199 = var197;
        SubLObject var200 = (SubLObject)NIL;
        var200 = var199.first();
        while (NIL != var199) {
            final SubLObject var201 = f25851(var200, var31);
            var198 = (SubLObject)ConsesLow.cons(var201, var198);
            var199 = var199.rest();
            var200 = var199.first();
        }
        var198 = Sequences.nreverse(var198);
        return var198;
    }
    
    public static SubLObject f25851(SubLObject var23, final SubLObject var31) {
        if (NIL != module0201.f12580(var23)) {
            var23 = module0202.f12643($ic4$, var23);
        }
        final SubLObject var32 = module0362.f24434(var31, var23);
        return f25848(var32);
    }
    
    public static SubLObject f25909(final SubLObject var199, final SubLObject var200, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var201 = SubLProcess.currentSubLThread();
        var201.resetMultipleValues();
        final SubLObject var202 = module0279.f18576(var200, var31);
        final SubLObject var31_201 = var201.secondMultipleValue();
        var201.resetMultipleValues();
        final SubLObject var203 = f25893(var202, var31_201, module0360.$g3101$.getGlobalValue());
        return module0373.f26434(var199, var203, (SubLObject)T);
    }
    
    public static SubLObject f25910(final SubLObject var1) {
        return module0205.f13144(f25911(var1));
    }
    
    public static SubLObject f25911(final SubLObject var1) {
        return f25912(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f25912(final SubLObject var6, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        if (NIL != module0035.f1997(var6)) {
            return f25913(var6.first(), var202);
        }
        return f25914(var6, var202);
    }
    
    public static SubLObject f25915(final SubLObject var203, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        if (NIL != module0035.f1997(var203)) {
            return f25916(var203.first(), var202);
        }
        return f25917(var203, var202);
    }
    
    public static SubLObject f25913(final SubLObject var10, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        return f25918(var10, var202, (SubLObject)$ic46$);
    }
    
    public static SubLObject f25916(final SubLObject var204, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        return f25918(var204, var202, (SubLObject)$ic47$);
    }
    
    public static SubLObject f25919(final SubLObject var6) {
        final SubLObject var7 = f25912(var6, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12883(var7, (SubLObject)UNPROVIDED) && NIL == module0205.f13145((SubLObject)$ic48$, module0205.f13204(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0205.f13203(var7, (SubLObject)UNPROVIDED);
        }
        return module0132.$g1547$.getGlobalValue();
    }
    
    public static SubLObject f25920(final SubLObject var10) {
        final SubLObject var11 = f25913(var10, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12883(var11, (SubLObject)UNPROVIDED) && NIL == module0205.f13145((SubLObject)$ic48$, module0205.f13204(var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0205.f13203(var11, (SubLObject)UNPROVIDED);
        }
        return module0132.$g1547$.getGlobalValue();
    }
    
    public static SubLObject f25918(final SubLObject var20, final SubLObject var202, final SubLObject var206) {
        final SubLObject var207 = f25847(var20);
        final SubLObject var208 = f25849(var20);
        if (NIL == var207 && NIL == var208) {
            return $ic3$;
        }
        if (NIL == var207 && NIL != module0035.f1997(var208)) {
            return f25904(var208.first(), var202);
        }
        if (NIL == var208 && NIL != module0035.f1997(var207)) {
            return f25921(var207.first(), var202);
        }
        if (var206 == $ic46$) {
            return f25922(var20, var202);
        }
        if (var206 == $ic47$) {
            return f25923(var20, var202);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25847(final SubLObject var20) {
        return module0232.f15306(var20);
    }
    
    public static SubLObject f25849(final SubLObject var20) {
        return module0232.f15308(var20);
    }
    
    public static SubLObject f25904(final SubLObject var28, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)$ic5$);
        var203 = var28.first();
        SubLObject var205 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var205, var28, (SubLObject)$ic5$);
        var204 = var205.first();
        var205 = var205.rest();
        if (NIL != var205) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic5$);
            return (SubLObject)NIL;
        }
        if (var203.equal(var202)) {
            return var204;
        }
        return module0202.f12768($ic49$, var203, var204);
    }
    
    public static SubLObject f25921(final SubLObject var28, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)$ic5$);
        var203 = var28.first();
        SubLObject var205 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var205, var28, (SubLObject)$ic5$);
        var204 = var205.first();
        var205 = var205.rest();
        if (NIL != var205) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic5$);
            return (SubLObject)NIL;
        }
        if (var203.equal(var202)) {
            return module0205.f13338(var204);
        }
        return module0202.f12768($ic49$, var203, module0205.f13338(var204));
    }
    
    public static SubLObject f25914(final SubLObject var6, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        if (NIL == var6) {
            return $ic2$;
        }
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = var6;
        SubLObject var205 = (SubLObject)NIL;
        var205 = var204.first();
        while (NIL != var204) {
            var203 = (SubLObject)ConsesLow.cons(f25913(var205, var202), var203);
            var204 = var204.rest();
            var205 = var204.first();
        }
        return module0202.f12772(Sequences.nreverse(var203));
    }
    
    public static SubLObject f25917(final SubLObject var203, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = var203;
        SubLObject var206 = (SubLObject)NIL;
        var206 = var205.first();
        while (NIL != var205) {
            var204 = (SubLObject)ConsesLow.cons(f25916(var206, var202), var204);
            var205 = var205.rest();
            var206 = var205.first();
        }
        return module0202.f12773(Sequences.nreverse(var204));
    }
    
    public static SubLObject f25922(final SubLObject var20, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        return f25924(var20, var202, (SubLObject)$ic50$);
    }
    
    public static SubLObject f25923(final SubLObject var20, SubLObject var202) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)$ic45$;
        }
        return f25924(var20, var202, (SubLObject)$ic51$);
    }
    
    public static SubLObject f25924(final SubLObject var20, SubLObject var202, final SubLObject var206) {
        SubLObject var207 = (SubLObject)NIL;
        SubLObject var208 = (SubLObject)NIL;
        final SubLObject var209 = (SubLObject)makeBoolean(NIL == module0161.f10481(var202));
        if (NIL != var209) {
            var202 = f25925(var20);
        }
        SubLObject var210 = (SubLObject)ZERO_INTEGER;
        SubLObject var211 = module0232.f15306(var20);
        SubLObject var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            final SubLObject var213 = (SubLObject)$ic52$;
            if ($ic52$ == var213) {
                var207 = (SubLObject)ConsesLow.cons(f25921(var212, var202), var207);
            }
            else {
                var208 = (SubLObject)ConsesLow.cons(f25904(var212, var202), var208);
            }
            var210 = Numbers.add(var210, (SubLObject)ONE_INTEGER);
            var211 = var211.rest();
            var212 = var211.first();
        }
        var210 = (SubLObject)ZERO_INTEGER;
        var211 = module0232.f15308(var20);
        var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            final SubLObject var213 = (SubLObject)$ic53$;
            if ($ic52$ == var213) {
                var207 = (SubLObject)ConsesLow.cons(f25921(var212, var202), var207);
            }
            else {
                var208 = (SubLObject)ConsesLow.cons(f25904(var212, var202), var208);
            }
            var210 = Numbers.add(var210, (SubLObject)ONE_INTEGER);
            var211 = var211.rest();
            var212 = var211.first();
        }
        var207 = Sequences.nreverse(var207);
        var208 = Sequences.nreverse(var208);
        final SubLObject var214 = ConsesLow.nconc(var207, var208);
        final SubLObject var215 = (var206 == $ic50$) ? module0202.f12773(var214) : module0202.f12772(var214);
        return (NIL != var209) ? module0202.f12768($ic49$, var202, var215) : var215;
    }
    
    public static SubLObject f25925(final SubLObject var20) {
        return f25901((SubLObject)ConsesLow.list(var20));
    }
    
    public static SubLObject f25901(final SubLObject var55) {
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            SubLObject var59 = (SubLObject)ZERO_INTEGER;
            SubLObject var9_221 = module0232.f15306(var58);
            SubLObject var60 = (SubLObject)NIL;
            var60 = var9_221.first();
            while (NIL != var9_221) {
                final SubLObject var61 = (SubLObject)$ic52$;
                SubLObject var63;
                final SubLObject var62 = var63 = var60;
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic5$);
                var64 = var63.first();
                var63 = var63.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic5$);
                var65 = var63.first();
                var63 = var63.rest();
                if (NIL == var63) {
                    SubLObject var66 = conses_high.assoc(var64, var56, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    if (NIL == var66) {
                        var66 = (SubLObject)ConsesLow.cons(var64, (SubLObject)ZERO_INTEGER);
                        var56 = (SubLObject)ConsesLow.cons(var66, var56);
                    }
                    ConsesLow.rplacd(var66, Numbers.add(var66.rest(), (SubLObject)ONE_INTEGER));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic5$);
                }
                var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER);
                var9_221 = var9_221.rest();
                var60 = var9_221.first();
            }
            var59 = (SubLObject)ZERO_INTEGER;
            SubLObject var9_222 = module0232.f15308(var58);
            var60 = (SubLObject)NIL;
            var60 = var9_222.first();
            while (NIL != var9_222) {
                final SubLObject var61 = (SubLObject)$ic53$;
                SubLObject var68;
                final SubLObject var67 = var68 = var60;
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)$ic5$);
                var64 = var68.first();
                var68 = var68.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)$ic5$);
                var65 = var68.first();
                var68 = var68.rest();
                if (NIL == var68) {
                    SubLObject var66 = conses_high.assoc(var64, var56, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    if (NIL == var66) {
                        var66 = (SubLObject)ConsesLow.cons(var64, (SubLObject)ZERO_INTEGER);
                        var56 = (SubLObject)ConsesLow.cons(var66, var56);
                    }
                    ConsesLow.rplacd(var66, Numbers.add(var66.rest(), (SubLObject)ONE_INTEGER));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var67, (SubLObject)$ic5$);
                }
                var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER);
                var9_222 = var9_222.rest();
                var60 = var9_222.first();
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        var56 = Sequences.nreverse(var56);
        var56 = Sort.stable_sort(var56, Symbols.symbol_function((SubLObject)$ic54$), Symbols.symbol_function((SubLObject)$ic55$));
        return var56.first().first();
    }
    
    public static SubLObject f25926(SubLObject var36, SubLObject var31) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0202.f12911(var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var37.resetMultipleValues();
        final SubLObject var229_230 = f25927(var36, var31);
        final SubLObject var231_232 = var37.secondMultipleValue();
        var37.resetMultipleValues();
        var36 = var229_230;
        var31 = var231_232;
        return Values.values(var36, var31, var38);
    }
    
    public static SubLObject f25927(SubLObject var36, SubLObject var31) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0146.$g2025$.currentBinding(var37);
        final SubLObject var39 = module0146.$g2013$.currentBinding(var37);
        final SubLObject var40 = module0146.$g1994$.currentBinding(var37);
        final SubLObject var41 = module0146.$g2026$.currentBinding(var37);
        final SubLObject var42 = module0146.$g1998$.currentBinding(var37);
        final SubLObject var43 = module0146.$g1997$.currentBinding(var37);
        try {
            module0146.$g2025$.bind((SubLObject)NIL, var37);
            module0146.$g2013$.bind((SubLObject)NIL, var37);
            module0146.$g1994$.bind((SubLObject)T, var37);
            module0146.$g2026$.bind((SubLObject)T, var37);
            module0146.$g1998$.bind((SubLObject)NIL, var37);
            module0146.$g1997$.bind((SubLObject)T, var37);
            var37.resetMultipleValues();
            final SubLObject var236_237 = module0282.f18735(var36, var31);
            final SubLObject var238_239 = var37.secondMultipleValue();
            var37.resetMultipleValues();
            var36 = var236_237;
            var31 = var238_239;
        }
        finally {
            module0146.$g1997$.rebind(var43, var37);
            module0146.$g1998$.rebind(var42, var37);
            module0146.$g2026$.rebind(var41, var37);
            module0146.$g1994$.rebind(var40, var37);
            module0146.$g2013$.rebind(var39, var37);
            module0146.$g2025$.rebind(var38, var37);
        }
        if (var36.eql($ic3$)) {
            return Values.values(module0202.f12773((SubLObject)NIL), var31);
        }
        if (NIL == var36 || var36.eql($ic2$)) {
            return Values.values(module0202.f12773((SubLObject)$ic56$), var31);
        }
        if (var36.isAtom()) {
            Errors.error((SubLObject)$ic57$, var36);
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12597(var36) || NIL != module0202.f12592(var36)) {
            return Values.values(module0202.f12773((SubLObject)ConsesLow.list(var36)), var31);
        }
        if (NIL != module0202.f12594(var36)) {
            return Values.values(module0202.f12773((SubLObject)ConsesLow.list(var36)), var31);
        }
        if (NIL != module0202.f12595(var36)) {
            SubLObject var44 = (SubLObject)NIL;
            SubLObject var46;
            final SubLObject var45 = var46 = module0205.f13207(var36, (SubLObject)$ic58$);
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                final SubLObject var48 = f25927(var47, var31);
                if (NIL != module0202.f12595(var48)) {
                    var44 = conses_high.revappend(module0205.f13207(var48, (SubLObject)UNPROVIDED), var44);
                }
                else {
                    var44 = (SubLObject)ConsesLow.cons(var48, var44);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
            return Values.values(reader.bq_cons($ic59$, ConsesLow.append(Sequences.nreverse(var44), (SubLObject)NIL)), var31);
        }
        if (NIL == module0202.f12903(var36) || NIL != module0202.f12592(var36)) {
            return Values.values(module0202.f12773((SubLObject)ConsesLow.list(var36)), var31);
        }
        final SubLObject var49 = module0205.f13333(var36);
        final SubLObject var50 = module0202.f12887(var36);
        SubLObject var52;
        final SubLObject var51 = var52 = module0202.f12906(var36);
        if (NIL == module0161.f10481(var51)) {
            var52 = var31;
        }
        final SubLObject var53 = f25927(var50, var52);
        assert NIL != module0202.f12595(var53) : var53;
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var56;
        final SubLObject var55 = var56 = module0205.f13207(var53, (SubLObject)$ic58$);
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            final SubLObject var58 = module0202.f12768(var49, var51, var57);
            var54 = (SubLObject)ConsesLow.cons(var58, var54);
            var56 = var56.rest();
            var57 = var56.first();
        }
        var54 = Sequences.nreverse(var54);
        return Values.values(module0202.f12773(var54), var31);
    }
    
    public static SubLObject f25928(final SubLObject var251) {
        final SubLObject var252 = module0205.f13207(var251, (SubLObject)UNPROVIDED);
        SubLObject var253 = (SubLObject)NIL;
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = var252;
        SubLObject var256 = (SubLObject)NIL;
        var256 = var255.first();
        while (NIL != var255) {
            if (NIL != module0202.f12590(var256) && (NIL != module0202.f12597(var256) || NIL != module0202.f12594(var256) || NIL != module0202.f12648(var256) || NIL != module0202.f12651(var256) || NIL != module0205.f13332(var256, $ic61$) || NIL != module0205.f13332(var256, $ic62$) || NIL != module0205.f13332(var256, $ic63$) || NIL != module0205.f13332(var256, $ic64$) || NIL != module0205.f13332(var256, $ic65$) || NIL != module0205.f13332(var256, $ic66$) || NIL != module0205.f13332(var256, $ic67$))) {
                var254 = (SubLObject)ConsesLow.cons(var256, var254);
            }
            else {
                var253 = (SubLObject)ConsesLow.cons(var256, var253);
            }
            var255 = var255.rest();
            var256 = var255.first();
        }
        var253 = Sequences.nreverse(var253);
        var254 = Sequences.nreverse(var254);
        return Values.values(var253, var254);
    }
    
    public static SubLObject f25929(final SubLObject var36, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0146.$g2020$.currentBinding(var37);
        final SubLObject var41 = module0146.$g2013$.currentBinding(var37);
        try {
            module0146.$g2020$.bind((SubLObject)NIL, var37);
            module0146.$g2013$.bind((SubLObject)NIL, var37);
            var37.resetMultipleValues();
            final SubLObject var256_257 = module0285.f18909(var36, var31);
            final SubLObject var258_259 = var37.secondMultipleValue();
            var37.resetMultipleValues();
            var38 = var256_257;
            var39 = var258_259;
        }
        finally {
            module0146.$g2013$.rebind(var41, var37);
            module0146.$g2020$.rebind(var40, var37);
        }
        return Values.values(var38, var39);
    }
    
    public static SubLObject f25930() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25838", "CANONICALIZE-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25841", "S#28832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25842", "S#28833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25844", "S#28834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25845", "S#28835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25839", "S#28836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25846", "S#28837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25850", "S#28838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25852", "S#28839", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25848", "S#28840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25840", "S#28841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25853", "S#28842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25854", "S#28843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25855", "S#28844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25857", "S#28845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25858", "S#28846", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25860", "S#28826", 2, 0, false);
        new $f25860$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25859", "S#28847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25861", "S#28848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25862", "S#28849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25863", "S#28850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25864", "S#28851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25865", "S#28852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25866", "S#28853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25869", "S#28827", 1, 0, false);
        new $f25869$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25867", "S#28854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25870", "S#28855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25868", "S#28856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25871", "S#28857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25872", "S#28858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25873", "S#28859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25874", "S#28860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25875", "S#28861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25876", "S#28862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25877", "S#28863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25856", "S#28864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25878", "S#28865", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25879", "S#28866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25881", "S#28867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25884", "S#28828", 0, 1, false);
        new $f25884$ZeroArityFunction();
        new $f25884$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25885", "S#28868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25882", "S#28869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25883", "S#28870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25880", "S#28871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25843", "S#28872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25887", "S#18221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25889", "S#28829", 1, 0, false);
        new $f25889$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25886", "S#28873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25890", "S#28830", 1, 0, false);
        new $f25890$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25888", "S#28874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25891", "S#28875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25892", "S#28876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25894", "S#28877", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25893", "INFERENCE-CANONICALIZE-ASK-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25895", "S#28878", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25897", "S#28879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25899", "S#28880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25898", "S#28881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25900", "S#28882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25902", "S#28883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25903", "S#28884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25905", "S#28885", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25906", "DNF-AND-MT-TO-HL-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25896", "S#27292", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25908", "S#28886", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25907", "S#28887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25851", "S#28888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25909", "FIND-PROBLEM-BY-EL-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25910", "S#21046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25911", "S#27363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25912", "S#28201", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25915", "S#28889", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25913", "S#28890", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25916", "S#28891", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25919", "S#28892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25920", "S#28893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25918", "S#28894", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25847", "S#28895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25849", "S#28896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25904", "S#28897", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25921", "S#28898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25914", "S#28899", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25917", "S#28900", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25922", "S#28901", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25923", "S#28902", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25924", "S#28903", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25925", "S#28904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25901", "S#28905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25926", "S#28906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25927", "S#28907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25928", "S#28908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0370", "f25929", "S#28909", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25931() {
        $g3153$ = SubLFiles.defparameter("S#28910", (SubLObject)T);
        $g3154$ = SubLFiles.defparameter("S#28911", module0107.f7627());
        $g3155$ = SubLFiles.defparameter("S#28912", module0107.f7627());
        $g3156$ = SubLFiles.defparameter("S#28913", module0107.f7627());
        $g3157$ = SubLFiles.deflexical("S#28914", (NIL != Symbols.boundp((SubLObject)$ic18$)) ? $g3157$.getGlobalValue() : Symbols.make_symbol((SubLObject)$ic19$));
        $g3158$ = SubLFiles.defparameter("S#28915", (SubLObject)$ic25$);
        $g3159$ = SubLFiles.defparameter("S#28916", (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25932() {
        module0003.f57((SubLObject)$ic18$);
        module0034.f1895((SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f25930();
    }
    
    public void initializeVariables() {
        f25931();
    }
    
    public void runTopLevelForms() {
        f25932();
    }
    
    static {
        me = (SubLFile)new module0370();
        $g3153$ = null;
        $g3154$ = null;
        $g3155$ = null;
        $g3156$ = null;
        $g3157$ = null;
        $g3158$ = null;
        $g3159$ = null;
        $ic0$ = makeSymbol("S#28838", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#28917", "CYC"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("trueSentence"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"))));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic9$ = makeSymbol("S#28846", "CYC");
        $ic10$ = makeSymbol("S#28826", "CYC");
        $ic11$ = makeString("The type of object ~a cannot be sorted");
        $ic12$ = makeString("Got a CycL term of unknown inference type: ~a");
        $ic13$ = makeSymbol("S#28827", "CYC");
        $ic14$ = makeKeyword("INFERENCE-CZER-FIXED-VARIABLE");
        $ic15$ = makeKeyword("CACHE-MISS");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("CommutativeRelation"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("PartiallyCommutativeRelation"));
        $ic18$ = makeSymbol("S#28914", "CYC");
        $ic19$ = makeString("var");
        $ic20$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#28918", "CYC"));
        $ic21$ = makeSymbol("S#28828", "CYC");
        $ic22$ = makeKeyword("NOT-UNIQUE");
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#12398", "CYC"));
        $ic24$ = makeSymbol("VARIABLE-P");
        $ic25$ = makeKeyword("LAMBDA");
        $ic26$ = makeSymbol("S#28829", "CYC");
        $ic27$ = makeSymbol("S#28830", "CYC");
        $ic28$ = makeKeyword("REQUIRE-EQUAL");
        $ic29$ = makeKeyword("POLICY-VIOLATION");
        $ic30$ = makeKeyword("COMPUTE-INTERSECTION");
        $ic31$ = makeKeyword("COMPUTE-UNION");
        $ic32$ = makeString("Unexpected inference disjunction free el vars policy : ~S");
        $ic33$ = makeSymbol("S#28877", "CYC");
        $ic34$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic35$ = makeKeyword("ILL-FORMED");
        $ic36$ = makeString("Got a czer-result of unexpected type: ~s");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#8667", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("S#28919", "CYC"), (SubLObject)makeSymbol("S#28920", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#28921", "CYC"), (SubLObject)makeSymbol("S#28922", "CYC"), (SubLObject)makeSymbol("S#28923", "CYC"));
        $ic40$ = makeKeyword("UNINITIALIZED");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("S#28919", "CYC"), (SubLObject)makeSymbol("S#28765", "CYC"));
        $ic42$ = makeSymbol("S#28849", "CYC");
        $ic43$ = makeSymbol("EL-VARIABLE-P");
        $ic44$ = makeString("Something weird happened when trying to distribute #$ist across logical operators with ~s");
        $ic45$ = makeKeyword("UNSPECIFIED");
        $ic46$ = makeKeyword("DNF");
        $ic47$ = makeKeyword("CNF");
        $ic48$ = makeSymbol("S#15780", "CYC");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic50$ = makeKeyword("CONJUNCTION");
        $ic51$ = makeKeyword("DISJUNCTION");
        $ic52$ = makeKeyword("NEG");
        $ic53$ = makeKeyword("POS");
        $ic54$ = makeSymbol(">");
        $ic55$ = makeSymbol("CDR");
        $ic56$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("False")));
        $ic57$ = makeString("Can't canonicalize hypothesis ~S");
        $ic58$ = makeKeyword("IGNORE");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic60$ = makeSymbol("S#13276", "CYC");
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("assertionDirection"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("constraint"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("highlyRelevantAssertion"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("irrelevantAssertion"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("knownAntecedentRule"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("queryExtentCached"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("genlRules"));
    }
    
    public static final class $f25860$BinaryFunction extends BinaryFunction
    {
        public $f25860$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28826"));
        }
        
        public SubLObject processItem(final SubLObject var60, final SubLObject var61) {
            return f25860(var60, var61);
        }
    }
    
    public static final class $f25869$UnaryFunction extends UnaryFunction
    {
        public $f25869$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28827"));
        }
        
        public SubLObject processItem(final SubLObject var60) {
            return f25869(var60);
        }
    }
    
    public static final class $f25884$ZeroArityFunction extends ZeroArityFunction
    {
        public $f25884$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28828"));
        }
        
        public SubLObject processItem() {
            return f25884((SubLObject)$f25884$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $f25884$UnaryFunction extends UnaryFunction
    {
        public $f25884$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28828"));
        }
        
        public SubLObject processItem(final SubLObject var60) {
            return f25884(var60);
        }
    }
    
    public static final class $f25889$UnaryFunction extends UnaryFunction
    {
        public $f25889$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28829"));
        }
        
        public SubLObject processItem(final SubLObject var60) {
            return f25889(var60);
        }
    }
    
    public static final class $f25890$UnaryFunction extends UnaryFunction
    {
        public $f25890$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28830"));
        }
        
        public SubLObject processItem(final SubLObject var60) {
            return f25890(var60);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 452 ms
	
	Decompiled with Procyon 0.5.32.
*/