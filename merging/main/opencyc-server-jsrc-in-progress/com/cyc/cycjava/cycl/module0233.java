package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0233 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0233";
    public static final String myFingerPrint = "60a146617f9dbc891eb985310bda91cdfc181bbb30d16408db5690359d5e5160";
    private static SubLSymbol $g2427$;
    private static SubLSymbol $g2428$;
    private static SubLSymbol $g2429$;
    private static SubLSymbol $g2430$;
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
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLString $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLString $ic38$;
    
    public static SubLObject f15337() {
        final SubLObject var1 = $g2427$.getGlobalValue();
        if (NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15338(final SubLObject var2) {
        return module0034.f1829($g2427$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15339(final SubLObject var2) {
        assert NIL != module0004.f106(var2) : var2;
        final SubLObject var3 = module0193.f12079(var2);
        return f15340(var3, var3);
    }
    
    public static SubLObject f15341(final SubLObject var2) {
        SubLObject var3 = $g2427$.getGlobalValue();
        if (NIL == var3) {
            var3 = module0034.f1934((SubLObject)$ic0$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)TEN_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)$ic3$);
        if (var4 == $ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15339(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f15342() {
        final SubLObject var1 = $g2428$.getGlobalValue();
        if (NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15343(final SubLObject var2) {
        return module0034.f1829($g2428$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15344(final SubLObject var2) {
        assert NIL != module0004.f106(var2) : var2;
        if (var2.isZero()) {
            return (SubLObject)NIL;
        }
        final SubLObject var3 = module0048.f_1_(var2);
        final SubLObject var4 = module0193.f12079(var3);
        return f15345(var4, var4, f15346(var3));
    }
    
    public static SubLObject f15346(final SubLObject var2) {
        SubLObject var3 = $g2428$.getGlobalValue();
        if (NIL == var3) {
            var3 = module0034.f1934((SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)TEN_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)$ic3$);
        if (var4 == $ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15344(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f15347(final SubLObject var7) {
        return Types.consp(var7);
    }
    
    public static SubLObject f15348(final SubLObject var7) {
        if (NIL != f15347(var7)) {
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var7, (SubLObject)$ic6$);
            var8 = var7.first();
            final SubLObject var10 = var9 = var7.rest();
            return (SubLObject)makeBoolean(NIL != module0201.f12580(var8) && NIL != module0201.f12580(var9));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15349(final SubLObject var7) {
        return f15350(var7);
    }
    
    public static SubLObject f15350(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0035.f2015(var7) && NIL != module0035.f2370((SubLObject)$ic7$, var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15351(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != var7 && NIL != f15350(var7));
    }
    
    public static SubLObject f15352(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0035.f2015(var7) && NIL != module0035.f2370((SubLObject)$ic8$, var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15353(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f15350(var7) && NIL != module0035.f2370((SubLObject)$ic9$, var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15354(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f15347(var7) && NIL != module0201.f12546(f15355(var7)));
    }
    
    public static SubLObject f15356(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL == var7 || (NIL != module0035.f2015(var7) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic10$), var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f15357(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL == var7 || (NIL != module0035.f2015(var7) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic11$), var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f15358(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0205.f13374(var7, $ic12$) && NIL != module0201.f12546(module0205.f13277(var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f15359(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12679(var7) || (NIL != module0202.f12659(var7) && NIL != module0202.f12677(var7) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic13$), module0205.f13304(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f15360(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12679(var7) || (NIL != module0202.f12659(var7) && NIL != module0202.f12677(var7) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic14$), module0205.f13304(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f15361(final SubLObject var13, final SubLObject var7) {
        return (NIL != f15350(var13)) ? f15362(var13, var7) : var7;
    }
    
    public static SubLObject f15363(final SubLObject var15, final SubLObject var16) {
        return f15364(var15, var16);
    }
    
    public static SubLObject f15364(final SubLObject var15, final SubLObject var16) {
        return module0035.f2205(var15, var16, Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f15365(final SubLObject var17, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1993(var17, module0035.$g892$.getDynamicValue(var19), (SubLObject)UNPROVIDED) && NIL != module0035.f1993(var18, module0035.$g892$.getDynamicValue(var19), (SubLObject)UNPROVIDED)) {
            return module0035.f2201(var17, var18, (SubLObject)$ic15$);
        }
        final SubLObject var20 = module0076.f5290(var17, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0035.f2220(var17, var20, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var22 = module0035.f2220(var18, var20, Symbols.symbol_function((SubLObject)EQUAL));
        return module0035.f2201(var21, var22, (SubLObject)$ic15$);
    }
    
    public static SubLObject f15366(final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = module0076.f5290(var17, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0035.f2220(var17, var19, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var21 = module0035.f2220(var18, var19, Symbols.symbol_function((SubLObject)EQUAL));
        return Values.values(conses_high.set_difference(var20, var21, (SubLObject)$ic15$, (SubLObject)UNPROVIDED), conses_high.set_difference(var21, var20, (SubLObject)$ic15$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15367(final SubLObject var3, final SubLObject var13) {
        return module0035.sublisp_boolean(f15368(var3, var13));
    }
    
    public static SubLObject f15369(final SubLObject var3, final SubLObject var13) {
        return f15370(f15368(var3, var13));
    }
    
    public static SubLObject f15345(final SubLObject var3, final SubLObject var23, final SubLObject var13) {
        return (SubLObject)ConsesLow.cons(f15340(var3, var23), var13);
    }
    
    public static SubLObject f15340(final SubLObject var3, final SubLObject var23) {
        return (SubLObject)ConsesLow.cons(var3, var23);
    }
    
    public static SubLObject f15355(final SubLObject var24) {
        return var24.first();
    }
    
    public static SubLObject f15370(final SubLObject var24) {
        return var24.rest();
    }
    
    public static SubLObject f15368(final SubLObject var3, final SubLObject var13) {
        return conses_high.assoc(var3, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15371(final SubLObject var23, final SubLObject var13, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)EQL);
        }
        return conses_high.rassoc(var23, var13, var25, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15372(final SubLObject var13) {
        return Mapping.mapcar((SubLObject)$ic16$, var13);
    }
    
    public static SubLObject f15373(final SubLObject var13) {
        return Mapping.mapcar((SubLObject)$ic17$, var13);
    }
    
    public static SubLObject f15374(final SubLObject var24, final SubLObject var26) {
        assert NIL != f15347(var24) : var24;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var24, (SubLObject)$ic18$);
        var27 = var24.first();
        final SubLObject var29 = var28 = var24.rest();
        return conses_high.subst(var28, var27, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15362(final SubLObject var13, final SubLObject var26) {
        assert NIL != f15349(var13) : var13;
        return conses_high.sublis(var13, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15375(final SubLObject var29, final SubLObject var30) {
        assert NIL != f15349(var29) : var29;
        assert NIL != f15349(var30) : var30;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            SubLObject var35;
            final SubLObject var34 = var35 = var33;
            SubLObject var36 = (SubLObject)NIL;
            SubLObject var37 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic18$);
            var36 = var35.first();
            var35 = (var37 = var35.rest());
            final SubLObject var38 = f15362(var29, var37);
            final SubLObject var39 = f15340(var36, var38);
            var31 = (SubLObject)ConsesLow.cons(var39, var31);
            var32 = var32.rest();
            var33 = var32.first();
        }
        return Sequences.nreverse(var31);
    }
    
    public static SubLObject f15376(final SubLObject var13, final SubLObject var26) {
        assert NIL != f15349(var13) : var13;
        return module0004.f87(var13, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15377(final SubLObject var29, final SubLObject var30) {
        assert NIL != f15349(var29) : var29;
        assert NIL != f15349(var30) : var30;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            SubLObject var35;
            final SubLObject var34 = var35 = var33;
            SubLObject var36 = (SubLObject)NIL;
            SubLObject var37 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic18$);
            var36 = var35.first();
            var35 = (var37 = var35.rest());
            final SubLObject var38 = f15376(var29, var37);
            final SubLObject var39 = f15340(var36, var38);
            var31 = (SubLObject)ConsesLow.cons(var39, var31);
            var32 = var32.rest();
            var33 = var32.first();
        }
        return Sequences.nreverse(var31);
    }
    
    public static SubLObject f15378(final SubLObject var24, final SubLObject var26) {
        assert NIL != f15347(var24) : var24;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var24, (SubLObject)$ic18$);
        var27 = var24.first();
        final SubLObject var29 = var28 = var24.rest();
        return conses_high.nsubst(var28, var27, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15379(final SubLObject var13, final SubLObject var26) {
        assert NIL != f15349(var13) : var13;
        return conses_high.nsublis(var13, var26, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15380(final SubLObject var13, final SubLObject var26) {
        assert NIL != f15349(var13) : var13;
        return module0004.f91(var13, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15381(final SubLObject var13, final SubLObject var42) {
        assert NIL != f15349(var13) : var13;
        SubLObject var43;
        for (var43 = (SubLObject)NIL, var43 = var42; !var43.isAtom(); var43 = var43.rest()) {
            ConsesLow.rplaca(var43, module0004.f91(var13, var43.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var42;
    }
    
    public static SubLObject f15382(final SubLObject var44, final SubLObject var45) {
        return f15383(var44, var45, (SubLObject)T);
    }
    
    public static SubLObject f15384(final SubLObject var44, final SubLObject var45) {
        return f15383(var44, var45, (SubLObject)NIL);
    }
    
    public static SubLObject f15385(final SubLObject var46, final SubLObject var45) {
        return f15382(f15386(var46), var45);
    }
    
    public static SubLObject f15387(final SubLObject var46, final SubLObject var45) {
        return f15384(f15386(var46), var45);
    }
    
    public static SubLObject f15383(final SubLObject var44, final SubLObject var45, final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert NIL != f15353(var44) : var44;
        assert NIL != f15349(var45) : var45;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = var45;
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            SubLObject var53;
            final SubLObject var52 = var53 = var51;
            SubLObject var54 = (SubLObject)NIL;
            SubLObject var55 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic21$);
            var54 = var53.first();
            var53 = (var55 = var53.rest());
            final SubLObject var56 = f15368(var54, var44);
            if (NIL != var47 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var48) && NIL == var56) {
                Errors.error((SubLObject)$ic22$, var44, var45);
            }
            if (NIL != var56) {
                final SubLObject var57 = f15370(var56);
                var49 = f15345(var57, var55, var49);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return Sequences.nreverse(var49);
    }
    
    public static SubLObject f15388(final SubLObject var44, final SubLObject var56) {
        return f15389(var44, var56, (SubLObject)T);
    }
    
    public static SubLObject f15390(final SubLObject var44, final SubLObject var56) {
        return f15389(var44, var56, (SubLObject)NIL);
    }
    
    public static SubLObject f15389(final SubLObject var44, final SubLObject var56, final SubLObject var47) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        assert NIL != f15353(var44) : var44;
        assert NIL != f15349(var56) : var56;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = var56;
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic23$);
            var63 = var62.first();
            var62 = (var64 = var62.rest());
            final SubLObject var65 = f15371(var63, var44, (SubLObject)UNPROVIDED);
            if (NIL != var47 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && NIL == var65) {
                Errors.error((SubLObject)$ic22$, var44, var56);
            }
            if (NIL != var65) {
                final SubLObject var66 = f15355(var65);
                var58 = f15345(var66, var64, var58);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return Sequences.nreverse(var58);
    }
    
    public static SubLObject f15386(final SubLObject var13) {
        return module0035.f2230(var13);
    }
    
    public static SubLObject f15391(final SubLObject var13, final SubLObject var60) {
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = var13;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            SubLObject var65;
            final SubLObject var64 = var65 = var63;
            SubLObject var66 = (SubLObject)NIL;
            SubLObject var67 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic18$);
            var66 = var65.first();
            var65 = (var67 = var65.rest());
            if (NIL != module0004.f104(var66, var60, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var61 = (SubLObject)ConsesLow.cons(f15340(var66, var67), var61);
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        var61 = Sequences.nreverse(var61);
        return var61;
    }
    
    public static SubLObject f15392(SubLObject var13) {
        if (NIL != Sequences.find_if((SubLObject)$ic10$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var13 = Sequences.remove_if((SubLObject)$ic10$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f15393(var13)) {
            var13 = (SubLObject)NIL;
        }
        return var13;
    }
    
    public static SubLObject f15394(SubLObject var64) {
        if (NIL == var64 || NIL != module0035.f1997(var64)) {
            return var64;
        }
        while (true) {
            SubLObject var65 = (SubLObject)NIL;
            SubLObject var66 = var64;
            SubLObject var67 = (SubLObject)NIL;
            var67 = var66.first();
            while (NIL != var66) {
                final SubLObject var68 = f15370(var67);
                if (NIL == module0193.f12105(var68)) {
                    final SubLObject var69 = f15376(var64, var68);
                    final SubLObject var70 = f15355(var67);
                    if (NIL == module0035.f2434(var70, var69) && !var69.equal(var68)) {
                        var67 = f15340(var70, var69);
                    }
                }
                var65 = (SubLObject)ConsesLow.cons(var67, var65);
                var66 = var66.rest();
                var67 = var66.first();
            }
            var65 = Sequences.nreverse(var65);
            if (var65.equal(var64)) {
                break;
            }
            var64 = var65;
        }
        return var64;
    }
    
    public static SubLObject f15395(final SubLObject var13) {
        SubLObject var14 = var13;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL != f15396(var15, var13)) {
                return f15397(var13, var15);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f15396(final SubLObject var68, final SubLObject var13) {
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)$ic24$);
        var69 = var68.first();
        final SubLObject var71 = var70 = var68.rest();
        if (NIL != module0234.f15458(var69)) {
            SubLObject var72 = var13;
            SubLObject var73 = (SubLObject)NIL;
            var73 = var72.first();
            while (NIL != var72) {
                final SubLObject var74 = f15355(var73);
                if (NIL != module0035.f2434(var74, var70)) {
                    return (SubLObject)T;
                }
                var72 = var72.rest();
                var73 = var72.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15397(final SubLObject var13, final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var13;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            if (var77.eql(var74)) {
                SubLObject var79;
                final SubLObject var78 = var79 = var77;
                SubLObject var80 = (SubLObject)NIL;
                SubLObject var81 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic25$);
                var80 = var79.first();
                var79 = (var81 = var79.rest());
                final SubLObject var82 = f15362(var13, var81);
                final SubLObject var83 = f15340(var80, var82);
                var75 = (SubLObject)ConsesLow.cons(var83, var75);
            }
            else {
                var75 = (SubLObject)ConsesLow.cons(var77, var75);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return Sequences.nreverse(var75);
    }
    
    public static SubLObject f15398(final SubLObject var13) {
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic26$), var13, Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15399(final SubLObject var13, final SubLObject var80) {
        return module0035.f2386(var13, var80, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic16$));
    }
    
    public static SubLObject f15400(final SubLObject var13) {
        assert NIL != Types.listp(var13) : var13;
        if (NIL != module0035.f1997(var13)) {
            return var13;
        }
        return Sequences.remove($g2429$.getGlobalValue(), var13, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15401(final SubLObject var13) {
        assert NIL != Types.listp(var13) : var13;
        if (NIL != module0035.f1997(var13)) {
            return var13;
        }
        return Sequences.delete($g2429$.getGlobalValue(), var13, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15402(final SubLObject var26) {
        return module0035.sublisp_boolean(module0035.f2428($g2429$.getGlobalValue(), var26, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15403() {
        return $g2430$.getGlobalValue();
    }
    
    public static SubLObject f15393(final SubLObject var13) {
        return Equality.equal(var13, $g2430$.getGlobalValue());
    }
    
    public static SubLObject f15404(final SubLObject var81, final SubLObject var82) {
        assert NIL != Types.listp(var81) : var81;
        assert NIL != Types.listp(var82) : var82;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = var81;
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            final SubLObject var86 = f15355(var85);
            if (NIL != f15367(var86, var82) && !f15370(var85).equal(f15369(var86, var82))) {
                final SubLObject var87 = var86;
                if (NIL == conses_high.member(var87, var83, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var83 = (SubLObject)ConsesLow.cons(var87, var83);
                }
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return var83;
    }
    
    public static SubLObject f15405(final SubLObject var81, final SubLObject var82) {
        assert NIL != Types.listp(var81) : var81;
        assert NIL != Types.listp(var82) : var82;
        SubLObject var83 = (SubLObject)NIL;
        if (NIL == var83) {
            SubLObject var84 = var81;
            SubLObject var85 = (SubLObject)NIL;
            var85 = var84.first();
            while (NIL == var83 && NIL != var84) {
                final SubLObject var86 = f15355(var85);
                if (NIL != f15367(var86, var82) && !f15370(var85).equal(f15369(var86, var82))) {
                    var83 = (SubLObject)T;
                }
                var84 = var84.rest();
                var85 = var84.first();
            }
        }
        return var83;
    }
    
    public static SubLObject f15406(final SubLObject var87) {
        assert NIL != f15360(var87) : var87;
        if (NIL != module0202.f12679(var87)) {
            return (SubLObject)NIL;
        }
        return f15407(module0205.f13304(var87, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15407(final SubLObject var88) {
        if (NIL == var88) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(f15408(var88.first()), f15407(var88.rest()));
    }
    
    public static SubLObject f15408(final SubLObject var89) {
        assert NIL != f15359(var89) : var89;
        if (NIL != module0202.f12679(var89)) {
            return (SubLObject)NIL;
        }
        return f15409(module0205.f13304(var89, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15409(final SubLObject var90) {
        if (NIL == var90) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(f15410(var90.first()), f15409(var90.rest()));
    }
    
    public static SubLObject f15410(final SubLObject var91) {
        assert NIL != f15358(var91) : var91;
        final SubLObject var92 = module0205.f13277(var91, (SubLObject)UNPROVIDED);
        final SubLObject var93 = module0205.f13368(var91, (SubLObject)UNPROVIDED);
        return f15340(var92, module0285.f18875(var93, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15411(final SubLObject var92) {
        assert NIL != f15357(var92) : var92;
        return f15412(f15413(var92));
    }
    
    public static SubLObject f15413(final SubLObject var92) {
        if (NIL == var92) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(f15414(var92.first()), f15413(var92.rest()));
    }
    
    public static SubLObject f15414(final SubLObject var93) {
        assert NIL != f15356(var93) : var93;
        return f15415(f15416(var93));
    }
    
    public static SubLObject f15416(final SubLObject var93) {
        if (NIL == var93) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(f15417(var93.first()), f15416(var93.rest()));
    }
    
    public static SubLObject f15417(final SubLObject var94) {
        assert NIL != f15354(var94) : var94;
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)$ic31$);
        var95 = var94.first();
        final SubLObject var97 = var96 = var94.rest();
        return f15418(var95, var96);
    }
    
    public static SubLObject f15419(final SubLObject var91) {
        assert NIL != f15358(var91) : var91;
        return module0205.f13277(var91, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15420(final SubLObject var91) {
        assert NIL != f15358(var91) : var91;
        return module0205.f13368(var91, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15421(final SubLObject var89) {
        assert NIL != f15359(var89) : var89;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic32$), module0205.f13304(var89, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15422(final SubLObject var89) {
        assert NIL != f15359(var89) : var89;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic33$), module0205.f13304(var89, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15423(final SubLObject var89, final SubLObject var3) {
        assert NIL != f15359(var89) : var89;
        assert NIL != module0201.f12546(var3) : var3;
        SubLObject var90 = (SubLObject)NIL;
        if (NIL == var90) {
            SubLObject var91 = module0205.f13304(var89, (SubLObject)UNPROVIDED);
            SubLObject var92 = (SubLObject)NIL;
            var92 = var91.first();
            while (NIL == var90 && NIL != var91) {
                if (f15419(var92).eql(var3)) {
                    var90 = f15420(var92);
                }
                var91 = var91.rest();
                var92 = var91.first();
            }
        }
        return var90;
    }
    
    public static SubLObject f15424(final SubLObject var87) {
        assert NIL != f15360(var87) : var87;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic35$), module0205.f13304(var87, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15425(final SubLObject var87) {
        assert NIL != f15360(var87) : var87;
        return Sequences.length(f15426(var87));
    }
    
    public static SubLObject f15426(final SubLObject var87) {
        assert NIL != f15360(var87) : var87;
        return module0205.f13304(var87, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15418(final SubLObject var3, final SubLObject var23) {
        assert NIL != module0201.f12546(var3) : var3;
        return module0202.f12683($ic12$, (SubLObject)ConsesLow.list(var3, var23), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15415(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var14) && NIL == module0035.f2370((SubLObject)$ic13$, var13, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic36$, var13);
        }
        return module0202.f12683($ic37$, var13, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15412(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var98) && NIL == module0035.f2370((SubLObject)$ic14$, var97, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic38$, var97);
        }
        return module0202.f12683($ic37$, var97, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15427() {
        return f15412((SubLObject)NIL);
    }
    
    public static SubLObject f15428() {
        return f15415((SubLObject)NIL);
    }
    
    public static SubLObject f15429() {
        return f15412((SubLObject)ConsesLow.list(f15415((SubLObject)NIL)));
    }
    
    public static SubLObject f15430() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15337", "S#18078", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15338", "S#18079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15339", "S#18080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15341", "S#18081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15342", "S#18082", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15343", "S#18083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15344", "S#18084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15346", "S#18085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15347", "S#18073", 1, 0, false);
        new $f15347$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15348", "S#18086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15349", "S#18087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15350", "S#18088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15351", "S#18089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15352", "S#18090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15353", "S#18091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15354", "S#18074", 1, 0, false);
        new $f15354$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15356", "S#18092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15357", "S#18093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15358", "S#18094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15359", "S#18095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15360", "S#18096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15361", "S#18075", 2, 0, false);
        new $f15361$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15363", "S#18097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15364", "S#18098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15365", "S#18099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15366", "S#18100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15367", "S#18101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15369", "VARIABLE-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15345", "S#18102", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15340", "S#14186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15355", "S#18076", 1, 0, false);
        new $f15355$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15370", "S#17993", 1, 0, false);
        new $f15370$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15368", "S#18103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15371", "S#18104", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15372", "S#18105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15373", "S#18106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15374", "S#18107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15362", "S#16449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15375", "S#18108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15376", "S#18109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15377", "S#18110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15378", "S#18111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15379", "S#18112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15380", "S#18113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15381", "S#18114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15382", "S#18115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15384", "S#18116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15385", "S#18117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15387", "S#18118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15383", "S#18119", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15388", "S#18120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15390", "S#18121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15389", "S#18122", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15386", "S#18123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15391", "S#18124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15392", "S#18125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15394", "S#18126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15395", "S#18127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15396", "S#18128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15397", "S#18129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15398", "S#18130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15399", "S#18131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15400", "S#18132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15401", "S#18133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15402", "S#18134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15403", "S#18135", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15393", "S#18136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15404", "S#18137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15405", "S#18138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15406", "S#18139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15407", "S#18140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15408", "S#18141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15409", "S#18142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15410", "S#18143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15411", "S#18144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15413", "S#18145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15414", "S#18146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15416", "S#18147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15417", "S#18148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15419", "S#18149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15420", "S#18150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15421", "S#18151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15422", "S#18152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15423", "S#18153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15424", "S#18154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15425", "S#18155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15426", "S#18156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15418", "S#18157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15415", "S#18158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15412", "S#18159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15427", "S#18160", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15428", "S#18161", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0233", "f15429", "S#18162", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15431() {
        $g2427$ = SubLFiles.deflexical("S#18163", (SubLObject)NIL);
        $g2428$ = SubLFiles.deflexical("S#18164", (SubLObject)NIL);
        $g2429$ = SubLFiles.deflexical("S#18165", (NIL != Symbols.boundp((SubLObject)$ic27$)) ? $g2429$.getGlobalValue() : f15340((SubLObject)T, (SubLObject)T));
        $g2430$ = SubLFiles.deflexical("S#18166", (SubLObject)ConsesLow.list($g2429$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15432() {
        module0034.f1909((SubLObject)$ic0$);
        module0034.f1909((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic27$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15430();
    }
    
    public void initializeVariables() {
        f15431();
    }
    
    public void runTopLevelForms() {
        f15432();
    }
    
    static {
        me = (SubLFile)new module0233();
        $g2427$ = null;
        $g2428$ = null;
        $g2429$ = null;
        $g2430$ = null;
        $ic0$ = makeSymbol("S#18081", "CYC");
        $ic1$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic2$ = makeSymbol("S#18163", "CYC");
        $ic3$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = makeSymbol("S#18085", "CYC");
        $ic5$ = makeSymbol("S#18164", "CYC");
        $ic6$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)makeSymbol("S#174", "CYC"));
        $ic7$ = makeSymbol("S#18073", "CYC");
        $ic8$ = makeSymbol("S#18088", "CYC");
        $ic9$ = makeSymbol("S#18086", "CYC");
        $ic10$ = makeSymbol("S#18074", "CYC");
        $ic11$ = makeSymbol("S#18092", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("ELInferenceBindingFn"));
        $ic13$ = makeSymbol("S#18094", "CYC");
        $ic14$ = makeSymbol("S#18095", "CYC");
        $ic15$ = makeSymbol("S#18098", "CYC");
        $ic16$ = makeSymbol("S#18076", "CYC");
        $ic17$ = makeSymbol("S#17993", "CYC");
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic19$ = makeSymbol("S#18087", "CYC");
        $ic20$ = makeSymbol("S#18091", "CYC");
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#18167", "CYC"), (SubLObject)makeSymbol("S#18168", "CYC"));
        $ic22$ = makeString("Incomplete variable map ~a applied to ~a");
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#18169", "CYC"), (SubLObject)makeSymbol("S#18168", "CYC"));
        $ic24$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#18170", "CYC"), (SubLObject)makeSymbol("S#18171", "CYC"));
        $ic25$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#18172", "CYC"));
        $ic26$ = makeSymbol("FULLY-BOUND-P");
        $ic27$ = makeSymbol("S#18165", "CYC");
        $ic28$ = makeSymbol("LISTP");
        $ic29$ = makeSymbol("S#18096", "CYC");
        $ic30$ = makeSymbol("S#18093", "CYC");
        $ic31$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic32$ = makeSymbol("S#18149", "CYC");
        $ic33$ = makeSymbol("S#18150", "CYC");
        $ic34$ = makeSymbol("EL-VAR?");
        $ic35$ = makeSymbol("S#18152", "CYC");
        $ic36$ = makeString("Some element of ~A is not a KB-BINDING-P");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic38$ = makeString("Some element of ~A is not a KB-BINDING-SET-P");
    }
    
    public static final class $f15347$UnaryFunction extends UnaryFunction
    {
        public $f15347$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18073"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f15347(var8);
        }
    }
    
    public static final class $f15354$UnaryFunction extends UnaryFunction
    {
        public $f15354$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18074"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f15354(var8);
        }
    }
    
    public static final class $f15361$BinaryFunction extends BinaryFunction
    {
        public $f15361$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18075"));
        }
        
        public SubLObject processItem(final SubLObject var8, final SubLObject var14) {
            return f15361(var8, var14);
        }
    }
    
    public static final class $f15355$UnaryFunction extends UnaryFunction
    {
        public $f15355$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18076"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f15355(var8);
        }
    }
    
    public static final class $f15370$UnaryFunction extends UnaryFunction
    {
        public $f15370$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17993"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f15370(var8);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 248 ms
	
	Decompiled with Procyon 0.5.32.
*/