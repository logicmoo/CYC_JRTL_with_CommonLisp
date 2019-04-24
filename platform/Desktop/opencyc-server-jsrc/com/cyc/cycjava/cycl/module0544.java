package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0544 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0544";
    public static final String myFingerPrint = "553d504365e3375bba738135a9573b02e8693634cb17582c334dda80a3e71003";
    private static SubLSymbol $g3961$;
    private static SubLSymbol $g3962$;
    private static SubLSymbol $g3963$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    
    public static SubLObject f33703(SubLObject var1) {
        if (var1 == module0544.UNPROVIDED) {
            var1 = (SubLObject)module0544.NIL;
        }
        final SubLObject var2 = f33704();
        f33705(var1, var2);
        return var2;
    }
    
    public static SubLObject f33706(final SubLObject var3) {
        return f33707(f33708(var3, (SubLObject)module0544.UNPROVIDED));
    }
    
    public static SubLObject f33709(final SubLObject var3) {
        f33710(var3);
        return (SubLObject)module0544.T;
    }
    
    public static SubLObject f33711() {
        return module0057.f4174(module0544.$g3962$.getGlobalValue());
    }
    
    public static SubLObject f33704() {
        return module0057.f4175(module0544.$g3962$.getGlobalValue());
    }
    
    public static SubLObject f33707(final SubLObject var4) {
        return module0067.f4852(var4);
    }
    
    public static SubLObject f33705(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f33712(var1);
        module0067.f4886(module0544.$g3961$.getGlobalValue(), var2, var3);
        return var2;
    }
    
    public static SubLObject f33712(final SubLObject var1) {
        final SubLObject var2 = module0057.f4173((SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED);
        final SubLObject var3 = module0067.f4880((SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED);
        module0067.f4886(var3, (SubLObject)module0544.$ic2$, var2);
        module0067.f4886(var3, (SubLObject)module0544.$ic3$, var1);
        return var3;
    }
    
    public static SubLObject f33708(final SubLObject var2, SubLObject var8) {
        if (var8 == module0544.UNPROVIDED) {
            var8 = (SubLObject)module0544.NIL;
        }
        return module0067.f4884(module0544.$g3961$.getGlobalValue(), var2, var8);
    }
    
    public static SubLObject f33710(final SubLObject var2) {
        return module0067.f4887(module0544.$g3961$.getGlobalValue(), var2);
    }
    
    public static SubLObject f33713(final SubLObject var3, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0544.NIL != f33706(var3) && module0544.NIL != f33714(var3, var9));
    }
    
    public static SubLObject f33715(final SubLObject var3) {
        final SubLObject var4 = f33708(var3, (SubLObject)module0544.UNPROVIDED);
        return f33716(var4);
    }
    
    public static SubLObject f33717(final SubLObject var3, final SubLObject var9) {
        final SubLObject var10 = f33708(var3, (SubLObject)module0544.UNPROVIDED);
        final SubLObject var11 = f33718(var10, var9);
        return var11;
    }
    
    public static SubLObject f33719(final SubLObject var3, final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = f33708(var3, (SubLObject)module0544.UNPROVIDED);
        f33720(var11, var9, var10);
        return var3;
    }
    
    public static SubLObject f33721(final SubLObject var3, final SubLObject var9) {
        final SubLObject var10 = f33708(var3, (SubLObject)module0544.UNPROVIDED);
        f33722(var10, var9);
        return var3;
    }
    
    public static SubLObject f33714(final SubLObject var3, final SubLObject var9) {
        final SubLObject var10 = f33708(var3, (SubLObject)module0544.UNPROVIDED);
        if (module0544.NIL != f33707(var10)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!module0067.f4884(var10, var9, module0544.$g3963$.getGlobalValue()).eql(module0544.$g3963$.getGlobalValue()));
        }
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33718(final SubLObject var7, final SubLObject var9) {
        if (module0544.NIL != f33707(var7)) {
            return module0067.f4884(var7, var9, (SubLObject)module0544.UNPROVIDED);
        }
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33720(final SubLObject var7, final SubLObject var9, final SubLObject var10) {
        if (module0544.NIL != f33707(var7)) {
            return module0067.f4886(var7, var9, var10);
        }
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33716(final SubLObject var7) {
        if (module0544.NIL != f33707(var7)) {
            final SubLObject var8 = module0067.f4884(var7, (SubLObject)module0544.$ic2$, (SubLObject)module0544.UNPROVIDED);
            if (module0544.NIL != module0057.f4158(var8)) {
                final SubLObject var9 = module0057.f4175(var8);
                return var9;
            }
        }
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33722(final SubLObject var7, final SubLObject var9) {
        if (module0544.NIL != module0067.f4852(var7)) {
            return module0067.f4887(var7, var9);
        }
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33723() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33703", "S#37098", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33706", "S#37099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33709", "S#37100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33711", "S#37101", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33704", "S#37102", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33707", "S#37103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33705", "S#37104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33712", "S#37105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33708", "S#37106", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33710", "S#37107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33713", "S#37108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33715", "S#37109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33717", "S#37110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33719", "S#37111", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33721", "S#37112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33714", "S#37113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33718", "S#37114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33720", "S#37115", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33716", "S#37116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0544", "f33722", "S#37117", 2, 0, false);
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33724() {
        module0544.$g3961$ = SubLFiles.deflexical("S#37118", (module0544.NIL != Symbols.boundp((SubLObject)module0544.$ic0$)) ? module0544.$g3961$.getGlobalValue() : module0067.f4880((SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED));
        module0544.$g3962$ = SubLFiles.deflexical("S#37119", (module0544.NIL != Symbols.boundp((SubLObject)module0544.$ic1$)) ? module0544.$g3962$.getGlobalValue() : module0057.f4173((SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED, (SubLObject)module0544.UNPROVIDED));
        module0544.$g3963$ = SubLFiles.deflexical("S#37120", (module0544.NIL != Symbols.boundp((SubLObject)module0544.$ic4$)) ? module0544.$g3963$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0544.$ic5$));
        return (SubLObject)module0544.NIL;
    }
    
    public static SubLObject f33725() {
        module0003.f57((SubLObject)module0544.$ic0$);
        module0003.f57((SubLObject)module0544.$ic1$);
        module0003.f57((SubLObject)module0544.$ic4$);
        return (SubLObject)module0544.NIL;
    }
    
    public void declareFunctions() {
        f33723();
    }
    
    public void initializeVariables() {
        f33724();
    }
    
    public void runTopLevelForms() {
        f33725();
    }
    
    static {
        me = (SubLFile)new module0544();
        module0544.$g3961$ = null;
        module0544.$g3962$ = null;
        module0544.$g3963$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#37118", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#37119", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("ID-GENERATOR");
        $ic3$ = SubLObjectFactory.makeKeyword("LEASE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#37120", "CYC");
        $ic5$ = SubLObjectFactory.makeString("Remote Object Not Found");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0544.class
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/