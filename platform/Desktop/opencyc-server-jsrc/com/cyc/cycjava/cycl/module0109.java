package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0109 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0109";
    public static final String myFingerPrint = "6d16ff56b981d4679e71541ba19745f517a5aad1849d687da9ba953cf7c1f95e";
    private static SubLSymbol $g1370$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    
    public static SubLObject f7655(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = (SubLObject)ConsesLow.list((SubLObject)module0109.$ic1$, var1, (SubLObject)module0109.$ic2$, var2, (SubLObject)module0109.$ic3$, var3);
        module0109.$g1370$.setGlobalValue(module0035.f2063(module0109.$g1370$.getGlobalValue(), var1, var4, (SubLObject)module0109.UNPROVIDED));
        return var1;
    }
    
    public static SubLObject f7656(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5 == module0109.T || var5 == module0109.NIL);
    }
    
    public static SubLObject f7657(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0109.NIL != module0004.f106(var5) && var5.numL((SubLObject)module0109.$ic4$));
    }
    
    public static SubLObject f7658(final SubLObject var6) {
        final SubLObject var7 = module0035.f2293(module0109.$g1370$.getGlobalValue(), var6, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
        return conses_high.getf(var7, (SubLObject)module0109.$ic2$, (SubLObject)module0109.$ic28$);
    }
    
    public static SubLObject f7659(final SubLObject var6) {
        final SubLObject var7 = module0035.f2293(module0109.$g1370$.getGlobalValue(), var6, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
        return conses_high.getf(var7, (SubLObject)module0109.$ic3$, (SubLObject)module0109.$ic29$);
    }
    
    public static SubLObject f7660(final SubLObject var7) {
        final SubLObject var8 = Symbols.symbol_value(var7.first());
        final SubLObject var9 = Mapping.mapcar((SubLObject)module0109.$ic30$, var8);
        return var9;
    }
    
    public static SubLObject f7661(final SubLObject var6, SubLObject var10) {
        if (var10 == module0109.UNPROVIDED) {
            var10 = (SubLObject)module0109.$ic31$;
        }
        SubLObject var11 = (SubLObject)module0109.$ic28$;
        if (var6.isCons()) {
            SubLObject var12 = (SubLObject)module0109.NIL;
            try {
                var12 = streams_high.make_private_string_output_stream();
                SubLObject var13 = (SubLObject)module0109.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0109.$ic32$);
                var13 = var6.first();
                final SubLObject var15;
                final SubLObject var14 = var15 = var6.rest();
                if (module0109.$ic33$ == var13 || module0109.$ic34$ == var13) {
                    final SubLObject var16 = Strings.string_downcase(Symbols.symbol_name(var13), (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                    SubLObject var17 = (SubLObject)module0109.NIL;
                    SubLObject var18 = (SubLObject)module0109.NIL;
                    SubLObject var19 = (SubLObject)module0109.NIL;
                    var17 = var15;
                    var18 = var17.first();
                    for (var19 = (SubLObject)module0109.ZERO_INTEGER; module0109.NIL != var17; var17 = var17.rest(), var18 = var17.first(), var19 = Numbers.add((SubLObject)module0109.ONE_INTEGER, var19)) {
                        final SubLObject var20 = f7661(var18, (SubLObject)module0109.UNPROVIDED);
                        if (!var19.isZero()) {
                            streams_high.write_string((SubLObject)module0109.$ic35$, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                            streams_high.write_string(var16, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                            streams_high.write_string((SubLObject)module0109.$ic35$, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                        }
                        streams_high.write_string(var20, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                    }
                }
                else if (module0109.$ic36$ == var13) {
                    final SubLObject var21 = f7660(var15);
                    SubLObject var17 = (SubLObject)module0109.NIL;
                    SubLObject var22 = (SubLObject)module0109.NIL;
                    SubLObject var19 = (SubLObject)module0109.NIL;
                    var17 = var21;
                    var22 = var17.first();
                    for (var19 = (SubLObject)module0109.ZERO_INTEGER; module0109.NIL != var17; var17 = var17.rest(), var22 = var17.first(), var19 = Numbers.add((SubLObject)module0109.ONE_INTEGER, var19)) {
                        if (var19.isZero()) {
                            streams_high.write_string((SubLObject)module0109.$ic37$, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                        }
                        else {
                            streams_high.write_string((SubLObject)module0109.$ic38$, var12, (SubLObject)module0109.UNPROVIDED, (SubLObject)module0109.UNPROVIDED);
                        }
                        if (module0109.$ic31$ == var10) {
                            print_high.prin1(var22, var12);
                        }
                        else {
                            print_high.princ(var22, var12);
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0109.$ic39$);
                }
                var11 = streams_high.get_output_stream_string(var12);
            }
            finally {
                final SubLObject var23 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0109.T);
                    streams_high.close(var12, (SubLObject)module0109.UNPROVIDED);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var23);
                }
            }
        }
        else if (var6.isSymbol()) {
            var11 = f7658(var6);
        }
        return var11;
    }
    
    public static SubLObject f7662(final SubLObject var6) {
        if (var6.isCons()) {
            SubLObject var7 = (SubLObject)module0109.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0109.$ic32$);
            var7 = var6.first();
            final SubLObject var9;
            final SubLObject var8 = var9 = var6.rest();
            if (module0109.$ic33$ == var7 || module0109.$ic34$ == var7) {
                SubLObject var10 = var9;
                SubLObject var11 = (SubLObject)module0109.NIL;
                var11 = var10.first();
                while (module0109.NIL != var10) {
                    if (module0109.NIL == f7662(var11)) {
                        return (SubLObject)module0109.NIL;
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            else {
                if (module0109.$ic36$ != var7) {
                    return (SubLObject)module0109.NIL;
                }
                final SubLObject var12 = f7660(var9);
            }
            return (SubLObject)module0109.T;
        }
        if (var6.isSymbol()) {
            return module0035.f2302(module0109.$g1370$.getGlobalValue(), var6, (SubLObject)module0109.UNPROVIDED);
        }
        return (SubLObject)module0109.NIL;
    }
    
    public static SubLObject f7663(final SubLObject var21, final SubLObject var6) {
        if (var6.isCons()) {
            SubLObject var22 = (SubLObject)module0109.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0109.$ic32$);
            var22 = var6.first();
            final SubLObject var24;
            final SubLObject var23 = var24 = var6.rest();
            final SubLObject var25 = var22;
            if (var25.eql((SubLObject)module0109.$ic33$)) {
                SubLObject var26 = var24;
                SubLObject var27 = (SubLObject)module0109.NIL;
                var27 = var26.first();
                while (module0109.NIL != var26) {
                    if (module0109.NIL != f7663(var21, var27)) {
                        return (SubLObject)module0109.T;
                    }
                    var26 = var26.rest();
                    var27 = var26.first();
                }
                return (SubLObject)module0109.NIL;
            }
            if (var25.eql((SubLObject)module0109.$ic34$)) {
                SubLObject var26 = var24;
                SubLObject var27 = (SubLObject)module0109.NIL;
                var27 = var26.first();
                while (module0109.NIL != var26) {
                    if (module0109.NIL == f7663(var21, var27)) {
                        return (SubLObject)module0109.NIL;
                    }
                    var26 = var26.rest();
                    var27 = var26.first();
                }
                return (SubLObject)module0109.T;
            }
            if (var25.eql((SubLObject)module0109.$ic36$)) {
                final SubLObject var28 = f7660(var24);
                return module0004.f104(var21, var28, (SubLObject)module0109.EQUAL, (SubLObject)module0109.UNPROVIDED);
            }
            Errors.error((SubLObject)module0109.$ic40$, var6);
        }
        else {
            if (var6.isSymbol()) {
                final SubLObject var29 = f7659(var6);
                return Functions.funcall(var29, var21);
            }
            Errors.error((SubLObject)module0109.$ic41$);
        }
        return (SubLObject)module0109.NIL;
    }
    
    public static SubLObject f7664() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7655", "S#9642", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7656", "S#9643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7657", "S#9644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7658", "S#9645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7659", "S#9646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7660", "S#9647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7661", "S#9648", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7662", "S#9649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0109", "f7663", "S#9650", 2, 0, false);
        return (SubLObject)module0109.NIL;
    }
    
    public static SubLObject f7665() {
        module0109.$g1370$ = SubLFiles.deflexical("S#9651", (SubLObject)((module0109.NIL != Symbols.boundp((SubLObject)module0109.$ic0$)) ? module0109.$g1370$.getGlobalValue() : module0109.NIL));
        return (SubLObject)module0109.NIL;
    }
    
    public static SubLObject f7666() {
        module0003.f57((SubLObject)module0109.$ic0$);
        f7655((SubLObject)module0109.$ic5$, (SubLObject)module0109.$ic6$, (SubLObject)module0109.$ic7$);
        f7655((SubLObject)module0109.$ic8$, (SubLObject)module0109.$ic9$, (SubLObject)module0109.$ic10$);
        f7655((SubLObject)module0109.$ic11$, (SubLObject)module0109.$ic12$, (SubLObject)module0109.$ic13$);
        f7655((SubLObject)module0109.$ic14$, (SubLObject)module0109.$ic15$, (SubLObject)module0109.$ic16$);
        f7655((SubLObject)module0109.$ic17$, (SubLObject)module0109.$ic18$, (SubLObject)module0109.$ic19$);
        f7655((SubLObject)module0109.$ic20$, (SubLObject)module0109.$ic21$, (SubLObject)module0109.$ic22$);
        f7655((SubLObject)module0109.$ic23$, (SubLObject)module0109.$ic24$, (SubLObject)module0109.$ic25$);
        f7655((SubLObject)module0109.$ic26$, (SubLObject)module0109.$ic27$, (SubLObject)module0109.$ic25$);
        return (SubLObject)module0109.NIL;
    }
    
    public void declareFunctions() {
        f7664();
    }
    
    public void initializeVariables() {
        f7665();
    }
    
    public void runTopLevelForms() {
        f7666();
    }
    
    static {
        me = (SubLFile)new module0109();
        module0109.$g1370$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#9651", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("SYMBOL");
        $ic2$ = SubLObjectFactory.makeKeyword("VALUES");
        $ic3$ = SubLObjectFactory.makeKeyword("CHECKER");
        $ic4$ = SubLObjectFactory.makeInteger(65536);
        $ic5$ = SubLObjectFactory.makeSymbol("S#4764", "CYC");
        $ic6$ = SubLObjectFactory.makeString("undefined");
        $ic7$ = SubLObjectFactory.makeSymbol("NULL");
        $ic8$ = SubLObjectFactory.makeSymbol("BOOLEAN");
        $ic9$ = SubLObjectFactory.makeString("::TRUE:: or ::FALSE::");
        $ic10$ = SubLObjectFactory.makeSymbol("S#9643", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("STRING");
        $ic12$ = SubLObjectFactory.makeString("a string");
        $ic13$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic14$ = SubLObjectFactory.makeSymbol("S#9652", "CYC");
        $ic15$ = SubLObjectFactory.makeString("a valid directory path");
        $ic16$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic17$ = SubLObjectFactory.makeSymbol("INTEGER");
        $ic18$ = SubLObjectFactory.makeString("an integer");
        $ic19$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic20$ = SubLObjectFactory.makeSymbol("SYMBOL");
        $ic21$ = SubLObjectFactory.makeString("a symbol");
        $ic22$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic23$ = SubLObjectFactory.makeSymbol("S#58", "CYC");
        $ic24$ = SubLObjectFactory.makeString("a TCP/IP port number");
        $ic25$ = SubLObjectFactory.makeSymbol("S#9644", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#9653", "CYC");
        $ic27$ = SubLObjectFactory.makeString("a TCP/IP port offset");
        $ic28$ = SubLObjectFactory.makeString("");
        $ic29$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic30$ = SubLObjectFactory.makeSymbol("CAR");
        $ic31$ = SubLObjectFactory.makeKeyword("SUBL");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#9654", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("OR");
        $ic34$ = SubLObjectFactory.makeSymbol("AND");
        $ic35$ = SubLObjectFactory.makeString(" ");
        $ic36$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic37$ = SubLObjectFactory.makeString("one of ");
        $ic38$ = SubLObjectFactory.makeString(", ");
        $ic39$ = SubLObjectFactory.makeString("Cannot interpret type ~A declaration.");
        $ic40$ = SubLObjectFactory.makeString("Invalid operator ~A should have been filtered before here.");
        $ic41$ = SubLObjectFactory.makeString("Implementation error, invalid type ~A should have been filtered before here.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0109.class
	Total time: 88 ms
	
	Decompiled with Procyon 0.5.32.
*/