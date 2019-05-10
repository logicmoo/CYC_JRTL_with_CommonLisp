package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0362 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0362";
    public static final String myFingerPrint = "96540b92c6431301d5f3836f70409673d2730d5f0259e593f107aa8c9bff75e1";
    private static SubLSymbol $g3128$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    
    public static SubLObject f24432(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && NIL != module0035.f1995(var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != f24433(var1.first()) && NIL != module0202.f12660(conses_high.second(var1)));
    }
    
    public static SubLObject f24433(final SubLObject var1) {
        return module0161.f10480(var1);
    }
    
    public static SubLObject f24434(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)ConsesLow.list(var2, var3);
    }
    
    public static SubLObject f24435(final SubLObject var4) {
        return var4.first();
    }
    
    public static SubLObject f24436(final SubLObject var4) {
        return conses_high.second(var4);
    }
    
    public static SubLObject f24437(final SubLObject var4) {
        return module0205.f13333(f24436(var4));
    }
    
    public static SubLObject f24438(final SubLObject var1) {
        if (NIL != module0232.f15321(var1)) {
            SubLObject var2 = module0232.f15306(var1);
            SubLObject var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                if (NIL == f24432(var3)) {
                    return (SubLObject)NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            var2 = module0232.f15308(var1);
            var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                if (NIL == f24432(var3)) {
                    return (SubLObject)NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24439(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic0$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic0$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic0$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic0$);
        var13 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic0$);
        var14 = var9.first();
        var9 = var9.rest();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = var9;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18_19 = (SubLObject)NIL;
        while (NIL != var16) {
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic0$);
            var18_19 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var18_19, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)T;
            }
            if (var18_19 == $ic2$) {
                var15 = var16.first();
            }
            var16 = var16.rest();
        }
        if (NIL != var17 && NIL == var15) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic0$);
        }
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var9 = (var22 = var10);
        if (NIL == var19) {
            final SubLObject var23 = (SubLObject)$ic5$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var11, var12, var13, var14, (SubLObject)$ic3$, var23, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var23), ConsesLow.append(var22, (SubLObject)NIL));
        }
        final SubLObject var24 = (SubLObject)$ic8$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)$ic11$)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list(var24, var19, var14, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var12, var11), var24, ConsesLow.append(var22, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)$ic14$)), (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var24, var19, var14, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var12, var11), var24, ConsesLow.append(var22, (SubLObject)NIL)))));
    }
    
    public static SubLObject f24440(final SubLObject var14, final SubLObject var26) {
        SubLObject var27 = module0232.f15306(var14);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            SubLObject var30;
            final SubLObject var29 = var30 = var28;
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic16$);
            var31 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic16$);
            var32 = var30.first();
            var30 = var30.rest();
            if (NIL == var30) {
                if (NIL != module0205.f13332(var32, var26)) {
                    return (SubLObject)T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic16$);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        var27 = module0232.f15308(var14);
        var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            SubLObject var34;
            final SubLObject var33 = var34 = var28;
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic16$);
            var31 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic16$);
            var32 = var34.first();
            var34 = var34.rest();
            if (NIL == var34) {
                if (NIL != module0205.f13332(var32, var26)) {
                    return (SubLObject)T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)$ic16$);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24441(final SubLObject var14) {
        if (NIL != module0204.f13045(var14)) {
            final SubLObject var15 = module0204.f13052(var14);
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic16$);
            var18 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic16$);
            var19 = var17.first();
            var17 = var17.rest();
            if (NIL == var17) {
                return Values.values(var18, var19, (SubLObject)$ic17$);
            }
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic16$);
        }
        else if (NIL != module0204.f13049(var14)) {
            final SubLObject var15 = module0204.f13052(var14);
            SubLObject var21;
            final SubLObject var20 = var21 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic16$);
            var18 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic16$);
            var19 = var21.first();
            var21 = var21.rest();
            if (NIL == var21) {
                return Values.values(var18, var19, (SubLObject)$ic18$);
            }
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic16$);
        }
        else {
            Errors.error((SubLObject)$ic19$, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24442(final SubLObject var1) {
        if (NIL != module0232.f15325(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                if (NIL == f24438(var3)) {
                    return (SubLObject)NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24443(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var13 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var14 = var9.first();
        var9 = var9.rest();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = var9;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var16) {
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic20$);
            var43_44 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic20$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)T;
            }
            if (var43_44 == $ic2$) {
                var15 = var16.first();
            }
            var16 = var16.rest();
        }
        if (NIL != var17 && NIL == var15) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic20$);
        }
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20;
        var9 = (var20 = var10);
        final SubLObject var21 = (SubLObject)$ic22$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list(var21, var14, (SubLObject)$ic4$, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var11, var12, var13, var21), ConsesLow.append(var20, (SubLObject)NIL)));
    }
    
    public static SubLObject f24444(final SubLObject var46) {
        assert NIL != module0204.f13059(var46) : var46;
        final SubLObject var47 = f24445(var46);
        return module0204.f13052(var47);
    }
    
    public static SubLObject f24445(final SubLObject var46) {
        assert NIL != module0035.f1997(var46) : var46;
        return var46.first();
    }
    
    public static SubLObject f24446(final SubLObject var1) {
        return f24442(var1);
    }
    
    public static SubLObject f24447(final SubLObject var1) {
        return (SubLObject)makeBoolean($ic26$ == var1 || NIL != f24446(var1));
    }
    
    public static SubLObject f24448(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == var1 || NIL != f24446(var1));
    }
    
    public static SubLObject f24449(final SubLObject var14) {
        return (SubLObject)ConsesLow.list(var14);
    }
    
    public static SubLObject f24450(final SubLObject var47, final SubLObject var48, final SubLObject var21) {
        return f24449(module0232.f15318(var47, var48, var21));
    }
    
    public static SubLObject f24451(final SubLObject var14, final SubLObject var49) {
        assert NIL != module0204.f13097(var49) : var49;
        final SubLObject var50 = module0204.f13110(var14, var49);
        return f24449(var50);
    }
    
    public static SubLObject f24452(final SubLObject var14, final SubLObject var49) {
        assert NIL != module0204.f13097(var49) : var49;
        final SubLObject var50 = module0204.f13111(var14, var49);
        return f24449(var50);
    }
    
    public static SubLObject f24453(final SubLObject var4, final SubLObject var48) {
        if (var48.eql((SubLObject)$ic17$)) {
            return f24449(module0232.f15305((SubLObject)NIL, (SubLObject)ConsesLow.list(var4)));
        }
        if (var48.eql((SubLObject)$ic18$)) {
            return f24449(module0232.f15305((SubLObject)ConsesLow.list(var4), (SubLObject)NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24454(final SubLObject var2, final SubLObject var3, final SubLObject var48) {
        final SubLObject var49 = f24434(var2, var3);
        return f24453(var49, var48);
    }
    
    public static SubLObject f24455(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var13 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic20$);
        var14 = var9.first();
        var9 = var9.rest();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = var9;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var58_59 = (SubLObject)NIL;
        while (NIL != var16) {
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic20$);
            var58_59 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var8, (SubLObject)$ic20$);
            if (NIL == conses_high.member(var58_59, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)T;
            }
            if (var58_59 == $ic2$) {
                var15 = var16.first();
            }
            var16 = var16.rest();
        }
        if (NIL != var17 && NIL == var15) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic20$);
        }
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20;
        var9 = (var20 = var10);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var11, var12, var13, var14, (SubLObject)$ic4$, var19), ConsesLow.append(var20, (SubLObject)NIL));
    }
    
    public static SubLObject f24456(final SubLObject var39, final SubLObject var61) {
        if (var61.eql((SubLObject)$ic29$)) {
            return (SubLObject)NIL;
        }
        if (var61.eql((SubLObject)$ic26$)) {
            return (SubLObject)T;
        }
        if (var61.eql((SubLObject)$ic30$)) {
            return module0204.f13059(var39);
        }
        Errors.error((SubLObject)$ic31$, var61);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24457(final SubLObject var39) {
        return module0205.f13183(var39, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24458(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f24446(var1) && NIL != module0035.f1997(var1));
    }
    
    public static SubLObject f24459(final SubLObject var62) {
        assert NIL != f24458(var62) : var62;
        return f24445(var62);
    }
    
    public static SubLObject f24460(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f24446(var1) && NIL != f24461(var1));
    }
    
    public static SubLObject f24461(final SubLObject var62) {
        return (SubLObject)makeBoolean(NIL != module0035.f1997(var62) && NIL != module0232.f15312(var62.first()));
    }
    
    public static SubLObject f24462(final SubLObject var3, final SubLObject var48, final SubLObject var2) {
        final SubLObject var49 = module0130.f8518(var48);
        final SubLObject var50 = module0204.f13038(var3, var49);
        final SubLObject var51 = module0370.f25896(var50, var2, (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list(var51);
    }
    
    public static SubLObject f24463(final SubLObject var39) {
        if (NIL != module0204.f13060(var39)) {
            return (SubLObject)$ic17$;
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f24464(final SubLObject var39) {
        final SubLObject var40 = var39.first();
        final SubLObject var41 = module0204.f13052(var40);
        SubLObject var43;
        final SubLObject var42 = var43 = var41;
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var45 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic16$);
        var44 = var43.first();
        var43 = var43.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic16$);
        var45 = var43.first();
        var43 = var43.rest();
        if (NIL == var43) {
            return var44;
        }
        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24465(final SubLObject var39) {
        final SubLObject var40 = var39.first();
        final SubLObject var41 = module0204.f13052(var40);
        if (NIL != var41) {
            SubLObject var43;
            final SubLObject var42 = var43 = var41;
            SubLObject var44 = (SubLObject)NIL;
            SubLObject var45 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic16$);
            var44 = var43.first();
            var43 = var43.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic16$);
            var45 = var43.first();
            var43 = var43.rest();
            if (NIL == var43) {
                return var45;
            }
            cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)$ic16$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24466(final SubLObject var39) {
        final SubLObject var40 = f24465(var39);
        final SubLObject var41 = module0205.f13333(var40);
        return var41;
    }
    
    public static SubLObject f24467(final SubLObject var39) {
        final SubLObject var40 = var39.first();
        return f24441(var40);
    }
    
    public static SubLObject f24468(final SubLObject var69, SubLObject var70) {
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = (SubLObject)NIL;
        final SubLObject var73 = $g3128$.currentBinding(var71);
        try {
            $g3128$.bind(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), var70), var71);
            module0035.f2424((SubLObject)$ic34$, var69, (SubLObject)UNPROVIDED);
            var72 = f24469($g3128$.getDynamicValue(var71));
        }
        finally {
            $g3128$.rebind(var73, var71);
        }
        return var72;
    }
    
    public static SubLObject f24470(final SubLObject var62) {
        final SubLObject var63 = f24471(var62);
        return f24468(var62, var63);
    }
    
    public static SubLObject f24471(final SubLObject var62) {
        final SubLObject var63 = module0363.f24561(var62, (SubLObject)UNPROVIDED);
        return Numbers.add((SubLObject)THREE_INTEGER, var63);
    }
    
    public static SubLObject f24472(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != var1 && var1.isAtom()) {
            module0084.f5775($g3128$.getDynamicValue(var2), var1, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24469(final SubLObject var77) {
        SubLObject var78 = module0084.f5780(var77);
        final SubLObject var79 = module0193.f12075((SubLObject)ZERO_INTEGER);
        SubLObject var80 = var78;
        SubLObject var81 = (SubLObject)NIL;
        var81 = var80.first();
        while (NIL != var80) {
            if (NIL != module0193.f12067(var81.first())) {
                ConsesLow.rplaca(var81, var79);
            }
            var80 = var80.rest();
            var81 = var80.first();
        }
        var78 = Sort.sort(var78, Symbols.symbol_function((SubLObject)$ic35$), Symbols.symbol_function((SubLObject)$ic36$));
        var78 = Sort.stable_sort(var78, Symbols.symbol_function((SubLObject)$ic37$), Symbols.symbol_function((SubLObject)$ic38$));
        return module0035.f2338(var78);
    }
    
    public static SubLObject f24473() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24432", "S#23380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24433", "S#27295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24434", "S#27296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24435", "S#26084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24436", "S#16021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24437", "S#27297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24438", "S#27298", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0362", "f24439", "S#27299");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24440", "S#27300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24441", "S#27301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24442", "S#27302", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0362", "f24443", "S#27303");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24444", "S#27304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24445", "S#27305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24446", "S#27306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24447", "S#27307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24448", "S#27308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24449", "S#27309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24450", "S#27310", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24451", "S#27311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24452", "S#27312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24453", "S#27313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24454", "S#27314", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0362", "f24455", "S#27315");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24456", "S#26794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24457", "S#27316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24458", "S#27317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24459", "S#27318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24460", "S#27319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24461", "S#27320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24462", "ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24463", "S#27321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24464", "S#27322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24465", "S#27323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24466", "S#27324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24467", "S#27325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24468", "S#27326", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24470", "S#26811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24471", "S#27327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24472", "S#27294", 1, 0, false);
        new $f24472$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0362", "f24469", "S#27328", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24474() {
        $g3128$ = SubLFiles.defparameter("S#27329", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24475() {
        module0012.f419((SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f24473();
    }
    
    public void initializeVariables() {
        f24474();
    }
    
    public void runTopLevelForms() {
        f24475();
    }
    
    static {
        me = (SubLFile)new module0362();
        $g3128$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15218", "CYC"), (SubLObject)makeSymbol("S#15358", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC"), (SubLObject)makeSymbol("S#27330", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("INDEX");
        $ic4$ = makeKeyword("DONE");
        $ic5$ = makeUninternedSymbol("US#3F92607");
        $ic6$ = makeSymbol("S#27299", "CYC");
        $ic7$ = makeSymbol("IGNORE");
        $ic8$ = makeUninternedSymbol("US#17E2411");
        $ic9$ = makeSymbol("PROGN");
        $ic10$ = makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("NEG"));
        $ic12$ = makeSymbol("S#15188", "CYC");
        $ic13$ = makeSymbol("S#15934", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("POS"));
        $ic15$ = makeSymbol("S#15190", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic17$ = makeKeyword("POS");
        $ic18$ = makeKeyword("NEG");
        $ic19$ = makeString("~a was not an atomic contextualized-clause");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15218", "CYC"), (SubLObject)makeSymbol("S#15358", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC"), (SubLObject)makeSymbol("S#9148", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic22$ = makeUninternedSymbol("US#3D9121A");
        $ic23$ = makeSymbol("S#15186", "CYC");
        $ic24$ = makeSymbol("S#15957", "CYC");
        $ic25$ = makeSymbol("SINGLETON?");
        $ic26$ = makeKeyword("ALL");
        $ic27$ = makeSymbol("S#15995", "CYC");
        $ic28$ = makeSymbol("S#27303", "CYC");
        $ic29$ = makeKeyword("NONE");
        $ic30$ = makeKeyword("SINGLE-LITERAL");
        $ic31$ = makeString("Unexpected equality reasoning domain ~a");
        $ic32$ = makeSymbol("HL-VARIABLE-P");
        $ic33$ = makeSymbol("S#27317", "CYC");
        $ic34$ = makeSymbol("S#27294", "CYC");
        $ic35$ = makeSymbol("S#3846", "CYC");
        $ic36$ = makeSymbol("CAR");
        $ic37$ = makeSymbol(">");
        $ic38$ = makeSymbol("CDR");
    }
    
    public static final class $f24472$UnaryFunction extends UnaryFunction
    {
        public $f24472$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27294"));
        }
        
        public SubLObject processItem(final SubLObject var76) {
            return f24472(var76);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 181 ms
	
	Decompiled with Procyon 0.5.32.
*/