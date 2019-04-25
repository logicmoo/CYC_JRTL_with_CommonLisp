package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0594 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0594";
    public static final String myFingerPrint = "6e69ced4e6ef369b0d8a5b8fbf55ab89662ad8a6453bb62dd73ee806db69106a";
    private static SubLSymbol $g4550$;
    private static SubLSymbol $g4551$;
    private static SubLSymbol $g4552$;
    private static SubLSymbol $g4553$;
    private static SubLSymbol $g4554$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    
    public static SubLObject f36338(final SubLObject var1) {
        return Types.symbolp(var1);
    }
    
    public static SubLObject f36339(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0269.f17705(var1));
    }
    
    public static SubLObject f36340(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = Sequences.remove_duplicates(f36341(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = f36342(var3);
        final SubLObject var6 = module0331.f22382(module0076.f5290(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0132.$g1566$.getGlobalValue());
        if (NIL == var6) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var6)) {
            return var6.first();
        }
        Errors.warn((SubLObject)$ic5$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36343(final SubLObject var7) {
        return f36344(var7);
    }
    
    public static SubLObject f36345(final SubLObject var3, final SubLObject var7) {
        return f36346(var3, var7, (SubLObject)$ic6$);
    }
    
    public static SubLObject f36347(final SubLObject var3, final SubLObject var7) {
        return f36346(var3, var7, (SubLObject)$ic7$);
    }
    
    public static SubLObject f36346(final SubLObject var3, final SubLObject var7, final SubLObject var8) {
        assert NIL != f36339(var3) : var3;
        assert NIL != module0173.f10955(var7) : var7;
        final SubLObject var9 = f36342(var3);
        SubLObject var10 = (SubLObject)NIL;
        if (var8.eql((SubLObject)$ic6$)) {
            var10 = (SubLObject)ConsesLow.cons(var7, var9);
        }
        else if (var8.eql((SubLObject)$ic7$)) {
            var10 = Sequences.remove(var7, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)$ic10$, var8);
        }
        module0067.f4887($g4550$.getGlobalValue(), var3);
        if (NIL != var10) {
            module0067.f4886($g4550$.getGlobalValue(), var3, var10);
        }
        return module0067.f4884($g4550$.getGlobalValue(), var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36342(final SubLObject var3) {
        assert NIL != f36339(var3) : var3;
        return module0067.f4884($g4550$.getGlobalValue(), var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36348(final SubLObject var2, final SubLObject var7) {
        return f36349(var2, var7, (SubLObject)$ic6$);
    }
    
    public static SubLObject f36350(final SubLObject var2, final SubLObject var7) {
        return f36349(var2, var7, (SubLObject)$ic7$);
    }
    
    public static SubLObject f36349(final SubLObject var2, final SubLObject var7, final SubLObject var8) {
        assert NIL != f36338(var2) : var2;
        assert NIL != module0173.f10955(var7) : var7;
        final SubLObject var9 = f36341(var2);
        SubLObject var10 = (SubLObject)NIL;
        if ($ic12$.eql(module0205.f13276(var10))) {
            return var9;
        }
        if (NIL != module0035.f2169(var10, var9)) {
            return var9;
        }
        if (var8.eql((SubLObject)$ic6$)) {
            var10 = (SubLObject)ConsesLow.cons(var7, var9);
        }
        else if (var8.eql((SubLObject)$ic7$)) {
            var10 = Sequences.remove(var7, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)$ic13$, var8);
        }
        module0067.f4887($g4551$.getGlobalValue(), var2);
        if (NIL != var10) {
            module0067.f4886($g4551$.getGlobalValue(), var2, var10);
        }
        return module0067.f4884($g4551$.getGlobalValue(), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36351(final SubLObject var2) {
        final SubLObject var3 = f36341(var2);
        SubLObject var4 = module0035.f2269(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var4 = Sequences.remove($ic12$, var4, (SubLObject)EQ, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0067.f4887($g4551$.getGlobalValue(), var2);
        if (NIL != var4) {
            module0067.f4886($g4551$.getGlobalValue(), var2, var4);
        }
        return module0067.f4884($g4551$.getGlobalValue(), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36341(final SubLObject var2) {
        assert NIL != f36338(var2) : var2;
        return module0067.f4884($g4551$.getGlobalValue(), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36352(final SubLObject var7, final SubLObject var2) {
        assert NIL != module0173.f10955(var7) : var7;
        assert NIL != f36338(var2) : var2;
        return module0067.f4886($g4552$.getGlobalValue(), var7, var2);
    }
    
    public static SubLObject f36353(final SubLObject var7) {
        assert NIL != module0173.f10955(var7) : var7;
        return module0067.f4887($g4552$.getGlobalValue(), var7);
    }
    
    public static SubLObject f36344(final SubLObject var7) {
        assert NIL != module0173.f10955(var7) : var7;
        return module0067.f4884($g4552$.getGlobalValue(), var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36354() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        module0067.f4881($g4550$.getGlobalValue());
        module0067.f4881($g4551$.getGlobalValue());
        module0067.f4881($g4552$.getGlobalValue());
        if (NIL != module0269.f17707(module0132.$g1566$.getGlobalValue()) && NIL != module0269.f17706($g4553$.getGlobalValue())) {
            final SubLObject var13 = module0147.f9540(module0132.$g1566$.getGlobalValue());
            final SubLObject var14 = module0147.$g2095$.currentBinding(var12);
            final SubLObject var15 = module0147.$g2094$.currentBinding(var12);
            final SubLObject var16 = module0147.$g2096$.currentBinding(var12);
            try {
                module0147.$g2095$.bind(module0147.f9545(var13), var12);
                module0147.$g2094$.bind(module0147.f9546(var13), var12);
                module0147.$g2096$.bind(module0147.f9549(var13), var12);
                SubLObject var17 = $g4553$.getGlobalValue();
                if (NIL != module0158.f10038(var17)) {
                    final SubLObject var18 = (SubLObject)NIL;
                    final SubLObject var14_19 = module0012.$g73$.currentBinding(var12);
                    final SubLObject var15_20 = module0012.$g65$.currentBinding(var12);
                    final SubLObject var16_21 = module0012.$g67$.currentBinding(var12);
                    final SubLObject var19 = module0012.$g68$.currentBinding(var12);
                    final SubLObject var20 = module0012.$g66$.currentBinding(var12);
                    final SubLObject var21 = module0012.$g69$.currentBinding(var12);
                    final SubLObject var22 = module0012.$g70$.currentBinding(var12);
                    final SubLObject var23 = module0012.$silent_progressP$.currentBinding(var12);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var12);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var12), var12);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var12);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g70$.bind((SubLObject)T, var12);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var18) ? module0012.$silent_progressP$.getDynamicValue(var12) : T), var12);
                        module0012.f474(var18);
                        final SubLObject var24 = module0158.f10039(var17);
                        SubLObject var25 = (SubLObject)NIL;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28) {
                                module0012.f476();
                                SubLObject var29 = (SubLObject)NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var28_33 = (SubLObject)NIL;
                                    final SubLObject var29_34 = (SubLObject)NIL;
                                    while (NIL == var28_33) {
                                        final SubLObject var30 = module0052.f3695(var29, var29_34);
                                        final SubLObject var31_36 = (SubLObject)makeBoolean(!var29_34.eql(var30));
                                        if (NIL != var31_36) {
                                            f36355(var30);
                                        }
                                        var28_33 = (SubLObject)makeBoolean(NIL == var31_36);
                                    }
                                }
                                finally {
                                    final SubLObject var14_20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                        if (NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var14_20, var12);
                                    }
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var23, var12);
                        module0012.$g70$.rebind(var22, var12);
                        module0012.$g69$.rebind(var21, var12);
                        module0012.$g66$.rebind(var20, var12);
                        module0012.$g68$.rebind(var19, var12);
                        module0012.$g67$.rebind(var16_21, var12);
                        module0012.$g65$.rebind(var15_20, var12);
                        module0012.$g73$.rebind(var14_19, var12);
                    }
                }
                var17 = $g4554$.getGlobalValue();
                if (NIL != module0158.f10038(var17)) {
                    final SubLObject var18 = (SubLObject)NIL;
                    final SubLObject var14_21 = module0012.$g73$.currentBinding(var12);
                    final SubLObject var15_21 = module0012.$g65$.currentBinding(var12);
                    final SubLObject var16_22 = module0012.$g67$.currentBinding(var12);
                    final SubLObject var19 = module0012.$g68$.currentBinding(var12);
                    final SubLObject var20 = module0012.$g66$.currentBinding(var12);
                    final SubLObject var21 = module0012.$g69$.currentBinding(var12);
                    final SubLObject var22 = module0012.$g70$.currentBinding(var12);
                    final SubLObject var23 = module0012.$silent_progressP$.currentBinding(var12);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var12);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var12), var12);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var12);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var12);
                        module0012.$g70$.bind((SubLObject)T, var12);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var18) ? module0012.$silent_progressP$.getDynamicValue(var12) : T), var12);
                        module0012.f474(var18);
                        final SubLObject var24 = module0158.f10039(var17);
                        SubLObject var25 = (SubLObject)NIL;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28) {
                                module0012.f476();
                                SubLObject var29 = (SubLObject)NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var28_34 = (SubLObject)NIL;
                                    final SubLObject var29_35 = (SubLObject)NIL;
                                    while (NIL == var28_34) {
                                        final SubLObject var30 = module0052.f3695(var29, var29_35);
                                        final SubLObject var31_37 = (SubLObject)makeBoolean(!var29_35.eql(var30));
                                        if (NIL != var31_37) {
                                            f36356(var30);
                                        }
                                        var28_34 = (SubLObject)makeBoolean(NIL == var31_37);
                                    }
                                }
                                finally {
                                    final SubLObject var14_22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                        if (NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var14_22, var12);
                                    }
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var23, var12);
                        module0012.$g70$.rebind(var22, var12);
                        module0012.$g69$.rebind(var21, var12);
                        module0012.$g66$.rebind(var20, var12);
                        module0012.$g68$.rebind(var19, var12);
                        module0012.$g67$.rebind(var16_22, var12);
                        module0012.$g65$.rebind(var15_21, var12);
                        module0012.$g73$.rebind(var14_21, var12);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var16, var12);
                module0147.$g2094$.rebind(var15, var12);
                module0147.$g2095$.rebind(var14, var12);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36357(final SubLObject var45, final SubLObject var35) {
        return f36355(var35);
    }
    
    public static SubLObject f36358(final SubLObject var45, final SubLObject var35) {
        return f36359(var35);
    }
    
    public static SubLObject f36355(final SubLObject var35) {
        final SubLObject var36 = module0178.f11334(var35);
        final SubLObject var37 = module0202.f12759(module0178.f11335(var35));
        f36348(var37, var36);
        f36352(var36, var37);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36359(final SubLObject var35) {
        final SubLObject var36 = module0178.f11334(var35);
        final SubLObject var37 = module0202.f12759(module0178.f11335(var35));
        f36350(var37, var36);
        f36353(var36);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36360(final SubLObject var45, final SubLObject var35) {
        return f36356(var35);
    }
    
    public static SubLObject f36361(final SubLObject var45, final SubLObject var35) {
        return f36362(var35);
    }
    
    public static SubLObject f36356(final SubLObject var35) {
        final SubLObject var36 = module0178.f11334(var35);
        final SubLObject var37 = module0178.f11335(var35);
        return f36345(var37, var36);
    }
    
    public static SubLObject f36362(final SubLObject var35) {
        final SubLObject var36 = module0178.f11334(var35);
        final SubLObject var37 = module0178.f11335(var35);
        return f36347(var37, var36);
    }
    
    public static SubLObject f36363() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36338", "S#40069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36339", "S#40070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36340", "S#18042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36343", "S#18043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36345", "S#40071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36347", "S#40072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36346", "S#40073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36342", "S#40074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36348", "S#40075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36350", "S#40076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36349", "S#40077", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36351", "S#40078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36341", "S#40079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36352", "S#40080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36353", "S#40081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36344", "S#40082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36354", "S#40083", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36357", "ADD-SUBLIDENTIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36358", "REMOVE-SUBLIDENTIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36355", "S#40084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36359", "S#40085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36360", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36361", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36356", "S#40086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0594", "f36362", "S#40087", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36364() {
        $g4550$ = SubLFiles.deflexical("S#40088", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g4550$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4551$ = SubLFiles.deflexical("S#40089", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g4551$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4552$ = SubLFiles.deflexical("S#40090", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g4552$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4553$ = SubLFiles.defconstant("S#40091", $ic3$);
        $g4554$ = SubLFiles.defconstant("S#40092", $ic4$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36365() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic17$);
        module0012.f416((SubLObject)$ic18$);
        module0012.f416((SubLObject)$ic19$);
        module0012.f416((SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f36363();
    }
    
    public void initializeVariables() {
        f36364();
    }
    
    public void runTopLevelForms() {
        f36365();
    }
    
    static {
        me = (SubLFile)new module0594();
        $g4550$ = null;
        $g4551$ = null;
        $g4552$ = null;
        $g4553$ = null;
        $g4554$ = null;
        $ic0$ = makeSymbol("S#40088", "CYC");
        $ic1$ = makeSymbol("S#40089", "CYC");
        $ic2$ = makeSymbol("S#40090", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("uniquelyIdentifiedInType"));
        $ic5$ = makeString("More than one Cyc entity found for ID ~A and domain ~A.");
        $ic6$ = makeKeyword("ADD");
        $ic7$ = makeKeyword("REMOVE");
        $ic8$ = makeSymbol("S#40070", "CYC");
        $ic9$ = makeSymbol("FORT-P");
        $ic10$ = makeString("Unknown sublid-domain-to-forts-update operation ~A");
        $ic11$ = makeSymbol("S#40069", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("SubLSymbolEntityFn"));
        $ic13$ = makeString("Unknown sublid-forts-update operation ~A");
        $ic14$ = makeSymbol("NAT-FUNCTOR");
        $ic15$ = makeKeyword("GAF");
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeSymbol("ADD-SUBLIDENTIFIER");
        $ic18$ = makeSymbol("REMOVE-SUBLIDENTIFIER");
        $ic19$ = makeSymbol("ADD-UNIQUELYIDENTIFIEDINTYPE");
        $ic20$ = makeSymbol("REMOVE-UNIQUELYIDENTIFIEDINTYPE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 229 ms
	
	Decompiled with Procyon 0.5.32.
*/