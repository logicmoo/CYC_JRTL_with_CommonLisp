package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0048 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0048";
    public static final String myFingerPrint = "87525c3ff97430897295169d13661455458e5f780f2817ca03b277cbe6687835";
    public static SubLSymbol $g977$;
    public static SubLSymbol $g978$;
    private static SubLSymbol $g979$;
    private static SubLSymbol $g980$;
    private static SubLSymbol $g981$;
    private static SubLSymbol $g982$;
    private static SubLSymbol $g983$;
    private static SubLSymbol $g984$;
    private static SubLSymbol $g985$;
    public static SubLSymbol $g986$;
    public static SubLSymbol $g987$;
    public static SubLSymbol $g988$;
    public static SubLSymbol $g989$;
    private static SubLSymbol $g990$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLFloat $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLFloat $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLString $ic121$;
    private static final SubLList $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLInteger $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    
    
    public static SubLObject f_1X(final SubLObject var1) {
        return Numbers.add(var1, (SubLObject)module0048.ONE_INTEGER);
    }
    
    public static SubLObject f_1_(final SubLObject var1) {
        return Numbers.subtract(var1, (SubLObject)module0048.ONE_INTEGER);
    }
    
    public static SubLObject f3274(final SubLObject var1) {
        return Numbers.add(var1, var1);
    }
    
    public static SubLObject f3275(final SubLObject var2) {
        return Equality.eql((SubLObject)module0048.ONE_INTEGER, var2);
    }
    
    public static SubLObject f3276(final SubLObject var2) {
        return (SubLObject)((module0048.NIL != var2) ? module0048.ONE_INTEGER : module0048.ZERO_INTEGER);
    }
    
    public static SubLObject f3277(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var3.isZero());
    }
    
    public static SubLObject f3278(final SubLObject var4, final SubLObject var5) {
        return f3277(bytes.ldb(bytes.sublisp_byte((SubLObject)module0048.ONE_INTEGER, var5), var4));
    }
    
    public static SubLObject f3279(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == module0048.UNPROVIDED) {
            var6 = (SubLObject)module0048.T;
        }
        return bytes.dpb(f3276(var6), bytes.sublisp_byte((SubLObject)module0048.ONE_INTEGER, var5), var4);
    }
    
    public static SubLObject f3280(final SubLObject var4, final SubLObject var5) {
        return f3279(var4, var5, (SubLObject)module0048.NIL);
    }
    
    public static SubLObject f3281(final SubLObject var1, final SubLObject var7) {
        assert module0048.NIL != Types.numberp(var1) : var1;
        assert module0048.NIL != Types.numberp(var7) : var7;
        return Numbers.integerDivide(var1, var7);
    }
    
    public static SubLObject f3282(final SubLObject var1) {
        assert module0048.NIL != Types.numberp(var1) : var1;
        return Numbers.multiply(var1, var1);
    }
    
    public static SubLObject f3283(final SubLObject var1) {
        assert module0048.NIL != Types.numberp(var1) : var1;
        return Numbers.expt(var1, (SubLObject)module0048.THREE_INTEGER);
    }
    
    public static SubLObject f3284(final SubLObject var1) {
        assert module0048.NIL != Types.numberp(var1) : var1;
        return Numbers.expt(var1, Numbers.divide((SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.THREE_INTEGER));
    }
    
    public static SubLObject f3285(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isInteger() && module0048.ZERO_INTEGER.numLE(var2) && var2.numL((SubLObject)module0048.$ic4$));
    }
    
    public static SubLObject f3286(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL == var2 || var2.isInteger());
    }
    
    public static SubLObject f3287(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL == var2 || module0048.NIL != module0004.f105(var2));
    }
    
    public static SubLObject f3288(final SubLObject var2) {
        if (module0048.NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)module0048.NIL;
            var4 = var3.first();
            while (module0048.NIL != var3) {
                if (!var4.isInteger()) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)module0048.T;
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3289(final SubLObject var2) {
        if (module0048.NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)module0048.NIL;
            var4 = var3.first();
            while (module0048.NIL != var3) {
                if (module0048.NIL == module0004.f105(var4)) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)module0048.T;
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3290(final SubLObject var2) {
        if (module0048.NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)module0048.NIL;
            var4 = var3.first();
            while (module0048.NIL != var3) {
                if (module0048.NIL == module0004.f108(var4)) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)module0048.T;
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3291(final SubLObject var2) {
        if (module0048.NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)module0048.NIL;
            var4 = var3.first();
            while (module0048.NIL != var3) {
                if (module0048.NIL == module0004.f106(var4)) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)module0048.T;
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3292(final SubLObject var2) {
        if (module0048.NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)module0048.NIL;
            var4 = var3.first();
            while (module0048.NIL != var3) {
                if (module0048.NIL == module0004.f107(var4)) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)module0048.T;
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3293(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && var2.isPositive());
    }
    
    public static SubLObject f3294(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && !var2.isNegative());
    }
    
    public static SubLObject f3295(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && !var2.isPositive());
    }
    
    public static SubLObject f3296(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && var2.isNegative());
    }
    
    public static SubLObject f3297(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0048.NIL;
        SubLObject var5 = (SubLObject)module0048.NIL;
        try {
            var3.throwStack.push(module0048.$ic9$);
            final SubLObject var6 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0048.$ic10$), var3);
                try {
                    var4 = Numbers.zerop(var2);
                }
                catch (Throwable var7) {
                    Errors.handleThrowable(var7, (SubLObject)module0048.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var6, var3);
            }
        }
        catch (Throwable var8) {
            var5 = Errors.handleThrowable(var8, (SubLObject)module0048.$ic9$);
        }
        finally {
            var3.throwStack.pop();
        }
        return var4;
    }
    
    public static SubLObject f3298(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && !var2.isZero());
    }
    
    public static SubLObject f3299(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && module0048.ZERO_INTEGER.numLE(var2) && var2.numLE((SubLObject)module0048.ONE_INTEGER));
    }
    
    public static SubLObject f3300(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() && module0048.ZERO_INTEGER.numLE(var2) && var2.numL((SubLObject)module0048.ONE_INTEGER));
    }
    
    public static SubLObject f3301(SubLObject var3) {
        assert module0048.NIL != Types.integerp(var3) : var3;
        SubLObject var4;
        for (var4 = (SubLObject)module0048.ZERO_INTEGER; !var3.isZero(); var3 = Numbers.integerDivide(var3, (SubLObject)module0048.TEN_INTEGER), var4 = Numbers.add(var4, (SubLObject)module0048.ONE_INTEGER)) {}
        return var4;
    }
    
    public static SubLObject f3302(final SubLObject var1, final SubLObject var17) {
        assert module0048.NIL != f3303(var1) : var1;
        assert module0048.NIL != module0004.f105(var17) : var17;
        if (module0048.NIL != f3304(var1)) {
            return var1;
        }
        if (module0048.NIL != module0606.f37086(var1)) {
            return module0607.f37112(var1, var17);
        }
        if (var1.isZero()) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        if (var1.isNegative()) {
            return Numbers.minus(f3302(Numbers.minus(var1), var17));
        }
        if (var1.isInteger() && var17.numGE(f3301(var1))) {
            return var1;
        }
        if (var1.isDouble() && var17.numGE(module0048.$g979$.getGlobalValue())) {
            return var1;
        }
        final SubLObject var18 = Numbers.floor(Numbers.log(var1, (SubLObject)module0048.TEN_INTEGER), (SubLObject)module0048.UNPROVIDED);
        final SubLObject var19 = Numbers.expt((SubLObject)module0048.TEN_INTEGER, var18);
        final SubLObject var20 = Numbers.divide(var1, var19);
        final SubLObject var21 = Numbers.expt((SubLObject)module0048.TEN_INTEGER, Numbers.subtract(var17, (SubLObject)module0048.ONE_INTEGER));
        final SubLObject var22 = Numbers.multiply(var20, var21);
        final SubLObject var23 = Numbers.round(var22, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var24 = Numbers.divide(var23, var21);
        SubLObject var25 = Numbers.multiply(var24, var19);
        if (var1.isInteger()) {
            final SubLObject var26 = Numbers.subtract(var18, Numbers.subtract(var17, (SubLObject)module0048.ONE_INTEGER));
            final SubLObject var27 = Numbers.expt((SubLObject)module0048.TEN_INTEGER, var26);
            var25 = Numbers.multiply(var23, var27);
        }
        if (var25.isDouble() && var1.numGE(Numbers.$most_negative_fixnum$.getGlobalValue()) && var1.numLE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            final SubLObject var28 = Numbers.round(var25, (SubLObject)module0048.UNPROVIDED);
            if (var28.numE(var25)) {
                var25 = var28;
            }
        }
        if (var25.isDouble()) {
            var25 = f3305(var25);
        }
        return var25;
    }
    
    public static SubLObject f3306(final SubLObject var1) {
        return f3302(var1, (SubLObject)module0048.FOUR_INTEGER);
    }
    
    public static SubLObject f3305(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        var30.resetMultipleValues();
        final SubLObject var31 = Numbers.integer_decode_float(var29);
        final SubLObject var32 = var30.secondMultipleValue();
        final SubLObject var33 = var30.thirdMultipleValue();
        var30.resetMultipleValues();
        SubLObject var34 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var35 = (SubLObject)module0048.NIL;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        for (var36 = (SubLObject)module0048.THREE_INTEGER, var37 = (SubLObject)module0048.NIL, var37 = (SubLObject)module0048.$ic14$; !var37.numGE(var36); var37 = f_1X(var37)) {
            var38 = Numbers.add(var31, var37);
            var39 = Numbers.multiply(var33, Numbers.scale_float(Numbers.sublisp_float(var38, var29), var32));
            var40 = Sequences.length(print_high.prin1_to_string(var39));
            if (var40.numL(var34)) {
                var34 = var40;
                var35 = var39;
            }
        }
        return var35;
    }
    
    public static SubLObject f3307(final SubLObject var40, SubLObject var41) {
        if (var41 == module0048.UNPROVIDED) {
            var41 = (SubLObject)module0048.FOUR_INTEGER;
        }
        final SubLObject var42 = Numbers.expt((SubLObject)module0048.TEN_INTEGER, var41);
        return Numbers.sublisp_float(Numbers.divide(Numbers.round(Numbers.multiply(var40, var42), (SubLObject)module0048.UNPROVIDED), var42), (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3308(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.ceiling(Numbers.divide(var43, var41), (SubLObject)module0048.UNPROVIDED), var41);
    }
    
    public static SubLObject f3309(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.round(Numbers.divide(var43, var41), (SubLObject)module0048.UNPROVIDED), var41);
    }
    
    public static SubLObject f3310(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.floor(Numbers.divide(var43, var41), (SubLObject)module0048.UNPROVIDED), var41);
    }
    
    public static SubLObject f3311(final SubLObject var44, final SubLObject var45) {
        return Numbers.numG(Numbers.abs(var44), Numbers.abs(var45));
    }
    
    public static SubLObject f3312(final SubLObject var1, final SubLObject var7) {
        assert module0048.NIL != Types.numberp(var1) : var1;
        assert module0048.NIL != Types.numberp(var7) : var7;
        return Numbers.numE(Numbers.mod(var1, var7), (SubLObject)module0048.ZERO_INTEGER);
    }
    
    public static SubLObject f3313(final SubLObject var46, SubLObject var47, SubLObject var48) {
        if (var47 == module0048.UNPROVIDED) {
            var47 = (SubLObject)module0048.ONE_INTEGER;
        }
        if (var48 == module0048.UNPROVIDED) {
            var48 = (SubLObject)module0048.NIL;
        }
        final SubLObject var49 = Numbers.multiply(var46, (SubLObject)module0048.$ic15$);
        return Values.values((module0048.NIL != var48) ? Numbers.round(var49, var47) : Numbers.truncate(var49, var47));
    }
    
    public static SubLObject f3314(final SubLObject var46, SubLObject var47, SubLObject var50) {
        if (var47 == module0048.UNPROVIDED) {
            var47 = (SubLObject)module0048.ONE_INTEGER;
        }
        if (var50 == module0048.UNPROVIDED) {
            var50 = (SubLObject)module0048.NIL;
        }
        SubLObject var51 = Numbers.multiply((SubLObject)module0048.$ic15$, Numbers.divide(var46, var47));
        if (module0048.NIL != var50) {
            var51 = f3302(var51, var50);
        }
        return var51;
    }
    
    public static SubLObject f3315(final SubLObject var2) {
        return module0552.f34081(var2);
    }
    
    public static SubLObject f3316(final SubLObject var51) {
        return Numbers.divide(var51, (SubLObject)module0048.$ic15$);
    }
    
    public static SubLObject f3317(final SubLObject var52, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var54) && !var53.numGE(var52)) {
            Errors.error((SubLObject)module0048.$ic16$);
        }
        return f3314(f_1_(Numbers.divide(var53, var52)), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3318(final SubLObject var52, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var54) && !var53.numLE(var52)) {
            Errors.error((SubLObject)module0048.$ic17$);
        }
        return f3314(Numbers.minus(f_1_(Numbers.divide(var53, var52))), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3319(final SubLObject var54, final SubLObject var55) {
        return f3318(var54, var55);
    }
    
    public static SubLObject f3320(final SubLObject var54, final SubLObject var55) {
        return f3317(var54, var55);
    }
    
    public static SubLObject f3321(final SubLObject var1) {
        return Numbers.log(var1, (SubLObject)module0048.TEN_INTEGER);
    }
    
    public static SubLObject f3322(final SubLObject var1) {
        return Numbers.log(var1, (SubLObject)module0048.TWO_INTEGER);
    }
    
    public static SubLObject f3323(final SubLObject var1) {
        return Numbers.expt((SubLObject)module0048.TEN_INTEGER, var1);
    }
    
    public static SubLObject f3324(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isNumber() || module0048.NIL != f3304(var2));
    }
    
    public static SubLObject f3325() {
        return (SubLObject)module0048.$ic18$;
    }
    
    public static SubLObject f3326() {
        return (SubLObject)module0048.$ic19$;
    }
    
    public static SubLObject f3327(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)module0048.$ic18$);
    }
    
    public static SubLObject f3328(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)module0048.$ic19$);
    }
    
    public static SubLObject f3304(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3327(var2) || module0048.NIL != f3328(var2));
    }
    
    public static SubLObject f3329(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3327(var2) || module0048.NIL != f3296(var2));
    }
    
    public static SubLObject f3330(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3328(var2) || module0048.NIL != f3293(var2));
    }
    
    public static SubLObject f3331(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3328(var2) || module0048.NIL != f3294(var2));
    }
    
    public static SubLObject f3332(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        return Equality.eql(var44, var45);
    }
    
    public static SubLObject f3333(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3327(var44)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL == f3327(var45));
        }
        if (module0048.NIL != f3327(var45)) {
            return (SubLObject)module0048.NIL;
        }
        if (module0048.NIL != f3328(var45)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL == f3328(var44));
        }
        if (module0048.NIL != f3328(var44)) {
            return (SubLObject)module0048.NIL;
        }
        return Numbers.numL(var44, var45);
    }
    
    public static SubLObject f3334(final SubLObject var44, final SubLObject var45) {
        return f3333(var45, var44);
    }
    
    public static SubLObject f3335(final SubLObject var44, final SubLObject var45) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3332(var44, var45) || module0048.NIL != f3333(var44, var45));
    }
    
    public static SubLObject f3336(final SubLObject var44, final SubLObject var45) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3332(var44, var45) || module0048.NIL != f3334(var44, var45));
    }
    
    public static SubLObject f3337(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3327(var44)) {
            return f3338(var45);
        }
        if (module0048.NIL != f3327(var45)) {
            return f3338(var44);
        }
        if (module0048.NIL != f3328(var44)) {
            return f3339(var45);
        }
        if (module0048.NIL != f3328(var45)) {
            return f3339(var44);
        }
        return Numbers.add(var44, var45);
    }
    
    public static SubLObject f3340(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3327(var44)) {
            return f3341(var45);
        }
        if (module0048.NIL != f3327(var45)) {
            return f3341(var44);
        }
        if (module0048.NIL != f3328(var44)) {
            return f3342(var45);
        }
        if (module0048.NIL != f3328(var45)) {
            return f3342(var44);
        }
        return Numbers.subtract(var44, var45);
    }
    
    public static SubLObject f3343(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3327(var44)) {
            return f3344(var45);
        }
        if (module0048.NIL != f3327(var45)) {
            return f3344(var44);
        }
        if (module0048.NIL != f3328(var44)) {
            return f3345(var45);
        }
        if (module0048.NIL != f3328(var45)) {
            return f3345(var44);
        }
        return Numbers.multiply(var44, var45);
    }
    
    public static SubLObject f3346(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3297(var45)) {
            if (module0048.NIL != f3329(var44)) {
                return (SubLObject)module0048.$ic18$;
            }
            if (module0048.NIL != f3330(var44)) {
                return (SubLObject)module0048.$ic19$;
            }
            if (module0048.ZERO_INTEGER.eql(var44)) {
                Errors.error((SubLObject)module0048.$ic21$);
            }
            return (SubLObject)module0048.NIL;
        }
        else {
            if (module0048.NIL != f3327(var44)) {
                return f3347(var45);
            }
            if (module0048.NIL != f3327(var45)) {
                return f3348(var44);
            }
            if (module0048.NIL != f3328(var44)) {
                return f3349(var45);
            }
            if (module0048.NIL != f3328(var45)) {
                return f3350(var44);
            }
            return Numbers.divide(var44, var45);
        }
    }
    
    public static SubLObject f3351(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3334(var44, var45)) {
            return var44;
        }
        return var45;
    }
    
    public static SubLObject f3352(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3324(var44) : var44;
        assert module0048.NIL != f3324(var45) : var45;
        if (module0048.NIL != f3333(var44, var45)) {
            return var44;
        }
        return var45;
    }
    
    public static SubLObject f3353(final SubLObject var40, SubLObject var42) {
        if (var42 == module0048.UNPROVIDED) {
            var42 = module0048.$g978$.getGlobalValue();
        }
        assert module0048.NIL != f3331(var40) : var40;
        if (module0048.ZERO_INTEGER.eql(var40)) {
            return f3325();
        }
        if (module0048.NIL != f3328(var40)) {
            return f3326();
        }
        return Numbers.log(var40, var42);
    }
    
    public static SubLObject f3354(final SubLObject var40) {
        assert module0048.NIL != f3324(var40) : var40;
        if (module0048.NIL != f3327(var40)) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        if (module0048.NIL != f3328(var40)) {
            return f3326();
        }
        return Numbers.exp(var40);
    }
    
    public static SubLObject f3338(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0048.NIL != f3328(var40)) {
            Errors.error((SubLObject)module0048.$ic23$);
        }
        return (SubLObject)module0048.$ic18$;
    }
    
    public static SubLObject f3339(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic23$);
        }
        return (SubLObject)module0048.$ic19$;
    }
    
    public static SubLObject f3341(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic24$);
        }
        return (SubLObject)module0048.$ic18$;
    }
    
    public static SubLObject f3342(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0048.NIL != f3328(var40)) {
            Errors.error((SubLObject)module0048.$ic25$);
        }
        return (SubLObject)module0048.$ic19$;
    }
    
    public static SubLObject f3344(final SubLObject var40) {
        if (module0048.NIL != f3329(var40)) {
            return (SubLObject)module0048.$ic19$;
        }
        if (module0048.NIL != f3297(var40)) {
            Errors.error((SubLObject)module0048.$ic26$);
            return (SubLObject)module0048.NIL;
        }
        return (SubLObject)module0048.$ic18$;
    }
    
    public static SubLObject f3345(final SubLObject var40) {
        if (module0048.NIL != f3329(var40)) {
            return (SubLObject)module0048.$ic18$;
        }
        if (module0048.ZERO_INTEGER.eql(var40)) {
            Errors.error((SubLObject)module0048.$ic26$);
            return (SubLObject)module0048.NIL;
        }
        return (SubLObject)module0048.$ic19$;
    }
    
    public static SubLObject f3347(final SubLObject var40) {
        if (module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic27$);
        }
        else {
            if (module0048.NIL == f3328(var40)) {
                return f3344(var40);
            }
            Errors.error((SubLObject)module0048.$ic28$);
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3349(final SubLObject var40) {
        if (module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic29$);
        }
        else {
            if (module0048.NIL == f3328(var40)) {
                return f3345(var40);
            }
            Errors.error((SubLObject)module0048.$ic30$);
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3348(final SubLObject var40) {
        if (module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic27$);
        }
        else {
            if (module0048.NIL == f3328(var40)) {
                return (SubLObject)module0048.ZERO_INTEGER;
            }
            Errors.error((SubLObject)module0048.$ic29$);
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3350(final SubLObject var40) {
        if (module0048.NIL != f3327(var40)) {
            Errors.error((SubLObject)module0048.$ic28$);
        }
        else {
            if (module0048.NIL == f3328(var40)) {
                return (SubLObject)module0048.ZERO_INTEGER;
            }
            Errors.error((SubLObject)module0048.$ic30$);
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3303(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != module0608.f37152(var2) || module0048.NIL != f3304(var2));
    }
    
    public static SubLObject f3355(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isInteger() || module0048.NIL != f3356(var2));
    }
    
    public static SubLObject f3356(final SubLObject var2) {
        return f3304(var2);
    }
    
    public static SubLObject f3357(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3327(var2) || module0048.NIL != module0004.f108(var2));
    }
    
    public static SubLObject f3358(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3328(var2) || module0048.NIL != module0004.f105(var2));
    }
    
    public static SubLObject f3359(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return Equality.eql(var56, var57);
    }
    
    public static SubLObject f3360(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return f3333(var56, var57);
    }
    
    public static SubLObject f3361(final SubLObject var56, final SubLObject var57) {
        return f3360(var57, var56);
    }
    
    public static SubLObject f3362(final SubLObject var56, final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3359(var56, var57) || module0048.NIL != f3360(var56, var57));
    }
    
    public static SubLObject f3363(final SubLObject var56, final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3359(var56, var57) || module0048.NIL != f3361(var56, var57));
    }
    
    public static SubLObject f3364(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return f3337(var56, var57);
    }
    
    public static SubLObject f3365(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return f3340(var56, var57);
    }
    
    public static SubLObject f3366(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return f3343(var56, var57);
    }
    
    public static SubLObject f3367(final SubLObject var56, final SubLObject var45) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3324(var45) : var45;
        final SubLObject var57 = f3343(var56, var45);
        if (module0048.NIL != f3304(var57)) {
            return var57;
        }
        return Numbers.truncate(var57, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3368(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3355(var57) : var57;
        return f3346(var56, var57);
    }
    
    public static SubLObject f3369(final SubLObject var56, final SubLObject var45) {
        assert module0048.NIL != f3355(var56) : var56;
        assert module0048.NIL != f3324(var45) : var45;
        final SubLObject var57 = f3346(var56, var45);
        if (module0048.NIL != f3304(var57)) {
            return var57;
        }
        return Numbers.truncate(var57, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3370(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != f3324(var2) || module0048.NIL != f3371(var2));
    }
    
    public static SubLObject f3371(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)module0048.$ic32$);
    }
    
    public static SubLObject f3372(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3332(var44, var45);
    }
    
    public static SubLObject f3373(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3333(var44, var45);
    }
    
    public static SubLObject f3374(final SubLObject var44, final SubLObject var45) {
        return f3373(var45, var44);
    }
    
    public static SubLObject f3375(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3335(var44, var45);
    }
    
    public static SubLObject f3376(final SubLObject var44, final SubLObject var45) {
        return f3375(var45, var44);
    }
    
    public static SubLObject f3377(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3337(var44, var45);
    }
    
    public static SubLObject f3378(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3340(var44, var45);
    }
    
    public static SubLObject f3379(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3343(var44, var45);
    }
    
    public static SubLObject f3380(final SubLObject var44, final SubLObject var45) {
        assert module0048.NIL != f3370(var44) : var44;
        assert module0048.NIL != f3370(var45) : var45;
        if (module0048.NIL != f3371(var44) || module0048.NIL != f3371(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        if (module0048.NIL != f3297(var44) && module0048.NIL != f3297(var45)) {
            return (SubLObject)module0048.$ic32$;
        }
        return f3346(var44, var45);
    }
    
    public static SubLObject f3381(final SubLObject var59, SubLObject var60) {
        if (var60 == module0048.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0048.IDENTITY);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var61) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic34$);
        }
        if (var60.eql(Symbols.symbol_function((SubLObject)module0048.IDENTITY)) || var60 == module0048.IDENTITY) {
            SubLObject var62 = var59.first();
            SubLObject var63 = var59.rest();
            SubLObject var64 = (SubLObject)module0048.NIL;
            var64 = var63.first();
            while (module0048.NIL != var63) {
                if (var64.numG(var62)) {
                    var62 = var64;
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            return var62;
        }
        return module0035.f2378(var59, Symbols.symbol_function((SubLObject)module0048.$ic35$), var60);
    }
    
    public static SubLObject f3382(final SubLObject var59, SubLObject var60) {
        if (var60 == module0048.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0048.IDENTITY);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var61) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic36$);
        }
        if (var60.eql(Symbols.symbol_function((SubLObject)module0048.IDENTITY)) || var60 == module0048.IDENTITY) {
            SubLObject var62 = var59.first();
            SubLObject var63 = var59.rest();
            SubLObject var64 = (SubLObject)module0048.NIL;
            var64 = var63.first();
            while (module0048.NIL != var63) {
                if (var64.numL(var62)) {
                    var62 = var64;
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            return var62;
        }
        return module0035.f2378(var59, Symbols.symbol_function((SubLObject)module0048.$ic37$), var60);
    }
    
    public static SubLObject f3383(final SubLObject var59, SubLObject var60) {
        if (var60 == module0048.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0048.IDENTITY);
        }
        if (var59.isCons()) {
            SubLObject var61 = (SubLObject)module0048.ZERO_INTEGER;
            SubLObject var62 = var59;
            SubLObject var63 = (SubLObject)module0048.NIL;
            var63 = var62.first();
            while (module0048.NIL != var62) {
                var61 = Numbers.add(var61, Functions.funcall(var60, var63));
                var62 = var62.rest();
                var63 = var62.first();
            }
            return Numbers.sublisp_float(Numbers.divide(var61, Sequences.length(var59)), (SubLObject)module0048.UNPROVIDED);
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3384(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic38$);
        }
        SubLObject var61 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var62 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var63 = var59;
        SubLObject var64 = (SubLObject)module0048.NIL;
        var64 = var63.first();
        while (module0048.NIL != var63) {
            var61 = Numbers.add(var61, var64);
            var62 = Numbers.add(var62, (SubLObject)module0048.ONE_INTEGER);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Numbers.divide(var61, var62);
    }
    
    public static SubLObject f3385(final SubLObject var59) {
        SubLObject var60 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var61 = var59;
        SubLObject var62 = (SubLObject)module0048.NIL;
        var62 = var61.first();
        while (module0048.NIL != var61) {
            var60 = Numbers.add(var60, var62);
            var61 = var61.rest();
            var62 = var61.first();
        }
        return var60;
    }
    
    public static SubLObject f3386(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic39$);
        }
        SubLObject var61 = (SubLObject)module0048.ONE_INTEGER;
        SubLObject var62 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var63 = var59;
        SubLObject var64 = (SubLObject)module0048.NIL;
        var64 = var63.first();
        while (module0048.NIL != var63) {
            var61 = Numbers.multiply(var61, var64);
            var62 = Numbers.add(var62, (SubLObject)module0048.ONE_INTEGER);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Numbers.expt(var61, Numbers.invert(var62));
    }
    
    public static SubLObject f3387(final SubLObject var59, SubLObject var60, SubLObject var68) {
        if (var60 == module0048.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0048.IDENTITY);
        }
        if (var68 == module0048.UNPROVIDED) {
            var68 = (SubLObject)module0048.$ic40$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic41$);
        }
        final SubLObject var70 = Sort.sort(conses_high.copy_list(var59), Symbols.symbol_function((SubLObject)module0048.$ic37$), var60);
        return f3388(var70, Sequences.length(var70), var60, var68);
    }
    
    public static SubLObject f3388(final SubLObject var59, SubLObject var16, SubLObject var60, SubLObject var68) {
        if (var16 == module0048.UNPROVIDED) {
            var16 = (SubLObject)module0048.NIL;
        }
        if (var60 == module0048.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0048.IDENTITY);
        }
        if (var68 == module0048.UNPROVIDED) {
            var68 = (SubLObject)module0048.$ic40$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic41$);
        }
        if (module0048.NIL == var16) {
            var16 = Sequences.length(var59);
        }
        final SubLObject var70 = Numbers.integerDivide(var16, (SubLObject)module0048.TWO_INTEGER);
        final SubLObject var71 = ConsesLow.nth(var70, var59);
        final SubLObject var72 = var68;
        if (var72.eql((SubLObject)module0048.$ic42$)) {
            if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && module0048.NIL == Numbers.oddp(var16)) {
                Errors.error((SubLObject)module0048.$ic43$);
            }
            return var71;
        }
        if (var72.eql((SubLObject)module0048.$ic40$)) {
            return (module0048.NIL != Numbers.oddp(var16)) ? Functions.funcall(var60, var71) : f3384((SubLObject)ConsesLow.list(Functions.funcall(var60, var71), Functions.funcall(var60, ConsesLow.nth(Numbers.subtract(var70, (SubLObject)module0048.ONE_INTEGER), var59))));
        }
        Errors.error((SubLObject)module0048.$ic44$, var68);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3389(final SubLObject var59, final SubLObject var73, SubLObject var74, SubLObject var60) {
        if (var74 == module0048.UNPROVIDED) {
            var74 = (SubLObject)module0048.$ic37$;
        }
        if (var60 == module0048.UNPROVIDED) {
            var60 = (SubLObject)module0048.IDENTITY;
        }
        return f3390(Sort.sort(conses_high.copy_list(var59), var74, var60), var73);
    }
    
    public static SubLObject f3390(final SubLObject var59, final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        assert module0048.NIL != f3300(var73) : var73;
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic46$);
        }
        final SubLObject var75 = Sequences.length(var59);
        final SubLObject var76 = Numbers.truncate(Numbers.multiply(var75, var73), (SubLObject)module0048.UNPROVIDED);
        return ConsesLow.nth(var76, var59);
    }
    
    public static SubLObject f3391(final SubLObject var76) {
        SubLObject var77 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var78 = (SubLObject)module0048.NIL;
        SubLObject var79 = (SubLObject)module0048.NIL;
        SubLObject var80 = (SubLObject)module0048.NIL;
        final Iterator var81 = Hashtables.getEntrySetIterator(var76);
        try {
            while (Hashtables.iteratorHasNext(var81)) {
                final Map.Entry var82 = Hashtables.iteratorNextEntry(var81);
                var79 = Hashtables.getEntryKey(var82);
                var80 = Hashtables.getEntryValue(var82);
                if (var80.numG(var77)) {
                    var77 = var80;
                    var78 = var79;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var81);
        }
        return var78;
    }
    
    public static SubLObject f3392(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic47$);
        }
        final SubLObject var61 = Hashtables.make_hash_table((SubLObject)module0048.TWENTY_INTEGER, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        SubLObject var62 = var59;
        SubLObject var63 = (SubLObject)module0048.NIL;
        var63 = var62.first();
        while (module0048.NIL != var62) {
            module0030.f1615(var63, var61, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
            var62 = var62.rest();
            var63 = var62.first();
        }
        return module0030.f1630(var61);
    }
    
    public static SubLObject f3393(final SubLObject var59) {
        final SubLObject var60 = f3392(var59);
        return Sort.sort(var60, (SubLObject)module0048.$ic35$, (SubLObject)module0048.$ic48$);
    }
    
    public static SubLObject f3394(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic49$);
        }
        final SubLObject var61 = Hashtables.make_hash_table((SubLObject)module0048.TWENTY_INTEGER, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        SubLObject var62 = var59;
        SubLObject var63 = (SubLObject)module0048.NIL;
        var63 = var62.first();
        while (module0048.NIL != var62) {
            module0030.f1615(var63, var61, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
            var62 = var62.rest();
            var63 = var62.first();
        }
        return f3391(var61);
    }
    
    public static SubLObject f3395(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic49$);
        }
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var61 = (SubLObject)module0048.NIL, var62 = (SubLObject)module0048.NIL, var63 = (SubLObject)module0048.NIL, var64 = (SubLObject)module0048.NIL, var65 = (SubLObject)module0048.NIL, var66 = (SubLObject)module0048.NIL, var61 = var59, var62 = Symbols.gensym((SubLObject)module0048.UNPROVIDED), var63 = var61.first(), var64 = (SubLObject)module0048.ONE_INTEGER, var65 = var59.first(), var66 = (SubLObject)module0048.ONE_INTEGER; module0048.NIL != var61; var61 = var61.rest(), var62 = var63, var63 = var61.first(), var64 = (SubLObject)(var63.eql(var62) ? Numbers.add(var64, (SubLObject)module0048.ONE_INTEGER) : module0048.ONE_INTEGER), var65 = (var64.numG(var66) ? var63 : var65), var66 = (var64.numG(var66) ? var64 : var66)) {}
        return var65;
    }
    
    public static SubLObject f3396(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic50$);
        }
        if (module0048.NIL != module0035.f1997(var59)) {
            Errors.warn((SubLObject)module0048.$ic51$);
            return Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        SubLObject var61 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var62 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var63 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var64 = var59;
        SubLObject var65 = (SubLObject)module0048.NIL;
        var65 = var64.first();
        while (module0048.NIL != var64) {
            var61 = Numbers.add(var61, f3282(var65));
            var62 = Numbers.add(var62, var65);
            var63 = Numbers.add(var63, (SubLObject)module0048.ONE_INTEGER);
            var64 = var64.rest();
            var65 = var64.first();
        }
        final SubLObject var66 = Numbers.divide(var62, var63);
        return Values.values(Numbers.subtract(Numbers.divide(var61, Numbers.subtract(var63, (SubLObject)module0048.ONE_INTEGER)), Numbers.multiply(Numbers.divide(var63, Numbers.subtract(var63, (SubLObject)module0048.ONE_INTEGER)), f3282(var66))), var66);
    }
    
    public static SubLObject f3397(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic50$);
        }
        SubLObject var61 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var62 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var63 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var64 = var59;
        SubLObject var65 = (SubLObject)module0048.NIL;
        var65 = var64.first();
        while (module0048.NIL != var64) {
            var61 = Numbers.add(var61, f3282(var65));
            var62 = Numbers.add(var62, var65);
            var63 = Numbers.add(var63, (SubLObject)module0048.ONE_INTEGER);
            var64 = var64.rest();
            var65 = var64.first();
        }
        final SubLObject var66 = Numbers.divide(var62, var63);
        return Values.values(Numbers.subtract(Numbers.divide(var61, var63), f3282(var66)), var66);
    }
    
    public static SubLObject f3398(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic50$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3397(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(var61, var62);
    }
    
    public static SubLObject f3399(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic52$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3397(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(Numbers.sqrt(var61), var62);
    }
    
    public static SubLObject f3400(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic52$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3396(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(Numbers.sqrt(var61), var62);
    }
    
    public static SubLObject f3401(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)module0048.$ic52$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3398(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(Numbers.sqrt(var61), var62);
    }
    
    public static SubLObject f3402(final SubLObject var94, final SubLObject var92, final SubLObject var95) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        if (var94.numE(var92)) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var96) && var95.isZero()) {
            Errors.error((SubLObject)module0048.$ic53$);
        }
        return Numbers.divide(Numbers.subtract(var94, var92), var95);
    }
    
    public static SubLObject f3403(final SubLObject var96, SubLObject var97) {
        if (var97 == module0048.UNPROVIDED) {
            var97 = (SubLObject)module0048.NIL;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = Sequences.length(var96);
        final SubLObject var100 = f3382(var96, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var101 = f3381(var96, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var102 = f3387(var96, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var103 = f3384(var96);
        final SubLObject var104 = f3401(var96);
        if (module0048.NIL != var97) {
            final SubLObject var105 = reader.$read_default_float_format$.currentBinding(var98);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0048.$ic54$, var98);
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic55$);
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic56$);
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic57$, var99);
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic58$, f3306(var100));
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic59$, f3306(var102));
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic60$, f3306(var103));
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic61$, f3306(var101));
                PrintLow.format((SubLObject)module0048.T, (SubLObject)module0048.$ic62$, f3306(var104));
                streams_high.terpri((SubLObject)module0048.T);
                streams_high.force_output((SubLObject)module0048.T);
            }
            finally {
                reader.$read_default_float_format$.rebind(var105, var98);
            }
        }
        return (SubLObject)ConsesLow.list(var99, var100, var102, var103, var101, var104);
    }
    
    public static SubLObject f3404(final SubLObject var102, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var104) && module0048.NIL == module0035.f2004(var102, var103)) {
            Errors.error((SubLObject)module0048.$ic63$, Sequences.length(var102));
        }
        SubLObject var105 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var106 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var107 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var108 = (SubLObject)module0048.NIL;
        SubLObject var109 = (SubLObject)module0048.NIL;
        SubLObject var110 = (SubLObject)module0048.NIL;
        SubLObject var111 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var112 = (SubLObject)module0048.NIL;
        SubLObject var43_111 = (SubLObject)module0048.NIL;
        SubLObject var113 = (SubLObject)module0048.NIL;
        SubLObject var113_114 = (SubLObject)module0048.NIL;
        var112 = var102;
        var43_111 = var112.first();
        var113 = var103;
        var113_114 = var113.first();
        while (module0048.NIL != var113 || module0048.NIL != var112) {
            if (var111.isZero()) {
                var108 = var43_111;
                var109 = var113_114;
            }
            else {
                final SubLObject var114 = Numbers.add(var111, (SubLObject)module0048.ONE_INTEGER);
                final SubLObject var115 = Numbers.divide(Numbers.subtract(var114, (SubLObject)module0048.$ic64$), var114);
                final SubLObject var116 = Numbers.subtract(var43_111, var108);
                final SubLObject var117 = Numbers.subtract(var113_114, var109);
                var105 = Numbers.add(var105, Numbers.multiply(var116, var116, var115));
                var106 = Numbers.add(var106, Numbers.multiply(var117, var117, var115));
                var107 = Numbers.add(var107, Numbers.multiply(var116, var117, var115));
                var108 = Numbers.add(var108, Numbers.divide(var116, var114));
                var109 = Numbers.add(var109, Numbers.divide(var117, var114));
                var110 = var114;
            }
            var111 = Numbers.add(var111, (SubLObject)module0048.ONE_INTEGER);
            var112 = var112.rest();
            var43_111 = var112.first();
            var113 = var113.rest();
            var113_114 = var113.first();
        }
        final SubLObject var118 = Numbers.sqrt(Numbers.divide(var105, var110));
        final SubLObject var119 = Numbers.sqrt(Numbers.divide(var106, var110));
        final SubLObject var120 = Numbers.divide(var107, var110);
        if (var118.isZero() || var119.isZero()) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        return Numbers.divide(var120, Numbers.multiply(var118, var119));
    }
    
    public static SubLObject f3405(SubLObject var3, final SubLObject var121) {
        assert module0048.NIL != Types.integerp(var3) : var3;
        assert module0048.NIL != Types.listp(var121) : var121;
        SubLObject var122 = (SubLObject)module0048.NIL;
        SubLObject var123 = var121;
        SubLObject var124 = (SubLObject)module0048.NIL;
        var124 = var123.first();
        while (module0048.NIL != var123) {
            if (var3.numE((SubLObject)module0048.ZERO_INTEGER)) {
                if (module0048.NIL == var122) {
                    var122 = (SubLObject)ConsesLow.cons(var3, var122);
                }
                return Sequences.nreverse(var122);
            }
            final SubLObject var125 = Numbers.mod(var3, var124);
            var3 = Numbers.integerDivide(var3, var124);
            var122 = (SubLObject)ConsesLow.cons(var125, var122);
            var123 = var123.rest();
            var124 = var123.first();
        }
        var122 = (SubLObject)ConsesLow.cons(var3, var122);
        return Sequences.nreverse(var122);
    }
    
    public static SubLObject f3406(final SubLObject var96, final SubLObject var121) {
        if (module0048.NIL == var96) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        if (module0048.NIL == var121) {
            return var96.first();
        }
        SubLObject var122 = f3406(var96.rest(), var121.rest());
        var122 = Numbers.multiply(var122, var121.first());
        var122 = Numbers.add(var122, var96.first());
        return var122;
    }
    
    public static SubLObject f3407(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)module0048.NIL;
        SubLObject var126 = (SubLObject)module0048.NIL;
        try {
            var124.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var127 = Errors.$error_handler$.currentBinding(var124);
            try {
                Errors.$error_handler$.bind((SubLObject)module0048.$ic66$, var124);
                try {
                    var125 = f3408(var123);
                }
                catch (Throwable var128) {
                    Errors.handleThrowable(var128, (SubLObject)module0048.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var127, var124);
            }
        }
        catch (Throwable var129) {
            var126 = Errors.handleThrowable(var129, module0003.$g3$.getGlobalValue());
        }
        finally {
            var124.throwStack.pop();
        }
        if (module0048.NIL != var126 && module0048.NIL == module0038.f2668((SubLObject)module0048.$ic67$, var126, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED)) {
            Errors.error((SubLObject)module0048.$ic68$, var126);
        }
        return module0035.sublisp_boolean(var125);
    }
    
    public static SubLObject f3408(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        if (var123.isString() && module0048.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0048.$ic69$), var123, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED) && module0048.NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)module0048.$ic70$), var123, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED)) {
            var124.resetMultipleValues();
            final SubLObject var125 = reader.read_from_string_ignoring_errors(var123, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
            final SubLObject var126 = var124.secondMultipleValue();
            var124.resetMultipleValues();
            if (var125.isNumber() && var126.eql(Sequences.length(var123))) {
                return var125;
            }
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3409(final SubLObject var126) {
        return Sequences.find(var126, module0048.$g980$.getGlobalValue(), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3410(final SubLObject var127) {
        if (module0048.NIL == module0038.f2731(var127)) {
            return (SubLObject)module0048.NIL;
        }
        final SubLObject var128 = Sequences.position_if((SubLObject)module0048.$ic72$, var127, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var129 = (module0048.NIL != var128) ? module0038.f2623(var127, (SubLObject)module0048.ZERO_INTEGER, var128) : var127;
        final SubLObject var130 = (SubLObject)((module0048.NIL != var128) ? module0038.f2623(var127, Numbers.add((SubLObject)module0048.ONE_INTEGER, var128), (SubLObject)module0048.UNPROVIDED) : module0048.NIL);
        SubLObject var131 = (SubLObject)module0048.NIL;
        if (module0048.NIL != module0038.f2608(var129)) {
            var131 = (SubLObject)module0048.T;
        }
        else {
            SubLObject var132 = (SubLObject)module0048.NIL;
            final SubLObject var133 = Sequences.elt(var129, (SubLObject)module0048.ZERO_INTEGER);
            if (Characters.CHAR_period.eql(var133)) {
                var132 = (SubLObject)module0048.T;
            }
            else if (module0048.NIL == Characters.digit_char_p(var133, (SubLObject)module0048.UNPROVIDED) && module0048.NIL == f3411(var133)) {
                var131 = (SubLObject)module0048.T;
            }
            final SubLObject var134 = var129;
            final SubLObject var135 = Sequences.length(var134);
            if (module0048.NIL == var131) {
                SubLObject var35_134;
                SubLObject var136;
                SubLObject var137;
                for (var35_134 = var135, var136 = (SubLObject)module0048.NIL, var136 = (SubLObject)module0048.ONE_INTEGER; module0048.NIL == var131 && !var136.numGE(var35_134); var136 = f_1X(var136)) {
                    var137 = Strings.sublisp_char(var134, var136);
                    if (module0048.NIL == Characters.digit_char_p(var137, (SubLObject)module0048.UNPROVIDED)) {
                        if (Characters.CHAR_period.eql(var137)) {
                            if (module0048.NIL != var132) {
                                var131 = (SubLObject)module0048.T;
                            }
                            else {
                                var132 = (SubLObject)module0048.T;
                            }
                        }
                        else {
                            var131 = (SubLObject)module0048.T;
                        }
                    }
                }
            }
        }
        if (module0048.NIL == var131 && module0048.NIL != var130) {
            if (module0048.NIL != module0038.f2608(var130)) {
                var131 = (SubLObject)module0048.T;
            }
            else {
                final SubLObject var138 = Sequences.elt(var130, (SubLObject)module0048.ZERO_INTEGER);
                if (module0048.NIL == Characters.digit_char_p(var138, (SubLObject)module0048.UNPROVIDED) && module0048.NIL == f3411(var138)) {
                    var131 = (SubLObject)module0048.T;
                }
                final SubLObject var139 = var130;
                final SubLObject var140 = Sequences.length(var139);
                if (module0048.NIL == var131) {
                    SubLObject var35_135;
                    SubLObject var141;
                    SubLObject var142;
                    for (var35_135 = var140, var141 = (SubLObject)module0048.NIL, var141 = (SubLObject)module0048.ONE_INTEGER; module0048.NIL == var131 && !var141.numGE(var35_135); var141 = f_1X(var141)) {
                        var142 = Strings.sublisp_char(var139, var141);
                        if (module0048.NIL == Characters.digit_char_p(var142, (SubLObject)module0048.UNPROVIDED)) {
                            var131 = (SubLObject)module0048.T;
                        }
                    }
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL == var131);
    }
    
    public static SubLObject f3412(final SubLObject var126) {
        return Sequences.find(var126, module0048.$g981$.getGlobalValue(), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3411(final SubLObject var126) {
        return Sequences.find(var126, module0048.$g982$.getGlobalValue(), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3413(final SubLObject var138) {
        SubLObject var139 = f_1_(Numbers.expt((SubLObject)module0048.TWO_INTEGER, var138));
        SubLObject var140 = (SubLObject)module0048.NIL;
        while (module0048.NIL == var140) {
            if (module0048.NIL != f3414(var139)) {
                var140 = var139;
            }
            else {
                var139 = Numbers.subtract(var139, (SubLObject)module0048.ONE_INTEGER);
            }
        }
        return var140;
    }
    
    public static SubLObject f3415() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0048.NIL != module0004.f105(module0048.$g984$.getGlobalValue()) && module0048.NIL != module0004.f105(module0048.$g985$.getGlobalValue()));
    }
    
    public static SubLObject f3416(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        module0048.$g988$.setDynamicValue(Numbers.add(module0048.$g988$.getDynamicValue(var142), var141), var142);
        if (module0048.$g985$.getGlobalValue().numL(module0048.$g988$.getDynamicValue(var142))) {
            module0048.$g988$.setDynamicValue(Numbers.subtract(module0048.$g988$.getDynamicValue(var142), module0048.$g985$.getGlobalValue()), var142);
        }
        module0048.$g989$.setDynamicValue(Numbers.add(module0048.$g989$.getDynamicValue(var142), module0048.$g988$.getDynamicValue(var142)), var142);
        if (module0048.$g985$.getGlobalValue().numL(module0048.$g989$.getDynamicValue(var142))) {
            module0048.$g989$.setDynamicValue(Numbers.subtract(module0048.$g989$.getDynamicValue(var142), module0048.$g985$.getGlobalValue()), var142);
        }
        return var141;
    }
    
    public static SubLObject f3417() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(module0048.$g989$.getDynamicValue(var10), module0048.$g988$.getDynamicValue(var10));
    }
    
    public static SubLObject f3418(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic86$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)module0048.NIL;
        SubLObject var148 = (SubLObject)module0048.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic86$);
        var147 = var145.first();
        var145 = var145.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic86$);
        var148 = var145.first();
        var145 = var145.rest();
        if (module0048.NIL == var145) {
            final SubLObject var149;
            var145 = (var149 = var146);
            return (SubLObject)ConsesLow.listS((SubLObject)module0048.$ic87$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.$ic88$, var147), (SubLObject)ConsesLow.list((SubLObject)module0048.$ic89$, var148)), ConsesLow.append(var149, (SubLObject)module0048.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)module0048.$ic86$);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3419(final SubLObject var142, final SubLObject var143) {
        final SubLObject var144 = var142.rest();
        final SubLObject var146;
        final SubLObject var145 = var146 = var144;
        return (SubLObject)ConsesLow.listS((SubLObject)module0048.$ic84$, (SubLObject)module0048.$ic90$, ConsesLow.append(var146, (SubLObject)module0048.NIL));
    }
    
    public static SubLObject f3420(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic91$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)module0048.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic91$);
        var147 = var145.first();
        var145 = var145.rest();
        if (module0048.NIL == var145) {
            final SubLObject var148;
            var145 = (var148 = var146);
            return (SubLObject)ConsesLow.listS((SubLObject)module0048.$ic84$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.$ic48$, var147), (SubLObject)ConsesLow.list((SubLObject)module0048.$ic92$, var147)), ConsesLow.append(var148, (SubLObject)module0048.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)module0048.$ic91$);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3421(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic93$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)module0048.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic93$);
        var147 = var145.first();
        var145 = var145.rest();
        if (module0048.NIL == var145) {
            final SubLObject var148;
            var145 = (var148 = var146);
            return reader.bq_cons((SubLObject)module0048.$ic94$, ConsesLow.append(var148, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0048.$ic95$, var147, (SubLObject)module0048.$ic96$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)module0048.$ic93$);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3422(final SubLObject var1, final SubLObject var31, final SubLObject var160) {
        SubLObject var161 = Numbers.mod(var1, var160);
        SubLObject var162;
        SubLObject var163;
        for (var162 = Numbers.subtract(var31, (SubLObject)module0048.ONE_INTEGER), var163 = (SubLObject)module0048.NIL, var163 = (SubLObject)module0048.ZERO_INTEGER; var163.numL(var162); var163 = Numbers.add(var163, (SubLObject)module0048.ONE_INTEGER)) {
            var161 = Numbers.mod(Numbers.multiply(var161, var1), var160);
        }
        return var161;
    }
    
    public static SubLObject f3423(final SubLObject var1, final SubLObject var31, final SubLObject var160) {
        final SubLObject var161 = Sequences.subseq(f3424(var31), (SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.UNPROVIDED);
        SubLObject var162 = Numbers.mod(var1, var160);
        final SubLObject var163 = var161;
        SubLObject var35_164;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (var35_164 = Sequences.length(var163)), var165 = (SubLObject)module0048.NIL, var165 = (SubLObject)module0048.ZERO_INTEGER; !var165.numGE(var35_164); var165 = f_1X(var165)) {
            var166 = Strings.sublisp_char(var163, var165);
            if (var166.eql((SubLObject)Characters.CHAR_0)) {
                var162 = Numbers.mod(f3282(var162), var160);
            }
            else {
                var162 = Numbers.mod(f3282(var162), var160);
                var162 = Numbers.mod(Numbers.multiply(var162, var1), var160);
            }
        }
        return var162;
    }
    
    public static SubLObject f3424(final SubLObject var41) {
        return PrintLow.write_to_string(var41, new SubLObject[] { module0048.$ic97$, module0048.TWO_INTEGER });
    }
    
    public static SubLObject f3425(final SubLObject var41) {
        return PrintLow.format((SubLObject)module0048.NIL, (SubLObject)module0048.$ic98$, var41);
    }
    
    public static SubLObject f3426(final SubLObject var165, final SubLObject var166, final SubLObject var160) {
        return Numbers.mod(Numbers.subtract(var165, var166), var160);
    }
    
    public static SubLObject f3427(final SubLObject var165, final SubLObject var166, final SubLObject var160) {
        return Numbers.mod(Numbers.add(var165, var166), var160);
    }
    
    public static SubLObject f3428(final SubLObject var165, final SubLObject var166, final SubLObject var41) {
        return Equality.eq(Numbers.mod(var165, var41), Numbers.mod(var166, var41));
    }
    
    public static SubLObject f3429(final SubLObject var41) {
        if (var41.isNumber()) {
            return var41.isNegative() ? Numbers.subtract(Sequences.length(PrintLow.write_to_string(var41, module0048.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)module0048.ONE_INTEGER) : Sequences.length(PrintLow.write_to_string(var41, module0048.EMPTY_SUBL_OBJECT_ARRAY));
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3430(final SubLObject var167, final SubLObject var168) {
        if (var167.isInteger() && var168.isInteger() && !var167.isZero()) {
            return Types.integerp(Numbers.divide(var168, var167));
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3431(final SubLObject var169, final SubLObject var168) {
        SubLObject var170 = var169;
        SubLObject var171 = (SubLObject)module0048.NIL;
        var171 = var170.first();
        while (module0048.NIL != var170) {
            if (module0048.NIL == f3430(var171, var168)) {
                return (SubLObject)module0048.NIL;
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        return (SubLObject)module0048.T;
    }
    
    public static SubLObject f3414(final SubLObject var2) {
        if (module0048.NIL == module0004.f105(var2)) {
            return (SubLObject)module0048.NIL;
        }
        if (var2.eql((SubLObject)module0048.ONE_INTEGER)) {
            return (SubLObject)module0048.NIL;
        }
        return Equality.eql(var2, f3432(var2));
    }
    
    public static SubLObject f3433(SubLObject var170) {
        assert module0048.NIL != module0004.f105(var170) : var170;
        if (var170.eql((SubLObject)module0048.ONE_INTEGER)) {
            return (SubLObject)module0048.NIL;
        }
        SubLObject var171 = (SubLObject)module0048.NIL;
        while (!module0048.ONE_INTEGER.eql(var170)) {
            final SubLObject var172 = f3432(var170);
            var171 = (SubLObject)ConsesLow.cons(var172, var171);
            var170 = Numbers.divide(var170, var172);
        }
        return Sort.sort(var171, Symbols.symbol_function((SubLObject)module0048.$ic37$), (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3432(final SubLObject var170) {
        SubLObject var171 = (SubLObject)module0048.NIL;
        if (module0048.NIL != Numbers.evenp(var170)) {
            var171 = (SubLObject)module0048.TWO_INTEGER;
        }
        else if (Numbers.mod(var170, (SubLObject)module0048.THREE_INTEGER).isZero()) {
            var171 = (SubLObject)module0048.THREE_INTEGER;
        }
        else {
            final SubLObject var172 = Numbers.sqrt(var170);
            final SubLObject var173 = (SubLObject)module0048.SIX_INTEGER;
            final SubLObject var174 = f_1X(var172);
            final SubLObject var175 = Types.integerp(var172);
            if (module0048.NIL != var175) {
                var171 = var172;
            }
            if (module0048.NIL == var171) {
                SubLObject var176;
                SubLObject var177;
                for (var176 = var174, var177 = (SubLObject)module0048.NIL, var177 = var173; module0048.NIL == var171 && !var177.numGE(var176); var177 = Numbers.add(var177, (SubLObject)module0048.SIX_INTEGER)) {
                    if (Numbers.mod(var170, f_1_(var177)).isZero()) {
                        var171 = f_1_(var177);
                    }
                    else if (Numbers.mod(var170, f_1X(var177)).isZero()) {
                        var171 = f_1X(var177);
                    }
                }
            }
        }
        return (module0048.NIL != var171) ? var171 : var170;
    }
    
    public static SubLObject lcm(final SubLObject var177) {
        assert module0048.NIL != module0035.f2015(var177) : var177;
        SubLObject var178 = var177;
        SubLObject var179 = (SubLObject)module0048.NIL;
        var179 = var178.first();
        while (module0048.NIL != var178) {
            assert module0048.NIL != Types.integerp(var179) : var179;
            var178 = var178.rest();
            var179 = var178.first();
        }
        if (module0048.NIL == var177) {
            return (SubLObject)module0048.ONE_INTEGER;
        }
        SubLObject var180 = conses_high.copy_list(var177);
        var180 = module0035.f2076(Symbols.symbol_function((SubLObject)module0048.$ic100$), var180);
        var180 = module0035.f2269(var180, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        if (module0048.NIL != module0035.f1997(var180)) {
            return var180.first();
        }
        if (module0048.NIL != module0004.f104((SubLObject)module0048.ZERO_INTEGER, var180, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED)) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        return Sequences.creduce(Symbols.symbol_function((SubLObject)module0048.$ic101$), var180, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3434(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != Types.integerp(var56) : var56;
        assert module0048.NIL != Types.integerp(var57) : var57;
        if (var56.isZero() || var57.isZero()) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        return f3435(Numbers.abs(var56), Numbers.abs(var57));
    }
    
    public static SubLObject f3435(final SubLObject var56, final SubLObject var57) {
        final SubLObject var58 = f3436(var56, var57);
        return Numbers.multiply(var57, Numbers.divide(var56, var58));
    }
    
    public static SubLObject gcd(final SubLObject var177) {
        assert module0048.NIL != module0035.f2015(var177) : var177;
        SubLObject var178 = var177;
        SubLObject var179 = (SubLObject)module0048.NIL;
        var179 = var178.first();
        while (module0048.NIL != var178) {
            assert module0048.NIL != Types.integerp(var179) : var179;
            var178 = var178.rest();
            var179 = var178.first();
        }
        if (module0048.NIL == var177) {
            return (SubLObject)module0048.ZERO_INTEGER;
        }
        SubLObject var180 = conses_high.copy_list(var177);
        var180 = module0035.f2076(Symbols.symbol_function((SubLObject)module0048.$ic100$), var180);
        var180 = module0035.f2269(var180, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        if (module0048.NIL != module0035.f1997(var180)) {
            return var180.first();
        }
        return Sequences.creduce(Symbols.symbol_function((SubLObject)module0048.$ic102$), var180, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
    }
    
    public static SubLObject f3437(final SubLObject var56, final SubLObject var57) {
        assert module0048.NIL != Types.integerp(var56) : var56;
        assert module0048.NIL != Types.integerp(var57) : var57;
        return f3436(Numbers.abs(var56), Numbers.abs(var57));
    }
    
    public static SubLObject f3436(final SubLObject var56, final SubLObject var57) {
        if (var56.numG(var57)) {
            return f3438(var56, var57);
        }
        return f3438(var57, var56);
    }
    
    public static SubLObject f3438(final SubLObject var182, final SubLObject var183) {
        if (var183.isZero()) {
            return var182;
        }
        return f3438(var183, Numbers.mod(var182, var183));
    }
    
    public static SubLObject f3439(final SubLObject var184) {
        final SubLObject var185 = Sequences.reverse(var184);
        final SubLObject var186 = Sequences.length(var185);
        SubLObject var187 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var188;
        for (var188 = (SubLObject)module0048.NIL, var188 = (SubLObject)module0048.ZERO_INTEGER; var188.numL(var186); var188 = Numbers.add(var188, (SubLObject)module0048.ONE_INTEGER)) {
            var187 = Numbers.add(var187, Numbers.multiply(Numbers.expt((SubLObject)module0048.SIXTEEN_INTEGER, var188), f3440(Vectors.aref(var185, var188))));
        }
        return var187;
    }
    
    public static SubLObject f3440(final SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        SubLObject var138 = Characters.digit_char_p(var136, (SubLObject)module0048.UNPROVIDED);
        if (module0048.NIL == var138) {
            var138 = conses_high.second(conses_high.assoc(var136, module0048.$g990$.getDynamicValue(var137), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED));
        }
        return var138;
    }
    
    public static SubLObject f3441(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        SubLObject var146 = (SubLObject)module0048.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0048.$ic104$);
        var146 = var145.first();
        final SubLObject var147;
        var145 = (var147 = var145.rest());
        final SubLObject var148 = (SubLObject)module0048.$ic105$;
        return (SubLObject)ConsesLow.list((SubLObject)module0048.$ic87$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var148, var146)), (SubLObject)ConsesLow.listS((SubLObject)module0048.$ic106$, var148, (SubLObject)module0048.$ic107$), (SubLObject)ConsesLow.listS((SubLObject)module0048.$ic108$, (SubLObject)ConsesLow.list((SubLObject)module0048.$ic109$, var148), ConsesLow.append(var147, (SubLObject)module0048.NIL)));
    }
    
    public static SubLObject f3442(final SubLObject var2) {
        return module0552.f34082(var2);
    }
    
    public static SubLObject f3443(final SubLObject var192) {
        assert module0048.NIL != f3442(var192) : var192;
        if (module0048.ONE_INTEGER.numE(var192)) {
            return (SubLObject)module0048.T;
        }
        if (module0048.ZERO_INTEGER.numE(var192)) {
            return (SubLObject)module0048.NIL;
        }
        return f3444(var192, (SubLObject)module0048.ONE_INTEGER);
    }
    
    public static SubLObject f3444(final SubLObject var192, final SubLObject var193) {
        final SubLObject var194 = Numbers.round(Numbers.divide((SubLObject)module0048.ONE_INTEGER, var192), (SubLObject)module0048.UNPROVIDED);
        if (var194.numG(var193)) {
            return Numbers.numL(random.random(var194), var193);
        }
        final SubLObject var195 = Numbers.multiply((SubLObject)module0048.$ic111$, var193);
        final SubLObject var196 = Numbers.divide(var192, (SubLObject)module0048.$ic111$);
        return f3444(var196, var195);
    }
    
    public static SubLObject f3445() {
        return Numbers.zerop(random.random((SubLObject)module0048.TWO_INTEGER));
    }
    
    public static SubLObject f3446(final SubLObject var2) {
        if (module0048.NIL != module0035.f2327(var2)) {
            SubLObject var3 = (SubLObject)module0048.ZERO_INTEGER;
            SubLObject var4;
            SubLObject var5;
            SubLObject var6;
            for (var4 = (SubLObject)module0048.NIL, var4 = var2; module0048.NIL != var4; var4 = conses_high.cddr(var4)) {
                var5 = var4.first();
                var6 = conses_high.cadr(var4);
                if (module0048.NIL == f3294(var6)) {
                    return (SubLObject)module0048.NIL;
                }
                var3 = Numbers.add(var3, var6);
            }
            if (Numbers.abs(f_1_(var3)).numL((SubLObject)module0048.$ic112$)) {
                return (SubLObject)module0048.T;
            }
        }
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3447(final SubLObject var199) {
        assert module0048.NIL != f3446(var199) : var199;
        final SubLObject var200 = f3448();
        SubLObject var201 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var202;
        SubLObject var203;
        SubLObject var204;
        for (var202 = (SubLObject)module0048.NIL, var202 = var199; module0048.NIL != var202; var202 = conses_high.cddr(var202)) {
            var203 = var202.first();
            var204 = conses_high.cadr(var202);
            var201 = Numbers.add(var201, var204);
            if (var200.numL(var201)) {
                return var203;
            }
        }
        return Errors.error((SubLObject)module0048.$ic114$, var199, var200, var201);
    }
    
    public static SubLObject f3449(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        assert module0048.NIL != module0004.f106(var41) : var41;
        SubLObject var43 = (SubLObject)module0048.NIL;
        final SubLObject var45;
        final SubLObject var44 = var45 = module0034.f1854((SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED);
        final SubLObject var46 = module0034.$g879$.currentBinding(var42);
        try {
            module0034.$g879$.bind(var45, var42);
            SubLObject var47 = (SubLObject)module0048.NIL;
            if (module0048.NIL != var45 && module0048.NIL == module0034.f1842(var45)) {
                var47 = module0034.f1869(var45);
                final SubLObject var48 = Threads.current_process();
                if (module0048.NIL == var47) {
                    module0034.f1873(var45, var48);
                }
                else if (!var47.eql(var48)) {
                    Errors.error((SubLObject)module0048.$ic116$);
                }
            }
            try {
                var43 = f3450(var41);
            }
            finally {
                final SubLObject var13_206 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0048.T, var42);
                    if (module0048.NIL != var45 && module0048.NIL == var47) {
                        module0034.f1873(var45, (SubLObject)module0048.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var13_206, var42);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var46, var42);
        }
        return var43;
    }
    
    public static SubLObject f3451(final SubLObject var41) {
        if (var41.eql((SubLObject)module0048.ZERO_INTEGER)) {
            return (SubLObject)module0048.ONE_INTEGER;
        }
        if (var41.eql((SubLObject)module0048.ONE_INTEGER)) {
            return (SubLObject)module0048.ONE_INTEGER;
        }
        return Numbers.add(f3450(Numbers.subtract(var41, (SubLObject)module0048.ONE_INTEGER)), f3450(Numbers.subtract(var41, (SubLObject)module0048.TWO_INTEGER)));
    }
    
    public static SubLObject f3450(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0034.$g879$.getDynamicValue(var42);
        SubLObject var44 = (SubLObject)module0048.NIL;
        if (module0048.NIL == var43) {
            return f3451(var41);
        }
        var44 = module0034.f1857(var43, (SubLObject)module0048.$ic117$, (SubLObject)module0048.UNPROVIDED);
        if (module0048.NIL == var44) {
            var44 = module0034.f1807(module0034.f1842(var43), (SubLObject)module0048.$ic117$, (SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.NIL, (SubLObject)module0048.EQL, (SubLObject)module0048.UNPROVIDED);
            module0034.f1860(var43, (SubLObject)module0048.$ic117$, var44);
        }
        SubLObject var45 = module0034.f1814(var44, var41, (SubLObject)module0048.$ic118$);
        if (var45 == module0048.$ic118$) {
            var45 = Values.arg2(var42.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f3451(var41)));
            module0034.f1816(var44, var41, var45, (SubLObject)module0048.UNPROVIDED);
        }
        return module0034.f1959(var45);
    }
    
    public static SubLObject f3452() {
        return Numbers.divide(random.random(random.$rand_max$.getGlobalValue()), random.$rand_max$.getGlobalValue());
    }
    
    public static SubLObject f3448() {
        return f3452();
    }
    
    public static SubLObject f3453(final SubLObject var41, final SubLObject var210, SubLObject var211) {
        if (var211 == module0048.UNPROVIDED) {
            var211 = (SubLObject)module0048.NIL;
        }
        assert module0048.NIL != module0004.f106(var41) : var41;
        assert module0048.NIL != module0004.f105(var210) : var210;
        if (module0048.NIL != var211 && !module0048.areAssertionsDisabledFor(me) && module0048.NIL == Types.function_spec_p(var211)) {
            throw new AssertionError(var211);
        }
        final SubLObject var212 = f3454(var210);
        final SubLObject var213 = module0035.f2101(var41, var212);
        return (module0048.NIL != var211) ? Sort.sort(var213, var211, (SubLObject)module0048.UNPROVIDED) : var213;
    }
    
    public static SubLObject f3454(final SubLObject var210) {
        assert module0048.NIL != module0004.f105(var210) : var210;
        SubLObject var212;
        final SubLObject var211 = var212 = (SubLObject)ConsesLow.make_list(var210, (SubLObject)module0048.UNPROVIDED);
        SubLObject var213;
        for (var213 = (SubLObject)module0048.NIL, var213 = (SubLObject)module0048.ZERO_INTEGER; var213.numL(var210); var213 = Numbers.add(var213, (SubLObject)module0048.ONE_INTEGER)) {
            ConsesLow.rplaca(var212, var213);
            var212 = var212.rest();
        }
        return var211;
    }
    
    public static SubLObject f3455(final SubLObject var213, SubLObject var214) {
        if (var214 == module0048.UNPROVIDED) {
            var214 = (SubLObject)module0048.NIL;
        }
        SubLObject var215 = (SubLObject)module0048.NIL;
        if (module0048.NIL != var213) {
            SubLObject var216 = (SubLObject)module0048.NIL;
            SubLObject var217 = (SubLObject)module0048.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var213, var213, (SubLObject)module0048.$ic120$);
            var216 = var213.first();
            final SubLObject var218 = var217 = var213.rest();
            SubLObject var219 = var216;
            SubLObject var220 = var217;
            SubLObject var221 = (SubLObject)module0048.NIL;
            var221 = var220.first();
            while (module0048.NIL != var220) {
                final SubLObject var222 = Numbers.subtract(var221, var219);
                var215 = (SubLObject)ConsesLow.cons(var222, var215);
                var219 = var221;
                var220 = var220.rest();
                var221 = var220.first();
            }
            if (module0048.NIL != var214) {
                final SubLObject var223 = Numbers.subtract(var214, var219);
                var215 = (SubLObject)ConsesLow.cons(var223, var215);
            }
        }
        return Sequences.nreverse(var215);
    }
    
    public static SubLObject f3456(final SubLObject var41) {
        assert module0048.NIL != module0004.f106(var41) : var41;
        SubLObject var42 = (SubLObject)module0048.ONE_INTEGER;
        SubLObject var43;
        for (var43 = (SubLObject)module0048.NIL, var43 = (SubLObject)module0048.ZERO_INTEGER; var43.numL(var41); var43 = Numbers.add(var43, (SubLObject)module0048.ONE_INTEGER)) {
            var42 = Numbers.multiply(var42, f_1X(var43));
        }
        return var42;
    }
    
    public static SubLObject f3457(final SubLObject var41, final SubLObject var224) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        assert module0048.NIL != module0004.f106(var41) : var41;
        assert module0048.NIL != module0004.f106(var224) : var224;
        if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var225) && !var224.numLE(var41)) {
            Errors.error((SubLObject)module0048.$ic121$, var41, var224);
        }
        SubLObject var226 = (SubLObject)module0048.ONE_INTEGER;
        SubLObject var227;
        SubLObject var228;
        for (var227 = Numbers.subtract(var41, var224), var228 = (SubLObject)module0048.NIL, var228 = var41; !var228.numLE(var227); var228 = Numbers.add(var228, (SubLObject)module0048.MINUS_ONE_INTEGER)) {
            assert module0048.NIL != module0004.f105(var228) : var228;
            var226 = Numbers.multiply(var226, var228);
        }
        return Numbers.integerDivide(var226, f3456(var224));
    }
    
    public static SubLObject f3458(final SubLObject var43) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var43.isNumber() && var43.numG((SubLObject)module0048.ZERO_INTEGER) && var43.numL((SubLObject)module0048.ONE_INTEGER));
    }
    
    public static SubLObject f3459(final SubLObject var43) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var43.isNumber() && var43.numL((SubLObject)module0048.ZERO_INTEGER) && var43.numG((SubLObject)module0048.MINUS_ONE_INTEGER));
    }
    
    public static SubLObject f3460(final SubLObject var44, final SubLObject var45, SubLObject var225) {
        if (var225 == module0048.UNPROVIDED) {
            var225 = (SubLObject)module0048.ZERO_INTEGER;
        }
        return Numbers.numLE(Numbers.abs(Numbers.subtract(var44, var45)), var225);
    }
    
    public static SubLObject f3461(SubLObject var226) {
        if (var226 == module0048.UNPROVIDED) {
            var226 = (SubLObject)module0048.NIL;
        }
        return (SubLObject)module0048.ZERO_INTEGER;
    }
    
    public static SubLObject f3462(SubLObject var226) {
        if (var226 == module0048.UNPROVIDED) {
            var226 = (SubLObject)module0048.NIL;
        }
        return (SubLObject)module0048.ONE_INTEGER;
    }
    
    public static SubLObject f3463(final SubLObject var227) {
        SubLObject var228 = (SubLObject)module0048.NIL;
        final SubLObject var229 = var227.rest();
        SubLObject var230 = var227.first();
        SubLObject var231 = var229;
        SubLObject var232 = (SubLObject)module0048.NIL;
        var232 = var231.first();
        while (module0048.NIL != var231) {
            SubLObject var234;
            final SubLObject var233 = var234 = var230;
            SubLObject var235 = (SubLObject)module0048.NIL;
            SubLObject var236 = (SubLObject)module0048.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var234, var233, (SubLObject)module0048.$ic122$);
            var235 = var234.first();
            var234 = var234.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var234, var233, (SubLObject)module0048.$ic122$);
            var236 = var234.first();
            var234 = var234.rest();
            if (module0048.NIL == var234) {
                SubLObject var238_239;
                final SubLObject var236_237 = var238_239 = var232;
                SubLObject var237 = (SubLObject)module0048.NIL;
                SubLObject var238 = (SubLObject)module0048.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)module0048.$ic123$);
                var237 = var238_239.first();
                var238_239 = var238_239.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)module0048.$ic123$);
                var238 = var238_239.first();
                var238_239 = var238_239.rest();
                if (module0048.NIL == var238_239) {
                    final SubLObject var239 = Numbers.divide(Numbers.subtract(var238, var236), Numbers.subtract(var237, var235));
                    var228 = (SubLObject)ConsesLow.cons(var239, var228);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var236_237, (SubLObject)module0048.$ic123$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var233, (SubLObject)module0048.$ic122$);
            }
            var230 = var232;
            var231 = var231.rest();
            var232 = var231.first();
        }
        return Sequences.nreverse(var228);
    }
    
    public static SubLObject f3464(final SubLObject var96) {
        SubLObject var97 = (SubLObject)module0048.NIL;
        SubLObject var98 = (SubLObject)module0048.NIL;
        SubLObject var99 = (SubLObject)module0048.NIL;
        SubLObject var100 = (SubLObject)module0048.NIL;
        var98 = var96;
        var99 = var98.first();
        for (var100 = (SubLObject)module0048.ZERO_INTEGER; module0048.NIL != var98; var98 = var98.rest(), var99 = var98.first(), var100 = Numbers.add((SubLObject)module0048.ONE_INTEGER, var100)) {
            var97 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var100, var99), var97);
        }
        return Sequences.nreverse(var97);
    }
    
    public static SubLObject f3465(final SubLObject var243) {
        return Mapping.mapcar((SubLObject)module0048.$ic124$, var243);
    }
    
    public static SubLObject f3466(final SubLObject var227) {
        final SubLObject var228 = f3463(var227);
        return f3464(var228);
    }
    
    public static SubLObject f3467(final SubLObject var59, SubLObject var246) {
        if (var246 == module0048.UNPROVIDED) {
            var246 = (SubLObject)module0048.$ic125$;
        }
        assert module0048.NIL != module0004.f106(var246) : var246;
        final SubLObject var247 = (module0048.NIL != Numbers.oddp(var246)) ? Numbers.integerDivide(Numbers.subtract(var246, (SubLObject)module0048.ONE_INTEGER), (SubLObject)module0048.TWO_INTEGER) : Numbers.integerDivide(var246, (SubLObject)module0048.TWO_INTEGER);
        final SubLObject var248 = Numbers.add(var247, var247, (SubLObject)module0048.ONE_INTEGER);
        final SubLObject var249 = module0055.f4017();
        SubLObject var250 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var251 = var59;
        SubLObject var252 = (SubLObject)module0048.NIL;
        SubLObject var253;
        SubLObject var254;
        for (var253 = (SubLObject)module0048.NIL, var253 = (SubLObject)module0048.ZERO_INTEGER; var253.numL(var248); var253 = Numbers.add(var253, (SubLObject)module0048.ONE_INTEGER)) {
            var254 = var251.first();
            module0055.f4021(var254, var249);
            var250 = Numbers.add(var250, var254);
            if (var253.numL(var247)) {
                var252 = (SubLObject)ConsesLow.cons(var254, var252);
            }
            var251 = var251.rest();
        }
        SubLObject var255 = var251;
        var254 = (SubLObject)module0048.NIL;
        var254 = var255.first();
        while (module0048.NIL != var255) {
            assert module0048.NIL != Types.numberp(var254) : var254;
            var252 = (SubLObject)ConsesLow.cons(Numbers.floor(var250, var248), var252);
            module0055.f4021(var254, var249);
            var250 = Numbers.add(var250, var254);
            final SubLObject var256 = module0055.f4023(var249);
            var250 = Numbers.subtract(var250, var256);
            var255 = var255.rest();
            var254 = var255.first();
        }
        var252 = (SubLObject)ConsesLow.cons(Numbers.divide(var250, var248), var252);
        SubLObject var257;
        SubLObject var258;
        for (var257 = Numbers.add(var247, (SubLObject)module0048.ONE_INTEGER), var258 = (SubLObject)module0048.NIL, var258 = (SubLObject)module0048.ZERO_INTEGER; var258.numL(var257); var258 = Numbers.add(var258, (SubLObject)module0048.ONE_INTEGER)) {
            module0055.f4023(var249);
        }
        while (module0048.NIL == module0055.f4019(var249)) {
            final SubLObject var259 = module0055.f4023(var249);
            var252 = (SubLObject)ConsesLow.cons(var259, var252);
        }
        return Sequences.nreverse(var252);
    }
    
    public static SubLObject f3468(final SubLObject var253, final SubLObject var254) {
        SubLObject var255 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var256 = Numbers.subtract(Sequences.length(var254), (SubLObject)module0048.ONE_INTEGER);
        while (var255.numLE(var256)) {
            final SubLObject var257 = Numbers.integerDivide(Numbers.add(var255, var256), (SubLObject)module0048.TWO_INTEGER);
            final SubLObject var258 = Vectors.aref(var254, var257);
            if (var258.numE(var253)) {
                return (SubLObject)module0048.$ic128$;
            }
            if (var258.numL(var253)) {
                var255 = Numbers.add(var257, (SubLObject)module0048.ONE_INTEGER);
            }
            else {
                if (!var258.numG(var253)) {
                    continue;
                }
                var256 = Numbers.subtract(var257, (SubLObject)module0048.ONE_INTEGER);
            }
        }
        final SubLObject var259 = var255;
        return Numbers.subtract(var253, var259);
    }
    
    public static SubLObject f3469(final SubLObject var259, final SubLObject var260) {
        final SubLObject var261 = f3470(var259, var260);
        final SubLObject var262 = module0035.f2105(var259);
        SubLObject var263;
        SubLObject var264;
        SubLObject var265;
        for (var263 = (SubLObject)module0048.NIL, var263 = (SubLObject)module0048.ZERO_INTEGER; var263.numL(var260); var263 = Numbers.add(var263, (SubLObject)module0048.ONE_INTEGER)) {
            var264 = Hashtables.gethash(var263, var261, (SubLObject)module0048.UNPROVIDED);
            var265 = f3468(var263, var262);
            if (!var264.eql(var265)) {
                if (!var264.numE(var265)) {
                    Errors.error((SubLObject)module0048.$ic131$, var263, var264, var265);
                }
            }
        }
        return (SubLObject)module0048.$ic132$;
    }
    
    public static SubLObject f3471(final SubLObject var259) {
        SubLObject var260 = (SubLObject)module0048.NIL;
        SubLObject var262;
        SubLObject var261 = var262 = var259.first();
        SubLObject var263 = (SubLObject)module0048.ONE_INTEGER;
        SubLObject var264 = var259.rest();
        SubLObject var265 = (SubLObject)module0048.NIL;
        var265 = var264.first();
        while (module0048.NIL != var264) {
            var262 = Numbers.add(var262, (SubLObject)module0048.ONE_INTEGER);
            if (var262.numE(var265)) {
                var263 = Numbers.add(var263, (SubLObject)module0048.ONE_INTEGER);
            }
            else {
                if (var263.numE((SubLObject)module0048.ONE_INTEGER)) {
                    var260 = (SubLObject)ConsesLow.cons(var261, var260);
                }
                else {
                    var260 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var261, var263), var260);
                }
                var261 = var265;
                var262 = var265;
                var263 = (SubLObject)module0048.ONE_INTEGER;
            }
            var264 = var264.rest();
            var265 = var264.first();
        }
        if (var263.numE((SubLObject)module0048.ONE_INTEGER)) {
            var260 = (SubLObject)ConsesLow.cons(var261, var260);
        }
        else {
            var260 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var261, var263), var260);
        }
        return Sequences.nreverse(var260);
    }
    
    public static SubLObject f3472(final SubLObject var264) {
        SubLObject var265 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var266 = (SubLObject)module0048.NIL;
        SubLObject var267 = var264;
        SubLObject var268 = (SubLObject)module0048.NIL;
        var268 = var267.first();
        while (module0048.NIL != var267) {
            SubLObject var269 = (SubLObject)module0048.NIL;
            SubLObject var270 = (SubLObject)module0048.NIL;
            if (var268.isCons()) {
                SubLObject var272;
                final SubLObject var271 = var272 = var268;
                SubLObject var273 = (SubLObject)module0048.NIL;
                SubLObject var274 = (SubLObject)module0048.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var272, var271, (SubLObject)module0048.$ic135$);
                var273 = var272.first();
                var272 = (var274 = var272.rest());
                var269 = var273;
                var270 = var274;
            }
            else if (var268.isNumber()) {
                var269 = var268;
                var270 = (SubLObject)module0048.ONE_INTEGER;
            }
            else {
                Errors.error((SubLObject)module0048.$ic136$, var268);
            }
            var265 = Numbers.add(var265, var270);
            var266 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var269, var265), var266);
            var267 = var267.rest();
            var268 = var267.first();
        }
        return Sequences.nreverse(var266);
    }
    
    public static SubLObject f3473(final SubLObject var253, final SubLObject var274) {
        SubLObject var275 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var276 = Numbers.subtract(Sequences.length(var274), (SubLObject)module0048.ONE_INTEGER);
        while (var275.numLE(var276)) {
            final SubLObject var277 = Numbers.integerDivide(Numbers.add(var275, var276), (SubLObject)module0048.TWO_INTEGER);
            final SubLObject var278 = Vectors.aref(var274, var277);
            final SubLObject var279 = var278.first();
            if (var279.numE(var253)) {
                return (SubLObject)module0048.$ic128$;
            }
            if (var279.numL(var253)) {
                var275 = Numbers.add(var277, (SubLObject)module0048.ONE_INTEGER);
            }
            else {
                if (!var279.numG(var253)) {
                    continue;
                }
                var276 = Numbers.subtract(var277, (SubLObject)module0048.ONE_INTEGER);
            }
        }
        if (module0048.NIL != module0004.f106(var276)) {
            final SubLObject var280 = Vectors.aref(var274, var276);
            final SubLObject var281 = var280.rest();
            final SubLObject var282 = Numbers.subtract(var253, var281);
            return var282;
        }
        return var253;
    }
    
    public static SubLObject f3474(final SubLObject var259, final SubLObject var260) {
        final SubLThread var261 = SubLProcess.currentSubLThread();
        final SubLObject var262 = f3470(var259, var260);
        final SubLObject var263 = f3472(f3471(var259));
        final SubLObject var264 = module0035.f2105(var263);
        SubLObject var265;
        SubLObject var266;
        SubLObject var267;
        for (var265 = (SubLObject)module0048.NIL, var265 = (SubLObject)module0048.ZERO_INTEGER; var265.numL(var260); var265 = Numbers.add(var265, (SubLObject)module0048.ONE_INTEGER)) {
            var266 = Hashtables.gethash(var265, var262, (SubLObject)module0048.UNPROVIDED);
            var267 = (SubLObject)module0048.NIL;
            if (module0048.$ic128$ != var266) {
                var267 = f3473(var265, var264);
                if (!var266.eql(var267)) {
                    if (!var267.isNumber() || !var266.numE(var267)) {
                        Errors.error((SubLObject)module0048.$ic131$, var265, var266, var267);
                    }
                }
            }
        }
        SubLObject var268 = var263;
        SubLObject var269 = (SubLObject)module0048.NIL;
        var269 = var268.first();
        while (module0048.NIL != var268) {
            final SubLObject var270 = var269.first();
            final SubLObject var271 = f3473(var270, var264);
            if (module0048.NIL == Errors.$ignore_mustsP$.getDynamicValue(var261) && module0048.$ic128$ != var271) {
                Errors.error((SubLObject)module0048.$ic140$, var271);
            }
            var268 = var268.rest();
            var269 = var268.first();
        }
        return (SubLObject)module0048.$ic132$;
    }
    
    public static SubLObject f3470(final SubLObject var259, final SubLObject var260) {
        final SubLObject var261 = Hashtables.make_hash_table(var260, (SubLObject)module0048.EQL, (SubLObject)module0048.UNPROVIDED);
        SubLObject var262 = (SubLObject)module0048.ZERO_INTEGER;
        SubLObject var263;
        for (var263 = (SubLObject)module0048.NIL, var263 = (SubLObject)module0048.ZERO_INTEGER; var263.numL(var260); var263 = Numbers.add(var263, (SubLObject)module0048.ONE_INTEGER)) {
            if (Sequences.find(var263, var259, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED).isNumber()) {
                Hashtables.sethash(var263, var261, (SubLObject)module0048.$ic128$);
            }
            else {
                Hashtables.sethash(var263, var261, var262);
                var262 = Numbers.add(var262, (SubLObject)module0048.ONE_INTEGER);
            }
        }
        return var261;
    }
    
    public static SubLObject f3475() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f_1X", "1+", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f_1_", "1-", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3274", "S#2885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3275", "S#4673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3276", "S#4674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3277", "S#4675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3278", "S#4676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3279", "S#4677", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3280", "S#4678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3281", "S#4679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3282", "S#4680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3283", "S#4681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3284", "S#4682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3285", "S#2014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3286", "NIL-OR-INTEGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3287", "S#4683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3288", "S#4684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3289", "S#4685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3290", "S#4686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3291", "S#4687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3292", "S#4688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3293", "S#4689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3294", "S#65", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3295", "S#4690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3296", "S#4691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3297", "S#4692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3298", "S#4693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3299", "S#4694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3300", "S#4695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3301", "S#4696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3302", "S#4697", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3306", "S#4698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3305", "S#4699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3307", "S#4700", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3308", "S#4701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3309", "S#4702", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3310", "S#4703", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3311", "S#4704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3312", "S#3945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3313", "S#4705", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3314", "S#4706", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3315", "S#4707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3316", "S#4708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3317", "S#4709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3318", "S#4710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3319", "S#4711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3320", "S#4712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3321", "S#4713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3322", "S#4714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3323", "S#4715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3324", "S#4716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3325", "S#4717", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3326", "POSITIVE-INFINITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3327", "S#4718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3328", "S#4719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3304", "S#4720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3329", "S#4721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3330", "S#4722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3331", "S#4723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3332", "S#4724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3333", "S#4725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3334", "S#4726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3335", "S#4727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3336", "S#4728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3337", "S#4729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3340", "S#4730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3343", "S#4731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3346", "S#4732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3351", "S#4733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3352", "S#4734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3353", "S#4735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3354", "S#4736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3338", "S#4737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3339", "S#4738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3341", "S#4739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3342", "S#4740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3344", "S#4741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3345", "S#4742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3347", "S#4743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3349", "S#4744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3348", "S#4745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3350", "S#4746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3303", "S#4747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3355", "S#4748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3356", "S#4749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3357", "S#4750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3358", "S#4751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3359", "S#4752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3360", "S#4753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3361", "S#4754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3362", "S#4755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3363", "S#4756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3364", "S#4757", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3365", "S#4758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3366", "S#4759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3367", "S#4760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3368", "S#4761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3369", "S#4762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3370", "S#4763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3371", "S#4764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3372", "S#4765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3373", "S#4766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3374", "S#4767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3375", "S#4768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3376", "S#4769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3377", "S#4770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3378", "S#4771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3379", "S#4772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3380", "S#4773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3381", "S#3294", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3382", "S#3933", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3383", "S#4774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3384", "S#4775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3385", "S#4776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3386", "S#4777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3387", "S#4778", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3388", "S#4779", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3389", "S#4780", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3390", "S#4781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3391", "S#4782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3392", "S#4783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3393", "S#4784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3394", "S#4785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3395", "S#4786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3396", "S#4787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3397", "S#4788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3398", "S#4789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3399", "S#4790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3400", "S#4791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3401", "S#4792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3402", "S#4793", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3403", "S#771", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3404", "S#4794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3405", "S#4795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3406", "S#4796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3407", "S#3937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3408", "S#4797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3409", "S#4798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3410", "S#4799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3412", "S#4800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3411", "S#4801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3413", "S#4802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3415", "S#4803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3416", "S#4804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3417", "S#4805", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0048", "f3418", "S#4806");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0048", "f3419", "S#4807");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0048", "f3420", "S#4808");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0048", "f3421", "S#4809");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3422", "S#4810", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3423", "S#4811", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3424", "S#4812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3425", "S#4343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3426", "S#4813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3427", "S#4814", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3428", "S#4815", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3429", "S#4816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3430", "S#4817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3431", "S#4818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3414", "S#4819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3433", "S#4820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3432", "S#4821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "lcm", "LCM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3434", "S#4822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3435", "S#4823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "gcd", "GCD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3437", "S#4824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3436", "S#4825", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3438", "S#4826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3439", "S#4345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3440", "S#4827", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0048", "f3441", "S#4828");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3442", "S#4829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3443", "S#4830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3444", "S#4831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3445", "S#4832", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3446", "S#4833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3447", "S#4834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3449", "S#4835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3451", "S#4836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3450", "S#4837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3452", "S#4838", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3448", "S#4839", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3453", "S#4840", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3454", "S#4841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3455", "S#4842", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3456", "S#4843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3457", "S#4844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3458", "S#4845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3459", "S#4846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3460", "S#4847", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3461", "S#4848", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3462", "S#3855", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3463", "S#4849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3464", "S#4850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3465", "S#4851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3466", "S#4852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3467", "S#4853", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3468", "S#4854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3469", "S#4855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3471", "S#4856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3472", "S#4857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3473", "S#4858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3474", "S#4859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0048", "f3470", "S#4860", 2, 0, false);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3476() {
        module0048.$g977$ = SubLFiles.deflexical("S#4861", Numbers.expt((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.$ic2$));
        module0048.$g978$ = SubLFiles.defconstant("S#4862", Numbers.$exp1$.getGlobalValue());
        module0048.$g979$ = SubLFiles.deflexical("S#4863", (SubLObject)module0048.SIXTEEN_INTEGER);
        module0048.$g980$ = SubLFiles.deflexical("S#4864", (SubLObject)module0048.$ic71$);
        module0048.$g981$ = SubLFiles.deflexical("S#4865", (SubLObject)module0048.$ic73$);
        module0048.$g982$ = SubLFiles.deflexical("S#4866", (SubLObject)module0048.$ic74$);
        module0048.$g983$ = SubLFiles.defconstant("S#4867", (SubLObject)module0048.$ic75$);
        module0048.$g984$ = SubLFiles.defconstant("S#4868", Numbers.truncate(Numbers.log(Numbers.abs(Numbers.$most_negative_fixnum$.getGlobalValue()), (SubLObject)module0048.TWO_INTEGER), (SubLObject)module0048.UNPROVIDED));
        module0048.$g985$ = SubLFiles.defconstant("S#4869", conses_high.assoc(module0048.$g984$.getGlobalValue(), module0048.$g983$.getGlobalValue(), (SubLObject)module0048.UNPROVIDED, (SubLObject)module0048.UNPROVIDED).rest());
        module0048.$g986$ = SubLFiles.defconstant("S#4870", (SubLObject)module0048.ONE_INTEGER);
        module0048.$g987$ = SubLFiles.defconstant("S#4871", (SubLObject)module0048.ZERO_INTEGER);
        module0048.$g988$ = SubLFiles.defparameter("S#4872", (SubLObject)module0048.ONE_INTEGER);
        module0048.$g989$ = SubLFiles.defparameter("S#4873", (SubLObject)module0048.ZERO_INTEGER);
        module0048.$g990$ = SubLFiles.defparameter("S#4874", (SubLObject)module0048.$ic103$);
        return (SubLObject)module0048.NIL;
    }
    
    public static SubLObject f3477() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0048.$ic0$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0048.$ic1$);
        module0012.f368((SubLObject)module0048.$ic5$, (SubLObject)module0048.$ic6$, (SubLObject)module0048.$ic7$, (SubLObject)module0048.NIL, (SubLObject)module0048.$ic8$);
        module0027.f1449((SubLObject)module0048.$ic76$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, module0048.NIL, module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), (SubLObject)module0048.$ic83$);
        module0002.f50((SubLObject)module0048.$ic84$, (SubLObject)module0048.$ic85$);
        module0034.f1895((SubLObject)module0048.$ic117$);
        module0027.f1449((SubLObject)module0048.$ic126$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, module0048.EQUALP, module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), (SubLObject)module0048.$ic127$);
        module0027.f1449((SubLObject)module0048.$ic129$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, module0048.NIL, module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), module0048.$ic130$);
        module0027.f1449((SubLObject)module0048.$ic133$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, Symbols.symbol_function((SubLObject)module0048.EQUAL), module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), (SubLObject)module0048.$ic134$);
        module0027.f1449((SubLObject)module0048.$ic137$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, Symbols.symbol_function((SubLObject)module0048.EQUAL), module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), (SubLObject)module0048.$ic138$);
        module0027.f1449((SubLObject)module0048.$ic139$, (SubLObject)ConsesLow.list(new SubLObject[] { module0048.$ic77$, module0048.NIL, module0048.$ic78$, module0048.NIL, module0048.$ic79$, module0048.NIL, module0048.$ic80$, module0048.$ic81$, module0048.$ic82$, module0048.T }), module0048.$ic130$);
        return (SubLObject)module0048.NIL;
    }
    
    private static SubLObject _constant_130_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.FOUR_INTEGER, (SubLObject)module0048.SEVEN_INTEGER, (SubLObject)module0048.TEN_INTEGER), (SubLObject)module0048.TWELVE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.ZERO_INTEGER, module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.ELEVEN_INTEGER, module0048.THIRTEEN_INTEGER, module0048.FOURTEEN_INTEGER, module0048.FIFTEEN_INTEGER, module0048.SIXTEEN_INTEGER, SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361), SubLObjectFactory.makeInteger(365), SubLObjectFactory.makeInteger(366), SubLObjectFactory.makeInteger(367), SubLObjectFactory.makeInteger(368), SubLObjectFactory.makeInteger(369), SubLObjectFactory.makeInteger(374), SubLObjectFactory.makeInteger(375), SubLObjectFactory.makeInteger(378), SubLObjectFactory.makeInteger(429), SubLObjectFactory.makeInteger(430), SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442), SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510), SubLObjectFactory.makeInteger(538), SubLObjectFactory.makeInteger(539), SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614), SubLObjectFactory.makeInteger(623), SubLObjectFactory.makeInteger(624), SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041), SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064), SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096), SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102), SubLObjectFactory.makeInteger(1146), SubLObjectFactory.makeInteger(1147), SubLObjectFactory.makeInteger(1150), SubLObjectFactory.makeInteger(1251), SubLObjectFactory.makeInteger(1252), SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475), SubLObjectFactory.makeInteger(1485) }), (SubLObject)SubLObjectFactory.makeInteger(1460)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.ZERO_INTEGER, module0048.ONE_INTEGER, module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.FOUR_INTEGER, module0048.FIVE_INTEGER, module0048.SIX_INTEGER, module0048.SEVEN_INTEGER, module0048.EIGHT_INTEGER, module0048.NINE_INTEGER, module0048.TEN_INTEGER, module0048.ELEVEN_INTEGER, module0048.TWELVE_INTEGER, module0048.THIRTEEN_INTEGER, module0048.FOURTEEN_INTEGER, module0048.FIFTEEN_INTEGER, module0048.SIXTEEN_INTEGER, module0048.SEVENTEEN_INTEGER, module0048.EIGHTEEN_INTEGER, module0048.NINETEEN_INTEGER, module0048.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34), SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(39), SubLObjectFactory.makeInteger(40), SubLObjectFactory.makeInteger(41), SubLObjectFactory.makeInteger(42), SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(44), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(46), SubLObjectFactory.makeInteger(47), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(58), SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(60), SubLObjectFactory.makeInteger(61), SubLObjectFactory.makeInteger(62), SubLObjectFactory.makeInteger(63), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(65), SubLObjectFactory.makeInteger(66), SubLObjectFactory.makeInteger(67), SubLObjectFactory.makeInteger(68), SubLObjectFactory.makeInteger(69), SubLObjectFactory.makeInteger(70), SubLObjectFactory.makeInteger(71), SubLObjectFactory.makeInteger(72), SubLObjectFactory.makeInteger(73), SubLObjectFactory.makeInteger(80), SubLObjectFactory.makeInteger(82), SubLObjectFactory.makeInteger(83), SubLObjectFactory.makeInteger(301), SubLObjectFactory.makeInteger(302), SubLObjectFactory.makeInteger(309), SubLObjectFactory.makeInteger(316), SubLObjectFactory.makeInteger(317), SubLObjectFactory.makeInteger(351), SubLObjectFactory.makeInteger(352), SubLObjectFactory.makeInteger(353), SubLObjectFactory.makeInteger(884), SubLObjectFactory.makeInteger(885), SubLObjectFactory.makeInteger(886), SubLObjectFactory.makeInteger(887), SubLObjectFactory.makeInteger(888), SubLObjectFactory.makeInteger(889), SubLObjectFactory.makeInteger(890), SubLObjectFactory.makeInteger(891), SubLObjectFactory.makeInteger(892), SubLObjectFactory.makeInteger(893), SubLObjectFactory.makeInteger(894), SubLObjectFactory.makeInteger(895), SubLObjectFactory.makeInteger(896), SubLObjectFactory.makeInteger(897), SubLObjectFactory.makeInteger(898), SubLObjectFactory.makeInteger(899), SubLObjectFactory.makeInteger(900), SubLObjectFactory.makeInteger(901), SubLObjectFactory.makeInteger(902), SubLObjectFactory.makeInteger(903), SubLObjectFactory.makeInteger(904), SubLObjectFactory.makeInteger(905), SubLObjectFactory.makeInteger(906), SubLObjectFactory.makeInteger(907), SubLObjectFactory.makeInteger(908), SubLObjectFactory.makeInteger(909), SubLObjectFactory.makeInteger(910), SubLObjectFactory.makeInteger(911), SubLObjectFactory.makeInteger(912), SubLObjectFactory.makeInteger(913), SubLObjectFactory.makeInteger(914), SubLObjectFactory.makeInteger(915), SubLObjectFactory.makeInteger(916), SubLObjectFactory.makeInteger(917), SubLObjectFactory.makeInteger(918), SubLObjectFactory.makeInteger(919), SubLObjectFactory.makeInteger(920), SubLObjectFactory.makeInteger(921), SubLObjectFactory.makeInteger(922), SubLObjectFactory.makeInteger(923), SubLObjectFactory.makeInteger(924), SubLObjectFactory.makeInteger(925), SubLObjectFactory.makeInteger(926), SubLObjectFactory.makeInteger(927), SubLObjectFactory.makeInteger(928), SubLObjectFactory.makeInteger(929), SubLObjectFactory.makeInteger(930), SubLObjectFactory.makeInteger(931), SubLObjectFactory.makeInteger(932), SubLObjectFactory.makeInteger(933), SubLObjectFactory.makeInteger(934), SubLObjectFactory.makeInteger(935), SubLObjectFactory.makeInteger(936), SubLObjectFactory.makeInteger(937), SubLObjectFactory.makeInteger(938), SubLObjectFactory.makeInteger(939), SubLObjectFactory.makeInteger(940), SubLObjectFactory.makeInteger(941), SubLObjectFactory.makeInteger(942), SubLObjectFactory.makeInteger(943), SubLObjectFactory.makeInteger(944), SubLObjectFactory.makeInteger(945), SubLObjectFactory.makeInteger(946), SubLObjectFactory.makeInteger(947), SubLObjectFactory.makeInteger(948), SubLObjectFactory.makeInteger(949), SubLObjectFactory.makeInteger(950), SubLObjectFactory.makeInteger(951), SubLObjectFactory.makeInteger(952), SubLObjectFactory.makeInteger(953), SubLObjectFactory.makeInteger(954), SubLObjectFactory.makeInteger(955), SubLObjectFactory.makeInteger(956), SubLObjectFactory.makeInteger(957), SubLObjectFactory.makeInteger(958), SubLObjectFactory.makeInteger(959), SubLObjectFactory.makeInteger(960), SubLObjectFactory.makeInteger(961), SubLObjectFactory.makeInteger(962), SubLObjectFactory.makeInteger(963), SubLObjectFactory.makeInteger(964), SubLObjectFactory.makeInteger(965), SubLObjectFactory.makeInteger(966), SubLObjectFactory.makeInteger(967), SubLObjectFactory.makeInteger(968), SubLObjectFactory.makeInteger(969), SubLObjectFactory.makeInteger(970), SubLObjectFactory.makeInteger(971), SubLObjectFactory.makeInteger(972), SubLObjectFactory.makeInteger(973), SubLObjectFactory.makeInteger(974), SubLObjectFactory.makeInteger(984), SubLObjectFactory.makeInteger(985), SubLObjectFactory.makeInteger(986), SubLObjectFactory.makeInteger(1324), SubLObjectFactory.makeInteger(1325), SubLObjectFactory.makeInteger(1326), SubLObjectFactory.makeInteger(1327), SubLObjectFactory.makeInteger(1619), SubLObjectFactory.makeInteger(1629), SubLObjectFactory.makeInteger(1630), SubLObjectFactory.makeInteger(1631), SubLObjectFactory.makeInteger(1632), SubLObjectFactory.makeInteger(1641), SubLObjectFactory.makeInteger(1642), SubLObjectFactory.makeInteger(1643), SubLObjectFactory.makeInteger(1645), SubLObjectFactory.makeInteger(1646), SubLObjectFactory.makeInteger(1647), SubLObjectFactory.makeInteger(1649), SubLObjectFactory.makeInteger(1650), SubLObjectFactory.makeInteger(1651), SubLObjectFactory.makeInteger(1653), SubLObjectFactory.makeInteger(1655), SubLObjectFactory.makeInteger(1656), SubLObjectFactory.makeInteger(1657), SubLObjectFactory.makeInteger(1658), SubLObjectFactory.makeInteger(1723), SubLObjectFactory.makeInteger(1729), SubLObjectFactory.makeInteger(1733), SubLObjectFactory.makeInteger(1740), SubLObjectFactory.makeInteger(1741), SubLObjectFactory.makeInteger(1742), SubLObjectFactory.makeInteger(1743), SubLObjectFactory.makeInteger(1745), SubLObjectFactory.makeInteger(1756), SubLObjectFactory.makeInteger(1757), SubLObjectFactory.makeInteger(1758), SubLObjectFactory.makeInteger(1759), SubLObjectFactory.makeInteger(1760), SubLObjectFactory.makeInteger(1810), SubLObjectFactory.makeInteger(1834), SubLObjectFactory.makeInteger(1835), SubLObjectFactory.makeInteger(1868), SubLObjectFactory.makeInteger(2084), SubLObjectFactory.makeInteger(2145), SubLObjectFactory.makeInteger(2146), SubLObjectFactory.makeInteger(2170), SubLObjectFactory.makeInteger(2185), SubLObjectFactory.makeInteger(2186), SubLObjectFactory.makeInteger(2187), SubLObjectFactory.makeInteger(2194), SubLObjectFactory.makeInteger(2198), SubLObjectFactory.makeInteger(2201), SubLObjectFactory.makeInteger(2202), SubLObjectFactory.makeInteger(2203), SubLObjectFactory.makeInteger(2204), SubLObjectFactory.makeInteger(2205), SubLObjectFactory.makeInteger(2207), SubLObjectFactory.makeInteger(2211), SubLObjectFactory.makeInteger(2215), SubLObjectFactory.makeInteger(2216), SubLObjectFactory.makeInteger(2218), SubLObjectFactory.makeInteger(2223), SubLObjectFactory.makeInteger(2226), SubLObjectFactory.makeInteger(2227), SubLObjectFactory.makeInteger(2228), SubLObjectFactory.makeInteger(2256), SubLObjectFactory.makeInteger(2263), SubLObjectFactory.makeInteger(2269), SubLObjectFactory.makeInteger(2270), SubLObjectFactory.makeInteger(2271), SubLObjectFactory.makeInteger(2273), SubLObjectFactory.makeInteger(2277), SubLObjectFactory.makeInteger(2278), SubLObjectFactory.makeInteger(2283), SubLObjectFactory.makeInteger(2287), SubLObjectFactory.makeInteger(2289), SubLObjectFactory.makeInteger(2291), SubLObjectFactory.makeInteger(2292), SubLObjectFactory.makeInteger(2293), SubLObjectFactory.makeInteger(2295), SubLObjectFactory.makeInteger(2296), SubLObjectFactory.makeInteger(2297), SubLObjectFactory.makeInteger(2299), SubLObjectFactory.makeInteger(2316), SubLObjectFactory.makeInteger(2319), SubLObjectFactory.makeInteger(2321), SubLObjectFactory.makeInteger(2323), SubLObjectFactory.makeInteger(2324), SubLObjectFactory.makeInteger(2325), SubLObjectFactory.makeInteger(2330), SubLObjectFactory.makeInteger(2332), SubLObjectFactory.makeInteger(2337), SubLObjectFactory.makeInteger(2351), SubLObjectFactory.makeInteger(2364), SubLObjectFactory.makeInteger(2365), SubLObjectFactory.makeInteger(2367), SubLObjectFactory.makeInteger(2368), SubLObjectFactory.makeInteger(2372), SubLObjectFactory.makeInteger(2375), SubLObjectFactory.makeInteger(2378), SubLObjectFactory.makeInteger(2385), SubLObjectFactory.makeInteger(2386), SubLObjectFactory.makeInteger(2390), SubLObjectFactory.makeInteger(2391), SubLObjectFactory.makeInteger(2395), SubLObjectFactory.makeInteger(2402), SubLObjectFactory.makeInteger(2409), SubLObjectFactory.makeInteger(2410), SubLObjectFactory.makeInteger(2415), SubLObjectFactory.makeInteger(2418), SubLObjectFactory.makeInteger(2422), SubLObjectFactory.makeInteger(2429), SubLObjectFactory.makeInteger(2435), SubLObjectFactory.makeInteger(2437), SubLObjectFactory.makeInteger(2439), SubLObjectFactory.makeInteger(2445), SubLObjectFactory.makeInteger(2446), SubLObjectFactory.makeInteger(2450), SubLObjectFactory.makeInteger(2452), SubLObjectFactory.makeInteger(2453), SubLObjectFactory.makeInteger(2454), SubLObjectFactory.makeInteger(2455), SubLObjectFactory.makeInteger(2457), SubLObjectFactory.makeInteger(2458), SubLObjectFactory.makeInteger(2462), SubLObjectFactory.makeInteger(2463), SubLObjectFactory.makeInteger(2470), SubLObjectFactory.makeInteger(2471), SubLObjectFactory.makeInteger(2474), SubLObjectFactory.makeInteger(2475), SubLObjectFactory.makeInteger(2477), SubLObjectFactory.makeInteger(2479), SubLObjectFactory.makeInteger(2484), SubLObjectFactory.makeInteger(2487), SubLObjectFactory.makeInteger(2488), SubLObjectFactory.makeInteger(2491), SubLObjectFactory.makeInteger(2494), SubLObjectFactory.makeInteger(2497), SubLObjectFactory.makeInteger(2500), SubLObjectFactory.makeInteger(2502), SubLObjectFactory.makeInteger(2505), SubLObjectFactory.makeInteger(2506), SubLObjectFactory.makeInteger(2507), SubLObjectFactory.makeInteger(2509), SubLObjectFactory.makeInteger(2512), SubLObjectFactory.makeInteger(2513), SubLObjectFactory.makeInteger(2515), SubLObjectFactory.makeInteger(2516), SubLObjectFactory.makeInteger(2517), SubLObjectFactory.makeInteger(2518), SubLObjectFactory.makeInteger(2531), SubLObjectFactory.makeInteger(2532), SubLObjectFactory.makeInteger(2548), SubLObjectFactory.makeInteger(2549), SubLObjectFactory.makeInteger(2556), SubLObjectFactory.makeInteger(2559), SubLObjectFactory.makeInteger(3315), SubLObjectFactory.makeInteger(3317), SubLObjectFactory.makeInteger(3318), SubLObjectFactory.makeInteger(3319), SubLObjectFactory.makeInteger(3339), SubLObjectFactory.makeInteger(3342), SubLObjectFactory.makeInteger(3344), SubLObjectFactory.makeInteger(3372), SubLObjectFactory.makeInteger(3373), SubLObjectFactory.makeInteger(3374), SubLObjectFactory.makeInteger(3375), SubLObjectFactory.makeInteger(3376), SubLObjectFactory.makeInteger(3377), SubLObjectFactory.makeInteger(3378), SubLObjectFactory.makeInteger(3379), SubLObjectFactory.makeInteger(3380), SubLObjectFactory.makeInteger(3381), SubLObjectFactory.makeInteger(3382), SubLObjectFactory.makeInteger(3383), SubLObjectFactory.makeInteger(3384), SubLObjectFactory.makeInteger(3385), SubLObjectFactory.makeInteger(3386), SubLObjectFactory.makeInteger(3387), SubLObjectFactory.makeInteger(3388), SubLObjectFactory.makeInteger(3389), SubLObjectFactory.makeInteger(3390), SubLObjectFactory.makeInteger(3391), SubLObjectFactory.makeInteger(3392), SubLObjectFactory.makeInteger(3393), SubLObjectFactory.makeInteger(3394), SubLObjectFactory.makeInteger(3395), SubLObjectFactory.makeInteger(3396), SubLObjectFactory.makeInteger(3397), SubLObjectFactory.makeInteger(3398), SubLObjectFactory.makeInteger(3399), SubLObjectFactory.makeInteger(3400), SubLObjectFactory.makeInteger(3401), SubLObjectFactory.makeInteger(3402), SubLObjectFactory.makeInteger(3403), SubLObjectFactory.makeInteger(3404), SubLObjectFactory.makeInteger(3405), SubLObjectFactory.makeInteger(3406), SubLObjectFactory.makeInteger(3407), SubLObjectFactory.makeInteger(3408), SubLObjectFactory.makeInteger(3409), SubLObjectFactory.makeInteger(3410), SubLObjectFactory.makeInteger(3411), SubLObjectFactory.makeInteger(3412), SubLObjectFactory.makeInteger(3413), SubLObjectFactory.makeInteger(3414), SubLObjectFactory.makeInteger(3415), SubLObjectFactory.makeInteger(3416), SubLObjectFactory.makeInteger(3417), SubLObjectFactory.makeInteger(3418), SubLObjectFactory.makeInteger(3419), SubLObjectFactory.makeInteger(3420), SubLObjectFactory.makeInteger(3421), SubLObjectFactory.makeInteger(3422), SubLObjectFactory.makeInteger(3423), SubLObjectFactory.makeInteger(3424), SubLObjectFactory.makeInteger(3425), SubLObjectFactory.makeInteger(3426), SubLObjectFactory.makeInteger(3427), SubLObjectFactory.makeInteger(3428), SubLObjectFactory.makeInteger(3429), SubLObjectFactory.makeInteger(3430), SubLObjectFactory.makeInteger(3431), SubLObjectFactory.makeInteger(3432), SubLObjectFactory.makeInteger(3433), SubLObjectFactory.makeInteger(3434), SubLObjectFactory.makeInteger(3435), SubLObjectFactory.makeInteger(3437), SubLObjectFactory.makeInteger(3438), SubLObjectFactory.makeInteger(3439), SubLObjectFactory.makeInteger(3440), SubLObjectFactory.makeInteger(3441), SubLObjectFactory.makeInteger(3442), SubLObjectFactory.makeInteger(3443), SubLObjectFactory.makeInteger(3444), SubLObjectFactory.makeInteger(3445), SubLObjectFactory.makeInteger(3446), SubLObjectFactory.makeInteger(3447), SubLObjectFactory.makeInteger(3448), SubLObjectFactory.makeInteger(3449), SubLObjectFactory.makeInteger(3450), SubLObjectFactory.makeInteger(3451), SubLObjectFactory.makeInteger(3452), SubLObjectFactory.makeInteger(3461), SubLObjectFactory.makeInteger(3463), SubLObjectFactory.makeInteger(3464), SubLObjectFactory.makeInteger(3465), SubLObjectFactory.makeInteger(3466), SubLObjectFactory.makeInteger(3467), SubLObjectFactory.makeInteger(3476), SubLObjectFactory.makeInteger(3477), SubLObjectFactory.makeInteger(3482), SubLObjectFactory.makeInteger(3485), SubLObjectFactory.makeInteger(3486), SubLObjectFactory.makeInteger(3490), SubLObjectFactory.makeInteger(3491), SubLObjectFactory.makeInteger(3493), SubLObjectFactory.makeInteger(3496), SubLObjectFactory.makeInteger(3506), SubLObjectFactory.makeInteger(3507), SubLObjectFactory.makeInteger(3514), SubLObjectFactory.makeInteger(3598), SubLObjectFactory.makeInteger(3600), SubLObjectFactory.makeInteger(3607), SubLObjectFactory.makeInteger(3608), SubLObjectFactory.makeInteger(3609), SubLObjectFactory.makeInteger(3610), SubLObjectFactory.makeInteger(3611), SubLObjectFactory.makeInteger(3612), SubLObjectFactory.makeInteger(3613), SubLObjectFactory.makeInteger(3614), SubLObjectFactory.makeInteger(3615), SubLObjectFactory.makeInteger(3616), SubLObjectFactory.makeInteger(3617), SubLObjectFactory.makeInteger(3618), SubLObjectFactory.makeInteger(3632), SubLObjectFactory.makeInteger(3637), SubLObjectFactory.makeInteger(3638), SubLObjectFactory.makeInteger(3639), SubLObjectFactory.makeInteger(3640), SubLObjectFactory.makeInteger(3641), SubLObjectFactory.makeInteger(3642), SubLObjectFactory.makeInteger(3647), SubLObjectFactory.makeInteger(3648), SubLObjectFactory.makeInteger(3652), SubLObjectFactory.makeInteger(3653), SubLObjectFactory.makeInteger(3654), SubLObjectFactory.makeInteger(3657), SubLObjectFactory.makeInteger(3658), SubLObjectFactory.makeInteger(3727), SubLObjectFactory.makeInteger(3739), SubLObjectFactory.makeInteger(3750), SubLObjectFactory.makeInteger(3753), SubLObjectFactory.makeInteger(3756), SubLObjectFactory.makeInteger(3764), SubLObjectFactory.makeInteger(3769), SubLObjectFactory.makeInteger(3770), SubLObjectFactory.makeInteger(3793), SubLObjectFactory.makeInteger(3796), SubLObjectFactory.makeInteger(3810), SubLObjectFactory.makeInteger(3827), SubLObjectFactory.makeInteger(3829), SubLObjectFactory.makeInteger(3830), SubLObjectFactory.makeInteger(3833), SubLObjectFactory.makeInteger(3834), SubLObjectFactory.makeInteger(3835), SubLObjectFactory.makeInteger(3859), SubLObjectFactory.makeInteger(3860), SubLObjectFactory.makeInteger(3877), SubLObjectFactory.makeInteger(3878), SubLObjectFactory.makeInteger(3879), SubLObjectFactory.makeInteger(3880), SubLObjectFactory.makeInteger(3881), SubLObjectFactory.makeInteger(3882), SubLObjectFactory.makeInteger(3885), SubLObjectFactory.makeInteger(3886), SubLObjectFactory.makeInteger(4013), SubLObjectFactory.makeInteger(4038), SubLObjectFactory.makeInteger(4039), SubLObjectFactory.makeInteger(4040), SubLObjectFactory.makeInteger(4100), SubLObjectFactory.makeInteger(4149), SubLObjectFactory.makeInteger(4150) }), (SubLObject)SubLObjectFactory.makeInteger(4160)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
    }
    
    public void declareFunctions() {
        f3475();
    }
    
    public void initializeVariables() {
        f3476();
    }
    
    public void runTopLevelForms() {
        f3477();
    }
    
    static {
        me = (SubLFile)new module0048();
        module0048.$g977$ = null;
        module0048.$g978$ = null;
        module0048.$g979$ = null;
        module0048.$g980$ = null;
        module0048.$g981$ = null;
        module0048.$g982$ = null;
        module0048.$g983$ = null;
        module0048.$g984$ = null;
        module0048.$g985$ = null;
        module0048.$g986$ = null;
        module0048.$g987$ = null;
        module0048.$g988$ = null;
        module0048.$g989$ = null;
        module0048.$g990$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4674", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4675", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4678", "CYC"));
        $ic2$ = SubLObjectFactory.makeInteger(26);
        $ic3$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic4$ = SubLObjectFactory.makeInteger(256);
        $ic5$ = SubLObjectFactory.makeSymbol("NIL-OR-INTEGER-P");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic7$ = SubLObjectFactory.makeString("Return T iff OBJECT is either an integer or NIL");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic9$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic10$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic11$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic12$ = SubLObjectFactory.makeSymbol("S#4747", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic14$ = SubLObjectFactory.makeInteger(-2);
        $ic15$ = SubLObjectFactory.makeInteger(100);
        $ic16$ = SubLObjectFactory.makeString("NEW must be larger than OLD");
        $ic17$ = SubLObjectFactory.makeString("NEW must be smaller than OLD");
        $ic18$ = SubLObjectFactory.makeKeyword("NEGATIVE-INFINITY");
        $ic19$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic20$ = SubLObjectFactory.makeSymbol("S#4716", "CYC");
        $ic21$ = SubLObjectFactory.makeString("Can't divide zero by zero");
        $ic22$ = SubLObjectFactory.makeSymbol("S#4723", "CYC");
        $ic23$ = SubLObjectFactory.makeString("Can't add positive infinity and negative infinity");
        $ic24$ = SubLObjectFactory.makeString("Can't subtract negative infinity from itself");
        $ic25$ = SubLObjectFactory.makeString("Can't subtract positive infinity from itself");
        $ic26$ = SubLObjectFactory.makeString("Can't multiply infinity and zero");
        $ic27$ = SubLObjectFactory.makeString("Can't divide negative infinity by itself");
        $ic28$ = SubLObjectFactory.makeString("Can't divide negative infinity by positive infinity");
        $ic29$ = SubLObjectFactory.makeString("Can't divide positive infinity by negative infinity");
        $ic30$ = SubLObjectFactory.makeString("Can't divide positive infinity by itself");
        $ic31$ = SubLObjectFactory.makeSymbol("S#4748", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("UNDEFINED");
        $ic33$ = SubLObjectFactory.makeSymbol("S#4763", "CYC");
        $ic34$ = SubLObjectFactory.makeString("Cannot compute the maximum of an atom or empty list");
        $ic35$ = SubLObjectFactory.makeSymbol(">");
        $ic36$ = SubLObjectFactory.makeString("Cannot compute the minimum of an atom or empty list");
        $ic37$ = SubLObjectFactory.makeSymbol("<");
        $ic38$ = SubLObjectFactory.makeString("Cannot compute the mean of an atom or empty list");
        $ic39$ = SubLObjectFactory.makeString("Cannot compute the geometric mean of an atom or empty list");
        $ic40$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic41$ = SubLObjectFactory.makeString("Cannot compute the median of an atom or empty list");
        $ic42$ = SubLObjectFactory.makeKeyword("ITEM");
        $ic43$ = SubLObjectFactory.makeString("Can't return middle item from an even-length list.");
        $ic44$ = SubLObjectFactory.makeString("Unrecognized RETURN type ~S");
        $ic45$ = SubLObjectFactory.makeSymbol("S#4695", "CYC");
        $ic46$ = SubLObjectFactory.makeString("Cannot compute the percentile of an atom or empty list");
        $ic47$ = SubLObjectFactory.makeString("Cannot compute frequencies of an atom or empty list");
        $ic48$ = SubLObjectFactory.makeSymbol("CDR");
        $ic49$ = SubLObjectFactory.makeString("Cannot compute the mode of an atom or empty list");
        $ic50$ = SubLObjectFactory.makeString("Cannot compute the variance of an atom or empty list");
        $ic51$ = SubLObjectFactory.makeString("Cannot make reasonable estimate of variance from only one element");
        $ic52$ = SubLObjectFactory.makeString("Cannot compute the standard deviation of an atom or empty list");
        $ic53$ = SubLObjectFactory.makeString("Standard deviation must not be zero.");
        $ic54$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic55$ = SubLObjectFactory.makeString("~%Standard Statistical Analysis");
        $ic56$ = SubLObjectFactory.makeString("~%=============================");
        $ic57$ = SubLObjectFactory.makeString("~%Count   : ~6D");
        $ic58$ = SubLObjectFactory.makeString("~%Min     : ~6D");
        $ic59$ = SubLObjectFactory.makeString("~%Median  : ~6D");
        $ic60$ = SubLObjectFactory.makeString("~%Mean    : ~6D");
        $ic61$ = SubLObjectFactory.makeString("~%Max     : ~6D");
        $ic62$ = SubLObjectFactory.makeString("~%Std Dev : ~6D");
        $ic63$ = SubLObjectFactory.makeString("X-Values and Y-Values must be of the same length ~A.");
        $ic64$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic65$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic66$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic67$ = SubLObjectFactory.makeString("This integer is too large to be converted to a double-float");
        $ic68$ = SubLObjectFactory.makeString("~A");
        $ic69$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic70$ = SubLObjectFactory.makeSymbol("S#4798", "CYC");
        $ic71$ = SubLObjectFactory.makeString("0123456789.-+deDE");
        $ic72$ = SubLObjectFactory.makeSymbol("S#4800", "CYC");
        $ic73$ = SubLObjectFactory.makeString("deDE");
        $ic74$ = SubLObjectFactory.makeString("+-");
        $ic75$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.THREE_INTEGER), ConsesLow.cons((SubLObject)module0048.THREE_INTEGER, (SubLObject)module0048.SEVEN_INTEGER), ConsesLow.cons((SubLObject)module0048.FOUR_INTEGER, (SubLObject)module0048.THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)module0048.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.cons((SubLObject)module0048.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(61)), ConsesLow.cons((SubLObject)module0048.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(127)), ConsesLow.cons((SubLObject)module0048.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(251)), ConsesLow.cons((SubLObject)module0048.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(509)), ConsesLow.cons((SubLObject)module0048.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1021)), ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(2039)), ConsesLow.cons((SubLObject)module0048.TWELVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(4093)), ConsesLow.cons((SubLObject)module0048.THIRTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(8191)), ConsesLow.cons((SubLObject)module0048.FOURTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(16381)), ConsesLow.cons((SubLObject)module0048.FIFTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(32749)), ConsesLow.cons((SubLObject)module0048.SIXTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(65521)), ConsesLow.cons((SubLObject)module0048.SEVENTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(131071)), ConsesLow.cons((SubLObject)module0048.EIGHTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(262139)), ConsesLow.cons((SubLObject)module0048.NINETEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(524287)), ConsesLow.cons((SubLObject)module0048.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1048573)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)SubLObjectFactory.makeInteger(2097143)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)SubLObjectFactory.makeInteger(4194301)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)SubLObjectFactory.makeInteger(8388593)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(24), (SubLObject)SubLObjectFactory.makeInteger(16777213)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)SubLObjectFactory.makeInteger(33554393)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(26), (SubLObject)SubLObjectFactory.makeInteger(67108859)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)SubLObjectFactory.makeInteger(134217689)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(28), (SubLObject)SubLObjectFactory.makeInteger(268435399)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)SubLObjectFactory.makeInteger(536870909)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeInteger(1073741789)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)SubLObjectFactory.makeInteger(Integer.MAX_VALUE)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)SubLObjectFactory.makeInteger("4294967291")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)SubLObjectFactory.makeInteger("8589934583")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)SubLObjectFactory.makeInteger("17179869143")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)SubLObjectFactory.makeInteger("34359738337")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)SubLObjectFactory.makeInteger("68719476731")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(37), (SubLObject)SubLObjectFactory.makeInteger("137438953447")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)SubLObjectFactory.makeInteger("274877906899")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(39), (SubLObject)SubLObjectFactory.makeInteger("549755813881")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeInteger("1099511627689")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(41), (SubLObject)SubLObjectFactory.makeInteger("2199023255531")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)SubLObjectFactory.makeInteger("4398046511093")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(43), (SubLObject)SubLObjectFactory.makeInteger("8796093022151")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)SubLObjectFactory.makeInteger("17592186044399")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(45), (SubLObject)SubLObjectFactory.makeInteger("35184372088777")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(46), (SubLObject)SubLObjectFactory.makeInteger("70368744177643")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(47), (SubLObject)SubLObjectFactory.makeInteger("140737488355213")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(48), (SubLObject)SubLObjectFactory.makeInteger("281474976710597")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(49), (SubLObject)SubLObjectFactory.makeInteger("562949953421231")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger("1125899906842597")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)SubLObjectFactory.makeInteger("2251799813685119")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(52), (SubLObject)SubLObjectFactory.makeInteger("4503599627370449")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(53), (SubLObject)SubLObjectFactory.makeInteger("9007199254740881")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(54), (SubLObject)SubLObjectFactory.makeInteger("18014398509481951")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(55), (SubLObject)SubLObjectFactory.makeInteger("36028797018963913")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(56), (SubLObject)SubLObjectFactory.makeInteger("72057594037927931")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(57), (SubLObject)SubLObjectFactory.makeInteger("144115188075855859")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(58), (SubLObject)SubLObjectFactory.makeInteger("288230376151711717")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(59), (SubLObject)SubLObjectFactory.makeInteger("576460752303423433")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)SubLObjectFactory.makeInteger("1152921504606846883")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(61), (SubLObject)SubLObjectFactory.makeInteger("2305843009213693951")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(62), (SubLObject)SubLObjectFactory.makeInteger("4611686018427387847")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(63), (SubLObject)SubLObjectFactory.makeInteger("9223372036854775783")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(64), (SubLObject)SubLObjectFactory.makeInteger("18446744073709551557")) });
        $ic76$ = SubLObjectFactory.makeSymbol("S#4803", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("TEST");
        $ic78$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic79$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic80$ = SubLObjectFactory.makeKeyword("KB");
        $ic81$ = SubLObjectFactory.makeKeyword("TINY");
        $ic82$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.NIL, (SubLObject)module0048.T));
        $ic84$ = SubLObjectFactory.makeSymbol("S#4806", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4808", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4809", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4876", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic87$ = SubLObjectFactory.makeSymbol("CLET");
        $ic88$ = SubLObjectFactory.makeSymbol("S#4872", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#4873", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4870", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4871", "CYC"));
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4877", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic92$ = SubLObjectFactory.makeSymbol("CAR");
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4878", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic94$ = SubLObjectFactory.makeSymbol("S#4807", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4805", "CYC")));
        $ic97$ = SubLObjectFactory.makeKeyword("BASE");
        $ic98$ = SubLObjectFactory.makeString("~X");
        $ic99$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("ABS");
        $ic101$ = SubLObjectFactory.makeSymbol("S#4823", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#4825", "CYC");
        $ic103$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)module0048.TEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_A, (SubLObject)module0048.TEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_b, (SubLObject)module0048.ELEVEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_B, (SubLObject)module0048.ELEVEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_c, (SubLObject)module0048.TWELVE_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_C, (SubLObject)module0048.TWELVE_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_d, (SubLObject)module0048.THIRTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_D, (SubLObject)module0048.THIRTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_e, (SubLObject)module0048.FOURTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_E, (SubLObject)module0048.FOURTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_f, (SubLObject)module0048.FIFTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_F, (SubLObject)module0048.FIFTEEN_INTEGER) });
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4879", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#74A80D2");
        $ic106$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4829", "CYC"));
        $ic108$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic109$ = SubLObjectFactory.makeSymbol("S#4830", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#4829", "CYC");
        $ic111$ = SubLObjectFactory.makeInteger(1000);
        $ic112$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0E-5);
        $ic113$ = SubLObjectFactory.makeSymbol("S#4833", "CYC");
        $ic114$ = SubLObjectFactory.makeString("Error sampling from ~s: (~s ~s)");
        $ic115$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic116$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic117$ = SubLObjectFactory.makeSymbol("S#4837", "CYC");
        $ic118$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic119$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic120$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic121$ = SubLObjectFactory.makeString("~s must be <= ~s");
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4880", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4881", "CYC"));
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4882", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4883", "CYC"));
        $ic124$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic125$ = SubLObjectFactory.makeInteger(25);
        $ic126$ = SubLObjectFactory.makeSymbol("S#4853", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.THREE_INTEGER, (SubLObject)module0048.FOUR_INTEGER, (SubLObject)module0048.FIVE_INTEGER, (SubLObject)module0048.SIX_INTEGER), (SubLObject)module0048.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0048.ONE_INTEGER, (SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.THREE_INTEGER, (SubLObject)module0048.FOUR_INTEGER, (SubLObject)module0048.FIVE_INTEGER, (SubLObject)module0048.SIX_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.ONE_INTEGER, module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.FOUR_INTEGER, module0048.FIVE_INTEGER, module0048.SIX_INTEGER, module0048.SEVEN_INTEGER, module0048.EIGHT_INTEGER, module0048.NINE_INTEGER, module0048.TEN_INTEGER }), (SubLObject)module0048.FIVE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { module0048.ONE_INTEGER, module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.FOUR_INTEGER, module0048.FIVE_INTEGER, module0048.SIX_INTEGER, module0048.SEVEN_INTEGER, module0048.EIGHT_INTEGER, module0048.NINE_INTEGER, module0048.TEN_INTEGER })));
        $ic128$ = SubLObjectFactory.makeKeyword("DELETED");
        $ic129$ = SubLObjectFactory.makeSymbol("S#4855", "CYC");
        $ic130$ = _constant_130_initializer();
        $ic131$ = SubLObjectFactory.makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");
        $ic132$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic133$ = SubLObjectFactory.makeSymbol("S#4856", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.THREE_INTEGER, (SubLObject)module0048.FOUR_INTEGER, (SubLObject)module0048.FIVE_INTEGER, (SubLObject)module0048.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)module0048.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.FOUR_INTEGER, module0048.FIVE_INTEGER, module0048.EIGHT_INTEGER, module0048.ELEVEN_INTEGER, module0048.TWELVE_INTEGER, module0048.FOURTEEN_INTEGER, module0048.FIFTEEN_INTEGER, module0048.SIXTEEN_INTEGER })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)module0048.EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.FOURTEEN_INTEGER, (SubLObject)module0048.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.ZERO_INTEGER, module0048.TWO_INTEGER, module0048.THREE_INTEGER, module0048.ELEVEN_INTEGER, module0048.THIRTEEN_INTEGER, module0048.FOURTEEN_INTEGER, module0048.FIFTEEN_INTEGER, module0048.SIXTEEN_INTEGER, SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361), SubLObjectFactory.makeInteger(365), SubLObjectFactory.makeInteger(366), SubLObjectFactory.makeInteger(367), SubLObjectFactory.makeInteger(368), SubLObjectFactory.makeInteger(369), SubLObjectFactory.makeInteger(374), SubLObjectFactory.makeInteger(375), SubLObjectFactory.makeInteger(378), SubLObjectFactory.makeInteger(429), SubLObjectFactory.makeInteger(430), SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442), SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510), SubLObjectFactory.makeInteger(538), SubLObjectFactory.makeInteger(539), SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614), SubLObjectFactory.makeInteger(623), SubLObjectFactory.makeInteger(624), SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041), SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064), SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096), SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102), SubLObjectFactory.makeInteger(1146), SubLObjectFactory.makeInteger(1147), SubLObjectFactory.makeInteger(1150), SubLObjectFactory.makeInteger(1251), SubLObjectFactory.makeInteger(1252), SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475), SubLObjectFactory.makeInteger(1485) })), (SubLObject)ConsesLow.list(new SubLObject[] { module0048.ZERO_INTEGER, ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.TWO_INTEGER), module0048.ELEVEN_INTEGER, ConsesLow.cons((SubLObject)module0048.THIRTEEN_INTEGER, (SubLObject)module0048.FOUR_INTEGER), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(365), (SubLObject)module0048.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(374), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(378), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(429), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442), SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(538), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(623), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041), SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064), SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096), SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1146), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(1150), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1251), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475), SubLObjectFactory.makeInteger(1485) })));
        $ic135$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"));
        $ic136$ = SubLObjectFactory.makeString("Invalid gap list format: Unclear what to do with element ~A.");
        $ic137$ = SubLObjectFactory.makeSymbol("S#4857", "CYC");
        $ic138$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)module0048.EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.EIGHT_INTEGER, (SubLObject)module0048.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.SEVEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)module0048.EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.FOURTEEN_INTEGER, (SubLObject)module0048.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.EIGHT_INTEGER, (SubLObject)module0048.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0048.FOURTEEN_INTEGER, (SubLObject)module0048.TEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0048.ZERO_INTEGER, ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.TWO_INTEGER), module0048.ELEVEN_INTEGER, ConsesLow.cons((SubLObject)module0048.THIRTEEN_INTEGER, (SubLObject)module0048.FOUR_INTEGER), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(365), (SubLObject)module0048.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(374), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(378), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(429), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442), SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(538), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(623), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041), SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064), SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096), SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1146), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(1150), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1251), (SubLObject)module0048.TWO_INTEGER), SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475), SubLObjectFactory.makeInteger(1485) })), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)module0048.ZERO_INTEGER, (SubLObject)module0048.ONE_INTEGER), ConsesLow.cons((SubLObject)module0048.TWO_INTEGER, (SubLObject)module0048.THREE_INTEGER), ConsesLow.cons((SubLObject)module0048.ELEVEN_INTEGER, (SubLObject)module0048.FOUR_INTEGER), ConsesLow.cons((SubLObject)module0048.THIRTEEN_INTEGER, (SubLObject)module0048.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)module0048.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(57), (SubLObject)module0048.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(59), (SubLObject)module0048.ELEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(64), (SubLObject)module0048.TWELVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(250), (SubLObject)module0048.THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(361), (SubLObject)module0048.FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(365), (SubLObject)module0048.NINETEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(374), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(378), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(429), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(436), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(442), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(473), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(510), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(538), (SubLObject)SubLObjectFactory.makeInteger(30)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(555), (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(614), (SubLObject)SubLObjectFactory.makeInteger(32)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(623), (SubLObject)SubLObjectFactory.makeInteger(34)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(643), (SubLObject)SubLObjectFactory.makeInteger(35)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1041), (SubLObject)SubLObjectFactory.makeInteger(36)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1062), (SubLObject)SubLObjectFactory.makeInteger(37)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1064), (SubLObject)SubLObjectFactory.makeInteger(38)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1092), (SubLObject)SubLObjectFactory.makeInteger(39)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1096), (SubLObject)SubLObjectFactory.makeInteger(40)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1098), (SubLObject)SubLObjectFactory.makeInteger(41)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1102), (SubLObject)SubLObjectFactory.makeInteger(42)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1146), (SubLObject)SubLObjectFactory.makeInteger(44)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1150), (SubLObject)SubLObjectFactory.makeInteger(45)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1251), (SubLObject)SubLObjectFactory.makeInteger(47)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1471), (SubLObject)SubLObjectFactory.makeInteger(48)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1475), (SubLObject)SubLObjectFactory.makeInteger(49)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(1485), (SubLObject)SubLObjectFactory.makeInteger(50)) })));
        $ic139$ = SubLObjectFactory.makeSymbol("S#4859", "CYC");
        $ic140$ = SubLObjectFactory.makeString("ID ~A should have been deleted but was renumbered to ~A.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0048.class
	Total time: 874 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/