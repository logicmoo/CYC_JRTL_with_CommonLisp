package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0536 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0536";
    public static final String myFingerPrint = "15f2e35a1b5b77906c078433c15ab9b29c4686b88eaad0d9a41e20e5aca23b52";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    
    public static SubLObject f33283(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != module0361.f24171(module0363.f24507(var2)) && NIL != module0377.f26746(var1) && NIL != module0226.f15163(module0377.f26749(var1)) && NIL != f33284(var3));
    }
    
    public static SubLObject f33284(final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var4) {
            SubLObject var5 = var3;
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL == var4 && NIL != var5) {
                if ((NIL != module0373.f26177(var6) && NIL != module0340.f22846(module0373.f26181(var6))) || NIL != f33284(module0366.f24938(var6))) {
                    var4 = (SubLObject)T;
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return var4;
    }
    
    public static SubLObject f33285(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic0$;
        }
        final SubLObject var10 = module0205.f13333(var7);
        if (NIL == module0173.f10955(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL != f33286(var10, var8)) {
            return (SubLObject)NIL;
        }
        if (NIL != f33287(var10, var8)) {
            return (SubLObject)NIL;
        }
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        SubLObject var13;
        final SubLObject var12 = var13 = module0205.f13207(var7, (SubLObject)$ic1$);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
            if (!var11.isZero()) {
                if (NIL != module0193.f12105(var14)) {
                    if (NIL != f33288(var10, var14, var11, var8) || NIL != f33289(var10, var14, var11, var8) || NIL != module0226.f14852(var10, var11, var8)) {
                        return (SubLObject)NIL;
                    }
                }
                else if (NIL != f33290(var10, var11, var8)) {
                    return (SubLObject)NIL;
                }
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        if (NIL != f33291(var7, var8)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f33291(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0373.f26113();
        final SubLObject var11 = module0361.f24330(var10);
        SubLObject var12 = (SubLObject)NIL;
        if (NIL != module0377.f26746(var11)) {
            final SubLObject var13 = module0377.f26747(var11);
            final SubLObject var14 = module0233.f15361(var13, var7);
            final SubLObject var15 = module0377.f26754(var11);
            final SubLObject var16 = module0370.f25849(var15);
            final SubLObject var17 = module0147.$g2095$.currentBinding(var9);
            final SubLObject var18 = module0147.$g2094$.currentBinding(var9);
            final SubLObject var19 = module0147.$g2096$.currentBinding(var9);
            try {
                module0147.$g2095$.bind(module0147.f9545(var8), var9);
                module0147.$g2094$.bind(module0147.f9546(var8), var9);
                module0147.$g2096$.bind(module0147.f9549(var8), var9);
                if (NIL == var12) {
                    SubLObject var20 = var16;
                    SubLObject var21 = (SubLObject)NIL;
                    var21 = var20.first();
                    while (NIL == var12 && NIL != var20) {
                        SubLObject var23;
                        final SubLObject var22 = var23 = var21;
                        SubLObject var24 = (SubLObject)NIL;
                        SubLObject var25 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic2$);
                        var24 = var23.first();
                        var23 = var23.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic2$);
                        var25 = var23.first();
                        var23 = var23.rest();
                        if (NIL == var23) {
                            if (module0205.f13136(var25).eql($ic3$) && NIL != module0234.f15434(var14, module0205.f13203(var25, (SubLObject)UNPROVIDED)) && NIL != module0147.f9507(var24)) {
                                var12 = (SubLObject)T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic2$);
                        }
                        var20 = var20.rest();
                        var21 = var20.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var19, var9);
                module0147.$g2094$.rebind(var18, var9);
                module0147.$g2095$.rebind(var17, var9);
            }
        }
        return var12;
    }
    
    public static SubLObject f33286(final SubLObject var32, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0259.f16854(var32, $ic4$, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33287(final SubLObject var10, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0259.f16854(var10, $ic5$, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33292(final SubLObject var33, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0259.f16854(var33, $ic6$, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33290(final SubLObject var10, final SubLObject var11, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0220.f14582($ic7$, var10, var11, var8, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic8$);
    }
    
    public static SubLObject f33288(final SubLObject var10, final SubLObject var34, final SubLObject var11, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = module0202.f12769($ic9$, var10, var34, var11);
        SubLObject var37 = (SubLObject)NIL;
        final SubLObject var38 = var8;
        final SubLObject var39 = module0147.$g2094$.currentBinding(var35);
        final SubLObject var40 = module0147.$g2095$.currentBinding(var35);
        try {
            module0147.$g2094$.bind(module0147.f9531(var38), var35);
            module0147.$g2095$.bind(module0147.f9534(var38), var35);
            final SubLObject var41 = module0217.f14404(var36, (SubLObject)$ic8$, (SubLObject)NIL);
            final SubLObject var43;
            final SubLObject var42 = var43 = module0158.f10294(var41);
            if (var43.eql((SubLObject)$ic10$)) {
                var35.resetMultipleValues();
                final SubLObject var44 = module0158.f10297(var41);
                final SubLObject var40_41 = var35.secondMultipleValue();
                final SubLObject var42_43 = var35.thirdMultipleValue();
                var35.resetMultipleValues();
                if (NIL != var40_41) {
                    if (NIL != var42_43) {
                        final SubLObject var45 = var42_43;
                        if (NIL != module0158.f10010(var44, var40_41, var45)) {
                            final SubLObject var46 = module0158.f10011(var44, var40_41, var45);
                            SubLObject var47 = var37;
                            final SubLObject var48 = (SubLObject)NIL;
                            while (NIL == var47) {
                                final SubLObject var49 = module0052.f3695(var46, var48);
                                final SubLObject var50 = (SubLObject)makeBoolean(!var48.eql(var49));
                                if (NIL != var50) {
                                    SubLObject var51 = (SubLObject)NIL;
                                    try {
                                        var51 = module0158.f10316(var49, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                                        SubLObject var46_51 = var37;
                                        final SubLObject var47_52 = (SubLObject)NIL;
                                        while (NIL == var46_51) {
                                            final SubLObject var52 = module0052.f3695(var51, var47_52);
                                            final SubLObject var49_54 = (SubLObject)makeBoolean(!var47_52.eql(var52));
                                            if (NIL != var49_54 && var36.equal(module0178.f11285(var52))) {
                                                var37 = (SubLObject)T;
                                            }
                                            var46_51 = (SubLObject)makeBoolean(NIL == var49_54 || NIL != var37);
                                        }
                                    }
                                    finally {
                                        final SubLObject var24_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                            if (NIL != var51) {
                                                module0158.f10319(var51);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var24_55, var35);
                                        }
                                    }
                                }
                                var47 = (SubLObject)makeBoolean(NIL == var50 || NIL != var37);
                            }
                        }
                    }
                    else {
                        final SubLObject var45 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var44, var40_41, var45)) {
                            final SubLObject var46 = module0158.f10011(var44, var40_41, var45);
                            SubLObject var47 = var37;
                            final SubLObject var48 = (SubLObject)NIL;
                            while (NIL == var47) {
                                final SubLObject var49 = module0052.f3695(var46, var48);
                                final SubLObject var50 = (SubLObject)makeBoolean(!var48.eql(var49));
                                if (NIL != var50) {
                                    SubLObject var51 = (SubLObject)NIL;
                                    try {
                                        var51 = module0158.f10316(var49, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                                        SubLObject var46_52 = var37;
                                        final SubLObject var47_53 = (SubLObject)NIL;
                                        while (NIL == var46_52) {
                                            final SubLObject var52 = module0052.f3695(var51, var47_53);
                                            final SubLObject var49_55 = (SubLObject)makeBoolean(!var47_53.eql(var52));
                                            if (NIL != var49_55 && var36.equal(module0178.f11285(var52))) {
                                                var37 = (SubLObject)T;
                                            }
                                            var46_52 = (SubLObject)makeBoolean(NIL == var49_55 || NIL != var37);
                                        }
                                    }
                                    finally {
                                        final SubLObject var24_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                            if (NIL != var51) {
                                                module0158.f10319(var51);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var24_56, var35);
                                        }
                                    }
                                }
                                var47 = (SubLObject)makeBoolean(NIL == var50 || NIL != var37);
                            }
                        }
                    }
                }
                else if (NIL != var42_43) {
                    final SubLObject var45 = var42_43;
                    if (NIL != module0158.f10010(var44, (SubLObject)NIL, var45)) {
                        final SubLObject var46 = module0158.f10011(var44, (SubLObject)NIL, var45);
                        SubLObject var47 = var37;
                        final SubLObject var48 = (SubLObject)NIL;
                        while (NIL == var47) {
                            final SubLObject var49 = module0052.f3695(var46, var48);
                            final SubLObject var50 = (SubLObject)makeBoolean(!var48.eql(var49));
                            if (NIL != var50) {
                                SubLObject var51 = (SubLObject)NIL;
                                try {
                                    var51 = module0158.f10316(var49, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                                    SubLObject var46_53 = var37;
                                    final SubLObject var47_54 = (SubLObject)NIL;
                                    while (NIL == var46_53) {
                                        final SubLObject var52 = module0052.f3695(var51, var47_54);
                                        final SubLObject var49_56 = (SubLObject)makeBoolean(!var47_54.eql(var52));
                                        if (NIL != var49_56 && var36.equal(module0178.f11285(var52))) {
                                            var37 = (SubLObject)T;
                                        }
                                        var46_53 = (SubLObject)makeBoolean(NIL == var49_56 || NIL != var37);
                                    }
                                }
                                finally {
                                    final SubLObject var24_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                        if (NIL != var51) {
                                            module0158.f10319(var51);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var24_57, var35);
                                    }
                                }
                            }
                            var47 = (SubLObject)makeBoolean(NIL == var50 || NIL != var37);
                        }
                    }
                }
                else {
                    final SubLObject var45 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var44, (SubLObject)NIL, var45)) {
                        final SubLObject var46 = module0158.f10011(var44, (SubLObject)NIL, var45);
                        SubLObject var47 = var37;
                        final SubLObject var48 = (SubLObject)NIL;
                        while (NIL == var47) {
                            final SubLObject var49 = module0052.f3695(var46, var48);
                            final SubLObject var50 = (SubLObject)makeBoolean(!var48.eql(var49));
                            if (NIL != var50) {
                                SubLObject var51 = (SubLObject)NIL;
                                try {
                                    var51 = module0158.f10316(var49, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                                    SubLObject var46_54 = var37;
                                    final SubLObject var47_55 = (SubLObject)NIL;
                                    while (NIL == var46_54) {
                                        final SubLObject var52 = module0052.f3695(var51, var47_55);
                                        final SubLObject var49_57 = (SubLObject)makeBoolean(!var47_55.eql(var52));
                                        if (NIL != var49_57 && var36.equal(module0178.f11285(var52))) {
                                            var37 = (SubLObject)T;
                                        }
                                        var46_54 = (SubLObject)makeBoolean(NIL == var49_57 || NIL != var37);
                                    }
                                }
                                finally {
                                    final SubLObject var24_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                        if (NIL != var51) {
                                            module0158.f10319(var51);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var24_58, var35);
                                    }
                                }
                            }
                            var47 = (SubLObject)makeBoolean(NIL == var50 || NIL != var37);
                        }
                    }
                }
            }
            else if (var43.eql((SubLObject)$ic12$)) {
                final SubLObject var53 = module0158.f10299(var41);
                if (NIL != module0158.f10038(var53)) {
                    final SubLObject var54 = (SubLObject)NIL;
                    final SubLObject var24_59 = module0012.$g73$.currentBinding(var35);
                    final SubLObject var25_71 = module0012.$g65$.currentBinding(var35);
                    final SubLObject var55 = module0012.$g67$.currentBinding(var35);
                    final SubLObject var56 = module0012.$g68$.currentBinding(var35);
                    final SubLObject var57 = module0012.$g66$.currentBinding(var35);
                    final SubLObject var58 = module0012.$g69$.currentBinding(var35);
                    final SubLObject var59 = module0012.$g70$.currentBinding(var35);
                    final SubLObject var60 = module0012.$silent_progressP$.currentBinding(var35);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var35);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var35), var35);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var35);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var35);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var35);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var35);
                        module0012.$g70$.bind((SubLObject)T, var35);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var54) ? module0012.$silent_progressP$.getDynamicValue(var35) : T), var35);
                        module0012.f474(var54);
                        final SubLObject var61 = module0158.f10039(var53);
                        SubLObject var62 = var37;
                        final SubLObject var63 = (SubLObject)NIL;
                        while (NIL == var62) {
                            final SubLObject var64 = module0052.f3695(var61, var63);
                            final SubLObject var65 = (SubLObject)makeBoolean(!var63.eql(var64));
                            if (NIL != var65) {
                                module0012.f476();
                                SubLObject var66 = (SubLObject)NIL;
                                try {
                                    var66 = module0158.f10316(var64, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                                    SubLObject var46_55 = var37;
                                    final SubLObject var47_56 = (SubLObject)NIL;
                                    while (NIL == var46_55) {
                                        final SubLObject var67 = module0052.f3695(var66, var47_56);
                                        final SubLObject var49_58 = (SubLObject)makeBoolean(!var47_56.eql(var67));
                                        if (NIL != var49_58 && var36.equal(module0178.f11285(var67))) {
                                            var37 = (SubLObject)T;
                                        }
                                        var46_55 = (SubLObject)makeBoolean(NIL == var49_58 || NIL != var37);
                                    }
                                }
                                finally {
                                    final SubLObject var24_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                        if (NIL != var66) {
                                            module0158.f10319(var66);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var24_60, var35);
                                    }
                                }
                            }
                            var62 = (SubLObject)makeBoolean(NIL == var65 || NIL != var37);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var60, var35);
                        module0012.$g70$.rebind(var59, var35);
                        module0012.$g69$.rebind(var58, var35);
                        module0012.$g66$.rebind(var57, var35);
                        module0012.$g68$.rebind(var56, var35);
                        module0012.$g67$.rebind(var55, var35);
                        module0012.$g65$.rebind(var25_71, var35);
                        module0012.$g73$.rebind(var24_59, var35);
                    }
                }
            }
            else if (var43.eql((SubLObject)$ic13$)) {
                SubLObject var68;
                SubLObject var69;
                for (var68 = (SubLObject)NIL, var68 = module0218.f14453(module0158.f10301(var41), (SubLObject)UNPROVIDED); NIL == var37 && NIL != var68; var68 = var68.rest()) {
                    var69 = var68.first();
                    if (NIL != module0178.f11343(var69, (SubLObject)$ic8$) && var36.equal(module0178.f11285(var69))) {
                        var37 = (SubLObject)T;
                    }
                }
            }
            else {
                module0158.f10295(var41, var42);
            }
        }
        finally {
            module0147.$g2095$.rebind(var40, var35);
            module0147.$g2094$.rebind(var39, var35);
        }
        return var37;
    }
    
    public static SubLObject f33289(final SubLObject var10, final SubLObject var34, final SubLObject var11, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = var8;
        final SubLObject var38 = module0147.$g2094$.currentBinding(var35);
        final SubLObject var39 = module0147.$g2095$.currentBinding(var35);
        try {
            module0147.$g2094$.bind(module0147.f9531(var37), var35);
            module0147.$g2095$.bind(module0147.f9534(var37), var35);
            final SubLObject var40 = $ic14$;
            if (NIL != module0158.f10010(var10, (SubLObject)ONE_INTEGER, var40)) {
                final SubLObject var41 = module0158.f10011(var10, (SubLObject)ONE_INTEGER, var40);
                SubLObject var42 = var36;
                final SubLObject var43 = (SubLObject)NIL;
                while (NIL == var42) {
                    final SubLObject var44 = module0052.f3695(var41, var43);
                    final SubLObject var45 = (SubLObject)makeBoolean(!var43.eql(var44));
                    if (NIL != var45) {
                        SubLObject var46 = (SubLObject)NIL;
                        try {
                            var46 = module0158.f10316(var44, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)NIL);
                            SubLObject var46_83 = var36;
                            final SubLObject var47_84 = (SubLObject)NIL;
                            while (NIL == var46_83) {
                                final SubLObject var47 = module0052.f3695(var46, var47_84);
                                final SubLObject var49_85 = (SubLObject)makeBoolean(!var47_84.eql(var47));
                                if (NIL != var49_85 && var11.numE(module0178.f11336(var47))) {
                                    final SubLObject var48 = module0178.f11335(var47);
                                    if (NIL != module0259.f16854(var34, var48, var8, (SubLObject)UNPROVIDED)) {
                                        var36 = (SubLObject)T;
                                    }
                                }
                                var46_83 = (SubLObject)makeBoolean(NIL == var49_85 || NIL != var36);
                            }
                        }
                        finally {
                            final SubLObject var24_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var35);
                                if (NIL != var46) {
                                    module0158.f10319(var46);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var24_86, var35);
                            }
                        }
                    }
                    var42 = (SubLObject)makeBoolean(NIL == var45 || NIL != var36);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var39, var35);
            module0147.$g2094$.rebind(var38, var35);
        }
        return var36;
    }
    
    public static SubLObject f33293(final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var87) {
        if (NIL == module0193.f12105(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13332(var7, $ic15$)) {
            return (SubLObject)makeBoolean(NIL == f33294(var7, var8, var9));
        }
        if (NIL != module0205.f13332(var7, $ic16$)) {
            return (SubLObject)makeBoolean(NIL == f33295(var7, var8));
        }
        if (NIL == var87 && NIL != f33296(var7, var8, var9)) {
            return (SubLObject)NIL;
        }
        return f33297(var7, var8);
    }
    
    public static SubLObject f33297(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0144.$g1796$.currentBinding(var9);
        final SubLObject var12 = module0144.$g1795$.currentBinding(var9);
        final SubLObject var13 = module0152.$g2116$.currentBinding(var9);
        final SubLObject var14 = module0152.$g2115$.currentBinding(var9);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var9);
            module0144.$g1795$.bind((SubLObject)NIL, var9);
            module0152.$g2116$.bind((SubLObject)NIL, var9);
            module0152.$g2115$.bind((SubLObject)NIL, var9);
            if (NIL == module0206.f13425(var7)) {
                var10 = (SubLObject)NIL;
            }
            else if (NIL != module0226.f14796(module0205.f13333(var7)) && NIL != module0331.f22370(module0205.f13326(var7, (SubLObject)ONE_INTEGER), module0205.f13326(var7, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)NIL;
            }
            else {
                final SubLObject var24_89 = module0144.$g1771$.currentBinding(var9);
                try {
                    module0144.$g1771$.bind((SubLObject)NIL, var9);
                    var10 = module0309.f20927(var7, var8);
                }
                finally {
                    module0144.$g1771$.rebind(var24_89, var9);
                }
            }
        }
        finally {
            module0152.$g2115$.rebind(var14, var9);
            module0152.$g2116$.rebind(var13, var9);
            module0144.$g1795$.rebind(var12, var9);
            module0144.$g1796$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f33296(final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        final SubLObject var10 = (SubLObject)$ic17$;
        if (var9.eql((SubLObject)$ic0$)) {
            return module0035.sublisp_boolean(module0347.f23334(var7, var8, (SubLObject)$ic18$, var10));
        }
        if (var9.eql((SubLObject)$ic19$)) {
            return module0035.sublisp_boolean(module0347.f23334(var7, var8, (SubLObject)$ic8$, var10));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33294(final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        if (NIL == module0202.f12689(var7, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var10 = module0202.f12834(var7, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        if (NIL != module0259.f16854(var10, var11, var8, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return module0305.f20444(var10, var11, var8);
    }
    
    public static SubLObject f33295(final SubLObject var7, final SubLObject var8) {
        if (NIL == module0202.f12689(var7, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var9 = module0202.f12834(var7, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        return module0257.f16692(var9, var10, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33298() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33283", "S#29250", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33284", "S#36741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33285", "S#34285", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33291", "S#36742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33286", "S#36743", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33287", "S#36744", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33292", "S#34311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33290", "S#36745", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33288", "S#36746", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33289", "S#36747", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33293", "S#34287", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33297", "S#36748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33296", "S#36749", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33294", "S#36750", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0536", "f33295", "S#36751", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33299() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33300() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33298();
    }
    
    public void initializeVariables() {
        f33299();
    }
    
    public void runTopLevelForms() {
        f33300();
    }
    
    static {
        me = (SubLFile)new module0536();
        $ic0$ = makeKeyword("POS");
        $ic1$ = makeKeyword("IGNORE");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#36752", "CYC"), (SubLObject)makeSymbol("S#36753", "CYC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("nonAbducibleSentence"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("NonAbducibleRelation"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("NonAbduciblePredicate"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("NonAbducibleCollection"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("notAbducibleForArg"));
        $ic8$ = makeKeyword("TRUE");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("notAbducibleWRTValueInArg"));
        $ic10$ = makeKeyword("GAF-ARG");
        $ic11$ = makeKeyword("GAF");
        $ic12$ = makeKeyword("PREDICATE-EXTENT");
        $ic13$ = makeKeyword("OVERLAP");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("notAbducibleWRTTypeInArg"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-SUBTYPE"), (SubLObject)makeKeyword("ABDUCTION"))));
        $ic18$ = makeKeyword("FALSE");
        $ic19$ = makeKeyword("NEG");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 596 ms
	
	Decompiled with Procyon 0.5.32.
*/