package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0729 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0729";
    public static final String myFingerPrint = "0bd1d4edd54d80a8c0c3b999fe69d9527d5fe17de9e819143ec2bbf53cd3e414";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    
    public static SubLObject f44550(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0048.f3407(var1) || NIL != module0038.f2740(var1) || NIL != f44551(var1) || NIL != f44552(var1));
    }
    
    public static SubLObject f44551(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0731.f44800(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (var4.isNumber()) {
                return (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44552(final SubLObject var1) {
        final SubLObject var2 = module0038.f2679(var1, (SubLObject)$ic0$);
        return (SubLObject)((NIL != var2) ? f44551(module0038.f2741(var1)) : NIL);
    }
    
    public static SubLObject f44553(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = Numbers.subtract(module0038.f2850(var1), (SubLObject)ONE_INTEGER);
        final SubLObject var4 = f44554(var1);
        if (NIL != module0004.f105(var4)) {
            var2 = Numbers.subtract(var4, (SubLObject)ONE_INTEGER);
        }
        else {
            var2 = var3;
        }
        return module0038.f2772(var2, var1);
    }
    
    public static SubLObject f44554(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5 = module0038.$g918$.currentBinding(var2);
        try {
            module0038.$g918$.bind(module0038.$g914$.getGlobalValue(), var2);
            SubLObject var7;
            final SubLObject var6 = var7 = module0038.f2661(var1, (SubLObject)$ic1$, (SubLObject)UNPROVIDED);
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                if (NIL != var3 || NIL != module0731.f44763(var8, (SubLObject)UNPROVIDED)) {
                    var3 = (SubLObject)T;
                }
                else {
                    var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        finally {
            module0038.$g918$.rebind(var5, var2);
        }
        return (SubLObject)((NIL != var3) ? var4 : NIL);
    }
    
    public static SubLObject f44555(final SubLObject var1) {
        final SubLObject var2 = module0737.f45705(var1);
        SubLObject var3 = (SubLObject)NIL;
        if (NIL == var3) {
            SubLObject var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL == var3 && NIL != var4) {
                if (NIL != Characters.alpha_char_p(Strings.sublisp_char(var5, (SubLObject)ZERO_INTEGER)) && NIL == Characters.upper_case_p(Strings.sublisp_char(var5, (SubLObject)ZERO_INTEGER))) {
                    var3 = (SubLObject)T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var3);
    }
    
    public static SubLObject f44556() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44550", "S#48736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44551", "S#48737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44552", "S#48738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44553", "S#48739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44554", "S#48740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0729", "f44555", "S#48741", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44557() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44558() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44556();
    }
    
    public void initializeVariables() {
        f44557();
    }
    
    public void runTopLevelForms() {
        f44558();
    }
    
    static {
        me = (SubLFile)new module0729();
        $ic0$ = ConsesLow.list((SubLObject)makeString("st"), (SubLObject)makeString("nd"), (SubLObject)makeString("rd"), (SubLObject)makeString("th"));
        $ic1$ = makeSymbol("S#3960", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 71 ms
	
	Decompiled with Procyon 0.5.32.
*/