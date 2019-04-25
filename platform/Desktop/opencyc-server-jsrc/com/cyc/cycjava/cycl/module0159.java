package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0159 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0159";
    public static final String myFingerPrint = "3a4ffddef5888aa8b183e3155ae0380412b3689fb1742bca3cc9967af58f7aa9";
    public static SubLSymbol $g2137$;
    public static SubLSymbol $g2138$;
    public static SubLSymbol $g2139$;
    public static SubLSymbol $g2140$;
    public static SubLSymbol $g2141$;
    public static SubLSymbol $g2142$;
    public static SubLSymbol $g2143$;
    public static SubLSymbol $g2144$;
    public static SubLSymbol $g2145$;
    public static SubLSymbol $g2146$;
    public static SubLSymbol $g2147$;
    public static SubLSymbol $g2148$;
    public static SubLSymbol $g2149$;
    public static SubLSymbol $g2150$;
    public static SubLSymbol $g2151$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
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
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    
    public static SubLObject f10357(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic5$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic5$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic7$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : $ic9$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic11$;
        final SubLObject var16 = (SubLObject)$ic12$;
        final SubLObject var17 = (SubLObject)$ic13$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var11), (SubLObject)ConsesLow.list(var16, var13), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var15, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic16$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic17$, var17)), (SubLObject)ConsesLow.list((SubLObject)$ic18$, reader.bq_cons((SubLObject)$ic19$, ConsesLow.append(var14, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic21$, var17, var15, var16)))));
    }
    
    public static SubLObject f10358(final SubLObject var20, SubLObject var13, SubLObject var15) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic22$;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = var13;
        final SubLObject var25 = var15;
        final SubLObject var26 = f10359(var24, var25);
        final SubLObject var27 = $g2150$.currentBinding(var21);
        final SubLObject var28 = $g2151$.currentBinding(var21);
        try {
            $g2150$.bind(var24, var21);
            $g2151$.bind(var26, var21);
            try {
                var23 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(Eval.eval(var20)));
            }
            finally {
                final SubLObject var27_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                    var22 = f10360(var26, var24, var25);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var27_29, var21);
                }
            }
        }
        finally {
            $g2151$.rebind(var28, var21);
            $g2150$.rebind(var27, var21);
        }
        return Values.values(var22, var23);
    }
    
    public static SubLObject f10359(final SubLObject var13, final SubLObject var15) {
        return module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10360(final SubLObject var30, final SubLObject var13, final SubLObject var15) {
        return var30;
    }
    
    public static SubLObject f10361(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (NIL != $g2149$.getGlobalValue() && NIL != module0035.f2169((SubLObject)$ic24$, $g2150$.getDynamicValue(var32))) {
            module0084.f5775($g2151$.getDynamicValue(var32), var31, (SubLObject)UNPROVIDED);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10362(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (NIL != $g2149$.getGlobalValue() && NIL != module0035.f2169((SubLObject)$ic25$, $g2150$.getDynamicValue(var33))) {
            module0084.f5775($g2151$.getDynamicValue(var33), var32, (SubLObject)UNPROVIDED);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10363(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (NIL != $g2149$.getGlobalValue() && NIL != module0035.f2169((SubLObject)$ic26$, $g2150$.getDynamicValue(var34))) {
            return f10364(var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10364(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        module0084.f5775($g2151$.getDynamicValue(var34), var33, (SubLObject)UNPROVIDED);
        return (SubLObject)T;
    }
    
    public static SubLObject f10365(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var5, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10366() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return module0035.f2169((SubLObject)$ic33$, $g2150$.getDynamicValue(var21));
    }
    
    public static SubLObject f10367(final SubLObject var38) {
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic34$), module0067.f4902(var38), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10368(final SubLObject var38) {
        final SubLObject var39 = f10367(var38);
        final SubLObject var40 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic34$), var39);
        final SubLObject var41 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic35$), var40);
        final SubLObject var42 = Numbers.round(module0048.f3384(var41), (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0051.f3557(var42, (SubLObject)UNPROVIDED);
        return var43;
    }
    
    public static SubLObject f10369(final SubLObject var38) {
        final SubLObject var39 = f10367(var38);
        final SubLObject var40 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic34$), var39);
        final SubLObject var41 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic35$), var40);
        final SubLObject var42 = Numbers.round(module0048.f3387(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0051.f3557(var42, (SubLObject)UNPROVIDED);
        return var43;
    }
    
    public static SubLObject f10370(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)ZERO_INTEGER;
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        SubLObject var42;
        for (var42 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var42); var42 = module0066.f4840(var42)) {
            var39.resetMultipleValues();
            final SubLObject var43 = module0066.f4839(var42);
            final SubLObject var44 = var39.secondMultipleValue();
            var39.resetMultipleValues();
            final SubLObject var45 = module0178.f11296(var43);
            if (NIL != var45) {
                final SubLObject var46 = module0051.f3612(var45, (SubLObject)UNPROVIDED);
                var41 = Numbers.add(var41, var44);
                var40 = Numbers.add(var40, Numbers.multiply(var44, var46));
            }
        }
        module0066.f4842(var42);
        final SubLObject var47 = Numbers.integerDivide(var40, var41);
        final SubLObject var48 = module0051.f3557(var47, (SubLObject)UNPROVIDED);
        return var48;
    }
    
    public static SubLObject f10371(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41;
        for (var41 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
            var39.resetMultipleValues();
            final SubLObject var42 = module0066.f4839(var41);
            final SubLObject var43 = var39.secondMultipleValue();
            var39.resetMultipleValues();
            final SubLObject var44 = module0178.f11296(var42);
            if (NIL != var44) {
                var40 = ConsesLow.nconc((SubLObject)ConsesLow.make_list(var43, var44), var40);
            }
        }
        module0066.f4842(var41);
        final SubLObject var45 = Numbers.round(module0048.f3387(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        return var45;
    }
    
    public static SubLObject f10372(final SubLObject var51, final SubLObject var38) {
        final SubLObject var52 = f10367(var38);
        SubLObject var53 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic34$), var52);
        var53 = Sort.sort(var53, Symbols.symbol_function((SubLObject)$ic36$), (SubLObject)UNPROVIDED);
        final SubLObject var54 = Sequences.position(var51, var53, Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var55 = module0048.f3314(var54, Sequences.length(var53), (SubLObject)THREE_INTEGER);
        return var55;
    }
    
    public static SubLObject f10373(final SubLObject var51, final SubLObject var38) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54;
        for (var54 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var54); var54 = module0066.f4840(var54)) {
            var52.resetMultipleValues();
            final SubLObject var55 = module0066.f4839(var54);
            final SubLObject var56 = var52.secondMultipleValue();
            var52.resetMultipleValues();
            final SubLObject var57 = module0178.f11296(var55);
            if (NIL != var57) {
                var53 = ConsesLow.nconc((SubLObject)ConsesLow.make_list(var56, var57), var53);
            }
        }
        module0066.f4842(var54);
        var53 = Sort.sort(var53, Symbols.symbol_function((SubLObject)$ic36$), (SubLObject)UNPROVIDED);
        final SubLObject var58 = Sequences.position(var51, var53, Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0048.f3314(var58, Sequences.length(var53), (SubLObject)THREE_INTEGER);
        return var59;
    }
    
    public static SubLObject f10374(final SubLObject var38, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57;
        for (var57 = module0066.f4838(module0067.f4891(var38)); NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
            var55.resetMultipleValues();
            final SubLObject var58 = module0066.f4839(var57);
            final SubLObject var59 = var55.secondMultipleValue();
            var55.resetMultipleValues();
            final SubLObject var60 = module0178.f11296(var58);
            if (NIL != var60) {
                var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var58, var60, var59), var56);
            }
        }
        module0066.f4842(var57);
        var56 = Sort.sort(var56, Symbols.symbol_function((SubLObject)$ic36$), Symbols.symbol_function((SubLObject)$ic38$));
        SubLObject var61 = (SubLObject)ZERO_INTEGER;
        SubLObject var62 = var56;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            SubLObject var65;
            final SubLObject var64 = var65 = var63;
            SubLObject var66 = (SubLObject)NIL;
            SubLObject var67 = (SubLObject)NIL;
            SubLObject var68 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic39$);
            var66 = var65.first();
            var65 = var65.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic39$);
            var67 = var65.first();
            var65 = var65.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic39$);
            var68 = var65.first();
            var65 = var65.rest();
            if (NIL == var65) {
                if (var67.numG(var61)) {
                    PrintLow.format(var54, (SubLObject)$ic40$, module0051.f3617(var67));
                    var61 = var67;
                }
                print_high.print(var66, var54);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)$ic39$);
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10375() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0159", "f10357", "S#13115");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10358", "S#13116", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10359", "S#13117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10360", "S#13118", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10361", "S#13119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10362", "S#13120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10363", "S#13121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10364", "S#13122", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0159", "f10365", "S#13123");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10366", "S#13124", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10367", "S#13125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10368", "S#13126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10369", "S#13127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10370", "S#13128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10371", "S#13129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10372", "S#13130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10373", "S#13131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0159", "f10374", "S#13132", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10376() {
        $g2137$ = SubLFiles.defparameter("S#13133", (SubLObject)NIL);
        $g2138$ = SubLFiles.defparameter("S#13134", (SubLObject)NIL);
        $g2139$ = SubLFiles.defparameter("S#13135", (SubLObject)NIL);
        $g2140$ = SubLFiles.defparameter("S#13136", (SubLObject)NIL);
        $g2141$ = SubLFiles.defparameter("S#13137", (SubLObject)NIL);
        $g2142$ = SubLFiles.defparameter("S#13138", (SubLObject)NIL);
        $g2143$ = SubLFiles.deflexical("S#13139", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2143$.getGlobalValue() : NIL));
        $g2144$ = SubLFiles.deflexical("S#13140", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g2144$.getGlobalValue() : NIL));
        $g2145$ = SubLFiles.deflexical("S#13141", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2145$.getGlobalValue() : NIL));
        $g2146$ = SubLFiles.deflexical("S#13142", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2146$.getGlobalValue() : NIL));
        $g2147$ = SubLFiles.defparameter("S#13143", (SubLObject)NIL);
        $g2148$ = SubLFiles.defparameter("S#13144", (SubLObject)NIL);
        $g2149$ = SubLFiles.deflexical("S#13145", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2149$.getGlobalValue() : NIL));
        $g2150$ = SubLFiles.defparameter("S#13146", (SubLObject)NIL);
        $g2151$ = SubLFiles.defparameter("S#13147", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10377() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic23$);
        module0002.f50((SubLObject)$ic21$, (SubLObject)$ic23$);
        module0002.f50((SubLObject)$ic31$, (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f10375();
    }
    
    public void initializeVariables() {
        f10376();
    }
    
    public void runTopLevelForms() {
        f10377();
    }
    
    static {
        me = (SubLFile)new module0159();
        $g2137$ = null;
        $g2138$ = null;
        $g2139$ = null;
        $g2140$ = null;
        $g2141$ = null;
        $g2142$ = null;
        $g2143$ = null;
        $g2144$ = null;
        $g2145$ = null;
        $g2146$ = null;
        $g2147$ = null;
        $g2148$ = null;
        $g2149$ = null;
        $g2150$ = null;
        $g2151$ = null;
        $ic0$ = makeSymbol("S#13139", "CYC");
        $ic1$ = makeSymbol("S#13140", "CYC");
        $ic2$ = makeSymbol("S#13141", "CYC");
        $ic3$ = makeSymbol("S#13142", "CYC");
        $ic4$ = makeSymbol("S#13145", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#761", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13148", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERTION"))))), (SubLObject)makeSymbol("S#6511", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("DOMAINS"), (SubLObject)makeKeyword("OPTIONS"));
        $ic7$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic8$ = makeKeyword("DOMAINS");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERTION")));
        $ic10$ = makeKeyword("OPTIONS");
        $ic11$ = makeUninternedSymbol("US#1E882ED");
        $ic12$ = makeUninternedSymbol("US#394D9E3");
        $ic13$ = makeUninternedSymbol("US#7C5C08F");
        $ic14$ = makeSymbol("CLET");
        $ic15$ = makeSymbol("S#13117", "CYC");
        $ic16$ = makeSymbol("S#13146", "CYC");
        $ic17$ = makeSymbol("S#13147", "CYC");
        $ic18$ = makeSymbol("CUNWIND-PROTECT");
        $ic19$ = makeSymbol("PROGN");
        $ic20$ = makeSymbol("CSETQ");
        $ic21$ = makeSymbol("S#13118", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTION"));
        $ic23$ = makeSymbol("S#13115", "CYC");
        $ic24$ = makeKeyword("CONSTANT");
        $ic25$ = makeKeyword("NART");
        $ic26$ = makeKeyword("ASSERTION");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#13149", "CYC"));
        $ic28$ = makeSymbol("PWHEN");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)makeSymbol("S#13145", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13124", "CYC")));
        $ic30$ = makeSymbol("S#13150", "CYC");
        $ic31$ = makeSymbol("S#13124", "CYC");
        $ic32$ = makeSymbol("S#13123", "CYC");
        $ic33$ = makeKeyword("SBHL");
        $ic34$ = makeSymbol("ASSERTED-WHEN");
        $ic35$ = makeSymbol("S#5026", "CYC");
        $ic36$ = makeSymbol("<");
        $ic37$ = makeSymbol("<=");
        $ic38$ = makeSymbol("SECOND");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic40$ = makeString("~%;; ~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 134 ms
	
	Decompiled with Procyon 0.5.32.
*/