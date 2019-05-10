package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = var1;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            var2 = (SubLObject)ConsesLow.cons((SubLObject)$ic0$, var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
            var8 = var6.first();
            var6 = var6.rest();
            if (NIL == var6) {
                final SubLObject var9 = f40315(var7);
                final SubLObject var10 = f40315(var8);
                var2 = (SubLObject)ConsesLow.cons(var9, var2);
                var2 = (SubLObject)ConsesLow.cons((SubLObject)$ic2$, var2);
                var2 = (SubLObject)ConsesLow.cons(var10, var2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic1$);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        var2 = Sequences.nreverse(var2);
        var2 = var2.rest();
        return Functions.apply((SubLObject)$ic3$, var2);
    }
    
    public static SubLObject f40315(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        if (var11.isNumber()) {
            var12 = module0038.f2624(var11);
        }
        else if (var11.isSymbol()) {
            var12 = Strings.string_downcase(Symbols.symbol_name(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return random.random(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic7$));
    }
    
    public static SubLObject f40317() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f40316();
        final SubLObject var15 = f40316();
        Hashtables.sethash(var14, $g5229$.getDynamicValue(var13), var15);
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
        final SubLObject var17 = Hashtables.gethash(var14, $g5229$.getDynamicValue(var16), (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var15 && var15.equalp(var17));
    }
    
    public static SubLObject f40321(final SubLObject var18, final SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var20 == UNPROVIDED) {
            var20 = $g5230$.getDynamicValue();
        }
        if (var21 == UNPROVIDED) {
            var21 = $g5231$.getDynamicValue();
        }
        final SubLObject var22 = f40317();
        final SubLObject var23 = f40318(var22);
        final SubLObject var24 = f40319(var22);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var18);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic10$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var20);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic11$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var21);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic12$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var23);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g453$.getGlobalValue());
        module0642.f39020(module0015.$g454$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic13$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g455$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var24);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40323() {
        $g5228$ = SubLFiles.defparameter("S#44407", (SubLObject)NIL);
        $g5229$ = SubLFiles.defparameter("S#44408", Hashtables.make_hash_table((SubLObject)$ic4$, (SubLObject)EQUALP, (SubLObject)UNPROVIDED));
        $g5230$ = SubLFiles.defparameter("S#44409", (SubLObject)$ic5$);
        $g5231$ = SubLFiles.defparameter("S#44410", (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40324() {
        return (SubLObject)NIL;
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
        $g5228$ = null;
        $g5229$ = null;
        $g5230$ = null;
        $g5231$ = null;
        $ic0$ = makeString(",");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#5962", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic2$ = makeString("=");
        $ic3$ = makeSymbol("CCONCATENATE");
        $ic4$ = makeInteger(512);
        $ic5$ = makeString("");
        $ic6$ = makeInteger(9096);
        $ic7$ = makeInteger(30);
        $ic8$ = makeString("hiddenHost");
        $ic9$ = makeString("hiddenPort");
        $ic10$ = makeString("exposedHost");
        $ic11$ = makeString("exposedPort");
        $ic12$ = makeString("login");
        $ic13$ = makeString("password");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 65 ms
	
	Decompiled with Procyon 0.5.32.
*/