package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0707 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0707";
    public static final String myFingerPrint = "fc0ee80313438d893b60aed7f07fe41e7859f609f733b3dca1e666292089d326";
    private static SubLSymbol $g5529$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    
    public static SubLObject f42987(final SubLObject var1, SubLObject var2) {
        if (var2 == module0707.UNPROVIDED) {
            var2 = module0707.$g5529$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0707.NIL != module0700.f42611(var1, (SubLObject)module0707.UNPROVIDED) : var1;
        final SubLObject var4 = module0707.$g5529$.currentBinding(var3);
        try {
            module0707.$g5529$.bind(var2, var3);
            f42988(module0700.f42612(var1));
            print_high.princ((SubLObject)Characters.CHAR_space, module0707.$g5529$.getDynamicValue(var3));
            f42989(module0700.f42613(var1));
            print_high.princ((SubLObject)Characters.CHAR_space, module0707.$g5529$.getDynamicValue(var3));
            f42990(module0700.f42614(var1));
            print_high.princ((SubLObject)Characters.CHAR_space, module0707.$g5529$.getDynamicValue(var3));
            print_high.princ((SubLObject)Characters.CHAR_period, module0707.$g5529$.getDynamicValue(var3));
            streams_high.terpri(module0707.$g5529$.getDynamicValue(var3));
        }
        finally {
            module0707.$g5529$.rebind(var4, var3);
        }
        return var1;
    }
    
    public static SubLObject f42988(final SubLObject var5) {
        if (module0707.NIL != module0702.f42828(var5)) {
            f42991(module0702.f42830(var5));
        }
        else if (module0707.NIL != module0589.f35907(var5, (SubLObject)module0707.UNPROVIDED)) {
            f42991(var5);
        }
        else if (module0707.NIL != module0703.f42867(var5)) {
            f42992(var5);
        }
        else {
            Errors.error((SubLObject)module0707.$ic1$, var5);
        }
        return var5;
    }
    
    public static SubLObject f42989(final SubLObject var6) {
        if (module0707.NIL != module0702.f42828(var6)) {
            f42991(module0702.f42830(var6));
        }
        else if (module0707.NIL != module0589.f35907(var6, (SubLObject)module0707.UNPROVIDED)) {
            f42991(var6);
        }
        else {
            Errors.error((SubLObject)module0707.$ic2$, var6);
        }
        return var6;
    }
    
    public static SubLObject f42990(final SubLObject var7) {
        if (module0707.NIL != module0702.f42828(var7)) {
            f42991(module0702.f42830(var7));
        }
        else if (module0707.NIL != module0703.f42867(var7)) {
            f42992(var7);
        }
        else if (module0707.NIL != module0589.f35907(var7, (SubLObject)module0707.UNPROVIDED)) {
            f42991(var7);
        }
        else if (module0707.NIL != module0704.f42888(var7)) {
            f42993(var7);
        }
        else {
            Errors.error((SubLObject)module0707.$ic3$, var7);
        }
        return var7;
    }
    
    public static SubLObject f42993(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        print_high.princ((SubLObject)Characters.CHAR_quotation, module0707.$g5529$.getDynamicValue(var9));
        print_high.princ(f42994(module0704.f42881(var8)), module0707.$g5529$.getDynamicValue(var9));
        print_high.princ((SubLObject)Characters.CHAR_quotation, module0707.$g5529$.getDynamicValue(var9));
        if (module0707.NIL != module0704.f42882(var8)) {
            PrintLow.format(module0707.$g5529$.getDynamicValue(var9), (SubLObject)module0707.$ic4$, module0704.f42882(var8));
        }
        else if (module0707.NIL != module0704.f42883(var8)) {
            print_high.princ((SubLObject)module0707.$ic5$, module0707.$g5529$.getDynamicValue(var9));
            f42991(module0702.f42830(module0704.f42883(var8)));
        }
        return var8;
    }
    
    public static SubLObject f42992(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        PrintLow.format(module0707.$g5529$.getDynamicValue(var10), (SubLObject)module0707.$ic6$, module0703.f42874(var9));
        return var9;
    }
    
    public static SubLObject f42991(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert module0707.NIL != module0589.f35907(var10, (SubLObject)module0707.UNPROVIDED) : var10;
        PrintLow.format(module0707.$g5529$.getDynamicValue(var11), (SubLObject)module0707.$ic8$, f42994(var10));
        return var10;
    }
    
    public static SubLObject f42994(final SubLObject var11) {
        if (module0707.NIL == Sequences.find_if((SubLObject)module0707.$ic9$, var11, (SubLObject)module0707.UNPROVIDED, (SubLObject)module0707.UNPROVIDED, (SubLObject)module0707.UNPROVIDED)) {
            return var11;
        }
        return f42995(module0039.f3021(module0039.f3045(var11)));
    }
    
    public static SubLObject f42996(final SubLObject var12) {
        return f42997(Characters.char_code(var12));
    }
    
    public static SubLObject f42997(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var13.numL((SubLObject)module0707.$ic10$) || var13.eql((SubLObject)module0707.$ic11$) || var13.eql((SubLObject)module0707.$ic12$) || var13.numGE((SubLObject)module0707.$ic13$));
    }
    
    public static SubLObject f42995(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0707.NIL;
        SubLObject var16 = (SubLObject)module0707.NIL;
        try {
            var16 = streams_high.make_private_string_output_stream();
            final SubLObject var17 = (SubLObject)module0707.NIL;
            SubLObject var18;
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            for (var18 = Sequences.length(var14), var19 = (SubLObject)module0707.NIL, var19 = (SubLObject)module0707.ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)module0707.ONE_INTEGER)) {
                var20 = ((module0707.NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)module0707.ONE_INTEGER) : var19);
                var21 = Vectors.aref(var14, var20);
                f42998(var21, var16);
            }
            var15 = streams_high.get_output_stream_string(var16);
        }
        finally {
            final SubLObject var22 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0707.T);
                streams_high.close(var16, (SubLObject)module0707.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var22);
            }
        }
        return var15;
    }
    
    public static SubLObject f42998(final SubLObject var20, final SubLObject var2) {
        if (var20.eql((SubLObject)module0707.NINE_INTEGER)) {
            print_high.princ((SubLObject)module0707.$ic14$, var2);
        }
        else if (var20.eql((SubLObject)module0707.TEN_INTEGER)) {
            print_high.princ((SubLObject)module0707.$ic15$, var2);
        }
        else if (var20.eql((SubLObject)module0707.THIRTEEN_INTEGER)) {
            print_high.princ((SubLObject)module0707.$ic16$, var2);
        }
        else if (var20.eql((SubLObject)module0707.$ic11$)) {
            print_high.princ((SubLObject)module0707.$ic17$, var2);
        }
        else if (var20.eql((SubLObject)module0707.$ic12$)) {
            print_high.princ((SubLObject)module0707.$ic18$, var2);
        }
        else if (var20.numL((SubLObject)module0707.$ic10$)) {
            f42999(var20, var2);
        }
        else if (var20.numL((SubLObject)module0707.$ic13$)) {
            print_high.princ(Characters.code_char(var20), var2);
        }
        else {
            f42999(var20, var2);
        }
        return (SubLObject)module0707.NIL;
    }
    
    public static SubLObject f42999(final SubLObject var20, final SubLObject var2) {
        final SubLObject var21 = module0048.f3425(var20);
        if (module0707.NIL != module0035.f2002(var21, (SubLObject)module0707.FOUR_INTEGER, (SubLObject)module0707.UNPROVIDED)) {
            PrintLow.format(var2, (SubLObject)module0707.$ic19$, var21);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0707.$ic20$, var21);
        }
        return (SubLObject)module0707.NIL;
    }
    
    public static SubLObject f43000() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42987", "S#46643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42988", "S#47019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42989", "S#47020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42990", "S#47021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42993", "S#47022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42992", "S#47023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42991", "S#47024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42994", "S#47025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42996", "S#47026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42997", "S#47027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42995", "S#47028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42998", "S#47029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0707", "f42999", "S#47030", 2, 0, false);
        return (SubLObject)module0707.NIL;
    }
    
    public static SubLObject f43001() {
        module0707.$g5529$ = SubLFiles.defparameter("S#47031", StreamsLow.$standard_output$.getDynamicValue());
        return (SubLObject)module0707.NIL;
    }
    
    public static SubLObject f43002() {
        return (SubLObject)module0707.NIL;
    }
    
    public void declareFunctions() {
        f43000();
    }
    
    public void initializeVariables() {
        f43001();
    }
    
    public void runTopLevelForms() {
        f43002();
    }
    
    static {
        me = (SubLFile)new module0707();
        module0707.$g5529$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46531", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Can't write subject ~S");
        $ic2$ = SubLObjectFactory.makeString("Can't write predicate ~S");
        $ic3$ = SubLObjectFactory.makeString("Can't write object ~S");
        $ic4$ = SubLObjectFactory.makeString("@~A");
        $ic5$ = SubLObjectFactory.makeString("^^");
        $ic6$ = SubLObjectFactory.makeString("_:~A");
        $ic7$ = SubLObjectFactory.makeSymbol("S#39641", "CYC");
        $ic8$ = SubLObjectFactory.makeString("<~A>");
        $ic9$ = SubLObjectFactory.makeSymbol("S#47026", "CYC");
        $ic10$ = SubLObjectFactory.makeInteger(32);
        $ic11$ = SubLObjectFactory.makeInteger(34);
        $ic12$ = SubLObjectFactory.makeInteger(92);
        $ic13$ = SubLObjectFactory.makeInteger(127);
        $ic14$ = SubLObjectFactory.makeString("\\t");
        $ic15$ = SubLObjectFactory.makeString("\\n");
        $ic16$ = SubLObjectFactory.makeString("\\r");
        $ic17$ = SubLObjectFactory.makeString("\\\"");
        $ic18$ = SubLObjectFactory.makeString("\\\\");
        $ic19$ = SubLObjectFactory.makeString("\\U~8,1,0,'0@A");
        $ic20$ = SubLObjectFactory.makeString("\\u~4,1,0,'0@A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0707.class
	Total time: 93 ms
	
	Decompiled with Procyon 0.5.32.
*/