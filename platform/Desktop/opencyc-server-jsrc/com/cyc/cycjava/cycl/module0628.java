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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0628 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0628";
    public static final String myFingerPrint = "3de4ff505be064384188e10aa9d45744121643d308a9de10bf1c252b5452c03e";
    private static SubLSymbol $g4830$;
    public static SubLSymbol $g4831$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
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
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    
    
    public static SubLObject f38585(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var5 == module0628.UNPROVIDED) {
            var5 = module0628.$g4830$.getDynamicValue();
        }
        if (var6 == module0628.UNPROVIDED) {
            var6 = (SubLObject)module0628.T;
        }
        if (var7 == module0628.UNPROVIDED) {
            var7 = (SubLObject)module0628.ZERO_INTEGER;
        }
        if (var8 == module0628.UNPROVIDED) {
            var8 = (SubLObject)module0628.NIL;
        }
        assert module0628.NIL != module0369.f25417(var1) : var1;
        assert module0628.NIL != module0059.f4273(var2) : var2;
        if (module0628.NIL != var3 && !module0628.areAssertionsDisabledFor(me) && module0628.NIL == Types.function_spec_p(var3)) {
            throw new AssertionError(var3);
        }
        assert module0628.NIL != module0035.f2327(var4) : var4;
        assert module0628.NIL != module0048.f3294(var5) : var5;
        assert module0628.NIL != module0004.f106(var7) : var7;
        return f38586(var1, var2, var3, var4, var5, var6, var7, var8);
    }
    
    public static SubLObject f38587(final SubLObject var9) {
        f38588(var9);
        return f38589(var9);
    }
    
    public static SubLObject f38590(final SubLObject var9) {
        return f38589(var9);
    }
    
    public static SubLObject f38591(final SubLObject var10, final SubLObject var11) {
        f38592(var10, var11, (SubLObject)module0628.ZERO_INTEGER);
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38593(final SubLObject var10) {
        return (SubLObject)((var10.getClass() == $sX42217_native.class) ? module0628.T : module0628.NIL);
    }
    
    public static SubLObject f38594(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField2();
    }
    
    public static SubLObject f38595(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField3();
    }
    
    public static SubLObject f38596(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField4();
    }
    
    public static SubLObject f38597(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField5();
    }
    
    public static SubLObject f38598(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField6();
    }
    
    public static SubLObject f38599(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField7();
    }
    
    public static SubLObject f38600(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField8();
    }
    
    public static SubLObject f38601(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField9();
    }
    
    public static SubLObject f38602(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField10();
    }
    
    public static SubLObject f38603(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField11();
    }
    
    public static SubLObject f38604(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField12();
    }
    
    public static SubLObject f38605(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField13();
    }
    
    public static SubLObject f38606(final SubLObject var10) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.getField14();
    }
    
    public static SubLObject f38607(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField2(var13);
    }
    
    public static SubLObject f38608(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField3(var13);
    }
    
    public static SubLObject f38609(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField4(var13);
    }
    
    public static SubLObject f38610(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField5(var13);
    }
    
    public static SubLObject f38611(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField6(var13);
    }
    
    public static SubLObject f38612(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField7(var13);
    }
    
    public static SubLObject f38613(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField8(var13);
    }
    
    public static SubLObject f38614(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField9(var13);
    }
    
    public static SubLObject f38615(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField10(var13);
    }
    
    public static SubLObject f38616(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField11(var13);
    }
    
    public static SubLObject f38617(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField12(var13);
    }
    
    public static SubLObject f38618(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField13(var13);
    }
    
    public static SubLObject f38619(final SubLObject var10, final SubLObject var13) {
        assert module0628.NIL != f38593(var10) : var10;
        return var10.setField14(var13);
    }
    
    public static SubLObject f38620(SubLObject var14) {
        if (var14 == module0628.UNPROVIDED) {
            var14 = (SubLObject)module0628.NIL;
        }
        final SubLObject var15 = (SubLObject)new $sX42217_native();
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = (SubLObject)module0628.NIL, var16 = var14; module0628.NIL != var16; var16 = conses_high.cddr(var16)) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = var17;
            if (var19.eql((SubLObject)module0628.$ic41$)) {
                f38607(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic42$)) {
                f38608(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic43$)) {
                f38609(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic44$)) {
                f38610(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic45$)) {
                f38611(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic46$)) {
                f38612(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic47$)) {
                f38613(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic48$)) {
                f38614(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic49$)) {
                f38615(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic50$)) {
                f38616(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic51$)) {
                f38617(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic52$)) {
                f38618(var15, var18);
            }
            else if (var19.eql((SubLObject)module0628.$ic53$)) {
                f38619(var15, var18);
            }
            else {
                Errors.error((SubLObject)module0628.$ic54$, var17);
            }
        }
        return var15;
    }
    
    public static SubLObject f38621(final SubLObject var20, final SubLObject var21) {
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic55$, (SubLObject)module0628.$ic56$, (SubLObject)module0628.THIRTEEN_INTEGER);
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic41$, f38594(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic42$, f38595(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic43$, f38596(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic44$, f38597(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic45$, f38598(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic46$, f38599(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic47$, f38600(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic48$, f38601(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic49$, f38602(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic50$, f38603(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic51$, f38604(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic52$, f38605(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic57$, (SubLObject)module0628.$ic53$, f38606(var20));
        Functions.funcall(var21, var20, (SubLObject)module0628.$ic58$, (SubLObject)module0628.$ic56$, (SubLObject)module0628.THIRTEEN_INTEGER);
        return var20;
    }
    
    public static SubLObject f38622(final SubLObject var20, final SubLObject var21) {
        return f38621(var20, var21);
    }
    
    public static SubLObject f38592(final SubLObject var22, final SubLObject var11, final SubLObject var23) {
        print_high.princ((SubLObject)module0628.$ic60$, var11);
        if (module0628.NIL != f38623(var22)) {
            print_high.princ((SubLObject)module0628.$ic61$, var11);
        }
        else {
            PrintLow.format(var11, (SubLObject)module0628.$ic62$, f38624(var22));
        }
        print_high.princ((SubLObject)module0628.$ic63$, var11);
        return var22;
    }
    
    public static SubLObject f38586(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = f38620((SubLObject)module0628.UNPROVIDED);
        f38607(var9, var1);
        f38608(var9, var2);
        f38609(var9, var3);
        f38610(var9, var4);
        f38611(var9, var5);
        f38612(var9, var6);
        f38613(var9, var7);
        f38614(var9, (SubLObject)module0628.NIL);
        f38615(var9, Semaphores.new_semaphore((SubLObject)module0628.$ic64$, (SubLObject)module0628.ZERO_INTEGER));
        f38616(var9, Numbers.subtract(Time.get_internal_real_time(), var5));
        f38617(var9, module0055.f4017());
        f38618(var9, var8);
        f38619(var9, (SubLObject)module0628.NIL);
        return var9;
    }
    
    public static SubLObject f38625(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38594(var9);
    }
    
    public static SubLObject f38624(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38595(var9);
    }
    
    public static SubLObject f38626(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38596(var9);
    }
    
    public static SubLObject f38627(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38597(var9);
    }
    
    public static SubLObject f38628(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38598(var9);
    }
    
    public static SubLObject f38629(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38599(var9);
    }
    
    public static SubLObject f38630(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38600(var9);
    }
    
    public static SubLObject f38631(final SubLObject var9) {
        f38613(var9, Numbers.add(f38600(var9), (SubLObject)module0628.ONE_INTEGER));
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38589(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38601(var9);
    }
    
    public static SubLObject f38623(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return Numbers.numGE(Semaphores.semaphore_current_count(f38602(var9)), (SubLObject)module0628.ONE_INTEGER);
    }
    
    public static SubLObject f38632(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        Semaphores.semaphore_signal(f38602(var9));
        return (SubLObject)module0628.T;
    }
    
    public static SubLObject f38633(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return f38603(var9);
    }
    
    public static SubLObject f38634(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        f38616(var9, Time.get_internal_real_time());
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38635(final SubLObject var9, final SubLObject var24) {
        assert module0628.NIL != f38593(var9) : var9;
        return module0055.f4021(var24, f38604(var9));
    }
    
    public static SubLObject f38636(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return module0055.f4023(f38604(var9));
    }
    
    public static SubLObject f38637(final SubLObject var9) {
        assert module0628.NIL != f38593(var9) : var9;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0628.NIL == module0055.f4019(f38604(var9)));
    }
    
    public static SubLObject f38638(final SubLObject var22) {
        return f38639(var22);
    }
    
    public static SubLObject f38639(final SubLObject var9) {
        return Sxhash.sxhash(f38594(var9));
    }
    
    public static SubLObject f38588(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0628.NIL;
        SubLObject var12 = (SubLObject)module0628.NIL;
        SubLObject var13 = (SubLObject)module0628.NIL;
        while (module0628.NIL == var12 && module0628.NIL == f38623(var9) && (module0628.NIL == var11 || module0628.NIL == f38640(var9))) {
            final SubLObject var14 = f38641(var9);
            var10.resetMultipleValues();
            final SubLObject var30_31 = module0059.f4287(f38624(var9), var14, (SubLObject)module0628.UNPROVIDED);
            final SubLObject var32_33 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var13 = var30_31;
            var12 = var32_33;
            if (module0628.NIL != var13) {
                final SubLObject var15 = f38642(var9, var13);
                if (module0628.NIL == var15) {
                    continue;
                }
                var11 = (SubLObject)module0628.T;
            }
        }
        if (module0628.NIL != f38629(var9) && module0628.NIL != var11) {
            f38635(var9, (SubLObject)ConsesLow.list((SubLObject)module0628.$ic66$, f38601(var9)));
            f38634(var9);
            f38614(var9, (SubLObject)module0628.NIL);
        }
        f38643(var9);
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38643(final SubLObject var9) {
        while (module0628.NIL != f38637(var9)) {
            final SubLObject var10 = f38636(var9);
            module0623.f38420(var10);
        }
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38640(final SubLObject var9) {
        return Numbers.numG(f38644(var9), f38628(var9));
    }
    
    public static SubLObject f38641(final SubLObject var9) {
        final SubLObject var10 = f38628(var9);
        final SubLObject var11 = f38644(var9);
        SubLObject var12 = Numbers.subtract(var10, var11);
        if (!var12.isPositive()) {
            var12 = var10;
        }
        var12 = module0051.f3572(var12);
        if (var12.numL((SubLObject)module0628.ONE_INTEGER)) {
            var12 = (SubLObject)module0628.ONE_INTEGER;
        }
        return var12;
    }
    
    public static SubLObject f38645(final SubLObject var9, final SubLObject var37) {
        if (module0628.NIL == Threads.valid_process_p(f38605(var9))) {
            final SubLObject var38 = f38606(var9);
            if (var38.isInteger()) {
                if (Time.get_universal_time().numGE(var38)) {
                    return (SubLObject)module0628.NIL;
                }
            }
            else {
                f38619(var9, Numbers.add(Time.get_universal_time(), (SubLObject)module0628.TWO_INTEGER));
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0628.NIL == module0360.f23870(var37) && module0628.$ic67$ != var37);
    }
    
    public static SubLObject f38644(final SubLObject var9) {
        final SubLObject var10 = f38633(var9);
        SubLObject var11 = Numbers.subtract(Time.get_internal_real_time(), var10);
        if (var11.isNegative()) {
            var11 = f38628(var9);
        }
        return var11;
    }
    
    public static SubLObject f38642(final SubLObject var9, final SubLObject var28) {
        final SubLObject var29 = f38629(var9);
        SubLObject var30 = (SubLObject)module0628.NIL;
        if (var28 == module0628.$ic68$) {
            final SubLObject var31 = f38625(var9);
            final SubLObject var32 = module0369.f25616(var31, f38630(var9));
            if (module0628.NIL != var32) {
                f38631(var9);
                var30 = (SubLObject)module0628.T;
                final SubLObject var33 = f38646(var9, var32);
                f38647(var9, var33);
            }
        }
        else if (var28.isList() && var28.first() == module0628.$ic69$) {
            final SubLObject var34 = conses_high.second(var28);
            final SubLObject var35 = conses_high.third(var28);
            f38648(var9, var34, var29, var35);
            if (module0628.NIL == f38645(var9, var34)) {
                f38632(var9);
            }
        }
        return var30;
    }
    
    public static SubLObject f38647(final SubLObject var9, final SubLObject var42) {
        final SubLObject var43 = f38601(var9);
        f38614(var9, module0035.f2084(var42, var43));
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38648(final SubLObject var9, final SubLObject var37, final SubLObject var6, final SubLObject var44) {
        if (module0628.NIL != var6) {
            f38635(var9, (SubLObject)ConsesLow.list((SubLObject)module0628.$ic70$, var37, var44));
        }
        else {
            PrintLow.format((SubLObject)module0628.T, (SubLObject)module0628.$ic71$, var37, var44);
        }
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38646(final SubLObject var9, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = f38625(var9);
        final SubLObject var49 = f38626(var9);
        if (module0628.NIL == var49) {
            return f38649(module0409.f28534(var46, module0369.f25500(var48)));
        }
        final SubLObject var50 = f38627(var9);
        SubLObject var51 = (SubLObject)module0628.NIL;
        final SubLObject var52 = (SubLObject)module0628.NIL;
        final SubLObject var53 = module0579.$g4296$.currentBinding(var47);
        final SubLObject var54 = module0579.$g4278$.currentBinding(var47);
        final SubLObject var55 = module0579.$g4273$.currentBinding(var47);
        final SubLObject var56 = module0579.$g4238$.currentBinding(var47);
        final SubLObject var57 = module0579.$g4350$.currentBinding(var47);
        final SubLObject var58 = module0579.$g4351$.currentBinding(var47);
        final SubLObject var59 = module0579.$g4352$.currentBinding(var47);
        final SubLObject var60 = module0579.$g4355$.currentBinding(var47);
        final SubLObject var61 = module0579.$g4353$.currentBinding(var47);
        try {
            module0579.$g4296$.bind(var46, var47);
            module0579.$g4278$.bind(module0369.f25491(module0369.f25732(var46)), var47);
            module0579.$g4273$.bind((SubLObject)module0628.T, var47);
            module0579.$g4238$.bind((SubLObject)module0628.T, var47);
            module0579.$g4350$.bind((SubLObject)module0628.NIL, var47);
            module0579.$g4351$.bind(module0775.f49671(), var47);
            module0579.$g4352$.bind(module0775.f49672(), var47);
            module0579.$g4355$.bind((SubLObject)module0628.ZERO_INTEGER, var47);
            module0579.$g4353$.bind((SubLObject)module0628.NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var62 = module0580.f35615();
            final SubLObject var63 = var47.secondMultipleValue();
            var47.resetMultipleValues();
            final SubLObject var48_59 = module0579.$g4298$.currentBinding(var47);
            final SubLObject var49_60 = module0579.$g4301$.currentBinding(var47);
            try {
                module0579.$g4298$.bind((module0628.NIL != var62) ? var62 : module0579.$g4298$.getDynamicValue(var47), var47);
                module0579.$g4301$.bind((module0628.NIL != var63) ? var63 : module0579.$g4301$.getDynamicValue(var47), var47);
                if (module0628.NIL == var52) {
                    final SubLObject var64 = Functions.funcall(var49, var46, var50);
                    var51 = (SubLObject)ConsesLow.list((SubLObject)module0628.$ic72$, var64);
                }
            }
            finally {
                module0579.$g4301$.rebind(var49_60, var47);
                module0579.$g4298$.rebind(var48_59, var47);
            }
        }
        finally {
            module0579.$g4353$.rebind(var61, var47);
            module0579.$g4355$.rebind(var60, var47);
            module0579.$g4352$.rebind(var59, var47);
            module0579.$g4351$.rebind(var58, var47);
            module0579.$g4350$.rebind(var57, var47);
            module0579.$g4238$.rebind(var56, var47);
            module0579.$g4273$.rebind(var55, var47);
            module0579.$g4278$.rebind(var54, var47);
            module0579.$g4296$.rebind(var53, var47);
        }
        return var51;
    }
    
    public static SubLObject f38649(final SubLObject var62) {
        SubLObject var63 = var62;
        SubLObject var64 = (SubLObject)module0628.NIL;
        SubLObject var65 = (SubLObject)module0628.NIL;
        SubLObject var66 = (SubLObject)module0628.NIL;
        SubLObject var67 = (SubLObject)module0628.NIL;
        var65 = var63;
        var66 = var65.first();
        for (var67 = (SubLObject)module0628.ZERO_INTEGER; module0628.NIL != var65; var65 = var65.rest(), var66 = var65.first(), var67 = Numbers.add((SubLObject)module0628.ONE_INTEGER, var67)) {
            if (module0628.NIL != module0208.f13537(module0233.f15370(var66), (SubLObject)module0628.UNPROVIDED)) {
                var64 = module0035.f2063(var64, var67, module0209.f13552(module0233.f15370(var66)), (SubLObject)module0628.UNPROVIDED);
            }
        }
        SubLObject var68 = var64;
        SubLObject var69 = (SubLObject)module0628.NIL;
        var69 = var68.first();
        while (module0628.NIL != var68) {
            SubLObject var71;
            final SubLObject var70 = var71 = var69;
            SubLObject var72 = (SubLObject)module0628.NIL;
            SubLObject var73 = (SubLObject)module0628.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0628.$ic73$);
            var72 = var71.first();
            var71 = (var73 = var71.rest());
            var63 = module0035.f2151(var72, module0233.f15340(module0233.f15355(ConsesLow.nth(var72, var63)), var73), var63);
            var68 = var68.rest();
            var69 = var68.first();
        }
        return var63;
    }
    
    public static SubLObject f38650() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38585", "S#42148", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38587", "S#42150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38590", "S#42151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38591", "S#42219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38593", "S#42218", 1, 0, false);
        new $f38593$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38594", "S#42220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38595", "S#42221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38596", "S#42222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38597", "S#42223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38598", "S#42224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38599", "S#42225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38600", "S#42226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38601", "S#42227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38602", "S#42228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38603", "S#42229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38604", "S#42230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38605", "S#42231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38606", "S#42232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38607", "S#42233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38608", "S#42234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38609", "S#42235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38610", "S#42236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38611", "S#42237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38612", "S#42238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38613", "S#42239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38614", "S#42240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38615", "S#42241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38616", "S#42242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38617", "S#42243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38618", "S#42244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38619", "S#42245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38620", "S#42246", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38621", "S#42247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38622", "S#42248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38592", "S#42249", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38586", "S#42250", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38625", "S#42251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38624", "S#42252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38626", "S#42253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38627", "S#42254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38628", "S#42255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38629", "S#42256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38630", "S#42257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38631", "S#42258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38589", "S#42259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38623", "S#42149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38632", "S#42260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38633", "S#42261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38634", "S#42262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38635", "S#42263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38636", "S#42264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38637", "S#42265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38638", "S#42266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38639", "S#42267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38588", "S#42268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38643", "S#42269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38640", "S#42270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38641", "S#42271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38645", "S#42272", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38644", "S#42273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38642", "S#42274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38647", "S#42275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38648", "S#42276", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38646", "S#42277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0628", "f38649", "S#42278", 1, 0, false);
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38651() {
        module0628.$g4830$ = SubLFiles.defparameter("S#42279", module0051.f3570((SubLObject)module0628.ONE_INTEGER));
        module0628.$g4831$ = SubLFiles.defconstant("S#42280", (SubLObject)module0628.$ic6$);
        return (SubLObject)module0628.NIL;
    }
    
    public static SubLObject f38652() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0628.$g4831$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0628.$ic13$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0628.$ic14$);
        Structures.def_csetf((SubLObject)module0628.$ic15$, (SubLObject)module0628.$ic16$);
        Structures.def_csetf((SubLObject)module0628.$ic17$, (SubLObject)module0628.$ic18$);
        Structures.def_csetf((SubLObject)module0628.$ic19$, (SubLObject)module0628.$ic20$);
        Structures.def_csetf((SubLObject)module0628.$ic21$, (SubLObject)module0628.$ic22$);
        Structures.def_csetf((SubLObject)module0628.$ic23$, (SubLObject)module0628.$ic24$);
        Structures.def_csetf((SubLObject)module0628.$ic25$, (SubLObject)module0628.$ic26$);
        Structures.def_csetf((SubLObject)module0628.$ic27$, (SubLObject)module0628.$ic28$);
        Structures.def_csetf((SubLObject)module0628.$ic29$, (SubLObject)module0628.$ic30$);
        Structures.def_csetf((SubLObject)module0628.$ic31$, (SubLObject)module0628.$ic32$);
        Structures.def_csetf((SubLObject)module0628.$ic33$, (SubLObject)module0628.$ic34$);
        Structures.def_csetf((SubLObject)module0628.$ic35$, (SubLObject)module0628.$ic36$);
        Structures.def_csetf((SubLObject)module0628.$ic37$, (SubLObject)module0628.$ic38$);
        Structures.def_csetf((SubLObject)module0628.$ic39$, (SubLObject)module0628.$ic40$);
        Equality.identity((SubLObject)module0628.$ic6$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0628.$g4831$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0628.$ic59$));
        module0012.f419((SubLObject)module0628.$ic12$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0628.$g4831$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0628.$ic65$));
        return (SubLObject)module0628.NIL;
    }
    
    public void declareFunctions() {
        f38650();
    }
    
    public void initializeVariables() {
        f38651();
    }
    
    public void runTopLevelForms() {
        f38652();
    }
    
    static {
        me = (SubLFile)new module0628();
        module0628.$g4830$ = null;
        module0628.$g4831$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#27365", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#5676", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#65", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic6$ = SubLObjectFactory.makeSymbol("S#42217", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#42218", "CYC");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#25426", "CYC"), SubLObjectFactory.makeSymbol("S#5675", "CYC"), SubLObjectFactory.makeSymbol("S#42206", "CYC"), SubLObjectFactory.makeSymbol("S#42205", "CYC"), SubLObjectFactory.makeSymbol("S#42281", "CYC"), SubLObjectFactory.makeSymbol("S#42207", "CYC"), SubLObjectFactory.makeSymbol("S#42282", "CYC"), SubLObjectFactory.makeSymbol("S#3273", "CYC"), SubLObjectFactory.makeSymbol("S#15403", "CYC"), SubLObjectFactory.makeSymbol("S#42283", "CYC"), SubLObjectFactory.makeSymbol("S#42284", "CYC"), SubLObjectFactory.makeSymbol("S#42285", "CYC"), SubLObjectFactory.makeSymbol("S#42286", "CYC") });
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INFERENCE"), SubLObjectFactory.makeKeyword("IPC-QUEUE"), SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION"), SubLObjectFactory.makeKeyword("NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), SubLObjectFactory.makeKeyword("INCREMENTAL-RESULTS?"), SubLObjectFactory.makeKeyword("NEXT-ANSWER-INDEX"), SubLObjectFactory.makeKeyword("RESULTS"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("LAST-ANSWER-POST-TIME"), SubLObjectFactory.makeKeyword("MESSAGE-QUEUE"), SubLObjectFactory.makeKeyword("INFERENCE-PROCESS"), SubLObjectFactory.makeKeyword("INFERENCE-DEATH-COUNTER") });
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#42220", "CYC"), SubLObjectFactory.makeSymbol("S#42221", "CYC"), SubLObjectFactory.makeSymbol("S#42222", "CYC"), SubLObjectFactory.makeSymbol("S#42223", "CYC"), SubLObjectFactory.makeSymbol("S#42224", "CYC"), SubLObjectFactory.makeSymbol("S#42225", "CYC"), SubLObjectFactory.makeSymbol("S#42226", "CYC"), SubLObjectFactory.makeSymbol("S#42227", "CYC"), SubLObjectFactory.makeSymbol("S#42228", "CYC"), SubLObjectFactory.makeSymbol("S#42229", "CYC"), SubLObjectFactory.makeSymbol("S#42230", "CYC"), SubLObjectFactory.makeSymbol("S#42231", "CYC"), SubLObjectFactory.makeSymbol("S#42232", "CYC") });
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#42233", "CYC"), SubLObjectFactory.makeSymbol("S#42234", "CYC"), SubLObjectFactory.makeSymbol("S#42235", "CYC"), SubLObjectFactory.makeSymbol("S#42236", "CYC"), SubLObjectFactory.makeSymbol("S#42237", "CYC"), SubLObjectFactory.makeSymbol("S#42238", "CYC"), SubLObjectFactory.makeSymbol("S#42239", "CYC"), SubLObjectFactory.makeSymbol("S#42240", "CYC"), SubLObjectFactory.makeSymbol("S#42241", "CYC"), SubLObjectFactory.makeSymbol("S#42242", "CYC"), SubLObjectFactory.makeSymbol("S#42243", "CYC"), SubLObjectFactory.makeSymbol("S#42244", "CYC"), SubLObjectFactory.makeSymbol("S#42245", "CYC") });
        $ic12$ = SubLObjectFactory.makeSymbol("S#42249", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#42219", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#42218", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#42220", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#42233", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#42221", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#42234", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#42222", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#42235", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#42223", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#42236", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#42224", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#42237", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#42225", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#42238", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#42226", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#42239", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#42227", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#42240", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#42228", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#42241", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#42229", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#42242", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#42230", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#42243", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#42231", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#42244", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#42232", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#42245", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic42$ = SubLObjectFactory.makeKeyword("IPC-QUEUE");
        $ic43$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION");
        $ic44$ = SubLObjectFactory.makeKeyword("NL-GENERATION-PROPERTIES");
        $ic45$ = SubLObjectFactory.makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $ic46$ = SubLObjectFactory.makeKeyword("INCREMENTAL-RESULTS?");
        $ic47$ = SubLObjectFactory.makeKeyword("NEXT-ANSWER-INDEX");
        $ic48$ = SubLObjectFactory.makeKeyword("RESULTS");
        $ic49$ = SubLObjectFactory.makeKeyword("DONE?");
        $ic50$ = SubLObjectFactory.makeKeyword("LAST-ANSWER-POST-TIME");
        $ic51$ = SubLObjectFactory.makeKeyword("MESSAGE-QUEUE");
        $ic52$ = SubLObjectFactory.makeKeyword("INFERENCE-PROCESS");
        $ic53$ = SubLObjectFactory.makeKeyword("INFERENCE-DEATH-COUNTER");
        $ic54$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic55$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic56$ = SubLObjectFactory.makeSymbol("S#42246", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic58$ = SubLObjectFactory.makeKeyword("END");
        $ic59$ = SubLObjectFactory.makeSymbol("S#42248", "CYC");
        $ic60$ = SubLObjectFactory.makeString("<INFERENCE-IPC-QUEUE-PROCESSOR");
        $ic61$ = SubLObjectFactory.makeString(" DONE");
        $ic62$ = SubLObjectFactory.makeString(" ~S");
        $ic63$ = SubLObjectFactory.makeString(">");
        $ic64$ = SubLObjectFactory.makeString("inference-done");
        $ic65$ = SubLObjectFactory.makeSymbol("S#42266", "CYC");
        $ic66$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER");
        $ic67$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic68$ = SubLObjectFactory.makeKeyword("NEW-ANSWER");
        $ic69$ = SubLObjectFactory.makeKeyword("STATUS-CHANGE");
        $ic70$ = SubLObjectFactory.makeKeyword("INFERENCE-STATUS");
        $ic71$ = SubLObjectFactory.makeString("New Inference Status: ~A~%Inference Suspend Status: ~A~%");
        $ic72$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic73$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42287", "CYC"));
    }
    
    public static final class $sX42217_native extends SubLStructNative
    {
        public SubLObject $inference;
        public SubLObject $ipc_queue;
        public SubLObject $inference_answer_process_function;
        public SubLObject $nl_generation_properties;
        public SubLObject $minimum_time_before_sending_new_answers;
        public SubLObject $incremental_resultsP;
        public SubLObject $next_answer_index;
        public SubLObject $results;
        public SubLObject $doneP;
        public SubLObject $last_answer_post_time;
        public SubLObject $message_queue;
        public SubLObject $inference_process;
        public SubLObject $inference_death_counter;
        private static final SubLStructDeclNative structDecl;
        
        public $sX42217_native() {
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$ipc_queue = (SubLObject)CommonSymbols.NIL;
            this.$inference_answer_process_function = (SubLObject)CommonSymbols.NIL;
            this.$nl_generation_properties = (SubLObject)CommonSymbols.NIL;
            this.$minimum_time_before_sending_new_answers = (SubLObject)CommonSymbols.NIL;
            this.$incremental_resultsP = (SubLObject)CommonSymbols.NIL;
            this.$next_answer_index = (SubLObject)CommonSymbols.NIL;
            this.$results = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
            this.$last_answer_post_time = (SubLObject)CommonSymbols.NIL;
            this.$message_queue = (SubLObject)CommonSymbols.NIL;
            this.$inference_process = (SubLObject)CommonSymbols.NIL;
            this.$inference_death_counter = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX42217_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$inference;
        }
        
        public SubLObject getField3() {
            return this.$ipc_queue;
        }
        
        public SubLObject getField4() {
            return this.$inference_answer_process_function;
        }
        
        public SubLObject getField5() {
            return this.$nl_generation_properties;
        }
        
        public SubLObject getField6() {
            return this.$minimum_time_before_sending_new_answers;
        }
        
        public SubLObject getField7() {
            return this.$incremental_resultsP;
        }
        
        public SubLObject getField8() {
            return this.$next_answer_index;
        }
        
        public SubLObject getField9() {
            return this.$results;
        }
        
        public SubLObject getField10() {
            return this.$doneP;
        }
        
        public SubLObject getField11() {
            return this.$last_answer_post_time;
        }
        
        public SubLObject getField12() {
            return this.$message_queue;
        }
        
        public SubLObject getField13() {
            return this.$inference_process;
        }
        
        public SubLObject getField14() {
            return this.$inference_death_counter;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$ipc_queue = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$inference_answer_process_function = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$nl_generation_properties = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$minimum_time_before_sending_new_answers = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$incremental_resultsP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$next_answer_index = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$results = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$doneP = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$last_answer_post_time = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$message_queue = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$inference_process = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$inference_death_counter = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX42217_native.class, module0628.$ic6$, module0628.$ic7$, module0628.$ic8$, module0628.$ic9$, new String[] { "$inference", "$ipc_queue", "$inference_answer_process_function", "$nl_generation_properties", "$minimum_time_before_sending_new_answers", "$incremental_resultsP", "$next_answer_index", "$results", "$doneP", "$last_answer_post_time", "$message_queue", "$inference_process", "$inference_death_counter" }, module0628.$ic10$, module0628.$ic11$, module0628.$ic12$);
        }
    }
    
    public static final class $f38593$UnaryFunction extends UnaryFunction
    {
        public $f38593$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#42218"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0628.f38593(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0628.class
	Total time: 264 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/