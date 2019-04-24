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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class module0064 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0064";
    public static final String myFingerPrint = "8bdcf061171a1d02bf9d01396f9e31fbe5211b35ebb68b60bd482bdee12e4d2d";
    public static SubLSymbol $g1076$;
    public static SubLSymbol $g1077$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
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
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLList $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    
    public static SubLObject f4659(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0064.ZERO_INTEGER);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4660(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6219_native.class) ? module0064.T : module0064.NIL);
    }
    
    public static SubLObject f4661(final SubLObject var1) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4662(final SubLObject var1) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4663(final SubLObject var1) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4664(final SubLObject var1) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4665(final SubLObject var1) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4666(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4667(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4668(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4669(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4670(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4660(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4671(SubLObject var5) {
        if (var5 == module0064.UNPROVIDED) {
            var5 = (SubLObject)module0064.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6219_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0064.NIL, var7 = var5; module0064.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0064.$ic20$)) {
                f4666(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic21$)) {
                f4667(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic22$)) {
                f4668(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic23$)) {
                f4669(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic24$)) {
                f4670(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0064.$ic25$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4672(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic26$, (SubLObject)module0064.$ic27$, (SubLObject)module0064.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic20$, f4661(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic21$, f4662(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic22$, f4663(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic23$, f4664(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic24$, f4665(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic29$, (SubLObject)module0064.$ic27$, (SubLObject)module0064.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4673(final SubLObject var11, final SubLObject var12) {
        return f4672(var11, var12);
    }
    
    public static SubLObject f4674(final SubLObject var1, final SubLObject var2) {
        f4675(var1, var2, (SubLObject)module0064.ZERO_INTEGER);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4676(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6221_native.class) ? module0064.T : module0064.NIL);
    }
    
    public static SubLObject f4677(final SubLObject var1) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4678(final SubLObject var1) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4679(final SubLObject var1) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4680(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4681(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4682(final SubLObject var1, final SubLObject var4) {
        assert module0064.NIL != f4676(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4683(SubLObject var5) {
        if (var5 == module0064.UNPROVIDED) {
            var5 = (SubLObject)module0064.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6221_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0064.NIL, var7 = var5; module0064.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0064.$ic46$)) {
                f4680(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic47$)) {
                f4681(var6, var9);
            }
            else if (var10.eql((SubLObject)module0064.$ic48$)) {
                f4682(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0064.$ic25$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4684(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic26$, (SubLObject)module0064.$ic49$, (SubLObject)module0064.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic46$, f4677(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic47$, f4678(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic28$, (SubLObject)module0064.$ic48$, f4679(var11));
        Functions.funcall(var12, var11, (SubLObject)module0064.$ic29$, (SubLObject)module0064.$ic49$, (SubLObject)module0064.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4685(final SubLObject var11, final SubLObject var12) {
        return f4684(var11, var12);
    }
    
    public static SubLObject f4686(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        return (SubLObject)SubLObjectFactory.makeBoolean(var17.isVector() || !var17.first().isNumber());
    }
    
    public static SubLObject f4675(final SubLObject var16, final SubLObject var2, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0064.NIL != print_high.$print_readably$.getDynamicValue(var19)) {
            print_high.print_not_readable(var16, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0064.$ic51$, var2, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var16), new SubLObject[] { module0064.$ic52$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.format(var2, (SubLObject)module0064.$ic53$, f4687(var16));
            if (module0064.NIL == f4686(var16)) {
                streams_high.write_string((SubLObject)module0064.$ic54$, var2, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var16), new SubLObject[] { module0064.$ic52$, var2, module0064.$ic55$, module0064.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var16;
    }
    
    public static SubLObject f4688(final SubLObject var23, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = f4683((SubLObject)module0064.UNPROVIDED);
        f4680(var26, var24);
        if (module0064.NIL != var23) {
            SubLObject var27 = (SubLObject)module0064.NIL;
            final SubLObject var28 = Storage.$current_area$.currentBinding(var25);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var25);
                var27 = Vectors.make_vector(var23, (SubLObject)module0064.UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(var28, var25);
            }
            f4681(var26, (SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, var27));
        }
        else {
            f4681(var26, (SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, (SubLObject)module0064.NIL));
        }
        return var26;
    }
    
    public static SubLObject f4689(final SubLObject var27, final SubLObject var16) {
        if (module0064.NIL != f4686(var16)) {
            f4690(var27, var16);
        }
        else {
            final SubLObject var28 = f4678(var16);
            final SubLObject var29 = var28.rest();
            final SubLObject var30 = var28.first();
            if (var29.isVector()) {
                if (var30.numGE(Sequences.length(var29))) {
                    Errors.warn((SubLObject)module0064.$ic56$, var16);
                    f4691(var16);
                    f4690(var27, var16);
                }
                else {
                    Vectors.set_aref(var29, var30, var27);
                    ConsesLow.rplaca(var28, Numbers.add(var28.first(), (SubLObject)module0064.ONE_INTEGER));
                }
            }
            else {
                ConsesLow.rplacd(var28, (SubLObject)ConsesLow.cons(var27, var28.rest()));
                ConsesLow.rplaca(var28, Numbers.add(var28.first(), (SubLObject)module0064.ONE_INTEGER));
            }
        }
        return var27;
    }
    
    public static SubLObject f4691(final SubLObject var16) {
        if (module0064.NIL != f4686(var16)) {
            Errors.warn((SubLObject)module0064.$ic57$, var16);
        }
        else {
            SubLObject var17 = f4678(var16);
            final SubLObject var18 = var17.first();
            final SubLObject var19 = f4677(var16);
            SubLObject var20 = var17.rest();
            SubLObject var21 = (SubLObject)module0064.NIL;
            if (var20.isVector()) {
                if (var18.numL(Sequences.length(var20))) {
                    Errors.warn((SubLObject)module0064.$ic58$, var16, Sequences.length(var20));
                    var21 = Vectors.make_vector(var18, (SubLObject)module0064.UNPROVIDED);
                    SubLObject var22;
                    for (var22 = (SubLObject)module0064.NIL, var22 = (SubLObject)module0064.ZERO_INTEGER; var22.numL(var18); var22 = Numbers.add(var22, (SubLObject)module0064.ONE_INTEGER)) {
                        Vectors.set_aref(var21, var22, Vectors.aref(var20, var22));
                    }
                }
                else {
                    var21 = var20;
                }
            }
            else {
                var21 = Vectors.make_vector(var17.first(), (SubLObject)module0064.UNPROVIDED);
                SubLObject var23;
                SubLObject var24;
                for (var23 = (SubLObject)module0064.NIL, var24 = (SubLObject)module0064.NIL, var23 = var20, var24 = (SubLObject)module0064.ZERO_INTEGER; module0064.NIL != var23; var23 = var23.rest(), var24 = Numbers.add(var24, (SubLObject)module0064.ONE_INTEGER)) {
                    Vectors.set_aref(var21, var24, var23.first());
                }
            }
            Sort.sort(var21, f4663(var19), f4661(var19));
            f4681(var16, var21);
            var17 = (SubLObject)module0064.NIL;
            var20 = (SubLObject)module0064.NIL;
            var21 = (SubLObject)module0064.NIL;
        }
        return var16;
    }
    
    public static SubLObject f4692(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        if (module0064.NIL == f4686(var16)) {
            return var17.first();
        }
        if (var17.isVector()) {
            return module0035.count_if_not(Symbols.symbol_function((SubLObject)module0064.$ic59$), var17, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED);
        }
        SubLObject var18 = (SubLObject)module0064.ZERO_INTEGER;
        var18 = Numbers.add(var18, conses_high.caar(var17));
        SubLObject var19 = var17.rest();
        SubLObject var20 = (SubLObject)module0064.NIL;
        var20 = var19.first();
        while (module0064.NIL != var19) {
            var18 = Numbers.add(var18, module0035.count_if_not(Symbols.symbol_function((SubLObject)module0064.$ic59$), var20, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED));
            var19 = var19.rest();
            var20 = var19.first();
        }
        return var18;
    }
    
    public static SubLObject f4687(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        if (module0064.NIL == f4686(var16)) {
            return var17.first();
        }
        if (var17.isVector()) {
            return Sequences.length(var17);
        }
        SubLObject var18 = (SubLObject)module0064.ZERO_INTEGER;
        var18 = Numbers.add(var18, conses_high.caar(var17));
        SubLObject var19 = var17.rest();
        SubLObject var20 = (SubLObject)module0064.NIL;
        var20 = var19.first();
        while (module0064.NIL != var19) {
            var18 = Numbers.add(var18, Sequences.length(var20));
            var19 = var19.rest();
            var20 = var19.first();
        }
        return var18;
    }
    
    public static SubLObject f4693(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        if (module0064.NIL == f4686(var16)) {
            return var17.first();
        }
        if (var17.isVector()) {
            return Sequences.length(var17);
        }
        return Sequences.length(conses_high.last(var17, (SubLObject)module0064.UNPROVIDED).first());
    }
    
    public static SubLObject f4694(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        if (module0064.NIL == f4686(var16)) {
            return (SubLObject)module0064.ZERO_INTEGER;
        }
        if (var17.isVector()) {
            return (SubLObject)module0064.ZERO_INTEGER;
        }
        SubLObject var18 = (SubLObject)module0064.ZERO_INTEGER;
        SubLObject var19;
        for (var19 = (SubLObject)module0064.NIL, var19 = var17.rest(); module0064.NIL != var19.rest(); var19 = var19.rest()) {
            var18 = Numbers.add(var18, Sequences.length(var19.first()));
        }
        return var18;
    }
    
    public static SubLObject f4695(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        if (module0064.NIL == f4686(var16)) {
            return (SubLObject)module0064.ZERO_INTEGER;
        }
        if (var17.isVector()) {
            return (SubLObject)module0064.ZERO_INTEGER;
        }
        return conses_high.caar(var17);
    }
    
    public static SubLObject f4696(final SubLObject var16) {
        if (module0064.NIL == f4686(var16)) {
            Errors.cerror((SubLObject)module0064.$ic60$, (SubLObject)module0064.$ic61$, var16);
            f4691(var16);
        }
        final SubLObject var17 = Vectors.make_vector(f4692(var16), (SubLObject)module0064.UNPROVIDED);
        final SubLObject var18 = f4678(var16);
        SubLObject var19 = (SubLObject)module0064.ZERO_INTEGER;
        if (var18.isVector()) {
            SubLObject var20;
            SubLObject var21;
            SubLObject var22;
            for (var20 = Sequences.length(var18), var21 = (SubLObject)module0064.NIL, var21 = (SubLObject)module0064.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0064.ONE_INTEGER)) {
                var22 = Vectors.aref(var18, var21);
                if (module0064.NIL != var22) {
                    Vectors.set_aref(var17, var19, var22);
                    var19 = Numbers.add(var19, (SubLObject)module0064.ONE_INTEGER);
                }
            }
        }
        else {
            SubLObject var23 = conses_high.cdar(var18);
            SubLObject var24 = (SubLObject)module0064.NIL;
            var24 = var23.first();
            while (module0064.NIL != var23) {
                Vectors.set_aref(var17, var19, var24);
                var19 = Numbers.add(var19, (SubLObject)module0064.ONE_INTEGER);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var23 = var18.rest();
            SubLObject var25 = (SubLObject)module0064.NIL;
            var25 = var23.first();
            while (module0064.NIL != var23) {
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                for (var26 = Sequences.length(var25), var27 = (SubLObject)module0064.NIL, var27 = (SubLObject)module0064.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0064.ONE_INTEGER)) {
                    var28 = Vectors.aref(var25, var27);
                    if (module0064.NIL != var28) {
                        Vectors.set_aref(var17, var19, var28);
                        var19 = Numbers.add(var19, (SubLObject)module0064.ONE_INTEGER);
                    }
                }
                var23 = var23.rest();
                var25 = var23.first();
            }
        }
        final SubLObject var29 = f4677(var16);
        Sort.sort(var17, f4663(var29), f4661(var29));
        f4681(var16, var17);
        return var16;
    }
    
    public static SubLObject f4697(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        final SubLObject var18 = Vectors.make_vector(conses_high.caar(var17), (SubLObject)module0064.UNPROVIDED);
        SubLObject var19 = (SubLObject)module0064.ZERO_INTEGER;
        SubLObject var20 = conses_high.cdar(var17);
        SubLObject var21 = (SubLObject)module0064.NIL;
        var21 = var20.first();
        while (module0064.NIL != var20) {
            Vectors.set_aref(var18, var19, var21);
            var19 = Numbers.add(var19, (SubLObject)module0064.ONE_INTEGER);
            var20 = var20.rest();
            var21 = var20.first();
        }
        final SubLObject var22 = f4677(var16);
        Sort.sort(var18, f4663(var22), f4661(var22));
        f4681(var16, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, (SubLObject)module0064.NIL), var18, var17.rest()));
        return var16;
    }
    
    public static SubLObject f4698(final SubLObject var37, final SubLObject var38) {
        SubLObject var40;
        final SubLObject var39 = var40 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic62$);
        final SubLObject var41 = var40.rest();
        var40 = var40.first();
        SubLObject var42 = (SubLObject)module0064.NIL;
        SubLObject var43 = (SubLObject)module0064.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic62$);
        var42 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic62$);
        var43 = var40.first();
        var40 = var40.rest();
        final SubLObject var44 = (SubLObject)(var40.isCons() ? var40.first() : module0064.$ic63$);
        cdestructuring_bind.destructuring_bind_must_listp(var40, var39, (SubLObject)module0064.$ic62$);
        var40 = var40.rest();
        if (module0064.NIL == var40) {
            final SubLObject var45;
            var40 = (var45 = var41);
            final SubLObject var46 = (SubLObject)module0064.$ic64$;
            final SubLObject var47 = (SubLObject)module0064.$ic65$;
            final SubLObject var48 = (SubLObject)module0064.$ic66$;
            final SubLObject var49 = (SubLObject)module0064.$ic67$;
            final SubLObject var50 = (SubLObject)module0064.$ic68$;
            return (SubLObject)ConsesLow.list((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var43), (SubLObject)ConsesLow.list(var47, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic42$, var46))), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic70$, (SubLObject)module0064.$ic71$, var44), (SubLObject)module0064.$ic72$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic70$, (SubLObject)module0064.$ic73$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic74$, var46)), (SubLObject)module0064.$ic75$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic76$, (SubLObject)module0064.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic78$, var46), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic79$, var47), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic80$, (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic81$, var47)), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic82$, var47, var48))), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic83$, var42, ConsesLow.append(var45, (SubLObject)module0064.NIL)), (SubLObject)module0064.$ic84$)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic85$, (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic86$, (SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic87$, var47)), ConsesLow.append(var45, (SubLObject)module0064.$ic84$)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic86$, (SubLObject)ConsesLow.list(var49, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic88$, var47)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic80$, (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic81$, var49)), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic82$, var49, var48))), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic83$, var42, ConsesLow.append(var45, (SubLObject)module0064.NIL)), (SubLObject)module0064.$ic84$))))), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic85$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var50, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic88$, var47))), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic79$, var50), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic80$, (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic89$, var47)), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic82$, var47, var48))), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic83$, var42, ConsesLow.append(var45, (SubLObject)module0064.NIL)), (SubLObject)module0064.$ic84$)), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic86$, (SubLObject)ConsesLow.list(var42, var50), ConsesLow.append(var45, (SubLObject)module0064.$ic84$))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0064.$ic62$);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4699(final SubLObject var46, final SubLObject var16, SubLObject var43) {
        if (var43 == module0064.UNPROVIDED) {
            var43 = (SubLObject)module0064.$ic63$;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = f4678(var16);
        module0012.$g82$.setDynamicValue(var43, var47);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var47);
        module0012.$g83$.setDynamicValue(f4687(var16), var47);
        module0012.$g84$.setDynamicValue((SubLObject)module0064.ZERO_INTEGER, var47);
        final SubLObject var49 = module0012.$g75$.currentBinding(var47);
        final SubLObject var50 = module0012.$g76$.currentBinding(var47);
        final SubLObject var51 = module0012.$g77$.currentBinding(var47);
        final SubLObject var52 = module0012.$g78$.currentBinding(var47);
        try {
            module0012.$g75$.bind((SubLObject)module0064.ZERO_INTEGER, var47);
            module0012.$g76$.bind((SubLObject)module0064.NIL, var47);
            module0012.$g77$.bind((SubLObject)module0064.T, var47);
            module0012.$g78$.bind(Time.get_universal_time(), var47);
            module0012.f478(module0012.$g82$.getDynamicValue(var47));
            if (module0064.NIL != f4686(var16)) {
                if (var48.isVector()) {
                    SubLObject var53;
                    SubLObject var54;
                    SubLObject var55;
                    for (var53 = Sequences.length(var48), var54 = (SubLObject)module0064.NIL, var54 = (SubLObject)module0064.ZERO_INTEGER; var54.numL(var53); var54 = Numbers.add(var54, (SubLObject)module0064.ONE_INTEGER)) {
                        var55 = Vectors.aref(var48, var54);
                        if (module0064.NIL != var55) {
                            Functions.funcall(var46, var55);
                        }
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var47), module0012.$g83$.getDynamicValue(var47));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var47), (SubLObject)module0064.ONE_INTEGER), var47);
                    }
                }
                else {
                    SubLObject var56 = conses_high.cdar(var48);
                    SubLObject var57 = (SubLObject)module0064.NIL;
                    var57 = var56.first();
                    while (module0064.NIL != var56) {
                        Functions.funcall(var46, var57);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var47), module0012.$g83$.getDynamicValue(var47));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var47), (SubLObject)module0064.ONE_INTEGER), var47);
                        var56 = var56.rest();
                        var57 = var56.first();
                    }
                    var56 = var48.rest();
                    SubLObject var58 = (SubLObject)module0064.NIL;
                    var58 = var56.first();
                    while (module0064.NIL != var56) {
                        SubLObject var59;
                        SubLObject var60;
                        SubLObject var61;
                        for (var59 = Sequences.length(var58), var60 = (SubLObject)module0064.NIL, var60 = (SubLObject)module0064.ZERO_INTEGER; var60.numL(var59); var60 = Numbers.add(var60, (SubLObject)module0064.ONE_INTEGER)) {
                            var61 = Vectors.aref(var58, var60);
                            if (module0064.NIL != var61) {
                                Functions.funcall(var46, var61);
                            }
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var47), module0012.$g83$.getDynamicValue(var47));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var47), (SubLObject)module0064.ONE_INTEGER), var47);
                        }
                        var56 = var56.rest();
                        var58 = var56.first();
                    }
                }
            }
            else {
                final SubLObject var62 = var48.rest();
                if (var62.isVector()) {
                    SubLObject var63;
                    SubLObject var64;
                    SubLObject var65;
                    for (var63 = var48.first(), var64 = (SubLObject)module0064.NIL, var64 = (SubLObject)module0064.ZERO_INTEGER; var64.numL(var63); var64 = Numbers.add(var64, (SubLObject)module0064.ONE_INTEGER)) {
                        var65 = Vectors.aref(var48, var64);
                        if (module0064.NIL != var65) {
                            Functions.funcall(var46, var65);
                        }
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var47), module0012.$g83$.getDynamicValue(var47));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var47), (SubLObject)module0064.ONE_INTEGER), var47);
                    }
                }
                else {
                    SubLObject var66 = var62;
                    SubLObject var55 = (SubLObject)module0064.NIL;
                    var55 = var66.first();
                    while (module0064.NIL != var66) {
                        Functions.funcall(var46, var55);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var47), module0012.$g83$.getDynamicValue(var47));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var47), (SubLObject)module0064.ONE_INTEGER), var47);
                        var66 = var66.rest();
                        var55 = var66.first();
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var52, var47);
            module0012.$g77$.rebind(var51, var47);
            module0012.$g76$.rebind(var50, var47);
            module0012.$g75$.rebind(var49, var47);
        }
        return var16;
    }
    
    public static SubLObject f4700(final SubLObject var37, final SubLObject var38) {
        SubLObject var40;
        final SubLObject var39 = var40 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic90$);
        final SubLObject var41 = var40.rest();
        var40 = var40.first();
        SubLObject var42 = (SubLObject)module0064.NIL;
        SubLObject var43 = (SubLObject)module0064.NIL;
        SubLObject var44 = (SubLObject)module0064.NIL;
        SubLObject var45 = (SubLObject)module0064.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic90$);
        var42 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic90$);
        var43 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic90$);
        var44 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0064.$ic90$);
        var45 = var40.first();
        var40 = var40.rest();
        if (module0064.NIL == var40) {
            final SubLObject var46;
            var40 = (var46 = var41);
            final SubLObject var47 = (SubLObject)module0064.$ic91$;
            final SubLObject var48 = (SubLObject)module0064.$ic92$;
            final SubLObject var49 = (SubLObject)module0064.$ic93$;
            final SubLObject var50 = (SubLObject)module0064.$ic94$;
            final SubLObject var51 = (SubLObject)module0064.$ic95$;
            final SubLObject var52 = (SubLObject)module0064.$ic96$;
            return (SubLObject)ConsesLow.list((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var47, var43), var42), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic97$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic78$, var47), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic98$, var47)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic97$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic42$, var47)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic99$, var47)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic42$, var47)), (SubLObject)ConsesLow.list(var52, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic81$, var48))), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic100$, (SubLObject)ConsesLow.list(var49, var50), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic101$, var44, var48, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic0$, var47)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic77$, var45, (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic102$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var51, var50, (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic103$, var51, (SubLObject)module0064.$ic104$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0064.$ic105$, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic106$, var51, var52))), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic107$, var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic82$, var48, var51)), ConsesLow.append(var46, (SubLObject)module0064.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic102$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var51, var49, (SubLObject)ConsesLow.listS((SubLObject)module0064.$ic108$, var51, (SubLObject)module0064.$ic104$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0064.$ic106$, var51, (SubLObject)module0064.$ic109$)), (SubLObject)ConsesLow.list((SubLObject)module0064.$ic107$, var42, (SubLObject)ConsesLow.list((SubLObject)module0064.$ic82$, var48, var51)), ConsesLow.append(var46, (SubLObject)module0064.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0064.$ic90$);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4701(final SubLObject var46, final SubLObject var16, final SubLObject var27, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0064.NIL;
        if (module0064.NIL == f4686(var16)) {
            f4691(var16);
        }
        if (!f4678(var16).isVector()) {
            f4696(var16);
        }
        final SubLObject var61 = f4678(var16);
        final SubLObject var62 = Sequences.length(var61);
        var59.resetMultipleValues();
        final SubLObject var63 = f4702(var27, var61, f4677(var16));
        final SubLObject var64 = var59.secondMultipleValue();
        var59.resetMultipleValues();
        if (module0064.NIL != var58) {
            SubLObject var65;
            for (var65 = (SubLObject)module0064.NIL, var65 = var64; var65.numL(var62); var65 = Numbers.add(var65, (SubLObject)module0064.ONE_INTEGER)) {
                var60 = Vectors.aref(var61, var65);
                Functions.funcall(var46, var60);
            }
        }
        else {
            SubLObject var65;
            for (var65 = (SubLObject)module0064.NIL, var65 = var63; !var65.numL((SubLObject)module0064.ZERO_INTEGER); var65 = Numbers.subtract(var65, (SubLObject)module0064.ONE_INTEGER)) {
                var60 = Vectors.aref(var61, var65);
                Functions.funcall(var46, var60);
            }
        }
        return var16;
    }
    
    public static SubLObject f4690(final SubLObject var27, final SubLObject var16) {
        if (module0064.NIL != var27) {
            if (module0064.NIL != f4686(var16)) {
                final SubLObject var28 = f4677(var16);
                SubLObject var29 = f4678(var16);
                if (!var29.isCons()) {
                    var29 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, (SubLObject)module0064.NIL), var29);
                    f4681(var16, var29);
                }
                ConsesLow.rplacd(var29.first(), (SubLObject)ConsesLow.cons(var27, conses_high.cdar(var29)));
                ConsesLow.rplaca(var29.first(), Numbers.add(conses_high.caar(var29), (SubLObject)module0064.ONE_INTEGER));
                final SubLObject var30 = f4665(var28);
                if (var30.isFunction()) {
                    if (module0064.NIL != Functions.funcall(var30, var16)) {
                        f4696(var16);
                        return var27;
                    }
                }
                else if (var30.isNumber() && f4687(var16).numGE(var30)) {
                    f4696(var16);
                    return var27;
                }
                final SubLObject var31 = f4664(var28);
                if (var31.isFunction()) {
                    if (module0064.NIL != Functions.funcall(var31, var16)) {
                        f4697(var16);
                        return var27;
                    }
                }
                else if (var31.isNumber() && conses_high.caar(var29).numGE(var31)) {
                    f4697(var16);
                    return var27;
                }
            }
            else {
                f4689(var27, var16);
            }
        }
        else {
            Errors.cerror((SubLObject)module0064.$ic110$, (SubLObject)module0064.$ic111$, var27, var16);
        }
        return var27;
    }
    
    public static SubLObject f4703(final SubLObject var27, final SubLObject var25, final SubLObject var24) {
        final SubLObject var28 = f4663(var24);
        final SubLObject var29 = f4662(var24);
        final SubLObject var30 = f4661(var24);
        return module0037.f2602(var27, var25, var28, var29, var30, Symbols.symbol_function((SubLObject)module0064.$ic59$));
    }
    
    public static SubLObject f4702(final SubLObject var27, final SubLObject var25, final SubLObject var24) {
        final SubLObject var28 = f4663(var24);
        final SubLObject var29 = f4662(var24);
        final SubLObject var30 = f4661(var24);
        return module0037.f2601(var27, var25, var28, var29, var30, Symbols.symbol_function((SubLObject)module0064.$ic59$));
    }
    
    public static SubLObject f4704(final SubLObject var27, final SubLObject var16) {
        final SubLObject var28 = f4678(var16);
        final SubLObject var29 = f4677(var16);
        if (module0064.NIL == f4686(var16)) {
            ConsesLow.rplacd(var28, Sequences.delete(var27, var28.rest(), f4662(var29), f4661(var29), (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED));
            ConsesLow.rplaca(var28, Sequences.length(var28.rest()));
            return var27;
        }
        if (!var28.isVector()) {
            SubLObject var30 = var28.rest();
            SubLObject var31 = (SubLObject)module0064.NIL;
            var31 = var30.first();
            while (module0064.NIL != var30) {
                final SubLObject var32 = f4703(var27, var31, var29);
                if (module0064.NIL != var32) {
                    Vectors.set_aref(var31, var32, (SubLObject)module0064.NIL);
                    return var27;
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
            final SubLObject var33 = var28.first();
            ConsesLow.rplacd(var33, Sequences.delete(var27, var33.rest(), f4662(var29), f4661(var29), (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED));
            ConsesLow.rplaca(var33, Sequences.length(var33.rest()));
            return var27;
        }
        final SubLObject var34 = f4703(var27, var28, var29);
        if (module0064.NIL != var34) {
            Vectors.set_aref(var28, var34, (SubLObject)module0064.NIL);
            return var27;
        }
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4705(final SubLObject var16) {
        if (module0064.NIL != f4686(var16)) {
            f4681(var16, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, (SubLObject)module0064.NIL), (SubLObject)module0064.NIL));
        }
        else {
            f4681(var16, (SubLObject)ConsesLow.cons((SubLObject)module0064.ZERO_INTEGER, (SubLObject)module0064.NIL));
        }
        return var16;
    }
    
    public static SubLObject f4706(final SubLObject var27, final SubLObject var16) {
        final SubLObject var28 = f4678(var16);
        final SubLObject var29 = f4677(var16);
        if (module0064.NIL == f4686(var16)) {
            return Sequences.find(var27, var28.rest(), f4662(var29), f4661(var29), (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED);
        }
        if (!var28.isVector()) {
            SubLObject var30 = var28.rest();
            SubLObject var31 = (SubLObject)module0064.NIL;
            var31 = var30.first();
            while (module0064.NIL != var30) {
                final SubLObject var32 = f4703(var27, var31, var29);
                if (module0064.NIL != var32) {
                    return Vectors.aref(var31, var32);
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
            return Sequences.find(var27, conses_high.cdar(var28), f4662(var29), f4661(var29), (SubLObject)module0064.UNPROVIDED, (SubLObject)module0064.UNPROVIDED);
        }
        final SubLObject var33 = f4703(var27, var28, var29);
        if (module0064.NIL != var33) {
            return Vectors.aref(var28, var33);
        }
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4707(final SubLObject var16) {
        return Numbers.numGE(f4695(var16), Numbers.integerDivide(f4693(var16), (SubLObject)module0064.TEN_INTEGER));
    }
    
    public static SubLObject f4708(final SubLObject var16) {
        return Numbers.numGE(f4694(var16), f4693(var16));
    }
    
    public static SubLObject f4709(final SubLObject var16) {
        assert module0064.NIL != f4676(var16) : var16;
        return module0052.f3689(f4710(var16), (SubLObject)module0064.$ic112$, (SubLObject)module0064.$ic113$, (SubLObject)module0064.UNPROVIDED);
    }
    
    public static SubLObject f4710(final SubLObject var16) {
        final SubLObject var17 = f4678(var16);
        SubLObject var18 = (SubLObject)module0064.NIL;
        if (var17.isVector()) {
            var18 = (SubLObject)ConsesLow.list(var17);
        }
        else if (module0064.NIL != f4686(var16)) {
            var18 = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)module0064.$ic114$), conses_high.cdar(var17)), conses_high.copy_list(var17.rest()));
        }
        else {
            var18 = (SubLObject)ConsesLow.list(Functions.apply(Symbols.symbol_function((SubLObject)module0064.$ic114$), var17));
        }
        final SubLObject var19 = f4711(var18.first());
        return (SubLObject)ConsesLow.list(var19, var18);
    }
    
    public static SubLObject f4711(final SubLObject var25) {
        assert module0064.NIL != Types.vectorp(var25) : var25;
        return module0052.f3781(module0052.f3726(var25), Symbols.symbol_function((SubLObject)module0064.$ic115$), (SubLObject)module0064.UNPROVIDED);
    }
    
    public static SubLObject f4712(final SubLObject var76) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0064.NIL != module0052.f3687(var76.first()) && module0064.NIL == conses_high.second(var76).rest());
    }
    
    public static SubLObject f4713(final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = var76.first();
        SubLObject var79 = conses_high.second(var76);
        while (true) {
            var77.resetMultipleValues();
            final SubLObject var80 = module0052.f3693(var78);
            final SubLObject var81 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            if (module0064.NIL != var81) {
                return Values.values(var80, var76, (SubLObject)module0064.NIL);
            }
            if (module0064.NIL == var79.rest()) {
                return Values.values((SubLObject)module0064.NIL, var76, (SubLObject)module0064.T);
            }
            var79 = var79.rest();
            ConsesLow.set_nth((SubLObject)module0064.ONE_INTEGER, var76, var79);
            var78 = f4711(var79.first());
            ConsesLow.set_nth((SubLObject)module0064.ZERO_INTEGER, var76, var78);
        }
    }
    
    public static SubLObject f4714() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4659", "S#6223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4660", "S#6220", 1, 0, false);
        new $f4660$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4661", "S#6224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4662", "S#6225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4663", "S#6226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4664", "S#6227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4665", "S#6228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4666", "S#6229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4667", "S#6230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4668", "S#6231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4669", "S#6232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4670", "S#6233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4671", "S#6234", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4672", "S#6235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4673", "S#6236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4674", "S#6237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4676", "S#6222", 1, 0, false);
        new $f4676$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4677", "S#6219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4678", "S#6238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4679", "S#6239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4680", "S#6240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4681", "S#6241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4682", "S#6242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4683", "S#6243", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4684", "S#6244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4685", "S#6245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4686", "S#6246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4675", "S#6247", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4688", "S#6248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4689", "S#6249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4691", "S#6250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4692", "S#6251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4687", "S#6252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4693", "S#6253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4694", "S#6254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4695", "S#6255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4696", "S#6256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4697", "S#6257", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0064", "f4698", "S#6258");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4699", "S#6259", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0064", "f4700", "S#6260");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4701", "S#6261", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4690", "S#6262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4703", "S#6263", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4702", "S#6264", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4704", "S#6265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4705", "S#6266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4706", "S#6267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4707", "S#6268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4708", "S#6269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4709", "S#6270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4710", "S#6271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4711", "S#6272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4712", "S#6273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0064", "f4713", "S#6274", 1, 0, false);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4715() {
        module0064.$g1076$ = SubLFiles.defconstant("S#6275", (SubLObject)module0064.$ic0$);
        module0064.$g1077$ = SubLFiles.defconstant("S#6276", (SubLObject)module0064.$ic31$);
        return (SubLObject)module0064.NIL;
    }
    
    public static SubLObject f4716() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0064.$g1076$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0064.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0064.$ic9$);
        Structures.def_csetf((SubLObject)module0064.$ic10$, (SubLObject)module0064.$ic11$);
        Structures.def_csetf((SubLObject)module0064.$ic12$, (SubLObject)module0064.$ic13$);
        Structures.def_csetf((SubLObject)module0064.$ic14$, (SubLObject)module0064.$ic15$);
        Structures.def_csetf((SubLObject)module0064.$ic16$, (SubLObject)module0064.$ic17$);
        Structures.def_csetf((SubLObject)module0064.$ic18$, (SubLObject)module0064.$ic19$);
        Equality.identity((SubLObject)module0064.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0064.$g1076$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0064.$ic30$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0064.$g1077$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0064.$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0064.$ic40$);
        Structures.def_csetf((SubLObject)module0064.$ic0$, (SubLObject)module0064.$ic41$);
        Structures.def_csetf((SubLObject)module0064.$ic42$, (SubLObject)module0064.$ic43$);
        Structures.def_csetf((SubLObject)module0064.$ic44$, (SubLObject)module0064.$ic45$);
        Equality.identity((SubLObject)module0064.$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0064.$g1077$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0064.$ic50$));
        return (SubLObject)module0064.NIL;
    }
    
    public void declareFunctions() {
        f4714();
    }
    
    public void initializeVariables() {
        f4715();
    }
    
    public void runTopLevelForms() {
        f4716();
    }
    
    static {
        me = (SubLFile)new module0064();
        module0064.$g1076$ = null;
        module0064.$g1077$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#6219", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6220", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(134);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6277", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6278", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6279", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("COMPARE"), (SubLObject)SubLObjectFactory.makeKeyword("MINOR-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("MAJOR-LIMIT"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6224", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6225", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6226", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6227", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6228", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6229", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6230", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6231", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6233", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = SubLObjectFactory.makeSymbol("S#6223", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#6220", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#6224", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#6229", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#6225", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#6230", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#6226", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6231", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#6227", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#6232", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6228", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#6233", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("KEY");
        $ic21$ = SubLObjectFactory.makeKeyword("TEST");
        $ic22$ = SubLObjectFactory.makeKeyword("COMPARE");
        $ic23$ = SubLObjectFactory.makeKeyword("MINOR-LIMIT");
        $ic24$ = SubLObjectFactory.makeKeyword("MAJOR-LIMIT");
        $ic25$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic26$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic27$ = SubLObjectFactory.makeSymbol("S#6234", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic29$ = SubLObjectFactory.makeKeyword("END");
        $ic30$ = SubLObjectFactory.makeSymbol("S#6236", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#6221", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#6222", "CYC");
        $ic33$ = SubLObjectFactory.makeInteger(135);
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6280", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5858", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFO"), (SubLObject)SubLObjectFactory.makeKeyword("PAYLOAD"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6219", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6239", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6240", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6241", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6242", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#6247", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#6237", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#6222", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#6240", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#6238", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#6241", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#6239", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#6242", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("INFO");
        $ic47$ = SubLObjectFactory.makeKeyword("PAYLOAD");
        $ic48$ = SubLObjectFactory.makeKeyword("SIZE");
        $ic49$ = SubLObjectFactory.makeSymbol("S#6243", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#6245", "CYC");
        $ic51$ = SubLObjectFactory.makeString("#<");
        $ic52$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic53$ = SubLObjectFactory.makeString("~D items");
        $ic54$ = SubLObjectFactory.makeString(" (unfinalized)");
        $ic55$ = SubLObjectFactory.makeKeyword("BASE");
        $ic56$ = SubLObjectFactory.makeString("Finalizing ~S before its time.");
        $ic57$ = SubLObjectFactory.makeString("~S has already been finalized.");
        $ic58$ = SubLObjectFactory.makeString("Shelf ~S being finalized with less than expected ~D items.");
        $ic59$ = SubLObjectFactory.makeSymbol("NULL");
        $ic60$ = SubLObjectFactory.makeString("Finalize it.");
        $ic61$ = SubLObjectFactory.makeString("~S has not been finalized.");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6221", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("do-shelf"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic63$ = SubLObjectFactory.makeString("do-shelf");
        $ic64$ = SubLObjectFactory.makeUninternedSymbol("US#1E1F90E");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#396E758");
        $ic66$ = SubLObjectFactory.makeUninternedSymbol("US#24883");
        $ic67$ = SubLObjectFactory.makeUninternedSymbol("US#7021747");
        $ic68$ = SubLObjectFactory.makeUninternedSymbol("US#10620D7");
        $ic69$ = SubLObjectFactory.makeSymbol("CLET");
        $ic70$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic71$ = SubLObjectFactory.makeSymbol("S#638", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#639", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")));
        $ic73$ = SubLObjectFactory.makeSymbol("S#640", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#6252", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#641", "CYC"), (SubLObject)module0064.ZERO_INTEGER);
        $ic76$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic77$ = SubLObjectFactory.makeSymbol("PIF");
        $ic78$ = SubLObjectFactory.makeSymbol("S#6246", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic80$ = SubLObjectFactory.makeSymbol("CDOTIMES");
        $ic81$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic82$ = SubLObjectFactory.makeSymbol("AREF");
        $ic83$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#641", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#640", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("S#641", "CYC")));
        $ic85$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic86$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic87$ = SubLObjectFactory.makeSymbol("CDAR");
        $ic88$ = SubLObjectFactory.makeSymbol("CDR");
        $ic89$ = SubLObjectFactory.makeSymbol("CAR");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6221", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6281", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#1E1F90E");
        $ic92$ = SubLObjectFactory.makeUninternedSymbol("US#7021747");
        $ic93$ = SubLObjectFactory.makeUninternedSymbol("US#73E6096");
        $ic94$ = SubLObjectFactory.makeUninternedSymbol("US#72640DA");
        $ic95$ = SubLObjectFactory.makeUninternedSymbol("US#24883");
        $ic96$ = SubLObjectFactory.makeUninternedSymbol("US#5044AD7");
        $ic97$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic98$ = SubLObjectFactory.makeSymbol("S#6250", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#6256", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic101$ = SubLObjectFactory.makeSymbol("S#6264", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("CDO");
        $ic103$ = SubLObjectFactory.makeSymbol("+");
        $ic104$ = ConsesLow.list((SubLObject)module0064.ONE_INTEGER);
        $ic105$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic106$ = SubLObjectFactory.makeSymbol("<");
        $ic107$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic108$ = SubLObjectFactory.makeSymbol("-");
        $ic109$ = ConsesLow.list((SubLObject)module0064.ZERO_INTEGER);
        $ic110$ = SubLObjectFactory.makeString("Ignore the addition.");
        $ic111$ = SubLObjectFactory.makeString("Attempt to add ~S to ~S.");
        $ic112$ = SubLObjectFactory.makeSymbol("S#6273", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#6274", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("VECTOR");
        $ic115$ = SubLObjectFactory.makeSymbol("BOOLEAN");
    }
    
    public static final class $sX6219_native extends SubLStructNative
    {
        public SubLObject $key;
        public SubLObject $test;
        public SubLObject $compare;
        public SubLObject $minor_limit;
        public SubLObject $major_limit;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6219_native() {
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$compare = (SubLObject)CommonSymbols.NIL;
            this.$minor_limit = (SubLObject)CommonSymbols.NIL;
            this.$major_limit = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6219_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$key;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject getField4() {
            return this.$compare;
        }
        
        public SubLObject getField5() {
            return this.$minor_limit;
        }
        
        public SubLObject getField6() {
            return this.$major_limit;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$key = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$compare = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$minor_limit = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$major_limit = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6219_native.class, module0064.$ic0$, module0064.$ic1$, module0064.$ic3$, module0064.$ic4$, new String[] { "$key", "$test", "$compare", "$minor_limit", "$major_limit" }, module0064.$ic5$, module0064.$ic6$, module0064.$ic7$);
        }
    }
    
    public static final class $f4660$UnaryFunction extends UnaryFunction
    {
        public $f4660$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6220"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0064.f4660(var3);
        }
    }
    
    public static final class $sX6221_native extends SubLStructNative
    {
        public SubLObject $info;
        public SubLObject $payload;
        public SubLObject $size;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6221_native() {
            this.$info = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
            this.$size = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6221_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$info;
        }
        
        public SubLObject getField3() {
            return this.$payload;
        }
        
        public SubLObject getField4() {
            return this.$size;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$info = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$payload = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$size = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6221_native.class, module0064.$ic31$, module0064.$ic32$, module0064.$ic34$, module0064.$ic35$, new String[] { "$info", "$payload", "$size" }, module0064.$ic36$, module0064.$ic37$, module0064.$ic38$);
        }
    }
    
    public static final class $f4676$UnaryFunction extends UnaryFunction
    {
        public $f4676$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6222"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0064.f4676(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0064.class
	Total time: 322 ms
	
	Decompiled with Procyon 0.5.32.
*/