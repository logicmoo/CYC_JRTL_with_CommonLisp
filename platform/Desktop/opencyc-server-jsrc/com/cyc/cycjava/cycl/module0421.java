package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0421 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0421";
    public static final String myFingerPrint = "5a44c126b5931c15a3df959f5632b66aa1229bd2f99d0c496dd9ecfb72d6a604";
    public static SubLSymbol $g3415$;
    public static SubLSymbol $g3416$;
    public static SubLSymbol $g3417$;
    public static SubLSymbol $g3418$;
    public static SubLSymbol $g3419$;
    public static SubLSymbol $g3420$;
    public static SubLSymbol $g3421$;
    public static SubLSymbol $g3422$;
    public static SubLSymbol $g3423$;
    public static SubLSymbol $g3424$;
    public static SubLSymbol $g3425$;
    public static SubLSymbol $g3426$;
    public static SubLSymbol $g3427$;
    public static SubLSymbol $g3428$;
    public static SubLSymbol $g3429$;
    public static SubLSymbol $g3430$;
    public static SubLSymbol $g3431$;
    public static SubLSymbol $g3432$;
    public static SubLSymbol $g3433$;
    public static SubLSymbol $g3434$;
    public static SubLSymbol $g3435$;
    public static SubLSymbol $g3436$;
    public static SubLSymbol $g3437$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
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
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
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
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLList $ic157$;
    private static final SubLString $ic158$;
    private static final SubLList $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    
    
    public static SubLObject f29383(SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = $g3415$.getDynamicValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic1$;
        }
        return module0075.f5175((SubLObject)$ic2$, var1, var2);
    }
    
    public static SubLObject f29384(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = module0409.f28506(var3, var4, var5);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (Sequences.length(var9).numG((SubLObject)ONE_INTEGER)) {
                var7 = (SubLObject)ConsesLow.cons(module0233.f15373(var9), var7);
            }
            else {
                var7 = ConsesLow.append(module0233.f15373(var9), var7);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f29385(final SubLObject var10, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var15 = module0538.f33428(var10, var4, var11, var12, var13, var14);
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            var16 = (SubLObject)ConsesLow.cons(conses_high.sublis(var18, var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var16);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var16;
    }
    
    public static SubLObject f29386(final SubLObject var10, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var16) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)T;
        }
        final SubLObject var17 = f29385(var10, var4, var11, var12, var13, var14);
        if (NIL != var17) {
            SubLObject var18 = var17;
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                PrintLow.format(var16, (SubLObject)$ic4$, var19);
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        else {
            PrintLow.format(var16, (SubLObject)$ic5$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29387(final SubLObject var18, final SubLObject var19) {
        return module0259.f16891(var18, var19);
    }
    
    public static SubLObject f29388(final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var21 = module0434.f30570(var11, var12, var13, var14);
        return f29389(var20, var4, var21);
    }
    
    public static SubLObject f29389(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var6).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var6)) {
            var5 = conses_high.putf(var5, (SubLObject)$ic7$, (SubLObject)NIL);
            final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (NIL != $g3424$.getDynamicValue(var6)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var7);
            }
            final SubLObject var8 = Eval.eval(var7);
            if (NIL != var8) {
                if (NIL != $g3424$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic10$, var7, var8);
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var6);
                if (NIL != $g3424$.getDynamicValue(var6) || NIL != $g3432$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic12$, var7, var8);
                }
                if (NIL != $g3421$.getDynamicValue(var6)) {
                    Errors.sublisp_break((SubLObject)$ic13$, new SubLObject[] { var7, var8 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29390(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var25).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var25)) {
            SubLObject var26 = var24;
            SubLObject var27 = (SubLObject)NIL;
            var27 = var26.first();
            while (NIL != var26) {
                if (NIL != $g3424$.getDynamicValue(var25)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var27);
                }
                Eval.eval(var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29391(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var23).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var23)) {
            if (NIL != $g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var22);
            }
            final SubLObject var24 = Eval.eval(var22);
            if (NIL != var24) {
                if (NIL != $g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic14$, var22, var24);
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var23);
                if (NIL != $g3424$.getDynamicValue(var23) || NIL != $g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic15$, var22, var24);
                }
                if (NIL != $g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)$ic13$, new SubLObject[] { var22, var24 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29392(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var23).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var23)) {
            if (NIL != $g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic16$, var23);
                    try {
                        final SubLObject var28_29 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)NIL, var23);
                            Eval.eval(var22);
                            if (NIL != module0538.f33324()) {
                                Errors.error((SubLObject)$ic17$, module0538.f33327());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_29, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var25, var23);
                }
            }
            catch (Throwable var27) {
                var24 = Errors.handleThrowable(var27, module0003.$g3$.getGlobalValue());
            }
            finally {
                var23.throwStack.pop();
            }
            if (NIL != var24) {
                if (NIL != $g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic18$, var24);
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var23);
                if (NIL != $g3424$.getDynamicValue(var23) || NIL != $g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic19$, var22);
                }
                if (NIL != $g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)$ic19$, new SubLObject[] { var22 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29393(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var23).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var23)) {
            if (NIL != $g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic16$, var23);
                    try {
                        final SubLObject var28_32 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)NIL, var23);
                            Eval.eval(var22);
                            if (NIL != module0538.f33321()) {
                                Errors.error((SubLObject)$ic17$, module0538.f33322());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_32, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var25, var23);
                }
            }
            catch (Throwable var27) {
                var24 = Errors.handleThrowable(var27, module0003.$g3$.getGlobalValue());
            }
            finally {
                var23.throwStack.pop();
            }
            if (NIL != var24) {
                if (NIL != $g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic18$, var24);
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var23);
                if (NIL != $g3424$.getDynamicValue(var23) || NIL != $g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic19$, var22);
                }
                if (NIL != $g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)$ic19$, new SubLObject[] { var22 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29394(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var23).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var23)) {
            if (NIL != $g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic16$, var23);
                    try {
                        final SubLObject var28_33 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)NIL, var23);
                            Eval.eval(var22);
                            if (NIL != module0538.f33321()) {
                                Errors.error((SubLObject)$ic17$, module0538.f33322());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_33, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var25, var23);
                }
            }
            catch (Throwable var27) {
                var24 = Errors.handleThrowable(var27, module0003.$g3$.getGlobalValue());
            }
            finally {
                var23.throwStack.pop();
            }
            if (NIL != var24) {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var23);
                if (NIL != $g3424$.getDynamicValue(var23) || NIL != $g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic20$, var24);
                }
                if (NIL != $g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)$ic19$, new SubLObject[] { var22 });
                }
            }
            else if (NIL != $g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic21$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29395(final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var38).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var38)) {
            if (NIL != $g3424$.getDynamicValue(var38)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var36);
            }
            final SubLObject var39 = Eval.eval(var36);
            if (NIL != ((NIL != var37) ? Functions.funcall(var34, var35, var39, var37) : Functions.funcall(var34, var35, var39))) {
                if (NIL != $g3424$.getDynamicValue(var38)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic22$, new SubLObject[] { var36, var39, var35, var34 });
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var38);
                if (NIL != $g3424$.getDynamicValue(var38) || NIL != $g3432$.getDynamicValue(var38)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic23$, new SubLObject[] { var36, var39, var35, var34 });
                }
                if (NIL != $g3421$.getDynamicValue(var38)) {
                    Errors.sublisp_break((SubLObject)$ic24$, new SubLObject[] { var36, var39, var35, var34 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29396(final SubLObject var38, final SubLObject var36) {
        return f29397(var38, var36, (SubLObject)$ic25$);
    }
    
    public static SubLObject f29398(final SubLObject var38, final SubLObject var36) {
        return f29397(var38, var36, (SubLObject)$ic26$);
    }
    
    public static SubLObject f29397(final SubLObject var38, final SubLObject var36, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var40).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var40)) {
            final SubLObject var41 = Eval.eval(var36);
            final SubLObject var42 = (var39 == $ic25$) ? Eval.eval((SubLObject)ConsesLow.list(var38, var41)) : Functions.apply(var38, (SubLObject)ConsesLow.list(var41));
            if (NIL != var42) {
                if (NIL != $g3424$.getDynamicValue(var40)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic27$, new SubLObject[] { var36, var41, var38 });
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var40);
                if (NIL != $g3424$.getDynamicValue(var40)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic28$, new SubLObject[] { var36, var41, var38 });
                }
                if (NIL != $g3421$.getDynamicValue(var40)) {
                    Errors.sublisp_break((SubLObject)$ic29$, new SubLObject[] { var36, var41, var38 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29399(final SubLObject var42, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var43).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var43)) {
            final SubLObject var44 = (SubLObject)ConsesLow.list((SubLObject)$ic30$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (NIL != $g3424$.getDynamicValue(var43)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var44);
            }
            final SubLObject var45 = Eval.eval(var44);
            final SubLObject var46 = conses_high.intersection(var42, var45, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            final SubLObject var47 = conses_high.set_difference(var42, var46, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            final SubLObject var48 = conses_high.set_difference(var45, var42, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            if (NIL != module0035.f2201(var42, var46, Symbols.symbol_function((SubLObject)EQUAL))) {
                if (NIL != $g3424$.getDynamicValue(var43)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic31$, new SubLObject[] { var44, var46, var42 });
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic32$, var43);
                if (NIL != $g3424$.getDynamicValue(var43)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic33$, new SubLObject[] { var44, var46, var42, var47, var48 });
                }
                if (NIL != $g3421$.getDynamicValue(var43)) {
                    Errors.sublisp_break((SubLObject)$ic34$, new SubLObject[] { var44, var46, var42, var47, var48 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29400(final SubLObject var47, final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var48 = module0434.f30570(var11, var12, var13, var14);
        return f29401(var47, var20, var4, var48);
    }
    
    public static SubLObject f29401(final SubLObject var47, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var48).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var48)) {
            var5 = conses_high.putf(var5, (SubLObject)$ic7$, (SubLObject)NIL);
            final SubLObject var49 = (SubLObject)ConsesLow.list((SubLObject)$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (NIL != $g3424$.getDynamicValue(var48)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var49);
            }
            final SubLObject var50 = Eval.eval(var49);
            if (NIL != module0035.f2201(var47, var50, Symbols.symbol_function((SubLObject)$ic35$))) {
                if (NIL != $g3424$.getDynamicValue(var48)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic31$, new SubLObject[] { var49, var50, var47 });
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic32$, var48);
                if (NIL != $g3424$.getDynamicValue(var48)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic36$, new SubLObject[] { var49, var50, var47 });
                }
                if (NIL != $g3421$.getDynamicValue(var48)) {
                    Errors.sublisp_break((SubLObject)$ic37$, new SubLObject[] { var49, var50, var47 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29402(final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var21 = module0434.f30570(var11, var12, var13, var14);
        return f29403(var20, var4, var21);
    }
    
    public static SubLObject f29403(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var6).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var6)) {
            var5 = conses_high.putf(var5, (SubLObject)$ic7$, (SubLObject)NIL);
            final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (NIL != $g3424$.getDynamicValue(var6)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var7);
            }
            final SubLObject var8 = Eval.eval(var7);
            if (NIL == var8) {
                if (NIL != $g3424$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic10$, var7, var8);
                }
            }
            else {
                $g3419$.setDynamicValue((SubLObject)$ic11$, var6);
                if (NIL != $g3424$.getDynamicValue(var6) || NIL != $g3432$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic12$, var7, var8);
                }
                if (NIL != $g3421$.getDynamicValue(var6)) {
                    Errors.sublisp_break((SubLObject)$ic13$, new SubLObject[] { var7, var8 });
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29404(final SubLObject var24, final SubLObject var4, SubLObject var49, SubLObject var50) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)$ic38$;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var51).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var51)) {
            SubLObject var52 = var24;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                final SubLObject var54 = (SubLObject)ConsesLow.listS((SubLObject)$ic39$, var49, ConsesLow.append((SubLObject)((NIL != var50) ? ConsesLow.list((SubLObject)$ic40$, var50) : NIL), (SubLObject)NIL));
                final SubLObject var55 = (SubLObject)ConsesLow.list((SubLObject)$ic41$, module0035.f2241(var53), module0035.f2241(var4), module0035.f2241(var54));
                if (NIL != $g3424$.getDynamicValue(var51)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var55);
                }
                final SubLObject var56 = module0018.$g689$.currentBinding(var51);
                final SubLObject var57 = module0111.$g1406$.currentBinding(var51);
                try {
                    module0018.$g689$.bind((SubLObject)NIL, var51);
                    module0111.$g1406$.bind((SubLObject)NIL, var51);
                    final SubLObject var58 = Eval.eval(var55);
                    if (NIL == var58) {
                        $g3419$.setDynamicValue((SubLObject)$ic11$, var51);
                        if (NIL != $g3424$.getDynamicValue(var51) || NIL != $g3432$.getDynamicValue(var51)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic42$, var55);
                        }
                        if (NIL != $g3421$.getDynamicValue(var51)) {
                            Errors.sublisp_break((SubLObject)$ic43$, new SubLObject[] { var55 });
                        }
                    }
                }
                finally {
                    module0111.$g1406$.rebind(var57, var51);
                    module0018.$g689$.rebind(var56, var51);
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29405(final SubLObject var24, final SubLObject var4, SubLObject var49, SubLObject var50) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)$ic38$;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var51).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var51)) {
            SubLObject var52 = var24;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                final SubLObject var54 = (SubLObject)ConsesLow.listS((SubLObject)$ic39$, var49, ConsesLow.append((SubLObject)((NIL != var50) ? ConsesLow.list((SubLObject)$ic40$, var50) : NIL), (SubLObject)NIL));
                final SubLObject var55 = (SubLObject)ConsesLow.list((SubLObject)$ic44$, module0035.f2241(var53), module0035.f2241(var4), module0035.f2241(var54));
                if (NIL != $g3424$.getDynamicValue(var51)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var55);
                }
                final SubLObject var56 = module0018.$g689$.currentBinding(var51);
                final SubLObject var57 = module0111.$g1406$.currentBinding(var51);
                try {
                    module0018.$g689$.bind((SubLObject)NIL, var51);
                    module0111.$g1406$.bind((SubLObject)NIL, var51);
                    final SubLObject var58 = Eval.eval(var55);
                    if (NIL == var58) {
                        $g3419$.setDynamicValue((SubLObject)$ic11$, var51);
                        if (NIL != $g3424$.getDynamicValue(var51) || NIL != $g3432$.getDynamicValue(var51)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic42$, var55);
                        }
                        if (NIL != $g3421$.getDynamicValue(var51)) {
                            Errors.sublisp_break((SubLObject)$ic43$, new SubLObject[] { var55 });
                        }
                    }
                }
                finally {
                    module0111.$g1406$.rebind(var57, var51);
                    module0018.$g689$.rebind(var56, var51);
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29406(final SubLObject var24, final SubLObject var4) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var25).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var25)) {
            SubLObject var26 = var24;
            SubLObject var27 = (SubLObject)NIL;
            var27 = var26.first();
            while (NIL != var26) {
                final SubLObject var28 = (SubLObject)ConsesLow.list((SubLObject)$ic45$, module0035.f2241(var27), module0035.f2241(var4));
                if (NIL != $g3424$.getDynamicValue(var25)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var28);
                }
                Eval.eval(var28);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29407(final SubLObject var25, final SubLObject var4, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var55).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var55)) {
            final SubLObject var56 = (SubLObject)ConsesLow.list((SubLObject)$ic46$, module0035.f2241(var25), module0035.f2241(var4), var54);
            if (NIL != $g3424$.getDynamicValue(var55)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var56);
                PrintLow.format((SubLObject)T, (SubLObject)$ic47$, Eval.eval(var56));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29408(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            if (NIL != module0173.f10969(var58)) {
                if (NIL != $g3424$.getDynamicValue(var56)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var58));
                }
                final SubLObject var59 = module0597.f36628(var58);
                module0538.f33365(var58);
                if (NIL == module0538.f33337(var59)) {
                    $g3417$.setDynamicValue(Sequences.delete(var59, $g3417$.getDynamicValue(var56), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var56);
                }
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29409(final SubLObject var1, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        var59 = module0126.f8395(var1, (SubLObject)UNPROVIDED);
        var60 = (SubLObject)ConsesLow.list((SubLObject)$ic49$, var59);
        if (NIL == module0538.f33337(var59)) {
            var62 = (SubLObject)T;
            var61 = Eval.eval(var60);
        }
        if (NIL == var62) {
            $g3419$.setDynamicValue((SubLObject)$ic11$, var58);
            if (NIL != $g3424$.getDynamicValue(var58) || NIL != $g3432$.getDynamicValue(var58)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic50$, var1);
            }
            if (NIL != $g3421$.getDynamicValue(var58)) {
                Errors.sublisp_break((SubLObject)$ic51$, new SubLObject[] { var59 });
            }
        }
        else if (NIL != var61) {
            if (NIL != $g3424$.getDynamicValue(var58)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var60);
            }
            final SubLObject var63 = var59;
            if (NIL == conses_high.member(var63, $g3417$.getDynamicValue(var58), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g3417$.setDynamicValue((SubLObject)ConsesLow.cons(var63, $g3417$.getDynamicValue(var58)), var58);
            }
            return var61;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29410(final SubLObject var62, final SubLObject var4) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var63).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var63)) {
            if (NIL != $g3424$.getDynamicValue(var63)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, module0035.f2241(var62), module0035.f2241(var4)));
            }
            module0538.f33437(var62, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29411(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var5).equal((SubLObject)$ic6$) || NIL != $g3431$.getDynamicValue(var5)) {
            if (NIL != $g3424$.getDynamicValue(var5)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, module0035.f2241(var4)));
            }
            module0538.f33439(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29412(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if ($g3419$.getDynamicValue(var64).equal((SubLObject)$ic6$)) {
            $g3419$.setDynamicValue((SubLObject)$ic54$, var64);
        }
        final SubLObject var65 = (SubLObject)ConsesLow.list(var63, $g3429$.getDynamicValue(var64));
        if (NIL != Sequences.find(var65, $g3420$.getDynamicValue(var64), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            $g3420$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var65, $g3419$.getDynamicValue(var64)), Sequences.remove(var65, $g3420$.getDynamicValue(var64), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var64);
        }
        else {
            $g3420$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var65, $g3419$.getDynamicValue(var64)), $g3420$.getDynamicValue(var64)), var64);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29413() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != $g3436$.getDynamicValue(var21)) {
            SubLObject var22 = $g3417$.getDynamicValue(var21);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                final SubLObject var24 = module0538.f33337(var23);
                if (NIL != var24) {
                    f29408((SubLObject)ConsesLow.list(var24));
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
            $g3417$.setDynamicValue((SubLObject)NIL, var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29414(final SubLObject var63, SubLObject var66, SubLObject var67, SubLObject var68, SubLObject var69, SubLObject var12, SubLObject var13, SubLObject var14) {
        final SubLObject var70 = (SubLObject)makeBoolean(var69 != UNPROVIDED);
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)T;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic3$;
        }
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)T;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)ONE_INTEGER;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)TWENTY_INTEGER;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0574.f35126() == $ic56$) {
            module0574.f35127((SubLObject)$ic57$);
        }
        if (var68 == $ic58$ && NIL == var70) {
            var69 = (SubLObject)NIL;
        }
        final SubLObject var72 = f29415(var63);
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = $g3417$.currentBinding(var71);
        try {
            $g3417$.bind((SubLObject)NIL, var71);
            if (var72.isCons()) {
                final SubLObject var75 = module0213.f13982();
                try {
                    final SubLObject var28_73 = $g3418$.currentBinding(var71);
                    final SubLObject var76 = $g3419$.currentBinding(var71);
                    final SubLObject var77 = $g3422$.currentBinding(var71);
                    final SubLObject var78 = $g3425$.currentBinding(var71);
                    final SubLObject var79 = $g3426$.currentBinding(var71);
                    final SubLObject var80 = $g3427$.currentBinding(var71);
                    final SubLObject var81 = $g3428$.currentBinding(var71);
                    final SubLObject var82 = $g3424$.currentBinding(var71);
                    final SubLObject var83 = $g3429$.currentBinding(var71);
                    try {
                        $g3418$.bind(var63, var71);
                        $g3419$.bind((SubLObject)$ic6$, var71);
                        $g3422$.bind((SubLObject)NIL, var71);
                        $g3425$.bind(var69, var71);
                        $g3426$.bind(var12, var71);
                        $g3427$.bind(var13, var71);
                        $g3428$.bind(var14, var71);
                        $g3424$.bind(var67, var71);
                        $g3429$.bind(var68, var71);
                        if (NIL != var66) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic59$, (SubLObject)ConsesLow.list(var63, $g3429$.getDynamicValue(var71)));
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        SubLObject var13_81 = (SubLObject)NIL;
                        final SubLObject var84 = Time.get_internal_real_time();
                        SubLObject var85 = var72;
                        SubLObject var86 = (SubLObject)NIL;
                        var86 = var85.first();
                        while (NIL != var85) {
                            module0112.f7688(var86);
                            var85 = var85.rest();
                            var86 = var85.first();
                        }
                        var13_81 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var84), time_high.$internal_time_units_per_second$.getGlobalValue());
                        final SubLObject var87 = (SubLObject)ConsesLow.list(var63, var68);
                        var73 = module0029.f1535((SubLObject)$ic60$, var87, $g3419$.getDynamicValue(var71), var13_81);
                        if (NIL != var66) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic61$, conses_high.assoc((SubLObject)ConsesLow.list(var63, $g3429$.getDynamicValue(var71)), $g3420$.getDynamicValue(var71), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED).rest(), var13_81);
                        }
                    }
                    finally {
                        $g3429$.rebind(var83, var71);
                        $g3424$.rebind(var82, var71);
                        $g3428$.rebind(var81, var71);
                        $g3427$.rebind(var80, var71);
                        $g3426$.rebind(var79, var71);
                        $g3425$.rebind(var78, var71);
                        $g3422$.rebind(var77, var71);
                        $g3419$.rebind(var76, var71);
                        $g3418$.rebind(var28_73, var71);
                    }
                }
                finally {
                    final SubLObject var28_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                        f29413();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var28_74, var71);
                    }
                }
                final SubLObject var88 = module0213.f13982();
                final SubLObject var89 = module0213.f13983(var88, var75);
                final SubLObject var90 = module0213.f13984(var88, var75);
                final SubLObject var91 = module0213.f13985(var88, var75);
                final SubLObject var92 = module0213.f13986(var88, var75);
                final SubLObject var93 = module0213.f13987(var88, var75);
                if (NIL != module0004.f109(var89) || NIL != module0004.f109(var90) || NIL != module0004.f109(var91) || NIL != module0004.f109(var92) || NIL != module0004.f109(var93)) {
                    if (Sequences.cconcatenate((SubLObject)$ic62$, new SubLObject[] { module0006.f205(var63), $ic63$, module0006.f205(var68), $ic64$ }).isString()) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic65$, Sequences.cconcatenate((SubLObject)$ic62$, new SubLObject[] { module0006.f205(var63), $ic63$, module0006.f205(var68), $ic64$ }));
                    }
                    if (NIL != module0004.f109(var89)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic66$, new SubLObject[] { Numbers.abs(var89), Numbers.abs(var89).numG((SubLObject)ONE_INTEGER) ? $ic67$ : $ic68$, (NIL != module0004.f105(var89)) ? $ic69$ : $ic70$ });
                    }
                    if (NIL != module0004.f109(var90)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic71$, new SubLObject[] { Numbers.abs(var90), Numbers.abs(var90).numG((SubLObject)ONE_INTEGER) ? $ic67$ : $ic68$, (NIL != module0004.f105(var90)) ? $ic69$ : $ic70$ });
                    }
                    if (NIL != module0004.f109(var91)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic72$, new SubLObject[] { Numbers.abs(var91), Numbers.abs(var91).numG((SubLObject)ONE_INTEGER) ? $ic67$ : $ic68$, (NIL != module0004.f105(var91)) ? $ic69$ : $ic70$ });
                    }
                    if (NIL != module0004.f109(var92)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic73$, new SubLObject[] { Numbers.abs(var92), Numbers.abs(var92).numG((SubLObject)ONE_INTEGER) ? $ic67$ : $ic68$, (NIL != module0004.f105(var92)) ? $ic69$ : $ic70$ });
                    }
                    if (NIL != module0004.f109(var93)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic74$, new SubLObject[] { Numbers.abs(var93), Numbers.abs(var93).numG((SubLObject)ONE_INTEGER) ? $ic67$ : $ic68$, (NIL != module0004.f105(var93)) ? $ic69$ : $ic70$ });
                    }
                }
                else if (NIL.isString()) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic65$, (SubLObject)NIL);
                }
                streams_high.force_output((SubLObject)T);
            }
            else {
                PrintLow.format((SubLObject)T, (SubLObject)$ic75$, (SubLObject)$ic76$, var63);
                if (NIL == $g3416$.getDynamicValue(var71)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic77$, (SubLObject)$ic76$);
                }
            }
        }
        finally {
            $g3417$.rebind(var74, var71);
        }
        return var73;
    }
    
    public static SubLObject f29416(SubLObject var90, SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92, SubLObject var68, SubLObject var69, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var90 == UNPROVIDED) {
            var90 = f29417((SubLObject)UNPROVIDED);
        }
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)T;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic3$;
        }
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)T;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)ONE_INTEGER;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)TWENTY_INTEGER;
        }
        if (var90.isCons()) {
            SubLObject var93 = (SubLObject)NIL;
            SubLObject var94 = var90;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                final SubLObject var96 = f29414(var95, var66, var67, var68, var69, var12, var13, var14);
                var93 = (SubLObject)ConsesLow.cons(var96, var93);
                var94 = var94.rest();
                var95 = var94.first();
            }
            f29418((SubLObject)UNPROVIDED);
            final SubLObject var97 = module0029.f1542(var93);
            return Values.values(var97, (SubLObject)((NIL != var92) ? var93 : NIL));
        }
        if (NIL == var91) {
            return (SubLObject)NIL;
        }
        final SubLObject var98 = f29417((SubLObject)T);
        if (NIL != var98) {
            return f29416(var98, var66, var67, (SubLObject)NIL, var68, var69, var12, var13, var14, (SubLObject)UNPROVIDED);
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic78$, (SubLObject)$ic79$, var90);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29419(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = $g3420$.getDynamicValue();
        }
        var41 = Sort.sort(conses_high.copy_list(var41), Symbols.symbol_function((SubLObject)$ic80$), Symbols.symbol_function((SubLObject)$ic55$));
        var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic80$), Symbols.symbol_function((SubLObject)$ic81$));
        return var41;
    }
    
    public static SubLObject f29418(SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = module0029.$g839$.getDynamicValue();
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        if ($ic82$ != var97) {
            final SubLObject var99 = print_high.$print_pretty$.currentBinding(var98);
            try {
                print_high.$print_pretty$.bind((SubLObject)NIL, var98);
                PrintLow.format((SubLObject)T, (SubLObject)$ic83$);
                SubLObject var100 = (SubLObject)NIL;
                final SubLObject var101 = var97;
                if (var101.eql((SubLObject)$ic84$)) {
                    var100 = (SubLObject)$ic85$;
                }
                else if (var101.eql((SubLObject)$ic86$)) {
                    var100 = (SubLObject)$ic87$;
                }
                else {
                    Errors.error((SubLObject)$ic88$, var97);
                }
                SubLObject var102 = f29419((SubLObject)UNPROVIDED);
                SubLObject var103 = (SubLObject)NIL;
                var103 = var102.first();
                while (NIL != var102) {
                    if (var97 == $ic86$) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic89$, new SubLObject[] { var103.rest(), var100, var103.first(), f29420(conses_high.caar(var103)) });
                    }
                    else {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic90$, new SubLObject[] { var103.rest(), var100, var103.first() });
                    }
                    var102 = var102.rest();
                    var103 = var102.first();
                }
                PrintLow.format((SubLObject)T, (SubLObject)$ic83$);
            }
            finally {
                print_high.$print_pretty$.rebind(var99, var98);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29421() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = print_high.$print_pretty$.currentBinding(var21);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var21);
            PrintLow.format((SubLObject)T, (SubLObject)$ic83$);
            SubLObject var23 = f29419((SubLObject)UNPROVIDED);
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                if (var24.rest().equal((SubLObject)$ic11$)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic91$, var24.rest(), var24.first());
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            PrintLow.format((SubLObject)T, (SubLObject)$ic83$);
        }
        finally {
            print_high.$print_pretty$.rebind(var22, var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29422(final SubLObject var100, SubLObject var101, SubLObject var102, SubLObject var103) {
        if (var101 == UNPROVIDED) {
            var101 = (SubLObject)NIL;
        }
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)NIL;
        }
        if (NIL != var101) {
            if (NIL != Symbols.boundp(var101)) {
                return conses_high.assoc(Symbols.symbol_value(var101), conses_high.assoc(var101, var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL == var102) {
                return (SubLObject)NIL;
            }
            if (NIL != Symbols.fboundp(var102)) {
                return conses_high.assoc(Functions.apply(var102, var103), conses_high.assoc(var102, var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f29423(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic92$);
        var108 = var107.first();
        var107 = var107.rest();
        final SubLObject var109 = (SubLObject)(var107.isCons() ? var107.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)$ic92$);
        var107 = var107.rest();
        final SubLObject var110 = (SubLObject)(var107.isCons() ? var107.first() : $ic93$);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)$ic92$);
        var107 = var107.rest();
        final SubLObject var111 = (SubLObject)(var107.isCons() ? var107.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)$ic92$);
        var107 = var107.rest();
        final SubLObject var112 = (SubLObject)(var107.isCons() ? var107.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)$ic92$);
        var107 = var107.rest();
        if (NIL == var107) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic95$, (SubLObject)$ic96$, (SubLObject)ConsesLow.list((SubLObject)$ic97$, (SubLObject)ConsesLow.list((SubLObject)$ic98$, var109), (SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, var109, (SubLObject)$ic101$, var110))), (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)T, (SubLObject)$ic107$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var108), var109), var108, (SubLObject)ConsesLow.list((SubLObject)$ic109$, var111, (SubLObject)ConsesLow.list((SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)T, var111, var112))), var108)), (SubLObject)ConsesLow.list((SubLObject)$ic109$, (SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)$ic98$, var109)), (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)T, (SubLObject)$ic113$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var108), var109), (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)T, (SubLObject)$ic114$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var108)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var106, (SubLObject)$ic92$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29424(final SubLObject var111, SubLObject var112) {
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        return ConsesLow.nconc((SubLObject)ConsesLow.list($g3418$.getDynamicValue(var113), var111), var112);
    }
    
    public static SubLObject f29425() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != $g3424$.getDynamicValue(var21)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic115$, $g3418$.getDynamicValue(var21));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29426(final SubLObject var63, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104(var63, $g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$))) {
            $g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), Sequences.remove(var63, $g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var114);
        }
        else {
            $g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), $g3416$.getDynamicValue(var114)), var114);
        }
        return var63;
    }
    
    public static SubLObject f29427(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (NIL != conses_high.assoc(var94, $g3416$.getDynamicValue(var95), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29415(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        return conses_high.second(conses_high.assoc(var94, $g3416$.getDynamicValue(var95), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29428(final SubLObject var114) {
        return module0035.f2439((SubLObject)$ic118$, f29415(var114), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29429(final SubLObject var114) {
        return module0205.f13183(f29415(var114), (SubLObject)$ic118$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29430() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic119$), $g3416$.getDynamicValue(var21));
    }
    
    public static SubLObject f29431(final SubLObject var115) {
        if (var115.isString()) {
            return var115;
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic120$, var115);
    }
    
    public static SubLObject f29417(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (NIL != var116) {
            final SubLObject var118 = f29383((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var118.isString() && NIL != Filesys.probe_file(var118)) {
                Eval.load(var118);
            }
            else {
                PrintLow.format((SubLObject)T, (SubLObject)$ic121$, var118);
            }
        }
        final SubLObject var119 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic55$), $g3416$.getDynamicValue(var117));
        if (NIL != var119) {
            return Sort.sort(conses_high.copy_list(var119), Symbols.symbol_function((SubLObject)$ic122$), Symbols.symbol_function((SubLObject)$ic123$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29432(SubLObject var119) {
        if (var119 == UNPROVIDED) {
            var119 = (SubLObject)NIL;
        }
        final SubLThread var120 = SubLProcess.currentSubLThread();
        final SubLObject var121 = var119.isString() ? var119 : f29383((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var121.isString() && NIL != Filesys.probe_file(var121)) {
            var120.resetMultipleValues();
            final SubLObject var122 = module0075.f5252(var121);
            final SubLObject var123 = var120.secondMultipleValue();
            var120.resetMultipleValues();
            if (NIL != var123) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic124$, var119, var123);
            }
            return var122;
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic125$, (SubLObject)$ic126$, var121);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29433() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        $g3416$.setDynamicValue((SubLObject)NIL, var21);
        return $g3416$.getDynamicValue(var21);
    }
    
    public static SubLObject f29434() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        $g3420$.setDynamicValue((SubLObject)NIL, var21);
        return $g3420$.getDynamicValue(var21);
    }
    
    public static SubLObject f29435(SubLObject var66, SubLObject var67, SubLObject var97, SubLObject var121, SubLObject var91, SubLObject var92) {
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)NIL;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var97 == UNPROVIDED) {
            var97 = module0029.$g839$.getDynamicValue();
        }
        if (var121 == UNPROVIDED) {
            var121 = module0029.$g835$.getDynamicValue();
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)T;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)NIL;
        final SubLObject var124 = module0029.$g839$.currentBinding(var122);
        final SubLObject var125 = module0029.$g835$.currentBinding(var122);
        try {
            module0029.$g839$.bind(var97, var122);
            module0029.$g835$.bind(var121, var122);
            f29434();
            var122.resetMultipleValues();
            final SubLObject var126 = f29436(var66, var67, var91, (SubLObject)T);
            final SubLObject var127 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            var123 = ConsesLow.nconc(var123, var127);
            f29434();
            var122.resetMultipleValues();
            final SubLObject var128 = f29437(var66, var67, var91, (SubLObject)T);
            final SubLObject var129 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            var123 = ConsesLow.nconc(var123, var129);
        }
        finally {
            module0029.$g835$.rebind(var125, var122);
            module0029.$g839$.rebind(var124, var122);
        }
        final SubLObject var130 = module0029.f1542(var123);
        return Values.values(var130, (SubLObject)((NIL != var92) ? var123 : NIL));
    }
    
    public static SubLObject f29436(SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92) {
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)NIL;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        return f29416(f29417((SubLObject)UNPROVIDED), var66, var67, var91, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29437(SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92) {
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)NIL;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        return f29416(f29417((SubLObject)UNPROVIDED), var66, var67, var91, var92, (SubLObject)$ic58$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29438(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic127$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic127$);
        var109 = var107.first();
        final SubLObject var110;
        var107 = (var110 = var107.rest());
        final SubLObject var111 = module0035.f2119(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic128$), var109));
        final SubLObject var112 = (SubLObject)$ic129$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic104$, reader.bq_cons(var112, ConsesLow.append(var111, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic130$, reader.bq_cons((SubLObject)$ic102$, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic131$), var109, EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)$ic132$, var112, reader.bq_cons((SubLObject)$ic133$, ConsesLow.append(var111, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic134$, reader.bq_cons((SubLObject)$ic133$, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic135$), var109, EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)NIL)), (SubLObject)$ic136$), ConsesLow.append(var110, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic109$, (SubLObject)$ic137$, (SubLObject)ConsesLow.list((SubLObject)$ic138$, var112))));
    }
    
    public static SubLObject f29439(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var109 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var110 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var111 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var112 = var107.first();
        final SubLObject var113;
        var107 = (var113 = var107.rest());
        final SubLObject var114 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic128$), var112);
        final SubLObject var115 = (SubLObject)$ic140$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic104$, ConsesLow.append(var112, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var115, reader.bq_cons((SubLObject)$ic133$, ConsesLow.append(var114, (SubLObject)NIL))))), (SubLObject)ConsesLow.list((SubLObject)$ic130$, (SubLObject)ConsesLow.listS((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic134$, var115, var109, var110, var111), ConsesLow.append(var113, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic141$, var115, var109)));
    }
    
    public static SubLObject f29440(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var109 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var110 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var111 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic139$);
        var112 = var107.first();
        final SubLObject var113;
        var107 = (var113 = var107.rest());
        final SubLObject var114 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic128$), var112);
        final SubLObject var115 = (SubLObject)$ic142$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic104$, ConsesLow.append(var112, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var115, reader.bq_cons((SubLObject)$ic143$, ConsesLow.append(var114, (SubLObject)NIL))))), (SubLObject)ConsesLow.list((SubLObject)$ic130$, (SubLObject)ConsesLow.listS((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic134$, var115, var109, var110, var111), ConsesLow.append(var113, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic141$, var115, var109)));
    }
    
    public static SubLObject f29441(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic144$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic144$);
        var109 = var107.first();
        final SubLObject var110;
        var107 = (var110 = var107.rest());
        final SubLObject var111 = (SubLObject)$ic145$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic146$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic147$, var111), (SubLObject)ConsesLow.list((SubLObject)$ic148$, (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)$ic150$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var109), (SubLObject)ConsesLow.list((SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)ConsesLow.listS((SubLObject)$ic153$, var111, (SubLObject)$ic154$)), (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)$ic155$, (SubLObject)$ic156$, (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)$ic157$, (SubLObject)T, (SubLObject)$ic158$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var108)), (SubLObject)ConsesLow.list((SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)ConsesLow.listS((SubLObject)$ic153$, var111, (SubLObject)$ic154$)))), (SubLObject)ConsesLow.list((SubLObject)$ic151$, (SubLObject)$ic159$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var110)), (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)$ic155$, (SubLObject)$ic156$, (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)$ic157$, (SubLObject)T, (SubLObject)$ic160$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var108)), (SubLObject)ConsesLow.list((SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)ConsesLow.listS((SubLObject)$ic153$, var111, (SubLObject)$ic154$)))))));
    }
    
    public static SubLObject f29442(final SubLObject var142, final SubLObject var143, SubLObject var144, SubLObject var128, SubLObject var4, SubLObject var135, SubLObject var50) {
        if (var144 == UNPROVIDED) {
            var144 = Symbols.symbol_function((SubLObject)$ic161$);
        }
        if (var128 == UNPROVIDED) {
            var128 = (SubLObject)T;
        }
        if (var4 == UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic38$;
        }
        if (var50 == UNPROVIDED) {
            var50 = $g3429$.getDynamicValue();
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        final SubLObject var146 = ConsesLow.append(new SubLObject[] { var142 });
        try {
            f29404(var146, var4, var135, var50);
            SubLObject var147 = var143;
            SubLObject var148 = (SubLObject)NIL;
            var148 = var147.first();
            while (NIL != var147) {
                Functions.funcall(var144, var148, var4, $g3425$.getDynamicValue(var145), $g3426$.getDynamicValue(var145), $g3427$.getDynamicValue(var145), $g3428$.getDynamicValue(var145));
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        finally {
            final SubLObject var149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var145);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var145);
                f29406(var146, var4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var149, var145);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29443(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic162$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)$ic162$);
        final SubLObject var109 = var107.rest();
        var107 = var107.first();
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = var107;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var154_155 = (SubLObject)NIL;
        while (NIL != var111) {
            cdestructuring_bind.destructuring_bind_must_consp(var111, var106, (SubLObject)$ic162$);
            var154_155 = var111.first();
            var111 = var111.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var111, var106, (SubLObject)$ic162$);
            if (NIL == conses_high.member(var154_155, (SubLObject)$ic163$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var112 = (SubLObject)T;
            }
            if (var154_155 == $ic164$) {
                var110 = var111.first();
            }
            var111 = var111.rest();
        }
        if (NIL != var112 && NIL == var110) {
            cdestructuring_bind.cdestructuring_bind_error(var106, (SubLObject)$ic162$);
        }
        final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var107);
        final SubLObject var114 = (SubLObject)((NIL != var113) ? conses_high.cadr(var113) : $ic3$);
        final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)$ic165$, var107);
        final SubLObject var116 = (SubLObject)((NIL != var115) ? conses_high.cadr(var115) : NIL);
        final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)$ic166$, var107);
        final SubLObject var118 = (SubLObject)((NIL != var117) ? conses_high.cadr(var117) : NIL);
        final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)$ic167$, var107);
        final SubLObject var120 = (SubLObject)((NIL != var119) ? conses_high.cadr(var119) : NIL);
        final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)$ic168$, var107);
        final SubLObject var122 = (SubLObject)((NIL != var121) ? conses_high.cadr(var121) : NIL);
        final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)$ic169$, var107);
        final SubLObject var124 = (SubLObject)((NIL != var123) ? conses_high.cadr(var123) : NIL);
        final SubLObject var125 = cdestructuring_bind.property_list_member((SubLObject)$ic170$, var107);
        final SubLObject var126 = (SubLObject)((NIL != var125) ? conses_high.cadr(var125) : NIL);
        final SubLObject var127 = cdestructuring_bind.property_list_member((SubLObject)$ic171$, var107);
        final SubLObject var128 = (SubLObject)((NIL != var127) ? conses_high.cadr(var127) : T);
        final SubLObject var129;
        var107 = (var129 = var109);
        return (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic116$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic108$, (SubLObject)ConsesLow.listS((SubLObject)$ic172$, (SubLObject)ConsesLow.list((SubLObject)$ic173$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)$ic174$, var108)), (SubLObject)$ic175$), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic176$, var108), (SubLObject)$ic177$), reader.bq_cons((SubLObject)T, ConsesLow.append(var129, (SubLObject)NIL))), (SubLObject)$ic178$))), (SubLObject)ConsesLow.list(new SubLObject[] { $ic179$, var108, var114, var116, var118, var120, var122, var124, var126, var128 }));
    }
    
    public static SubLObject f29444(final SubLObject var149) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        final SubLObject var151 = f29445(var149);
        if ($ic180$ != var151 && !var151.eql($g3429$.getDynamicValue(var150))) {
            return (SubLObject)NIL;
        }
        final SubLObject var152 = f29446(var149);
        if (NIL == f29447(var152, module0029.$g835$.getDynamicValue(var150))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29447(final SubLObject var172, final SubLObject var173) {
        final SubLObject var174 = module0018.f973();
        final SubLObject var175 = (SubLObject)makeBoolean(NIL == var174);
        if (NIL != var175 && $ic181$ == var172) {
            return (SubLObject)NIL;
        }
        if (NIL != var174 && $ic182$ == var172 && NIL == var173) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29448(final SubLObject var149, final SubLObject var50, final SubLObject var158, final SubLObject var160, final SubLObject var162, final SubLObject var164, final SubLObject var176, final SubLObject var168, final SubLObject var170) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var149) : var149;
        f29449(var149, var50);
        f29450(var149, var158);
        f29451(var149, var160);
        f29452(var149, var162);
        f29453(var149, var164);
        f29454(var149, var176);
        f29455(var149, var168);
        f29456(var149, var170);
        module0029.f1506(module0029.$g836$.getDynamicValue(var177), var149);
        return var149;
    }
    
    public static SubLObject f29457(final SubLObject var177) {
        return Types.stringp(var177);
    }
    
    public static SubLObject f29458(final SubLObject var177) {
        return module0004.f104(var177, (SubLObject)$ic184$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29459(final SubLObject var177) {
        return Types.stringp(var177);
    }
    
    public static SubLObject f29449(final SubLObject var149, SubLObject var50) {
        if (NIL == var50) {
            var50 = (SubLObject)$ic180$;
        }
        assert NIL != f29458(var50) : var50;
        Symbols.put(var149, (SubLObject)$ic40$, var50);
        return var50;
    }
    
    public static SubLObject f29445(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic40$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29450(final SubLObject var149, final SubLObject var158) {
        assert NIL != module0029.f1472(var158) : var158;
        if (NIL != var158) {
            Symbols.put(var149, (SubLObject)$ic165$, var158);
        }
        return var158;
    }
    
    public static SubLObject f29446(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic165$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29451(final SubLObject var149, final SubLObject var160) {
        assert NIL != f29459(var160) : var160;
        if (NIL != var160) {
            Symbols.put(var149, (SubLObject)$ic166$, var160);
        }
        return var160;
    }
    
    public static SubLObject f29420(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic166$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29452(final SubLObject var149, final SubLObject var162) {
        if (NIL != var162 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var162)) {
            throw new AssertionError(var162);
        }
        if (NIL != var162) {
            Symbols.put(var149, (SubLObject)$ic167$, var162);
        }
        return var162;
    }
    
    public static SubLObject f29460(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic167$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29453(final SubLObject var149, final SubLObject var178) {
        if (NIL != var178 && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var178)) {
            throw new AssertionError(var178);
        }
        if (NIL != var178) {
            Symbols.put(var149, (SubLObject)$ic190$, var178);
        }
        return var178;
    }
    
    public static SubLObject f29461(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic190$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29454(final SubLObject var149, final SubLObject var176) {
        if (NIL != var176 && !areAssertionsDisabledFor(me) && NIL == module0051.f3603(var176)) {
            throw new AssertionError(var176);
        }
        if (NIL != var176) {
            Symbols.put(var149, (SubLObject)$ic192$, var176);
        }
        return var176;
    }
    
    public static SubLObject f29462(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic192$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29455(final SubLObject var149, final SubLObject var168) {
        if (NIL != var168 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var168)) {
            throw new AssertionError(var168);
        }
        if (NIL != var168) {
            Symbols.put(var149, (SubLObject)$ic170$, var168);
        }
        return var168;
    }
    
    public static SubLObject f29463(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic170$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29456(final SubLObject var149, final SubLObject var170) {
        assert NIL != Types.booleanp(var170) : var170;
        Symbols.put(var149, (SubLObject)$ic171$, var170);
        return var170;
    }
    
    public static SubLObject f29464(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)$ic171$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29465() {
        return module0035.remove_if_not((SubLObject)$ic194$, f29430(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29466() {
        return Sequences.remove_if((SubLObject)$ic194$, f29430(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29467(final SubLObject var63, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104(var63, $g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$))) {
            $g3437$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), Sequences.remove(var63, $g3437$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var114);
        }
        else {
            $g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), $g3416$.getDynamicValue(var114)), var114);
        }
        return var63;
    }
    
    public static SubLObject f29468(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (NIL != var116) {
            final SubLObject var118 = f29383((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var118.isString() && NIL != Filesys.probe_file(var118)) {
                Eval.load(var118);
            }
            else {
                PrintLow.format((SubLObject)T, (SubLObject)$ic121$, var118);
            }
        }
        final SubLObject var119 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic55$), $g3437$.getDynamicValue(var117));
        if (NIL != var119) {
            return Sort.sort(conses_high.copy_list(var119), Symbols.symbol_function((SubLObject)$ic122$), Symbols.symbol_function((SubLObject)$ic123$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29469(SubLObject var66, SubLObject var67) {
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)NIL;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        f29416(f29468((SubLObject)UNPROVIDED), var66, var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29470() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29383", "S#32539", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29384", "S#32540", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29385", "S#32541", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29386", "S#32542", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29387", "S#32543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29388", "LEGACY-B-VERIFY", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29389", "B-VERIFY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29390", "S#32544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29391", "B-TEST-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29392", "TEST-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29393", "S#32545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29394", "S#32546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29395", "FORM-VERIFY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29396", "TEST-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29398", "TEST-VERIFY-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29397", "S#32547", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29399", "M-VERIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29400", "LEGACY-BINDING-VERIFY", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29401", "BINDING-VERIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29402", "LEGACY-VERIFY-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29403", "VERIFY-NOT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29404", "PRINT-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29405", "S#32548", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29406", "PRINT-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29407", "PRINT-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29408", "PRINT-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29409", "PRINT-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29410", "PRINT-TMS-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29411", "PRINT-TMS-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29412", "UPDATE-TEST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29413", "S#32549", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29414", "RUN-TEST", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29416", "S#32550", 0, 10, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29419", "S#32551", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29418", "S#32552", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29421", "S#32553", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29422", "PARAMETERIZED-TEST-VALUE", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29423", "PRINT-FAILING-FORM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29424", "FAILING-IT-FORM-IDENTIFIER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29425", "HERALD-START", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29426", "DEF-INFERENCE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29427", "S#2627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29415", "S#32554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29428", "S#2665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29429", "S#2672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29430", "S#32555", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29431", "S#32556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29417", "S#32557", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29432", "LOAD-INFERENCE-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29433", "S#32558", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29434", "S#32559", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29435", "S#32560", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29436", "S#32561", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29437", "S#32562", 0, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29438", "WITH-TEST-CONSTANTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29439", "WITH-TEST-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29440", "WITH-TEST-ASSERTION-LISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29441", "DEFINE-SUBTEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29442", "ASSERT-QUERY-TEST", 2, 5, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0421", "f29443", "DEFINE-INFERENCE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29444", "S#32563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29447", "S#2531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29448", "S#32564", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29457", "S#32271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29458", "S#32565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29459", "S#32272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29449", "S#32566", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29445", "S#32567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29450", "S#32568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29446", "S#2636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29451", "S#32569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29420", "S#2643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29452", "S#32570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29460", "S#2657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29453", "S#32571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29461", "S#32572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29454", "S#32573", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29462", "S#32574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29455", "S#32575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29463", "S#32576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29456", "S#32577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29464", "S#2650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29465", "S#32578", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29466", "S#32579", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29467", "S#32580", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29468", "S#32581", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0421", "f29469", "S#32582", 0, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29471() {
        $g3415$ = SubLFiles.defparameter("S#32583", (SubLObject)$ic0$);
        $g3416$ = SubLFiles.defvar("S#32584", (SubLObject)NIL);
        $g3417$ = SubLFiles.defparameter("S#32585", (SubLObject)NIL);
        $g3418$ = SubLFiles.defparameter("*CURRENT-TEST*", (SubLObject)NIL);
        $g3419$ = SubLFiles.defparameter("*TEST-STATUS*", (SubLObject)NIL);
        $g3420$ = SubLFiles.defparameter("S#32586", (SubLObject)NIL);
        $g3421$ = SubLFiles.defparameter("*BREAK-ON-FAILURE*", (SubLObject)NIL);
        $g3422$ = SubLFiles.defparameter("S#32587", (SubLObject)NIL);
        $g3423$ = SubLFiles.defparameter("S#32588", (SubLObject)T);
        $g3424$ = SubLFiles.defparameter("*IT-VERBOSE*", (SubLObject)T);
        $g3425$ = SubLFiles.defparameter("*IT-BACKCHAIN*", (SubLObject)NIL);
        $g3426$ = SubLFiles.defparameter("*IT-NUMBER*", (SubLObject)ONE_INTEGER);
        $g3427$ = SubLFiles.defparameter("*IT-TIME*", (SubLObject)TWENTY_INTEGER);
        $g3428$ = SubLFiles.defparameter("*IT-DEPTH*", (SubLObject)TWENTY_INTEGER);
        $g3429$ = SubLFiles.defparameter("*TEST-DIRECTION*", (SubLObject)$ic3$);
        $g3430$ = SubLFiles.defparameter("S#32589", (SubLObject)NIL);
        $g3431$ = SubLFiles.defparameter("*DEBUG-CONTINUE*", (SubLObject)NIL);
        $g3432$ = SubLFiles.defparameter("S#32590", (SubLObject)NIL);
        $g3433$ = SubLFiles.defparameter("S#32591", (SubLObject)NIL);
        $g3434$ = SubLFiles.defparameter("S#32592", (SubLObject)NIL);
        $g3435$ = SubLFiles.defparameter("S#32593", (SubLObject)NIL);
        $g3436$ = SubLFiles.defparameter("S#32594", (SubLObject)T);
        $g3437$ = SubLFiles.defvar("S#32595", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29472() {
        module0002.f50((SubLObject)$ic116$, (SubLObject)$ic117$);
        module0002.f50((SubLObject)$ic174$, (SubLObject)$ic117$);
        module0002.f50((SubLObject)$ic179$, (SubLObject)$ic117$);
        module0002.f35((SubLObject)$ic195$, (SubLObject)NIL);
        module0002.f35((SubLObject)$ic196$, (SubLObject)NIL);
        module0002.f35((SubLObject)$ic197$, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29470();
    }
    
    public void initializeVariables() {
        f29471();
    }
    
    public void runTopLevelForms() {
        f29472();
    }
    
    static {
        me = (SubLFile)new module0421();
        $g3415$ = null;
        $g3416$ = null;
        $g3417$ = null;
        $g3418$ = null;
        $g3419$ = null;
        $g3420$ = null;
        $g3421$ = null;
        $g3422$ = null;
        $g3423$ = null;
        $g3424$ = null;
        $g3425$ = null;
        $g3426$ = null;
        $g3427$ = null;
        $g3428$ = null;
        $g3429$ = null;
        $g3430$ = null;
        $g3431$ = null;
        $g3432$ = null;
        $g3433$ = null;
        $g3434$ = null;
        $g3435$ = null;
        $g3436$ = null;
        $g3437$ = null;
        $ic0$ = makeString("inference-tests");
        $ic1$ = makeString("lisp");
        $ic2$ = ConsesLow.list((SubLObject)makeString("tests"));
        $ic3$ = makeKeyword("BACKWARD");
        $ic4$ = makeString("~%~s");
        $ic5$ = makeString("~%No assertions found.");
        $ic6$ = makeKeyword("UNKNOWN");
        $ic7$ = makeKeyword("CONTINUABLE?");
        $ic8$ = makeSymbol("NEW-CYC-QUERY");
        $ic9$ = makeString("~%~%~s");
        $ic10$ = makeString("~%~%Success: ~s~%         ==> ~s");
        $ic11$ = makeKeyword("FAILURE");
        $ic12$ = makeString("~%~%Failure: ~s~%         ==> ~s");
        $ic13$ = makeString("Failure: ~s~%         ==> ~s");
        $ic14$ = makeString("~%~%Success: ~s~%         ==> ~s~%");
        $ic15$ = makeString("~%~%Failure: ~s~%         ==> ~s~%");
        $ic16$ = makeSymbol("S#38", "CYC");
        $ic17$ = makeString("~A");
        $ic18$ = makeString("~%~%Success: ~A~%");
        $ic19$ = makeString("~%~%Failure: ~s~%         ==> NO ERROR~%");
        $ic20$ = makeString("~%~%Failure: ~A~%");
        $ic21$ = makeString("~%~%Success: ~s~%         ==> NO ERROR~%");
        $ic22$ = makeString("~%~%Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic23$ = makeString("~%~%Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic24$ = makeString("Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic25$ = makeKeyword("EVAL-AGAIN");
        $ic26$ = makeKeyword("APPLY");
        $ic27$ = makeString("~%~%Success: ~s~%         ==> ~s  passes ~s");
        $ic28$ = makeString("~%~%Failure: ~s~%         ==> ~s fails ~s");
        $ic29$ = makeString("Failure: ~s~%         ==> ~s fails ~s");
        $ic30$ = makeSymbol("S#32540", "CYC");
        $ic31$ = makeString("~%~%Normal: ~s~%        ==> ~s~%Expected: ~s");
        $ic32$ = makeKeyword("ABNORMAL");
        $ic33$ = makeString("~%~%Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $ic34$ = makeString("Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $ic35$ = makeSymbol("S#18097", "CYC");
        $ic36$ = makeString("~%~%Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $ic37$ = makeString("Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $ic38$ = makeKeyword("DEFAULT");
        $ic39$ = makeKeyword("STRENGTH");
        $ic40$ = makeKeyword("DIRECTION");
        $ic41$ = makeSymbol("CYC-ASSERT");
        $ic42$ = makeString("~%~%Failure: Assertion ~s failed.");
        $ic43$ = makeString("Failure: Assertion ~s failed.");
        $ic44$ = makeSymbol("S#21465", "CYC");
        $ic45$ = makeSymbol("FI-UNASSERT-INT");
        $ic46$ = makeSymbol("S#20826", "CYC");
        $ic47$ = makeString("~%Justification => ~s");
        $ic48$ = makeSymbol("FI-KILL-INT");
        $ic49$ = makeSymbol("S#32596", "CYC");
        $ic50$ = makeString("~%~%Failure: Did not find unique name to create a constant for ~s.");
        $ic51$ = makeString("Failure: Create constant ~s failed.");
        $ic52$ = makeSymbol("S#32536", "CYC");
        $ic53$ = makeSymbol("S#32537", "CYC");
        $ic54$ = makeKeyword("SUCCESS");
        $ic55$ = makeSymbol("CAR");
        $ic56$ = makeKeyword("TRANSMIT-AND-RECEIVE");
        $ic57$ = makeKeyword("DEAF");
        $ic58$ = makeKeyword("FORWARD");
        $ic59$ = makeString("~&:IT ~A");
        $ic60$ = makeKeyword("IT");
        $ic61$ = makeString("-> ~s (~,3f)");
        $ic62$ = makeString("Warning: Test (");
        $ic63$ = makeString(" ");
        $ic64$ = makeString(") changed the KB!");
        $ic65$ = makeString("~&~A~%");
        $ic66$ = makeString("  ~s constant~A ~A~%");
        $ic67$ = makeString("s were");
        $ic68$ = makeString(" was");
        $ic69$ = makeString("created");
        $ic70$ = makeString("destroyed");
        $ic71$ = makeString("  ~s nart~A ~A~%");
        $ic72$ = makeString("  ~s assertion~A ~A~%");
        $ic73$ = makeString("  ~s kb-hl-support~A ~A~%");
        $ic74$ = makeString("  ~s deduction~A ~A~%");
        $ic75$ = makeString("~&There is no test in ~s associated with ~s.~%");
        $ic76$ = makeSymbol("S#32584", "CYC");
        $ic77$ = makeString("~&In fact, there are no tests in ~s at all!~%");
        $ic78$ = makeString("~%The ~s argument is ~s, which is not a list of test keywords.");
        $ic79$ = makeSymbol("S#32597", "CYC");
        $ic80$ = makeSymbol("S#3846", "CYC");
        $ic81$ = makeSymbol("CDR");
        $ic82$ = makeKeyword("SILENT");
        $ic83$ = makeString("~%");
        $ic84$ = makeKeyword("STANDARD");
        $ic85$ = makeString("->");
        $ic86$ = makeKeyword("POST-BUILD");
        $ic87$ = makeString(":IT");
        $ic88$ = makeString("Unknown output format ~A");
        $ic89$ = makeString("~%~s ~a ~s :OWNER ~s");
        $ic90$ = makeString("~%~s ~a ~s");
        $ic91$ = makeString("~%~s -> ~s");
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32598", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUAL))), (SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeSymbol("S#32599", "CYC"));
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUAL);
        $ic94$ = makeSymbol("PIF");
        $ic95$ = makeSymbol("CAND");
        $ic96$ = makeSymbol("S#32591", "CYC");
        $ic97$ = makeSymbol("COR");
        $ic98$ = makeSymbol("NULL");
        $ic99$ = makeSymbol("S#32593", "CYC");
        $ic100$ = makeSymbol("MEMBER");
        $ic101$ = makeSymbol("S#32592", "CYC");
        $ic102$ = makeSymbol("PROGN");
        $ic103$ = makeSymbol("S#32588", "CYC");
        $ic104$ = makeSymbol("CLET");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*IT-VERBOSE*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*TEST-STATUS*"), (SubLObject)NIL));
        $ic106$ = makeSymbol("FORMAT");
        $ic107$ = makeString("~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%");
        $ic108$ = makeSymbol("QUOTE");
        $ic109$ = makeSymbol("PWHEN");
        $ic110$ = makeSymbol("APPLY");
        $ic111$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FORMAT"));
        $ic112$ = makeSymbol("CNOT");
        $ic113$ = makeString("~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%");
        $ic114$ = makeString("~&This previously failing test~%  ~s~%was not evaluated.~%");
        $ic115$ = makeString("~%~%Starting ~a ...");
        $ic116$ = makeSymbol("DEF-INFERENCE-TEST");
        $ic117$ = makeSymbol("DEFINE-INFERENCE-TEST");
        $ic118$ = makeSymbol("S#2609", "CYC");
        $ic119$ = makeSymbol("FIRST");
        $ic120$ = makeString("~s");
        $ic121$ = makeString("~s is not an accessible pathname.");
        $ic122$ = makeSymbol("STRING<");
        $ic123$ = makeSymbol("S#32556", "CYC");
        $ic124$ = makeString("~%:ERROR :LOADING ~A ~S");
        $ic125$ = makeString("~%~s is bound to ~s, which is not known to be a valid pathname.");
        $ic126$ = makeSymbol("PATHNAME");
        $ic127$ = ConsesLow.list((SubLObject)makeSymbol("S#32600", "CYC"), (SubLObject)makeSymbol("S#32601", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic128$ = makeSymbol("S#32525", "CYC");
        $ic129$ = makeUninternedSymbol("US#652009");
        $ic130$ = makeSymbol("CUNWIND-PROTECT");
        $ic131$ = makeSymbol("S#32529", "CYC");
        $ic132$ = makeSymbol("CSETQ");
        $ic133$ = makeSymbol("LIST");
        $ic134$ = makeSymbol("PRINT-ASSERT");
        $ic135$ = makeSymbol("S#32531", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)makeSymbol("S#10753", "CYC"), (SubLObject)makeKeyword("MONOTONIC"), (SubLObject)makeKeyword("FORWARD"));
        $ic137$ = makeSymbol("S#32594", "CYC");
        $ic138$ = makeSymbol("PRINT-KILL");
        $ic139$ = ConsesLow.list((SubLObject)makeSymbol("S#32600", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32602", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#32601", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic140$ = makeUninternedSymbol("US#4C5DFFF");
        $ic141$ = makeSymbol("PRINT-UNASSERT");
        $ic142$ = makeUninternedSymbol("US#4C5DFFF");
        $ic143$ = makeSymbol("APPEND");
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic145$ = makeUninternedSymbol("US#5DEEC5F");
        $ic146$ = makeSymbol("DEFMACRO");
        $ic147$ = makeSymbol("&REST");
        $ic148$ = makeSymbol("RET");
        $ic149$ = makeSymbol("BQ-LIST");
        $ic150$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("CDESTRUCTURING-BIND"));
        $ic151$ = makeSymbol("BQ-CONS");
        $ic152$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("LIST"));
        $ic153$ = makeSymbol("BQ-APPEND");
        $ic154$ = ConsesLow.list((SubLObject)NIL);
        $ic155$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("PWHEN"));
        $ic156$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*IT-VERBOSE*"));
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("FORMAT"));
        $ic158$ = makeString("~&~%>>>>> ~A ~S");
        $ic159$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("PROGN"));
        $ic160$ = makeString("~&~%<<<<< ~A ~S");
        $ic161$ = makeSymbol("B-VERIFY");
        $ic162$ = ConsesLow.list((SubLObject)makeSymbol("S#32603", "CYC"), (SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeKeyword("BACKWARD")), makeSymbol("S#2607", "CYC"), makeSymbol("S#2605", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#32378", "CYC"), makeSymbol("S#32379", "CYC"), makeSymbol("CREATOR"), ConsesLow.list((SubLObject)makeSymbol("S#2608", "CYC"), (SubLObject)T) }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic163$ = ConsesLow.list((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("BUG"), (SubLObject)makeKeyword("CREATED"), (SubLObject)makeKeyword("CREATOR"), (SubLObject)makeKeyword("WORKING?"));
        $ic164$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic165$ = makeKeyword("KB");
        $ic166$ = makeKeyword("OWNER");
        $ic167$ = makeKeyword("COMMENT");
        $ic168$ = makeKeyword("BUG");
        $ic169$ = makeKeyword("CREATED");
        $ic170$ = makeKeyword("CREATOR");
        $ic171$ = makeKeyword("WORKING?");
        $ic172$ = ConsesLow.list((SubLObject)makeSymbol("HERALD-START"));
        $ic173$ = makeSymbol("PCOND");
        $ic174$ = makeSymbol("S#32563", "CYC");
        $ic175$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("*TEST-STATUS*"), (SubLObject)makeKeyword("NOT-RUN")));
        $ic176$ = makeSymbol("S#2665", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("*TEST-STATUS*"), (SubLObject)makeKeyword("INVALID")));
        $ic178$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("UPDATE-TEST-RESULTS"), (SubLObject)makeSymbol("*CURRENT-TEST*")));
        $ic179$ = makeSymbol("S#32564", "CYC");
        $ic180$ = makeKeyword("BOTH");
        $ic181$ = makeKeyword("FULL");
        $ic182$ = makeKeyword("TINY");
        $ic183$ = makeSymbol("KEYWORDP");
        $ic184$ = ConsesLow.list((SubLObject)makeKeyword("FORWARD"), (SubLObject)makeKeyword("BACKWARD"), (SubLObject)makeKeyword("BOTH"));
        $ic185$ = makeSymbol("S#32565", "CYC");
        $ic186$ = makeSymbol("S#2526", "CYC");
        $ic187$ = makeSymbol("S#32272", "CYC");
        $ic188$ = makeSymbol("STRINGP");
        $ic189$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic190$ = makeKeyword("BUG-NUMBER");
        $ic191$ = makeSymbol("S#4999", "CYC");
        $ic192$ = makeKeyword("CREATION-DATE");
        $ic193$ = makeSymbol("BOOLEANP");
        $ic194$ = makeSymbol("S#2650", "CYC");
        $ic195$ = makeSymbol("S#32580", "CYC");
        $ic196$ = makeSymbol("S#32581", "CYC");
        $ic197$ = makeSymbol("S#32582", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 747 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/