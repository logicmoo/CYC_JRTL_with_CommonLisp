package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0420 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0420";
    public static final String myFingerPrint = "62bdd879a552d7c3bc57d61618a8e59d101d8dda6bab9bafc8ede9f9625e77e2";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    
    public static SubLObject f29370(final SubLObject var1) {
        return module0256.f16596(var1, module0420.$ic0$, (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED);
    }
    
    public static SubLObject f29371(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)ConsesLow.cons(var2, var3);
    }
    
    public static SubLObject f29372(final SubLObject var4) {
        return var4.first();
    }
    
    public static SubLObject f29373(final SubLObject var2, SubLObject var5) {
        if (var5 == module0420.UNPROVIDED) {
            var5 = (SubLObject)module0420.NIL;
        }
        final SubLObject var6 = Sequences.delete((SubLObject)Characters.CHAR_hyphen, Strings.string_capitalize(Symbols.symbol_name(var2), (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED), (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED, (SubLObject)module0420.UNPROVIDED);
        if (module0420.NIL != var5) {
            Strings.nstring_downcase(var6, (SubLObject)module0420.ZERO_INTEGER, (SubLObject)module0420.ONE_INTEGER);
        }
        return var6;
    }
    
    public static SubLObject f29374(final SubLObject var4) {
        final SubLObject var5 = module0035.f2369(Symbols.symbol_function((SubLObject)module0420.$ic1$), f29375(var4), (SubLObject)module0420.UNPROVIDED);
        return f29373(f29372(var4), var5);
    }
    
    public static SubLObject f29375(final SubLObject var4) {
        return var4.rest();
    }
    
    public static SubLObject f29376(final SubLObject var4) {
        final SubLObject var5 = f29372(var4);
        if (var5.isCons()) {
            SubLObject var6 = (SubLObject)module0420.NIL;
            SubLObject var7 = Sequences.reverse(var5);
            SubLObject var8 = (SubLObject)module0420.NIL;
            var8 = var7.first();
            while (module0420.NIL != var7) {
                var6 = (SubLObject)ConsesLow.cons(f29377(var8), var6);
                var7 = var7.rest();
                var8 = var7.first();
            }
            return var6;
        }
        return (SubLObject)ConsesLow.list(f29377(var5));
    }
    
    public static SubLObject f29377(final SubLObject var2) {
        return (SubLObject)ConsesLow.list((SubLObject)module0420.$ic2$, var2, (SubLObject)ConsesLow.list((SubLObject)module0420.$ic3$, f29373(var2, (SubLObject)module0420.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0420.$ic4$, var2)));
    }
    
    public static SubLObject f29378(final SubLObject var4) {
        final SubLObject var5 = f29372(var4);
        final SubLObject var6 = Sequences.reverse(f29375(var4));
        if (var5.isCons()) {
            SubLObject var7 = (SubLObject)module0420.NIL;
            SubLObject var8 = Sequences.reverse(var5);
            SubLObject var9 = (SubLObject)module0420.NIL;
            var9 = var8.first();
            while (module0420.NIL != var8) {
                var7 = (SubLObject)ConsesLow.cons(f29378(f29371(var9, var6)), var7);
                var8 = var8.rest();
                var9 = var8.first();
            }
            return Functions.apply(Symbols.symbol_function((SubLObject)module0420.$ic5$), var7);
        }
        SubLObject var7 = (SubLObject)module0420.NIL;
        SubLObject var8 = Sequences.reverse(var6);
        SubLObject var10 = (SubLObject)module0420.NIL;
        var10 = var8.first();
        while (module0420.NIL != var8) {
            var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0420.$ic6$, module0420.$ic7$, var5, var10), var7);
            var8 = var8.rest();
            var10 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f29379(final SubLObject var11) {
        return (SubLObject)ConsesLow.list((SubLObject)module0420.$ic8$, reader.bq_cons((SubLObject)module0420.$ic9$, ConsesLow.append(var11, (SubLObject)module0420.NIL)));
    }
    
    public static SubLObject f29380() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29370", "S#32523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29371", "S#32524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29372", "S#32525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29373", "S#32526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29374", "S#32527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29375", "S#32528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29376", "S#32529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29377", "S#32530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29378", "S#32531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0420", "f29379", "S#32532", 1, 0, false);
        return (SubLObject)module0420.NIL;
    }
    
    public static SubLObject f29381() {
        return (SubLObject)module0420.NIL;
    }
    
    public static SubLObject f29382() {
        return (SubLObject)module0420.NIL;
    }
    
    public void declareFunctions() {
        f29380();
    }
    
    public void initializeVariables() {
        f29381();
    }
    
    public void runTopLevelForms() {
        f29382();
    }
    
    static {
        me = (SubLFile)new module0420();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#32523", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic3$ = SubLObjectFactory.makeSymbol("PRINT-CREATE");
        $ic4$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic5$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic6$ = SubLObjectFactory.makeSymbol("LIST");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic8$ = SubLObjectFactory.makeSymbol("DECLARE");
        $ic9$ = SubLObjectFactory.makeSymbol("SPECIAL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0420.class
	Total time: 58 ms
	
	Decompiled with Procyon 0.5.32.
*/