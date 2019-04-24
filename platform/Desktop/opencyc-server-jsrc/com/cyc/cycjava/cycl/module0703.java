package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0703 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0703";
    public static final String myFingerPrint = "ac79f8de866576acdfc47139c8ce6a599084080c5b2be45ef0c7ccc10232937f";
    public static SubLSymbol $g5515$;
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
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    
    public static SubLObject f42862(final SubLObject var1, final SubLObject var2) {
        return Equality.equal(f42863(var1), f42863(var2));
    }
    
    public static SubLObject f42864(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f42863(var1);
        final SubLObject var4 = f42863(var2);
        return (var3.isString() && var4.isString()) ? Strings.stringL(var3, var4, (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED) : ((var3.isNumber() && var4.isNumber()) ? Numbers.numL(var3, var4) : Strings.stringL(print_high.princ_to_string(var3), print_high.princ_to_string(var4), (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED, (SubLObject)module0703.UNPROVIDED));
    }
    
    public static SubLObject f42865(final SubLObject var5, final SubLObject var6) {
        f42866(var5, var6, (SubLObject)module0703.ZERO_INTEGER);
        return (SubLObject)module0703.NIL;
    }
    
    public static SubLObject f42867(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX46902_native.class) ? module0703.T : module0703.NIL);
    }
    
    public static SubLObject f42868(final SubLObject var5) {
        assert module0703.NIL != f42867(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f42869(final SubLObject var5, final SubLObject var8) {
        assert module0703.NIL != f42867(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f42870(SubLObject var9) {
        if (var9 == module0703.UNPROVIDED) {
            var9 = (SubLObject)module0703.NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX46902_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)module0703.NIL, var11 = var9; module0703.NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)module0703.$ic11$)) {
                f42869(var10, var13);
            }
            else {
                Errors.error((SubLObject)module0703.$ic12$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f42871(final SubLObject var15, final SubLObject var16) {
        Functions.funcall(var16, var15, (SubLObject)module0703.$ic13$, (SubLObject)module0703.$ic14$, (SubLObject)module0703.ONE_INTEGER);
        Functions.funcall(var16, var15, (SubLObject)module0703.$ic15$, (SubLObject)module0703.$ic11$, f42868(var15));
        Functions.funcall(var16, var15, (SubLObject)module0703.$ic16$, (SubLObject)module0703.$ic14$, (SubLObject)module0703.ONE_INTEGER);
        return var15;
    }
    
    public static SubLObject f42872(final SubLObject var15, final SubLObject var16) {
        return f42871(var15, var16);
    }
    
    public static SubLObject f42866(final SubLObject var17, final SubLObject var6, final SubLObject var18) {
        PrintLow.format(var6, (SubLObject)module0703.$ic18$, f42868(var17));
        return var17;
    }
    
    public static SubLObject f42873(final SubLObject var19) {
        final SubLObject var20 = f42870((SubLObject)module0703.UNPROVIDED);
        f42869(var20, var19);
        return var20;
    }
    
    public static SubLObject f42874(final SubLObject var20) {
        assert module0703.NIL != f42867(var20) : var20;
        return print_high.princ_to_string(f42868(var20));
    }
    
    public static SubLObject f42863(final SubLObject var20) {
        assert module0703.NIL != f42867(var20) : var20;
        return f42868(var20);
    }
    
    public static SubLObject f42875(final SubLObject var17) {
        return f42876(var17);
    }
    
    public static SubLObject f42876(final SubLObject var20) {
        return Sxhash.sxhash(f42868(var20));
    }
    
    public static SubLObject f42877() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42862", "S#46648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42864", "S#46903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42865", "S#46904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42867", "S#46522", 1, 0, false);
        new $f42867$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42868", "S#46905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42869", "S#46906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42870", "S#46907", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42871", "S#46908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42872", "S#46909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42866", "S#46910", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42873", "S#46640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42874", "S#46911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42863", "S#46912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42875", "S#46913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0703", "f42876", "S#46914", 1, 0, false);
        return (SubLObject)module0703.NIL;
    }
    
    public static SubLObject f42878() {
        module0703.$g5515$ = SubLFiles.defconstant("S#46915", (SubLObject)module0703.$ic0$);
        return (SubLObject)module0703.NIL;
    }
    
    public static SubLObject f42879() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0703.$g5515$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0703.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0703.$ic8$);
        Structures.def_csetf((SubLObject)module0703.$ic9$, (SubLObject)module0703.$ic10$);
        Equality.identity((SubLObject)module0703.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0703.$g5515$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0703.$ic17$));
        module0012.f419((SubLObject)module0703.$ic6$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0703.$g5515$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0703.$ic19$));
        return (SubLObject)module0703.NIL;
    }
    
    public void declareFunctions() {
        f42877();
    }
    
    public void initializeVariables() {
        f42878();
    }
    
    public void runTopLevelForms() {
        f42879();
    }
    
    static {
        me = (SubLFile)new module0703();
        module0703.$g5515$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46902", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#46522", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46905", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46906", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#46910", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#46904", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#46522", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#46905", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#46906", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("ID");
        $ic12$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic13$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic14$ = SubLObjectFactory.makeSymbol("S#46907", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic16$ = SubLObjectFactory.makeKeyword("END");
        $ic17$ = SubLObjectFactory.makeSymbol("S#46909", "CYC");
        $ic18$ = SubLObjectFactory.makeString("<RDF-BLANK-NODE ~S>");
        $ic19$ = SubLObjectFactory.makeSymbol("S#46913", "CYC");
    }
    
    public static final class $sX46902_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $sX46902_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46902_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46902_native.class, module0703.$ic0$, module0703.$ic1$, module0703.$ic2$, module0703.$ic3$, new String[] { "$id" }, module0703.$ic4$, module0703.$ic5$, module0703.$ic6$);
        }
    }
    
    public static final class $f42867$UnaryFunction extends UnaryFunction
    {
        public $f42867$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46522"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0703.f42867(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0703.class
	Total time: 68 ms
	
	Decompiled with Procyon 0.5.32.
*/