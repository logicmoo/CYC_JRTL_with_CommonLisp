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
        SubLObject var3 = (SubLObject)module0084.NIL;
        SubLObject var4;
        SubLObject var5;
        for (var4 = (SubLObject)module0084.NIL, var5 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == var4 && module0084.NIL == module0066.f4841(var5); var4 = (SubLObject)module0084.T, var5 = module0066.f4840(var5)) {
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
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var3 = module0067.f4854(var1);
        final SubLObject var4 = module0067.f4861(var1);
        final SubLObject var5 = module0067.f4880(var3, var4);
        SubLObject var6;
        for (var6 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
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
        final SubLObject var7 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        module0067.f4887(var1, var6);
        return var7;
    }
    
    public static SubLObject f5762(final SubLObject var1, final SubLObject var6, final SubLObject var7) {
        assert module0084.NIL != module0067.f4852(var1) : var1;
        SubLObject var8 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var8.isList()) {
            var8 = (SubLObject)ConsesLow.cons(var7, var8);
            return module0067.f4886(var1, var6, var8);
        }
        Errors.error((SubLObject)module0084.$ic1$, var8);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5763(final SubLObject var13, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert module0084.NIL != module0066.f4823(var13) : var13;
        SubLObject var14 = module0066.f4831(var13, var6, var8, (SubLObject)module0084.UNPROVIDED);
        if (var14.isList()) {
            var14 = (SubLObject)ConsesLow.cons(var7, var14);
            return module0066.f4833(var13, var6, var14, var8);
        }
        Errors.error((SubLObject)module0084.$ic3$, var14);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5764(final SubLObject var1, final SubLObject var6) {
        assert module0084.NIL != module0067.f4852(var1) : var1;
        SubLObject var7 = (SubLObject)module0084.NIL;
        final SubLObject var8 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var8.isCons()) {
            var7 = var8.first();
            final SubLObject var9 = var8.rest();
            if (module0084.NIL == var9) {
                module0067.f4887(var1, var6);
            }
            else if (!var9.eql(var8)) {
                module0067.f4886(var1, var6, var9);
            }
        }
        else if (module0084.NIL == var8) {
            var7 = (SubLObject)module0084.NIL;
        }
        else {
            Errors.error((SubLObject)module0084.$ic4$, var8);
        }
        return var7;
    }
    
    public static SubLObject f5765(final SubLObject var1, final SubLObject var6, final SubLObject var7, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        SubLObject var16 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var16.isList()) {
            if (module0084.NIL == conses_high.member(var7, var16, var8, var15)) {
                var16 = (SubLObject)ConsesLow.cons(var7, var16);
            }
            return module0067.f4886(var1, var6, var16);
        }
        Errors.error((SubLObject)module0084.$ic1$, var16);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5766(final SubLObject var1, final SubLObject var6, final SubLObject var17, SubLObject var18, SubLObject var15) {
        if (var18 == module0084.UNPROVIDED) {
            var18 = (SubLObject)module0084.$ic5$;
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.$ic6$);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        SubLObject var19 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var19.isList()) {
            var19 = module0035.f2244(var17, var19, var18, var15);
            return module0067.f4886(var1, var6, var19);
        }
        Errors.error((SubLObject)module0084.$ic7$, var19);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5767(final SubLObject var1, final SubLObject var6, final SubLObject var19) {
        assert module0084.NIL != module0067.f4852(var1) : var1;
        assert module0084.NIL != Types.listp(var19) : var19;
        final SubLObject var20 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var20.isList()) {
            final SubLObject var21 = ConsesLow.append(var20, var19);
            return module0067.f4886(var1, var6, var21);
        }
        Errors.error((SubLObject)module0084.$ic9$, var20);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5768(final SubLObject var1, final SubLObject var6, final SubLObject var19, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        assert module0084.NIL != Types.listp(var19) : var19;
        final SubLObject var20 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var20.isList()) {
            final SubLObject var21 = conses_high.union(var20, var19, var8, var15);
            return module0067.f4886(var1, var6, var21);
        }
        Errors.error((SubLObject)module0084.$ic10$, var20);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5769(final SubLObject var1, final SubLObject var6, final SubLObject var20, SubLObject var21) {
        if (var21 == module0084.UNPROVIDED) {
            var21 = (SubLObject)module0084.NIL;
        }
        final SubLObject var22 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        assert module0084.NIL != Types.listp(var22) : var22;
        return conses_high.getf(var22, var20, var21);
    }
    
    public static SubLObject f5770(final SubLObject var1, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        final SubLObject var21 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        assert module0084.NIL != Types.listp(var21) : var21;
        return module0067.f4886(var1, var6, conses_high.putf(var21, var20, var7));
    }
    
    public static SubLObject f5771(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = (SubLObject)module0084.EQL;
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = Sequences.remove(var23, var24, var8, var15, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
            if (module0084.NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)module0084.$ic11$, var24);
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5772(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = Sequences.delete(var23, var24, var8, var15, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
            if (module0084.NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else if (!var25.eql(var24)) {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)module0084.$ic12$, var24);
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5773(final SubLObject var1, final SubLObject var6, final SubLObject var23, SubLObject var8) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var24 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var24.isList()) {
            final SubLObject var25 = module0035.f2073(var23, var24, var8);
            if (module0084.NIL == var25) {
                module0067.f4887(var1, var6);
            }
            else if (!var25.eql(var24)) {
                module0067.f4886(var1, var6, var25);
            }
        }
        else {
            Errors.error((SubLObject)module0084.$ic12$, var24);
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5774(final SubLObject var1, final SubLObject var6, final SubLObject var24, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = (SubLObject)module0084.EQL;
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var25 = module0067.f4885(var1, var6, (SubLObject)module0084.UNPROVIDED);
        if (var25.isList()) {
            SubLObject var26 = conses_high.copy_list(var25);
            SubLObject var27 = var24;
            SubLObject var28 = (SubLObject)module0084.NIL;
            var28 = var27.first();
            while (module0084.NIL != var27) {
                var26 = Sequences.delete(var28, var26, var8, var15, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
                var27 = var27.rest();
                var28 = var27.first();
            }
            if (module0084.NIL == var26) {
                module0067.f4887(var1, var6);
            }
            else if (!var26.eql(var25)) {
                module0067.f4886(var1, var6, var26);
            }
        }
        else {
            Errors.error((SubLObject)module0084.$ic12$, var25);
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5775(final SubLObject var1, final SubLObject var6, SubLObject var26) {
        if (var26 == module0084.UNPROVIDED) {
            var26 = (SubLObject)module0084.ONE_INTEGER;
        }
        SubLObject var27 = module0067.f4885(var1, var6, (SubLObject)module0084.ZERO_INTEGER);
        var27 = Numbers.add(var27, var26);
        module0067.f4886(var1, var6, var27);
        return var1;
    }
    
    public static SubLObject f5776(final SubLObject var1, final SubLObject var6, SubLObject var27) {
        if (var27 == module0084.UNPROVIDED) {
            var27 = (SubLObject)module0084.ONE_INTEGER;
        }
        return f5777(var1, var6, var27, Symbols.symbol_function((SubLObject)module0084.$ic13$));
    }
    
    public static SubLObject f5777(final SubLObject var1, final SubLObject var6, SubLObject var27, SubLObject var8) {
        if (var27 == module0084.UNPROVIDED) {
            var27 = (SubLObject)module0084.ONE_INTEGER;
        }
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.$ic14$);
        }
        SubLObject var28 = module0067.f4885(var1, var6, (SubLObject)module0084.ZERO_INTEGER);
        var28 = Numbers.subtract(var28, var27);
        if (module0084.NIL != Functions.funcall(var8, var28)) {
            module0067.f4887(var1, var6);
        }
        else {
            module0067.f4886(var1, var6, var28);
        }
        return var1;
    }
    
    public static SubLObject f5778(final SubLObject var1, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0084.NIL != module0067.f4883(var1) : var1;
        SubLObject var10 = f5759(var1);
        SubLObject var11 = module0067.f4885(var1, var10, (SubLObject)module0084.UNPROVIDED);
        SubLObject var12;
        for (var12 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var12); var12 = module0066.f4840(var12)) {
            var9.resetMultipleValues();
            final SubLObject var13 = module0066.f4839(var12);
            final SubLObject var14 = var9.secondMultipleValue();
            var9.resetMultipleValues();
            if (module0084.NIL != Functions.funcall(var8, var14, var11)) {
                var10 = var13;
                var11 = var14;
            }
        }
        module0066.f4842(var12);
        return Values.values(var10, var11);
    }
    
    public static SubLObject f5779(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0084.ZERO_INTEGER;
        SubLObject var4;
        for (var4 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var4); var4 = module0066.f4840(var4)) {
            var2.resetMultipleValues();
            final SubLObject var5 = module0066.f4839(var4);
            final SubLObject var6 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            assert module0084.NIL != Types.numberp(var6) : var6;
            var3 = Numbers.add(var3, var6);
        }
        module0066.f4842(var4);
        return var3;
    }
    
    public static SubLObject f5780(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0084.NIL != module0067.f4852(var1) : var1;
        final SubLObject var3 = module0067.f4854(var1);
        SubLObject var4 = (SubLObject)module0084.NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
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
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        final SubLObject var32 = Sequences.length(var31);
        final SubLObject var33 = module0067.f4880(var8, var32);
        SubLObject var34 = var31;
        SubLObject var35 = (SubLObject)module0084.NIL;
        var35 = var34.first();
        while (module0084.NIL != var34) {
            SubLObject var37;
            final SubLObject var36 = var37 = var35;
            SubLObject var38 = (SubLObject)module0084.NIL;
            SubLObject var39 = (SubLObject)module0084.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0084.$ic17$);
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
        assert module0084.NIL != module0067.f4852(var1) : var1;
        SubLObject var3 = (SubLObject)module0084.NIL;
        SubLObject var4 = (SubLObject)module0084.NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
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
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        final SubLObject var38 = module0067.f4880(var8, (SubLObject)module0084.UNPROVIDED);
        SubLObject var39 = (SubLObject)module0084.NIL;
        SubLObject var6_40 = (SubLObject)module0084.NIL;
        SubLObject var40 = (SubLObject)module0084.NIL;
        SubLObject var7_42 = (SubLObject)module0084.NIL;
        var39 = var35;
        var6_40 = var39.first();
        var40 = var37;
        var7_42 = var40.first();
        while (module0084.NIL != var40 || module0084.NIL != var39) {
            module0067.f4886(var38, var6_40, var7_42);
            var39 = var39.rest();
            var6_40 = var39.first();
            var40 = var40.rest();
            var7_42 = var40.first();
        }
        return var38;
    }
    
    public static SubLObject f5784(final SubLObject var35, final SubLObject var37, SubLObject var8) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        final SubLObject var38 = module0067.f4880(var8, (SubLObject)module0084.UNPROVIDED);
        SubLObject var39 = (SubLObject)module0084.NIL;
        SubLObject var6_44 = (SubLObject)module0084.NIL;
        SubLObject var40 = (SubLObject)module0084.NIL;
        SubLObject var7_46 = (SubLObject)module0084.NIL;
        var39 = var35;
        var6_44 = var39.first();
        var40 = var37;
        var7_46 = var40.first();
        while (module0084.NIL != var40 || module0084.NIL != var39) {
            f5762(var38, var6_44, var7_46);
            var39 = var39.rest();
            var6_44 = var39.first();
            var40 = var40.rest();
            var7_46 = var40.first();
        }
        return var38;
    }
    
    public static SubLObject f5785(final SubLObject var37, final SubLObject var47, SubLObject var8) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        final SubLObject var48 = Mapping.mapcar(var47, var37);
        return f5784(var48, var37, var8);
    }
    
    public static SubLObject f5786(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)module0084.NIL;
        SubLObject var54 = (SubLObject)module0084.NIL;
        SubLObject var55 = (SubLObject)module0084.NIL;
        SubLObject var56 = (SubLObject)module0084.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
        var54 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
        var55 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
        var56 = var51.first();
        var51 = var51.rest();
        if (module0084.NIL == var51) {
            var51 = var52;
            SubLObject var57 = (SubLObject)module0084.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic18$);
            var57 = var51.first();
            var51 = var51.rest();
            if (module0084.NIL == var51) {
                SubLObject var58 = (SubLObject)module0084.NIL;
                if (module0084.NIL == module0035.f2428(var54, var57, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED)) {
                    var58 = (SubLObject)ConsesLow.cons(var54, var58);
                }
                if (module0084.NIL == module0035.f2428(var53, var57, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED)) {
                    var58 = (SubLObject)ConsesLow.cons(var53, var58);
                }
                final SubLObject var59 = (SubLObject)module0084.$ic19$;
                return (SubLObject)ConsesLow.list((SubLObject)module0084.$ic20$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var59, var55)), (SubLObject)ConsesLow.listS((SubLObject)module0084.$ic21$, var56, (SubLObject)module0084.$ic22$), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0084.$ic0$, var59), (SubLObject)ConsesLow.listS((SubLObject)module0084.$ic24$, (SubLObject)ConsesLow.list(var53, var54, var55), ConsesLow.append((SubLObject)((module0084.NIL != var58) ? ConsesLow.list(reader.bq_cons((SubLObject)module0084.$ic25$, ConsesLow.append(var58, (SubLObject)module0084.NIL))) : module0084.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.$ic26$, var57, var56)))), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic21$, var56, (SubLObject)ConsesLow.list((SubLObject)module0084.$ic27$, var56))));
            }
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0084.$ic18$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0084.$ic18$);
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5787(final SubLObject var58) {
        final SubLObject var59 = compatibility.open_text(var58, (SubLObject)module0084.$ic28$);
        SubLObject var60 = (SubLObject)module0084.NIL;
        SubLObject var61 = (SubLObject)module0084.NIL;
        final SubLObject var62 = module0067.f4880((SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
        while (module0084.NIL == var61) {
            var60 = module0035.f2511((SubLObject)Characters.CHAR_newline, var59, (SubLObject)module0084.UNPROVIDED);
            if (var60.isString()) {
                var61 = (SubLObject)module0084.T;
            }
            else {
                module0067.f4886(var62, var60.first(), conses_high.second(var60));
            }
        }
        streams_high.close(var59, (SubLObject)module0084.UNPROVIDED);
        return var62;
    }
    
    public static SubLObject f5788(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic29$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)module0084.NIL;
        SubLObject var54 = (SubLObject)module0084.NIL;
        SubLObject var55 = (SubLObject)module0084.NIL;
        SubLObject var56 = (SubLObject)module0084.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic29$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic29$);
        var54 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic29$);
        var55 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic29$);
        var56 = var51.first();
        var51 = var51.rest();
        final SubLObject var57 = (SubLObject)(var51.isCons() ? var51.first() : module0084.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var51, var50, (SubLObject)module0084.$ic29$);
        var51 = var51.rest();
        if (module0084.NIL == var51) {
            final SubLObject var58;
            var51 = (var58 = var52);
            return (SubLObject)ConsesLow.list((SubLObject)module0084.$ic20$, (SubLObject)ConsesLow.list(reader.bq_cons(var55, (SubLObject)module0084.$ic30$)), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic24$, (SubLObject)ConsesLow.list(var53, var54, var56, var57), reader.bq_cons((SubLObject)module0084.$ic31$, ConsesLow.append(var58, (SubLObject)module0084.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic32$, var55)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0084.$ic29$);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5789(final SubLObject var38, SubLObject var68) {
        if (var68 == module0084.UNPROVIDED) {
            var68 = (SubLObject)module0084.T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); module0084.NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)module0084.$ic33$, var71, var72);
        }
        module0066.f4842(var70);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5790(final SubLObject var38, SubLObject var68) {
        if (var68 == module0084.UNPROVIDED) {
            var68 = (SubLObject)module0084.T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); module0084.NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)module0084.$ic34$, var71);
            if (module0084.NIL != module0067.f4852(var72)) {
                streams_high.terpri(var68);
                f5789(var72, var68);
                streams_high.terpri(var68);
            }
            else {
                PrintLow.format(var68, (SubLObject)module0084.$ic35$, var72);
            }
        }
        module0066.f4842(var70);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5791(final SubLObject var38, SubLObject var68) {
        if (var68 == module0084.UNPROVIDED) {
            var68 = (SubLObject)module0084.T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70;
        for (var70 = module0066.f4838(module0067.f4891(var38)); module0084.NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
            var69.resetMultipleValues();
            final SubLObject var71 = module0066.f4839(var70);
            final SubLObject var72 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            PrintLow.format(var68, (SubLObject)module0084.$ic34$, var71);
            if (var72.isHashtable()) {
                streams_high.terpri(var68);
                module0030.f1638(var72, var68);
                streams_high.terpri(var68);
            }
            else {
                PrintLow.format(var68, (SubLObject)module0084.$ic35$, var72);
            }
        }
        module0066.f4842(var70);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5792(final SubLObject var1, SubLObject var69, SubLObject var70, SubLObject var71) {
        if (var70 == module0084.UNPROVIDED) {
            var70 = (SubLObject)module0084.NIL;
        }
        if (var71 == module0084.UNPROVIDED) {
            var71 = (SubLObject)module0084.NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert module0084.NIL != Types.stringp(var69) : var69;
        if (module0084.NIL == module0038.f2673(var69, (SubLObject)module0084.$ic37$, (SubLObject)module0084.UNPROVIDED)) {
            var69 = Sequences.cconcatenate(var69, (SubLObject)module0084.$ic37$);
        }
        if (module0084.NIL != Filesys.probe_file(var69)) {
            Filesys.delete_file(var69);
        }
        SubLObject var73 = (SubLObject)module0084.NIL;
        try {
            final SubLObject var74;
            var73 = (var74 = StreamsLow.open(var69, new SubLObject[] { module0084.$ic38$, module0084.$ic39$, module0084.$ic40$, module0084.$ic41$ }));
            if (var70.isString() || var71.isString()) {
                PrintLow.format(var74, (SubLObject)module0084.$ic42$, var70, var71);
            }
            SubLObject var75;
            for (var75 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
                var72.resetMultipleValues();
                final SubLObject var76 = module0066.f4839(var75);
                final SubLObject var77 = var72.secondMultipleValue();
                var72.resetMultipleValues();
                PrintLow.format(var74, (SubLObject)module0084.$ic43$, var76, var77);
            }
            module0066.f4842(var75);
        }
        finally {
            final SubLObject var78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var72);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0084.T, var72);
                if (module0084.NIL != var73) {
                    streams_high.close(var73, (SubLObject)module0084.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var78, var72);
            }
        }
        return var69;
    }
    
    public static SubLObject f5793(final SubLObject var69, SubLObject var8, SubLObject var75, SubLObject var76) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var75 == module0084.UNPROVIDED) {
            var75 = (SubLObject)module0084.NIL;
        }
        if (var76 == module0084.UNPROVIDED) {
            var76 = (SubLObject)module0084.NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0067.f4880(var8, (SubLObject)module0084.UNPROVIDED);
        SubLObject var79 = (SubLObject)module0084.T;
        SubLObject var80 = (SubLObject)module0084.NIL;
        try {
            final SubLObject var81 = stream_macros.$stream_requires_locking$.currentBinding(var77);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0084.NIL, var77);
                var80 = compatibility.open_text(var69, (SubLObject)module0084.$ic28$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var81, var77);
            }
            if (!var80.isStream()) {
                Errors.error((SubLObject)module0084.$ic44$, var69);
            }
            final SubLObject var82 = var80;
            if (var82.isStream()) {
                final SubLObject var81_82 = var82;
                SubLObject var83 = (SubLObject)module0084.NIL;
                SubLObject var84 = (SubLObject)module0084.NIL;
                var83 = (SubLObject)module0084.ZERO_INTEGER;
                for (var84 = module0075.f5202(var81_82); module0084.NIL != var84; var84 = module0075.f5202(var81_82)) {
                    final SubLObject var85 = module0038.f2738(var84, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.$ic45$, (SubLObject)module0084.$ic45$)), (SubLObject)module0084.NIL, (SubLObject)module0084.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)module0084.UNPROVIDED);
                    if (module0084.NIL == var79 || module0084.NIL == var75) {
                        final SubLObject var86 = module0038.f2956(var85.first(), var76);
                        SubLObject var87 = (SubLObject)module0084.NIL;
                        if (module0084.NIL != module0035.f1998(var85)) {
                            var87 = module0038.f2956(conses_high.second(var85), var76);
                        }
                        else {
                            SubLObject var88 = var85.rest();
                            SubLObject var89 = (SubLObject)module0084.NIL;
                            var89 = var88.first();
                            while (module0084.NIL != var88) {
                                var87 = (SubLObject)ConsesLow.cons(module0038.f2956(var89, var76), var87);
                                var88 = var88.rest();
                                var89 = var88.first();
                            }
                            var87 = Sequences.nreverse(var87);
                        }
                        module0067.f4886(var78, var86, var87);
                    }
                    var79 = (SubLObject)module0084.NIL;
                    var83 = module0048.f_1X(var83);
                }
            }
        }
        finally {
            final SubLObject var90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var77);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0084.T, var77);
                if (var80.isStream()) {
                    streams_high.close(var80, (SubLObject)module0084.UNPROVIDED);
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
        if (var6 == module0084.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = (SubLObject)ConsesLow.list(var1, var18, var6);
        final SubLObject var21 = module0067.f4902(var1);
        SubLObject var22 = (SubLObject)module0084.NIL;
        final SubLObject var23 = module0084.$g1169$.currentBinding(var19);
        try {
            module0084.$g1169$.bind(var20, var19);
            var22 = Sort.sort(var21, (SubLObject)module0084.$ic46$, (SubLObject)module0084.UNPROVIDED);
        }
        finally {
            module0084.$g1169$.rebind(var23, var19);
        }
        return var22;
    }
    
    public static SubLObject f5797(final SubLObject var91, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var95;
        final SubLObject var94 = var95 = module0084.$g1169$.getDynamicValue(var93);
        SubLObject var96 = (SubLObject)module0084.NIL;
        SubLObject var97 = (SubLObject)module0084.NIL;
        SubLObject var98 = (SubLObject)module0084.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0084.$ic47$);
        var96 = var95.first();
        var95 = var95.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0084.$ic47$);
        var97 = var95.first();
        var95 = var95.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0084.$ic47$);
        var98 = var95.first();
        var95 = var95.rest();
        if (module0084.NIL == var95) {
            final SubLObject var99 = module0067.f4885(var96, var91, (SubLObject)module0084.UNPROVIDED);
            final SubLObject var100 = Functions.funcall(var98, var99);
            final SubLObject var101 = module0067.f4885(var96, var92, (SubLObject)module0084.UNPROVIDED);
            final SubLObject var102 = Functions.funcall(var98, var101);
            return Functions.funcall(var97, var100, var102);
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0084.$ic47$);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5798(final SubLObject var31, final SubLObject var99, SubLObject var6) {
        if (var6 == module0084.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        final SubLObject var100 = f5781(var31, (SubLObject)module0084.UNPROVIDED);
        return f5796(var100, var99, var6);
    }
    
    public static SubLObject f5799(final SubLObject var1, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = module0067.f4880(module0067.f4854(var1), module0067.f4861(var1));
        SubLObject var103;
        for (var103 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var103); var103 = module0066.f4840(var103)) {
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
        final SubLObject var104 = f5781(var31, (SubLObject)module0084.UNPROVIDED);
        final SubLObject var105 = f5799(var104, var100);
        SubLObject var106;
        for (var106 = module0066.f4838(module0067.f4891(var104)); module0084.NIL == module0066.f4841(var106); var106 = module0066.f4840(var106)) {
            var103.resetMultipleValues();
            final SubLObject var107 = module0066.f4839(var106);
            final SubLObject var108 = var103.secondMultipleValue();
            var103.resetMultipleValues();
            final SubLObject var109 = Functions.funcall(var100, var108);
            final SubLObject var110 = module0067.f4884(var105, var107, (SubLObject)module0084.UNPROVIDED);
            if (module0084.NIL == Errors.$ignore_mustsP$.getDynamicValue(var103) && module0084.NIL == Functions.funcall(var102, var109, var110)) {
                Errors.error((SubLObject)module0084.$ic58$, new SubLObject[] { var107, var110, var102, var109 });
            }
        }
        module0066.f4842(var106);
        return (SubLObject)module0084.$ic59$;
    }
    
    public static SubLObject f5801(final SubLObject var1, final SubLObject var105, SubLObject var106) {
        if (var106 == module0084.UNPROVIDED) {
            var106 = (SubLObject)module0084.NIL;
        }
        if (module0084.NIL != module0067.f4882(var1)) {
            return (SubLObject)module0084.NIL;
        }
        if (module0084.NIL == var106) {
            var106 = f5796(var1, Symbols.symbol_function((SubLObject)module0084.$ic60$), (SubLObject)module0084.UNPROVIDED);
        }
        final SubLObject var107 = f5779(var1);
        final SubLObject var108 = Numbers.divide(var107, var105);
        SubLObject var109 = (SubLObject)module0084.ZERO_INTEGER;
        final SubLObject var110 = Numbers.multiply(var108, Numbers.subtract(var105, (SubLObject)module0084.ONE_INTEGER));
        SubLObject var111 = (SubLObject)module0084.ZERO_INTEGER;
        SubLObject var112 = (SubLObject)module0084.NIL;
        SubLObject var113 = (SubLObject)module0084.NIL;
        SubLObject var114 = (SubLObject)module0084.NIL;
        SubLObject var115 = (SubLObject)module0084.NIL;
        SubLObject var116 = (SubLObject)module0084.NIL;
        var114 = var106;
        var115 = var114.first();
        for (var116 = (SubLObject)module0084.ZERO_INTEGER; module0084.NIL == var113 && module0084.NIL != var114; var114 = var114.rest(), var115 = var114.first(), var116 = Numbers.add((SubLObject)module0084.ONE_INTEGER, var116)) {
            final SubLObject var117 = module0067.f4885(var1, var115, (SubLObject)module0084.ZERO_INTEGER);
            for (var111 = Numbers.add(var111, var117); var111.numG(var109); var109 = Numbers.add(var109, var108), var113 = Numbers.numGE(var109, var110)) {
                var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var115, var116, var111), var112);
            }
        }
        final SubLObject var118 = conses_high.last(var106, (SubLObject)module0084.UNPROVIDED).first();
        final SubLObject var119 = Numbers.subtract(module0067.f4861(var1), (SubLObject)module0084.ONE_INTEGER);
        var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var118, var119, var107), var112);
        return Sequences.nreverse(var112);
    }
    
    public static SubLObject f5802(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic61$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)module0084.NIL;
        SubLObject var54 = (SubLObject)module0084.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic61$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic61$);
        var54 = var51.first();
        var51 = var51.rest();
        SubLObject var55 = (SubLObject)module0084.NIL;
        SubLObject var56 = var51;
        SubLObject var57 = (SubLObject)module0084.NIL;
        SubLObject var123_124 = (SubLObject)module0084.NIL;
        while (module0084.NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)module0084.$ic61$);
            var123_124 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)module0084.$ic61$);
            if (module0084.NIL == conses_high.member(var123_124, (SubLObject)module0084.$ic62$, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED)) {
                var57 = (SubLObject)module0084.T;
            }
            if (var123_124 == module0084.$ic63$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (module0084.NIL != var57 && module0084.NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0084.$ic61$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)module0084.$ic64$, var51);
        final SubLObject var59 = (SubLObject)((module0084.NIL != var58) ? conses_high.cadr(var58) : module0084.NIL);
        final SubLObject var60;
        var51 = (var60 = var52);
        final SubLObject var61 = (SubLObject)module0084.$ic65$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0084.$ic24$, (SubLObject)ConsesLow.list(var53, var61, var54, var59), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic25$, var61), ConsesLow.append(var60, (SubLObject)module0084.NIL));
    }
    
    public static SubLObject f5803(final SubLObject var48, final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic66$);
        final SubLObject var52 = var51.rest();
        var51 = var51.first();
        SubLObject var53 = (SubLObject)module0084.NIL;
        SubLObject var54 = (SubLObject)module0084.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic66$);
        var53 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0084.$ic66$);
        var54 = var51.first();
        var51 = var51.rest();
        SubLObject var55 = (SubLObject)module0084.NIL;
        SubLObject var56 = var51;
        SubLObject var57 = (SubLObject)module0084.NIL;
        SubLObject var132_133 = (SubLObject)module0084.NIL;
        while (module0084.NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)module0084.$ic66$);
            var132_133 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var50, (SubLObject)module0084.$ic66$);
            if (module0084.NIL == conses_high.member(var132_133, (SubLObject)module0084.$ic62$, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED)) {
                var57 = (SubLObject)module0084.T;
            }
            if (var132_133 == module0084.$ic63$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (module0084.NIL != var57 && module0084.NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0084.$ic66$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)module0084.$ic64$, var51);
        final SubLObject var59 = (SubLObject)((module0084.NIL != var58) ? conses_high.cadr(var58) : module0084.NIL);
        final SubLObject var60;
        var51 = (var60 = var52);
        final SubLObject var61 = (SubLObject)module0084.$ic67$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0084.$ic24$, (SubLObject)ConsesLow.list(var61, var53, var54, var59), (SubLObject)ConsesLow.list((SubLObject)module0084.$ic25$, var61), ConsesLow.append(var60, (SubLObject)module0084.NIL));
    }
    
    public static SubLObject f5804(final SubLObject var135, SubLObject var1) {
        if (var1 == module0084.UNPROVIDED) {
            var1 = (SubLObject)module0084.NIL;
        }
        if (module0084.NIL == module0067.f4852(var1)) {
            var1 = module0067.f4880((SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        assert module0084.NIL != Types.listp(var135) : var135;
        SubLObject var136 = var135;
        SubLObject var137 = (SubLObject)module0084.NIL;
        var137 = var136.first();
        while (module0084.NIL != var136) {
            SubLObject var139;
            final SubLObject var138 = var139 = var137;
            SubLObject var140 = (SubLObject)module0084.NIL;
            SubLObject var141 = (SubLObject)module0084.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0084.$ic68$);
            var140 = var139.first();
            var139 = var139.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0084.$ic68$);
            var141 = var139.first();
            var139 = var139.rest();
            if (module0084.NIL == var139) {
                module0067.f4886(var1, var140, var141);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var138, (SubLObject)module0084.$ic68$);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return var1;
    }
    
    public static SubLObject f5805(final SubLObject var35, final SubLObject var37, SubLObject var1) {
        if (var1 == module0084.UNPROVIDED) {
            var1 = (SubLObject)module0084.NIL;
        }
        if (module0084.NIL == module0067.f4852(var1)) {
            var1 = module0067.f4880((SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
        }
        assert module0084.NIL != module0067.f4852(var1) : var1;
        assert module0084.NIL != Types.listp(var35) : var35;
        assert module0084.NIL != Types.listp(var37) : var37;
        SubLObject var38 = (SubLObject)module0084.NIL;
        SubLObject var6_140 = (SubLObject)module0084.NIL;
        SubLObject var39 = (SubLObject)module0084.NIL;
        SubLObject var7_142 = (SubLObject)module0084.NIL;
        var38 = var35;
        var6_140 = var38.first();
        var39 = var37;
        var7_142 = var39.first();
        while (module0084.NIL != var39 || module0084.NIL != var38) {
            module0067.f4886(var1, var6_140, var7_142);
            var38 = var38.rest();
            var6_140 = var38.first();
            var39 = var39.rest();
            var7_142 = var39.first();
        }
        return var1;
    }
    
    public static SubLObject f5806(final SubLObject var1, final SubLObject var7, SubLObject var143) {
        if (var143 == module0084.UNPROVIDED) {
            var143 = (SubLObject)module0084.NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145;
        for (var145 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
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
        if (var143 == module0084.UNPROVIDED) {
            var143 = (SubLObject)module0084.NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)module0084.NIL;
        SubLObject var146;
        for (var146 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var146); var146 = module0066.f4840(var146)) {
            var144.resetMultipleValues();
            final SubLObject var147 = module0066.f4839(var146);
            final SubLObject var148 = var144.secondMultipleValue();
            var144.resetMultipleValues();
            if (var7.equal(var148)) {
                var145 = (SubLObject)ConsesLow.cons(var147, var145);
            }
        }
        module0066.f4842(var146);
        if (module0084.NIL != var145) {
            return Sequences.nreverse(var145);
        }
        return var143;
    }
    
    public static SubLObject f5808(final SubLObject var1, final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!module0084.$g1170$.getGlobalValue().eql(module0067.f4885(var1, var6, module0084.$g1170$.getGlobalValue())));
    }
    
    public static SubLObject f5809(final SubLObject var1, final SubLObject var7, SubLObject var8) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10;
        for (var10 = module0066.f4838(module0067.f4891(var1)); module0084.NIL == module0066.f4841(var10); var10 = module0066.f4840(var10)) {
            var9.resetMultipleValues();
            final SubLObject var11 = module0066.f4839(var10);
            final SubLObject var12 = var9.secondMultipleValue();
            var9.resetMultipleValues();
            if (module0084.NIL != Functions.funcall(var8, var12, var7)) {
                return (SubLObject)module0084.T;
            }
        }
        module0066.f4842(var10);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5810(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == module0084.UNPROVIDED) {
            var149 = (SubLObject)module0084.NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        SubLObject var151;
        for (var151 = module0066.f4838(module0067.f4891(var148)); module0084.NIL == module0066.f4841(var151); var151 = module0066.f4840(var151)) {
            var150.resetMultipleValues();
            final SubLObject var152 = module0066.f4839(var151);
            final SubLObject var153 = var150.secondMultipleValue();
            var150.resetMultipleValues();
            if (module0084.NIL != var149) {
                var150.resetMultipleValues();
                final SubLObject var154 = module0067.f4884(var147, var152, (SubLObject)module0084.UNPROVIDED);
                final SubLObject var155 = var150.secondMultipleValue();
                var150.resetMultipleValues();
                if (module0084.NIL != var155) {
                    Errors.warn((SubLObject)module0084.$ic70$, var152, var154, var153);
                }
            }
            module0067.f4886(var147, var152, var153);
        }
        module0066.f4842(var151);
        return var147;
    }
    
    public static SubLObject f5811(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == module0084.UNPROVIDED) {
            var149 = (SubLObject)module0084.NIL;
        }
        final SubLObject var150 = f5760(var147);
        return f5810(var150, var148, var149);
    }
    
    public static SubLObject f5812(final SubLObject var147, final SubLObject var148, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert module0084.NIL != module0067.f4852(var147) : var147;
        assert module0084.NIL != module0067.f4852(var148) : var148;
        SubLObject var150;
        for (var150 = module0066.f4838(module0067.f4891(var148)); module0084.NIL == module0066.f4841(var150); var150 = module0066.f4840(var150)) {
            var149.resetMultipleValues();
            final SubLObject var151 = module0066.f4839(var150);
            final SubLObject var152 = var149.secondMultipleValue();
            var149.resetMultipleValues();
            if (module0084.NIL != module0067.f4884(var147, var151, (SubLObject)module0084.UNPROVIDED)) {
                SubLObject var153 = var152;
                SubLObject var154 = (SubLObject)module0084.NIL;
                var154 = var153.first();
                while (module0084.NIL != var153) {
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
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5813(final SubLObject var147, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150;
        for (var150 = module0066.f4838(module0067.f4891(var148)); module0084.NIL == module0066.f4841(var150); var150 = module0066.f4840(var150)) {
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
        if (var8 == module0084.UNPROVIDED) {
            var8 = module0067.f4854(var153);
        }
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (var153.eql(var154)) {
            return (SubLObject)module0084.T;
        }
        SubLObject var156;
        SubLObject var157;
        SubLObject var159;
        SubLObject var160;
        for (var156 = (SubLObject)module0084.NIL, var157 = module0066.f4838(module0067.f4891(var153)); module0084.NIL == var156 && module0084.NIL == module0066.f4841(var157); var156 = (SubLObject)SubLObjectFactory.makeBoolean(module0084.NIL == Functions.funcall(var8, var159, var160)), var157 = module0066.f4840(var157)) {
            var155.resetMultipleValues();
            final SubLObject var158 = module0066.f4839(var157);
            var159 = var155.secondMultipleValue();
            var155.resetMultipleValues();
            var160 = module0067.f4884(var154, var158, module0084.$g1171$.getGlobalValue());
        }
        module0066.f4842(var157);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0084.NIL == var156);
    }
    
    public static SubLObject f5816(final SubLObject var158, final SubLObject var159, SubLObject var8) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = module0067.f4854(var158);
        }
        if (var158.eql(var159)) {
            return (SubLObject)module0084.T;
        }
        if (module0067.f4861(var158).numE(module0067.f4861(var159))) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0084.NIL != f5815(var158, var159, var8) && module0084.NIL != f5815(var159, var158, var8));
        }
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5817(final SubLObject var160, final SubLObject var68) {
        f5818(var160, var68, (SubLObject)module0084.ZERO_INTEGER);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5819(final SubLObject var160) {
        return (SubLObject)((var160.getClass() == $sX7401_native.class) ? module0084.T : module0084.NIL);
    }
    
    public static SubLObject f5820(final SubLObject var160) {
        assert module0084.NIL != f5819(var160) : var160;
        return var160.getField2();
    }
    
    public static SubLObject f5821(final SubLObject var160) {
        assert module0084.NIL != f5819(var160) : var160;
        return var160.getField3();
    }
    
    public static SubLObject f5822(final SubLObject var160, final SubLObject var162) {
        assert module0084.NIL != f5819(var160) : var160;
        return var160.setField2(var162);
    }
    
    public static SubLObject f5823(final SubLObject var160, final SubLObject var162) {
        assert module0084.NIL != f5819(var160) : var160;
        return var160.setField3(var162);
    }
    
    public static SubLObject f5824(SubLObject var163) {
        if (var163 == module0084.UNPROVIDED) {
            var163 = (SubLObject)module0084.NIL;
        }
        final SubLObject var164 = (SubLObject)new $sX7401_native();
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        SubLObject var168;
        for (var165 = (SubLObject)module0084.NIL, var165 = var163; module0084.NIL != var165; var165 = conses_high.cddr(var165)) {
            var166 = var165.first();
            var167 = conses_high.cadr(var165);
            var168 = var166;
            if (var168.eql((SubLObject)module0084.$ic85$)) {
                f5822(var164, var167);
            }
            else if (var168.eql((SubLObject)module0084.$ic86$)) {
                f5823(var164, var167);
            }
            else {
                Errors.error((SubLObject)module0084.$ic87$, var166);
            }
        }
        return var164;
    }
    
    public static SubLObject f5825(final SubLObject var169, final SubLObject var170) {
        Functions.funcall(var170, var169, (SubLObject)module0084.$ic88$, (SubLObject)module0084.$ic89$, (SubLObject)module0084.TWO_INTEGER);
        Functions.funcall(var170, var169, (SubLObject)module0084.$ic90$, (SubLObject)module0084.$ic85$, f5820(var169));
        Functions.funcall(var170, var169, (SubLObject)module0084.$ic90$, (SubLObject)module0084.$ic86$, f5821(var169));
        Functions.funcall(var170, var169, (SubLObject)module0084.$ic91$, (SubLObject)module0084.$ic89$, (SubLObject)module0084.TWO_INTEGER);
        return var169;
    }
    
    public static SubLObject f5826(final SubLObject var169, final SubLObject var170) {
        return f5825(var169, var170);
    }
    
    public static SubLObject f5827(SubLObject var8, SubLObject var9) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var9 == module0084.UNPROVIDED) {
            var9 = (SubLObject)module0084.ZERO_INTEGER;
        }
        final SubLObject var10 = f5824((SubLObject)module0084.UNPROVIDED);
        f5822(var10, module0067.f4880(var8, var9));
        f5823(var10, Locks.make_lock((SubLObject)module0084.$ic93$));
        return var10;
    }
    
    public static SubLObject f5818(final SubLObject var172, final SubLObject var68, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        if (module0084.NIL != print_high.$print_readably$.getDynamicValue(var174)) {
            print_high.print_not_readable(var172, var68);
        }
        else {
            streams_high.write_string((SubLObject)module0084.$ic94$, var68, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var172), new SubLObject[] { module0084.$ic95$, var68 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var68);
            final SubLObject var175 = f5821(var172);
            SubLObject var176 = (SubLObject)module0084.NIL;
            try {
                var176 = Locks.seize_lock(var175);
                PrintLow.format(var68, (SubLObject)module0084.$ic96$, module0067.f4851(f5820(var172), var68, var173), f5821(var172));
            }
            finally {
                if (module0084.NIL != var176) {
                    Locks.release_lock(var175);
                }
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var68);
            PrintLow.write(Equality.pointer(var172), new SubLObject[] { module0084.$ic95$, var68, module0084.$ic97$, module0084.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var68);
        }
        return var172;
    }
    
    public static SubLObject f5828(final SubLObject var180) {
        assert module0084.NIL != f5819(var180) : var180;
        final SubLObject var181 = f5821(var180);
        SubLObject var182 = (SubLObject)module0084.NIL;
        try {
            var182 = Locks.seize_lock(var181);
            module0067.f4881(f5820(var180));
        }
        finally {
            if (module0084.NIL != var182) {
                Locks.release_lock(var181);
            }
        }
        return var180;
    }
    
    public static SubLObject f5829(final SubLObject var180, final SubLObject var6, final SubLObject var7) {
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4886(f5820(var180), var6, var7);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5830(final SubLObject var180, final SubLObject var6) {
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4887(f5820(var180), var6);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5831(final SubLObject var180, final SubLObject var6, SubLObject var143) {
        if (var143 == module0084.UNPROVIDED) {
            var143 = (SubLObject)module0084.NIL;
        }
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4884(f5820(var180), var6, var143);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5832(final SubLObject var180, final SubLObject var6, SubLObject var143) {
        if (var143 == module0084.UNPROVIDED) {
            var143 = (SubLObject)module0084.NIL;
        }
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4885(f5820(var180), var6, var143);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5833(final SubLObject var180, final SubLObject var6, final SubLObject var7) {
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = f5762(f5820(var180), var6, var7);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5834(final SubLObject var180, final SubLObject var6, final SubLObject var23, SubLObject var8, SubLObject var15) {
        if (var8 == module0084.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0084.EQL);
        }
        if (var15 == module0084.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0084.IDENTITY);
        }
        assert module0084.NIL != f5819(var180) : var180;
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = f5772(f5820(var180), var6, var23, var8, var15);
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5835(final SubLObject var180) {
        SubLObject var181 = (SubLObject)module0084.NIL;
        final SubLObject var182 = f5821(var180);
        SubLObject var183 = (SubLObject)module0084.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            var181 = module0067.f4902(f5820(var180));
        }
        finally {
            if (module0084.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return var181;
    }
    
    public static SubLObject f5836(final SubLObject var9, final SubLObject var198) {
        SubLObject var199 = (SubLObject)module0084.NIL;
        SubLObject var200 = (SubLObject)module0084.NIL;
        SubLObject var201;
        for (var201 = (SubLObject)module0084.NIL, var201 = (SubLObject)module0084.ZERO_INTEGER; var201.numL(var9); var201 = Numbers.add(var201, (SubLObject)module0084.ONE_INTEGER)) {
            var199 = module0035.f2063(var199, module0166.f10752(var201), var201, (SubLObject)module0084.UNPROVIDED);
        }
        final SubLObject var202 = Time.get_internal_real_time();
        SubLObject var203;
        SubLObject var204;
        SubLObject var205;
        SubLObject var206;
        for (var203 = Numbers.divide(var198, var9), var204 = (SubLObject)module0084.NIL, var204 = (SubLObject)module0084.ZERO_INTEGER; var204.numL(var203); var204 = Numbers.add(var204, (SubLObject)module0084.ONE_INTEGER)) {
            for (var205 = (SubLObject)module0084.NIL, var205 = (SubLObject)module0084.ZERO_INTEGER; var205.numL(var9); var205 = Numbers.add(var205, (SubLObject)module0084.ONE_INTEGER)) {
                var206 = module0035.f2293(var199, module0166.f10752(var205), (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
            }
        }
        var200 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var202), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var200;
    }
    
    public static SubLObject f5837(final SubLObject var9, final SubLObject var198) {
        final SubLObject var199 = Hashtables.make_hash_table(var9, (SubLObject)module0084.EQ, (SubLObject)module0084.UNPROVIDED);
        SubLObject var200 = (SubLObject)module0084.NIL;
        SubLObject var201;
        for (var201 = (SubLObject)module0084.NIL, var201 = (SubLObject)module0084.ZERO_INTEGER; var201.numL(var9); var201 = Numbers.add(var201, (SubLObject)module0084.ONE_INTEGER)) {
            Hashtables.sethash(module0166.f10752(var201), var199, var201);
        }
        final SubLObject var202 = Time.get_internal_real_time();
        SubLObject var203;
        SubLObject var204;
        SubLObject var205;
        SubLObject var206;
        for (var203 = Numbers.divide(var198, var9), var204 = (SubLObject)module0084.NIL, var204 = (SubLObject)module0084.ZERO_INTEGER; var204.numL(var203); var204 = Numbers.add(var204, (SubLObject)module0084.ONE_INTEGER)) {
            for (var205 = (SubLObject)module0084.NIL, var205 = (SubLObject)module0084.ZERO_INTEGER; var205.numL(var9); var205 = Numbers.add(var205, (SubLObject)module0084.ONE_INTEGER)) {
                var206 = Hashtables.gethash(module0166.f10752(var205), var199, (SubLObject)module0084.UNPROVIDED);
            }
        }
        var200 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var202), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var200;
    }
    
    public static SubLObject f5838(SubLObject var206, SubLObject var198) {
        if (var206 == module0084.UNPROVIDED) {
            var206 = (SubLObject)module0084.$ic98$;
        }
        if (var198 == module0084.UNPROVIDED) {
            var198 = (SubLObject)module0084.$ic99$;
        }
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)module0084.MINUS_ONE_INTEGER;
        SubLObject var209;
        SubLObject var210;
        SubLObject var211;
        SubLObject var212;
        for (var209 = (SubLObject)module0084.NIL, var209 = (SubLObject)module0084.ZERO_INTEGER; var209.numL(var206); var209 = Numbers.add(var209, (SubLObject)module0084.ONE_INTEGER)) {
            var210 = Numbers.add((SubLObject)module0084.TWO_INTEGER, var209);
            var211 = f5836(var210, var198);
            var212 = f5837(var210, var198);
            PrintLow.format((SubLObject)module0084.T, (SubLObject)module0084.$ic100$, new SubLObject[] { var210, var211, var212 });
            streams_high.force_output(StreamsLow.$terminal_io$.getDynamicValue(var207));
            if (var208.numE((SubLObject)module0084.MINUS_ONE_INTEGER) && var212.numL(var211)) {
                var208 = var210;
            }
        }
        return var208;
    }
    
    public static SubLObject f5839(final SubLObject var8, final SubLObject var209) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        final SubLObject var211 = module0067.f4880(var8, (SubLObject)module0084.UNPROVIDED);
        final SubLObject var212 = Sequences.remove_duplicates(var209, var8, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED, (SubLObject)module0084.UNPROVIDED);
        SubLObject var213 = var209;
        SubLObject var214 = (SubLObject)module0084.NIL;
        var214 = var213.first();
        while (module0084.NIL != var213) {
            module0067.f4886(var211, var214, (SubLObject)module0084.$ic103$);
            var213 = var213.rest();
            var214 = var213.first();
        }
        final SubLObject var215 = Sequences.length(var212);
        final SubLObject var216 = module0067.f4861(var211);
        if (module0084.NIL == Errors.$ignore_mustsP$.getDynamicValue(var210) && !var215.numE(var216)) {
            Errors.error((SubLObject)module0084.$ic104$, var215, var216);
        }
        return (SubLObject)module0084.$ic59$;
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
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5841() {
        module0084.$g1169$ = SubLFiles.defparameter("S#7470", (SubLObject)module0084.NIL);
        module0084.$g1170$ = SubLFiles.deflexical("S#7471", Symbols.make_symbol((SubLObject)module0084.$ic69$));
        module0084.$g1171$ = SubLFiles.deflexical("S#7472", (module0084.NIL != Symbols.boundp((SubLObject)module0084.$ic71$)) ? module0084.$g1171$.getGlobalValue() : Symbols.gensym((SubLObject)module0084.UNPROVIDED));
        module0084.$g1172$ = SubLFiles.defconstant("S#7473", (SubLObject)module0084.$ic72$);
        return (SubLObject)module0084.NIL;
    }
    
    public static SubLObject f5842() {
        module0012.f419((SubLObject)module0084.$ic46$);
        module0027.f1449((SubLObject)module0084.$ic48$, (SubLObject)ConsesLow.list(new SubLObject[] { module0084.$ic49$, Symbols.symbol_function((SubLObject)module0084.EQUAL), module0084.$ic50$, module0084.NIL, module0084.$ic51$, module0084.NIL, module0084.$ic52$, module0084.$ic53$, module0084.$ic54$, module0084.T }), (SubLObject)module0084.$ic55$);
        module0027.f1449((SubLObject)module0084.$ic56$, (SubLObject)ConsesLow.list(new SubLObject[] { module0084.$ic49$, Symbols.symbol_function((SubLObject)module0084.EQUAL), module0084.$ic50$, module0084.NIL, module0084.$ic51$, module0084.NIL, module0084.$ic52$, module0084.$ic53$, module0084.$ic54$, module0084.T }), (SubLObject)module0084.$ic57$);
        module0003.f57((SubLObject)module0084.$ic71$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0084.$g1172$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0084.$ic79$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0084.$ic80$);
        Structures.def_csetf((SubLObject)module0084.$ic81$, (SubLObject)module0084.$ic82$);
        Structures.def_csetf((SubLObject)module0084.$ic83$, (SubLObject)module0084.$ic84$);
        Equality.identity((SubLObject)module0084.$ic72$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0084.$g1172$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0084.$ic92$));
        module0027.f1449((SubLObject)module0084.$ic101$, (SubLObject)ConsesLow.list(new SubLObject[] { module0084.$ic49$, module0084.NIL, module0084.$ic50$, module0084.NIL, module0084.$ic51$, module0084.NIL, module0084.$ic52$, module0084.$ic53$, module0084.$ic54$, module0084.T }), (SubLObject)module0084.$ic102$);
        return (SubLObject)module0084.NIL;
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
        module0084.$g1169$ = null;
        module0084.$g1170$ = null;
        module0084.$g1171$ = null;
        module0084.$g1172$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");
        $ic2$ = SubLObjectFactory.makeSymbol("S#6396", "CYC");
        $ic3$ = SubLObjectFactory.makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");
        $ic4$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");
        $ic5$ = SubLObjectFactory.makeSymbol("STRING<=");
        $ic6$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic7$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");
        $ic8$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic9$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");
        $ic10$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");
        $ic11$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");
        $ic12$ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");
        $ic13$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic14$ = SubLObjectFactory.makeSymbol("ZEROP");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6454", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7474", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#732", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#733", "CYC"));
        $ic19$ = SubLObjectFactory.makeUninternedSymbol("US#7490657");
        $ic20$ = SubLObjectFactory.makeSymbol("CLET");
        $ic21$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic22$ = ConsesLow.list((SubLObject)module0084.NIL);
        $ic23$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic24$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic25$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic26$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic27$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic28$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7475", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)module0084.ZERO_INTEGER);
        $ic31$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic32$ = SubLObjectFactory.makeSymbol("CINC");
        $ic33$ = SubLObjectFactory.makeString("~S -> ~S~%");
        $ic34$ = SubLObjectFactory.makeString("~S -> ");
        $ic35$ = SubLObjectFactory.makeString("~S~%");
        $ic36$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic37$ = SubLObjectFactory.makeString(".csv");
        $ic38$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic39$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic40$ = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $ic41$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic42$ = SubLObjectFactory.makeString("~A, ~A~%");
        $ic43$ = SubLObjectFactory.makeString("~S, ~S~%");
        $ic44$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic45$ = SubLObjectFactory.makeString("\"");
        $ic46$ = SubLObjectFactory.makeSymbol("S#7430", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#7431", "CYC");
        $ic49$ = SubLObjectFactory.makeKeyword("TEST");
        $ic50$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic51$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic52$ = SubLObjectFactory.makeKeyword("KB");
        $ic53$ = SubLObjectFactory.makeKeyword("TINY");
        $ic54$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)module0084.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)module0084.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)module0084.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)module0084.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)module0084.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sechs"), (SubLObject)module0084.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)SubLObjectFactory.makeString("sechs"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("one"), (SubLObject)module0084.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)module0084.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)module0084.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)module0084.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)module0084.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)module0084.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol(">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)SubLObjectFactory.makeString("one"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("un"), (SubLObject)module0084.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deux"), (SubLObject)module0084.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("trois"), (SubLObject)module0084.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quatre"), (SubLObject)module0084.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cinq"), (SubLObject)module0084.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seize"), (SubLObject)module0084.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seize"), (SubLObject)SubLObjectFactory.makeString("cinq"), (SubLObject)SubLObjectFactory.makeString("quatre"), (SubLObject)SubLObjectFactory.makeString("trois"), (SubLObject)SubLObjectFactory.makeString("deux"), (SubLObject)SubLObjectFactory.makeString("un"))));
        $ic56$ = SubLObjectFactory.makeSymbol("S#7433", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)module0084.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)module0084.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)module0084.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)module0084.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)module0084.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sechs"), (SubLObject)module0084.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("S#4680", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("=")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("one"), (SubLObject)module0084.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)module0084.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)module0084.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)module0084.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)module0084.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)module0084.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("SQRT"), (SubLObject)SubLObjectFactory.makeSymbol("=")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic58$ = SubLObjectFactory.makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");
        $ic59$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic60$ = SubLObjectFactory.makeSymbol(">");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic63$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic64$ = SubLObjectFactory.makeKeyword("DONE");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#1069245");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic67$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic69$ = SubLObjectFactory.makeString("KEY-MISSING");
        $ic70$ = SubLObjectFactory.makeString("Overwriting ~s from ~s to ~s");
        $ic71$ = SubLObjectFactory.makeSymbol("S#7472", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#7401", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#7402", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DICTIONARY"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7449", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7450", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7451", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7452", "CYC"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#7457", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#7448", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#7402", "CYC"));
        $ic81$ = SubLObjectFactory.makeSymbol("S#7449", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#7451", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#7450", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#7452", "CYC");
        $ic85$ = SubLObjectFactory.makeKeyword("DICTIONARY");
        $ic86$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic87$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic88$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic89$ = SubLObjectFactory.makeSymbol("S#7453", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic91$ = SubLObjectFactory.makeKeyword("END");
        $ic92$ = SubLObjectFactory.makeSymbol("S#7455", "CYC");
        $ic93$ = SubLObjectFactory.makeString("Synchronized Dictionary Lock");
        $ic94$ = SubLObjectFactory.makeString("#<");
        $ic95$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic96$ = SubLObjectFactory.makeString("DICTIONARY: ~A ~%LOCK: ~A~%");
        $ic97$ = SubLObjectFactory.makeKeyword("BASE");
        $ic98$ = SubLObjectFactory.makeInteger(50);
        $ic99$ = SubLObjectFactory.makeInteger(3000000);
        $ic100$ = SubLObjectFactory.makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");
        $ic101$ = SubLObjectFactory.makeSymbol("S#7469", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sea"), (SubLObject)SubLObjectFactory.makeString("sea"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("sea"), SubLObjectFactory.makeString("central") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0084.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic103$ = SubLObjectFactory.makeKeyword("PRESENT");
        $ic104$ = SubLObjectFactory.makeString("Expected ~A entries, but got ~A.");
    }
    
    public static final class $sX7401_native extends SubLStructNative
    {
        public SubLObject $dictionary;
        public SubLObject $lock;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX7401_native.class, module0084.$ic72$, module0084.$ic73$, module0084.$ic74$, module0084.$ic75$, new String[] { "$dictionary", "$lock" }, module0084.$ic76$, module0084.$ic77$, module0084.$ic78$);
        }
    }
    
    public static final class $f5819$UnaryFunction extends UnaryFunction
    {
        public $f5819$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7402"));
        }
        
        public SubLObject processItem(final SubLObject var161) {
            return module0084.f5819(var161);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0084.class
	Total time: 466 ms
	
	Decompiled with Procyon 0.5.32.
*/