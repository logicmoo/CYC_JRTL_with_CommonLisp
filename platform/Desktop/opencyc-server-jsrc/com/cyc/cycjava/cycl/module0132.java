package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0132 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0132";
    public static final String myFingerPrint = "c8287c48409ed3a8f507cd9ca0c0edf59042fe6e2f6a254799f980503958c33d";
    public static SubLSymbol $g1542$;
    public static SubLSymbol $g1543$;
    public static SubLSymbol $g1544$;
    public static SubLSymbol $g1545$;
    public static SubLSymbol $g1546$;
    public static SubLSymbol $g1547$;
    public static SubLSymbol $g1548$;
    public static SubLSymbol $g1549$;
    public static SubLSymbol $g1550$;
    public static SubLSymbol $g1551$;
    public static SubLSymbol $g1552$;
    public static SubLSymbol $g1553$;
    public static SubLSymbol $g1554$;
    public static SubLSymbol $g1555$;
    public static SubLSymbol $g1556$;
    public static SubLSymbol $g1557$;
    public static SubLSymbol $g1558$;
    public static SubLSymbol $g1559$;
    public static SubLSymbol $g1560$;
    public static SubLSymbol $g1561$;
    public static SubLSymbol $g1562$;
    public static SubLSymbol $g1563$;
    public static SubLSymbol $g1564$;
    public static SubLSymbol $g1565$;
    public static SubLSymbol $g1566$;
    public static SubLSymbol $g1567$;
    public static SubLSymbol $g1568$;
    public static SubLSymbol $g1569$;
    public static SubLSymbol $g1570$;
    public static SubLSymbol $g1571$;
    public static SubLSymbol $g1572$;
    public static SubLSymbol $g1573$;
    public static SubLSymbol $g1574$;
    private static SubLSymbol $g1575$;
    private static SubLSymbol $g1576$;
    private static SubLSymbol $g1577$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    
    public static SubLObject f8592(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)$ic0$);
        var5 = var5.rest();
        final SubLObject var9 = (SubLObject)(var5.isCons() ? var5.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)$ic0$);
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && var8.isString()) {
                Errors.error((SubLObject)$ic1$, var8);
            }
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6, var7, var9), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8593(final SubLObject var6, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (NIL != var8) {
            f8594(var6, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8594(final SubLObject var6, final SubLObject var8) {
        return module0067.f4886($g1542$.getGlobalValue(), var6, var8);
    }
    
    public static SubLObject f8595(final SubLObject var10) {
        return module0262.f17336($g1548$.getGlobalValue(), var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8596(final SubLObject var11) {
        return module0004.f104(var11, $g1575$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8597(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0035.f2294($g1576$.getGlobalValue(), var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0035.f2294($g1576$.getGlobalValue(), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var15.isInteger() && var16.isInteger()) {
            return Numbers.numLE(var16, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8598(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0035.f2294($g1576$.getGlobalValue(), var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0035.f2294($g1576$.getGlobalValue(), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var15.isInteger() && var16.isInteger()) {
            return Numbers.numLE(var15, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8599(final SubLObject var13, final SubLObject var14) {
        if (NIL != f8600(var13) && NIL != f8600(var14)) {
            return (SubLObject)T;
        }
        return f8598(var13, var14);
    }
    
    public static SubLObject f8601(final SubLObject var17, final SubLObject var18) {
        SubLObject var19 = var18;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != f8599(var17, var20)) {
                return (SubLObject)T;
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8600(final SubLObject var11) {
        return module0004.f104(var11, $g1577$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8602(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        var22.resetMultipleValues();
        final SubLObject var23 = module0035.f2092(var21, (SubLObject)$ic63$);
        final SubLObject var24 = var22.secondMultipleValue();
        var22.resetMultipleValues();
        if (NIL != var24) {
            return var24;
        }
        final SubLObject var25 = module0035.f2378(var23, (SubLObject)$ic64$, (SubLObject)UNPROVIDED);
        return module0435.f30615(var25);
    }
    
    public static SubLObject f8603(final SubLObject var21) {
        final SubLObject var22 = module0035.remove_if_not((SubLObject)$ic63$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            final SubLObject var23 = module0035.f2378(var22, (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var23);
        }
        return var21;
    }
    
    public static SubLObject f8604(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            final SubLObject var31;
            final SubLObject var30 = var31 = f8602(var29);
            if (NIL == conses_high.member(var31, var27, Symbols.symbol_function((SubLObject)$ic66$), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var27 = (SubLObject)ConsesLow.cons(var31, var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f8605(final SubLObject var21) {
        final SubLObject var22 = module0035.remove_if_not((SubLObject)$ic63$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            final SubLObject var23 = module0035.f2218(var21, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var24 = Sort.sort(var22, (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
            final SubLObject var25 = ConsesLow.nconc(var24, var23);
            return var25;
        }
        return var21;
    }
    
    public static SubLObject f8606() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0132", "f8592", "S#10717");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8593", "S#10718", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8594", "S#10719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8595", "S#10720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8596", "S#10714", 1, 0, false);
        new $f8596$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8597", "S#10721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8598", "S#10722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8599", "S#10723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8601", "S#10724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8600", "S#10715", 1, 0, false);
        new $f8600$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8602", "S#10725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8603", "S#10726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8604", "S#10727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0132", "f8605", "S#10728", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8607() {
        $g1542$ = SubLFiles.deflexical("S#10729", module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g1543$ = SubLFiles.deflexical("S#10730", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g1543$.getGlobalValue() : $ic7$);
        $g1544$ = SubLFiles.deflexical("S#10731", (NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g1544$.getGlobalValue() : $ic7$);
        $g1545$ = SubLFiles.deflexical("S#10732", (NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g1545$.getGlobalValue() : $ic7$);
        $g1546$ = SubLFiles.deflexical("S#10733", (NIL != Symbols.boundp((SubLObject)$ic10$)) ? $g1546$.getGlobalValue() : $ic7$);
        $g1547$ = SubLFiles.deflexical("*CORE-MT-FLOOR*", (NIL != Symbols.boundp((SubLObject)$ic11$)) ? $g1547$.getGlobalValue() : $ic7$);
        $g1548$ = SubLFiles.deflexical("*MT-MT*", (NIL != Symbols.boundp((SubLObject)$ic12$)) ? $g1548$.getGlobalValue() : $ic13$);
        $g1549$ = SubLFiles.deflexical("S#10734", (NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g1549$.getGlobalValue() : $ic7$);
        $g1550$ = SubLFiles.deflexical("S#10735", (NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g1550$.getGlobalValue() : $ic7$);
        $g1551$ = SubLFiles.deflexical("S#10736", (NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g1551$.getGlobalValue() : $ic7$);
        $g1552$ = SubLFiles.deflexical("S#10737", (NIL != Symbols.boundp((SubLObject)$ic21$)) ? $g1552$.getGlobalValue() : $ic7$);
        $g1553$ = SubLFiles.deflexical("S#10738", (NIL != Symbols.boundp((SubLObject)$ic23$)) ? $g1553$.getGlobalValue() : $ic7$);
        $g1554$ = SubLFiles.deflexical("S#10739", (NIL != Symbols.boundp((SubLObject)$ic25$)) ? $g1554$.getGlobalValue() : $ic7$);
        $g1555$ = SubLFiles.deflexical("*ANECT-MT*", (NIL != Symbols.boundp((SubLObject)$ic27$)) ? $g1555$.getGlobalValue() : $ic13$);
        $g1556$ = SubLFiles.deflexical("S#10740", (NIL != Symbols.boundp((SubLObject)$ic29$)) ? $g1556$.getGlobalValue() : $ic7$);
        $g1557$ = SubLFiles.deflexical("S#10741", (NIL != Symbols.boundp((SubLObject)$ic31$)) ? $g1557$.getGlobalValue() : $ic7$);
        $g1558$ = SubLFiles.deflexical("S#10742", (NIL != Symbols.boundp((SubLObject)$ic33$)) ? $g1558$.getGlobalValue() : $ic7$);
        $g1559$ = SubLFiles.deflexical("S#10743", (NIL != Symbols.boundp((SubLObject)$ic35$)) ? $g1559$.getGlobalValue() : $ic7$);
        $g1560$ = SubLFiles.deflexical("S#10744", (NIL != Symbols.boundp((SubLObject)$ic37$)) ? $g1560$.getGlobalValue() : $ic7$);
        $g1561$ = SubLFiles.deflexical("S#10745", (NIL != Symbols.boundp((SubLObject)$ic39$)) ? $g1561$.getGlobalValue() : $ic7$);
        $g1562$ = SubLFiles.deflexical("S#10746", (NIL != Symbols.boundp((SubLObject)$ic41$)) ? $g1562$.getGlobalValue() : $ic7$);
        $g1563$ = SubLFiles.deflexical("S#10747", (NIL != Symbols.boundp((SubLObject)$ic43$)) ? $g1563$.getGlobalValue() : $ic7$);
        $g1564$ = SubLFiles.deflexical("S#10748", (NIL != Symbols.boundp((SubLObject)$ic45$)) ? $g1564$.getGlobalValue() : $ic7$);
        $g1565$ = SubLFiles.deflexical("S#10749", (NIL != Symbols.boundp((SubLObject)$ic47$)) ? $g1565$.getGlobalValue() : $ic13$);
        $g1566$ = SubLFiles.deflexical("S#10750", (NIL != Symbols.boundp((SubLObject)$ic49$)) ? $g1566$.getGlobalValue() : $ic50$);
        $g1567$ = SubLFiles.deflexical("S#10751", (NIL != Symbols.boundp((SubLObject)$ic52$)) ? $g1567$.getGlobalValue() : $ic13$);
        $g1568$ = SubLFiles.deflexical("S#10752", (NIL != Symbols.boundp((SubLObject)$ic54$)) ? $g1568$.getGlobalValue() : $ic7$);
        $g1569$ = SubLFiles.deflexical("S#10753", (NIL != Symbols.boundp((SubLObject)$ic55$)) ? $g1569$.getGlobalValue() : $ic7$);
        $g1570$ = SubLFiles.deflexical("S#10754", (NIL != Symbols.boundp((SubLObject)$ic56$)) ? $g1570$.getGlobalValue() : $ic7$);
        $g1571$ = SubLFiles.deflexical("S#10755", (NIL != Symbols.boundp((SubLObject)$ic57$)) ? $g1571$.getGlobalValue() : $ic7$);
        $g1572$ = SubLFiles.deflexical("S#10756", (NIL != Symbols.boundp((SubLObject)$ic58$)) ? $g1572$.getGlobalValue() : $ic7$);
        $g1573$ = SubLFiles.deflexical("S#10757", (NIL != Symbols.boundp((SubLObject)$ic59$)) ? $g1573$.getGlobalValue() : $ic13$);
        $g1574$ = SubLFiles.defparameter("S#10758", (SubLObject)T);
        $g1575$ = SubLFiles.deflexical("S#10759", (SubLObject)$ic60$);
        $g1576$ = SubLFiles.deflexical("S#10760", (SubLObject)$ic61$);
        $g1577$ = SubLFiles.deflexical("S#10761", (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8608() {
        module0003.f57((SubLObject)$ic6$);
        f8593((SubLObject)$ic6$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic8$);
        f8593((SubLObject)$ic8$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic9$);
        f8593((SubLObject)$ic9$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic10$);
        f8593((SubLObject)$ic10$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic11$);
        f8593((SubLObject)$ic11$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic12$);
        f8593((SubLObject)$ic12$, $ic14$);
        module0003.f57((SubLObject)$ic15$);
        f8593((SubLObject)$ic15$, $ic16$);
        module0003.f57((SubLObject)$ic17$);
        f8593((SubLObject)$ic17$, $ic18$);
        module0003.f57((SubLObject)$ic19$);
        f8593((SubLObject)$ic19$, $ic20$);
        module0003.f57((SubLObject)$ic21$);
        f8593((SubLObject)$ic21$, $ic22$);
        module0003.f57((SubLObject)$ic23$);
        f8593((SubLObject)$ic23$, $ic24$);
        module0003.f57((SubLObject)$ic25$);
        f8593((SubLObject)$ic25$, $ic26$);
        module0003.f57((SubLObject)$ic27$);
        f8593((SubLObject)$ic27$, $ic28$);
        module0003.f57((SubLObject)$ic29$);
        f8593((SubLObject)$ic29$, $ic30$);
        module0003.f57((SubLObject)$ic31$);
        f8593((SubLObject)$ic31$, $ic32$);
        module0003.f57((SubLObject)$ic33$);
        f8593((SubLObject)$ic33$, $ic34$);
        module0003.f57((SubLObject)$ic35$);
        f8593((SubLObject)$ic35$, $ic36$);
        module0003.f57((SubLObject)$ic37$);
        f8593((SubLObject)$ic37$, $ic38$);
        module0003.f57((SubLObject)$ic39$);
        f8593((SubLObject)$ic39$, $ic40$);
        module0003.f57((SubLObject)$ic41$);
        f8593((SubLObject)$ic41$, $ic42$);
        module0003.f57((SubLObject)$ic43$);
        f8593((SubLObject)$ic43$, $ic44$);
        module0003.f57((SubLObject)$ic45$);
        f8593((SubLObject)$ic45$, $ic46$);
        module0003.f57((SubLObject)$ic47$);
        f8593((SubLObject)$ic47$, $ic48$);
        module0003.f57((SubLObject)$ic49$);
        f8593((SubLObject)$ic49$, $ic51$);
        module0003.f57((SubLObject)$ic52$);
        f8593((SubLObject)$ic52$, $ic53$);
        module0003.f57((SubLObject)$ic54$);
        f8593((SubLObject)$ic54$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic55$);
        f8593((SubLObject)$ic55$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic56$);
        f8593((SubLObject)$ic56$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic57$);
        f8593((SubLObject)$ic57$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic58$);
        f8593((SubLObject)$ic58$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic59$);
        f8593((SubLObject)$ic59$, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8606();
    }
    
    public void initializeVariables() {
        f8607();
    }
    
    public void runTopLevelForms() {
        f8608();
    }
    
    static {
        me = (SubLFile)new module0132();
        $g1542$ = null;
        $g1543$ = null;
        $g1544$ = null;
        $g1545$ = null;
        $g1546$ = null;
        $g1547$ = null;
        $g1548$ = null;
        $g1549$ = null;
        $g1550$ = null;
        $g1551$ = null;
        $g1552$ = null;
        $g1553$ = null;
        $g1554$ = null;
        $g1555$ = null;
        $g1556$ = null;
        $g1557$ = null;
        $g1558$ = null;
        $g1559$ = null;
        $g1560$ = null;
        $g1561$ = null;
        $g1562$ = null;
        $g1563$ = null;
        $g1564$ = null;
        $g1565$ = null;
        $g1566$ = null;
        $g1567$ = null;
        $g1568$ = null;
        $g1569$ = null;
        $g1570$ = null;
        $g1571$ = null;
        $g1572$ = null;
        $g1573$ = null;
        $g1574$ = null;
        $g1575$ = null;
        $g1576$ = null;
        $g1577$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#9672", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#291", "CYC"), (SubLObject)makeSymbol("COMMENT"));
        $ic1$ = makeString("Illegal basis argument to defglobal-mt-var: ~s");
        $ic2$ = makeSymbol("PROGN");
        $ic3$ = makeSymbol("DEFGLOBAL-PROTECTED");
        $ic4$ = makeSymbol("S#10718", "CYC");
        $ic5$ = makeSymbol("QUOTE");
        $ic6$ = makeSymbol("S#10730", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic8$ = makeSymbol("S#10731", "CYC");
        $ic9$ = makeSymbol("S#10732", "CYC");
        $ic10$ = makeSymbol("S#10733", "CYC");
        $ic11$ = makeSymbol("*CORE-MT-FLOOR*");
        $ic12$ = makeSymbol("*MT-MT*");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic15$ = makeSymbol("S#10734", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("definingMt"));
        $ic17$ = makeSymbol("S#10735", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("decontextualizedPredicate"));
        $ic19$ = makeSymbol("S#10736", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("decontextualizedCollection"));
        $ic21$ = makeSymbol("S#10737", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("ephemeralTerm"));
        $ic23$ = makeSymbol("S#10738", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic25$ = makeSymbol("S#10739", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceRelatedBookkeepingPredicate"));
        $ic27$ = makeSymbol("*ANECT-MT*");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic29$ = makeSymbol("S#10740", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("BroadMicrotheory"));
        $ic31$ = makeSymbol("S#10741", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("ProblemSolvingCntxt"));
        $ic33$ = makeSymbol("S#10742", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic35$ = makeSymbol("S#10743", "CYC");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("skolem"));
        $ic37$ = makeSymbol("S#10744", "CYC");
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic39$ = makeSymbol("S#10745", "CYC");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic41$ = makeSymbol("S#10746", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic43$ = makeSymbol("S#10747", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic45$ = makeSymbol("S#10748", "CYC");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("subsetOf"));
        $ic47$ = makeSymbol("S#10749", "CYC");
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("arity"));
        $ic49$ = makeSymbol("S#10750", "CYC");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("CycAPIMt"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic52$ = makeSymbol("S#10751", "CYC");
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("notAssertibleMt"));
        $ic54$ = makeSymbol("S#10752", "CYC");
        $ic55$ = makeSymbol("S#10753", "CYC");
        $ic56$ = makeSymbol("S#10754", "CYC");
        $ic57$ = makeSymbol("S#10755", "CYC");
        $ic58$ = makeSymbol("S#10756", "CYC");
        $ic59$ = makeSymbol("S#10757", "CYC");
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LogicalTruthMt")), constant_handles_oc.f8479((SubLObject)makeString("LogicalTruthImplementationMt")), constant_handles_oc.f8479((SubLObject)makeString("CoreCycLMt")), constant_handles_oc.f8479((SubLObject)makeString("CoreCycLImplementationMt")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyImplementationMt")), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")));
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("LogicalTruthMt")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("LogicalTruthImplementationMt")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CoreCycLMt")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CoreCycLImplementationMt")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyImplementationMt")), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), (SubLObject)THREE_INTEGER));
        $ic62$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")));
        $ic63$ = makeSymbol("S#10714", "CYC");
        $ic64$ = makeSymbol("S#10721", "CYC");
        $ic65$ = makeSymbol("S#10722", "CYC");
        $ic66$ = makeSymbol("SETS-EQUAL?");
    }
    
    public static final class $f8596$UnaryFunction extends UnaryFunction
    {
        public $f8596$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10714"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f8596(var12);
        }
    }
    
    public static final class $f8600$UnaryFunction extends UnaryFunction
    {
        public $f8600$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10715"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f8600(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 126 ms
	
	Decompiled with Procyon 0.5.32.
*/