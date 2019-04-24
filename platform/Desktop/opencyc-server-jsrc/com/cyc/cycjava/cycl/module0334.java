package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0334 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0334";
    public static final String myFingerPrint = "8d6e4a134aa340adec83243ae8e7e09aa85beb01e4380cab6875213bfe95aaf5";
    private static SubLSymbol $g2855$;
    public static SubLSymbol $g2842$;
    public static SubLSymbol $g2843$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    
    public static SubLObject f22560() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0334.$g2855$.getDynamicValue(var1);
    }
    
    public static SubLObject f22561() {
        module0334.$g2855$.setDynamicValue((SubLObject)module0334.NIL);
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22562(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0334.NIL != Types.consp(var2) : var2;
        module0334.$g2855$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0334.$g2855$.getDynamicValue(var3)), var3);
        return var2;
    }
    
    public static SubLObject f22563(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0334.NIL;
        try {
            var4 = compatibility.open_text(var3, (SubLObject)module0334.$ic3$);
            if (!var4.isStream()) {
                Errors.error((SubLObject)module0334.$ic4$, var3);
            }
            final SubLObject var5 = var4;
            PrintLow.format(var5, (SubLObject)module0334.$ic5$);
            PrintLow.format(var5, (SubLObject)module0334.$ic6$);
            PrintLow.format(var5, (SubLObject)module0334.$ic7$, module0107.f7573());
            PrintLow.format(var5, (SubLObject)module0334.$ic6$);
            PrintLow.format(var5, (SubLObject)module0334.$ic7$, var3);
            PrintLow.format(var5, (SubLObject)module0334.$ic7$, module0051.f3552((SubLObject)module0334.UNPROVIDED));
            PrintLow.format(var5, (SubLObject)module0334.$ic6$);
            PrintLow.format(var5, (SubLObject)module0334.$ic8$, new SubLObject[] { module0011.f351(), module0018.f971(), module0574.f35163() });
            PrintLow.format(var5, (SubLObject)module0334.$ic6$);
            PrintLow.format(var5, (SubLObject)module0334.$ic9$);
            PrintLow.format(var5, (SubLObject)module0334.$ic10$);
            PrintLow.format(var5, (SubLObject)module0334.$ic11$);
            SubLObject var6 = module0334.$g2842$.getGlobalValue();
            SubLObject var7 = (SubLObject)module0334.NIL;
            var7 = var6.first();
            while (module0334.NIL != var6) {
                PrintLow.format(var5, (SubLObject)module0334.$ic12$, var7);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        finally {
            final SubLObject var8 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0334.T);
                if (var4.isStream()) {
                    streams_high.close(var4, (SubLObject)module0334.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var8);
            }
        }
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22564() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0334.NIL != module0018.$g629$.getDynamicValue(var1)) {
            final SubLObject var2 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)module0334.NIL, var1);
                try {
                    Errors.error((SubLObject)module0334.$ic13$, f22560());
                }
                catch (Throwable var3) {
                    Errors.handleThrowable(var3, (SubLObject)module0334.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var2, var1);
            }
        }
        Dynamic.sublisp_throw((SubLObject)module0334.$ic14$, (SubLObject)module0334.NIL);
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22565() {
        f22564();
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22566(final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0334.NIL != module0018.$g675$.getDynamicValue(var13)) {
            if (module0334.NIL == module0018.$g673$.getDynamicValue(var13) && module0334.NIL == module0018.$g672$.getDynamicValue(var13) && (module0334.NIL == module0018.$g674$.getDynamicValue(var13) || module0334.NIL == f22567(var10))) {
                Errors.warn((SubLObject)module0334.$ic15$, var10, var11, var12);
                f22568((SubLObject)module0334.$ic15$, var10, var11, var12, (SubLObject)module0334.UNPROVIDED);
            }
        }
        else {
            module0352.f23590((SubLObject)ConsesLow.list((SubLObject)module0334.$ic16$, (SubLObject)module0334.$ic17$, var10, var12));
        }
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22568(final SubLObject var13, final SubLObject var10, final SubLObject var11, final SubLObject var12, SubLObject var14) {
        if (var14 == module0334.UNPROVIDED) {
            var14 = (SubLObject)module0334.NIL;
        }
        if (module0334.NIL != module0593.f36269()) {
            final SubLObject var15 = module0593.f36290();
            if (var15.eql((SubLObject)module0334.$ic18$)) {
                Errors.warn(var13, new SubLObject[] { var10, var11, var12, var14 });
            }
            else if (var15.eql((SubLObject)module0334.$ic19$)) {
                Errors.error(var13, new SubLObject[] { var10, var11, var12, var14 });
            }
            else if (var15.eql((SubLObject)module0334.$ic20$)) {
                f22569(var13, var10, var11, var12, var14);
            }
        }
        else {
            f22569(var13, var10, var11, var12, var14);
        }
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22569(final SubLObject var13, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0334.NIL != module0018.$g675$.getDynamicValue(var15)) {
            f22564();
            return (SubLObject)module0334.NIL;
        }
        return Errors.cerror((SubLObject)module0334.$ic21$, var13, new SubLObject[] { var10, var11, var12, var14 });
    }
    
    public static SubLObject f22567(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0334.NIL == module0202.f12591(var16, (SubLObject)module0334.$ic22$));
    }
    
    public static SubLObject f22570(final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = var17.rest();
        final SubLObject var21;
        final SubLObject var20 = var21 = var19;
        return (SubLObject)ConsesLow.list((SubLObject)module0334.$ic23$, (SubLObject)module0334.$ic24$, (SubLObject)ConsesLow.listS((SubLObject)module0334.$ic25$, (SubLObject)module0334.$ic26$, ConsesLow.append(var21, (SubLObject)module0334.NIL)));
    }
    
    public static SubLObject f22571() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22560", "S#25130", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22561", "S#25131", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22562", "S#25132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22563", "S#25133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22564", "S#25134", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22565", "S#25135", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22566", "S#14915", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22568", "S#25136", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22569", "S#25137", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0334", "f22567", "S#25138", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0334", "f22570", "S#25139");
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22572() {
        module0334.$g2855$ = SubLFiles.defparameter("S#25140", (SubLObject)module0334.NIL);
        module0334.$g2842$ = SubLFiles.deflexical("S#25141", (SubLObject)((module0334.NIL != Symbols.boundp((SubLObject)module0334.$ic1$)) ? module0334.$g2842$.getGlobalValue() : module0334.NIL));
        module0334.$g2843$ = SubLFiles.deflexical("S#25142", (SubLObject)((module0334.NIL != Symbols.boundp((SubLObject)module0334.$ic2$)) ? module0334.$g2843$.getGlobalValue() : module0334.NIL));
        return (SubLObject)module0334.NIL;
    }
    
    public static SubLObject f22573() {
        module0003.f57((SubLObject)module0334.$ic1$);
        module0003.f57((SubLObject)module0334.$ic2$);
        return (SubLObject)module0334.NIL;
    }
    
    public void declareFunctions() {
        f22571();
    }
    
    public void initializeVariables() {
        f22572();
    }
    
    public void runTopLevelForms() {
        f22573();
    }
    
    static {
        me = (SubLFile)new module0334();
        module0334.$g2855$ = null;
        module0334.$g2842$ = null;
        module0334.$g2843$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic1$ = SubLObjectFactory.makeSymbol("S#25141", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#25142", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic4$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic5$ = SubLObjectFactory.makeString(";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");
        $ic6$ = SubLObjectFactory.makeString("~%;;");
        $ic7$ = SubLObjectFactory.makeString("~%;; ~A");
        $ic8$ = SubLObjectFactory.makeString("~%;; SBHL Utilities conflicts for CycL version ~A from KB ~S.~S");
        $ic9$ = SubLObjectFactory.makeString("~%;; This file is automatically generated at dump time!");
        $ic10$ = SubLObjectFactory.makeString("~%;; See CONFLICTS.LISP for details.");
        $ic11$ = SubLObjectFactory.makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $ic12$ = SubLObjectFactory.makeString("~%~S");
        $ic13$ = SubLObjectFactory.makeString("Aborting due to conflict:~%~S");
        $ic14$ = SubLObjectFactory.makeKeyword("CONFLICT");
        $ic15$ = SubLObjectFactory.makeString("deduction conflict: ~s ~a ~a");
        $ic16$ = SubLObjectFactory.makeKeyword("INVALID-LITERAL");
        $ic17$ = SubLObjectFactory.makeString("~S is semantically invalid in ~S");
        $ic18$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic19$ = SubLObjectFactory.makeKeyword("HALT");
        $ic20$ = SubLObjectFactory.makeKeyword("DEBUG");
        $ic21$ = SubLObjectFactory.makeString("leave the kb inconsistent for now and resolve the conflict later");
        $ic22$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")));
        $ic23$ = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#25135", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("CLET");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1903", "CYC"), (SubLObject)module0334.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-WARNS?*"), (SubLObject)module0334.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12532", "CYC"), (SubLObject)module0334.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1904", "CYC"), (SubLObject)module0334.T));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0334.class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/