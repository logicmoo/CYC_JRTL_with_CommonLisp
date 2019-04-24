package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var6 = (SubLObject)module0132.NIL;
        SubLObject var7 = (SubLObject)module0132.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0132.$ic0$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0132.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : module0132.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0132.$ic0$);
        var5 = var5.rest();
        final SubLObject var9 = (SubLObject)(var5.isCons() ? var5.first() : module0132.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0132.$ic0$);
        var5 = var5.rest();
        if (module0132.NIL == var5) {
            if (module0132.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && var8.isString()) {
                Errors.error((SubLObject)module0132.$ic1$, var8);
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0132.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0132.$ic3$, var6, var7, var9), (SubLObject)ConsesLow.list((SubLObject)module0132.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0132.$ic5$, var6), var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0132.$ic0$);
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8593(final SubLObject var6, SubLObject var8) {
        if (var8 == module0132.UNPROVIDED) {
            var8 = (SubLObject)module0132.NIL;
        }
        if (module0132.NIL != var8) {
            f8594(var6, var8);
        }
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8594(final SubLObject var6, final SubLObject var8) {
        return module0067.f4886(module0132.$g1542$.getGlobalValue(), var6, var8);
    }
    
    public static SubLObject f8595(final SubLObject var10) {
        return module0262.f17336(module0132.$g1548$.getGlobalValue(), var10, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
    }
    
    public static SubLObject f8596(final SubLObject var11) {
        return module0004.f104(var11, module0132.$g1575$.getGlobalValue(), (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
    }
    
    public static SubLObject f8597(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0035.f2294(module0132.$g1576$.getGlobalValue(), var13, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        final SubLObject var16 = module0035.f2294(module0132.$g1576$.getGlobalValue(), var14, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        if (var15.isInteger() && var16.isInteger()) {
            return Numbers.numLE(var16, var15);
        }
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8598(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0035.f2294(module0132.$g1576$.getGlobalValue(), var13, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        final SubLObject var16 = module0035.f2294(module0132.$g1576$.getGlobalValue(), var14, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        if (var15.isInteger() && var16.isInteger()) {
            return Numbers.numLE(var15, var16);
        }
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8599(final SubLObject var13, final SubLObject var14) {
        if (module0132.NIL != f8600(var13) && module0132.NIL != f8600(var14)) {
            return (SubLObject)module0132.T;
        }
        return f8598(var13, var14);
    }
    
    public static SubLObject f8601(final SubLObject var17, final SubLObject var18) {
        SubLObject var19 = var18;
        SubLObject var20 = (SubLObject)module0132.NIL;
        var20 = var19.first();
        while (module0132.NIL != var19) {
            if (module0132.NIL != f8599(var17, var20)) {
                return (SubLObject)module0132.T;
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8600(final SubLObject var11) {
        return module0004.f104(var11, module0132.$g1577$.getGlobalValue(), (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
    }
    
    public static SubLObject f8602(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        var22.resetMultipleValues();
        final SubLObject var23 = module0035.f2092(var21, (SubLObject)module0132.$ic63$);
        final SubLObject var24 = var22.secondMultipleValue();
        var22.resetMultipleValues();
        if (module0132.NIL != var24) {
            return var24;
        }
        final SubLObject var25 = module0035.f2378(var23, (SubLObject)module0132.$ic64$, (SubLObject)module0132.UNPROVIDED);
        return module0435.f30615(var25);
    }
    
    public static SubLObject f8603(final SubLObject var21) {
        final SubLObject var22 = module0035.remove_if_not((SubLObject)module0132.$ic63$, var21, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        if (module0132.NIL != var22) {
            final SubLObject var23 = module0035.f2378(var22, (SubLObject)module0132.$ic65$, (SubLObject)module0132.UNPROVIDED);
            return (SubLObject)ConsesLow.list(var23);
        }
        return var21;
    }
    
    public static SubLObject f8604(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0132.NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)module0132.NIL;
        var29 = var28.first();
        while (module0132.NIL != var28) {
            final SubLObject var31;
            final SubLObject var30 = var31 = f8602(var29);
            if (module0132.NIL == conses_high.member(var31, var27, Symbols.symbol_function((SubLObject)module0132.$ic66$), Symbols.symbol_function((SubLObject)module0132.IDENTITY))) {
                var27 = (SubLObject)ConsesLow.cons(var31, var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f8605(final SubLObject var21) {
        final SubLObject var22 = module0035.remove_if_not((SubLObject)module0132.$ic63$, var21, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
        if (module0132.NIL != var22) {
            final SubLObject var23 = module0035.f2218(var21, var22, (SubLObject)module0132.UNPROVIDED, (SubLObject)module0132.UNPROVIDED);
            final SubLObject var24 = Sort.sort(var22, (SubLObject)module0132.$ic65$, (SubLObject)module0132.UNPROVIDED);
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
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8607() {
        module0132.$g1542$ = SubLFiles.deflexical("S#10729", module0067.f4880(Symbols.symbol_function((SubLObject)module0132.EQL), (SubLObject)module0132.UNPROVIDED));
        module0132.$g1543$ = SubLFiles.deflexical("S#10730", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic6$)) ? module0132.$g1543$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1544$ = SubLFiles.deflexical("S#10731", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic8$)) ? module0132.$g1544$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1545$ = SubLFiles.deflexical("S#10732", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic9$)) ? module0132.$g1545$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1546$ = SubLFiles.deflexical("S#10733", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic10$)) ? module0132.$g1546$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1547$ = SubLFiles.deflexical("*CORE-MT-FLOOR*", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic11$)) ? module0132.$g1547$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1548$ = SubLFiles.deflexical("*MT-MT*", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic12$)) ? module0132.$g1548$.getGlobalValue() : module0132.$ic13$);
        module0132.$g1549$ = SubLFiles.deflexical("S#10734", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic15$)) ? module0132.$g1549$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1550$ = SubLFiles.deflexical("S#10735", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic17$)) ? module0132.$g1550$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1551$ = SubLFiles.deflexical("S#10736", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic19$)) ? module0132.$g1551$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1552$ = SubLFiles.deflexical("S#10737", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic21$)) ? module0132.$g1552$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1553$ = SubLFiles.deflexical("S#10738", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic23$)) ? module0132.$g1553$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1554$ = SubLFiles.deflexical("S#10739", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic25$)) ? module0132.$g1554$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1555$ = SubLFiles.deflexical("*ANECT-MT*", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic27$)) ? module0132.$g1555$.getGlobalValue() : module0132.$ic13$);
        module0132.$g1556$ = SubLFiles.deflexical("S#10740", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic29$)) ? module0132.$g1556$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1557$ = SubLFiles.deflexical("S#10741", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic31$)) ? module0132.$g1557$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1558$ = SubLFiles.deflexical("S#10742", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic33$)) ? module0132.$g1558$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1559$ = SubLFiles.deflexical("S#10743", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic35$)) ? module0132.$g1559$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1560$ = SubLFiles.deflexical("S#10744", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic37$)) ? module0132.$g1560$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1561$ = SubLFiles.deflexical("S#10745", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic39$)) ? module0132.$g1561$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1562$ = SubLFiles.deflexical("S#10746", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic41$)) ? module0132.$g1562$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1563$ = SubLFiles.deflexical("S#10747", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic43$)) ? module0132.$g1563$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1564$ = SubLFiles.deflexical("S#10748", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic45$)) ? module0132.$g1564$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1565$ = SubLFiles.deflexical("S#10749", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic47$)) ? module0132.$g1565$.getGlobalValue() : module0132.$ic13$);
        module0132.$g1566$ = SubLFiles.deflexical("S#10750", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic49$)) ? module0132.$g1566$.getGlobalValue() : module0132.$ic50$);
        module0132.$g1567$ = SubLFiles.deflexical("S#10751", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic52$)) ? module0132.$g1567$.getGlobalValue() : module0132.$ic13$);
        module0132.$g1568$ = SubLFiles.deflexical("S#10752", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic54$)) ? module0132.$g1568$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1569$ = SubLFiles.deflexical("S#10753", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic55$)) ? module0132.$g1569$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1570$ = SubLFiles.deflexical("S#10754", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic56$)) ? module0132.$g1570$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1571$ = SubLFiles.deflexical("S#10755", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic57$)) ? module0132.$g1571$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1572$ = SubLFiles.deflexical("S#10756", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic58$)) ? module0132.$g1572$.getGlobalValue() : module0132.$ic7$);
        module0132.$g1573$ = SubLFiles.deflexical("S#10757", (module0132.NIL != Symbols.boundp((SubLObject)module0132.$ic59$)) ? module0132.$g1573$.getGlobalValue() : module0132.$ic13$);
        module0132.$g1574$ = SubLFiles.defparameter("S#10758", (SubLObject)module0132.T);
        module0132.$g1575$ = SubLFiles.deflexical("S#10759", (SubLObject)module0132.$ic60$);
        module0132.$g1576$ = SubLFiles.deflexical("S#10760", (SubLObject)module0132.$ic61$);
        module0132.$g1577$ = SubLFiles.deflexical("S#10761", (SubLObject)module0132.$ic62$);
        return (SubLObject)module0132.NIL;
    }
    
    public static SubLObject f8608() {
        module0003.f57((SubLObject)module0132.$ic6$);
        f8593((SubLObject)module0132.$ic6$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic8$);
        f8593((SubLObject)module0132.$ic8$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic9$);
        f8593((SubLObject)module0132.$ic9$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic10$);
        f8593((SubLObject)module0132.$ic10$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic11$);
        f8593((SubLObject)module0132.$ic11$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic12$);
        f8593((SubLObject)module0132.$ic12$, module0132.$ic14$);
        module0003.f57((SubLObject)module0132.$ic15$);
        f8593((SubLObject)module0132.$ic15$, module0132.$ic16$);
        module0003.f57((SubLObject)module0132.$ic17$);
        f8593((SubLObject)module0132.$ic17$, module0132.$ic18$);
        module0003.f57((SubLObject)module0132.$ic19$);
        f8593((SubLObject)module0132.$ic19$, module0132.$ic20$);
        module0003.f57((SubLObject)module0132.$ic21$);
        f8593((SubLObject)module0132.$ic21$, module0132.$ic22$);
        module0003.f57((SubLObject)module0132.$ic23$);
        f8593((SubLObject)module0132.$ic23$, module0132.$ic24$);
        module0003.f57((SubLObject)module0132.$ic25$);
        f8593((SubLObject)module0132.$ic25$, module0132.$ic26$);
        module0003.f57((SubLObject)module0132.$ic27$);
        f8593((SubLObject)module0132.$ic27$, module0132.$ic28$);
        module0003.f57((SubLObject)module0132.$ic29$);
        f8593((SubLObject)module0132.$ic29$, module0132.$ic30$);
        module0003.f57((SubLObject)module0132.$ic31$);
        f8593((SubLObject)module0132.$ic31$, module0132.$ic32$);
        module0003.f57((SubLObject)module0132.$ic33$);
        f8593((SubLObject)module0132.$ic33$, module0132.$ic34$);
        module0003.f57((SubLObject)module0132.$ic35$);
        f8593((SubLObject)module0132.$ic35$, module0132.$ic36$);
        module0003.f57((SubLObject)module0132.$ic37$);
        f8593((SubLObject)module0132.$ic37$, module0132.$ic38$);
        module0003.f57((SubLObject)module0132.$ic39$);
        f8593((SubLObject)module0132.$ic39$, module0132.$ic40$);
        module0003.f57((SubLObject)module0132.$ic41$);
        f8593((SubLObject)module0132.$ic41$, module0132.$ic42$);
        module0003.f57((SubLObject)module0132.$ic43$);
        f8593((SubLObject)module0132.$ic43$, module0132.$ic44$);
        module0003.f57((SubLObject)module0132.$ic45$);
        f8593((SubLObject)module0132.$ic45$, module0132.$ic46$);
        module0003.f57((SubLObject)module0132.$ic47$);
        f8593((SubLObject)module0132.$ic47$, module0132.$ic48$);
        module0003.f57((SubLObject)module0132.$ic49$);
        f8593((SubLObject)module0132.$ic49$, module0132.$ic51$);
        module0003.f57((SubLObject)module0132.$ic52$);
        f8593((SubLObject)module0132.$ic52$, module0132.$ic53$);
        module0003.f57((SubLObject)module0132.$ic54$);
        f8593((SubLObject)module0132.$ic54$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic55$);
        f8593((SubLObject)module0132.$ic55$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic56$);
        f8593((SubLObject)module0132.$ic56$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic57$);
        f8593((SubLObject)module0132.$ic57$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic58$);
        f8593((SubLObject)module0132.$ic58$, (SubLObject)module0132.NIL);
        module0003.f57((SubLObject)module0132.$ic59$);
        f8593((SubLObject)module0132.$ic59$, (SubLObject)module0132.NIL);
        return (SubLObject)module0132.NIL;
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
        module0132.$g1542$ = null;
        module0132.$g1543$ = null;
        module0132.$g1544$ = null;
        module0132.$g1545$ = null;
        module0132.$g1546$ = null;
        module0132.$g1547$ = null;
        module0132.$g1548$ = null;
        module0132.$g1549$ = null;
        module0132.$g1550$ = null;
        module0132.$g1551$ = null;
        module0132.$g1552$ = null;
        module0132.$g1553$ = null;
        module0132.$g1554$ = null;
        module0132.$g1555$ = null;
        module0132.$g1556$ = null;
        module0132.$g1557$ = null;
        module0132.$g1558$ = null;
        module0132.$g1559$ = null;
        module0132.$g1560$ = null;
        module0132.$g1561$ = null;
        module0132.$g1562$ = null;
        module0132.$g1563$ = null;
        module0132.$g1564$ = null;
        module0132.$g1565$ = null;
        module0132.$g1566$ = null;
        module0132.$g1567$ = null;
        module0132.$g1568$ = null;
        module0132.$g1569$ = null;
        module0132.$g1570$ = null;
        module0132.$g1571$ = null;
        module0132.$g1572$ = null;
        module0132.$g1573$ = null;
        module0132.$g1574$ = null;
        module0132.$g1575$ = null;
        module0132.$g1576$ = null;
        module0132.$g1577$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#291", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $ic1$ = SubLObjectFactory.makeString("Illegal basis argument to defglobal-mt-var: ~s");
        $ic2$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic3$ = SubLObjectFactory.makeSymbol("DEFGLOBAL-PROTECTED");
        $ic4$ = SubLObjectFactory.makeSymbol("S#10718", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic6$ = SubLObjectFactory.makeSymbol("S#10730", "CYC");
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#10731", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#10732", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10733", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("*CORE-MT-FLOOR*");
        $ic12$ = SubLObjectFactory.makeSymbol("*MT-MT*");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#10734", "CYC");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#10735", "CYC");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#10736", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#10737", "CYC");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ephemeralTerm"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#10738", "CYC");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#10739", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate"));
        $ic27$ = SubLObjectFactory.makeSymbol("*ANECT-MT*");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#10740", "CYC");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#10741", "CYC");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#10742", "CYC");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#10743", "CYC");
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("skolem"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#10744", "CYC");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#10745", "CYC");
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#10746", "CYC");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#10747", "CYC");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#10748", "CYC");
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subsetOf"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#10749", "CYC");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arity"));
        $ic49$ = SubLObjectFactory.makeSymbol("S#10750", "CYC");
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $ic52$ = SubLObjectFactory.makeSymbol("S#10751", "CYC");
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertibleMt"));
        $ic54$ = SubLObjectFactory.makeSymbol("S#10752", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#10753", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#10754", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#10755", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#10756", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#10757", "CYC");
        $ic60$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalTruthMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalTruthImplementationMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoreCycLMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoreCycLImplementationMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalTruthMt")), (SubLObject)module0132.ZERO_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalTruthImplementationMt")), (SubLObject)module0132.ZERO_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoreCycLMt")), (SubLObject)module0132.ONE_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoreCycLImplementationMt")), (SubLObject)module0132.ONE_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)module0132.TWO_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt")), (SubLObject)module0132.TWO_INTEGER), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)module0132.THREE_INTEGER));
        $ic62$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $ic63$ = SubLObjectFactory.makeSymbol("S#10714", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#10721", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#10722", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
    }
    
    public static final class $f8596$UnaryFunction extends UnaryFunction
    {
        public $f8596$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10714"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0132.f8596(var12);
        }
    }
    
    public static final class $f8600$UnaryFunction extends UnaryFunction
    {
        public $f8600$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10715"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0132.f8600(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0132.class
	Total time: 126 ms
	
	Decompiled with Procyon 0.5.32.
*/