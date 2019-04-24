package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0115 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0115";
    public static final String myFingerPrint = "2d91c51f34989e41c6c47c9351b2e6018eb26d9693b270519eada1105678770e";
    public static SubLSymbol $g1450$;
    public static SubLSymbol $g1451$;
    private static SubLSymbol $g1452$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    
    public static SubLObject f7976() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0115.$g1450$.getDynamicValue(var1);
    }
    
    public static SubLObject f7977() {
        module0115.$g1450$.setDynamicValue((SubLObject)module0115.T);
        return f7976();
    }
    
    public static SubLObject f7978() {
        module0115.$g1450$.setDynamicValue((SubLObject)module0115.NIL);
        return f7976();
    }
    
    public static SubLObject f7979(final SubLObject var2, final SubLObject var3) {
        return f7980(var2, var3);
    }
    
    public static SubLObject f7980(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0115.NIL;
        final SubLObject var6 = module0021.$g777$.currentBinding(var4);
        try {
            module0021.$g777$.bind((SubLObject)module0115.NIL, var4);
            module0021.f1149((SubLObject)module0115.NIL);
            final SubLObject var5_6 = module0115.$g1450$.currentBinding(var4);
            final SubLObject var7 = module0111.$g1409$.currentBinding(var4);
            final SubLObject var8 = module0114.$g1431$.currentBinding(var4);
            final SubLObject var9 = module0114.$g1433$.currentBinding(var4);
            final SubLObject var10 = module0114.$g1437$.currentBinding(var4);
            final SubLObject var11 = module0115.$g1451$.currentBinding(var4);
            try {
                module0115.$g1450$.bind((SubLObject)module0115.NIL, var4);
                module0111.$g1409$.bind((SubLObject)module0115.NIL, var4);
                module0114.$g1431$.bind((SubLObject)module0115.$ic3$, var4);
                module0114.$g1433$.bind((SubLObject)module0115.$ic4$, var4);
                module0114.$g1437$.bind((SubLObject)module0115.$ic5$, var4);
                module0115.$g1451$.bind(StreamsLow.$standard_output$.getDynamicValue(var4), var4);
                var5 = module0114.f7940(var2, var3);
            }
            finally {
                module0115.$g1451$.rebind(var11, var4);
                module0114.$g1437$.rebind(var10, var4);
                module0114.$g1433$.rebind(var9, var4);
                module0114.$g1431$.rebind(var8, var4);
                module0111.$g1409$.rebind(var7, var4);
                module0115.$g1450$.rebind(var5_6, var4);
            }
        }
        finally {
            module0021.$g777$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f7981() {
        return module0114.f7942();
    }
    
    public static SubLObject f7982() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var1), module0110.$g1383$.getDynamicValue(var1));
    }
    
    public static SubLObject f7983(final SubLObject var2, SubLObject var12, SubLObject var13) {
        if (var12 == module0115.UNPROVIDED) {
            var12 = (SubLObject)module0115.T;
        }
        if (var13 == module0115.UNPROVIDED) {
            var13 = (SubLObject)module0115.$ic6$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0115.NIL;
        SubLObject var16 = (SubLObject)module0115.NIL;
        try {
            var14.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var17 = Errors.$error_handler$.currentBinding(var14);
            try {
                Errors.$error_handler$.bind((SubLObject)module0115.$ic7$, var14);
                try {
                    var15 = module0021.f1060(var2, var12, var13);
                }
                catch (Throwable var18) {
                    Errors.handleThrowable(var18, (SubLObject)module0115.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var17, var14);
            }
        }
        catch (Throwable var19) {
            var16 = Errors.handleThrowable(var19, module0003.$g3$.getGlobalValue());
        }
        finally {
            var14.throwStack.pop();
        }
        if (module0115.NIL != var16) {}
        return var15;
    }
    
    public static SubLObject f7984(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0115.NIL == module0035.f2014(var18)) {
            Errors.error((SubLObject)module0115.$ic8$, var18);
        }
        if (module0115.NIL == module0112.$g1410$.getDynamicValue(var19) && module0115.NIL == module0114.f7955(var18.first())) {
            Errors.error((SubLObject)module0115.$ic9$, var18.first());
        }
        return (SubLObject)module0115.T;
    }
    
    public static SubLObject f7985(final SubLObject var3, SubLObject var19, SubLObject var20) {
        if (var20 == module0115.UNPROVIDED) {
            var20 = (SubLObject)module0115.NIL;
        }
        if (module0115.NIL != var20) {
            var19 = f7986(var19);
        }
        module0021.f1038(Types.sublisp_null(var20), var3);
        if (module0115.NIL != f7976()) {
            module0021.f1040(var19, var3);
        }
        else {
            module0021.f1038(var19, var3);
        }
        streams_high.force_output(var3);
        return var19;
    }
    
    public static SubLObject f7987(final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var21.isCons() && module0115.$ic10$ == var21.first() && module0115.NIL != module0035.f2014(var21) && module0115.THREE_INTEGER.numE(Sequences.length(var21)) && module0115.$ic11$ == conses_high.second(var21) && conses_high.third(var21).isString());
    }
    
    public static SubLObject f7986(final SubLObject var22) {
        assert module0115.NIL != Types.stringp(var22) : var22;
        return (SubLObject)ConsesLow.list((SubLObject)module0115.$ic10$, (SubLObject)module0115.$ic11$, var22);
    }
    
    public static SubLObject f7988(final SubLObject var23) {
        return conses_high.third(var23);
    }
    
    public static SubLObject f7989(final SubLObject var18, final SubLObject var24, final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        assert module0115.NIL != Types.stringp(var24) : var24;
        assert module0115.NIL != Types.integerp(var25) : var25;
        SubLObject var27 = (SubLObject)module0115.NIL;
        SubLObject var28 = (SubLObject)module0115.NIL;
        SubLObject var29 = (SubLObject)module0115.NIL;
        try {
            var29 = module0004.f82(var24, var25, (SubLObject)module0115.NIL, (SubLObject)module0115.$ic14$);
            if (module0115.NIL != module0003.f70(var29, var24, var25)) {
                var26.resetMultipleValues();
                final SubLObject var29_30 = f7990(var18, var29);
                final SubLObject var31_32 = var26.secondMultipleValue();
                var26.resetMultipleValues();
                var27 = var29_30;
                var28 = var31_32;
                module0021.f1038((SubLObject)module0115.$ic15$, var29);
                streams_high.force_output(var29);
            }
        }
        finally {
            final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0115.T, var26);
                if (module0115.NIL != var29) {
                    streams_high.close(var29, (SubLObject)module0115.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var30, var26);
            }
        }
        if (module0115.NIL == var28) {
            return Errors.error((SubLObject)module0115.$ic16$, f7988(var27));
        }
        return var27;
    }
    
    public static SubLObject f7991(final SubLObject var18, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert module0115.NIL != Types.streamp(var28) : var28;
        var29.resetMultipleValues();
        final SubLObject var30 = f7990(var18, var28);
        final SubLObject var31 = var29.secondMultipleValue();
        var29.resetMultipleValues();
        if (module0115.NIL == var31) {
            return Errors.error((SubLObject)module0115.$ic16$, f7988(var30));
        }
        return var30;
    }
    
    public static SubLObject f7990(final SubLObject var18, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f7992(var18, var28);
        streams_high.force_output(var28);
        final SubLObject var30 = f7993(var28, (SubLObject)module0115.T);
        final SubLObject var31 = f7993(var28, module0115.$g1452$.getDynamicValue(var29));
        return Values.values(var31, var30);
    }
    
    public static SubLObject f7992(final SubLObject var21, final SubLObject var28) {
        if (module0115.NIL != module0021.f1104()) {
            return module0021.f1040(var21, var28);
        }
        return module0021.f1038(var21, var28);
    }
    
    public static SubLObject f7993(final SubLObject var28, final SubLObject var13) {
        return module0021.f1060(var28, (SubLObject)module0115.NIL, var13);
    }
    
    public static SubLObject f7994(final SubLObject var14, final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var37) {
        if (var37 == module0115.UNPROVIDED) {
            var37 = (SubLObject)module0115.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        assert module0115.NIL != Types.consp(var14) : var14;
        assert module0115.NIL != Types.integerp(var33) : var33;
        assert module0115.NIL != Types.integerp(var34) : var34;
        assert module0115.NIL != Types.stringp(var35) : var35;
        assert module0115.NIL != Types.listp(var36) : var36;
        final SubLObject var39 = (SubLObject)ConsesLow.listS((SubLObject)module0115.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0115.$ic22$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)module0115.$ic23$, module0111.$g1407$.getDynamicValue(var38)), (SubLObject)module0115.$ic24$);
        module0623.f38442(var14, var33, var34, var35, ConsesLow.append(var39, var36), var37);
        return (SubLObject)module0115.NIL;
    }
    
    public static SubLObject f7995() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7976", "S#10035", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7977", "S#10036", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7978", "S#10037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7979", "S#10038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7980", "CFASL-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7981", "S#10039", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7982", "CFASL-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7983", "S#10040", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7984", "S#10041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7985", "S#10042", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7987", "S#10043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7986", "S#10044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7988", "S#10045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7989", "S#10046", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7991", "S#9278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7990", "S#10047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7992", "S#10048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7993", "S#10049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0115", "f7994", "TASK-PROCESSOR-REQUEST", 5, 1, false);
        return (SubLObject)module0115.NIL;
    }
    
    public static SubLObject f7996() {
        module0115.$g1450$ = SubLFiles.defparameter("S#10050", (SubLObject)module0115.NIL);
        module0115.$g1451$ = SubLFiles.defparameter("S#10051", (SubLObject)module0115.NIL);
        module0115.$g1452$ = SubLFiles.defparameter("S#10052", f7986((SubLObject)module0115.$ic18$));
        return (SubLObject)module0115.NIL;
    }
    
    public static SubLObject f7997() {
        module0061.f4481((SubLObject)module0115.$ic0$, (SubLObject)module0115.$ic1$, (SubLObject)module0115.$ic2$);
        module0012.f368((SubLObject)module0115.$ic25$, (SubLObject)module0115.$ic26$, (SubLObject)module0115.$ic27$, (SubLObject)module0115.$ic28$, (SubLObject)module0115.$ic29$);
        return (SubLObject)module0115.NIL;
    }
    
    public void declareFunctions() {
        f7995();
    }
    
    public void initializeVariables() {
        f7996();
    }
    
    public void runTopLevelForms() {
        f7997();
    }
    
    static {
        me = (SubLFile)new module0115();
        module0115.$g1450$ = null;
        module0115.$g1451$ = null;
        module0115.$g1452$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10038", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("BINARY");
        $ic3$ = SubLObjectFactory.makeSymbol("S#10040", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#10041", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#10042", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("EOF");
        $ic7$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic8$ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a proper list");
        $ic9$ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a valid API function symbol");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10053", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic12$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic13$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic14$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10039", "CYC"));
        $ic16$ = SubLObjectFactory.makeString("~A");
        $ic17$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic18$ = SubLObjectFactory.makeString("EOF occurred on CFASL API stream");
        $ic19$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic20$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9687", "CYC"), (SubLObject)module0115.NIL);
        $ic22$ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $ic23$ = SubLObjectFactory.makeSymbol("*KE-PURPOSE*");
        $ic24$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9913", "CYC"), (SubLObject)module0115.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9920", "CYC"), (SubLObject)module0115.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9918", "CYC"), (SubLObject)module0115.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9919", "CYC"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-WARNS?*"), (SubLObject)module0115.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-BREAKS?*"), (SubLObject)module0115.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)module0115.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)module0115.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ERROR-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PACKAGE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-PACKAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC"))) });
        $ic25$ = SubLObjectFactory.makeSymbol("TASK-PROCESSOR-REQUEST");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10030", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10031", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10033", "CYC"));
        $ic27$ = SubLObjectFactory.makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10030", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10031", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic29$ = ConsesLow.list((SubLObject)module0115.NIL);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0115.class
	Total time: 132 ms
	
	Decompiled with Procyon 0.5.32.
*/