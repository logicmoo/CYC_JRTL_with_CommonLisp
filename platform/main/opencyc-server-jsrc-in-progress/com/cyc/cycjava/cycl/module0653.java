package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0653 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0653";
    public static final String myFingerPrint = "a253e8c4dd7a82c8d8412efb002141db098ec3e10f4bb40903240b0dedbb9459";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLInteger $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    
    public static SubLObject f39726(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var4 = conses_high.member(var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var4.rest()) {
            return conses_high.cadr(var4);
        }
        return var3;
    }
    
    public static SubLObject f39727(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic0$);
        var9 = var8.first();
        final SubLObject var10;
        var8 = (var10 = var8.rest());
        final SubLObject var11 = (SubLObject)$ic1$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, var10.first())), ConsesLow.append(var10.rest(), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, var11))));
    }
    
    public static SubLObject f39728(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic5$, var9.first()), ConsesLow.append(var9.rest(), (SubLObject)NIL));
    }
    
    public static SubLObject f39729(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic5$, var9.first())), ConsesLow.append(var9.rest(), (SubLObject)NIL));
    }
    
    public static SubLObject f39730(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic0$);
        var9 = var8.first();
        final SubLObject var10;
        var8 = (var10 = var8.rest());
        return reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(conses_high.butlast(var10, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, conses_high.last(var10, (SubLObject)UNPROVIDED)))));
    }
    
    public static SubLObject f39731(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var9 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var9));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39732(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic8$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic8$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic8$);
        var11 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            final SubLObject var12 = (SubLObject)$ic9$;
            final SubLObject var13 = Strings.string(var9);
            final SubLObject var14 = Sequences.subseq(var13, (SubLObject)ONE_INTEGER, module0048.f_1_(Sequences.length(var13)));
            final SubLObject var15 = Packages.intern(var14, (SubLObject)UNPROVIDED);
            final SubLObject var16 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic10$, var14), (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var9, var10, var11), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var15, (SubLObject)NIL, PrintLow.format((SubLObject)NIL, (SubLObject)$ic13$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var16, (SubLObject)ConsesLow.list(var12), PrintLow.format((SubLObject)NIL, (SubLObject)$ic15$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, var12), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var9)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39733(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic16$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic16$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic16$);
        var11 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            final SubLObject var12 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic17$, Strings.string_upcase(Strings.string(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
            final SubLObject var13 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic18$, Strings.string_upcase(Strings.string(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var12, (SubLObject)NIL, PrintLow.format((SubLObject)NIL, (SubLObject)$ic20$, Strings.string_downcase(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))), (SubLObject)ConsesLow.list((SubLObject)$ic19$, Packages.intern(var13, (SubLObject)UNPROVIDED), var10, var11));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39734(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic21$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic21$);
        var10 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            final SubLObject var11;
            var8 = (var11 = var9);
            return reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39735(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic22$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic22$);
        var10 = var8.first();
        var8 = var8.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var47_48 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var7, (SubLObject)$ic22$);
            var47_48 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var7, (SubLObject)$ic22$);
            if (NIL == conses_high.member(var47_48, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var47_48 == $ic24$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic22$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var8);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic26$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var8);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : THREE_INTEGER);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic28$, var8);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var8);
        final SubLObject var21 = (NIL != var20) ? conses_high.cadr(var20) : $ic30$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic31$, var9, var10, var15, var17, var19, var21);
    }
    
    public static SubLObject f39736() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0653", "f39726", "S#43618", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39727", "S#43619");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39728", "S#43620");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39729", "S#43621");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39730", "S#43622");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39731", "S#43623");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39732", "S#43624");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39733", "S#43625");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39734", "S#43626");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0653", "f39735", "S#43627");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39737() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39738() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39736();
    }
    
    public void initializeVariables() {
        f39737();
    }
    
    public void runTopLevelForms() {
        f39738();
    }
    
    static {
        me = (SubLFile)new module0653();
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#28812", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#703B6C2");
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("CSETQ");
        $ic4$ = makeSymbol("PROGN");
        $ic5$ = makeSymbol("S#9932", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#169", "CYC"));
        $ic7$ = makeSymbol("1+");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#43628", "CYC"), (SubLObject)makeSymbol("COMMENT"));
        $ic9$ = makeUninternedSymbol("US#68619E7");
        $ic10$ = makeString("SET-~A");
        $ic11$ = makeSymbol("S#439", "CYC");
        $ic12$ = makeSymbol("DEFINE");
        $ic13$ = makeString("Accessor for ~A");
        $ic14$ = makeSymbol("RET");
        $ic15$ = makeString("Set function for ~A");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#5430", "CYC"), (SubLObject)makeSymbol("S#43628", "CYC"), (SubLObject)makeSymbol("COMMENT"));
        $ic17$ = makeString("*CB-USE-~A*");
        $ic18$ = makeString("*CB-~A*");
        $ic19$ = makeSymbol("S#43624", "CYC");
        $ic20$ = makeString("Should we use the content of ~A. This is set to nil when the user is not filtering based on this parameter.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43629", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#43630", "CYC"), (SubLObject)makeSymbol("S#43631", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43632", "CYC"), (SubLObject)makeInteger(50)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43633", "CYC"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43634", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43635", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("Thing"))));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("MAX-RESULTS"), (SubLObject)makeKeyword("MIN-QUERY-LENGTH"), (SubLObject)makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?"), (SubLObject)makeKeyword("FILTER-TERM"));
        $ic24$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic25$ = makeKeyword("MAX-RESULTS");
        $ic26$ = makeInteger(50);
        $ic27$ = makeKeyword("MIN-QUERY-LENGTH");
        $ic28$ = makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?");
        $ic29$ = makeKeyword("FILTER-TERM");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic31$ = makeSymbol("S#1635", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 70 ms
	
	Decompiled with Procyon 0.5.32.
*/