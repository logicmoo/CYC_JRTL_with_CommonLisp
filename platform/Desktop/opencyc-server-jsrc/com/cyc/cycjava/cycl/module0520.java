package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        return f32599(var1, (SubLObject)module0520.$ic4$);
    }
    
    public static SubLObject f32600(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        return f32599(var1, (SubLObject)module0520.$ic8$);
    }
    
    public static SubLObject f32601(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        return f32599(var1, (SubLObject)module0520.$ic12$);
    }
    
    public static SubLObject f32599(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var5)) {
            final SubLObject var7 = module0202.f12684(var5);
            if (module0520.NIL != var7 && module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var7, (SubLObject)module0520.UNPROVIDED)) {
                var4.resetMultipleValues();
                final SubLObject var8 = f32602(var7, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var9 = var4.secondMultipleValue();
                final SubLObject var10 = var4.thirdMultipleValue();
                var4.resetMultipleValues();
                if (module0520.NIL != var8 && module0520.NIL != var9 && module0520.NIL != var10) {
                    SubLObject var12;
                    final SubLObject var11 = var12 = var6;
                    SubLObject var13 = (SubLObject)module0520.NIL;
                    SubLObject var14 = (SubLObject)module0520.NIL;
                    SubLObject var15 = (SubLObject)module0520.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0520.$ic14$);
                    var13 = var12.first();
                    var12 = var12.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0520.$ic14$);
                    var14 = var12.first();
                    var12 = var12.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0520.$ic14$);
                    var15 = var12.first();
                    var12 = var12.rest();
                    if (module0520.NIL == var12) {
                        if (module0520.NIL != module0193.f12106(var15)) {
                            var4.resetMultipleValues();
                            final SubLObject var16 = module0610.f37199(var14);
                            final SubLObject var17 = var4.secondMultipleValue();
                            var4.resetMultipleValues();
                            final SubLObject var18 = module0610.f37207(var9, var16, var17, (SubLObject)module0520.UNPROVIDED);
                            final SubLObject var19 = Functions.funcall(var3, var8, var18);
                            if (module0520.NIL != var19) {
                                final SubLObject var20 = module0610.f37198(var10, var19, (SubLObject)module0520.UNPROVIDED);
                                final SubLObject var21 = module0610.f37232(var15, var20);
                                module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var21, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var21, (SubLObject)module0520.UNPROVIDED);
                            }
                        }
                        else {
                            final SubLObject var22 = Mapping.mapcar((SubLObject)module0520.$ic16$, var8);
                            var4.resetMultipleValues();
                            final SubLObject var23 = module0610.f37199(var15);
                            final SubLObject var24 = var4.secondMultipleValue();
                            var4.resetMultipleValues();
                            final SubLObject var25 = module0610.f37207(var10, var23, var24, (SubLObject)module0520.UNPROVIDED);
                            final SubLObject var26 = Functions.funcall(var3, var22, var25);
                            if (module0520.NIL != var26) {
                                final SubLObject var27 = module0610.f37198(var9, var26, (SubLObject)module0520.UNPROVIDED);
                                final SubLObject var28 = module0610.f37232(var14, var27);
                                module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var28, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var28, (SubLObject)module0520.UNPROVIDED);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)module0520.$ic14$);
                    }
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32603(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var4) && module0520.NIL != module0202.f12677(var5)) {
            final SubLObject var7 = module0202.f12684(var4);
            final SubLObject var8 = module0202.f12684(var5);
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var7, (SubLObject)module0520.UNPROVIDED) && module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var8, (SubLObject)module0520.UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var9 = f32602(var7, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var10 = var3.secondMultipleValue();
                final SubLObject var11 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var12 = f32602(var8, var10, var11);
                var3.resetMultipleValues();
                final SubLObject var13 = f32604(var9, var12);
                final SubLObject var14 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (var13.isNumber() && var14.isNumber()) {
                    if (module0520.NIL != module0193.f12067(var6)) {
                        final SubLObject var15 = (SubLObject)ConsesLow.list(module0520.$ic20$, module0610.f37198(var10, var13, (SubLObject)module0520.UNPROVIDED), module0610.f37198(var11, var14, (SubLObject)module0520.UNPROVIDED));
                        final SubLObject var16 = module0610.f37232(var6, var15);
                        module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var16, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var16, (SubLObject)module0520.UNPROVIDED);
                    }
                    else {
                        final SubLObject var17 = ConsesLow.append(module0610.f37232(conses_high.second(var6), module0610.f37198(var10, var13, (SubLObject)module0520.UNPROVIDED)), module0610.f37232(conses_high.third(var6), module0610.f37198(var11, var14, (SubLObject)module0520.UNPROVIDED)));
                        module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var17, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var17, (SubLObject)module0520.UNPROVIDED);
                    }
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32605(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var4)) {
            final SubLObject var6 = module0202.f12684(var4);
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var6, (SubLObject)module0520.UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var7 = f32602(var6, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var8 = var3.secondMultipleValue();
                final SubLObject var9 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var10 = f32606(var7);
                final SubLObject var11 = module0610.f37232(var5, module0610.f37198((SubLObject)ConsesLow.list(module0520.$ic24$, var9, var8), var10, (SubLObject)module0520.UNPROVIDED));
                final SubLObject var12 = module0610.f37232(var5, module0610.f37198((SubLObject)ConsesLow.list(module0520.$ic24$, var8, var9), Numbers.divide((SubLObject)module0520.ONE_INTEGER, var10), (SubLObject)module0520.UNPROVIDED));
                if (module0520.NIL != var11) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var11, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var11, (SubLObject)module0520.UNPROVIDED);
                }
                if (module0520.NIL != var12) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var12, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var12, (SubLObject)module0520.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32607(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var4)) {
            final SubLObject var7 = module0202.f12684(var4);
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var7, (SubLObject)module0520.UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var8 = f32602(var7, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var9 = var3.secondMultipleValue();
                final SubLObject var10 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var11 = f32608(var8, var5);
                final SubLObject var12 = (SubLObject)ConsesLow.list(module0520.$ic24$, var10, var9);
                SubLObject var13 = (SubLObject)module0520.NIL;
                SubLObject var14 = (SubLObject)module0520.NIL;
                SubLObject var15 = var11;
                SubLObject var16 = (SubLObject)module0520.NIL;
                var16 = var15.first();
                while (module0520.NIL != var15) {
                    var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0520.$ic20$, (SubLObject)ConsesLow.list(var9, var16.first()), (SubLObject)ConsesLow.list(var12, conses_high.second(var16))), var13);
                    var15 = var15.rest();
                    var16 = var15.first();
                }
                var13 = module0202.f12681(Sequences.nreverse(var13));
                var14 = module0235.f15474(var13, var6, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                if (module0520.NIL != var14) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var14, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var14, (SubLObject)module0520.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32609(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var7 = module0205.f13390(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var8 = module0205.f13391(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var9 = module0205.f13392(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var4) && module0520.NIL != module0202.f12677(var5) && module0520.NIL != module0269.f17708(var6) && module0225.f14739(var6).eql((SubLObject)module0520.TWO_INTEGER) && module0520.NIL != module0226.f14807(var7)) {
            final SubLObject var10 = module0202.f12684(var4);
            final SubLObject var11 = module0202.f12684(var5);
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var10, (SubLObject)module0520.UNPROVIDED) && module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var11, (SubLObject)module0520.UNPROVIDED)) {
                var3.resetMultipleValues();
                final SubLObject var12 = f32602(var10, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var13 = var3.secondMultipleValue();
                final SubLObject var14 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                final SubLObject var15 = f32602(var11, var13, var14);
                final SubLObject var16 = conses_high.second(module0610.f37238(var14, var8));
                SubLObject var17 = (SubLObject)module0520.NIL;
                SubLObject var18 = var12;
                SubLObject var19 = (SubLObject)module0520.NIL;
                var19 = var18.first();
                while (module0520.NIL != var18) {
                    final SubLObject var20 = var19.first();
                    final SubLObject var21 = conses_high.second(var19);
                    final SubLObject var22 = conses_high.second(Sequences.find(var20, var15, (SubLObject)module0520.EQL, (SubLObject)module0520.$ic31$, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED));
                    if (module0520.NIL != var22 && module0520.NIL != module0347.f23334((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list(var6, var21, var22), var16), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED)) {
                        var17 = (SubLObject)ConsesLow.cons(var19, var17);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
                SubLObject var23 = (SubLObject)module0520.NIL;
                SubLObject var24 = var17;
                SubLObject var25 = (SubLObject)module0520.NIL;
                var25 = var24.first();
                while (module0520.NIL != var24) {
                    var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0520.$ic20$, (SubLObject)ConsesLow.list(var13, var25.first()), (SubLObject)ConsesLow.list(var14, conses_high.second(var25))), var23);
                    var24 = var24.rest();
                    var25 = var24.first();
                }
                var23 = module0202.f12681(Sequences.nreverse(var23));
                final SubLObject var26 = module0235.f15474(var23, var9, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                if (module0520.NIL != var26) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var26, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var26, (SubLObject)module0520.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32610() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0018.$g629$.getDynamicValue(var4);
    }
    
    public static SubLObject f32606(final SubLObject var8) {
        final SubLObject var9 = JavaLink._new((Object)module0520.$ic32$, new Object[0]);
        final SubLObject var10 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic33$, new Object[] { module0520.$ic34$, module0520.$ic34$ });
        final SubLObject var11 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic35$, new Object[0]);
        final SubLObject var12 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic36$, new Object[0]);
        SubLObject var13 = var8;
        SubLObject var14 = (SubLObject)module0520.NIL;
        var14 = var13.first();
        while (module0520.NIL != var13) {
            JavaLink._call((Object)var10, (Object)var9, new Object[] { var14.first(), conses_high.second(var14) });
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Values.values(JavaLink._call((Object)var11, (Object)var9, new Object[0]), JavaLink._call((Object)var12, (Object)var9, new Object[0]));
    }
    
    public static SubLObject f32611(SubLObject var8, final SubLObject var66) {
        if (var66.numL(Functions.apply((SubLObject)module0520.$ic37$, Mapping.mapcar((SubLObject)module0520.$ic31$, var8))) || var66.numG(Functions.apply((SubLObject)module0520.$ic38$, Mapping.mapcar((SubLObject)module0520.$ic31$, var8))) || (module0520.NIL == f32610() && module0520.NIL != module0035.f2194(Mapping.mapcar((SubLObject)module0520.$ic31$, var8), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED))) {
            return (SubLObject)module0520.NIL;
        }
        final SubLObject var67 = JavaLink._new((Object)module0520.$ic39$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)module0520.$ic39$, (Object)module0520.$ic40$, new Object[] { module0520.$ic41$, module0520.$ic41$ });
        final SubLObject var69 = JavaLink._method((Object)module0520.$ic42$, (Object)module0520.$ic43$, new Object[] { module0520.$ic34$ });
        var8 = Sort.sort(var8, (SubLObject)module0520.$ic44$, (SubLObject)module0520.$ic31$);
        final SubLObject var70 = JavaLink._call((Object)var68, (Object)var67, new Object[] { Mapping.mapcar((SubLObject)module0520.$ic31$, var8), Mapping.mapcar((SubLObject)module0520.$ic45$, var8) });
        return JavaLink._call((Object)var69, (Object)var70, new Object[] { var66 });
    }
    
    public static SubLObject f32612(SubLObject var8, final SubLObject var66) {
        if (var66.numL(Functions.apply((SubLObject)module0520.$ic37$, Mapping.mapcar((SubLObject)module0520.$ic31$, var8))) || var66.numG(Functions.apply((SubLObject)module0520.$ic38$, Mapping.mapcar((SubLObject)module0520.$ic31$, var8))) || (module0520.NIL == f32610() && module0520.NIL != module0035.f2194(Mapping.mapcar((SubLObject)module0520.$ic31$, var8), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED))) {
            return (SubLObject)module0520.NIL;
        }
        final SubLObject var67 = JavaLink._new((Object)module0520.$ic46$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)module0520.$ic46$, (Object)module0520.$ic40$, new Object[] { module0520.$ic41$, module0520.$ic41$ });
        final SubLObject var69 = JavaLink._method((Object)module0520.$ic42$, (Object)module0520.$ic43$, new Object[] { module0520.$ic34$ });
        var8 = Sort.sort(var8, (SubLObject)module0520.$ic44$, (SubLObject)module0520.$ic31$);
        final SubLObject var70 = JavaLink._call((Object)var68, (Object)var67, new Object[] { Mapping.mapcar((SubLObject)module0520.$ic31$, var8), Mapping.mapcar((SubLObject)module0520.$ic45$, var8) });
        return JavaLink._call((Object)var69, (Object)var70, new Object[] { var66 });
    }
    
    public static SubLObject f32613(final SubLObject var8, final SubLObject var66) {
        final SubLObject var67 = JavaLink._new((Object)module0520.$ic32$, new Object[0]);
        final SubLObject var68 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic33$, new Object[] { module0520.$ic34$, module0520.$ic34$ });
        final SubLObject var69 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic47$, new Object[] { module0520.$ic34$ });
        SubLObject var70 = var8;
        SubLObject var71 = (SubLObject)module0520.NIL;
        var71 = var70.first();
        while (module0520.NIL != var70) {
            JavaLink._call((Object)var68, (Object)var67, new Object[] { var71.first(), conses_high.second(var71) });
            var70 = var70.rest();
            var71 = var70.first();
        }
        return JavaLink._call((Object)var69, (Object)var67, new Object[] { var66 });
    }
    
    public static SubLObject f32604(final SubLObject var32, final SubLObject var33) {
        if (module0520.NIL == var32 || module0520.NIL != module0035.f1997(var32) || module0520.NIL == var33 || module0520.NIL != module0035.f1997(var33)) {
            return (SubLObject)module0520.NIL;
        }
        final SubLObject var34 = JavaLink._new((Object)module0520.$ic32$, new Object[0]);
        final SubLObject var35 = JavaLink._new((Object)module0520.$ic32$, new Object[0]);
        final SubLObject var36 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic33$, new Object[] { module0520.$ic34$, module0520.$ic34$ });
        final SubLObject var37 = JavaLink._method((Object)module0520.$ic32$, (Object)module0520.$ic47$, new Object[] { module0520.$ic34$ });
        final SubLObject var38 = var32.first().first();
        final SubLObject var39 = conses_high.second(var32).first();
        final SubLObject var40 = var33.first().first();
        final SubLObject var41 = conses_high.second(var33).first();
        SubLObject var42 = var32;
        SubLObject var43 = (SubLObject)module0520.NIL;
        var43 = var42.first();
        while (module0520.NIL != var42) {
            JavaLink._call((Object)var36, (Object)var34, new Object[] { var43.first(), conses_high.second(var43) });
            var42 = var42.rest();
            var43 = var42.first();
        }
        var42 = var33;
        SubLObject var44 = (SubLObject)module0520.NIL;
        var44 = var42.first();
        while (module0520.NIL != var42) {
            JavaLink._call((Object)var36, (Object)var35, new Object[] { var44.first(), conses_high.second(var44) });
            var42 = var42.rest();
            var44 = var42.first();
        }
        final SubLObject var45 = JavaLink._call((Object)var37, (Object)var34, new Object[] { var38 });
        final SubLObject var46 = JavaLink._call((Object)var37, (Object)var34, new Object[] { var39 });
        final SubLObject var47 = JavaLink._call((Object)var37, (Object)var35, new Object[] { var40 });
        final SubLObject var48 = JavaLink._call((Object)var37, (Object)var35, new Object[] { var41 });
        final SubLObject var49 = (SubLObject)module0520.$ic48$;
        final SubLObject var50 = (SubLObject)module0520.$ic49$;
        final SubLObject var51 = JavaLink._method((Object)var49, (Object)module0520.NIL, new Object[] { var50, var50 });
        final SubLObject var52 = JavaLink._method((Object)var50, (Object)module0520.NIL, new Object[] { module0520.$ic34$, module0520.$ic34$ });
        final SubLObject var53 = JavaLink._new((Object)var51, new Object[] { JavaLink._new((Object)var52, new Object[] { var38, var45 }), JavaLink._new((Object)var52, new Object[] { var39, var46 }) });
        final SubLObject var54 = JavaLink._new((Object)var51, new Object[] { JavaLink._new((Object)var52, new Object[] { var40, var47 }), JavaLink._new((Object)var52, new Object[] { var41, var48 }) });
        final SubLObject var55 = JavaLink._method((Object)var49, (Object)module0520.$ic50$, new Object[] { module0520.$ic51$ });
        final SubLObject var56 = JavaLink._call((Object)var55, (Object)var53, new Object[] { var54 });
        if (module0520.NIL != var56) {
            final SubLObject var57 = JavaLink._method((Object)var50, (Object)module0520.$ic52$, new Object[0]);
            final SubLObject var58 = JavaLink._method((Object)var50, (Object)module0520.$ic53$, new Object[0]);
            return Values.values(JavaLink._call((Object)var57, (Object)var56, new Object[0]), JavaLink._call((Object)var58, (Object)var56, new Object[0]));
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32608(SubLObject var8, final SubLObject var67) {
        if (module0520.NIL == f32610() && module0520.NIL != module0035.f2194(Mapping.mapcar((SubLObject)module0520.$ic31$, var8), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED)) {
            return (SubLObject)module0520.NIL;
        }
        final SubLObject var68 = (SubLObject)(var67.eql(module0520.$ic54$) ? module0520.$ic39$ : (var67.eql(module0520.$ic55$) ? module0520.$ic46$ : module0520.$ic39$));
        final SubLObject var67_94 = JavaLink._new((Object)var68, new Object[0]);
        final SubLObject var69 = JavaLink._method((Object)var68, (Object)module0520.$ic40$, new Object[] { module0520.$ic41$, module0520.$ic41$ });
        final SubLObject var70 = JavaLink._method((Object)module0520.$ic42$, (Object)module0520.$ic43$, new Object[] { module0520.$ic34$ });
        final SubLObject var71 = JavaLink._method((Object)module0520.$ic42$, (Object)module0520.$ic56$, new Object[0]);
        SubLObject var72 = (SubLObject)module0520.NIL;
        var8 = Sort.sort(conses_high.copy_list(var8), (SubLObject)module0520.$ic44$, (SubLObject)module0520.$ic31$);
        final SubLObject var73 = JavaLink._call((Object)var69, (Object)var67_94, new Object[] { Mapping.mapcar((SubLObject)module0520.$ic31$, var8), Mapping.mapcar((SubLObject)module0520.$ic45$, var8) });
        final SubLObject var74 = JavaLink._call((Object)var71, (Object)var73, new Object[0]);
        SubLObject var75 = var8;
        SubLObject var76 = (SubLObject)module0520.NIL;
        var76 = var75.first();
        while (module0520.NIL != var75) {
            final SubLObject var77 = var76.first();
            var72 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, JavaLink._call((Object)var70, (Object)var74, new Object[] { var77 })), var72);
            var75 = var75.rest();
            var76 = var75.first();
        }
        return Sequences.nreverse(var72);
    }
    
    public static SubLObject f32614(final SubLObject var98) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0520.NIL != module0202.f12590(var98) && module0205.f13136(var98).eql(module0520.$ic20$) && module0520.NIL != module0202.f12598(var98));
    }
    
    public static SubLObject f32602(final SubLObject var7, SubLObject var9, SubLObject var10) {
        if (var9 == module0520.UNPROVIDED) {
            var9 = (SubLObject)module0520.NIL;
        }
        if (var10 == module0520.UNPROVIDED) {
            var10 = (SubLObject)module0520.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert module0520.NIL != module0035.f2015(var7) : var7;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)module0520.NIL;
        var13 = var12.first();
        while (module0520.NIL != var12) {
            assert module0520.NIL != f32614(var13) : var13;
            var12 = var12.rest();
            var13 = var12.first();
        }
        SubLObject var14 = (SubLObject)module0520.NIL;
        var12 = var7;
        SubLObject var15 = (SubLObject)module0520.NIL;
        var15 = var12.first();
        while (module0520.NIL != var12) {
            final SubLObject var16 = module0205.f13207(var15, (SubLObject)module0520.UNPROVIDED);
            final SubLObject var17 = var16.first();
            final SubLObject var18 = conses_high.second(var16);
            var11.resetMultipleValues();
            final SubLObject var19 = module0610.f37199(var17);
            SubLObject var20 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0520.NIL == var9) {
                var9 = var19;
            }
            if (!var9.equal(var19)) {
                var20 = module0610.f37207(var9, var19, var20, (SubLObject)module0520.UNPROVIDED);
            }
            var11.resetMultipleValues();
            final SubLObject var21 = module0610.f37199(var18);
            SubLObject var22 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0520.NIL == var10) {
                var10 = var21;
            }
            if (!var10.equal(var21)) {
                var22 = module0610.f37207(var10, var21, var22, (SubLObject)module0520.UNPROVIDED);
            }
            var14 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var20, var22), var14);
            var12 = var12.rest();
            var15 = var12.first();
        }
        return Values.values(var14, var9, var10);
    }
    
    public static SubLObject f32615(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var8 = module0205.f13392(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0202.f12677(var3) && module0520.NIL != module0269.f17708(var4) && module0520.NIL != module0229.f15236(var5, (SubLObject)module0520.UNPROVIDED) && module0225.f14739(var5).eql((SubLObject)module0520.TWO_INTEGER)) {
            final SubLObject var9 = module0202.f12684(var3);
            SubLObject var10 = (SubLObject)module0520.NIL;
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var9, (SubLObject)module0520.UNPROVIDED)) {
                SubLObject var11 = var9;
                SubLObject var12 = (SubLObject)module0520.NIL;
                var12 = var11.first();
                while (module0520.NIL != var11) {
                    final SubLObject var13 = module0205.f13204(var12, (SubLObject)module0520.UNPROVIDED);
                    if (module0520.NIL != module0229.f15243((SubLObject)ConsesLow.list(var5, (SubLObject)ConsesLow.list(var4, var13, var6), var7))) {
                        var10 = (SubLObject)ConsesLow.cons(var12, var10);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            if (module0520.NIL != var10) {
                final SubLObject var14 = module0235.f15474(module0202.f12791(module0035.f2270(var10, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), (SubLObject)module0520.UNPROVIDED), var8, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                if (module0520.NIL != var14) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var14, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var14, (SubLObject)module0520.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32616(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0269.f17708(var3) && module0520.NIL != module0229.f15236(var6, (SubLObject)module0520.UNPROVIDED) && module0225.f14739(var6).eql((SubLObject)module0520.TWO_INTEGER)) {
            final SubLObject var8 = (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list(var3, var4, var5), var7);
            if (module0520.NIL != module0229.f15243(var8)) {
                module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, var1, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), (SubLObject)module0520.NIL, (SubLObject)ConsesLow.list(module0438.f30664(var8, (SubLObject)module0520.UNPROVIDED)));
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32617(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0205.f13390(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var7 = module0205.f13391(var1, (SubLObject)module0520.UNPROVIDED);
        if (module0520.NIL != module0269.f17708(var3) && module0520.NIL != module0229.f15236(var6, (SubLObject)module0520.UNPROVIDED) && module0225.f14739(var6).eql((SubLObject)module0520.TWO_INTEGER)) {
            final SubLObject var8 = (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list(var3, var4, var5), var7);
            if (module0520.NIL == module0229.f15243(var8)) {
                module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0202.f12771(var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), (SubLObject)module0520.NIL, (SubLObject)ConsesLow.list(module0438.f30664(module0202.f12771(var8), (SubLObject)module0520.UNPROVIDED)));
            }
        }
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32618(final SubLObject var1, SubLObject var2) {
        if (var2 == module0520.UNPROVIDED) {
            var2 = (SubLObject)module0520.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var6 = module0520.$ic54$;
        final SubLObject var7 = module0205.f13389(var1, (SubLObject)module0520.UNPROVIDED);
        final SubLObject var8 = (SubLObject)module0520.NIL;
        if (module0520.NIL != module0202.f12677(var5)) {
            final SubLObject var9 = module0202.f12684(var5);
            if (module0520.NIL != module0035.f2370((SubLObject)module0520.$ic13$, var9, (SubLObject)module0520.UNPROVIDED)) {
                var3.resetMultipleValues();
                SubLObject var10 = f32602(var9, module0520.$ic70$, module0520.$ic71$);
                final SubLObject var11 = var3.secondMultipleValue();
                final SubLObject var12 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                var10 = Sort.sort(conses_high.copy_list(var10), (SubLObject)module0520.$ic44$, (SubLObject)module0520.$ic31$);
                final SubLObject var13 = f32608(var10, var6);
                final SubLObject var14 = module0048.f3383(var10, (SubLObject)module0520.$ic45$);
                final SubLObject var15 = (SubLObject)ConsesLow.list(module0520.$ic24$, var12, var11);
                SubLObject var16 = (SubLObject)module0520.NIL;
                if (module0520.NIL != var8) {
                    print_high.print(var10, (SubLObject)module0520.UNPROVIDED);
                    print_high.print(var13, (SubLObject)module0520.UNPROVIDED);
                    module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic72$, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                }
                SubLObject var17 = Sort.sort(conses_high.copy_list(var10), (SubLObject)module0520.$ic81$, (SubLObject)module0520.$ic45$);
                SubLObject var18 = (SubLObject)module0520.NIL;
                var18 = var17.first();
                while (module0520.NIL != var17) {
                    SubLObject var20;
                    final SubLObject var19 = var20 = var18;
                    SubLObject var21 = (SubLObject)module0520.NIL;
                    SubLObject var22 = (SubLObject)module0520.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0520.$ic73$);
                    var21 = var20.first();
                    var20 = var20.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0520.$ic73$);
                    var22 = var20.first();
                    var20 = var20.rest();
                    if (module0520.NIL == var20) {
                        if (module0520.NIL != var8) {
                            module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic74$, var21, var22, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                        }
                        if (var22.numG(Numbers.add((SubLObject)module0520.FIVE_INTEGER, var14))) {
                            SubLObject var23 = (SubLObject)module0520.NIL;
                            SubLObject var24 = (SubLObject)module0520.NIL;
                            SubLObject var25 = (SubLObject)module0520.NIL;
                            if (module0520.NIL == var23) {
                                SubLObject var26 = var16;
                                SubLObject var27 = (SubLObject)module0520.NIL;
                                var27 = var26.first();
                                while (module0520.NIL == var23 && module0520.NIL != var26) {
                                    if (var21.numGE(var27.first()) && var21.numLE(conses_high.second(var27))) {
                                        var23 = (SubLObject)module0520.T;
                                    }
                                    var26 = var26.rest();
                                    var27 = var26.first();
                                }
                            }
                            if (module0520.NIL == var23) {
                                SubLObject var28 = (SubLObject)module0520.NIL;
                                if (module0520.NIL == var28) {
                                    SubLObject var29 = (SubLObject)module0520.NIL;
                                    SubLObject var136_137 = (SubLObject)module0520.NIL;
                                    SubLObject var30 = (SubLObject)module0520.NIL;
                                    SubLObject var139_140 = (SubLObject)module0520.NIL;
                                    var29 = Sequences.nreverse(conses_high.copy_list(var10));
                                    var136_137 = var29.first();
                                    var30 = Sequences.nreverse(conses_high.copy_list(var13));
                                    var139_140 = var30.first();
                                    while (module0520.NIL == var28 && (module0520.NIL != var30 || module0520.NIL != var29)) {
                                        SubLObject var143_144;
                                        final SubLObject var141_142 = var143_144 = var139_140;
                                        SubLObject var31 = (SubLObject)module0520.NIL;
                                        SubLObject var32 = (SubLObject)module0520.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)module0520.$ic75$);
                                        var31 = var143_144.first();
                                        var143_144 = var143_144.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)module0520.$ic75$);
                                        var32 = var143_144.first();
                                        var143_144 = var143_144.rest();
                                        if (module0520.NIL == var143_144) {
                                            final SubLObject var33 = conses_high.second(var136_137);
                                            if (module0520.NIL != var8) {
                                                module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic76$, var31, var32, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                                                if (!var31.eql(var136_137.first())) {
                                                    print_high.print((SubLObject)module0520.$ic77$, (SubLObject)module0520.UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)module0520.UNPROVIDED, module0520.EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (var32.numGE((SubLObject)module0520.$ic78$) && var31.numL(var21)) {
                                                var28 = (SubLObject)module0520.T;
                                                var24 = var31;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var141_142, (SubLObject)module0520.$ic75$);
                                        }
                                        var29 = var29.rest();
                                        var136_137 = var29.first();
                                        var30 = var30.rest();
                                        var139_140 = var30.first();
                                    }
                                }
                                SubLObject var34 = (SubLObject)module0520.NIL;
                                if (module0520.NIL == var34) {
                                    SubLObject var35 = (SubLObject)module0520.NIL;
                                    SubLObject var136_138 = (SubLObject)module0520.NIL;
                                    SubLObject var36 = (SubLObject)module0520.NIL;
                                    SubLObject var139_141 = (SubLObject)module0520.NIL;
                                    var35 = var10;
                                    var136_138 = var35.first();
                                    var36 = var13;
                                    var139_141 = var36.first();
                                    while (module0520.NIL == var34 && (module0520.NIL != var36 || module0520.NIL != var35)) {
                                        SubLObject var155_156;
                                        final SubLObject var153_154 = var155_156 = var139_141;
                                        SubLObject var31 = (SubLObject)module0520.NIL;
                                        SubLObject var32 = (SubLObject)module0520.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var155_156, var153_154, (SubLObject)module0520.$ic75$);
                                        var31 = var155_156.first();
                                        var155_156 = var155_156.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var155_156, var153_154, (SubLObject)module0520.$ic75$);
                                        var32 = var155_156.first();
                                        var155_156 = var155_156.rest();
                                        if (module0520.NIL == var155_156) {
                                            final SubLObject var33 = conses_high.second(var136_138);
                                            if (module0520.NIL != var8) {
                                                module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic76$, var31, var32, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                                                if (!var31.eql(var136_138.first())) {
                                                    print_high.print((SubLObject)module0520.$ic77$, (SubLObject)module0520.UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)module0520.UNPROVIDED, module0520.EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (var32.numLE((SubLObject)module0520.$ic79$) && var31.numG(var21)) {
                                                var34 = (SubLObject)module0520.T;
                                                var25 = var31;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var153_154, (SubLObject)module0520.$ic75$);
                                        }
                                        var35 = var35.rest();
                                        var136_138 = var35.first();
                                        var36 = var36.rest();
                                        var139_141 = var36.first();
                                    }
                                }
                            }
                            if (module0520.NIL != var24 && module0520.NIL != var25) {
                                if (module0520.NIL != var8) {
                                    module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic80$, var24, var25, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                                }
                                var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var25), var16);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0520.$ic73$);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
                var16 = Sort.sort(var16, (SubLObject)module0520.$ic44$, (SubLObject)module0520.$ic31$);
                if (module0520.NIL != var8) {
                    module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic82$, var16, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                }
                SubLObject var37 = (SubLObject)module0520.NIL;
                SubLObject var38 = (SubLObject)module0520.NIL;
                SubLObject var39 = (SubLObject)module0520.NIL;
                SubLObject var40 = var16;
                SubLObject var41 = (SubLObject)module0520.NIL;
                var41 = var40.first();
                while (module0520.NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var44 = (SubLObject)module0520.NIL;
                    SubLObject var45 = (SubLObject)module0520.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0520.$ic83$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0520.$ic83$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    if (module0520.NIL == var43) {
                        if (module0520.NIL != var38 && module0520.NIL != var39) {
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
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0520.$ic83$);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
                if (module0520.NIL != var38 && module0520.NIL != var39) {
                    var37 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var38, var39), var37);
                }
                if (module0520.NIL != var8) {
                    module0006.f218((SubLObject)module0520.T, (SubLObject)module0520.$ic84$, var37, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                }
                var16 = var37;
                SubLObject var46 = (SubLObject)module0520.NIL;
                SubLObject var47 = var16;
                SubLObject var48 = (SubLObject)module0520.NIL;
                var48 = var47.first();
                while (module0520.NIL != var47) {
                    var46 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0520.$ic85$, (SubLObject)ConsesLow.list(var11, var48.first()), (SubLObject)ConsesLow.list(var11, Numbers.subtract(conses_high.second(var48), var48.first()))), var46);
                    var47 = var47.rest();
                    var48 = var47.first();
                }
                var46 = module0202.f12787(var46, (SubLObject)module0520.UNPROVIDED);
                final SubLObject var49 = module0235.f15474(var46, var7, (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED);
                if (module0520.NIL != var49) {
                    module0347.f23330(module0191.f11990((SubLObject)module0520.$ic15$, module0233.f15362(var49, var1), (SubLObject)module0520.UNPROVIDED, (SubLObject)module0520.UNPROVIDED), var49, (SubLObject)module0520.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0520.NIL;
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
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32620() {
        module0520.$g3853$ = SubLFiles.defparameter("S#36061", module0018.$g660$.getGlobalValue());
        return (SubLObject)module0520.NIL;
    }
    
    public static SubLObject f32621() {
        module0340.f22938(module0520.$ic0$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic0$, (SubLObject)module0520.ONE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic2$, (SubLObject)module0520.$ic3$);
        module0340.f22938(module0520.$ic5$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic5$, (SubLObject)module0520.ONE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic6$, (SubLObject)module0520.$ic7$);
        module0340.f22938(module0520.$ic9$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic9$, (SubLObject)module0520.ONE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic10$, (SubLObject)module0520.$ic11$);
        module0340.f22938(module0520.$ic17$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic17$, (SubLObject)module0520.ONE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic17$, (SubLObject)module0520.TWO_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic18$, (SubLObject)module0520.$ic19$);
        module0340.f22938(module0520.$ic21$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic21$, (SubLObject)module0520.ONE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic22$, (SubLObject)module0520.$ic23$);
        module0340.f22938(module0520.$ic25$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic25$, (SubLObject)module0520.ONE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic25$, (SubLObject)module0520.TWO_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic26$, (SubLObject)module0520.$ic27$);
        module0340.f22938(module0520.$ic28$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic28$, (SubLObject)module0520.ONE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic28$, (SubLObject)module0520.TWO_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic28$, (SubLObject)module0520.THREE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic28$, (SubLObject)module0520.FOUR_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic28$, (SubLObject)module0520.FIVE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic29$, (SubLObject)module0520.$ic30$);
        module0340.f22938(module0520.$ic58$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic58$, (SubLObject)module0520.ONE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic58$, (SubLObject)module0520.TWO_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic58$, (SubLObject)module0520.THREE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic58$, (SubLObject)module0520.FOUR_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic58$, (SubLObject)module0520.FIVE_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic59$, (SubLObject)module0520.$ic60$);
        module0340.f22938(module0520.$ic61$);
        module0358.f23773((SubLObject)module0520.$ic1$, module0520.$ic61$);
        module0358.f23773((SubLObject)module0520.$ic62$, module0520.$ic61$);
        module0340.f22941((SubLObject)module0520.$ic63$, (SubLObject)module0520.$ic64$);
        module0340.f22941((SubLObject)module0520.$ic65$, (SubLObject)module0520.$ic66$);
        module0340.f22938(module0520.$ic67$);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic67$, (SubLObject)module0520.ONE_INTEGER);
        module0358.f23771((SubLObject)module0520.$ic1$, module0520.$ic67$, (SubLObject)module0520.TWO_INTEGER);
        module0340.f22941((SubLObject)module0520.$ic68$, (SubLObject)module0520.$ic69$);
        return (SubLObject)module0520.NIL;
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
        module0520.$g3853$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36040", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$interpolationWithCubicSpline <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$interpolationWithCubicSpline \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $ic4$ = SubLObjectFactory.makeSymbol("S#36050", "CYC");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial"));
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36041", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$interpolationWithPiecewiseLinearPolynomial <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$interpolationWithPiecewiseLinearPolynomial \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $ic8$ = SubLObjectFactory.makeSymbol("S#36051", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression"));
        $ic10$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION");
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36042", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegression <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegression \n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200)))") });
        $ic12$ = SubLObjectFactory.makeSymbol("S#36052", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#36055", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36062", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36063", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36064", "CYC"));
        $ic15$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic16$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint"));
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36044", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regressionLinesForSetsIntersectAtPoint <set-of-points> <set-of-points> ?POINT)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regressionLinesForSetsIntersectAtPoint\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 200)\n       (#$SecondsDuration 1263118210))\n      (#$The2DPoint\n       (#$DegreeCelsius 210)\n       (#$SecondsDuration 1263204610))\n      (#$The2DPoint\n       (#$DegreeCelsius 220)\n       (#$SecondsDuration 1263291010)))\n     (TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400)))\n     ?POINT)") });
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("The2DPoint"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints"));
        $ic22$ = SubLObjectFactory.makeKeyword("REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36045", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$slopeOfRegressionLineForSetOfPoints <set-of-points> ?SLOPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$slopeOfRegressionLineForSetOfPoints\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400))) ?X)") });
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PerFn"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints"));
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36046", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints <set-of-points> ?SET-OF-POINTS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints\n    (#$TheSet\n     (#$The2DPoint (#$SecondsDuration 1) (#$DegreeCelsius 1))\n     (#$The2DPoint (#$SecondsDuration 3) (#$DegreeCelsius 5))\n     (#$The2DPoint (#$SecondsDuration 5) (#$DegreeCelsius 1)))\n    #$CubicSpline\n    ?X)\n    -->\n    (#$TheSet \n     (#$The2DPoint (#$SecondsDuration 1) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 6.0))\n     (#$The2DPoint (#$SecondsDuration 3) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 0.0))\n     (#$The2DPoint (#$SecondsDuration 5) ((#$PerFn #$DegreeCelsius #$SecondsDuration) -6.0)))") });
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet"));
        $ic29$ = SubLObjectFactory.makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET");
        $ic30$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36047", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet <set-of-points> <set-of-points> <binary-function> <binary-predicate> <value-in-y-units> ?RESULT-SET-OF-POINTS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170))) \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170)))\n    #$DifferenceFn\n    #$greaterThanOrEqualTo \n    (#$Kelvin 2)\n    ?NEWSET)\n    -->\n    (((?NEWSET #$TheSet (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)))))") });
        $ic31$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic32$ = SubLObjectFactory.makeString("org.apache.commons.math.stat.regression.SimpleRegression");
        $ic33$ = SubLObjectFactory.makeString("addData");
        $ic34$ = SubLObjectFactory.makeString("double");
        $ic35$ = SubLObjectFactory.makeString("getSlope");
        $ic36$ = SubLObjectFactory.makeString("getIntercept");
        $ic37$ = SubLObjectFactory.makeSymbol("MIN");
        $ic38$ = SubLObjectFactory.makeSymbol("MAX");
        $ic39$ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.interpolation.SplineInterpolator");
        $ic40$ = SubLObjectFactory.makeString("interpolate");
        $ic41$ = SubLObjectFactory.makeString("[D");
        $ic42$ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction");
        $ic43$ = SubLObjectFactory.makeString("value");
        $ic44$ = SubLObjectFactory.makeSymbol("<");
        $ic45$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic46$ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.interpolation.LinearInterpolator");
        $ic47$ = SubLObjectFactory.makeString("predict");
        $ic48$ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.euclidean.twod.Line");
        $ic49$ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.euclidean.twod.Vector2D");
        $ic50$ = SubLObjectFactory.makeString("intersection");
        $ic51$ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.partitioning.Hyperplane");
        $ic52$ = SubLObjectFactory.makeString("getX");
        $ic53$ = SubLObjectFactory.makeString("getY");
        $ic54$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CubicSpline"));
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LinearPolynomialFunction-Piecewise"));
        $ic56$ = SubLObjectFactory.makeString("derivative");
        $ic57$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo"));
        $ic59$ = SubLObjectFactory.makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO");
        $ic60$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36057", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnTo <set-of-points> <operator> <comparator> <quant1> <quant2> ?NEWSET)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnTo \n (#$TheSet \n  (#$The2DPoint \n   (#$Meter 20.0) \n   (#$DegreeCelsius 68.35)) \n  (#$The2DPoint \n   (#$Meter 21.0) \n   (#$DegreeCelsius 72.98)) \n  (#$The2DPoint \n   (#$Meter 22.0) \n   (#$DegreeCelsius 75.68)) \n  (#$The2DPoint \n   (#$Meter 23.0) \n   (#$DegreeCelsius 78.16)) \n  (#$The2DPoint \n   (#$Meter 24.0) \n   (#$DegreeCelsius 80.79)))\n #$PlusFn\n #$lessThanOrEqualTo \n (#$DegreeCelsius 0) \n (#$DegreeCelsius 70) ?NEWSET)\n -->\n (((?NEWSET TheSet\n   (The2DPoint\n       (Meter 20.0)\n       (DegreeCelsius 68.35)))))") });
        $ic61$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("operationResultComparison"));
        $ic62$ = SubLObjectFactory.makeKeyword("NEG");
        $ic63$ = SubLObjectFactory.makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK");
        $ic64$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36058", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$operationResultComparison #$PlusFn (#$DegreeCelsius 50) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $ic65$ = SubLObjectFactory.makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK");
        $ic66$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36059", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$operationResultComparison #$PlusFn (#$DegreeCelsius 100) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths"));
        $ic68$ = SubLObjectFactory.makeKeyword("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS");
        $ic69$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36061", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36060", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$inflowLengthsWithStartingDepths <well> <set-of-points> ?LENGTH-AND-DEPTHS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$inflowLengthsWithStartingDepths\n  (#$The #$Well)\n  (#$TheSet \n   (#$The2DPoint (#$Meter 100) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 110) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 120) (#$DegreeCelsius 115))\n   (#$The2DPoint (#$Meter 130) (#$DegreeCelsius 114))\n   (#$The2DPoint (#$Meter 140) (#$DegreeCelsius 103))\n   (#$The2DPoint (#$Meter 150) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 160) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 170) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 180) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 190) (#$DegreeCelsius  91))\n   (#$The2DPoint (#$Meter 200) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 210) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 220) (#$DegreeCelsius 105))\n   (#$The2DPoint (#$Meter 230) (#$DegreeCelsius  97))\n   (#$The2DPoint (#$Meter 240) (#$DegreeCelsius  96))\n   (#$The2DPoint (#$Meter 250) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 260) (#$DegreeCelsius  94))\n   (#$The2DPoint (#$Meter 270) (#$DegreeCelsius  93))\n   (#$The2DPoint (#$Meter 280) (#$DegreeCelsius  92)))\n  ?LENGTH-AND-DEPTHS)") });
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter"));
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DegreeCelsius"));
        $ic72$ = SubLObjectFactory.makeString("~%~%");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36065", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36066", "CYC"));
        $ic74$ = SubLObjectFactory.makeString("High value: x=~A y=~A~%");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36067", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36068", "CYC"));
        $ic76$ = SubLObjectFactory.makeString("checking x=~A deriv=~A~%");
        $ic77$ = SubLObjectFactory.makeString("Bad looping");
        $ic78$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic79$ = (SubLFloat)SubLObjectFactory.makeDouble(-0.5);
        $ic80$ = SubLObjectFactory.makeString("Got interval (~A ~A)~%");
        $ic81$ = SubLObjectFactory.makeSymbol(">");
        $ic82$ = SubLObjectFactory.makeString("inflow-lengths: ~A~%");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic84$ = SubLObjectFactory.makeString("merged-inflow-lengths: ~A~%");
        $ic85$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0520.class
	Total time: 408 ms
	
	Decompiled with Procyon 0.5.32.
*/