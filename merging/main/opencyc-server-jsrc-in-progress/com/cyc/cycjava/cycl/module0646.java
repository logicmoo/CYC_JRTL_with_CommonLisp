package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var2 = $g5030$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            final SubLObject var4 = var3;
            if (NIL == conses_high.member(var4, module0015.$g525$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0015.$g525$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0015.$g525$.getDynamicValue(var1)), var1);
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39232() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        $g5029$.setDynamicValue(Sort.sort(conses_high.copy_list($g5029$.getDynamicValue(var1)), Symbols.symbol_function((SubLObject)$ic3$), Symbols.symbol_function((SubLObject)$ic4$)), var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39233() {
        f39231();
        f39232();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39234() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39231", "S#43009", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39232", "S#43010", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0646", "f39233", "S#43011", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39235() {
        $g5028$ = SubLFiles.defparameter("S#43012", (SubLObject)$ic0$);
        $g5029$ = SubLFiles.defparameter("S#43013", (SubLObject)$ic1$);
        $g5030$ = SubLFiles.defparameter("S#43014", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39236() {
        return (SubLObject)NIL;
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
        $g5028$ = null;
        $g5029$ = null;
        $g5030$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("transmit and receive"), (SubLObject)makeKeyword("TRANSMIT-AND-RECEIVE")), (SubLObject)ConsesLow.cons((SubLObject)makeString("receive only"), (SubLObject)makeKeyword("RECEIVE-ONLY")), (SubLObject)ConsesLow.cons((SubLObject)makeString("deaf"), (SubLObject)makeKeyword("DEAF")), (SubLObject)ConsesLow.cons((SubLObject)makeString("dead"), (SubLObject)makeKeyword("DEAD")), (SubLObject)ConsesLow.cons((SubLObject)makeString("isolated"), (SubLObject)makeKeyword("ISOLATED")));
        $ic1$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeKeyword("BLACK"), (SubLObject)makeString("black")), ConsesLow.cons((SubLObject)makeKeyword("BLUE"), (SubLObject)makeString("blue")), ConsesLow.cons((SubLObject)makeKeyword("GREEN"), (SubLObject)makeString("green")), ConsesLow.cons((SubLObject)makeKeyword("CYAN"), (SubLObject)makeString("cyan")), ConsesLow.cons((SubLObject)makeKeyword("RED"), (SubLObject)makeString("red")), ConsesLow.cons((SubLObject)makeKeyword("MAGENTA"), (SubLObject)makeString("magenta")), ConsesLow.cons((SubLObject)makeKeyword("YELLOW"), (SubLObject)makeString("yellow")), ConsesLow.cons((SubLObject)makeKeyword("WHITE"), (SubLObject)makeString("white")), ConsesLow.cons((SubLObject)makeKeyword("LIGHT-BLUE"), (SubLObject)makeString("light blue")), ConsesLow.cons((SubLObject)makeKeyword("LIGHT-RED"), (SubLObject)makeString("light red")), ConsesLow.cons((SubLObject)makeKeyword("LIGHT-YELLOW"), (SubLObject)makeString("light yellow")), ConsesLow.cons((SubLObject)makeKeyword("LIGHT-GRAY"), (SubLObject)makeString("light grey")), ConsesLow.cons((SubLObject)NIL, (SubLObject)makeString("default")), ConsesLow.cons((SubLObject)makeKeyword("PERIWINKLE"), (SubLObject)makeString("periwinkle")), ConsesLow.cons((SubLObject)makeKeyword("SEA-GREEN"), (SubLObject)makeString("sea green")) });
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("PERIWINKLE"), (SubLObject)makeString("CDCDFF")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("SEA-GREEN"), (SubLObject)makeString("CDFFCD")));
        $ic3$ = makeSymbol("STRING-LESSP");
        $ic4$ = makeSymbol("CDR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 32 ms
	
	Decompiled with Procyon 0.5.32.
*/