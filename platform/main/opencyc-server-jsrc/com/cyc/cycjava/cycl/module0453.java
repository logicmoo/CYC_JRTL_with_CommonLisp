package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0453 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0453";
    public static final String myFingerPrint = "9647f59eb4b26148ec1a4022c432fb1066d003a8aac9785e831b59ccbbe4ccbc";
    private static SubLSymbol $g3588$;
    private static SubLSymbol $g3589$;
    private static SubLSymbol $g3590$;
    private static SubLSymbol $g3591$;
    private static SubLSymbol $g3592$;
    private static SubLSymbol $g3593$;
    private static SubLSymbol $g3594$;
    private static SubLSymbol $g3595$;
    private static SubLSymbol $g3596$;
    private static SubLSymbol $g3597$;
    private static SubLSymbol $g3598$;
    private static SubLSymbol $g3599$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLFloat $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLList $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    
    public static SubLObject f31050(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0206.f13453(var4) && NIL != f31051(module0205.f13276(var4))) {
            return (SubLObject)$ic14$;
        }
        if (NIL != module0269.f17710(var4)) {
            return module0358.f23690(f31052(var4));
        }
        return (SubLObject)$ic15$;
    }
    
    public static SubLObject f31053(final SubLObject var5, final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0147.f9540(var7);
        final SubLObject var11 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var13 = module0147.$g2096$.currentBinding(var8);
        try {
            module0147.$g2095$.bind(module0147.f9545(var10), var8);
            module0147.$g2094$.bind(module0147.f9546(var10), var8);
            module0147.$g2096$.bind(module0147.f9549(var10), var8);
            if (NIL != module0173.f10955(var5) && NIL != module0349.f23386(var6, (SubLObject)UNPROVIDED)) {
                var9 = module0259.f16851(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var13, var8);
            module0147.$g2094$.rebind(var12, var8);
            module0147.$g2095$.rebind(var11, var8);
        }
        return var9;
    }
    
    public static SubLObject f31054(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)UNPROVIDED))) {
            return $g3588$.getGlobalValue();
        }
        return $g3589$.getGlobalValue();
    }
    
    public static SubLObject f31055(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31056(var1);
    }
    
    public static SubLObject f31057(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31058(var1);
    }
    
    public static SubLObject f31059(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31060(var1);
    }
    
    public static SubLObject f31058(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (!module0228.f15210(var2).numGE((SubLObject)$ic25$) && NIL != module0259.f16854(var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31056(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g646$.getDynamicValue(var2)) {
            return f31054(var1, (SubLObject)UNPROVIDED);
        }
        return $g3590$.getDynamicValue(var2);
    }
    
    public static SubLObject f31060(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL != module0018.$g646$.getDynamicValue(var2) && NIL == module0259.f16854(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic28$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0259.f16909(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31061(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0018.$g658$.getDynamicValue(var15);
    }
    
    public static SubLObject f31062(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31063(var1, var14);
    }
    
    public static SubLObject f31064(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != module0193.f12105(module0205.f13387(var1, (SubLObject)UNPROVIDED))) {
            return module0018.$g658$.getDynamicValue(var15);
        }
        return module0217.f14406(var1, (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31063(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0349.f23449(var1, var14);
        final SubLObject var18;
        final SubLObject var17 = var18 = module0158.f10294(var16);
        if (var18.eql((SubLObject)$ic34$)) {
            var15.resetMultipleValues();
            final SubLObject var19 = module0158.f10297(var16);
            final SubLObject var20 = var15.secondMultipleValue();
            final SubLObject var21 = var15.thirdMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var20) {
                if (NIL != var21) {
                    final SubLObject var22 = var21;
                    if (NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = (SubLObject)NIL;
                        final SubLObject var25 = (SubLObject)NIL;
                        while (NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                            if (NIL != var27) {
                                SubLObject var28 = (SubLObject)NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)$ic35$, module0130.f8518(var14), (SubLObject)NIL);
                                    SubLObject var29_34 = (SubLObject)NIL;
                                    final SubLObject var30_35 = (SubLObject)NIL;
                                    while (NIL == var29_34) {
                                        final SubLObject var29 = module0052.f3695(var28, var30_35);
                                        final SubLObject var32_37 = (SubLObject)makeBoolean(!var30_35.eql(var29));
                                        if (NIL != var32_37) {
                                            module0436.f30642(var29, var1);
                                        }
                                        var29_34 = (SubLObject)makeBoolean(NIL == var32_37);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                        if (NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var15);
                                    }
                                }
                            }
                            var24 = (SubLObject)makeBoolean(NIL == var27);
                        }
                    }
                }
                else {
                    final SubLObject var22 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = (SubLObject)NIL;
                        final SubLObject var25 = (SubLObject)NIL;
                        while (NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                            if (NIL != var27) {
                                SubLObject var28 = (SubLObject)NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)$ic35$, module0130.f8518(var14), (SubLObject)NIL);
                                    SubLObject var29_35 = (SubLObject)NIL;
                                    final SubLObject var30_36 = (SubLObject)NIL;
                                    while (NIL == var29_35) {
                                        final SubLObject var29 = module0052.f3695(var28, var30_36);
                                        final SubLObject var32_38 = (SubLObject)makeBoolean(!var30_36.eql(var29));
                                        if (NIL != var32_38) {
                                            module0436.f30642(var29, var1);
                                        }
                                        var29_35 = (SubLObject)makeBoolean(NIL == var32_38);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                        if (NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31, var15);
                                    }
                                }
                            }
                            var24 = (SubLObject)makeBoolean(NIL == var27);
                        }
                    }
                }
            }
            else if (NIL != var21) {
                final SubLObject var22 = var21;
                if (NIL != module0158.f10010(var19, (SubLObject)NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)NIL, var22);
                    SubLObject var24 = (SubLObject)NIL;
                    final SubLObject var25 = (SubLObject)NIL;
                    while (NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                        if (NIL != var27) {
                            SubLObject var28 = (SubLObject)NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)$ic35$, module0130.f8518(var14), (SubLObject)NIL);
                                SubLObject var29_36 = (SubLObject)NIL;
                                final SubLObject var30_37 = (SubLObject)NIL;
                                while (NIL == var29_36) {
                                    final SubLObject var29 = module0052.f3695(var28, var30_37);
                                    final SubLObject var32_39 = (SubLObject)makeBoolean(!var30_37.eql(var29));
                                    if (NIL != var32_39) {
                                        module0436.f30642(var29, var1);
                                    }
                                    var29_36 = (SubLObject)makeBoolean(NIL == var32_39);
                                }
                            }
                            finally {
                                final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var32, var15);
                                }
                            }
                        }
                        var24 = (SubLObject)makeBoolean(NIL == var27);
                    }
                }
            }
            else {
                final SubLObject var22 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var19, (SubLObject)NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)NIL, var22);
                    SubLObject var24 = (SubLObject)NIL;
                    final SubLObject var25 = (SubLObject)NIL;
                    while (NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                        if (NIL != var27) {
                            SubLObject var28 = (SubLObject)NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)$ic35$, module0130.f8518(var14), (SubLObject)NIL);
                                SubLObject var29_37 = (SubLObject)NIL;
                                final SubLObject var30_38 = (SubLObject)NIL;
                                while (NIL == var29_37) {
                                    final SubLObject var29 = module0052.f3695(var28, var30_38);
                                    final SubLObject var32_40 = (SubLObject)makeBoolean(!var30_38.eql(var29));
                                    if (NIL != var32_40) {
                                        module0436.f30642(var29, var1);
                                    }
                                    var29_37 = (SubLObject)makeBoolean(NIL == var32_40);
                                }
                            }
                            finally {
                                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var15);
                                }
                            }
                        }
                        var24 = (SubLObject)makeBoolean(NIL == var27);
                    }
                }
            }
        }
        else if (var18.eql((SubLObject)$ic36$)) {
            final SubLObject var34 = module0158.f10299(var16);
            if (NIL != module0158.f10038(var34)) {
                final SubLObject var35 = (SubLObject)NIL;
                final SubLObject var36 = module0012.$g73$.currentBinding(var15);
                final SubLObject var37 = module0012.$g65$.currentBinding(var15);
                final SubLObject var38 = module0012.$g67$.currentBinding(var15);
                final SubLObject var39 = module0012.$g68$.currentBinding(var15);
                final SubLObject var40 = module0012.$g66$.currentBinding(var15);
                final SubLObject var41 = module0012.$g69$.currentBinding(var15);
                final SubLObject var42 = module0012.$g70$.currentBinding(var15);
                final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var15);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var15);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var15), var15);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var15);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var15);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var15);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var15);
                    module0012.$g70$.bind((SubLObject)T, var15);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var15) : T), var15);
                    module0012.f474(var35);
                    final SubLObject var44 = module0158.f10039(var34);
                    SubLObject var45 = (SubLObject)NIL;
                    final SubLObject var46 = (SubLObject)NIL;
                    while (NIL == var45) {
                        final SubLObject var47 = module0052.f3695(var44, var46);
                        final SubLObject var48 = (SubLObject)makeBoolean(!var46.eql(var47));
                        if (NIL != var48) {
                            module0012.f476();
                            SubLObject var49 = (SubLObject)NIL;
                            try {
                                var49 = module0158.f10316(var47, (SubLObject)$ic35$, module0130.f8518(var14), (SubLObject)NIL);
                                SubLObject var29_38 = (SubLObject)NIL;
                                final SubLObject var30_39 = (SubLObject)NIL;
                                while (NIL == var29_38) {
                                    final SubLObject var50 = module0052.f3695(var49, var30_39);
                                    final SubLObject var32_41 = (SubLObject)makeBoolean(!var30_39.eql(var50));
                                    if (NIL != var32_41) {
                                        module0436.f30642(var50, var1);
                                    }
                                    var29_38 = (SubLObject)makeBoolean(NIL == var32_41);
                                }
                            }
                            finally {
                                final SubLObject var11_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var49) {
                                        module0158.f10319(var49);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var11_58, var15);
                                }
                            }
                        }
                        var45 = (SubLObject)makeBoolean(NIL == var48);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var43, var15);
                    module0012.$g70$.rebind(var42, var15);
                    module0012.$g69$.rebind(var41, var15);
                    module0012.$g66$.rebind(var40, var15);
                    module0012.$g68$.rebind(var39, var15);
                    module0012.$g67$.rebind(var38, var15);
                    module0012.$g65$.rebind(var37, var15);
                    module0012.$g73$.rebind(var36, var15);
                }
            }
        }
        else if (var18.eql((SubLObject)$ic37$)) {
            SubLObject var51 = module0218.f14453(module0158.f10301(var16), (SubLObject)UNPROVIDED);
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                if (NIL == module0130.f8518(var14) || NIL != module0178.f11343(var52, module0130.f8518(var14))) {
                    module0436.f30642(var52, var1);
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        else {
            module0158.f10295(var16, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31065(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)UNPROVIDED))) {
            return $g3591$.getGlobalValue();
        }
        return $g3592$.getGlobalValue();
    }
    
    public static SubLObject f31066(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return module0435.f30613(f31065(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31067(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31068(var1);
    }
    
    public static SubLObject f31069(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31070(var1);
    }
    
    public static SubLObject f31071(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0305.f20485(module0205.f13388(var1, (SubLObject)UNPROVIDED)) || NIL != module0305.f20523(module0205.f13388(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f31068(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL == module0259.f16854(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var7 = module0144.$g1870$.currentBinding(var2);
                try {
                    module0144.$g1870$.bind((SubLObject)NIL, var2);
                    if (NIL != module0305.f20414(var6, var5, (SubLObject)NIL)) {
                        module0347.f23330(module0191.f11990((SubLObject)$ic42$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0144.$g1870$.rebind(var7, var2);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31070(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0305.f20416(var3, var2, (SubLObject)NIL)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic42$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31072(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13333(var1);
        final SubLObject var17 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        SubLObject var20;
        final SubLObject var19 = var20 = Sort.sort(module0259.f16840(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic45$, (SubLObject)UNPROVIDED);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            var15.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var18, var21, (SubLObject)T, (SubLObject)T);
            final SubLObject var23 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var18);
                final SubLObject var25 = module0202.f12768(var16, var17, var24);
                module0347.f23330(module0191.f11990((SubLObject)$ic26$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31073(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        return f31074(var15);
    }
    
    public static SubLObject f31075(final SubLObject var1) {
        return f31052(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31052(final SubLObject var18) {
        if (NIL == module0173.f10955(var18)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != module0305.f20485(var18) || NIL != module0305.f20523(var18)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != module0226.f14858(var18, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic48$;
        }
        return (SubLObject)$ic47$;
    }
    
    public static SubLObject f31076(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0549.f33895(var18).numG($g3593$.getDynamicValue(var19))) {
            return module0227.f15190(var18);
        }
        return module0052.f3709(module0259.f16846(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31074(final SubLObject var18) {
        final SubLObject var19 = module0549.f33912(var18);
        return var19.isZero() ? module0217.f14223(var18, (SubLObject)TWO_INTEGER, $ic0$) : var19;
    }
    
    public static SubLObject f31077(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        var19 = var16.first();
        var16 = (var20 = var16.rest());
        var16 = var18;
        if (NIL == var16) {
            if (NIL != module0004.f104(var17, var20, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic54$, var1, module0147.f9551(), (SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic53$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31078(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic53$);
        var19 = var16.first();
        var16 = (var20 = var16.rest());
        var16 = var18;
        if (NIL == var16) {
            if (NIL == module0004.f104(var17, var20, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic54$, module0205.f13338(var1), module0147.f9551(), (SubLObject)$ic55$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic53$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31079(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31058(var1);
    }
    
    public static SubLObject f31080(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31068(var1);
    }
    
    public static SubLObject f31081(final SubLObject var1) {
        return module0436.f30638(var1);
    }
    
    public static SubLObject f31082(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31056(var1);
    }
    
    public static SubLObject f31083(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31060(var1);
    }
    
    public static SubLObject f31084(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31070(var1);
    }
    
    public static SubLObject f31085(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return module0436.f30640(var1, var14);
    }
    
    public static SubLObject f31086(final SubLObject var1) {
        return module0436.f30639(var1);
    }
    
    public static SubLObject f31087(final SubLObject var1) {
        return module0436.f30641(var1);
    }
    
    public static SubLObject f31088(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var18 = f31089(var16, var17, (SubLObject)UNPROVIDED);
        final SubLObject var19 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        if (NIL != var18 && NIL != var19) {
            module0347.f23330(module0191.f11990((SubLObject)$ic72$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31089(final SubLObject var71, final SubLObject var78, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = module0205.f13277(var78, (SubLObject)UNPROVIDED);
        final SubLObject var81 = module0205.f13368(var78, (SubLObject)UNPROVIDED);
        final SubLObject var82 = conses_high.subst(var71, var80, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var79.resetMultipleValues();
        final SubLObject var83 = module0349.f23495(var82, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var84 = var79.secondMultipleValue();
        var79.resetMultipleValues();
        if (NIL != module0360.f23871(var84)) {
            Errors.error(module0360.f23876(var84));
            return (SubLObject)NIL;
        }
        if (NIL != module0360.f23867(var84)) {
            return Values.values(var83, (SubLObject)T);
        }
        return Values.values(var83, (SubLObject)NIL);
    }
    
    public static SubLObject f31090(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31088(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31091(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var18 = f31089(var16, var17, (SubLObject)UNPROVIDED);
        final SubLObject var19 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        if (NIL == var18 && NIL != var19) {
            final SubLObject var20 = module0205.f13250(var16, module0205.f13203(var17, (SubLObject)UNPROVIDED), module0205.f13204(var17, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0347.f23330(module0191.f11990((SubLObject)$ic77$, module0205.f13338(var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31092(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31091(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31093(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31072(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31094(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31072(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31095(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return Sequences.length(module0205.f13304(module0205.f13388(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31096(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var17;
        final SubLObject var16 = var17 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic86$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic86$);
        var19 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var89_90;
            final SubLObject var87_88 = var89_90 = var19;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var89_90, var87_88, (SubLObject)$ic87$);
            var20 = var89_90.first();
            var89_90 = var89_90.rest();
            SubLObject var22;
            var21 = (var22 = var89_90);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                var15.resetMultipleValues();
                final SubLObject var24 = module0235.f15474(var18, var23, (SubLObject)T, (SubLObject)T);
                final SubLObject var25 = var15.secondMultipleValue();
                var15.resetMultipleValues();
                if (NIL != var24) {
                    final SubLObject var26 = module0202.f12768($ic52$, module0233.f15361(var24, var18), var19);
                    module0347.f23330(module0191.f11990((SubLObject)$ic54$, var26, module0147.f9551(), (SubLObject)$ic55$), var24, var25);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic86$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31097(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31073(var1, var14);
    }
    
    public static SubLObject f31098(final SubLObject var1) {
        return f31075(var1);
    }
    
    public static SubLObject f31099(final SubLObject var18) {
        return f31076(var18);
    }
    
    public static SubLObject f31100(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return module0436.f30636(var1, var14);
    }
    
    public static SubLObject f31101(final SubLObject var1) {
        return module0436.f30638(var1);
    }
    
    public static SubLObject f31102(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = module0202.f12796(var1);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        var15.resetMultipleValues();
        final SubLObject var19 = module0202.f12796(var18);
        final SubLObject var20 = var15.secondMultipleValue();
        final SubLObject var21 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        final SubLObject var22 = f31103(var20, var21);
        return (NIL != var22) ? var22 : module0351.$g2989$.getDynamicValue(var15);
    }
    
    public static SubLObject f31103(final SubLObject var97, SubLObject var95) {
        if (NIL != module0207.f13522(var95)) {
            var95 = module0202.f12773((SubLObject)ConsesLow.list(var95));
        }
        if (NIL != module0202.f12595(var95)) {
            final SubLObject var98 = module0205.f13207(var95, (SubLObject)UNPROVIDED);
            if (NIL != var98 && NIL != module0035.f2370((SubLObject)$ic94$, module0205.f13207(var95, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
                SubLObject var99 = module0048.f3326();
                SubLObject var100 = var98;
                SubLObject var101 = (SubLObject)NIL;
                var101 = var100.first();
                while (NIL != var100) {
                    final SubLObject var102 = module0205.f13250(module0193.f12079((SubLObject)ZERO_INTEGER), var97, var101, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var103 = module0202.f12826(var102);
                    final SubLObject var104 = module0202.f12828(var102);
                    final SubLObject var105 = module0411.f28638(var103, var104, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0048.f3335(var105, var99)) {
                        var99 = var105;
                    }
                    var100 = var100.rest();
                    var101 = var100.first();
                }
                if (var99.isNumber()) {
                    return var99;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31104(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13333(var1);
        final SubLObject var17 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        SubLObject var20;
        final SubLObject var19 = var20 = module0434.f30598(var18, (SubLObject)$ic95$, (SubLObject)UNPROVIDED);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            var15.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var17, var21, (SubLObject)T, (SubLObject)T);
            final SubLObject var23 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var17);
                final SubLObject var25 = module0202.f12768(var16, var24, var18);
                module0347.f23330(module0191.f11990((SubLObject)$ic72$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31105(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31102(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31106(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31104(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31107(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var17 = module0202.f12796(var16);
        final SubLObject var18 = var15.secondMultipleValue();
        final SubLObject var19 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        if (NIL != module0202.f12589(var19, $ic100$)) {
            var15.resetMultipleValues();
            final SubLObject var20 = module0202.f12796(var19);
            final SubLObject var21 = var15.secondMultipleValue();
            final SubLObject var22 = var15.thirdMultipleValue();
            var15.resetMultipleValues();
            final SubLObject var23 = (SubLObject)ConsesLow.list($ic0$, var21, var18);
            final SubLObject var24 = module0276.f18287((SubLObject)ConsesLow.list(var23, var22), (SubLObject)T);
            final SubLObject var25 = f31103(var21, var24);
            if (NIL != var25) {
                return var25;
            }
        }
        return f31108(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31108(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13277(var15, (SubLObject)UNPROVIDED);
        return Numbers.ceiling(f31074(var16), (SubLObject)TEN_INTEGER);
    }
    
    public static SubLObject f31109(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = module0202.f12796(var1);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        final SubLObject var19 = module0205.f13276(var18);
        final SubLObject var20 = module0220.f14553(var19, $ic101$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic33$);
        if (NIL != var20) {
            final SubLObject var21 = f31110(var20, var1);
            final SubLObject var22 = module0434.f30594(var21, module0147.$g2095$.getDynamicValue(var15), module0434.f30588(module0411.f28655()));
            if (NIL != var22) {
                final SubLObject var23 = (SubLObject)ConsesLow.list(var20);
                if (NIL != module0540.f33533(var22)) {
                    final SubLObject var24 = module0191.f11990((SubLObject)$ic77$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0347.f23330(var24, (SubLObject)NIL, var23);
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var15) && NIL != conses_high.second(var22.first())) {
                        Errors.error((SubLObject)$ic102$, var20);
                    }
                    SubLObject var25 = var22;
                    SubLObject var26 = (SubLObject)NIL;
                    var26 = var25.first();
                    while (NIL != var25) {
                        final SubLObject var27 = module0233.f15362(var26, var21);
                        final SubLObject var28 = module0191.f11990((SubLObject)$ic77$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var29 = var26.first();
                        final SubLObject var30 = module0233.f15370(var29);
                        var15.resetMultipleValues();
                        final SubLObject var64_118 = module0235.f15474(var30, var17, (SubLObject)NIL, (SubLObject)T);
                        final SubLObject var31 = var15.secondMultipleValue();
                        var15.resetMultipleValues();
                        if (NIL != var64_118) {
                            module0347.f23330(var28, var64_118, ConsesLow.append(var23, var31));
                        }
                        var25 = var25.rest();
                        var26 = var25.first();
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31110(final SubLObject var111, final SubLObject var1) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = module0178.f11282(var111);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var112) && NIL == module0035.f1997(module0232.f15308(var113))) {
            Errors.error((SubLObject)$ic103$, var111);
        }
        final SubLObject var114 = module0232.f15308(var113).first();
        final SubLObject var115 = module0232.f15306(var113);
        final SubLObject var116 = module0202.f12845(var115);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var112) && NIL == module0035.f1997(var116)) {
            Errors.error((SubLObject)$ic104$, var111);
        }
        final SubLObject var117 = var116.first();
        final SubLObject var118 = Sequences.remove(var117, var115, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var112.resetMultipleValues();
        final SubLObject var119 = module0202.f12796(var117);
        final SubLObject var120 = var112.secondMultipleValue();
        final SubLObject var121 = var112.thirdMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var122 = module0233.f15340(var120, var121);
        final SubLObject var123 = (SubLObject)ConsesLow.list(var122);
        final SubLObject var124 = module0233.f15362(var123, var114);
        var112.resetMultipleValues();
        final SubLObject var125 = module0234.f15444(var1, var124, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        final SubLObject var126 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var127 = module0233.f15362(var125, var118);
        final SubLObject var128 = module0276.f18287(var127, (SubLObject)UNPROVIDED);
        return var128;
    }
    
    public static SubLObject f31051(final SubLObject var17) {
        return module0004.f104(var17, $g3594$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31111(final SubLObject var132, final SubLObject var133, final SubLObject var134, final SubLObject var135) {
        SubLObject var136 = (SubLObject)NIL;
        final SubLObject var137 = module0411.f28643(var132, (SubLObject)$ic10$, var133);
        if ($ic48$ == var137) {
            var136 = (SubLObject)$ic48$;
        }
        else {
            final SubLObject var138 = module0411.f28643(var134, (SubLObject)$ic10$, var135);
            var136 = module0360.f23932(var137, var138);
        }
        return var136;
    }
    
    public static SubLObject f31112(final SubLObject var138) {
        return module0454.f31157(var138, $ic0$);
    }
    
    public static SubLObject f31113(final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        assert NIL != module0204.f13077(var138) : var138;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = module0232.f15308(var138);
        SubLObject var143 = (SubLObject)NIL;
        var143 = var142.first();
        while (NIL != var142) {
            SubLObject var145;
            final SubLObject var144 = var145 = var143;
            SubLObject var146 = (SubLObject)NIL;
            SubLObject var147 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic141$);
            var146 = var145.first();
            var145 = var145.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)$ic141$);
            var147 = var145.first();
            var145 = var145.rest();
            if (NIL == var145) {
                if (NIL != module0193.f12067(module0205.f13388(var147, (SubLObject)UNPROVIDED))) {
                    var140 = module0205.f13387(var147, (SubLObject)UNPROVIDED);
                }
                else {
                    var141 = module0205.f13388(var147, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)$ic141$);
            }
            var142 = var142.rest();
            var143 = var142.first();
        }
        assert NIL != module0173.f10955(var140) : var140;
        assert NIL != module0173.f10955(var141) : var141;
        final SubLObject var148 = module0018.$g664$.getDynamicValue(var139);
        final SubLObject var149 = f31074(var141);
        final SubLObject var150 = Numbers.min(var148, var149);
        return Numbers.integerDivide(var150, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f31114(final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        SubLObject var141;
        final SubLObject var140 = var141 = module0232.f15308(var138);
        SubLObject var142 = (SubLObject)NIL;
        SubLObject var143 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var141, var140, (SubLObject)$ic143$);
        var142 = var141.first();
        var141 = var141.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var141, var140, (SubLObject)$ic143$);
        var143 = var141.first();
        var141 = var141.rest();
        if (NIL == var141) {
            SubLObject var151_152;
            final SubLObject var149_150 = var151_152 = var142;
            SubLObject var144 = (SubLObject)NIL;
            SubLObject var145 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)$ic144$);
            var144 = var151_152.first();
            var151_152 = var151_152.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)$ic144$);
            var145 = var151_152.first();
            var151_152 = var151_152.rest();
            if (NIL == var151_152) {
                SubLObject var157_158;
                final SubLObject var155_156 = var157_158 = var143;
                SubLObject var146 = (SubLObject)NIL;
                SubLObject var147 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var157_158, var155_156, (SubLObject)$ic145$);
                var146 = var157_158.first();
                var157_158 = var157_158.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var157_158, var155_156, (SubLObject)$ic145$);
                var147 = var157_158.first();
                var157_158 = var157_158.rest();
                if (NIL == var157_158) {
                    if (var144.equal(var146)) {
                        var139.resetMultipleValues();
                        final SubLObject var148 = f31115(var145, var147);
                        final SubLObject var149 = var139.secondMultipleValue();
                        final SubLObject var150 = var139.thirdMultipleValue();
                        var139.resetMultipleValues();
                        final SubLObject var151 = module0205.f13387(var148, (SubLObject)UNPROVIDED);
                        final SubLObject var152 = module0205.f13388(var148, (SubLObject)UNPROVIDED);
                        final SubLObject var153 = module0205.f13388(var149, (SubLObject)UNPROVIDED);
                        SubLObject var154 = f31053(var151, var153, var144);
                        SubLObject var155 = (SubLObject)NIL;
                        var155 = var154.first();
                        while (NIL != var154) {
                            var139.resetMultipleValues();
                            final SubLObject var156 = module0235.f15474(var152, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var157 = var139.secondMultipleValue();
                            var139.resetMultipleValues();
                            if (NIL != var156) {
                                final SubLObject var158 = module0202.f12768($ic0$, var151, var155);
                                final SubLObject var159 = module0202.f12768($ic0$, var155, var153);
                                final SubLObject var160 = module0191.f11990((SubLObject)$ic26$, var158, var144, (SubLObject)UNPROVIDED);
                                final SubLObject var161 = module0191.f11990((SubLObject)$ic26$, var159, var144, (SubLObject)UNPROVIDED);
                                final SubLObject var162 = (SubLObject)ConsesLow.list(var160);
                                final SubLObject var163 = (SubLObject)ConsesLow.list(var161);
                                final SubLObject var164 = (SubLObject)((NIL != var150) ? ConsesLow.list(var162, var163) : ConsesLow.list(var163, var162));
                                module0376.f26641(var156, var164);
                            }
                            var154 = var154.rest();
                            var155 = var154.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var155_156, (SubLObject)$ic145$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var149_150, (SubLObject)$ic144$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var140, (SubLObject)$ic143$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31115(final SubLObject var154, final SubLObject var160) {
        if (NIL != module0173.f10955(module0205.f13387(var154, (SubLObject)UNPROVIDED))) {
            return Values.values(var154, var160, (SubLObject)T);
        }
        return Values.values(var160, var154, (SubLObject)NIL);
    }
    
    public static SubLObject f31116(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17710(var4)) {
            return module0358.f23690(f31117(var4));
        }
        return (SubLObject)$ic15$;
    }
    
    public static SubLObject f31118(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)UNPROVIDED))) {
            return $g3595$.getGlobalValue();
        }
        return $g3596$.getGlobalValue();
    }
    
    public static SubLObject f31119(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31120(var1);
    }
    
    public static SubLObject f31121(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31122(var1);
    }
    
    public static SubLObject f31123(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31124(var1);
    }
    
    public static SubLObject f31122(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0259.f16975(var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31120(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g646$.getDynamicValue(var2)) {
            return f31118(var1, (SubLObject)UNPROVIDED);
        }
        return $g3597$.getDynamicValue(var2);
    }
    
    public static SubLObject f31124(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL != module0018.$g646$.getDynamicValue(var2) && NIL == module0259.f16975(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic28$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0259.f16982(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31125(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)UNPROVIDED))) {
            return $g3598$.getGlobalValue();
        }
        return $g3599$.getGlobalValue();
    }
    
    public static SubLObject f31126(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return module0435.f30613(f31125(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31127(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31128(var1);
    }
    
    public static SubLObject f31129(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31130(var1);
    }
    
    public static SubLObject f31131(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return module0305.f20523(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31128(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL == module0173.f10955(var5) || NIL == module0259.f16975(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var7 = module0144.$g1870$.currentBinding(var2);
                try {
                    module0144.$g1870$.bind((SubLObject)NIL, var2);
                    if (NIL != module0305.f20423(var6, var5, (SubLObject)NIL)) {
                        module0347.f23330(module0191.f11990((SubLObject)$ic42$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0144.$g1870$.rebind(var7, var2);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic27$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31130(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0305.f20425(var3, var2, (SubLObject)NIL)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic42$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31132(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic27$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic27$);
        var18 = var16.first();
        var16 = var16.rest();
        if (NIL == var16) {
            if (NIL != module0259.f16975(var17, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic26$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic27$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31133(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31134(var1);
    }
    
    public static SubLObject f31134(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        SubLObject var7;
        final SubLObject var6 = var7 = module0259.f16990(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            var2.resetMultipleValues();
            final SubLObject var9 = module0235.f15474(var5, var8, (SubLObject)T, (SubLObject)T);
            final SubLObject var10 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != var9) {
                final SubLObject var11 = module0233.f15361(var9, var5);
                final SubLObject var12 = module0202.f12768(var3, var4, var11);
                module0347.f23330(module0191.f11990((SubLObject)$ic26$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var9, var10);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31135(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f31133(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31136(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        return f31137(var15);
    }
    
    public static SubLObject f31138(final SubLObject var1) {
        return f31117(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31117(final SubLObject var18) {
        if (NIL == module0173.f10955(var18)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != module0305.f20523(var18)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != module0226.f14858(var18, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic48$;
        }
        return (SubLObject)$ic47$;
    }
    
    public static SubLObject f31139(final SubLObject var18) {
        return module0052.f3709(module0259.f16985(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31137(final SubLObject var18) {
        return Numbers.max(module0549.f33913(var18), module0217.f14223(var18, (SubLObject)TWO_INTEGER, $ic146$));
    }
    
    public static SubLObject f31140() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31050", "S#34330", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31053", "S#34331", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31054", "S#34319", 1, 1, false);
        new $f31054$UnaryFunction();
        new $f31054$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31055", "S#34332", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31057", "S#29820", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31059", "S#29819", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31058", "S#34333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31056", "S#34334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31060", "S#34335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31061", "S#34336", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31062", "S#34337", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31064", "S#34338", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31063", "S#34339", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31065", "S#34340", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31066", "S#34341", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31067", "S#34342", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31069", "S#34343", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31071", "S#29813", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31068", "S#34344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31070", "S#34345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31072", "S#34346", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31073", "S#34320", 1, 1, false);
        new $f31073$UnaryFunction();
        new $f31073$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31075", "S#34321", 1, 0, false);
        new $f31075$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31052", "S#34347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31076", "S#34348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31074", "S#34349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31077", "S#34322", 1, 1, false);
        new $f31077$UnaryFunction();
        new $f31077$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31078", "S#34350", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31079", "S#34351", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31080", "S#34352", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31081", "S#34353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31082", "S#34354", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31083", "S#34355", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31084", "S#34356", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31085", "S#34357", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31086", "S#34358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31087", "S#34359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31088", "S#34360", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31089", "S#34361", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31090", "S#34362", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31091", "S#34363", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31092", "S#34364", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31093", "S#34365", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31094", "S#34366", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31095", "S#34367", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31096", "S#34368", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31097", "S#34369", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31098", "S#34370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31099", "S#34371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31100", "S#34372", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31101", "S#34373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31102", "S#34374", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31103", "S#34375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31104", "S#34376", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31105", "S#34377", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31106", "S#34378", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31107", "S#34379", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31108", "S#34380", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31109", "S#34381", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31110", "S#34382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31051", "S#34383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31111", "S#34384", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31112", "S#34325", 1, 0, false);
        new $f31112$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31113", "S#34385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31114", "S#34386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31115", "S#34387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31116", "S#34388", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31118", "S#34326", 1, 1, false);
        new $f31118$UnaryFunction();
        new $f31118$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31119", "S#34389", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31121", "S#34327", 1, 1, false);
        new $f31121$UnaryFunction();
        new $f31121$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31123", "S#34390", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31122", "S#34391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31120", "S#34392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31124", "S#34393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31125", "S#34394", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31126", "S#34395", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31127", "S#34396", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31129", "S#34397", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31131", "S#34328", 1, 1, false);
        new $f31131$UnaryFunction();
        new $f31131$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31128", "S#34398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31130", "S#34399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31132", "S#34400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31133", "S#34401", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31134", "S#34402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31135", "S#34403", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31136", "S#34404", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31138", "S#34405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31117", "S#34406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31139", "S#34407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0453", "f31137", "S#34408", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31141() {
        $g3588$ = SubLFiles.deflexical("S#34409", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)$ic20$));
        $g3589$ = SubLFiles.deflexical("S#34410", module0018.$g659$.getGlobalValue());
        $g3590$ = SubLFiles.defparameter("S#34411", (SubLObject)ONE_INTEGER);
        $g3591$ = SubLFiles.deflexical("S#34412", module0018.$g659$.getGlobalValue());
        $g3592$ = SubLFiles.deflexical("S#34413", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)$ic20$));
        $g3593$ = SubLFiles.defparameter("S#34414", (SubLObject)$ic49$);
        $g3594$ = SubLFiles.deflexical("S#34415", (SubLObject)$ic105$);
        $g3595$ = SubLFiles.deflexical("S#34416", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)$ic20$));
        $g3596$ = SubLFiles.deflexical("S#34417", module0018.$g659$.getGlobalValue());
        $g3597$ = SubLFiles.defparameter("S#34418", (SubLObject)ONE_INTEGER);
        $g3598$ = SubLFiles.deflexical("S#34419", module0018.$g659$.getGlobalValue());
        $g3599$ = SubLFiles.deflexical("S#34420", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31142() {
        module0340.f22938($ic0$);
        module0340.f22946($ic0$, (SubLObject)$ic1$);
        module0340.f22946($ic0$, (SubLObject)$ic2$);
        module0340.f22944($ic0$, (SubLObject)$ic3$);
        module0340.f22944($ic0$, (SubLObject)$ic4$);
        module0340.f22944($ic0$, (SubLObject)$ic5$);
        module0340.f22944($ic0$, (SubLObject)$ic6$);
        module0340.f22944($ic0$, (SubLObject)$ic7$);
        module0340.f22944($ic0$, (SubLObject)$ic8$);
        module0340.f22944($ic0$, (SubLObject)$ic9$);
        module0358.f23774((SubLObject)$ic10$, $ic0$);
        module0358.f23773((SubLObject)$ic11$, $ic0$);
        module0358.f23730((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0358.f23730((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0358.f23730((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0340.f22941((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0012.f419((SubLObject)$ic46$);
        module0340.f22941((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0340.f22938($ic52$);
        module0358.f23774((SubLObject)$ic10$, $ic52$);
        module0358.f23773((SubLObject)$ic11$, $ic52$);
        module0340.f22941((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0340.f22941((SubLObject)$ic58$, (SubLObject)$ic59$);
        module0340.f22941((SubLObject)$ic60$, (SubLObject)$ic61$);
        module0340.f22941((SubLObject)$ic62$, (SubLObject)$ic63$);
        module0340.f22941((SubLObject)$ic64$, (SubLObject)$ic65$);
        module0340.f22941((SubLObject)$ic66$, (SubLObject)$ic67$);
        module0340.f22941((SubLObject)$ic68$, (SubLObject)$ic69$);
        module0340.f22941((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0340.f22941((SubLObject)$ic73$, (SubLObject)$ic74$);
        module0340.f22941((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0340.f22941((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0340.f22941((SubLObject)$ic80$, (SubLObject)$ic81$);
        module0340.f22941((SubLObject)$ic82$, (SubLObject)$ic83$);
        module0340.f22941((SubLObject)$ic84$, (SubLObject)$ic85$);
        module0340.f22941((SubLObject)$ic88$, (SubLObject)$ic89$);
        module0340.f22941((SubLObject)$ic90$, (SubLObject)$ic91$);
        module0340.f22941((SubLObject)$ic92$, (SubLObject)$ic93$);
        module0340.f22941((SubLObject)$ic96$, (SubLObject)$ic97$);
        module0340.f22941((SubLObject)$ic98$, (SubLObject)$ic99$);
        module0340.f22941((SubLObject)$ic106$, (SubLObject)$ic107$);
        module0340.f22941((SubLObject)$ic108$, (SubLObject)$ic109$);
        module0340.f22941((SubLObject)$ic110$, (SubLObject)$ic111$);
        module0340.f22941((SubLObject)$ic112$, (SubLObject)$ic113$);
        module0340.f22941((SubLObject)$ic114$, (SubLObject)$ic115$);
        module0340.f22941((SubLObject)$ic116$, (SubLObject)$ic117$);
        module0340.f22941((SubLObject)$ic118$, (SubLObject)$ic119$);
        module0340.f22941((SubLObject)$ic120$, (SubLObject)$ic121$);
        module0340.f22941((SubLObject)$ic122$, (SubLObject)$ic123$);
        module0340.f22941((SubLObject)$ic124$, (SubLObject)$ic125$);
        module0340.f22941((SubLObject)$ic126$, (SubLObject)$ic127$);
        module0340.f22941((SubLObject)$ic128$, (SubLObject)$ic129$);
        module0340.f22941((SubLObject)$ic130$, (SubLObject)$ic131$);
        module0340.f22941((SubLObject)$ic132$, (SubLObject)$ic133$);
        module0340.f22941((SubLObject)$ic134$, (SubLObject)$ic135$);
        module0340.f22941((SubLObject)$ic136$, (SubLObject)$ic137$);
        module0340.f22962((SubLObject)$ic138$, (SubLObject)$ic139$);
        module0340.f22938($ic146$);
        module0340.f22946($ic146$, (SubLObject)$ic1$);
        module0340.f22946($ic146$, (SubLObject)$ic2$);
        module0340.f22944($ic146$, (SubLObject)$ic3$);
        module0358.f23774((SubLObject)$ic10$, $ic146$);
        module0358.f23773((SubLObject)$ic11$, $ic146$);
        module0358.f23730((SubLObject)$ic147$, (SubLObject)$ic148$);
        module0358.f23730((SubLObject)$ic149$, (SubLObject)$ic150$);
        module0340.f22941((SubLObject)$ic151$, (SubLObject)$ic152$);
        module0340.f22941((SubLObject)$ic153$, (SubLObject)$ic154$);
        module0340.f22941((SubLObject)$ic155$, (SubLObject)$ic156$);
        module0340.f22941((SubLObject)$ic157$, (SubLObject)$ic158$);
        module0340.f22941((SubLObject)$ic159$, (SubLObject)$ic160$);
        module0340.f22941((SubLObject)$ic161$, (SubLObject)$ic162$);
        module0340.f22941((SubLObject)$ic163$, (SubLObject)$ic164$);
        module0340.f22941((SubLObject)$ic165$, (SubLObject)$ic166$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31140();
    }
    
    public void initializeVariables() {
        f31141();
    }
    
    public void runTopLevelForms() {
        f31142();
    }
    
    static {
        me = (SubLFile)new module0453();
        $g3588$ = null;
        $g3589$ = null;
        $g3590$ = null;
        $g3591$ = null;
        $g3592$ = null;
        $g3593$ = null;
        $g3594$ = null;
        $g3595$ = null;
        $g3596$ = null;
        $g3597$ = null;
        $g3598$ = null;
        $g3599$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic1$ = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic3$ = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $ic4$ = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
        $ic5$ = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
        $ic6$ = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
        $ic7$ = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
        $ic8$ = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
        $ic9$ = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $ic10$ = makeKeyword("POS");
        $ic11$ = makeKeyword("NEG");
        $ic12$ = makeKeyword("ALL-INSTANCES-POS");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34330", "CYC"));
        $ic14$ = makeKeyword("PREFERRED");
        $ic15$ = makeKeyword("GROSSLY-DISPREFERRED");
        $ic16$ = makeKeyword("ALL-ISA-POS");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic18$ = makeKeyword("ALL-ELEMENTOF-POS");
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic20$ = (SubLFloat)makeDouble(0.1);
        $ic21$ = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34319", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#29820", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)") });
        $ic23$ = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-NEG");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34332", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#29819", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$Dog #$Predicate))") });
        $ic25$ = makeInteger(30);
        $ic26$ = makeKeyword("ISA");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"));
        $ic28$ = makeKeyword("MINIMIZE");
        $ic29$ = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("CLOSED-NAUT")), makeKeyword("COST"), makeSymbol("S#34336", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34337", "CYC"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });
        $ic31$ = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("CLOSED-NAUT")), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("COST"), makeSymbol("S#34338", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34339", "CYC"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });
        $ic33$ = makeKeyword("TRUE");
        $ic34$ = makeKeyword("GAF-ARG");
        $ic35$ = makeKeyword("GAF");
        $ic36$ = makeKeyword("PREDICATE-EXTENT");
        $ic37$ = makeKeyword("OVERLAP");
        $ic38$ = makeKeyword("REMOVAL-ISA-DEFN-POS");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("S#29813", "CYC"), makeKeyword("COST"), makeSymbol("S#34340", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34342", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$isa 42 #$Integer)") });
        $ic40$ = makeKeyword("REMOVAL-ISA-DEFN-NEG");
        $ic41$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34341", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34343", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa 42 #$SubLString))") });
        $ic42$ = makeKeyword("DEFN");
        $ic43$ = makeKeyword("REMOVAL-ALL-ISA");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1892", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34346", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)") });
        $ic45$ = makeSymbol("S#17515", "CYC");
        $ic46$ = makeSymbol("S#34346", "CYC");
        $ic47$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic48$ = makeKeyword("COMPLETE");
        $ic49$ = makeInteger(2300);
        $ic50$ = makeKeyword("REMOVAL-ALL-INSTANCES");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34320", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34321", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34348", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa ?DOG #$Dog)") });
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#7306", "CYC"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#25107", "CYC"), (SubLObject)makeSymbol("S#5477", "CYC")));
        $ic54$ = makeKeyword("ELEMENTOF");
        $ic55$ = makeKeyword("TRUE-MON");
        $ic56$ = makeKeyword("REMOVAL-ELEMENTOF-CHECK");
        $ic57$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34322", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))") });
        $ic58$ = makeKeyword("REMOVAL-NOT-ELEMENTOF-CHECK");
        $ic59$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34350", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))") });
        $ic60$ = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-CHECK");
        $ic61$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34351", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog #$Collection)") });
        $ic62$ = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $ic63$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34352", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient") });
        $ic64$ = makeKeyword("REMOVAL-ELEMENTOF-SET-CHECK");
        $ic65$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("COLLECTION-P"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#33891", "CYC")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34353", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("GAF-FORMULA"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)") });
        $ic66$ = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK");
        $ic67$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("COLLECTION-FORT")), makeKeyword("COST"), makeSymbol("S#34354", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34355", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Dog #$Predicate))") });
        $ic68$ = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34356", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary") });
        $ic70$ = makeKeyword("REMOVAL-NOT-ELEMENTOF-SET-CHECK");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("S#34357", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34358", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34359", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("GAF-FORMULA"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))") });
        $ic72$ = makeKeyword("OPAQUE");
        $ic73$ = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-CHECK");
        $ic74$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34360", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $ic75$ = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-CHECK");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34362", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $ic77$ = makeKeyword("QUERY");
        $ic78$ = makeKeyword("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK");
        $ic79$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#26270", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34363", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))") });
        $ic80$ = makeKeyword("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK");
        $ic81$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#26270", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34364", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))") });
        $ic82$ = makeKeyword("REMOVAL-ALL-ELEMENTOF");
        $ic83$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1892", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34365", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog ?WHAT)") });
        $ic84$ = makeKeyword("REMOVAL-NAT-ALL-ELEMENTOF");
        $ic85$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1892", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34366", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), makeKeyword("EXAMPLE"), makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)") });
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic87$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25107", "CYC"), (SubLObject)makeSymbol("S#5477", "CYC"));
        $ic88$ = makeKeyword("REMOVAL-ELEMENTOF-UNIFY");
        $ic89$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("S#34367", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34368", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))") });
        $ic90$ = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-UNIFY");
        $ic91$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("COLLECTION-FORT")), makeKeyword("COST"), makeSymbol("S#34369", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34370", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34371", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?DOG #$Dog)") });
        $ic92$ = makeKeyword("REMOVAL-ELEMENTOF-SET-UNIFY");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("S#34372", "CYC"), makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#33891", "CYC")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34373", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("GAF-FORMULA"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)") });
        $ic94$ = makeSymbol("S#15513", "CYC");
        $ic95$ = makeKeyword("HL");
        $ic96$ = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-UNIFY");
        $ic97$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("elementOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("S#34374", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34376", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $ic98$ = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-UNIFY");
        $ic99$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST"), makeSymbol("S#34377", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34378", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("subcollectionFunctionDefiningRule"));
        $ic102$ = makeString("Expected ~s to have only one free variable");
        $ic103$ = makeString("Expected exactly one poslit in ~S");
        $ic104$ = makeString("Expected exactly one #$termOfUnit neglit in ~S");
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromTypeFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOccursAtFn")), constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersection2Fn")), constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn")));
        $ic106$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY");
        $ic107$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $ic108$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK");
        $ic109$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $ic110$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY");
        $ic111$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $ic112$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK");
        $ic113$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $ic114$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY");
        $ic115$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $ic116$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK");
        $ic117$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $ic118$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY");
        $ic119$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $ic120$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK");
        $ic121$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $ic122$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY");
        $ic123$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOccursAtFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $ic124$ = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK");
        $ic125$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOccursAtFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $ic126$ = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY");
        $ic127$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34379", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $ic128$ = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK");
        $ic129$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $ic130$ = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY");
        $ic131$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersection2Fn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $ic132$ = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK");
        $ic133$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersection2Fn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $ic134$ = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY");
        $ic135$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $ic136$ = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK");
        $ic137$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34381", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $ic138$ = makeKeyword("REMOVAL-ALL-ISA-OF-TYPE");
        $ic139$ = ConsesLow.list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("S#34325", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25167", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34421", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25169", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34422", "CYC"))))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34384", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34421", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25167", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34422", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25169", "CYC")))), makeKeyword("COST"), makeSymbol("S#34385", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34386", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))") });
        $ic140$ = makeSymbol("S#15975", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic142$ = makeSymbol("FORT-P");
        $ic143$ = ConsesLow.list((SubLObject)makeSymbol("S#34423", "CYC"), (SubLObject)makeSymbol("S#34273", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#34267", "CYC"), (SubLObject)makeSymbol("S#34268", "CYC"));
        $ic145$ = ConsesLow.list((SubLObject)makeSymbol("S#34269", "CYC"), (SubLObject)makeSymbol("S#34270", "CYC"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic147$ = makeKeyword("ALL-QUOTED-INSTANCES-POS");
        $ic148$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34388", "CYC"));
        $ic149$ = makeKeyword("ALL-QUOTED-ISA-POS");
        $ic150$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic151$ = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS");
        $ic152$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34326", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34327", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <fort>)") });
        $ic153$ = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG");
        $ic154$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34389", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34390", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa #$Dog #$Predicate))") });
        $ic155$ = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-POS");
        $ic156$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("S#34328", "CYC"), makeKeyword("COST"), makeSymbol("S#34394", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34396", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa 42 #$SubLInteger)") });
        $ic157$ = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-NEG");
        $ic158$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34395", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34397", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa 42 #$SubLString))") });
        $ic159$ = makeKeyword("REMOVAL-NAT-QUOTED-ISA");
        $ic160$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34400", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)") });
        $ic161$ = makeKeyword("REMOVAL-ALL-QUOTED-ISA");
        $ic162$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1892", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34401", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa #$Dog ?COL)") });
        $ic163$ = makeKeyword("REMOVAL-NAT-ALL-QUOTED-ISA");
        $ic164$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1892", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34403", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)") });
        $ic165$ = makeKeyword("REMOVAL-ALL-QUOTED-INSTANCES");
        $ic166$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34404", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34405", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34407", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <not fully-bound> <fort>)") });
    }
    
    public static final class $f31054$UnaryFunction extends UnaryFunction
    {
        public $f31054$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34319"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31054(var15, (SubLObject)$f31054$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31054$BinaryFunction extends BinaryFunction
    {
        public $f31054$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34319"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31054(var15, var16);
        }
    }
    
    public static final class $f31073$UnaryFunction extends UnaryFunction
    {
        public $f31073$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34320"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31073(var15, (SubLObject)$f31073$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31073$BinaryFunction extends BinaryFunction
    {
        public $f31073$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34320"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31073(var15, var16);
        }
    }
    
    public static final class $f31075$UnaryFunction extends UnaryFunction
    {
        public $f31075$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34321"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31075(var15);
        }
    }
    
    public static final class $f31077$UnaryFunction extends UnaryFunction
    {
        public $f31077$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34322"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31077(var15, (SubLObject)$f31077$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31077$BinaryFunction extends BinaryFunction
    {
        public $f31077$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34322"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31077(var15, var16);
        }
    }
    
    public static final class $f31112$UnaryFunction extends UnaryFunction
    {
        public $f31112$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34325"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31112(var15);
        }
    }
    
    public static final class $f31118$UnaryFunction extends UnaryFunction
    {
        public $f31118$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34326"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31118(var15, (SubLObject)$f31118$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31118$BinaryFunction extends BinaryFunction
    {
        public $f31118$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34326"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31118(var15, var16);
        }
    }
    
    public static final class $f31121$UnaryFunction extends UnaryFunction
    {
        public $f31121$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34327"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31121(var15, (SubLObject)$f31121$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31121$BinaryFunction extends BinaryFunction
    {
        public $f31121$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34327"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31121(var15, var16);
        }
    }
    
    public static final class $f31131$UnaryFunction extends UnaryFunction
    {
        public $f31131$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34328"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f31131(var15, (SubLObject)$f31131$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31131$BinaryFunction extends BinaryFunction
    {
        public $f31131$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34328"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f31131(var15, var16);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1196 ms
	
	Decompiled with Procyon 0.5.32.
*/