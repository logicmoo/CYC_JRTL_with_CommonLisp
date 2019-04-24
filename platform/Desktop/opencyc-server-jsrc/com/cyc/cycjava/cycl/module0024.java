package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return Mapping.mapcar((SubLObject)module0024.$ic17$, module0024.$g816$.getGlobalValue());
    }
    
    public static SubLObject f1244(final SubLObject var1) {
        assert module0024.NIL != Types.keywordp(var1) : var1;
        final SubLObject var2 = conses_high.second(conses_high.assoc(var1, module0024.$g816$.getGlobalValue(), (SubLObject)module0024.UNPROVIDED, (SubLObject)module0024.UNPROVIDED));
        if (!var2.isFixnum()) {
            Errors.error((SubLObject)module0024.$ic19$, var1, f1243());
        }
        return var2;
    }
    
    public static SubLObject f1245(final SubLObject var3) {
        assert module0024.NIL != Types.listp(var3) : var3;
        SubLObject var4 = (SubLObject)module0024.ZERO_INTEGER;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0024.NIL;
        var6 = var5.first();
        while (module0024.NIL != var5) {
            final SubLObject var7 = f1244(var6);
            var4 = Numbers.logior(var4, var7);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f1246() {
        return Mapping.mapcar((SubLObject)module0024.$ic17$, module0024.$g821$.getGlobalValue());
    }
    
    public static SubLObject f1247(final SubLObject var1) {
        assert module0024.NIL != Types.keywordp(var1) : var1;
        final SubLObject var2 = conses_high.second(conses_high.assoc(var1, module0024.$g821$.getGlobalValue(), (SubLObject)module0024.UNPROVIDED, (SubLObject)module0024.UNPROVIDED));
        if (!var2.isFixnum()) {
            Errors.error((SubLObject)module0024.$ic27$, var1, f1246());
        }
        return var2;
    }
    
    public static SubLObject f1248(final SubLObject var3) {
        assert module0024.NIL != Types.listp(var3) : var3;
        SubLObject var4 = (SubLObject)module0024.ZERO_INTEGER;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0024.NIL;
        var6 = var5.first();
        while (module0024.NIL != var5) {
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
        if (var3 == module0024.UNPROVIDED) {
            var3 = (SubLObject)module0024.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert module0024.NIL != f1249(var6) : var6;
        assert module0024.NIL != Types.listp(var3) : var3;
        final SubLObject var8 = f1245(var3);
        var7.resetMultipleValues();
        final SubLObject var9 = Regex.compile_regular_expression_impl(var6, var8);
        final SubLObject var10 = var7.secondMultipleValue();
        final SubLObject var11 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var9, (SubLObject)module0024.ZERO_INTEGER, var10, var11);
    }
    
    public static SubLObject f1252(final SubLObject var12, SubLObject var3) {
        if (var3 == module0024.UNPROVIDED) {
            var3 = (SubLObject)module0024.NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        var13.resetMultipleValues();
        final SubLObject var14 = f1251(var12, var3);
        final SubLObject var15 = var13.secondMultipleValue();
        final SubLObject var16 = var13.thirdMultipleValue();
        final SubLObject var17 = var13.fourthMultipleValue();
        var13.resetMultipleValues();
        if (module0024.NIL == var14) {
            Errors.error((SubLObject)module0024.$ic29$, var17, var16, var12);
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
        if (var3 == module0024.UNPROVIDED) {
            var3 = (SubLObject)module0024.NIL;
        }
        if (var17 == module0024.UNPROVIDED) {
            var17 = (SubLObject)module0024.ZERO_INTEGER;
        }
        if (var18 == module0024.UNPROVIDED) {
            var18 = (SubLObject)module0024.NIL;
        }
        assert module0024.NIL != f1253(var9) : var9;
        assert module0024.NIL != Types.stringp(var15) : var15;
        assert module0024.NIL != Types.fixnump(var16) : var16;
        assert module0024.NIL != Types.listp(var3) : var3;
        assert module0024.NIL != Types.fixnump(var17) : var17;
        if (module0024.NIL == var18) {
            var18 = Sequences.length(var15);
        }
        assert module0024.NIL != Types.fixnump(var18) : var18;
        final SubLObject var19 = f1248(var3);
        return Regex.match_regular_expression_pattern_offsets_impl(var9, var15, var16, var19, var17, var18);
    }
    
    public static SubLObject f1256(final SubLObject var9, final SubLObject var15, final SubLObject var16, SubLObject var3, SubLObject var17, SubLObject var18) {
        if (var3 == module0024.UNPROVIDED) {
            var3 = (SubLObject)module0024.NIL;
        }
        if (var17 == module0024.UNPROVIDED) {
            var17 = (SubLObject)module0024.ZERO_INTEGER;
        }
        if (var18 == module0024.UNPROVIDED) {
            var18 = (SubLObject)module0024.NIL;
        }
        final SubLObject var19 = f1255(var9, var15, var16, var3, var17, var18);
        SubLObject var20 = (SubLObject)module0024.NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)module0024.NIL;
        var22 = var21.first();
        while (module0024.NIL != var21) {
            SubLObject var24;
            final SubLObject var23 = var24 = var22;
            SubLObject var25 = (SubLObject)module0024.NIL;
            SubLObject var26 = (SubLObject)module0024.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0024.$ic33$);
            var25 = var24.first();
            var24 = (var26 = var24.rest());
            if (var25.numGE((SubLObject)module0024.ZERO_INTEGER) && var26.numGE((SubLObject)module0024.ZERO_INTEGER)) {
                final SubLObject var27 = Sequences.subseq(var15, var25, var26);
                var20 = (SubLObject)ConsesLow.cons(var27, var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f1257(final SubLObject var9) {
        assert module0024.NIL != f1253(var9) : var9;
        Regex.discard_regular_expression_pattern_impl(var9);
        return (SubLObject)module0024.NIL;
    }
    
    public static SubLObject f1258(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0024.$ic34$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)module0024.NIL;
        SubLObject var33 = (SubLObject)module0024.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0024.$ic34$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0024.$ic34$);
        var33 = var30.first();
        var30 = var30.rest();
        SubLObject var34 = (SubLObject)module0024.NIL;
        SubLObject var35 = var30;
        SubLObject var36 = (SubLObject)module0024.NIL;
        SubLObject var36_37 = (SubLObject)module0024.NIL;
        while (module0024.NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)module0024.$ic34$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)module0024.$ic34$);
            if (module0024.NIL == conses_high.member(var36_37, (SubLObject)module0024.$ic35$, (SubLObject)module0024.UNPROVIDED, (SubLObject)module0024.UNPROVIDED)) {
                var36 = (SubLObject)module0024.T;
            }
            if (var36_37 == module0024.$ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (module0024.NIL != var36 && module0024.NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)module0024.$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0024.$ic37$, var30);
        final SubLObject var38 = (SubLObject)((module0024.NIL != var37) ? conses_high.cadr(var37) : module0024.NIL);
        final SubLObject var39;
        var30 = (var39 = var31);
        final SubLObject var40 = (SubLObject)module0024.$ic38$;
        final SubLObject var41 = (SubLObject)module0024.$ic39$;
        final SubLObject var42 = (SubLObject)module0024.$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)module0024.$ic41$, (SubLObject)ConsesLow.list(var32, var40, var41, var42), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic42$, var33, var38), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0024.$ic44$, (SubLObject)ConsesLow.list((SubLObject)module0024.$ic45$, (SubLObject)ConsesLow.list((SubLObject)module0024.$ic30$, var32), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic46$, (SubLObject)module0024.$ic47$, var40, var42, var33, var41)), reader.bq_cons((SubLObject)module0024.$ic44$, ConsesLow.append(var39, (SubLObject)module0024.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0024.$ic30$, var32), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic49$, var32))));
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
        return (SubLObject)module0024.NIL;
    }
    
    public static SubLObject f1260() {
        module0024.$g805$ = SubLFiles.deflexical("S#2327", (SubLObject)module0024.SIXTEEN_INTEGER);
        module0024.$g806$ = SubLFiles.deflexical("S#2328", (SubLObject)module0024.ONE_INTEGER);
        module0024.$g807$ = SubLFiles.deflexical("S#2329", (SubLObject)module0024.$ic0$);
        module0024.$g808$ = SubLFiles.deflexical("S#2330", (SubLObject)module0024.FOUR_INTEGER);
        module0024.$g809$ = SubLFiles.deflexical("S#2331", (SubLObject)module0024.EIGHT_INTEGER);
        module0024.$g810$ = SubLFiles.deflexical("S#2332", (SubLObject)module0024.TWO_INTEGER);
        module0024.$g811$ = SubLFiles.deflexical("S#2333", (SubLObject)module0024.$ic1$);
        module0024.$g812$ = SubLFiles.deflexical("S#2334", (SubLObject)module0024.$ic2$);
        module0024.$g813$ = SubLFiles.deflexical("S#2335", (SubLObject)module0024.$ic3$);
        module0024.$g814$ = SubLFiles.deflexical("S#2336", (SubLObject)module0024.$ic4$);
        module0024.$g815$ = SubLFiles.deflexical("S#2337", (SubLObject)module0024.$ic5$);
        module0024.$g816$ = SubLFiles.deflexical("S#2338", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)module0024.$ic6$, module0024.$g805$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic7$, module0024.$g806$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic8$, module0024.$g807$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic9$, module0024.$g808$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic10$, module0024.$g809$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic11$, module0024.$g810$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic12$, module0024.$g812$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic13$, module0024.$g811$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic14$, module0024.$g813$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic15$, module0024.$g814$.getGlobalValue()), ConsesLow.list((SubLObject)module0024.$ic16$, module0024.$g815$.getGlobalValue()) }));
        module0024.$g817$ = SubLFiles.deflexical("S#2339", (SubLObject)module0024.SIXTEEN_INTEGER);
        module0024.$g818$ = SubLFiles.deflexical("S#2340", (SubLObject)module0024.$ic21$);
        module0024.$g819$ = SubLFiles.deflexical("S#2341", (SubLObject)module0024.$ic22$);
        module0024.$g820$ = SubLFiles.deflexical("S#2342", (SubLObject)module0024.$ic23$);
        module0024.$g821$ = SubLFiles.deflexical("S#2343", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0024.$ic6$, module0024.$g817$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic24$, module0024.$g818$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic25$, module0024.$g819$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0024.$ic26$, module0024.$g820$.getGlobalValue())));
        return (SubLObject)module0024.NIL;
    }
    
    public static SubLObject f1261() {
        return (SubLObject)module0024.NIL;
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
        module0024.$g805$ = null;
        module0024.$g806$ = null;
        module0024.$g807$ = null;
        module0024.$g808$ = null;
        module0024.$g809$ = null;
        module0024.$g810$ = null;
        module0024.$g811$ = null;
        module0024.$g812$ = null;
        module0024.$g813$ = null;
        module0024.$g814$ = null;
        module0024.$g815$ = null;
        module0024.$g816$ = null;
        module0024.$g817$ = null;
        module0024.$g818$ = null;
        module0024.$g819$ = null;
        module0024.$g820$ = null;
        module0024.$g821$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(32);
        $ic1$ = SubLObjectFactory.makeInteger(64);
        $ic2$ = SubLObjectFactory.makeInteger(512);
        $ic3$ = SubLObjectFactory.makeInteger(2048);
        $ic4$ = SubLObjectFactory.makeInteger(4096);
        $ic5$ = SubLObjectFactory.makeInteger(8192);
        $ic6$ = SubLObjectFactory.makeKeyword("ANCHORED");
        $ic7$ = SubLObjectFactory.makeKeyword("CASELESS");
        $ic8$ = SubLObjectFactory.makeKeyword("DOLLAR-ENDONLY");
        $ic9$ = SubLObjectFactory.makeKeyword("DOTALL");
        $ic10$ = SubLObjectFactory.makeKeyword("EXTENDED");
        $ic11$ = SubLObjectFactory.makeKeyword("MULTILINE");
        $ic12$ = SubLObjectFactory.makeKeyword("UNGREEDY");
        $ic13$ = SubLObjectFactory.makeKeyword("EXTRA");
        $ic14$ = SubLObjectFactory.makeKeyword("UTF8");
        $ic15$ = SubLObjectFactory.makeKeyword("NO-AUTO-CAPTURE");
        $ic16$ = SubLObjectFactory.makeKeyword("NO-UTF8-CHECK");
        $ic17$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic18$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic19$ = SubLObjectFactory.makeString("Invalid compile option ~S: only one of ~S permitted.~%");
        $ic20$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic21$ = SubLObjectFactory.makeInteger(128);
        $ic22$ = SubLObjectFactory.makeInteger(256);
        $ic23$ = SubLObjectFactory.makeInteger(1024);
        $ic24$ = SubLObjectFactory.makeKeyword("NOT-BOL");
        $ic25$ = SubLObjectFactory.makeKeyword("NOT-EOL");
        $ic26$ = SubLObjectFactory.makeKeyword("NOT-EMPTY");
        $ic27$ = SubLObjectFactory.makeString("Invalid match option ~S: only one of ~S permitted.~%");
        $ic28$ = SubLObjectFactory.makeSymbol("S#2318", "CYC");
        $ic29$ = SubLObjectFactory.makeString("~a at offset ~a while compiling regex /~a/");
        $ic30$ = SubLObjectFactory.makeSymbol("S#2321", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic32$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic33$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#2344", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2345", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#2347", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPILE-OPTIONS"));
        $ic36$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = SubLObjectFactory.makeKeyword("COMPILE-OPTIONS");
        $ic38$ = SubLObjectFactory.makeUninternedSymbol("US#52857B6");
        $ic39$ = SubLObjectFactory.makeUninternedSymbol("US#220FA5");
        $ic40$ = SubLObjectFactory.makeUninternedSymbol("US#4E943B2");
        $ic41$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic42$ = SubLObjectFactory.makeSymbol("S#2319", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic44$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic45$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic46$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic47$ = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $ic48$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic49$ = SubLObjectFactory.makeSymbol("S#2325", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0024.class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/