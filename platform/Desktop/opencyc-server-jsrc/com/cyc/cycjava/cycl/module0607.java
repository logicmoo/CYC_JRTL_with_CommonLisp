package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0607 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0607";
    public static final String myFingerPrint = "d7b29c22e06946d2160a84bebb0c815516402138aca4548f10379006bf306041";
    public static SubLSymbol $g4701$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLFloat $ic5$;
    
    public static SubLObject f37109(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37089(var1);
        final SubLObject var3 = module0606.f37090(var1);
        return module0606.f37087(Numbers.abs(var2), var3);
    }
    
    public static SubLObject f37110(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37089(var1);
        final SubLObject var3 = module0606.f37090(var1);
        return module0606.f37087(Numbers.multiply((SubLObject)module0607.MINUS_ONE_INTEGER, var2), var3);
    }
    
    public static SubLObject f37111(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37089(var1);
        final SubLObject var3 = module0606.f37090(var1);
        final SubLObject var4 = module0048.f3301(var2);
        final SubLObject var5 = Numbers.subtract(var4, var3, (SubLObject)module0607.ONE_INTEGER);
        if (var3.numL((SubLObject)module0607.ZERO_INTEGER)) {
            return (SubLObject)module0607.ZERO_INTEGER;
        }
        if (var5.numL((SubLObject)module0607.ZERO_INTEGER)) {
            return Numbers.multiply(var2, Numbers.expt((SubLObject)module0607.TEN_INTEGER, Numbers.minus(var5)));
        }
        return Numbers.integerDivide(var2, Numbers.expt((SubLObject)module0607.TEN_INTEGER, var5));
    }
    
    public static SubLObject f37112(final SubLObject var1, final SubLObject var6) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        assert module0607.NIL != module0004.f105(var6) : var6;
        final SubLObject var7 = module0606.f37089(var1);
        final SubLObject var8 = module0048.f3301(var7);
        SubLObject var9 = module0606.f37090(var1);
        SubLObject var10 = module0048.f3302(var7, var6);
        final SubLObject var11 = module0048.f3301(var10);
        final SubLObject var12 = Numbers.subtract(var11, var6);
        if (var11.numG(var8)) {
            var9 = Numbers.add(var9, Numbers.subtract(var11, var8));
        }
        if (var12.numG((SubLObject)module0607.ZERO_INTEGER)) {
            var10 = Numbers.integerDivide(var10, Numbers.expt((SubLObject)module0607.TEN_INTEGER, var12));
        }
        return module0606.f37087(var10, var9);
    }
    
    public static SubLObject f37113(final SubLObject var10, final SubLObject var11) {
        assert module0607.NIL != module0606.f37086(var10) : var10;
        assert module0607.NIL != module0606.f37086(var11) : var11;
        final SubLObject var12 = module0606.f37090(var10);
        final SubLObject var13 = module0606.f37090(var11);
        if (var12.numE(var13)) {
            final SubLObject var14 = module0606.f37089(var10);
            final SubLObject var15 = module0606.f37089(var11);
            return Numbers.numE(var14, var15);
        }
        return (SubLObject)module0607.NIL;
    }
    
    public static SubLObject f37114(final SubLObject var10, final SubLObject var11, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        assert module0607.NIL != module0606.f37086(var10) : var10;
        assert module0607.NIL != module0606.f37086(var11) : var11;
        if (module0607.NIL != var6) {
            assert module0607.NIL != module0004.f105(var6) : var6;
        }
        else {
            var6 = Numbers.max((SubLObject)module0607.ONE_INTEGER, Numbers.min(module0606.f37100(var10), module0606.f37100(var11)));
        }
        final SubLObject var12 = module0048.f3302(var10, var6);
        final SubLObject var13 = module0048.f3302(var11, var6);
        final SubLObject var14 = module0606.f37090(var12);
        final SubLObject var15 = module0606.f37090(var13);
        if (!var14.numE(var15)) {
            return (SubLObject)module0607.NIL;
        }
        final SubLObject var16 = module0606.f37089(var12);
        final SubLObject var17 = module0606.f37089(var13);
        if ((module0607.ZERO_INTEGER.numE(var16) || var6.numGE(module0048.f3301(var16))) && (module0607.ZERO_INTEGER.numE(var17) || var6.numGE(module0048.f3301(var17)))) {
            return Numbers.numE(var16, var17);
        }
        return (SubLObject)module0607.NIL;
    }
    
    public static SubLObject f37115(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        assert module0607.NIL != module0606.f37086(var1) : var1;
        assert module0607.NIL != Types.integerp(var18) : var18;
        if (module0607.NIL != module0606.f37092(var1)) {
            return Numbers.zerop(var18);
        }
        final SubLObject var19 = (module0607.NIL != var6) ? var6 : module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37114(var1, var20, var19);
    }
    
    public static SubLObject f37116(final SubLObject var18, final SubLObject var1, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37115(var1, var18, var6);
    }
    
    public static SubLObject f37117(final SubLObject var10, final SubLObject var11, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        assert module0607.NIL != module0606.f37086(var10) : var10;
        assert module0607.NIL != module0606.f37086(var11) : var11;
        if (module0607.NIL != var6) {
            assert module0607.NIL != module0004.f105(var6) : var6;
        }
        else {
            var6 = Numbers.max((SubLObject)module0607.ONE_INTEGER, Numbers.min(module0606.f37100(var10), module0606.f37100(var11)));
        }
        final SubLObject var12 = module0048.f3302(var10, var6);
        final SubLObject var13 = module0048.f3302(var11, var6);
        final SubLObject var14 = module0606.f37089(var12);
        final SubLObject var15 = module0606.f37090(var12);
        final SubLObject var16 = module0606.f37089(var13);
        final SubLObject var17 = module0606.f37090(var13);
        if ((!module0607.ZERO_INTEGER.numE(var14) && !var6.numLE(module0048.f3301(var14))) || (!module0607.ZERO_INTEGER.numE(var16) && !var6.numLE(module0048.f3301(var16)))) {
            return (SubLObject)module0607.NIL;
        }
        if (module0607.ZERO_INTEGER.numE(var14)) {
            return Numbers.minusp(var16);
        }
        if (module0607.ZERO_INTEGER.numE(var16)) {
            return Numbers.plusp(var14);
        }
        if (var15.numG(var17)) {
            return Numbers.plusp(var14);
        }
        if (var17.numG(var15)) {
            return Numbers.minusp(var16);
        }
        if (var15.numE(var17)) {
            return Numbers.numG(var14, var16);
        }
        return (SubLObject)module0607.NIL;
    }
    
    public static SubLObject f37118(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        assert module0607.NIL != module0606.f37086(var1) : var1;
        assert module0607.NIL != Types.integerp(var18) : var18;
        if (module0607.NIL != module0606.f37092(var1)) {
            return module0004.f108(var18);
        }
        final SubLObject var19 = (module0607.NIL != var6) ? var6 : module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37117(var1, var20, var19);
    }
    
    public static SubLObject f37119(final SubLObject var18, final SubLObject var1, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        assert module0607.NIL != Types.integerp(var18) : var18;
        assert module0607.NIL != module0606.f37086(var1) : var1;
        if (module0607.NIL != module0606.f37092(var1)) {
            return module0004.f105(var18);
        }
        final SubLObject var19 = (module0607.NIL != var6) ? var6 : module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37117(var20, var1, var19);
    }
    
    public static SubLObject f37120(final SubLObject var10, final SubLObject var11, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0607.NIL != f37114(var10, var11, var6) || module0607.NIL != f37117(var10, var11, var6));
    }
    
    public static SubLObject f37121(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0607.NIL != f37115(var1, var18, var6) || module0607.NIL != f37118(var1, var18, var6));
    }
    
    public static SubLObject f37122(final SubLObject var18, final SubLObject var1, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0607.NIL != f37116(var18, var1, var6) || module0607.NIL != f37119(var18, var1, var6));
    }
    
    public static SubLObject f37123(final SubLObject var10, final SubLObject var11, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37117(var11, var10, var6);
    }
    
    public static SubLObject f37124(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37119(var18, var1, var6);
    }
    
    public static SubLObject f37125(final SubLObject var18, final SubLObject var1, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37118(var1, var18, var6);
    }
    
    public static SubLObject f37126(final SubLObject var10, final SubLObject var11, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37120(var10, var11, var6);
    }
    
    public static SubLObject f37127(final SubLObject var1, final SubLObject var18, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37122(var18, var1, var6);
    }
    
    public static SubLObject f37128(final SubLObject var18, final SubLObject var1, SubLObject var6) {
        if (var6 == module0607.UNPROVIDED) {
            var6 = (SubLObject)module0607.NIL;
        }
        return f37121(var1, var18, var6);
    }
    
    public static SubLObject f37129(final SubLObject var10, final SubLObject var11) {
        assert module0607.NIL != module0606.f37086(var10) : var10;
        assert module0607.NIL != module0606.f37086(var11) : var11;
        final SubLObject var12 = module0606.f37089(var10);
        final SubLObject var13 = module0606.f37089(var11);
        if (var12.isZero() || var13.isZero()) {
            return module0606.f37087((SubLObject)module0607.ZERO_INTEGER, (SubLObject)module0607.ZERO_INTEGER);
        }
        final SubLObject var14 = module0606.f37090(var10);
        final SubLObject var15 = module0048.f3301(var12);
        final SubLObject var16 = module0606.f37090(var11);
        final SubLObject var17 = module0048.f3301(var13);
        final SubLObject var18 = Numbers.multiply(var12, var13);
        final SubLObject var19 = module0048.f3301(var18);
        final SubLObject var20 = Numbers.subtract(var19, new SubLObject[] { Numbers.subtract(var15, var14, (SubLObject)module0607.ONE_INTEGER), Numbers.subtract(var17, var16, (SubLObject)module0607.ONE_INTEGER), module0607.ONE_INTEGER });
        final SubLObject var21 = Numbers.min(var15, var17);
        return module0048.f3302(module0606.f37087(var18, var20), var21);
    }
    
    public static SubLObject f37130(final SubLObject var1, final SubLObject var18) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        assert module0607.NIL != Types.integerp(var18) : var18;
        if (module0607.NIL != module0606.f37092(var1) || var18.isZero()) {
            return module0606.f37087((SubLObject)module0607.ZERO_INTEGER, (SubLObject)module0607.ZERO_INTEGER);
        }
        final SubLObject var19 = module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37129(var1, var20);
    }
    
    public static SubLObject f37131(final SubLObject var18, final SubLObject var1) {
        return f37130(var1, var18);
    }
    
    public static SubLObject f37132(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        if (module0607.NIL != module0606.f37092(var1)) {
            module0229.f15259();
        }
        final SubLObject var2 = module0606.f37100(var1);
        final SubLObject var3 = module0606.f37105(var1);
        return module0606.f37104(Numbers.divide((SubLObject)module0607.ONE_INTEGER, var3), var2);
    }
    
    public static SubLObject f37133(final SubLObject var10, final SubLObject var11) {
        return f37129(var10, f37132(var11));
    }
    
    public static SubLObject f37134(final SubLObject var1, final SubLObject var18) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        assert module0607.NIL != Types.integerp(var18) : var18;
        if (var18.isZero()) {
            module0229.f15259();
        }
        if (module0607.NIL != module0606.f37092(var1)) {
            return module0606.f37087((SubLObject)module0607.ZERO_INTEGER, (SubLObject)module0607.ZERO_INTEGER);
        }
        final SubLObject var19 = module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37133(var1, var20);
    }
    
    public static SubLObject f37135(final SubLObject var18, final SubLObject var1) {
        assert module0607.NIL != Types.integerp(var18) : var18;
        assert module0607.NIL != module0606.f37086(var1) : var1;
        if (module0607.NIL != module0606.f37092(var1)) {
            module0229.f15259();
        }
        if (var18.isZero()) {
            return module0606.f37087((SubLObject)module0607.ZERO_INTEGER, (SubLObject)module0607.ZERO_INTEGER);
        }
        final SubLObject var19 = module0606.f37100(var1);
        final SubLObject var20 = module0606.f37088(var18, var19);
        return f37133(var20, var1);
    }
    
    public static SubLObject f37136(final SubLObject var10, final SubLObject var11) {
        assert module0607.NIL != module0606.f37086(var10) : var10;
        assert module0607.NIL != module0606.f37086(var11) : var11;
        if (module0607.NIL != module0606.f37092(var10)) {
            return module0606.f37091(var11);
        }
        if (module0607.NIL != module0606.f37092(var11)) {
            return module0606.f37091(var10);
        }
        final SubLObject var12 = module0606.f37090(var10);
        final SubLObject var13 = module0606.f37090(var11);
        SubLObject var14 = (SubLObject)module0607.NIL;
        if (var12.numE(var13)) {
            var14 = f37137(var10, var11, var12);
        }
        else if (var12.numG(var13)) {
            var14 = f37138(var10, var12, var11, var13);
        }
        else if (var12.numL(var13)) {
            var14 = f37138(var11, var13, var10, var12);
        }
        if (module0607.NIL != module0606.f37092(var14)) {
            return module0606.f37087((SubLObject)module0607.ZERO_INTEGER, (SubLObject)module0607.ZERO_INTEGER);
        }
        return var14;
    }
    
    public static SubLObject f37137(final SubLObject var10, final SubLObject var11, final SubLObject var3) {
        final SubLObject var12 = module0606.f37100(var10);
        final SubLObject var13 = module0606.f37100(var11);
        final SubLObject var14 = Numbers.min(var12, var13);
        final SubLObject var15 = module0048.f3302(var10, var14);
        final SubLObject var16 = module0048.f3302(var11, var14);
        final SubLObject var17 = module0606.f37089(var15);
        final SubLObject var18 = module0606.f37089(var16);
        final SubLObject var19 = Numbers.add(var17, var18);
        final SubLObject var20 = module0048.f3301(var19);
        final SubLObject var21 = Numbers.subtract(var20, var14);
        final SubLObject var22 = Numbers.add(var3, var21);
        return module0606.f37087(var19, var22);
    }
    
    public static SubLObject f37138(final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38) {
        final SubLObject var39 = Numbers.subtract(var36, var38);
        final SubLObject var40 = module0606.f37089(var35);
        final SubLObject var41 = Numbers.multiply((SubLObject)module0607.TEN_INTEGER, var40);
        final SubLObject var42 = module0606.f37087(var41, var36);
        final SubLObject var43 = module0606.f37100(var42);
        final SubLObject var44 = module0606.f37100(var37);
        if (var39.numGE(var43)) {
            return module0606.f37091(var35);
        }
        final SubLObject var45 = Numbers.min(var43, Numbers.add(var39, var44));
        final SubLObject var46 = module0048.f3302(var42, var45);
        final SubLObject var47 = module0048.f3302(var37, Numbers.subtract(var45, var39));
        final SubLObject var48 = module0606.f37089(var46);
        final SubLObject var49 = module0606.f37089(var47);
        final SubLObject var50 = Numbers.add(var48, var49);
        final SubLObject var51 = Numbers.min(Numbers.subtract(var43, (SubLObject)module0607.ONE_INTEGER), Numbers.add(var44, var39));
        final SubLObject var52 = module0048.f3301(var50);
        final SubLObject var53 = Numbers.subtract(var52, var45);
        final SubLObject var54 = Numbers.add(var36, var53);
        final SubLObject var55 = Numbers.add(var51, var53);
        final SubLObject var56 = var55.numG((SubLObject)module0607.ZERO_INTEGER) ? module0606.f37087(var50, var54) : module0606.f37087(module0048.f3302(Numbers.integerDivide(var50, (SubLObject)module0607.TEN_INTEGER), (SubLObject)module0607.ONE_INTEGER), Numbers.add(var54, (SubLObject)module0607.ONE_INTEGER));
        final SubLObject var57 = (SubLObject)(var55.numG((SubLObject)module0607.ZERO_INTEGER) ? var55 : module0607.ONE_INTEGER);
        return module0048.f3302(var56, var57);
    }
    
    public static SubLObject f37139(final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = module0606.f37089(var11);
        final SubLObject var13 = module0606.f37090(var11);
        final SubLObject var14 = module0606.f37087(Numbers.minus(var12), var13);
        return f37136(var10, var14);
    }
    
    public static SubLObject f37140(final SubLObject var1, SubLObject var53) {
        if (var53 == module0607.UNPROVIDED) {
            var53 = module0607.$g4701$.getGlobalValue();
        }
        assert module0607.NIL != module0608.f37152(var53) : var53;
        assert module0607.NIL != module0606.f37086(var1) : var1;
        if (var53.numE((SubLObject)module0607.TEN_INTEGER)) {
            return f37141(var1);
        }
        final SubLObject var54 = module0606.f37100(var1);
        final SubLObject var55 = module0606.f37105(var1);
        final SubLObject var56 = Numbers.log(var55, var53);
        return module0606.f37104(var56, var54);
    }
    
    public static SubLObject f37141(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37089(var1);
        final SubLObject var3 = module0606.f37090(var1);
        final SubLObject var4 = module0048.f3301(var3);
        final SubLObject var5 = module0606.f37100(var1);
        final SubLObject var6 = Numbers.log(Numbers.divide(var2, Numbers.expt((SubLObject)module0607.TEN_INTEGER, Numbers.subtract(var5, (SubLObject)module0607.ONE_INTEGER))), (SubLObject)module0607.TEN_INTEGER);
        final SubLObject var7 = Numbers.add(var3, var6);
        final SubLObject var8 = Numbers.add(var5, var4);
        return module0606.f37104(var7, var8);
    }
    
    public static SubLObject f37142(final SubLObject var1, final SubLObject var53) {
        return f37143(var53, var1);
    }
    
    public static SubLObject f37144(final SubLObject var1) {
        return f37143((SubLObject)module0607.TEN_INTEGER, var1);
    }
    
    public static SubLObject f37145(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37100(var1);
        final SubLObject var3 = module0606.f37105(var1);
        final SubLObject var4 = Numbers.expt(var3, (SubLObject)module0607.$ic5$);
        return module0606.f37104(var4, var2);
    }
    
    public static SubLObject f37146(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37100(var1);
        final SubLObject var3 = module0606.f37090(var1);
        final SubLObject var4 = module0606.f37105(var1);
        final SubLObject var5 = Numbers.expt((SubLObject)module0607.TEN_INTEGER, var4);
        final SubLObject var6 = Numbers.max(Numbers.subtract(var2, var3, (SubLObject)module0607.ONE_INTEGER), (SubLObject)module0607.ONE_INTEGER);
        return module0606.f37104(var5, var6);
    }
    
    public static SubLObject f37143(final SubLObject var53, final SubLObject var1) {
        assert module0607.NIL != module0608.f37152(var53) : var53;
        assert module0607.NIL != module0606.f37086(var1) : var1;
        if (var53.numE((SubLObject)module0607.TEN_INTEGER)) {
            return f37146(var1);
        }
        final SubLObject var54 = (module0607.NIL != module0606.f37086(var53)) ? module0606.f37105(var53) : var53;
        final SubLObject var55 = module0606.f37100(var1);
        final SubLObject var56 = module0606.f37105(var1);
        final SubLObject var57 = Numbers.expt(var54, var56);
        return module0606.f37104(var57, var55);
    }
    
    public static SubLObject f37147(final SubLObject var1) {
        assert module0607.NIL != module0606.f37086(var1) : var1;
        final SubLObject var2 = module0606.f37100(var1);
        final SubLObject var3 = module0606.f37105(var1);
        final SubLObject var4 = Numbers.exp(var3);
        return module0606.f37104(var4, var2);
    }
    
    public static SubLObject f37148() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37109", "S#40919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37110", "S#40920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37111", "S#40921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37112", "S#4667", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37113", "S#40922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37114", "S#40923", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37115", "S#40924", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37116", "S#40925", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37117", "S#40926", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37118", "S#40927", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37119", "S#40928", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37120", "S#40929", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37121", "S#40930", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37122", "S#40931", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37123", "S#40932", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37124", "S#40933", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37125", "S#40934", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37126", "S#40935", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37127", "S#40936", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37128", "S#40937", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37129", "S#40938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37130", "S#40939", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37131", "S#40940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37132", "S#40941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37133", "S#40942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37134", "S#40943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37135", "S#40944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37136", "S#40945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37137", "S#40946", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37138", "S#40947", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37139", "S#40948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37140", "S#40949", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37141", "S#40950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37142", "S#40951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37144", "S#40952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37145", "S#40953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37146", "S#40954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37143", "S#40955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0607", "f37147", "S#40956", 1, 0, false);
        return (SubLObject)module0607.NIL;
    }
    
    public static SubLObject f37149() {
        module0607.$g4701$ = SubLFiles.defconstant("S#40957", (SubLObject)module0607.$ic3$);
        return (SubLObject)module0607.NIL;
    }
    
    public static SubLObject f37150() {
        return (SubLObject)module0607.NIL;
    }
    
    public void declareFunctions() {
        f37148();
    }
    
    public void initializeVariables() {
        f37149();
    }
    
    public void runTopLevelForms() {
        f37150();
    }
    
    static {
        me = (SubLFile)new module0607();
        module0607.$g4701$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#4666", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic2$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScientificNumberFn")), (SubLObject)SubLObjectFactory.makeInteger("2718281828459045"), (SubLObject)module0607.ZERO_INTEGER);
        $ic4$ = SubLObjectFactory.makeSymbol("S#4668", "CYC");
        $ic5$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0607.class
	Total time: 115 ms
	
	Decompiled with Procyon 0.5.32.
*/