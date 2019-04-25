package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0126 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0126";
    public static final String myFingerPrint = "01d102641265db1a0c59048ec1c0f1f2bd9ac2c3e4867cb66af5c31d5c07f569";
    public static SubLSymbol $g1496$;
    private static SubLSymbol $g1497$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    
    public static SubLObject f8386(final SubLObject var1) {
        assert module0126.NIL != Types.characterp(var1) : var1;
        return f8387(var1);
    }
    
    public static SubLObject f8387(final SubLObject var1) {
        assert module0126.NIL != Types.characterp(var1) : var1;
        return (SubLObject)SubLObjectFactory.makeBoolean((module0126.NIL != Characters.alphanumericp(var1) && module0126.NIL != module0039.f3009(var1)) || module0126.NIL != Sequences.find(var1, (SubLObject)module0126.$ic7$, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED));
    }
    
    public static SubLObject f8388(final SubLObject var2) {
        return f8389(var2);
    }
    
    public static SubLObject f8389(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isString() && Sequences.length(var2).numGE((SubLObject)module0126.TWO_INTEGER) && module0126.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)module0126.$ic14$), var2, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED));
    }
    
    public static SubLObject f8390(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0126.NIL == f8387(var1));
    }
    
    public static SubLObject f8391(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0126.$ic17$ == var4 || module0126.NIL != f8389(var4));
    }
    
    public static SubLObject f8392(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0126.NIL != Types.stringp(var5) : var5;
        if (module0126.NIL == f8389(var5)) {
            return (SubLObject)module0126.NIL;
        }
        if (module0126.NIL != module0126.$g1496$.getDynamicValue(var6)) {
            return Types.sublisp_null(f8393(var5, (SubLObject)module0126.NIL, (SubLObject)module0126.T, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED));
        }
        return Types.sublisp_null(f8394(var5, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED));
    }
    
    public static SubLObject f8395(final SubLObject var5, SubLObject var7) {
        if (var7 == module0126.UNPROVIDED) {
            var7 = (SubLObject)module0126.NIL;
        }
        assert module0126.NIL != f8389(var5) : var5;
        assert module0126.NIL != Types.booleanp(var7) : var7;
        if (module0126.NIL != f8392(var5)) {
            return var5;
        }
        if (module0126.NIL != var7) {
            final SubLObject var8 = f8396(var5);
            SubLObject var9 = (SubLObject)module0126.NIL;
            var9 = var8;
            SubLObject var10;
            while (true) {
                var10 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { module0126.$ic24$, module0006.f203(var9) });
                if (module0126.NIL != f8392(var10)) {
                    break;
                }
                var9 = module0048.f_1X(var9);
            }
            f8397(var5, var9);
            return var10;
        }
        SubLObject var11;
        SubLObject var12;
        for (var11 = module0048.f_1X(random.random((SubLObject)module0126.NINE_INTEGER)), var12 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { module0126.$ic24$, module0006.f203(var11) }); module0126.NIL == f8392(var12); var12 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { module0126.$ic24$, module0006.f203(var11) })) {
            var11 = Numbers.add(Numbers.multiply((SubLObject)module0126.TEN_INTEGER, var11), random.random((SubLObject)module0126.TEN_INTEGER));
        }
        return var12;
    }
    
    public static SubLObject f8396(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0067.f4884(module0126.$g1497$.getDynamicValue(var13), var12, (SubLObject)module0126.ONE_INTEGER);
    }
    
    public static SubLObject f8397(final SubLObject var12, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return module0067.f4886(module0126.$g1497$.getDynamicValue(var14), var12, var13);
    }
    
    public static SubLObject f8398(final SubLObject var2) {
        assert module0126.NIL != f8389(var2) : var2;
        SubLObject var3 = f8393(var2, (SubLObject)module0126.NIL, (SubLObject)module0126.T, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED);
        var3 = Sequences.delete(var2, var3, Symbols.symbol_function((SubLObject)module0126.EQUAL), Symbols.symbol_function((SubLObject)module0126.$ic30$), (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f8399(final SubLObject var2) {
        assert module0126.NIL != f8389(var2) : var2;
        return f8398(var2).first();
    }
    
    public static SubLObject f8394(final SubLObject var2, SubLObject var15, SubLObject var16) {
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        assert module0126.NIL != Types.stringp(var2) : var2;
        assert module0126.NIL != Types.fixnump(var15) : var15;
        return module0125.f8375(var2, var15, var16);
    }
    
    public static SubLObject f8393(final SubLObject var12, SubLObject var17, SubLObject var18, SubLObject var15, SubLObject var16) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.NIL;
        }
        if (var18 == module0126.UNPROVIDED) {
            var18 = (SubLObject)module0126.NIL;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        assert module0126.NIL != Types.stringp(var12) : var12;
        assert module0126.NIL != Types.booleanp(var17) : var17;
        assert module0126.NIL != Types.booleanp(var18) : var18;
        assert module0126.NIL != Types.fixnump(var15) : var15;
        return module0125.f8376(var12, var17, var18, var15, var16);
    }
    
    public static SubLObject f8400(final SubLObject var19, SubLObject var17, SubLObject var15, SubLObject var16) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.NIL;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        assert module0126.NIL != Types.stringp(var19) : var19;
        assert module0126.NIL != Types.booleanp(var17) : var17;
        assert module0126.NIL != Types.fixnump(var15) : var15;
        return module0125.f8377(var19, var17, var15, var16);
    }
    
    public static SubLObject f8401(final SubLObject var20, SubLObject var17, SubLObject var15, SubLObject var16) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.NIL;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        assert module0126.NIL != Types.stringp(var20) : var20;
        assert module0126.NIL != Types.booleanp(var17) : var17;
        assert module0126.NIL != Types.fixnump(var15) : var15;
        return module0125.f8378(var20, var17, var15, var16);
    }
    
    public static SubLObject f8402(final SubLObject var21, final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var22) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.NIL;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        if (var22 == module0126.UNPROVIDED) {
            var22 = (SubLObject)module0126.NIL;
        }
        return module0125.f8379(var21, var2, var17, var15, var16, var22);
    }
    
    public static SubLObject f8403(final SubLObject var21, final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var22) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.NIL;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        if (var22 == module0126.UNPROVIDED) {
            var22 = (SubLObject)module0126.NIL;
        }
        return module0125.f8380(var21, var2, var17, var15, var16, var22);
    }
    
    public static SubLObject f8404(SubLObject var23, SubLObject var24) {
        if (var23 == module0126.UNPROVIDED) {
            var23 = (SubLObject)module0126.T;
        }
        if (var24 == module0126.UNPROVIDED) {
            var24 = (SubLObject)module0126.ONE_INTEGER;
        }
        return module0125.f8381(var23, var24);
    }
    
    public static SubLObject f8405(final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var23, SubLObject var24) {
        if (var17 == module0126.UNPROVIDED) {
            var17 = (SubLObject)module0126.T;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        if (var23 == module0126.UNPROVIDED) {
            var23 = (SubLObject)module0126.T;
        }
        if (var24 == module0126.UNPROVIDED) {
            var24 = (SubLObject)module0126.ONE_INTEGER;
        }
        return module0125.f8382(var2, var17, var15, var16, var23, var24);
    }
    
    public static SubLObject f8406(final SubLObject var25) {
        final SubLObject var26 = f8404((SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED);
        return module0052.f3704(var25, var26);
    }
    
    public static SubLObject f8407(final SubLObject var25, final SubLObject var2, SubLObject var27, SubLObject var15, SubLObject var16) {
        if (var27 == module0126.UNPROVIDED) {
            var27 = (SubLObject)module0126.T;
        }
        if (var15 == module0126.UNPROVIDED) {
            var15 = (SubLObject)module0126.ZERO_INTEGER;
        }
        if (var16 == module0126.UNPROVIDED) {
            var16 = (SubLObject)module0126.NIL;
        }
        final SubLObject var28 = f8405(var2, (SubLObject)module0126.T, var15, var16, var27, (SubLObject)module0126.UNPROVIDED);
        return module0052.f3704(var25, var28);
    }
    
    public static SubLObject f8408(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0126.$ic55$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)module0126.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0126.$ic55$);
        var33 = var31.first();
        var31 = var31.rest();
        SubLObject var34 = (SubLObject)module0126.NIL;
        SubLObject var35 = var31;
        SubLObject var36 = (SubLObject)module0126.NIL;
        SubLObject var37_38 = (SubLObject)module0126.NIL;
        while (module0126.NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var30, (SubLObject)module0126.$ic55$);
            var37_38 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var30, (SubLObject)module0126.$ic55$);
            if (module0126.NIL == conses_high.member(var37_38, (SubLObject)module0126.$ic56$, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED)) {
                var36 = (SubLObject)module0126.T;
            }
            if (var37_38 == module0126.$ic57$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (module0126.NIL != var36 && module0126.NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0126.$ic55$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic58$, var31);
        final SubLObject var38 = (SubLObject)((module0126.NIL != var37) ? conses_high.cadr(var37) : module0126.NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic59$, var31);
        final SubLObject var40 = (SubLObject)((module0126.NIL != var39) ? conses_high.cadr(var39) : module0126.T);
        final SubLObject var41;
        var31 = (var41 = var32);
        final SubLObject var42 = (SubLObject)module0126.$ic60$;
        return (SubLObject)ConsesLow.list((SubLObject)module0126.$ic61$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0126.$ic62$, var40))), (SubLObject)ConsesLow.listS((SubLObject)module0126.$ic63$, (SubLObject)ConsesLow.list(var33, var42, (SubLObject)module0126.$ic58$, var38), ConsesLow.append(var41, (SubLObject)module0126.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0126.$ic64$, var42));
    }
    
    public static SubLObject f8409(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0126.$ic65$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)module0126.NIL;
        SubLObject var34 = (SubLObject)module0126.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0126.$ic65$);
        var33 = var31.first();
        var31 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0126.$ic65$);
        var34 = var31.first();
        var31 = var31.rest();
        SubLObject var35 = (SubLObject)module0126.NIL;
        SubLObject var36 = var31;
        SubLObject var37 = (SubLObject)module0126.NIL;
        SubLObject var49_50 = (SubLObject)module0126.NIL;
        while (module0126.NIL != var36) {
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)module0126.$ic65$);
            var49_50 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)module0126.$ic65$);
            if (module0126.NIL == conses_high.member(var49_50, (SubLObject)module0126.$ic66$, (SubLObject)module0126.UNPROVIDED, (SubLObject)module0126.UNPROVIDED)) {
                var37 = (SubLObject)module0126.T;
            }
            if (var49_50 == module0126.$ic57$) {
                var35 = var36.first();
            }
            var36 = var36.rest();
        }
        if (module0126.NIL != var37 && module0126.NIL == var35) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0126.$ic65$);
        }
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic58$, var31);
        final SubLObject var39 = (SubLObject)((module0126.NIL != var38) ? conses_high.cadr(var38) : module0126.NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic59$, var31);
        final SubLObject var41 = (SubLObject)((module0126.NIL != var40) ? conses_high.cadr(var40) : module0126.T);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic67$, var31);
        final SubLObject var43 = (SubLObject)((module0126.NIL != var42) ? conses_high.cadr(var42) : module0126.T);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic68$, var31);
        final SubLObject var45 = (SubLObject)((module0126.NIL != var44) ? conses_high.cadr(var44) : module0126.ZERO_INTEGER);
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)module0126.$ic69$, var31);
        final SubLObject var47 = (SubLObject)((module0126.NIL != var46) ? conses_high.cadr(var46) : module0126.NIL);
        final SubLObject var48;
        var31 = (var48 = var32);
        final SubLObject var49 = (SubLObject)module0126.$ic70$;
        return (SubLObject)ConsesLow.list((SubLObject)module0126.$ic61$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var49, (SubLObject)ConsesLow.list((SubLObject)module0126.$ic71$, var34, var43, var45, var47, var41))), (SubLObject)ConsesLow.listS((SubLObject)module0126.$ic63$, (SubLObject)ConsesLow.list(var33, var49, (SubLObject)module0126.$ic58$, var39), ConsesLow.append(var48, (SubLObject)module0126.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0126.$ic64$, var49));
    }
    
    public static SubLObject f8410() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8386", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8387", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8388", "VALID-CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8389", "VALID-CONSTANT-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8390", "S#10491", 1, 0, false);
        new $f8390$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8391", "S#10492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8392", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8395", "UNIQUIFY-CONSTANT-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8396", "S#10493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8397", "S#10494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8398", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8399", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8394", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8393", "CONSTANT-COMPLETE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8400", "CONSTANT-APROPOS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8401", "CONSTANT-POSTFIX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8402", "S#10495", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8403", "S#10496", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8404", "S#10497", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8405", "S#10498", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8406", "S#10499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0126", "f8407", "S#10500", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0126", "f8408", "S#10501");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0126", "f8409", "S#10502");
        return (SubLObject)module0126.NIL;
    }
    
    public static SubLObject f8411() {
        module0126.$g1496$ = SubLFiles.defparameter("S#9976", (SubLObject)module0126.T);
        module0126.$g1497$ = SubLFiles.defparameter("S#10503", module0067.f4880(Symbols.symbol_function((SubLObject)module0126.EQUAL), (SubLObject)module0126.UNPROVIDED));
        return (SubLObject)module0126.NIL;
    }
    
    public static SubLObject f8412() {
        module0012.f588((SubLObject)module0126.$ic1$, (SubLObject)module0126.$ic2$, (SubLObject)module0126.$ic3$, (SubLObject)module0126.$ic4$, (SubLObject)module0126.$ic5$, (SubLObject)module0126.$ic6$);
        module0012.f368((SubLObject)module0126.$ic8$, (SubLObject)module0126.$ic3$, (SubLObject)module0126.$ic9$, (SubLObject)module0126.$ic5$, (SubLObject)module0126.$ic6$);
        module0012.f588((SubLObject)module0126.$ic10$, (SubLObject)module0126.$ic11$, (SubLObject)module0126.$ic12$, (SubLObject)module0126.$ic13$, (SubLObject)module0126.NIL, (SubLObject)module0126.$ic6$);
        module0012.f368((SubLObject)module0126.$ic15$, (SubLObject)module0126.$ic12$, (SubLObject)module0126.$ic16$, (SubLObject)module0126.NIL, (SubLObject)module0126.$ic6$);
        module0012.f368((SubLObject)module0126.$ic19$, (SubLObject)module0126.$ic20$, (SubLObject)module0126.$ic21$, (SubLObject)module0126.$ic22$, (SubLObject)module0126.$ic6$);
        module0012.f368((SubLObject)module0126.$ic25$, (SubLObject)module0126.$ic26$, (SubLObject)module0126.$ic27$, (SubLObject)module0126.$ic28$, (SubLObject)module0126.$ic29$);
        module0012.f368((SubLObject)module0126.$ic31$, (SubLObject)module0126.$ic12$, (SubLObject)module0126.$ic32$, (SubLObject)module0126.$ic33$, (SubLObject)module0126.$ic34$);
        module0012.f368((SubLObject)module0126.$ic35$, (SubLObject)module0126.$ic12$, (SubLObject)module0126.$ic36$, (SubLObject)module0126.$ic33$, (SubLObject)module0126.$ic37$);
        module0012.f368((SubLObject)module0126.$ic39$, (SubLObject)module0126.$ic40$, (SubLObject)module0126.$ic41$, (SubLObject)module0126.$ic42$, (SubLObject)module0126.NIL);
        module0012.f368((SubLObject)module0126.$ic43$, (SubLObject)module0126.$ic44$, (SubLObject)module0126.$ic45$, (SubLObject)module0126.$ic46$, (SubLObject)module0126.NIL);
        module0012.f368((SubLObject)module0126.$ic47$, (SubLObject)module0126.$ic48$, (SubLObject)module0126.$ic49$, (SubLObject)module0126.$ic50$, (SubLObject)module0126.NIL);
        module0012.f368((SubLObject)module0126.$ic51$, (SubLObject)module0126.$ic52$, (SubLObject)module0126.$ic53$, (SubLObject)module0126.$ic54$, (SubLObject)module0126.NIL);
        return (SubLObject)module0126.NIL;
    }
    
    public void declareFunctions() {
        f8410();
    }
    
    public void initializeVariables() {
        f8411();
    }
    
    public void runTopLevelForms() {
        f8412();
    }
    
    static {
        me = (SubLFile)new module0126();
        module0126.$g1496$ = null;
        module0126.$g1497$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CHARACTERP");
        $ic1$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"));
        $ic4$ = SubLObjectFactory.makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP")));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic7$ = SubLObjectFactory.makeString("-_:");
        $ic8$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic9$ = SubLObjectFactory.makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");
        $ic10$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic13$ = SubLObjectFactory.makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");
        $ic14$ = SubLObjectFactory.makeSymbol("S#10491", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $ic16$ = SubLObjectFactory.makeString("Return T iff STRING is a valid name for a constant.");
        $ic17$ = SubLObjectFactory.makeKeyword("UNNAMED");
        $ic18$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic19$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME-AVAILABLE");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic21$ = SubLObjectFactory.makeString("Return T iff NAME is a valid constant name currently available for use.");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic23$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic24$ = SubLObjectFactory.makeString("-");
        $ic25$ = SubLObjectFactory.makeSymbol("UNIQUIFY-CONSTANT-NAME");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10504", "CYC"), (SubLObject)module0126.NIL));
        $ic27$ = SubLObjectFactory.makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false).");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10504", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic30$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $ic31$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");
        $ic32$ = SubLObjectFactory.makeString("Return a list of constants whose names differ from STRING only by case.");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic35$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME-CASE-COLLISION");
        $ic36$ = SubLObjectFactory.makeString("Return a constant whose name differs from STRING only by case.");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $ic38$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic39$ = SubLObjectFactory.makeSymbol("CONSTANT-COMPLETE-EXACT");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0126.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic41$ = SubLObjectFactory.makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $ic43$ = SubLObjectFactory.makeSymbol("CONSTANT-COMPLETE");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10489", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0126.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic45$ = SubLObjectFactory.makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $ic47$ = SubLObjectFactory.makeSymbol("CONSTANT-APROPOS");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#368", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0126.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#368", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $ic51$ = SubLObjectFactory.makeSymbol("CONSTANT-POSTFIX");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0126.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic53$ = SubLObjectFactory.makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6216", "CYC"), (SubLObject)module0126.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $ic57$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic58$ = SubLObjectFactory.makeKeyword("DONE");
        $ic59$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic60$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic61$ = SubLObjectFactory.makeSymbol("CLET");
        $ic62$ = SubLObjectFactory.makeSymbol("S#10497", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#5129", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#5125", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6216", "CYC"), (SubLObject)module0126.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6211", "CYC"), (SubLObject)module0126.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0126.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"));
        $ic67$ = SubLObjectFactory.makeKeyword("CASE-SENSITIVE");
        $ic68$ = SubLObjectFactory.makeKeyword("START");
        $ic69$ = SubLObjectFactory.makeKeyword("END");
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic71$ = SubLObjectFactory.makeSymbol("S#10498", "CYC");
    }
    
    public static final class $f8390$UnaryFunction extends UnaryFunction
    {
        public $f8390$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10491"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0126.f8390(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0126.class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/