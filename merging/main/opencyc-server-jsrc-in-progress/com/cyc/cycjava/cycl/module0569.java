package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0569 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0569";
    public static final String myFingerPrint = "e2697f5e9b8e76b89e78b92e8a0b6087088aee18fc12932003bbb2e4db27c95d";
    private static SubLSymbol $g4141$;
    private static SubLSymbol $g4142$;
    private static SubLSymbol $g4143$;
    public static SubLSymbol $g4144$;
    private static final SubLString $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLString $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLList $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLString $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLString $ic118$;
    
    public static SubLObject f34903() {
        f34904((SubLObject)UNPROVIDED);
        f34905();
        f34906();
        f34907();
        f34908();
        f34909();
        f34910();
        f34911();
        module0274.f18222();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34904(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        var3 = f34912();
        if (NIL != var1) {
            final SubLObject var4 = var3;
            module0012.$g82$.setDynamicValue((SubLObject)$ic0$, var2);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
            module0012.$g83$.setDynamicValue(Sequences.length(var4), var2);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
            final SubLObject var5 = module0012.$g75$.currentBinding(var2);
            final SubLObject var6 = module0012.$g76$.currentBinding(var2);
            final SubLObject var7 = module0012.$g77$.currentBinding(var2);
            final SubLObject var8 = module0012.$g78$.currentBinding(var2);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
                module0012.$g76$.bind((SubLObject)NIL, var2);
                module0012.$g77$.bind((SubLObject)T, var2);
                module0012.$g78$.bind(Time.get_universal_time(), var2);
                module0012.f478(module0012.$g82$.getDynamicValue(var2));
                SubLObject var9 = var4;
                SubLObject var10 = (SubLObject)NIL;
                var10 = var9.first();
                while (NIL != var9) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                    if (NIL != module0173.f10969(var10)) {
                        f34913(var10);
                    }
                    var9 = var9.rest();
                    var10 = var9.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var8, var2);
                module0012.$g77$.rebind(var7, var2);
                module0012.$g76$.rebind(var6, var2);
                module0012.$g75$.rebind(var5, var2);
            }
        }
        else {
            SubLObject var11 = var3;
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                if (NIL != module0173.f10969(var12)) {
                    f34913(var12);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        return Sequences.length(var3);
    }
    
    public static SubLObject f34914() {
        return Numbers.add(f34915(), f34916());
    }
    
    public static SubLObject f34917(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var12) && (NIL != f34918(var12) || NIL != f34919(var12)));
    }
    
    public static SubLObject f34915() {
        return module0217.f14247($ic1$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34918(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var12) && NIL != module0220.f14556(var12, $ic1$, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34912() {
        return module0035.f2269(Sequences.cconcatenate(f34920(), f34921()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34920() {
        return module0220.f14570($ic1$, (SubLObject)ONE_INTEGER, (SubLObject)$ic2$);
    }
    
    public static SubLObject f34919(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var12) && NIL != module0220.f14556(var12, $ic3$, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f34922(var12));
    }
    
    public static SubLObject f34922(final SubLObject var10) {
        return Numbers.numE(module0217.f14357(var10), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f34921() {
        final SubLObject var13 = module0083.f5708((SubLObject)UNPROVIDED);
        f34923(var13);
        return module0083.f5700(var13, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34916() {
        final SubLObject var13 = module0083.f5743();
        f34923(var13);
        return module0083.f5700(var13, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34923(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var14);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var14);
            module0147.$g2095$.bind($ic5$, var14);
            final SubLObject var17 = $ic3$;
            if (NIL != module0158.f10038(var17)) {
                final SubLObject var18 = (SubLObject)NIL;
                final SubLObject var5_16 = module0012.$g73$.currentBinding(var14);
                final SubLObject var6_17 = module0012.$g65$.currentBinding(var14);
                final SubLObject var19 = module0012.$g67$.currentBinding(var14);
                final SubLObject var20 = module0012.$g68$.currentBinding(var14);
                final SubLObject var21 = module0012.$g66$.currentBinding(var14);
                final SubLObject var22 = module0012.$g69$.currentBinding(var14);
                final SubLObject var23 = module0012.$g70$.currentBinding(var14);
                final SubLObject var24 = module0012.$silent_progressP$.currentBinding(var14);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var14);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var14), var14);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var14);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g70$.bind((SubLObject)T, var14);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var18) ? module0012.$silent_progressP$.getDynamicValue(var14) : T), var14);
                    module0012.f474(var18);
                    final SubLObject var25 = module0158.f10039(var17);
                    SubLObject var26 = (SubLObject)NIL;
                    final SubLObject var27 = (SubLObject)NIL;
                    while (NIL == var26) {
                        final SubLObject var28 = module0052.f3695(var25, var27);
                        final SubLObject var29 = (SubLObject)makeBoolean(!var27.eql(var28));
                        if (NIL != var29) {
                            module0012.f476();
                            SubLObject var30 = (SubLObject)NIL;
                            try {
                                var30 = module0158.f10316(var28, (SubLObject)$ic6$, (SubLObject)$ic2$, (SubLObject)NIL);
                                SubLObject var23_28 = (SubLObject)NIL;
                                final SubLObject var24_29 = (SubLObject)NIL;
                                while (NIL == var23_28) {
                                    final SubLObject var31 = module0052.f3695(var30, var24_29);
                                    final SubLObject var26_31 = (SubLObject)makeBoolean(!var24_29.eql(var31));
                                    if (NIL != var26_31) {
                                        final SubLObject var32 = module0178.f11331(var31, (SubLObject)ONE_INTEGER);
                                        if (NIL != f34922(var32)) {
                                            module0083.f5698(var13, var32);
                                        }
                                    }
                                    var23_28 = (SubLObject)makeBoolean(NIL == var26_31);
                                }
                            }
                            finally {
                                final SubLObject var5_17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var30) {
                                        module0158.f10319(var30);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var5_17, var14);
                                }
                            }
                        }
                        var26 = (SubLObject)makeBoolean(NIL == var29);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var24, var14);
                    module0012.$g70$.rebind(var23, var14);
                    module0012.$g69$.rebind(var22, var14);
                    module0012.$g66$.rebind(var21, var14);
                    module0012.$g68$.rebind(var20, var14);
                    module0012.$g67$.rebind(var19, var14);
                    module0012.$g65$.rebind(var6_17, var14);
                    module0012.$g73$.rebind(var5_16, var14);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var14);
            module0147.$g2094$.rebind(var15, var14);
        }
        return var13;
    }
    
    public static SubLObject f34913(final SubLObject var10) {
        assert NIL != module0173.f10955(var10) : var10;
        return module0540.f33510(var10);
    }
    
    public static SubLObject f34905() {
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        SubLObject var34 = module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            if (NIL != module0287.f19255(var35)) {
                var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                module0540.f33510(var35);
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f34906() {
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        SubLObject var34 = module0259.f16848($ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            if (NIL == module0287.f19204(var35, (SubLObject)UNPROVIDED)) {
                var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                module0540.f33510(var35);
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f34907() {
        return f34924(f34925(), (SubLObject)$ic9$);
    }
    
    public static SubLObject f34925() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0167.f10788();
        final SubLObject var5 = (SubLObject)$ic10$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var40_41 = var4;
            if (NIL == module0065.f4772(var40_41, (SubLObject)$ic12$)) {
                final SubLObject var42_43 = var40_41;
                if (NIL == module0065.f4775(var42_43, (SubLObject)$ic12$)) {
                    final SubLObject var12 = module0065.f4740(var42_43);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var5_51;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var18 = (SubLObject)NIL;
                            try {
                                var2.throwStack.push($ic13$);
                                var5_51 = Errors.$error_handler$.currentBinding(var2);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var2);
                                    try {
                                        if (NIL != module0172.f10944(var17)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                    }
                                    catch (Throwable var19) {
                                        Errors.handleThrowable(var19, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var5_51, var2);
                                }
                            }
                            catch (Throwable var20) {
                                var18 = Errors.handleThrowable(var20, (SubLObject)$ic13$);
                            }
                            finally {
                                var2.throwStack.pop();
                            }
                        }
                    }
                }
                final SubLObject var54_55 = var40_41;
                if (NIL == module0065.f4777(var54_55) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var21 = module0065.f4738(var54_55);
                    SubLObject var22 = module0065.f4739(var54_55);
                    final SubLObject var23 = module0065.f4734(var54_55);
                    final SubLObject var24 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var22.numL(var23)) {
                        final SubLObject var25 = Hashtables.gethash_without_values(var22, var21, var24);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var25)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            SubLObject var26 = (SubLObject)NIL;
                            try {
                                var2.throwStack.push($ic13$);
                                final SubLObject var5_52 = Errors.$error_handler$.currentBinding(var2);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var2);
                                    try {
                                        if (NIL != module0172.f10944(var25)) {
                                            var3 = (SubLObject)ConsesLow.cons(var25, var3);
                                        }
                                    }
                                    catch (Throwable var27) {
                                        Errors.handleThrowable(var27, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var5_52, var2);
                                }
                            }
                            catch (Throwable var28) {
                                var26 = Errors.handleThrowable(var28, (SubLObject)$ic13$);
                            }
                            finally {
                                var2.throwStack.pop();
                            }
                        }
                        var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f34924(final SubLObject var61, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var65;
        final SubLObject var64 = var65 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var66 = module0034.$g879$.currentBinding(var63);
        try {
            module0034.$g879$.bind(var65, var63);
            SubLObject var67 = (SubLObject)NIL;
            if (NIL != var65 && NIL == module0034.f1842(var65)) {
                var67 = module0034.f1869(var65);
                final SubLObject var68 = Threads.current_process();
                if (NIL == var67) {
                    module0034.f1873(var65, var68);
                }
                else if (!var67.eql(var68)) {
                    Errors.error((SubLObject)$ic15$);
                }
            }
            try {
                final SubLObject var69 = module0139.$g1630$.getDynamicValue(var63);
                final SubLObject var5_68 = module0139.$g1631$.currentBinding(var63);
                final SubLObject var70 = module0139.$g1632$.currentBinding(var63);
                final SubLObject var71 = module0139.$g1630$.currentBinding(var63);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var69, (SubLObject)SIX_INTEGER), var63);
                    module0139.$g1632$.bind(module0139.f9016(var69), var63);
                    module0139.$g1630$.bind((SubLObject)T, var63);
                    module0012.$g82$.setDynamicValue(var62, var63);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var63);
                    module0012.$g83$.setDynamicValue(Sequences.length(var61), var63);
                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var63);
                    final SubLObject var5_69 = module0012.$g75$.currentBinding(var63);
                    final SubLObject var6_70 = module0012.$g76$.currentBinding(var63);
                    final SubLObject var7_71 = module0012.$g77$.currentBinding(var63);
                    final SubLObject var72 = module0012.$g78$.currentBinding(var63);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var63);
                        module0012.$g76$.bind((SubLObject)NIL, var63);
                        module0012.$g77$.bind((SubLObject)T, var63);
                        module0012.$g78$.bind(Time.get_universal_time(), var63);
                        module0012.f478(module0012.$g82$.getDynamicValue(var63));
                        SubLObject var73 = var61;
                        SubLObject var74 = (SubLObject)NIL;
                        var74 = var73.first();
                        while (NIL != var73) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var63), module0012.$g83$.getDynamicValue(var63));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var63), (SubLObject)ONE_INTEGER), var63);
                            SubLObject var75 = (SubLObject)NIL;
                            try {
                                var63.throwStack.push($ic13$);
                                final SubLObject var5_70 = Errors.$error_handler$.currentBinding(var63);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var63);
                                    try {
                                        if (NIL != module0167.f10824(var74, (SubLObject)UNPROVIDED)) {
                                            PrintLow.format((SubLObject)T, (SubLObject)$ic16$, var74);
                                            module0540.f33510(var74);
                                        }
                                    }
                                    catch (Throwable var76) {
                                        Errors.handleThrowable(var76, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var5_70, var63);
                                }
                            }
                            catch (Throwable var77) {
                                var75 = Errors.handleThrowable(var77, (SubLObject)$ic13$);
                            }
                            finally {
                                var63.throwStack.pop();
                            }
                            var73 = var73.rest();
                            var74 = var73.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var72, var63);
                        module0012.$g77$.rebind(var7_71, var63);
                        module0012.$g76$.rebind(var6_70, var63);
                        module0012.$g75$.rebind(var5_69, var63);
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var71, var63);
                    module0139.$g1632$.rebind(var70, var63);
                    module0139.$g1631$.rebind(var5_68, var63);
                }
            }
            finally {
                final SubLObject var5_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var63);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var63);
                    if (NIL != var65 && NIL == var67) {
                        module0034.f1873(var65, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var5_71, var63);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var66, var63);
        }
        return Sequences.length(var61);
    }
    
    public static SubLObject f34926(final SubLObject var75) {
        final SubLObject var76 = Sequences.cconcatenate((SubLObject)$ic17$, module0006.f205(var75));
        final SubLObject var77 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic18$), module0219.f14513(var75));
        return f34924(var77, var76);
    }
    
    public static SubLObject f34910() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = deduction_handles_oc.f11634();
        final SubLObject var5 = (SubLObject)$ic19$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var40_78 = var4;
            if (NIL == module0065.f4772(var40_78, (SubLObject)$ic12$)) {
                final SubLObject var42_79 = var40_78;
                if (NIL == module0065.f4775(var42_79, (SubLObject)$ic12$)) {
                    final SubLObject var12 = module0065.f4740(var42_79);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL == deduction_handles_oc.f11671(var17, (SubLObject)T) || NIL != f34927(var17)) {
                                module0006.f218((SubLObject)T, (SubLObject)$ic20$, var17, module0188.f11781(var17), module0188.f11770(var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var54_81 = var40_78;
                if (NIL == module0065.f4777(var54_81) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var18 = module0065.f4738(var54_81);
                    SubLObject var19 = module0065.f4739(var54_81);
                    final SubLObject var20 = module0065.f4734(var54_81);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL == deduction_handles_oc.f11671(var22, (SubLObject)T) || NIL != f34927(var22)) {
                                module0006.f218((SubLObject)T, (SubLObject)$ic20$, var22, module0188.f11781(var22), module0188.f11770(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        var3 = Sequences.nreverse(var3);
        SubLObject var23 = (SubLObject)ZERO_INTEGER;
        SubLObject var24 = (SubLObject)ZERO_INTEGER;
        final SubLObject var25 = var3;
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic21$, new SubLObject[] { module0006.f203(Sequences.length(var3)), $ic22$ }), var2);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
        module0012.$g83$.setDynamicValue(Sequences.length(var25), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var26 = module0012.$g75$.currentBinding(var2);
        final SubLObject var27 = module0012.$g76$.currentBinding(var2);
        final SubLObject var28 = module0012.$g77$.currentBinding(var2);
        final SubLObject var29 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(module0012.$g82$.getDynamicValue(var2));
            SubLObject var30 = var25;
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                if (NIL != module0342.f23129(var31)) {
                    var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER);
                }
                var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER);
                var30 = var30.rest();
                var31 = var30.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var29, var2);
            module0012.$g77$.rebind(var28, var2);
            module0012.$g76$.rebind(var27, var2);
            module0012.$g75$.rebind(var26, var2);
        }
        return Values.values(var23, var24);
    }
    
    public static SubLObject f34927(final SubLObject var80) {
        final SubLObject var81 = module0188.f11770(var80);
        SubLObject var82 = (SubLObject)NIL;
        if (NIL == var82) {
            SubLObject var83;
            SubLObject var84;
            for (var83 = var81, var84 = (SubLObject)NIL, var84 = var83.first(); NIL == var82 && NIL != var83; var82 = module0191.f11957(var84), var83 = var83.rest(), var84 = var83.first()) {}
        }
        return var82;
    }
    
    public static SubLObject f34911() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = module0179.f11398();
        final SubLObject var5 = (SubLObject)$ic23$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var40_86 = var4;
            if (NIL == module0065.f4772(var40_86, (SubLObject)$ic12$)) {
                final SubLObject var42_87 = var40_86;
                if (NIL == module0065.f4775(var42_87, (SubLObject)$ic12$)) {
                    final SubLObject var12 = module0065.f4740(var42_87);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            module0183.f11572(var17, (SubLObject)UNPROVIDED);
                            if (NIL != module0183.f11570(var17)) {
                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var54_89 = var40_86;
                if (NIL == module0065.f4777(var54_89) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var18 = module0065.f4738(var54_89);
                    SubLObject var19 = module0065.f4739(var54_89);
                    final SubLObject var20 = module0065.f4734(var54_89);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            module0183.f11572(var22, (SubLObject)UNPROVIDED);
                            if (NIL != module0183.f11570(var22)) {
                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return var3;
    }
    
    public static SubLObject f34908() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var4;
        final SubLObject var3 = var4 = f34928();
        module0012.$g82$.setDynamicValue((SubLObject)$ic24$, var2);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var5 = module0012.$g75$.currentBinding(var2);
        final SubLObject var6 = module0012.$g76$.currentBinding(var2);
        final SubLObject var7 = module0012.$g77$.currentBinding(var2);
        final SubLObject var8 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(module0012.$g82$.getDynamicValue(var2));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                SubLObject var11 = (SubLObject)NIL;
                try {
                    var2.throwStack.push($ic13$);
                    final SubLObject var5_93 = Errors.$error_handler$.currentBinding(var2);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var2);
                        try {
                            if (NIL != module0178.f11361(var10, (SubLObject)UNPROVIDED)) {
                                module0342.f23126(var10);
                            }
                        }
                        catch (Throwable var12) {
                            Errors.handleThrowable(var12, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var5_93, var2);
                    }
                }
                catch (Throwable var13) {
                    var11 = Errors.handleThrowable(var13, (SubLObject)$ic13$);
                }
                finally {
                    var2.throwStack.pop();
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var2);
            module0012.$g77$.rebind(var7, var2);
            module0012.$g76$.rebind(var6, var2);
            module0012.$g75$.rebind(var5, var2);
        }
        return Sequences.length(var3);
    }
    
    public static SubLObject f34929() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0051.f3625(module0051.f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), $g4141$.getDynamicValue(var2));
    }
    
    public static SubLObject f34928() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f34929();
        final SubLObject var4 = module0217.f14247($ic25$, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478((SubLObject)$ic26$);
            final SubLObject var5_97 = module0147.$g2094$.currentBinding(var2);
            final SubLObject var6_98 = module0147.$g2095$.currentBinding(var2);
            try {
                module0147.$g2094$.bind((SubLObject)$ic4$, var2);
                module0147.$g2095$.bind($ic5$, var2);
                final SubLObject var11 = $ic25$;
                if (NIL != module0158.f10038(var11)) {
                    final SubLObject var12 = (SubLObject)NIL;
                    final SubLObject var5_98 = module0012.$g73$.currentBinding(var2);
                    final SubLObject var6_99 = module0012.$g65$.currentBinding(var2);
                    final SubLObject var7_101 = module0012.$g67$.currentBinding(var2);
                    final SubLObject var8_102 = module0012.$g68$.currentBinding(var2);
                    final SubLObject var13 = module0012.$g66$.currentBinding(var2);
                    final SubLObject var14 = module0012.$g69$.currentBinding(var2);
                    final SubLObject var15 = module0012.$g70$.currentBinding(var2);
                    final SubLObject var16 = module0012.$silent_progressP$.currentBinding(var2);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var2);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var2);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var2);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var2);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var2);
                        module0012.$g70$.bind((SubLObject)T, var2);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var12) ? module0012.$silent_progressP$.getDynamicValue(var2) : T), var2);
                        module0012.f474(var12);
                        final SubLObject var17 = module0158.f10039(var11);
                        SubLObject var18 = (SubLObject)NIL;
                        final SubLObject var19 = (SubLObject)NIL;
                        while (NIL == var18) {
                            final SubLObject var20 = module0052.f3695(var17, var19);
                            final SubLObject var21 = (SubLObject)makeBoolean(!var19.eql(var20));
                            if (NIL != var21) {
                                module0012.f476();
                                SubLObject var22 = (SubLObject)NIL;
                                try {
                                    var22 = module0158.f10316(var20, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var23_103 = (SubLObject)NIL;
                                    final SubLObject var24_104 = (SubLObject)NIL;
                                    while (NIL == var23_103) {
                                        final SubLObject var23 = module0052.f3695(var22, var24_104);
                                        final SubLObject var26_106 = (SubLObject)makeBoolean(!var24_104.eql(var23));
                                        if (NIL != var26_106) {
                                            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var5, var4);
                                            final SubLObject var24 = module0178.f11334(var23);
                                            if (NIL != module0173.f10955(var24)) {
                                                final SubLObject var25 = module0617.f37872(var24, (SubLObject)UNPROVIDED);
                                                if (NIL != var25 && var25.numLE(var3)) {
                                                    var6 = (SubLObject)ConsesLow.cons(var23, var6);
                                                }
                                            }
                                        }
                                        var23_103 = (SubLObject)makeBoolean(NIL == var26_106);
                                    }
                                }
                                finally {
                                    final SubLObject var5_99 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                        if (NIL != var22) {
                                            module0158.f10319(var22);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_99, var2);
                                    }
                                }
                            }
                            var18 = (SubLObject)makeBoolean(NIL == var21);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var16, var2);
                        module0012.$g70$.rebind(var15, var2);
                        module0012.$g69$.rebind(var14, var2);
                        module0012.$g66$.rebind(var13, var2);
                        module0012.$g68$.rebind(var8_102, var2);
                        module0012.$g67$.rebind(var7_101, var2);
                        module0012.$g65$.rebind(var6_99, var2);
                        module0012.$g73$.rebind(var5_98, var2);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var6_98, var2);
                module0147.$g2094$.rebind(var5_97, var2);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        var6 = Sequences.nreverse(var6);
        return var6;
    }
    
    public static SubLObject f34909() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5;
        final SubLObject var4 = var5 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0034.$g879$.currentBinding(var2);
        try {
            module0034.$g879$.bind(var5, var2);
            SubLObject var7 = (SubLObject)NIL;
            if (NIL != var5 && NIL == module0034.f1842(var5)) {
                var7 = module0034.f1869(var5);
                final SubLObject var8 = Threads.current_process();
                if (NIL == var7) {
                    module0034.f1873(var5, var8);
                }
                else if (!var7.eql(var8)) {
                    Errors.error((SubLObject)$ic15$);
                }
            }
            try {
                final SubLObject var9 = assertion_handles_oc.f11010();
                final SubLObject var10 = (SubLObject)$ic27$;
                final SubLObject var11 = module0065.f4733(var9);
                SubLObject var12 = (SubLObject)ZERO_INTEGER;
                assert NIL != Types.stringp(var10) : var10;
                final SubLObject var5_109 = module0012.$g75$.currentBinding(var2);
                final SubLObject var13 = module0012.$g76$.currentBinding(var2);
                final SubLObject var14 = module0012.$g77$.currentBinding(var2);
                final SubLObject var15 = module0012.$g78$.currentBinding(var2);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
                    module0012.$g76$.bind((SubLObject)NIL, var2);
                    module0012.$g77$.bind((SubLObject)T, var2);
                    module0012.$g78$.bind(Time.get_universal_time(), var2);
                    module0012.f478(var10);
                    final SubLObject var40_110 = var9;
                    if (NIL == module0065.f4772(var40_110, (SubLObject)$ic12$)) {
                        final SubLObject var42_111 = var40_110;
                        if (NIL == module0065.f4775(var42_111, (SubLObject)$ic12$)) {
                            final SubLObject var16 = module0065.f4740(var42_111);
                            final SubLObject var17 = (SubLObject)NIL;
                            SubLObject var18;
                            SubLObject var19;
                            SubLObject var20;
                            SubLObject var21;
                            SubLObject var22;
                            SubLObject var23;
                            for (var18 = Sequences.length(var16), var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
                                var20 = ((NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)ONE_INTEGER) : var19);
                                var21 = Vectors.aref(var16, var20);
                                if (NIL == module0065.f4749(var21) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                                    if (NIL != module0065.f4749(var21)) {
                                        var21 = (SubLObject)$ic12$;
                                    }
                                    module0012.note_percent_progress(var12, var11);
                                    var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER);
                                    if (NIL != module0178.f11375(var21)) {
                                        var22 = (SubLObject)((NIL != module0173.f10971(module0178.f11295(var21))) ? NIL : $ic28$);
                                        var23 = (SubLObject)((NIL != module0173.f10971(module0178.f11297(var21))) ? NIL : $ic28$);
                                        if (NIL == var22 || NIL == var23) {
                                            if (NIL == var22) {
                                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                                            }
                                            if (NIL == var23) {
                                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                                            }
                                            module0178.f11354(var21, var22, (SubLObject)$ic28$, var23, (SubLObject)$ic28$);
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var54_114 = var40_110;
                        if (NIL == module0065.f4777(var54_114) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            final SubLObject var24 = module0065.f4738(var54_114);
                            SubLObject var25 = module0065.f4739(var54_114);
                            final SubLObject var26 = module0065.f4734(var54_114);
                            final SubLObject var27 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                            while (var25.numL(var26)) {
                                final SubLObject var28 = Hashtables.gethash_without_values(var25, var24, var27);
                                if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var28)) {
                                    module0012.note_percent_progress(var12, var11);
                                    var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER);
                                    if (NIL != module0178.f11375(var28)) {
                                        final SubLObject var29 = (SubLObject)((NIL != module0173.f10971(module0178.f11295(var28))) ? NIL : $ic28$);
                                        final SubLObject var30 = (SubLObject)((NIL != module0173.f10971(module0178.f11297(var28))) ? NIL : $ic28$);
                                        if (NIL == var29 || NIL == var30) {
                                            if (NIL == var29) {
                                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                                            }
                                            if (NIL == var30) {
                                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                                            }
                                            module0178.f11354(var28, var29, (SubLObject)$ic28$, var30, (SubLObject)$ic28$);
                                        }
                                    }
                                }
                                var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var15, var2);
                    module0012.$g77$.rebind(var14, var2);
                    module0012.$g76$.rebind(var13, var2);
                    module0012.$g75$.rebind(var5_109, var2);
                }
            }
            finally {
                final SubLObject var5_110 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    if (NIL != var5 && NIL == var7) {
                        module0034.f1873(var5, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var5_110, var2);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var6, var2);
        }
        return var3;
    }
    
    public static SubLObject f34930(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        final SubLObject var119 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL != var116) {
            final SubLObject var120 = module0147.$g2094$.currentBinding(var117);
            final SubLObject var121 = module0147.$g2095$.currentBinding(var117);
            try {
                module0147.$g2094$.bind((SubLObject)$ic29$, var117);
                module0147.$g2095$.bind(module0132.$g1558$.getGlobalValue(), var117);
                final SubLObject var122 = $ic30$;
                if (NIL != module0158.f10038(var122)) {
                    final SubLObject var123 = (SubLObject)NIL;
                    final SubLObject var5_119 = module0012.$g73$.currentBinding(var117);
                    final SubLObject var6_120 = module0012.$g65$.currentBinding(var117);
                    final SubLObject var124 = module0012.$g67$.currentBinding(var117);
                    final SubLObject var125 = module0012.$g68$.currentBinding(var117);
                    final SubLObject var126 = module0012.$g66$.currentBinding(var117);
                    final SubLObject var127 = module0012.$g69$.currentBinding(var117);
                    final SubLObject var128 = module0012.$g70$.currentBinding(var117);
                    final SubLObject var129 = module0012.$silent_progressP$.currentBinding(var117);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var117);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var117), var117);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var117);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var117);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var117);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var117);
                        module0012.$g70$.bind((SubLObject)T, var117);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var123) ? module0012.$silent_progressP$.getDynamicValue(var117) : T), var117);
                        module0012.f474(var123);
                        final SubLObject var130 = module0158.f10039(var122);
                        SubLObject var131 = (SubLObject)NIL;
                        final SubLObject var132 = (SubLObject)NIL;
                        while (NIL == var131) {
                            final SubLObject var133 = module0052.f3695(var130, var132);
                            final SubLObject var134 = (SubLObject)makeBoolean(!var132.eql(var133));
                            if (NIL != var134) {
                                module0012.f476();
                                SubLObject var135 = (SubLObject)NIL;
                                try {
                                    var135 = module0158.f10316(var133, (SubLObject)$ic6$, (SubLObject)$ic2$, (SubLObject)NIL);
                                    SubLObject var23_121 = (SubLObject)NIL;
                                    final SubLObject var24_122 = (SubLObject)NIL;
                                    while (NIL == var23_121) {
                                        final SubLObject var136 = module0052.f3695(var135, var24_122);
                                        final SubLObject var26_124 = (SubLObject)makeBoolean(!var24_122.eql(var136));
                                        if (NIL != var26_124) {
                                            final SubLObject var137 = module0178.f11334(var136);
                                            final SubLObject var138 = module0178.f11335(var136);
                                            if (NIL != module0167.f10813(var137)) {
                                                module0084.f5762(var119, var138, var137);
                                            }
                                        }
                                        var23_121 = (SubLObject)makeBoolean(NIL == var26_124);
                                    }
                                }
                                finally {
                                    final SubLObject var5_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var117);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var117);
                                        if (NIL != var135) {
                                            module0158.f10319(var135);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_120, var117);
                                    }
                                }
                            }
                            var131 = (SubLObject)makeBoolean(NIL == var134);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var129, var117);
                        module0012.$g70$.rebind(var128, var117);
                        module0012.$g69$.rebind(var127, var117);
                        module0012.$g66$.rebind(var126, var117);
                        module0012.$g68$.rebind(var125, var117);
                        module0012.$g67$.rebind(var124, var117);
                        module0012.$g65$.rebind(var6_120, var117);
                        module0012.$g73$.rebind(var5_119, var117);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var121, var117);
                module0147.$g2094$.rebind(var120, var117);
            }
        }
        else {
            final SubLObject var139 = module0167.f10788();
            final SubLObject var140 = (SubLObject)$ic31$;
            final SubLObject var141 = module0065.f4733(var139);
            SubLObject var142 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var140) : var140;
            final SubLObject var143 = module0012.$g75$.currentBinding(var117);
            final SubLObject var144 = module0012.$g76$.currentBinding(var117);
            final SubLObject var124 = module0012.$g77$.currentBinding(var117);
            final SubLObject var125 = module0012.$g78$.currentBinding(var117);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var117);
                module0012.$g76$.bind((SubLObject)NIL, var117);
                module0012.$g77$.bind((SubLObject)T, var117);
                module0012.$g78$.bind(Time.get_universal_time(), var117);
                module0012.f478(var140);
                final SubLObject var40_127 = var139;
                if (NIL == module0065.f4772(var40_127, (SubLObject)$ic12$)) {
                    final SubLObject var42_128 = var40_127;
                    if (NIL == module0065.f4775(var42_128, (SubLObject)$ic12$)) {
                        final SubLObject var145 = module0065.f4740(var42_128);
                        final SubLObject var146 = (SubLObject)NIL;
                        SubLObject var147;
                        SubLObject var148;
                        SubLObject var149;
                        SubLObject var150;
                        for (var147 = Sequences.length(var145), var148 = (SubLObject)NIL, var148 = (SubLObject)ZERO_INTEGER; var148.numL(var147); var148 = Numbers.add(var148, (SubLObject)ONE_INTEGER)) {
                            var149 = ((NIL != var146) ? Numbers.subtract(var147, var148, (SubLObject)ONE_INTEGER) : var148);
                            var150 = Vectors.aref(var145, var149);
                            if (NIL == module0065.f4749(var150) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                                if (NIL != module0065.f4749(var150)) {
                                    var150 = (SubLObject)$ic12$;
                                }
                                module0012.note_percent_progress(var142, var141);
                                var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                                module0084.f5762(var119, module0172.f10915(var150), var150);
                            }
                        }
                    }
                    final SubLObject var54_129 = var40_127;
                    if (NIL == module0065.f4777(var54_129) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                        final SubLObject var151 = module0065.f4738(var54_129);
                        SubLObject var152 = module0065.f4739(var54_129);
                        final SubLObject var153 = module0065.f4734(var54_129);
                        final SubLObject var154 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                        while (var152.numL(var153)) {
                            final SubLObject var155 = Hashtables.gethash_without_values(var152, var151, var154);
                            if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var155)) {
                                module0012.note_percent_progress(var142, var141);
                                var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                                module0084.f5762(var119, module0172.f10915(var155), var155);
                            }
                            var152 = Numbers.add(var152, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var125, var117);
                module0012.$g77$.rebind(var124, var117);
                module0012.$g76$.rebind(var144, var117);
                module0012.$g75$.rebind(var143, var117);
            }
        }
        SubLObject var156;
        for (var156 = module0066.f4838(module0067.f4891(var119)); NIL == module0066.f4841(var156); var156 = module0066.f4840(var156)) {
            var117.resetMultipleValues();
            final SubLObject var157 = module0066.f4839(var156);
            final SubLObject var158 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            if (NIL == module0035.f1997(var158)) {
                var118 = (SubLObject)ConsesLow.cons(Sequences.reverse(var158), var118);
            }
        }
        module0066.f4842(var156);
        return Sequences.nreverse(var118);
    }
    
    public static SubLObject f34931() {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var134;
        final SubLObject var133 = var134 = f34930((SubLObject)UNPROVIDED);
        SubLObject var135 = (SubLObject)NIL;
        var135 = var134.first();
        while (NIL != var134) {
            final SubLObject var136 = module0048.f3381(var135, (SubLObject)$ic32$);
            final SubLObject var137 = Sequences.remove(var136, var135, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var132 = ConsesLow.nconc(var137, var132);
            var134 = var134.rest();
            var135 = var134.first();
        }
        return var132;
    }
    
    public static SubLObject f34932() {
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        SubLObject var34 = f34931();
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            if (NIL != module0167.f10824(var35, (SubLObject)UNPROVIDED)) {
                module0540.f33510(var35);
            }
            var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f34933(SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)NIL;
        }
        final SubLThread var136 = SubLProcess.currentSubLThread();
        if (NIL != var135) {
            final SubLObject var137 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            final SubLObject var138 = Sequences.cconcatenate((SubLObject)$ic33$, new SubLObject[] { module0006.f203(Sequences.length(var135)), $ic34$ });
            final SubLObject var139 = var135;
            module0012.$g82$.setDynamicValue(var138, var136);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var136);
            module0012.$g83$.setDynamicValue(Sequences.length(var139), var136);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var136);
            final SubLObject var140 = module0012.$g75$.currentBinding(var136);
            final SubLObject var141 = module0012.$g76$.currentBinding(var136);
            final SubLObject var142 = module0012.$g77$.currentBinding(var136);
            final SubLObject var143 = module0012.$g78$.currentBinding(var136);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var136);
                module0012.$g76$.bind((SubLObject)NIL, var136);
                module0012.$g77$.bind((SubLObject)T, var136);
                module0012.$g78$.bind(Time.get_universal_time(), var136);
                module0012.f478(module0012.$g82$.getDynamicValue(var136));
                SubLObject var144 = var139;
                SubLObject var145 = (SubLObject)NIL;
                var145 = var144.first();
                while (NIL != var144) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var136), module0012.$g83$.getDynamicValue(var136));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var136), (SubLObject)ONE_INTEGER), var136);
                    f34934(assertion_handles_oc.f11053(var145), var137, (SubLObject)T);
                    var144 = var144.rest();
                    var145 = var144.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var143, var136);
                module0012.$g77$.rebind(var142, var136);
                module0012.$g76$.rebind(var141, var136);
                module0012.$g75$.rebind(var140, var136);
            }
            return f34935(var137);
        }
        final SubLObject var146 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var147 = (SubLObject)NIL;
        final SubLObject var148 = assertion_handles_oc.f11010();
        final SubLObject var149 = (SubLObject)$ic35$;
        final SubLObject var150 = module0065.f4733(var148);
        SubLObject var151 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var149) : var149;
        final SubLObject var152 = module0012.$g75$.currentBinding(var136);
        final SubLObject var153 = module0012.$g76$.currentBinding(var136);
        final SubLObject var154 = module0012.$g77$.currentBinding(var136);
        final SubLObject var155 = module0012.$g78$.currentBinding(var136);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var136);
            module0012.$g76$.bind((SubLObject)NIL, var136);
            module0012.$g77$.bind((SubLObject)T, var136);
            module0012.$g78$.bind(Time.get_universal_time(), var136);
            module0012.f478(var149);
            final SubLObject var40_138 = var148;
            if (NIL == module0065.f4772(var40_138, (SubLObject)$ic12$)) {
                final SubLObject var42_139 = var40_138;
                if (NIL == module0065.f4775(var42_139, (SubLObject)$ic12$)) {
                    final SubLObject var156 = module0065.f4740(var42_139);
                    final SubLObject var157 = (SubLObject)NIL;
                    SubLObject var158;
                    SubLObject var159;
                    SubLObject var160;
                    SubLObject var161;
                    for (var158 = Sequences.length(var156), var159 = (SubLObject)NIL, var159 = (SubLObject)ZERO_INTEGER; var159.numL(var158); var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER)) {
                        var160 = ((NIL != var157) ? Numbers.subtract(var158, var159, (SubLObject)ONE_INTEGER) : var159);
                        var161 = Vectors.aref(var156, var160);
                        if (NIL == module0065.f4749(var161) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var161)) {
                                var161 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var151, var150);
                            var151 = Numbers.add(var151, (SubLObject)ONE_INTEGER);
                            f34936(var161, var146);
                        }
                    }
                }
                final SubLObject var54_140 = var40_138;
                if (NIL == module0065.f4777(var54_140) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var162 = module0065.f4738(var54_140);
                    SubLObject var163 = module0065.f4739(var54_140);
                    final SubLObject var164 = module0065.f4734(var54_140);
                    final SubLObject var165 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var163.numL(var164)) {
                        final SubLObject var166 = Hashtables.gethash_without_values(var163, var162, var165);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var166)) {
                            module0012.note_percent_progress(var151, var150);
                            var151 = Numbers.add(var151, (SubLObject)ONE_INTEGER);
                            f34936(var166, var146);
                        }
                        var163 = Numbers.add(var163, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var155, var136);
            module0012.$g77$.rebind(var154, var136);
            module0012.$g76$.rebind(var153, var136);
            module0012.$g75$.rebind(var152, var136);
        }
        SubLObject var167 = (SubLObject)ZERO_INTEGER;
        final SubLObject var168 = assertion_handles_oc.f11019();
        final SubLObject var169 = module0012.$g75$.currentBinding(var136);
        final SubLObject var170 = module0012.$g76$.currentBinding(var136);
        final SubLObject var171 = module0012.$g77$.currentBinding(var136);
        final SubLObject var172 = module0012.$g78$.currentBinding(var136);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var136);
            module0012.$g76$.bind((SubLObject)NIL, var136);
            module0012.$g77$.bind((SubLObject)T, var136);
            module0012.$g78$.bind(Time.get_universal_time(), var136);
            module0012.f478((SubLObject)$ic36$);
            SubLObject var173;
            for (var173 = module0066.f4838(module0067.f4891(var146)); NIL == module0066.f4841(var173); var173 = module0066.f4840(var173)) {
                var136.resetMultipleValues();
                final SubLObject var174 = module0066.f4839(var173);
                final SubLObject var175 = var136.secondMultipleValue();
                var136.resetMultipleValues();
                final SubLObject var176 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                SubLObject var177 = var175;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var177.first();
                while (NIL != var177) {
                    f34934(var161, var176, (SubLObject)NIL);
                    var167 = Numbers.add(var167, (SubLObject)ONE_INTEGER);
                    module0012.note_percent_progress(var167, var168);
                    var177 = var177.rest();
                    var161 = var177.first();
                }
                var147 = ConsesLow.nconc(f34935(var176), var147);
            }
            module0066.f4842(var173);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var172, var136);
            module0012.$g77$.rebind(var171, var136);
            module0012.$g76$.rebind(var170, var136);
            module0012.$g75$.rebind(var169, var136);
        }
        return Sequences.nreverse(var147);
    }
    
    public static SubLObject f34936(final SubLObject var105, final SubLObject var137) {
        module0084.f5762(var137, module0178.f11287(var105), var105);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34934(final SubLObject var105, final SubLObject var118, final SubLObject var145) {
        if (NIL != assertion_handles_oc.f11041(var105, (SubLObject)UNPROVIDED)) {
            final SubLObject var146 = (SubLObject)((NIL != var145) ? ConsesLow.cons(f34937(var105), module0178.f11287(var105)) : f34937(var105));
            module0084.f5762(var118, var146, var105);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34937(final SubLObject var105) {
        if (NIL != module0178.f11284(var105)) {
            return module0178.f11304(var105);
        }
        return module0178.f11282(var105);
    }
    
    public static SubLObject f34935(final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121;
        for (var121 = module0066.f4838(module0067.f4891(var118)); NIL == module0066.f4841(var121); var121 = module0066.f4840(var121)) {
            var119.resetMultipleValues();
            final SubLObject var122 = module0066.f4839(var121);
            final SubLObject var123 = var119.secondMultipleValue();
            var119.resetMultipleValues();
            if (NIL == module0035.f1997(var123)) {
                final SubLObject var124 = f34938(var123);
                var120 = (SubLObject)ConsesLow.cons(var124, var120);
            }
        }
        module0066.f4842(var121);
        return Sequences.nreverse(var120);
    }
    
    public static SubLObject f34938(final SubLObject var147) {
        final SubLObject var148 = Sequences.remove_if((SubLObject)$ic37$, var147, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var148)) {
            return module0035.f2149(var148.first(), var147, (SubLObject)UNPROVIDED);
        }
        Errors.warn((SubLObject)$ic38$, Mapping.mapcar((SubLObject)$ic39$, var147));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34939(SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)NIL;
        }
        final SubLThread var136 = SubLProcess.currentSubLThread();
        SubLObject var137 = (SubLObject)ZERO_INTEGER;
        final SubLObject var138 = f34933(var135);
        final SubLObject var139 = Sequences.cconcatenate((SubLObject)$ic40$, new SubLObject[] { module0006.f203(Sequences.length(var138)), $ic41$ });
        final SubLObject var140 = var138;
        module0012.$g82$.setDynamicValue(var139, var136);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var136);
        module0012.$g83$.setDynamicValue(Sequences.length(var140), var136);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var136);
        final SubLObject var141 = module0012.$g75$.currentBinding(var136);
        final SubLObject var142 = module0012.$g76$.currentBinding(var136);
        final SubLObject var143 = module0012.$g77$.currentBinding(var136);
        final SubLObject var144 = module0012.$g78$.currentBinding(var136);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var136);
            module0012.$g76$.bind((SubLObject)NIL, var136);
            module0012.$g77$.bind((SubLObject)T, var136);
            module0012.$g78$.bind(Time.get_universal_time(), var136);
            module0012.f478(module0012.$g82$.getDynamicValue(var136));
            SubLObject var145 = var140;
            SubLObject var146 = (SubLObject)NIL;
            var146 = var145.first();
            while (NIL != var145) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var136), module0012.$g83$.getDynamicValue(var136));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var136), (SubLObject)ONE_INTEGER), var136);
                SubLObject var148;
                final SubLObject var147 = var148 = var146.rest();
                SubLObject var149 = (SubLObject)NIL;
                var149 = var148.first();
                while (NIL != var148) {
                    module0342.f23126(var149);
                    if (NIL != assertion_handles_oc.f11041(var149, (SubLObject)UNPROVIDED)) {
                        Errors.warn((SubLObject)$ic42$, assertion_handles_oc.f11025(var149));
                    }
                    else {
                        var137 = Numbers.add(var137, (SubLObject)ONE_INTEGER);
                    }
                    var148 = var148.rest();
                    var149 = var148.first();
                }
                var145 = var145.rest();
                var146 = var145.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var144, var136);
            module0012.$g77$.rebind(var143, var136);
            module0012.$g76$.rebind(var142, var136);
            module0012.$g75$.rebind(var141, var136);
        }
        return var137;
    }
    
    public static SubLObject f34940(SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        SubLObject var155 = (SubLObject)NIL;
        final SubLObject var156 = assertion_handles_oc.f11010();
        final SubLObject var157 = (SubLObject)$ic43$;
        final SubLObject var158 = module0065.f4733(var156);
        SubLObject var159 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var157) : var157;
        final SubLObject var160 = module0012.$g75$.currentBinding(var154);
        final SubLObject var161 = module0012.$g76$.currentBinding(var154);
        final SubLObject var162 = module0012.$g77$.currentBinding(var154);
        final SubLObject var163 = module0012.$g78$.currentBinding(var154);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var154);
            module0012.$g76$.bind((SubLObject)NIL, var154);
            module0012.$g77$.bind((SubLObject)T, var154);
            module0012.$g78$.bind(Time.get_universal_time(), var154);
            module0012.f478(var157);
            final SubLObject var40_154 = var156;
            if (NIL == module0065.f4772(var40_154, (SubLObject)$ic12$)) {
                final SubLObject var42_155 = var40_154;
                if (NIL == module0065.f4775(var42_155, (SubLObject)$ic12$)) {
                    final SubLObject var164 = module0065.f4740(var42_155);
                    final SubLObject var165 = (SubLObject)NIL;
                    SubLObject var166;
                    SubLObject var167;
                    SubLObject var168;
                    SubLObject var169;
                    SubLObject var136_156;
                    for (var166 = Sequences.length(var164), var167 = (SubLObject)NIL, var167 = (SubLObject)ZERO_INTEGER; var167.numL(var166); var167 = Numbers.add(var167, (SubLObject)ONE_INTEGER)) {
                        var168 = ((NIL != var165) ? Numbers.subtract(var166, var167, (SubLObject)ONE_INTEGER) : var167);
                        var169 = Vectors.aref(var164, var168);
                        if (NIL == module0065.f4749(var169) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var169)) {
                                var169 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var159, var158);
                            var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER);
                            if (NIL == module0178.f11299(var169)) {
                                var136_156 = assertion_handles_oc.f11025(var169);
                                if (NIL != assertion_handles_oc.f11041(var169, (SubLObject)UNPROVIDED)) {
                                    module0342.f23162(var169);
                                    if (NIL == assertion_handles_oc.f11041(var169, (SubLObject)UNPROVIDED)) {
                                        var155 = (SubLObject)ConsesLow.cons(var136_156, var155);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var54_157 = var40_154;
                if (NIL == module0065.f4777(var54_157) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var170 = module0065.f4738(var54_157);
                    SubLObject var171 = module0065.f4739(var54_157);
                    final SubLObject var172 = module0065.f4734(var54_157);
                    final SubLObject var173 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var171.numL(var172)) {
                        final SubLObject var174 = Hashtables.gethash_without_values(var171, var170, var173);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var174)) {
                            module0012.note_percent_progress(var159, var158);
                            var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER);
                            if (NIL == module0178.f11299(var174)) {
                                final SubLObject var136_157 = assertion_handles_oc.f11025(var174);
                                if (NIL != assertion_handles_oc.f11041(var174, (SubLObject)UNPROVIDED)) {
                                    module0342.f23162(var174);
                                    if (NIL == assertion_handles_oc.f11041(var174, (SubLObject)UNPROVIDED)) {
                                        var155 = (SubLObject)ConsesLow.cons(var136_157, var155);
                                    }
                                }
                            }
                        }
                        var171 = Numbers.add(var171, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var163, var154);
            module0012.$g77$.rebind(var162, var154);
            module0012.$g76$.rebind(var161, var154);
            module0012.$g75$.rebind(var160, var154);
        }
        if (NIL != var153) {
            return Sequences.nreverse(var155);
        }
        return Sequences.length(var155);
    }
    
    public static SubLObject f34941(final SubLObject var159, SubLObject var160, SubLObject var161, SubLObject var162) {
        if (var160 == UNPROVIDED) {
            var160 = (SubLObject)$ic44$;
        }
        if (var161 == UNPROVIDED) {
            var161 = $ic45$;
        }
        if (var162 == UNPROVIDED) {
            var162 = (SubLObject)$ic46$;
        }
        final SubLThread var163 = SubLProcess.currentSubLThread();
        SubLObject var164 = (SubLObject)NIL;
        final SubLObject var165 = (var160 == $ic44$) ? var159 : var160;
        final SubLObject var166 = module0067.f4880((SubLObject)EQUALP, (SubLObject)UNPROVIDED);
        final SubLObject var167 = module0147.f9540(var161);
        final SubLObject var168 = module0147.$g2095$.currentBinding(var163);
        final SubLObject var169 = module0147.$g2094$.currentBinding(var163);
        final SubLObject var170 = module0147.$g2096$.currentBinding(var163);
        try {
            module0147.$g2095$.bind(module0147.f9545(var167), var163);
            module0147.$g2094$.bind(module0147.f9546(var167), var163);
            module0147.$g2096$.bind(module0147.f9549(var167), var163);
            var164 = module0259.f16848(var159, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var170, var163);
            module0147.$g2094$.rebind(var169, var163);
            module0147.$g2095$.rebind(var168, var163);
        }
        final SubLObject var171 = var164;
        module0012.$g82$.setDynamicValue((SubLObject)$ic47$, var163);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var163);
        module0012.$g83$.setDynamicValue(Sequences.length(var171), var163);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var163);
        final SubLObject var172 = module0012.$g75$.currentBinding(var163);
        final SubLObject var173 = module0012.$g76$.currentBinding(var163);
        final SubLObject var174 = module0012.$g77$.currentBinding(var163);
        final SubLObject var175 = module0012.$g78$.currentBinding(var163);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var163);
            module0012.$g76$.bind((SubLObject)NIL, var163);
            module0012.$g77$.bind((SubLObject)T, var163);
            module0012.$g78$.bind(Time.get_universal_time(), var163);
            module0012.f478(module0012.$g82$.getDynamicValue(var163));
            SubLObject var176 = var171;
            SubLObject var177 = (SubLObject)NIL;
            var177 = var176.first();
            while (NIL != var176) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var163), module0012.$g83$.getDynamicValue(var163));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var163), (SubLObject)ONE_INTEGER), var163);
                SubLObject var178 = module0764.f48457(var177, var162, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var179 = (SubLObject)NIL;
                var179 = var178.first();
                while (NIL != var178) {
                    SubLObject var11_170;
                    final SubLObject var180 = var11_170 = Sequences.remove(var177, module0731.f44782(var179, var165, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var181 = (SubLObject)NIL;
                    var181 = var11_170.first();
                    while (NIL != var11_170) {
                        module0084.f5765(var166, var179, var177, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0084.f5765(var166, var179, var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var11_170 = var11_170.rest();
                        var181 = var11_170.first();
                    }
                    var178 = var178.rest();
                    var179 = var178.first();
                }
                var176 = var176.rest();
                var177 = var176.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var175, var163);
            module0012.$g77$.rebind(var174, var163);
            module0012.$g76$.rebind(var173, var163);
            module0012.$g75$.rebind(var172, var163);
        }
        SubLObject var182;
        for (var182 = module0066.f4838(module0067.f4891(var166)); NIL == module0066.f4841(var182); var182 = module0066.f4840(var182)) {
            var163.resetMultipleValues();
            final SubLObject var183 = module0066.f4839(var182);
            final SubLObject var184 = var163.secondMultipleValue();
            var163.resetMultipleValues();
            PrintLow.format((SubLObject)T, (SubLObject)$ic48$, var183, var184);
        }
        module0066.f4842(var182);
        return module0084.f5780(var166);
    }
    
    public static SubLObject f34942(final SubLObject var174, final SubLObject var175, SubLObject var176, SubLObject var177) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)T;
        }
        if (var177 == UNPROVIDED) {
            var177 = module0548.$g3978$.getGlobalValue();
        }
        return f34943($ic49$, var174, var175, var176, var177);
    }
    
    public static SubLObject f34944(final SubLObject var174, final SubLObject var175, SubLObject var176, SubLObject var177) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)T;
        }
        if (var177 == UNPROVIDED) {
            var177 = module0548.$g3978$.getGlobalValue();
        }
        return f34943($ic50$, var174, var175, var176, var177);
    }
    
    public static SubLObject f34943(final SubLObject var178, final SubLObject var174, final SubLObject var175, SubLObject var176, SubLObject var177) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)T;
        }
        if (var177 == UNPROVIDED) {
            var177 = module0548.$g3978$.getGlobalValue();
        }
        final SubLThread var179 = SubLProcess.currentSubLThread();
        final SubLObject var180 = f34945(var178, var174, var177);
        final SubLObject var181 = f34945(var178, var175, var177);
        final SubLObject var182 = module0078.f5348((SubLObject)ConsesLow.list(var180, var181), (SubLObject)EQUAL);
        final SubLObject var183 = module0078.f5351((SubLObject)ConsesLow.list(var180, var181), (SubLObject)EQUAL);
        final SubLObject var184 = module0078.f5356(var181, var183, (SubLObject)EQUAL);
        final SubLObject var185 = module0078.f5356(var182, var181, (SubLObject)EQUAL);
        PrintLow.format(var176, (SubLObject)$ic51$, new SubLObject[] { module0077.f5311(var184), var174, var175 });
        PrintLow.format(var176, (SubLObject)$ic52$, new SubLObject[] { module0077.f5311(var185), var174, var175 });
        PrintLow.format(var176, (SubLObject)$ic53$);
        final SubLObject var186 = print_high.$print_pretty$.currentBinding(var179);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var179);
            SubLObject var187 = module0077.f5333(var184);
            SubLObject var188;
            SubLObject var189;
            SubLObject var190;
            for (var188 = module0032.f1741(var187), var189 = (SubLObject)NIL, var189 = module0032.f1742(var188, var187); NIL == module0032.f1744(var188, var189); var189 = module0032.f1743(var189)) {
                var190 = module0032.f1745(var188, var189);
                if (NIL != module0032.f1746(var189, var190)) {
                    PrintLow.format(var176, (SubLObject)$ic54$, var190);
                }
            }
            PrintLow.format(var176, (SubLObject)$ic55$);
            var187 = module0077.f5333(var185);
            for (var188 = module0032.f1741(var187), var189 = (SubLObject)NIL, var189 = module0032.f1742(var188, var187); NIL == module0032.f1744(var188, var189); var189 = module0032.f1743(var189)) {
                var190 = module0032.f1745(var188, var189);
                if (NIL != module0032.f1746(var189, var190)) {
                    PrintLow.format(var176, (SubLObject)$ic54$, var190);
                }
            }
        }
        finally {
            print_high.$print_pretty$.rebind(var186, var179);
        }
        return (SubLObject)ConsesLow.list(module0077.f5311(var184), module0077.f5311(var185));
    }
    
    public static SubLObject f34946() {
        final SubLObject var188 = $g4142$.getGlobalValue();
        if (NIL != var188) {
            module0034.f1818(var188);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34947(final SubLObject var178, final SubLObject var189, final SubLObject var177) {
        return module0034.f1829($g4142$.getGlobalValue(), (SubLObject)ConsesLow.list(var178, var189, var177), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34948(final SubLObject var178, final SubLObject var189, final SubLObject var177) {
        final SubLObject var190 = Sequences.cconcatenate(module0006.f203(var177), new SubLObject[] { $ic57$, module0006.f203(var189), $ic58$, module0006.f203(module0597.f36628(var178)), $ic59$ });
        final SubLObject var191 = module0077.f5313((SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        Errors.warn((SubLObject)$ic60$, var178, var189);
        SubLObject var192 = (SubLObject)NIL;
        try {
            var192 = compatibility.open_text(var190, (SubLObject)$ic61$);
            if (!var192.isStream()) {
                Errors.error((SubLObject)$ic62$, var190);
            }
            final SubLObject var193 = var192;
            if (var193.isStream()) {
                SubLObject var194;
                SubLObject var195;
                for (var194 = (SubLObject)NIL, var194 = module0075.f5200(var193); NIL != var194; var194 = module0075.f5200(var193)) {
                    var195 = reader.read_from_string_ignoring_errors(var194, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0206.f13453(var195)) {
                        module0077.f5326(var195, var191);
                    }
                }
            }
        }
        finally {
            final SubLObject var196 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var192.isStream()) {
                    streams_high.close(var192, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var196);
            }
        }
        return var191;
    }
    
    public static SubLObject f34945(final SubLObject var178, final SubLObject var189, final SubLObject var177) {
        SubLObject var190 = $g4142$.getGlobalValue();
        if (NIL == var190) {
            var190 = module0034.f1934((SubLObject)$ic56$, (SubLObject)$ic63$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var191 = module0034.f1781(var178, var189, var177);
        final SubLObject var192 = module0034.f1814(var190, var191, (SubLObject)UNPROVIDED);
        if (var192 != $ic64$) {
            SubLObject var193 = var192;
            SubLObject var194 = (SubLObject)NIL;
            var194 = var193.first();
            while (NIL != var193) {
                SubLObject var195 = var194.first();
                final SubLObject var196 = conses_high.second(var194);
                if (var178.equal(var195.first())) {
                    var195 = var195.rest();
                    if (var189.equal(var195.first())) {
                        var195 = var195.rest();
                        if (NIL != var195 && NIL == var195.rest() && var177.equal(var195.first())) {
                            return module0034.f1959(var196);
                        }
                    }
                }
                var193 = var193.rest();
                var194 = var193.first();
            }
        }
        final SubLObject var197 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34948(var178, var189, var177)));
        module0034.f1836(var190, var191, var192, var197, (SubLObject)ConsesLow.list(var178, var189, var177));
        return module0034.f1959(var197);
    }
    
    public static SubLObject f34949(final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        SubLObject var204 = (SubLObject)NIL;
        try {
            var204 = compatibility.open_text(var202, (SubLObject)$ic66$);
            if (!var204.isStream()) {
                Errors.error((SubLObject)$ic62$, var202);
            }
            final SubLObject var176_204 = var204;
            PrintLow.format(var176_204, (SubLObject)$ic67$, module0051.f3552((SubLObject)UNPROVIDED));
            final SubLObject var206;
            final SubLObject var205 = var206 = f34950();
            module0012.$g82$.setDynamicValue((SubLObject)$ic68$, var203);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var203);
            module0012.$g83$.setDynamicValue(Sequences.length(var206), var203);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var203);
            final SubLObject var207 = module0012.$g75$.currentBinding(var203);
            final SubLObject var208 = module0012.$g76$.currentBinding(var203);
            final SubLObject var209 = module0012.$g77$.currentBinding(var203);
            final SubLObject var210 = module0012.$g78$.currentBinding(var203);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var203);
                module0012.$g76$.bind((SubLObject)NIL, var203);
                module0012.$g77$.bind((SubLObject)T, var203);
                module0012.$g78$.bind(Time.get_universal_time(), var203);
                module0012.f478(module0012.$g82$.getDynamicValue(var203));
                SubLObject var211 = var206;
                SubLObject var212 = (SubLObject)NIL;
                var212 = var211.first();
                while (NIL != var211) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var203), module0012.$g83$.getDynamicValue(var203));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var203), (SubLObject)ONE_INTEGER), var203);
                    print_high.princ(f34951(var212), var176_204);
                    var211 = var211.rest();
                    var212 = var211.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var210, var203);
                module0012.$g77$.rebind(var209, var203);
                module0012.$g76$.rebind(var208, var203);
                module0012.$g75$.rebind(var207, var203);
            }
        }
        finally {
            final SubLObject var213 = Threads.$is_thread_performing_cleanupP$.currentBinding(var203);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var203);
                if (var204.isStream()) {
                    streams_high.close(var204, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var213, var203);
            }
        }
        return var202;
    }
    
    public static SubLObject f34950() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var2);
            module0147.$g2095$.bind($ic5$, var2);
            final SubLObject var6 = module0259.f16846($ic69$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0012.$g82$.setDynamicValue((SubLObject)$ic70$, var2);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
            module0012.$g83$.setDynamicValue(Sequences.length(var6), var2);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
            final SubLObject var5_207 = module0012.$g75$.currentBinding(var2);
            final SubLObject var6_208 = module0012.$g76$.currentBinding(var2);
            final SubLObject var7 = module0012.$g77$.currentBinding(var2);
            final SubLObject var8 = module0012.$g78$.currentBinding(var2);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
                module0012.$g76$.bind((SubLObject)NIL, var2);
                module0012.$g77$.bind((SubLObject)T, var2);
                module0012.$g78$.bind(Time.get_universal_time(), var2);
                module0012.f478(module0012.$g82$.getDynamicValue(var2));
                SubLObject var9 = var6;
                SubLObject var10 = (SubLObject)NIL;
                var10 = var9.first();
                while (NIL != var9) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                    if (NIL != constant_handles_oc.f8449(var10) && NIL == module0035.f2169(var10, $g4143$.getGlobalValue()) && NIL == module0229.f15234(var10) && NIL == module0533.f33218(var10) && NIL == module0410.f28544((SubLObject)ConsesLow.listS($ic71$, var10, (SubLObject)$ic72$), $ic45$, (SubLObject)$ic73$)) {
                        var3 = (SubLObject)ConsesLow.cons(var10, var3);
                    }
                    var9 = var9.rest();
                    var10 = var9.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var8, var2);
                module0012.$g77$.rebind(var7, var2);
                module0012.$g76$.rebind(var6_208, var2);
                module0012.$g75$.rebind(var5_207, var2);
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return Sort.sort(var3, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34952(final SubLObject var209, final SubLObject var210) {
        final SubLObject var211 = module0217.f14357(var209);
        final SubLObject var212 = module0217.f14357(var210);
        if (var211.numG(var212)) {
            return (SubLObject)T;
        }
        if (var211.numL(var212)) {
            return (SubLObject)NIL;
        }
        return Strings.stringL(module0597.f36628(var209), module0597.f36628(var210), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34951(final SubLObject var206) {
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)NIL;
        final SubLObject var209 = module0147.f9540($ic75$);
        final SubLObject var210 = module0147.$g2095$.currentBinding(var207);
        final SubLObject var211 = module0147.$g2094$.currentBinding(var207);
        final SubLObject var212 = module0147.$g2096$.currentBinding(var207);
        try {
            module0147.$g2095$.bind(module0147.f9545(var209), var207);
            module0147.$g2094$.bind(module0147.f9546(var209), var207);
            module0147.$g2096$.bind(module0147.f9549(var209), var207);
            var208 = Sequences.cconcatenate((SubLObject)$ic76$, new SubLObject[] { module0006.f203(var206), $ic77$, module0006.f203(f34953(var206)), $ic78$, module0006.f203(f34954(var206)), $ic79$, module0006.f203(f34955(var206)), $ic80$, module0006.f203(f34956(var206)), $ic81$, module0006.f205(f34957(var206)), $ic82$, module0006.f203(var206), $ic83$, module0006.f203(f34953(var206)), $ic84$ });
        }
        finally {
            module0147.$g2096$.rebind(var212, var207);
            module0147.$g2094$.rebind(var211, var207);
            module0147.$g2095$.rebind(var210, var207);
        }
        return var208;
    }
    
    public static SubLObject f34953(final SubLObject var206) {
        if (NIL == f34958(var206)) {
            return f34959(var206);
        }
        final SubLObject var207 = Sequences.cconcatenate(f34959(var206), (SubLObject)$ic85$);
        if (NIL != constants_high_oc.f10737(var207) || NIL != module0126.f8399(var207)) {
            return Sequences.cconcatenate((SubLObject)$ic86$, constants_high_oc.f10743(var206));
        }
        return var207;
    }
    
    public static SubLObject f34958(final SubLObject var206) {
        final SubLObject var207 = f34959(var206);
        return (SubLObject)makeBoolean(NIL != constants_high_oc.f10737(var207) || NIL != module0126.f8399(var207));
    }
    
    public static SubLObject f34959(final SubLObject var206) {
        if (NIL != module0038.f2673(constants_high_oc.f10743(var206), (SubLObject)$ic87$, (SubLObject)UNPROVIDED)) {
            return f34960(constants_high_oc.f10743(var206));
        }
        if (NIL != f34961(var206)) {
            final SubLObject var207 = constants_high_oc.f10743(var206);
            final SubLObject var208 = module0038.f2838((SubLObject)$ic88$, var207, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var209 = Numbers.add(var208, (SubLObject)TWO_INTEGER);
            final SubLObject var210 = module0038.f2623(var207, (SubLObject)ZERO_INTEGER, var209);
            final SubLObject var211 = module0038.f2623(var207, var209, Sequences.length(var207));
            return Sequences.cconcatenate(f34960(var210), var211);
        }
        if (NIL != module0259.f16854(var206, $ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0038.f2771(Sequences.cconcatenate(constants_high_oc.f10743(var206), (SubLObject)$ic90$));
        }
        return Sequences.cconcatenate((SubLObject)$ic86$, constants_high_oc.f10743(var206));
    }
    
    public static SubLObject f34954(final SubLObject var206) {
        if (NIL != f34958(var206)) {
            return (SubLObject)$ic91$;
        }
        return (SubLObject)$ic92$;
    }
    
    public static SubLObject f34960(final SubLObject var168) {
        return module0038.f2771(module0038.f2623(var168, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var168), (SubLObject)TWO_INTEGER)));
    }
    
    public static SubLObject f34961(final SubLObject var206) {
        return module0038.f2668((SubLObject)$ic88$, constants_high_oc.f10743(var206), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34955(final SubLObject var206) {
        return f34962(module0038.f2638(f34963(var206)));
    }
    
    public static SubLObject f34956(final SubLObject var206) {
        return f34962(module0038.f2638(f34964(var206)));
    }
    
    public static SubLObject f34957(final SubLObject var206) {
        return Sequences.cconcatenate((SubLObject)$ic93$, new SubLObject[] { module0006.f203(var206), $ic94$, module0006.f203(f34953(var206)), $ic95$, module0006.f203(var206), $ic96$ });
    }
    
    public static SubLObject f34963(final SubLObject var219) {
        final SubLThread var220 = SubLProcess.currentSubLThread();
        SubLObject var221 = module0226.f14881(var219, (SubLObject)UNPROVIDED);
        if (NIL == var221) {
            final SubLObject var222 = module0147.$g2094$.currentBinding(var220);
            final SubLObject var223 = module0147.$g2095$.currentBinding(var220);
            try {
                module0147.$g2094$.bind((SubLObject)$ic4$, var220);
                module0147.$g2095$.bind($ic5$, var220);
                var221 = module0226.f14881(var219, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var223, var220);
                module0147.$g2094$.rebind(var222, var220);
            }
        }
        if (NIL == var221) {
            var221 = (SubLObject)$ic97$;
        }
        return module0205.f13144(module0256.f16529(var221, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34964(final SubLObject var219) {
        final SubLThread var220 = SubLProcess.currentSubLThread();
        SubLObject var221 = module0226.f14990(var219, (SubLObject)UNPROVIDED);
        if (NIL == var221) {
            final SubLObject var222 = module0147.$g2094$.currentBinding(var220);
            final SubLObject var223 = module0147.$g2095$.currentBinding(var220);
            try {
                module0147.$g2094$.bind((SubLObject)$ic4$, var220);
                module0147.$g2095$.bind($ic5$, var220);
                var221 = module0226.f14990(var219, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var223, var220);
                module0147.$g2094$.rebind(var222, var220);
            }
        }
        if (NIL == var221) {
            var221 = (SubLObject)$ic97$;
        }
        return module0205.f13144(module0256.f16529(var221, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34962(final SubLObject var172) {
        return module0038.f2623(var172, (SubLObject)ONE_INTEGER, Numbers.subtract(Sequences.length(var172), (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f34965(final SubLObject var206) {
        return (SubLObject)ConsesLow.list(var206, f34953(var206));
    }
    
    public static SubLObject f34966() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic98$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var40_222 = var4;
            if (NIL == module0065.f4772(var40_222, (SubLObject)$ic12$)) {
                final SubLObject var42_223 = var40_222;
                if (NIL == module0065.f4775(var42_223, (SubLObject)$ic12$)) {
                    final SubLObject var12 = module0065.f4740(var42_223);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic12$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != f34967(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var54_224 = var40_222;
                if (NIL == module0065.f4777(var54_224) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                    final SubLObject var18 = module0065.f4738(var54_224);
                    SubLObject var19 = module0065.f4739(var54_224);
                    final SubLObject var20 = module0065.f4734(var54_224);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != f34967(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return var3;
    }
    
    public static SubLObject f34967(final SubLObject var30) {
        final SubLObject var31 = Sequences.count_if((SubLObject)$ic99$, module0178.f11299(var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var31.numG((SubLObject)ONE_INTEGER)) {
            return var31;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34968() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = $ic100$;
        final SubLObject var5 = module0137.$g1605$.currentBinding(var2);
        final SubLObject var6 = module0139.$g1636$.currentBinding(var2);
        try {
            module0137.$g1605$.bind(module0137.f8955($ic101$), var2);
            module0139.$g1636$.bind(module0139.f9007(), var2);
            SubLObject var228_229 = var4;
            final SubLObject var7 = (SubLObject)$ic104$;
            final SubLObject var8 = module0056.f4145(var7);
            final SubLObject var5_232 = module0139.$g1635$.currentBinding(var2);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var2);
                final SubLObject var9 = (SubLObject)NIL;
                final SubLObject var5_233 = module0141.$g1714$.currentBinding(var2);
                final SubLObject var6_235 = module0141.$g1715$.currentBinding(var2);
                try {
                    module0141.$g1714$.bind((NIL != var9) ? var9 : module0141.f9283(), var2);
                    module0141.$g1715$.bind((SubLObject)((NIL != var9) ? $ic105$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                    if (NIL != var9 && NIL != module0136.f8864() && NIL == module0141.f9279(var9)) {
                        final SubLObject var10 = module0136.$g1591$.getDynamicValue(var2);
                        if (var10.eql((SubLObject)$ic106$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic107$, var9, (SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var10.eql((SubLObject)$ic109$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic110$, (SubLObject)$ic107$, var9, (SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var10.eql((SubLObject)$ic111$)) {
                            Errors.warn((SubLObject)$ic107$, var9, (SubLObject)$ic108$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic112$, module0136.$g1591$.getDynamicValue(var2));
                            Errors.cerror((SubLObject)$ic110$, (SubLObject)$ic107$, var9, (SubLObject)$ic108$);
                        }
                    }
                    final SubLObject var5_234 = module0141.$g1670$.currentBinding(var2);
                    final SubLObject var6_236 = module0141.$g1671$.currentBinding(var2);
                    final SubLObject var11 = module0141.$g1672$.currentBinding(var2);
                    final SubLObject var12 = module0141.$g1674$.currentBinding(var2);
                    final SubLObject var13 = module0137.$g1605$.currentBinding(var2);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic101$)), var2);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic101$))), var2);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic101$))), var2);
                        module0141.$g1674$.bind((SubLObject)NIL, var2);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic101$)), var2);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var4, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var5_235 = module0141.$g1677$.currentBinding(var2);
                            final SubLObject var6_237 = module0138.$g1619$.currentBinding(var2);
                            final SubLObject var7_241 = module0141.$g1674$.currentBinding(var2);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var2);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic101$))), var2);
                                module0141.$g1674$.bind((SubLObject)NIL, var2);
                                module0249.f16055(var228_229, (SubLObject)UNPROVIDED);
                                while (NIL != var228_229) {
                                    final SubLObject var14 = var228_229;
                                    SubLObject var16;
                                    final SubLObject var15 = var16 = module0200.f12443(module0137.f8955($ic101$));
                                    SubLObject var17 = (SubLObject)NIL;
                                    var17 = var16.first();
                                    while (NIL != var16) {
                                        final SubLObject var5_236 = module0137.$g1605$.currentBinding(var2);
                                        final SubLObject var6_238 = module0141.$g1674$.currentBinding(var2);
                                        try {
                                            module0137.$g1605$.bind(var17, var2);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                            final SubLObject var18 = module0228.f15229(var14);
                                            if (NIL != module0138.f8992(var18)) {
                                                final SubLObject var19 = module0242.f15664(var18, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var19) {
                                                    final SubLObject var20 = module0245.f15834(var19, module0244.f15780(module0137.f8955($ic101$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var20) {
                                                        SubLObject var21;
                                                        for (var21 = module0066.f4838(module0067.f4891(var20)); NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
                                                            var2.resetMultipleValues();
                                                            final SubLObject var22 = module0066.f4839(var21);
                                                            final SubLObject var23 = var2.secondMultipleValue();
                                                            var2.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var22)) {
                                                                final SubLObject var5_237 = module0138.$g1623$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1623$.bind(var22, var2);
                                                                    SubLObject var130_253;
                                                                    for (var130_253 = module0066.f4838(module0067.f4891(var23)); NIL == module0066.f4841(var130_253); var130_253 = module0066.f4840(var130_253)) {
                                                                        var2.resetMultipleValues();
                                                                        final SubLObject var24 = module0066.f4839(var130_253);
                                                                        final SubLObject var25 = var2.secondMultipleValue();
                                                                        var2.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var24)) {
                                                                            final SubLObject var5_238 = module0138.$g1624$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1624$.bind(var24, var2);
                                                                                final SubLObject var26 = var25;
                                                                                if (NIL != module0077.f5302(var26)) {
                                                                                    final SubLObject var27 = module0077.f5333(var26);
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                        var30 = module0032.f1745(var28, var29);
                                                                                        if (NIL != module0032.f1746(var29, var30) && NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var2));
                                                                                            if (NIL != module0173.f10955(var30) && !module0225.f14739(var30).isInteger() && NIL == module0533.f33218(var30)) {
                                                                                                var3 = (SubLObject)ConsesLow.cons(var30, var3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var26.isList()) {
                                                                                    SubLObject var31 = var26;
                                                                                    SubLObject var32 = (SubLObject)NIL;
                                                                                    var32 = var31.first();
                                                                                    while (NIL != var31) {
                                                                                        if (NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var2));
                                                                                            if (NIL != module0173.f10955(var32) && !module0225.f14739(var32).isInteger() && NIL == module0533.f33218(var32)) {
                                                                                                var3 = (SubLObject)ConsesLow.cons(var32, var3);
                                                                                            }
                                                                                        }
                                                                                        var31 = var31.rest();
                                                                                        var32 = var31.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic113$, var26);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var5_238, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var130_253);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var5_237, var2);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var21);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != module0200.f12419(var18, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                    SubLObject var33 = module0248.f15995(var18);
                                                    SubLObject var34 = (SubLObject)NIL;
                                                    var34 = var33.first();
                                                    while (NIL != var33) {
                                                        SubLObject var36;
                                                        final SubLObject var35 = var36 = var34;
                                                        SubLObject var37 = (SubLObject)NIL;
                                                        SubLObject var38 = (SubLObject)NIL;
                                                        SubLObject var39 = (SubLObject)NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic115$);
                                                        var37 = var36.first();
                                                        var36 = var36.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic115$);
                                                        var38 = var36.first();
                                                        var36 = var36.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic115$);
                                                        var39 = var36.first();
                                                        var36 = var36.rest();
                                                        if (NIL == var36) {
                                                            if (NIL != module0147.f9507(var38)) {
                                                                final SubLObject var5_239 = module0138.$g1623$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1623$.bind(var38, var2);
                                                                    if (NIL != module0141.f9289(var39)) {
                                                                        final SubLObject var5_240 = module0138.$g1624$.currentBinding(var2);
                                                                        try {
                                                                            module0138.$g1624$.bind(var39, var2);
                                                                            final SubLObject var26;
                                                                            final SubLObject var40 = var26 = (SubLObject)ConsesLow.list(var37);
                                                                            if (NIL != module0077.f5302(var26)) {
                                                                                final SubLObject var27 = module0077.f5333(var26);
                                                                                SubLObject var28;
                                                                                SubLObject var29;
                                                                                SubLObject var30;
                                                                                for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                    var30 = module0032.f1745(var28, var29);
                                                                                    if (NIL != module0032.f1746(var29, var30) && NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                        module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var2));
                                                                                        if (NIL != module0173.f10955(var30) && !module0225.f14739(var30).isInteger() && NIL == module0533.f33218(var30)) {
                                                                                            var3 = (SubLObject)ConsesLow.cons(var30, var3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var26.isList()) {
                                                                                SubLObject var9_267 = var26;
                                                                                SubLObject var32 = (SubLObject)NIL;
                                                                                var32 = var9_267.first();
                                                                                while (NIL != var9_267) {
                                                                                    if (NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                        module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var2));
                                                                                        if (NIL != module0173.f10955(var32) && !module0225.f14739(var32).isInteger() && NIL == module0533.f33218(var32)) {
                                                                                            var3 = (SubLObject)ConsesLow.cons(var32, var3);
                                                                                        }
                                                                                    }
                                                                                    var9_267 = var9_267.rest();
                                                                                    var32 = var9_267.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic113$, var26);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var5_240, var2);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var5_239, var2);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic115$);
                                                        }
                                                        var33 = var33.rest();
                                                        var34 = var33.first();
                                                    }
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var18, (SubLObject)UNPROVIDED)) {
                                                SubLObject var11_269;
                                                final SubLObject var41 = var11_269 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic101$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic101$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var42 = (SubLObject)NIL;
                                                var42 = var11_269.first();
                                                while (NIL != var11_269) {
                                                    final SubLObject var5_241 = module0138.$g1625$.currentBinding(var2);
                                                    try {
                                                        module0138.$g1625$.bind(var42, var2);
                                                        final SubLObject var44;
                                                        final SubLObject var43 = var44 = Functions.funcall(var42, var18);
                                                        if (NIL != module0077.f5302(var44)) {
                                                            final SubLObject var45 = module0077.f5333(var44);
                                                            SubLObject var46;
                                                            SubLObject var47;
                                                            SubLObject var48;
                                                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                                                var48 = module0032.f1745(var46, var47);
                                                                if (NIL != module0032.f1746(var47, var48) && NIL == module0249.f16059(var48, module0139.$g1636$.getDynamicValue(var2))) {
                                                                    module0249.f16055(var48, module0139.$g1636$.getDynamicValue(var2));
                                                                    if (NIL != module0173.f10955(var48) && !module0225.f14739(var48).isInteger() && NIL == module0533.f33218(var48)) {
                                                                        var3 = (SubLObject)ConsesLow.cons(var48, var3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var44.isList()) {
                                                            SubLObject var49 = var44;
                                                            SubLObject var50 = (SubLObject)NIL;
                                                            var50 = var49.first();
                                                            while (NIL != var49) {
                                                                if (NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var2))) {
                                                                    module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var2));
                                                                    if (NIL != module0173.f10955(var50) && !module0225.f14739(var50).isInteger() && NIL == module0533.f33218(var50)) {
                                                                        var3 = (SubLObject)ConsesLow.cons(var50, var3);
                                                                    }
                                                                }
                                                                var49 = var49.rest();
                                                                var50 = var49.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic113$, var44);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var5_241, var2);
                                                    }
                                                    var11_269 = var11_269.rest();
                                                    var42 = var11_269.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var6_238, var2);
                                            module0137.$g1605$.rebind(var5_236, var2);
                                        }
                                        var16 = var16.rest();
                                        var17 = var16.first();
                                    }
                                    SubLObject var52;
                                    final SubLObject var51 = var52 = module0200.f12443(module0244.f15771(module0137.f8955($ic101$)));
                                    SubLObject var53 = (SubLObject)NIL;
                                    var53 = var52.first();
                                    while (NIL != var52) {
                                        final SubLObject var5_242 = module0137.$g1605$.currentBinding(var2);
                                        final SubLObject var6_239 = module0141.$g1674$.currentBinding(var2);
                                        try {
                                            module0137.$g1605$.bind(var53, var2);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                            final SubLObject var54 = module0228.f15229(var228_229);
                                            if (NIL != module0138.f8992(var54)) {
                                                final SubLObject var55 = module0242.f15664(var54, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var55) {
                                                    final SubLObject var56 = module0245.f15834(var55, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var56) {
                                                        SubLObject var57;
                                                        for (var57 = module0066.f4838(module0067.f4891(var56)); NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
                                                            var2.resetMultipleValues();
                                                            final SubLObject var58 = module0066.f4839(var57);
                                                            final SubLObject var59 = var2.secondMultipleValue();
                                                            var2.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var58)) {
                                                                final SubLObject var5_243 = module0138.$g1623$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1623$.bind(var58, var2);
                                                                    SubLObject var130_254;
                                                                    for (var130_254 = module0066.f4838(module0067.f4891(var59)); NIL == module0066.f4841(var130_254); var130_254 = module0066.f4840(var130_254)) {
                                                                        var2.resetMultipleValues();
                                                                        final SubLObject var60 = module0066.f4839(var130_254);
                                                                        final SubLObject var61 = var2.secondMultipleValue();
                                                                        var2.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var60)) {
                                                                            final SubLObject var5_244 = module0138.$g1624$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1624$.bind(var60, var2);
                                                                                final SubLObject var62 = var61;
                                                                                if (NIL != module0077.f5302(var62)) {
                                                                                    final SubLObject var63 = module0077.f5333(var62);
                                                                                    SubLObject var64;
                                                                                    SubLObject var65;
                                                                                    SubLObject var66;
                                                                                    for (var64 = module0032.f1741(var63), var65 = (SubLObject)NIL, var65 = module0032.f1742(var64, var63); NIL == module0032.f1744(var64, var65); var65 = module0032.f1743(var65)) {
                                                                                        var66 = module0032.f1745(var64, var65);
                                                                                        if (NIL != module0032.f1746(var65, var66) && NIL == module0249.f16059(var66, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var66, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var66, var8);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var62.isList()) {
                                                                                    SubLObject var67 = var62;
                                                                                    SubLObject var68 = (SubLObject)NIL;
                                                                                    var68 = var67.first();
                                                                                    while (NIL != var67) {
                                                                                        if (NIL == module0249.f16059(var68, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var68, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var68, var8);
                                                                                        }
                                                                                        var67 = var67.rest();
                                                                                        var68 = var67.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic113$, var62);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var5_244, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var130_254);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var5_243, var2);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var57);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var54, (SubLObject)UNPROVIDED)) {
                                                SubLObject var11_270;
                                                final SubLObject var69 = var11_270 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var70 = (SubLObject)NIL;
                                                var70 = var11_270.first();
                                                while (NIL != var11_270) {
                                                    final SubLObject var5_245 = module0138.$g1625$.currentBinding(var2);
                                                    try {
                                                        module0138.$g1625$.bind(var70, var2);
                                                        final SubLObject var72;
                                                        final SubLObject var71 = var72 = Functions.funcall(var70, var54);
                                                        if (NIL != module0077.f5302(var72)) {
                                                            final SubLObject var73 = module0077.f5333(var72);
                                                            SubLObject var74;
                                                            SubLObject var75;
                                                            SubLObject var76;
                                                            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                                                var76 = module0032.f1745(var74, var75);
                                                                if (NIL != module0032.f1746(var75, var76) && NIL == module0249.f16059(var76, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var76, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var76, var8);
                                                                }
                                                            }
                                                        }
                                                        else if (var72.isList()) {
                                                            SubLObject var77 = var72;
                                                            SubLObject var78 = (SubLObject)NIL;
                                                            var78 = var77.first();
                                                            while (NIL != var77) {
                                                                if (NIL == module0249.f16059(var78, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var78, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var78, var8);
                                                                }
                                                                var77 = var77.rest();
                                                                var78 = var77.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic113$, var72);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var5_245, var2);
                                                    }
                                                    var11_270 = var11_270.rest();
                                                    var70 = var11_270.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var6_239, var2);
                                            module0137.$g1605$.rebind(var5_242, var2);
                                        }
                                        var52 = var52.rest();
                                        var53 = var52.first();
                                    }
                                    var228_229 = module0056.f4150(var8);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var7_241, var2);
                                module0138.$g1619$.rebind(var6_237, var2);
                                module0141.$g1677$.rebind(var5_235, var2);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic116$, var4, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var13, var2);
                        module0141.$g1674$.rebind(var12, var2);
                        module0141.$g1672$.rebind(var11, var2);
                        module0141.$g1671$.rebind(var6_236, var2);
                        module0141.$g1670$.rebind(var5_234, var2);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var6_235, var2);
                    module0141.$g1714$.rebind(var5_233, var2);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
            }
            finally {
                module0139.$g1635$.rebind(var5_232, var2);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var2));
        }
        finally {
            module0139.$g1636$.rebind(var6, var2);
            module0137.$g1605$.rebind(var5, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f34969(final SubLObject var282) {
        return (SubLObject)makeBoolean($ic2$ == module0178.f11292(var282) && NIL != module0167.f10813(module0178.f11334(var282)));
    }
    
    public static SubLObject f34970(final SubLObject var283) {
        return (SubLObject)makeBoolean(NIL != module0220.f14556(var283, $ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0269.f17705(var283));
    }
    
    public static SubLObject f34971() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var2);
            module0147.$g2095$.bind($ic5$, var2);
            final SubLObject var5 = (SubLObject)$ic118$;
            final SubLObject var6 = module0173.f10962();
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            final SubLObject var5_287 = module0012.$g75$.currentBinding(var2);
            final SubLObject var6_288 = module0012.$g76$.currentBinding(var2);
            final SubLObject var8 = module0012.$g77$.currentBinding(var2);
            final SubLObject var9 = module0012.$g78$.currentBinding(var2);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
                module0012.$g76$.bind((SubLObject)NIL, var2);
                module0012.$g77$.bind((SubLObject)T, var2);
                module0012.$g78$.bind(Time.get_universal_time(), var2);
                module0012.f478(var5);
                SubLObject var10 = module0173.f10961();
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    final SubLObject var12 = var11;
                    if (NIL == module0065.f4772(var12, (SubLObject)$ic12$)) {
                        final SubLObject var42_290 = var12;
                        if (NIL == module0065.f4775(var42_290, (SubLObject)$ic12$)) {
                            final SubLObject var13 = module0065.f4740(var42_290);
                            final SubLObject var14 = (SubLObject)NIL;
                            SubLObject var15;
                            SubLObject var16;
                            SubLObject var17;
                            SubLObject var18;
                            SubLObject var19;
                            SubLObject var20;
                            SubLObject var21;
                            SubLObject var22;
                            SubLObject var23;
                            SubLObject var24;
                            SubLObject var25;
                            SubLObject var23_293;
                            SubLObject var24_294;
                            SubLObject var26;
                            SubLObject var26_296;
                            SubLObject var5_288;
                            for (var15 = Sequences.length(var13), var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                                var17 = ((NIL != var14) ? Numbers.subtract(var15, var16, (SubLObject)ONE_INTEGER) : var16);
                                var18 = Vectors.aref(var13, var17);
                                if (NIL == module0065.f4749(var18) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                                    if (NIL != module0065.f4749(var18)) {
                                        var18 = (SubLObject)$ic12$;
                                    }
                                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var7, var6);
                                    if (NIL != f34970(var18)) {
                                        var19 = $ic117$;
                                        if (NIL != module0158.f10010(var18, (SubLObject)ONE_INTEGER, var19)) {
                                            var20 = module0158.f10011(var18, (SubLObject)ONE_INTEGER, var19);
                                            var21 = (SubLObject)NIL;
                                            var22 = (SubLObject)NIL;
                                            while (NIL == var21) {
                                                var23 = module0052.f3695(var20, var22);
                                                var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                                                if (NIL != var24) {
                                                    var25 = (SubLObject)NIL;
                                                    try {
                                                        var25 = module0158.f10316(var23, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                                        var23_293 = (SubLObject)NIL;
                                                        var24_294 = (SubLObject)NIL;
                                                        while (NIL == var23_293) {
                                                            var26 = module0052.f3695(var25, var24_294);
                                                            var26_296 = (SubLObject)makeBoolean(!var24_294.eql(var26));
                                                            if (NIL != var26_296) {
                                                                module0543.f33646(var26);
                                                            }
                                                            var23_293 = (SubLObject)makeBoolean(NIL == var26_296);
                                                        }
                                                    }
                                                    finally {
                                                        var5_288 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                            if (NIL != var25) {
                                                                module0158.f10319(var25);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var5_288, var2);
                                                        }
                                                    }
                                                }
                                                var21 = (SubLObject)makeBoolean(NIL == var24);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var54_298 = var12;
                        if (NIL == module0065.f4777(var54_298) || NIL == module0065.f4773((SubLObject)$ic12$)) {
                            final SubLObject var27 = module0065.f4738(var54_298);
                            SubLObject var28 = module0065.f4739(var54_298);
                            final SubLObject var29 = module0065.f4734(var54_298);
                            final SubLObject var30 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic12$)) ? NIL : $ic12$);
                            while (var28.numL(var29)) {
                                final SubLObject var31 = Hashtables.gethash_without_values(var28, var27, var30);
                                if (NIL == module0065.f4773((SubLObject)$ic12$) || NIL == module0065.f4749(var31)) {
                                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var7, var6);
                                    if (NIL != f34970(var31)) {
                                        final SubLObject var32 = $ic117$;
                                        if (NIL != module0158.f10010(var31, (SubLObject)ONE_INTEGER, var32)) {
                                            final SubLObject var33 = module0158.f10011(var31, (SubLObject)ONE_INTEGER, var32);
                                            SubLObject var34 = (SubLObject)NIL;
                                            final SubLObject var35 = (SubLObject)NIL;
                                            while (NIL == var34) {
                                                final SubLObject var36 = module0052.f3695(var33, var35);
                                                final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                                                if (NIL != var37) {
                                                    SubLObject var38 = (SubLObject)NIL;
                                                    try {
                                                        var38 = module0158.f10316(var36, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                                        SubLObject var23_294 = (SubLObject)NIL;
                                                        final SubLObject var24_295 = (SubLObject)NIL;
                                                        while (NIL == var23_294) {
                                                            final SubLObject var39 = module0052.f3695(var38, var24_295);
                                                            final SubLObject var26_297 = (SubLObject)makeBoolean(!var24_295.eql(var39));
                                                            if (NIL != var26_297) {
                                                                module0543.f33646(var39);
                                                            }
                                                            var23_294 = (SubLObject)makeBoolean(NIL == var26_297);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var5_289 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                            if (NIL != var38) {
                                                                module0158.f10319(var38);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var5_289, var2);
                                                        }
                                                    }
                                                }
                                                var34 = (SubLObject)makeBoolean(NIL == var37);
                                            }
                                        }
                                    }
                                }
                                var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var2);
                module0012.$g77$.rebind(var8, var2);
                module0012.$g76$.rebind(var6_288, var2);
                module0012.$g75$.rebind(var5_287, var2);
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var2);
            module0147.$g2094$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34972() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34903", "S#38276", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34904", "S#32776", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34914", "S#38277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34917", "S#31695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34915", "S#38278", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34918", "S#38279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34912", "S#38280", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34920", "S#38281", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34919", "S#38282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34922", "S#38283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34921", "S#38284", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34916", "S#38285", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34923", "S#38286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34913", "S#38287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34905", "S#38288", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34906", "S#38289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34907", "S#38290", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34925", "S#38291", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34924", "S#38233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34926", "S#38292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34910", "S#38293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34927", "S#38294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34911", "S#38295", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34908", "S#38296", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34929", "S#38297", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34928", "S#38298", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34909", "S#38299", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34930", "DUPLICATE-NART-TUPLES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34931", "S#38300", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34932", "S#38301", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34933", "S#38302", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34936", "S#38303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34934", "S#38304", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34937", "S#38305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34935", "S#38306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34938", "S#38307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34939", "S#38308", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34940", "S#38309", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34941", "S#38310", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34942", "S#38311", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34944", "S#38312", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34943", "S#38313", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34946", "S#38314", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34947", "S#38315", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34948", "S#38316", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34945", "S#38317", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34949", "S#38318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34950", "S#38319", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34952", "S#38320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34951", "S#38321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34953", "S#38322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34958", "S#38323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34959", "S#38324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34954", "S#38325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34960", "S#38326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34961", "S#38327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34955", "S#38328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34956", "S#38329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34957", "S#38330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34963", "S#38331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34964", "S#38332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34962", "S#38333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34965", "S#38334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34966", "S#38335", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34967", "S#38336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34968", "S#38337", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34969", "S#38232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34970", "S#38338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0569", "f34971", "S#38339", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34973() {
        $g4141$ = SubLFiles.defparameter("S#38340", (SubLObject)TWELVE_INTEGER);
        $g4142$ = SubLFiles.deflexical("S#38341", (SubLObject)NIL);
        $g4143$ = SubLFiles.deflexical("S#38342", (SubLObject)$ic65$);
        $g4144$ = SubLFiles.deflexical("S#38343", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34974() {
        module0034.f1909((SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34972();
    }
    
    public void initializeVariables() {
        f34973();
    }
    
    public void runTopLevelForms() {
        f34974();
    }
    
    static {
        me = (SubLFile)new module0569();
        $g4141$ = null;
        $g4142$ = null;
        $g4143$ = null;
        $g4144$ = null;
        $ic0$ = makeString("Forgetting ephemeral terms");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("ephemeralTerm"));
        $ic2$ = makeKeyword("TRUE");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("inProgressTerm"));
        $ic4$ = makeSymbol("S#12274", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic6$ = makeKeyword("GAF");
        $ic7$ = makeSymbol("FORT-P");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunction"));
        $ic9$ = makeString("forgetting useless NARTs");
        $ic10$ = makeString("Gathering useless NARTs");
        $ic11$ = makeSymbol("STRINGP");
        $ic12$ = makeKeyword("SKIP");
        $ic13$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic14$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic15$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic16$ = makeString("Forgetting NART ~S~%");
        $ic17$ = makeString("Forgetting the extent of ");
        $ic18$ = makeSymbol("GAF-ARG1");
        $ic19$ = makeString("Finding invalid deductions");
        $ic20$ = makeString("~&Bad deduction ~S: ~S ~S");
        $ic21$ = makeString("Removing or rejustifying ");
        $ic22$ = makeString(" invalid deductions");
        $ic23$ = makeString("Forgetting useless KB HL supports");
        $ic24$ = makeString("Forgetting old creation seconds");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond"));
        $ic26$ = makeString("Examining creation seconds");
        $ic27$ = makeString("Cleaning KBS assert info");
        $ic28$ = makeKeyword("UNCHANGED");
        $ic29$ = makeSymbol("S#12276", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic31$ = makeString("Looking for duplicate narts with the same HL formula");
        $ic32$ = makeSymbol("NUM-INDEX");
        $ic33$ = makeString("Examining ");
        $ic34$ = makeString(" assertions for duplication");
        $ic35$ = makeString("Examining all assertions for duplication (1/2 grouping)");
        $ic36$ = makeString("Examining all assertions for duplication (2/2 considering)");
        $ic37$ = makeSymbol("S#21654", "CYC");
        $ic38$ = makeString("could not find an obvious keeper in ~a");
        $ic39$ = makeSymbol("ASSERTION-ID");
        $ic40$ = makeString("Blasting approximately ");
        $ic41$ = makeString(" duplicate assertions");
        $ic42$ = makeString("Could not kill ~a");
        $ic43$ = makeString("Redoing TMS on assertions with no arguments");
        $ic44$ = makeKeyword("SAME");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic46$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nicknames")), constant_handles_oc.f8479((SubLObject)makeString("formerName")), constant_handles_oc.f8479((SubLObject)makeString("preferredNameString")), constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("alias")));
        $ic47$ = makeString("cdolist");
        $ic48$ = makeString("~S -> ~A~%");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn-Ternary"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("ProperSubcollectionNamedFn-Ternary"));
        $ic51$ = makeString("~A new narts added between KB ~S and ~S ~%");
        $ic52$ = makeString("~A narts departed between KB ~S and ~S ~%");
        $ic53$ = makeString("====================New NARTs======================~%");
        $ic54$ = makeString("~S~%");
        $ic55$ = makeString("====================Departed NARTs======================~%");
        $ic56$ = makeSymbol("S#38317", "CYC");
        $ic57$ = makeString("KB-");
        $ic58$ = makeString("-");
        $ic59$ = makeString("-NARTS.txt");
        $ic60$ = makeString("Getting ~A narts for KB ~S~%");
        $ic61$ = makeKeyword("INPUT");
        $ic62$ = makeString("Unable to open ~S");
        $ic63$ = makeSymbol("S#38341", "CYC");
        $ic64$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic65$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), constant_handles_oc.f8479((SubLObject)makeString("QuasiQuote")), constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote")));
        $ic66$ = makeKeyword("OUTPUT");
        $ic67$ = makeString(";; functionCorrespondingPredicate-Canonical sweep KE file, generated at ~a~%");
        $ic68$ = makeString("Writing KE text...");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("UnaryFunction"));
        $ic70$ = makeString("Gathering functions...");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("functionCorrespondingPredicate-Generic"));
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?ARGNUM"));
        $ic73$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic74$ = makeSymbol("S#38320", "CYC");
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic76$ = makeString("\n;; ");
        $ic77$ = makeString("\nconstant: ");
        $ic78$ = makeString(".");
        $ic79$ = makeString("\nin mt: UniversalVocabularyMt.\nisa: StrictlyFunctionalSlot.\nquotedIsa: ProposedPublicConstant.\narg1Isa: ");
        $ic80$ = makeString(".\narg2Isa: ");
        $ic81$ = makeString(".\narg2Format: singleEntryFormatInArgs.\nstrictlyFunctionalInArgs: 2.\ncomment: ");
        $ic82$ = makeString(".\nf: (functionCorrespondingPredicate-Canonical ");
        $ic83$ = makeString(" ");
        $ic84$ = makeString(" 2).\n\n");
        $ic85$ = makeString("Of");
        $ic86$ = makeString("blakePleaseRenameThis-ItsTheFunctionCorrespondingPredicateFor");
        $ic87$ = makeString("Fn");
        $ic88$ = makeString("Fn-");
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasureConcept"));
        $ic90$ = makeString("versionOf");
        $ic91$ = makeString(" ;; Blake, check this out.");
        $ic92$ = makeString("");
        $ic93$ = makeString("A predicate corresponding to the function ");
        $ic94$ = makeString(".  <code>(#$");
        $ic95$ = makeString(" X (");
        $ic96$ = makeString(" X))</code> will always be true for <code>X</code> meeting the relevant arg constraints.");
        $ic97$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic98$ = makeString("Looking for assertions with more than one belief");
        $ic99$ = makeSymbol("BELIEF-P");
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("FixedArityRelation"));
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic102$ = makeKeyword("BREADTH");
        $ic103$ = makeKeyword("QUEUE");
        $ic104$ = makeKeyword("STACK");
        $ic105$ = makeSymbol("S#11450", "CYC");
        $ic106$ = makeKeyword("ERROR");
        $ic107$ = makeString("~A is not a ~A");
        $ic108$ = makeSymbol("S#11592", "CYC");
        $ic109$ = makeKeyword("CERROR");
        $ic110$ = makeString("continue anyway");
        $ic111$ = makeKeyword("WARN");
        $ic112$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic113$ = makeString("~A is neither SET-P nor LISTP.");
        $ic114$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic115$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic116$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic118$ = makeString("Checking that all FORTs with #$genls assertions are known to be collections");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2004 ms
	
	Decompiled with Procyon 0.5.32.
*/