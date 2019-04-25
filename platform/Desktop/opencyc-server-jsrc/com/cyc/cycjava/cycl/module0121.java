package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0121 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0121";
    public static final String myFingerPrint = "6dd4478fbfce484e3f69c0f3aa932cc6dc0db512d92f99016f102619595bad90";
    private static SubLSymbol $g1479$;
    private static SubLSymbol $g1480$;
    public static SubLSymbol $g1481$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f8276() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g1479$.getDynamicValue(var1);
    }
    
    public static SubLObject f8277() {
        return $g1480$.getGlobalValue();
    }
    
    public static SubLObject f8278(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic2$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f8279(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic3$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic4$, var10), var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8 = Sequences.nreverse(var8);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var6, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f8280(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic7$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic7$);
        var7 = var5.first();
        final SubLObject var8;
        var5 = (var8 = var5.rest());
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic4$, var11), var9);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var9 = Sequences.nreverse(var9);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, var6, var7, ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f8281(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic9$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic9$);
        var7 = var5.first();
        final SubLObject var8;
        var5 = (var8 = var5.rest());
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic4$, var11), var9);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var9 = Sequences.nreverse(var9);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var6, var7, ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f8282(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic11$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic11$);
        var7 = var5.first();
        final SubLObject var8;
        var5 = (var8 = var5.rest());
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic4$, var11), var9);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var9 = Sequences.nreverse(var9);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var6, var7, ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f8283(final SubLObject var26) {
        final SubLObject var27 = Packages.find_symbol(Strings.string_upcase(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var28 = (SubLObject)((NIL != Symbols.boundp(var27)) ? Symbols.symbol_value(var27) : NIL);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? module0205.f13144(var28) : NIL);
        final SubLObject var30 = print_high.princ_to_string(var29);
        return var30;
    }
    
    public static SubLObject f8284() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0121", "f8276", "S#10374", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0121", "f8277", "S#10375", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0121", "f8278", "S#10376");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0121", "f8279", "S#10377");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0121", "f8280", "S#10378");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0121", "f8281", "S#10379");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0121", "f8282", "S#10380");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0121", "f8283", "S#10381", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8285() {
        $g1479$ = SubLFiles.defparameter("S#10382", (SubLObject)NIL);
        $g1480$ = SubLFiles.deflexical("S#10383", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1480$.getGlobalValue() : NIL));
        $g1481$ = SubLFiles.defparameter("S#10384", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8286() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8284();
    }
    
    public void initializeVariables() {
        f8285();
    }
    
    public void runTopLevelForms() {
        f8286();
    }
    
    static {
        me = (SubLFile)new module0121();
        $g1479$ = null;
        $g1480$ = null;
        $g1481$ = null;
        $ic0$ = makeSymbol("S#10383", "CYC");
        $ic1$ = makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10384", "CYC"), (SubLObject)T));
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic4$ = makeSymbol("S#10385", "CYC");
        $ic5$ = makeSymbol("S#10386", "CYC");
        $ic6$ = makeSymbol("JAVA-NEW");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#10387", "CYC"));
        $ic8$ = makeSymbol("JAVA-METHOD");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic10$ = makeSymbol("JAVA-STATIC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#10388", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic12$ = makeSymbol("JAVA-CALL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 44 ms
	
	Decompiled with Procyon 0.5.32.
*/