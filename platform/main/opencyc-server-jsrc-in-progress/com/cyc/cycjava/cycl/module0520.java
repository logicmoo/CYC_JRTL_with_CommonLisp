package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0520 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0520";
    public static final String myFingerPrint = "03939678cf6f17fd229b98c77acebcedb494d0409608be350f2ad4810cd31e73";
    private static SubLSymbol $g3853$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLString $ic72$;
    private static final SubLList $ic73$;
    private static final SubLString $ic74$;
    private static final SubLList $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLFloat $ic78$;
    private static final SubLFloat $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLObject $ic85$;
    
    public static SubLObject f32598(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f32599(var1, (SubLObject)$ic4$);
    }
    
    public static SubLObject f32600(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f32599(var1, (SubLObject)$ic8$);
    }
    
    public static SubLObject f32601(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f32599(var1, (SubLObject)$ic12$);
    }
    
    public static SubLObject f32599(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var5)) {
            final SubLObject var7 = module0202.f12684(var5);
            if (NIL != var7 && NIL != module0035.f2370((SubLObject)$ic13$, var7, (SubLObject)UNPROVIDED)) {
                var4.resetMultipleValues();
                final SubLObject var8 = f32602(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var9 = var4.secondMultipleValue();
                final SubLObject var10 = var4.thirdMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8 && NIL != var9 && NIL != var10) {
                    SubLObject var12;
                    final SubLObject var11 = var12 = var6;
                    SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic14$);
                    var13 = var12.first();
                    var12 = var12.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic14$);
                    var14 = var12.first();
                    var12 = var12.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic14$);
                    var15 = var12.first();
                    var12 = var12.rest();
                    if (NIL == var12) {
                        if (NIL != module0193.f12106(var15)) {
                            var4.resetMultipleValues();
                            final SubLObject var16 = module0610.f37199(var14);
                            final SubLObject var17 = var4.secondMultipleValue();
                            var4.resetMultipleValues();
                            final SubLObject var18 = module0610.f37207(var9, var16, var17, (SubLObject)UNPROVIDED);
                            final SubLObject var19 = Functions.funcall(var3, var8, var18);
                            if (NIL != var19) {
                                final SubLObject var20 = module0610.f37198(var10, var19, (SubLObject)UNPROVIDED);
                                final SubLObject var21 = module0610.f37232(var15, var20);
                                module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var21, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var21, (SubLObject)UNPROVIDED);
                            }
                        }
                        else {
                            final SubLObject var22 = Mapping.mapcar((SubLObject)$ic16$, var8);
                            var4.resetMultipleValues();
                            final SubLObject var23 = module0610.f37199(var15);
                            final SubLObject var24 = var4.secondMultipleValue();
                            var4.resetMultipleValues();
                            final SubLObject var25 = module0610.f37207(var10, var23, var24, (SubLObject)UNPROVIDED);
                            final SubLObject var26 = Functions.funcall(var3, var22, var25);
                            if (NIL != var26) {
                                final SubLObject var27 = module0610.f37198(var9, var26, (SubLObject)UNPROVIDED);
                                final SubLObject var28 = module0610.f37232(var14, var27);
                                module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var28, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var28, (SubLObject)UNPROVIDED);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic14$);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32603(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var4) && NIL != module0202.f12677(var5)) {
            final SubLObject var7 = module0202.f12684(var4);
            final SubLObject var8 = module0202.f12684(var5);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var7, (SubLObject)UNPROVIDED) && NIL != module0035.f2370((SubLObject)$ic13$, var8, (SubLObject)UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var9 = f32602(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var10 = var3.secondMultipleValue();
                final SubLObject var11 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var12 = f32602(var8, var10, var11);
                var3.resetMultipleValues();
                final SubLObject var13 = f32604(var9, var12);
                final SubLObject var14 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (var13.isNumber() && var14.isNumber()) {
                    if (NIL != module0193.f12067(var6)) {
                        final SubLObject var15 = (SubLObject)ConsesLow.list($ic20$, module0610.f37198(var10, var13, (SubLObject)UNPROVIDED), module0610.f37198(var11, var14, (SubLObject)UNPROVIDED));
                        final SubLObject var16 = module0610.f37232(var6, var15);
                        module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var16, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var16, (SubLObject)UNPROVIDED);
                    }
                    else {
                        final SubLObject var17 = ConsesLow.append(module0610.f37232(conses_high.second(var6), module0610.f37198(var10, var13, (SubLObject)UNPROVIDED)), module0610.f37232(conses_high.third(var6), module0610.f37198(var11, var14, (SubLObject)UNPROVIDED)));
                        module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var17, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var17, (SubLObject)UNPROVIDED);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32605(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var4)) {
            final SubLObject var6 = module0202.f12684(var4);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var6, (SubLObject)UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var7 = f32602(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var8 = var3.secondMultipleValue();
                final SubLObject var9 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var10 = f32606(var7);
                final SubLObject var11 = module0610.f37232(var5, module0610.f37198((SubLObject)ConsesLow.list($ic24$, var9, var8), var10, (SubLObject)UNPROVIDED));
                final SubLObject var12 = module0610.f37232(var5, module0610.f37198((SubLObject)ConsesLow.list($ic24$, var8, var9), Numbers.divide((SubLObject)ONE_INTEGER, var10), (SubLObject)UNPROVIDED));
                if (NIL != var11) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var11, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11, (SubLObject)UNPROVIDED);
                }
                if (NIL != var12) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var12, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var12, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32607(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var4)) {
            final SubLObject var7 = module0202.f12684(var4);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var7, (SubLObject)UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var8 = f32602(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var9 = var3.secondMultipleValue();
                final SubLObject var10 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var11 = f32608(var8, var5);
                final SubLObject var12 = (SubLObject)ConsesLow.list($ic24$, var10, var9);
                SubLObject var13 = (SubLObject)NIL;
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = var11;
                SubLObject var16 = (SubLObject)NIL;
                var16 = var15.first();
                while (NIL != var15) {
                    var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic20$, (SubLObject)ConsesLow.list(var9, var16.first()), (SubLObject)ConsesLow.list(var12, conses_high.second(var16))), var13);
                    var15 = var15.rest();
                    var16 = var15.first();
                }
                var13 = module0202.f12681(Sequences.nreverse(var13));
                var14 = module0235.f15474(var13, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var14) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var14, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var14, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32609(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13390(var1, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13391(var1, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0205.f13392(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var4) && NIL != module0202.f12677(var5) && NIL != module0269.f17708(var6) && module0225.f14739(var6).eql((SubLObject)TWO_INTEGER) && NIL != module0226.f14807(var7)) {
            final SubLObject var10 = module0202.f12684(var4);
            final SubLObject var11 = module0202.f12684(var5);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var10, (SubLObject)UNPROVIDED) && NIL != module0035.f2370((SubLObject)$ic13$, var11, (SubLObject)UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var12 = f32602(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var13 = var3.secondMultipleValue();
                final SubLObject var14 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var15 = f32602(var11, var13, var14);
                final SubLObject var16 = conses_high.second(module0610.f37238(var14, var8));
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = var12;
                SubLObject var19 = (SubLObject)NIL;
                var19 = var18.first();
                while (NIL != var18) {
                    final SubLObject var20 = var19.first();
                    final SubLObject var21 = conses_high.second(var19);
                    final SubLObject var22 = conses_high.second(Sequences.find(var20, var15, (SubLObject)EQL, (SubLObject)$ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    if (NIL != var22 && NIL != module0347.f23334((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list(var6, var21, var22), var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var17 = (SubLObject)ConsesLow.cons(var19, var17);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
                SubLObject var23 = (SubLObject)NIL;
                SubLObject var24 = var17;
                SubLObject var25 = (SubLObject)NIL;
                var25 = var24.first();
                while (NIL != var24) {
                    var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic20$, (SubLObject)ConsesLow.list(var13, var25.first()), (SubLObject)ConsesLow.list(var14, conses_high.second(var25))), var23);
                    var24 = var24.rest();
                    var25 = var24.first();
                }
                var23 = module0202.f12681(Sequences.nreverse(var23));
                final SubLObject var26 = module0235.f15474(var23, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var26) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var26, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var26, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32610() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0018.$g629$.getDynamicValue(var4);
    }
    
    public static SubLObject f32606(final SubLObject var8) {
        final SubLObject var9 = JavaLink._new((Object)$ic32$, new Object[0]);
        final SubLObject var10 = JavaLink._method((Object)$ic32$, (Object)$ic33$, new Object[] { $ic34$, $ic34$ });
        final SubLObject var11 = JavaLink._method((Object)$ic32$, (Object)$ic35$, new Object[0]);
        final SubLObject var12 = JavaLink._method((Object)$ic32$, (Object)$ic36$, new Object[0]);
        SubLObject var13 = var8;
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            JavaLink._call((Object)var10, (Object)var9, new Object[] { var14.first(), conses_high.second(var14) });
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Values.values(JavaLink._call((Object)var11, (Object)var9, new Object[0]), JavaLink._call((Object)var12, (Object)var9, new Object[0]));
    }
    
    public static SubLObject f32611(SubLObject var8, final SubLObject var66) {
        if (var66.numL(Functions.apply((SubLObject)$ic37$, Mapping.mapcar((SubLObject)$ic31$, var8))) || var66.numG(Functions.apply((SubLObject)$ic38$, Mapping.mapcar((SubLObject)$ic31$, var8))) || (NIL == f32610() && NIL != module0035.f2194(Mapping.mapcar((SubLObject)$ic31$, var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return (SubLObject)NIL;
        }
        final SubLObject var67 = JavaLink._new((Object)$ic39$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)$ic39$, (Object)$ic40$, new Object[] { $ic41$, $ic41$ });
        final SubLObject var69 = JavaLink._method((Object)$ic42$, (Object)$ic43$, new Object[] { $ic34$ });
        var8 = Sort.sort(var8, (SubLObject)$ic44$, (SubLObject)$ic31$);
        final SubLObject var70 = JavaLink._call((Object)var68, (Object)var67, new Object[] { Mapping.mapcar((SubLObject)$ic31$, var8), Mapping.mapcar((SubLObject)$ic45$, var8) });
        return JavaLink._call((Object)var69, (Object)var70, new Object[] { var66 });
    }
    
    public static SubLObject f32612(SubLObject var8, final SubLObject var66) {
        if (var66.numL(Functions.apply((SubLObject)$ic37$, Mapping.mapcar((SubLObject)$ic31$, var8))) || var66.numG(Functions.apply((SubLObject)$ic38$, Mapping.mapcar((SubLObject)$ic31$, var8))) || (NIL == f32610() && NIL != module0035.f2194(Mapping.mapcar((SubLObject)$ic31$, var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return (SubLObject)NIL;
        }
        final SubLObject var67 = JavaLink._new((Object)$ic46$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)$ic46$, (Object)$ic40$, new Object[] { $ic41$, $ic41$ });
        final SubLObject var69 = JavaLink._method((Object)$ic42$, (Object)$ic43$, new Object[] { $ic34$ });
        var8 = Sort.sort(var8, (SubLObject)$ic44$, (SubLObject)$ic31$);
        final SubLObject var70 = JavaLink._call((Object)var68, (Object)var67, new Object[] { Mapping.mapcar((SubLObject)$ic31$, var8), Mapping.mapcar((SubLObject)$ic45$, var8) });
        return JavaLink._call((Object)var69, (Object)var70, new Object[] { var66 });
    }
    
    public static SubLObject f32613(final SubLObject var8, final SubLObject var66) {
        final SubLObject var67 = JavaLink._new((Object)$ic32$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)$ic32$, (Object)$ic33$, new Object[] { $ic34$, $ic34$ });
        final SubLObject var69 = JavaLink._method((Object)$ic32$, (Object)$ic47$, new Object[] { $ic34$ });
        SubLObject var70 = var8;
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            JavaLink._call((Object)var68, (Object)var67, new Object[] { var71.first(), conses_high.second(var71) });
            var70 = var70.rest();
            var71 = var70.first();
        }
        return JavaLink._call((Object)var69, (Object)var67, new Object[] { var66 });
    }
    
    public static SubLObject f32604(final SubLObject var32, final SubLObject var33) {
        if (NIL == var32 || NIL != module0035.f1997(var32) || NIL == var33 || NIL != module0035.f1997(var33)) {
            return (SubLObject)NIL;
        }
        final SubLObject var34 = JavaLink._new((Object)$ic32$, new Object[0]);
        final SubLObject var35 = JavaLink._new((Object)$ic32$, new Object[0]);
        final SubLObject var36 = JavaLink._method((Object)$ic32$, (Object)$ic33$, new Object[] { $ic34$, $ic34$ });
        final SubLObject var37 = JavaLink._method((Object)$ic32$, (Object)$ic47$, new Object[] { $ic34$ });
        final SubLObject var38 = var32.first().first();
        final SubLObject var39 = conses_high.second(var32).first();
        final SubLObject var40 = var33.first().first();
        final SubLObject var41 = conses_high.second(var33).first();
        SubLObject var42 = var32;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            JavaLink._call((Object)var36, (Object)var34, new Object[] { var43.first(), conses_high.second(var43) });
            var42 = var42.rest();
            var43 = var42.first();
        }
        var42 = var33;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var42.first();
        while (NIL != var42) {
            JavaLink._call((Object)var36, (Object)var35, new Object[] { var44.first(), conses_high.second(var44) });
            var42 = var42.rest();
            var44 = var42.first();
        }
        final SubLObject var45 = JavaLink._call((Object)var37, (Object)var34, new Object[] { var38 });
        final SubLObject var46 = JavaLink._call((Object)var37, (Object)var34, new Object[] { var39 });
        final SubLObject var47 = JavaLink._call((Object)var37, (Object)var35, new Object[] { var40 });
        final SubLObject var48 = JavaLink._call((Object)var37, (Object)var35, new Object[] { var41 });
        final SubLObject var49 = (SubLObject)$ic48$;
        final SubLObject var50 = (SubLObject)$ic49$;
        final SubLObject var51 = JavaLink._method((Object)var49, (Object)NIL, new Object[] { var50, var50 });
        final SubLObject var52 = JavaLink._method((Object)var50, (Object)NIL, new Object[] { $ic34$, $ic34$ });
        final SubLObject var53 = JavaLink._new((Object)var51, new Object[] { JavaLink._new((Object)var52, new Object[] { var38, var45 }), JavaLink._new((Object)var52, new Object[] { var39, var46 }) });
        final SubLObject var54 = JavaLink._new((Object)var51, new Object[] { JavaLink._new((Object)var52, new Object[] { var40, var47 }), JavaLink._new((Object)var52, new Object[] { var41, var48 }) });
        final SubLObject var55 = JavaLink._method((Object)var49, (Object)$ic50$, new Object[] { $ic51$ });
        final SubLObject var56 = JavaLink._call((Object)var55, (Object)var53, new Object[] { var54 });
        if (NIL != var56) {
            final SubLObject var57 = JavaLink._method((Object)var50, (Object)$ic52$, new Object[0]);
            final SubLObject var58 = JavaLink._method((Object)var50, (Object)$ic53$, new Object[0]);
            return Values.values(JavaLink._call((Object)var57, (Object)var56, new Object[0]), JavaLink._call((Object)var58, (Object)var56, new Object[0]));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32608(SubLObject var8, final SubLObject var67) {
        if (NIL == f32610() && NIL != module0035.f2194(Mapping.mapcar((SubLObject)$ic31$, var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var68 = (SubLObject)(var67.eql($ic54$) ? $ic39$ : (var67.eql($ic55$) ? $ic46$ : $ic39$));
        final SubLObject var67_94 = JavaLink._new((Object)var68, new Object[0]);
        final SubLObject var69 = JavaLink._method((Object)var68, (Object)$ic40$, new Object[] { $ic41$, $ic41$ });
        final SubLObject var70 = JavaLink._method((Object)$ic42$, (Object)$ic43$, new Object[] { $ic34$ });
        final SubLObject var71 = JavaLink._method((Object)$ic42$, (Object)$ic56$, new Object[0]);
        SubLObject var72 = (SubLObject)NIL;
        var8 = Sort.sort(conses_high.copy_list(var8), (SubLObject)$ic44$, (SubLObject)$ic31$);
        final SubLObject var73 = JavaLink._call((Object)var69, (Object)var67_94, new Object[] { Mapping.mapcar((SubLObject)$ic31$, var8), Mapping.mapcar((SubLObject)$ic45$, var8) });
        final SubLObject var74 = JavaLink._call((Object)var71, (Object)var73, new Object[0]);
        SubLObject var75 = var8;
        SubLObject var76 = (SubLObject)NIL;
        var76 = var75.first();
        while (NIL != var75) {
            final SubLObject var77 = var76.first();
            var72 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, JavaLink._call((Object)var70, (Object)var74, new Object[] { var77 })), var72);
            var75 = var75.rest();
            var76 = var75.first();
        }
        return Sequences.nreverse(var72);
    }
    
    public static SubLObject f32614(final SubLObject var98) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var98) && module0205.f13136(var98).eql($ic20$) && NIL != module0202.f12598(var98));
    }
    
    public static SubLObject f32602(final SubLObject var7, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2015(var7) : var7;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            assert NIL != f32614(var13) : var13;
            var12 = var12.rest();
            var13 = var12.first();
        }
        SubLObject var14 = (SubLObject)NIL;
        var12 = var7;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var12.first();
        while (NIL != var12) {
            final SubLObject var16 = module0205.f13207(var15, (SubLObject)UNPROVIDED);
            final SubLObject var17 = var16.first();
            final SubLObject var18 = conses_high.second(var16);
            var11.resetMultipleValues();
            final SubLObject var19 = module0610.f37199(var17);
            SubLObject var20 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL == var9) {
                var9 = var19;
            }
            if (!var9.equal(var19)) {
                var20 = module0610.f37207(var9, var19, var20, (SubLObject)UNPROVIDED);
            }
            var11.resetMultipleValues();
            final SubLObject var21 = module0610.f37199(var18);
            SubLObject var22 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL == var10) {
                var10 = var21;
            }
            if (!var10.equal(var21)) {
                var22 = module0610.f37207(var10, var21, var22, (SubLObject)UNPROVIDED);
            }
            var14 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var20, var22), var14);
            var12 = var12.rest();
            var15 = var12.first();
        }
        return Values.values(var14, var9, var10);
    }
    
    public static SubLObject f32615(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13392(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12677(var3) && NIL != module0269.f17708(var4) && NIL != module0229.f15236(var5, (SubLObject)UNPROVIDED) && module0225.f14739(var5).eql((SubLObject)TWO_INTEGER)) {
            final SubLObject var9 = module0202.f12684(var3);
            SubLObject var10 = (SubLObject)NIL;
            if (NIL != module0035.f2370((SubLObject)$ic13$, var9, (SubLObject)UNPROVIDED)) {
                SubLObject var11 = var9;
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL != var11) {
                    final SubLObject var13 = module0205.f13204(var12, (SubLObject)UNPROVIDED);
                    if (NIL != module0229.f15243((SubLObject)ConsesLow.list(var5, (SubLObject)ConsesLow.list(var4, var13, var6), var7))) {
                        var10 = (SubLObject)ConsesLow.cons(var12, var10);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            if (NIL != var10) {
                final SubLObject var14 = module0235.f15474(module0202.f12791(module0035.f2270(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var14) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var14, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var14, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32616(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17708(var3) && NIL != module0229.f15236(var6, (SubLObject)UNPROVIDED) && module0225.f14739(var6).eql((SubLObject)TWO_INTEGER)) {
            final SubLObject var8 = (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list(var3, var4, var5), var7);
            if (NIL != module0229.f15243(var8)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic15$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)ConsesLow.list(module0438.f30664(var8, (SubLObject)UNPROVIDED)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32617(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17708(var3) && NIL != module0229.f15236(var6, (SubLObject)UNPROVIDED) && module0225.f14739(var6).eql((SubLObject)TWO_INTEGER)) {
            final SubLObject var8 = (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list(var3, var4, var5), var7);
            if (NIL == module0229.f15243(var8)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0202.f12771(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)ConsesLow.list(module0438.f30664(module0202.f12771(var8), (SubLObject)UNPROVIDED)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32618(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = $ic54$;
        final SubLObject var7 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0202.f12677(var5)) {
            final SubLObject var9 = module0202.f12684(var5);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var9, (SubLObject)UNPROVIDED)) {
                var3.resetMultipleValues();
                SubLObject var10 = f32602(var9, $ic70$, $ic71$);
                final SubLObject var11 = var3.secondMultipleValue();
                final SubLObject var12 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                var10 = Sort.sort(conses_high.copy_list(var10), (SubLObject)$ic44$, (SubLObject)$ic31$);
                final SubLObject var13 = f32608(var10, var6);
                final SubLObject var14 = module0048.f3383(var10, (SubLObject)$ic45$);
                final SubLObject var15 = (SubLObject)ConsesLow.list($ic24$, var12, var11);
                SubLObject var16 = (SubLObject)NIL;
                if (NIL != var8) {
                    print_high.print(var10, (SubLObject)UNPROVIDED);
                    print_high.print(var13, (SubLObject)UNPROVIDED);
                    module0006.f218((SubLObject)T, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                SubLObject var17 = Sort.sort(conses_high.copy_list(var10), (SubLObject)$ic81$, (SubLObject)$ic45$);
                SubLObject var18 = (SubLObject)NIL;
                var18 = var17.first();
                while (NIL != var17) {
                    SubLObject var20;
                    final SubLObject var19 = var20 = var18;
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic73$);
                    var21 = var20.first();
                    var20 = var20.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic73$);
                    var22 = var20.first();
                    var20 = var20.rest();
                    if (NIL == var20) {
                        if (NIL != var8) {
                            module0006.f218((SubLObject)T, (SubLObject)$ic74$, var21, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (var22.numG(Numbers.add((SubLObject)FIVE_INTEGER, var14))) {
                            SubLObject var23 = (SubLObject)NIL;
                            SubLObject var24 = (SubLObject)NIL;
                            SubLObject var25 = (SubLObject)NIL;
                            if (NIL == var23) {
                                SubLObject var26 = var16;
                                SubLObject var27 = (SubLObject)NIL;
                                var27 = var26.first();
                                while (NIL == var23 && NIL != var26) {
                                    if (var21.numGE(var27.first()) && var21.numLE(conses_high.second(var27))) {
                                        var23 = (SubLObject)T;
                                    }
                                    var26 = var26.rest();
                                    var27 = var26.first();
                                }
                            }
                            if (NIL == var23) {
                                SubLObject var28 = (SubLObject)NIL;
                                if (NIL == var28) {
                                    SubLObject var29 = (SubLObject)NIL;
                                    SubLObject var136_137 = (SubLObject)NIL;
                                    SubLObject var30 = (SubLObject)NIL;
                                    SubLObject var139_140 = (SubLObject)NIL;
                                    var29 = Sequences.nreverse(conses_high.copy_list(var10));
                                    var136_137 = var29.first();
                                    var30 = Sequences.nreverse(conses_high.copy_list(var13));
                                    var139_140 = var30.first();
                                    while (NIL == var28 && (NIL != var30 || NIL != var29)) {
                                        SubLObject var143_144;
                                        final SubLObject var141_142 = var143_144 = var139_140;
                                        SubLObject var31 = (SubLObject)NIL;
                                        SubLObject var32 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)$ic75$);
                                        var31 = var143_144.first();
                                        var143_144 = var143_144.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)$ic75$);
                                        var32 = var143_144.first();
                                        var143_144 = var143_144.rest();
                                        if (NIL == var143_144) {
                                            final SubLObject var33 = conses_high.second(var136_137);
                                            if (NIL != var8) {
                                                module0006.f218((SubLObject)T, (SubLObject)$ic76$, var31, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                if (!var31.eql(var136_137.first())) {
                                                    print_high.print((SubLObject)$ic77$, (SubLObject)UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (var32.numGE((SubLObject)$ic78$) && var31.numL(var21)) {
                                                var28 = (SubLObject)T;
                                                var24 = var31;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var141_142, (SubLObject)$ic75$);
                                        }
                                        var29 = var29.rest();
                                        var136_137 = var29.first();
                                        var30 = var30.rest();
                                        var139_140 = var30.first();
                                    }
                                }
                                SubLObject var34 = (SubLObject)NIL;
                                if (NIL == var34) {
                                    SubLObject var35 = (SubLObject)NIL;
                                    SubLObject var136_138 = (SubLObject)NIL;
                                    SubLObject var36 = (SubLObject)NIL;
                                    SubLObject var139_141 = (SubLObject)NIL;
                                    var35 = var10;
                                    var136_138 = var35.first();
                                    var36 = var13;
                                    var139_141 = var36.first();
                                    while (NIL == var34 && (NIL != var36 || NIL != var35)) {
                                        SubLObject var155_156;
                                        final SubLObject var153_154 = var155_156 = var139_141;
                                        SubLObject var31 = (SubLObject)NIL;
                                        SubLObject var32 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var155_156, var153_154, (SubLObject)$ic75$);
                                        var31 = var155_156.first();
                                        var155_156 = var155_156.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var155_156, var153_154, (SubLObject)$ic75$);
                                        var32 = var155_156.first();
                                        var155_156 = var155_156.rest();
                                        if (NIL == var155_156) {
                                            final SubLObject var33 = conses_high.second(var136_138);
                                            if (NIL != var8) {
                                                module0006.f218((SubLObject)T, (SubLObject)$ic76$, var31, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                if (!var31.eql(var136_138.first())) {
                                                    print_high.print((SubLObject)$ic77$, (SubLObject)UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (var32.numLE((SubLObject)$ic79$) && var31.numG(var21)) {
                                                var34 = (SubLObject)T;
                                                var25 = var31;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var153_154, (SubLObject)$ic75$);
                                        }
                                        var35 = var35.rest();
                                        var136_138 = var35.first();
                                        var36 = var36.rest();
                                        var139_141 = var36.first();
                                    }
                                }
                            }
                            if (NIL != var24 && NIL != var25) {
                                if (NIL != var8) {
                                    module0006.f218((SubLObject)T, (SubLObject)$ic80$, var24, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var25), var16);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)$ic73$);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
                var16 = Sort.sort(var16, (SubLObject)$ic44$, (SubLObject)$ic31$);
                if (NIL != var8) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic82$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                SubLObject var37 = (SubLObject)NIL;
                SubLObject var38 = (SubLObject)NIL;
                SubLObject var39 = (SubLObject)NIL;
                SubLObject var40 = var16;
                SubLObject var41 = (SubLObject)NIL;
                var41 = var40.first();
                while (NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var44 = (SubLObject)NIL;
                    SubLObject var45 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic83$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic83$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    if (NIL == var43) {
                        if (NIL != var38 && NIL != var39) {
                            if (var44.numLE(var39)) {
                                var39 = var45;
                            }
                            else {
                                var37 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var38, var39), var37);
                                var38 = var44;
                                var39 = var45;
                            }
                        }
                        else {
                            var38 = var44;
                            var39 = var45;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)$ic83$);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
                if (NIL != var38 && NIL != var39) {
                    var37 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var38, var39), var37);
                }
                if (NIL != var8) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic84$, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var16 = var37;
                SubLObject var46 = (SubLObject)NIL;
                SubLObject var47 = var16;
                SubLObject var48 = (SubLObject)NIL;
                var48 = var47.first();
                while (NIL != var47) {
                    var46 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic85$, (SubLObject)ConsesLow.list(var11, var48.first()), (SubLObject)ConsesLow.list(var11, Numbers.subtract(conses_high.second(var48), var48.first()))), var46);
                    var47 = var47.rest();
                    var48 = var47.first();
                }
                var46 = module0202.f12787(var46, (SubLObject)UNPROVIDED);
                final SubLObject var49 = module0235.f15474(var46, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var49) {
                    module0347.f23330(module0191.f11990((SubLObject)$ic15$, module0233.f15362(var49, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var49, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32619() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32598", "S#36040", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32600", "S#36041", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32601", "S#36042", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32599", "S#36043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32603", "S#36044", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32605", "S#36045", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32607", "S#36046", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32609", "S#36047", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32610", "S#36048", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32606", "S#36049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32611", "S#36050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32612", "S#36051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32613", "S#36052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32604", "S#36053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32608", "S#36054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32614", "S#36055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32602", "S#36056", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32615", "S#36057", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32616", "S#36058", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32617", "S#36059", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0520", "f32618", "S#36060", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32620() {
        $g3853$ = SubLFiles.defparameter("S#36061", module0018.$g660$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32621() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22938($ic5$);
        module0358.f23771((SubLObject)$ic1$, $ic5$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22938($ic9$);
        module0358.f23771((SubLObject)$ic1$, $ic9$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22938($ic17$);
        module0358.f23771((SubLObject)$ic1$, $ic17$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic17$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22938($ic21$);
        module0358.f23771((SubLObject)$ic1$, $ic21$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22938($ic25$);
        module0358.f23771((SubLObject)$ic1$, $ic25$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic25$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22938($ic28$);
        module0358.f23771((SubLObject)$ic1$, $ic28$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic28$, (SubLObject)TWO_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic28$, (SubLObject)THREE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic28$, (SubLObject)FOUR_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic28$, (SubLObject)FIVE_INTEGER);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22938($ic58$);
        module0358.f23771((SubLObject)$ic1$, $ic58$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic58$, (SubLObject)TWO_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic58$, (SubLObject)THREE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic58$, (SubLObject)FOUR_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic58$, (SubLObject)FIVE_INTEGER);
        module0340.f22941((SubLObject)$ic59$, (SubLObject)$ic60$);
        module0340.f22938($ic61$);
        module0358.f23773((SubLObject)$ic1$, $ic61$);
        module0358.f23773((SubLObject)$ic62$, $ic61$);
        module0340.f22941((SubLObject)$ic63$, (SubLObject)$ic64$);
        module0340.f22941((SubLObject)$ic65$, (SubLObject)$ic66$);
        module0340.f22938($ic67$);
        module0358.f23771((SubLObject)$ic1$, $ic67$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic67$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic68$, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32619();
    }
    
    public void initializeVariables() {
        f32620();
    }
    
    public void runTopLevelForms() {
        f32621();
    }
    
    static {
        me = (SubLFile)new module0520();
        $g3853$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("interpolationWithCubicSpline"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("interpolationWithCubicSpline")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interpolationWithCubicSpline")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36040", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$interpolationWithCubicSpline <set-of-points> <2d-point-with-x-or-y-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$interpolationWithCubicSpline \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $ic4$ = makeSymbol("S#36050", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("interpolationWithPiecewiseLinearPolynomial"));
        $ic6$ = makeKeyword("REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("interpolationWithPiecewiseLinearPolynomial")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interpolationWithPiecewiseLinearPolynomial")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36041", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$interpolationWithPiecewiseLinearPolynomial <set-of-points> <2d-point-with-x-or-y-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$interpolationWithPiecewiseLinearPolynomial \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $ic8$ = makeSymbol("S#36051", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("extrapolationWithSimpleLinearRegression"));
        $ic10$ = makeKeyword("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extrapolationWithSimpleLinearRegression")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extrapolationWithSimpleLinearRegression")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("The2DPoint")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36042", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$extrapolationWithSimpleLinearRegression <set-of-points> <2d-point-with-x-or-y-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extrapolationWithSimpleLinearRegression \n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200)))") });
        $ic12$ = makeSymbol("S#36052", "CYC");
        $ic13$ = makeSymbol("S#36055", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#36062", "CYC"), (SubLObject)makeSymbol("S#36063", "CYC"), (SubLObject)makeSymbol("S#36064", "CYC"));
        $ic15$ = makeKeyword("OPAQUE");
        $ic16$ = makeSymbol("NREVERSE");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("regressionLinesForSetsIntersectAtPoint"));
        $ic18$ = makeKeyword("REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("regressionLinesForSetsIntersectAtPoint")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("regressionLinesForSetsIntersectAtPoint")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36044", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$regressionLinesForSetsIntersectAtPoint <set-of-points> <set-of-points> ?POINT)"), makeKeyword("EXAMPLE"), makeString("(#$regressionLinesForSetsIntersectAtPoint\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 200)\n       (#$SecondsDuration 1263118210))\n      (#$The2DPoint\n       (#$DegreeCelsius 210)\n       (#$SecondsDuration 1263204610))\n      (#$The2DPoint\n       (#$DegreeCelsius 220)\n       (#$SecondsDuration 1263291010)))\n     (TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400)))\n     ?POINT)") });
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("The2DPoint"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("slopeOfRegressionLineForSetOfPoints"));
        $ic22$ = makeKeyword("REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("slopeOfRegressionLineForSetOfPoints")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("slopeOfRegressionLineForSetOfPoints")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36045", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$slopeOfRegressionLineForSetOfPoints <set-of-points> ?SLOPE)"), makeKeyword("EXAMPLE"), makeString("(#$slopeOfRegressionLineForSetOfPoints\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400))) ?X)") });
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("PerFn"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("setOfFirstDerivativePointsBasedOnSetOfPoints"));
        $ic26$ = makeKeyword("REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36046", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints <set-of-points> ?SET-OF-POINTS)"), makeKeyword("EXAMPLE"), makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints\n    (#$TheSet\n     (#$The2DPoint (#$SecondsDuration 1) (#$DegreeCelsius 1))\n     (#$The2DPoint (#$SecondsDuration 3) (#$DegreeCelsius 5))\n     (#$The2DPoint (#$SecondsDuration 5) (#$DegreeCelsius 1)))\n    #$CubicSpline\n    ?X)\n    -->\n    (#$TheSet \n     (#$The2DPoint (#$SecondsDuration 1) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 6.0))\n     (#$The2DPoint (#$SecondsDuration 3) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 0.0))\n     (#$The2DPoint (#$SecondsDuration 5) ((#$PerFn #$DegreeCelsius #$SecondsDuration) -6.0)))") });
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet"));
        $ic29$ = makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36047", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet <set-of-points> <set-of-points> <binary-function> <binary-predicate> <value-in-y-units> ?RESULT-SET-OF-POINTS)"), makeKeyword("EXAMPLE"), makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170))) \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170)))\n    #$DifferenceFn\n    #$greaterThanOrEqualTo \n    (#$Kelvin 2)\n    ?NEWSET)\n    -->\n    (((?NEWSET #$TheSet (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)))))") });
        $ic31$ = makeSymbol("FIRST");
        $ic32$ = makeString("org.apache.commons.math.stat.regression.SimpleRegression");
        $ic33$ = makeString("addData");
        $ic34$ = makeString("double");
        $ic35$ = makeString("getSlope");
        $ic36$ = makeString("getIntercept");
        $ic37$ = makeSymbol("MIN");
        $ic38$ = makeSymbol("MAX");
        $ic39$ = makeString("org.apache.commons.math.analysis.interpolation.SplineInterpolator");
        $ic40$ = makeString("interpolate");
        $ic41$ = makeString("[D");
        $ic42$ = makeString("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction");
        $ic43$ = makeString("value");
        $ic44$ = makeSymbol("<");
        $ic45$ = makeSymbol("SECOND");
        $ic46$ = makeString("org.apache.commons.math.analysis.interpolation.LinearInterpolator");
        $ic47$ = makeString("predict");
        $ic48$ = makeString("org.apache.commons.math.geometry.euclidean.twod.Line");
        $ic49$ = makeString("org.apache.commons.math.geometry.euclidean.twod.Vector2D");
        $ic50$ = makeString("intersection");
        $ic51$ = makeString("org.apache.commons.math.geometry.partitioning.Hyperplane");
        $ic52$ = makeString("getX");
        $ic53$ = makeString("getY");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("CubicSpline"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("LinearPolynomialFunction-Piecewise"));
        $ic56$ = makeString("derivative");
        $ic57$ = makeSymbol("S#747", "CYC");
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnTo"));
        $ic59$ = makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO");
        $ic60$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnTo")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("setHasPointsWithYValueRelnTo")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36057", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$setHasPointsWithYValueRelnTo <set-of-points> <operator> <comparator> <quant1> <quant2> ?NEWSET)"), makeKeyword("EXAMPLE"), makeString("(#$setHasPointsWithYValueRelnTo \n (#$TheSet \n  (#$The2DPoint \n   (#$Meter 20.0) \n   (#$DegreeCelsius 68.35)) \n  (#$The2DPoint \n   (#$Meter 21.0) \n   (#$DegreeCelsius 72.98)) \n  (#$The2DPoint \n   (#$Meter 22.0) \n   (#$DegreeCelsius 75.68)) \n  (#$The2DPoint \n   (#$Meter 23.0) \n   (#$DegreeCelsius 78.16)) \n  (#$The2DPoint \n   (#$Meter 24.0) \n   (#$DegreeCelsius 80.79)))\n #$PlusFn\n #$lessThanOrEqualTo \n (#$DegreeCelsius 0) \n (#$DegreeCelsius 70) ?NEWSET)\n -->\n (((?NEWSET TheSet\n   (The2DPoint\n       (Meter 20.0)\n       (DegreeCelsius 68.35)))))") });
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("operationResultComparison"));
        $ic62$ = makeKeyword("NEG");
        $ic63$ = makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK");
        $ic64$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("operationResultComparison")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operationResultComparison")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36058", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), makeKeyword("EXAMPLE"), makeString("(#$operationResultComparison #$PlusFn (#$DegreeCelsius 50) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $ic65$ = makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK");
        $ic66$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("operationResultComparison")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operationResultComparison")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36059", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$operationResultComparison #$PlusFn (#$DegreeCelsius 100) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("inflowLengthsWithStartingDepths"));
        $ic68$ = makeKeyword("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("inflowLengthsWithStartingDepths")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("inflowLengthsWithStartingDepths")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36061", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36060", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$inflowLengthsWithStartingDepths <well> <set-of-points> ?LENGTH-AND-DEPTHS)"), makeKeyword("EXAMPLE"), makeString("(#$inflowLengthsWithStartingDepths\n  (#$The #$Well)\n  (#$TheSet \n   (#$The2DPoint (#$Meter 100) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 110) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 120) (#$DegreeCelsius 115))\n   (#$The2DPoint (#$Meter 130) (#$DegreeCelsius 114))\n   (#$The2DPoint (#$Meter 140) (#$DegreeCelsius 103))\n   (#$The2DPoint (#$Meter 150) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 160) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 170) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 180) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 190) (#$DegreeCelsius  91))\n   (#$The2DPoint (#$Meter 200) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 210) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 220) (#$DegreeCelsius 105))\n   (#$The2DPoint (#$Meter 230) (#$DegreeCelsius  97))\n   (#$The2DPoint (#$Meter 240) (#$DegreeCelsius  96))\n   (#$The2DPoint (#$Meter 250) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 260) (#$DegreeCelsius  94))\n   (#$The2DPoint (#$Meter 270) (#$DegreeCelsius  93))\n   (#$The2DPoint (#$Meter 280) (#$DegreeCelsius  92)))\n  ?LENGTH-AND-DEPTHS)") });
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("Meter"));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("DegreeCelsius"));
        $ic72$ = makeString("~%~%");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#36065", "CYC"), (SubLObject)makeSymbol("S#36066", "CYC"));
        $ic74$ = makeString("High value: x=~A y=~A~%");
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#36067", "CYC"), (SubLObject)makeSymbol("S#36068", "CYC"));
        $ic76$ = makeString("checking x=~A deriv=~A~%");
        $ic77$ = makeString("Bad looping");
        $ic78$ = (SubLFloat)makeDouble(0.5);
        $ic79$ = (SubLFloat)makeDouble(-0.5);
        $ic80$ = makeString("Got interval (~A ~A)~%");
        $ic81$ = makeSymbol(">");
        $ic82$ = makeString("inflow-lengths: ~A~%");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic84$ = makeString("merged-inflow-lengths: ~A~%");
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 408 ms
	
	Decompiled with Procyon 0.5.32.
*/