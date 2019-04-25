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
        if (module0613.NIL != module0612.f37382(var1) && module0613.$ic1$.eql(module0612.f37425(var1))) {
            final SubLObject var2 = module0144.f9460();
            return Equality.eq(var2, module0612.f37444(var1));
        }
        return (SubLObject)module0613.NIL;
    }
    
    public static SubLObject f37585(final SubLObject var3, final SubLObject var4) {
        if (module0613.NIL == module0612.f37382(var3) || module0613.NIL == module0615.f37703(var4)) {
            module0229.f15259();
        }
        final SubLObject var5 = module0612.f37453(var3, var4);
        if (module0613.NIL == var5) {
            module0229.f15259();
        }
        return var5;
    }
    
    public static SubLObject f37586(final SubLObject var3, final SubLObject var4) {
        if (module0613.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0613.$ic3$);
        }
        if (module0613.NIL == module0612.f37382(var3) || module0613.NIL == module0615.f37703(var4)) {
            module0229.f15259();
        }
        final SubLObject var5 = module0612.f37450(var3, var4);
        if (module0613.NIL == var5) {
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
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        return module0614.f37640(var3);
    }
    
    public static SubLObject f37589(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        return module0614.f37641(var3);
    }
    
    public static SubLObject f37590(final SubLObject var7, final SubLObject var3) {
        if (!var7.isString() || module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var8 = module0612.f37575(var7, var3);
        if (module0613.NIL == var8) {
            module0229.f15259();
        }
        return var8;
    }
    
    public static SubLObject f37591(final SubLObject var7, final SubLObject var8) {
        if (!var7.isString() || !var8.isString()) {
            module0229.f15259();
        }
        final SubLObject var9 = module0612.f37577(var7, var8);
        if (module0613.NIL == var9) {
            module0229.f15259();
        }
        return var9;
    }
    
    public static SubLObject f37592(final SubLObject var8) {
        if (!var8.isString()) {
            module0229.f15259();
        }
        final SubLObject var9 = module0612.f37578(var8);
        if (module0613.NIL != module0035.f1995(var9, (SubLObject)module0613.ONE_INTEGER, (SubLObject)module0613.UNPROVIDED)) {
            return var9.first();
        }
        module0229.f15259();
        return (SubLObject)module0613.NIL;
    }
    
    public static SubLObject f37593(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37449(var3);
        if (module0613.NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37594(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37481(var3);
        if (module0613.NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37595(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37480(var3);
        if (module0613.NIL == module0172.f10917(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37596(final SubLObject var7, final SubLObject var11) {
        if (!var7.isString() || module0613.NIL == module0202.f12590(var11) || module0613.NIL == module0004.f104(module0205.f13136(var11), (SubLObject)module0613.$ic14$, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var12 = module0612.f37579(var7, var11);
        if (module0613.NIL == var12) {
            module0229.f15259();
        }
        return var12;
    }
    
    public static SubLObject f37597(final SubLObject var7, final SubLObject var12) {
        if (!var7.isString() || !var12.isString()) {
            module0229.f15259();
        }
        final SubLObject var13 = module0612.f37580(var7, var12);
        if (module0613.NIL == var13) {
            module0229.f15259();
        }
        return var13;
    }
    
    public static SubLObject f37598(final SubLObject var13) {
        final SubLObject var14 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#41273", "CYC"), var13);
        if (module0613.$ic17$.eql(var14)) {
            module0229.f15259();
            return (SubLObject)module0613.NIL;
        }
        return var14;
    }
    
    public static SubLObject f37599(SubLObject var15, SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var15 = module0612.f37519(var15);
        var16 = module0612.f37519(var16);
        if (module0613.NIL != module0612.f37387(var15) && module0613.NIL != module0612.f37387(var16)) {
            return module0612.f37487(var16, var15);
        }
        if (module0613.NIL == module0259.f16854(var15, module0613.$ic19$, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED) || module0613.NIL == module0259.f16854(var16, module0613.$ic19$, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED)) {
            return module0229.f15259();
        }
        if (module0613.NIL != module0328.f22184(var15, var16, (SubLObject)module0613.UNPROVIDED)) {
            return (SubLObject)module0613.T;
        }
        if (module0613.NIL != module0328.f22187(var15, var16, (SubLObject)module0613.UNPROVIDED)) {
            return (SubLObject)module0613.NIL;
        }
        SubLObject var18 = (SubLObject)module0613.NIL;
        final SubLObject var19 = module0145.$g1942$.currentBinding(var17);
        try {
            module0145.$g1942$.bind((SubLObject)module0613.T, var17);
            var18 = module0315.f21297(module0613.$ic20$, var15, var16, (SubLObject)module0613.UNPROVIDED);
        }
        finally {
            module0145.$g1942$.rebind(var19, var17);
        }
        return (module0613.NIL != var18) ? var18 : module0229.f15259();
    }
    
    public static SubLObject f37600(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        var21.resetMultipleValues();
        final SubLObject var22 = module0612.f37493(var19, var20);
        final SubLObject var23 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        if (module0613.NIL == var23) {
            module0229.f15259();
        }
        return var22;
    }
    
    public static SubLObject f37601(final SubLObject var19, final SubLObject var20) {
        if (module0613.NIL == module0612.f37382(var19) || module0613.NIL == module0612.f37382(var20)) {
            module0229.f15259();
        }
        return module0612.f37500(var19, var20, (SubLObject)module0613.UNPROVIDED);
    }
    
    public static SubLObject f37602(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37444(var3);
        if (module0613.NIL == var4) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37603(final SubLObject var23, final SubLObject var3) {
        if (module0613.NIL == module0612.f37439(var23) || module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37448(var23, var3);
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37604(final SubLObject var23, final SubLObject var3) {
        if (module0613.NIL == module0612.f37439(var23) || module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37451(var23, var3);
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37605(final SubLObject var23, final SubLObject var3) {
        if (module0613.NIL == module0612.f37439(var23) || module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37452(var23, var3);
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37606(final SubLObject var23, final SubLObject var3) {
        if (module0613.NIL == module0612.f37439(var23) || module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var24 = module0612.f37454(var23, var3);
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        return var24;
    }
    
    public static SubLObject f37607(final SubLObject var24) {
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        final SubLObject var25 = module0612.f37532(var24);
        if (module0613.NIL == var25) {
            module0229.f15259();
        }
        return var25;
    }
    
    public static SubLObject f37608(final SubLObject var24) {
        if (module0613.NIL == var24) {
            module0229.f15259();
        }
        final SubLObject var25 = module0612.f37533(var24, (SubLObject)module0613.UNPROVIDED);
        if (module0613.NIL == var25) {
            module0229.f15259();
        }
        return var25;
    }
    
    public static SubLObject f37609(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37400(var3);
        if (!var4.isInteger()) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37610(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37401(var3);
        if (module0613.NIL == constant_handles_oc.f8449(var4)) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37611(final SubLObject var3) {
        if (module0613.NIL == module0612.f37382(var3)) {
            module0229.f15259();
        }
        final SubLObject var4 = module0612.f37404(var3);
        if (!var4.isInteger()) {
            module0229.f15259();
        }
        return var4;
    }
    
    public static SubLObject f37612(final SubLObject var27) {
        if (module0613.NIL == module0035.f2000(var27, (SubLObject)module0613.ONE_INTEGER, (SubLObject)module0613.UNPROVIDED) || module0613.NIL == module0035.f2192((SubLObject)module0613.$ic34$, var27)) {
            module0229.f15259();
        }
        final SubLObject var28 = Sort.sort(f37613(module0035.f2269(conses_high.copy_list(var27), (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED)), (SubLObject)module0613.$ic35$, (SubLObject)module0613.UNPROVIDED);
        if (module0613.NIL == var28) {
            return (SubLObject)module0613.NIL;
        }
        if (module0613.NIL != module0035.f1997(var28)) {
            return var28.first();
        }
        return module0202.f12683(module0613.$ic36$, (SubLObject)ConsesLow.list(var28.first(), module0035.f2114(var28)), (SubLObject)module0613.UNPROVIDED);
    }
    
    public static SubLObject f37613(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0613.NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0613.NIL;
        var12 = var11.first();
        while (module0613.NIL != var11) {
            SubLObject var13 = (SubLObject)module0613.NIL;
            if (module0613.NIL == var13) {
                SubLObject var14 = Sequences.remove(var12, var9, (SubLObject)module0613.EQUAL, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED, (SubLObject)module0613.UNPROVIDED);
                SubLObject var15 = (SubLObject)module0613.NIL;
                var15 = var14.first();
                while (module0613.NIL == var13 && module0613.NIL != var14) {
                    if (module0613.NIL != f37600(var15, var12)) {
                        var13 = (SubLObject)module0613.T;
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
            if (module0613.NIL == var13) {
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
        return (SubLObject)module0613.NIL;
    }
    
    public static SubLObject f37615() {
        return (SubLObject)module0613.NIL;
    }
    
    public static SubLObject f37616() {
        if (module0613.$ic0$.isSymbol()) {
            final SubLObject var32 = (SubLObject)module0613.$ic0$;
            if (module0613.NIL == conses_high.member(var32, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0613.EQL), Symbols.symbol_function((SubLObject)module0613.IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var32, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)module0613.$ic0$);
        module0012.f416((SubLObject)module0613.$ic2$);
        module0012.f416((SubLObject)module0613.$ic4$);
        module0012.f416((SubLObject)module0613.$ic5$);
        module0012.f416((SubLObject)module0613.$ic6$);
        module0012.f416((SubLObject)module0613.$ic7$);
        module0012.f416((SubLObject)module0613.$ic8$);
        module0012.f416((SubLObject)module0613.$ic9$);
        module0012.f416((SubLObject)module0613.$ic10$);
        module0012.f416((SubLObject)module0613.$ic11$);
        module0012.f416((SubLObject)module0613.$ic12$);
        module0012.f416((SubLObject)module0613.$ic13$);
        module0012.f416((SubLObject)module0613.$ic15$);
        module0012.f416((SubLObject)module0613.$ic16$);
        module0012.f416((SubLObject)module0613.$ic18$);
        module0012.f416((SubLObject)module0613.$ic21$);
        module0012.f416((SubLObject)module0613.$ic22$);
        module0012.f416((SubLObject)module0613.$ic23$);
        module0012.f416((SubLObject)module0613.$ic24$);
        module0012.f416((SubLObject)module0613.$ic25$);
        module0012.f416((SubLObject)module0613.$ic26$);
        module0012.f416((SubLObject)module0613.$ic27$);
        module0012.f416((SubLObject)module0613.$ic28$);
        module0012.f416((SubLObject)module0613.$ic29$);
        module0012.f416((SubLObject)module0613.$ic30$);
        module0012.f416((SubLObject)module0613.$ic31$);
        module0012.f416((SubLObject)module0613.$ic32$);
        module0012.f416((SubLObject)module0613.$ic33$);
        module0012.f416((SubLObject)module0613.$ic37$);
        return (SubLObject)module0613.NIL;
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
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-DEFN");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $ic2$ = SubLObjectFactory.makeSymbol("CYC-DATE-AFTER");
        $ic3$ = SubLObjectFactory.makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");
        $ic4$ = SubLObjectFactory.makeSymbol("CYC-DATE-BEFORE");
        $ic5$ = SubLObjectFactory.makeSymbol("CYC-DATE-FROM-INTEGER");
        $ic6$ = SubLObjectFactory.makeSymbol("CYC-DATE-INITIAL-SECOND");
        $ic7$ = SubLObjectFactory.makeSymbol("CYC-DATE-FINAL-SECOND");
        $ic8$ = SubLObjectFactory.makeSymbol("CYC-DATE-ENCODE-STRING");
        $ic9$ = SubLObjectFactory.makeSymbol("CYC-DATE-DECODE-STRING");
        $ic10$ = SubLObjectFactory.makeSymbol("CYC-DATE-FROM-STRING");
        $ic11$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-DATE");
        $ic12$ = SubLObjectFactory.makeSymbol("CYC-HOUR-OF-DATE");
        $ic13$ = SubLObjectFactory.makeSymbol("CYC-MINUTE-OF-DATE");
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HoursDuration")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MinutesDuration")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")));
        $ic15$ = SubLObjectFactory.makeSymbol("CYC-TIME-ELAPSED-ENCODE-STRING");
        $ic16$ = SubLObjectFactory.makeSymbol("CYC-TIME-ELAPSED-DECODE-STRING");
        $ic17$ = SubLObjectFactory.makeKeyword("FAIL");
        $ic18$ = SubLObjectFactory.makeSymbol("CYC-TIME-INTERVAL-OF-SPEC-STRING");
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Date"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("laterThan"));
        $ic21$ = SubLObjectFactory.makeSymbol("CYC-LATER-THAN");
        $ic22$ = SubLObjectFactory.makeSymbol("CYC-DATE-SUBSUMES");
        $ic23$ = SubLObjectFactory.makeSymbol("CYC-TIME-ELAPSED");
        $ic24$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-OF-DATE");
        $ic25$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE");
        $ic26$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE");
        $ic27$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE");
        $ic28$ = SubLObjectFactory.makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE");
        $ic29$ = SubLObjectFactory.makeSymbol("CYC-CURRENT-ITERATED-CYCLIC-INTERVAL");
        $ic30$ = SubLObjectFactory.makeSymbol("CYC-NEXT-ITERATED-CYCLIC-INTERVAL");
        $ic31$ = SubLObjectFactory.makeSymbol("CYC-YEAR-OF-DATE");
        $ic32$ = SubLObjectFactory.makeSymbol("CYC-MONTH-OF-DATE");
        $ic33$ = SubLObjectFactory.makeSymbol("CYC-DAY-NUMBER-OF-DATE");
        $ic34$ = SubLObjectFactory.makeSymbol("S#24728", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#20158", "CYC");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $ic37$ = SubLObjectFactory.makeSymbol("CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0613.class
	Total time: 147 ms
	
	Decompiled with Procyon 0.5.32.
*/