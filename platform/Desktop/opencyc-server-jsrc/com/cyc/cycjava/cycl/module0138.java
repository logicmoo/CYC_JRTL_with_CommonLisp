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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0138.NIL != f8968(var1) || module0138.NIL != f8969(var1));
    }
    
    public static SubLObject f8968(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.eql(module0138.$g1613$.getGlobalValue()) || var1.eql(module0138.$g1615$.getGlobalValue()));
    }
    
    public static SubLObject f8969(final SubLObject var1) {
        return Equality.eq(var1, module0138.$g1617$.getGlobalValue());
    }
    
    public static SubLObject f8970() {
        return module0138.$g1612$.getGlobalValue();
    }
    
    public static SubLObject f8971() {
        return module0138.$g1613$.getGlobalValue();
    }
    
    public static SubLObject f8972(final SubLObject var1) {
        return Equality.eq(var1, f8971());
    }
    
    public static SubLObject f8973() {
        return module0138.$g1614$.getGlobalValue();
    }
    
    public static SubLObject f8974() {
        return module0138.$g1615$.getGlobalValue();
    }
    
    public static SubLObject f8975(final SubLObject var1) {
        return Equality.eq(var1, f8974());
    }
    
    public static SubLObject f8976() {
        return module0138.$g1616$.getGlobalValue();
    }
    
    public static SubLObject f8977() {
        return module0138.$g1617$.getGlobalValue();
    }
    
    public static SubLObject f8978() {
        return module0138.$g1618$.getGlobalValue();
    }
    
    public static SubLObject f8979() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0138.$g1619$.getDynamicValue(var2);
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
        if (module0138.NIL != module0136.f8864() && module0138.NIL == f8967(module0138.$g1619$.getDynamicValue(var2))) {
            final SubLObject var3 = module0136.$g1591$.getDynamicValue(var2);
            if (var3.eql((SubLObject)module0138.$ic8$)) {
                module0136.f8870((SubLObject)module0138.ONE_INTEGER, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
            }
            else if (var3.eql((SubLObject)module0138.$ic11$)) {
                module0136.f8871((SubLObject)module0138.ONE_INTEGER, (SubLObject)module0138.$ic12$, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
            }
            else if (var3.eql((SubLObject)module0138.$ic13$)) {
                Errors.warn((SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$);
            }
            else {
                Errors.warn((SubLObject)module0138.$ic14$, module0136.$g1591$.getDynamicValue(var2));
                Errors.cerror((SubLObject)module0138.$ic12$, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$);
            }
        }
        return (SubLObject)module0138.NIL;
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
        if (module0138.NIL != module0136.f8864() && module0138.NIL == f8967(module0138.$g1619$.getDynamicValue(var2))) {
            final SubLObject var3 = module0136.$g1591$.getDynamicValue(var2);
            if (var3.eql((SubLObject)module0138.$ic8$)) {
                module0136.f8870((SubLObject)module0138.ONE_INTEGER, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
            }
            else if (var3.eql((SubLObject)module0138.$ic11$)) {
                module0136.f8871((SubLObject)module0138.ONE_INTEGER, (SubLObject)module0138.$ic12$, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
            }
            else if (var3.eql((SubLObject)module0138.$ic13$)) {
                Errors.warn((SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$);
            }
            else {
                Errors.warn((SubLObject)module0138.$ic14$, module0136.$g1591$.getDynamicValue(var2));
                Errors.cerror((SubLObject)module0138.$ic12$, (SubLObject)module0138.$ic9$, module0138.$g1619$.getDynamicValue(var2), (SubLObject)module0138.$ic10$);
            }
        }
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f8982(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0138.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic15$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0138.$ic17$, var8)), ConsesLow.append(var9, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8983(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic16$, (SubLObject)module0138.$ic18$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8984(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic19$, (SubLObject)module0138.$ic20$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8985(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0138.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic21$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0138.$ic22$, var8), ConsesLow.append(var9, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8986(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic19$, (SubLObject)module0138.$ic23$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8987(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic26$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)module0138.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic26$);
        var9 = var7.first();
        var7 = var7.rest();
        final SubLObject var10 = (SubLObject)(var7.isCons() ? var7.first() : module0138.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var6, (SubLObject)module0138.$ic26$);
        var7 = var7.rest();
        if (module0138.NIL == var7) {
            final SubLObject var11;
            var7 = (var11 = var8);
            return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic27$, (SubLObject)ConsesLow.list(var9, (SubLObject)module0138.$ic28$, (SubLObject)module0138.$ic29$, var10), ConsesLow.append(var11, (SubLObject)module0138.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0138.$ic26$);
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f8988(final SubLObject var23, final SubLObject var24) {
        if (var23 == module0138.$ic30$ && var24 == module0138.$ic31$) {
            return module0138.$ic32$;
        }
        if (var23 == module0138.$ic30$ && var24 == module0138.$ic33$) {
            return module0138.$ic34$;
        }
        if (var23 == module0138.$ic35$ && var24 == module0138.$ic31$) {
            return module0138.$ic36$;
        }
        if (var23 == module0138.$ic35$ && var24 == module0138.$ic33$) {
            return module0138.$ic37$;
        }
        if (var23 == module0138.$ic38$) {
            return (SubLObject)module0138.$ic38$;
        }
        module0136.f8870((SubLObject)module0138.ONE_INTEGER, (SubLObject)module0138.$ic39$, var23, var24, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f8989(final SubLObject var25) {
        final SubLObject var26 = module0130.f8524(var25);
        final SubLObject var27 = module0130.f8523(var25);
        return f8988(var26, var27);
    }
    
    public static SubLObject f8990(final SubLObject var23) {
        return module0004.f104(var23, module0138.$g1620$.getGlobalValue(), (SubLObject)module0138.UNPROVIDED, (SubLObject)module0138.UNPROVIDED);
    }
    
    public static SubLObject f8991(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0138.NIL;
        if (var26.isList()) {
            if (module0138.NIL == var27) {
                SubLObject var28 = var26;
                SubLObject var29 = (SubLObject)module0138.NIL;
                var29 = var28.first();
                while (module0138.NIL == var27 && module0138.NIL != var28) {
                    if (module0138.NIL == f8992(var29)) {
                        var27 = (SubLObject)module0138.T;
                    }
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        else {
            var27 = (SubLObject)module0138.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0138.NIL == var27);
    }
    
    public static SubLObject f8992(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0138.NIL != module0173.f10955(var26) || module0138.NIL != module0324.f21935(var26));
    }
    
    public static SubLObject f8993(final SubLObject var26) {
        return module0161.f10484(var26);
    }
    
    public static SubLObject f8994(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic16$, (SubLObject)module0138.$ic40$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f8995() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0138.$g1622$.getDynamicValue(var2);
    }
    
    public static SubLObject f8996(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic41$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)module0138.NIL;
        SubLObject var10 = (SubLObject)module0138.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic41$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0138.$ic41$);
        var10 = var7.first();
        var7 = var7.rest();
        final SubLObject var11 = (SubLObject)(var7.isCons() ? var7.first() : module0138.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var6, (SubLObject)module0138.$ic41$);
        var7 = var7.rest();
        if (module0138.NIL == var7) {
            final SubLObject var12;
            var7 = (var12 = var8);
            final SubLObject var13 = (SubLObject)module0138.$ic42$;
            return (SubLObject)ConsesLow.list((SubLObject)module0138.$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)module0138.$ic43$, (SubLObject)module0138.$ic44$, (SubLObject)ConsesLow.list((SubLObject)module0138.$ic45$, var10), var10))), (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic46$, (SubLObject)ConsesLow.list(var9, var13, var11), ConsesLow.append(var12, (SubLObject)module0138.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0138.$ic41$);
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f8997() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0138.$g1623$.getDynamicValue(var2);
    }
    
    public static SubLObject f8998() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0138.$g1624$.getDynamicValue(var2);
    }
    
    public static SubLObject f8999() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0138.$g1625$.getDynamicValue(var2);
    }
    
    public static SubLObject f9000(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic48$, (SubLObject)module0138.$ic49$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
    }
    
    public static SubLObject f9001(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0138.$ic50$, (SubLObject)module0138.$ic49$, ConsesLow.append(var8, (SubLObject)module0138.NIL));
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
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f9003() {
        module0138.$g1611$ = SubLFiles.deflexical("S#11249", (SubLObject)module0138.$ic0$);
        module0138.$g1612$ = SubLFiles.deflexical("S#11250", (SubLObject)module0138.$ic1$);
        module0138.$g1613$ = SubLFiles.deflexical("S#11251", (SubLObject)module0138.$ic2$);
        module0138.$g1614$ = SubLFiles.deflexical("S#11252", (SubLObject)module0138.$ic3$);
        module0138.$g1615$ = SubLFiles.deflexical("S#11253", (SubLObject)module0138.$ic4$);
        module0138.$g1616$ = SubLFiles.deflexical("S#11254", (SubLObject)module0138.$ic5$);
        module0138.$g1617$ = SubLFiles.deflexical("S#11255", (SubLObject)module0138.$ic6$);
        module0138.$g1618$ = SubLFiles.deflexical("S#11256", (SubLObject)module0138.$ic7$);
        module0138.$g1619$ = SubLFiles.defparameter("S#11257", (SubLObject)module0138.NIL);
        module0138.$g1620$ = SubLFiles.deflexical("S#11258", (SubLObject)module0138.$ic24$);
        module0138.$g1621$ = SubLFiles.deflexical("S#11259", (SubLObject)module0138.$ic25$);
        module0138.$g1622$ = SubLFiles.defparameter("S#11260", (SubLObject)module0138.NIL);
        module0138.$g1623$ = SubLFiles.defparameter("S#11261", (SubLObject)module0138.NIL);
        module0138.$g1624$ = SubLFiles.defparameter("S#11262", (SubLObject)module0138.NIL);
        module0138.$g1625$ = SubLFiles.defparameter("S#11263", (SubLObject)module0138.NIL);
        module0138.$g1626$ = SubLFiles.deflexical("S#11264", ReadWriteLocks.new_rw_lock((SubLObject)module0138.$ic47$));
        module0138.$g1627$ = SubLFiles.defparameter("S#11265", (SubLObject)module0138.NIL);
        module0138.$g1628$ = SubLFiles.defparameter("S#11266", (SubLObject)module0138.NIL);
        return (SubLObject)module0138.NIL;
    }
    
    public static SubLObject f9004() {
        return (SubLObject)module0138.NIL;
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
        module0138.$g1611$ = null;
        module0138.$g1612$ = null;
        module0138.$g1613$ = null;
        module0138.$g1614$ = null;
        module0138.$g1615$ = null;
        module0138.$g1616$ = null;
        module0138.$g1617$ = null;
        module0138.$g1618$ = null;
        module0138.$g1619$ = null;
        module0138.$g1620$ = null;
        module0138.$g1621$ = null;
        module0138.$g1622$ = null;
        module0138.$g1623$ = null;
        module0138.$g1624$ = null;
        module0138.$g1625$ = null;
        module0138.$g1626$ = null;
        module0138.$g1627$ = null;
        module0138.$g1628$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"), (SubLObject)SubLObjectFactory.makeKeyword("LINK"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $ic2$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"));
        $ic4$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $ic6$ = SubLObjectFactory.makeKeyword("LINK");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK"));
        $ic8$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic9$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic10$ = SubLObjectFactory.makeSymbol("S#11215", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic12$ = SubLObjectFactory.makeString("continue anyway");
        $ic13$ = SubLObjectFactory.makeKeyword("WARN");
        $ic14$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("CLET");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11257", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11257", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11228", "CYC"))));
        $ic19$ = SubLObjectFactory.makeSymbol("S#11230", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11267", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11102", "CYC")));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#11267", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11268", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11102", "CYC")));
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultTrue")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultFalse")));
        $ic25$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultTrue")));
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#6945", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#11259", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("DONE");
        $ic30$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic31$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue"));
        $ic33$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultTrue"));
        $ic35$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultFalse"));
        $ic38$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic39$ = SubLObjectFactory.makeString("could not compute an SBHL tv from ~s and ~s");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11260", "CYC"), (SubLObject)module0138.T));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11270", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#56416CE");
        $ic43$ = SubLObjectFactory.makeSymbol("FIF");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11242", "CYC"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#3416", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#115", "CYC");
        $ic47$ = SubLObjectFactory.makeString("SBHL");
        $ic48$ = SubLObjectFactory.makeSymbol("S#3018", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11264", "CYC"));
        $ic50$ = SubLObjectFactory.makeSymbol("S#3019", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0138.class
	Total time: 109 ms
	
	Decompiled with Procyon 0.5.32.
*/