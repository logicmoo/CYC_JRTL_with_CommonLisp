package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0292 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0292";
    public static final String myFingerPrint = "21b3acfa90587f0a84528e320ee923de3d51d1c54ce57cbb1c334bd82ee3e0d6";
    public static SubLSymbol $g2672$;
    private static SubLSymbol $g2673$;
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
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
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
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    
    public static SubLObject f19663(final SubLObject var1, final SubLObject var2) {
        f19664(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19665(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX22300_native.class) ? T : NIL);
    }
    
    public static SubLObject f19666(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f19667(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f19668(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f19669(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f19670(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f19671(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f19672(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f19673(final SubLObject var1) {
        assert NIL != f19665(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f19674(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f19675(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f19676(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f19677(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f19678(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f19679(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f19680(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f19681(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19665(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f19682(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX22300_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic25$)) {
                f19674(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f19675(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f19676(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f19677(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f19678(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f19679(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f19680(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic32$)) {
                f19681(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic33$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f19683(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic25$, f19666(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic26$, f19667(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic27$, f19668(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic28$, f19669(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic29$, f19670(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic30$, f19671(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic31$, f19672(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic32$, f19673(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic35$, (SubLObject)EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f19684(final SubLObject var11, final SubLObject var12) {
        return f19683(var11, var12);
    }
    
    public static SubLObject f19664(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)$ic39$, f19685(var13));
        PrintLow.format(var2, (SubLObject)$ic40$, f19686(var13));
        PrintLow.format(var2, (SubLObject)$ic41$, f19687(var13));
        PrintLow.format(var2, (SubLObject)$ic42$, f19688(var13));
        return var13;
    }
    
    public static SubLObject f19689(final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = print_high.$print_pretty$.currentBinding(var14);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var14);
            PrintLow.format(var2, (SubLObject)$ic43$, f19690(var13));
            PrintLow.format(var2, (SubLObject)$ic44$, f19691(var13));
            PrintLow.format(var2, (SubLObject)$ic45$);
            PrintLow.format(var2, (SubLObject)$ic46$, f19692(var13));
        }
        finally {
            print_high.$print_pretty$.rebind(var15, var14);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f19693(final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = f19682((SubLObject)UNPROVIDED);
        final SubLObject var20 = conses_high.getf(var18, (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
        final SubLObject var21 = conses_high.getf(var18, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        final SubLObject var22 = conses_high.getf(var18, (SubLObject)$ic28$, (SubLObject)UNPROVIDED);
        final SubLObject var23 = conses_high.getf(var18, (SubLObject)$ic29$, (SubLObject)UNPROVIDED);
        final SubLObject var24 = conses_high.getf(var18, (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
        final SubLObject var25 = conses_high.getf(var18, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
        if (NIL == var20) {
            module0293.f19714((SubLObject)ZERO_INTEGER, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        f19675(var19, var20);
        if (NIL == var21) {
            module0293.f19714((SubLObject)ZERO_INTEGER, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        f19676(var19, var21);
        if (NIL == var22) {
            module0293.f19714((SubLObject)ZERO_INTEGER, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        f19677(var19, var22);
        f19674(var19, var17);
        if (NIL == var23) {
            module0293.f19714((SubLObject)TWO_INTEGER, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f19678(var19, var23);
        if (NIL == var24) {
            module0293.f19714((SubLObject)TWO_INTEGER, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f19679(var19, var24);
        if (NIL == var25) {
            module0293.f19714((SubLObject)TWO_INTEGER, (SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f19680(var19, var25);
        return var19;
    }
    
    public static SubLObject f19685(final SubLObject var13) {
        return f19666(var13);
    }
    
    public static SubLObject f19686(final SubLObject var13) {
        return f19667(var13);
    }
    
    public static SubLObject f19687(final SubLObject var13) {
        return f19668(var13);
    }
    
    public static SubLObject f19688(final SubLObject var13) {
        return f19669(var13);
    }
    
    public static SubLObject f19690(final SubLObject var13) {
        return f19670(var13);
    }
    
    public static SubLObject f19691(final SubLObject var13) {
        return f19671(var13);
    }
    
    public static SubLObject f19692(final SubLObject var13) {
        return f19672(var13);
    }
    
    public static SubLObject f19694(final SubLObject var13) {
        return f19673(var13);
    }
    
    public static SubLObject f19695(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f19665(var25) && NIL != constant_handles_oc.f8449(f19685(var25)) && f19686(var25).isFunctionSpec() && f19687(var25).isFunctionSpec() && f19688(var25).isFunctionSpec());
    }
    
    public static SubLObject f19696(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic53$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic53$);
        var31 = var29.first();
        var29 = var29.rest();
        if (NIL == var29) {
            final SubLObject var32;
            var29 = (var32 = var30);
            return (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, (SubLObject)ConsesLow.list(reader.bq_cons(var31, (SubLObject)$ic57$)), ConsesLow.append(var32, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic53$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19697(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic58$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic58$);
        var31 = var29.first();
        var29 = var29.rest();
        final SubLObject var32 = (SubLObject)(var29.isCons() ? var29.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var29, var28, (SubLObject)$ic58$);
        var29 = var29.rest();
        if (NIL == var29) {
            final SubLObject var33;
            var29 = (var33 = var30);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)$ic61$, var32), (SubLObject)ConsesLow.listS((SubLObject)$ic56$, (SubLObject)ConsesLow.list(reader.bq_cons(var31, (SubLObject)$ic57$)), ConsesLow.append(var33, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19698(final SubLObject var37, final SubLObject var18) {
        f19699();
        final SubLObject var38 = f19693(var37, var18);
        f19700(var38);
        return var38;
    }
    
    public static SubLObject f19701() {
        return $g2673$.getGlobalValue();
    }
    
    public static SubLObject f19702() {
        return Mapping.mapcar((SubLObject)$ic63$, f19701());
    }
    
    public static SubLObject f19703() {
        return Sequences.length($g2673$.getGlobalValue());
    }
    
    public static SubLObject f19704() {
        $g2673$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)T;
    }
    
    public static SubLObject f19699() {
        SubLObject var38 = f19701();
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            final SubLObject var40 = var39;
            if (NIL == f19695(var40)) {
                module0293.f19714((SubLObject)ZERO_INTEGER, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f19704();
                return (SubLObject)T;
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19705(final SubLObject var40) {
        SubLObject var41 = (SubLObject)NIL;
        if (NIL == var41) {
            SubLObject var42 = f19701();
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL == var41 && NIL != var42) {
                final SubLObject var44 = var43;
                if (var40.eql(f19685(var44))) {
                    var41 = var44;
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        return var41;
    }
    
    public static SubLObject f19700(final SubLObject var13) {
        final SubLObject var14 = f19685(var13);
        if (NIL != f19705(var14)) {
            module0293.f19714((SubLObject)FIVE_INTEGER, (SubLObject)$ic65$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f19706(var14);
        }
        $g2673$.setGlobalValue((SubLObject)ConsesLow.cons(var13, $g2673$.getGlobalValue()));
        return (SubLObject)T;
    }
    
    public static SubLObject f19706(final SubLObject var40) {
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = f19701();
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            final SubLObject var44 = var43;
            if (!var40.eql(f19685(var44))) {
                var41 = (SubLObject)ConsesLow.cons(var44, var41);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        if (NIL != module0035.f2004(f19701(), var41)) {
            module0293.f19714((SubLObject)TWO_INTEGER, (SubLObject)$ic66$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        $g2673$.setGlobalValue(Sequences.nreverse(var41));
        return (SubLObject)T;
    }
    
    public static SubLObject f19707(final SubLObject var13, final SubLObject var44, final SubLObject var45, final SubLObject var46) {
        return Functions.funcall(f19686(var13), var44, var45, var46);
    }
    
    public static SubLObject f19708(final SubLObject var13, final SubLObject var44, final SubLObject var45, final SubLObject var46) {
        return Functions.funcall(f19687(var13), var44, var45, var46);
    }
    
    public static SubLObject f19709(final SubLObject var13, final SubLObject var44, final SubLObject var47, final SubLObject var45, final SubLObject var46) {
        return Functions.funcall(f19688(var13), var44, var47, var45, var46);
    }
    
    public static SubLObject f19710() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19663", "S#22302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19665", "S#22301", 1, 0, false);
        new $f19665$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19666", "S#22303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19667", "S#22304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19668", "S#22305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19669", "S#22306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19670", "S#22307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19671", "S#22308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19672", "S#22309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19673", "S#22310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19674", "S#22311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19675", "S#22312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19676", "S#22313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19677", "S#22314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19678", "S#22315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19679", "S#22316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19680", "S#22317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19681", "S#22318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19682", "S#22319", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19683", "S#22320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19684", "S#22321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19664", "S#22322", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19689", "S#22323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19693", "S#22324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19685", "S#22325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19686", "S#22326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19687", "S#22327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19688", "S#22328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19690", "S#22329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19691", "S#22330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19692", "S#22331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19694", "S#22332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19695", "S#22333", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0292", "f19696", "S#22334");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0292", "f19697", "S#22335");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19698", "S#22336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19701", "S#22337", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19702", "S#22165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19703", "S#22338", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19704", "S#22339", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19699", "S#22340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19705", "S#22341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19700", "S#22342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19706", "S#22343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19707", "S#22344", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19708", "S#22345", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0292", "f19709", "S#22346", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19711() {
        $g2672$ = SubLFiles.defconstant("S#22347", (SubLObject)$ic0$);
        $g2673$ = SubLFiles.deflexical("S#22348", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic62$)) ? $g2673$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19712() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2672$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2672$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        module0003.f57((SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f19710();
    }
    
    public void initializeVariables() {
        f19711();
    }
    
    public void runTopLevelForms() {
        f19712();
    }
    
    static {
        me = (SubLFile)new module0292();
        $g2672$ = null;
        $g2673$ = null;
        $ic0$ = makeSymbol("S#22300", "CYC");
        $ic1$ = makeSymbol("S#22301", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#22349", "CYC"), (SubLObject)makeSymbol("S#22350", "CYC"), (SubLObject)makeSymbol("S#22351", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"), (SubLObject)makeSymbol("S#22352", "CYC"), (SubLObject)makeSymbol("S#22353", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("REQUIRED"), (SubLObject)makeKeyword("COST"), (SubLObject)makeKeyword("REFORMULATE"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeKeyword("EXAMPLE-SOURCE"), (SubLObject)makeKeyword("EXAMPLE-TARGET"), (SubLObject)makeKeyword("PLIST"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#22303", "CYC"), (SubLObject)makeSymbol("S#22304", "CYC"), (SubLObject)makeSymbol("S#22305", "CYC"), (SubLObject)makeSymbol("S#22306", "CYC"), (SubLObject)makeSymbol("S#22307", "CYC"), (SubLObject)makeSymbol("S#22308", "CYC"), (SubLObject)makeSymbol("S#22309", "CYC"), (SubLObject)makeSymbol("S#22310", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#22311", "CYC"), (SubLObject)makeSymbol("S#22312", "CYC"), (SubLObject)makeSymbol("S#22313", "CYC"), (SubLObject)makeSymbol("S#22314", "CYC"), (SubLObject)makeSymbol("S#22315", "CYC"), (SubLObject)makeSymbol("S#22316", "CYC"), (SubLObject)makeSymbol("S#22317", "CYC"), (SubLObject)makeSymbol("S#22318", "CYC"));
        $ic6$ = makeSymbol("S#22322", "CYC");
        $ic7$ = makeSymbol("S#22302", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#22301", "CYC"));
        $ic9$ = makeSymbol("S#22303", "CYC");
        $ic10$ = makeSymbol("S#22311", "CYC");
        $ic11$ = makeSymbol("S#22304", "CYC");
        $ic12$ = makeSymbol("S#22312", "CYC");
        $ic13$ = makeSymbol("S#22305", "CYC");
        $ic14$ = makeSymbol("S#22313", "CYC");
        $ic15$ = makeSymbol("S#22306", "CYC");
        $ic16$ = makeSymbol("S#22314", "CYC");
        $ic17$ = makeSymbol("S#22307", "CYC");
        $ic18$ = makeSymbol("S#22315", "CYC");
        $ic19$ = makeSymbol("S#22308", "CYC");
        $ic20$ = makeSymbol("S#22316", "CYC");
        $ic21$ = makeSymbol("S#22309", "CYC");
        $ic22$ = makeSymbol("S#22317", "CYC");
        $ic23$ = makeSymbol("S#22310", "CYC");
        $ic24$ = makeSymbol("S#22318", "CYC");
        $ic25$ = makeKeyword("NAME");
        $ic26$ = makeKeyword("REQUIRED");
        $ic27$ = makeKeyword("COST");
        $ic28$ = makeKeyword("REFORMULATE");
        $ic29$ = makeKeyword("DOCUMENTATION");
        $ic30$ = makeKeyword("EXAMPLE-SOURCE");
        $ic31$ = makeKeyword("EXAMPLE-TARGET");
        $ic32$ = makeKeyword("PLIST");
        $ic33$ = makeString("Invalid slot ~S for construction function");
        $ic34$ = makeKeyword("BEGIN");
        $ic35$ = makeSymbol("S#22319", "CYC");
        $ic36$ = makeKeyword("SLOT");
        $ic37$ = makeKeyword("END");
        $ic38$ = makeSymbol("S#22321", "CYC");
        $ic39$ = makeString("#<RL-Module: Name:        ~S~%");
        $ic40$ = makeString("             Required:    ~S~%");
        $ic41$ = makeString("             Cost:        ~S~%");
        $ic42$ = makeString("             Reformulate: ~S>~%");
        $ic43$ = makeString("~%Documentation: ~A");
        $ic44$ = makeString("~%~%Input: ~%~S");
        $ic45$ = makeString("~%==>");
        $ic46$ = makeString("~%~%Desired output: ~%~S");
        $ic47$ = makeString("~%Missing :required info. Aborting");
        $ic48$ = makeString("~%Missing :cost info. Aborting");
        $ic49$ = makeString("~%Missing :reformulate info. Aborting");
        $ic50$ = makeString("~%Missing :documentation info. Bad programmer!");
        $ic51$ = makeString("~%Missing :example-source info. Bad programmer!");
        $ic52$ = makeString("~%Missing :example-target info. Bad programmer!");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeSymbol("CDOLIST");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#22337", "CYC")));
        $ic56$ = makeSymbol("CLET");
        $ic57$ = ConsesLow.list((SubLObject)makeSymbol("MOD"));
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic59$ = makeSymbol("CSOME");
        $ic60$ = makeSymbol("MOD");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#22337", "CYC"));
        $ic62$ = makeSymbol("S#22348", "CYC");
        $ic63$ = makeSymbol("S#22325", "CYC");
        $ic64$ = makeString("RL module store corrupt; clearing...");
        $ic65$ = makeString("RL module ~S already exists in the store; replacing.");
        $ic66$ = makeString("~%No module named ~S found in the store; could not remove.");
    }
    
    public static final class $sX22300_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $required;
        public SubLObject $cost;
        public SubLObject $reformulate;
        public SubLObject $documentation;
        public SubLObject $example_source;
        public SubLObject $example_target;
        public SubLObject $plist;
        public static final SubLStructDeclNative structDecl;
        
        public $sX22300_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$required = (SubLObject)CommonSymbols.NIL;
            this.$cost = (SubLObject)CommonSymbols.NIL;
            this.$reformulate = (SubLObject)CommonSymbols.NIL;
            this.$documentation = (SubLObject)CommonSymbols.NIL;
            this.$example_source = (SubLObject)CommonSymbols.NIL;
            this.$example_target = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$required;
        }
        
        public SubLObject getField4() {
            return this.$cost;
        }
        
        public SubLObject getField5() {
            return this.$reformulate;
        }
        
        public SubLObject getField6() {
            return this.$documentation;
        }
        
        public SubLObject getField7() {
            return this.$example_source;
        }
        
        public SubLObject getField8() {
            return this.$example_target;
        }
        
        public SubLObject getField9() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$required = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$cost = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$reformulate = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$documentation = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$example_source = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$example_target = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX22300_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$name", "$required", "$cost", "$reformulate", "$documentation", "$example_source", "$example_target", "$plist" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f19665$UnaryFunction extends UnaryFunction
    {
        public $f19665$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22301"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f19665(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 157 ms
	
	Decompiled with Procyon 0.5.32.
*/