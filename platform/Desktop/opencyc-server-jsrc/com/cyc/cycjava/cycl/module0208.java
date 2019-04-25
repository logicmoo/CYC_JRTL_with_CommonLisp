package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0208 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0208";
    public static final String myFingerPrint = "f7db2832acb02652a41091207c99fe29e9d589136df7fdcf705490cd39d313ae";
    public static SubLSymbol $g919$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    
    public static SubLObject f13535(final SubLObject var1) {
        return module0036.f2531(var1, (SubLObject)module0208.$ic1$, (SubLObject)module0208.$ic2$, (SubLObject)module0208.UNPROVIDED);
    }
    
    public static SubLObject f13536(final SubLObject var2) {
        return module0039.f3038(module0205.f13203(var2, (SubLObject)module0208.UNPROVIDED));
    }
    
    public static SubLObject f13537(final SubLObject var3, SubLObject var4) {
        if (var4 == module0208.UNPROVIDED) {
            var4 = (SubLObject)module0208.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0208.NIL != module0206.f13453(var3) && module0205.f13276(var3).eql(module0208.$ic3$) && (module0208.NIL == var4 || module0208.NIL != module0062.f4492(var3, (SubLObject)module0208.$ic4$)));
    }
    
    public static SubLObject f13538(final SubLObject var5) {
        assert module0208.NIL != module0039.f3015(var5) : var5;
        return module0202.f12643(module0208.$ic3$, var5);
    }
    
    public static SubLObject f13539(final SubLObject var6) {
        if (module0208.NIL != module0039.f3006(var6)) {
            return var6;
        }
        return f13538(module0039.f3052(var6));
    }
    
    public static SubLObject f13540(final SubLObject var7) {
        assert module0208.NIL != module0039.f3015(var7) : var7;
        if (module0208.NIL != Sequences.search((SubLObject)module0208.$ic6$, var7, Symbols.symbol_function((SubLObject)module0208.$ic7$), (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED)) {
            return f13538(var7);
        }
        return module0039.f3017(var7, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED);
    }
    
    public static SubLObject f13541(final SubLObject var3) {
        return f13538(module0039.f3052(var3));
    }
    
    public static SubLObject f13542(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var8.isString() || module0208.NIL != f13537(var8, (SubLObject)module0208.UNPROVIDED));
    }
    
    public static SubLObject f13543(final SubLObject var9, final SubLObject var3, final SubLObject var10) {
        final SubLObject var11 = f13544(var9);
        final SubLObject var12 = f13544(var3);
        final SubLObject var13 = (SubLObject)((module0208.NIL != var10) ? Symbols.symbol_function((SubLObject)module0208.EQL) : module0208.$ic8$);
        return module0035.sublisp_boolean(Sequences.search(var11, var12, var13, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED));
    }
    
    public static SubLObject f13544(final SubLObject var3) {
        if (module0208.NIL != f13537(var3, (SubLObject)module0208.UNPROVIDED)) {
            return module0039.f3000(module0205.f13277(var3, (SubLObject)module0208.UNPROVIDED));
        }
        final SubLObject var4 = module0039.f3043(var3);
        return (module0208.NIL != var4) ? var4 : module0039.f3000(module0039.f3052(var3));
    }
    
    public static SubLObject f13545(final SubLObject var15, final SubLObject var16) {
        if (var15.eql(var16)) {
            return (SubLObject)module0208.T;
        }
        final SubLObject var17 = Characters.code_char(var15);
        final SubLObject var18 = Characters.code_char(var16);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0208.NIL != var17 && module0208.NIL != var18 && module0208.NIL != Characters.char_equal(var17, var18));
    }
    
    public static SubLObject f13546(final SubLObject var3, final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0208.NIL != f13537(var3, (SubLObject)module0208.UNPROVIDED) : var3;
        final SubLObject var22 = module0039.f3000(module0205.f13277(var3, (SubLObject)module0208.UNPROVIDED));
        if (module0208.NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && (module0208.NIL == module0035.f2000(var22, var19, (SubLObject)module0208.UNPROVIDED) || (module0208.NIL != var20 && module0208.NIL == module0035.f2000(var22, var20, (SubLObject)module0208.UNPROVIDED)) || !var20.numGE(var19))) {
            Errors.error((SubLObject)module0208.$ic9$, var19, var20, var3);
        }
        final SubLObject var23 = Sequences.subseq(var22, var19, var20);
        return (module0208.NIL != module0035.find_if_not((SubLObject)module0208.$ic10$, var23, (SubLObject)module0208.$ic11$, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED)) ? f13538(module0039.f3001(var23)) : module0039.f3048(module0039.f3018(var23, (SubLObject)module0208.UNPROVIDED, (SubLObject)module0208.UNPROVIDED));
    }
    
    public static SubLObject f13547() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13535", "S#16377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13536", "S#16378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13537", "S#16379", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13538", "S#16380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13539", "S#16381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13540", "S#16382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13541", "S#16383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13542", "S#16384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13543", "S#16385", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13544", "S#16386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13545", "S#16387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0208", "f13546", "S#16388", 3, 0, false);
        return (SubLObject)module0208.NIL;
    }
    
    public static SubLObject f13548() {
        module0208.$g919$ = SubLFiles.defconstant("S#16389", (SubLObject)module0208.$ic0$);
        return (SubLObject)module0208.NIL;
    }
    
    public static SubLObject f13549() {
        return (SubLObject)module0208.NIL;
    }
    
    public void declareFunctions() {
        f13547();
    }
    
    public void initializeVariables() {
        f13548();
    }
    
    public void runTopLevelForms() {
        f13549();
    }
    
    static {
        me = (SubLFile)new module0208();
        module0208.$g919$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString(""));
        $ic1$ = SubLObjectFactory.makeSymbol("S#16379", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#16378", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn"));
        $ic4$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#4375", "CYC")));
        $ic5$ = SubLObjectFactory.makeSymbol("S#4375", "CYC");
        $ic6$ = SubLObjectFactory.makeString("&u");
        $ic7$ = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $ic8$ = SubLObjectFactory.makeSymbol("S#16387", "CYC");
        $ic9$ = SubLObjectFactory.makeString("Can't get substring from ~S to ~S of ~S");
        $ic10$ = SubLObjectFactory.makeSymbol("S#4369", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("CODE-CHAR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0208.class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/