package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0625 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0625";
    public static final String myFingerPrint = "ec11866ad843a3375242cd5a0d7b458e824fe94d938652a2d99dc5e51aeb6c8f";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    
    public static SubLObject f38516(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)$ic0$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic2$)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var6, (SubLObject)$ic7$), ConsesLow.append(var5, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic8$, ConsesLow.append(var5, (SubLObject)NIL))));
    }
    
    public static SubLObject f38517() {
        return module0623.f38411();
    }
    
    public static SubLObject f38518(final SubLObject var6) {
        return f38519(f38520(var6));
    }
    
    public static SubLObject f38521(final SubLObject var6) {
        final SubLObject var7 = module0623.f38312(var6);
        final SubLObject var8 = module0623.f38306(var6);
        module0623.f38407(var8, var7, (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38520(final SubLObject var6) {
        SubLObject var7 = (SubLObject)NIL;
        if (NIL != var6) {
            final SubLObject var8 = module0623.f38312(var6);
            var7 = module0624.f38486(var8);
        }
        return var7;
    }
    
    public static SubLObject f38519(final SubLObject var11) {
        return (SubLObject)makeBoolean(var11.isStream() && NIL != streams_high.output_stream_p(var11));
    }
    
    public static SubLObject f38522() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0625", "f38516", "WITH-TERMINATION-ON-LOST-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38517", "S#42142", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38518", "S#42143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38521", "S#42144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38520", "S#42145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38519", "S#42146", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38523() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38524() {
        module0012.f375((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)$ic11$);
        module0002.f50((SubLObject)$ic12$, (SubLObject)$ic9$);
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic9$);
        module0002.f50((SubLObject)$ic14$, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38522();
    }
    
    public void initializeVariables() {
        f38523();
    }
    
    public void runTopLevelForms() {
        f38524();
    }
    
    static {
        me = (SubLFile)new module0625();
        $ic0$ = makeUninternedSymbol("US#6D4E463");
        $ic1$ = makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42142", "CYC")));
        $ic3$ = makeSymbol("PIF");
        $ic4$ = makeSymbol("NULL");
        $ic5$ = makeSymbol("WITH-GUARDIAN-REQUEST");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#42143", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#42144", "CYC")));
        $ic8$ = makeSymbol("PROGN");
        $ic9$ = makeSymbol("WITH-TERMINATION-ON-LOST-CONNECTION");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic11$ = makeString("Execute the body under the assumption that ");
        $ic12$ = makeSymbol("S#42142", "CYC");
        $ic13$ = makeSymbol("S#42143", "CYC");
        $ic14$ = makeSymbol("S#42144", "CYC");
        $ic15$ = makeKeyword("ABORT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 46 ms
	
	Decompiled with Procyon 0.5.32.
*/