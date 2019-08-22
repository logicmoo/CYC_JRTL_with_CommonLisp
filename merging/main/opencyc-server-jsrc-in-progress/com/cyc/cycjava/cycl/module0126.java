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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != Types.characterp(var1) : var1;
        return f8387(var1);
    }
    
    public static SubLObject f8387(final SubLObject var1) {
        assert NIL != Types.characterp(var1) : var1;
        return (SubLObject)makeBoolean((NIL != Characters.alphanumericp(var1) && NIL != module0039.f3009(var1)) || NIL != Sequences.find(var1, (SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f8388(final SubLObject var2) {
        return f8389(var2);
    }
    
    public static SubLObject f8389(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isString() && Sequences.length(var2).numGE((SubLObject)TWO_INTEGER) && NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)$ic14$), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f8390(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == f8387(var1));
    }
    
    public static SubLObject f8391(final SubLObject var4) {
        return (SubLObject)makeBoolean($ic17$ == var4 || NIL != f8389(var4));
    }
    
    public static SubLObject f8392(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var5) : var5;
        if (NIL == f8389(var5)) {
            return (SubLObject)NIL;
        }
        if (NIL != $g1496$.getDynamicValue(var6)) {
            return Types.sublisp_null(f8393(var5, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return Types.sublisp_null(f8394(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f8395(final SubLObject var5, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        assert NIL != f8389(var5) : var5;
        assert NIL != Types.booleanp(var7) : var7;
        if (NIL != f8392(var5)) {
            return var5;
        }
        if (NIL != var7) {
            final SubLObject var8 = f8396(var5);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8;
            SubLObject var10;
            while (true) {
                var10 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { $ic24$, module0006.f203(var9) });
                if (NIL != f8392(var10)) {
                    break;
                }
                var9 = module0048.f_1X(var9);
            }
            f8397(var5, var9);
            return var10;
        }
        SubLObject var11;
        SubLObject var12;
        for (var11 = module0048.f_1X(random.random((SubLObject)NINE_INTEGER)), var12 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { $ic24$, module0006.f203(var11) }); NIL == f8392(var12); var12 = Sequences.cconcatenate(module0006.f203(var5), new SubLObject[] { $ic24$, module0006.f203(var11) })) {
            var11 = Numbers.add(Numbers.multiply((SubLObject)TEN_INTEGER, var11), random.random((SubLObject)TEN_INTEGER));
        }
        return var12;
    }
    
    public static SubLObject f8396(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0067.f4884($g1497$.getDynamicValue(var13), var12, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f8397(final SubLObject var12, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return module0067.f4886($g1497$.getDynamicValue(var14), var12, var13);
    }
    
    public static SubLObject f8398(final SubLObject var2) {
        assert NIL != f8389(var2) : var2;
        SubLObject var3 = f8393(var2, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var3 = Sequences.delete(var2, var3, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic30$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f8399(final SubLObject var2) {
        assert NIL != f8389(var2) : var2;
        return f8398(var2).first();
    }
    
    public static SubLObject f8394(final SubLObject var2, SubLObject var15, SubLObject var16) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var2) : var2;
        assert NIL != Types.fixnump(var15) : var15;
        return module0125.f8375(var2, var15, var16);
    }
    
    public static SubLObject f8393(final SubLObject var12, SubLObject var17, SubLObject var18, SubLObject var15, SubLObject var16) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var12) : var12;
        assert NIL != Types.booleanp(var17) : var17;
        assert NIL != Types.booleanp(var18) : var18;
        assert NIL != Types.fixnump(var15) : var15;
        return module0125.f8376(var12, var17, var18, var15, var16);
    }
    
    public static SubLObject f8400(final SubLObject var19, SubLObject var17, SubLObject var15, SubLObject var16) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var19) : var19;
        assert NIL != Types.booleanp(var17) : var17;
        assert NIL != Types.fixnump(var15) : var15;
        return module0125.f8377(var19, var17, var15, var16);
    }
    
    public static SubLObject f8401(final SubLObject var20, SubLObject var17, SubLObject var15, SubLObject var16) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var20) : var20;
        assert NIL != Types.booleanp(var17) : var17;
        assert NIL != Types.fixnump(var15) : var15;
        return module0125.f8378(var20, var17, var15, var16);
    }
    
    public static SubLObject f8402(final SubLObject var21, final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var22) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return module0125.f8379(var21, var2, var17, var15, var16, var22);
    }
    
    public static SubLObject f8403(final SubLObject var21, final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var22) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return module0125.f8380(var21, var2, var17, var15, var16, var22);
    }
    
    public static SubLObject f8404(SubLObject var23, SubLObject var24) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)T;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)ONE_INTEGER;
        }
        return module0125.f8381(var23, var24);
    }
    
    public static SubLObject f8405(final SubLObject var2, SubLObject var17, SubLObject var15, SubLObject var16, SubLObject var23, SubLObject var24) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)T;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)T;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)ONE_INTEGER;
        }
        return module0125.f8382(var2, var17, var15, var16, var23, var24);
    }
    
    public static SubLObject f8406(final SubLObject var25) {
        final SubLObject var26 = f8404((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0052.f3704(var25, var26);
    }
    
    public static SubLObject f8407(final SubLObject var25, final SubLObject var2, SubLObject var27, SubLObject var15, SubLObject var16) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)T;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var28 = f8405(var2, (SubLObject)T, var15, var16, var27, (SubLObject)UNPROVIDED);
        return module0052.f3704(var25, var28);
    }
    
    public static SubLObject f8408(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic55$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic55$);
        var33 = var31.first();
        var31 = var31.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var31;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37_38 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var30, (SubLObject)$ic55$);
            var37_38 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var30, (SubLObject)$ic55$);
            if (NIL == conses_high.member(var37_38, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var37_38 == $ic57$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic55$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic58$, var31);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var31);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : T);
        final SubLObject var41;
        var31 = (var41 = var32);
        final SubLObject var42 = (SubLObject)$ic60$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic61$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)$ic62$, var40))), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var33, var42, (SubLObject)$ic58$, var38), ConsesLow.append(var41, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic64$, var42));
    }
    
    public static SubLObject f8409(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic65$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic65$);
        var33 = var31.first();
        var31 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic65$);
        var34 = var31.first();
        var31 = var31.rest();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = var31;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var49_50 = (SubLObject)NIL;
        while (NIL != var36) {
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic65$);
            var49_50 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic65$);
            if (NIL == conses_high.member(var49_50, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)T;
            }
            if (var49_50 == $ic57$) {
                var35 = var36.first();
            }
            var36 = var36.rest();
        }
        if (NIL != var37 && NIL == var35) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic65$);
        }
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic58$, var31);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var31);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : T);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var31);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : T);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var31);
        final SubLObject var45 = (SubLObject)((NIL != var44) ? conses_high.cadr(var44) : ZERO_INTEGER);
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var31);
        final SubLObject var47 = (SubLObject)((NIL != var46) ? conses_high.cadr(var46) : NIL);
        final SubLObject var48;
        var31 = (var48 = var32);
        final SubLObject var49 = (SubLObject)$ic70$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic61$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var49, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var34, var43, var45, var47, var41))), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var33, var49, (SubLObject)$ic58$, var39), ConsesLow.append(var48, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic64$, var49));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8411() {
        $g1496$ = SubLFiles.defparameter("S#9976", (SubLObject)T);
        $g1497$ = SubLFiles.defparameter("S#10503", module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8412() {
        module0012.f588((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic8$, (SubLObject)$ic3$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f588((SubLObject)$ic10$, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)NIL, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic31$, (SubLObject)$ic12$, (SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)$ic34$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)$ic12$, (SubLObject)$ic36$, (SubLObject)$ic33$, (SubLObject)$ic37$);
        module0012.f368((SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)NIL);
        return (SubLObject)NIL;
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
        $g1496$ = null;
        $g1497$ = null;
        $ic0$ = makeSymbol("CHARACTERP");
        $ic1$ = makeSymbol("VALID-CONSTANT-NAME-CHAR");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("CHAR"));
        $ic4$ = makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CHAR"), (SubLObject)makeSymbol("CHARACTERP")));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic7$ = makeString("-_:");
        $ic8$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic9$ = makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");
        $ic10$ = makeSymbol("VALID-CONSTANT-NAME");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("VALID-CONSTANT-NAME-P"));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("STRING"));
        $ic13$ = makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");
        $ic14$ = makeSymbol("S#10491", "CYC");
        $ic15$ = makeSymbol("VALID-CONSTANT-NAME-P");
        $ic16$ = makeString("Return T iff STRING is a valid name for a constant.");
        $ic17$ = makeKeyword("UNNAMED");
        $ic18$ = makeSymbol("STRINGP");
        $ic19$ = makeSymbol("CONSTANT-NAME-AVAILABLE");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"));
        $ic21$ = makeString("Return T iff NAME is a valid constant name currently available for use.");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic23$ = makeSymbol("BOOLEANP");
        $ic24$ = makeString("-");
        $ic25$ = makeSymbol("UNIQUIFY-CONSTANT-NAME");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10504", "CYC"), (SubLObject)NIL));
        $ic27$ = makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false).");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("VALID-CONSTANT-NAME-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10504", "CYC"), (SubLObject)makeSymbol("BOOLEANP")));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic30$ = makeSymbol("CONSTANT-NAME");
        $ic31$ = makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");
        $ic32$ = makeString("Return a list of constants whose names differ from STRING only by case.");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("VALID-CONSTANT-NAME-P")));
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic35$ = makeSymbol("CONSTANT-NAME-CASE-COLLISION");
        $ic36$ = makeString("Return a constant whose name differs from STRING only by case.");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("CONSTANT-P"));
        $ic38$ = makeSymbol("FIXNUMP");
        $ic39$ = makeSymbol("CONSTANT-COMPLETE-EXACT");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic41$ = makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")));
        $ic43$ = makeSymbol("CONSTANT-COMPLETE");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("S#10489", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic45$ = makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10489", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")));
        $ic47$ = makeSymbol("CONSTANT-APROPOS");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#368", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic49$ = makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#368", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")));
        $ic51$ = makeSymbol("CONSTANT-POSTFIX");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#10300", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic53$ = makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10300", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")));
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6216", "CYC"), (SubLObject)T)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("FORWARD"));
        $ic57$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic58$ = makeKeyword("DONE");
        $ic59$ = makeKeyword("FORWARD");
        $ic60$ = makeUninternedSymbol("US#2A76813");
        $ic61$ = makeSymbol("CLET");
        $ic62$ = makeSymbol("S#10497", "CYC");
        $ic63$ = makeSymbol("S#5129", "CYC");
        $ic64$ = makeSymbol("S#5125", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6216", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6211", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("FORWARD"), (SubLObject)makeKeyword("CASE-SENSITIVE"), (SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"));
        $ic67$ = makeKeyword("CASE-SENSITIVE");
        $ic68$ = makeKeyword("START");
        $ic69$ = makeKeyword("END");
        $ic70$ = makeUninternedSymbol("US#2A76813");
        $ic71$ = makeSymbol("S#10498", "CYC");
    }
    
    public static final class $f8390$UnaryFunction extends UnaryFunction
    {
        public $f8390$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10491"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8390(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/