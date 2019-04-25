package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0412 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0412";
    public static final String myFingerPrint = "a937d3f3a678b99c44eb5e97092941bcc13cf8cba0ea54b5b9c8654d2fd1736a";
    private static SubLSymbol $g3326$;
    private static SubLSymbol $g3327$;
    private static SubLSymbol $g3328$;
    private static SubLSymbol $g3329$;
    private static SubLSymbol $g3330$;
    private static SubLSymbol $g3331$;
    private static SubLSymbol $g3332$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLFloat $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLFloat $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
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
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    
    public static SubLObject f28668(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0412.NIL;
        final SubLObject var4 = module0408.f28406(var1);
        SubLObject var5 = module0360.f23785();
        SubLObject var6 = (SubLObject)module0412.NIL;
        var6 = var5.first();
        while (module0412.NIL != var5) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0360.f23985(var6);
            final SubLObject var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var9 = conses_high.getf(var4, var6, (SubLObject)module0412.$ic0$);
            if (var9 != module0412.$ic0$) {
                var3 = conses_high.putf(var3, var6, var9);
            }
            else if (module0412.NIL != var8) {
                var3 = conses_high.putf(var3, var6, var7);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var3;
    }
    
    public static SubLObject f28669(final SubLObject var1, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0412.NIL;
        final SubLObject var13 = module0408.f28406(var1);
        SubLObject var14 = module0360.f23785();
        SubLObject var15 = (SubLObject)module0412.NIL;
        var15 = var14.first();
        while (module0412.NIL != var14) {
            var11.resetMultipleValues();
            SubLObject var16 = module0683.f41877(var15);
            SubLObject var17 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0412.$ic1$ == var15) {
                var11.resetMultipleValues();
                final SubLObject var18 = module0279.f18578(var10, module0412.$ic2$);
                final SubLObject var19 = var11.secondMultipleValue();
                var11.resetMultipleValues();
                if (module0412.NIL != module0202.f12597(var18)) {
                    var16 = (SubLObject)module0412.T;
                    var17 = (SubLObject)module0412.T;
                }
            }
            final SubLObject var20 = conses_high.getf(var13, var15, (SubLObject)module0412.$ic0$);
            if (var20 != module0412.$ic0$) {
                var12 = conses_high.putf(var12, var15, var20);
            }
            else if (module0412.NIL != var17) {
                var12 = conses_high.putf(var12, var15, var16);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var12;
    }
    
    public static SubLObject f28670(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0412.NIL;
        final SubLObject var3 = module0408.f28407(var1);
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var4 = (SubLObject)module0412.NIL, var4 = var3; module0412.NIL != var4; var4 = conses_high.cddr(var4)) {
            var5 = var4.first();
            var6 = conses_high.cadr(var4);
            if (!var6.equal(module0360.f23985(var5))) {
                var2 = conses_high.putf(var2, var5, var6);
            }
        }
        return var2;
    }
    
    public static SubLObject f28671(SubLObject var17, SubLObject var18) {
        assert module0412.NIL != module0360.f23784(var17) : var17;
        assert module0412.NIL != module0360.f23784(var18) : var18;
        final SubLObject var19 = module0360.f23984(var17, (SubLObject)module0412.$ic4$);
        final SubLObject var20 = module0360.f23984(var18, (SubLObject)module0412.$ic4$);
        if (!SubLObjectFactory.makeBoolean(var19 != module0412.$ic5$).eql((SubLObject)SubLObjectFactory.makeBoolean(var20 != module0412.$ic5$))) {
            var17 = module0408.f28406(var17);
            var18 = module0408.f28406(var18);
        }
        final SubLObject var21 = f28672(var17, var18);
        SubLObject var22 = (SubLObject)module0412.NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0412.NIL;
        var24 = var23.first();
        while (module0412.NIL != var23) {
            final SubLObject var25 = module0360.f23984(var17, var24);
            final SubLObject var26 = module0360.f23984(var18, var24);
            final SubLObject var27 = f28673(var24, var25, var26);
            var22 = conses_high.putf(var22, var24, var27);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var22 = module0035.f2343(var22, module0360.f23785(), (SubLObject)module0412.UNPROVIDED);
        return var22;
    }
    
    public static SubLObject f28672(final SubLObject var27, final SubLObject var28) {
        return conses_high.nunion(module0035.f2353(var27), module0035.f2353(var28), (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28673(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        if (module0412.NIL != f28674(var23)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0412.NIL != var24 || module0412.NIL != var25);
        }
        return (module0412.NIL != f28675(var23, var24, var25)) ? var24 : var25;
    }
    
    public static SubLObject f28676(final SubLObject var29) {
        return module0004.f104(var29, module0412.$g3326$.getGlobalValue(), (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28677() {
        return conses_high.copy_list(module0412.$g3326$.getGlobalValue());
    }
    
    public static SubLObject f28674(final SubLObject var23) {
        return module0035.f2169(var23, module0412.$g3327$.getGlobalValue());
    }
    
    public static SubLObject f28678(final SubLObject var29) {
        return module0004.f104(var29, module0412.$g3328$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0412.EQ), Symbols.symbol_function((SubLObject)module0412.$ic9$));
    }
    
    public static SubLObject f28679() {
        return conses_high.copy_alist(module0412.$g3328$.getGlobalValue());
    }
    
    public static SubLObject f28680() {
        return conses_high.copy_list(module0412.$g3329$.getGlobalValue());
    }
    
    public static SubLObject f28681(final SubLObject var29) {
        return module0035.f2169(var29, module0412.$g3329$.getGlobalValue());
    }
    
    public static SubLObject f28682(final SubLObject var30) {
        if (module0412.NIL != module0035.f2169(var30, module0412.$g3330$.getGlobalValue())) {
            return module0048.f3326();
        }
        return (SubLObject)module0412.NIL;
    }
    
    public static SubLObject f28683(final SubLObject var23, SubLObject var24, SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (module0412.NIL != module0035.f2169(var23, module0412.$g3329$.getGlobalValue())) {
            if (module0412.NIL == var24) {
                var24 = module0048.f3326();
            }
            if (module0412.NIL == var25) {
                var25 = module0048.f3326();
            }
            return module0048.f3333(var24, var25);
        }
        final SubLObject var27 = module0035.f2293(module0412.$g3328$.getGlobalValue(), var23, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
        if (module0412.NIL != var27) {
            final SubLObject var28 = Sequences.position(var24, var27, Symbols.symbol_function((SubLObject)module0412.EQ), (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
            final SubLObject var29 = Sequences.position(var25, var27, Symbols.symbol_function((SubLObject)module0412.EQ), (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
            if (module0412.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && module0412.NIL == var28) {
                Errors.error((SubLObject)module0412.$ic12$, var23, var24);
            }
            if (module0412.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && module0412.NIL == var29) {
                Errors.error((SubLObject)module0412.$ic12$, var23, var25);
            }
            return Numbers.numL(var28, var29);
        }
        return (SubLObject)module0412.NIL;
    }
    
    public static SubLObject f28684(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return f28683(var23, var25, var24);
    }
    
    public static SubLObject f28685(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var24.equal(var25) || module0412.NIL != f28683(var23, var24, var25));
    }
    
    public static SubLObject f28675(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var24.equal(var25) || module0412.NIL != f28684(var23, var24, var25));
    }
    
    public static SubLObject f28686(final SubLObject var23) {
        if (module0412.NIL != f28678(var23)) {
            final SubLObject var24 = module0035.f2293(module0412.$g3328$.getGlobalValue(), var23, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
            return var24.first();
        }
        if (module0412.NIL != f28681(var23)) {
            return (SubLObject)module0412.ZERO_INTEGER;
        }
        return Errors.error((SubLObject)module0412.$ic13$, var23);
    }
    
    public static SubLObject f28687(final SubLObject var23, final SubLObject var16) {
        return Equality.equal(var16, f28686(var23));
    }
    
    public static SubLObject f28688(final SubLObject var23) {
        if (module0412.NIL != f28678(var23)) {
            final SubLObject var24 = module0035.f2293(module0412.$g3328$.getGlobalValue(), var23, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
            return module0035.f2114(var24);
        }
        if (module0412.NIL != f28681(var23)) {
            return f28682(var23);
        }
        return Errors.error((SubLObject)module0412.$ic13$, var23);
    }
    
    public static SubLObject f28689(final SubLObject var23, final SubLObject var16) {
        return Equality.equal(var16, f28688(var23));
    }
    
    public static SubLObject f28690(final SubLObject var35, final SubLObject var1) {
        assert module0412.NIL != module0361.f24009(var35) : var35;
        final SubLObject var36 = module0360.f23860(var1);
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var37 = (SubLObject)module0412.NIL, var37 = var36; module0412.NIL != var37; var37 = conses_high.cddr(var37)) {
            var38 = var37.first();
            var39 = conses_high.cadr(var37);
            if (module0412.NIL == f28691(var35, var38, var39)) {
                return (SubLObject)module0412.NIL;
            }
        }
        return (SubLObject)module0412.T;
    }
    
    public static SubLObject f28691(final SubLObject var35, final SubLObject var6, final SubLObject var16) {
        if (module0412.NIL != module0360.f23790(var6)) {
            final SubLObject var36 = module0411.f28573(var35, var6, (SubLObject)module0412.$ic15$);
            if (module0412.$ic15$ != var36 && !var36.equal(var16)) {
                if (module0412.NIL != f28674(var6)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(module0412.NIL == var16 || module0412.NIL != var36);
                }
                if (module0412.NIL != f28678(var6)) {
                    return f28675(var6, var36, var16);
                }
            }
        }
        return (SubLObject)module0412.T;
    }
    
    public static SubLObject f28692(final SubLObject var38) {
        final SubLObject var39 = f28693(var38);
        if (module0412.NIL == var39) {
            return (SubLObject)module0412.$ic16$;
        }
        SubLObject var41;
        final SubLObject var40 = var41 = var39;
        SubLObject var42 = (SubLObject)module0412.NIL;
        SubLObject var43 = (SubLObject)module0412.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0412.$ic17$);
        var42 = var41.first();
        var41 = (var43 = var41.rest());
        SubLObject var45;
        final SubLObject var44 = var45 = conses_high.remf(var42, (SubLObject)module0412.$ic18$);
        SubLObject var46 = var43;
        SubLObject var47 = (SubLObject)module0412.NIL;
        var47 = var46.first();
        while (module0412.NIL != var46) {
            final SubLObject var48 = conses_high.remf(var47, (SubLObject)module0412.$ic18$);
            var45 = f28671(var45, var48);
            var46 = var46.rest();
            var47 = var46.first();
        }
        final SubLObject var49 = oc_inference_datastructures_inference.f25421(var38);
        final SubLObject var50 = module0361.f24229(var49);
        SubLObject var51 = oc_inference_datastructures_inference.f25626(var38);
        final SubLObject var52 = oc_inference_datastructures_inference.f25627(var38);
        var51 = Numbers.ceiling(var51, (SubLObject)module0412.UNPROVIDED);
        var45 = conses_high.putf(var45, (SubLObject)module0412.$ic19$, var50);
        var45 = conses_high.putf(var45, (SubLObject)module0412.$ic20$, var51);
        var45 = conses_high.putf(var45, (SubLObject)module0412.$ic21$, var52);
        var45 = conses_high.putf(var45, (SubLObject)module0412.$ic22$, (SubLObject)module0412.$ic23$);
        return var45;
    }
    
    public static SubLObject f28694(final SubLObject var38) {
        return f28695(f28693(var38));
    }
    
    public static SubLObject f28696(final SubLObject var38) {
        return f28697(var38, (SubLObject)module0412.T);
    }
    
    public static SubLObject f28693(final SubLObject var38) {
        return f28697(var38, (SubLObject)module0412.NIL);
    }
    
    public static SubLObject f28698(final SubLObject var51) {
        return f28699(var51, (SubLObject)module0412.T);
    }
    
    public static SubLObject f28695(final SubLObject var51) {
        return f28699(var51, (SubLObject)module0412.NIL);
    }
    
    public static SubLObject f28699(final SubLObject var51, final SubLObject var52) {
        SubLObject var53 = (SubLObject)module0412.NIL;
        SubLObject var54 = (SubLObject)module0412.ZERO_INTEGER;
        SubLObject var55 = (SubLObject)module0412.ZERO_INTEGER;
        SubLObject var56 = (SubLObject)module0412.NIL;
        SubLObject var57 = (SubLObject)module0412.NIL;
        SubLObject var58 = conses_high.copy_tree(var51);
        SubLObject var59 = (SubLObject)module0412.NIL;
        var59 = var58.first();
        while (module0412.NIL != var58) {
            var56 = conses_high.getf(var59, (SubLObject)module0412.$ic20$, (SubLObject)module0412.ZERO_INTEGER);
            var57 = conses_high.getf(var59, (SubLObject)module0412.$ic21$, (SubLObject)module0412.ZERO_INTEGER);
            conses_high.remf(var59, (SubLObject)module0412.$ic20$);
            conses_high.remf(var59, (SubLObject)module0412.$ic21$);
            if (var56.numG(var54)) {
                var54 = var56;
            }
            if (var57.numG(var55)) {
                var55 = var57;
            }
            var53 = ((module0412.NIL != var52) ? f28700(var53, var59) : f28701(var53, var59));
            var58 = var58.rest();
            var59 = var58.first();
        }
        conses_high.putf(var53, (SubLObject)module0412.$ic20$, var54);
        conses_high.putf(var53, (SubLObject)module0412.$ic21$, var55);
        return conses_high.remf(conses_high.copy_list(var53), (SubLObject)module0412.$ic18$);
    }
    
    public static SubLObject f28697(final SubLObject var38, final SubLObject var57) {
        SubLObject var58 = (SubLObject)module0412.NIL;
        final SubLObject var59 = oc_inference_datastructures_inference.f25492(var38);
        if (module0412.NIL == module0065.f4772(var59, (SubLObject)module0412.$ic24$)) {
            final SubLObject var60_61 = var59;
            if (module0412.NIL == module0065.f4775(var60_61, (SubLObject)module0412.$ic24$)) {
                final SubLObject var60 = module0065.f4740(var60_61);
                final SubLObject var61 = (SubLObject)module0412.NIL;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var66;
                for (var62 = Sequences.length(var60), var63 = (SubLObject)module0412.NIL, var63 = (SubLObject)module0412.ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)module0412.ONE_INTEGER)) {
                    var64 = ((module0412.NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)module0412.ONE_INTEGER) : var63);
                    var65 = Vectors.aref(var60, var64);
                    if (module0412.NIL == module0065.f4749(var65) || module0412.NIL == module0065.f4773((SubLObject)module0412.$ic24$)) {
                        if (module0412.NIL != module0065.f4749(var65)) {
                            var65 = (SubLObject)module0412.$ic24$;
                        }
                        var66 = f28702(var65, var38, var57);
                        if (module0412.NIL != var57) {
                            var58 = ConsesLow.nconc(var66, var58);
                        }
                        else {
                            var58 = (SubLObject)ConsesLow.cons(var66, var58);
                        }
                    }
                }
            }
            final SubLObject var69_70 = var59;
            if (module0412.NIL == module0065.f4777(var69_70)) {
                final SubLObject var67 = module0065.f4738(var69_70);
                SubLObject var68 = (SubLObject)module0412.NIL;
                SubLObject var69 = (SubLObject)module0412.NIL;
                final Iterator var70 = Hashtables.getEntrySetIterator(var67);
                try {
                    while (Hashtables.iteratorHasNext(var70)) {
                        final Map.Entry var71 = Hashtables.iteratorNextEntry(var70);
                        var68 = Hashtables.getEntryKey(var71);
                        var69 = Hashtables.getEntryValue(var71);
                        final SubLObject var72 = f28702(var69, var38, var57);
                        if (module0412.NIL != var57) {
                            var58 = ConsesLow.nconc(var72, var58);
                        }
                        else {
                            var58 = (SubLObject)ConsesLow.cons(var72, var58);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var70);
                }
            }
        }
        return Sequences.nreverse(var58);
    }
    
    public static SubLObject f28702(final SubLObject var67, final SubLObject var38, final SubLObject var57) {
        final SubLObject var68 = f28703(var67, var38);
        final SubLObject var69 = f28704(var68, var67);
        if (module0412.NIL == var57) {
            return var69;
        }
        return f28705(var69, var68);
    }
    
    public static SubLObject f28704(final SubLObject var74, final SubLObject var67) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = f28706(var74);
        final SubLObject var77 = oc_inference_datastructures_inference.f25748(var67);
        SubLObject var78 = (SubLObject)module0412.NIL;
        SubLObject var79 = (SubLObject)module0412.NIL;
        if (module0412.NIL != module0361.f24321(var77)) {
            var78 = module0361.f24148(var77);
            SubLObject var80;
            for (var80 = module0066.f4838(module0067.f4891(var78)); module0412.NIL == var79 && module0412.NIL == module0066.f4841(var80); var80 = module0066.f4840(var80)) {
                var75.resetMultipleValues();
                final SubLObject var81 = module0066.f4839(var80);
                final SubLObject var82 = var75.secondMultipleValue();
                var75.resetMultipleValues();
                if (var82 == module0412.$ic25$) {
                    var76 = conses_high.putf(var76, (SubLObject)module0412.$ic26$, module0361.f24160(var77));
                    var79 = (SubLObject)module0412.T;
                }
            }
            module0066.f4842(var80);
        }
        var76 = conses_high.putf(var76, (SubLObject)module0412.$ic27$, Numbers.add((SubLObject)module0412.ONE_INTEGER, oc_inference_datastructures_inference.f25629(var67)));
        final SubLObject var83 = Numbers.add((SubLObject)module0412.ONE_INTEGER, Numbers.multiply((SubLObject)module0412.$ic28$, oc_inference_datastructures_inference.f25623(var67, (SubLObject)module0412.NIL)));
        final SubLObject var84 = oc_inference_datastructures_inference.f25649(var83);
        var76 = conses_high.putf(var76, (SubLObject)module0412.$ic20$, var83);
        if (module0412.NIL != var84) {
            var76 = conses_high.putf(var76, (SubLObject)module0412.$ic22$, var84);
        }
        final SubLObject var85 = oc_inference_datastructures_inference.f25625(var67);
        var76 = conses_high.putf(var76, (SubLObject)module0412.$ic21$, var85);
        final SubLObject var86 = oc_inference_datastructures_inference.f25687(var67);
        if (module0412.NIL != module0408.f28482(var86)) {
            var76 = conses_high.putf(var76, (SubLObject)module0412.$ic29$, (SubLObject)module0412.T);
        }
        if (module0412.NIL != module0408.f28484(var86)) {
            var76 = conses_high.putf(var76, (SubLObject)module0412.$ic30$, (SubLObject)module0412.$ic31$);
        }
        else {
            var76 = conses_high.putf(var76, (SubLObject)module0412.$ic30$, (SubLObject)module0412.$ic32$);
        }
        var76 = conses_high.putf(var76, (SubLObject)module0412.$ic18$, var86);
        return var76;
    }
    
    public static SubLObject f28705(final SubLObject var68, final SubLObject var74) {
        SubLObject var75 = (SubLObject)module0412.NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)module0412.NIL;
        var77 = var76.first();
        while (module0412.NIL != var76) {
            var77 = conses_high.copy_list(var77);
            SubLObject var5_86 = module0412.$g3331$.getGlobalValue();
            SubLObject var78 = (SubLObject)module0412.NIL;
            var78 = var5_86.first();
            while (module0412.NIL != var5_86) {
                final SubLObject var79 = conses_high.getf(var68, var78, (SubLObject)module0412.UNPROVIDED);
                var77 = conses_high.putf(var77, var78, var79);
                var5_86 = var5_86.rest();
                var78 = var5_86.first();
            }
            var75 = (SubLObject)ConsesLow.cons(var77, var75);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return Sequences.nreverse(var75);
    }
    
    public static SubLObject f28703(final SubLObject var67, final SubLObject var38) {
        SubLObject var68 = (SubLObject)module0412.NIL;
        SubLObject var69 = oc_inference_datastructures_inference.f25744(var67);
        SubLObject var70 = (SubLObject)module0412.NIL;
        var70 = var69.first();
        while (module0412.NIL != var69) {
            SubLObject var5_89 = oc_inference_datastructures_inference.f25785(var70);
            SubLObject var71 = (SubLObject)module0412.NIL;
            var71 = var5_89.first();
            while (module0412.NIL != var5_89) {
                final SubLObject var72 = f28707(var71, f28708(), var38);
                var68 = (SubLObject)ConsesLow.cons(var72, var68);
                var5_89 = var5_89.rest();
                var71 = var5_89.first();
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f28707(final SubLObject var78, SubLObject var56, final SubLObject var38) {
        final SubLObject var79 = module0035.f2399(module0366.f24966(var78), Symbols.symbol_function((SubLObject)module0412.$ic34$), (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
        final SubLObject var80 = module0366.f24937(var78);
        SubLObject var81 = (SubLObject)module0412.NIL;
        SubLObject var82 = (SubLObject)module0412.NIL;
        SubLObject var83 = (SubLObject)module0412.NIL;
        SubLObject var84 = (SubLObject)module0412.NIL;
        if (module0412.NIL != module0373.f26175(var80)) {
            var81 = module0373.f26179(var80);
        }
        else if (module0412.NIL != module0373.f26150(var80)) {
            var81 = module0373.f26152(var80);
        }
        var82 = (SubLObject)((module0412.NIL != var81) ? module0365.f24850(var81) : module0412.NIL);
        var83 = (SubLObject)((module0412.NIL != var81) ? module0365.f24865(var81) : module0412.NIL);
        var84 = (SubLObject)((module0412.NIL != var83) ? module0340.f22825(var83) : module0412.NIL);
        if (module0412.NIL != var82) {
            final SubLObject var85 = conses_high.getf(var56, (SubLObject)module0412.$ic19$, (SubLObject)module0412.UNPROVIDED);
            final SubLObject var86 = Numbers.add((SubLObject)module0412.TWO_INTEGER, module0363.f24508(var82));
            if (var86.numG(var85)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic19$, var86);
            }
        }
        if (module0412.NIL != var81) {
            final SubLObject var87 = conses_high.getf(var56, (SubLObject)module0412.$ic35$, (SubLObject)module0412.UNPROVIDED);
            final SubLObject var88 = module0365.f24870(var81);
            if (module0412.NIL != module0035.f2406(var88, var87)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic35$, var88);
            }
            if (module0412.NIL != var82 && module0412.NIL != var83 && module0412.NIL != module0377.f26771(var81)) {
                SubLObject var89 = module0363.f24517(var82);
                SubLObject var90 = (SubLObject)module0412.NIL;
                var90 = var89.first();
                while (module0412.NIL != var89) {
                    if (module0412.NIL != module0363.f24522(var90, var83) && module0412.NIL != module0377.f26771(var90) && module0412.NIL == module0377.f26772(var90)) {
                        final SubLObject var91 = conses_high.getf(var56, (SubLObject)module0412.$ic35$, (SubLObject)module0412.UNPROVIDED);
                        final SubLObject var92 = module0365.f24870(var90);
                        if (var92.numG(var91)) {
                            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic35$, var92);
                        }
                    }
                    var89 = var89.rest();
                    var90 = var89.first();
                }
            }
        }
        final SubLObject var93 = module0377.f26746(var80);
        if (module0412.NIL != var93 || module0412.NIL != module0378.f26860(var80)) {
            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic36$, Numbers.add(module0373.f26359(var80, var38), conses_high.getf(var56, (SubLObject)module0412.$ic36$, (SubLObject)module0412.UNPROVIDED)));
            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic37$, (SubLObject)module0412.T);
        }
        if (module0412.NIL != var93 && module0412.NIL != var82 && module0412.NIL != module0384.f27335(var82)) {
            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic38$, (SubLObject)module0412.T);
        }
        if (module0412.NIL != module0379.f26926(var80)) {
            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic39$, (SubLObject)module0412.T);
        }
        if (module0412.NIL != var83) {
            if (module0412.NIL != module0450.f31010(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic40$, (SubLObject)module0412.T);
            }
            if (module0412.NIL != module0525.f32786(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic41$, (SubLObject)module0412.T);
            }
            if (module0412.NIL != module0525.f32803(var84) && (module0412.$ic42$ != var84 || module0412.NIL == module0384.f27335(var82) || module0412.NIL == module0384.f27336(var82))) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic43$, (SubLObject)module0412.T);
            }
            if (module0412.NIL != module0450.f31010(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic40$, (SubLObject)module0412.T);
            }
            if (module0412.$ic44$ == var84) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic45$, oc_inference_datastructures_inference.f25513(var38));
            }
            if (module0412.NIL != module0435.f30632(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic46$, (SubLObject)module0412.T);
            }
            if (module0412.NIL != module0435.f30631(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)module0412.$ic47$, (SubLObject)module0412.T);
            }
            SubLObject var89 = var79;
            SubLObject var94 = (SubLObject)module0412.NIL;
            var94 = var89.first();
            while (module0412.NIL != var89) {
                final SubLObject var95 = module0191.f11966(var94);
                if (var95 == module0412.$ic48$ && module0412.NIL != module0435.f30629(var84)) {
                    var56 = conses_high.putf(var56, (SubLObject)module0412.$ic49$, (SubLObject)module0412.T);
                }
                if (var95 == module0412.$ic50$) {
                    var56 = conses_high.putf(var56, (SubLObject)module0412.$ic51$, (SubLObject)module0412.T);
                }
                if (module0412.NIL != module0435.f30630(var84, var95)) {
                    var56 = conses_high.putf(var56, (SubLObject)module0412.$ic52$, (SubLObject)module0412.T);
                }
                var89 = var89.rest();
                var94 = var89.first();
            }
        }
        final SubLObject var96 = module0773.f49607(var78);
        if (var96.numG(conses_high.getf(var56, (SubLObject)module0412.$ic53$, (SubLObject)module0412.UNPROVIDED))) {
            var56 = conses_high.putf(var56, (SubLObject)module0412.$ic53$, var96);
        }
        SubLObject var97 = module0366.f24938(var78);
        SubLObject var98 = (SubLObject)module0412.NIL;
        var98 = var97.first();
        while (module0412.NIL != var97) {
            var56 = f28707(var98, var56, var38);
            var97 = var97.rest();
            var98 = var97.first();
        }
        return var56;
    }
    
    public static SubLObject f28708() {
        SubLObject var85 = (SubLObject)module0412.NIL;
        SubLObject var86 = f28680();
        SubLObject var87 = (SubLObject)module0412.NIL;
        var87 = var86.first();
        while (module0412.NIL != var86) {
            var85 = conses_high.putf(var85, var87, (SubLObject)module0412.ZERO_INTEGER);
            var86 = var86.rest();
            var87 = var86.first();
        }
        var85 = conses_high.putf(var85, (SubLObject)module0412.$ic22$, (SubLObject)module0412.ONE_INTEGER);
        var86 = f28679();
        SubLObject var88 = (SubLObject)module0412.NIL;
        var88 = var86.first();
        while (module0412.NIL != var86) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)module0412.NIL;
            SubLObject var92 = (SubLObject)module0412.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)module0412.$ic54$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            var85 = conses_high.putf(var85, var91, var92.first());
            var86 = var86.rest();
            var88 = var86.first();
        }
        return var85;
    }
    
    public static SubLObject f28701(final SubLObject var110, final SubLObject var111) {
        SubLObject var112 = (SubLObject)module0412.NIL;
        SubLObject var113 = (SubLObject)module0412.NIL;
        if (Sequences.length(var111).numG(Sequences.length(var110))) {
            var112 = var111;
            var113 = var110;
        }
        else {
            var112 = var110;
            var113 = var111;
        }
        if (module0412.NIL == var113) {
            return var112;
        }
        if (module0412.NIL != f28709(var112, var113)) {
            return var112;
        }
        return var113;
    }
    
    public static SubLObject f28700(final SubLObject var110, final SubLObject var111) {
        SubLObject var112 = (SubLObject)module0412.NIL;
        SubLObject var113 = (SubLObject)module0412.NIL;
        if (Sequences.length(var111).numG(Sequences.length(var110))) {
            var112 = var111;
            var113 = var110;
        }
        else {
            var112 = var110;
            var113 = var111;
        }
        if (module0412.NIL == var113) {
            return var112;
        }
        if (module0412.NIL != f28709(var112, var113)) {
            return var113;
        }
        return var112;
    }
    
    public static SubLObject f28709(final SubLObject var112, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        var114.resetMultipleValues();
        final SubLObject var115 = f28710(var112, var113);
        final SubLObject var116 = var114.secondMultipleValue();
        var114.resetMultipleValues();
        return Numbers.numG(var115, var116);
    }
    
    public static SubLObject f28711(final SubLObject var112, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        var114.resetMultipleValues();
        final SubLObject var115 = f28710(var112, var113);
        final SubLObject var116 = var114.secondMultipleValue();
        var114.resetMultipleValues();
        return Numbers.numL(var115, var116);
    }
    
    public static SubLObject f28710(final SubLObject var112, final SubLObject var113) {
        SubLObject var114 = (SubLObject)module0412.ZERO_INTEGER;
        SubLObject var115 = (SubLObject)module0412.ZERO_INTEGER;
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        SubLObject var119;
        for (var116 = (SubLObject)module0412.NIL, var116 = var112; module0412.NIL != var116; var116 = conses_high.cddr(var116)) {
            var117 = var116.first();
            var118 = conses_high.cadr(var116);
            var119 = conses_high.getf(var113, var117, (SubLObject)module0412.UNPROVIDED);
            if (!var118.eql(var119)) {
                if (module0412.NIL != f28683(var117, var118, var119)) {
                    var114 = Numbers.add(var114, (SubLObject)module0412.ONE_INTEGER);
                }
                else {
                    var115 = Numbers.add(var115, (SubLObject)module0412.ONE_INTEGER);
                }
            }
        }
        return Values.values(var114, var115);
    }
    
    public static SubLObject f28706(final SubLObject var51) {
        return module0035.f2378(var51, (SubLObject)module0412.$ic55$, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28712(final SubLObject var51) {
        return module0035.f2378(var51, (SubLObject)module0412.$ic56$, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28713(final SubLObject var51) {
        return f28712(var51);
    }
    
    public static SubLObject f28714(final SubLObject var51) {
        return f28706(var51);
    }
    
    public static SubLObject f28715(final SubLObject var116) {
        assert module0412.NIL != module0360.f23905(var116) : var116;
        return module0035.f2294(module0412.$g3332$.getGlobalValue(), var116, (SubLObject)module0412.UNPROVIDED, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28716(final SubLObject var116, final SubLObject var6, SubLObject var7) {
        if (var7 == module0412.UNPROVIDED) {
            var7 = (SubLObject)module0412.NIL;
        }
        return conses_high.getf(f28715(var116), var6, var7);
    }
    
    public static SubLObject f28717(final SubLObject var116) {
        return f28716(var116, (SubLObject)module0412.$ic59$, (SubLObject)module0412.UNPROVIDED);
    }
    
    public static SubLObject f28718() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28668", "S#31815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28669", "S#31816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28670", "S#31817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28671", "S#26089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28672", "S#31818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28673", "S#31819", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28676", "S#31820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28677", "S#31821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28674", "S#31822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28678", "S#31823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28679", "S#31824", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28680", "S#31825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28681", "S#31826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28682", "S#31827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28683", "S#31828", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28684", "S#31829", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28685", "S#31830", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28675", "S#31831", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28686", "S#31832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28687", "S#31833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28688", "S#31834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28689", "S#31835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28690", "S#31836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28691", "S#31837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28692", "S#31838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28694", "S#31839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28696", "S#28221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28693", "S#28219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28698", "S#28220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28695", "S#28222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28699", "S#31840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28697", "S#31841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28702", "S#31842", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28704", "S#31843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28705", "S#31844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28703", "S#31845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28707", "S#31846", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28708", "S#31847", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28701", "S#31848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28700", "S#31849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28709", "S#31850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28711", "S#31851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28710", "S#31852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28706", "S#31853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28712", "S#31854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28713", "S#31855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28714", "S#31856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28715", "S#31508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28716", "S#31857", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28717", "S#31858", 1, 0, false);
        return (SubLObject)module0412.NIL;
    }
    
    public static SubLObject f28719() {
        module0412.$g3326$ = SubLFiles.deflexical("S#31859", (SubLObject)module0412.$ic6$);
        module0412.$g3327$ = SubLFiles.deflexical("S#31860", (SubLObject)module0412.$ic7$);
        module0412.$g3328$ = SubLFiles.deflexical("S#31861", (SubLObject)module0412.$ic8$);
        module0412.$g3329$ = SubLFiles.deflexical("S#31862", (SubLObject)module0412.$ic10$);
        module0412.$g3330$ = SubLFiles.deflexical("S#31863", (SubLObject)module0412.$ic11$);
        module0412.$g3331$ = SubLFiles.deflexical("S#31864", (SubLObject)module0412.$ic33$);
        module0412.$g3332$ = SubLFiles.deflexical("S#31865", (SubLObject)module0412.$ic57$);
        return (SubLObject)module0412.NIL;
    }
    
    public static SubLObject f28720() {
        return (SubLObject)module0412.NIL;
    }
    
    public void declareFunctions() {
        f28718();
    }
    
    public void initializeVariables() {
        f28719();
    }
    
    public void runTopLevelForms() {
        f28720();
    }
    
    static {
        me = (SubLFile)new module0412();
        module0412.$g3326$ = null;
        module0412.$g3327$ = null;
        module0412.$g3328$ = null;
        module0412.$g3329$ = null;
        module0412.$g3330$ = null;
        module0412.$g3331$ = null;
        module0412.$g3332$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic1$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#26487", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic5$ = SubLObjectFactory.makeKeyword("CUSTOM");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("BINDINGS"), SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?"), SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-STEP"), SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?"), SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?") });
        $ic8$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)module0412.T, (SubLObject)module0412.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("EL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), (SubLObject)module0412.T, (SubLObject)module0412.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW"), (SubLObject)SubLObjectFactory.makeKeyword("EXTENDED"), (SubLObject)SubLObjectFactory.makeKeyword("MAXIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("CUSTOM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), (SubLObject)module0412.T, (SubLObject)module0412.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)module0412.NIL, (SubLObject)module0412.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUSED"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")) });
        $ic9$ = SubLObjectFactory.makeSymbol("CAR");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-STEP"), SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT") });
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $ic12$ = SubLObjectFactory.makeString("Invalid value for the properties ~a : ~a");
        $ic13$ = SubLObjectFactory.makeString("unexpected property ~s");
        $ic14$ = SubLObjectFactory.makeSymbol("S#26782", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)module0412.ZERO_INTEGER);
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic18$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic19$ = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $ic20$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic21$ = SubLObjectFactory.makeKeyword("MAX-STEP");
        $ic22$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic23$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic24$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic25$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic26$ = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic27$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic28$ = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $ic29$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic30$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic31$ = SubLObjectFactory.makeKeyword("HL");
        $ic32$ = SubLObjectFactory.makeKeyword("EL");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"));
        $ic34$ = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $ic35$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic36$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic37$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic38$ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic39$ = SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?");
        $ic40$ = SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?");
        $ic41$ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic42$ = SubLObjectFactory.makeKeyword("TRANS-ISA-POS");
        $ic43$ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic44$ = SubLObjectFactory.makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $ic45$ = SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic46$ = SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic47$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic48$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic49$ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $ic50$ = SubLObjectFactory.makeKeyword("ABNORMAL");
        $ic51$ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic52$ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic53$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic54$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10130", "CYC"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#31850", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#31851", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MINIMAL"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), module0412.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), module0412.FIFTEEN_INTEGER, SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), module0412.ZERO_INTEGER, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), module0412.T, SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeInteger(100000), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(20000000), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), module0412.ZERO_INTEGER, SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), module0412.NIL }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SHALLOW"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), module0412.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), module0412.NIL, SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), module0412.ZERO_INTEGER, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), module0412.T, SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeInteger(100000), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(20000000), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), module0412.T, SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), module0412.ONE_INTEGER, SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), module0412.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EXTENDED"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), module0412.T, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), module0412.NIL, SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), module0412.ZERO_INTEGER, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), module0412.T, SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeInteger(100000), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(20000000), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), module0412.T, SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), module0412.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), module0412.TWO_INTEGER, SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), module0412.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAXIMAL"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), module0412.T, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), module0412.NIL, SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), module0412.T, SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("ALL"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), module0412.T, SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), module0412.T, SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), module0412.T, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), module0412.NIL, SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), module0412.T }));
        $ic58$ = SubLObjectFactory.makeSymbol("S#26597", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0412.class
	Total time: 367 ms
	
	Decompiled with Procyon 0.5.32.
*/