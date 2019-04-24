package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0635 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0635";
    public static final String myFingerPrint = "ab2245b2d34367b48c7a87e6b62a3c9a5ab3335f4ee9ebe6a35717636158835b";
    private static SubLSymbol $g4945$;
    private static SubLSymbol $g4946$;
    private static SubLSymbol $g4947$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f38783() {
        return module0057.f4175(module0635.$g4947$.getGlobalValue());
    }
    
    public static SubLObject f38784() {
        return module0067.f4903(module0635.$g4945$.getGlobalValue());
    }
    
    public static SubLObject f38785(final SubLObject var1) {
        return module0059.f4264(var1, (SubLObject)module0635.$ic1$);
    }
    
    public static SubLObject f38786(final SubLObject var1) {
        return module0059.f4264(var1, (SubLObject)module0635.$ic2$);
    }
    
    public static SubLObject f38787(final SubLObject var1) {
        return module0059.f4264(var1, (SubLObject)module0635.$ic3$);
    }
    
    public static SubLObject f38788(final SubLObject var1) {
        return module0424.f29829(module0059.f4264(var1, (SubLObject)module0635.$ic4$));
    }
    
    public static SubLObject f38789(final SubLObject var1) {
        return module0059.f4264(var1, (SubLObject)module0635.$ic5$);
    }
    
    public static SubLObject f38790(final SubLObject var1) {
        return module0059.f4264(var1, (SubLObject)module0635.$ic6$);
    }
    
    public static SubLObject f38791(final SubLObject var1) {
        return module0059.f4257(var1);
    }
    
    public static SubLObject f38792(final SubLObject var1) {
        assert module0635.NIL != module0059.f4212(var1) : var1;
        final SubLObject var2 = f38785(var1);
        module0067.f4886(module0635.$g4945$.getGlobalValue(), var2, var1);
        return f38784();
    }
    
    public static SubLObject f38793(final SubLObject var1) {
        assert module0635.NIL != module0059.f4212(var1) : var1;
        final SubLObject var2 = f38785(var1);
        final SubLObject var3 = f38788(var1);
        module0067.f4887(module0635.$g4945$.getGlobalValue(), var2);
        if (module0635.NIL != var3) {
            module0424.f29862(var3);
        }
        return f38784();
    }
    
    public static SubLObject f38794(final SubLObject var2, SubLObject var1) {
        if (var1 == module0635.UNPROVIDED) {
            var1 = module0059.f4266();
        }
        assert module0635.NIL != Types.integerp(var2) : var2;
        if (module0635.NIL != module0059.f4212(var1)) {
            module0059.f4253(var1, (SubLObject)module0635.$ic4$, var2);
        }
        return var1;
    }
    
    public static SubLObject f38795(final SubLObject var2) {
        assert module0635.NIL != Types.integerp(var2) : var2;
        return module0067.f4884(module0635.$g4945$.getGlobalValue(), var2, (SubLObject)module0635.UNPROVIDED);
    }
    
    public static SubLObject f38796(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = f38783();
        final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)module0635.$ic3$, var4, (SubLObject)module0635.$ic2$, var5, (SubLObject)module0635.$ic1$, var6);
        final SubLObject var8 = module0059.f4240((SubLObject)module0635.$ic9$, (SubLObject)module0635.$ic10$, var7);
        f38792(var8);
        return var8;
    }
    
    public static SubLObject f38797(final SubLObject var1, final SubLObject var7, final SubLObject var8) {
        assert module0635.NIL != module0059.f4212(var1) : var1;
        module0059.f4253(var1, (SubLObject)module0635.$ic5$, var7);
        module0059.f4253(var1, (SubLObject)module0635.$ic6$, var8);
        return module0059.f4267(var1, (SubLObject)module0635.$ic11$, (SubLObject)module0635.NIL);
    }
    
    public static SubLObject f38798(final SubLObject var1) {
        assert module0635.NIL != module0059.f4212(var1) : var1;
        final SubLObject var2 = f38788(var1);
        final SubLObject var3 = (SubLObject)((module0635.NIL != module0424.f29729(var2)) ? module0424.f29937(var2) : ConsesLow.list(var2));
        SubLObject var4 = (SubLObject)module0635.NIL;
        SubLObject var5 = (SubLObject)module0635.NIL;
        module0424.f29858(var2, (SubLObject)module0635.$ic12$);
        if (module0635.NIL == var5) {
            SubLObject var6 = var3;
            SubLObject var7 = (SubLObject)module0635.NIL;
            var7 = var6.first();
            while (module0635.NIL == var5 && module0635.NIL != var6) {
                if (module0424.f29846(var7) == module0635.$ic13$) {
                    var4 = module0424.f29850(var7);
                    module0424.f29858(var7, (SubLObject)module0635.$ic12$);
                    module0411.f28596(var4, var1);
                    var5 = (SubLObject)module0635.T;
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return var1;
    }
    
    public static SubLObject f38799() {
        final SubLObject var1 = module0059.f4266();
        final SubLObject var2 = f38789(var1);
        final SubLObject var3 = f38790(var1);
        SubLObject var4 = (SubLObject)module0635.NIL;
        var4 = Functions.apply(var2, var3);
        return var4;
    }
    
    public static SubLObject f38800(final SubLObject var16) {
        SubLObject var17 = (SubLObject)module0635.NIL;
        SubLObject var18 = (SubLObject)module0635.NIL;
        SubLObject var19 = var16;
        SubLObject var20 = (SubLObject)module0635.NIL;
        var20 = var19.first();
        while (module0635.NIL != var19) {
            final SubLObject var21 = f38786(var20);
            if (var21.eql((SubLObject)module0635.$ic14$)) {
                var17 = (SubLObject)ConsesLow.cons(var20, var17);
            }
            else if (var21.eql((SubLObject)module0635.$ic15$)) {
                var18 = (SubLObject)ConsesLow.cons(var20, var18);
            }
            else {
                Errors.error((SubLObject)module0635.$ic16$, f38786(var20));
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Values.values(Sequences.nreverse(var17), Sequences.nreverse(var18));
    }
    
    public static SubLObject f38801() {
        SubLObject var15 = (SubLObject)module0635.NIL;
        if (module0635.NIL == var15) {
            SubLObject var16 = f38784();
            SubLObject var17 = (SubLObject)module0635.NIL;
            var17 = var16.first();
            while (module0635.NIL == var15 && module0635.NIL != var16) {
                if (module0059.f4256(var17) == module0635.$ic13$ || module0059.f4256(var17) == module0635.$ic17$) {
                    var15 = (SubLObject)module0635.T;
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        return var15;
    }
    
    public static SubLObject f38802(final SubLObject var4, SubLObject var21) {
        if (var21 == module0635.UNPROVIDED) {
            var21 = (SubLObject)module0635.NIL;
        }
        final SubLObject var22 = f38796(var4, (SubLObject)module0635.$ic14$);
        final SubLObject var23 = module0091.f6334((SubLObject)module0635.$ic18$);
        final SubLObject var24 = f38797(var22, Symbols.symbol_function((SubLObject)module0635.$ic19$), (SubLObject)ConsesLow.list(var23, var4, var21));
        return var24;
    }
    
    public static SubLObject f38803(final SubLObject var24, SubLObject var21) {
        if (var21 == module0635.UNPROVIDED) {
            var21 = (SubLObject)module0635.NIL;
        }
        final SubLObject var25 = f38796(var24, (SubLObject)module0635.$ic15$);
        final SubLObject var26 = module0091.f6334((SubLObject)module0635.$ic18$);
        final SubLObject var27 = f38797(var25, Symbols.symbol_function((SubLObject)module0635.$ic20$), (SubLObject)ConsesLow.list(var26, var24, var21));
        return var27;
    }
    
    public static SubLObject f38804(final SubLObject var22, final SubLObject var25, SubLObject var21, SubLObject var26, SubLObject var27) {
        if (var21 == module0635.UNPROVIDED) {
            var21 = (SubLObject)module0635.NIL;
        }
        if (var26 == module0635.UNPROVIDED) {
            var26 = (SubLObject)module0635.NIL;
        }
        if (var27 == module0635.UNPROVIDED) {
            var27 = (SubLObject)module0635.NIL;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        assert module0635.NIL != module0091.f6325(var22) : var22;
        SubLObject var29 = (SubLObject)module0635.NIL;
        if (module0635.NIL != var21) {
            conses_high.putf(var26, (SubLObject)module0635.$ic22$, (SubLObject)module0635.T);
        }
        assert module0635.NIL != module0091.f6325(var22) : var22;
        final SubLObject var30 = module0091.f6339(var22);
        final ArrayList var31 = Dynamic.extract_dynamic_values(var30);
        try {
            Dynamic.bind_dynamic_vars(var30, module0091.f6340(var22));
            var29 = module0424.f29726(var25, var27, module0424.$g3450$.getDynamicValue(var28), var26, (SubLObject)module0635.T, (SubLObject)module0635.T);
        }
        finally {
            Dynamic.rebind_dynamic_vars(var30, var31);
        }
        return var29;
    }
    
    public static SubLObject f38805(final SubLObject var22, final SubLObject var24, SubLObject var21, SubLObject var26, SubLObject var27) {
        if (var21 == module0635.UNPROVIDED) {
            var21 = (SubLObject)module0635.NIL;
        }
        if (var26 == module0635.UNPROVIDED) {
            var26 = (SubLObject)module0635.NIL;
        }
        if (var27 == module0635.UNPROVIDED) {
            var27 = (SubLObject)module0635.NIL;
        }
        assert module0635.NIL != module0091.f6325(var22) : var22;
        SubLObject var28 = (SubLObject)module0635.NIL;
        if (module0635.NIL != var21) {
            conses_high.putf(var26, (SubLObject)module0635.$ic22$, (SubLObject)module0635.T);
        }
        assert module0635.NIL != module0091.f6325(var22) : var22;
        final SubLObject var29 = module0091.f6339(var22);
        final ArrayList var30 = Dynamic.extract_dynamic_values(var29);
        try {
            Dynamic.bind_dynamic_vars(var29, module0091.f6340(var22));
            var28 = module0424.f29773(var24, var27, module0424.$g3162$.getGlobalValue(), var26, (SubLObject)module0635.T, (SubLObject)module0635.NIL, (SubLObject)module0635.NIL, (SubLObject)module0635.T, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED);
        }
        finally {
            Dynamic.rebind_dynamic_vars(var29, var30);
        }
        return var28;
    }
    
    public static SubLObject f38806() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38783", "S#42489", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38784", "S#42490", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38785", "S#42491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38786", "S#42492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38787", "S#42493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38788", "S#32763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38789", "S#42494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38790", "S#42495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38791", "S#42496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38792", "S#42497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38793", "S#42498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38794", "S#32764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38795", "S#42499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38796", "S#42500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38797", "S#42501", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38798", "S#42502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38799", "S#42503", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38800", "S#42504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38801", "S#42505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38802", "S#42506", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38803", "S#42507", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38804", "S#42508", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0635", "f38805", "S#42509", 2, 3, false);
        return (SubLObject)module0635.NIL;
    }
    
    public static SubLObject f38807() {
        module0635.$g4945$ = SubLFiles.deflexical("S#42510", module0067.f4880((SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED));
        module0635.$g4946$ = SubLFiles.deflexical("S#42511", Locks.make_lock((SubLObject)module0635.$ic0$));
        module0635.$g4947$ = SubLFiles.deflexical("S#42512", module0057.f4173((SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED, (SubLObject)module0635.UNPROVIDED));
        return (SubLObject)module0635.NIL;
    }
    
    public static SubLObject f38808() {
        return (SubLObject)module0635.NIL;
    }
    
    public void declareFunctions() {
        f38806();
    }
    
    public void initializeVariables() {
        f38807();
    }
    
    public void runTopLevelForms() {
        f38808();
    }
    
    static {
        me = (SubLFile)new module0635();
        module0635.$g4945$ = null;
        module0635.$g4946$ = null;
        module0635.$g4947$ = null;
        $ic0$ = SubLObjectFactory.makeString("KCT Thinking Lock");
        $ic1$ = SubLObjectFactory.makeKeyword("ID");
        $ic2$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic3$ = SubLObjectFactory.makeKeyword("TEST-CONSTANT");
        $ic4$ = SubLObjectFactory.makeKeyword("RUNSTATE-ID");
        $ic5$ = SubLObjectFactory.makeKeyword("FUNCTION");
        $ic6$ = SubLObjectFactory.makeKeyword("ARGS");
        $ic7$ = SubLObjectFactory.makeSymbol("S#5674", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic9$ = SubLObjectFactory.makeString("KB Content Test Running");
        $ic10$ = SubLObjectFactory.makeString("Starting...");
        $ic11$ = SubLObjectFactory.makeSymbol("S#42503", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("STOPPED");
        $ic13$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic14$ = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $ic15$ = SubLObjectFactory.makeKeyword("COLLECTION");
        $ic16$ = SubLObjectFactory.makeString("Wrong type of KCT Thinking Task: ~A!");
        $ic17$ = SubLObjectFactory.makeKeyword("STARTED");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#42508", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#42509", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#8003", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0635.class
	Total time: 105 ms
	
	Decompiled with Procyon 0.5.32.
*/