package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0761 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0761";
    public static final String myFingerPrint = "32a02644ee89bc55eb35ec56cb802446078441b6e421ea15746ad504988e4d24";
    private static SubLSymbol $g6100$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    
    public static SubLObject f48129() {
        return conses_high.copy_list($g6100$.getGlobalValue());
    }
    
    public static SubLObject f48130(final SubLObject var1) {
        return module0004.f104(var1, $g6100$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48131(final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        if (var6 == UNPROVIDED) {
            var6 = module0751.f47040();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0579.$g4260$.getDynamicValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0579.$g4262$.getDynamicValue();
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0579.$g4284$.currentBinding(var10);
        final SubLObject var13 = module0579.$g4283$.currentBinding(var10);
        try {
            module0579.$g4284$.bind(var3, var10);
            module0579.$g4283$.bind(var4, var10);
            final SubLObject var14 = (SubLObject)((NIL != var6) ? ConsesLow.list(var6) : $ic3$);
            var11 = module0770.f49067(var2, var5, var14, var7, var8, var9, (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4283$.rebind(var13, var10);
            module0579.$g4284$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f48132(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Equality.equal(var2, module0579.$g4283$.getDynamicValue(var3));
    }
    
    public static SubLObject f48133(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Equality.equal(var2, module0579.$g4284$.getDynamicValue(var3));
    }
    
    public static SubLObject f48134() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return module0173.f10955(module0579.$g4283$.getDynamicValue(var10));
    }
    
    public static SubLObject f48135() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return module0173.f10955(module0579.$g4284$.getDynamicValue(var10));
    }
    
    public static SubLObject f48136(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f48132(var2) || NIL != f48133(var2));
    }
    
    public static SubLObject f48137(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic4$;
        }
        final SubLObject var10 = f48134();
        final SubLObject var11 = f48135();
        if (NIL != var10 && NIL != var11) {
            return (SubLObject)T;
        }
        if ($ic4$ == var9 && (NIL != var10 || NIL != var11)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48138() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48129", "S#52617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48130", "S#39396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48131", "GENERATE-SPEECH-ACT", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48132", "S#52618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48133", "S#52619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48134", "S#50961", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48135", "S#52620", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48136", "S#52616", 1, 0, false);
        new $f48136$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0761", "f48137", "S#52621", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48139() {
        $g6100$ = SubLFiles.defconstant("S#52622", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48140() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48138();
    }
    
    public void initializeVariables() {
        f48139();
    }
    
    public void runTopLevelForms() {
        f48140();
    }
    
    static {
        me = (SubLFile)new module0761();
        $g6100$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("NONE"), (SubLObject)makeKeyword("DECLARATIVE"), (SubLObject)makeKeyword("INTERROGATIVE"), (SubLObject)makeKeyword("QUESTION"), (SubLObject)makeKeyword("IMPERATIVE"), (SubLObject)makeKeyword("DEFAULT"));
        $ic1$ = makeKeyword("DECLARATIVE");
        $ic2$ = makeKeyword("TEXT");
        $ic3$ = makeKeyword("ANY");
        $ic4$ = makeKeyword("EITHER");
    }
    
    public static final class $f48136$UnaryFunction extends UnaryFunction
    {
        public $f48136$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52616"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f48136(var15);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 67 ms
	
	Decompiled with Procyon 0.5.32.
*/