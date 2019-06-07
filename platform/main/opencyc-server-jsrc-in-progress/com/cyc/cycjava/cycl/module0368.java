package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0368 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0368";
    public static final String myFingerPrint = "124acc916b3f9d8c2b19bd91f24dece51d03d76b95e2de05bf05c2c9b11b6068";
    public static SubLSymbol $g3147$;
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
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    
    public static SubLObject f25249(final SubLObject var1, final SubLObject var2) {
        f25250(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25251(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX28173_native.class) ? T : NIL);
    }
    
    public static SubLObject f25252(final SubLObject var1) {
        assert NIL != f25251(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f25253(final SubLObject var1) {
        assert NIL != f25251(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f25254(final SubLObject var1, final SubLObject var4) {
        assert NIL != f25251(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f25255(final SubLObject var1, final SubLObject var4) {
        assert NIL != f25251(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f25256(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX28173_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f25254(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f25255(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f25257(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f25252(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f25253(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f25258(final SubLObject var11, final SubLObject var12) {
        return f25257(var11, var12);
    }
    
    public static SubLObject f25250(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        if (NIL != f25251(var13)) {
            PrintLow.format(var2, (SubLObject)$ic21$, module0055.f4016(f25259(var13)), module0055.f4016(f25260(var13)));
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic22$, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25261(SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = f25256((SubLObject)UNPROVIDED);
        SubLObject var18 = module0528.f32898();
        assert NIL != module0055.f4006(var18) : var18;
        SubLObject var19 = module0131.$g1538$.currentBinding(var16);
        try {
            module0131.$g1538$.bind(var18, var16);
            f25262(var17, module0528.f32897());
        }
        finally {
            module0131.$g1538$.rebind(var19, var16);
        }
        var18 = module0528.f32898();
        assert NIL != module0055.f4006(var18) : var18;
        var19 = module0131.$g1538$.currentBinding(var16);
        try {
            module0131.$g1538$.bind(var18, var16);
            f25263(var17, module0528.f32897());
        }
        finally {
            module0131.$g1538$.rebind(var19, var16);
        }
        if (NIL != module0161.f10481(var15)) {
            SubLObject var20 = module0219.f14524(var15);
            var20 = module0035.f2388(conses_high.copy_list(var20), Symbols.symbol_function((SubLObject)$ic24$), (SubLObject)UNPROVIDED);
            f25264(var17, var20);
        }
        return var17;
    }
    
    public static SubLObject f25265(final SubLObject var21) {
        if (NIL == f25251(var21)) {
            return (SubLObject)NIL;
        }
        module0055.f4018(f25252(var21));
        module0055.f4018(f25253(var21));
        f25254(var21, (SubLObject)$ic25$);
        f25255(var21, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25259(final SubLObject var21) {
        assert NIL != f25251(var21) : var21;
        return f25252(var21);
    }
    
    public static SubLObject f25262(final SubLObject var21, final SubLObject var22) {
        assert NIL != f25251(var21) : var21;
        assert NIL != module0055.f4006(var22) : var22;
        f25254(var21, var22);
        return var21;
    }
    
    public static SubLObject f25266(final SubLObject var21) {
        assert NIL != f25251(var21) : var21;
        module0055.f4018(f25252(var21));
        return var21;
    }
    
    public static SubLObject f25260(final SubLObject var21) {
        assert NIL != f25251(var21) : var21;
        return f25253(var21);
    }
    
    public static SubLObject f25263(final SubLObject var21, final SubLObject var22) {
        assert NIL != f25251(var21) : var21;
        assert NIL != module0055.f4006(var22) : var22;
        f25255(var21, var22);
        return var21;
    }
    
    public static SubLObject f25267(final SubLObject var21) {
        assert NIL != f25251(var21) : var21;
        final SubLObject var22 = f25259(var21);
        f25262(var21, f25260(var21));
        f25263(var21, var22);
        return var21;
    }
    
    public static SubLObject f25264(final SubLObject var21, final SubLObject var20) {
        assert NIL != f25251(var21) : var21;
        assert NIL != module0035.f2015(var20) : var20;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            assert NIL != assertion_handles_oc.f11035(var23) : var23;
            var22 = var22.rest();
            var23 = var22.first();
        }
        SubLObject var24 = var20;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            module0055.f4021(var25, f25253(var21));
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var21;
    }
    
    public static SubLObject f25268(final SubLObject var21) {
        assert NIL != f25251(var21) : var21;
        return module0055.f4023(f25252(var21));
    }
    
    public static SubLObject f25269() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25249", "S#28175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25251", "S#28174", 1, 0, false);
        new $f25251$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25252", "S#28176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25253", "S#28177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25254", "S#28178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25255", "S#28179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25256", "S#28180", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25257", "S#28181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25258", "S#28182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25250", "S#28183", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25261", "S#28184", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25265", "S#28185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25259", "S#28186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25262", "S#28187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25266", "S#28188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25260", "S#28189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25263", "S#28190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25267", "S#28191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25264", "S#28192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0368", "f25268", "S#28193", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25270() {
        $g3147$ = SubLFiles.defconstant("S#28194", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25271() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3147$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3147$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f25269();
    }
    
    public void initializeVariables() {
        f25270();
    }
    
    public void runTopLevelForms() {
        f25271();
    }
    
    static {
        me = (SubLFile)new module0368();
        $g3147$ = null;
        $ic0$ = makeSymbol("S#28173", "CYC");
        $ic1$ = makeSymbol("S#28174", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#28195", "CYC"), (SubLObject)makeSymbol("S#28196", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("OLD-QUEUE"), (SubLObject)makeKeyword("NEW-QUEUE"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#28176", "CYC"), (SubLObject)makeSymbol("S#28177", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#28178", "CYC"), (SubLObject)makeSymbol("S#28179", "CYC"));
        $ic6$ = makeSymbol("S#28183", "CYC");
        $ic7$ = makeSymbol("S#28175", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#28174", "CYC"));
        $ic9$ = makeSymbol("S#28176", "CYC");
        $ic10$ = makeSymbol("S#28178", "CYC");
        $ic11$ = makeSymbol("S#28177", "CYC");
        $ic12$ = makeSymbol("S#28179", "CYC");
        $ic13$ = makeKeyword("OLD-QUEUE");
        $ic14$ = makeKeyword("NEW-QUEUE");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#28180", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#28182", "CYC");
        $ic21$ = makeString("<Forward Propagate old=~a new=~a");
        $ic22$ = makeString("<Invalid Forward Propagate ~s>");
        $ic23$ = makeSymbol("S#690", "CYC");
        $ic24$ = makeSymbol("S#12732", "CYC");
        $ic25$ = makeKeyword("FREE");
        $ic26$ = makeSymbol("S#747", "CYC");
        $ic27$ = makeSymbol("ASSERTION-P");
    }
    
    public static final class $sX28173_native extends SubLStructNative
    {
        public SubLObject $old_queue;
        public SubLObject $new_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $sX28173_native() {
            this.$old_queue = (SubLObject)CommonSymbols.NIL;
            this.$new_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX28173_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$old_queue;
        }
        
        public SubLObject getField3() {
            return this.$new_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$old_queue = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$new_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX28173_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$old_queue", "$new_queue" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f25251$UnaryFunction extends UnaryFunction
    {
        public $f25251$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28174"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f25251(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 108 ms
	
	Decompiled with Procyon 0.5.32.
*/