package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0407 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0407";
    public static final String myFingerPrint = "9b5285bc073f134b3d7a5164ba132abeebf2d70341df610fe4f27fbfa162c87e";
    public static SubLSymbol $g3297$;
    public static SubLSymbol $g3298$;
    private static SubLSymbol $g3299$;
    private static SubLSymbol $g3300$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLFloat $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLFloat $ic42$;
    private static final SubLFloat $ic43$;
    private static final SubLFloat $ic44$;
    
    public static SubLObject f28359(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0407.ZERO_INTEGER);
        return (SubLObject)module0407.NIL;
    }
    
    public static SubLObject f28360(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX31468_native.class) ? module0407.T : module0407.NIL);
    }
    
    public static SubLObject f28361(final SubLObject var1) {
        assert module0407.NIL != f28360(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f28362(final SubLObject var1, final SubLObject var4) {
        assert module0407.NIL != f28360(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f28363(SubLObject var5) {
        if (var5 == module0407.UNPROVIDED) {
            var5 = (SubLObject)module0407.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX31468_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0407.NIL, var7 = var5; module0407.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0407.$ic11$)) {
                f28362(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0407.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f28364(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic13$, (SubLObject)module0407.$ic14$, (SubLObject)module0407.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic15$, (SubLObject)module0407.$ic11$, f28361(var11));
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic16$, (SubLObject)module0407.$ic14$, (SubLObject)module0407.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f28365(final SubLObject var11, final SubLObject var12) {
        return f28364(var11, var12);
    }
    
    public static SubLObject f28366(final SubLObject var13) {
        assert module0407.NIL != Types.consp(var13) : var13;
        final SubLObject var14 = f28363((SubLObject)module0407.UNPROVIDED);
        SubLObject var15 = (SubLObject)module0407.NIL;
        SubLObject var16 = var13;
        SubLObject var17 = (SubLObject)module0407.NIL;
        var17 = var16.first();
        while (module0407.NIL != var16) {
            final SubLObject var18 = f28367((SubLObject)module0407.ZERO_INTEGER, var17);
            var15 = (SubLObject)ConsesLow.cons(var18, var15);
            var16 = var16.rest();
            var17 = var16.first();
        }
        var15 = Sequences.nreverse(var15);
        f28362(var14, var15);
        return var14;
    }
    
    public static SubLObject f28368(final SubLObject var14) {
        assert module0407.NIL != f28360(var14) : var14;
        return f28361(var14);
    }
    
    public static SubLObject f28369(final SubLObject var14) {
        assert module0407.NIL != f28360(var14) : var14;
        return Sequences.length(f28368(var14));
    }
    
    public static SubLObject f28370(final SubLObject var14, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0407.NIL != f28360(var14) : var14;
        if (module0407.NIL == Errors.$ignore_mustsP$.getDynamicValue(var20) && module0407.NIL == module0035.f1995(var19, f28369(var14), (SubLObject)module0407.UNPROVIDED)) {
            Errors.error((SubLObject)module0407.$ic19$, var19, f28369(var14));
        }
        SubLObject var21 = (SubLObject)module0407.NIL;
        SubLObject var18_22 = (SubLObject)module0407.NIL;
        SubLObject var22 = (SubLObject)module0407.NIL;
        SubLObject var24_25 = (SubLObject)module0407.NIL;
        var21 = f28368(var14);
        var18_22 = var21.first();
        var22 = var19;
        var24_25 = var22.first();
        while (module0407.NIL != var22 || module0407.NIL != var21) {
            f28371(var18_22, var24_25);
            var21 = var21.rest();
            var18_22 = var21.first();
            var22 = var22.rest();
            var24_25 = var22.first();
        }
        return var14;
    }
    
    public static SubLObject f28372(final SubLObject var26) {
        final SubLObject var27 = (SubLObject)module0407.$ic20$;
        return Numbers.invert(module0048.f_1X(Numbers.exp(Numbers.minus(Numbers.multiply(var27, var26)))));
    }
    
    public static SubLObject f28373(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0407.ZERO_INTEGER);
        return (SubLObject)module0407.NIL;
    }
    
    public static SubLObject f28374(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX31470_native.class) ? module0407.T : module0407.NIL);
    }
    
    public static SubLObject f28375(final SubLObject var1) {
        assert module0407.NIL != f28374(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f28376(final SubLObject var1) {
        assert module0407.NIL != f28374(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f28377(final SubLObject var1, final SubLObject var4) {
        assert module0407.NIL != f28374(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f28378(final SubLObject var1, final SubLObject var4) {
        assert module0407.NIL != f28374(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f28379(SubLObject var5) {
        if (var5 == module0407.UNPROVIDED) {
            var5 = (SubLObject)module0407.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX31470_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0407.NIL, var7 = var5; module0407.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0407.$ic33$)) {
                f28377(var6, var9);
            }
            else if (var10.eql((SubLObject)module0407.$ic34$)) {
                f28378(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0407.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f28380(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic13$, (SubLObject)module0407.$ic35$, (SubLObject)module0407.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic15$, (SubLObject)module0407.$ic33$, f28375(var11));
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic15$, (SubLObject)module0407.$ic34$, f28376(var11));
        Functions.funcall(var12, var11, (SubLObject)module0407.$ic16$, (SubLObject)module0407.$ic35$, (SubLObject)module0407.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f28381(final SubLObject var11, final SubLObject var12) {
        return f28380(var11, var12);
    }
    
    public static SubLObject f28367(final SubLObject var24, final SubLObject var17) {
        assert module0407.NIL != Types.numberp(var24) : var24;
        assert module0407.NIL != Types.consp(var17) : var17;
        assert module0407.NIL != module0035.f2015(var17) : var17;
        SubLObject var25 = var17;
        SubLObject var26 = (SubLObject)module0407.NIL;
        var26 = var25.first();
        while (module0407.NIL != var25) {
            assert module0407.NIL != Types.numberp(var26) : var26;
            var25 = var25.rest();
            var26 = var25.first();
        }
        final SubLObject var27 = f28379((SubLObject)module0407.UNPROVIDED);
        f28377(var27, var24);
        f28378(var27, var17);
        return var27;
    }
    
    public static SubLObject f28382(final SubLObject var18) {
        assert module0407.NIL != f28374(var18) : var18;
        return f28375(var18);
    }
    
    public static SubLObject f28383(final SubLObject var18) {
        assert module0407.NIL != f28374(var18) : var18;
        return f28376(var18);
    }
    
    public static SubLObject f28371(final SubLObject var18, final SubLObject var24) {
        assert module0407.NIL != f28374(var18) : var18;
        assert module0407.NIL != Types.numberp(var24) : var24;
        f28377(var18, var24);
        return var18;
    }
    
    public static SubLObject f28384() {
        module0407.$g3300$.setGlobalValue(f28366(module0407.$g3299$.getGlobalValue()));
        return (SubLObject)module0407.T;
    }
    
    public static SubLObject f28385() {
        if (module0407.NIL == module0407.$g3300$.getGlobalValue()) {
            f28384();
        }
        return module0407.$g3300$.getGlobalValue();
    }
    
    public static SubLObject f28386(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        final SubLObject var37 = f28385();
        f28387(var37, var33, var34, var35, var36);
        return f28388(var37, var36);
    }
    
    public static SubLObject f28387(final SubLObject var14, final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        final SubLObject var37 = f28389(var33, var34, var35, var36);
        f28370(var14, var37);
        return var14;
    }
    
    public static SubLObject f28389(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        final SubLObject var37 = (SubLObject)ConsesLow.make_list((SubLObject)module0407.$ic41$, (SubLObject)module0407.ZERO_INTEGER);
        final SubLObject var38 = Numbers.multiply((SubLObject)module0407.FOUR_INTEGER, var36);
        final SubLObject var39 = Numbers.add((SubLObject)module0407.$ic42$, module0048.f3321(module0048.f_1X(module0048.f3321(module0048.f_1X(var33)))));
        final SubLObject var40 = Numbers.max(var34, var35);
        ConsesLow.set_nth(var38, var37, var39);
        SubLObject var41;
        for (var41 = (SubLObject)module0407.NIL, var41 = (SubLObject)module0407.ZERO_INTEGER; var41.numL((SubLObject)module0407.THREE_INTEGER); var41 = Numbers.add(var41, (SubLObject)module0407.ONE_INTEGER)) {
            ConsesLow.set_nth(Numbers.add(var38, (SubLObject)module0407.ONE_INTEGER, var41), var37, (SubLObject)module0407.$ic43$);
        }
        ConsesLow.set_nth(Numbers.add(var38, var40), var37, (SubLObject)module0407.$ic44$);
        ConsesLow.set_nth((SubLObject)module0407.TWENTY_INTEGER, var37, (SubLObject)module0407.$ic43$);
        return var37;
    }
    
    public static SubLObject f28388(final SubLObject var14, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0407.ZERO_INTEGER;
        SubLObject var39;
        final SubLObject var38 = var39 = f28390(var36);
        SubLObject var40 = (SubLObject)module0407.NIL;
        var40 = var39.first();
        while (module0407.NIL != var39) {
            final SubLObject var41 = ConsesLow.nth(var40, f28368(var14));
            final SubLObject var42 = f28382(var41);
            final SubLObject var43 = ConsesLow.nth(var36, f28383(var41));
            final SubLObject var44 = Numbers.multiply(var42, var43);
            var37 = Numbers.add(var37, var44);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return f28372(var37);
    }
    
    public static SubLObject f28390(final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0407.NIL;
        SubLObject var38;
        for (var38 = (SubLObject)module0407.NIL, var38 = (SubLObject)module0407.ZERO_INTEGER; var38.numL((SubLObject)module0407.FOUR_INTEGER); var38 = Numbers.add(var38, (SubLObject)module0407.ONE_INTEGER)) {
            var37 = (SubLObject)ConsesLow.cons(Numbers.add(var38, Numbers.multiply((SubLObject)module0407.FOUR_INTEGER, var36)), var37);
        }
        var37 = (SubLObject)ConsesLow.cons((SubLObject)module0407.TWENTY_INTEGER, var37);
        return Sequences.nreverse(var37);
    }
    
    public static SubLObject f28391() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28359", "S#31472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28360", "S#31469", 1, 0, false);
        new $f28360$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28361", "S#31473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28362", "S#31474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28363", "S#31475", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28364", "S#31476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28365", "S#31477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28366", "S#31478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28368", "S#31479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28369", "S#31480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28370", "S#31481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28372", "S#31482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28373", "S#31483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28374", "S#31471", 1, 0, false);
        new $f28374$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28375", "S#31484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28376", "S#31485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28377", "S#31486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28378", "S#31487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28379", "S#31488", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28380", "S#31489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28381", "S#31490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28367", "S#31491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28382", "S#31492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28383", "S#31493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28371", "S#31494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28384", "S#31495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28385", "S#31496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28386", "S#31497", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28387", "S#31498", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28389", "S#31499", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28388", "S#31500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0407", "f28390", "S#31501", 1, 0, false);
        return (SubLObject)module0407.NIL;
    }
    
    public static SubLObject f28392() {
        module0407.$g3297$ = SubLFiles.defconstant("S#31502", (SubLObject)module0407.$ic0$);
        module0407.$g3298$ = SubLFiles.defconstant("S#31503", (SubLObject)module0407.$ic21$);
        module0407.$g3299$ = SubLFiles.deflexical("S#31504", (SubLObject)module0407.$ic39$);
        module0407.$g3300$ = SubLFiles.deflexical("S#31505", (SubLObject)((module0407.NIL != Symbols.boundp((SubLObject)module0407.$ic40$)) ? module0407.$g3300$.getGlobalValue() : module0407.NIL));
        return (SubLObject)module0407.NIL;
    }
    
    public static SubLObject f28393() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0407.$g3297$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0407.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0407.$ic8$);
        Structures.def_csetf((SubLObject)module0407.$ic9$, (SubLObject)module0407.$ic10$);
        Equality.identity((SubLObject)module0407.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0407.$g3297$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0407.$ic17$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0407.$g3298$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0407.$ic27$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0407.$ic28$);
        Structures.def_csetf((SubLObject)module0407.$ic29$, (SubLObject)module0407.$ic30$);
        Structures.def_csetf((SubLObject)module0407.$ic31$, (SubLObject)module0407.$ic32$);
        Equality.identity((SubLObject)module0407.$ic21$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0407.$g3298$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0407.$ic36$));
        module0003.f57((SubLObject)module0407.$ic40$);
        return (SubLObject)module0407.NIL;
    }
    
    public void declareFunctions() {
        f28391();
    }
    
    public void initializeVariables() {
        f28392();
    }
    
    public void runTopLevelForms() {
        f28393();
    }
    
    static {
        me = (SubLFile)new module0407();
        module0407.$g3297$ = null;
        module0407.$g3298$ = null;
        module0407.$g3299$ = null;
        module0407.$g3300$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#31468", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#31469", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31506", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NODES"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31473", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31474", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#31472", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#31469", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#31473", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#31474", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("INPUT-NODES");
        $ic12$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic13$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic14$ = SubLObjectFactory.makeSymbol("S#31475", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic16$ = SubLObjectFactory.makeKeyword("END");
        $ic17$ = SubLObjectFactory.makeSymbol("S#31477", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic19$ = SubLObjectFactory.makeString("Expected ~s to be ~a elements long.");
        $ic20$ = (SubLFloat)SubLObjectFactory.makeDouble(4.924273);
        $ic21$ = SubLObjectFactory.makeSymbol("S#31470", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#31471", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31507", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("WEIGHTS"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31484", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31485", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31486", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31487", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#31483", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#31471", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#31484", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#31486", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#31485", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#31487", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic34$ = SubLObjectFactory.makeKeyword("WEIGHTS");
        $ic35$ = SubLObjectFactory.makeSymbol("S#31488", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#31490", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic38$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic39$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.227514), (SubLObject)SubLObjectFactory.makeDouble(-0.395681), (SubLObject)SubLObjectFactory.makeDouble(-0.392587), (SubLObject)SubLObjectFactory.makeDouble(-0.304583), (SubLObject)SubLObjectFactory.makeDouble(0.717281)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.466911), (SubLObject)SubLObjectFactory.makeDouble(-1.01181), (SubLObject)SubLObjectFactory.makeDouble(0.515608), (SubLObject)SubLObjectFactory.makeDouble(0.186695), (SubLObject)SubLObjectFactory.makeDouble(-0.173123)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.691837), (SubLObject)SubLObjectFactory.makeDouble(-0.39004), (SubLObject)SubLObjectFactory.makeDouble(1.27718), (SubLObject)SubLObjectFactory.makeDouble(0.0985643), (SubLObject)SubLObjectFactory.makeDouble(-0.459222)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.14361), (SubLObject)SubLObjectFactory.makeDouble(-0.100166), (SubLObject)SubLObjectFactory.makeDouble(-0.409217), (SubLObject)SubLObjectFactory.makeDouble(0.703923), (SubLObject)SubLObjectFactory.makeDouble(0.0986236)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.558941), (SubLObject)SubLObjectFactory.makeDouble(-0.654273), (SubLObject)SubLObjectFactory.makeDouble(0.875859), (SubLObject)SubLObjectFactory.makeDouble(-0.547818), (SubLObject)SubLObjectFactory.makeDouble(0.464239)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.0898241), (SubLObject)SubLObjectFactory.makeDouble(1.16297), (SubLObject)SubLObjectFactory.makeDouble(-0.140286), (SubLObject)SubLObjectFactory.makeDouble(0.727112), (SubLObject)SubLObjectFactory.makeDouble(-0.0571363)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.33211), (SubLObject)SubLObjectFactory.makeDouble(0.804213), (SubLObject)SubLObjectFactory.makeDouble(-0.500794), (SubLObject)SubLObjectFactory.makeDouble(0.0836377), (SubLObject)SubLObjectFactory.makeDouble(-0.119423)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.27839), (SubLObject)SubLObjectFactory.makeDouble(-0.424287), (SubLObject)SubLObjectFactory.makeDouble(0.0972779), (SubLObject)SubLObjectFactory.makeDouble(-0.0641412), (SubLObject)SubLObjectFactory.makeDouble(-0.324519)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.04071), (SubLObject)SubLObjectFactory.makeDouble(-1.03764), (SubLObject)SubLObjectFactory.makeDouble(-1.1684), (SubLObject)SubLObjectFactory.makeDouble(-0.285568), (SubLObject)SubLObjectFactory.makeDouble(0.322287)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.35157), (SubLObject)SubLObjectFactory.makeDouble(-0.0978135), (SubLObject)SubLObjectFactory.makeDouble(-0.649702), (SubLObject)SubLObjectFactory.makeDouble(1.0535), (SubLObject)SubLObjectFactory.makeDouble(0.83717)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.0862237), (SubLObject)SubLObjectFactory.makeDouble(0.22735), (SubLObject)SubLObjectFactory.makeDouble(-1.21319), (SubLObject)SubLObjectFactory.makeDouble(-0.531121), (SubLObject)SubLObjectFactory.makeDouble(-0.486909)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.256012), (SubLObject)SubLObjectFactory.makeDouble(0.852522), (SubLObject)SubLObjectFactory.makeDouble(-0.7396), (SubLObject)SubLObjectFactory.makeDouble(0.233292), (SubLObject)SubLObjectFactory.makeDouble(-0.0850184)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.704154), (SubLObject)SubLObjectFactory.makeDouble(-0.182174), (SubLObject)SubLObjectFactory.makeDouble(0.169152), (SubLObject)SubLObjectFactory.makeDouble(-1.2787), (SubLObject)SubLObjectFactory.makeDouble(-0.400246)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.242133), (SubLObject)SubLObjectFactory.makeDouble(-0.671766), (SubLObject)SubLObjectFactory.makeDouble(-1.05614), (SubLObject)SubLObjectFactory.makeDouble(-0.0740336), (SubLObject)SubLObjectFactory.makeDouble(-0.0432617)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.871448), (SubLObject)SubLObjectFactory.makeDouble(0.0101277), (SubLObject)SubLObjectFactory.makeDouble(0.221434), (SubLObject)SubLObjectFactory.makeDouble(-0.0241337), (SubLObject)SubLObjectFactory.makeDouble(-0.717193)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(-0.228881), (SubLObject)SubLObjectFactory.makeDouble(-0.132546), (SubLObject)SubLObjectFactory.makeDouble(-0.240634), (SubLObject)SubLObjectFactory.makeDouble(0.935199), (SubLObject)SubLObjectFactory.makeDouble(0.111408)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.456088), (SubLObject)SubLObjectFactory.makeDouble(-0.189828), (SubLObject)SubLObjectFactory.makeDouble(0.06841), (SubLObject)SubLObjectFactory.makeDouble(-0.112433), (SubLObject)SubLObjectFactory.makeDouble(-0.254772)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.0838212), (SubLObject)SubLObjectFactory.makeDouble(-0.901167), (SubLObject)SubLObjectFactory.makeDouble(0.555404), (SubLObject)SubLObjectFactory.makeDouble(0.126584), (SubLObject)SubLObjectFactory.makeDouble(-1.13132)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.927022), (SubLObject)SubLObjectFactory.makeDouble(-0.294691), (SubLObject)SubLObjectFactory.makeDouble(0.735027), (SubLObject)SubLObjectFactory.makeDouble(0.42247), (SubLObject)SubLObjectFactory.makeDouble(0.263537)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.229667), (SubLObject)SubLObjectFactory.makeDouble(-0.76629), (SubLObject)SubLObjectFactory.makeDouble(1.13279), (SubLObject)SubLObjectFactory.makeDouble(0.0468138), (SubLObject)SubLObjectFactory.makeDouble(-0.392014)), ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.565153), (SubLObject)SubLObjectFactory.makeDouble(-0.082501), (SubLObject)SubLObjectFactory.makeDouble(0.208606), (SubLObject)SubLObjectFactory.makeDouble(0.101688), (SubLObject)SubLObjectFactory.makeDouble(-0.672053)) });
        $ic40$ = SubLObjectFactory.makeSymbol("S#31505", "CYC");
        $ic41$ = SubLObjectFactory.makeInteger(21);
        $ic42$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic43$ = (SubLFloat)SubLObjectFactory.makeDouble(0.03);
        $ic44$ = (SubLFloat)SubLObjectFactory.makeDouble(0.97);
    }
    
    public static final class $sX31468_native extends SubLStructNative
    {
        public SubLObject $input_nodes;
        private static final SubLStructDeclNative structDecl;
        
        public $sX31468_native() {
            this.$input_nodes = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX31468_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$input_nodes;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$input_nodes = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX31468_native.class, module0407.$ic0$, module0407.$ic1$, module0407.$ic2$, module0407.$ic3$, new String[] { "$input_nodes" }, module0407.$ic4$, module0407.$ic5$, module0407.$ic6$);
        }
    }
    
    public static final class $f28360$UnaryFunction extends UnaryFunction
    {
        public $f28360$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31469"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0407.f28360(var3);
        }
    }
    
    public static final class $sX31470_native extends SubLStructNative
    {
        public SubLObject $value;
        public SubLObject $weights;
        private static final SubLStructDeclNative structDecl;
        
        public $sX31470_native() {
            this.$value = (SubLObject)CommonSymbols.NIL;
            this.$weights = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX31470_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$value;
        }
        
        public SubLObject getField3() {
            return this.$weights;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$value = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$weights = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX31470_native.class, module0407.$ic21$, module0407.$ic22$, module0407.$ic23$, module0407.$ic24$, new String[] { "$value", "$weights" }, module0407.$ic25$, module0407.$ic26$, module0407.$ic6$);
        }
    }
    
    public static final class $f28374$UnaryFunction extends UnaryFunction
    {
        public $f28374$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31471"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0407.f28374(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0407.class
	Total time: 151 ms
	
	Decompiled with Procyon 0.5.32.
*/