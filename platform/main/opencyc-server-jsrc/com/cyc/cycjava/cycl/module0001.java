package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0001 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0001";
    public static final String myFingerPrint = "4c63ef0605b624d2dbe615fd1156f574a27662e427f97632c90dc17a0fcebae9";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    
    public static SubLObject f3(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = f4(var9);
            var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var10)), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        var7 = Sequences.nreverse(var7);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, var7, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f4(final SubLObject var11) {
        if (var11.isString()) {
            return Symbols.make_symbol(var11);
        }
        if (var11.isSymbol()) {
            return f4(Symbols.symbol_name(var11));
        }
        return f4((SubLObject)$ic3$);
    }
    
    public static SubLObject f5(final SubLObject var12, final SubLObject var13) {
        assert NIL != Types.symbolp(var12) : var12;
        assert NIL != Types.listp(var13) : var13;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0001", "f3", "S#1");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0001", "f4", "S#2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0001", "f5", "S#3", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6();
    }
    
    public void initializeVariables() {
        f7();
    }
    
    public void runTopLevelForms() {
        f8();
    }
    
    static {
        me = (SubLFile)new module0001();
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("QUOTE");
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeString("TEMP");
        $ic4$ = makeSymbol("SYMBOLP");
        $ic5$ = makeSymbol("LISTP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 33 ms
	
	Decompiled with Procyon 0.5.32.
*/