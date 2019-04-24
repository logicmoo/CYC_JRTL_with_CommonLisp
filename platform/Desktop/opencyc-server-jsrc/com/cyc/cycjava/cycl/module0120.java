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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0120 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0120";
    public static final String myFingerPrint = "3a3b16988554cf89585c61272ca1a845d9361bb184460df72f3570e66cd539a3";
    private static SubLSymbol $g1472$;
    private static SubLSymbol $g1473$;
    private static SubLSymbol $g1474$;
    private static SubLSymbol $g1475$;
    public static SubLSymbol $g1476$;
    private static SubLSymbol $g1477$;
    private static SubLSymbol $g1478$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
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
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    
    public static SubLObject f8240(final SubLObject var1, final SubLObject var2) {
        f8241(var1, var2, (SubLObject)module0120.ZERO_INTEGER);
        return (SubLObject)module0120.NIL;
    }
    
    public static SubLObject f8242(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10338_native.class) ? module0120.T : module0120.NIL);
    }
    
    public static SubLObject f8243(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8244(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8245(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8246(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8247(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8248(final SubLObject var1) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f8249(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8250(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8251(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8252(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8253(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8254(final SubLObject var1, final SubLObject var4) {
        assert module0120.NIL != f8242(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f8255(SubLObject var5) {
        if (var5 == module0120.UNPROVIDED) {
            var5 = (SubLObject)module0120.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10338_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0120.NIL, var7 = var5; module0120.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0120.$ic24$)) {
                f8249(var6, var9);
            }
            else if (var10.eql((SubLObject)module0120.$ic25$)) {
                f8250(var6, var9);
            }
            else if (var10.eql((SubLObject)module0120.$ic26$)) {
                f8251(var6, var9);
            }
            else if (var10.eql((SubLObject)module0120.$ic27$)) {
                f8252(var6, var9);
            }
            else if (var10.eql((SubLObject)module0120.$ic28$)) {
                f8253(var6, var9);
            }
            else if (var10.eql((SubLObject)module0120.$ic29$)) {
                f8254(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0120.$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8256(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic31$, (SubLObject)module0120.$ic32$, (SubLObject)module0120.SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic24$, f8243(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic25$, f8244(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic26$, f8245(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic27$, f8246(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic28$, f8247(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic33$, (SubLObject)module0120.$ic29$, f8248(var11));
        Functions.funcall(var12, var11, (SubLObject)module0120.$ic34$, (SubLObject)module0120.$ic32$, (SubLObject)module0120.SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f8257(final SubLObject var11, final SubLObject var12) {
        return f8256(var11, var12);
    }
    
    public static SubLObject f8258(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        return f8255((SubLObject)ConsesLow.list(new SubLObject[] { module0120.$ic24$, module0057.f4175(module0120.$g1475$.getGlobalValue()), module0120.$ic25$, var13, module0120.$ic26$, var14, module0120.$ic27$, var15, module0120.$ic29$, var16, module0120.$ic28$, var17 }));
    }
    
    public static SubLObject f8241(final SubLObject var18, final SubLObject var2, final SubLObject var19) {
        PrintLow.format(var2, (SubLObject)module0120.$ic36$, new SubLObject[] { f8243(var18), f8244(var18), f8245(var18), f8248(var18), f8246(var18), (module0120.NIL != f8247(var18)) ? module0120.$ic37$ : module0120.$ic38$ });
        return var18;
    }
    
    public static SubLObject f8259(final SubLObject var13, final SubLObject var14, final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == module0120.UNPROVIDED) {
            var16 = (SubLObject)module0120.NIL;
        }
        if (var17 == module0120.UNPROVIDED) {
            var17 = (SubLObject)module0120.NIL;
        }
        assert module0120.NIL != Types.function_spec_p(var13) : var13;
        assert module0120.NIL != Types.function_spec_p(var15) : var15;
        assert module0120.NIL != Types.booleanp(var17) : var17;
        if (module0120.NIL == var16) {
            var16 = Threads.current_process();
        }
        assert module0120.NIL != Threads.valid_process_p(var16) : var16;
        if (module0120.NIL == module0059.f4273(module0120.$g1473$.getGlobalValue())) {
            return (SubLObject)module0120.NIL;
        }
        final SubLObject var18 = f8258(var13, var14, var15, var16, var17);
        final SubLObject var19 = f8243(var18);
        module0059.f4284(var18, module0120.$g1473$.getGlobalValue());
        return var19;
    }
    
    public static SubLObject f8260(final SubLObject var21) {
        return Types.fixnump(var21);
    }
    
    public static SubLObject f8261(final SubLObject var21) {
        assert module0120.NIL != Types.fixnump(var21) : var21;
        if (module0120.NIL != module0059.f4273(module0120.$g1473$.getGlobalValue())) {
            module0059.f4284(var21, module0120.$g1473$.getGlobalValue());
        }
        return var21;
    }
    
    public static SubLObject f8262(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0120.$ic56$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)module0120.NIL;
        SubLObject var28 = (SubLObject)module0120.NIL;
        SubLObject var29 = (SubLObject)module0120.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0120.$ic56$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0120.$ic56$);
        var28 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0120.$ic56$);
        var29 = var25.first();
        var25 = var25.rest();
        if (module0120.NIL == var25) {
            final SubLObject var30;
            var25 = (var30 = var26);
            final SubLObject var31 = (SubLObject)module0120.$ic57$;
            return (SubLObject)ConsesLow.list((SubLObject)module0120.$ic58$, (SubLObject)module0120.$ic59$, (SubLObject)ConsesLow.list((SubLObject)module0120.$ic60$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0120.$ic42$, var27, var28, var29))), reader.bq_cons((SubLObject)module0120.$ic61$, ConsesLow.append(var30, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0120.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0120.$ic47$, var31), (SubLObject)ConsesLow.list((SubLObject)module0120.$ic52$, var31)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)module0120.$ic56$);
        return (SubLObject)module0120.NIL;
    }
    
    public static SubLObject f8263() {
        if (module0120.NIL != module0059.f4273(module0120.$g1473$.getGlobalValue())) {
            return module0059.f4289(module0120.$g1473$.getGlobalValue());
        }
        return Values.values((SubLObject)module0120.NIL, Time.get_universal_time());
    }
    
    public static SubLObject f8264(SubLObject var2) {
        if (var2 == module0120.UNPROVIDED) {
            var2 = (SubLObject)module0120.T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0120.NIL == f8265()) {
            streams_high.terpri(var2);
            streams_high.write_string((SubLObject)module0120.$ic67$, var2, (SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED);
            return var2;
        }
        var3.resetMultipleValues();
        final SubLObject var4 = f8263();
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        streams_high.terpri(var2);
        streams_high.write_string((SubLObject)module0120.$ic68$, var2, (SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED);
        streams_high.write_string(module0051.f3552(var5), var2, (SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED);
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0120.NIL;
        var7 = var6.first();
        while (module0120.NIL != var6) {
            print_high.print(var7, var2);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var2;
    }
    
    public static SubLObject f8265() {
        return module0120.$g1472$.getGlobalValue();
    }
    
    public static SubLObject f8266() {
        if (module0120.NIL != Threads.valid_process_p(f8265())) {
            f8267();
        }
        f8268();
        return Threads.valid_process_p(f8265());
    }
    
    public static SubLObject f8267() {
        if (module0120.NIL != module0059.f4273(module0120.$g1473$.getGlobalValue())) {
            module0059.f4284(module0120.$g1477$.getGlobalValue(), module0120.$g1473$.getGlobalValue());
        }
        SubLObject var33;
        SubLObject var34;
        for (var33 = (SubLObject)module0120.TEN_INTEGER, var34 = (SubLObject)module0120.NIL, var34 = (SubLObject)module0120.ZERO_INTEGER; var34.numL(var33); var34 = Numbers.add(var34, (SubLObject)module0120.ONE_INTEGER)) {
            if (module0120.NIL != Threads.valid_process_p(f8265())) {
                Threads.sleep((SubLObject)module0120.ZERO_INTEGER);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0120.NIL == Threads.valid_process_p(f8265()));
    }
    
    public static SubLObject f8268() {
        Threads.make_process((SubLObject)module0120.$ic75$, (SubLObject)module0120.$ic76$);
        SubLObject var33;
        SubLObject var34;
        for (var33 = (SubLObject)module0120.TEN_INTEGER, var34 = (SubLObject)module0120.NIL, var34 = (SubLObject)module0120.ZERO_INTEGER; var34.numL(var33); var34 = Numbers.add(var34, (SubLObject)module0120.ONE_INTEGER)) {
            if (module0120.NIL == Threads.valid_process_p(f8265())) {
                Threads.sleep((SubLObject)module0120.ZERO_INTEGER);
            }
        }
        return Threads.valid_process_p(f8265());
    }
    
    public static SubLObject f8269() {
        if (module0120.NIL == Threads.valid_process_p(f8265())) {
            f8268();
        }
        return Threads.valid_process_p(f8265());
    }
    
    public static SubLObject f8270(final SubLObject var35) {
        return Equality.eq(var35, module0120.$g1477$.getGlobalValue());
    }
    
    public static SubLObject f8271() {
        final SubLObject var36 = module0067.f4880((SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED);
        final SubLObject var37 = module0059.f4283((SubLObject)module0120.$ic83$);
        SubLObject var38 = (SubLObject)module0120.T;
        SubLObject var39 = (SubLObject)module0120.NIL;
        module0120.$g1472$.setGlobalValue(Threads.current_process());
        module0120.$g1473$.setGlobalValue(var37);
        try {
            while (module0120.NIL == var39) {
                final SubLObject var40 = module0059.f4285(var37);
                if (module0120.NIL != var38) {
                    module0059.f4284(module0120.$g1478$.getGlobalValue(), var37);
                    var38 = (SubLObject)module0120.NIL;
                }
                if (module0120.$g1478$.getGlobalValue().eql(var40)) {
                    if (module0059.f4288(var37).isZero()) {
                        if (module0120.NIL == module0067.f4882(var36)) {
                            module0067.f4881(var36);
                        }
                    }
                    else {
                        Threads.sleep(module0120.$g1474$.getGlobalValue());
                    }
                    var38 = (SubLObject)module0120.T;
                }
                else if (module0120.NIL != f8270(var40)) {
                    var39 = (SubLObject)module0120.T;
                }
                else if (var40.isFixnum()) {
                    if (module0120.NIL != module0067.f4884(var36, var40, (SubLObject)module0120.UNPROVIDED)) {
                        continue;
                    }
                    module0067.f4886(var36, var40, (SubLObject)module0120.$ic84$);
                }
                else {
                    if (module0120.NIL == f8242(var40)) {
                        continue;
                    }
                    final SubLObject var41 = f8243(var40);
                    if (module0120.NIL != module0067.f4884(var36, var41, (SubLObject)module0120.UNPROVIDED)) {
                        module0067.f4887(var36, var41);
                    }
                    else if (module0120.NIL == Threads.valid_process_p(f8248(var40)) || module0120.NIL == f8272(var40)) {
                        module0067.f4886(var36, f8243(var40), (SubLObject)module0120.$ic84$);
                    }
                    else {
                        module0059.f4284(var40, var37);
                    }
                }
            }
        }
        finally {
            final SubLObject var42 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0120.T);
                if (module0120.$g1472$.getGlobalValue().eql(Threads.current_process())) {
                    module0120.$g1472$.setGlobalValue((SubLObject)module0120.NIL);
                }
                if (module0120.$g1473$.getGlobalValue().eql(var37)) {
                    module0120.$g1473$.setGlobalValue((SubLObject)module0120.NIL);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var42);
            }
        }
        return (SubLObject)module0120.NIL;
    }
    
    public static SubLObject f8272(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0120.$ic85$;
        SubLObject var23 = (SubLObject)module0120.NIL;
        try {
            var21.throwStack.push(module0120.$ic86$);
            final SubLObject var24 = Errors.$error_handler$.currentBinding(var21);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0120.$ic87$), var21);
                try {
                    var22 = module0035.sublisp_boolean(Functions.funcall(f8244(var20), f8245(var20)));
                }
                catch (Throwable var25) {
                    Errors.handleThrowable(var25, (SubLObject)module0120.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var24, var21);
            }
        }
        catch (Throwable var26) {
            var23 = Errors.handleThrowable(var26, (SubLObject)module0120.$ic86$);
        }
        finally {
            var21.throwStack.pop();
        }
        if (var22 == module0120.$ic85$) {
            var22 = (SubLObject)module0120.NIL;
        }
        if (module0120.NIL == var22) {
            SubLObject var46_47 = (SubLObject)module0120.NIL;
            try {
                var21.throwStack.push(module0120.$ic86$);
                final SubLObject var27 = Errors.$error_handler$.currentBinding(var21);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0120.$ic87$), var21);
                    try {
                        if (module0120.NIL != f8247(var20)) {
                            module0004.f80(f8248(var20), f8246(var20), f8245(var20));
                        }
                        else {
                            Functions.funcall(f8246(var20), f8245(var20));
                        }
                    }
                    catch (Throwable var28) {
                        Errors.handleThrowable(var28, (SubLObject)module0120.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var27, var21);
                }
            }
            catch (Throwable var29) {
                var46_47 = Errors.handleThrowable(var29, (SubLObject)module0120.$ic86$);
            }
            finally {
                var21.throwStack.pop();
            }
        }
        return module0035.sublisp_boolean(var22);
    }
    
    public static SubLObject f8273() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8240", "S#10340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8242", "S#10339", 1, 0, false);
        new $f8242$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8243", "S#10341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8244", "S#10342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8245", "S#10343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8246", "S#10344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8247", "S#10345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8248", "S#10346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8249", "S#10347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8250", "S#10348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8251", "S#10349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8252", "S#10350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8253", "S#10351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8254", "S#10352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8255", "S#10353", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8256", "S#10354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8257", "S#10355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8258", "S#10356", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8241", "S#10357", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8259", "SCHEDULE-GUARDIAN-REQUEST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8260", "GUARDIAN-REQUEST-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8261", "CANCEL-GUARDIAN-REQUEST", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0120", "f8262", "WITH-GUARDIAN-REQUEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8263", "ACTIVE-GUARDIAN-REQUESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8264", "S#10358", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8265", "S#10359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8266", "INITIALIZE-GUARDIAN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8267", "STOP-GUARDIAN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8268", "START-GUARDIAN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8269", "ENSURE-GUARDIAN-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8270", "S#10360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8271", "S#10361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0120", "f8272", "S#10362", 1, 0, false);
        return (SubLObject)module0120.NIL;
    }
    
    public static SubLObject f8274() {
        module0120.$g1472$ = SubLFiles.deflexical("S#10363", (SubLObject)((module0120.NIL != Symbols.boundp((SubLObject)module0120.$ic0$)) ? module0120.$g1472$.getGlobalValue() : module0120.NIL));
        module0120.$g1473$ = SubLFiles.deflexical("S#10364", (SubLObject)((module0120.NIL != Symbols.boundp((SubLObject)module0120.$ic1$)) ? module0120.$g1473$.getGlobalValue() : module0120.NIL));
        module0120.$g1474$ = SubLFiles.deflexical("S#10365", (SubLObject)module0120.TWO_INTEGER);
        module0120.$g1475$ = SubLFiles.deflexical("S#10366", (module0120.NIL != Symbols.boundp((SubLObject)module0120.$ic2$)) ? module0120.$g1475$.getGlobalValue() : module0057.f4173((SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED, (SubLObject)module0120.UNPROVIDED));
        module0120.$g1476$ = SubLFiles.defconstant("S#10367", (SubLObject)module0120.$ic3$);
        module0120.$g1477$ = SubLFiles.deflexical("S#10368", (module0120.NIL != Symbols.boundp((SubLObject)module0120.$ic71$)) ? module0120.$g1477$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0120.$ic72$));
        module0120.$g1478$ = SubLFiles.deflexical("S#10369", (module0120.NIL != Symbols.boundp((SubLObject)module0120.$ic81$)) ? module0120.$g1478$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0120.$ic82$));
        return (SubLObject)module0120.NIL;
    }
    
    public static SubLObject f8275() {
        module0003.f57((SubLObject)module0120.$ic0$);
        module0003.f57((SubLObject)module0120.$ic1$);
        module0003.f57((SubLObject)module0120.$ic2$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0120.$g1476$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0120.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0120.$ic11$);
        Structures.def_csetf((SubLObject)module0120.$ic12$, (SubLObject)module0120.$ic13$);
        Structures.def_csetf((SubLObject)module0120.$ic14$, (SubLObject)module0120.$ic15$);
        Structures.def_csetf((SubLObject)module0120.$ic16$, (SubLObject)module0120.$ic17$);
        Structures.def_csetf((SubLObject)module0120.$ic18$, (SubLObject)module0120.$ic19$);
        Structures.def_csetf((SubLObject)module0120.$ic20$, (SubLObject)module0120.$ic21$);
        Structures.def_csetf((SubLObject)module0120.$ic22$, (SubLObject)module0120.$ic23$);
        Equality.identity((SubLObject)module0120.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0120.$g1476$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0120.$ic35$));
        module0012.f368((SubLObject)module0120.$ic42$, (SubLObject)module0120.$ic43$, (SubLObject)module0120.$ic44$, (SubLObject)module0120.$ic45$, (SubLObject)module0120.$ic46$);
        module0012.f368((SubLObject)module0120.$ic47$, (SubLObject)module0120.$ic48$, (SubLObject)module0120.$ic49$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic50$);
        module0012.f368((SubLObject)module0120.$ic52$, (SubLObject)module0120.$ic48$, (SubLObject)module0120.$ic53$, (SubLObject)module0120.$ic54$, (SubLObject)module0120.$ic55$);
        module0012.f375((SubLObject)module0120.$ic63$, (SubLObject)module0120.$ic56$, (SubLObject)module0120.$ic64$);
        module0012.f368((SubLObject)module0120.$ic65$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic66$, (SubLObject)module0120.NIL, (SubLObject)module0120.NIL);
        module0012.f368((SubLObject)module0120.$ic69$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic70$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic50$);
        module0003.f57((SubLObject)module0120.$ic71$);
        module0012.f368((SubLObject)module0120.$ic73$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic74$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic50$);
        module0012.f368((SubLObject)module0120.$ic77$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic78$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic50$);
        module0012.f368((SubLObject)module0120.$ic79$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic80$, (SubLObject)module0120.NIL, (SubLObject)module0120.$ic50$);
        module0003.f57((SubLObject)module0120.$ic81$);
        return (SubLObject)module0120.NIL;
    }
    
    public void declareFunctions() {
        f8273();
    }
    
    public void initializeVariables() {
        f8274();
    }
    
    public void runTopLevelForms() {
        f8275();
    }
    
    static {
        me = (SubLFile)new module0120();
        module0120.$g1472$ = null;
        module0120.$g1473$ = null;
        module0120.$g1474$ = null;
        module0120.$g1475$ = null;
        module0120.$g1476$ = null;
        module0120.$g1477$ = null;
        module0120.$g1478$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10363", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10364", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#10366", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#10338", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#10339", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10370", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10371", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10372", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#104", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CHECKER-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PARAMETER"), (SubLObject)SubLObjectFactory.makeKeyword("NOTIFICATION-FN"), (SubLObject)SubLObjectFactory.makeKeyword("INTERRUPT-P"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10341", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10342", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10343", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10344", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10345", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10346", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10347", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10348", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10350", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10351", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10352", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#10357", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10340", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10339", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#10341", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#10347", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#10342", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#10348", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#10343", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#10349", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#10344", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#10350", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#10345", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#10351", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#10346", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#10352", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("ID");
        $ic25$ = SubLObjectFactory.makeKeyword("CHECKER-FN");
        $ic26$ = SubLObjectFactory.makeKeyword("PARAMETER");
        $ic27$ = SubLObjectFactory.makeKeyword("NOTIFICATION-FN");
        $ic28$ = SubLObjectFactory.makeKeyword("INTERRUPT-P");
        $ic29$ = SubLObjectFactory.makeKeyword("PROCESS");
        $ic30$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic31$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic32$ = SubLObjectFactory.makeSymbol("S#10353", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic34$ = SubLObjectFactory.makeKeyword("END");
        $ic35$ = SubLObjectFactory.makeSymbol("S#10355", "CYC");
        $ic36$ = SubLObjectFactory.makeString("#<GUARDIAN-REQUEST ~A: check ~A argument ~A notify ~A via ~A using ~A>");
        $ic37$ = SubLObjectFactory.makeString("INTERRUPT");
        $ic38$ = SubLObjectFactory.makeString("FUNCALL");
        $ic39$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic40$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic41$ = SubLObjectFactory.makeSymbol("VALID-PROCESS-P");
        $ic42$ = SubLObjectFactory.makeSymbol("SCHEDULE-GUARDIAN-REQUEST");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10370", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10371", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10372", "CYC"));
        $ic44$ = SubLObjectFactory.makeString("Schedule a guardian request. (funcall checker-fn parameter) will be called\n   until it returns NIL. \n   In this case, the requesting process is notified, either via FUNCALL or INTERRUPT-PROCESS-WITH-ARGS\n   and passed the parameter one last time; the INTERRUPT-P flag decides which one it is; FUNCALL is default.\n   @note use FUNCALL when the function invoked cannot or need not run in the process being notified;\n   for example, TERMINATE-ACTIVE-TASK-PROCESS already calls INTERRRUPT-PROCESS, and not all LISP implementation\n   actually handle that gracefully, so there FUNCALL is sufficient.\n   @return the ticked for the guardian request");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10370", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10371", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10372", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"));
        $ic47$ = SubLObjectFactory.makeSymbol("GUARDIAN-REQUEST-ID-P");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10373", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("Determine whether this is a proper guardian request id.");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic51$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic52$ = SubLObjectFactory.makeSymbol("CANCEL-GUARDIAN-REQUEST");
        $ic53$ = SubLObjectFactory.makeString("Abort a guardian request that is currently scheduled to be checked.\n   @return T");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10373", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10370", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10371", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic57$ = SubLObjectFactory.makeUninternedSymbol("US#1836006");
        $ic58$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-GUARDIAN-RUNNING"));
        $ic60$ = SubLObjectFactory.makeSymbol("CLET");
        $ic61$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic62$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic63$ = SubLObjectFactory.makeSymbol("WITH-GUARDIAN-REQUEST");
        $ic64$ = SubLObjectFactory.makeString("Setup a guardian request and cancel if necessary.");
        $ic65$ = SubLObjectFactory.makeSymbol("ACTIVE-GUARDIAN-REQUESTS");
        $ic66$ = SubLObjectFactory.makeString("The active guardian requests.\n   @return 0 the elements on the request queue\n   @return 1 the UnivTime Stamp of the contents");
        $ic67$ = SubLObjectFactory.makeString("Currrently no guardian active.");
        $ic68$ = SubLObjectFactory.makeString("Active Guardian Requests at ");
        $ic69$ = SubLObjectFactory.makeSymbol("INITIALIZE-GUARDIAN");
        $ic70$ = SubLObjectFactory.makeString("Starts the guardian unless it is running.");
        $ic71$ = SubLObjectFactory.makeSymbol("S#10368", "CYC");
        $ic72$ = SubLObjectFactory.makeString("Guardian Shutdown Marker");
        $ic73$ = SubLObjectFactory.makeSymbol("STOP-GUARDIAN");
        $ic74$ = SubLObjectFactory.makeString("Tell the guardian to shut itself down.");
        $ic75$ = SubLObjectFactory.makeString("Guardian Process");
        $ic76$ = SubLObjectFactory.makeSymbol("S#10361", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("START-GUARDIAN");
        $ic78$ = SubLObjectFactory.makeString("Launch the guardian process, potentially overwriting an existing guardian.");
        $ic79$ = SubLObjectFactory.makeSymbol("ENSURE-GUARDIAN-RUNNING");
        $ic80$ = SubLObjectFactory.makeString("Launch the guardian process if it is not currently running.");
        $ic81$ = SubLObjectFactory.makeSymbol("S#10369", "CYC");
        $ic82$ = SubLObjectFactory.makeString("Guardian Sleep Marker");
        $ic83$ = SubLObjectFactory.makeString("Connection Guardian Requests)");
        $ic84$ = SubLObjectFactory.makeKeyword("DELETE");
        $ic85$ = SubLObjectFactory.makeKeyword("CHECK-FAILED");
        $ic86$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic87$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    }
    
    public static final class $sX10338_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $checker_fn;
        public SubLObject $parameter;
        public SubLObject $notification_fn;
        public SubLObject $interrupt_p;
        public SubLObject $process;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10338_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$checker_fn = (SubLObject)CommonSymbols.NIL;
            this.$parameter = (SubLObject)CommonSymbols.NIL;
            this.$notification_fn = (SubLObject)CommonSymbols.NIL;
            this.$interrupt_p = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10338_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$checker_fn;
        }
        
        public SubLObject getField4() {
            return this.$parameter;
        }
        
        public SubLObject getField5() {
            return this.$notification_fn;
        }
        
        public SubLObject getField6() {
            return this.$interrupt_p;
        }
        
        public SubLObject getField7() {
            return this.$process;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$checker_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$parameter = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$notification_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$interrupt_p = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$process = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10338_native.class, module0120.$ic3$, module0120.$ic4$, module0120.$ic5$, module0120.$ic6$, new String[] { "$id", "$checker_fn", "$parameter", "$notification_fn", "$interrupt_p", "$process" }, module0120.$ic7$, module0120.$ic8$, module0120.$ic9$);
        }
    }
    
    public static final class $f8242$UnaryFunction extends UnaryFunction
    {
        public $f8242$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10339"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0120.f8242(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0120.class
	Total time: 199 ms
	
	Decompiled with Procyon 0.5.32.
*/