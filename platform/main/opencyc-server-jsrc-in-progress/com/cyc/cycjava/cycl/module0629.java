package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0629 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0629";
    public static final String myFingerPrint = "75ac80145c9762079103c7e7e9deed49dfb51d6da3fddf7856074d82ac3702c0";
    public static SubLSymbol $g4832$;
    public static SubLSymbol $g4834$;
    public static SubLSymbol $g4833$;
    private static SubLSymbol $g4835$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    
    public static SubLObject f38653(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0106.f7566(var1);
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = var3;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            final SubLObject var8 = Symbols.symbol_name(var7);
            SubLObject var9 = (SubLObject)NIL;
            try {
                var2.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var10 = Errors.$error_handler$.currentBinding(var2);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic0$, var2);
                    try {
                        if (NIL != module0038.f2684(var8, (SubLObject)$ic1$)) {
                            final SubLObject var11 = module0038.f2623(var8, Sequences.length((SubLObject)$ic1$), (SubLObject)UNPROVIDED);
                            module0077.f5326(f38654(var11), var4);
                        }
                        else if (NIL != module0038.f2684(var8, (SubLObject)$ic2$)) {
                            final SubLObject var11 = module0038.f2623(var8, Sequences.length((SubLObject)$ic2$), (SubLObject)UNPROVIDED);
                            module0077.f5326(f38654(var11), var4);
                        }
                        else if (NIL != module0038.f2684(var8, (SubLObject)$ic3$)) {
                            final SubLObject var11 = module0038.f2623(var8, Sequences.length((SubLObject)$ic3$), (SubLObject)UNPROVIDED);
                            module0077.f5326(f38654(var11), var4);
                        }
                        else {
                            Errors.error((SubLObject)$ic4$, var7);
                        }
                    }
                    catch (Throwable var12) {
                        Errors.handleThrowable(var12, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var10, var2);
                }
            }
            catch (Throwable var13) {
                var9 = Errors.handleThrowable(var13, module0003.$g3$.getGlobalValue());
            }
            finally {
                var2.throwStack.pop();
            }
            if (NIL != var9) {
                var5 = (SubLObject)ConsesLow.cons(var9, var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (NIL != var5) {
            Errors.error((SubLObject)$ic5$, var5);
        }
        return conses_high.copy_list(module0077.f5312(var4));
    }
    
    public static SubLObject f38655() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g4832$.setDynamicValue(f38653($g4833$.getDynamicValue(var2)), var2);
        return $g4832$.getDynamicValue(var2);
    }
    
    public static SubLObject f38654(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        try {
            var15.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var17 = Errors.$error_handler$.currentBinding(var15);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic0$, var15);
                try {
                    if (NIL != module0038.f2684(var14, (SubLObject)$ic6$)) {
                        final SubLObject var18 = module0038.f2752(var14, (SubLObject)$ic7$);
                        final SubLObject var19 = module0035.f2113(module0126.f8393(module0038.f2623(conses_high.second(var18), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        final SubLObject var20 = module0035.f2113(module0126.f8393(module0038.f2623(conses_high.third(var18), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        return module0172.f10922((SubLObject)ConsesLow.list($ic9$, (SubLObject)ConsesLow.list($ic10$, var19, var20)));
                    }
                    if (NIL != module0038.f2684(var14, (SubLObject)$ic11$)) {
                        final SubLObject var18 = module0038.f2752(var14, (SubLObject)$ic7$);
                        final SubLObject var19 = module0035.f2113(module0126.f8393(module0038.f2623(conses_high.second(var18), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        final SubLObject var20 = module0035.f2113(module0126.f8393(module0038.f2623(conses_high.third(var18), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        final SubLObject var21 = module0035.f2113(module0126.f8393(module0038.f2623(conses_high.fourth(var18), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        return module0172.f10922((SubLObject)ConsesLow.list($ic9$, (SubLObject)ConsesLow.list($ic10$, var19, var20, var21)));
                    }
                    return module0035.f2113(module0126.f8393(var14, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                catch (Throwable var22) {
                    Errors.handleThrowable(var22, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var17, var15);
            }
        }
        catch (Throwable var23) {
            var16 = Errors.handleThrowable(var23, module0003.$g3$.getGlobalValue());
        }
        finally {
            var15.throwStack.pop();
        }
        if (NIL != var16) {
            Errors.error((SubLObject)$ic12$, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38656(final SubLObject var20) {
        if (NIL != module0167.f10813(var20)) {
            if (module0205.f13365(var20).eql($ic9$)) {
                final SubLObject var21 = module0205.f13277(var20, (SubLObject)UNPROVIDED).rest();
                final SubLObject var23;
                final SubLObject var22 = var23 = Sequences.length(var21);
                if (var23.eql((SubLObject)TWO_INTEGER)) {
                    return Sequences.cconcatenate((SubLObject)$ic13$, new SubLObject[] { module0006.f203(module0038.f2867(module0597.f36628(var21.first()), (SubLObject)UNPROVIDED)), $ic14$, module0006.f203(module0038.f2867(module0597.f36628(conses_high.second(var21)), (SubLObject)UNPROVIDED)) });
                }
                if (var23.eql((SubLObject)THREE_INTEGER)) {
                    return Sequences.cconcatenate((SubLObject)$ic15$, new SubLObject[] { module0006.f203(module0038.f2867(module0597.f36628(var21.first()), (SubLObject)UNPROVIDED)), $ic14$, module0006.f203(module0038.f2867(module0597.f36628(conses_high.second(var21)), (SubLObject)UNPROVIDED)), $ic16$, module0006.f203(module0038.f2867(module0597.f36628(conses_high.third(var21)), (SubLObject)UNPROVIDED)) });
                }
                Errors.error((SubLObject)$ic17$, var20);
            }
            return (SubLObject)NIL;
        }
        return module0038.f2867(module0597.f36628(var20), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38657() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g4834$.getDynamicValue(var2);
    }
    
    public static SubLObject f38658(final SubLObject var23) {
        assert NIL != module0161.f10481(var23) : var23;
        $g4834$.setDynamicValue(var23);
        return f38657();
    }
    
    public static SubLObject f38659(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var24) : var24;
        $g4833$.setDynamicValue(module0106.f7561(var24), var25);
        return $g4833$.getDynamicValue(var25);
    }
    
    public static SubLObject f38660() {
        $g4833$.setDynamicValue((SubLObject)NIL);
        $g4832$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38661() {
        final SubLObject var25 = $g4835$.getGlobalValue();
        if (NIL != var25) {
            module0034.f1818(var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38662(final SubLObject var26, final SubLObject var24, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g4834$.getDynamicValue();
        }
        return module0034.f1829($g4835$.getGlobalValue(), (SubLObject)ConsesLow.list(var26, var24, var23), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38663(final SubLObject var26, final SubLObject var24, final SubLObject var23) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != module0206.f13450(var26) : var26;
        if (NIL == $g4833$.getDynamicValue(var27)) {
            f38659(var24);
        }
        if (NIL == $g4832$.getDynamicValue(var27)) {
            f38655();
        }
        final SubLObject var28 = $g4832$.getDynamicValue(var27);
        final SubLObject var29 = module0078.f5367(module0259.f16857(var26, var28, var23, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0078.f5367((SubLObject)((NIL != module0210.f13572(var26)) ? module0259.f16996(var26, var28, var23, (SubLObject)UNPROVIDED) : NIL), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0078.f5367((SubLObject)((NIL != module0210.f13565(var26)) ? module0256.f16575(var26, var28, var23, (SubLObject)UNPROVIDED) : NIL), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = var28;
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            final SubLObject var35 = f38656(var34);
            final SubLObject var36 = Symbols.make_keyword(Strings.string_upcase(Sequences.cconcatenate((SubLObject)$ic1$, var35), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var37 = Symbols.make_keyword(Strings.string_upcase(Sequences.cconcatenate((SubLObject)$ic2$, var35), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var38 = Symbols.make_keyword(Strings.string_upcase(Sequences.cconcatenate((SubLObject)$ic3$, var35), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var39 = (SubLObject)((NIL != module0077.f5320(var34, var29)) ? $ic26$ : $ic27$);
            final SubLObject var40 = (SubLObject)((NIL != module0077.f5320(var34, var30)) ? $ic26$ : $ic27$);
            final SubLObject var41 = (SubLObject)((NIL != module0077.f5320(var34, var31)) ? $ic26$ : $ic27$);
            var32 = conses_high.putf(var32, var36, var39);
            var32 = conses_high.putf(var32, var37, var40);
            var32 = conses_high.putf(var32, var38, var41);
            var33 = var33.rest();
            var34 = var33.first();
        }
        final SubLObject var43;
        final SubLObject var42 = var43 = module0106.f7563($g4833$.getDynamicValue(var27), var32);
        if (var43.eql((SubLObject)$ic28$)) {
            return (SubLObject)T;
        }
        if (var43.eql((SubLObject)$ic29$)) {
            return (SubLObject)NIL;
        }
        return Errors.error((SubLObject)$ic30$, var42);
    }
    
    public static SubLObject f38664(final SubLObject var26, final SubLObject var24, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g4834$.getDynamicValue();
        }
        SubLObject var27 = $g4835$.getGlobalValue();
        if (NIL == var27) {
            var27 = module0034.f1934((SubLObject)$ic24$, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic33$);
        }
        final SubLObject var28 = module0034.f1781(var26, var24, var23);
        final SubLObject var29 = module0034.f1814(var27, var28, (SubLObject)UNPROVIDED);
        if (var29 != $ic34$) {
            SubLObject var30 = var29;
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                SubLObject var32 = var31.first();
                final SubLObject var33 = conses_high.second(var31);
                if (var26.equal(var32.first())) {
                    var32 = var32.rest();
                    if (var24.equal(var32.first())) {
                        var32 = var32.rest();
                        if (NIL != var32 && NIL == var32.rest() && var23.equal(var32.first())) {
                            return module0034.f1959(var33);
                        }
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        final SubLObject var34 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f38663(var26, var24, var23)));
        module0034.f1836(var27, var28, var29, var34, (SubLObject)ConsesLow.list(var26, var24, var23));
        return module0034.f1959(var34);
    }
    
    public static SubLObject f38665() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38653", "S#42288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38655", "S#42289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38654", "S#42290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38656", "S#42291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38657", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38658", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38659", "S#42292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38660", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38661", "S#42293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38662", "S#42294", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38663", "S#42295", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0629", "f38664", "S#42296", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38666() {
        $g4832$ = SubLFiles.defparameter("S#42297", (SubLObject)NIL);
        $g4834$ = SubLFiles.defparameter("S#42298", $ic18$);
        $g4833$ = SubLFiles.defparameter("S#42299", (SubLObject)NIL);
        $g4835$ = SubLFiles.deflexical("S#42300", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38667() {
        module0002.f38((SubLObject)$ic19$);
        module0002.f38((SubLObject)$ic20$);
        module0002.f38((SubLObject)$ic23$);
        module0034.f1909((SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38665();
    }
    
    public void initializeVariables() {
        f38666();
    }
    
    public void runTopLevelForms() {
        f38667();
    }
    
    static {
        me = (SubLFile)new module0629();
        $g4832$ = null;
        $g4834$ = null;
        $g4833$ = null;
        $g4835$ = null;
        $ic0$ = makeSymbol("S#38", "CYC");
        $ic1$ = makeString("ISA_");
        $ic2$ = makeString("QUOTEDISA_");
        $ic3$ = makeString("GENLS_");
        $ic4$ = makeString("Unexpected term classification tree property ~s");
        $ic5$ = makeString("Creation of collections from a Term Classification Tree failed due to the following errors: ~%~A~%");
        $ic6$ = makeString("CU2FN_");
        $ic7$ = ConsesLow.list((SubLObject)Characters.CHAR_underbar);
        $ic8$ = makeSymbol("S#5859", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionUnionFn"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic11$ = makeString("CU3FN_");
        $ic12$ = makeString("Unable to find a constant when executing (CONSTANT-FROM-TREE-TERM ~S)");
        $ic13$ = makeString("CU2FN_1");
        $ic14$ = makeString("_2");
        $ic15$ = makeString("CU3FN_1");
        $ic16$ = makeString("_3");
        $ic17$ = makeString("Invalid NAT being converted to tree-term: ~S");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic19$ = makeSymbol("TERM-CLASSIFICATION-TREE-MT");
        $ic20$ = makeSymbol("SET-TERM-CLASSIFICATION-TREE-MT");
        $ic21$ = makeSymbol("S#12263", "CYC");
        $ic22$ = makeSymbol("STRINGP");
        $ic23$ = makeSymbol("RESET-TERM-CLASSIFICATION-TREE");
        $ic24$ = makeSymbol("S#42296", "CYC");
        $ic25$ = makeSymbol("CYCL-TERM-P");
        $ic26$ = makeKeyword("T");
        $ic27$ = makeKeyword("F");
        $ic28$ = makeSymbol("S#42301", "CYC");
        $ic29$ = makeSymbol("S#42302", "CYC");
        $ic30$ = makeString("Unexpected term classification tree evaluation ~s");
        $ic31$ = makeSymbol("S#42300", "CYC");
        $ic32$ = makeInteger(5000);
        $ic33$ = makeSymbol("S#42293", "CYC");
        $ic34$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/