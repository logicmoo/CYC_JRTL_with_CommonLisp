package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var1 = $g1513$.getGlobalValue();
        SubLObject var2 = (SubLObject)NIL;
        var2 = var1.first();
        while (NIL != var1) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic2$, Symbols.symbol_name(var2), Symbols.symbol_value(var2));
            var1 = var1.rest();
            var2 = var1.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8536() {
        return $g1514$.getGlobalValue();
    }
    
    public static SubLObject f8537() {
        $g1514$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8538() {
        $g1514$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8539() {
        return $g1515$.getGlobalValue();
    }
    
    public static SubLObject f8540() {
        $g1515$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8541() {
        $g1515$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8542() {
        return $g1516$.getGlobalValue();
    }
    
    public static SubLObject f8543() {
        $g1516$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8544() {
        $g1516$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8545() {
        return $g1517$.getGlobalValue();
    }
    
    public static SubLObject f8546() {
        $g1517$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8547() {
        $g1517$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8548() {
        return $g1518$.getGlobalValue();
    }
    
    public static SubLObject f8549() {
        $g1518$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8550() {
        $g1518$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8551() {
        return $g1519$.getGlobalValue();
    }
    
    public static SubLObject f8552() {
        $g1519$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8553() {
        $g1519$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8554() {
        return $g1520$.getGlobalValue();
    }
    
    public static SubLObject f8555() {
        $g1520$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8556() {
        $g1520$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8557() {
        return $g1521$.getGlobalValue();
    }
    
    public static SubLObject f8558() {
        $g1521$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8559() {
        $g1521$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8560() {
        return $g1522$.getGlobalValue();
    }
    
    public static SubLObject f8561() {
        $g1522$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8562() {
        $g1522$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8563() {
        return $g1523$.getGlobalValue();
    }
    
    public static SubLObject f8564() {
        $g1523$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8565() {
        $g1523$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8566() {
        return $g1524$.getGlobalValue();
    }
    
    public static SubLObject f8567() {
        $g1524$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8568() {
        $g1524$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8569() {
        return $g1525$.getGlobalValue();
    }
    
    public static SubLObject f8570() {
        $g1525$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8571() {
        $g1525$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8572() {
        return $g1526$.getGlobalValue();
    }
    
    public static SubLObject f8573() {
        $g1526$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8574() {
        $g1526$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8575() {
        return $g1527$.getGlobalValue();
    }
    
    public static SubLObject f8576() {
        $g1527$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8577() {
        $g1527$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8578() {
        return $g1528$.getGlobalValue();
    }
    
    public static SubLObject f8579() {
        $g1528$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8580() {
        $g1528$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8581() {
        return $g1529$.getGlobalValue();
    }
    
    public static SubLObject f8582() {
        $g1529$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8583() {
        $g1529$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8584() {
        return $g1530$.getGlobalValue();
    }
    
    public static SubLObject f8585() {
        $g1530$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f8586() {
        $g1530$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8587() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g1534$.getDynamicValue(var3);
    }
    
    public static SubLObject f8588(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        $g1541$.setDynamicValue((SubLObject)ConsesLow.cons(var4, $g1541$.getDynamicValue(var5)), var5);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8590() {
        $g1512$ = SubLFiles.deflexical("S#10686", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1512$.getGlobalValue() : $ic1$);
        $g1513$ = SubLFiles.deflexical("S#745", (SubLObject)NIL);
        $g1514$ = SubLFiles.deflexical("S#10687", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g1514$.getGlobalValue() : NIL));
        $g1515$ = SubLFiles.deflexical("S#10688", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g1515$.getGlobalValue() : NIL));
        $g1516$ = SubLFiles.deflexical("S#10689", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g1516$.getGlobalValue() : NIL));
        $g1517$ = SubLFiles.deflexical("S#10690", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g1517$.getGlobalValue() : NIL));
        $g1518$ = SubLFiles.deflexical("S#10691", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g1518$.getGlobalValue() : NIL));
        $g1519$ = SubLFiles.deflexical("S#10692", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g1519$.getGlobalValue() : NIL));
        $g1520$ = SubLFiles.deflexical("S#10693", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g1520$.getGlobalValue() : NIL));
        $g1521$ = SubLFiles.deflexical("S#10694", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic10$)) ? $g1521$.getGlobalValue() : NIL));
        $g1522$ = SubLFiles.deflexical("S#10695", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic11$)) ? $g1522$.getGlobalValue() : NIL));
        $g1523$ = SubLFiles.deflexical("S#10696", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic12$)) ? $g1523$.getGlobalValue() : NIL));
        $g1524$ = SubLFiles.deflexical("S#10697", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g1524$.getGlobalValue() : NIL));
        $g1525$ = SubLFiles.deflexical("S#10698", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic14$)) ? $g1525$.getGlobalValue() : NIL));
        $g1526$ = SubLFiles.deflexical("S#10699", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g1526$.getGlobalValue() : NIL));
        $g1527$ = SubLFiles.deflexical("S#10700", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g1527$.getGlobalValue() : NIL));
        $g1528$ = SubLFiles.deflexical("S#10701", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g1528$.getGlobalValue() : NIL));
        $g1529$ = SubLFiles.deflexical("S#10702", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic18$)) ? $g1529$.getGlobalValue() : NIL));
        $g1530$ = SubLFiles.deflexical("S#10703", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g1530$.getGlobalValue() : NIL));
        $g1531$ = SubLFiles.defparameter("S#10704", (SubLObject)T);
        $g1532$ = SubLFiles.defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", (SubLObject)T);
        $g1533$ = SubLFiles.defparameter("S#10705", (SubLObject)NIL);
        $g1534$ = SubLFiles.defparameter("S#10706", (SubLObject)NIL);
        $g60$ = SubLFiles.defparameter("S#693", (SubLObject)NIL);
        $g1535$ = SubLFiles.defparameter("S#10707", (SubLObject)NIL);
        $g1536$ = SubLFiles.defparameter("S#10708", (SubLObject)NIL);
        $g1537$ = SubLFiles.defparameter("S#10709", (SubLObject)$ic20$);
        $g1538$ = SubLFiles.defparameter("S#691", (SubLObject)$ic21$);
        $g1539$ = SubLFiles.defparameter("S#10710", (SubLObject)T);
        $g1540$ = SubLFiles.defparameter("S#10711", (SubLObject)NIL);
        $g1541$ = SubLFiles.defparameter("S#10712", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8591() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic3$);
        SubLObject var5 = (SubLObject)$ic3$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic4$);
        var5 = (SubLObject)$ic4$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic5$);
        var5 = (SubLObject)$ic5$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic6$);
        var5 = (SubLObject)$ic6$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic7$);
        var5 = (SubLObject)$ic7$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic8$);
        var5 = (SubLObject)$ic8$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic9$);
        var5 = (SubLObject)$ic9$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic10$);
        var5 = (SubLObject)$ic10$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic11$);
        var5 = (SubLObject)$ic11$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic12$);
        var5 = (SubLObject)$ic12$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic13$);
        var5 = (SubLObject)$ic13$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic14$);
        var5 = (SubLObject)$ic14$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic15$);
        var5 = (SubLObject)$ic15$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic16$);
        var5 = (SubLObject)$ic16$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic17$);
        var5 = (SubLObject)$ic17$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic18$);
        var5 = (SubLObject)$ic18$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0003.f57((SubLObject)$ic19$);
        var5 = (SubLObject)$ic19$;
        if (NIL == conses_high.member(var5, $g1513$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g1513$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g1513$.getGlobalValue()));
        }
        module0012.f441((SubLObject)$ic22$);
        var5 = (SubLObject)$ic22$;
        if (NIL == conses_high.member(var5, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var5, module0012.$g52$.getGlobalValue()));
        }
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic24$);
        return (SubLObject)NIL;
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
        $g1512$ = null;
        $g1513$ = null;
        $g1514$ = null;
        $g1515$ = null;
        $g1516$ = null;
        $g1517$ = null;
        $g1518$ = null;
        $g1519$ = null;
        $g1520$ = null;
        $g1521$ = null;
        $g1522$ = null;
        $g1523$ = null;
        $g1524$ = null;
        $g1525$ = null;
        $g1526$ = null;
        $g1527$ = null;
        $g1528$ = null;
        $g1529$ = null;
        $g1530$ = null;
        $g1531$ = null;
        $g1532$ = null;
        $g1533$ = null;
        $g1534$ = null;
        $g60$ = null;
        $g1535$ = null;
        $g1536$ = null;
        $g1537$ = null;
        $g1538$ = null;
        $g1539$ = null;
        $g1540$ = null;
        $g1541$ = null;
        $ic0$ = makeSymbol("S#10686", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("backchainForbiddenWhenUnboundInArg"));
        $ic2$ = makeString("~a ~a~%");
        $ic3$ = makeSymbol("S#10687", "CYC");
        $ic4$ = makeSymbol("S#10688", "CYC");
        $ic5$ = makeSymbol("S#10689", "CYC");
        $ic6$ = makeSymbol("S#10690", "CYC");
        $ic7$ = makeSymbol("S#10691", "CYC");
        $ic8$ = makeSymbol("S#10692", "CYC");
        $ic9$ = makeSymbol("S#10693", "CYC");
        $ic10$ = makeSymbol("S#10694", "CYC");
        $ic11$ = makeSymbol("S#10695", "CYC");
        $ic12$ = makeSymbol("S#10696", "CYC");
        $ic13$ = makeSymbol("S#10697", "CYC");
        $ic14$ = makeSymbol("S#10698", "CYC");
        $ic15$ = makeSymbol("S#10699", "CYC");
        $ic16$ = makeSymbol("S#10700", "CYC");
        $ic17$ = makeSymbol("S#10701", "CYC");
        $ic18$ = makeSymbol("S#10702", "CYC");
        $ic19$ = makeSymbol("S#10703", "CYC");
        $ic20$ = makeKeyword("ALL");
        $ic21$ = makeKeyword("UNINITIALIZED");
        $ic22$ = makeSymbol("S#691", "CYC");
        $ic23$ = makeSymbol("S#10685", "CYC");
        $ic24$ = makeSymbol("S#10713", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 103 ms
	
	Decompiled with Procyon 0.5.32.
*/