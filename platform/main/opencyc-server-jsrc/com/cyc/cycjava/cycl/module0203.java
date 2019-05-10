package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != f13015(var1) || NIL != f13016(var1));
    }
    
    public static SubLObject f13015(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic1$.eql(module0205.f13132(var1)));
    }
    
    public static SubLObject f13016(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic2$.eql(module0205.f13132(var1)) && $ic3$.eql(module0205.f13204(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f13017(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        if (NIL != f13015(var1)) {
            return module0205.f13203(var1, (SubLObject)UNPROVIDED);
        }
        if (NIL != f13016(var1)) {
            return module0205.f13203(var1, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13018(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != f13019(var1) || NIL != f13020(var1));
    }
    
    public static SubLObject f13019(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic4$.eql(module0205.f13132(var1)));
    }
    
    public static SubLObject f13020(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic2$.eql(module0205.f13132(var1)) && ZERO_INTEGER.eql(module0205.f13203(var1, (SubLObject)UNPROVIDED)) && NIL != module0205.f13204(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13021(final SubLObject var1) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        if (NIL != f13020(var1)) {
            return module0205.f13204(var1, (SubLObject)UNPROVIDED);
        }
        if (NIL != f13019(var1)) {
            return module0205.f13203(var1, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13022(final SubLObject var2, final SubLObject var3) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic0$);
        }
        if ($ic5$.eql(var2)) {
            return module0202.f12643($ic1$, var3);
        }
        if ($ic6$.eql(var2)) {
            return module0202.f12643($ic4$, var3);
        }
        if ($ic7$.eql(var2)) {
            return var3;
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13024() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13025() {
        return (SubLObject)NIL;
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
        $ic0$ = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalMinFn"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("Unity"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("PlusInfinity"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalMaxFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistAtLeast"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistAtMost"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistExactly"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 55 ms
	
	Decompiled with Procyon 0.5.32.
*/