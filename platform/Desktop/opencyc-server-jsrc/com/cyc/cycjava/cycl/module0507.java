package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0507 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0507";
    public static final String myFingerPrint = "d154c0ad6f108aa50c5b5a4a335dad5411c58557a9eb70841d2bf5b8f79263fa";
    private static SubLSymbol $g3810$;
    private static SubLSymbol $g3811$;
    private static SubLSymbol $g3812$;
    private static SubLSymbol $g3813$;
    private static SubLSymbol $g3814$;
    private static SubLSymbol $g3815$;
    private static SubLSymbol $g3816$;
    private static SubLSymbol $g3817$;
    private static SubLSymbol $g3818$;
    private static SubLSymbol $g3819$;
    private static SubLSymbol $g3820$;
    private static SubLSymbol $g3821$;
    private static SubLSymbol $g3822$;
    private static SubLSymbol $g3823$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    
    public static SubLObject f32375(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0363.f24478(var1) : var1;
        final SubLObject var3 = module0363.f24551(var1);
        return module0479.f31713(var2, var3);
    }
    
    public static SubLObject f32376(final SubLObject var1) {
        assert NIL != module0363.f24478(var1) : var1;
        final SubLObject var2 = module0363.f24551(var1);
        return module0479.f31714(var2);
    }
    
    public static SubLObject f32377(final SubLObject var4, final SubLObject var2) {
        assert NIL != module0361.f24009(var4) : var4;
        return Numbers.max((SubLObject)ONE_INTEGER, Numbers.truncate(module0361.f24228(var4), $g3810$.getGlobalValue()));
    }
    
    public static SubLObject f32378(final SubLObject var4, final SubLObject var2) {
        assert NIL != module0361.f24009(var4) : var4;
        final SubLObject var5 = f32377(var4, var2);
        final SubLObject var6 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), var5);
        final SubLObject var7 = module0361.f24128(var4);
        if (NIL == module0065.f4772(var7, (SubLObject)$ic2$)) {
            final SubLObject var8_9 = var7;
            if (NIL == module0065.f4775(var8_9, (SubLObject)$ic2$)) {
                final SubLObject var8 = module0065.f4740(var8_9);
                final SubLObject var9 = (SubLObject)NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
                    var12 = ((NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    if (NIL == module0065.f4749(var13) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                        if (NIL != module0065.f4749(var13)) {
                            var13 = (SubLObject)$ic2$;
                        }
                        if (NIL != f32375(var13, var2)) {
                            module0077.f5326(var13, var6);
                        }
                    }
                }
            }
            final SubLObject var15_16 = var7;
            if (NIL == module0065.f4777(var15_16)) {
                final SubLObject var14 = module0065.f4738(var15_16);
                SubLObject var15 = (SubLObject)NIL;
                SubLObject var16 = (SubLObject)NIL;
                final Iterator var17 = Hashtables.getEntrySetIterator(var14);
                try {
                    while (Hashtables.iteratorHasNext(var17)) {
                        final Map.Entry var18 = Hashtables.iteratorNextEntry(var17);
                        var15 = Hashtables.getEntryKey(var18);
                        var16 = Hashtables.getEntryValue(var18);
                        if (NIL != f32375(var16, var2)) {
                            module0077.f5326(var16, var6);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var17);
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f32379(final SubLObject var4) {
        assert NIL != module0361.f24009(var4) : var4;
        return Numbers.truncate(Numbers.multiply($g3811$.getGlobalValue(), module0361.f24228(var4)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32380(final SubLObject var4) {
        assert NIL != module0361.f24009(var4) : var4;
        final SubLObject var5 = f32379(var4);
        final SubLObject var6 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), var5);
        final SubLObject var7 = module0361.f24128(var4);
        if (NIL == module0065.f4772(var7, (SubLObject)$ic2$)) {
            final SubLObject var8_21 = var7;
            if (NIL == module0065.f4775(var8_21, (SubLObject)$ic2$)) {
                final SubLObject var8 = module0065.f4740(var8_21);
                final SubLObject var9 = (SubLObject)NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var15;
                SubLObject var14;
                SubLObject var16;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
                    var12 = ((NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    if (NIL == module0065.f4749(var13) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                        if (NIL != module0065.f4749(var13)) {
                            var13 = (SubLObject)$ic2$;
                        }
                        var14 = (var15 = f32376(var13));
                        var16 = (SubLObject)NIL;
                        var16 = var15.first();
                        while (NIL != var15) {
                            module0077.f5326(var16, var6);
                            var15 = var15.rest();
                            var16 = var15.first();
                        }
                    }
                }
            }
            final SubLObject var15_24 = var7;
            if (NIL == module0065.f4777(var15_24)) {
                final SubLObject var17 = module0065.f4738(var15_24);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                final Iterator var20 = Hashtables.getEntrySetIterator(var17);
                try {
                    while (Hashtables.iteratorHasNext(var20)) {
                        final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                        var18 = Hashtables.getEntryKey(var21);
                        var19 = Hashtables.getEntryValue(var21);
                        SubLObject var23;
                        final SubLObject var22 = var23 = f32376(var19);
                        SubLObject var24 = (SubLObject)NIL;
                        var24 = var23.first();
                        while (NIL != var23) {
                            module0077.f5326(var24, var6);
                            var23 = var23.rest();
                            var24 = var23.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var20);
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f32381(final SubLObject var4) {
        assert NIL != module0361.f24009(var4) : var4;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0361.f24128(var4);
        if (NIL == module0065.f4772(var6, (SubLObject)$ic2$)) {
            final SubLObject var8_26 = var6;
            if (NIL == module0065.f4775(var8_26, (SubLObject)$ic2$)) {
                final SubLObject var7 = module0065.f4740(var8_26);
                final SubLObject var8 = (SubLObject)NIL;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                for (var9 = Sequences.length(var7), var10 = (SubLObject)NIL, var10 = (SubLObject)ZERO_INTEGER; var10.numL(var9); var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER)) {
                    var11 = ((NIL != var8) ? Numbers.subtract(var9, var10, (SubLObject)ONE_INTEGER) : var10);
                    var12 = Vectors.aref(var7, var11);
                    if (NIL == module0065.f4749(var12) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                        if (NIL != module0065.f4749(var12)) {
                            var12 = (SubLObject)$ic2$;
                        }
                        var5 = (SubLObject)ConsesLow.cons(var12, var5);
                    }
                }
            }
            final SubLObject var15_27 = var6;
            if (NIL == module0065.f4777(var15_27)) {
                final SubLObject var13 = module0065.f4738(var15_27);
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = (SubLObject)NIL;
                final Iterator var16 = Hashtables.getEntrySetIterator(var13);
                try {
                    while (Hashtables.iteratorHasNext(var16)) {
                        final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                        var14 = Hashtables.getEntryKey(var17);
                        var15 = Hashtables.getEntryValue(var17);
                        var5 = (SubLObject)ConsesLow.cons(var15, var5);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var16);
                }
            }
        }
        var5 = Sort.sort(var5, Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)$ic4$);
        return module0052.f3709(var5);
    }
    
    public static SubLObject f32382(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = (SubLObject)$ic5$;
        var29.resetMultipleValues();
        final SubLObject var31 = module0337.f22630(var28, var30);
        final SubLObject var32 = var29.secondMultipleValue();
        var29.resetMultipleValues();
        if (NIL != var31) {
            final SubLObject var33 = module0035.f2294(var32, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0361.f23997(var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32383(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            final SubLObject var5 = module0361.f23996(var4);
            return module0202.f12761((SubLObject)ConsesLow.list($ic7$, var5));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32384(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = (SubLObject)$ic8$;
        var35.resetMultipleValues();
        final SubLObject var37 = module0337.f22630(var34, var36);
        final SubLObject var38 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        if (NIL != var37) {
            final SubLObject var39 = module0035.f2294(var38, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var40 = module0035.f2294(var38, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0361.f24238(var40, var39);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32385(final SubLObject var1) {
        if (NIL != module0363.f24504(var1)) {
            final SubLObject var2 = module0363.f24507(var1);
            if (NIL != module0361.f24109(var2)) {
                final SubLObject var3 = module0363.f24508(var1);
                final SubLObject var4 = module0361.f23996(var2);
                return module0202.f12761((SubLObject)ConsesLow.list($ic10$, var3, (SubLObject)ConsesLow.list($ic7$, var4)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32386(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = (SubLObject)$ic11$;
        var37.resetMultipleValues();
        final SubLObject var39 = module0337.f22630(var36, var38);
        final SubLObject var40 = var37.secondMultipleValue();
        var37.resetMultipleValues();
        if (NIL != var39) {
            final SubLObject var41 = module0035.f2294(var40, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var42 = module0035.f2294(var40, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0361.f24211(var42, var41);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32387(final SubLObject var38) {
        if (NIL != module0364.f24719(var38)) {
            final SubLObject var39 = module0364.f24722(var38);
            if (NIL != module0361.f24109(var39)) {
                final SubLObject var40 = module0364.f24723(var38);
                final SubLObject var41 = module0361.f23996(var39);
                return module0202.f12761((SubLObject)ConsesLow.list($ic13$, var40, (SubLObject)ConsesLow.list($ic7$, var41)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32388(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = (SubLObject)$ic14$;
        var40.resetMultipleValues();
        final SubLObject var42 = module0337.f22630(var39, var41);
        final SubLObject var43 = var40.secondMultipleValue();
        var40.resetMultipleValues();
        if (NIL != var42) {
            final SubLObject var44 = module0035.f2294(var43, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var45 = module0035.f2294(var43, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0361.f24320(var45, var44);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32389(final SubLObject var41) {
        if (NIL != module0366.f24932(var41)) {
            final SubLObject var42 = module0366.f24936(var41);
            if (NIL != module0361.f24109(var42)) {
                final SubLObject var43 = module0366.f24935(var41);
                final SubLObject var44 = module0361.f23996(var42);
                return module0202.f12761((SubLObject)ConsesLow.list($ic16$, var43, (SubLObject)ConsesLow.list($ic7$, var44)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32390(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = (SubLObject)$ic17$;
        var43.resetMultipleValues();
        final SubLObject var45 = module0337.f22630(var42, var44);
        final SubLObject var46 = var43.secondMultipleValue();
        var43.resetMultipleValues();
        if (NIL != var45) {
            final SubLObject var47 = module0035.f2294(var46, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var48 = module0035.f2294(var46, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0361.f24195(var48, var47);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32391(final SubLObject var44) {
        if (NIL != inference_datastructures_inference_oc.f25417(var44)) {
            final SubLObject var45 = inference_datastructures_inference_oc.f25421(var44);
            if (NIL != module0361.f24109(var45)) {
                final SubLObject var46 = inference_datastructures_inference_oc.f25422(var44);
                final SubLObject var47 = module0361.f23996(var45);
                return module0202.f12761((SubLObject)ConsesLow.list($ic19$, var46, (SubLObject)ConsesLow.list($ic7$, var47)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32392(final SubLObject var45) {
        if (var45.eql($ic20$)) {
            return (SubLObject)$ic21$;
        }
        if (var45.eql($ic22$)) {
            return (SubLObject)$ic23$;
        }
        if (var45.eql($ic24$)) {
            return (SubLObject)$ic25$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32393(final SubLObject var47) {
        if (var47.eql((SubLObject)$ic21$)) {
            return $ic20$;
        }
        if (var47.eql((SubLObject)$ic23$)) {
            return $ic22$;
        }
        if (var47.eql((SubLObject)$ic25$)) {
            return $ic24$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32394(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = (SubLObject)$ic26$;
        var49.resetMultipleValues();
        final SubLObject var51 = module0337.f22630(var48, var50);
        final SubLObject var52 = var49.secondMultipleValue();
        var49.resetMultipleValues();
        if (NIL != var51) {
            final SubLObject var53 = module0035.f2294(var52, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var54 = module0035.f2294(var52, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0233.f15340(var54, var53);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32395(final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic29$);
        var52 = var51.first();
        final SubLObject var54 = var53 = var51.rest();
        return module0202.f12768($ic30$, var52, var53);
    }
    
    public static SubLObject f32396(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            return module0361.f24228(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32397(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            return module0361.f24208(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32398(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            return module0361.f24233(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32399(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            return module0361.f24191(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32400(final SubLObject var4, final SubLObject var2) {
        if (NIL != module0361.f24109(var4)) {
            final SubLObject var5 = module0361.f24128(var4);
            if (NIL == module0065.f4772(var5, (SubLObject)$ic2$)) {
                final SubLObject var8_54 = var5;
                if (NIL == module0065.f4775(var8_54, (SubLObject)$ic2$)) {
                    final SubLObject var6 = module0065.f4740(var8_54);
                    final SubLObject var7 = (SubLObject)NIL;
                    SubLObject var8;
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    for (var8 = Sequences.length(var6), var9 = (SubLObject)NIL, var9 = (SubLObject)ZERO_INTEGER; var9.numL(var8); var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER)) {
                        var10 = ((NIL != var7) ? Numbers.subtract(var8, var9, (SubLObject)ONE_INTEGER) : var9);
                        var11 = Vectors.aref(var6, var10);
                        if (NIL == module0065.f4749(var11) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                            if (NIL != module0065.f4749(var11)) {
                                var11 = (SubLObject)$ic2$;
                            }
                            if (NIL != f32401(var11, var2)) {
                                return (SubLObject)T;
                            }
                        }
                    }
                }
                final SubLObject var15_55 = var5;
                if (NIL == module0065.f4777(var15_55)) {
                    final SubLObject var12 = module0065.f4738(var15_55);
                    SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14 = (SubLObject)NIL;
                    final Iterator var15 = Hashtables.getEntrySetIterator(var12);
                    try {
                        while (Hashtables.iteratorHasNext(var15)) {
                            final Map.Entry var16 = Hashtables.iteratorNextEntry(var15);
                            var13 = Hashtables.getEntryKey(var16);
                            var14 = Hashtables.getEntryValue(var16);
                            if (NIL != f32401(var14, var2)) {
                                return (SubLObject)T;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var15);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32402(final SubLObject var56, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        final SubLObject var58 = f32382(module0205.f13387(var56, (SubLObject)UNPROVIDED));
        if (NIL != module0361.f24009(var58)) {
            return f32379(var58);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32403(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            final SubLObject var5 = f32380(var4);
            return module0077.f5329(var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32404(final SubLObject var1) {
        if (NIL != module0363.f24504(var1)) {
            return module0363.f24507(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32405(final SubLObject var56, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        final SubLObject var58 = f32382(module0205.f13387(var56, (SubLObject)UNPROVIDED));
        if (NIL != module0361.f24009(var58)) {
            return module0361.f24228(var58);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32406(final SubLObject var4) {
        if (NIL != module0361.f24109(var4)) {
            return f32381(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32407(final SubLObject var1) {
        if (NIL != module0363.f24504(var1)) {
            return module0363.f24509(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32401(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0363.f24504(var1)) {
            return f32375(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32408(final SubLObject var56, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = (SubLObject)$ic65$;
        var58.resetMultipleValues();
        final SubLObject var60 = module0337.f22630(var56, var59);
        final SubLObject var61 = var58.secondMultipleValue();
        var58.resetMultipleValues();
        if (NIL == var60) {
            return (SubLObject)NIL;
        }
        final SubLObject var62 = module0035.f2294(var61, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var63 = module0035.f2294(var61, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var64 = f32382(var63);
        if (NIL != module0361.f24109(var64)) {
            return f32377(var64, var62);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32409(final SubLObject var4, final SubLObject var2) {
        if (NIL != module0361.f24109(var4)) {
            final SubLObject var5 = f32378(var4, var2);
            return module0077.f5329(var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32410(final SubLObject var1) {
        if (NIL != module0363.f24504(var1)) {
            return f32376(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32411(final SubLObject var1, final SubLObject var47) {
        if (NIL != module0363.f24504(var1)) {
            return Equality.eql(var47, module0363.f24679(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32412(final SubLObject var1) {
        if (NIL != module0363.f24504(var1)) {
            return module0363.f24679(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32413(final SubLObject var41) {
        if (NIL != module0366.f24932(var41) && NIL != module0377.f26776(var41)) {
            return module0377.f26777(var41);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32414(final SubLObject var41, final SubLObject var58) {
        return Equality.eql(var58, f32413(var41));
    }
    
    public static SubLObject f32415(final SubLObject var41) {
        if (NIL != module0366.f24932(var41) && NIL != module0377.f26776(var41)) {
            return module0377.f26835(var41);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32416(final SubLObject var41, final SubLObject var51) {
        return module0004.f104(var51, f32415(var41), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32417(final SubLObject var59) {
        if (NIL != module0202.f12589(var59, $ic88$)) {
            return module0205.f13277(var59, (SubLObject)UNPROVIDED);
        }
        return $ic89$;
    }
    
    public static SubLObject f32418(final SubLObject var60, final SubLObject var51) {
        return conses_high.member(var51, module0202.f12792(f32417(var60)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32419(final SubLObject var51) {
        if (NIL != module0233.f15347(var51)) {
            return module0233.f15355(var51);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32420(final SubLObject var51, final SubLObject var61) {
        return Equality.eql(var61, f32419(var51));
    }
    
    public static SubLObject f32421(final SubLObject var51) {
        if (NIL != module0233.f15347(var51)) {
            return module0233.f15370(var51);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32422(final SubLObject var51, final SubLObject var49) {
        return Equality.equal(var49, f32421(var51));
    }
    
    public static SubLObject f32423() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32375", "S#35778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32376", "S#35779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32377", "S#35780", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32378", "S#35781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32379", "S#35782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32380", "S#35783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32381", "S#35784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32382", "S#35785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32383", "CYCL-PROBLEM-STORE-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32384", "S#35786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32385", "CYCL-PROBLEM-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32386", "S#35787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32387", "S#35788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32388", "S#35789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32389", "S#35790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32390", "S#35791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32391", "S#35337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32392", "S#35792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32393", "S#35793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32394", "S#35794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32395", "S#35795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32396", "S#35796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32397", "S#35797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32398", "S#35798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32399", "S#35799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32400", "S#35800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32402", "S#35801", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32403", "S#35802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32404", "S#35803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32405", "S#35804", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32406", "S#35805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32407", "S#35806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32401", "S#35807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32408", "S#35808", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32409", "S#35809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32410", "S#35810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32411", "S#35811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32412", "S#35812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32413", "S#35813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32414", "S#35814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32415", "S#35815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32416", "S#35816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32417", "S#35817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32418", "S#35818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32419", "S#35819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32420", "S#35820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32421", "S#35821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0507", "f32422", "S#35822", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32424() {
        $g3810$ = SubLFiles.deflexical("S#35823", (SubLObject)TEN_INTEGER);
        $g3811$ = SubLFiles.deflexical("S#35824", (SubLObject)TWO_INTEGER);
        $g3812$ = SubLFiles.deflexical("S#35825", (SubLObject)FIVE_INTEGER);
        $g3813$ = SubLFiles.defconstant("S#35826", module0018.$g659$.getGlobalValue());
        $g3814$ = SubLFiles.defconstant("S#35827", module0018.$g659$.getGlobalValue());
        $g3815$ = SubLFiles.defconstant("S#35828", module0018.$g659$.getGlobalValue());
        $g3816$ = SubLFiles.defconstant("S#35829", module0018.$g659$.getGlobalValue());
        $g3817$ = SubLFiles.defconstant("S#35830", module0018.$g659$.getGlobalValue());
        $g3818$ = SubLFiles.defconstant("S#35831", module0018.$g659$.getGlobalValue());
        $g3819$ = SubLFiles.defconstant("S#35832", module0018.$g659$.getGlobalValue());
        $g3820$ = SubLFiles.defconstant("S#35833", module0018.$g659$.getGlobalValue());
        $g3821$ = SubLFiles.defconstant("S#35834", module0018.$g659$.getGlobalValue());
        $g3822$ = SubLFiles.defconstant("S#35835", module0018.$g659$.getGlobalValue());
        $g3823$ = SubLFiles.deflexical("S#35836", (SubLObject)$ic104$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32425() {
        module0340.f22938($ic31$);
        module0358.f23771((SubLObject)$ic32$, $ic31$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22938($ic35$);
        module0358.f23771((SubLObject)$ic32$, $ic35$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0340.f22938($ic38$);
        module0358.f23771((SubLObject)$ic32$, $ic38$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0340.f22938($ic41$);
        module0358.f23771((SubLObject)$ic32$, $ic41$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic42$, (SubLObject)$ic43$);
        module0340.f22938($ic44$);
        module0358.f23771((SubLObject)$ic32$, $ic44$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic45$, $ic44$);
        module0340.f22941((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0340.f22941((SubLObject)$ic48$, (SubLObject)$ic49$);
        module0340.f22941((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0340.f22938($ic52$);
        module0358.f23774((SubLObject)$ic32$, $ic52$);
        module0340.f22941((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0340.f22941((SubLObject)$ic55$, (SubLObject)$ic56$);
        module0340.f22938($ic57$);
        module0358.f23771((SubLObject)$ic32$, $ic57$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic58$, (SubLObject)$ic59$);
        module0340.f22938($ic60$);
        module0358.f23774((SubLObject)$ic32$, $ic60$);
        module0358.f23773((SubLObject)$ic45$, $ic60$);
        module0340.f22941((SubLObject)$ic61$, (SubLObject)$ic62$);
        module0340.f22941((SubLObject)$ic63$, (SubLObject)$ic64$);
        module0340.f22941((SubLObject)$ic68$, (SubLObject)$ic69$);
        module0340.f22941((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0340.f22938($ic72$);
        module0358.f23771((SubLObject)$ic32$, $ic72$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic73$, (SubLObject)$ic74$);
        module0340.f22941((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0340.f22938($ic77$);
        module0358.f23771((SubLObject)$ic32$, $ic77$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0340.f22941((SubLObject)$ic80$, (SubLObject)$ic81$);
        module0340.f22938($ic82$);
        module0358.f23771((SubLObject)$ic32$, $ic82$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic83$, (SubLObject)$ic84$);
        module0340.f22941((SubLObject)$ic85$, (SubLObject)$ic86$);
        module0340.f22938($ic87$);
        module0358.f23771((SubLObject)$ic32$, $ic87$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic90$, (SubLObject)$ic91$);
        module0340.f22941((SubLObject)$ic92$, (SubLObject)$ic93$);
        module0340.f22938($ic94$);
        module0358.f23771((SubLObject)$ic32$, $ic94$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic95$, (SubLObject)$ic96$);
        module0340.f22941((SubLObject)$ic97$, (SubLObject)$ic98$);
        module0340.f22938($ic99$);
        module0358.f23771((SubLObject)$ic32$, $ic99$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic100$, (SubLObject)$ic101$);
        module0340.f22941((SubLObject)$ic102$, (SubLObject)$ic103$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32423();
    }
    
    public void initializeVariables() {
        f32424();
    }
    
    public void runTopLevelForms() {
        f32425();
    }
    
    static {
        me = (SubLFile)new module0507();
        $g3810$ = null;
        $g3811$ = null;
        $g3812$ = null;
        $g3813$ = null;
        $g3814$ = null;
        $g3815$ = null;
        $g3816$ = null;
        $g3817$ = null;
        $g3818$ = null;
        $g3819$ = null;
        $g3820$ = null;
        $g3821$ = null;
        $g3822$ = null;
        $g3823$ = null;
        $ic0$ = makeSymbol("S#26082", "CYC");
        $ic1$ = makeSymbol("S#26782", "CYC");
        $ic2$ = makeKeyword("SKIP");
        $ic3$ = makeSymbol("<");
        $ic4$ = makeSymbol("S#26813", "CYC");
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35837", "CYC")));
        $ic6$ = makeSymbol("S#35837", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn"));
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35838", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35837", "CYC"))));
        $ic9$ = makeSymbol("S#35838", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("CycProblemFn"));
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemLinkFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35839", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35837", "CYC"))));
        $ic12$ = makeSymbol("S#35839", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("CycProblemLinkFn"));
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProofFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35840", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35837", "CYC"))));
        $ic15$ = makeSymbol("S#35840", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("CycProofFn"));
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycInferenceFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35841", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemStoreFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35837", "CYC"))));
        $ic18$ = makeSymbol("S#35841", "CYC");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("CycInferenceFn"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("Good-ProblemProvabilityStatus"));
        $ic21$ = makeKeyword("GOOD");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("Neutral-ProblemProvabilityStatus"));
        $ic23$ = makeKeyword("NEUTRAL");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("NoGood-ProblemProvabilityStatus"));
        $ic25$ = makeKeyword("NO-GOOD");
        $ic26$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ELInferenceBindingFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35842", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")));
        $ic27$ = makeSymbol("S#132", "CYC");
        $ic28$ = makeSymbol("S#35842", "CYC");
        $ic29$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#35842", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("ELInferenceBindingFn"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount"));
        $ic32$ = makeKeyword("POS");
        $ic33$ = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT-LOOKUP");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35796", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount"));
        $ic36$ = makeKeyword("REMOVAL-PROBLEM-STORE-LINK-COUNT-LOOKUP");
        $ic37$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35797", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount"));
        $ic39$ = makeKeyword("REMOVAL-PROBLEM-STORE-PROOF-COUNT-LOOKUP");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35798", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount"));
        $ic42$ = makeKeyword("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT-LOOKUP");
        $ic43$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35799", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms"));
        $ic45$ = makeKeyword("NEG");
        $ic46$ = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-POS");
        $ic47$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35843", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35800", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#3268", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))) });
        $ic48$ = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-NEG");
        $ic49$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#1889", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35843", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35800", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#3268", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC"))))) });
        $ic50$ = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35801", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35802", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems"));
        $ic53$ = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG1-UNIFY");
        $ic54$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35803", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CYCL-PROBLEM-STORE-DECODE"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))) });
        $ic55$ = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY");
        $ic56$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35804", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35805", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CYCL-PROBLEM-DECODE"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence"));
        $ic58$ = makeKeyword("REMOVAL-PROBLEM-QUERY-SENTENCE-ARG2-UNIFY");
        $ic59$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35806", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#21046", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms"));
        $ic61$ = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-POS");
        $ic62$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35844", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35807", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24274", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))) });
        $ic63$ = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-NEG");
        $ic64$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#1887", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35844", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35807", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24274", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC"))))) });
        $ic65$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")));
        $ic66$ = makeSymbol("S#12141", "CYC");
        $ic67$ = makeSymbol("S#35843", "CYC");
        $ic68$ = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemFn")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35808", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycProblemFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35843", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35843", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35785", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35843", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35809", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#3268", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CYCL-PROBLEM-DECODE"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC"))) });
        $ic70$ = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG2-UNIFY");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35825", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35810", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus"));
        $ic73$ = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK-POS");
        $ic74$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35845", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35845", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35844", "CYC"), (SubLObject)makeSymbol("S#35845", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35792", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35845", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#5846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35811", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24274", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#5846", "CYC")))) });
        $ic75$ = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-ARG2-UNIFY");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35786", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35812", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35793", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35844", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule"));
        $ic78$ = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-CHECK-POS");
        $ic79$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35826", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35847", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35847", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35846", "CYC"), (SubLObject)makeSymbol("S#35847", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35789", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35847", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35846", "CYC"), (SubLObject)makeSymbol("S#35847", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35814", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35847", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <fully-bound>)") });
        $ic80$ = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-ARG2-UNIFY");
        $ic81$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35827", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35789", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35813", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofRule")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <not-fully-bound>)") });
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings"));
        $ic83$ = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-CHECK-POS");
        $ic84$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35828", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35846", "CYC"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35789", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35794", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35846", "CYC"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35816", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <fully-bound>)") });
        $ic85$ = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-ARG2-UNIFY");
        $ic86$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35829", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35789", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35815", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycTransformationProofBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35846", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35795", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <not-fully-bound>)") });
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("CycInferenceAnswerFn"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic90$ = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-CHECK-POS");
        $ic91$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35830", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35849", "CYC"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35849", "CYC"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35818", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <fully-bound>)") });
        $ic92$ = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-ARG2-UNIFY");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35831", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35849", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15691", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35817", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35849", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <not-fully-bound>)") });
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar"));
        $ic95$ = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-CHECK-POS");
        $ic96$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35832", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35850", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35848", "CYC"), (SubLObject)makeSymbol("S#35850", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35794", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35848", "CYC"), (SubLObject)makeSymbol("S#35850", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35820", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <fully-bound>)") });
        $ic97$ = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-ARG2-UNIFY");
        $ic98$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35833", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35794", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35819", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingVar")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <not-fully-bound>)") });
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue"));
        $ic100$ = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-CHECK-POS");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35834", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35850", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35848", "CYC"), (SubLObject)makeSymbol("S#35850", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35794", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35848", "CYC"), (SubLObject)makeSymbol("S#35850", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35822", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35850", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <fully-bound>)") });
        $ic102$ = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-ARG2-UNIFY");
        $ic103$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35835", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35794", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35821", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceBindingValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35848", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <not-fully-bound>)") });
        $ic104$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblemCount")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreLinkCount")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProofCount")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreInferenceCount")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreTerms")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemStoreProblems")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQuerySentence")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemQueryTerms")), constant_handles_oc.f8479((SubLObject)makeString("cycProblemProvabilityStatus")) });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 572 ms
	
	Decompiled with Procyon 0.5.32.
*/