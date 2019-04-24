package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0027 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0027";
    public static final String myFingerPrint = "06834de158dd0203e49354e6e94b9570e853036ac9eb1388d3b8cc6739ad437d";
    private static SubLSymbol $g828$;
    private static SubLSymbol $g829$;
    private static SubLSymbol $g830$;
    private static SubLSymbol $g831$;
    private static SubLSymbol $g832$;
    private static SubLSymbol $g833$;
    public static SubLSymbol $g834$;
    private static SubLSymbol $g837$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
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
    private static final SubLSymbol $ic33$;
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
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    
    
    public static SubLObject f1398() {
        return module0027.$g829$.getGlobalValue();
    }
    
    public static SubLObject f1399(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0027.ZERO_INTEGER);
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1400(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2524_native.class) ? module0027.T : module0027.NIL);
    }
    
    public static SubLObject f1401(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1402(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f1403(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f1404(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f1405(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f1406(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f1407(final SubLObject var1) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f1408(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1409(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f1410(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f1411(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f1412(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f1413(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f1414(final SubLObject var1, final SubLObject var4) {
        assert module0027.NIL != f1400(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f1415(SubLObject var5) {
        if (var5 == module0027.UNPROVIDED) {
            var5 = (SubLObject)module0027.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2524_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0027.NIL, var7 = var5; module0027.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0027.$ic30$)) {
                f1408(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic31$)) {
                f1409(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic32$)) {
                f1410(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic33$)) {
                f1411(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic34$)) {
                f1412(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic35$)) {
                f1413(var6, var9);
            }
            else if (var10.eql((SubLObject)module0027.$ic36$)) {
                f1414(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0027.$ic37$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1416(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic38$, (SubLObject)module0027.$ic39$, (SubLObject)module0027.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic30$, f1401(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic31$, f1402(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic32$, f1403(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic33$, f1404(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic34$, f1405(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic35$, f1406(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic40$, (SubLObject)module0027.$ic36$, f1407(var11));
        Functions.funcall(var12, var11, (SubLObject)module0027.$ic41$, (SubLObject)module0027.$ic39$, (SubLObject)module0027.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f1417(final SubLObject var11, final SubLObject var12) {
        return f1416(var11, var12);
    }
    
    public static SubLObject f1418(final SubLObject var13, final SubLObject var14, SubLObject var15, final SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var17 == module0027.UNPROVIDED) {
            var17 = (SubLObject)module0027.NIL;
        }
        if (var18 == module0027.UNPROVIDED) {
            var18 = (SubLObject)module0027.$ic43$;
        }
        if (var19 == module0027.UNPROVIDED) {
            var19 = (SubLObject)module0027.T;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0027.NIL == var15) {
            var15 = Symbols.symbol_function((SubLObject)module0027.EQUAL);
        }
        assert module0027.NIL != f1419(var13) : var13;
        assert module0027.NIL != Types.listp(var14) : var14;
        assert module0027.NIL != Types.function_spec_p(var15) : var15;
        if (module0027.NIL != var16 && !module0027.areAssertionsDisabledFor(me) && module0027.NIL == Types.stringp(var16)) {
            throw new AssertionError(var16);
        }
        if (module0027.NIL != var17 && !module0027.areAssertionsDisabledFor(me) && module0027.NIL == Types.listp(var17)) {
            throw new AssertionError(var17);
        }
        assert module0027.NIL != module0029.f1472(var18) : var18;
        SubLObject var21 = var14;
        SubLObject var22 = (SubLObject)module0027.NIL;
        var22 = var21.first();
        while (module0027.NIL != var21) {
            if (module0027.NIL == Errors.$ignore_mustsP$.getDynamicValue(var20) && (!var22.isCons() || !Sequences.length(var22).numGE((SubLObject)module0027.TWO_INTEGER))) {
                Errors.error((SubLObject)module0027.$ic49$, var22);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        final SubLObject var23 = f1415((SubLObject)module0027.UNPROVIDED);
        f1408(var23, var13);
        f1409(var23, var14);
        f1410(var23, var15);
        f1411(var23, var16);
        f1412(var23, var17);
        f1413(var23, var18);
        f1414(var23, var19);
        return var23;
    }
    
    public static SubLObject f1420(final SubLObject var23) {
        return f1401(var23);
    }
    
    public static SubLObject f1421(final SubLObject var23) {
        return f1402(var23);
    }
    
    public static SubLObject f1422(final SubLObject var23) {
        return f1406(var23);
    }
    
    public static SubLObject f1423(final SubLObject var23) {
        return f1404(var23);
    }
    
    public static SubLObject f1424(final SubLObject var23) {
        return f1407(var23);
    }
    
    public static SubLObject f1425(final SubLObject var23) {
        return (SubLObject)module0027.$ic50$;
    }
    
    public static SubLObject f1426(final SubLObject var23) {
        final SubLObject var24 = f1420(var23);
        final SubLObject var25 = f1421(var23);
        SubLObject var26 = (SubLObject)module0027.NIL;
        SubLObject var27 = (SubLObject)module0027.ZERO_INTEGER;
        SubLObject var28 = var25;
        SubLObject var29 = (SubLObject)module0027.NIL;
        var29 = var28.first();
        while (module0027.NIL != var28) {
            if (module0027.NIL != f1427(var29)) {
                var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var27), var26);
            }
            var27 = Numbers.add(var27, (SubLObject)module0027.ONE_INTEGER);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var26);
    }
    
    public static SubLObject f1428(final SubLObject var23) {
        final SubLObject var24 = f1421(var23);
        SubLObject var25 = (SubLObject)module0027.NIL;
        SubLObject var26 = (SubLObject)module0027.ZERO_INTEGER;
        SubLObject var27 = var24;
        SubLObject var28 = (SubLObject)module0027.NIL;
        var28 = var27.first();
        while (module0027.NIL != var27) {
            SubLObject var21_27 = f1429(var28);
            SubLObject var29 = (SubLObject)module0027.NIL;
            var29 = var21_27.first();
            while (module0027.NIL != var21_27) {
                final SubLObject var30 = var29;
                if (module0027.NIL == conses_high.member(var30, var25, Symbols.symbol_function((SubLObject)module0027.EQL), Symbols.symbol_function((SubLObject)module0027.IDENTITY))) {
                    var25 = (SubLObject)ConsesLow.cons(var30, var25);
                }
                var21_27 = var21_27.rest();
                var29 = var21_27.first();
            }
            var26 = Numbers.add(var26, (SubLObject)module0027.ONE_INTEGER);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return Sequences.nreverse(var25);
    }
    
    public static SubLObject f1427(final SubLObject var22) {
        return module0035.f2439((SubLObject)module0027.$ic51$, var22, (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1429(final SubLObject var22) {
        return module0205.f13183(var22, (SubLObject)module0027.$ic51$, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1430(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)module0027.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0027.$ic52$);
        var34 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0027.$ic52$);
        final SubLObject var35 = var33.rest();
        var33 = var33.first();
        SubLObject var36 = (SubLObject)module0027.NIL;
        SubLObject var37 = var33;
        SubLObject var38 = (SubLObject)module0027.NIL;
        SubLObject var39_40 = (SubLObject)module0027.NIL;
        while (module0027.NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)module0027.$ic52$);
            var39_40 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)module0027.$ic52$);
            if (module0027.NIL == conses_high.member(var39_40, (SubLObject)module0027.$ic53$, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED)) {
                var38 = (SubLObject)module0027.T;
            }
            if (var39_40 == module0027.$ic54$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (module0027.NIL != var38 && module0027.NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0027.$ic52$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic32$, var33);
        final SubLObject var40 = (SubLObject)((module0027.NIL != var39) ? conses_high.cadr(var39) : module0027.NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic33$, var33);
        final SubLObject var42 = (SubLObject)((module0027.NIL != var41) ? conses_high.cadr(var41) : module0027.NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic34$, var33);
        final SubLObject var44 = (SubLObject)((module0027.NIL != var43) ? conses_high.cadr(var43) : module0027.NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic35$, var33);
        final SubLObject var46 = (SubLObject)((module0027.NIL != var45) ? conses_high.cadr(var45) : module0027.$ic43$);
        final SubLObject var47 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic36$, var33);
        final SubLObject var48 = (SubLObject)((module0027.NIL != var47) ? conses_high.cadr(var47) : module0027.T);
        final SubLObject var49;
        var33 = (var49 = var35);
        assert module0027.NIL != f1419(var34) : var34;
        return (SubLObject)ConsesLow.list((SubLObject)module0027.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0027.$ic56$, var34), (SubLObject)ConsesLow.list(new SubLObject[] { module0027.$ic57$, module0027.$ic32$, var40, module0027.$ic33$, module0027.NIL, module0027.$ic34$, var44, module0027.$ic35$, var46, module0027.$ic36$, var48 }), (SubLObject)ConsesLow.list((SubLObject)module0027.$ic56$, var49));
    }
    
    public static SubLObject f1431(final SubLObject var34) {
        assert module0027.NIL != f1419(var34) : var34;
        module0027.$g829$.setGlobalValue(Sequences.delete(var34, module0027.$g829$.getGlobalValue(), (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED));
        SubLObject var35 = f1432(var34);
        SubLObject var36 = (SubLObject)module0027.NIL;
        var36 = var35.first();
        while (module0027.NIL != var35) {
            module0030.f1605(var36, var34, module0027.$g830$.getGlobalValue(), (SubLObject)module0027.UNPROVIDED);
            var35 = var35.rest();
            var36 = var35.first();
        }
        return Hashtables.remhash(var34, module0027.$g828$.getGlobalValue());
    }
    
    public static SubLObject f1433() {
        Hashtables.clrhash(module0027.$g828$.getGlobalValue());
        module0027.$g829$.setGlobalValue((SubLObject)module0027.NIL);
        Hashtables.clrhash(module0027.$g830$.getGlobalValue());
        return (SubLObject)module0027.T;
    }
    
    public static SubLObject f1434(final SubLObject var34, SubLObject var2, SubLObject var47, SubLObject var48) {
        if (var2 == module0027.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var47 == module0027.UNPROVIDED) {
            var47 = (SubLObject)module0027.$ic58$;
        }
        if (var48 == module0027.UNPROVIDED) {
            var48 = (SubLObject)module0027.NIL;
        }
        assert module0027.NIL != Types.streamp(var2) : var2;
        assert module0027.NIL != f1419(var34) : var34;
        assert module0027.NIL != f1435(var47) : var47;
        final SubLObject var49 = Hashtables.gethash(var34, module0027.$g828$.getGlobalValue(), (SubLObject)module0027.$ic61$);
        if (module0027.$ic61$ == var49) {
            PrintLow.format(var2, (SubLObject)module0027.$ic62$, var34);
            return Values.values((SubLObject)module0027.$ic63$, (SubLObject)ConsesLow.list(module0029.f1535((SubLObject)module0027.$ic6$, var34, (SubLObject)module0027.$ic63$, (SubLObject)module0027.NIL)));
        }
        return f1436(var2, var49, var47, var48);
    }
    
    public static SubLObject f1437(SubLObject var2, SubLObject var47, SubLObject var48, SubLObject var50, SubLObject var51) {
        if (var2 == module0027.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var47 == module0027.UNPROVIDED) {
            var47 = (SubLObject)module0027.$ic64$;
        }
        if (var48 == module0027.UNPROVIDED) {
            var48 = (SubLObject)module0027.NIL;
        }
        if (var50 == module0027.UNPROVIDED) {
            var50 = module0029.$g835$.getDynamicValue();
        }
        if (var51 == module0027.UNPROVIDED) {
            var51 = (SubLObject)module0027.NIL;
        }
        return module0029.f1577(var2, var47, var48, (SubLObject)module0027.$ic65$, var50, (SubLObject)module0027.T, var51, (SubLObject)module0027.$ic6$, (SubLObject)module0027.NIL, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1438(final SubLObject var46, SubLObject var2, SubLObject var47, SubLObject var48) {
        if (var2 == module0027.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var47 == module0027.UNPROVIDED) {
            var47 = (SubLObject)module0027.$ic64$;
        }
        if (var48 == module0027.UNPROVIDED) {
            var48 = (SubLObject)module0027.NIL;
        }
        return f1439(f1440(var46), var2, var47, var48);
    }
    
    public static SubLObject f1439(final SubLObject var52, SubLObject var2, SubLObject var47, SubLObject var48) {
        if (var2 == module0027.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var47 == module0027.UNPROVIDED) {
            var47 = (SubLObject)module0027.$ic64$;
        }
        if (var48 == module0027.UNPROVIDED) {
            var48 = (SubLObject)module0027.NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        assert module0027.NIL != Types.streamp(var2) : var2;
        assert module0027.NIL != f1435(var47) : var47;
        SubLObject var54 = (SubLObject)module0027.$ic63$;
        SubLObject var55 = (SubLObject)module0027.NIL;
        SubLObject var56 = (SubLObject)module0027.NIL;
        if (module0027.NIL == var56) {
            SubLObject var57 = var52;
            SubLObject var58 = (SubLObject)module0027.NIL;
            var58 = var57.first();
            while (module0027.NIL == var56 && module0027.NIL != var57) {
                var53.resetMultipleValues();
                final SubLObject var59 = f1434(var58, var2, var47, var48);
                final SubLObject var60 = var53.secondMultipleValue();
                var53.resetMultipleValues();
                var55 = ConsesLow.nconc(var55, var60);
                var54 = f1441(var54, var59);
                if (module0027.NIL != f1442(var54) && module0027.NIL != var48) {
                    var56 = (SubLObject)module0027.T;
                }
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        return Values.values(var54, var55);
    }
    
    public static SubLObject f1443(final SubLObject var59) {
        return conses_high.member(var59, module0027.$g831$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.EQ), (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1444(final SubLObject var59) {
        return Equality.eq((SubLObject)module0027.$ic66$, var59);
    }
    
    public static SubLObject f1442(final SubLObject var59) {
        return Equality.eq((SubLObject)module0027.$ic67$, var59);
    }
    
    public static SubLObject f1445(final SubLObject var59) {
        return Equality.eq((SubLObject)module0027.$ic68$, var59);
    }
    
    public static SubLObject f1446(final SubLObject var59) {
        return Equality.eq((SubLObject)module0027.$ic63$, var59);
    }
    
    public static SubLObject f1447(final SubLObject var59) {
        return Equality.eq((SubLObject)module0027.$ic69$, var59);
    }
    
    public static SubLObject f1435(final SubLObject var59) {
        return conses_high.member(var59, module0027.$g832$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.EQ), (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1440(final SubLObject var46) {
        return Hashtables.gethash(var46, module0027.$g830$.getGlobalValue(), (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1419(final SubLObject var59) {
        return f1448(var59);
    }
    
    public static SubLObject f1448(final SubLObject var59) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var59.isSymbol() && !var59.isKeyword());
    }
    
    public static SubLObject f1449(final SubLObject var34, final SubLObject var60, final SubLObject var14) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0027.NIL;
        SubLObject var63 = var60;
        SubLObject var64 = (SubLObject)module0027.NIL;
        SubLObject var66_67 = (SubLObject)module0027.NIL;
        while (module0027.NIL != var63) {
            cdestructuring_bind.destructuring_bind_must_consp(var63, var60, (SubLObject)module0027.$ic71$);
            var66_67 = var63.first();
            var63 = var63.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var63, var60, (SubLObject)module0027.$ic71$);
            if (module0027.NIL == conses_high.member(var66_67, (SubLObject)module0027.$ic72$, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED)) {
                var64 = (SubLObject)module0027.T;
            }
            if (var66_67 == module0027.$ic54$) {
                var62 = var63.first();
            }
            var63 = var63.rest();
        }
        if (module0027.NIL != var64 && module0027.NIL == var62) {
            cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0027.$ic71$);
        }
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic33$, var60);
        final SubLObject var66 = (SubLObject)((module0027.NIL != var65) ? conses_high.cadr(var65) : module0027.NIL);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic32$, var60);
        final SubLObject var68 = (SubLObject)((module0027.NIL != var67) ? conses_high.cadr(var67) : module0027.NIL);
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic34$, var60);
        final SubLObject var70 = (SubLObject)((module0027.NIL != var69) ? conses_high.cadr(var69) : module0027.NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic35$, var60);
        final SubLObject var72 = (SubLObject)((module0027.NIL != var71) ? conses_high.cadr(var71) : module0027.NIL);
        final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)module0027.$ic36$, var60);
        final SubLObject var74 = (SubLObject)((module0027.NIL != var73) ? conses_high.cadr(var73) : module0027.T);
        final SubLObject var75 = f1418(var34, var14, var68, var66, var70, var72, var74);
        SubLObject var76 = var70;
        SubLObject var77 = (SubLObject)module0027.NIL;
        var77 = var76.first();
        while (module0027.NIL != var76) {
            Hashtables.sethash(var77, module0027.$g830$.getGlobalValue(), conses_high.adjoin(var34, Hashtables.gethash(var77, module0027.$g830$.getGlobalValue(), (SubLObject)module0027.UNPROVIDED), (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED));
            var76 = var76.rest();
            var77 = var76.first();
        }
        if (module0027.NIL == conses_high.member(var34, module0027.$g829$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.EQL), Symbols.symbol_function((SubLObject)module0027.IDENTITY))) {
            final SubLObject var78 = (SubLObject)ConsesLow.cons(var34, (SubLObject)module0027.NIL);
            final SubLObject var79 = module0027.$g829$.getGlobalValue();
            if (module0027.NIL != var79) {
                module0005.f188(var79, var78);
            }
            else {
                module0027.$g829$.setGlobalValue(var78);
            }
        }
        Hashtables.sethash(var34, module0027.$g828$.getGlobalValue(), var75);
        module0029.f1506(module0029.$g836$.getDynamicValue(var61), var75);
        return var34;
    }
    
    public static SubLObject f1436(final SubLObject var2, final SubLObject var49, final SubLObject var47, final SubLObject var48) {
        final SubLObject var50 = f1401(var49);
        if (module0027.NIL == f1450(var49)) {
            return Values.values((SubLObject)module0027.$ic63$, (SubLObject)ConsesLow.list(module0029.f1535((SubLObject)module0027.$ic6$, var50, (SubLObject)module0027.$ic63$, (SubLObject)module0027.NIL)));
        }
        final SubLObject var51 = f1403(var49);
        final SubLObject var52 = f1402(var49);
        final SubLObject var53 = f1404(var49);
        return f1451(var2, var50, var51, var52, var53, var47, var48);
    }
    
    public static SubLObject f1451(final SubLObject var2, final SubLObject var13, final SubLObject var15, final SubLObject var14, final SubLObject var16, final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0027.$ic63$;
        SubLObject var51 = (SubLObject)module0027.NIL;
        SubLObject var52 = (SubLObject)module0027.NIL;
        final SubLObject var53 = print_high.$print_pretty$.currentBinding(var49);
        try {
            print_high.$print_pretty$.bind((SubLObject)((var47 == module0027.$ic73$) ? module0027.NIL : print_high.$print_pretty$.getDynamicValue(var49)), var49);
            SubLObject var54 = (SubLObject)module0027.NIL;
            f1452(var2, var13, var47);
            final SubLObject var55 = Time.get_internal_real_time();
            SubLObject var56 = (SubLObject)module0027.NIL;
            SubLObject var57 = (SubLObject)module0027.NIL;
            SubLObject var58 = (SubLObject)module0027.NIL;
            var56 = var14;
            var57 = var56.first();
            for (var58 = (SubLObject)module0027.ZERO_INTEGER; module0027.NIL == var54 && module0027.NIL != var56; var56 = var56.rest(), var57 = var56.first(), var58 = module0048.f_1X(var58)) {
                var49.resetMultipleValues();
                final SubLObject var59 = f1453(var2, var13, var58, var57, var15, var47);
                final SubLObject var60 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var51 = (SubLObject)ConsesLow.cons(var60, var51);
                var50 = f1441(var50, var59);
                if ((module0027.$ic67$ == var50 || module0027.$ic68$ == var50) && module0027.NIL != var48) {
                    var54 = (SubLObject)module0027.T;
                }
            }
            var52 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var55), time_high.$internal_time_units_per_second$.getGlobalValue());
            f1454(var2, var13, var50, var52, var16, var47);
        }
        finally {
            print_high.$print_pretty$.rebind(var53, var49);
        }
        return Values.values(var50, Sequences.nreverse(var51));
    }
    
    public static SubLObject f1450(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = f1406(var49);
        if (module0027.NIL == module0421.f29447(var51, module0029.$g835$.getDynamicValue(var50))) {
            return (SubLObject)module0027.NIL;
        }
        return (SubLObject)module0027.T;
    }
    
    public static SubLObject f1453(final SubLObject var2, final SubLObject var84, final SubLObject var80, final SubLObject var22, final SubLObject var15, final SubLObject var47) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0027.$ic63$;
        SubLObject var87 = (SubLObject)module0027.NIL;
        if (module0027.NIL != f1427(var22)) {
            var86 = (SubLObject)module0027.$ic69$;
        }
        else {
            SubLObject var88 = (SubLObject)module0027.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)module0027.$ic74$);
            var88 = var22.first();
            final SubLObject var90;
            final SubLObject var89 = var90 = var22.rest();
            final SubLObject var91 = (SubLObject)ConsesLow.cons(var84, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0027.$ic75$), var88));
            f1455(var2, var91, var90, var47);
            final SubLObject var92 = Sequences.length(var90);
            SubLObject var93 = (SubLObject)module0027.NIL;
            SubLObject var94 = (SubLObject)module0027.NIL;
            SubLObject var95 = (SubLObject)module0027.NIL;
            final SubLObject var96 = Time.get_internal_real_time();
            try {
                var85.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var97 = Errors.$error_handler$.currentBinding(var85);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0027.$ic76$, var85);
                    try {
                        var94 = Values.arg2(var85.resetMultipleValues(), (SubLObject)Values.multiple_value_list(Functions.apply(var84, var88)));
                    }
                    catch (Throwable var98) {
                        Errors.handleThrowable(var98, (SubLObject)module0027.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var97, var85);
                }
            }
            catch (Throwable var99) {
                var93 = Errors.handleThrowable(var99, module0003.$g3$.getGlobalValue());
            }
            finally {
                var85.throwStack.pop();
            }
            var87 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var96), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (module0027.NIL != var93) {
                var95 = var93;
                var86 = (SubLObject)module0027.$ic68$;
            }
            else {
                var95 = module0035.f2124(var92, var94);
                var86 = f1456(var90, var95, var15);
            }
            f1457(var2, var86, var95, var15, var87, var47);
        }
        final SubLObject var100 = (SubLObject)ConsesLow.list(var84, var80);
        final SubLObject var101 = module0029.f1535((SubLObject)module0027.$ic6$, var100, var86, var87);
        return Values.values(var86, var101);
    }
    
    public static SubLObject f1456(final SubLObject var89, final SubLObject var94, final SubLObject var15) {
        SubLObject var95;
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        for (var95 = (SubLObject)module0027.NIL, var96 = (SubLObject)module0027.NIL, var95 = var89, var96 = var94; module0027.NIL != var95 && module0027.NIL != var96; var95 = var95.rest(), var96 = var96.rest()) {
            var97 = var95.first();
            var98 = var96.first();
            if (module0027.NIL == Functions.funcall(var15, var98, var97)) {
                return (SubLObject)module0027.$ic67$;
            }
        }
        return (SubLObject)module0027.$ic66$;
    }
    
    public static SubLObject f1441(final SubLObject var53, final SubLObject var85) {
        if (var53.eql((SubLObject)module0027.$ic63$)) {
            return var85;
        }
        if (var53.eql((SubLObject)module0027.$ic69$)) {
            return var85;
        }
        if (var53.eql((SubLObject)module0027.$ic68$)) {
            return (SubLObject)module0027.$ic68$;
        }
        if (var53.eql((SubLObject)module0027.$ic67$)) {
            return (SubLObject)module0027.$ic67$;
        }
        if (!var53.eql((SubLObject)module0027.$ic66$)) {
            return (SubLObject)module0027.NIL;
        }
        if (var85.eql((SubLObject)module0027.$ic68$)) {
            return (SubLObject)module0027.$ic68$;
        }
        if (var85.eql((SubLObject)module0027.$ic67$)) {
            return (SubLObject)module0027.$ic67$;
        }
        return (SubLObject)module0027.$ic66$;
    }
    
    public static SubLObject f1458(final SubLObject var13) {
        return Hashtables.gethash(var13, module0027.$g828$.getGlobalValue(), (SubLObject)module0027.UNPROVIDED);
    }
    
    public static SubLObject f1432(final SubLObject var13) {
        final SubLObject var14 = f1458(var13);
        if (module0027.NIL != var14) {
            return f1405(f1458(var13));
        }
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1452(final SubLObject var2, final SubLObject var13, final SubLObject var47) {
        if (var47.eql((SubLObject)module0027.$ic64$)) {
            PrintLow.format(var2, (SubLObject)module0027.$ic77$, var13);
            streams_high.force_output(var2);
        }
        else if (var47.eql((SubLObject)module0027.$ic58$)) {
            PrintLow.format(var2, (SubLObject)module0027.$ic78$, var13);
            streams_high.force_output(var2);
        }
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1454(final SubLObject var2, final SubLObject var13, final SubLObject var57, final SubLObject var76, final SubLObject var16, final SubLObject var47) {
        if (var47.eql((SubLObject)module0027.$ic64$)) {
            PrintLow.format(var2, (SubLObject)module0027.$ic79$, var57, var76);
            streams_high.force_output(var2);
        }
        else if (var47.eql((SubLObject)module0027.$ic73$)) {
            PrintLow.format(var2, (SubLObject)module0027.$ic80$, new SubLObject[] { var57, module0027.$g833$.getGlobalValue(), var13, var76, var16 });
            streams_high.force_output(var2);
        }
        else if (var47.eql((SubLObject)module0027.$ic58$)) {
            PrintLow.format(var2, (SubLObject)module0027.$ic81$, var13, var57);
            if (module0027.NIL != var16 && (module0027.$ic67$ == var57 || module0027.$ic68$ == var57)) {
                PrintLow.format(var2, (SubLObject)module0027.$ic82$, var16);
            }
            streams_high.force_output(var2);
        }
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1455(final SubLObject var2, final SubLObject var90, final SubLObject var89, final SubLObject var47) {
        if (module0027.$ic58$ == var47) {
            if (module0027.NIL != module0035.f1997(var89)) {
                PrintLow.format(var2, (SubLObject)module0027.$ic83$, var90, var89.first());
            }
            else {
                PrintLow.format(var2, (SubLObject)module0027.$ic84$, var90, var89);
            }
            streams_high.force_output(var2);
        }
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1457(final SubLObject var2, final SubLObject var85, final SubLObject var94, final SubLObject var15, final SubLObject var76, final SubLObject var47) {
        if (var85.eql((SubLObject)module0027.$ic66$)) {
            if (module0027.$ic58$ == var47) {
                PrintLow.format(var2, (SubLObject)module0027.$ic85$, var76);
                streams_high.force_output(var2);
            }
        }
        else if (var85.eql((SubLObject)module0027.$ic68$)) {
            if (module0027.$ic58$ == var47) {
                PrintLow.format(var2, (SubLObject)module0027.$ic86$, var94, var76);
                streams_high.force_output(var2);
            }
        }
        else if (module0027.$ic58$ == var47) {
            if (module0027.NIL != module0035.f1997(var94)) {
                PrintLow.format(var2, (SubLObject)module0027.$ic87$, new SubLObject[] { var94.first(), var15, var76 });
            }
            else {
                PrintLow.format(var2, (SubLObject)module0027.$ic88$, new SubLObject[] { var94, var15, var76 });
            }
        }
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1459(final SubLObject var59, final SubLObject var2) {
        f1460(var59, var2);
        return var59;
    }
    
    public static SubLObject f1460(final SubLObject var103, final SubLObject var2) {
        module0021.f1110(module0027.$g837$.getGlobalValue(), var2);
        f1461(var103, var2);
        return var103;
    }
    
    public static SubLObject f1461(final SubLObject var103, final SubLObject var2) {
        module0021.f1038(f1401(var103), var2);
        module0021.f1038(f1402(var103), var2);
        module0021.f1038(module0030.f1592(f1403(var103)), var2);
        module0021.f1038(f1404(var103), var2);
        module0021.f1038(f1405(var103), var2);
        module0021.f1038(f1406(var103), var2);
        module0021.f1038(f1407(var103), var2);
        return var103;
    }
    
    public static SubLObject f1462(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        final SubLObject var5 = Symbols.symbol_function(module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED));
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        final SubLObject var7 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        final SubLObject var8 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        final SubLObject var9 = module0021.f1060(var2, (SubLObject)module0027.UNPROVIDED, (SubLObject)module0027.UNPROVIDED);
        return f1418(var3, var4, var5, var6, var7, var8, var9);
    }
    
    public static SubLObject f1463() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1398", "S#2533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1399", "S#2534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1400", "S#2525", 1, 0, false);
        new $f1400$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1401", "S#2535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1402", "S#2536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1403", "S#2537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1404", "S#2538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1405", "S#2539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1406", "S#2540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1407", "S#2541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1408", "S#2542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1409", "S#2543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1410", "S#2544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1411", "S#2545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1412", "S#2546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1413", "S#2547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1414", "S#2548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1415", "S#2549", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1416", "S#2550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1417", "S#2551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1418", "S#2552", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1420", "S#2553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1421", "S#2554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1422", "S#2555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1423", "S#2556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1424", "S#2557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1425", "S#2558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1426", "S#2559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1428", "S#2560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1427", "S#2561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1429", "S#2562", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0027", "f1430", "S#2563");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1431", "S#2564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1433", "S#2565", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1434", "S#2566", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1437", "S#2567", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1438", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1439", "S#2568", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1443", "S#2569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1444", "S#2570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1442", "S#2571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1445", "S#2572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1446", "S#2573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1447", "S#2574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1435", "S#2575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1440", "S#2576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1419", "S#2577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1448", "S#2578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1449", "S#2579", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1436", "S#2580", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1451", "S#2581", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1450", "S#2582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1453", "S#2583", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1456", "S#2584", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1441", "S#2585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1458", "S#2586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1432", "S#2587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1452", "S#2588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1454", "S#2589", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1455", "S#2590", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1457", "S#2591", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1459", "S#2592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1460", "S#2593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1461", "S#2594", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0027", "f1462", "S#2595", 1, 0, false);
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1464() {
        module0027.$g828$ = SubLFiles.deflexical("S#2596", (module0027.NIL != Symbols.boundp((SubLObject)module0027.$ic0$)) ? module0027.$g828$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0027.$ic1$, Symbols.symbol_function((SubLObject)module0027.EQL), (SubLObject)module0027.UNPROVIDED));
        module0027.$g829$ = SubLFiles.deflexical("S#2597", (SubLObject)((module0027.NIL != Symbols.boundp((SubLObject)module0027.$ic2$)) ? module0027.$g829$.getGlobalValue() : module0027.NIL));
        module0027.$g830$ = SubLFiles.deflexical("S#2598", Hashtables.make_hash_table((SubLObject)module0027.$ic3$, (SubLObject)module0027.EQL, (SubLObject)module0027.UNPROVIDED));
        module0027.$g831$ = SubLFiles.deflexical("S#2599", (SubLObject)module0027.$ic4$);
        module0027.$g832$ = SubLFiles.deflexical("S#2600", (SubLObject)module0027.$ic5$);
        module0027.$g833$ = SubLFiles.deflexical("S#2601", (SubLObject)module0027.$ic6$);
        module0027.$g834$ = SubLFiles.defconstant("S#2602", (SubLObject)module0027.$ic7$);
        module0027.$g837$ = SubLFiles.defconstant("S#2603", (SubLObject)module0027.$ic89$);
        return (SubLObject)module0027.NIL;
    }
    
    public static SubLObject f1465() {
        module0003.f57((SubLObject)module0027.$ic0$);
        module0003.f57((SubLObject)module0027.$ic2$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0027.$g834$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.$ic14$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0027.$ic15$);
        Structures.def_csetf((SubLObject)module0027.$ic16$, (SubLObject)module0027.$ic17$);
        Structures.def_csetf((SubLObject)module0027.$ic18$, (SubLObject)module0027.$ic19$);
        Structures.def_csetf((SubLObject)module0027.$ic20$, (SubLObject)module0027.$ic21$);
        Structures.def_csetf((SubLObject)module0027.$ic22$, (SubLObject)module0027.$ic23$);
        Structures.def_csetf((SubLObject)module0027.$ic24$, (SubLObject)module0027.$ic25$);
        Structures.def_csetf((SubLObject)module0027.$ic26$, (SubLObject)module0027.$ic27$);
        Structures.def_csetf((SubLObject)module0027.$ic28$, (SubLObject)module0027.$ic29$);
        Equality.identity((SubLObject)module0027.$ic7$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0027.$g834$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.$ic42$));
        module0002.f50((SubLObject)module0027.$ic55$, (SubLObject)module0027.$ic70$);
        module0021.f1193(module0027.$g837$.getGlobalValue(), (SubLObject)module0027.$ic90$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0027.$g834$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0027.$ic91$));
        return (SubLObject)module0027.NIL;
    }
    
    public void declareFunctions() {
        f1463();
    }
    
    public void initializeVariables() {
        f1464();
    }
    
    public void runTopLevelForms() {
        f1465();
    }
    
    static {
        me = (SubLFile)new module0027();
        module0027.$g828$ = null;
        module0027.$g829$ = null;
        module0027.$g830$ = null;
        module0027.$g831$ = null;
        module0027.$g832$ = null;
        module0027.$g833$ = null;
        module0027.$g834$ = null;
        module0027.$g837$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#2596", "CYC");
        $ic1$ = SubLObjectFactory.makeInteger(212);
        $ic2$ = SubLObjectFactory.makeSymbol("S#2597", "CYC");
        $ic3$ = SubLObjectFactory.makeInteger(64);
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SILENT"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-BUILD"));
        $ic6$ = SubLObjectFactory.makeKeyword("TCT");
        $ic7$ = SubLObjectFactory.makeSymbol("S#2524", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#2525", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2604", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2605", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2606", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2607", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TUPLES"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2535", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2536", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2537", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2538", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2539", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2540", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2541", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2542", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2543", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2544", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2545", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2546", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2547", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2548", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic14$ = SubLObjectFactory.makeSymbol("S#2534", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2525", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#2535", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#2542", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#2536", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#2543", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#2537", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#2544", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#2538", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#2545", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#2539", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#2546", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#2540", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#2547", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#2541", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#2548", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("NAME");
        $ic31$ = SubLObjectFactory.makeKeyword("TUPLES");
        $ic32$ = SubLObjectFactory.makeKeyword("TEST");
        $ic33$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic34$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic35$ = SubLObjectFactory.makeKeyword("KB");
        $ic36$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic37$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic38$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic39$ = SubLObjectFactory.makeSymbol("S#2549", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic41$ = SubLObjectFactory.makeKeyword("END");
        $ic42$ = SubLObjectFactory.makeSymbol("S#2551", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("TINY");
        $ic44$ = SubLObjectFactory.makeSymbol("S#2577", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic46$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic47$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic48$ = SubLObjectFactory.makeSymbol("S#2526", "CYC");
        $ic49$ = SubLObjectFactory.makeString("~S was not a valid (<input> . <expected-results>) tuple");
        $ic50$ = SubLObjectFactory.makeString("");
        $ic51$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2610", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2605", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2606", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2607", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"), (SubLObject)module0027.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#2604", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $ic54$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic55$ = SubLObjectFactory.makeSymbol("S#2579", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic57$ = SubLObjectFactory.makeSymbol("LIST");
        $ic58$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic59$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic60$ = SubLObjectFactory.makeSymbol("S#2575", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("UNDEFINED");
        $ic62$ = SubLObjectFactory.makeString("~%There is no test case table named ~s.");
        $ic63$ = SubLObjectFactory.makeKeyword("NOT-RUN");
        $ic64$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic65$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic66$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic67$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic68$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic69$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic70$ = SubLObjectFactory.makeSymbol("S#2563", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#2605", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2606", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2607", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"), (SubLObject)module0027.T));
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $ic73$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2611", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#2612", "CYC"));
        $ic75$ = SubLObjectFactory.makeSymbol("S#2613", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic77$ = SubLObjectFactory.makeString(":TCT ~S -> ");
        $ic78$ = SubLObjectFactory.makeString("Starting :TCT ~S :~%~%");
        $ic79$ = SubLObjectFactory.makeString("~S (~,3f)~%");
        $ic80$ = SubLObjectFactory.makeString(":TCT ~S ~S ~S (~,3f) :OWNER ~S~%");
        $ic81$ = SubLObjectFactory.makeString("~%Overall result for ~S: ~S~%");
        $ic82$ = SubLObjectFactory.makeString("Please notify ~a@cyc.com.");
        $ic83$ = SubLObjectFactory.makeString("  Input: ~s~%  Expected result: ~s  ~%");
        $ic84$ = SubLObjectFactory.makeString("  Input: ~s~%  Expected results: ~s  ~%");
        $ic85$ = SubLObjectFactory.makeString("~%    -> :SUCCESS (~S)~%");
        $ic86$ = SubLObjectFactory.makeString("~%    -> :ERROR ~S (~S)~%");
        $ic87$ = SubLObjectFactory.makeString("    Actual result: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");
        $ic88$ = SubLObjectFactory.makeString("    Actual results: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");
        $ic89$ = SubLObjectFactory.makeInteger(512);
        $ic90$ = SubLObjectFactory.makeSymbol("S#2595", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#2592", "CYC");
    }
    
    public static final class $sX2524_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $tuples;
        public SubLObject $test;
        public SubLObject $owner;
        public SubLObject $classes;
        public SubLObject $kb;
        public SubLObject $workingP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX2524_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$tuples = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$classes = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2524_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$tuples;
        }
        
        public SubLObject getField4() {
            return this.$test;
        }
        
        public SubLObject getField5() {
            return this.$owner;
        }
        
        public SubLObject getField6() {
            return this.$classes;
        }
        
        public SubLObject getField7() {
            return this.$kb;
        }
        
        public SubLObject getField8() {
            return this.$workingP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tuples = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$owner = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$classes = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$kb = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2524_native.class, module0027.$ic7$, module0027.$ic8$, module0027.$ic9$, module0027.$ic10$, new String[] { "$name", "$tuples", "$test", "$owner", "$classes", "$kb", "$workingP" }, module0027.$ic11$, module0027.$ic12$, module0027.$ic13$);
        }
    }
    
    public static final class $f1400$UnaryFunction extends UnaryFunction
    {
        public $f1400$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2525"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0027.f1400(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0027.class
	Total time: 289 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/