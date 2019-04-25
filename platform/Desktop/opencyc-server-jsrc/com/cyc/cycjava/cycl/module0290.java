package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0290 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0290";
    public static final String myFingerPrint = "a31e7af9f3db59a61ac8da7fb7e240e7b88e660a007423072fffc8661dd58211";
    private static SubLSymbol $g2657$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    
    public static SubLObject f19495(final SubLObject var1) {
        final SubLObject var2 = f19496(var1);
        if (module0290.NIL != module0035.f1997(var2)) {
            return var2.first();
        }
        return module0276.f18287(var2, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19497(final SubLObject var1) {
        final SubLObject var2 = f19498(var1);
        if (module0290.NIL != module0035.f1997(var2)) {
            return var2.first();
        }
        return module0276.f18287(var2, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19499(final SubLObject var3) {
        return module0036.f2531(var3, (SubLObject)module0290.$ic0$, (SubLObject)module0290.$ic1$, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19496(final SubLObject var1) {
        final SubLObject var2 = module0178.f11287(var1);
        final SubLObject var3 = f19500(var1);
        SubLObject var4 = (SubLObject)module0290.NIL;
        SubLObject var5 = (SubLObject)module0290.NIL;
        if (module0290.NIL == var4) {
            SubLObject var6;
            SubLObject var7;
            for (var6 = var3, var7 = (SubLObject)module0290.NIL, var7 = var6.first(); module0290.NIL == var4 && module0290.NIL != var6; var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0290.NIL == module0161.f10513(var2, module0178.f11287(var7))), var6 = var6.rest(), var7 = var6.first()) {}
        }
        if (module0290.NIL != var4) {
            SubLObject var8 = var3;
            SubLObject var7 = (SubLObject)module0290.NIL;
            var7 = var8.first();
            while (module0290.NIL != var8) {
                var5 = (SubLObject)ConsesLow.cons(f19501(var7), var5);
                var8 = var8.rest();
                var7 = var8.first();
            }
        }
        else {
            SubLObject var8 = var3;
            SubLObject var7 = (SubLObject)module0290.NIL;
            var7 = var8.first();
            while (module0290.NIL != var8) {
                var5 = (SubLObject)ConsesLow.cons(f19502(var7), var5);
                var8 = var8.rest();
                var7 = var8.first();
            }
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f19498(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0290.NIL;
        SubLObject var3 = f19500(var1);
        SubLObject var4 = (SubLObject)module0290.NIL;
        var4 = var3.first();
        while (module0290.NIL != var3) {
            var2 = (SubLObject)ConsesLow.cons(f19501(var4), var2);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f19500(final SubLObject var1) {
        final SubLObject var2 = module0178.f11287(var1);
        SubLObject var3 = (SubLObject)ConsesLow.list(var1);
        SubLObject var4 = module0287.f19221(var1);
        SubLObject var5 = (SubLObject)module0290.NIL;
        var5 = var4.first();
        while (module0290.NIL != var4) {
            var3 = conses_high.nunion(var3, module0287.f19222(var5, var2, (SubLObject)module0290.UNPROVIDED), (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f19501(final SubLObject var1) {
        final SubLObject var2 = f19503(module0178.f11287(var1));
        final SubLObject var3 = f19502(var1);
        return module0202.f12768(module0290.$ic2$, var2, var3);
    }
    
    public static SubLObject f19502(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0290.NIL;
        final SubLObject var4 = module0290.$g2657$.currentBinding(var2);
        try {
            module0290.$g2657$.bind(module0178.f11294(var1), var2);
            var3 = module0232.f15328(f19503(f19504(var1)), (SubLObject)module0290.UNPROVIDED);
        }
        finally {
            module0290.$g2657$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f19504(final SubLObject var1) {
        return module0178.f11282(var1);
    }
    
    public static SubLObject f19503(final SubLObject var3) {
        return module0036.f2547(var3, (SubLObject)module0290.$ic3$, (SubLObject)module0290.$ic4$, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19505(final SubLObject var3) {
        return module0571.f34986(f19503(var3));
    }
    
    public static SubLObject f19506(final SubLObject var14, final SubLObject var4) {
        final SubLObject var15 = f19507(var14, var4);
        if (module0290.NIL != module0035.f1997(var15)) {
            return var15.first();
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19507(final SubLObject var14, final SubLObject var4) {
        if (module0290.$ic5$.eql(module0205.f13132(var14))) {
            final SubLObject var15 = module0205.f13207(var14, (SubLObject)module0290.UNPROVIDED);
            final SubLObject var16 = var15.first();
            SubLObject var17 = (SubLObject)module0290.NIL;
            if (!module0290.$ic2$.eql(module0205.f13132(var16))) {
                SubLObject var18 = var15;
                SubLObject var19 = (SubLObject)module0290.NIL;
                var19 = var18.first();
                while (module0290.NIL != var18) {
                    final SubLObject var20 = f19508(var19, var4);
                    if (module0290.NIL != var20) {
                        var17 = (SubLObject)ConsesLow.cons(var20, var17);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            else {
                SubLObject var18 = var15;
                SubLObject var19 = (SubLObject)module0290.NIL;
                var19 = var18.first();
                while (module0290.NIL != var18) {
                    final SubLObject var20 = f19509(var19);
                    if (module0290.NIL != var20) {
                        var17 = (SubLObject)ConsesLow.cons(var20, var17);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            return Sequences.nreverse(var17);
        }
        final SubLObject var21 = f19508(var14, var4);
        if (module0290.NIL != var21) {
            return (SubLObject)ConsesLow.list(var21);
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19509(final SubLObject var20) {
        final SubLObject var21 = f19510(module0205.f13203(var20, (SubLObject)module0290.UNPROVIDED));
        final SubLObject var22 = module0205.f13204(var20, (SubLObject)module0290.UNPROVIDED);
        return f19508(var22, var21);
    }
    
    public static SubLObject f19508(final SubLObject var21, final SubLObject var13) {
        final SubLObject var22 = f19511(var21);
        final SubLObject var23 = f19512(var13);
        if (module0290.NIL != module0161.f10481(var23)) {
            return module0217.f14415(var22, var23);
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19511(final SubLObject var14) {
        return f19513(f19514(var14));
    }
    
    public static SubLObject f19512(final SubLObject var13) {
        return f19514(var13);
    }
    
    public static SubLObject f19514(final SubLObject var3) {
        return module0036.f2547(var3, (SubLObject)module0290.$ic6$, (SubLObject)module0290.$ic7$, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19513(final SubLObject var24) {
        final SubLObject var25 = module0205.f13136(var24);
        if (var25.eql(module0290.$ic8$)) {
            final SubLObject var26 = (SubLObject)((module0290.NIL != module0202.f12595(module0205.f13203(var24, (SubLObject)module0290.UNPROVIDED))) ? module0205.f13207(module0205.f13203(var24, (SubLObject)module0290.UNPROVIDED), (SubLObject)module0290.UNPROVIDED) : ConsesLow.list(module0205.f13203(var24, (SubLObject)module0290.UNPROVIDED)));
            final SubLObject var27 = (SubLObject)((module0290.NIL != module0202.f12594(module0205.f13204(var24, (SubLObject)module0290.UNPROVIDED))) ? module0205.f13207(module0205.f13204(var24, (SubLObject)module0290.UNPROVIDED), (SubLObject)module0290.UNPROVIDED) : ConsesLow.list(module0205.f13204(var24, (SubLObject)module0290.UNPROVIDED)));
            return module0232.f15326(var26, var27);
        }
        if (var25.eql(module0290.$ic9$)) {
            return module0232.f15326((SubLObject)module0290.NIL, module0205.f13207(var24, (SubLObject)module0290.UNPROVIDED));
        }
        if (var25.eql(module0290.$ic10$)) {
            return module0232.f15326((module0290.NIL != module0202.f12595(module0205.f13203(var24, (SubLObject)module0290.UNPROVIDED))) ? module0205.f13207(module0205.f13203(var24, (SubLObject)module0290.UNPROVIDED), (SubLObject)module0290.UNPROVIDED) : module0205.f13207(var24, (SubLObject)module0290.UNPROVIDED), (SubLObject)module0290.NIL);
        }
        return module0232.f15326((SubLObject)module0290.NIL, (SubLObject)ConsesLow.list(var24));
    }
    
    public static SubLObject f19515(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0290.NIL != f19516(var28) || module0290.NIL != f19517(var28) || module0290.NIL != f19518(var28));
    }
    
    public static SubLObject f19516(final SubLObject var28) {
        if (module0290.NIL != module0202.f12659(var28) && module0290.$ic11$.eql(module0205.f13366(var28)) && module0290.NIL != module0202.f12637(var28, (SubLObject)module0290.TWO_INTEGER, (SubLObject)module0290.UNPROVIDED)) {
            final SubLObject var29 = module0205.f13367(var28, (SubLObject)module0290.UNPROVIDED);
            final SubLObject var30 = module0205.f13369(var28, (SubLObject)module0290.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0290.NIL != module0202.f12657(var29) && module0290.NIL != module0202.f12590(var30));
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19517(final SubLObject var28) {
        if (module0290.NIL != module0202.f12659(var28) && module0290.$ic12$.eql(module0205.f13366(var28)) && module0290.NIL != module0202.f12637(var28, (SubLObject)module0290.ONE_INTEGER, (SubLObject)module0290.UNPROVIDED)) {
            final SubLObject var29 = module0205.f13367(var28, (SubLObject)module0290.UNPROVIDED);
            return module0202.f12659(var29);
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19518(final SubLObject var28) {
        if (module0290.NIL != module0202.f12659(var28) && module0290.$ic13$.eql(module0205.f13366(var28)) && module0290.NIL != module0202.f12637(var28, (SubLObject)module0290.TWO_INTEGER, (SubLObject)module0290.UNPROVIDED)) {
            final SubLObject var29 = module0205.f13367(var28, (SubLObject)module0290.UNPROVIDED);
            final SubLObject var30 = module0205.f13369(var28, (SubLObject)module0290.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(var29.isInteger() && (var30.isString() || module0290.NIL == var30));
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19519(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0290.NIL != assertion_handles_oc.f11035(var28) || module0290.NIL != module0167.f10813(var28) || module0290.NIL != module0193.f12067(var28));
    }
    
    public static SubLObject f19520(final SubLObject var28) {
        if (module0290.NIL != assertion_handles_oc.f11035(var28)) {
            return f19521(var28);
        }
        if (module0290.NIL != module0167.f10813(var28)) {
            return f19522(var28);
        }
        if (module0290.NIL != module0193.f12067(var28)) {
            return f19523(var28, (SubLObject)module0290.UNPROVIDED);
        }
        return var28;
    }
    
    public static SubLObject f19521(final SubLObject var1) {
        final SubLObject var2 = module0178.f11287(var1);
        final SubLObject var3 = f19502(var1);
        final SubLObject var4 = f19503(var2);
        if (!var1.eql(f19506(var3, var2))) {
            module0202.f12747((SubLObject)module0290.THREE_INTEGER, (SubLObject)module0290.$ic14$, var1, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
        }
        return module0202.f12768(module0290.$ic11$, var4, var3);
    }
    
    public static SubLObject f19522(final SubLObject var31) {
        final SubLObject var32 = module0172.f10915(var31);
        if (module0290.NIL == module0210.f13594(var32) || !var31.eql(module0172.f10921(var32))) {
            module0202.f12747((SubLObject)module0290.THREE_INTEGER, (SubLObject)module0290.$ic15$, var31, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
        }
        return module0202.f12643(module0290.$ic12$, var32);
    }
    
    public static SubLObject f19523(final SubLObject var33, SubLObject var34) {
        if (var34 == module0290.UNPROVIDED) {
            var34 = module0290.$g2657$.getDynamicValue();
        }
        final SubLObject var35 = module0193.f12073(var33);
        final SubLObject var36 = (SubLObject)(var35.isInteger() ? ConsesLow.nth(var35, var34) : module0290.NIL);
        return module0202.f12768(module0290.$ic13$, var35, var36);
    }
    
    public static SubLObject f19524(final SubLObject var28) {
        if (module0290.NIL != module0035.f2239(var28) && module0290.NIL == f19519(var28)) {
            return var28;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0290.$ic16$, var28);
    }
    
    public static SubLObject f19510(final SubLObject var28) {
        if (module0290.NIL != f19516(var28)) {
            return f19525(var28);
        }
        if (module0290.NIL != f19517(var28)) {
            return f19526(var28);
        }
        if (module0290.NIL != f19518(var28)) {
            return f19527(var28);
        }
        return var28;
    }
    
    public static SubLObject f19525(final SubLObject var37) {
        final SubLObject var38 = module0205.f13368(var37, (SubLObject)module0290.UNPROVIDED);
        final SubLObject var39 = f19510(module0205.f13277(var37, (SubLObject)module0290.UNPROVIDED));
        final SubLObject var40 = f19506(var38, var39);
        if (module0290.NIL != assertion_handles_oc.f11035(var40)) {
            return var40;
        }
        module0202.f12747((SubLObject)module0290.THREE_INTEGER, (SubLObject)module0290.$ic17$, var37, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
        return f19528(var37);
    }
    
    public static SubLObject f19526(final SubLObject var38) {
        final SubLObject var39 = module0205.f13277(var38, (SubLObject)module0290.UNPROVIDED);
        final SubLObject var40 = f19529(var39);
        if (module0290.NIL != module0167.f10813(var40)) {
            return var40;
        }
        module0202.f12747((SubLObject)module0290.THREE_INTEGER, (SubLObject)module0290.$ic18$, var38, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
        return f19530(var38);
    }
    
    public static SubLObject f19527(final SubLObject var40) {
        final SubLObject var41 = module0205.f13277(var40, (SubLObject)module0290.UNPROVIDED);
        if (var41.isInteger()) {
            return module0193.f12079(var41);
        }
        return var40;
    }
    
    public static SubLObject f19531(final SubLObject var28) {
        if (module0290.NIL != f19516(var28)) {
            return f19528(var28);
        }
        if (module0290.NIL != f19517(var28)) {
            return f19530(var28);
        }
        if (module0290.NIL != f19518(var28)) {
            return f19532(var28);
        }
        return var28;
    }
    
    public static SubLObject f19528(final SubLObject var37) {
        final SubLObject var38 = module0205.f13368(var37, (SubLObject)module0290.UNPROVIDED);
        final SubLObject var39 = f19531(module0205.f13277(var37, (SubLObject)module0290.UNPROVIDED));
        return Values.values(module0202.f12768(module0290.$ic2$, var39, var38), module0132.$g1553$.getGlobalValue());
    }
    
    public static SubLObject f19530(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0205.f13277(var38, (SubLObject)module0290.UNPROVIDED);
        SubLObject var41 = (SubLObject)module0290.NIL;
        if (module0290.NIL != module0210.f13595(var40, (SubLObject)module0290.UNPROVIDED)) {
            var41 = var40;
        }
        else if (module0290.NIL != module0167.f10813(var40) && module0290.NIL != module0172.f10915(var40)) {
            var41 = module0172.f10915(var40);
        }
        if (module0290.NIL != var41) {
            return Values.values(var41, module0147.$g2095$.getDynamicValue(var39));
        }
        return Values.values(var40, module0147.$g2095$.getDynamicValue(var39));
    }
    
    public static SubLObject f19532(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0205.f13368(var40, (SubLObject)module0290.UNPROVIDED);
        if (var42.isString()) {
            return Values.values(module0201.f12550(var42), module0147.$g2095$.getDynamicValue(var41));
        }
        return Values.values(var40, module0147.$g2095$.getDynamicValue(var41));
    }
    
    public static SubLObject f19529(final SubLObject var39) {
        final SubLObject var40 = f19533(var39);
        return (SubLObject)((module0290.NIL != module0167.f10813(var40)) ? var40 : module0290.NIL);
    }
    
    public static SubLObject f19533(final SubLObject var42) {
        if (module0290.NIL != module0035.f2371(Symbols.symbol_function((SubLObject)module0290.$ic22$), var42, (SubLObject)module0290.UNPROVIDED)) {
            final SubLObject var43 = module0172.f10916(var42);
            return (module0290.NIL != module0167.f10813(var43)) ? var43 : var42;
        }
        final SubLObject var44 = conses_high.copy_list(var42);
        SubLObject var45 = (SubLObject)module0290.NIL;
        SubLObject var46 = (SubLObject)module0290.NIL;
        var45 = var44;
        var46 = var45.first();
        while (module0290.NIL != var45) {
            if (module0290.NIL != f19517(var46)) {
                final SubLObject var47 = f19526(var46);
                if (module0290.NIL != var47) {
                    ConsesLow.rplaca(var45, var47);
                }
            }
            else if (module0290.NIL != module0228.f15225(var46)) {
                final SubLObject var47 = f19533(var46);
                if (module0290.NIL != var47) {
                    ConsesLow.rplaca(var45, var47);
                }
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        final SubLObject var48 = module0172.f10916(var44);
        return (module0290.NIL != module0167.f10813(var48)) ? var48 : var44;
    }
    
    public static SubLObject f19534(final SubLObject var28) {
        return module0205.f13147(var28, (SubLObject)module0290.$ic23$, (SubLObject)module0290.$ic21$, (SubLObject)module0290.T, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19535(final SubLObject var28) {
        return module0205.f13147(var28, (SubLObject)module0290.$ic24$, (SubLObject)module0290.$ic25$, (SubLObject)module0290.T, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19536(final SubLObject var1) {
        final SubLObject var2 = module0178.f11287(var1);
        final SubLObject var3 = f19495(var1);
        final SubLObject var4 = module0543.f33697(var3, var2);
        return module0004.f104(var1, var4, (SubLObject)module0290.UNPROVIDED, (SubLObject)module0290.UNPROVIDED);
    }
    
    public static SubLObject f19537(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0290.NIL;
        SubLObject var4 = (SubLObject)module0290.NIL;
        try {
            var2.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var5 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind((SubLObject)module0290.$ic26$, var2);
                try {
                    final SubLObject var6 = f19495(var1);
                    final SubLObject var7 = module0178.f11287(var1);
                    final SubLObject var8 = f19511(var6);
                    final SubLObject var9 = (SubLObject)((module0290.NIL != var8) ? module0217.f14415(var8, var7) : module0290.NIL);
                    if (module0290.NIL != var9) {
                        var3 = Equality.eql(var1, var9);
                    }
                    else {
                        var3 = module0035.f2201(f19500(var1), f19507(var6, var7), (SubLObject)module0290.UNPROVIDED);
                    }
                }
                catch (Throwable var10) {
                    Errors.handleThrowable(var10, (SubLObject)module0290.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var5, var2);
            }
        }
        catch (Throwable var11) {
            var4 = Errors.handleThrowable(var11, module0003.$g3$.getGlobalValue());
        }
        finally {
            var2.throwStack.pop();
        }
        if (module0290.NIL == var4) {
            return var3;
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19538(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0290.NIL;
        SubLObject var4 = (SubLObject)module0290.NIL;
        try {
            var2.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var5 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind((SubLObject)module0290.$ic26$, var2);
                try {
                    var3 = Equality.eql(var1, module0217.f14415(f19511(f19495(var1)), module0178.f11287(var1)));
                }
                catch (Throwable var6) {
                    Errors.handleThrowable(var6, (SubLObject)module0290.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var5, var2);
            }
        }
        catch (Throwable var7) {
            var4 = Errors.handleThrowable(var7, module0003.$g3$.getGlobalValue());
        }
        finally {
            var2.throwStack.pop();
        }
        if (module0290.NIL == var4) {
            return var3;
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19539(final SubLObject var1) {
        final SubLObject var2 = module0178.f11282(var1);
        final SubLObject var3 = module0178.f11287(var1);
        final SubLObject var4 = module0217.f14420(var2);
        SubLObject var5 = (SubLObject)module0290.NIL;
        if (module0290.NIL == var5) {
            SubLObject var6 = var4;
            SubLObject var7 = (SubLObject)module0290.NIL;
            var7 = var6.first();
            while (module0290.NIL == var5 && module0290.NIL != var6) {
                if (!var1.eql(var7)) {
                    var5 = module0161.f10513(var3, module0178.f11287(var7));
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return var5;
    }
    
    public static SubLObject f19540(final SubLObject var1) {
        final SubLObject var2 = module0178.f11287(var1);
        final SubLObject var3 = f19496(var1);
        SubLObject var4 = (SubLObject)module0290.NIL;
        var4 = var3.first();
        if (module0290.NIL != var3) {
            return f19541(var4, var2);
        }
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19541(final SubLObject var14, final SubLObject var4) {
        SubLObject var15 = (SubLObject)module0290.NIL;
        final SubLObject var16 = f19506(var14, var4);
        if (module0290.NIL == var16) {
            module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0290.$ic27$, (SubLObject)module0290.$ic28$, var14, var4));
        }
        else {
            final SubLObject var17 = module0178.f11378(var16);
            if (module0290.NIL == var17) {
                module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0290.$ic29$, (SubLObject)module0290.$ic30$, var14, var4));
            }
            else {
                module0342.f23121(var17, var16, (SubLObject)module0290.UNPROVIDED);
            }
        }
        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0290.NIL == module0538.f33324());
        if (module0290.NIL == module0538.f33324()) {
            module0528.f32921();
        }
        return var15;
    }
    
    public static SubLObject f19542() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19495", "S#21489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19497", "S#22114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19499", "S#21737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19496", "S#22115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19498", "S#22116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19500", "S#22117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19501", "S#22118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19502", "S#22119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19504", "S#22120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19503", "S#22121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19505", "S#22122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19506", "S#22123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19507", "S#22124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19509", "S#22125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19508", "S#22126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19511", "S#22127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19512", "S#22128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19514", "S#13722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19513", "S#22129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19515", "S#22110", 1, 0, false);
        new $f19515$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19516", "S#22130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19517", "S#22131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19518", "S#15432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19519", "S#22132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19520", "S#14910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19521", "S#22133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19522", "S#22134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19523", "S#22135", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19524", "S#14107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19510", "S#14108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19525", "S#22136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19526", "S#22137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19527", "S#22138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19531", "S#22139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19528", "TL-ASSERTION-TERM-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19530", "TL-FUNCTION-TERM-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19532", "TL-VAR-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19529", "S#22140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19533", "S#22141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19534", "S#22142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19535", "S#22143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19536", "S#22144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19537", "S#22145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19538", "S#22146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19539", "S#22147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19540", "S#22148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0290", "f19541", "S#22149", 2, 0, false);
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19543() {
        module0290.$g2657$ = SubLFiles.defparameter("S#22150", (SubLObject)module0290.NIL);
        return (SubLObject)module0290.NIL;
    }
    
    public static SubLObject f19544() {
        module0012.f416((SubLObject)module0290.$ic19$);
        module0012.f416((SubLObject)module0290.$ic20$);
        module0012.f416((SubLObject)module0290.$ic21$);
        return (SubLObject)module0290.NIL;
    }
    
    public void declareFunctions() {
        f19542();
    }
    
    public void initializeVariables() {
        f19543();
    }
    
    public void runTopLevelForms() {
        f19544();
    }
    
    static {
        me = (SubLFile)new module0290();
        module0290.$g2657$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic1$ = SubLObjectFactory.makeSymbol("S#22114", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#22132", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#14910", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#22110", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#14108", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLAssertionFn"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLReifiedNatFn"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn"));
        $ic14$ = SubLObjectFactory.makeString("referenced assertion not found: ~%  ~s");
        $ic15$ = SubLObjectFactory.makeString("referenced function not found: ~%  ~s");
        $ic16$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic17$ = SubLObjectFactory.makeString("referenced TL assertion not found: ~%  ~s");
        $ic18$ = SubLObjectFactory.makeString("referenced TL nart not found: ~%  ~s");
        $ic19$ = SubLObjectFactory.makeSymbol("TL-ASSERTION-TERM-TO-EL");
        $ic20$ = SubLObjectFactory.makeSymbol("TL-FUNCTION-TERM-TO-EL");
        $ic21$ = SubLObjectFactory.makeSymbol("TL-VAR-TO-EL");
        $ic22$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic23$ = SubLObjectFactory.makeSymbol("S#15432", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#22131", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#22137", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $ic28$ = SubLObjectFactory.makeString("formula ~S in mt ~S cannot be found");
        $ic29$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $ic30$ = SubLObjectFactory.makeString("CNF ~S in mt ~S is not locally in the KB");
    }
    
    public static final class $f19515$UnaryFunction extends UnaryFunction
    {
        public $f19515$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22110"));
        }
        
        public SubLObject processItem(final SubLObject var29) {
            return module0290.f19515(var29);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0290.class
	Total time: 223 ms
	
	Decompiled with Procyon 0.5.32.
*/