package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0646 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0646";
    public static final String myFingerPrint = "db882b64d0f38661d301cf5325c4c30dc53933518fc3f2b2c17308ad5861a7cb";
    public static SubLSymbol $g5028$;
    public static SubLSymbol $g5029$;
    public static SubLSymbol $g5030$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    
    public static SubLObject f39231() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0646.$g5030$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0646.NIL;
        var3 = var2.first();
        while (module0646.NIL != var2) {
            final SubLObject var4 = var3;
            if (module0646.NIL == conses_high.member(var4, module0015.$g525$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)module0646.EQUAL), Symbols.symbol_function((SubLObject)module0646.IDENTITY))) {
                module0015.$g525$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0015.$g525$.getDynamicValue(var1)), var1);
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)module0646.NIL;
    }
    
    public static SubLObject f39232() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0646.$g5029$.setDynamicValue(Sort.sort(conses_high.copy_list(module0646.$g5029$.getDynamicValue(var1)), Symbols.symbol_function((SubLObject)module0646.$ic3$), Symbols.symbol_function((SubLObject)module0646.$ic4$)), var1);
        return (SubLObject)module0646.NIL;
    }
    
    public static SubLObject f39233() {
        f39231();
        f39232();
        return (SubLObject)module0646.NIL;
    }
    
    public static SubLObject f39234() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39231", "S#43009", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39232", "S#43010", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39233", "S#43011", 0, 0, false);
        return (SubLObject)module0646.NIL;
    }
    
    public static SubLObject f39235() {
        module0646.$g5028$ = SubLFiles.defparameter("S#43012", (SubLObject)module0646.$ic0$);
        module0646.$g5029$ = SubLFiles.defparameter("S#43013", (SubLObject)module0646.$ic1$);
        module0646.$g5030$ = SubLFiles.defparameter("S#43014", (SubLObject)module0646.$ic2$);
        return (SubLObject)module0646.NIL;
    }
    
    public static SubLObject f39236() {
        return (SubLObject)module0646.NIL;
    }
    
    public void declareFunctions() {
        f39234();
    }
    
    public void initializeVariables() {
        f39235();
    }
    
    public void runTopLevelForms() {
        f39236();
    }
    
    static {
        me = (SubLFile)new module0646();
        module0646.$g5028$ = null;
        module0646.$g5029$ = null;
        module0646.$g5030$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("transmit and receive"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("receive only"), (SubLObject)SubLObjectFactory.makeKeyword("RECEIVE-ONLY")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("deaf"), (SubLObject)SubLObjectFactory.makeKeyword("DEAF")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dead"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("isolated"), (SubLObject)SubLObjectFactory.makeKeyword("ISOLATED")));
        $ic1$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BLACK"), (SubLObject)SubLObjectFactory.makeString("black")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BLUE"), (SubLObject)SubLObjectFactory.makeString("blue")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GREEN"), (SubLObject)SubLObjectFactory.makeString("green")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYAN"), (SubLObject)SubLObjectFactory.makeString("cyan")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RED"), (SubLObject)SubLObjectFactory.makeString("red")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MAGENTA"), (SubLObject)SubLObjectFactory.makeString("magenta")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YELLOW"), (SubLObject)SubLObjectFactory.makeString("yellow")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHITE"), (SubLObject)SubLObjectFactory.makeString("white")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-BLUE"), (SubLObject)SubLObjectFactory.makeString("light blue")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-RED"), (SubLObject)SubLObjectFactory.makeString("light red")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-YELLOW"), (SubLObject)SubLObjectFactory.makeString("light yellow")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-GRAY"), (SubLObject)SubLObjectFactory.makeString("light grey")), ConsesLow.cons((SubLObject)module0646.NIL, (SubLObject)SubLObjectFactory.makeString("default")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PERIWINKLE"), (SubLObject)SubLObjectFactory.makeString("periwinkle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SEA-GREEN"), (SubLObject)SubLObjectFactory.makeString("sea green")) });
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PERIWINKLE"), (SubLObject)SubLObjectFactory.makeString("CDCDFF")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SEA-GREEN"), (SubLObject)SubLObjectFactory.makeString("CDFFCD")));
        $ic3$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic4$ = SubLObjectFactory.makeSymbol("CDR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0646.class
	Total time: 32 ms
	
	Decompiled with Procyon 0.5.32.
*/