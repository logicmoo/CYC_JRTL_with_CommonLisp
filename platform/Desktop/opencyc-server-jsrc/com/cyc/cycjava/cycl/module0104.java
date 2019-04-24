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
        SubLObject var4 = (SubLObject)module0104.NIL;
        final SubLObject var5 = module0018.$g571$.currentBinding(var3);
        try {
            module0018.$g571$.bind((SubLObject)module0104.NIL, var3);
            SubLObject var6 = (SubLObject)module0104.NIL;
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var5_7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var3);
                    try {
                        final SubLObject var7 = Sequences.cconcatenate(var1, new SubLObject[] { var2, module0104.$ic1$ });
                        var4 = Eval.load(var7);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)module0104.NIL);
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
                Errors.warn((SubLObject)module0104.$ic2$, var6);
            }
        }
        finally {
            module0018.$g571$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f7411() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0104.NIL != module0104.$g1345$.getDynamicValue(var3)) ? ((module0104.NIL != module0038.f2673(module0104.$g1345$.getDynamicValue(var3), (SubLObject)module0104.$ic3$, (SubLObject)module0104.UNPROVIDED)) ? module0104.$g1345$.getDynamicValue(var3) : Sequences.cconcatenate(module0104.$g1345$.getDynamicValue(var3), (SubLObject)module0104.$ic3$)) : module0104.NIL);
    }
    
    public static SubLObject f7412(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0104.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0104.$ic4$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)module0104.NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)module0104.NIL;
        SubLObject var19_20 = (SubLObject)module0104.NIL;
        while (module0104.NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic4$);
            var19_20 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic4$);
            if (module0104.NIL == conses_high.member(var19_20, (SubLObject)module0104.$ic5$, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED)) {
                var18 = (SubLObject)module0104.T;
            }
            if (var19_20 == module0104.$ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (module0104.NIL != var18 && module0104.NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0104.$ic4$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic7$, var14);
        final SubLObject var20 = (SubLObject)((module0104.NIL != var19) ? conses_high.cadr(var19) : module0104.$ic8$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic9$, var14);
        final SubLObject var22 = (SubLObject)((module0104.NIL != var21) ? conses_high.cadr(var21) : module0104.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic10$, var14);
        final SubLObject var24 = (SubLObject)((module0104.NIL != var23) ? conses_high.cadr(var23) : module0104.NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic11$, var14);
        final SubLObject var26 = (SubLObject)((module0104.NIL != var25) ? conses_high.cadr(var25) : module0104.$ic12$);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic13$, var14);
        final SubLObject var28 = (SubLObject)((module0104.NIL != var27) ? conses_high.cadr(var27) : module0104.$ic14$);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic15$, var14);
        final SubLObject var30 = (SubLObject)((module0104.NIL != var29) ? conses_high.cadr(var29) : module0104.$ic16$);
        return (SubLObject)ConsesLow.list((SubLObject)module0104.$ic17$, var15, var20, var22, var24, var26, var28, var30);
    }
    
    public static SubLObject f7413(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0104.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0104.$ic18$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)module0104.NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)module0104.NIL;
        SubLObject var38_39 = (SubLObject)module0104.NIL;
        while (module0104.NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic18$);
            var38_39 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic18$);
            if (module0104.NIL == conses_high.member(var38_39, (SubLObject)module0104.$ic19$, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED)) {
                var18 = (SubLObject)module0104.T;
            }
            if (var38_39 == module0104.$ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (module0104.NIL != var18 && module0104.NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0104.$ic18$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic9$, var14);
        final SubLObject var20 = (SubLObject)((module0104.NIL != var19) ? conses_high.cadr(var19) : module0104.NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic10$, var14);
        final SubLObject var22 = (SubLObject)((module0104.NIL != var21) ? conses_high.cadr(var21) : module0104.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic11$, var14);
        final SubLObject var24 = (SubLObject)((module0104.NIL != var23) ? conses_high.cadr(var23) : module0104.$ic12$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic13$, var14);
        final SubLObject var26 = (SubLObject)((module0104.NIL != var25) ? conses_high.cadr(var25) : module0104.$ic14$);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic15$, var14);
        final SubLObject var28 = (SubLObject)((module0104.NIL != var27) ? conses_high.cadr(var27) : module0104.$ic16$);
        return (SubLObject)ConsesLow.list((SubLObject)module0104.$ic17$, var15, (SubLObject)module0104.$ic20$, var20, var22, var24, var26, var28);
    }
    
    public static SubLObject f7414(final SubLObject var15, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        assert module0104.NIL != module0029.f1473(var22) : var22;
        assert module0104.NIL != Types.booleanp(var24) : var24;
        assert module0104.NIL != Types.booleanp(var26) : var26;
        assert module0104.NIL != module0029.f1474(var28) : var28;
        assert module0104.NIL != Types.streamp(var30) : var30;
        assert module0104.NIL != Types.booleanp(var32) : var32;
        SubLObject var33 = (SubLObject)module0104.NIL;
        SubLObject var34 = module0029.f1528(var15);
        SubLObject var35 = (SubLObject)module0104.NIL;
        var35 = var34.first();
        while (module0104.NIL != var34) {
            var33 = ConsesLow.nconc(var33, f7415(var35, var22, var24, var26, var28, var30, var32));
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f7416(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0104.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0104.$ic26$);
        var15 = var14.first();
        var14 = var14.rest();
        SubLObject var16 = (SubLObject)module0104.NIL;
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)module0104.NIL;
        SubLObject var53_54 = (SubLObject)module0104.NIL;
        while (module0104.NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic26$);
            var53_54 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0104.$ic26$);
            if (module0104.NIL == conses_high.member(var53_54, (SubLObject)module0104.$ic27$, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED)) {
                var18 = (SubLObject)module0104.T;
            }
            if (var53_54 == module0104.$ic6$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (module0104.NIL != var18 && module0104.NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0104.$ic26$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic28$, var14);
        final SubLObject var20 = (SubLObject)((module0104.NIL != var19) ? conses_high.cadr(var19) : module0104.FOUR_INTEGER);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic29$, var14);
        final SubLObject var22 = (SubLObject)((module0104.NIL != var21) ? conses_high.cadr(var21) : module0104.TEN_INTEGER);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic7$, var14);
        final SubLObject var24 = (SubLObject)((module0104.NIL != var23) ? conses_high.cadr(var23) : module0104.$ic8$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic9$, var14);
        final SubLObject var26 = (SubLObject)((module0104.NIL != var25) ? conses_high.cadr(var25) : module0104.NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic10$, var14);
        final SubLObject var28 = (SubLObject)((module0104.NIL != var27) ? conses_high.cadr(var27) : module0104.NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic11$, var14);
        final SubLObject var30 = (SubLObject)((module0104.NIL != var29) ? conses_high.cadr(var29) : module0104.$ic12$);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic13$, var14);
        final SubLObject var32 = (SubLObject)((module0104.NIL != var31) ? conses_high.cadr(var31) : module0104.$ic14$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0104.$ic15$, var14);
        final SubLObject var34 = (SubLObject)((module0104.NIL != var33) ? conses_high.cadr(var33) : module0104.$ic16$);
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0104.$ic30$, var15, var20, var22, var24, var26, var28, var30, var32, var34 });
    }
    
    public static SubLObject f7417(final SubLObject var15, final SubLObject var56, final SubLObject var58, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        assert module0104.NIL != module0004.f106(var56) : var56;
        assert module0104.NIL != module0004.f106(var58) : var58;
        assert module0104.NIL != module0029.f1473(var22) : var22;
        assert module0104.NIL != module0029.f1473(var22) : var22;
        assert module0104.NIL != Types.booleanp(var24) : var24;
        assert module0104.NIL != Types.booleanp(var26) : var26;
        assert module0104.NIL != module0029.f1474(var28) : var28;
        assert module0104.NIL != Types.streamp(var30) : var30;
        assert module0104.NIL != Types.booleanp(var32) : var32;
        SubLObject var59;
        for (var59 = (SubLObject)module0104.NIL, var59 = (SubLObject)module0104.ZERO_INTEGER; var59.numL(var56); var59 = Numbers.add(var59, (SubLObject)module0104.ONE_INTEGER)) {
            module0004.f78(Sequences.cconcatenate((SubLObject)module0104.$ic33$, new SubLObject[] { module0006.f203(var15), module0104.$ic34$, module0006.f203(var59) }), Symbols.symbol_function((SubLObject)module0104.$ic35$), (SubLObject)ConsesLow.list(new SubLObject[] { var15, var59, var58, var22, var24, var26, var28, var30, var32 }));
        }
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7418(final SubLObject var15, final SubLObject var66, final SubLObject var58, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        SubLObject var67 = (SubLObject)module0104.NIL;
        SubLObject var68 = module0029.f1528(var15);
        SubLObject var69 = (SubLObject)module0104.NIL;
        var69 = var68.first();
        while (module0104.NIL != var68) {
            SubLObject var70;
            for (var70 = (SubLObject)module0104.NIL, var70 = (SubLObject)module0104.ZERO_INTEGER; var70.numL(var58); var70 = Numbers.add(var70, (SubLObject)module0104.ONE_INTEGER)) {
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
        SubLObject var50 = (SubLObject)module0104.NIL;
        final SubLObject var51 = module0018.$g694$.currentBinding(var48);
        try {
            module0018.$g694$.bind((SubLObject)module0104.NIL, var48);
            final SubLObject var52 = module0029.f1510(var47);
            if (var52.eql((SubLObject)module0104.$ic36$)) {
                var50 = f7419(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic37$)) {
                var50 = f7420(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic38$)) {
                var50 = f7421(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic39$)) {
                var50 = f7422(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic40$)) {
                var50 = f7423(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic41$)) {
                var50 = f7424(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic42$)) {
                var50 = f7425(var49, var22, var24, var26, var28, var30, var32);
            }
            else if (var52.eql((SubLObject)module0104.$ic43$)) {
                var50 = f7426(var49, var22, var24, var26, var28, var30, var32);
            }
            else {
                Errors.error((SubLObject)module0104.$ic44$, var49);
            }
        }
        finally {
            module0018.$g694$.rebind(var51, var48);
        }
        return var50;
    }
    
    public static SubLObject f7419(final SubLObject var70, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = (SubLObject)SubLObjectFactory.makeBoolean(module0104.$ic45$ != var22);
        var71.resetMultipleValues();
        final SubLObject var73 = module0416.f29172(var70, var72, var24, var26, var28, var30, var32);
        final SubLObject var74 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        return (SubLObject)ConsesLow.list(var74);
    }
    
    public static SubLObject f7420(final SubLObject var73, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (module0104.$ic45$ != var22) {
            if (module0104.NIL != var24) {
                Errors.warn((SubLObject)module0104.$ic46$);
            }
            if (module0104.NIL != var26) {
                Errors.warn((SubLObject)module0104.$ic47$);
            }
        }
        final SubLObject var75 = (SubLObject)SubLObjectFactory.makeBoolean(module0104.$ic45$ != var22);
        final SubLObject var76 = Equality.eq((SubLObject)module0104.$ic20$, var22);
        SubLObject var77 = (SubLObject)module0104.NIL;
        SubLObject var78 = (SubLObject)module0104.NIL;
        final SubLObject var79 = module0029.$g839$.currentBinding(var74);
        final SubLObject var80 = module0029.$g835$.currentBinding(var74);
        final SubLObject var81 = StreamsLow.$standard_output$.currentBinding(var74);
        try {
            module0029.$g839$.bind(var28, var74);
            module0029.$g835$.bind(var32, var74);
            StreamsLow.$standard_output$.bind(var30, var74);
            var77 = f7427(var73, var75, var76, (SubLObject)module0104.$ic48$);
            var78 = f7427(var73, var75, var76, (SubLObject)module0104.$ic49$);
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
        SubLObject var81 = (SubLObject)module0104.NIL;
        SubLObject var82 = (SubLObject)module0104.NIL;
        SubLObject var83 = (SubLObject)module0104.NIL;
        final SubLObject var84 = Time.get_internal_real_time();
        if (module0104.NIL == module0029.$g840$.getDynamicValue(var80)) {
            try {
                var80.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var85 = Errors.$error_handler$.currentBinding(var80);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var80);
                    try {
                        if (var79.eql((SubLObject)module0104.$ic48$)) {
                            var83 = module0421.f29414(var73, var74, var71, (SubLObject)module0104.$ic48$, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
                        }
                        else if (var79.eql((SubLObject)module0104.$ic49$)) {
                            var83 = module0421.f29414(var73, var74, var71, (SubLObject)module0104.$ic49$, (SubLObject)module0104.NIL, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
                        }
                        else {
                            Errors.error((SubLObject)module0104.$ic50$, var79);
                        }
                    }
                    catch (Throwable var86) {
                        Errors.handleThrowable(var86, (SubLObject)module0104.NIL);
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
        else if (var79.eql((SubLObject)module0104.$ic48$)) {
            var83 = module0421.f29414(var73, var74, var71, (SubLObject)module0104.$ic48$, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        }
        else if (var79.eql((SubLObject)module0104.$ic49$)) {
            var83 = module0421.f29414(var73, var74, var71, (SubLObject)module0104.$ic49$, (SubLObject)module0104.NIL, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)module0104.$ic50$, var79);
        }
        var82 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var84), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (module0104.NIL != var81) {
            var83 = module0029.f1535((SubLObject)module0104.$ic37$, (SubLObject)ConsesLow.list(var73, var79), (SubLObject)module0104.$ic51$, var82);
        }
        return var83;
    }
    
    public static SubLObject f7421(final SubLObject var83, final SubLObject var22, final SubLObject var24, final SubLObject var26, final SubLObject var28, SubLObject var30, final SubLObject var32) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)module0104.NIL;
        if (module0104.$ic45$ == var22) {
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
        SubLObject var86 = (SubLObject)module0104.NIL;
        if (module0104.$ic45$ == var22) {
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
        if (module0104.$ic45$ != var22) {
            if (module0104.NIL != var24) {
                Errors.warn((SubLObject)module0104.$ic52$);
            }
            if (module0104.NIL != var26) {
                Errors.warn((SubLObject)module0104.$ic53$);
            }
        }
        SubLObject var87 = (SubLObject)module0104.NIL;
        if (module0104.$ic45$ == var22) {
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
        if (module0104.$ic45$ != var22 && module0104.NIL != var26) {
            Errors.warn((SubLObject)module0104.$ic54$);
        }
        SubLObject var88 = (SubLObject)module0104.NIL;
        if (module0104.$ic45$ == var22) {
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
        if (module0104.$ic45$ != var22) {
            if (module0104.NIL != var24) {
                Errors.warn((SubLObject)module0104.$ic55$);
            }
            if (module0104.NIL != var26) {
                Errors.warn((SubLObject)module0104.$ic56$);
            }
        }
        SubLObject var89 = (SubLObject)module0104.NIL;
        final SubLObject var90 = (SubLObject)((module0104.$ic57$ == var28) ? module0104.$ic57$ : var22);
        final SubLObject var91 = module0029.$g835$.currentBinding(var88);
        try {
            module0029.$g835$.bind(var32, var88);
            var88.resetMultipleValues();
            final SubLObject var92 = module0027.f1436(var30, var87, var90, (SubLObject)module0104.NIL);
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
        if (var97 == module0104.UNPROVIDED) {
            var97 = module0029.f1483();
        }
        if (var98 == module0104.UNPROVIDED) {
            var98 = (SubLObject)module0104.ZERO_INTEGER;
        }
        if (var99 == module0104.UNPROVIDED) {
            var99 = (SubLObject)module0104.ONE_INTEGER;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        assert module0104.NIL != Types.streamp(var30) : var30;
        assert module0104.NIL != module0029.f1473(var22) : var22;
        assert module0104.NIL != module0029.f1474(var28) : var28;
        assert module0104.NIL != Types.booleanp(var91) : var91;
        assert module0104.NIL != Types.booleanp(var32) : var32;
        assert module0104.NIL != module0029.f1481(var93) : var93;
        if (module0104.NIL != var95 && !module0104.areAssertionsDisabledFor(me) && module0104.NIL == module0075.f5193(var95)) {
            throw new AssertionError(var95);
        }
        if (module0104.NIL == var96) {
            var96 = module0104.$g1344$.getDynamicValue(var100);
        }
        assert module0104.NIL != module0004.f106(var96) : var96;
        if (module0104.NIL != f7411() && !module0104.areAssertionsDisabledFor(me) && module0104.NIL == module0075.f5192(f7411(), (SubLObject)module0104.UNPROVIDED)) {
            throw new AssertionError(f7411());
        }
        if (module0104.NIL == Errors.$ignore_mustsP$.getDynamicValue(var100) && !var98.numL(var99)) {
            Errors.error((SubLObject)module0104.$ic61$, var98, var99);
        }
        final SubLObject var101 = Equality.eq((SubLObject)module0104.$ic45$, var22);
        final SubLObject var102 = (SubLObject)((module0104.NIL != var97) ? SubLObjectFactory.makeBoolean(!var97.eql(module0029.f1483())) : module0104.NIL);
        SubLObject var103 = (SubLObject)module0104.NIL;
        final SubLObject var104 = Time.get_universal_time();
        SubLObject var105 = (SubLObject)module0104.NIL;
        SubLObject var106 = (SubLObject)module0104.NIL;
        var100.resetMultipleValues();
        SubLObject var107 = f7429(var95, var96);
        final SubLObject var108 = var100.secondMultipleValue();
        var100.resetMultipleValues();
        if (module0104.NIL != var95) {
            SubLObject var108_109 = (SubLObject)module0104.NIL;
            try {
                final SubLObject var109 = stream_macros.$stream_requires_locking$.currentBinding(var100);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0104.NIL, var100);
                    var108_109 = compatibility.open_binary(var95, (SubLObject)module0104.$ic62$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var109, var100);
                }
                if (!var108_109.isStream()) {
                    Errors.error((SubLObject)module0104.$ic63$, var95);
                }
                final SubLObject var110 = var108_109;
                try {
                    var100.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var111 = Errors.$error_handler$.currentBinding(var100);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var100);
                        try {
                            if (module0104.NIL == var101) {
                                f7430(var30, var104, var102, var98, var99);
                            }
                            SubLObject var112 = (SubLObject)module0104.NIL;
                            SubLObject var113 = (SubLObject)module0104.NIL;
                            SubLObject var114 = (SubLObject)module0104.NIL;
                            var112 = var97;
                            var113 = var112.first();
                            for (var114 = (SubLObject)module0104.ZERO_INTEGER; module0104.NIL == var103 && module0104.NIL != var112; var112 = var112.rest(), var113 = var112.first(), var114 = Numbers.add((SubLObject)module0104.ONE_INTEGER, var114)) {
                                SubLObject var115 = (SubLObject)module0104.NIL;
                                if (module0104.NIL == f7431(var114, var98, var99) || module0104.NIL == f7432(var113, var93, var92, var94, var108)) {
                                    var115 = (SubLObject)ConsesLow.list(f7433(var113));
                                }
                                else if (module0104.$ic42$ != module0029.f1510(var113) && module0104.NIL != f7434(var113)) {
                                    var115 = (SubLObject)ConsesLow.list(f7435(var113));
                                }
                                else {
                                    f7436(var113);
                                    if (module0104.NIL != var95) {
                                        module0021.f1038(f7437(var113), var110);
                                        streams_high.force_output(var110);
                                    }
                                    if (module0104.NIL == module0029.$g840$.getDynamicValue(var100)) {
                                        try {
                                            var100.throwStack.push(module0003.$g3$.getGlobalValue());
                                            final SubLObject var5_114 = Errors.$error_handler$.currentBinding(var100);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var100);
                                                try {
                                                    var115 = f7415(var113, var22, (SubLObject)module0104.NIL, (SubLObject)module0104.NIL, var28, var30, var32);
                                                }
                                                catch (Throwable var116) {
                                                    Errors.handleThrowable(var116, (SubLObject)module0104.NIL);
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
                                        var115 = f7415(var113, var22, (SubLObject)module0104.NIL, (SubLObject)module0104.NIL, var28, var30, var32);
                                    }
                                    f7438(var113, var115);
                                }
                                if (module0104.NIL != var105) {
                                    var106 = (SubLObject)module0104.T;
                                    if (module0104.NIL == var101) {
                                        module0006.f218(var30, (SubLObject)module0104.$ic64$, var105, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
                                    }
                                    var105 = (SubLObject)module0104.NIL;
                                }
                                var107 = ConsesLow.nconc(var107, var115);
                                if (module0104.NIL != var95) {
                                    SubLObject var118 = var115;
                                    SubLObject var119 = (SubLObject)module0104.NIL;
                                    var119 = var118.first();
                                    while (module0104.NIL != var118) {
                                        module0021.f1038(var119, var110);
                                        streams_high.force_output(var110);
                                        var118 = var118.rest();
                                        var119 = var118.first();
                                    }
                                }
                                if (module0104.NIL != var91) {
                                    final SubLObject var120 = module0029.f1542(var115);
                                    if (module0104.NIL != module0029.f1477(var120)) {
                                        var103 = (SubLObject)module0104.T;
                                    }
                                }
                            }
                            if (module0104.NIL == var101) {
                                f7439(var30, var104, var107, var102, var93);
                            }
                        }
                        catch (Throwable var121) {
                            Errors.handleThrowable(var121, (SubLObject)module0104.NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0104.T, var100);
                    if (var108_109.isStream()) {
                        streams_high.close(var108_109, (SubLObject)module0104.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var123, var100);
                }
            }
        }
        else {
            final SubLObject var124 = (SubLObject)module0104.NIL;
            try {
                var100.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var109 = Errors.$error_handler$.currentBinding(var100);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var100);
                    try {
                        if (module0104.NIL == var101) {
                            f7430(var30, var104, var102, var98, var99);
                        }
                        SubLObject var125 = (SubLObject)module0104.NIL;
                        SubLObject var126 = (SubLObject)module0104.NIL;
                        SubLObject var127 = (SubLObject)module0104.NIL;
                        var125 = var97;
                        var126 = var125.first();
                        for (var127 = (SubLObject)module0104.ZERO_INTEGER; module0104.NIL == var103 && module0104.NIL != var125; var125 = var125.rest(), var126 = var125.first(), var127 = Numbers.add((SubLObject)module0104.ONE_INTEGER, var127)) {
                            SubLObject var128 = (SubLObject)module0104.NIL;
                            if (module0104.NIL == f7431(var127, var98, var99) || module0104.NIL == f7432(var126, var93, var92, var94, var108)) {
                                var128 = (SubLObject)ConsesLow.list(f7433(var126));
                            }
                            else if (module0104.$ic42$ != module0029.f1510(var126) && module0104.NIL != f7434(var126)) {
                                var128 = (SubLObject)ConsesLow.list(f7435(var126));
                            }
                            else {
                                f7436(var126);
                                if (module0104.NIL != var95) {
                                    module0021.f1038(f7437(var126), var124);
                                    streams_high.force_output(var124);
                                }
                                if (module0104.NIL == module0029.$g840$.getDynamicValue(var100)) {
                                    try {
                                        var100.throwStack.push(module0003.$g3$.getGlobalValue());
                                        final SubLObject var5_115 = Errors.$error_handler$.currentBinding(var100);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var100);
                                            try {
                                                var128 = f7415(var126, var22, (SubLObject)module0104.NIL, (SubLObject)module0104.NIL, var28, var30, var32);
                                            }
                                            catch (Throwable var129) {
                                                Errors.handleThrowable(var129, (SubLObject)module0104.NIL);
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
                                    var128 = f7415(var126, var22, (SubLObject)module0104.NIL, (SubLObject)module0104.NIL, var28, var30, var32);
                                }
                                f7438(var126, var128);
                            }
                            if (module0104.NIL != var105) {
                                var106 = (SubLObject)module0104.T;
                                if (module0104.NIL == var101) {
                                    module0006.f218(var30, (SubLObject)module0104.$ic64$, var105, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
                                }
                                var105 = (SubLObject)module0104.NIL;
                            }
                            var107 = ConsesLow.nconc(var107, var128);
                            if (module0104.NIL != var95) {
                                SubLObject var131 = var128;
                                SubLObject var132 = (SubLObject)module0104.NIL;
                                var132 = var131.first();
                                while (module0104.NIL != var131) {
                                    module0021.f1038(var132, var124);
                                    streams_high.force_output(var124);
                                    var131 = var131.rest();
                                    var132 = var131.first();
                                }
                            }
                            if (module0104.NIL != var91) {
                                final SubLObject var133 = module0029.f1542(var128);
                                if (module0104.NIL != module0029.f1477(var133)) {
                                    var103 = (SubLObject)module0104.T;
                                }
                            }
                        }
                        if (module0104.NIL == var101) {
                            f7439(var30, var104, var107, var102, var93);
                        }
                    }
                    catch (Throwable var134) {
                        Errors.handleThrowable(var134, (SubLObject)module0104.NIL);
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
        if (module0104.NIL != var106) {
            var136 = (SubLObject)module0104.$ic65$;
        }
        return Values.values(var136, var107);
    }
    
    public static SubLObject f7431(final SubLObject var112, final SubLObject var98, final SubLObject var99) {
        return Numbers.numE(var98, Numbers.mod(var112, var99));
    }
    
    public static SubLObject f7429(final SubLObject var95, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (module0104.NIL == var95 || module0104.NIL == module0075.f5218(var95)) {
            return Values.values((SubLObject)module0104.NIL, module0077.f5313(Symbols.symbol_function((SubLObject)module0104.EQ), (SubLObject)module0104.UNPROVIDED));
        }
        final SubLObject var98 = module0067.f4880(Symbols.symbol_function((SubLObject)module0104.EQ), (SubLObject)module0104.UNPROVIDED);
        final SubLObject var99 = module0067.f4880(Symbols.symbol_function((SubLObject)module0104.EQ), (SubLObject)module0104.UNPROVIDED);
        SubLObject var100 = (SubLObject)module0104.NIL;
        SubLObject var101 = (SubLObject)module0104.NIL;
        SubLObject var102 = (SubLObject)module0104.NIL;
        try {
            final SubLObject var103 = stream_macros.$stream_requires_locking$.currentBinding(var97);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0104.NIL, var97);
                var102 = compatibility.open_binary(var95, (SubLObject)module0104.$ic66$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var103, var97);
            }
            if (!var102.isStream()) {
                Errors.error((SubLObject)module0104.$ic63$, var95);
            }
            SubLObject var30_123;
            for (var30_123 = var102, var100 = module0021.f1060(var30_123, (SubLObject)module0104.NIL, (SubLObject)module0104.$ic67$); module0104.$ic67$ != var100; var100 = module0021.f1060(var30_123, (SubLObject)module0104.NIL, (SubLObject)module0104.$ic67$)) {
                assert module0104.NIL != module0029.f1536(var100) : var100;
                final SubLObject var104 = module0029.f1541(var100);
                module0067.f4886(var98, var104, var100);
                module0084.f5775(var99, var104, (SubLObject)module0104.UNPROVIDED);
                var101 = var104;
            }
        }
        finally {
            final SubLObject var105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0104.T, var97);
                if (var102.isStream()) {
                    streams_high.close(var102, (SubLObject)module0104.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var105, var97);
            }
        }
        final SubLObject var106 = module0067.f4903(var98);
        final SubLObject var107 = module0078.f5367(module0067.f4902(var98), Symbols.symbol_function((SubLObject)module0104.EQ), (SubLObject)module0104.UNPROVIDED);
        if (module0104.NIL != var101 && var96.isPositive() && module0067.f4884(var99, var101, (SubLObject)module0104.ZERO_INTEGER).numLE(var96)) {
            module0077.f5327(var101, var107);
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f7433(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)module0104.$ic69$, (SubLObject)module0104.NIL);
    }
    
    public static SubLObject f7435(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)module0104.$ic70$, (SubLObject)module0104.NIL);
    }
    
    public static SubLObject f7437(final SubLObject var47) {
        final SubLObject var48 = module0029.f1510(var47);
        final SubLObject var49 = module0029.f1495(var47);
        return module0029.f1535(var48, var49, (SubLObject)module0104.$ic51$, (SubLObject)module0104.NIL);
    }
    
    public static SubLObject f7432(final SubLObject var47, final SubLObject var124, final SubLObject var92, final SubLObject var94, SubLObject var106) {
        if (var106 == module0104.UNPROVIDED) {
            var106 = (SubLObject)module0104.NIL;
        }
        if (module0104.NIL != module0029.f1471()) {
            if (module0104.NIL != module0035.f2169(module0029.f1510(var47), (SubLObject)module0104.$ic71$)) {
                return (SubLObject)module0104.NIL;
            }
            if (module0104.NIL != module0035.f2169(module0029.f1495(var47), module0104.$g1346$.getGlobalValue())) {
                return (SubLObject)module0104.NIL;
            }
        }
        if (module0104.NIL != module0029.f1480(var124)) {
            final SubLObject var125 = module0029.f1510(var47);
            if (!var125.eql(var124)) {
                return (SubLObject)module0104.NIL;
            }
        }
        if (module0104.NIL == var92 && module0104.$ic42$ == module0029.f1510(var47)) {
            return (SubLObject)module0104.NIL;
        }
        if (module0104.NIL != var106 && module0104.NIL != module0077.f5320(var47, var106)) {
            return (SubLObject)module0104.NIL;
        }
        if (module0104.T != var94) {
            if (module0104.NIL == var94) {
                if (module0104.NIL == module0029.f1516(var47)) {
                    return (SubLObject)module0104.NIL;
                }
            }
            else {
                if (module0104.$ic72$ != var94) {
                    return Errors.error((SubLObject)module0104.$ic73$, var94);
                }
                if (module0104.NIL != module0029.f1516(var47)) {
                    return (SubLObject)module0104.NIL;
                }
            }
        }
        return (SubLObject)module0104.T;
    }
    
    public static SubLObject f7440(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == module0104.UNPROVIDED) {
            var125 = (SubLObject)module0104.NIL;
        }
        if (var126 == module0104.UNPROVIDED) {
            var126 = (SubLObject)module0104.NIL;
        }
        PrintLow.format(var30, (SubLObject)module0104.$ic74$);
        final SubLObject var127 = module0035.remove_if_not((SubLObject)module0104.$ic75$, var45, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        if (module0104.NIL != var127) {
            SubLObject var128 = var127;
            SubLObject var129 = (SubLObject)module0104.NIL;
            var129 = var128.first();
            while (module0104.NIL != var128) {
                f7441(var30, var129, var125, var126);
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        else {
            PrintLow.format(var30, (SubLObject)module0104.$ic76$);
        }
        streams_high.force_output(var30);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7442(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == module0104.UNPROVIDED) {
            var125 = (SubLObject)module0104.NIL;
        }
        if (var126 == module0104.UNPROVIDED) {
            var126 = (SubLObject)module0104.NIL;
        }
        PrintLow.format(var30, (SubLObject)module0104.$ic77$);
        final SubLObject var127 = module0035.remove_if_not((SubLObject)module0104.$ic78$, var45, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        if (module0104.NIL != var127) {
            SubLObject var128 = var127;
            SubLObject var129 = (SubLObject)module0104.NIL;
            var129 = var128.first();
            while (module0104.NIL != var128) {
                f7441(var30, var129, var125, var126);
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        else {
            PrintLow.format(var30, (SubLObject)module0104.$ic79$);
        }
        streams_high.force_output(var30);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7443(final SubLObject var30, final SubLObject var45, SubLObject var125, SubLObject var126) {
        if (var125 == module0104.UNPROVIDED) {
            var125 = (SubLObject)module0104.NIL;
        }
        if (var126 == module0104.UNPROVIDED) {
            var126 = (SubLObject)module0104.NIL;
        }
        final SubLObject var127 = module0035.remove_if_not((SubLObject)module0104.$ic80$, var45, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        if (module0104.NIL == var127) {
            PrintLow.format(var30, (SubLObject)module0104.$ic81$);
        }
        else {
            SubLObject var128 = (SubLObject)module0104.NIL;
            SubLObject var129 = (SubLObject)module0104.NIL;
            SubLObject var130 = var127;
            SubLObject var131 = (SubLObject)module0104.NIL;
            var131 = var130.first();
            while (module0104.NIL != var130) {
                final SubLObject var132 = module0029.f1539(var131);
                if (var132.eql((SubLObject)module0104.$ic82$)) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                else if (var132.eql((SubLObject)module0104.$ic83$)) {
                    var129 = (SubLObject)ConsesLow.cons(var131, var129);
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
            var128 = Sequences.nreverse(var128);
            var129 = Sequences.nreverse(var129);
            PrintLow.format(var30, (SubLObject)module0104.$ic84$);
            var130 = var129;
            var131 = (SubLObject)module0104.NIL;
            var131 = var130.first();
            while (module0104.NIL != var130) {
                f7441(var30, var131, var125, var126);
                var130 = var130.rest();
                var131 = var130.first();
            }
            PrintLow.format(var30, (SubLObject)module0104.$ic85$);
            var130 = var128;
            var131 = (SubLObject)module0104.NIL;
            var131 = var130.first();
            while (module0104.NIL != var130) {
                f7441(var30, var131, var125, var126);
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        streams_high.force_output(var30);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7430(final SubLObject var30, final SubLObject var103, final SubLObject var101, SubLObject var98, SubLObject var99) {
        if (var98 == module0104.UNPROVIDED) {
            var98 = (SubLObject)module0104.ZERO_INTEGER;
        }
        if (var99 == module0104.UNPROVIDED) {
            var99 = (SubLObject)module0104.ONE_INTEGER;
        }
        final SubLObject var104 = (SubLObject)SubLObjectFactory.makeBoolean(module0104.NIL == module0018.f973());
        if (module0104.NIL != var101) {
            PrintLow.format(var30, (SubLObject)module0104.$ic86$);
        }
        else {
            PrintLow.format(var30, (SubLObject)module0104.$ic87$, module0029.f1555(), module0029.f1555());
        }
        PrintLow.format(var30, (SubLObject)module0104.$ic88$, new SubLObject[] { (module0104.NIL != var104) ? module0104.$ic89$ : module0104.$ic90$, module0018.f971(), module0011.f351(), module0051.f3552(var103), (module0104.ONE_INTEGER.numE(var99) && module0104.ZERO_INTEGER.numE(var98)) ? module0104.$ic91$ : Sequences.cconcatenate((SubLObject)module0104.$ic92$, new SubLObject[] { module0006.f203(Numbers.add((SubLObject)module0104.ONE_INTEGER, var98)), module0104.$ic93$, module0006.f203(var99), module0104.$ic94$ }) });
        streams_high.force_output(var30);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7439(final SubLObject var30, final SubLObject var103, final SubLObject var45, final SubLObject var101, final SubLObject var93) {
        if (module0104.NIL == var45) {
            PrintLow.format(var30, (SubLObject)module0104.$ic95$);
        }
        else {
            if (module0104.NIL == var101) {
                final SubLObject var104 = module0029.f1526(var93);
                if (module0104.NIL != var104) {
                    final SubLObject var105 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0104.$ic96$), var104);
                    PrintLow.format(var30, (SubLObject)module0104.$ic97$);
                    module0006.f215(var105, var30);
                    streams_high.terpri(var30);
                }
            }
            f7440(var30, var45, (SubLObject)module0104.T, (SubLObject)module0104.NIL);
            final SubLObject var106 = module0029.f1542(var45);
            final SubLObject var107 = module0029.f1544(var45);
            final SubLObject var108 = Time.get_universal_time();
            final SubLObject var109 = Numbers.subtract(var108, var103);
            PrintLow.format(var30, (SubLObject)module0104.$ic98$, new SubLObject[] { module0051.f3552(var108), module0051.f3664(var109), module0051.f3664(var107) });
            module0035.f2365(module0035.f2516(Mapping.mapcar((SubLObject)module0104.$ic99$, var45), (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED), (SubLObject)module0104.UNPROVIDED);
            PrintLow.format(var30, (SubLObject)module0104.$ic100$, var106);
        }
        streams_high.force_output(var30);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7441(final SubLObject var30, final SubLObject var72, final SubLObject var137, final SubLObject var138) {
        PrintLow.format(var30, (SubLObject)module0104.$ic101$, new SubLObject[] { module0029.f1537(var72), module0029.f1538(var72), module0029.f1539(var72), (module0104.NIL != module0029.f1540(var72)) ? module0048.f3302(module0029.f1540(var72), (SubLObject)module0104.FOUR_INTEGER) : module0104.NIL });
        if (module0104.NIL != var137) {
            PrintLow.format(var30, (SubLObject)module0104.$ic102$, module0029.f1548(var72));
        }
        if (module0104.NIL != var138) {
            final SubLObject var139 = module0029.f1549(var72);
            if (module0104.NIL != var139) {
                PrintLow.format(var30, (SubLObject)module0104.$ic102$, var139);
            }
        }
        streams_high.terpri(var30);
        streams_high.force_output(var30);
        return var72;
    }
    
    public static SubLObject f7436(final SubLObject var47) {
        final SubLObject var48 = f7411();
        if (module0104.NIL != var48) {
            final SubLObject var49 = f7444(var47, var48);
            Mapper.write_image(var49, (SubLObject)module0104.UNPROVIDED);
            return var49;
        }
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7438(final SubLObject var47, final SubLObject var45) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f7411();
        if (module0104.NIL == var49) {
            return (SubLObject)module0104.NIL;
        }
        final SubLObject var50 = f7444(var47, var49);
        if (module0104.$ic103$ == module0029.f1542(var45)) {
            SubLObject var51 = (SubLObject)module0104.NIL;
            try {
                var48.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var52 = Errors.$error_handler$.currentBinding(var48);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0104.$ic0$, var48);
                    try {
                        Filesys.delete_file(var50);
                    }
                    catch (Throwable var53) {
                        Errors.handleThrowable(var53, (SubLObject)module0104.NIL);
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
                Errors.warn((SubLObject)module0104.$ic2$, var51);
            }
            return (SubLObject)module0104.T;
        }
        return var50;
    }
    
    public static SubLObject f7444(final SubLObject var47, final SubLObject var140) {
        final SubLObject var141 = Strings.string_downcase(module0038.f2962(module0038.f2638(module0029.f1495(var47))), (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
        final SubLObject var142 = Sequences.cconcatenate((SubLObject)module0104.$ic104$, var141);
        return Strings.string_downcase(module0075.f5176(var140, var142, (SubLObject)module0104.$ic105$), (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED);
    }
    
    public static SubLObject f7434(final SubLObject var47) {
        final SubLObject var48 = module0029.f1491(var47);
        final SubLObject var49 = module0029.f1510(var47);
        if (var49.eql((SubLObject)module0104.$ic36$)) {
            return module0416.f29145(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic37$)) {
            return module0421.f29428(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic38$)) {
            return module0417.f29230(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic39$)) {
            return module0418.f29294(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic40$)) {
            return module0422.f29511(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic41$)) {
            return module0419.f29342(var48);
        }
        if (var49.eql((SubLObject)module0104.$ic42$)) {
            return module0035.sublisp_boolean(module0027.f1426(var48));
        }
        if (var49.eql((SubLObject)module0104.$ic43$)) {
            return module0634.f38762(var48);
        }
        return Errors.error((SubLObject)module0104.$ic44$, var48);
    }
    
    public static SubLObject f7445(final SubLObject var142, final SubLObject var143) {
        final SubLObject var144 = f7446(var142);
        final SubLObject var145 = f7446(var143);
        return f7447(var144, var145);
    }
    
    public static SubLObject f7446(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0067.f4880(Symbols.symbol_function((SubLObject)module0104.EQUAL), (SubLObject)module0104.UNPROVIDED);
        assert module0104.NIL != Filesys.directory_p(var146) : var146;
        SubLObject var149 = Filesys.directory(var146, (SubLObject)module0104.NIL);
        final SubLObject var150 = (SubLObject)module0104.NIL;
        final SubLObject var151 = module0012.$silent_progressP$.currentBinding(var147);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var150.isString()), var147);
            if (module0104.NIL.isFunctionSpec()) {
                var149 = Sort.sort(var149, (SubLObject)module0104.NIL, (SubLObject)module0104.UNPROVIDED);
            }
            final SubLObject var152 = var149;
            module0012.$g82$.setDynamicValue(var150, var147);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var147);
            module0012.$g83$.setDynamicValue(Sequences.length(var152), var147);
            module0012.$g84$.setDynamicValue((SubLObject)module0104.ZERO_INTEGER, var147);
            final SubLObject var5_150 = module0012.$g75$.currentBinding(var147);
            final SubLObject var153 = module0012.$g76$.currentBinding(var147);
            final SubLObject var154 = module0012.$g77$.currentBinding(var147);
            final SubLObject var155 = module0012.$g78$.currentBinding(var147);
            try {
                module0012.$g75$.bind((SubLObject)module0104.ZERO_INTEGER, var147);
                module0012.$g76$.bind((SubLObject)module0104.NIL, var147);
                module0012.$g77$.bind((SubLObject)module0104.T, var147);
                module0012.$g78$.bind(Time.get_universal_time(), var147);
                module0012.f478(module0012.$g82$.getDynamicValue(var147));
                SubLObject var156 = var152;
                SubLObject var157 = (SubLObject)module0104.NIL;
                var157 = var156.first();
                while (module0104.NIL != var156) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var147), module0012.$g83$.getDynamicValue(var147));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var147), (SubLObject)module0104.ONE_INTEGER), var147);
                    if (module0104.NIL == Filesys.directory_p(var157) && module0104.NIL == f7448(var157)) {
                        module0067.f4886(var148, var157, module0075.f5249(module0075.f5176(var146, var157, (SubLObject)module0104.UNPROVIDED)));
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
        SubLObject var147 = (SubLObject)module0104.NIL;
        SubLObject var148;
        for (var148 = module0066.f4838(module0067.f4891(var144)); module0104.NIL == module0066.f4841(var148); var148 = module0066.f4840(var148)) {
            var146.resetMultipleValues();
            final SubLObject var149 = module0066.f4839(var148);
            final SubLObject var150 = var146.secondMultipleValue();
            var146.resetMultipleValues();
            final SubLObject var151 = module0067.f4885(var145, var149, (SubLObject)module0104.UNPROVIDED);
            if (module0104.NIL == var151) {
                var147 = (SubLObject)ConsesLow.cons(f7449(var149, (SubLObject)module0104.T), var147);
            }
            else if (module0104.NIL == f7450(var150, var151, var149)) {
                var147 = (SubLObject)ConsesLow.cons(f7451(var150, var151, var149), var147);
            }
        }
        module0066.f4842(var148);
        for (var148 = module0066.f4838(module0067.f4891(var145)); module0104.NIL == module0066.f4841(var148); var148 = module0066.f4840(var148)) {
            var146.resetMultipleValues();
            final SubLObject var149 = module0066.f4839(var148);
            final SubLObject var152 = var146.secondMultipleValue();
            var146.resetMultipleValues();
            if (module0104.NIL == module0067.f4885(var144, var149, (SubLObject)module0104.UNPROVIDED)) {
                var147 = (SubLObject)ConsesLow.cons(f7449(var149, (SubLObject)module0104.NIL), var147);
            }
        }
        module0066.f4842(var148);
        return Sequences.nreverse(var147);
    }
    
    public static SubLObject f7450(final SubLObject var156, final SubLObject var157, final SubLObject var2) {
        if (var156.numE(var157)) {
            return (SubLObject)module0104.T;
        }
        final SubLObject var158 = f7452(var156, var157);
        final SubLObject var159 = (module0104.NIL != var158) ? var156 : var157;
        final SubLObject var160 = (module0104.NIL != var158) ? var157 : var156;
        final SubLObject var161 = f7453(var2);
        return Numbers.numL(Numbers.divide(var160, var159), var161);
    }
    
    public static SubLObject f7453(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0104.$g1347$.getDynamicValue(var3);
    }
    
    public static SubLObject f7452(final SubLObject var156, final SubLObject var157) {
        return Numbers.numL(var156, var157);
    }
    
    public static SubLObject f7451(final SubLObject var156, final SubLObject var157, final SubLObject var2) {
        final SubLObject var158 = f7452(var156, var157);
        return Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { module0104.$ic110$, module0006.f203((SubLObject)((module0104.NIL != var158) ? module0104.$ic111$ : module0104.$ic112$)), module0104.$ic113$, module0006.f203(var156), module0104.$ic114$, module0006.f203(var157), module0104.$ic115$ });
    }
    
    public static SubLObject f7449(final SubLObject var2, final SubLObject var163) {
        if (module0104.NIL != var163) {
            return Sequences.cconcatenate(module0006.f203(var2), (SubLObject)module0104.$ic116$);
        }
        return Sequences.cconcatenate(module0006.f203(var2), (SubLObject)module0104.$ic117$);
    }
    
    public static SubLObject f7448(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return f7454(var2, module0104.$g1348$.getDynamicValue(var3));
    }
    
    public static SubLObject f7454(final SubLObject var164, final SubLObject var165) {
        SubLObject var166 = var165;
        SubLObject var167 = (SubLObject)module0104.NIL;
        var167 = var166.first();
        while (module0104.NIL != var166) {
            if (module0104.NIL != module0045.f3138(var167, var164, (SubLObject)module0104.UNPROVIDED, (SubLObject)module0104.UNPROVIDED)) {
                return (SubLObject)module0104.T;
            }
            var166 = var166.rest();
            var167 = var166.first();
        }
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7455(final SubLObject var146, final SubLObject var167) {
        final SubLObject var168 = f7446(var146);
        final SubLObject var169 = (SubLObject)module0104.$ic118$;
        final SubLObject var170 = Sequences.cconcatenate((SubLObject)module0104.$ic119$, module0051.f3552((SubLObject)module0104.UNPROVIDED));
        return module0084.f5792(var168, var167, var169, var170);
    }
    
    public static SubLObject f7456(final SubLObject var167) {
        return module0084.f5793(var167, Symbols.symbol_function((SubLObject)module0104.EQUAL), (SubLObject)module0104.T, (SubLObject)module0104.T);
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
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7459() {
        module0104.$g1344$ = SubLFiles.defparameter("S#9382", (SubLObject)module0104.ONE_INTEGER);
        module0104.$g1345$ = SubLFiles.defparameter("S#9383", (SubLObject)module0104.NIL);
        module0104.$g1346$ = SubLFiles.deflexical("S#9384", (SubLObject)module0104.$ic106$);
        module0104.$g1347$ = SubLFiles.defparameter("S#9385", (SubLObject)module0104.$ic107$);
        module0104.$g1348$ = SubLFiles.defparameter("S#9386", (SubLObject)module0104.$ic108$);
        module0104.$g1349$ = SubLFiles.deflexical("S#9387", (SubLObject)module0104.$ic91$);
        return (SubLObject)module0104.NIL;
    }
    
    public static SubLObject f7460() {
        module0002.f50((SubLObject)module0104.$ic17$, (SubLObject)module0104.$ic21$);
        module0002.f50((SubLObject)module0104.$ic30$, (SubLObject)module0104.$ic31$);
        return (SubLObject)module0104.NIL;
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
        module0104.$g1344$ = null;
        module0104.$g1345$ = null;
        module0104.$g1346$ = null;
        module0104.$g1347$ = null;
        module0104.$g1348$ = null;
        module0104.$g1349$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic1$ = SubLObjectFactory.makeString(".lisp");
        $ic2$ = SubLObjectFactory.makeString("~A");
        $ic3$ = SubLObjectFactory.makeString("/");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2816", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), (SubLObject)SubLObjectFactory.makeSymbol("S#9388", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9389", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2818", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2792", "CYC"))));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic6$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic7$ = SubLObjectFactory.makeKeyword("VERBOSITY");
        $ic8$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic9$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic10$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic11$ = SubLObjectFactory.makeKeyword("OUTPUT-FORMAT");
        $ic12$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic13$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic14$ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $ic15$ = SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
        $ic16$ = SubLObjectFactory.makeSymbol("S#2792", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#9339", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#9388", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9389", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2818", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2792", "CYC"))));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic20$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic21$ = SubLObjectFactory.makeSymbol("S#9337", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#2687", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic24$ = SubLObjectFactory.makeSymbol("S#2688", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic26$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9390", "CYC"), (SubLObject)module0104.FOUR_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9391", "CYC"), (SubLObject)module0104.TEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2816", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), SubLObjectFactory.makeSymbol("S#9388", "CYC"), SubLObjectFactory.makeSymbol("S#9389", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2818", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2792", "CYC"))) });
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NTHREADS"), (SubLObject)SubLObjectFactory.makeKeyword("NTIMES"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $ic28$ = SubLObjectFactory.makeKeyword("NTHREADS");
        $ic29$ = SubLObjectFactory.makeKeyword("NTIMES");
        $ic30$ = SubLObjectFactory.makeSymbol("S#9341", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#9340", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic33$ = SubLObjectFactory.makeString("Parallel Test Thread for ");
        $ic34$ = SubLObjectFactory.makeString(" No. ");
        $ic35$ = SubLObjectFactory.makeSymbol("S#9342", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("IUT");
        $ic37$ = SubLObjectFactory.makeKeyword("IT");
        $ic38$ = SubLObjectFactory.makeKeyword("RMT");
        $ic39$ = SubLObjectFactory.makeKeyword("TMT");
        $ic40$ = SubLObjectFactory.makeKeyword("RMCT");
        $ic41$ = SubLObjectFactory.makeKeyword("ERT");
        $ic42$ = SubLObjectFactory.makeKeyword("TCT");
        $ic43$ = SubLObjectFactory.makeKeyword("KCT");
        $ic44$ = SubLObjectFactory.makeString("Cyc test of unexpected type: ~s");
        $ic45$ = SubLObjectFactory.makeKeyword("SILENT");
        $ic46$ = SubLObjectFactory.makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");
        $ic47$ = SubLObjectFactory.makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");
        $ic48$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic49$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic50$ = SubLObjectFactory.makeString("Unexpected testing direction : ~S");
        $ic51$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic52$ = SubLObjectFactory.makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");
        $ic53$ = SubLObjectFactory.makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");
        $ic54$ = SubLObjectFactory.makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");
        $ic55$ = SubLObjectFactory.makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");
        $ic56$ = SubLObjectFactory.makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");
        $ic57$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic58$ = SubLObjectFactory.makeSymbol("S#2695", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#6802", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#6801", "CYC");
        $ic61$ = SubLObjectFactory.makeString("Invalid phase ~A of ~A specified.");
        $ic62$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic63$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic64$ = SubLObjectFactory.makeString("~&:HARNESS-ERROR: ~A~%");
        $ic65$ = SubLObjectFactory.makeKeyword("HARNESS-ERROR");
        $ic66$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic67$ = SubLObjectFactory.makeKeyword("EOF");
        $ic68$ = SubLObjectFactory.makeSymbol("S#2745", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("NOT-RUN");
        $ic70$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RMT"), (SubLObject)SubLObjectFactory.makeKeyword("TMT"), (SubLObject)SubLObjectFactory.makeKeyword("TCT"));
        $ic72$ = SubLObjectFactory.makeKeyword("ONLY");
        $ic73$ = SubLObjectFactory.makeString("Unexpected value ~s for :run-non-working-tests");
        $ic74$ = SubLObjectFactory.makeString("~&Failing regression tests:~%");
        $ic75$ = SubLObjectFactory.makeSymbol("S#2754", "CYC");
        $ic76$ = SubLObjectFactory.makeString("None! (:");
        $ic77$ = SubLObjectFactory.makeString("~&Succeeding regression tests:~%");
        $ic78$ = SubLObjectFactory.makeSymbol("S#2755", "CYC");
        $ic79$ = SubLObjectFactory.makeString("None! ):");
        $ic80$ = SubLObjectFactory.makeSymbol("S#2756", "CYC");
        $ic81$ = SubLObjectFactory.makeString("Non-regression tests: None.");
        $ic82$ = SubLObjectFactory.makeKeyword("NON-REGRESSION-SUCCESS");
        $ic83$ = SubLObjectFactory.makeKeyword("NON-REGRESSION-FAILURE");
        $ic84$ = SubLObjectFactory.makeString("~&Failing non-regression tests:~%");
        $ic85$ = SubLObjectFactory.makeString("~&Succeeding non-regression tests:~%");
        $ic86$ = SubLObjectFactory.makeString("\nRunning a specified list of tests ");
        $ic87$ = SubLObjectFactory.makeString("\nRunning ~a file~P of tests ");
        $ic88$ = SubLObjectFactory.makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a ~a\n\n");
        $ic89$ = SubLObjectFactory.makeString("Tiny");
        $ic90$ = SubLObjectFactory.makeString("Full");
        $ic91$ = SubLObjectFactory.makeString("");
        $ic92$ = SubLObjectFactory.makeString("(");
        $ic93$ = SubLObjectFactory.makeString(" of ");
        $ic94$ = SubLObjectFactory.makeString(" phases)");
        $ic95$ = SubLObjectFactory.makeString("~&No tests were run.~%");
        $ic96$ = SubLObjectFactory.makeSymbol("S#2722", "CYC");
        $ic97$ = SubLObjectFactory.makeString("~&NOTE: The following cyc tests were noted as not working:~%");
        $ic98$ = SubLObjectFactory.makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");
        $ic99$ = SubLObjectFactory.makeSymbol("S#2748", "CYC");
        $ic100$ = SubLObjectFactory.makeString("Overall result: ~s~%");
        $ic101$ = SubLObjectFactory.makeString("~S ~A ~S ~A");
        $ic102$ = SubLObjectFactory.makeString(" ~A");
        $ic103$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic104$ = SubLObjectFactory.makeString("cyc-test-image-");
        $ic105$ = SubLObjectFactory.makeString("load");
        $ic106$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), SubLObjectFactory.makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), SubLObjectFactory.makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), SubLObjectFactory.makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), SubLObjectFactory.makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), SubLObjectFactory.makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), SubLObjectFactory.makeKeyword("INFERENCE-HARNESS-OVERHEAD"), SubLObjectFactory.makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), SubLObjectFactory.makeKeyword("KAPPA-REMOVAL-WORKS"), SubLObjectFactory.makeKeyword("DONT-REOPEN-ANSWER-LINK"), SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), SubLObjectFactory.makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), SubLObjectFactory.makeKeyword("SIMPLE-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), SubLObjectFactory.makeKeyword("PARTIAL-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), SubLObjectFactory.makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), SubLObjectFactory.makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), SubLObjectFactory.makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), SubLObjectFactory.makeKeyword("TWO-STEP"), SubLObjectFactory.makeKeyword("TWO-STEP-ARG-1"), SubLObjectFactory.makeKeyword("RECONSIDER-DEDUCTION"), SubLObjectFactory.makeKeyword("THERE-EXISTS"), SubLObjectFactory.makeKeyword("EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("STRENGTH-PROPAGATION"), SubLObjectFactory.makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-TEMPLATE"), SubLObjectFactory.makeKeyword("EXCEPT-BLOCKS-BACKWARD"), SubLObjectFactory.makeKeyword("EXCEPT-BLOCKS-FORWARD"), SubLObjectFactory.makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), SubLObjectFactory.makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), SubLObjectFactory.makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), SubLObjectFactory.makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), SubLObjectFactory.makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), SubLObjectFactory.makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), SubLObjectFactory.makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), SubLObjectFactory.makeKeyword("GENLS-BETWEEN"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), SubLObjectFactory.makeKeyword("CIRCULAR-PROOFS"), SubLObjectFactory.makeKeyword("POSSIBLE-REUSED-PROBLEMS-GET-STRATEGICALLY-EVALUATED"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-PROBLEM-REUSE") });
        $ic107$ = (SubLFloat)SubLObjectFactory.makeDouble(1.2);
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".*~[0-9]+~"));
        $ic109$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic110$ = SubLObjectFactory.makeString(" ");
        $ic111$ = SubLObjectFactory.makeString("grew");
        $ic112$ = SubLObjectFactory.makeString("shrunk");
        $ic113$ = SubLObjectFactory.makeString(" from ");
        $ic114$ = SubLObjectFactory.makeString(" bytes to ");
        $ic115$ = SubLObjectFactory.makeString(" bytes");
        $ic116$ = SubLObjectFactory.makeString(" disappeared");
        $ic117$ = SubLObjectFactory.makeString(" is a new file");
        $ic118$ = SubLObjectFactory.makeString("filename");
        $ic119$ = SubLObjectFactory.makeString("size in bytes as of ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0104.class
	Total time: 709 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/