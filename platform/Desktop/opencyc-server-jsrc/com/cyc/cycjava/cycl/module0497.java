package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var3 = (SubLObject)module0497.NIL;
        SubLObject var4 = (SubLObject)module0497.NIL;
        SubLObject var5 = (SubLObject)module0497.NIL;
        SubLObject var6 = (SubLObject)module0497.NIL;
        try {
            var2.throwStack.push(module0497.$ic0$);
            final SubLObject var7 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0497.$ic1$), var2);
                try {
                    final SubLObject var8 = module0205.f13136(var1);
                    if (var8.eql(module0497.$ic2$)) {
                        var4 = module0205.f13204(var1, (SubLObject)module0497.UNPROVIDED);
                    }
                    else if (var8.eql(module0497.$ic3$)) {
                        var4 = module0205.f13203(var1, (SubLObject)module0497.UNPROVIDED);
                    }
                    var3 = module0112.f7688(var4);
                    var5 = (SubLObject)module0497.T;
                }
                catch (Throwable var9) {
                    Errors.handleThrowable(var9, (SubLObject)module0497.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var7, var2);
            }
        }
        catch (Throwable var10) {
            var6 = Errors.handleThrowable(var10, (SubLObject)module0497.$ic0$);
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
        if (module0497.NIL == module0373.f26113() || module0497.NIL != module0361.f24169(module0373.f26113())) {
            return f32177(var1);
        }
        return Values.values((SubLObject)module0497.NIL, (SubLObject)module0497.NIL);
    }
    
    public static SubLObject f32180() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32177", "S#35574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32178", "S#35575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0497", "f32179", "S#35576", 1, 0, false);
        return (SubLObject)module0497.NIL;
    }
    
    public static SubLObject f32181() {
        module0497.$g3774$ = SubLFiles.deflexical("S#35577", (module0497.NIL != Symbols.boundp((SubLObject)module0497.$ic4$)) ? module0497.$g3774$.getGlobalValue() : module0497.$ic5$);
        module0497.$g3775$ = SubLFiles.defparameter("S#35578", module0018.$g659$.getGlobalValue());
        module0497.$g3776$ = SubLFiles.defparameter("S#35579", module0497.$g3775$.getDynamicValue());
        return (SubLObject)module0497.NIL;
    }
    
    public static SubLObject f32182() {
        module0003.f57((SubLObject)module0497.$ic4$);
        module0132.f8593((SubLObject)module0497.$ic4$, module0497.$ic6$);
        module0340.f22938(module0497.$ic6$);
        module0358.f23773((SubLObject)module0497.$ic7$, module0497.$ic6$);
        module0358.f23773((SubLObject)module0497.$ic8$, module0497.$ic6$);
        module0340.f22941((SubLObject)module0497.$ic9$, (SubLObject)module0497.$ic10$);
        module0340.f22941((SubLObject)module0497.$ic11$, (SubLObject)module0497.$ic12$);
        return (SubLObject)module0497.NIL;
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
        module0497.$g3774$ = null;
        module0497.$g3775$ = null;
        module0497.$g3776$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic1$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#35577", "CYC");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL"));
        $ic7$ = SubLObjectFactory.makeKeyword("POS");
        $ic8$ = SubLObjectFactory.makeKeyword("NEG");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35578", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0497.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34788", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34788", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35575", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35577", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$performSubL <fully-bound>)\n     by evaluating the argument as a SubL expression and succeeding if the evaluation completed."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$performSubL (#$ExpandSubLFn () (print :DONE)))  \n    or\n    (#$performSubL (#$SubLQuoteFn (print :DONE)))") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35579", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0497.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34788", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34788", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35575", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35577", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$performSubL <fully-bound>))\n by evaluating the argument as a SubL expression and succeeding if the evaluation failed to complete."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$performSubL (#$ExpandSubLFn () (/ 1 0)))) or\n    (#$not (#$performSubL (#$SubLQuoteFn (/ 1 0))))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0497.class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/