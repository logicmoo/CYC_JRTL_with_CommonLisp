package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0079 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0079";
    public static final String myFingerPrint = "bf46221469e6750c80f8d330ca2ecaac383d317e1198d8cad64b3a32f6454d48";
    public static SubLSymbol $g1148$;
    public static SubLSymbol $g1149$;
    public static SubLSymbol $g1150$;
    public static SubLSymbol $g1151$;
    public static SubLSymbol $g1152$;
    public static SubLSymbol $g1153$;
    public static SubLSymbol $g1154$;
    public static SubLSymbol $g1155$;
    public static SubLSymbol $g1156$;
    public static SubLSymbol $g1157$;
    public static SubLSymbol $g1158$;
    public static SubLSymbol $g1159$;
    public static SubLSymbol $g1160$;
    public static SubLSymbol $g1161$;
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
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    
    public static SubLObject f5404(final SubLObject var1) {
        return f5405(var1);
    }
    
    public static SubLObject f5406(final SubLObject var2) {
        return f5407(var2);
    }
    
    public static SubLObject f5408(final SubLObject var2) {
        return f5409(var2);
    }
    
    public static SubLObject f5410(final SubLObject var2) {
        return Numbers.zerop(f5406(var2));
    }
    
    public static SubLObject f5411(final SubLObject var2) {
        return module0030.f1592(f5408(var2));
    }
    
    public static SubLObject f5412(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        return f5413(var2, var3, var4);
    }
    
    public static SubLObject f5414(final SubLObject var2, final SubLObject var3, SubLObject var5) {
        if (var5 == module0079.UNPROVIDED) {
            var5 = (SubLObject)module0079.NIL;
        }
        return f5415(var2, var3, var5);
    }
    
    public static SubLObject f5416(final SubLObject var2, final SubLObject var3, SubLObject var5) {
        if (var5 == module0079.UNPROVIDED) {
            var5 = (SubLObject)module0079.NIL;
        }
        return f5417(var2, var3, var5);
    }
    
    public static SubLObject f5418(final SubLObject var2, final SubLObject var3) {
        return f5419(var2, var3);
    }
    
    public static SubLObject f5420(final SubLObject var2) {
        return f5421(var2);
    }
    
    public static SubLObject f5422(final SubLObject var2, final SubLObject var3) {
        return f5423(var2, var3);
    }
    
    public static SubLObject f5424(final SubLObject var2) {
        return f5425(var2);
    }
    
    public static SubLObject f5426(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0079.$ic0$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)module0079.NIL;
        SubLObject var12 = (SubLObject)module0079.NIL;
        SubLObject var13 = (SubLObject)module0079.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0079.$ic0$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0079.$ic0$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0079.$ic0$);
        var13 = var9.first();
        var9 = var9.rest();
        SubLObject var14 = (SubLObject)module0079.NIL;
        SubLObject var15 = var9;
        SubLObject var16 = (SubLObject)module0079.NIL;
        SubLObject var14_15 = (SubLObject)module0079.NIL;
        while (module0079.NIL != var15) {
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)module0079.$ic0$);
            var14_15 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)module0079.$ic0$);
            if (module0079.NIL == conses_high.member(var14_15, (SubLObject)module0079.$ic1$, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED)) {
                var16 = (SubLObject)module0079.T;
            }
            if (var14_15 == module0079.$ic2$) {
                var14 = var15.first();
            }
            var15 = var15.rest();
        }
        if (module0079.NIL != var16 && module0079.NIL == var14) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0079.$ic0$);
        }
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0079.$ic3$, var9);
        final SubLObject var18 = (SubLObject)((module0079.NIL != var17) ? conses_high.cadr(var17) : module0079.NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0079.$ic4$, var9);
        final SubLObject var20 = (SubLObject)((module0079.NIL != var19) ? conses_high.cadr(var19) : module0079.NIL);
        final SubLObject var21;
        var9 = (var21 = var10);
        if (module0079.NIL == var20) {
            final SubLObject var22 = (SubLObject)module0079.$ic5$;
            final SubLObject var23 = (SubLObject)module0079.$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)module0079.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0079.$ic8$, var13))), (SubLObject)ConsesLow.list((SubLObject)module0079.$ic9$, (SubLObject)ConsesLow.list(var22, var23, (SubLObject)module0079.$ic3$, var18), (SubLObject)ConsesLow.listS((SubLObject)module0079.$ic10$, (SubLObject)ConsesLow.list(var11, var12), var22, ConsesLow.append(var21, (SubLObject)module0079.NIL))));
        }
        final SubLObject var24 = (SubLObject)module0079.$ic11$;
        final SubLObject var25 = (SubLObject)module0079.$ic12$;
        final SubLObject var26 = (SubLObject)module0079.$ic13$;
        final SubLObject var27 = (SubLObject)module0079.$ic14$;
        return (SubLObject)ConsesLow.list((SubLObject)module0079.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, var13), (SubLObject)ConsesLow.list(var25, var20), reader.bq_cons(var26, (SubLObject)module0079.$ic15$), (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)module0079.$ic16$, var24))), (SubLObject)ConsesLow.listS((SubLObject)module0079.$ic17$, var25, (SubLObject)module0079.$ic18$), (SubLObject)ConsesLow.list((SubLObject)module0079.$ic19$, var25, (SubLObject)ConsesLow.listS((SubLObject)module0079.$ic20$, (SubLObject)ConsesLow.list(var11, var12, var24, (SubLObject)module0079.$ic3$, var18), (SubLObject)ConsesLow.list((SubLObject)module0079.$ic21$, var26, var27), (SubLObject)ConsesLow.list((SubLObject)module0079.$ic22$, var26), ConsesLow.append(var21, (SubLObject)module0079.NIL))));
    }
    
    public static SubLObject f5427(final SubLObject var27) {
        final SubLObject var28 = f5408(var27);
        final SubLObject var29 = f5406(var27);
        return f5428(var27, var28, var29);
    }
    
    public static SubLObject f5429(final SubLObject var27, SubLObject var30) {
        if (var30 == module0079.UNPROVIDED) {
            var30 = (SubLObject)module0079.T;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = f5427(var27);
        if (module0079.NIL != var30) {
            final SubLObject var33 = f5424(var27);
            SubLObject var36;
            for (SubLObject var34 = (SubLObject)module0079.NIL; module0079.NIL == var34; var34 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var36)) {
                var31.resetMultipleValues();
                final SubLObject var35 = module0052.f3693(var33);
                var36 = var31.secondMultipleValue();
                var31.resetMultipleValues();
                if (module0079.NIL != var36) {
                    SubLObject var38;
                    final SubLObject var37 = var38 = var35;
                    SubLObject var39 = (SubLObject)module0079.NIL;
                    SubLObject var40 = (SubLObject)module0079.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0079.$ic23$);
                    var39 = var38.first();
                    var38 = var38.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0079.$ic23$);
                    var40 = var38.first();
                    var38 = var38.rest();
                    if (module0079.NIL == var38) {
                        f5412(var32, var39, var40);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0079.$ic23$);
                    }
                }
            }
        }
        return var32;
    }
    
    public static SubLObject f5430(final SubLObject var2, SubLObject var39) {
        if (var39 == module0079.UNPROVIDED) {
            var39 = (SubLObject)module0079.NIL;
        }
        if (module0079.NIL != f5410(var2)) {
            return var39;
        }
        return f5431(var2);
    }
    
    public static SubLObject f5432(final SubLObject var2, SubLObject var40) {
        if (var40 == module0079.UNPROVIDED) {
            var40 = (SubLObject)module0079.NIL;
        }
        if (module0079.NIL != f5410(var2)) {
            return var40;
        }
        return f5414(var2, f5430(var2, (SubLObject)module0079.UNPROVIDED), (SubLObject)module0079.UNPROVIDED);
    }
    
    public static SubLObject f5433(final SubLObject var2) {
        if (module0079.NIL != f5410(var2)) {
            return (SubLObject)module0079.NIL;
        }
        return f5434(var2);
    }
    
    public static SubLObject f5435(final SubLObject var2) {
        if (module0079.NIL != f5410(var2)) {
            return (SubLObject)module0079.NIL;
        }
        return f5436(var2);
    }
    
    public static SubLObject f5437(final SubLObject var2, final SubLObject var3) {
        assert module0079.NIL != f5404(var2) : var2;
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0079.ONE_INTEGER), f5414(var2, var3, (SubLObject)module0079.UNPROVIDED));
    }
    
    public static SubLObject f5438(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert module0079.NIL != f5404(var2) : var2;
        SubLObject var5 = f5416(var2, var3, (SubLObject)module0079.UNPROVIDED);
        if (!var5.isList()) {
            Errors.error((SubLObject)module0079.$ic25$, var5);
        }
        var5 = (SubLObject)ConsesLow.cons(var4, var5);
        return f5412(var2, var3, var5);
    }
    
    public static SubLObject f5439(final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var28, SubLObject var42) {
        if (var28 == module0079.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0079.EQL);
        }
        if (var42 == module0079.UNPROVIDED) {
            var42 = Symbols.symbol_function((SubLObject)module0079.IDENTITY);
        }
        assert module0079.NIL != f5404(var2) : var2;
        SubLObject var43 = f5416(var2, var3, (SubLObject)module0079.UNPROVIDED);
        if (!var43.isList()) {
            Errors.error((SubLObject)module0079.$ic25$, var43);
        }
        if (module0079.NIL == conses_high.member(var4, var43, var28, var42)) {
            var43 = (SubLObject)ConsesLow.cons(var4, var43);
        }
        return f5412(var2, var3, var43);
    }
    
    public static SubLObject f5440(final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var28, SubLObject var42) {
        if (var28 == module0079.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0079.EQL);
        }
        if (var42 == module0079.UNPROVIDED) {
            var42 = Symbols.symbol_function((SubLObject)module0079.IDENTITY);
        }
        assert module0079.NIL != f5404(var2) : var2;
        SubLObject var43 = (SubLObject)module0079.NIL;
        final SubLObject var44 = f5416(var2, var3, (SubLObject)module0079.UNPROVIDED);
        if (var44.isCons()) {
            final SubLObject var45 = Sequences.position(var4, var44, var28, var42, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED);
            if (module0079.NIL != var45) {
                var43 = ConsesLow.nth(var45, var44);
                final SubLObject var46 = Sequences.delete(var4, var44, var28, var42, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED);
                if (module0079.NIL == var46) {
                    f5418(var2, var3);
                }
                else {
                    f5412(var2, var3, var46);
                }
            }
        }
        else if (module0079.NIL == var44) {
            var43 = (SubLObject)module0079.NIL;
        }
        else {
            Errors.error((SubLObject)module0079.$ic26$, var44);
        }
        return var43;
    }
    
    public static SubLObject f5441(final SubLObject var2, final SubLObject var3, SubLObject var47) {
        if (var47 == module0079.UNPROVIDED) {
            var47 = (SubLObject)module0079.ONE_INTEGER;
        }
        SubLObject var48 = f5414(var2, var3, (SubLObject)module0079.ZERO_INTEGER);
        if (var48.isNumber()) {
            var48 = Numbers.add(var48, var47);
        }
        else {
            var48 = var47;
        }
        f5412(var2, var3, var48);
        return var48;
    }
    
    public static SubLObject f5442(final SubLObject var2, final SubLObject var3, SubLObject var47) {
        if (var47 == module0079.UNPROVIDED) {
            var47 = (SubLObject)module0079.ONE_INTEGER;
        }
        if (!var47.isNegative()) {
            var47 = Numbers.minus(var47);
        }
        return f5441(var2, var3, var47);
    }
    
    public static SubLObject f5443(final SubLObject var2, final SubLObject var48, SubLObject var49, SubLObject var50) {
        if (var49 == module0079.UNPROVIDED) {
            var49 = (SubLObject)module0079.NIL;
        }
        if (var50 == module0079.UNPROVIDED) {
            var50 = (SubLObject)module0079.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        final SubLObject var52 = f5424(var2);
        SubLObject var55;
        for (SubLObject var53 = (SubLObject)module0079.NIL; module0079.NIL == var53; var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var55)) {
            var51.resetMultipleValues();
            final SubLObject var54 = module0052.f3693(var52);
            var55 = var51.secondMultipleValue();
            var51.resetMultipleValues();
            if (module0079.NIL != var55) {
                SubLObject var57;
                final SubLObject var56 = var57 = var54;
                SubLObject var58 = (SubLObject)module0079.NIL;
                SubLObject var59 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0079.$ic23$);
                var58 = var57.first();
                var57 = var57.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0079.$ic23$);
                var59 = var57.first();
                var57 = var57.rest();
                if (module0079.NIL == var57) {
                    if (module0079.NIL != var50 && var59.isCons()) {
                        SubLObject var60 = var59;
                        SubLObject var61 = (SubLObject)module0079.NIL;
                        var61 = var60.first();
                        while (module0079.NIL != var60) {
                            f5444(var48, var58, var61, var49);
                            var60 = var60.rest();
                            var61 = var60.first();
                        }
                    }
                    else {
                        f5444(var48, var58, var59, var49);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)module0079.$ic23$);
                }
            }
        }
        return var48;
    }
    
    public static SubLObject f5444(final SubLObject var48, final SubLObject var3, final SubLObject var4, final SubLObject var49) {
        return f5445(var48, var4, var3, var49);
    }
    
    public static SubLObject f5445(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var49) {
        if (module0079.NIL != var49) {
            f5438(var2, var3, var4);
        }
        else {
            f5412(var2, var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f5446(final SubLObject var2, SubLObject var28) {
        if (var28 == module0079.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0079.IDENTITY);
        }
        return f5447(f5429(var2, (SubLObject)module0079.UNPROVIDED), var28);
    }
    
    public static SubLObject f5447(final SubLObject var2, SubLObject var28) {
        if (var28 == module0079.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0079.$ic27$);
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0079.NIL;
        final SubLObject var31 = f5424(var2);
        SubLObject var34;
        for (SubLObject var32 = (SubLObject)module0079.NIL; module0079.NIL == var32; var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var34)) {
            var29.resetMultipleValues();
            final SubLObject var33 = module0052.f3693(var31);
            var34 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            if (module0079.NIL != var34) {
                SubLObject var36;
                final SubLObject var35 = var36 = var33;
                SubLObject var37 = (SubLObject)module0079.NIL;
                SubLObject var38 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0079.$ic23$);
                var37 = var36.first();
                var36 = var36.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0079.$ic23$);
                var38 = var36.first();
                var36 = var36.rest();
                if (module0079.NIL == var36) {
                    if (module0079.NIL == Functions.funcall(var28, var38)) {
                        var30 = (SubLObject)ConsesLow.cons(var37, var30);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0079.$ic23$);
                }
            }
        }
        return f5448(var2, var30);
    }
    
    public static SubLObject f5448(final SubLObject var2, final SubLObject var55) {
        SubLObject var56 = var55;
        SubLObject var57 = (SubLObject)module0079.NIL;
        var57 = var56.first();
        while (module0079.NIL != var56) {
            f5418(var2, var57);
            var56 = var56.rest();
            var57 = var56.first();
        }
        return var2;
    }
    
    public static SubLObject f5449(final SubLObject var27, SubLObject var58, SubLObject var32) {
        if (var32 == module0079.UNPROVIDED) {
            var32 = (SubLObject)module0079.NIL;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0079.NIL == Errors.$ignore_mustsP$.getDynamicValue(var59) && !var58.numLE((SubLObject)module0079.$ic28$)) {
            Errors.error((SubLObject)module0079.$ic29$);
        }
        if (module0079.ONE_INTEGER.numL(var58)) {
            var58 = Numbers.divide(var58, (SubLObject)module0079.$ic28$);
        }
        final SubLObject var60 = Numbers.floor(Numbers.multiply(f5406(var27), var58), (SubLObject)module0079.UNPROVIDED);
        SubLObject var61 = (SubLObject)module0079.NIL;
        if (module0079.NIL == f5404(var32)) {
            var32 = f5428(var27, f5408(var27), var60);
        }
        final SubLObject var62 = f5424(var27);
        SubLObject var65;
        for (SubLObject var63 = var61; module0079.NIL == var63; var63 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var65 || module0079.NIL != var61)) {
            var59.resetMultipleValues();
            final SubLObject var64 = module0052.f3693(var62);
            var65 = var59.secondMultipleValue();
            var59.resetMultipleValues();
            if (module0079.NIL != var65) {
                SubLObject var67;
                final SubLObject var66 = var67 = var64;
                SubLObject var68 = (SubLObject)module0079.NIL;
                SubLObject var69 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0079.$ic23$);
                var68 = var67.first();
                var67 = var67.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0079.$ic23$);
                var69 = var67.first();
                var67 = var67.rest();
                if (module0079.NIL == var67) {
                    f5412(var32, var68, var69);
                    var61 = Numbers.numG(f5406(var32), var60);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0079.$ic23$);
                }
            }
        }
        return var32;
    }
    
    public static SubLObject f5450(final SubLObject var63, final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0079.NIL == Errors.$ignore_mustsP$.getDynamicValue(var65) && !f5408(var63).eql(f5408(var64))) {
            Errors.error((SubLObject)module0079.$ic30$);
        }
        final SubLObject var66 = f5408(var63);
        final SubLObject var67 = module0077.f5313(var66, (SubLObject)module0079.UNPROVIDED);
        final SubLObject var68 = module0077.f5313(var66, (SubLObject)module0079.UNPROVIDED);
        SubLObject var69 = (SubLObject)module0079.NIL;
        final SubLObject var70 = f5424(var63);
        SubLObject var73;
        for (SubLObject var71 = (SubLObject)module0079.NIL; module0079.NIL == var71; var71 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var73)) {
            var65.resetMultipleValues();
            final SubLObject var72 = module0052.f3693(var70);
            var73 = var65.secondMultipleValue();
            var65.resetMultipleValues();
            if (module0079.NIL != var73) {
                SubLObject var75;
                final SubLObject var74 = var75 = var72;
                SubLObject var76 = (SubLObject)module0079.NIL;
                SubLObject var77 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var75, var74, (SubLObject)module0079.$ic23$);
                var76 = var75.first();
                var75 = var75.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var75, var74, (SubLObject)module0079.$ic23$);
                var77 = var75.first();
                var75 = var75.rest();
                if (module0079.NIL == var75) {
                    if (module0079.NIL != f5437(var64, var76)) {
                        module0077.f5326(var76, var68);
                    }
                    else {
                        module0077.f5326(var76, var67);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var74, (SubLObject)module0079.$ic23$);
                }
            }
        }
        final SubLObject var78 = module0078.f5367(f5433(var64), (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED);
        var69 = module0078.f5357(var78, var68);
        return Values.values(var67, var69, var68);
    }
    
    public static SubLObject f5451(final SubLObject var63, final SubLObject var64, SubLObject var71) {
        if (var71 == module0079.UNPROVIDED) {
            var71 = (SubLObject)module0079.EQUAL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)module0079.NIL;
        var72.resetMultipleValues();
        final SubLObject var74 = f5450(var63, var64);
        final SubLObject var75 = var72.secondMultipleValue();
        final SubLObject var76 = var72.thirdMultipleValue();
        var72.resetMultipleValues();
        var73 = module0077.f5313(module0077.f5315(var76), (SubLObject)module0079.UNPROVIDED);
        final SubLObject var77 = module0077.f5333(var76);
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        SubLObject var82;
        for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0079.NIL, var79 = module0032.f1742(var78, var77); module0079.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
            var80 = module0032.f1745(var78, var79);
            if (module0079.NIL != module0032.f1746(var79, var80)) {
                var81 = f5414(var63, var80, (SubLObject)module0079.UNPROVIDED);
                var82 = f5414(var64, var80, (SubLObject)module0079.UNPROVIDED);
                if (module0079.NIL == Functions.funcall(var71, var81, var82)) {
                    module0077.f5326(var80, var73);
                }
            }
        }
        return Values.values(var74, var75, var73);
    }
    
    public static SubLObject f5452(final SubLObject var2, final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        final SubLObject var84 = f5427(var2);
        final SubLObject var85 = f5424(var2);
        SubLObject var88;
        for (SubLObject var86 = (SubLObject)module0079.NIL; module0079.NIL == var86; var86 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var88)) {
            var83.resetMultipleValues();
            final SubLObject var87 = module0052.f3693(var85);
            var88 = var83.secondMultipleValue();
            var83.resetMultipleValues();
            if (module0079.NIL != var88) {
                SubLObject var90;
                final SubLObject var89 = var90 = var87;
                SubLObject var91 = (SubLObject)module0079.NIL;
                SubLObject var92 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)module0079.$ic31$);
                var91 = var90.first();
                var90 = var90.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)module0079.$ic31$);
                var92 = var90.first();
                var90 = var90.rest();
                if (module0079.NIL == var90) {
                    final SubLObject var93 = Functions.funcall(var82, var92);
                    f5412(var84, var91, var93);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)module0079.$ic31$);
                }
            }
        }
        return var84;
    }
    
    public static SubLObject f5453(final SubLObject var2, final SubLObject var86) {
        SubLObject var88;
        final SubLObject var87 = var88 = f5433(var2);
        SubLObject var89 = (SubLObject)module0079.NIL;
        var89 = var88.first();
        while (module0079.NIL != var88) {
            final SubLObject var90 = f5414(var2, var89, (SubLObject)module0079.UNPROVIDED);
            final SubLObject var91 = Functions.funcall(var86, var90);
            f5412(var2, var89, var91);
            var88 = var88.rest();
            var89 = var88.first();
        }
        return var2;
    }
    
    public static SubLObject f5454(final SubLObject var2) {
        assert module0079.NIL != f5404(var2) : var2;
        final SubLObject var3 = f5408(var2);
        final SubLObject var4 = f5406(var2);
        final SubLObject var5 = module0067.f4880(var3, var4);
        return f5455(var2, var5, (SubLObject)module0079.NIL);
    }
    
    public static SubLObject f5456(final SubLObject var2) {
        assert module0079.NIL != f5404(var2) : var2;
        final SubLObject var3 = f5408(var2);
        final SubLObject var4 = f5406(var2);
        final SubLObject var5 = Hashtables.make_hash_table(var4, var3, (SubLObject)module0079.UNPROVIDED);
        return f5455(var2, var5, (SubLObject)module0079.NIL);
    }
    
    public static SubLObject f5455(final SubLObject var90, final SubLObject var91, SubLObject var49) {
        if (var49 == module0079.UNPROVIDED) {
            var49 = (SubLObject)module0079.NIL;
        }
        final SubLThread var92 = SubLProcess.currentSubLThread();
        assert module0079.NIL != f5404(var90) : var90;
        assert module0079.NIL != f5404(var91) : var91;
        final SubLObject var93 = f5424(var90);
        SubLObject var96;
        for (SubLObject var94 = (SubLObject)module0079.NIL; module0079.NIL == var94; var94 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var96)) {
            var92.resetMultipleValues();
            final SubLObject var95 = module0052.f3693(var93);
            var96 = var92.secondMultipleValue();
            var92.resetMultipleValues();
            if (module0079.NIL != var96) {
                SubLObject var98;
                final SubLObject var97 = var98 = var95;
                SubLObject var99 = (SubLObject)module0079.NIL;
                SubLObject var100 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var98, var97, (SubLObject)module0079.$ic32$);
                var99 = var98.first();
                var98 = var98.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var98, var97, (SubLObject)module0079.$ic32$);
                var100 = var98.first();
                var98 = var98.rest();
                if (module0079.NIL == var98) {
                    f5445(var91, var99, var100, var49);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var97, (SubLObject)module0079.$ic32$);
                }
            }
        }
        return var91;
    }
    
    public static SubLObject f5405(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1148$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5457(final SubLObject var1) {
        return (SubLObject)module0079.T;
    }
    
    public static SubLObject f5458(final SubLObject var1) {
        return (SubLObject)module0079.T;
    }
    
    public static SubLObject f5459(final SubLObject var1) {
        return (SubLObject)module0079.T;
    }
    
    public static SubLObject f5407(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1149$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5460(final SubLObject var1) {
        return module0067.f4861(var1);
    }
    
    public static SubLObject f5461(final SubLObject var1) {
        return Hashtables.hash_table_count(var1);
    }
    
    public static SubLObject f5462(final SubLObject var1) {
        return module0077.f5311(var1);
    }
    
    public static SubLObject f5409(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1150$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5463(final SubLObject var1) {
        return module0067.f4854(var1);
    }
    
    public static SubLObject f5464(final SubLObject var1) {
        return Hashtables.hash_table_test(var1);
    }
    
    public static SubLObject f5465(final SubLObject var1) {
        return module0077.f5315(var1);
    }
    
    public static SubLObject f5413(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = Structures.method_func(var1, module0079.$g1151$.getGlobalValue());
        if (module0079.NIL != var5) {
            return Functions.funcall(var5, var1, var3, var4);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5466(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        return module0067.f4886(var1, var3, var4);
    }
    
    public static SubLObject f5467(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        return Hashtables.sethash(var3, var1, var4);
    }
    
    public static SubLObject f5468(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        return module0077.f5326(var3, var1);
    }
    
    public static SubLObject f5415(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        final SubLObject var6 = Structures.method_func(var1, module0079.$g1152$.getGlobalValue());
        if (module0079.NIL != var6) {
            return Functions.funcall(var6, var1, var3, var5);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5469(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        return module0067.f4884(var1, var3, var5);
    }
    
    public static SubLObject f5470(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        return Hashtables.gethash(var3, var1, var5);
    }
    
    public static SubLObject f5471(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        final SubLObject var6 = module0077.f5320(var3, var1);
        return Values.values((module0079.NIL != var6) ? var3 : var5, var6);
    }
    
    public static SubLObject f5417(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        final SubLObject var6 = Structures.method_func(var1, module0079.$g1153$.getGlobalValue());
        if (module0079.NIL != var6) {
            return Functions.funcall(var6, var1, var3, var5);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5472(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        return module0067.f4885(var1, var3, var5);
    }
    
    public static SubLObject f5473(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        return Hashtables.gethash_without_values(var3, var1, var5);
    }
    
    public static SubLObject f5474(final SubLObject var1, final SubLObject var3, final SubLObject var5) {
        return (module0079.NIL != module0077.f5320(var3, var1)) ? var3 : var5;
    }
    
    public static SubLObject f5419(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = Structures.method_func(var2, module0079.$g1154$.getGlobalValue());
        if (module0079.NIL != var4) {
            return Functions.funcall(var4, var2, var3);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var2);
    }
    
    public static SubLObject f5475(final SubLObject var1, final SubLObject var3) {
        return module0067.f4887(var1, var3);
    }
    
    public static SubLObject f5476(final SubLObject var1, final SubLObject var3) {
        return Hashtables.remhash(var3, var1);
    }
    
    public static SubLObject f5477(final SubLObject var1, final SubLObject var3) {
        return module0077.f5327(var3, var1);
    }
    
    public static SubLObject f5423(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = Structures.method_func(var2, module0079.$g1155$.getGlobalValue());
        if (module0079.NIL != var4) {
            return Functions.funcall(var4, var2, var3);
        }
        if (module0079.NIL != f5404(var2)) {
            return (SubLObject)module0079.NIL;
        }
        Errors.error((SubLObject)module0079.$ic37$, var2);
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5428(final SubLObject var27, final SubLObject var28, final SubLObject var29) {
        final SubLObject var30 = Structures.method_func(var27, module0079.$g1156$.getGlobalValue());
        if (module0079.NIL != var30) {
            return Functions.funcall(var30, var27, var28, var29);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var27);
    }
    
    public static SubLObject f5478(final SubLObject var1, final SubLObject var28, final SubLObject var29) {
        return module0067.f4880(var28, var29);
    }
    
    public static SubLObject f5479(final SubLObject var1, final SubLObject var28, final SubLObject var29) {
        return Hashtables.make_hash_table(var29, var28, (SubLObject)module0079.UNPROVIDED);
    }
    
    public static SubLObject f5480(final SubLObject var1, final SubLObject var28, final SubLObject var29) {
        return module0077.f5313(var28, var29);
    }
    
    public static SubLObject f5431(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, module0079.$g1157$.getGlobalValue());
        if (module0079.NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var2);
    }
    
    public static SubLObject f5481(final SubLObject var1) {
        return module0084.f5759(var1);
    }
    
    public static SubLObject f5482(final SubLObject var1) {
        return module0030.f1598(var1);
    }
    
    public static SubLObject f5483(final SubLObject var1) {
        return module0078.f5343(var1);
    }
    
    public static SubLObject f5425(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1158$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5484(final SubLObject var1) {
        return module0067.f4889(var1);
    }
    
    public static SubLObject f5485(final SubLObject var1) {
        return module0052.f3732(var1);
    }
    
    public static SubLObject f5486(final SubLObject var1) {
        return f5487(var1);
    }
    
    public static SubLObject f5487(final SubLObject var107) {
        assert module0079.NIL != module0077.f5302(var107) : var107;
        return module0052.f3689(f5488(var107), (SubLObject)module0079.$ic66$, (SubLObject)module0079.$ic67$, (SubLObject)module0079.UNPROVIDED);
    }
    
    public static SubLObject f5488(final SubLObject var107) {
        final SubLObject var108 = module0077.f5329(var107);
        return (SubLObject)ConsesLow.list(var108, var107);
    }
    
    public static SubLObject f5489(final SubLObject var109) {
        SubLObject var108_112 = (SubLObject)module0079.NIL;
        SubLObject var110 = (SubLObject)module0079.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)module0079.$ic68$);
        var108_112 = var109.first();
        SubLObject var111 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var111, var109, (SubLObject)module0079.$ic68$);
        var110 = var111.first();
        var111 = var111.rest();
        if (module0079.NIL == var111) {
            return module0052.f3687(var108_112);
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)module0079.$ic68$);
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5490(final SubLObject var109) {
        SubLObject var108_115 = (SubLObject)module0079.NIL;
        SubLObject var110 = (SubLObject)module0079.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)module0079.$ic68$);
        var108_115 = var109.first();
        SubLObject var111 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var111, var109, (SubLObject)module0079.$ic68$);
        var110 = var111.first();
        var111 = var111.rest();
        if (module0079.NIL == var111) {
            final SubLObject var113;
            final SubLObject var112 = var113 = module0052.f3693(var108_115);
            final SubLObject var114 = (SubLObject)ConsesLow.list(var112, var113);
            if (module0079.NIL != module0052.f3687(var108_115)) {
                ConsesLow.set_nth((SubLObject)module0079.ONE_INTEGER, var109, (SubLObject)module0079.$ic69$);
            }
            return Values.values(var114, var109);
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)module0079.$ic68$);
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5421(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1159$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5491(final SubLObject var1) {
        return module0067.f4881(var1);
    }
    
    public static SubLObject f5492(final SubLObject var1) {
        return Hashtables.clrhash(var1);
    }
    
    public static SubLObject f5493(final SubLObject var1) {
        return module0077.f5328(var1);
    }
    
    public static SubLObject f5434(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1160$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        if (module0079.NIL != f5404(var1)) {
            return f5494(var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5494(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = (SubLObject)ConsesLow.make_list(f5406(var2), (SubLObject)module0079.UNPROVIDED);
        final SubLObject var6 = f5424(var2);
        SubLObject var9;
        for (SubLObject var7 = (SubLObject)module0079.NIL; module0079.NIL == var7; var7 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var9)) {
            var3.resetMultipleValues();
            final SubLObject var8 = module0052.f3693(var6);
            var9 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (module0079.NIL != var9) {
                SubLObject var11;
                final SubLObject var10 = var11 = var8;
                SubLObject var12 = (SubLObject)module0079.NIL;
                SubLObject var13 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0079.$ic23$);
                var12 = var11.first();
                var11 = var11.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0079.$ic23$);
                var13 = var11.first();
                var11 = var11.rest();
                if (module0079.NIL == var11) {
                    ConsesLow.rplaca(var5, var12);
                    var5 = var5.rest();
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)module0079.$ic23$);
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f5495(final SubLObject var1) {
        return module0067.f4902(var1);
    }
    
    public static SubLObject f5496(final SubLObject var1) {
        return module0030.f1625(var1);
    }
    
    public static SubLObject f5497(final SubLObject var1) {
        return module0077.f5312(var1);
    }
    
    public static SubLObject f5436(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, module0079.$g1161$.getGlobalValue());
        if (module0079.NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        if (module0079.NIL != f5404(var1)) {
            return f5498(var1);
        }
        return Errors.error((SubLObject)module0079.$ic37$, var1);
    }
    
    public static SubLObject f5498(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = (SubLObject)ConsesLow.make_list(f5406(var2), (SubLObject)module0079.UNPROVIDED);
        final SubLObject var6 = f5424(var2);
        SubLObject var9;
        for (SubLObject var7 = (SubLObject)module0079.NIL; module0079.NIL == var7; var7 = (SubLObject)SubLObjectFactory.makeBoolean(module0079.NIL == var9)) {
            var3.resetMultipleValues();
            final SubLObject var8 = module0052.f3693(var6);
            var9 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (module0079.NIL != var9) {
                SubLObject var11;
                final SubLObject var10 = var11 = var8;
                SubLObject var12 = (SubLObject)module0079.NIL;
                SubLObject var13 = (SubLObject)module0079.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0079.$ic23$);
                var12 = var11.first();
                var11 = var11.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0079.$ic23$);
                var13 = var11.first();
                var11 = var11.rest();
                if (module0079.NIL == var11) {
                    ConsesLow.rplaca(var5, var13);
                    var5 = var5.rest();
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)module0079.$ic23$);
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f5499(final SubLObject var1) {
        return module0067.f4903(var1);
    }
    
    public static SubLObject f5500(final SubLObject var1) {
        return module0030.f1627(var1);
    }
    
    public static SubLObject f5501(final SubLObject var1) {
        return module0077.f5312(var1);
    }
    
    public static SubLObject f5502(final SubLObject var28, final SubLObject var128) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = Hashtables.make_hash_table(Sequences.length(var128), var28, (SubLObject)module0079.UNPROVIDED);
        final SubLObject var131 = Sequences.remove_duplicates(var128, var28, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED, (SubLObject)module0079.UNPROVIDED);
        SubLObject var132 = var128;
        SubLObject var133 = (SubLObject)module0079.NIL;
        var133 = var132.first();
        while (module0079.NIL != var132) {
            Hashtables.sethash(var133, var130, (SubLObject)module0079.$ic87$);
            var132 = var132.rest();
            var133 = var132.first();
        }
        final SubLObject var134 = Sequences.length(var131);
        final SubLObject var135 = Hashtables.hash_table_count(var130);
        if (module0079.NIL == Errors.$ignore_mustsP$.getDynamicValue(var129) && !var134.numE(var135)) {
            Errors.error((SubLObject)module0079.$ic88$, var134, var135);
        }
        return (SubLObject)module0079.$ic89$;
    }
    
    public static SubLObject f5503() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5404", "S#3046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5406", "S#3047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5408", "S#7020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5410", "S#7021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5411", "S#7022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5412", "S#6286", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5414", "S#6285", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5416", "S#7023", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5418", "S#7024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5420", "S#7025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5422", "S#7026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5424", "S#6287", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0079", "f5426", "S#7027");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5427", "S#7028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5429", "S#7029", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5430", "S#7030", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5432", "S#7031", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5433", "S#7032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5435", "S#7033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5437", "S#7034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5438", "S#7035", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5439", "S#7036", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5440", "S#7037", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5441", "S#7038", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5442", "S#7039", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5443", "S#7040", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5444", "S#7041", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5445", "S#7042", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5446", "S#7043", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5447", "S#7044", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5448", "S#7045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5449", "S#7046", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5450", "S#7047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5451", "S#7048", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5452", "S#7049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5453", "S#7050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5454", "S#7051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5456", "S#7052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5455", "S#7053", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5405", "S#7054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5457", "S#7055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5458", "S#7056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5459", "S#7057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5407", "S#7058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5460", "S#7059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5461", "S#7060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5462", "S#7061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5409", "S#7062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5463", "S#7063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5464", "S#7064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5465", "S#7065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5413", "S#7066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5466", "S#7067", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5467", "S#7068", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5468", "S#7069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5415", "S#7070", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5469", "S#7071", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5470", "S#7072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5471", "S#7073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5417", "S#7074", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5472", "S#7075", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5473", "S#7076", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5474", "S#7077", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5419", "S#7078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5475", "S#7079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5476", "S#7080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5477", "S#7081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5423", "S#7082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5428", "S#7083", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5478", "S#7084", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5479", "S#7085", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5480", "S#7086", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5431", "S#7087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5481", "S#7088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5482", "S#7089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5483", "S#7090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5425", "S#7091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5484", "S#7092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5485", "S#7093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5486", "S#7094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5487", "S#7095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5488", "S#7096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5489", "S#7097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5490", "S#7098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5421", "S#7099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5491", "S#7100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5492", "S#7101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5493", "S#7102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5434", "S#7103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5494", "S#7104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5495", "S#7105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5496", "S#7106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5497", "S#7107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5436", "S#7108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5498", "S#7109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5499", "S#7110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5500", "S#7111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5501", "S#7112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0079", "f5502", "S#7113", 2, 0, false);
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5504() {
        module0079.$g1148$ = SubLFiles.deflexical("S#7114", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1149$ = SubLFiles.deflexical("S#7115", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1150$ = SubLFiles.deflexical("S#7116", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1151$ = SubLFiles.deflexical("S#7117", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1152$ = SubLFiles.deflexical("S#7118", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1153$ = SubLFiles.deflexical("S#7119", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1154$ = SubLFiles.deflexical("S#7120", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1155$ = SubLFiles.deflexical("S#7121", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1156$ = SubLFiles.deflexical("S#7122", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1157$ = SubLFiles.deflexical("S#7123", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1158$ = SubLFiles.deflexical("S#7124", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1159$ = SubLFiles.deflexical("S#7125", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1160$ = SubLFiles.deflexical("S#7126", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        module0079.$g1161$ = SubLFiles.deflexical("S#7127", Vectors.make_vector((SubLObject)module0079.$ic33$, (SubLObject)module0079.NIL));
        return (SubLObject)module0079.NIL;
    }
    
    public static SubLObject f5505() {
        Structures.register_method(module0079.$g1148$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic34$));
        Structures.register_method(module0079.$g1148$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic35$));
        Structures.register_method(module0079.$g1148$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic36$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic38$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic39$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic40$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic41$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic42$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic43$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic44$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic45$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic46$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic47$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic48$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic49$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic50$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic51$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic52$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic53$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic54$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic55$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic56$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic57$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic58$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic59$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic60$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic61$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic62$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic63$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic64$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic70$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic71$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic72$));
        Structures.register_method(module0079.$g1160$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic73$));
        Structures.register_method(module0079.$g1160$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic74$));
        Structures.register_method(module0079.$g1160$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic75$));
        Structures.register_method(module0079.$g1161$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic76$));
        Structures.register_method(module0079.$g1161$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic77$));
        Structures.register_method(module0079.$g1161$.getGlobalValue(), module0077.$g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0079.$ic78$));
        module0027.f1449((SubLObject)module0079.$ic79$, (SubLObject)ConsesLow.list(new SubLObject[] { module0079.$ic80$, module0079.NIL, module0079.$ic81$, module0079.NIL, module0079.$ic82$, module0079.NIL, module0079.$ic83$, module0079.$ic84$, module0079.$ic85$, module0079.T }), (SubLObject)module0079.$ic86$);
        return (SubLObject)module0079.NIL;
    }
    
    public void declareFunctions() {
        f5503();
    }
    
    public void initializeVariables() {
        f5504();
    }
    
    public void runTopLevelForms() {
        f5505();
    }
    
    static {
        me = (SubLFile)new module0079();
        module0079.$g1148$ = null;
        module0079.$g1149$ = null;
        module0079.$g1150$ = null;
        module0079.$g1151$ = null;
        module0079.$g1152$ = null;
        module0079.$g1153$ = null;
        module0079.$g1154$ = null;
        module0079.$g1155$ = null;
        module0079.$g1156$ = null;
        module0079.$g1157$ = null;
        module0079.$g1158$ = null;
        module0079.$g1159$ = null;
        module0079.$g1160$ = null;
        module0079.$g1161$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("DONE");
        $ic4$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic5$ = SubLObjectFactory.makeUninternedSymbol("US#506B097");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic7$ = SubLObjectFactory.makeSymbol("CLET");
        $ic8$ = SubLObjectFactory.makeSymbol("S#6287", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#5129", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic11$ = SubLObjectFactory.makeUninternedSymbol("US#132C61E");
        $ic12$ = SubLObjectFactory.makeUninternedSymbol("US#71668C4");
        $ic13$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic14$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic15$ = ConsesLow.list((SubLObject)module0079.ZERO_INTEGER);
        $ic16$ = SubLObjectFactory.makeSymbol("S#3047", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic19$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic20$ = SubLObjectFactory.makeSymbol("S#7027", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic22$ = SubLObjectFactory.makeSymbol("CINC");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#3046", "CYC");
        $ic25$ = SubLObjectFactory.makeString("Invalid map format: Attempting to push values on a non listp ~a.~%");
        $ic26$ = SubLObjectFactory.makeString("Corrupted map; attempting to remove a value from a non-LISTP ~a.~%");
        $ic27$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic28$ = SubLObjectFactory.makeInteger(100);
        $ic29$ = SubLObjectFactory.makeString("Error, percentage ~A is not one of 0-100 or 0-1.");
        $ic30$ = SubLObjectFactory.makeString("Cannot compute key differences in the face of unclear key equality.");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7128", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"));
        $ic33$ = SubLObjectFactory.makeInteger(256);
        $ic34$ = SubLObjectFactory.makeSymbol("S#7055", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#7056", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#7057", "CYC");
        $ic37$ = SubLObjectFactory.makeString("~A is not a MAP-P.");
        $ic38$ = SubLObjectFactory.makeSymbol("S#7059", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#7060", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#7061", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#7063", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#7064", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#7065", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#7067", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#7068", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#7069", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#7071", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#7072", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#7073", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#7075", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#7076", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#7077", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#7079", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#7080", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#7081", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#7084", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#7085", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#7086", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#7088", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#7089", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#7090", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#7092", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#7093", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#7094", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#6920", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#7097", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#7098", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7129", "CYC"));
        $ic69$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic70$ = SubLObjectFactory.makeSymbol("S#7100", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#7101", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#7102", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#7105", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#7106", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#7107", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#7110", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#7111", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#7112", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#7113", "CYC");
        $ic80$ = SubLObjectFactory.makeKeyword("TEST");
        $ic81$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic82$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic83$ = SubLObjectFactory.makeKeyword("KB");
        $ic84$ = SubLObjectFactory.makeKeyword("TINY");
        $ic85$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0079.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sea"), (SubLObject)SubLObjectFactory.makeString("sea"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0079.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0079.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("sea"), SubLObjectFactory.makeString("central") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0079.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic87$ = SubLObjectFactory.makeKeyword("PRESENT");
        $ic88$ = SubLObjectFactory.makeString("Expected ~A entries, but got ~A.");
        $ic89$ = SubLObjectFactory.makeKeyword("SUCCESS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0079.class
	Total time: 263 ms
	
	Decompiled with Procyon 0.5.32.
*/