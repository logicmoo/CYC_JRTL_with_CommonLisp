package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0636 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0636";
    public static final String myFingerPrint = "8a673491aa0ed3f1340777c467261c585ee0964b5b66643c30bc65a5254f6431";
    public static SubLSymbol $g4948$;
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
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLInteger $ic76$;
    private static final SubLInteger $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
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
    
    
    public static SubLObject f38809(final SubLObject var1, final SubLObject var2) {
        f38810(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38811(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX42513_native.class) ? T : NIL);
    }
    
    public static SubLObject f38812(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f38813(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f38814(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f38815(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f38816(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f38817(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f38818(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f38819(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f38820(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f38821(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f38822(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f38823(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f38824(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f38825(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f38826(final SubLObject var1) {
        assert NIL != f38811(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f38827(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f38828(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f38829(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f38830(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f38831(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f38832(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f38833(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f38834(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f38835(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f38836(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f38837(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f38838(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f38839(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f38840(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f38841(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38811(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f38842(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX42513_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic39$)) {
                f38827(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f38828(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f38829(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f38830(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f38831(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f38832(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f38833(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f38834(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f38835(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f38836(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f38837(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f38838(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic51$)) {
                f38839(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic52$)) {
                f38840(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic53$)) {
                f38841(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f38843(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic39$, f38812(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic40$, f38813(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic41$, f38814(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic42$, f38815(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic43$, f38816(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic44$, f38817(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic45$, f38818(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic46$, f38819(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic47$, f38820(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic48$, f38821(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic49$, f38822(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic50$, f38823(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic51$, f38824(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic52$, f38825(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic53$, f38826(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic58$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f38844(final SubLObject var11, final SubLObject var12) {
        return f38843(var11, var12);
    }
    
    public static SubLObject f38845(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38812(var13);
    }
    
    public static SubLObject f38846(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38813(var13);
    }
    
    public static SubLObject f38847(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38814(var13);
    }
    
    public static SubLObject f38848(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38815(var13);
    }
    
    public static SubLObject f38849(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38816(var13);
    }
    
    public static SubLObject f38850(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38817(var13);
    }
    
    public static SubLObject f38851(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38818(var13);
    }
    
    public static SubLObject f38852(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38819(var13);
    }
    
    public static SubLObject f38853(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        final SubLObject var14 = f38813(var13);
        final SubLObject var15 = module0408.f28423(var14);
        return var15;
    }
    
    public static SubLObject f38854(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38820(var13);
    }
    
    public static SubLObject f38855(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38821(var13);
    }
    
    public static SubLObject f38856(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38822(var13);
    }
    
    public static SubLObject f38857(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38823(var13);
    }
    
    public static SubLObject f38858(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38824(var13);
    }
    
    public static SubLObject f38859(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38825(var13);
    }
    
    public static SubLObject f38860(final SubLObject var13) {
        assert NIL != f38811(var13) : var13;
        return f38826(var13);
    }
    
    public static SubLObject f38861(final SubLObject var16) {
        final SubLObject var17 = f38842((SubLObject)UNPROVIDED);
        f38827(var17, f38845(var16));
        f38828(var17, f38846(var16));
        f38829(var17, f38847(var16));
        f38830(var17, f38848(var16));
        f38831(var17, f38849(var16));
        f38832(var17, f38850(var16));
        f38833(var17, f38851(var16));
        f38834(var17, f38852(var16));
        f38839(var17, f38858(var16));
        f38835(var17, f38854(var16));
        f38841(var17, f38860(var16));
        f38840(var17, f38859(var16));
        f38838(var17, f38823(var16));
        f38837(var17, f38856(var16));
        f38836(var17, f38855(var16));
        return var17;
    }
    
    public static SubLObject f38810(final SubLObject var18, final SubLObject var2, final SubLObject var19) {
        final SubLObject var20 = Strings.make_string(var19, (SubLObject)UNPROVIDED);
        final SubLObject var21 = Strings.make_string(Numbers.add(var19, (SubLObject)THREE_INTEGER), (SubLObject)UNPROVIDED);
        PrintLow.format(var2, (SubLObject)$ic60$, var20);
        PrintLow.format(var2, (SubLObject)$ic61$, var21, f38845(var18));
        PrintLow.format(var2, (SubLObject)$ic62$, var21, f38846(var18));
        PrintLow.format(var2, (SubLObject)$ic63$, var21, f38847(var18));
        PrintLow.format(var2, (SubLObject)$ic64$, var21, f38848(var18));
        PrintLow.format(var2, (SubLObject)$ic65$, var21, f38849(var18));
        PrintLow.format(var2, (SubLObject)$ic66$, var21, f38850(var18));
        PrintLow.format(var2, (SubLObject)$ic67$, var21, f38851(var18));
        PrintLow.format(var2, (SubLObject)$ic68$, var21, f38852(var18));
        PrintLow.format(var2, (SubLObject)$ic69$, var21, f38854(var18));
        PrintLow.format(var2, (SubLObject)$ic70$, var21, f38855(var18));
        PrintLow.format(var2, (SubLObject)$ic71$, var21, f38856(var18));
        PrintLow.format(var2, (SubLObject)$ic72$, var21, f38857(var18));
        PrintLow.format(var2, (SubLObject)$ic73$, var21, f38858(var18));
        PrintLow.format(var2, (SubLObject)$ic74$, var21, f38859(var18));
        PrintLow.format(var2, (SubLObject)$ic75$, var21, f38860(var18));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38862() {
        final SubLObject var17 = f38842((SubLObject)UNPROVIDED);
        f38831(var17, (SubLObject)NIL);
        f38832(var17, (SubLObject)NIL);
        f38833(var17, (SubLObject)$ic76$);
        f38834(var17, (SubLObject)TWENTY_INTEGER);
        f38839(var17, (SubLObject)NIL);
        f38835(var17, (SubLObject)$ic77$);
        f38841(var17, (SubLObject)NIL);
        f38840(var17, (SubLObject)NIL);
        f38838(var17, (SubLObject)NIL);
        f38837(var17, (SubLObject)NIL);
        f38836(var17, (SubLObject)NIL);
        return var17;
    }
    
    public static SubLObject f38863(final SubLObject var18, final SubLObject var22, final SubLObject var23) {
        if (var22.eql($ic78$)) {
            f38828(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic79$)) {
            f38829(var18, (NIL != module0228.f15225(var23)) ? module0172.f10922(var23) : var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic80$)) {
            f38831(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic81$)) {
            f38832(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic82$)) {
            if (NIL != module0167.f10813(var23)) {
                f38833(var18, module0205.f13203(module0172.f10920(var23), (SubLObject)UNPROVIDED));
            }
            else if (NIL != module0202.f12659(var23)) {
                f38833(var18, module0205.f13203(var23, (SubLObject)UNPROVIDED));
            }
            else {
                f38833(var18, var23);
            }
            return (SubLObject)NIL;
        }
        if (var22.eql($ic83$)) {
            f38834(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic84$)) {
            f38839(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic85$)) {
            f38835(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic86$)) {
            f38841(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic87$)) {
            f38840(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic88$)) {
            f38838(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic89$)) {
            f38837(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic90$)) {
            f38836(var18, var23);
            return (SubLObject)NIL;
        }
        if (var22.eql($ic91$)) {
            f38830(var18, var23);
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38864(final SubLObject var24, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        assert NIL != module0206.f13444(var24) : var24;
        if (NIL != var25 && !areAssertionsDisabledFor(me) && NIL == module0269.f17731(var25)) {
            throw new AssertionError(var25);
        }
        final SubLObject var27 = f38862();
        final SubLObject var28 = var25;
        final SubLObject var29 = module0147.$g2094$.currentBinding(var26);
        final SubLObject var30 = module0147.$g2095$.currentBinding(var26);
        try {
            module0147.$g2094$.bind(module0147.f9531(var28), var26);
            module0147.$g2095$.bind(module0147.f9534(var28), var26);
            f38827(var27, var24);
            var26.resetMultipleValues();
            SubLObject var31 = module0538.f33428((SubLObject)ConsesLow.listS($ic91$, var24, (SubLObject)$ic94$), var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var32 = var26.secondMultipleValue();
            SubLObject var33 = var26.thirdMultipleValue();
            var26.resetMultipleValues();
            if (var31 != NIL) {
                final SubLObject var34 = var31.first().first().rest();
                f38863(var27, $ic91$, var34);
            }
            var26.resetMultipleValues();
            var31 = module0538.f33428((SubLObject)ConsesLow.list($ic95$, (SubLObject)$ic96$, (SubLObject)$ic97$, var24), var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var32 = var26.secondMultipleValue();
            var33 = var26.thirdMultipleValue();
            var26.resetMultipleValues();
            SubLObject var35 = var31;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                SubLObject var38;
                final SubLObject var37 = var38 = var36;
                SubLObject var39 = (SubLObject)NIL;
                SubLObject var40 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)$ic98$);
                var39 = var38.first();
                var38 = var38.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)$ic98$);
                var40 = var38.first();
                var38 = var38.rest();
                if (NIL == var38) {
                    var39 = var39.rest();
                    var40 = var40.rest();
                    f38863(var27, var39, var40);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)$ic98$);
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var30, var26);
            module0147.$g2094$.rebind(var29, var26);
        }
        return var27;
    }
    
    public static SubLObject f38865(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != f38811(var18) : var18;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0018.$g646$.currentBinding(var19);
        final SubLObject var24 = module0018.$g644$.currentBinding(var19);
        final SubLObject var25 = module0018.$g701$.currentBinding(var19);
        final SubLObject var26 = module0018.$g648$.currentBinding(var19);
        final SubLObject var27 = module0347.$g2978$.currentBinding(var19);
        final SubLObject var28 = module0018.$g650$.currentBinding(var19);
        final SubLObject var29 = module0142.$g1717$.currentBinding(var19);
        try {
            module0018.$g646$.bind(f38855(var18), var19);
            module0018.$g644$.bind(f38856(var18), var19);
            module0018.$g701$.bind(f38857(var18), var19);
            module0018.$g648$.bind(f38858(var18), var19);
            module0347.$g2978$.bind(f38859(var18), var19);
            module0018.$g650$.bind(f38854(var18), var19);
            module0142.$g1717$.bind(f38860(var18), var19);
            var19.resetMultipleValues();
            final SubLObject var43_44 = module0538.f33428(f38846(var18), f38847(var18), f38850(var18), f38849(var18), f38851(var18), f38852(var18));
            final SubLObject var45_46 = var19.secondMultipleValue();
            final SubLObject var47_48 = var19.thirdMultipleValue();
            var19.resetMultipleValues();
            var20 = var43_44;
            var21 = var45_46;
            var22 = var47_48;
        }
        finally {
            module0142.$g1717$.rebind(var29, var19);
            module0018.$g650$.rebind(var28, var19);
            module0347.$g2978$.rebind(var27, var19);
            module0018.$g648$.rebind(var26, var19);
            module0018.$g701$.rebind(var25, var19);
            module0018.$g644$.rebind(var24, var19);
            module0018.$g646$.rebind(var23, var19);
        }
        return Values.values(var20, var21, var22);
    }
    
    public static SubLObject f38866(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != f38811(var18) : var18;
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0018.$g646$.currentBinding(var19);
        final SubLObject var22 = module0018.$g644$.currentBinding(var19);
        final SubLObject var23 = module0018.$g701$.currentBinding(var19);
        final SubLObject var24 = module0018.$g648$.currentBinding(var19);
        final SubLObject var25 = module0347.$g2978$.currentBinding(var19);
        final SubLObject var26 = module0018.$g650$.currentBinding(var19);
        final SubLObject var27 = module0142.$g1717$.currentBinding(var19);
        try {
            module0018.$g646$.bind(f38855(var18), var19);
            module0018.$g644$.bind(f38856(var18), var19);
            module0018.$g701$.bind(f38857(var18), var19);
            module0018.$g648$.bind(f38858(var18), var19);
            module0347.$g2978$.bind(f38859(var18), var19);
            module0018.$g650$.bind(f38854(var18), var19);
            module0142.$g1717$.bind(f38860(var18), var19);
            if (NIL != f38846(var18)) {
                var20 = module0538.f33427(f38846(var18), f38847(var18), f38850(var18), f38849(var18), f38851(var18), f38852(var18));
            }
        }
        finally {
            module0142.$g1717$.rebind(var27, var19);
            module0018.$g650$.rebind(var26, var19);
            module0347.$g2978$.rebind(var25, var19);
            module0018.$g648$.rebind(var24, var19);
            module0018.$g701$.rebind(var23, var19);
            module0018.$g644$.rebind(var22, var19);
            module0018.$g646$.rebind(var21, var19);
        }
        return var20;
    }
    
    public static SubLObject f38867(final SubLObject var16, final SubLObject var49) {
        assert NIL != f38811(var16) : var16;
        assert NIL != module0269.f17731(var49) : var49;
        f38829(var16, var49);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38868(final SubLObject var50, final SubLObject var51, final SubLObject var49) {
        assert NIL != f38811(var50) : var50;
        final SubLObject var52 = f38861(var50);
        if (NIL != var51) {
            f38828(var52, var51);
        }
        if (NIL != var49) {
            f38829(var52, var49);
        }
        return var52;
    }
    
    public static SubLObject f38869(final SubLObject var18) {
        assert NIL != f38811(var18) : var18;
        final SubLObject var19 = f38813(var18);
        final SubLObject var20 = f38814(var18);
        final SubLObject var21 = f38870(var18);
        return module0409.f28515(var19, var20, var21);
    }
    
    public static SubLObject f38871(final SubLObject var18, final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        assert NIL != f38811(var18) : var18;
        SubLObject var57 = (SubLObject)NIL;
        final SubLObject var58 = f38872(var18);
        final SubLObject var59 = module0347.$g2978$.currentBinding(var56);
        final SubLObject var60 = module0142.$g1717$.currentBinding(var56);
        try {
            module0347.$g2978$.bind(f38859(var18), var56);
            module0142.$g1717$.bind(f38860(var18), var56);
            var57 = module0409.f28521(var55, var58);
        }
        finally {
            module0142.$g1717$.rebind(var60, var56);
            module0347.$g2978$.rebind(var59, var56);
        }
        return var57;
    }
    
    public static SubLObject f38870(final SubLObject var18) {
        final SubLObject var19 = f38822(var18);
        final SubLObject var20 = f38824(var18);
        final SubLObject var21 = f38821(var18);
        final SubLObject var22 = f38853(var18);
        return (SubLObject)ConsesLow.list((SubLObject)$ic99$, var22, (SubLObject)$ic100$, var19, (SubLObject)$ic101$, var21, (SubLObject)$ic102$, var20);
    }
    
    public static SubLObject f38872(final SubLObject var18) {
        final SubLObject var19 = f38817(var18);
        final SubLObject var20 = f38819(var18);
        final SubLObject var21 = f38854(var18);
        final SubLObject var22 = module0434.f30571(var21);
        final SubLObject var23 = f38823(var18);
        final SubLObject var24 = f38818(var18);
        final SubLObject var25 = f38816(var18);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic103$, var19, $ic104$, var20, $ic105$, $ic106$, $ic107$, var22, $ic108$, $ic109$, $ic110$, var23, $ic111$, var24, $ic112$, var25 });
    }
    
    public static SubLObject f38873() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38809", "S#42515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38811", "S#42514", 1, 0, false);
        new $f38811$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38812", "S#42516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38813", "S#42517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38814", "S#42518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38815", "S#42519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38816", "S#42520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38817", "S#42521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38818", "S#42522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38819", "S#42523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38820", "S#42524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38821", "S#42525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38822", "S#42526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38823", "S#42527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38824", "S#42528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38825", "S#42529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38826", "S#42530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38827", "S#42531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38828", "S#42532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38829", "S#42533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38830", "S#42534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38831", "S#42535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38832", "S#42536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38833", "S#42537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38834", "S#42538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38835", "S#42539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38836", "S#42540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38837", "S#42541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38838", "S#42542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38839", "S#42543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38840", "S#42544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38841", "S#42545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38842", "S#42546", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38843", "S#42547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38844", "S#42548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38845", "S#42549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38846", "S#42550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38847", "S#42551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38848", "S#42552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38849", "S#42553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38850", "S#42554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38851", "S#42555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38852", "S#42556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38853", "S#42557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38854", "S#42558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38855", "S#42559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38856", "S#42560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38857", "S#42561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38858", "S#42562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38859", "S#42563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38860", "S#42564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38861", "S#42565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38810", "S#42566", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38862", "S#42567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38863", "S#42568", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38864", "S#42569", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38865", "S#42570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38866", "S#42571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38867", "S#42572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38868", "S#42573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38869", "S#42574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38871", "S#42575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38870", "S#42576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0636", "f38872", "S#42577", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38874() {
        $g4948$ = SubLFiles.defconstant("S#42578", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38875() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4948$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
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
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4948$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38873();
    }
    
    public void initializeVariables() {
        f38874();
    }
    
    public void runTopLevelForms() {
        f38875();
    }
    
    static {
        me = (SubLFile)new module0636();
        $g4948$ = null;
        $ic0$ = makeSymbol("S#42513", "CYC");
        $ic1$ = makeSymbol("S#42514", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#42579", "CYC"), makeSymbol("S#6061", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#42580", "CYC"), makeSymbol("S#42581", "CYC"), makeSymbol("S#42582", "CYC"), makeSymbol("S#42583", "CYC"), makeSymbol("S#42584", "CYC"), makeSymbol("S#42585", "CYC"), makeSymbol("S#42586", "CYC"), makeSymbol("S#42587", "CYC"), makeSymbol("S#42588", "CYC"), makeSymbol("S#42589", "CYC"), makeSymbol("S#42590", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("MAX-NUMBER-OF-RESULTS"), makeKeyword("BACK-CHAINING"), makeKeyword("TIME-CUTOFF-SECS"), makeKeyword("MAX-DEPTH"), makeKeyword("REMOVAL-COST-CUTOFF"), makeKeyword("ENABLE-NEGATION-BY-FAILURE"), makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-SEMANTIC-PRUNING"), makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#42516", "CYC"), makeSymbol("S#42517", "CYC"), makeSymbol("S#42518", "CYC"), makeSymbol("S#42519", "CYC"), makeSymbol("S#42520", "CYC"), makeSymbol("S#42521", "CYC"), makeSymbol("S#42522", "CYC"), makeSymbol("S#42523", "CYC"), makeSymbol("S#42524", "CYC"), makeSymbol("S#42525", "CYC"), makeSymbol("S#42526", "CYC"), makeSymbol("S#42527", "CYC"), makeSymbol("S#42528", "CYC"), makeSymbol("S#42529", "CYC"), makeSymbol("S#42530", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#42531", "CYC"), makeSymbol("S#42532", "CYC"), makeSymbol("S#42533", "CYC"), makeSymbol("S#42534", "CYC"), makeSymbol("S#42535", "CYC"), makeSymbol("S#42536", "CYC"), makeSymbol("S#42537", "CYC"), makeSymbol("S#42538", "CYC"), makeSymbol("S#42539", "CYC"), makeSymbol("S#42540", "CYC"), makeSymbol("S#42541", "CYC"), makeSymbol("S#42542", "CYC"), makeSymbol("S#42543", "CYC"), makeSymbol("S#42544", "CYC"), makeSymbol("S#42545", "CYC") });
        $ic6$ = makeSymbol("S#42566", "CYC");
        $ic7$ = makeSymbol("S#42515", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#42514", "CYC"));
        $ic9$ = makeSymbol("S#42516", "CYC");
        $ic10$ = makeSymbol("S#42531", "CYC");
        $ic11$ = makeSymbol("S#42517", "CYC");
        $ic12$ = makeSymbol("S#42532", "CYC");
        $ic13$ = makeSymbol("S#42518", "CYC");
        $ic14$ = makeSymbol("S#42533", "CYC");
        $ic15$ = makeSymbol("S#42519", "CYC");
        $ic16$ = makeSymbol("S#42534", "CYC");
        $ic17$ = makeSymbol("S#42520", "CYC");
        $ic18$ = makeSymbol("S#42535", "CYC");
        $ic19$ = makeSymbol("S#42521", "CYC");
        $ic20$ = makeSymbol("S#42536", "CYC");
        $ic21$ = makeSymbol("S#42522", "CYC");
        $ic22$ = makeSymbol("S#42537", "CYC");
        $ic23$ = makeSymbol("S#42523", "CYC");
        $ic24$ = makeSymbol("S#42538", "CYC");
        $ic25$ = makeSymbol("S#42524", "CYC");
        $ic26$ = makeSymbol("S#42539", "CYC");
        $ic27$ = makeSymbol("S#42525", "CYC");
        $ic28$ = makeSymbol("S#42540", "CYC");
        $ic29$ = makeSymbol("S#42526", "CYC");
        $ic30$ = makeSymbol("S#42541", "CYC");
        $ic31$ = makeSymbol("S#42527", "CYC");
        $ic32$ = makeSymbol("S#42542", "CYC");
        $ic33$ = makeSymbol("S#42528", "CYC");
        $ic34$ = makeSymbol("S#42543", "CYC");
        $ic35$ = makeSymbol("S#42529", "CYC");
        $ic36$ = makeSymbol("S#42544", "CYC");
        $ic37$ = makeSymbol("S#42530", "CYC");
        $ic38$ = makeSymbol("S#42545", "CYC");
        $ic39$ = makeKeyword("CYCL-ID");
        $ic40$ = makeKeyword("FORMULA");
        $ic41$ = makeKeyword("MT");
        $ic42$ = makeKeyword("COMMENT");
        $ic43$ = makeKeyword("MAX-NUMBER-OF-RESULTS");
        $ic44$ = makeKeyword("BACK-CHAINING");
        $ic45$ = makeKeyword("TIME-CUTOFF-SECS");
        $ic46$ = makeKeyword("MAX-DEPTH");
        $ic47$ = makeKeyword("REMOVAL-COST-CUTOFF");
        $ic48$ = makeKeyword("ENABLE-NEGATION-BY-FAILURE");
        $ic49$ = makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING");
        $ic50$ = makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
        $ic51$ = makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
        $ic52$ = makeKeyword("ENABLE-SEMANTIC-PRUNING");
        $ic53$ = makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
        $ic54$ = makeString("Invalid slot ~S for construction function");
        $ic55$ = makeKeyword("BEGIN");
        $ic56$ = makeSymbol("S#42546", "CYC");
        $ic57$ = makeKeyword("SLOT");
        $ic58$ = makeKeyword("END");
        $ic59$ = makeSymbol("S#42548", "CYC");
        $ic60$ = makeString("~%~Acycl-query-specification:~%");
        $ic61$ = makeString("~Acycl-id:  ~A~%");
        $ic62$ = makeString("~Aformula: ~A~%");
        $ic63$ = makeString("~Amt: ~S~%");
        $ic64$ = makeString("~Acomment: ~A~%");
        $ic65$ = makeString("~Amax-number-of-results: ~A~%");
        $ic66$ = makeString("~Aback-chaining: ~A~%");
        $ic67$ = makeString("~Atime-cutoff-secs: ~A~%");
        $ic68$ = makeString("~Amax-depth: ~A~%");
        $ic69$ = makeString("~Aremoval-cost-cutoff: ~A~%");
        $ic70$ = makeString("~Aenable-negation-by-failure: ~A~%");
        $ic71$ = makeString("~Aenable-hl-predicate-backchaining: ~A~%");
        $ic72$ = makeString("~Aenable-cache-backwards-query-results: ~A~%");
        $ic73$ = makeString("~Aenable-unbound-predicate-backchaining: ~A~%");
        $ic74$ = makeString("~Aenable-semantic-pruning: ~A~%");
        $ic75$ = makeString("~Aenable-consideration-of-disjunctive-temporal-relations: ~A~%~%");
        $ic76$ = makeInteger(30);
        $ic77$ = makeInteger(10000);
        $ic78$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceFormulaParameter"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMicrotheoryParameter"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMaxAnswersParameter"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMaxTransformationStepsParameter"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMaxTimeParameter"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMaxProofDepthParameter"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceAllowUnboundPredicateTransformationParameter"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceProductivityLimitParameter"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceEnableConsiderDisjunctiveTemporalRelationsParameter"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceEnableSemanticPruningParameter"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceCacheInferenceResultsParameter"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceAllowHLPredicateTransformationParameter"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceNegationByFailureParameter"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic92$ = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic93$ = makeSymbol("S#16717", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("?COMMENT"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueInSpecification"));
        $ic96$ = makeSymbol("?PARAM");
        $ic97$ = makeSymbol("?VAL");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#5251", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"));
        $ic99$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic100$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic101$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic102$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic103$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic104$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic105$ = makeKeyword("RETURN");
        $ic106$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic107$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic108$ = makeKeyword("ANSWER-LANGUAGE");
        $ic109$ = makeKeyword("HL");
        $ic110$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic111$ = makeKeyword("MAX-TIME");
        $ic112$ = makeKeyword("MAX-NUMBER");
    }
    
    public static final class $sX42513_native extends SubLStructNative
    {
        public SubLObject $cycl_id;
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $comment;
        public SubLObject $max_number_of_results;
        public SubLObject $back_chaining;
        public SubLObject $time_cutoff_secs;
        public SubLObject $max_depth;
        public SubLObject $removal_cost_cutoff;
        public SubLObject $enable_negation_by_failure;
        public SubLObject $enable_hl_predicate_backchaining;
        public SubLObject $enable_cache_backwards_query_results;
        public SubLObject $enable_unbound_predicate_backchaining;
        public SubLObject $enable_semantic_pruning;
        public SubLObject $enable_consideration_of_disjunctive_temporal_relations;
        public static final SubLStructDeclNative structDecl;
        
        public $sX42513_native() {
            this.$cycl_id = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$max_number_of_results = (SubLObject)CommonSymbols.NIL;
            this.$back_chaining = (SubLObject)CommonSymbols.NIL;
            this.$time_cutoff_secs = (SubLObject)CommonSymbols.NIL;
            this.$max_depth = (SubLObject)CommonSymbols.NIL;
            this.$removal_cost_cutoff = (SubLObject)CommonSymbols.NIL;
            this.$enable_negation_by_failure = (SubLObject)CommonSymbols.NIL;
            this.$enable_hl_predicate_backchaining = (SubLObject)CommonSymbols.NIL;
            this.$enable_cache_backwards_query_results = (SubLObject)CommonSymbols.NIL;
            this.$enable_unbound_predicate_backchaining = (SubLObject)CommonSymbols.NIL;
            this.$enable_semantic_pruning = (SubLObject)CommonSymbols.NIL;
            this.$enable_consideration_of_disjunctive_temporal_relations = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX42513_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl_id;
        }
        
        public SubLObject getField3() {
            return this.$formula;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$comment;
        }
        
        public SubLObject getField6() {
            return this.$max_number_of_results;
        }
        
        public SubLObject getField7() {
            return this.$back_chaining;
        }
        
        public SubLObject getField8() {
            return this.$time_cutoff_secs;
        }
        
        public SubLObject getField9() {
            return this.$max_depth;
        }
        
        public SubLObject getField10() {
            return this.$removal_cost_cutoff;
        }
        
        public SubLObject getField11() {
            return this.$enable_negation_by_failure;
        }
        
        public SubLObject getField12() {
            return this.$enable_hl_predicate_backchaining;
        }
        
        public SubLObject getField13() {
            return this.$enable_cache_backwards_query_results;
        }
        
        public SubLObject getField14() {
            return this.$enable_unbound_predicate_backchaining;
        }
        
        public SubLObject getField15() {
            return this.$enable_semantic_pruning;
        }
        
        public SubLObject getField16() {
            return this.$enable_consideration_of_disjunctive_temporal_relations;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$max_number_of_results = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$back_chaining = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$time_cutoff_secs = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$max_depth = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$removal_cost_cutoff = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$enable_negation_by_failure = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$enable_hl_predicate_backchaining = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$enable_cache_backwards_query_results = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$enable_unbound_predicate_backchaining = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$enable_semantic_pruning = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$enable_consideration_of_disjunctive_temporal_relations = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX42513_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$cycl_id", "$formula", "$mt", "$comment", "$max_number_of_results", "$back_chaining", "$time_cutoff_secs", "$max_depth", "$removal_cost_cutoff", "$enable_negation_by_failure", "$enable_hl_predicate_backchaining", "$enable_cache_backwards_query_results", "$enable_unbound_predicate_backchaining", "$enable_semantic_pruning", "$enable_consideration_of_disjunctive_temporal_relations" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f38811$UnaryFunction extends UnaryFunction
    {
        public $f38811$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#42514"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f38811(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 257 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/