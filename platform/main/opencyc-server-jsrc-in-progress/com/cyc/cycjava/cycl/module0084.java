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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0084 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0084";
    public static final String myFingerPrint = "1f343058e4d46c31b058ab39ffbebb3117e89eb4ddfd2fca179cd4415c67d681";
    private static SubLSymbol $g1169$;
    private static SubLSymbol $g1170$;
    private static SubLSymbol $g1171$;
    public static SubLSymbol $g1172$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLInteger $ic98$;
    private static final SubLInteger $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    
    public static SubLObject f5759(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4;
        SubLObject var5;
        for (var4 = (SubLObject)NIL, var5 = module0066.f4838(module0067.f4891(var1)); NIL == var4 && NIL == module0066.f4841(var5); var4 = (SubLObject)T, var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            var3 = var6;
        }
        module0066.f4842(var5);
        return Values.values(var3, var4);
    }
    
    public static SubLObject f5760(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var3 = module0067.f4854(var1);
        final SubLObject var4 = module0067.f4861(var1);
        final SubLObject var5 = module0067.f4880(var3, var4);
        SubLObject var6;
        for (var6 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0066.f4839(var6);
            final SubLObject var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            module0067.f4886(var5, var7, var8);
        }
        module0066.f4842(var6);
        return var5;
    }
    
    public static SubLObject f5761(final SubLObject var1, final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        module0067.f4887(var1, var6);
        return var7;
    }
    
    public static SubLObject f5762(final SubLObject var1, final SubLObject var6, final SubLObject var7) {
        assert NIL != module0067.f4852(var1) : var1;
        SubLObject var8 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var8.isList()) {
            var8 = (SubLObject)ConsesLow.cons(var7, var8);
            return module0067.f4886(var1, var6, var8);
        }
        Errors.error((SubLObject)$ic1$, var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5763(final SubLObject var13, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert NIL != module0066.f4823(var13) : var13;
        SubLObject var14 = module0066.f4831(var13, var6, var8, (SubLObject)UNPROVIDED);
        if (var14.isList()) {
            var14 = (SubLObject)ConsesLow.cons(var7, var14);
            return module0066.f4833(var13, var6, var14, var8);
        }
        Errors.error((SubLObject)$ic3$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5764(final SubLObject var1, final SubLObject var6) {
        assert NIL != module0067.f4852(var1) : var1;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var8.isCons()) {
            var7 = var8.first();
            final SubLObject var9 = var8.rest();
            if (NIL == var9) {
                module0067.f4887(var1, var6);
            }
            else if (!var9.eql(var8)) {
                module0067.f4886(var1, var6, var9);
            }
        }
        else if (NIL == var8) {
            var7 = (SubLObject)NIL;
        }
        else {
            Errors.error((SubLObject)$ic4$, var8);
        }
        return var7;
    }
    
    public static SubLObject f5765(final SubLObject var1, final SubLObject var6, final SubLObject var7, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0067.f4852(var1) : var1;
        SubLObject var16 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var16.isList()) {
            if (NIL == conses_high.member(var7, var16, var8, var15)) {
                var16 = (SubLObject)ConsesLow.cons(var7, var16);
            }
            return module0067.f4886(var1, var6, var16);
        }
        Errors.error((SubLObject)$ic1$, var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5766(final SubLObject var1, final SubLObject var6, final SubLObject var17, SubLObject var18, SubLObject var15) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic5$;
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        assert NIL != module0067.f4852(var1) : var1;
        SubLObject var19 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var19.isList()) {
            var19 = module0035.f2244(var17, var19, var18, var15);
            return module0067.f4886(var1, var6, var19);
        }
        Errors.error((SubLObject)$ic7$, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5767(final SubLObject var1, final SubLObject var6, final SubLObject var19) {
        assert NIL != module0067.f4852(var1) : var1;
        assert NIL != Types.listp(var19) : var19;
        final SubLObject var20 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var20.isList()) {
            final SubLObject var21 = ConsesLow.append(var20, var19);
            return module0067.f4886(var1, var6, var21);
        }
        Errors.error((SubLObject)$ic9$, var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5768(final SubLObject var1, final SubLObject var6, final SubLObject var19, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0067.f4852(var1) : var1;
        assert NIL != Types.listp(var19) : var19;
        final SubLObject var20 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var20.isList()) {
            final SubLObject var21 = conses_high.union(var20, var19, var8, var15);
            return module0067.f4886(var1, var6, var21);
        }
        Errors.error((SubLObject)$ic10$, var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5769(final SubLObject var1, final SubLObject var6, final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLObject var22 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        assert NIL != Types.listp(var22) : var22;
        return conses_high.getf(var22, var20, var21);
    }
    
    public static SubLObject f5770(final SubLObject var1, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        final SubLObject var21 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        assert NIL != Types.listp(var21) : var21;
        return module0067.f4886(var1, var6, conses_high.putf(var21, var20, var7));
    }
    
    public static SubLObject f5771(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)EQL;
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = Sequences.remove(var23, var24, var8, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)$ic11$, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5772(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = Sequences.delete(var23, var24, var8, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else if (!var25.eql(var24)) {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)$ic12$, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5773(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = module0035.f2073(var23, var24, var8);
            if (NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else if (!var25.eql(var24)) {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)$ic12$, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5774(final SubLObject var1, final SubLObject var6, final SubLObject var24, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)EQL;
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var25 = module0067.f4885(var1, var6, (SubLObject)UNPROVIDED);
        if (var25.isList()) {
            SubLObject var26 = conses_high.copy_list(var25);
            SubLObject var27 = var24;
            SubLObject var28 = (SubLObject)NIL;
            var28 = var27.first();
            while (NIL != var27) {
                var26 = Sequences.delete(var28, var26, var8, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var27 = var27.rest();
                var28 = var27.first();
            }
            if (NIL == var26) {
                module0067.f4887(var1, var6);
            }
            else if (!var26.eql(var25)) {
                module0067.f4886(var1, var6, var26);
            }
        }
        else {
            Errors.error((SubLObject)$ic12$, var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5775(final SubLObject var1, final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)ONE_INTEGER;
        }
        SubLObject var27 = module0067.f4885(var1, var6, (SubLObject)ZERO_INTEGER);
        var27 = Numbers.add(var27, var26);
        module0067.f4886(var1, var6, var27);
        return var1;
    }
    
    public static SubLObject f5776(final SubLObject var1, final SubLObject var6, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)ONE_INTEGER;
        }
        return f5777(var1, var6, var27, Symbols.symbol_function((SubLObject)$ic13$));
    }
    
    public static SubLObject f5777(final SubLObject var1, final SubLObject var6, SubLObject var27, SubLObject var8) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)ONE_INTEGER;
        }
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic14$);
        }
        SubLObject var28 = module0067.f4885(var1, var6, (SubLObject)ZERO_INTEGER);
        var28 = Numbers.subtract(var28, var27);
        if (NIL != Functions.funcall(var8, var28)) {
            module0067.f4887(var1, var6);
        }
        else {
            module0067.f4886(var1, var6, var28);
        }
        return var1;
    }
    
    public static SubLObject f5778(final SubLObject var1, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert NIL != module0067.f4883(var1) : var1;
        SubLObject var10 = f5759(var1);
        SubLObject var11 = module0067.f4885(var1, var10, (SubLObject)UNPROVIDED);
        SubLObject var12;
        for (var12 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var12); var12 = module0066.f4840(var12)) {
            var9.resetMultipleValues();
            final SubLObject var13 = module0066.f4839(var12);
            final SubLObject var14 = var9.secondMultipleValue();
            var9.resetMultipleValues();
            if (NIL != Functions.funcall(var8, var14, var11)) {
                var10 = var13;
                var11 = var14;
            }
        }
        module0066.f4842(var12);
        return Values.values(var10, var11);
    }
    
    public static SubLObject f5779(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        SubLObject var4;
        for (var4 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var4); var4 = module0066.f4840(var4)) {
            var2.resetMultipleValues();
            final SubLObject var5 = module0066.f4839(var4);
            final SubLObject var6 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            assert NIL != Types.numberp(var6) : var6;
            var3 = Numbers.add(var3, var6);
        }
        module0066.f4842(var4);
        return var3;
    }
    
    public static SubLObject f5780(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0067.f4852(var1) : var1;
        final SubLObject var3 = module0067.f4854(var1);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var6, var7), var4);
        }
        module0066.f4842(var5);
        return Values.values(var4, var3);
    }
    
    public static SubLObject f5781(final SubLObject var31, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var32 = Sequences.length(var31);
        final SubLObject var33 = module0067.f4880(var8, var32);
        SubLObject var34 = var31;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            SubLObject var37;
            final SubLObject var36 = var37 = var35;
            SubLObject var38 = (SubLObject)NIL;
            SubLObject var39 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic17$);
            var38 = var37.first();
            var37 = (var39 = var37.rest());
            module0067.f4886(var33, var38, var39);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f5782(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0067.f4852(var1) : var1;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            var3 = (SubLObject)ConsesLow.cons(var6, var3);
            var4 = (SubLObject)ConsesLow.cons(var7, var4);
        }
        module0066.f4842(var5);
        return (SubLObject)ConsesLow.list(var3, var4);
    }
    
    public static SubLObject f5783(final SubLObject var35, final SubLObject var37, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var38 = module0067.f4880(var8, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var6_40 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var7_42 = (SubLObject)NIL;
        var39 = var35;
        var6_40 = var39.first();
        var40 = var37;
        var7_42 = var40.first();
        while (NIL != var40 || NIL != var39) {
            module0067.f4886(var38, var6_40, var7_42);
            var39 = var39.rest();
            var6_40 = var39.first();
            var40 = var40.rest();
            var7_42 = var40.first();
        }
        return var38;
    }
    
    public static SubLObject f5784(final SubLObject var35, final SubLObject var37, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var38 = module0067.f4880(var8, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var6_44 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var7_46 = (SubLObject)NIL;
        var39 = var35;
        var6_44 = var39.first();
        var40 = var37;
        var7_46 = var40.first();
        while (NIL != var40 || NIL != var39) {
            f5762(var38, var6_44, var7_46);
            var39 = var39.rest();
            var6_44 = var39.first();
            var40 = var40.rest();
            var7_46 = var40.first();
        }
        return var38;
    }
    
    public static SubLObject f5785(final SubLObject var37, final SubLObject var47, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var48 = Mapping.mapcar(var47, var37);
        return f5784(var48, var37, var8);
    }
    
    public static SubLObject f5786(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
        var54 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
        var55 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
        var56 = var51.first();
        var51 = var51.rest();
        if (NIL == var51) {
            var51 = var52;
            SubLObject var57 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic18$);
            var57 = var51.first();
            var51 = var51.rest();
            if (NIL == var51) {
                SubLObject var58 = (SubLObject)NIL;
                if (NIL == module0035.f2428(var54, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var58 = (SubLObject)ConsesLow.cons(var54, var58);
                }
                if (NIL == module0035.f2428(var53, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var58 = (SubLObject)ConsesLow.cons(var53, var58);
                }
                final SubLObject var59 = (SubLObject)$ic19$;
                return (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var59, var55)), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var56, (SubLObject)$ic22$), (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, var59), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var53, var54, var55), ConsesLow.append((SubLObject)((NIL != var58) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic25$, ConsesLow.append(var58, (SubLObject)NIL))) : NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic26$, var57, var56)))), (SubLObject)ConsesLow.list((SubLObject)$ic21$, var56, (SubLObject)ConsesLow.list((SubLObject)$ic27$, var56))));
            }
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic18$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic18$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5787(final SubLObject var58) {
        final SubLObject var59 = compatibility.open_text(var58, (SubLObject)$ic28$);
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        final SubLObject var62 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        while (NIL == var61) {
            var60 = module0035.f2511((SubLObject)Characters.CHAR_newline, var59, (SubLObject)UNPROVIDED);
            if (var60.isString()) {
                var61 = (SubLObject)T;
            }
            else {
                module0067.f4886(var62, var60.first(), conses_high.second(var60));
            }
        }
        streams_high.close(var59, (SubLObject)UNPROVIDED);
        return var62;
    }
    
    public static SubLObject f5788(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic29$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic29$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic29$);
        var54 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic29$);
        var55 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic29$);
        var56 = var51.first();
        var51 = var51.rest();
        final SubLObject var57 = (SubLObject)(var51.isCons() ? var51.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var51, var50, (SubLObject)$ic29$);
        var51 = var51.rest();
        if (NIL == var51) {
            final SubLObject var58;
            var51 = (var58 = var52);
            return (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list(reader.bq_cons(var55, (SubLObject)$ic30$)), (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var53, var54, var56, var57), reader.bq_cons((SubLObject)$ic31$, ConsesLow.append(var58, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var55)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic29$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5789(final SubLObject var38, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)$ic33$, var71, var72);
        }
        module0066.f4842(var70);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5790(final SubLObject var38, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)$ic34$, var71);
            if (NIL != module0067.f4852(var72)) {
                streams_high.terpri(var68);
                f5789(var72, var68);
                streams_high.terpri(var68);
            }
            else {
                PrintLow.format(var68, (SubLObject)$ic35$, var72);
            }
        }
        module0066.f4842(var70);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5791(final SubLObject var38, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)$ic34$, var71);
            if (var72.isHashtable()) {
                streams_high.terpri(var68);
                module0030.f1638(var72, var68);
                streams_high.terpri(var68);
            }
            else {
                PrintLow.format(var68, (SubLObject)$ic35$, var72);
            }
        }
        module0066.f4842(var70);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5792(final SubLObject var1, SubLObject var69, SubLObject var70, SubLObject var71) {
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)NIL;
        }
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var69) : var69;
        if (NIL == module0038.f2673(var69, (SubLObject)$ic37$, (SubLObject)UNPROVIDED)) {
            var69 = Sequences.cconcatenate(var69, (SubLObject)$ic37$);
        }
        if (NIL != Filesys.probe_file(var69)) {
            Filesys.delete_file(var69);
        }
        SubLObject var73 = (SubLObject)NIL;
        try {
            final SubLObject var74;
            var73 = (var74 = StreamsLow.open(var69, new SubLObject[] { $ic38$, $ic39$, $ic40$, $ic41$ }));
            if (var70.isString() || var71.isString()) {
                PrintLow.format(var74, (SubLObject)$ic42$, var70, var71);
            }
            SubLObject var75;
            for (var75 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                var72.resetMultipleValues();
                final SubLObject var76 = module0066.f4839(var75);
                final SubLObject var77 = var72.secondMultipleValue();
                var72.resetMultipleValues();
                PrintLow.format(var74, (SubLObject)$ic43$, var76, var77);
            }
            module0066.f4842(var75);
        }
        finally {
            final SubLObject var78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var72);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var72);
                if (NIL != var73) {
                    streams_high.close(var73, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var78, var72);
            }
        }
        return var69;
    }
    
    public static SubLObject f5793(final SubLObject var69, SubLObject var8, SubLObject var75, SubLObject var76) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0067.f4880(var8, (SubLObject)UNPROVIDED);
        SubLObject var79 = (SubLObject)T;
        SubLObject var80 = (SubLObject)NIL;
        try {
            final SubLObject var81 = stream_macros.$stream_requires_locking$.currentBinding(var77);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var77);
                var80 = compatibility.open_text(var69, (SubLObject)$ic28$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var81, var77);
            }
            if (!var80.isStream()) {
                Errors.error((SubLObject)$ic44$, var69);
            }
            final SubLObject var82 = var80;
            if (var82.isStream()) {
                final SubLObject var81_82 = var82;
                SubLObject var83 = (SubLObject)NIL;
                SubLObject var84 = (SubLObject)NIL;
                var83 = (SubLObject)ZERO_INTEGER;
                for (var84 = module0075.f5202(var81_82); NIL != var84; var84 = module0075.f5202(var81_82)) {
                    final SubLObject var85 = module0038.f2738(var84, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)$ic45$)), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)UNPROVIDED);
                    if (NIL == var79 || NIL == var75) {
                        final SubLObject var86 = module0038.f2956(var85.first(), var76);
                        SubLObject var87 = (SubLObject)NIL;
                        if (NIL != module0035.f1998(var85)) {
                            var87 = module0038.f2956(conses_high.second(var85), var76);
                        }
                        else {
                            SubLObject var88 = var85.rest();
                            SubLObject var89 = (SubLObject)NIL;
                            var89 = var88.first();
                            while (NIL != var88) {
                                var87 = (SubLObject)ConsesLow.cons(module0038.f2956(var89, var76), var87);
                                var88 = var88.rest();
                                var89 = var88.first();
                            }
                            var87 = Sequences.nreverse(var87);
                        }
                        module0067.f4886(var78, var86, var87);
                    }
                    var79 = (SubLObject)NIL;
                    var83 = module0048.f_1X(var83);
                }
            }
        }
        finally {
            final SubLObject var90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var77);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var77);
                if (var80.isStream()) {
                    streams_high.close(var80, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var90, var77);
            }
        }
        return var78;
    }
    
    public static SubLObject f5794(final SubLObject var1, final SubLObject var18) {
        final SubLObject var19 = f5780(var1);
        final SubLObject var20 = module0035.f2325(var19, var18);
        return var20;
    }
    
    public static SubLObject f5795(final SubLObject var1, final SubLObject var18) {
        final SubLObject var19 = f5780(var1);
        final SubLObject var20 = module0035.f2326(var19, var18);
        return var20;
    }
    
    public static SubLObject f5796(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = (SubLObject)ConsesLow.list(var1, var18, var6);
        final SubLObject var21 = module0067.f4902(var1);
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $g1169$.currentBinding(var19);
        try {
            $g1169$.bind(var20, var19);
            var22 = Sort.sort(var21, (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
        }
        finally {
            $g1169$.rebind(var23, var19);
        }
        return var22;
    }
    
    public static SubLObject f5797(final SubLObject var91, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var95;
        final SubLObject var94 = var95 = $g1169$.getDynamicValue(var93);
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        SubLObject var98 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)$ic47$);
        var96 = var95.first();
        var95 = var95.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)$ic47$);
        var97 = var95.first();
        var95 = var95.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)$ic47$);
        var98 = var95.first();
        var95 = var95.rest();
        if (NIL == var95) {
            final SubLObject var99 = module0067.f4885(var96, var91, (SubLObject)UNPROVIDED);
            final SubLObject var100 = Functions.funcall(var98, var99);
            final SubLObject var101 = module0067.f4885(var96, var92, (SubLObject)UNPROVIDED);
            final SubLObject var102 = Functions.funcall(var98, var101);
            return Functions.funcall(var97, var100, var102);
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)$ic47$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5798(final SubLObject var31, final SubLObject var99, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var100 = f5781(var31, (SubLObject)UNPROVIDED);
        return f5796(var100, var99, var6);
    }
    
    public static SubLObject f5799(final SubLObject var1, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = module0067.f4880(module0067.f4854(var1), module0067.f4861(var1));
        SubLObject var103;
        for (var103 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var103); var103 = module0066.f4840(var103)) {
            var101.resetMultipleValues();
            final SubLObject var104 = module0066.f4839(var103);
            final SubLObject var105 = var101.secondMultipleValue();
            var101.resetMultipleValues();
            module0067.f4886(var102, var104, Functions.funcall(var100, var105));
        }
        module0066.f4842(var103);
        return var102;
    }
    
    public static SubLObject f5800(final SubLObject var31, final SubLObject var100, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = f5781(var31, (SubLObject)UNPROVIDED);
        final SubLObject var105 = f5799(var104, var100);
        SubLObject var106;
        for (var106 = module0066.f4838(module0067.f4891(var104)); NIL == module0066.f4841(var106); var106 = module0066.f4840(var106)) {
            var103.resetMultipleValues();
            final SubLObject var107 = module0066.f4839(var106);
            final SubLObject var108 = var103.secondMultipleValue();
            var103.resetMultipleValues();
            final SubLObject var109 = Functions.funcall(var100, var108);
            final SubLObject var110 = module0067.f4884(var105, var107, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var103) && NIL == Functions.funcall(var102, var109, var110)) {
                Errors.error((SubLObject)$ic58$, new SubLObject[] { var107, var110, var102, var109 });
            }
        }
        module0066.f4842(var106);
        return (SubLObject)$ic59$;
    }
    
    public static SubLObject f5801(final SubLObject var1, final SubLObject var105, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (NIL != module0067.f4882(var1)) {
            return (SubLObject)NIL;
        }
        if (NIL == var106) {
            var106 = f5796(var1, Symbols.symbol_function((SubLObject)$ic60$), (SubLObject)UNPROVIDED);
        }
        final SubLObject var107 = f5779(var1);
        final SubLObject var108 = Numbers.divide(var107, var105);
        SubLObject var109 = (SubLObject)ZERO_INTEGER;
        final SubLObject var110 = Numbers.multiply(var108, Numbers.subtract(var105, (SubLObject)ONE_INTEGER));
        SubLObject var111 = (SubLObject)ZERO_INTEGER;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        SubLObject var116 = (SubLObject)NIL;
        var114 = var106;
        var115 = var114.first();
        for (var116 = (SubLObject)ZERO_INTEGER; NIL == var113 && NIL != var114; var114 = var114.rest(), var115 = var114.first(), var116 = Numbers.add((SubLObject)ONE_INTEGER, var116)) {
            final SubLObject var117 = module0067.f4885(var1, var115, (SubLObject)ZERO_INTEGER);
            for (var111 = Numbers.add(var111, var117); var111.numG(var109); var109 = Numbers.add(var109, var108), var113 = Numbers.numGE(var109, var110)) {
                var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var115, var116, var111), var112);
            }
        }
        final SubLObject var118 = conses_high.last(var106, (SubLObject)UNPROVIDED).first();
        final SubLObject var119 = Numbers.subtract(module0067.f4861(var1), (SubLObject)ONE_INTEGER);
        var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var118, var119, var107), var112);
        return Sequences.nreverse(var112);
    }
    
    public static SubLObject f5802(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic61$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic61$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic61$);
        var54 = var51.first();
        var51 = var51.rest();
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = var51;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var123_124 = (SubLObject)NIL;
        while (NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)$ic61$);
            var123_124 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)$ic61$);
            if (NIL == conses_high.member(var123_124, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var57 = (SubLObject)T;
            }
            if (var123_124 == $ic63$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (NIL != var57 && NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic61$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var51);
        final SubLObject var59 = (SubLObject)((NIL != var58) ? conses_high.cadr(var58) : NIL);
        final SubLObject var60;
        var51 = (var60 = var52);
        final SubLObject var61 = (SubLObject)$ic65$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var53, var61, var54, var59), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var61), ConsesLow.append(var60, (SubLObject)NIL));
    }
    
    public static SubLObject f5803(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic66$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic66$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic66$);
        var54 = var51.first();
        var51 = var51.rest();
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = var51;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var132_133 = (SubLObject)NIL;
        while (NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)$ic66$);
            var132_133 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)$ic66$);
            if (NIL == conses_high.member(var132_133, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var57 = (SubLObject)T;
            }
            if (var132_133 == $ic63$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (NIL != var57 && NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic66$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var51);
        final SubLObject var59 = (SubLObject)((NIL != var58) ? conses_high.cadr(var58) : NIL);
        final SubLObject var60;
        var51 = (var60 = var52);
        final SubLObject var61 = (SubLObject)$ic67$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list(var61, var53, var54, var59), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var61), ConsesLow.append(var60, (SubLObject)NIL));
    }
    
    public static SubLObject f5804(final SubLObject var135, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (NIL == module0067.f4852(var1)) {
            var1 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        assert NIL != module0067.f4852(var1) : var1;
        assert NIL != Types.listp(var135) : var135;
        SubLObject var136 = var135;
        SubLObject var137 = (SubLObject)NIL;
        var137 = var136.first();
        while (NIL != var136) {
            SubLObject var139;
            final SubLObject var138 = var139 = var137;
            SubLObject var140 = (SubLObject)NIL;
            SubLObject var141 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)$ic68$);
            var140 = var139.first();
            var139 = var139.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)$ic68$);
            var141 = var139.first();
            var139 = var139.rest();
            if (NIL == var139) {
                module0067.f4886(var1, var140, var141);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var138, (SubLObject)$ic68$);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return var1;
    }
    
    public static SubLObject f5805(final SubLObject var35, final SubLObject var37, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (NIL == module0067.f4852(var1)) {
            var1 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        assert NIL != module0067.f4852(var1) : var1;
        assert NIL != Types.listp(var35) : var35;
        assert NIL != Types.listp(var37) : var37;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var6_140 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var7_142 = (SubLObject)NIL;
        var38 = var35;
        var6_140 = var38.first();
        var39 = var37;
        var7_142 = var39.first();
        while (NIL != var39 || NIL != var38) {
            module0067.f4886(var1, var6_140, var7_142);
            var38 = var38.rest();
            var6_140 = var38.first();
            var39 = var39.rest();
            var7_142 = var39.first();
        }
        return var1;
    }
    
    public static SubLObject f5806(final SubLObject var1, final SubLObject var7, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145;
        for (var145 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
            var144.resetMultipleValues();
            final SubLObject var146 = module0066.f4839(var145);
            final SubLObject var147 = var144.secondMultipleValue();
            var144.resetMultipleValues();
            if (var7.equal(var147)) {
                return var146;
            }
        }
        module0066.f4842(var145);
        return var143;
    }
    
    public static SubLObject f5807(final SubLObject var1, final SubLObject var7, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)NIL;
        SubLObject var146;
        for (var146 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var146); var146 = module0066.f4840(var146)) {
            var144.resetMultipleValues();
            final SubLObject var147 = module0066.f4839(var146);
            final SubLObject var148 = var144.secondMultipleValue();
            var144.resetMultipleValues();
            if (var7.equal(var148)) {
                var145 = (SubLObject)ConsesLow.cons(var147, var145);
            }
        }
        module0066.f4842(var146);
        if (NIL != var145) {
            return Sequences.nreverse(var145);
        }
        return var143;
    }
    
    public static SubLObject f5808(final SubLObject var1, final SubLObject var6) {
        return (SubLObject)makeBoolean(!$g1170$.getGlobalValue().eql(module0067.f4885(var1, var6, $g1170$.getGlobalValue())));
    }
    
    public static SubLObject f5809(final SubLObject var1, final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10;
        for (var10 = module0066.f4838(module0067.f4891(var1)); NIL == module0066.f4841(var10); var10 = module0066.f4840(var10)) {
            var9.resetMultipleValues();
            final SubLObject var11 = module0066.f4839(var10);
            final SubLObject var12 = var9.secondMultipleValue();
            var9.resetMultipleValues();
            if (NIL != Functions.funcall(var8, var12, var7)) {
                return (SubLObject)T;
            }
        }
        module0066.f4842(var10);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5810(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == UNPROVIDED) {
            var149 = (SubLObject)NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        SubLObject var151;
        for (var151 = module0066.f4838(module0067.f4891(var148)); NIL == module0066.f4841(var151); var151 = module0066.f4840(var151)) {
            var150.resetMultipleValues();
            final SubLObject var152 = module0066.f4839(var151);
            final SubLObject var153 = var150.secondMultipleValue();
            var150.resetMultipleValues();
            if (NIL != var149) {
                var150.resetMultipleValues();
                final SubLObject var154 = module0067.f4884(var147, var152, (SubLObject)UNPROVIDED);
                final SubLObject var155 = var150.secondMultipleValue();
                var150.resetMultipleValues();
                if (NIL != var155) {
                    Errors.warn((SubLObject)$ic70$, var152, var154, var153);
                }
            }
            module0067.f4886(var147, var152, var153);
        }
        module0066.f4842(var151);
        return var147;
    }
    
    public static SubLObject f5811(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == UNPROVIDED) {
            var149 = (SubLObject)NIL;
        }
        final SubLObject var150 = f5760(var147);
        return f5810(var150, var148, var149);
    }
    
    public static SubLObject f5812(final SubLObject var147, final SubLObject var148, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert NIL != module0067.f4852(var147) : var147;
        assert NIL != module0067.f4852(var148) : var148;
        SubLObject var150;
        for (var150 = module0066.f4838(module0067.f4891(var148)); NIL == module0066.f4841(var150); var150 = module0066.f4840(var150)) {
            var149.resetMultipleValues();
            final SubLObject var151 = module0066.f4839(var150);
            final SubLObject var152 = var149.secondMultipleValue();
            var149.resetMultipleValues();
            if (NIL != module0067.f4884(var147, var151, (SubLObject)UNPROVIDED)) {
                SubLObject var153 = var152;
                SubLObject var154 = (SubLObject)NIL;
                var154 = var153.first();
                while (NIL != var153) {
                    f5765(var147, var151, var154, var8, var15);
                    var153 = var153.rest();
                    var154 = var153.first();
                }
            }
            else {
                module0067.f4886(var147, var151, var152);
            }
        }
        module0066.f4842(var150);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5813(final SubLObject var147, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150;
        for (var150 = module0066.f4838(module0067.f4891(var148)); NIL == module0066.f4841(var150); var150 = module0066.f4840(var150)) {
            var149.resetMultipleValues();
            final SubLObject var151 = module0066.f4839(var150);
            final SubLObject var152 = var149.secondMultipleValue();
            var149.resetMultipleValues();
            f5775(var147, var151, var152);
        }
        module0066.f4842(var150);
        return var147;
    }
    
    public static SubLObject f5814(final SubLObject var147, final SubLObject var148) {
        final SubLObject var149 = f5760(var147);
        return f5813(var149, var148);
    }
    
    public static SubLObject f5815(final SubLObject var153, final SubLObject var154, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = module0067.f4854(var153);
        }
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (var153.eql(var154)) {
            return (SubLObject)T;
        }
        SubLObject var156;
        SubLObject var157;
        SubLObject var159;
        SubLObject var160;
        for (var156 = (SubLObject)NIL, var157 = module0066.f4838(module0067.f4891(var153)); NIL == var156 && NIL == module0066.f4841(var157); var156 = (SubLObject)makeBoolean(NIL == Functions.funcall(var8, var159, var160)), var157 = module0066.f4840(var157)) {
            var155.resetMultipleValues();
            final SubLObject var158 = module0066.f4839(var157);
            var159 = var155.secondMultipleValue();
            var155.resetMultipleValues();
            var160 = module0067.f4884(var154, var158, $g1171$.getGlobalValue());
        }
        module0066.f4842(var157);
        return (SubLObject)makeBoolean(NIL == var156);
    }
    
    public static SubLObject f5816(final SubLObject var158, final SubLObject var159, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = module0067.f4854(var158);
        }
        if (var158.eql(var159)) {
            return (SubLObject)T;
        }
        if (module0067.f4861(var158).numE(module0067.f4861(var159))) {
            return (SubLObject)makeBoolean(NIL != f5815(var158, var159, var8) && NIL != f5815(var159, var158, var8));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5817(final SubLObject var160, final SubLObject var68) {
        f5818(var160, var68, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5819(final SubLObject var160) {
        return (SubLObject)((var160.getClass() == $sX7401_native.class) ? T : NIL);
    }
    
    public static SubLObject f5820(final SubLObject var160) {
        assert NIL != f5819(var160) : var160;
        return var160.getField2();
    }
    
    public static SubLObject f5821(final SubLObject var160) {
        assert NIL != f5819(var160) : var160;
        return var160.getField3();
    }
    
    public static SubLObject f5822(final SubLObject var160, final SubLObject var162) {
        assert NIL != f5819(var160) : var160;
        return var160.setField2(var162);
    }
    
    public static SubLObject f5823(final SubLObject var160, final SubLObject var162) {
        assert NIL != f5819(var160) : var160;
        return var160.setField3(var162);
    }
    
    public static SubLObject f5824(SubLObject var163) {
        if (var163 == UNPROVIDED) {
            var163 = (SubLObject)NIL;
        }
        final SubLObject var164 = (SubLObject)new $sX7401_native();
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        SubLObject var168;
        for (var165 = (SubLObject)NIL, var165 = var163; NIL != var165; var165 = conses_high.cddr(var165)) {
            var166 = var165.first();
            var167 = conses_high.cadr(var165);
            var168 = var166;
            if (var168.eql((SubLObject)$ic85$)) {
                f5822(var164, var167);
            }
            else if (var168.eql((SubLObject)$ic86$)) {
                f5823(var164, var167);
            }
            else {
                Errors.error((SubLObject)$ic87$, var166);
            }
        }
        return var164;
    }
    
    public static SubLObject f5825(final SubLObject var169, final SubLObject var170) {
        Functions.funcall(var170, var169, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var170, var169, (SubLObject)$ic90$, (SubLObject)$ic85$, f5820(var169));
        Functions.funcall(var170, var169, (SubLObject)$ic90$, (SubLObject)$ic86$, f5821(var169));
        Functions.funcall(var170, var169, (SubLObject)$ic91$, (SubLObject)$ic89$, (SubLObject)TWO_INTEGER);
        return var169;
    }
    
    public static SubLObject f5826(final SubLObject var169, final SubLObject var170) {
        return f5825(var169, var170);
    }
    
    public static SubLObject f5827(SubLObject var8, SubLObject var9) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var10 = f5824((SubLObject)UNPROVIDED);
        f5822(var10, module0067.f4880(var8, var9));
        f5823(var10, Locks.make_lock((SubLObject)$ic93$));
        return var10;
    }
    
    public static SubLObject f5818(final SubLObject var172, final SubLObject var68, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var174)) {
            print_high.print_not_readable(var172, var68);
        }
        else {
            streams_high.write_string((SubLObject)$ic94$, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var172), new SubLObject[] { $ic95$, var68 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var68);
            final SubLObject var175 = f5821(var172);
            SubLObject var176 = (SubLObject)NIL;
            try {
                var176 = Locks.seize_lock(var175);
                PrintLow.format(var68, (SubLObject)$ic96$, module0067.f4851(f5820(var172), var68, var173), f5821(var172));
            }
            finally {
                if (NIL != var176) {
                    Locks.release_lock(var175);
                }
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var68);
            PrintLow.write(Equality.pointer(var172), new SubLObject[] { $ic95$, var68, $ic97$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var68);
        }
        return var172;
    }
    
    public static SubLObject f5828(final SubLObject var180) {
        assert NIL != f5819(var180) : var180;
        final SubLObject var181 = f5821(var180);
        SubLObject var182 = (SubLObject)NIL;
        try {
            var182 = Locks.seize_lock(var181);
            module0067.f4881(f5820(var180));
        }
        finally {
            if (NIL != var182) {
                Locks.release_lock(var181);
            }
        }
        return var180;
    }
    
    public static SubLObject f5829(final SubLObject var180, final SubLObject var6, final SubLObject var7) {
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4886(f5820(var180), var6, var7);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5830(final SubLObject var180, final SubLObject var6) {
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4887(f5820(var180), var6);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5831(final SubLObject var180, final SubLObject var6, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4884(f5820(var180), var6, var143);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5832(final SubLObject var180, final SubLObject var6, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4885(f5820(var180), var6, var143);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5833(final SubLObject var180, final SubLObject var6, final SubLObject var7) {
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = f5762(f5820(var180), var6, var7);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5834(final SubLObject var180, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = f5772(f5820(var180), var6, var23, var8, var15);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5835(final SubLObject var180) {
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4902(f5820(var180));
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5836(final SubLObject var9, final SubLObject var198) {
        SubLObject var199 = (SubLObject)NIL;
        SubLObject var200 = (SubLObject)NIL;
        SubLObject var201;
        for (var201 = (SubLObject)NIL, var201 = (SubLObject)ZERO_INTEGER; var201.numL(var9); var201 = Numbers.add(var201, (SubLObject)ONE_INTEGER)) {
            var199 = module0035.f2063(var199, constants_high_oc.f10752(var201), var201, (SubLObject)UNPROVIDED);
        }
        final SubLObject var202 = Time.get_internal_real_time();
        SubLObject var203;
        SubLObject var204;
        SubLObject var205;
        SubLObject var206;
        for (var203 = Numbers.divide(var198, var9), var204 = (SubLObject)NIL, var204 = (SubLObject)ZERO_INTEGER; var204.numL(var203); var204 = Numbers.add(var204, (SubLObject)ONE_INTEGER)) {
            for (var205 = (SubLObject)NIL, var205 = (SubLObject)ZERO_INTEGER; var205.numL(var9); var205 = Numbers.add(var205, (SubLObject)ONE_INTEGER)) {
                var206 = module0035.f2293(var199, constants_high_oc.f10752(var205), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        var200 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var202), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var200;
    }
    
    public static SubLObject f5837(final SubLObject var9, final SubLObject var198) {
        final SubLObject var199 = Hashtables.make_hash_table(var9, (SubLObject)EQ, (SubLObject)UNPROVIDED);
        SubLObject var200 = (SubLObject)NIL;
        SubLObject var201;
        for (var201 = (SubLObject)NIL, var201 = (SubLObject)ZERO_INTEGER; var201.numL(var9); var201 = Numbers.add(var201, (SubLObject)ONE_INTEGER)) {
            Hashtables.sethash(constants_high_oc.f10752(var201), var199, var201);
        }
        final SubLObject var202 = Time.get_internal_real_time();
        SubLObject var203;
        SubLObject var204;
        SubLObject var205;
        SubLObject var206;
        for (var203 = Numbers.divide(var198, var9), var204 = (SubLObject)NIL, var204 = (SubLObject)ZERO_INTEGER; var204.numL(var203); var204 = Numbers.add(var204, (SubLObject)ONE_INTEGER)) {
            for (var205 = (SubLObject)NIL, var205 = (SubLObject)ZERO_INTEGER; var205.numL(var9); var205 = Numbers.add(var205, (SubLObject)ONE_INTEGER)) {
                var206 = Hashtables.gethash(constants_high_oc.f10752(var205), var199, (SubLObject)UNPROVIDED);
            }
        }
        var200 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var202), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var200;
    }
    
    public static SubLObject f5838(SubLObject var206, SubLObject var198) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)$ic98$;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)$ic99$;
        }
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var209;
        SubLObject var210;
        SubLObject var211;
        SubLObject var212;
        for (var209 = (SubLObject)NIL, var209 = (SubLObject)ZERO_INTEGER; var209.numL(var206); var209 = Numbers.add(var209, (SubLObject)ONE_INTEGER)) {
            var210 = Numbers.add((SubLObject)TWO_INTEGER, var209);
            var211 = f5836(var210, var198);
            var212 = f5837(var210, var198);
            PrintLow.format((SubLObject)T, (SubLObject)$ic100$, new SubLObject[] { var210, var211, var212 });
            streams_high.force_output(StreamsLow.$terminal_io$.getDynamicValue(var207));
            if (var208.numE((SubLObject)MINUS_ONE_INTEGER) && var212.numL(var211)) {
                var208 = var210;
            }
        }
        return var208;
    }
    
    public static SubLObject f5839(final SubLObject var8, final SubLObject var209) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        final SubLObject var211 = module0067.f4880(var8, (SubLObject)UNPROVIDED);
        final SubLObject var212 = Sequences.remove_duplicates(var209, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var213 = var209;
        SubLObject var214 = (SubLObject)NIL;
        var214 = var213.first();
        while (NIL != var213) {
            module0067.f4886(var211, var214, (SubLObject)$ic103$);
            var213 = var213.rest();
            var214 = var213.first();
        }
        final SubLObject var215 = Sequences.length(var212);
        final SubLObject var216 = module0067.f4861(var211);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var210) && !var215.numE(var216)) {
            Errors.error((SubLObject)$ic104$, var215, var216);
        }
        return (SubLObject)$ic59$;
    }
    
    public static SubLObject f5840() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5759", "S#7019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5760", "S#3041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5761", "S#6474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5762", "DICTIONARY-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5763", "S#7403", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5764", "S#7404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5765", "DICTIONARY-PUSHNEW", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5766", "S#7405", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5767", "S#7406", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5768", "S#7407", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5769", "S#7408", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5770", "S#7409", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5771", "DICTIONARY-REMOVE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5772", "S#7410", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5773", "S#7411", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5774", "S#7412", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5775", "S#3299", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5776", "S#7413", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5777", "S#7414", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5778", "S#7415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5779", "S#7416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5780", "S#6475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5781", "S#7417", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5782", "S#7418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5783", "S#7419", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5784", "S#7420", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5785", "S#7421", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0084", "f5786", "S#7422");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5787", "S#7423", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0084", "f5788", "S#7424");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5789", "PRINT-DICTIONARY-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5790", "S#7425", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5791", "S#7426", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5792", "S#7427", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5793", "S#7428", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5794", "S#7429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5795", "S#3300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5796", "S#3296", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5797", "S#7430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5798", "S#7431", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5799", "S#7432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5800", "S#7433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5801", "S#7434", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0084", "f5802", "S#7435");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0084", "f5803", "S#7436");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5804", "S#7311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5805", "S#7437", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5806", "S#7438", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5807", "S#7439", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5808", "S#7440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5809", "S#7441", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5810", "S#7442", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5811", "S#7443", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5812", "S#7444", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5813", "S#7445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5814", "S#7446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5815", "S#7447", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5816", "S#7312", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5817", "S#7448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5819", "S#7402", 1, 0, false);
        new $f5819$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5820", "S#7449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5821", "S#7450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5822", "S#7451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5823", "S#7452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5824", "S#7453", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5825", "S#7454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5826", "S#7455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5827", "S#7456", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5818", "S#7457", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5828", "S#7458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5829", "S#7459", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5830", "S#7460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5831", "S#7461", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5832", "S#7462", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5833", "S#7463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5834", "S#7464", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5835", "S#7465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5836", "S#7466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5837", "S#7467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5838", "S#7468", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0084", "f5839", "S#7469", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5841() {
        $g1169$ = SubLFiles.defparameter("S#7470", (SubLObject)NIL);
        $g1170$ = SubLFiles.deflexical("S#7471", Symbols.make_symbol((SubLObject)$ic69$));
        $g1171$ = SubLFiles.deflexical("S#7472", (NIL != Symbols.boundp((SubLObject)$ic71$)) ? $g1171$.getGlobalValue() : Symbols.gensym((SubLObject)UNPROVIDED));
        $g1172$ = SubLFiles.defconstant("S#7473", (SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5842() {
        module0012.f419((SubLObject)$ic46$);
        module0027.f1449((SubLObject)$ic48$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic49$, Symbols.symbol_function((SubLObject)EQUAL), $ic50$, NIL, $ic51$, NIL, $ic52$, $ic53$, $ic54$, T }), (SubLObject)$ic55$);
        module0027.f1449((SubLObject)$ic56$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic49$, Symbols.symbol_function((SubLObject)EQUAL), $ic50$, NIL, $ic51$, NIL, $ic52$, $ic53$, $ic54$, T }), (SubLObject)$ic57$);
        module0003.f57((SubLObject)$ic71$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1172$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic79$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic80$);
        Structures.def_csetf((SubLObject)$ic81$, (SubLObject)$ic82$);
        Structures.def_csetf((SubLObject)$ic83$, (SubLObject)$ic84$);
        Equality.identity((SubLObject)$ic72$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1172$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic92$));
        module0027.f1449((SubLObject)$ic101$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic49$, NIL, $ic50$, NIL, $ic51$, NIL, $ic52$, $ic53$, $ic54$, T }), (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5840();
    }
    
    public void initializeVariables() {
        f5841();
    }
    
    public void runTopLevelForms() {
        f5842();
    }
    
    static {
        me = (SubLFile)new module0084();
        $g1169$ = null;
        $g1170$ = null;
        $g1171$ = null;
        $g1172$ = null;
        $ic0$ = makeSymbol("S#6424", "CYC");
        $ic1$ = makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");
        $ic2$ = makeSymbol("S#6396", "CYC");
        $ic3$ = makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");
        $ic4$ = makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");
        $ic5$ = makeSymbol("STRING<=");
        $ic6$ = makeSymbol("SYMBOL-NAME");
        $ic7$ = makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");
        $ic8$ = makeSymbol("LISTP");
        $ic9$ = makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");
        $ic10$ = makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");
        $ic11$ = makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");
        $ic12$ = makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");
        $ic13$ = makeSymbol("FALSE");
        $ic14$ = makeSymbol("ZEROP");
        $ic15$ = makeSymbol("S#6454", "CYC");
        $ic16$ = makeSymbol("NUMBERP");
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#7474", "CYC"), (SubLObject)makeSymbol("S#732", "CYC")), (SubLObject)makeSymbol("S#733", "CYC"));
        $ic19$ = makeUninternedSymbol("US#7490657");
        $ic20$ = makeSymbol("CLET");
        $ic21$ = makeSymbol("CSETQ");
        $ic22$ = ConsesLow.list((SubLObject)NIL);
        $ic23$ = makeSymbol("PWHEN");
        $ic24$ = makeSymbol("DO-DICTIONARY");
        $ic25$ = makeSymbol("IGNORE");
        $ic26$ = makeSymbol("CPUSH");
        $ic27$ = makeSymbol("NREVERSE");
        $ic28$ = makeKeyword("INPUT");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#7475", "CYC"), (SubLObject)makeSymbol("S#6423", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic31$ = makeSymbol("PROGN");
        $ic32$ = makeSymbol("CINC");
        $ic33$ = makeString("~S -> ~S~%");
        $ic34$ = makeString("~S -> ");
        $ic35$ = makeString("~S~%");
        $ic36$ = makeSymbol("STRINGP");
        $ic37$ = makeString(".csv");
        $ic38$ = makeKeyword("DIRECTION");
        $ic39$ = makeKeyword("OUTPUT");
        $ic40$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic41$ = makeKeyword("CREATE");
        $ic42$ = makeString("~A, ~A~%");
        $ic43$ = makeString("~S, ~S~%");
        $ic44$ = makeString("Unable to open ~S");
        $ic45$ = makeString("\"");
        $ic46$ = makeSymbol("S#7430", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("S#6423", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#131", "CYC"));
        $ic48$ = makeSymbol("S#7431", "CYC");
        $ic49$ = makeKeyword("TEST");
        $ic50$ = makeKeyword("OWNER");
        $ic51$ = makeKeyword("CLASSES");
        $ic52$ = makeKeyword("KB");
        $ic53$ = makeKeyword("TINY");
        $ic54$ = makeKeyword("WORKING?");
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("eins"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("zwei"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("drei"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("vier"), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("fuenf"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("sechs"), (SubLObject)SIX_INTEGER)), (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)makeString("eins"), (SubLObject)makeString("zwei"), (SubLObject)makeString("drei"), (SubLObject)makeString("vier"), (SubLObject)makeString("fuenf"), (SubLObject)makeString("sechs"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("one"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("two"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("three"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("four"), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("five"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("six"), (SubLObject)SIX_INTEGER)), (SubLObject)makeSymbol(">")), (SubLObject)ConsesLow.list((SubLObject)makeString("six"), (SubLObject)makeString("five"), (SubLObject)makeString("four"), (SubLObject)makeString("three"), (SubLObject)makeString("two"), (SubLObject)makeString("one"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("un"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeString("deux"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeString("trois"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeString("quatre"), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeString("cinq"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeString("seize"), (SubLObject)SIX_INTEGER)), (SubLObject)makeSymbol(">"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)makeString("seize"), (SubLObject)makeString("cinq"), (SubLObject)makeString("quatre"), (SubLObject)makeString("trois"), (SubLObject)makeString("deux"), (SubLObject)makeString("un"))));
        $ic56$ = makeSymbol("S#7433", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("eins"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("zwei"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("drei"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("vier"), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("fuenf"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("sechs"), (SubLObject)SIX_INTEGER)), (SubLObject)makeSymbol("S#4680", "CYC"), (SubLObject)makeSymbol("=")), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("one"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("two"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("three"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("four"), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("five"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("six"), (SubLObject)SIX_INTEGER)), (SubLObject)makeSymbol("SQRT"), (SubLObject)makeSymbol("=")), (SubLObject)makeKeyword("SUCCESS")));
        $ic58$ = makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");
        $ic59$ = makeKeyword("SUCCESS");
        $ic60$ = makeSymbol(">");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#6423", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic62$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic63$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic64$ = makeKeyword("DONE");
        $ic65$ = makeUninternedSymbol("US#1069245");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#6423", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic67$ = makeUninternedSymbol("US#3165895");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic69$ = makeString("KEY-MISSING");
        $ic70$ = makeString("Overwriting ~s from ~s to ~s");
        $ic71$ = makeSymbol("S#7472", "CYC");
        $ic72$ = makeSymbol("S#7401", "CYC");
        $ic73$ = makeSymbol("S#7402", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#6423", "CYC"), (SubLObject)makeSymbol("S#672", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)makeKeyword("DICTIONARY"), (SubLObject)makeKeyword("LOCK"));
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#7449", "CYC"), (SubLObject)makeSymbol("S#7450", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#7451", "CYC"), (SubLObject)makeSymbol("S#7452", "CYC"));
        $ic78$ = makeSymbol("S#7457", "CYC");
        $ic79$ = makeSymbol("S#7448", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7402", "CYC"));
        $ic81$ = makeSymbol("S#7449", "CYC");
        $ic82$ = makeSymbol("S#7451", "CYC");
        $ic83$ = makeSymbol("S#7450", "CYC");
        $ic84$ = makeSymbol("S#7452", "CYC");
        $ic85$ = makeKeyword("DICTIONARY");
        $ic86$ = makeKeyword("LOCK");
        $ic87$ = makeString("Invalid slot ~S for construction function");
        $ic88$ = makeKeyword("BEGIN");
        $ic89$ = makeSymbol("S#7453", "CYC");
        $ic90$ = makeKeyword("SLOT");
        $ic91$ = makeKeyword("END");
        $ic92$ = makeSymbol("S#7455", "CYC");
        $ic93$ = makeString("Synchronized Dictionary Lock");
        $ic94$ = makeString("#<");
        $ic95$ = makeKeyword("STREAM");
        $ic96$ = makeString("DICTIONARY: ~A ~%LOCK: ~A~%");
        $ic97$ = makeKeyword("BASE");
        $ic98$ = makeInteger(50);
        $ic99$ = makeInteger(3000000);
        $ic100$ = makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");
        $ic101$ = makeSymbol("S#7469", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQUALP, (SubLObject)ConsesLow.list((SubLObject)makeString("Sea"), (SubLObject)makeString("sea"))), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea") })), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central") })), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea") })), (SubLObject)makeKeyword("SUCCESS")));
        $ic103$ = makeKeyword("PRESENT");
        $ic104$ = makeString("Expected ~A entries, but got ~A.");
    }
    
    public static final class $sX7401_native extends SubLStructNative
    {
        public SubLObject $dictionary;
        public SubLObject $lock;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7401_native() {
            this.$dictionary = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7401_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$dictionary;
        }
        
        public SubLObject getField3() {
            return this.$lock;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$dictionary = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7401_native.class, $ic72$, $ic73$, $ic74$, $ic75$, new String[] { "$dictionary", "$lock" }, $ic76$, $ic77$, $ic78$);
        }
    }
    
    public static final class $f5819$UnaryFunction extends UnaryFunction
    {
        public $f5819$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7402"));
        }
        
        public SubLObject processItem(final SubLObject var161) {
            return f5819(var161);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 466 ms
	
	Decompiled with Procyon 0.5.32.
*/