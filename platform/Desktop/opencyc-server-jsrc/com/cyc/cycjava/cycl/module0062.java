package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0062 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0062";
    public static final String myFingerPrint = "db41266a931cecb765a52cacff5caf4af817c2d4f5ed1e1573712679cd922770";
    private static SubLSymbol $g1059$;
    public static SubLSymbol $g1060$;
    public static SubLSymbol $g1061$;
    private static SubLSymbol $g1062$;
    public static SubLSymbol $g1063$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
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
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    
    public static SubLObject f4489(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        try {
            var3.throwStack.push($ic0$);
            final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic1$), var3);
                try {
                    final SubLObject var7_8 = $g1059$.currentBinding(var3);
                    try {
                        $g1059$.bind((SubLObject)NIL, var3);
                        if (NIL != f4490(var1, var2)) {
                            var4 = (SubLObject)T;
                            var5 = Sequences.nreverse($g1059$.getDynamicValue(var3));
                        }
                    }
                    finally {
                        $g1059$.rebind(var7_8, var3);
                    }
                }
                catch (Throwable var8) {
                    Errors.handleThrowable(var8, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var7, var3);
            }
        }
        catch (Throwable var9) {
            var6 = Errors.handleThrowable(var9, (SubLObject)$ic0$);
        }
        finally {
            var3.throwStack.pop();
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f4491(final SubLObject var1, final SubLObject var2) {
        return f4490(var1, var2);
    }
    
    public static SubLObject f4492(final SubLObject var2, final SubLObject var1) {
        return f4489(var1, var2);
    }
    
    public static SubLObject f4493(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic2$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic2$);
        var16 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic2$);
        var17 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic2$);
        var18 = var14.first();
        var14 = var14.rest();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = var14;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var20_21 = (SubLObject)NIL;
        while (NIL != var20) {
            cdestructuring_bind.destructuring_bind_must_consp(var20, var13, (SubLObject)$ic2$);
            var20_21 = var20.first();
            var20 = var20.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var20, var13, (SubLObject)$ic2$);
            if (NIL == conses_high.member(var20_21, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var21 = (SubLObject)T;
            }
            if (var20_21 == $ic4$) {
                var19 = var20.first();
            }
            var20 = var20.rest();
        }
        if (NIL != var21 && NIL == var19) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic2$);
        }
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var14);
        SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
        final SubLObject var24;
        var14 = (var24 = var15);
        if (NIL == var23) {
            var23 = (SubLObject)$ic6$;
        }
        final SubLObject var25 = (SubLObject)$ic7$;
        final SubLObject var26 = (SubLObject)$ic8$;
        final SubLObject var27 = f4494(var16, var26);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var25, var26), (SubLObject)ConsesLow.list(var23, var17, var18), ConsesLow.append((SubLObject)((NIL != var27) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic10$, var25, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var27, ConsesLow.append(var24, (SubLObject)NIL)))) : ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic12$, var26), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var25, ConsesLow.append(var24, (SubLObject)NIL)))), (SubLObject)NIL));
    }
    
    public static SubLObject f4494(final SubLObject var16, final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var16;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            final SubLObject var30 = (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var26, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var29)));
            var27 = (SubLObject)ConsesLow.cons(var30, var27);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f4490(final SubLObject var1, final SubLObject var2) {
        return f4495(var1, var2);
    }
    
    public static SubLObject f4496(final SubLObject var30, final SubLObject var2) {
        return Functions.funcall(var30, var2);
    }
    
    public static SubLObject f4497(final SubLObject var30, final SubLObject var1, final SubLObject var2) {
        return Functions.funcall(var30, var1, var2);
    }
    
    public static SubLObject f4495(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (var1.isAtom()) {
            if (var1.eql((SubLObject)$ic15$)) {
                return (SubLObject)T;
            }
            if (var1.eql((SubLObject)$ic16$)) {
                return (SubLObject)NIL;
            }
            SubLObject var4 = $g1060$.getDynamicValue(var3);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                SubLObject var7;
                final SubLObject var6 = var7 = var5;
                SubLObject var8 = (SubLObject)NIL;
                SubLObject var9 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic17$);
                var8 = var7.first();
                var7 = var7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic17$);
                var9 = var7.first();
                var7 = var7.rest();
                if (NIL == var7) {
                    if (var8.eql(var1)) {
                        return f4496(var9, var2);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic17$);
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
            return Equality.equal(var1, var2);
        }
        else {
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic18$);
            var10 = var1.first();
            final SubLObject var12 = var11 = var1.rest();
            final SubLObject var13 = var10;
            if (var13.eql((SubLObject)$ic19$)) {
                return f4498(var1, var2);
            }
            if (var13.eql((SubLObject)$ic20$)) {
                return f4499(var1, var2);
            }
            if (var13.eql((SubLObject)$ic21$)) {
                return f4500(var1, var2);
            }
            if (var13.eql((SubLObject)$ic22$)) {
                return f4501(var1, var2);
            }
            if (var13.eql((SubLObject)$ic23$)) {
                SubLObject var42_43;
                final SubLObject var40_41 = var42_43 = var11;
                SubLObject var14 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var42_43, var40_41, (SubLObject)$ic24$);
                var14 = var42_43.first();
                var42_43 = var42_43.rest();
                if (NIL == var42_43) {
                    return (SubLObject)makeBoolean(NIL == f4495(var14, var2));
                }
                cdestructuring_bind.cdestructuring_bind_error(var40_41, (SubLObject)$ic24$);
            }
            else if (var13.eql((SubLObject)$ic25$)) {
                final SubLObject var15 = Numbers.subtract(Sequences.length(var11), (SubLObject)ONE_INTEGER);
                if (ZERO_INTEGER.eql(var15)) {
                    SubLObject var48_49;
                    final SubLObject var46_47 = var48_49 = var11;
                    SubLObject var16 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var48_49, var46_47, (SubLObject)$ic26$);
                    var16 = var48_49.first();
                    var48_49 = var48_49.rest();
                    if (NIL == var48_49) {
                        return module0035.sublisp_boolean(f4502(var16, var2));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var46_47, (SubLObject)$ic26$);
                }
                else if (ONE_INTEGER.eql(var15)) {
                    SubLObject var53_54;
                    final SubLObject var51_52 = var53_54 = var11;
                    SubLObject var16 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var53_54, var51_52, (SubLObject)$ic27$);
                    var16 = var53_54.first();
                    var53_54 = var53_54.rest();
                    final SubLObject var17 = (SubLObject)(var53_54.isCons() ? var53_54.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var53_54, var51_52, (SubLObject)$ic27$);
                    var53_54 = var53_54.rest();
                    if (NIL == var53_54) {
                        return module0035.sublisp_boolean(f4503(var16, var2, var17));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var51_52, (SubLObject)$ic27$);
                }
                else if (TWO_INTEGER.eql(var15)) {
                    SubLObject var58_59;
                    final SubLObject var56_57 = var58_59 = var11;
                    SubLObject var16 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)$ic28$);
                    var16 = var58_59.first();
                    var58_59 = var58_59.rest();
                    final SubLObject var17 = (SubLObject)(var58_59.isCons() ? var58_59.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var58_59, var56_57, (SubLObject)$ic28$);
                    var58_59 = var58_59.rest();
                    final SubLObject var18 = (SubLObject)(var58_59.isCons() ? var58_59.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var58_59, var56_57, (SubLObject)$ic28$);
                    var58_59 = var58_59.rest();
                    if (NIL == var58_59) {
                        return module0035.sublisp_boolean(f4504(var16, var2, var17, var18));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var56_57, (SubLObject)$ic28$);
                }
                else if (THREE_INTEGER.eql(var15)) {
                    SubLObject var63_64;
                    final SubLObject var61_62 = var63_64 = var11;
                    SubLObject var16 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var63_64, var61_62, (SubLObject)$ic29$);
                    var16 = var63_64.first();
                    var63_64 = var63_64.rest();
                    final SubLObject var17 = (SubLObject)(var63_64.isCons() ? var63_64.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var63_64, var61_62, (SubLObject)$ic29$);
                    var63_64 = var63_64.rest();
                    final SubLObject var18 = (SubLObject)(var63_64.isCons() ? var63_64.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var63_64, var61_62, (SubLObject)$ic29$);
                    var63_64 = var63_64.rest();
                    final SubLObject var19 = (SubLObject)(var63_64.isCons() ? var63_64.first() : NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var63_64, var61_62, (SubLObject)$ic29$);
                    var63_64 = var63_64.rest();
                    if (NIL == var63_64) {
                        return module0035.sublisp_boolean(f4505(var16, var2, var17, var18, var19));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var61_62, (SubLObject)$ic29$);
                }
            }
            else if (var13.eql((SubLObject)$ic30$)) {
                SubLObject var68_69;
                final SubLObject var66_67 = var68_69 = var11;
                SubLObject var14 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var68_69, var66_67, (SubLObject)$ic24$);
                var14 = var68_69.first();
                var68_69 = var68_69.rest();
                if (NIL == var68_69) {
                    return f4506(var14, var2);
                }
                cdestructuring_bind.cdestructuring_bind_error(var66_67, (SubLObject)$ic24$);
            }
            else if (var13.eql((SubLObject)$ic31$)) {
                SubLObject var72_73;
                final SubLObject var70_71 = var72_73 = var11;
                SubLObject var14 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var72_73, var70_71, (SubLObject)$ic24$);
                var14 = var72_73.first();
                var72_73 = var72_73.rest();
                if (NIL == var72_73) {
                    return f4507(var14, var2);
                }
                cdestructuring_bind.cdestructuring_bind_error(var70_71, (SubLObject)$ic24$);
            }
            else {
                if (!var13.eql((SubLObject)$ic32$)) {
                    SubLObject var20 = $g1061$.getDynamicValue(var3);
                    SubLObject var21 = (SubLObject)NIL;
                    var21 = var20.first();
                    while (NIL != var20) {
                        SubLObject var81_82;
                        final SubLObject var79_80 = var81_82 = var21;
                        SubLObject var22 = (SubLObject)NIL;
                        SubLObject var23 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var81_82, var79_80, (SubLObject)$ic17$);
                        var22 = var81_82.first();
                        var81_82 = var81_82.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var81_82, var79_80, (SubLObject)$ic17$);
                        var23 = var81_82.first();
                        var81_82 = var81_82.rest();
                        if (NIL == var81_82) {
                            if (var22.eql(var10)) {
                                return f4497(var23, var1, var2);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var79_80, (SubLObject)$ic17$);
                        }
                        var20 = var20.rest();
                        var21 = var20.first();
                    }
                    return f4508(var1, var2);
                }
                SubLObject var76_77;
                final SubLObject var74_75 = var76_77 = var11;
                SubLObject var24 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic33$);
                var24 = var76_77.first();
                var76_77 = var76_77.rest();
                if (NIL == var76_77) {
                    return Equality.equal(var24, var2);
                }
                cdestructuring_bind.cdestructuring_bind_error(var74_75, (SubLObject)$ic33$);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f4498(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = conses_high.second(var1);
        $g1059$.setDynamicValue(module0035.f2306($g1059$.getDynamicValue(var3), var4, var2, Symbols.symbol_function((SubLObject)EQL)), var3);
        return (SubLObject)T;
    }
    
    public static SubLObject f4499(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = conses_high.second(var1);
        var3.resetMultipleValues();
        final SubLObject var5 = module0035.f2293($g1059$.getDynamicValue(var3), var4, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var6 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL != var6) {
            return f4495(var5, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4500(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = var1.rest();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL == f4495(var4, var2)) {
                return (SubLObject)NIL;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f4501(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = var1.rest();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != f4495(var4, var2)) {
                return (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4502(final SubLObject var50, final SubLObject var2) {
        if (NIL != module0112.f7693(var50)) {
            return module0112.f7695(var50, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4503(final SubLObject var50, final SubLObject var2, final SubLObject var55) {
        if (NIL != module0112.f7693(var50)) {
            return module0112.f7696(var50, var2, var55);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4504(final SubLObject var50, final SubLObject var2, final SubLObject var55, final SubLObject var60) {
        if (NIL != module0112.f7693(var50)) {
            return module0112.f7697(var50, var2, var55, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4505(final SubLObject var50, final SubLObject var2, final SubLObject var55, final SubLObject var60, final SubLObject var65) {
        if (NIL != module0112.f7693(var50)) {
            return module0112.f7698(var50, var2, var55, var60, var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4506(final SubLObject var44, final SubLObject var2) {
        return module0035.f2428(var44, var2, Symbols.symbol_function((SubLObject)$ic34$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4507(final SubLObject var44, final SubLObject var2) {
        return module0035.f2439(var44, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4508(final SubLObject var1, final SubLObject var2) {
        if (var2.isAtom()) {
            return (SubLObject)NIL;
        }
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic18$);
        var3 = var1.first();
        final SubLObject var5 = var4 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic35$);
        var6 = var2.first();
        final SubLObject var90_91 = var7 = var2.rest();
        if (NIL == f4495(var3, var6)) {
            return (SubLObject)NIL;
        }
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var9 = (SubLObject)NIL, var8 = var4, var9 = var7; !var8.isAtom() && !var9.isAtom(); var8 = var8.rest(), var9 = var9.rest()) {
            var10 = var8.first();
            var11 = var9.first();
            if (NIL == f4495(var10, var11)) {
                return (SubLObject)NIL;
            }
        }
        return f4495(var8, var9);
    }
    
    public static SubLObject f4509(final SubLObject var1, final SubLObject var2, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g1062$.currentBinding(var6);
        try {
            $g1062$.bind(var5, var6);
            var7 = f4510(var1, var2);
            var8 = $g1062$.getDynamicValue(var6);
        }
        finally {
            $g1062$.rebind(var9, var6);
        }
        return Values.values(var7, var8);
    }
    
    public static SubLObject f4511(final SubLObject var2, final SubLObject var1, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f4509(var1, var2, var5);
    }
    
    public static SubLObject f4510(final SubLObject var1, final SubLObject var2) {
        return f4512(var1, var2);
    }
    
    public static SubLObject f4512(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (!var1.isAtom()) {
            SubLObject var4 = (SubLObject)NIL;
            SubLObject var5 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic18$);
            var4 = var1.first();
            final SubLObject var6 = var5 = var1.rest();
            final SubLObject var7 = var4;
            if (var7.eql((SubLObject)$ic20$)) {
                SubLObject var104_105;
                final SubLObject var102_103 = var104_105 = var5;
                SubLObject var8 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var104_105, var102_103, (SubLObject)$ic38$);
                var8 = var104_105.first();
                var104_105 = var104_105.rest();
                if (NIL == var104_105) {
                    return module0035.f2294($g1062$.getDynamicValue(var3), var8, Symbols.symbol_function((SubLObject)EQL), (SubLObject)NIL);
                }
                cdestructuring_bind.cdestructuring_bind_error(var102_103, (SubLObject)$ic38$);
            }
            else {
                if (var7.eql((SubLObject)$ic39$)) {
                    return f4513(var1, var2);
                }
                if (var7.eql((SubLObject)$ic40$)) {
                    return f4514(var1, var2);
                }
                if (var7.eql((SubLObject)$ic41$)) {
                    return f4515(var1, var2);
                }
                if (!var7.eql((SubLObject)$ic32$)) {
                    return f4516(var1, var2);
                }
                SubLObject var108_109;
                final SubLObject var106_107 = var108_109 = var5;
                SubLObject var9 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var108_109, var106_107, (SubLObject)$ic33$);
                var9 = var108_109.first();
                var108_109 = var108_109.rest();
                if (NIL == var108_109) {
                    return var9;
                }
                cdestructuring_bind.cdestructuring_bind_error(var106_107, (SubLObject)$ic33$);
            }
            return (SubLObject)NIL;
        }
        if (var1.eql((SubLObject)$ic36$)) {
            return var2;
        }
        if (var1.eql((SubLObject)$ic37$)) {
            return $g1062$.getDynamicValue(var3);
        }
        return var1;
    }
    
    public static SubLObject f4513(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic42$);
        var4 = var1.first();
        SubLObject var7 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic42$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic42$);
        var6 = var7.first();
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic42$);
            return (SubLObject)NIL;
        }
        if (!var2.isList() || !var5.isList() || NIL == module0035.f1995(var2, Sequences.length(var5), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var28_115 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var117_118 = (SubLObject)NIL;
        var8 = var5;
        var28_115 = var8.first();
        var9 = var2;
        var117_118 = var9.first();
        while (NIL != var9 || NIL != var8) {
            $g1062$.setDynamicValue(module0035.f2306($g1062$.getDynamicValue(var3), var28_115, var117_118, Symbols.symbol_function((SubLObject)EQL)), var3);
            var8 = var8.rest();
            var28_115 = var8.first();
            var9 = var9.rest();
            var117_118 = var9.first();
        }
        return f4512(var6, (SubLObject)NIL);
    }
    
    public static SubLObject f4514(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic43$);
        var4 = var1.first();
        SubLObject var7 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic43$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic43$);
        var6 = var7.first();
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic43$);
            return (SubLObject)NIL;
        }
        var3.resetMultipleValues();
        final SubLObject var8 = (NIL != $g1063$.getDynamicValue(var3)) ? Functions.funcall($g1063$.getDynamicValue(var3), var5, var2) : f4489(var5, var2);
        final SubLObject var9 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        SubLObject var10 = var9;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            SubLObject var125_126;
            final SubLObject var123_124 = var125_126 = var11;
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var125_126, var123_124, (SubLObject)$ic44$);
            var12 = var125_126.first();
            var125_126 = (var13 = var125_126.rest());
            $g1062$.setDynamicValue(module0035.f2306($g1062$.getDynamicValue(var3), var12, var13, Symbols.symbol_function((SubLObject)EQL)), var3);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return f4512(var6, (SubLObject)NIL);
    }
    
    public static SubLObject f4515(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic45$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)$ic45$);
        var4 = var5.first();
        SubLObject var6;
        var5 = (var6 = var5.rest());
        final SubLObject var7 = Sequences.length(var6);
        if (!var7.numLE((SubLObject)FOUR_INTEGER) || NIL == Symbols.fboundp(var4)) {
            var6 = conses_high.copy_list(var6);
            SubLObject var8;
            SubLObject var9;
            for (var8 = (SubLObject)NIL, var8 = var6; !var8.isAtom(); var8 = var8.rest()) {
                var9 = var8.first();
                ConsesLow.rplaca(var8, f4512(var9, var2));
            }
            return module0112.f7692(var4, var6);
        }
        SubLObject var133_134;
        final SubLObject var131_132 = var133_134 = var6;
        SubLObject var10 = (SubLObject)(var133_134.isCons() ? var133_134.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var133_134, var131_132, (SubLObject)$ic46$);
        var133_134 = var133_134.rest();
        SubLObject var11 = (SubLObject)(var133_134.isCons() ? var133_134.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var133_134, var131_132, (SubLObject)$ic46$);
        var133_134 = var133_134.rest();
        SubLObject var12 = (SubLObject)(var133_134.isCons() ? var133_134.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var133_134, var131_132, (SubLObject)$ic46$);
        var133_134 = var133_134.rest();
        SubLObject var13 = (SubLObject)(var133_134.isCons() ? var133_134.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var133_134, var131_132, (SubLObject)$ic46$);
        var133_134 = var133_134.rest();
        if (NIL != var133_134) {
            cdestructuring_bind.cdestructuring_bind_error(var131_132, (SubLObject)$ic46$);
            return (SubLObject)NIL;
        }
        if (ZERO_INTEGER.numL(var7)) {
            var10 = f4512(var10, var2);
            if (ONE_INTEGER.numL(var7)) {
                var11 = f4512(var11, var2);
                if (TWO_INTEGER.numL(var7)) {
                    var12 = f4512(var12, var2);
                    if (THREE_INTEGER.numL(var7)) {
                        var13 = f4512(var13, var2);
                    }
                }
            }
        }
        final SubLObject var14 = var7;
        if (var14.eql((SubLObject)ZERO_INTEGER)) {
            return Functions.funcall(var4);
        }
        if (var14.eql((SubLObject)ONE_INTEGER)) {
            return Functions.funcall(var4, var10);
        }
        if (var14.eql((SubLObject)TWO_INTEGER)) {
            return Functions.funcall(var4, var10, var11);
        }
        if (var14.eql((SubLObject)THREE_INTEGER)) {
            return Functions.funcall(var4, var10, var11, var12);
        }
        return Functions.funcall(var4, var10, var11, var12, var13);
    }
    
    public static SubLObject f4516(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = conses_high.copy_list(var1);
        SubLObject var4;
        for (var4 = (SubLObject)NIL, var4 = var3; !var4.rest().isAtom(); var4 = var4.rest()) {
            ConsesLow.rplaca(var4, f4512(var4.first(), var2));
        }
        ConsesLow.rplaca(var4, f4512(var4.first(), var2));
        if (NIL != var4.rest()) {
            ConsesLow.rplacd(var4, f4512(var4.rest(), var2));
        }
        return var3;
    }
    
    public static SubLObject f4517(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic47$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic47$);
        var16 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic47$);
        var17 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic47$);
        var18 = var14.first();
        var14 = var14.rest();
        if (NIL == var14) {
            final SubLObject var19;
            var14 = (var19 = var15);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)ConsesLow.listS(var16, var17, var18, (SubLObject)$ic49$), ConsesLow.append(var19, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic47$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4518() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4489", "S#6016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4491", "S#6017", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4492", "TREE-MATCHES-PATTERN", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0062", "f4493", "S#6018");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4494", "S#6019", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4490", "S#6020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4496", "S#6021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4497", "S#6022", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4495", "S#6011", 2, 0, false);
        new $f4495$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4498", "S#6023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4499", "S#6024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4500", "S#6025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4501", "S#6026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4502", "S#6027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4503", "S#6028", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4504", "S#6029", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4505", "S#6030", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4506", "S#6031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4507", "S#6032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4508", "S#6033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4509", "S#6034", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4511", "S#6035", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4510", "S#6036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4512", "S#6037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4513", "S#6038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4514", "S#6039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4515", "S#6040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0062", "f4516", "S#6041", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0062", "f4517", "S#6042");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4519() {
        $g1059$ = SubLFiles.defparameter("S#6043", (SubLObject)NIL);
        $g1060$ = SubLFiles.defparameter("S#6044", (SubLObject)NIL);
        $g1061$ = SubLFiles.defparameter("S#6045", (SubLObject)NIL);
        $g1062$ = SubLFiles.defparameter("S#6046", (SubLObject)NIL);
        $g1063$ = SubLFiles.defparameter("S#6047", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4520() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4518();
    }
    
    public void initializeVariables() {
        f4519();
    }
    
    public void runTopLevelForms() {
        f4520();
    }
    
    static {
        me = (SubLFile)new module0062();
        $g1059$ = null;
        $g1060$ = null;
        $g1061$ = null;
        $g1062$ = null;
        $g1063$ = null;
        $ic0$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic1$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("S#720", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#6048", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("MATCH-METHOD"));
        $ic4$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = makeKeyword("MATCH-METHOD");
        $ic6$ = makeSymbol("TREE-MATCHES-PATTERN");
        $ic7$ = makeUninternedSymbol("US#5227A51");
        $ic8$ = makeUninternedSymbol("US#5D5B406");
        $ic9$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic10$ = makeSymbol("PWHEN");
        $ic11$ = makeSymbol("CLET");
        $ic12$ = makeSymbol("IGNORE");
        $ic13$ = makeSymbol("S#3594", "CYC");
        $ic14$ = makeSymbol("QUOTE");
        $ic15$ = makeKeyword("ANYTHING");
        $ic16$ = makeKeyword("NOTHING");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#6049", "CYC"), (SubLObject)makeSymbol("METHOD"));
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#6050", "CYC"), (SubLObject)makeSymbol("S#6051", "CYC"));
        $ic19$ = makeKeyword("BIND");
        $ic20$ = makeKeyword("VALUE");
        $ic21$ = makeKeyword("AND");
        $ic22$ = makeKeyword("OR");
        $ic23$ = makeKeyword("NOT");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#6052", "CYC"));
        $ic25$ = makeKeyword("TEST");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#6053", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#6053", "CYC"), (SubLObject)makeSymbol("S#6054", "CYC"));
        $ic30$ = makeKeyword("TREE-FIND");
        $ic31$ = makeKeyword("TREE-FIND-IF");
        $ic32$ = makeKeyword("QUOTE");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#6055", "CYC"));
        $ic34$ = makeSymbol("S#6011", "CYC");
        $ic35$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#6056", "CYC"), (SubLObject)makeSymbol("S#6057", "CYC"));
        $ic36$ = makeKeyword("INPUT");
        $ic37$ = makeKeyword("BINDINGS");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"));
        $ic39$ = makeKeyword("TUPLE");
        $ic40$ = makeKeyword("TEMPLATE");
        $ic41$ = makeKeyword("CALL");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("S#6058", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#6059", "CYC"), (SubLObject)makeSymbol("S#6058", "CYC"));
        $ic44$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#6060", "CYC"));
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#6053", "CYC"), (SubLObject)makeSymbol("S#6054", "CYC"));
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#32", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = makeSymbol("S#6018", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)makeKeyword("MATCH-METHOD"), (SubLObject)makeSymbol("S#6062", "CYC"));
    }
    
    public static final class $f4495$BinaryFunction extends BinaryFunction
    {
        public $f4495$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6011"));
        }
        
        public SubLObject processItem(final SubLObject var83, final SubLObject var55) {
            return f4495(var83, var55);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/