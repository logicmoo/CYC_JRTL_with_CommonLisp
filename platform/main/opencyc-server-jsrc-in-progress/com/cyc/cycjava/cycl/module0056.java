package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0056 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0056";
    public static final String myFingerPrint = "2c9cb4d6c59cfd261cec6fde466ae4a22377ac81f053bfa23d0dacb169906488";
    public static SubLSymbol $g1039$;
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
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    
    public static SubLObject f4133(final SubLObject var1, final SubLObject var2) {
        f4134(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4135(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5616_native.class) ? T : NIL);
    }
    
    public static SubLObject f4136(final SubLObject var1) {
        assert NIL != f4135(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4137(final SubLObject var1) {
        assert NIL != f4135(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4138(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4135(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4139(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4135(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4140(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5616_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f4138(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f4139(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4141(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f4136(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f4137(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f4142(final SubLObject var11, final SubLObject var12) {
        return f4141(var11, var12);
    }
    
    public static SubLObject f4134(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic21$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f4136(var13), var2);
            print_high.princ(f4143(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic22$, var2, $ic23$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f4144(final SubLObject var19) {
        return (SubLObject)makeBoolean($ic24$ == var19 || $ic25$ == var19);
    }
    
    public static SubLObject f4145(final SubLObject var20) {
        assert NIL != f4144(var20) : var20;
        final SubLObject var21 = f4140((SubLObject)UNPROVIDED);
        if (var20.eql((SubLObject)$ic24$)) {
            f4138(var21, (SubLObject)$ic24$);
            f4139(var21, module0055.f4017());
        }
        else if (var20.eql((SubLObject)$ic25$)) {
            f4138(var21, (SubLObject)$ic25$);
            f4139(var21, module0054.f3968());
        }
        return var21;
    }
    
    public static SubLObject f4146(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            module0055.f4018(f4137(var13));
        }
        else if (var14.eql((SubLObject)$ic25$)) {
            module0054.f3969(f4137(var13));
        }
        return var13;
    }
    
    public static SubLObject f4147(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            return module0055.f4019(f4137(var13));
        }
        if (var14.eql((SubLObject)$ic25$)) {
            return module0054.f3970(f4137(var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4143(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            return module0055.f4016(f4137(var13));
        }
        if (var14.eql((SubLObject)$ic25$)) {
            return module0054.f3967(f4137(var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4148(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            return module0055.f4020(f4137(var13));
        }
        if (var14.eql((SubLObject)$ic25$)) {
            return module0054.f3972(f4137(var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4149(final SubLObject var21, final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var22 = f4136(var13);
        if (var22.eql((SubLObject)$ic24$)) {
            module0055.f4021(var21, f4137(var13));
        }
        else if (var22.eql((SubLObject)$ic25$)) {
            module0054.f3973(var21, f4137(var13));
        }
        return var13;
    }
    
    public static SubLObject f4150(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            return module0055.f4023(f4137(var13));
        }
        if (var14.eql((SubLObject)$ic25$)) {
            return module0054.f3974(f4137(var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4151(final SubLObject var13) {
        assert NIL != f4135(var13) : var13;
        final SubLObject var14 = f4136(var13);
        if (var14.eql((SubLObject)$ic24$)) {
            return module0055.f4030(f4137(var13));
        }
        if (var14.eql((SubLObject)$ic25$)) {
            return module0054.f3975(f4137(var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4152(final SubLObject var22, final SubLObject var13, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != f4135(var13) : var13;
        final SubLObject var24 = f4136(var13);
        if (var24.eql((SubLObject)$ic24$)) {
            module0055.f4026(var22, f4137(var13), var23);
        }
        else if (var24.eql((SubLObject)$ic25$)) {
            module0054.f3976(var22, f4137(var13), var23);
        }
        return var13;
    }
    
    public static SubLObject f4153() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4133", "S#5618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4135", "S#5617", 1, 0, false);
        new $f4135$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4136", "S#5619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4137", "S#5620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4138", "S#5621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4139", "S#5622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4140", "S#5623", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4141", "S#5624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4142", "S#5625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4134", "S#5626", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4144", "S#5627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4145", "S#5628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4146", "S#5629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4147", "S#5630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4143", "S#5631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4148", "S#5632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4149", "S#5633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4150", "S#5634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4151", "S#5635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0056", "f4152", "S#5636", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4154() {
        $g1039$ = SubLFiles.defconstant("S#5637", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4155() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1039$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1039$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4153();
    }
    
    public void initializeVariables() {
        f4154();
    }
    
    public void runTopLevelForms() {
        f4155();
    }
    
    static {
        me = (SubLFile)new module0056();
        $g1039$ = null;
        $ic0$ = makeSymbol("S#5616", "CYC");
        $ic1$ = makeSymbol("S#5617", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("DATA"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#5619", "CYC"), (SubLObject)makeSymbol("S#5620", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#5621", "CYC"), (SubLObject)makeSymbol("S#5622", "CYC"));
        $ic6$ = makeSymbol("S#5626", "CYC");
        $ic7$ = makeSymbol("S#5618", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5617", "CYC"));
        $ic9$ = makeSymbol("S#5619", "CYC");
        $ic10$ = makeSymbol("S#5621", "CYC");
        $ic11$ = makeSymbol("S#5620", "CYC");
        $ic12$ = makeSymbol("S#5622", "CYC");
        $ic13$ = makeKeyword("TYPE");
        $ic14$ = makeKeyword("DATA");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#5623", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#5625", "CYC");
        $ic21$ = makeString("#<");
        $ic22$ = makeKeyword("STREAM");
        $ic23$ = makeKeyword("BASE");
        $ic24$ = makeKeyword("QUEUE");
        $ic25$ = makeKeyword("STACK");
        $ic26$ = makeSymbol("S#5627", "CYC");
    }
    
    public static final class $sX5616_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $data;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5616_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5616_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5616_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$type", "$data" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f4135$UnaryFunction extends UnaryFunction
    {
        public $f4135$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5617"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f4135(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 91 ms
	
	Decompiled with Procyon 0.5.32.
*/