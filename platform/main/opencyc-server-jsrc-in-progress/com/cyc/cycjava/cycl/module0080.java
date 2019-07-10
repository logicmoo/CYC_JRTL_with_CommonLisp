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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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

public final class module0080 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0080";
    public static final String myFingerPrint = "9646675d5d0d965bddc6b59dbbe3f5d139563b5da75488c72108496c3cb83f49";
    public static SubLSymbol $g1162$;
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
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    
    public static SubLObject f5506(final SubLObject var1) {
        assert NIL != module0079.f5404(var1) : var1;
        return f5507(var1);
    }
    
    public static SubLObject f5508(final SubLObject var2, final SubLObject var3) {
        f5509(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5510(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX7130_native.class) ? T : NIL);
    }
    
    public static SubLObject f5511(final SubLObject var2) {
        assert NIL != f5510(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f5512(final SubLObject var2) {
        assert NIL != f5510(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f5513(final SubLObject var2) {
        assert NIL != f5510(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f5514(final SubLObject var2, final SubLObject var5) {
        assert NIL != f5510(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f5515(final SubLObject var2, final SubLObject var5) {
        assert NIL != f5510(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f5516(final SubLObject var2, final SubLObject var5) {
        assert NIL != f5510(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f5517(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX7130_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic16$)) {
                f5514(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic17$)) {
                f5515(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic18$)) {
                f5516(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic19$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f5518(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic16$, f5511(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic17$, f5512(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic18$, f5513(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic23$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        return var12;
    }
    
    public static SubLObject f5519(final SubLObject var12, final SubLObject var13) {
        return f5518(var12, var13);
    }
    
    public static SubLObject f5509(final SubLObject var14, final SubLObject var3, final SubLObject var15) {
        PrintLow.format(var3, (SubLObject)$ic25$, f5520(var14));
        return var14;
    }
    
    public static SubLObject f5521(final SubLObject var14) {
        return (SubLObject)T;
    }
    
    public static SubLObject f5522(final SubLObject var14) {
        return module0079.f5406(f5520(var14));
    }
    
    public static SubLObject f5523(final SubLObject var14) {
        return module0079.f5408(f5520(var14));
    }
    
    public static SubLObject f5524(final SubLObject var14, final SubLObject var16, final SubLObject var17) {
        return f5525(var14, var16, var17);
    }
    
    public static SubLObject f5525(final SubLObject var18, final SubLObject var16, final SubLObject var17) {
        f5526(var18);
        return module0079.f5412(f5520(var18), var16, var17);
    }
    
    public static SubLObject f5527(final SubLObject var14, final SubLObject var16, final SubLObject var19) {
        return f5528(var14, var16, var19);
    }
    
    public static SubLObject f5528(final SubLObject var18, final SubLObject var16, final SubLObject var19) {
        return module0079.f5414(f5520(var18), var16, var19);
    }
    
    public static SubLObject f5529(final SubLObject var14, final SubLObject var16, final SubLObject var19) {
        return f5530(var14, var16, var19);
    }
    
    public static SubLObject f5530(final SubLObject var18, final SubLObject var16, final SubLObject var19) {
        return module0079.f5416(f5520(var18), var16, var19);
    }
    
    public static SubLObject f5531(final SubLObject var14, final SubLObject var16) {
        return f5532(var14, var16);
    }
    
    public static SubLObject f5532(final SubLObject var18, final SubLObject var16) {
        f5533(var18);
        return module0079.f5418(f5520(var18), var16);
    }
    
    public static SubLObject f5534(final SubLObject var14, final SubLObject var20, final SubLObject var21) {
        return f5507(module0079.f5427(f5520(var14)));
    }
    
    public static SubLObject f5535(final SubLObject var14) {
        return module0079.f5430(f5520(var14), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5536(final SubLObject var14) {
        return module0079.f5424(f5520(var14));
    }
    
    public static SubLObject f5537(final SubLObject var14) {
        return f5538(var14);
    }
    
    public static SubLObject f5538(final SubLObject var18) {
        return module0079.f5420(f5520(var18));
    }
    
    public static SubLObject f5539(final SubLObject var14) {
        return module0079.f5433(f5520(var14));
    }
    
    public static SubLObject f5540(final SubLObject var14) {
        return module0079.f5435(f5520(var14));
    }
    
    public static SubLObject f5507(final SubLObject var1) {
        final SubLObject var2 = f5517((SubLObject)UNPROVIDED);
        f5514(var2, var1);
        f5515(var2, (SubLObject)ZERO_INTEGER);
        f5516(var2, (SubLObject)ZERO_INTEGER);
        return var2;
    }
    
    public static SubLObject f5520(final SubLObject var1) {
        assert NIL != f5510(var1) : var1;
        return f5511(var1);
    }
    
    public static SubLObject f5541(final SubLObject var1) {
        assert NIL != f5510(var1) : var1;
        return f5512(var1);
    }
    
    public static SubLObject f5526(final SubLObject var1) {
        f5515(var1, Numbers.add(f5512(var1), (SubLObject)ONE_INTEGER));
        return f5512(var1);
    }
    
    public static SubLObject f5542(final SubLObject var1) {
        assert NIL != f5510(var1) : var1;
        return f5513(var1);
    }
    
    public static SubLObject f5533(final SubLObject var1) {
        f5516(var1, Numbers.add(f5513(var1), (SubLObject)ONE_INTEGER));
        return f5513(var1);
    }
    
    public static SubLObject f5543(final SubLObject var14) {
        return f5544(var14);
    }
    
    public static SubLObject f5544(final SubLObject var1) {
        return Sxhash.sxhash(f5511(var1));
    }
    
    public static SubLObject f5545() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5506", "S#7132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5508", "S#7133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5510", "S#7131", 1, 0, false);
        new $f5510$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5511", "S#7134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5512", "S#7135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5513", "S#7136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5514", "S#7137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5515", "S#7138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5516", "S#7139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5517", "S#7140", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5518", "S#7141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5519", "S#7142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5509", "S#7143", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5521", "S#7144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5522", "S#7145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5523", "S#7146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5524", "S#7147", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5525", "S#7148", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5527", "S#7149", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5528", "S#7150", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5529", "S#7151", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5530", "S#7152", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5531", "S#7153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5532", "S#7154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5534", "S#7155", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5535", "S#7156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5536", "S#7157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5537", "S#7158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5538", "S#7159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5539", "S#7160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5540", "S#7161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5507", "S#7162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5520", "S#7163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5541", "S#7164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5526", "S#7165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5542", "S#7166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5533", "S#7167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5543", "S#7168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0080", "f5544", "S#7169", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5546() {
        $g1162$ = SubLFiles.defconstant("S#7170", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5547() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        module0012.f419((SubLObject)$ic7$);
        Structures.register_method(module0079.$g1148$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic29$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic30$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic31$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic32$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic33$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic34$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic36$));
        Structures.register_method(module0079.$g1160$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        Structures.register_method(module0079.$g1161$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g1162$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic39$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5545();
    }
    
    public void initializeVariables() {
        f5546();
    }
    
    public void runTopLevelForms() {
        f5547();
    }
    
    static {
        me = (SubLFile)new module0080();
        $g1162$ = null;
        $ic0$ = makeSymbol("S#3046", "CYC");
        $ic1$ = makeSymbol("S#7130", "CYC");
        $ic2$ = makeSymbol("S#7131", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("S#7171", "CYC"), (SubLObject)makeSymbol("S#7172", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("MAP"), (SubLObject)makeKeyword("PUT-COUNT"), (SubLObject)makeKeyword("REMOVE-COUNT"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#7134", "CYC"), (SubLObject)makeSymbol("S#7135", "CYC"), (SubLObject)makeSymbol("S#7136", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#7137", "CYC"), (SubLObject)makeSymbol("S#7138", "CYC"), (SubLObject)makeSymbol("S#7139", "CYC"));
        $ic7$ = makeSymbol("S#7143", "CYC");
        $ic8$ = makeSymbol("S#7133", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7131", "CYC"));
        $ic10$ = makeSymbol("S#7134", "CYC");
        $ic11$ = makeSymbol("S#7137", "CYC");
        $ic12$ = makeSymbol("S#7135", "CYC");
        $ic13$ = makeSymbol("S#7138", "CYC");
        $ic14$ = makeSymbol("S#7136", "CYC");
        $ic15$ = makeSymbol("S#7139", "CYC");
        $ic16$ = makeKeyword("MAP");
        $ic17$ = makeKeyword("PUT-COUNT");
        $ic18$ = makeKeyword("REMOVE-COUNT");
        $ic19$ = makeString("Invalid slot ~S for construction function");
        $ic20$ = makeKeyword("BEGIN");
        $ic21$ = makeSymbol("S#7140", "CYC");
        $ic22$ = makeKeyword("SLOT");
        $ic23$ = makeKeyword("END");
        $ic24$ = makeSymbol("S#7142", "CYC");
        $ic25$ = makeString("<MODIFICATION-COUNTING-MAP ~A>");
        $ic26$ = makeSymbol("S#7144", "CYC");
        $ic27$ = makeSymbol("S#7145", "CYC");
        $ic28$ = makeSymbol("S#7146", "CYC");
        $ic29$ = makeSymbol("S#7147", "CYC");
        $ic30$ = makeSymbol("S#7149", "CYC");
        $ic31$ = makeSymbol("S#7151", "CYC");
        $ic32$ = makeSymbol("S#7153", "CYC");
        $ic33$ = makeSymbol("S#7155", "CYC");
        $ic34$ = makeSymbol("S#7156", "CYC");
        $ic35$ = makeSymbol("S#7157", "CYC");
        $ic36$ = makeSymbol("S#7158", "CYC");
        $ic37$ = makeSymbol("S#7160", "CYC");
        $ic38$ = makeSymbol("S#7161", "CYC");
        $ic39$ = makeSymbol("S#7168", "CYC");
    }
    
    public static final class $sX7130_native extends SubLStructNative
    {
        public SubLObject $map;
        public SubLObject $put_count;
        public SubLObject $remove_count;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7130_native() {
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$put_count = (SubLObject)CommonSymbols.NIL;
            this.$remove_count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7130_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$map;
        }
        
        public SubLObject getField3() {
            return this.$put_count;
        }
        
        public SubLObject getField4() {
            return this.$remove_count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$put_count = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$remove_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7130_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$map", "$put_count", "$remove_count" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f5510$UnaryFunction extends UnaryFunction
    {
        public $f5510$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7131"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f5510(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 99 ms
	
	Decompiled with Procyon 0.5.32.
*/