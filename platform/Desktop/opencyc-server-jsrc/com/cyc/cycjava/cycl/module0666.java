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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic2$;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL == var3) {
            var3 = $ic4$;
        }
        assert NIL != module0173.f10955(var3) : var3;
        if (NIL != $g5237$.getDynamicValue(var7)) {
            final SubLObject var8 = module0655.f39759(var6);
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var2) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39019(var2);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39032((SubLObject)ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), $g5240$.getGlobalValue(), new SubLObject[] { var1, (NIL != var4) ? $ic6$ : $ic7$, module0656.f39842(var3), var8, (NIL != var5) ? $ic6$ : $ic7$ });
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40468(final SubLObject var1, SubLObject var9, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic2$;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL == var3) {
            var3 = $ic4$;
        }
        assert NIL != module0173.f10955(var3) : var3;
        if (NIL != $g5237$.getDynamicValue(var10)) {
            final SubLObject var11 = module0655.f39759(var6);
            final SubLObject var12 = Sequences.cconcatenate((SubLObject)$ic8$, new SubLObject[] { module0006.f203(var1), $ic9$, module0006.f203((SubLObject)((NIL != var4) ? $ic6$ : $ic7$)), $ic10$, module0006.f203(module0656.f39842(var3)), $ic9$, module0006.f203(var11), $ic11$, module0006.f203((SubLObject)((NIL != var5) ? $ic6$ : $ic7$)), $ic12$ });
            final SubLObject var13 = f40469();
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var13);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var14 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)T, var10);
                module0642.f39019(var9);
            }
            finally {
                module0015.$g533$.rebind(var14, var10);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40470(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic14$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL != $g5237$.getDynamicValue(var3)) {
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var2) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39019(var2);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39032((SubLObject)ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var3), $g5241$.getGlobalValue(), var1);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40469() {
        return (SubLObject)$ic15$;
    }
    
    public static SubLObject f40471() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), $g5242$.getGlobalValue(), module0110.$g570$.getDynamicValue(var7), (SubLObject)((NIL == $g5238$.getDynamicValue(var7)) ? $g5239$.getDynamicValue(var7) : $ic19$));
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        final SubLObject var9 = module0014.f657((SubLObject)$ic17$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40472() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), $g5243$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40473(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)T, var15);
            PrintLow.format(module0015.$g131$.getDynamicValue(var15), $g5244$.getGlobalValue(), var14);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var15);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40474(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            PrintLow.format(module0015.$g131$.getDynamicValue(var18), $g5245$.getGlobalValue(), new SubLObject[] { var15, var16, var17, (NIL != $g5238$.getDynamicValue(var18)) ? $ic6$ : $ic7$ });
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39020($g5246$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40475(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)T, var19);
            PrintLow.format(module0015.$g131$.getDynamicValue(var19), $g5247$.getDynamicValue(var19), var18);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40476(final SubLObject var18, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0015.$g533$.currentBinding(var20);
        try {
            module0015.$g533$.bind((SubLObject)T, var20);
            PrintLow.format(module0015.$g131$.getDynamicValue(var20), $g5248$.getDynamicValue(var20), var18, var19);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var21, var20);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40477(final SubLObject var20) {
        final SubLObject var21 = module0642.f39104((SubLObject)$ic27$, var20);
        final SubLObject var22 = module0642.f39104((SubLObject)$ic28$, var20);
        final SubLObject var23 = module0642.f39104((SubLObject)$ic29$, var20);
        final SubLObject var24 = module0642.f39104((SubLObject)$ic30$, var20);
        SubLObject var25 = module0642.f39104((SubLObject)$ic31$, var20);
        SubLObject var26 = module0642.f39104((SubLObject)$ic32$, var20);
        final SubLObject var27 = (SubLObject)makeBoolean(NIL == module0642.f39104((SubLObject)$ic33$, var20));
        final SubLObject var28 = Equality.equal((SubLObject)$ic6$, module0642.f39104((SubLObject)$ic34$, var20));
        SubLObject var29 = (SubLObject)NIL;
        if (NIL != var25) {
            var25 = module0656.f39943(var25, (SubLObject)UNPROVIDED);
        }
        if (var25.eql($ic4$)) {
            var25 = (SubLObject)NIL;
        }
        if (NIL != var26) {
            var26 = module0655.f39758(var26);
        }
        var29 = f40478(var23, var25, var26, var28, var27, (SubLObject)UNPROVIDED);
        if (NIL != var29) {
            if (NIL != module0035.f1997(var29)) {
                f40479(var21, var22, var23, var29.first(), var24, var25);
            }
            else {
                f40480(var21, var22, var23, var26, var29, var24, var25);
            }
        }
        else {
            f40481(var23, var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40478(final SubLObject var18, final SubLObject var21, final SubLObject var22, SubLObject var5, SubLObject var23, SubLObject var25) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)T;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)T;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0038.f2608(var18)) {
            SubLObject var28 = (SubLObject)NIL;
            final SubLObject var29 = module0147.$g2094$.currentBinding(var26);
            final SubLObject var30 = module0147.$g2095$.currentBinding(var26);
            try {
                module0147.$g2094$.bind((SubLObject)$ic36$, var26);
                module0147.$g2095$.bind($ic37$, var26);
                if (NIL == var21) {
                    var28 = module0677.f41332();
                }
                else if (module0549.f33895(var21).numLE((SubLObject)$ic38$)) {
                    var28 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic39$), module0259.f16848(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    var28 = module0259.f16860(var21, module0677.f41332(), (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0147.$g2095$.rebind(var30, var26);
                module0147.$g2094$.rebind(var29, var26);
            }
            var27 = conses_high.nunion(conses_high.copy_list(var22), var28, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        }
        else if (NIL != var25) {
            var27 = module0126.f8393(var18, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var21) {
                final SubLObject var31 = module0147.$g2094$.currentBinding(var26);
                final SubLObject var32 = module0147.$g2095$.currentBinding(var26);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic36$, var26);
                    module0147.$g2095$.bind($ic37$, var26);
                    var27 = module0259.f16860(var21, var27, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var32, var26);
                    module0147.$g2094$.rebind(var31, var26);
                }
            }
        }
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)$ic40$), Symbols.symbol_function((SubLObject)$ic41$));
        if (NIL != var22) {
            var27 = module0035.f2386(var27, var22, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0038.f2653(var18) && NIL != var5) {
            SubLObject var33 = (NIL != module0269.f17705(var21) && !$ic4$.eql(var21)) ? nl_trie_completion_oc.f45853(var18, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : nl_trie_completion_oc.f45848(var18, (SubLObject)UNPROVIDED);
            var33 = Sort.sort(var33, Symbols.symbol_function((SubLObject)$ic42$), (SubLObject)UNPROVIDED);
            var27 = ConsesLow.append(var27, var33);
        }
        return var27;
    }
    
    public static SubLObject f40480(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var22, final SubLObject var24, final SubLObject var19, final SubLObject var21) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = Sequences.length(var24);
        final SubLObject var27 = module0038.f2701(var24, Symbols.symbol_function((SubLObject)$ic43$), Sequences.length(var17));
        final SubLObject var28 = Sequences.cconcatenate(var17, var27);
        final SubLObject var29 = Sequences.find(var28, var24, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic43$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var30 = Numbers.numG(Sequences.length(var27), (SubLObject)ZERO_INTEGER);
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        f40474(var15, var16, var17);
        if (NIL != var30) {
            f40475(var28);
        }
        f40472();
        f40473((SubLObject)((NIL != var29) ? (var26.numE((SubLObject)TWO_INTEGER) ? $ic45$ : PrintLow.format((SubLObject)NIL, (SubLObject)$ic46$, Numbers.subtract(var26, (SubLObject)ONE_INTEGER))) : PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var26, (SubLObject)((NIL != module0038.f2608(var17)) ? $ic48$ : $ic0$))));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL == $g5238$.getDynamicValue(var25) || NIL == var30) {
            final SubLObject var31 = module0015.$g535$.currentBinding(var25);
            try {
                module0015.$g535$.bind((SubLObject)T, var25);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_34 = module0015.$g533$.currentBinding(var25);
                try {
                    module0015.$g533$.bind((SubLObject)T, var25);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var25));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_35 = module0015.$g533$.currentBinding(var25);
                    final SubLObject var32 = module0015.$g541$.currentBinding(var25);
                    final SubLObject var33 = module0015.$g539$.currentBinding(var25);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var25);
                        module0015.$g541$.bind((SubLObject)T, var25);
                        module0015.$g539$.bind(module0015.f797(), var25);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (NIL != var30) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic49$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39024(var27);
                            module0642.f39026((SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        final SubLObject var34 = (SubLObject)$ic50$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var34) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var34));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var12_36 = module0015.$g533$.currentBinding(var25);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var25);
                            module0642.f39019(var26);
                            if (NIL != module0038.f2608(var17)) {
                                module0642.f39019((SubLObject)$ic51$);
                            }
                            else {
                                module0642.f39019((SubLObject)$ic52$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var12_36, var25);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var35 = Sequences.count_if((SubLObject)$ic39$, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var36 = Sequences.count_if((SubLObject)$ic3$, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var37 = (SubLObject)NIL;
                        SubLObject var38 = (SubLObject)NIL;
                        SubLObject var39 = (SubLObject)NIL;
                        SubLObject var40 = var24;
                        SubLObject var41 = (SubLObject)NIL;
                        var41 = var40.first();
                        while (NIL != var40) {
                            if (NIL != constant_handles_oc.f8449(var41) && NIL == var37) {
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var25), (SubLObject)$ic53$, var35);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                var37 = (SubLObject)T;
                            }
                            else if (var41.isString() && NIL == var38) {
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var25), (SubLObject)$ic54$, var36);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                var38 = (SubLObject)T;
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            if (NIL != constant_handles_oc.f8449(var39) && NIL != constant_handles_oc.f8449(var41) && NIL != module0004.f104(var39, var22, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED) && NIL == module0004.f104(var41, var22, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)) {
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_34, var25);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var31, var25);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40485(final SubLObject var45) {
        if (NIL != constant_handles_oc.f8449(var45)) {
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
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        f40474(var15, var16, var17);
        f40476(var47, var19);
        f40473((SubLObject)((NIL != var48) ? $ic55$ : $ic56$));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL == $g5238$.getDynamicValue(var46)) {
            final SubLObject var49 = module0015.$g535$.currentBinding(var46);
            try {
                module0015.$g535$.bind((SubLObject)T, var46);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_47 = module0015.$g533$.currentBinding(var46);
                try {
                    module0015.$g533$.bind((SubLObject)T, var46);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var46));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_48 = module0015.$g533$.currentBinding(var46);
                    final SubLObject var50 = module0015.$g541$.currentBinding(var46);
                    final SubLObject var51 = module0015.$g539$.currentBinding(var46);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var46);
                        module0015.$g541$.bind((SubLObject)T, var46);
                        module0015.$g539$.bind(module0015.f797(), var46);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (NIL != var48) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic57$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic58$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_47, var46);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var49, var46);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40481(final SubLObject var17, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f40482(var17);
        if (NIL == module0038.f2608(var17)) {
            f40473((SubLObject)$ic59$);
        }
        else {
            f40473((SubLObject)$ic60$);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL == $g5238$.getDynamicValue(var22)) {
            final SubLObject var23 = module0015.$g535$.currentBinding(var22);
            try {
                module0015.$g535$.bind((SubLObject)T, var22);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_49 = module0015.$g533$.currentBinding(var22);
                try {
                    module0015.$g533$.bind((SubLObject)T, var22);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var22));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_50 = module0015.$g533$.currentBinding(var22);
                    final SubLObject var24 = module0015.$g541$.currentBinding(var22);
                    final SubLObject var25 = module0015.$g539$.currentBinding(var22);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var22);
                        module0015.$g541$.bind((SubLObject)T, var22);
                        module0015.$g539$.bind(module0015.f797(), var22);
                        f40483(var17, var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        if (NIL == module0038.f2608(var17)) {
                            module0642.f39019((SubLObject)$ic61$);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic62$);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var12_49, var22);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var23, var22);
            }
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40482(final SubLObject var17) {
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        if (NIL != module0038.f2608(var17)) {
            module0642.f39019((SubLObject)$ic63$);
        }
        else {
            module0642.f39019((SubLObject)$ic64$);
        }
        module0642.f39020(module0015.$g174$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40483(final SubLObject var17, final SubLObject var21) {
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (NIL != module0038.f2608(var17)) {
            module0642.f39019((SubLObject)$ic63$);
        }
        else {
            module0642.f39019((SubLObject)$ic64$);
        }
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0644.f39178((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic65$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39019(Environment.get_machine_name((SubLObject)UNPROVIDED));
        if (NIL == module0038.f2608(var17)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic66$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(var17);
        }
        if (NIL != var21) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic67$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40484(final SubLObject var51, final SubLObject var19) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (!var51.isString() && !areAssertionsDisabledFor(me) && NIL == constant_handles_oc.f8449(var51)) {
            throw new AssertionError(var51);
        }
        final SubLObject var53 = f40485(var51);
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g302$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic69$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var52), $g5249$.getGlobalValue(), var53, var19);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39019(f40485(var51));
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40486(final SubLObject var52, final SubLObject var53, final SubLObject var54, final SubLObject var55, final SubLObject var56, SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        if (NIL == var57) {
            var57 = $ic4$;
        }
        final SubLObject var59 = (SubLObject)((NIL != var56) ? $ic6$ : $ic7$);
        final SubLObject var60 = module0656.f39932(var57);
        final SubLObject var61 = Sequences.cconcatenate((SubLObject)$ic73$, module0589.f35898(var60, (SubLObject)UNPROVIDED));
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var62 = module0015.$g533$.currentBinding(var58);
        try {
            module0015.$g533$.bind((SubLObject)T, var58);
            PrintLow.format(module0015.$g131$.getDynamicValue(var58), $g5250$.getDynamicValue(var58), new SubLObject[] { var61, var52, var53, var55, var54, var59 });
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var62, var58);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40487() {
        SubLObject var61 = module0014.f672((SubLObject)$ic74$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic75$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var61) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var61);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var61 = module0014.f672((SubLObject)$ic77$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic75$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var61) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var61);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40488(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)$ic80$, var20);
        final SubLObject var23 = module0642.f39113((SubLObject)$ic81$, var20, (SubLObject)UNPROVIDED);
        final SubLObject var24 = module0642.f39113((SubLObject)$ic82$, var20, (SubLObject)$ic83$);
        final SubLObject var25 = module0642.f39113((SubLObject)$ic84$, var20, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0642.f39113((SubLObject)$ic85$, var20, $g5251$.getDynamicValue(var21));
        final SubLObject var27 = module0587.$g4457$.currentBinding(var21);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var21), var21);
            SubLObject var29;
            final SubLObject var28 = var29 = f40489(var20);
            SubLObject var30 = (SubLObject)NIL;
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic86$);
            var30 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic86$);
            var31 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic86$);
            var32 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic86$);
            var33 = var29.first();
            var29 = var29.rest();
            if (NIL == var29) {
                final SubLObject var34 = module0660.f40150(var22, var23, (SubLObject)NIL);
                final SubLObject var35 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var36 = var34;
                SubLObject var37 = (SubLObject)NIL;
                var37 = var36.first();
                while (NIL != var36) {
                    if (NIL != f40490(var37, var30, var31, (SubLObject)$ic87$) && NIL != f40491(var37, var32, var33, (SubLObject)$ic87$)) {
                        module0084.f5765(var35, var37, module0770.f49049(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                f40492(var35, var24, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic86$);
            }
            return (SubLObject)NIL;
        }
        finally {
            module0587.$g4457$.rebind(var27, var21);
        }
    }
    
    public static SubLObject f40493(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)$ic29$, var20);
        final SubLObject var23 = module0642.f39113((SubLObject)$ic81$, var20, (SubLObject)NIL);
        final SubLObject var24 = module0642.f39113((SubLObject)$ic82$, var20, (SubLObject)$ic90$);
        final SubLObject var25 = module0642.f39113((SubLObject)$ic84$, var20, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0642.f39113((SubLObject)$ic85$, var20, $g5251$.getDynamicValue(var21));
        final SubLObject var27 = module0642.f39115((SubLObject)$ic91$, var20, $ic92$);
        final SubLObject var28 = module0587.$g4457$.currentBinding(var21);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var21), var21);
            SubLObject var30;
            final SubLObject var29 = var30 = f40489(var20);
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic86$);
            var31 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic86$);
            var32 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic86$);
            var33 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic86$);
            var34 = var30.first();
            var30 = var30.rest();
            if (NIL == var30) {
                f40494(var22, var24, var31, var32, var33, var34, var26, var25, var23, (SubLObject)T, (SubLObject)NIL, var27);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic86$);
            }
            return (SubLObject)NIL;
        }
        finally {
            module0587.$g4457$.rebind(var28, var21);
        }
    }
    
    public static SubLObject f40489(final SubLObject var20) {
        final SubLObject var21 = module0656.f39957(module0642.f39104((SubLObject)$ic31$, var20), (SubLObject)UNPROVIDED);
        SubLObject var22 = (NIL != var21) ? var21 : $ic4$;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = module0642.f39115((SubLObject)$ic91$, var20, $ic93$);
        final SubLObject var27 = f40495(var20);
        final SubLObject var28 = module0205.f13357(var27, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
        if (NIL != var27) {
            final SubLObject var29 = (SubLObject)((NIL != var27) ? f40496(var27, var28, var26) : NIL);
            var22 = f40497(var29);
            var23 = f40498(var29);
            var24 = f40499(var27, var26);
            var25 = f40500(var27, var26);
        }
        else if (NIL == module0173.f10955(var22)) {
            if (NIL != module0751.f46676(var22)) {
                var23 = module0205.f13277(var22, (SubLObject)UNPROVIDED);
                var22 = $ic4$;
            }
            else {
                var22 = $ic4$;
            }
        }
        return (SubLObject)ConsesLow.list(var22, var23, var24, var25);
    }
    
    public static SubLObject f40501() {
        final SubLObject var82 = $g5252$.getGlobalValue();
        if (NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40502(final SubLObject var83, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic95$;
        }
        return module0034.f1829($g5252$.getGlobalValue(), (SubLObject)ConsesLow.list(var83, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40503(final SubLObject var83, final SubLObject var75) {
        if (module0205.f13204(var83, (SubLObject)UNPROVIDED) == $ic94$ && NIL != module0260.f17091(module0205.f13132(var83), $ic97$, var75, (SubLObject)UNPROVIDED)) {
            return module0256.f16525(module0205.f13203(var83, (SubLObject)UNPROVIDED), var75, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40499(final SubLObject var83, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic95$;
        }
        SubLObject var84 = $g5252$.getGlobalValue();
        if (NIL == var84) {
            var84 = module0034.f1934((SubLObject)$ic96$, (SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic100$);
        }
        final SubLObject var85 = module0034.f1782(var83, var75);
        final SubLObject var86 = module0034.f1814(var84, var85, (SubLObject)UNPROVIDED);
        if (var86 != $ic101$) {
            SubLObject var87 = var86;
            SubLObject var88 = (SubLObject)NIL;
            var88 = var87.first();
            while (NIL != var87) {
                SubLObject var89 = var88.first();
                final SubLObject var90 = conses_high.second(var88);
                if (var83.equal(var89.first())) {
                    var89 = var89.rest();
                    if (NIL != var89 && NIL == var89.rest() && var75.equal(var89.first())) {
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
        final SubLObject var82 = $g5253$.getGlobalValue();
        if (NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40505(final SubLObject var83, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic95$;
        }
        return module0034.f1829($g5253$.getGlobalValue(), (SubLObject)ConsesLow.list(var83, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40506(final SubLObject var83, final SubLObject var75) {
        if (module0205.f13204(var83, (SubLObject)UNPROVIDED) == $ic94$ && NIL != module0260.f17091(module0205.f13132(var83), $ic97$, var75, (SubLObject)UNPROVIDED)) {
            return module0259.f16822(module0205.f13203(var83, (SubLObject)UNPROVIDED), var75, (SubLObject)UNPROVIDED);
        }
        if (module0205.f13204(var83, (SubLObject)UNPROVIDED) == $ic94$ && NIL != module0260.f17091(module0205.f13132(var83), $ic103$, var75, (SubLObject)UNPROVIDED)) {
            return module0256.f16525(module0205.f13203(var83, (SubLObject)UNPROVIDED), var75, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40500(final SubLObject var83, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic95$;
        }
        SubLObject var84 = $g5253$.getGlobalValue();
        if (NIL == var84) {
            var84 = module0034.f1934((SubLObject)$ic102$, (SubLObject)$ic104$, (SubLObject)$ic99$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic105$);
        }
        final SubLObject var85 = module0034.f1782(var83, var75);
        final SubLObject var86 = module0034.f1814(var84, var85, (SubLObject)UNPROVIDED);
        if (var86 != $ic101$) {
            SubLObject var87 = var86;
            SubLObject var88 = (SubLObject)NIL;
            var88 = var87.first();
            while (NIL != var87) {
                SubLObject var89 = var88.first();
                final SubLObject var90 = conses_high.second(var88);
                if (var83.equal(var89.first())) {
                    var89 = var89.rest();
                    if (NIL != var89 && NIL == var89.rest() && var75.equal(var89.first())) {
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
        final SubLObject var82 = $g5254$.getGlobalValue();
        if (NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40508(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        return module0034.f1829($g5254$.getGlobalValue(), (SubLObject)ConsesLow.list(var91, var92, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40509(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        final SubLObject var93 = module0205.f13394(var91, var92, (SubLObject)UNPROVIDED);
        final SubLObject var94 = (NIL != module0206.f13438(var93)) ? var93 : module0279.f18513(var91, (SubLObject)UNPROVIDED);
        final SubLObject var95 = (NIL != module0206.f13438(var93)) ? var91 : module0205.f13252(var94, var93, var91, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        return f40510(var95, var94, var75);
    }
    
    public static SubLObject f40496(final SubLObject var91, final SubLObject var92, final SubLObject var75) {
        SubLObject var93 = $g5254$.getGlobalValue();
        if (NIL == var93) {
            var93 = module0034.f1934((SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic99$, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic108$);
        }
        final SubLObject var94 = module0034.f1781(var91, var92, var75);
        final SubLObject var95 = module0034.f1814(var93, var94, (SubLObject)UNPROVIDED);
        if (var95 != $ic101$) {
            SubLObject var96 = var95;
            SubLObject var97 = (SubLObject)NIL;
            var97 = var96.first();
            while (NIL != var96) {
                SubLObject var98 = var97.first();
                final SubLObject var99 = conses_high.second(var97);
                if (var91.equal(var98.first())) {
                    var98 = var98.rest();
                    if (var92.equal(var98.first())) {
                        var98 = var98.rest();
                        if (NIL != var98 && NIL == var98.rest() && var75.equal(var98.first())) {
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
        final SubLObject var82 = $g5255$.getGlobalValue();
        if (NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40512(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        return module0034.f1829($g5255$.getGlobalValue(), (SubLObject)ConsesLow.list(var95, var94, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40513(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        final SubLObject var96 = module0307.f20803(var94, var95, var75, (SubLObject)UNPROVIDED);
        final SubLObject var97 = module0307.f20810(var94, var95, var75, (SubLObject)UNPROVIDED);
        SubLObject var98 = (SubLObject)NIL;
        if (NIL != var96) {
            var98 = (SubLObject)ConsesLow.list((SubLObject)$ic110$, var96);
        }
        if (NIL != var97) {
            var98 = conses_high.putf(var98, (SubLObject)$ic111$, var97);
        }
        return var98;
    }
    
    public static SubLObject f40510(final SubLObject var95, final SubLObject var94, final SubLObject var75) {
        SubLObject var96 = $g5255$.getGlobalValue();
        if (NIL == var96) {
            var96 = module0034.f1934((SubLObject)$ic109$, (SubLObject)$ic112$, (SubLObject)$ic99$, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic113$);
        }
        final SubLObject var97 = module0034.f1781(var95, var94, var75);
        final SubLObject var98 = module0034.f1814(var96, var97, (SubLObject)UNPROVIDED);
        if (var98 != $ic101$) {
            SubLObject var99 = var98;
            SubLObject var100 = (SubLObject)NIL;
            var100 = var99.first();
            while (NIL != var99) {
                SubLObject var101 = var100.first();
                final SubLObject var102 = conses_high.second(var100);
                if (var95.equal(var101.first())) {
                    var101 = var101.rest();
                    if (var94.equal(var101.first())) {
                        var101 = var101.rest();
                        if (NIL != var101 && NIL == var101.rest() && var75.equal(var101.first())) {
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
        final SubLObject var82 = conses_high.getf(var81, (SubLObject)$ic111$, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1995(var82, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var82.first();
        }
        if (NIL != var82) {
            return module0202.f12720($ic114$, (SubLObject)ConsesLow.list(module0202.f12720($ic115$, var82, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40497(final SubLObject var81) {
        final SubLObject var82 = conses_high.getf(var81, (SubLObject)$ic110$, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1995(var82, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var82.first();
        }
        if (NIL != var82) {
            return module0202.f12720($ic114$, (SubLObject)ConsesLow.list(module0202.f12720($ic115$, var82, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40495(final SubLObject var20) {
        final SubLObject var21 = module0642.f39104((SubLObject)$ic116$, var20);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? reader.read_from_string_ignoring_errors(module0038.f2933(var21), (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        SubLObject var23 = f40514(var22);
        if (var23 == $ic117$) {
            var23 = (SubLObject)NIL;
        }
        return var23;
    }
    
    public static SubLObject f40514(final SubLObject var102) {
        return module0205.f13147(var102, (SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40515(final SubLObject var103) {
        return (SubLObject)makeBoolean(var103.isSymbol() && NIL == Eval.constantp(var103, (SubLObject)UNPROVIDED) && NIL == module0206.f13438(var103));
    }
    
    public static SubLObject f40516(final SubLObject var104) {
        return Symbols.make_keyword(module0038.f2624(var104));
    }
    
    public static SubLObject f40517(final SubLObject var17, final SubLObject var63, final SubLObject var68, final SubLObject var69, final SubLObject var65, final SubLObject var64, final SubLObject var23, final SubLObject var105, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (NIL != var64 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var64)) {
            throw new AssertionError(var64);
        }
        final SubLObject var108 = f40478(var17, var68, (SubLObject)NIL, (SubLObject)T, var23, var105);
        final SubLObject var109 = module0067.f4880((SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        final SubLObject var110 = (SubLObject)NIL;
        final SubLObject var111 = (SubLObject)ZERO_INTEGER;
        SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        final SubLObject var116;
        final SubLObject var115 = var116 = module0034.f1888();
        final SubLObject var117 = module0034.$g879$.currentBinding(var107);
        try {
            module0034.$g879$.bind(var116, var107);
            SubLObject var118 = (SubLObject)NIL;
            if (NIL != var116 && NIL == module0034.f1842(var116)) {
                var118 = module0034.f1869(var116);
                final SubLObject var119 = Threads.current_process();
                if (NIL == var118) {
                    module0034.f1873(var116, var119);
                }
                else if (!var118.eql(var119)) {
                    Errors.error((SubLObject)$ic121$);
                }
            }
            try {
                final SubLObject var120 = module0139.$g1630$.getDynamicValue(var107);
                final SubLObject var12_118 = module0139.$g1631$.currentBinding(var107);
                final SubLObject var121 = module0139.$g1632$.currentBinding(var107);
                final SubLObject var122 = module0139.$g1630$.currentBinding(var107);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var120, (SubLObject)SIX_INTEGER), var107);
                    module0139.$g1632$.bind(module0139.f9016(var120), var107);
                    module0139.$g1630$.bind((SubLObject)T, var107);
                    final SubLObject var123 = module0003.f61();
                    try {
                        var107.throwStack.push(var123);
                        final SubLObject var12_119 = module0003.$g4$.currentBinding(var107);
                        try {
                            module0003.$g4$.bind((SubLObject)T, var107);
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                final SubLObject var12_120 = module0003.$g5$.currentBinding(var107);
                                try {
                                    module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var107)), var107);
                                    var124 = module0003.f62(var64, var123);
                                    if (NIL == var113) {
                                        SubLObject var125 = var108;
                                        SubLObject var126 = (SubLObject)NIL;
                                        var126 = var125.first();
                                        while (NIL == var113 && NIL != var125) {
                                            if (NIL != constant_handles_oc.f8449(var126)) {
                                                module0084.f5765(var109, var126, constants_high_oc.f10743(var126), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var107);
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
                    final SubLObject var129 = var130 = Sort.sort(var128, (SubLObject)$ic122$, (SubLObject)$ic123$);
                    SubLObject var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL != var130) {
                        SubLObject var133;
                        final SubLObject var132 = var133 = var131;
                        SubLObject var134 = (SubLObject)NIL;
                        SubLObject var135 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)$ic124$);
                        var134 = var133.first();
                        var133 = (var135 = var133.rest());
                        final SubLObject var136 = (SubLObject)NIL;
                        SubLObject var137 = (SubLObject)NIL;
                        if (NIL != module0004.f104((SubLObject)$ic125$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(var134, var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)$ic125$, var137);
                        }
                        if (NIL != module0004.f104((SubLObject)$ic126$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(var135.first(), var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)$ic126$, var137);
                        }
                        if (NIL != module0004.f104((SubLObject)$ic127$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            final SubLObject var138 = module0753.f47275(var134, var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                            if (NIL != var138) {
                                var137 = (SubLObject)ConsesLow.cons(module0770.f49049(var138.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var137);
                                var137 = (SubLObject)ConsesLow.cons((SubLObject)$ic127$, var137);
                            }
                        }
                        if (NIL != module0004.f104((SubLObject)$ic128$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var137 = (SubLObject)ConsesLow.cons(module0213.f13918(var134), var137);
                            var137 = (SubLObject)ConsesLow.cons((SubLObject)$ic128$, var137);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var107);
                    if (NIL != var116 && NIL == var118) {
                        module0034.f1873(var116, (SubLObject)NIL);
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
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)$ic87$;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (NIL != var64 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var64)) {
            throw new AssertionError(var64);
        }
        final SubLObject var108 = module0038.f2684(var17, (SubLObject)$ic129$);
        final SubLObject var109 = module0038.f2674(var17, (SubLObject)$ic129$, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var110 = f40478(var109, $ic4$, (SubLObject)NIL, (SubLObject)T, var23, var105);
        final SubLObject var111 = module0067.f4880((SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        final SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = (SubLObject)ZERO_INTEGER;
        SubLObject var114 = (SubLObject)NIL;
        final SubLObject var115 = (SubLObject)NIL;
        final SubLObject var117;
        final SubLObject var116 = var117 = module0034.f1888();
        final SubLObject var118 = module0034.$g879$.currentBinding(var107);
        try {
            module0034.$g879$.bind(var117, var107);
            SubLObject var119 = (SubLObject)NIL;
            if (NIL != var117 && NIL == module0034.f1842(var117)) {
                var119 = module0034.f1869(var117);
                final SubLObject var120 = Threads.current_process();
                if (NIL == var119) {
                    module0034.f1873(var117, var120);
                }
                else if (!var119.eql(var120)) {
                    Errors.error((SubLObject)$ic121$);
                }
            }
            try {
                final SubLObject var121 = module0139.$g1630$.getDynamicValue(var107);
                final SubLObject var12_139 = module0139.$g1631$.currentBinding(var107);
                final SubLObject var122 = module0139.$g1632$.currentBinding(var107);
                final SubLObject var123 = module0139.$g1630$.currentBinding(var107);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var121, (SubLObject)SIX_INTEGER), var107);
                    module0139.$g1632$.bind(module0139.f9016(var121), var107);
                    module0139.$g1630$.bind((SubLObject)T, var107);
                    final SubLObject var124 = module0003.f61();
                    try {
                        var107.throwStack.push(var124);
                        final SubLObject var12_140 = module0003.$g4$.currentBinding(var107);
                        try {
                            module0003.$g4$.bind((SubLObject)T, var107);
                            SubLObject var125 = (SubLObject)NIL;
                            try {
                                final SubLObject var12_141 = module0003.$g5$.currentBinding(var107);
                                try {
                                    module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var107)), var107);
                                    var125 = module0003.f62(var64, var124);
                                    if (NIL == var115) {
                                        SubLObject var126 = var110;
                                        SubLObject var127 = (SubLObject)NIL;
                                        var127 = var126.first();
                                        while (NIL == var115 && NIL != var126) {
                                            if (NIL != constant_handles_oc.f8449(var127) && NIL != f40490(var127, var68, var69, var75) && NIL != f40491(var127, var70, var71, var75)) {
                                                module0084.f5765(var111, var127, constants_high_oc.f10743(var127), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var107);
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
                    f40492(var111, var63, (SubLObject)UNPROVIDED);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var107);
                    if (NIL != var117 && NIL == var119) {
                        module0034.f1873(var117, (SubLObject)NIL);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40492(final SubLObject var144, SubLObject var63, SubLObject var108) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)$ic83$;
        }
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic87$;
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        final SubLObject var146 = module0084.f5794(var144, (SubLObject)$ic122$);
        if (var108 == $ic87$) {
            var108 = module0067.f4902(var144);
        }
        module0601.f36755((SubLObject)$ic130$);
        module0601.f36746();
        final SubLObject var147 = (SubLObject)$ic131$;
        try {
            final SubLObject var148 = module0601.$g4652$.currentBinding(var145);
            final SubLObject var149 = module0601.$g4654$.currentBinding(var145);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var145), module0601.$g4652$.getDynamicValue(var145)), var145);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var145), var145);
                module0601.f36758((SubLObject)$ic132$, var147, (SubLObject)NIL, (SubLObject)T);
                SubLObject var150 = var146;
                SubLObject var151 = (SubLObject)NIL;
                var151 = var150.first();
                while (NIL != var150) {
                    SubLObject var153;
                    final SubLObject var152 = var153 = var151;
                    SubLObject var154 = (SubLObject)NIL;
                    SubLObject var155 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)$ic124$);
                    var154 = var153.first();
                    var153 = (var155 = var153.rest());
                    SubLObject var133_147 = (SubLObject)NIL;
                    if (NIL != module0004.f104((SubLObject)$ic125$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)$ic133$, (SubLObject)ConsesLow.cons(module0006.f204(module0205.f13144(var154)), var133_147));
                    }
                    if (NIL != module0004.f104((SubLObject)$ic126$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)$ic134$, (SubLObject)ConsesLow.cons(var155.first(), var133_147));
                    }
                    if (NIL != module0004.f104((SubLObject)$ic127$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var156 = module0753.f47275(var154, var108, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                        if (NIL != var156) {
                            var133_147 = (SubLObject)ConsesLow.cons((SubLObject)$ic135$, (SubLObject)ConsesLow.cons(module0770.f49049(var156.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var133_147));
                        }
                    }
                    if (NIL != module0004.f104((SubLObject)$ic128$, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var133_147 = (SubLObject)ConsesLow.cons((SubLObject)$ic136$, (SubLObject)ConsesLow.cons(module0213.f13918(var154), var133_147));
                    }
                    final SubLObject var12_148 = module0601.$g4652$.currentBinding(var145);
                    final SubLObject var27_149 = module0601.$g4654$.currentBinding(var145);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var145), module0601.$g4652$.getDynamicValue(var145)), var145);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var145), var145);
                        module0601.f36758((SubLObject)$ic137$, var133_147, (SubLObject)T, (SubLObject)NIL);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var145);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic132$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var157, var145);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40518() {
        final SubLObject var82 = $g5256$.getGlobalValue();
        if (NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40519(final SubLObject var74, final SubLObject var70, final SubLObject var71, final SubLObject var75) {
        return module0034.f1829($g5256$.getGlobalValue(), (SubLObject)ConsesLow.list(var74, var70, var71, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40520(final SubLObject var74, final SubLObject var70, final SubLObject var71, SubLObject var75) {
        if (var75 == $ic87$) {
            var75 = $ic93$;
        }
        SubLObject var76 = var70;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            if (NIL != module0259.f16867(var74, var77, var75, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        var76 = var71;
        SubLObject var78 = (SubLObject)NIL;
        var78 = var76.first();
        while (NIL != var76) {
            var76 = var76.rest();
            var78 = var76.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f40491(final SubLObject var74, final SubLObject var70, final SubLObject var71, final SubLObject var75) {
        SubLObject var76 = $g5256$.getGlobalValue();
        if (NIL == var76) {
            var76 = module0034.f1934((SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)NIL, (SubLObject)EQUALP, (SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic140$);
        }
        final SubLObject var77 = module0034.f1780(var74, var70, var71, var75);
        final SubLObject var78 = module0034.f1814(var76, var77, (SubLObject)UNPROVIDED);
        if (var78 != $ic101$) {
            SubLObject var79 = var78;
            SubLObject var80 = (SubLObject)NIL;
            var80 = var79.first();
            while (NIL != var79) {
                SubLObject var81 = var80.first();
                final SubLObject var82 = conses_high.second(var80);
                if (var74.equalp(var81.first())) {
                    var81 = var81.rest();
                    if (var70.equalp(var81.first())) {
                        var81 = var81.rest();
                        if (var71.equalp(var81.first())) {
                            var81 = var81.rest();
                            if (NIL != var81 && NIL == var81.rest() && var75.equalp(var81.first())) {
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
        if (var75 == $ic87$) {
            var75 = $ic92$;
        }
        final SubLObject var76 = f40521(var68);
        SubLObject var77 = (SubLObject)NIL;
        if (NIL == var77) {
            SubLObject var78;
            SubLObject var79;
            for (var78 = var76, var79 = (SubLObject)NIL, var79 = var78.first(); NIL == var77 && NIL != var78; var77 = (SubLObject)makeBoolean(NIL == f40522(var74, var79, var75)), var78 = var78.rest(), var79 = var78.first()) {}
        }
        return (SubLObject)makeBoolean(NIL == var77 && NIL != f40523(var74, var69, var75));
    }
    
    public static SubLObject f40523(final SubLObject var74, final SubLObject var69, final SubLObject var75) {
        final SubLObject var76 = f40521(var69);
        SubLObject var77 = (SubLObject)NIL;
        if (NIL == var77) {
            SubLObject var78;
            SubLObject var79;
            for (var78 = var76, var79 = (SubLObject)NIL, var79 = var78.first(); NIL == var77 && NIL != var78; var77 = (SubLObject)makeBoolean(NIL == f40524(var74, var79, var75)), var78 = var78.rest(), var79 = var78.first()) {}
        }
        return (SubLObject)makeBoolean(NIL == var77);
    }
    
    public static SubLObject f40521(final SubLObject var21) {
        if (module0205.f13132(var21).equal($ic114$)) {
            return module0205.f13207(module0205.f13203(var21, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)((NIL != var21) ? ConsesLow.list(var21) : NIL);
    }
    
    public static SubLObject f40525() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g5257$.getGlobalValue();
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = module0089.f6102($g5259$.getDynamicValue(var7));
            module0089.f6092($g5259$.getDynamicValue(var7));
        }
        finally {
            if (NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic144$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic144$);
            var16 = var14.first();
            var14 = var14.rest();
            if (NIL != var14) {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic144$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40526() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g5258$.getGlobalValue();
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = module0089.f6102($g5260$.getDynamicValue(var7));
            module0089.f6092($g5260$.getDynamicValue(var7));
        }
        finally {
            if (NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic144$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic144$);
            var16 = var14.first();
            var14 = var14.rest();
            if (NIL != var14) {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic144$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40527(final SubLObject var74, final SubLObject var154, final SubLObject var75) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (NIL != module0172.f10917(var74)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = (SubLObject)NIL;
        SubLObject var158 = (SubLObject)NIL;
        final SubLObject var159 = $g5257$.getGlobalValue();
        SubLObject var160 = (SubLObject)NIL;
        try {
            var160 = Locks.seize_lock(var159);
            var155.resetMultipleValues();
            final SubLObject var173_174 = module0089.f6077($g5259$.getDynamicValue(var155), (SubLObject)ConsesLow.list(var154, var75));
            final SubLObject var175_176 = var155.secondMultipleValue();
            var155.resetMultipleValues();
            var157 = var173_174;
            var158 = var175_176;
        }
        finally {
            if (NIL != var160) {
                Locks.release_lock(var159);
            }
        }
        if (NIL != var158) {
            var156 = module0077.f5320(var74, var157);
        }
        return Values.values(var156, var158);
    }
    
    public static SubLObject f40528(final SubLObject var74, final SubLObject var156, final SubLObject var75) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        if (NIL != module0172.f10917(var74)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var158 = (SubLObject)NIL;
        SubLObject var159 = (SubLObject)NIL;
        SubLObject var160 = (SubLObject)NIL;
        final SubLObject var161 = $g5258$.getGlobalValue();
        SubLObject var162 = (SubLObject)NIL;
        try {
            var162 = Locks.seize_lock(var161);
            var157.resetMultipleValues();
            final SubLObject var181_182 = module0089.f6077($g5260$.getDynamicValue(var157), (SubLObject)ConsesLow.list(var156, var75));
            final SubLObject var183_184 = var157.secondMultipleValue();
            var157.resetMultipleValues();
            var159 = var181_182;
            var160 = var183_184;
        }
        finally {
            if (NIL != var162) {
                Locks.release_lock(var161);
            }
        }
        if (NIL != var160) {
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
        if (NIL != var157) {
            return var156;
        }
        if (var154.eql($ic4$)) {
            return (SubLObject)T;
        }
        if (var154.eql($ic147$)) {
            return module0269.f17698(var74, var154, var75);
        }
        if (NIL != module0172.f10917(var74)) {
            return module0259.f16854(var74, var154, var75, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0549.f33910(var154, $ic148$)) {
            f40529(var154, var75);
            return module0259.f16854(var74, var154, var75, (SubLObject)UNPROVIDED);
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
        if (NIL != var159) {
            return var158;
        }
        if (NIL != module0172.f10917(var74)) {
            return module0256.f16596(var74, var156, var75, (SubLObject)UNPROVIDED);
        }
        if (var156.eql($ic4$)) {
            return module0269.f17698(var74, $ic147$, var75);
        }
        if (NIL == module0549.f33910(var156, $ic148$)) {
            f40531(var156, var75);
            return module0256.f16596(var74, var156, var75, (SubLObject)UNPROVIDED);
        }
        f40532(var156, var75);
        return f40528(var74, var156, var75);
    }
    
    public static SubLObject f40529(final SubLObject var163, final SubLObject var75) {
        return module0575.f35270((SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)ConsesLow.list((SubLObject)$ic150$, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var163, var75))));
    }
    
    public static SubLObject f40531(final SubLObject var163, final SubLObject var75) {
        return module0538.f33463((SubLObject)ConsesLow.list((SubLObject)$ic152$, var163, var75));
    }
    
    public static SubLObject f40530(final SubLObject var163, final SubLObject var75) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)NIL;
        final SubLObject var166 = (SubLObject)ConsesLow.list(var163, var75);
        final SubLObject var167 = $g5257$.getGlobalValue();
        SubLObject var168 = (SubLObject)NIL;
        try {
            var168 = Locks.seize_lock(var167);
            if (NIL != module0089.f6077($g5259$.getDynamicValue(var164), var166)) {
                var165 = (SubLObject)T;
            }
        }
        finally {
            if (NIL != var168) {
                Locks.release_lock(var167);
            }
        }
        if (NIL == var165) {
            final SubLObject var169 = module0078.f5367(module0259.f16846(var163, var75, (SubLObject)UNPROVIDED), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            final SubLObject var189_190 = $g5257$.getGlobalValue();
            SubLObject var191_192 = (SubLObject)NIL;
            try {
                var191_192 = Locks.seize_lock(var189_190);
                module0089.f6082($g5259$.getDynamicValue(var164), var166, var169);
            }
            finally {
                if (NIL != var191_192) {
                    Locks.release_lock(var189_190);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40532(final SubLObject var163, final SubLObject var75) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)NIL;
        final SubLObject var166 = (SubLObject)ConsesLow.list(var163, var75);
        final SubLObject var167 = random.random((SubLObject)$ic153$);
        final SubLObject var168 = $g5258$.getGlobalValue();
        SubLObject var169 = (SubLObject)NIL;
        try {
            var169 = Locks.seize_lock(var168);
            var164.resetMultipleValues();
            final SubLObject var170 = module0089.f6077($g5260$.getDynamicValue(var164), var166);
            final SubLObject var171 = var164.secondMultipleValue();
            var164.resetMultipleValues();
            if (NIL != var171) {
                var165 = (SubLObject)T;
            }
        }
        finally {
            if (NIL != var169) {
                Locks.release_lock(var168);
            }
        }
        if (NIL == var165) {
            final SubLObject var172 = module0078.f5367(module0256.f16552(var163, var75, (SubLObject)UNPROVIDED), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            final SubLObject var197_198 = $g5258$.getGlobalValue();
            SubLObject var199_200 = (SubLObject)NIL;
            try {
                var199_200 = Locks.seize_lock(var197_198);
                module0089.f6082($g5260$.getDynamicValue(var164), var166, var172);
            }
            finally {
                if (NIL != var199_200) {
                    Locks.release_lock(var197_198);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40533(final SubLObject var201, final SubLObject var202, SubLObject var75, SubLObject var203) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var203 == UNPROVIDED) {
            var203 = (SubLObject)NIL;
        }
        if (NIL != module0228.f15225(var202) && module0205.f13136(var202).equal($ic114$)) {
            SubLObject var205;
            final SubLObject var204 = var205 = module0205.f13207(module0205.f13203(var202, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            SubLObject var206 = (SubLObject)NIL;
            var206 = var205.first();
            while (NIL != var205) {
                if (NIL == f40533(var201, var206, var75, var203)) {
                    return (SubLObject)NIL;
                }
                var205 = var205.rest();
                var206 = var205.first();
            }
            if (NIL != var204) {
                return (SubLObject)T;
            }
        }
        return module0256.f16596(var201, var202, var75, var203);
    }
    
    public static SubLObject f40534(final SubLObject var206, final SubLObject var207) {
        return Numbers.numG(module0217.f14357(var206), module0217.f14357(var207));
    }
    
    public static SubLObject f40535() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = module0014.f657((SubLObject)$ic154$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)$ic155$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)$ic156$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)$ic157$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var8 = module0014.f657((SubLObject)$ic158$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var8);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40536(final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)T, var17);
            PrintLow.format(module0015.$g131$.getDynamicValue(var17), $g5261$.getGlobalValue(), new SubLObject[] { var15, var16, (NIL != $g5238$.getDynamicValue(var17)) ? $ic6$ : $ic7$ });
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39020($g5262$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var18, var17);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40537(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)T, var19);
            module0642.f39019($g5263$.getGlobalValue());
            final SubLObject var12_208 = module0642.$g4971$.currentBinding(var19);
            try {
                module0642.$g4971$.bind((SubLObject)NIL, var19);
                module0642.f39044(var18);
            }
            finally {
                module0642.$g4971$.rebind(var12_208, var19);
            }
            module0642.f39019($g5264$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40538(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0642.f39104((SubLObject)$ic27$, var20);
        final SubLObject var23 = module0642.f39104((SubLObject)$ic28$, var20);
        final SubLObject var24 = module0038.f2824(module0642.f39104((SubLObject)$ic163$, var20));
        var21.resetMultipleValues();
        final SubLObject var25 = module0038.f2933(var24);
        final SubLObject var26 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        var21.resetMultipleValues();
        final SubLObject var27 = module0038.f2934(var25, (SubLObject)UNPROVIDED);
        final SubLObject var28 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        module0642.f39020((SubLObject)$ic44$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic14$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        f40536(var22, var23);
        f40537(var25);
        f40473((SubLObject)$ic164$);
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g535$.currentBinding(var21);
        try {
            module0015.$g535$.bind((SubLObject)T, var21);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12_213 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var21));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_214 = module0015.$g533$.currentBinding(var21);
                final SubLObject var30 = module0015.$g541$.currentBinding(var21);
                final SubLObject var31 = module0015.$g539$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0015.$g541$.bind((SubLObject)T, var21);
                    module0015.$g539$.bind(module0015.f797(), var21);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic14$);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0644.f39178((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic65$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39019(Environment.get_machine_name((SubLObject)UNPROVIDED));
                    if (NIL != var28) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        final SubLObject var32 = (SubLObject)$ic50$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var32) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var32));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var12_215 = module0015.$g533$.currentBinding(var21);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var21);
                            module0642.f39019((SubLObject)$ic165$);
                        }
                        finally {
                            module0015.$g533$.rebind(var12_215, var21);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var33 = var28;
                        SubLObject var34 = (SubLObject)NIL;
                        var34 = var33.first();
                        while (NIL != var33) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39019(var34);
                            var33 = var33.rest();
                            var34 = var33.first();
                        }
                    }
                    module0642.f39026((SubLObject)UNPROVIDED);
                    if (NIL != var26) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic166$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var33 = var26;
                        SubLObject var35 = (SubLObject)NIL;
                        var35 = var33.first();
                        while (NIL != var33) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39019(var35);
                            var33 = var33.rest();
                            var35 = var33.first();
                        }
                    }
                    else {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic167$);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var12_213, var21);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var29, var21);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40540() {
        $g5237$ = SubLFiles.defparameter("S#44630", (SubLObject)T);
        $g5238$ = SubLFiles.defparameter("S#44631", (SubLObject)NIL);
        $g5239$ = SubLFiles.defparameter("S#44632", (SubLObject)$ic0$);
        $g5240$ = SubLFiles.deflexical("S#44633", (SubLObject)$ic1$);
        $g5241$ = SubLFiles.deflexical("S#44634", (SubLObject)$ic13$);
        $g5242$ = SubLFiles.deflexical("S#44635", (SubLObject)$ic16$);
        $g5243$ = SubLFiles.deflexical("S#44636", (SubLObject)$ic21$);
        $g5244$ = SubLFiles.deflexical("S#44637", (SubLObject)$ic22$);
        $g5245$ = SubLFiles.deflexical("S#44638", (SubLObject)$ic23$);
        $g5246$ = SubLFiles.deflexical("S#44639", (SubLObject)$ic24$);
        $g5247$ = SubLFiles.defparameter("S#44640", (SubLObject)$ic25$);
        $g5248$ = SubLFiles.defparameter("S#44641", (SubLObject)$ic26$);
        $g5249$ = SubLFiles.deflexical("S#44642", (SubLObject)$ic68$);
        $g5250$ = SubLFiles.defparameter("S#44643", (SubLObject)$ic70$);
        $g5251$ = SubLFiles.defparameter("S#44644", (SubLObject)$ic38$);
        $g5252$ = SubLFiles.deflexical("S#44645", (SubLObject)NIL);
        $g5253$ = SubLFiles.deflexical("S#44646", (SubLObject)NIL);
        $g5254$ = SubLFiles.deflexical("S#44647", (SubLObject)NIL);
        $g5255$ = SubLFiles.deflexical("S#44648", (SubLObject)NIL);
        $g5256$ = SubLFiles.deflexical("S#44649", (SubLObject)NIL);
        $g5257$ = SubLFiles.deflexical("S#44650", Locks.make_lock((SubLObject)$ic141$));
        $g5258$ = SubLFiles.deflexical("S#44651", Locks.make_lock((SubLObject)$ic142$));
        $g5259$ = SubLFiles.defparameter("S#44652", module0089.f6070((SubLObject)$ic143$, (SubLObject)EQUAL));
        $g5260$ = SubLFiles.defparameter("S#44653", module0089.f6070((SubLObject)$ic143$, (SubLObject)EQUAL));
        $g5261$ = SubLFiles.deflexical("S#44654", (SubLObject)$ic159$);
        $g5262$ = SubLFiles.deflexical("S#44655", (SubLObject)$ic160$);
        $g5263$ = SubLFiles.deflexical("S#44656", (SubLObject)$ic161$);
        $g5264$ = SubLFiles.deflexical("S#44657", (SubLObject)$ic162$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40541() {
        Hashtables.sethash((SubLObject)$ic17$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic35$);
        module0002.f50((SubLObject)$ic71$, (SubLObject)$ic72$);
        module0002.f38((SubLObject)$ic78$);
        module0015.f877((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0015.f873((SubLObject)$ic78$);
        module0002.f38((SubLObject)$ic89$);
        module0015.f877((SubLObject)$ic89$, (SubLObject)$ic79$);
        module0015.f873((SubLObject)$ic89$);
        module0034.f1909((SubLObject)$ic96$);
        module0034.f1909((SubLObject)$ic102$);
        module0034.f1909((SubLObject)$ic106$);
        module0034.f1909((SubLObject)$ic109$);
        module0034.f1909((SubLObject)$ic138$);
        module0034.f1949((SubLObject)$ic145$);
        module0034.f1953((SubLObject)$ic146$);
        module0015.f873((SubLObject)$ic168$);
        return (SubLObject)NIL;
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
        $g5237$ = null;
        $g5238$ = null;
        $g5239$ = null;
        $g5240$ = null;
        $g5241$ = null;
        $g5242$ = null;
        $g5243$ = null;
        $g5244$ = null;
        $g5245$ = null;
        $g5246$ = null;
        $g5247$ = null;
        $g5248$ = null;
        $g5249$ = null;
        $g5250$ = null;
        $g5251$ = null;
        $g5252$ = null;
        $g5253$ = null;
        $g5254$ = null;
        $g5255$ = null;
        $g5256$ = null;
        $g5257$ = null;
        $g5258$ = null;
        $g5259$ = null;
        $g5260$ = null;
        $g5261$ = null;
        $g5262$ = null;
        $g5263$ = null;
        $g5264$ = null;
        $ic0$ = makeString("completions");
        $ic1$ = makeString("onClick=\"constant_complete('~A', ~A, '~A', ~A, ~A);\"");
        $ic2$ = makeString("Complete");
        $ic3$ = makeSymbol("STRINGP");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic5$ = makeSymbol("FORT-P");
        $ic6$ = makeString("true");
        $ic7$ = makeString("false");
        $ic8$ = makeString("constant_complete('");
        $ic9$ = makeString("', ");
        $ic10$ = makeString(", '");
        $ic11$ = makeString(", ");
        $ic12$ = makeString(");");
        $ic13$ = makeString("onClick=\"cyclify('~A');\"");
        $ic14$ = makeString("Cyclify");
        $ic15$ = makeString("javascript:void('')");
        $ic16$ = makeString("\nvar cgi_program = '~A';\nvar completion_frame_name = '~A';\n");
        $ic17$ = makeKeyword("CONSTANT-COMPLETION");
        $ic18$ = makeString("constant-completion.js");
        $ic19$ = makeString("");
        $ic20$ = makeString("text/javascript");
        $ic21$ = makeString("\nif (window.focus) window.focus();");
        $ic22$ = makeString("\nif (window.opener) window.opener.status = '~A';\n");
        $ic23$ = makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar prefix = '~A';\nvar close_window = ~A;\n");
        $ic24$ = makeString("\nvar old_length = -1;\n\nfunction complete_error(message) {\n  document.open();\n  document.writeln('Error ' + message);\n  document.writeln('Completion links only apply to the page which originally generated them.<p>');\n  document.writeln('That page is no longer available.');\n  document.close();\n  return false;\n}\n\nfunction complete_insert(full_string, submit, chosen) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return complete_error(1);\n  if (!window.opener.document) \n    return complete_error(2);\n  if (!window.opener.document.forms) \n    return complete_error(3);\n  if (!window.opener.document.forms.length) \n    return complete_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return complete_error(5);\n  \n  if (window.opener.focus && chosen) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return complete_error(6);\n  if (!form.elements.length) \n    return complete_error(7);\n  if (form.elements.length < element_number) \n    return complete_error(8);\n\n  var element = form.elements[element_number];\n\n  // @todo remove this\n  //if (!element.value) \n  //  return complete_error(9);\n\n  var old_value = element.value;\n  if (old_length < 0) old_length = old_value.length;\n\n  // now actually do the completion\n  var prefix_length = prefix.length;\n  var full_length = full_string.length;\n  var completion = full_string.substring(prefix_length, full_length);\n  var preamble = old_value.substring(0, (old_length - prefix_length));\n  element.value = preamble + full_string;\n  // if (element.focus) element.focus();\n\n  // submit the form if we are supposed to\n  if (submit)\n    form.submit();\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\nfunction complete_extend(full_string) {\n  return complete_insert(full_string, false, false);\n}\n\nfunction complete_choose(full_string, submit) {\n  return complete_insert(full_string, submit, true);\n}");
        $ic25$ = makeString("\ncomplete_extend('~A');\n");
        $ic26$ = makeString("\ncomplete_choose('~A', ~A);\n");
        $ic27$ = makeString("form");
        $ic28$ = makeString("input");
        $ic29$ = makeString("prefix");
        $ic30$ = makeString("submit");
        $ic31$ = makeString("filter");
        $ic32$ = makeString("choices");
        $ic33$ = makeString("case-insensitive");
        $ic34$ = makeString("lexical");
        $ic35$ = makeSymbol("CB-COMPLETE");
        $ic36$ = makeSymbol("S#12274", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic38$ = makeInteger(50);
        $ic39$ = makeSymbol("CONSTANT-P");
        $ic40$ = makeSymbol("STRING<");
        $ic41$ = makeSymbol("CONSTANT-NAME");
        $ic42$ = makeSymbol("STRING-LESSP");
        $ic43$ = makeSymbol("S#44577", "CYC");
        $ic44$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic45$ = makeString("Exact match plus one longer completion.");
        $ic46$ = makeString("Exact match plus ~S longer completions.");
        $ic47$ = makeString("~S possible ~A.");
        $ic48$ = makeString("suggestions");
        $ic49$ = makeString("Extension: ");
        $ic50$ = makeKeyword("RED");
        $ic51$ = makeString(" Suggestions:");
        $ic52$ = makeString(" Completions:");
        $ic53$ = makeString("Constants (~A):");
        $ic54$ = makeString("Lexical Strings (~A):");
        $ic55$ = makeString("Sole completion (already completed).");
        $ic56$ = makeString("Sole completion.");
        $ic57$ = makeString("Already completed.");
        $ic58$ = makeString("Sole completion:");
        $ic59$ = makeString("No completions.");
        $ic60$ = makeString("No suggestions.");
        $ic61$ = makeString("No completions");
        $ic62$ = makeString("No suggestions");
        $ic63$ = makeString("Suggestions");
        $ic64$ = makeString("Completions");
        $ic65$ = makeString("Machine: ");
        $ic66$ = makeString("Prefix: ");
        $ic67$ = makeString("Filter: ");
        $ic68$ = makeString("onClick=\"complete_choose('~A', ~A);\"");
        $ic69$ = makeString("complete");
        $ic70$ = makeString("var constantCompleteDataSource = new YAHOO.widget.DS_XHR('./cg', ['Term', 'cycl', 'nl']);\n constantCompleteDataSource.scriptQueryParam = 'xml-complete~A&prefix';  \n constantCompleteDataSource.responseType = YAHOO.widget.DS_XHR.TYPE_XML;\n var constantComplete = new YAHOO.widget.AutoComplete('~A', '~A', constantCompleteDataSource);\n constantComplete.allowBrowserAutocomplete = true;  \n constantComplete.autoHighlight = false;\n constantComplete.minQueryLength = ~A;\n constantComplete.animSpeed = 0.1;\n// constantComplete.delimChar = ' '; //this would be good if we were working in just CycL (no lexical completions)\n constantComplete.maxResultsDisplayed=~A;\n constantComplete.queryDelay=0.3;\n constantComplete.embeddedInToolbar=~A;\n\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.itemSelectEvent.subscribe(function (sType, aArgs) { document.getElementById('inputBox').form.submit();}); \n}\n \n constantComplete.formatResult = function(oResultItem, sQuery) {\n   var thisConst = oResultItem[0];\n   var string = oResultItem[1];\n   var sMarkup = string + ' <span class=\"autoCompCycL\">' + thisConst + '</span>'; \n   return (sMarkup);\n };\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.containerExpandEvent.subscribe(function() {\n    if (!this.expandedRows) {\n      this.expandedRows=parent.document.body.rows;\n      var rows = parent.document.body.rows;\n      rows = rows.replace(/.*,.*,/, YAHOO.util.Dom.getDocumentHeight() + ',*,');\n      parent.document.body.rows=rows;\n    }\n   });\n   constantComplete.containerCollapseEvent.subscribe(function() {\n    if (this.expandedRows) { parent.document.body.rows=this.expandedRows; }\n    this.expandedRows = null;\n   });\n }\n");
        $ic71$ = makeSymbol("S#1635", "CYC");
        $ic72$ = makeSymbol("S#44658", "CYC");
        $ic73$ = makeString("&filter=");
        $ic74$ = makeKeyword("SAM-AUTOCOMPLETE");
        $ic75$ = makeString("stylesheet");
        $ic76$ = makeString("text/css");
        $ic77$ = makeKeyword("CB-CYC");
        $ic78$ = makeSymbol("XML-TERM-SEARCH");
        $ic79$ = makeString("text/xml");
        $ic80$ = makeString("searchString");
        $ic81$ = makeString("caseSensitive");
        $ic82$ = makeString("return-attrs");
        $ic83$ = ConsesLow.list((SubLObject)makeKeyword("CYCL"), (SubLObject)makeKeyword("NL"), (SubLObject)makeKeyword("HL-ID"));
        $ic84$ = makeString("timeout");
        $ic85$ = makeString("count");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#44659", "CYC"), (SubLObject)makeSymbol("S#44660", "CYC"), (SubLObject)makeSymbol("S#44661", "CYC"), (SubLObject)makeSymbol("S#44662", "CYC"));
        $ic87$ = makeKeyword("DEFAULT");
        $ic88$ = makeSymbol("S#5859", "CYC");
        $ic89$ = makeSymbol("XML-COMPLETE");
        $ic90$ = ConsesLow.list((SubLObject)makeKeyword("CYCL"), (SubLObject)makeKeyword("NL"));
        $ic91$ = makeString("mt");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic94$ = makeKeyword("TERM-TO-REPLACE");
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic96$ = makeSymbol("S#44587", "CYC");
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic98$ = makeSymbol("S#44645", "CYC");
        $ic99$ = makeInteger(1024);
        $ic100$ = makeSymbol("S#44584", "CYC");
        $ic101$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic102$ = makeSymbol("S#44591", "CYC");
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic104$ = makeSymbol("S#44646", "CYC");
        $ic105$ = makeSymbol("S#44588", "CYC");
        $ic106$ = makeSymbol("S#44595", "CYC");
        $ic107$ = makeSymbol("S#44647", "CYC");
        $ic108$ = makeSymbol("S#44592", "CYC");
        $ic109$ = makeSymbol("S#44599", "CYC");
        $ic110$ = makeKeyword("ISA");
        $ic111$ = makeKeyword("GENLS");
        $ic112$ = makeSymbol("S#44648", "CYC");
        $ic113$ = makeSymbol("S#44596", "CYC");
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersectionFn"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic116$ = makeString("constrainingSentence");
        $ic117$ = makeKeyword("EOF");
        $ic118$ = makeSymbol("S#44604", "CYC");
        $ic119$ = makeSymbol("S#44605", "CYC");
        $ic120$ = makeSymbol("NUMBERP");
        $ic121$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic122$ = makeSymbol("S#44627", "CYC");
        $ic123$ = makeSymbol("FIRST");
        $ic124$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("S#44663", "CYC"));
        $ic125$ = makeKeyword("CYCL");
        $ic126$ = makeKeyword("NL");
        $ic127$ = makeKeyword("DISAMBIG-STRING");
        $ic128$ = makeKeyword("HL-ID");
        $ic129$ = makeString("#$");
        $ic130$ = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $ic131$ = ConsesLow.list((SubLObject)makeString("xmlns:xsi"), (SubLObject)makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)makeString("xsi:schemaLocation"), (SubLObject)makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), (SubLObject)makeString("xmlns:concepts"), (SubLObject)makeString("http://ws.opencyc.org/xsd/CycConcepts"), (SubLObject)makeString("xmlns"), (SubLObject)makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));
        $ic132$ = makeString("ResultSet");
        $ic133$ = makeString("cycl");
        $ic134$ = makeString("nl");
        $ic135$ = makeString("disambigString");
        $ic136$ = makeString("hlId");
        $ic137$ = makeString("Term");
        $ic138$ = makeSymbol("S#44612", "CYC");
        $ic139$ = makeSymbol("S#44649", "CYC");
        $ic140$ = makeSymbol("S#44609", "CYC");
        $ic141$ = makeString("Autocomplete isa cache lock");
        $ic142$ = makeString("Autocomplete genls cache lock");
        $ic143$ = makeInteger(128);
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic145$ = makeSymbol("S#44617", "CYC");
        $ic146$ = makeSymbol("S#44616", "CYC");
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("PhysiologicalCondition"));
        $ic149$ = makeSymbol("S#9950", "CYC");
        $ic150$ = makeSymbol("QUOTE");
        $ic151$ = makeSymbol("S#44624", "CYC");
        $ic152$ = makeSymbol("S#44625", "CYC");
        $ic153$ = makeInteger(1000);
        $ic154$ = makeKeyword("YAHOO-DOM-EVENT");
        $ic155$ = makeKeyword("ANIMATION");
        $ic156$ = makeKeyword("CONNECTION");
        $ic157$ = makeKeyword("DATASOURCE");
        $ic158$ = makeKeyword("AUTOCOMPLETE");
        $ic159$ = makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar close_window = ~A;\n\n");
        $ic160$ = makeString("\nfunction cyclify_error(message) {\n  document.open();\n  document.writeln('Unable to cyclify the input field.<p>');\n  document.writeln('Error: ' + message);\n  document.close();\n  return false;\n}\n\nfunction handle_cyclify(new_string) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return cyclify_error(1);\n  if (!window.opener.document) \n    return cyclify_error(2);\n  if (!window.opener.document.forms) \n    return cyclify_error(3);\n  if (!window.opener.document.forms.length) \n    return cyclify_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return cyclify_error(5);\n  \n  if (window.opener.focus) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return cyclify_error(6);\n  if (!form.elements.length) \n    return cyclify_error(7);\n  if (form.elements.length < element_number) \n    return cyclify_error(8);\n\n  var element = form.elements[element_number];\n\n  if (!element.value) \n    return cyclify_error(9);\n\n  element.value = new_string;\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\n");
        $ic161$ = makeString("\nhandle_cyclify(unescape('");
        $ic162$ = makeString("'));\n");
        $ic163$ = makeString("string");
        $ic164$ = makeString("All valid #$ references have been added.");
        $ic165$ = makeString("Invalid references :");
        $ic166$ = makeString("Added references :");
        $ic167$ = makeString("No references added");
        $ic168$ = makeSymbol("CB-CYCLIFY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1002 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/