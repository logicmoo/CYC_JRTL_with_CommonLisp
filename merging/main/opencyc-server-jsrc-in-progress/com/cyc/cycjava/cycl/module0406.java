package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0406 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0406";
    public static final String myFingerPrint = "96a288a92158f013c75b80a8d2e6bd9429c1538cae4dd6fef707e105aa6f7871";
    public static SubLSymbol $g3295$;
    private static SubLSymbol $g3296$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
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
    
    public static SubLObject f28343(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var1) && $ic0$ == module0367.f25035(var1));
    }
    
    public static SubLObject f28344(final SubLObject var2) {
        final SubLObject var3 = module0387.f27544();
        final SubLObject var4 = module0403.f28312(var3);
        module0367.f25070(var2, var4);
        return var2;
    }
    
    public static SubLObject f28345(final SubLObject var2) {
        assert NIL != f28343(var2) : var2;
        return module0387.f27550(module0403.f28313(var2));
    }
    
    public static SubLObject f28346(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0403.f28313(var2);
        SubLObject var5 = (SubLObject)NIL;
        while (NIL == var5) {
            if (NIL != module0387.f27546(var4)) {
                return (SubLObject)NIL;
            }
            var3.resetMultipleValues();
            final SubLObject var6 = module0387.f27548(var4);
            final SubLObject var7 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != module0363.f24505(var6)) {
                module0387.f27549(var4);
            }
            else {
                final SubLObject var8 = f28347(var6, var2);
                if (module0018.$g630$.getDynamicValue(var3).numGE((SubLObject)TWO_INTEGER)) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic4$, var2, var6, var7, var8, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                }
                if (NIL != module0387.f27538(var8, var7)) {
                    module0387.f27549(var4);
                    module0387.f27547(var4, var8, var6);
                }
                else {
                    var5 = var6;
                }
            }
        }
        return var5;
    }
    
    public static SubLObject f28348(final SubLObject var2, final SubLObject var10) {
        assert NIL != module0363.f24478(var10) : var10;
        final SubLObject var11 = module0403.f28313(var2);
        final SubLObject var12 = f28347(var10, var2);
        module0387.f27547(var11, var12, var10);
        module0367.f25098(var2, var10);
        return (SubLObject)T;
    }
    
    public static SubLObject f28349() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (NIL != $g3295$.getDynamicValue(var5)) ? $g3296$.getGlobalValue() : module0078.$g1146$.getGlobalValue();
    }
    
    public static SubLObject f28350(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic7$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic7$);
        var17 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic7$);
        var18 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic7$);
        var19 = var15.first();
        var15 = var15.rest();
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var15;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23_24 = (SubLObject)NIL;
        while (NIL != var21) {
            cdestructuring_bind.destructuring_bind_must_consp(var21, var14, (SubLObject)$ic7$);
            var23_24 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var14, (SubLObject)$ic7$);
            if (NIL == conses_high.member(var23_24, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var22 = (SubLObject)T;
            }
            if (var23_24 == $ic9$) {
                var20 = var21.first();
            }
            var21 = var21.rest();
        }
        if (NIL != var22 && NIL == var20) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic7$);
        }
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var15);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25;
        var15 = (var25 = var16);
        return (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var17, var18, var19, (SubLObject)$ic10$, var24), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var17), ConsesLow.append(var25, (SubLObject)NIL)));
    }
    
    public static SubLObject f28351(final SubLObject var17) {
        return module0077.f5320(var17, f28349());
    }
    
    public static SubLObject f28352(final SubLObject var17) {
        return (SubLObject)((NIL != f28351(var17)) ? module0077.f5326(var17, $g3296$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28353(final SubLObject var17) {
        return (SubLObject)((NIL != f28351(var17)) ? module0077.f5327(var17, $g3296$.getGlobalValue()) : NIL);
    }
    
    public static SubLObject f28347(final SubLObject var28, final SubLObject var2) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != module0363.f24478(var28) : var28;
        assert NIL != f28343(var2) : var2;
        SubLObject var30 = (SubLObject)ZERO_INTEGER;
        SubLObject var31;
        for (var31 = module0066.f4838(module0067.f4891(module0389.f27601())); NIL == module0066.f4841(var31); var31 = module0066.f4840(var31)) {
            var29.resetMultipleValues();
            final SubLObject var32 = module0066.f4839(var31);
            final SubLObject var33 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            final SubLObject var34 = module0389.f27609(var32);
            final SubLObject var35 = module0389.f27610(var32);
            final SubLObject var36 = module0389.f27614(var32);
            if (NIL != module0389.f27603((SubLObject)NIL, var36) && NIL != f28351(var32)) {
                final SubLObject var37 = Functions.funcall(var34, var2, var28);
                final SubLObject var38 = module0048.f3366(var37, var35);
                if (!var38.eql((SubLObject)ZERO_INTEGER) && module0018.$g630$.getDynamicValue(var29).numGE((SubLObject)THREE_INTEGER)) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic15$, var2, var28, var32, var38, var37, var35, (SubLObject)NIL, (SubLObject)NIL);
                }
                var30 = module0048.f3364(var30, var38);
            }
        }
        module0066.f4842(var31);
        return var30;
    }
    
    public static SubLObject f28354(final SubLObject var2) {
        return module0403.f28313(var2);
    }
    
    public static SubLObject f28355(final SubLObject var2, final SubLObject var28) {
        return Sort.sort(conses_high.copy_list(module0389.f27693(var2, var28, f28349())), (SubLObject)$ic16$, Symbols.symbol_function((SubLObject)$ic17$));
    }
    
    public static SubLObject f28356() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28343", "S#29328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28344", "S#31456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28345", "S#31457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28346", "S#31447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28348", "S#31438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28349", "S#31458", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0406", "f28350", "S#31459");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28351", "S#31460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28352", "S#31461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28353", "S#31462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28347", "S#31463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28354", "S#31464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0406", "f28355", "S#31465", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28357() {
        $g3295$ = SubLFiles.defparameter("S#31466", (SubLObject)NIL);
        $g3296$ = SubLFiles.deflexical("S#31467", module0078.f5367((SubLObject)$ic6$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28358() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28356();
    }
    
    public void initializeVariables() {
        f28357();
    }
    
    public void runTopLevelForms() {
        f28358();
    }
    
    static {
        me = (SubLFile)new module0406();
        $g3295$ = null;
        $g3296$ = null;
        $ic0$ = makeKeyword("NEW-ROOT");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("The NEW-ROOT Tactician"), makeKeyword("COMMENT"), makeString("The NEW-ROOT Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#31456", "CYC"), makeKeyword("DONE?"), makeSymbol("S#31448", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#31449", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#31441", "CYC"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("S#31451", "CYC"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("S#31455", "CYC"), makeKeyword("QUIESCE"), makeSymbol("S#31454", "CYC"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("S#31446", "CYC"), makeKeyword("HAPPINESS-TABLE"), makeSymbol("S#31464", "CYC"), makeKeyword("PEEK-NEXT-STRATEGEM"), makeSymbol("S#31452", "CYC"), makeKeyword("ACTIVATE-STRATEGEM"), makeSymbol("S#31438", "CYC"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("S#31439", "CYC"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("S#4848", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#4848", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("ERROR"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("FALSE"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("FALSE"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("FALSE"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("FALSE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE") });
        $ic2$ = makeSymbol("S#31456", "CYC");
        $ic3$ = makeSymbol("S#29328", "CYC");
        $ic4$ = makeString("~a happiness: ~a ~a ~a~%");
        $ic5$ = makeSymbol("S#26082", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("RELEVANT-TERM"), (SubLObject)makeKeyword("LITERAL-COUNT"), (SubLObject)makeKeyword("SKOLEM-COUNT"), (SubLObject)makeKeyword("SHALLOW-AND-CHEAP"), (SubLObject)makeKeyword("OCCAMS-RAZOR"), (SubLObject)makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY"), (SubLObject)makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY"));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30806", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic9$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic10$ = makeKeyword("DONE");
        $ic11$ = makeSymbol("S#30703", "CYC");
        $ic12$ = makeSymbol("PWHEN");
        $ic13$ = makeSymbol("S#31460", "CYC");
        $ic14$ = makeSymbol("S#31459", "CYC");
        $ic15$ = makeString("  ~a heuristic: ~a ~s: ~a = ~a * ~a~%");
        $ic16$ = makeSymbol("S#3711", "CYC");
        $ic17$ = makeSymbol("FOURTH");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/