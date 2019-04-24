package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0387 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0387";
    public static final String myFingerPrint = "496499a6bce3591449ab00332643f029946509583f4f94ab7a310000040a9820";
    private static SubLSymbol $g3233$;
    private static SubLSymbol $g3234$;
    private static SubLSymbol $g3235$;
    private static SubLSymbol $g3236$;
    private static SubLSymbol $g3237$;
    private static SubLSymbol $g3238$;
    public static SubLSymbol $g3239$;
    private static SubLSymbol $g3240$;
    private static SubLSymbol $g3241$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
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
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    
    public static SubLObject f27467(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f27468(var1);
        final SubLObject var3 = module0339.$g2902$.currentBinding(var2);
        try {
            module0339.$g2902$.bind(var1, var2);
            module0367.f25108(var1);
            module0369.f25575(module0367.f25037(var1));
            module0369.f25576(module0367.f25037(var1));
            module0367.f25109(var1, (SubLObject)module0387.$ic0$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
        }
        finally {
            module0339.$g2902$.rebind(var3, var2);
        }
        module0413.f28825(module0339.f22757());
        module0413.f28829(module0339.f22757());
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27469(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic1$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27470(final SubLObject var1, final SubLObject var4) {
        module0367.f25209(module0365.f24850(var4), var4, var1);
        module0373.f26292(var1, var4);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27471(final SubLObject var1, final SubLObject var5) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic2$, var5, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27472(final SubLObject var1, final SubLObject var6) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic3$, var6, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27473(final SubLObject var1) {
        final SubLObject var2 = module0367.f25044(var1);
        return module0373.f26443(var2, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27474() {
        module0387.$g3234$.setDynamicValue((SubLObject)module0387.ZERO_INTEGER);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27468(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0408.f28492(module0367.f25037(var1));
        if (module0387.NIL != module0387.$g3233$.getDynamicValue(var2)) {
            if (module0387.$g3234$.getDynamicValue(var2).numGE(module0387.$g3233$.getDynamicValue(var2))) {
                module0373.f26443(module0367.f25044(var1), (SubLObject)module0387.UNPROVIDED);
                f27474();
            }
            module0387.$g3234$.setDynamicValue(Numbers.add(module0387.$g3234$.getDynamicValue(var2), (SubLObject)module0387.ONE_INTEGER), var2);
            return module0387.$g3234$.getDynamicValue(var2);
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27475(final SubLObject var1, SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert module0387.NIL != module0367.f24997(var1) : var1;
        final SubLObject var11 = module0387.$g3235$.currentBinding(var10);
        final SubLObject var12 = module0387.$g3236$.currentBinding(var10);
        try {
            module0387.$g3235$.bind(var1, var10);
            module0387.$g3236$.bind(var9, var10);
            var8 = Sort.stable_sort(var8, (SubLObject)module0387.$ic5$, (SubLObject)module0387.UNPROVIDED);
        }
        finally {
            module0387.$g3236$.rebind(var12, var10);
            module0387.$g3235$.rebind(var11, var10);
        }
        return var8;
    }
    
    public static SubLObject f27476(final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return Functions.funcall(module0387.$g3236$.getDynamicValue(var13), var11, var12, module0387.$g3235$.getDynamicValue(var13));
    }
    
    public static SubLObject f27477(final SubLObject var15, final SubLObject var16, final SubLObject var1) {
        return module0360.f23940(module0367.f25203(var15, var1), module0367.f25203(var16, var1));
    }
    
    public static SubLObject f27478(final SubLObject var17, final SubLObject var18, final SubLObject var1) {
        final SubLObject var19 = f27479(var17, var1);
        final SubLObject var20 = f27479(var18, var1);
        return module0360.f23940(module0385.f27404(var19, var1), module0385.f27404(var20, var1));
    }
    
    public static SubLObject f27479(final SubLObject var21, final SubLObject var1) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0387.NIL != module0382.f27206(var21)) {
            var22.resetMultipleValues();
            final SubLObject var23 = module0382.f27211(var21);
            final SubLObject var24 = var22.secondMultipleValue();
            var22.resetMultipleValues();
            return (module0387.NIL != module0360.f23940(module0385.f27404(var23, var1), module0385.f27404(var24, var1))) ? var24 : var23;
        }
        return module0373.f26168(var21);
    }
    
    public static SubLObject f27480(final SubLObject var24) {
        if (module0387.$ic8$ == var24) {
            return (SubLObject)module0387.$ic8$;
        }
        return f27481(var24);
    }
    
    public static SubLObject f27481(final SubLObject var1) {
        return module0369.f25606(module0367.f25037(var1));
    }
    
    public static SubLObject f27482(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0367.f24997(var1) && var1.eql(f27481(var1)));
    }
    
    public static SubLObject f27483(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0367.f24997(var1) && !var1.eql(f27481(var1)));
    }
    
    public static SubLObject f27484(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != f27482(var1) && module0387.NIL != module0369.f25514(module0367.f25037(var1)));
    }
    
    public static SubLObject f27485(final SubLObject var25, final SubLObject var26) {
        SubLObject var28;
        final SubLObject var27 = var28 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0387.$ic9$);
        final SubLObject var29 = var28.rest();
        var28 = var28.first();
        SubLObject var30 = (SubLObject)module0387.NIL;
        SubLObject var31 = (SubLObject)module0387.NIL;
        SubLObject var32 = (SubLObject)module0387.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0387.$ic9$);
        var30 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0387.$ic9$);
        var31 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0387.$ic9$);
        var32 = var28.first();
        var28 = var28.rest();
        SubLObject var33 = (SubLObject)module0387.NIL;
        SubLObject var34 = var28;
        SubLObject var35 = (SubLObject)module0387.NIL;
        SubLObject var34_35 = (SubLObject)module0387.NIL;
        while (module0387.NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var27, (SubLObject)module0387.$ic9$);
            var34_35 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var27, (SubLObject)module0387.$ic9$);
            if (module0387.NIL == conses_high.member(var34_35, (SubLObject)module0387.$ic10$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED)) {
                var35 = (SubLObject)module0387.T;
            }
            if (var34_35 == module0387.$ic11$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (module0387.NIL != var35 && module0387.NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0387.$ic9$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0387.$ic12$, var28);
        final SubLObject var37 = (SubLObject)((module0387.NIL != var36) ? conses_high.cadr(var36) : module0387.NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0387.$ic13$, var28);
        final SubLObject var39 = (SubLObject)((module0387.NIL != var38) ? conses_high.cadr(var38) : module0387.NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0387.$ic14$, var28);
        final SubLObject var41 = (SubLObject)((module0387.NIL != var40) ? conses_high.cadr(var40) : module0387.NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)module0387.$ic15$, var28);
        final SubLObject var43 = (SubLObject)((module0387.NIL != var42) ? conses_high.cadr(var42) : module0387.NIL);
        final SubLObject var44;
        var28 = (var44 = var29);
        final SubLObject var45 = var41;
        if (var45.eql((SubLObject)module0387.$ic16$) || var45.eql((SubLObject)module0387.$ic17$) || var45.eql((SubLObject)module0387.$ic18$)) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0387.$ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { var30, var31, module0387.$ic12$, var37, module0387.$ic13$, var39, module0387.$ic14$, var41, module0387.$ic15$, var43 }), (SubLObject)ConsesLow.list((SubLObject)module0387.$ic20$, var32), ConsesLow.append(var44, (SubLObject)module0387.NIL));
        }
        final SubLObject var46 = (SubLObject)module0387.$ic21$;
        final SubLObject var47 = (SubLObject)module0387.$ic22$;
        final SubLObject var48 = (SubLObject)module0387.$ic23$;
        return (SubLObject)ConsesLow.list((SubLObject)module0387.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var31), (SubLObject)ConsesLow.list(var47, var41), (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0387.$ic25$, var46, var47))), (SubLObject)ConsesLow.list((SubLObject)module0387.$ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { var30, var46, module0387.$ic12$, var37, module0387.$ic13$, var39, module0387.$ic14$, var47, module0387.$ic15$, var43 }), (SubLObject)ConsesLow.listS((SubLObject)module0387.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0387.$ic27$, var30, var48, var32), ConsesLow.append(var44, (SubLObject)module0387.NIL))));
    }
    
    public static SubLObject f27486(final SubLObject var5, final SubLObject var49) {
        SubLObject var50 = (SubLObject)module0387.NIL;
        if (module0387.NIL == var49 || var49 == module0387.$ic29$ || var49 == module0387.$ic30$) {
            SubLObject var51 = module0363.f24517(var5);
            SubLObject var52 = (SubLObject)module0387.NIL;
            var52 = var51.first();
            while (module0387.NIL != var51) {
                if (module0387.NIL != module0363.f24524(var52, (SubLObject)module0387.$ic29$) && module0387.NIL == module0381.f27068(var52)) {
                    var50 = (SubLObject)ConsesLow.cons(var52, var50);
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
            var50 = module0035.f2462(var50, (SubLObject)module0387.$ic31$, (SubLObject)module0387.UNPROVIDED);
            var50 = Sequences.nreverse(var50);
        }
        return var50;
    }
    
    public static SubLObject f27487(final SubLObject var52, final SubLObject var48, final SubLObject var24) {
        SubLObject var53 = (SubLObject)module0387.NIL;
        if (module0387.NIL != var48 && module0387.NIL != module0381.f27067(var52) && module0387.NIL == var53) {
            SubLObject var54 = var48;
            SubLObject var55 = (SubLObject)module0387.NIL;
            var55 = var54.first();
            while (module0387.NIL == var53 && module0387.NIL != var54) {
                if (!var52.eql(var55) && module0387.NIL != module0381.f27070(var55, var52) && module0387.NIL == f27488(var55, var52, var24)) {
                    var53 = (SubLObject)module0387.T;
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        return var53;
    }
    
    public static SubLObject f27488(final SubLObject var56, final SubLObject var57, final SubLObject var24) {
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27489(final SubLObject var5, final SubLObject var24, final SubLObject var58, final SubLObject var59, final SubLObject var60, SubLObject var37, SubLObject var61, SubLObject var39, SubLObject var41) {
        if (var37 == module0387.UNPROVIDED) {
            var37 = (SubLObject)module0387.NIL;
        }
        if (var61 == module0387.UNPROVIDED) {
            var61 = (SubLObject)module0387.NIL;
        }
        if (var39 == module0387.UNPROVIDED) {
            var39 = (SubLObject)module0387.NIL;
        }
        if (var41 == module0387.UNPROVIDED) {
            var41 = (SubLObject)module0387.NIL;
        }
        SubLObject var62 = (SubLObject)module0387.NIL;
        SubLObject var63 = (SubLObject)module0387.NIL;
        SubLObject var64 = (SubLObject)module0387.NIL;
        SubLObject var65 = (SubLObject)module0387.NIL;
        final SubLObject var66 = var41;
        final SubLObject var67 = f27486(var5, var66);
        SubLObject var68;
        SubLObject var69;
        SubLObject var70;
        for (var68 = (SubLObject)module0387.NIL, var68 = module0363.f24517(var5); module0387.NIL == var65 && module0387.NIL != var68; var68 = var68.rest()) {
            var69 = var68.first();
            if (module0387.NIL != module0363.f24524(var69, var66) && module0387.NIL != module0363.f24518(var69, var37) && module0387.NIL != module0363.f24522(var69, var39) && module0387.NIL == f27487(var69, var67, var24) && (module0387.NIL == var61 || var61.eql(module0367.f25200(var69, var24)))) {
                if (module0387.NIL == module0367.f24997(var24) || module0387.NIL == module0384.f27277(var24, var69)) {
                    if (module0387.NIL != module0367.f24997(var24) && module0387.NIL != module0384.f27285(var24, var69)) {
                        var64 = (SubLObject)module0387.T;
                    }
                    else if (module0387.NIL == var62) {
                        var62 = var69;
                        var63 = ((module0387.NIL != var60) ? Functions.funcall(var60, var62, var24) : var62);
                        var65 = (SubLObject)((module0387.NIL != var59) ? Functions.funcall(var59, var63, var24) : module0387.NIL);
                    }
                    else {
                        var70 = ((module0387.NIL != var60) ? Functions.funcall(var60, var69, var24) : var69);
                        if (module0387.NIL != Functions.funcall(var58, var63, var70, var24)) {
                            var62 = var69;
                            var63 = var70;
                            var65 = (SubLObject)((module0387.NIL != var59) ? Functions.funcall(var59, var63, var24) : module0387.NIL);
                        }
                    }
                }
            }
        }
        return Values.values(var62, var63, var64);
    }
    
    public static SubLObject f27490(final SubLObject var15, final SubLObject var16, final SubLObject var24, final SubLObject var58) {
        SubLObject var59 = (SubLObject)module0387.NIL;
        if (module0387.NIL == var15) {
            assert module0387.NIL != module0365.f24819(var16) : var16;
            var59 = var16;
        }
        else if (module0387.NIL == var16) {
            assert module0387.NIL != module0365.f24819(var15) : var15;
            var59 = var15;
        }
        else {
            assert module0387.NIL != module0365.f24819(var15) : var15;
            assert module0387.NIL != module0365.f24819(var16) : var16;
            if (module0387.NIL != Functions.funcall(var58, var16, var15, var24)) {
                var59 = var16;
            }
            else {
                var59 = var15;
            }
        }
        return var59;
    }
    
    public static SubLObject f27491(final SubLObject var5, final SubLObject var24, SubLObject var37, SubLObject var61, SubLObject var73, SubLObject var41) {
        if (var37 == module0387.UNPROVIDED) {
            var37 = (SubLObject)module0387.NIL;
        }
        if (var61 == module0387.UNPROVIDED) {
            var61 = (SubLObject)module0387.NIL;
        }
        if (var73 == module0387.UNPROVIDED) {
            var73 = (SubLObject)module0387.NIL;
        }
        if (var41 == module0387.UNPROVIDED) {
            var41 = (SubLObject)module0387.NIL;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        var74.resetMultipleValues();
        final SubLObject var75 = f27489(var5, var24, (SubLObject)module0387.$ic33$, (SubLObject)module0387.$ic34$, (SubLObject)module0387.NIL, var37, var61, var73, var41);
        final SubLObject var76 = var74.secondMultipleValue();
        final SubLObject var77 = var74.thirdMultipleValue();
        var74.resetMultipleValues();
        return Values.values(var75, var77);
    }
    
    public static SubLObject f27492(final SubLObject var75, final SubLObject var76, final SubLObject var77, final SubLObject var78) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0360.f23927(var76, var78) || (module0387.NIL == module0360.f23928(var76, var78) && module0387.NIL != module0360.f23942(var75, var77)));
    }
    
    public static SubLObject f27493(final SubLObject var75, final SubLObject var76, final SubLObject var77, final SubLObject var78) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0360.f23928(var76, var78) || (module0387.NIL == module0360.f23927(var76, var78) && module0387.NIL != module0360.f23940(var75, var77)));
    }
    
    public static SubLObject f27494(final SubLObject var15, final SubLObject var16, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var15, var24);
        final SubLObject var26 = module0367.f25200(var15, var24);
        final SubLObject var27 = module0367.f25203(var16, var24);
        final SubLObject var28 = module0367.f25200(var16, var24);
        return f27492(var25, var26, var27, var28);
    }
    
    public static SubLObject f27495(final SubLObject var15, final SubLObject var16, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var15, var24);
        final SubLObject var26 = module0367.f25200(var15, var24);
        final SubLObject var27 = module0367.f25203(var16, var24);
        final SubLObject var28 = module0367.f25200(var16, var24);
        return f27493(var25, var26, var27, var28);
    }
    
    public static SubLObject f27496(final SubLObject var4, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var4, var24);
        final SubLObject var26 = module0367.f25200(var4, var24);
        final SubLObject var27 = module0387.$g3237$.getGlobalValue();
        final SubLObject var28 = (SubLObject)module0387.$ic35$;
        return f27493(var25, var26, var27, var28);
    }
    
    public static SubLObject f27497(final SubLObject var15, final SubLObject var16, final SubLObject var24) {
        final SubLObject var25 = (SubLObject)module0387.$ic36$;
        final SubLObject var26 = f27490(var15, var16, var24, var25);
        final SubLObject var27 = f27498(var26, var24);
        return Values.values(var26, var27);
    }
    
    public static SubLObject f27499(final SubLObject var15, final SubLObject var16, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var15, var24);
        final SubLObject var26 = module0367.f25203(var16, var24);
        return module0360.f23942(var25, var26);
    }
    
    public static SubLObject f27500(final SubLObject var15, final SubLObject var16, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var15, var24);
        final SubLObject var26 = module0367.f25203(var16, var24);
        return module0360.f23940(var25, var26);
    }
    
    public static SubLObject f27498(final SubLObject var4, final SubLObject var24) {
        final SubLObject var25 = module0367.f25203(var4, var24);
        final SubLObject var26 = module0387.$g3237$.getGlobalValue();
        return module0360.f23940(var25, var26);
    }
    
    public static SubLObject f27501(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (var24 == module0387.$ic8$) {
            return module0387.$g3238$.getDynamicValue(var25);
        }
        return f27502(var24);
    }
    
    public static SubLObject f27502(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic39$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27503(final SubLObject var4) {
        assert module0387.NIL != module0365.f24819(var4) : var4;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0381.f27067(var4) && module0387.$ic35$ == module0373.f26193(module0381.f27095(var4), (SubLObject)module0387.$ic8$) && module0387.NIL != f27504(var4));
    }
    
    public static SubLObject f27504(final SubLObject var90) {
        final SubLObject var91 = module0381.f27055(var90);
        return f27505(var91, (SubLObject)module0387.$ic8$);
    }
    
    public static SubLObject f27505(final SubLObject var91, final SubLObject var24) {
        final SubLObject var92 = f27501(var24);
        if (module0387.NIL == var92) {
            return (SubLObject)module0387.NIL;
        }
        final SubLObject var93 = module0381.f27050(var91);
        if (module0387.NIL != f27506(var93)) {
            final SubLObject var94 = module0385.f27404(var93, var24);
            return module0360.f23941(var94, var92);
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27506(final SubLObject var5) {
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)module0387.NIL, var7 = (SubLObject)module0387.NIL, var7 = module0363.f24517(var5); module0387.NIL == var6 && module0387.NIL != var7; var7 = var7.rest()) {
            var8 = var7.first();
            if (module0387.NIL == module0035.f2169((SubLObject)module0387.$ic40$, module0340.f22792(module0365.f24865(var8)))) {
                var6 = (SubLObject)module0387.T;
            }
        }
        return var6;
    }
    
    public static SubLObject f27507(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic41$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27508(final SubLObject var1, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (module0018.$g630$.getDynamicValue(var97).numGE((SubLObject)module0387.ONE_INTEGER)) {
            module0006.f218((SubLObject)module0387.T, (SubLObject)module0387.$ic42$, var1, var96, (SubLObject)module0387.NIL, (SubLObject)module0387.NIL, (SubLObject)module0387.NIL, (SubLObject)module0387.NIL, (SubLObject)module0387.NIL, (SubLObject)module0387.NIL);
        }
        f27509(var1, var96);
        return module0367.f25109(var1, (SubLObject)module0387.$ic43$, var96, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27509(final SubLObject var1, final SubLObject var96) {
        if (module0387.NIL != module0383.f27235(var96)) {
            return module0383.f27250(var96);
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27510(final SubLObject var1, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0387.NIL != module0367.f24997(var1) : var1;
        assert module0387.NIL != module0365.f24819(var4) : var4;
        if (module0387.NIL != module0365.f24882(var4)) {
            module0369.f25818(module0367.f25037(var1), var4);
            final SubLObject var6 = module0339.$g2902$.currentBinding(var5);
            try {
                module0339.$g2902$.bind(var1, var5);
                module0373.f26131(var4);
            }
            finally {
                module0339.$g2902$.rebind(var6, var5);
            }
            return var4;
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27511(final SubLObject var1, final SubLObject var4) {
        return module0035.sublisp_boolean(f27510(var1, var4));
    }
    
    public static SubLObject f27512(final SubLObject var1, final SubLObject var5) {
        if (module0387.NIL != module0363.f24586(var5, var1)) {
            module0373.f26293(var5, var1);
        }
        return module0367.f25101(var1, var5);
    }
    
    public static SubLObject f27513(final SubLObject var5, final SubLObject var1) {
        if (module0387.$ic44$ != module0367.f25143(var5, var1)) {
            f27514(var5, var1);
            return (SubLObject)module0387.T;
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27514(final SubLObject var5, final SubLObject var1) {
        module0367.f25210(var5, var1);
        module0373.f26308(var5, var1);
        return var1;
    }
    
    public static SubLObject f27515(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic45$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27516(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL == module0361.f24164(module0367.f25044(var1)) || (module0387.NIL != module0387.$g3239$.getDynamicValue(var2) && module0387.NIL == module0369.f25432(module0367.f25037(var1)) && module0387.NIL != f27517(var1)));
    }
    
    public static SubLObject f27517(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL == module0373.f26364(module0367.f25037(var1), module0367.f25080(var1)));
    }
    
    public static SubLObject f27518(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic46$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27519() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0387.$g3240$.getDynamicValue(var2);
    }
    
    public static SubLObject f27520(final SubLObject var97) {
        if (module0387.NIL == f27519()) {
            return (SubLObject)module0387.NIL;
        }
        return module0035.sublisp_boolean(f27521(var97));
    }
    
    public static SubLObject f27521(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = module0364.f24725(var97);
        final SubLObject var100 = module0363.f24563(var99);
        final SubLObject var101 = module0363.f24565(var99);
        final SubLObject var102 = module0377.f26758(var97);
        return module0035.f2269(ConsesLow.nconc(f27522(var102), (SubLObject)((module0387.NIL != module0387.$g3241$.getDynamicValue(var98)) ? module0377.f26850(var100, var101) : module0387.NIL)), (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27522(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0387.NIL;
        SubLObject var7 = module0363.f24509(var5);
        SubLObject var8 = (SubLObject)module0387.NIL;
        var8 = var7.first();
        while (module0387.NIL != var7) {
            SubLObject var9 = (SubLObject)module0387.$ic47$;
            SubLObject var10 = (SubLObject)module0387.ZERO_INTEGER;
            SubLObject var51_106 = module0232.f15306(var8);
            SubLObject var11 = (SubLObject)module0387.NIL;
            var11 = var51_106.first();
            while (module0387.NIL != var51_106) {
                SubLObject var13;
                final SubLObject var12 = var13 = var11;
                SubLObject var14 = (SubLObject)module0387.NIL;
                SubLObject var15 = (SubLObject)module0387.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0387.$ic48$);
                var14 = var13.first();
                var13 = var13.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0387.$ic48$);
                var15 = var13.first();
                var13 = var13.rest();
                if (module0387.NIL == var13) {
                    if (module0387.$ic49$ == var9 && module0387.NIL != module0205.f13332(var15, module0387.$ic50$) && module0387.NIL != module0193.f12106(var15)) {
                        SubLObject var51_107 = module0205.f13183(var15, (SubLObject)module0387.$ic51$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
                        SubLObject var16 = (SubLObject)module0387.NIL;
                        var16 = var51_107.first();
                        while (module0387.NIL != var51_107) {
                            var6 = (SubLObject)ConsesLow.cons(var16, var6);
                            var51_107 = var51_107.rest();
                            var16 = var51_107.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0387.$ic48$);
                }
                var10 = Numbers.add(var10, (SubLObject)module0387.ONE_INTEGER);
                var51_106 = var51_106.rest();
                var11 = var51_106.first();
            }
            var9 = (SubLObject)module0387.$ic49$;
            var10 = (SubLObject)module0387.ZERO_INTEGER;
            SubLObject var51_108 = module0232.f15308(var8);
            var11 = (SubLObject)module0387.NIL;
            var11 = var51_108.first();
            while (module0387.NIL != var51_108) {
                SubLObject var18;
                final SubLObject var17 = var18 = var11;
                SubLObject var14 = (SubLObject)module0387.NIL;
                SubLObject var15 = (SubLObject)module0387.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0387.$ic48$);
                var14 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0387.$ic48$);
                var15 = var18.first();
                var18 = var18.rest();
                if (module0387.NIL == var18) {
                    if (module0387.$ic49$ == var9 && module0387.NIL != module0205.f13332(var15, module0387.$ic50$) && module0387.NIL != module0193.f12106(var15)) {
                        SubLObject var51_109 = module0205.f13183(var15, (SubLObject)module0387.$ic51$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
                        SubLObject var16 = (SubLObject)module0387.NIL;
                        var16 = var51_109.first();
                        while (module0387.NIL != var51_109) {
                            var6 = (SubLObject)ConsesLow.cons(var16, var6);
                            var51_109 = var51_109.rest();
                            var16 = var51_109.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0387.$ic48$);
                }
                var10 = Numbers.add(var10, (SubLObject)module0387.ONE_INTEGER);
                var51_108 = var51_108.rest();
                var11 = var51_108.first();
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0035.f2269(var6, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27523(final SubLObject var97) {
        SubLObject var98 = (SubLObject)module0387.NIL;
        final SubLObject var99 = module0364.f24725(var97);
        final SubLObject var100 = module0363.f24530(var99);
        SubLObject var101;
        SubLObject var102;
        SubLObject var103;
        SubLObject var125_126;
        SubLObject var104;
        SubLObject var121_128;
        SubLObject var122_129;
        SubLObject var123_130;
        SubLObject var105;
        SubLObject var106;
        SubLObject var98_133;
        SubLObject var107;
        SubLObject var121_129;
        SubLObject var122_130;
        SubLObject var123_131;
        SubLObject var108;
        SubLObject var109;
        SubLObject var121_130;
        SubLObject var122_131;
        SubLObject var123_132;
        SubLObject var110;
        SubLObject var111;
        for (var101 = module0032.f1741(var100), var102 = (SubLObject)module0387.NIL, var102 = module0032.f1742(var101, var100); module0387.NIL == module0032.f1744(var101, var102); var102 = module0032.f1743(var102)) {
            var103 = module0032.f1745(var101, var102);
            if (module0387.NIL != module0032.f1746(var102, var103) && module0387.NIL != module0364.f24748(var103, (SubLObject)module0387.$ic29$)) {
                var125_126 = var103;
                var104 = module0364.f24725(var125_126);
                var121_128 = module0363.f24527(var104);
                for (var122_129 = module0032.f1741(var121_128), var123_130 = (SubLObject)module0387.NIL, var123_130 = module0032.f1742(var122_129, var121_128); module0387.NIL == module0032.f1744(var122_129, var123_130); var123_130 = module0032.f1743(var123_130)) {
                    var105 = module0032.f1745(var122_129, var123_130);
                    if (module0387.NIL != module0032.f1746(var123_130, var105) && module0387.NIL != module0364.f24748(var105, (SubLObject)module0387.$ic52$) && module0387.NIL != module0378.f26866(var105, var125_126) && module0387.NIL != module0378.f26868(var105, var97)) {
                        var106 = module0378.f26872(var105);
                        var98_133 = module0364.f24725(var105);
                        var107 = f27524(var105);
                        var121_129 = module0363.f24527(var98_133);
                        for (var122_130 = module0032.f1741(var121_129), var123_131 = (SubLObject)module0387.NIL, var123_131 = module0032.f1742(var122_130, var121_129); module0387.NIL == module0032.f1744(var122_130, var123_131); var123_131 = module0032.f1743(var123_131)) {
                            var108 = module0032.f1745(var122_130, var123_131);
                            if (module0387.NIL != module0032.f1746(var123_131, var108) && module0387.NIL != module0364.f24748(var108, (SubLObject)module0387.$ic29$) && !var108.eql(var106) && module0387.NIL != f27525(var108, var107)) {
                                var109 = var108;
                                var121_130 = module0363.f24527(module0381.f27051(var109));
                                for (var122_131 = module0032.f1741(var121_130), var123_132 = (SubLObject)module0387.NIL, var123_132 = module0032.f1742(var122_131, var121_130); module0387.NIL == module0032.f1744(var122_131, var123_132); var123_132 = module0032.f1743(var123_132)) {
                                    var110 = module0032.f1745(var122_131, var123_132);
                                    if (module0387.NIL != module0032.f1746(var123_132, var110) && module0387.NIL != module0364.f24748(var110, (SubLObject)module0387.$ic53$) && module0387.NIL != module0381.f27133(var110, var109)) {
                                        var111 = module0364.f24757(var110);
                                        var98 = (SubLObject)ConsesLow.cons(var111, var98);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var98);
    }
    
    public static SubLObject f27524(final SubLObject var131) {
        final SubLObject var132 = module0378.f26869(var131);
        final SubLObject var133 = module0378.f26895(var131);
        final SubLObject var134 = f27522(module0364.f24736(var132));
        final SubLObject var135 = module0233.f15362(var133, var134);
        return var135;
    }
    
    public static SubLObject f27525(final SubLObject var91, final SubLObject var102) {
        final SubLObject var103 = module0381.f27142(var91);
        final SubLObject var104 = module0363.f24559(module0381.f27050(var91));
        final SubLObject var105 = module0233.f15362(var103, var104);
        return conses_high.subsetp(var102, var105, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27526(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != f27527(var151) || module0387.NIL != f27528(var151) || module0387.NIL != module0363.f24478(var151));
    }
    
    public static SubLObject f27527(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0373.f26176(var151) || module0387.NIL != module0373.f26148(var151));
    }
    
    public static SubLObject f27529(final SubLObject var96) {
        if (module0387.NIL != module0365.f24819(var96)) {
            return module0365.f24846(var96);
        }
        if (module0387.NIL != module0364.f24699(var96)) {
            return module0364.f24720(var96);
        }
        if (module0387.NIL != module0363.f24478(var96)) {
            return module0363.f24505(var96);
        }
        return Errors.error((SubLObject)module0387.$ic54$, var96);
    }
    
    public static SubLObject f27530(final SubLObject var96) {
        if (module0387.NIL != module0365.f24819(var96)) {
            return module0365.f24850(var96);
        }
        if (module0387.NIL != module0364.f24699(var96)) {
            return module0364.f24725(var96);
        }
        if (module0387.NIL != module0363.f24478(var96)) {
            return var96;
        }
        return Errors.error((SubLObject)module0387.$ic54$, var96);
    }
    
    public static SubLObject f27528(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0373.f26163(var151) || module0387.NIL != f27531(var151));
    }
    
    public static SubLObject f27531(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0377.f26746(var151) || module0387.NIL != module0374.f26529(var151));
    }
    
    public static SubLObject f27532(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0376.f26618(var151) || module0387.NIL != module0379.f26934(var151) || module0387.NIL != module0373.f26163(var151) || module0387.NIL != module0373.f26148(var151) || module0387.NIL != module0374.f26529(var151));
    }
    
    public static SubLObject f27533(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0387.NIL != module0377.f26771(var151) || module0387.NIL != module0373.f26163(var151) || module0387.NIL != module0373.f26148(var151) || module0387.NIL != f27531(var151));
    }
    
    public static SubLObject f27534(final SubLObject var152, final SubLObject var153) {
        return module0367.f25118(var152, var153);
    }
    
    public static SubLObject f27535(final SubLObject var152, final SubLObject var154) {
        return module0367.f25041(var152, var154);
    }
    
    public static SubLObject f27536(final SubLObject var151) {
        return module0048.f3355(var151);
    }
    
    public static SubLObject f27537(final SubLObject var155, final SubLObject var156) {
        return module0048.f3359(var155, var156);
    }
    
    public static SubLObject f27538(final SubLObject var155, final SubLObject var156) {
        return module0048.f3360(var155, var156);
    }
    
    public static SubLObject f27539(final SubLObject var155, final SubLObject var156) {
        return module0048.f3361(var155, var156);
    }
    
    public static SubLObject f27540(final SubLObject var155, final SubLObject var156) {
        return (module0387.NIL != f27538(var155, var156)) ? var155 : var156;
    }
    
    public static SubLObject f27541(final SubLObject var155, final SubLObject var156) {
        return (module0387.NIL != f27539(var155, var156)) ? var155 : var156;
    }
    
    public static SubLObject f27542() {
        return (SubLObject)module0387.$ic55$;
    }
    
    public static SubLObject f27543(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var151.isVector() && module0387.TWO_INTEGER.numE(Sequences.length(var151)) && Vectors.aref(var151, (SubLObject)module0387.ZERO_INTEGER).isHashtable() && module0387.NIL != module0055.f4044(Vectors.aref(var151, (SubLObject)module0387.ONE_INTEGER)));
    }
    
    public static SubLObject f27544() {
        final SubLObject var157 = Hashtables.make_hash_table((SubLObject)module0387.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0387.EQL), (SubLObject)module0387.UNPROVIDED);
        final SubLObject var158 = module0055.f4059((SubLObject)module0387.NIL, Symbols.symbol_function((SubLObject)module0387.IDENTITY), (SubLObject)module0387.$ic56$);
        return Vectors.vector(new SubLObject[] { var157, var158 });
    }
    
    public static SubLObject f27545(final SubLObject var159) {
        Hashtables.clrhash(Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER));
        module0055.f4060(Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER));
        return var159;
    }
    
    public static SubLObject f27546(final SubLObject var159) {
        final SubLObject var160 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
        return module0055.f4061(var160);
    }
    
    public static SubLObject f27547(final SubLObject var159, final SubLObject var160, final SubLObject var151) {
        assert module0387.NIL != f27536(var160) : var160;
        final SubLObject var161 = Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER);
        SubLObject var162 = Hashtables.gethash_without_values(var160, var161, (SubLObject)module0387.NIL);
        if (module0387.NIL == var162) {
            var162 = module0054.f3968();
            Hashtables.sethash(var160, var161, var162);
        }
        if (module0387.NIL != module0054.f3970(var162)) {
            final SubLObject var163 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
            module0055.f4067(var160, var163);
        }
        module0054.f3973(var151, var162);
        return var159;
    }
    
    public static SubLObject f27548(final SubLObject var159) {
        SubLObject var160 = (SubLObject)module0387.NIL;
        SubLObject var161 = (SubLObject)module0387.NIL;
        final SubLObject var162 = Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER);
        final SubLObject var163 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
        final SubLObject var164 = module0055.f4063(var163);
        final SubLObject var165 = Hashtables.gethash_without_values(var164, var162, (SubLObject)module0387.$ic58$);
        if (module0387.$ic58$ == var165) {
            Errors.error((SubLObject)module0387.$ic59$, var164);
        }
        else if (module0387.NIL != module0054.f3970(var165)) {
            Errors.error((SubLObject)module0387.$ic60$, var164);
        }
        else {
            var160 = module0054.f3975(var165);
            var161 = var164;
        }
        return Values.values(var160, var161);
    }
    
    public static SubLObject f27549(final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        SubLObject var161 = (SubLObject)module0387.NIL;
        SubLObject var162 = (SubLObject)module0387.NIL;
        final SubLObject var163 = Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER);
        final SubLObject var164 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
        final SubLObject var165 = module0055.f4063(var164);
        final SubLObject var166 = Hashtables.gethash_without_values(var165, var163, (SubLObject)module0387.$ic58$);
        if (module0387.$ic58$ == var166) {
            Errors.error((SubLObject)module0387.$ic59$, var165);
        }
        else if (module0387.NIL != module0054.f3970(var166)) {
            Errors.error((SubLObject)module0387.$ic60$, var165);
        }
        else {
            var161 = module0054.f3974(var166);
            var162 = var165;
            if (module0387.NIL != module0054.f3970(var166)) {
                final SubLObject var167 = module0055.f4068(var164, (SubLObject)module0387.UNPROVIDED);
                if (module0387.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && module0387.NIL == f27537(var167, var165)) {
                    Errors.error((SubLObject)module0387.$ic61$, var167, var165);
                }
            }
        }
        return Values.values(var161, var162);
    }
    
    public static SubLObject f27550(final SubLObject var159) {
        assert module0387.NIL != f27543(var159) : var159;
        final SubLObject var160 = Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER);
        final SubLObject var161 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
        SubLObject var162 = (SubLObject)module0387.NIL;
        SubLObject var163 = module0055.f4071(var161);
        SubLObject var164 = (SubLObject)module0387.NIL;
        var164 = var163.first();
        while (module0387.NIL != var163) {
            final SubLObject var165 = Hashtables.gethash_without_values(var164, var160, (SubLObject)module0387.$ic58$);
            SubLObject var166 = (SubLObject)module0387.NIL;
            SubLObject var51_167 = module0054.f3978(var165);
            SubLObject var167 = (SubLObject)module0387.NIL;
            var167 = var51_167.first();
            while (module0387.NIL != var51_167) {
                var166 = (SubLObject)ConsesLow.cons(var167, var166);
                var51_167 = var51_167.rest();
                var167 = var51_167.first();
            }
            var166 = Sequences.nreverse(var166);
            var162 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var164, var166), var162);
            var163 = var163.rest();
            var164 = var163.first();
        }
        var162 = Sequences.nreverse(var162);
        return var162;
    }
    
    public static SubLObject f27551(final SubLObject var159) {
        SubLObject var160 = (SubLObject)module0387.ZERO_INTEGER;
        final SubLObject var161 = Vectors.aref(var159, (SubLObject)module0387.ZERO_INTEGER);
        final SubLObject var162 = Vectors.aref(var159, (SubLObject)module0387.ONE_INTEGER);
        SubLObject var163 = module0055.f4071(var162);
        SubLObject var164 = (SubLObject)module0387.NIL;
        var164 = var163.first();
        while (module0387.NIL != var163) {
            final SubLObject var165 = Hashtables.gethash_without_values(var164, var161, (SubLObject)module0387.UNPROVIDED);
            var160 = Numbers.add(var160, module0054.f3967(var165));
            var163 = var163.rest();
            var164 = var163.first();
        }
        return var160;
    }
    
    public static SubLObject f27552(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic63$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27553(final SubLObject var1, final SubLObject var169) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic64$, var169, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27554(final SubLObject var1, final SubLObject var169) {
        module0367.f25097(var1, var169);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27555(final SubLObject var1, final SubLObject var170) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic66$, var170, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27556(final SubLObject var1, final SubLObject var170) {
        module0367.f25097(var1, var170);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27557(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic68$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27558(final SubLObject var1) {
        module0367.f25103(var1);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27559(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic70$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27560(final SubLObject var1) {
        return (SubLObject)ConsesLow.list(var1);
    }
    
    public static SubLObject f27561(final SubLObject var1, final SubLObject var171) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic71$, var171, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27562(final SubLObject var1, final SubLObject var4) {
        if (module0387.NIL == module0384.f27279(var1, var4)) {
            module0367.f25209(module0365.f24850(var4), var4, var1);
        }
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27563(final SubLObject var1, final SubLObject var4) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic72$, var4, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27564(final SubLObject var1, final SubLObject var5) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic73$, var5, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27565(final SubLObject var1, final SubLObject var5) {
        return module0367.f25109(var1, (SubLObject)module0387.$ic74$, var5, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27566(final SubLObject var1, final SubLObject var5, final SubLObject var172, final SubLObject var173) {
        return module0373.f26388(var1, var5, var172, var173);
    }
    
    public static SubLObject f27567(final SubLObject var1) {
        final SubLObject var2 = module0367.f25109(var1, (SubLObject)module0387.$ic75$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
        module0367.f25104(var1);
        return var2;
    }
    
    public static SubLObject f27568(final SubLObject var1) {
        module0367.f25108(var1);
        module0367.f25109(var1, (SubLObject)module0387.$ic0$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27569(final SubLObject var174) {
        assert module0387.NIL != module0367.f24997(var174) : var174;
        return module0367.f25109(var174, (SubLObject)module0387.$ic76$, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27570(final SubLObject var174, final SubLObject var96) {
        assert module0387.NIL != module0367.f24997(var174) : var174;
        assert module0387.NIL != f27526(var96) : var96;
        return module0367.f25109(var174, (SubLObject)module0387.$ic78$, var96, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27571(final SubLObject var174, final SubLObject var96) {
        assert module0387.NIL != module0367.f24997(var174) : var174;
        assert module0387.NIL != f27526(var96) : var96;
        return module0367.f25109(var174, (SubLObject)module0387.$ic79$, var96, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27572(final SubLObject var174, final SubLObject var175) {
        assert module0387.NIL != module0367.f24997(var174) : var174;
        return module0367.f25109(var174, (SubLObject)module0387.$ic80$, var175, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27573(final SubLObject var174, final SubLObject var176) {
        assert module0387.NIL != module0367.f24997(var174) : var174;
        assert module0387.NIL != module0380.f26969(var176) : var176;
        return module0367.f25109(var174, (SubLObject)module0387.$ic82$, var176, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED, (SubLObject)module0387.UNPROVIDED);
    }
    
    public static SubLObject f27574() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27467", "S#30569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27469", "S#30570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27470", "S#29276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27471", "S#29278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27472", "S#29281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27473", "S#30571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27474", "S#28210", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27468", "S#30572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27475", "S#30573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27476", "S#30567", 2, 0, false);
        new $f27476$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27477", "S#30574", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27478", "S#30575", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27479", "S#30576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27480", "S#29282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27481", "S#27909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27482", "S#30577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27483", "S#29293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27484", "S#30578", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0387", "f27485", "S#30579");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27486", "S#30580", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27487", "S#30581", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27488", "S#30582", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27489", "S#30583", 5, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27490", "S#30584", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27491", "S#29246", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27492", "S#30585", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27493", "S#30586", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27494", "S#30587", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27495", "S#30588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27496", "S#30589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27497", "S#30590", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27499", "S#30591", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27500", "S#30592", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27498", "S#30593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27501", "S#30594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27502", "S#30595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27503", "S#30163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27504", "S#30596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27505", "S#30597", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27506", "S#30598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27507", "S#30599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27508", "S#30600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27509", "S#30601", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27510", "S#29828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27511", "S#30602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27512", "S#30603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27513", "S#30604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27514", "S#30605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27515", "S#30606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27516", "S#30607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27517", "S#30608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27518", "S#30609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27519", "S#30165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27520", "S#30610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27521", "S#30611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27522", "S#30612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27523", "S#30613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27524", "S#30614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27525", "S#30615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27526", "S#30616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27527", "S#30617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27529", "S#30618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27530", "S#30619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27528", "S#30620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27531", "S#30621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27532", "S#30622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27533", "S#30623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27534", "S#30624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27535", "S#27908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27536", "S#30625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27537", "S#30626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27538", "S#30627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27539", "S#30568", 2, 0, false);
        new $f27539$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27540", "S#30628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27541", "S#30629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27542", "S#30630", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27543", "S#30631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27544", "S#30632", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27545", "S#30633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27546", "S#30634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27547", "S#30635", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27548", "S#30636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27549", "S#30637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27550", "S#30638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27551", "S#30639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27552", "S#30640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27553", "S#30641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27554", "S#26777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27555", "S#30642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27556", "S#26778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27557", "S#30643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27558", "S#26779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27559", "S#30644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27560", "S#26776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27561", "S#30113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27562", "S#29302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27563", "S#29191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27564", "S#29277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27565", "S#29303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27566", "S#29301", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27567", "S#30645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27568", "S#30646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27569", "S#30647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27570", "S#30648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27571", "S#30649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27572", "S#30650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0387", "f27573", "S#30651", 2, 0, false);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27575() {
        module0387.$g3233$ = SubLFiles.defparameter("S#30652", (SubLObject)module0387.NIL);
        module0387.$g3234$ = SubLFiles.defvar("S#30653", (SubLObject)module0387.ZERO_INTEGER);
        module0387.$g3235$ = SubLFiles.defparameter("S#30654", (SubLObject)module0387.NIL);
        module0387.$g3236$ = SubLFiles.defparameter("S#30655", (SubLObject)module0387.NIL);
        module0387.$g3237$ = SubLFiles.deflexical("S#30656", (SubLObject)module0387.TEN_INTEGER);
        module0387.$g3238$ = SubLFiles.defvar("S#30657", module0360.f23935(module0347.$g2967$.getDynamicValue()));
        module0387.$g3239$ = SubLFiles.defparameter("S#30658", (SubLObject)module0387.T);
        module0387.$g3240$ = SubLFiles.defvar("S#30659", (SubLObject)module0387.T);
        module0387.$g3241$ = SubLFiles.defvar("S#30660", (SubLObject)module0387.NIL);
        return (SubLObject)module0387.NIL;
    }
    
    public static SubLObject f27576() {
        module0012.f419((SubLObject)module0387.$ic5$);
        module0012.f419((SubLObject)module0387.$ic6$);
        module0012.f419((SubLObject)module0387.$ic7$);
        module0002.f50((SubLObject)module0387.$ic25$, (SubLObject)module0387.$ic28$);
        module0002.f50((SubLObject)module0387.$ic27$, (SubLObject)module0387.$ic28$);
        module0012.f419((SubLObject)module0387.$ic33$);
        module0012.f419((SubLObject)module0387.$ic37$);
        module0012.f419((SubLObject)module0387.$ic36$);
        module0012.f419((SubLObject)module0387.$ic38$);
        module0012.f419((SubLObject)module0387.$ic65$);
        module0012.f419((SubLObject)module0387.$ic67$);
        module0012.f419((SubLObject)module0387.$ic69$);
        return (SubLObject)module0387.NIL;
    }
    
    public void declareFunctions() {
        f27574();
    }
    
    public void initializeVariables() {
        f27575();
    }
    
    public void runTopLevelForms() {
        f27576();
    }
    
    static {
        me = (SubLFile)new module0387();
        module0387.$g3233$ = null;
        module0387.$g3234$ = null;
        module0387.$g3235$ = null;
        module0387.$g3236$ = null;
        module0387.$g3237$ = null;
        module0387.$g3238$ = null;
        module0387.$g3239$ = null;
        module0387.$g3240$ = null;
        module0387.$g3241$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("DO-ONE-STEP");
        $ic1$ = SubLObjectFactory.makeKeyword("DONE?");
        $ic2$ = SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM");
        $ic3$ = SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK");
        $ic4$ = SubLObjectFactory.makeSymbol("S#27896", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#30567", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#30574", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#30575", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30661", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5846", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic11$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic13$ = SubLObjectFactory.makeKeyword("HL-MODULE");
        $ic14$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic15$ = SubLObjectFactory.makeKeyword("DONE");
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic17$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $ic18$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic19$ = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS");
        $ic20$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#65EE06E");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#1532601");
        $ic23$ = SubLObjectFactory.makeUninternedSymbol("US#73E74DE");
        $ic24$ = SubLObjectFactory.makeSymbol("CLET");
        $ic25$ = SubLObjectFactory.makeSymbol("S#30580", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic27$ = SubLObjectFactory.makeSymbol("S#30581", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#30662", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic30$ = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $ic31$ = SubLObjectFactory.makeSymbol("S#30202", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#26790", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#30587", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#30589", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic36$ = SubLObjectFactory.makeSymbol("S#30592", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#30591", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#30593", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
        $ic40$ = SubLObjectFactory.makeKeyword("SKSI");
        $ic41$ = SubLObjectFactory.makeKeyword("QUIESCE");
        $ic42$ = SubLObjectFactory.makeString("~a execute-strategem: ~a~%");
        $ic43$ = SubLObjectFactory.makeKeyword("EXECUTE-STRATEGEM");
        $ic44$ = SubLObjectFactory.makeKeyword("UNEXAMINED");
        $ic45$ = SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES");
        $ic46$ = SubLObjectFactory.makeKeyword("CONTINUATION-POSSIBLE?");
        $ic47$ = SubLObjectFactory.makeKeyword("NEG");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic49$ = SubLObjectFactory.makeKeyword("POS");
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termChosen"));
        $ic51$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic52$ = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic53$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic54$ = SubLObjectFactory.makeString("Unexpected strategem type ~s");
        $ic55$ = SubLObjectFactory.makeKeyword("NEGATIVE-INFINITY");
        $ic56$ = SubLObjectFactory.makeSymbol("S#30568", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#30625", "CYC");
        $ic58$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic59$ = SubLObjectFactory.makeString("No object-stack for happiness ~S");
        $ic60$ = SubLObjectFactory.makeString("No objects for happiness ~S");
        $ic61$ = SubLObjectFactory.makeString("Removed ~S but ~S was lowest happiness");
        $ic62$ = SubLObjectFactory.makeSymbol("S#30631", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("HAPPINESS-TABLE");
        $ic64$ = SubLObjectFactory.makeKeyword("INITIALIZE-PROPERTIES");
        $ic65$ = SubLObjectFactory.makeSymbol("S#26777", "CYC");
        $ic66$ = SubLObjectFactory.makeKeyword("UPDATE-PROPERTIES");
        $ic67$ = SubLObjectFactory.makeSymbol("S#26778", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
        $ic69$ = SubLObjectFactory.makeSymbol("S#26779", "CYC");
        $ic70$ = SubLObjectFactory.makeKeyword("INITIAL-RELEVANT-STRATEGIES");
        $ic71$ = SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE");
        $ic72$ = SubLObjectFactory.makeKeyword("NEW-TACTIC");
        $ic73$ = SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?");
        $ic74$ = SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING");
        $ic75$ = SubLObjectFactory.makeKeyword("RECONSIDER-SET-ASIDES");
        $ic76$ = SubLObjectFactory.makeKeyword("PEEK-NEXT-STRATEGEM");
        $ic77$ = SubLObjectFactory.makeSymbol("S#30616", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("MOTIVATE-STRATEGEM");
        $ic79$ = SubLObjectFactory.makeKeyword("ACTIVATE-STRATEGEM");
        $ic80$ = SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?");
        $ic81$ = SubLObjectFactory.makeSymbol("S#27351", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("RECONSIDER-SPLIT-SET-ASIDES");
    }
    
    public static final class $f27476$BinaryFunction extends BinaryFunction
    {
        public $f27476$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30567"));
        }
        
        public SubLObject processItem(final SubLObject var13, final SubLObject var14) {
            return module0387.f27476(var13, var14);
        }
    }
    
    public static final class $f27539$BinaryFunction extends BinaryFunction
    {
        public $f27539$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30568"));
        }
        
        public SubLObject processItem(final SubLObject var13, final SubLObject var14) {
            return module0387.f27539(var13, var14);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0387.class
	Total time: 441 ms
	
	Decompiled with Procyon 0.5.32.
*/