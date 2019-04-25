package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0249 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0249";
    public static final String myFingerPrint = "a0e1b2d969d57a5bd32b9a4ebb3b54b9abe90ca1d7b276a6f24b0313e64e49c2";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
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
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    
    public static SubLObject f16018(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return Hashtables.gethash_without_values(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16019(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return f16018(var1, var2);
    }
    
    public static SubLObject f16020(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return module0035.sublisp_boolean(f16018(var1, var2));
    }
    
    public static SubLObject f16021(final SubLObject var3) {
        return module0035.sublisp_boolean(var3);
    }
    
    public static SubLObject f16022(final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL == var3);
    }
    
    public static SubLObject f16023(final SubLObject var3, final SubLObject var4) {
        return module0004.f104(var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16024(final SubLObject var3, final SubLObject var5) {
        SubLObject var6 = (SubLObject)NIL;
        if (NIL == var6) {
            SubLObject var7;
            SubLObject var8;
            for (var7 = var5, var8 = (SubLObject)NIL, var8 = var7.first(); NIL == var6 && NIL != var7; var6 = (SubLObject)makeBoolean(NIL == module0004.f104(var8, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var7 = var7.rest(), var8 = var7.first()) {}
        }
        return (SubLObject)makeBoolean(NIL == var6);
    }
    
    public static SubLObject f16025() {
        return module0244.f15743(module0137.f8955((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16026(final SubLObject var8) {
        if (var8.eql((SubLObject)$ic0$)) {
            return module0244.f15743(module0137.f8955($ic1$));
        }
        if (var8.eql((SubLObject)$ic2$)) {
            return module0244.f15743(module0137.f8955($ic3$));
        }
        if (var8.eql((SubLObject)$ic4$)) {
            return module0244.f15743(module0137.f8955($ic5$));
        }
        if (var8.eql((SubLObject)$ic6$)) {
            return module0244.f15743(module0137.f8955($ic7$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16027(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(!f16019(var1, var2).isNegative());
    }
    
    public static SubLObject f16028(final SubLObject var3) {
        return module0035.sublisp_boolean(var3);
    }
    
    public static SubLObject f16029(final SubLObject var1) {
        if (NIL != module0139.f9077()) {
            return f16030(var1);
        }
        return f16028(f16019(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16030(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == f16019(var1, module0139.$g1646$.getDynamicValue(var2)) || NIL != f16028(f16019(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f16031() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != module0141.f9234()) {
            return Numbers.minusp(module0141.$g1684$.getDynamicValue(var10));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f16032(final SubLObject var3) {
        return (SubLObject)((NIL != module0141.f9195()) ? makeBoolean(NIL != module0139.f9064(var3) || NIL != module0139.f9065(var3)) : makeBoolean(NIL != module0139.f9063(var3) || NIL != module0139.f9065(var3)));
    }
    
    public static SubLObject f16033(final SubLObject var1, final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        Hashtables.sethash(var1, var2, var11);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16034(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16033(var1, (SubLObject)T, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16035(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16033(var1, (SubLObject)NIL, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16036(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return f16034(var1, var2);
    }
    
    public static SubLObject f16037(final SubLObject var1, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4 = f16018(var1, var2);
        final SubLObject var5 = conses_high.adjoin(var4, (SubLObject)ConsesLow.list(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f16033(var1, var5, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16038(final SubLObject var1, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        module0030.f1599(var1, var3, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16039(final SubLObject var1, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4 = f16018(var1, var2);
        final SubLObject var5 = Sequences.remove(var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f16033(var1, var5, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16040(final SubLObject var1, final SubLObject var14, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0141.f9229();
        final SubLObject var17 = (NIL != var16) ? var16 : module0142.$g1731$.getDynamicValue(var15);
        final SubLObject var18 = Numbers.add(var14, var17);
        module0141.$g1684$.setDynamicValue(f16018(var1, (SubLObject)UNPROVIDED), var15);
        module0141.$g1683$.setDynamicValue(var18, var15);
        f16033(var1, var18, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16041(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16040(var1, (SubLObject)ZERO_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16042(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16040(var1, (SubLObject)MINUS_ONE_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16043(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16040(var1, (SubLObject)ONE_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16044(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16040(var1, (SubLObject)TWO_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16045(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        f16033(var1, (SubLObject)ZERO_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16046(final SubLObject var1, final SubLObject var16, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        assert NIL != Types.numberp(var16) : var16;
        f16033(var1, var16, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16047(final SubLObject var1, final SubLObject var16, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        assert NIL != Types.numberp(var16) : var16;
        final SubLObject var17 = f16018(var1, var2);
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != var17) {
            assert NIL != Types.numberp(var17) : var17;
            var18 = Numbers.numL(var16, var17);
        }
        return var18;
    }
    
    public static SubLObject f16048(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        if (NIL != module0141.f9195()) {
            f16049(var1, var2);
        }
        else {
            f16050(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16050(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = f16019(var1, var2);
        if (NIL == var3) {
            f16033(var1, module0139.$g1650$.getGlobalValue(), var2);
        }
        else if (var3.eql(module0139.$g1651$.getGlobalValue())) {
            f16033(var1, module0139.$g1652$.getGlobalValue(), var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16049(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = f16019(var1, (SubLObject)UNPROVIDED);
        if (NIL == var3) {
            f16033(var1, module0139.$g1651$.getGlobalValue(), var2);
        }
        else if (var3.eql(module0139.$g1650$.getGlobalValue())) {
            f16033(var1, module0139.$g1652$.getGlobalValue(), var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16051(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        if (NIL != module0141.f9195()) {
            f16052(var1, var2);
        }
        else {
            f16053(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16053(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = f16019(var1, (SubLObject)UNPROVIDED);
        if (var3.eql(module0139.$g1650$.getGlobalValue())) {
            f16033(var1, (SubLObject)NIL, var2);
        }
        else if (var3.eql(module0139.$g1652$.getGlobalValue())) {
            f16033(var1, module0139.$g1651$.getGlobalValue(), var2);
        }
        else {
            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic9$, var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16052(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = f16019(var1, (SubLObject)UNPROVIDED);
        if (var3.eql(module0139.$g1651$.getGlobalValue())) {
            f16033(var1, (SubLObject)NIL, var2);
        }
        else if (var3.eql(module0139.$g1652$.getGlobalValue())) {
            f16033(var1, module0139.$g1650$.getGlobalValue(), var2);
        }
        else {
            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic10$, var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16054(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f16055(var1, module0141.$g1705$.getDynamicValue(var2));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16056(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f16057(var1, module0141.$g1705$.getDynamicValue(var2));
    }
    
    public static SubLObject f16058(final SubLObject var1) {
        module0250.f16132();
        module0141.$g1691$.setDynamicValue(var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16059(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        if (NIL != module0141.f9273() && NIL != f16056(var1)) {
            f16058(var1);
            return (SubLObject)T;
        }
        return f16057(var1, var2);
    }
    
    public static SubLObject f16057(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15740(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic11$)) {
            return f16021(f16019(var1, var2));
        }
        if (var4.eql((SubLObject)$ic12$)) {
            return f16032(f16019(var1, var2));
        }
        if (var4.eql((SubLObject)$ic13$)) {
            return f16029(var1);
        }
        return Functions.funcall(var3, var1);
    }
    
    public static SubLObject f16060(final SubLObject var3) {
        final SubLObject var5;
        final SubLObject var4 = var5 = module0244.f15740(module0137.f8955((SubLObject)UNPROVIDED));
        if (var5.eql((SubLObject)$ic11$)) {
            return f16021(var3);
        }
        if (var5.eql((SubLObject)$ic12$)) {
            return f16032(var3);
        }
        return Functions.funcall(var4, var3);
    }
    
    public static SubLObject f16061(final SubLObject var1) {
        return f16059(var1, module0139.f9059());
    }
    
    public static SubLObject f16062(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f16059(var1, module0139.$g1646$.getDynamicValue(var2));
    }
    
    public static SubLObject f16055(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15741(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic14$)) {
            f16034(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic15$)) {
            f16048(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic16$)) {
            f16041(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic17$)) {
            f16043(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic18$)) {
            f16044(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic19$)) {
            f16042(var1, var2);
        }
        else {
            Functions.funcall(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16063(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15742(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic20$)) {
            f16035(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic21$)) {
            f16053(var1, var2);
        }
        else if (var4.eql((SubLObject)$ic22$)) {
            f16052(var1, var2);
        }
        else {
            Functions.funcall(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16064(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f16055(var1, module0139.$g1646$.getDynamicValue(var2));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16065(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f16055(var1, module0139.$g1647$.getDynamicValue(var2));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16066(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f16055(var1, module0139.$g1649$.getDynamicValue(var2));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16067(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f16063(var1, module0139.$g1649$.getDynamicValue(var2));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16068(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15740(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic11$)) {
            return f16021(f16019(var1, var2));
        }
        if (var4.eql((SubLObject)$ic12$)) {
            return f16032(conses_high.second(f16019(var1, var2)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16069(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15740(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic11$)) {
            return f16019(var1, var2);
        }
        if (var4.eql((SubLObject)$ic12$)) {
            return f16019(var1, var2).first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16070(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = module0244.f15741(module0137.f8955((SubLObject)UNPROVIDED));
        if (var4.eql((SubLObject)$ic14$)) {
            f16033(var1, module0139.f9068(), var2);
        }
        else if (var4.eql((SubLObject)$ic15$)) {
            f16071(var1, var2);
        }
        else {
            Functions.funcall(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16071(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        if (NIL != module0141.f9195()) {
            f16072(var1, var2);
        }
        else {
            f16073(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16073(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = conses_high.second(f16019(var1, var2));
        if (NIL == var3) {
            f16033(var1, (SubLObject)ConsesLow.list(module0139.f9068(), module0139.$g1650$.getGlobalValue()), var2);
        }
        else if (var3.eql(module0139.$g1651$.getGlobalValue())) {
            f16033(var1, (SubLObject)ConsesLow.list(module0139.f9068(), module0139.$g1652$.getGlobalValue()), var2);
        }
        else {
            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic23$, var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16072(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        final SubLObject var3 = conses_high.second(f16019(var1, (SubLObject)UNPROVIDED));
        if (NIL == var3) {
            f16033(var1, (SubLObject)ConsesLow.list(module0139.f9068(), module0139.$g1651$.getGlobalValue()), var2);
        }
        else if (var3.eql(module0139.$g1650$.getGlobalValue())) {
            f16033(var1, (SubLObject)ConsesLow.list(module0139.f9068(), module0139.$g1652$.getGlobalValue()), var2);
        }
        else {
            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16074(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = (SubLObject)NIL;
        if (NIL != module0077.f5302(var25)) {
            final SubLObject var27 = module0077.f5333(var25);
            SubLObject var28;
            SubLObject var29;
            SubLObject var30;
            for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == var26 && NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                var30 = module0032.f1745(var28, var29);
                if (NIL != module0032.f1746(var29, var30)) {
                    var26 = f16019(var30, var2);
                }
            }
        }
        else if (var25.isList()) {
            if (NIL == var26) {
                SubLObject var31;
                SubLObject var32;
                for (var31 = var25, var32 = (SubLObject)NIL, var32 = var31.first(); NIL == var26 && NIL != var31; var26 = f16019(var32, var2), var31 = var31.rest(), var32 = var31.first()) {}
            }
        }
        else {
            Errors.error((SubLObject)$ic25$, var25);
        }
        return var26;
    }
    
    public static SubLObject f16075(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = (SubLObject)NIL;
        if (NIL != module0077.f5302(var25)) {
            final SubLObject var27 = module0077.f5333(var25);
            SubLObject var28;
            SubLObject var29;
            SubLObject var30;
            for (var28 = module0032.f1741(var27), var29 = (SubLObject)NIL, var29 = module0032.f1742(var28, var27); NIL == var26 && NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                var30 = module0032.f1745(var28, var29);
                if (NIL != module0032.f1746(var29, var30)) {
                    var26 = (SubLObject)makeBoolean(NIL == f16019(var30, var2));
                }
            }
        }
        else if (var25.isList()) {
            if (NIL == var26) {
                SubLObject var31;
                SubLObject var32;
                for (var31 = var25, var32 = (SubLObject)NIL, var32 = var31.first(); NIL == var26 && NIL != var31; var26 = (SubLObject)makeBoolean(NIL == f16019(var32, var2)), var31 = var31.rest(), var32 = var31.first()) {}
            }
        }
        else {
            Errors.error((SubLObject)$ic25$, var25);
        }
        return (SubLObject)makeBoolean(NIL == var26);
    }
    
    public static SubLObject f16076(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL == f16075(var25, var2));
    }
    
    public static SubLObject f16077(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL == f16074(var25, var2));
    }
    
    public static SubLObject f16078(final SubLObject var25) {
        return (SubLObject)T;
    }
    
    public static SubLObject f16079(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != f16019(var28, var2)) {
                var26 = (SubLObject)ConsesLow.cons(var28, var26);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return Sequences.nreverse(var26);
    }
    
    public static SubLObject f16080(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL == f16019(var28, var2)) {
                var26 = (SubLObject)ConsesLow.cons(var28, var26);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return Sequences.nreverse(var26);
    }
    
    public static SubLObject f16081(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var3 = (SubLObject)NIL;
        if (var2.isHashtable()) {
            SubLObject var4 = (SubLObject)NIL;
            SubLObject var5 = (SubLObject)NIL;
            final Iterator var6 = Hashtables.getEntrySetIterator(var2);
            try {
                while (Hashtables.iteratorHasNext(var6)) {
                    final Map.Entry var7 = Hashtables.iteratorNextEntry(var6);
                    var4 = Hashtables.getEntryKey(var7);
                    var5 = Hashtables.getEntryValue(var7);
                    if (NIL != var5) {
                        var3 = (SubLObject)ConsesLow.cons(var4, var3);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var6);
            }
        }
        return var3;
    }
    
    public static SubLObject f16082(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = var25;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            f16055(var27, var2);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16083(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        SubLObject var26 = var25;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            f16063(var27, var2);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16084(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            f16055(var28, module0139.$g1646$.getDynamicValue(var26));
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16085(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0141.$g1674$.currentBinding(var26);
        try {
            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var26)) : module0141.$g1674$.getDynamicValue(var26)), var26);
            SubLObject var28 = var25;
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                f16055(var29, module0139.$g1646$.getDynamicValue(var26));
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        finally {
            module0141.$g1674$.rebind(var27, var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16086(final SubLObject var36) {
        return Types.hash_table_p(var36);
    }
    
    public static SubLObject f16087(final SubLObject var36) {
        if (NIL != module0035.f2015(var36)) {
            SubLObject var37 = var36;
            SubLObject var38 = (SubLObject)NIL;
            var38 = var37.first();
            while (NIL != var37) {
                if (NIL == f16086(var38)) {
                    return (SubLObject)NIL;
                }
                var37 = var37.rest();
                var38 = var37.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16088(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0139.$g1635$.getDynamicValue();
        }
        Hashtables.clrhash(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16089(final SubLObject var36) {
        return module0030.f1594(var36);
    }
    
    public static SubLObject f16090(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == f16086(var2)) {
            final SubLObject var4 = module0136.$g1591$.getDynamicValue(var3);
            if (var4.eql((SubLObject)$ic26$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var2, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var4.eql((SubLObject)$ic29$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var2, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var4.eql((SubLObject)$ic31$)) {
                Errors.warn((SubLObject)$ic27$, var2, (SubLObject)$ic28$);
            }
            else {
                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var3));
                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var2, (SubLObject)$ic28$);
            }
        }
        return Hashtables.hash_table_count(var2);
    }
    
    public static SubLObject f16091(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == f16086(var2)) {
            final SubLObject var4 = module0136.$g1591$.getDynamicValue(var3);
            if (var4.eql((SubLObject)$ic26$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var2, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var4.eql((SubLObject)$ic29$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var2, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var4.eql((SubLObject)$ic31$)) {
                Errors.warn((SubLObject)$ic27$, var2, (SubLObject)$ic28$);
            }
            else {
                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var3));
                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var2, (SubLObject)$ic28$);
            }
        }
        return module0030.f1625(var2);
    }
    
    public static SubLObject f16092() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16018", "S#18773", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16019", "S#18774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16020", "S#18775", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16021", "S#18776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16022", "S#18777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16023", "S#18778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16024", "S#18779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16025", "S#18780", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16026", "S#18781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16027", "S#18782", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16028", "S#18783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16029", "S#18784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16030", "S#18785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16031", "S#18786", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16032", "S#18787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16033", "S#18788", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16034", "S#18789", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16035", "S#18790", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16036", "S#18791", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16037", "S#18792", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16038", "S#18793", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16039", "S#18794", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16040", "S#18795", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16041", "S#18796", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16042", "S#18797", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16043", "S#18798", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16044", "S#18799", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16045", "S#18800", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16046", "S#18801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16047", "S#18802", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16048", "S#18803", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16050", "S#18804", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16049", "S#18805", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16051", "S#18770", 1, 1, false);
        new $f16051$UnaryFunction();
        new $f16051$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16053", "S#18806", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16052", "S#18807", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16054", "S#18808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16056", "S#18809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16058", "S#18810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16059", "S#15393", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16057", "S#18811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16060", "S#18812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16061", "S#18813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16062", "S#18772", 1, 0, false);
        new $f16062$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16055", "S#15392", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16063", "S#18814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16064", "S#18815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16065", "S#18816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16066", "S#18817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16067", "S#18818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16068", "S#18819", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16069", "S#18820", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16070", "S#18821", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16071", "S#18822", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16073", "S#18823", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16072", "S#18824", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16074", "S#18825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16075", "S#18826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16076", "S#18827", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16077", "S#18828", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16078", "S#18829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16079", "S#18830", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16080", "S#18831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16081", "SBHL-MARKED-NODES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16082", "S#18832", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16083", "S#18833", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16084", "S#18834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16085", "S#18835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16086", "S#18836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16087", "S#18837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16088", "S#11273", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16089", "S#18838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16090", "S#18839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0249", "f16091", "S#18840", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16093() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16094() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f16092();
    }
    
    public void initializeVariables() {
        f16093();
    }
    
    public void runTopLevelForms() {
        f16094();
    }
    
    static {
        me = (SubLFile)new module0249();
        $ic0$ = makeKeyword("WEAK");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("weak-HL-TimePrecedence"));
        $ic2$ = makeKeyword("STRICT");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("strict-HL-TimePrecedence"));
        $ic4$ = makeKeyword("WEAK-SUCCESSOR");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("weakSuccessor-HL-TimePrecedence"));
        $ic6$ = makeKeyword("SUCCESSOR-STRICT");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("successorStrict-HL-TimePrecedence"));
        $ic8$ = makeSymbol("NUMBERP");
        $ic9$ = makeString("Node ~a has current marking ~a within genl-preds-unmarking");
        $ic10$ = makeString("Node ~a has current marking ~a within genl-inverse-unmarking");
        $ic11$ = makeSymbol("S#18776", "CYC");
        $ic12$ = makeSymbol("S#18787", "CYC");
        $ic13$ = makeSymbol("S#18784", "CYC");
        $ic14$ = makeSymbol("S#18789", "CYC");
        $ic15$ = makeSymbol("S#18803", "CYC");
        $ic16$ = makeSymbol("S#18796", "CYC");
        $ic17$ = makeSymbol("S#18798", "CYC");
        $ic18$ = makeSymbol("S#18799", "CYC");
        $ic19$ = makeSymbol("S#18797", "CYC");
        $ic20$ = makeSymbol("S#18790", "CYC");
        $ic21$ = makeSymbol("S#18806", "CYC");
        $ic22$ = makeSymbol("S#18807", "CYC");
        $ic23$ = makeString("Node ~a has current marking ~a within genl-preds-marking");
        $ic24$ = makeString("Node ~a has current marking ~a within genl-inverse-marking");
        $ic25$ = makeString("~A is neither SET-P nor LISTP.");
        $ic26$ = makeKeyword("ERROR");
        $ic27$ = makeString("~A is not a ~A");
        $ic28$ = makeSymbol("S#18836", "CYC");
        $ic29$ = makeKeyword("CERROR");
        $ic30$ = makeString("continue anyway");
        $ic31$ = makeKeyword("WARN");
        $ic32$ = makeString("~A is not a valid *sbhl-type-error-action* value");
    }
    
    public static final class $f16051$UnaryFunction extends UnaryFunction
    {
        public $f16051$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18770"));
        }
        
        public SubLObject processItem(final SubLObject var20) {
            return f16051(var20, (SubLObject)$f16051$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f16051$BinaryFunction extends BinaryFunction
    {
        public $f16051$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18770"));
        }
        
        public SubLObject processItem(final SubLObject var20, final SubLObject var21) {
            return f16051(var20, var21);
        }
    }
    
    public static final class $f16062$UnaryFunction extends UnaryFunction
    {
        public $f16062$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18772"));
        }
        
        public SubLObject processItem(final SubLObject var20) {
            return f16062(var20);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 196 ms
	
	Decompiled with Procyon 0.5.32.
*/