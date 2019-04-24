package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0224 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0224";
    public static final String myFingerPrint = "5f38abb05b25626977055d61a3dd0a41e98a82436827f62083a6475f68042b00";
    private static SubLSymbol $g2407$;
    private static SubLSymbol $g2408$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    
    public static SubLObject f14699(final SubLObject var1, SubLObject var2) {
        if (var2 == module0224.UNPROVIDED) {
            var2 = module0224.$ic0$;
        }
        if (module0224.NIL == var2) {
            var2 = module0224.$ic0$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0224.$ic1$)) {
            return (SubLObject)ConsesLow.list(var1);
        }
        if (var3.eql((SubLObject)module0224.$ic2$)) {
            var2 = f14700();
        }
        else if (var3.eql((SubLObject)module0224.$ic3$)) {
            var2 = f14701();
        }
        SubLObject var4 = (module0224.NIL != module0269.f17714(var1)) ? module0256.f16546(var1) : module0259.f16842(var1);
        if (!var2.eql(module0224.$ic0$)) {
            if (!var2.isNumber()) {
                var2 = module0549.f33906(var2);
            }
            SubLObject var5 = (SubLObject)module0224.NIL;
            SubLObject var6 = var4;
            SubLObject var7 = (SubLObject)module0224.NIL;
            var7 = var6.first();
            while (module0224.NIL != var6) {
                final SubLObject var8 = module0549.f33906(var7);
                if (!var8.numG(var2)) {
                    var5 = (SubLObject)ConsesLow.cons(var7, var5);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            var4 = var5;
        }
        var4 = module0549.f33908(var4, (SubLObject)module0224.$ic4$);
        return var4;
    }
    
    public static SubLObject f14702(final SubLObject var1, SubLObject var2) {
        if (var2 == module0224.UNPROVIDED) {
            var2 = module0224.$ic0$;
        }
        final SubLObject var3 = f14699(var1, var2);
        return module0052.f3709(conses_high.adjoin(var1, var3, Symbols.symbol_function((SubLObject)module0224.EQUAL), (SubLObject)module0224.UNPROVIDED));
    }
    
    public static SubLObject f14703(final SubLObject var1, SubLObject var9, SubLObject var10) {
        if (var9 == module0224.UNPROVIDED) {
            var9 = (SubLObject)module0224.NIL;
        }
        if (var10 == module0224.UNPROVIDED) {
            var10 = (SubLObject)module0224.$ic5$;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0224.NIL;
        final SubLObject var14;
        final SubLObject var13 = var14 = module0034.f1854((SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED);
        final SubLObject var15 = module0034.$g879$.currentBinding(var11);
        try {
            module0034.$g879$.bind(var14, var11);
            SubLObject var16 = (SubLObject)module0224.NIL;
            if (module0224.NIL != var14 && module0224.NIL == module0034.f1842(var14)) {
                var16 = module0034.f1869(var14);
                final SubLObject var17 = Threads.current_process();
                if (module0224.NIL == var16) {
                    module0034.f1873(var14, var17);
                }
                else if (!var16.eql(var17)) {
                    Errors.error((SubLObject)module0224.$ic6$);
                }
            }
            try {
                SubLObject var18 = module0139.f9019((SubLObject)module0224.TWO_INTEGER);
                final SubLObject var15_19 = module0139.$g1632$.currentBinding(var11);
                final SubLObject var19 = module0139.$g1630$.currentBinding(var11);
                final SubLObject var20 = module0139.$g1631$.currentBinding(var11);
                try {
                    module0139.$g1632$.bind(var18, var11);
                    module0139.$g1630$.bind((SubLObject)module0224.T, var11);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var11)), var11);
                    final SubLObject var22;
                    final SubLObject var21 = var22 = var9;
                    final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0224.$ic7$, var22);
                    final SubLObject var24 = (SubLObject)((module0224.NIL != var23) ? conses_high.cadr(var23) : module0224.NIL);
                    final SubLObject var25 = (module0224.NIL != module0269.f17714(var1)) ? module0224.$ic8$ : module0224.$ic9$;
                    final SubLObject var26 = f14702(var1, var24);
                    SubLObject var29;
                    for (SubLObject var27 = (SubLObject)module0224.NIL; module0224.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0224.NIL == var29)) {
                        var11.resetMultipleValues();
                        final SubLObject var28 = module0052.f3693(var26);
                        var29 = var11.secondMultipleValue();
                        var11.resetMultipleValues();
                        if (module0224.NIL != var29) {
                            final SubLObject var30 = var28.equal(var1) ? module0224.$ic10$ : var25;
                            SubLObject var32;
                            final SubLObject var31 = var32 = f14704(var1, var30, var28, var9);
                            SubLObject var33 = (SubLObject)module0224.NIL;
                            var33 = var32.first();
                            while (module0224.NIL != var32) {
                                var12 = (SubLObject)ConsesLow.cons(var33, var12);
                                var32 = var32.rest();
                                var33 = var32.first();
                            }
                        }
                    }
                    var12 = f14705(var1, var12, var10);
                    var18 = module0139.$g1632$.getDynamicValue(var11);
                }
                finally {
                    module0139.$g1631$.rebind(var20, var11);
                    module0139.$g1630$.rebind(var19, var11);
                    module0139.$g1632$.rebind(var15_19, var11);
                }
            }
            finally {
                final SubLObject var15_20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0224.T, var11);
                    if (module0224.NIL != var14 && module0224.NIL == var16) {
                        module0034.f1873(var14, (SubLObject)module0224.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_20, var11);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var15, var11);
        }
        return var12;
    }
    
    public static SubLObject f14706(final SubLObject var1) {
        final SubLObject var2 = f14703(var1, (SubLObject)module0224.NIL, (SubLObject)module0224.$ic5$);
        final SubLObject var3 = f14707(var1, var2, (SubLObject)module0224.$ic5$);
        final SubLObject var4 = module0035.f2076(Symbols.symbol_function((SubLObject)module0224.$ic11$), var3);
        SubLObject var5 = module0035.f2076(Symbols.symbol_function((SubLObject)module0224.$ic12$), var4);
        var5 = module0035.f2288(var5, (SubLObject)module0224.UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f14708(final SubLObject var1) {
        final SubLObject var2 = f14703(var1, (SubLObject)module0224.NIL, (SubLObject)module0224.$ic13$);
        final SubLObject var3 = f14707(var1, var2, (SubLObject)module0224.$ic13$);
        final SubLObject var4 = module0035.f2076(Symbols.symbol_function((SubLObject)module0224.$ic11$), var3);
        SubLObject var5 = module0035.f2076(Symbols.symbol_function((SubLObject)module0224.$ic14$), var4);
        var5 = module0035.f2288(var5, (SubLObject)module0224.UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f14704(final SubLObject var1, final SubLObject var30, final SubLObject var38, final SubLObject var39) {
        if (var30.eql(module0224.$ic10$)) {
            return f14709(var1, var39);
        }
        if (var30.eql(module0224.$ic9$)) {
            return f14710(var1, var38, var39);
        }
        if (var30.eql(module0224.$ic8$)) {
            return f14711(var1, var38, var39);
        }
        return Errors.error((SubLObject)module0224.$ic15$, var30);
    }
    
    public static SubLObject f14709(final SubLObject var1, final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0224.NIL;
        SubLObject var41 = module0217.f14228(var1, (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED);
        if (module0224.NIL != module0173.f10955(var1) && module0224.NIL != module0269.f17705(var1)) {
            final SubLObject var42 = (SubLObject)module0224.TWO_INTEGER;
            if (module0224.NIL == conses_high.member(var42, var41, Symbols.symbol_function((SubLObject)module0224.EQL), Symbols.symbol_function((SubLObject)module0224.IDENTITY))) {
                var41 = (SubLObject)ConsesLow.cons(var42, var41);
            }
        }
        SubLObject var43 = var41;
        SubLObject var44 = (SubLObject)module0224.NIL;
        var44 = var43.first();
        while (module0224.NIL != var43) {
            SubLObject var45 = module0217.f14228(var1, var44, (SubLObject)module0224.UNPROVIDED);
            if (module0224.NIL != module0173.f10955(var1) && module0224.NIL != module0269.f17705(var1) && var44.numE((SubLObject)module0224.TWO_INTEGER)) {
                if (module0549.f33895(var1).isPositive()) {
                    final SubLObject var46 = module0224.$ic9$;
                    if (module0224.NIL == conses_high.member(var46, var45, Symbols.symbol_function((SubLObject)module0224.EQL), Symbols.symbol_function((SubLObject)module0224.IDENTITY))) {
                        var45 = (SubLObject)ConsesLow.cons(var46, var45);
                    }
                }
                if (module0549.f33897(var1).isPositive()) {
                    final SubLObject var46 = module0224.$ic16$;
                    if (module0224.NIL == conses_high.member(var46, var45, Symbols.symbol_function((SubLObject)module0224.EQL), Symbols.symbol_function((SubLObject)module0224.IDENTITY))) {
                        var45 = (SubLObject)ConsesLow.cons(var46, var45);
                    }
                }
            }
            SubLObject var6_44 = var45;
            SubLObject var47 = (SubLObject)module0224.NIL;
            var47 = var6_44.first();
            while (module0224.NIL != var6_44) {
                if (module0224.NIL != f14712(var39, var47)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic10$, var1, var44, var47), var40);
                }
                var6_44 = var6_44.rest();
                var47 = var6_44.first();
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return f14705(var1, var40, (SubLObject)module0224.$ic5$);
    }
    
    public static SubLObject f14710(final SubLObject var1, final SubLObject var38, final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0224.NIL;
        if (module0217.f14221(var38, (SubLObject)module0224.TWO_INTEGER, module0224.$ic17$, (SubLObject)module0224.UNPROVIDED).isPositive()) {
            if (module0224.NIL != f14712(var39, module0224.$ic17$)) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic9$, var38, (SubLObject)module0224.TWO_INTEGER, module0224.$ic17$), var40);
            }
            SubLObject var41 = module0219.f14509(var38, (SubLObject)module0224.TWO_INTEGER, module0224.$ic17$, (SubLObject)module0224.NIL, (SubLObject)module0224.$ic19$);
            SubLObject var42 = (SubLObject)module0224.NIL;
            var42 = var41.first();
            while (module0224.NIL != var41) {
                final SubLObject var43 = module0178.f11334(var42);
                if (module0224.NIL != f14712(var39, var43)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0224.$ic18$, var38, (SubLObject)module0224.ONE_INTEGER, var43), var40);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        if (module0217.f14221(var38, (SubLObject)module0224.THREE_INTEGER, module0224.$ic20$, (SubLObject)module0224.UNPROVIDED).isPositive()) {
            if (module0224.NIL != f14712(var39, module0224.$ic20$)) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic9$, var38, (SubLObject)module0224.THREE_INTEGER, module0224.$ic20$), var40);
            }
            SubLObject var41 = module0219.f14509(var38, (SubLObject)module0224.THREE_INTEGER, module0224.$ic20$, (SubLObject)module0224.NIL, (SubLObject)module0224.$ic19$);
            SubLObject var42 = (SubLObject)module0224.NIL;
            var42 = var41.first();
            while (module0224.NIL != var41) {
                final SubLObject var43 = module0178.f11334(var42);
                if (module0224.NIL != f14712(var39, var43)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0224.$ic18$, var38, (SubLObject)module0224.TWO_INTEGER, var43), var40);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        if (module0217.f14221(var38, (SubLObject)module0224.TWO_INTEGER, module0224.$ic21$, (SubLObject)module0224.UNPROVIDED).isPositive() && module0224.NIL != f14712(var39, module0224.$ic21$)) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic9$, var38, (SubLObject)module0224.TWO_INTEGER, module0224.$ic21$), var40);
        }
        if (module0217.f14221(var38, (SubLObject)module0224.THREE_INTEGER, module0224.$ic22$, (SubLObject)module0224.UNPROVIDED).isPositive() && module0224.NIL != f14712(var39, module0224.$ic22$)) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic9$, var38, (SubLObject)module0224.THREE_INTEGER, module0224.$ic22$), var40);
        }
        return f14705(var1, var40, (SubLObject)module0224.$ic5$);
    }
    
    public static SubLObject f14711(final SubLObject var1, final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0224.NIL;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var40);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var40);
        try {
            module0147.$g2094$.bind((SubLObject)module0224.$ic23$, var40);
            module0147.$g2095$.bind(module0224.$ic24$, var40);
            SubLObject var44 = module0217.f14228(var38, (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED);
            SubLObject var45 = (SubLObject)module0224.NIL;
            var45 = var44.first();
            while (module0224.NIL != var44) {
                SubLObject var6_47;
                final SubLObject var46 = var6_47 = module0217.f14228(var38, var45, (SubLObject)module0224.UNPROVIDED);
                SubLObject var47 = (SubLObject)module0224.NIL;
                var47 = var6_47.first();
                while (module0224.NIL != var6_47) {
                    if (!var47.eql(module0224.$ic8$) && module0224.NIL != module0222.f14635(module0224.$ic25$, var47, (SubLObject)module0224.ONE_INTEGER, (SubLObject)module0224.UNPROVIDED) && module0224.NIL != f14712(var39, var47) && module0224.NIL != f14713(var47, var45)) {
                        var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0224.$ic8$, var38, var45, var47), var41);
                    }
                    var6_47 = var6_47.rest();
                    var47 = var6_47.first();
                }
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var43, var40);
            module0147.$g2094$.rebind(var42, var40);
        }
        return f14705(var1, var41, (SubLObject)module0224.$ic5$);
    }
    
    public static SubLObject f14714(final SubLObject var45, final SubLObject var42, SubLObject var48) {
        if (var48 == module0224.UNPROVIDED) {
            var48 = (SubLObject)module0224.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0224.NIL != module0222.f14635(module0224.$ic25$, var45, (SubLObject)module0224.ONE_INTEGER, (SubLObject)module0224.UNPROVIDED) && module0224.NIL != module0220.f14587((SubLObject)ConsesLow.list(module0224.$ic25$, var45, module0224.$ic8$, var42), var48, (SubLObject)module0224.ONE_INTEGER, (SubLObject)module0224.$ic19$));
    }
    
    public static SubLObject f14715(final SubLObject var45, final SubLObject var42) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0224.NIL;
        final SubLObject var48 = module0147.$g2094$.currentBinding(var46);
        final SubLObject var49 = module0147.$g2095$.currentBinding(var46);
        try {
            module0147.$g2094$.bind((SubLObject)module0224.$ic23$, var46);
            module0147.$g2095$.bind(module0224.$ic24$, var46);
            var47 = f14714(var45, var42, (SubLObject)module0224.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var49, var46);
            module0147.$g2094$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f14713(final SubLObject var45, final SubLObject var42) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = module0034.$g879$.getDynamicValue(var46);
        SubLObject var48 = (SubLObject)module0224.NIL;
        if (module0224.NIL == var47) {
            return f14715(var45, var42);
        }
        var48 = module0034.f1857(var47, (SubLObject)module0224.$ic26$, (SubLObject)module0224.UNPROVIDED);
        if (module0224.NIL == var48) {
            var48 = module0034.f1807(module0034.f1842(var47), (SubLObject)module0224.$ic26$, (SubLObject)module0224.TWO_INTEGER, (SubLObject)module0224.NIL, (SubLObject)module0224.EQL, (SubLObject)module0224.UNPROVIDED);
            module0034.f1860(var47, (SubLObject)module0224.$ic26$, var48);
        }
        final SubLObject var49 = module0034.f1782(var45, var42);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)module0224.UNPROVIDED);
        if (var50 != module0224.$ic27$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)module0224.NIL;
            var52 = var51.first();
            while (module0224.NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var45.eql(var53.first())) {
                    var53 = var53.rest();
                    if (module0224.NIL != var53 && module0224.NIL == var53.rest() && var42.eql(var53.first())) {
                        return module0034.f1959(var54);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        final SubLObject var55 = Values.arg2(var46.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14715(var45, var42)));
        module0034.f1836(var48, var49, var50, var55, (SubLObject)ConsesLow.list(var45, var42));
        return module0034.f1959(var55);
    }
    
    public static SubLObject f14700() {
        return Numbers.truncate(Numbers.expt(module0048.$g978$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)module0224.TWO_INTEGER, (SubLObject)module0224.THREE_INTEGER), Numbers.log(module0549.f33906(module0224.$ic0$), (SubLObject)module0224.UNPROVIDED))), (SubLObject)module0224.UNPROVIDED);
    }
    
    public static SubLObject f14701() {
        return Numbers.truncate(Numbers.expt(module0048.$g978$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)module0224.ONE_INTEGER, (SubLObject)module0224.THREE_INTEGER), Numbers.log(module0549.f33906(module0224.$ic0$), (SubLObject)module0224.UNPROVIDED))), (SubLObject)module0224.UNPROVIDED);
    }
    
    public static SubLObject f14716() {
        final SubLObject var58 = module0224.$g2407$.getGlobalValue();
        if (module0224.NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)module0224.NIL;
    }
    
    public static SubLObject f14717() {
        return module0034.f1829(module0224.$g2407$.getGlobalValue(), (SubLObject)ConsesLow.list(module0224.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED);
    }
    
    public static SubLObject f14718() {
        return f14700();
    }
    
    public static SubLObject f14719() {
        SubLObject var59 = module0224.$g2407$.getGlobalValue();
        if (module0224.NIL == var59) {
            var59 = module0034.f1934((SubLObject)module0224.$ic28$, (SubLObject)module0224.$ic29$, (SubLObject)module0224.NIL, (SubLObject)module0224.EQL, (SubLObject)module0224.ZERO_INTEGER, (SubLObject)module0224.ZERO_INTEGER);
        }
        SubLObject var60 = module0034.f1810(var59, (SubLObject)module0224.UNPROVIDED);
        if (var60 == module0224.$ic27$) {
            var60 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14718()));
            module0034.f1812(var59, var60, (SubLObject)module0224.UNPROVIDED);
        }
        return module0034.f1959(var60);
    }
    
    public static SubLObject f14720() {
        final SubLObject var58 = module0224.$g2408$.getGlobalValue();
        if (module0224.NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)module0224.NIL;
    }
    
    public static SubLObject f14721() {
        return module0034.f1829(module0224.$g2408$.getGlobalValue(), (SubLObject)ConsesLow.list(module0224.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0224.UNPROVIDED, (SubLObject)module0224.UNPROVIDED);
    }
    
    public static SubLObject f14722() {
        return f14701();
    }
    
    public static SubLObject f14723() {
        SubLObject var59 = module0224.$g2408$.getGlobalValue();
        if (module0224.NIL == var59) {
            var59 = module0034.f1934((SubLObject)module0224.$ic30$, (SubLObject)module0224.$ic31$, (SubLObject)module0224.NIL, (SubLObject)module0224.EQL, (SubLObject)module0224.ZERO_INTEGER, (SubLObject)module0224.ZERO_INTEGER);
        }
        SubLObject var60 = module0034.f1810(var59, (SubLObject)module0224.UNPROVIDED);
        if (var60 == module0224.$ic27$) {
            var60 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14722()));
            module0034.f1812(var59, var60, (SubLObject)module0224.UNPROVIDED);
        }
        return module0034.f1959(var60);
    }
    
    public static SubLObject f14724(final SubLObject var61) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0224.NIL != module0173.f10955(var61) && module0224.NIL != module0269.f17710(var61) && module0549.f33906(var61).numG(f14719()));
    }
    
    public static SubLObject f14725(final SubLObject var61) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0224.NIL != module0173.f10955(var61) && module0224.NIL != module0269.f17710(var61) && module0549.f33906(var61).numLE(f14719()) && module0549.f33906(var61).numG(f14723()));
    }
    
    public static SubLObject f14726(final SubLObject var61) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0224.NIL != module0173.f10955(var61) && module0224.NIL != module0269.f17710(var61) && module0549.f33906(var61).numLE(f14723()));
    }
    
    public static SubLObject f14727(final SubLObject var32) {
        SubLObject var33 = (SubLObject)module0224.NIL;
        SubLObject var34 = (SubLObject)module0224.NIL;
        SubLObject var35 = (SubLObject)module0224.NIL;
        SubLObject var36 = (SubLObject)module0224.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)module0224.$ic32$);
        var33 = var32.first();
        SubLObject var37 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)module0224.$ic32$);
        var34 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)module0224.$ic32$);
        var35 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)module0224.$ic32$);
        var36 = var37.first();
        var37 = var37.rest();
        if (module0224.NIL == var37) {
            return module0217.f14221(var34, var35, var36, (SubLObject)module0224.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0224.$ic32$);
        return (SubLObject)module0224.NIL;
    }
    
    public static SubLObject f14728(final SubLObject var31) {
        return module0048.f3385(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0224.$ic33$), var31));
    }
    
    public static SubLObject f14729(final SubLObject var34) {
        return module0048.f3385(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0224.$ic34$), var34));
    }
    
    public static SubLObject f14730(final SubLObject var36, final SubLObject var39) {
        if (module0224.NIL == var39) {
            return Values.values(conses_high.copy_list(var36), (SubLObject)module0224.NIL);
        }
        SubLObject var40 = (SubLObject)module0224.NIL;
        SubLObject var41 = (SubLObject)module0224.NIL;
        SubLObject var42 = var36;
        SubLObject var43 = (SubLObject)module0224.NIL;
        var43 = var42.first();
        while (module0224.NIL != var42) {
            if (module0224.NIL != f14712(var39, var43)) {
                var40 = (SubLObject)ConsesLow.cons(var43, var40);
            }
            else {
                var41 = (SubLObject)ConsesLow.cons(var43, var41);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return Values.values(Sequences.nreverse(var40), Sequences.nreverse(var41));
    }
    
    public static SubLObject f14712(final SubLObject var39, final SubLObject var45) {
        if (module0224.NIL == var39) {
            return (SubLObject)module0224.T;
        }
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)module0224.$ic35$, var39);
        final SubLObject var47 = (SubLObject)((module0224.NIL != var46) ? conses_high.cadr(var46) : module0224.NIL);
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)module0224.$ic36$, var39);
        final SubLObject var49 = (SubLObject)((module0224.NIL != var48) ? conses_high.cadr(var48) : module0224.NIL);
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)module0224.$ic37$, var39);
        final SubLObject var51 = (SubLObject)((module0224.NIL != var50) ? conses_high.cadr(var50) : module0224.NIL);
        final SubLObject var52 = cdestructuring_bind.property_list_member((SubLObject)module0224.$ic38$, var39);
        final SubLObject var53 = (SubLObject)((module0224.NIL != var52) ? conses_high.cadr(var52) : module0224.NIL);
        if (module0224.NIL != module0035.f2169(var45, var47)) {
            return (SubLObject)module0224.T;
        }
        if (module0224.NIL != module0035.f2169(var45, var51)) {
            return (SubLObject)module0224.NIL;
        }
        SubLObject var54 = var49;
        SubLObject var55 = (SubLObject)module0224.NIL;
        var55 = var54.first();
        while (module0224.NIL != var54) {
            if (module0224.NIL != module0259.f16891(var45, var55) || module0224.NIL != module0259.f16976(var45, var55)) {
                return (SubLObject)module0224.T;
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        var54 = var53;
        var55 = (SubLObject)module0224.NIL;
        var55 = var54.first();
        while (module0224.NIL != var54) {
            if (module0224.NIL != module0259.f16891(var45, var55) || module0224.NIL != module0259.f16976(var45, var55)) {
                return (SubLObject)module0224.NIL;
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)module0224.T;
    }
    
    public static SubLObject f14705(final SubLObject var1, SubLObject var31, SubLObject var10) {
        if (var10 == module0224.UNPROVIDED) {
            var10 = (SubLObject)module0224.$ic5$;
        }
        final SubLObject var32 = var10;
        if (var32.eql((SubLObject)module0224.$ic5$)) {
            var31 = module0213.f13926(var31, (SubLObject)module0224.NIL, (SubLObject)module0224.T, (SubLObject)module0224.T, (SubLObject)module0224.T, Symbols.symbol_function((SubLObject)module0224.$ic14$), (SubLObject)module0224.UNPROVIDED);
            var31 = Sort.stable_sort(var31, (SubLObject)module0224.$ic39$, Symbols.symbol_function((SubLObject)module0224.$ic14$));
            var31 = module0035.f2386(var31, (SubLObject)module0224.$ic40$, Symbols.symbol_function((SubLObject)module0224.EQL), Symbols.symbol_function((SubLObject)module0224.$ic11$));
            var31 = Sort.stable_sort(var31, (SubLObject)module0224.$ic41$, Symbols.symbol_function((SubLObject)module0224.$ic42$));
            var31 = f14731(var1, var31);
        }
        else if (var32.eql((SubLObject)module0224.$ic13$)) {
            var31 = Sort.stable_sort(var31, (SubLObject)module0224.$ic41$, Symbols.symbol_function((SubLObject)module0224.$ic42$));
            var31 = f14731(var1, var31);
            var31 = module0213.f13926(var31, (SubLObject)module0224.NIL, (SubLObject)module0224.T, (SubLObject)module0224.T, (SubLObject)module0224.T, Symbols.symbol_function((SubLObject)module0224.$ic14$), (SubLObject)module0224.UNPROVIDED);
            var31 = Sort.stable_sort(var31, (SubLObject)module0224.$ic39$, Symbols.symbol_function((SubLObject)module0224.$ic14$));
            var31 = module0035.f2386(var31, (SubLObject)module0224.$ic40$, Symbols.symbol_function((SubLObject)module0224.EQL), Symbols.symbol_function((SubLObject)module0224.$ic11$));
        }
        else {
            Errors.error((SubLObject)module0224.$ic43$, var10);
        }
        return var31;
    }
    
    public static SubLObject f14731(final SubLObject var1, final SubLObject var31) {
        return module0656.f39826(var1, var31, Symbols.symbol_function((SubLObject)module0224.$ic12$));
    }
    
    public static SubLObject f14707(final SubLObject var1, final SubLObject var12, final SubLObject var10) {
        SubLObject var13 = (SubLObject)module0224.NIL;
        if (var10.eql((SubLObject)module0224.$ic13$)) {
            SubLObject var14 = (SubLObject)module0224.$ic44$;
            SubLObject var15 = (SubLObject)module0224.NIL;
            SubLObject var16 = var12;
            SubLObject var17 = (SubLObject)module0224.NIL;
            var17 = var16.first();
            while (module0224.NIL != var16) {
                final SubLObject var18 = conses_high.second(var17);
                if (!var18.equal(var14)) {
                    var14 = var18;
                    if (module0224.NIL != var15) {
                        var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var15), var13);
                        var15 = (SubLObject)module0224.NIL;
                    }
                }
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
                var16 = var16.rest();
                var17 = var16.first();
            }
            if (module0224.NIL != var15) {
                var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var15), var13);
            }
        }
        else if (var10.eql((SubLObject)module0224.$ic5$)) {
            SubLObject var19 = (SubLObject)module0224.$ic44$;
            SubLObject var20 = (SubLObject)module0224.$ic44$;
            SubLObject var21 = (SubLObject)module0224.NIL;
            SubLObject var22 = var12;
            SubLObject var23 = (SubLObject)module0224.NIL;
            var23 = var22.first();
            while (module0224.NIL != var22) {
                final SubLObject var24 = conses_high.third(var23);
                final SubLObject var25 = conses_high.fourth(var23);
                if (!var24.equal(var19) || !var25.equal(var20)) {
                    var19 = var24;
                    var20 = var25;
                    if (module0224.NIL != var21) {
                        var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var21), var13);
                        var21 = (SubLObject)module0224.NIL;
                    }
                }
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
                var22 = var22.rest();
                var23 = var22.first();
            }
            if (module0224.NIL != var21) {
                var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var21), var13);
            }
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f14732() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14699", "S#17478", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14702", "S#17479", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14703", "S#17480", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14706", "S#17481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14708", "S#17482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14704", "S#17483", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14709", "S#17484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14710", "S#17485", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14711", "S#17486", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14714", "S#17487", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14715", "S#17488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14713", "S#17489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14700", "S#17490", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14701", "S#17491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14716", "S#17492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14717", "S#17493", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14718", "S#17494", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14719", "S#17495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14720", "S#17496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14721", "S#17497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14722", "S#17498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14723", "S#17499", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14724", "S#17500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14725", "S#17501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14726", "S#17502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14727", "S#17503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14728", "S#17504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14729", "S#17505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14730", "S#17506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14712", "S#17507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14705", "S#17508", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14731", "S#17509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0224", "f14707", "S#17510", 3, 0, false);
        return (SubLObject)module0224.NIL;
    }
    
    public static SubLObject f14733() {
        module0224.$g2407$ = SubLFiles.deflexical("S#17511", (SubLObject)module0224.NIL);
        module0224.$g2408$ = SubLFiles.deflexical("S#17512", (SubLObject)module0224.NIL);
        return (SubLObject)module0224.NIL;
    }
    
    public static SubLObject f14734() {
        module0034.f1895((SubLObject)module0224.$ic26$);
        module0034.f1909((SubLObject)module0224.$ic28$);
        module0034.f1909((SubLObject)module0224.$ic30$);
        return (SubLObject)module0224.NIL;
    }
    
    public void declareFunctions() {
        f14732();
    }
    
    public void initializeVariables() {
        f14733();
    }
    
    public void runTopLevelForms() {
        f14734();
    }
    
    static {
        me = (SubLFile)new module0224();
        module0224.$g2407$ = null;
        module0224.$g2408$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic1$ = SubLObjectFactory.makeKeyword("SELF");
        $ic2$ = SubLObjectFactory.makeKeyword("MIDDLE");
        $ic3$ = SubLObjectFactory.makeKeyword("LOWER");
        $ic4$ = SubLObjectFactory.makeKeyword("ASCENDING");
        $ic5$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic6$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic7$ = SubLObjectFactory.makeKeyword("ONTOLOGY-HORIZON");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic11$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic12$ = SubLObjectFactory.makeSymbol("FOURTH");
        $ic13$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic14$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic15$ = SubLObjectFactory.makeString("Unexpected inheritance pred ~S");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $ic18$ = SubLObjectFactory.makeKeyword("QUERY-ISA");
        $ic19$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceAll"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#17489", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic28$ = SubLObjectFactory.makeSymbol("S#17495", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#17511", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#17499", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#17512", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17513", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17514", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#17503", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#17504", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("ALLOW-PREDICATES");
        $ic36$ = SubLObjectFactory.makeKeyword("ALLOW-PREDICATE-TYPES");
        $ic37$ = SubLObjectFactory.makeKeyword("FORBID-PREDICATES");
        $ic38$ = SubLObjectFactory.makeKeyword("FORBID-PREDICATE-TYPES");
        $ic39$ = SubLObjectFactory.makeSymbol("S#17515", "CYC");
        $ic40$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals")));
        $ic41$ = SubLObjectFactory.makeSymbol("<");
        $ic42$ = SubLObjectFactory.makeSymbol("THIRD");
        $ic43$ = SubLObjectFactory.makeString("Unexpected order-by : ~S");
        $ic44$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0224.class
	Total time: 261 ms
	
	Decompiled with Procyon 0.5.32.
*/