package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0630 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0630";
    public static final String myFingerPrint = "b71f66b52e5855f86c1c7133cd3f10e7127b88d80148d2298e123bf083580afd";
    private static SubLSymbol $g4836$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    
    public static SubLObject f38668(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic2$, reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)$ic14$, (SubLObject)$ic6$, var5)));
    }
    
    public static SubLObject f38669(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic2$, reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)$ic15$, (SubLObject)$ic6$, var5)));
    }
    
    public static SubLObject f38670(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = (SubLObject)ConsesLow.cons(var9, var10);
        if (NIL == conses_high.member(var11, $g4836$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g4836$.setGlobalValue((SubLObject)ConsesLow.cons(var11, $g4836$.getGlobalValue()));
        }
        return $g4836$.getGlobalValue();
    }
    
    public static SubLObject f38671(final SubLObject var9) {
        return conses_high.assoc(var9, $g4836$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f38672(final SubLObject var12) {
        return Sequences.find(var12, $g4836$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38673(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        final SubLObject var7 = var4.rest();
        var4 = var4.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, reader.bq_cons(var5, (SubLObject)$ic22$), (SubLObject)ConsesLow.list(var8), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38674(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        final SubLObject var7 = var4.rest();
        var4 = var4.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic18$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, reader.bq_cons(var5, (SubLObject)$ic23$), (SubLObject)ConsesLow.list(var8), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38675() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0630", "f38668", "S#42303");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0630", "f38669", "S#42304");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0630", "f38670", "S#42305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0630", "f38671", "S#42306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0630", "f38672", "S#37379", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0630", "f38673", "S#42307");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0630", "f38674", "S#42308");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38676() {
        $g4836$ = SubLFiles.deflexical("S#42309", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g4836$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38677() {
        module0003.f57((SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38675();
    }
    
    public void initializeVariables() {
        f38676();
    }
    
    public void runTopLevelForms() {
        f38677();
    }
    
    static {
        me = (SubLFile)new module0630();
        $g4836$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#42310", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("ERROR"));
        $ic3$ = makeSymbol("CATCH-ERROR-MESSAGE");
        $ic4$ = makeSymbol("PROGN");
        $ic5$ = makeSymbol("PWHEN");
        $ic6$ = makeSymbol("ERROR");
        $ic7$ = makeSymbol("CAND");
        $ic8$ = makeSymbol("S#8838", "CYC");
        $ic9$ = makeSymbol("S#8879", "CYC");
        $ic10$ = makeSymbol("CNOT");
        $ic11$ = makeSymbol("S#8884", "CYC");
        $ic12$ = makeSymbol("S#42311", "CYC");
        $ic13$ = makeSymbol("S#42312", "CYC");
        $ic14$ = makeString("~a (DB-CONNECTION ~a was killed)");
        $ic15$ = makeString("~a (DB-CONNECTION ~a was rolled back)");
        $ic16$ = makeSymbol("S#42309", "CYC");
        $ic17$ = makeSymbol("CAR");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#42313", "CYC"), (SubLObject)makeSymbol("S#42314", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic19$ = makeSymbol("S#42305", "CYC");
        $ic20$ = makeSymbol("QUOTE");
        $ic21$ = makeSymbol("S#1984", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#42315", "CYC"), (SubLObject)makeKeyword("PUBLIC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#42316", "CYC"), (SubLObject)makeKeyword("PUBLIC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 39 ms
	
	Decompiled with Procyon 0.5.32.
*/