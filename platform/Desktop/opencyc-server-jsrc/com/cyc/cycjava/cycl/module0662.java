package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0662 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0662";
    public static final String myFingerPrint = "01487c5d8695cdfaa99211fdd6cf5b77db938df9db085326f3fbdb3be4f89970";
    public static SubLSymbol $g5228$;
    public static SubLSymbol $g5229$;
    public static SubLSymbol $g5230$;
    public static SubLSymbol $g5231$;
    private static final SubLString $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLString $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    
    public static SubLObject f40314(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0662.NIL;
        SubLObject var3 = var1;
        SubLObject var4 = (SubLObject)module0662.NIL;
        var4 = var3.first();
        while (module0662.NIL != var3) {
            var2 = (SubLObject)ConsesLow.cons((SubLObject)module0662.$ic0$, var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0662.NIL;
            SubLObject var8 = (SubLObject)module0662.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0662.$ic1$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0662.$ic1$);
            var8 = var6.first();
            var6 = var6.rest();
            if (module0662.NIL == var6) {
                final SubLObject var9 = f40315(var7);
                final SubLObject var10 = f40315(var8);
                var2 = (SubLObject)ConsesLow.cons(var9, var2);
                var2 = (SubLObject)ConsesLow.cons((SubLObject)module0662.$ic2$, var2);
                var2 = (SubLObject)ConsesLow.cons(var10, var2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0662.$ic1$);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        var2 = Sequences.nreverse(var2);
        var2 = var2.rest();
        return Functions.apply((SubLObject)module0662.$ic3$, var2);
    }
    
    public static SubLObject f40315(final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0662.NIL;
        if (var11.isNumber()) {
            var12 = module0038.f2624(var11);
        }
        else if (var11.isSymbol()) {
            var12 = Strings.string_downcase(Symbols.symbol_name(var11), (SubLObject)module0662.UNPROVIDED, (SubLObject)module0662.UNPROVIDED);
        }
        else if (var11.isString()) {
            var12 = var11;
        }
        else {
            var12 = module0038.f2624(var11);
        }
        return var12;
    }
    
    public static SubLObject f40316() {
        return random.random(Numbers.expt((SubLObject)module0662.TWO_INTEGER, (SubLObject)module0662.$ic7$));
    }
    
    public static SubLObject f40317() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f40316();
        final SubLObject var15 = f40316();
        Hashtables.sethash(var14, module0662.$g5229$.getDynamicValue(var13), var15);
        return (SubLObject)ConsesLow.list(var14, var15);
    }
    
    public static SubLObject f40318(final SubLObject var16) {
        return var16.first();
    }
    
    public static SubLObject f40319(final SubLObject var16) {
        return conses_high.second(var16);
    }
    
    public static SubLObject f40320(final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = Hashtables.gethash(var14, module0662.$g5229$.getDynamicValue(var16), (SubLObject)module0662.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0662.NIL != var15 && var15.equalp(var17));
    }
    
    public static SubLObject f40321(final SubLObject var18, final SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var20 == module0662.UNPROVIDED) {
            var20 = module0662.$g5230$.getDynamicValue();
        }
        if (var21 == module0662.UNPROVIDED) {
            var21 = module0662.$g5231$.getDynamicValue();
        }
        final SubLObject var22 = f40317();
        final SubLObject var23 = f40318(var22);
        final SubLObject var24 = f40319(var22);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var18);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic10$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var20);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic11$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var21);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic12$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var23);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020((SubLObject)module0662.$ic13$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0662.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0662.UNPROVIDED);
        return (SubLObject)module0662.NIL;
    }
    
    public static SubLObject f40322() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40314", "S#44399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40315", "S#44400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40316", "S#44401", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40317", "S#44402", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40318", "S#44403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40319", "S#44404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40320", "S#44405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0662", "f40321", "S#44406", 2, 2, false);
        return (SubLObject)module0662.NIL;
    }
    
    public static SubLObject f40323() {
        module0662.$g5228$ = SubLFiles.defparameter("S#44407", (SubLObject)module0662.NIL);
        module0662.$g5229$ = SubLFiles.defparameter("S#44408", Hashtables.make_hash_table((SubLObject)module0662.$ic4$, (SubLObject)module0662.EQUALP, (SubLObject)module0662.UNPROVIDED));
        module0662.$g5230$ = SubLFiles.defparameter("S#44409", (SubLObject)module0662.$ic5$);
        module0662.$g5231$ = SubLFiles.defparameter("S#44410", (SubLObject)module0662.$ic6$);
        return (SubLObject)module0662.NIL;
    }
    
    public static SubLObject f40324() {
        return (SubLObject)module0662.NIL;
    }
    
    public void declareFunctions() {
        f40322();
    }
    
    public void initializeVariables() {
        f40323();
    }
    
    public void runTopLevelForms() {
        f40324();
    }
    
    static {
        me = (SubLFile)new module0662();
        module0662.$g5228$ = null;
        module0662.$g5229$ = null;
        module0662.$g5230$ = null;
        module0662.$g5231$ = null;
        $ic0$ = SubLObjectFactory.makeString(",");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5962", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic2$ = SubLObjectFactory.makeString("=");
        $ic3$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic4$ = SubLObjectFactory.makeInteger(512);
        $ic5$ = SubLObjectFactory.makeString("");
        $ic6$ = SubLObjectFactory.makeInteger(9096);
        $ic7$ = SubLObjectFactory.makeInteger(30);
        $ic8$ = SubLObjectFactory.makeString("hiddenHost");
        $ic9$ = SubLObjectFactory.makeString("hiddenPort");
        $ic10$ = SubLObjectFactory.makeString("exposedHost");
        $ic11$ = SubLObjectFactory.makeString("exposedPort");
        $ic12$ = SubLObjectFactory.makeString("login");
        $ic13$ = SubLObjectFactory.makeString("password");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0662.class
	Total time: 65 ms
	
	Decompiled with Procyon 0.5.32.
*/