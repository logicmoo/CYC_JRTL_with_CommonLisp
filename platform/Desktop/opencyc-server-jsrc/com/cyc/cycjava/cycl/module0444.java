package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0444 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0444";
    public static final String myFingerPrint = "2b509e8e853db926767f6557d255411fa42b69ab0c3a55b12c601d2defe7fa72";
    private static SubLSymbol $g3550$;
    private static SubLSymbol $g3551$;
    public static SubLSymbol $g3552$;
    private static SubLSymbol $g3553$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLFloat $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    
    public static SubLObject f30793(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14548(var1, $ic0$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30794(final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var3)) {
            return module0220.f14548(var3, $ic0$, var2, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30795(final SubLObject var1) {
        return module0217.f14223(var1, (SubLObject)ONE_INTEGER, $ic0$);
    }
    
    public static SubLObject f30796() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return Numbers.integerDivide(module0018.$g664$.getDynamicValue(var4), $g3550$.getDynamicValue(var4));
    }
    
    public static SubLObject f30797(final SubLObject var5) {
        final SubLObject var6 = module0205.f13333(var5);
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var6) && NIL != f30793(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f30798() {
        return module0191.f11990((SubLObject)$ic4$, $g3551$.getGlobalValue(), $g3552$.getGlobalValue(), (SubLObject)$ic5$);
    }
    
    public static SubLObject f30799(final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return f30797(var5);
    }
    
    public static SubLObject f30800(final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = module0205.f13333(var5);
        final SubLObject var8 = module0205.f13387(var5, (SubLObject)UNPROVIDED);
        final SubLObject var9 = f30795(var7);
        final SubLObject var10 = f30796();
        if (var9.numLE(var10)) {
            final SubLObject var11 = $ic0$;
            if (NIL != module0158.f10010(var7, (SubLObject)ONE_INTEGER, var11)) {
                final SubLObject var12 = module0158.f10011(var7, (SubLObject)ONE_INTEGER, var11);
                SubLObject var13 = (SubLObject)NIL;
                final SubLObject var14 = (SubLObject)NIL;
                while (NIL == var13) {
                    final SubLObject var15 = module0052.f3695(var12, var14);
                    final SubLObject var16 = (SubLObject)makeBoolean(!var14.eql(var15));
                    if (NIL != var16) {
                        SubLObject var17 = (SubLObject)NIL;
                        try {
                            var17 = module0158.f10316(var15, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)NIL);
                            SubLObject var12_17 = (SubLObject)NIL;
                            final SubLObject var13_18 = (SubLObject)NIL;
                            while (NIL == var12_17) {
                                final SubLObject var18 = module0052.f3695(var17, var13_18);
                                final SubLObject var15_20 = (SubLObject)makeBoolean(!var13_18.eql(var18));
                                if (NIL != var15_20) {
                                    f30801(var5, var18);
                                }
                                var12_17 = (SubLObject)makeBoolean(NIL == var15_20);
                            }
                        }
                        finally {
                            final SubLObject var19 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var17) {
                                    module0158.f10319(var17);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var19);
                            }
                        }
                    }
                    var13 = (SubLObject)makeBoolean(NIL == var16);
                }
            }
        }
        else {
            SubLObject var21;
            final SubLObject var20 = var21 = module0259.f16840(var8, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (NIL != f30794(var22, (SubLObject)NIL)) {
                    final SubLObject var23 = $ic0$;
                    if (NIL != module0158.f10010(var22, (SubLObject)TWO_INTEGER, var23)) {
                        final SubLObject var24 = module0158.f10011(var22, (SubLObject)TWO_INTEGER, var23);
                        SubLObject var25 = (SubLObject)NIL;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28) {
                                SubLObject var29 = (SubLObject)NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)NIL);
                                    SubLObject var12_18 = (SubLObject)NIL;
                                    final SubLObject var13_19 = (SubLObject)NIL;
                                    while (NIL == var12_18) {
                                        final SubLObject var30 = module0052.f3695(var29, var13_19);
                                        final SubLObject var15_21 = (SubLObject)makeBoolean(!var13_19.eql(var30));
                                        if (NIL != var15_21) {
                                            f30802(var5, var30);
                                        }
                                        var12_18 = (SubLObject)makeBoolean(NIL == var15_21);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var31);
                                    }
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28);
                        }
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30802(final SubLObject var5, final SubLObject var19) {
        final SubLObject var20 = module0205.f13333(var5);
        if (!var20.eql(module0178.f11334(var19))) {
            return (SubLObject)NIL;
        }
        return f30803(var5, var19);
    }
    
    public static SubLObject f30801(final SubLObject var5, final SubLObject var19) {
        final SubLObject var20 = module0205.f13387(var5, (SubLObject)UNPROVIDED);
        if (NIL == module0259.f16854(var20, module0178.f11335(var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30803(var5, var19);
    }
    
    public static SubLObject f30803(final SubLObject var5, final SubLObject var19) {
        if (NIL != module0351.f23568(var19)) {
            final SubLObject var20 = module0205.f13387(var5, (SubLObject)UNPROVIDED);
            final SubLObject var21 = module0178.f11335(var19);
            final SubLObject var22 = f30798();
            final SubLObject var23 = module0191.f11990((SubLObject)$ic11$, (SubLObject)ConsesLow.list($ic12$, var20, var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var24 = (SubLObject)ConsesLow.list(var22, var23);
            module0347.f23330(var19, (SubLObject)NIL, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30804(final SubLObject var1, final SubLObject var30, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var30) : var30;
        return module0220.f14548(var30, var1, var2, (SubLObject)ONE_INTEGER, (SubLObject)$ic8$);
    }
    
    public static SubLObject f30805(final SubLObject var1, final SubLObject var30, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var30) : var30;
        SubLObject var32 = (SubLObject)NIL;
        if (NIL == var32) {
            final SubLObject var33 = (SubLObject)(($ic14$ == $ic15$) ? $ic16$ : $ic17$);
            final SubLObject var34 = module0056.f4145(var33);
            final SubLObject var35 = module0139.$g1635$.currentBinding(var31);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var31);
                final SubLObject var36 = var2;
                final SubLObject var21_36 = module0147.$g2095$.currentBinding(var31);
                final SubLObject var37 = module0147.$g2094$.currentBinding(var31);
                final SubLObject var38 = module0147.$g2096$.currentBinding(var31);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var36), var31);
                    module0147.$g2094$.bind(module0147.f9546(var36), var31);
                    module0147.$g2096$.bind(module0147.f9549(var36), var31);
                    final SubLObject var39 = (SubLObject)NIL;
                    final SubLObject var21_37 = module0141.$g1714$.currentBinding(var31);
                    final SubLObject var37_41 = module0141.$g1715$.currentBinding(var31);
                    try {
                        module0141.$g1714$.bind((NIL != var39) ? var39 : module0141.f9283(), var31);
                        module0141.$g1715$.bind((SubLObject)((NIL != var39) ? $ic18$ : module0141.$g1715$.getDynamicValue(var31)), var31);
                        if (NIL != var39 && NIL != module0136.f8864() && NIL == module0141.f9279(var39)) {
                            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var31);
                            if (var40.eql((SubLObject)$ic19$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic20$, var39, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var40.eql((SubLObject)$ic22$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic23$, (SubLObject)$ic20$, var39, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var40.eql((SubLObject)$ic24$)) {
                                Errors.warn((SubLObject)$ic20$, var39, (SubLObject)$ic21$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic25$, module0136.$g1591$.getDynamicValue(var31));
                                Errors.cerror((SubLObject)$ic23$, (SubLObject)$ic20$, var39, (SubLObject)$ic21$);
                            }
                        }
                        final SubLObject var21_38 = module0141.$g1670$.currentBinding(var31);
                        final SubLObject var37_42 = module0141.$g1671$.currentBinding(var31);
                        final SubLObject var38_45 = module0141.$g1672$.currentBinding(var31);
                        final SubLObject var41 = module0141.$g1674$.currentBinding(var31);
                        final SubLObject var42 = module0137.$g1605$.currentBinding(var31);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic12$), var31);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic12$)), var31);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic12$)), var31);
                            module0141.$g1674$.bind((SubLObject)NIL, var31);
                            module0137.$g1605$.bind(module0137.f8955($ic12$), var31);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var30, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var21_39 = module0141.$g1677$.currentBinding(var31);
                                final SubLObject var37_43 = module0138.$g1619$.currentBinding(var31);
                                final SubLObject var38_46 = module0141.$g1674$.currentBinding(var31);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var31);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var31);
                                    module0141.$g1674$.bind((SubLObject)NIL, var31);
                                    final SubLObject var43 = module0200.f12443(module0137.f8955($ic12$));
                                    SubLObject var44;
                                    SubLObject var45;
                                    SubLObject var21_40;
                                    SubLObject var37_44;
                                    SubLObject var46;
                                    SubLObject var47;
                                    SubLObject var48;
                                    SubLObject var49;
                                    SubLObject var60_61;
                                    SubLObject var50;
                                    SubLObject var21_41;
                                    SubLObject var59_64;
                                    SubLObject var51;
                                    SubLObject var52;
                                    SubLObject var21_42;
                                    SubLObject var53;
                                    SubLObject var54;
                                    SubLObject var55;
                                    SubLObject var56;
                                    SubLObject var57;
                                    SubLObject var58;
                                    SubLObject var59;
                                    SubLObject var60;
                                    SubLObject var52_75;
                                    SubLObject var61;
                                    SubLObject var21_43;
                                    SubLObject var63;
                                    SubLObject var62;
                                    SubLObject var64;
                                    SubLObject var65;
                                    SubLObject var66;
                                    SubLObject var67;
                                    SubLObject var68;
                                    SubLObject var69;
                                    for (var44 = (SubLObject)NIL, var44 = var43; NIL == var32 && NIL != var44; var44 = var44.rest()) {
                                        var45 = var44.first();
                                        var21_40 = module0137.$g1605$.currentBinding(var31);
                                        var37_44 = module0141.$g1674$.currentBinding(var31);
                                        try {
                                            module0137.$g1605$.bind(var45, var31);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var31)) : module0141.$g1674$.getDynamicValue(var31)), var31);
                                            var46 = module0228.f15229(var30);
                                            if (NIL != module0138.f8992(var46)) {
                                                var47 = module0242.f15664(var46, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var47) {
                                                    var48 = module0245.f15834(var47, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var48) {
                                                        for (var49 = module0066.f4838(module0067.f4891(var48)); NIL == var32 && NIL == module0066.f4841(var49); var49 = module0066.f4840(var49)) {
                                                            var31.resetMultipleValues();
                                                            var60_61 = module0066.f4839(var49);
                                                            var50 = var31.secondMultipleValue();
                                                            var31.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var60_61)) {
                                                                var21_41 = module0138.$g1623$.currentBinding(var31);
                                                                try {
                                                                    module0138.$g1623$.bind(var60_61, var31);
                                                                    for (var59_64 = module0066.f4838(module0067.f4891(var50)); NIL == var32 && NIL == module0066.f4841(var59_64); var59_64 = module0066.f4840(var59_64)) {
                                                                        var31.resetMultipleValues();
                                                                        var51 = module0066.f4839(var59_64);
                                                                        var52 = var31.secondMultipleValue();
                                                                        var31.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var51)) {
                                                                            var21_42 = module0138.$g1624$.currentBinding(var31);
                                                                            try {
                                                                                module0138.$g1624$.bind(var51, var31);
                                                                                var53 = var52;
                                                                                if (NIL != module0077.f5302(var53)) {
                                                                                    var54 = module0077.f5333(var53);
                                                                                    for (var55 = module0032.f1741(var54), var56 = (SubLObject)NIL, var56 = module0032.f1742(var55, var54); NIL == var32 && NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                                        var57 = module0032.f1745(var55, var56);
                                                                                        if (NIL != module0032.f1746(var56, var57) && NIL == module0249.f16059(var57, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var57, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var57, var34);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var53.isList()) {
                                                                                    if (NIL == var32) {
                                                                                        var58 = var53;
                                                                                        var59 = (SubLObject)NIL;
                                                                                        var59 = var58.first();
                                                                                        while (NIL == var32 && NIL != var58) {
                                                                                            if (NIL == module0249.f16059(var59, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var59, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var59, var34);
                                                                                            }
                                                                                            var58 = var58.rest();
                                                                                            var59 = var58.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic26$, var53);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var21_42, var31);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var59_64);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var21_41, var31);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var49);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var46, (SubLObject)UNPROVIDED)) {
                                                var60 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)UNPROVIDED)));
                                                for (var52_75 = (SubLObject)NIL, var52_75 = var60; NIL == var32 && NIL != var52_75; var52_75 = var52_75.rest()) {
                                                    var61 = var52_75.first();
                                                    var21_43 = module0138.$g1625$.currentBinding(var31);
                                                    try {
                                                        module0138.$g1625$.bind(var61, var31);
                                                        var62 = (var63 = Functions.funcall(var61, var46));
                                                        if (NIL != module0077.f5302(var63)) {
                                                            var64 = module0077.f5333(var63);
                                                            for (var65 = module0032.f1741(var64), var66 = (SubLObject)NIL, var66 = module0032.f1742(var65, var64); NIL == var32 && NIL == module0032.f1744(var65, var66); var66 = module0032.f1743(var66)) {
                                                                var67 = module0032.f1745(var65, var66);
                                                                if (NIL != module0032.f1746(var66, var67) && NIL == module0249.f16059(var67, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var67, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var67, var34);
                                                                }
                                                            }
                                                        }
                                                        else if (var63.isList()) {
                                                            if (NIL == var32) {
                                                                var68 = var63;
                                                                var69 = (SubLObject)NIL;
                                                                var69 = var68.first();
                                                                while (NIL == var32 && NIL != var68) {
                                                                    if (NIL == module0249.f16059(var69, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var69, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var69, var34);
                                                                    }
                                                                    var68 = var68.rest();
                                                                    var69 = var68.first();
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic26$, var63);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var21_43, var31);
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var37_44, var31);
                                            module0137.$g1605$.rebind(var21_40, var31);
                                        }
                                    }
                                    SubLObject var70 = module0056.f4150(var34);
                                    final SubLObject var21_44 = module0137.$g1605$.currentBinding(var31);
                                    final SubLObject var37_45 = module0141.$g1674$.currentBinding(var31);
                                    final SubLObject var38_47 = module0138.$g1619$.currentBinding(var31);
                                    try {
                                        module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var31);
                                        module0141.$g1674$.bind((SubLObject)NIL, var31);
                                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var31);
                                        while (NIL != var70 && NIL == var32) {
                                            final SubLObject var71 = var70;
                                            var32 = module0220.f14578($ic0$, var1, var71, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic8$);
                                            final SubLObject var72 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                                            SubLObject var73;
                                            SubLObject var74;
                                            SubLObject var21_45;
                                            SubLObject var37_46;
                                            SubLObject var75;
                                            SubLObject var76;
                                            SubLObject var77;
                                            SubLObject var78;
                                            SubLObject var60_62;
                                            SubLObject var79;
                                            SubLObject var21_46;
                                            SubLObject var59_65;
                                            SubLObject var80;
                                            SubLObject var81;
                                            SubLObject var21_47;
                                            SubLObject var82;
                                            SubLObject var83;
                                            SubLObject var84;
                                            SubLObject var85;
                                            SubLObject var86;
                                            SubLObject var87;
                                            SubLObject var88;
                                            SubLObject var89;
                                            SubLObject var52_76;
                                            SubLObject var90;
                                            SubLObject var21_48;
                                            SubLObject var92;
                                            SubLObject var91;
                                            SubLObject var93;
                                            SubLObject var94;
                                            SubLObject var95;
                                            SubLObject var96;
                                            SubLObject var97;
                                            for (var73 = (SubLObject)NIL, var73 = var72; NIL == var32 && NIL != var73; var73 = var73.rest()) {
                                                var74 = var73.first();
                                                var21_45 = module0137.$g1605$.currentBinding(var31);
                                                var37_46 = module0141.$g1674$.currentBinding(var31);
                                                try {
                                                    module0137.$g1605$.bind(var74, var31);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var31)) : module0141.$g1674$.getDynamicValue(var31)), var31);
                                                    var75 = module0228.f15229(var70);
                                                    if (NIL != module0138.f8992(var75)) {
                                                        var76 = module0242.f15664(var75, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var76) {
                                                            var77 = module0245.f15834(var76, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var77) {
                                                                for (var78 = module0066.f4838(module0067.f4891(var77)); NIL == var32 && NIL == module0066.f4841(var78); var78 = module0066.f4840(var78)) {
                                                                    var31.resetMultipleValues();
                                                                    var60_62 = module0066.f4839(var78);
                                                                    var79 = var31.secondMultipleValue();
                                                                    var31.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var60_62)) {
                                                                        var21_46 = module0138.$g1623$.currentBinding(var31);
                                                                        try {
                                                                            module0138.$g1623$.bind(var60_62, var31);
                                                                            for (var59_65 = module0066.f4838(module0067.f4891(var79)); NIL == var32 && NIL == module0066.f4841(var59_65); var59_65 = module0066.f4840(var59_65)) {
                                                                                var31.resetMultipleValues();
                                                                                var80 = module0066.f4839(var59_65);
                                                                                var81 = var31.secondMultipleValue();
                                                                                var31.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var80)) {
                                                                                    var21_47 = module0138.$g1624$.currentBinding(var31);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var80, var31);
                                                                                        var82 = var81;
                                                                                        if (NIL != module0077.f5302(var82)) {
                                                                                            var83 = module0077.f5333(var82);
                                                                                            for (var84 = module0032.f1741(var83), var85 = (SubLObject)NIL, var85 = module0032.f1742(var84, var83); NIL == var32 && NIL == module0032.f1744(var84, var85); var85 = module0032.f1743(var85)) {
                                                                                                var86 = module0032.f1745(var84, var85);
                                                                                                if (NIL != module0032.f1746(var85, var86) && NIL == module0249.f16059(var86, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var86, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var86, var34);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var82.isList()) {
                                                                                            if (NIL == var32) {
                                                                                                var87 = var82;
                                                                                                var88 = (SubLObject)NIL;
                                                                                                var88 = var87.first();
                                                                                                while (NIL == var32 && NIL != var87) {
                                                                                                    if (NIL == module0249.f16059(var88, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var88, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var88, var34);
                                                                                                    }
                                                                                                    var87 = var87.rest();
                                                                                                    var88 = var87.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic26$, var82);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var21_47, var31);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_65);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var21_46, var31);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var78);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var75, (SubLObject)UNPROVIDED)) {
                                                        var89 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var52_76 = (SubLObject)NIL, var52_76 = var89; NIL == var32 && NIL != var52_76; var52_76 = var52_76.rest()) {
                                                            var90 = var52_76.first();
                                                            var21_48 = module0138.$g1625$.currentBinding(var31);
                                                            try {
                                                                module0138.$g1625$.bind(var90, var31);
                                                                var91 = (var92 = Functions.funcall(var90, var75));
                                                                if (NIL != module0077.f5302(var92)) {
                                                                    var93 = module0077.f5333(var92);
                                                                    for (var94 = module0032.f1741(var93), var95 = (SubLObject)NIL, var95 = module0032.f1742(var94, var93); NIL == var32 && NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                        var59 = module0032.f1745(var94, var95);
                                                                        if (NIL != module0032.f1746(var95, var59) && NIL == module0249.f16059(var59, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var59, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var59, var34);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var92.isList()) {
                                                                    if (NIL == var32) {
                                                                        var96 = var92;
                                                                        var97 = (SubLObject)NIL;
                                                                        var97 = var96.first();
                                                                        while (NIL == var32 && NIL != var96) {
                                                                            if (NIL == module0249.f16059(var97, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var97, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var97, var34);
                                                                            }
                                                                            var96 = var96.rest();
                                                                            var97 = var96.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic26$, var92);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var21_48, var31);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_46, var31);
                                                    module0137.$g1605$.rebind(var21_45, var31);
                                                }
                                            }
                                            var70 = module0056.f4150(var34);
                                        }
                                    }
                                    finally {
                                        module0138.$g1619$.rebind(var38_47, var31);
                                        module0141.$g1674$.rebind(var37_45, var31);
                                        module0137.$g1605$.rebind(var21_44, var31);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var38_46, var31);
                                    module0138.$g1619$.rebind(var37_43, var31);
                                    module0141.$g1677$.rebind(var21_39, var31);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic28$, var30, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var42, var31);
                            module0141.$g1674$.rebind(var41, var31);
                            module0141.$g1672$.rebind(var38_45, var31);
                            module0141.$g1671$.rebind(var37_42, var31);
                            module0141.$g1670$.rebind(var21_38, var31);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var37_41, var31);
                        module0141.$g1714$.rebind(var21_37, var31);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var38, var31);
                    module0147.$g2094$.rebind(var37, var31);
                    module0147.$g2095$.rebind(var21_36, var31);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var31));
            }
            finally {
                module0139.$g1635$.rebind(var35, var31);
            }
        }
        return var32;
    }
    
    public static SubLObject f30806() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30793", "S#34031", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30794", "S#34032", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30795", "S#34033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30796", "S#34034", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30797", "S#34035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30798", "S#34036", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30799", "S#34037", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30800", "S#34038", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30802", "S#34039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30801", "S#34040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30803", "S#34041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30804", "S#34042", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0444", "f30805", "S#34043", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30807() {
        $g3550$ = SubLFiles.defparameter("S#34044", (SubLObject)TEN_INTEGER);
        $g3551$ = SubLFiles.deflexical("S#34045", (SubLObject)$ic1$);
        $g3552$ = SubLFiles.deflexical("S#34046", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g3552$.getGlobalValue() : $ic3$);
        $g3553$ = SubLFiles.defparameter("S#34047", (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30808() {
        module0003.f57((SubLObject)$ic2$);
        module0132.f8593((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30806();
    }
    
    public void initializeVariables() {
        f30807();
    }
    
    public void runTopLevelForms() {
        f30808();
    }
    
    static {
        me = (SubLFile)new module0444();
        $g3550$ = null;
        $g3551$ = null;
        $g3552$ = null;
        $g3553$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("relationAll"));
        $ic1$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAll")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?OBJ"), (SubLObject)makeSymbol("?COL"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?OBJ")));
        $ic2$ = makeSymbol("S#34046", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic4$ = makeKeyword("CODE");
        $ic5$ = makeKeyword("TRUE-MON");
        $ic6$ = (SubLFloat)makeDouble(1.5);
        $ic7$ = makeKeyword("GAF");
        $ic8$ = makeKeyword("TRUE");
        $ic9$ = makeKeyword("REMOVAL-RELATION-ALL-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), ONE_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("S#34037", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34047", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34038", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object>) where <object> is a FORT\nfrom (#$relationAll <predicate> <collection>) \nand (#$isa <object> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$temporallyContinuous #$AbrahamLincoln)\nfrom (#$relationAll #$temporallyContinuous #$Entity)\nand (#$isa #$AbrahamLincoln #$Entity)") });
        $ic11$ = makeKeyword("ISA");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic13$ = makeSymbol("FORT-P");
        $ic14$ = makeKeyword("BREADTH");
        $ic15$ = makeKeyword("DEPTH");
        $ic16$ = makeKeyword("STACK");
        $ic17$ = makeKeyword("QUEUE");
        $ic18$ = makeSymbol("S#11450", "CYC");
        $ic19$ = makeKeyword("ERROR");
        $ic20$ = makeString("~A is not a ~A");
        $ic21$ = makeSymbol("S#11592", "CYC");
        $ic22$ = makeKeyword("CERROR");
        $ic23$ = makeString("continue anyway");
        $ic24$ = makeKeyword("WARN");
        $ic25$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic26$ = makeString("~A is neither SET-P nor LISTP.");
        $ic27$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic28$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 807 ms
	
	Decompiled with Procyon 0.5.32.
*/