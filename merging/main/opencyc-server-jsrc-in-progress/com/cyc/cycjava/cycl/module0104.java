package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0104 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0104";
    public static final String myFingerPrint = "c8aec5e56c932554e2f63a829198ffb98f797af43c905531a6cd79e14fe9cdc5";
    private static SubLSymbol $g1344$;
    public static SubLSymbol $g1345$;
    private static SubLSymbol $g1346$;
    private static SubLSymbol $g1347$;
    private static SubLSymbol $g1348$;
    private static SubLSymbol $g1349$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
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
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLList $ic106$;
    private static final SubLFloat $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    
    
    public static SubLObject f7410(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g571$.currentBinding(var3);
        try {
            module0018.$g571$.bind((SubLObject)NIL, var3);
            SubLObject var6 = (SubLObject)NIL;
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var5_7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic0$, var3);
                    try {
                        final SubLObject var7 = Sequences.cconcatenate(var1, new SubLObject[] { var2, $ic1$ });
                        var4 = Eval.load(var7);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var5_7, var3);
                }
            }
            catch (Throwable var9) {
                var6 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
            }
            finally {
                var3.throwStack.pop();
            }
            if (var6.isString()) {
                Errors.warn((SubLObject)$ic2$, var6);
            }
        }
        finally {
            module0018.$g571$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f7411() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != $g1345$.getDynamicValue(var3)) ? ((NIL != module0038.f2673($g1345$.getDynamicValue(var3), (SubLObject)$ic3$, (SubLObject)UNPROVIDED)) ? $g1345$.getDynamicValue(var3) : Sequences.cconcatenate($g1345$.getDynamicValue(var3), (SubLObject)$ic3$)) : NIL);
    }
    
    public static SubLObject f7412(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic4$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19_20 = (SubLObject)NIL;
        while (NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic4$);
            var19_20 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic4$);
            if (NIL == conses_high.member(var19_20, (SubLObject)$ic5$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var18 = (SubLObject)T;
            }
            if (var19_20 == $ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (NIL != var18 && NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic4$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var14);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : $ic8$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var14);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var14);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var14);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : $ic12$);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var14);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : $ic14$);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var14);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : $ic16$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, var15, var20, var22, var24, var26, var28, var30);
    }
    
    public static SubLObject f7413(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic18$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var38_39 = (SubLObject)NIL;
        while (NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic18$);
            var38_39 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic18$);
            if (NIL == conses_high.member(var38_39, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var18 = (SubLObject)T;
            }
            if (var38_39 == $ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (NIL != var18 && NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic18$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var14);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var14);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var14);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic12$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var14);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : $ic14$);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var14);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : $ic16$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, var15, (SubLObject)$ic20$, var20, var22, var24, var26, var28);
    }
    
    public static SubLObject f7414(final SubLObject var15, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        assert NIL != module0029.f1473(var22) : var22;
        assert NIL != Types.booleanp(var24) : var24;
        assert NIL != Types.booleanp(var26) : var26;
        assert NIL != module0029.f1474(var28) : var28;
        assert NIL != Types.streamp(var30) : var30;
        assert NIL != Types.booleanp(var32) : var32;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = module0029.f1528(var15);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            var33 = ConsesLow.nconc(var33, f7415(var35, var22, var24, var26, var28, var30, var32));
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f7416(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic26$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var53_54 = (SubLObject)NIL;
        while (NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic26$);
            var53_54 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)$ic26$);
            if (NIL == conses_high.member(var53_54, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var18 = (SubLObject)T;
            }
            if (var53_54 == $ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (NIL != var18 && NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic26$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic28$, var14);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : FOUR_INTEGER);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var14);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : TEN_INTEGER);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var14);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic8$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var14);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var14);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var14);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : $ic12$);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var14);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : $ic14$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var14);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : $ic16$);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic30$, var15, var20, var22, var24, var26, var28, var30, var32, var34 });
    }
    
    public static SubLObject f7417(final SubLObject var15, final SubLObject var56, final SubLObject var58, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        assert NIL != module0004.f106(var56) : var56;
        assert NIL != module0004.f106(var58) : var58;
        assert NIL != module0029.f1473(var22) : var22;
        assert NIL != module0029.f1473(var22) : var22;
        assert NIL != Types.booleanp(var24) : var24;
        assert NIL != Types.booleanp(var26) : var26;
        assert NIL != module0029.f1474(var28) : var28;
        assert NIL != Types.streamp(var30) : var30;
        assert NIL != Types.booleanp(var32) : var32;
        SubLObject var59;
        for (var59 = (SubLObject)NIL, var59 = (SubLObject)ZERO_INTEGER; var59.numL(var56); var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER)) {
            module0004.f78(Sequences.cconcatenate((SubLObject)$ic33$, new SubLObject[] { module0006.f203(var15), $ic34$, module0006.f203(var59) }), Symbols.symbol_function((SubLObject)$ic35$), (SubLObject)ConsesLow.list(new SubLObject[] { var15, var59, var58, var22, var24, var26, var28, var30, var32 }));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7418(final SubLObject var15, final SubLObject var66, final SubLObject var58, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = module0029.f1528(var15);
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            SubLObject var70;
            for (var70 = (SubLObject)NIL, var70 = (SubLObject)ZERO_INTEGER; var70.numL(var58); var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER)) {
                var67 = ConsesLow.nconc(var67, f7415(var69, var22, var24, var26, var28, var30, var32));
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return var67;
    }
    
    public static SubLObject f7415(final SubLObject var47, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0029.f1491(var47);
        SubLObject var50 = (SubLObject)NIL;
        final SubLObject var51 = module0018.$g694$.currentBinding(var48);
        try {
            module0018.$g694$.bind((SubLObject)NIL, var48);
            final SubLObject var52 = module0029.f1510(var47);
            if (var52.eql((SubLObject)$ic36$)) {
                var50 = f7419(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic37$)) {
                var50 = f7420(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic38$)) {
                var50 = f7421(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic39$)) {
                var50 = f7422(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic40$)) {
                var50 = f7423(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic41$)) {
                var50 = f7424(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic42$)) {
                var50 = f7425(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)$ic43$)) {
                var50 = f7426(var49, var22, var24, var26, var28, var30, var32);
            }
            else {
                Errors.error((SubLObject)$ic44$, var49);
            }
        }
        finally {
            module0018.$g694$.rebind(var51, var48);
        }
        return var50;
    }
    
    public static SubLObject f7419(final SubLObject var70, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = (SubLObject)makeBoolean($ic45$ != var22);
        var71.resetMultipleValues();
        final SubLObject var73 = module0416.f29172(var70, var72, var24, var26, var28, var30, var32);
        final SubLObject var74 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        return (SubLObject)ConsesLow.list(var74);
    }
    
    public static SubLObject f7420(final SubLObject var73, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if ($ic45$ != var22) {
            if (NIL != var24) {
                Errors.warn((SubLObject)$ic46$);
            }
            if (NIL != var26) {
                Errors.warn((SubLObject)$ic47$);
            }
        }
        final SubLObject var75 = (SubLObject)makeBoolean($ic45$ != var22);
        final SubLObject var76 = Equality.eq((SubLObject)$ic20$, var22);
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = module0029.$g839$.currentBinding(var74);
        final SubLObject var80 = module0029.$g835$.currentBinding(var74);
        final SubLObject var81 = StreamsLow.$standard_output$.currentBinding(var74);
        try {
            module0029.$g839$.bind(var28, var74);
            module0029.$g835$.bind(var32, var74);
            StreamsLow.$standard_output$.bind(var30, var74);
            var77 = f7427(var73, var75, var76, (SubLObject)$ic48$);
            var78 = f7427(var73, var75, var76, (SubLObject)$ic49$);
        }
        finally {
            StreamsLow.$standard_output$.rebind(var81, var74);
            module0029.$g835$.rebind(var80, var74);
            module0029.$g839$.rebind(var79, var74);
        }
        return (SubLObject)ConsesLow.list(var77, var78);
    }
    
    public static SubLObject f7427(final SubLObject var73, final SubLObject var74, final SubLObject var71, final SubLObject var79) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        final SubLObject var84 = Time.get_internal_real_time();
        if (NIL == module0029.$g840$.getDynamicValue(var80)) {
            try {
                var80.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var85 = Errors.$error_handler$.currentBinding(var80);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic0$, var80);
                    try {
                        if (var79.eql((SubLObject)$ic48$)) {
                            var83 = module0421.f29414(var73, var74, var71, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var79.eql((SubLObject)$ic49$)) {
                            var83 = module0421.f29414(var73, var74, var71, (SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else {
                            Errors.error((SubLObject)$ic50$, var79);
                        }
                    }
                    catch (Throwable var86) {
                        Errors.handleThrowable(var86, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var85, var80);
                }
            }
            catch (Throwable var87) {
                var81 = Errors.handleThrowable(var87, module0003.$g3$.getGlobalValue());
            }
            finally {
                var80.throwStack.pop();
            }
        }
        else if (var79.eql((SubLObject)$ic48$)) {
            var83 = module0421.f29414(var73, var74, var71, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var79.eql((SubLObject)$ic49$)) {
            var83 = module0421.f29414(var73, var74, var71, (SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)$ic50$, var79);
        }
        var82 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var84), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL != var81) {
            var83 = module0029.f1535((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var73, var79), (SubLObject)$ic51$, var82);
        }
        return var83;
    }
    
    public static SubLObject f7421(final SubLObject var83, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, SubLObject var30, final SubLObject var32) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)NIL;
        if ($ic45$ == var22) {
            var30 = StreamsLow.$null_output$.getDynamicValue(var84);
        }
        final SubLObject var86 = module0029.$g835$.currentBinding(var84);
        try {
            module0029.$g835$.bind(var32, var84);
            var84.resetMultipleValues();
            final SubLObject var87 = module0417.f29242(var83, var28, var30, var24, var26);
            final SubLObject var88 = var84.secondMultipleValue();
            var84.resetMultipleValues();
            var85 = (SubLObject)ConsesLow.list(var88);
        }
        finally {
            module0029.$g835$.rebind(var86, var84);
        }
        return var85;
    }
    
    public static SubLObject f7422(final SubLObject var84, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, SubLObject var30, final SubLObject var32) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        if ($ic45$ == var22) {
            var30 = StreamsLow.$null_output$.getDynamicValue(var85);
        }
        final SubLObject var87 = module0029.$g835$.currentBinding(var85);
        try {
            module0029.$g835$.bind(var32, var85);
            var85.resetMultipleValues();
            final SubLObject var88 = module0418.f29304(var84, var28, var30, var24, var26);
            final SubLObject var89 = var85.secondMultipleValue();
            var85.resetMultipleValues();
            var86 = (SubLObject)ConsesLow.list(var89);
        }
        finally {
            module0029.$g835$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f7423(final SubLObject var85, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, SubLObject var30, final SubLObject var32) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        if ($ic45$ != var22) {
            if (NIL != var24) {
                Errors.warn((SubLObject)$ic52$);
            }
            if (NIL != var26) {
                Errors.warn((SubLObject)$ic53$);
            }
        }
        SubLObject var87 = (SubLObject)NIL;
        if ($ic45$ == var22) {
            var30 = StreamsLow.$null_output$.getDynamicValue(var86);
        }
        final SubLObject var88 = module0029.$g835$.currentBinding(var86);
        try {
            module0029.$g835$.bind(var32, var86);
            var87 = module0422.f29521(var85, var28, var30);
        }
        finally {
            module0029.$g835$.rebind(var88, var86);
        }
        return (SubLObject)ConsesLow.list(var87);
    }
    
    public static SubLObject f7424(final SubLObject var86, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, SubLObject var30, final SubLObject var32) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        if ($ic45$ != var22 && NIL != var26) {
            Errors.warn((SubLObject)$ic54$);
        }
        SubLObject var88 = (SubLObject)NIL;
        if ($ic45$ == var22) {
            var30 = StreamsLow.$null_output$.getDynamicValue(var87);
        }
        final SubLObject var89 = module0029.$g835$.currentBinding(var87);
        try {
            module0029.$g835$.bind(var32, var87);
            var88 = module0419.f29359(var86, var28, var30, var24);
        }
        finally {
            module0029.$g835$.rebind(var89, var87);
        }
        return (SubLObject)ConsesLow.list(var88);
    }
    
    public static SubLObject f7425(final SubLObject var87, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        if ($ic45$ != var22) {
            if (NIL != var24) {
                Errors.warn((SubLObject)$ic55$);
            }
            if (NIL != var26) {
                Errors.warn((SubLObject)$ic56$);
            }
        }
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = (SubLObject)(($ic57$ == var28) ? $ic57$ : var22);
        final SubLObject var91 = module0029.$g835$.currentBinding(var88);
        try {
            module0029.$g835$.bind(var32, var88);
            var88.resetMultipleValues();
            final SubLObject var92 = module0027.f1436(var30, var87, var90, (SubLObject)NIL);
            final SubLObject var93 = var88.secondMultipleValue();
            var88.resetMultipleValues();
            var89 = var93;
        }
        finally {
            module0029.$g835$.rebind(var91, var88);
        }
        return var89;
    }
    
    public static SubLObject f7426(final SubLObject var90, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        return (SubLObject)ConsesLow.list(module0634.f38767(var90, var22, var24, var26, var28, var30));
    }
    
    public static SubLObject f7428(final SubLObject var30, final SubLObject var22, final SubLObject var91, final SubLObject var28, final SubLObject var32, final SubLObject var92, final SubLObject var93, final SubLObject var94, final SubLObject var95, SubLObject var96, SubLObject var97, SubLObject var98, SubLObject var99) {
        if (var97 == UNPROVIDED) {
            var97 = module0029.f1483();
        }
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)ZERO_INTEGER;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        assert NIL != Types.streamp(var30) : var30;
        assert NIL != module0029.f1473(var22) : var22;
        assert NIL != module0029.f1474(var28) : var28;
        assert NIL != Types.booleanp(var91) : var91;
        assert NIL != Types.booleanp(var32) : var32;
        assert NIL != module0029.f1481(var93) : var93;
        if (NIL != var95 && !areAssertionsDisabledFor(me) && NIL == module0075.f5193(var95)) {
            throw new AssertionError(var95);
        }
        if (NIL == var96) {
            var96 = $g1344$.getDynamicValue(var100);
        }
        assert NIL != module0004.f106(var96) : var96;
        if (NIL != f7411() && !areAssertionsDisabledFor(me) && NIL == module0075.f5192(f7411(), (SubLObject)UNPROVIDED)) {
            throw new AssertionError(f7411());
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var100) && !var98.numL(var99)) {
            Errors.error((SubLObject)$ic61$, var98, var99);
        }
        final SubLObject var101 = Equality.eq((SubLObject)$ic45$, var22);
        final SubLObject var102 = (SubLObject)((NIL != var97) ? makeBoolean(!var97.eql(module0029.f1483())) : NIL);
        SubLObject var103 = (SubLObject)NIL;
        final SubLObject var104 = Time.get_universal_time();
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        var100.resetMultipleValues();
        SubLObject var107 = f7429(var95, var96);
        final SubLObject var108 = var100.secondMultipleValue();
        var100.resetMultipleValues();
        if (NIL != var95) {
            SubLObject var108_109 = (SubLObject)NIL;
            try {
                final SubLObject var109 = stream_macros.$stream_requires_locking$.currentBinding(var100);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var100);
                    var108_109 = compatibility.open_binary(var95, (SubLObject)$ic62$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var109, var100);
                }
                if (!var108_109.isStream()) {
                    Errors.error((SubLObject)$ic63$, var95);
                }
                final SubLObject var110 = var108_109;
                try {
                    var100.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var111 = Errors.$error_handler$.currentBinding(var100);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic0$, var100);
                        try {
                            if (NIL == var101) {
                                f7430(var30, var104, var102, var98, var99);
                            }
                            SubLObject var112 = (SubLObject)NIL;
                            SubLObject var113 = (SubLObject)NIL;
                            SubLObject var114 = (SubLObject)NIL;
                            var112 = var97;
                            var113 = var112.first();
                            for (var114 = (SubLObject)ZERO_INTEGER; NIL == var103 && NIL != var112; var112 = var112.rest(), var113 = var112.first(), var114 = Numbers.add((SubLObject)ONE_INTEGER, var114)) {
                                SubLObject var115 = (SubLObject)NIL;
                                if (NIL == f7431(var114, var98, var99) || NIL == f7432(var113, var93, var92, var94, var108)) {
                                    var115 = (SubLObject)ConsesLow.list(f7433(var113));
                                }
                                else if ($ic42$ != module0029.f1510(var113) && NIL != f7434(var113)) {
                                    var115 = (SubLObject)ConsesLow.list(f7435(var113));
                                }
                                else {
                                    f7436(var113);
                                    if (NIL != var95) {
                                        module0021.f1038(f7437(var113), var110);
                                        streams_high.force_output(var110);
                                    }
                                    if (NIL == module0029.$g840$.getDynamicValue(var100)) {
                                        try {
                                            var100.throwStack.push(module0003.$g3$.getGlobalValue());
                                            final SubLObject var5_114 = Errors.$error_handler$.currentBinding(var100);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)$ic0$, var100);
                                                try {
                                                    var115 = f7415(var113, var22, (SubLObject)NIL, (SubLObject)NIL, var28, var30, var32);
                                                }
                                                catch (Throwable var116) {
                                                    Errors.handleThrowable(var116, (SubLObject)NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(var5_114, var100);
                                            }
                                        }
                                        catch (Throwable var117) {
                                            var105 = Errors.handleThrowable(var117, module0003.$g3$.getGlobalValue());
                                        }
                                        finally {
                                            var100.throwStack.pop();
                                        }
                                    }
                                    else {
                                        var115 = f7415(var113, var22, (SubLObject)NIL, (SubLObject)NIL, var28, var30, var32);
                                    }
                                    f7438(var113, var115);
                                }
                                if (NIL != var105) {
                                    var106 = (SubLObject)T;
                                    if (NIL == var101) {
                                        module0006.f218(var30, (SubLObject)$ic64$, var105, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    var105 = (SubLObject)NIL;
                                }
                                var107 = ConsesLow.nconc(var107, var115);
                                if (NIL != var95) {
                                    SubLObject var118 = var115;
                                    SubLObject var119 = (SubLObject)NIL;
                                    var119 = var118.first();
                                    while (NIL != var118) {
                                        module0021.f1038(var119, var110);
                                        streams_high.force_output(var110);
                                        var118 = var118.rest();
                                        var119 = var118.first();
                                    }
                                }
                                if (NIL != var91) {
                                    final SubLObject var120 = module0029.f1542(var115);
                                    if (NIL != module0029.f1477(var120)) {
                                        var103 = (SubLObject)T;
                                    }
                                }
                            }
                            if (NIL == var101) {
                                f7439(var30, var104, var107, var102, var93);
                            }
                        }
                        catch (Throwable var121) {
                            Errors.handleThrowable(var121, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var111, var100);
                    }
                }
                catch (Throwable var122) {
                    var105 = Errors.handleThrowable(var122, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var100.throwStack.pop();
                }
            }
            finally {
                final SubLObject var123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var100);
                    if (var108_109.isStream()) {
                        streams_high.close(var108_109, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var123, var100);
                }
            }
        }
        else {
            final SubLObject var124 = (SubLObject)NIL;
            try {
                var100.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var109 = Errors.$error_handler$.currentBinding(var100);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic0$, var100);
                    try {
                        if (NIL == var101) {
                            f7430(var30, var104, var102, var98, var99);
                        }
                        SubLObject var125 = (SubLObject)NIL;
                        SubLObject var126 = (SubLObject)NIL;
                        SubLObject var127 = (SubLObject)NIL;
                        var125 = var97;
                        var126 = var125.first();
                        for (var127 = (SubLObject)ZERO_INTEGER; NIL == var103 && NIL != var125; var125 = var125.rest(), var126 = var125.first(), var127 = Numbers.add((SubLObject)ONE_INTEGER, var127)) {
                            SubLObject var128 = (SubLObject)NIL;
                            if (NIL == f7431(var127, var98, var99) || NIL == f7432(var126, var93, var92, var94, var108)) {
                                var128 = (SubLObject)ConsesLow.list(f7433(var126));
                            }
                            else if ($ic42$ != module0029.f1510(var126) && NIL != f7434(var126)) {
                                var128 = (SubLObject)ConsesLow.list(f7435(var126));
                            }
                            else {
                                f7436(var126);
                                if (NIL != var95) {
                                    module0021.f1038(f7437(var126), var124);
                                    streams_high.force_output(var124);
                                }
                                if (NIL == module0029.$g840$.getDynamicValue(var100)) {
                                    try {
                                        var100.throwStack.push(module0003.$g3$.getGlobalValue());
                                        final SubLObject var5_115 = Errors.$error_handler$.currentBinding(var100);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)$ic0$, var100);
                                            try {
                                                var128 = f7415(var126, var22, (SubLObject)NIL, (SubLObject)NIL, var28, var30, var32);
                                            }
                                            catch (Throwable var129) {
                                                Errors.handleThrowable(var129, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var5_115, var100);
                                        }
                                    }
                                    catch (Throwable var130) {
                                        var105 = Errors.handleThrowable(var130, module0003.$g3$.getGlobalValue());
                                    }
                                    finally {
                                        var100.throwStack.pop();
                                    }
                                }
                                else {
                                    var128 = f7415(var126, var22, (SubLObject)NIL, (SubLObject)NIL, var28, var30, var32);
                                }
                                f7438(var126, var128);
                            }
                            if (NIL != var105) {
                                var106 = (SubLObject)T;
                                if (NIL == var101) {
                                    module0006.f218(var30, (SubLObject)$ic64$, var105, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                var105 = (SubLObject)NIL;
                            }
                            var107 = ConsesLow.nconc(var107, var128);
                            if (NIL != var95) {
                                SubLObject var131 = var128;
                                SubLObject var132 = (SubLObject)NIL;
                                var132 = var131.first();
                                while (NIL != var131) {
                                    module0021.f1038(var132, var124);
                                    streams_high.force_output(var124);
                                    var131 = var131.rest();
                                    var132 = var131.first();
                                }
                            }
                            if (NIL != var91) {
                                final SubLObject var133 = module0029.f1542(var128);
                                if (NIL != module0029.f1477(var133)) {
                                    var103 = (SubLObject)T;
                                }
                            }
                        }
                        if (NIL == var101) {
                            f7439(var30, var104, var107, var102, var93);
                        }
                    }
                    catch (Throwable var134) {
                        Errors.handleThrowable(var134, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var109, var100);
                }
            }
            catch (Throwable var135) {
                var105 = Errors.handleThrowable(var135, module0003.$g3$.getGlobalValue());
            }
            finally {
                var100.throwStack.pop();
            }
        }
        SubLObject var136 = module0029.f1542(var107);
        if (NIL != var106) {
            var136 = (SubLObject)$ic65$;
        }
        return Values.values(var136, var107);
    }
    
    public static SubLObject f7431(final SubLObject var112, final SubLObject var98, final SubLObject var99) {
        return Numbers.numE(var98, Numbers.mod(var112, var99));
    }
    
    public static SubLObject f7429(final SubLObject var95, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (NIL == var95 || NIL == module0075.f5218(var95)) {
            return Values.values((SubLObject)NIL, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        }
        final SubLObject var98 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var99 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = (SubLObject)NIL;
        try {
            final SubLObject var103 = stream_macros.$stream_requires_locking$.currentBinding(var97);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var97);
                var102 = compatibility.open_binary(var95, (SubLObject)$ic66$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var103, var97);
            }
            if (!var102.isStream()) {
                Errors.error((SubLObject)$ic63$, var95);
            }
            SubLObject var30_123;
            for (var30_123 = var102, var100 = module0021.f1060(var30_123, (SubLObject)NIL, (SubLObject)$ic67$); $ic67$ != var100; var100 = module0021.f1060(var30_123, (SubLObject)NIL, (SubLObject)$ic67$)) {
                assert NIL != module0029.f1536(var100) : var100;
                final SubLObject var104 = module0029.f1541(var100);
                module0067.f4886(var98, var104, var100);
                module0084.f5775(var99, var104, (SubLObject)UNPROVIDED);
                var101 = var104;
            }
        }
        finally {
            final SubLObject var105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                if (var102.isStream()) {
                    streams_high.close(var102, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var105, var97);
            }
        }
        final SubLObject var106 = module0067.f4903(var98);
        final SubLObject var107 = module0078.f5367(module0067.f4902(var98), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        if (NIL != var101 && var96.isPositive() && module0067.f4884(var99, var101, (SubLObject)ZERO_INTEGER).numLE(var96)) {
            module0077.f5327(var101, var107);
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f7433(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)$ic69$, (SubLObject)NIL);
    }
    
    public static SubLObject f7435(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)$ic70$, (SubLObject)NIL);
    }
    
    public static SubLObject f7437(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)$ic51$, (SubLObject)NIL);
    }
    
    public static SubLObject f7432(final SubLObject var47, final SubLObject var124, final SubLObject var92, final SubLObject var94, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (NIL != module0029.f1471()) {
            if (NIL != module0035.f2169(module0029.f1510(var47), (SubLObject)$ic71$)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0035.f2169(module0029.f1495(var47), $g1346$.getGlobalValue())) {
                return (SubLObject)NIL;
            }
        }
        if (NIL != module0029.f1480(var124)) {
            final SubLObject var125 = module0029.f1510(var47);
            if (!var125.eql(var124)) {
                return (SubLObject)NIL;
            }
        }
        if (NIL == var92 && $ic42$ == module0029.f1510(var47)) {
            return (SubLObject)NIL;
        }
        if (NIL != var106 && NIL != module0077.f5320(var47, var106)) {
            return (SubLObject)NIL;
        }
        if (T != var94) {
            if (NIL == var94) {
                if (NIL == module0029.f1516(var47)) {
                    return (SubLObject)NIL;
                }
            }
            else {
                if ($ic72$ != var94) {
                    return Errors.error((SubLObject)$ic73$, var94);
                }
                if (NIL != module0029.f1516(var47)) {
                    return (SubLObject)NIL;
                }
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7440(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var126 == UNPROVIDED) {
            var126 = (SubLObject)NIL;
        }
        PrintLow.format(var30, (SubLObject)$ic74$);
        final SubLObject var127 = module0035.remove_if_not((SubLObject)$ic75$, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var127) {
            SubLObject var128 = var127;
            SubLObject var129 = (SubLObject)NIL;
            var129 = var128.first();
            while (NIL != var128) {
                f7441(var30, var129, var125, var126);
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        else {
            PrintLow.format(var30, (SubLObject)$ic76$);
        }
        streams_high.force_output(var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7442(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var126 == UNPROVIDED) {
            var126 = (SubLObject)NIL;
        }
        PrintLow.format(var30, (SubLObject)$ic77$);
        final SubLObject var127 = module0035.remove_if_not((SubLObject)$ic78$, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var127) {
            SubLObject var128 = var127;
            SubLObject var129 = (SubLObject)NIL;
            var129 = var128.first();
            while (NIL != var128) {
                f7441(var30, var129, var125, var126);
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        else {
            PrintLow.format(var30, (SubLObject)$ic79$);
        }
        streams_high.force_output(var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7443(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var126 == UNPROVIDED) {
            var126 = (SubLObject)NIL;
        }
        final SubLObject var127 = module0035.remove_if_not((SubLObject)$ic80$, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var127) {
            PrintLow.format(var30, (SubLObject)$ic81$);
        }
        else {
            SubLObject var128 = (SubLObject)NIL;
            SubLObject var129 = (SubLObject)NIL;
            SubLObject var130 = var127;
            SubLObject var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL != var130) {
                final SubLObject var132 = module0029.f1539(var131);
                if (var132.eql((SubLObject)$ic82$)) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                else if (var132.eql((SubLObject)$ic83$)) {
                    var129 = (SubLObject)ConsesLow.cons(var131, var129);
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
            var128 = Sequences.nreverse(var128);
            var129 = Sequences.nreverse(var129);
            PrintLow.format(var30, (SubLObject)$ic84$);
            var130 = var129;
            var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL != var130) {
                f7441(var30, var131, var125, var126);
                var130 = var130.rest();
                var131 = var130.first();
            }
            PrintLow.format(var30, (SubLObject)$ic85$);
            var130 = var128;
            var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL != var130) {
                f7441(var30, var131, var125, var126);
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        streams_high.force_output(var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7430(final SubLObject var30, final SubLObject var103, final SubLObject var101, SubLObject var98, SubLObject var99) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)ZERO_INTEGER;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var104 = (SubLObject)makeBoolean(NIL == module0018.f973());
        if (NIL != var101) {
            PrintLow.format(var30, (SubLObject)$ic86$);
        }
        else {
            PrintLow.format(var30, (SubLObject)$ic87$, module0029.f1555(), module0029.f1555());
        }
        PrintLow.format(var30, (SubLObject)$ic88$, new SubLObject[] { (NIL != var104) ? $ic89$ : $ic90$, module0018.f971(), module0011.f351(), module0051.f3552(var103), (ONE_INTEGER.numE(var99) && ZERO_INTEGER.numE(var98)) ? $ic91$ : Sequences.cconcatenate((SubLObject)$ic92$, new SubLObject[] { module0006.f203(Numbers.add((SubLObject)ONE_INTEGER, var98)), $ic93$, module0006.f203(var99), $ic94$ }) });
        streams_high.force_output(var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7439(final SubLObject var30, final SubLObject var103, final SubLObject var45, final SubLObject var101, final SubLObject var93) {
        if (NIL == var45) {
            PrintLow.format(var30, (SubLObject)$ic95$);
        }
        else {
            if (NIL == var101) {
                final SubLObject var104 = module0029.f1526(var93);
                if (NIL != var104) {
                    final SubLObject var105 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic96$), var104);
                    PrintLow.format(var30, (SubLObject)$ic97$);
                    module0006.f215(var105, var30);
                    streams_high.terpri(var30);
                }
            }
            f7440(var30, var45, (SubLObject)T, (SubLObject)NIL);
            final SubLObject var106 = module0029.f1542(var45);
            final SubLObject var107 = module0029.f1544(var45);
            final SubLObject var108 = Time.get_universal_time();
            final SubLObject var109 = Numbers.subtract(var108, var103);
            PrintLow.format(var30, (SubLObject)$ic98$, new SubLObject[] { module0051.f3552(var108), module0051.f3664(var109), module0051.f3664(var107) });
            module0035.f2365(module0035.f2516(Mapping.mapcar((SubLObject)$ic99$, var45), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            PrintLow.format(var30, (SubLObject)$ic100$, var106);
        }
        streams_high.force_output(var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7441(final SubLObject var30, final SubLObject var72, final SubLObject var137, final SubLObject var138) {
        PrintLow.format(var30, (SubLObject)$ic101$, new SubLObject[] { module0029.f1537(var72), module0029.f1538(var72), module0029.f1539(var72), (NIL != module0029.f1540(var72)) ? module0048.f3302(module0029.f1540(var72), (SubLObject)FOUR_INTEGER) : NIL });
        if (NIL != var137) {
            PrintLow.format(var30, (SubLObject)$ic102$, module0029.f1548(var72));
        }
        if (NIL != var138) {
            final SubLObject var139 = module0029.f1549(var72);
            if (NIL != var139) {
                PrintLow.format(var30, (SubLObject)$ic102$, var139);
            }
        }
        streams_high.terpri(var30);
        streams_high.force_output(var30);
        return var72;
    }
    
    public static SubLObject f7436(final SubLObject var47) {
        final SubLObject var48 = f7411();
        if (NIL != var48) {
            final SubLObject var49 = f7444(var47, var48);
            Mapper.write_image(var49, (SubLObject)UNPROVIDED);
            return var49;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7438(final SubLObject var47, final SubLObject var45) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f7411();
        if (NIL == var49) {
            return (SubLObject)NIL;
        }
        final SubLObject var50 = f7444(var47, var49);
        if ($ic103$ == module0029.f1542(var45)) {
            SubLObject var51 = (SubLObject)NIL;
            try {
                var48.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var52 = Errors.$error_handler$.currentBinding(var48);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic0$, var48);
                    try {
                        Filesys.delete_file(var50);
                    }
                    catch (Throwable var53) {
                        Errors.handleThrowable(var53, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var52, var48);
                }
            }
            catch (Throwable var54) {
                var51 = Errors.handleThrowable(var54, module0003.$g3$.getGlobalValue());
            }
            finally {
                var48.throwStack.pop();
            }
            if (var51.isString()) {
                Errors.warn((SubLObject)$ic2$, var51);
            }
            return (SubLObject)T;
        }
        return var50;
    }
    
    public static SubLObject f7444(final SubLObject var47, final SubLObject var140) {
        final SubLObject var141 = Strings.string_downcase(module0038.f2962(module0038.f2638(module0029.f1495(var47))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var142 = Sequences.cconcatenate((SubLObject)$ic104$, var141);
        return Strings.string_downcase(module0075.f5176(var140, var142, (SubLObject)$ic105$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7434(final SubLObject var47) {
        final SubLObject var48 = module0029.f1491(var47);
        final SubLObject var49 = module0029.f1510(var47);
        if (var49.eql((SubLObject)$ic36$)) {
            return module0416.f29145(var48);
        }
        if (var49.eql((SubLObject)$ic37$)) {
            return module0421.f29428(var48);
        }
        if (var49.eql((SubLObject)$ic38$)) {
            return module0417.f29230(var48);
        }
        if (var49.eql((SubLObject)$ic39$)) {
            return module0418.f29294(var48);
        }
        if (var49.eql((SubLObject)$ic40$)) {
            return module0422.f29511(var48);
        }
        if (var49.eql((SubLObject)$ic41$)) {
            return module0419.f29342(var48);
        }
        if (var49.eql((SubLObject)$ic42$)) {
            return module0035.sublisp_boolean(module0027.f1426(var48));
        }
        if (var49.eql((SubLObject)$ic43$)) {
            return module0634.f38762(var48);
        }
        return Errors.error((SubLObject)$ic44$, var48);
    }
    
    public static SubLObject f7445(final SubLObject var142, final SubLObject var143) {
        final SubLObject var144 = f7446(var142);
        final SubLObject var145 = f7446(var143);
        return f7447(var144, var145);
    }
    
    public static SubLObject f7446(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        assert NIL != Filesys.directory_p(var146) : var146;
        SubLObject var149 = Filesys.directory(var146, (SubLObject)NIL);
        final SubLObject var150 = (SubLObject)NIL;
        final SubLObject var151 = module0012.$silent_progressP$.currentBinding(var147);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(!var150.isString()), var147);
            if (NIL.isFunctionSpec()) {
                var149 = Sort.sort(var149, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            final SubLObject var152 = var149;
            module0012.$g82$.setDynamicValue(var150, var147);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var147);
            module0012.$g83$.setDynamicValue(Sequences.length(var152), var147);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var147);
            final SubLObject var5_150 = module0012.$g75$.currentBinding(var147);
            final SubLObject var153 = module0012.$g76$.currentBinding(var147);
            final SubLObject var154 = module0012.$g77$.currentBinding(var147);
            final SubLObject var155 = module0012.$g78$.currentBinding(var147);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var147);
                module0012.$g76$.bind((SubLObject)NIL, var147);
                module0012.$g77$.bind((SubLObject)T, var147);
                module0012.$g78$.bind(Time.get_universal_time(), var147);
                module0012.f478(module0012.$g82$.getDynamicValue(var147));
                SubLObject var156 = var152;
                SubLObject var157 = (SubLObject)NIL;
                var157 = var156.first();
                while (NIL != var156) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var147), module0012.$g83$.getDynamicValue(var147));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var147), (SubLObject)ONE_INTEGER), var147);
                    if (NIL == Filesys.directory_p(var157) && NIL == f7448(var157)) {
                        module0067.f4886(var148, var157, module0075.f5249(module0075.f5176(var146, var157, (SubLObject)UNPROVIDED)));
                    }
                    var156 = var156.rest();
                    var157 = var156.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var155, var147);
                module0012.$g77$.rebind(var154, var147);
                module0012.$g76$.rebind(var153, var147);
                module0012.$g75$.rebind(var5_150, var147);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var151, var147);
        }
        return var148;
    }
    
    public static SubLObject f7447(final SubLObject var144, final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148;
        for (var148 = module0066.f4838(module0067.f4891(var144)); NIL == module0066.f4841(var148); var148 = module0066.f4840(var148)) {
            var146.resetMultipleValues();
            final SubLObject var149 = module0066.f4839(var148);
            final SubLObject var150 = var146.secondMultipleValue();
            var146.resetMultipleValues();
            final SubLObject var151 = module0067.f4885(var145, var149, (SubLObject)UNPROVIDED);
            if (NIL == var151) {
                var147 = (SubLObject)ConsesLow.cons(f7449(var149, (SubLObject)T), var147);
            }
            else if (NIL == f7450(var150, var151, var149)) {
                var147 = (SubLObject)ConsesLow.cons(f7451(var150, var151, var149), var147);
            }
        }
        module0066.f4842(var148);
        for (var148 = module0066.f4838(module0067.f4891(var145)); NIL == module0066.f4841(var148); var148 = module0066.f4840(var148)) {
            var146.resetMultipleValues();
            final SubLObject var149 = module0066.f4839(var148);
            final SubLObject var152 = var146.secondMultipleValue();
            var146.resetMultipleValues();
            if (NIL == module0067.f4885(var144, var149, (SubLObject)UNPROVIDED)) {
                var147 = (SubLObject)ConsesLow.cons(f7449(var149, (SubLObject)NIL), var147);
            }
        }
        module0066.f4842(var148);
        return Sequences.nreverse(var147);
    }
    
    public static SubLObject f7450(final SubLObject var156, final SubLObject var157, final SubLObject var2) {
        if (var156.numE(var157)) {
            return (SubLObject)T;
        }
        final SubLObject var158 = f7452(var156, var157);
        final SubLObject var159 = (NIL != var158) ? var156 : var157;
        final SubLObject var160 = (NIL != var158) ? var157 : var156;
        final SubLObject var161 = f7453(var2);
        return Numbers.numL(Numbers.divide(var160, var159), var161);
    }
    
    public static SubLObject f7453(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g1347$.getDynamicValue(var3);
    }
    
    public static SubLObject f7452(final SubLObject var156, final SubLObject var157) {
        return Numbers.numL(var156, var157);
    }
    
    public static SubLObject f7451(final SubLObject var156, final SubLObject var157, final SubLObject var2) {
        final SubLObject var158 = f7452(var156, var157);
        return Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { $ic110$, module0006.f203((SubLObject)((NIL != var158) ? $ic111$ : $ic112$)), $ic113$, module0006.f203(var156), $ic114$, module0006.f203(var157), $ic115$ });
    }
    
    public static SubLObject f7449(final SubLObject var2, final SubLObject var163) {
        if (NIL != var163) {
            return Sequences.cconcatenate(module0006.f203(var2), (SubLObject)$ic116$);
        }
        return Sequences.cconcatenate(module0006.f203(var2), (SubLObject)$ic117$);
    }
    
    public static SubLObject f7448(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return f7454(var2, $g1348$.getDynamicValue(var3));
    }
    
    public static SubLObject f7454(final SubLObject var164, final SubLObject var165) {
        SubLObject var166 = var165;
        SubLObject var167 = (SubLObject)NIL;
        var167 = var166.first();
        while (NIL != var166) {
            if (NIL != module0045.f3138(var167, var164, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            var166 = var166.rest();
            var167 = var166.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7455(final SubLObject var146, final SubLObject var167) {
        final SubLObject var168 = f7446(var146);
        final SubLObject var169 = (SubLObject)$ic118$;
        final SubLObject var170 = Sequences.cconcatenate((SubLObject)$ic119$, module0051.f3552((SubLObject)UNPROVIDED));
        return module0084.f5792(var168, var167, var169, var170);
    }
    
    public static SubLObject f7456(final SubLObject var167) {
        return module0084.f5793(var167, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f7457(final SubLObject var170, final SubLObject var171) {
        return f7447(f7456(var170), f7456(var171));
    }
    
    public static SubLObject f7458() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7410", "S#2684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7411", "S#9336", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0104", "f7412", "S#9337");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0104", "f7413", "S#9338");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7414", "S#9339", 7, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0104", "f7416", "S#9340");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7417", "S#9341", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7418", "S#9342", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7415", "S#9343", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7419", "S#9344", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7420", "S#9345", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7427", "S#9346", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7421", "S#9347", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7422", "S#9348", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7423", "S#9349", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7424", "S#9350", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7425", "S#9351", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7426", "S#9352", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7428", "S#2683", 10, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7431", "S#9353", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7429", "S#9354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7433", "S#9355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7435", "S#9356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7437", "S#9357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7432", "S#9358", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7440", "S#9359", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7442", "S#9360", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7443", "S#9361", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7430", "S#9362", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7439", "S#9363", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7441", "S#9364", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7436", "S#9365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7438", "S#9366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7444", "S#9367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7434", "S#9368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7445", "S#9369", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7446", "S#9370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7447", "S#9371", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7450", "S#9372", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7453", "S#9373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7452", "S#9374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7451", "S#9375", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7449", "S#9376", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7448", "S#9377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7454", "S#9378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7455", "S#9379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7456", "S#9380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0104", "f7457", "S#9381", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7459() {
        $g1344$ = SubLFiles.defparameter("S#9382", (SubLObject)ONE_INTEGER);
        $g1345$ = SubLFiles.defparameter("S#9383", (SubLObject)NIL);
        $g1346$ = SubLFiles.deflexical("S#9384", (SubLObject)$ic106$);
        $g1347$ = SubLFiles.defparameter("S#9385", (SubLObject)$ic107$);
        $g1348$ = SubLFiles.defparameter("S#9386", (SubLObject)$ic108$);
        $g1349$ = SubLFiles.deflexical("S#9387", (SubLObject)$ic91$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7460() {
        module0002.f50((SubLObject)$ic17$, (SubLObject)$ic21$);
        module0002.f50((SubLObject)$ic30$, (SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7458();
    }
    
    public void initializeVariables() {
        f7459();
    }
    
    public void runTopLevelForms() {
        f7460();
    }
    
    static {
        me = (SubLFile)new module0104();
        $g1344$ = null;
        $g1345$ = null;
        $g1346$ = null;
        $g1347$ = null;
        $g1348$ = null;
        $g1349$ = null;
        $ic0$ = makeSymbol("S#38", "CYC");
        $ic1$ = makeString(".lisp");
        $ic2$ = makeString("~A");
        $ic3$ = makeString("/");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2816", "CYC"), (SubLObject)makeKeyword("TERSE")), (SubLObject)makeSymbol("S#9388", "CYC"), (SubLObject)makeSymbol("S#9389", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#2792", "CYC"))));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("VERBOSITY"), (SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)makeKeyword("BLOCK?"), (SubLObject)makeKeyword("OUTPUT-FORMAT"), (SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic6$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic7$ = makeKeyword("VERBOSITY");
        $ic8$ = makeKeyword("TERSE");
        $ic9$ = makeKeyword("BROWSABLE?");
        $ic10$ = makeKeyword("BLOCK?");
        $ic11$ = makeKeyword("OUTPUT-FORMAT");
        $ic12$ = makeKeyword("STANDARD");
        $ic13$ = makeKeyword("STREAM");
        $ic14$ = makeSymbol("*STANDARD-OUTPUT*");
        $ic15$ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
        $ic16$ = makeSymbol("S#2792", "CYC");
        $ic17$ = makeSymbol("S#9339", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#9388", "CYC"), (SubLObject)makeSymbol("S#9389", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#2792", "CYC"))));
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)makeKeyword("BLOCK?"), (SubLObject)makeKeyword("OUTPUT-FORMAT"), (SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic20$ = makeKeyword("VERBOSE");
        $ic21$ = makeSymbol("S#9337", "CYC");
        $ic22$ = makeSymbol("S#2687", "CYC");
        $ic23$ = makeSymbol("BOOLEANP");
        $ic24$ = makeSymbol("S#2688", "CYC");
        $ic25$ = makeSymbol("STREAMP");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#9390", "CYC"), (SubLObject)FOUR_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#9391", "CYC"), (SubLObject)TEN_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#2816", "CYC"), (SubLObject)makeKeyword("TERSE")), makeSymbol("S#9388", "CYC"), makeSymbol("S#9389", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#2792", "CYC"))) });
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("NTHREADS"), (SubLObject)makeKeyword("NTIMES"), (SubLObject)makeKeyword("VERBOSITY"), (SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)makeKeyword("BLOCK?"), (SubLObject)makeKeyword("OUTPUT-FORMAT"), (SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic28$ = makeKeyword("NTHREADS");
        $ic29$ = makeKeyword("NTIMES");
        $ic30$ = makeSymbol("S#9341", "CYC");
        $ic31$ = makeSymbol("S#9340", "CYC");
        $ic32$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic33$ = makeString("Parallel Test Thread for ");
        $ic34$ = makeString(" No. ");
        $ic35$ = makeSymbol("S#9342", "CYC");
        $ic36$ = makeKeyword("IUT");
        $ic37$ = makeKeyword("IT");
        $ic38$ = makeKeyword("RMT");
        $ic39$ = makeKeyword("TMT");
        $ic40$ = makeKeyword("RMCT");
        $ic41$ = makeKeyword("ERT");
        $ic42$ = makeKeyword("TCT");
        $ic43$ = makeKeyword("KCT");
        $ic44$ = makeString("Cyc test of unexpected type: ~s");
        $ic45$ = makeKeyword("SILENT");
        $ic46$ = makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");
        $ic47$ = makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");
        $ic48$ = makeKeyword("BACKWARD");
        $ic49$ = makeKeyword("FORWARD");
        $ic50$ = makeString("Unexpected testing direction : ~S");
        $ic51$ = makeKeyword("ERROR");
        $ic52$ = makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");
        $ic53$ = makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");
        $ic54$ = makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");
        $ic55$ = makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");
        $ic56$ = makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");
        $ic57$ = makeKeyword("POST-BUILD");
        $ic58$ = makeSymbol("S#2695", "CYC");
        $ic59$ = makeSymbol("S#6802", "CYC");
        $ic60$ = makeSymbol("S#6801", "CYC");
        $ic61$ = makeString("Invalid phase ~A of ~A specified.");
        $ic62$ = makeKeyword("APPEND");
        $ic63$ = makeString("Unable to open ~S");
        $ic64$ = makeString("~&:HARNESS-ERROR: ~A~%");
        $ic65$ = makeKeyword("HARNESS-ERROR");
        $ic66$ = makeKeyword("INPUT");
        $ic67$ = makeKeyword("EOF");
        $ic68$ = makeSymbol("S#2745", "CYC");
        $ic69$ = makeKeyword("NOT-RUN");
        $ic70$ = makeKeyword("INVALID");
        $ic71$ = ConsesLow.list((SubLObject)makeKeyword("RMT"), (SubLObject)makeKeyword("TMT"), (SubLObject)makeKeyword("TCT"));
        $ic72$ = makeKeyword("ONLY");
        $ic73$ = makeString("Unexpected value ~s for :run-non-working-tests");
        $ic74$ = makeString("~&Failing regression tests:~%");
        $ic75$ = makeSymbol("S#2754", "CYC");
        $ic76$ = makeString("None! (:");
        $ic77$ = makeString("~&Succeeding regression tests:~%");
        $ic78$ = makeSymbol("S#2755", "CYC");
        $ic79$ = makeString("None! ):");
        $ic80$ = makeSymbol("S#2756", "CYC");
        $ic81$ = makeString("Non-regression tests: None.");
        $ic82$ = makeKeyword("NON-REGRESSION-SUCCESS");
        $ic83$ = makeKeyword("NON-REGRESSION-FAILURE");
        $ic84$ = makeString("~&Failing non-regression tests:~%");
        $ic85$ = makeString("~&Succeeding non-regression tests:~%");
        $ic86$ = makeString("\nRunning a specified list of tests ");
        $ic87$ = makeString("\nRunning ~a file~P of tests ");
        $ic88$ = makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a ~a\n\n");
        $ic89$ = makeString("Tiny");
        $ic90$ = makeString("Full");
        $ic91$ = makeString("");
        $ic92$ = makeString("(");
        $ic93$ = makeString(" of ");
        $ic94$ = makeString(" phases)");
        $ic95$ = makeString("~&No tests were run.~%");
        $ic96$ = makeSymbol("S#2722", "CYC");
        $ic97$ = makeString("~&NOTE: The following cyc tests were noted as not working:~%");
        $ic98$ = makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");
        $ic99$ = makeSymbol("S#2748", "CYC");
        $ic100$ = makeString("Overall result: ~s~%");
        $ic101$ = makeString("~S ~A ~S ~A");
        $ic102$ = makeString(" ~A");
        $ic103$ = makeKeyword("SUCCESS");
        $ic104$ = makeString("cyc-test-image-");
        $ic105$ = makeString("load");
        $ic106$ = ConsesLow.list(new SubLObject[] { makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), makeKeyword("INFERENCE-HARNESS-OVERHEAD"), makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), makeKeyword("KAPPA-REMOVAL-WORKS"), makeKeyword("DONT-REOPEN-ANSWER-LINK"), makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), makeKeyword("SIMPLE-EXCEPT-WHEN"), makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), makeKeyword("PARTIAL-EXCEPT-WHEN"), makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("THERE-EXISTS"), makeKeyword("EXCEPT-WHEN"), makeKeyword("STRENGTH-PROPAGATION"), makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), makeKeyword("INFERENCE-ANSWER-TEMPLATE"), makeKeyword("EXCEPT-BLOCKS-BACKWARD"), makeKeyword("EXCEPT-BLOCKS-FORWARD"), makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), makeKeyword("GENLS-BETWEEN"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), makeKeyword("CIRCULAR-PROOFS"), makeKeyword("POSSIBLE-REUSED-PROBLEMS-GET-STRATEGICALLY-EVALUATED"), makeKeyword("RESIDUAL-TRANSFORMATION-PROBLEM-REUSE") });
        $ic107$ = (SubLFloat)makeDouble(1.2);
        $ic108$ = ConsesLow.list((SubLObject)makeString(".*~[0-9]+~"));
        $ic109$ = makeSymbol("DIRECTORY-P");
        $ic110$ = makeString(" ");
        $ic111$ = makeString("grew");
        $ic112$ = makeString("shrunk");
        $ic113$ = makeString(" from ");
        $ic114$ = makeString(" bytes to ");
        $ic115$ = makeString(" bytes");
        $ic116$ = makeString(" disappeared");
        $ic117$ = makeString(" is a new file");
        $ic118$ = makeString("filename");
        $ic119$ = makeString("size in bytes as of ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 709 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/