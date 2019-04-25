package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0526 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0526";
    public static final String myFingerPrint = "2dae5f7700ba3d2ddb22509d7ff25c10fb9a7974f7398cf23707b99d998d8040";
    private static SubLSymbol $g3865$;
    private static SubLSymbol $g3866$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLList $ic20$;
    
    public static SubLObject f32859(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0526.NIL != module0340.f22789(var1) && module0526.NIL != module0035.f2169(module0340.f22825(var1), module0526.$g3865$.getGlobalValue()));
    }
    
    public static SubLObject f32860(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0526.NIL != module0526.$g3866$.getDynamicValue(var3)) {
            final SubLObject var4 = module0373.f26109();
            if (module0526.NIL != f32861(var4)) {
                final SubLObject var5 = module0521.f32624(var4, (SubLObject)module0526.T);
                final SubLObject var6 = f32862(module0363.f24581(var5));
                final SubLObject var7 = module0035.f2111((SubLObject)module0526.$ic3$, var6, (SubLObject)module0526.UNPROVIDED);
                if (module0526.NIL != var7) {
                    SubLObject var8 = var7;
                    SubLObject var9 = (SubLObject)module0526.NIL;
                    var9 = var8.first();
                    while (module0526.NIL != var8) {
                        if (module0526.ONE_INTEGER.numL(Sequences.length(module0035.f2111((SubLObject)module0526.$ic4$, var9, (SubLObject)module0526.UNPROVIDED)))) {
                            return (SubLObject)module0526.NIL;
                        }
                        var8 = var8.rest();
                        var9 = var8.first();
                    }
                    return (SubLObject)ConsesLow.list(module0204.f13100(var2));
                }
            }
        }
        return (SubLObject)module0526.NIL;
    }
    
    public static SubLObject f32861(final SubLObject var4) {
        final SubLObject var5 = module0363.f24530(var4);
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)module0526.NIL, var7 = module0032.f1742(var6, var5); module0526.NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (module0526.NIL != module0032.f1746(var7, var8) && (module0526.NIL != module0378.f26860(var8) || module0526.NIL != module0374.f26529(var8) || (module0526.NIL != module0380.f26955(var8) && module0526.NIL != f32861(module0364.f24725(var8))))) {
                return (SubLObject)module0526.T;
            }
        }
        return (SubLObject)module0526.NIL;
    }
    
    public static SubLObject f32863(final SubLObject var2) {
        final SubLObject var3 = f32864(var2);
        if (module0526.NIL != var3) {
            module0376.f26641(var3, (SubLObject)module0526.NIL);
        }
        return (SubLObject)module0526.NIL;
    }
    
    public static SubLObject f32865(final SubLObject var16) {
        final SubLObject var17 = f32866(var16);
        final SubLObject var18 = module0233.f15362(var17, var16);
        return var18;
    }
    
    public static SubLObject f32866(final SubLObject var16) {
        return f32864(module0363.f24581(var16));
    }
    
    public static SubLObject f32864(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0526.NIL;
        SubLObject var4 = f32862(var2);
        SubLObject var5 = (SubLObject)module0526.NIL;
        var5 = var4.first();
        while (module0526.NIL != var4) {
            if (module0526.NIL == module0035.f1997(var5)) {
                final SubLObject var6 = module0035.f2111((SubLObject)module0526.$ic4$, var5, (SubLObject)module0526.UNPROVIDED);
                SubLObject var7 = (SubLObject)module0526.NIL;
                if (module0526.NIL == var6) {
                    var7 = var5.first();
                }
                else if (module0526.NIL != module0035.f1997(var6)) {
                    var7 = var6.first();
                }
                SubLObject var8_21 = module0035.f2110((SubLObject)module0526.$ic4$, var5, (SubLObject)module0526.UNPROVIDED);
                SubLObject var8 = (SubLObject)module0526.NIL;
                var8 = var8_21.first();
                while (module0526.NIL != var8_21) {
                    if (!var8.eql(var7)) {
                        var3 = module0233.f15345(var8, var7, var3);
                    }
                    var8_21 = var8_21.rest();
                    var8 = var8_21.first();
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f32867(final SubLObject var23) {
        SubLObject var24 = (SubLObject)module0526.NIL;
        SubLObject var25 = module0220.f14601(var23, module0526.$ic7$, (SubLObject)module0526.ONE_INTEGER, (SubLObject)module0526.$ic8$, (SubLObject)module0526.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0526.NIL;
        var26 = var25.first();
        while (module0526.NIL != var25) {
            var24 = (SubLObject)ConsesLow.cons(var26, var24);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return var24;
    }
    
    public static SubLObject f32868(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0034.$g879$.getDynamicValue(var24);
        SubLObject var26 = (SubLObject)module0526.NIL;
        if (module0526.NIL == var25) {
            return f32867(var23);
        }
        var26 = module0034.f1857(var25, (SubLObject)module0526.$ic6$, (SubLObject)module0526.UNPROVIDED);
        if (module0526.NIL == var26) {
            var26 = module0034.f1807(module0034.f1842(var25), (SubLObject)module0526.$ic6$, (SubLObject)module0526.ONE_INTEGER, (SubLObject)module0526.$ic9$, (SubLObject)module0526.EQL, (SubLObject)module0526.UNPROVIDED);
            module0034.f1860(var25, (SubLObject)module0526.$ic6$, var26);
        }
        SubLObject var27 = module0034.f1814(var26, var23, (SubLObject)module0526.$ic10$);
        if (var27 == module0526.$ic10$) {
            var27 = Values.arg2(var24.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32867(var23)));
            module0034.f1816(var26, var23, var27, (SubLObject)module0526.UNPROVIDED);
        }
        return module0034.f1959(var27);
    }
    
    public static SubLObject f32869(final SubLObject var29, final SubLObject var30, SubLObject var31, SubLObject var32) {
        if (var31 == module0526.UNPROVIDED) {
            var31 = (SubLObject)module0526.NIL;
        }
        if (var32 == module0526.UNPROVIDED) {
            var32 = (SubLObject)module0526.NIL;
        }
        return module0256.f16604(var29, module0213.f13926(var30, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED), var31, var32);
    }
    
    public static SubLObject f32870(final SubLObject var29, final SubLObject var30, SubLObject var31, SubLObject var32) {
        if (var31 == module0526.UNPROVIDED) {
            var31 = (SubLObject)module0526.NIL;
        }
        if (var32 == module0526.UNPROVIDED) {
            var32 = (SubLObject)module0526.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0034.$g879$.getDynamicValue(var33);
        SubLObject var35 = (SubLObject)module0526.NIL;
        if (module0526.NIL == var34) {
            return f32869(var29, var30, var31, var32);
        }
        var35 = module0034.f1857(var34, (SubLObject)module0526.$ic11$, (SubLObject)module0526.UNPROVIDED);
        if (module0526.NIL == var35) {
            var35 = module0034.f1807(module0034.f1842(var34), (SubLObject)module0526.$ic11$, (SubLObject)module0526.FOUR_INTEGER, (SubLObject)module0526.$ic12$, (SubLObject)module0526.EQUAL, (SubLObject)module0526.UNPROVIDED);
            module0034.f1860(var34, (SubLObject)module0526.$ic11$, var35);
        }
        final SubLObject var36 = module0034.f1780(var29, var30, var31, var32);
        final SubLObject var37 = module0034.f1814(var35, var36, (SubLObject)module0526.UNPROVIDED);
        if (var37 != module0526.$ic10$) {
            SubLObject var38 = var37;
            SubLObject var39 = (SubLObject)module0526.NIL;
            var39 = var38.first();
            while (module0526.NIL != var38) {
                SubLObject var40 = var39.first();
                final SubLObject var41 = conses_high.second(var39);
                if (var29.equal(var40.first())) {
                    var40 = var40.rest();
                    if (var30.equal(var40.first())) {
                        var40 = var40.rest();
                        if (var31.equal(var40.first())) {
                            var40 = var40.rest();
                            if (module0526.NIL != var40 && module0526.NIL == var40.rest() && var32.equal(var40.first())) {
                                return module0034.f1959(var41);
                            }
                        }
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        final SubLObject var42 = Values.arg2(var33.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32869(var29, var30, var31, var32)));
        module0034.f1836(var35, var36, var37, var42, (SubLObject)ConsesLow.list(var29, var30, var31, var32));
        return module0034.f1959(var42);
    }
    
    public static SubLObject f32862(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0526.NIL;
        SubLObject var4 = (SubLObject)module0526.NIL;
        final SubLObject var5 = module0521.f32635(var2);
        SubLObject var6 = (SubLObject)module0526.ZERO_INTEGER;
        SubLObject var7 = module0232.f15308(var2);
        SubLObject var8 = (SubLObject)module0526.NIL;
        var8 = var7.first();
        while (module0526.NIL != var7) {
            SubLObject var10;
            final SubLObject var9 = var10 = var8;
            SubLObject var11 = (SubLObject)module0526.NIL;
            SubLObject var12 = (SubLObject)module0526.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0526.$ic13$);
            var11 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0526.$ic13$);
            var12 = var10.first();
            var10 = var10.rest();
            if (module0526.NIL == var10) {
                final SubLObject var13 = module0205.f13378(var12);
                if (module0526.NIL != module0173.f10955(var13)) {
                    final SubLObject var14 = f32868(var13);
                    if (module0526.NIL != var14) {
                        SubLObject var8_50 = var14;
                        SubLObject var15 = (SubLObject)module0526.NIL;
                        var15 = var8_50.first();
                        while (module0526.NIL != var8_50) {
                            SubLObject var54_55;
                            final SubLObject var52_53 = var54_55 = var15;
                            SubLObject var16 = (SubLObject)module0526.NIL;
                            SubLObject var17 = (SubLObject)module0526.NIL;
                            SubLObject var18 = (SubLObject)module0526.NIL;
                            SubLObject var19 = (SubLObject)module0526.NIL;
                            SubLObject var20 = (SubLObject)module0526.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var54_55, var52_53, (SubLObject)module0526.$ic14$);
                            var16 = var54_55.first();
                            var54_55 = var54_55.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var54_55, var52_53, (SubLObject)module0526.$ic14$);
                            var17 = var54_55.first();
                            var54_55 = var54_55.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var54_55, var52_53, (SubLObject)module0526.$ic14$);
                            var18 = var54_55.first();
                            var54_55 = var54_55.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var54_55, var52_53, (SubLObject)module0526.$ic14$);
                            var19 = var54_55.first();
                            var54_55 = var54_55.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var54_55, var52_53, (SubLObject)module0526.$ic14$);
                            var20 = var54_55.first();
                            var54_55 = var54_55.rest();
                            if (module0526.NIL == var54_55) {
                                if (var20.eql((SubLObject)module0526.ONE_INTEGER) && var17.eql(module0526.$ic15$)) {
                                    final SubLObject var21 = module0205.f13384(var12, var16, (SubLObject)module0526.UNPROVIDED);
                                    final SubLObject var22 = module0205.f13384(var12, var18, (SubLObject)module0526.UNPROVIDED);
                                    if (module0526.NIL != ((module0526.NIL != module0173.f10955(var22)) ? module0256.f16598(var22, var19) : f32870(var19, conses_high.third(Sequences.find(var22, var5, (SubLObject)module0526.EQL, (SubLObject)module0526.$ic16$, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED)), (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED))) {
                                        final SubLObject var23 = module0038.f2966(Sequences.cconcatenate(module0006.f203(var13), new SubLObject[] { module0526.$ic17$, module0006.f203(var16), module0526.$ic17$, module0006.f203(var18), module0526.$ic17$, module0006.f203(var19) }));
                                        var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23, var21, var22), var3);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var52_53, (SubLObject)module0526.$ic14$);
                            }
                            var8_50 = var8_50.rest();
                            var15 = var8_50.first();
                        }
                    }
                    if (module0526.NIL != module0205.f13320(var13)) {
                        var3 = (SubLObject)ConsesLow.cons(var12, var3);
                        if (module0526.NIL != module0226.f14797(var13)) {
                            final SubLObject var24 = module0202.f12768(var13, module0205.f13388(var12, (SubLObject)module0526.UNPROVIDED), module0205.f13387(var12, (SubLObject)module0526.UNPROVIDED));
                            if (module0526.NIL == conses_high.member(var24, var3, Symbols.symbol_function((SubLObject)module0526.EQL), Symbols.symbol_function((SubLObject)module0526.IDENTITY))) {
                                var3 = (SubLObject)ConsesLow.cons(var24, var3);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0526.$ic13$);
            }
            var6 = Numbers.add(var6, (SubLObject)module0526.ONE_INTEGER);
            var7 = var7.rest();
            var8 = var7.first();
        }
        if (module0526.NIL != module0035.f2194(var3, Symbols.symbol_function((SubLObject)module0526.EQUAL), (SubLObject)module0526.$ic18$)) {
            SubLObject var25 = f32871((SubLObject)module0526.UNPROVIDED);
            SubLObject var26 = (SubLObject)module0526.NIL;
            SubLObject var27 = (SubLObject)module0526.ZERO_INTEGER;
            SubLObject var28 = module0232.f15308(var2);
            SubLObject var29 = (SubLObject)module0526.NIL;
            var29 = var28.first();
            while (module0526.NIL != var28) {
                SubLObject var31;
                final SubLObject var30 = var31 = var29;
                SubLObject var32 = (SubLObject)module0526.NIL;
                SubLObject var33 = (SubLObject)module0526.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0526.$ic13$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0526.$ic13$);
                var33 = var31.first();
                var31 = var31.rest();
                if (module0526.NIL == var31) {
                    if (module0205.f13378(var33).eql(module0526.$ic19$)) {
                        f32872(module0205.f13388(var33, (SubLObject)module0526.UNPROVIDED), module0205.f13387(var33, (SubLObject)module0526.UNPROVIDED), var25);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0526.$ic13$);
                }
                var27 = Numbers.add(var27, (SubLObject)module0526.ONE_INTEGER);
                var28 = var28.rest();
                var29 = var28.first();
            }
            final SubLObject var34 = module0035.f2269(Mapping.mapcar((SubLObject)module0526.$ic18$, var3), (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED);
            while (module0526.NIL == var26) {
                var26 = (SubLObject)module0526.T;
                var28 = var34;
                SubLObject var35 = (SubLObject)module0526.NIL;
                var35 = var28.first();
                while (module0526.NIL != var28) {
                    SubLObject var8_51;
                    final SubLObject var36 = var8_51 = (SubLObject)(var35.isKeyword() ? module0526.$ic20$ : module0205.f13322(var35, (SubLObject)module0526.T));
                    SubLObject var37 = (SubLObject)module0526.NIL;
                    var37 = var8_51.first();
                    while (module0526.NIL != var8_51) {
                        SubLObject var8_52 = var3;
                        SubLObject var38 = (SubLObject)module0526.NIL;
                        var38 = var8_52.first();
                        while (module0526.NIL != var8_52) {
                            if (var35.equal(module0205.f13378(var38))) {
                                SubLObject var8_53 = var3;
                                SubLObject var39 = (SubLObject)module0526.NIL;
                                var39 = var8_53.first();
                                while (module0526.NIL != var8_53) {
                                    if (var35.equal(module0205.f13378(var39)) && !var38.equal(var39)) {
                                        final SubLObject var40 = module0205.f13376(var38, var37, (SubLObject)module0526.UNPROVIDED);
                                        final SubLObject var41 = module0205.f13376(var39, var37, (SubLObject)module0526.UNPROVIDED);
                                        SubLObject var42 = (SubLObject)module0526.T;
                                        if (module0526.NIL == f32873(var40, var41, var25)) {
                                            SubLObject var43 = (SubLObject)module0526.ZERO_INTEGER;
                                            SubLObject var44 = (SubLObject)module0526.NIL;
                                            SubLObject var83_84 = (SubLObject)module0526.NIL;
                                            SubLObject var45 = (SubLObject)module0526.NIL;
                                            SubLObject var86_87 = (SubLObject)module0526.NIL;
                                            var44 = var38;
                                            var83_84 = var44.first();
                                            var45 = var39;
                                            var86_87 = var45.first();
                                            while (module0526.NIL != var45 || module0526.NIL != var44) {
                                                if (!var43.eql((SubLObject)module0526.ZERO_INTEGER) && !var43.eql(var37) && module0526.NIL == f32873(var83_84, var86_87, var25)) {
                                                    var42 = (SubLObject)module0526.NIL;
                                                }
                                                var43 = Numbers.add(var43, (SubLObject)module0526.ONE_INTEGER);
                                                var44 = var44.rest();
                                                var83_84 = var44.first();
                                                var45 = var45.rest();
                                                var86_87 = var45.first();
                                            }
                                            if (module0526.NIL != var42) {
                                                var25 = f32872(var40, var41, var25);
                                                var26 = (SubLObject)module0526.NIL;
                                            }
                                        }
                                    }
                                    var8_53 = var8_53.rest();
                                    var39 = var8_53.first();
                                }
                            }
                            var8_52 = var8_52.rest();
                            var38 = var8_52.first();
                        }
                        var8_51 = var8_51.rest();
                        var37 = var8_51.first();
                    }
                    var28 = var28.rest();
                    var35 = var28.first();
                }
            }
            var7 = f32874(var25);
            SubLObject var46 = (SubLObject)module0526.NIL;
            var46 = var7.first();
            while (module0526.NIL != var7) {
                final SubLObject var47 = f32875(var46, var25);
                if (module0526.NIL != module0035.f2110((SubLObject)module0526.$ic4$, var47, (SubLObject)module0526.UNPROVIDED)) {
                    var4 = (SubLObject)ConsesLow.cons(var47, var4);
                }
                var7 = var7.rest();
                var46 = var7.first();
            }
            var7 = module0205.f13183(var2, (SubLObject)module0526.$ic4$, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED);
            SubLObject var48 = (SubLObject)module0526.NIL;
            var48 = var7.first();
            while (module0526.NIL != var7) {
                if (module0526.NIL == f32876(var25, var48)) {
                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var48), var4);
                }
                var7 = var7.rest();
                var48 = var7.first();
            }
        }
        return var4;
    }
    
    public static SubLObject f32871(SubLObject var90) {
        if (var90 == module0526.UNPROVIDED) {
            var90 = Symbols.symbol_function((SubLObject)module0526.EQUAL);
        }
        return Hashtables.make_hash_table((SubLObject)module0526.TEN_INTEGER, var90, (SubLObject)module0526.UNPROVIDED);
    }
    
    public static SubLObject f32877(final SubLObject var65) {
        return module0030.f1638(var65, (SubLObject)module0526.UNPROVIDED);
    }
    
    public static SubLObject f32874(final SubLObject var65) {
        return module0035.f2269(module0030.f1627(var65), (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED, (SubLObject)module0526.UNPROVIDED);
    }
    
    public static SubLObject f32876(final SubLObject var65, final SubLObject var91) {
        return Hashtables.gethash(var91, var65, (SubLObject)module0526.UNPROVIDED);
    }
    
    public static SubLObject f32875(final SubLObject var88, final SubLObject var65) {
        SubLObject var89 = (SubLObject)module0526.NIL;
        SubLObject var90 = (SubLObject)module0526.NIL;
        SubLObject var91 = (SubLObject)module0526.NIL;
        final Iterator var92 = Hashtables.getEntrySetIterator(var65);
        try {
            while (Hashtables.iteratorHasNext(var92)) {
                final Map.Entry var93 = Hashtables.iteratorNextEntry(var92);
                var90 = Hashtables.getEntryKey(var93);
                var91 = Hashtables.getEntryValue(var93);
                if (var91.eql(var88)) {
                    var89 = (SubLObject)ConsesLow.cons(var90, var89);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var92);
        }
        return Sequences.nreverse(var89);
    }
    
    public static SubLObject f32873(final SubLObject var96, final SubLObject var97, SubLObject var65) {
        var65 = f32878(var96, var65);
        var65 = f32878(var97, var65);
        return Equality.eql(Hashtables.gethash(var96, var65, (SubLObject)module0526.UNPROVIDED), Hashtables.gethash(var97, var65, (SubLObject)module0526.UNPROVIDED));
    }
    
    public static SubLObject f32878(final SubLObject var91, final SubLObject var65) {
        if (module0526.NIL != Hashtables.gethash(var91, var65, (SubLObject)module0526.UNPROVIDED)) {
            return var65;
        }
        final SubLObject var92 = module0030.f1627(var65);
        if (module0526.NIL == var92) {
            Hashtables.sethash(var91, var65, (SubLObject)module0526.ZERO_INTEGER);
        }
        else {
            Hashtables.sethash(var91, var65, Numbers.add(module0048.f3381(var92, (SubLObject)module0526.UNPROVIDED), (SubLObject)module0526.ONE_INTEGER));
        }
        return var65;
    }
    
    public static SubLObject f32872(final SubLObject var96, final SubLObject var97, SubLObject var65) {
        var65 = f32878(var96, var65);
        var65 = f32878(var97, var65);
        final SubLObject var98 = Hashtables.gethash(var97, var65, (SubLObject)module0526.UNPROVIDED);
        final SubLObject var99 = Hashtables.gethash(var96, var65, (SubLObject)module0526.UNPROVIDED);
        SubLObject var100 = (SubLObject)module0526.NIL;
        SubLObject var101 = (SubLObject)module0526.NIL;
        final Iterator var102 = Hashtables.getEntrySetIterator(var65);
        try {
            while (Hashtables.iteratorHasNext(var102)) {
                final Map.Entry var103 = Hashtables.iteratorNextEntry(var102);
                var100 = Hashtables.getEntryKey(var103);
                var101 = Hashtables.getEntryValue(var103);
                if (var101.eql(var98)) {
                    Hashtables.sethash(var100, var65, var99);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var102);
        }
        return var65;
    }
    
    public static SubLObject f32879() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32859", "S#29760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32860", "S#36302", 1, 0, false);
        new $f32860$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32861", "S#36303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32863", "S#36304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32865", "S#36305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32866", "S#36306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32864", "S#36307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32867", "S#36308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32868", "S#36309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32869", "S#36310", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32870", "S#36311", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32862", "S#36312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32871", "S#36313", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32877", "S#36314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32874", "S#36315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32876", "S#36316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32875", "S#36317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32873", "S#36318", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32878", "S#36319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0526", "f32872", "S#36320", 3, 0, false);
        return (SubLObject)module0526.NIL;
    }
    
    public static SubLObject f32880() {
        module0526.$g3865$ = SubLFiles.deflexical("S#36321", (SubLObject)module0526.$ic0$);
        module0526.$g3866$ = SubLFiles.defparameter("S#36322", (SubLObject)module0526.T);
        return (SubLObject)module0526.NIL;
    }
    
    public static SubLObject f32881() {
        module0340.f22962((SubLObject)module0526.$ic1$, (SubLObject)module0526.$ic2$);
        module0012.f419((SubLObject)module0526.$ic5$);
        module0034.f1895((SubLObject)module0526.$ic6$);
        module0034.f1895((SubLObject)module0526.$ic11$);
        return (SubLObject)module0526.NIL;
    }
    
    public void declareFunctions() {
        f32879();
    }
    
    public void initializeVariables() {
        f32880();
    }
    
    public void runTopLevelForms() {
        f32881();
    }
    
    static {
        me = (SubLFile)new module0526();
        module0526.$g3865$ = null;
        module0526.$g3866$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY"));
        $ic1$ = SubLObjectFactory.makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("BACKWARD"), SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), module0526.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#36302", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0526.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36304", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Simplification module to bind variables to forts or other variables when functional predicate can be used to prove equivalence.") });
        $ic3$ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $ic4$ = SubLObjectFactory.makeSymbol("HL-VARIABLE-P");
        $ic5$ = SubLObjectFactory.makeSymbol("S#36302", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#36309", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgDependentCardinality"));
        $ic8$ = ConsesLow.list((SubLObject)module0526.TWO_INTEGER, (SubLObject)module0526.THREE_INTEGER, (SubLObject)module0526.FOUR_INTEGER, (SubLObject)module0526.FIVE_INTEGER, (SubLObject)module0526.SIX_INTEGER);
        $ic9$ = SubLObjectFactory.makeInteger(100);
        $ic10$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic11$ = SubLObjectFactory.makeSymbol("S#36311", "CYC");
        $ic12$ = SubLObjectFactory.makeInteger(1024);
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13112", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36323", "CYC"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic16$ = SubLObjectFactory.makeSymbol("CAR");
        $ic17$ = SubLObjectFactory.makeString("-");
        $ic18$ = SubLObjectFactory.makeSymbol("S#13459", "CYC");
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $ic20$ = ConsesLow.list((SubLObject)module0526.TWO_INTEGER);
    }
    
    public static final class $f32860$UnaryFunction extends UnaryFunction
    {
        public $f32860$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36302"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0526.f32860(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0526.class
	Total time: 285 ms
	
	Decompiled with Procyon 0.5.32.
*/