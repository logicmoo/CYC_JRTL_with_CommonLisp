package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0283 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0283";
    public static final String myFingerPrint = "f7bb49e9a9245d0ad85c2deae675ce9d75a047b3bc023a397ec542f749f8076a";
    public static SubLSymbol $g2626$;
    public static SubLSymbol $g2627$;
    public static SubLSymbol $g2628$;
    public static SubLSymbol $g2629$;
    public static SubLSymbol $g2630$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    
    public static SubLObject f18756(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.equal(module0283.$g2626$.getDynamicValue(var2), var1.first());
    }
    
    public static SubLObject f18757(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.equal(module0283.$g2627$.getDynamicValue(var2), var1.first());
    }
    
    public static SubLObject f18758(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.equal(module0283.$g2628$.getDynamicValue(var2), var1.first());
    }
    
    public static SubLObject f18759(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(module0283.$g2626$.getDynamicValue(var4), var3);
    }
    
    public static SubLObject f18760(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(module0283.$g2627$.getDynamicValue(var4), var3);
    }
    
    public static SubLObject f18761(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(module0283.$g2628$.getDynamicValue(var5), var4);
    }
    
    public static SubLObject f18762(final SubLObject var5) {
        return Mapping.mapcar((SubLObject)module0283.$ic5$, var5);
    }
    
    public static SubLObject f18763(final SubLObject var1) {
        return var1.rest();
    }
    
    public static SubLObject f18764(final SubLObject var6, final SubLObject var7) {
        return Sequences.find(var6, var7, Symbols.symbol_function((SubLObject)module0283.EQL), Symbols.symbol_function((SubLObject)module0283.$ic6$), (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
    }
    
    public static SubLObject f18765(final SubLObject var8) {
        if (var8.isCons()) {
            return var8.first();
        }
        return (SubLObject)module0283.NIL;
    }
    
    public static SubLObject f18766(SubLObject var4) {
        if (!var4.isAtom()) {
            var4 = f18767(var4);
            var4 = f18768(var4);
        }
        return var4;
    }
    
    public static SubLObject f18769(SubLObject var4) {
        if (!var4.isAtom()) {
            var4 = f18767(var4);
            var4 = f18770(var4);
        }
        return var4;
    }
    
    public static SubLObject f18767(final SubLObject var4) {
        if (var4.isAtom()) {
            return var4;
        }
        if (module0283.NIL != f18758(var4)) {
            SubLObject var6;
            final SubLObject var5 = var6 = f18763(var4);
            SubLObject var7 = (SubLObject)module0283.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0283.$ic7$);
            var7 = var6.first();
            var6 = var6.rest();
            if (module0283.NIL == var6) {
                if (var7.isAtom()) {
                    return var4;
                }
                if (module0283.NIL != f18758(var7)) {
                    SubLObject var14_15;
                    final SubLObject var12_13 = var14_15 = f18763(var7);
                    SubLObject var8 = (SubLObject)module0283.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var14_15, var12_13, (SubLObject)module0283.$ic8$);
                    var8 = var14_15.first();
                    var14_15 = var14_15.rest();
                    if (module0283.NIL == var14_15) {
                        return f18767(var8);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var12_13, (SubLObject)module0283.$ic8$);
                }
                else {
                    if (module0283.NIL != f18756(var7)) {
                        return f18767(f18760(f18762(f18763(var7))));
                    }
                    if (module0283.NIL != f18757(var7)) {
                        return f18767(f18759(f18762(f18763(var7))));
                    }
                    return Errors.error((SubLObject)module0283.$ic9$, var4);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0283.$ic7$);
            }
            return (SubLObject)module0283.NIL;
        }
        if (module0283.NIL != f18756(var4)) {
            return f18759(Mapping.mapcar((SubLObject)module0283.$ic10$, f18763(var4)));
        }
        if (module0283.NIL != f18757(var4)) {
            return f18760(Mapping.mapcar((SubLObject)module0283.$ic10$, f18763(var4)));
        }
        return Errors.error((SubLObject)module0283.$ic9$, var4);
    }
    
    public static SubLObject f18768(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var4.isAtom()) {
            return var4;
        }
        if (module0283.NIL != f18758(var4)) {
            return var4;
        }
        if (module0283.NIL != f18756(var4)) {
            return f18759(Mapping.mapcar((SubLObject)module0283.$ic11$, f18763(var4)));
        }
        if (module0283.NIL == f18757(var4)) {
            return Errors.error((SubLObject)module0283.$ic9$, var4);
        }
        final SubLObject var6 = f18763(var4);
        final SubLObject var7 = f18764(module0283.$g2626$.getDynamicValue(var5), var6);
        if (module0283.NIL == var7) {
            return var4;
        }
        final SubLObject var8 = Sequences.delete(var7, var6, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        if (module0283.NIL != var8) {
            SubLObject var9 = (SubLObject)module0283.NIL;
            SubLObject var10 = var7.rest();
            SubLObject var11 = (SubLObject)module0283.NIL;
            var11 = var10.first();
            while (module0283.NIL != var10) {
                final SubLObject var12 = (SubLObject)ConsesLow.cons(var11, var8);
                var9 = (SubLObject)ConsesLow.cons(f18760(var12), var9);
                var10 = var10.rest();
                var11 = var10.first();
            }
            return f18759(Mapping.mapcar((SubLObject)module0283.$ic11$, var9));
        }
        return var7;
    }
    
    public static SubLObject f18770(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var4.isAtom()) {
            return var4;
        }
        if (module0283.NIL != f18758(var4)) {
            return var4;
        }
        if (module0283.NIL != f18757(var4)) {
            return f18760(Mapping.mapcar((SubLObject)module0283.$ic12$, f18763(var4)));
        }
        if (module0283.NIL == f18756(var4)) {
            return Errors.error((SubLObject)module0283.$ic9$, var4);
        }
        final SubLObject var6 = f18763(var4);
        final SubLObject var7 = f18764(module0283.$g2627$.getDynamicValue(var5), var6);
        if (module0283.NIL == var7) {
            return var4;
        }
        final SubLObject var8 = Sequences.delete(var7, var6, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        if (module0283.NIL != var8) {
            SubLObject var9 = (SubLObject)module0283.NIL;
            SubLObject var10 = var7.rest();
            SubLObject var11 = (SubLObject)module0283.NIL;
            var11 = var10.first();
            while (module0283.NIL != var10) {
                final SubLObject var12 = (SubLObject)ConsesLow.cons(var11, var8);
                var9 = (SubLObject)ConsesLow.cons(f18759(var12), var9);
                var10 = var10.rest();
                var11 = var10.first();
            }
            return f18760(Mapping.mapcar((SubLObject)module0283.$ic12$, var9));
        }
        return var7;
    }
    
    public static SubLObject f18771(final SubLObject var4) {
        if (var4.isAtom()) {
            return var4;
        }
        if (module0283.NIL != f18756(var4)) {
            return f18772(var4);
        }
        if (module0283.NIL != f18757(var4)) {
            return f18773(var4);
        }
        if (module0283.NIL != f18758(var4)) {
            return f18774(var4);
        }
        return Errors.error((SubLObject)module0283.$ic9$, var4);
    }
    
    public static SubLObject f18772(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0283.NIL;
        SubLObject var7 = (SubLObject)module0283.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var4, (SubLObject)module0283.$ic13$);
        var6 = var4.first();
        final SubLObject var8 = var7 = var4.rest();
        var7 = Mapping.mapcar((SubLObject)module0283.$ic14$, var7);
        SubLObject var9 = (SubLObject)module0283.NIL;
        SubLObject var10 = var7;
        SubLObject var11 = (SubLObject)module0283.NIL;
        var11 = var10.first();
        while (module0283.NIL != var10) {
            if (var11.isCons()) {
                SubLObject var31_32;
                final SubLObject var29_30 = var31_32 = var11;
                SubLObject var12 = (SubLObject)module0283.NIL;
                SubLObject var13 = (SubLObject)module0283.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31_32, var29_30, (SubLObject)module0283.$ic15$);
                var12 = var31_32.first();
                var31_32 = (var13 = var31_32.rest());
                if (module0283.$g2626$.getDynamicValue(var5).eql(var12)) {
                    SubLObject var20_35 = var13;
                    SubLObject var14 = (SubLObject)module0283.NIL;
                    var14 = var20_35.first();
                    while (module0283.NIL != var20_35) {
                        var9 = (SubLObject)ConsesLow.cons(var14, var9);
                        var20_35 = var20_35.rest();
                        var14 = var20_35.first();
                    }
                }
                else {
                    var9 = (SubLObject)ConsesLow.cons(var11, var9);
                }
            }
            else {
                var9 = (SubLObject)ConsesLow.cons(var11, var9);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        var7 = Sequences.nreverse(var9);
        var7 = Sequences.delete_duplicates(var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        var7 = Sequences.delete(module0283.$g2629$.getDynamicValue(var5), var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        if (module0283.NIL == var7) {
            return module0283.$g2629$.getDynamicValue(var5);
        }
        if (module0283.NIL != module0035.f1997(var7)) {
            SubLObject var38_39;
            final SubLObject var36_37 = var38_39 = var7;
            var11 = (SubLObject)module0283.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var38_39, var36_37, (SubLObject)module0283.$ic7$);
            var11 = var38_39.first();
            var38_39 = var38_39.rest();
            if (module0283.NIL == var38_39) {
                return var11;
            }
            cdestructuring_bind.cdestructuring_bind_error(var36_37, (SubLObject)module0283.$ic7$);
            return (SubLObject)module0283.NIL;
        }
        else {
            if (module0283.NIL != module0004.f104(module0283.$g2630$.getDynamicValue(var5), var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED)) {
                return module0283.$g2630$.getDynamicValue(var5);
            }
            if (module0283.NIL != f18775(var7)) {
                return module0283.$g2630$.getDynamicValue(var5);
            }
            return f18759(var7);
        }
    }
    
    public static SubLObject f18773(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0283.NIL;
        SubLObject var7 = (SubLObject)module0283.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var4, (SubLObject)module0283.$ic13$);
        var6 = var4.first();
        final SubLObject var8 = var7 = var4.rest();
        var7 = Mapping.mapcar((SubLObject)module0283.$ic14$, var7);
        SubLObject var9 = (SubLObject)module0283.NIL;
        SubLObject var10 = var7;
        SubLObject var11 = (SubLObject)module0283.NIL;
        var11 = var10.first();
        while (module0283.NIL != var10) {
            if (var11.isCons()) {
                SubLObject var44_45;
                final SubLObject var42_43 = var44_45 = var11;
                SubLObject var12 = (SubLObject)module0283.NIL;
                SubLObject var13 = (SubLObject)module0283.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var44_45, var42_43, (SubLObject)module0283.$ic15$);
                var12 = var44_45.first();
                var44_45 = (var13 = var44_45.rest());
                if (module0283.$g2627$.getDynamicValue(var5).eql(var12)) {
                    SubLObject var20_46 = var13;
                    SubLObject var14 = (SubLObject)module0283.NIL;
                    var14 = var20_46.first();
                    while (module0283.NIL != var20_46) {
                        var9 = (SubLObject)ConsesLow.cons(var14, var9);
                        var20_46 = var20_46.rest();
                        var14 = var20_46.first();
                    }
                }
                else {
                    var9 = (SubLObject)ConsesLow.cons(var11, var9);
                }
            }
            else {
                var9 = (SubLObject)ConsesLow.cons(var11, var9);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        var7 = Sequences.nreverse(var9);
        var7 = Sequences.delete_duplicates(var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        var7 = Sequences.delete(module0283.$g2630$.getDynamicValue(var5), var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED, (SubLObject)module0283.UNPROVIDED);
        if (module0283.NIL == var7) {
            return module0283.$g2630$.getDynamicValue(var5);
        }
        if (module0283.NIL != module0035.f1997(var7)) {
            return var7.first();
        }
        if (module0283.NIL != module0004.f104(module0283.$g2629$.getDynamicValue(var5), var7, Symbols.symbol_function((SubLObject)module0283.EQUAL), (SubLObject)module0283.UNPROVIDED)) {
            return module0283.$g2629$.getDynamicValue(var5);
        }
        if (module0283.NIL != f18775(var7)) {
            return module0283.$g2629$.getDynamicValue(var5);
        }
        return f18760(var7);
    }
    
    public static SubLObject f18774(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0283.NIL;
        SubLObject var7 = (SubLObject)module0283.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var4, (SubLObject)module0283.$ic16$);
        var6 = var4.first();
        SubLObject var8 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var4, (SubLObject)module0283.$ic16$);
        var7 = var8.first();
        var8 = var8.rest();
        if (module0283.NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0283.$ic16$);
            return (SubLObject)module0283.NIL;
        }
        var7 = f18771(var7);
        if (var7.equal(module0283.$g2629$.getDynamicValue(var5))) {
            return module0283.$g2630$.getDynamicValue(var5);
        }
        if (var7.equal(module0283.$g2630$.getDynamicValue(var5))) {
            return module0283.$g2629$.getDynamicValue(var5);
        }
        if (var7.isCons() && module0283.$g2628$.getDynamicValue(var5).eql(var7.first())) {
            return conses_high.second(var7);
        }
        return f18761(var7);
    }
    
    public static SubLObject f18775(final SubLObject var7) {
        if (module0283.NIL == var7) {
            return (SubLObject)module0283.NIL;
        }
        SubLObject var8 = (SubLObject)module0283.NIL;
        SubLObject var9 = (SubLObject)module0283.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var7, (SubLObject)module0283.$ic17$);
        var8 = var7.first();
        final SubLObject var10 = var9 = var7.rest();
        if (module0283.NIL != f18775(var9)) {
            return (SubLObject)module0283.T;
        }
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0283.NIL;
        var12 = var11.first();
        while (module0283.NIL != var11) {
            if (module0283.NIL != f18776(var8, var12)) {
                return (SubLObject)module0283.T;
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)module0283.NIL;
    }
    
    public static SubLObject f18776(final SubLObject var54, final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        if (var54.isCons() && module0283.$g2628$.getDynamicValue(var56).eql(var54.first())) {
            return Equality.equal(conses_high.second(var54), var55);
        }
        if (var55.isCons() && module0283.$g2628$.getDynamicValue(var56).eql(var55.first())) {
            return Equality.equal(var54, conses_high.second(var55));
        }
        return (SubLObject)module0283.NIL;
    }
    
    public static SubLObject f18777() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18756", "S#21336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18757", "S#21337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18758", "S#21338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18759", "S#21339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18760", "S#21340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18761", "S#21341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18762", "S#21342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18763", "S#21343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18764", "S#21344", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18765", "S#21345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18766", "S#21346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18769", "S#21347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18767", "S#21348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18768", "S#21349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18770", "S#21350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18771", "S#21351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18772", "S#21352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18773", "S#21353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18774", "S#21354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18775", "S#21355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0283", "f18776", "S#21356", 2, 0, false);
        return (SubLObject)module0283.NIL;
    }
    
    public static SubLObject f18778() {
        module0283.$g2626$ = SubLFiles.defparameter("S#21357", module0283.$ic0$);
        module0283.$g2627$ = SubLFiles.defparameter("S#21358", module0283.$ic1$);
        module0283.$g2628$ = SubLFiles.defparameter("S#21359", module0283.$ic2$);
        module0283.$g2629$ = SubLFiles.defparameter("S#21360", module0283.$ic3$);
        module0283.$g2630$ = SubLFiles.defparameter("S#21361", module0283.$ic4$);
        return (SubLObject)module0283.NIL;
    }
    
    public static SubLObject f18779() {
        return (SubLObject)module0283.NIL;
    }
    
    public void declareFunctions() {
        f18777();
    }
    
    public void initializeVariables() {
        f18778();
    }
    
    public void runTopLevelForms() {
        f18779();
    }
    
    static {
        me = (SubLFile)new module0283();
        module0283.$g2626$ = null;
        module0283.$g2627$ = null;
        module0283.$g2628$ = null;
        module0283.$g2629$ = null;
        module0283.$g2630$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#21341", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#21345", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21362", "CYC"));
        $ic9$ = SubLObjectFactory.makeString("Can't handle ~S");
        $ic10$ = SubLObjectFactory.makeSymbol("S#21348", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#21349", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#21350", "CYC");
        $ic13$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#21351", "CYC");
        $ic15$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#21363", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21364", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"));
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#21365", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21366", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0283.class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/