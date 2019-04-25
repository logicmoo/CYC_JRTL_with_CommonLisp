package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0151 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0151";
    public static final String myFingerPrint = "1429701c0cd9549c9b225c244e5dc7dbc5fe3d16f72c6d6b45aadc22f56a0375";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    
    
    public static SubLObject f9689(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)module0151.$ic1$, ConsesLow.append(var5, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9690() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0152.$g2101$.getDynamicValue(var6);
    }
    
    public static SubLObject f9691(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0151.$ic3$, var5), (SubLObject)ConsesLow.list((SubLObject)module0151.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic5$, (SubLObject)module0151.$ic6$, (SubLObject)module0151.$ic7$, var5))), ConsesLow.append(var6, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9692(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0151.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic5$, (SubLObject)module0151.$ic10$, (SubLObject)module0151.$ic11$, var5))), ConsesLow.append(var6, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9693(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic12$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0151.$ic13$, var5)), (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic14$, (SubLObject)module0151.$ic15$, (SubLObject)module0151.$ic16$, ConsesLow.append(var6, (SubLObject)module0151.NIL)));
    }
    
    public static SubLObject f9694(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic17$, (SubLObject)module0151.$ic18$, ConsesLow.append(var5, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9695() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (module0151.NIL != module0152.$g2102$.getDynamicValue(var6)) ? module0152.$g2102$.getDynamicValue(var6) : module0034.f1854((SubLObject)module0151.UNPROVIDED, (SubLObject)module0151.UNPROVIDED, (SubLObject)module0151.UNPROVIDED, (SubLObject)module0151.UNPROVIDED);
    }
    
    public static SubLObject f9696(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0151.$ic21$, var5), (SubLObject)module0151.$ic22$), ConsesLow.append(var6, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9697(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic0$, (SubLObject)module0151.$ic23$, (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic24$, var5, ConsesLow.append(var6, (SubLObject)module0151.NIL)));
    }
    
    public static SubLObject f9698(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        SubLObject var6 = (SubLObject)module0151.NIL;
        SubLObject var7 = (SubLObject)module0151.NIL;
        SubLObject var8 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic25$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic25$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic25$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic25$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : module0151.$ic26$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0151.$ic25$);
        var4 = var4.rest();
        if (module0151.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0151.$ic25$);
            return (SubLObject)module0151.NIL;
        }
        if (module0151.NIL != var5 && !module0151.areAssertionsDisabledFor(me) && module0151.NIL == Types.symbolp(var5)) {
            throw new AssertionError(var5);
        }
        assert module0151.NIL != Types.keywordp(var6) : var6;
        assert module0151.NIL != module0035.f2239(var7) : var7;
        assert module0151.NIL != Types.stringp(var8) : var8;
        assert module0151.NIL != Types.symbolp(var9) : var9;
        if (module0151.NIL != var5) {
            return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic33$, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic34$, var9, var5))), (SubLObject)ConsesLow.list((SubLObject)module0151.$ic35$, var5, var7, var8), (SubLObject)ConsesLow.list((SubLObject)module0151.$ic36$, var6, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic33$, var5), var7));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic36$, var6, (SubLObject)module0151.NIL, var7);
    }
    
    public static SubLObject f9699(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic37$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0151.$ic38$;
        return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0151.$ic39$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic40$, var7, ConsesLow.append(var6, (SubLObject)module0151.NIL)));
    }
    
    public static SubLObject f9700(final SubLObject var31) {
        module0152.f9716(var31);
        final SubLObject var32 = module0091.f6334((SubLObject)module0151.NIL);
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var38;
        SubLObject var37;
        SubLObject var39;
        SubLObject var40;
        for (var33 = (SubLObject)module0151.NIL, var33 = var31; module0151.NIL != var33; var33 = conses_high.cddr(var33)) {
            var34 = var33.first();
            var35 = conses_high.cadr(var33);
            var36 = module0067.f4885(module0152.f9708(), var34, (SubLObject)module0151.UNPROVIDED);
            var37 = (var38 = var36);
            var39 = (SubLObject)module0151.NIL;
            var40 = (SubLObject)module0151.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0151.$ic42$);
            var39 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0151.$ic42$);
            var40 = var38.first();
            var38 = var38.rest();
            if (module0151.NIL == var38) {
                if (module0151.NIL != var39) {
                    module0091.f6342(var32, var39, var35);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0151.$ic42$);
            }
        }
        return var32;
    }
    
    public static SubLObject f9701(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0151.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0151.$ic43$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0151.$ic44$;
        return (SubLObject)ConsesLow.list((SubLObject)module0151.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)module0151.$ic45$, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic46$, var7, ConsesLow.append(var6, (SubLObject)module0151.NIL)));
    }
    
    public static SubLObject f9702(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)module0151.$ic47$, ConsesLow.append(var5, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9703(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)module0151.$ic48$, ConsesLow.append(var5, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9704(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0151.$ic0$, (SubLObject)module0151.$ic49$, ConsesLow.append(var5, (SubLObject)module0151.NIL));
    }
    
    public static SubLObject f9705() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9689", "S#12478");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0151", "f9690", "S#12479", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9691", "S#12480");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9692", "S#12481");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9693", "S#12482");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9694", "S#12483");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0151", "f9695", "S#12484", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9696", "S#12485");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9697", "S#12486");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9698", "S#12487");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9699", "S#12488");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0151", "f9700", "S#12489", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9701", "S#12490");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9702", "S#12491");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9703", "S#12492");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0151", "f9704", "S#12493");
        return (SubLObject)module0151.NIL;
    }
    
    public static SubLObject f9706() {
        return (SubLObject)module0151.NIL;
    }
    
    public static SubLObject f9707() {
        module0002.f50((SubLObject)module0151.$ic19$, (SubLObject)module0151.$ic20$);
        module0002.f50((SubLObject)module0151.$ic39$, (SubLObject)module0151.$ic41$);
        return (SubLObject)module0151.NIL;
    }
    
    public void declareFunctions() {
        f9705();
    }
    
    public void initializeVariables() {
        f9706();
    }
    
    public void runTopLevelForms() {
        f9707();
    }
    
    static {
        me = (SubLFile)new module0151();
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12494", "CYC"), (SubLObject)module0151.T));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#12495", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#12496", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("FIF");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12479", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12497", "CYC")));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12497", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12498", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#12499", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12479", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12500", "CYC")));
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12500", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#12501", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12501", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12479", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12502", "CYC")));
        $ic17$ = SubLObjectFactory.makeSymbol("S#12482", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12484", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#12484", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12483", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#12503", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*VALIDATE-EXPANSIONS?*"), (SubLObject)module0151.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12504", "CYC"), (SubLObject)module0151.T));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11923", "CYC"), (SubLObject)module0151.NIL));
        $ic24$ = SubLObjectFactory.makeSymbol("S#12485", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VACCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"))));
        $ic26$ = SubLObjectFactory.makeSymbol("PROTECTED");
        $ic27$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic28$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic29$ = SubLObjectFactory.makeSymbol("S#3544", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic31$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic32$ = SubLObjectFactory.makeSymbol("PROCLAIM");
        $ic33$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic34$ = SubLObjectFactory.makeSymbol("VACCESS");
        $ic35$ = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $ic36$ = SubLObjectFactory.makeSymbol("S#12505", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic38$ = SubLObjectFactory.makeUninternedSymbol("US#76F111E");
        $ic39$ = SubLObjectFactory.makeSymbol("S#12489", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#12490", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#12488", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12506", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = SubLObjectFactory.makeUninternedSymbol("US#75A9897");
        $ic45$ = SubLObjectFactory.makeSymbol("S#12507", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#8020", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12508", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("STRICT")));
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12508", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTIVE")));
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12508", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("LENIENT")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0151.class
	Total time: 94 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/