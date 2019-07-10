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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0272 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0272";
    public static final String myFingerPrint = "a307e43acbf90ce65cf4b46b804cded9badb742f5474dc68807abe7925512ace";
    public static SubLSymbol $g2580$;
    private static SubLSymbol $g2581$;
    private static SubLSymbol $g2582$;
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
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    
    public static SubLObject f17925(final SubLObject var1, final SubLObject var2) {
        f17926(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17927(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX20462_native.class) ? T : NIL);
    }
    
    public static SubLObject f17928(final SubLObject var1) {
        assert NIL != f17927(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f17929(final SubLObject var1) {
        assert NIL != f17927(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f17930(final SubLObject var1, final SubLObject var4) {
        assert NIL != f17927(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f17931(final SubLObject var1, final SubLObject var4) {
        assert NIL != f17927(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f17932(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX20462_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f17930(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f17931(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f17933(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f17928(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f17929(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f17934(final SubLObject var11, final SubLObject var12) {
        return f17933(var11, var12);
    }
    
    public static SubLObject f17926(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f17935(var13);
        PrintLow.format(var2, (SubLObject)$ic21$, var15);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17936(final SubLObject var15, final SubLObject var16) {
        assert NIL != module0035.f2327(var16) : var16;
        final SubLObject var17 = f17937(var15);
        f17931(var17, var16);
        f17938(var17);
        return var17;
    }
    
    public static SubLObject f17937(final SubLObject var15) {
        SubLObject var16 = f17939(var15);
        if (NIL != var16) {
            f17940(var16);
        }
        else {
            var16 = f17932((SubLObject)UNPROVIDED);
            f17930(var16, var15);
        }
        f17931(var16, (SubLObject)NIL);
        return var16;
    }
    
    public static SubLObject f17941(final SubLObject var17) {
        f17940(var17);
        f17931(var17, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17935(final SubLObject var17) {
        assert NIL != f17927(var17) : var17;
        return f17928(var17);
    }
    
    public static SubLObject f17942(final SubLObject var17) {
        assert NIL != f17927(var17) : var17;
        return f17929(var17);
    }
    
    public static SubLObject f17943(final SubLObject var17, final SubLObject var18, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != f17927(var17) : var17;
        final SubLObject var20 = f17942(var17);
        return conses_high.getf(var20, var18, var19);
    }
    
    public static SubLObject f17944(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic26$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic26$);
        var25 = var23.first();
        var23 = var23.rest();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var23;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29_30 = (SubLObject)NIL;
        while (NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic26$);
            var29_30 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic26$);
            if (NIL == conses_high.member(var29_30, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var28 = (SubLObject)T;
            }
            if (var29_30 == $ic28$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (NIL != var28 && NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic26$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var23);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31;
        var23 = (var31 = var24);
        final SubLObject var32 = (SubLObject)$ic30$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var32, var25, (SubLObject)$ic32$, (SubLObject)$ic29$, var30), (SubLObject)ConsesLow.list((SubLObject)$ic33$, var32), ConsesLow.append(var31, (SubLObject)NIL));
    }
    
    public static SubLObject f17945() {
        return $g2581$.getGlobalValue();
    }
    
    public static SubLObject f17939(final SubLObject var15) {
        final SubLObject var16 = Hashtables.gethash(var15, $g2581$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return var16;
    }
    
    public static SubLObject f17938(final SubLObject var17) {
        assert NIL != f17927(var17) : var17;
        final SubLObject var18 = f17935(var17);
        Hashtables.sethash(var18, $g2581$.getGlobalValue(), var17);
        return var17;
    }
    
    public static SubLObject f17940(final SubLObject var17) {
        assert NIL != f17927(var17) : var17;
        final SubLObject var18 = f17935(var17);
        Hashtables.remhash(var18, $g2581$.getGlobalValue());
        return var17;
    }
    
    public static SubLObject f17946(final SubLObject var15, final SubLObject var35, final SubLObject var16) {
        SubLObject var36 = conses_high.copy_list(var16);
        var36 = conses_high.putf(var16, (SubLObject)$ic36$, var35);
        final SubLObject var37 = f17936(var15, var36);
        return var37;
    }
    
    public static SubLObject f17947(final SubLObject var17) {
        return f17943(var17, (SubLObject)$ic36$, (SubLObject)NIL);
    }
    
    public static SubLObject f17948(final SubLObject var13) {
        return module0035.sublisp_boolean(f17939(var13));
    }
    
    public static SubLObject f17949(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL == var13 || (var13.isCons() && NIL != f17948(var13.first())));
    }
    
    public static SubLObject f17950(final SubLObject var18, final SubLObject var37) {
        if (!var18.isKeyword()) {
            return (SubLObject)NIL;
        }
        SubLObject var38 = (SubLObject)NIL;
        var38 = Sequences.find(var18, $g2582$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic38$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
        if (NIL != var38) {
            return Functions.funcall(var38, var37);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17951(final SubLObject var13) {
        if (NIL == module0035.f2327(var13)) {
            return (SubLObject)NIL;
        }
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        for (var14 = (SubLObject)NIL, var14 = var13; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            if (NIL == f17950(var15, var16)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f17952(final SubLObject var15, final SubLObject var16) {
        assert NIL != f17951(var16) : var16;
        final SubLObject var17 = f17946(var15, (SubLObject)$ic40$, var16);
        return var17;
    }
    
    public static SubLObject f17953(final SubLObject var40) {
        return f17943(f17939(var40), (SubLObject)$ic41$, (SubLObject)NIL);
    }
    
    public static SubLObject f17954(final SubLObject var40) {
        return f17943(f17939(var40), (SubLObject)$ic42$, (SubLObject)NIL);
    }
    
    public static SubLObject f17955() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17925", "S#20464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17927", "S#20463", 1, 0, false);
        new $f17927$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17928", "S#20465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17929", "S#20466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17930", "S#20467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17931", "S#20468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17932", "S#20469", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17933", "S#20470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17934", "S#20471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17926", "S#20472", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17936", "S#20473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17937", "S#20474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17941", "S#20475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17935", "S#20476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17942", "S#20477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17943", "S#20478", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0272", "f17944", "S#20479");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17945", "S#20480", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17939", "S#20481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17938", "S#20482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17940", "S#20483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17946", "S#20484", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17947", "S#20485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17948", "S#20486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17949", "S#20487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17950", "S#20488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17951", "S#20489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17952", "S#20490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17953", "S#20491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0272", "f17954", "S#20492", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17956() {
        $g2580$ = SubLFiles.defconstant("S#20493", (SubLObject)$ic0$);
        $g2581$ = SubLFiles.deflexical("S#20494", (NIL != Symbols.boundp((SubLObject)$ic24$)) ? $g2581$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic25$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2582$ = SubLFiles.deflexical("S#20495", (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17957() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2580$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2580$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        module0003.f57((SubLObject)$ic24$);
        module0002.f50((SubLObject)$ic34$, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17955();
    }
    
    public void initializeVariables() {
        f17956();
    }
    
    public void runTopLevelForms() {
        f17957();
    }
    
    static {
        me = (SubLFile)new module0272();
        $g2580$ = null;
        $g2581$ = null;
        $g2582$ = null;
        $ic0$ = makeSymbol("S#20462", "CYC");
        $ic1$ = makeSymbol("S#20463", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("PLIST"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#20465", "CYC"), (SubLObject)makeSymbol("S#20466", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#20467", "CYC"), (SubLObject)makeSymbol("S#20468", "CYC"));
        $ic6$ = makeSymbol("S#20472", "CYC");
        $ic7$ = makeSymbol("S#20464", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#20463", "CYC"));
        $ic9$ = makeSymbol("S#20465", "CYC");
        $ic10$ = makeSymbol("S#20467", "CYC");
        $ic11$ = makeSymbol("S#20466", "CYC");
        $ic12$ = makeSymbol("S#20468", "CYC");
        $ic13$ = makeKeyword("NAME");
        $ic14$ = makeKeyword("PLIST");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#20469", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#20471", "CYC");
        $ic21$ = makeString("[WFF Module: ~a]");
        $ic22$ = makeSymbol("S#748", "CYC");
        $ic23$ = makeKeyword("FREE");
        $ic24$ = makeSymbol("S#20494", "CYC");
        $ic25$ = makeInteger(212);
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#20496", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic28$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic29$ = makeKeyword("DONE");
        $ic30$ = makeUninternedSymbol("US#333F606");
        $ic31$ = makeSymbol("DO-HASH-TABLE");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#20480", "CYC"));
        $ic33$ = makeSymbol("IGNORE");
        $ic34$ = makeSymbol("S#20480", "CYC");
        $ic35$ = makeSymbol("S#20479", "CYC");
        $ic36$ = makeKeyword("MODULE-TYPE");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("EXPLAIN-FUNC"), (SubLObject)makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("COMMENT"), (SubLObject)makeSymbol("STRINGP")));
        $ic38$ = makeSymbol("CAR");
        $ic39$ = makeSymbol("S#20489", "CYC");
        $ic40$ = makeKeyword("VIOLATION");
        $ic41$ = makeKeyword("EXPLAIN-FUNC");
        $ic42$ = makeKeyword("EXPLAIN-ARGS");
    }
    
    public static final class $sX20462_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $plist;
        public static final SubLStructDeclNative structDecl;
        
        public $sX20462_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX20462_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX20462_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$name", "$plist" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f17927$UnaryFunction extends UnaryFunction
    {
        public $f17927$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20463"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f17927(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/