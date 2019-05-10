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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (NIL != module0581.f35648(var1)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f2013(var1)) {
            return Types.sublisp_null(module0035.find_if_not((SubLObject)$ic0$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0077.f5302(var1)) {
            return Types.sublisp_null(module0078.f5364((SubLObject)$ic0$, var1, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47854(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0048.f3326();
        }
        return f47855(var2, var3, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f47855(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var3.isNumber() && var4.numGE(var3)) {
            return (SubLObject)NIL;
        }
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != module0581.f35648(var2)) {
            var5 = (SubLObject)ConsesLow.cons(var2, var5);
            var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
        }
        else if (NIL != module0035.f2013(var2)) {
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = var2;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                var7 = (SubLObject)ConsesLow.cons(f47855(var9, var3, var4), var7);
                var8 = var8.rest();
                var9 = var8.first();
            }
            if (NIL == var6) {
                SubLObject var10 = Mapping.mapcar((SubLObject)$ic1$, module0035.f2489(Sequences.nreverse(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL == var6 && NIL != var10) {
                    var5 = (SubLObject)ConsesLow.cons(var11, var5);
                    var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
                    var6 = (SubLObject)makeBoolean(var3.isNumber() && var4.numGE(var3));
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
        }
        else if (NIL != module0077.f5302(var2)) {
            final SubLObject var12 = module0077.f5333(var2);
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            for (var13 = module0032.f1741(var12), var14 = (SubLObject)NIL, var14 = module0032.f1742(var13, var12); NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                var15 = module0032.f1745(var13, var14);
                if (NIL != module0032.f1746(var14, var15) && NIL == var6) {
                    var16 = f47855(var15, var3, var4);
                    var17 = (SubLObject)NIL;
                    var17 = var16.first();
                    while (NIL == var6 && NIL != var16) {
                        if (NIL == conses_high.member(var17, var5, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                            var5 = (SubLObject)ConsesLow.cons(var17, var5);
                            var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
                            var6 = (SubLObject)makeBoolean(var3.isNumber() && var4.numGE(var3));
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
        if (NIL != module0581.f35648(var2)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)ONE_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                var3 = Numbers.multiply(var3, f47856(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (NIL != module0032.f1746(var8, var9)) {
                    var3 = Numbers.add(var3, f47856(var9));
                }
            }
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47857(final SubLObject var2) {
        if (NIL != module0581.f35648(var2)) {
            return module0048.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                var3 = Numbers.add(var3, f47857(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (NIL != module0032.f1746(var8, var9)) {
                    var10 = f47856(var9);
                    if (var10.numG(var3)) {
                        var3 = var10;
                    }
                }
            }
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47858(final SubLObject var2) {
        if (NIL != module0581.f35648(var2)) {
            return module0048.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0035.f2013(var2)) {
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                var3 = Numbers.add(var3, f47858(var5));
                var4 = var4.rest();
                var5 = var4.first();
            }
            return var3;
        }
        if (NIL != module0077.f5302(var2)) {
            SubLObject var3 = (SubLObject)NIL;
            final SubLObject var6 = module0077.f5333(var2);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (NIL != module0032.f1746(var8, var9)) {
                    var10 = f47856(var9);
                    if (NIL == var3 || var10.numL(var3)) {
                        var3 = var10;
                    }
                }
            }
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47859(final SubLObject var2, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0038.f2738(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var20 = Sequences.length(var19);
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22;
        SubLObject var23;
        SubLObject var22_24;
        SubLObject var24;
        for (var22 = var20, var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; !var23.numGE(var22); var23 = module0048.f_1X(var23)) {
            for (var22_24 = module0048.f_1X(var20), var24 = (SubLObject)NIL, var24 = (SubLObject)ONE_INTEGER; !var24.numGE(var22_24); var24 = module0048.f_1X(var24)) {
                if (var24.numG(var23) && NIL != f47860(var2, var19, var23, var24, (SubLObject)NIL, var18)) {
                    var21 = (SubLObject)ConsesLow.cons(module0783.f50353(var23, var24), var21);
                }
            }
        }
        SubLObject var25 = Sort.sort(var21, Symbols.symbol_function((SubLObject)$ic2$), (SubLObject)$ic3$);
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        while (NIL != var25) {
            final SubLObject var28 = var25.first();
            var25 = var25.rest();
            if (NIL == Sequences.find(var28, var26, (SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var26 = (SubLObject)ConsesLow.cons(var28, var26);
            }
        }
        SubLObject var29 = Sort.sort(var26, (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            var27 = (SubLObject)ConsesLow.cons(module0038.f2761(Sequences.subseq(var19, module0783.f50354(var30), module0783.f50355(var30)), (SubLObject)UNPROVIDED), var27);
            var29 = var29.rest();
            var30 = var29.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f47861(final SubLObject var17, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = Equality.eq((SubLObject)$ic6$, module0579.$g4259$.getDynamicValue());
        }
        return f47862(var17, var31, (SubLObject)T);
    }
    
    public static SubLObject f47863(final SubLObject var2, final SubLObject var32) {
        return (SubLObject)makeBoolean(NIL != f47864(var2, var32) && NIL != f47865(var2, var32));
    }
    
    public static SubLObject f47864(final SubLObject var2, final SubLObject var32) {
        if (NIL != module0581.f35648(var2)) {
            return module0758.f47970(var2, var32);
        }
        if (var2.isList()) {
            return f47864(var2.first(), var32);
        }
        if (NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5333(var2);
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                var36 = module0032.f1745(var34, var35);
                if (NIL != module0032.f1746(var35, var36) && NIL == f47864(var36, var32)) {
                    return (SubLObject)NIL;
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47865(final SubLObject var2, final SubLObject var32) {
        if (NIL != module0581.f35648(var2)) {
            return module0758.f47971(var2, var32);
        }
        if (var2.isList()) {
            return f47865(var2.first(), var32);
        }
        if (NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5333(var2);
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                var36 = module0032.f1745(var34, var35);
                if (NIL != module0032.f1746(var35, var36) && NIL == f47865(var36, var32)) {
                    return (SubLObject)NIL;
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47866(final SubLObject var2, final SubLObject var32) {
        return f47867(f47868(var2, var32), var32);
    }
    
    public static SubLObject f47867(final SubLObject var2, final SubLObject var32) {
        if (NIL != module0581.f35648(var2)) {
            return module0758.f47962(var2, var32);
        }
        if (NIL != module0035.f2013(var2)) {
            return (SubLObject)ConsesLow.cons(f47867(var2.first(), var32), var2.rest());
        }
        if (NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            final SubLObject var34 = module0077.f5333(var2);
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                var37 = module0032.f1745(var35, var36);
                if (NIL != module0032.f1746(var36, var37)) {
                    module0077.f5326(f47867(var37, var32), var33);
                }
            }
            return var33;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47868(final SubLObject var2, final SubLObject var32) {
        if (var32.eql((SubLObject)$ic7$)) {
            return var2;
        }
        if (NIL != module0581.f35648(var2)) {
            return module0758.f47963(var2, var32);
        }
        if (NIL != module0035.f2013(var2)) {
            return module0035.f2152(var2, f47868(module0035.f2114(var2), var32));
        }
        if (NIL != module0077.f5302(var2)) {
            final SubLObject var33 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            final SubLObject var34 = module0077.f5333(var2);
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                var37 = module0032.f1745(var35, var36);
                if (NIL != module0032.f1746(var36, var37)) {
                    module0077.f5326(f47868(var37, var32), var33);
                }
            }
            return var33;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47860(final SubLObject var2, final SubLObject var19, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var18) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)ZERO_INTEGER;
        }
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (NIL == var35) {
            var35 = Sequences.length(var19);
        }
        if (NIL != module0581.f35648(var2)) {
            return f47869(var2, var19, var34, var35, var36, var18);
        }
        if (NIL != module0035.f2013(var2)) {
            return f47870(var2, var19, var34, var35, var36, var18);
        }
        if (NIL != module0077.f5302(var2)) {
            final SubLObject var37 = module0077.f5333(var2);
            SubLObject var38;
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            for (var38 = module0032.f1741(var37), var39 = (SubLObject)NIL, var39 = module0032.f1742(var38, var37); NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                var40 = module0032.f1745(var38, var39);
                if (NIL != module0032.f1746(var39, var40)) {
                    var41 = f47860(var40, var19, var34, var35, var36, var18);
                    if (NIL != var41) {
                        return var41;
                    }
                }
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47869(final SubLObject var2, final SubLObject var19, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var37 = module0581.f35666(var2, (SubLObject)UNPROVIDED);
        if (var37.equal(Sequences.subseq(var19, var34, var35))) {
            return (SubLObject)$ic8$;
        }
        final SubLObject var38 = (NIL != var18) ? Symbols.symbol_function((SubLObject)EQUAL) : Symbols.symbol_function((SubLObject)EQUALP);
        final SubLObject var39 = Sequences.search(var19, var37, var38, Symbols.symbol_function((SubLObject)IDENTITY), var34, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var40 = Equality.eql((SubLObject)ZERO_INTEGER, var39);
        final SubLObject var41 = Equality.eql(var39, Numbers.subtract(Sequences.length(var37), Numbers.subtract(var35, var34)));
        return (SubLObject)((NIL == var39) ? NIL : ((NIL != var40 && NIL != var41) ? $ic8$ : ((NIL != var40) ? $ic9$ : ((NIL != var36) ? NIL : ((NIL != var41) ? $ic10$ : $ic11$)))));
    }
    
    public static SubLObject f47870(final SubLObject var2, final SubLObject var19, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var2)) {
            return f47860(module0035.f2113(var2), var19, var34, var35, var36, var18);
        }
        SubLObject var38 = module0048.f_1X(var34);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        var40 = var2;
        var41 = var40.first();
        for (var42 = (SubLObject)ZERO_INTEGER; NIL != var40; var40 = var40.rest(), var41 = var40.first(), var42 = Numbers.add((SubLObject)ONE_INTEGER, var42)) {
            if (NIL == var36 || !var42.numG((SubLObject)ZERO_INTEGER)) {
                var37.resetMultipleValues();
                final SubLObject var43 = f47871(var41, var19, var34, var38, var36, var18);
                final SubLObject var44 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                if (NIL != var43) {
                    var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((NIL != var44) ? module0048.f_1X(var34) : var34, var42, var44, Equality.eql(var42, (SubLObject)ZERO_INTEGER)), var39);
                }
            }
        }
        while (NIL != var39 && var38.numL(var35)) {
            var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER);
            SubLObject var45 = (SubLObject)NIL;
            SubLObject var46 = var39;
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                SubLObject var49;
                final SubLObject var48 = var49 = var47;
                SubLObject var50 = (SubLObject)NIL;
                SubLObject var51 = (SubLObject)NIL;
                SubLObject var52 = (SubLObject)NIL;
                SubLObject var53 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic20$);
                var50 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic20$);
                var51 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic20$);
                var52 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic20$);
                var53 = var49.first();
                var49 = var49.rest();
                if (NIL == var49) {
                    final SubLObject var54 = (NIL != var52) ? module0048.f_1X(var51) : var51;
                    final SubLObject var55 = ConsesLow.nth(var54, var2);
                    final SubLObject var36_56 = var52;
                    if (NIL != var55) {
                        var37.resetMultipleValues();
                        final SubLObject var56 = f47871(var55, var19, var50, var38, var36_56, var18);
                        final SubLObject var48_57 = var37.secondMultipleValue();
                        var37.resetMultipleValues();
                        if (NIL != var56) {
                            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((NIL != var48_57) ? var38 : var50, var54, var48_57, var53), var45);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic20$);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
            var39 = var45;
        }
        if (NIL != module0035.f2012(var39)) {
            return (SubLObject)NIL;
        }
        SubLObject var58;
        final SubLObject var57 = var58 = var39.first();
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)$ic21$);
        var59 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)$ic21$);
        var60 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)$ic21$);
        var44 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)$ic21$);
        var61 = var58.first();
        var58 = var58.rest();
        if (NIL != var58) {
            cdestructuring_bind.cdestructuring_bind_error(var57, (SubLObject)$ic21$);
            return (SubLObject)NIL;
        }
        final SubLObject var62 = (SubLObject)makeBoolean(Sequences.length(var2).eql(module0048.f_1X(var60)) && NIL != var44);
        if (NIL != var61 && NIL != var62) {
            return (SubLObject)$ic8$;
        }
        if (NIL != var61) {
            return (SubLObject)$ic9$;
        }
        if (NIL != var62) {
            return (SubLObject)$ic10$;
        }
        return (SubLObject)$ic11$;
    }
    
    public static SubLObject f47871(final SubLObject var9, final SubLObject var19, final SubLObject var34, final SubLObject var44, final SubLObject var36, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = f47860(var9, var19, var34, var44, var36, var18);
        if (var47.eql((SubLObject)$ic8$)) {
            var45 = (SubLObject)T;
            var46 = (SubLObject)T;
        }
        else if (var47.eql((SubLObject)$ic10$)) {
            if (NIL == var36) {
                var45 = (SubLObject)T;
                var46 = (SubLObject)T;
            }
        }
        else if (var47.eql((SubLObject)$ic11$)) {
            if (NIL == var36) {
                var45 = (SubLObject)T;
            }
        }
        else if (var47.eql((SubLObject)$ic9$)) {
            var45 = (SubLObject)T;
        }
        return Values.values(var45, var46);
    }
    
    public static SubLObject f47862(final SubLObject var17, final SubLObject var31, final SubLObject var62) {
        final SubLObject var63 = f47872(var17, var31, var62);
        return (NIL != module0035.f1997(var63)) ? module0035.f2113(var63) : module0078.f5367(var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47872(final SubLObject var17, final SubLObject var31, final SubLObject var62) {
        SubLObject var63 = (SubLObject)NIL;
        if (NIL != module0756.f47479(var17) && NIL == module0579.f35496(module0756.f47627(var17), (SubLObject)UNPROVIDED)) {
            final SubLObject var64 = module0756.f47480(var17, var31);
            if (NIL == conses_high.member(var64, var63, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var63 = (SubLObject)ConsesLow.cons(var64, var63);
            }
            SubLObject var65 = module0756.f47672(var17);
            SubLObject var66 = (SubLObject)NIL;
            var66 = var65.first();
            while (NIL != var65) {
                SubLObject var8_67 = f47872(var66, var31, (SubLObject)NIL);
                SubLObject var67 = (SubLObject)NIL;
                var67 = var8_67.first();
                while (NIL != var8_67) {
                    final SubLObject var68 = var67;
                    if (NIL == conses_high.member(var68, var63, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var63 = (SubLObject)ConsesLow.cons(var68, var63);
                    }
                    var8_67 = var8_67.rest();
                    var67 = var8_67.first();
                }
                var65 = var65.rest();
                var66 = var65.first();
            }
            if (NIL != module0756.f47478(var17)) {
                SubLObject var69 = (SubLObject)NIL;
                SubLObject var70 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var17).isVector()) {
                    final SubLObject var71 = module0743.f45996(var17);
                    final SubLObject var72 = (SubLObject)NIL;
                    SubLObject var73;
                    SubLObject var74;
                    SubLObject var75;
                    SubLObject var76;
                    for (var73 = Sequences.length(var71), var74 = (SubLObject)NIL, var74 = (SubLObject)ZERO_INTEGER; var74.numL(var73); var74 = Numbers.add(var74, (SubLObject)ONE_INTEGER)) {
                        var75 = ((NIL != var72) ? Numbers.subtract(var73, var74, (SubLObject)ONE_INTEGER) : var74);
                        var76 = Vectors.aref(var71, var75);
                        if (NIL != module0756.f47546(var76)) {
                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)$ic24$, var76);
                            }
                            var69 = (SubLObject)ConsesLow.cons(module0756.f47480(var76, var31), var69);
                        }
                        else {
                            var69 = (SubLObject)ConsesLow.cons(f47862(var76, var31, (SubLObject)NIL), var69);
                        }
                        var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47874() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47875() {
        module0027.f1449((SubLObject)$ic12$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic13$, NIL, $ic14$, NIL, $ic15$, NIL, $ic16$, $ic17$, $ic18$, T }), (SubLObject)$ic19$);
        module0027.f1449((SubLObject)$ic22$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic13$, NIL, $ic14$, NIL, $ic15$, NIL, $ic16$, $ic17$, $ic18$, T }), (SubLObject)$ic23$);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("S#52316", "CYC");
        $ic1$ = makeSymbol("S#39348", "CYC");
        $ic2$ = makeSymbol(">");
        $ic3$ = makeSymbol("S#52336", "CYC");
        $ic4$ = makeSymbol("S#52337", "CYC");
        $ic5$ = makeSymbol("S#52338", "CYC");
        $ic6$ = makeKeyword("HTML");
        $ic7$ = makeKeyword("NONE");
        $ic8$ = makeKeyword("COMPLETE");
        $ic9$ = makeKeyword("INITIAL");
        $ic10$ = makeKeyword("FINAL");
        $ic11$ = makeKeyword("MEDIAL");
        $ic12$ = makeSymbol("S#52331", "CYC");
        $ic13$ = makeKeyword("TEST");
        $ic14$ = makeKeyword("OWNER");
        $ic15$ = makeKeyword("CLASSES");
        $ic16$ = makeKeyword("KB");
        $ic17$ = makeKeyword("TINY");
        $ic18$ = makeKeyword("WORKING?");
        $ic19$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)T), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)NIL), (SubLObject)makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)NIL), (SubLObject)makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T, (SubLObject)NIL), (SubLObject)makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T, (SubLObject)T), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("dog")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)T, (SubLObject)NIL), (SubLObject)makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("COMPLETE")) });
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#52339", "CYC"), (SubLObject)makeSymbol("S#52340", "CYC"), (SubLObject)makeSymbol("S#52341", "CYC"), (SubLObject)makeSymbol("S#52342", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#52343", "CYC"), (SubLObject)makeSymbol("S#52340", "CYC"), (SubLObject)makeSymbol("S#52341", "CYC"), (SubLObject)makeSymbol("S#52342", "CYC"));
        $ic22$ = makeSymbol("S#52332", "CYC");
        $ic23$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)T), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ZERO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)NIL), (SubLObject)makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("on"), (SubLObject)makeString("the")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)NIL), (SubLObject)makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the pretty cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("cat"), (SubLObject)makeString("is"), (SubLObject)makeString("on"), (SubLObject)makeString("the"), (SubLObject)makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)makeString("the"), (SubLObject)makeString("dog")), (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T), (SubLObject)NIL) });
        $ic24$ = makeString("Ignoring possible variants for meta phrase~% ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/