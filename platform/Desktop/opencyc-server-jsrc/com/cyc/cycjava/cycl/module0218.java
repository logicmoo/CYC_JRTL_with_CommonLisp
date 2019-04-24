package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0218 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0218";
    public static final String myFingerPrint = "59516393de24ab567a3aa381cbc3736f2ab16d632144fee94ccd47153f139291";
    public static SubLSymbol $g2391$;
    public static SubLSymbol $g2392$;
    private static SubLSymbol $g2393$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLInteger $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    
    public static SubLObject f14449(final SubLObject var1, SubLObject var2) {
        if (var2 == module0218.UNPROVIDED) {
            var2 = (SubLObject)module0218.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0218.NIL == var1) {
            return (SubLObject)module0218.NIL;
        }
        SubLObject var4 = var1;
        SubLObject var5 = (SubLObject)module0218.NIL;
        var5 = var4.first();
        while (module0218.NIL != var4) {
            assert module0218.NIL != module0212.f13762(var5) : var5;
            var4 = var4.rest();
            var5 = var4.first();
        }
        final SubLObject var6 = Sort.sort(Sequences.remove_duplicates(var1, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED), Symbols.symbol_function((SubLObject)module0218.$ic1$), Symbols.symbol_function((SubLObject)module0218.$ic2$));
        final SubLObject var7 = var6.first();
        SubLObject var8 = var6.rest();
        if (module0218.NIL == var8) {
            return module0219.f14526(var7, (SubLObject)module0218.UNPROVIDED);
        }
        final SubLObject var9 = var8.first();
        SubLObject var10 = (SubLObject)module0218.NIL;
        var8 = var8.rest();
        final SubLObject var11 = module0018.$g587$.currentBinding(var3);
        try {
            module0018.$g587$.bind(var9, var3);
            var10 = module0226.f15141(var7, Symbols.symbol_function((SubLObject)module0218.$ic3$), (SubLObject)module0218.UNPROVIDED);
            if (module0218.NIL != var2) {
                SubLObject var12 = module0219.f14527(var7);
                if (module0218.NIL != var12) {
                    final SubLObject var11_13 = module0018.$g587$.currentBinding(var3);
                    try {
                        module0018.$g587$.bind(var9, var3);
                        var12 = Sequences.delete_if(Symbols.symbol_function((SubLObject)module0218.$ic4$), var12, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
                    }
                    finally {
                        module0018.$g587$.rebind(var11_13, var3);
                    }
                    var10 = ConsesLow.nconc(var10, var12);
                }
            }
        }
        finally {
            module0018.$g587$.rebind(var11, var3);
        }
        SubLObject var13 = var8;
        SubLObject var14 = (SubLObject)module0218.NIL;
        var14 = var13.first();
        while (module0218.NIL != var13) {
            final SubLObject var15 = module0018.$g587$.currentBinding(var3);
            try {
                module0018.$g587$.bind(var14, var3);
                var10 = Sequences.delete_if(Symbols.symbol_function((SubLObject)module0218.$ic4$), var10, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
            }
            finally {
                module0018.$g587$.rebind(var15, var3);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.remove_duplicates(var10, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
    }
    
    public static SubLObject f14450(SubLObject var1, final SubLObject var15, SubLObject var2) {
        if (var2 == module0218.UNPROVIDED) {
            var2 = (SubLObject)module0218.T;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0218.NIL;
        var1 = module0228.f15228(var1);
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0218.$ic9$, var16);
            module0147.$g2095$.bind(var15, var16);
            var17 = f14449(var1, var2);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f14451(SubLObject var1, SubLObject var2) {
        if (var2 == module0218.UNPROVIDED) {
            var2 = (SubLObject)module0218.T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0218.NIL;
        var1 = module0228.f15228(var1);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0218.$ic10$, var3);
            module0147.$g2095$.bind(module0218.$ic11$, var3);
            var4 = f14449(var1, var2);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f14452(SubLObject var1, SubLObject var15, SubLObject var2) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        if (var2 == module0218.UNPROVIDED) {
            var2 = (SubLObject)module0218.T;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0218.NIL;
        var1 = module0228.f15228(var1);
        if (module0218.NIL != var15) {
            final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
            final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
            try {
                module0147.$g2094$.bind((SubLObject)module0218.$ic9$, var16);
                module0147.$g2095$.bind(var15, var16);
                var17 = f14449(var1, var2);
            }
            finally {
                module0147.$g2095$.rebind(var19, var16);
                module0147.$g2094$.rebind(var18, var16);
            }
        }
        else {
            final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
            final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
            try {
                module0147.$g2094$.bind((SubLObject)module0218.$ic10$, var16);
                module0147.$g2095$.bind(module0218.$ic11$, var16);
                var17 = f14449(var1, var2);
            }
            finally {
                module0147.$g2095$.rebind(var19, var16);
                module0147.$g2094$.rebind(var18, var16);
            }
        }
        return var17;
    }
    
    public static SubLObject f14453(final SubLObject var18, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0218.NIL == var18) {
            return (SubLObject)module0218.NIL;
        }
        SubLObject var20 = (SubLObject)module0218.NIL;
        final SubLObject var21 = var15;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind(module0147.f9531(var21), var19);
            module0147.$g2095$.bind(module0147.f9534(var21), var19);
            final SubLObject var24 = Sequences.remove_duplicates(module0035.remove_if_not((SubLObject)module0218.$ic12$, var18, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED), (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
            final SubLObject var25 = module0035.f2220(var18, var24, (SubLObject)module0218.UNPROVIDED);
            final SubLObject var26 = Sort.sort(var24, Symbols.symbol_function((SubLObject)module0218.$ic1$), Symbols.symbol_function((SubLObject)module0218.$ic2$));
            final SubLObject var27 = var26.first();
            SubLObject var28 = ConsesLow.append(var26.rest(), var25);
            if (module0218.NIL == var28) {
                var20 = module0219.f14526(var27, (SubLObject)module0218.UNPROVIDED);
            }
            else {
                final SubLObject var29 = var28.first();
                SubLObject var30 = (SubLObject)module0218.NIL;
                var28 = var28.rest();
                final SubLObject var11_23 = module0018.$g587$.currentBinding(var19);
                try {
                    module0018.$g587$.bind(var29, var19);
                    SubLObject var31 = (SubLObject)module0218.NIL;
                    var30 = module0226.f15141(var27, Symbols.symbol_function((SubLObject)module0218.$ic3$), (SubLObject)module0218.UNPROVIDED);
                    if (module0218.NIL == var31) {
                        SubLObject var32 = var28;
                        SubLObject var33 = (SubLObject)module0218.NIL;
                        var33 = var32.first();
                        while (module0218.NIL == var31 && module0218.NIL != var32) {
                            final SubLObject var11_24 = module0018.$g587$.currentBinding(var19);
                            try {
                                module0018.$g587$.bind(var33, var19);
                                var30 = Sequences.delete_if(Symbols.symbol_function((SubLObject)module0218.$ic4$), var30, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
                            }
                            finally {
                                module0018.$g587$.rebind(var11_24, var19);
                            }
                            var31 = Types.sublisp_null(var30);
                            var32 = var32.rest();
                            var33 = var32.first();
                        }
                    }
                    var20 = module0035.f2269(var30, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
                }
                finally {
                    module0018.$g587$.rebind(var11_23, var19);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var23, var19);
            module0147.$g2094$.rebind(var22, var19);
        }
        return module0035.delete_if_not((SubLObject)module0218.$ic13$, var20, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
    }
    
    public static SubLObject f14454(final SubLObject var27, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        return f14453(f14455(var27), var15);
    }
    
    public static SubLObject f14456(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0218.NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0218.$ic10$, var16);
            module0147.$g2095$.bind(module0218.$ic11$, var16);
            var17 = f14453(f14455(var15), (SubLObject)module0218.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f14457(final SubLObject var18, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        return Sequences.length(f14453(var18, var15));
    }
    
    public static SubLObject f14458(final SubLObject var18, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0218.NIL == var18) {
            return (SubLObject)module0218.ZERO_INTEGER;
        }
        SubLObject var20 = (SubLObject)module0218.NIL;
        final SubLObject var21 = var15;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind(module0147.f9531(var21), var19);
            module0147.$g2095$.bind(module0147.f9534(var21), var19);
            final SubLObject var24 = Sequences.remove_duplicates(module0035.remove_if_not((SubLObject)module0218.$ic12$, var18, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED), (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED, (SubLObject)module0218.UNPROVIDED);
            if (module0218.NIL == var24) {
                var20 = (SubLObject)module0218.ZERO_INTEGER;
            }
            else {
                final SubLObject var25 = Functions.apply(Symbols.symbol_function((SubLObject)module0218.$ic14$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0218.$ic2$), var24));
                var20 = Numbers.round(Numbers.divide(var25, Sequences.length(var18)), (SubLObject)module0218.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var23, var19);
            module0147.$g2094$.rebind(var22, var19);
        }
        return var20;
    }
    
    public static SubLObject f14459(final SubLObject var27, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        final SubLObject var28 = f14455(var27);
        return f14457(var28, var15);
    }
    
    public static SubLObject f14460(final SubLObject var27, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        return f14461(var27, var15);
    }
    
    public static SubLObject f14462(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0218.NIL != module0193.f12067(var15)) {
            return module0174.f11019();
        }
        SubLObject var17 = (SubLObject)module0218.NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0218.$ic10$, var16);
            module0147.$g2095$.bind(module0218.$ic11$, var16);
            var17 = f14461(var15, (SubLObject)module0218.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f14461(final SubLObject var30, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        final SubLObject var31 = f14463(var30, var15);
        final SubLObject var32 = f14455(var30);
        final SubLObject var33 = f14458(var32, var15);
        if (module0218.NIL != module0004.f105(var31) && var31.numL(var33)) {
            return var31;
        }
        return var33;
    }
    
    public static SubLObject f14463(final SubLObject var30, SubLObject var15) {
        if (var15 == module0218.UNPROVIDED) {
            var15 = (SubLObject)module0218.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0205.f13132(var30);
        SubLObject var33 = (SubLObject)module0218.ZERO_INTEGER;
        SubLObject var34 = (SubLObject)module0218.NIL;
        if (module0218.NIL != module0173.f10955(var32)) {
            final SubLObject var35 = var15;
            final SubLObject var36 = module0147.$g2094$.currentBinding(var31);
            final SubLObject var37 = module0147.$g2095$.currentBinding(var31);
            try {
                module0147.$g2094$.bind(module0147.f9531(var35), var31);
                module0147.$g2095$.bind(module0147.f9534(var35), var31);
                SubLObject var38 = (SubLObject)module0218.ZERO_INTEGER;
                SubLObject var40;
                final SubLObject var39 = var40 = module0205.f13207(var30, (SubLObject)module0218.$ic15$);
                SubLObject var41 = (SubLObject)module0218.NIL;
                var41 = var40.first();
                while (module0218.NIL != var40) {
                    var38 = Numbers.add(var38, (SubLObject)module0218.ONE_INTEGER);
                    if (module0218.NIL != module0173.f10955(var41)) {
                        var33 = Numbers.add(var33, (SubLObject)module0218.ONE_INTEGER);
                        var34 = (SubLObject)ConsesLow.cons(module0217.f14221(var41, var38, module0205.f13132(var30), (SubLObject)module0218.UNPROVIDED), var34);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var37, var31);
                module0147.$g2094$.rebind(var36, var31);
            }
        }
        if (module0218.NIL != var34) {
            return Numbers.round(Numbers.divide(Functions.apply(Symbols.symbol_function((SubLObject)module0218.$ic14$), var34), var33), (SubLObject)module0218.UNPROVIDED);
        }
        return (SubLObject)module0218.NIL;
    }
    
    public static SubLObject f14455(final SubLObject var30) {
        return f14464(var30);
    }
    
    public static SubLObject f14464(final SubLObject var30) {
        final SubLObject var31 = module0205.f13132(var30);
        SubLObject var32 = (SubLObject)module0218.NIL;
        SubLObject var33;
        final SubLObject var40_41 = var33 = module0205.f13180(var30, (SubLObject)module0218.$ic15$);
        SubLObject var34 = (SubLObject)module0218.NIL;
        var34 = var33.first();
        while (module0218.NIL != var33) {
            if (module0218.NIL != module0202.f12590(var34)) {
                if (module0218.NIL == module0279.f18533(module0205.f13132(var34), (SubLObject)module0218.UNPROVIDED) || var31.eql(module0218.$ic16$)) {
                    var32 = ConsesLow.append(var32, f14464(var34));
                }
            }
            else if (module0218.NIL != f14465(var34)) {
                var32 = (SubLObject)ConsesLow.cons(var34, var32);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f14465(final SubLObject var42) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0218.NIL != module0212.f13762(var42) || (!var42.isCons() && module0218.NIL != module0206.f13466(var42)));
    }
    
    public static SubLObject f14466(final SubLObject var30, SubLObject var43) {
        if (var43 == module0218.UNPROVIDED) {
            var43 = (SubLObject)module0218.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0218.NIL == module0218.$g2391$.getDynamicValue(var44)) {
            return (SubLObject)module0218.NIL;
        }
        if (module0218.NIL != var43 && var43.numL(module0218.$g2392$.getGlobalValue())) {
            return (SubLObject)module0218.NIL;
        }
        if (module0218.NIL != f14467(var30)) {
            return (SubLObject)module0218.NIL;
        }
        if (module0218.NIL != var43 && module0218.NIL != module0147.f9513()) {
            var44.resetMultipleValues();
            final SubLObject var45 = module0226.f15173(var30, (SubLObject)module0218.UNPROVIDED);
            final SubLObject var46 = var44.secondMultipleValue();
            var44.resetMultipleValues();
            return Numbers.numL(Numbers.multiply(var46, module0218.$g2393$.getGlobalValue()), var43);
        }
        return (SubLObject)module0218.T;
    }
    
    public static SubLObject f14467(final SubLObject var30) {
        if (module0218.NIL != module0202.f12665(var30)) {
            return (SubLObject)module0218.NIL;
        }
        if (module0218.NIL == module0212.f13762(module0205.f13136(var30))) {
            return (SubLObject)module0218.T;
        }
        SubLObject var31 = (SubLObject)module0218.ZERO_INTEGER;
        SubLObject var33;
        final SubLObject var32 = var33 = module0205.f13207(var30, (SubLObject)module0218.$ic15$);
        SubLObject var34 = (SubLObject)module0218.NIL;
        var34 = var33.first();
        while (module0218.NIL != var33) {
            if (module0218.NIL != f14465(var34)) {
                var31 = Numbers.add(var31, (SubLObject)module0218.ONE_INTEGER);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return Numbers.numLE(var31, (SubLObject)module0218.ONE_INTEGER);
    }
    
    public static SubLObject f14468(SubLObject var47) {
        if (var47 == module0218.UNPROVIDED) {
            var47 = (SubLObject)module0218.NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0218.ZERO_INTEGER;
        SubLObject var50 = (SubLObject)module0218.NIL;
        final SubLObject var51 = module0167.f10788();
        final SubLObject var52 = (SubLObject)module0218.$ic18$;
        final SubLObject var53 = module0065.f4733(var51);
        SubLObject var54 = (SubLObject)module0218.ZERO_INTEGER;
        assert module0218.NIL != Types.stringp(var52) : var52;
        final SubLObject var55 = module0012.$g75$.currentBinding(var48);
        final SubLObject var56 = module0012.$g76$.currentBinding(var48);
        final SubLObject var57 = module0012.$g77$.currentBinding(var48);
        final SubLObject var58 = module0012.$g78$.currentBinding(var48);
        try {
            module0012.$g75$.bind((SubLObject)module0218.ZERO_INTEGER, var48);
            module0012.$g76$.bind((SubLObject)module0218.NIL, var48);
            module0012.$g77$.bind((SubLObject)module0218.T, var48);
            module0012.$g78$.bind(Time.get_universal_time(), var48);
            module0012.f478(var52);
            final SubLObject var56_57 = var51;
            if (module0218.NIL == module0065.f4772(var56_57, (SubLObject)module0218.$ic20$)) {
                final SubLObject var58_59 = var56_57;
                if (module0218.NIL == module0065.f4775(var58_59, (SubLObject)module0218.$ic20$)) {
                    final SubLObject var59 = module0065.f4740(var58_59);
                    final SubLObject var60 = (SubLObject)module0218.NIL;
                    SubLObject var61;
                    SubLObject var62;
                    SubLObject var63;
                    SubLObject var64;
                    SubLObject var65;
                    SubLObject var66;
                    for (var61 = Sequences.length(var59), var62 = (SubLObject)module0218.NIL, var62 = (SubLObject)module0218.ZERO_INTEGER; var62.numL(var61); var62 = Numbers.add(var62, (SubLObject)module0218.ONE_INTEGER)) {
                        var63 = ((module0218.NIL != var60) ? Numbers.subtract(var61, var62, (SubLObject)module0218.ONE_INTEGER) : var62);
                        var64 = Vectors.aref(var59, var63);
                        if (module0218.NIL == module0065.f4749(var64) || module0218.NIL == module0065.f4773((SubLObject)module0218.$ic20$)) {
                            if (module0218.NIL != module0065.f4749(var64)) {
                                var64 = (SubLObject)module0218.$ic20$;
                            }
                            module0012.note_percent_progress(var54, var53);
                            var54 = Numbers.add(var54, (SubLObject)module0218.ONE_INTEGER);
                            var48.resetMultipleValues();
                            var65 = f14469(var64, var47);
                            var66 = var48.secondMultipleValue();
                            var48.resetMultipleValues();
                            if (module0218.NIL != var65 && module0218.NIL != var66 && var66.numG(var49)) {
                                var49 = var66;
                                var50 = var65;
                            }
                        }
                    }
                }
                final SubLObject var68_69 = var56_57;
                if (module0218.NIL == module0065.f4777(var68_69) || module0218.NIL == module0065.f4773((SubLObject)module0218.$ic20$)) {
                    final SubLObject var67 = module0065.f4738(var68_69);
                    SubLObject var68 = module0065.f4739(var68_69);
                    final SubLObject var69 = module0065.f4734(var68_69);
                    final SubLObject var70 = (SubLObject)((module0218.NIL != module0065.f4773((SubLObject)module0218.$ic20$)) ? module0218.NIL : module0218.$ic20$);
                    while (var68.numL(var69)) {
                        final SubLObject var71 = Hashtables.gethash_without_values(var68, var67, var70);
                        if (module0218.NIL == module0065.f4773((SubLObject)module0218.$ic20$) || module0218.NIL == module0065.f4749(var71)) {
                            module0012.note_percent_progress(var54, var53);
                            var54 = Numbers.add(var54, (SubLObject)module0218.ONE_INTEGER);
                            var48.resetMultipleValues();
                            final SubLObject var72 = f14469(var71, var47);
                            final SubLObject var73 = var48.secondMultipleValue();
                            var48.resetMultipleValues();
                            if (module0218.NIL != var72 && module0218.NIL != var73 && var73.numG(var49)) {
                                var49 = var73;
                                var50 = var72;
                            }
                        }
                        var68 = Numbers.add(var68, (SubLObject)module0218.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var58, var48);
            module0012.$g77$.rebind(var57, var48);
            module0012.$g76$.rebind(var56, var48);
            module0012.$g75$.rebind(var55, var48);
        }
        return Values.values(var50, var49);
    }
    
    public static SubLObject f14469(final SubLObject var65, SubLObject var47) {
        if (var47 == module0218.UNPROVIDED) {
            var47 = (SubLObject)module0218.NIL;
        }
        final SubLObject var66 = module0172.f10915(var65);
        final SubLObject var67 = module0217.f14379(var66, (SubLObject)module0218.UNPROVIDED);
        if (module0218.$ic21$ == conses_high.getf(var67, (SubLObject)module0218.$ic22$, (SubLObject)module0218.UNPROVIDED) && module0218.NIL != module0172.f10921(var66)) {
            final SubLObject var68 = module0217.f14384(var66, (SubLObject)module0218.$ic23$);
            final SubLObject var69 = conses_high.second(Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(module0226.f15173(var66, (SubLObject)module0218.UNPROVIDED))));
            if (var68.isNumber() && var69.isNumber()) {
                final SubLObject var70 = Numbers.divide(var68, var69);
                if (module0218.NIL != var47) {
                    PrintLow.format((SubLObject)module0218.T, (SubLObject)module0218.$ic24$, new SubLObject[] { var69, var68, var67, var65 });
                }
                return Values.values(var65, var70);
            }
        }
        return Values.values((SubLObject)module0218.NIL, (SubLObject)module0218.NIL);
    }
    
    public static SubLObject f14470() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14449", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14450", "S#17304", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14451", "S#17305", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14452", "S#17306", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14453", "S#13099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14454", "S#17307", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14456", "S#17308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14457", "S#17309", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14458", "S#17310", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14459", "S#17311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14460", "S#17150", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14462", "S#17312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14461", "S#17147", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14463", "S#17313", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14455", "S#17149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14464", "S#17314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14465", "S#17315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14466", "S#17148", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14467", "S#17316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14468", "S#17317", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0218", "f14469", "S#17318", 1, 1, false);
        return (SubLObject)module0218.NIL;
    }
    
    public static SubLObject f14471() {
        module0218.$g2391$ = SubLFiles.defparameter("*INDEX-OVERLAP-ENABLED?*", (SubLObject)module0218.T);
        module0218.$g2392$ = SubLFiles.deflexical("*LOOKUP-OVERLAP-WATERMARK*", (SubLObject)module0218.$ic17$);
        module0218.$g2393$ = SubLFiles.deflexical("S#17319", (SubLObject)module0218.SEVEN_INTEGER);
        return (SubLObject)module0218.NIL;
    }
    
    public static SubLObject f14472() {
        module0012.f368((SubLObject)module0218.$ic5$, (SubLObject)module0218.$ic6$, (SubLObject)module0218.$ic7$, (SubLObject)module0218.NIL, (SubLObject)module0218.$ic8$);
        return (SubLObject)module0218.NIL;
    }
    
    public void declareFunctions() {
        f14470();
    }
    
    public void initializeVariables() {
        f14471();
    }
    
    public void runTopLevelForms() {
        f14472();
    }
    
    static {
        me = (SubLFile)new module0218();
        module0218.$g2391$ = null;
        module0218.$g2392$ = null;
        module0218.$g2393$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic1$ = SubLObjectFactory.makeSymbol("<");
        $ic2$ = SubLObjectFactory.makeSymbol("NUM-INDEX");
        $ic3$ = SubLObjectFactory.makeSymbol("S#17320", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#17321", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("ASSERTIONS-MENTIONING-TERMS");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17322", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#17323", "CYC"));
        $ic7$ = SubLObjectFactory.makeString("Return a list of assertions that mention every term in TERM-LIST.");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $ic9$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#13258", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("MIN");
        $ic15$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic17$ = SubLObjectFactory.makeInteger(25);
        $ic18$ = SubLObjectFactory.makeString("mapping Cyc NARTs");
        $ic19$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic20$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic21$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic22$ = SubLObjectFactory.makeKeyword("INDEX-TYPE");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION-EXTENT"), (SubLObject)SubLObjectFactory.makeKeyword("NART-ARG"));
        $ic24$ = SubLObjectFactory.makeString("~s vs. ~s: ~s ~s~%~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0218.class
	Total time: 248 ms
	
	Decompiled with Procyon 0.5.32.
*/