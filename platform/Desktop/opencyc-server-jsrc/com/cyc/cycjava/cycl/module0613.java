package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0613 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0613";
    public static final String myFingerPrint = "48f2f33cbf99456cd07743e7eb3f17e860cda86bac69a55bc043b5aff578020c";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
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
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    
    public static SubLObject f37584(final SubLObject var1) {
        if (NIL != module0612.f37382(var1) && $ic1$.eql(module0612.f37425(var1))) {
            final SubLObject var2 = module0144.f9460();
            return Equality.eq(var2, module0612.f37444(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37585(final SubLObject var3, final SubLObject var4) {
        if (NIL == module0612.f37382(var3) || NIL == module0615.f37703(var4)) {
            module0229.f15259();
        }
        final SubLObject var5 = module0612.f37453(var3, var4);
        if (NIL == var5) {
            module0229.f15259();
        }
        return var5;
    }
    
    public static SubLObject f37586(final SubLObject var3, final SubLObject var4) {
        if (NIL == module0131.f8566()) {
            Errors.error((SubLObject)$ic3$);
        }
        if (NIL == module0612.f37382(var3) || NIL == module0615.f37703(var4)) {
            module0229.f15259();
        }
        final SubLObject var5 = module0612.f37450(var3, var4);
        if (NIL == var5) {
            module0229.f15259();
        }
        return var5;
    }
    
    public static SubLObject f37587(final SubLObject var6) {
        if (!var6.isInteger()) {
            module0229.f15259();
        }
        return module0612.f37514(var6);
    }
    
    public static SubLObject f37588(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        return module0614.f37640(var3);
    }
    
    public static SubLObject f37589(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        return module0614.f37641(var3);
    }
    
    public static SubLObject f37590(final SubLObject var7, final SubLObject var3) {
        if (!var7.isString() || NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var8 = module0612.f37575(var7, var3);
        if (NIL == var8) {
            module0229.f15259();
        }
        return var8;
    }
    
    public static SubLObject f37591(final SubLObject var7, final SubLObject var8) {
        if (!var7.isString() || !var8.isString()) {
            module0229.f15259();
        }
        final SubLObject var9 = module0612.f37577(var7, var8);
        if (NIL == var9) {
            module0229.f15259();
        }
        return var9;
    }
    
    public static SubLObject f37592(final SubLObject var8) {
        if (!var8.isString()) {
            module0229.f15259();
        }
        final SubLObject var9 = module0612.f37578(var8);
        if (NIL != module0035.f1995(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var9.first();
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37593(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37449(var3);
        if (NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37594(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37481(var3);
        if (NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37595(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37480(var3);
        if (NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37596(final SubLObject var7, final SubLObject var11) {
        if (!var7.isString() || NIL == module0202.f12590(var11) || NIL == module0004.f104(module0205.f13136(var11), (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var12 = module0612.f37579(var7, var11);
        if (NIL == var12) {
            module0229.f15259();
        }
        return var12;
    }
    
    public static SubLObject f37597(final SubLObject var7, final SubLObject var12) {
        if (!var7.isString() || !var12.isString()) {
            module0229.f15259();
        }
        final SubLObject var13 = module0612.f37580(var7, var12);
        if (NIL == var13) {
            module0229.f15259();
        }
        return var13;
    }
    
    public static SubLObject f37598(final SubLObject var13) {
        final SubLObject var14 = Functions.funcall((SubLObject)makeSymbol("S#41273", "CYC"), var13);
        if ($ic17$.eql(var14)) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        return var14;
    }
    
    public static SubLObject f37599(SubLObject var15, SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var15 = module0612.f37519(var15);
        var16 = module0612.f37519(var16);
        if (NIL != module0612.f37387(var15) && NIL != module0612.f37387(var16)) {
            return module0612.f37487(var16, var15);
        }
        if (NIL == module0259.f16854(var15, $ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL == module0259.f16854(var16, $ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0229.f15259();
        }
        if (NIL != module0328.f22184(var15, var16, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0328.f22187(var15, var16, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = module0145.$g1942$.currentBinding(var17);
        try {
            module0145.$g1942$.bind((SubLObject)T, var17);
            var18 = module0315.f21297($ic20$, var15, var16, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var19, var17);
        }
        return (NIL != var18) ? var18 : module0229.f15259();
    }
    
    public static SubLObject f37600(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        var21.resetMultipleValues();
        final SubLObject var22 = module0612.f37493(var19, var20);
        final SubLObject var23 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        if (NIL == var23) {
            module0229.f15259();
        }
        return var22;
    }
    
    public static SubLObject f37601(final SubLObject var19, final SubLObject var20) {
        if (NIL == module0612.f37382(var19) || NIL == module0612.f37382(var20)) {
            module0229.f15259();
        }
        return module0612.f37500(var19, var20, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37602(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37444(var3);
        if (NIL == var4) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37603(final SubLObject var23, final SubLObject var3) {
        if (NIL == module0612.f37439(var23) || NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37448(var23, var3);
        if (NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37604(final SubLObject var23, final SubLObject var3) {
        if (NIL == module0612.f37439(var23) || NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37451(var23, var3);
        if (NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37605(final SubLObject var23, final SubLObject var3) {
        if (NIL == module0612.f37439(var23) || NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37452(var23, var3);
        if (NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37606(final SubLObject var23, final SubLObject var3) {
        if (NIL == module0612.f37439(var23) || NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37454(var23, var3);
        if (NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37607(final SubLObject var24) {
        if (NIL == var24) {
            module0229.f15259();
        }
        final SubLObject var25 = module0612.f37532(var24);
        if (NIL == var25) {
            module0229.f15259();
        }
        return var25;
    }
    
    public static SubLObject f37608(final SubLObject var24) {
        if (NIL == var24) {
            module0229.f15259();
        }
        final SubLObject var25 = module0612.f37533(var24, (SubLObject)UNPROVIDED);
        if (NIL == var25) {
            module0229.f15259();
        }
        return var25;
    }
    
    public static SubLObject f37609(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37400(var3);
        if (!var4.isInteger()) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37610(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37401(var3);
        if (NIL == constant_handles_oc.f8449(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37611(final SubLObject var3) {
        if (NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37404(var3);
        if (!var4.isInteger()) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37612(final SubLObject var27) {
        if (NIL == module0035.f2000(var27, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) || NIL == module0035.f2192((SubLObject)$ic34$, var27)) {
            module0229.f15259();
        }
        final SubLObject var28 = Sort.sort(f37613(module0035.f2269(conses_high.copy_list(var27), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        if (NIL == var28) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var28)) {
            return var28.first();
        }
        return module0202.f12683($ic36$, (SubLObject)ConsesLow.list(var28.first(), module0035.f2114(var28)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37613(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var13 = (SubLObject)NIL;
            if (NIL == var13) {
                SubLObject var14 = Sequences.remove(var12, var9, (SubLObject)EQUAL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var15 = (SubLObject)NIL;
                var15 = var14.first();
                while (NIL == var13 && NIL != var14) {
                    if (NIL != f37600(var15, var12)) {
                        var13 = (SubLObject)T;
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
            if (NIL == var13) {
                var10 = (SubLObject)ConsesLow.cons(var12, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var10;
    }
    
    public static SubLObject f37614() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37584", "CYC-DAY-OF-WEEK-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37585", "CYC-DATE-AFTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37586", "CYC-DATE-BEFORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37587", "CYC-DATE-FROM-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37588", "CYC-DATE-INITIAL-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37589", "CYC-DATE-FINAL-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37590", "CYC-DATE-ENCODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37591", "CYC-DATE-DECODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37592", "CYC-DATE-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37593", "CYC-DAY-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37594", "CYC-HOUR-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37595", "CYC-MINUTE-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37596", "CYC-TIME-ELAPSED-ENCODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37597", "CYC-TIME-ELAPSED-DECODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37598", "CYC-TIME-INTERVAL-OF-SPEC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37599", "CYC-LATER-THAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37600", "CYC-DATE-SUBSUMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37601", "CYC-TIME-ELAPSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37602", "CYC-DAY-OF-WEEK-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37603", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37604", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37605", "CYC-DAY-OF-WEEK-AFTER-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37606", "CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37607", "CYC-CURRENT-ITERATED-CYCLIC-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37608", "CYC-NEXT-ITERATED-CYCLIC-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37609", "CYC-YEAR-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37610", "CYC-MONTH-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37611", "CYC-DAY-NUMBER-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37612", "CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0613", "f37613", "S#41274", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37615() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37616() {
        if ($ic0$.isSymbol()) {
            final SubLObject var32 = (SubLObject)$ic0$;
            if (NIL == conses_high.member(var32, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var32, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic0$);
        module0012.f416((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic4$);
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic6$);
        module0012.f416((SubLObject)$ic7$);
        module0012.f416((SubLObject)$ic8$);
        module0012.f416((SubLObject)$ic9$);
        module0012.f416((SubLObject)$ic10$);
        module0012.f416((SubLObject)$ic11$);
        module0012.f416((SubLObject)$ic12$);
        module0012.f416((SubLObject)$ic13$);
        module0012.f416((SubLObject)$ic15$);
        module0012.f416((SubLObject)$ic16$);
        module0012.f416((SubLObject)$ic18$);
        module0012.f416((SubLObject)$ic21$);
        module0012.f416((SubLObject)$ic22$);
        module0012.f416((SubLObject)$ic23$);
        module0012.f416((SubLObject)$ic24$);
        module0012.f416((SubLObject)$ic25$);
        module0012.f416((SubLObject)$ic26$);
        module0012.f416((SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic28$);
        module0012.f416((SubLObject)$ic29$);
        module0012.f416((SubLObject)$ic30$);
        module0012.f416((SubLObject)$ic31$);
        module0012.f416((SubLObject)$ic32$);
        module0012.f416((SubLObject)$ic33$);
        module0012.f416((SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37614();
    }
    
    public void initializeVariables() {
        f37615();
    }
    
    public void runTopLevelForms() {
        f37616();
    }
    
    static {
        me = (SubLFile)new module0613();
        $ic0$ = makeSymbol("CYC-DAY-OF-WEEK-DEFN");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarDay"));
        $ic2$ = makeSymbol("CYC-DATE-AFTER");
        $ic3$ = makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");
        $ic4$ = makeSymbol("CYC-DATE-BEFORE");
        $ic5$ = makeSymbol("CYC-DATE-FROM-INTEGER");
        $ic6$ = makeSymbol("CYC-DATE-INITIAL-SECOND");
        $ic7$ = makeSymbol("CYC-DATE-FINAL-SECOND");
        $ic8$ = makeSymbol("CYC-DATE-ENCODE-STRING");
        $ic9$ = makeSymbol("CYC-DATE-DECODE-STRING");
        $ic10$ = makeSymbol("CYC-DATE-FROM-STRING");
        $ic11$ = makeSymbol("CYC-DAY-OF-DATE");
        $ic12$ = makeSymbol("CYC-HOUR-OF-DATE");
        $ic13$ = makeSymbol("CYC-MINUTE-OF-DATE");
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HoursDuration")), constant_handles_oc.f8479((SubLObject)makeString("MinutesDuration")), constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")));
        $ic15$ = makeSymbol("CYC-TIME-ELAPSED-ENCODE-STRING");
        $ic16$ = makeSymbol("CYC-TIME-ELAPSED-DECODE-STRING");
        $ic17$ = makeKeyword("FAIL");
        $ic18$ = makeSymbol("CYC-TIME-INTERVAL-OF-SPEC-STRING");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("Date"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("laterThan"));
        $ic21$ = makeSymbol("CYC-LATER-THAN");
        $ic22$ = makeSymbol("CYC-DATE-SUBSUMES");
        $ic23$ = makeSymbol("CYC-TIME-ELAPSED");
        $ic24$ = makeSymbol("CYC-DAY-OF-WEEK-OF-DATE");
        $ic25$ = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE");
        $ic26$ = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE");
        $ic27$ = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE");
        $ic28$ = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE");
        $ic29$ = makeSymbol("CYC-CURRENT-ITERATED-CYCLIC-INTERVAL");
        $ic30$ = makeSymbol("CYC-NEXT-ITERATED-CYCLIC-INTERVAL");
        $ic31$ = makeSymbol("CYC-YEAR-OF-DATE");
        $ic32$ = makeSymbol("CYC-MONTH-OF-DATE");
        $ic33$ = makeSymbol("CYC-DAY-NUMBER-OF-DATE");
        $ic34$ = makeSymbol("S#24728", "CYC");
        $ic35$ = makeSymbol("S#20158", "CYC");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic37$ = makeSymbol("CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 147 ms
	
	Decompiled with Procyon 0.5.32.
*/