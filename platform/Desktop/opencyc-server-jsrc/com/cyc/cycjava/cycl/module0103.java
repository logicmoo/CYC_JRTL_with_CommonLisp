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
        if (var3 == module0103.UNPROVIDED) {
            var3 = (SubLObject)module0103.$ic0$;
        }
        final SubLObject var4 = var3;
        if (var4.eql((SubLObject)module0103.$ic0$)) {
            return module0115.f7991(var1, var2);
        }
        if (var4.eql((SubLObject)module0103.$ic1$)) {
            return module0114.f7967(var1, var2);
        }
        return Errors.error((SubLObject)module0103.$ic2$, var3);
    }
    
    public static SubLObject f7365(final SubLObject var5, final SubLObject var6) {
        f7366(var5, var6, (SubLObject)module0103.ZERO_INTEGER);
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7367(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX9280_native.class) ? module0103.T : module0103.NIL);
    }
    
    public static SubLObject f7368(final SubLObject var5) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f7369(final SubLObject var5) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.getField3();
    }
    
    public static SubLObject f7370(final SubLObject var5) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.getField4();
    }
    
    public static SubLObject f7371(final SubLObject var5, final SubLObject var8) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f7372(final SubLObject var5, final SubLObject var8) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.setField3(var8);
    }
    
    public static SubLObject f7373(final SubLObject var5, final SubLObject var8) {
        assert module0103.NIL != f7367(var5) : var5;
        return var5.setField4(var8);
    }
    
    public static SubLObject f7374(SubLObject var9) {
        if (var9 == module0103.UNPROVIDED) {
            var9 = (SubLObject)module0103.NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX9280_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)module0103.NIL, var11 = var9; module0103.NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)module0103.$ic18$)) {
                f7371(var10, var13);
            }
            else if (var14.eql((SubLObject)module0103.$ic19$)) {
                f7372(var10, var13);
            }
            else if (var14.eql((SubLObject)module0103.$ic20$)) {
                f7373(var10, var13);
            }
            else {
                Errors.error((SubLObject)module0103.$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f7375(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic22$, (SubLObject)module0103.$ic23$, (SubLObject)module0103.THREE_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic24$, (SubLObject)module0103.$ic18$, f7368(var14));
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic24$, (SubLObject)module0103.$ic19$, f7369(var14));
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic24$, (SubLObject)module0103.$ic20$, f7370(var14));
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic25$, (SubLObject)module0103.$ic23$, (SubLObject)module0103.THREE_INTEGER);
        return var14;
    }
    
    public static SubLObject f7376(final SubLObject var14, final SubLObject var15) {
        return f7375(var14, var15);
    }
    
    public static SubLObject f7366(final SubLObject var16, final SubLObject var6, final SubLObject var17) {
        PrintLow.format(var6, (SubLObject)module0103.$ic27$, new SubLObject[] { f7377(var16), f7378(var16), f7379(var16) });
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7380(final SubLObject var18, final SubLObject var19, SubLObject var3) {
        if (var3 == module0103.UNPROVIDED) {
            var3 = (SubLObject)module0103.$ic0$;
        }
        final SubLObject var20 = f7374((SubLObject)module0103.UNPROVIDED);
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
        f7382(var5, var6, (SubLObject)module0103.ZERO_INTEGER);
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7383(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX9282_native.class) ? module0103.T : module0103.NIL);
    }
    
    public static SubLObject f7384(final SubLObject var5) {
        assert module0103.NIL != f7383(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f7385(final SubLObject var5) {
        assert module0103.NIL != f7383(var5) : var5;
        return var5.getField3();
    }
    
    public static SubLObject f7386(final SubLObject var5, final SubLObject var8) {
        assert module0103.NIL != f7383(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f7387(final SubLObject var5, final SubLObject var8) {
        assert module0103.NIL != f7383(var5) : var5;
        return var5.setField3(var8);
    }
    
    public static SubLObject f7388(SubLObject var9) {
        if (var9 == module0103.UNPROVIDED) {
            var9 = (SubLObject)module0103.NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX9282_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)module0103.NIL, var11 = var9; module0103.NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)module0103.$ic41$)) {
                f7386(var10, var13);
            }
            else if (var14.eql((SubLObject)module0103.$ic42$)) {
                f7387(var10, var13);
            }
            else {
                Errors.error((SubLObject)module0103.$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f7389(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic22$, (SubLObject)module0103.$ic43$, (SubLObject)module0103.TWO_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic24$, (SubLObject)module0103.$ic41$, f7384(var14));
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic24$, (SubLObject)module0103.$ic42$, f7385(var14));
        Functions.funcall(var15, var14, (SubLObject)module0103.$ic25$, (SubLObject)module0103.$ic43$, (SubLObject)module0103.TWO_INTEGER);
        return var14;
    }
    
    public static SubLObject f7390(final SubLObject var14, final SubLObject var15) {
        return f7389(var14, var15);
    }
    
    public static SubLObject f7382(final SubLObject var16, final SubLObject var6, final SubLObject var17) {
        PrintLow.format(var6, (SubLObject)module0103.$ic45$, f7391(var16), (SubLObject)(f7392(var16).isStream() ? module0103.$ic46$ : module0103.$ic47$));
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7393(final SubLObject var20) {
        final SubLObject var21 = f7388((SubLObject)module0103.UNPROVIDED);
        f7386(var21, var20);
        f7387(var21, (SubLObject)module0103.NIL);
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
        if (module0103.NIL != var25) {
            return (SubLObject)module0103.NIL;
        }
        final SubLObject var26 = f7395(var24);
        final SubLObject var27 = f7396(var24);
        var25 = module0004.f83(var26, var27, (SubLObject)module0103.$ic48$);
        f7387(var24, var25);
        return (SubLObject)module0103.T;
    }
    
    public static SubLObject f7397(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = f7392(var24);
        if (module0103.NIL == var26) {
            return (SubLObject)module0103.NIL;
        }
        SubLObject var27 = (SubLObject)module0103.NIL;
        try {
            var25.throwStack.push(module0103.$ic49$);
            final SubLObject var28 = Errors.$error_handler$.currentBinding(var25);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0103.$ic50$), var25);
                try {
                    try {
                        try {
                            f7398(var24, (SubLObject)module0103.$ic51$);
                        }
                        finally {
                            final SubLObject var27_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0103.T, var25);
                                streams_high.close(var26, (SubLObject)module0103.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var27_28, var25);
                            }
                        }
                    }
                    finally {
                        final SubLObject var27_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0103.T, var25);
                            f7387(var24, (SubLObject)module0103.NIL);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var27_29, var25);
                        }
                    }
                }
                catch (Throwable var29) {
                    Errors.handleThrowable(var29, (SubLObject)module0103.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var28, var25);
            }
        }
        catch (Throwable var30) {
            var27 = Errors.handleThrowable(var30, (SubLObject)module0103.$ic49$);
        }
        finally {
            var25.throwStack.pop();
        }
        return (SubLObject)module0103.T;
    }
    
    public static SubLObject f7399(final SubLObject var24) {
        return Types.streamp(f7392(var24));
    }
    
    public static SubLObject f7400(final SubLObject var24) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!f7392(var24).isStream());
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
        assert module0103.NIL != f7383(var24) : var24;
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
        SubLObject var36 = (SubLObject)module0103.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0103.$ic52$);
        var36 = var35.first();
        final SubLObject var37;
        var35 = (var37 = var35.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0103.$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0103.$ic54$, var36)), ConsesLow.append(var37, (SubLObject)module0103.NIL));
    }
    
    public static SubLObject f7404() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return module0103.$g1343$.getDynamicValue(var25);
    }
    
    public static SubLObject f7405(final SubLObject var1) {
        return f7398(f7404(), var1);
    }
    
    public static SubLObject f7406(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)module0103.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0103.$ic55$);
        var36 = var35.first();
        final SubLObject var37;
        var35 = (var37 = var35.rest());
        final SubLObject var38 = (SubLObject)module0103.$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)module0103.$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, (SubLObject)ConsesLow.list((SubLObject)module0103.$ic57$, var36))), (SubLObject)ConsesLow.list((SubLObject)module0103.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0103.$ic59$, (SubLObject)ConsesLow.list((SubLObject)module0103.$ic60$, var38), (SubLObject)ConsesLow.listS((SubLObject)module0103.$ic61$, var38, ConsesLow.append(var37, (SubLObject)module0103.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0103.$ic62$, var38)));
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
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7408() {
        module0103.$g1341$ = SubLFiles.defconstant("S#9325", (SubLObject)module0103.$ic3$);
        module0103.$g1342$ = SubLFiles.defconstant("S#9326", (SubLObject)module0103.$ic28$);
        module0103.$g1343$ = SubLFiles.defparameter("S#9327", (SubLObject)module0103.NIL);
        return (SubLObject)module0103.NIL;
    }
    
    public static SubLObject f7409() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0103.$g1341$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0103.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0103.$ic11$);
        Structures.def_csetf((SubLObject)module0103.$ic12$, (SubLObject)module0103.$ic13$);
        Structures.def_csetf((SubLObject)module0103.$ic14$, (SubLObject)module0103.$ic15$);
        Structures.def_csetf((SubLObject)module0103.$ic16$, (SubLObject)module0103.$ic17$);
        Equality.identity((SubLObject)module0103.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0103.$g1341$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0103.$ic26$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0103.$g1342$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0103.$ic35$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0103.$ic36$);
        Structures.def_csetf((SubLObject)module0103.$ic37$, (SubLObject)module0103.$ic38$);
        Structures.def_csetf((SubLObject)module0103.$ic39$, (SubLObject)module0103.$ic40$);
        Equality.identity((SubLObject)module0103.$ic28$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0103.$g1342$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0103.$ic44$));
        return (SubLObject)module0103.NIL;
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
        module0103.$g1341$ = null;
        module0103.$g1342$ = null;
        module0103.$g1343$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic1$ = SubLObjectFactory.makeKeyword("CYC-API");
        $ic2$ = SubLObjectFactory.makeString("Unknown API protocol ~S");
        $ic3$ = SubLObjectFactory.makeSymbol("S#9280", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#9281", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9328", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9286", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9287", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9288", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9289", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9290", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9291", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#9295", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#9285", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9281", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#9286", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#9289", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#9287", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#9290", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#9288", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#9291", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("MACHINE");
        $ic19$ = SubLObjectFactory.makeKeyword("PORT");
        $ic20$ = SubLObjectFactory.makeKeyword("PROTOCOL");
        $ic21$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic23$ = SubLObjectFactory.makeSymbol("S#9292", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic25$ = SubLObjectFactory.makeKeyword("END");
        $ic26$ = SubLObjectFactory.makeSymbol("S#9294", "CYC");
        $ic27$ = SubLObjectFactory.makeString("<REMOTE IMAGE ~A ~A ~A>");
        $ic28$ = SubLObjectFactory.makeSymbol("S#9282", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#9283", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9329", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9128", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CHANNEL"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9301", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9302", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9303", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9304", "CYC"));
        $ic34$ = SubLObjectFactory.makeSymbol("S#9308", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#9300", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9283", "CYC"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#9301", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#9303", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#9302", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#9304", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("IMAGE");
        $ic42$ = SubLObjectFactory.makeKeyword("CHANNEL");
        $ic43$ = SubLObjectFactory.makeSymbol("S#9305", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#9307", "CYC");
        $ic45$ = SubLObjectFactory.makeString("<CONNECTION to ~A (~A)>");
        $ic46$ = SubLObjectFactory.makeString("open");
        $ic47$ = SubLObjectFactory.makeString("closed");
        $ic48$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic49$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic50$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("API-QUIT"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic53$ = SubLObjectFactory.makeSymbol("CLET");
        $ic54$ = SubLObjectFactory.makeSymbol("S#9327", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9280", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#7AFC06E");
        $ic57$ = SubLObjectFactory.makeSymbol("S#9309", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic59$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic60$ = SubLObjectFactory.makeSymbol("S#9312", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#9321", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#9313", "CYC");
    }
    
    public static final class $sX9280_native extends SubLStructNative
    {
        public SubLObject $machine;
        public SubLObject $port;
        public SubLObject $protocol;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX9280_native.class, module0103.$ic3$, module0103.$ic4$, module0103.$ic5$, module0103.$ic6$, new String[] { "$machine", "$port", "$protocol" }, module0103.$ic7$, module0103.$ic8$, module0103.$ic9$);
        }
    }
    
    public static final class $f7367$UnaryFunction extends UnaryFunction
    {
        public $f7367$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9281"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0103.f7367(var7);
        }
    }
    
    public static final class $sX9282_native extends SubLStructNative
    {
        public SubLObject $image;
        public SubLObject $channel;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX9282_native.class, module0103.$ic28$, module0103.$ic29$, module0103.$ic30$, module0103.$ic31$, new String[] { "$image", "$channel" }, module0103.$ic32$, module0103.$ic33$, module0103.$ic34$);
        }
    }
    
    public static final class $f7383$UnaryFunction extends UnaryFunction
    {
        public $f7383$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9283"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0103.f7383(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0103.class
	Total time: 139 ms
	
	Decompiled with Procyon 0.5.32.
*/