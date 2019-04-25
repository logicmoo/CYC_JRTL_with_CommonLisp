package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0240 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0240";
    public static final String myFingerPrint = "1c89181a4bdaca689cea2cc63e41e8322c2fdd0ccd66d57a23bd254b2ec901fc";
    public static SubLSymbol $g2447$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    
    public static SubLObject f15606(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var5, (SubLObject)$ic2$)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f15607(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f15608(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic4$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f15609(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.listS(var6, var7, (SubLObject)$ic2$), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15610() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = $g2447$.getDynamicValue(var17);
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        final Iterator var22 = Hashtables.getEntrySetIterator(var19);
        try {
            while (Hashtables.iteratorHasNext(var22)) {
                final Map.Entry var23 = Hashtables.iteratorNextEntry(var22);
                var20 = Hashtables.getEntryKey(var23);
                var21 = Hashtables.getEntryValue(var23);
                if (NIL != var21) {
                    var18 = (SubLObject)ConsesLow.cons(var20, var18);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var22);
        }
        return var18;
    }
    
    public static SubLObject f15611() {
        return Hashtables.make_hash_table((SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15612(final SubLObject var24, final SubLObject var20) {
        return Hashtables.gethash(var20, module0134.f8744(var24), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15613(final SubLObject var24, final SubLObject var20) {
        return Hashtables.gethash(var20, module0134.f8745(var24), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15614(final SubLObject var24, final SubLObject var20) {
        return module0035.sublisp_boolean(f15612(var24, var20));
    }
    
    public static SubLObject f15615(final SubLObject var24, final SubLObject var20) {
        return module0035.sublisp_boolean(f15613(var24, var20));
    }
    
    public static SubLObject f15616(final SubLObject var20, final SubLObject var25) {
        return module0035.sublisp_boolean(Hashtables.gethash(var20, var25, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15617(final SubLObject var20, final SubLObject var26, final SubLObject var25) {
        Hashtables.sethash(var20, var25, var26);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15618(final SubLObject var24, final SubLObject var20, final SubLObject var26) {
        final SubLObject var27 = module0134.f8744(var24);
        f15617(var20, var26, var27);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15619(final SubLObject var24, final SubLObject var20, final SubLObject var26) {
        final SubLObject var27 = module0134.f8745(var24);
        f15617(var20, var26, var27);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15620(final SubLObject var20, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        f15617(var20, var26, $g2447$.getDynamicValue(var27));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15621(final SubLObject var24, final SubLObject var20) {
        f15618(var24, var20, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15622(final SubLObject var24, final SubLObject var20, final SubLObject var27) {
        final SubLObject var28 = f15612(var24, var20);
        if (var28.isInteger()) {
            return Numbers.numGE(var28, var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15623(final SubLObject var24, final SubLObject var20, final SubLObject var27) {
        final SubLObject var28 = f15613(var24, var20);
        if (var28.isInteger()) {
            return Numbers.numGE(var28, var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15624(final SubLObject var24, final SubLObject var20, final SubLObject var21) {
        final SubLObject var25 = module0134.f8744(var24);
        module0030.f1599(var20, var21, var25);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15625(final SubLObject var24, final SubLObject var20) {
        f15619(var24, var20, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15626(final SubLObject var25) {
        return Hashtables.hash_table_count(var25);
    }
    
    public static SubLObject f15627() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0240", "f15606", "S#18365");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0240", "f15607", "S#18366");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0240", "f15608", "S#18367");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0240", "f15609", "S#18368");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15610", "S#18369", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15611", "S#18370", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15612", "S#18371", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15613", "S#18372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15614", "S#18373", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15615", "S#18374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15616", "S#18375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15617", "S#18376", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15618", "S#18377", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15619", "S#18378", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15620", "S#18379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15621", "S#18380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15622", "S#18381", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15623", "S#18382", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15624", "S#18383", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15625", "S#18384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0240", "f15626", "S#18385", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15628() {
        $g2447$ = SubLFiles.defparameter("S#18386", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15629() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15627();
    }
    
    public void initializeVariables() {
        f15628();
    }
    
    public void runTopLevelForms() {
        f15629();
    }
    
    static {
        me = (SubLFile)new module0240();
        $g2447$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#18386", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#18386", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#18370", "CYC"))));
        $ic5$ = makeSymbol("S#18365", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#148", "CYC"), (SubLObject)makeSymbol("S#11393", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("CDOHASH");
        $ic8$ = makeInteger(200);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 64 ms
	
	Decompiled with Procyon 0.5.32.
*/