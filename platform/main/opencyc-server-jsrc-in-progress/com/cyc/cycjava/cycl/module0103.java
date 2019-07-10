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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0103 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0103";
    public static final String myFingerPrint = "cb1bb1a1b1dd98e615013a3e5a8ffde0dc04526edec449dc2972cfbcacf3fe84";
    public static SubLSymbol $g1341$;
    public static SubLSymbol $g1342$;
    public static SubLSymbol $g1343$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
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
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    
    public static SubLObject f7364(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        final SubLObject var4 = var3;
        if (var4.eql((SubLObject)$ic0$)) {
            return module0115.f7991(var1, var2);
        }
        if (var4.eql((SubLObject)$ic1$)) {
            return module0114.f7967(var1, var2);
        }
        return Errors.error((SubLObject)$ic2$, var3);
    }
    
    public static SubLObject f7365(final SubLObject var5, final SubLObject var6) {
        f7366(var5, var6, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7367(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX9280_native.class) ? T : NIL);
    }
    
    public static SubLObject f7368(final SubLObject var5) {
        assert NIL != f7367(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f7369(final SubLObject var5) {
        assert NIL != f7367(var5) : var5;
        return var5.getField3();
    }
    
    public static SubLObject f7370(final SubLObject var5) {
        assert NIL != f7367(var5) : var5;
        return var5.getField4();
    }
    
    public static SubLObject f7371(final SubLObject var5, final SubLObject var8) {
        assert NIL != f7367(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f7372(final SubLObject var5, final SubLObject var8) {
        assert NIL != f7367(var5) : var5;
        return var5.setField3(var8);
    }
    
    public static SubLObject f7373(final SubLObject var5, final SubLObject var8) {
        assert NIL != f7367(var5) : var5;
        return var5.setField4(var8);
    }
    
    public static SubLObject f7374(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX9280_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)NIL, var11 = var9; NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)$ic18$)) {
                f7371(var10, var13);
            }
            else if (var14.eql((SubLObject)$ic19$)) {
                f7372(var10, var13);
            }
            else if (var14.eql((SubLObject)$ic20$)) {
                f7373(var10, var13);
            }
            else {
                Errors.error((SubLObject)$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f7375(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic24$, (SubLObject)$ic18$, f7368(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic24$, (SubLObject)$ic19$, f7369(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic24$, (SubLObject)$ic20$, f7370(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)THREE_INTEGER);
        return var14;
    }
    
    public static SubLObject f7376(final SubLObject var14, final SubLObject var15) {
        return f7375(var14, var15);
    }
    
    public static SubLObject f7366(final SubLObject var16, final SubLObject var6, final SubLObject var17) {
        PrintLow.format(var6, (SubLObject)$ic27$, new SubLObject[] { f7377(var16), f7378(var16), f7379(var16) });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7380(final SubLObject var18, final SubLObject var19, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        final SubLObject var20 = f7374((SubLObject)UNPROVIDED);
        f7371(var20, var18);
        f7372(var20, var19);
        f7373(var20, var3);
        return var20;
    }
    
    public static SubLObject f7377(final SubLObject var20) {
        return f7368(var20);
    }
    
    public static SubLObject f7378(final SubLObject var20) {
        return f7369(var20);
    }
    
    public static SubLObject f7379(final SubLObject var20) {
        return f7370(var20);
    }
    
    public static SubLObject f7381(final SubLObject var5, final SubLObject var6) {
        f7382(var5, var6, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7383(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX9282_native.class) ? T : NIL);
    }
    
    public static SubLObject f7384(final SubLObject var5) {
        assert NIL != f7383(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f7385(final SubLObject var5) {
        assert NIL != f7383(var5) : var5;
        return var5.getField3();
    }
    
    public static SubLObject f7386(final SubLObject var5, final SubLObject var8) {
        assert NIL != f7383(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f7387(final SubLObject var5, final SubLObject var8) {
        assert NIL != f7383(var5) : var5;
        return var5.setField3(var8);
    }
    
    public static SubLObject f7388(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX9282_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)NIL, var11 = var9; NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)$ic41$)) {
                f7386(var10, var13);
            }
            else if (var14.eql((SubLObject)$ic42$)) {
                f7387(var10, var13);
            }
            else {
                Errors.error((SubLObject)$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f7389(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic22$, (SubLObject)$ic43$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic24$, (SubLObject)$ic41$, f7384(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic24$, (SubLObject)$ic42$, f7385(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic43$, (SubLObject)TWO_INTEGER);
        return var14;
    }
    
    public static SubLObject f7390(final SubLObject var14, final SubLObject var15) {
        return f7389(var14, var15);
    }
    
    public static SubLObject f7382(final SubLObject var16, final SubLObject var6, final SubLObject var17) {
        PrintLow.format(var6, (SubLObject)$ic45$, f7391(var16), (SubLObject)(f7392(var16).isStream() ? $ic46$ : $ic47$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7393(final SubLObject var20) {
        final SubLObject var21 = f7388((SubLObject)UNPROVIDED);
        f7386(var21, var20);
        f7387(var21, (SubLObject)NIL);
        return var21;
    }
    
    public static SubLObject f7391(final SubLObject var24) {
        return f7384(var24);
    }
    
    public static SubLObject f7392(final SubLObject var24) {
        return f7385(var24);
    }
    
    public static SubLObject f7394(final SubLObject var24) {
        SubLObject var25 = f7392(var24);
        if (NIL != var25) {
            return (SubLObject)NIL;
        }
        final SubLObject var26 = f7395(var24);
        final SubLObject var27 = f7396(var24);
        var25 = module0004.f83(var26, var27, (SubLObject)$ic48$);
        f7387(var24, var25);
        return (SubLObject)T;
    }
    
    public static SubLObject f7397(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = f7392(var24);
        if (NIL == var26) {
            return (SubLObject)NIL;
        }
        SubLObject var27 = (SubLObject)NIL;
        try {
            var25.throwStack.push($ic49$);
            final SubLObject var28 = Errors.$error_handler$.currentBinding(var25);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic50$), var25);
                try {
                    try {
                        try {
                            f7398(var24, (SubLObject)$ic51$);
                        }
                        finally {
                            final SubLObject var27_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                                streams_high.close(var26, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var27_28, var25);
                            }
                        }
                    }
                    finally {
                        final SubLObject var27_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                            f7387(var24, (SubLObject)NIL);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var27_29, var25);
                        }
                    }
                }
                catch (Throwable var29) {
                    Errors.handleThrowable(var29, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var28, var25);
            }
        }
        catch (Throwable var30) {
            var27 = Errors.handleThrowable(var30, (SubLObject)$ic49$);
        }
        finally {
            var25.throwStack.pop();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7399(final SubLObject var24) {
        return Types.streamp(f7392(var24));
    }
    
    public static SubLObject f7400(final SubLObject var24) {
        return (SubLObject)makeBoolean(!f7392(var24).isStream());
    }
    
    public static SubLObject f7395(final SubLObject var24) {
        return f7377(f7391(var24));
    }
    
    public static SubLObject f7396(final SubLObject var24) {
        return f7378(f7391(var24));
    }
    
    public static SubLObject f7401(final SubLObject var24) {
        return f7379(f7391(var24));
    }
    
    public static SubLObject f7402(final SubLObject var24) {
        assert NIL != f7383(var24) : var24;
        f7397(var24);
        f7394(var24);
        return var24;
    }
    
    public static SubLObject f7398(final SubLObject var24, final SubLObject var1) {
        final SubLObject var25 = f7392(var24);
        final SubLObject var26 = f7401(var24);
        return f7364(var1, var25, var26);
    }
    
    public static SubLObject f7403(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic52$);
        var36 = var35.first();
        final SubLObject var37;
        var35 = (var37 = var35.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic54$, var36)), ConsesLow.append(var37, (SubLObject)NIL));
    }
    
    public static SubLObject f7404() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return $g1343$.getDynamicValue(var25);
    }
    
    public static SubLObject f7405(final SubLObject var1) {
        return f7398(f7404(), var1);
    }
    
    public static SubLObject f7406(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic55$);
        var36 = var35.first();
        final SubLObject var37;
        var35 = (var37 = var35.rest());
        final SubLObject var38 = (SubLObject)$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, (SubLObject)ConsesLow.list((SubLObject)$ic57$, var36))), (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)ConsesLow.list((SubLObject)$ic60$, var38), (SubLObject)ConsesLow.listS((SubLObject)$ic61$, var38, ConsesLow.append(var37, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic62$, var38)));
    }
    
    public static SubLObject f7407() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7364", "S#9284", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7365", "S#9285", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7367", "S#9281", 1, 0, false);
        new $f7367$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7368", "S#9286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7369", "S#9287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7370", "S#9288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7371", "S#9289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7372", "S#9290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7373", "S#9291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7374", "S#9292", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7375", "S#9293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7376", "S#9294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7366", "S#9295", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7380", "S#9296", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7377", "S#9297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7378", "S#9298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7379", "S#9299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7381", "S#9300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7383", "S#9283", 1, 0, false);
        new $f7383$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7384", "S#9301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7385", "S#9302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7386", "S#9303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7387", "S#9304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7388", "S#9305", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7389", "S#9306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7390", "S#9307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7382", "S#9308", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7393", "S#9309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7391", "S#9310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7392", "S#9311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7394", "S#9312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7397", "S#9313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7399", "S#9314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7400", "S#9315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7395", "S#9316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7396", "S#9317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7401", "S#9318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7402", "S#9319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7398", "S#9320", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0103", "f7403", "S#9321");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7404", "S#9322", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0103", "f7405", "S#9323", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0103", "f7406", "S#9324");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7408() {
        $g1341$ = SubLFiles.defconstant("S#9325", (SubLObject)$ic3$);
        $g1342$ = SubLFiles.defconstant("S#9326", (SubLObject)$ic28$);
        $g1343$ = SubLFiles.defparameter("S#9327", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7409() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1341$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Equality.identity((SubLObject)$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1341$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1342$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Structures.def_csetf((SubLObject)$ic39$, (SubLObject)$ic40$);
        Equality.identity((SubLObject)$ic28$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1342$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic44$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7407();
    }
    
    public void initializeVariables() {
        f7408();
    }
    
    public void runTopLevelForms() {
        f7409();
    }
    
    static {
        me = (SubLFile)new module0103();
        $g1341$ = null;
        $g1342$ = null;
        $g1343$ = null;
        $ic0$ = makeKeyword("CFASL");
        $ic1$ = makeKeyword("CYC-API");
        $ic2$ = makeString("Unknown API protocol ~S");
        $ic3$ = makeSymbol("S#9280", "CYC");
        $ic4$ = makeSymbol("S#9281", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#688", "CYC"), (SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeSymbol("S#9328", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("MACHINE"), (SubLObject)makeKeyword("PORT"), (SubLObject)makeKeyword("PROTOCOL"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#9286", "CYC"), (SubLObject)makeSymbol("S#9287", "CYC"), (SubLObject)makeSymbol("S#9288", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#9289", "CYC"), (SubLObject)makeSymbol("S#9290", "CYC"), (SubLObject)makeSymbol("S#9291", "CYC"));
        $ic9$ = makeSymbol("S#9295", "CYC");
        $ic10$ = makeSymbol("S#9285", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#9281", "CYC"));
        $ic12$ = makeSymbol("S#9286", "CYC");
        $ic13$ = makeSymbol("S#9289", "CYC");
        $ic14$ = makeSymbol("S#9287", "CYC");
        $ic15$ = makeSymbol("S#9290", "CYC");
        $ic16$ = makeSymbol("S#9288", "CYC");
        $ic17$ = makeSymbol("S#9291", "CYC");
        $ic18$ = makeKeyword("MACHINE");
        $ic19$ = makeKeyword("PORT");
        $ic20$ = makeKeyword("PROTOCOL");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#9292", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#9294", "CYC");
        $ic27$ = makeString("<REMOTE IMAGE ~A ~A ~A>");
        $ic28$ = makeSymbol("S#9282", "CYC");
        $ic29$ = makeSymbol("S#9283", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#9329", "CYC"), (SubLObject)makeSymbol("S#9128", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("IMAGE"), (SubLObject)makeKeyword("CHANNEL"));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#9301", "CYC"), (SubLObject)makeSymbol("S#9302", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#9303", "CYC"), (SubLObject)makeSymbol("S#9304", "CYC"));
        $ic34$ = makeSymbol("S#9308", "CYC");
        $ic35$ = makeSymbol("S#9300", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#9283", "CYC"));
        $ic37$ = makeSymbol("S#9301", "CYC");
        $ic38$ = makeSymbol("S#9303", "CYC");
        $ic39$ = makeSymbol("S#9302", "CYC");
        $ic40$ = makeSymbol("S#9304", "CYC");
        $ic41$ = makeKeyword("IMAGE");
        $ic42$ = makeKeyword("CHANNEL");
        $ic43$ = makeSymbol("S#9305", "CYC");
        $ic44$ = makeSymbol("S#9307", "CYC");
        $ic45$ = makeString("<CONNECTION to ~A (~A)>");
        $ic46$ = makeString("open");
        $ic47$ = makeString("closed");
        $ic48$ = makeKeyword("PRIVATE");
        $ic49$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic50$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("API-QUIT"));
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#9136", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic53$ = makeSymbol("CLET");
        $ic54$ = makeSymbol("S#9327", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#9280", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic56$ = makeUninternedSymbol("US#7AFC06E");
        $ic57$ = makeSymbol("S#9309", "CYC");
        $ic58$ = makeSymbol("CUNWIND-PROTECT");
        $ic59$ = makeSymbol("PROGN");
        $ic60$ = makeSymbol("S#9312", "CYC");
        $ic61$ = makeSymbol("S#9321", "CYC");
        $ic62$ = makeSymbol("S#9313", "CYC");
    }
    
    public static final class $sX9280_native extends SubLStructNative
    {
        public SubLObject $machine;
        public SubLObject $port;
        public SubLObject $protocol;
        public static final SubLStructDeclNative structDecl;
        
        public $sX9280_native() {
            this.$machine = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$protocol = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9280_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$machine;
        }
        
        public SubLObject getField3() {
            return this.$port;
        }
        
        public SubLObject getField4() {
            return this.$protocol;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$machine = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$protocol = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9280_native.class, $ic3$, $ic4$, $ic5$, $ic6$, new String[] { "$machine", "$port", "$protocol" }, $ic7$, $ic8$, $ic9$);
        }
    }
    
    public static final class $f7367$UnaryFunction extends UnaryFunction
    {
        public $f7367$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9281"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f7367(var7);
        }
    }
    
    public static final class $sX9282_native extends SubLStructNative
    {
        public SubLObject $image;
        public SubLObject $channel;
        public static final SubLStructDeclNative structDecl;
        
        public $sX9282_native() {
            this.$image = (SubLObject)CommonSymbols.NIL;
            this.$channel = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9282_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$image;
        }
        
        public SubLObject getField3() {
            return this.$channel;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$image = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$channel = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9282_native.class, $ic28$, $ic29$, $ic30$, $ic31$, new String[] { "$image", "$channel" }, $ic32$, $ic33$, $ic34$);
        }
    }
    
    public static final class $f7383$UnaryFunction extends UnaryFunction
    {
        public $f7383$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9283"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f7383(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 139 ms
	
	Decompiled with Procyon 0.5.32.
*/