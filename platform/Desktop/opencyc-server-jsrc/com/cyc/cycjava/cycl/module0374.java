package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0374 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0374";
    public static final String myFingerPrint = "f85af1c4cc9823ebc7cd6cb3409daf488454879add6f05669bfd68e6f2244cf3";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    
    public static SubLObject f26529(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0374.NIL != module0364.f24699(var1) && module0374.$ic0$ == module0364.f24721(var1));
    }
    
    public static SubLObject f26530(final SubLObject var2) {
        assert module0374.NIL != module0369.f25275(var2) : var2;
        final SubLObject var3 = f26531(var2);
        module0369.f25555(var2, var3);
        return var3;
    }
    
    public static SubLObject f26531(final SubLObject var2) {
        final SubLObject var3 = module0369.f25488(var2);
        final SubLObject var4 = module0364.f24730(var2, (SubLObject)module0374.$ic0$);
        f26532(var4, var3);
        return var4;
    }
    
    public static SubLObject f26533(final SubLObject var3) {
        assert module0374.NIL != f26529(var3) : var3;
        return module0364.f24733(var3);
    }
    
    public static SubLObject f26534(final SubLObject var3) {
        assert module0374.NIL != f26529(var3) : var3;
        return module0364.f24763(var3);
    }
    
    public static SubLObject f26535(final SubLObject var3) {
        assert module0374.NIL != f26529(var3) : var3;
        return module0364.f24753(var3);
    }
    
    public static SubLObject f26536(final SubLObject var3) {
        assert module0374.NIL != f26529(var3) : var3;
        return module0364.f24742(var3);
    }
    
    public static SubLObject f26532(final SubLObject var3, final SubLObject var5) {
        assert module0374.NIL != f26529(var3) : var3;
        assert module0374.NIL != module0362.f24447(var5) : var5;
        module0364.f24744(var3, var5);
        return var3;
    }
    
    public static SubLObject f26537(final SubLObject var3) {
        assert module0374.NIL != f26529(var3) : var3;
        module0364.f24778(var3);
        return var3;
    }
    
    public static SubLObject f26538(final SubLObject var3) {
        final SubLObject var4 = f26535(var3);
        return module0364.f24736(var4);
    }
    
    public static SubLObject f26539(final SubLObject var3) {
        return Equality.eq((SubLObject)module0374.$ic4$, f26536(var3));
    }
    
    public static SubLObject f26540() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26529", "S#27371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26530", "S#29320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26531", "S#29751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26533", "S#29287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26534", "S#27902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26535", "S#28202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26536", "S#29752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26532", "S#29753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26537", "S#29285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26538", "S#29314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0374", "f26539", "S#29271", 1, 0, false);
        return (SubLObject)module0374.NIL;
    }
    
    public static SubLObject f26541() {
        return (SubLObject)module0374.NIL;
    }
    
    public static SubLObject f26542() {
        return (SubLObject)module0374.NIL;
    }
    
    public void declareFunctions() {
        f26540();
    }
    
    public void initializeVariables() {
        f26541();
    }
    
    public void runTopLevelForms() {
        f26542();
    }
    
    static {
        me = (SubLFile)new module0374();
        $ic0$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic1$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic2$ = SubLObjectFactory.makeSymbol("S#27371", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#27307", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("ALL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0374.class
	Total time: 51 ms
	
	Decompiled with Procyon 0.5.32.
*/