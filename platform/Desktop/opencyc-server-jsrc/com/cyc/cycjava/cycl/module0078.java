package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0078 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0078";
    public static final String myFingerPrint = "b192466ff655771fc9f9edd0f26129a63a1cd68173b7b2fb4eb2e1b1a29e03ba";
    public static SubLSymbol $g1146$;
    public static SubLSymbol $g1147$;
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
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
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
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    
    public static SubLObject f5343(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0077.f5333(var1);
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)NIL, var6 = module0032.f1742(var5, var4); NIL == var3 && NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (NIL != module0032.f1746(var6, var7)) {
                var2 = var7;
                var3 = (SubLObject)T;
            }
        }
        return Values.values(var2, var3);
    }
    
    public static SubLObject f5344(final SubLObject var1, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = module0077.f5333(var1);
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = module0032.f1741(var9), var11 = (SubLObject)NIL, var11 = module0032.f1742(var10, var9); NIL == module0032.f1744(var10, var11); var11 = module0032.f1743(var11)) {
            var12 = module0032.f1745(var10, var11);
            if (NIL != module0032.f1746(var11, var12)) {
                return var12;
            }
        }
        return var8;
    }
    
    public static SubLObject f5345(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)NIL, var12 = module0032.f1741(var9), var13 = (SubLObject)NIL, var13 = module0032.f1742(var12, var9); NIL == var11 && NIL == module0032.f1744(var12, var13); var13 = module0032.f1743(var13)) {
            var14 = module0032.f1745(var12, var13);
            if (NIL != module0032.f1746(var13, var14)) {
                var10 = var14;
                var11 = (SubLObject)T;
            }
        }
        return Values.values(var10, var11);
    }
    
    public static SubLObject f5346(final SubLObject var9, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = module0032.f1741(var9), var11 = (SubLObject)NIL, var11 = module0032.f1742(var10, var9); NIL == module0032.f1744(var10, var11); var11 = module0032.f1743(var11)) {
            var12 = module0032.f1745(var10, var11);
            if (NIL != module0032.f1746(var11, var12)) {
                return var12;
            }
        }
        return var8;
    }
    
    public static SubLObject f5347(final SubLObject var1) {
        assert NIL != module0077.f5302(var1) : var1;
        final SubLObject var2 = module0077.f5325(var1);
        module0077.f5327(var2, var1);
        return var2;
    }
    
    public static SubLObject f5348(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var10) : var10;
        if (NIL == var11) {
            var11 = f5349(var10);
        }
        assert NIL != module0030.f1591(var11) : var11;
        if (NIL != module0035.find_if_not((SubLObject)$ic1$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == var10) {
            return module0077.f5313(var11, (SubLObject)UNPROVIDED);
        }
        final SubLObject var12 = module0048.f3381(Mapping.mapcar((SubLObject)$ic4$, var10), (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0077.f5313(var11, var12);
        SubLObject var14 = var10;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            final SubLObject var16 = module0077.f5333(var15);
            SubLObject var17;
            SubLObject var18;
            SubLObject var19;
            for (var17 = module0032.f1741(var16), var18 = (SubLObject)NIL, var18 = module0032.f1742(var17, var16); NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
                var19 = module0032.f1745(var17, var18);
                if (NIL != module0032.f1746(var18, var19)) {
                    module0077.f5326(var19, var13);
                }
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f5350(final SubLObject var15, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0035.f2015(var15) : var15;
        SubLObject var16 = var15;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            assert NIL != module0032.f1724(var17) : var17;
            var16 = var16.rest();
            var17 = var16.first();
        }
        if (NIL == var15) {
            return module0032.f1726((SubLObject)ZERO_INTEGER, var11);
        }
        if (NIL != module0035.f1997(var15)) {
            return module0032.f1727(var15.first());
        }
        final SubLObject var18 = module0048.f3381(Mapping.mapcar((SubLObject)$ic7$, var15), (SubLObject)UNPROVIDED);
        SubLObject var19 = module0032.f1726(var18, var11);
        SubLObject var20 = var15;
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            final SubLObject var22 = var21;
            SubLObject var23;
            SubLObject var24;
            SubLObject var25;
            for (var23 = module0032.f1741(var22), var24 = (SubLObject)NIL, var24 = module0032.f1742(var23, var22); NIL == module0032.f1744(var23, var24); var24 = module0032.f1743(var24)) {
                var25 = module0032.f1745(var23, var24);
                if (NIL != module0032.f1746(var24, var25)) {
                    var19 = module0032.f1736(var25, var19, (SubLObject)UNPROVIDED);
                }
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f5351(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var10) : var10;
        if (NIL == var11) {
            var11 = f5349(var10);
        }
        assert NIL != module0030.f1591(var11) : var11;
        if (NIL != module0035.find_if_not((SubLObject)$ic1$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == var10) {
            return module0077.f5313(var11, (SubLObject)UNPROVIDED);
        }
        final SubLObject var12 = module0035.f2378(var10, Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)$ic4$);
        final SubLObject var13 = module0077.f5311(var12);
        final SubLObject var14 = module0077.f5313(var11, var13);
        final SubLObject var15 = module0077.f5333(var12);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
            var18 = module0032.f1745(var16, var17);
            if (NIL != module0032.f1746(var17, var18)) {
                var19 = (SubLObject)NIL;
                if (NIL == var19) {
                    var20 = var10;
                    var21 = (SubLObject)NIL;
                    var21 = var20.first();
                    while (NIL == var19 && NIL != var20) {
                        if (!var21.eql(var12) && NIL == module0077.f5320(var18, var21)) {
                            var19 = (SubLObject)T;
                        }
                        var20 = var20.rest();
                        var21 = var20.first();
                    }
                }
                if (NIL == var19) {
                    module0077.f5326(var18, var14);
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f5352(final SubLObject var15, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0035.f2015(var15) : var15;
        SubLObject var16 = var15;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            assert NIL != module0032.f1724(var17) : var17;
            var16 = var16.rest();
            var17 = var16.first();
        }
        if (NIL == var15) {
            return module0032.f1726((SubLObject)ZERO_INTEGER, var11);
        }
        if (NIL != module0035.f1997(var15)) {
            return module0032.f1727(var15.first());
        }
        SubLObject var18 = module0032.f1726((SubLObject)ZERO_INTEGER, var11);
        if (NIL != var15) {
            final SubLObject var20;
            final SubLObject var19 = var20 = module0035.f2378(var15, Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)$ic7$);
            SubLObject var21;
            SubLObject var22;
            SubLObject var23;
            SubLObject var24;
            SubLObject var25;
            SubLObject var26;
            for (var21 = module0032.f1741(var20), var22 = (SubLObject)NIL, var22 = module0032.f1742(var21, var20); NIL == module0032.f1744(var21, var22); var22 = module0032.f1743(var22)) {
                var23 = module0032.f1745(var21, var22);
                if (NIL != module0032.f1746(var22, var23)) {
                    var24 = (SubLObject)NIL;
                    if (NIL == var24) {
                        var25 = var15;
                        var26 = (SubLObject)NIL;
                        var26 = var25.first();
                        while (NIL == var24 && NIL != var25) {
                            if (!var26.eql(var19) && NIL == module0032.f1731(var23, var26, var11)) {
                                var24 = (SubLObject)T;
                            }
                            var25 = var25.rest();
                            var26 = var25.first();
                        }
                    }
                    if (NIL == var24) {
                        var18 = module0032.f1736(var23, var18, var11);
                    }
                }
            }
        }
        return var18;
    }
    
    public static SubLObject f5353(final SubLObject var10) {
        assert NIL != Types.listp(var10) : var10;
        if (NIL == var10) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = module0035.f2378(var10, Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)$ic4$);
        final SubLObject var12 = module0077.f5333(var11);
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var13 = module0032.f1741(var12), var14 = (SubLObject)NIL, var14 = module0032.f1742(var13, var12); NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
            var15 = module0032.f1745(var13, var14);
            if (NIL != module0032.f1746(var14, var15)) {
                var16 = var10;
                var17 = (SubLObject)NIL;
                var17 = var16.first();
                while (NIL != var16) {
                    if (!var17.eql(var11) && NIL != module0077.f5320(var15, var17)) {
                        return (SubLObject)T;
                    }
                    var16 = var16.rest();
                    var17 = var16.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5354(final SubLObject var24, final SubLObject var25) {
        final SubLObject var26 = module0077.f5311(var24).numLE(module0077.f5311(var25)) ? var24 : var25;
        final SubLObject var27 = module0077.f5311(var24).numLE(module0077.f5311(var25)) ? var25 : var24;
        final SubLObject var28 = module0077.f5311(var26);
        SubLObject var29 = (SubLObject)ZERO_INTEGER;
        if (var28.numE((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var30 = module0077.f5333(var26);
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
            var33 = module0032.f1745(var31, var32);
            if (NIL != module0032.f1746(var32, var33) && NIL != module0077.f5320(var33, var27)) {
                var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
            }
        }
        return Numbers.divide(var29, var28);
    }
    
    public static SubLObject f5355(final SubLObject var24, final SubLObject var25, final SubLObject var30) {
        if (module0077.f5311(var24).numL(var30)) {
            return (SubLObject)NIL;
        }
        if (module0077.f5311(var25).numL(var30)) {
            return (SubLObject)NIL;
        }
        final SubLObject var31 = module0077.f5311(var24).numLE(module0077.f5311(var25)) ? var24 : var25;
        final SubLObject var32 = module0077.f5311(var24).numLE(module0077.f5311(var25)) ? var25 : var24;
        SubLObject var33 = var30;
        final SubLObject var34 = module0077.f5333(var31);
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
            var37 = module0032.f1745(var35, var36);
            if (NIL != module0032.f1746(var36, var37) && NIL != module0077.f5320(var37, var32)) {
                var33 = Numbers.subtract(var33, (SubLObject)ONE_INTEGER);
                if (var33.isZero()) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5356(final SubLObject var24, final SubLObject var25, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        assert NIL != module0077.f5302(var24) : var24;
        assert NIL != module0077.f5302(var25) : var25;
        if (NIL == var11) {
            var11 = f5349((SubLObject)ConsesLow.list(var24, var25));
        }
        assert NIL != module0030.f1591(var11) : var11;
        final SubLObject var26 = module0077.f5313(var11, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0077.f5333(var24);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
            var30 = module0032.f1745(var28, var29);
            if (NIL != module0032.f1746(var29, var30) && NIL == module0077.f5320(var30, var25)) {
                module0077.f5326(var30, var26);
            }
        }
        return var26;
    }
    
    public static SubLObject f5357(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = module0077.f5333(var33);
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
            var37 = module0032.f1745(var35, var36);
            if (NIL != module0032.f1746(var36, var37)) {
                module0077.f5327(var37, var32);
            }
        }
        return var32;
    }
    
    public static SubLObject f5358(final SubLObject var32, final SubLObject var33) {
        return f5357(module0077.f5314(var32), var33);
    }
    
    public static SubLObject f5359(final SubLObject var24, final SubLObject var25) {
        assert NIL != module0077.f5302(var24) : var24;
        assert NIL != module0077.f5302(var25) : var25;
        if (var24.eql(var25)) {
            return (SubLObject)T;
        }
        if (!module0077.f5311(var24).eql(module0077.f5311(var25))) {
            return (SubLObject)NIL;
        }
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = module0077.f5333(var24);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == var26 && NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
            var30 = module0032.f1745(var28, var29);
            if (NIL != module0032.f1746(var29, var30) && NIL == module0077.f5320(var30, var25)) {
                var26 = (SubLObject)T;
            }
        }
        if (NIL == var26 && !module0077.f5315(var24).eql(module0077.f5315(var25))) {
            var27 = module0077.f5333(var25);
            SubLObject var31;
            for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == var26 && NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                var31 = module0032.f1745(var28, var29);
                if (NIL != module0032.f1746(var29, var31) && NIL == module0077.f5320(var31, var24)) {
                    var26 = (SubLObject)T;
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var26);
    }
    
    public static SubLObject f5349(final SubLObject var10) {
        final SubLObject var11 = module0077.f5315(var10.first());
        if (NIL == Sequences.remove(var11, var10, Symbols.symbol_function((SubLObject)EQ), (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var11;
        }
        return module0077.$g1143$.getGlobalValue();
    }
    
    public static SubLObject f5360(final SubLObject var39, final SubLObject var40) {
        assert NIL != module0077.f5302(var39) : var39;
        assert NIL != module0077.f5302(var40) : var40;
        SubLObject var41 = (SubLObject)NIL;
        if (module0077.f5311(var39).numG(module0077.f5311(var40)) && module0077.f5315(var39).eql(module0077.f5315(var40))) {
            var41 = (SubLObject)T;
        }
        final SubLObject var42 = module0077.f5333(var39);
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        for (var43 = module0032.f1741(var42), var44 = (SubLObject)NIL, var44 = module0032.f1742(var43, var42); NIL == var41 && NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
            var45 = module0032.f1745(var43, var44);
            if (NIL != module0032.f1746(var44, var45) && NIL == module0077.f5320(var45, var40)) {
                var41 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var41);
    }
    
    public static SubLObject f5361(final SubLObject var39, final SubLObject var41) {
        SubLObject var42 = var41;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            if (NIL != f5360(var39, var43)) {
                return (SubLObject)T;
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5362(final SubLObject var42, final SubLObject var1, SubLObject var11, SubLObject var43) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0077.f5302(var1) : var1;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0077.f5333(var1);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == var44 && NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL != Functions.funcall(var11, var42, Functions.funcall(var43, var48))) {
                var44 = var48;
            }
        }
        return var44;
    }
    
    public static SubLObject f5363(final SubLObject var11, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0077.f5302(var1) : var1;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0077.f5333(var1);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == var44 && NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL != Functions.funcall(var11, Functions.funcall(var43, var48))) {
                var44 = var48;
            }
        }
        return var44;
    }
    
    public static SubLObject f5364(final SubLObject var11, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0077.f5302(var1) : var1;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0077.f5333(var1);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == var44 && NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL == Functions.funcall(var11, Functions.funcall(var43, var48))) {
                var44 = var48;
            }
        }
        return var44;
    }
    
    public static SubLObject f5365(final SubLObject var11, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0077.f5302(var1) : var1;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0077.f5333(var1);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL != Functions.funcall(var11, Functions.funcall(var43, var48))) {
                var44 = (SubLObject)ConsesLow.cons(var48, var44);
            }
        }
        SubLObject var49 = var44;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            module0077.f5327(var50, var1);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return Values.values(var1, module0035.f2013(var44));
    }
    
    public static SubLObject f5366(final SubLObject var11, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != module0077.f5302(var1) : var1;
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0077.f5333(var1);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL == Functions.funcall(var11, Functions.funcall(var43, var48))) {
                var44 = (SubLObject)ConsesLow.cons(var48, var44);
            }
        }
        SubLObject var49 = var44;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            module0077.f5327(var50, var1);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return Values.values(var1, module0035.f2013(var44));
    }
    
    public static SubLObject f5367(final SubLObject var46, SubLObject var11, SubLObject var12) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var12 == UNPROVIDED) {
            var12 = Sequences.length(var46);
        }
        final SubLObject var47 = module0077.f5313(var11, var12);
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            module0077.f5326(var49, var47);
            var48 = var48.rest();
            var49 = var48.first();
        }
        return var47;
    }
    
    public static SubLObject f5368(final SubLObject var46, SubLObject var11, SubLObject var12) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var12 == UNPROVIDED) {
            var12 = Sequences.length(var46);
        }
        SubLObject var47 = module0032.f1726(var12, var11);
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            var47 = module0032.f1736(var49, var47, var11);
            var48 = var48.rest();
            var49 = var48.first();
        }
        return var47;
    }
    
    public static SubLObject f5369(final SubLObject var7, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var12 = module0077.f5313(var11, (SubLObject)ONE_INTEGER);
        module0077.f5326(var7, var12);
        return var12;
    }
    
    public static SubLObject f5370(final SubLObject var46, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = module0077.$g1143$.getGlobalValue();
        }
        return f5367(var46, var11, Sequences.length(var46));
    }
    
    public static SubLObject f5371(final SubLObject var47, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var48 = (SubLObject)NIL;
        if (var43.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var43 == IDENTITY) {
            final SubLObject var49 = module0077.f5333(var1);
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var48 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var52 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var52)) {
                    var48 = Functions.funcall(var47, var52);
                }
            }
        }
        else {
            final SubLObject var49 = module0077.f5333(var1);
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var48 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var52 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var52)) {
                    var48 = Functions.funcall(var47, Functions.funcall(var43, var52));
                }
            }
        }
        return var48;
    }
    
    public static SubLObject f5372(final SubLObject var47, final SubLObject var1, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var48 = (SubLObject)NIL;
        if (var43.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var43 == IDENTITY) {
            final SubLObject var49 = module0077.f5333(var1);
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var48 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var52 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var52)) {
                    var48 = (SubLObject)makeBoolean(NIL == Functions.funcall(var47, var52));
                }
            }
        }
        else {
            final SubLObject var49 = module0077.f5333(var1);
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var48 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var52 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var52)) {
                    var48 = (SubLObject)makeBoolean(NIL == Functions.funcall(var47, Functions.funcall(var43, var52)));
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var48);
    }
    
    public static SubLObject f5373(final SubLObject var1, SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)T;
        }
        final SubLObject var49 = module0077.f5333(var1);
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
            var52 = module0032.f1745(var50, var51);
            if (NIL != module0032.f1746(var51, var52)) {
                PrintLow.format(var48, (SubLObject)$ic12$, var52);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5374(final SubLObject var49, final SubLObject var1) {
        SubLObject var50 = var49;
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            module0077.f5326(var51, var1);
            var50 = var50.rest();
            var51 = var50.first();
        }
        return var1;
    }
    
    public static SubLObject f5375(final SubLObject var1, final SubLObject var50) {
        final SubLObject var51 = module0077.f5333(var1);
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        for (var52 = module0032.f1741(var51), var53 = (SubLObject)NIL, var53 = module0032.f1742(var52, var51); NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
            var54 = module0032.f1745(var52, var53);
            if (NIL != module0032.f1746(var53, var54)) {
                module0077.f5326(var54, var50);
            }
        }
        return var50;
    }
    
    public static SubLObject f5376(final SubLObject var49, final SubLObject var1) {
        SubLObject var50 = var49;
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            module0077.f5327(var51, var1);
            var50 = var50.rest();
            var51 = var50.first();
        }
        return var1;
    }
    
    public static SubLObject f5377(final SubLObject var52, final SubLObject var53) {
        assert NIL != module0077.f5302(var52) : var52;
        assert NIL != module0077.f5302(var53) : var53;
        final SubLObject var54 = module0077.f5333(var53);
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        for (var55 = module0032.f1741(var54), var56 = (SubLObject)NIL, var56 = module0032.f1742(var55, var54); NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
            var57 = module0032.f1745(var55, var56);
            if (NIL != module0032.f1746(var56, var57)) {
                module0077.f5326(var57, var52);
            }
        }
        return var52;
    }
    
    public static SubLObject f5378(final SubLObject var54, final SubLObject var55) {
        SubLObject var57;
        final SubLObject var56 = var57 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic13$);
        final SubLObject var58 = var57.rest();
        var57 = var57.first();
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic13$);
        var59 = var57.first();
        var57 = var57.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic13$);
        var60 = var57.first();
        var57 = var57.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic13$);
        var61 = var57.first();
        var57 = var57.rest();
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = var57;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var63_64 = (SubLObject)NIL;
        while (NIL != var63) {
            cdestructuring_bind.destructuring_bind_must_consp(var63, var56, (SubLObject)$ic13$);
            var63_64 = var63.first();
            var63 = var63.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var63, var56, (SubLObject)$ic13$);
            if (NIL == conses_high.member(var63_64, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var64 = (SubLObject)T;
            }
            if (var63_64 == $ic15$) {
                var62 = var63.first();
            }
            var63 = var63.rest();
        }
        if (NIL != var64 && NIL == var62) {
            cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic13$);
        }
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var57);
        final SubLObject var66 = (SubLObject)((NIL != var65) ? conses_high.cadr(var65) : NIL);
        final SubLObject var67;
        var57 = (var67 = var58);
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list(reader.bq_cons(var60, (SubLObject)$ic18$)), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var59, var61, (SubLObject)$ic16$, var66), ConsesLow.append(var67, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var60)))));
    }
    
    public static SubLObject f5379(final SubLObject var68, final SubLObject var48) {
        compatibility.default_struct_print_function(var68, var48, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5380(final SubLObject var68) {
        return (SubLObject)((var68.getClass() == $sX6958_native.class) ? T : NIL);
    }
    
    public static SubLObject f5381(final SubLObject var68) {
        assert NIL != f5380(var68) : var68;
        return var68.getField2();
    }
    
    public static SubLObject f5382(final SubLObject var68) {
        assert NIL != f5380(var68) : var68;
        return var68.getField3();
    }
    
    public static SubLObject f5383(final SubLObject var68) {
        assert NIL != f5380(var68) : var68;
        return var68.getField4();
    }
    
    public static SubLObject f5384(final SubLObject var68) {
        assert NIL != f5380(var68) : var68;
        return var68.getField5();
    }
    
    public static SubLObject f5385(final SubLObject var68) {
        assert NIL != f5380(var68) : var68;
        return var68.getField6();
    }
    
    public static SubLObject f5386(final SubLObject var68, final SubLObject var70) {
        assert NIL != f5380(var68) : var68;
        return var68.setField2(var70);
    }
    
    public static SubLObject f5387(final SubLObject var68, final SubLObject var70) {
        assert NIL != f5380(var68) : var68;
        return var68.setField3(var70);
    }
    
    public static SubLObject f5388(final SubLObject var68, final SubLObject var70) {
        assert NIL != f5380(var68) : var68;
        return var68.setField4(var70);
    }
    
    public static SubLObject f5389(final SubLObject var68, final SubLObject var70) {
        assert NIL != f5380(var68) : var68;
        return var68.setField5(var70);
    }
    
    public static SubLObject f5390(final SubLObject var68, final SubLObject var70) {
        assert NIL != f5380(var68) : var68;
        return var68.setField6(var70);
    }
    
    public static SubLObject f5391(SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)NIL;
        }
        final SubLObject var72 = (SubLObject)new $sX6958_native();
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        for (var73 = (SubLObject)NIL, var73 = var71; NIL != var73; var73 = conses_high.cddr(var73)) {
            var74 = var73.first();
            var75 = conses_high.cadr(var73);
            var76 = var74;
            if (var76.eql((SubLObject)$ic40$)) {
                f5386(var72, var75);
            }
            else if (var76.eql((SubLObject)$ic41$)) {
                f5387(var72, var75);
            }
            else if (var76.eql((SubLObject)$ic42$)) {
                f5388(var72, var75);
            }
            else if (var76.eql((SubLObject)$ic43$)) {
                f5389(var72, var75);
            }
            else if (var76.eql((SubLObject)$ic44$)) {
                f5390(var72, var75);
            }
            else {
                Errors.error((SubLObject)$ic45$, var74);
            }
        }
        return var72;
    }
    
    public static SubLObject f5392(final SubLObject var77, final SubLObject var78) {
        Functions.funcall(var78, var77, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var78, var77, (SubLObject)$ic48$, (SubLObject)$ic40$, f5381(var77));
        Functions.funcall(var78, var77, (SubLObject)$ic48$, (SubLObject)$ic41$, f5382(var77));
        Functions.funcall(var78, var77, (SubLObject)$ic48$, (SubLObject)$ic42$, f5383(var77));
        Functions.funcall(var78, var77, (SubLObject)$ic48$, (SubLObject)$ic43$, f5384(var77));
        Functions.funcall(var78, var77, (SubLObject)$ic48$, (SubLObject)$ic44$, f5385(var77));
        Functions.funcall(var78, var77, (SubLObject)$ic49$, (SubLObject)$ic47$, (SubLObject)FIVE_INTEGER);
        return var77;
    }
    
    public static SubLObject f5393(final SubLObject var77, final SubLObject var78) {
        return f5392(var77, var78);
    }
    
    public static SubLObject f5394(final SubLObject var79, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var80 = f5391((SubLObject)UNPROVIDED);
        f5386(var80, var79);
        f5387(var80, module0077.f5313(var11, var79));
        f5388(var80, module0077.f5313(var11, var79));
        f5389(var80, module0055.f4017());
        f5390(var80, module0055.f4017());
        return var80;
    }
    
    public static SubLObject f5395(final SubLObject var7, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        final SubLObject var82 = f5382(var80);
        final SubLObject var83 = f5384(var80);
        final SubLObject var84 = f5381(var80);
        var81.resetMultipleValues();
        final SubLObject var85 = f5396(var7, var82, var83, var84);
        final SubLObject var86 = var81.secondMultipleValue();
        var81.resetMultipleValues();
        return Values.values(var85, var86);
    }
    
    public static SubLObject f5397(final SubLObject var7, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        final SubLObject var82 = f5383(var80);
        final SubLObject var83 = f5385(var80);
        final SubLObject var84 = f5381(var80);
        var81.resetMultipleValues();
        final SubLObject var85 = f5396(var7, var82, var83, var84);
        final SubLObject var86 = var81.secondMultipleValue();
        var81.resetMultipleValues();
        return Values.values(var85, var86);
    }
    
    public static SubLObject f5398(final SubLObject var80, final SubLObject var30) {
        return f5355(f5382(var80), f5383(var80), var30);
    }
    
    public static SubLObject f5399(final SubLObject var80) {
        final SubLObject var81 = f5382(var80);
        final SubLObject var82 = f5383(var80);
        final SubLObject var83 = module0077.f5315(var81);
        return f5351((SubLObject)ConsesLow.list(var81, var82), var83);
    }
    
    public static SubLObject f5396(final SubLObject var7, final SubLObject var1, final SubLObject var82, final SubLObject var79) {
        final SubLObject var83 = module0077.f5326(var7, var1);
        if (NIL == module0035.sublisp_boolean(var83)) {
            module0055.f4026(var7, var82, module0077.f5315(var1));
            module0055.f4021(var7, var82);
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        module0055.f4021(var7, var82);
        if (var79.numL(module0077.f5311(var1))) {
            final SubLObject var84 = module0055.f4023(var82);
            module0077.f5327(var84, var1);
            return Values.values((SubLObject)T, var84);
        }
        return Values.values((SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f5400(final SubLObject var89, final SubLObject var90, final SubLObject var82, final SubLObject var91) {
        final SubLObject var92 = (SubLObject)EQUAL;
        final SubLObject var93 = Sequences.length(var91);
        final SubLObject var94 = f5367(var91, var92, var93);
        final SubLObject var95 = f5394(var82, var92);
        for (SubLObject var96 = var89, var97 = var90; NIL != module0035.sublisp_boolean(var96) || NIL != module0035.sublisp_boolean(var97); var96 = var96.rest(), var97 = var97.rest()) {
            f5395(var96.first(), var95);
            f5397(var97.first(), var95);
            if (NIL != f5398(var95, var93)) {
                final SubLObject var98 = f5399(var95);
                if (NIL != f5359(var98, var94)) {
                    return (SubLObject)$ic59$;
                }
                Errors.error((SubLObject)$ic60$, var98, var94);
            }
        }
        return (SubLObject)$ic61$;
    }
    
    public static SubLObject f5401() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5343", "S#6960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5344", "S#6961", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5345", "S#6962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5346", "S#6963", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5347", "S#6964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5348", "S#6965", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5350", "S#6966", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5351", "S#3291", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5352", "S#6967", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5353", "S#6968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5354", "S#6969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5355", "S#6970", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5356", "S#6971", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5357", "S#6972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5358", "S#6289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5359", "S#6288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5349", "S#6973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5360", "S#6974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5361", "S#6975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5362", "S#6976", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5363", "S#6977", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5364", "S#6978", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5365", "S#6979", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5366", "S#6980", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5367", "S#3289", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5368", "S#6981", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5369", "S#6982", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5370", "MAKE-SET-FROM-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5371", "S#6983", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5372", "S#6984", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5373", "S#6985", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5374", "S#6986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5375", "S#6987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5376", "S#6988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5377", "S#6989", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0078", "f5378", "S#6990");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5379", "S#6991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5380", "S#6959", 1, 0, false);
        new $f5380$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5381", "S#6992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5382", "S#6993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5383", "S#6994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5384", "S#6995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5385", "S#6996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5386", "S#6997", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5387", "S#6998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5388", "S#6999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5389", "S#7000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5390", "S#7001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5391", "S#7002", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5392", "S#7003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5393", "S#7004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5394", "S#7005", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5395", "S#7006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5397", "S#7007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5398", "S#7008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5399", "S#7009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5396", "S#7010", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0078", "f5400", "S#7011", 4, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5402() {
        $g1146$ = SubLFiles.deflexical("S#7012", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1146$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        $g1147$ = SubLFiles.defconstant("S#7013", (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5403() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f35((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1147$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Structures.def_csetf((SubLObject)$ic32$, (SubLObject)$ic33$);
        Structures.def_csetf((SubLObject)$ic34$, (SubLObject)$ic35$);
        Structures.def_csetf((SubLObject)$ic36$, (SubLObject)$ic37$);
        Structures.def_csetf((SubLObject)$ic38$, (SubLObject)$ic39$);
        Equality.identity((SubLObject)$ic21$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1147$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0027.f1449((SubLObject)$ic51$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic52$, EQL, $ic53$, NIL, $ic54$, NIL, $ic55$, $ic56$, $ic57$, T }), (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5401();
    }
    
    public void initializeVariables() {
        f5402();
    }
    
    public void runTopLevelForms() {
        f5403();
    }
    
    static {
        me = (SubLFile)new module0078();
        $g1146$ = null;
        $g1147$ = null;
        $ic0$ = makeSymbol("S#7012", "CYC");
        $ic1$ = makeSymbol("S#6920", "CYC");
        $ic2$ = makeSymbol("LISTP");
        $ic3$ = makeSymbol("S#2831", "CYC");
        $ic4$ = makeSymbol("S#707", "CYC");
        $ic5$ = makeSymbol("S#747", "CYC");
        $ic6$ = makeSymbol("S#2986", "CYC");
        $ic7$ = makeSymbol("S#2968", "CYC");
        $ic8$ = makeSymbol("<");
        $ic9$ = makeSymbol("S#6933", "CYC");
        $ic10$ = makeSymbol("MAKE-SET-FROM-LIST");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#3289", "CYC"));
        $ic12$ = makeString("~A~%");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#706", "CYC"), (SubLObject)makeSymbol("S#1598", "CYC"), (SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic15$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic16$ = makeKeyword("DONE");
        $ic17$ = makeSymbol("CLET");
        $ic18$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic19$ = makeSymbol("S#708", "CYC");
        $ic20$ = makeSymbol("CINC");
        $ic21$ = makeSymbol("S#6958", "CYC");
        $ic22$ = makeSymbol("S#6959", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#7014", "CYC"), (SubLObject)makeSymbol("S#7015", "CYC"), (SubLObject)makeSymbol("S#7016", "CYC"), (SubLObject)makeSymbol("S#7017", "CYC"), (SubLObject)makeSymbol("S#7018", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("WINDOW"), (SubLObject)makeKeyword("SET-A"), (SubLObject)makeKeyword("SET-B"), (SubLObject)makeKeyword("WINDOW-A"), (SubLObject)makeKeyword("WINDOW-B"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#6992", "CYC"), (SubLObject)makeSymbol("S#6993", "CYC"), (SubLObject)makeSymbol("S#6994", "CYC"), (SubLObject)makeSymbol("S#6995", "CYC"), (SubLObject)makeSymbol("S#6996", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#6997", "CYC"), (SubLObject)makeSymbol("S#6998", "CYC"), (SubLObject)makeSymbol("S#6999", "CYC"), (SubLObject)makeSymbol("S#7000", "CYC"), (SubLObject)makeSymbol("S#7001", "CYC"));
        $ic27$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic28$ = makeSymbol("S#6991", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#6959", "CYC"));
        $ic30$ = makeSymbol("S#6992", "CYC");
        $ic31$ = makeSymbol("S#6997", "CYC");
        $ic32$ = makeSymbol("S#6993", "CYC");
        $ic33$ = makeSymbol("S#6998", "CYC");
        $ic34$ = makeSymbol("S#6994", "CYC");
        $ic35$ = makeSymbol("S#6999", "CYC");
        $ic36$ = makeSymbol("S#6995", "CYC");
        $ic37$ = makeSymbol("S#7000", "CYC");
        $ic38$ = makeSymbol("S#6996", "CYC");
        $ic39$ = makeSymbol("S#7001", "CYC");
        $ic40$ = makeKeyword("WINDOW");
        $ic41$ = makeKeyword("SET-A");
        $ic42$ = makeKeyword("SET-B");
        $ic43$ = makeKeyword("WINDOW-A");
        $ic44$ = makeKeyword("WINDOW-B");
        $ic45$ = makeString("Invalid slot ~S for construction function");
        $ic46$ = makeKeyword("BEGIN");
        $ic47$ = makeSymbol("S#7002", "CYC");
        $ic48$ = makeKeyword("SLOT");
        $ic49$ = makeKeyword("END");
        $ic50$ = makeSymbol("S#7004", "CYC");
        $ic51$ = makeSymbol("S#7011", "CYC");
        $ic52$ = makeKeyword("TEST");
        $ic53$ = makeKeyword("OWNER");
        $ic54$ = makeKeyword("CLASSES");
        $ic55$ = makeKeyword("KB");
        $ic56$ = makeKeyword("TINY");
        $ic57$ = makeKeyword("WORKING?");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), (SubLObject)ConsesLow.list((SubLObject)EIGHT_INTEGER, (SubLObject)SEVEN_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER), (SubLObject)FIVE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)EIGHT_INTEGER, (SubLObject)SEVEN_INTEGER, (SubLObject)SIX_INTEGER)), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { TWELVE_INTEGER, ELEVEN_INTEGER, TEN_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), (SubLObject)ConsesLow.list(new SubLObject[] { TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), (SubLObject)FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)EIGHT_INTEGER, (SubLObject)SEVEN_INTEGER, (SubLObject)FIVE_INTEGER)), (SubLObject)makeKeyword("SUCCESS")));
        $ic59$ = makeKeyword("SUCCESS");
        $ic60$ = makeString("Set ~A is not co-extensional with expected set ~A.");
        $ic61$ = makeKeyword("FAILURE");
    }
    
    public static final class $sX6958_native extends SubLStructNative
    {
        public SubLObject $window;
        public SubLObject $set_a;
        public SubLObject $set_b;
        public SubLObject $window_a;
        public SubLObject $window_b;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6958_native() {
            this.$window = (SubLObject)CommonSymbols.NIL;
            this.$set_a = (SubLObject)CommonSymbols.NIL;
            this.$set_b = (SubLObject)CommonSymbols.NIL;
            this.$window_a = (SubLObject)CommonSymbols.NIL;
            this.$window_b = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6958_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$window;
        }
        
        public SubLObject getField3() {
            return this.$set_a;
        }
        
        public SubLObject getField4() {
            return this.$set_b;
        }
        
        public SubLObject getField5() {
            return this.$window_a;
        }
        
        public SubLObject getField6() {
            return this.$window_b;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$window = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$set_a = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$set_b = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$window_a = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$window_b = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6958_native.class, $ic21$, $ic22$, $ic23$, $ic24$, new String[] { "$window", "$set_a", "$set_b", "$window_a", "$window_b" }, $ic25$, $ic26$, $ic27$);
        }
    }
    
    public static final class $f5380$UnaryFunction extends UnaryFunction
    {
        public $f5380$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6959"));
        }
        
        public SubLObject processItem(final SubLObject var69) {
            return f5380(var69);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 273 ms
	
	Decompiled with Procyon 0.5.32.
*/