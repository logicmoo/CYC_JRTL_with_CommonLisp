package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0094 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0094";
    public static final String myFingerPrint = "9385ba81d235411de3acb0bca4956b557e2d33c85121e7551181c6e16f6284dd";
    public static SubLSymbol $g1257$;
    private static final SubLList $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
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
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    
    public static SubLObject f6826(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = module0093.$g1215$.getGlobalValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = module0075.f5180();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0079.f5408(var1);
        final SubLObject var7 = module0079.f5406(var1);
        SubLObject var8 = (SubLObject)NIL;
        try {
            var8 = module0093.f6656(var2, var4, var6, var3);
            final SubLObject var9 = module0079.f5424(var1);
            SubLObject var12;
            for (SubLObject var10 = (SubLObject)NIL; NIL == var10; var10 = (SubLObject)makeBoolean(NIL == var12)) {
                var5.resetMultipleValues();
                final SubLObject var11 = module0052.f3693(var9);
                var12 = var5.secondMultipleValue();
                var5.resetMultipleValues();
                if (NIL != var12) {
                    SubLObject var14;
                    final SubLObject var13 = var14 = var11;
                    SubLObject var15 = (SubLObject)NIL;
                    SubLObject var16 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic0$);
                    var15 = var14.first();
                    var14 = var14.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic0$);
                    var16 = var14.first();
                    var14 = var14.rest();
                    if (NIL == var14) {
                        module0093.f6657(var15, var8, var16);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic0$);
                    }
                }
            }
        }
        finally {
            final SubLObject var17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                if (NIL != module0093.f6749(var8)) {
                    module0093.f6658(var8, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var17, var5);
            }
        }
        return var2;
    }
    
    public static SubLObject f6827(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0093.$g1215$.getGlobalValue();
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0079.f5408(var1);
        final SubLObject var6 = module0079.f5406(var1);
        SubLObject var7 = (SubLObject)NIL;
        try {
            var7 = module0093.f6607(var2, var6, (SubLObject)$ic1$, var5, var3);
            final SubLObject var8 = module0079.f5424(var1);
            SubLObject var11;
            for (SubLObject var9 = (SubLObject)NIL; NIL == var9; var9 = (SubLObject)makeBoolean(NIL == var11)) {
                var4.resetMultipleValues();
                final SubLObject var10 = module0052.f3693(var8);
                var11 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var11) {
                    SubLObject var13;
                    final SubLObject var12 = var13 = var10;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic0$);
                    var14 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic0$);
                    var15 = var13.first();
                    var13 = var13.rest();
                    if (NIL == var13) {
                        module0093.f6618(var14, var7, var15);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic0$);
                    }
                }
            }
        }
        finally {
            final SubLObject var16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                if (NIL != module0093.f6457(var7)) {
                    module0093.f6615(var7);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var16, var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f6828(final SubLObject var1, final SubLObject var2, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0093.$g1215$.getGlobalValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0079.f5408(var1);
        final SubLObject var24 = Symbols.make_symbol((SubLObject)$ic2$);
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        try {
            var28 = module0093.f6613(var2, var23, var3);
            final SubLObject var29 = (SubLObject)$ic3$;
            SubLObject var30 = (SubLObject)ZERO_INTEGER;
            final SubLObject var31 = module0079.f5406(var1);
            assert NIL != Types.stringp(var29) : var29;
            final SubLObject var32 = module0012.$g75$.currentBinding(var22);
            final SubLObject var33 = module0012.$g76$.currentBinding(var22);
            final SubLObject var34 = module0012.$g77$.currentBinding(var22);
            final SubLObject var35 = module0012.$g78$.currentBinding(var22);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var22);
                module0012.$g76$.bind((SubLObject)NIL, var22);
                module0012.$g77$.bind((SubLObject)T, var22);
                module0012.$g78$.bind(Time.get_universal_time(), var22);
                module0012.f478(var29);
                final SubLObject var36 = module0079.f5424(var1);
                SubLObject var39;
                for (SubLObject var37 = (SubLObject)NIL; NIL == var37; var37 = (SubLObject)makeBoolean(NIL == var39)) {
                    var22.resetMultipleValues();
                    final SubLObject var38 = module0052.f3693(var36);
                    var39 = var22.secondMultipleValue();
                    var22.resetMultipleValues();
                    if (NIL != var39) {
                        SubLObject var41;
                        final SubLObject var40 = var41 = var38;
                        SubLObject var42 = (SubLObject)NIL;
                        SubLObject var43 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic0$);
                        var42 = var41.first();
                        var41 = var41.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic0$);
                        var43 = var41.first();
                        var41 = var41.rest();
                        if (NIL == var41) {
                            module0012.note_percent_progress(var30, var31);
                            var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER);
                            final SubLObject var44 = module0093.f6621(var42, var28, var24);
                            if (var24.eql(var44)) {
                                var25 = (SubLObject)ConsesLow.cons(var42, var25);
                            }
                            else {
                                final SubLObject var45 = Functions.funcall(var21, var43, var44);
                                if (NIL == module0035.sublisp_boolean(var45)) {
                                    var27 = (SubLObject)ConsesLow.cons(var42, var27);
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic0$);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var35, var22);
                module0012.$g77$.rebind(var34, var22);
                module0012.$g76$.rebind(var33, var22);
                module0012.$g75$.rebind(var32, var22);
            }
            if (!module0079.f5406(var1).numE(module0093.f6612(var28))) {
                final SubLObject var46 = var28;
                module0012.$g82$.setDynamicValue((SubLObject)$ic5$, var22);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var22);
                module0012.$g83$.setDynamicValue(module0093.f6612(var46), var22);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var22);
                final SubLObject var47 = module0012.$g75$.currentBinding(var22);
                final SubLObject var48 = module0012.$g76$.currentBinding(var22);
                final SubLObject var49 = module0012.$g77$.currentBinding(var22);
                final SubLObject var50 = module0012.$g78$.currentBinding(var22);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var22);
                    module0012.$g76$.bind((SubLObject)NIL, var22);
                    module0012.$g77$.bind((SubLObject)T, var22);
                    module0012.$g78$.bind(Time.get_universal_time(), var22);
                    module0012.f478(module0012.$g82$.getDynamicValue(var22));
                    SubLObject var51 = (SubLObject)NIL;
                    SubLObject var55;
                    for (SubLObject var52 = (SubLObject)NIL; NIL == var52; var52 = Types.sublisp_null(var55)) {
                        var22.resetMultipleValues();
                        final SubLObject var53 = module0093.f6632(var46, var51, (SubLObject)T);
                        final SubLObject var54 = var22.secondMultipleValue();
                        var55 = var22.thirdMultipleValue();
                        var22.resetMultipleValues();
                        if (NIL != var55) {
                            final SubLObject var56 = var53;
                            final SubLObject var57 = var54;
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var22), module0012.$g83$.getDynamicValue(var22));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var22), (SubLObject)ONE_INTEGER), var22);
                            final SubLObject var58 = module0079.f5414(var1, var56, var24);
                            if (var24.eql(var58)) {
                                var26 = (SubLObject)ConsesLow.cons(var56, var26);
                            }
                        }
                        var51 = var55;
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var50, var22);
                    module0012.$g77$.rebind(var49, var22);
                    module0012.$g76$.rebind(var48, var22);
                    module0012.$g75$.rebind(var47, var22);
                }
            }
        }
        finally {
            final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var22);
                if (NIL != module0093.f6457(var28)) {
                    module0093.f6615(var28);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var59, var22);
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic6$, var25, (SubLObject)$ic7$, var26, (SubLObject)$ic8$, var27);
    }
    
    public static SubLObject f6829(final SubLObject var45, final SubLObject var46, final SubLObject var3, final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0067.f4880(var46, (SubLObject)UNPROVIDED);
        final SubLObject var51 = $g1257$.getDynamicValue(var49);
        final SubLObject var52 = module0075.f5182(var51);
        SubLObject var53 = (SubLObject)$ic17$;
        try {
            SubLObject var54 = var45;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                SubLObject var57;
                final SubLObject var56 = var57 = var55;
                SubLObject var58 = (SubLObject)NIL;
                SubLObject var59 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic18$);
                var58 = var57.first();
                var57 = (var59 = var57.rest());
                module0079.f5412(var50, var58, var59);
                var54 = var54.rest();
                var55 = var54.first();
            }
            if (var47.eql((SubLObject)$ic19$)) {
                f6827(var50, var52, var3);
            }
            else if (var47.eql((SubLObject)$ic20$)) {
                f6826(var50, var52, var3, var51);
            }
            else {
                Errors.error((SubLObject)$ic21$, var47);
            }
            final SubLObject var60 = f6828(var50, var52, var48, var3);
            final SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = var62;
            SubLObject var65 = (SubLObject)NIL;
            SubLObject var63_64 = (SubLObject)NIL;
            while (NIL != var64) {
                cdestructuring_bind.destructuring_bind_must_consp(var64, var61, (SubLObject)$ic22$);
                var63_64 = var64.first();
                var64 = var64.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var64, var61, (SubLObject)$ic22$);
                if (NIL == conses_high.member(var63_64, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var65 = (SubLObject)T;
                }
                if (var63_64 == $ic24$) {
                    var63 = var64.first();
                }
                var64 = var64.rest();
            }
            if (NIL != var65 && NIL == var63) {
                cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic22$);
            }
            final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var62);
            final SubLObject var67 = (SubLObject)((NIL != var66) ? conses_high.cadr(var66) : NIL);
            final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var62);
            final SubLObject var69 = (SubLObject)((NIL != var68) ? conses_high.cadr(var68) : NIL);
            final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var62);
            final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : NIL);
            if (NIL != var71 || NIL != var69 || NIL != var67) {
                var53 = var60;
            }
        }
        finally {
            final SubLObject var72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var49);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var49);
                SubLObject var73 = (SubLObject)NIL;
                try {
                    var49.throwStack.push($ic25$);
                    final SubLObject var17_69 = Errors.$error_handler$.currentBinding(var49);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic26$), var49);
                        try {
                            Filesys.delete_file(var52);
                        }
                        catch (Throwable var74) {
                            Errors.handleThrowable(var74, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var17_69, var49);
                    }
                }
                catch (Throwable var75) {
                    var73 = Errors.handleThrowable(var75, (SubLObject)$ic25$);
                    var49.throwStack.pop();
                }
                finally {
                    var49.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var72, var49);
            }
        }
        return var53;
    }
    
    public static SubLObject f6830() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0094", "f6826", "S#8616", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0094", "f6827", "S#8617", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0094", "f6828", "S#8618", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0094", "f6829", "S#8619", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6831() {
        $g1257$ = SubLFiles.defparameter("S#8620", module0075.f5180());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6832() {
        module0027.f1449((SubLObject)$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic10$, EQUAL, $ic11$, NIL, $ic12$, NIL, $ic13$, $ic14$, $ic15$, T }), (SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6830();
    }
    
    public void initializeVariables() {
        f6831();
    }
    
    public void runTopLevelForms() {
        f6832();
    }
    
    static {
        me = (SubLFile)new module0094();
        $g1257$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("VALUES"));
        $ic1$ = makeInteger(256);
        $ic2$ = makeString("Not Found");
        $ic3$ = makeString("Checking the map against the FHT ....");
        $ic4$ = makeSymbol("STRINGP");
        $ic5$ = makeString("Given size mismatch, check for extra keys ...");
        $ic6$ = makeKeyword("MAP-ONLY");
        $ic7$ = makeKeyword("FHT-ONLY");
        $ic8$ = makeKeyword("VALUES-DIFFER");
        $ic9$ = makeSymbol("S#8619", "CYC");
        $ic10$ = makeKeyword("TEST");
        $ic11$ = makeKeyword("OWNER");
        $ic12$ = makeKeyword("CLASSES");
        $ic13$ = makeKeyword("KB");
        $ic14$ = makeKeyword("TINY");
        $ic15$ = makeKeyword("WORKING?");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("bd5880ee-9c29-11b1-9dad-c379636f7270"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("bd588052-9c29-11b1-9dad-c379636f7270"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("bd588044-9c29-11b1-9dad-c379636f7270"), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeString("bd58810e-9c29-11b1-9dad-c379636f7270"), (SubLObject)THREE_INTEGER)), (SubLObject)EQUAL, (SubLObject)makeKeyword("IMAGE-DEPENDENT-CFASL"), (SubLObject)makeKeyword("SLOW"), (SubLObject)makeSymbol("=")), (SubLObject)makeKeyword("SUCCESS")));
        $ic17$ = makeKeyword("SUCCESS");
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic19$ = makeKeyword("SLOW");
        $ic20$ = makeKeyword("FAST");
        $ic21$ = makeString("Unknown write style ~A.");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#8621", "CYC"), (SubLObject)makeSymbol("S#8622", "CYC"), (SubLObject)makeSymbol("S#8623", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("MAP-ONLY"), (SubLObject)makeKeyword("FHT-ONLY"), (SubLObject)makeKeyword("VALUES-DIFFER"));
        $ic24$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic25$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic26$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 227 ms
	
	Decompiled with Procyon 0.5.32.
*/