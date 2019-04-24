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
        if (var1 == module0421.UNPROVIDED) {
            var1 = module0421.$g3415$.getDynamicValue();
        }
        if (var2 == module0421.UNPROVIDED) {
            var2 = (SubLObject)module0421.$ic1$;
        }
        return module0075.f5175((SubLObject)module0421.$ic2$, var1, var2);
    }
    
    public static SubLObject f29384(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0421.UNPROVIDED) {
            var4 = (SubLObject)module0421.NIL;
        }
        if (var5 == module0421.UNPROVIDED) {
            var5 = (SubLObject)module0421.NIL;
        }
        final SubLObject var6 = module0409.f28506(var3, var4, var5);
        SubLObject var7 = (SubLObject)module0421.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0421.NIL;
        var9 = var8.first();
        while (module0421.NIL != var8) {
            if (Sequences.length(var9).numG((SubLObject)module0421.ONE_INTEGER)) {
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
        if (var11 == module0421.UNPROVIDED) {
            var11 = (SubLObject)module0421.NIL;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.NIL;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.NIL;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.NIL;
        }
        final SubLObject var15 = module0538.f33428(var10, var4, var11, var12, var13, var14);
        SubLObject var16 = (SubLObject)module0421.NIL;
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)module0421.NIL;
        var18 = var17.first();
        while (module0421.NIL != var17) {
            var16 = (SubLObject)ConsesLow.cons(conses_high.sublis(var18, var10, Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED), var16);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var16;
    }
    
    public static SubLObject f29386(final SubLObject var10, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var16) {
        if (var11 == module0421.UNPROVIDED) {
            var11 = (SubLObject)module0421.NIL;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.NIL;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.NIL;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.NIL;
        }
        if (var16 == module0421.UNPROVIDED) {
            var16 = (SubLObject)module0421.T;
        }
        final SubLObject var17 = f29385(var10, var4, var11, var12, var13, var14);
        if (module0421.NIL != var17) {
            SubLObject var18 = var17;
            SubLObject var19 = (SubLObject)module0421.NIL;
            var19 = var18.first();
            while (module0421.NIL != var18) {
                PrintLow.format(var16, (SubLObject)module0421.$ic4$, var19);
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        else {
            PrintLow.format(var16, (SubLObject)module0421.$ic5$);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29387(final SubLObject var18, final SubLObject var19) {
        return module0259.f16891(var18, var19);
    }
    
    public static SubLObject f29388(final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == module0421.UNPROVIDED) {
            var11 = (SubLObject)module0421.NIL;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.NIL;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.NIL;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.NIL;
        }
        final SubLObject var21 = module0434.f30570(var11, var12, var13, var14);
        return f29389(var20, var4, var21);
    }
    
    public static SubLObject f29389(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0421.UNPROVIDED) {
            var4 = (SubLObject)module0421.NIL;
        }
        if (var5 == module0421.UNPROVIDED) {
            var5 = (SubLObject)module0421.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var6).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var6)) {
            var5 = conses_high.putf(var5, (SubLObject)module0421.$ic7$, (SubLObject)module0421.NIL);
            final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var7);
            }
            final SubLObject var8 = Eval.eval(var7);
            if (module0421.NIL != var8) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic10$, var7, var8);
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var6);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6) || module0421.NIL != module0421.$g3432$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic12$, var7, var8);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var6)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic13$, new SubLObject[] { var7, var8 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29390(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var25).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var25)) {
            SubLObject var26 = var24;
            SubLObject var27 = (SubLObject)module0421.NIL;
            var27 = var26.first();
            while (module0421.NIL != var26) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var25)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var27);
                }
                Eval.eval(var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29391(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var23).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var23)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var22);
            }
            final SubLObject var24 = Eval.eval(var22);
            if (module0421.NIL != var24) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic14$, var22, var24);
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var23);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23) || module0421.NIL != module0421.$g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic15$, var22, var24);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic13$, new SubLObject[] { var22, var24 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29392(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var23).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var23)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)module0421.NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0421.$ic16$, var23);
                    try {
                        final SubLObject var28_29 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)module0421.NIL, var23);
                            Eval.eval(var22);
                            if (module0421.NIL != module0538.f33324()) {
                                Errors.error((SubLObject)module0421.$ic17$, module0538.f33327());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_29, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)module0421.NIL);
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
            if (module0421.NIL != var24) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic18$, var24);
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var23);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23) || module0421.NIL != module0421.$g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic19$, var22);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic19$, new SubLObject[] { var22 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29393(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var23).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var23)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)module0421.NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0421.$ic16$, var23);
                    try {
                        final SubLObject var28_32 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)module0421.NIL, var23);
                            Eval.eval(var22);
                            if (module0421.NIL != module0538.f33321()) {
                                Errors.error((SubLObject)module0421.$ic17$, module0538.f33322());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_32, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)module0421.NIL);
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
            if (module0421.NIL != var24) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic18$, var24);
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var23);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23) || module0421.NIL != module0421.$g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic19$, var22);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic19$, new SubLObject[] { var22 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29394(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var23).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var23)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var22);
            }
            SubLObject var24 = (SubLObject)module0421.NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0421.$ic16$, var23);
                    try {
                        final SubLObject var28_33 = module0111.$g1406$.currentBinding(var23);
                        try {
                            module0111.$g1406$.bind((SubLObject)module0421.NIL, var23);
                            Eval.eval(var22);
                            if (module0421.NIL != module0538.f33321()) {
                                Errors.error((SubLObject)module0421.$ic17$, module0538.f33322());
                            }
                        }
                        finally {
                            module0111.$g1406$.rebind(var28_33, var23);
                        }
                    }
                    catch (Throwable var26) {
                        Errors.handleThrowable(var26, (SubLObject)module0421.NIL);
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
            if (module0421.NIL != var24) {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var23);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23) || module0421.NIL != module0421.$g3432$.getDynamicValue(var23)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic20$, var24);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var23)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic19$, new SubLObject[] { var22 });
                }
            }
            else if (module0421.NIL != module0421.$g3424$.getDynamicValue(var23)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic21$);
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29395(final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var37) {
        if (var37 == module0421.UNPROVIDED) {
            var37 = (SubLObject)module0421.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var38).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var38)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var38)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var36);
            }
            final SubLObject var39 = Eval.eval(var36);
            if (module0421.NIL != ((module0421.NIL != var37) ? Functions.funcall(var34, var35, var39, var37) : Functions.funcall(var34, var35, var39))) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var38)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic22$, new SubLObject[] { var36, var39, var35, var34 });
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var38);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var38) || module0421.NIL != module0421.$g3432$.getDynamicValue(var38)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic23$, new SubLObject[] { var36, var39, var35, var34 });
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var38)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic24$, new SubLObject[] { var36, var39, var35, var34 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29396(final SubLObject var38, final SubLObject var36) {
        return f29397(var38, var36, (SubLObject)module0421.$ic25$);
    }
    
    public static SubLObject f29398(final SubLObject var38, final SubLObject var36) {
        return f29397(var38, var36, (SubLObject)module0421.$ic26$);
    }
    
    public static SubLObject f29397(final SubLObject var38, final SubLObject var36, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var40).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var40)) {
            final SubLObject var41 = Eval.eval(var36);
            final SubLObject var42 = (var39 == module0421.$ic25$) ? Eval.eval((SubLObject)ConsesLow.list(var38, var41)) : Functions.apply(var38, (SubLObject)ConsesLow.list(var41));
            if (module0421.NIL != var42) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var40)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic27$, new SubLObject[] { var36, var41, var38 });
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var40);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var40)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic28$, new SubLObject[] { var36, var41, var38 });
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var40)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic29$, new SubLObject[] { var36, var41, var38 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29399(final SubLObject var42, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0421.UNPROVIDED) {
            var4 = (SubLObject)module0421.NIL;
        }
        if (var5 == module0421.UNPROVIDED) {
            var5 = (SubLObject)module0421.NIL;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var43).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var43)) {
            final SubLObject var44 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic30$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var43)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var44);
            }
            final SubLObject var45 = Eval.eval(var44);
            final SubLObject var46 = conses_high.intersection(var42, var45, Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED);
            final SubLObject var47 = conses_high.set_difference(var42, var46, Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED);
            final SubLObject var48 = conses_high.set_difference(var45, var42, Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED);
            if (module0421.NIL != module0035.f2201(var42, var46, Symbols.symbol_function((SubLObject)module0421.EQUAL))) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var43)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic31$, new SubLObject[] { var44, var46, var42 });
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic32$, var43);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var43)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic33$, new SubLObject[] { var44, var46, var42, var47, var48 });
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var43)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic34$, new SubLObject[] { var44, var46, var42, var47, var48 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29400(final SubLObject var47, final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == module0421.UNPROVIDED) {
            var11 = (SubLObject)module0421.NIL;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.NIL;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.NIL;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.NIL;
        }
        final SubLObject var48 = module0434.f30570(var11, var12, var13, var14);
        return f29401(var47, var20, var4, var48);
    }
    
    public static SubLObject f29401(final SubLObject var47, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0421.UNPROVIDED) {
            var4 = (SubLObject)module0421.NIL;
        }
        if (var5 == module0421.UNPROVIDED) {
            var5 = (SubLObject)module0421.NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var48).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var48)) {
            var5 = conses_high.putf(var5, (SubLObject)module0421.$ic7$, (SubLObject)module0421.NIL);
            final SubLObject var49 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var48)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var49);
            }
            final SubLObject var50 = Eval.eval(var49);
            if (module0421.NIL != module0035.f2201(var47, var50, Symbols.symbol_function((SubLObject)module0421.$ic35$))) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var48)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic31$, new SubLObject[] { var49, var50, var47 });
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic32$, var48);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var48)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic36$, new SubLObject[] { var49, var50, var47 });
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var48)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic37$, new SubLObject[] { var49, var50, var47 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29402(final SubLObject var20, final SubLObject var4, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == module0421.UNPROVIDED) {
            var11 = (SubLObject)module0421.NIL;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.NIL;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.NIL;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.NIL;
        }
        final SubLObject var21 = module0434.f30570(var11, var12, var13, var14);
        return f29403(var20, var4, var21);
    }
    
    public static SubLObject f29403(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0421.UNPROVIDED) {
            var4 = (SubLObject)module0421.NIL;
        }
        if (var5 == module0421.UNPROVIDED) {
            var5 = (SubLObject)module0421.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var6).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var6)) {
            var5 = conses_high.putf(var5, (SubLObject)module0421.$ic7$, (SubLObject)module0421.NIL);
            final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic8$, module0035.f2241(var3), module0035.f2241(var4), module0035.f2241(var5));
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var7);
            }
            final SubLObject var8 = Eval.eval(var7);
            if (module0421.NIL == var8) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic10$, var7, var8);
                }
            }
            else {
                module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var6);
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var6) || module0421.NIL != module0421.$g3432$.getDynamicValue(var6)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic12$, var7, var8);
                }
                if (module0421.NIL != module0421.$g3421$.getDynamicValue(var6)) {
                    Errors.sublisp_break((SubLObject)module0421.$ic13$, new SubLObject[] { var7, var8 });
                }
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29404(final SubLObject var24, final SubLObject var4, SubLObject var49, SubLObject var50) {
        if (var49 == module0421.UNPROVIDED) {
            var49 = (SubLObject)module0421.$ic38$;
        }
        if (var50 == module0421.UNPROVIDED) {
            var50 = (SubLObject)module0421.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var51).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var51)) {
            SubLObject var52 = var24;
            SubLObject var53 = (SubLObject)module0421.NIL;
            var53 = var52.first();
            while (module0421.NIL != var52) {
                final SubLObject var54 = (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic39$, var49, ConsesLow.append((SubLObject)((module0421.NIL != var50) ? ConsesLow.list((SubLObject)module0421.$ic40$, var50) : module0421.NIL), (SubLObject)module0421.NIL));
                final SubLObject var55 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic41$, module0035.f2241(var53), module0035.f2241(var4), module0035.f2241(var54));
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var51)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var55);
                }
                final SubLObject var56 = module0018.$g689$.currentBinding(var51);
                final SubLObject var57 = module0111.$g1406$.currentBinding(var51);
                try {
                    module0018.$g689$.bind((SubLObject)module0421.NIL, var51);
                    module0111.$g1406$.bind((SubLObject)module0421.NIL, var51);
                    final SubLObject var58 = Eval.eval(var55);
                    if (module0421.NIL == var58) {
                        module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var51);
                        if (module0421.NIL != module0421.$g3424$.getDynamicValue(var51) || module0421.NIL != module0421.$g3432$.getDynamicValue(var51)) {
                            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic42$, var55);
                        }
                        if (module0421.NIL != module0421.$g3421$.getDynamicValue(var51)) {
                            Errors.sublisp_break((SubLObject)module0421.$ic43$, new SubLObject[] { var55 });
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
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29405(final SubLObject var24, final SubLObject var4, SubLObject var49, SubLObject var50) {
        if (var49 == module0421.UNPROVIDED) {
            var49 = (SubLObject)module0421.$ic38$;
        }
        if (var50 == module0421.UNPROVIDED) {
            var50 = (SubLObject)module0421.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var51).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var51)) {
            SubLObject var52 = var24;
            SubLObject var53 = (SubLObject)module0421.NIL;
            var53 = var52.first();
            while (module0421.NIL != var52) {
                final SubLObject var54 = (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic39$, var49, ConsesLow.append((SubLObject)((module0421.NIL != var50) ? ConsesLow.list((SubLObject)module0421.$ic40$, var50) : module0421.NIL), (SubLObject)module0421.NIL));
                final SubLObject var55 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic44$, module0035.f2241(var53), module0035.f2241(var4), module0035.f2241(var54));
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var51)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var55);
                }
                final SubLObject var56 = module0018.$g689$.currentBinding(var51);
                final SubLObject var57 = module0111.$g1406$.currentBinding(var51);
                try {
                    module0018.$g689$.bind((SubLObject)module0421.NIL, var51);
                    module0111.$g1406$.bind((SubLObject)module0421.NIL, var51);
                    final SubLObject var58 = Eval.eval(var55);
                    if (module0421.NIL == var58) {
                        module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var51);
                        if (module0421.NIL != module0421.$g3424$.getDynamicValue(var51) || module0421.NIL != module0421.$g3432$.getDynamicValue(var51)) {
                            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic42$, var55);
                        }
                        if (module0421.NIL != module0421.$g3421$.getDynamicValue(var51)) {
                            Errors.sublisp_break((SubLObject)module0421.$ic43$, new SubLObject[] { var55 });
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
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29406(final SubLObject var24, final SubLObject var4) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var25).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var25)) {
            SubLObject var26 = var24;
            SubLObject var27 = (SubLObject)module0421.NIL;
            var27 = var26.first();
            while (module0421.NIL != var26) {
                final SubLObject var28 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic45$, module0035.f2241(var27), module0035.f2241(var4));
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var25)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var28);
                }
                Eval.eval(var28);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29407(final SubLObject var25, final SubLObject var4, SubLObject var54) {
        if (var54 == module0421.UNPROVIDED) {
            var54 = (SubLObject)module0421.NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var55).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var55)) {
            final SubLObject var56 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic46$, module0035.f2241(var25), module0035.f2241(var4), var54);
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var55)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var56);
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic47$, Eval.eval(var56));
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29408(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)module0421.NIL;
        var58 = var57.first();
        while (module0421.NIL != var57) {
            if (module0421.NIL != module0173.f10969(var58)) {
                if (module0421.NIL != module0421.$g3424$.getDynamicValue(var56)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic48$, var58));
                }
                final SubLObject var59 = module0597.f36628(var58);
                module0538.f33365(var58);
                if (module0421.NIL == module0538.f33337(var59)) {
                    module0421.$g3417$.setDynamicValue(Sequences.delete(var59, module0421.$g3417$.getDynamicValue(var56), Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED), var56);
                }
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29409(final SubLObject var1, SubLObject var57) {
        if (var57 == module0421.UNPROVIDED) {
            var57 = (SubLObject)module0421.NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0421.NIL;
        SubLObject var60 = (SubLObject)module0421.NIL;
        SubLObject var61 = (SubLObject)module0421.NIL;
        SubLObject var62 = (SubLObject)module0421.NIL;
        var59 = module0126.f8395(var1, (SubLObject)module0421.UNPROVIDED);
        var60 = (SubLObject)ConsesLow.list((SubLObject)module0421.$ic49$, var59);
        if (module0421.NIL == module0538.f33337(var59)) {
            var62 = (SubLObject)module0421.T;
            var61 = Eval.eval(var60);
        }
        if (module0421.NIL == var62) {
            module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic11$, var58);
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var58) || module0421.NIL != module0421.$g3432$.getDynamicValue(var58)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic50$, var1);
            }
            if (module0421.NIL != module0421.$g3421$.getDynamicValue(var58)) {
                Errors.sublisp_break((SubLObject)module0421.$ic51$, new SubLObject[] { var59 });
            }
        }
        else if (module0421.NIL != var61) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var58)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, var60);
            }
            final SubLObject var63 = var59;
            if (module0421.NIL == conses_high.member(var63, module0421.$g3417$.getDynamicValue(var58), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.IDENTITY))) {
                module0421.$g3417$.setDynamicValue((SubLObject)ConsesLow.cons(var63, module0421.$g3417$.getDynamicValue(var58)), var58);
            }
            return var61;
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29410(final SubLObject var62, final SubLObject var4) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var63).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var63)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var63)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic52$, module0035.f2241(var62), module0035.f2241(var4)));
            }
            module0538.f33437(var62, var4);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29411(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var5).equal((SubLObject)module0421.$ic6$) || module0421.NIL != module0421.$g3431$.getDynamicValue(var5)) {
            if (module0421.NIL != module0421.$g3424$.getDynamicValue(var5)) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic53$, module0035.f2241(var4)));
            }
            module0538.f33439(var4);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29412(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if (module0421.$g3419$.getDynamicValue(var64).equal((SubLObject)module0421.$ic6$)) {
            module0421.$g3419$.setDynamicValue((SubLObject)module0421.$ic54$, var64);
        }
        final SubLObject var65 = (SubLObject)ConsesLow.list(var63, module0421.$g3429$.getDynamicValue(var64));
        if (module0421.NIL != Sequences.find(var65, module0421.$g3420$.getDynamicValue(var64), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)) {
            module0421.$g3420$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var65, module0421.$g3419$.getDynamicValue(var64)), Sequences.remove(var65, module0421.$g3420$.getDynamicValue(var64), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)), var64);
        }
        else {
            module0421.$g3420$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var65, module0421.$g3419$.getDynamicValue(var64)), module0421.$g3420$.getDynamicValue(var64)), var64);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29413() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0421.NIL != module0421.$g3436$.getDynamicValue(var21)) {
            SubLObject var22 = module0421.$g3417$.getDynamicValue(var21);
            SubLObject var23 = (SubLObject)module0421.NIL;
            var23 = var22.first();
            while (module0421.NIL != var22) {
                final SubLObject var24 = module0538.f33337(var23);
                if (module0421.NIL != var24) {
                    f29408((SubLObject)ConsesLow.list(var24));
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
            module0421.$g3417$.setDynamicValue((SubLObject)module0421.NIL, var21);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29414(final SubLObject var63, SubLObject var66, SubLObject var67, SubLObject var68, SubLObject var69, SubLObject var12, SubLObject var13, SubLObject var14) {
        final SubLObject var70 = (SubLObject)SubLObjectFactory.makeBoolean(var69 != module0421.UNPROVIDED);
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.T;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        if (var68 == module0421.UNPROVIDED) {
            var68 = (SubLObject)module0421.$ic3$;
        }
        if (var69 == module0421.UNPROVIDED) {
            var69 = (SubLObject)module0421.T;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.ONE_INTEGER;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.TEN_INTEGER;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.TWENTY_INTEGER;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0574.f35126() == module0421.$ic56$) {
            module0574.f35127((SubLObject)module0421.$ic57$);
        }
        if (var68 == module0421.$ic58$ && module0421.NIL == var70) {
            var69 = (SubLObject)module0421.NIL;
        }
        final SubLObject var72 = f29415(var63);
        SubLObject var73 = (SubLObject)module0421.NIL;
        final SubLObject var74 = module0421.$g3417$.currentBinding(var71);
        try {
            module0421.$g3417$.bind((SubLObject)module0421.NIL, var71);
            if (var72.isCons()) {
                final SubLObject var75 = module0213.f13982();
                try {
                    final SubLObject var28_73 = module0421.$g3418$.currentBinding(var71);
                    final SubLObject var76 = module0421.$g3419$.currentBinding(var71);
                    final SubLObject var77 = module0421.$g3422$.currentBinding(var71);
                    final SubLObject var78 = module0421.$g3425$.currentBinding(var71);
                    final SubLObject var79 = module0421.$g3426$.currentBinding(var71);
                    final SubLObject var80 = module0421.$g3427$.currentBinding(var71);
                    final SubLObject var81 = module0421.$g3428$.currentBinding(var71);
                    final SubLObject var82 = module0421.$g3424$.currentBinding(var71);
                    final SubLObject var83 = module0421.$g3429$.currentBinding(var71);
                    try {
                        module0421.$g3418$.bind(var63, var71);
                        module0421.$g3419$.bind((SubLObject)module0421.$ic6$, var71);
                        module0421.$g3422$.bind((SubLObject)module0421.NIL, var71);
                        module0421.$g3425$.bind(var69, var71);
                        module0421.$g3426$.bind(var12, var71);
                        module0421.$g3427$.bind(var13, var71);
                        module0421.$g3428$.bind(var14, var71);
                        module0421.$g3424$.bind(var67, var71);
                        module0421.$g3429$.bind(var68, var71);
                        if (module0421.NIL != var66) {
                            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic59$, (SubLObject)ConsesLow.list(var63, module0421.$g3429$.getDynamicValue(var71)));
                            streams_high.force_output((SubLObject)module0421.UNPROVIDED);
                        }
                        SubLObject var13_81 = (SubLObject)module0421.NIL;
                        final SubLObject var84 = Time.get_internal_real_time();
                        SubLObject var85 = var72;
                        SubLObject var86 = (SubLObject)module0421.NIL;
                        var86 = var85.first();
                        while (module0421.NIL != var85) {
                            module0112.f7688(var86);
                            var85 = var85.rest();
                            var86 = var85.first();
                        }
                        var13_81 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var84), time_high.$internal_time_units_per_second$.getGlobalValue());
                        final SubLObject var87 = (SubLObject)ConsesLow.list(var63, var68);
                        var73 = module0029.f1535((SubLObject)module0421.$ic60$, var87, module0421.$g3419$.getDynamicValue(var71), var13_81);
                        if (module0421.NIL != var66) {
                            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic61$, conses_high.assoc((SubLObject)ConsesLow.list(var63, module0421.$g3429$.getDynamicValue(var71)), module0421.$g3420$.getDynamicValue(var71), Symbols.symbol_function((SubLObject)module0421.EQUAL), (SubLObject)module0421.UNPROVIDED).rest(), var13_81);
                        }
                    }
                    finally {
                        module0421.$g3429$.rebind(var83, var71);
                        module0421.$g3424$.rebind(var82, var71);
                        module0421.$g3428$.rebind(var81, var71);
                        module0421.$g3427$.rebind(var80, var71);
                        module0421.$g3426$.rebind(var79, var71);
                        module0421.$g3425$.rebind(var78, var71);
                        module0421.$g3422$.rebind(var77, var71);
                        module0421.$g3419$.rebind(var76, var71);
                        module0421.$g3418$.rebind(var28_73, var71);
                    }
                }
                finally {
                    final SubLObject var28_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0421.T, var71);
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
                if (module0421.NIL != module0004.f109(var89) || module0421.NIL != module0004.f109(var90) || module0421.NIL != module0004.f109(var91) || module0421.NIL != module0004.f109(var92) || module0421.NIL != module0004.f109(var93)) {
                    if (Sequences.cconcatenate((SubLObject)module0421.$ic62$, new SubLObject[] { module0006.f205(var63), module0421.$ic63$, module0006.f205(var68), module0421.$ic64$ }).isString()) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic65$, Sequences.cconcatenate((SubLObject)module0421.$ic62$, new SubLObject[] { module0006.f205(var63), module0421.$ic63$, module0006.f205(var68), module0421.$ic64$ }));
                    }
                    if (module0421.NIL != module0004.f109(var89)) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic66$, new SubLObject[] { Numbers.abs(var89), Numbers.abs(var89).numG((SubLObject)module0421.ONE_INTEGER) ? module0421.$ic67$ : module0421.$ic68$, (module0421.NIL != module0004.f105(var89)) ? module0421.$ic69$ : module0421.$ic70$ });
                    }
                    if (module0421.NIL != module0004.f109(var90)) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic71$, new SubLObject[] { Numbers.abs(var90), Numbers.abs(var90).numG((SubLObject)module0421.ONE_INTEGER) ? module0421.$ic67$ : module0421.$ic68$, (module0421.NIL != module0004.f105(var90)) ? module0421.$ic69$ : module0421.$ic70$ });
                    }
                    if (module0421.NIL != module0004.f109(var91)) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic72$, new SubLObject[] { Numbers.abs(var91), Numbers.abs(var91).numG((SubLObject)module0421.ONE_INTEGER) ? module0421.$ic67$ : module0421.$ic68$, (module0421.NIL != module0004.f105(var91)) ? module0421.$ic69$ : module0421.$ic70$ });
                    }
                    if (module0421.NIL != module0004.f109(var92)) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic73$, new SubLObject[] { Numbers.abs(var92), Numbers.abs(var92).numG((SubLObject)module0421.ONE_INTEGER) ? module0421.$ic67$ : module0421.$ic68$, (module0421.NIL != module0004.f105(var92)) ? module0421.$ic69$ : module0421.$ic70$ });
                    }
                    if (module0421.NIL != module0004.f109(var93)) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic74$, new SubLObject[] { Numbers.abs(var93), Numbers.abs(var93).numG((SubLObject)module0421.ONE_INTEGER) ? module0421.$ic67$ : module0421.$ic68$, (module0421.NIL != module0004.f105(var93)) ? module0421.$ic69$ : module0421.$ic70$ });
                    }
                }
                else if (module0421.NIL.isString()) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic65$, (SubLObject)module0421.NIL);
                }
                streams_high.force_output((SubLObject)module0421.T);
            }
            else {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic75$, (SubLObject)module0421.$ic76$, var63);
                if (module0421.NIL == module0421.$g3416$.getDynamicValue(var71)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic77$, (SubLObject)module0421.$ic76$);
                }
            }
        }
        finally {
            module0421.$g3417$.rebind(var74, var71);
        }
        return var73;
    }
    
    public static SubLObject f29416(SubLObject var90, SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92, SubLObject var68, SubLObject var69, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var90 == module0421.UNPROVIDED) {
            var90 = f29417((SubLObject)module0421.UNPROVIDED);
        }
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.T;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        if (var91 == module0421.UNPROVIDED) {
            var91 = (SubLObject)module0421.NIL;
        }
        if (var92 == module0421.UNPROVIDED) {
            var92 = (SubLObject)module0421.NIL;
        }
        if (var68 == module0421.UNPROVIDED) {
            var68 = (SubLObject)module0421.$ic3$;
        }
        if (var69 == module0421.UNPROVIDED) {
            var69 = (SubLObject)module0421.T;
        }
        if (var12 == module0421.UNPROVIDED) {
            var12 = (SubLObject)module0421.ONE_INTEGER;
        }
        if (var13 == module0421.UNPROVIDED) {
            var13 = (SubLObject)module0421.TEN_INTEGER;
        }
        if (var14 == module0421.UNPROVIDED) {
            var14 = (SubLObject)module0421.TWENTY_INTEGER;
        }
        if (var90.isCons()) {
            SubLObject var93 = (SubLObject)module0421.NIL;
            SubLObject var94 = var90;
            SubLObject var95 = (SubLObject)module0421.NIL;
            var95 = var94.first();
            while (module0421.NIL != var94) {
                final SubLObject var96 = f29414(var95, var66, var67, var68, var69, var12, var13, var14);
                var93 = (SubLObject)ConsesLow.cons(var96, var93);
                var94 = var94.rest();
                var95 = var94.first();
            }
            f29418((SubLObject)module0421.UNPROVIDED);
            final SubLObject var97 = module0029.f1542(var93);
            return Values.values(var97, (SubLObject)((module0421.NIL != var92) ? var93 : module0421.NIL));
        }
        if (module0421.NIL == var91) {
            return (SubLObject)module0421.NIL;
        }
        final SubLObject var98 = f29417((SubLObject)module0421.T);
        if (module0421.NIL != var98) {
            return f29416(var98, var66, var67, (SubLObject)module0421.NIL, var68, var69, var12, var13, var14, (SubLObject)module0421.UNPROVIDED);
        }
        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic78$, (SubLObject)module0421.$ic79$, var90);
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29419(SubLObject var41) {
        if (var41 == module0421.UNPROVIDED) {
            var41 = module0421.$g3420$.getDynamicValue();
        }
        var41 = Sort.sort(conses_high.copy_list(var41), Symbols.symbol_function((SubLObject)module0421.$ic80$), Symbols.symbol_function((SubLObject)module0421.$ic55$));
        var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)module0421.$ic80$), Symbols.symbol_function((SubLObject)module0421.$ic81$));
        return var41;
    }
    
    public static SubLObject f29418(SubLObject var97) {
        if (var97 == module0421.UNPROVIDED) {
            var97 = module0029.$g839$.getDynamicValue();
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        if (module0421.$ic82$ != var97) {
            final SubLObject var99 = print_high.$print_pretty$.currentBinding(var98);
            try {
                print_high.$print_pretty$.bind((SubLObject)module0421.NIL, var98);
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic83$);
                SubLObject var100 = (SubLObject)module0421.NIL;
                final SubLObject var101 = var97;
                if (var101.eql((SubLObject)module0421.$ic84$)) {
                    var100 = (SubLObject)module0421.$ic85$;
                }
                else if (var101.eql((SubLObject)module0421.$ic86$)) {
                    var100 = (SubLObject)module0421.$ic87$;
                }
                else {
                    Errors.error((SubLObject)module0421.$ic88$, var97);
                }
                SubLObject var102 = f29419((SubLObject)module0421.UNPROVIDED);
                SubLObject var103 = (SubLObject)module0421.NIL;
                var103 = var102.first();
                while (module0421.NIL != var102) {
                    if (var97 == module0421.$ic86$) {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic89$, new SubLObject[] { var103.rest(), var100, var103.first(), f29420(conses_high.caar(var103)) });
                    }
                    else {
                        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic90$, new SubLObject[] { var103.rest(), var100, var103.first() });
                    }
                    var102 = var102.rest();
                    var103 = var102.first();
                }
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic83$);
            }
            finally {
                print_high.$print_pretty$.rebind(var99, var98);
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29421() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = print_high.$print_pretty$.currentBinding(var21);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0421.NIL, var21);
            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic83$);
            SubLObject var23 = f29419((SubLObject)module0421.UNPROVIDED);
            SubLObject var24 = (SubLObject)module0421.NIL;
            var24 = var23.first();
            while (module0421.NIL != var23) {
                if (var24.rest().equal((SubLObject)module0421.$ic11$)) {
                    PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic91$, var24.rest(), var24.first());
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic83$);
        }
        finally {
            print_high.$print_pretty$.rebind(var22, var21);
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29422(final SubLObject var100, SubLObject var101, SubLObject var102, SubLObject var103) {
        if (var101 == module0421.UNPROVIDED) {
            var101 = (SubLObject)module0421.NIL;
        }
        if (var102 == module0421.UNPROVIDED) {
            var102 = (SubLObject)module0421.NIL;
        }
        if (var103 == module0421.UNPROVIDED) {
            var103 = (SubLObject)module0421.NIL;
        }
        if (module0421.NIL != var101) {
            if (module0421.NIL != Symbols.boundp(var101)) {
                return conses_high.assoc(Symbols.symbol_value(var101), conses_high.assoc(var101, var100, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED).rest(), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED).rest();
            }
            return (SubLObject)module0421.NIL;
        }
        else {
            if (module0421.NIL == var102) {
                return (SubLObject)module0421.NIL;
            }
            if (module0421.NIL != Symbols.fboundp(var102)) {
                return conses_high.assoc(Functions.apply(var102, var103), conses_high.assoc(var102, var100, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED).rest(), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED).rest();
            }
            return (SubLObject)module0421.NIL;
        }
    }
    
    public static SubLObject f29423(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic92$);
        var108 = var107.first();
        var107 = var107.rest();
        final SubLObject var109 = (SubLObject)(var107.isCons() ? var107.first() : module0421.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)module0421.$ic92$);
        var107 = var107.rest();
        final SubLObject var110 = (SubLObject)(var107.isCons() ? var107.first() : module0421.$ic93$);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)module0421.$ic92$);
        var107 = var107.rest();
        final SubLObject var111 = (SubLObject)(var107.isCons() ? var107.first() : module0421.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)module0421.$ic92$);
        var107 = var107.rest();
        final SubLObject var112 = (SubLObject)(var107.isCons() ? var107.first() : module0421.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var107, var106, (SubLObject)module0421.$ic92$);
        var107 = var107.rest();
        if (module0421.NIL == var107) {
            return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic94$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic95$, (SubLObject)module0421.$ic96$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic97$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic98$, var109), (SubLObject)module0421.$ic99$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic100$, var109, (SubLObject)module0421.$ic101$, var110))), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic94$, (SubLObject)module0421.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic104$, (SubLObject)module0421.$ic105$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic106$, (SubLObject)module0421.T, (SubLObject)module0421.$ic107$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var108), var109), var108, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic109$, var111, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic110$, (SubLObject)module0421.$ic111$, (SubLObject)module0421.T, var111, var112))), var108)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic109$, (SubLObject)module0421.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic94$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic98$, var109)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic106$, (SubLObject)module0421.T, (SubLObject)module0421.$ic113$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var108), var109), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic106$, (SubLObject)module0421.T, (SubLObject)module0421.$ic114$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var108)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var106, (SubLObject)module0421.$ic92$);
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29424(final SubLObject var111, SubLObject var112) {
        if (var112 == module0421.UNPROVIDED) {
            var112 = (SubLObject)module0421.NIL;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        return ConsesLow.nconc((SubLObject)ConsesLow.list(module0421.$g3418$.getDynamicValue(var113), var111), var112);
    }
    
    public static SubLObject f29425() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0421.NIL != module0421.$g3424$.getDynamicValue(var21)) {
            PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic115$, module0421.$g3418$.getDynamicValue(var21));
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29426(final SubLObject var63, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0421.NIL != module0004.f104(var63, module0421.$g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$))) {
            module0421.$g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), Sequences.remove(var63, module0421.$g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)), var114);
        }
        else {
            module0421.$g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), module0421.$g3416$.getDynamicValue(var114)), var114);
        }
        return var63;
    }
    
    public static SubLObject f29427(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (module0421.NIL != conses_high.assoc(var94, module0421.$g3416$.getDynamicValue(var95), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)) {
            return (SubLObject)module0421.T;
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29415(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        return conses_high.second(conses_high.assoc(var94, module0421.$g3416$.getDynamicValue(var95), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED));
    }
    
    public static SubLObject f29428(final SubLObject var114) {
        return module0035.f2439((SubLObject)module0421.$ic118$, f29415(var114), (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29429(final SubLObject var114) {
        return module0205.f13183(f29415(var114), (SubLObject)module0421.$ic118$, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29430() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic119$), module0421.$g3416$.getDynamicValue(var21));
    }
    
    public static SubLObject f29431(final SubLObject var115) {
        if (var115.isString()) {
            return var115;
        }
        return PrintLow.format((SubLObject)module0421.NIL, (SubLObject)module0421.$ic120$, var115);
    }
    
    public static SubLObject f29417(SubLObject var116) {
        if (var116 == module0421.UNPROVIDED) {
            var116 = (SubLObject)module0421.NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (module0421.NIL != var116) {
            final SubLObject var118 = f29383((SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
            if (var118.isString() && module0421.NIL != Filesys.probe_file(var118)) {
                Eval.load(var118);
            }
            else {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic121$, var118);
            }
        }
        final SubLObject var119 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic55$), module0421.$g3416$.getDynamicValue(var117));
        if (module0421.NIL != var119) {
            return Sort.sort(conses_high.copy_list(var119), Symbols.symbol_function((SubLObject)module0421.$ic122$), Symbols.symbol_function((SubLObject)module0421.$ic123$));
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29432(SubLObject var119) {
        if (var119 == module0421.UNPROVIDED) {
            var119 = (SubLObject)module0421.NIL;
        }
        final SubLThread var120 = SubLProcess.currentSubLThread();
        final SubLObject var121 = var119.isString() ? var119 : f29383((SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
        if (var121.isString() && module0421.NIL != Filesys.probe_file(var121)) {
            var120.resetMultipleValues();
            final SubLObject var122 = module0075.f5252(var121);
            final SubLObject var123 = var120.secondMultipleValue();
            var120.resetMultipleValues();
            if (module0421.NIL != var123) {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic124$, var119, var123);
            }
            return var122;
        }
        PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic125$, (SubLObject)module0421.$ic126$, var121);
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29433() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0421.$g3416$.setDynamicValue((SubLObject)module0421.NIL, var21);
        return module0421.$g3416$.getDynamicValue(var21);
    }
    
    public static SubLObject f29434() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0421.$g3420$.setDynamicValue((SubLObject)module0421.NIL, var21);
        return module0421.$g3420$.getDynamicValue(var21);
    }
    
    public static SubLObject f29435(SubLObject var66, SubLObject var67, SubLObject var97, SubLObject var121, SubLObject var91, SubLObject var92) {
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.NIL;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        if (var97 == module0421.UNPROVIDED) {
            var97 = module0029.$g839$.getDynamicValue();
        }
        if (var121 == module0421.UNPROVIDED) {
            var121 = module0029.$g835$.getDynamicValue();
        }
        if (var91 == module0421.UNPROVIDED) {
            var91 = (SubLObject)module0421.T;
        }
        if (var92 == module0421.UNPROVIDED) {
            var92 = (SubLObject)module0421.NIL;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)module0421.NIL;
        final SubLObject var124 = module0029.$g839$.currentBinding(var122);
        final SubLObject var125 = module0029.$g835$.currentBinding(var122);
        try {
            module0029.$g839$.bind(var97, var122);
            module0029.$g835$.bind(var121, var122);
            f29434();
            var122.resetMultipleValues();
            final SubLObject var126 = f29436(var66, var67, var91, (SubLObject)module0421.T);
            final SubLObject var127 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            var123 = ConsesLow.nconc(var123, var127);
            f29434();
            var122.resetMultipleValues();
            final SubLObject var128 = f29437(var66, var67, var91, (SubLObject)module0421.T);
            final SubLObject var129 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            var123 = ConsesLow.nconc(var123, var129);
        }
        finally {
            module0029.$g835$.rebind(var125, var122);
            module0029.$g839$.rebind(var124, var122);
        }
        final SubLObject var130 = module0029.f1542(var123);
        return Values.values(var130, (SubLObject)((module0421.NIL != var92) ? var123 : module0421.NIL));
    }
    
    public static SubLObject f29436(SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92) {
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.NIL;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        if (var91 == module0421.UNPROVIDED) {
            var91 = (SubLObject)module0421.NIL;
        }
        if (var92 == module0421.UNPROVIDED) {
            var92 = (SubLObject)module0421.NIL;
        }
        return f29416(f29417((SubLObject)module0421.UNPROVIDED), var66, var67, var91, var92, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29437(SubLObject var66, SubLObject var67, SubLObject var91, SubLObject var92) {
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.NIL;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        if (var91 == module0421.UNPROVIDED) {
            var91 = (SubLObject)module0421.NIL;
        }
        if (var92 == module0421.UNPROVIDED) {
            var92 = (SubLObject)module0421.NIL;
        }
        return f29416(f29417((SubLObject)module0421.UNPROVIDED), var66, var67, var91, var92, (SubLObject)module0421.$ic58$, (SubLObject)module0421.NIL, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29438(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        SubLObject var109 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic127$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic127$);
        var109 = var107.first();
        final SubLObject var110;
        var107 = (var110 = var107.rest());
        final SubLObject var111 = module0035.f2119(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic128$), var109));
        final SubLObject var112 = (SubLObject)module0421.$ic129$;
        return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic104$, reader.bq_cons(var112, ConsesLow.append(var111, (SubLObject)module0421.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic130$, reader.bq_cons((SubLObject)module0421.$ic102$, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)module0421.$ic131$), var109, module0421.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)module0421.$ic132$, var112, reader.bq_cons((SubLObject)module0421.$ic133$, ConsesLow.append(var111, (SubLObject)module0421.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic134$, reader.bq_cons((SubLObject)module0421.$ic133$, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)module0421.$ic135$), var109, module0421.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0421.NIL)), (SubLObject)module0421.$ic136$), ConsesLow.append(var110, (SubLObject)module0421.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic109$, (SubLObject)module0421.$ic137$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic138$, var112))));
    }
    
    public static SubLObject f29439(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        SubLObject var109 = (SubLObject)module0421.NIL;
        SubLObject var110 = (SubLObject)module0421.NIL;
        SubLObject var111 = (SubLObject)module0421.NIL;
        SubLObject var112 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var109 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var110 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var111 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var112 = var107.first();
        final SubLObject var113;
        var107 = (var113 = var107.rest());
        final SubLObject var114 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic128$), var112);
        final SubLObject var115 = (SubLObject)module0421.$ic140$;
        return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic104$, ConsesLow.append(var112, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var115, reader.bq_cons((SubLObject)module0421.$ic133$, ConsesLow.append(var114, (SubLObject)module0421.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic130$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic134$, var115, var109, var110, var111), ConsesLow.append(var113, (SubLObject)module0421.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic141$, var115, var109)));
    }
    
    public static SubLObject f29440(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        SubLObject var109 = (SubLObject)module0421.NIL;
        SubLObject var110 = (SubLObject)module0421.NIL;
        SubLObject var111 = (SubLObject)module0421.NIL;
        SubLObject var112 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var109 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var110 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var111 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic139$);
        var112 = var107.first();
        final SubLObject var113;
        var107 = (var113 = var107.rest());
        final SubLObject var114 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic128$), var112);
        final SubLObject var115 = (SubLObject)module0421.$ic142$;
        return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic104$, ConsesLow.append(var112, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var115, reader.bq_cons((SubLObject)module0421.$ic143$, ConsesLow.append(var114, (SubLObject)module0421.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic130$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic134$, var115, var109, var110, var111), ConsesLow.append(var113, (SubLObject)module0421.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic141$, var115, var109)));
    }
    
    public static SubLObject f29441(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        SubLObject var109 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic144$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic144$);
        var109 = var107.first();
        final SubLObject var110;
        var107 = (var110 = var107.rest());
        final SubLObject var111 = (SubLObject)module0421.$ic145$;
        return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic146$, var108, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic147$, var111), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic148$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic149$, (SubLObject)module0421.$ic150$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var109), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic151$, (SubLObject)module0421.$ic152$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic153$, var111, (SubLObject)module0421.$ic154$)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic149$, (SubLObject)module0421.$ic155$, (SubLObject)module0421.$ic156$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic149$, (SubLObject)module0421.$ic157$, (SubLObject)module0421.T, (SubLObject)module0421.$ic158$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var108)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic151$, (SubLObject)module0421.$ic152$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic153$, var111, (SubLObject)module0421.$ic154$)))), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic151$, (SubLObject)module0421.$ic159$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var110)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic149$, (SubLObject)module0421.$ic155$, (SubLObject)module0421.$ic156$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic149$, (SubLObject)module0421.$ic157$, (SubLObject)module0421.T, (SubLObject)module0421.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, var108)), (SubLObject)ConsesLow.list((SubLObject)module0421.$ic151$, (SubLObject)module0421.$ic152$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic153$, var111, (SubLObject)module0421.$ic154$)))))));
    }
    
    public static SubLObject f29442(final SubLObject var142, final SubLObject var143, SubLObject var144, SubLObject var128, SubLObject var4, SubLObject var135, SubLObject var50) {
        if (var144 == module0421.UNPROVIDED) {
            var144 = Symbols.symbol_function((SubLObject)module0421.$ic161$);
        }
        if (var128 == module0421.UNPROVIDED) {
            var128 = (SubLObject)module0421.T;
        }
        if (var4 == module0421.UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        if (var135 == module0421.UNPROVIDED) {
            var135 = (SubLObject)module0421.$ic38$;
        }
        if (var50 == module0421.UNPROVIDED) {
            var50 = module0421.$g3429$.getDynamicValue();
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        final SubLObject var146 = ConsesLow.append(new SubLObject[] { var142 });
        try {
            f29404(var146, var4, var135, var50);
            SubLObject var147 = var143;
            SubLObject var148 = (SubLObject)module0421.NIL;
            var148 = var147.first();
            while (module0421.NIL != var147) {
                Functions.funcall(var144, var148, var4, module0421.$g3425$.getDynamicValue(var145), module0421.$g3426$.getDynamicValue(var145), module0421.$g3427$.getDynamicValue(var145), module0421.$g3428$.getDynamicValue(var145));
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        finally {
            final SubLObject var149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var145);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0421.T, var145);
                f29406(var146, var4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var149, var145);
            }
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29443(final SubLObject var104, final SubLObject var105) {
        SubLObject var107;
        final SubLObject var106 = var107 = var104.rest();
        SubLObject var108 = (SubLObject)module0421.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic162$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0421.$ic162$);
        final SubLObject var109 = var107.rest();
        var107 = var107.first();
        SubLObject var110 = (SubLObject)module0421.NIL;
        SubLObject var111 = var107;
        SubLObject var112 = (SubLObject)module0421.NIL;
        SubLObject var154_155 = (SubLObject)module0421.NIL;
        while (module0421.NIL != var111) {
            cdestructuring_bind.destructuring_bind_must_consp(var111, var106, (SubLObject)module0421.$ic162$);
            var154_155 = var111.first();
            var111 = var111.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var111, var106, (SubLObject)module0421.$ic162$);
            if (module0421.NIL == conses_high.member(var154_155, (SubLObject)module0421.$ic163$, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)) {
                var112 = (SubLObject)module0421.T;
            }
            if (var154_155 == module0421.$ic164$) {
                var110 = var111.first();
            }
            var111 = var111.rest();
        }
        if (module0421.NIL != var112 && module0421.NIL == var110) {
            cdestructuring_bind.cdestructuring_bind_error(var106, (SubLObject)module0421.$ic162$);
        }
        final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic40$, var107);
        final SubLObject var114 = (SubLObject)((module0421.NIL != var113) ? conses_high.cadr(var113) : module0421.$ic3$);
        final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic165$, var107);
        final SubLObject var116 = (SubLObject)((module0421.NIL != var115) ? conses_high.cadr(var115) : module0421.NIL);
        final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic166$, var107);
        final SubLObject var118 = (SubLObject)((module0421.NIL != var117) ? conses_high.cadr(var117) : module0421.NIL);
        final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic167$, var107);
        final SubLObject var120 = (SubLObject)((module0421.NIL != var119) ? conses_high.cadr(var119) : module0421.NIL);
        final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic168$, var107);
        final SubLObject var122 = (SubLObject)((module0421.NIL != var121) ? conses_high.cadr(var121) : module0421.NIL);
        final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic169$, var107);
        final SubLObject var124 = (SubLObject)((module0421.NIL != var123) ? conses_high.cadr(var123) : module0421.NIL);
        final SubLObject var125 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic170$, var107);
        final SubLObject var126 = (SubLObject)((module0421.NIL != var125) ? conses_high.cadr(var125) : module0421.NIL);
        final SubLObject var127 = cdestructuring_bind.property_list_member((SubLObject)module0421.$ic171$, var107);
        final SubLObject var128 = (SubLObject)((module0421.NIL != var127) ? conses_high.cadr(var127) : module0421.T);
        final SubLObject var129;
        var107 = (var129 = var109);
        return (SubLObject)ConsesLow.list((SubLObject)module0421.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic116$, var108, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic108$, (SubLObject)ConsesLow.listS((SubLObject)module0421.$ic172$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic173$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0421.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0421.$ic174$, var108)), (SubLObject)module0421.$ic175$), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0421.$ic176$, var108), (SubLObject)module0421.$ic177$), reader.bq_cons((SubLObject)module0421.T, ConsesLow.append(var129, (SubLObject)module0421.NIL))), (SubLObject)module0421.$ic178$))), (SubLObject)ConsesLow.list(new SubLObject[] { module0421.$ic179$, var108, var114, var116, var118, var120, var122, var124, var126, var128 }));
    }
    
    public static SubLObject f29444(final SubLObject var149) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        final SubLObject var151 = f29445(var149);
        if (module0421.$ic180$ != var151 && !var151.eql(module0421.$g3429$.getDynamicValue(var150))) {
            return (SubLObject)module0421.NIL;
        }
        final SubLObject var152 = f29446(var149);
        if (module0421.NIL == f29447(var152, module0029.$g835$.getDynamicValue(var150))) {
            return (SubLObject)module0421.NIL;
        }
        return (SubLObject)module0421.T;
    }
    
    public static SubLObject f29447(final SubLObject var172, final SubLObject var173) {
        final SubLObject var174 = module0018.f973();
        final SubLObject var175 = (SubLObject)SubLObjectFactory.makeBoolean(module0421.NIL == var174);
        if (module0421.NIL != var175 && module0421.$ic181$ == var172) {
            return (SubLObject)module0421.NIL;
        }
        if (module0421.NIL != var174 && module0421.$ic182$ == var172 && module0421.NIL == var173) {
            return (SubLObject)module0421.NIL;
        }
        return (SubLObject)module0421.T;
    }
    
    public static SubLObject f29448(final SubLObject var149, final SubLObject var50, final SubLObject var158, final SubLObject var160, final SubLObject var162, final SubLObject var164, final SubLObject var176, final SubLObject var168, final SubLObject var170) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        assert module0421.NIL != Types.keywordp(var149) : var149;
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
        return module0004.f104(var177, (SubLObject)module0421.$ic184$, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29459(final SubLObject var177) {
        return Types.stringp(var177);
    }
    
    public static SubLObject f29449(final SubLObject var149, SubLObject var50) {
        if (module0421.NIL == var50) {
            var50 = (SubLObject)module0421.$ic180$;
        }
        assert module0421.NIL != f29458(var50) : var50;
        Symbols.put(var149, (SubLObject)module0421.$ic40$, var50);
        return var50;
    }
    
    public static SubLObject f29445(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic40$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29450(final SubLObject var149, final SubLObject var158) {
        assert module0421.NIL != module0029.f1472(var158) : var158;
        if (module0421.NIL != var158) {
            Symbols.put(var149, (SubLObject)module0421.$ic165$, var158);
        }
        return var158;
    }
    
    public static SubLObject f29446(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic165$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29451(final SubLObject var149, final SubLObject var160) {
        assert module0421.NIL != f29459(var160) : var160;
        if (module0421.NIL != var160) {
            Symbols.put(var149, (SubLObject)module0421.$ic166$, var160);
        }
        return var160;
    }
    
    public static SubLObject f29420(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic166$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29452(final SubLObject var149, final SubLObject var162) {
        if (module0421.NIL != var162 && !module0421.areAssertionsDisabledFor(me) && module0421.NIL == Types.stringp(var162)) {
            throw new AssertionError(var162);
        }
        if (module0421.NIL != var162) {
            Symbols.put(var149, (SubLObject)module0421.$ic167$, var162);
        }
        return var162;
    }
    
    public static SubLObject f29460(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic167$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29453(final SubLObject var149, final SubLObject var178) {
        if (module0421.NIL != var178 && !module0421.areAssertionsDisabledFor(me) && module0421.NIL == module0004.f105(var178)) {
            throw new AssertionError(var178);
        }
        if (module0421.NIL != var178) {
            Symbols.put(var149, (SubLObject)module0421.$ic190$, var178);
        }
        return var178;
    }
    
    public static SubLObject f29461(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic190$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29454(final SubLObject var149, final SubLObject var176) {
        if (module0421.NIL != var176 && !module0421.areAssertionsDisabledFor(me) && module0421.NIL == module0051.f3603(var176)) {
            throw new AssertionError(var176);
        }
        if (module0421.NIL != var176) {
            Symbols.put(var149, (SubLObject)module0421.$ic192$, var176);
        }
        return var176;
    }
    
    public static SubLObject f29462(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic192$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29455(final SubLObject var149, final SubLObject var168) {
        if (module0421.NIL != var168 && !module0421.areAssertionsDisabledFor(me) && module0421.NIL == Types.stringp(var168)) {
            throw new AssertionError(var168);
        }
        if (module0421.NIL != var168) {
            Symbols.put(var149, (SubLObject)module0421.$ic170$, var168);
        }
        return var168;
    }
    
    public static SubLObject f29463(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic170$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29456(final SubLObject var149, final SubLObject var170) {
        assert module0421.NIL != Types.booleanp(var170) : var170;
        Symbols.put(var149, (SubLObject)module0421.$ic171$, var170);
        return var170;
    }
    
    public static SubLObject f29464(final SubLObject var149) {
        return Symbols.get(var149, (SubLObject)module0421.$ic171$, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29465() {
        return module0035.remove_if_not((SubLObject)module0421.$ic194$, f29430(), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29466() {
        return Sequences.remove_if((SubLObject)module0421.$ic194$, f29430(), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
    }
    
    public static SubLObject f29467(final SubLObject var63, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0421.NIL != module0004.f104(var63, module0421.$g3416$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$))) {
            module0421.$g3437$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), Sequences.remove(var63, module0421.$g3437$.getDynamicValue(var114), Symbols.symbol_function((SubLObject)module0421.EQUAL), Symbols.symbol_function((SubLObject)module0421.$ic55$), (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED)), var114);
        }
        else {
            module0421.$g3416$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var113), module0421.$g3416$.getDynamicValue(var114)), var114);
        }
        return var63;
    }
    
    public static SubLObject f29468(SubLObject var116) {
        if (var116 == module0421.UNPROVIDED) {
            var116 = (SubLObject)module0421.NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (module0421.NIL != var116) {
            final SubLObject var118 = f29383((SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
            if (var118.isString() && module0421.NIL != Filesys.probe_file(var118)) {
                Eval.load(var118);
            }
            else {
                PrintLow.format((SubLObject)module0421.T, (SubLObject)module0421.$ic121$, var118);
            }
        }
        final SubLObject var119 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0421.$ic55$), module0421.$g3437$.getDynamicValue(var117));
        if (module0421.NIL != var119) {
            return Sort.sort(conses_high.copy_list(var119), Symbols.symbol_function((SubLObject)module0421.$ic122$), Symbols.symbol_function((SubLObject)module0421.$ic123$));
        }
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29469(SubLObject var66, SubLObject var67) {
        if (var66 == module0421.UNPROVIDED) {
            var66 = (SubLObject)module0421.NIL;
        }
        if (var67 == module0421.UNPROVIDED) {
            var67 = (SubLObject)module0421.NIL;
        }
        f29416(f29468((SubLObject)module0421.UNPROVIDED), var66, var67, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED, (SubLObject)module0421.UNPROVIDED);
        return (SubLObject)module0421.NIL;
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
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29471() {
        module0421.$g3415$ = SubLFiles.defparameter("S#32583", (SubLObject)module0421.$ic0$);
        module0421.$g3416$ = SubLFiles.defvar("S#32584", (SubLObject)module0421.NIL);
        module0421.$g3417$ = SubLFiles.defparameter("S#32585", (SubLObject)module0421.NIL);
        module0421.$g3418$ = SubLFiles.defparameter("*CURRENT-TEST*", (SubLObject)module0421.NIL);
        module0421.$g3419$ = SubLFiles.defparameter("*TEST-STATUS*", (SubLObject)module0421.NIL);
        module0421.$g3420$ = SubLFiles.defparameter("S#32586", (SubLObject)module0421.NIL);
        module0421.$g3421$ = SubLFiles.defparameter("*BREAK-ON-FAILURE*", (SubLObject)module0421.NIL);
        module0421.$g3422$ = SubLFiles.defparameter("S#32587", (SubLObject)module0421.NIL);
        module0421.$g3423$ = SubLFiles.defparameter("S#32588", (SubLObject)module0421.T);
        module0421.$g3424$ = SubLFiles.defparameter("*IT-VERBOSE*", (SubLObject)module0421.T);
        module0421.$g3425$ = SubLFiles.defparameter("*IT-BACKCHAIN*", (SubLObject)module0421.NIL);
        module0421.$g3426$ = SubLFiles.defparameter("*IT-NUMBER*", (SubLObject)module0421.ONE_INTEGER);
        module0421.$g3427$ = SubLFiles.defparameter("*IT-TIME*", (SubLObject)module0421.TWENTY_INTEGER);
        module0421.$g3428$ = SubLFiles.defparameter("*IT-DEPTH*", (SubLObject)module0421.TWENTY_INTEGER);
        module0421.$g3429$ = SubLFiles.defparameter("*TEST-DIRECTION*", (SubLObject)module0421.$ic3$);
        module0421.$g3430$ = SubLFiles.defparameter("S#32589", (SubLObject)module0421.NIL);
        module0421.$g3431$ = SubLFiles.defparameter("*DEBUG-CONTINUE*", (SubLObject)module0421.NIL);
        module0421.$g3432$ = SubLFiles.defparameter("S#32590", (SubLObject)module0421.NIL);
        module0421.$g3433$ = SubLFiles.defparameter("S#32591", (SubLObject)module0421.NIL);
        module0421.$g3434$ = SubLFiles.defparameter("S#32592", (SubLObject)module0421.NIL);
        module0421.$g3435$ = SubLFiles.defparameter("S#32593", (SubLObject)module0421.NIL);
        module0421.$g3436$ = SubLFiles.defparameter("S#32594", (SubLObject)module0421.T);
        module0421.$g3437$ = SubLFiles.defvar("S#32595", (SubLObject)module0421.NIL);
        return (SubLObject)module0421.NIL;
    }
    
    public static SubLObject f29472() {
        module0002.f50((SubLObject)module0421.$ic116$, (SubLObject)module0421.$ic117$);
        module0002.f50((SubLObject)module0421.$ic174$, (SubLObject)module0421.$ic117$);
        module0002.f50((SubLObject)module0421.$ic179$, (SubLObject)module0421.$ic117$);
        module0002.f35((SubLObject)module0421.$ic195$, (SubLObject)module0421.NIL);
        module0002.f35((SubLObject)module0421.$ic196$, (SubLObject)module0421.NIL);
        module0002.f35((SubLObject)module0421.$ic197$, (SubLObject)module0421.NIL);
        return (SubLObject)module0421.NIL;
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
        module0421.$g3415$ = null;
        module0421.$g3416$ = null;
        module0421.$g3417$ = null;
        module0421.$g3418$ = null;
        module0421.$g3419$ = null;
        module0421.$g3420$ = null;
        module0421.$g3421$ = null;
        module0421.$g3422$ = null;
        module0421.$g3423$ = null;
        module0421.$g3424$ = null;
        module0421.$g3425$ = null;
        module0421.$g3426$ = null;
        module0421.$g3427$ = null;
        module0421.$g3428$ = null;
        module0421.$g3429$ = null;
        module0421.$g3430$ = null;
        module0421.$g3431$ = null;
        module0421.$g3432$ = null;
        module0421.$g3433$ = null;
        module0421.$g3434$ = null;
        module0421.$g3435$ = null;
        module0421.$g3436$ = null;
        module0421.$g3437$ = null;
        $ic0$ = SubLObjectFactory.makeString("inference-tests");
        $ic1$ = SubLObjectFactory.makeString("lisp");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tests"));
        $ic3$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic4$ = SubLObjectFactory.makeString("~%~s");
        $ic5$ = SubLObjectFactory.makeString("~%No assertions found.");
        $ic6$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic7$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic8$ = SubLObjectFactory.makeSymbol("NEW-CYC-QUERY");
        $ic9$ = SubLObjectFactory.makeString("~%~%~s");
        $ic10$ = SubLObjectFactory.makeString("~%~%Success: ~s~%         ==> ~s");
        $ic11$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic12$ = SubLObjectFactory.makeString("~%~%Failure: ~s~%         ==> ~s");
        $ic13$ = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s");
        $ic14$ = SubLObjectFactory.makeString("~%~%Success: ~s~%         ==> ~s~%");
        $ic15$ = SubLObjectFactory.makeString("~%~%Failure: ~s~%         ==> ~s~%");
        $ic16$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic17$ = SubLObjectFactory.makeString("~A");
        $ic18$ = SubLObjectFactory.makeString("~%~%Success: ~A~%");
        $ic19$ = SubLObjectFactory.makeString("~%~%Failure: ~s~%         ==> NO ERROR~%");
        $ic20$ = SubLObjectFactory.makeString("~%~%Failure: ~A~%");
        $ic21$ = SubLObjectFactory.makeString("~%~%Success: ~s~%         ==> NO ERROR~%");
        $ic22$ = SubLObjectFactory.makeString("~%~%Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic23$ = SubLObjectFactory.makeString("~%~%Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic24$ = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $ic25$ = SubLObjectFactory.makeKeyword("EVAL-AGAIN");
        $ic26$ = SubLObjectFactory.makeKeyword("APPLY");
        $ic27$ = SubLObjectFactory.makeString("~%~%Success: ~s~%         ==> ~s  passes ~s");
        $ic28$ = SubLObjectFactory.makeString("~%~%Failure: ~s~%         ==> ~s fails ~s");
        $ic29$ = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s fails ~s");
        $ic30$ = SubLObjectFactory.makeSymbol("S#32540", "CYC");
        $ic31$ = SubLObjectFactory.makeString("~%~%Normal: ~s~%        ==> ~s~%Expected: ~s");
        $ic32$ = SubLObjectFactory.makeKeyword("ABNORMAL");
        $ic33$ = SubLObjectFactory.makeString("~%~%Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $ic34$ = SubLObjectFactory.makeString("Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $ic35$ = SubLObjectFactory.makeSymbol("S#18097", "CYC");
        $ic36$ = SubLObjectFactory.makeString("~%~%Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $ic37$ = SubLObjectFactory.makeString("Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $ic38$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic39$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic40$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic41$ = SubLObjectFactory.makeSymbol("CYC-ASSERT");
        $ic42$ = SubLObjectFactory.makeString("~%~%Failure: Assertion ~s failed.");
        $ic43$ = SubLObjectFactory.makeString("Failure: Assertion ~s failed.");
        $ic44$ = SubLObjectFactory.makeSymbol("S#21465", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("FI-UNASSERT-INT");
        $ic46$ = SubLObjectFactory.makeSymbol("S#20826", "CYC");
        $ic47$ = SubLObjectFactory.makeString("~%Justification => ~s");
        $ic48$ = SubLObjectFactory.makeSymbol("FI-KILL-INT");
        $ic49$ = SubLObjectFactory.makeSymbol("S#32596", "CYC");
        $ic50$ = SubLObjectFactory.makeString("~%~%Failure: Did not find unique name to create a constant for ~s.");
        $ic51$ = SubLObjectFactory.makeString("Failure: Create constant ~s failed.");
        $ic52$ = SubLObjectFactory.makeSymbol("S#32536", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#32537", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic55$ = SubLObjectFactory.makeSymbol("CAR");
        $ic56$ = SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE");
        $ic57$ = SubLObjectFactory.makeKeyword("DEAF");
        $ic58$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic59$ = SubLObjectFactory.makeString("~&:IT ~A");
        $ic60$ = SubLObjectFactory.makeKeyword("IT");
        $ic61$ = SubLObjectFactory.makeString("-> ~s (~,3f)");
        $ic62$ = SubLObjectFactory.makeString("Warning: Test (");
        $ic63$ = SubLObjectFactory.makeString(" ");
        $ic64$ = SubLObjectFactory.makeString(") changed the KB!");
        $ic65$ = SubLObjectFactory.makeString("~&~A~%");
        $ic66$ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $ic67$ = SubLObjectFactory.makeString("s were");
        $ic68$ = SubLObjectFactory.makeString(" was");
        $ic69$ = SubLObjectFactory.makeString("created");
        $ic70$ = SubLObjectFactory.makeString("destroyed");
        $ic71$ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $ic72$ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $ic73$ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $ic74$ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $ic75$ = SubLObjectFactory.makeString("~&There is no test in ~s associated with ~s.~%");
        $ic76$ = SubLObjectFactory.makeSymbol("S#32584", "CYC");
        $ic77$ = SubLObjectFactory.makeString("~&In fact, there are no tests in ~s at all!~%");
        $ic78$ = SubLObjectFactory.makeString("~%The ~s argument is ~s, which is not a list of test keywords.");
        $ic79$ = SubLObjectFactory.makeSymbol("S#32597", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("CDR");
        $ic82$ = SubLObjectFactory.makeKeyword("SILENT");
        $ic83$ = SubLObjectFactory.makeString("~%");
        $ic84$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic85$ = SubLObjectFactory.makeString("->");
        $ic86$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic87$ = SubLObjectFactory.makeString(":IT");
        $ic88$ = SubLObjectFactory.makeString("Unknown output format ~A");
        $ic89$ = SubLObjectFactory.makeString("~%~s ~a ~s :OWNER ~s");
        $ic90$ = SubLObjectFactory.makeString("~%~s ~a ~s");
        $ic91$ = SubLObjectFactory.makeString("~%~s -> ~s");
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32598", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0421.EQUAL))), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32599", "CYC"));
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0421.EQUAL);
        $ic94$ = SubLObjectFactory.makeSymbol("PIF");
        $ic95$ = SubLObjectFactory.makeSymbol("CAND");
        $ic96$ = SubLObjectFactory.makeSymbol("S#32591", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("COR");
        $ic98$ = SubLObjectFactory.makeSymbol("NULL");
        $ic99$ = SubLObjectFactory.makeSymbol("S#32593", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic101$ = SubLObjectFactory.makeSymbol("S#32592", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic103$ = SubLObjectFactory.makeSymbol("S#32588", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("CLET");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IT-VERBOSE*"), (SubLObject)module0421.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)module0421.NIL));
        $ic106$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic107$ = SubLObjectFactory.makeString("~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%");
        $ic108$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic109$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic110$ = SubLObjectFactory.makeSymbol("APPLY");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $ic112$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic113$ = SubLObjectFactory.makeString("~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%");
        $ic114$ = SubLObjectFactory.makeString("~&This previously failing test~%  ~s~%was not evaluated.~%");
        $ic115$ = SubLObjectFactory.makeString("~%~%Starting ~a ...");
        $ic116$ = SubLObjectFactory.makeSymbol("DEF-INFERENCE-TEST");
        $ic117$ = SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-TEST");
        $ic118$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic120$ = SubLObjectFactory.makeString("~s");
        $ic121$ = SubLObjectFactory.makeString("~s is not an accessible pathname.");
        $ic122$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic123$ = SubLObjectFactory.makeSymbol("S#32556", "CYC");
        $ic124$ = SubLObjectFactory.makeString("~%:ERROR :LOADING ~A ~S");
        $ic125$ = SubLObjectFactory.makeString("~%~s is bound to ~s, which is not known to be a valid pathname.");
        $ic126$ = SubLObjectFactory.makeSymbol("PATHNAME");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32600", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic128$ = SubLObjectFactory.makeSymbol("S#32525", "CYC");
        $ic129$ = SubLObjectFactory.makeUninternedSymbol("US#652009");
        $ic130$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic131$ = SubLObjectFactory.makeSymbol("S#32529", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic133$ = SubLObjectFactory.makeSymbol("LIST");
        $ic134$ = SubLObjectFactory.makeSymbol("PRINT-ASSERT");
        $ic135$ = SubLObjectFactory.makeSymbol("S#32531", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10753", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $ic137$ = SubLObjectFactory.makeSymbol("S#32594", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("PRINT-KILL");
        $ic139$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32600", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32602", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic140$ = SubLObjectFactory.makeUninternedSymbol("US#4C5DFFF");
        $ic141$ = SubLObjectFactory.makeSymbol("PRINT-UNASSERT");
        $ic142$ = SubLObjectFactory.makeUninternedSymbol("US#4C5DFFF");
        $ic143$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic145$ = SubLObjectFactory.makeUninternedSymbol("US#5DEEC5F");
        $ic146$ = SubLObjectFactory.makeSymbol("DEFMACRO");
        $ic147$ = SubLObjectFactory.makeSymbol("&REST");
        $ic148$ = SubLObjectFactory.makeSymbol("RET");
        $ic149$ = SubLObjectFactory.makeSymbol("BQ-LIST");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"));
        $ic151$ = SubLObjectFactory.makeSymbol("BQ-CONS");
        $ic152$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $ic153$ = SubLObjectFactory.makeSymbol("BQ-APPEND");
        $ic154$ = ConsesLow.list((SubLObject)module0421.NIL);
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PWHEN"));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*IT-VERBOSE*"));
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $ic158$ = SubLObjectFactory.makeString("~&~%>>>>> ~A ~S");
        $ic159$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic160$ = SubLObjectFactory.makeString("~&~%<<<<< ~A ~S");
        $ic161$ = SubLObjectFactory.makeSymbol("B-VERIFY");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32603", "CYC"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), SubLObjectFactory.makeSymbol("S#2607", "CYC"), SubLObjectFactory.makeSymbol("S#2605", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#32378", "CYC"), SubLObjectFactory.makeSymbol("S#32379", "CYC"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"), (SubLObject)module0421.T) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic163$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("BUG"), (SubLObject)SubLObjectFactory.makeKeyword("CREATED"), (SubLObject)SubLObjectFactory.makeKeyword("CREATOR"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $ic164$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic165$ = SubLObjectFactory.makeKeyword("KB");
        $ic166$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic167$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic168$ = SubLObjectFactory.makeKeyword("BUG");
        $ic169$ = SubLObjectFactory.makeKeyword("CREATED");
        $ic170$ = SubLObjectFactory.makeKeyword("CREATOR");
        $ic171$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HERALD-START"));
        $ic173$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic174$ = SubLObjectFactory.makeSymbol("S#32563", "CYC");
        $ic175$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN")));
        $ic176$ = SubLObjectFactory.makeSymbol("S#2665", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID")));
        $ic178$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE-TEST-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-TEST*")));
        $ic179$ = SubLObjectFactory.makeSymbol("S#32564", "CYC");
        $ic180$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic181$ = SubLObjectFactory.makeKeyword("FULL");
        $ic182$ = SubLObjectFactory.makeKeyword("TINY");
        $ic183$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic184$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BOTH"));
        $ic185$ = SubLObjectFactory.makeSymbol("S#32565", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#2526", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#32272", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic189$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic190$ = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $ic191$ = SubLObjectFactory.makeSymbol("S#4999", "CYC");
        $ic192$ = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $ic193$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic194$ = SubLObjectFactory.makeSymbol("S#2650", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#32580", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#32581", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#32582", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0421.class
	Total time: 747 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/