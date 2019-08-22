package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0710 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0710";
    public static final String myFingerPrint = "3d5711314f62ee583e024638a1ecf6dcca32d6ef9cb11bbbcb95a23780941992";
    private static SubLSymbol $g5579$;
    private static SubLSymbol $g5580$;
    private static SubLSymbol $g5581$;
    private static SubLSymbol $g5583$;
    public static SubLSymbol $g5582$;
    public static SubLSymbol $g5584$;
    public static SubLSymbol $g5585$;
    public static SubLSymbol $g5586$;
    public static SubLSymbol $g5587$;
    private static SubLSymbol $g5589$;
    private static SubLSymbol $g5590$;
    public static SubLSymbol $g5591$;
    public static SubLSymbol $g5592$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLString $ic28$;
    
    public static SubLObject f43472(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        return Sequences.cconcatenate(f43473(var1), (SubLObject)$ic4$);
    }
    
    public static SubLObject f43474(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43472(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic3$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic3$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic3$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic5$);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43472(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43475() {
        return conses_high.copy_list($g5583$.getGlobalValue());
    }
    
    public static SubLObject f43476(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        return Sequences.cconcatenate($g5580$.getGlobalValue(), new SubLObject[] { f43477(var1), $g5581$.getGlobalValue() });
    }
    
    public static SubLObject f43473(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43476(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic8$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic8$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic8$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic5$);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43476(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43478() {
        return Sequences.cconcatenate($g5580$.getGlobalValue(), $g5581$.getGlobalValue());
    }
    
    public static SubLObject f43479() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43478();
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic9$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic9$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)UNPROVIDED);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43478()));
            module0034.f1812(var4, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43480(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        return Sequences.cconcatenate($g5579$.getGlobalValue(), new SubLObject[] { f43477(var1), $g5581$.getGlobalValue() });
    }
    
    public static SubLObject f43481(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43480(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic10$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic10$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic5$);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43480(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43482() {
        return Sequences.cconcatenate($g5579$.getGlobalValue(), $g5581$.getGlobalValue());
    }
    
    public static SubLObject f43483() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43482();
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic11$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic11$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)UNPROVIDED);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43482()));
            module0034.f1812(var4, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43484(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        if (NIL == var1) {
            return module0038.$g916$.getGlobalValue();
        }
        assert NIL != module0051.f3603(var1) : var1;
        final SubLObject var2 = module0051.f3617(var1);
        final SubLObject var3 = module0038.f2623(var2, (SubLObject)SIX_INTEGER, (SubLObject)TEN_INTEGER);
        final SubLObject var4 = module0038.f2623(var2, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER);
        final SubLObject var5 = module0038.f2623(var2, (SubLObject)THREE_INTEGER, (SubLObject)FIVE_INTEGER);
        return Sequences.cconcatenate(module0006.f203(var3), new SubLObject[] { $ic14$, module0006.f203(var4), $ic14$, module0006.f203(var5), $ic14$ });
    }
    
    public static SubLObject f43477(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43484(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic12$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic12$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic5$);
        if (var5 == $ic5$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43484(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43485(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g5582$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7629($g5587$.getDynamicValue(var2))) {
            return $g5587$.getDynamicValue(var2);
        }
        if (NIL == module0711.$g5588$.getDynamicValue(var2)) {
            return f43474(var1);
        }
        if (NIL != $g5584$.getDynamicValue(var2)) {
            return f43473(var1);
        }
        return f43481(var1);
    }
    
    public static SubLObject f43486() {
        return module0038.f2658($g5589$.getGlobalValue());
    }
    
    public static SubLObject f43487() {
        return module0038.f2658($g5590$.getGlobalValue());
    }
    
    public static SubLObject f43488(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0035.f2305($g5591$.getDynamicValue(var11), var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return (NIL != var12) ? Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f203(var12), $ic25$ }) : var10;
    }
    
    public static SubLObject f43489() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (NIL != module0107.f7629($g5592$.getDynamicValue(var2))) ? $g5592$.getDynamicValue(var2) : f43485((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43490(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = $g5591$.getDynamicValue(var13);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic26$);
            var18 = var17.first();
            var17 = (var19 = var17.rest());
            if (NIL != module0038.f2684(var12, var19)) {
                return (SubLObject)T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43491(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = $g5591$.getDynamicValue(var13);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
            var18 = var17.first();
            var17 = (var19 = var17.rest());
            if (NIL != module0038.f2684(var12, var19)) {
                final SubLObject var20 = module0038.f2674(var12, var19, (SubLObject)UNPROVIDED);
                if (NIL != module0601.f36767(var20)) {
                    return Sequences.cconcatenate(var18, new SubLObject[] { $ic28$, var20 });
                }
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var12;
    }
    
    public static SubLObject f43492(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0711.$g5593$.getDynamicValue(var13)) {
            SubLObject var14 = $g5591$.getDynamicValue(var13);
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                SubLObject var17;
                final SubLObject var16 = var17 = var15;
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
                var18 = var17.first();
                var17 = (var19 = var17.rest());
                if (var12.equal(var19)) {
                    return Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f203(var18), $ic25$ });
                }
                if (NIL != module0038.f2684(var12, var19)) {
                    return Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f203(var18), $ic25$, module0006.f203(module0038.f2674(var12, var19, (SubLObject)UNPROVIDED)) });
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        return var12;
    }
    
    public static SubLObject f43493() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43472", "S#47565", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43474", "S#47566", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43475", "S#47567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43476", "S#47568", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43473", "S#47569", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43478", "S#47570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43479", "S#47571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43480", "S#47572", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43481", "S#47573", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43482", "S#47574", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43483", "S#47575", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43484", "S#47576", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43477", "S#47577", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43485", "S#47578", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43486", "S#47579", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43487", "S#47580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43488", "S#47581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43489", "S#47582", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43490", "S#47583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43491", "S#47584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0710", "f43492", "S#47585", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43494() {
        $g5579$ = SubLFiles.deflexical("S#47586", (SubLObject)$ic0$);
        $g5580$ = SubLFiles.deflexical("S#47587", (SubLObject)$ic1$);
        $g5581$ = SubLFiles.deflexical("S#47588", (SubLObject)$ic2$);
        $g5583$ = SubLFiles.deflexical("S#47589", (SubLObject)$ic6$);
        $g5582$ = SubLFiles.defparameter("S#47590", (SubLObject)$ic7$);
        $g5584$ = SubLFiles.defparameter("S#47591", (SubLObject)NIL);
        $g5585$ = SubLFiles.defparameter("S#47592", (SubLObject)T);
        $g5586$ = SubLFiles.defparameter("S#47593", (SubLObject)NIL);
        $g5587$ = SubLFiles.defparameter("S#47594", module0107.f7627());
        $g5589$ = SubLFiles.deflexical("S#47595", (SubLObject)$ic15$);
        $g5590$ = SubLFiles.deflexical("S#47596", (SubLObject)$ic16$);
        $g5591$ = SubLFiles.defparameter("S#47597", (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$, reader.bq_cons((SubLObject)$ic22$, $g5579$.getGlobalValue()), reader.bq_cons((SubLObject)$ic23$, $g5580$.getGlobalValue()), reader.bq_cons(f43486(), f43487())));
        $g5592$ = SubLFiles.defparameter("S#47598", module0107.f7627());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43495() {
        module0034.f1895((SubLObject)$ic3$);
        module0034.f1895((SubLObject)$ic8$);
        module0034.f1895((SubLObject)$ic9$);
        module0034.f1895((SubLObject)$ic10$);
        module0034.f1895((SubLObject)$ic11$);
        module0034.f1895((SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f43493();
    }
    
    public void initializeVariables() {
        f43494();
    }
    
    public void runTopLevelForms() {
        f43495();
    }
    
    static {
        me = (SubLFile)new module0710();
        $g5579$ = null;
        $g5580$ = null;
        $g5581$ = null;
        $g5583$ = null;
        $g5582$ = null;
        $g5584$ = null;
        $g5585$ = null;
        $g5586$ = null;
        $g5587$ = null;
        $g5589$ = null;
        $g5590$ = null;
        $g5591$ = null;
        $g5592$ = null;
        $ic0$ = makeString("http://sw.cyc.com/");
        $ic1$ = makeString("http://sw.opencyc.org/");
        $ic2$ = makeString("concept/");
        $ic3$ = makeSymbol("S#47566", "CYC");
        $ic4$ = makeString("en/");
        $ic5$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic6$ = ConsesLow.list((SubLObject)makeInteger(20080610), (SubLObject)makeInteger(20090407));
        $ic7$ = makeInteger(20120510);
        $ic8$ = makeSymbol("S#47569", "CYC");
        $ic9$ = makeSymbol("S#47571", "CYC");
        $ic10$ = makeSymbol("S#47573", "CYC");
        $ic11$ = makeSymbol("S#47575", "CYC");
        $ic12$ = makeSymbol("S#47577", "CYC");
        $ic13$ = makeSymbol("S#4999", "CYC");
        $ic14$ = makeString("/");
        $ic15$ = makeString("cycAnnot");
        $ic16$ = makeString("http://sw.cyc.com/CycAnnotations_v1#");
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)makeString("owl"), (SubLObject)makeString("http://www.w3.org/2002/07/owl#"));
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)makeString("rdf"), (SubLObject)makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"));
        $ic19$ = (SubLList)ConsesLow.cons((SubLObject)makeString("rdfs"), (SubLObject)makeString("http://www.w3.org/2000/01/rdf-schema#"));
        $ic20$ = (SubLList)ConsesLow.cons((SubLObject)makeString("skos"), (SubLObject)makeString("http://www.w3.org/2004/02/skos/core#"));
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)makeString("xsd"), (SubLObject)makeString("http://www.w3.org/2001/XMLSchema#"));
        $ic22$ = makeString("cyc");
        $ic23$ = makeString("opencyc");
        $ic24$ = makeString("&");
        $ic25$ = makeString(";");
        $ic26$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#47091", "CYC"));
        $ic27$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("S#47091", "CYC"));
        $ic28$ = makeString(":");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 122 ms
	
	Decompiled with Procyon 0.5.32.
*/