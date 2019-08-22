package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0091 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0091";
    public static final String myFingerPrint = "4f27c17fce6d309f5b14cfc28020ba9c72da0ef98ea14653f478fb6df699f6cd";
    public static SubLSymbol $g1208$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    
    public static SubLObject f6320(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isSymbol() && NIL != Symbols.boundp(var1));
    }
    
    public static SubLObject f6321(final SubLObject var1) {
        return f6320(var1);
    }
    
    public static SubLObject f6322(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f2015(var1) && NIL != module0035.f2370((SubLObject)$ic0$, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f6323(final SubLObject var2, final SubLObject var3) {
        f6324(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6325(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX8002_native.class) ? T : NIL);
    }
    
    public static SubLObject f6326(final SubLObject var2) {
        assert NIL != f6325(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f6327(final SubLObject var2) {
        assert NIL != f6325(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f6328(final SubLObject var2, final SubLObject var5) {
        assert NIL != f6325(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f6329(final SubLObject var2, final SubLObject var5) {
        assert NIL != f6325(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f6330(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX8002_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic14$)) {
                f6328(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic15$)) {
                f6329(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic16$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f6331(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic19$, (SubLObject)$ic14$, f6326(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic19$, (SubLObject)$ic15$, f6327(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic20$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        return var12;
    }
    
    public static SubLObject f6332(final SubLObject var12, final SubLObject var13) {
        return f6331(var12, var13);
    }
    
    public static SubLObject f6324(final SubLObject var1, final SubLObject var3, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var1, var3);
        }
        else {
            streams_high.write_string((SubLObject)$ic22$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { $ic23$, var3 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            PrintLow.format(var3, (SubLObject)$ic24$, Sequences.length(f6326(var1)));
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            PrintLow.write(Equality.pointer(var1), new SubLObject[] { $ic23$, var3, $ic25$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var3);
        }
        return var1;
    }
    
    public static SubLObject f6333(final SubLObject var1) {
        return Numbers.logxor(Sxhash.sxhash(f6326(var1)), Sxhash.sxhash(f6327(var1)));
    }
    
    public static SubLObject f6334(final SubLObject var20) {
        assert NIL != f6322(var20) : var20;
        final SubLObject var21 = f6330((SubLObject)UNPROVIDED);
        f6328(var21, conses_high.copy_list(var20));
        f6329(var21, (SubLObject)ConsesLow.make_list(Sequences.length(var20), (SubLObject)UNPROVIDED));
        return f6335(var21);
    }
    
    public static SubLObject f6336(final SubLObject var21) {
        assert NIL != f6325(var21) : var21;
        return f6326(var21);
    }
    
    public static SubLObject f6337(final SubLObject var21, final SubLObject var22, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        assert NIL != f6325(var21) : var21;
        assert NIL != f6321(var22) : var22;
        final SubLObject var24 = Sequences.position(var22, f6326(var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var25 = (NIL != var24) ? ConsesLow.nth(var24, f6327(var21)) : var23;
        return Values.values(var25, module0035.sublisp_boolean(var24));
    }
    
    public static SubLObject f6338(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic28$);
        var30 = var29.first();
        final SubLObject var31;
        var29 = (var31 = var29.rest());
        final SubLObject var32 = (SubLObject)$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var32, var30)), (SubLObject)ConsesLow.listS((SubLObject)$ic31$, var32, (SubLObject)$ic32$), (SubLObject)ConsesLow.listS((SubLObject)$ic33$, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var32), (SubLObject)ConsesLow.list((SubLObject)$ic35$, var32), ConsesLow.append(var31, (SubLObject)NIL)));
    }
    
    public static SubLObject f6339(final SubLObject var21) {
        return f6326(var21);
    }
    
    public static SubLObject f6340(final SubLObject var21) {
        return f6327(var21);
    }
    
    public static SubLObject f6335(final SubLObject var21) {
        assert NIL != f6325(var21) : var21;
        f6341(f6327(var21), f6326(var21));
        return var21;
    }
    
    public static SubLObject f6342(final SubLObject var21, final SubLObject var22, final SubLObject var25) {
        assert NIL != f6325(var21) : var21;
        assert NIL != f6321(var22) : var22;
        f6328(var21, (SubLObject)ConsesLow.cons(var22, f6326(var21)));
        f6329(var21, (SubLObject)ConsesLow.cons(var25, f6327(var21)));
        return var21;
    }
    
    public static SubLObject f6341(final SubLObject var32, final SubLObject var33) {
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        for (var34 = (SubLObject)NIL, var35 = (SubLObject)NIL, var34 = var33, var35 = var32; NIL != var34; var34 = var34.rest(), var35 = var35.rest()) {
            var36 = var34.first();
            var37 = Symbols.symbol_value(var36);
            ConsesLow.rplaca(var35, var37);
        }
        return var32;
    }
    
    public static SubLObject f6343(final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != f6325(var21) : var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)NIL, var23 = (SubLObject)NIL, var22 = f6326(var21), var23 = f6327(var21); NIL != var22; var22 = var22.rest(), var23 = var23.rest()) {
            var24 = var22.first();
            var25 = var23.first();
            PrintLow.format(var3, (SubLObject)$ic37$, var24, var25);
        }
        streams_high.force_output(var3);
        return var21;
    }
    
    public static SubLObject f6344() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6320", "S#8004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6321", "S#8005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6322", "S#8006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6323", "S#8007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6325", "S#8003", 1, 0, false);
        new $f6325$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6326", "S#8008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6327", "S#8009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6328", "S#8010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6329", "S#8011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6330", "S#8012", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6331", "S#8013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6332", "S#8014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6324", "S#8015", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6333", "S#8016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6334", "S#8017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6336", "S#8018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6337", "S#8019", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0091", "f6338", "S#8020");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6339", "S#8021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6340", "S#8022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6335", "S#8023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6342", "S#8024", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6341", "S#8025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0091", "f6343", "S#8026", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6345() {
        $g1208$ = SubLFiles.defconstant("S#8027", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6346() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1208$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1208$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic21$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g1208$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        module0002.f50((SubLObject)$ic34$, (SubLObject)$ic36$);
        module0002.f50((SubLObject)$ic35$, (SubLObject)$ic36$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6344();
    }
    
    public void initializeVariables() {
        f6345();
    }
    
    public void runTopLevelForms() {
        f6346();
    }
    
    static {
        me = (SubLFile)new module0091();
        $g1208$ = null;
        $ic0$ = makeSymbol("S#8005", "CYC");
        $ic1$ = makeSymbol("S#8002", "CYC");
        $ic2$ = makeSymbol("S#8003", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("VALUES"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("VARIABLES"), (SubLObject)makeKeyword("VALUES"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#8008", "CYC"), (SubLObject)makeSymbol("S#8009", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#8010", "CYC"), (SubLObject)makeSymbol("S#8011", "CYC"));
        $ic7$ = makeSymbol("S#8015", "CYC");
        $ic8$ = makeSymbol("S#8007", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8003", "CYC"));
        $ic10$ = makeSymbol("S#8008", "CYC");
        $ic11$ = makeSymbol("S#8010", "CYC");
        $ic12$ = makeSymbol("S#8009", "CYC");
        $ic13$ = makeSymbol("S#8011", "CYC");
        $ic14$ = makeKeyword("VARIABLES");
        $ic15$ = makeKeyword("VALUES");
        $ic16$ = makeString("Invalid slot ~S for construction function");
        $ic17$ = makeKeyword("BEGIN");
        $ic18$ = makeSymbol("S#8012", "CYC");
        $ic19$ = makeKeyword("SLOT");
        $ic20$ = makeKeyword("END");
        $ic21$ = makeSymbol("S#8014", "CYC");
        $ic22$ = makeString("#<");
        $ic23$ = makeKeyword("STREAM");
        $ic24$ = makeString("~S variables");
        $ic25$ = makeKeyword("BASE");
        $ic26$ = makeSymbol("S#8016", "CYC");
        $ic27$ = makeSymbol("S#8006", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#8028", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeUninternedSymbol("US#50AF39B");
        $ic30$ = makeSymbol("CLET");
        $ic31$ = makeSymbol("CHECK-TYPE");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#8003", "CYC"));
        $ic33$ = makeSymbol("CPROGV");
        $ic34$ = makeSymbol("S#8021", "CYC");
        $ic35$ = makeSymbol("S#8022", "CYC");
        $ic36$ = makeSymbol("S#8020", "CYC");
        $ic37$ = makeString("~&~S = ~S~%");
    }
    
    public static final class $sX8002_native extends SubLStructNative
    {
        public SubLObject $variables;
        public SubLObject $values;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8002_native() {
            this.$variables = (SubLObject)CommonSymbols.NIL;
            this.$values = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$variables;
        }
        
        public SubLObject getField3() {
            return this.$values;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$variables = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$values = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8002_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$variables", "$values" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f6325$UnaryFunction extends UnaryFunction
    {
        public $f6325$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8003"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f6325(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 101 ms
	
	Decompiled with Procyon 0.5.32.
*/