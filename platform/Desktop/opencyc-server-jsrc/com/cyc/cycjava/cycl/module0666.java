package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0666 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0666";
    public static final String myFingerPrint = "1b02df46d4d38e4a971092999a054ca947c242310604a518cdaab4dda4e68af1";
    public static SubLSymbol $g5237$;
    public static SubLSymbol $g5238$;
    public static SubLSymbol $g5239$;
    private static SubLSymbol $g5240$;
    private static SubLSymbol $g5241$;
    private static SubLSymbol $g5242$;
    private static SubLSymbol $g5243$;
    private static SubLSymbol $g5244$;
    private static SubLSymbol $g5245$;
    private static SubLSymbol $g5246$;
    public static SubLSymbol $g5247$;
    public static SubLSymbol $g5248$;
    private static SubLSymbol $g5249$;
    public static SubLSymbol $g5250$;
    private static SubLSymbol $g5251$;
    private static SubLSymbol $g5252$;
    private static SubLSymbol $g5253$;
    private static SubLSymbol $g5254$;
    private static SubLSymbol $g5255$;
    private static SubLSymbol $g5256$;
    private static SubLSymbol $g5257$;
    private static SubLSymbol $g5258$;
    private static SubLSymbol $g5259$;
    private static SubLSymbol $g5260$;
    private static SubLSymbol $g5261$;
    private static SubLSymbol $g5262$;
    private static SubLSymbol $g5263$;
    private static SubLSymbol $g5264$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLInteger $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLInteger $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLInteger $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    
    
    public static SubLObject f40467(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var2 == module0666.UNPROVIDED) {
            var2 = (SubLObject)module0666.$ic2$;
        }
        if (var3 == module0666.UNPROVIDED) {
            var3 = (SubLObject)module0666.NIL;
        }
        if (var4 == module0666.UNPROVIDED) {
            var4 = (SubLObject)module0666.NIL;
        }
        if (var5 == module0666.UNPROVIDED) {
            var5 = (SubLObject)module0666.NIL;
        }
        if (var6 == module0666.UNPROVIDED) {
            var6 = (SubLObject)module0666.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert module0666.NIL != Types.stringp(var1) : var1;
        if (module0666.NIL == var3) {
            var3 = module0666.$ic4$;
        }
        assert module0666.NIL != module0173.f10955(var3) : var3;
        if (module0666.NIL != module0666.$g5237$.getDynamicValue(var7)) {
            final SubLObject var8 = module0655.f39759(var6);
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            if (module0666.NIL != var2) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                module0642.f39019(var2);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            }
            module0642.f39032((SubLObject)module0666.ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), module0666.$g5240$.getGlobalValue(), new SubLObject[] { var1, (module0666.NIL != var4) ? module0666.$ic6$ : module0666.$ic7$, module0656.f39842(var3), var8, (module0666.NIL != var5) ? module0666.$ic6$ : module0666.$ic7$ });
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40468(final SubLObject var1, SubLObject var9, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var9 == module0666.UNPROVIDED) {
            var9 = (SubLObject)module0666.$ic2$;
        }
        if (var3 == module0666.UNPROVIDED) {
            var3 = (SubLObject)module0666.NIL;
        }
        if (var4 == module0666.UNPROVIDED) {
            var4 = (SubLObject)module0666.NIL;
        }
        if (var5 == module0666.UNPROVIDED) {
            var5 = (SubLObject)module0666.NIL;
        }
        if (var6 == module0666.UNPROVIDED) {
            var6 = (SubLObject)module0666.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert module0666.NIL != Types.stringp(var1) : var1;
        if (module0666.NIL == var3) {
            var3 = module0666.$ic4$;
        }
        assert module0666.NIL != module0173.f10955(var3) : var3;
        if (module0666.NIL != module0666.$g5237$.getDynamicValue(var10)) {
            final SubLObject var11 = module0655.f39759(var6);
            final SubLObject var12 = Sequences.cconcatenate((SubLObject)module0666.$ic8$, new SubLObject[] { module0006.f203(var1), module0666.$ic9$, module0006.f203((SubLObject)((module0666.NIL != var4) ? module0666.$ic6$ : module0666.$ic7$)), module0666.$ic10$, module0006.f203(module0656.f39842(var3)), module0666.$ic9$, module0006.f203(var11), module0666.$ic11$, module0006.f203((SubLObject)((module0666.NIL != var5) ? module0666.$ic6$ : module0666.$ic7$)), module0666.$ic12$ });
            final SubLObject var13 = f40469();
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(var13);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
            final SubLObject var14 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)module0666.T, var10);
                module0642.f39019(var9);
            }
            finally {
                module0015.$g533$.rebind(var14, var10);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40470(final SubLObject var1, SubLObject var2) {
        if (var2 == module0666.UNPROVIDED) {
            var2 = (SubLObject)module0666.$ic14$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0666.NIL != Types.stringp(var1) : var1;
        if (module0666.NIL != module0666.$g5237$.getDynamicValue(var3)) {
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            if (module0666.NIL != var2) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                module0642.f39019(var2);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            }
            module0642.f39032((SubLObject)module0666.ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var3), module0666.$g5241$.getGlobalValue(), var1);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40469() {
        return (SubLObject)module0666.$ic15$;
    }
    
    public static SubLObject f40471() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), module0666.$g5242$.getGlobalValue(), module0110.$g570$.getDynamicValue(var7), (SubLObject)((module0666.NIL == module0666.$g5238$.getDynamicValue(var7)) ? module0666.$g5239$.getDynamicValue(var7) : module0666.$ic19$));
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        final SubLObject var9 = module0014.f657((SubLObject)module0666.$ic17$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40472() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), module0666.$g5243$.getGlobalValue());
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40473(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var15);
            PrintLow.format(module0015.$g131$.getDynamicValue(var15), module0666.$g5244$.getGlobalValue(), var14);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var15);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40474(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var18);
            PrintLow.format(module0015.$g131$.getDynamicValue(var18), module0666.$g5245$.getGlobalValue(), new SubLObject[] { var15, var16, var17, (module0666.NIL != module0666.$g5238$.getDynamicValue(var18)) ? module0666.$ic6$ : module0666.$ic7$ });
            module0642.f39028((SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0666.$g5246$.getGlobalValue());
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40475(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var19);
            PrintLow.format(module0015.$g131$.getDynamicValue(var19), module0666.$g5247$.getDynamicValue(var19), var18);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40476(final SubLObject var18, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var21 = module0015.$g533$.currentBinding(var20);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var20);
            PrintLow.format(module0015.$g131$.getDynamicValue(var20), module0666.$g5248$.getDynamicValue(var20), var18, var19);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var21, var20);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40477(final SubLObject var20) {
        final SubLObject var21 = module0642.f39104((SubLObject)module0666.$ic27$, var20);
        final SubLObject var22 = module0642.f39104((SubLObject)module0666.$ic28$, var20);
        final SubLObject var23 = module0642.f39104((SubLObject)module0666.$ic29$, var20);
        final SubLObject var24 = module0642.f39104((SubLObject)module0666.$ic30$, var20);
        SubLObject var25 = module0642.f39104((SubLObject)module0666.$ic31$, var20);
        SubLObject var26 = module0642.f39104((SubLObject)module0666.$ic32$, var20);
        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0666.NIL == module0642.f39104((SubLObject)module0666.$ic33$, var20));
        final SubLObject var28 = Equality.equal((SubLObject)module0666.$ic6$, module0642.f39104((SubLObject)module0666.$ic34$, var20));
        SubLObject var29 = (SubLObject)module0666.NIL;
        if (module0666.NIL != var25) {
            var25 = module0656.f39943(var25, (SubLObject)module0666.UNPROVIDED);
        }
        if (var25.eql(module0666.$ic4$)) {
            var25 = (SubLObject)module0666.NIL;
        }
        if (module0666.NIL != var26) {
            var26 = module0655.f39758(var26);
        }
        var29 = f40478(var23, var25, var26, var28, var27, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != var29) {
            if (module0666.NIL != module0035.f1997(var29)) {
                f40479(var21, var22, var23, var29.first(), var24, var25);
            }
            else {
                f40480(var21, var22, var23, var26, var29, var24, var25);
            }
        }
        else {
            f40481(var23, var25);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40478(final SubLObject var18, final SubLObject var21, final SubLObject var22, SubLObject var5, SubLObject var23, SubLObject var25) {
        if (var5 == module0666.UNPROVIDED) {
            var5 = (SubLObject)module0666.NIL;
        }
        if (var23 == module0666.UNPROVIDED) {
            var23 = (SubLObject)module0666.T;
        }
        if (var25 == module0666.UNPROVIDED) {
            var25 = (SubLObject)module0666.T;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)module0666.NIL;
        if (module0666.NIL != module0038.f2608(var18)) {
            SubLObject var28 = (SubLObject)module0666.NIL;
            final SubLObject var29 = module0147.$g2094$.currentBinding(var26);
            final SubLObject var30 = module0147.$g2095$.currentBinding(var26);
            try {
                module0147.$g2094$.bind((SubLObject)module0666.$ic36$, var26);
                module0147.$g2095$.bind(module0666.$ic37$, var26);
                if (module0666.NIL == var21) {
                    var28 = module0677.f41332();
                }
                else if (module0549.f33895(var21).numLE((SubLObject)module0666.$ic38$)) {
                    var28 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0666.$ic39$), module0259.f16848(var21, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                }
                else {
                    var28 = module0259.f16860(var21, module0677.f41332(), (SubLObject)module0666.UNPROVIDED);
                }
            }
            finally {
                module0147.$g2095$.rebind(var30, var26);
                module0147.$g2094$.rebind(var29, var26);
            }
            var27 = conses_high.nunion(conses_high.copy_list(var22), var28, Symbols.symbol_function((SubLObject)module0666.EQ), (SubLObject)module0666.UNPROVIDED);
        }
        else if (module0666.NIL != var25) {
            var27 = module0126.f8393(var18, var23, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
            if (module0666.NIL != var21) {
                final SubLObject var31 = module0147.$g2094$.currentBinding(var26);
                final SubLObject var32 = module0147.$g2095$.currentBinding(var26);
                try {
                    module0147.$g2094$.bind((SubLObject)module0666.$ic36$, var26);
                    module0147.$g2095$.bind(module0666.$ic37$, var26);
                    var27 = module0259.f16860(var21, var27, (SubLObject)module0666.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var32, var26);
                    module0147.$g2094$.rebind(var31, var26);
                }
            }
        }
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)module0666.$ic40$), Symbols.symbol_function((SubLObject)module0666.$ic41$));
        if (module0666.NIL != var22) {
            var27 = module0035.f2386(var27, var22, Symbols.symbol_function((SubLObject)module0666.EQ), (SubLObject)module0666.UNPROVIDED);
        }
        if (module0666.NIL != module0038.f2653(var18) && module0666.NIL != var5) {
            SubLObject var33 = (module0666.NIL != module0269.f17705(var21) && !module0666.$ic4$.eql(var21)) ? oc_nl_trie_completion.f45853(var18, var21, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED) : oc_nl_trie_completion.f45848(var18, (SubLObject)module0666.UNPROVIDED);
            var33 = Sort.sort(var33, Symbols.symbol_function((SubLObject)module0666.$ic42$), (SubLObject)module0666.UNPROVIDED);
            var27 = ConsesLow.append(var27, var33);
        }
        return var27;
    }
    
    public static SubLObject f40480(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var22, final SubLObject var24, final SubLObject var19, final SubLObject var21) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = Sequences.length(var24);
        final SubLObject var27 = module0038.f2701(var24, Symbols.symbol_function((SubLObject)module0666.$ic43$), Sequences.length(var17));
        final SubLObject var28 = Sequences.cconcatenate(var17, var27);
        final SubLObject var29 = Sequences.find(var28, var24, Symbols.symbol_function((SubLObject)module0666.EQUAL), Symbols.symbol_function((SubLObject)module0666.$ic43$), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var30 = Numbers.numG(Sequences.length(var27), (SubLObject)module0666.ZERO_INTEGER);
        module0642.f39020((SubLObject)module0666.$ic44$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        f40474(var15, var16, var17);
        if (module0666.NIL != var30) {
            f40475(var28);
        }
        f40472();
        f40473((SubLObject)((module0666.NIL != var29) ? (var26.numE((SubLObject)module0666.TWO_INTEGER) ? module0666.$ic45$ : PrintLow.format((SubLObject)module0666.NIL, (SubLObject)module0666.$ic46$, Numbers.subtract(var26, (SubLObject)module0666.ONE_INTEGER))) : PrintLow.format((SubLObject)module0666.NIL, (SubLObject)module0666.$ic47$, var26, (SubLObject)((module0666.NIL != module0038.f2608(var17)) ? module0666.$ic48$ : module0666.$ic0$))));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL == module0666.$g5238$.getDynamicValue(var25) || module0666.NIL == var30) {
            final SubLObject var31 = module0015.$g535$.currentBinding(var25);
            try {
                module0015.$g535$.bind((SubLObject)module0666.T, var25);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                final SubLObject var12_34 = module0015.$g533$.currentBinding(var25);
                try {
                    module0015.$g533$.bind((SubLObject)module0666.T, var25);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var25));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                    final SubLObject var12_35 = module0015.$g533$.currentBinding(var25);
                    final SubLObject var32 = module0015.$g541$.currentBinding(var25);
                    final SubLObject var33 = module0015.$g539$.currentBinding(var25);
                    try {
                        module0015.$g533$.bind((SubLObject)module0666.T, var25);
                        module0015.$g541$.bind((SubLObject)module0666.T, var25);
                        module0015.$g539$.bind(module0015.f797(), var25);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)module0666.UNPROVIDED);
                        if (module0666.NIL != var30) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0666.$ic49$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39024(var27);
                            module0642.f39026((SubLObject)module0666.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        final SubLObject var34 = (SubLObject)module0666.$ic50$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0666.NIL != var34) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var34));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                        final SubLObject var12_36 = module0015.$g533$.currentBinding(var25);
                        try {
                            module0015.$g533$.bind((SubLObject)module0666.T, var25);
                            module0642.f39019(var26);
                            if (module0666.NIL != module0038.f2608(var17)) {
                                module0642.f39019((SubLObject)module0666.$ic51$);
                            }
                            else {
                                module0642.f39019((SubLObject)module0666.$ic52$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var12_36, var25);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var35 = Sequences.count_if((SubLObject)module0666.$ic39$, var24, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                        final SubLObject var36 = Sequences.count_if((SubLObject)module0666.$ic3$, var24, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                        SubLObject var37 = (SubLObject)module0666.NIL;
                        SubLObject var38 = (SubLObject)module0666.NIL;
                        SubLObject var39 = (SubLObject)module0666.NIL;
                        SubLObject var40 = var24;
                        SubLObject var41 = (SubLObject)module0666.NIL;
                        var41 = var40.first();
                        while (module0666.NIL != var40) {
                            if (module0666.NIL != constant_handles_oc.f8449(var41) && module0666.NIL == var37) {
                                module0642.f39051((SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var25), (SubLObject)module0666.$ic53$, var35);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                var37 = (SubLObject)module0666.T;
                            }
                            else if (var41.isString() && module0666.NIL == var38) {
                                module0642.f39051((SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var25), (SubLObject)module0666.$ic54$, var36);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                var38 = (SubLObject)module0666.T;
                            }
                            module0642.f39026((SubLObject)module0666.UNPROVIDED);
                            if (module0666.NIL != constant_handles_oc.f8449(var39) && module0666.NIL != constant_handles_oc.f8449(var41) && module0666.NIL != module0004.f104(var39, var22, Symbols.symbol_function((SubLObject)module0666.EQ), (SubLObject)module0666.UNPROVIDED) && module0666.NIL == module0004.f104(var41, var22, Symbols.symbol_function((SubLObject)module0666.EQ), (SubLObject)module0666.UNPROVIDED)) {
                                module0642.f39051((SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                            }
                            f40484(var41, var19);
                            var39 = var41;
                            var40 = var40.rest();
                            var41 = var40.first();
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var25));
                    }
                    finally {
                        module0015.$g539$.rebind(var33, var25);
                        module0015.$g541$.rebind(var32, var25);
                        module0015.$g533$.rebind(var12_35, var25);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0666.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_34, var25);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0666.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var31, var25);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40485(final SubLObject var45) {
        if (module0666.NIL != constant_handles_oc.f8449(var45)) {
            return constants_high_oc.f10743(var45);
        }
        if (var45.isString()) {
            return var45;
        }
        return print_high.princ_to_string(var45);
    }
    
    public static SubLObject f40479(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var45, final SubLObject var19, final SubLObject var21) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = f40485(var45);
        final SubLObject var48 = Equality.equal(var17, var47);
        module0642.f39020((SubLObject)module0666.$ic44$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        f40474(var15, var16, var17);
        f40476(var47, var19);
        f40473((SubLObject)((module0666.NIL != var48) ? module0666.$ic55$ : module0666.$ic56$));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL == module0666.$g5238$.getDynamicValue(var46)) {
            final SubLObject var49 = module0015.$g535$.currentBinding(var46);
            try {
                module0015.$g535$.bind((SubLObject)module0666.T, var46);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                final SubLObject var12_47 = module0015.$g533$.currentBinding(var46);
                try {
                    module0015.$g533$.bind((SubLObject)module0666.T, var46);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var46));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                    final SubLObject var12_48 = module0015.$g533$.currentBinding(var46);
                    final SubLObject var50 = module0015.$g541$.currentBinding(var46);
                    final SubLObject var51 = module0015.$g539$.currentBinding(var46);
                    try {
                        module0015.$g533$.bind((SubLObject)module0666.T, var46);
                        module0015.$g541$.bind((SubLObject)module0666.T, var46);
                        module0015.$g539$.bind(module0015.f797(), var46);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)module0666.UNPROVIDED);
                        if (module0666.NIL != var48) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0666.$ic57$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0666.$ic58$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0666.UNPROVIDED);
                            module0642.f39019(var47);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var46));
                    }
                    finally {
                        module0015.$g539$.rebind(var51, var46);
                        module0015.$g541$.rebind(var50, var46);
                        module0015.$g533$.rebind(var12_48, var46);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0666.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_47, var46);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0666.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var49, var46);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40481(final SubLObject var17, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0666.$ic44$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        if (module0666.NIL == module0038.f2608(var17)) {
            f40473((SubLObject)module0666.$ic59$);
        }
        else {
            f40473((SubLObject)module0666.$ic60$);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL == module0666.$g5238$.getDynamicValue(var22)) {
            final SubLObject var23 = module0015.$g535$.currentBinding(var22);
            try {
                module0015.$g535$.bind((SubLObject)module0666.T, var22);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                final SubLObject var12_49 = module0015.$g533$.currentBinding(var22);
                try {
                    module0015.$g533$.bind((SubLObject)module0666.T, var22);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var22));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                    final SubLObject var12_50 = module0015.$g533$.currentBinding(var22);
                    final SubLObject var24 = module0015.$g541$.currentBinding(var22);
                    final SubLObject var25 = module0015.$g539$.currentBinding(var22);
                    try {
                        module0015.$g533$.bind((SubLObject)module0666.T, var22);
                        module0015.$g541$.bind((SubLObject)module0666.T, var22);
                        module0015.$g539$.bind(module0015.f797(), var22);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)module0666.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        if (module0666.NIL == module0038.f2608(var17)) {
                            module0642.f39019((SubLObject)module0666.$ic61$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0666.$ic62$);
                        }
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var22));
                    }
                    finally {
                        module0015.$g539$.rebind(var25, var22);
                        module0015.$g541$.rebind(var24, var22);
                        module0015.$g533$.rebind(var12_50, var22);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0666.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_49, var22);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0666.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var23, var22);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40482(final SubLObject var17) {
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        if (module0666.NIL != module0038.f2608(var17)) {
            module0642.f39019((SubLObject)module0666.$ic63$);
        }
        else {
            module0642.f39019((SubLObject)module0666.$ic64$);
        }
        module0642.f39020(module0015.$g174$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40483(final SubLObject var17, final SubLObject var21) {
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (module0666.NIL != module0038.f2608(var17)) {
            module0642.f39019((SubLObject)module0666.$ic63$);
        }
        else {
            module0642.f39019((SubLObject)module0666.$ic64$);
        }
        module0642.f39032((SubLObject)module0666.TWO_INTEGER);
        module0644.f39178((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0666.$ic65$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39019(Environment.get_machine_name((SubLObject)module0666.UNPROVIDED));
        if (module0666.NIL == module0038.f2608(var17)) {
            module0642.f39026((SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0666.$ic66$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(var17);
        }
        if (module0666.NIL != var21) {
            module0642.f39026((SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0666.$ic67$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(var21);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40484(final SubLObject var51, final SubLObject var19) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (!var51.isString() && !module0666.areAssertionsDisabledFor(me) && module0666.NIL == constant_handles_oc.f8449(var51)) {
            throw new AssertionError(var51);
        }
        final SubLObject var53 = f40485(var51);
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g302$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic69$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39032((SubLObject)module0666.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var52), module0666.$g5249$.getGlobalValue(), var53, var19);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        module0642.f39032((SubLObject)module0666.UNPROVIDED);
        module0642.f39019(f40485(var51));
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40486(final SubLObject var52, final SubLObject var53, final SubLObject var54, final SubLObject var55, final SubLObject var56, SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        if (module0666.NIL == var57) {
            var57 = module0666.$ic4$;
        }
        final SubLObject var59 = (SubLObject)((module0666.NIL != var56) ? module0666.$ic6$ : module0666.$ic7$);
        final SubLObject var60 = module0656.f39932(var57);
        final SubLObject var61 = Sequences.cconcatenate((SubLObject)module0666.$ic73$, module0589.f35898(var60, (SubLObject)module0666.UNPROVIDED));
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var62 = module0015.$g533$.currentBinding(var58);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var58);
            PrintLow.format(module0015.$g131$.getDynamicValue(var58), module0666.$g5250$.getDynamicValue(var58), new SubLObject[] { var61, var52, var53, var55, var54, var59 });
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var62, var58);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40487() {
        SubLObject var61 = module0014.f672((SubLObject)module0666.$ic74$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic75$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != var61) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(var61);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        var61 = module0014.f672((SubLObject)module0666.$ic77$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic75$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != var61) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
            module0642.f39020(var61);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40488(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)module0666.$ic80$, var20);
        final SubLObject var23 = module0642.f39113((SubLObject)module0666.$ic81$, var20, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var24 = module0642.f39113((SubLObject)module0666.$ic82$, var20, (SubLObject)module0666.$ic83$);
        final SubLObject var25 = module0642.f39113((SubLObject)module0666.$ic84$, var20, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var26 = module0642.f39113((SubLObject)module0666.$ic85$, var20, module0666.$g5251$.getDynamicValue(var21));
        final SubLObject var27 = module0587.$g4457$.currentBinding(var21);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var21), var21);
            SubLObject var29;
            final SubLObject var28 = var29 = f40489(var20);
            SubLObject var30 = (SubLObject)module0666.NIL;
            SubLObject var31 = (SubLObject)module0666.NIL;
            SubLObject var32 = (SubLObject)module0666.NIL;
            SubLObject var33 = (SubLObject)module0666.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0666.$ic86$);
            var30 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0666.$ic86$);
            var31 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0666.$ic86$);
            var32 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0666.$ic86$);
            var33 = var29.first();
            var29 = var29.rest();
            if (module0666.NIL == var29) {
                final SubLObject var34 = module0660.f40150(var22, var23, (SubLObject)module0666.NIL);
                final SubLObject var35 = module0067.f4880((SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                SubLObject var36 = var34;
                SubLObject var37 = (SubLObject)module0666.NIL;
                var37 = var36.first();
                while (module0666.NIL != var36) {
                    if (module0666.NIL != f40490(var37, var30, var31, (SubLObject)module0666.$ic87$) && module0666.NIL != f40491(var37, var32, var33, (SubLObject)module0666.$ic87$)) {
                        module0084.f5765(var35, var37, module0770.f49049(var37, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                f40492(var35, var24, (SubLObject)module0666.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0666.$ic86$);
            }
            return (SubLObject)module0666.NIL;
        }
        finally {
            module0587.$g4457$.rebind(var27, var21);
        }
    }
    
    public static SubLObject f40493(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)module0666.$ic29$, var20);
        final SubLObject var23 = module0642.f39113((SubLObject)module0666.$ic81$, var20, (SubLObject)module0666.NIL);
        final SubLObject var24 = module0642.f39113((SubLObject)module0666.$ic82$, var20, (SubLObject)module0666.$ic90$);
        final SubLObject var25 = module0642.f39113((SubLObject)module0666.$ic84$, var20, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var26 = module0642.f39113((SubLObject)module0666.$ic85$, var20, module0666.$g5251$.getDynamicValue(var21));
        final SubLObject var27 = module0642.f39115((SubLObject)module0666.$ic91$, var20, module0666.$ic92$);
        final SubLObject var28 = module0587.$g4457$.currentBinding(var21);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var21), var21);
            SubLObject var30;
            final SubLObject var29 = var30 = f40489(var20);
            SubLObject var31 = (SubLObject)module0666.NIL;
            SubLObject var32 = (SubLObject)module0666.NIL;
            SubLObject var33 = (SubLObject)module0666.NIL;
            SubLObject var34 = (SubLObject)module0666.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0666.$ic86$);
            var31 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0666.$ic86$);
            var32 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0666.$ic86$);
            var33 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0666.$ic86$);
            var34 = var30.first();
            var30 = var30.rest();
            if (module0666.NIL == var30) {
                f40494(var22, var24, var31, var32, var33, var34, var26, var25, var23, (SubLObject)module0666.T, (SubLObject)module0666.NIL, var27);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)module0666.$ic86$);
            }
            return (SubLObject)module0666.NIL;
        }
        finally {
            module0587.$g4457$.rebind(var28, var21);
        }
    }
    
    public static SubLObject f40489(final SubLObject var20) {
        final SubLObject var21 = module0656.f39957(module0642.f39104((SubLObject)module0666.$ic31$, var20), (SubLObject)module0666.UNPROVIDED);
        SubLObject var22 = (module0666.NIL != var21) ? var21 : module0666.$ic4$;
        SubLObject var23 = (SubLObject)module0666.NIL;
        SubLObject var24 = (SubLObject)module0666.NIL;
        SubLObject var25 = (SubLObject)module0666.NIL;
        final SubLObject var26 = module0642.f39115((SubLObject)module0666.$ic91$, var20, module0666.$ic93$);
        final SubLObject var27 = f40495(var20);
        final SubLObject var28 = module0205.f13357(var27, (SubLObject)module0666.$ic94$, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != var27) {
            final SubLObject var29 = (SubLObject)((module0666.NIL != var27) ? f40496(var27, var28, var26) : module0666.NIL);
            var22 = f40497(var29);
            var23 = f40498(var29);
            var24 = f40499(var27, var26);
            var25 = f40500(var27, var26);
        }
        else if (module0666.NIL == module0173.f10955(var22)) {
            if (module0666.NIL != module0751.f46676(var22)) {
                var23 = module0205.f13277(var22, (SubLObject)module0666.UNPROVIDED);
                var22 = module0666.$ic4$;
            }
            else {
                var22 = module0666.$ic4$;
            }
        }
        return (SubLObject)ConsesLow.list(var22, var23, var24, var25);
    }
    
    public static SubLObject f40501() {
        final SubLObject var82 = module0666.$g5252$.getGlobalValue();
        if (module0666.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40502(final SubLObject var83, SubLObject var75) {
        if (var75 == module0666.UNPROVIDED) {
            var75 = module0666.$ic95$;
        }
        return module0034.f1829(module0666.$g5252$.getGlobalValue(), (SubLObject)ConsesLow.list(var83, var75), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40503(final SubLObject var83, final SubLObject var75) {
        if (module0205.f13204(var83, (SubLObject)module0666.UNPROVIDED) == module0666.$ic94$ && module0666.NIL != module0260.f17091(module0205.f13132(var83), module0666.$ic97$, var75, (SubLObject)module0666.UNPROVIDED)) {
            return module0256.f16525(module0205.f13203(var83, (SubLObject)module0666.UNPROVIDED), var75, (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40499(final SubLObject var83, SubLObject var75) {
        if (var75 == module0666.UNPROVIDED) {
            var75 = module0666.$ic95$;
        }
        SubLObject var84 = module0666.$g5252$.getGlobalValue();
        if (module0666.NIL == var84) {
            var84 = module0034.f1934((SubLObject)module0666.$ic96$, (SubLObject)module0666.$ic98$, (SubLObject)module0666.$ic99$, (SubLObject)module0666.EQUAL, (SubLObject)module0666.TWO_INTEGER, (SubLObject)module0666.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0666.$ic100$);
        }
        final SubLObject var85 = module0034.f1782(var83, var75);
        final SubLObject var86 = module0034.f1814(var84, var85, (SubLObject)module0666.UNPROVIDED);
        if (var86 != module0666.$ic101$) {
            SubLObject var87 = var86;
            SubLObject var88 = (SubLObject)module0666.NIL;
            var88 = var87.first();
            while (module0666.NIL != var87) {
                SubLObject var89 = var88.first();
                final SubLObject var90 = conses_high.second(var88);
                if (var83.equal(var89.first())) {
                    var89 = var89.rest();
                    if (module0666.NIL != var89 && module0666.NIL == var89.rest() && var75.equal(var89.first())) {
                        return module0034.f1959(var90);
                    }
                }
                var87 = var87.rest();
                var88 = var87.first();
            }
        }
        final SubLObject var91 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40503(var83, var75)));
        module0034.f1836(var84, var85, var86, var91, (SubLObject)ConsesLow.list(var83, var75));
        return module0034.f1959(var91);
    }
    
    public static SubLObject f40504() {
        final SubLObject var82 = module0666.$g5253$.getGlobalValue();
        if (module0666.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40505(final SubLObject var83, SubLObject var75) {
        if (var75 == module0666.UNPROVIDED) {
            var75 = module0666.$ic95$;
        }
        return module0034.f1829(module0666.$g5253$.getGlobalValue(), (SubLObject)ConsesLow.list(var83, var75), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40506(final SubLObject var83, final SubLObject var75) {
        if (module0205.f13204(var83, (SubLObject)module0666.UNPROVIDED) == module0666.$ic94$ && module0666.NIL != module0260.f17091(module0205.f13132(var83), module0666.$ic97$, var75, (SubLObject)module0666.UNPROVIDED)) {
            return module0259.f16822(module0205.f13203(var83, (SubLObject)module0666.UNPROVIDED), var75, (SubLObject)module0666.UNPROVIDED);
        }
        if (module0205.f13204(var83, (SubLObject)module0666.UNPROVIDED) == module0666.$ic94$ && module0666.NIL != module0260.f17091(module0205.f13132(var83), module0666.$ic103$, var75, (SubLObject)module0666.UNPROVIDED)) {
            return module0256.f16525(module0205.f13203(var83, (SubLObject)module0666.UNPROVIDED), var75, (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40500(final SubLObject var83, SubLObject var75) {
        if (var75 == module0666.UNPROVIDED) {
            var75 = module0666.$ic95$;
        }
        SubLObject var84 = module0666.$g5253$.getGlobalValue();
        if (module0666.NIL == var84) {
            var84 = module0034.f1934((SubLObject)module0666.$ic102$, (SubLObject)module0666.$ic104$, (SubLObject)module0666.$ic99$, (SubLObject)module0666.EQUAL, (SubLObject)module0666.TWO_INTEGER, (SubLObject)module0666.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0666.$ic105$);
        }
        final SubLObject var85 = module0034.f1782(var83, var75);
        final SubLObject var86 = module0034.f1814(var84, var85, (SubLObject)module0666.UNPROVIDED);
        if (var86 != module0666.$ic101$) {
            SubLObject var87 = var86;
            SubLObject var88 = (SubLObject)module0666.NIL;
            var88 = var87.first();
            while (module0666.NIL != var87) {
                SubLObject var89 = var88.first();
                final SubLObject var90 = conses_high.second(var88);
                if (var83.equal(var89.first())) {
                    var89 = var89.rest();
                    if (module0666.NIL != var89 && module0666.NIL == var89.rest() && var75.equal(var89.first())) {
                        return module0034.f1959(var90);
                    }
                }
                var87 = var87.rest();
                var88 = var87.first();
            }
        }
        final SubLObject var91 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40506(var83, var75)));
        module0034.f1836(var84, var85, var86, var91, (SubLObject)ConsesLow.list(var83, var75));
        return module0034.f1959(var91);
    }
    
    public static SubLObject f40507() {
        final SubLObject var82 = module0666.$g5254$.getGlobalValue();
        if (module0666.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40508(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        return module0034.f1829(module0666.$g5254$.getGlobalValue(), (SubLObject)ConsesLow.list(var91, var92, var75), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40509(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        final SubLObject var93 = module0205.f13394(var91, var92, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var94 = (module0666.NIL != module0206.f13438(var93)) ? var93 : module0279.f18513(var91, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var95 = (module0666.NIL != module0206.f13438(var93)) ? var91 : module0205.f13252(var94, var93, var91, (SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
        return f40510(var95, var94, var75);
    }
    
    public static SubLObject f40496(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        SubLObject var93 = module0666.$g5254$.getGlobalValue();
        if (module0666.NIL == var93) {
            var93 = module0034.f1934((SubLObject)module0666.$ic106$, (SubLObject)module0666.$ic107$, (SubLObject)module0666.$ic99$, (SubLObject)module0666.EQUAL, (SubLObject)module0666.THREE_INTEGER, (SubLObject)module0666.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0666.$ic108$);
        }
        final SubLObject var94 = module0034.f1781(var91, var92, var75);
        final SubLObject var95 = module0034.f1814(var93, var94, (SubLObject)module0666.UNPROVIDED);
        if (var95 != module0666.$ic101$) {
            SubLObject var96 = var95;
            SubLObject var97 = (SubLObject)module0666.NIL;
            var97 = var96.first();
            while (module0666.NIL != var96) {
                SubLObject var98 = var97.first();
                final SubLObject var99 = conses_high.second(var97);
                if (var91.equal(var98.first())) {
                    var98 = var98.rest();
                    if (var92.equal(var98.first())) {
                        var98 = var98.rest();
                        if (module0666.NIL != var98 && module0666.NIL == var98.rest() && var75.equal(var98.first())) {
                            return module0034.f1959(var99);
                        }
                    }
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        final SubLObject var100 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40509(var91, var92, var75)));
        module0034.f1836(var93, var94, var95, var100, (SubLObject)ConsesLow.list(var91, var92, var75));
        return module0034.f1959(var100);
    }
    
    public static SubLObject f40511() {
        final SubLObject var82 = module0666.$g5255$.getGlobalValue();
        if (module0666.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40512(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        return module0034.f1829(module0666.$g5255$.getGlobalValue(), (SubLObject)ConsesLow.list(var95, var94, var75), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40513(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        final SubLObject var96 = module0307.f20803(var94, var95, var75, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var97 = module0307.f20810(var94, var95, var75, (SubLObject)module0666.UNPROVIDED);
        SubLObject var98 = (SubLObject)module0666.NIL;
        if (module0666.NIL != var96) {
            var98 = (SubLObject)ConsesLow.list((SubLObject)module0666.$ic110$, var96);
        }
        if (module0666.NIL != var97) {
            var98 = conses_high.putf(var98, (SubLObject)module0666.$ic111$, var97);
        }
        return var98;
    }
    
    public static SubLObject f40510(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        SubLObject var96 = module0666.$g5255$.getGlobalValue();
        if (module0666.NIL == var96) {
            var96 = module0034.f1934((SubLObject)module0666.$ic109$, (SubLObject)module0666.$ic112$, (SubLObject)module0666.$ic99$, (SubLObject)module0666.EQUAL, (SubLObject)module0666.THREE_INTEGER, (SubLObject)module0666.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0666.$ic113$);
        }
        final SubLObject var97 = module0034.f1781(var95, var94, var75);
        final SubLObject var98 = module0034.f1814(var96, var97, (SubLObject)module0666.UNPROVIDED);
        if (var98 != module0666.$ic101$) {
            SubLObject var99 = var98;
            SubLObject var100 = (SubLObject)module0666.NIL;
            var100 = var99.first();
            while (module0666.NIL != var99) {
                SubLObject var101 = var100.first();
                final SubLObject var102 = conses_high.second(var100);
                if (var95.equal(var101.first())) {
                    var101 = var101.rest();
                    if (var94.equal(var101.first())) {
                        var101 = var101.rest();
                        if (module0666.NIL != var101 && module0666.NIL == var101.rest() && var75.equal(var101.first())) {
                            return module0034.f1959(var102);
                        }
                    }
                }
                var99 = var99.rest();
                var100 = var99.first();
            }
        }
        final SubLObject var103 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40513(var95, var94, var75)));
        module0034.f1836(var96, var97, var98, var103, (SubLObject)ConsesLow.list(var95, var94, var75));
        return module0034.f1959(var103);
    }
    
    public static SubLObject f40498(final SubLObject var81) {
        final SubLObject var82 = conses_high.getf(var81, (SubLObject)module0666.$ic111$, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != module0035.f1995(var82, (SubLObject)module0666.ONE_INTEGER, (SubLObject)module0666.UNPROVIDED)) {
            return var82.first();
        }
        if (module0666.NIL != var82) {
            return module0202.f12720(module0666.$ic114$, (SubLObject)ConsesLow.list(module0202.f12720(module0666.$ic115$, var82, (SubLObject)module0666.UNPROVIDED)), (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40497(final SubLObject var81) {
        final SubLObject var82 = conses_high.getf(var81, (SubLObject)module0666.$ic110$, (SubLObject)module0666.UNPROVIDED);
        if (module0666.NIL != module0035.f1995(var82, (SubLObject)module0666.ONE_INTEGER, (SubLObject)module0666.UNPROVIDED)) {
            return var82.first();
        }
        if (module0666.NIL != var82) {
            return module0202.f12720(module0666.$ic114$, (SubLObject)ConsesLow.list(module0202.f12720(module0666.$ic115$, var82, (SubLObject)module0666.UNPROVIDED)), (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40495(final SubLObject var20) {
        final SubLObject var21 = module0642.f39104((SubLObject)module0666.$ic116$, var20);
        final SubLObject var22 = (SubLObject)((module0666.NIL != var21) ? reader.read_from_string_ignoring_errors(module0038.f2933(var21), (SubLObject)module0666.NIL, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED) : module0666.NIL);
        SubLObject var23 = f40514(var22);
        if (var23 == module0666.$ic117$) {
            var23 = (SubLObject)module0666.NIL;
        }
        return var23;
    }
    
    public static SubLObject f40514(final SubLObject var102) {
        return module0205.f13147(var102, (SubLObject)module0666.$ic118$, (SubLObject)module0666.$ic119$, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40515(final SubLObject var103) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var103.isSymbol() && module0666.NIL == Eval.constantp(var103, (SubLObject)module0666.UNPROVIDED) && module0666.NIL == module0206.f13438(var103));
    }
    
    public static SubLObject f40516(final SubLObject var104) {
        return Symbols.make_keyword(module0038.f2624(var104));
    }
    
    public static SubLObject f40517(final SubLObject var17, final SubLObject var63, final SubLObject var68, final SubLObject var69, final SubLObject var65, final SubLObject var64, final SubLObject var23, final SubLObject var105, SubLObject var106) {
        if (var106 == module0666.UNPROVIDED) {
            var106 = (SubLObject)module0666.NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0666.NIL != var64 && !module0666.areAssertionsDisabledFor(me) && module0666.NIL == Types.numberp(var64)) {
            throw new AssertionError(var64);
        }
        final SubLObject var108 = f40478(var17, var68, (SubLObject)module0666.NIL, (SubLObject)module0666.T, var23, var105);
        final SubLObject var109 = module0067.f4880((SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var110 = (SubLObject)module0666.NIL;
        final SubLObject var111 = (SubLObject)module0666.ZERO_INTEGER;
        SubLObject var112 = (SubLObject)module0666.NIL;
        final SubLObject var113 = (SubLObject)module0666.NIL;
        SubLObject var114 = (SubLObject)module0666.NIL;
        final SubLObject var116;
        final SubLObject var115 = var116 = module0034.f1888();
        final SubLObject var117 = module0034.$g879$.currentBinding(var107);
        try {
            module0034.$g879$.bind(var116, var107);
            SubLObject var118 = (SubLObject)module0666.NIL;
            if (module0666.NIL != var116 && module0666.NIL == module0034.f1842(var116)) {
                var118 = module0034.f1869(var116);
                final SubLObject var119 = Threads.current_process();
                if (module0666.NIL == var118) {
                    module0034.f1873(var116, var119);
                }
                else if (!var118.eql(var119)) {
                    Errors.error((SubLObject)module0666.$ic121$);
                }
            }
            try {
                final SubLObject var120 = module0139.$g1630$.getDynamicValue(var107);
                final SubLObject var12_118 = module0139.$g1631$.currentBinding(var107);
                final SubLObject var121 = module0139.$g1632$.currentBinding(var107);
                final SubLObject var122 = module0139.$g1630$.currentBinding(var107);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var120, (SubLObject)module0666.SIX_INTEGER), var107);
                    module0139.$g1632$.bind(module0139.f9016(var120), var107);
                    module0139.$g1630$.bind((SubLObject)module0666.T, var107);
                    final SubLObject var123 = module0003.f61();
                    try {
                        var107.throwStack.push(var123);
                        final SubLObject var12_119 = module0003.$g4$.currentBinding(var107);
                        try {
                            module0003.$g4$.bind((SubLObject)module0666.T, var107);
                            SubLObject var124 = (SubLObject)module0666.NIL;
                            try {
                                final SubLObject var12_120 = module0003.$g5$.currentBinding(var107);
                                try {
                                    module0003.$g5$.bind(Numbers.add((SubLObject)module0666.ONE_INTEGER, module0003.$g5$.getDynamicValue(var107)), var107);
                                    var124 = module0003.f62(var64, var123);
                                    if (module0666.NIL == var113) {
                                        SubLObject var125 = var108;
                                        SubLObject var126 = (SubLObject)module0666.NIL;
                                        var126 = var125.first();
                                        while (module0666.NIL == var113 && module0666.NIL != var125) {
                                            if (module0666.NIL != constant_handles_oc.f8449(var126)) {
                                                module0084.f5765(var109, var126, constants_high_oc.f10743(var126), (SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
                                            }
                                            var125 = var125.rest();
                                            var126 = var125.first();
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g5$.rebind(var12_120, var107);
                                }
                            }
                            finally {
                                final SubLObject var12_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0666.T, var107);
                                    module0003.f64(var124);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_121, var107);
                                }
                            }
                        }
                        finally {
                            module0003.$g4$.rebind(var12_119, var107);
                        }
                    }
                    catch (Throwable var127) {
                        var112 = Errors.handleThrowable(var127, var123);
                    }
                    finally {
                        var107.throwStack.pop();
                    }
                    final SubLObject var128 = module0084.f5780(var109);
                    SubLObject var130;
                    final SubLObject var129 = var130 = Sort.sort(var128, (SubLObject)module0666.$ic122$, (SubLObject)module0666.$ic123$);
                    SubLObject var131 = (SubLObject)module0666.NIL;
                    var131 = var130.first();
                    while (module0666.NIL != var130) {
                        SubLObject var133;
                        final SubLObject var132 = var133 = var131;
                        SubLObject var134 = (SubLObject)module0666.NIL;
                        SubLObject var135 = (SubLObject)module0666.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0666.$ic124$);
                        var134 = var133.first();
                        var133 = (var135 = var133.rest());
                        final SubLObject var136 = (SubLObject)module0666.NIL;
                        SubLObject var137 = (SubLObject)module0666.NIL;
                        if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic125$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(var134, var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic125$, var137);
                        }
                        if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic126$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(var135.first(), var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic126$, var137);
                        }
                        if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic127$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                            final SubLObject var138 = module0753.f47275(var134, var110, (SubLObject)module0666.ONE_INTEGER, (SubLObject)module0666.UNPROVIDED);
                            if (module0666.NIL != var138) {
                                var137 = (SubLObject)ConsesLow.cons(module0770.f49049(var138.first(), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED), var137);
                                var137 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic127$, var137);
                            }
                        }
                        if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic128$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(module0213.f13918(var134), var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic128$, var137);
                        }
                        var114 = (SubLObject)ConsesLow.cons(var137, var114);
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var122, var107);
                    module0139.$g1632$.rebind(var121, var107);
                    module0139.$g1631$.rebind(var12_118, var107);
                }
            }
            finally {
                final SubLObject var12_122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0666.T, var107);
                    if (module0666.NIL != var116 && module0666.NIL == var118) {
                        module0034.f1873(var116, (SubLObject)module0666.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_122, var107);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var117, var107);
        }
        return Sequences.nreverse(var114);
    }
    
    public static SubLObject f40494(final SubLObject var17, final SubLObject var63, final SubLObject var68, final SubLObject var69, final SubLObject var70, final SubLObject var71, final SubLObject var65, final SubLObject var64, final SubLObject var23, final SubLObject var105, SubLObject var106, SubLObject var75) {
        if (var106 == module0666.UNPROVIDED) {
            var106 = (SubLObject)module0666.NIL;
        }
        if (var75 == module0666.UNPROVIDED) {
            var75 = (SubLObject)module0666.$ic87$;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0666.NIL != var64 && !module0666.areAssertionsDisabledFor(me) && module0666.NIL == Types.numberp(var64)) {
            throw new AssertionError(var64);
        }
        final SubLObject var108 = module0038.f2684(var17, (SubLObject)module0666.$ic129$);
        final SubLObject var109 = module0038.f2674(var17, (SubLObject)module0666.$ic129$, Symbols.symbol_function((SubLObject)module0666.EQUAL));
        final SubLObject var110 = f40478(var109, module0666.$ic4$, (SubLObject)module0666.NIL, (SubLObject)module0666.T, var23, var105);
        final SubLObject var111 = module0067.f4880((SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var112 = (SubLObject)module0666.NIL;
        final SubLObject var113 = (SubLObject)module0666.ZERO_INTEGER;
        SubLObject var114 = (SubLObject)module0666.NIL;
        final SubLObject var115 = (SubLObject)module0666.NIL;
        final SubLObject var117;
        final SubLObject var116 = var117 = module0034.f1888();
        final SubLObject var118 = module0034.$g879$.currentBinding(var107);
        try {
            module0034.$g879$.bind(var117, var107);
            SubLObject var119 = (SubLObject)module0666.NIL;
            if (module0666.NIL != var117 && module0666.NIL == module0034.f1842(var117)) {
                var119 = module0034.f1869(var117);
                final SubLObject var120 = Threads.current_process();
                if (module0666.NIL == var119) {
                    module0034.f1873(var117, var120);
                }
                else if (!var119.eql(var120)) {
                    Errors.error((SubLObject)module0666.$ic121$);
                }
            }
            try {
                final SubLObject var121 = module0139.$g1630$.getDynamicValue(var107);
                final SubLObject var12_139 = module0139.$g1631$.currentBinding(var107);
                final SubLObject var122 = module0139.$g1632$.currentBinding(var107);
                final SubLObject var123 = module0139.$g1630$.currentBinding(var107);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var121, (SubLObject)module0666.SIX_INTEGER), var107);
                    module0139.$g1632$.bind(module0139.f9016(var121), var107);
                    module0139.$g1630$.bind((SubLObject)module0666.T, var107);
                    final SubLObject var124 = module0003.f61();
                    try {
                        var107.throwStack.push(var124);
                        final SubLObject var12_140 = module0003.$g4$.currentBinding(var107);
                        try {
                            module0003.$g4$.bind((SubLObject)module0666.T, var107);
                            SubLObject var125 = (SubLObject)module0666.NIL;
                            try {
                                final SubLObject var12_141 = module0003.$g5$.currentBinding(var107);
                                try {
                                    module0003.$g5$.bind(Numbers.add((SubLObject)module0666.ONE_INTEGER, module0003.$g5$.getDynamicValue(var107)), var107);
                                    var125 = module0003.f62(var64, var124);
                                    if (module0666.NIL == var115) {
                                        SubLObject var126 = var110;
                                        SubLObject var127 = (SubLObject)module0666.NIL;
                                        var127 = var126.first();
                                        while (module0666.NIL == var115 && module0666.NIL != var126) {
                                            if (module0666.NIL != constant_handles_oc.f8449(var127) && module0666.NIL != f40490(var127, var68, var69, var75) && module0666.NIL != f40491(var127, var70, var71, var75)) {
                                                module0084.f5765(var111, var127, constants_high_oc.f10743(var127), (SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
                                            }
                                            var126 = var126.rest();
                                            var127 = var126.first();
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g5$.rebind(var12_141, var107);
                                }
                            }
                            finally {
                                final SubLObject var12_142 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0666.T, var107);
                                    module0003.f64(var125);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_142, var107);
                                }
                            }
                        }
                        finally {
                            module0003.$g4$.rebind(var12_140, var107);
                        }
                    }
                    catch (Throwable var128) {
                        var114 = Errors.handleThrowable(var128, var124);
                    }
                    finally {
                        var107.throwStack.pop();
                    }
                    f40492(var111, var63, (SubLObject)module0666.UNPROVIDED);
                }
                finally {
                    module0139.$g1630$.rebind(var123, var107);
                    module0139.$g1632$.rebind(var122, var107);
                    module0139.$g1631$.rebind(var12_139, var107);
                }
            }
            finally {
                final SubLObject var12_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0666.T, var107);
                    if (module0666.NIL != var117 && module0666.NIL == var119) {
                        module0034.f1873(var117, (SubLObject)module0666.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_143, var107);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var118, var107);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40492(final SubLObject var144, SubLObject var63, SubLObject var108) {
        if (var63 == module0666.UNPROVIDED) {
            var63 = (SubLObject)module0666.$ic83$;
        }
        if (var108 == module0666.UNPROVIDED) {
            var108 = (SubLObject)module0666.$ic87$;
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        final SubLObject var146 = module0084.f5794(var144, (SubLObject)module0666.$ic122$);
        if (var108 == module0666.$ic87$) {
            var108 = module0067.f4902(var144);
        }
        module0601.f36755((SubLObject)module0666.$ic130$);
        module0601.f36746();
        final SubLObject var147 = (SubLObject)module0666.$ic131$;
        try {
            final SubLObject var148 = module0601.$g4652$.currentBinding(var145);
            final SubLObject var149 = module0601.$g4654$.currentBinding(var145);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var145), module0601.$g4652$.getDynamicValue(var145)), var145);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var145), var145);
                module0601.f36758((SubLObject)module0666.$ic132$, var147, (SubLObject)module0666.NIL, (SubLObject)module0666.T);
                SubLObject var150 = var146;
                SubLObject var151 = (SubLObject)module0666.NIL;
                var151 = var150.first();
                while (module0666.NIL != var150) {
                    SubLObject var153;
                    final SubLObject var152 = var153 = var151;
                    SubLObject var154 = (SubLObject)module0666.NIL;
                    SubLObject var155 = (SubLObject)module0666.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)module0666.$ic124$);
                    var154 = var153.first();
                    var153 = (var155 = var153.rest());
                    SubLObject var133_147 = (SubLObject)module0666.NIL;
                    if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic125$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic133$, (SubLObject)ConsesLow.cons(module0006.f204(module0205.f13144(var154)), var133_147));
                    }
                    if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic126$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic134$, (SubLObject)ConsesLow.cons(var155.first(), var133_147));
                    }
                    if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic127$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                        final SubLObject var156 = module0753.f47275(var154, var108, (SubLObject)module0666.ONE_INTEGER, (SubLObject)module0666.UNPROVIDED);
                        if (module0666.NIL != var156) {
                            var133_147 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic135$, (SubLObject)ConsesLow.cons(module0770.f49049(var156.first(), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED), var133_147));
                        }
                    }
                    if (module0666.NIL != module0004.f104((SubLObject)module0666.$ic128$, var63, (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)module0666.$ic136$, (SubLObject)ConsesLow.cons(module0213.f13918(var154), var133_147));
                    }
                    final SubLObject var12_148 = module0601.$g4652$.currentBinding(var145);
                    final SubLObject var27_149 = module0601.$g4654$.currentBinding(var145);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var145), module0601.$g4652$.getDynamicValue(var145)), var145);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var145), var145);
                        module0601.f36758((SubLObject)module0666.$ic137$, var133_147, (SubLObject)module0666.T, (SubLObject)module0666.NIL);
                    }
                    finally {
                        module0601.$g4654$.rebind(var27_149, var145);
                        module0601.$g4652$.rebind(var12_148, var145);
                    }
                    module0601.f36746();
                    var150 = var150.rest();
                    var151 = var150.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var149, var145);
                module0601.$g4652$.rebind(var148, var145);
            }
        }
        finally {
            final SubLObject var157 = Threads.$is_thread_performing_cleanupP$.currentBinding(var145);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0666.T, var145);
                module0601.f36746();
                module0601.f36760((SubLObject)module0666.$ic132$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var157, var145);
            }
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40518() {
        final SubLObject var82 = module0666.$g5256$.getGlobalValue();
        if (module0666.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40519(final SubLObject var74, final SubLObject var70, final SubLObject var71, final SubLObject var75) {
        return module0034.f1829(module0666.$g5256$.getGlobalValue(), (SubLObject)ConsesLow.list(var74, var70, var71, var75), (SubLObject)module0666.UNPROVIDED, (SubLObject)module0666.UNPROVIDED);
    }
    
    public static SubLObject f40520(final SubLObject var74, final SubLObject var70, final SubLObject var71, SubLObject var75) {
        if (var75 == module0666.$ic87$) {
            var75 = module0666.$ic93$;
        }
        SubLObject var76 = var70;
        SubLObject var77 = (SubLObject)module0666.NIL;
        var77 = var76.first();
        while (module0666.NIL != var76) {
            if (module0666.NIL != module0259.f16867(var74, var77, var75, (SubLObject)module0666.UNPROVIDED)) {
                return (SubLObject)module0666.NIL;
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        var76 = var71;
        SubLObject var78 = (SubLObject)module0666.NIL;
        var78 = var76.first();
        while (module0666.NIL != var76) {
            var76 = var76.rest();
            var78 = var76.first();
        }
        return (SubLObject)module0666.T;
    }
    
    public static SubLObject f40491(final SubLObject var74, final SubLObject var70, final SubLObject var71, final SubLObject var75) {
        SubLObject var76 = module0666.$g5256$.getGlobalValue();
        if (module0666.NIL == var76) {
            var76 = module0034.f1934((SubLObject)module0666.$ic138$, (SubLObject)module0666.$ic139$, (SubLObject)module0666.NIL, (SubLObject)module0666.EQUALP, (SubLObject)module0666.FOUR_INTEGER, (SubLObject)module0666.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0666.$ic140$);
        }
        final SubLObject var77 = module0034.f1780(var74, var70, var71, var75);
        final SubLObject var78 = module0034.f1814(var76, var77, (SubLObject)module0666.UNPROVIDED);
        if (var78 != module0666.$ic101$) {
            SubLObject var79 = var78;
            SubLObject var80 = (SubLObject)module0666.NIL;
            var80 = var79.first();
            while (module0666.NIL != var79) {
                SubLObject var81 = var80.first();
                final SubLObject var82 = conses_high.second(var80);
                if (var74.equalp(var81.first())) {
                    var81 = var81.rest();
                    if (var70.equalp(var81.first())) {
                        var81 = var81.rest();
                        if (var71.equalp(var81.first())) {
                            var81 = var81.rest();
                            if (module0666.NIL != var81 && module0666.NIL == var81.rest() && var75.equalp(var81.first())) {
                                return module0034.f1959(var82);
                            }
                        }
                    }
                }
                var79 = var79.rest();
                var80 = var79.first();
            }
        }
        final SubLObject var83 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40520(var74, var70, var71, var75)));
        module0034.f1836(var76, var77, var78, var83, (SubLObject)ConsesLow.list(var74, var70, var71, var75));
        return module0034.f1959(var83);
    }
    
    public static SubLObject f40490(final SubLObject var74, final SubLObject var68, final SubLObject var69, SubLObject var75) {
        if (var75 == module0666.$ic87$) {
            var75 = module0666.$ic92$;
        }
        final SubLObject var76 = f40521(var68);
        SubLObject var77 = (SubLObject)module0666.NIL;
        if (module0666.NIL == var77) {
            SubLObject var78;
            SubLObject var79;
            for (var78 = var76, var79 = (SubLObject)module0666.NIL, var79 = var78.first(); module0666.NIL == var77 && module0666.NIL != var78; var77 = (SubLObject)SubLObjectFactory.makeBoolean(module0666.NIL == f40522(var74, var79, var75)), var78 = var78.rest(), var79 = var78.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0666.NIL == var77 && module0666.NIL != f40523(var74, var69, var75));
    }
    
    public static SubLObject f40523(final SubLObject var74, final SubLObject var69, final SubLObject var75) {
        final SubLObject var76 = f40521(var69);
        SubLObject var77 = (SubLObject)module0666.NIL;
        if (module0666.NIL == var77) {
            SubLObject var78;
            SubLObject var79;
            for (var78 = var76, var79 = (SubLObject)module0666.NIL, var79 = var78.first(); module0666.NIL == var77 && module0666.NIL != var78; var77 = (SubLObject)SubLObjectFactory.makeBoolean(module0666.NIL == f40524(var74, var79, var75)), var78 = var78.rest(), var79 = var78.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0666.NIL == var77);
    }
    
    public static SubLObject f40521(final SubLObject var21) {
        if (module0205.f13132(var21).equal(module0666.$ic114$)) {
            return module0205.f13207(module0205.f13203(var21, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.UNPROVIDED);
        }
        return (SubLObject)((module0666.NIL != var21) ? ConsesLow.list(var21) : module0666.NIL);
    }
    
    public static SubLObject f40525() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0666.NIL;
        final SubLObject var9 = module0666.$g5257$.getGlobalValue();
        SubLObject var10 = (SubLObject)module0666.NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = module0089.f6102(module0666.$g5259$.getDynamicValue(var7));
            module0089.f6092(module0666.$g5259$.getDynamicValue(var7));
        }
        finally {
            if (module0666.NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)module0666.NIL;
        var12 = var11.first();
        while (module0666.NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)module0666.NIL;
            SubLObject var16 = (SubLObject)module0666.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0666.$ic144$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0666.$ic144$);
            var16 = var14.first();
            var14 = var14.rest();
            if (module0666.NIL != var14) {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0666.$ic144$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40526() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0666.NIL;
        final SubLObject var9 = module0666.$g5258$.getGlobalValue();
        SubLObject var10 = (SubLObject)module0666.NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = module0089.f6102(module0666.$g5260$.getDynamicValue(var7));
            module0089.f6092(module0666.$g5260$.getDynamicValue(var7));
        }
        finally {
            if (module0666.NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)module0666.NIL;
        var12 = var11.first();
        while (module0666.NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)module0666.NIL;
            SubLObject var16 = (SubLObject)module0666.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0666.$ic144$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0666.$ic144$);
            var16 = var14.first();
            var14 = var14.rest();
            if (module0666.NIL != var14) {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0666.$ic144$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40527(final SubLObject var74, final SubLObject var154, final SubLObject var75) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (module0666.NIL != module0172.f10917(var74)) {
            return Values.values((SubLObject)module0666.NIL, (SubLObject)module0666.NIL);
        }
        SubLObject var156 = (SubLObject)module0666.NIL;
        SubLObject var157 = (SubLObject)module0666.NIL;
        SubLObject var158 = (SubLObject)module0666.NIL;
        final SubLObject var159 = module0666.$g5257$.getGlobalValue();
        SubLObject var160 = (SubLObject)module0666.NIL;
        try {
            var160 = Locks.seize_lock(var159);
            var155.resetMultipleValues();
            final SubLObject var173_174 = module0089.f6077(module0666.$g5259$.getDynamicValue(var155), (SubLObject)ConsesLow.list(var154, var75));
            final SubLObject var175_176 = var155.secondMultipleValue();
            var155.resetMultipleValues();
            var157 = var173_174;
            var158 = var175_176;
        }
        finally {
            if (module0666.NIL != var160) {
                Locks.release_lock(var159);
            }
        }
        if (module0666.NIL != var158) {
            var156 = module0077.f5320(var74, var157);
        }
        return Values.values(var156, var158);
    }
    
    public static SubLObject f40528(final SubLObject var74, final SubLObject var156, final SubLObject var75) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        if (module0666.NIL != module0172.f10917(var74)) {
            return Values.values((SubLObject)module0666.NIL, (SubLObject)module0666.NIL);
        }
        SubLObject var158 = (SubLObject)module0666.NIL;
        SubLObject var159 = (SubLObject)module0666.NIL;
        SubLObject var160 = (SubLObject)module0666.NIL;
        final SubLObject var161 = module0666.$g5258$.getGlobalValue();
        SubLObject var162 = (SubLObject)module0666.NIL;
        try {
            var162 = Locks.seize_lock(var161);
            var157.resetMultipleValues();
            final SubLObject var181_182 = module0089.f6077(module0666.$g5260$.getDynamicValue(var157), (SubLObject)ConsesLow.list(var156, var75));
            final SubLObject var183_184 = var157.secondMultipleValue();
            var157.resetMultipleValues();
            var159 = var181_182;
            var160 = var183_184;
        }
        finally {
            if (module0666.NIL != var162) {
                Locks.release_lock(var161);
            }
        }
        if (module0666.NIL != var160) {
            var158 = module0077.f5320(var74, var159);
        }
        return Values.values(var158, var160);
    }
    
    public static SubLObject f40522(final SubLObject var74, final SubLObject var154, final SubLObject var75) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        var155.resetMultipleValues();
        final SubLObject var156 = f40527(var74, var154, var75);
        final SubLObject var157 = var155.secondMultipleValue();
        var155.resetMultipleValues();
        if (module0666.NIL != var157) {
            return var156;
        }
        if (var154.eql(module0666.$ic4$)) {
            return (SubLObject)module0666.T;
        }
        if (var154.eql(module0666.$ic147$)) {
            return module0269.f17698(var74, var154, var75);
        }
        if (module0666.NIL != module0172.f10917(var74)) {
            return module0259.f16854(var74, var154, var75, (SubLObject)module0666.UNPROVIDED);
        }
        if (module0666.NIL == module0549.f33910(var154, module0666.$ic148$)) {
            f40529(var154, var75);
            return module0259.f16854(var74, var154, var75, (SubLObject)module0666.UNPROVIDED);
        }
        f40530(var154, var75);
        return f40527(var74, var154, var75);
    }
    
    public static SubLObject f40524(final SubLObject var74, final SubLObject var156, final SubLObject var75) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        var157.resetMultipleValues();
        final SubLObject var158 = f40528(var74, var156, var75);
        final SubLObject var159 = var157.secondMultipleValue();
        var157.resetMultipleValues();
        if (module0666.NIL != var159) {
            return var158;
        }
        if (module0666.NIL != module0172.f10917(var74)) {
            return module0256.f16596(var74, var156, var75, (SubLObject)module0666.UNPROVIDED);
        }
        if (var156.eql(module0666.$ic4$)) {
            return module0269.f17698(var74, module0666.$ic147$, var75);
        }
        if (module0666.NIL == module0549.f33910(var156, module0666.$ic148$)) {
            f40531(var156, var75);
            return module0256.f16596(var74, var156, var75, (SubLObject)module0666.UNPROVIDED);
        }
        f40532(var156, var75);
        return f40528(var74, var156, var75);
    }
    
    public static SubLObject f40529(final SubLObject var163, final SubLObject var75) {
        return module0575.f35270((SubLObject)ConsesLow.list((SubLObject)module0666.$ic149$, (SubLObject)ConsesLow.list((SubLObject)module0666.$ic150$, (SubLObject)ConsesLow.list((SubLObject)module0666.$ic151$, var163, var75))));
    }
    
    public static SubLObject f40531(final SubLObject var163, final SubLObject var75) {
        return module0538.f33463((SubLObject)ConsesLow.list((SubLObject)module0666.$ic152$, var163, var75));
    }
    
    public static SubLObject f40530(final SubLObject var163, final SubLObject var75) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)module0666.NIL;
        final SubLObject var166 = (SubLObject)ConsesLow.list(var163, var75);
        final SubLObject var167 = module0666.$g5257$.getGlobalValue();
        SubLObject var168 = (SubLObject)module0666.NIL;
        try {
            var168 = Locks.seize_lock(var167);
            if (module0666.NIL != module0089.f6077(module0666.$g5259$.getDynamicValue(var164), var166)) {
                var165 = (SubLObject)module0666.T;
            }
        }
        finally {
            if (module0666.NIL != var168) {
                Locks.release_lock(var167);
            }
        }
        if (module0666.NIL == var165) {
            final SubLObject var169 = module0078.f5367(module0259.f16846(var163, var75, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
            final SubLObject var189_190 = module0666.$g5257$.getGlobalValue();
            SubLObject var191_192 = (SubLObject)module0666.NIL;
            try {
                var191_192 = Locks.seize_lock(var189_190);
                module0089.f6082(module0666.$g5259$.getDynamicValue(var164), var166, var169);
            }
            finally {
                if (module0666.NIL != var191_192) {
                    Locks.release_lock(var189_190);
                }
            }
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40532(final SubLObject var163, final SubLObject var75) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)module0666.NIL;
        final SubLObject var166 = (SubLObject)ConsesLow.list(var163, var75);
        final SubLObject var167 = random.random((SubLObject)module0666.$ic153$);
        final SubLObject var168 = module0666.$g5258$.getGlobalValue();
        SubLObject var169 = (SubLObject)module0666.NIL;
        try {
            var169 = Locks.seize_lock(var168);
            var164.resetMultipleValues();
            final SubLObject var170 = module0089.f6077(module0666.$g5260$.getDynamicValue(var164), var166);
            final SubLObject var171 = var164.secondMultipleValue();
            var164.resetMultipleValues();
            if (module0666.NIL != var171) {
                var165 = (SubLObject)module0666.T;
            }
        }
        finally {
            if (module0666.NIL != var169) {
                Locks.release_lock(var168);
            }
        }
        if (module0666.NIL == var165) {
            final SubLObject var172 = module0078.f5367(module0256.f16552(var163, var75, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.EQUAL, (SubLObject)module0666.UNPROVIDED);
            final SubLObject var197_198 = module0666.$g5258$.getGlobalValue();
            SubLObject var199_200 = (SubLObject)module0666.NIL;
            try {
                var199_200 = Locks.seize_lock(var197_198);
                module0089.f6082(module0666.$g5260$.getDynamicValue(var164), var166, var172);
            }
            finally {
                if (module0666.NIL != var199_200) {
                    Locks.release_lock(var197_198);
                }
            }
        }
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40533(final SubLObject var201, final SubLObject var202, SubLObject var75, SubLObject var203) {
        if (var75 == module0666.UNPROVIDED) {
            var75 = (SubLObject)module0666.NIL;
        }
        if (var203 == module0666.UNPROVIDED) {
            var203 = (SubLObject)module0666.NIL;
        }
        if (module0666.NIL != module0228.f15225(var202) && module0205.f13136(var202).equal(module0666.$ic114$)) {
            SubLObject var205;
            final SubLObject var204 = var205 = module0205.f13207(module0205.f13203(var202, (SubLObject)module0666.UNPROVIDED), (SubLObject)module0666.UNPROVIDED);
            SubLObject var206 = (SubLObject)module0666.NIL;
            var206 = var205.first();
            while (module0666.NIL != var205) {
                if (module0666.NIL == f40533(var201, var206, var75, var203)) {
                    return (SubLObject)module0666.NIL;
                }
                var205 = var205.rest();
                var206 = var205.first();
            }
            if (module0666.NIL != var204) {
                return (SubLObject)module0666.T;
            }
        }
        return module0256.f16596(var201, var202, var75, var203);
    }
    
    public static SubLObject f40534(final SubLObject var206, final SubLObject var207) {
        return Numbers.numG(module0217.f14357(var206), module0217.f14357(var207));
    }
    
    public static SubLObject f40535() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = module0014.f657((SubLObject)module0666.$ic154$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        SubLObject var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)module0666.$ic155$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)module0666.$ic156$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)module0666.$ic157$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)module0666.$ic158$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020((SubLObject)module0666.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var7);
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40536(final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var17);
            PrintLow.format(module0015.$g131$.getDynamicValue(var17), module0666.$g5261$.getGlobalValue(), new SubLObject[] { var15, var16, (module0666.NIL != module0666.$g5238$.getDynamicValue(var17)) ? module0666.$ic6$ : module0666.$ic7$ });
            module0642.f39028((SubLObject)module0666.UNPROVIDED);
            module0642.f39020(module0666.$g5262$.getGlobalValue());
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var18, var17);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40537(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)module0666.T, var19);
            module0642.f39019(module0666.$g5263$.getGlobalValue());
            final SubLObject var12_208 = module0642.$g4971$.currentBinding(var19);
            try {
                module0642.$g4971$.bind((SubLObject)module0666.NIL, var19);
                module0642.f39044(var18);
            }
            finally {
                module0642.$g4971$.rebind(var12_208, var19);
            }
            module0642.f39019(module0666.$g5264$.getGlobalValue());
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40538(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)module0666.$ic27$, var20);
        final SubLObject var23 = module0642.f39104((SubLObject)module0666.$ic28$, var20);
        final SubLObject var24 = module0038.f2824(module0642.f39104((SubLObject)module0666.$ic163$, var20));
        var21.resetMultipleValues();
        final SubLObject var25 = module0038.f2933(var24);
        final SubLObject var26 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        var21.resetMultipleValues();
        final SubLObject var27 = module0038.f2934(var25, (SubLObject)module0666.UNPROVIDED);
        final SubLObject var28 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        module0642.f39020((SubLObject)module0666.$ic44$);
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0666.$ic14$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        f40536(var22, var23);
        f40537(var25);
        f40473((SubLObject)module0666.$ic164$);
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        final SubLObject var29 = module0015.$g535$.currentBinding(var21);
        try {
            module0015.$g535$.bind((SubLObject)module0666.T, var21);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
            final SubLObject var12_213 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)module0666.T, var21);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var21));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                final SubLObject var12_214 = module0015.$g533$.currentBinding(var21);
                final SubLObject var30 = module0015.$g541$.currentBinding(var21);
                final SubLObject var31 = module0015.$g539$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)module0666.T, var21);
                    module0015.$g541$.bind((SubLObject)module0666.T, var21);
                    module0015.$g539$.bind(module0015.f797(), var21);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0666.$ic14$);
                    module0642.f39032((SubLObject)module0666.TWO_INTEGER);
                    module0644.f39178((SubLObject)module0666.UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0666.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0666.$ic65$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39019(Environment.get_machine_name((SubLObject)module0666.UNPROVIDED));
                    if (module0666.NIL != var28) {
                        module0642.f39026((SubLObject)module0666.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        final SubLObject var32 = (SubLObject)module0666.$ic50$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0666.NIL != var32) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var32));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0666.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0666.UNPROVIDED);
                        final SubLObject var12_215 = module0015.$g533$.currentBinding(var21);
                        try {
                            module0015.$g533$.bind((SubLObject)module0666.T, var21);
                            module0642.f39019((SubLObject)module0666.$ic165$);
                        }
                        finally {
                            module0015.$g533$.rebind(var12_215, var21);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var33 = var28;
                        SubLObject var34 = (SubLObject)module0666.NIL;
                        var34 = var33.first();
                        while (module0666.NIL != var33) {
                            module0642.f39026((SubLObject)module0666.UNPROVIDED);
                            module0642.f39032((SubLObject)module0666.TWO_INTEGER);
                            module0642.f39019(var34);
                            var33 = var33.rest();
                            var34 = var33.first();
                        }
                    }
                    module0642.f39026((SubLObject)module0666.UNPROVIDED);
                    if (module0666.NIL != var26) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0666.$ic166$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var33 = var26;
                        SubLObject var35 = (SubLObject)module0666.NIL;
                        var35 = var33.first();
                        while (module0666.NIL != var33) {
                            module0642.f39026((SubLObject)module0666.UNPROVIDED);
                            module0642.f39032((SubLObject)module0666.TWO_INTEGER);
                            module0642.f39019(var35);
                            var33 = var33.rest();
                            var35 = var33.first();
                        }
                    }
                    else {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0666.$ic167$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    module0015.f799(module0015.$g539$.getDynamicValue(var21));
                }
                finally {
                    module0015.$g539$.rebind(var31, var21);
                    module0015.$g541$.rebind(var30, var21);
                    module0015.$g533$.rebind(var12_214, var21);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0666.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var12_213, var21);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0666.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var29, var21);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0666.UNPROVIDED);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40539() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40467", "S#43990", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40468", "S#44569", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40470", "S#43992", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40469", "S#1753", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40471", "S#1533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40472", "S#44570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40473", "S#44571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40474", "S#44572", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40475", "S#44573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40476", "S#44574", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40477", "CB-COMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40478", "S#44575", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40480", "S#44576", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40485", "S#44577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40479", "S#44578", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40481", "S#44579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40482", "S#44580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40483", "S#44581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40484", "S#44582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40486", "S#1635", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40487", "S#1651", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40488", "XML-TERM-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40493", "XML-COMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40489", "S#44583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40501", "S#44584", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40502", "S#44585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40503", "S#44586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40499", "S#44587", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40504", "S#44588", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40505", "S#44589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40506", "S#44590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40500", "S#44591", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40507", "S#44592", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40508", "S#44593", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40509", "S#44594", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40496", "S#44595", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40511", "S#44596", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40512", "S#44597", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40513", "S#44598", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40510", "S#44599", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40498", "S#44600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40497", "S#44601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40495", "S#44602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40514", "S#44603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40515", "S#44604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40516", "S#44605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40517", "S#44606", 8, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40494", "S#44607", 10, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40492", "S#44608", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40518", "S#44609", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40519", "S#44610", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40520", "S#44611", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40491", "S#44612", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40490", "S#44613", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40523", "S#44614", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40521", "S#44615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40525", "S#44616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40526", "S#44617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40527", "S#44618", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40528", "S#44619", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40522", "S#44620", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40524", "S#44621", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40529", "S#44622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40531", "S#44623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40530", "S#44624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40532", "S#44625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40533", "S#44626", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40534", "S#44627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40535", "S#1652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40536", "S#44628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40537", "S#44629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0666", "f40538", "CB-CYCLIFY", 1, 0, false);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40540() {
        module0666.$g5237$ = SubLFiles.defparameter("S#44630", (SubLObject)module0666.T);
        module0666.$g5238$ = SubLFiles.defparameter("S#44631", (SubLObject)module0666.NIL);
        module0666.$g5239$ = SubLFiles.defparameter("S#44632", (SubLObject)module0666.$ic0$);
        module0666.$g5240$ = SubLFiles.deflexical("S#44633", (SubLObject)module0666.$ic1$);
        module0666.$g5241$ = SubLFiles.deflexical("S#44634", (SubLObject)module0666.$ic13$);
        module0666.$g5242$ = SubLFiles.deflexical("S#44635", (SubLObject)module0666.$ic16$);
        module0666.$g5243$ = SubLFiles.deflexical("S#44636", (SubLObject)module0666.$ic21$);
        module0666.$g5244$ = SubLFiles.deflexical("S#44637", (SubLObject)module0666.$ic22$);
        module0666.$g5245$ = SubLFiles.deflexical("S#44638", (SubLObject)module0666.$ic23$);
        module0666.$g5246$ = SubLFiles.deflexical("S#44639", (SubLObject)module0666.$ic24$);
        module0666.$g5247$ = SubLFiles.defparameter("S#44640", (SubLObject)module0666.$ic25$);
        module0666.$g5248$ = SubLFiles.defparameter("S#44641", (SubLObject)module0666.$ic26$);
        module0666.$g5249$ = SubLFiles.deflexical("S#44642", (SubLObject)module0666.$ic68$);
        module0666.$g5250$ = SubLFiles.defparameter("S#44643", (SubLObject)module0666.$ic70$);
        module0666.$g5251$ = SubLFiles.defparameter("S#44644", (SubLObject)module0666.$ic38$);
        module0666.$g5252$ = SubLFiles.deflexical("S#44645", (SubLObject)module0666.NIL);
        module0666.$g5253$ = SubLFiles.deflexical("S#44646", (SubLObject)module0666.NIL);
        module0666.$g5254$ = SubLFiles.deflexical("S#44647", (SubLObject)module0666.NIL);
        module0666.$g5255$ = SubLFiles.deflexical("S#44648", (SubLObject)module0666.NIL);
        module0666.$g5256$ = SubLFiles.deflexical("S#44649", (SubLObject)module0666.NIL);
        module0666.$g5257$ = SubLFiles.deflexical("S#44650", Locks.make_lock((SubLObject)module0666.$ic141$));
        module0666.$g5258$ = SubLFiles.deflexical("S#44651", Locks.make_lock((SubLObject)module0666.$ic142$));
        module0666.$g5259$ = SubLFiles.defparameter("S#44652", module0089.f6070((SubLObject)module0666.$ic143$, (SubLObject)module0666.EQUAL));
        module0666.$g5260$ = SubLFiles.defparameter("S#44653", module0089.f6070((SubLObject)module0666.$ic143$, (SubLObject)module0666.EQUAL));
        module0666.$g5261$ = SubLFiles.deflexical("S#44654", (SubLObject)module0666.$ic159$);
        module0666.$g5262$ = SubLFiles.deflexical("S#44655", (SubLObject)module0666.$ic160$);
        module0666.$g5263$ = SubLFiles.deflexical("S#44656", (SubLObject)module0666.$ic161$);
        module0666.$g5264$ = SubLFiles.deflexical("S#44657", (SubLObject)module0666.$ic162$);
        return (SubLObject)module0666.NIL;
    }
    
    public static SubLObject f40541() {
        Hashtables.sethash((SubLObject)module0666.$ic17$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0666.$ic18$, (SubLObject)module0666.NIL));
        module0015.f873((SubLObject)module0666.$ic35$);
        module0002.f50((SubLObject)module0666.$ic71$, (SubLObject)module0666.$ic72$);
        module0002.f38((SubLObject)module0666.$ic78$);
        module0015.f877((SubLObject)module0666.$ic78$, (SubLObject)module0666.$ic79$);
        module0015.f873((SubLObject)module0666.$ic78$);
        module0002.f38((SubLObject)module0666.$ic89$);
        module0015.f877((SubLObject)module0666.$ic89$, (SubLObject)module0666.$ic79$);
        module0015.f873((SubLObject)module0666.$ic89$);
        module0034.f1909((SubLObject)module0666.$ic96$);
        module0034.f1909((SubLObject)module0666.$ic102$);
        module0034.f1909((SubLObject)module0666.$ic106$);
        module0034.f1909((SubLObject)module0666.$ic109$);
        module0034.f1909((SubLObject)module0666.$ic138$);
        module0034.f1949((SubLObject)module0666.$ic145$);
        module0034.f1953((SubLObject)module0666.$ic146$);
        module0015.f873((SubLObject)module0666.$ic168$);
        return (SubLObject)module0666.NIL;
    }
    
    public void declareFunctions() {
        f40539();
    }
    
    public void initializeVariables() {
        f40540();
    }
    
    public void runTopLevelForms() {
        f40541();
    }
    
    static {
        me = (SubLFile)new module0666();
        module0666.$g5237$ = null;
        module0666.$g5238$ = null;
        module0666.$g5239$ = null;
        module0666.$g5240$ = null;
        module0666.$g5241$ = null;
        module0666.$g5242$ = null;
        module0666.$g5243$ = null;
        module0666.$g5244$ = null;
        module0666.$g5245$ = null;
        module0666.$g5246$ = null;
        module0666.$g5247$ = null;
        module0666.$g5248$ = null;
        module0666.$g5249$ = null;
        module0666.$g5250$ = null;
        module0666.$g5251$ = null;
        module0666.$g5252$ = null;
        module0666.$g5253$ = null;
        module0666.$g5254$ = null;
        module0666.$g5255$ = null;
        module0666.$g5256$ = null;
        module0666.$g5257$ = null;
        module0666.$g5258$ = null;
        module0666.$g5259$ = null;
        module0666.$g5260$ = null;
        module0666.$g5261$ = null;
        module0666.$g5262$ = null;
        module0666.$g5263$ = null;
        module0666.$g5264$ = null;
        $ic0$ = SubLObjectFactory.makeString("completions");
        $ic1$ = SubLObjectFactory.makeString("onClick=\"constant_complete('~A', ~A, '~A', ~A, ~A);\"");
        $ic2$ = SubLObjectFactory.makeString("Complete");
        $ic3$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic5$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic6$ = SubLObjectFactory.makeString("true");
        $ic7$ = SubLObjectFactory.makeString("false");
        $ic8$ = SubLObjectFactory.makeString("constant_complete('");
        $ic9$ = SubLObjectFactory.makeString("', ");
        $ic10$ = SubLObjectFactory.makeString(", '");
        $ic11$ = SubLObjectFactory.makeString(", ");
        $ic12$ = SubLObjectFactory.makeString(");");
        $ic13$ = SubLObjectFactory.makeString("onClick=\"cyclify('~A');\"");
        $ic14$ = SubLObjectFactory.makeString("Cyclify");
        $ic15$ = SubLObjectFactory.makeString("javascript:void('')");
        $ic16$ = SubLObjectFactory.makeString("\nvar cgi_program = '~A';\nvar completion_frame_name = '~A';\n");
        $ic17$ = SubLObjectFactory.makeKeyword("CONSTANT-COMPLETION");
        $ic18$ = SubLObjectFactory.makeString("constant-completion.js");
        $ic19$ = SubLObjectFactory.makeString("");
        $ic20$ = SubLObjectFactory.makeString("text/javascript");
        $ic21$ = SubLObjectFactory.makeString("\nif (window.focus) window.focus();");
        $ic22$ = SubLObjectFactory.makeString("\nif (window.opener) window.opener.status = '~A';\n");
        $ic23$ = SubLObjectFactory.makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar prefix = '~A';\nvar close_window = ~A;\n");
        $ic24$ = SubLObjectFactory.makeString("\nvar old_length = -1;\n\nfunction complete_error(message) {\n  document.open();\n  document.writeln('Error ' + message);\n  document.writeln('Completion links only apply to the page which originally generated them.<p>');\n  document.writeln('That page is no longer available.');\n  document.close();\n  return false;\n}\n\nfunction complete_insert(full_string, submit, chosen) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return complete_error(1);\n  if (!window.opener.document) \n    return complete_error(2);\n  if (!window.opener.document.forms) \n    return complete_error(3);\n  if (!window.opener.document.forms.length) \n    return complete_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return complete_error(5);\n  \n  if (window.opener.focus && chosen) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return complete_error(6);\n  if (!form.elements.length) \n    return complete_error(7);\n  if (form.elements.length < element_number) \n    return complete_error(8);\n\n  var element = form.elements[element_number];\n\n  // @todo remove this\n  //if (!element.value) \n  //  return complete_error(9);\n\n  var old_value = element.value;\n  if (old_length < 0) old_length = old_value.length;\n\n  // now actually do the completion\n  var prefix_length = prefix.length;\n  var full_length = full_string.length;\n  var completion = full_string.substring(prefix_length, full_length);\n  var preamble = old_value.substring(0, (old_length - prefix_length));\n  element.value = preamble + full_string;\n  // if (element.focus) element.focus();\n\n  // submit the form if we are supposed to\n  if (submit)\n    form.submit();\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\nfunction complete_extend(full_string) {\n  return complete_insert(full_string, false, false);\n}\n\nfunction complete_choose(full_string, submit) {\n  return complete_insert(full_string, submit, true);\n}");
        $ic25$ = SubLObjectFactory.makeString("\ncomplete_extend('~A');\n");
        $ic26$ = SubLObjectFactory.makeString("\ncomplete_choose('~A', ~A);\n");
        $ic27$ = SubLObjectFactory.makeString("form");
        $ic28$ = SubLObjectFactory.makeString("input");
        $ic29$ = SubLObjectFactory.makeString("prefix");
        $ic30$ = SubLObjectFactory.makeString("submit");
        $ic31$ = SubLObjectFactory.makeString("filter");
        $ic32$ = SubLObjectFactory.makeString("choices");
        $ic33$ = SubLObjectFactory.makeString("case-insensitive");
        $ic34$ = SubLObjectFactory.makeString("lexical");
        $ic35$ = SubLObjectFactory.makeSymbol("CB-COMPLETE");
        $ic36$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic38$ = SubLObjectFactory.makeInteger(50);
        $ic39$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic40$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic41$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $ic42$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic43$ = SubLObjectFactory.makeSymbol("S#44577", "CYC");
        $ic44$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic45$ = SubLObjectFactory.makeString("Exact match plus one longer completion.");
        $ic46$ = SubLObjectFactory.makeString("Exact match plus ~S longer completions.");
        $ic47$ = SubLObjectFactory.makeString("~S possible ~A.");
        $ic48$ = SubLObjectFactory.makeString("suggestions");
        $ic49$ = SubLObjectFactory.makeString("Extension: ");
        $ic50$ = SubLObjectFactory.makeKeyword("RED");
        $ic51$ = SubLObjectFactory.makeString(" Suggestions:");
        $ic52$ = SubLObjectFactory.makeString(" Completions:");
        $ic53$ = SubLObjectFactory.makeString("Constants (~A):");
        $ic54$ = SubLObjectFactory.makeString("Lexical Strings (~A):");
        $ic55$ = SubLObjectFactory.makeString("Sole completion (already completed).");
        $ic56$ = SubLObjectFactory.makeString("Sole completion.");
        $ic57$ = SubLObjectFactory.makeString("Already completed.");
        $ic58$ = SubLObjectFactory.makeString("Sole completion:");
        $ic59$ = SubLObjectFactory.makeString("No completions.");
        $ic60$ = SubLObjectFactory.makeString("No suggestions.");
        $ic61$ = SubLObjectFactory.makeString("No completions");
        $ic62$ = SubLObjectFactory.makeString("No suggestions");
        $ic63$ = SubLObjectFactory.makeString("Suggestions");
        $ic64$ = SubLObjectFactory.makeString("Completions");
        $ic65$ = SubLObjectFactory.makeString("Machine: ");
        $ic66$ = SubLObjectFactory.makeString("Prefix: ");
        $ic67$ = SubLObjectFactory.makeString("Filter: ");
        $ic68$ = SubLObjectFactory.makeString("onClick=\"complete_choose('~A', ~A);\"");
        $ic69$ = SubLObjectFactory.makeString("complete");
        $ic70$ = SubLObjectFactory.makeString("var constantCompleteDataSource = new YAHOO.widget.DS_XHR('./cg', ['Term', 'cycl', 'nl']);\n constantCompleteDataSource.scriptQueryParam = 'xml-complete~A&prefix';  \n constantCompleteDataSource.responseType = YAHOO.widget.DS_XHR.TYPE_XML;\n var constantComplete = new YAHOO.widget.AutoComplete('~A', '~A', constantCompleteDataSource);\n constantComplete.allowBrowserAutocomplete = true;  \n constantComplete.autoHighlight = false;\n constantComplete.minQueryLength = ~A;\n constantComplete.animSpeed = 0.1;\n// constantComplete.delimChar = ' '; //this would be good if we were working in just CycL (no lexical completions)\n constantComplete.maxResultsDisplayed=~A;\n constantComplete.queryDelay=0.3;\n constantComplete.embeddedInToolbar=~A;\n\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.itemSelectEvent.subscribe(function (sType, aArgs) { document.getElementById('inputBox').form.submit();}); \n}\n \n constantComplete.formatResult = function(oResultItem, sQuery) {\n   var thisConst = oResultItem[0];\n   var string = oResultItem[1];\n   var sMarkup = string + ' <span class=\"autoCompCycL\">' + thisConst + '</span>'; \n   return (sMarkup);\n };\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.containerExpandEvent.subscribe(function() {\n    if (!this.expandedRows) {\n      this.expandedRows=parent.document.body.rows;\n      var rows = parent.document.body.rows;\n      rows = rows.replace(/.*,.*,/, YAHOO.util.Dom.getDocumentHeight() + ',*,');\n      parent.document.body.rows=rows;\n    }\n   });\n   constantComplete.containerCollapseEvent.subscribe(function() {\n    if (this.expandedRows) { parent.document.body.rows=this.expandedRows; }\n    this.expandedRows = null;\n   });\n }\n");
        $ic71$ = SubLObjectFactory.makeSymbol("S#1635", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#44658", "CYC");
        $ic73$ = SubLObjectFactory.makeString("&filter=");
        $ic74$ = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE");
        $ic75$ = SubLObjectFactory.makeString("stylesheet");
        $ic76$ = SubLObjectFactory.makeString("text/css");
        $ic77$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("XML-TERM-SEARCH");
        $ic79$ = SubLObjectFactory.makeString("text/xml");
        $ic80$ = SubLObjectFactory.makeString("searchString");
        $ic81$ = SubLObjectFactory.makeString("caseSensitive");
        $ic82$ = SubLObjectFactory.makeString("return-attrs");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-ID"));
        $ic84$ = SubLObjectFactory.makeString("timeout");
        $ic85$ = SubLObjectFactory.makeString("count");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44659", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44660", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44661", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44662", "CYC"));
        $ic87$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic88$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("XML-COMPLETE");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $ic91$ = SubLObjectFactory.makeString("mt");
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic94$ = SubLObjectFactory.makeKeyword("TERM-TO-REPLACE");
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic96$ = SubLObjectFactory.makeSymbol("S#44587", "CYC");
        $ic97$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic98$ = SubLObjectFactory.makeSymbol("S#44645", "CYC");
        $ic99$ = SubLObjectFactory.makeInteger(1024);
        $ic100$ = SubLObjectFactory.makeSymbol("S#44584", "CYC");
        $ic101$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic102$ = SubLObjectFactory.makeSymbol("S#44591", "CYC");
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#44646", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#44588", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#44595", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#44647", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#44592", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#44599", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("ISA");
        $ic111$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic112$ = SubLObjectFactory.makeSymbol("S#44648", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#44596", "CYC");
        $ic114$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic116$ = SubLObjectFactory.makeString("constrainingSentence");
        $ic117$ = SubLObjectFactory.makeKeyword("EOF");
        $ic118$ = SubLObjectFactory.makeSymbol("S#44604", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#44605", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic121$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic122$ = SubLObjectFactory.makeSymbol("S#44627", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic124$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44663", "CYC"));
        $ic125$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic126$ = SubLObjectFactory.makeKeyword("NL");
        $ic127$ = SubLObjectFactory.makeKeyword("DISAMBIG-STRING");
        $ic128$ = SubLObjectFactory.makeKeyword("HL-ID");
        $ic129$ = SubLObjectFactory.makeString("#$");
        $ic130$ = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xmlns:xsi"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)SubLObjectFactory.makeString("xsi:schemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), (SubLObject)SubLObjectFactory.makeString("xmlns:concepts"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/CycConcepts"), (SubLObject)SubLObjectFactory.makeString("xmlns"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));
        $ic132$ = SubLObjectFactory.makeString("ResultSet");
        $ic133$ = SubLObjectFactory.makeString("cycl");
        $ic134$ = SubLObjectFactory.makeString("nl");
        $ic135$ = SubLObjectFactory.makeString("disambigString");
        $ic136$ = SubLObjectFactory.makeString("hlId");
        $ic137$ = SubLObjectFactory.makeString("Term");
        $ic138$ = SubLObjectFactory.makeSymbol("S#44612", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#44649", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#44609", "CYC");
        $ic141$ = SubLObjectFactory.makeString("Autocomplete isa cache lock");
        $ic142$ = SubLObjectFactory.makeString("Autocomplete genls cache lock");
        $ic143$ = SubLObjectFactory.makeInteger(128);
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43350", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic145$ = SubLObjectFactory.makeSymbol("S#44617", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#44616", "CYC");
        $ic147$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhysiologicalCondition"));
        $ic149$ = SubLObjectFactory.makeSymbol("S#9950", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic151$ = SubLObjectFactory.makeSymbol("S#44624", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#44625", "CYC");
        $ic153$ = SubLObjectFactory.makeInteger(1000);
        $ic154$ = SubLObjectFactory.makeKeyword("YAHOO-DOM-EVENT");
        $ic155$ = SubLObjectFactory.makeKeyword("ANIMATION");
        $ic156$ = SubLObjectFactory.makeKeyword("CONNECTION");
        $ic157$ = SubLObjectFactory.makeKeyword("DATASOURCE");
        $ic158$ = SubLObjectFactory.makeKeyword("AUTOCOMPLETE");
        $ic159$ = SubLObjectFactory.makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar close_window = ~A;\n\n");
        $ic160$ = SubLObjectFactory.makeString("\nfunction cyclify_error(message) {\n  document.open();\n  document.writeln('Unable to cyclify the input field.<p>');\n  document.writeln('Error: ' + message);\n  document.close();\n  return false;\n}\n\nfunction handle_cyclify(new_string) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return cyclify_error(1);\n  if (!window.opener.document) \n    return cyclify_error(2);\n  if (!window.opener.document.forms) \n    return cyclify_error(3);\n  if (!window.opener.document.forms.length) \n    return cyclify_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return cyclify_error(5);\n  \n  if (window.opener.focus) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return cyclify_error(6);\n  if (!form.elements.length) \n    return cyclify_error(7);\n  if (form.elements.length < element_number) \n    return cyclify_error(8);\n\n  var element = form.elements[element_number];\n\n  if (!element.value) \n    return cyclify_error(9);\n\n  element.value = new_string;\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\n");
        $ic161$ = SubLObjectFactory.makeString("\nhandle_cyclify(unescape('");
        $ic162$ = SubLObjectFactory.makeString("'));\n");
        $ic163$ = SubLObjectFactory.makeString("string");
        $ic164$ = SubLObjectFactory.makeString("All valid #$ references have been added.");
        $ic165$ = SubLObjectFactory.makeString("Invalid references :");
        $ic166$ = SubLObjectFactory.makeString("Added references :");
        $ic167$ = SubLObjectFactory.makeString("No references added");
        $ic168$ = SubLObjectFactory.makeSymbol("CB-CYCLIFY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0666.class
	Total time: 1002 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/