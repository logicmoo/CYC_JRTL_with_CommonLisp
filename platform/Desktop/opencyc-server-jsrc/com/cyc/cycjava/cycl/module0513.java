package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0513 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0513";
    public static final String myFingerPrint = "875a1e505e29fbce050c2ae0cc3fbc7f9bddf81b2f645d26385bfad30ebda0be";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    
    public static SubLObject f32509(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0202.f12896(var3);
        final SubLObject var5 = module0202.f12898(var3);
        final SubLObject var6 = module0205.f13385(var1, (SubLObject)module0513.UNPROVIDED);
        final SubLObject var7 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0513.$ic0$), var4, new SubLObject[] { var6 });
        final SubLObject var8 = module0233.f15362(var7, var5);
        final SubLObject var9 = f32510(var7);
        SubLObject var10 = module0434.f30590(var9, var8, module0373.f26143(), (SubLObject)module0513.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0513.NIL;
        var11 = var10.first();
        while (module0513.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0513.NIL;
            SubLObject var15 = (SubLObject)module0513.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0513.$ic1$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0513.$ic1$);
            var15 = var13.first();
            var13 = var13.rest();
            if (module0513.NIL == var13) {
                module0347.f23330(var15.first(), module0233.f15362(var9, var14), var15.rest());
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0513.$ic1$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0513.NIL;
    }
    
    public static SubLObject f32510(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0513.NIL;
        SubLObject var16 = var14;
        SubLObject var17 = (SubLObject)module0513.NIL;
        var17 = var16.first();
        while (module0513.NIL != var16) {
            if (module0513.NIL == module0202.f12689(module0233.f15370(var17), (SubLObject)module0513.UNPROVIDED)) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f32511(final SubLObject var1, SubLObject var2) {
        if (var2 == module0513.UNPROVIDED) {
            var2 = (SubLObject)module0513.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0411.f28638(module0202.f12898(var1), (SubLObject)module0513.$ic2$, (SubLObject)module0513.UNPROVIDED, (SubLObject)module0513.UNPROVIDED);
        if (!var4.isZero()) {
            var4 = Numbers.add(var4, module0483.$g3582$.getDynamicValue(var3));
        }
        return var4;
    }
    
    public static SubLObject f32512() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0513", "f32509", "S#35951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0513", "f32510", "S#35952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0513", "f32511", "S#35953", 1, 1, false);
        return (SubLObject)module0513.NIL;
    }
    
    public static SubLObject f32513() {
        return (SubLObject)module0513.NIL;
    }
    
    public static SubLObject f32514() {
        module0340.f22941((SubLObject)module0513.$ic3$, (SubLObject)module0513.$ic4$);
        return (SubLObject)module0513.NIL;
    }
    
    public void declareFunctions() {
        f32512();
    }
    
    public void initializeVariables() {
        f32513();
    }
    
    public void runTopLevelForms() {
        f32514();
    }
    
    static {
        me = (SubLFile)new module0513();
        $ic0$ = SubLObjectFactory.makeSymbol("S#14186", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic2$ = SubLObjectFactory.makeKeyword("POS");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-KAPPA");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15519", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35953", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35951", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("((#$Kappa <formal-args> <sentence>) <args>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0513.class
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/