package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0214 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0214";
    public static final String myFingerPrint = "85364285e842096b3e9d8db225ba7b1225710c128866837845850cd10c68b5e3";
    public static SubLSymbol $g2378$;
    public static SubLSymbol $g2379$;
    private static SubLSymbol $g2380$;
    private static SubLSymbol $g2381$;
    private static SubLSymbol $g2382$;
    private static SubLSymbol $g2383$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    
    public static SubLObject f14087(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var3 == module0214.UNPROVIDED) {
            var3 = (SubLObject)module0214.NIL;
        }
        if (var4 == module0214.UNPROVIDED) {
            var4 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0214.NIL != module0178.f11284(var1) && (module0214.NIL == var4 || var4.equal(module0178.f11332(var1))) && module0214.NIL != ((module0214.NIL != var3) ? Equality.equal(var2, module0178.f11331(var1, var3)) : module0202.f12723(var2, module0178.f11285(var1))) && (module0214.NIL == var5 || module0214.NIL != module0161.f10513(var5, module0178.f11287(var1))));
    }
    
    public static SubLObject f14088(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var6, SubLObject var5) {
        if (var3 == module0214.UNPROVIDED) {
            var3 = (SubLObject)module0214.NIL;
        }
        if (var6 == module0214.UNPROVIDED) {
            var6 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11284(var1)) {
            return (SubLObject)module0214.NIL;
        }
        return f14089(var1, var2, var3, var6, var5);
    }
    
    public static SubLObject f14090(final SubLObject var1, SubLObject var7, final SubLObject var2, SubLObject var8, SubLObject var6) {
        if (var8 == module0214.UNPROVIDED) {
            var8 = (SubLObject)module0214.NIL;
        }
        if (var6 == module0214.UNPROVIDED) {
            var6 = (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != module0178.f11284(var1) && module0214.NIL != f14089(var1, var2, var8, var6, (SubLObject)module0214.NIL)) {
            var7 = f14091(var1, var7, var2, var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f14089(final SubLObject var1, final SubLObject var2, final SubLObject var8, final SubLObject var6, final SubLObject var5) {
        if (module0214.NIL == var8) {
            return module0035.sublisp_boolean(Sequences.find(var2, module0178.f11330(var1), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
        }
        if (!module0178.f11331(var1, var8).equal(var2)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var6) {
            return (SubLObject)module0214.T;
        }
        if (!module0178.f11332(var1).eql(var6)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var5) {
            return (SubLObject)module0214.T;
        }
        return module0161.f10513(module0178.f11287(var1), var5);
    }
    
    public static SubLObject f14091(final SubLObject var1, SubLObject var7, final SubLObject var2, final SubLObject var8, final SubLObject var6) {
        if (module0214.NIL != var8) {
            if (module0214.NIL != var6) {
                final SubLObject var9 = module0178.f11287(var1);
                if (module0214.NIL == conses_high.member(var9, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var9, var7);
                }
            }
            else {
                final SubLObject var9 = module0178.f11332(var1);
                if (module0214.NIL == conses_high.member(var9, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var9, var7);
                }
            }
        }
        else {
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            for (var10 = module0178.f11285(var1), var11 = (SubLObject)module0214.NIL, var12 = (SubLObject)module0214.NIL, var11 = (SubLObject)module0214.NIL, var12 = Sequences.position(var2, var10, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY), (SubLObject)module0214.ONE_INTEGER, (SubLObject)module0214.UNPROVIDED); module0214.NIL != var12; var12 = Sequences.position(var2, var10, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY), Numbers.add(var11, (SubLObject)module0214.ONE_INTEGER), (SubLObject)module0214.UNPROVIDED)) {
                var13 = var12;
                if (module0214.NIL == conses_high.member(var13, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var13, var7);
                }
                var11 = var12;
            }
        }
        return var7;
    }
    
    public static SubLObject f14092(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var13) {
        if (var3 == module0214.UNPROVIDED) {
            var3 = (SubLObject)module0214.NIL;
        }
        if (var13 == module0214.UNPROVIDED) {
            var13 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11284(var1)) {
            return (SubLObject)module0214.NIL;
        }
        return f14093(var1, var2, var3, var13);
    }
    
    public static SubLObject f14094(final SubLObject var1, SubLObject var7, final SubLObject var2, SubLObject var8, SubLObject var13) {
        if (var8 == module0214.UNPROVIDED) {
            var8 = (SubLObject)module0214.NIL;
        }
        if (var13 == module0214.UNPROVIDED) {
            var13 = (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != module0178.f11284(var1) && module0214.NIL != f14093(var1, var2, var8, var13)) {
            var7 = f14095(var1, var7, var2, var8, var13);
        }
        return var7;
    }
    
    public static SubLObject f14093(final SubLObject var1, final SubLObject var2, final SubLObject var8, final SubLObject var13) {
        if (!module0178.f11332(var1).eql(module0214.$ic2$)) {
            return (SubLObject)module0214.NIL;
        }
        final SubLObject var14 = module0178.f11335(var1);
        if (module0214.NIL != var13 && !module0205.f13364(var14).eql(var13)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != var8) {
            if (!module0205.f13362(var14, var8, (SubLObject)module0214.UNPROVIDED).equal(var2)) {
                return (SubLObject)module0214.NIL;
            }
        }
        else if (module0214.NIL == Sequences.find(var2, module0205.f13304(var14, (SubLObject)module0214.UNPROVIDED), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
            return (SubLObject)module0214.NIL;
        }
        return (SubLObject)module0214.T;
    }
    
    public static SubLObject f14095(final SubLObject var1, SubLObject var7, final SubLObject var2, final SubLObject var8, final SubLObject var13) {
        final SubLObject var14 = module0178.f11335(var1);
        if (module0214.NIL != var8) {
            if (module0214.NIL != var13) {
                final SubLObject var15 = module0178.f11287(var1);
                if (module0214.NIL == conses_high.member(var15, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var15, var7);
                }
            }
            else {
                final SubLObject var15 = module0205.f13364(var14);
                if (module0214.NIL == conses_high.member(var15, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var15, var7);
                }
            }
        }
        else {
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            for (var16 = (SubLObject)module0214.NIL, var17 = (SubLObject)module0214.NIL, var16 = (SubLObject)module0214.NIL, var17 = Sequences.position(var2, var14, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY), (SubLObject)module0214.ONE_INTEGER, (SubLObject)module0214.UNPROVIDED); module0214.NIL != var17; var17 = Sequences.position(var2, var14, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY), Numbers.add(var16, (SubLObject)module0214.ONE_INTEGER), (SubLObject)module0214.UNPROVIDED)) {
                var18 = var17;
                if (module0214.NIL == conses_high.member(var18, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var18, var7);
                }
                var16 = var17;
            }
        }
        return var7;
    }
    
    public static SubLObject f14096(final SubLObject var1, final SubLObject var2, SubLObject var5) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11284(var1)) {
            return (SubLObject)module0214.NIL;
        }
        return f14097(var1, var2, var5);
    }
    
    public static SubLObject f14098(final SubLObject var1, SubLObject var7, final SubLObject var2) {
        if (module0214.NIL != f14096(var1, var2, (SubLObject)module0214.UNPROVIDED)) {
            final SubLObject var8 = module0178.f11287(var1);
            if (module0214.NIL == conses_high.member(var8, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                var7 = (SubLObject)ConsesLow.cons(var8, var7);
            }
        }
        return var7;
    }
    
    public static SubLObject f14097(final SubLObject var1, final SubLObject var2, final SubLObject var5) {
        if (!module0178.f11332(var1).eql(var2)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var5) {
            return (SubLObject)module0214.T;
        }
        return module0161.f10513(module0178.f11287(var1), var5);
    }
    
    public static SubLObject f14099(final SubLObject var1, final SubLObject var2) {
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11284(var1)) {
            return (SubLObject)module0214.NIL;
        }
        return f14100(var1, var2);
    }
    
    public static SubLObject f14100(final SubLObject var1, final SubLObject var13) {
        if (!module0178.f11332(var1).eql(module0214.$ic2$)) {
            return (SubLObject)module0214.NIL;
        }
        final SubLObject var14 = module0178.f11335(var1);
        if (!module0205.f13364(var14).eql(var13)) {
            return (SubLObject)module0214.NIL;
        }
        return (SubLObject)module0214.T;
    }
    
    public static SubLObject f14101(final SubLObject var1, final SubLObject var6, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var17 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_18 = (SubLObject)module0214.NIL;
            var15_18 = var17.first();
            while (module0214.NIL != var17) {
                if (module0214.NIL != f14101(var1, var6, var15_18, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var17 = var17.rest();
                var15_18 = var17.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var18 = module0178.f11282(var1);
        final SubLObject var19 = (var15 == module0214.$ic3$) ? module0232.f15308(var18) : module0232.f15306(var18);
        return module0035.sublisp_boolean(Sequences.find(var6, var19, Symbols.symbol_function((SubLObject)module0214.$ic4$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14102(final SubLObject var1, SubLObject var7, final SubLObject var6, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14101(var1, var6, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var16 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
                else {
                    final SubLObject var16 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
            }
            else {
                SubLObject var17 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_21 = (SubLObject)module0214.NIL;
                var15_21 = var17.first();
                while (module0214.NIL != var17) {
                    if (module0214.NIL != f14101(var1, var6, var15_21, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var18 = var15_21;
                        if (module0214.NIL == conses_high.member(var18, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                        }
                    }
                    var17 = var17.rest();
                    var15_21 = var17.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14103(final SubLObject var6, final SubLObject var22) {
        final SubLObject var23 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.NIL == module0173.f10955(var23)) {
            return (SubLObject)module0214.NIL;
        }
        return Equality.eq(var6, var23);
    }
    
    public static SubLObject f14104(final SubLObject var1, final SubLObject var6, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var17 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_23 = (SubLObject)module0214.NIL;
            var15_23 = var17.first();
            while (module0214.NIL != var17) {
                if (module0214.NIL != f14104(var1, var6, var15_23, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var17 = var17.rest();
                var15_23 = var17.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var18 = module0178.f11282(var1);
        final SubLObject var19 = (var15 == module0214.$ic3$) ? module0232.f15308(var18) : module0232.f15306(var18);
        return module0035.sublisp_boolean(Sequences.find(var6, var19, Symbols.symbol_function((SubLObject)module0214.$ic5$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14105(final SubLObject var1, SubLObject var7, final SubLObject var6, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14104(var1, var6, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var16 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
                else {
                    final SubLObject var16 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
            }
            else {
                SubLObject var17 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_24 = (SubLObject)module0214.NIL;
                var15_24 = var17.first();
                while (module0214.NIL != var17) {
                    if (module0214.NIL != f14104(var1, var6, var15_24, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var18 = var15_24;
                        if (module0214.NIL == conses_high.member(var18, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                        }
                    }
                    var17 = var17.rest();
                    var15_24 = var17.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14106(final SubLObject var6, final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0214.$ic6$.eql(module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED)) && var6.eql(module0202.f12832(module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED), (SubLObject)module0214.UNPROVIDED)));
    }
    
    public static SubLObject f14107(final SubLObject var1, final SubLObject var6, SubLObject var15, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var17 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_25 = (SubLObject)module0214.NIL;
            var15_25 = var17.first();
            while (module0214.NIL != var17) {
                if (module0214.NIL != f14107(var1, var6, var15_25, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var17 = var17.rest();
                var15_25 = var17.first();
            }
        }
        if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
            return (SubLObject)module0214.NIL;
        }
        final SubLObject var18 = module0178.f11282(var1);
        final SubLObject var19 = (var15 == module0214.$ic3$) ? module0232.f15308(var18) : module0232.f15306(var18);
        return module0035.sublisp_boolean(Sequences.find(var6, var19, Symbols.symbol_function((SubLObject)module0214.$ic7$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14108(final SubLObject var1, SubLObject var7, final SubLObject var6, SubLObject var15) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14107(var1, var6, var15, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                final SubLObject var16 = module0178.f11291(var1);
                if (module0214.NIL == conses_high.member(var16, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var16, var7);
                }
            }
            else {
                SubLObject var17 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_26 = (SubLObject)module0214.NIL;
                var15_26 = var17.first();
                while (module0214.NIL != var17) {
                    if (module0214.NIL != f14107(var1, var6, var15_26, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var18 = var15_26;
                        if (module0214.NIL == conses_high.member(var18, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                        }
                    }
                    var17 = var17.rest();
                    var15_26 = var17.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14109(final SubLObject var6, final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0214.$ic6$.eql(module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED)) && var6.eql(module0202.f12832(module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED), (SubLObject)module0214.UNPROVIDED)));
    }
    
    public static SubLObject f14110(final SubLObject var1, final SubLObject var27, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var28 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_28 = (SubLObject)module0214.NIL;
            var15_28 = var28.first();
            while (module0214.NIL != var28) {
                if (module0214.NIL != f14110(var1, var27, var15_28, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var28 = var28.rest();
                var15_28 = var28.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var29 = module0178.f11282(var1);
        final SubLObject var30 = (var15 == module0214.$ic3$) ? module0232.f15308(var29) : module0232.f15306(var29);
        return module0035.sublisp_boolean(Sequences.find(var27, var30, Symbols.symbol_function((SubLObject)module0214.$ic8$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14111(final SubLObject var1, SubLObject var7, final SubLObject var27, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14110(var1, var27, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var28 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
                else {
                    final SubLObject var28 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
            }
            else {
                SubLObject var29 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_29 = (SubLObject)module0214.NIL;
                var15_29 = var29.first();
                while (module0214.NIL != var29) {
                    if (module0214.NIL != f14110(var1, var27, var15_29, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var30 = var15_29;
                        if (module0214.NIL == conses_high.member(var30, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var30, var7);
                        }
                    }
                    var29 = var29.rest();
                    var15_29 = var29.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14112(final SubLObject var27, final SubLObject var22) {
        final SubLObject var28 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.$ic9$.eql(var28)) {
            final SubLObject var29 = module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED);
            if (module0214.NIL != module0173.f10955(var29)) {
                return Equality.eq(var27, var29);
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14113(final SubLObject var1, final SubLObject var27, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var28 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_31 = (SubLObject)module0214.NIL;
            var15_31 = var28.first();
            while (module0214.NIL != var28) {
                if (module0214.NIL != f14113(var1, var27, var15_31, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var28 = var28.rest();
                var15_31 = var28.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var29 = module0178.f11282(var1);
        final SubLObject var30 = (var15 == module0214.$ic3$) ? module0232.f15308(var29) : module0232.f15306(var29);
        return module0035.sublisp_boolean(Sequences.find(var27, var30, Symbols.symbol_function((SubLObject)module0214.$ic10$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14114(final SubLObject var1, SubLObject var7, final SubLObject var27, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14113(var1, var27, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var28 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
                else {
                    final SubLObject var28 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
            }
            else {
                SubLObject var29 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_32 = (SubLObject)module0214.NIL;
                var15_32 = var29.first();
                while (module0214.NIL != var29) {
                    if (module0214.NIL != f14113(var1, var27, var15_32, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var30 = var15_32;
                        if (module0214.NIL == conses_high.member(var30, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var30, var7);
                        }
                    }
                    var29 = var29.rest();
                    var15_32 = var29.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14115(final SubLObject var27, final SubLObject var22) {
        final SubLObject var28 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.$ic11$.eql(var28)) {
            final SubLObject var29 = module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED);
            if (module0214.NIL != module0173.f10955(var29)) {
                return Equality.eq(var27, var29);
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14116(final SubLObject var1, final SubLObject var27, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var28 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_33 = (SubLObject)module0214.NIL;
            var15_33 = var28.first();
            while (module0214.NIL != var28) {
                if (module0214.NIL != f14116(var1, var27, var15_33, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var28 = var28.rest();
                var15_33 = var28.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var29 = module0178.f11282(var1);
        final SubLObject var30 = (var15 == module0214.$ic3$) ? module0232.f15308(var29) : module0232.f15306(var29);
        return module0035.sublisp_boolean(Sequences.find(var27, var30, Symbols.symbol_function((SubLObject)module0214.$ic12$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14117(final SubLObject var1, SubLObject var7, final SubLObject var27, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14116(var1, var27, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var28 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
                else {
                    final SubLObject var28 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var28, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                    }
                }
            }
            else {
                SubLObject var29 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_34 = (SubLObject)module0214.NIL;
                var15_34 = var29.first();
                while (module0214.NIL != var29) {
                    if (module0214.NIL != f14116(var1, var27, var15_34, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var30 = var15_34;
                        if (module0214.NIL == conses_high.member(var30, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var30, var7);
                        }
                    }
                    var29 = var29.rest();
                    var15_34 = var29.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14118(final SubLObject var27, final SubLObject var22) {
        final SubLObject var28 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.$ic13$.eql(var28)) {
            final SubLObject var29 = module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED);
            if (module0214.NIL != module0173.f10955(var29)) {
                return Equality.eq(var27, var29);
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14119(final SubLObject var1, final SubLObject var35, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var36 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_36 = (SubLObject)module0214.NIL;
            var15_36 = var36.first();
            while (module0214.NIL != var36) {
                if (module0214.NIL != f14119(var1, var35, var15_36, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var36 = var36.rest();
                var15_36 = var36.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var37 = module0178.f11282(var1);
        final SubLObject var38 = (var15 == module0214.$ic3$) ? module0232.f15308(var37) : module0232.f15306(var37);
        return module0035.sublisp_boolean(Sequences.find(var35, var38, Symbols.symbol_function((SubLObject)module0214.$ic14$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14120(final SubLObject var1, SubLObject var7, final SubLObject var35, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14119(var1, var35, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var36 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var36, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var36, var7);
                    }
                }
                else {
                    final SubLObject var36 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var36, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var36, var7);
                    }
                }
            }
            else {
                SubLObject var37 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_37 = (SubLObject)module0214.NIL;
                var15_37 = var37.first();
                while (module0214.NIL != var37) {
                    if (module0214.NIL != f14119(var1, var35, var15_37, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var38 = var15_37;
                        if (module0214.NIL == conses_high.member(var38, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var38, var7);
                        }
                    }
                    var37 = var37.rest();
                    var15_37 = var37.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14121(final SubLObject var5, final SubLObject var22) {
        final SubLObject var23 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.$ic15$.eql(var23)) {
            final SubLObject var24 = module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED);
            if (module0214.NIL != module0161.f10481(var24)) {
                return module0161.f10513(var5, var24);
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14122(final SubLObject var1, final SubLObject var13, SubLObject var5, SubLObject var16) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var17 = module0178.f11282(var1);
        final SubLObject var18 = module0232.f15306(var17);
        return module0035.sublisp_boolean(Sequences.find(var13, var18, Symbols.symbol_function((SubLObject)module0214.$ic16$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14123(final SubLObject var1, SubLObject var7, final SubLObject var13, SubLObject var5) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14122(var1, var13, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var5) {
                final SubLObject var14 = module0178.f11291(var1);
                if (module0214.NIL == conses_high.member(var14, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var14, var7);
                }
            }
            else {
                final SubLObject var14 = module0178.f11287(var1);
                if (module0214.NIL == conses_high.member(var14, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var14, var7);
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14124(final SubLObject var13, final SubLObject var22) {
        final SubLObject var23 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (module0214.$ic2$.eql(var23) && module0214.NIL != module0193.f12067(module0202.f12834(var22, (SubLObject)module0214.UNPROVIDED))) {
            final SubLObject var24 = module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED);
            if (var24.isCons()) {
                final SubLObject var25 = module0205.f13364(var24);
                if (module0214.NIL != module0173.f10955(var25)) {
                    return Equality.eq(var13, var25);
                }
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14125(final SubLObject var1, final SubLObject var39, SubLObject var5, SubLObject var16) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var40 = module0178.f11282(var1);
        final SubLObject var41 = module0232.f15308(var40);
        return module0035.sublisp_boolean(Sequences.find(var39, var41, Symbols.symbol_function((SubLObject)module0214.$ic17$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14126(final SubLObject var1, SubLObject var7, final SubLObject var39, SubLObject var5) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14125(var1, var39, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var5) {
                final SubLObject var40 = module0178.f11291(var1);
                if (module0214.NIL == conses_high.member(var40, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var40, var7);
                }
            }
            else {
                final SubLObject var40 = module0178.f11287(var1);
                if (module0214.NIL == conses_high.member(var40, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var40, var7);
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14127(final SubLObject var39, final SubLObject var22) {
        final SubLObject var40 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (!module0214.$ic18$.eql(var40)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == module0174.f11035(var39)) {
            return (SubLObject)module0214.NIL;
        }
        return Equality.eq(module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED), var39);
    }
    
    public static SubLObject f14128(final SubLObject var1, final SubLObject var39, SubLObject var5, SubLObject var16) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        final SubLObject var40 = module0178.f11282(var1);
        final SubLObject var41 = module0232.f15308(var40);
        return module0035.sublisp_boolean(Sequences.find(var39, var41, Symbols.symbol_function((SubLObject)module0214.$ic19$), (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14129(final SubLObject var1, SubLObject var7, final SubLObject var39, SubLObject var5) {
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14128(var1, var39, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var5) {
                final SubLObject var40 = module0178.f11291(var1);
                if (module0214.NIL == conses_high.member(var40, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var40, var7);
                }
            }
            else {
                final SubLObject var40 = module0178.f11287(var1);
                if (module0214.NIL == conses_high.member(var40, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    var7 = (SubLObject)ConsesLow.cons(var40, var7);
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14130(final SubLObject var39, final SubLObject var22) {
        final SubLObject var40 = module0202.f12832(var22, (SubLObject)module0214.UNPROVIDED);
        if (!module0214.$ic20$.eql(var40)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == module0174.f11035(var39)) {
            return (SubLObject)module0214.NIL;
        }
        return Equality.eq(module0202.f12835(var22, (SubLObject)module0214.UNPROVIDED), var39);
    }
    
    public static SubLObject f14131(final SubLObject var1, SubLObject var15, SubLObject var5, SubLObject var16) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0178.f11290(var1)) {
            return (SubLObject)module0214.NIL;
        }
        if (module0214.NIL == var15) {
            SubLObject var17 = module0130.$g1509$.getGlobalValue();
            SubLObject var15_42 = (SubLObject)module0214.NIL;
            var15_42 = var17.first();
            while (module0214.NIL != var17) {
                if (module0214.NIL != f14131(var1, var15_42, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                    return (SubLObject)module0214.T;
                }
                var17 = var17.rest();
                var15_42 = var17.first();
            }
        }
        if (module0214.NIL != var5) {
            if (module0214.NIL == module0161.f10513(module0178.f11287(var1), var5)) {
                return (SubLObject)module0214.NIL;
            }
            if (module0214.NIL != var16 && !module0178.f11291(var1).eql(var16)) {
                return (SubLObject)module0214.NIL;
            }
        }
        return (SubLObject)module0214.T;
    }
    
    public static SubLObject f14132(final SubLObject var1, SubLObject var7, SubLObject var15, SubLObject var5) {
        if (var15 == module0214.UNPROVIDED) {
            var15 = (SubLObject)module0214.NIL;
        }
        if (var5 == module0214.UNPROVIDED) {
            var5 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL != f14131(var1, var15, var5, (SubLObject)module0214.UNPROVIDED)) {
            if (module0214.NIL != var15) {
                if (module0214.NIL != var5) {
                    final SubLObject var16 = module0178.f11291(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
                else {
                    final SubLObject var16 = module0178.f11287(var1);
                    if (module0214.NIL == conses_high.member(var16, var7, (SubLObject)module0214.$ic1$, Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
            }
            else {
                SubLObject var17 = module0130.$g1509$.getGlobalValue();
                SubLObject var15_43 = (SubLObject)module0214.NIL;
                var15_43 = var17.first();
                while (module0214.NIL != var17) {
                    if (module0214.NIL != f14131(var1, var15_43, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                        final SubLObject var18 = var15_43;
                        if (module0214.NIL == conses_high.member(var18, var7, Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                        }
                    }
                    var17 = var17.rest();
                    var15_43 = var17.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f14133(final SubLObject var1, final SubLObject var5) {
        assert module0214.NIL != module0174.f11035(var1) : var1;
        final SubLObject var6 = module0178.f11287(var1);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0214.NIL != module0161.f10513(var6, var5) && module0214.NIL == module0217.f14342(module0161.f10557(var5)));
    }
    
    public static SubLObject f14134(final SubLObject var1, final SubLObject var2) {
        assert module0214.NIL != module0174.f11035(var1) : var1;
        if (module0214.NIL == module0035.f2428(var2, module0178.f11282(var1), Symbols.symbol_function((SubLObject)module0214.EQUAL), (SubLObject)module0214.UNPROVIDED) && module0214.NIL == module0205.f13220(var2, module0178.f11287(var1), (SubLObject)module0214.NIL, Symbols.symbol_function((SubLObject)module0214.EQUAL), (SubLObject)module0214.UNPROVIDED)) {
            return (SubLObject)module0214.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0214.NIL == f14088(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14092(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14096(var1, var2, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14099(var1, var2) && module0214.NIL == f14101(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14104(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14107(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14110(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14116(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14119(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14122(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14125(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED) && module0214.NIL == f14128(var1, var2, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED));
    }
    
    public static SubLObject f14135(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = module0212.f13798(var2);
        return f14136(var2, var3, var1);
    }
    
    public static SubLObject f14136(final SubLObject var2, final SubLObject var45, final SubLObject var1) {
        assert module0214.NIL != module0174.f11035(var1) : var1;
        final SubLObject var46 = conses_high.adjoin(var1, var45, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED);
        if (!var45.eql(var46)) {
            module0212.f13800(var2, var46);
            f14137(var2);
        }
        return var1;
    }
    
    public static SubLObject f14138(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = module0212.f13798(var2);
        return f14139(var2, var3, var1);
    }
    
    public static SubLObject f14139(final SubLObject var2, final SubLObject var45, final SubLObject var1) {
        assert module0214.NIL != module0174.f11035(var1) : var1;
        final SubLObject var46 = module0035.f2073(var1, var45, (SubLObject)module0214.UNPROVIDED);
        if (!var45.eql(var46)) {
            module0212.f13800(var2, var46);
        }
        return var1;
    }
    
    public static SubLObject f14140(final SubLObject var1, SubLObject var47, SubLObject var48, SubLObject var16) {
        if (var47 == module0214.UNPROVIDED) {
            var47 = (SubLObject)module0214.NIL;
        }
        if (var48 == module0214.UNPROVIDED) {
            var48 = (SubLObject)module0214.NIL;
        }
        if (var16 == module0214.UNPROVIDED) {
            var16 = (SubLObject)module0214.NIL;
        }
        assert module0214.NIL != module0174.f11035(var1) : var1;
        return (SubLObject)SubLObjectFactory.makeBoolean((module0214.NIL == var47 || module0214.NIL != module0178.f11343(var1, var47)) && (module0214.NIL == var48 || module0214.NIL != module0178.f11321(var1, var48)) && (module0214.NIL == var16 || module0214.NIL != module0178.f11340(var1, var16)));
    }
    
    public static SubLObject f14141(final SubLObject var49, final SubLObject var50) {
        final SubLObject var51 = var49.rest();
        final SubLObject var53;
        final SubLObject var52 = var53 = var51;
        return (SubLObject)ConsesLow.listS((SubLObject)module0214.$ic21$, (SubLObject)module0214.$ic22$, ConsesLow.append(var53, (SubLObject)module0214.$ic23$));
    }
    
    public static SubLObject f14142() {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = module0214.$g2379$.getDynamicValue(var54);
        SubLObject var56 = (SubLObject)module0214.NIL;
        var56 = var55.first();
        while (module0214.NIL != var55) {
            f14143(var56);
            var55 = var55.rest();
            var56 = var55.first();
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14137(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0214.NIL != module0214.$g2378$.getDynamicValue(var3)) {
            final SubLObject var4 = module0217.f14357(var2);
            if (module0214.NIL != module0212.f13795(var2)) {
                if (var4.numGE(module0214.$g2382$.getDynamicValue(var3))) {
                    if (module0214.NIL == conses_high.member(var2, module0214.$g2379$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                        module0214.$g2379$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0214.$g2379$.getDynamicValue(var3)), var3);
                    }
                    return (SubLObject)module0214.T;
                }
            }
            else if (var4.numLE(module0214.$g2383$.getDynamicValue(var3))) {
                if (module0214.NIL == conses_high.member(var2, module0214.$g2379$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0214.EQL), Symbols.symbol_function((SubLObject)module0214.IDENTITY))) {
                    module0214.$g2379$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0214.$g2379$.getDynamicValue(var3)), var3);
                }
                return (SubLObject)module0214.T;
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14143(final SubLObject var2) {
        if (module0214.NIL != module0212.f13795(var2)) {
            f14144(var2);
        }
        else {
            f14145(var2);
        }
        return var2;
    }
    
    public static SubLObject f14144(final SubLObject var2) {
        final SubLObject var3 = Sequences.reverse(module0212.f13798(var2));
        module0212.f13812(var2);
        SubLObject var4 = var3;
        SubLObject var5 = (SubLObject)module0214.NIL;
        var5 = var4.first();
        while (module0214.NIL != var4) {
            module0217.f14364(var5, var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f14145(final SubLObject var2) {
        SubLObject var3 = module0219.f14508(var2, (SubLObject)module0214.T);
        var3 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0214.$ic27$), var3, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED);
        module0212.f13794(var2);
        module0212.f13800(var2, var3);
        return var2;
    }
    
    public static SubLObject f14146(final SubLObject var2) {
        if (module0214.NIL == module0212.f13795(var2)) {
            f14145(var2);
            f14144(var2);
            return var2;
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14147() {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = (SubLObject)module0214.$ic28$;
        final SubLObject var56 = module0173.f10962();
        SubLObject var57 = (SubLObject)module0214.ZERO_INTEGER;
        final SubLObject var58 = module0012.$g75$.currentBinding(var54);
        final SubLObject var59 = module0012.$g76$.currentBinding(var54);
        final SubLObject var60 = module0012.$g77$.currentBinding(var54);
        final SubLObject var61 = module0012.$g78$.currentBinding(var54);
        try {
            module0012.$g75$.bind((SubLObject)module0214.ZERO_INTEGER, var54);
            module0012.$g76$.bind((SubLObject)module0214.NIL, var54);
            module0012.$g77$.bind((SubLObject)module0214.T, var54);
            module0012.$g78$.bind(Time.get_universal_time(), var54);
            module0012.f478(var55);
            SubLObject var62 = module0173.f10961();
            SubLObject var63 = (SubLObject)module0214.NIL;
            var63 = var62.first();
            while (module0214.NIL != var62) {
                final SubLObject var64 = var63;
                if (module0214.NIL == module0065.f4772(var64, (SubLObject)module0214.$ic29$)) {
                    final SubLObject var66_67 = var64;
                    if (module0214.NIL == module0065.f4775(var66_67, (SubLObject)module0214.$ic29$)) {
                        final SubLObject var65 = module0065.f4740(var66_67);
                        final SubLObject var66 = (SubLObject)module0214.NIL;
                        SubLObject var67;
                        SubLObject var68;
                        SubLObject var69;
                        SubLObject var70;
                        for (var67 = Sequences.length(var65), var68 = (SubLObject)module0214.NIL, var68 = (SubLObject)module0214.ZERO_INTEGER; var68.numL(var67); var68 = Numbers.add(var68, (SubLObject)module0214.ONE_INTEGER)) {
                            var69 = ((module0214.NIL != var66) ? Numbers.subtract(var67, var68, (SubLObject)module0214.ONE_INTEGER) : var68);
                            var70 = Vectors.aref(var65, var69);
                            if (module0214.NIL == module0065.f4749(var70) || module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$)) {
                                if (module0214.NIL != module0065.f4749(var70)) {
                                    var70 = (SubLObject)module0214.$ic29$;
                                }
                                var57 = Numbers.add(var57, (SubLObject)module0214.ONE_INTEGER);
                                module0012.note_percent_progress(var57, var56);
                                f14148(var70);
                            }
                        }
                    }
                    final SubLObject var74_75 = var64;
                    if (module0214.NIL == module0065.f4777(var74_75) || module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$)) {
                        final SubLObject var71 = module0065.f4738(var74_75);
                        SubLObject var72 = module0065.f4739(var74_75);
                        final SubLObject var73 = module0065.f4734(var74_75);
                        final SubLObject var74 = (SubLObject)((module0214.NIL != module0065.f4773((SubLObject)module0214.$ic29$)) ? module0214.NIL : module0214.$ic29$);
                        while (var72.numL(var73)) {
                            final SubLObject var75 = Hashtables.gethash_without_values(var72, var71, var74);
                            if (module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$) || module0214.NIL == module0065.f4749(var75)) {
                                var57 = Numbers.add(var57, (SubLObject)module0214.ONE_INTEGER);
                                module0012.note_percent_progress(var57, var56);
                                f14148(var75);
                            }
                            var72 = Numbers.add(var72, (SubLObject)module0214.ONE_INTEGER);
                        }
                    }
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var61, var54);
            module0012.$g77$.rebind(var60, var54);
            module0012.$g76$.rebind(var59, var54);
            module0012.$g75$.rebind(var58, var54);
        }
        final SubLObject var76 = module0174.f11010();
        final SubLObject var77 = (SubLObject)module0214.$ic30$;
        final SubLObject var78 = module0065.f4733(var76);
        SubLObject var79 = (SubLObject)module0214.ZERO_INTEGER;
        assert module0214.NIL != Types.stringp(var77) : var77;
        final SubLObject var80 = module0012.$g75$.currentBinding(var54);
        final SubLObject var81 = module0012.$g76$.currentBinding(var54);
        final SubLObject var82 = module0012.$g77$.currentBinding(var54);
        final SubLObject var83 = module0012.$g78$.currentBinding(var54);
        try {
            module0012.$g75$.bind((SubLObject)module0214.ZERO_INTEGER, var54);
            module0012.$g76$.bind((SubLObject)module0214.NIL, var54);
            module0012.$g77$.bind((SubLObject)module0214.T, var54);
            module0012.$g78$.bind(Time.get_universal_time(), var54);
            module0012.f478(var77);
            final SubLObject var65_83 = var76;
            if (module0214.NIL == module0065.f4772(var65_83, (SubLObject)module0214.$ic29$)) {
                final SubLObject var66_68 = var65_83;
                if (module0214.NIL == module0065.f4775(var66_68, (SubLObject)module0214.$ic29$)) {
                    final SubLObject var84 = module0065.f4740(var66_68);
                    final SubLObject var85 = (SubLObject)module0214.NIL;
                    SubLObject var86;
                    SubLObject var87;
                    SubLObject var88;
                    SubLObject var89;
                    for (var86 = Sequences.length(var84), var87 = (SubLObject)module0214.NIL, var87 = (SubLObject)module0214.ZERO_INTEGER; var87.numL(var86); var87 = Numbers.add(var87, (SubLObject)module0214.ONE_INTEGER)) {
                        var88 = ((module0214.NIL != var85) ? Numbers.subtract(var86, var87, (SubLObject)module0214.ONE_INTEGER) : var87);
                        var89 = Vectors.aref(var84, var88);
                        if (module0214.NIL == module0065.f4749(var89) || module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$)) {
                            if (module0214.NIL != module0065.f4749(var89)) {
                                var89 = (SubLObject)module0214.$ic29$;
                            }
                            module0012.note_percent_progress(var79, var78);
                            var79 = Numbers.add(var79, (SubLObject)module0214.ONE_INTEGER);
                            if (module0214.NIL != module0211.f13700(var89)) {
                                f14148(var89);
                            }
                        }
                    }
                }
                final SubLObject var74_76 = var65_83;
                if (module0214.NIL == module0065.f4777(var74_76) || module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$)) {
                    final SubLObject var90 = module0065.f4738(var74_76);
                    SubLObject var91 = module0065.f4739(var74_76);
                    final SubLObject var92 = module0065.f4734(var74_76);
                    final SubLObject var93 = (SubLObject)((module0214.NIL != module0065.f4773((SubLObject)module0214.$ic29$)) ? module0214.NIL : module0214.$ic29$);
                    while (var91.numL(var92)) {
                        final SubLObject var94 = Hashtables.gethash_without_values(var91, var90, var93);
                        if (module0214.NIL == module0065.f4773((SubLObject)module0214.$ic29$) || module0214.NIL == module0065.f4749(var94)) {
                            module0012.note_percent_progress(var79, var78);
                            var79 = Numbers.add(var79, (SubLObject)module0214.ONE_INTEGER);
                            if (module0214.NIL != module0211.f13700(var94)) {
                                f14148(var94);
                            }
                        }
                        var91 = Numbers.add(var91, (SubLObject)module0214.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var83, var54);
            module0012.$g77$.rebind(var82, var54);
            module0012.$g76$.rebind(var81, var54);
            module0012.$g75$.rebind(var80, var54);
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14148(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0214.NIL != module0212.f13795(var2)) {
            SubLObject var4 = module0212.f13798(var2);
            if (module0214.NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)module0214.$ic27$), var4, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED)) {
                Errors.warn((SubLObject)module0214.$ic32$, var2);
                var4 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0214.$ic27$), var4, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED, (SubLObject)module0214.UNPROVIDED);
                module0212.f13800(var2, var4);
            }
        }
        else {
            SubLObject var5 = (SubLObject)module0214.NIL;
            try {
                var3.throwStack.push(module0214.$ic33$);
                module0219.f14491(Symbols.symbol_function((SubLObject)module0214.$ic34$), var2);
                var5 = (SubLObject)module0214.NIL;
            }
            catch (Throwable var6) {
                var5 = Errors.handleThrowable(var6, (SubLObject)module0214.$ic33$);
            }
            finally {
                var3.throwStack.pop();
            }
            if (module0214.NIL != var5) {
                f14145(var2);
                f14148(var2);
                f14144(var2);
            }
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14149(final SubLObject var1) {
        if (module0214.NIL == module0178.f11361(var1, (SubLObject)module0214.UNPROVIDED)) {
            Dynamic.sublisp_throw((SubLObject)module0214.$ic33$, (SubLObject)module0214.T);
        }
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14150() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14087", "S#16960", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14088", "S#16961", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14090", "S#16962", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14089", "S#16963", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14091", "S#16964", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14092", "S#12756", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14094", "S#16965", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14093", "S#16966", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14095", "S#16967", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14096", "S#16968", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14098", "S#16969", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14097", "S#16970", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14099", "S#16971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14100", "S#16972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14101", "S#16973", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14102", "S#16974", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14103", "S#16975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14104", "S#16976", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14105", "S#16977", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14106", "S#16978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14107", "S#16979", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14108", "S#16980", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14109", "S#16981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14110", "S#16982", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14111", "S#16983", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14112", "S#16984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14113", "S#16985", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14114", "S#16986", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14115", "S#16987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14116", "S#16988", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14117", "S#16989", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14118", "S#16990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14119", "S#16991", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14120", "S#16992", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14121", "S#16993", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14122", "S#16994", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14123", "S#16995", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14124", "S#16996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14125", "S#16997", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14126", "S#16998", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14127", "S#16999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14128", "S#17000", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14129", "S#17001", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14130", "S#16959", 2, 0, false);
        new $f14130$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14131", "S#17002", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14132", "S#17003", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14133", "S#17004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14134", "S#12736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14135", "S#17005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14136", "S#17006", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14138", "S#17007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14139", "S#17008", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14140", "S#17009", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0214", "f14141", "S#17010");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14142", "S#17011", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14137", "S#17012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14143", "S#17013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14144", "S#17014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14145", "S#17015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14146", "S#17016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14147", "S#17017", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14148", "S#17018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0214", "f14149", "S#17019", 1, 0, false);
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14151() {
        module0214.$g2378$ = SubLFiles.defparameter("S#17020", (SubLObject)module0214.NIL);
        module0214.$g2379$ = SubLFiles.defparameter("S#17021", (SubLObject)module0214.NIL);
        module0214.$g2380$ = SubLFiles.defparameter("S#17022", (SubLObject)module0214.TWENTY_INTEGER);
        module0214.$g2381$ = SubLFiles.defparameter("S#17023", (SubLObject)module0214.FOUR_INTEGER);
        module0214.$g2382$ = SubLFiles.defparameter("*INDEX-CONVERT-COMPLEX-THRESHOLD*", Numbers.add(module0214.$g2380$.getDynamicValue(), Numbers.integerDivide(module0214.$g2381$.getDynamicValue(), (SubLObject)module0214.TWO_INTEGER)));
        module0214.$g2383$ = SubLFiles.defparameter("*INDEX-CONVERT-SIMPLE-THRESHOLD*", Numbers.subtract(module0214.$g2380$.getDynamicValue(), Numbers.integerDivide(module0214.$g2381$.getDynamicValue(), (SubLObject)module0214.TWO_INTEGER)));
        return (SubLObject)module0214.NIL;
    }
    
    public static SubLObject f14152() {
        module0002.f50((SubLObject)module0214.$ic24$, (SubLObject)module0214.$ic25$);
        module0002.f50((SubLObject)module0214.$ic26$, (SubLObject)module0214.$ic25$);
        return (SubLObject)module0214.NIL;
    }
    
    public void declareFunctions() {
        f14150();
    }
    
    public void initializeVariables() {
        f14151();
    }
    
    public void runTopLevelForms() {
        f14152();
    }
    
    static {
        me = (SubLFile)new module0214();
        module0214.$g2378$ = null;
        module0214.$g2379$ = null;
        module0214.$g2380$ = null;
        module0214.$g2381$ = null;
        module0214.$g2382$ = null;
        module0214.$g2383$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic1$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic3$ = SubLObjectFactory.makeKeyword("POS");
        $ic4$ = SubLObjectFactory.makeSymbol("S#16975", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#16978", "CYC");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#16981", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#16984", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#16987", "CYC");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#16990", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#16993", "CYC");
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#16996", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#16999", "CYC");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#16959", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $ic21$ = SubLObjectFactory.makeSymbol("CLET");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17020", "CYC"), (SubLObject)module0214.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17021", "CYC"), (SubLObject)module0214.NIL));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#17021", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17011", "CYC"))));
        $ic24$ = SubLObjectFactory.makeSymbol("S#17011", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#17010", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#17012", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#14110", "CYC");
        $ic28$ = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $ic29$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic30$ = SubLObjectFactory.makeString("mapping Cyc assertions");
        $ic31$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic32$ = SubLObjectFactory.makeString("invalid index under ~S");
        $ic33$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic34$ = SubLObjectFactory.makeSymbol("S#17019", "CYC");
    }
    
    public static final class $f14130$BinaryFunction extends BinaryFunction
    {
        public $f14130$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16959"));
        }
        
        public SubLObject processItem(final SubLObject var40, final SubLObject var41) {
            return module0214.f14130(var40, var41);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0214.class
	Total time: 392 ms
	
	Decompiled with Procyon 0.5.32.
*/