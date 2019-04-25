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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return Numbers.add(var1, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f_1_(final SubLObject var1) {
        return Numbers.subtract(var1, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f3274(final SubLObject var1) {
        return Numbers.add(var1, var1);
    }
    
    public static SubLObject f3275(final SubLObject var2) {
        return Equality.eql((SubLObject)ONE_INTEGER, var2);
    }
    
    public static SubLObject f3276(final SubLObject var2) {
        return (SubLObject)((NIL != var2) ? ONE_INTEGER : ZERO_INTEGER);
    }
    
    public static SubLObject f3277(final SubLObject var3) {
        return (SubLObject)makeBoolean(!var3.isZero());
    }
    
    public static SubLObject f3278(final SubLObject var4, final SubLObject var5) {
        return f3277(bytes.ldb(bytes.sublisp_byte((SubLObject)ONE_INTEGER, var5), var4));
    }
    
    public static SubLObject f3279(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)T;
        }
        return bytes.dpb(f3276(var6), bytes.sublisp_byte((SubLObject)ONE_INTEGER, var5), var4);
    }
    
    public static SubLObject f3280(final SubLObject var4, final SubLObject var5) {
        return f3279(var4, var5, (SubLObject)NIL);
    }
    
    public static SubLObject f3281(final SubLObject var1, final SubLObject var7) {
        assert NIL != Types.numberp(var1) : var1;
        assert NIL != Types.numberp(var7) : var7;
        return Numbers.integerDivide(var1, var7);
    }
    
    public static SubLObject f3282(final SubLObject var1) {
        assert NIL != Types.numberp(var1) : var1;
        return Numbers.multiply(var1, var1);
    }
    
    public static SubLObject f3283(final SubLObject var1) {
        assert NIL != Types.numberp(var1) : var1;
        return Numbers.expt(var1, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f3284(final SubLObject var1) {
        assert NIL != Types.numberp(var1) : var1;
        return Numbers.expt(var1, Numbers.divide((SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f3285(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isInteger() && ZERO_INTEGER.numLE(var2) && var2.numL((SubLObject)$ic4$));
    }
    
    public static SubLObject f3286(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == var2 || var2.isInteger());
    }
    
    public static SubLObject f3287(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == var2 || NIL != module0004.f105(var2));
    }
    
    public static SubLObject f3288(final SubLObject var2) {
        if (NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (!var4.isInteger()) {
                    return (SubLObject)NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3289(final SubLObject var2) {
        if (NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL == module0004.f105(var4)) {
                    return (SubLObject)NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3290(final SubLObject var2) {
        if (NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL == module0004.f108(var4)) {
                    return (SubLObject)NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3291(final SubLObject var2) {
        if (NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL == module0004.f106(var4)) {
                    return (SubLObject)NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3292(final SubLObject var2) {
        if (NIL != module0035.f2015(var2)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL == module0004.f107(var4)) {
                    return (SubLObject)NIL;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3293(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && var2.isPositive());
    }
    
    public static SubLObject f3294(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && !var2.isNegative());
    }
    
    public static SubLObject f3295(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && !var2.isPositive());
    }
    
    public static SubLObject f3296(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && var2.isNegative());
    }
    
    public static SubLObject f3297(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            var3.throwStack.push($ic9$);
            final SubLObject var6 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic10$), var3);
                try {
                    var4 = Numbers.zerop(var2);
                }
                catch (Throwable var7) {
                    Errors.handleThrowable(var7, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var6, var3);
            }
        }
        catch (Throwable var8) {
            var5 = Errors.handleThrowable(var8, (SubLObject)$ic9$);
        }
        finally {
            var3.throwStack.pop();
        }
        return var4;
    }
    
    public static SubLObject f3298(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && !var2.isZero());
    }
    
    public static SubLObject f3299(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && ZERO_INTEGER.numLE(var2) && var2.numLE((SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f3300(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() && ZERO_INTEGER.numLE(var2) && var2.numL((SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f3301(SubLObject var3) {
        assert NIL != Types.integerp(var3) : var3;
        SubLObject var4;
        for (var4 = (SubLObject)ZERO_INTEGER; !var3.isZero(); var3 = Numbers.integerDivide(var3, (SubLObject)TEN_INTEGER), var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER)) {}
        return var4;
    }
    
    public static SubLObject f3302(final SubLObject var1, final SubLObject var17) {
        assert NIL != f3303(var1) : var1;
        assert NIL != module0004.f105(var17) : var17;
        if (NIL != f3304(var1)) {
            return var1;
        }
        if (NIL != module0606.f37086(var1)) {
            return module0607.f37112(var1, var17);
        }
        if (var1.isZero()) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (var1.isNegative()) {
            return Numbers.minus(f3302(Numbers.minus(var1), var17));
        }
        if (var1.isInteger() && var17.numGE(f3301(var1))) {
            return var1;
        }
        if (var1.isDouble() && var17.numGE($g979$.getGlobalValue())) {
            return var1;
        }
        final SubLObject var18 = Numbers.floor(Numbers.log(var1, (SubLObject)TEN_INTEGER), (SubLObject)UNPROVIDED);
        final SubLObject var19 = Numbers.expt((SubLObject)TEN_INTEGER, var18);
        final SubLObject var20 = Numbers.divide(var1, var19);
        final SubLObject var21 = Numbers.expt((SubLObject)TEN_INTEGER, Numbers.subtract(var17, (SubLObject)ONE_INTEGER));
        final SubLObject var22 = Numbers.multiply(var20, var21);
        final SubLObject var23 = Numbers.round(var22, (SubLObject)UNPROVIDED);
        final SubLObject var24 = Numbers.divide(var23, var21);
        SubLObject var25 = Numbers.multiply(var24, var19);
        if (var1.isInteger()) {
            final SubLObject var26 = Numbers.subtract(var18, Numbers.subtract(var17, (SubLObject)ONE_INTEGER));
            final SubLObject var27 = Numbers.expt((SubLObject)TEN_INTEGER, var26);
            var25 = Numbers.multiply(var23, var27);
        }
        if (var25.isDouble() && var1.numGE(Numbers.$most_negative_fixnum$.getGlobalValue()) && var1.numLE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            final SubLObject var28 = Numbers.round(var25, (SubLObject)UNPROVIDED);
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
        return f3302(var1, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f3305(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        var30.resetMultipleValues();
        final SubLObject var31 = Numbers.integer_decode_float(var29);
        final SubLObject var32 = var30.secondMultipleValue();
        final SubLObject var33 = var30.thirdMultipleValue();
        var30.resetMultipleValues();
        SubLObject var34 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        for (var36 = (SubLObject)THREE_INTEGER, var37 = (SubLObject)NIL, var37 = (SubLObject)$ic14$; !var37.numGE(var36); var37 = f_1X(var37)) {
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
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)FOUR_INTEGER;
        }
        final SubLObject var42 = Numbers.expt((SubLObject)TEN_INTEGER, var41);
        return Numbers.sublisp_float(Numbers.divide(Numbers.round(Numbers.multiply(var40, var42), (SubLObject)UNPROVIDED), var42), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3308(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.ceiling(Numbers.divide(var43, var41), (SubLObject)UNPROVIDED), var41);
    }
    
    public static SubLObject f3309(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.round(Numbers.divide(var43, var41), (SubLObject)UNPROVIDED), var41);
    }
    
    public static SubLObject f3310(final SubLObject var43, final SubLObject var41) {
        return Numbers.multiply(Numbers.floor(Numbers.divide(var43, var41), (SubLObject)UNPROVIDED), var41);
    }
    
    public static SubLObject f3311(final SubLObject var44, final SubLObject var45) {
        return Numbers.numG(Numbers.abs(var44), Numbers.abs(var45));
    }
    
    public static SubLObject f3312(final SubLObject var1, final SubLObject var7) {
        assert NIL != Types.numberp(var1) : var1;
        assert NIL != Types.numberp(var7) : var7;
        return Numbers.numE(Numbers.mod(var1, var7), (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f3313(final SubLObject var46, SubLObject var47, SubLObject var48) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)ONE_INTEGER;
        }
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        final SubLObject var49 = Numbers.multiply(var46, (SubLObject)$ic15$);
        return Values.values((NIL != var48) ? Numbers.round(var49, var47) : Numbers.truncate(var49, var47));
    }
    
    public static SubLObject f3314(final SubLObject var46, SubLObject var47, SubLObject var50) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)ONE_INTEGER;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        SubLObject var51 = Numbers.multiply((SubLObject)$ic15$, Numbers.divide(var46, var47));
        if (NIL != var50) {
            var51 = f3302(var51, var50);
        }
        return var51;
    }
    
    public static SubLObject f3315(final SubLObject var2) {
        return module0552.f34081(var2);
    }
    
    public static SubLObject f3316(final SubLObject var51) {
        return Numbers.divide(var51, (SubLObject)$ic15$);
    }
    
    public static SubLObject f3317(final SubLObject var52, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var54) && !var53.numGE(var52)) {
            Errors.error((SubLObject)$ic16$);
        }
        return f3314(f_1_(Numbers.divide(var53, var52)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3318(final SubLObject var52, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var54) && !var53.numLE(var52)) {
            Errors.error((SubLObject)$ic17$);
        }
        return f3314(Numbers.minus(f_1_(Numbers.divide(var53, var52))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3319(final SubLObject var54, final SubLObject var55) {
        return f3318(var54, var55);
    }
    
    public static SubLObject f3320(final SubLObject var54, final SubLObject var55) {
        return f3317(var54, var55);
    }
    
    public static SubLObject f3321(final SubLObject var1) {
        return Numbers.log(var1, (SubLObject)TEN_INTEGER);
    }
    
    public static SubLObject f3322(final SubLObject var1) {
        return Numbers.log(var1, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f3323(final SubLObject var1) {
        return Numbers.expt((SubLObject)TEN_INTEGER, var1);
    }
    
    public static SubLObject f3324(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isNumber() || NIL != f3304(var2));
    }
    
    public static SubLObject f3325() {
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f3326() {
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f3327(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)$ic18$);
    }
    
    public static SubLObject f3328(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)$ic19$);
    }
    
    public static SubLObject f3304(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3327(var2) || NIL != f3328(var2));
    }
    
    public static SubLObject f3329(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3327(var2) || NIL != f3296(var2));
    }
    
    public static SubLObject f3330(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3328(var2) || NIL != f3293(var2));
    }
    
    public static SubLObject f3331(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3328(var2) || NIL != f3294(var2));
    }
    
    public static SubLObject f3332(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        return Equality.eql(var44, var45);
    }
    
    public static SubLObject f3333(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3327(var44)) {
            return (SubLObject)makeBoolean(NIL == f3327(var45));
        }
        if (NIL != f3327(var45)) {
            return (SubLObject)NIL;
        }
        if (NIL != f3328(var45)) {
            return (SubLObject)makeBoolean(NIL == f3328(var44));
        }
        if (NIL != f3328(var44)) {
            return (SubLObject)NIL;
        }
        return Numbers.numL(var44, var45);
    }
    
    public static SubLObject f3334(final SubLObject var44, final SubLObject var45) {
        return f3333(var45, var44);
    }
    
    public static SubLObject f3335(final SubLObject var44, final SubLObject var45) {
        return (SubLObject)makeBoolean(NIL != f3332(var44, var45) || NIL != f3333(var44, var45));
    }
    
    public static SubLObject f3336(final SubLObject var44, final SubLObject var45) {
        return (SubLObject)makeBoolean(NIL != f3332(var44, var45) || NIL != f3334(var44, var45));
    }
    
    public static SubLObject f3337(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3327(var44)) {
            return f3338(var45);
        }
        if (NIL != f3327(var45)) {
            return f3338(var44);
        }
        if (NIL != f3328(var44)) {
            return f3339(var45);
        }
        if (NIL != f3328(var45)) {
            return f3339(var44);
        }
        return Numbers.add(var44, var45);
    }
    
    public static SubLObject f3340(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3327(var44)) {
            return f3341(var45);
        }
        if (NIL != f3327(var45)) {
            return f3341(var44);
        }
        if (NIL != f3328(var44)) {
            return f3342(var45);
        }
        if (NIL != f3328(var45)) {
            return f3342(var44);
        }
        return Numbers.subtract(var44, var45);
    }
    
    public static SubLObject f3343(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3327(var44)) {
            return f3344(var45);
        }
        if (NIL != f3327(var45)) {
            return f3344(var44);
        }
        if (NIL != f3328(var44)) {
            return f3345(var45);
        }
        if (NIL != f3328(var45)) {
            return f3345(var44);
        }
        return Numbers.multiply(var44, var45);
    }
    
    public static SubLObject f3346(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3297(var45)) {
            if (NIL != f3329(var44)) {
                return (SubLObject)$ic18$;
            }
            if (NIL != f3330(var44)) {
                return (SubLObject)$ic19$;
            }
            if (ZERO_INTEGER.eql(var44)) {
                Errors.error((SubLObject)$ic21$);
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != f3327(var44)) {
                return f3347(var45);
            }
            if (NIL != f3327(var45)) {
                return f3348(var44);
            }
            if (NIL != f3328(var44)) {
                return f3349(var45);
            }
            if (NIL != f3328(var45)) {
                return f3350(var44);
            }
            return Numbers.divide(var44, var45);
        }
    }
    
    public static SubLObject f3351(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3334(var44, var45)) {
            return var44;
        }
        return var45;
    }
    
    public static SubLObject f3352(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3324(var44) : var44;
        assert NIL != f3324(var45) : var45;
        if (NIL != f3333(var44, var45)) {
            return var44;
        }
        return var45;
    }
    
    public static SubLObject f3353(final SubLObject var40, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = $g978$.getGlobalValue();
        }
        assert NIL != f3331(var40) : var40;
        if (ZERO_INTEGER.eql(var40)) {
            return f3325();
        }
        if (NIL != f3328(var40)) {
            return f3326();
        }
        return Numbers.log(var40, var42);
    }
    
    public static SubLObject f3354(final SubLObject var40) {
        assert NIL != f3324(var40) : var40;
        if (NIL != f3327(var40)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != f3328(var40)) {
            return f3326();
        }
        return Numbers.exp(var40);
    }
    
    public static SubLObject f3338(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL != f3328(var40)) {
            Errors.error((SubLObject)$ic23$);
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f3339(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic23$);
        }
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f3341(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic24$);
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f3342(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL != f3328(var40)) {
            Errors.error((SubLObject)$ic25$);
        }
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f3344(final SubLObject var40) {
        if (NIL != f3329(var40)) {
            return (SubLObject)$ic19$;
        }
        if (NIL != f3297(var40)) {
            Errors.error((SubLObject)$ic26$);
            return (SubLObject)NIL;
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f3345(final SubLObject var40) {
        if (NIL != f3329(var40)) {
            return (SubLObject)$ic18$;
        }
        if (ZERO_INTEGER.eql(var40)) {
            Errors.error((SubLObject)$ic26$);
            return (SubLObject)NIL;
        }
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f3347(final SubLObject var40) {
        if (NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic27$);
        }
        else {
            if (NIL == f3328(var40)) {
                return f3344(var40);
            }
            Errors.error((SubLObject)$ic28$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3349(final SubLObject var40) {
        if (NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic29$);
        }
        else {
            if (NIL == f3328(var40)) {
                return f3345(var40);
            }
            Errors.error((SubLObject)$ic30$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3348(final SubLObject var40) {
        if (NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic27$);
        }
        else {
            if (NIL == f3328(var40)) {
                return (SubLObject)ZERO_INTEGER;
            }
            Errors.error((SubLObject)$ic29$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3350(final SubLObject var40) {
        if (NIL != f3327(var40)) {
            Errors.error((SubLObject)$ic28$);
        }
        else {
            if (NIL == f3328(var40)) {
                return (SubLObject)ZERO_INTEGER;
            }
            Errors.error((SubLObject)$ic30$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3303(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != module0608.f37152(var2) || NIL != f3304(var2));
    }
    
    public static SubLObject f3355(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isInteger() || NIL != f3356(var2));
    }
    
    public static SubLObject f3356(final SubLObject var2) {
        return f3304(var2);
    }
    
    public static SubLObject f3357(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3327(var2) || NIL != module0004.f108(var2));
    }
    
    public static SubLObject f3358(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3328(var2) || NIL != module0004.f105(var2));
    }
    
    public static SubLObject f3359(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return Equality.eql(var56, var57);
    }
    
    public static SubLObject f3360(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return f3333(var56, var57);
    }
    
    public static SubLObject f3361(final SubLObject var56, final SubLObject var57) {
        return f3360(var57, var56);
    }
    
    public static SubLObject f3362(final SubLObject var56, final SubLObject var57) {
        return (SubLObject)makeBoolean(NIL != f3359(var56, var57) || NIL != f3360(var56, var57));
    }
    
    public static SubLObject f3363(final SubLObject var56, final SubLObject var57) {
        return (SubLObject)makeBoolean(NIL != f3359(var56, var57) || NIL != f3361(var56, var57));
    }
    
    public static SubLObject f3364(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return f3337(var56, var57);
    }
    
    public static SubLObject f3365(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return f3340(var56, var57);
    }
    
    public static SubLObject f3366(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return f3343(var56, var57);
    }
    
    public static SubLObject f3367(final SubLObject var56, final SubLObject var45) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3324(var45) : var45;
        final SubLObject var57 = f3343(var56, var45);
        if (NIL != f3304(var57)) {
            return var57;
        }
        return Numbers.truncate(var57, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3368(final SubLObject var56, final SubLObject var57) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3355(var57) : var57;
        return f3346(var56, var57);
    }
    
    public static SubLObject f3369(final SubLObject var56, final SubLObject var45) {
        assert NIL != f3355(var56) : var56;
        assert NIL != f3324(var45) : var45;
        final SubLObject var57 = f3346(var56, var45);
        if (NIL != f3304(var57)) {
            return var57;
        }
        return Numbers.truncate(var57, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3370(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f3324(var2) || NIL != f3371(var2));
    }
    
    public static SubLObject f3371(final SubLObject var2) {
        return Equality.eq(var2, (SubLObject)$ic32$);
    }
    
    public static SubLObject f3372(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3332(var44, var45);
    }
    
    public static SubLObject f3373(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3333(var44, var45);
    }
    
    public static SubLObject f3374(final SubLObject var44, final SubLObject var45) {
        return f3373(var45, var44);
    }
    
    public static SubLObject f3375(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3335(var44, var45);
    }
    
    public static SubLObject f3376(final SubLObject var44, final SubLObject var45) {
        return f3375(var45, var44);
    }
    
    public static SubLObject f3377(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3337(var44, var45);
    }
    
    public static SubLObject f3378(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3340(var44, var45);
    }
    
    public static SubLObject f3379(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3343(var44, var45);
    }
    
    public static SubLObject f3380(final SubLObject var44, final SubLObject var45) {
        assert NIL != f3370(var44) : var44;
        assert NIL != f3370(var45) : var45;
        if (NIL != f3371(var44) || NIL != f3371(var45)) {
            return (SubLObject)$ic32$;
        }
        if (NIL != f3297(var44) && NIL != f3297(var45)) {
            return (SubLObject)$ic32$;
        }
        return f3346(var44, var45);
    }
    
    public static SubLObject f3381(final SubLObject var59, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var61) && !var59.isCons()) {
            Errors.error((SubLObject)$ic34$);
        }
        if (var60.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var60 == IDENTITY) {
            SubLObject var62 = var59.first();
            SubLObject var63 = var59.rest();
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                if (var64.numG(var62)) {
                    var62 = var64;
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            return var62;
        }
        return module0035.f2378(var59, Symbols.symbol_function((SubLObject)$ic35$), var60);
    }
    
    public static SubLObject f3382(final SubLObject var59, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var61) && !var59.isCons()) {
            Errors.error((SubLObject)$ic36$);
        }
        if (var60.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var60 == IDENTITY) {
            SubLObject var62 = var59.first();
            SubLObject var63 = var59.rest();
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                if (var64.numL(var62)) {
                    var62 = var64;
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            return var62;
        }
        return module0035.f2378(var59, Symbols.symbol_function((SubLObject)$ic37$), var60);
    }
    
    public static SubLObject f3383(final SubLObject var59, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var59.isCons()) {
            SubLObject var61 = (SubLObject)ZERO_INTEGER;
            SubLObject var62 = var59;
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                var61 = Numbers.add(var61, Functions.funcall(var60, var63));
                var62 = var62.rest();
                var63 = var62.first();
            }
            return Numbers.sublisp_float(Numbers.divide(var61, Sequences.length(var59)), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3384(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic38$);
        }
        SubLObject var61 = (SubLObject)ZERO_INTEGER;
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        SubLObject var63 = var59;
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            var61 = Numbers.add(var61, var64);
            var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Numbers.divide(var61, var62);
    }
    
    public static SubLObject f3385(final SubLObject var59) {
        SubLObject var60 = (SubLObject)ZERO_INTEGER;
        SubLObject var61 = var59;
        SubLObject var62 = (SubLObject)NIL;
        var62 = var61.first();
        while (NIL != var61) {
            var60 = Numbers.add(var60, var62);
            var61 = var61.rest();
            var62 = var61.first();
        }
        return var60;
    }
    
    public static SubLObject f3386(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic39$);
        }
        SubLObject var61 = (SubLObject)ONE_INTEGER;
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        SubLObject var63 = var59;
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            var61 = Numbers.multiply(var61, var64);
            var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Numbers.expt(var61, Numbers.invert(var62));
    }
    
    public static SubLObject f3387(final SubLObject var59, SubLObject var60, SubLObject var68) {
        if (var60 == UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic40$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var59.isCons()) {
            Errors.error((SubLObject)$ic41$);
        }
        final SubLObject var70 = Sort.sort(conses_high.copy_list(var59), Symbols.symbol_function((SubLObject)$ic37$), var60);
        return f3388(var70, Sequences.length(var70), var60, var68);
    }
    
    public static SubLObject f3388(final SubLObject var59, SubLObject var16, SubLObject var60, SubLObject var68) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic40$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var59.isCons()) {
            Errors.error((SubLObject)$ic41$);
        }
        if (NIL == var16) {
            var16 = Sequences.length(var59);
        }
        final SubLObject var70 = Numbers.integerDivide(var16, (SubLObject)TWO_INTEGER);
        final SubLObject var71 = ConsesLow.nth(var70, var59);
        final SubLObject var72 = var68;
        if (var72.eql((SubLObject)$ic42$)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && NIL == Numbers.oddp(var16)) {
                Errors.error((SubLObject)$ic43$);
            }
            return var71;
        }
        if (var72.eql((SubLObject)$ic40$)) {
            return (NIL != Numbers.oddp(var16)) ? Functions.funcall(var60, var71) : f3384((SubLObject)ConsesLow.list(Functions.funcall(var60, var71), Functions.funcall(var60, ConsesLow.nth(Numbers.subtract(var70, (SubLObject)ONE_INTEGER), var59))));
        }
        Errors.error((SubLObject)$ic44$, var68);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3389(final SubLObject var59, final SubLObject var73, SubLObject var74, SubLObject var60) {
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)$ic37$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)IDENTITY;
        }
        return f3390(Sort.sort(conses_high.copy_list(var59), var74, var60), var73);
    }
    
    public static SubLObject f3390(final SubLObject var59, final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        assert NIL != f3300(var73) : var73;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && !var59.isCons()) {
            Errors.error((SubLObject)$ic46$);
        }
        final SubLObject var75 = Sequences.length(var59);
        final SubLObject var76 = Numbers.truncate(Numbers.multiply(var75, var73), (SubLObject)UNPROVIDED);
        return ConsesLow.nth(var76, var59);
    }
    
    public static SubLObject f3391(final SubLObject var76) {
        SubLObject var77 = (SubLObject)ZERO_INTEGER;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
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
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic47$);
        }
        final SubLObject var61 = Hashtables.make_hash_table((SubLObject)TWENTY_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var62 = var59;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            module0030.f1615(var63, var61, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var62 = var62.rest();
            var63 = var62.first();
        }
        return module0030.f1630(var61);
    }
    
    public static SubLObject f3393(final SubLObject var59) {
        final SubLObject var60 = f3392(var59);
        return Sort.sort(var60, (SubLObject)$ic35$, (SubLObject)$ic48$);
    }
    
    public static SubLObject f3394(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic49$);
        }
        final SubLObject var61 = Hashtables.make_hash_table((SubLObject)TWENTY_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var62 = var59;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            module0030.f1615(var63, var61, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var62 = var62.rest();
            var63 = var62.first();
        }
        return f3391(var61);
    }
    
    public static SubLObject f3395(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic49$);
        }
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var61 = (SubLObject)NIL, var62 = (SubLObject)NIL, var63 = (SubLObject)NIL, var64 = (SubLObject)NIL, var65 = (SubLObject)NIL, var66 = (SubLObject)NIL, var61 = var59, var62 = Symbols.gensym((SubLObject)UNPROVIDED), var63 = var61.first(), var64 = (SubLObject)ONE_INTEGER, var65 = var59.first(), var66 = (SubLObject)ONE_INTEGER; NIL != var61; var61 = var61.rest(), var62 = var63, var63 = var61.first(), var64 = (SubLObject)(var63.eql(var62) ? Numbers.add(var64, (SubLObject)ONE_INTEGER) : ONE_INTEGER), var65 = (var64.numG(var66) ? var63 : var65), var66 = (var64.numG(var66) ? var64 : var66)) {}
        return var65;
    }
    
    public static SubLObject f3396(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic50$);
        }
        if (NIL != module0035.f1997(var59)) {
            Errors.warn((SubLObject)$ic51$);
            return Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        SubLObject var61 = (SubLObject)ZERO_INTEGER;
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        SubLObject var63 = (SubLObject)ZERO_INTEGER;
        SubLObject var64 = var59;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            var61 = Numbers.add(var61, f3282(var65));
            var62 = Numbers.add(var62, var65);
            var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
            var64 = var64.rest();
            var65 = var64.first();
        }
        final SubLObject var66 = Numbers.divide(var62, var63);
        return Values.values(Numbers.subtract(Numbers.divide(var61, Numbers.subtract(var63, (SubLObject)ONE_INTEGER)), Numbers.multiply(Numbers.divide(var63, Numbers.subtract(var63, (SubLObject)ONE_INTEGER)), f3282(var66))), var66);
    }
    
    public static SubLObject f3397(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic50$);
        }
        SubLObject var61 = (SubLObject)ZERO_INTEGER;
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        SubLObject var63 = (SubLObject)ZERO_INTEGER;
        SubLObject var64 = var59;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            var61 = Numbers.add(var61, f3282(var65));
            var62 = Numbers.add(var62, var65);
            var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
            var64 = var64.rest();
            var65 = var64.first();
        }
        final SubLObject var66 = Numbers.divide(var62, var63);
        return Values.values(Numbers.subtract(Numbers.divide(var61, var63), f3282(var66)), var66);
    }
    
    public static SubLObject f3398(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic50$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3397(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(var61, var62);
    }
    
    public static SubLObject f3399(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic52$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3397(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(Numbers.sqrt(var61), var62);
    }
    
    public static SubLObject f3400(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic52$);
        }
        var60.resetMultipleValues();
        final SubLObject var61 = f3396(var59);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return Values.values(Numbers.sqrt(var61), var62);
    }
    
    public static SubLObject f3401(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var60) && !var59.isCons()) {
            Errors.error((SubLObject)$ic52$);
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
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var96) && var95.isZero()) {
            Errors.error((SubLObject)$ic53$);
        }
        return Numbers.divide(Numbers.subtract(var94, var92), var95);
    }
    
    public static SubLObject f3403(final SubLObject var96, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)NIL;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = Sequences.length(var96);
        final SubLObject var100 = f3382(var96, (SubLObject)UNPROVIDED);
        final SubLObject var101 = f3381(var96, (SubLObject)UNPROVIDED);
        final SubLObject var102 = f3387(var96, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var103 = f3384(var96);
        final SubLObject var104 = f3401(var96);
        if (NIL != var97) {
            final SubLObject var105 = reader.$read_default_float_format$.currentBinding(var98);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic54$, var98);
                PrintLow.format((SubLObject)T, (SubLObject)$ic55$);
                PrintLow.format((SubLObject)T, (SubLObject)$ic56$);
                PrintLow.format((SubLObject)T, (SubLObject)$ic57$, var99);
                PrintLow.format((SubLObject)T, (SubLObject)$ic58$, f3306(var100));
                PrintLow.format((SubLObject)T, (SubLObject)$ic59$, f3306(var102));
                PrintLow.format((SubLObject)T, (SubLObject)$ic60$, f3306(var103));
                PrintLow.format((SubLObject)T, (SubLObject)$ic61$, f3306(var101));
                PrintLow.format((SubLObject)T, (SubLObject)$ic62$, f3306(var104));
                streams_high.terpri((SubLObject)T);
                streams_high.force_output((SubLObject)T);
            }
            finally {
                reader.$read_default_float_format$.rebind(var105, var98);
            }
        }
        return (SubLObject)ConsesLow.list(var99, var100, var102, var103, var101, var104);
    }
    
    public static SubLObject f3404(final SubLObject var102, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var104) && NIL == module0035.f2004(var102, var103)) {
            Errors.error((SubLObject)$ic63$, Sequences.length(var102));
        }
        SubLObject var105 = (SubLObject)ZERO_INTEGER;
        SubLObject var106 = (SubLObject)ZERO_INTEGER;
        SubLObject var107 = (SubLObject)ZERO_INTEGER;
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)ZERO_INTEGER;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var43_111 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var113_114 = (SubLObject)NIL;
        var112 = var102;
        var43_111 = var112.first();
        var113 = var103;
        var113_114 = var113.first();
        while (NIL != var113 || NIL != var112) {
            if (var111.isZero()) {
                var108 = var43_111;
                var109 = var113_114;
            }
            else {
                final SubLObject var114 = Numbers.add(var111, (SubLObject)ONE_INTEGER);
                final SubLObject var115 = Numbers.divide(Numbers.subtract(var114, (SubLObject)$ic64$), var114);
                final SubLObject var116 = Numbers.subtract(var43_111, var108);
                final SubLObject var117 = Numbers.subtract(var113_114, var109);
                var105 = Numbers.add(var105, Numbers.multiply(var116, var116, var115));
                var106 = Numbers.add(var106, Numbers.multiply(var117, var117, var115));
                var107 = Numbers.add(var107, Numbers.multiply(var116, var117, var115));
                var108 = Numbers.add(var108, Numbers.divide(var116, var114));
                var109 = Numbers.add(var109, Numbers.divide(var117, var114));
                var110 = var114;
            }
            var111 = Numbers.add(var111, (SubLObject)ONE_INTEGER);
            var112 = var112.rest();
            var43_111 = var112.first();
            var113 = var113.rest();
            var113_114 = var113.first();
        }
        final SubLObject var118 = Numbers.sqrt(Numbers.divide(var105, var110));
        final SubLObject var119 = Numbers.sqrt(Numbers.divide(var106, var110));
        final SubLObject var120 = Numbers.divide(var107, var110);
        if (var118.isZero() || var119.isZero()) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Numbers.divide(var120, Numbers.multiply(var118, var119));
    }
    
    public static SubLObject f3405(SubLObject var3, final SubLObject var121) {
        assert NIL != Types.integerp(var3) : var3;
        assert NIL != Types.listp(var121) : var121;
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = var121;
        SubLObject var124 = (SubLObject)NIL;
        var124 = var123.first();
        while (NIL != var123) {
            if (var3.numE((SubLObject)ZERO_INTEGER)) {
                if (NIL == var122) {
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
        if (NIL == var96) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL == var121) {
            return var96.first();
        }
        SubLObject var122 = f3406(var96.rest(), var121.rest());
        var122 = Numbers.multiply(var122, var121.first());
        var122 = Numbers.add(var122, var96.first());
        return var122;
    }
    
    public static SubLObject f3407(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)NIL;
        SubLObject var126 = (SubLObject)NIL;
        try {
            var124.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var127 = Errors.$error_handler$.currentBinding(var124);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic66$, var124);
                try {
                    var125 = f3408(var123);
                }
                catch (Throwable var128) {
                    Errors.handleThrowable(var128, (SubLObject)NIL);
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
        if (NIL != var126 && NIL == module0038.f2668((SubLObject)$ic67$, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic68$, var126);
        }
        return module0035.sublisp_boolean(var125);
    }
    
    public static SubLObject f3408(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        if (var123.isString() && NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)$ic69$), var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic70$), var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var124.resetMultipleValues();
            final SubLObject var125 = reader.read_from_string_ignoring_errors(var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var126 = var124.secondMultipleValue();
            var124.resetMultipleValues();
            if (var125.isNumber() && var126.eql(Sequences.length(var123))) {
                return var125;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3409(final SubLObject var126) {
        return Sequences.find(var126, $g980$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3410(final SubLObject var127) {
        if (NIL == module0038.f2731(var127)) {
            return (SubLObject)NIL;
        }
        final SubLObject var128 = Sequences.position_if((SubLObject)$ic72$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var129 = (NIL != var128) ? module0038.f2623(var127, (SubLObject)ZERO_INTEGER, var128) : var127;
        final SubLObject var130 = (SubLObject)((NIL != var128) ? module0038.f2623(var127, Numbers.add((SubLObject)ONE_INTEGER, var128), (SubLObject)UNPROVIDED) : NIL);
        SubLObject var131 = (SubLObject)NIL;
        if (NIL != module0038.f2608(var129)) {
            var131 = (SubLObject)T;
        }
        else {
            SubLObject var132 = (SubLObject)NIL;
            final SubLObject var133 = Sequences.elt(var129, (SubLObject)ZERO_INTEGER);
            if (Characters.CHAR_period.eql(var133)) {
                var132 = (SubLObject)T;
            }
            else if (NIL == Characters.digit_char_p(var133, (SubLObject)UNPROVIDED) && NIL == f3411(var133)) {
                var131 = (SubLObject)T;
            }
            final SubLObject var134 = var129;
            final SubLObject var135 = Sequences.length(var134);
            if (NIL == var131) {
                SubLObject var35_134;
                SubLObject var136;
                SubLObject var137;
                for (var35_134 = var135, var136 = (SubLObject)NIL, var136 = (SubLObject)ONE_INTEGER; NIL == var131 && !var136.numGE(var35_134); var136 = f_1X(var136)) {
                    var137 = Strings.sublisp_char(var134, var136);
                    if (NIL == Characters.digit_char_p(var137, (SubLObject)UNPROVIDED)) {
                        if (Characters.CHAR_period.eql(var137)) {
                            if (NIL != var132) {
                                var131 = (SubLObject)T;
                            }
                            else {
                                var132 = (SubLObject)T;
                            }
                        }
                        else {
                            var131 = (SubLObject)T;
                        }
                    }
                }
            }
        }
        if (NIL == var131 && NIL != var130) {
            if (NIL != module0038.f2608(var130)) {
                var131 = (SubLObject)T;
            }
            else {
                final SubLObject var138 = Sequences.elt(var130, (SubLObject)ZERO_INTEGER);
                if (NIL == Characters.digit_char_p(var138, (SubLObject)UNPROVIDED) && NIL == f3411(var138)) {
                    var131 = (SubLObject)T;
                }
                final SubLObject var139 = var130;
                final SubLObject var140 = Sequences.length(var139);
                if (NIL == var131) {
                    SubLObject var35_135;
                    SubLObject var141;
                    SubLObject var142;
                    for (var35_135 = var140, var141 = (SubLObject)NIL, var141 = (SubLObject)ONE_INTEGER; NIL == var131 && !var141.numGE(var35_135); var141 = f_1X(var141)) {
                        var142 = Strings.sublisp_char(var139, var141);
                        if (NIL == Characters.digit_char_p(var142, (SubLObject)UNPROVIDED)) {
                            var131 = (SubLObject)T;
                        }
                    }
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var131);
    }
    
    public static SubLObject f3412(final SubLObject var126) {
        return Sequences.find(var126, $g981$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3411(final SubLObject var126) {
        return Sequences.find(var126, $g982$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3413(final SubLObject var138) {
        SubLObject var139 = f_1_(Numbers.expt((SubLObject)TWO_INTEGER, var138));
        SubLObject var140 = (SubLObject)NIL;
        while (NIL == var140) {
            if (NIL != f3414(var139)) {
                var140 = var139;
            }
            else {
                var139 = Numbers.subtract(var139, (SubLObject)ONE_INTEGER);
            }
        }
        return var140;
    }
    
    public static SubLObject f3415() {
        return (SubLObject)makeBoolean(NIL != module0004.f105($g984$.getGlobalValue()) && NIL != module0004.f105($g985$.getGlobalValue()));
    }
    
    public static SubLObject f3416(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        $g988$.setDynamicValue(Numbers.add($g988$.getDynamicValue(var142), var141), var142);
        if ($g985$.getGlobalValue().numL($g988$.getDynamicValue(var142))) {
            $g988$.setDynamicValue(Numbers.subtract($g988$.getDynamicValue(var142), $g985$.getGlobalValue()), var142);
        }
        $g989$.setDynamicValue(Numbers.add($g989$.getDynamicValue(var142), $g988$.getDynamicValue(var142)), var142);
        if ($g985$.getGlobalValue().numL($g989$.getDynamicValue(var142))) {
            $g989$.setDynamicValue(Numbers.subtract($g989$.getDynamicValue(var142), $g985$.getGlobalValue()), var142);
        }
        return var141;
    }
    
    public static SubLObject f3417() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons($g989$.getDynamicValue(var10), $g988$.getDynamicValue(var10));
    }
    
    public static SubLObject f3418(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic86$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic86$);
        var147 = var145.first();
        var145 = var145.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic86$);
        var148 = var145.first();
        var145 = var145.rest();
        if (NIL == var145) {
            final SubLObject var149;
            var145 = (var149 = var146);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic88$, var147), (SubLObject)ConsesLow.list((SubLObject)$ic89$, var148)), ConsesLow.append(var149, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)$ic86$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3419(final SubLObject var142, final SubLObject var143) {
        final SubLObject var144 = var142.rest();
        final SubLObject var146;
        final SubLObject var145 = var146 = var144;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic84$, (SubLObject)$ic90$, ConsesLow.append(var146, (SubLObject)NIL));
    }
    
    public static SubLObject f3420(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic91$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic91$);
        var147 = var145.first();
        var145 = var145.rest();
        if (NIL == var145) {
            final SubLObject var148;
            var145 = (var148 = var146);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic84$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic48$, var147), (SubLObject)ConsesLow.list((SubLObject)$ic92$, var147)), ConsesLow.append(var148, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)$ic91$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3421(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic93$);
        final SubLObject var146 = var145.rest();
        var145 = var145.first();
        SubLObject var147 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic93$);
        var147 = var145.first();
        var145 = var145.rest();
        if (NIL == var145) {
            final SubLObject var148;
            var145 = (var148 = var146);
            return reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var148, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic95$, var147, (SubLObject)$ic96$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)$ic93$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3422(final SubLObject var1, final SubLObject var31, final SubLObject var160) {
        SubLObject var161 = Numbers.mod(var1, var160);
        SubLObject var162;
        SubLObject var163;
        for (var162 = Numbers.subtract(var31, (SubLObject)ONE_INTEGER), var163 = (SubLObject)NIL, var163 = (SubLObject)ZERO_INTEGER; var163.numL(var162); var163 = Numbers.add(var163, (SubLObject)ONE_INTEGER)) {
            var161 = Numbers.mod(Numbers.multiply(var161, var1), var160);
        }
        return var161;
    }
    
    public static SubLObject f3423(final SubLObject var1, final SubLObject var31, final SubLObject var160) {
        final SubLObject var161 = Sequences.subseq(f3424(var31), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var162 = Numbers.mod(var1, var160);
        final SubLObject var163 = var161;
        SubLObject var35_164;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (var35_164 = Sequences.length(var163)), var165 = (SubLObject)NIL, var165 = (SubLObject)ZERO_INTEGER; !var165.numGE(var35_164); var165 = f_1X(var165)) {
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
        return PrintLow.write_to_string(var41, new SubLObject[] { $ic97$, TWO_INTEGER });
    }
    
    public static SubLObject f3425(final SubLObject var41) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic98$, var41);
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
            return var41.isNegative() ? Numbers.subtract(Sequences.length(PrintLow.write_to_string(var41, EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ONE_INTEGER) : Sequences.length(PrintLow.write_to_string(var41, EMPTY_SUBL_OBJECT_ARRAY));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3430(final SubLObject var167, final SubLObject var168) {
        if (var167.isInteger() && var168.isInteger() && !var167.isZero()) {
            return Types.integerp(Numbers.divide(var168, var167));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3431(final SubLObject var169, final SubLObject var168) {
        SubLObject var170 = var169;
        SubLObject var171 = (SubLObject)NIL;
        var171 = var170.first();
        while (NIL != var170) {
            if (NIL == f3430(var171, var168)) {
                return (SubLObject)NIL;
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3414(final SubLObject var2) {
        if (NIL == module0004.f105(var2)) {
            return (SubLObject)NIL;
        }
        if (var2.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)NIL;
        }
        return Equality.eql(var2, f3432(var2));
    }
    
    public static SubLObject f3433(SubLObject var170) {
        assert NIL != module0004.f105(var170) : var170;
        if (var170.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)NIL;
        }
        SubLObject var171 = (SubLObject)NIL;
        while (!ONE_INTEGER.eql(var170)) {
            final SubLObject var172 = f3432(var170);
            var171 = (SubLObject)ConsesLow.cons(var172, var171);
            var170 = Numbers.divide(var170, var172);
        }
        return Sort.sort(var171, Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3432(final SubLObject var170) {
        SubLObject var171 = (SubLObject)NIL;
        if (NIL != Numbers.evenp(var170)) {
            var171 = (SubLObject)TWO_INTEGER;
        }
        else if (Numbers.mod(var170, (SubLObject)THREE_INTEGER).isZero()) {
            var171 = (SubLObject)THREE_INTEGER;
        }
        else {
            final SubLObject var172 = Numbers.sqrt(var170);
            final SubLObject var173 = (SubLObject)SIX_INTEGER;
            final SubLObject var174 = f_1X(var172);
            final SubLObject var175 = Types.integerp(var172);
            if (NIL != var175) {
                var171 = var172;
            }
            if (NIL == var171) {
                SubLObject var176;
                SubLObject var177;
                for (var176 = var174, var177 = (SubLObject)NIL, var177 = var173; NIL == var171 && !var177.numGE(var176); var177 = Numbers.add(var177, (SubLObject)SIX_INTEGER)) {
                    if (Numbers.mod(var170, f_1_(var177)).isZero()) {
                        var171 = f_1_(var177);
                    }
                    else if (Numbers.mod(var170, f_1X(var177)).isZero()) {
                        var171 = f_1X(var177);
                    }
                }
            }
        }
        return (NIL != var171) ? var171 : var170;
    }
    
    public static SubLObject lcm(final SubLObject var177) {
        assert NIL != module0035.f2015(var177) : var177;
        SubLObject var178 = var177;
        SubLObject var179 = (SubLObject)NIL;
        var179 = var178.first();
        while (NIL != var178) {
            assert NIL != Types.integerp(var179) : var179;
            var178 = var178.rest();
            var179 = var178.first();
        }
        if (NIL == var177) {
            return (SubLObject)ONE_INTEGER;
        }
        SubLObject var180 = conses_high.copy_list(var177);
        var180 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic100$), var180);
        var180 = module0035.f2269(var180, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var180)) {
            return var180.first();
        }
        if (NIL != module0004.f104((SubLObject)ZERO_INTEGER, var180, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Sequences.creduce(Symbols.symbol_function((SubLObject)$ic101$), var180, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3434(final SubLObject var56, final SubLObject var57) {
        assert NIL != Types.integerp(var56) : var56;
        assert NIL != Types.integerp(var57) : var57;
        if (var56.isZero() || var57.isZero()) {
            return (SubLObject)ZERO_INTEGER;
        }
        return f3435(Numbers.abs(var56), Numbers.abs(var57));
    }
    
    public static SubLObject f3435(final SubLObject var56, final SubLObject var57) {
        final SubLObject var58 = f3436(var56, var57);
        return Numbers.multiply(var57, Numbers.divide(var56, var58));
    }
    
    public static SubLObject gcd(final SubLObject var177) {
        assert NIL != module0035.f2015(var177) : var177;
        SubLObject var178 = var177;
        SubLObject var179 = (SubLObject)NIL;
        var179 = var178.first();
        while (NIL != var178) {
            assert NIL != Types.integerp(var179) : var179;
            var178 = var178.rest();
            var179 = var178.first();
        }
        if (NIL == var177) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var180 = conses_high.copy_list(var177);
        var180 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic100$), var180);
        var180 = module0035.f2269(var180, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var180)) {
            return var180.first();
        }
        return Sequences.creduce(Symbols.symbol_function((SubLObject)$ic102$), var180, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3437(final SubLObject var56, final SubLObject var57) {
        assert NIL != Types.integerp(var56) : var56;
        assert NIL != Types.integerp(var57) : var57;
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
        SubLObject var187 = (SubLObject)ZERO_INTEGER;
        SubLObject var188;
        for (var188 = (SubLObject)NIL, var188 = (SubLObject)ZERO_INTEGER; var188.numL(var186); var188 = Numbers.add(var188, (SubLObject)ONE_INTEGER)) {
            var187 = Numbers.add(var187, Numbers.multiply(Numbers.expt((SubLObject)SIXTEEN_INTEGER, var188), f3440(Vectors.aref(var185, var188))));
        }
        return var187;
    }
    
    public static SubLObject f3440(final SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        SubLObject var138 = Characters.digit_char_p(var136, (SubLObject)UNPROVIDED);
        if (NIL == var138) {
            var138 = conses_high.second(conses_high.assoc(var136, $g990$.getDynamicValue(var137), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var138;
    }
    
    public static SubLObject f3441(final SubLObject var142, final SubLObject var143) {
        SubLObject var145;
        final SubLObject var144 = var145 = var142.rest();
        SubLObject var146 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic104$);
        var146 = var145.first();
        final SubLObject var147;
        var145 = (var147 = var145.rest());
        final SubLObject var148 = (SubLObject)$ic105$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var148, var146)), (SubLObject)ConsesLow.listS((SubLObject)$ic106$, var148, (SubLObject)$ic107$), (SubLObject)ConsesLow.listS((SubLObject)$ic108$, (SubLObject)ConsesLow.list((SubLObject)$ic109$, var148), ConsesLow.append(var147, (SubLObject)NIL)));
    }
    
    public static SubLObject f3442(final SubLObject var2) {
        return module0552.f34082(var2);
    }
    
    public static SubLObject f3443(final SubLObject var192) {
        assert NIL != f3442(var192) : var192;
        if (ONE_INTEGER.numE(var192)) {
            return (SubLObject)T;
        }
        if (ZERO_INTEGER.numE(var192)) {
            return (SubLObject)NIL;
        }
        return f3444(var192, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f3444(final SubLObject var192, final SubLObject var193) {
        final SubLObject var194 = Numbers.round(Numbers.divide((SubLObject)ONE_INTEGER, var192), (SubLObject)UNPROVIDED);
        if (var194.numG(var193)) {
            return Numbers.numL(random.random(var194), var193);
        }
        final SubLObject var195 = Numbers.multiply((SubLObject)$ic111$, var193);
        final SubLObject var196 = Numbers.divide(var192, (SubLObject)$ic111$);
        return f3444(var196, var195);
    }
    
    public static SubLObject f3445() {
        return Numbers.zerop(random.random((SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f3446(final SubLObject var2) {
        if (NIL != module0035.f2327(var2)) {
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            SubLObject var4;
            SubLObject var5;
            SubLObject var6;
            for (var4 = (SubLObject)NIL, var4 = var2; NIL != var4; var4 = conses_high.cddr(var4)) {
                var5 = var4.first();
                var6 = conses_high.cadr(var4);
                if (NIL == f3294(var6)) {
                    return (SubLObject)NIL;
                }
                var3 = Numbers.add(var3, var6);
            }
            if (Numbers.abs(f_1_(var3)).numL((SubLObject)$ic112$)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3447(final SubLObject var199) {
        assert NIL != f3446(var199) : var199;
        final SubLObject var200 = f3448();
        SubLObject var201 = (SubLObject)ZERO_INTEGER;
        SubLObject var202;
        SubLObject var203;
        SubLObject var204;
        for (var202 = (SubLObject)NIL, var202 = var199; NIL != var202; var202 = conses_high.cddr(var202)) {
            var203 = var202.first();
            var204 = conses_high.cadr(var202);
            var201 = Numbers.add(var201, var204);
            if (var200.numL(var201)) {
                return var203;
            }
        }
        return Errors.error((SubLObject)$ic114$, var199, var200, var201);
    }
    
    public static SubLObject f3449(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var41) : var41;
        SubLObject var43 = (SubLObject)NIL;
        final SubLObject var45;
        final SubLObject var44 = var45 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var46 = module0034.$g879$.currentBinding(var42);
        try {
            module0034.$g879$.bind(var45, var42);
            SubLObject var47 = (SubLObject)NIL;
            if (NIL != var45 && NIL == module0034.f1842(var45)) {
                var47 = module0034.f1869(var45);
                final SubLObject var48 = Threads.current_process();
                if (NIL == var47) {
                    module0034.f1873(var45, var48);
                }
                else if (!var47.eql(var48)) {
                    Errors.error((SubLObject)$ic116$);
                }
            }
            try {
                var43 = f3450(var41);
            }
            finally {
                final SubLObject var13_206 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                    if (NIL != var45 && NIL == var47) {
                        module0034.f1873(var45, (SubLObject)NIL);
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
        if (var41.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var41.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        return Numbers.add(f3450(Numbers.subtract(var41, (SubLObject)ONE_INTEGER)), f3450(Numbers.subtract(var41, (SubLObject)TWO_INTEGER)));
    }
    
    public static SubLObject f3450(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0034.$g879$.getDynamicValue(var42);
        SubLObject var44 = (SubLObject)NIL;
        if (NIL == var43) {
            return f3451(var41);
        }
        var44 = module0034.f1857(var43, (SubLObject)$ic117$, (SubLObject)UNPROVIDED);
        if (NIL == var44) {
            var44 = module0034.f1807(module0034.f1842(var43), (SubLObject)$ic117$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var43, (SubLObject)$ic117$, var44);
        }
        SubLObject var45 = module0034.f1814(var44, var41, (SubLObject)$ic118$);
        if (var45 == $ic118$) {
            var45 = Values.arg2(var42.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f3451(var41)));
            module0034.f1816(var44, var41, var45, (SubLObject)UNPROVIDED);
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
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)NIL;
        }
        assert NIL != module0004.f106(var41) : var41;
        assert NIL != module0004.f105(var210) : var210;
        if (NIL != var211 && !areAssertionsDisabledFor(me) && NIL == Types.function_spec_p(var211)) {
            throw new AssertionError(var211);
        }
        final SubLObject var212 = f3454(var210);
        final SubLObject var213 = module0035.f2101(var41, var212);
        return (NIL != var211) ? Sort.sort(var213, var211, (SubLObject)UNPROVIDED) : var213;
    }
    
    public static SubLObject f3454(final SubLObject var210) {
        assert NIL != module0004.f105(var210) : var210;
        SubLObject var212;
        final SubLObject var211 = var212 = (SubLObject)ConsesLow.make_list(var210, (SubLObject)UNPROVIDED);
        SubLObject var213;
        for (var213 = (SubLObject)NIL, var213 = (SubLObject)ZERO_INTEGER; var213.numL(var210); var213 = Numbers.add(var213, (SubLObject)ONE_INTEGER)) {
            ConsesLow.rplaca(var212, var213);
            var212 = var212.rest();
        }
        return var211;
    }
    
    public static SubLObject f3455(final SubLObject var213, SubLObject var214) {
        if (var214 == UNPROVIDED) {
            var214 = (SubLObject)NIL;
        }
        SubLObject var215 = (SubLObject)NIL;
        if (NIL != var213) {
            SubLObject var216 = (SubLObject)NIL;
            SubLObject var217 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var213, var213, (SubLObject)$ic120$);
            var216 = var213.first();
            final SubLObject var218 = var217 = var213.rest();
            SubLObject var219 = var216;
            SubLObject var220 = var217;
            SubLObject var221 = (SubLObject)NIL;
            var221 = var220.first();
            while (NIL != var220) {
                final SubLObject var222 = Numbers.subtract(var221, var219);
                var215 = (SubLObject)ConsesLow.cons(var222, var215);
                var219 = var221;
                var220 = var220.rest();
                var221 = var220.first();
            }
            if (NIL != var214) {
                final SubLObject var223 = Numbers.subtract(var214, var219);
                var215 = (SubLObject)ConsesLow.cons(var223, var215);
            }
        }
        return Sequences.nreverse(var215);
    }
    
    public static SubLObject f3456(final SubLObject var41) {
        assert NIL != module0004.f106(var41) : var41;
        SubLObject var42 = (SubLObject)ONE_INTEGER;
        SubLObject var43;
        for (var43 = (SubLObject)NIL, var43 = (SubLObject)ZERO_INTEGER; var43.numL(var41); var43 = Numbers.add(var43, (SubLObject)ONE_INTEGER)) {
            var42 = Numbers.multiply(var42, f_1X(var43));
        }
        return var42;
    }
    
    public static SubLObject f3457(final SubLObject var41, final SubLObject var224) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var41) : var41;
        assert NIL != module0004.f106(var224) : var224;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var225) && !var224.numLE(var41)) {
            Errors.error((SubLObject)$ic121$, var41, var224);
        }
        SubLObject var226 = (SubLObject)ONE_INTEGER;
        SubLObject var227;
        SubLObject var228;
        for (var227 = Numbers.subtract(var41, var224), var228 = (SubLObject)NIL, var228 = var41; !var228.numLE(var227); var228 = Numbers.add(var228, (SubLObject)MINUS_ONE_INTEGER)) {
            assert NIL != module0004.f105(var228) : var228;
            var226 = Numbers.multiply(var226, var228);
        }
        return Numbers.integerDivide(var226, f3456(var224));
    }
    
    public static SubLObject f3458(final SubLObject var43) {
        return (SubLObject)makeBoolean(var43.isNumber() && var43.numG((SubLObject)ZERO_INTEGER) && var43.numL((SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f3459(final SubLObject var43) {
        return (SubLObject)makeBoolean(var43.isNumber() && var43.numL((SubLObject)ZERO_INTEGER) && var43.numG((SubLObject)MINUS_ONE_INTEGER));
    }
    
    public static SubLObject f3460(final SubLObject var44, final SubLObject var45, SubLObject var225) {
        if (var225 == UNPROVIDED) {
            var225 = (SubLObject)ZERO_INTEGER;
        }
        return Numbers.numLE(Numbers.abs(Numbers.subtract(var44, var45)), var225);
    }
    
    public static SubLObject f3461(SubLObject var226) {
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)NIL;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f3462(SubLObject var226) {
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)NIL;
        }
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f3463(final SubLObject var227) {
        SubLObject var228 = (SubLObject)NIL;
        final SubLObject var229 = var227.rest();
        SubLObject var230 = var227.first();
        SubLObject var231 = var229;
        SubLObject var232 = (SubLObject)NIL;
        var232 = var231.first();
        while (NIL != var231) {
            SubLObject var234;
            final SubLObject var233 = var234 = var230;
            SubLObject var235 = (SubLObject)NIL;
            SubLObject var236 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var234, var233, (SubLObject)$ic122$);
            var235 = var234.first();
            var234 = var234.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var234, var233, (SubLObject)$ic122$);
            var236 = var234.first();
            var234 = var234.rest();
            if (NIL == var234) {
                SubLObject var238_239;
                final SubLObject var236_237 = var238_239 = var232;
                SubLObject var237 = (SubLObject)NIL;
                SubLObject var238 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)$ic123$);
                var237 = var238_239.first();
                var238_239 = var238_239.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)$ic123$);
                var238 = var238_239.first();
                var238_239 = var238_239.rest();
                if (NIL == var238_239) {
                    final SubLObject var239 = Numbers.divide(Numbers.subtract(var238, var236), Numbers.subtract(var237, var235));
                    var228 = (SubLObject)ConsesLow.cons(var239, var228);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var236_237, (SubLObject)$ic123$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var233, (SubLObject)$ic122$);
            }
            var230 = var232;
            var231 = var231.rest();
            var232 = var231.first();
        }
        return Sequences.nreverse(var228);
    }
    
    public static SubLObject f3464(final SubLObject var96) {
        SubLObject var97 = (SubLObject)NIL;
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = (SubLObject)NIL;
        var98 = var96;
        var99 = var98.first();
        for (var100 = (SubLObject)ZERO_INTEGER; NIL != var98; var98 = var98.rest(), var99 = var98.first(), var100 = Numbers.add((SubLObject)ONE_INTEGER, var100)) {
            var97 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var100, var99), var97);
        }
        return Sequences.nreverse(var97);
    }
    
    public static SubLObject f3465(final SubLObject var243) {
        return Mapping.mapcar((SubLObject)$ic124$, var243);
    }
    
    public static SubLObject f3466(final SubLObject var227) {
        final SubLObject var228 = f3463(var227);
        return f3464(var228);
    }
    
    public static SubLObject f3467(final SubLObject var59, SubLObject var246) {
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)$ic125$;
        }
        assert NIL != module0004.f106(var246) : var246;
        final SubLObject var247 = (NIL != Numbers.oddp(var246)) ? Numbers.integerDivide(Numbers.subtract(var246, (SubLObject)ONE_INTEGER), (SubLObject)TWO_INTEGER) : Numbers.integerDivide(var246, (SubLObject)TWO_INTEGER);
        final SubLObject var248 = Numbers.add(var247, var247, (SubLObject)ONE_INTEGER);
        final SubLObject var249 = module0055.f4017();
        SubLObject var250 = (SubLObject)ZERO_INTEGER;
        SubLObject var251 = var59;
        SubLObject var252 = (SubLObject)NIL;
        SubLObject var253;
        SubLObject var254;
        for (var253 = (SubLObject)NIL, var253 = (SubLObject)ZERO_INTEGER; var253.numL(var248); var253 = Numbers.add(var253, (SubLObject)ONE_INTEGER)) {
            var254 = var251.first();
            module0055.f4021(var254, var249);
            var250 = Numbers.add(var250, var254);
            if (var253.numL(var247)) {
                var252 = (SubLObject)ConsesLow.cons(var254, var252);
            }
            var251 = var251.rest();
        }
        SubLObject var255 = var251;
        var254 = (SubLObject)NIL;
        var254 = var255.first();
        while (NIL != var255) {
            assert NIL != Types.numberp(var254) : var254;
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
        for (var257 = Numbers.add(var247, (SubLObject)ONE_INTEGER), var258 = (SubLObject)NIL, var258 = (SubLObject)ZERO_INTEGER; var258.numL(var257); var258 = Numbers.add(var258, (SubLObject)ONE_INTEGER)) {
            module0055.f4023(var249);
        }
        while (NIL == module0055.f4019(var249)) {
            final SubLObject var259 = module0055.f4023(var249);
            var252 = (SubLObject)ConsesLow.cons(var259, var252);
        }
        return Sequences.nreverse(var252);
    }
    
    public static SubLObject f3468(final SubLObject var253, final SubLObject var254) {
        SubLObject var255 = (SubLObject)ZERO_INTEGER;
        SubLObject var256 = Numbers.subtract(Sequences.length(var254), (SubLObject)ONE_INTEGER);
        while (var255.numLE(var256)) {
            final SubLObject var257 = Numbers.integerDivide(Numbers.add(var255, var256), (SubLObject)TWO_INTEGER);
            final SubLObject var258 = Vectors.aref(var254, var257);
            if (var258.numE(var253)) {
                return (SubLObject)$ic128$;
            }
            if (var258.numL(var253)) {
                var255 = Numbers.add(var257, (SubLObject)ONE_INTEGER);
            }
            else {
                if (!var258.numG(var253)) {
                    continue;
                }
                var256 = Numbers.subtract(var257, (SubLObject)ONE_INTEGER);
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
        for (var263 = (SubLObject)NIL, var263 = (SubLObject)ZERO_INTEGER; var263.numL(var260); var263 = Numbers.add(var263, (SubLObject)ONE_INTEGER)) {
            var264 = Hashtables.gethash(var263, var261, (SubLObject)UNPROVIDED);
            var265 = f3468(var263, var262);
            if (!var264.eql(var265)) {
                if (!var264.numE(var265)) {
                    Errors.error((SubLObject)$ic131$, var263, var264, var265);
                }
            }
        }
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f3471(final SubLObject var259) {
        SubLObject var260 = (SubLObject)NIL;
        SubLObject var262;
        SubLObject var261 = var262 = var259.first();
        SubLObject var263 = (SubLObject)ONE_INTEGER;
        SubLObject var264 = var259.rest();
        SubLObject var265 = (SubLObject)NIL;
        var265 = var264.first();
        while (NIL != var264) {
            var262 = Numbers.add(var262, (SubLObject)ONE_INTEGER);
            if (var262.numE(var265)) {
                var263 = Numbers.add(var263, (SubLObject)ONE_INTEGER);
            }
            else {
                if (var263.numE((SubLObject)ONE_INTEGER)) {
                    var260 = (SubLObject)ConsesLow.cons(var261, var260);
                }
                else {
                    var260 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var261, var263), var260);
                }
                var261 = var265;
                var262 = var265;
                var263 = (SubLObject)ONE_INTEGER;
            }
            var264 = var264.rest();
            var265 = var264.first();
        }
        if (var263.numE((SubLObject)ONE_INTEGER)) {
            var260 = (SubLObject)ConsesLow.cons(var261, var260);
        }
        else {
            var260 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var261, var263), var260);
        }
        return Sequences.nreverse(var260);
    }
    
    public static SubLObject f3472(final SubLObject var264) {
        SubLObject var265 = (SubLObject)ZERO_INTEGER;
        SubLObject var266 = (SubLObject)NIL;
        SubLObject var267 = var264;
        SubLObject var268 = (SubLObject)NIL;
        var268 = var267.first();
        while (NIL != var267) {
            SubLObject var269 = (SubLObject)NIL;
            SubLObject var270 = (SubLObject)NIL;
            if (var268.isCons()) {
                SubLObject var272;
                final SubLObject var271 = var272 = var268;
                SubLObject var273 = (SubLObject)NIL;
                SubLObject var274 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var272, var271, (SubLObject)$ic135$);
                var273 = var272.first();
                var272 = (var274 = var272.rest());
                var269 = var273;
                var270 = var274;
            }
            else if (var268.isNumber()) {
                var269 = var268;
                var270 = (SubLObject)ONE_INTEGER;
            }
            else {
                Errors.error((SubLObject)$ic136$, var268);
            }
            var265 = Numbers.add(var265, var270);
            var266 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var269, var265), var266);
            var267 = var267.rest();
            var268 = var267.first();
        }
        return Sequences.nreverse(var266);
    }
    
    public static SubLObject f3473(final SubLObject var253, final SubLObject var274) {
        SubLObject var275 = (SubLObject)ZERO_INTEGER;
        SubLObject var276 = Numbers.subtract(Sequences.length(var274), (SubLObject)ONE_INTEGER);
        while (var275.numLE(var276)) {
            final SubLObject var277 = Numbers.integerDivide(Numbers.add(var275, var276), (SubLObject)TWO_INTEGER);
            final SubLObject var278 = Vectors.aref(var274, var277);
            final SubLObject var279 = var278.first();
            if (var279.numE(var253)) {
                return (SubLObject)$ic128$;
            }
            if (var279.numL(var253)) {
                var275 = Numbers.add(var277, (SubLObject)ONE_INTEGER);
            }
            else {
                if (!var279.numG(var253)) {
                    continue;
                }
                var276 = Numbers.subtract(var277, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != module0004.f106(var276)) {
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
        for (var265 = (SubLObject)NIL, var265 = (SubLObject)ZERO_INTEGER; var265.numL(var260); var265 = Numbers.add(var265, (SubLObject)ONE_INTEGER)) {
            var266 = Hashtables.gethash(var265, var262, (SubLObject)UNPROVIDED);
            var267 = (SubLObject)NIL;
            if ($ic128$ != var266) {
                var267 = f3473(var265, var264);
                if (!var266.eql(var267)) {
                    if (!var267.isNumber() || !var266.numE(var267)) {
                        Errors.error((SubLObject)$ic131$, var265, var266, var267);
                    }
                }
            }
        }
        SubLObject var268 = var263;
        SubLObject var269 = (SubLObject)NIL;
        var269 = var268.first();
        while (NIL != var268) {
            final SubLObject var270 = var269.first();
            final SubLObject var271 = f3473(var270, var264);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var261) && $ic128$ != var271) {
                Errors.error((SubLObject)$ic140$, var271);
            }
            var268 = var268.rest();
            var269 = var268.first();
        }
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f3470(final SubLObject var259, final SubLObject var260) {
        final SubLObject var261 = Hashtables.make_hash_table(var260, (SubLObject)EQL, (SubLObject)UNPROVIDED);
        SubLObject var262 = (SubLObject)ZERO_INTEGER;
        SubLObject var263;
        for (var263 = (SubLObject)NIL, var263 = (SubLObject)ZERO_INTEGER; var263.numL(var260); var263 = Numbers.add(var263, (SubLObject)ONE_INTEGER)) {
            if (Sequences.find(var263, var259, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isNumber()) {
                Hashtables.sethash(var263, var261, (SubLObject)$ic128$);
            }
            else {
                Hashtables.sethash(var263, var261, var262);
                var262 = Numbers.add(var262, (SubLObject)ONE_INTEGER);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3476() {
        $g977$ = SubLFiles.deflexical("S#4861", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic2$));
        $g978$ = SubLFiles.defconstant("S#4862", Numbers.$exp1$.getGlobalValue());
        $g979$ = SubLFiles.deflexical("S#4863", (SubLObject)SIXTEEN_INTEGER);
        $g980$ = SubLFiles.deflexical("S#4864", (SubLObject)$ic71$);
        $g981$ = SubLFiles.deflexical("S#4865", (SubLObject)$ic73$);
        $g982$ = SubLFiles.deflexical("S#4866", (SubLObject)$ic74$);
        $g983$ = SubLFiles.defconstant("S#4867", (SubLObject)$ic75$);
        $g984$ = SubLFiles.defconstant("S#4868", Numbers.truncate(Numbers.log(Numbers.abs(Numbers.$most_negative_fixnum$.getGlobalValue()), (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED));
        $g985$ = SubLFiles.defconstant("S#4869", conses_high.assoc($g984$.getGlobalValue(), $g983$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest());
        $g986$ = SubLFiles.defconstant("S#4870", (SubLObject)ONE_INTEGER);
        $g987$ = SubLFiles.defconstant("S#4871", (SubLObject)ZERO_INTEGER);
        $g988$ = SubLFiles.defparameter("S#4872", (SubLObject)ONE_INTEGER);
        $g989$ = SubLFiles.defparameter("S#4873", (SubLObject)ZERO_INTEGER);
        $g990$ = SubLFiles.defparameter("S#4874", (SubLObject)$ic103$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3477() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic0$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic1$);
        module0012.f368((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)NIL, (SubLObject)$ic8$);
        module0027.f1449((SubLObject)$ic76$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), (SubLObject)$ic83$);
        module0002.f50((SubLObject)$ic84$, (SubLObject)$ic85$);
        module0034.f1895((SubLObject)$ic117$);
        module0027.f1449((SubLObject)$ic126$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, EQUALP, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), (SubLObject)$ic127$);
        module0027.f1449((SubLObject)$ic129$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), $ic130$);
        module0027.f1449((SubLObject)$ic133$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, Symbols.symbol_function((SubLObject)EQUAL), $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), (SubLObject)$ic134$);
        module0027.f1449((SubLObject)$ic137$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, Symbols.symbol_function((SubLObject)EQUAL), $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), (SubLObject)$ic138$);
        module0027.f1449((SubLObject)$ic139$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), $ic130$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_130_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)SEVEN_INTEGER, (SubLObject)TEN_INTEGER), (SubLObject)TWELVE_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) }), (SubLObject)makeInteger(1460)), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(39), makeInteger(40), makeInteger(41), makeInteger(42), makeInteger(43), makeInteger(44), makeInteger(45), makeInteger(46), makeInteger(47), makeInteger(48), makeInteger(49), makeInteger(50), makeInteger(51), makeInteger(52), makeInteger(53), makeInteger(54), makeInteger(55), makeInteger(56), makeInteger(57), makeInteger(58), makeInteger(59), makeInteger(60), makeInteger(61), makeInteger(62), makeInteger(63), makeInteger(64), makeInteger(65), makeInteger(66), makeInteger(67), makeInteger(68), makeInteger(69), makeInteger(70), makeInteger(71), makeInteger(72), makeInteger(73), makeInteger(80), makeInteger(82), makeInteger(83), makeInteger(301), makeInteger(302), makeInteger(309), makeInteger(316), makeInteger(317), makeInteger(351), makeInteger(352), makeInteger(353), makeInteger(884), makeInteger(885), makeInteger(886), makeInteger(887), makeInteger(888), makeInteger(889), makeInteger(890), makeInteger(891), makeInteger(892), makeInteger(893), makeInteger(894), makeInteger(895), makeInteger(896), makeInteger(897), makeInteger(898), makeInteger(899), makeInteger(900), makeInteger(901), makeInteger(902), makeInteger(903), makeInteger(904), makeInteger(905), makeInteger(906), makeInteger(907), makeInteger(908), makeInteger(909), makeInteger(910), makeInteger(911), makeInteger(912), makeInteger(913), makeInteger(914), makeInteger(915), makeInteger(916), makeInteger(917), makeInteger(918), makeInteger(919), makeInteger(920), makeInteger(921), makeInteger(922), makeInteger(923), makeInteger(924), makeInteger(925), makeInteger(926), makeInteger(927), makeInteger(928), makeInteger(929), makeInteger(930), makeInteger(931), makeInteger(932), makeInteger(933), makeInteger(934), makeInteger(935), makeInteger(936), makeInteger(937), makeInteger(938), makeInteger(939), makeInteger(940), makeInteger(941), makeInteger(942), makeInteger(943), makeInteger(944), makeInteger(945), makeInteger(946), makeInteger(947), makeInteger(948), makeInteger(949), makeInteger(950), makeInteger(951), makeInteger(952), makeInteger(953), makeInteger(954), makeInteger(955), makeInteger(956), makeInteger(957), makeInteger(958), makeInteger(959), makeInteger(960), makeInteger(961), makeInteger(962), makeInteger(963), makeInteger(964), makeInteger(965), makeInteger(966), makeInteger(967), makeInteger(968), makeInteger(969), makeInteger(970), makeInteger(971), makeInteger(972), makeInteger(973), makeInteger(974), makeInteger(984), makeInteger(985), makeInteger(986), makeInteger(1324), makeInteger(1325), makeInteger(1326), makeInteger(1327), makeInteger(1619), makeInteger(1629), makeInteger(1630), makeInteger(1631), makeInteger(1632), makeInteger(1641), makeInteger(1642), makeInteger(1643), makeInteger(1645), makeInteger(1646), makeInteger(1647), makeInteger(1649), makeInteger(1650), makeInteger(1651), makeInteger(1653), makeInteger(1655), makeInteger(1656), makeInteger(1657), makeInteger(1658), makeInteger(1723), makeInteger(1729), makeInteger(1733), makeInteger(1740), makeInteger(1741), makeInteger(1742), makeInteger(1743), makeInteger(1745), makeInteger(1756), makeInteger(1757), makeInteger(1758), makeInteger(1759), makeInteger(1760), makeInteger(1810), makeInteger(1834), makeInteger(1835), makeInteger(1868), makeInteger(2084), makeInteger(2145), makeInteger(2146), makeInteger(2170), makeInteger(2185), makeInteger(2186), makeInteger(2187), makeInteger(2194), makeInteger(2198), makeInteger(2201), makeInteger(2202), makeInteger(2203), makeInteger(2204), makeInteger(2205), makeInteger(2207), makeInteger(2211), makeInteger(2215), makeInteger(2216), makeInteger(2218), makeInteger(2223), makeInteger(2226), makeInteger(2227), makeInteger(2228), makeInteger(2256), makeInteger(2263), makeInteger(2269), makeInteger(2270), makeInteger(2271), makeInteger(2273), makeInteger(2277), makeInteger(2278), makeInteger(2283), makeInteger(2287), makeInteger(2289), makeInteger(2291), makeInteger(2292), makeInteger(2293), makeInteger(2295), makeInteger(2296), makeInteger(2297), makeInteger(2299), makeInteger(2316), makeInteger(2319), makeInteger(2321), makeInteger(2323), makeInteger(2324), makeInteger(2325), makeInteger(2330), makeInteger(2332), makeInteger(2337), makeInteger(2351), makeInteger(2364), makeInteger(2365), makeInteger(2367), makeInteger(2368), makeInteger(2372), makeInteger(2375), makeInteger(2378), makeInteger(2385), makeInteger(2386), makeInteger(2390), makeInteger(2391), makeInteger(2395), makeInteger(2402), makeInteger(2409), makeInteger(2410), makeInteger(2415), makeInteger(2418), makeInteger(2422), makeInteger(2429), makeInteger(2435), makeInteger(2437), makeInteger(2439), makeInteger(2445), makeInteger(2446), makeInteger(2450), makeInteger(2452), makeInteger(2453), makeInteger(2454), makeInteger(2455), makeInteger(2457), makeInteger(2458), makeInteger(2462), makeInteger(2463), makeInteger(2470), makeInteger(2471), makeInteger(2474), makeInteger(2475), makeInteger(2477), makeInteger(2479), makeInteger(2484), makeInteger(2487), makeInteger(2488), makeInteger(2491), makeInteger(2494), makeInteger(2497), makeInteger(2500), makeInteger(2502), makeInteger(2505), makeInteger(2506), makeInteger(2507), makeInteger(2509), makeInteger(2512), makeInteger(2513), makeInteger(2515), makeInteger(2516), makeInteger(2517), makeInteger(2518), makeInteger(2531), makeInteger(2532), makeInteger(2548), makeInteger(2549), makeInteger(2556), makeInteger(2559), makeInteger(3315), makeInteger(3317), makeInteger(3318), makeInteger(3319), makeInteger(3339), makeInteger(3342), makeInteger(3344), makeInteger(3372), makeInteger(3373), makeInteger(3374), makeInteger(3375), makeInteger(3376), makeInteger(3377), makeInteger(3378), makeInteger(3379), makeInteger(3380), makeInteger(3381), makeInteger(3382), makeInteger(3383), makeInteger(3384), makeInteger(3385), makeInteger(3386), makeInteger(3387), makeInteger(3388), makeInteger(3389), makeInteger(3390), makeInteger(3391), makeInteger(3392), makeInteger(3393), makeInteger(3394), makeInteger(3395), makeInteger(3396), makeInteger(3397), makeInteger(3398), makeInteger(3399), makeInteger(3400), makeInteger(3401), makeInteger(3402), makeInteger(3403), makeInteger(3404), makeInteger(3405), makeInteger(3406), makeInteger(3407), makeInteger(3408), makeInteger(3409), makeInteger(3410), makeInteger(3411), makeInteger(3412), makeInteger(3413), makeInteger(3414), makeInteger(3415), makeInteger(3416), makeInteger(3417), makeInteger(3418), makeInteger(3419), makeInteger(3420), makeInteger(3421), makeInteger(3422), makeInteger(3423), makeInteger(3424), makeInteger(3425), makeInteger(3426), makeInteger(3427), makeInteger(3428), makeInteger(3429), makeInteger(3430), makeInteger(3431), makeInteger(3432), makeInteger(3433), makeInteger(3434), makeInteger(3435), makeInteger(3437), makeInteger(3438), makeInteger(3439), makeInteger(3440), makeInteger(3441), makeInteger(3442), makeInteger(3443), makeInteger(3444), makeInteger(3445), makeInteger(3446), makeInteger(3447), makeInteger(3448), makeInteger(3449), makeInteger(3450), makeInteger(3451), makeInteger(3452), makeInteger(3461), makeInteger(3463), makeInteger(3464), makeInteger(3465), makeInteger(3466), makeInteger(3467), makeInteger(3476), makeInteger(3477), makeInteger(3482), makeInteger(3485), makeInteger(3486), makeInteger(3490), makeInteger(3491), makeInteger(3493), makeInteger(3496), makeInteger(3506), makeInteger(3507), makeInteger(3514), makeInteger(3598), makeInteger(3600), makeInteger(3607), makeInteger(3608), makeInteger(3609), makeInteger(3610), makeInteger(3611), makeInteger(3612), makeInteger(3613), makeInteger(3614), makeInteger(3615), makeInteger(3616), makeInteger(3617), makeInteger(3618), makeInteger(3632), makeInteger(3637), makeInteger(3638), makeInteger(3639), makeInteger(3640), makeInteger(3641), makeInteger(3642), makeInteger(3647), makeInteger(3648), makeInteger(3652), makeInteger(3653), makeInteger(3654), makeInteger(3657), makeInteger(3658), makeInteger(3727), makeInteger(3739), makeInteger(3750), makeInteger(3753), makeInteger(3756), makeInteger(3764), makeInteger(3769), makeInteger(3770), makeInteger(3793), makeInteger(3796), makeInteger(3810), makeInteger(3827), makeInteger(3829), makeInteger(3830), makeInteger(3833), makeInteger(3834), makeInteger(3835), makeInteger(3859), makeInteger(3860), makeInteger(3877), makeInteger(3878), makeInteger(3879), makeInteger(3880), makeInteger(3881), makeInteger(3882), makeInteger(3885), makeInteger(3886), makeInteger(4013), makeInteger(4038), makeInteger(4039), makeInteger(4040), makeInteger(4100), makeInteger(4149), makeInteger(4150) }), (SubLObject)makeInteger(4160)), (SubLObject)makeKeyword("SUCCESS")));
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
        $g977$ = null;
        $g978$ = null;
        $g979$ = null;
        $g980$ = null;
        $g981$ = null;
        $g982$ = null;
        $g983$ = null;
        $g984$ = null;
        $g985$ = null;
        $g986$ = null;
        $g987$ = null;
        $g988$ = null;
        $g989$ = null;
        $g990$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#4674", "CYC"), (SubLObject)makeSymbol("S#4675", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#4676", "CYC"), (SubLObject)makeSymbol("S#4677", "CYC"), (SubLObject)makeSymbol("S#4678", "CYC"));
        $ic2$ = makeInteger(26);
        $ic3$ = makeSymbol("NUMBERP");
        $ic4$ = makeInteger(256);
        $ic5$ = makeSymbol("NIL-OR-INTEGER-P");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic7$ = makeString("Return T iff OBJECT is either an integer or NIL");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic9$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic10$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic11$ = makeSymbol("INTEGERP");
        $ic12$ = makeSymbol("S#4747", "CYC");
        $ic13$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic14$ = makeInteger(-2);
        $ic15$ = makeInteger(100);
        $ic16$ = makeString("NEW must be larger than OLD");
        $ic17$ = makeString("NEW must be smaller than OLD");
        $ic18$ = makeKeyword("NEGATIVE-INFINITY");
        $ic19$ = makeKeyword("POSITIVE-INFINITY");
        $ic20$ = makeSymbol("S#4716", "CYC");
        $ic21$ = makeString("Can't divide zero by zero");
        $ic22$ = makeSymbol("S#4723", "CYC");
        $ic23$ = makeString("Can't add positive infinity and negative infinity");
        $ic24$ = makeString("Can't subtract negative infinity from itself");
        $ic25$ = makeString("Can't subtract positive infinity from itself");
        $ic26$ = makeString("Can't multiply infinity and zero");
        $ic27$ = makeString("Can't divide negative infinity by itself");
        $ic28$ = makeString("Can't divide negative infinity by positive infinity");
        $ic29$ = makeString("Can't divide positive infinity by negative infinity");
        $ic30$ = makeString("Can't divide positive infinity by itself");
        $ic31$ = makeSymbol("S#4748", "CYC");
        $ic32$ = makeKeyword("UNDEFINED");
        $ic33$ = makeSymbol("S#4763", "CYC");
        $ic34$ = makeString("Cannot compute the maximum of an atom or empty list");
        $ic35$ = makeSymbol(">");
        $ic36$ = makeString("Cannot compute the minimum of an atom or empty list");
        $ic37$ = makeSymbol("<");
        $ic38$ = makeString("Cannot compute the mean of an atom or empty list");
        $ic39$ = makeString("Cannot compute the geometric mean of an atom or empty list");
        $ic40$ = makeKeyword("VALUE");
        $ic41$ = makeString("Cannot compute the median of an atom or empty list");
        $ic42$ = makeKeyword("ITEM");
        $ic43$ = makeString("Can't return middle item from an even-length list.");
        $ic44$ = makeString("Unrecognized RETURN type ~S");
        $ic45$ = makeSymbol("S#4695", "CYC");
        $ic46$ = makeString("Cannot compute the percentile of an atom or empty list");
        $ic47$ = makeString("Cannot compute frequencies of an atom or empty list");
        $ic48$ = makeSymbol("CDR");
        $ic49$ = makeString("Cannot compute the mode of an atom or empty list");
        $ic50$ = makeString("Cannot compute the variance of an atom or empty list");
        $ic51$ = makeString("Cannot make reasonable estimate of variance from only one element");
        $ic52$ = makeString("Cannot compute the standard deviation of an atom or empty list");
        $ic53$ = makeString("Standard deviation must not be zero.");
        $ic54$ = makeSymbol("DOUBLE-FLOAT");
        $ic55$ = makeString("~%Standard Statistical Analysis");
        $ic56$ = makeString("~%=============================");
        $ic57$ = makeString("~%Count   : ~6D");
        $ic58$ = makeString("~%Min     : ~6D");
        $ic59$ = makeString("~%Median  : ~6D");
        $ic60$ = makeString("~%Mean    : ~6D");
        $ic61$ = makeString("~%Max     : ~6D");
        $ic62$ = makeString("~%Std Dev : ~6D");
        $ic63$ = makeString("X-Values and Y-Values must be of the same length ~A.");
        $ic64$ = (SubLFloat)makeDouble(1.0);
        $ic65$ = makeSymbol("LISTP");
        $ic66$ = makeSymbol("S#38", "CYC");
        $ic67$ = makeString("This integer is too large to be converted to a double-float");
        $ic68$ = makeString("~A");
        $ic69$ = makeSymbol("DIGIT-CHAR-P");
        $ic70$ = makeSymbol("S#4798", "CYC");
        $ic71$ = makeString("0123456789.-+deDE");
        $ic72$ = makeSymbol("S#4800", "CYC");
        $ic73$ = makeString("deDE");
        $ic74$ = makeString("+-");
        $ic75$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)SEVEN_INTEGER), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeInteger(31)), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeInteger(61)), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeInteger(127)), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeInteger(251)), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)makeInteger(509)), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)makeInteger(1021)), ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)makeInteger(2039)), ConsesLow.cons((SubLObject)TWELVE_INTEGER, (SubLObject)makeInteger(4093)), ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)makeInteger(8191)), ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)makeInteger(16381)), ConsesLow.cons((SubLObject)FIFTEEN_INTEGER, (SubLObject)makeInteger(32749)), ConsesLow.cons((SubLObject)SIXTEEN_INTEGER, (SubLObject)makeInteger(65521)), ConsesLow.cons((SubLObject)SEVENTEEN_INTEGER, (SubLObject)makeInteger(131071)), ConsesLow.cons((SubLObject)EIGHTEEN_INTEGER, (SubLObject)makeInteger(262139)), ConsesLow.cons((SubLObject)NINETEEN_INTEGER, (SubLObject)makeInteger(524287)), ConsesLow.cons((SubLObject)TWENTY_INTEGER, (SubLObject)makeInteger(1048573)), ConsesLow.cons((SubLObject)makeInteger(21), (SubLObject)makeInteger(2097143)), ConsesLow.cons((SubLObject)makeInteger(22), (SubLObject)makeInteger(4194301)), ConsesLow.cons((SubLObject)makeInteger(23), (SubLObject)makeInteger(8388593)), ConsesLow.cons((SubLObject)makeInteger(24), (SubLObject)makeInteger(16777213)), ConsesLow.cons((SubLObject)makeInteger(25), (SubLObject)makeInteger(33554393)), ConsesLow.cons((SubLObject)makeInteger(26), (SubLObject)makeInteger(67108859)), ConsesLow.cons((SubLObject)makeInteger(27), (SubLObject)makeInteger(134217689)), ConsesLow.cons((SubLObject)makeInteger(28), (SubLObject)makeInteger(268435399)), ConsesLow.cons((SubLObject)makeInteger(29), (SubLObject)makeInteger(536870909)), ConsesLow.cons((SubLObject)makeInteger(30), (SubLObject)makeInteger(1073741789)), ConsesLow.cons((SubLObject)makeInteger(31), (SubLObject)makeInteger(Integer.MAX_VALUE)), ConsesLow.cons((SubLObject)makeInteger(32), (SubLObject)makeInteger("4294967291")), ConsesLow.cons((SubLObject)makeInteger(33), (SubLObject)makeInteger("8589934583")), ConsesLow.cons((SubLObject)makeInteger(34), (SubLObject)makeInteger("17179869143")), ConsesLow.cons((SubLObject)makeInteger(35), (SubLObject)makeInteger("34359738337")), ConsesLow.cons((SubLObject)makeInteger(36), (SubLObject)makeInteger("68719476731")), ConsesLow.cons((SubLObject)makeInteger(37), (SubLObject)makeInteger("137438953447")), ConsesLow.cons((SubLObject)makeInteger(38), (SubLObject)makeInteger("274877906899")), ConsesLow.cons((SubLObject)makeInteger(39), (SubLObject)makeInteger("549755813881")), ConsesLow.cons((SubLObject)makeInteger(40), (SubLObject)makeInteger("1099511627689")), ConsesLow.cons((SubLObject)makeInteger(41), (SubLObject)makeInteger("2199023255531")), ConsesLow.cons((SubLObject)makeInteger(42), (SubLObject)makeInteger("4398046511093")), ConsesLow.cons((SubLObject)makeInteger(43), (SubLObject)makeInteger("8796093022151")), ConsesLow.cons((SubLObject)makeInteger(44), (SubLObject)makeInteger("17592186044399")), ConsesLow.cons((SubLObject)makeInteger(45), (SubLObject)makeInteger("35184372088777")), ConsesLow.cons((SubLObject)makeInteger(46), (SubLObject)makeInteger("70368744177643")), ConsesLow.cons((SubLObject)makeInteger(47), (SubLObject)makeInteger("140737488355213")), ConsesLow.cons((SubLObject)makeInteger(48), (SubLObject)makeInteger("281474976710597")), ConsesLow.cons((SubLObject)makeInteger(49), (SubLObject)makeInteger("562949953421231")), ConsesLow.cons((SubLObject)makeInteger(50), (SubLObject)makeInteger("1125899906842597")), ConsesLow.cons((SubLObject)makeInteger(51), (SubLObject)makeInteger("2251799813685119")), ConsesLow.cons((SubLObject)makeInteger(52), (SubLObject)makeInteger("4503599627370449")), ConsesLow.cons((SubLObject)makeInteger(53), (SubLObject)makeInteger("9007199254740881")), ConsesLow.cons((SubLObject)makeInteger(54), (SubLObject)makeInteger("18014398509481951")), ConsesLow.cons((SubLObject)makeInteger(55), (SubLObject)makeInteger("36028797018963913")), ConsesLow.cons((SubLObject)makeInteger(56), (SubLObject)makeInteger("72057594037927931")), ConsesLow.cons((SubLObject)makeInteger(57), (SubLObject)makeInteger("144115188075855859")), ConsesLow.cons((SubLObject)makeInteger(58), (SubLObject)makeInteger("288230376151711717")), ConsesLow.cons((SubLObject)makeInteger(59), (SubLObject)makeInteger("576460752303423433")), ConsesLow.cons((SubLObject)makeInteger(60), (SubLObject)makeInteger("1152921504606846883")), ConsesLow.cons((SubLObject)makeInteger(61), (SubLObject)makeInteger("2305843009213693951")), ConsesLow.cons((SubLObject)makeInteger(62), (SubLObject)makeInteger("4611686018427387847")), ConsesLow.cons((SubLObject)makeInteger(63), (SubLObject)makeInteger("9223372036854775783")), ConsesLow.cons((SubLObject)makeInteger(64), (SubLObject)makeInteger("18446744073709551557")) });
        $ic76$ = makeSymbol("S#4803", "CYC");
        $ic77$ = makeKeyword("TEST");
        $ic78$ = makeKeyword("OWNER");
        $ic79$ = makeKeyword("CLASSES");
        $ic80$ = makeKeyword("KB");
        $ic81$ = makeKeyword("TINY");
        $ic82$ = makeKeyword("WORKING?");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)T));
        $ic84$ = makeSymbol("S#4806", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)makeSymbol("S#4807", "CYC"), (SubLObject)makeSymbol("S#4808", "CYC"), (SubLObject)makeSymbol("S#4809", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4875", "CYC"), (SubLObject)makeSymbol("S#4876", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic87$ = makeSymbol("CLET");
        $ic88$ = makeSymbol("S#4872", "CYC");
        $ic89$ = makeSymbol("S#4873", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)makeSymbol("S#4870", "CYC"), (SubLObject)makeSymbol("S#4871", "CYC"));
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4877", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic92$ = makeSymbol("CAR");
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4878", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic94$ = makeSymbol("S#4807", "CYC");
        $ic95$ = makeSymbol("CSETQ");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4805", "CYC")));
        $ic97$ = makeKeyword("BASE");
        $ic98$ = makeString("~X");
        $ic99$ = makeSymbol("S#747", "CYC");
        $ic100$ = makeSymbol("ABS");
        $ic101$ = makeSymbol("S#4823", "CYC");
        $ic102$ = makeSymbol("S#4825", "CYC");
        $ic103$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)TEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_A, (SubLObject)TEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_b, (SubLObject)ELEVEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_B, (SubLObject)ELEVEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_c, (SubLObject)TWELVE_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_C, (SubLObject)TWELVE_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_d, (SubLObject)THIRTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_D, (SubLObject)THIRTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_e, (SubLObject)FOURTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_E, (SubLObject)FOURTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_f, (SubLObject)FIFTEEN_INTEGER), ConsesLow.list((SubLObject)Characters.CHAR_F, (SubLObject)FIFTEEN_INTEGER) });
        $ic104$ = ConsesLow.list((SubLObject)makeSymbol("S#4879", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic105$ = makeUninternedSymbol("US#74A80D2");
        $ic106$ = makeSymbol("CHECK-TYPE");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#4829", "CYC"));
        $ic108$ = makeSymbol("PWHEN");
        $ic109$ = makeSymbol("S#4830", "CYC");
        $ic110$ = makeSymbol("S#4829", "CYC");
        $ic111$ = makeInteger(1000);
        $ic112$ = (SubLFloat)makeDouble(1.0E-5);
        $ic113$ = makeSymbol("S#4833", "CYC");
        $ic114$ = makeString("Error sampling from ~s: (~s ~s)");
        $ic115$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic116$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic117$ = makeSymbol("S#4837", "CYC");
        $ic118$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic119$ = makeSymbol("FUNCTION-SPEC-P");
        $ic120$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FIRST"), (SubLObject)makeSymbol("REST"));
        $ic121$ = makeString("~s must be <= ~s");
        $ic122$ = ConsesLow.list((SubLObject)makeSymbol("S#4880", "CYC"), (SubLObject)makeSymbol("S#4881", "CYC"));
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("S#4882", "CYC"), (SubLObject)makeSymbol("S#4883", "CYC"));
        $ic124$ = makeSymbol("SECOND");
        $ic125$ = makeInteger(25);
        $ic126$ = makeSymbol("S#4853", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)SIX_INTEGER), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)SIX_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER }), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })));
        $ic128$ = makeKeyword("DELETED");
        $ic129$ = makeSymbol("S#4855", "CYC");
        $ic130$ = _constant_130_initializer();
        $ic131$ = makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");
        $ic132$ = makeKeyword("SUCCESS");
        $ic133$ = makeSymbol("S#4856", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), (SubLObject)ConsesLow.list(new SubLObject[] { ZERO_INTEGER, ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER), ELEVEN_INTEGER, ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), ConsesLow.cons((SubLObject)makeInteger(365), (SubLObject)FIVE_INTEGER), ConsesLow.cons((SubLObject)makeInteger(374), (SubLObject)TWO_INTEGER), makeInteger(378), ConsesLow.cons((SubLObject)makeInteger(429), (SubLObject)TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), ConsesLow.cons((SubLObject)makeInteger(538), (SubLObject)TWO_INTEGER), makeInteger(555), makeInteger(614), ConsesLow.cons((SubLObject)makeInteger(623), (SubLObject)TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), ConsesLow.cons((SubLObject)makeInteger(1146), (SubLObject)TWO_INTEGER), makeInteger(1150), ConsesLow.cons((SubLObject)makeInteger(1251), (SubLObject)TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })));
        $ic135$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#896", "CYC"));
        $ic136$ = makeString("Invalid gap list format: Unclear what to do with element ~A.");
        $ic137$ = makeSymbol("S#4857", "CYC");
        $ic138$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)SEVEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)EIGHT_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)TEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ZERO_INTEGER, ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER), ELEVEN_INTEGER, ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), ConsesLow.cons((SubLObject)makeInteger(365), (SubLObject)FIVE_INTEGER), ConsesLow.cons((SubLObject)makeInteger(374), (SubLObject)TWO_INTEGER), makeInteger(378), ConsesLow.cons((SubLObject)makeInteger(429), (SubLObject)TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), ConsesLow.cons((SubLObject)makeInteger(538), (SubLObject)TWO_INTEGER), makeInteger(555), makeInteger(614), ConsesLow.cons((SubLObject)makeInteger(623), (SubLObject)TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), ConsesLow.cons((SubLObject)makeInteger(1146), (SubLObject)TWO_INTEGER), makeInteger(1150), ConsesLow.cons((SubLObject)makeInteger(1251), (SubLObject)TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER), ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)FOUR_INTEGER), ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)EIGHT_INTEGER), ConsesLow.cons((SubLObject)makeInteger(27), (SubLObject)NINE_INTEGER), ConsesLow.cons((SubLObject)makeInteger(57), (SubLObject)TEN_INTEGER), ConsesLow.cons((SubLObject)makeInteger(59), (SubLObject)ELEVEN_INTEGER), ConsesLow.cons((SubLObject)makeInteger(64), (SubLObject)TWELVE_INTEGER), ConsesLow.cons((SubLObject)makeInteger(250), (SubLObject)THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)makeInteger(361), (SubLObject)FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)makeInteger(365), (SubLObject)NINETEEN_INTEGER), ConsesLow.cons((SubLObject)makeInteger(374), (SubLObject)makeInteger(21)), ConsesLow.cons((SubLObject)makeInteger(378), (SubLObject)makeInteger(22)), ConsesLow.cons((SubLObject)makeInteger(429), (SubLObject)makeInteger(24)), ConsesLow.cons((SubLObject)makeInteger(436), (SubLObject)makeInteger(25)), ConsesLow.cons((SubLObject)makeInteger(442), (SubLObject)makeInteger(26)), ConsesLow.cons((SubLObject)makeInteger(473), (SubLObject)makeInteger(27)), ConsesLow.cons((SubLObject)makeInteger(510), (SubLObject)makeInteger(28)), ConsesLow.cons((SubLObject)makeInteger(538), (SubLObject)makeInteger(30)), ConsesLow.cons((SubLObject)makeInteger(555), (SubLObject)makeInteger(31)), ConsesLow.cons((SubLObject)makeInteger(614), (SubLObject)makeInteger(32)), ConsesLow.cons((SubLObject)makeInteger(623), (SubLObject)makeInteger(34)), ConsesLow.cons((SubLObject)makeInteger(643), (SubLObject)makeInteger(35)), ConsesLow.cons((SubLObject)makeInteger(1041), (SubLObject)makeInteger(36)), ConsesLow.cons((SubLObject)makeInteger(1062), (SubLObject)makeInteger(37)), ConsesLow.cons((SubLObject)makeInteger(1064), (SubLObject)makeInteger(38)), ConsesLow.cons((SubLObject)makeInteger(1092), (SubLObject)makeInteger(39)), ConsesLow.cons((SubLObject)makeInteger(1096), (SubLObject)makeInteger(40)), ConsesLow.cons((SubLObject)makeInteger(1098), (SubLObject)makeInteger(41)), ConsesLow.cons((SubLObject)makeInteger(1102), (SubLObject)makeInteger(42)), ConsesLow.cons((SubLObject)makeInteger(1146), (SubLObject)makeInteger(44)), ConsesLow.cons((SubLObject)makeInteger(1150), (SubLObject)makeInteger(45)), ConsesLow.cons((SubLObject)makeInteger(1251), (SubLObject)makeInteger(47)), ConsesLow.cons((SubLObject)makeInteger(1471), (SubLObject)makeInteger(48)), ConsesLow.cons((SubLObject)makeInteger(1475), (SubLObject)makeInteger(49)), ConsesLow.cons((SubLObject)makeInteger(1485), (SubLObject)makeInteger(50)) })));
        $ic139$ = makeSymbol("S#4859", "CYC");
        $ic140$ = makeString("ID ~A should have been deleted but was renumbered to ~A.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 874 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/