package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0357 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0357";
    public static final String myFingerPrint = "4c4f98219ddba86b1b78ded8971264e335e9ad74950381525b5904d28ba3ecb6";
    private static SubLSymbol $g3000$;
    private static SubLSymbol $g3001$;
    private static SubLSymbol $g3002$;
    private static SubLSymbol $g3003$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    
    public static SubLObject f23639(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0357.$ic3$, (SubLObject)module0357.$ic4$, ConsesLow.append(var5, (SubLObject)module0357.NIL));
    }
    
    public static SubLObject f23640() {
        module0357.$g3003$.setGlobalValue(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0357.$ic8$), module0116.f8035((SubLObject)module0357.$ic6$, module0116.f8042())));
        return Sequences.length(module0357.$g3003$.getGlobalValue());
    }
    
    public static SubLObject f23641(final SubLObject var6, final SubLObject var7) {
        assert module0357.NIL != module0369.f25275(var6) : var6;
        assert module0357.NIL != Types.function_spec_p(var7) : var7;
        final SubLObject var8 = module0369.f25421(var6);
        final SubLObject var9 = module0361.f23996(var8);
        final SubLObject var10 = module0369.f25422(var6);
        f23642(module0357.$g3003$.getGlobalValue(), var7, var9, var10);
        return module0356.f23631();
    }
    
    public static SubLObject f23643(final SubLObject var6, final SubLObject var7, final SubLObject var11) {
        assert module0357.NIL != module0369.f25275(var6) : var6;
        assert module0357.NIL != Types.function_spec_p(var7) : var7;
        assert module0357.NIL != Types.keywordp(var11) : var11;
        if (module0357.NIL == module0004.f104(var11, module0357.$g3003$.getGlobalValue(), (SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED)) {
            Errors.error((SubLObject)module0357.$ic14$, var11);
        }
        final SubLObject var12 = module0369.f25421(var6);
        final SubLObject var13 = module0361.f23996(var12);
        final SubLObject var14 = module0369.f25422(var6);
        f23644(var11, var7, var13, var14);
        return module0356.f23631();
    }
    
    public static SubLObject f23645(final SubLObject var9, final SubLObject var10, final SubLObject var7) {
        f23646(var9, var10, var7);
        return module0356.f23631();
    }
    
    public static SubLObject f23642(final SubLObject var12, final SubLObject var7, final SubLObject var9, final SubLObject var10) {
        SubLObject var13 = var12;
        SubLObject var14 = (SubLObject)module0357.NIL;
        var14 = var13.first();
        while (module0357.NIL != var13) {
            f23644(var14, var7, var9, var10);
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var9;
    }
    
    public static SubLObject f23647(final SubLObject var11, SubLObject var14) {
        if (var14 == module0357.UNPROVIDED) {
            var14 = (SubLObject)module0357.NIL;
        }
        if (module0357.NIL == module0118.f8204(var11)) {
            final SubLObject var15 = module0116.f8053(var11);
            if (var15.eql((SubLObject)module0357.$ic16$)) {
                f23648(var11);
            }
            else if (var15.eql((SubLObject)module0357.$ic17$)) {
                f23649(var11);
            }
            else {
                Errors.warn((SubLObject)module0357.$ic18$, module0116.f8053(var11));
            }
        }
        return var11;
    }
    
    public static SubLObject f23648(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0356.f23618(var11);
        final SubLObject var14 = module0356.f23617(var11);
        final SubLObject var15 = module0356.f23616(var11);
        SubLObject var16 = f23650(var11, var13, var14, (SubLObject)module0357.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0357.NIL;
        var17 = var16.first();
        while (module0357.NIL != var16) {
            SubLObject var18 = (SubLObject)module0357.NIL;
            try {
                var12.throwStack.push(module0357.$ic19$);
                final SubLObject var19 = Errors.$error_handler$.currentBinding(var12);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0357.$ic20$), var12);
                    try {
                        Functions.funcall(var17, var13, var14, var15);
                    }
                    catch (Throwable var20) {
                        Errors.handleThrowable(var20, (SubLObject)module0357.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var19, var12);
                }
            }
            catch (Throwable var21) {
                var18 = Errors.handleThrowable(var21, (SubLObject)module0357.$ic19$);
            }
            finally {
                var12.throwStack.pop();
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var11;
    }
    
    public static SubLObject f23651(final SubLObject var23, final SubLObject var10, final SubLObject var24) {
        PrintLow.format((SubLObject)module0357.T, (SubLObject)module0357.$ic21$, new SubLObject[] { var23, var10, var24 });
        return (SubLObject)module0357.NIL;
    }
    
    public static SubLObject f23649(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0356.f23622(var11);
        final SubLObject var14 = module0356.f23621(var11);
        final SubLObject var15 = module0356.f23620(var11);
        final SubLObject var16 = Equality.eq(var15, (SubLObject)module0357.$ic23$);
        SubLObject var17 = f23650(var11, var13, var14, var16);
        SubLObject var18 = (SubLObject)module0357.NIL;
        var18 = var17.first();
        while (module0357.NIL != var17) {
            SubLObject var19 = (SubLObject)module0357.NIL;
            try {
                var12.throwStack.push(module0357.$ic19$);
                final SubLObject var20 = Errors.$error_handler$.currentBinding(var12);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0357.$ic20$), var12);
                    try {
                        Functions.funcall(var18, var13, var14, var15);
                    }
                    catch (Throwable var21) {
                        Errors.handleThrowable(var21, (SubLObject)module0357.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var20, var12);
                }
            }
            catch (Throwable var22) {
                var19 = Errors.handleThrowable(var22, (SubLObject)module0357.$ic19$);
            }
            finally {
                var12.throwStack.pop();
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var11;
    }
    
    public static SubLObject f23650(final SubLObject var11, final SubLObject var9, final SubLObject var10, SubLObject var26) {
        if (var26 == module0357.UNPROVIDED) {
            var26 = (SubLObject)module0357.NIL;
        }
        final SubLObject var27 = module0357.$g3001$.getGlobalValue();
        SubLObject var28 = (SubLObject)module0357.NIL;
        final SubLObject var29 = module0357.$g3000$.getGlobalValue();
        SubLObject var30 = (SubLObject)module0357.NIL;
        try {
            var30 = Locks.seize_lock(var29);
            final SubLObject var31 = module0067.f4884(var27, module0116.f8053(var11), (SubLObject)module0357.UNPROVIDED);
            if (module0357.NIL != module0067.f4852(var31)) {
                final SubLObject var32 = module0067.f4884(var31, var9, (SubLObject)module0357.UNPROVIDED);
                if (module0357.NIL != module0067.f4852(var32)) {
                    var28 = module0067.f4884(var32, var10, (SubLObject)module0357.UNPROVIDED);
                    if (module0357.NIL != var26 && module0357.NIL != var28) {
                        f23646(var9, var10, (SubLObject)module0357.UNPROVIDED);
                    }
                }
            }
        }
        finally {
            if (module0357.NIL != var30) {
                Locks.release_lock(var29);
            }
        }
        return var28;
    }
    
    public static SubLObject f23644(final SubLObject var11, final SubLObject var7, final SubLObject var9, final SubLObject var10) {
        final SubLObject var12 = module0357.$g3001$.getGlobalValue();
        final SubLObject var13 = module0357.$g3000$.getGlobalValue();
        SubLObject var14 = (SubLObject)module0357.NIL;
        try {
            var14 = Locks.seize_lock(var13);
            SubLObject var15 = module0067.f4884(var12, var11, (SubLObject)module0357.UNPROVIDED);
            if (module0357.NIL == module0067.f4852(var15)) {
                var15 = module0067.f4880((SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED);
                module0067.f4886(var12, var11, var15);
            }
            SubLObject var16 = module0067.f4884(var15, var9, (SubLObject)module0357.UNPROVIDED);
            if (module0357.NIL == module0067.f4852(var16)) {
                var16 = module0067.f4880((SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED);
                module0067.f4886(var15, var9, var16);
            }
            module0084.f5762(var16, var10, var7);
        }
        finally {
            if (module0357.NIL != var14) {
                Locks.release_lock(var13);
            }
        }
        return var11;
    }
    
    public static SubLObject f23646(final SubLObject var9, final SubLObject var10, SubLObject var7) {
        if (var7 == module0357.UNPROVIDED) {
            var7 = (SubLObject)module0357.NIL;
        }
        final SubLObject var11 = module0357.$g3000$.getGlobalValue();
        SubLObject var12 = (SubLObject)module0357.NIL;
        try {
            var12 = Locks.seize_lock(var11);
            SubLObject var13 = module0357.$g3003$.getGlobalValue();
            SubLObject var14 = (SubLObject)module0357.NIL;
            var14 = var13.first();
            while (module0357.NIL != var13) {
                final SubLObject var15 = module0357.$g3001$.getGlobalValue();
                final SubLObject var16 = module0067.f4884(var15, var14, (SubLObject)module0357.UNPROVIDED);
                if (module0357.NIL != module0067.f4852(var16)) {
                    final SubLObject var17 = module0067.f4884(var16, var9, (SubLObject)module0357.UNPROVIDED);
                    if (module0357.NIL != module0067.f4852(var17)) {
                        if (var7.isFunctionSpec()) {
                            module0084.f5771(var17, var10, var7, (SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED);
                        }
                        else {
                            module0067.f4887(var17, var10);
                        }
                        if (module0067.f4861(var17).isZero() || module0357.NIL == module0361.f24109(module0361.f23997(var9))) {
                            module0067.f4887(var16, var9);
                        }
                    }
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        finally {
            if (module0357.NIL != var12) {
                Locks.release_lock(var11);
            }
        }
        return (SubLObject)module0357.$ic24$;
    }
    
    public static SubLObject f23652() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0357", "f23639", "S#26317");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23640", "S#26318", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23641", "REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23643", "REGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23645", "DEREGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23642", "S#26319", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23647", "S#26320", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23648", "S#26321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23651", "S#26322", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23649", "S#26323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23650", "S#26324", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23644", "S#26325", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0357", "f23646", "S#26326", 2, 1, false);
        return (SubLObject)module0357.NIL;
    }
    
    public static SubLObject f23653() {
        module0357.$g3000$ = SubLFiles.deflexical("S#26327", (module0357.NIL != Symbols.boundp((SubLObject)module0357.$ic0$)) ? module0357.$g3000$.getGlobalValue() : Locks.make_lock((SubLObject)module0357.$ic1$));
        module0357.$g3001$ = SubLFiles.deflexical("S#26328", (module0357.NIL != Symbols.boundp((SubLObject)module0357.$ic2$)) ? module0357.$g3001$.getGlobalValue() : module0067.f4880((SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED));
        module0357.$g3002$ = SubLFiles.deflexical("S#26329", (module0357.NIL != Symbols.boundp((SubLObject)module0357.$ic5$)) ? module0357.$g3002$.getGlobalValue() : module0117.f8104((SubLObject)module0357.$ic6$, (SubLObject)module0357.$ic7$, (SubLObject)module0357.UNPROVIDED, (SubLObject)module0357.UNPROVIDED));
        module0357.$g3003$ = SubLFiles.deflexical("S#26330", Mapping.mapcar(Symbols.symbol_function((SubLObject)module0357.$ic8$), module0116.f8035((SubLObject)module0357.$ic6$, module0116.f8042())));
        return (SubLObject)module0357.NIL;
    }
    
    public static SubLObject f23654() {
        module0003.f57((SubLObject)module0357.$ic0$);
        module0003.f57((SubLObject)module0357.$ic2$);
        module0003.f57((SubLObject)module0357.$ic5$);
        module0356.f23633(module0357.$g3002$.getGlobalValue());
        module0002.f38((SubLObject)module0357.$ic9$);
        module0002.f38((SubLObject)module0357.$ic12$);
        module0002.f38((SubLObject)module0357.$ic15$);
        module0012.f419((SubLObject)module0357.$ic22$);
        return (SubLObject)module0357.NIL;
    }
    
    public void declareFunctions() {
        f23652();
    }
    
    public void initializeVariables() {
        f23653();
    }
    
    public void runTopLevelForms() {
        f23654();
    }
    
    static {
        me = (SubLFile)new module0357();
        module0357.$g3000$ = null;
        module0357.$g3001$ = null;
        module0357.$g3002$ = null;
        module0357.$g3003$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#26327", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Inference Event Filter Lock");
        $ic2$ = SubLObjectFactory.makeSymbol("S#26328", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26327", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#26329", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("INFERENCE-EVENT");
        $ic7$ = SubLObjectFactory.makeSymbol("S#26320", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#10062", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS");
        $ic10$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic11$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic12$ = SubLObjectFactory.makeSymbol("REGISTER-HANDLER-FOR-INFERENCE-EVENT");
        $ic13$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic14$ = SubLObjectFactory.makeString("Invalid argument ~A does not denot an inference event.~%");
        $ic15$ = SubLObjectFactory.makeSymbol("DEREGISTER-HANDLER-FOR-INFERENCE-EVENT");
        $ic16$ = SubLObjectFactory.makeKeyword("INFERENCE-NEW-ANSWER");
        $ic17$ = SubLObjectFactory.makeKeyword("INFERENCE-STATUS-CHANGE");
        $ic18$ = SubLObjectFactory.makeString("Unknown inference event message ~A.");
        $ic19$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic20$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic21$ = SubLObjectFactory.makeString("~%Inference ~A.~A generated answer ~S");
        $ic22$ = SubLObjectFactory.makeSymbol("S#26322", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic24$ = SubLObjectFactory.makeKeyword("DEREGISTERED");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0357.class
	Total time: 128 ms
	
	Decompiled with Procyon 0.5.32.
*/