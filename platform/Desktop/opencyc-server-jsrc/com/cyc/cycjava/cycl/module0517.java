package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return module0259.f16854(var1, module0517.$ic2$, (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED);
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
        return (SubLObject)module0517.ONE_INTEGER;
    }
    
    public static SubLObject f32552(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32554(var4, var6);
        if (module0517.NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32554(final SubLObject var8, final SubLObject var10) {
        if (module0517.NIL == var8) {
            return (SubLObject)module0517.NIL;
        }
        if (var10.eql((SubLObject)module0517.$ic5$)) {
            return f32555(var8);
        }
        if (var10.eql((SubLObject)module0517.$ic6$)) {
            return f32556(var8);
        }
        if (var10.eql((SubLObject)module0517.$ic7$)) {
            return f32557(var8);
        }
        if (var10.eql((SubLObject)module0517.$ic8$)) {
            return f32558(var8);
        }
        if (var10.eql((SubLObject)module0517.$ic9$)) {
            return f32559(var8);
        }
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32555(final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0517.NIL;
        SubLObject var15 = var13;
        SubLObject var16 = (SubLObject)module0517.NIL;
        var16 = var15.first();
        while (module0517.NIL != var15) {
            final SubLObject var17 = module0233.f15414(module0369.f25687(var16));
            final SubLObject var18 = f32560(module0369.f25744(var16));
            var14 = (SubLObject)ConsesLow.cons(f32561(var17, var18), var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f32556(final SubLObject var18) {
        SubLObject var19 = (SubLObject)module0517.NIL;
        SubLObject var20 = var18;
        SubLObject var21 = (SubLObject)module0517.NIL;
        var21 = var20.first();
        while (module0517.NIL != var20) {
            final SubLObject var22 = f32560((SubLObject)module0517.NIL);
            var19 = (SubLObject)ConsesLow.cons(f32561(module0233.f15414(var21), var22), var19);
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f32557(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0517.NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)module0517.NIL;
        var22 = var21.first();
        while (module0517.NIL != var21) {
            final SubLObject var23 = module0233.f15414((SubLObject)module0517.NIL);
            final SubLObject var24 = f32562(var22);
            var20 = (SubLObject)ConsesLow.cons(f32561(var23, var24), var20);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f32558(final SubLObject var21) {
        SubLObject var22 = (SubLObject)module0517.NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0517.NIL;
        var24 = var23.first();
        while (module0517.NIL != var23) {
            final SubLObject var25 = module0233.f15414(var24.first());
            final SubLObject var26 = f32562(conses_high.second(var24));
            var22 = (SubLObject)ConsesLow.cons(f32561(var25, var26), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Sequences.nreverse(var22);
    }
    
    public static SubLObject f32559(final SubLObject var23) {
        SubLObject var24 = (SubLObject)module0517.NIL;
        final SubLObject var25 = var23.first();
        final SubLObject var26 = conses_high.second(var23);
        final SubLObject var27 = f32562((SubLObject)module0517.NIL);
        SubLObject var28 = var25;
        SubLObject var29 = (SubLObject)module0517.NIL;
        var29 = var28.first();
        while (module0517.NIL != var28) {
            var29 = module0233.f15414(ConsesLow.append(var29, var26));
            var24 = (SubLObject)ConsesLow.cons(f32561(var29, var27), var24);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var24);
    }
    
    public static SubLObject f32560(final SubLObject var17) {
        if (module0517.NIL == var17) {
            return module0517.$ic10$;
        }
        SubLObject var18 = (SubLObject)module0517.NIL;
        SubLObject var19 = var17;
        SubLObject var20 = (SubLObject)module0517.NIL;
        var20 = var19.first();
        while (module0517.NIL != var19) {
            var18 = (SubLObject)ConsesLow.cons(f32563(module0369.f25775(var20)), var18);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return module0202.f12683(module0517.$ic11$, var18, (SubLObject)module0517.UNPROVIDED);
    }
    
    public static SubLObject f32562(final SubLObject var20) {
        if (module0517.NIL == var20) {
            return module0517.$ic10$;
        }
        SubLObject var21 = (SubLObject)module0517.NIL;
        var21 = (SubLObject)ConsesLow.cons(f32563(var20), var21);
        return module0202.f12683(module0517.$ic11$, var21, (SubLObject)module0517.UNPROVIDED);
    }
    
    public static SubLObject f32563(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0517.NIL;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)module0517.NIL;
        var23 = var22.first();
        while (module0517.NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons(f32564(var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        var21 = module0202.f12683(module0517.$ic11$, Sequences.nreverse(var21), (SubLObject)module0517.UNPROVIDED);
        return (SubLObject)ConsesLow.list(module0517.$ic12$, var21);
    }
    
    public static SubLObject f32564(final SubLObject var28) {
        if (module0517.NIL != module0174.f11035(var28)) {
            return var28;
        }
        if (module0517.NIL != module0191.f11952(var28)) {
            return f32565(var28);
        }
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32565(final SubLObject var28) {
        SubLObject var29 = (SubLObject)module0517.NIL;
        SubLObject var30 = (SubLObject)module0517.NIL;
        SubLObject var31 = (SubLObject)module0517.NIL;
        SubLObject var32 = (SubLObject)module0517.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var28, (SubLObject)module0517.$ic13$);
        var29 = var28.first();
        SubLObject var33 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)module0517.$ic13$);
        var30 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)module0517.$ic13$);
        var31 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var28, (SubLObject)module0517.$ic13$);
        var32 = var33.first();
        var33 = var33.rest();
        if (module0517.NIL == var33) {
            final SubLObject var34 = module0423.f29613(var29);
            final SubLObject var35 = module0423.f29615(var32);
            return (SubLObject)ConsesLow.list(module0517.$ic14$, var34, var30, var31, var35);
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0517.$ic13$);
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32561(final SubLObject var16, final SubLObject var17) {
        return (SubLObject)ConsesLow.list(module0517.$ic15$, var16, var17);
    }
    
    public static SubLObject f32553(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0423.f29604(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = module0360.f23960(var6);
        if (module0517.NIL != module0360.f23961(var7)) {
            return Values.values((SubLObject)module0517.NIL, (SubLObject)module0517.NIL, var7);
        }
        var3.resetMultipleValues();
        final SubLObject var8 = module0409.f28506(var4, var5, var6);
        final SubLObject var9 = var3.secondMultipleValue();
        final SubLObject var10 = var3.thirdMultipleValue();
        final SubLObject var11 = var3.fourthMultipleValue();
        var3.resetMultipleValues();
        if (module0517.NIL != module0369.f25417(var10)) {
            module0369.f25476(var10);
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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0517.NIL != module0360.f23959(var6) && module0517.$ic7$ != module0360.f23960(var6));
    }
    
    public static SubLObject f32567(final SubLObject var7) {
        return (SubLObject)module0517.ONE_INTEGER;
    }
    
    public static SubLObject f32568(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32569(var4, var6);
        if (module0517.NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32569(final SubLObject var8, final SubLObject var10) {
        if (module0517.NIL == var8) {
            return (SubLObject)module0517.NIL;
        }
        SubLObject var11 = (SubLObject)module0517.NIL;
        if (var10.eql((SubLObject)module0517.$ic5$)) {
            SubLObject var12 = var8;
            SubLObject var13 = (SubLObject)module0517.NIL;
            var13 = var12.first();
            while (module0517.NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(module0369.f25687(var13)), var11);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic6$)) {
            SubLObject var12 = var8;
            SubLObject var14 = (SubLObject)module0517.NIL;
            var14 = var12.first();
            while (module0517.NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(var14), var11);
                var12 = var12.rest();
                var14 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic8$)) {
            SubLObject var12 = var8;
            SubLObject var15 = (SubLObject)module0517.NIL;
            var15 = var12.first();
            while (module0517.NIL != var12) {
                var11 = (SubLObject)ConsesLow.cons(module0233.f15414(var15.first()), var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic9$)) {
            final SubLObject var16 = var8.first();
            final SubLObject var17 = conses_high.second(var8);
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0517.NIL;
            var19 = var18.first();
            while (module0517.NIL != var18) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0517.NIL != module0360.f23959(var6) && module0517.$ic7$ != module0360.f23960(var6) && module0517.NIL != module0035.f1997(module0202.f12911(var4, (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED)));
    }
    
    public static SubLObject f32571(final SubLObject var7) {
        return (SubLObject)module0517.ONE_INTEGER;
    }
    
    public static SubLObject f32572(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f32553(var2);
        final SubLObject var5 = var3.secondMultipleValue();
        final SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var7 = f32573(var4, var6);
        if (module0517.NIL != var7) {
            return module0052.f3709(var7);
        }
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32573(final SubLObject var8, final SubLObject var10) {
        if (module0517.NIL == var8) {
            return (SubLObject)module0517.NIL;
        }
        SubLObject var11 = (SubLObject)module0517.NIL;
        if (var10.eql((SubLObject)module0517.$ic5$)) {
            SubLObject var12 = var8;
            SubLObject var13 = (SubLObject)module0517.NIL;
            var13 = var12.first();
            while (module0517.NIL != var12) {
                final SubLObject var14 = f32574(module0369.f25687(var13));
                if (module0517.NIL == var14) {
                    return (SubLObject)module0517.NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic6$)) {
            SubLObject var12 = var8;
            SubLObject var15 = (SubLObject)module0517.NIL;
            var15 = var12.first();
            while (module0517.NIL != var12) {
                final SubLObject var14 = f32574(var15);
                if (module0517.NIL == var14) {
                    return (SubLObject)module0517.NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic8$)) {
            SubLObject var12 = var8;
            SubLObject var16 = (SubLObject)module0517.NIL;
            var16 = var12.first();
            while (module0517.NIL != var12) {
                final SubLObject var14 = f32574(var16.first());
                if (module0517.NIL == var14) {
                    return (SubLObject)module0517.NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var16 = var12.first();
            }
        }
        else if (var10.eql((SubLObject)module0517.$ic9$)) {
            SubLObject var12 = var8.first();
            SubLObject var15 = (SubLObject)module0517.NIL;
            var15 = var12.first();
            while (module0517.NIL != var12) {
                final SubLObject var14 = f32574(var15);
                if (module0517.NIL == var14) {
                    return (SubLObject)module0517.NIL;
                }
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var12.rest();
                var15 = var12.first();
            }
        }
        var11 = Sequences.nreverse(var11);
        return (SubLObject)ConsesLow.list(module0202.f12791(var11, (SubLObject)module0517.UNPROVIDED));
    }
    
    public static SubLObject f32574(final SubLObject var39) {
        if (module0517.NIL == module0035.f1997(var39)) {
            return (SubLObject)module0517.NIL;
        }
        return module0233.f15370(var39.first());
    }
    
    public static SubLObject f32575(final SubLObject var7, SubLObject var40) {
        if (var40 == module0517.UNPROVIDED) {
            var40 = (SubLObject)module0517.NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0147.$g2095$.getDynamicValue(var41);
        final SubLObject var43 = module0205.f13387(var7, (SubLObject)module0517.UNPROVIDED);
        final SubLObject var44 = module0205.f13388(var7, (SubLObject)module0517.UNPROVIDED);
        final SubLObject var45 = f32576(var7, var42);
        final SubLObject var46 = f32577(var7, var42);
        SubLObject var47 = (SubLObject)module0517.ZERO_INTEGER;
        SubLObject var48 = (SubLObject)module0517.NIL;
        SubLObject var49 = (SubLObject)module0517.NIL;
        SubLObject var50 = (SubLObject)module0517.NIL;
        SubLObject var51 = (SubLObject)module0517.NIL;
        SubLObject var52 = (SubLObject)module0517.NIL;
        SubLObject var53 = (SubLObject)module0517.NIL;
        if (module0517.NIL != module0202.f12595(var44)) {
            var52 = module0205.f13385(var44, (SubLObject)module0517.UNPROVIDED);
            var51 = module0517.$ic28$;
        }
        else if (module0517.NIL != module0202.f12594(var44)) {
            var52 = module0205.f13385(var44, (SubLObject)module0517.UNPROVIDED);
            var51 = module0517.$ic29$;
        }
        else {
            var52 = (SubLObject)ConsesLow.list(var44);
            var51 = module0517.$ic28$;
        }
        while (module0517.NIL == var53 && var47.numL(module0517.$g3851$.getDynamicValue(var41))) {
            var47 = Numbers.add(var47, (SubLObject)module0517.ONE_INTEGER);
            var41.resetMultipleValues();
            final SubLObject var49_50 = (module0517.NIL != var50) ? f32578(var50, var46) : f32579(var43, var42, var45);
            final SubLObject var51_52 = var41.secondMultipleValue();
            final SubLObject var53_54 = var41.thirdMultipleValue();
            var41.resetMultipleValues();
            var48 = var49_50;
            var49 = var51_52;
            var50 = var53_54;
            var53 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(Sequences.length(module0369.f25744(module0369.f25656(var50).first()))));
            if (module0517.NIL == var53) {
                final SubLObject var54 = module0369.f25492(var50);
                if (module0517.NIL != module0065.f4772(var54, (SubLObject)module0517.$ic30$)) {
                    continue;
                }
                final SubLObject var56_57 = var54;
                if (module0517.NIL == module0065.f4775(var56_57, (SubLObject)module0517.$ic30$)) {
                    final SubLObject var55 = module0065.f4740(var56_57);
                    final SubLObject var56 = (SubLObject)module0517.NIL;
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
                    for (var57 = Sequences.length(var55), var58 = (SubLObject)module0517.NIL, var58 = (SubLObject)module0517.ZERO_INTEGER; var58.numL(var57); var58 = Numbers.add(var58, (SubLObject)module0517.ONE_INTEGER)) {
                        var59 = ((module0517.NIL != var56) ? Numbers.subtract(var57, var58, (SubLObject)module0517.ONE_INTEGER) : var58);
                        var60 = Vectors.aref(var55, var59);
                        if (module0517.NIL == module0065.f4749(var60) || module0517.NIL == module0065.f4773((SubLObject)module0517.$ic30$)) {
                            if (module0517.NIL != module0065.f4749(var60)) {
                                var60 = (SubLObject)module0517.$ic30$;
                            }
                            var61 = module0369.f25744(var60);
                            var62 = (SubLObject)module0517.NIL;
                            var62 = var61.first();
                            while (module0517.NIL != var61) {
                                var63 = module0369.f25775(var62);
                                var64 = conses_high.copy_list(var63);
                                var65 = (SubLObject)module0517.NIL;
                                var66 = (SubLObject)module0517.NIL;
                                while (module0517.NIL != var64 && (!var51.eql(module0517.$ic29$) || module0517.NIL == var66) && (!var51.eql(module0517.$ic28$) || Sequences.length(var66).numL(Sequences.length(var52)))) {
                                    var67 = var64.first();
                                    var64 = var64.rest();
                                    var14_68 = var52;
                                    var42_69 = (SubLObject)module0517.NIL;
                                    var42_69 = var14_68.first();
                                    while (module0517.NIL != var14_68) {
                                        if (module0517.NIL != f32580(module0191.f11967(var67), var42_69)) {
                                            var68 = var42_69;
                                            if (module0517.NIL == conses_high.member(var68, var66, Symbols.symbol_function((SubLObject)module0517.EQL), Symbols.symbol_function((SubLObject)module0517.IDENTITY))) {
                                                var66 = (SubLObject)ConsesLow.cons(var68, var66);
                                            }
                                        }
                                        var14_68 = var14_68.rest();
                                        var42_69 = var14_68.first();
                                    }
                                    var65 = (SubLObject)ConsesLow.cons(var67, var65);
                                    var14_69 = module0191.f11977(var67);
                                    var69 = (SubLObject)module0517.NIL;
                                    var69 = var14_69.first();
                                    while (module0517.NIL != var14_69) {
                                        if (module0517.NIL == module0004.f104(var69, var65, Symbols.symbol_function((SubLObject)module0517.EQUAL), (SubLObject)module0517.UNPROVIDED)) {
                                            var64 = (SubLObject)ConsesLow.cons(var69, var64);
                                        }
                                        var14_69 = var14_69.rest();
                                        var69 = var14_69.first();
                                    }
                                }
                                if (module0517.NIL != var66 && (!var51.eql(module0517.$ic28$) || Sequences.length(var66).numE(Sequences.length(var52)))) {
                                    var53 = (SubLObject)module0517.T;
                                    module0347.f23330(var63.first(), (SubLObject)module0517.NIL, var63.rest());
                                }
                                var61 = var61.rest();
                                var62 = var61.first();
                            }
                        }
                    }
                }
                final SubLObject var73_74 = var54;
                if (module0517.NIL != module0065.f4777(var73_74)) {
                    continue;
                }
                final SubLObject var70 = module0065.f4738(var73_74);
                SubLObject var71 = (SubLObject)module0517.NIL;
                SubLObject var72 = (SubLObject)module0517.NIL;
                final Iterator var73 = Hashtables.getEntrySetIterator(var70);
                try {
                    while (Hashtables.iteratorHasNext(var73)) {
                        final Map.Entry var74 = Hashtables.iteratorNextEntry(var73);
                        var71 = Hashtables.getEntryKey(var74);
                        var72 = Hashtables.getEntryValue(var74);
                        SubLObject var75 = module0369.f25744(var72);
                        SubLObject var76 = (SubLObject)module0517.NIL;
                        var76 = var75.first();
                        while (module0517.NIL != var75) {
                            final SubLObject var77 = module0369.f25775(var76);
                            SubLObject var78 = conses_high.copy_list(var77);
                            SubLObject var79 = (SubLObject)module0517.NIL;
                            SubLObject var80 = (SubLObject)module0517.NIL;
                            while (module0517.NIL != var78 && (!var51.eql(module0517.$ic29$) || module0517.NIL == var80) && (!var51.eql(module0517.$ic28$) || Sequences.length(var80).numL(Sequences.length(var52)))) {
                                final SubLObject var81 = var78.first();
                                var78 = var78.rest();
                                SubLObject var14_70 = var52;
                                SubLObject var42_70 = (SubLObject)module0517.NIL;
                                var42_70 = var14_70.first();
                                while (module0517.NIL != var14_70) {
                                    if (module0517.NIL != f32580(module0191.f11967(var81), var42_70)) {
                                        final SubLObject var82 = var42_70;
                                        if (module0517.NIL == conses_high.member(var82, var80, Symbols.symbol_function((SubLObject)module0517.EQL), Symbols.symbol_function((SubLObject)module0517.IDENTITY))) {
                                            var80 = (SubLObject)ConsesLow.cons(var82, var80);
                                        }
                                    }
                                    var14_70 = var14_70.rest();
                                    var42_70 = var14_70.first();
                                }
                                var79 = (SubLObject)ConsesLow.cons(var81, var79);
                                SubLObject var14_71 = module0191.f11977(var81);
                                SubLObject var83 = (SubLObject)module0517.NIL;
                                var83 = var14_71.first();
                                while (module0517.NIL != var14_71) {
                                    if (module0517.NIL == module0004.f104(var83, var79, Symbols.symbol_function((SubLObject)module0517.EQUAL), (SubLObject)module0517.UNPROVIDED)) {
                                        var78 = (SubLObject)ConsesLow.cons(var83, var78);
                                    }
                                    var14_71 = var14_71.rest();
                                    var83 = var14_71.first();
                                }
                            }
                            if (module0517.NIL != var80 && (!var51.eql(module0517.$ic28$) || Sequences.length(var80).numE(Sequences.length(var52)))) {
                                var53 = (SubLObject)module0517.T;
                                module0347.f23330(var77.first(), (SubLObject)module0517.NIL, var77.rest());
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
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32580(final SubLObject var4, final SubLObject var81) {
        if (module0517.NIL != module0279.f18551(var4, var81, (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED)) {
            return (SubLObject)module0517.T;
        }
        if (module0517.NIL != module0269.f17716(var4.first()) && module0517.NIL != module0269.f17716(var81.first()) && module0517.NIL != module0260.f17089(var4.first(), var81.first(), (SubLObject)module0517.UNPROVIDED, (SubLObject)module0517.UNPROVIDED) && var4.rest().equal(var81.rest())) {
            return (SubLObject)module0517.T;
        }
        return (SubLObject)module0517.NIL;
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
        if (var5 == module0517.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var83 = module0349.f23492(var82, var5);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic31$, (SubLObject)module0517.ONE_INTEGER);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic32$, (SubLObject)module0517.T);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic33$, (SubLObject)module0517.T);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic34$, module0450.f31011());
        final SubLObject var84 = module0339.f22757();
        if (module0517.NIL != module0369.f25275(var84)) {
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic35$, module0411.f28572(var84, (SubLObject)module0517.$ic35$, (SubLObject)module0517.UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic36$, module0411.f28572(var84, (SubLObject)module0517.$ic36$, (SubLObject)module0517.UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic37$, module0369.f25610(var84));
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic34$, module0369.f25511(var84));
        }
        else {
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic36$, (SubLObject)module0517.ONE_INTEGER);
        }
        return var83;
    }
    
    public static SubLObject f32577(final SubLObject var82, SubLObject var5) {
        if (var5 == module0517.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var83 = module0349.f23492(var82, var5);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic31$, (SubLObject)module0517.ONE_INTEGER);
        var83 = conses_high.putf(var83, (SubLObject)module0517.$ic32$, (SubLObject)module0517.T);
        final SubLObject var84 = module0339.f22757();
        if (module0517.NIL != module0369.f25275(var84)) {
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic35$, module0411.f28572(var84, (SubLObject)module0517.$ic35$, (SubLObject)module0517.UNPROVIDED));
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic36$, module0411.f28572(var84, (SubLObject)module0517.$ic36$, (SubLObject)module0517.UNPROVIDED));
        }
        else {
            var83 = conses_high.putf(var83, (SubLObject)module0517.$ic36$, (SubLObject)module0517.ONE_INTEGER);
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
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32582() {
        module0517.$g3851$ = SubLFiles.defparameter("S#36023", (SubLObject)module0517.TEN_INTEGER);
        return (SubLObject)module0517.NIL;
    }
    
    public static SubLObject f32583() {
        module0340.f22938(module0517.$ic0$);
        module0358.f23771((SubLObject)module0517.$ic1$, module0517.$ic0$, (SubLObject)module0517.ONE_INTEGER);
        module0340.f22941((SubLObject)module0517.$ic3$, (SubLObject)module0517.$ic4$);
        module0340.f22938(module0517.$ic16$);
        module0358.f23771((SubLObject)module0517.$ic1$, module0517.$ic16$, (SubLObject)module0517.ONE_INTEGER);
        module0340.f22941((SubLObject)module0517.$ic17$, (SubLObject)module0517.$ic18$);
        module0340.f22938(module0517.$ic19$);
        module0358.f23771((SubLObject)module0517.$ic1$, module0517.$ic19$, (SubLObject)module0517.ONE_INTEGER);
        module0340.f22941((SubLObject)module0517.$ic20$, (SubLObject)module0517.$ic21$);
        module0340.f22938(module0517.$ic22$);
        module0358.f23771((SubLObject)module0517.$ic1$, module0517.$ic22$, (SubLObject)module0517.ONE_INTEGER);
        module0340.f22941((SubLObject)module0517.$ic23$, (SubLObject)module0517.$ic24$);
        module0340.f22938(module0517.$ic25$);
        module0358.f23773((SubLObject)module0517.$ic1$, module0517.$ic25$);
        module0340.f22941((SubLObject)module0517.$ic26$, (SubLObject)module0517.$ic27$);
        return (SubLObject)module0517.NIL;
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
        module0517.$g3851$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryAnswers"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-ANSWERS");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryAnswers")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35992", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35993", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35994", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });
        $ic5$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic6$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic7$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic8$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic9$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerJustificationFn"));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycHLSupportFn"));
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn"));
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications"));
        $ic17$ = SubLObjectFactory.makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-AND-JUSTIFICATIONS");
        $ic18$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0517.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#36024", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36024", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#36026", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36026", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#36026", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36024", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36025", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36026", "CYC")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryBindings"));
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-BINDINGS");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryBindings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#36008", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36009", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#36010", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryVariable"));
        $ic23$ = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-VARIABLE");
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryVariable")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#36012", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36013", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#36014", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33256", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("justification-Partial"));
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-JUSTIFICATION-PARTIAL");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("justification-Partial")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("justification-Partial")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36017", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$justification-Partial <fully-bound> <fully-bound>)\n    by recursively querying ASKABLE-SENTENCE and succeeding if the answer justifications contain the JUSTIFICATION-SENTENCE"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$justification-Partial (#$genls #$Dog #$Animal) (#$genls #$Dog #$CanisGenus))") });
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic30$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic31$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic32$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic33$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic34$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic35$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic36$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic37$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0517.class
	Total time: 349 ms
	
	Decompiled with Procyon 0.5.32.
*/