package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0325 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0325";
    public static final String myFingerPrint = "439b201871f86a4dbd6f9dcb8ec1099667de30bb3240c4af3cdba56107432af2";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
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
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLInteger $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    
    public static SubLObject f21982(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (module0325.NIL == module0324.f21953(var1, var2, var3)) {
            return (SubLObject)module0325.NIL;
        }
        final SubLObject var6 = module0328.f22143(var1, (SubLObject)module0325.$ic0$, (SubLObject)module0325.UNPROVIDED);
        if (!var6.isFunctionSpec()) {
            return (SubLObject)module0325.NIL;
        }
        final SubLObject var7 = Functions.funcall(var6, var2, var3);
        if (var4.eql((SubLObject)module0325.$ic1$)) {
            if (module0325.NIL != module0324.f21970(var1)) {
                return f21983(var7, var5);
            }
            if (module0325.NIL != module0324.f21971(var1)) {
                return f21984(var7, var5);
            }
        }
        else if (var4.eql((SubLObject)module0325.$ic2$)) {
            if (module0325.NIL != module0324.f21970(var1)) {
                return f21984(var7, var5);
            }
            if (module0325.NIL != module0324.f21971(var1)) {
                return f21983(var7, var5);
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21983(final SubLObject var9, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0325.NIL;
        final SubLObject var12 = module0142.$g1727$.currentBinding(var10);
        try {
            module0142.$g1727$.bind((SubLObject)module0325.NIL, var10);
            if (module0325.NIL == var5 && module0325.NIL == module0147.f9513() && module0325.NIL == module0147.f9512()) {
                var5 = module0147.$g2095$.getDynamicValue(var10);
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21985(var5);
            }
            if (module0325.NIL == var11) {
                SubLObject var13 = var9;
                SubLObject var14 = (SubLObject)module0325.NIL;
                var14 = var13.first();
                while (module0325.NIL == var11 && module0325.NIL != var13) {
                    final SubLObject var15 = var14.first();
                    final SubLObject var16 = conses_high.second(var14);
                    final SubLObject var17 = conses_high.third(var14);
                    var11 = (SubLObject)SubLObjectFactory.makeBoolean(module0325.NIL == f21986(var15, var16, var17, var5));
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21987(var5);
            }
        }
        finally {
            module0142.$g1727$.rebind(var12, var10);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0325.NIL == var11);
    }
    
    public static SubLObject f21984(final SubLObject var9, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f21988(var9);
        SubLObject var12 = (SubLObject)module0325.NIL;
        final SubLObject var13 = module0142.$g1727$.currentBinding(var10);
        try {
            module0142.$g1727$.bind((SubLObject)module0325.NIL, var10);
            if (module0325.NIL == var5 && module0325.NIL == module0147.f9513() && module0325.NIL == module0147.f9512()) {
                var5 = module0147.$g2095$.getDynamicValue(var10);
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21985(var5);
            }
            if (module0325.NIL == var12) {
                SubLObject var14 = var11;
                SubLObject var15 = (SubLObject)module0325.NIL;
                var15 = var14.first();
                while (module0325.NIL == var12 && module0325.NIL != var14) {
                    final SubLObject var16 = var15.first();
                    final SubLObject var17 = conses_high.second(var15);
                    final SubLObject var18 = conses_high.third(var15);
                    var12 = f21986(var16, var17, var18, var5);
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
            if (module0325.NIL == var12) {
                SubLObject var19 = (SubLObject)module0325.NIL;
                SubLObject var20 = (SubLObject)module0325.NIL;
                SubLObject var21 = var11;
                SubLObject var22 = (SubLObject)module0325.NIL;
                var22 = var21.first();
                while (module0325.NIL != var21) {
                    final SubLObject var23 = f21989(var22);
                    final SubLObject var24 = var23.first();
                    if (module0325.NIL != var23) {
                        if (module0325.NIL != var19) {
                            var20 = (SubLObject)ConsesLow.cons(var23, var20);
                        }
                        else if (module0325.NIL != module0004.f104(var24, (SubLObject)module0325.$ic3$, (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED)) {
                            var19 = var23;
                        }
                        else {
                            var20 = (SubLObject)ConsesLow.cons(var23, var20);
                        }
                    }
                    var21 = var21.rest();
                    var22 = var21.first();
                }
                if (module0325.NIL == var19) {
                    var19 = var20.first();
                    var20 = var20.rest();
                }
                if (module0325.NIL != var20) {
                    SubLObject var25 = (SubLObject)module0325.NIL;
                    SubLObject var26 = (SubLObject)module0325.NIL;
                    if (module0325.NIL == var5) {
                        var5 = module0147.$g2095$.getDynamicValue(var10);
                    }
                    SubLObject var27 = var20;
                    SubLObject var28 = (SubLObject)module0325.NIL;
                    var28 = var27.first();
                    while (module0325.NIL != var27) {
                        var25 = (SubLObject)ConsesLow.cons(f21990(var28), var25);
                        var27 = var27.rest();
                        var28 = var27.first();
                    }
                    var27 = var25;
                    SubLObject var29 = (SubLObject)module0325.NIL;
                    var29 = var27.first();
                    while (module0325.NIL != var27) {
                        final SubLObject var30 = var29.first();
                        final SubLObject var31 = conses_high.second(var29);
                        final SubLObject var32 = conses_high.third(var29);
                        var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0325.NIL != module0327.f22101((SubLObject)module0325.$ic4$, var30, var31, var32, var5) || module0325.NIL != var26);
                        var27 = var27.rest();
                        var29 = var27.first();
                    }
                    if (module0325.NIL != var26) {
                        if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                            f21985(var5);
                        }
                        final SubLObject var33 = var19.first();
                        final SubLObject var34 = conses_high.second(var19);
                        final SubLObject var35 = conses_high.third(var19);
                        var12 = f21991(var33, var34, var35, var5);
                    }
                    var27 = var25;
                    var29 = (SubLObject)module0325.NIL;
                    var29 = var27.first();
                    while (module0325.NIL != var27) {
                        final SubLObject var30 = var29.first();
                        final SubLObject var31 = conses_high.second(var29);
                        final SubLObject var32 = conses_high.third(var29);
                        module0327.f22103((SubLObject)module0325.$ic4$, var30, var31, var32, var5);
                        var27 = var27.rest();
                        var29 = var27.first();
                    }
                }
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21987(var5);
            }
        }
        finally {
            module0142.$g1727$.rebind(var13, var10);
        }
        return var12;
    }
    
    public static SubLObject f21988(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0325.NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0325.NIL;
        var10 = var9.first();
        while (module0325.NIL != var9) {
            final SubLObject var11 = var10.first();
            final SubLObject var12 = conses_high.second(var10);
            final SubLObject var13 = conses_high.third(var10);
            final SubLObject var14 = var11;
            if (var14.eql((SubLObject)module0325.$ic5$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic6$, var13, var12), var8);
            }
            else if (var14.eql((SubLObject)module0325.$ic6$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic5$, var13, var12), var8);
            }
            else if (var14.eql((SubLObject)module0325.$ic7$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic8$, var13, var12), var8);
            }
            else if (var14.eql((SubLObject)module0325.$ic8$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic7$, var13, var12), var8);
            }
            else if (var14.eql((SubLObject)module0325.$ic9$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic6$, var13, var12), var8);
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic6$, var12, var13), var8);
            }
            else if (var14.eql((SubLObject)module0325.$ic10$)) {
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic5$, var13, var12), var8);
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0325.$ic8$, var12, var13), var8);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return var8;
    }
    
    public static SubLObject f21990(final SubLObject var24) {
        final SubLObject var25 = var24.first();
        final SubLObject var26 = conses_high.second(var24);
        final SubLObject var27 = conses_high.third(var24);
        final SubLObject var28 = var25;
        if (var28.eql((SubLObject)module0325.$ic5$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0325.$ic6$, var27, var26);
        }
        if (var28.eql((SubLObject)module0325.$ic6$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0325.$ic5$, var27, var26);
        }
        if (var28.eql((SubLObject)module0325.$ic7$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0325.$ic8$, var27, var26);
        }
        if (var28.eql((SubLObject)module0325.$ic8$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0325.$ic7$, var27, var26);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21992(final SubLObject var26) {
        SubLObject var27 = var26.first();
        SubLObject var28 = conses_high.second(var26);
        SubLObject var29 = conses_high.third(var26);
        final SubLObject var30 = f21993(var27, var28);
        if (module0325.NIL == var30) {
            return (SubLObject)module0325.NIL;
        }
        var27 = var30.first();
        var28 = conses_high.second(var30);
        final SubLObject var31 = f21994(var27, var29);
        if (module0325.NIL == var31) {
            return (SubLObject)module0325.NIL;
        }
        var27 = var31.first();
        var29 = conses_high.second(var31);
        return (SubLObject)ConsesLow.list(var27, var28, var29);
    }
    
    public static SubLObject f21993(SubLObject var15, final SubLObject var29) {
        final SubLObject var30 = var29.first();
        final SubLObject var31 = conses_high.second(var29);
        SubLObject var32 = (SubLObject)module0325.NIL;
        SubLObject var33 = (SubLObject)module0325.NIL;
        SubLObject var34 = (SubLObject)module0325.NIL;
        SubLObject var35 = (SubLObject)module0325.NIL;
        if (module0325.NIL != module0323.f21850(var31)) {
            final SubLObject var36 = var30;
            if (var36.eql((SubLObject)module0325.$ic11$)) {
                return (SubLObject)ConsesLow.list(var15, module0324.f21943(var31));
            }
            if (var36.eql((SubLObject)module0325.$ic12$)) {
                return (SubLObject)ConsesLow.list(var15, module0324.f21944(var31));
            }
        }
        SubLObject var36 = var30;
        if (var36.eql((SubLObject)module0325.$ic11$)) {
            var32 = module0324.f21943(var31);
            if (module0325.NIL == module0324.f21949(var32)) {
                if (var31.isInteger()) {
                    var32 = module0324.f21945(var31);
                    var33 = (SubLObject)module0325.T;
                    if (module0325.NIL == module0324.f21949(var32)) {
                        var32 = module0324.f21944(var31);
                        var35 = (SubLObject)module0325.T;
                        if (module0325.NIL == module0324.f21949(var32)) {
                            var32 = f21995(var31);
                        }
                    }
                }
                else {
                    var32 = module0324.f21944(var31);
                }
            }
        }
        else if (var36.eql((SubLObject)module0325.$ic12$)) {
            var32 = module0324.f21944(var31);
            if (module0325.NIL == module0324.f21949(var32) && var31.isInteger()) {
                var32 = module0324.f21946(var31);
                var34 = (SubLObject)module0325.T;
                if (module0325.NIL == module0324.f21949(var32)) {
                    var32 = f21995(var31);
                    var35 = (SubLObject)module0325.T;
                }
            }
        }
        if (module0325.NIL == module0324.f21949(var32)) {
            return (SubLObject)module0325.NIL;
        }
        if (module0325.NIL != var35) {
            var36 = var15;
            if (var36.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic13$;
            }
            else if (var36.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic7$;
            }
            else if (var36.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic14$;
            }
            else if (var36.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else {
                if (var36.eql((SubLObject)module0325.$ic9$)) {
                    return (SubLObject)module0325.NIL;
                }
                if (var36.eql((SubLObject)module0325.$ic10$)) {
                    return (SubLObject)module0325.NIL;
                }
            }
        }
        else if (module0325.NIL != var33) {
            var36 = var15;
            if (var36.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic6$;
            }
            else if (var36.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic8$;
            }
            else if (var36.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else if (var36.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic15$;
            }
            else if (var36.eql((SubLObject)module0325.$ic9$)) {
                var15 = (SubLObject)module0325.$ic10$;
            }
            else if (var36.eql((SubLObject)module0325.$ic10$)) {
                var15 = (SubLObject)module0325.$ic16$;
            }
        }
        else if (module0325.NIL != var34) {
            var36 = var15;
            if (var36.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic7$;
            }
            else if (var36.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else if (var36.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic13$;
            }
            else if (var36.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic6$;
            }
            else if (var36.eql((SubLObject)module0325.$ic9$)) {
                var15 = (SubLObject)module0325.$ic17$;
            }
            else if (var36.eql((SubLObject)module0325.$ic10$)) {
                var15 = (SubLObject)module0325.$ic9$;
            }
        }
        return (SubLObject)ConsesLow.list(var15, var32);
    }
    
    public static SubLObject f21994(SubLObject var15, final SubLObject var35) {
        final SubLObject var36 = var35.first();
        final SubLObject var37 = conses_high.second(var35);
        SubLObject var38 = (SubLObject)module0325.NIL;
        SubLObject var39 = (SubLObject)module0325.NIL;
        SubLObject var40 = (SubLObject)module0325.NIL;
        SubLObject var41 = (SubLObject)module0325.NIL;
        if (module0325.NIL != module0323.f21850(var37)) {
            final SubLObject var42 = var36;
            if (var42.eql((SubLObject)module0325.$ic11$)) {
                return (SubLObject)ConsesLow.list(var15, module0324.f21943(var37));
            }
            if (var42.eql((SubLObject)module0325.$ic12$)) {
                return (SubLObject)ConsesLow.list(var15, module0324.f21944(var37));
            }
        }
        SubLObject var42 = var36;
        if (var42.eql((SubLObject)module0325.$ic11$)) {
            var38 = module0324.f21943(var37);
            if (module0325.NIL == module0324.f21949(var38) && var37.isInteger()) {
                var38 = module0324.f21945(var37);
                var39 = (SubLObject)module0325.T;
                if (module0325.NIL == module0324.f21949(var38)) {
                    var38 = f21996(var37);
                    var41 = (SubLObject)module0325.T;
                }
            }
        }
        else if (var42.eql((SubLObject)module0325.$ic12$)) {
            var38 = module0324.f21944(var37);
            if (module0325.NIL == module0324.f21949(var38)) {
                if (var37.isInteger()) {
                    var38 = module0324.f21946(var37);
                    var40 = (SubLObject)module0325.T;
                    if (module0325.NIL == module0324.f21949(var38)) {
                        var38 = module0324.f21943(var37);
                        var41 = (SubLObject)module0325.T;
                        if (module0325.NIL == module0324.f21949(var38)) {
                            var38 = f21996(var37);
                        }
                    }
                }
                else {
                    var38 = module0324.f21943(var37);
                }
            }
        }
        if (module0325.NIL == module0324.f21949(var38)) {
            return (SubLObject)module0325.NIL;
        }
        if (module0325.NIL != var41) {
            var42 = var15;
            if (var42.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic13$;
            }
            else if (var42.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic7$;
            }
            else if (var42.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic14$;
            }
            else if (var42.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else {
                if (var42.eql((SubLObject)module0325.$ic9$)) {
                    return (SubLObject)module0325.NIL;
                }
                if (var42.eql((SubLObject)module0325.$ic10$)) {
                    return (SubLObject)module0325.NIL;
                }
            }
        }
        else if (module0325.NIL != var39) {
            var42 = var15;
            if (var42.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic7$;
            }
            else if (var42.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else if (var42.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic13$;
            }
            else if (var42.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic6$;
            }
            else if (var42.eql((SubLObject)module0325.$ic9$)) {
                var15 = (SubLObject)module0325.$ic17$;
            }
            else if (var42.eql((SubLObject)module0325.$ic10$)) {
                var15 = (SubLObject)module0325.$ic9$;
            }
        }
        else if (module0325.NIL != var40) {
            var42 = var15;
            if (var42.eql((SubLObject)module0325.$ic5$)) {
                var15 = (SubLObject)module0325.$ic6$;
            }
            else if (var42.eql((SubLObject)module0325.$ic6$)) {
                var15 = (SubLObject)module0325.$ic8$;
            }
            else if (var42.eql((SubLObject)module0325.$ic7$)) {
                var15 = (SubLObject)module0325.$ic5$;
            }
            else if (var42.eql((SubLObject)module0325.$ic8$)) {
                var15 = (SubLObject)module0325.$ic15$;
            }
            else if (var42.eql((SubLObject)module0325.$ic9$)) {
                var15 = (SubLObject)module0325.$ic10$;
            }
            else if (var42.eql((SubLObject)module0325.$ic10$)) {
                var15 = (SubLObject)module0325.$ic16$;
            }
        }
        return (SubLObject)ConsesLow.list(var15, var38);
    }
    
    public static SubLObject f21989(final SubLObject var26) {
        SubLObject var27 = var26.first();
        SubLObject var28 = conses_high.second(var26);
        SubLObject var29 = conses_high.third(var26);
        final SubLObject var30 = f21997(var27, var28);
        if (module0325.NIL == var30) {
            return (SubLObject)module0325.NIL;
        }
        var27 = var30.first();
        var28 = conses_high.second(var30);
        final SubLObject var31 = f21998(var27, var29);
        if (module0325.NIL == var31) {
            return (SubLObject)module0325.NIL;
        }
        var27 = var31.first();
        var29 = conses_high.second(var31);
        return (SubLObject)ConsesLow.list(var27, var28, var29);
    }
    
    public static SubLObject f21997(final SubLObject var15, final SubLObject var29) {
        final SubLObject var30 = var29.first();
        final SubLObject var31 = conses_high.second(var29);
        SubLObject var32 = (SubLObject)module0325.NIL;
        final SubLObject var33 = var30;
        if (var33.eql((SubLObject)module0325.$ic11$)) {
            var32 = module0324.f21943(var31);
        }
        else if (var33.eql((SubLObject)module0325.$ic12$)) {
            var32 = module0324.f21944(var31);
        }
        return (SubLObject)((module0325.NIL != module0324.f21951(var32)) ? ConsesLow.list(var15, var32) : f21993(var15, var29));
    }
    
    public static SubLObject f21998(final SubLObject var15, final SubLObject var35) {
        final SubLObject var36 = var35.first();
        final SubLObject var37 = conses_high.second(var35);
        SubLObject var38 = (SubLObject)module0325.NIL;
        final SubLObject var39 = var36;
        if (var39.eql((SubLObject)module0325.$ic11$)) {
            var38 = module0324.f21943(var37);
        }
        else if (var39.eql((SubLObject)module0325.$ic12$)) {
            var38 = module0324.f21944(var37);
        }
        return (SubLObject)((module0325.NIL != module0324.f21951(var38)) ? ConsesLow.list(var15, var38) : f21994(var15, var35));
    }
    
    public static SubLObject f21996(final SubLObject var38) {
        SubLObject var39 = (SubLObject)module0325.NIL;
        SubLObject var40 = (SubLObject)module0325.NIL;
        SubLObject var41 = (SubLObject)module0325.NIL;
        if (module0325.NIL != module0142.$g1723$.getGlobalValue() && var38.numG(module0142.$g1723$.getGlobalValue().first())) {
            if (module0325.NIL == var41) {
                SubLObject var42 = module0142.$g1723$.getGlobalValue();
                SubLObject var43 = (SubLObject)module0325.NIL;
                var43 = var42.first();
                while (module0325.NIL == var41 && module0325.NIL != var42) {
                    if (var38.numLE(var43)) {
                        var41 = (SubLObject)module0325.T;
                    }
                    else {
                        var39 = var43;
                    }
                    var42 = var42.rest();
                    var43 = var42.first();
                }
            }
            if (module0325.NIL != var39) {
                var40 = module0324.f21944(var39);
                if (module0325.NIL != module0324.f21949(var40)) {
                    return var40;
                }
                var40 = module0324.f21943(var39);
                if (module0325.NIL != module0324.f21949(var40)) {
                    return var40;
                }
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21995(final SubLObject var38) {
        SubLObject var39 = (SubLObject)module0325.NIL;
        SubLObject var40 = (SubLObject)module0325.NIL;
        if (module0325.NIL == var39) {
            SubLObject var41 = module0142.$g1723$.getGlobalValue();
            SubLObject var42 = (SubLObject)module0325.NIL;
            var42 = var41.first();
            while (module0325.NIL == var39 && module0325.NIL != var41) {
                if (var38.numL(var42)) {
                    var39 = var42;
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        if (module0325.NIL != var39) {
            var40 = module0324.f21943(var39);
            if (module0325.NIL != module0324.f21949(var40)) {
                return var40;
            }
            var40 = module0324.f21944(var39);
            if (module0325.NIL != module0324.f21949(var40)) {
                return var40;
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21986(SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var18 = var16.first();
        final SubLObject var19 = conses_high.second(var16);
        final SubLObject var20 = var17.first();
        final SubLObject var21 = conses_high.second(var17);
        if (var19.isInteger() && var21.isInteger()) {
            return f21999(var15, var16, var17);
        }
        if (var19.equal(var21) && (var15 == module0325.$ic5$ || var15 == module0325.$ic7$) && (var20 == module0325.$ic12$ || (var18 == module0325.$ic11$ && var20 == module0325.$ic11$))) {
            return (SubLObject)module0325.T;
        }
        if (var19.equal(var21) && var15 == module0325.$ic9$ && ((var18 == module0325.$ic11$ && var20 == module0325.$ic11$) || (var18 == module0325.$ic12$ && var20 == module0325.$ic12$))) {
            return (SubLObject)module0325.T;
        }
        final SubLObject var22 = (SubLObject)ConsesLow.list(var15, var16, var17);
        final SubLObject var23 = f21992(var22);
        if (module0325.NIL == var23) {
            return (SubLObject)module0325.NIL;
        }
        var15 = var23.first();
        var16 = conses_high.second(var23);
        var17 = conses_high.third(var23);
        return f21991(var15, var16, var17, var5);
    }
    
    public static SubLObject f22000(final SubLObject var26) {
        final SubLObject var27 = conses_high.second(var26);
        final SubLObject var28 = conses_high.second(var27);
        final SubLObject var29 = conses_high.third(var26);
        final SubLObject var30 = conses_high.second(var29);
        return (SubLObject)SubLObjectFactory.makeBoolean(var28.isInteger() && var30.isInteger());
    }
    
    public static SubLObject f21999(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        final SubLObject var18 = var16.first();
        final SubLObject var19 = conses_high.second(var16);
        final SubLObject var20 = var17.first();
        final SubLObject var21 = conses_high.second(var17);
        if (var15.eql((SubLObject)module0325.$ic5$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var19.numL(var21) || (var19.numE(var21) && (var18 == module0325.$ic11$ || var20 == module0325.$ic12$)));
        }
        if (var15.eql((SubLObject)module0325.$ic6$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var19.numL(var21) || (var19.numE(var21) && var18 == module0325.$ic11$ && var20 == module0325.$ic12$));
        }
        if (var15.eql((SubLObject)module0325.$ic9$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var19.numE(var21) && var18.eql(var20));
        }
        if (var15.eql((SubLObject)module0325.$ic10$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var18 == module0325.$ic12$ && var20 == module0325.$ic11$ && module0051.f3652(var19).numE(var21));
        }
        if (var15.eql((SubLObject)module0325.$ic8$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((var19.numL(var21) && (var18 == module0325.$ic11$ || var20 == module0325.$ic12$)) || (var19.numE(var21) && var18 == module0325.$ic11$ && var20 == module0325.$ic12$) || module0051.f3652(var19).numL(var21));
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21991(final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (var15.eql((SubLObject)module0325.$ic5$)) {
            return module0326.f22025(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic6$)) {
            return module0326.f22029(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic7$)) {
            return module0326.f22030(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic8$)) {
            return module0326.f22031(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic9$)) {
            return module0326.f22035(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic10$)) {
            return module0326.f22036(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic17$)) {
            return module0326.f22037(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic13$)) {
            return module0326.f22032(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic18$)) {
            return module0326.f22033(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic16$)) {
            return module0326.f22038(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic15$)) {
            return module0326.f22034(var16, var17, var5);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21985(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (!module0142.$g1727$.getDynamicValue(var6).isHashtable()) {
            module0142.$g1727$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0325.$ic19$, Symbols.symbol_function((SubLObject)module0325.EQUAL), (SubLObject)module0325.UNPROVIDED), var6);
        }
        SubLObject var7 = (SubLObject)module0325.NIL;
        if (module0325.NIL == var7) {
            SubLObject var8 = (SubLObject)module0325.NIL;
            try {
                var6.throwStack.push(module0325.$ic20$);
                SubLObject var9 = (SubLObject)module0325.NIL;
                SubLObject var10 = (SubLObject)module0325.NIL;
                final Iterator var11 = Hashtables.getEntrySetIterator(module0142.$g1721$.getGlobalValue());
                try {
                    while (Hashtables.iteratorHasNext(var11)) {
                        final Map.Entry var12 = Hashtables.iteratorNextEntry(var11);
                        var9 = Hashtables.getEntryKey(var12);
                        var10 = Hashtables.getEntryValue(var12);
                        module0005.f153(var7);
                        final SubLObject var13 = var9.first();
                        final SubLObject var14 = conses_high.second(var9);
                        SubLObject var15 = (SubLObject)module0325.NIL;
                        if (module0325.NIL == Hashtables.gethash(var9, module0142.$g1727$.getDynamicValue(var6), (SubLObject)module0325.UNPROVIDED) && module0325.NIL != module0262.f17336(var5, var14, (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED)) {
                            var15 = f22001(var13, var5);
                            if (module0325.NIL == var15) {
                                continue;
                            }
                            Hashtables.sethash(var9, module0142.$g1727$.getDynamicValue(var6), var15);
                            final SubLObject var16 = var15.first();
                            final SubLObject var17 = module0327.f22100(conses_high.second(var15));
                            final SubLObject var18 = module0327.f22100(conses_high.third(var15));
                            var7 = module0327.f22101(var9, var16, var17, var18, var5);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var11);
                }
            }
            catch (Throwable var19) {
                var8 = Errors.handleThrowable(var19, (SubLObject)module0325.$ic20$);
            }
            finally {
                var6.throwStack.pop();
            }
        }
        if (module0325.NIL != var7) {
            f21985(var5);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f21987(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (module0142.$g1727$.getDynamicValue(var6).isHashtable()) {
            final SubLObject var7 = module0142.$g1727$.getDynamicValue(var6);
            SubLObject var8 = (SubLObject)module0325.NIL;
            SubLObject var9 = (SubLObject)module0325.NIL;
            final Iterator var10 = Hashtables.getEntrySetIterator(var7);
            try {
                while (Hashtables.iteratorHasNext(var10)) {
                    final Map.Entry var11 = Hashtables.iteratorNextEntry(var10);
                    var8 = Hashtables.getEntryKey(var11);
                    var9 = Hashtables.getEntryValue(var11);
                    final SubLObject var12 = var9.first();
                    final SubLObject var13 = module0327.f22102(conses_high.second(var9));
                    final SubLObject var14 = module0327.f22102(conses_high.third(var9));
                    module0327.f22103(var8, var12, var13, var14, var5);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var10);
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22001(final SubLObject var22, final SubLObject var5) {
        SubLObject var23 = (SubLObject)module0325.NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)module0325.NIL;
        var25 = var24.first();
        while (module0325.NIL != var24) {
            final SubLObject var26 = f21990(var25);
            final SubLObject var27 = var26.first();
            final SubLObject var28 = conses_high.second(var26);
            final SubLObject var29 = conses_high.third(var26);
            if (module0325.NIL == f21986(var27, var28, var29, var5)) {
                if (module0325.NIL != var23) {
                    return (SubLObject)module0325.NIL;
                }
                var23 = var25;
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        if (module0325.NIL != var23) {
            final SubLObject var30 = var23.first();
            final SubLObject var31 = conses_high.second(var23);
            final SubLObject var32 = conses_high.third(var23);
            if (module0325.NIL != f21986(var30, var31, var32, var5)) {
                var23 = (SubLObject)module0325.NIL;
            }
        }
        return var23;
    }
    
    public static SubLObject f22002(final SubLObject var35, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var36 = f21994((SubLObject)module0325.$ic5$, var35);
        final SubLObject var37 = var36.first();
        final SubLObject var38 = conses_high.second(var36);
        return (SubLObject)((module0325.NIL != var36) ? f22003(var37, var38, var5) : module0325.NIL);
    }
    
    public static SubLObject f22004(final SubLObject var29, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var30 = f21993((SubLObject)module0325.$ic5$, var29);
        final SubLObject var31 = var30.first();
        final SubLObject var32 = conses_high.second(var30);
        return (SubLObject)((module0325.NIL != var30) ? f22005(var31, var32, var5) : module0325.NIL);
    }
    
    public static SubLObject f22006(final SubLObject var35, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var36 = f21994((SubLObject)module0325.$ic6$, var35);
        final SubLObject var37 = var36.first();
        final SubLObject var38 = conses_high.second(var36);
        return (SubLObject)((module0325.NIL != var36) ? f22003(var37, var38, var5) : module0325.NIL);
    }
    
    public static SubLObject f22007(final SubLObject var29, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var30 = f21993((SubLObject)module0325.$ic6$, var29);
        final SubLObject var31 = var30.first();
        final SubLObject var32 = conses_high.second(var30);
        return (SubLObject)((module0325.NIL != var30) ? f22005(var31, var32, var5) : module0325.NIL);
    }
    
    public static SubLObject f22008(final SubLObject var26, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var27 = f21993((SubLObject)module0325.$ic9$, var26);
        final SubLObject var28 = var27.first();
        final SubLObject var29 = conses_high.second(var27);
        return (SubLObject)((module0325.NIL != var27) ? f22005(var28, var29, var5) : module0325.NIL);
    }
    
    public static SubLObject f22009(final SubLObject var29, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var30 = f21993((SubLObject)module0325.$ic10$, var29);
        final SubLObject var31 = var30.first();
        final SubLObject var32 = conses_high.second(var30);
        return (SubLObject)((module0325.NIL != var30) ? f22005(var31, var32, var5) : module0325.NIL);
    }
    
    public static SubLObject f22010(final SubLObject var35, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var36 = f21994((SubLObject)module0325.$ic10$, var35);
        final SubLObject var37 = var36.first();
        final SubLObject var38 = conses_high.second(var36);
        return (SubLObject)((module0325.NIL != var36) ? f22003(var37, var38, var5) : module0325.NIL);
    }
    
    public static SubLObject f22003(final SubLObject var15, final SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (var15.eql((SubLObject)module0325.$ic5$)) {
            return module0326.f22043(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic6$)) {
            return module0326.f22047(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic7$)) {
            return module0326.f22049(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic8$)) {
            return module0326.f22051(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic9$)) {
            return module0326.f22056(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic10$)) {
            return module0326.f22059(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic17$)) {
            return module0326.f22058(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic13$)) {
            return module0326.f22053(var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic16$)) {
            return module0326.f22062(var17, var5);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22005(final SubLObject var15, final SubLObject var16, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (var15.eql((SubLObject)module0325.$ic5$)) {
            return module0326.f22040(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic6$)) {
            return module0326.f22046(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic7$)) {
            return module0326.f22048(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic8$)) {
            return module0326.f22050(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic9$)) {
            return module0326.f22056(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic10$)) {
            return module0326.f22058(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic17$)) {
            return module0326.f22059(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic13$)) {
            return module0326.f22052(var16, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic16$)) {
            return module0326.f22061(var16, var5);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22011(final SubLObject var29, final SubLObject var35, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var36 = f21993((SubLObject)module0325.$ic5$, var29);
        final SubLObject var37 = var36.first();
        final SubLObject var38 = conses_high.second(var36);
        if (module0325.NIL == var36) {
            return (SubLObject)module0325.NIL;
        }
        final SubLObject var39 = f21994((SubLObject)module0325.$ic5$, var35);
        final SubLObject var40 = var39.first();
        final SubLObject var41 = conses_high.second(var39);
        if (module0325.NIL == var39) {
            return (SubLObject)module0325.NIL;
        }
        return f22012(var37, var38, var40, var41, var5);
    }
    
    public static SubLObject f22013(final SubLObject var29, final SubLObject var35, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var36 = f21993((SubLObject)module0325.$ic6$, var29);
        final SubLObject var37 = var36.first();
        final SubLObject var38 = conses_high.second(var36);
        if (module0325.NIL == var36) {
            return (SubLObject)module0325.NIL;
        }
        final SubLObject var39 = f21994((SubLObject)module0325.$ic6$, var35);
        final SubLObject var40 = var39.first();
        final SubLObject var41 = conses_high.second(var39);
        if (module0325.NIL == var39) {
            return (SubLObject)module0325.NIL;
        }
        return f22012(var37, var38, var40, var41, var5);
    }
    
    public static SubLObject f22012(final SubLObject var58, final SubLObject var16, final SubLObject var59, final SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        SubLObject var60 = (SubLObject)module0325.NIL;
        SubLObject var61 = (SubLObject)module0325.NIL;
        if (var58.eql((SubLObject)module0325.$ic5$)) {
            var60 = (SubLObject)module0325.ZERO_INTEGER;
        }
        else if (var58.eql((SubLObject)module0325.$ic6$)) {
            var60 = (SubLObject)module0325.MINUS_ONE_INTEGER;
        }
        else if (var58.eql((SubLObject)module0325.$ic7$)) {
            var60 = (SubLObject)module0325.ONE_INTEGER;
        }
        else if (var58.eql((SubLObject)module0325.$ic8$)) {
            var60 = (SubLObject)module0325.$ic21$;
        }
        else if (var58.eql((SubLObject)module0325.$ic13$)) {
            var60 = (SubLObject)module0325.TWO_INTEGER;
        }
        if (var59.eql((SubLObject)module0325.$ic5$)) {
            var61 = (SubLObject)module0325.ZERO_INTEGER;
        }
        else if (var59.eql((SubLObject)module0325.$ic6$)) {
            var61 = (SubLObject)module0325.MINUS_ONE_INTEGER;
        }
        else if (var59.eql((SubLObject)module0325.$ic7$)) {
            var61 = (SubLObject)module0325.ONE_INTEGER;
        }
        else if (var59.eql((SubLObject)module0325.$ic8$)) {
            var61 = (SubLObject)module0325.$ic21$;
        }
        else if (var59.eql((SubLObject)module0325.$ic13$)) {
            var61 = (SubLObject)module0325.TWO_INTEGER;
        }
        return module0326.f22063(var60, var61, var16, var17, var5);
    }
    
    public static SubLObject f22014(final SubLObject var62, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0325.NIL != module0202.f12937(var62) && module0202.f12839(module0202.f12826(var62), (SubLObject)module0325.UNPROVIDED).numE((SubLObject)module0325.TWO_INTEGER) && (module0325.NIL == var5 || module0325.NIL != module0161.f10481(var5))) {
            final SubLObject var64 = module0142.$g1718$.currentBinding(var63);
            try {
                module0142.$g1718$.bind((SubLObject)module0325.NIL, var63);
                final SubLObject var65 = module0202.f12826(var62);
                final SubLObject var66 = module0205.f13132(var65);
                final SubLObject var67 = module0205.f13203(var65, (SubLObject)module0325.UNPROVIDED);
                final SubLObject var68 = module0205.f13204(var65, (SubLObject)module0325.UNPROVIDED);
                final SubLObject var69 = (SubLObject)((module0325.NIL != module0202.f12592(var62)) ? module0325.$ic2$ : module0325.$ic1$);
                SubLObject var71;
                final SubLObject var70 = var71 = f22015(var66, var67, var68, var69, var5);
                SubLObject var72 = (SubLObject)module0325.NIL;
                var72 = var71.first();
                while (module0325.NIL != var71) {
                    if (!var72.eql(var70.first())) {
                        module0642.f39026((SubLObject)module0325.UNPROVIDED);
                    }
                    if (module0325.NIL != module0174.f11035(var72)) {
                        module0656.f39916(var72, (SubLObject)module0325.T, (SubLObject)module0325.UNPROVIDED);
                    }
                    else {
                        module0656.f39804(var72, (SubLObject)module0325.ZERO_INTEGER, (SubLObject)module0325.T);
                    }
                    var71 = var71.rest();
                    var72 = var71.first();
                }
            }
            finally {
                module0142.$g1718$.rebind(var64, var63);
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22015(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (module0325.NIL == module0324.f21953(var1, var2, var3)) {
            return (SubLObject)module0325.NIL;
        }
        if (var2.equal(var3) && var4 == module0325.$ic1$ && module0325.NIL != module0226.f14795(var1)) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0325.$ic22$, (SubLObject)ConsesLow.list(var1, var2, var3), module0327.$g2465$.getGlobalValue(), (SubLObject)module0325.UNPROVIDED));
        }
        if (var2.equal(var3) && var4 == module0325.$ic2$ && module0325.NIL != module0226.f14796(var1)) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0325.$ic22$, (SubLObject)ConsesLow.list(var1, var2, var3), module0327.$g2465$.getGlobalValue(), (SubLObject)module0325.UNPROVIDED));
        }
        final SubLObject var6 = module0328.f22143(var1, (SubLObject)module0325.$ic0$, (SubLObject)module0325.UNPROVIDED);
        if (module0325.NIL == Symbols.fboundp(var6)) {
            return (SubLObject)module0325.NIL;
        }
        final SubLObject var7 = Functions.funcall(var6, var2, var3);
        if (var4.eql((SubLObject)module0325.$ic1$)) {
            if (module0325.NIL != module0324.f21970(var1)) {
                return f22016(var7, var5);
            }
            if (module0325.NIL != module0324.f21971(var1)) {
                return f22017(var7, var5);
            }
        }
        else if (var4.eql((SubLObject)module0325.$ic2$)) {
            if (module0325.NIL != module0324.f21970(var1)) {
                return f22017(var7, var5);
            }
            if (module0325.NIL != module0324.f21971(var1)) {
                return f22016(var7, var5);
            }
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22016(final SubLObject var9, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0325.NIL;
        SubLObject var12 = (SubLObject)module0325.NIL;
        final SubLObject var13 = module0142.$g1730$.currentBinding(var10);
        final SubLObject var14 = module0142.$g1727$.currentBinding(var10);
        try {
            module0142.$g1730$.bind((SubLObject)module0325.NIL, var10);
            module0142.$g1727$.bind((SubLObject)module0325.NIL, var10);
            if (module0325.NIL == var5 && module0325.NIL == module0147.f9513() && module0325.NIL == module0147.f9512()) {
                var5 = module0147.$g2095$.getDynamicValue(var10);
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21985(var5);
            }
            if (module0325.NIL == var12) {
                SubLObject var15 = var9;
                SubLObject var16 = (SubLObject)module0325.NIL;
                var16 = var15.first();
                while (module0325.NIL == var12 && module0325.NIL != var15) {
                    final SubLObject var17 = var16.first();
                    final SubLObject var18 = conses_high.second(var16);
                    final SubLObject var19 = conses_high.third(var16);
                    SubLObject var20 = (SubLObject)module0325.NIL;
                    var20 = f22018(var17, var18, var19, var5);
                    if (module0325.NIL != var20) {
                        if (var20.first().isList() && module0325.$ic23$.eql(conses_high.caar(var20))) {
                            final SubLObject var21 = var20.first();
                            if (module0325.NIL == conses_high.member(var21, var11, Symbols.symbol_function((SubLObject)module0325.EQUAL), Symbols.symbol_function((SubLObject)module0325.IDENTITY))) {
                                var11 = (SubLObject)ConsesLow.cons(var21, var11);
                            }
                        }
                        else {
                            var11 = ConsesLow.append(var20, var11);
                        }
                    }
                    else {
                        var12 = (SubLObject)module0325.T;
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21987(var5);
            }
        }
        finally {
            module0142.$g1727$.rebind(var14, var10);
            module0142.$g1730$.rebind(var13, var10);
        }
        return (SubLObject)((module0325.NIL != var12) ? module0325.NIL : ((module0325.NIL != module0142.$g1718$.getDynamicValue(var10)) ? var11 : Sequences.remove_duplicates(var11, Symbols.symbol_function((SubLObject)module0325.EQUAL), (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED)));
    }
    
    public static SubLObject f22017(final SubLObject var9, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0325.NIL;
        final SubLObject var12 = f21988(var9);
        final SubLObject var13 = module0142.$g1730$.currentBinding(var10);
        final SubLObject var14 = module0142.$g1727$.currentBinding(var10);
        try {
            module0142.$g1730$.bind((SubLObject)module0325.NIL, var10);
            module0142.$g1727$.bind((SubLObject)module0325.NIL, var10);
            if (module0325.NIL == var5 && module0325.NIL == module0147.f9513() && module0325.NIL == module0147.f9512()) {
                var5 = module0147.$g2095$.getDynamicValue(var10);
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21985(var5);
            }
            if (module0325.NIL == var11) {
                SubLObject var15 = var12;
                SubLObject var16 = (SubLObject)module0325.NIL;
                var16 = var15.first();
                while (module0325.NIL == var11 && module0325.NIL != var15) {
                    final SubLObject var17 = var16.first();
                    final SubLObject var18 = conses_high.second(var16);
                    final SubLObject var19 = conses_high.third(var16);
                    var11 = f22018(var17, var18, var19, var5);
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            if (module0325.NIL == var11) {
                SubLObject var20 = (SubLObject)module0325.NIL;
                SubLObject var21 = (SubLObject)module0325.NIL;
                SubLObject var22 = var12;
                SubLObject var23 = (SubLObject)module0325.NIL;
                var23 = var22.first();
                while (module0325.NIL != var22) {
                    final SubLObject var24 = f21989(var23);
                    final SubLObject var25 = var24.first();
                    if (module0325.NIL != var24) {
                        if (module0325.NIL != var20) {
                            var21 = (SubLObject)ConsesLow.cons(var24, var21);
                        }
                        else if (module0325.NIL != module0004.f104(var25, (SubLObject)module0325.$ic3$, (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED)) {
                            var20 = var24;
                        }
                        else {
                            var21 = (SubLObject)ConsesLow.cons(var24, var21);
                        }
                    }
                    var22 = var22.rest();
                    var23 = var22.first();
                }
                if (module0325.NIL == var20) {
                    var20 = var21.first();
                    var21 = var21.rest();
                }
                if (module0325.NIL != var21) {
                    SubLObject var26 = (SubLObject)module0325.NIL;
                    SubLObject var27 = (SubLObject)module0325.NIL;
                    if (module0325.NIL == var5) {
                        var5 = module0147.$g2095$.getDynamicValue(var10);
                    }
                    SubLObject var28 = var21;
                    SubLObject var29 = (SubLObject)module0325.NIL;
                    var29 = var28.first();
                    while (module0325.NIL != var28) {
                        var26 = (SubLObject)ConsesLow.cons(f21990(var29), var26);
                        var28 = var28.rest();
                        var29 = var28.first();
                    }
                    var28 = var26;
                    SubLObject var30 = (SubLObject)module0325.NIL;
                    var30 = var28.first();
                    while (module0325.NIL != var28) {
                        final SubLObject var31 = var30.first();
                        final SubLObject var32 = conses_high.second(var30);
                        final SubLObject var33 = conses_high.third(var30);
                        var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0325.NIL != module0327.f22101((SubLObject)module0325.$ic4$, var31, var32, var33, var5) || module0325.NIL != var27);
                        var28 = var28.rest();
                        var30 = var28.first();
                    }
                    if (module0325.NIL != var27) {
                        if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                            f21985(var5);
                        }
                        final SubLObject var34 = var20.first();
                        final SubLObject var35 = conses_high.second(var20);
                        final SubLObject var36 = conses_high.third(var20);
                        var11 = f22019(var34, var35, var36, var5);
                    }
                    var28 = var26;
                    var30 = (SubLObject)module0325.NIL;
                    var30 = var28.first();
                    while (module0325.NIL != var28) {
                        final SubLObject var31 = var30.first();
                        final SubLObject var32 = conses_high.second(var30);
                        final SubLObject var33 = conses_high.third(var30);
                        module0327.f22103((SubLObject)module0325.$ic4$, var31, var32, var33, var5);
                        var28 = var28.rest();
                        var30 = var28.first();
                    }
                }
            }
            if (module0325.NIL != module0142.$g1717$.getDynamicValue(var10)) {
                f21987(var5);
            }
        }
        finally {
            module0142.$g1727$.rebind(var14, var10);
            module0142.$g1730$.rebind(var13, var10);
        }
        return (module0325.NIL != module0142.$g1718$.getDynamicValue(var10)) ? var11 : Sequences.remove_duplicates(var11, Symbols.symbol_function((SubLObject)module0325.EQUAL), (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED, (SubLObject)module0325.UNPROVIDED);
    }
    
    public static SubLObject f22018(SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        final SubLObject var18 = var16.first();
        final SubLObject var19 = conses_high.second(var16);
        final SubLObject var20 = var17.first();
        final SubLObject var21 = conses_high.second(var17);
        if (var19.isInteger() && var21.isInteger()) {
            return (SubLObject)module0325.NIL;
        }
        if (var19.equal(var21) && (var15 == module0325.$ic5$ || var15 == module0325.$ic7$) && (var20 == module0325.$ic12$ || (var18 == module0325.$ic11$ && var20 == module0325.$ic11$))) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0325.$ic24$, (SubLObject)ConsesLow.list(module0325.$ic23$, var19, var21), var5, (SubLObject)module0325.UNPROVIDED));
        }
        if (var19.equal(var21) && var15 == module0325.$ic9$ && ((var18 == module0325.$ic11$ && var20 == module0325.$ic11$) || (var18 == module0325.$ic12$ && var20 == module0325.$ic12$))) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0325.$ic24$, (SubLObject)ConsesLow.list(module0325.$ic23$, var19, var21), var5, (SubLObject)module0325.UNPROVIDED));
        }
        final SubLObject var22 = (SubLObject)ConsesLow.list(var15, var16, var17);
        final SubLObject var23 = f21992(var22);
        if (module0325.NIL == var23) {
            return (SubLObject)module0325.NIL;
        }
        var15 = var23.first();
        var16 = conses_high.second(var23);
        var17 = conses_high.third(var23);
        return f22019(var15, var16, var17, var5);
    }
    
    public static SubLObject f22019(final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var5) {
        if (var5 == module0325.UNPROVIDED) {
            var5 = (SubLObject)module0325.NIL;
        }
        if (var15.eql((SubLObject)module0325.$ic5$)) {
            return module0326.f22070(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic6$)) {
            return module0326.f22074(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic7$)) {
            return module0326.f22075(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic8$)) {
            return module0326.f22076(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic9$)) {
            return module0326.f22080(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic10$)) {
            return module0326.f22081(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic17$)) {
            return module0326.f22082(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic13$)) {
            return module0326.f22077(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic18$)) {
            return module0326.f22078(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic16$)) {
            return module0326.f22083(var16, var17, var5);
        }
        if (var15.eql((SubLObject)module0325.$ic15$)) {
            return module0326.f22079(var16, var17, var5);
        }
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22020() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21982", "S#24611", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21983", "S#24612", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21984", "S#24613", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21988", "S#24614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21990", "S#18842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21992", "S#24615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21993", "S#24616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21994", "S#24617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21989", "S#24618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21997", "S#24619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21998", "S#24620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21996", "S#24621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21995", "S#24622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21986", "S#24623", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22000", "S#24624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21999", "S#24625", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21991", "S#24626", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21985", "S#11716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f21987", "S#11717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22001", "S#24627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22002", "S#24628", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22004", "S#24629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22006", "S#24630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22007", "S#24631", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22008", "S#24632", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22009", "S#24633", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22010", "S#24634", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22003", "S#24635", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22005", "S#24636", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22011", "S#24637", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22013", "S#24638", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22012", "S#24639", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22014", "S#24640", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22015", "S#24641", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22016", "S#24642", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22017", "S#24643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22018", "S#18843", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0325", "f22019", "S#24644", 3, 1, false);
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22021() {
        return (SubLObject)module0325.NIL;
    }
    
    public static SubLObject f22022() {
        return (SubLObject)module0325.NIL;
    }
    
    public void declareFunctions() {
        f22020();
    }
    
    public void initializeVariables() {
        f22021();
    }
    
    public void runTopLevelForms() {
        f22022();
    }
    
    static {
        me = (SubLFile)new module0325();
        $ic0$ = SubLObjectFactory.makeKeyword("CONJUNCTION-FN");
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR-STRICT"));
        $ic4$ = SubLObjectFactory.makeKeyword("CONDITIONAL-PROOF");
        $ic5$ = SubLObjectFactory.makeKeyword("WEAK");
        $ic6$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic7$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $ic8$ = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $ic9$ = SubLObjectFactory.makeKeyword("COORDINATE");
        $ic10$ = SubLObjectFactory.makeKeyword("SUCCESSOR");
        $ic11$ = SubLObjectFactory.makeKeyword("START");
        $ic12$ = SubLObjectFactory.makeKeyword("END");
        $ic13$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR");
        $ic14$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSORS-SUCCESSOR");
        $ic15$ = SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR-STRICT");
        $ic16$ = SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR");
        $ic17$ = SubLObjectFactory.makeKeyword("PREDECESSOR");
        $ic18$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR-SUCCESSOR");
        $ic19$ = SubLObjectFactory.makeInteger(1000);
        $ic20$ = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $ic21$ = SubLObjectFactory.makeInteger(-2);
        $ic22$ = SubLObjectFactory.makeKeyword("REFLEXIVE");
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic24$ = SubLObjectFactory.makeKeyword("EQUALITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0325.class
	Total time: 357 ms
	
	Decompiled with Procyon 0.5.32.
*/