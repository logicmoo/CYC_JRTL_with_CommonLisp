package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0497 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0497";
    public static final String myFingerPrint = "5e3e6dd7a91752b7a6d3597d7c57eec664024986a5eb0a9b4b727a943f9adc68";
    public static SubLSymbol $g3774$;
    private static SubLSymbol $g3775$;
    private static SubLSymbol $g3776$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f32177(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        try {
            var2.throwStack.push($ic0$);
            final SubLObject var7 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic1$), var2);
                try {
                    final SubLObject var8 = module0205.f13136(var1);
                    if (var8.eql($ic2$)) {
                        var4 = module0205.f13204(var1, (SubLObject)UNPROVIDED);
                    }
                    else if (var8.eql($ic3$)) {
                        var4 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
                    }
                    var3 = module0112.f7688(var4);
                    var5 = (SubLObject)T;
                }
                catch (Throwable var9) {
                    Errors.handleThrowable(var9, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var7, var2);
            }
        }
        catch (Throwable var10) {
            var6 = Errors.handleThrowable(var10, (SubLObject)$ic0$);
        }
        finally {
            var2.throwStack.pop();
        }
        return Values.values(var3, var5);
    }
    
    public static SubLObject f32178(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f32179(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        return var4;
    }
    
    public static SubLObject f32179(final SubLObject var1) {
        if (NIL == module0373.f26113() || NIL != module0361.f24169(module0373.f26113())) {
            return f32177(var1);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f32180() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32177", "S#35574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32178", "S#35575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32179", "S#35576", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32181() {
        $g3774$ = SubLFiles.deflexical("S#35577", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g3774$.getGlobalValue() : $ic5$);
        $g3775$ = SubLFiles.defparameter("S#35578", module0018.$g659$.getGlobalValue());
        $g3776$ = SubLFiles.defparameter("S#35579", $g3775$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32182() {
        module0003.f57((SubLObject)$ic4$);
        module0132.f8593((SubLObject)$ic4$, $ic6$);
        module0340.f22938($ic6$);
        module0358.f23773((SubLObject)$ic7$, $ic6$);
        module0358.f23773((SubLObject)$ic8$, $ic6$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32180();
    }
    
    public void initializeVariables() {
        f32181();
    }
    
    public void runTopLevelForms() {
        f32182();
    }
    
    static {
        me = (SubLFile)new module0497();
        $g3774$ = null;
        $g3775$ = null;
        $g3776$ = null;
        $ic0$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic1$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("ExpandSubLFn"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic4$ = makeSymbol("S#35577", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("performSubL"));
        $ic7$ = makeKeyword("POS");
        $ic8$ = makeKeyword("NEG");
        $ic9$ = makeKeyword("REMOVAL-PERFORM-SUBL-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("performSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("performSubL")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35578", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34788", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC"))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35575", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35577", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$performSubL <fully-bound>)\n     by evaluating the argument as a SubL expression and succeeding if the evaluation completed."), makeKeyword("EXAMPLE"), makeString("(#$performSubL (#$ExpandSubLFn () (print :DONE)))  \n    or\n    (#$performSubL (#$SubLQuoteFn (print :DONE)))") });
        $ic11$ = makeKeyword("REMOVAL-PERFORM-SUBL-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("performSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("performSubL")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35579", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34788", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC"))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35575", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35577", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$performSubL <fully-bound>))\n by evaluating the argument as a SubL expression and succeeding if the evaluation failed to complete."), makeKeyword("EXAMPLE"), makeString("(#$not (#$performSubL (#$ExpandSubLFn () (/ 1 0)))) or\n    (#$not (#$performSubL (#$SubLQuoteFn (/ 1 0))))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/