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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0783 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0783";
    public static final String myFingerPrint = "82aad11c0bab3c336c532662773a6b0b1d86464ee7e192386c2c8066741d3c8d";
    public static SubLSymbol $g6292$;
    private static SubLSymbol $g6293$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    
    public static SubLObject f50341(final SubLObject var1, final SubLObject var2) {
        f50342(var1, var2, (SubLObject)module0783.ZERO_INTEGER);
        return (SubLObject)module0783.NIL;
    }
    
    public static SubLObject f50343(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX54893_native.class) ? module0783.T : module0783.NIL);
    }
    
    public static SubLObject f50344(final SubLObject var1) {
        assert module0783.NIL != f50343(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f50345(final SubLObject var1) {
        assert module0783.NIL != f50343(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f50346(final SubLObject var1, final SubLObject var4) {
        assert module0783.NIL != f50343(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f50347(final SubLObject var1, final SubLObject var4) {
        assert module0783.NIL != f50343(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f50348(SubLObject var5) {
        if (var5 == module0783.UNPROVIDED) {
            var5 = (SubLObject)module0783.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX54893_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0783.NIL, var7 = var5; module0783.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0783.$ic13$)) {
                f50346(var6, var9);
            }
            else if (var10.eql((SubLObject)module0783.$ic14$)) {
                f50347(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0783.$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f50349(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0783.$ic16$, (SubLObject)module0783.$ic17$, (SubLObject)module0783.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0783.$ic18$, (SubLObject)module0783.$ic13$, f50344(var11));
        Functions.funcall(var12, var11, (SubLObject)module0783.$ic18$, (SubLObject)module0783.$ic14$, f50345(var11));
        Functions.funcall(var12, var11, (SubLObject)module0783.$ic14$, (SubLObject)module0783.$ic17$, (SubLObject)module0783.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f50350(final SubLObject var11, final SubLObject var12) {
        return f50349(var11, var12);
    }
    
    public static SubLObject f50342(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)module0783.$ic20$, f50344(var13), f50345(var13));
        return var13;
    }
    
    public static SubLObject f50351(final SubLObject var15, final SubLObject var16) {
        final SubLObject var17 = module0067.f4884(module0783.$g6293$.getGlobalValue(), var15, (SubLObject)module0783.NIL);
        return (SubLObject)((module0783.NIL != module0067.f4852(var17)) ? module0067.f4885(var17, var16, (SubLObject)module0783.NIL) : module0783.NIL);
    }
    
    public static SubLObject f50352(final SubLObject var15, final SubLObject var16) {
        final SubLObject var17 = f50348((SubLObject)ConsesLow.list((SubLObject)module0783.$ic13$, var15, (SubLObject)module0783.$ic14$, var16));
        final SubLObject var18 = module0067.f4885(module0783.$g6293$.getGlobalValue(), var15, module0067.f4880(Symbols.symbol_function((SubLObject)module0783.EQL), (SubLObject)module0783.UNPROVIDED));
        module0067.f4886(var18, var16, var17);
        module0067.f4886(module0783.$g6293$.getGlobalValue(), var15, var18);
        return var17;
    }
    
    public static SubLObject f50353(final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert module0783.NIL != module0004.f106(var15) : var15;
        assert module0783.NIL != module0004.f106(var16) : var16;
        if (module0783.NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && !var16.numGE(var15)) {
            Errors.error((SubLObject)module0783.$ic22$, var16, var15);
        }
        final SubLObject var18 = f50351(var15, var16);
        if (module0783.NIL != var18) {
            return var18;
        }
        return f50352(var15, var16);
    }
    
    public static SubLObject f50354(final SubLObject var20) {
        assert module0783.NIL != f50343(var20) : var20;
        return f50344(var20);
    }
    
    public static SubLObject f50355(final SubLObject var20) {
        assert module0783.NIL != f50343(var20) : var20;
        return f50345(var20);
    }
    
    public static SubLObject f50356(final SubLObject var20) {
        assert module0783.NIL != f50343(var20) : var20;
        return Numbers.subtract(f50345(var20), f50344(var20));
    }
    
    public static SubLObject f50357(final SubLObject var21, final SubLObject var22) {
        assert module0783.NIL != f50343(var21) : var21;
        assert module0783.NIL != f50343(var22) : var22;
        return Numbers.numG(f50356(var21), f50356(var22));
    }
    
    public static SubLObject f50358(final SubLObject var21, final SubLObject var22) {
        assert module0783.NIL != f50343(var21) : var21;
        assert module0783.NIL != f50343(var22) : var22;
        return Numbers.numL(f50356(var21), f50356(var22));
    }
    
    public static SubLObject f50359(final SubLObject var21, final SubLObject var22) {
        assert module0783.NIL != f50343(var21) : var21;
        assert module0783.NIL != f50343(var22) : var22;
        final SubLObject var23 = f50344(var21);
        final SubLObject var24 = f50345(var21);
        final SubLObject var25 = f50344(var22);
        final SubLObject var26 = f50345(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(var23.numL(var25) || (var23.numE(var25) && var24.numL(var26)));
    }
    
    public static SubLObject f50360(final SubLObject var21, final SubLObject var22) {
        assert module0783.NIL != f50343(var21) : var21;
        assert module0783.NIL != f50343(var22) : var22;
        final SubLObject var23 = f50344(var21);
        final SubLObject var24 = f50345(var21);
        final SubLObject var25 = f50344(var22);
        final SubLObject var26 = f50345(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(var23.numLE(var25) && var24.numGE(var26));
    }
    
    public static SubLObject f50361(final SubLObject var21, final SubLObject var22) {
        assert module0783.NIL != f50343(var21) : var21;
        assert module0783.NIL != f50343(var22) : var22;
        final SubLObject var23 = f50344(var21);
        final SubLObject var24 = f50345(var21);
        final SubLObject var25 = f50344(var22);
        final SubLObject var26 = f50345(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean((var25.numLE(var24) && var25.numGE(var23)) || (var26.numLE(var24) && var26.numGE(var23)) || (var23.numLE(var26) && var23.numGE(var25)) || (var24.numLE(var26) && var24.numGE(var25)));
    }
    
    public static SubLObject f50362() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50341", "S#54895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50343", "S#54894", 1, 0, false);
        new $f50343$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50344", "S#54896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50345", "S#54897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50346", "S#54898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50347", "S#54899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50348", "S#54900", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50349", "S#54901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50350", "S#54902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50342", "S#54903", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50351", "S#54904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50352", "S#54905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50353", "S#52309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50354", "S#52310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50355", "S#52311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50356", "S#52336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50357", "S#54906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50358", "S#54907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50359", "S#52338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50360", "S#54908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0783", "f50361", "S#52337", 2, 0, false);
        return (SubLObject)module0783.NIL;
    }
    
    public static SubLObject f50363() {
        module0783.$g6292$ = SubLFiles.defconstant("S#54909", (SubLObject)module0783.$ic0$);
        module0783.$g6293$ = SubLFiles.deflexical("S#54910", module0067.f4880(Symbols.symbol_function((SubLObject)module0783.EQL), (SubLObject)module0783.UNPROVIDED));
        return (SubLObject)module0783.NIL;
    }
    
    public static SubLObject f50364() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0783.$g6292$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0783.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0783.$ic8$);
        Structures.def_csetf((SubLObject)module0783.$ic9$, (SubLObject)module0783.$ic10$);
        Structures.def_csetf((SubLObject)module0783.$ic11$, (SubLObject)module0783.$ic12$);
        Equality.identity((SubLObject)module0783.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0783.$g6292$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0783.$ic19$));
        return (SubLObject)module0783.NIL;
    }
    
    public void declareFunctions() {
        f50362();
    }
    
    public void initializeVariables() {
        f50363();
    }
    
    public void runTopLevelForms() {
        f50364();
    }
    
    static {
        me = (SubLFile)new module0783();
        module0783.$g6292$ = null;
        module0783.$g6293$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#54893", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#54894", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54896", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54897", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54898", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54899", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#54903", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#54895", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#54894", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#54896", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#54898", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#54897", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#54899", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("START");
        $ic14$ = SubLObjectFactory.makeKeyword("END");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#54900", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeSymbol("S#54902", "CYC");
        $ic20$ = SubLObjectFactory.makeString("<INTERVAL-SPAN (~S ~S)>");
        $ic21$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic22$ = SubLObjectFactory.makeString("~a is not greater than or equal to ~a");
    }
    
    public static final class $sX54893_native extends SubLStructNative
    {
        public SubLObject $start;
        public SubLObject $end;
        private static final SubLStructDeclNative structDecl;
        
        public $sX54893_native() {
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX54893_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$start;
        }
        
        public SubLObject getField3() {
            return this.$end;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX54893_native.class, module0783.$ic0$, module0783.$ic1$, module0783.$ic2$, module0783.$ic3$, new String[] { "$start", "$end" }, module0783.$ic4$, module0783.$ic5$, module0783.$ic6$);
        }
    }
    
    public static final class $f50343$UnaryFunction extends UnaryFunction
    {
        public $f50343$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#54894"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0783.f50343(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0783.class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/