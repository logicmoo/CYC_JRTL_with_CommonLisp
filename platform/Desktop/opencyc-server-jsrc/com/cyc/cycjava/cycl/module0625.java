package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        final SubLObject var6 = (SubLObject)module0625.$ic0$;
        return (SubLObject)ConsesLow.list((SubLObject)module0625.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0625.$ic2$)), (SubLObject)ConsesLow.list((SubLObject)module0625.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0625.$ic4$, var6), (SubLObject)ConsesLow.listS((SubLObject)module0625.$ic5$, (SubLObject)ConsesLow.listS((SubLObject)module0625.$ic6$, var6, (SubLObject)module0625.$ic7$), ConsesLow.append(var5, (SubLObject)module0625.NIL)), reader.bq_cons((SubLObject)module0625.$ic8$, ConsesLow.append(var5, (SubLObject)module0625.NIL))));
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
        module0623.f38407(var8, var7, (SubLObject)module0625.$ic15$);
        return (SubLObject)module0625.NIL;
    }
    
    public static SubLObject f38520(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0625.NIL;
        if (module0625.NIL != var6) {
            final SubLObject var8 = module0623.f38312(var6);
            var7 = module0624.f38486(var8);
        }
        return var7;
    }
    
    public static SubLObject f38519(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isStream() && module0625.NIL != streams_high.output_stream_p(var11));
    }
    
    public static SubLObject f38522() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0625", "f38516", "WITH-TERMINATION-ON-LOST-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38517", "S#42142", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38518", "S#42143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38521", "S#42144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38520", "S#42145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0625", "f38519", "S#42146", 1, 0, false);
        return (SubLObject)module0625.NIL;
    }
    
    public static SubLObject f38523() {
        return (SubLObject)module0625.NIL;
    }
    
    public static SubLObject f38524() {
        module0012.f375((SubLObject)module0625.$ic9$, (SubLObject)module0625.$ic10$, (SubLObject)module0625.$ic11$);
        module0002.f50((SubLObject)module0625.$ic12$, (SubLObject)module0625.$ic9$);
        module0002.f50((SubLObject)module0625.$ic13$, (SubLObject)module0625.$ic9$);
        module0002.f50((SubLObject)module0625.$ic14$, (SubLObject)module0625.$ic9$);
        return (SubLObject)module0625.NIL;
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
        $ic0$ = SubLObjectFactory.makeUninternedSymbol("US#6D4E463");
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42142", "CYC")));
        $ic3$ = SubLObjectFactory.makeSymbol("PIF");
        $ic4$ = SubLObjectFactory.makeSymbol("NULL");
        $ic5$ = SubLObjectFactory.makeSymbol("WITH-GUARDIAN-REQUEST");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#42143", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#42144", "CYC")));
        $ic8$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic9$ = SubLObjectFactory.makeSymbol("WITH-TERMINATION-ON-LOST-CONNECTION");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("Execute the body under the assumption that ");
        $ic12$ = SubLObjectFactory.makeSymbol("S#42142", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#42143", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#42144", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("ABORT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0625.class
	Total time: 46 ms
	
	Decompiled with Procyon 0.5.32.
*/