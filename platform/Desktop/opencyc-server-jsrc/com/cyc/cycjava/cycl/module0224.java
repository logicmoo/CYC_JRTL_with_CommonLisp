package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        if (NIL == var2) {
            var2 = $ic0$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)$ic1$)) {
            return (SubLObject)ConsesLow.list(var1);
        }
        if (var3.eql((SubLObject)$ic2$)) {
            var2 = f14700();
        }
        else if (var3.eql((SubLObject)$ic3$)) {
            var2 = f14701();
        }
        SubLObject var4 = (NIL != module0269.f17714(var1)) ? module0256.f16546(var1) : module0259.f16842(var1);
        if (!var2.eql($ic0$)) {
            if (!var2.isNumber()) {
                var2 = module0549.f33906(var2);
            }
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = var4;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = module0549.f33906(var7);
                if (!var8.numG(var2)) {
                    var5 = (SubLObject)ConsesLow.cons(var7, var5);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            var4 = var5;
        }
        var4 = module0549.f33908(var4, (SubLObject)$ic4$);
        return var4;
    }
    
    public static SubLObject f14702(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        final SubLObject var3 = f14699(var1, var2);
        return module0052.f3709(conses_high.adjoin(var1, var3, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14703(final SubLObject var1, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)$ic5$;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var14;
        final SubLObject var13 = var14 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0034.$g879$.currentBinding(var11);
        try {
            module0034.$g879$.bind(var14, var11);
            SubLObject var16 = (SubLObject)NIL;
            if (NIL != var14 && NIL == module0034.f1842(var14)) {
                var16 = module0034.f1869(var14);
                final SubLObject var17 = Threads.current_process();
                if (NIL == var16) {
                    module0034.f1873(var14, var17);
                }
                else if (!var16.eql(var17)) {
                    Errors.error((SubLObject)$ic6$);
                }
            }
            try {
                SubLObject var18 = module0139.f9019((SubLObject)TWO_INTEGER);
                final SubLObject var15_19 = module0139.$g1632$.currentBinding(var11);
                final SubLObject var19 = module0139.$g1630$.currentBinding(var11);
                final SubLObject var20 = module0139.$g1631$.currentBinding(var11);
                try {
                    module0139.$g1632$.bind(var18, var11);
                    module0139.$g1630$.bind((SubLObject)T, var11);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var11)), var11);
                    final SubLObject var22;
                    final SubLObject var21 = var22 = var9;
                    final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var22);
                    final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
                    final SubLObject var25 = (NIL != module0269.f17714(var1)) ? $ic8$ : $ic9$;
                    final SubLObject var26 = f14702(var1, var24);
                    SubLObject var29;
                    for (SubLObject var27 = (SubLObject)NIL; NIL == var27; var27 = (SubLObject)makeBoolean(NIL == var29)) {
                        var11.resetMultipleValues();
                        final SubLObject var28 = module0052.f3693(var26);
                        var29 = var11.secondMultipleValue();
                        var11.resetMultipleValues();
                        if (NIL != var29) {
                            final SubLObject var30 = var28.equal(var1) ? $ic10$ : var25;
                            SubLObject var32;
                            final SubLObject var31 = var32 = f14704(var1, var30, var28, var9);
                            SubLObject var33 = (SubLObject)NIL;
                            var33 = var32.first();
                            while (NIL != var32) {
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                    if (NIL != var14 && NIL == var16) {
                        module0034.f1873(var14, (SubLObject)NIL);
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
        final SubLObject var2 = f14703(var1, (SubLObject)NIL, (SubLObject)$ic5$);
        final SubLObject var3 = f14707(var1, var2, (SubLObject)$ic5$);
        final SubLObject var4 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic11$), var3);
        SubLObject var5 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic12$), var4);
        var5 = module0035.f2288(var5, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f14708(final SubLObject var1) {
        final SubLObject var2 = f14703(var1, (SubLObject)NIL, (SubLObject)$ic13$);
        final SubLObject var3 = f14707(var1, var2, (SubLObject)$ic13$);
        final SubLObject var4 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic11$), var3);
        SubLObject var5 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic14$), var4);
        var5 = module0035.f2288(var5, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f14704(final SubLObject var1, final SubLObject var30, final SubLObject var38, final SubLObject var39) {
        if (var30.eql($ic10$)) {
            return f14709(var1, var39);
        }
        if (var30.eql($ic9$)) {
            return f14710(var1, var38, var39);
        }
        if (var30.eql($ic8$)) {
            return f14711(var1, var38, var39);
        }
        return Errors.error((SubLObject)$ic15$, var30);
    }
    
    public static SubLObject f14709(final SubLObject var1, final SubLObject var39) {
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = module0217.f14228(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var1) && NIL != module0269.f17705(var1)) {
            final SubLObject var42 = (SubLObject)TWO_INTEGER;
            if (NIL == conses_high.member(var42, var41, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var41 = (SubLObject)ConsesLow.cons(var42, var41);
            }
        }
        SubLObject var43 = var41;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            SubLObject var45 = module0217.f14228(var1, var44, (SubLObject)UNPROVIDED);
            if (NIL != module0173.f10955(var1) && NIL != module0269.f17705(var1) && var44.numE((SubLObject)TWO_INTEGER)) {
                if (module0549.f33895(var1).isPositive()) {
                    final SubLObject var46 = $ic9$;
                    if (NIL == conses_high.member(var46, var45, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var45 = (SubLObject)ConsesLow.cons(var46, var45);
                    }
                }
                if (module0549.f33897(var1).isPositive()) {
                    final SubLObject var46 = $ic16$;
                    if (NIL == conses_high.member(var46, var45, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var45 = (SubLObject)ConsesLow.cons(var46, var45);
                    }
                }
            }
            SubLObject var6_44 = var45;
            SubLObject var47 = (SubLObject)NIL;
            var47 = var6_44.first();
            while (NIL != var6_44) {
                if (NIL != f14712(var39, var47)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic10$, var1, var44, var47), var40);
                }
                var6_44 = var6_44.rest();
                var47 = var6_44.first();
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return f14705(var1, var40, (SubLObject)$ic5$);
    }
    
    public static SubLObject f14710(final SubLObject var1, final SubLObject var38, final SubLObject var39) {
        SubLObject var40 = (SubLObject)NIL;
        if (module0217.f14221(var38, (SubLObject)TWO_INTEGER, $ic17$, (SubLObject)UNPROVIDED).isPositive()) {
            if (NIL != f14712(var39, $ic17$)) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic9$, var38, (SubLObject)TWO_INTEGER, $ic17$), var40);
            }
            SubLObject var41 = module0219.f14509(var38, (SubLObject)TWO_INTEGER, $ic17$, (SubLObject)NIL, (SubLObject)$ic19$);
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                final SubLObject var43 = module0178.f11334(var42);
                if (NIL != f14712(var39, var43)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic18$, var38, (SubLObject)ONE_INTEGER, var43), var40);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        if (module0217.f14221(var38, (SubLObject)THREE_INTEGER, $ic20$, (SubLObject)UNPROVIDED).isPositive()) {
            if (NIL != f14712(var39, $ic20$)) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic9$, var38, (SubLObject)THREE_INTEGER, $ic20$), var40);
            }
            SubLObject var41 = module0219.f14509(var38, (SubLObject)THREE_INTEGER, $ic20$, (SubLObject)NIL, (SubLObject)$ic19$);
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                final SubLObject var43 = module0178.f11334(var42);
                if (NIL != f14712(var39, var43)) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic18$, var38, (SubLObject)TWO_INTEGER, var43), var40);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        if (module0217.f14221(var38, (SubLObject)TWO_INTEGER, $ic21$, (SubLObject)UNPROVIDED).isPositive() && NIL != f14712(var39, $ic21$)) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic9$, var38, (SubLObject)TWO_INTEGER, $ic21$), var40);
        }
        if (module0217.f14221(var38, (SubLObject)THREE_INTEGER, $ic22$, (SubLObject)UNPROVIDED).isPositive() && NIL != f14712(var39, $ic22$)) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic9$, var38, (SubLObject)THREE_INTEGER, $ic22$), var40);
        }
        return f14705(var1, var40, (SubLObject)$ic5$);
    }
    
    public static SubLObject f14711(final SubLObject var1, final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)NIL;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var40);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var40);
        try {
            module0147.$g2094$.bind((SubLObject)$ic23$, var40);
            module0147.$g2095$.bind($ic24$, var40);
            SubLObject var44 = module0217.f14228(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var45 = (SubLObject)NIL;
            var45 = var44.first();
            while (NIL != var44) {
                SubLObject var6_47;
                final SubLObject var46 = var6_47 = module0217.f14228(var38, var45, (SubLObject)UNPROVIDED);
                SubLObject var47 = (SubLObject)NIL;
                var47 = var6_47.first();
                while (NIL != var6_47) {
                    if (!var47.eql($ic8$) && NIL != module0222.f14635($ic25$, var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f14712(var39, var47) && NIL != f14713(var47, var45)) {
                        var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic8$, var38, var45, var47), var41);
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
        return f14705(var1, var41, (SubLObject)$ic5$);
    }
    
    public static SubLObject f14714(final SubLObject var45, final SubLObject var42, SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0222.f14635($ic25$, var45, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0220.f14587((SubLObject)ConsesLow.list($ic25$, var45, $ic8$, var42), var48, (SubLObject)ONE_INTEGER, (SubLObject)$ic19$));
    }
    
    public static SubLObject f14715(final SubLObject var45, final SubLObject var42) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = module0147.$g2094$.currentBinding(var46);
        final SubLObject var49 = module0147.$g2095$.currentBinding(var46);
        try {
            module0147.$g2094$.bind((SubLObject)$ic23$, var46);
            module0147.$g2095$.bind($ic24$, var46);
            var47 = f14714(var45, var42, (SubLObject)UNPROVIDED);
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
        SubLObject var48 = (SubLObject)NIL;
        if (NIL == var47) {
            return f14715(var45, var42);
        }
        var48 = module0034.f1857(var47, (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
        if (NIL == var48) {
            var48 = module0034.f1807(module0034.f1842(var47), (SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var47, (SubLObject)$ic26$, var48);
        }
        final SubLObject var49 = module0034.f1782(var45, var42);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)UNPROVIDED);
        if (var50 != $ic27$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var45.eql(var53.first())) {
                    var53 = var53.rest();
                    if (NIL != var53 && NIL == var53.rest() && var42.eql(var53.first())) {
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
        return Numbers.truncate(Numbers.expt(module0048.$g978$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER), Numbers.log(module0549.f33906($ic0$), (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14701() {
        return Numbers.truncate(Numbers.expt(module0048.$g978$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER), Numbers.log(module0549.f33906($ic0$), (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14716() {
        final SubLObject var58 = $g2407$.getGlobalValue();
        if (NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14717() {
        return module0034.f1829($g2407$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14718() {
        return f14700();
    }
    
    public static SubLObject f14719() {
        SubLObject var59 = $g2407$.getGlobalValue();
        if (NIL == var59) {
            var59 = module0034.f1934((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var60 = module0034.f1810(var59, (SubLObject)UNPROVIDED);
        if (var60 == $ic27$) {
            var60 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14718()));
            module0034.f1812(var59, var60, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var60);
    }
    
    public static SubLObject f14720() {
        final SubLObject var58 = $g2408$.getGlobalValue();
        if (NIL != var58) {
            module0034.f1818(var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14721() {
        return module0034.f1829($g2408$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14722() {
        return f14701();
    }
    
    public static SubLObject f14723() {
        SubLObject var59 = $g2408$.getGlobalValue();
        if (NIL == var59) {
            var59 = module0034.f1934((SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var60 = module0034.f1810(var59, (SubLObject)UNPROVIDED);
        if (var60 == $ic27$) {
            var60 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14722()));
            module0034.f1812(var59, var60, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var60);
    }
    
    public static SubLObject f14724(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var61) && NIL != module0269.f17710(var61) && module0549.f33906(var61).numG(f14719()));
    }
    
    public static SubLObject f14725(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var61) && NIL != module0269.f17710(var61) && module0549.f33906(var61).numLE(f14719()) && module0549.f33906(var61).numG(f14723()));
    }
    
    public static SubLObject f14726(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var61) && NIL != module0269.f17710(var61) && module0549.f33906(var61).numLE(f14723()));
    }
    
    public static SubLObject f14727(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic32$);
        var33 = var32.first();
        SubLObject var37 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)$ic32$);
        var34 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)$ic32$);
        var35 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var32, (SubLObject)$ic32$);
        var36 = var37.first();
        var37 = var37.rest();
        if (NIL == var37) {
            return module0217.f14221(var34, var35, var36, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14728(final SubLObject var31) {
        return module0048.f3385(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic33$), var31));
    }
    
    public static SubLObject f14729(final SubLObject var34) {
        return module0048.f3385(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic34$), var34));
    }
    
    public static SubLObject f14730(final SubLObject var36, final SubLObject var39) {
        if (NIL == var39) {
            return Values.values(conses_high.copy_list(var36), (SubLObject)NIL);
        }
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = var36;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            if (NIL != f14712(var39, var43)) {
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
        if (NIL == var39) {
            return (SubLObject)T;
        }
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var39);
        final SubLObject var47 = (SubLObject)((NIL != var46) ? conses_high.cadr(var46) : NIL);
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var39);
        final SubLObject var49 = (SubLObject)((NIL != var48) ? conses_high.cadr(var48) : NIL);
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var39);
        final SubLObject var51 = (SubLObject)((NIL != var50) ? conses_high.cadr(var50) : NIL);
        final SubLObject var52 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var39);
        final SubLObject var53 = (SubLObject)((NIL != var52) ? conses_high.cadr(var52) : NIL);
        if (NIL != module0035.f2169(var45, var47)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f2169(var45, var51)) {
            return (SubLObject)NIL;
        }
        SubLObject var54 = var49;
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            if (NIL != module0259.f16891(var45, var55) || NIL != module0259.f16976(var45, var55)) {
                return (SubLObject)T;
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        var54 = var53;
        var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            if (NIL != module0259.f16891(var45, var55) || NIL != module0259.f16976(var45, var55)) {
                return (SubLObject)NIL;
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f14705(final SubLObject var1, SubLObject var31, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)$ic5$;
        }
        final SubLObject var32 = var10;
        if (var32.eql((SubLObject)$ic5$)) {
            var31 = module0213.f13926(var31, (SubLObject)NIL, (SubLObject)T, (SubLObject)T, (SubLObject)T, Symbols.symbol_function((SubLObject)$ic14$), (SubLObject)UNPROVIDED);
            var31 = Sort.stable_sort(var31, (SubLObject)$ic39$, Symbols.symbol_function((SubLObject)$ic14$));
            var31 = module0035.f2386(var31, (SubLObject)$ic40$, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$));
            var31 = Sort.stable_sort(var31, (SubLObject)$ic41$, Symbols.symbol_function((SubLObject)$ic42$));
            var31 = f14731(var1, var31);
        }
        else if (var32.eql((SubLObject)$ic13$)) {
            var31 = Sort.stable_sort(var31, (SubLObject)$ic41$, Symbols.symbol_function((SubLObject)$ic42$));
            var31 = f14731(var1, var31);
            var31 = module0213.f13926(var31, (SubLObject)NIL, (SubLObject)T, (SubLObject)T, (SubLObject)T, Symbols.symbol_function((SubLObject)$ic14$), (SubLObject)UNPROVIDED);
            var31 = Sort.stable_sort(var31, (SubLObject)$ic39$, Symbols.symbol_function((SubLObject)$ic14$));
            var31 = module0035.f2386(var31, (SubLObject)$ic40$, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$));
        }
        else {
            Errors.error((SubLObject)$ic43$, var10);
        }
        return var31;
    }
    
    public static SubLObject f14731(final SubLObject var1, final SubLObject var31) {
        return module0656.f39826(var1, var31, Symbols.symbol_function((SubLObject)$ic12$));
    }
    
    public static SubLObject f14707(final SubLObject var1, final SubLObject var12, final SubLObject var10) {
        SubLObject var13 = (SubLObject)NIL;
        if (var10.eql((SubLObject)$ic13$)) {
            SubLObject var14 = (SubLObject)$ic44$;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = var12;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                final SubLObject var18 = conses_high.second(var17);
                if (!var18.equal(var14)) {
                    var14 = var18;
                    if (NIL != var15) {
                        var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var15), var13);
                        var15 = (SubLObject)NIL;
                    }
                }
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
                var16 = var16.rest();
                var17 = var16.first();
            }
            if (NIL != var15) {
                var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var15), var13);
            }
        }
        else if (var10.eql((SubLObject)$ic5$)) {
            SubLObject var19 = (SubLObject)$ic44$;
            SubLObject var20 = (SubLObject)$ic44$;
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = var12;
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                final SubLObject var24 = conses_high.third(var23);
                final SubLObject var25 = conses_high.fourth(var23);
                if (!var24.equal(var19) || !var25.equal(var20)) {
                    var19 = var24;
                    var20 = var25;
                    if (NIL != var21) {
                        var13 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var21), var13);
                        var21 = (SubLObject)NIL;
                    }
                }
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
                var22 = var22.rest();
                var23 = var22.first();
            }
            if (NIL != var21) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14733() {
        $g2407$ = SubLFiles.deflexical("S#17511", (SubLObject)NIL);
        $g2408$ = SubLFiles.deflexical("S#17512", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14734() {
        module0034.f1895((SubLObject)$ic26$);
        module0034.f1909((SubLObject)$ic28$);
        module0034.f1909((SubLObject)$ic30$);
        return (SubLObject)NIL;
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
        $g2407$ = null;
        $g2408$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic1$ = makeKeyword("SELF");
        $ic2$ = makeKeyword("MIDDLE");
        $ic3$ = makeKeyword("LOWER");
        $ic4$ = makeKeyword("ASCENDING");
        $ic5$ = makeKeyword("PREDICATE");
        $ic6$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic7$ = makeKeyword("ONTOLOGY-HORIZON");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic11$ = makeSymbol("FIRST");
        $ic12$ = makeSymbol("FOURTH");
        $ic13$ = makeKeyword("ONTOLOGY");
        $ic14$ = makeSymbol("SECOND");
        $ic15$ = makeString("Unexpected inheritance pred ~S");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic18$ = makeKeyword("QUERY-ISA");
        $ic19$ = makeKeyword("TRUE");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll"));
        $ic23$ = makeSymbol("S#12274", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse"));
        $ic26$ = makeSymbol("S#17489", "CYC");
        $ic27$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic28$ = makeSymbol("S#17495", "CYC");
        $ic29$ = makeSymbol("S#17511", "CYC");
        $ic30$ = makeSymbol("S#17499", "CYC");
        $ic31$ = makeSymbol("S#17512", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#17513", "CYC"), (SubLObject)makeSymbol("S#17514", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic33$ = makeSymbol("S#17503", "CYC");
        $ic34$ = makeSymbol("S#17504", "CYC");
        $ic35$ = makeKeyword("ALLOW-PREDICATES");
        $ic36$ = makeKeyword("ALLOW-PREDICATE-TYPES");
        $ic37$ = makeKeyword("FORBID-PREDICATES");
        $ic38$ = makeKeyword("FORBID-PREDICATE-TYPES");
        $ic39$ = makeSymbol("S#17515", "CYC");
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")));
        $ic41$ = makeSymbol("<");
        $ic42$ = makeSymbol("THIRD");
        $ic43$ = makeString("Unexpected order-by : ~S");
        $ic44$ = makeKeyword("UNINITIALIZED");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 261 ms
	
	Decompiled with Procyon 0.5.32.
*/