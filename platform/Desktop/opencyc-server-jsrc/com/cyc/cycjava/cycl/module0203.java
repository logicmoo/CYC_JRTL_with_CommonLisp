package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0203 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0203";
    public static final String myFingerPrint = "2f12b0102c6e61515479ee7646c2846024ea7ba429a65bcafb3f00a0fd6be5ef";
    private static final SubLString $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    
    public static SubLObject f13014(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != f13015(var1) || module0203.NIL != f13016(var1));
    }
    
    public static SubLObject f13015(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != module0202.f12590(var1) && module0203.$ic1$.eql(module0205.f13132(var1)));
    }
    
    public static SubLObject f13016(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != module0202.f12590(var1) && module0203.$ic2$.eql(module0205.f13132(var1)) && module0203.$ic3$.eql(module0205.f13204(var1, (SubLObject)module0203.UNPROVIDED)));
    }
    
    public static SubLObject f13017(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        if (module0203.NIL != f13015(var1)) {
            return module0205.f13203(var1, (SubLObject)module0203.UNPROVIDED);
        }
        if (module0203.NIL != f13016(var1)) {
            return module0205.f13203(var1, (SubLObject)module0203.UNPROVIDED);
        }
        return (SubLObject)module0203.NIL;
    }
    
    public static SubLObject f13018(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != f13019(var1) || module0203.NIL != f13020(var1));
    }
    
    public static SubLObject f13019(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != module0202.f12590(var1) && module0203.$ic4$.eql(module0205.f13132(var1)));
    }
    
    public static SubLObject f13020(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0203.NIL != module0202.f12590(var1) && module0203.$ic2$.eql(module0205.f13132(var1)) && module0203.ZERO_INTEGER.eql(module0205.f13203(var1, (SubLObject)module0203.UNPROVIDED)) && module0203.NIL != module0205.f13204(var1, (SubLObject)module0203.UNPROVIDED));
    }
    
    public static SubLObject f13021(final SubLObject var1) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        if (module0203.NIL != f13020(var1)) {
            return module0205.f13204(var1, (SubLObject)module0203.UNPROVIDED);
        }
        if (module0203.NIL != f13019(var1)) {
            return module0205.f13203(var1, (SubLObject)module0203.UNPROVIDED);
        }
        return (SubLObject)module0203.NIL;
    }
    
    public static SubLObject f13022(final SubLObject var2, final SubLObject var3) {
        if (module0203.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0203.$ic0$);
        }
        if (module0203.$ic5$.eql(var2)) {
            return module0202.f12643(module0203.$ic1$, var3);
        }
        if (module0203.$ic6$.eql(var2)) {
            return module0202.f12643(module0203.$ic4$, var3);
        }
        if (module0203.$ic7$.eql(var2)) {
            return var3;
        }
        return (SubLObject)module0203.NIL;
    }
    
    public static SubLObject f13023() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13014", "S#15920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13015", "S#15921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13016", "S#15922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13017", "S#15923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13018", "S#15924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13019", "S#15925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13020", "S#15926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13021", "S#15927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0203", "f13022", "S#15928", 2, 0, false);
        return (SubLObject)module0203.NIL;
    }
    
    public static SubLObject f13024() {
        return (SubLObject)module0203.NIL;
    }
    
    public static SubLObject f13025() {
        return (SubLObject)module0203.NIL;
    }
    
    public void declareFunctions() {
        f13023();
    }
    
    public void initializeVariables() {
        f13024();
    }
    
    public void runTopLevelForms() {
        f13025();
    }
    
    static {
        me = (SubLFile)new module0203();
        $ic0$ = SubLObjectFactory.makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMinFn"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Unity"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0203.class
	Total time: 55 ms
	
	Decompiled with Procyon 0.5.32.
*/