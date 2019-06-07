package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0137 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0137";
    public static final String myFingerPrint = "dc31d480e62a3f1ba3e5e6d67d41e9dcf2935a4899afa382ff261c3b9a1e368c";
    public static SubLSymbol $g1599$;
    private static SubLSymbol $g1600$;
    public static SubLSymbol $g1601$;
    public static SubLSymbol $g1602$;
    private static SubLSymbol $g1603$;
    private static SubLSymbol $g1604$;
    public static SubLSymbol $g1605$;
    public static SubLSymbol $g1606$;
    public static SubLSymbol $g1607$;
    public static SubLSymbol $g1608$;
    public static SubLSymbol $g1609$;
    private static SubLSymbol $g1610$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
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
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLObject $ic136$;
    
    public static SubLObject f8883(final SubLObject var1, final SubLObject var2) {
        f8884(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8885(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11098_native.class) ? T : NIL);
    }
    
    public static SubLObject f8886(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8887(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8888(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8889(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8890(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8891(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f8892(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f8893(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f8894(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f8895(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f8896(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f8897(final SubLObject var1) {
        assert NIL != f8885(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f8898(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8899(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8900(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8901(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8902(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8903(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f8904(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f8905(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f8906(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f8907(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f8908(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f8909(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8885(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f8910(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11098_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic33$)) {
                f8898(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f8899(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f8900(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f8901(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f8902(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f8903(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f8904(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f8905(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f8906(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f8907(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f8908(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f8909(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8911(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic33$, f8886(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic34$, f8887(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic35$, f8888(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic36$, f8889(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic37$, f8890(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic38$, f8891(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic39$, f8892(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic40$, f8893(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic41$, f8894(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic42$, f8895(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic43$, f8896(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic44$, f8897(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic47$, (SubLObject)TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8912(final SubLObject var11, final SubLObject var12) {
        return f8911(var11, var12);
    }
    
    public static SubLObject f8884(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        if (NIL != f8885(var13)) {
            PrintLow.format(var2, (SubLObject)$ic51$);
            print_high.prin1(f8886(var13), var2);
            PrintLow.format(var2, (SubLObject)$ic52$);
        }
        else {
            compatibility.default_struct_print_function(var13, var2, var14);
        }
        return var13;
    }
    
    public static SubLObject f8913(final SubLObject var15) {
        assert NIL != module0173.f10955(var15) : var15;
        final SubLObject var16 = f8910((SubLObject)UNPROVIDED);
        f8898(var16, var15);
        f8909(var16, module0067.f4880((SubLObject)EQL, (SubLObject)ZERO_INTEGER));
        return var16;
    }
    
    public static SubLObject f8914(final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == f8915(var17)) {
            final SubLObject var20 = module0136.$g1591$.getDynamicValue(var19);
            if (var20.eql((SubLObject)$ic54$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var17, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var20.eql((SubLObject)$ic57$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic58$, (SubLObject)$ic55$, var17, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var20.eql((SubLObject)$ic59$)) {
                Errors.warn((SubLObject)$ic55$, var17, (SubLObject)$ic56$);
            }
            else {
                Errors.warn((SubLObject)$ic60$, module0136.$g1591$.getDynamicValue(var19));
                Errors.cerror((SubLObject)$ic58$, (SubLObject)$ic55$, var17, (SubLObject)$ic56$);
            }
        }
        if (NIL != module0136.f8864() && NIL == f8885(var16)) {
            final SubLObject var20 = module0136.$g1591$.getDynamicValue(var19);
            if (var20.eql((SubLObject)$ic54$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var16, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var20.eql((SubLObject)$ic57$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var20.eql((SubLObject)$ic59$)) {
                Errors.warn((SubLObject)$ic55$, var16, (SubLObject)$ic1$);
            }
            else {
                Errors.warn((SubLObject)$ic60$, module0136.$g1591$.getDynamicValue(var19));
                Errors.cerror((SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic1$);
            }
        }
        if (var17.eql((SubLObject)$ic33$)) {
            f8898(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic34$)) {
            f8899(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic35$)) {
            f8900(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic36$)) {
            f8901(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic37$)) {
            f8902(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic38$)) {
            f8903(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic39$)) {
            f8904(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic61$)) {
            f8905(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic41$)) {
            f8906(var16, var18);
        }
        else if (var17.eql((SubLObject)$ic42$)) {
            f8907(var16, var18);
        }
        else {
            module0067.f4886(f8897(var16), var17, var18);
        }
        return var16;
    }
    
    public static SubLObject f8916(final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == f8885(var16)) {
            final SubLObject var19 = module0136.$g1591$.getDynamicValue(var18);
            if (var19.eql((SubLObject)$ic54$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var16, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var19.eql((SubLObject)$ic57$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var19.eql((SubLObject)$ic59$)) {
                Errors.warn((SubLObject)$ic55$, var16, (SubLObject)$ic1$);
            }
            else {
                Errors.warn((SubLObject)$ic60$, module0136.$g1591$.getDynamicValue(var18));
                Errors.cerror((SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic1$);
            }
        }
        if (var17.eql((SubLObject)$ic33$)) {
            return f8886(var16);
        }
        if (var17.eql((SubLObject)$ic34$)) {
            return f8887(var16);
        }
        if (var17.eql((SubLObject)$ic35$)) {
            return f8888(var16);
        }
        if (var17.eql((SubLObject)$ic36$)) {
            return f8889(var16);
        }
        if (var17.eql((SubLObject)$ic37$)) {
            return f8890(var16);
        }
        if (var17.eql((SubLObject)$ic38$)) {
            return f8891(var16);
        }
        if (var17.eql((SubLObject)$ic39$)) {
            return f8892(var16);
        }
        if (var17.eql((SubLObject)$ic61$)) {
            return f8893(var16);
        }
        if (var17.eql((SubLObject)$ic41$)) {
            return f8894(var16);
        }
        if (var17.eql((SubLObject)$ic42$)) {
            return f8895(var16);
        }
        return module0067.f4885(f8897(var16), var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8917(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8886(var16);
    }
    
    public static SubLObject f8918(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8887(var16);
    }
    
    public static SubLObject f8919(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8888(var16);
    }
    
    public static SubLObject f8920(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8889(var16);
    }
    
    public static SubLObject f8921(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8890(var16);
    }
    
    public static SubLObject f8922(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8891(var16);
    }
    
    public static SubLObject f8923(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8892(var16);
    }
    
    public static SubLObject f8924(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8893(var16);
    }
    
    public static SubLObject f8925(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8894(var16);
    }
    
    public static SubLObject f8926(final SubLObject var16) {
        assert NIL != f8885(var16) : var16;
        return f8895(var16);
    }
    
    public static SubLObject f8927() {
        if (NIL != module0067.f4852($g1601$.getGlobalValue())) {
            $g1601$.setGlobalValue(module0084.f5780($g1601$.getGlobalValue()));
            Errors.warn((SubLObject)$ic63$);
        }
        else if (NIL == module0035.f2292($g1601$.getGlobalValue())) {
            if (NIL == $g1601$.getGlobalValue()) {
                Errors.warn((SubLObject)$ic64$);
            }
            else {
                Errors.warn((SubLObject)$ic65$, (SubLObject)Types.type_of($g1601$.getGlobalValue()));
            }
        }
        return (SubLObject)$ic66$;
    }
    
    public static SubLObject f8928(final SubLObject var13) {
        return f8885(var13);
    }
    
    public static SubLObject f8929() {
        $g1601$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8930() {
        return (SubLObject)T;
    }
    
    public static SubLObject f8931() {
        return $g1601$.getGlobalValue();
    }
    
    public static SubLObject f8932(final SubLObject var20, final SubLObject var16) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == f8933(var20)) {
            final SubLObject var22 = module0136.$g1591$.getDynamicValue(var21);
            if (var22.eql((SubLObject)$ic54$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var20, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var22.eql((SubLObject)$ic57$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic58$, (SubLObject)$ic55$, var20, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var22.eql((SubLObject)$ic59$)) {
                Errors.warn((SubLObject)$ic55$, var20, (SubLObject)$ic67$);
            }
            else {
                Errors.warn((SubLObject)$ic60$, module0136.$g1591$.getDynamicValue(var21));
                Errors.cerror((SubLObject)$ic58$, (SubLObject)$ic55$, var20, (SubLObject)$ic67$);
            }
        }
        if (NIL != module0136.f8864() && NIL == f8928(var16)) {
            final SubLObject var22 = module0136.$g1591$.getDynamicValue(var21);
            if (var22.eql((SubLObject)$ic54$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic55$, var16, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var22.eql((SubLObject)$ic57$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var22.eql((SubLObject)$ic59$)) {
                Errors.warn((SubLObject)$ic55$, var16, (SubLObject)$ic68$);
            }
            else {
                Errors.warn((SubLObject)$ic60$, module0136.$g1591$.getDynamicValue(var21));
                Errors.cerror((SubLObject)$ic58$, (SubLObject)$ic55$, var16, (SubLObject)$ic68$);
            }
        }
        $g1601$.setGlobalValue(conses_high.acons(var20, var16, $g1601$.getGlobalValue()));
        module0244.f15726();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8934(final SubLObject var20) {
        $g1601$.setGlobalValue(module0035.f2310($g1601$.getGlobalValue(), var20, (SubLObject)UNPROVIDED));
        module0244.f15726();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8935(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic69$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)$ic70$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list(var29, var26, (SubLObject)$ic72$, (SubLObject)$ic73$, var27), (SubLObject)ConsesLow.list((SubLObject)$ic74$, var29), ConsesLow.append(var28, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8936() {
        return module0035.f2062(f8931());
    }
    
    public static SubLObject f8937() {
        return module0035.f2319(f8931());
    }
    
    public static SubLObject f8933(final SubLObject var13) {
        return module0173.f10955(var13);
    }
    
    public static SubLObject f8938(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic76$);
    }
    
    public static SubLObject f8939(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic77$);
    }
    
    public static SubLObject f8940(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic78$);
    }
    
    public static SubLObject f8941(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic79$);
    }
    
    public static SubLObject f8942(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic80$);
    }
    
    public static SubLObject f8943(final SubLObject var30) {
        return (SubLObject)makeBoolean(var30 == $ic76$ || var30 == $ic77$ || var30 == $ic80$);
    }
    
    public static SubLObject f8944(final SubLObject var30) {
        return module0004.f104(var30, $g1602$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8945(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic69$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)$ic81$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var29), (SubLObject)ConsesLow.listS((SubLObject)$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic86$, var29))), ConsesLow.append(var28, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8946(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic69$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)$ic87$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var29), (SubLObject)ConsesLow.listS((SubLObject)$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, var29)), ConsesLow.append(var28, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8947(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic89$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic89$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic89$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)$ic90$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var29), (SubLObject)ConsesLow.listS((SubLObject)$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic86$, var29))), ConsesLow.append(var28, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic89$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8948(final SubLObject var41) {
        SubLObject var42 = var41;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            final SubLObject var44 = var43.first();
            final SubLObject var45 = conses_high.second(var43);
            module0067.f4886($g1603$.getGlobalValue(), var44, var45);
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8949() {
        return $g1603$.getGlobalValue();
    }
    
    public static SubLObject f8950(final SubLObject var17, final SubLObject var45) {
        module0067.f4886($g1603$.getGlobalValue(), var17, var45);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8915(final SubLObject var17) {
        return module0067.f4885($g1603$.getGlobalValue(), var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8951(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic116$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic116$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic116$);
        var27 = var24.first();
        var24 = var24.rest();
        final SubLObject var28 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic116$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var29;
            var24 = (var29 = var25);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic117$, (SubLObject)ConsesLow.list(var26, var27, (SubLObject)$ic118$, var28), ConsesLow.append(var29, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic116$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8952() {
        return $g1604$.getGlobalValue();
    }
    
    public static SubLObject f8953(final SubLObject var17) {
        return module0004.f104(var17, $g1604$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8954(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic120$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic120$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)$ic120$);
        var24 = var24.rest();
        if (NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic121$, (SubLObject)ConsesLow.list(var26, (SubLObject)$ic122$, var27), ConsesLow.append(var28, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic120$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8955(SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var20) {
            return $g1605$.getDynamicValue(var21);
        }
        if (NIL != f8885($g1605$.getDynamicValue(var21)) && var20.eql(module0244.f15736($g1605$.getDynamicValue(var21)))) {
            return $g1605$.getDynamicValue(var21);
        }
        final SubLObject var22 = module0035.f2294(f8931(), var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var22) {
            return module0136.f8872((SubLObject)ZERO_INTEGER, (SubLObject)$ic123$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f8956(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic124$);
        var25 = var24.first();
        final SubLObject var26;
        var24 = (var26 = var24.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic125$, var25)), ConsesLow.append(var26, (SubLObject)NIL));
    }
    
    public static SubLObject f8957(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic124$);
        var25 = var24.first();
        final SubLObject var26;
        var24 = (var26 = var24.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic125$, (SubLObject)ConsesLow.listS((SubLObject)$ic126$, var25, var25, (SubLObject)$ic127$))), ConsesLow.append(var26, (SubLObject)NIL));
    }
    
    public static SubLObject f8958(final SubLObject var58) {
        if (var58.eql($g1607$.getGlobalValue())) {
            return (SubLObject)T;
        }
        if (var58.eql($g1608$.getGlobalValue())) {
            return (SubLObject)NIL;
        }
        if (NIL != module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic130$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {}
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8959(final SubLObject var58) {
        return (SubLObject)makeBoolean(var58.eql($g1607$.getGlobalValue()) || var58.eql($g1608$.getGlobalValue()));
    }
    
    public static SubLObject f8960() {
        SubLObject var42 = f8931();
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            SubLObject var45;
            final SubLObject var44 = var45 = var43;
            SubLObject var46 = (SubLObject)NIL;
            SubLObject var47 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic131$);
            var46 = var45.first();
            var45 = (var47 = var45.rest());
            final SubLObject var48 = module0244.f15736(var47);
            if (NIL == module0173.f10969(var48)) {
                f8934(var47);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        f8961();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8961() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = $g1610$.currentBinding(var19);
        try {
            $g1610$.bind(f8962(), var19);
            module0035.f2320(f8931(), Symbols.symbol_function((SubLObject)$ic132$));
        }
        finally {
            $g1610$.rebind(var20, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8963(final SubLObject var64, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        return module0035.f2385(var64, var65, $g1610$.getDynamicValue(var66), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8962() {
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = f8931();
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            SubLObject var70;
            final SubLObject var69 = var70 = var68;
            SubLObject var71 = (SubLObject)NIL;
            SubLObject var72 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)$ic131$);
            var71 = var70.first();
            var70 = (var72 = var70.rest());
            final SubLObject var73 = module0244.f15736(var72);
            final SubLObject var74 = module0244.f15766(var72);
            final SubLObject var75 = Hashtables.hash_table_size(var74);
            var66 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var73, var75), var66);
            var67 = var67.rest();
            var68 = var67.first();
        }
        var66 = Sort.stable_sort(var66, Symbols.symbol_function((SubLObject)$ic133$), Symbols.symbol_function((SubLObject)$ic134$));
        SubLObject var76 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic135$), var66);
        var76 = (SubLObject)ConsesLow.cons($ic136$, Sequences.delete($ic136$, var76, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var76;
    }
    
    public static SubLObject f8964() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8883", "S#11105", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8885", "S#11099", 1, 0, false);
        new $f8885$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8886", "S#11106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8887", "S#11107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8888", "S#11108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8889", "S#11109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8890", "S#11110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8891", "S#11111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8892", "S#11112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8893", "S#11113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8894", "S#11114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8895", "S#11115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8896", "S#11116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8897", "S#11117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8898", "S#11118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8899", "S#11119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8900", "S#11120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8901", "S#11121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8902", "S#11122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8903", "S#11123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8904", "S#11124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8905", "S#11125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8906", "S#11126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8907", "S#11127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8908", "S#11128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8909", "S#11129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8910", "S#11130", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8911", "S#11131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8912", "S#11132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8884", "S#11133", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8913", "S#11134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8914", "S#11135", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8916", "S#11136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8917", "S#11137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8918", "S#11138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8919", "S#11139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8920", "S#11140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8921", "S#11141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8922", "S#11142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8923", "S#11143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8924", "S#11144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8925", "S#11145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8926", "S#11146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8927", "S#11147", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8928", "S#11148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8929", "S#11149", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8930", "S#11150", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8931", "S#11151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8932", "S#11152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8934", "S#11153", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8935", "S#11154");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8936", "S#11155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8937", "S#11156", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8933", "S#11157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8938", "S#11158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8939", "S#11159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8940", "S#11160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8941", "S#11161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8942", "S#11162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8943", "S#11163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8944", "S#11164", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8945", "S#11165");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8946", "S#11166");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8947", "S#11167");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8948", "S#11168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8949", "S#11169", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8950", "S#11170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8915", "S#11171", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8951", "S#11172");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8952", "S#11173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8953", "S#11174", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8954", "S#11175");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8955", "S#11102", 0, 1, false);
        new $f8955$ZeroArityFunction();
        new $f8955$UnaryFunction();
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8956", "S#11176");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0137", "f8957", "S#11177");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8958", "S#11178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8959", "S#11179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8960", "S#11180", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8961", "S#11181", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8963", "S#11182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0137", "f8962", "S#11183", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8965() {
        $g1599$ = SubLFiles.defconstant("S#11184", (SubLObject)$ic0$);
        $g1600$ = SubLFiles.deflexical("S#11185", Symbols.symbol_function((SubLObject)EQL));
        $g1601$ = SubLFiles.deflexical("S#11186", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic62$)) ? $g1601$.getGlobalValue() : NIL));
        $g1602$ = SubLFiles.deflexical("S#11187", (SubLObject)$ic75$);
        $g1603$ = SubLFiles.deflexical("S#11188", (NIL != Symbols.boundp((SubLObject)$ic91$)) ? $g1603$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g1604$ = SubLFiles.deflexical("S#11189", (SubLObject)$ic119$);
        $g1605$ = SubLFiles.defparameter("S#11190", (SubLObject)NIL);
        $g1606$ = SubLFiles.defvar("S#11191", (SubLObject)NIL);
        $g1607$ = SubLFiles.deflexical("S#11192", $ic128$);
        $g1608$ = SubLFiles.deflexical("S#11193", $ic129$);
        $g1609$ = SubLFiles.defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", (SubLObject)T);
        $g1610$ = SubLFiles.defparameter("S#11194", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8966() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1599$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1599$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0003.f57((SubLObject)$ic62$);
        module0003.f57((SubLObject)$ic91$);
        f8948((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic67$), ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic92$), ConsesLow.list((SubLObject)$ic93$, (SubLObject)$ic94$), ConsesLow.list((SubLObject)$ic38$, (SubLObject)$ic95$), ConsesLow.list((SubLObject)$ic39$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic97$, (SubLObject)$ic98$), ConsesLow.list((SubLObject)$ic99$, (SubLObject)$ic98$), ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic98$), ConsesLow.list((SubLObject)$ic61$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic41$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic42$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic101$, (SubLObject)$ic102$), ConsesLow.list((SubLObject)$ic34$, (SubLObject)$ic103$), ConsesLow.list((SubLObject)$ic104$, (SubLObject)$ic98$), ConsesLow.list((SubLObject)$ic105$, (SubLObject)$ic102$), ConsesLow.list((SubLObject)$ic106$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic107$, (SubLObject)$ic96$), ConsesLow.list((SubLObject)$ic108$, (SubLObject)$ic109$), ConsesLow.list((SubLObject)$ic110$, (SubLObject)$ic111$), ConsesLow.list((SubLObject)$ic37$, (SubLObject)$ic102$), ConsesLow.list((SubLObject)$ic112$, (SubLObject)$ic113$), ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic114$), ConsesLow.list((SubLObject)$ic115$, (SubLObject)$ic103$) }));
        module0012.f419((SubLObject)$ic132$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8964();
    }
    
    public void initializeVariables() {
        f8965();
    }
    
    public void runTopLevelForms() {
        f8966();
    }
    
    static {
        me = (SubLFile)new module0137();
        $g1599$ = null;
        $g1600$ = null;
        $g1601$ = null;
        $g1602$ = null;
        $g1603$ = null;
        $g1604$ = null;
        $g1605$ = null;
        $g1606$ = null;
        $g1607$ = null;
        $g1608$ = null;
        $g1609$ = null;
        $g1610$ = null;
        $ic0$ = makeSymbol("S#11098", "CYC");
        $ic1$ = makeSymbol("S#11099", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#11195", "CYC"), makeSymbol("S#11196", "CYC"), makeSymbol("S#10129", "CYC"), makeSymbol("S#11197", "CYC"), makeSymbol("S#11198", "CYC"), makeSymbol("S#11199", "CYC"), makeSymbol("S#11097", "CYC"), makeSymbol("S#11200", "CYC"), makeSymbol("S#11201", "CYC"), makeSymbol("S#11202", "CYC"), makeSymbol("S#11203", "CYC"), makeSymbol("S#11204", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINK-PRED"), makeKeyword("ACCESSIBLE-LINK-PREDS"), makeKeyword("GRAPH"), makeKeyword("LINK-STYLE"), makeKeyword("INDEX-ARG"), makeKeyword("MODULE-TYPE"), makeKeyword("TYPE-TEST"), makeKeyword("PATH-TERMINATING-MARK-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("VAR-BINDINGS"), makeKeyword("MISC-PROPERTIES") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#11106", "CYC"), makeSymbol("S#11107", "CYC"), makeSymbol("S#11108", "CYC"), makeSymbol("S#11109", "CYC"), makeSymbol("S#11110", "CYC"), makeSymbol("S#11111", "CYC"), makeSymbol("S#11112", "CYC"), makeSymbol("S#11113", "CYC"), makeSymbol("S#11114", "CYC"), makeSymbol("S#11115", "CYC"), makeSymbol("S#11116", "CYC"), makeSymbol("S#11117", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#11118", "CYC"), makeSymbol("S#11119", "CYC"), makeSymbol("S#11120", "CYC"), makeSymbol("S#11121", "CYC"), makeSymbol("S#11122", "CYC"), makeSymbol("S#11123", "CYC"), makeSymbol("S#11124", "CYC"), makeSymbol("S#11125", "CYC"), makeSymbol("S#11126", "CYC"), makeSymbol("S#11127", "CYC"), makeSymbol("S#11128", "CYC"), makeSymbol("S#11129", "CYC") });
        $ic6$ = makeSymbol("S#11133", "CYC");
        $ic7$ = makeSymbol("S#11105", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#11099", "CYC"));
        $ic9$ = makeSymbol("S#11106", "CYC");
        $ic10$ = makeSymbol("S#11118", "CYC");
        $ic11$ = makeSymbol("S#11107", "CYC");
        $ic12$ = makeSymbol("S#11119", "CYC");
        $ic13$ = makeSymbol("S#11108", "CYC");
        $ic14$ = makeSymbol("S#11120", "CYC");
        $ic15$ = makeSymbol("S#11109", "CYC");
        $ic16$ = makeSymbol("S#11121", "CYC");
        $ic17$ = makeSymbol("S#11110", "CYC");
        $ic18$ = makeSymbol("S#11122", "CYC");
        $ic19$ = makeSymbol("S#11111", "CYC");
        $ic20$ = makeSymbol("S#11123", "CYC");
        $ic21$ = makeSymbol("S#11112", "CYC");
        $ic22$ = makeSymbol("S#11124", "CYC");
        $ic23$ = makeSymbol("S#11113", "CYC");
        $ic24$ = makeSymbol("S#11125", "CYC");
        $ic25$ = makeSymbol("S#11114", "CYC");
        $ic26$ = makeSymbol("S#11126", "CYC");
        $ic27$ = makeSymbol("S#11115", "CYC");
        $ic28$ = makeSymbol("S#11127", "CYC");
        $ic29$ = makeSymbol("S#11116", "CYC");
        $ic30$ = makeSymbol("S#11128", "CYC");
        $ic31$ = makeSymbol("S#11117", "CYC");
        $ic32$ = makeSymbol("S#11129", "CYC");
        $ic33$ = makeKeyword("LINK-PRED");
        $ic34$ = makeKeyword("ACCESSIBLE-LINK-PREDS");
        $ic35$ = makeKeyword("GRAPH");
        $ic36$ = makeKeyword("LINK-STYLE");
        $ic37$ = makeKeyword("INDEX-ARG");
        $ic38$ = makeKeyword("MODULE-TYPE");
        $ic39$ = makeKeyword("TYPE-TEST");
        $ic40$ = makeKeyword("PATH-TERMINATING-MARK-FN");
        $ic41$ = makeKeyword("MARKING-FN");
        $ic42$ = makeKeyword("UNMARKING-FN");
        $ic43$ = makeKeyword("VAR-BINDINGS");
        $ic44$ = makeKeyword("MISC-PROPERTIES");
        $ic45$ = makeString("Invalid slot ~S for construction function");
        $ic46$ = makeKeyword("BEGIN");
        $ic47$ = makeSymbol("S#11130", "CYC");
        $ic48$ = makeKeyword("SLOT");
        $ic49$ = makeKeyword("END");
        $ic50$ = makeSymbol("S#11132", "CYC");
        $ic51$ = makeString("#<SBHL-MODULE: ");
        $ic52$ = makeString(">");
        $ic53$ = makeSymbol("FORT-P");
        $ic54$ = makeKeyword("ERROR");
        $ic55$ = makeString("~A is not a ~A");
        $ic56$ = makeSymbol("S#11171", "CYC");
        $ic57$ = makeKeyword("CERROR");
        $ic58$ = makeString("continue anyway");
        $ic59$ = makeKeyword("WARN");
        $ic60$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic61$ = makeKeyword("PATH-TERMINATING-MARK?-FN");
        $ic62$ = makeSymbol("S#11186", "CYC");
        $ic63$ = makeString(";;; SBHL module store has been converted to new format.~&");
        $ic64$ = makeString(";;; No KB has been loaded, SBHL module store format is fine.~&");
        $ic65$ = makeString(";;; Unexpected SBHL module store format ~A ... SBHL may not work.~&");
        $ic66$ = makeKeyword("CHECKED");
        $ic67$ = makeSymbol("S#11157", "CYC");
        $ic68$ = makeSymbol("S#11148", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11205", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic70$ = makeUninternedSymbol("US#3165895");
        $ic71$ = makeSymbol("DO-ALIST");
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#11151", "CYC"));
        $ic73$ = makeKeyword("DONE");
        $ic74$ = makeSymbol("IGNORE");
        $ic75$ = ConsesLow.list((SubLObject)makeKeyword("SIMPLE-REFLEXIVE"), (SubLObject)makeKeyword("SIMPLE-NON-REFLEXIVE"), (SubLObject)makeKeyword("TRANSFERS-THROUGH"), (SubLObject)makeKeyword("DISJOINS"), (SubLObject)makeKeyword("TIME"));
        $ic76$ = makeKeyword("SIMPLE-REFLEXIVE");
        $ic77$ = makeKeyword("SIMPLE-NON-REFLEXIVE");
        $ic78$ = makeKeyword("TRANSFERS-THROUGH");
        $ic79$ = makeKeyword("DISJOINS");
        $ic80$ = makeKeyword("TIME");
        $ic81$ = makeUninternedSymbol("US#12F0EC7");
        $ic82$ = makeSymbol("S#11154", "CYC");
        $ic83$ = makeSymbol("PWHEN");
        $ic84$ = makeSymbol("S#11206", "CYC");
        $ic85$ = makeSymbol("CLET");
        $ic86$ = makeSymbol("S#11101", "CYC");
        $ic87$ = makeUninternedSymbol("US#12F0EC7");
        $ic88$ = makeSymbol("S#11207", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic90$ = makeUninternedSymbol("US#12F0EC7");
        $ic91$ = makeSymbol("S#11188", "CYC");
        $ic92$ = makeSymbol("S#11179", "CYC");
        $ic93$ = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
        $ic94$ = makeSymbol("S#3795", "CYC");
        $ic95$ = makeSymbol("S#11164", "CYC");
        $ic96$ = makeSymbol("S#73", "CYC");
        $ic97$ = makeKeyword("MODULE-INVERTS-ARGUMENTS");
        $ic98$ = makeSymbol("S#11209", "CYC");
        $ic99$ = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
        $ic100$ = makeKeyword("DISJOINS-MODULE");
        $ic101$ = makeKeyword("MARKING-INCREMENT");
        $ic102$ = makeSymbol("INTEGERP");
        $ic103$ = makeSymbol("LISTP");
        $ic104$ = makeKeyword("TRANSFERS-THROUGH-MODULE");
        $ic105$ = makeKeyword("TRANSFERS-VIA-ARG");
        $ic106$ = makeKeyword("ADD-NODE-TO-RESULT-TEST");
        $ic107$ = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
        $ic108$ = makeKeyword("PREDICATE-SEARCH-P");
        $ic109$ = makeSymbol("BOOLEANP");
        $ic110$ = makeKeyword("MODULE-TAG");
        $ic111$ = makeSymbol("KEYWORDP");
        $ic112$ = makeKeyword("ROOT");
        $ic113$ = makeSymbol("S#11210", "CYC");
        $ic114$ = makeSymbol("HASH-TABLE-P");
        $ic115$ = makeKeyword("SBHL-MARKING-PARAMETERS");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11211", "CYC"), (SubLObject)makeSymbol("S#11212", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic117$ = makeSymbol("DO-DICTIONARY");
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("S#11169", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("LINK-PRED"), (SubLObject)makeKeyword("LINK-STYLE"), (SubLObject)makeKeyword("MODULE-TYPE"), (SubLObject)makeKeyword("PATH-TERMINATING-MARK?-FN"), (SubLObject)makeKeyword("MARKING-FN"), (SubLObject)makeKeyword("UNMARKING-FN"), (SubLObject)makeKeyword("INDEX-ARG"), (SubLObject)makeKeyword("GRAPH"));
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11211", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic121$ = makeSymbol("S#115", "CYC");
        $ic122$ = ConsesLow.list((SubLObject)makeSymbol("S#11173", "CYC"));
        $ic123$ = makeString("~A is not a valid sbhl-predicate-p");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic125$ = makeSymbol("S#11190", "CYC");
        $ic126$ = makeSymbol("FIF");
        $ic127$ = ConsesLow.list((SubLObject)makeSymbol("S#11190", "CYC"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("DirectedMultigraph"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)makeString("Multigraph"));
        $ic130$ = makeString("Term, ~a, is not used to specify directed nor undirected graphs");
        $ic131$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#205", "CYC"));
        $ic132$ = makeSymbol("S#11182", "CYC");
        $ic133$ = makeSymbol(">");
        $ic134$ = makeSymbol("SECOND");
        $ic135$ = makeSymbol("FIRST");
        $ic136$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
    }
    
    public static final class $sX11098_native extends SubLStructNative
    {
        public SubLObject $link_pred;
        public SubLObject $accessible_link_preds;
        public SubLObject $graph;
        public SubLObject $link_style;
        public SubLObject $index_arg;
        public SubLObject $module_type;
        public SubLObject $type_test;
        public SubLObject $path_terminating_mark_fn;
        public SubLObject $marking_fn;
        public SubLObject $unmarking_fn;
        public SubLObject $var_bindings;
        public SubLObject $misc_properties;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11098_native() {
            this.$link_pred = (SubLObject)CommonSymbols.NIL;
            this.$accessible_link_preds = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
            this.$link_style = (SubLObject)CommonSymbols.NIL;
            this.$index_arg = (SubLObject)CommonSymbols.NIL;
            this.$module_type = (SubLObject)CommonSymbols.NIL;
            this.$type_test = (SubLObject)CommonSymbols.NIL;
            this.$path_terminating_mark_fn = (SubLObject)CommonSymbols.NIL;
            this.$marking_fn = (SubLObject)CommonSymbols.NIL;
            this.$unmarking_fn = (SubLObject)CommonSymbols.NIL;
            this.$var_bindings = (SubLObject)CommonSymbols.NIL;
            this.$misc_properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11098_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$link_pred;
        }
        
        public SubLObject getField3() {
            return this.$accessible_link_preds;
        }
        
        public SubLObject getField4() {
            return this.$graph;
        }
        
        public SubLObject getField5() {
            return this.$link_style;
        }
        
        public SubLObject getField6() {
            return this.$index_arg;
        }
        
        public SubLObject getField7() {
            return this.$module_type;
        }
        
        public SubLObject getField8() {
            return this.$type_test;
        }
        
        public SubLObject getField9() {
            return this.$path_terminating_mark_fn;
        }
        
        public SubLObject getField10() {
            return this.$marking_fn;
        }
        
        public SubLObject getField11() {
            return this.$unmarking_fn;
        }
        
        public SubLObject getField12() {
            return this.$var_bindings;
        }
        
        public SubLObject getField13() {
            return this.$misc_properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$link_pred = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$accessible_link_preds = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$graph = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$link_style = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$index_arg = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$module_type = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$type_test = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$path_terminating_mark_fn = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$marking_fn = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$unmarking_fn = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$var_bindings = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$misc_properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11098_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$link_pred", "$accessible_link_preds", "$graph", "$link_style", "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f8885$UnaryFunction extends UnaryFunction
    {
        public $f8885$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11099"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8885(var3);
        }
    }
    
    public static final class $f8955$ZeroArityFunction extends ZeroArityFunction
    {
        public $f8955$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11102"));
        }
        
        public SubLObject processItem() {
            return f8955((SubLObject)$f8955$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $f8955$UnaryFunction extends UnaryFunction
    {
        public $f8955$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11102"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8955(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 307 ms
	
	Decompiled with Procyon 0.5.32.
*/