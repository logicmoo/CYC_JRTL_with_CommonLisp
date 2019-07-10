package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0725 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0725";
    public static final String myFingerPrint = "5beca04baf5701f8aae2bf9f64a1e2f99633c4719b8e01845430f4e8016c8c9d";
    public static SubLSymbol $g5722$;
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
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    
    
    public static SubLObject f44354(final SubLObject var1, final SubLObject var2) {
        f44355(var1, var2, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44356(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX48530_native.class) ? T : NIL);
    }
    
    public static SubLObject f44357(final SubLObject var1) {
        assert NIL != f44356(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f44358(final SubLObject var1) {
        assert NIL != f44356(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f44359(final SubLObject var1) {
        assert NIL != f44356(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f44360(final SubLObject var1) {
        assert NIL != f44356(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f44361(final SubLObject var1, final SubLObject var4) {
        assert NIL != f44356(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f44362(final SubLObject var1, final SubLObject var4) {
        assert NIL != f44356(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f44363(final SubLObject var1, final SubLObject var4) {
        assert NIL != f44356(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f44364(final SubLObject var1, final SubLObject var4) {
        assert NIL != f44356(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f44365(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX48530_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f44361(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f44362(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f44363(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f44364(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f44366(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f44357(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f44358(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f44359(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f44360(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f44367(final SubLObject var11, final SubLObject var12) {
        return f44366(var11, var12);
    }
    
    public static SubLObject f44368(final SubLObject var13) {
        assert NIL != f44356(var13) : var13;
        return f44357(var13);
    }
    
    public static SubLObject f44369(final SubLObject var13) {
        assert NIL != f44356(var13) : var13;
        return f44358(var13);
    }
    
    public static SubLObject f44370(final SubLObject var13) {
        assert NIL != f44356(var13) : var13;
        return f44359(var13);
    }
    
    public static SubLObject f44371(final SubLObject var13) {
        assert NIL != f44356(var13) : var13;
        return f44360(var13);
    }
    
    public static SubLObject f44355(final SubLObject var14, final SubLObject var2, final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var17 = Strings.make_string(var15, (SubLObject)UNPROVIDED);
        final SubLObject var18 = Strings.make_string(Numbers.add(var15, (SubLObject)THREE_INTEGER), (SubLObject)UNPROVIDED);
        PrintLow.format(var2, (SubLObject)$ic27$, var17);
        PrintLow.format(var2, (SubLObject)$ic28$, var18, f44368(var14));
        if (NIL != var16 && f44369(var14).isString()) {
            PrintLow.format(var2, (SubLObject)$ic29$, var18, f44369(var14));
        }
        PrintLow.format(var2, (SubLObject)$ic30$, var18, f44370(var14));
        PrintLow.format(var2, (SubLObject)$ic31$, var18);
        if (NIL != var16) {
            streams_high.terpri(var2);
            SubLObject var19 = f44371(var14);
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL != var19) {
                module0636.f38810(var20, var2, Numbers.add((SubLObject)THREE_INTEGER, var15));
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic32$, Sequences.length(f44371(var14)));
        }
        print_high.princ((SubLObject)$ic33$, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44372(final SubLObject var21, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert NIL != module0206.f13444(var21) : var21;
        if (NIL == module0259.f16854(var21, $ic35$, var22, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic36$);
        }
        if (NIL != var22 && !areAssertionsDisabledFor(me) && NIL == module0269.f17731(var22)) {
            throw new AssertionError(var22);
        }
        final SubLObject var24 = f44373(var21, var22);
        final SubLObject var25 = var22;
        final SubLObject var26 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var23);
        try {
            module0147.$g2094$.bind(module0147.f9531(var25), var23);
            module0147.$g2095$.bind(module0147.f9534(var25), var23);
            f44361(var24, var21);
            var23.resetMultipleValues();
            final SubLObject var28 = module0538.f33428((SubLObject)ConsesLow.list($ic38$, (SubLObject)$ic39$, var21), var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var29 = var23.secondMultipleValue();
            final SubLObject var30 = var23.thirdMultipleValue();
            var23.resetMultipleValues();
            SubLObject var31 = var28;
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                var32 = var32.first().rest();
                f44364(var24, ConsesLow.nconc(f44360(var24), (SubLObject)ConsesLow.list(module0636.f38864((SubLObject)ConsesLow.list($ic40$, var32), var22))));
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var27, var23);
            module0147.$g2094$.rebind(var26, var23);
        }
        return var24;
    }
    
    public static SubLObject f44374(final SubLObject var13, final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        if (NIL == var33) {
            SubLObject var34 = f44371(var13);
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL == var33 && NIL != var34) {
                if (module0636.f38845(var35).equal(var32)) {
                    var33 = var35;
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        return var33;
    }
    
    public static SubLObject f44375(final SubLObject var13, final SubLObject var34) {
        f44364(var13, var34);
        return var13;
    }
    
    public static SubLObject f44376(final SubLObject var13, final SubLObject var20) {
        return Sequences.remove(var20, f44371(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44373(final SubLObject var35, final SubLObject var22) {
        final SubLObject var36 = f44365((SubLObject)UNPROVIDED);
        f44361(var36, var35);
        f44362(var36, (SubLObject)$ic41$);
        f44363(var36, (NIL != module0228.f15225(var22)) ? module0172.f10921(var22) : var22);
        f44364(var36, (SubLObject)NIL);
        return var36;
    }
    
    public static SubLObject f44377(final SubLObject var36, final SubLObject var37) {
        if (NIL == module0636.f38848(var36)) {
            if (NIL == module0636.f38848(var37)) {
                return (SubLObject)T;
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL == module0636.f38848(var37)) {
                return (SubLObject)T;
            }
            return Functions.funcall(Symbols.symbol_function((SubLObject)$ic42$), module0636.f38848(var36), module0636.f38848(var37));
        }
    }
    
    public static SubLObject f44378(final SubLObject var13) {
        f44364(var13, Sort.sort(f44371(var13), Symbols.symbol_function((SubLObject)$ic43$), (SubLObject)UNPROVIDED));
        return var13;
    }
    
    public static SubLObject f44379() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44354", "S#48532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44356", "S#48531", 1, 0, false);
        new $f44356$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44357", "S#48533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44358", "S#48534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44359", "S#48535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44360", "S#48536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44361", "S#48537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44362", "S#48538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44363", "S#48539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44364", "S#48540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44365", "S#48541", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44366", "S#48542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44367", "S#48543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44368", "S#48544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44369", "S#48545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44370", "S#48546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44371", "S#48547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44355", "S#48548", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44372", "S#48549", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44374", "S#48550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44375", "S#48551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44376", "S#48552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44373", "S#48553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44377", "S#48554", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0725", "f44378", "S#48555", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44380() {
        $g5722$ = SubLFiles.defconstant("S#48556", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44381() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5722$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5722$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44379();
    }
    
    public void initializeVariables() {
        f44380();
    }
    
    public void runTopLevelForms() {
        f44381();
    }
    
    static {
        me = (SubLFile)new module0725();
        $g5722$ = null;
        $ic0$ = makeSymbol("S#48530", "CYC");
        $ic1$ = makeSymbol("S#48531", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#42579", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#48557", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("CYCL-ID"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("QUERIES"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#48533", "CYC"), (SubLObject)makeSymbol("S#48534", "CYC"), (SubLObject)makeSymbol("S#48535", "CYC"), (SubLObject)makeSymbol("S#48536", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#48537", "CYC"), (SubLObject)makeSymbol("S#48538", "CYC"), (SubLObject)makeSymbol("S#48539", "CYC"), (SubLObject)makeSymbol("S#48540", "CYC"));
        $ic6$ = makeSymbol("S#48548", "CYC");
        $ic7$ = makeSymbol("S#48532", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#48531", "CYC"));
        $ic9$ = makeSymbol("S#48533", "CYC");
        $ic10$ = makeSymbol("S#48537", "CYC");
        $ic11$ = makeSymbol("S#48534", "CYC");
        $ic12$ = makeSymbol("S#48538", "CYC");
        $ic13$ = makeSymbol("S#48535", "CYC");
        $ic14$ = makeSymbol("S#48539", "CYC");
        $ic15$ = makeSymbol("S#48536", "CYC");
        $ic16$ = makeSymbol("S#48540", "CYC");
        $ic17$ = makeKeyword("CYCL-ID");
        $ic18$ = makeKeyword("COMMENT");
        $ic19$ = makeKeyword("MT");
        $ic20$ = makeKeyword("QUERIES");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#48541", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#48543", "CYC");
        $ic27$ = makeString("~%~A<test-query-suite:~%");
        $ic28$ = makeString("~Aid: ~A~%");
        $ic29$ = makeString("~Acomment: ~A~%");
        $ic30$ = makeString("~Amt: ~A~%");
        $ic31$ = makeString("~Aqueries:");
        $ic32$ = makeString(" ~S");
        $ic33$ = makeString(">");
        $ic34$ = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTestSpecificationType"));
        $ic36$ = makeString("Got bad constant-id in test-query-suite-get!");
        $ic37$ = makeSymbol("S#16717", "CYC");
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic39$ = makeSymbol("?TEST");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("TestQueryFn"));
        $ic41$ = makeString("");
        $ic42$ = makeSymbol("STRING-LESSP");
        $ic43$ = makeSymbol("S#48554", "CYC");
    }
    
    public static final class $sX48530_native extends SubLStructNative
    {
        public SubLObject $cycl_id;
        public SubLObject $comment;
        public SubLObject $mt;
        public SubLObject $queries;
        public static final SubLStructDeclNative structDecl;
        
        public $sX48530_native() {
            this.$cycl_id = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$queries = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX48530_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl_id;
        }
        
        public SubLObject getField3() {
            return this.$comment;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$queries;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$queries = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX48530_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$cycl_id", "$comment", "$mt", "$queries" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f44356$UnaryFunction extends UnaryFunction
    {
        public $f44356$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48531"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f44356(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 122 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/