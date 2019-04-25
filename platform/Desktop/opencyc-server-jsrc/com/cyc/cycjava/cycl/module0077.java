package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0077 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0077";
    public static final String myFingerPrint = "68393875bfe299bc11fe7ba7e49832fdfa2ca0e89e73296c1246d64a4dc676d5";
    public static SubLSymbol $g1142$;
    public static SubLSymbol $g1143$;
    private static SubLSymbol $g1144$;
    private static SubLSymbol $g1145$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLInteger $ic55$;
    private static final SubLSymbol $ic56$;
    
    public static SubLObject f5300(final SubLObject var1, final SubLObject var2) {
        f5301(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5302(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $set_native.class) ? T : NIL);
    }
    
    public static SubLObject f5303(final SubLObject var1) {
        assert NIL != f5302(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5304(final SubLObject var1) {
        assert NIL != f5302(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5305(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5302(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5306(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5302(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5307(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $set_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic14$)) {
                f5305(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic15$)) {
                f5306(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic16$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5308(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic14$, f5303(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic15$, f5304(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic20$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f5309(final SubLObject var11, final SubLObject var12) {
        return f5308(var11, var12);
    }
    
    public static SubLObject f5301(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic22$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic23$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic24$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(module0030.f1592(f5304(var13)), var2);
            streams_high.write_string((SubLObject)$ic25$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(f5310(var13)), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic26$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic27$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f5311(var13), var2);
            if (f5311(var13).numL((SubLObject)TWENTY_INTEGER)) {
                PrintLow.format(var2, (SubLObject)$ic28$, f5312(var13));
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic23$, var2, $ic29$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f5310(final SubLObject var20) {
        final SubLObject var21 = f5303(var20);
        if (var21.isList()) {
            return (SubLObject)$ic30$;
        }
        if (NIL != module0031.f1646(var21)) {
            return (SubLObject)$ic31$;
        }
        return (SubLObject)$ic32$;
    }
    
    public static SubLObject f5313(SubLObject var22, SubLObject var23) {
        if (var22 == UNPROVIDED) {
            var22 = $g1143$.getGlobalValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != module0030.f1591(var22) : var22;
        assert NIL != Types.integerp(var23) : var23;
        if (var22.isSymbol()) {
            var22 = Symbols.symbol_function(var22);
        }
        final SubLObject var24 = f5307((SubLObject)UNPROVIDED);
        f5306(var24, var22);
        f5305(var24, module0032.f1726(var23, var22));
        return var24;
    }
    
    public static SubLObject f5314(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        final SubLObject var21 = f5313(f5315(var20), (SubLObject)ZERO_INTEGER);
        f5305(var21, module0032.f1727(f5303(var20)));
        return var21;
    }
    
    public static SubLObject f5315(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return f5304(var20);
    }
    
    public static SubLObject f5311(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1728(f5303(var20));
    }
    
    public static SubLObject f5316(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1729(f5303(var20));
    }
    
    public static SubLObject f5317(final SubLObject var25) {
        if (NIL != f5302(var25)) {
            return module0032.f1729(f5303(var25));
        }
        if (var25.isList()) {
            return Types.sublisp_null(var25);
        }
        Errors.error((SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5318(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f5302(var26) && NIL != f5316(var26));
    }
    
    public static SubLObject f5319(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f5302(var26) && NIL == f5316(var26));
    }
    
    public static SubLObject f5320(final SubLObject var27, final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1731(var27, f5303(var20), f5304(var20));
    }
    
    public static SubLObject f5321(final SubLObject var27, final SubLObject var20) {
        if (NIL == f5302(var20)) {
            return (SubLObject)NIL;
        }
        return f5321(var27, var20);
    }
    
    public static SubLObject f5322(final SubLObject var27, final SubLObject var25) {
        if (NIL != f5302(var25)) {
            return f5320(var27, var25);
        }
        if (var25.isList()) {
            return module0004.f104(var27, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        Errors.error((SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5323(final SubLObject var25) {
        if (NIL != f5302(var25)) {
            return f5312(var25);
        }
        if (var25.isList()) {
            return var25;
        }
        Errors.error((SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5324(final SubLObject var27, final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1733(var27, f5303(var20), f5304(var20));
    }
    
    public static SubLObject f5325(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1734(f5303(var20));
    }
    
    public static SubLObject f5326(final SubLObject var27, final SubLObject var20) {
        if (NIL == f5320(var27, var20)) {
            f5305(var20, module0032.f1736(var27, f5303(var20), f5304(var20)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5327(final SubLObject var27, final SubLObject var20) {
        if (NIL != f5320(var27, var20)) {
            f5305(var20, module0032.f1737(var27, f5303(var20), f5304(var20)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5328(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        f5305(var20, module0032.f1738(f5303(var20)));
        return var20;
    }
    
    public static SubLObject f5329(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1739(f5303(var20));
    }
    
    public static SubLObject f5330(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        var33 = var31.first();
        var31 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        var34 = var31.first();
        var31 = var31.rest();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = var31;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var37_38 = (SubLObject)NIL;
        while (NIL != var36) {
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic36$);
            var37_38 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var37_38, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)T;
            }
            if (var37_38 == $ic38$) {
                var35 = var36.first();
            }
            var36 = var36.rest();
        }
        if (NIL != var37 && NIL == var35) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic36$);
        }
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var31);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40;
        var31 = (var40 = var32);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var34), (SubLObject)$ic39$, var39), ConsesLow.append(var40, (SubLObject)NIL));
    }
    
    public static SubLObject f5331(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        var33 = var31.first();
        var31 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic36$);
        var34 = var31.first();
        var31 = var31.rest();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = var31;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var48_49 = (SubLObject)NIL;
        while (NIL != var36) {
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic36$);
            var48_49 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var48_49, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)T;
            }
            if (var48_49 == $ic38$) {
                var35 = var36.first();
            }
            var36 = var36.rest();
        }
        if (NIL != var37 && NIL == var35) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic36$);
        }
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var31);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40;
        var31 = (var40 = var32);
        final SubLObject var41 = (SubLObject)$ic42$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var34)), (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var41), (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var41), (SubLObject)$ic39$, var39), ConsesLow.append(var40, (SubLObject)NIL))));
    }
    
    public static SubLObject f5332(final SubLObject var28, final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic45$);
        final SubLObject var32 = var31.rest();
        var31 = var31.first();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic45$);
        var33 = var31.first();
        var31 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic45$);
        var34 = var31.first();
        var31 = var31.rest();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = var31;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var58_59 = (SubLObject)NIL;
        while (NIL != var36) {
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic45$);
            var58_59 = var36.first();
            var36 = var36.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36, var30, (SubLObject)$ic45$);
            if (NIL == conses_high.member(var58_59, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)T;
            }
            if (var58_59 == $ic38$) {
                var35 = var36.first();
            }
            var36 = var36.rest();
        }
        if (NIL != var37 && NIL == var35) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic45$);
        }
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var31);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40;
        var31 = (var40 = var32);
        final SubLObject var41 = (SubLObject)$ic46$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var34)), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var41), (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var41), (SubLObject)$ic39$, var39), ConsesLow.append(var40, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var41), (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)ConsesLow.list(var33, var41, var39), ConsesLow.append(var40, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic50$, (SubLObject)$ic35$, var41))));
    }
    
    public static SubLObject f5333(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return f5303(var20);
    }
    
    public static SubLObject f5334(final SubLObject var62, final SubLObject var20, SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        assert NIL != f5302(var20) : var20;
        module0032.f1747(var62, f5303(var20), var63);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5335(final SubLObject var13, final SubLObject var2) {
        return f5336(var13, var2);
    }
    
    public static SubLObject f5336(final SubLObject var13, final SubLObject var2) {
        module0021.f1086($g1144$.getGlobalValue(), var2);
        final SubLObject var14 = module0030.f1592(f5315(var13));
        final SubLObject var15 = f5311(var13);
        module0021.f1038(var14, var2);
        module0021.f1038(var15, var2);
        final SubLObject var16 = f5333(var13);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)NIL, var18 = module0032.f1742(var17, var16); NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (NIL != module0032.f1746(var18, var19)) {
                module0021.f1038(var19, var2);
            }
        }
        return var13;
    }
    
    public static SubLObject f5337(final SubLObject var2) {
        SubLObject var3 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        if (var6.eql((SubLObject)EQ) || var6.eql((SubLObject)EQL) || var6.eql((SubLObject)EQUAL) || var6.eql((SubLObject)EQUALP)) {
            var3 = Symbols.symbol_function(var3);
        }
        var5 = f5313(var3, var4);
        f5305(var5, module0032.f1748(var2, f5303(var5), var4, var3));
        return var5;
    }
    
    public static SubLObject f5338(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        var3 = f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0021.f1090(var2);
        f5305(var3, module0021.f1090(var2));
        f5306(var3, Symbols.symbol_function(module0021.f1090(var2)));
        return var3;
    }
    
    public static SubLObject f5312(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        return module0032.f1753(f5303(var20));
    }
    
    public static SubLObject f5339(final SubLObject var20) {
        assert NIL != f5302(var20) : var20;
        f5305(var20, module0032.f1754(f5303(var20)));
        return var20;
    }
    
    public static SubLObject f5340() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5300", "S#6922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5302", "S#6920", 1, 0, false);
        new $f5302$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5303", "S#6923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5304", "S#6924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5305", "S#6925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5306", "S#6926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5307", "S#6927", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5308", "S#6928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5309", "S#6929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5301", "S#6930", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5310", "S#6931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5313", "NEW-SET", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5314", "S#6932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5315", "S#6933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5311", "S#707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5316", "S#6290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5317", "S#6934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5318", "S#6935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5319", "S#6936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5320", "S#3287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5321", "S#6937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5322", "S#6938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5323", "S#6939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5324", "S#6940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5325", "S#6941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5326", "SET-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5327", "S#6942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5328", "S#3288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5329", "S#6943", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0077", "f5330", "S#708");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0077", "f5331", "S#6944");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0077", "f5332", "S#6945");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5333", "S#6946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5334", "S#6947", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5335", "S#6948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5336", "S#6949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5337", "S#6921", 1, 0, false);
        new $f5337$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5338", "S#6950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5312", "S#3290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0077", "f5339", "S#6951", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5341() {
        $g1142$ = SubLFiles.defconstant("S#6952", (SubLObject)$ic0$);
        $g1143$ = SubLFiles.deflexical("S#6953", Symbols.symbol_function((SubLObject)EQL));
        $g1144$ = SubLFiles.defconstant("S#6954", (SubLObject)$ic52$);
        $g1145$ = SubLFiles.defconstant("S#6955", (SubLObject)$ic55$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5342() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic21$));
        module0002.f50((SubLObject)$ic41$, (SubLObject)$ic51$);
        module0021.f1098($g1144$.getGlobalValue(), (SubLObject)$ic53$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1142$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic54$));
        module0021.f1098($g1145$.getGlobalValue(), (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5340();
    }
    
    public void initializeVariables() {
        f5341();
    }
    
    public void runTopLevelForms() {
        f5342();
    }
    
    static {
        me = (SubLFile)new module0077();
        $g1142$ = null;
        $g1143$ = null;
        $g1144$ = null;
        $g1145$ = null;
        $ic0$ = makeSymbol("SET");
        $ic1$ = makeSymbol("S#6920", "CYC");
        $ic2$ = makeInteger(136);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#6956", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("CONTENTS"), (SubLObject)makeKeyword("TEST"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#6923", "CYC"), (SubLObject)makeSymbol("S#6924", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#6925", "CYC"), (SubLObject)makeSymbol("S#6926", "CYC"));
        $ic7$ = makeSymbol("S#6930", "CYC");
        $ic8$ = makeSymbol("S#6922", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#6920", "CYC"));
        $ic10$ = makeSymbol("S#6923", "CYC");
        $ic11$ = makeSymbol("S#6925", "CYC");
        $ic12$ = makeSymbol("S#6924", "CYC");
        $ic13$ = makeSymbol("S#6926", "CYC");
        $ic14$ = makeKeyword("CONTENTS");
        $ic15$ = makeKeyword("TEST");
        $ic16$ = makeString("Invalid slot ~S for construction function");
        $ic17$ = makeKeyword("BEGIN");
        $ic18$ = makeSymbol("S#6927", "CYC");
        $ic19$ = makeKeyword("SLOT");
        $ic20$ = makeKeyword("END");
        $ic21$ = makeSymbol("S#6929", "CYC");
        $ic22$ = makeString("#<");
        $ic23$ = makeKeyword("STREAM");
        $ic24$ = makeString("(");
        $ic25$ = makeString(" ");
        $ic26$ = makeString(")");
        $ic27$ = makeString(" size=");
        $ic28$ = makeString("~&elements: ~S~%");
        $ic29$ = makeKeyword("BASE");
        $ic30$ = makeKeyword("LIST");
        $ic31$ = makeKeyword("KEYHASH");
        $ic32$ = makeKeyword("SINGLETON");
        $ic33$ = makeSymbol("S#2831", "CYC");
        $ic34$ = makeSymbol("INTEGERP");
        $ic35$ = makeString("~A is neither SET-P nor LISTP.");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic38$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = makeKeyword("DONE");
        $ic40$ = makeSymbol("S#2964", "CYC");
        $ic41$ = makeSymbol("S#6946", "CYC");
        $ic42$ = makeUninternedSymbol("US#73E9897");
        $ic43$ = makeSymbol("CLET");
        $ic44$ = makeSymbol("PWHEN");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#6957", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeUninternedSymbol("US#13E9890");
        $ic47$ = makeSymbol("PIF");
        $ic48$ = makeSymbol("LISTP");
        $ic49$ = makeSymbol("CSOME");
        $ic50$ = makeSymbol("ERROR");
        $ic51$ = makeSymbol("S#708", "CYC");
        $ic52$ = makeInteger(60);
        $ic53$ = makeSymbol("S#6921", "CYC");
        $ic54$ = makeSymbol("S#6948", "CYC");
        $ic55$ = makeInteger(67);
        $ic56$ = makeSymbol("S#6950", "CYC");
    }
    
    public static final class $set_native extends SubLStructNative
    {
        public SubLObject $contents;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $set_native() {
            this.$contents = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$set_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$contents;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$contents = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$set_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$contents", "$test" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f5302$UnaryFunction extends UnaryFunction
    {
        public $f5302$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6920"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5302(var3);
        }
    }
    
    public static final class $f5337$UnaryFunction extends UnaryFunction
    {
        public $f5337$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6921"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5337(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/