package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0517 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0517";
    public static final String myFingerPrint = "9d15ab69ac4a17b1f47d63f86891d774dc3986db95ee4353a542af5f68b85cbf";
    private static SubLSymbol $g3851$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLList $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    
    public static SubLObject f32549(final SubLObject var1) {
        return module0259.f16854(var1, $ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32550(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0423.f29604(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        return module0360.f23959(var6);
    }
    
    public static SubLObject f32551(final SubLObject var7) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f32552(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32554(var4, var6);
        if (NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32554(final SubLObject var8, final SubLObject var10) {
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        if (var10.eql((SubLObject)$ic5$)) {
            return f32555(var8);
        }
        if (var10.eql((SubLObject)$ic6$)) {
            return f32556(var8);
        }
        if (var10.eql((SubLObject)$ic7$)) {
            return f32557(var8);
        }
        if (var10.eql((SubLObject)$ic8$)) {
            return f32558(var8);
        }
        if (var10.eql((SubLObject)$ic9$)) {
            return f32559(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32555(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = var13;
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            final SubLObject var17 = module0233.f15414(inference_datastructures_inference_oc.f25687(var16));
            final SubLObject var18 = f32560(inference_datastructures_inference_oc.f25744(var16));
            var14 = (SubLObject)ConsesLow.cons(f32561(var17, var18), var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f32556(final SubLObject var18) {
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = var18;
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            final SubLObject var22 = f32560((SubLObject)NIL);
            var19 = (SubLObject)ConsesLow.cons(f32561(module0233.f15414(var21), var22), var19);
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f32557(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            final SubLObject var23 = module0233.f15414((SubLObject)NIL);
            final SubLObject var24 = f32562(var22);
            var20 = (SubLObject)ConsesLow.cons(f32561(var23, var24), var20);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f32558(final SubLObject var21) {
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            final SubLObject var25 = module0233.f15414(var24.first());
            final SubLObject var26 = f32562(conses_high.second(var24));
            var22 = (SubLObject)ConsesLow.cons(f32561(var25, var26), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Sequences.nreverse(var22);
    }
    
    public static SubLObject f32559(final SubLObject var23) {
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = var23.first();
        final SubLObject var26 = conses_high.second(var23);
        final SubLObject var27 = f32562((SubLObject)NIL);
        SubLObject var28 = var25;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            var29 = module0233.f15414(ConsesLow.append(var29, var26));
            var24 = (SubLObject)ConsesLow.cons(f32561(var29, var27), var24);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var24);
    }
    
    public static SubLObject f32560(final SubLObject var17) {
        if (NIL == var17) {
            return $ic10$;
        }
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = var17;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            var18 = (SubLObject)ConsesLow.cons(f32563(inference_datastructures_inference_oc.f25775(var20)), var18);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return module0202.f12683($ic11$, var18, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32562(final SubLObject var20) {
        if (NIL == var20) {
            return $ic10$;
        }
        SubLObject var21 = (SubLObject)NIL;
        var21 = (SubLObject)ConsesLow.cons(f32563(var20), var21);
        return module0202.f12683($ic11$, var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32563(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons(f32564(var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        var21 = module0202.f12683($ic11$, Sequences.nreverse(var21), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list($ic12$, var21);
    }
    
    public static SubLObject f32564(final SubLObject var28) {
        if (NIL != assertion_handles_oc.f11035(var28)) {
            return var28;
        }
        if (NIL != module0191.f11952(var28)) {
            return f32565(var28);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32565(final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)$ic13$);
        var29 = var28.first();
        SubLObject var33 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)$ic13$);
        var30 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)$ic13$);
        var31 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)$ic13$);
        var32 = var33.first();
        var33 = var33.rest();
        if (NIL == var33) {
            final SubLObject var34 = module0423.f29613(var29);
            final SubLObject var35 = module0423.f29615(var32);
            return (SubLObject)ConsesLow.list($ic14$, var34, var30, var31, var35);
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32561(final SubLObject var16, final SubLObject var17) {
        return (SubLObject)ConsesLow.list($ic15$, var16, var17);
    }
    
    public static SubLObject f32553(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0423.f29604(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = module0360.f23960(var6);
        if (NIL != module0360.f23961(var7)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, var7);
        }
        var3.resetMultipleValues();
        final SubLObject var8 = module0409.f28506(var4, var5, var6);
        final SubLObject var9 = var3.secondMultipleValue();
        final SubLObject var10 = var3.thirdMultipleValue();
        final SubLObject var11 = var3.fourthMultipleValue();
        var3.resetMultipleValues();
        if (NIL != inference_datastructures_inference_oc.f25417(var10)) {
            inference_datastructures_inference_oc.f25476(var10);
        }
        return Values.values(var8, var9, var7);
    }
    
    public static SubLObject f32566(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0423.f29604(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL != module0360.f23959(var6) && $ic7$ != module0360.f23960(var6));
    }
    
    public static SubLObject f32567(final SubLObject var7) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f32568(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32569(var4, var6);
        if (NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32569(final SubLObject var8, final SubLObject var10) {
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        SubLObject var11 = (SubLObject)NIL;
        if (var10.eql((SubLObject)$ic5$)) {
            SubLObject var12 = var8;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(inference_datastructures_inference_oc.f25687(var13)), var11);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic6$)) {
            SubLObject var12 = var8;
            SubLObject var14 = (SubLObject)NIL;
            var14 = var12.first();
            while (NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(var14), var11);
                var12 = var12.rest();
                var14 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic8$)) {
            SubLObject var12 = var8;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var12.first();
            while (NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(var15.first()), var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic9$)) {
            final SubLObject var16 = var8.first();
            final SubLObject var17 = conses_high.second(var8);
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(ConsesLow.append(var19, var17)), var11);
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return Sequences.nreverse(var11);
    }
    
    public static SubLObject f32570(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0423.f29604(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL != module0360.f23959(var6) && $ic7$ != module0360.f23960(var6) && NIL != module0035.f1997(module0202.f12911(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f32571(final SubLObject var7) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f32572(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32573(var4, var6);
        if (NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32573(final SubLObject var8, final SubLObject var10) {
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        SubLObject var11 = (SubLObject)NIL;
        if (var10.eql((SubLObject)$ic5$)) {
            SubLObject var12 = var8;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                final SubLObject var14 = f32574(inference_datastructures_inference_oc.f25687(var13));
                if (NIL == var14) {
                    return (SubLObject)NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic6$)) {
            SubLObject var12 = var8;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var12.first();
            while (NIL != var12) {
                final SubLObject var14 = f32574(var15);
                if (NIL == var14) {
                    return (SubLObject)NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic8$)) {
            SubLObject var12 = var8;
            SubLObject var16 = (SubLObject)NIL;
            var16 = var12.first();
            while (NIL != var12) {
                final SubLObject var14 = f32574(var16.first());
                if (NIL == var14) {
                    return (SubLObject)NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var16 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)$ic9$)) {
            SubLObject var12 = var8.first();
            SubLObject var15 = (SubLObject)NIL;
            var15 = var12.first();
            while (NIL != var12) {
                final SubLObject var14 = f32574(var15);
                if (NIL == var14) {
                    return (SubLObject)NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        var11 = Sequences.nreverse(var11);
        return (SubLObject)ConsesLow.list(module0202.f12791(var11, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32574(final SubLObject var39) {
        if (NIL == module0035.f1997(var39)) {
            return (SubLObject)NIL;
        }
        return module0233.f15370(var39.first());
    }
    
    public static SubLObject f32575(final SubLObject var7, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0147.$g2095$.getDynamicValue(var41);
        final SubLObject var43 = module0205.f13387(var7, (SubLObject)UNPROVIDED);
        final SubLObject var44 = module0205.f13388(var7, (SubLObject)UNPROVIDED);
        final SubLObject var45 = f32576(var7, var42);
        final SubLObject var46 = f32577(var7, var42);
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        if (NIL != module0202.f12595(var44)) {
            var52 = module0205.f13385(var44, (SubLObject)UNPROVIDED);
            var51 = $ic28$;
        }
        else if (NIL != module0202.f12594(var44)) {
            var52 = module0205.f13385(var44, (SubLObject)UNPROVIDED);
            var51 = $ic29$;
        }
        else {
            var52 = (SubLObject)ConsesLow.list(var44);
            var51 = $ic28$;
        }
        while (NIL == var53 && var47.numL($g3851$.getDynamicValue(var41))) {
            var47 = Numbers.add(var47, (SubLObject)ONE_INTEGER);
            var41.resetMultipleValues();
            final SubLObject var49_50 = (NIL != var50) ? f32578(var50, var46) : f32579(var43, var42, var45);
            final SubLObject var51_52 = var41.secondMultipleValue();
            final SubLObject var53_54 = var41.thirdMultipleValue();
            var41.resetMultipleValues();
            var48 = var49_50;
            var49 = var51_52;
            var50 = var53_54;
            var53 = (SubLObject)makeBoolean(!var47.eql(Sequences.length(inference_datastructures_inference_oc.f25744(inference_datastructures_inference_oc.f25656(var50).first()))));
            if (NIL == var53) {
                final SubLObject var54 = inference_datastructures_inference_oc.f25492(var50);
                if (NIL != module0065.f4772(var54, (SubLObject)$ic30$)) {
                    continue;
                }
                final SubLObject var56_57 = var54;
                if (NIL == module0065.f4775(var56_57, (SubLObject)$ic30$)) {
                    final SubLObject var55 = module0065.f4740(var56_57);
                    final SubLObject var56 = (SubLObject)NIL;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    SubLObject var60;
                    SubLObject var61;
                    SubLObject var62;
                    SubLObject var63;
                    SubLObject var64;
                    SubLObject var65;
                    SubLObject var66;
                    SubLObject var67;
                    SubLObject var14_68;
                    SubLObject var42_69;
                    SubLObject var68;
                    SubLObject var14_69;
                    SubLObject var69;
                    for (var57 = Sequences.length(var55), var58 = (SubLObject)NIL, var58 = (SubLObject)ZERO_INTEGER; var58.numL(var57); var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER)) {
                        var59 = ((NIL != var56) ? Numbers.subtract(var57, var58, (SubLObject)ONE_INTEGER) : var58);
                        var60 = Vectors.aref(var55, var59);
                        if (NIL == module0065.f4749(var60) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                            if (NIL != module0065.f4749(var60)) {
                                var60 = (SubLObject)$ic30$;
                            }
                            var61 = inference_datastructures_inference_oc.f25744(var60);
                            var62 = (SubLObject)NIL;
                            var62 = var61.first();
                            while (NIL != var61) {
                                var63 = inference_datastructures_inference_oc.f25775(var62);
                                var64 = conses_high.copy_list(var63);
                                var65 = (SubLObject)NIL;
                                var66 = (SubLObject)NIL;
                                while (NIL != var64 && (!var51.eql($ic29$) || NIL == var66) && (!var51.eql($ic28$) || Sequences.length(var66).numL(Sequences.length(var52)))) {
                                    var67 = var64.first();
                                    var64 = var64.rest();
                                    var14_68 = var52;
                                    var42_69 = (SubLObject)NIL;
                                    var42_69 = var14_68.first();
                                    while (NIL != var14_68) {
                                        if (NIL != f32580(module0191.f11967(var67), var42_69)) {
                                            var68 = var42_69;
                                            if (NIL == conses_high.member(var68, var66, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                var66 = (SubLObject)ConsesLow.cons(var68, var66);
                                            }
                                        }
                                        var14_68 = var14_68.rest();
                                        var42_69 = var14_68.first();
                                    }
                                    var65 = (SubLObject)ConsesLow.cons(var67, var65);
                                    var14_69 = module0191.f11977(var67);
                                    var69 = (SubLObject)NIL;
                                    var69 = var14_69.first();
                                    while (NIL != var14_69) {
                                        if (NIL == module0004.f104(var69, var65, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                            var64 = (SubLObject)ConsesLow.cons(var69, var64);
                                        }
                                        var14_69 = var14_69.rest();
                                        var69 = var14_69.first();
                                    }
                                }
                                if (NIL != var66 && (!var51.eql($ic28$) || Sequences.length(var66).numE(Sequences.length(var52)))) {
                                    var53 = (SubLObject)T;
                                    module0347.f23330(var63.first(), (SubLObject)NIL, var63.rest());
                                }
                                var61 = var61.rest();
                                var62 = var61.first();
                            }
                        }
                    }
                }
                final SubLObject var73_74 = var54;
                if (NIL != module0065.f4777(var73_74)) {
                    continue;
                }
                final SubLObject var70 = module0065.f4738(var73_74);
                SubLObject var71 = (SubLObject)NIL;
                SubLObject var72 = (SubLObject)NIL;
                final Iterator var73 = Hashtables.getEntrySetIterator(var70);
                try {
                    while (Hashtables.iteratorHasNext(var73)) {
                        final Map.Entry var74 = Hashtables.iteratorNextEntry(var73);
                        var71 = Hashtables.getEntryKey(var74);
                        var72 = Hashtables.getEntryValue(var74);
                        SubLObject var75 = inference_datastructures_inference_oc.f25744(var72);
                        SubLObject var76 = (SubLObject)NIL;
                        var76 = var75.first();
                        while (NIL != var75) {
                            final SubLObject var77 = inference_datastructures_inference_oc.f25775(var76);
                            SubLObject var78 = conses_high.copy_list(var77);
                            SubLObject var79 = (SubLObject)NIL;
                            SubLObject var80 = (SubLObject)NIL;
                            while (NIL != var78 && (!var51.eql($ic29$) || NIL == var80) && (!var51.eql($ic28$) || Sequences.length(var80).numL(Sequences.length(var52)))) {
                                final SubLObject var81 = var78.first();
                                var78 = var78.rest();
                                SubLObject var14_70 = var52;
                                SubLObject var42_70 = (SubLObject)NIL;
                                var42_70 = var14_70.first();
                                while (NIL != var14_70) {
                                    if (NIL != f32580(module0191.f11967(var81), var42_70)) {
                                        final SubLObject var82 = var42_70;
                                        if (NIL == conses_high.member(var82, var80, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var80 = (SubLObject)ConsesLow.cons(var82, var80);
                                        }
                                    }
                                    var14_70 = var14_70.rest();
                                    var42_70 = var14_70.first();
                                }
                                var79 = (SubLObject)ConsesLow.cons(var81, var79);
                                SubLObject var14_71 = module0191.f11977(var81);
                                SubLObject var83 = (SubLObject)NIL;
                                var83 = var14_71.first();
                                while (NIL != var14_71) {
                                    if (NIL == module0004.f104(var83, var79, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                        var78 = (SubLObject)ConsesLow.cons(var83, var78);
                                    }
                                    var14_71 = var14_71.rest();
                                    var83 = var14_71.first();
                                }
                            }
                            if (NIL != var80 && (!var51.eql($ic28$) || Sequences.length(var80).numE(Sequences.length(var52)))) {
                                var53 = (SubLObject)T;
                                module0347.f23330(var77.first(), (SubLObject)NIL, var77.rest());
                            }
                            var75 = var75.rest();
                            var76 = var75.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var73);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32580(final SubLObject var4, final SubLObject var81) {
        if (NIL != module0279.f18551(var4, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0269.f17716(var4.first()) && NIL != module0269.f17716(var81.first()) && NIL != module0260.f17089(var4.first(), var81.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && var4.rest().equal(var81.rest())) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32579(final SubLObject var82, final SubLObject var5, final SubLObject var6) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        var83.resetMultipleValues();
        final SubLObject var84 = module0434.f30592(var82, var5, var6);
        final SubLObject var85 = var83.secondMultipleValue();
        final SubLObject var86 = var83.thirdMultipleValue();
        var83.resetMultipleValues();
        return Values.values(var84, var85, var86);
    }
    
    public static SubLObject f32578(final SubLObject var35, final SubLObject var6) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        var36.resetMultipleValues();
        final SubLObject var37 = module0409.f28521(var35, var6);
        final SubLObject var38 = var36.secondMultipleValue();
        final SubLObject var35_83 = var36.thirdMultipleValue();
        var36.resetMultipleValues();
        return Values.values(var37, var38, var35_83);
    }
    
    public static SubLObject f32576(final SubLObject var82, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var83 = module0349.f23492(var82, var5);
        var83 = conses_high.putf(var83, (SubLObject)$ic31$, (SubLObject)ONE_INTEGER);
        var83 = conses_high.putf(var83, (SubLObject)$ic32$, (SubLObject)T);
        var83 = conses_high.putf(var83, (SubLObject)$ic33$, (SubLObject)T);
        var83 = conses_high.putf(var83, (SubLObject)$ic34$, module0450.f31011());
        final SubLObject var84 = module0339.f22757();
        if (NIL != inference_datastructures_inference_oc.f25275(var84)) {
            var83 = conses_high.putf(var83, (SubLObject)$ic35$, module0411.f28572(var84, (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)$ic36$, module0411.f28572(var84, (SubLObject)$ic36$, (SubLObject)UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)$ic37$, inference_datastructures_inference_oc.f25610(var84));
            var83 = conses_high.putf(var83, (SubLObject)$ic34$, inference_datastructures_inference_oc.f25511(var84));
        }
        else {
            var83 = conses_high.putf(var83, (SubLObject)$ic36$, (SubLObject)ONE_INTEGER);
        }
        return var83;
    }
    
    public static SubLObject f32577(final SubLObject var82, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var83 = module0349.f23492(var82, var5);
        var83 = conses_high.putf(var83, (SubLObject)$ic31$, (SubLObject)ONE_INTEGER);
        var83 = conses_high.putf(var83, (SubLObject)$ic32$, (SubLObject)T);
        final SubLObject var84 = module0339.f22757();
        if (NIL != inference_datastructures_inference_oc.f25275(var84)) {
            var83 = conses_high.putf(var83, (SubLObject)$ic35$, module0411.f28572(var84, (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)$ic36$, module0411.f28572(var84, (SubLObject)$ic36$, (SubLObject)UNPROVIDED));
        }
        else {
            var83 = conses_high.putf(var83, (SubLObject)$ic36$, (SubLObject)ONE_INTEGER);
        }
        return var83;
    }
    
    public static SubLObject f32581() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32549", "S#35991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32550", "S#35992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32551", "S#35993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32552", "S#35994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32554", "S#35995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32555", "S#35996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32556", "S#35997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32557", "S#35998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32558", "S#35999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32559", "S#36000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32560", "S#36001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32562", "S#36002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32563", "S#36003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32564", "S#36004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32565", "S#36005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32561", "S#36006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32553", "S#36007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32566", "S#36008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32567", "S#36009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32568", "S#36010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32569", "S#36011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32570", "S#36012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32571", "S#36013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32572", "S#36014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32573", "S#36015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32574", "S#36016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32575", "S#36017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32580", "S#36018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32579", "S#36019", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32578", "S#36020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32576", "S#36021", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0517", "f32577", "S#36022", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32582() {
        $g3851$ = SubLFiles.defparameter("S#36023", (SubLObject)TEN_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32583() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22938($ic16$);
        module0358.f23771((SubLObject)$ic1$, $ic16$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22938($ic19$);
        module0358.f23771((SubLObject)$ic1$, $ic19$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22938($ic22$);
        module0358.f23771((SubLObject)$ic1$, $ic22$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22938($ic25$);
        module0358.f23773((SubLObject)$ic1$, $ic25$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32581();
    }
    
    public void initializeVariables() {
        f32582();
    }
    
    public void runTopLevelForms() {
        f32583();
    }
    
    static {
        me = (SubLFile)new module0517();
        $g3851$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("queryAnswers"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("CycLQuerySpecification"));
        $ic3$ = makeKeyword("REMOVAL-QUERY-ANSWERS");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("queryAnswers")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35992", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("S#35993", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35994", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });
        $ic5$ = makeKeyword("ANSWER");
        $ic6$ = makeKeyword("BINDINGS");
        $ic7$ = makeKeyword("SUPPORTS");
        $ic8$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic9$ = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("CycInferenceAnswerJustificationFn"));
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("CycHLSupportFn"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("CycInferenceAnswerFn"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindingsAndJustifications"));
        $ic17$ = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-AND-JUSTIFICATIONS");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindingsAndJustifications")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CycInferenceAnswerFn")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#36024", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36024", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycInferenceAnswerFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#36026", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36026", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#36026", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36024", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#36026", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("queryBindings"));
        $ic20$ = makeKeyword("REMOVAL-QUERY-BINDINGS");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("queryBindings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#36008", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("S#36009", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#36010", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("queryVariable"));
        $ic23$ = makeKeyword("REMOVAL-QUERY-VARIABLE");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("queryVariable")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#36012", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("S#36013", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#36014", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#33256", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("justification-Partial"));
        $ic26$ = makeKeyword("REMOVAL-JUSTIFICATION-PARTIAL");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("justification-Partial")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("justification-Partial")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36017", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$justification-Partial <fully-bound> <fully-bound>)\n    by recursively querying ASKABLE-SENTENCE and succeeding if the answer justifications contain the JUSTIFICATION-SENTENCE"), makeKeyword("EXAMPLE"), makeString("(#$justification-Partial (#$genls #$Dog #$Animal) (#$genls #$Dog #$CanisGenus))") });
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic30$ = makeKeyword("SKIP");
        $ic31$ = makeKeyword("MAX-NUMBER");
        $ic32$ = makeKeyword("CONTINUABLE?");
        $ic33$ = makeKeyword("BROWSABLE?");
        $ic34$ = makeKeyword("ALLOWED-MODULES");
        $ic35$ = makeKeyword("MAX-TIME");
        $ic36$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic37$ = makeKeyword("ALLOWED-RULES");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 349 ms
	
	Decompiled with Procyon 0.5.32.
*/