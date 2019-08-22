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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0403 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0403";
    public static final String myFingerPrint = "50a5dd5437d1767465e68902b5f65d23e2db6639f00503c2ade590327f5a62b6";
    public static SubLSymbol $g3294$;
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
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    
    public static SubLObject f28305(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28306(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX31423_native.class) ? T : NIL);
    }
    
    public static SubLObject f28307(final SubLObject var1) {
        assert NIL != f28306(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f28308(final SubLObject var1, final SubLObject var4) {
        assert NIL != f28306(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f28309(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX31423_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic11$)) {
                f28308(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f28310(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic11$, f28307(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic14$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f28311(final SubLObject var11, final SubLObject var12) {
        return f28310(var11, var12);
    }
    
    public static SubLObject f28312(final SubLObject var13) {
        final SubLObject var14 = f28309((SubLObject)UNPROVIDED);
        f28308(var14, var13);
        return var14;
    }
    
    public static SubLObject f28313(final SubLObject var15) {
        assert NIL != module0406.f28343(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f28307(var16);
    }
    
    public static SubLObject f28314(final SubLObject var15, final SubLObject var16) {
        assert NIL != module0363.f24478(var16) : var16;
        return module0367.f25082(var16, var15);
    }
    
    public static SubLObject f28315(final SubLObject var15, final SubLObject var16) {
        assert NIL != module0406.f28343(var15) : var15;
        assert NIL != module0363.f24478(var16) : var16;
        return module0367.f25099(var15, var16);
    }
    
    public static SubLObject f28316(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = f28313(var15);
        var16.resetMultipleValues();
        final SubLObject var18 = module0387.f27549(var17);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        if (NIL != module0363.f24478(var18)) {
            module0367.f25050(var15, var18);
        }
        return var18;
    }
    
    public static SubLObject f28317(final SubLObject var15) {
        assert NIL != module0406.f28343(var15) : var15;
        return module0387.f27546(f28313(var15));
    }
    
    public static SubLObject f28318() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28305", "S#31425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28306", "S#31424", 1, 0, false);
        new $f28306$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28307", "S#31426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28308", "S#31427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28309", "S#31428", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28310", "S#31429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28311", "S#31430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28312", "S#31431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28313", "S#31432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28314", "S#31433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28315", "S#31434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28316", "S#31435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0403", "f28317", "S#31436", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28319() {
        $g3294$ = SubLFiles.defconstant("S#31437", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28320() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3294$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3294$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic17$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28318();
    }
    
    public void initializeVariables() {
        f28319();
    }
    
    public void runTopLevelForms() {
        f28320();
    }
    
    static {
        me = (SubLFile)new module0403();
        $g3294$ = null;
        $ic0$ = makeSymbol("S#31423", "CYC");
        $ic1$ = makeSymbol("S#31424", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#30973", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ROOT-INDEX"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#31426", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#31427", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#31425", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#31424", "CYC"));
        $ic9$ = makeSymbol("S#31426", "CYC");
        $ic10$ = makeSymbol("S#31427", "CYC");
        $ic11$ = makeKeyword("NEW-ROOT-INDEX");
        $ic12$ = makeString("Invalid slot ~S for construction function");
        $ic13$ = makeKeyword("BEGIN");
        $ic14$ = makeSymbol("S#31428", "CYC");
        $ic15$ = makeKeyword("SLOT");
        $ic16$ = makeKeyword("END");
        $ic17$ = makeSymbol("S#31430", "CYC");
        $ic18$ = makeSymbol("S#29328", "CYC");
        $ic19$ = makeSymbol("S#26082", "CYC");
    }
    
    public static final class $sX31423_native extends SubLStructNative
    {
        public SubLObject $new_root_index;
        public static final SubLStructDeclNative structDecl;
        
        public $sX31423_native() {
            this.$new_root_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$new_root_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$new_root_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX31423_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$new_root_index" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f28306$UnaryFunction extends UnaryFunction
    {
        public $f28306$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31424"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f28306(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 73 ms
	
	Decompiled with Procyon 0.5.32.
*/