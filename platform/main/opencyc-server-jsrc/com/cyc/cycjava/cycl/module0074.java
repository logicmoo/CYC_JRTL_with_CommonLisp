package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0074 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0074";
    public static final String myFingerPrint = "6e1e2aafeccd7a124af8e98da861614af90f8b6dcc4f389efa86bdd3b9decb19";
    public static SubLSymbol $g1129$;
    public static SubLSymbol $g1130$;
    public static SubLSymbol $g1131$;
    public static SubLSymbol $g1132$;
    public static SubLSymbol $g1133$;
    private static SubLSymbol $g1134$;
    private static SubLSymbol $g1135$;
    private static SubLSymbol $g1136$;
    private static SubLSymbol $g1137$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    
    public static SubLObject f5149() {
        return module0026.f1374(module0026.f1349((SubLObject)$ic5$), $g1131$.getGlobalValue());
    }
    
    public static SubLObject f5150() {
        return module0026.f1374(module0026.f1349((SubLObject)$ic5$), $g1132$.getGlobalValue());
    }
    
    public static SubLObject f5151() {
        final SubLObject var1 = f5149();
        return (SubLObject)((NIL != var1) ? module0026.f1379(var1) : NIL);
    }
    
    public static SubLObject f5152(final SubLObject var2) {
        final SubLObject var3 = f5149();
        return (SubLObject)((NIL != var3) ? module0026.f1377(var3, var2) : NIL);
    }
    
    public static SubLObject f5153(final SubLObject var3) {
        final SubLObject var4 = f5150();
        return (SubLObject)((NIL != var4) ? module0026.f1377(var4, var3) : NIL);
    }
    
    public static SubLObject f5154() {
        return module0026.f1374(module0026.f1349((SubLObject)$ic5$), $g1130$.getGlobalValue());
    }
    
    public static SubLObject f5155() {
        return module0026.f1379(f5154());
    }
    
    public static SubLObject f5156() {
        final SubLObject var5 = module0026.f1374(module0026.f1349((SubLObject)$ic5$), $g1133$.getGlobalValue());
        if (NIL != var5) {
            final SubLObject var6 = module0026.f1377(var5, (SubLObject)$ic6$);
            if (NIL != var6) {
                return module0026.f1371(var6);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5157(final SubLObject var7, final SubLObject var8) {
        assert NIL != module0026.f1357(var7) : var7;
        assert NIL != Types.listp(var8) : var8;
        SubLObject var9 = var7;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = module0026.f1377(var9, var11);
            if (NIL == module0026.f1357(var9)) {
                return (SubLObject)NIL;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var9;
    }
    
    public static SubLObject f5158(final SubLObject var12) {
        final SubLObject var13 = module0026.f1379(var12);
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = Sort.sort(var13, (SubLObject)$ic9$, (SubLObject)$ic10$);
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            var14 = (SubLObject)ConsesLow.cons(f5159(var16), var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f5159(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0026.f1371(module0026.f1377(var15, $g1134$.getGlobalValue()));
        final SubLObject var18 = module0026.f1371(module0026.f1377(var15, $g1135$.getGlobalValue()));
        if (NIL != Strings.string_equal($g1136$.getGlobalValue(), var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var17;
        }
        if (NIL != Strings.string_equal($g1137$.getGlobalValue(), var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var16.resetMultipleValues();
            final SubLObject var19 = f5160(var17, (SubLObject)UNPROVIDED);
            final SubLObject var20 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            return Symbols.symbol_value(Packages.find_symbol(var20, Packages.find_package(var19)));
        }
        return var17;
    }
    
    public static SubLObject f5160(final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)$ic15$;
        }
        final SubLObject var22 = Sequences.delete_if(Symbols.symbol_function((SubLObject)$ic16$), module0038.f2752(var20, (SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1995(var22, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return Values.values(var22.first(), conses_high.second(var22));
        }
        return Values.values(var21, var22.first());
    }
    
    public static SubLObject f5161() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5149", "S#6753", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5150", "S#6754", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5151", "S#6755", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5152", "S#6756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5153", "S#6757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5154", "S#6758", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5155", "S#6759", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5156", "S#6760", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5157", "S#6761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5158", "S#6762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5159", "S#6763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0074", "f5160", "S#6764", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5162() {
        $g1129$ = SubLFiles.deflexical("S#6765", (SubLObject)$ic0$);
        $g1130$ = SubLFiles.deflexical("S#6766", (SubLObject)$ic1$);
        $g1131$ = SubLFiles.deflexical("S#6767", (SubLObject)$ic2$);
        $g1132$ = SubLFiles.deflexical("S#6768", (SubLObject)$ic3$);
        $g1133$ = SubLFiles.deflexical("S#6769", (SubLObject)$ic4$);
        $g1134$ = SubLFiles.deflexical("S#6770", (SubLObject)$ic11$);
        $g1135$ = SubLFiles.deflexical("S#6771", (SubLObject)$ic12$);
        $g1136$ = SubLFiles.deflexical("S#6772", (SubLObject)$ic13$);
        $g1137$ = SubLFiles.deflexical("S#6773", (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5163() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5161();
    }
    
    public void initializeVariables() {
        f5162();
    }
    
    public void runTopLevelForms() {
        f5163();
    }
    
    static {
        me = (SubLFile)new module0074();
        $g1129$ = null;
        $g1130$ = null;
        $g1131$ = null;
        $g1132$ = null;
        $g1133$ = null;
        $g1134$ = null;
        $g1135$ = null;
        $g1136$ = null;
        $g1137$ = null;
        $ic0$ = makeString(".");
        $ic1$ = makeString("os");
        $ic2$ = makeString("application");
        $ic3$ = makeString("external");
        $ic4$ = makeString("license-keys");
        $ic5$ = makeKeyword("LEAST-PRIVILEGED");
        $ic6$ = makeString("master-license-key");
        $ic7$ = makeSymbol("S#2435", "CYC");
        $ic8$ = makeSymbol("LISTP");
        $ic9$ = makeSymbol("STRING<");
        $ic10$ = makeSymbol("S#2476", "CYC");
        $ic11$ = makeString("value");
        $ic12$ = makeString("interpretation");
        $ic13$ = makeString("literal");
        $ic14$ = makeString("symbol-value");
        $ic15$ = makeString("CYC");
        $ic16$ = makeSymbol("S#3962", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)Characters.CHAR_colon);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/