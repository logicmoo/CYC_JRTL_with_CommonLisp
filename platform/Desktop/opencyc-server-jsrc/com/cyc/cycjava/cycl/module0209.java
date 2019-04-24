package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0209 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0209";
    public static final String myFingerPrint = "710f27b4189d77f1caf19f39825dfd1e5be8cc55bac16263ba7d801481f84038";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    
    public static SubLObject f13550(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isString() || module0209.NIL != module0208.f13537(var1, (SubLObject)module0209.UNPROVIDED));
    }
    
    public static SubLObject f13551(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0209.NIL != f13550(var1) && module0209.NIL != module0038.f2746(f13552(var1)));
    }
    
    public static SubLObject f13553(final SubLObject var2) {
        return f13552(var2);
    }
    
    public static SubLObject f13552(final SubLObject var2) {
        if (module0209.NIL != module0208.f13537(var2, (SubLObject)module0209.UNPROVIDED)) {
            return module0208.f13536(var2);
        }
        return var2;
    }
    
    public static SubLObject f13554(final SubLObject var3) {
        return module0039.f3000((module0209.NIL != module0039.f3006(var3)) ? var3 : module0205.f13277(var3, (SubLObject)module0209.UNPROVIDED));
    }
    
    public static SubLObject f13555(final SubLObject var4) {
        return Mapping.mapcar((SubLObject)module0209.$ic1$, var4);
    }
    
    public static SubLObject f13556(final SubLObject var5, final SubLObject var6) {
        return Strings.stringE(f13552(var5), f13552(var6), (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED);
    }
    
    public static SubLObject f13557(final SubLObject var5, final SubLObject var6) {
        return Strings.string_equal(f13552(var5), f13552(var6), (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED);
    }
    
    public static SubLObject f13558(final SubLObject var2, final SubLObject var7, final SubLObject var8) {
        assert module0209.NIL != f13550(var2) : var2;
        assert module0209.NIL != f13550(var7) : var7;
        if (var2.isString() && var7.isString()) {
            return module0038.f2756(var2, var7, var8, (SubLObject)module0209.UNPROVIDED);
        }
        final SubLObject var9 = f13552(var2);
        final SubLObject var10 = module0039.f3044(var9);
        final SubLObject var11 = f13552(var7);
        final SubLObject var12 = module0039.f3044(var11);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0209.NIL != module0035.f2008(var10, var12) && (module0209.NIL != module0038.f2756(var9, var11, var8, (SubLObject)module0209.UNPROVIDED) || module0209.NIL != Sequences.search(var12, var10, var8, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED)));
    }
    
    public static SubLObject f13559(final SubLObject var2, final SubLObject var13, final SubLObject var8) {
        assert module0209.NIL != f13550(var2) : var2;
        assert module0209.NIL != f13550(var13) : var13;
        if (var2.isString() && var13.isString()) {
            return module0038.f2675(var2, var13, var8);
        }
        final SubLObject var14 = f13552(var2);
        final SubLObject var15 = module0039.f3044(var14);
        final SubLObject var16 = f13552(var13);
        final SubLObject var17 = module0039.f3044(var16);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0209.NIL != module0035.f2008(var15, var17) && (module0209.NIL != module0038.f2675(var14, var16, var8) || var17.equalp(Sequences.subseq(var15, (SubLObject)module0209.ZERO_INTEGER, Sequences.length(var17)))));
    }
    
    public static SubLObject f13560(final SubLObject var2, final SubLObject var14, final SubLObject var8) {
        assert module0209.NIL != f13550(var2) : var2;
        assert module0209.NIL != f13550(var14) : var14;
        if (var2.isString() && var14.isString()) {
            return module0038.f2673(var2, var14, var8);
        }
        final SubLObject var15 = f13552(var2);
        final SubLObject var16 = module0039.f3044(var15);
        final SubLObject var17 = f13552(var14);
        final SubLObject var18 = module0039.f3044(var17);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0209.NIL != module0035.f2008(var16, var18) && (module0209.NIL != module0038.f2673(var15, var17, var8) || var18.equalp(Sequences.subseq(var16, Numbers.subtract(Sequences.length(var16), Sequences.length(var18)), (SubLObject)module0209.UNPROVIDED))));
    }
    
    public static SubLObject f13561(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = var3;
        if (module0209.NIL != Sequences.find_if((SubLObject)module0209.$ic3$, var3, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED)) {
            var5 = module0039.f3036(module0039.f3044(var3));
        }
        if (module0209.NIL != module0039.f3012(var5)) {
            SubLObject var6 = (SubLObject)module0209.NIL;
            try {
                var4.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var4);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0209.$ic4$, var4);
                    try {
                        final SubLObject var8 = module0039.f3001(module0039.f3043(var5));
                        final SubLObject var9 = module0039.f3017(var8, (SubLObject)module0209.UNPROVIDED, (SubLObject)module0209.UNPROVIDED);
                        if (var9.equal(module0039.f3040(var5))) {
                            var5 = var9;
                        }
                        else {
                            var5 = module0208.f13538(var8);
                        }
                    }
                    catch (Throwable var10) {
                        Errors.handleThrowable(var10, (SubLObject)module0209.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var4);
                }
            }
            catch (Throwable var11) {
                var6 = Errors.handleThrowable(var11, module0003.$g3$.getGlobalValue());
            }
            finally {
                var4.throwStack.pop();
            }
            if (module0209.NIL != var6) {
                Errors.warn((SubLObject)module0209.$ic5$, var3, var6);
            }
        }
        return var5;
    }
    
    public static SubLObject f13562() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13550", "S#3935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13551", "S#16390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13553", "CYCL-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13552", "S#16391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13554", "S#16392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13555", "S#16393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13556", "S#16394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13557", "S#16395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13558", "S#16396", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13559", "S#16397", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13560", "S#16398", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0209", "f13561", "S#16399", 1, 0, false);
        return (SubLObject)module0209.NIL;
    }
    
    public static SubLObject f13563() {
        return (SubLObject)module0209.NIL;
    }
    
    public static SubLObject f13564() {
        module0002.f38((SubLObject)module0209.$ic0$);
        return (SubLObject)module0209.NIL;
    }
    
    public void declareFunctions() {
        f13562();
    }
    
    public void initializeVariables() {
        f13563();
    }
    
    public void runTopLevelForms() {
        f13564();
    }
    
    static {
        me = (SubLFile)new module0209();
        $ic0$ = SubLObjectFactory.makeSymbol("CYCL-TO-UTF8-STRING");
        $ic1$ = SubLObjectFactory.makeSymbol("S#16391", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3935", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#3950", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic5$ = SubLObjectFactory.makeString("Error converting string to CycL:~% ~S~% ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0209.class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/