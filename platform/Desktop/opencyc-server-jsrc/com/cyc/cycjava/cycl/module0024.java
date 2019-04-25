package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0024 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0024";
    public static final String myFingerPrint = "a575562705ede9747c5314ed2ac23c36385cc8de6f68224abf23ad6a44dd03aa";
    private static SubLSymbol $g805$;
    private static SubLSymbol $g806$;
    private static SubLSymbol $g807$;
    private static SubLSymbol $g808$;
    private static SubLSymbol $g809$;
    private static SubLSymbol $g810$;
    private static SubLSymbol $g811$;
    private static SubLSymbol $g812$;
    private static SubLSymbol $g813$;
    private static SubLSymbol $g814$;
    private static SubLSymbol $g815$;
    private static SubLSymbol $g816$;
    private static SubLSymbol $g817$;
    private static SubLSymbol $g818$;
    private static SubLSymbol $g819$;
    private static SubLSymbol $g820$;
    private static SubLSymbol $g821$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLInteger $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    
    public static SubLObject f1243() {
        return Mapping.mapcar((SubLObject)$ic17$, $g816$.getGlobalValue());
    }
    
    public static SubLObject f1244(final SubLObject var1) {
        assert NIL != Types.keywordp(var1) : var1;
        final SubLObject var2 = conses_high.second(conses_high.assoc(var1, $g816$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (!var2.isFixnum()) {
            Errors.error((SubLObject)$ic19$, var1, f1243());
        }
        return var2;
    }
    
    public static SubLObject f1245(final SubLObject var3) {
        assert NIL != Types.listp(var3) : var3;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            final SubLObject var7 = f1244(var6);
            var4 = Numbers.logior(var4, var7);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f1246() {
        return Mapping.mapcar((SubLObject)$ic17$, $g821$.getGlobalValue());
    }
    
    public static SubLObject f1247(final SubLObject var1) {
        assert NIL != Types.keywordp(var1) : var1;
        final SubLObject var2 = conses_high.second(conses_high.assoc(var1, $g821$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (!var2.isFixnum()) {
            Errors.error((SubLObject)$ic27$, var1, f1246());
        }
        return var2;
    }
    
    public static SubLObject f1248(final SubLObject var3) {
        assert NIL != Types.listp(var3) : var3;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            final SubLObject var7 = f1247(var6);
            var4 = Numbers.logior(var4, var7);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f1249(final SubLObject var6) {
        return Types.stringp(var6);
    }
    
    public static SubLObject f1250() {
        return Regex.is_regex_implementation_availableP();
    }
    
    public static SubLObject f1251(final SubLObject var6, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert NIL != f1249(var6) : var6;
        assert NIL != Types.listp(var3) : var3;
        final SubLObject var8 = f1245(var3);
        var7.resetMultipleValues();
        final SubLObject var9 = Regex.compile_regular_expression_impl(var6, var8);
        final SubLObject var10 = var7.secondMultipleValue();
        final SubLObject var11 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var9, (SubLObject)ZERO_INTEGER, var10, var11);
    }
    
    public static SubLObject f1252(final SubLObject var12, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        var13.resetMultipleValues();
        final SubLObject var14 = f1251(var12, var3);
        final SubLObject var15 = var13.secondMultipleValue();
        final SubLObject var16 = var13.thirdMultipleValue();
        final SubLObject var17 = var13.fourthMultipleValue();
        var13.resetMultipleValues();
        if (NIL == var14) {
            Errors.error((SubLObject)$ic29$, var17, var16, var12);
        }
        return var14;
    }
    
    public static SubLObject f1253(final SubLObject var9) {
        return Regex.regex_pattern_p_impl(var9);
    }
    
    public static SubLObject f1254(final SubLObject var14) {
        return Types.stringp(var14);
    }
    
    public static SubLObject f1255(final SubLObject var9, final SubLObject var15, final SubLObject var16, SubLObject var3, SubLObject var17, SubLObject var18) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)ZERO_INTEGER;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        assert NIL != f1253(var9) : var9;
        assert NIL != Types.stringp(var15) : var15;
        assert NIL != Types.fixnump(var16) : var16;
        assert NIL != Types.listp(var3) : var3;
        assert NIL != Types.fixnump(var17) : var17;
        if (NIL == var18) {
            var18 = Sequences.length(var15);
        }
        assert NIL != Types.fixnump(var18) : var18;
        final SubLObject var19 = f1248(var3);
        return Regex.match_regular_expression_pattern_offsets_impl(var9, var15, var16, var19, var17, var18);
    }
    
    public static SubLObject f1256(final SubLObject var9, final SubLObject var15, final SubLObject var16, SubLObject var3, SubLObject var17, SubLObject var18) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)ZERO_INTEGER;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = f1255(var9, var15, var16, var3, var17, var18);
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            SubLObject var24;
            final SubLObject var23 = var24 = var22;
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic33$);
            var25 = var24.first();
            var24 = (var26 = var24.rest());
            if (var25.numGE((SubLObject)ZERO_INTEGER) && var26.numGE((SubLObject)ZERO_INTEGER)) {
                final SubLObject var27 = Sequences.subseq(var15, var25, var26);
                var20 = (SubLObject)ConsesLow.cons(var27, var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f1257(final SubLObject var9) {
        assert NIL != f1253(var9) : var9;
        Regex.discard_regular_expression_pattern_impl(var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1258(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        var33 = var30.first();
        var30 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var30;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var36_37 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic34$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var36_37, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var36_37 == $ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var30);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39;
        var30 = (var39 = var31);
        final SubLObject var40 = (SubLObject)$ic38$;
        final SubLObject var41 = (SubLObject)$ic39$;
        final SubLObject var42 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list(var32, var40, var41, var42), (SubLObject)ConsesLow.list((SubLObject)$ic42$, var33, var38), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var32), (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)$ic47$, var40, var42, var33, var41)), reader.bq_cons((SubLObject)$ic44$, ConsesLow.append(var39, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var32), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var32))));
    }
    
    public static SubLObject f1259() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1243", "S#2312", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1244", "S#2313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1245", "S#2314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1246", "S#2315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1247", "S#2316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1248", "S#2317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1249", "S#2318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1250", "IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1251", "S#2319", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1252", "S#2320", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1253", "S#2321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1254", "S#2322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1255", "S#2323", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1256", "S#2324", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0024", "f1257", "S#2325", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0024", "f1258", "S#2326");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1260() {
        $g805$ = SubLFiles.deflexical("S#2327", (SubLObject)SIXTEEN_INTEGER);
        $g806$ = SubLFiles.deflexical("S#2328", (SubLObject)ONE_INTEGER);
        $g807$ = SubLFiles.deflexical("S#2329", (SubLObject)$ic0$);
        $g808$ = SubLFiles.deflexical("S#2330", (SubLObject)FOUR_INTEGER);
        $g809$ = SubLFiles.deflexical("S#2331", (SubLObject)EIGHT_INTEGER);
        $g810$ = SubLFiles.deflexical("S#2332", (SubLObject)TWO_INTEGER);
        $g811$ = SubLFiles.deflexical("S#2333", (SubLObject)$ic1$);
        $g812$ = SubLFiles.deflexical("S#2334", (SubLObject)$ic2$);
        $g813$ = SubLFiles.deflexical("S#2335", (SubLObject)$ic3$);
        $g814$ = SubLFiles.deflexical("S#2336", (SubLObject)$ic4$);
        $g815$ = SubLFiles.deflexical("S#2337", (SubLObject)$ic5$);
        $g816$ = SubLFiles.deflexical("S#2338", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)$ic6$, $g805$.getGlobalValue()), ConsesLow.list((SubLObject)$ic7$, $g806$.getGlobalValue()), ConsesLow.list((SubLObject)$ic8$, $g807$.getGlobalValue()), ConsesLow.list((SubLObject)$ic9$, $g808$.getGlobalValue()), ConsesLow.list((SubLObject)$ic10$, $g809$.getGlobalValue()), ConsesLow.list((SubLObject)$ic11$, $g810$.getGlobalValue()), ConsesLow.list((SubLObject)$ic12$, $g812$.getGlobalValue()), ConsesLow.list((SubLObject)$ic13$, $g811$.getGlobalValue()), ConsesLow.list((SubLObject)$ic14$, $g813$.getGlobalValue()), ConsesLow.list((SubLObject)$ic15$, $g814$.getGlobalValue()), ConsesLow.list((SubLObject)$ic16$, $g815$.getGlobalValue()) }));
        $g817$ = SubLFiles.deflexical("S#2339", (SubLObject)SIXTEEN_INTEGER);
        $g818$ = SubLFiles.deflexical("S#2340", (SubLObject)$ic21$);
        $g819$ = SubLFiles.deflexical("S#2341", (SubLObject)$ic22$);
        $g820$ = SubLFiles.deflexical("S#2342", (SubLObject)$ic23$);
        $g821$ = SubLFiles.deflexical("S#2343", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic6$, $g817$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic24$, $g818$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic25$, $g819$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic26$, $g820$.getGlobalValue())));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1261() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f1259();
    }
    
    public void initializeVariables() {
        f1260();
    }
    
    public void runTopLevelForms() {
        f1261();
    }
    
    static {
        me = (SubLFile)new module0024();
        $g805$ = null;
        $g806$ = null;
        $g807$ = null;
        $g808$ = null;
        $g809$ = null;
        $g810$ = null;
        $g811$ = null;
        $g812$ = null;
        $g813$ = null;
        $g814$ = null;
        $g815$ = null;
        $g816$ = null;
        $g817$ = null;
        $g818$ = null;
        $g819$ = null;
        $g820$ = null;
        $g821$ = null;
        $ic0$ = makeInteger(32);
        $ic1$ = makeInteger(64);
        $ic2$ = makeInteger(512);
        $ic3$ = makeInteger(2048);
        $ic4$ = makeInteger(4096);
        $ic5$ = makeInteger(8192);
        $ic6$ = makeKeyword("ANCHORED");
        $ic7$ = makeKeyword("CASELESS");
        $ic8$ = makeKeyword("DOLLAR-ENDONLY");
        $ic9$ = makeKeyword("DOTALL");
        $ic10$ = makeKeyword("EXTENDED");
        $ic11$ = makeKeyword("MULTILINE");
        $ic12$ = makeKeyword("UNGREEDY");
        $ic13$ = makeKeyword("EXTRA");
        $ic14$ = makeKeyword("UTF8");
        $ic15$ = makeKeyword("NO-AUTO-CAPTURE");
        $ic16$ = makeKeyword("NO-UTF8-CHECK");
        $ic17$ = makeSymbol("FIRST");
        $ic18$ = makeSymbol("KEYWORDP");
        $ic19$ = makeString("Invalid compile option ~S: only one of ~S permitted.~%");
        $ic20$ = makeSymbol("LISTP");
        $ic21$ = makeInteger(128);
        $ic22$ = makeInteger(256);
        $ic23$ = makeInteger(1024);
        $ic24$ = makeKeyword("NOT-BOL");
        $ic25$ = makeKeyword("NOT-EOL");
        $ic26$ = makeKeyword("NOT-EMPTY");
        $ic27$ = makeString("Invalid match option ~S: only one of ~S permitted.~%");
        $ic28$ = makeSymbol("S#2318", "CYC");
        $ic29$ = makeString("~a at offset ~a while compiling regex /~a/");
        $ic30$ = makeSymbol("S#2321", "CYC");
        $ic31$ = makeSymbol("STRINGP");
        $ic32$ = makeSymbol("FIXNUMP");
        $ic33$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#2344", "CYC"), (SubLObject)makeSymbol("S#2345", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("S#2346", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#2347", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("COMPILE-OPTIONS"));
        $ic36$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = makeKeyword("COMPILE-OPTIONS");
        $ic38$ = makeUninternedSymbol("US#52857B6");
        $ic39$ = makeUninternedSymbol("US#220FA5");
        $ic40$ = makeUninternedSymbol("US#4E943B2");
        $ic41$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic42$ = makeSymbol("S#2319", "CYC");
        $ic43$ = makeSymbol("CUNWIND-PROTECT");
        $ic44$ = makeSymbol("PROGN");
        $ic45$ = makeSymbol("PUNLESS");
        $ic46$ = makeSymbol("ERROR");
        $ic47$ = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $ic48$ = makeSymbol("PWHEN");
        $ic49$ = makeSymbol("S#2325", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/