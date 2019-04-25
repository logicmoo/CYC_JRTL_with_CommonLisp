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
        f19664(var1, var2, (SubLObject)module0292.ZERO_INTEGER);
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19665(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX22300_native.class) ? module0292.T : module0292.NIL);
    }
    
    public static SubLObject f19666(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f19667(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f19668(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f19669(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f19670(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f19671(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f19672(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f19673(final SubLObject var1) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f19674(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f19675(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f19676(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f19677(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f19678(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f19679(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f19680(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f19681(final SubLObject var1, final SubLObject var4) {
        assert module0292.NIL != f19665(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f19682(SubLObject var5) {
        if (var5 == module0292.UNPROVIDED) {
            var5 = (SubLObject)module0292.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX22300_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0292.NIL, var7 = var5; module0292.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0292.$ic25$)) {
                f19674(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic26$)) {
                f19675(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic27$)) {
                f19676(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic28$)) {
                f19677(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic29$)) {
                f19678(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic30$)) {
                f19679(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic31$)) {
                f19680(var6, var9);
            }
            else if (var10.eql((SubLObject)module0292.$ic32$)) {
                f19681(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0292.$ic33$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f19683(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic34$, (SubLObject)module0292.$ic35$, (SubLObject)module0292.EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic25$, f19666(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic26$, f19667(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic27$, f19668(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic28$, f19669(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic29$, f19670(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic30$, f19671(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic31$, f19672(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic36$, (SubLObject)module0292.$ic32$, f19673(var11));
        Functions.funcall(var12, var11, (SubLObject)module0292.$ic37$, (SubLObject)module0292.$ic35$, (SubLObject)module0292.EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f19684(final SubLObject var11, final SubLObject var12) {
        return f19683(var11, var12);
    }
    
    public static SubLObject f19664(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)module0292.$ic39$, f19685(var13));
        PrintLow.format(var2, (SubLObject)module0292.$ic40$, f19686(var13));
        PrintLow.format(var2, (SubLObject)module0292.$ic41$, f19687(var13));
        PrintLow.format(var2, (SubLObject)module0292.$ic42$, f19688(var13));
        return var13;
    }
    
    public static SubLObject f19689(final SubLObject var13, SubLObject var2) {
        if (var2 == module0292.UNPROVIDED) {
            var2 = (SubLObject)module0292.T;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = print_high.$print_pretty$.currentBinding(var14);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0292.NIL, var14);
            PrintLow.format(var2, (SubLObject)module0292.$ic43$, f19690(var13));
            PrintLow.format(var2, (SubLObject)module0292.$ic44$, f19691(var13));
            PrintLow.format(var2, (SubLObject)module0292.$ic45$);
            PrintLow.format(var2, (SubLObject)module0292.$ic46$, f19692(var13));
        }
        finally {
            print_high.$print_pretty$.rebind(var15, var14);
        }
        return (SubLObject)module0292.T;
    }
    
    public static SubLObject f19693(final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = f19682((SubLObject)module0292.UNPROVIDED);
        final SubLObject var20 = conses_high.getf(var18, (SubLObject)module0292.$ic26$, (SubLObject)module0292.UNPROVIDED);
        final SubLObject var21 = conses_high.getf(var18, (SubLObject)module0292.$ic27$, (SubLObject)module0292.UNPROVIDED);
        final SubLObject var22 = conses_high.getf(var18, (SubLObject)module0292.$ic28$, (SubLObject)module0292.UNPROVIDED);
        final SubLObject var23 = conses_high.getf(var18, (SubLObject)module0292.$ic29$, (SubLObject)module0292.UNPROVIDED);
        final SubLObject var24 = conses_high.getf(var18, (SubLObject)module0292.$ic30$, (SubLObject)module0292.UNPROVIDED);
        final SubLObject var25 = conses_high.getf(var18, (SubLObject)module0292.$ic31$, (SubLObject)module0292.UNPROVIDED);
        if (module0292.NIL == var20) {
            module0293.f19714((SubLObject)module0292.ZERO_INTEGER, (SubLObject)module0292.$ic47$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
            return (SubLObject)module0292.NIL;
        }
        f19675(var19, var20);
        if (module0292.NIL == var21) {
            module0293.f19714((SubLObject)module0292.ZERO_INTEGER, (SubLObject)module0292.$ic48$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
            return (SubLObject)module0292.NIL;
        }
        f19676(var19, var21);
        if (module0292.NIL == var22) {
            module0293.f19714((SubLObject)module0292.ZERO_INTEGER, (SubLObject)module0292.$ic49$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
            return (SubLObject)module0292.NIL;
        }
        f19677(var19, var22);
        f19674(var19, var17);
        if (module0292.NIL == var23) {
            module0293.f19714((SubLObject)module0292.TWO_INTEGER, (SubLObject)module0292.$ic50$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
        }
        f19678(var19, var23);
        if (module0292.NIL == var24) {
            module0293.f19714((SubLObject)module0292.TWO_INTEGER, (SubLObject)module0292.$ic51$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
        }
        f19679(var19, var24);
        if (module0292.NIL == var25) {
            module0293.f19714((SubLObject)module0292.TWO_INTEGER, (SubLObject)module0292.$ic52$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0292.NIL != f19665(var25) && module0292.NIL != constant_handles_oc.f8449(f19685(var25)) && f19686(var25).isFunctionSpec() && f19687(var25).isFunctionSpec() && f19688(var25).isFunctionSpec());
    }
    
    public static SubLObject f19696(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0292.$ic53$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0292.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0292.$ic53$);
        var31 = var29.first();
        var29 = var29.rest();
        if (module0292.NIL == var29) {
            final SubLObject var32;
            var29 = (var32 = var30);
            return (SubLObject)ConsesLow.list((SubLObject)module0292.$ic54$, (SubLObject)module0292.$ic55$, (SubLObject)ConsesLow.listS((SubLObject)module0292.$ic56$, (SubLObject)ConsesLow.list(reader.bq_cons(var31, (SubLObject)module0292.$ic57$)), ConsesLow.append(var32, (SubLObject)module0292.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0292.$ic53$);
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19697(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0292.$ic58$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0292.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0292.$ic58$);
        var31 = var29.first();
        var29 = var29.rest();
        final SubLObject var32 = (SubLObject)(var29.isCons() ? var29.first() : module0292.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var29, var28, (SubLObject)module0292.$ic58$);
        var29 = var29.rest();
        if (module0292.NIL == var29) {
            final SubLObject var33;
            var29 = (var33 = var30);
            return (SubLObject)ConsesLow.list((SubLObject)module0292.$ic59$, (SubLObject)ConsesLow.list((SubLObject)module0292.$ic60$, (SubLObject)module0292.$ic61$, var32), (SubLObject)ConsesLow.listS((SubLObject)module0292.$ic56$, (SubLObject)ConsesLow.list(reader.bq_cons(var31, (SubLObject)module0292.$ic57$)), ConsesLow.append(var33, (SubLObject)module0292.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0292.$ic58$);
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19698(final SubLObject var37, final SubLObject var18) {
        f19699();
        final SubLObject var38 = f19693(var37, var18);
        f19700(var38);
        return var38;
    }
    
    public static SubLObject f19701() {
        return module0292.$g2673$.getGlobalValue();
    }
    
    public static SubLObject f19702() {
        return Mapping.mapcar((SubLObject)module0292.$ic63$, f19701());
    }
    
    public static SubLObject f19703() {
        return Sequences.length(module0292.$g2673$.getGlobalValue());
    }
    
    public static SubLObject f19704() {
        module0292.$g2673$.setGlobalValue((SubLObject)module0292.NIL);
        return (SubLObject)module0292.T;
    }
    
    public static SubLObject f19699() {
        SubLObject var38 = f19701();
        SubLObject var39 = (SubLObject)module0292.NIL;
        var39 = var38.first();
        while (module0292.NIL != var38) {
            final SubLObject var40 = var39;
            if (module0292.NIL == f19695(var40)) {
                module0293.f19714((SubLObject)module0292.ZERO_INTEGER, (SubLObject)module0292.$ic64$, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
                f19704();
                return (SubLObject)module0292.T;
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19705(final SubLObject var40) {
        SubLObject var41 = (SubLObject)module0292.NIL;
        if (module0292.NIL == var41) {
            SubLObject var42 = f19701();
            SubLObject var43 = (SubLObject)module0292.NIL;
            var43 = var42.first();
            while (module0292.NIL == var41 && module0292.NIL != var42) {
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
        if (module0292.NIL != f19705(var14)) {
            module0293.f19714((SubLObject)module0292.FIVE_INTEGER, (SubLObject)module0292.$ic65$, var14, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
            f19706(var14);
        }
        module0292.$g2673$.setGlobalValue((SubLObject)ConsesLow.cons(var13, module0292.$g2673$.getGlobalValue()));
        return (SubLObject)module0292.T;
    }
    
    public static SubLObject f19706(final SubLObject var40) {
        SubLObject var41 = (SubLObject)module0292.NIL;
        SubLObject var42 = f19701();
        SubLObject var43 = (SubLObject)module0292.NIL;
        var43 = var42.first();
        while (module0292.NIL != var42) {
            final SubLObject var44 = var43;
            if (!var40.eql(f19685(var44))) {
                var41 = (SubLObject)ConsesLow.cons(var44, var41);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        if (module0292.NIL != module0035.f2004(f19701(), var41)) {
            module0293.f19714((SubLObject)module0292.TWO_INTEGER, (SubLObject)module0292.$ic66$, var40, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED, (SubLObject)module0292.UNPROVIDED);
            return (SubLObject)module0292.NIL;
        }
        module0292.$g2673$.setGlobalValue(Sequences.nreverse(var41));
        return (SubLObject)module0292.T;
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
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19711() {
        module0292.$g2672$ = SubLFiles.defconstant("S#22347", (SubLObject)module0292.$ic0$);
        module0292.$g2673$ = SubLFiles.deflexical("S#22348", (SubLObject)((module0292.NIL != Symbols.boundp((SubLObject)module0292.$ic62$)) ? module0292.$g2673$.getGlobalValue() : module0292.NIL));
        return (SubLObject)module0292.NIL;
    }
    
    public static SubLObject f19712() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0292.$g2672$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0292.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0292.$ic8$);
        Structures.def_csetf((SubLObject)module0292.$ic9$, (SubLObject)module0292.$ic10$);
        Structures.def_csetf((SubLObject)module0292.$ic11$, (SubLObject)module0292.$ic12$);
        Structures.def_csetf((SubLObject)module0292.$ic13$, (SubLObject)module0292.$ic14$);
        Structures.def_csetf((SubLObject)module0292.$ic15$, (SubLObject)module0292.$ic16$);
        Structures.def_csetf((SubLObject)module0292.$ic17$, (SubLObject)module0292.$ic18$);
        Structures.def_csetf((SubLObject)module0292.$ic19$, (SubLObject)module0292.$ic20$);
        Structures.def_csetf((SubLObject)module0292.$ic21$, (SubLObject)module0292.$ic22$);
        Structures.def_csetf((SubLObject)module0292.$ic23$, (SubLObject)module0292.$ic24$);
        Equality.identity((SubLObject)module0292.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0292.$g2672$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0292.$ic38$));
        module0003.f57((SubLObject)module0292.$ic62$);
        return (SubLObject)module0292.NIL;
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
        module0292.$g2672$ = null;
        module0292.$g2673$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#22300", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#22301", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22350", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22351", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("S#22352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22353", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)SubLObjectFactory.makeKeyword("REFORMULATE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22303", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22304", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22305", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22306", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22307", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22309", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22310", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22311", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22312", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22313", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22314", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22315", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22316", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22317", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22318", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#22322", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#22302", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#22301", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#22303", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#22311", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#22304", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#22312", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#22305", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#22313", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#22306", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#22314", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#22307", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#22315", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#22308", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#22316", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#22309", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#22317", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#22310", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#22318", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("NAME");
        $ic26$ = SubLObjectFactory.makeKeyword("REQUIRED");
        $ic27$ = SubLObjectFactory.makeKeyword("COST");
        $ic28$ = SubLObjectFactory.makeKeyword("REFORMULATE");
        $ic29$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic30$ = SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE");
        $ic31$ = SubLObjectFactory.makeKeyword("EXAMPLE-TARGET");
        $ic32$ = SubLObjectFactory.makeKeyword("PLIST");
        $ic33$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic34$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic35$ = SubLObjectFactory.makeSymbol("S#22319", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic37$ = SubLObjectFactory.makeKeyword("END");
        $ic38$ = SubLObjectFactory.makeSymbol("S#22321", "CYC");
        $ic39$ = SubLObjectFactory.makeString("#<RL-Module: Name:        ~S~%");
        $ic40$ = SubLObjectFactory.makeString("             Required:    ~S~%");
        $ic41$ = SubLObjectFactory.makeString("             Cost:        ~S~%");
        $ic42$ = SubLObjectFactory.makeString("             Reformulate: ~S>~%");
        $ic43$ = SubLObjectFactory.makeString("~%Documentation: ~A");
        $ic44$ = SubLObjectFactory.makeString("~%~%Input: ~%~S");
        $ic45$ = SubLObjectFactory.makeString("~%==>");
        $ic46$ = SubLObjectFactory.makeString("~%~%Desired output: ~%~S");
        $ic47$ = SubLObjectFactory.makeString("~%Missing :required info. Aborting");
        $ic48$ = SubLObjectFactory.makeString("~%Missing :cost info. Aborting");
        $ic49$ = SubLObjectFactory.makeString("~%Missing :reformulate info. Aborting");
        $ic50$ = SubLObjectFactory.makeString("~%Missing :documentation info. Bad programmer!");
        $ic51$ = SubLObjectFactory.makeString("~%Missing :example-source info. Bad programmer!");
        $ic52$ = SubLObjectFactory.makeString("~%Missing :example-target info. Bad programmer!");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic54$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22337", "CYC")));
        $ic56$ = SubLObjectFactory.makeSymbol("CLET");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"));
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC"), (SubLObject)module0292.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic59$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic60$ = SubLObjectFactory.makeSymbol("MOD");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22337", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#22348", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#22325", "CYC");
        $ic64$ = SubLObjectFactory.makeString("RL module store corrupt; clearing...");
        $ic65$ = SubLObjectFactory.makeString("RL module ~S already exists in the store; replacing.");
        $ic66$ = SubLObjectFactory.makeString("~%No module named ~S found in the store; could not remove.");
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
        private static final SubLStructDeclNative structDecl;
        
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
            return (SubLStructDecl)$sX22300_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX22300_native.class, module0292.$ic0$, module0292.$ic1$, module0292.$ic2$, module0292.$ic3$, new String[] { "$name", "$required", "$cost", "$reformulate", "$documentation", "$example_source", "$example_target", "$plist" }, module0292.$ic4$, module0292.$ic5$, module0292.$ic6$);
        }
    }
    
    public static final class $f19665$UnaryFunction extends UnaryFunction
    {
        public $f19665$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22301"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0292.f19665(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0292.class
	Total time: 157 ms
	
	Decompiled with Procyon 0.5.32.
*/