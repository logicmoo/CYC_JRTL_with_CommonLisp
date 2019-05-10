package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0032 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0032";
    public static final String myFingerPrint = "5bfad75b9bd19a7273b7a553db0b52d070a2d6601df4a60d63d8b319bf99103d";
    private static SubLSymbol $g867$;
    private static SubLSymbol $g868$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    
    public static SubLObject f1709(final SubLObject var1) {
        return (SubLObject)makeBoolean(!var1.isList() && NIL == module0031.f1646(var1));
    }
    
    public static SubLObject f1710(final SubLObject var2) {
        if (var2.isList()) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0031.f1646(var2)) {
            return (SubLObject)$ic4$;
        }
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f1711(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return Functions.funcall(var3, var1, var2);
    }
    
    public static SubLObject f1712(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return module0004.f104(var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1713(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return module0035.f2173(var1, var2, var3);
    }
    
    public static SubLObject f1714(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return module0031.f1688(var1, var2);
    }
    
    public static SubLObject f1715(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        if (NIL != Functions.funcall(var3, var1, var2)) {
            return var2;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1716(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return Sequences.find(var1, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1717(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0031.f1658(var2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !module0030.f1592(var3).eql(module0030.f1592(var5))) {
            Errors.error((SubLObject)$ic7$, var3, var5);
        }
        return module0031.f1689(var1, var2);
    }
    
    public static SubLObject f1718(SubLObject var2, final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f1711(var2, var1, var3);
        if (NIL == var4) {
            var2 = (SubLObject)ConsesLow.list(var1, var2);
        }
        return var2;
    }
    
    public static SubLObject f1719(SubLObject var2, final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f1712(var2, var1, var3);
        if (NIL == var4) {
            if (NIL == var2 && NIL != f1709(var1)) {
                var2 = var1;
            }
            else {
                var2 = (SubLObject)ConsesLow.cons(var1, var2);
                final SubLObject var5 = Sequences.length(var2);
                if (var5.numG($g867$.getGlobalValue())) {
                    var2 = module0076.f5288(var2, var3, var5);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f1720(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        module0031.f1690(var1, var2);
        return var2;
    }
    
    public static SubLObject f1721(SubLObject var2, final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f1711(var2, var1, var3);
        if (NIL != var4) {
            var2 = (SubLObject)NIL;
        }
        return var2;
    }
    
    public static SubLObject f1722(SubLObject var2, final SubLObject var1, final SubLObject var3) {
        var2 = Sequences.delete(var1, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var2)) {
            final SubLObject var4 = var2.first();
            if (NIL != f1709(var4)) {
                var2 = var4;
            }
        }
        return var2;
    }
    
    public static SubLObject f1723(SubLObject var2, final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f1714(var2, var1, var3);
        if (NIL != var4) {
            module0031.f1691(var1, var2);
            final SubLObject var5 = module0031.f1670(var2);
            if (var5.numL($g868$.getGlobalValue())) {
                var2 = module0076.f5287(var2);
            }
        }
        return var2;
    }
    
    public static SubLObject f1724(final SubLObject var9) {
        return (SubLObject)T;
    }
    
    public static SubLObject f1725(final SubLObject var9, final SubLObject var10) {
        if (var9.isList() || NIL != module0031.f1646(var9)) {
            return (SubLObject)T;
        }
        assert NIL != Types.function_spec_p(var10) : var10;
        return (SubLObject)makeBoolean(NIL != f1709(var9) && NIL != Functions.funcall(var10, var9));
    }
    
    public static SubLObject f1726(SubLObject var7, SubLObject var3) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0004.f106(var7) : var7;
        assert NIL != module0030.f1591(var3) : var3;
        if (var7.numG($g867$.getGlobalValue())) {
            return module0031.f1685(var7, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1727(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return var2;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return conses_high.copy_list(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0031.f1704(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1728(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return Sequences.length(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0031.f1670(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1729(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return Types.sublisp_null(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return Numbers.zerop(module0031.f1670(var2));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1730(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return (SubLObject)T;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return (SubLObject)NIL;
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1731(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var4 = f1710(var2);
        if (var4.eql((SubLObject)$ic5$)) {
            return f1711(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic3$)) {
            return f1712(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f1714(var2, var1, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1732(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var4 = f1710(var2);
        if (var4.eql((SubLObject)$ic5$)) {
            return f1711(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic3$)) {
            return f1713(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f1714(var2, var1, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1733(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var4 = f1710(var2);
        if (var4.eql((SubLObject)$ic5$)) {
            return f1715(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic3$)) {
            return f1716(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f1717(var2, var1, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1734(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return var2;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return module0035.f2099(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0031.f1705(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1735(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f1736(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0030.f1591(var3) : var3;
        final SubLObject var4 = f1710(var2);
        if (var4.eql((SubLObject)$ic5$)) {
            return f1718(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic3$)) {
            return f1719(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f1720(var2, var1, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1737(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != module0030.f1591(var3) : var3;
        final SubLObject var4 = f1710(var2);
        if (var4.eql((SubLObject)$ic5$)) {
            return f1721(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic3$)) {
            return f1722(var2, var1, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f1723(var2, var1, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1738(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic4$)) {
            module0031.f1686(var2);
        }
        return f1726((SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1739(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return module0052.f3709((SubLObject)ConsesLow.list(var2));
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return module0052.f3709(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0031.f1692(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1740(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic12$);
        final SubLObject var17 = var16.rest();
        var16 = var16.first();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic12$);
        var18 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic12$);
        var19 = var16.first();
        var16 = var16.rest();
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var16;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var22_23 = (SubLObject)NIL;
        while (NIL != var21) {
            cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)$ic12$);
            var22_23 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)$ic12$);
            if (NIL == conses_high.member(var22_23, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var22 = (SubLObject)T;
            }
            if (var22_23 == $ic14$) {
                var20 = var21.first();
            }
            var21 = var21.rest();
        }
        if (NIL != var22 && NIL == var20) {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic12$);
        }
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var16);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25;
        var16 = (var25 = var17);
        final SubLObject var26 = (SubLObject)$ic16$;
        final SubLObject var27 = (SubLObject)$ic17$;
        final SubLObject var28 = (SubLObject)$ic18$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, var19), (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var26))), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var27, var26), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var28))), (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)$ic24$, ConsesLow.append((SubLObject)((NIL != var24) ? ConsesLow.list(var24) : NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic25$, var27, var28))))), (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var27, var28))), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var28, var18), ConsesLow.append(var25, (SubLObject)NIL)))));
    }
    
    public static SubLObject f1741(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return var2;
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return var2;
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0031.f1696(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1742(final SubLObject var28, final SubLObject var2) {
        final SubLObject var29 = f1710(var2);
        if (var29.eql((SubLObject)$ic5$)) {
            return (SubLObject)$ic30$;
        }
        if (var29.eql((SubLObject)$ic3$)) {
            return var28;
        }
        if (var29.eql((SubLObject)$ic4$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1743(final SubLObject var29) {
        if (var29.isKeyword()) {
            return (SubLObject)$ic15$;
        }
        if (var29.isList()) {
            return var29.rest();
        }
        return module0048.f_1X(var29);
    }
    
    public static SubLObject f1744(final SubLObject var28, final SubLObject var29) {
        if (var29.isKeyword()) {
            return Equality.eq((SubLObject)$ic15$, var29);
        }
        if (var29.isList()) {
            return Types.sublisp_null(var29);
        }
        return Numbers.numE(var29, Sequences.length(var28));
    }
    
    public static SubLObject f1745(final SubLObject var28, final SubLObject var29) {
        if ($ic30$ == var29) {
            return var28;
        }
        if (var29.isList()) {
            return var29.first();
        }
        return Vectors.aref(var28, var29);
    }
    
    public static SubLObject f1746(final SubLObject var29, final SubLObject var1) {
        if ($ic30$ == var29) {
            return (SubLObject)T;
        }
        if (var29.isList()) {
            return (SubLObject)T;
        }
        return module0031.f1697(var1);
    }
    
    public static SubLObject f1747(final SubLObject var30, final SubLObject var2, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var30) : var30;
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        for (var32 = f1741(var2), var33 = (SubLObject)NIL, var33 = f1742(var32, var2); NIL == f1744(var32, var33); var33 = f1743(var33)) {
            var34 = f1745(var32, var33);
            if (NIL != f1746(var33, var34)) {
                Functions.apply(var30, var34, var31);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1748(final SubLObject var35, final SubLObject var2, final SubLObject var7, final SubLObject var3) {
        final SubLObject var36 = f1710(var2);
        if (var36.eql((SubLObject)$ic5$)) {
            return f1749(var35, var2, var7, var3);
        }
        if (var36.eql((SubLObject)$ic3$)) {
            return f1750(var35, var2, var7, var3);
        }
        if (var36.eql((SubLObject)$ic4$)) {
            return f1751(var35, var2, var7, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1749(final SubLObject var35, SubLObject var2, final SubLObject var7, final SubLObject var3) {
        if (!ONE_INTEGER.numE(var7)) {
            return f1752(var35, var2, var7, var3);
        }
        final SubLObject var36 = module0021.f1060(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f1709(var36)) {
            var2 = var36;
        }
        else {
            var2 = (SubLObject)ConsesLow.make_list((SubLObject)ONE_INTEGER, (SubLObject)NIL);
            ConsesLow.rplaca(var2, var36);
        }
        return var2;
    }
    
    public static SubLObject f1750(final SubLObject var35, SubLObject var2, final SubLObject var7, final SubLObject var3) {
        if (ONE_INTEGER.numE(var7)) {
            return f1749(var35, var2, var7, var3);
        }
        var2 = (SubLObject)ConsesLow.make_list(var7, (SubLObject)NIL);
        SubLObject var36;
        SubLObject var37;
        for (var36 = (SubLObject)NIL, var36 = var2; !var36.isAtom(); var36 = var36.rest()) {
            var37 = module0021.f1060(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            ConsesLow.rplaca(var36, var37);
        }
        return var2;
    }
    
    public static SubLObject f1751(final SubLObject var35, final SubLObject var2, final SubLObject var7, final SubLObject var3) {
        return f1752(var35, var2, var7, var3);
    }
    
    public static SubLObject f1752(final SubLObject var35, SubLObject var2, final SubLObject var7, final SubLObject var3) {
        SubLObject var36;
        SubLObject var37;
        for (var36 = (SubLObject)NIL, var36 = (SubLObject)ZERO_INTEGER; var36.numL(var7); var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER)) {
            var37 = module0021.f1060(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var2 = f1736(var37, var2, var3);
        }
        return var2;
    }
    
    public static SubLObject f1753(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (var3.eql((SubLObject)$ic5$)) {
            return (SubLObject)ConsesLow.list(var2);
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return conses_high.copy_list(var2);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return module0076.f5287(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1754(final SubLObject var2) {
        final SubLObject var3 = f1710(var2);
        if (!var3.eql((SubLObject)$ic5$)) {
            if (!var3.eql((SubLObject)$ic3$)) {
                if (var3.eql((SubLObject)$ic4$)) {
                    module0076.f5289(var2);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f1755() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1709", "S#2971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1710", "S#2972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1711", "S#2973", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1712", "S#2974", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1713", "S#2975", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1714", "S#2976", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1715", "S#2977", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1716", "S#2978", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1717", "S#2979", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1718", "S#2980", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1719", "S#2981", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1720", "S#2982", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1721", "S#2983", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1722", "S#2984", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1723", "S#2985", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1724", "S#2986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1725", "S#2987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1726", "S#2988", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1727", "S#2989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1728", "S#2968", 1, 0, false);
        new $f1728$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1729", "S#2990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1730", "S#2991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1731", "S#2992", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1732", "S#2993", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1733", "S#2994", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1734", "S#2995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1735", "S#2996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1736", "S#2997", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1737", "S#2998", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1738", "S#2999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1739", "S#3000", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0032", "f1740", "S#2964");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1741", "S#3001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1742", "S#3002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1743", "S#3003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1744", "S#3004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1745", "S#3005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1746", "S#3006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1747", "S#3007", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1748", "S#3008", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1749", "S#3009", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1750", "S#3010", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1751", "S#3011", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1752", "S#3012", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1753", "S#3013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0032", "f1754", "S#3014", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1756() {
        $g867$ = SubLFiles.deflexical("S#3015", (SubLObject)$ic0$);
        $g868$ = SubLFiles.deflexical("S#3016", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1757() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic2$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic6$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic22$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic25$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic26$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic28$, (SubLObject)$ic29$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f1755();
    }
    
    public void initializeVariables() {
        f1756();
    }
    
    public void runTopLevelForms() {
        f1757();
    }
    
    static {
        me = (SubLFile)new module0032();
        $g867$ = null;
        $g868$ = null;
        $ic0$ = makeInteger(128);
        $ic1$ = makeInteger(110);
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#2972", "CYC"));
        $ic3$ = makeKeyword("LIST");
        $ic4$ = makeKeyword("KEYHASH");
        $ic5$ = makeKeyword("SINGLETON");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#2973", "CYC"), (SubLObject)makeSymbol("S#2974", "CYC"), (SubLObject)makeSymbol("S#2976", "CYC"));
        $ic7$ = makeString("Keyhash test conflict: ~S and ~S");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#2982", "CYC"));
        $ic9$ = makeSymbol("FUNCTION-SPEC-P");
        $ic10$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic11$ = makeSymbol("S#2831", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#3017", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic14$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic15$ = makeKeyword("DONE");
        $ic16$ = makeUninternedSymbol("US#64476E1");
        $ic17$ = makeUninternedSymbol("US#2626F47");
        $ic18$ = makeUninternedSymbol("US#352BA47");
        $ic19$ = makeSymbol("CLET");
        $ic20$ = makeSymbol("S#3001", "CYC");
        $ic21$ = makeSymbol("CDO");
        $ic22$ = makeSymbol("S#3002", "CYC");
        $ic23$ = makeSymbol("S#3003", "CYC");
        $ic24$ = makeSymbol("COR");
        $ic25$ = makeSymbol("S#3004", "CYC");
        $ic26$ = makeSymbol("S#3005", "CYC");
        $ic27$ = makeSymbol("PWHEN");
        $ic28$ = makeSymbol("S#3006", "CYC");
        $ic29$ = makeSymbol("S#2964", "CYC");
        $ic30$ = makeKeyword("NOT-DONE");
    }
    
    public static final class $f1728$UnaryFunction extends UnaryFunction
    {
        public $f1728$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2968"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f1728(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/