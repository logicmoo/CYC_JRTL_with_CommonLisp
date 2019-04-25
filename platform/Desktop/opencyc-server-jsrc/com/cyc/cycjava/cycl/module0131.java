package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0131 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0131";
    public static final String myFingerPrint = "281c1298aa82eb7101bed97bdc49c04a9edc46febb0216d3c2170fe246f4e049";
    public static SubLSymbol $g1512$;
    private static SubLSymbol $g1513$;
    private static SubLSymbol $g1514$;
    private static SubLSymbol $g1515$;
    private static SubLSymbol $g1516$;
    private static SubLSymbol $g1517$;
    private static SubLSymbol $g1518$;
    private static SubLSymbol $g1519$;
    private static SubLSymbol $g1520$;
    private static SubLSymbol $g1521$;
    private static SubLSymbol $g1522$;
    private static SubLSymbol $g1523$;
    private static SubLSymbol $g1524$;
    private static SubLSymbol $g1525$;
    private static SubLSymbol $g1526$;
    private static SubLSymbol $g1527$;
    private static SubLSymbol $g1528$;
    private static SubLSymbol $g1529$;
    private static SubLSymbol $g1530$;
    public static SubLSymbol $g1531$;
    public static SubLSymbol $g1532$;
    public static SubLSymbol $g1533$;
    public static SubLSymbol $g1534$;
    public static SubLSymbol $g60$;
    public static SubLSymbol $g1535$;
    public static SubLSymbol $g1536$;
    public static SubLSymbol $g1537$;
    public static SubLSymbol $g1538$;
    public static SubLSymbol $g1539$;
    public static SubLSymbol $g1540$;
    public static SubLSymbol $g1541$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    
    public static SubLObject f8535() {
        SubLObject var1 = module0131.$g1513$.getGlobalValue();
        SubLObject var2 = (SubLObject)module0131.NIL;
        var2 = var1.first();
        while (module0131.NIL != var1) {
            PrintLow.format((SubLObject)module0131.T, (SubLObject)module0131.$ic2$, Symbols.symbol_name(var2), Symbols.symbol_value(var2));
            var1 = var1.rest();
            var2 = var1.first();
        }
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8536() {
        return module0131.$g1514$.getGlobalValue();
    }
    
    public static SubLObject f8537() {
        module0131.$g1514$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8538() {
        module0131.$g1514$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8539() {
        return module0131.$g1515$.getGlobalValue();
    }
    
    public static SubLObject f8540() {
        module0131.$g1515$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8541() {
        module0131.$g1515$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8542() {
        return module0131.$g1516$.getGlobalValue();
    }
    
    public static SubLObject f8543() {
        module0131.$g1516$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8544() {
        module0131.$g1516$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8545() {
        return module0131.$g1517$.getGlobalValue();
    }
    
    public static SubLObject f8546() {
        module0131.$g1517$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8547() {
        module0131.$g1517$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8548() {
        return module0131.$g1518$.getGlobalValue();
    }
    
    public static SubLObject f8549() {
        module0131.$g1518$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8550() {
        module0131.$g1518$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8551() {
        return module0131.$g1519$.getGlobalValue();
    }
    
    public static SubLObject f8552() {
        module0131.$g1519$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8553() {
        module0131.$g1519$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8554() {
        return module0131.$g1520$.getGlobalValue();
    }
    
    public static SubLObject f8555() {
        module0131.$g1520$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8556() {
        module0131.$g1520$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8557() {
        return module0131.$g1521$.getGlobalValue();
    }
    
    public static SubLObject f8558() {
        module0131.$g1521$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8559() {
        module0131.$g1521$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8560() {
        return module0131.$g1522$.getGlobalValue();
    }
    
    public static SubLObject f8561() {
        module0131.$g1522$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8562() {
        module0131.$g1522$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8563() {
        return module0131.$g1523$.getGlobalValue();
    }
    
    public static SubLObject f8564() {
        module0131.$g1523$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8565() {
        module0131.$g1523$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8566() {
        return module0131.$g1524$.getGlobalValue();
    }
    
    public static SubLObject f8567() {
        module0131.$g1524$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8568() {
        module0131.$g1524$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8569() {
        return module0131.$g1525$.getGlobalValue();
    }
    
    public static SubLObject f8570() {
        module0131.$g1525$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8571() {
        module0131.$g1525$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8572() {
        return module0131.$g1526$.getGlobalValue();
    }
    
    public static SubLObject f8573() {
        module0131.$g1526$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8574() {
        module0131.$g1526$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8575() {
        return module0131.$g1527$.getGlobalValue();
    }
    
    public static SubLObject f8576() {
        module0131.$g1527$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8577() {
        module0131.$g1527$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8578() {
        return module0131.$g1528$.getGlobalValue();
    }
    
    public static SubLObject f8579() {
        module0131.$g1528$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8580() {
        module0131.$g1528$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8581() {
        return module0131.$g1529$.getGlobalValue();
    }
    
    public static SubLObject f8582() {
        module0131.$g1529$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8583() {
        module0131.$g1529$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8584() {
        return module0131.$g1530$.getGlobalValue();
    }
    
    public static SubLObject f8585() {
        module0131.$g1530$.setGlobalValue((SubLObject)module0131.T);
        return (SubLObject)module0131.T;
    }
    
    public static SubLObject f8586() {
        module0131.$g1530$.setGlobalValue((SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8587() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0131.$g1534$.getDynamicValue(var3);
    }
    
    public static SubLObject f8588(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0131.$g1541$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0131.$g1541$.getDynamicValue(var5)), var5);
        return var4;
    }
    
    public static SubLObject f8589() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8535", "S#10634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8536", "S#10635", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8537", "S#10636", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8538", "S#10637", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8539", "S#10638", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8540", "S#10639", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8541", "S#10640", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8542", "S#10641", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8543", "S#10642", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8544", "S#10643", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8545", "S#10644", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8546", "S#10645", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8547", "S#10646", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8548", "S#10647", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8549", "S#10648", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8550", "S#10649", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8551", "S#10650", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8552", "S#10651", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8553", "S#10652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8554", "S#10653", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8555", "S#10654", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8556", "S#10655", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8557", "S#10656", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8558", "S#10657", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8559", "S#10658", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8560", "S#10659", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8561", "S#10660", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8562", "S#10661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8563", "S#10662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8564", "S#10663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8565", "S#10664", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8566", "DATE-KB-LOADED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8567", "S#10665", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8568", "S#10666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8569", "S#10667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8570", "S#10668", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8571", "S#10669", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8572", "S#10670", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8573", "S#10671", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8574", "S#10672", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8575", "S#10673", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8576", "S#10674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8577", "S#10675", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8578", "S#10676", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8579", "S#10677", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8580", "S#10678", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8581", "S#10679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8582", "S#10680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8583", "S#10681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8584", "S#10682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8585", "S#10683", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8586", "S#10684", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8587", "S#363", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0131", "f8588", "S#10685", 1, 0, false);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8590() {
        module0131.$g1512$ = SubLFiles.deflexical("S#10686", (module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic0$)) ? module0131.$g1512$.getGlobalValue() : module0131.$ic1$);
        module0131.$g1513$ = SubLFiles.deflexical("S#745", (SubLObject)module0131.NIL);
        module0131.$g1514$ = SubLFiles.deflexical("S#10687", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic3$)) ? module0131.$g1514$.getGlobalValue() : module0131.NIL));
        module0131.$g1515$ = SubLFiles.deflexical("S#10688", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic4$)) ? module0131.$g1515$.getGlobalValue() : module0131.NIL));
        module0131.$g1516$ = SubLFiles.deflexical("S#10689", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic5$)) ? module0131.$g1516$.getGlobalValue() : module0131.NIL));
        module0131.$g1517$ = SubLFiles.deflexical("S#10690", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic6$)) ? module0131.$g1517$.getGlobalValue() : module0131.NIL));
        module0131.$g1518$ = SubLFiles.deflexical("S#10691", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic7$)) ? module0131.$g1518$.getGlobalValue() : module0131.NIL));
        module0131.$g1519$ = SubLFiles.deflexical("S#10692", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic8$)) ? module0131.$g1519$.getGlobalValue() : module0131.NIL));
        module0131.$g1520$ = SubLFiles.deflexical("S#10693", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic9$)) ? module0131.$g1520$.getGlobalValue() : module0131.NIL));
        module0131.$g1521$ = SubLFiles.deflexical("S#10694", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic10$)) ? module0131.$g1521$.getGlobalValue() : module0131.NIL));
        module0131.$g1522$ = SubLFiles.deflexical("S#10695", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic11$)) ? module0131.$g1522$.getGlobalValue() : module0131.NIL));
        module0131.$g1523$ = SubLFiles.deflexical("S#10696", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic12$)) ? module0131.$g1523$.getGlobalValue() : module0131.NIL));
        module0131.$g1524$ = SubLFiles.deflexical("S#10697", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic13$)) ? module0131.$g1524$.getGlobalValue() : module0131.NIL));
        module0131.$g1525$ = SubLFiles.deflexical("S#10698", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic14$)) ? module0131.$g1525$.getGlobalValue() : module0131.NIL));
        module0131.$g1526$ = SubLFiles.deflexical("S#10699", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic15$)) ? module0131.$g1526$.getGlobalValue() : module0131.NIL));
        module0131.$g1527$ = SubLFiles.deflexical("S#10700", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic16$)) ? module0131.$g1527$.getGlobalValue() : module0131.NIL));
        module0131.$g1528$ = SubLFiles.deflexical("S#10701", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic17$)) ? module0131.$g1528$.getGlobalValue() : module0131.NIL));
        module0131.$g1529$ = SubLFiles.deflexical("S#10702", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic18$)) ? module0131.$g1529$.getGlobalValue() : module0131.NIL));
        module0131.$g1530$ = SubLFiles.deflexical("S#10703", (SubLObject)((module0131.NIL != Symbols.boundp((SubLObject)module0131.$ic19$)) ? module0131.$g1530$.getGlobalValue() : module0131.NIL));
        module0131.$g1531$ = SubLFiles.defparameter("S#10704", (SubLObject)module0131.T);
        module0131.$g1532$ = SubLFiles.defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", (SubLObject)module0131.T);
        module0131.$g1533$ = SubLFiles.defparameter("S#10705", (SubLObject)module0131.NIL);
        module0131.$g1534$ = SubLFiles.defparameter("S#10706", (SubLObject)module0131.NIL);
        module0131.$g60$ = SubLFiles.defparameter("S#693", (SubLObject)module0131.NIL);
        module0131.$g1535$ = SubLFiles.defparameter("S#10707", (SubLObject)module0131.NIL);
        module0131.$g1536$ = SubLFiles.defparameter("S#10708", (SubLObject)module0131.NIL);
        module0131.$g1537$ = SubLFiles.defparameter("S#10709", (SubLObject)module0131.$ic20$);
        module0131.$g1538$ = SubLFiles.defparameter("S#691", (SubLObject)module0131.$ic21$);
        module0131.$g1539$ = SubLFiles.defparameter("S#10710", (SubLObject)module0131.T);
        module0131.$g1540$ = SubLFiles.defparameter("S#10711", (SubLObject)module0131.NIL);
        module0131.$g1541$ = SubLFiles.defparameter("S#10712", (SubLObject)module0131.NIL);
        return (SubLObject)module0131.NIL;
    }
    
    public static SubLObject f8591() {
        module0003.f57((SubLObject)module0131.$ic0$);
        module0003.f57((SubLObject)module0131.$ic3$);
        SubLObject var5 = (SubLObject)module0131.$ic3$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic4$);
        var5 = (SubLObject)module0131.$ic4$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic5$);
        var5 = (SubLObject)module0131.$ic5$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic6$);
        var5 = (SubLObject)module0131.$ic6$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic7$);
        var5 = (SubLObject)module0131.$ic7$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic8$);
        var5 = (SubLObject)module0131.$ic8$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic9$);
        var5 = (SubLObject)module0131.$ic9$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic10$);
        var5 = (SubLObject)module0131.$ic10$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic11$);
        var5 = (SubLObject)module0131.$ic11$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic12$);
        var5 = (SubLObject)module0131.$ic12$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic13$);
        var5 = (SubLObject)module0131.$ic13$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic14$);
        var5 = (SubLObject)module0131.$ic14$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic15$);
        var5 = (SubLObject)module0131.$ic15$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic16$);
        var5 = (SubLObject)module0131.$ic16$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic17$);
        var5 = (SubLObject)module0131.$ic17$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic18$);
        var5 = (SubLObject)module0131.$ic18$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)module0131.$ic19$);
        var5 = (SubLObject)module0131.$ic19$;
        if (module0131.NIL == conses_high.member(var5, module0131.$g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0131.$g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0131.$g1513$.getGlobalValue()));
        }
        module0012.f441((SubLObject)module0131.$ic22$);
        var5 = (SubLObject)module0131.$ic22$;
        if (module0131.NIL == conses_high.member(var5, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0131.EQL), Symbols.symbol_function((SubLObject)module0131.IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0012.$g52$.getGlobalValue()));
        }
        module0002.f50((SubLObject)module0131.$ic23$, (SubLObject)module0131.$ic24$);
        return (SubLObject)module0131.NIL;
    }
    
    public void declareFunctions() {
        f8589();
    }
    
    public void initializeVariables() {
        f8590();
    }
    
    public void runTopLevelForms() {
        f8591();
    }
    
    static {
        me = (SubLFile)new module0131();
        module0131.$g1512$ = null;
        module0131.$g1513$ = null;
        module0131.$g1514$ = null;
        module0131.$g1515$ = null;
        module0131.$g1516$ = null;
        module0131.$g1517$ = null;
        module0131.$g1518$ = null;
        module0131.$g1519$ = null;
        module0131.$g1520$ = null;
        module0131.$g1521$ = null;
        module0131.$g1522$ = null;
        module0131.$g1523$ = null;
        module0131.$g1524$ = null;
        module0131.$g1525$ = null;
        module0131.$g1526$ = null;
        module0131.$g1527$ = null;
        module0131.$g1528$ = null;
        module0131.$g1529$ = null;
        module0131.$g1530$ = null;
        module0131.$g1531$ = null;
        module0131.$g1532$ = null;
        module0131.$g1533$ = null;
        module0131.$g1534$ = null;
        module0131.$g60$ = null;
        module0131.$g1535$ = null;
        module0131.$g1536$ = null;
        module0131.$g1537$ = null;
        module0131.$g1538$ = null;
        module0131.$g1539$ = null;
        module0131.$g1540$ = null;
        module0131.$g1541$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10686", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("backchainForbiddenWhenUnboundInArg"));
        $ic2$ = SubLObjectFactory.makeString("~a ~a~%");
        $ic3$ = SubLObjectFactory.makeSymbol("S#10687", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#10688", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#10689", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#10690", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#10691", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#10692", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#10693", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10694", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#10695", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#10696", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#10697", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#10698", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#10699", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#10700", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#10701", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#10702", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#10703", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("ALL");
        $ic21$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic22$ = SubLObjectFactory.makeSymbol("S#691", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#10685", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#10713", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0131.class
	Total time: 103 ms
	
	Decompiled with Procyon 0.5.32.
*/