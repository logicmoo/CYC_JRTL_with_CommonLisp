package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0571 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0571";
    public static final String myFingerPrint = "5c7e63e32e3333a08d6c8ff4702f5b2a9958446d936998e3ce0e88e4c3e2523d";
    public static SubLSymbol $g4145$;
    public static SubLSymbol $g4146$;
    private static SubLSymbol $g4147$;
    private static SubLSymbol $g4148$;
    private static SubLSymbol $g4149$;
    private static SubLSymbol $g4150$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    
    public static SubLObject f34986(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, $g4145$.getGlobalValue());
        if (NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return var1;
    }
    
    public static SubLObject f34987(final SubLObject var1) {
        return module0035.f2071(f34986(var1.first()), f34986(var1.rest()), var1);
    }
    
    public static SubLObject f34988(final SubLObject var1) {
        return f34989(var1);
    }
    
    public static SubLObject f34990(final SubLObject var1) {
        return f34991(var1);
    }
    
    public static SubLObject f34989(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == constant_handles_oc.f8463(var3, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic4$, var3);
        }
        final SubLObject var5 = constants_high_oc.f10757(var3);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == constants_high_oc.f10734(var5)) {
            Errors.error((SubLObject)$ic5$, var3);
        }
        final SubLObject var6 = constants_high_oc.f10743(var3);
        if ($ic6$ != var6 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var6.isString()) {
            Errors.error((SubLObject)$ic7$, var3, var6);
        }
        return f34992(var3);
    }
    
    public static SubLObject f34991(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0172.f10915(var7);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && !var9.isCons()) {
            Errors.error((SubLObject)$ic8$, var7, var9);
        }
        return f34993(var7);
    }
    
    public static SubLObject f34992(final SubLObject var3) {
        final SubLObject var4 = constants_high_oc.f10757(var3);
        final SubLObject var5 = constants_high_oc.f10743(var3);
        final SubLObject var6 = (SubLObject)ConsesLow.list((SubLObject)$ic9$, var5, var4);
        return var6;
    }
    
    public static SubLObject f34993(final SubLObject var7) {
        final SubLObject var8 = module0172.f10915(var7);
        final SubLObject var9 = (SubLObject)ConsesLow.list((SubLObject)$ic10$, f34986(var8));
        return var9;
    }
    
    public static SubLObject f34994(final SubLObject var1) {
        return f34995(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f34996(final SubLObject var1) {
        return f34995(var1, (SubLObject)T);
    }
    
    public static SubLObject f34995(final SubLObject var1, final SubLObject var10) {
        if (var1.isAtom()) {
            if (var1.isSymbol()) {
                return f34997(var1);
            }
            return var1;
        }
        else {
            final SubLObject var11 = var1.first();
            if (NIL != f34998(var11, (SubLObject)$ic9$) && NIL != module0035.f2014(var1) && THREE_INTEGER.numE(Sequences.length(var1))) {
                return f34999(var1, var10);
            }
            if (NIL != f34998(var11, (SubLObject)$ic10$) && NIL != module0035.f2014(var1) && (TWO_INTEGER.numE(Sequences.length(var1)) || THREE_INTEGER.numE(Sequences.length(var1)))) {
                return f35000(var1, var10);
            }
            return f35001(var1, var10);
        }
    }
    
    public static SubLObject f34998(final SubLObject var1, final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.eql(var1) || (var1.isSymbol() && NIL != Strings.stringE(Symbols.symbol_name(var1), Symbols.symbol_name(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34997(final SubLObject var1) {
        final SubLObject var2 = module0035.f2294($g4147$.getGlobalValue(), var1, Symbols.symbol_function((SubLObject)EQ), var1);
        if (var2.eql(var1)) {
            return var1;
        }
        return var2.first();
    }
    
    public static SubLObject f35001(final SubLObject var1, final SubLObject var10) {
        return module0035.f2071(f34995(var1.first(), var10), f34995(var1.rest(), var10), var1);
    }
    
    public static SubLObject f34999(final SubLObject var1, final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic12$);
        var11 = var1.first();
        SubLObject var14 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var1, (SubLObject)$ic12$);
        var12 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var1, (SubLObject)$ic12$);
        var13 = var14.first();
        var14 = var14.rest();
        if (NIL != var14) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic12$);
            return (SubLObject)NIL;
        }
        final SubLObject var15 = f35002(var12, var13);
        if (NIL != constant_handles_oc.f8449(var15)) {
            return var15;
        }
        if (var12.isString()) {
            return f35003(var1, var10);
        }
        if ($ic6$ == var12) {
            return f35004(var1, var10);
        }
        return f35005(var1);
    }
    
    public static SubLObject f35002(final SubLObject var17, final SubLObject var5) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)NIL;
        if (NIL != constants_high_oc.f10734(var5)) {
            if (NIL != $g4148$.getDynamicValue(var18) && var17.isString()) {
                final SubLObject var20 = f35006(var17);
                if (NIL != constant_handles_oc.f8463(var20, (SubLObject)UNPROVIDED) && NIL != constants_high_oc.f10759(var20, var5)) {
                    var19 = var20;
                }
            }
            if (NIL == var19) {
                var19 = constants_high_oc.f10751(var5);
            }
        }
        return var19;
    }
    
    public static SubLObject f35006(final SubLObject var19) {
        SubLObject var20 = module0035.f2294($g4149$.getGlobalValue(), var19, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL != var20) {
            $g4149$.setGlobalValue(module0035.f2308($g4149$.getGlobalValue(), var19, Symbols.symbol_function((SubLObject)EQUAL)));
        }
        else {
            var20 = constants_high_oc.f10737(var19);
            $g4149$.setGlobalValue(module0035.f2307($g4149$.getGlobalValue(), var19, var20, $g4150$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        }
        return var20;
    }
    
    public static SubLObject f35000(final SubLObject var1, final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic14$);
        var11 = var1.first();
        SubLObject var13 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var1, (SubLObject)$ic14$);
        var12 = var13.first();
        var13 = var13.rest();
        final SubLObject var14 = (SubLObject)(var13.isCons() ? var13.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var13, var1, (SubLObject)$ic14$);
        var13 = var13.rest();
        if (NIL != var13) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic14$);
            return (SubLObject)NIL;
        }
        final SubLObject var15 = f34995(var12, var10);
        final SubLObject var16 = module0172.f10921(var15);
        if (NIL != module0167.f10813(var16)) {
            return var16;
        }
        return f35007(var1, var10);
    }
    
    public static SubLObject f35003(final SubLObject var1, final SubLObject var10) {
        if (NIL != var10) {
            return var1;
        }
        return f35005(var1);
    }
    
    public static SubLObject f35004(final SubLObject var1, final SubLObject var10) {
        return f35003(var1, var10);
    }
    
    public static SubLObject f35007(final SubLObject var1, final SubLObject var10) {
        if (NIL != var10) {
            return var1;
        }
        return f35005(var1);
    }
    
    public static SubLObject f35005(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g693$.getDynamicValue(var2)) {
            if ($ic15$ != module0593.f36290()) {
                PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var2), (SubLObject)$ic16$, f34996(module0018.$g677$.getGlobalValue()), var1);
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var2));
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic18$, var1);
            }
            Dynamic.sublisp_throw((SubLObject)$ic19$, (SubLObject)NIL);
        }
        else {
            Errors.error((SubLObject)$ic18$, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35008() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34986", "S#15069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34987", "S#38352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34988", "S#38353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34990", "S#38354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34989", "S#38355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34991", "S#38356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34992", "S#38357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34993", "S#38358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34994", "S#32659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34996", "S#33330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34995", "S#38359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34998", "S#38360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34997", "S#38361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35001", "S#38362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f34999", "S#38363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35002", "S#38364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35006", "S#38365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35000", "S#38366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35003", "S#38367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35004", "S#38368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35007", "S#38369", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0571", "f35005", "S#38370", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35009() {
        $g4145$ = SubLFiles.deflexical("S#38371", Vectors.make_vector((SubLObject)$ic0$, (SubLObject)NIL));
        $g4146$ = SubLFiles.defparameter("S#38372", (SubLObject)NIL);
        $g4147$ = SubLFiles.deflexical("S#38373", (SubLObject)$ic11$);
        $g4148$ = SubLFiles.defparameter("S#38374", (SubLObject)NIL);
        $g4149$ = SubLFiles.deflexical("S#38375", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g4149$.getGlobalValue() : NIL));
        $g4150$ = SubLFiles.deflexical("S#38376", (SubLObject)TWENTY_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35010() {
        Structures.register_method($g4145$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic1$));
        Structures.register_method($g4145$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic2$));
        Structures.register_method($g4145$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic3$));
        module0003.f57((SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35008();
    }
    
    public void initializeVariables() {
        f35009();
    }
    
    public void runTopLevelForms() {
        f35010();
    }
    
    static {
        me = (SubLFile)new module0571();
        $g4145$ = null;
        $g4146$ = null;
        $g4147$ = null;
        $g4148$ = null;
        $g4149$ = null;
        $g4150$ = null;
        $ic0$ = makeInteger(256);
        $ic1$ = makeSymbol("S#38352", "CYC");
        $ic2$ = makeSymbol("S#38353", "CYC");
        $ic3$ = makeSymbol("S#38354", "CYC");
        $ic4$ = makeString("Attempt to encapsulate invalid constant ~S.");
        $ic5$ = makeString("Attempt to encapsulate a constant ~S with an invalid external ID.");
        $ic6$ = makeKeyword("UNNAMED");
        $ic7$ = makeString("Attempt to encapsulate a constant ~S with a non-string name ~S.");
        $ic8$ = makeString("Attempt to encapsulate the NART ~S with an invalid HL formula ~S.");
        $ic9$ = makeKeyword("HP");
        $ic10$ = makeKeyword("NAT");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38377", "CYC"), (SubLObject)makeKeyword("MONOTONIC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9672", "CYC"), (SubLObject)makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6216", "CYC"), (SubLObject)makeKeyword("FORWARD")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38378", "CYC"), (SubLObject)makeKeyword("BACKWARD")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1546", "CYC"), (SubLObject)makeKeyword("CODE")));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#38379", "CYC"), (SubLObject)makeSymbol("S#38380", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"));
        $ic13$ = makeSymbol("S#38375", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#21679", "CYC"), (SubLObject)makeSymbol("S#38381", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#1519", "CYC"));
        $ic15$ = makeKeyword("IGNORE");
        $ic16$ = makeString("~%Last operation: ~S ~%This object did not yield a term: ~S");
        $ic17$ = makeString("Skip this operation");
        $ic18$ = makeString("~S did not yield a term");
        $ic19$ = makeKeyword("UNENCAPSULATION-ERROR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 95 ms
	
	Decompiled with Procyon 0.5.32.
*/