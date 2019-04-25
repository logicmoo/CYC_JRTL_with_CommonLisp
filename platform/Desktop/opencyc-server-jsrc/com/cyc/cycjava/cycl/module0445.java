package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0445 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0445";
    public static final String myFingerPrint = "7719c4d4f8877d67f9d0be217c781b51b17eb4968beb57fa2ea8a2350160ca91";
    private static SubLSymbol $g3554$;
    private static SubLSymbol $g3555$;
    public static SubLSymbol $g3556$;
    private static SubLSymbol $g3557$;
    private static SubLSymbol $g3558$;
    private static SubLSymbol $g3559$;
    private static SubLSymbol $g3560$;
    public static SubLSymbol $g3561$;
    private static SubLSymbol $g3562$;
    private static SubLSymbol $g3563$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLFloat $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    
    public static SubLObject f30809(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0202.f12796(var1);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0035.f2437(var2, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0222.f14635($ic2$, var5, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic3$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30810(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0202.f12796(var1);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0035.f2437(var2, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0222.f14635($ic7$, var5, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic3$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30811(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var8)) {
            return module0220.f14548(var8, $ic2$, var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30812(final SubLObject var10, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var10)) {
            return module0220.f14548(var10, $ic2$, var9, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30813(final SubLObject var11, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13762(var11)) {
            return module0220.f14548(var11, $ic2$, var9, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30814(final SubLObject var8) {
        return module0217.f14223(var8, (SubLObject)ONE_INTEGER, $ic2$);
    }
    
    public static SubLObject f30815() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return Numbers.multiply($g3554$.getDynamicValue(var4), module0018.$g664$.getDynamicValue(var4));
    }
    
    public static SubLObject f30816(final SubLObject var12) {
        return module0217.f14223(var12, (SubLObject)THREE_INTEGER, $ic2$);
    }
    
    public static SubLObject f30817(final SubLObject var1) {
        final SubLObject var2 = module0205.f13333(var1);
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var2) && NIL != f30811(var2, (SubLObject)NIL));
    }
    
    public static SubLObject f30818() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0191.f11990((SubLObject)$ic12$, $g3555$.getDynamicValue(var4), $g3556$.getGlobalValue(), (SubLObject)$ic13$);
    }
    
    public static SubLObject f30819(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30817(var1)) {
            final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0202.f12659(var14) || NIL != f30813(var14, (SubLObject)NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30820(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var1);
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = f30814(var14);
        final SubLObject var18 = f30815();
        final SubLObject var19 = module0173.f10955(var16);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? f30816(var16) : NIL);
        if (NIL != var19 && var20.numLE(var17) && var20.numLE(var18)) {
            final SubLObject var21 = $ic2$;
            if (NIL != module0158.f10010(var16, (SubLObject)THREE_INTEGER, var21)) {
                final SubLObject var22 = module0158.f10011(var16, (SubLObject)THREE_INTEGER, var21);
                SubLObject var23 = (SubLObject)NIL;
                final SubLObject var24 = (SubLObject)NIL;
                while (NIL == var23) {
                    final SubLObject var25 = module0052.f3695(var22, var24);
                    final SubLObject var26 = (SubLObject)makeBoolean(!var24.eql(var25));
                    if (NIL != var26) {
                        SubLObject var27 = (SubLObject)NIL;
                        try {
                            var27 = module0158.f10316(var25, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_26 = (SubLObject)NIL;
                            final SubLObject var22_27 = (SubLObject)NIL;
                            while (NIL == var21_26) {
                                final SubLObject var28 = module0052.f3695(var27, var22_27);
                                final SubLObject var24_29 = (SubLObject)makeBoolean(!var22_27.eql(var28));
                                if (NIL != var24_29) {
                                    f30821(var1, var28);
                                }
                                var21_26 = (SubLObject)makeBoolean(NIL == var24_29);
                            }
                        }
                        finally {
                            final SubLObject var29 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var27) {
                                    module0158.f10319(var27);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var29);
                            }
                        }
                    }
                    var23 = (SubLObject)makeBoolean(NIL == var26);
                }
            }
        }
        else if (var17.numLE(var18)) {
            final SubLObject var21 = $ic2$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var21)) {
                final SubLObject var22 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var21);
                SubLObject var23 = (SubLObject)NIL;
                final SubLObject var24 = (SubLObject)NIL;
                while (NIL == var23) {
                    final SubLObject var25 = module0052.f3695(var22, var24);
                    final SubLObject var26 = (SubLObject)makeBoolean(!var24.eql(var25));
                    if (NIL != var26) {
                        SubLObject var27 = (SubLObject)NIL;
                        try {
                            var27 = module0158.f10316(var25, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_27 = (SubLObject)NIL;
                            final SubLObject var22_28 = (SubLObject)NIL;
                            while (NIL == var21_27) {
                                final SubLObject var28 = module0052.f3695(var27, var22_28);
                                final SubLObject var24_30 = (SubLObject)makeBoolean(!var22_28.eql(var28));
                                if (NIL != var24_30) {
                                    f30822(var1, var28);
                                }
                                var21_27 = (SubLObject)makeBoolean(NIL == var24_30);
                            }
                        }
                        finally {
                            final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var27) {
                                    module0158.f10319(var27);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
                            }
                        }
                    }
                    var23 = (SubLObject)makeBoolean(NIL == var26);
                }
            }
        }
        else {
            SubLObject var32;
            final SubLObject var31 = var32 = module0259.f16840(var15, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var33 = (SubLObject)NIL;
            var33 = var32.first();
            while (NIL != var32) {
                if (NIL != f30812(var33, (SubLObject)NIL)) {
                    final SubLObject var34 = $ic2$;
                    if (NIL != module0158.f10010(var33, (SubLObject)TWO_INTEGER, var34)) {
                        final SubLObject var35 = module0158.f10011(var33, (SubLObject)TWO_INTEGER, var34);
                        SubLObject var36 = (SubLObject)NIL;
                        final SubLObject var37 = (SubLObject)NIL;
                        while (NIL == var36) {
                            final SubLObject var38 = module0052.f3695(var35, var37);
                            final SubLObject var39 = (SubLObject)makeBoolean(!var37.eql(var38));
                            if (NIL != var39) {
                                SubLObject var40 = (SubLObject)NIL;
                                try {
                                    var40 = module0158.f10316(var38, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_28 = (SubLObject)NIL;
                                    final SubLObject var22_29 = (SubLObject)NIL;
                                    while (NIL == var21_28) {
                                        final SubLObject var41 = module0052.f3695(var40, var22_29);
                                        final SubLObject var24_31 = (SubLObject)makeBoolean(!var22_29.eql(var41));
                                        if (NIL != var24_31) {
                                            f30823(var1, var41);
                                        }
                                        var21_28 = (SubLObject)makeBoolean(NIL == var24_31);
                                    }
                                }
                                finally {
                                    final SubLObject var42 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var40) {
                                            module0158.f10319(var40);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var42);
                                    }
                                }
                            }
                            var36 = (SubLObject)makeBoolean(NIL == var39);
                        }
                    }
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30821(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        final SubLObject var30 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        if (NIL == module0259.f16854(var30, module0178.f11335(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30824(var1, var28);
    }
    
    public static SubLObject f30823(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        final SubLObject var30 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        if (!var30.equal(module0178.f11336(var28))) {
            return (SubLObject)NIL;
        }
        return f30824(var1, var28);
    }
    
    public static SubLObject f30822(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL == module0279.f18558(var30, module0178.f11336(var28))) {
            return (SubLObject)NIL;
        }
        if (NIL == module0259.f16854(var29, module0178.f11335(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30824(var1, var28);
    }
    
    public static SubLObject f30824(final SubLObject var1, final SubLObject var28) {
        if (NIL != module0351.f23568(var28)) {
            final SubLObject var29 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var30 = module0178.f11335(var28);
            final SubLObject var31 = f30818();
            final SubLObject var32 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var29, var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var33 = (SubLObject)ConsesLow.list(var31, var32);
            module0347.f23330(var28, (SubLObject)NIL, var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30825(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30817(var1)) {
            final SubLObject var14 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0173.f10955(var14) || NIL != module0202.f12659(var14));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30826(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return Numbers.max($g3558$.getDynamicValue(var14), Numbers.min(f30814(module0205.f13333(var1)), f30815()));
    }
    
    public static SubLObject f30827(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var1);
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30814(var14);
        final SubLObject var17 = f30815();
        if (var16.numLE(var17)) {
            final SubLObject var18 = $ic2$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var18)) {
                final SubLObject var19 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var18);
                SubLObject var20 = (SubLObject)NIL;
                final SubLObject var21 = (SubLObject)NIL;
                while (NIL == var20) {
                    final SubLObject var22 = module0052.f3695(var19, var21);
                    final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                    if (NIL != var23) {
                        SubLObject var24 = (SubLObject)NIL;
                        try {
                            var24 = module0158.f10316(var22, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_42 = (SubLObject)NIL;
                            final SubLObject var22_43 = (SubLObject)NIL;
                            while (NIL == var21_42) {
                                final SubLObject var25 = module0052.f3695(var24, var22_43);
                                final SubLObject var24_44 = (SubLObject)makeBoolean(!var22_43.eql(var25));
                                if (NIL != var24_44) {
                                    f30828(var1, var25);
                                }
                                var21_42 = (SubLObject)makeBoolean(NIL == var24_44);
                            }
                        }
                        finally {
                            final SubLObject var26 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var24) {
                                    module0158.f10319(var24);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var26);
                            }
                        }
                    }
                    var20 = (SubLObject)makeBoolean(NIL == var23);
                }
            }
        }
        else {
            SubLObject var28;
            final SubLObject var27 = var28 = module0259.f16840(var15, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                if (NIL != f30812(var29, (SubLObject)NIL)) {
                    final SubLObject var30 = $ic2$;
                    if (NIL != module0158.f10010(var29, (SubLObject)TWO_INTEGER, var30)) {
                        final SubLObject var31 = module0158.f10011(var29, (SubLObject)TWO_INTEGER, var30);
                        SubLObject var32 = (SubLObject)NIL;
                        final SubLObject var33 = (SubLObject)NIL;
                        while (NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                            if (NIL != var35) {
                                SubLObject var36 = (SubLObject)NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_43 = (SubLObject)NIL;
                                    final SubLObject var22_44 = (SubLObject)NIL;
                                    while (NIL == var21_43) {
                                        final SubLObject var37 = module0052.f3695(var36, var22_44);
                                        final SubLObject var24_45 = (SubLObject)makeBoolean(!var22_44.eql(var37));
                                        if (NIL != var24_45) {
                                            f30829(var1, var37);
                                        }
                                        var21_43 = (SubLObject)makeBoolean(NIL == var24_45);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var38);
                                    }
                                }
                            }
                            var32 = (SubLObject)makeBoolean(NIL == var35);
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30829(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        return f30830(var1, var28);
    }
    
    public static SubLObject f30828(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0178.f11335(var28);
        if (NIL == module0259.f16854(var29, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30830(var1, var28);
    }
    
    public static SubLObject f30830(final SubLObject var1, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var28)) {
            final SubLObject var30 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var31 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            final SubLObject var32 = module0178.f11335(var28);
            final SubLObject var33 = module0178.f11336(var28);
            var29.resetMultipleValues();
            final SubLObject var34 = module0235.f15474(var31, var33, (SubLObject)T, (SubLObject)T);
            final SubLObject var35 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            if (NIL != var34) {
                final SubLObject var36 = f30818();
                final SubLObject var37 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var30, var32), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var38 = ConsesLow.append((SubLObject)ConsesLow.list(var36, var37), var35);
                module0347.f23330(var28, var34, var38);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30831(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30817(var1)) {
            final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            return f30813(var14, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30832(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        SubLObject var14 = (SubLObject)ZERO_INTEGER;
        final SubLObject var15 = module0205.f13333(var1);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        SubLObject var18;
        final SubLObject var17 = var18 = f30833(var15, var16);
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = module0549.f33895(var19);
            var14 = Numbers.add(var14, var20);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return var14;
    }
    
    public static SubLObject f30833(final SubLObject var8, final SubLObject var14) {
        return module0035.f2062(f30834(var8, var14));
    }
    
    public static SubLObject f30834(final SubLObject var8, final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var17;
        final SubLObject var16 = var17 = module0220.f14572($ic2$, var8, var14, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)$ic16$);
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0178.f11335(var18);
            SubLObject var20 = module0035.f2293(var15, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var20 = (SubLObject)ConsesLow.cons(var18, var20);
            var15 = module0035.f2063(var15, var19, var20, (SubLObject)UNPROVIDED);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var15;
    }
    
    public static SubLObject f30835(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13333(var1);
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var18 = f30818();
        SubLObject var20;
        final SubLObject var19 = var20 = f30834(var15, var17);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            SubLObject var23;
            final SubLObject var22 = var23 = var21;
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic23$);
            var24 = var23.first();
            var23 = (var25 = var23.rest());
            final SubLObject var26 = var24;
            final SubLObject var27 = module0137.$g1605$.currentBinding(var14);
            final SubLObject var28 = module0139.$g1636$.currentBinding(var14);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic20$), var14);
                module0139.$g1636$.bind(module0139.f9007(), var14);
                SubLObject var64_65 = var26;
                final SubLObject var29 = (SubLObject)$ic26$;
                final SubLObject var30 = module0056.f4145(var29);
                final SubLObject var30_68 = module0139.$g1635$.currentBinding(var14);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var14);
                    final SubLObject var31 = (SubLObject)NIL;
                    final SubLObject var30_69 = module0141.$g1714$.currentBinding(var14);
                    final SubLObject var63_71 = module0141.$g1715$.currentBinding(var14);
                    try {
                        module0141.$g1714$.bind((NIL != var31) ? var31 : module0141.f9283(), var14);
                        module0141.$g1715$.bind((SubLObject)((NIL != var31) ? $ic27$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                        if (NIL != var31 && NIL != module0136.f8864() && NIL == module0141.f9279(var31)) {
                            final SubLObject var32 = module0136.$g1591$.getDynamicValue(var14);
                            if (var32.eql((SubLObject)$ic28$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic29$, var31, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)$ic31$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, (SubLObject)$ic29$, var31, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)$ic33$)) {
                                Errors.warn((SubLObject)$ic29$, var31, (SubLObject)$ic30$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic34$, module0136.$g1591$.getDynamicValue(var14));
                                Errors.cerror((SubLObject)$ic32$, (SubLObject)$ic29$, var31, (SubLObject)$ic30$);
                            }
                        }
                        final SubLObject var30_70 = module0141.$g1670$.currentBinding(var14);
                        final SubLObject var63_72 = module0141.$g1671$.currentBinding(var14);
                        final SubLObject var33 = module0141.$g1672$.currentBinding(var14);
                        final SubLObject var34 = module0141.$g1674$.currentBinding(var14);
                        final SubLObject var35 = module0137.$g1605$.currentBinding(var14);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic20$)), var14);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic20$))), var14);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic20$))), var14);
                            module0141.$g1674$.bind((SubLObject)NIL, var14);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic20$)), var14);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var26, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var30_71 = module0141.$g1677$.currentBinding(var14);
                                final SubLObject var63_73 = module0138.$g1619$.currentBinding(var14);
                                final SubLObject var75_80 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var14);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic20$))), var14);
                                    module0141.$g1674$.bind((SubLObject)NIL, var14);
                                    module0249.f16055(var64_65, (SubLObject)UNPROVIDED);
                                    while (NIL != var64_65) {
                                        final SubLObject var36 = var64_65;
                                        SubLObject var35_83;
                                        final SubLObject var37 = var35_83 = module0200.f12443(module0137.f8955($ic20$));
                                        SubLObject var38 = (SubLObject)NIL;
                                        var38 = var35_83.first();
                                        while (NIL != var35_83) {
                                            final SubLObject var30_72 = module0137.$g1605$.currentBinding(var14);
                                            final SubLObject var63_74 = module0141.$g1674$.currentBinding(var14);
                                            try {
                                                module0137.$g1605$.bind(var38, var14);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var14)) : module0141.$g1674$.getDynamicValue(var14)), var14);
                                                final SubLObject var39 = module0228.f15229(var36);
                                                if (NIL != module0138.f8992(var39)) {
                                                    final SubLObject var40 = module0242.f15664(var39, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var40) {
                                                        final SubLObject var41 = module0245.f15834(var40, module0244.f15780(module0137.f8955($ic20$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var41) {
                                                            SubLObject var42;
                                                            for (var42 = module0066.f4838(module0067.f4891(var41)); NIL == module0066.f4841(var42); var42 = module0066.f4840(var42)) {
                                                                var14.resetMultipleValues();
                                                                final SubLObject var43 = module0066.f4839(var42);
                                                                final SubLObject var44 = var14.secondMultipleValue();
                                                                var14.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var43)) {
                                                                    final SubLObject var30_73 = module0138.$g1623$.currentBinding(var14);
                                                                    try {
                                                                        module0138.$g1623$.bind(var43, var14);
                                                                        SubLObject var90_94;
                                                                        for (var90_94 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var90_94); var90_94 = module0066.f4840(var90_94)) {
                                                                            var14.resetMultipleValues();
                                                                            final SubLObject var45 = module0066.f4839(var90_94);
                                                                            final SubLObject var46 = var14.secondMultipleValue();
                                                                            var14.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var45)) {
                                                                                final SubLObject var30_74 = module0138.$g1624$.currentBinding(var14);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var45, var14);
                                                                                    final SubLObject var47 = var46;
                                                                                    if (NIL != module0077.f5302(var47)) {
                                                                                        final SubLObject var48 = module0077.f5333(var47);
                                                                                        SubLObject var49;
                                                                                        SubLObject var50;
                                                                                        SubLObject var51;
                                                                                        SubLObject var35_84;
                                                                                        SubLObject var52;
                                                                                        SubLObject var53;
                                                                                        SubLObject var54;
                                                                                        SubLObject var55;
                                                                                        SubLObject var56;
                                                                                        for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                                            var51 = module0032.f1745(var49, var50);
                                                                                            if (NIL != module0032.f1746(var50, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var14));
                                                                                                if (NIL != module0173.f10955(var51)) {
                                                                                                    var35_84 = var25;
                                                                                                    var52 = (SubLObject)NIL;
                                                                                                    var52 = var35_84.first();
                                                                                                    while (NIL != var35_84) {
                                                                                                        var14.resetMultipleValues();
                                                                                                        var53 = module0235.f15474(var16, var51, (SubLObject)T, (SubLObject)T);
                                                                                                        var54 = var14.secondMultipleValue();
                                                                                                        var14.resetMultipleValues();
                                                                                                        var55 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var51, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                        var56 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var55), var54);
                                                                                                        if (NIL != var53) {
                                                                                                            module0347.f23330(var52, var53, var56);
                                                                                                        }
                                                                                                        var35_84 = var35_84.rest();
                                                                                                        var52 = var35_84.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var47.isList()) {
                                                                                        SubLObject var57 = var47;
                                                                                        SubLObject var58 = (SubLObject)NIL;
                                                                                        var58 = var57.first();
                                                                                        while (NIL != var57) {
                                                                                            if (NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var14));
                                                                                                if (NIL != module0173.f10955(var58)) {
                                                                                                    SubLObject var35_85 = var25;
                                                                                                    SubLObject var59 = (SubLObject)NIL;
                                                                                                    var59 = var35_85.first();
                                                                                                    while (NIL != var35_85) {
                                                                                                        var14.resetMultipleValues();
                                                                                                        final SubLObject var60 = module0235.f15474(var16, var58, (SubLObject)T, (SubLObject)T);
                                                                                                        final SubLObject var61 = var14.secondMultipleValue();
                                                                                                        var14.resetMultipleValues();
                                                                                                        final SubLObject var62 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var58, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                        final SubLObject var63 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var62), var61);
                                                                                                        if (NIL != var60) {
                                                                                                            module0347.f23330(var59, var60, var63);
                                                                                                        }
                                                                                                        var35_85 = var35_85.rest();
                                                                                                        var59 = var35_85.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var57 = var57.rest();
                                                                                            var58 = var57.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic35$, var47);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var30_74, var14);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var90_94);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var30_73, var14);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var42);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var39, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var64 = module0248.f15995(var39);
                                                        SubLObject var65 = (SubLObject)NIL;
                                                        var65 = var64.first();
                                                        while (NIL != var64) {
                                                            SubLObject var109_110;
                                                            final SubLObject var107_108 = var109_110 = var65;
                                                            SubLObject var66 = (SubLObject)NIL;
                                                            SubLObject var67 = (SubLObject)NIL;
                                                            SubLObject var68 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var109_110, var107_108, (SubLObject)$ic37$);
                                                            var66 = var109_110.first();
                                                            var109_110 = var109_110.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var109_110, var107_108, (SubLObject)$ic37$);
                                                            var67 = var109_110.first();
                                                            var109_110 = var109_110.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var109_110, var107_108, (SubLObject)$ic37$);
                                                            var68 = var109_110.first();
                                                            var109_110 = var109_110.rest();
                                                            if (NIL == var109_110) {
                                                                if (NIL != module0147.f9507(var67)) {
                                                                    final SubLObject var30_75 = module0138.$g1623$.currentBinding(var14);
                                                                    try {
                                                                        module0138.$g1623$.bind(var67, var14);
                                                                        if (NIL != module0141.f9289(var68)) {
                                                                            final SubLObject var30_76 = module0138.$g1624$.currentBinding(var14);
                                                                            try {
                                                                                module0138.$g1624$.bind(var68, var14);
                                                                                final SubLObject var47;
                                                                                final SubLObject var69 = var47 = (SubLObject)ConsesLow.list(var66);
                                                                                if (NIL != module0077.f5302(var47)) {
                                                                                    final SubLObject var48 = module0077.f5333(var47);
                                                                                    SubLObject var49;
                                                                                    SubLObject var50;
                                                                                    SubLObject var51;
                                                                                    SubLObject var52;
                                                                                    SubLObject var53;
                                                                                    SubLObject var54;
                                                                                    SubLObject var55;
                                                                                    SubLObject var56;
                                                                                    SubLObject var35_86;
                                                                                    for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                                        var51 = module0032.f1745(var49, var50);
                                                                                        if (NIL != module0032.f1746(var50, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                            module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var14));
                                                                                            if (NIL != module0173.f10955(var51)) {
                                                                                                var35_86 = var25;
                                                                                                var52 = (SubLObject)NIL;
                                                                                                var52 = var35_86.first();
                                                                                                while (NIL != var35_86) {
                                                                                                    var14.resetMultipleValues();
                                                                                                    var53 = module0235.f15474(var16, var51, (SubLObject)T, (SubLObject)T);
                                                                                                    var54 = var14.secondMultipleValue();
                                                                                                    var14.resetMultipleValues();
                                                                                                    var55 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var51, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                    var56 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var55), var54);
                                                                                                    if (NIL != var53) {
                                                                                                        module0347.f23330(var52, var53, var56);
                                                                                                    }
                                                                                                    var35_86 = var35_86.rest();
                                                                                                    var52 = var35_86.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var47.isList()) {
                                                                                    SubLObject var104_117 = var47;
                                                                                    SubLObject var58 = (SubLObject)NIL;
                                                                                    var58 = var104_117.first();
                                                                                    while (NIL != var104_117) {
                                                                                        if (NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                            module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var14));
                                                                                            if (NIL != module0173.f10955(var58)) {
                                                                                                SubLObject var35_87 = var25;
                                                                                                SubLObject var59 = (SubLObject)NIL;
                                                                                                var59 = var35_87.first();
                                                                                                while (NIL != var35_87) {
                                                                                                    var14.resetMultipleValues();
                                                                                                    final SubLObject var60 = module0235.f15474(var16, var58, (SubLObject)T, (SubLObject)T);
                                                                                                    final SubLObject var61 = var14.secondMultipleValue();
                                                                                                    var14.resetMultipleValues();
                                                                                                    final SubLObject var62 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var58, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                    final SubLObject var63 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var62), var61);
                                                                                                    if (NIL != var60) {
                                                                                                        module0347.f23330(var59, var60, var63);
                                                                                                    }
                                                                                                    var35_87 = var35_87.rest();
                                                                                                    var59 = var35_87.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var104_117 = var104_117.rest();
                                                                                        var58 = var104_117.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic35$, var47);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var30_76, var14);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var30_75, var14);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var107_108, (SubLObject)$ic37$);
                                                            }
                                                            var64 = var64.rest();
                                                            var65 = var64.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var39, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var35_88;
                                                    final SubLObject var70 = var35_88 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic20$)), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic20$)), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var71 = (SubLObject)NIL;
                                                    var71 = var35_88.first();
                                                    while (NIL != var35_88) {
                                                        final SubLObject var30_77 = module0138.$g1625$.currentBinding(var14);
                                                        try {
                                                            module0138.$g1625$.bind(var71, var14);
                                                            final SubLObject var73;
                                                            final SubLObject var72 = var73 = Functions.funcall(var71, var39);
                                                            if (NIL != module0077.f5302(var73)) {
                                                                final SubLObject var74 = module0077.f5333(var73);
                                                                SubLObject var75;
                                                                SubLObject var76;
                                                                SubLObject var77;
                                                                SubLObject var35_89;
                                                                SubLObject var78;
                                                                SubLObject var79;
                                                                SubLObject var80;
                                                                SubLObject var81;
                                                                SubLObject var82;
                                                                for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                                                                    var77 = module0032.f1745(var75, var76);
                                                                    if (NIL != module0032.f1746(var76, var77) && NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var14))) {
                                                                        module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var14));
                                                                        if (NIL != module0173.f10955(var77)) {
                                                                            var35_89 = var25;
                                                                            var78 = (SubLObject)NIL;
                                                                            var78 = var35_89.first();
                                                                            while (NIL != var35_89) {
                                                                                var14.resetMultipleValues();
                                                                                var79 = module0235.f15474(var16, var77, (SubLObject)T, (SubLObject)T);
                                                                                var80 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                var81 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var77, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                var82 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var81), var80);
                                                                                if (NIL != var79) {
                                                                                    module0347.f23330(var78, var79, var82);
                                                                                }
                                                                                var35_89 = var35_89.rest();
                                                                                var78 = var35_89.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var73.isList()) {
                                                                SubLObject var83 = var73;
                                                                SubLObject var84 = (SubLObject)NIL;
                                                                var84 = var83.first();
                                                                while (NIL != var83) {
                                                                    if (NIL == module0249.f16059(var84, module0139.$g1636$.getDynamicValue(var14))) {
                                                                        module0249.f16055(var84, module0139.$g1636$.getDynamicValue(var14));
                                                                        if (NIL != module0173.f10955(var84)) {
                                                                            SubLObject var35_90 = var25;
                                                                            SubLObject var85 = (SubLObject)NIL;
                                                                            var85 = var35_90.first();
                                                                            while (NIL != var35_90) {
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var86 = module0235.f15474(var16, var84, (SubLObject)T, (SubLObject)T);
                                                                                final SubLObject var87 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var88 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var84, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                final SubLObject var89 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var88), var87);
                                                                                if (NIL != var86) {
                                                                                    module0347.f23330(var85, var86, var89);
                                                                                }
                                                                                var35_90 = var35_90.rest();
                                                                                var85 = var35_90.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    var83 = var83.rest();
                                                                    var84 = var83.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic35$, var73);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var30_77, var14);
                                                        }
                                                        var35_88 = var35_88.rest();
                                                        var71 = var35_88.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var63_74, var14);
                                                module0137.$g1605$.rebind(var30_72, var14);
                                            }
                                            var35_83 = var35_83.rest();
                                            var38 = var35_83.first();
                                        }
                                        SubLObject var35_91;
                                        final SubLObject var90 = var35_91 = module0200.f12443(module0244.f15771(module0137.f8955($ic20$)));
                                        SubLObject var91 = (SubLObject)NIL;
                                        var91 = var35_91.first();
                                        while (NIL != var35_91) {
                                            final SubLObject var30_78 = module0137.$g1605$.currentBinding(var14);
                                            final SubLObject var63_75 = module0141.$g1674$.currentBinding(var14);
                                            try {
                                                module0137.$g1605$.bind(var91, var14);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var14)) : module0141.$g1674$.getDynamicValue(var14)), var14);
                                                final SubLObject var92 = module0228.f15229(var64_65);
                                                if (NIL != module0138.f8992(var92)) {
                                                    final SubLObject var93 = module0242.f15664(var92, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var93) {
                                                        final SubLObject var94 = module0245.f15834(var93, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var94) {
                                                            SubLObject var95;
                                                            for (var95 = module0066.f4838(module0067.f4891(var94)); NIL == module0066.f4841(var95); var95 = module0066.f4840(var95)) {
                                                                var14.resetMultipleValues();
                                                                final SubLObject var96 = module0066.f4839(var95);
                                                                final SubLObject var97 = var14.secondMultipleValue();
                                                                var14.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var96)) {
                                                                    final SubLObject var30_79 = module0138.$g1623$.currentBinding(var14);
                                                                    try {
                                                                        module0138.$g1623$.bind(var96, var14);
                                                                        SubLObject var90_95;
                                                                        for (var90_95 = module0066.f4838(module0067.f4891(var97)); NIL == module0066.f4841(var90_95); var90_95 = module0066.f4840(var90_95)) {
                                                                            var14.resetMultipleValues();
                                                                            final SubLObject var98 = module0066.f4839(var90_95);
                                                                            final SubLObject var99 = var14.secondMultipleValue();
                                                                            var14.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var98)) {
                                                                                final SubLObject var30_80 = module0138.$g1624$.currentBinding(var14);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var98, var14);
                                                                                    final SubLObject var100 = var99;
                                                                                    if (NIL != module0077.f5302(var100)) {
                                                                                        final SubLObject var101 = module0077.f5333(var100);
                                                                                        SubLObject var102;
                                                                                        SubLObject var103;
                                                                                        SubLObject var104;
                                                                                        for (var102 = module0032.f1741(var101), var103 = (SubLObject)NIL, var103 = module0032.f1742(var102, var101); NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                                                            var104 = module0032.f1745(var102, var103);
                                                                                            if (NIL != module0032.f1746(var103, var104) && NIL == module0249.f16059(var104, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var104, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var104, var30);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var100.isList()) {
                                                                                        SubLObject var105 = var100;
                                                                                        SubLObject var106 = (SubLObject)NIL;
                                                                                        var106 = var105.first();
                                                                                        while (NIL != var105) {
                                                                                            if (NIL == module0249.f16059(var106, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var106, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var106, var30);
                                                                                            }
                                                                                            var105 = var105.rest();
                                                                                            var106 = var105.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic35$, var100);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var30_80, var14);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var90_95);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var30_79, var14);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var95);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var92, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var35_92;
                                                    final SubLObject var107 = var35_92 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var108 = (SubLObject)NIL;
                                                    var108 = var35_92.first();
                                                    while (NIL != var35_92) {
                                                        final SubLObject var30_81 = module0138.$g1625$.currentBinding(var14);
                                                        try {
                                                            module0138.$g1625$.bind(var108, var14);
                                                            final SubLObject var110;
                                                            final SubLObject var109 = var110 = Functions.funcall(var108, var92);
                                                            if (NIL != module0077.f5302(var110)) {
                                                                final SubLObject var111 = module0077.f5333(var110);
                                                                SubLObject var112;
                                                                SubLObject var113;
                                                                SubLObject var114;
                                                                for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                                    var114 = module0032.f1745(var112, var113);
                                                                    if (NIL != module0032.f1746(var113, var114) && NIL == module0249.f16059(var114, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var114, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var114, var30);
                                                                    }
                                                                }
                                                            }
                                                            else if (var110.isList()) {
                                                                SubLObject var115 = var110;
                                                                SubLObject var116 = (SubLObject)NIL;
                                                                var116 = var115.first();
                                                                while (NIL != var115) {
                                                                    if (NIL == module0249.f16059(var116, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var116, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var116, var30);
                                                                    }
                                                                    var115 = var115.rest();
                                                                    var116 = var115.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic35$, var110);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var30_81, var14);
                                                        }
                                                        var35_92 = var35_92.rest();
                                                        var108 = var35_92.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var63_75, var14);
                                                module0137.$g1605$.rebind(var30_78, var14);
                                            }
                                            var35_91 = var35_91.rest();
                                            var91 = var35_91.first();
                                        }
                                        var64_65 = module0056.f4150(var30);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var75_80, var14);
                                    module0138.$g1619$.rebind(var63_73, var14);
                                    module0141.$g1677$.rebind(var30_71, var14);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic38$, var26, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var35, var14);
                            module0141.$g1674$.rebind(var34, var14);
                            module0141.$g1672$.rebind(var33, var14);
                            module0141.$g1671$.rebind(var63_72, var14);
                            module0141.$g1670$.rebind(var30_70, var14);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var63_71, var14);
                        module0141.$g1714$.rebind(var30_69, var14);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var14));
                }
                finally {
                    module0139.$g1635$.rebind(var30_68, var14);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var14));
            }
            finally {
                module0139.$g1636$.rebind(var28, var14);
                module0137.$g1605$.rebind(var27, var14);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30836(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var8)) {
            return module0220.f14548(var8, $ic7$, var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30837(final SubLObject var11, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13762(var11)) {
            return module0220.f14548(var11, $ic7$, var9, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30838(final SubLObject var10, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var10)) {
            return module0220.f14548(var10, $ic7$, var9, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30839(final SubLObject var8) {
        return module0217.f14223(var8, (SubLObject)ONE_INTEGER, $ic7$);
    }
    
    public static SubLObject f30840() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return Numbers.multiply($g3559$.getDynamicValue(var4), module0018.$g664$.getDynamicValue(var4));
    }
    
    public static SubLObject f30841(final SubLObject var11) {
        return module0217.f14223(var11, (SubLObject)TWO_INTEGER, $ic7$);
    }
    
    public static SubLObject f30842(final SubLObject var1) {
        final SubLObject var2 = module0205.f13333(var1);
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var2) && NIL != f30836(var2, (SubLObject)NIL));
    }
    
    public static SubLObject f30843() {
        return module0191.f11990((SubLObject)$ic12$, $g3560$.getGlobalValue(), $g3561$.getGlobalValue(), (SubLObject)$ic13$);
    }
    
    public static SubLObject f30844(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30842(var1)) {
            final SubLObject var14 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0202.f12659(var14) || NIL != f30837(var14, (SubLObject)NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30845(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var1);
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = f30839(var14);
        final SubLObject var18 = f30840();
        final SubLObject var19 = module0173.f10955(var15);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? f30841(var15) : NIL);
        if (NIL != var19 && var20.numLE(var17) && var20.numLE(var18)) {
            final SubLObject var21 = $ic7$;
            if (NIL != module0158.f10010(var15, (SubLObject)TWO_INTEGER, var21)) {
                final SubLObject var22 = module0158.f10011(var15, (SubLObject)TWO_INTEGER, var21);
                SubLObject var23 = (SubLObject)NIL;
                final SubLObject var24 = (SubLObject)NIL;
                while (NIL == var23) {
                    final SubLObject var25 = module0052.f3695(var22, var24);
                    final SubLObject var26 = (SubLObject)makeBoolean(!var24.eql(var25));
                    if (NIL != var26) {
                        SubLObject var27 = (SubLObject)NIL;
                        try {
                            var27 = module0158.f10316(var25, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_136 = (SubLObject)NIL;
                            final SubLObject var22_137 = (SubLObject)NIL;
                            while (NIL == var21_136) {
                                final SubLObject var28 = module0052.f3695(var27, var22_137);
                                final SubLObject var24_138 = (SubLObject)makeBoolean(!var22_137.eql(var28));
                                if (NIL != var24_138) {
                                    f30846(var1, var28);
                                }
                                var21_136 = (SubLObject)makeBoolean(NIL == var24_138);
                            }
                        }
                        finally {
                            final SubLObject var29 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var27) {
                                    module0158.f10319(var27);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var29);
                            }
                        }
                    }
                    var23 = (SubLObject)makeBoolean(NIL == var26);
                }
            }
        }
        else if (var17.numLE(var18)) {
            final SubLObject var21 = $ic7$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var21)) {
                final SubLObject var22 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var21);
                SubLObject var23 = (SubLObject)NIL;
                final SubLObject var24 = (SubLObject)NIL;
                while (NIL == var23) {
                    final SubLObject var25 = module0052.f3695(var22, var24);
                    final SubLObject var26 = (SubLObject)makeBoolean(!var24.eql(var25));
                    if (NIL != var26) {
                        SubLObject var27 = (SubLObject)NIL;
                        try {
                            var27 = module0158.f10316(var25, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_137 = (SubLObject)NIL;
                            final SubLObject var22_138 = (SubLObject)NIL;
                            while (NIL == var21_137) {
                                final SubLObject var28 = module0052.f3695(var27, var22_138);
                                final SubLObject var24_139 = (SubLObject)makeBoolean(!var22_138.eql(var28));
                                if (NIL != var24_139) {
                                    f30847(var1, var28);
                                }
                                var21_137 = (SubLObject)makeBoolean(NIL == var24_139);
                            }
                        }
                        finally {
                            final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var27) {
                                    module0158.f10319(var27);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
                            }
                        }
                    }
                    var23 = (SubLObject)makeBoolean(NIL == var26);
                }
            }
        }
        else {
            SubLObject var32;
            final SubLObject var31 = var32 = module0259.f16840(var16, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var33 = (SubLObject)NIL;
            var33 = var32.first();
            while (NIL != var32) {
                if (NIL != f30838(var33, (SubLObject)NIL)) {
                    final SubLObject var34 = $ic7$;
                    if (NIL != module0158.f10010(var33, (SubLObject)THREE_INTEGER, var34)) {
                        final SubLObject var35 = module0158.f10011(var33, (SubLObject)THREE_INTEGER, var34);
                        SubLObject var36 = (SubLObject)NIL;
                        final SubLObject var37 = (SubLObject)NIL;
                        while (NIL == var36) {
                            final SubLObject var38 = module0052.f3695(var35, var37);
                            final SubLObject var39 = (SubLObject)makeBoolean(!var37.eql(var38));
                            if (NIL != var39) {
                                SubLObject var40 = (SubLObject)NIL;
                                try {
                                    var40 = module0158.f10316(var38, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_138 = (SubLObject)NIL;
                                    final SubLObject var22_139 = (SubLObject)NIL;
                                    while (NIL == var21_138) {
                                        final SubLObject var41 = module0052.f3695(var40, var22_139);
                                        final SubLObject var24_140 = (SubLObject)makeBoolean(!var22_139.eql(var41));
                                        if (NIL != var24_140) {
                                            f30848(var1, var41);
                                        }
                                        var21_138 = (SubLObject)makeBoolean(NIL == var24_140);
                                    }
                                }
                                finally {
                                    final SubLObject var42 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var40) {
                                            module0158.f10319(var40);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var42);
                                    }
                                }
                            }
                            var36 = (SubLObject)makeBoolean(NIL == var39);
                        }
                    }
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30846(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        final SubLObject var30 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        if (NIL == module0259.f16854(var30, module0178.f11336(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30849(var1, var28);
    }
    
    public static SubLObject f30848(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        final SubLObject var30 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        if (!var30.equal(module0178.f11335(var28))) {
            return (SubLObject)NIL;
        }
        return f30849(var1, var28);
    }
    
    public static SubLObject f30847(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL == module0279.f18558(var29, module0178.f11335(var28))) {
            return (SubLObject)NIL;
        }
        if (NIL == module0259.f16854(var30, module0178.f11336(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30849(var1, var28);
    }
    
    public static SubLObject f30849(final SubLObject var1, final SubLObject var28) {
        if (NIL != module0351.f23568(var28)) {
            final SubLObject var29 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            final SubLObject var30 = module0178.f11336(var28);
            final SubLObject var31 = f30843();
            final SubLObject var32 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var29, var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var33 = (SubLObject)ConsesLow.list(var31, var32);
            module0347.f23330(var28, (SubLObject)NIL, var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30850(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30842(var1)) {
            final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0173.f10955(var14) || NIL != module0202.f12659(var14));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30851(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return Numbers.max($g3563$.getDynamicValue(var14), Numbers.min(f30839(module0205.f13333(var1)), f30840()));
    }
    
    public static SubLObject f30852(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var1);
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30839(var14);
        final SubLObject var17 = f30840();
        if (var16.numLE(var17)) {
            final SubLObject var18 = $ic7$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var18)) {
                final SubLObject var19 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var18);
                SubLObject var20 = (SubLObject)NIL;
                final SubLObject var21 = (SubLObject)NIL;
                while (NIL == var20) {
                    final SubLObject var22 = module0052.f3695(var19, var21);
                    final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                    if (NIL != var23) {
                        SubLObject var24 = (SubLObject)NIL;
                        try {
                            var24 = module0158.f10316(var22, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                            SubLObject var21_145 = (SubLObject)NIL;
                            final SubLObject var22_146 = (SubLObject)NIL;
                            while (NIL == var21_145) {
                                final SubLObject var25 = module0052.f3695(var24, var22_146);
                                final SubLObject var24_147 = (SubLObject)makeBoolean(!var22_146.eql(var25));
                                if (NIL != var24_147) {
                                    f30853(var1, var25);
                                }
                                var21_145 = (SubLObject)makeBoolean(NIL == var24_147);
                            }
                        }
                        finally {
                            final SubLObject var26 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var24) {
                                    module0158.f10319(var24);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var26);
                            }
                        }
                    }
                    var20 = (SubLObject)makeBoolean(NIL == var23);
                }
            }
        }
        else {
            SubLObject var28;
            final SubLObject var27 = var28 = module0259.f16840(var15, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                if (NIL != f30838(var29, (SubLObject)NIL)) {
                    final SubLObject var30 = $ic7$;
                    if (NIL != module0158.f10010(var29, (SubLObject)THREE_INTEGER, var30)) {
                        final SubLObject var31 = module0158.f10011(var29, (SubLObject)THREE_INTEGER, var30);
                        SubLObject var32 = (SubLObject)NIL;
                        final SubLObject var33 = (SubLObject)NIL;
                        while (NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                            if (NIL != var35) {
                                SubLObject var36 = (SubLObject)NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_146 = (SubLObject)NIL;
                                    final SubLObject var22_147 = (SubLObject)NIL;
                                    while (NIL == var21_146) {
                                        final SubLObject var37 = module0052.f3695(var36, var22_147);
                                        final SubLObject var24_148 = (SubLObject)makeBoolean(!var22_147.eql(var37));
                                        if (NIL != var24_148) {
                                            f30854(var1, var37);
                                        }
                                        var21_146 = (SubLObject)makeBoolean(NIL == var24_148);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var38);
                                    }
                                }
                            }
                            var32 = (SubLObject)makeBoolean(NIL == var35);
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30853(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0178.f11336(var28);
        if (NIL == module0259.f16854(var29, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30855(var1, var28);
    }
    
    public static SubLObject f30854(final SubLObject var1, final SubLObject var28) {
        final SubLObject var29 = module0205.f13333(var1);
        if (!var29.eql(module0178.f11334(var28))) {
            return (SubLObject)NIL;
        }
        return f30855(var1, var28);
    }
    
    public static SubLObject f30855(final SubLObject var1, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var28)) {
            final SubLObject var30 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var31 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            final SubLObject var32 = module0178.f11335(var28);
            final SubLObject var33 = module0178.f11336(var28);
            var29.resetMultipleValues();
            final SubLObject var34 = module0235.f15474(var30, var32, (SubLObject)T, (SubLObject)T);
            final SubLObject var35 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            if (NIL != var34) {
                final SubLObject var36 = f30843();
                final SubLObject var37 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var31, var33), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var38 = ConsesLow.append((SubLObject)ConsesLow.list(var36, var37), var35);
                module0347.f23330(var28, var34, var38);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30856(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30842(var1)) {
            final SubLObject var14 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            return f30837(var14, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30857(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        SubLObject var14 = (SubLObject)ZERO_INTEGER;
        final SubLObject var15 = module0205.f13333(var1);
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        SubLObject var18;
        final SubLObject var17 = var18 = f30858(var15, var16);
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = module0549.f33895(var19);
            var14 = Numbers.add(var14, var20);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return var14;
    }
    
    public static SubLObject f30858(final SubLObject var8, final SubLObject var14) {
        return module0035.f2062(f30859(var8, var14));
    }
    
    public static SubLObject f30859(final SubLObject var8, final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var17;
        final SubLObject var16 = var17 = module0220.f14572($ic7$, var8, var14, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic16$);
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0178.f11336(var18);
            SubLObject var20 = module0035.f2293(var15, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var20 = (SubLObject)ConsesLow.cons(var18, var20);
            var15 = module0035.f2063(var15, var19, var20, (SubLObject)UNPROVIDED);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var15;
    }
    
    public static SubLObject f30860(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13333(var1);
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var18 = f30843();
        SubLObject var20;
        final SubLObject var19 = var20 = f30859(var15, var16);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            SubLObject var23;
            final SubLObject var22 = var23 = var21;
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic23$);
            var24 = var23.first();
            var23 = var23.rest();
            SubLObject var35_156;
            var25 = (var35_156 = var23);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var35_156.first();
            while (NIL != var35_156) {
                final SubLObject var27 = var24;
                final SubLObject var28 = module0137.$g1605$.currentBinding(var14);
                final SubLObject var29 = module0139.$g1636$.currentBinding(var14);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic20$), var14);
                    module0139.$g1636$.bind(module0139.f9007(), var14);
                    SubLObject var64_157 = var27;
                    final SubLObject var30 = (SubLObject)$ic26$;
                    final SubLObject var31 = module0056.f4145(var30);
                    final SubLObject var30_158 = module0139.$g1635$.currentBinding(var14);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var14);
                        final SubLObject var32 = (SubLObject)NIL;
                        final SubLObject var30_159 = module0141.$g1714$.currentBinding(var14);
                        final SubLObject var63_160 = module0141.$g1715$.currentBinding(var14);
                        try {
                            module0141.$g1714$.bind((NIL != var32) ? var32 : module0141.f9283(), var14);
                            module0141.$g1715$.bind((SubLObject)((NIL != var32) ? $ic27$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                            if (NIL != var32 && NIL != module0136.f8864() && NIL == module0141.f9279(var32)) {
                                final SubLObject var33 = module0136.$g1591$.getDynamicValue(var14);
                                if (var33.eql((SubLObject)$ic28$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic29$, var32, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var33.eql((SubLObject)$ic31$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, (SubLObject)$ic29$, var32, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var33.eql((SubLObject)$ic33$)) {
                                    Errors.warn((SubLObject)$ic29$, var32, (SubLObject)$ic30$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic34$, module0136.$g1591$.getDynamicValue(var14));
                                    Errors.cerror((SubLObject)$ic32$, (SubLObject)$ic29$, var32, (SubLObject)$ic30$);
                                }
                            }
                            final SubLObject var30_160 = module0141.$g1670$.currentBinding(var14);
                            final SubLObject var63_161 = module0141.$g1671$.currentBinding(var14);
                            final SubLObject var34 = module0141.$g1672$.currentBinding(var14);
                            final SubLObject var35 = module0141.$g1674$.currentBinding(var14);
                            final SubLObject var36 = module0137.$g1605$.currentBinding(var14);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic20$)), var14);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic20$))), var14);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic20$))), var14);
                                module0141.$g1674$.bind((SubLObject)NIL, var14);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic20$)), var14);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var30_161 = module0141.$g1677$.currentBinding(var14);
                                    final SubLObject var63_162 = module0138.$g1619$.currentBinding(var14);
                                    final SubLObject var75_165 = module0141.$g1674$.currentBinding(var14);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var14);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic20$))), var14);
                                        module0141.$g1674$.bind((SubLObject)NIL, var14);
                                        module0249.f16055(var64_157, (SubLObject)UNPROVIDED);
                                        while (NIL != var64_157) {
                                            final SubLObject var37 = var64_157;
                                            SubLObject var35_157;
                                            final SubLObject var38 = var35_157 = module0200.f12443(module0137.f8955($ic20$));
                                            SubLObject var39 = (SubLObject)NIL;
                                            var39 = var35_157.first();
                                            while (NIL != var35_157) {
                                                final SubLObject var30_162 = module0137.$g1605$.currentBinding(var14);
                                                final SubLObject var63_163 = module0141.$g1674$.currentBinding(var14);
                                                try {
                                                    module0137.$g1605$.bind(var39, var14);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var14)) : module0141.$g1674$.getDynamicValue(var14)), var14);
                                                    final SubLObject var40 = module0228.f15229(var37);
                                                    if (NIL != module0138.f8992(var40)) {
                                                        final SubLObject var41 = module0242.f15664(var40, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var41) {
                                                            final SubLObject var42 = module0245.f15834(var41, module0244.f15780(module0137.f8955($ic20$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var42) {
                                                                SubLObject var43;
                                                                for (var43 = module0066.f4838(module0067.f4891(var42)); NIL == module0066.f4841(var43); var43 = module0066.f4840(var43)) {
                                                                    var14.resetMultipleValues();
                                                                    final SubLObject var44 = module0066.f4839(var43);
                                                                    final SubLObject var45 = var14.secondMultipleValue();
                                                                    var14.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var44)) {
                                                                        final SubLObject var30_163 = module0138.$g1623$.currentBinding(var14);
                                                                        try {
                                                                            module0138.$g1623$.bind(var44, var14);
                                                                            SubLObject var90_170;
                                                                            for (var90_170 = module0066.f4838(module0067.f4891(var45)); NIL == module0066.f4841(var90_170); var90_170 = module0066.f4840(var90_170)) {
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var46 = module0066.f4839(var90_170);
                                                                                final SubLObject var47 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var46)) {
                                                                                    final SubLObject var30_164 = module0138.$g1624$.currentBinding(var14);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var46, var14);
                                                                                        final SubLObject var48 = var47;
                                                                                        if (NIL != module0077.f5302(var48)) {
                                                                                            final SubLObject var49 = module0077.f5333(var48);
                                                                                            SubLObject var50;
                                                                                            SubLObject var51;
                                                                                            SubLObject var52;
                                                                                            SubLObject var53;
                                                                                            SubLObject var54;
                                                                                            SubLObject var55;
                                                                                            SubLObject var56;
                                                                                            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                                                var52 = module0032.f1745(var50, var51);
                                                                                                if (NIL != module0032.f1746(var51, var52) && NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                    module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var14));
                                                                                                    if (NIL != module0173.f10955(var52)) {
                                                                                                        var14.resetMultipleValues();
                                                                                                        var53 = module0235.f15474(var17, var52, (SubLObject)T, (SubLObject)T);
                                                                                                        var54 = var14.secondMultipleValue();
                                                                                                        var14.resetMultipleValues();
                                                                                                        var55 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var52, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                        var56 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var55), var54);
                                                                                                        if (NIL != var53) {
                                                                                                            module0347.f23330(var26, var53, var56);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var48.isList()) {
                                                                                            SubLObject var57 = var48;
                                                                                            SubLObject var58 = (SubLObject)NIL;
                                                                                            var58 = var57.first();
                                                                                            while (NIL != var57) {
                                                                                                if (NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                    module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var14));
                                                                                                    if (NIL != module0173.f10955(var58)) {
                                                                                                        var14.resetMultipleValues();
                                                                                                        final SubLObject var59 = module0235.f15474(var17, var58, (SubLObject)T, (SubLObject)T);
                                                                                                        final SubLObject var60 = var14.secondMultipleValue();
                                                                                                        var14.resetMultipleValues();
                                                                                                        final SubLObject var61 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var58, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                        final SubLObject var62 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var61), var60);
                                                                                                        if (NIL != var59) {
                                                                                                            module0347.f23330(var26, var59, var62);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var57 = var57.rest();
                                                                                                var58 = var57.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic35$, var48);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var30_164, var14);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var90_170);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var30_163, var14);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var43);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var40, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            SubLObject var63 = module0248.f15995(var40);
                                                            SubLObject var64 = (SubLObject)NIL;
                                                            var64 = var63.first();
                                                            while (NIL != var63) {
                                                                SubLObject var174_175;
                                                                final SubLObject var172_173 = var174_175 = var64;
                                                                SubLObject var65 = (SubLObject)NIL;
                                                                SubLObject var66 = (SubLObject)NIL;
                                                                SubLObject var67 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var174_175, var172_173, (SubLObject)$ic37$);
                                                                var65 = var174_175.first();
                                                                var174_175 = var174_175.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var174_175, var172_173, (SubLObject)$ic37$);
                                                                var66 = var174_175.first();
                                                                var174_175 = var174_175.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var174_175, var172_173, (SubLObject)$ic37$);
                                                                var67 = var174_175.first();
                                                                var174_175 = var174_175.rest();
                                                                if (NIL == var174_175) {
                                                                    if (NIL != module0147.f9507(var66)) {
                                                                        final SubLObject var30_165 = module0138.$g1623$.currentBinding(var14);
                                                                        try {
                                                                            module0138.$g1623$.bind(var66, var14);
                                                                            if (NIL != module0141.f9289(var67)) {
                                                                                final SubLObject var30_166 = module0138.$g1624$.currentBinding(var14);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var67, var14);
                                                                                    final SubLObject var48;
                                                                                    final SubLObject var68 = var48 = (SubLObject)ConsesLow.list(var65);
                                                                                    if (NIL != module0077.f5302(var48)) {
                                                                                        final SubLObject var49 = module0077.f5333(var48);
                                                                                        SubLObject var50;
                                                                                        SubLObject var51;
                                                                                        SubLObject var52;
                                                                                        SubLObject var53;
                                                                                        SubLObject var54;
                                                                                        SubLObject var55;
                                                                                        SubLObject var56;
                                                                                        for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                                            var52 = module0032.f1745(var50, var51);
                                                                                            if (NIL != module0032.f1746(var51, var52) && NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var14));
                                                                                                if (NIL != module0173.f10955(var52)) {
                                                                                                    var14.resetMultipleValues();
                                                                                                    var53 = module0235.f15474(var17, var52, (SubLObject)T, (SubLObject)T);
                                                                                                    var54 = var14.secondMultipleValue();
                                                                                                    var14.resetMultipleValues();
                                                                                                    var55 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var52, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                    var56 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var55), var54);
                                                                                                    if (NIL != var53) {
                                                                                                        module0347.f23330(var26, var53, var56);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var48.isList()) {
                                                                                        SubLObject var104_178 = var48;
                                                                                        SubLObject var58 = (SubLObject)NIL;
                                                                                        var58 = var104_178.first();
                                                                                        while (NIL != var104_178) {
                                                                                            if (NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var14))) {
                                                                                                module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var14));
                                                                                                if (NIL != module0173.f10955(var58)) {
                                                                                                    var14.resetMultipleValues();
                                                                                                    final SubLObject var59 = module0235.f15474(var17, var58, (SubLObject)T, (SubLObject)T);
                                                                                                    final SubLObject var60 = var14.secondMultipleValue();
                                                                                                    var14.resetMultipleValues();
                                                                                                    final SubLObject var61 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var58, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                    final SubLObject var62 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var61), var60);
                                                                                                    if (NIL != var59) {
                                                                                                        module0347.f23330(var26, var59, var62);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var104_178 = var104_178.rest();
                                                                                            var58 = var104_178.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic35$, var48);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var30_166, var14);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var30_165, var14);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var172_173, (SubLObject)$ic37$);
                                                                }
                                                                var63 = var63.rest();
                                                                var64 = var63.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var40, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var35_158;
                                                        final SubLObject var69 = var35_158 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic20$)), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic20$)), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var70 = (SubLObject)NIL;
                                                        var70 = var35_158.first();
                                                        while (NIL != var35_158) {
                                                            final SubLObject var30_167 = module0138.$g1625$.currentBinding(var14);
                                                            try {
                                                                module0138.$g1625$.bind(var70, var14);
                                                                final SubLObject var72;
                                                                final SubLObject var71 = var72 = Functions.funcall(var70, var40);
                                                                if (NIL != module0077.f5302(var72)) {
                                                                    final SubLObject var73 = module0077.f5333(var72);
                                                                    SubLObject var74;
                                                                    SubLObject var75;
                                                                    SubLObject var76;
                                                                    SubLObject var77;
                                                                    SubLObject var78;
                                                                    SubLObject var79;
                                                                    SubLObject var80;
                                                                    for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                                                        var76 = module0032.f1745(var74, var75);
                                                                        if (NIL != module0032.f1746(var75, var76) && NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var14))) {
                                                                            module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var14));
                                                                            if (NIL != module0173.f10955(var76)) {
                                                                                var14.resetMultipleValues();
                                                                                var77 = module0235.f15474(var17, var76, (SubLObject)T, (SubLObject)T);
                                                                                var78 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                var79 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var76, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                var80 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var79), var78);
                                                                                if (NIL != var77) {
                                                                                    module0347.f23330(var26, var77, var80);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var72.isList()) {
                                                                    SubLObject var81 = var72;
                                                                    SubLObject var82 = (SubLObject)NIL;
                                                                    var82 = var81.first();
                                                                    while (NIL != var81) {
                                                                        if (NIL == module0249.f16059(var82, module0139.$g1636$.getDynamicValue(var14))) {
                                                                            module0249.f16055(var82, module0139.$g1636$.getDynamicValue(var14));
                                                                            if (NIL != module0173.f10955(var82)) {
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var83 = module0235.f15474(var17, var82, (SubLObject)T, (SubLObject)T);
                                                                                final SubLObject var84 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var85 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic20$, var82, var24), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                final SubLObject var86 = ConsesLow.append((SubLObject)ConsesLow.list(var18, var85), var84);
                                                                                if (NIL != var83) {
                                                                                    module0347.f23330(var26, var83, var86);
                                                                                }
                                                                            }
                                                                        }
                                                                        var81 = var81.rest();
                                                                        var82 = var81.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic35$, var72);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var30_167, var14);
                                                            }
                                                            var35_158 = var35_158.rest();
                                                            var70 = var35_158.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var63_163, var14);
                                                    module0137.$g1605$.rebind(var30_162, var14);
                                                }
                                                var35_157 = var35_157.rest();
                                                var39 = var35_157.first();
                                            }
                                            SubLObject var35_159;
                                            final SubLObject var87 = var35_159 = module0200.f12443(module0244.f15771(module0137.f8955($ic20$)));
                                            SubLObject var88 = (SubLObject)NIL;
                                            var88 = var35_159.first();
                                            while (NIL != var35_159) {
                                                final SubLObject var30_168 = module0137.$g1605$.currentBinding(var14);
                                                final SubLObject var63_164 = module0141.$g1674$.currentBinding(var14);
                                                try {
                                                    module0137.$g1605$.bind(var88, var14);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var14)) : module0141.$g1674$.getDynamicValue(var14)), var14);
                                                    final SubLObject var89 = module0228.f15229(var64_157);
                                                    if (NIL != module0138.f8992(var89)) {
                                                        final SubLObject var90 = module0242.f15664(var89, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var90) {
                                                            final SubLObject var91 = module0245.f15834(var90, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var91) {
                                                                SubLObject var92;
                                                                for (var92 = module0066.f4838(module0067.f4891(var91)); NIL == module0066.f4841(var92); var92 = module0066.f4840(var92)) {
                                                                    var14.resetMultipleValues();
                                                                    final SubLObject var93 = module0066.f4839(var92);
                                                                    final SubLObject var94 = var14.secondMultipleValue();
                                                                    var14.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var93)) {
                                                                        final SubLObject var30_169 = module0138.$g1623$.currentBinding(var14);
                                                                        try {
                                                                            module0138.$g1623$.bind(var93, var14);
                                                                            SubLObject var90_171;
                                                                            for (var90_171 = module0066.f4838(module0067.f4891(var94)); NIL == module0066.f4841(var90_171); var90_171 = module0066.f4840(var90_171)) {
                                                                                var14.resetMultipleValues();
                                                                                final SubLObject var95 = module0066.f4839(var90_171);
                                                                                final SubLObject var96 = var14.secondMultipleValue();
                                                                                var14.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var95)) {
                                                                                    final SubLObject var30_170 = module0138.$g1624$.currentBinding(var14);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var95, var14);
                                                                                        final SubLObject var97 = var96;
                                                                                        if (NIL != module0077.f5302(var97)) {
                                                                                            final SubLObject var98 = module0077.f5333(var97);
                                                                                            SubLObject var99;
                                                                                            SubLObject var100;
                                                                                            SubLObject var101;
                                                                                            for (var99 = module0032.f1741(var98), var100 = (SubLObject)NIL, var100 = module0032.f1742(var99, var98); NIL == module0032.f1744(var99, var100); var100 = module0032.f1743(var100)) {
                                                                                                var101 = module0032.f1745(var99, var100);
                                                                                                if (NIL != module0032.f1746(var100, var101) && NIL == module0249.f16059(var101, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var101, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var101, var31);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var97.isList()) {
                                                                                            SubLObject var102 = var97;
                                                                                            SubLObject var103 = (SubLObject)NIL;
                                                                                            var103 = var102.first();
                                                                                            while (NIL != var102) {
                                                                                                if (NIL == module0249.f16059(var103, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var103, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var103, var31);
                                                                                                }
                                                                                                var102 = var102.rest();
                                                                                                var103 = var102.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic35$, var97);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var30_170, var14);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var90_171);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var30_169, var14);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var92);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var89, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var35_160;
                                                        final SubLObject var104 = var35_160 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var14), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var105 = (SubLObject)NIL;
                                                        var105 = var35_160.first();
                                                        while (NIL != var35_160) {
                                                            final SubLObject var30_171 = module0138.$g1625$.currentBinding(var14);
                                                            try {
                                                                module0138.$g1625$.bind(var105, var14);
                                                                final SubLObject var107;
                                                                final SubLObject var106 = var107 = Functions.funcall(var105, var89);
                                                                if (NIL != module0077.f5302(var107)) {
                                                                    final SubLObject var108 = module0077.f5333(var107);
                                                                    SubLObject var109;
                                                                    SubLObject var110;
                                                                    SubLObject var111;
                                                                    for (var109 = module0032.f1741(var108), var110 = (SubLObject)NIL, var110 = module0032.f1742(var109, var108); NIL == module0032.f1744(var109, var110); var110 = module0032.f1743(var110)) {
                                                                        var111 = module0032.f1745(var109, var110);
                                                                        if (NIL != module0032.f1746(var110, var111) && NIL == module0249.f16059(var111, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var111, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var111, var31);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var107.isList()) {
                                                                    SubLObject var112 = var107;
                                                                    SubLObject var113 = (SubLObject)NIL;
                                                                    var113 = var112.first();
                                                                    while (NIL != var112) {
                                                                        if (NIL == module0249.f16059(var113, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var113, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var113, var31);
                                                                        }
                                                                        var112 = var112.rest();
                                                                        var113 = var112.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic35$, var107);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var30_171, var14);
                                                            }
                                                            var35_160 = var35_160.rest();
                                                            var105 = var35_160.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var63_164, var14);
                                                    module0137.$g1605$.rebind(var30_168, var14);
                                                }
                                                var35_159 = var35_159.rest();
                                                var88 = var35_159.first();
                                            }
                                            var64_157 = module0056.f4150(var31);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var75_165, var14);
                                        module0138.$g1619$.rebind(var63_162, var14);
                                        module0141.$g1677$.rebind(var30_161, var14);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic38$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var36, var14);
                                module0141.$g1674$.rebind(var35, var14);
                                module0141.$g1672$.rebind(var34, var14);
                                module0141.$g1671$.rebind(var63_161, var14);
                                module0141.$g1670$.rebind(var30_160, var14);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var63_160, var14);
                            module0141.$g1714$.rebind(var30_159, var14);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var14));
                    }
                    finally {
                        module0139.$g1635$.rebind(var30_158, var14);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var14));
                }
                finally {
                    module0139.$g1636$.rebind(var29, var14);
                    module0137.$g1605$.rebind(var28, var14);
                }
                var35_156 = var35_156.rest();
                var26 = var35_156.first();
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30861() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30809", "S#34052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30810", "S#34053", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30811", "S#34054", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30812", "S#34055", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30813", "S#34056", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30814", "S#34057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30815", "S#34058", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30816", "S#34059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30817", "S#34060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30818", "S#34061", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30819", "S#34062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30820", "S#34063", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30821", "S#34064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30823", "S#34065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30822", "S#34066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30824", "S#34067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30825", "S#34048", 1, 1, false);
        new $f30825$UnaryFunction();
        new $f30825$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30826", "S#34068", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30827", "S#34069", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30829", "S#34070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30828", "S#34071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30830", "S#34072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30831", "S#34049", 1, 1, false);
        new $f30831$UnaryFunction();
        new $f30831$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30832", "S#34073", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30833", "S#34074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30834", "S#34075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30835", "S#34076", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30836", "S#34077", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30837", "S#34078", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30838", "S#34079", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30839", "S#34080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30840", "S#34081", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30841", "S#34082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30842", "S#34083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30843", "S#34084", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30844", "S#34085", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30845", "S#34086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30846", "S#34087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30848", "S#34088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30847", "S#34089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30849", "S#34090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30850", "S#34050", 1, 1, false);
        new $f30850$UnaryFunction();
        new $f30850$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30851", "S#34091", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30852", "S#34092", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30853", "S#34093", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30854", "S#34094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30855", "S#34095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30856", "S#34051", 1, 1, false);
        new $f30856$UnaryFunction();
        new $f30856$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30857", "S#34096", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30858", "S#34097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30859", "S#34098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0445", "f30860", "S#34099", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30862() {
        $g3554$ = SubLFiles.defparameter("S#34100", (SubLObject)TWO_INTEGER);
        $g3555$ = SubLFiles.defparameter("S#34101", (SubLObject)$ic9$);
        $g3556$ = SubLFiles.deflexical("S#34102", (NIL != Symbols.boundp((SubLObject)$ic10$)) ? $g3556$.getGlobalValue() : $ic11$);
        $g3557$ = SubLFiles.defparameter("S#34103", (SubLObject)$ic14$);
        $g3558$ = SubLFiles.defparameter("S#34104", (SubLObject)TWO_INTEGER);
        $g3559$ = SubLFiles.defparameter("S#34105", (SubLObject)TWO_INTEGER);
        $g3560$ = SubLFiles.deflexical("S#34106", (SubLObject)$ic41$);
        $g3561$ = SubLFiles.deflexical("S#34107", (NIL != Symbols.boundp((SubLObject)$ic42$)) ? $g3561$.getGlobalValue() : $ic11$);
        $g3562$ = SubLFiles.defparameter("S#34108", (SubLObject)$ic14$);
        $g3563$ = SubLFiles.defparameter("S#34109", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30863() {
        module0358.f23730((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic4$);
        module0358.f23730((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f419((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic10$);
        module0132.f8593((SubLObject)$ic10$, $ic2$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0003.f57((SubLObject)$ic42$);
        module0132.f8593((SubLObject)$ic42$, $ic7$);
        module0340.f22941((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0340.f22941((SubLObject)$ic45$, (SubLObject)$ic46$);
        module0340.f22941((SubLObject)$ic47$, (SubLObject)$ic48$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30861();
    }
    
    public void initializeVariables() {
        f30862();
    }
    
    public void runTopLevelForms() {
        f30863();
    }
    
    static {
        me = (SubLFile)new module0445();
        $g3554$ = null;
        $g3555$ = null;
        $g3556$ = null;
        $g3557$ = null;
        $g3558$ = null;
        $g3559$ = null;
        $g3560$ = null;
        $g3561$ = null;
        $g3562$ = null;
        $g3563$ = null;
        $ic0$ = makeKeyword("RELATION-ALL-INSTANCE");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34052", "CYC"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic3$ = makeKeyword("DISPREFERRED");
        $ic4$ = makeSymbol("S#34052", "CYC");
        $ic5$ = makeKeyword("RELATION-INSTANCE-ALL");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34053", "CYC"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll"));
        $ic8$ = makeSymbol("S#34053", "CYC");
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?COL"), (SubLObject)makeSymbol("?VALUE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?OBJ"), (SubLObject)makeSymbol("?COL"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?OBJ"), (SubLObject)makeSymbol("?VALUE")));
        $ic10$ = makeSymbol("S#34102", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic12$ = makeKeyword("CODE");
        $ic13$ = makeKeyword("TRUE-MON");
        $ic14$ = (SubLFloat)makeDouble(1.5);
        $ic15$ = makeKeyword("GAF");
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34062", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34103", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34063", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) (#$YearsDuration 1))\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });
        $ic19$ = makeKeyword("ISA");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic21$ = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34048", "CYC"), makeKeyword("COST"), makeSymbol("S#34068", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34069", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT or NAUT\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <object> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln ?GENDER)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("S#34110", "CYC"));
        $ic24$ = makeKeyword("BREADTH");
        $ic25$ = makeKeyword("QUEUE");
        $ic26$ = makeKeyword("STACK");
        $ic27$ = makeSymbol("S#11450", "CYC");
        $ic28$ = makeKeyword("ERROR");
        $ic29$ = makeString("~A is not a ~A");
        $ic30$ = makeSymbol("S#11592", "CYC");
        $ic31$ = makeKeyword("CERROR");
        $ic32$ = makeString("continue anyway");
        $ic33$ = makeKeyword("WARN");
        $ic34$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic35$ = makeString("~A is neither SET-P nor LISTP.");
        $ic36$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic37$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic38$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic39$ = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-ITERATE");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("S#34049", "CYC"), makeKeyword("COST"), makeSymbol("S#34073", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34076", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <non-fort> <object>) where <object> is a FORT\n from (#$relationAllInstance <predicate> <collection> <object>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender ?WHO #$Masculine)\n from (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)") });
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?VALUE"), (SubLObject)makeSymbol("?COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?OBJ"), (SubLObject)makeSymbol("?COL"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?VALUE"), (SubLObject)makeSymbol("?OBJ")));
        $ic42$ = makeSymbol("S#34107", "CYC");
        $ic43$ = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34085", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34108", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34086", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationInstanceAll <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationInstanceAll #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationInstanceAll #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });
        $ic45$ = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#34050", "CYC"), makeKeyword("COST"), makeSymbol("S#34091", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34092", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <fort or naut>)\nfrom (#$relationInstanceAll <predicate> <value> <collection>) \nand (#$isa <fort> <collection>)") });
        $ic47$ = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-ITERATE");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34051", "CYC"), makeKeyword("COST"), makeSymbol("S#34096", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34099", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT\n from (#$relationInstanceAll <predicate> <object> <collection>)\n by iterating over <collection>"), makeKeyword("EXAMPLE"), makeString("(subsetOf TheEmptySet ?WHAT) \n from\n   (relationInstanceAll subsetOf TheEmptySet SetOrCollection)") });
    }
    
    public static final class $f30825$UnaryFunction extends UnaryFunction
    {
        public $f30825$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34048"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f30825(var6, (SubLObject)$f30825$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30825$BinaryFunction extends BinaryFunction
    {
        public $f30825$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34048"));
        }
        
        public SubLObject processItem(final SubLObject var6, final SubLObject var7) {
            return f30825(var6, var7);
        }
    }
    
    public static final class $f30831$UnaryFunction extends UnaryFunction
    {
        public $f30831$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34049"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f30831(var6, (SubLObject)$f30831$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30831$BinaryFunction extends BinaryFunction
    {
        public $f30831$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34049"));
        }
        
        public SubLObject processItem(final SubLObject var6, final SubLObject var7) {
            return f30831(var6, var7);
        }
    }
    
    public static final class $f30850$UnaryFunction extends UnaryFunction
    {
        public $f30850$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34050"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f30850(var6, (SubLObject)$f30850$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30850$BinaryFunction extends BinaryFunction
    {
        public $f30850$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34050"));
        }
        
        public SubLObject processItem(final SubLObject var6, final SubLObject var7) {
            return f30850(var6, var7);
        }
    }
    
    public static final class $f30856$UnaryFunction extends UnaryFunction
    {
        public $f30856$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34051"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f30856(var6, (SubLObject)$f30856$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30856$BinaryFunction extends BinaryFunction
    {
        public $f30856$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34051"));
        }
        
        public SubLObject processItem(final SubLObject var6, final SubLObject var7) {
            return f30856(var6, var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2865 ms
	
	Decompiled with Procyon 0.5.32.
*/