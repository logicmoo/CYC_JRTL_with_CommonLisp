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
        f8884(var1, var2, (SubLObject)module0137.ZERO_INTEGER);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8885(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11098_native.class) ? module0137.T : module0137.NIL);
    }
    
    public static SubLObject f8886(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8887(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8888(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8889(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8890(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8891(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f8892(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f8893(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f8894(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f8895(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f8896(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f8897(final SubLObject var1) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f8898(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8899(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8900(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8901(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8902(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8903(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f8904(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f8905(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f8906(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f8907(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f8908(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f8909(final SubLObject var1, final SubLObject var4) {
        assert module0137.NIL != f8885(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f8910(SubLObject var5) {
        if (var5 == module0137.UNPROVIDED) {
            var5 = (SubLObject)module0137.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11098_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0137.NIL, var7 = var5; module0137.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0137.$ic33$)) {
                f8898(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic34$)) {
                f8899(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic35$)) {
                f8900(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic36$)) {
                f8901(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic37$)) {
                f8902(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic38$)) {
                f8903(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic39$)) {
                f8904(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic40$)) {
                f8905(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic41$)) {
                f8906(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic42$)) {
                f8907(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic43$)) {
                f8908(var6, var9);
            }
            else if (var10.eql((SubLObject)module0137.$ic44$)) {
                f8909(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0137.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8911(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic46$, (SubLObject)module0137.$ic47$, (SubLObject)module0137.TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic33$, f8886(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic34$, f8887(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic35$, f8888(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic36$, f8889(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic37$, f8890(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic38$, f8891(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic39$, f8892(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic40$, f8893(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic41$, f8894(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic42$, f8895(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic43$, f8896(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic48$, (SubLObject)module0137.$ic44$, f8897(var11));
        Functions.funcall(var12, var11, (SubLObject)module0137.$ic49$, (SubLObject)module0137.$ic47$, (SubLObject)module0137.TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8912(final SubLObject var11, final SubLObject var12) {
        return f8911(var11, var12);
    }
    
    public static SubLObject f8884(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        if (module0137.NIL != f8885(var13)) {
            PrintLow.format(var2, (SubLObject)module0137.$ic51$);
            print_high.prin1(f8886(var13), var2);
            PrintLow.format(var2, (SubLObject)module0137.$ic52$);
        }
        else {
            compatibility.default_struct_print_function(var13, var2, var14);
        }
        return var13;
    }
    
    public static SubLObject f8913(final SubLObject var15) {
        assert module0137.NIL != module0173.f10955(var15) : var15;
        final SubLObject var16 = f8910((SubLObject)module0137.UNPROVIDED);
        f8898(var16, var15);
        f8909(var16, module0067.f4880((SubLObject)module0137.EQL, (SubLObject)module0137.ZERO_INTEGER));
        return var16;
    }
    
    public static SubLObject f8914(final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0137.NIL != module0136.f8864() && module0137.NIL == f8915(var17)) {
            final SubLObject var20 = module0136.$g1591$.getDynamicValue(var19);
            if (var20.eql((SubLObject)module0137.$ic54$)) {
                module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic55$, var17, (SubLObject)module0137.$ic56$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var20.eql((SubLObject)module0137.$ic57$)) {
                module0136.f8871((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var17, (SubLObject)module0137.$ic56$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var20.eql((SubLObject)module0137.$ic59$)) {
                Errors.warn((SubLObject)module0137.$ic55$, var17, (SubLObject)module0137.$ic56$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic60$, module0136.$g1591$.getDynamicValue(var19));
                Errors.cerror((SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var17, (SubLObject)module0137.$ic56$);
            }
        }
        if (module0137.NIL != module0136.f8864() && module0137.NIL == f8885(var16)) {
            final SubLObject var20 = module0136.$g1591$.getDynamicValue(var19);
            if (var20.eql((SubLObject)module0137.$ic54$)) {
                module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var20.eql((SubLObject)module0137.$ic57$)) {
                module0136.f8871((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var20.eql((SubLObject)module0137.$ic59$)) {
                Errors.warn((SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic60$, module0136.$g1591$.getDynamicValue(var19));
                Errors.cerror((SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$);
            }
        }
        if (var17.eql((SubLObject)module0137.$ic33$)) {
            f8898(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic34$)) {
            f8899(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic35$)) {
            f8900(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic36$)) {
            f8901(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic37$)) {
            f8902(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic38$)) {
            f8903(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic39$)) {
            f8904(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic61$)) {
            f8905(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic41$)) {
            f8906(var16, var18);
        }
        else if (var17.eql((SubLObject)module0137.$ic42$)) {
            f8907(var16, var18);
        }
        else {
            module0067.f4886(f8897(var16), var17, var18);
        }
        return var16;
    }
    
    public static SubLObject f8916(final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0137.NIL != module0136.f8864() && module0137.NIL == f8885(var16)) {
            final SubLObject var19 = module0136.$g1591$.getDynamicValue(var18);
            if (var19.eql((SubLObject)module0137.$ic54$)) {
                module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var19.eql((SubLObject)module0137.$ic57$)) {
                module0136.f8871((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var19.eql((SubLObject)module0137.$ic59$)) {
                Errors.warn((SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic60$, module0136.$g1591$.getDynamicValue(var18));
                Errors.cerror((SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic1$);
            }
        }
        if (var17.eql((SubLObject)module0137.$ic33$)) {
            return f8886(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic34$)) {
            return f8887(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic35$)) {
            return f8888(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic36$)) {
            return f8889(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic37$)) {
            return f8890(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic38$)) {
            return f8891(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic39$)) {
            return f8892(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic61$)) {
            return f8893(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic41$)) {
            return f8894(var16);
        }
        if (var17.eql((SubLObject)module0137.$ic42$)) {
            return f8895(var16);
        }
        return module0067.f4885(f8897(var16), var17, (SubLObject)module0137.UNPROVIDED);
    }
    
    public static SubLObject f8917(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8886(var16);
    }
    
    public static SubLObject f8918(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8887(var16);
    }
    
    public static SubLObject f8919(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8888(var16);
    }
    
    public static SubLObject f8920(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8889(var16);
    }
    
    public static SubLObject f8921(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8890(var16);
    }
    
    public static SubLObject f8922(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8891(var16);
    }
    
    public static SubLObject f8923(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8892(var16);
    }
    
    public static SubLObject f8924(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8893(var16);
    }
    
    public static SubLObject f8925(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8894(var16);
    }
    
    public static SubLObject f8926(final SubLObject var16) {
        assert module0137.NIL != f8885(var16) : var16;
        return f8895(var16);
    }
    
    public static SubLObject f8927() {
        if (module0137.NIL != module0067.f4852(module0137.$g1601$.getGlobalValue())) {
            module0137.$g1601$.setGlobalValue(module0084.f5780(module0137.$g1601$.getGlobalValue()));
            Errors.warn((SubLObject)module0137.$ic63$);
        }
        else if (module0137.NIL == module0035.f2292(module0137.$g1601$.getGlobalValue())) {
            if (module0137.NIL == module0137.$g1601$.getGlobalValue()) {
                Errors.warn((SubLObject)module0137.$ic64$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic65$, (SubLObject)Types.type_of(module0137.$g1601$.getGlobalValue()));
            }
        }
        return (SubLObject)module0137.$ic66$;
    }
    
    public static SubLObject f8928(final SubLObject var13) {
        return f8885(var13);
    }
    
    public static SubLObject f8929() {
        module0137.$g1601$.setGlobalValue((SubLObject)module0137.NIL);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8930() {
        return (SubLObject)module0137.T;
    }
    
    public static SubLObject f8931() {
        return module0137.$g1601$.getGlobalValue();
    }
    
    public static SubLObject f8932(final SubLObject var20, final SubLObject var16) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0137.NIL != module0136.f8864() && module0137.NIL == f8933(var20)) {
            final SubLObject var22 = module0136.$g1591$.getDynamicValue(var21);
            if (var22.eql((SubLObject)module0137.$ic54$)) {
                module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic55$, var20, (SubLObject)module0137.$ic67$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var22.eql((SubLObject)module0137.$ic57$)) {
                module0136.f8871((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var20, (SubLObject)module0137.$ic67$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var22.eql((SubLObject)module0137.$ic59$)) {
                Errors.warn((SubLObject)module0137.$ic55$, var20, (SubLObject)module0137.$ic67$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic60$, module0136.$g1591$.getDynamicValue(var21));
                Errors.cerror((SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var20, (SubLObject)module0137.$ic67$);
            }
        }
        if (module0137.NIL != module0136.f8864() && module0137.NIL == f8928(var16)) {
            final SubLObject var22 = module0136.$g1591$.getDynamicValue(var21);
            if (var22.eql((SubLObject)module0137.$ic54$)) {
                module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic68$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var22.eql((SubLObject)module0137.$ic57$)) {
                module0136.f8871((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic68$, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
            }
            else if (var22.eql((SubLObject)module0137.$ic59$)) {
                Errors.warn((SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic68$);
            }
            else {
                Errors.warn((SubLObject)module0137.$ic60$, module0136.$g1591$.getDynamicValue(var21));
                Errors.cerror((SubLObject)module0137.$ic58$, (SubLObject)module0137.$ic55$, var16, (SubLObject)module0137.$ic68$);
            }
        }
        module0137.$g1601$.setGlobalValue(conses_high.acons(var20, var16, module0137.$g1601$.getGlobalValue()));
        module0244.f15726();
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8934(final SubLObject var20) {
        module0137.$g1601$.setGlobalValue(module0035.f2310(module0137.$g1601$.getGlobalValue(), var20, (SubLObject)module0137.UNPROVIDED));
        module0244.f15726();
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8935(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic69$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)module0137.$ic70$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic71$, (SubLObject)ConsesLow.list(var29, var26, (SubLObject)module0137.$ic72$, (SubLObject)module0137.$ic73$, var27), (SubLObject)ConsesLow.list((SubLObject)module0137.$ic74$, var29), ConsesLow.append(var28, (SubLObject)module0137.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic69$);
        return (SubLObject)module0137.NIL;
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
        return Equality.eq(var30, (SubLObject)module0137.$ic76$);
    }
    
    public static SubLObject f8939(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)module0137.$ic77$);
    }
    
    public static SubLObject f8940(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)module0137.$ic78$);
    }
    
    public static SubLObject f8941(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)module0137.$ic79$);
    }
    
    public static SubLObject f8942(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)module0137.$ic80$);
    }
    
    public static SubLObject f8943(final SubLObject var30) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var30 == module0137.$ic76$ || var30 == module0137.$ic77$ || var30 == module0137.$ic80$);
    }
    
    public static SubLObject f8944(final SubLObject var30) {
        return module0004.f104(var30, module0137.$g1602$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0137.EQ), (SubLObject)module0137.UNPROVIDED);
    }
    
    public static SubLObject f8945(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic69$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)module0137.$ic81$;
            return (SubLObject)ConsesLow.list((SubLObject)module0137.$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)module0137.$ic83$, (SubLObject)ConsesLow.list((SubLObject)module0137.$ic84$, var29), (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0137.$ic86$, var29))), ConsesLow.append(var28, (SubLObject)module0137.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic69$);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8946(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic69$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic69$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)module0137.$ic87$;
            return (SubLObject)ConsesLow.list((SubLObject)module0137.$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)module0137.$ic83$, (SubLObject)ConsesLow.list((SubLObject)module0137.$ic88$, var29), (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, var29)), ConsesLow.append(var28, (SubLObject)module0137.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic69$);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8947(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic89$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic89$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic89$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            final SubLObject var29 = (SubLObject)module0137.$ic90$;
            return (SubLObject)ConsesLow.list((SubLObject)module0137.$ic82$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.list((SubLObject)module0137.$ic83$, (SubLObject)ConsesLow.list((SubLObject)module0137.$ic88$, var29), (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0137.$ic86$, var29))), ConsesLow.append(var28, (SubLObject)module0137.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic89$);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8948(final SubLObject var41) {
        SubLObject var42 = var41;
        SubLObject var43 = (SubLObject)module0137.NIL;
        var43 = var42.first();
        while (module0137.NIL != var42) {
            final SubLObject var44 = var43.first();
            final SubLObject var45 = conses_high.second(var43);
            module0067.f4886(module0137.$g1603$.getGlobalValue(), var44, var45);
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8949() {
        return module0137.$g1603$.getGlobalValue();
    }
    
    public static SubLObject f8950(final SubLObject var17, final SubLObject var45) {
        module0067.f4886(module0137.$g1603$.getGlobalValue(), var17, var45);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8915(final SubLObject var17) {
        return module0067.f4885(module0137.$g1603$.getGlobalValue(), var17, (SubLObject)module0137.UNPROVIDED);
    }
    
    public static SubLObject f8951(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic116$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        SubLObject var27 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic116$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic116$);
        var27 = var24.first();
        var24 = var24.rest();
        final SubLObject var28 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic116$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var29;
            var24 = (var29 = var25);
            return (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic117$, (SubLObject)ConsesLow.list(var26, var27, (SubLObject)module0137.$ic118$, var28), ConsesLow.append(var29, (SubLObject)module0137.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic116$);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8952() {
        return module0137.$g1604$.getGlobalValue();
    }
    
    public static SubLObject f8953(final SubLObject var17) {
        return module0004.f104(var17, module0137.$g1604$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0137.EQL), (SubLObject)module0137.UNPROVIDED);
    }
    
    public static SubLObject f8954(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic120$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic120$);
        var26 = var24.first();
        var24 = var24.rest();
        final SubLObject var27 = (SubLObject)(var24.isCons() ? var24.first() : module0137.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var24, var23, (SubLObject)module0137.$ic120$);
        var24 = var24.rest();
        if (module0137.NIL == var24) {
            final SubLObject var28;
            var24 = (var28 = var25);
            return (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic121$, (SubLObject)ConsesLow.list(var26, (SubLObject)module0137.$ic122$, var27), ConsesLow.append(var28, (SubLObject)module0137.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0137.$ic120$);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8955(SubLObject var20) {
        if (var20 == module0137.UNPROVIDED) {
            var20 = (SubLObject)module0137.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0137.NIL == var20) {
            return module0137.$g1605$.getDynamicValue(var21);
        }
        if (module0137.NIL != f8885(module0137.$g1605$.getDynamicValue(var21)) && var20.eql(module0244.f15736(module0137.$g1605$.getDynamicValue(var21)))) {
            return module0137.$g1605$.getDynamicValue(var21);
        }
        final SubLObject var22 = module0035.f2294(f8931(), var20, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
        if (module0137.NIL == var22) {
            return module0136.f8872((SubLObject)module0137.ZERO_INTEGER, (SubLObject)module0137.$ic123$, var20, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f8956(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic124$);
        var25 = var24.first();
        final SubLObject var26;
        var24 = (var26 = var24.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0137.$ic125$, var25)), ConsesLow.append(var26, (SubLObject)module0137.NIL));
    }
    
    public static SubLObject f8957(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0137.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0137.$ic124$);
        var25 = var24.first();
        final SubLObject var26;
        var24 = (var26 = var24.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0137.$ic125$, (SubLObject)ConsesLow.listS((SubLObject)module0137.$ic126$, var25, var25, (SubLObject)module0137.$ic127$))), ConsesLow.append(var26, (SubLObject)module0137.NIL));
    }
    
    public static SubLObject f8958(final SubLObject var58) {
        if (var58.eql(module0137.$g1607$.getGlobalValue())) {
            return (SubLObject)module0137.T;
        }
        if (var58.eql(module0137.$g1608$.getGlobalValue())) {
            return (SubLObject)module0137.NIL;
        }
        if (module0137.NIL != module0136.f8870((SubLObject)module0137.ONE_INTEGER, (SubLObject)module0137.$ic130$, var58, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED)) {}
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8959(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var58.eql(module0137.$g1607$.getGlobalValue()) || var58.eql(module0137.$g1608$.getGlobalValue()));
    }
    
    public static SubLObject f8960() {
        SubLObject var42 = f8931();
        SubLObject var43 = (SubLObject)module0137.NIL;
        var43 = var42.first();
        while (module0137.NIL != var42) {
            SubLObject var45;
            final SubLObject var44 = var45 = var43;
            SubLObject var46 = (SubLObject)module0137.NIL;
            SubLObject var47 = (SubLObject)module0137.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0137.$ic131$);
            var46 = var45.first();
            var45 = (var47 = var45.rest());
            final SubLObject var48 = module0244.f15736(var47);
            if (module0137.NIL == module0173.f10969(var48)) {
                f8934(var47);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        f8961();
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8961() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0137.$g1610$.currentBinding(var19);
        try {
            module0137.$g1610$.bind(f8962(), var19);
            module0035.f2320(f8931(), Symbols.symbol_function((SubLObject)module0137.$ic132$));
        }
        finally {
            module0137.$g1610$.rebind(var20, var19);
        }
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8963(final SubLObject var64, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        return module0035.f2385(var64, var65, module0137.$g1610$.getDynamicValue(var66), Symbols.symbol_function((SubLObject)module0137.EQL), (SubLObject)module0137.UNPROVIDED);
    }
    
    public static SubLObject f8962() {
        SubLObject var66 = (SubLObject)module0137.NIL;
        SubLObject var67 = f8931();
        SubLObject var68 = (SubLObject)module0137.NIL;
        var68 = var67.first();
        while (module0137.NIL != var67) {
            SubLObject var70;
            final SubLObject var69 = var70 = var68;
            SubLObject var71 = (SubLObject)module0137.NIL;
            SubLObject var72 = (SubLObject)module0137.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0137.$ic131$);
            var71 = var70.first();
            var70 = (var72 = var70.rest());
            final SubLObject var73 = module0244.f15736(var72);
            final SubLObject var74 = module0244.f15766(var72);
            final SubLObject var75 = Hashtables.hash_table_size(var74);
            var66 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var73, var75), var66);
            var67 = var67.rest();
            var68 = var67.first();
        }
        var66 = Sort.stable_sort(var66, Symbols.symbol_function((SubLObject)module0137.$ic133$), Symbols.symbol_function((SubLObject)module0137.$ic134$));
        SubLObject var76 = module0035.f2076(Symbols.symbol_function((SubLObject)module0137.$ic135$), var66);
        var76 = (SubLObject)ConsesLow.cons(module0137.$ic136$, Sequences.delete(module0137.$ic136$, var76, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED, (SubLObject)module0137.UNPROVIDED));
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
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8965() {
        module0137.$g1599$ = SubLFiles.defconstant("S#11184", (SubLObject)module0137.$ic0$);
        module0137.$g1600$ = SubLFiles.deflexical("S#11185", Symbols.symbol_function((SubLObject)module0137.EQL));
        module0137.$g1601$ = SubLFiles.deflexical("S#11186", (SubLObject)((module0137.NIL != Symbols.boundp((SubLObject)module0137.$ic62$)) ? module0137.$g1601$.getGlobalValue() : module0137.NIL));
        module0137.$g1602$ = SubLFiles.deflexical("S#11187", (SubLObject)module0137.$ic75$);
        module0137.$g1603$ = SubLFiles.deflexical("S#11188", (module0137.NIL != Symbols.boundp((SubLObject)module0137.$ic91$)) ? module0137.$g1603$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0137.EQ), (SubLObject)module0137.UNPROVIDED));
        module0137.$g1604$ = SubLFiles.deflexical("S#11189", (SubLObject)module0137.$ic119$);
        module0137.$g1605$ = SubLFiles.defparameter("S#11190", (SubLObject)module0137.NIL);
        module0137.$g1606$ = SubLFiles.defvar("S#11191", (SubLObject)module0137.NIL);
        module0137.$g1607$ = SubLFiles.deflexical("S#11192", module0137.$ic128$);
        module0137.$g1608$ = SubLFiles.deflexical("S#11193", module0137.$ic129$);
        module0137.$g1609$ = SubLFiles.defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", (SubLObject)module0137.T);
        module0137.$g1610$ = SubLFiles.defparameter("S#11194", (SubLObject)module0137.NIL);
        return (SubLObject)module0137.NIL;
    }
    
    public static SubLObject f8966() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0137.$g1599$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0137.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0137.$ic8$);
        Structures.def_csetf((SubLObject)module0137.$ic9$, (SubLObject)module0137.$ic10$);
        Structures.def_csetf((SubLObject)module0137.$ic11$, (SubLObject)module0137.$ic12$);
        Structures.def_csetf((SubLObject)module0137.$ic13$, (SubLObject)module0137.$ic14$);
        Structures.def_csetf((SubLObject)module0137.$ic15$, (SubLObject)module0137.$ic16$);
        Structures.def_csetf((SubLObject)module0137.$ic17$, (SubLObject)module0137.$ic18$);
        Structures.def_csetf((SubLObject)module0137.$ic19$, (SubLObject)module0137.$ic20$);
        Structures.def_csetf((SubLObject)module0137.$ic21$, (SubLObject)module0137.$ic22$);
        Structures.def_csetf((SubLObject)module0137.$ic23$, (SubLObject)module0137.$ic24$);
        Structures.def_csetf((SubLObject)module0137.$ic25$, (SubLObject)module0137.$ic26$);
        Structures.def_csetf((SubLObject)module0137.$ic27$, (SubLObject)module0137.$ic28$);
        Structures.def_csetf((SubLObject)module0137.$ic29$, (SubLObject)module0137.$ic30$);
        Structures.def_csetf((SubLObject)module0137.$ic31$, (SubLObject)module0137.$ic32$);
        Equality.identity((SubLObject)module0137.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0137.$g1599$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0137.$ic50$));
        module0003.f57((SubLObject)module0137.$ic62$);
        module0003.f57((SubLObject)module0137.$ic91$);
        f8948((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)module0137.$ic33$, (SubLObject)module0137.$ic67$), ConsesLow.list((SubLObject)module0137.$ic36$, (SubLObject)module0137.$ic92$), ConsesLow.list((SubLObject)module0137.$ic93$, (SubLObject)module0137.$ic94$), ConsesLow.list((SubLObject)module0137.$ic38$, (SubLObject)module0137.$ic95$), ConsesLow.list((SubLObject)module0137.$ic39$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic97$, (SubLObject)module0137.$ic98$), ConsesLow.list((SubLObject)module0137.$ic99$, (SubLObject)module0137.$ic98$), ConsesLow.list((SubLObject)module0137.$ic100$, (SubLObject)module0137.$ic98$), ConsesLow.list((SubLObject)module0137.$ic61$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic41$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic42$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic101$, (SubLObject)module0137.$ic102$), ConsesLow.list((SubLObject)module0137.$ic34$, (SubLObject)module0137.$ic103$), ConsesLow.list((SubLObject)module0137.$ic104$, (SubLObject)module0137.$ic98$), ConsesLow.list((SubLObject)module0137.$ic105$, (SubLObject)module0137.$ic102$), ConsesLow.list((SubLObject)module0137.$ic106$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic107$, (SubLObject)module0137.$ic96$), ConsesLow.list((SubLObject)module0137.$ic108$, (SubLObject)module0137.$ic109$), ConsesLow.list((SubLObject)module0137.$ic110$, (SubLObject)module0137.$ic111$), ConsesLow.list((SubLObject)module0137.$ic37$, (SubLObject)module0137.$ic102$), ConsesLow.list((SubLObject)module0137.$ic112$, (SubLObject)module0137.$ic113$), ConsesLow.list((SubLObject)module0137.$ic35$, (SubLObject)module0137.$ic114$), ConsesLow.list((SubLObject)module0137.$ic115$, (SubLObject)module0137.$ic103$) }));
        module0012.f419((SubLObject)module0137.$ic132$);
        return (SubLObject)module0137.NIL;
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
        module0137.$g1599$ = null;
        module0137.$g1600$ = null;
        module0137.$g1601$ = null;
        module0137.$g1602$ = null;
        module0137.$g1603$ = null;
        module0137.$g1604$ = null;
        module0137.$g1605$ = null;
        module0137.$g1606$ = null;
        module0137.$g1607$ = null;
        module0137.$g1608$ = null;
        module0137.$g1609$ = null;
        module0137.$g1610$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#11098", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11195", "CYC"), SubLObjectFactory.makeSymbol("S#11196", "CYC"), SubLObjectFactory.makeSymbol("S#10129", "CYC"), SubLObjectFactory.makeSymbol("S#11197", "CYC"), SubLObjectFactory.makeSymbol("S#11198", "CYC"), SubLObjectFactory.makeSymbol("S#11199", "CYC"), SubLObjectFactory.makeSymbol("S#11097", "CYC"), SubLObjectFactory.makeSymbol("S#11200", "CYC"), SubLObjectFactory.makeSymbol("S#11201", "CYC"), SubLObjectFactory.makeSymbol("S#11202", "CYC"), SubLObjectFactory.makeSymbol("S#11203", "CYC"), SubLObjectFactory.makeSymbol("S#11204", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINK-PRED"), SubLObjectFactory.makeKeyword("ACCESSIBLE-LINK-PREDS"), SubLObjectFactory.makeKeyword("GRAPH"), SubLObjectFactory.makeKeyword("LINK-STYLE"), SubLObjectFactory.makeKeyword("INDEX-ARG"), SubLObjectFactory.makeKeyword("MODULE-TYPE"), SubLObjectFactory.makeKeyword("TYPE-TEST"), SubLObjectFactory.makeKeyword("PATH-TERMINATING-MARK-FN"), SubLObjectFactory.makeKeyword("MARKING-FN"), SubLObjectFactory.makeKeyword("UNMARKING-FN"), SubLObjectFactory.makeKeyword("VAR-BINDINGS"), SubLObjectFactory.makeKeyword("MISC-PROPERTIES") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11106", "CYC"), SubLObjectFactory.makeSymbol("S#11107", "CYC"), SubLObjectFactory.makeSymbol("S#11108", "CYC"), SubLObjectFactory.makeSymbol("S#11109", "CYC"), SubLObjectFactory.makeSymbol("S#11110", "CYC"), SubLObjectFactory.makeSymbol("S#11111", "CYC"), SubLObjectFactory.makeSymbol("S#11112", "CYC"), SubLObjectFactory.makeSymbol("S#11113", "CYC"), SubLObjectFactory.makeSymbol("S#11114", "CYC"), SubLObjectFactory.makeSymbol("S#11115", "CYC"), SubLObjectFactory.makeSymbol("S#11116", "CYC"), SubLObjectFactory.makeSymbol("S#11117", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11118", "CYC"), SubLObjectFactory.makeSymbol("S#11119", "CYC"), SubLObjectFactory.makeSymbol("S#11120", "CYC"), SubLObjectFactory.makeSymbol("S#11121", "CYC"), SubLObjectFactory.makeSymbol("S#11122", "CYC"), SubLObjectFactory.makeSymbol("S#11123", "CYC"), SubLObjectFactory.makeSymbol("S#11124", "CYC"), SubLObjectFactory.makeSymbol("S#11125", "CYC"), SubLObjectFactory.makeSymbol("S#11126", "CYC"), SubLObjectFactory.makeSymbol("S#11127", "CYC"), SubLObjectFactory.makeSymbol("S#11128", "CYC"), SubLObjectFactory.makeSymbol("S#11129", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#11133", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#11105", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11099", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#11106", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#11118", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#11107", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11119", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11108", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11120", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11109", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#11121", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11110", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#11122", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#11111", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#11123", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#11112", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#11124", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#11113", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#11125", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#11114", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11126", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#11115", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#11127", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#11116", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#11128", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#11117", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#11129", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("LINK-PRED");
        $ic34$ = SubLObjectFactory.makeKeyword("ACCESSIBLE-LINK-PREDS");
        $ic35$ = SubLObjectFactory.makeKeyword("GRAPH");
        $ic36$ = SubLObjectFactory.makeKeyword("LINK-STYLE");
        $ic37$ = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $ic38$ = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $ic39$ = SubLObjectFactory.makeKeyword("TYPE-TEST");
        $ic40$ = SubLObjectFactory.makeKeyword("PATH-TERMINATING-MARK-FN");
        $ic41$ = SubLObjectFactory.makeKeyword("MARKING-FN");
        $ic42$ = SubLObjectFactory.makeKeyword("UNMARKING-FN");
        $ic43$ = SubLObjectFactory.makeKeyword("VAR-BINDINGS");
        $ic44$ = SubLObjectFactory.makeKeyword("MISC-PROPERTIES");
        $ic45$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic46$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11130", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic49$ = SubLObjectFactory.makeKeyword("END");
        $ic50$ = SubLObjectFactory.makeSymbol("S#11132", "CYC");
        $ic51$ = SubLObjectFactory.makeString("#<SBHL-MODULE: ");
        $ic52$ = SubLObjectFactory.makeString(">");
        $ic53$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic54$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic55$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic56$ = SubLObjectFactory.makeSymbol("S#11171", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic58$ = SubLObjectFactory.makeString("continue anyway");
        $ic59$ = SubLObjectFactory.makeKeyword("WARN");
        $ic60$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic61$ = SubLObjectFactory.makeKeyword("PATH-TERMINATING-MARK?-FN");
        $ic62$ = SubLObjectFactory.makeSymbol("S#11186", "CYC");
        $ic63$ = SubLObjectFactory.makeString(";;; SBHL module store has been converted to new format.~&");
        $ic64$ = SubLObjectFactory.makeString(";;; No KB has been loaded, SBHL module store format is fine.~&");
        $ic65$ = SubLObjectFactory.makeString(";;; Unexpected SBHL module store format ~A ... SBHL may not work.~&");
        $ic66$ = SubLObjectFactory.makeKeyword("CHECKED");
        $ic67$ = SubLObjectFactory.makeSymbol("S#11157", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#11148", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic71$ = SubLObjectFactory.makeSymbol("DO-ALIST");
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11151", "CYC"));
        $ic73$ = SubLObjectFactory.makeKeyword("DONE");
        $ic74$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-REFLEXIVE"), (SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-NON-REFLEXIVE"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH"), (SubLObject)SubLObjectFactory.makeKeyword("DISJOINS"), (SubLObject)SubLObjectFactory.makeKeyword("TIME"));
        $ic76$ = SubLObjectFactory.makeKeyword("SIMPLE-REFLEXIVE");
        $ic77$ = SubLObjectFactory.makeKeyword("SIMPLE-NON-REFLEXIVE");
        $ic78$ = SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH");
        $ic79$ = SubLObjectFactory.makeKeyword("DISJOINS");
        $ic80$ = SubLObjectFactory.makeKeyword("TIME");
        $ic81$ = SubLObjectFactory.makeUninternedSymbol("US#12F0EC7");
        $ic82$ = SubLObjectFactory.makeSymbol("S#11154", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic84$ = SubLObjectFactory.makeSymbol("S#11206", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("CLET");
        $ic86$ = SubLObjectFactory.makeSymbol("S#11101", "CYC");
        $ic87$ = SubLObjectFactory.makeUninternedSymbol("US#12F0EC7");
        $ic88$ = SubLObjectFactory.makeSymbol("S#11207", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic90$ = SubLObjectFactory.makeUninternedSymbol("US#12F0EC7");
        $ic91$ = SubLObjectFactory.makeSymbol("S#11188", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#11179", "CYC");
        $ic93$ = SubLObjectFactory.makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
        $ic94$ = SubLObjectFactory.makeSymbol("S#3795", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#11164", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#73", "CYC");
        $ic97$ = SubLObjectFactory.makeKeyword("MODULE-INVERTS-ARGUMENTS");
        $ic98$ = SubLObjectFactory.makeSymbol("S#11209", "CYC");
        $ic99$ = SubLObjectFactory.makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
        $ic100$ = SubLObjectFactory.makeKeyword("DISJOINS-MODULE");
        $ic101$ = SubLObjectFactory.makeKeyword("MARKING-INCREMENT");
        $ic102$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic103$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic104$ = SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH-MODULE");
        $ic105$ = SubLObjectFactory.makeKeyword("TRANSFERS-VIA-ARG");
        $ic106$ = SubLObjectFactory.makeKeyword("ADD-NODE-TO-RESULT-TEST");
        $ic107$ = SubLObjectFactory.makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
        $ic108$ = SubLObjectFactory.makeKeyword("PREDICATE-SEARCH-P");
        $ic109$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic110$ = SubLObjectFactory.makeKeyword("MODULE-TAG");
        $ic111$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic112$ = SubLObjectFactory.makeKeyword("ROOT");
        $ic113$ = SubLObjectFactory.makeSymbol("S#11210", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic115$ = SubLObjectFactory.makeKeyword("SBHL-MARKING-PARAMETERS");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11211", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11212", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic117$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic118$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11169", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("LINK-STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PATH-TERMINATING-MARK?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("MARKING-FN"), (SubLObject)SubLObjectFactory.makeKeyword("UNMARKING-FN"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GRAPH"));
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11211", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic121$ = SubLObjectFactory.makeSymbol("S#115", "CYC");
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11173", "CYC"));
        $ic123$ = SubLObjectFactory.makeString("~A is not a valid sbhl-predicate-p");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic125$ = SubLObjectFactory.makeSymbol("S#11190", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("FIF");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11190", "CYC"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DirectedMultigraph"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Multigraph"));
        $ic130$ = SubLObjectFactory.makeString("Term, ~a, is not used to specify directed nor undirected graphs");
        $ic131$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic132$ = SubLObjectFactory.makeSymbol("S#11182", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol(">");
        $ic134$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic135$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic136$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
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
            structDecl = Structures.makeStructDeclNative((Class)$sX11098_native.class, module0137.$ic0$, module0137.$ic1$, module0137.$ic2$, module0137.$ic3$, new String[] { "$link_pred", "$accessible_link_preds", "$graph", "$link_style", "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties" }, module0137.$ic4$, module0137.$ic5$, module0137.$ic6$);
        }
    }
    
    public static final class $f8885$UnaryFunction extends UnaryFunction
    {
        public $f8885$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11099"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0137.f8885(var3);
        }
    }
    
    public static final class $f8955$ZeroArityFunction extends ZeroArityFunction
    {
        public $f8955$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11102"));
        }
        
        public SubLObject processItem() {
            return module0137.f8955((SubLObject)$f8955$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $f8955$UnaryFunction extends UnaryFunction
    {
        public $f8955$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11102"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0137.f8955(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0137.class
	Total time: 307 ms
	
	Decompiled with Procyon 0.5.32.
*/