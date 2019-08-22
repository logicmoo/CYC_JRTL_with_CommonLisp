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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return module0036.f2531(var1, (SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13536(final SubLObject var2) {
        return module0039.f3038(module0205.f13203(var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13537(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var3) && module0205.f13276(var3).eql($ic3$) && (NIL == var4 || NIL != module0062.f4492(var3, (SubLObject)$ic4$)));
    }
    
    public static SubLObject f13538(final SubLObject var5) {
        assert NIL != module0039.f3015(var5) : var5;
        return module0202.f12643($ic3$, var5);
    }
    
    public static SubLObject f13539(final SubLObject var6) {
        if (NIL != module0039.f3006(var6)) {
            return var6;
        }
        return f13538(module0039.f3052(var6));
    }
    
    public static SubLObject f13540(final SubLObject var7) {
        assert NIL != module0039.f3015(var7) : var7;
        if (NIL != Sequences.search((SubLObject)$ic6$, var7, Symbols.symbol_function((SubLObject)$ic7$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f13538(var7);
        }
        return module0039.f3017(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13541(final SubLObject var3) {
        return f13538(module0039.f3052(var3));
    }
    
    public static SubLObject f13542(final SubLObject var8) {
        return (SubLObject)makeBoolean(var8.isString() || NIL != f13537(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13543(final SubLObject var9, final SubLObject var3, final SubLObject var10) {
        final SubLObject var11 = f13544(var9);
        final SubLObject var12 = f13544(var3);
        final SubLObject var13 = (SubLObject)((NIL != var10) ? Symbols.symbol_function((SubLObject)EQL) : $ic8$);
        return module0035.sublisp_boolean(Sequences.search(var11, var12, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13544(final SubLObject var3) {
        if (NIL != f13537(var3, (SubLObject)UNPROVIDED)) {
            return module0039.f3000(module0205.f13277(var3, (SubLObject)UNPROVIDED));
        }
        final SubLObject var4 = module0039.f3043(var3);
        return (NIL != var4) ? var4 : module0039.f3000(module0039.f3052(var3));
    }
    
    public static SubLObject f13545(final SubLObject var15, final SubLObject var16) {
        if (var15.eql(var16)) {
            return (SubLObject)T;
        }
        final SubLObject var17 = Characters.code_char(var15);
        final SubLObject var18 = Characters.code_char(var16);
        return (SubLObject)makeBoolean(NIL != var17 && NIL != var18 && NIL != Characters.char_equal(var17, var18));
    }
    
    public static SubLObject f13546(final SubLObject var3, final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert NIL != f13537(var3, (SubLObject)UNPROVIDED) : var3;
        final SubLObject var22 = module0039.f3000(module0205.f13277(var3, (SubLObject)UNPROVIDED));
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && (NIL == module0035.f2000(var22, var19, (SubLObject)UNPROVIDED) || (NIL != var20 && NIL == module0035.f2000(var22, var20, (SubLObject)UNPROVIDED)) || !var20.numGE(var19))) {
            Errors.error((SubLObject)$ic9$, var19, var20, var3);
        }
        final SubLObject var23 = Sequences.subseq(var22, var19, var20);
        return (NIL != module0035.find_if_not((SubLObject)$ic10$, var23, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? f13538(module0039.f3001(var23)) : module0039.f3048(module0039.f3018(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13548() {
        $g919$ = SubLFiles.defconstant("S#16389", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13549() {
        return (SubLObject)NIL;
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
        $g919$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString(""));
        $ic1$ = makeSymbol("S#16379", "CYC");
        $ic2$ = makeSymbol("S#16378", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn"));
        $ic4$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4375", "CYC")));
        $ic5$ = makeSymbol("S#4375", "CYC");
        $ic6$ = makeString("&u");
        $ic7$ = makeSymbol("CHAR-EQUAL");
        $ic8$ = makeSymbol("S#16387", "CYC");
        $ic9$ = makeString("Can't get substring from ~S to ~S of ~S");
        $ic10$ = makeSymbol("S#4369", "CYC");
        $ic11$ = makeSymbol("CODE-CHAR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/