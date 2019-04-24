package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0757 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0757";
    public static final String myFingerPrint = "6aebe2b547b594b6b86bba28d35fbfe04a8652b2bb4ab11c26b9833d843b63dc";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    
    public static SubLObject f47853(final SubLObject var1) {
        if (module0757.NIL != module0581.f35648(var1)) {
            return (SubLObject)module0757.T;
        }
        if (module0757.NIL != module0035.f2013(var1)) {
            return Types.sublisp_null(module0035.find_if_not((SubLObject)module0757.$ic0$, var1, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED));
        }
        if (module0757.NIL != module0077.f5302(var1)) {
            return Types.sublisp_null(module0078.f5364((SubLObject)module0757.$ic0$, var1, (SubLObject)module0757.UNPROVIDED));
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47854(final SubLObject var2, SubLObject var3) {
        if (var3 == module0757.UNPROVIDED) {
            var3 = module0048.f3326();
        }
        return f47855(var2, var3, (SubLObject)module0757.ZERO_INTEGER);
    }
    
    public static SubLObject f47855(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var3.isNumber() && var4.numGE(var3)) {
            return (SubLObject)module0757.NIL;
        }
        SubLObject var5 = (SubLObject)module0757.NIL;
        SubLObject var6 = (SubLObject)module0757.NIL;
        if (module0757.NIL != module0581.f35648(var2)) {
            var5 = (SubLObject)ConsesLow.cons(var2, var5);
            var4 = Numbers.add(var4, (SubLObject)module0757.ONE_INTEGER);
        }
        else if (module0757.NIL != module0035.f2013(var2)) {
            SubLObject var7 = (SubLObject)module0757.NIL;
            SubLObject var8 = var2;
            SubLObject var9 = (SubLObject)module0757.NIL;
            var9 = var8.first();
            while (module0757.NIL != var8) {
                var7 = (SubLObject)ConsesLow.cons(f47855(var9, var3, var4), var7);
                var8 = var8.rest();
                var9 = var8.first();
            }
            if (module0757.NIL == var6) {
                SubLObject var10 = Mapping.mapcar((SubLObject)module0757.$ic1$, module0035.f2489(Sequences.nreverse(var7), (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED));
                SubLObject var11 = (SubLObject)module0757.NIL;
                var11 = var10.first();
                while (module0757.NIL == var6 && module0757.NIL != var10) {
                    var5 = (SubLObject)ConsesLow.cons(var11, var5);
                    var4 = Numbers.add(var4, (SubLObject)module0757.ONE_INTEGER);
                    var6 = (SubLObject)SubLObjectFactory.makeBoolean(var3.isNumber() && var4.numGE(var3));
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
        }
        else if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var12 = module0077.f5333(var2);
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            for (var13 = module0032.f1741(var12), var14 = (SubLObject)module0757.NIL, var14 = module0032.f1742(var13, var12); module0757.NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                var15 = module0032.f1745(var13, var14);
                if (module0757.NIL != module0032.f1746(var14, var15) && module0757.NIL == var6) {
                    var16 = f47855(var15, var3, var4);
                    var17 = (SubLObject)module0757.NIL;
                    var17 = var16.first();
                    while (module0757.NIL == var6 && module0757.NIL != var16) {
                        if (module0757.NIL == conses_high.member(var17, var5, Symbols.symbol_function((SubLObject)module0757.EQUAL), (SubLObject)module0757.UNPROVIDED)) {
                            var5 = (SubLObject)ConsesLow.cons(var17, var5);
                            var4 = Numbers.add(var4, (SubLObject)module0757.ONE_INTEGER);
                            var6 = (SubLObject)SubLObjectFactory.makeBoolean(var3.isNumber() && var4.numGE(var3));
                        }
                        var16 = var16.rest();
                        var17 = var16.first();
                    }
                }
            }
        }
        return Values.values(var5, var4);
    }
    
    public static SubLObject f47856(final SubLObject var2) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return (SubLObject)module0757.ONE_INTEGER;
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)module0757.ONE_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)module0757.NIL;
            var5 = var4.first();
            while (module0757.NIL != var4) {
                var3 = Numbers.multiply(var3, f47856(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)module0757.ZERO_INTEGER;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)module0757.NIL, var8 = module0032.f1742(var7, var6); module0757.NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (module0757.NIL != module0032.f1746(var8, var9)) {
                    var3 = Numbers.add(var3, f47856(var9));
                }
            }
            return var3;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47857(final SubLObject var2) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0048.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, var2, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED));
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)module0757.ZERO_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)module0757.NIL;
            var5 = var4.first();
            while (module0757.NIL != var4) {
                var3 = Numbers.add(var3, f47857(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)module0757.ZERO_INTEGER;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)module0757.NIL, var8 = module0032.f1742(var7, var6); module0757.NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (module0757.NIL != module0032.f1746(var8, var9)) {
                    var10 = f47856(var9);
                    if (var10.numG(var3)) {
                        var3 = var10;
                    }
                }
            }
            return var3;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47858(final SubLObject var2) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0048.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, var2, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED));
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)module0757.ZERO_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)module0757.NIL;
            var5 = var4.first();
            while (module0757.NIL != var4) {
                var3 = Numbers.add(var3, f47858(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)module0757.NIL;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)module0757.NIL, var8 = module0032.f1742(var7, var6); module0757.NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (module0757.NIL != module0032.f1746(var8, var9)) {
                    var10 = f47856(var9);
                    if (module0757.NIL == var3 || var10.numL(var3)) {
                        var3 = var10;
                    }
                }
            }
            return var3;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47859(final SubLObject var2, final SubLObject var17, SubLObject var18) {
        if (var18 == module0757.UNPROVIDED) {
            var18 = (SubLObject)module0757.NIL;
        }
        final SubLObject var19 = module0038.f2738(var17, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED);
        final SubLObject var20 = Sequences.length(var19);
        SubLObject var21 = (SubLObject)module0757.NIL;
        SubLObject var22;
        SubLObject var23;
        SubLObject var22_24;
        SubLObject var24;
        for (var22 = var20, var23 = (SubLObject)module0757.NIL, var23 = (SubLObject)module0757.ZERO_INTEGER; !var23.numGE(var22); var23 = module0048.f_1X(var23)) {
            for (var22_24 = module0048.f_1X(var20), var24 = (SubLObject)module0757.NIL, var24 = (SubLObject)module0757.ONE_INTEGER; !var24.numGE(var22_24); var24 = module0048.f_1X(var24)) {
                if (var24.numG(var23) && module0757.NIL != f47860(var2, var19, var23, var24, (SubLObject)module0757.NIL, var18)) {
                    var21 = (SubLObject)ConsesLow.cons(module0783.f50353(var23, var24), var21);
                }
            }
        }
        SubLObject var25 = Sort.sort(var21, Symbols.symbol_function((SubLObject)module0757.$ic2$), (SubLObject)module0757.$ic3$);
        SubLObject var26 = (SubLObject)module0757.NIL;
        SubLObject var27 = (SubLObject)module0757.NIL;
        while (module0757.NIL != var25) {
            final SubLObject var28 = var25.first();
            var25 = var25.rest();
            if (module0757.NIL == Sequences.find(var28, var26, (SubLObject)module0757.$ic4$, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED)) {
                var26 = (SubLObject)ConsesLow.cons(var28, var26);
            }
        }
        SubLObject var29 = Sort.sort(var26, (SubLObject)module0757.$ic5$, (SubLObject)module0757.UNPROVIDED);
        SubLObject var30 = (SubLObject)module0757.NIL;
        var30 = var29.first();
        while (module0757.NIL != var29) {
            var27 = (SubLObject)ConsesLow.cons(module0038.f2761(Sequences.subseq(var19, module0783.f50354(var30), module0783.f50355(var30)), (SubLObject)module0757.UNPROVIDED), var27);
            var29 = var29.rest();
            var30 = var29.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f47861(final SubLObject var17, SubLObject var31) {
        if (var31 == module0757.UNPROVIDED) {
            var31 = Equality.eq((SubLObject)module0757.$ic6$, module0579.$g4259$.getDynamicValue());
        }
        return f47862(var17, var31, (SubLObject)module0757.T);
    }
    
    public static SubLObject f47863(final SubLObject var2, final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0757.NIL != f47864(var2, var32) && module0757.NIL != f47865(var2, var32));
    }
    
    public static SubLObject f47864(final SubLObject var2, final SubLObject var32) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0758.f47970(var2, var32);
        }
        if (var2.isList()) {
            return f47864(var2.first(), var32);
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5333(var2);
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            for (var34 = module0032.f1741(var33), var35 = (SubLObject)module0757.NIL, var35 = module0032.f1742(var34, var33); module0757.NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                var36 = module0032.f1745(var34, var35);
                if (module0757.NIL != module0032.f1746(var35, var36) && module0757.NIL == f47864(var36, var32)) {
                    return (SubLObject)module0757.NIL;
                }
            }
            return (SubLObject)module0757.T;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47865(final SubLObject var2, final SubLObject var32) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0758.f47971(var2, var32);
        }
        if (var2.isList()) {
            return f47865(var2.first(), var32);
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5333(var2);
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            for (var34 = module0032.f1741(var33), var35 = (SubLObject)module0757.NIL, var35 = module0032.f1742(var34, var33); module0757.NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                var36 = module0032.f1745(var34, var35);
                if (module0757.NIL != module0032.f1746(var35, var36) && module0757.NIL == f47865(var36, var32)) {
                    return (SubLObject)module0757.NIL;
                }
            }
            return (SubLObject)module0757.T;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47866(final SubLObject var2, final SubLObject var32) {
        return f47867(f47868(var2, var32), var32);
    }
    
    public static SubLObject f47867(final SubLObject var2, final SubLObject var32) {
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0758.f47962(var2, var32);
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            return (SubLObject)ConsesLow.cons(f47867(var2.first(), var32), var2.rest());
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5313(Symbols.symbol_function((SubLObject)module0757.EQUAL), (SubLObject)module0757.UNPROVIDED);
            final SubLObject var34 = module0077.f5333(var2);
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0757.NIL, var36 = module0032.f1742(var35, var34); module0757.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                var37 = module0032.f1745(var35, var36);
                if (module0757.NIL != module0032.f1746(var36, var37)) {
                    module0077.f5326(f47867(var37, var32), var33);
                }
            }
            return var33;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47868(final SubLObject var2, final SubLObject var32) {
        if (var32.eql((SubLObject)module0757.$ic7$)) {
            return var2;
        }
        if (module0757.NIL != module0581.f35648(var2)) {
            return module0758.f47963(var2, var32);
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            return module0035.f2152(var2, f47868(module0035.f2114(var2), var32));
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5313(Symbols.symbol_function((SubLObject)module0757.EQUAL), (SubLObject)module0757.UNPROVIDED);
            final SubLObject var34 = module0077.f5333(var2);
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0757.NIL, var36 = module0032.f1742(var35, var34); module0757.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                var37 = module0032.f1745(var35, var36);
                if (module0757.NIL != module0032.f1746(var36, var37)) {
                    module0077.f5326(f47868(var37, var32), var33);
                }
            }
            return var33;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47860(final SubLObject var2, final SubLObject var19, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var18) {
        if (var34 == module0757.UNPROVIDED) {
            var34 = (SubLObject)module0757.ZERO_INTEGER;
        }
        if (var35 == module0757.UNPROVIDED) {
            var35 = (SubLObject)module0757.NIL;
        }
        if (var36 == module0757.UNPROVIDED) {
            var36 = (SubLObject)module0757.NIL;
        }
        if (var18 == module0757.UNPROVIDED) {
            var18 = (SubLObject)module0757.NIL;
        }
        if (module0757.NIL == var35) {
            var35 = Sequences.length(var19);
        }
        if (module0757.NIL != module0581.f35648(var2)) {
            return f47869(var2, var19, var34, var35, var36, var18);
        }
        if (module0757.NIL != module0035.f2013(var2)) {
            return f47870(var2, var19, var34, var35, var36, var18);
        }
        if (module0757.NIL != module0077.f5302(var2)) {
            final SubLObject var37 = module0077.f5333(var2);
            SubLObject var38;
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            for (var38 = module0032.f1741(var37), var39 = (SubLObject)module0757.NIL, var39 = module0032.f1742(var38, var37); module0757.NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                var40 = module0032.f1745(var38, var39);
                if (module0757.NIL != module0032.f1746(var39, var40)) {
                    var41 = f47860(var40, var19, var34, var35, var36, var18);
                    if (module0757.NIL != var41) {
                        return var41;
                    }
                }
            }
            return (SubLObject)module0757.NIL;
        }
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47869(final SubLObject var2, final SubLObject var19, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var18) {
        if (var18 == module0757.UNPROVIDED) {
            var18 = (SubLObject)module0757.NIL;
        }
        final SubLObject var37 = module0581.f35666(var2, (SubLObject)module0757.UNPROVIDED);
        if (var37.equal(Sequences.subseq(var19, var34, var35))) {
            return (SubLObject)module0757.$ic8$;
        }
        final SubLObject var38 = (module0757.NIL != var18) ? Symbols.symbol_function((SubLObject)module0757.EQUAL) : Symbols.symbol_function((SubLObject)module0757.EQUALP);
        final SubLObject var39 = Sequences.search(var19, var37, var38, Symbols.symbol_function((SubLObject)module0757.IDENTITY), var34, var35, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED);
        final SubLObject var40 = Equality.eql((SubLObject)module0757.ZERO_INTEGER, var39);
        final SubLObject var41 = Equality.eql(var39, Numbers.subtract(Sequences.length(var37), Numbers.subtract(var35, var34)));
        return (SubLObject)((module0757.NIL == var39) ? module0757.NIL : ((module0757.NIL != var40 && module0757.NIL != var41) ? module0757.$ic8$ : ((module0757.NIL != var40) ? module0757.$ic9$ : ((module0757.NIL != var36) ? module0757.NIL : ((module0757.NIL != var41) ? module0757.$ic10$ : module0757.$ic11$)))));
    }
    
    public static SubLObject f47870(final SubLObject var2, final SubLObject var19, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var18) {
        if (var18 == module0757.UNPROVIDED) {
            var18 = (SubLObject)module0757.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0757.NIL != module0035.f1997(var2)) {
            return f47860(module0035.f2113(var2), var19, var34, var35, var36, var18);
        }
        SubLObject var38 = module0048.f_1X(var34);
        SubLObject var39 = (SubLObject)module0757.NIL;
        SubLObject var40 = (SubLObject)module0757.NIL;
        SubLObject var41 = (SubLObject)module0757.NIL;
        SubLObject var42 = (SubLObject)module0757.NIL;
        var40 = var2;
        var41 = var40.first();
        for (var42 = (SubLObject)module0757.ZERO_INTEGER; module0757.NIL != var40; var40 = var40.rest(), var41 = var40.first(), var42 = Numbers.add((SubLObject)module0757.ONE_INTEGER, var42)) {
            if (module0757.NIL == var36 || !var42.numG((SubLObject)module0757.ZERO_INTEGER)) {
                var37.resetMultipleValues();
                final SubLObject var43 = f47871(var41, var19, var34, var38, var36, var18);
                final SubLObject var44 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                if (module0757.NIL != var43) {
                    var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((module0757.NIL != var44) ? module0048.f_1X(var34) : var34, var42, var44, Equality.eql(var42, (SubLObject)module0757.ZERO_INTEGER)), var39);
                }
            }
        }
        while (module0757.NIL != var39 && var38.numL(var35)) {
            var38 = Numbers.add(var38, (SubLObject)module0757.ONE_INTEGER);
            SubLObject var45 = (SubLObject)module0757.NIL;
            SubLObject var46 = var39;
            SubLObject var47 = (SubLObject)module0757.NIL;
            var47 = var46.first();
            while (module0757.NIL != var46) {
                SubLObject var49;
                final SubLObject var48 = var49 = var47;
                SubLObject var50 = (SubLObject)module0757.NIL;
                SubLObject var51 = (SubLObject)module0757.NIL;
                SubLObject var52 = (SubLObject)module0757.NIL;
                SubLObject var53 = (SubLObject)module0757.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0757.$ic20$);
                var50 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0757.$ic20$);
                var51 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0757.$ic20$);
                var52 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0757.$ic20$);
                var53 = var49.first();
                var49 = var49.rest();
                if (module0757.NIL == var49) {
                    final SubLObject var54 = (module0757.NIL != var52) ? module0048.f_1X(var51) : var51;
                    final SubLObject var55 = ConsesLow.nth(var54, var2);
                    final SubLObject var36_56 = var52;
                    if (module0757.NIL != var55) {
                        var37.resetMultipleValues();
                        final SubLObject var56 = f47871(var55, var19, var50, var38, var36_56, var18);
                        final SubLObject var48_57 = var37.secondMultipleValue();
                        var37.resetMultipleValues();
                        if (module0757.NIL != var56) {
                            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((module0757.NIL != var48_57) ? var38 : var50, var54, var48_57, var53), var45);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0757.$ic20$);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
            var39 = var45;
        }
        if (module0757.NIL != module0035.f2012(var39)) {
            return (SubLObject)module0757.NIL;
        }
        SubLObject var58;
        final SubLObject var57 = var58 = var39.first();
        SubLObject var59 = (SubLObject)module0757.NIL;
        SubLObject var60 = (SubLObject)module0757.NIL;
        SubLObject var44 = (SubLObject)module0757.NIL;
        SubLObject var61 = (SubLObject)module0757.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0757.$ic21$);
        var59 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0757.$ic21$);
        var60 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0757.$ic21$);
        var44 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0757.$ic21$);
        var61 = var58.first();
        var58 = var58.rest();
        if (module0757.NIL != var58) {
            cdestructuring_bind.cdestructuring_bind_error(var57, (SubLObject)module0757.$ic21$);
            return (SubLObject)module0757.NIL;
        }
        final SubLObject var62 = (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(var2).eql(module0048.f_1X(var60)) && module0757.NIL != var44);
        if (module0757.NIL != var61 && module0757.NIL != var62) {
            return (SubLObject)module0757.$ic8$;
        }
        if (module0757.NIL != var61) {
            return (SubLObject)module0757.$ic9$;
        }
        if (module0757.NIL != var62) {
            return (SubLObject)module0757.$ic10$;
        }
        return (SubLObject)module0757.$ic11$;
    }
    
    public static SubLObject f47871(final SubLObject var9, final SubLObject var19, final SubLObject var34, final SubLObject var44, final SubLObject var36, SubLObject var18) {
        if (var18 == module0757.UNPROVIDED) {
            var18 = (SubLObject)module0757.NIL;
        }
        SubLObject var45 = (SubLObject)module0757.NIL;
        SubLObject var46 = (SubLObject)module0757.NIL;
        final SubLObject var47 = f47860(var9, var19, var34, var44, var36, var18);
        if (var47.eql((SubLObject)module0757.$ic8$)) {
            var45 = (SubLObject)module0757.T;
            var46 = (SubLObject)module0757.T;
        }
        else if (var47.eql((SubLObject)module0757.$ic10$)) {
            if (module0757.NIL == var36) {
                var45 = (SubLObject)module0757.T;
                var46 = (SubLObject)module0757.T;
            }
        }
        else if (var47.eql((SubLObject)module0757.$ic11$)) {
            if (module0757.NIL == var36) {
                var45 = (SubLObject)module0757.T;
            }
        }
        else if (var47.eql((SubLObject)module0757.$ic9$)) {
            var45 = (SubLObject)module0757.T;
        }
        return Values.values(var45, var46);
    }
    
    public static SubLObject f47862(final SubLObject var17, final SubLObject var31, final SubLObject var62) {
        final SubLObject var63 = f47872(var17, var31, var62);
        return (module0757.NIL != module0035.f1997(var63)) ? module0035.f2113(var63) : module0078.f5367(var63, (SubLObject)module0757.UNPROVIDED, (SubLObject)module0757.UNPROVIDED);
    }
    
    public static SubLObject f47872(final SubLObject var17, final SubLObject var31, final SubLObject var62) {
        SubLObject var63 = (SubLObject)module0757.NIL;
        if (module0757.NIL != module0756.f47479(var17) && module0757.NIL == module0579.f35496(module0756.f47627(var17), (SubLObject)module0757.UNPROVIDED)) {
            final SubLObject var64 = module0756.f47480(var17, var31);
            if (module0757.NIL == conses_high.member(var64, var63, Symbols.symbol_function((SubLObject)module0757.EQUALP), Symbols.symbol_function((SubLObject)module0757.IDENTITY))) {
                var63 = (SubLObject)ConsesLow.cons(var64, var63);
            }
            SubLObject var65 = module0756.f47672(var17);
            SubLObject var66 = (SubLObject)module0757.NIL;
            var66 = var65.first();
            while (module0757.NIL != var65) {
                SubLObject var8_67 = f47872(var66, var31, (SubLObject)module0757.NIL);
                SubLObject var67 = (SubLObject)module0757.NIL;
                var67 = var8_67.first();
                while (module0757.NIL != var8_67) {
                    final SubLObject var68 = var67;
                    if (module0757.NIL == conses_high.member(var68, var63, Symbols.symbol_function((SubLObject)module0757.EQUALP), Symbols.symbol_function((SubLObject)module0757.IDENTITY))) {
                        var63 = (SubLObject)ConsesLow.cons(var68, var63);
                    }
                    var8_67 = var8_67.rest();
                    var67 = var8_67.first();
                }
                var65 = var65.rest();
                var66 = var65.first();
            }
            if (module0757.NIL != module0756.f47478(var17)) {
                SubLObject var69 = (SubLObject)module0757.NIL;
                SubLObject var70 = (SubLObject)module0757.ZERO_INTEGER;
                if (module0743.f45996(var17).isVector()) {
                    final SubLObject var71 = module0743.f45996(var17);
                    final SubLObject var72 = (SubLObject)module0757.NIL;
                    SubLObject var73;
                    SubLObject var74;
                    SubLObject var75;
                    SubLObject var76;
                    for (var73 = Sequences.length(var71), var74 = (SubLObject)module0757.NIL, var74 = (SubLObject)module0757.ZERO_INTEGER; var74.numL(var73); var74 = Numbers.add(var74, (SubLObject)module0757.ONE_INTEGER)) {
                        var75 = ((module0757.NIL != var72) ? Numbers.subtract(var73, var74, (SubLObject)module0757.ONE_INTEGER) : var74);
                        var76 = Vectors.aref(var71, var75);
                        if (module0757.NIL != module0756.f47546(var76)) {
                            if (module0757.NIL != module0578.f35470((SubLObject)module0757.ONE_INTEGER) && module0757.NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)module0757.$ic24$, var76);
                            }
                            var69 = (SubLObject)ConsesLow.cons(module0756.f47480(var76, var31), var69);
                        }
                        else {
                            var69 = (SubLObject)ConsesLow.cons(f47862(var76, var31, (SubLObject)module0757.NIL), var69);
                        }
                        var70 = Numbers.add(var70, (SubLObject)module0757.ONE_INTEGER);
                    }
                }
                var63 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var69), var63);
            }
        }
        return var63;
    }
    
    public static SubLObject f47873() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47853", "S#52316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47854", "S#52317", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47855", "S#52318", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47856", "S#52319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47857", "S#52320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47858", "S#52321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47859", "S#52322", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47861", "S#52323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47863", "S#52324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47864", "S#52325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47865", "S#52326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47866", "S#52327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47867", "S#52328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47868", "S#52329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47860", "S#52330", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47869", "S#52331", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47870", "S#52332", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47871", "S#52333", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47862", "S#52334", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0757", "f47872", "S#52335", 3, 0, false);
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47874() {
        return (SubLObject)module0757.NIL;
    }
    
    public static SubLObject f47875() {
        module0027.f1449((SubLObject)module0757.$ic12$, (SubLObject)ConsesLow.list(new SubLObject[] { module0757.$ic13$, module0757.NIL, module0757.$ic14$, module0757.NIL, module0757.$ic15$, module0757.NIL, module0757.$ic16$, module0757.$ic17$, module0757.$ic18$, module0757.T }), (SubLObject)module0757.$ic19$);
        module0027.f1449((SubLObject)module0757.$ic22$, (SubLObject)ConsesLow.list(new SubLObject[] { module0757.$ic13$, module0757.NIL, module0757.$ic14$, module0757.NIL, module0757.$ic15$, module0757.NIL, module0757.$ic16$, module0757.$ic17$, module0757.$ic18$, module0757.T }), (SubLObject)module0757.$ic23$);
        return (SubLObject)module0757.NIL;
    }
    
    public void declareFunctions() {
        f47873();
    }
    
    public void initializeVariables() {
        f47874();
    }
    
    public void runTopLevelForms() {
        f47875();
    }
    
    static {
        me = (SubLFile)new module0757();
        $ic0$ = SubLObjectFactory.makeSymbol("S#52316", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#39348", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol(">");
        $ic3$ = SubLObjectFactory.makeSymbol("S#52336", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#52337", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#52338", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("HTML");
        $ic7$ = SubLObjectFactory.makeKeyword("NONE");
        $ic8$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic9$ = SubLObjectFactory.makeKeyword("INITIAL");
        $ic10$ = SubLObjectFactory.makeKeyword("FINAL");
        $ic11$ = SubLObjectFactory.makeKeyword("MEDIAL");
        $ic12$ = SubLObjectFactory.makeSymbol("S#52331", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("TEST");
        $ic14$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic15$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic16$ = SubLObjectFactory.makeKeyword("KB");
        $ic17$ = SubLObjectFactory.makeKeyword("TINY");
        $ic18$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic19$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.SIX_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.THREE_INTEGER, (SubLObject)module0757.T), (SubLObject)module0757.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.THREE_INTEGER, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T, (SubLObject)module0757.T), (SubLObject)module0757.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("dog")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)module0757.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.ONE_INTEGER, (SubLObject)module0757.T, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.ONE_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")) });
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52339", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52340", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52341", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52342", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52343", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52340", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52341", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52342", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#52332", "CYC");
        $ic23$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.SIX_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.SIX_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.THREE_INTEGER, (SubLObject)module0757.T), (SubLObject)module0757.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.THREE_INTEGER, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.NIL), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the pretty cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)module0757.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("dog")), (SubLObject)module0757.ZERO_INTEGER, (SubLObject)module0757.TWO_INTEGER, (SubLObject)module0757.T), (SubLObject)module0757.NIL) });
        $ic24$ = SubLObjectFactory.makeString("Ignoring possible variants for meta phrase~% ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0757.class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/