package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0521 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0521";
    public static final String myFingerPrint = "bd7bc5c6da1dccf7d30b2071b3eec346df8351218a78666688ef49727bb1d81a";
    private static SubLSymbol $g3854$;
    private static SubLSymbol $g3855$;
    private static SubLSymbol $g3856$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLList $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    
    public static SubLObject f32622(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0521.NIL != module0340.f22789(var1) && module0521.NIL != module0004.f104(module0340.f22825(var1), module0521.$g3854$.getGlobalValue(), (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED));
    }
    
    public static SubLObject f32623(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0521.NIL != module0365.f24819(var2) && module0521.NIL != f32622(module0365.f24865(var2)));
    }
    
    public static SubLObject f32624(final SubLObject var3, SubLObject var4) {
        if (var4 == module0521.UNPROVIDED) {
            var4 = (SubLObject)module0521.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0521.NIL;
        final SubLObject var7 = module0363.f24514(var3);
        final SubLObject var8 = module0034.$g879$.currentBinding(var5);
        try {
            module0034.$g879$.bind(var7, var5);
            SubLObject var9 = (SubLObject)module0521.NIL;
            if (module0521.NIL != var7 && module0521.NIL == module0034.f1842(var7)) {
                var9 = module0034.f1869(var7);
                final SubLObject var10 = Threads.current_process();
                if (module0521.NIL == var9) {
                    module0034.f1873(var7, var10);
                }
                else if (!var9.eql(var10)) {
                    Errors.error((SubLObject)module0521.$ic3$);
                }
            }
            try {
                var6 = f32625(var3, var4);
            }
            finally {
                final SubLObject var8_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0521.T, var5);
                    if (module0521.NIL != var7 && module0521.NIL == var9) {
                        module0034.f1873(var7, (SubLObject)module0521.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_11, var5);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f32626(final SubLObject var3, SubLObject var4) {
        if (var4 == module0521.UNPROVIDED) {
            var4 = (SubLObject)module0521.NIL;
        }
        final SubLObject var5 = module0363.f24509(var3);
        SubLObject var6 = module0363.f24509(var3);
        SubLObject var7 = (SubLObject)module0521.NIL;
        SubLObject var8 = (SubLObject)module0521.NIL;
        final SubLObject var9 = module0363.f24530(var3);
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = module0032.f1741(var9), var11 = (SubLObject)module0521.NIL, var11 = module0032.f1742(var10, var9); module0521.NIL == var8 && module0521.NIL == module0032.f1744(var10, var11); var11 = module0032.f1743(var11)) {
            var12 = module0032.f1745(var10, var11);
            if (module0521.NIL != module0032.f1746(var11, var12) && module0521.NIL != module0364.f24748(var12, (SubLObject)module0521.$ic5$)) {
                var8 = (SubLObject)module0521.T;
                var13 = module0233.f15376(module0378.f26871(var12), module0363.f24509(module0378.f26877(var12)));
                var7 = module0035.f2399(var13, (SubLObject)module0521.$ic6$, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED);
            }
        }
        if (module0521.NIL != var7) {
            SubLObject var14 = (SubLObject)module0521.NIL;
            SubLObject var15 = var5;
            SubLObject var16 = (SubLObject)module0521.NIL;
            var16 = var15.first();
            while (module0521.NIL != var15) {
                SubLObject var17 = (SubLObject)module0521.$ic7$;
                SubLObject var18 = (SubLObject)module0521.ZERO_INTEGER;
                SubLObject var22_26 = module0232.f15306(var16);
                SubLObject var19 = (SubLObject)module0521.NIL;
                var19 = var22_26.first();
                while (module0521.NIL != var22_26) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    SubLObject var22 = (SubLObject)module0521.NIL;
                    SubLObject var23 = (SubLObject)module0521.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0521.$ic8$);
                    var22 = var21.first();
                    var21 = var21.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0521.$ic8$);
                    var23 = var21.first();
                    var21 = var21.rest();
                    if (module0521.NIL == var21) {
                        if (module0521.NIL != module0035.f2437(var7, var23, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED)) {
                            var14 = (SubLObject)ConsesLow.cons(module0362.f24434(var22, var23), var14);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0521.$ic8$);
                    }
                    var18 = Numbers.add(var18, (SubLObject)module0521.ONE_INTEGER);
                    var22_26 = var22_26.rest();
                    var19 = var22_26.first();
                }
                var17 = (SubLObject)module0521.$ic9$;
                var18 = (SubLObject)module0521.ZERO_INTEGER;
                SubLObject var22_27 = module0232.f15308(var16);
                var19 = (SubLObject)module0521.NIL;
                var19 = var22_27.first();
                while (module0521.NIL != var22_27) {
                    SubLObject var25;
                    final SubLObject var24 = var25 = var19;
                    SubLObject var22 = (SubLObject)module0521.NIL;
                    SubLObject var23 = (SubLObject)module0521.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0521.$ic8$);
                    var22 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0521.$ic8$);
                    var23 = var25.first();
                    var25 = var25.rest();
                    if (module0521.NIL == var25) {
                        if (module0521.NIL != module0035.f2437(var7, var23, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED)) {
                            var14 = (SubLObject)ConsesLow.cons(module0362.f24434(var22, var23), var14);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)module0521.$ic8$);
                    }
                    var18 = Numbers.add(var18, (SubLObject)module0521.ONE_INTEGER);
                    var22_27 = var22_27.rest();
                    var19 = var22_27.first();
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
            if (module0521.NIL != var14) {
                var6 = module0362.f24449(module0232.f15305((SubLObject)module0521.NIL, var14));
                if (module0521.NIL != var4) {
                    SubLObject var26 = (SubLObject)module0521.NIL;
                    SubLObject var27 = var5;
                    SubLObject var28 = (SubLObject)module0521.NIL;
                    var28 = var27.first();
                    while (module0521.NIL != var27) {
                        SubLObject var29 = (SubLObject)module0521.$ic7$;
                        SubLObject var30 = (SubLObject)module0521.ZERO_INTEGER;
                        SubLObject var22_28 = module0232.f15306(var28);
                        SubLObject var31 = (SubLObject)module0521.NIL;
                        var31 = var22_28.first();
                        while (module0521.NIL != var22_28) {
                            SubLObject var33;
                            final SubLObject var32 = var33 = var31;
                            SubLObject var34 = (SubLObject)module0521.NIL;
                            SubLObject var35 = (SubLObject)module0521.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0521.$ic8$);
                            var34 = var33.first();
                            var33 = var33.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0521.$ic8$);
                            var35 = var33.first();
                            var33 = var33.rest();
                            if (module0521.NIL == var33) {
                                SubLObject var36;
                                SubLObject var37;
                                SubLObject var23_40;
                                SubLObject var38;
                                SubLObject var25_42;
                                SubLObject var22_29;
                                SubLObject var27_44;
                                SubLObject var47_48;
                                SubLObject var45_46;
                                SubLObject var39;
                                SubLObject var40;
                                SubLObject var41;
                                SubLObject var25_43;
                                SubLObject var22_30;
                                SubLObject var27_45;
                                SubLObject var57_58;
                                SubLObject var55_56;
                                for (var36 = (SubLObject)module0521.NIL, var37 = (SubLObject)module0521.NIL, var37 = var6; module0521.NIL == var36 && module0521.NIL != var37; var37 = var37.rest()) {
                                    var23_40 = var37.first();
                                    var38 = (SubLObject)module0521.$ic7$;
                                    var25_42 = (SubLObject)module0521.ZERO_INTEGER;
                                    var22_29 = module0232.f15306(var23_40);
                                    var27_44 = (SubLObject)module0521.NIL;
                                    var27_44 = var22_29.first();
                                    while (module0521.NIL != var22_29) {
                                        var45_46 = (var47_48 = var27_44);
                                        var39 = (SubLObject)module0521.NIL;
                                        var40 = (SubLObject)module0521.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0521.$ic10$);
                                        var39 = var47_48.first();
                                        var47_48 = var47_48.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0521.$ic10$);
                                        var40 = var47_48.first();
                                        var47_48 = var47_48.rest();
                                        if (module0521.NIL == var47_48) {
                                            if (var34.equal(var39) && (var35.equal(var40) || module0521.NIL != module0234.f15444(var35, var40, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED))) {
                                                var41 = module0362.f24434(var34, var35);
                                                if (module0521.NIL == conses_high.member(var41, var26, (SubLObject)module0521.EQUAL, Symbols.symbol_function((SubLObject)module0521.IDENTITY))) {
                                                    var26 = (SubLObject)ConsesLow.cons(var41, var26);
                                                }
                                                var36 = (SubLObject)module0521.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var45_46, (SubLObject)module0521.$ic10$);
                                        }
                                        var25_42 = Numbers.add(var25_42, (SubLObject)module0521.ONE_INTEGER);
                                        var22_29 = var22_29.rest();
                                        var27_44 = var22_29.first();
                                    }
                                    var38 = (SubLObject)module0521.$ic9$;
                                    var25_43 = (SubLObject)module0521.ZERO_INTEGER;
                                    var22_30 = module0232.f15308(var23_40);
                                    var27_45 = (SubLObject)module0521.NIL;
                                    var27_45 = var22_30.first();
                                    while (module0521.NIL != var22_30) {
                                        var55_56 = (var57_58 = var27_45);
                                        var39 = (SubLObject)module0521.NIL;
                                        var40 = (SubLObject)module0521.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var57_58, var55_56, (SubLObject)module0521.$ic10$);
                                        var39 = var57_58.first();
                                        var57_58 = var57_58.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var57_58, var55_56, (SubLObject)module0521.$ic10$);
                                        var40 = var57_58.first();
                                        var57_58 = var57_58.rest();
                                        if (module0521.NIL == var57_58) {
                                            if (var34.equal(var39) && (var35.equal(var40) || module0521.NIL != module0234.f15444(var35, var40, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED))) {
                                                var41 = module0362.f24434(var34, var35);
                                                if (module0521.NIL == conses_high.member(var41, var26, (SubLObject)module0521.EQUAL, Symbols.symbol_function((SubLObject)module0521.IDENTITY))) {
                                                    var26 = (SubLObject)ConsesLow.cons(var41, var26);
                                                }
                                                var36 = (SubLObject)module0521.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var55_56, (SubLObject)module0521.$ic10$);
                                        }
                                        var25_43 = Numbers.add(var25_43, (SubLObject)module0521.ONE_INTEGER);
                                        var22_30 = var22_30.rest();
                                        var27_45 = var22_30.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0521.$ic8$);
                            }
                            var30 = Numbers.add(var30, (SubLObject)module0521.ONE_INTEGER);
                            var22_28 = var22_28.rest();
                            var31 = var22_28.first();
                        }
                        var29 = (SubLObject)module0521.$ic9$;
                        var30 = (SubLObject)module0521.ZERO_INTEGER;
                        SubLObject var22_31 = module0232.f15308(var28);
                        var31 = (SubLObject)module0521.NIL;
                        var31 = var22_31.first();
                        while (module0521.NIL != var22_31) {
                            SubLObject var43;
                            final SubLObject var42 = var43 = var31;
                            SubLObject var34 = (SubLObject)module0521.NIL;
                            SubLObject var35 = (SubLObject)module0521.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0521.$ic8$);
                            var34 = var43.first();
                            var43 = var43.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0521.$ic8$);
                            var35 = var43.first();
                            var43 = var43.rest();
                            if (module0521.NIL == var43) {
                                SubLObject var36;
                                SubLObject var37;
                                SubLObject var38;
                                SubLObject var39;
                                SubLObject var40;
                                SubLObject var41;
                                SubLObject var23_41;
                                SubLObject var25_44;
                                SubLObject var22_32;
                                SubLObject var27_46;
                                SubLObject var68_69;
                                SubLObject var66_67;
                                SubLObject var25_45;
                                SubLObject var22_33;
                                SubLObject var27_47;
                                SubLObject var75_76;
                                SubLObject var73_74;
                                for (var36 = (SubLObject)module0521.NIL, var37 = (SubLObject)module0521.NIL, var37 = var6; module0521.NIL == var36 && module0521.NIL != var37; var37 = var37.rest()) {
                                    var23_41 = var37.first();
                                    var38 = (SubLObject)module0521.$ic7$;
                                    var25_44 = (SubLObject)module0521.ZERO_INTEGER;
                                    var22_32 = module0232.f15306(var23_41);
                                    var27_46 = (SubLObject)module0521.NIL;
                                    var27_46 = var22_32.first();
                                    while (module0521.NIL != var22_32) {
                                        var66_67 = (var68_69 = var27_46);
                                        var39 = (SubLObject)module0521.NIL;
                                        var40 = (SubLObject)module0521.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var68_69, var66_67, (SubLObject)module0521.$ic10$);
                                        var39 = var68_69.first();
                                        var68_69 = var68_69.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var68_69, var66_67, (SubLObject)module0521.$ic10$);
                                        var40 = var68_69.first();
                                        var68_69 = var68_69.rest();
                                        if (module0521.NIL == var68_69) {
                                            if (var34.equal(var39) && (var35.equal(var40) || module0521.NIL != module0234.f15444(var35, var40, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED))) {
                                                var41 = module0362.f24434(var34, var35);
                                                if (module0521.NIL == conses_high.member(var41, var26, (SubLObject)module0521.EQUAL, Symbols.symbol_function((SubLObject)module0521.IDENTITY))) {
                                                    var26 = (SubLObject)ConsesLow.cons(var41, var26);
                                                }
                                                var36 = (SubLObject)module0521.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var66_67, (SubLObject)module0521.$ic10$);
                                        }
                                        var25_44 = Numbers.add(var25_44, (SubLObject)module0521.ONE_INTEGER);
                                        var22_32 = var22_32.rest();
                                        var27_46 = var22_32.first();
                                    }
                                    var38 = (SubLObject)module0521.$ic9$;
                                    var25_45 = (SubLObject)module0521.ZERO_INTEGER;
                                    var22_33 = module0232.f15308(var23_41);
                                    var27_47 = (SubLObject)module0521.NIL;
                                    var27_47 = var22_33.first();
                                    while (module0521.NIL != var22_33) {
                                        var73_74 = (var75_76 = var27_47);
                                        var39 = (SubLObject)module0521.NIL;
                                        var40 = (SubLObject)module0521.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var75_76, var73_74, (SubLObject)module0521.$ic10$);
                                        var39 = var75_76.first();
                                        var75_76 = var75_76.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var75_76, var73_74, (SubLObject)module0521.$ic10$);
                                        var40 = var75_76.first();
                                        var75_76 = var75_76.rest();
                                        if (module0521.NIL == var75_76) {
                                            if (var34.equal(var39) && (var35.equal(var40) || module0521.NIL != module0234.f15444(var35, var40, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED))) {
                                                var41 = module0362.f24434(var34, var35);
                                                if (module0521.NIL == conses_high.member(var41, var26, (SubLObject)module0521.EQUAL, Symbols.symbol_function((SubLObject)module0521.IDENTITY))) {
                                                    var26 = (SubLObject)ConsesLow.cons(var41, var26);
                                                }
                                                var36 = (SubLObject)module0521.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var73_74, (SubLObject)module0521.$ic10$);
                                        }
                                        var25_45 = Numbers.add(var25_45, (SubLObject)module0521.ONE_INTEGER);
                                        var22_33 = var22_33.rest();
                                        var27_47 = var22_33.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0521.$ic8$);
                            }
                            var30 = Numbers.add(var30, (SubLObject)module0521.ONE_INTEGER);
                            var22_31 = var22_31.rest();
                            var31 = var22_31.first();
                        }
                        var27 = var27.rest();
                        var28 = var27.first();
                    }
                    if (module0521.NIL != var26) {
                        var6 = module0362.f24449(module0232.f15305((SubLObject)module0521.NIL, var26));
                    }
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f32625(final SubLObject var3, SubLObject var4) {
        if (var4 == module0521.UNPROVIDED) {
            var4 = (SubLObject)module0521.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0521.NIL;
        if (module0521.NIL == var6) {
            return f32626(var3, var4);
        }
        var7 = module0034.f1857(var6, (SubLObject)module0521.$ic4$, (SubLObject)module0521.UNPROVIDED);
        if (module0521.NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)module0521.$ic4$, (SubLObject)module0521.TWO_INTEGER, (SubLObject)module0521.NIL, (SubLObject)module0521.EQL, (SubLObject)module0521.UNPROVIDED);
            module0034.f1860(var6, (SubLObject)module0521.$ic4$, var7);
        }
        final SubLObject var8 = module0034.f1782(var3, var4);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)module0521.UNPROVIDED);
        if (var9 != module0521.$ic11$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)module0521.NIL;
            var11 = var10.first();
            while (module0521.NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var3.eql(var12.first())) {
                    var12 = var12.rest();
                    if (module0521.NIL != var12 && module0521.NIL == var12.rest() && var4.eql(var12.first())) {
                        return module0034.f1959(var13);
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var14 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32626(var3, var4)));
        module0034.f1836(var7, var8, var9, var14, (SubLObject)ConsesLow.list(var3, var4));
        return module0034.f1959(var14);
    }
    
    public static SubLObject f32627(final SubLObject var85) {
        final SubLObject var86 = module0373.f26109();
        if (module0521.NIL != f32628(var86)) {
            final SubLObject var87 = f32624(var86, (SubLObject)module0521.UNPROVIDED);
            if (module0521.NIL != f32629(var87)) {
                return (SubLObject)ConsesLow.list(module0204.f13100(var85));
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32630(final SubLObject var85) {
        if (module0521.NIL != module0373.f26109()) {
            module0373.f26244(module0373.f26109(), (SubLObject)module0521.NIL, (SubLObject)module0521.$ic13$);
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32628(final SubLObject var3) {
        final SubLObject var4 = module0363.f24530(var3);
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        SubLObject var16_89;
        SubLObject var17_90;
        SubLObject var18_91;
        SubLObject var19_92;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)module0521.NIL, var6 = module0032.f1742(var5, var4); module0521.NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (module0521.NIL != module0032.f1746(var6, var7)) {
                if (module0521.NIL != module0378.f26860(var7)) {
                    return (SubLObject)module0521.T;
                }
                if (module0521.NIL != module0375.f26587(var7)) {
                    return (SubLObject)module0521.T;
                }
                if (module0521.NIL != module0380.f26955(var7)) {
                    var8 = module0364.f24725(var7);
                    var16_89 = module0363.f24530(var8);
                    for (var17_90 = module0032.f1741(var16_89), var18_91 = (SubLObject)module0521.NIL, var18_91 = module0032.f1742(var17_90, var16_89); module0521.NIL == module0032.f1744(var17_90, var18_91); var18_91 = module0032.f1743(var18_91)) {
                        var19_92 = module0032.f1745(var17_90, var18_91);
                        if (module0521.NIL != module0032.f1746(var18_91, var19_92) && module0521.NIL != module0375.f26587(var19_92)) {
                            return (SubLObject)module0521.T;
                        }
                    }
                }
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32631(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)module0521.NIL;
        final SubLObject var96 = module0521.$g3855$.currentBinding(var94);
        final SubLObject var97 = module0521.$g3856$.currentBinding(var94);
        try {
            module0521.$g3855$.bind((SubLObject)module0521.T, var94);
            module0521.$g3856$.bind((SubLObject)module0521.$ic16$, var94);
            f32629(var93);
            var95 = module0521.$g3856$.getDynamicValue(var94);
        }
        finally {
            module0521.$g3856$.rebind(var97, var94);
            module0521.$g3855$.rebind(var96, var94);
        }
        return var95;
    }
    
    public static SubLObject f32629(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = var93;
        SubLObject var96 = (SubLObject)module0521.NIL;
        var96 = var95.first();
        while (module0521.NIL != var95) {
            SubLObject var97 = (SubLObject)module0521.$ic7$;
            SubLObject var98 = (SubLObject)module0521.ZERO_INTEGER;
            SubLObject var22_95 = module0232.f15306(var96);
            SubLObject var99 = (SubLObject)module0521.NIL;
            var99 = var22_95.first();
            while (module0521.NIL != var22_95) {
                SubLObject var101;
                final SubLObject var100 = var101 = var99;
                SubLObject var102 = (SubLObject)module0521.NIL;
                SubLObject var103 = (SubLObject)module0521.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)module0521.$ic8$);
                var102 = var101.first();
                var101 = var101.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)module0521.$ic8$);
                var103 = var101.first();
                var101 = var101.rest();
                if (module0521.NIL == var101) {
                    if (var97 == module0521.$ic9$) {
                        final SubLObject var104 = module0205.f13378(var103);
                        if (module0521.NIL == module0206.f13500(var104)) {
                            SubLObject var105 = (SubLObject)module0521.ZERO_INTEGER;
                            SubLObject var22_96;
                            final SubLObject var106 = var22_96 = module0205.f13207(var103, (SubLObject)module0521.$ic17$);
                            SubLObject var107 = (SubLObject)module0521.NIL;
                            var107 = var22_96.first();
                            while (module0521.NIL != var22_96) {
                                var105 = Numbers.add(var105, (SubLObject)module0521.ONE_INTEGER);
                                if (!var105.isZero() && module0521.NIL == module0206.f13500(var107) && module0521.NIL == module0304.f20285(var107, var105, var104, var102)) {
                                    if (module0521.NIL != module0521.$g3855$.getDynamicValue(var94)) {
                                        module0521.$g3856$.setDynamicValue(Sequences.cconcatenate(module0006.f203(var107), new SubLObject[] { module0521.$ic18$, module0006.f203(var105), module0521.$ic19$, module0006.f203(var104), module0521.$ic20$, module0006.f203(var102) }), var94);
                                    }
                                    return Values.values(var107, var103);
                                }
                                var22_96 = var22_96.rest();
                                var107 = var22_96.first();
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var100, (SubLObject)module0521.$ic8$);
                }
                var98 = Numbers.add(var98, (SubLObject)module0521.ONE_INTEGER);
                var22_95 = var22_95.rest();
                var99 = var22_95.first();
            }
            var97 = (SubLObject)module0521.$ic9$;
            var98 = (SubLObject)module0521.ZERO_INTEGER;
            SubLObject var22_97 = module0232.f15308(var96);
            var99 = (SubLObject)module0521.NIL;
            var99 = var22_97.first();
            while (module0521.NIL != var22_97) {
                SubLObject var109;
                final SubLObject var108 = var109 = var99;
                SubLObject var102 = (SubLObject)module0521.NIL;
                SubLObject var103 = (SubLObject)module0521.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0521.$ic8$);
                var102 = var109.first();
                var109 = var109.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0521.$ic8$);
                var103 = var109.first();
                var109 = var109.rest();
                if (module0521.NIL == var109) {
                    if (var97 == module0521.$ic9$) {
                        final SubLObject var104 = module0205.f13378(var103);
                        if (module0521.NIL == module0206.f13500(var104)) {
                            SubLObject var105 = (SubLObject)module0521.ZERO_INTEGER;
                            SubLObject var22_98;
                            final SubLObject var106 = var22_98 = module0205.f13207(var103, (SubLObject)module0521.$ic17$);
                            SubLObject var107 = (SubLObject)module0521.NIL;
                            var107 = var22_98.first();
                            while (module0521.NIL != var22_98) {
                                var105 = Numbers.add(var105, (SubLObject)module0521.ONE_INTEGER);
                                if (!var105.isZero() && module0521.NIL == module0206.f13500(var107) && module0521.NIL == module0304.f20285(var107, var105, var104, var102)) {
                                    if (module0521.NIL != module0521.$g3855$.getDynamicValue(var94)) {
                                        module0521.$g3856$.setDynamicValue(Sequences.cconcatenate(module0006.f203(var107), new SubLObject[] { module0521.$ic18$, module0006.f203(var105), module0521.$ic19$, module0006.f203(var104), module0521.$ic20$, module0006.f203(var102) }), var94);
                                    }
                                    return Values.values(var107, var103);
                                }
                                var22_98 = var22_98.rest();
                                var107 = var22_98.first();
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var108, (SubLObject)module0521.$ic8$);
                }
                var98 = Numbers.add(var98, (SubLObject)module0521.ONE_INTEGER);
                var22_97 = var22_97.rest();
                var99 = var22_97.first();
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        final SubLObject var110 = f32632(var93);
        final SubLObject var111 = module0035.f2399(var110, (SubLObject)module0521.$ic6$, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED);
        SubLObject var112 = (SubLObject)module0521.NIL;
        if (module0521.NIL == var112) {
            SubLObject var113 = var111;
            SubLObject var114 = (SubLObject)module0521.NIL;
            var114 = var113.first();
            while (module0521.NIL == var112 && module0521.NIL != var113) {
                final SubLObject var115 = f32633(var110, var114);
                if (module0521.NIL == Errors.$ignore_mustsP$.getDynamicValue(var94) && module0521.NIL == var115) {
                    Errors.error((SubLObject)module0521.$ic21$, var114);
                }
                if (module0521.NIL != f32634(var115)) {
                    if (module0521.NIL != module0521.$g3855$.getDynamicValue(var94)) {
                        module0521.$g3856$.setDynamicValue(Sequences.cconcatenate(module0006.f203(var114), new SubLObject[] { module0521.$ic22$, module0006.f203(var115) }), var94);
                    }
                    var112 = (SubLObject)module0521.T;
                }
                var113 = var113.rest();
                var114 = var113.first();
            }
        }
        return var112;
    }
    
    public static SubLObject f32632(final SubLObject var93) {
        if (module0521.NIL != module0362.f24458(var93)) {
            final SubLObject var94 = module0363.f24581(var93);
            return f32635(var94);
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32636(final SubLObject var113) {
        SubLObject var114 = (SubLObject)module0521.NIL;
        SubLObject var115 = (SubLObject)module0521.NIL;
        final SubLObject var116 = Time.get_internal_real_time();
        var114 = Sequences.remove_if((SubLObject)module0521.$ic24$, module0307.f20830(var113, (SubLObject)module0521.UNPROVIDED), (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED);
        var115 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var116), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var114;
    }
    
    public static SubLObject f32635(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = module0034.$g879$.getDynamicValue(var114);
        SubLObject var116 = (SubLObject)module0521.NIL;
        if (module0521.NIL == var115) {
            return f32636(var113);
        }
        var116 = module0034.f1857(var115, (SubLObject)module0521.$ic23$, (SubLObject)module0521.UNPROVIDED);
        if (module0521.NIL == var116) {
            var116 = module0034.f1807(module0034.f1842(var115), (SubLObject)module0521.$ic23$, (SubLObject)module0521.ONE_INTEGER, (SubLObject)module0521.$ic25$, (SubLObject)module0521.EQUAL, (SubLObject)module0521.UNPROVIDED);
            module0034.f1860(var115, (SubLObject)module0521.$ic23$, var116);
        }
        SubLObject var117 = module0034.f1814(var116, var113, (SubLObject)module0521.$ic11$);
        if (var117 == module0521.$ic11$) {
            var117 = Values.arg2(var114.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32636(var113)));
            module0034.f1816(var116, var113, var117, (SubLObject)module0521.UNPROVIDED);
        }
        return module0034.f1959(var117);
    }
    
    public static SubLObject f32633(final SubLObject var114, final SubLObject var111) {
        SubLObject var115 = (SubLObject)module0521.NIL;
        SubLObject var116 = var114;
        SubLObject var117 = (SubLObject)module0521.NIL;
        var117 = var116.first();
        while (module0521.NIL != var116) {
            if (var111.eql(var117.first())) {
                var115 = (SubLObject)ConsesLow.cons(var117, var115);
            }
            var116 = var116.rest();
            var117 = var116.first();
        }
        return Sequences.nreverse(var115);
    }
    
    public static SubLObject f32634(final SubLObject var121) {
        final SubLObject var122 = module0077.f5313(Symbols.symbol_function((SubLObject)module0521.EQL), (SubLObject)module0521.UNPROVIDED);
        SubLObject var123 = var121;
        SubLObject var124 = (SubLObject)module0521.NIL;
        var124 = var123.first();
        while (module0521.NIL != var123) {
            SubLObject var126;
            final SubLObject var125 = var126 = var124;
            SubLObject var127 = (SubLObject)module0521.NIL;
            SubLObject var128 = (SubLObject)module0521.NIL;
            SubLObject var129 = (SubLObject)module0521.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0521.$ic26$);
            var127 = var126.first();
            var126 = var126.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0521.$ic26$);
            var128 = var126.first();
            var126 = var126.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0521.$ic26$);
            var129 = var126.first();
            var126 = var126.rest();
            if (module0521.NIL == var126) {
                module0078.f5374(var129, var122);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var125, (SubLObject)module0521.$ic26$);
            }
            var123 = var123.rest();
            var124 = var123.first();
        }
        final SubLObject var130 = module0077.f5312(var122);
        return module0257.f16698(var130, var130, (SubLObject)module0521.NIL, (SubLObject)module0521.UNPROVIDED);
    }
    
    public static SubLObject f32637(final SubLObject var120) {
        final SubLObject var121 = conses_high.third(var120);
        if (var121.equal((SubLObject)module0521.$ic27$)) {
            return (SubLObject)module0521.T;
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32638(final SubLObject var85) {
        final SubLObject var86 = module0373.f26109();
        if (module0521.NIL != module0373.f26109()) {
            SubLObject var88;
            final SubLObject var87 = var88 = module0363.f24509(var86);
            SubLObject var89 = (SubLObject)module0521.NIL;
            var89 = var88.first();
            while (module0521.NIL != var88) {
                SubLObject var90 = (SubLObject)module0521.$ic7$;
                SubLObject var91 = (SubLObject)module0521.ZERO_INTEGER;
                SubLObject var22_127 = module0232.f15306(var89);
                SubLObject var92 = (SubLObject)module0521.NIL;
                var92 = var22_127.first();
                while (module0521.NIL != var22_127) {
                    SubLObject var94;
                    final SubLObject var93 = var94 = var92;
                    SubLObject var95 = (SubLObject)module0521.NIL;
                    SubLObject var96 = (SubLObject)module0521.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)module0521.$ic8$);
                    var95 = var94.first();
                    var94 = var94.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)module0521.$ic8$);
                    var96 = var94.first();
                    var94 = var94.rest();
                    if (module0521.NIL == var94) {
                        if (module0521.$ic30$.eql(module0205.f13333(var96))) {
                            final SubLObject var97 = module0205.f13387(var96, (SubLObject)module0521.UNPROVIDED);
                            SubLObject var22_128 = var87;
                            SubLObject var23_132 = (SubLObject)module0521.NIL;
                            var23_132 = var22_128.first();
                            while (module0521.NIL != var22_128) {
                                SubLObject var98 = (SubLObject)module0521.$ic7$;
                                SubLObject var25_134 = (SubLObject)module0521.ZERO_INTEGER;
                                SubLObject var22_129 = module0232.f15306(var23_132);
                                SubLObject var27_136 = (SubLObject)module0521.NIL;
                                var27_136 = var22_129.first();
                                while (module0521.NIL != var22_129) {
                                    SubLObject var139_140;
                                    final SubLObject var137_138 = var139_140 = var27_136;
                                    SubLObject var99 = (SubLObject)module0521.NIL;
                                    SubLObject var100 = (SubLObject)module0521.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var139_140, var137_138, (SubLObject)module0521.$ic31$);
                                    var99 = var139_140.first();
                                    var139_140 = var139_140.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var139_140, var137_138, (SubLObject)module0521.$ic31$);
                                    var100 = var139_140.first();
                                    var139_140 = var139_140.rest();
                                    if (module0521.NIL == var139_140) {
                                        if (var100.equal(var97)) {
                                            return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var137_138, (SubLObject)module0521.$ic31$);
                                    }
                                    var25_134 = Numbers.add(var25_134, (SubLObject)module0521.ONE_INTEGER);
                                    var22_129 = var22_129.rest();
                                    var27_136 = var22_129.first();
                                }
                                var98 = (SubLObject)module0521.$ic9$;
                                SubLObject var25_135 = (SubLObject)module0521.ZERO_INTEGER;
                                SubLObject var22_130 = module0232.f15308(var23_132);
                                SubLObject var27_137 = (SubLObject)module0521.NIL;
                                var27_137 = var22_130.first();
                                while (module0521.NIL != var22_130) {
                                    SubLObject var148_149;
                                    final SubLObject var146_147 = var148_149 = var27_137;
                                    SubLObject var99 = (SubLObject)module0521.NIL;
                                    SubLObject var100 = (SubLObject)module0521.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var148_149, var146_147, (SubLObject)module0521.$ic31$);
                                    var99 = var148_149.first();
                                    var148_149 = var148_149.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var148_149, var146_147, (SubLObject)module0521.$ic31$);
                                    var100 = var148_149.first();
                                    var148_149 = var148_149.rest();
                                    if (module0521.NIL == var148_149) {
                                        if (var100.equal(var97)) {
                                            return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var146_147, (SubLObject)module0521.$ic31$);
                                    }
                                    var25_135 = Numbers.add(var25_135, (SubLObject)module0521.ONE_INTEGER);
                                    var22_130 = var22_130.rest();
                                    var27_137 = var22_130.first();
                                }
                                var22_128 = var22_128.rest();
                                var23_132 = var22_128.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var93, (SubLObject)module0521.$ic8$);
                    }
                    var91 = Numbers.add(var91, (SubLObject)module0521.ONE_INTEGER);
                    var22_127 = var22_127.rest();
                    var92 = var22_127.first();
                }
                var90 = (SubLObject)module0521.$ic9$;
                var91 = (SubLObject)module0521.ZERO_INTEGER;
                SubLObject var22_131 = module0232.f15308(var89);
                var92 = (SubLObject)module0521.NIL;
                var92 = var22_131.first();
                while (module0521.NIL != var22_131) {
                    SubLObject var102;
                    final SubLObject var101 = var102 = var92;
                    SubLObject var95 = (SubLObject)module0521.NIL;
                    SubLObject var96 = (SubLObject)module0521.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)module0521.$ic8$);
                    var95 = var102.first();
                    var102 = var102.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)module0521.$ic8$);
                    var96 = var102.first();
                    var102 = var102.rest();
                    if (module0521.NIL == var102) {
                        if (module0521.$ic30$.eql(module0205.f13333(var96))) {
                            final SubLObject var97 = module0205.f13387(var96, (SubLObject)module0521.UNPROVIDED);
                            SubLObject var22_132 = var87;
                            SubLObject var23_133 = (SubLObject)module0521.NIL;
                            var23_133 = var22_132.first();
                            while (module0521.NIL != var22_132) {
                                SubLObject var98 = (SubLObject)module0521.$ic7$;
                                SubLObject var25_136 = (SubLObject)module0521.ZERO_INTEGER;
                                SubLObject var22_133 = module0232.f15306(var23_133);
                                SubLObject var27_138 = (SubLObject)module0521.NIL;
                                var27_138 = var22_133.first();
                                while (module0521.NIL != var22_133) {
                                    SubLObject var160_161;
                                    final SubLObject var158_159 = var160_161 = var27_138;
                                    SubLObject var99 = (SubLObject)module0521.NIL;
                                    SubLObject var100 = (SubLObject)module0521.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var160_161, var158_159, (SubLObject)module0521.$ic31$);
                                    var99 = var160_161.first();
                                    var160_161 = var160_161.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var160_161, var158_159, (SubLObject)module0521.$ic31$);
                                    var100 = var160_161.first();
                                    var160_161 = var160_161.rest();
                                    if (module0521.NIL == var160_161) {
                                        if (var100.equal(var97)) {
                                            return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var158_159, (SubLObject)module0521.$ic31$);
                                    }
                                    var25_136 = Numbers.add(var25_136, (SubLObject)module0521.ONE_INTEGER);
                                    var22_133 = var22_133.rest();
                                    var27_138 = var22_133.first();
                                }
                                var98 = (SubLObject)module0521.$ic9$;
                                SubLObject var25_137 = (SubLObject)module0521.ZERO_INTEGER;
                                SubLObject var22_134 = module0232.f15308(var23_133);
                                SubLObject var27_139 = (SubLObject)module0521.NIL;
                                var27_139 = var22_134.first();
                                while (module0521.NIL != var22_134) {
                                    SubLObject var167_168;
                                    final SubLObject var165_166 = var167_168 = var27_139;
                                    SubLObject var99 = (SubLObject)module0521.NIL;
                                    SubLObject var100 = (SubLObject)module0521.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var167_168, var165_166, (SubLObject)module0521.$ic31$);
                                    var99 = var167_168.first();
                                    var167_168 = var167_168.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var167_168, var165_166, (SubLObject)module0521.$ic31$);
                                    var100 = var167_168.first();
                                    var167_168 = var167_168.rest();
                                    if (module0521.NIL == var167_168) {
                                        if (var100.equal(var97)) {
                                            return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var165_166, (SubLObject)module0521.$ic31$);
                                    }
                                    var25_137 = Numbers.add(var25_137, (SubLObject)module0521.ONE_INTEGER);
                                    var22_134 = var22_134.rest();
                                    var27_139 = var22_134.first();
                                }
                                var22_132 = var22_132.rest();
                                var23_133 = var22_132.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var101, (SubLObject)module0521.$ic8$);
                    }
                    var91 = Numbers.add(var91, (SubLObject)module0521.ONE_INTEGER);
                    var22_131 = var22_131.rest();
                    var92 = var22_131.first();
                }
                var88 = var88.rest();
                var89 = var88.first();
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32639(final SubLObject var85) {
        if (module0521.NIL != module0373.f26109()) {
            module0373.f26244(module0373.f26109(), (SubLObject)module0521.NIL, (SubLObject)module0521.$ic13$);
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32640(final SubLObject var85) {
        final SubLObject var86 = module0373.f26109();
        if (module0521.NIL != module0373.f26109()) {
            final SubLObject var87 = module0363.f24530(var86);
            final SubLObject var88 = module0032.f1741(var87);
            SubLObject var89 = (SubLObject)module0521.NIL;
            var89 = module0032.f1742(var88, var87);
            while (module0521.NIL == module0032.f1744(var88, var89)) {
                final SubLObject var90 = module0032.f1745(var88, var89);
                if (module0521.NIL != module0032.f1746(var89, var90) && module0521.NIL != module0364.f24748(var90, (SubLObject)module0521.$ic5$)) {
                    final SubLObject var91 = module0378.f26872(var90);
                    final SubLObject var92 = module0378.f26873(var90);
                    if (module0521.NIL != f32641(var91, var92)) {
                        return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                    }
                    return (SubLObject)module0521.NIL;
                }
                else {
                    var89 = module0032.f1743(var89);
                }
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32641(final SubLObject var171, final SubLObject var170) {
        final SubLObject var172 = module0377.f26749(var170);
        if (module0521.NIL != module0222.f14635(module0521.$ic37$, var172, (SubLObject)module0521.THREE_INTEGER, (SubLObject)module0521.UNPROVIDED)) {
            final SubLObject var173 = module0220.f14598(var172, module0521.$ic37$, (SubLObject)module0521.THREE_INTEGER, (SubLObject)module0521.$ic38$, (SubLObject)module0521.UNPROVIDED);
            if (module0521.NIL != var173) {
                SubLObject var174 = var173;
                SubLObject var175 = (SubLObject)module0521.NIL;
                var175 = var174.first();
                while (module0521.NIL != var174) {
                    final SubLObject var176 = var175.first();
                    final SubLObject var177 = conses_high.second(var175);
                    final SubLObject var178 = module0377.f26747(var170);
                    final SubLObject var179 = module0377.f26834(var172);
                    final SubLObject var180 = module0381.f27142(var171);
                    final SubLObject var181 = module0381.f27143(var171);
                    final SubLObject var182 = module0233.f15376(var179, var178);
                    final SubLObject var183 = module0233.f15376(var182, var176);
                    final SubLObject var184 = module0233.f15362(var180, var183);
                    final SubLObject var185 = module0233.f15376(var181, var184);
                    final SubLObject var186 = module0381.f27051(var171);
                    final SubLObject var187 = module0363.f24509(var186);
                    SubLObject var188 = (SubLObject)module0521.NIL;
                    SubLObject var189 = (SubLObject)module0521.NIL;
                    SubLObject var22_189 = var187;
                    SubLObject var190 = (SubLObject)module0521.NIL;
                    var190 = var22_189.first();
                    while (module0521.NIL != var22_189) {
                        SubLObject var191 = (SubLObject)module0521.$ic7$;
                        SubLObject var192 = (SubLObject)module0521.ZERO_INTEGER;
                        SubLObject var22_190 = module0232.f15306(var190);
                        SubLObject var193 = (SubLObject)module0521.NIL;
                        var193 = var22_190.first();
                        while (module0521.NIL != var22_190) {
                            SubLObject var195;
                            final SubLObject var194 = var195 = var193;
                            SubLObject var196 = (SubLObject)module0521.NIL;
                            SubLObject var197 = (SubLObject)module0521.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)module0521.$ic8$);
                            var196 = var195.first();
                            var195 = var195.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)module0521.$ic8$);
                            var197 = var195.first();
                            var195 = var195.rest();
                            if (module0521.NIL == var195) {
                                final SubLObject var198 = module0205.f13333(var197);
                                final SubLObject var199 = module0205.f13387(var197, (SubLObject)module0521.UNPROVIDED);
                                final SubLObject var200 = module0205.f13388(var197, (SubLObject)module0521.UNPROVIDED);
                                if ((var198.eql(module0521.$ic39$) || var198.eql(module0521.$ic40$)) && var199.eql(var185) && module0521.NIL != module0210.f13565(var200)) {
                                    var188 = (SubLObject)module0521.T;
                                    if (module0521.NIL != module0256.f16596(var200, var177, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED)) {
                                        var189 = (SubLObject)module0521.T;
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var194, (SubLObject)module0521.$ic8$);
                            }
                            var192 = Numbers.add(var192, (SubLObject)module0521.ONE_INTEGER);
                            var22_190 = var22_190.rest();
                            var193 = var22_190.first();
                        }
                        var191 = (SubLObject)module0521.$ic9$;
                        var192 = (SubLObject)module0521.ZERO_INTEGER;
                        SubLObject var22_191 = module0232.f15308(var190);
                        var193 = (SubLObject)module0521.NIL;
                        var193 = var22_191.first();
                        while (module0521.NIL != var22_191) {
                            SubLObject var202;
                            final SubLObject var201 = var202 = var193;
                            SubLObject var196 = (SubLObject)module0521.NIL;
                            SubLObject var197 = (SubLObject)module0521.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0521.$ic8$);
                            var196 = var202.first();
                            var202 = var202.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0521.$ic8$);
                            var197 = var202.first();
                            var202 = var202.rest();
                            if (module0521.NIL == var202) {
                                final SubLObject var198 = module0205.f13333(var197);
                                final SubLObject var199 = module0205.f13387(var197, (SubLObject)module0521.UNPROVIDED);
                                final SubLObject var200 = module0205.f13388(var197, (SubLObject)module0521.UNPROVIDED);
                                if ((var198.eql(module0521.$ic39$) || var198.eql(module0521.$ic40$)) && var199.eql(var185) && module0521.NIL != module0210.f13565(var200)) {
                                    var188 = (SubLObject)module0521.T;
                                    if (module0521.NIL != module0256.f16596(var200, var177, (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED)) {
                                        var189 = (SubLObject)module0521.T;
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var201, (SubLObject)module0521.$ic8$);
                            }
                            var192 = Numbers.add(var192, (SubLObject)module0521.ONE_INTEGER);
                            var22_191 = var22_191.rest();
                            var193 = var22_191.first();
                        }
                        var22_189 = var22_189.rest();
                        var190 = var22_189.first();
                    }
                    if (module0521.NIL != var188) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(module0521.NIL == var189);
                    }
                    var174 = var174.rest();
                    var175 = var174.first();
                }
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32642(final SubLObject var85) {
        if (module0521.NIL != module0373.f26109()) {
            module0373.f26244(module0373.f26109(), (SubLObject)module0521.NIL, (SubLObject)module0521.$ic13$);
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32643(final SubLObject var85) {
        if (module0521.NIL != module0373.f26109()) {
            SubLObject var86 = module0232.f15308(var85);
            SubLObject var87 = (SubLObject)module0521.NIL;
            var87 = var86.first();
            while (module0521.NIL != var86) {
                SubLObject var89;
                final SubLObject var88 = var89 = var87;
                SubLObject var90 = (SubLObject)module0521.NIL;
                SubLObject var91 = (SubLObject)module0521.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0521.$ic8$);
                var90 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0521.$ic8$);
                var91 = var89.first();
                var89 = var89.rest();
                if (module0521.NIL == var89) {
                    if (module0521.NIL != module0202.f12871(var91)) {
                        final SubLObject var92 = module0205.f13387(var91, (SubLObject)module0521.UNPROVIDED);
                        if (module0521.NIL != module0035.f2428(var92, module0205.f13388(var91, (SubLObject)module0521.UNPROVIDED), (SubLObject)module0521.UNPROVIDED, (SubLObject)module0521.UNPROVIDED)) {
                            return (SubLObject)ConsesLow.list(module0204.f13100(var85));
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)module0521.$ic8$);
                }
                var86 = var86.rest();
                var87 = var86.first();
            }
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32644(final SubLObject var85) {
        if (module0521.NIL != module0373.f26109()) {
            module0373.f26244(module0373.f26109(), (SubLObject)module0521.NIL, (SubLObject)module0521.$ic13$);
        }
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32645() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32622", "S#29804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32623", "S#29807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32624", "S#36072", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32626", "S#36073", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32625", "S#36074", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32627", "S#36069", 1, 0, false);
        new $f32627$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32630", "S#36075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32628", "S#36076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32631", "S#36077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32629", "S#36078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32632", "S#36079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32636", "S#36080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32635", "S#36081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32633", "S#36082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32634", "S#36083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32637", "S#36070", 1, 0, false);
        new $f32637$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32638", "S#36071", 1, 0, false);
        new $f32638$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32639", "S#36084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32640", "S#36085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32641", "S#36086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32642", "S#36087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32643", "S#36088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0521", "f32644", "S#36089", 1, 0, false);
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32646() {
        module0521.$g3854$ = SubLFiles.deflexical("S#36090", (SubLObject)module0521.$ic0$);
        module0521.$g3855$ = SubLFiles.defparameter("S#36091", (SubLObject)module0521.NIL);
        module0521.$g3856$ = SubLFiles.defparameter("S#36092", (SubLObject)module0521.$ic15$);
        return (SubLObject)module0521.NIL;
    }
    
    public static SubLObject f32647() {
        module0340.f22962((SubLObject)module0521.$ic1$, (SubLObject)module0521.$ic2$);
        module0034.f1895((SubLObject)module0521.$ic4$);
        module0012.f419((SubLObject)module0521.$ic12$);
        module0012.f419((SubLObject)module0521.$ic14$);
        module0034.f1895((SubLObject)module0521.$ic23$);
        module0340.f22962((SubLObject)module0521.$ic28$, (SubLObject)module0521.$ic29$);
        module0012.f419((SubLObject)module0521.$ic32$);
        module0012.f419((SubLObject)module0521.$ic33$);
        module0340.f22962((SubLObject)module0521.$ic34$, (SubLObject)module0521.$ic35$);
        module0012.f419((SubLObject)module0521.$ic36$);
        module0012.f419((SubLObject)module0521.$ic41$);
        module0340.f22962((SubLObject)module0521.$ic42$, (SubLObject)module0521.$ic43$);
        module0012.f419((SubLObject)module0521.$ic44$);
        module0012.f419((SubLObject)module0521.$ic45$);
        return (SubLObject)module0521.NIL;
    }
    
    public void declareFunctions() {
        f32645();
    }
    
    public void initializeVariables() {
        f32646();
    }
    
    public void runTopLevelForms() {
        f32647();
    }
    
    static {
        me = (SubLFile)new module0521();
        module0521.$g3854$ = null;
        module0521.$g3855$ = null;
        module0521.$g3856$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRUNE-NON-WFF-CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT"));
        $ic1$ = SubLObjectFactory.makeKeyword("PRUNE-NON-WFF-CONJUNCTION");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), module0521.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#36069", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0521.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36075", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and <lit0> ... <litN>) \n    which has a dependent residual transformation link\n    and is non-wff"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and\n      (#$isa ?AGENT #$City)\n      (#$spouse ?AGENT ?SPOUSE))") });
        $ic3$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic4$ = SubLObjectFactory.makeSymbol("S#36074", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic6$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic7$ = SubLObjectFactory.makeKeyword("NEG");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic9$ = SubLObjectFactory.makeKeyword("POS");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36093", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36094", "CYC"));
        $ic11$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = SubLObjectFactory.makeSymbol("S#36069", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic14$ = SubLObjectFactory.makeSymbol("S#36075", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic16$ = SubLObjectFactory.makeString("unknown non-wff reason");
        $ic17$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic18$ = SubLObjectFactory.makeString(" is not a valid arg");
        $ic19$ = SubLObjectFactory.makeString(" for ");
        $ic20$ = SubLObjectFactory.makeString(" in ");
        $ic21$ = SubLObjectFactory.makeString("variable constraint tuple mismatch for ~a");
        $ic22$ = SubLObjectFactory.makeString(" is constrained to disjoint collections: ");
        $ic23$ = SubLObjectFactory.makeSymbol("S#36081", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#36070", "CYC");
        $ic25$ = SubLObjectFactory.makeInteger(128);
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19640", "CYC"));
        $ic27$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic28$ = SubLObjectFactory.makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), module0521.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#36071", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0521.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36084", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and <lit0> ... <litN> ... (#$unknownSentence <litN>) ...)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and\n      (#$children ?ANIMAL ?CHILD)\n      (#$unknownSentence (#$children ?ANIMAL ?CHILD)))") });
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34275", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34276", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#36071", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#36084", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION");
        $ic35$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), module0521.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#36085", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0521.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36087", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Apply to problems created via residual transformation where the rule has a #$applicableWhenTypedOnlyWhenSpecialization assertion on it.") });
        $ic36$ = SubLObjectFactory.makeSymbol("S#36085", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("applicableWhenTypedOnlyWhenSpecialization"));
        $ic38$ = ConsesLow.list((SubLObject)module0521.ONE_INTEGER, (SubLObject)module0521.TWO_INTEGER);
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#36087", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT");
        $ic43$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#36088", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0521.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36089", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Applies to syntactically circular termOfUnit literals, for instance (#$termOfUnit ?var0 (#$MotherFn ?var0))") });
        $ic44$ = SubLObjectFactory.makeSymbol("S#36088", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#36089", "CYC");
    }
    
    public static final class $f32627$UnaryFunction extends UnaryFunction
    {
        public $f32627$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36069"));
        }
        
        public SubLObject processItem(final SubLObject var87) {
            return module0521.f32627(var87);
        }
    }
    
    public static final class $f32637$UnaryFunction extends UnaryFunction
    {
        public $f32637$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36070"));
        }
        
        public SubLObject processItem(final SubLObject var87) {
            return module0521.f32637(var87);
        }
    }
    
    public static final class $f32638$UnaryFunction extends UnaryFunction
    {
        public $f32638$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36071"));
        }
        
        public SubLObject processItem(final SubLObject var87) {
            return module0521.f32638(var87);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0521.class
	Total time: 466 ms
	
	Decompiled with Procyon 0.5.32.
*/