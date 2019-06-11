package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0036 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0036";
    public static final String myFingerPrint = "95fe18de60efcdccdff48ce22c0909ded4a962986a339d6d8c3580d874f81114";
    public static SubLSymbol $g910$;
    public static SubLSymbol $g911$;
    public static SubLSymbol $g912$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    
    public static SubLObject f2527(final SubLObject var1, final SubLObject var2) {
        return module0112.f7695(var1, var2);
    }
    
    public static SubLObject f2528(final SubLObject var3, final SubLObject var2) {
        return module0112.f7695(var3, var2);
    }
    
    public static SubLObject f2529(final SubLObject var4, final SubLObject var2) {
        return module0112.f7695(var4, var2);
    }
    
    public static SubLObject f2530(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        return module0112.f7696(var5, var6, var7);
    }
    
    public static SubLObject f2531(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return f2532(conses_high.copy_tree(var2), var1, var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2532(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var8, SubLObject var9) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var8 == UNPROVIDED) {
            var8 = $g910$.getDynamicValue();
        }
        if (var9 == UNPROVIDED) {
            var9 = $g911$.getDynamicValue();
        }
        return (NIL != var9) ? f2533(var2, var1, var4, var3, var8, (SubLObject)ZERO_INTEGER, var9, (SubLObject)ZERO_INTEGER) : f2534(var2, var1, var4, var3, var8, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f2534(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var10) {
        if (var10.numGE(var8)) {
            return f2535(var2, var1, var4, var3);
        }
        SubLObject var12;
        SubLObject var11;
        for (var11 = (var12 = f2536(var2, var1, var4, var3)); !var12.isAtom(); var12 = var12.rest()) {
            ConsesLow.rplaca(var12, f2534(var12.first(), var1, var4, var3, var8, Numbers.add(var10, (SubLObject)ONE_INTEGER)));
            ConsesLow.rplacd(var12, f2536(var12.rest(), var1, var4, var3));
        }
        return var11;
    }
    
    public static SubLObject f2533(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var10, final SubLObject var9, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (var10.numGE(var8)) {
            return f2537(var2, var1, var4, var3, var9, var13);
        }
        var14.resetMultipleValues();
        final SubLObject var15 = f2538(var2, var1, var4, var3, var9, var13);
        SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)NIL;
        while (!var17.isAtom()) {
            var14.resetMultipleValues();
            final SubLObject var17_18 = f2533(var17.first(), var1, var4, var3, var8, Numbers.add(var10, (SubLObject)ONE_INTEGER), var9, var16);
            final SubLObject var19_20 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var18 = var17_18;
            var16 = var19_20;
            ConsesLow.rplaca(var17, var18);
            var14.resetMultipleValues();
            final SubLObject var21_22 = f2538(var17.rest(), var1, var4, var3, var9, var16);
            final SubLObject var23_24 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var18 = var21_22;
            var16 = var23_24;
            ConsesLow.rplacd(var17, var18);
            var17 = var17.rest();
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f2536(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3) {
        if (var3.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var3.eql((SubLObject)IDENTITY)) {
            SubLObject var5;
            SubLObject var6;
            for (var5 = var2, var6 = (SubLObject)NIL, var6 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var5.eql(var6); var5 = var6, var6 = ((NIL != f2527(var1, var6)) ? conses_high.copy_tree(f2529(var4, var6)) : var6)) {}
            return var6;
        }
        SubLObject var5;
        SubLObject var6;
        for (var5 = var2, var6 = (SubLObject)NIL, var6 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var5.eql(var6); var5 = var6, var6 = ((NIL != f2527(var1, var6)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var6))) : var6)) {}
        return var6;
    }
    
    public static SubLObject f2538(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var9, SubLObject var13) {
        if (var3.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var3.eql((SubLObject)IDENTITY)) {
            SubLObject var14;
            SubLObject var15;
            for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var14.eql(var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, var15)) : var15)) {
                if (var13.numGE(var9)) {
                    Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
                }
                var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
            }
            return Values.values(var15, var13);
        }
        SubLObject var14;
        SubLObject var15;
        for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var14.eql(var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var15))) : var15)) {
            if (var13.numGE(var9)) {
                Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
            }
            var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
        }
        return Values.values(var15, var13);
    }
    
    public static SubLObject f2539(final SubLObject var27, final SubLObject var28, final SubLObject var29) {
        return (SubLObject)ConsesLow.listS(var27, var28, var29);
    }
    
    public static SubLObject f2540(final SubLObject var30, final SubLObject var27, final SubLObject var28, final SubLObject var29) {
        final SubLObject var31 = var30.rest();
        ConsesLow.rplaca(var30, var27);
        ConsesLow.rplaca(var31, var28);
        ConsesLow.rplacd(var31, var29);
        return var30;
    }
    
    public static SubLObject f2541(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic5$);
        var36 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic6$, var36);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2542(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic5$);
        var36 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, var36);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2543(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic5$);
        var36 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, var36);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2544(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic9$);
        var36 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic9$);
        var37 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, var36, var37);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2545(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic11$);
        var36 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic11$);
        var37 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var36), var37);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic11$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2546(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic13$);
        var36 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic13$);
        var37 = var35.first();
        var35 = var35.rest();
        if (NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var36), var37);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2535(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var5 = (SubLObject)NIL;
        var5 = f2536(var2, var1, var4, var3);
        if (var5.isAtom()) {
            return var5;
        }
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        var11 = (SubLObject)ConsesLow.list(f2539(var5, Symbols.symbol_function((SubLObject)$ic10$), var5.first()), f2539(var5, Symbols.symbol_function((SubLObject)$ic14$), var5.rest()));
        var12 = var11.first();
        while (NIL != var11) {
            var10 = var11;
            var11 = var11.rest();
            var6 = var12.first();
            var7 = conses_high.cadr(var12);
            var8 = conses_high.cddr(var12);
            var9 = f2536(var8, var1, var4, var3);
            Functions.funcall(var7, var6, var9);
            if (!var9.isAtom()) {
                var11 = module0035.f2071(f2539(var9, Symbols.symbol_function((SubLObject)$ic10$), var9.first()), (SubLObject)ConsesLow.cons(f2540(var12, var9, Symbols.symbol_function((SubLObject)$ic14$), var9.rest()), var11), var10);
            }
           // var11 = var11;
            var12 = var11.first();
        }
        return var5;
    }
    
    public static SubLObject f2537(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var9, SubLObject var13) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var9 == UNPROVIDED) {
            var9 = $g911$.getDynamicValue();
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f2538(var2, var1, var4, var3, var9, var13);
        SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (var15.isAtom()) {
            return var15;
        }
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        var22 = (SubLObject)ConsesLow.list(f2539(var15, Symbols.symbol_function((SubLObject)$ic10$), var15.first()), f2539(var15, Symbols.symbol_function((SubLObject)$ic14$), var15.rest()));
        var23 = var22.first();
        while (NIL != var22) {
            var21 = var22;
            var22 = var22.rest();
            var17 = var23.first();
            var18 = conses_high.cadr(var23);
            var19 = conses_high.cddr(var23);
            var14.resetMultipleValues();
            final SubLObject var54_55 = f2538(var19, var1, var4, var3, var9, var16);
            final SubLObject var56_57 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var20 = var54_55;
            var16 = var56_57;
            Functions.funcall(var18, var17, var20);
            if (!var20.isAtom()) {
                var22 = module0035.f2071(f2539(var20, Symbols.symbol_function((SubLObject)$ic10$), var20.first()), (SubLObject)ConsesLow.cons(f2540(var23, var20, Symbols.symbol_function((SubLObject)$ic14$), var20.rest()), var22), var21);
            }
            //var22 = var22;
            var23 = var22.first();
        }
        return var15;
    }
    
    public static SubLObject f2547(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var5 == UNPROVIDED) {
            var5 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        return f2548(conses_high.copy_tree(var2), var1, var4, var3, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2548(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var5, SubLObject var8, SubLObject var9) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var5 == UNPROVIDED) {
            var5 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var8 == UNPROVIDED) {
            var8 = $g910$.getDynamicValue();
        }
        if (var9 == UNPROVIDED) {
            var9 = $g912$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != var9) {
            var10.resetMultipleValues();
            final SubLObject var11 = f2549(var2, var1, var4, var3, var5, var8, (SubLObject)ZERO_INTEGER, var9, (SubLObject)ZERO_INTEGER);
            final SubLObject var12 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            return var11;
        }
        return f2550(var2, var1, var4, var3, var5, var8, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f2550(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var8, final SubLObject var10) {
        if (var10.numGE(var8)) {
            return f2551(var2, var1, var4, var3, var5);
        }
        SubLObject var12;
        SubLObject var11;
        for (var11 = (var12 = f2552(var2, var1, var4, var3, var5)); !var12.isAtom(); var12 = var12.rest()) {
            ConsesLow.rplaca(var12, f2550(var12.first(), var1, var4, var3, var5, var8, Numbers.add(var10, (SubLObject)ONE_INTEGER)));
            ConsesLow.rplacd(var12, f2552(var12.rest(), var1, var4, var3, var5));
        }
        return var11;
    }
    
    public static SubLObject f2549(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var8, final SubLObject var10, final SubLObject var9, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (var10.numGE(var8)) {
            return f2553(var2, var1, var4, var3, var5, var9, var13);
        }
        var14.resetMultipleValues();
        final SubLObject var15 = f2554(var2, var1, var4, var3, var5, var9, var13);
        SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)NIL;
        while (!var17.isAtom()) {
            var14.resetMultipleValues();
            final SubLObject var59_60 = f2549(var17.first(), var1, var4, var3, var5, var8, Numbers.add(var10, (SubLObject)ONE_INTEGER), var9, var16);
            final SubLObject var61_62 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var18 = var59_60;
            var16 = var61_62;
            ConsesLow.rplaca(var17, var18);
            var14.resetMultipleValues();
            final SubLObject var63_64 = f2554(var17.rest(), var1, var4, var3, var5, var9, var16);
            final SubLObject var65_66 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var18 = var63_64;
            var16 = var65_66;
            ConsesLow.rplacd(var17, var18);
            var17 = var17.rest();
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f2551(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var5 == UNPROVIDED) {
            var5 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var6 = f2552(var2, var1, var4, var3, var5);
        if (var6.isAtom()) {
            return var6;
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        var12 = (SubLObject)ConsesLow.list(f2539(var6, Symbols.symbol_function((SubLObject)$ic10$), var6.first()), f2539(var6, Symbols.symbol_function((SubLObject)$ic14$), var6.rest()));
        var13 = var12.first();
        while (NIL != var12) {
            var11 = var12;
            var12 = var12.rest();
            var7 = var13.first();
            var8 = conses_high.cadr(var13);
            var9 = conses_high.cddr(var13);
            var10 = f2552(var9, var1, var4, var3, var5);
            Functions.funcall(var8, var7, var10);
            if (!var10.isAtom()) {
                var12 = module0035.f2071(f2539(var10, Symbols.symbol_function((SubLObject)$ic10$), var10.first()), (SubLObject)ConsesLow.cons(f2540(var13, var10, Symbols.symbol_function((SubLObject)$ic14$), var10.rest()), var12), var11);
            }
           // var12 = var12;
            var13 = var12.first();
        }
        return var6;
    }
    
    public static SubLObject f2553(final SubLObject var2, final SubLObject var1, final SubLObject var4, SubLObject var3, SubLObject var5, SubLObject var9, SubLObject var13) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var5 == UNPROVIDED) {
            var5 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var9 == UNPROVIDED) {
            var9 = $g912$.getDynamicValue();
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f2554(var2, var1, var4, var3, var5, var9, var13);
        SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (var15.isAtom()) {
            return Values.values(var15, var16);
        }
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        var22 = (SubLObject)ConsesLow.list(f2539(var15, Symbols.symbol_function((SubLObject)$ic10$), var15.first()), f2539(var15, Symbols.symbol_function((SubLObject)$ic14$), var15.rest()));
        var23 = var22.first();
        while (NIL != var22) {
            var21 = var22;
            var22 = var22.rest();
            var17 = var23.first();
            var18 = conses_high.cadr(var23);
            var19 = conses_high.cddr(var23);
            var14.resetMultipleValues();
            final SubLObject var67_68 = f2554(var19, var1, var4, var3, var5, var9, var16);
            final SubLObject var69_70 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var20 = var67_68;
            var16 = var69_70;
            Functions.funcall(var18, var17, var20);
            if (!var20.isAtom()) {
                var22 = module0035.f2071(f2539(var20, Symbols.symbol_function((SubLObject)$ic10$), var20.first()), (SubLObject)ConsesLow.cons(f2540(var23, var20, Symbols.symbol_function((SubLObject)$ic14$), var20.rest()), var22), var21);
            }
            //var22 = var22;
            var23 = var22.first();
        }
        return var15;
    }
    
    public static SubLObject f2552(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var5) {
        if (var3.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var3.eql((SubLObject)IDENTITY)) {
            if (var5.eql(Symbols.symbol_function((SubLObject)EQUAL)) || var5.equal((SubLObject)EQUAL)) {
                SubLObject var6;
                SubLObject var7;
                for (var6 = var2, var7 = (SubLObject)NIL, var7 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var6.eql(var7) && !var6.equal(var7); var6 = var7, var7 = ((NIL != f2527(var1, var7)) ? conses_high.copy_tree(f2529(var4, var7)) : var7)) {}
                return var7;
            }
            SubLObject var6;
            SubLObject var7;
            for (var6 = var2, var7 = (SubLObject)NIL, var7 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var6.eql(var7) && NIL == f2530(var5, var6, var7); var6 = var7, var7 = ((NIL != f2527(var1, var7)) ? conses_high.copy_tree(f2529(var4, var7)) : var7)) {}
            return var7;
        }
        else {
            if (var5.eql(Symbols.symbol_function((SubLObject)EQUAL)) || var5.equal((SubLObject)EQUAL)) {
                SubLObject var6;
                SubLObject var7;
                for (var6 = var2, var7 = (SubLObject)NIL, var7 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var6.eql(var7) && !var6.equal(var7); var6 = var7, var7 = ((NIL != f2527(var1, var7)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var7))) : var7)) {}
                return var7;
            }
            SubLObject var6;
            SubLObject var7;
            for (var6 = var2, var7 = (SubLObject)NIL, var7 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var6.eql(var7) && NIL == f2530(var5, var6, var7); var6 = var7, var7 = ((NIL != f2527(var1, var7)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var7))) : var7)) {}
            return var7;
        }
    }
    
    public static SubLObject f2554(final SubLObject var2, final SubLObject var1, final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var9, SubLObject var13) {
        if (var3.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var3.eql((SubLObject)IDENTITY)) {
            if (var5.eql(Symbols.symbol_function((SubLObject)EQUAL)) || var5.equal((SubLObject)EQUAL)) {
                SubLObject var14;
                SubLObject var15;
                for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var14.eql(var15) && !var14.equal(var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, var15)) : var15)) {
                    if (var13.numGE(var9)) {
                        Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
                    }
                    var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                }
                return Values.values(var15, var13);
            }
            SubLObject var14;
            SubLObject var15;
            for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, var2)) : var2); !var14.eql(var15) && NIL == f2530(var5, var14, var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, var15)) : var15)) {
                if (var13.numGE(var9)) {
                    Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
                }
                var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
            }
            return Values.values(var15, var13);
        }
        else {
            if (var5.eql(Symbols.symbol_function((SubLObject)EQUAL)) || var5.equal((SubLObject)EQUAL)) {
                SubLObject var14;
                SubLObject var15;
                for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var14.eql(var15) && !var14.equal(var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var15))) : var15)) {
                    if (var13.numGE(var9)) {
                        Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
                    }
                    var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                }
                return Values.values(var15, var13);
            }
            SubLObject var14;
            SubLObject var15;
            for (var14 = var2, var15 = (SubLObject)NIL, var15 = ((NIL != f2527(var1, var2)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var2))) : var2); !var14.eql(var15) && NIL == f2530(var5, var14, var15); var14 = var15, var15 = ((NIL != f2527(var1, var15)) ? conses_high.copy_tree(f2529(var4, f2528(var3, var15))) : var15)) {
                if (var13.numGE(var9)) {
                    Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13, var9));
                }
                var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
            }
            return Values.values(var15, var13);
        }
    }
    
    public static SubLObject f2555() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2527", "S#3860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2528", "S#3861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2529", "S#3862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2530", "S#3863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2531", "TRANSFORM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2532", "NTRANSFORM", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2534", "S#3864", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2533", "S#3865", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2536", "S#3866", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2538", "S#3867", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2539", "S#3868", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2540", "S#3869", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2541", "S#3870");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2542", "S#3871");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2543", "S#3872");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2544", "S#3873");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2545", "S#3874");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0036", "f2546", "S#3875");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2535", "S#3876", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2537", "S#3877", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2547", "QUIESCENT-TRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2548", "QUIESCENT-NTRANSFORM", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2550", "S#3878", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2549", "S#3879", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2551", "S#3880", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2553", "S#3881", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2552", "S#3882", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0036", "f2554", "S#3883", 7, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2556() {
        $g910$ = SubLFiles.defparameter("S#3884", (SubLObject)$ic0$);
        $g911$ = SubLFiles.defparameter("S#3885", (SubLObject)NIL);
        $g912$ = SubLFiles.defparameter("S#3886", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2557() {
        module0002.f38((SubLObject)$ic2$);
        module0002.f38((SubLObject)$ic3$);
        module0002.f38((SubLObject)$ic15$);
        module0002.f38((SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f2555();
    }
    
    public void initializeVariables() {
        f2556();
    }
    
    public void runTopLevelForms() {
        f2557();
    }
    
    static {
        me = (SubLFile)new module0036();
        $g910$ = null;
        $g911$ = null;
        $g912$ = null;
        $ic0$ = makeInteger(212);
        $ic1$ = makeInteger(1024);
        $ic2$ = makeSymbol("TRANSFORM");
        $ic3$ = makeSymbol("NTRANSFORM");
        $ic4$ = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#3887", "CYC"));
        $ic6$ = makeSymbol("CAR");
        $ic7$ = makeSymbol("CADR");
        $ic8$ = makeSymbol("CDDR");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#3887", "CYC"), (SubLObject)makeSymbol("S#3888", "CYC"));
        $ic10$ = makeSymbol("RPLACA");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#3887", "CYC"), (SubLObject)makeSymbol("S#3889", "CYC"));
        $ic12$ = makeSymbol("CDR");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#3887", "CYC"), (SubLObject)makeSymbol("S#3890", "CYC"));
        $ic14$ = makeSymbol("RPLACD");
        $ic15$ = makeSymbol("QUIESCENT-TRANSFORM");
        $ic16$ = makeSymbol("QUIESCENT-NTRANSFORM");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 150 ms
	
	Decompiled with Procyon 0.5.32.
*/