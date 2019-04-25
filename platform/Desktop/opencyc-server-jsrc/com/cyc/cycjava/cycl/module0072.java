package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0072 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0072";
    public static final String myFingerPrint = "dcbdb9a9a80363e5f370c548f4058a526217fd403c6dce85d9899192c59b9bfb";
    public static SubLSymbol $g1107$;
    public static SubLSymbol $g1108$;
    public static SubLSymbol $g1109$;
    public static SubLSymbol $g1110$;
    public static SubLSymbol $g1111$;
    public static SubLSymbol $g1112$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
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
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    
    public static SubLObject f5078(final SubLObject var1, final SubLObject var2) {
        f5079(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5080(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6655_native.class) ? T : NIL);
    }
    
    public static SubLObject f5081(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5082(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5083(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f5084(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f5085(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f5086(final SubLObject var1) {
        assert NIL != f5080(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f5087(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5088(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5089(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f5090(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f5091(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f5092(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5080(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f5093(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6655_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic26$)) {
                f5087(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f5088(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f5089(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f5090(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f5091(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f5092(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic32$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5094(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic26$, f5081(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic27$, f5082(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic28$, f5083(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic29$, f5084(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic30$, f5085(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic31$, f5086(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic34$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f5095(final SubLObject var11, final SubLObject var12) {
        return f5094(var11, var12);
    }
    
    public static SubLObject f5096(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic38$;
        }
        final SubLObject var18 = f5093((SubLObject)UNPROVIDED);
        f5087(var18, var14);
        f5088(var18, var13);
        f5089(var18, var15);
        f5090(var18, var16);
        f5091(var18, (SubLObject)NIL);
        f5092(var18, var17);
        return var18;
    }
    
    public static SubLObject f5079(final SubLObject var19, final SubLObject var2, final SubLObject var20) {
        PrintLow.format(var2, (SubLObject)$ic39$, new SubLObject[] { f5081(var19), f5082(var19), f5083(var19), f5084(var19), f5085(var19), f5086(var19) });
        return var19;
    }
    
    public static SubLObject f5097() {
        if (NIL != $g1111$.getGlobalValue()) {
            return (SubLObject)NIL;
        }
        $g1111$.setGlobalValue((SubLObject)T);
        SubLObject var21 = f5098();
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            f5099(var22);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5100() {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = f5098();
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (NIL == f5085(var25)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic40$, var25, Symbols.symbol_value(f5081(var25)));
                var23 = (SubLObject)T;
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f5101() {
        SubLObject var24 = (SubLObject)ZERO_INTEGER;
        SubLObject var25 = f5098();
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic40$, var26, Symbols.symbol_value(f5081(var26)));
            var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return var24;
    }
    
    public static SubLObject f5102() {
        SubLObject var21 = $g1108$.getGlobalValue();
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            final SubLObject var23 = f5084(var22);
            if (var23.eql((SubLObject)$ic41$) || var23.eql((SubLObject)$ic42$)) {
                f5091(var22, (SubLObject)NIL);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        $g1111$.setGlobalValue((SubLObject)NIL);
        f5097();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5103(final SubLObject var22) {
        final SubLObject var23 = module0067.f4884($g1107$.getGlobalValue(), f5081(var22), (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            f5089(var23, f5083(var22));
            if (!f5082(var23).equal(f5082(var22))) {
                final SubLObject var24 = f5082(var23);
                final SubLObject var25 = f5082(var22);
                final SubLObject var26 = module0067.f4884($g1109$.getGlobalValue(), var24, (SubLObject)UNPROVIDED);
                SubLObject var27 = module0067.f4884($g1109$.getGlobalValue(), var25, (SubLObject)UNPROVIDED);
                SubLObject var28 = (SubLObject)NIL;
                SubLObject var29 = var26;
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL != var29) {
                    if (!var30.eql(var23)) {
                        var28 = (SubLObject)ConsesLow.cons(var30, var28);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
                if (NIL != var28) {
                    module0067.f4886($g1109$.getGlobalValue(), var24, var28);
                }
                else {
                    module0067.f4887($g1109$.getGlobalValue(), var24);
                }
                f5088(var23, var25);
                if (NIL != var27) {
                    var27 = (SubLObject)ConsesLow.cons(var23, var27);
                }
                else {
                    var27 = (SubLObject)ConsesLow.list(var23);
                }
                module0067.f4886($g1109$.getGlobalValue(), var25, var27);
            }
            return (SubLObject)NIL;
        }
        $g1108$.setGlobalValue((SubLObject)ConsesLow.cons(var22, $g1108$.getGlobalValue()));
        module0067.f4886($g1107$.getGlobalValue(), f5081(var22), var22);
        final SubLObject var31 = f5082(var22);
        SubLObject var32 = module0067.f4884($g1109$.getGlobalValue(), var31, (SubLObject)UNPROVIDED);
        if (NIL != var32) {
            var32 = (SubLObject)ConsesLow.cons(var22, var32);
        }
        else {
            var32 = (SubLObject)ConsesLow.list(var22);
        }
        module0067.f4886($g1109$.getGlobalValue(), var31, var32);
        return var22;
    }
    
    public static SubLObject f5099(final SubLObject var22) {
        if (NIL != f5104(var22)) {
            Symbols.set(f5081(var22), f5105(var22));
            return f5081(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5098() {
        return Sequences.reverse($g1108$.getGlobalValue());
    }
    
    public static SubLObject f5104(final SubLObject var22) {
        final SubLObject var23 = f5084(var22);
        if (var23.eql((SubLObject)$ic43$) || var23.eql((SubLObject)$ic44$)) {
            if (NIL != f5085(var22)) {
                return (SubLObject)NIL;
            }
            return (SubLObject)T;
        }
        else {
            if (var23.eql((SubLObject)$ic41$) || var23.eql((SubLObject)$ic42$)) {
                return (SubLObject)T;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f5105(final SubLObject var22) {
        return f5083(var22);
    }
    
    public static SubLObject f5106(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        var33 = (SubLObject)ConsesLow.cons(f5107(module0026.f1369(var32)), var33);
        var33 = (SubLObject)ConsesLow.cons(module0026.f1371(var32), var33);
        SubLObject var35;
        final SubLObject var34 = var35 = module0026.f1379(var32);
        SubLObject var36 = (SubLObject)NIL;
        var36 = var35.first();
        while (NIL != var35) {
            var33 = (SubLObject)ConsesLow.cons(f5106(var36), var33);
            var35 = var35.rest();
            var36 = var35.first();
        }
        return Sequences.nreverse(var33);
    }
    
    public static SubLObject f5107(final SubLObject var35) {
        SubLObject var36;
        for (var36 = Sequences.length(var35); var36.numGE((SubLObject)ZERO_INTEGER) && !module0038.f2631(var35, var36).eql((SubLObject)Characters.CHAR_period); var36 = Numbers.subtract(var36, (SubLObject)ONE_INTEGER)) {}
        if (var36.isNegative()) {
            return var35;
        }
        return module0038.f2623(var35, Numbers.add(var36, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5108(final SubLObject var37) {
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = var37;
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL != var39) {
                var38 = (SubLObject)ConsesLow.cons((SubLObject)$ic47$, var38);
            }
            else {
                var39 = (SubLObject)T;
            }
            var38 = (SubLObject)ConsesLow.cons(module0038.f2624(var41), var38);
            var40 = var40.rest();
            var41 = var40.first();
        }
        if (NIL != var38) {
            return Functions.apply(Symbols.symbol_function((SubLObject)$ic48$), Sequences.nreverse(var38));
        }
        return (SubLObject)$ic49$;
    }
    
    public static SubLObject f5109(final SubLObject var41, final SubLObject var42) {
        assert NIL != Types.keywordp(var41) : var41;
        assert NIL != Types.stringp(var42) : var42;
        module0026.f1391(var42);
        final SubLObject var43 = module0026.f1392(var42);
        if (NIL == var43) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = module0026.f1382(var43);
        f5110(var44);
        f5111(var41, var44);
        return var43;
    }
    
    public static SubLObject f5110(final SubLObject var44) {
        SubLObject var45 = var44;
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            final SubLObject var47 = var46.first();
            final SubLObject var48 = conses_high.second(var46);
            final SubLObject var49 = conses_high.third(var46);
            final SubLObject var50 = module0067.f4884($g1109$.getGlobalValue(), var47, (SubLObject)UNPROVIDED);
            if (NIL != var50) {
                SubLObject var21_48 = var50;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var21_48.first();
                while (NIL != var21_48) {
                    f5089(var51, var48);
                    f5090(var51, var49);
                    f5091(var51, (SubLObject)T);
                    Symbols.set(f5081(var51), var48);
                    var21_48 = var21_48.rest();
                    var51 = var21_48.first();
                }
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5111(final SubLObject var41, final SubLObject var44) {
        final SubLObject var45 = module0067.f4884($g1110$.getGlobalValue(), var41, (SubLObject)UNPROVIDED);
        if (NIL == var45) {
            return (SubLObject)NIL;
        }
        SubLObject var46 = var45;
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            Functions.funcall(var47, var41, var44);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5112(final SubLObject var52, final SubLObject var53) {
        SubLObject var55;
        final SubLObject var54 = var55 = var52.rest();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic52$);
        var56 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic52$);
        var57 = var55.first();
        var55 = var55.rest();
        if (NIL == var55) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic54$, var56, (SubLObject)$ic55$), (SubLObject)ConsesLow.listS((SubLObject)$ic54$, var57, (SubLObject)$ic56$), (SubLObject)ConsesLow.listS((SubLObject)$ic57$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)$ic3$, var56))), (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)$ic58$, (SubLObject)ConsesLow.listS((SubLObject)$ic61$, var57, (SubLObject)$ic62$), (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var57))), (SubLObject)$ic65$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5113(final SubLObject var52, final SubLObject var53) {
        SubLObject var55;
        final SubLObject var54 = var55 = var52.rest();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic52$);
        var56 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic52$);
        var57 = var55.first();
        var55 = var55.rest();
        if (NIL != var55) {
            cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)$ic52$);
            return (SubLObject)NIL;
        }
        assert NIL != Types.keywordp(var56) : var56;
        assert NIL != Types.function_spec_p(var57) : var57;
        final SubLObject var58 = module0067.f4884($g1110$.getGlobalValue(), var56, (SubLObject)UNPROVIDED);
        SubLObject var59 = (SubLObject)NIL;
        if (NIL == var58) {
            return (SubLObject)$ic67$;
        }
        SubLObject var60 = var58;
        SubLObject var61 = (SubLObject)NIL;
        var61 = var60.first();
        while (NIL != var60) {
            if (!var61.equal(var57)) {
                var59 = (SubLObject)ConsesLow.cons(var61, var59);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        if (NIL == var59) {
            module0067.f4887($g1110$.getGlobalValue(), var56);
            return (SubLObject)$ic67$;
        }
        module0067.f4886($g1110$.getGlobalValue(), var56, Sequences.nreverse(var59));
        return (SubLObject)$ic67$;
    }
    
    public static SubLObject f5114(final SubLObject var52, final SubLObject var53) {
        SubLObject var55;
        final SubLObject var54 = var55 = var52.rest();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic68$);
        var56 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic68$);
        var57 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)$ic68$);
        var58 = var55.first();
        final SubLObject var59;
        var55 = (var59 = var55.rest());
        final SubLObject var60 = module0035.f2248(var57);
        if (!var60.numE((SubLObject)TWO_INTEGER)) {
            Errors.warn((SubLObject)$ic69$, var56, var57);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic70$, var56, var57, ConsesLow.append(var59, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var58), (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)$ic72$, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var56))));
    }
    
    public static SubLObject f5115() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5078", "S#6657", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5080", "S#6656", 1, 0, false);
        new $f5080$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5081", "S#6658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5082", "S#6659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5083", "S#6660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5084", "S#6661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5085", "S#6662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5086", "S#6663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5087", "S#6664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5088", "S#6665", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5089", "S#6666", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5090", "S#6667", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5091", "S#6668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5092", "S#6669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5093", "S#6670", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5094", "S#6671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5095", "S#6672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5096", "S#6673", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5079", "S#6674", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5097", "S#6675", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5100", "S#6676", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5101", "S#6677", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5102", "S#6678", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5103", "S#6679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5099", "S#6680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5098", "S#6681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5104", "S#6682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5105", "S#6683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5106", "S#6684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5107", "S#6685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5108", "S#6686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5109", "S#6687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5110", "S#6688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0072", "f5111", "S#6689", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0072", "f5112", "S#6690");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0072", "f5113", "S#6691");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0072", "f5114", "S#6692");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5116() {
        $g1107$ = SubLFiles.deflexical("S#6693", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1107$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1108$ = SubLFiles.deflexical("S#6694", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g1108$.getGlobalValue() : NIL));
        $g1109$ = SubLFiles.deflexical("S#6695", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g1109$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1110$ = SubLFiles.deflexical("S#6696", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g1110$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1111$ = SubLFiles.deflexical("S#6697", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g1111$.getGlobalValue() : NIL));
        $g1112$ = SubLFiles.defconstant("S#6698", (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5117() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1112$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Equality.identity((SubLObject)$ic5$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1112$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5115();
    }
    
    public void initializeVariables() {
        f5116();
    }
    
    public void runTopLevelForms() {
        f5117();
    }
    
    static {
        me = (SubLFile)new module0072();
        $g1107$ = null;
        $g1108$ = null;
        $g1109$ = null;
        $g1110$ = null;
        $g1111$ = null;
        $g1112$ = null;
        $ic0$ = makeSymbol("S#6693", "CYC");
        $ic1$ = makeSymbol("S#6694", "CYC");
        $ic2$ = makeSymbol("S#6695", "CYC");
        $ic3$ = makeSymbol("S#6696", "CYC");
        $ic4$ = makeSymbol("S#6697", "CYC");
        $ic5$ = makeSymbol("S#6655", "CYC");
        $ic6$ = makeSymbol("S#6656", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#6699", "CYC"), (SubLObject)makeSymbol("S#6700", "CYC"), (SubLObject)makeSymbol("S#6701", "CYC"), (SubLObject)makeSymbol("S#6702", "CYC"), (SubLObject)makeSymbol("S#6703", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("RED-KEY"), (SubLObject)makeKeyword("DEFAULT-VALUE"), (SubLObject)makeKeyword("LTYPE"), (SubLObject)makeKeyword("SET-FROM-RED"), (SubLObject)makeKeyword("VALUETYPE"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#6658", "CYC"), (SubLObject)makeSymbol("S#6659", "CYC"), (SubLObject)makeSymbol("S#6660", "CYC"), (SubLObject)makeSymbol("S#6661", "CYC"), (SubLObject)makeSymbol("S#6662", "CYC"), (SubLObject)makeSymbol("S#6663", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#6664", "CYC"), (SubLObject)makeSymbol("S#6665", "CYC"), (SubLObject)makeSymbol("S#6666", "CYC"), (SubLObject)makeSymbol("S#6667", "CYC"), (SubLObject)makeSymbol("S#6668", "CYC"), (SubLObject)makeSymbol("S#6669", "CYC"));
        $ic11$ = makeSymbol("S#6674", "CYC");
        $ic12$ = makeSymbol("S#6657", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#6656", "CYC"));
        $ic14$ = makeSymbol("S#6658", "CYC");
        $ic15$ = makeSymbol("S#6664", "CYC");
        $ic16$ = makeSymbol("S#6659", "CYC");
        $ic17$ = makeSymbol("S#6665", "CYC");
        $ic18$ = makeSymbol("S#6660", "CYC");
        $ic19$ = makeSymbol("S#6666", "CYC");
        $ic20$ = makeSymbol("S#6661", "CYC");
        $ic21$ = makeSymbol("S#6667", "CYC");
        $ic22$ = makeSymbol("S#6662", "CYC");
        $ic23$ = makeSymbol("S#6668", "CYC");
        $ic24$ = makeSymbol("S#6663", "CYC");
        $ic25$ = makeSymbol("S#6669", "CYC");
        $ic26$ = makeKeyword("NAME");
        $ic27$ = makeKeyword("RED-KEY");
        $ic28$ = makeKeyword("DEFAULT-VALUE");
        $ic29$ = makeKeyword("LTYPE");
        $ic30$ = makeKeyword("SET-FROM-RED");
        $ic31$ = makeKeyword("VALUETYPE");
        $ic32$ = makeString("Invalid slot ~S for construction function");
        $ic33$ = makeKeyword("BEGIN");
        $ic34$ = makeSymbol("S#6670", "CYC");
        $ic35$ = makeKeyword("SLOT");
        $ic36$ = makeKeyword("END");
        $ic37$ = makeSymbol("S#6672", "CYC");
        $ic38$ = makeKeyword("SIMPLE");
        $ic39$ = makeString("#<red-symbol name: ~s  red-key = ~s  default value = ~s ltype = ~s set-from-red = ~s value-type = ~s>");
        $ic40$ = makeString("~s = ~s~%");
        $ic41$ = makeKeyword("PARAMETER");
        $ic42$ = makeKeyword("LEXICAL");
        $ic43$ = makeKeyword("GLOBAL");
        $ic44$ = makeKeyword("VAR");
        $ic45$ = makeKeyword("LEAST-PRIVILEGED");
        $ic46$ = makeKeyword("LIST");
        $ic47$ = makeString(".");
        $ic48$ = makeSymbol("CCONCATENATE");
        $ic49$ = makeString("");
        $ic50$ = makeSymbol("KEYWORDP");
        $ic51$ = makeSymbol("STRINGP");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#6704", "CYC"), (SubLObject)makeSymbol("S#6705", "CYC"));
        $ic53$ = makeSymbol("PROGN");
        $ic54$ = makeSymbol("CHECK-TYPE");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("KEYWORDP"));
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION-SPEC-P"));
        $ic57$ = makeSymbol("CLET");
        $ic58$ = makeSymbol("S#6706", "CYC");
        $ic59$ = makeSymbol("DICTIONARY-LOOKUP");
        $ic60$ = makeSymbol("PIF");
        $ic61$ = makeSymbol("CPUSH");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#6706", "CYC"));
        $ic63$ = makeSymbol("CSETQ");
        $ic64$ = makeSymbol("LIST");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DICTIONARY-ENTER"), (SubLObject)makeSymbol("S#6696", "CYC"), (SubLObject)makeSymbol("S#6704", "CYC"), (SubLObject)makeSymbol("S#6706", "CYC")));
        $ic66$ = makeSymbol("FUNCTION-SPEC-P");
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("S#6707", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic69$ = makeString("RED reload callback ~A has an invalid arglist of:~%  ~S~%Use DEFINE instead.");
        $ic70$ = makeSymbol("DEFINE");
        $ic71$ = makeSymbol("CDOLIST");
        $ic72$ = makeSymbol("S#6704", "CYC");
        $ic73$ = makeSymbol("S#6690", "CYC");
        $ic74$ = makeSymbol("QUOTE");
    }
    
    public static final class $sX6655_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $red_key;
        public SubLObject $default_value;
        public SubLObject $ltype;
        public SubLObject $set_from_red;
        public SubLObject $valuetype;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6655_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$red_key = (SubLObject)CommonSymbols.NIL;
            this.$default_value = (SubLObject)CommonSymbols.NIL;
            this.$ltype = (SubLObject)CommonSymbols.NIL;
            this.$set_from_red = (SubLObject)CommonSymbols.NIL;
            this.$valuetype = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6655_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$red_key;
        }
        
        public SubLObject getField4() {
            return this.$default_value;
        }
        
        public SubLObject getField5() {
            return this.$ltype;
        }
        
        public SubLObject getField6() {
            return this.$set_from_red;
        }
        
        public SubLObject getField7() {
            return this.$valuetype;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$red_key = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$default_value = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$ltype = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$set_from_red = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$valuetype = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6655_native.class, $ic5$, $ic6$, $ic7$, $ic8$, new String[] { "$name", "$red_key", "$default_value", "$ltype", "$set_from_red", "$valuetype" }, $ic9$, $ic10$, $ic11$);
        }
    }
    
    public static final class $f5080$UnaryFunction extends UnaryFunction
    {
        public $f5080$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6656"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5080(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 168 ms
	
	Decompiled with Procyon 0.5.32.
*/