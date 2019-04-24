package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0803 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0803";
    public static final String myFingerPrint = "16f88bbc905ab62fb9dc7a2ef2aa82abc0a5abc4c2ae3c9beb915e502f8ba4de";
    public static SubLSymbol $g6392$;
    public static SubLSymbol $g6393$;
    private static SubLSymbol $g6394$;
    private static SubLSymbol $g6395$;
    private static SubLSymbol $g6396$;
    private static SubLSymbol $g6397$;
    private static SubLSymbol $g6398$;
    private static SubLSymbol $g6399$;
    private static SubLSymbol $g6400$;
    private static SubLSymbol $g6401$;
    public static SubLSymbol $g6402$;
    private static final SubLString $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
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
    private static final SubLString $ic37$;
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
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLFloat $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLInteger $ic55$;
    private static final SubLSymbol $ic56$;
    
    
    public static SubLObject f51206() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (module0803.NIL != module0803.$g6394$.getDynamicValue(var1)) ? module0803.$g6394$.getDynamicValue(var1) : module0803.$g6392$.getDynamicValue(var1);
    }
    
    public static SubLObject f51207() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (module0803.NIL != module0803.$g6395$.getDynamicValue(var1)) ? module0803.$g6395$.getDynamicValue(var1) : module0803.$g6393$.getDynamicValue(var1);
    }
    
    public static SubLObject f51208(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0803.$ic2$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0803.NIL;
        SubLObject var8 = (SubLObject)module0803.NIL;
        SubLObject var9 = (SubLObject)module0803.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0803.$ic2$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0803.$ic2$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0803.$ic2$);
        var9 = var5.first();
        var5 = var5.rest();
        final SubLObject var10 = var5.isCons() ? var5.first() : f51206();
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0803.$ic2$);
        var5 = var5.rest();
        final SubLObject var11 = var5.isCons() ? var5.first() : f51207();
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0803.$ic2$);
        var5 = var5.rest();
        if (module0803.NIL == var5) {
            final SubLObject var12;
            var5 = (var12 = var6);
            return (SubLObject)ConsesLow.list((SubLObject)module0803.$ic3$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)module0803.$ic4$, (SubLObject)ConsesLow.listS((SubLObject)module0803.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0803.$ic6$, var7, (SubLObject)ConsesLow.list((SubLObject)module0803.$ic7$, var10, var11, var8, var9)), ConsesLow.append(var12, (SubLObject)module0803.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0803.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0803.$ic9$, var7), (SubLObject)ConsesLow.list((SubLObject)module0803.$ic10$, var7))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0803.$ic2$);
        return (SubLObject)module0803.NIL;
    }
    
    public static SubLObject f51209(final SubLObject var13, final SubLObject var14) {
        f51210(var13, var14, (SubLObject)module0803.ZERO_INTEGER);
        return (SubLObject)module0803.NIL;
    }
    
    public static SubLObject f51211(final SubLObject var13) {
        return (SubLObject)((var13.getClass() == $sX55793_native.class) ? module0803.T : module0803.NIL);
    }
    
    public static SubLObject f51212(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField2();
    }
    
    public static SubLObject f51213(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField3();
    }
    
    public static SubLObject f51214(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField4();
    }
    
    public static SubLObject f51215(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField5();
    }
    
    public static SubLObject f51216(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField6();
    }
    
    public static SubLObject f51217(final SubLObject var13) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.getField7();
    }
    
    public static SubLObject f51218(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField2(var16);
    }
    
    public static SubLObject f51219(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField3(var16);
    }
    
    public static SubLObject f51220(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField4(var16);
    }
    
    public static SubLObject f51221(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField5(var16);
    }
    
    public static SubLObject f51222(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField6(var16);
    }
    
    public static SubLObject f51223(final SubLObject var13, final SubLObject var16) {
        assert module0803.NIL != f51211(var13) : var13;
        return var13.setField7(var16);
    }
    
    public static SubLObject f51224(SubLObject var17) {
        if (var17 == module0803.UNPROVIDED) {
            var17 = (SubLObject)module0803.NIL;
        }
        final SubLObject var18 = (SubLObject)new $sX55793_native();
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        for (var19 = (SubLObject)module0803.NIL, var19 = var17; module0803.NIL != var19; var19 = conses_high.cddr(var19)) {
            var20 = var19.first();
            var21 = conses_high.cadr(var19);
            var22 = var20;
            if (var22.eql((SubLObject)module0803.$ic31$)) {
                f51218(var18, var21);
            }
            else if (var22.eql((SubLObject)module0803.$ic32$)) {
                f51219(var18, var21);
            }
            else if (var22.eql((SubLObject)module0803.$ic33$)) {
                f51220(var18, var21);
            }
            else if (var22.eql((SubLObject)module0803.$ic34$)) {
                f51221(var18, var21);
            }
            else if (var22.eql((SubLObject)module0803.$ic35$)) {
                f51222(var18, var21);
            }
            else if (var22.eql((SubLObject)module0803.$ic36$)) {
                f51223(var18, var21);
            }
            else {
                Errors.error((SubLObject)module0803.$ic37$, var20);
            }
        }
        return var18;
    }
    
    public static SubLObject f51225(final SubLObject var23, final SubLObject var24) {
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic38$, (SubLObject)module0803.$ic39$, (SubLObject)module0803.SIX_INTEGER);
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic31$, f51212(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic32$, f51213(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic33$, f51214(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic34$, f51215(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic35$, f51216(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic40$, (SubLObject)module0803.$ic36$, f51217(var23));
        Functions.funcall(var24, var23, (SubLObject)module0803.$ic41$, (SubLObject)module0803.$ic39$, (SubLObject)module0803.SIX_INTEGER);
        return var23;
    }
    
    public static SubLObject f51226(final SubLObject var23, final SubLObject var24) {
        return f51225(var23, var24);
    }
    
    public static SubLObject f51227(final SubLObject var10, final SubLObject var11, final SubLObject var8, final SubLObject var25, SubLObject var26) {
        if (var26 == module0803.UNPROVIDED) {
            var26 = (SubLObject)module0803.NIL;
        }
        assert module0803.NIL != Types.stringp(var10) : var10;
        assert module0803.NIL != module0004.f105(var11) : var11;
        assert module0803.NIL != Types.stringp(var8) : var8;
        assert module0803.NIL != Types.keywordp(var25) : var25;
        assert module0803.NIL != Types.booleanp(var26) : var26;
        final SubLObject var27 = f51224((SubLObject)module0803.UNPROVIDED);
        SubLObject var28 = (SubLObject)module0803.NIL;
        if (var25.eql((SubLObject)module0803.$ic47$)) {
            var28 = (SubLObject)module0803.ZERO_INTEGER;
        }
        else if (var25.eql((SubLObject)module0803.$ic48$)) {
            var28 = (SubLObject)module0803.ONE_INTEGER;
        }
        f51218(var27, var10);
        f51219(var27, var11);
        f51220(var27, module0004.f83(var10, var11, (SubLObject)module0803.$ic49$));
        f51221(var27, var25);
        f51222(var27, var8);
        f51223(var27, var26);
        f51228(var27, var8, var28);
        return var27;
    }
    
    public static SubLObject f51229(final SubLObject var7) {
        assert module0803.NIL != f51211(var7) : var7;
        return streams_high.close(f51214(var7), (SubLObject)module0803.UNPROVIDED);
    }
    
    public static SubLObject f51210(final SubLObject var7, final SubLObject var14, final SubLObject var28) {
        streams_high.write_string((SubLObject)module0803.$ic50$, var14, (SubLObject)module0803.UNPROVIDED, (SubLObject)module0803.UNPROVIDED);
        streams_high.write_string(f51212(var7), var14, (SubLObject)module0803.UNPROVIDED, (SubLObject)module0803.UNPROVIDED);
        streams_high.write_string((SubLObject)module0803.$ic51$, var14, (SubLObject)module0803.UNPROVIDED, (SubLObject)module0803.UNPROVIDED);
        print_high.princ(f51213(var7), var14);
        streams_high.write_string((SubLObject)module0803.$ic52$, var14, (SubLObject)module0803.UNPROVIDED, (SubLObject)module0803.UNPROVIDED);
        return var7;
    }
    
    public static SubLObject f51228(final SubLObject var7, final SubLObject var29, final SubLObject var25) {
        return f51230(var7, module0803.$g6396$.getGlobalValue(), (SubLObject)ConsesLow.list(var29, var25));
    }
    
    public static SubLObject f51231(final SubLObject var7, SubLObject var26) {
        if (var26 == module0803.UNPROVIDED) {
            var26 = (SubLObject)module0803.NIL;
        }
        assert module0803.NIL != f51211(var7) : var7;
        assert module0803.NIL != Types.booleanp(var26) : var26;
        return f51230(var7, module0803.$g6401$.getGlobalValue(), (SubLObject)ConsesLow.list(var26));
    }
    
    public static SubLObject f51232(final SubLObject var7) {
        assert module0803.NIL != f51211(var7) : var7;
        return f51230(var7, module0803.$g6400$.getGlobalValue(), (SubLObject)module0803.NIL);
    }
    
    public static SubLObject f51233() {
        return (SubLObject)module0803.$ic53$;
    }
    
    public static SubLObject f51234(final SubLObject var7, final SubLObject var30, final SubLObject var31, final SubLObject var32, final SubLObject var33, final SubLObject var34, SubLObject var35, SubLObject var36) {
        if (var35 == module0803.UNPROVIDED) {
            var35 = f51233();
        }
        if (var36 == module0803.UNPROVIDED) {
            var36 = (SubLObject)module0803.NIL;
        }
        assert module0803.NIL != f51211(var7) : var7;
        assert module0803.NIL != Types.stringp(var30) : var30;
        assert module0803.NIL != Types.stringp(var31) : var31;
        assert module0803.NIL != Types.stringp(var32) : var32;
        assert module0803.NIL != Types.stringp(var33) : var33;
        assert module0803.NIL != Types.stringp(var34) : var34;
        assert module0803.NIL != module0048.f3293(var35) : var35;
        if (module0803.NIL != var36 && !module0803.areAssertionsDisabledFor(me) && module0803.NIL == Types.stringp(var36)) {
            throw new AssertionError(var36);
        }
        SubLObject var37 = (SubLObject)module0803.NIL;
        f51231(var7, f51217(var7));
        SubLObject var38 = (SubLObject)ConsesLow.list(var30, var31, var32, var33, var34, var35);
        if (module0803.NIL != var36) {
            var38 = ConsesLow.append(var38, (SubLObject)ConsesLow.list(var36));
        }
        try {
            var37 = f51230(var7, module0803.$g6397$.getGlobalValue(), var38);
        }
        finally {
            final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0803.T);
                if (module0803.NIL != f51217(var7)) {
                    f51223(var7, (SubLObject)module0803.NIL);
                }
                f51232(var7);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var39);
            }
        }
        return var37;
    }
    
    public static SubLObject f51235(final SubLObject var7) {
        assert module0803.NIL != f51211(var7) : var7;
        f51231(var7, (SubLObject)module0803.UNPROVIDED);
        final SubLObject var8 = f51230(var7, module0803.$g6399$.getGlobalValue(), (SubLObject)module0803.NIL);
        f51232(var7);
        return var8;
    }
    
    public static SubLObject f51236(final SubLObject var7, final SubLObject var41, SubLObject var42) {
        if (var42 == module0803.UNPROVIDED) {
            var42 = (SubLObject)module0803.$ic55$;
        }
        assert module0803.NIL != f51211(var7) : var7;
        assert module0803.NIL != Types.stringp(var41) : var41;
        assert module0803.NIL != module0004.f106(var42) : var42;
        return f51230(var7, module0803.$g6398$.getGlobalValue(), (SubLObject)ConsesLow.list(var41, var42));
    }
    
    public static SubLObject f51237(final SubLObject var7, final SubLObject var43, final SubLObject var44) {
        module0021.f1038((SubLObject)ConsesLow.cons(var43, var44), f51214(var7));
        streams_high.force_output(f51214(var7));
        return (SubLObject)module0803.NIL;
    }
    
    public static SubLObject f51238(final SubLObject var7) {
        final SubLObject var8 = module0021.f1060(f51214(var7), (SubLObject)module0803.UNPROVIDED, (SubLObject)module0803.UNPROVIDED);
        return f51239(var8);
    }
    
    public static SubLObject f51230(final SubLObject var7, final SubLObject var43, final SubLObject var44) {
        f51237(var7, var43, var44);
        return f51238(var7);
    }
    
    public static SubLObject f51239(final SubLObject var45) {
        final SubLObject var46 = var45.first();
        return var46.isNegative() ? Errors.error(var45.rest()) : var45.rest();
    }
    
    public static SubLObject f51240() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51206", "S#55795", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51207", "S#55796", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0803", "f51208", "S#55797");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51209", "S#55798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51211", "S#55794", 1, 0, false);
        new $f51211$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51212", "S#55799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51213", "S#55800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51214", "S#55801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51215", "S#55802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51216", "S#55803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51217", "S#55804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51218", "S#55805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51219", "S#55806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51220", "S#55807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51221", "S#55808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51222", "S#55809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51223", "S#55810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51224", "S#55811", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51225", "S#55812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51226", "S#55813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51227", "S#55814", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51229", "S#55815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51210", "S#55816", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51228", "S#55817", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51231", "S#55818", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51232", "S#55819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51233", "S#55820", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51234", "S#55821", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51235", "S#55822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51236", "S#55823", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51237", "S#55824", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51238", "S#55825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51230", "S#55826", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0803", "f51239", "S#55827", 1, 0, false);
        return (SubLObject)module0803.NIL;
    }
    
    public static SubLObject f51241() {
        module0803.$g6392$ = SubLFiles.defparameter("S#55828", (SubLObject)module0803.$ic0$);
        module0803.$g6393$ = SubLFiles.defparameter("S#55829", (SubLObject)module0803.$ic1$);
        module0803.$g6394$ = SubLFiles.defparameter("S#55830", (SubLObject)module0803.NIL);
        module0803.$g6395$ = SubLFiles.defparameter("S#55831", (SubLObject)module0803.NIL);
        module0803.$g6396$ = SubLFiles.deflexical("S#55832", (SubLObject)module0803.ZERO_INTEGER);
        module0803.$g6397$ = SubLFiles.deflexical("S#55833", (SubLObject)module0803.ONE_INTEGER);
        module0803.$g6398$ = SubLFiles.deflexical("S#55834", (SubLObject)module0803.TWO_INTEGER);
        module0803.$g6399$ = SubLFiles.deflexical("S#55835", (SubLObject)module0803.THREE_INTEGER);
        module0803.$g6400$ = SubLFiles.deflexical("S#55836", (SubLObject)module0803.FOUR_INTEGER);
        module0803.$g6401$ = SubLFiles.deflexical("S#55837", (SubLObject)module0803.FIVE_INTEGER);
        module0803.$g6402$ = SubLFiles.defconstant("S#55838", (SubLObject)module0803.$ic11$);
        return (SubLObject)module0803.NIL;
    }
    
    public static SubLObject f51242() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0803.$g6402$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0803.$ic17$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0803.$ic18$);
        Structures.def_csetf((SubLObject)module0803.$ic19$, (SubLObject)module0803.$ic20$);
        Structures.def_csetf((SubLObject)module0803.$ic21$, (SubLObject)module0803.$ic22$);
        Structures.def_csetf((SubLObject)module0803.$ic23$, (SubLObject)module0803.$ic24$);
        Structures.def_csetf((SubLObject)module0803.$ic25$, (SubLObject)module0803.$ic26$);
        Structures.def_csetf((SubLObject)module0803.$ic27$, (SubLObject)module0803.$ic28$);
        Structures.def_csetf((SubLObject)module0803.$ic29$, (SubLObject)module0803.$ic30$);
        Equality.identity((SubLObject)module0803.$ic11$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0803.$g6402$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0803.$ic42$));
        return (SubLObject)module0803.NIL;
    }
    
    public void declareFunctions() {
        f51240();
    }
    
    public void initializeVariables() {
        f51241();
    }
    
    public void runTopLevelForms() {
        f51242();
    }
    
    static {
        me = (SubLFile)new module0803();
        module0803.$g6392$ = null;
        module0803.$g6393$ = null;
        module0803.$g6394$ = null;
        module0803.$g6395$ = null;
        module0803.$g6396$ = null;
        module0803.$g6397$ = null;
        module0803.$g6398$ = null;
        module0803.$g6399$ = null;
        module0803.$g6400$ = null;
        module0803.$g6401$ = null;
        module0803.$g6402$ = null;
        $ic0$ = SubLObjectFactory.makeString("semanticsearch");
        $ic1$ = SubLObjectFactory.makeInteger(1928);
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55839", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55795", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55796", "CYC")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("CLET");
        $ic4$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic5$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic6$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic7$ = SubLObjectFactory.makeSymbol("S#55814", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic9$ = SubLObjectFactory.makeSymbol("S#55794", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#55815", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#55793", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55840", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55841", "CYC"));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeKeyword("SESSION-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("OVERWRITE"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55799", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55800", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55801", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55802", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55803", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55804", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55805", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55806", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55808", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55809", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55810", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#55816", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#55798", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#55794", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#55799", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#55805", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#55800", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#55806", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#55801", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#55807", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#55802", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#55808", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#55803", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#55809", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#55804", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#55810", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("HOST");
        $ic32$ = SubLObjectFactory.makeKeyword("PORT");
        $ic33$ = SubLObjectFactory.makeKeyword("CONNECTION");
        $ic34$ = SubLObjectFactory.makeKeyword("SESSION-TYPE");
        $ic35$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic36$ = SubLObjectFactory.makeKeyword("OVERWRITE");
        $ic37$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic38$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic39$ = SubLObjectFactory.makeSymbol("S#55811", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic41$ = SubLObjectFactory.makeKeyword("END");
        $ic42$ = SubLObjectFactory.makeSymbol("S#55813", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic44$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic45$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic46$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic47$ = SubLObjectFactory.makeKeyword("CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic49$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic50$ = SubLObjectFactory.makeString("#<LUCENE-SESSION ");
        $ic51$ = SubLObjectFactory.makeString(":");
        $ic52$ = SubLObjectFactory.makeString(">");
        $ic53$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic54$ = SubLObjectFactory.makeSymbol("S#4689", "CYC");
        $ic55$ = SubLObjectFactory.makeInteger(50);
        $ic56$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
    }
    
    public static final class $sX55793_native extends SubLStructNative
    {
        public SubLObject $host;
        public SubLObject $port;
        public SubLObject $connection;
        public SubLObject $session_type;
        public SubLObject $index;
        public SubLObject $overwrite;
        private static final SubLStructDeclNative structDecl;
        
        public $sX55793_native() {
            this.$host = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$connection = (SubLObject)CommonSymbols.NIL;
            this.$session_type = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$overwrite = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX55793_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$host;
        }
        
        public SubLObject getField3() {
            return this.$port;
        }
        
        public SubLObject getField4() {
            return this.$connection;
        }
        
        public SubLObject getField5() {
            return this.$session_type;
        }
        
        public SubLObject getField6() {
            return this.$index;
        }
        
        public SubLObject getField7() {
            return this.$overwrite;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$host = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$connection = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$session_type = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$overwrite = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX55793_native.class, module0803.$ic11$, module0803.$ic9$, module0803.$ic12$, module0803.$ic13$, new String[] { "$host", "$port", "$connection", "$session_type", "$index", "$overwrite" }, module0803.$ic14$, module0803.$ic15$, module0803.$ic16$);
        }
    }
    
    public static final class $f51211$UnaryFunction extends UnaryFunction
    {
        public $f51211$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#55794"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0803.f51211(var15);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0803.class
	Total time: 143 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/