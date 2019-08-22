package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0664 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0664";
    public static final String myFingerPrint = "ff2d6e8312c7d4a1be1f8c443ae5e3c92a0895e8257dd53c55fc49b430c89c08";
    public static SubLSymbol $g5232$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    
    public static SubLObject f40362(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g5232$.getDynamicValue(var2) && NIL != module0208.f13537(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f40363(final SubLObject var1) {
        module0656.f39837((SubLObject)$ic2$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40364(final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == var4) {
            var4 = Sequences.cconcatenate(module0642.f39118((SubLObject)$ic4$), new SubLObject[] { module0039.f3041(conses_high.second(var3)), module0642.f39118((SubLObject)$ic5$) });
        }
        SubLObject var7 = module0656.$g5154$.getDynamicValue(var6);
        final SubLObject var8 = module0655.$g5132$.getDynamicValue(var6);
        if (var8 == $ic6$) {
            var7 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic7$, module0656.$g5154$.getDynamicValue(var6));
        }
        final SubLObject var9 = module0656.f39832(var8);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)$ic8$, var7, module0656.f39844(var3));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)T, var6);
            if (NIL != var5) {
                final SubLObject var11 = module0014.f697(var5);
                final SubLObject var12 = (SubLObject)$ic6$;
                final SubLObject var13 = (NIL != var4) ? var4 : module0014.f694(var5);
                final SubLObject var14 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var13) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var13);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var12) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var12));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var14) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var14);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var9_14 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                }
                finally {
                    module0015.$g533$.rebind(var9_14, var6);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var6), var4);
            }
        }
        finally {
            module0015.$g533$.rebind(var10, var6);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var3;
    }
    
    public static SubLObject f40365() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0664", "f40362", "S#44450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0664", "f40363", "S#44451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0664", "f40364", "S#44452", 1, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40366() {
        $g5232$ = SubLFiles.defparameter("S#44453", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40367() {
        module0656.f39895((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0656.f39901((SubLObject)$ic2$);
        module0012.f441((SubLObject)$ic3$);
        module0012.f444((SubLObject)$ic3$);
        module0656.f39840((SubLObject)$ic2$, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f40365();
    }
    
    public void initializeVariables() {
        f40366();
    }
    
    public void runTopLevelForms() {
        f40367();
    }
    
    static {
        me = (SubLFile)new module0664();
        $g5232$ = null;
        $ic0$ = makeSymbol("S#44454", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("unicode-naut"), (SubLObject)makeKeyword("KEYWORD"), (SubLObject)makeKeyword("UNICODE-NAUT"), (SubLObject)makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)makeSymbol("S#44450", "CYC"), (SubLObject)makeKeyword("HTML-OUTPUT-FN"), (SubLObject)makeSymbol("S#44451", "CYC"));
        $ic2$ = makeKeyword("UNICODE-NAUT");
        $ic3$ = makeSymbol("S#44453", "CYC");
        $ic4$ = makeKeyword("LAQUO");
        $ic5$ = makeKeyword("RAQUO");
        $ic6$ = makeKeyword("TOP");
        $ic7$ = makeString("cb-start|~A");
        $ic8$ = makeString("~a&~a");
        $ic9$ = makeSymbol("S#44452", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/