package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0138 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0138";
    public static final String myFingerPrint = "9ed2d63cd293830567aeae1e4297fc9fc9a55414ca0d1c91c1b395bd7b3ba717";
    private static SubLSymbol $g1611$;
    private static SubLSymbol $g1612$;
    private static SubLSymbol $g1613$;
    private static SubLSymbol $g1614$;
    private static SubLSymbol $g1615$;
    private static SubLSymbol $g1616$;
    private static SubLSymbol $g1617$;
    private static SubLSymbol $g1618$;
    public static SubLSymbol $g1619$;
    private static SubLSymbol $g1620$;
    public static SubLSymbol $g1621$;
    public static SubLSymbol $g1622$;
    public static SubLSymbol $g1623$;
    public static SubLSymbol $g1624$;
    public static SubLSymbol $g1625$;
    public static SubLSymbol $g1626$;
    public static SubLSymbol $g1627$;
    public static SubLSymbol $g1628$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    
    public static SubLObject f8967(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f8968(var1) || NIL != f8969(var1));
    }
    
    public static SubLObject f8968(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.eql($g1613$.getGlobalValue()) || var1.eql($g1615$.getGlobalValue()));
    }
    
    public static SubLObject f8969(final SubLObject var1) {
        return Equality.eq(var1, $g1617$.getGlobalValue());
    }
    
    public static SubLObject f8970() {
        return $g1612$.getGlobalValue();
    }
    
    public static SubLObject f8971() {
        return $g1613$.getGlobalValue();
    }
    
    public static SubLObject f8972(final SubLObject var1) {
        return Equality.eq(var1, f8971());
    }
    
    public static SubLObject f8973() {
        return $g1614$.getGlobalValue();
    }
    
    public static SubLObject f8974() {
        return $g1615$.getGlobalValue();
    }
    
    public static SubLObject f8975(final SubLObject var1) {
        return Equality.eq(var1, f8974());
    }
    
    public static SubLObject f8976() {
        return $g1616$.getGlobalValue();
    }
    
    public static SubLObject f8977() {
        return $g1617$.getGlobalValue();
    }
    
    public static SubLObject f8978() {
        return $g1618$.getGlobalValue();
    }
    
    public static SubLObject f8979() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g1619$.getDynamicValue(var2);
    }
    
    public static SubLObject f8980() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (f8979().eql(f8971())) {
            return f8974();
        }
        if (f8979().eql(f8974())) {
            return f8971();
        }
        if (f8979().eql(f8977())) {
            return f8977();
        }
        if (NIL != module0136.f8864() && NIL == f8967($g1619$.getDynamicValue(var2))) {
            final SubLObject var3 = module0136.$g1591$.getDynamicValue(var2);
            if (var3.eql((SubLObject)$ic8$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var3.eql((SubLObject)$ic11$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic12$, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var3.eql((SubLObject)$ic13$)) {
                Errors.warn((SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$);
            }
            else {
                Errors.warn((SubLObject)$ic14$, module0136.$g1591$.getDynamicValue(var2));
                Errors.cerror((SubLObject)$ic12$, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8981() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (f8979().eql(f8971())) {
            return f8973();
        }
        if (f8979().eql(f8974())) {
            return f8976();
        }
        if (f8979().eql(f8977())) {
            return f8978();
        }
        if (NIL != module0136.f8864() && NIL == f8967($g1619$.getDynamicValue(var2))) {
            final SubLObject var3 = module0136.$g1591$.getDynamicValue(var2);
            if (var3.eql((SubLObject)$ic8$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var3.eql((SubLObject)$ic11$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic12$, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var3.eql((SubLObject)$ic13$)) {
                Errors.warn((SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$);
            }
            else {
                Errors.warn((SubLObject)$ic14$, module0136.$g1591$.getDynamicValue(var2));
                Errors.cerror((SubLObject)$ic12$, (SubLObject)$ic9$, $g1619$.getDynamicValue(var2), (SubLObject)$ic10$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8982(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic15$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic17$, var8)), ConsesLow.append(var9, (SubLObject)NIL));
    }
    
    public static SubLObject f8983(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)$ic18$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f8984(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)$ic20$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f8985(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic21$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var8), ConsesLow.append(var9, (SubLObject)NIL));
    }
    
    public static SubLObject f8986(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)$ic23$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f8987(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic26$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic26$);
        var9 = var7.first();
        var7 = var7.rest();
        final SubLObject var10 = (SubLObject)(var7.isCons() ? var7.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var6, (SubLObject)$ic26$);
        var7 = var7.rest();
        if (NIL == var7) {
            final SubLObject var11;
            var7 = (var11 = var8);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var9, (SubLObject)$ic28$, (SubLObject)$ic29$, var10), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8988(final SubLObject var23, final SubLObject var24) {
        if (var23 == $ic30$ && var24 == $ic31$) {
            return $ic32$;
        }
        if (var23 == $ic30$ && var24 == $ic33$) {
            return $ic34$;
        }
        if (var23 == $ic35$ && var24 == $ic31$) {
            return $ic36$;
        }
        if (var23 == $ic35$ && var24 == $ic33$) {
            return $ic37$;
        }
        if (var23 == $ic38$) {
            return (SubLObject)$ic38$;
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic39$, var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8989(final SubLObject var25) {
        final SubLObject var26 = module0130.f8524(var25);
        final SubLObject var27 = module0130.f8523(var25);
        return f8988(var26, var27);
    }
    
    public static SubLObject f8990(final SubLObject var23) {
        return module0004.f104(var23, $g1620$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8991(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        if (var26.isList()) {
            if (NIL == var27) {
                SubLObject var28 = var26;
                SubLObject var29 = (SubLObject)NIL;
                var29 = var28.first();
                while (NIL == var27 && NIL != var28) {
                    if (NIL == f8992(var29)) {
                        var27 = (SubLObject)T;
                    }
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        else {
            var27 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == var27);
    }
    
    public static SubLObject f8992(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var26) || NIL != module0324.f21935(var26));
    }
    
    public static SubLObject f8993(final SubLObject var26) {
        return module0161.f10484(var26);
    }
    
    public static SubLObject f8994(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)$ic40$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f8995() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g1622$.getDynamicValue(var2);
    }
    
    public static SubLObject f8996(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic41$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic41$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic41$);
        var10 = var7.first();
        var7 = var7.rest();
        final SubLObject var11 = (SubLObject)(var7.isCons() ? var7.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var6, (SubLObject)$ic41$);
        var7 = var7.rest();
        if (NIL == var7) {
            final SubLObject var12;
            var7 = (var12 = var8);
            final SubLObject var13 = (SubLObject)$ic42$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var10), var10))), (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var9, var13, var11), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8997() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g1623$.getDynamicValue(var2);
    }
    
    public static SubLObject f8998() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g1624$.getDynamicValue(var2);
    }
    
    public static SubLObject f8999() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g1625$.getDynamicValue(var2);
    }
    
    public static SubLObject f9000(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)$ic49$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9001(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)$ic49$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9002() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8967", "S#11215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8968", "S#11216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8969", "S#11217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8970", "S#11218", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8971", "S#11219", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8972", "S#11220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8973", "S#11221", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8974", "S#11222", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8975", "S#11223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8976", "S#11224", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8977", "S#11225", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8978", "S#11226", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8979", "S#11227", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8980", "S#11228", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8981", "S#11229", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8982", "S#11230");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8983", "S#11231");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8984", "S#11232");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8985", "S#11233");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8986", "S#11234");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8987", "S#11235");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8988", "S#11236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8989", "S#11237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8990", "S#11238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8991", "S#11239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8992", "S#11210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8993", "S#11240", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8994", "S#11241");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8995", "S#11242", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f8996", "S#11243");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8997", "S#11244", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8998", "S#11245", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0138", "f8999", "S#11246", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f9000", "S#11247");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0138", "f9001", "S#11248");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9003() {
        $g1611$ = SubLFiles.deflexical("S#11249", (SubLObject)$ic0$);
        $g1612$ = SubLFiles.deflexical("S#11250", (SubLObject)$ic1$);
        $g1613$ = SubLFiles.deflexical("S#11251", (SubLObject)$ic2$);
        $g1614$ = SubLFiles.deflexical("S#11252", (SubLObject)$ic3$);
        $g1615$ = SubLFiles.deflexical("S#11253", (SubLObject)$ic4$);
        $g1616$ = SubLFiles.deflexical("S#11254", (SubLObject)$ic5$);
        $g1617$ = SubLFiles.deflexical("S#11255", (SubLObject)$ic6$);
        $g1618$ = SubLFiles.deflexical("S#11256", (SubLObject)$ic7$);
        $g1619$ = SubLFiles.defparameter("S#11257", (SubLObject)NIL);
        $g1620$ = SubLFiles.deflexical("S#11258", (SubLObject)$ic24$);
        $g1621$ = SubLFiles.deflexical("S#11259", (SubLObject)$ic25$);
        $g1622$ = SubLFiles.defparameter("S#11260", (SubLObject)NIL);
        $g1623$ = SubLFiles.defparameter("S#11261", (SubLObject)NIL);
        $g1624$ = SubLFiles.defparameter("S#11262", (SubLObject)NIL);
        $g1625$ = SubLFiles.defparameter("S#11263", (SubLObject)NIL);
        $g1626$ = SubLFiles.deflexical("S#11264", ReadWriteLocks.new_rw_lock((SubLObject)$ic47$));
        $g1627$ = SubLFiles.defparameter("S#11265", (SubLObject)NIL);
        $g1628$ = SubLFiles.defparameter("S#11266", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9004() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9002();
    }
    
    public void initializeVariables() {
        f9003();
    }
    
    public void runTopLevelForms() {
        f9004();
    }
    
    static {
        me = (SubLFile)new module0138();
        $g1611$ = null;
        $g1612$ = null;
        $g1613$ = null;
        $g1614$ = null;
        $g1615$ = null;
        $g1616$ = null;
        $g1617$ = null;
        $g1618$ = null;
        $g1619$ = null;
        $g1620$ = null;
        $g1621$ = null;
        $g1622$ = null;
        $g1623$ = null;
        $g1624$ = null;
        $g1625$ = null;
        $g1626$ = null;
        $g1627$ = null;
        $g1628$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("INVERSE"), (SubLObject)makeKeyword("LINK"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("INVERSE"));
        $ic2$ = makeKeyword("PREDICATE");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"));
        $ic4$ = makeKeyword("INVERSE");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("INVERSE"));
        $ic6$ = makeKeyword("LINK");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("LINK"));
        $ic8$ = makeKeyword("ERROR");
        $ic9$ = makeString("~A is not a ~A");
        $ic10$ = makeSymbol("S#11215", "CYC");
        $ic11$ = makeKeyword("CERROR");
        $ic12$ = makeString("continue anyway");
        $ic13$ = makeKeyword("WARN");
        $ic14$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic16$ = makeSymbol("CLET");
        $ic17$ = makeSymbol("S#11257", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11257", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11228", "CYC"))));
        $ic19$ = makeSymbol("S#11230", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#11267", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11102", "CYC")));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = makeSymbol("S#11267", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#11268", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11102", "CYC")));
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)makeString("DefaultTrue")), constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyFalse")), constant_handles_oc.f8479((SubLObject)makeString("DefaultFalse")));
        $ic25$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)makeString("DefaultTrue")));
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11269", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("S#6945", "CYC");
        $ic28$ = makeSymbol("S#11259", "CYC");
        $ic29$ = makeKeyword("DONE");
        $ic30$ = makeKeyword("TRUE");
        $ic31$ = makeKeyword("MONOTONIC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyTrue"));
        $ic33$ = makeKeyword("DEFAULT");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("DefaultTrue"));
        $ic35$ = makeKeyword("FALSE");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyFalse"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("DefaultFalse"));
        $ic38$ = makeKeyword("UNKNOWN");
        $ic39$ = makeString("could not compute an SBHL tv from ~s and ~s");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11260", "CYC"), (SubLObject)T));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11270", "CYC"), (SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic42$ = makeUninternedSymbol("US#56416CE");
        $ic43$ = makeSymbol("FIF");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#11242", "CYC"));
        $ic45$ = makeSymbol("S#3416", "CYC");
        $ic46$ = makeSymbol("S#115", "CYC");
        $ic47$ = makeString("SBHL");
        $ic48$ = makeSymbol("S#3018", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("S#11264", "CYC"));
        $ic50$ = makeSymbol("S#3019", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 109 ms
	
	Decompiled with Procyon 0.5.32.
*/