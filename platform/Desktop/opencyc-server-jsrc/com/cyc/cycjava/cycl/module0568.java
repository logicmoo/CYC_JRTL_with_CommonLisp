package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0568 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0568";
    public static final String myFingerPrint = "3d78083ff734c2be4a53b5413281c37e8d785f178ad04e99348bf812b9b29c87";
    private static SubLSymbol $g4140$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f34894(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0568.UNPROVIDED) {
            var2 = (SubLObject)module0568.NIL;
        }
        if (var3 == module0568.UNPROVIDED) {
            var3 = (SubLObject)module0568.NIL;
        }
        assert module0568.NIL != module0369.f25275(var1) : var1;
        final SubLObject var4 = f34895(var1);
        if (module0568.NIL == var2) {
            var2 = module0369.f25484(var1);
        }
        return f34896(var4, var2, var3);
    }
    
    public static SubLObject f34895(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0568.NIL != module0369.f25275(var1) : var1;
        final SubLObject var3 = module0369.f25485(var1);
        final SubLObject var4 = module0369.f25484(var1);
        var2.resetMultipleValues();
        final SubLObject var5 = f34897(var1);
        final SubLObject var6 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        final SubLObject var7 = module0205.f13183(var5, Symbols.symbol_function((SubLObject)module0568.$ic1$), (SubLObject)module0568.T, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
        final SubLObject var8 = module0205.f13183(var6, Symbols.symbol_function((SubLObject)module0568.$ic1$), (SubLObject)module0568.T, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
        final SubLObject var9 = module0205.f13183(var3, Symbols.symbol_function((SubLObject)module0568.$ic1$), (SubLObject)module0568.T, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
        final SubLObject var10 = module0205.f13183(var4, Symbols.symbol_function((SubLObject)module0568.$ic1$), (SubLObject)module0568.T, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
        final SubLObject var11 = module0078.f5367(var7, Symbols.symbol_function((SubLObject)module0568.EQ), (SubLObject)module0568.UNPROVIDED);
        module0078.f5374(var8, var11);
        module0078.f5374(var9, var11);
        module0078.f5374(var10, var11);
        return module0077.f5312(var11);
    }
    
    public static SubLObject f34897(final SubLObject var1) {
        assert module0568.NIL != module0369.f25275(var1) : var1;
        final SubLObject var2 = module0369.f25484(var1);
        final SubLObject var3 = module0369.f25811(var1);
        return module0333.f22431(var3, var2, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
    }
    
    public static SubLObject f34896(final SubLObject var4, SubLObject var7, SubLObject var3) {
        if (var7 == module0568.UNPROVIDED) {
            var7 = (SubLObject)module0568.NIL;
        }
        if (var3 == module0568.UNPROVIDED) {
            var3 = (SubLObject)module0568.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0077.f5313(Symbols.symbol_function((SubLObject)module0568.EQUAL), Sequences.length(var4));
        final SubLObject var10 = module0055.f4017();
        final SubLObject var11 = module0568.$g4140$.currentBinding(var8);
        try {
            module0568.$g4140$.bind(var3, var8);
            final SubLObject var12 = var7;
            final SubLObject var18_20 = module0147.$g2095$.currentBinding(var8);
            final SubLObject var13 = module0147.$g2094$.currentBinding(var8);
            final SubLObject var14 = module0147.$g2096$.currentBinding(var8);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var8);
                module0147.$g2094$.bind(module0147.f9546(var12), var8);
                module0147.$g2096$.bind(module0147.f9549(var12), var8);
                SubLObject var15 = var4;
                SubLObject var16 = (SubLObject)module0568.NIL;
                var16 = var15.first();
                while (module0568.NIL != var15) {
                    f34898(var16, var9, var10, (SubLObject)module0568.NIL);
                    var15 = var15.rest();
                    var16 = var15.first();
                }
                while (module0568.NIL == module0055.f4019(var10)) {
                    final SubLObject var17 = module0055.f4023(var10);
                    SubLObject var18 = module0568.$ic2$;
                    if (module0568.NIL != module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var18)) {
                        final SubLObject var19 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var18);
                        SubLObject var20 = (SubLObject)module0568.NIL;
                        final SubLObject var21 = (SubLObject)module0568.NIL;
                        while (module0568.NIL == var20) {
                            final SubLObject var22 = module0052.f3695(var19, var21);
                            final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(!var21.eql(var22));
                            if (module0568.NIL != var23) {
                                SubLObject var24 = (SubLObject)module0568.NIL;
                                try {
                                    var24 = module0158.f10316(var22, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                    SubLObject var28_33 = (SubLObject)module0568.NIL;
                                    final SubLObject var29_34 = (SubLObject)module0568.NIL;
                                    while (module0568.NIL == var28_33) {
                                        final SubLObject var25 = module0052.f3695(var24, var29_34);
                                        final SubLObject var31_36 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_34.eql(var25));
                                        if (module0568.NIL != var31_36 && module0568.NIL != module0178.f11375(var25)) {
                                            final SubLObject var26 = module0178.f11335(var25);
                                            f34898(var26, var9, var10, var17);
                                        }
                                        var28_33 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_36);
                                    }
                                }
                                finally {
                                    final SubLObject var18_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                        if (module0568.NIL != var24) {
                                            module0158.f10319(var24);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_21, var8);
                                    }
                                }
                            }
                            var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var23);
                        }
                    }
                    if (module0568.NIL != module0173.f10955(var17)) {
                        if (module0568.NIL != module0269.f17705(var17)) {
                            var18 = module0568.$ic5$;
                            if (module0568.NIL != module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var18)) {
                                final SubLObject var19 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var18);
                                SubLObject var20 = (SubLObject)module0568.NIL;
                                final SubLObject var21 = (SubLObject)module0568.NIL;
                                while (module0568.NIL == var20) {
                                    final SubLObject var22 = module0052.f3695(var19, var21);
                                    final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(!var21.eql(var22));
                                    if (module0568.NIL != var23) {
                                        SubLObject var24 = (SubLObject)module0568.NIL;
                                        try {
                                            var24 = module0158.f10316(var22, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                            SubLObject var28_34 = (SubLObject)module0568.NIL;
                                            final SubLObject var29_35 = (SubLObject)module0568.NIL;
                                            while (module0568.NIL == var28_34) {
                                                final SubLObject var25 = module0052.f3695(var24, var29_35);
                                                final SubLObject var31_37 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_35.eql(var25));
                                                if (module0568.NIL != var31_37 && module0568.NIL != module0178.f11375(var25)) {
                                                    final SubLObject var26 = module0178.f11335(var25);
                                                    f34898(var26, var9, var10, var17);
                                                }
                                                var28_34 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_37);
                                            }
                                        }
                                        finally {
                                            final SubLObject var18_22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                                if (module0568.NIL != var24) {
                                                    module0158.f10319(var24);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_22, var8);
                                            }
                                        }
                                    }
                                    var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var23);
                                }
                            }
                        }
                        if (module0568.NIL != module0226.f14792(var17)) {
                            SubLObject var27 = f34899();
                            SubLObject var28 = (SubLObject)module0568.NIL;
                            var28 = var27.first();
                            while (module0568.NIL != var27) {
                                final SubLObject var29 = var28;
                                if (module0568.NIL != module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var29)) {
                                    final SubLObject var30 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var29);
                                    SubLObject var31 = (SubLObject)module0568.NIL;
                                    final SubLObject var32 = (SubLObject)module0568.NIL;
                                    while (module0568.NIL == var31) {
                                        final SubLObject var33 = module0052.f3695(var30, var32);
                                        final SubLObject var34 = (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(var33));
                                        if (module0568.NIL != var34) {
                                            SubLObject var35 = (SubLObject)module0568.NIL;
                                            try {
                                                var35 = module0158.f10316(var33, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                                SubLObject var28_35 = (SubLObject)module0568.NIL;
                                                final SubLObject var29_36 = (SubLObject)module0568.NIL;
                                                while (module0568.NIL == var28_35) {
                                                    final SubLObject var36 = module0052.f3695(var35, var29_36);
                                                    final SubLObject var31_38 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_36.eql(var36));
                                                    if (module0568.NIL != var31_38 && module0568.NIL != module0178.f11375(var36)) {
                                                        SubLObject var37 = (SubLObject)module0568.ZERO_INTEGER;
                                                        SubLObject var23_49;
                                                        final SubLObject var38 = var23_49 = module0205.f13207(module0178.f11285(var36), (SubLObject)module0568.$ic6$);
                                                        SubLObject var39 = (SubLObject)module0568.NIL;
                                                        var39 = var23_49.first();
                                                        while (module0568.NIL != var23_49) {
                                                            var37 = Numbers.add(var37, (SubLObject)module0568.ONE_INTEGER);
                                                            if (var37.numG((SubLObject)module0568.ONE_INTEGER) && module0568.NIL != module0173.f10955(var39)) {
                                                                f34898(var39, var9, var10, var17);
                                                            }
                                                            var23_49 = var23_49.rest();
                                                            var39 = var23_49.first();
                                                        }
                                                    }
                                                    var28_35 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_38);
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                                    if (module0568.NIL != var35) {
                                                        module0158.f10319(var35);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_23, var8);
                                                }
                                            }
                                        }
                                        var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var34);
                                    }
                                }
                                var27 = var27.rest();
                                var28 = var27.first();
                            }
                        }
                        if (module0568.NIL != module0269.f17706(var17)) {
                            SubLObject var27 = (SubLObject)module0568.$ic7$;
                            SubLObject var40 = (SubLObject)module0568.NIL;
                            var40 = var27.first();
                            while (module0568.NIL != var27) {
                                final SubLObject var29 = var40;
                                if (module0568.NIL != module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var29)) {
                                    final SubLObject var30 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var29);
                                    SubLObject var31 = (SubLObject)module0568.NIL;
                                    final SubLObject var32 = (SubLObject)module0568.NIL;
                                    while (module0568.NIL == var31) {
                                        final SubLObject var33 = module0052.f3695(var30, var32);
                                        final SubLObject var34 = (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(var33));
                                        if (module0568.NIL != var34) {
                                            SubLObject var35 = (SubLObject)module0568.NIL;
                                            try {
                                                var35 = module0158.f10316(var33, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                                SubLObject var28_36 = (SubLObject)module0568.NIL;
                                                final SubLObject var29_37 = (SubLObject)module0568.NIL;
                                                while (module0568.NIL == var28_36) {
                                                    final SubLObject var36 = module0052.f3695(var35, var29_37);
                                                    final SubLObject var31_39 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_37.eql(var36));
                                                    if (module0568.NIL != var31_39 && module0568.NIL != module0178.f11375(var36)) {
                                                        final SubLObject var41 = module0178.f11335(var36);
                                                        f34898(var41, var9, var10, var17);
                                                    }
                                                    var28_36 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_39);
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                                    if (module0568.NIL != var35) {
                                                        module0158.f10319(var35);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_24, var8);
                                                }
                                            }
                                        }
                                        var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var34);
                                    }
                                }
                                var27 = var27.rest();
                                var40 = var27.first();
                            }
                        }
                        if (module0568.NIL != module0269.f17708(var17)) {
                            SubLObject var27 = (SubLObject)module0568.$ic8$;
                            SubLObject var42 = (SubLObject)module0568.NIL;
                            var42 = var27.first();
                            while (module0568.NIL != var27) {
                                final SubLObject var29 = var42;
                                if (module0568.NIL != module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var29)) {
                                    final SubLObject var30 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var29);
                                    SubLObject var31 = (SubLObject)module0568.NIL;
                                    final SubLObject var32 = (SubLObject)module0568.NIL;
                                    while (module0568.NIL == var31) {
                                        final SubLObject var33 = module0052.f3695(var30, var32);
                                        final SubLObject var34 = (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(var33));
                                        if (module0568.NIL != var34) {
                                            SubLObject var35 = (SubLObject)module0568.NIL;
                                            try {
                                                var35 = module0158.f10316(var33, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                                SubLObject var28_37 = (SubLObject)module0568.NIL;
                                                final SubLObject var29_38 = (SubLObject)module0568.NIL;
                                                while (module0568.NIL == var28_37) {
                                                    final SubLObject var36 = module0052.f3695(var35, var29_38);
                                                    final SubLObject var31_40 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_38.eql(var36));
                                                    if (module0568.NIL != var31_40 && module0568.NIL != module0178.f11375(var36)) {
                                                        final SubLObject var41 = module0178.f11335(var36);
                                                        f34898(var41, var9, var10, var17);
                                                    }
                                                    var28_37 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_40);
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                                    if (module0568.NIL != var35) {
                                                        module0158.f10319(var35);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_25, var8);
                                                }
                                            }
                                        }
                                        var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var34);
                                    }
                                }
                                var27 = var27.rest();
                                var42 = var27.first();
                            }
                        }
                        if (module0568.NIL == module0269.f17731(var17)) {
                            continue;
                        }
                        var18 = module0568.$ic9$;
                        if (module0568.NIL == module0158.f10010(var17, (SubLObject)module0568.ONE_INTEGER, var18)) {
                            continue;
                        }
                        final SubLObject var19 = module0158.f10011(var17, (SubLObject)module0568.ONE_INTEGER, var18);
                        SubLObject var20 = (SubLObject)module0568.NIL;
                        final SubLObject var21 = (SubLObject)module0568.NIL;
                        while (module0568.NIL == var20) {
                            final SubLObject var22 = module0052.f3695(var19, var21);
                            final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(!var21.eql(var22));
                            if (module0568.NIL != var23) {
                                SubLObject var24 = (SubLObject)module0568.NIL;
                                try {
                                    var24 = module0158.f10316(var22, (SubLObject)module0568.$ic3$, (SubLObject)module0568.$ic4$, (SubLObject)module0568.NIL);
                                    SubLObject var28_38 = (SubLObject)module0568.NIL;
                                    final SubLObject var29_39 = (SubLObject)module0568.NIL;
                                    while (module0568.NIL == var28_38) {
                                        final SubLObject var25 = module0052.f3695(var24, var29_39);
                                        final SubLObject var31_41 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_39.eql(var25));
                                        if (module0568.NIL != var31_41 && module0568.NIL != module0178.f11375(var25)) {
                                            final SubLObject var26 = module0178.f11335(var25);
                                            f34898(var26, var9, var10, var17);
                                        }
                                        var28_38 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var31_41);
                                    }
                                }
                                finally {
                                    final SubLObject var18_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0568.T, var8);
                                        if (module0568.NIL != var24) {
                                            module0158.f10319(var24);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_26, var8);
                                    }
                                }
                            }
                            var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0568.NIL == var23);
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var14, var8);
                module0147.$g2094$.rebind(var13, var8);
                module0147.$g2095$.rebind(var18_20, var8);
            }
        }
        finally {
            module0568.$g4140$.rebind(var11, var8);
        }
        return var9;
    }
    
    public static SubLObject f34898(final SubLObject var65, final SubLObject var16, final SubLObject var17, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (module0568.NIL == module0077.f5320(var65, var16)) {
            module0077.f5326(var65, var16);
            module0055.f4021(var65, var17);
            if (module0568.NIL != module0568.$g4140$.getDynamicValue(var67)) {
                if (module0568.NIL != var66) {
                    module0006.f218(module0568.$g4140$.getDynamicValue(var67), (SubLObject)module0568.$ic10$, var65, var66, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
                }
                else {
                    module0006.f218(module0568.$g4140$.getDynamicValue(var67), (SubLObject)module0568.$ic11$, var65, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED, (SubLObject)module0568.UNPROVIDED);
                }
            }
            return var65;
        }
        return (SubLObject)module0568.NIL;
    }
    
    public static SubLObject f34899() {
        return (SubLObject)module0568.$ic12$;
    }
    
    public static SubLObject f34900() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34894", "S#38268", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34895", "S#38269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34897", "S#38270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34896", "S#38271", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34898", "S#38272", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0568", "f34899", "S#38273", 0, 0, false);
        return (SubLObject)module0568.NIL;
    }
    
    public static SubLObject f34901() {
        module0568.$g4140$ = SubLFiles.defparameter("S#38274", (SubLObject)module0568.NIL);
        return (SubLObject)module0568.NIL;
    }
    
    public static SubLObject f34902() {
        return (SubLObject)module0568.NIL;
    }
    
    public void declareFunctions() {
        f34900();
    }
    
    public void initializeVariables() {
        f34901();
    }
    
    public void runTopLevelForms() {
        f34902();
    }
    
    static {
        me = (SubLFile)new module0568();
        module0568.$g4140$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic1$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic3$ = SubLObjectFactory.makeKeyword("GAF");
        $ic4$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic6$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic7$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $ic8$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultGenl")));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic10$ = SubLObjectFactory.makeString("~%~S via ~S");
        $ic11$ = SubLObjectFactory.makeString("~%seeding ~S");
        $ic12$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Genl")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Genl")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3Genl")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4Genl")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5Genl")) });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0568.class
	Total time: 754 ms
	
	Decompiled with Procyon 0.5.32.
*/