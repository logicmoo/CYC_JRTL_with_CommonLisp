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
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (module0453.NIL != module0206.f13453(var4) && module0453.NIL != f31051(module0205.f13276(var4))) {
            return (SubLObject)module0453.$ic14$;
        }
        if (module0453.NIL != module0269.f17710(var4)) {
            return module0358.f23690(f31052(var4));
        }
        return (SubLObject)module0453.$ic15$;
    }
    
    public static SubLObject f31053(final SubLObject var5, final SubLObject var6, SubLObject var7) {
        if (var7 == module0453.UNPROVIDED) {
            var7 = (SubLObject)module0453.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0453.NIL;
        final SubLObject var10 = module0147.f9540(var7);
        final SubLObject var11 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var13 = module0147.$g2096$.currentBinding(var8);
        try {
            module0147.$g2095$.bind(module0147.f9545(var10), var8);
            module0147.$g2094$.bind(module0147.f9546(var10), var8);
            module0147.$g2096$.bind(module0147.f9549(var10), var8);
            if (module0453.NIL != module0173.f10955(var5) && module0453.NIL != module0349.f23386(var6, (SubLObject)module0453.UNPROVIDED)) {
                var9 = module0259.f16851(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
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
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        if (module0453.NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED))) {
            return module0453.$g3588$.getGlobalValue();
        }
        return module0453.$g3589$.getGlobalValue();
    }
    
    public static SubLObject f31055(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31056(var1);
    }
    
    public static SubLObject f31057(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31058(var1);
    }
    
    public static SubLObject f31059(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31060(var1);
    }
    
    public static SubLObject f31058(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (!module0228.f15210(var2).numGE((SubLObject)module0453.$ic25$) && module0453.NIL != module0259.f16854(var2, var3, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31056(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0453.NIL != module0018.$g646$.getDynamicValue(var2)) {
            return f31054(var1, (SubLObject)module0453.UNPROVIDED);
        }
        return module0453.$g3590$.getDynamicValue(var2);
    }
    
    public static SubLObject f31060(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0453.NIL;
        SubLObject var6 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0453.NIL == var4) {
            if (module0453.NIL != module0018.$g646$.getDynamicValue(var2) && module0453.NIL == module0259.f16854(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic28$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
            else if (module0453.NIL != module0259.f16909(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0453.$ic27$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31061(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0018.$g658$.getDynamicValue(var15);
    }
    
    public static SubLObject f31062(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31063(var1, var14);
    }
    
    public static SubLObject f31064(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0453.NIL != module0193.f12105(module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED))) {
            return module0018.$g658$.getDynamicValue(var15);
        }
        return module0217.f14406(var1, (SubLObject)module0453.$ic33$, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31063(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0349.f23449(var1, var14);
        final SubLObject var18;
        final SubLObject var17 = var18 = module0158.f10294(var16);
        if (var18.eql((SubLObject)module0453.$ic34$)) {
            var15.resetMultipleValues();
            final SubLObject var19 = module0158.f10297(var16);
            final SubLObject var20 = var15.secondMultipleValue();
            final SubLObject var21 = var15.thirdMultipleValue();
            var15.resetMultipleValues();
            if (module0453.NIL != var20) {
                if (module0453.NIL != var21) {
                    final SubLObject var22 = var21;
                    if (module0453.NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = (SubLObject)module0453.NIL;
                        final SubLObject var25 = (SubLObject)module0453.NIL;
                        while (module0453.NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                            if (module0453.NIL != var27) {
                                SubLObject var28 = (SubLObject)module0453.NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)module0453.$ic35$, module0130.f8518(var14), (SubLObject)module0453.NIL);
                                    SubLObject var29_34 = (SubLObject)module0453.NIL;
                                    final SubLObject var30_35 = (SubLObject)module0453.NIL;
                                    while (module0453.NIL == var29_34) {
                                        final SubLObject var29 = module0052.f3695(var28, var30_35);
                                        final SubLObject var32_37 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_35.eql(var29));
                                        if (module0453.NIL != var32_37) {
                                            module0436.f30642(var29, var1);
                                        }
                                        var29_34 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var32_37);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0453.T, var15);
                                        if (module0453.NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var15);
                                    }
                                }
                            }
                            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var27);
                        }
                    }
                }
                else {
                    final SubLObject var22 = (SubLObject)module0453.NIL;
                    if (module0453.NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = (SubLObject)module0453.NIL;
                        final SubLObject var25 = (SubLObject)module0453.NIL;
                        while (module0453.NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                            if (module0453.NIL != var27) {
                                SubLObject var28 = (SubLObject)module0453.NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)module0453.$ic35$, module0130.f8518(var14), (SubLObject)module0453.NIL);
                                    SubLObject var29_35 = (SubLObject)module0453.NIL;
                                    final SubLObject var30_36 = (SubLObject)module0453.NIL;
                                    while (module0453.NIL == var29_35) {
                                        final SubLObject var29 = module0052.f3695(var28, var30_36);
                                        final SubLObject var32_38 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_36.eql(var29));
                                        if (module0453.NIL != var32_38) {
                                            module0436.f30642(var29, var1);
                                        }
                                        var29_35 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var32_38);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0453.T, var15);
                                        if (module0453.NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31, var15);
                                    }
                                }
                            }
                            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var27);
                        }
                    }
                }
            }
            else if (module0453.NIL != var21) {
                final SubLObject var22 = var21;
                if (module0453.NIL != module0158.f10010(var19, (SubLObject)module0453.NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)module0453.NIL, var22);
                    SubLObject var24 = (SubLObject)module0453.NIL;
                    final SubLObject var25 = (SubLObject)module0453.NIL;
                    while (module0453.NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                        if (module0453.NIL != var27) {
                            SubLObject var28 = (SubLObject)module0453.NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)module0453.$ic35$, module0130.f8518(var14), (SubLObject)module0453.NIL);
                                SubLObject var29_36 = (SubLObject)module0453.NIL;
                                final SubLObject var30_37 = (SubLObject)module0453.NIL;
                                while (module0453.NIL == var29_36) {
                                    final SubLObject var29 = module0052.f3695(var28, var30_37);
                                    final SubLObject var32_39 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_37.eql(var29));
                                    if (module0453.NIL != var32_39) {
                                        module0436.f30642(var29, var1);
                                    }
                                    var29_36 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var32_39);
                                }
                            }
                            finally {
                                final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0453.T, var15);
                                    if (module0453.NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var32, var15);
                                }
                            }
                        }
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var27);
                    }
                }
            }
            else {
                final SubLObject var22 = (SubLObject)module0453.NIL;
                if (module0453.NIL != module0158.f10010(var19, (SubLObject)module0453.NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)module0453.NIL, var22);
                    SubLObject var24 = (SubLObject)module0453.NIL;
                    final SubLObject var25 = (SubLObject)module0453.NIL;
                    while (module0453.NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                        if (module0453.NIL != var27) {
                            SubLObject var28 = (SubLObject)module0453.NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)module0453.$ic35$, module0130.f8518(var14), (SubLObject)module0453.NIL);
                                SubLObject var29_37 = (SubLObject)module0453.NIL;
                                final SubLObject var30_38 = (SubLObject)module0453.NIL;
                                while (module0453.NIL == var29_37) {
                                    final SubLObject var29 = module0052.f3695(var28, var30_38);
                                    final SubLObject var32_40 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_38.eql(var29));
                                    if (module0453.NIL != var32_40) {
                                        module0436.f30642(var29, var1);
                                    }
                                    var29_37 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var32_40);
                                }
                            }
                            finally {
                                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0453.T, var15);
                                    if (module0453.NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var15);
                                }
                            }
                        }
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var27);
                    }
                }
            }
        }
        else if (var18.eql((SubLObject)module0453.$ic36$)) {
            final SubLObject var34 = module0158.f10299(var16);
            if (module0453.NIL != module0158.f10038(var34)) {
                final SubLObject var35 = (SubLObject)module0453.NIL;
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
                    module0012.$g67$.bind((SubLObject)module0453.ONE_INTEGER, var15);
                    module0012.$g68$.bind((SubLObject)module0453.ZERO_INTEGER, var15);
                    module0012.$g66$.bind((SubLObject)module0453.ZERO_INTEGER, var15);
                    module0012.$g69$.bind((SubLObject)module0453.ZERO_INTEGER, var15);
                    module0012.$g70$.bind((SubLObject)module0453.T, var15);
                    module0012.$silent_progressP$.bind((SubLObject)((module0453.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var15) : module0453.T), var15);
                    module0012.f474(var35);
                    final SubLObject var44 = module0158.f10039(var34);
                    SubLObject var45 = (SubLObject)module0453.NIL;
                    final SubLObject var46 = (SubLObject)module0453.NIL;
                    while (module0453.NIL == var45) {
                        final SubLObject var47 = module0052.f3695(var44, var46);
                        final SubLObject var48 = (SubLObject)SubLObjectFactory.makeBoolean(!var46.eql(var47));
                        if (module0453.NIL != var48) {
                            module0012.f476();
                            SubLObject var49 = (SubLObject)module0453.NIL;
                            try {
                                var49 = module0158.f10316(var47, (SubLObject)module0453.$ic35$, module0130.f8518(var14), (SubLObject)module0453.NIL);
                                SubLObject var29_38 = (SubLObject)module0453.NIL;
                                final SubLObject var30_39 = (SubLObject)module0453.NIL;
                                while (module0453.NIL == var29_38) {
                                    final SubLObject var50 = module0052.f3695(var49, var30_39);
                                    final SubLObject var32_41 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_39.eql(var50));
                                    if (module0453.NIL != var32_41) {
                                        module0436.f30642(var50, var1);
                                    }
                                    var29_38 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var32_41);
                                }
                            }
                            finally {
                                final SubLObject var11_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0453.T, var15);
                                    if (module0453.NIL != var49) {
                                        module0158.f10319(var49);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var11_58, var15);
                                }
                            }
                        }
                        var45 = (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL == var48);
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
        else if (var18.eql((SubLObject)module0453.$ic37$)) {
            SubLObject var51 = module0218.f14453(module0158.f10301(var16), (SubLObject)module0453.UNPROVIDED);
            SubLObject var52 = (SubLObject)module0453.NIL;
            var52 = var51.first();
            while (module0453.NIL != var51) {
                if (module0453.NIL == module0130.f8518(var14) || module0453.NIL != module0178.f11343(var52, module0130.f8518(var14))) {
                    module0436.f30642(var52, var1);
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        else {
            module0158.f10295(var16, var17);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31065(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        if (module0453.NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED))) {
            return module0453.$g3591$.getGlobalValue();
        }
        return module0453.$g3592$.getGlobalValue();
    }
    
    public static SubLObject f31066(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return module0435.f30613(f31065(var1, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31067(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31068(var1);
    }
    
    public static SubLObject f31069(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31070(var1);
    }
    
    public static SubLObject f31071(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0453.NIL != module0305.f20485(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED)) || module0453.NIL != module0305.f20523(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED)));
    }
    
    public static SubLObject f31068(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0453.NIL;
        SubLObject var6 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0453.NIL == var4) {
            if (module0453.NIL == module0259.f16854(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                final SubLObject var7 = module0144.$g1870$.currentBinding(var2);
                try {
                    module0144.$g1870$.bind((SubLObject)module0453.NIL, var2);
                    if (module0453.NIL != module0305.f20414(var6, var5, (SubLObject)module0453.NIL)) {
                        module0347.f23330(module0191.f11990((SubLObject)module0453.$ic42$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                    }
                }
                finally {
                    module0144.$g1870$.rebind(var7, var2);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0453.$ic27$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31070(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (module0453.NIL != module0305.f20416(var3, var2, (SubLObject)module0453.NIL)) {
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic42$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31072(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13333(var1);
        final SubLObject var17 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var20;
        final SubLObject var19 = var20 = Sort.sort(module0259.f16840(var17, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.$ic45$, (SubLObject)module0453.UNPROVIDED);
        SubLObject var21 = (SubLObject)module0453.NIL;
        var21 = var20.first();
        while (module0453.NIL != var20) {
            var15.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var18, var21, (SubLObject)module0453.T, (SubLObject)module0453.T);
            final SubLObject var23 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (module0453.NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var18);
                final SubLObject var25 = module0202.f12768(var16, var17, var24);
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, var25, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31073(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        return f31074(var15);
    }
    
    public static SubLObject f31075(final SubLObject var1) {
        return f31052(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31052(final SubLObject var18) {
        if (module0453.NIL == module0173.f10955(var18)) {
            return (SubLObject)module0453.$ic47$;
        }
        if (module0453.NIL != module0305.f20485(var18) || module0453.NIL != module0305.f20523(var18)) {
            return (SubLObject)module0453.$ic47$;
        }
        if (module0453.NIL != module0226.f14858(var18, (SubLObject)module0453.UNPROVIDED)) {
            return (SubLObject)module0453.$ic48$;
        }
        return (SubLObject)module0453.$ic47$;
    }
    
    public static SubLObject f31076(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0549.f33895(var18).numG(module0453.$g3593$.getDynamicValue(var19))) {
            return module0227.f15190(var18);
        }
        return module0052.f3709(module0259.f16846(var18, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31074(final SubLObject var18) {
        final SubLObject var19 = module0549.f33912(var18);
        return var19.isZero() ? module0217.f14223(var18, (SubLObject)module0453.TWO_INTEGER, module0453.$ic0$) : var19;
    }
    
    public static SubLObject f31077(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)module0453.NIL;
        SubLObject var20 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        var19 = var16.first();
        var16 = (var20 = var16.rest());
        var16 = var18;
        if (module0453.NIL == var16) {
            if (module0453.NIL != module0004.f104(var17, var20, Symbols.symbol_function((SubLObject)module0453.EQUAL), (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic54$, var1, module0147.f9551(), (SubLObject)module0453.$ic55$), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0453.$ic53$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31078(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)module0453.NIL;
        SubLObject var20 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic53$);
        var19 = var16.first();
        var16 = (var20 = var16.rest());
        var16 = var18;
        if (module0453.NIL == var16) {
            if (module0453.NIL == module0004.f104(var17, var20, Symbols.symbol_function((SubLObject)module0453.EQUAL), (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic54$, module0205.f13338(var1), module0147.f9551(), (SubLObject)module0453.$ic55$), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0453.$ic53$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31079(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31058(var1);
    }
    
    public static SubLObject f31080(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31068(var1);
    }
    
    public static SubLObject f31081(final SubLObject var1) {
        return module0436.f30638(var1);
    }
    
    public static SubLObject f31082(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31056(var1);
    }
    
    public static SubLObject f31083(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31060(var1);
    }
    
    public static SubLObject f31084(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31070(var1);
    }
    
    public static SubLObject f31085(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
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
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var18 = f31089(var16, var17, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var19 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        if (module0453.NIL != var18 && module0453.NIL != var19) {
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic72$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31089(final SubLObject var71, final SubLObject var78, SubLObject var7) {
        if (var7 == module0453.UNPROVIDED) {
            var7 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = module0205.f13277(var78, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var81 = module0205.f13368(var78, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var82 = conses_high.subst(var71, var80, var81, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        var79.resetMultipleValues();
        final SubLObject var83 = module0349.f23495(var82, var7, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var84 = var79.secondMultipleValue();
        var79.resetMultipleValues();
        if (module0453.NIL != module0360.f23871(var84)) {
            Errors.error(module0360.f23876(var84));
            return (SubLObject)module0453.NIL;
        }
        if (module0453.NIL != module0360.f23867(var84)) {
            return Values.values(var83, (SubLObject)module0453.T);
        }
        return Values.values(var83, (SubLObject)module0453.NIL);
    }
    
    public static SubLObject f31090(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31088(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31091(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var18 = f31089(var16, var17, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var19 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        if (module0453.NIL == var18 && module0453.NIL != var19) {
            final SubLObject var20 = module0205.f13250(var16, module0205.f13203(var17, (SubLObject)module0453.UNPROVIDED), module0205.f13204(var17, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic77$, module0205.f13338(var20), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31092(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31091(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31093(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31072(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31094(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31072(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31095(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return Sequences.length(module0205.f13304(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31096(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var17;
        final SubLObject var16 = var17 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var18 = (SubLObject)module0453.NIL;
        SubLObject var19 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0453.$ic86$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0453.$ic86$);
        var19 = var17.first();
        var17 = var17.rest();
        if (module0453.NIL == var17) {
            SubLObject var89_90;
            final SubLObject var87_88 = var89_90 = var19;
            SubLObject var20 = (SubLObject)module0453.NIL;
            SubLObject var21 = (SubLObject)module0453.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var89_90, var87_88, (SubLObject)module0453.$ic87$);
            var20 = var89_90.first();
            var89_90 = var89_90.rest();
            SubLObject var22;
            var21 = (var22 = var89_90);
            SubLObject var23 = (SubLObject)module0453.NIL;
            var23 = var22.first();
            while (module0453.NIL != var22) {
                var15.resetMultipleValues();
                final SubLObject var24 = module0235.f15474(var18, var23, (SubLObject)module0453.T, (SubLObject)module0453.T);
                final SubLObject var25 = var15.secondMultipleValue();
                var15.resetMultipleValues();
                if (module0453.NIL != var24) {
                    final SubLObject var26 = module0202.f12768(module0453.$ic52$, module0233.f15361(var24, var18), var19);
                    module0347.f23330(module0191.f11990((SubLObject)module0453.$ic54$, var26, module0147.f9551(), (SubLObject)module0453.$ic55$), var24, var25);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0453.$ic86$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31097(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
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
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return module0436.f30636(var1, var14);
    }
    
    public static SubLObject f31101(final SubLObject var1) {
        return module0436.f30638(var1);
    }
    
    public static SubLObject f31102(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
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
        return (module0453.NIL != var22) ? var22 : module0351.$g2989$.getDynamicValue(var15);
    }
    
    public static SubLObject f31103(final SubLObject var97, SubLObject var95) {
        if (module0453.NIL != module0207.f13522(var95)) {
            var95 = module0202.f12773((SubLObject)ConsesLow.list(var95));
        }
        if (module0453.NIL != module0202.f12595(var95)) {
            final SubLObject var98 = module0205.f13207(var95, (SubLObject)module0453.UNPROVIDED);
            if (module0453.NIL != var98 && module0453.NIL != module0035.f2370((SubLObject)module0453.$ic94$, module0205.f13207(var95, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED)) {
                SubLObject var99 = module0048.f3326();
                SubLObject var100 = var98;
                SubLObject var101 = (SubLObject)module0453.NIL;
                var101 = var100.first();
                while (module0453.NIL != var100) {
                    final SubLObject var102 = module0205.f13250(module0193.f12079((SubLObject)module0453.ZERO_INTEGER), var97, var101, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                    final SubLObject var103 = module0202.f12826(var102);
                    final SubLObject var104 = module0202.f12828(var102);
                    final SubLObject var105 = module0411.f28638(var103, var104, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                    if (module0453.NIL != module0048.f3335(var105, var99)) {
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
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31104(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13333(var1);
        final SubLObject var17 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var20;
        final SubLObject var19 = var20 = module0434.f30598(var18, (SubLObject)module0453.$ic95$, (SubLObject)module0453.UNPROVIDED);
        SubLObject var21 = (SubLObject)module0453.NIL;
        var21 = var20.first();
        while (module0453.NIL != var20) {
            var15.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var17, var21, (SubLObject)module0453.T, (SubLObject)module0453.T);
            final SubLObject var23 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (module0453.NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var17);
                final SubLObject var25 = module0202.f12768(var16, var24, var18);
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic72$, var25, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31105(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31102(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31106(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31104(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31107(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        var15.resetMultipleValues();
        final SubLObject var17 = module0202.f12796(var16);
        final SubLObject var18 = var15.secondMultipleValue();
        final SubLObject var19 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        if (module0453.NIL != module0202.f12589(var19, module0453.$ic100$)) {
            var15.resetMultipleValues();
            final SubLObject var20 = module0202.f12796(var19);
            final SubLObject var21 = var15.secondMultipleValue();
            final SubLObject var22 = var15.thirdMultipleValue();
            var15.resetMultipleValues();
            final SubLObject var23 = (SubLObject)ConsesLow.list(module0453.$ic0$, var21, var18);
            final SubLObject var24 = module0276.f18287((SubLObject)ConsesLow.list(var23, var22), (SubLObject)module0453.T);
            final SubLObject var25 = f31103(var21, var24);
            if (module0453.NIL != var25) {
                return var25;
            }
        }
        return f31108(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31108(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var16 = module0205.f13277(var15, (SubLObject)module0453.UNPROVIDED);
        return Numbers.ceiling(f31074(var16), (SubLObject)module0453.TEN_INTEGER);
    }
    
    public static SubLObject f31109(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = module0202.f12796(var1);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        final SubLObject var19 = module0205.f13276(var18);
        final SubLObject var20 = module0220.f14553(var19, module0453.$ic101$, (SubLObject)module0453.ONE_INTEGER, (SubLObject)module0453.TWO_INTEGER, (SubLObject)module0453.$ic33$);
        if (module0453.NIL != var20) {
            final SubLObject var21 = f31110(var20, var1);
            final SubLObject var22 = module0434.f30594(var21, module0147.$g2095$.getDynamicValue(var15), module0434.f30588(module0411.f28655()));
            if (module0453.NIL != var22) {
                final SubLObject var23 = (SubLObject)ConsesLow.list(var20);
                if (module0453.NIL != module0540.f33533(var22)) {
                    final SubLObject var24 = module0191.f11990((SubLObject)module0453.$ic77$, var21, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                    module0347.f23330(var24, (SubLObject)module0453.NIL, var23);
                }
                else {
                    if (module0453.NIL == Errors.$ignore_mustsP$.getDynamicValue(var15) && module0453.NIL != conses_high.second(var22.first())) {
                        Errors.error((SubLObject)module0453.$ic102$, var20);
                    }
                    SubLObject var25 = var22;
                    SubLObject var26 = (SubLObject)module0453.NIL;
                    var26 = var25.first();
                    while (module0453.NIL != var25) {
                        final SubLObject var27 = module0233.f15362(var26, var21);
                        final SubLObject var28 = module0191.f11990((SubLObject)module0453.$ic77$, var27, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                        final SubLObject var29 = var26.first();
                        final SubLObject var30 = module0233.f15370(var29);
                        var15.resetMultipleValues();
                        final SubLObject var64_118 = module0235.f15474(var30, var17, (SubLObject)module0453.NIL, (SubLObject)module0453.T);
                        final SubLObject var31 = var15.secondMultipleValue();
                        var15.resetMultipleValues();
                        if (module0453.NIL != var64_118) {
                            module0347.f23330(var28, var64_118, ConsesLow.append(var23, var31));
                        }
                        var25 = var25.rest();
                        var26 = var25.first();
                    }
                }
            }
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31110(final SubLObject var111, final SubLObject var1) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = module0178.f11282(var111);
        if (module0453.NIL == Errors.$ignore_mustsP$.getDynamicValue(var112) && module0453.NIL == module0035.f1997(module0232.f15308(var113))) {
            Errors.error((SubLObject)module0453.$ic103$, var111);
        }
        final SubLObject var114 = module0232.f15308(var113).first();
        final SubLObject var115 = module0232.f15306(var113);
        final SubLObject var116 = module0202.f12845(var115);
        if (module0453.NIL == Errors.$ignore_mustsP$.getDynamicValue(var112) && module0453.NIL == module0035.f1997(var116)) {
            Errors.error((SubLObject)module0453.$ic104$, var111);
        }
        final SubLObject var117 = var116.first();
        final SubLObject var118 = Sequences.remove(var117, var115, Symbols.symbol_function((SubLObject)module0453.EQUAL), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        var112.resetMultipleValues();
        final SubLObject var119 = module0202.f12796(var117);
        final SubLObject var120 = var112.secondMultipleValue();
        final SubLObject var121 = var112.thirdMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var122 = module0233.f15340(var120, var121);
        final SubLObject var123 = (SubLObject)ConsesLow.list(var122);
        final SubLObject var124 = module0233.f15362(var123, var114);
        var112.resetMultipleValues();
        final SubLObject var125 = module0234.f15444(var1, var124, (SubLObject)module0453.NIL, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var126 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var127 = module0233.f15362(var125, var118);
        final SubLObject var128 = module0276.f18287(var127, (SubLObject)module0453.UNPROVIDED);
        return var128;
    }
    
    public static SubLObject f31051(final SubLObject var17) {
        return module0004.f104(var17, module0453.$g3594$.getGlobalValue(), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31111(final SubLObject var132, final SubLObject var133, final SubLObject var134, final SubLObject var135) {
        SubLObject var136 = (SubLObject)module0453.NIL;
        final SubLObject var137 = module0411.f28643(var132, (SubLObject)module0453.$ic10$, var133);
        if (module0453.$ic48$ == var137) {
            var136 = (SubLObject)module0453.$ic48$;
        }
        else {
            final SubLObject var138 = module0411.f28643(var134, (SubLObject)module0453.$ic10$, var135);
            var136 = module0360.f23932(var137, var138);
        }
        return var136;
    }
    
    public static SubLObject f31112(final SubLObject var138) {
        return module0454.f31157(var138, module0453.$ic0$);
    }
    
    public static SubLObject f31113(final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        assert module0453.NIL != module0204.f13077(var138) : var138;
        SubLObject var140 = (SubLObject)module0453.NIL;
        SubLObject var141 = (SubLObject)module0453.NIL;
        SubLObject var142 = module0232.f15308(var138);
        SubLObject var143 = (SubLObject)module0453.NIL;
        var143 = var142.first();
        while (module0453.NIL != var142) {
            SubLObject var145;
            final SubLObject var144 = var145 = var143;
            SubLObject var146 = (SubLObject)module0453.NIL;
            SubLObject var147 = (SubLObject)module0453.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0453.$ic141$);
            var146 = var145.first();
            var145 = var145.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var145, var144, (SubLObject)module0453.$ic141$);
            var147 = var145.first();
            var145 = var145.rest();
            if (module0453.NIL == var145) {
                if (module0453.NIL != module0193.f12067(module0205.f13388(var147, (SubLObject)module0453.UNPROVIDED))) {
                    var140 = module0205.f13387(var147, (SubLObject)module0453.UNPROVIDED);
                }
                else {
                    var141 = module0205.f13388(var147, (SubLObject)module0453.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var144, (SubLObject)module0453.$ic141$);
            }
            var142 = var142.rest();
            var143 = var142.first();
        }
        assert module0453.NIL != module0173.f10955(var140) : var140;
        assert module0453.NIL != module0173.f10955(var141) : var141;
        final SubLObject var148 = module0018.$g664$.getDynamicValue(var139);
        final SubLObject var149 = f31074(var141);
        final SubLObject var150 = Numbers.min(var148, var149);
        return Numbers.integerDivide(var150, (SubLObject)module0453.TWO_INTEGER);
    }
    
    public static SubLObject f31114(final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        SubLObject var141;
        final SubLObject var140 = var141 = module0232.f15308(var138);
        SubLObject var142 = (SubLObject)module0453.NIL;
        SubLObject var143 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var141, var140, (SubLObject)module0453.$ic143$);
        var142 = var141.first();
        var141 = var141.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var141, var140, (SubLObject)module0453.$ic143$);
        var143 = var141.first();
        var141 = var141.rest();
        if (module0453.NIL == var141) {
            SubLObject var151_152;
            final SubLObject var149_150 = var151_152 = var142;
            SubLObject var144 = (SubLObject)module0453.NIL;
            SubLObject var145 = (SubLObject)module0453.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)module0453.$ic144$);
            var144 = var151_152.first();
            var151_152 = var151_152.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)module0453.$ic144$);
            var145 = var151_152.first();
            var151_152 = var151_152.rest();
            if (module0453.NIL == var151_152) {
                SubLObject var157_158;
                final SubLObject var155_156 = var157_158 = var143;
                SubLObject var146 = (SubLObject)module0453.NIL;
                SubLObject var147 = (SubLObject)module0453.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var157_158, var155_156, (SubLObject)module0453.$ic145$);
                var146 = var157_158.first();
                var157_158 = var157_158.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var157_158, var155_156, (SubLObject)module0453.$ic145$);
                var147 = var157_158.first();
                var157_158 = var157_158.rest();
                if (module0453.NIL == var157_158) {
                    if (var144.equal(var146)) {
                        var139.resetMultipleValues();
                        final SubLObject var148 = f31115(var145, var147);
                        final SubLObject var149 = var139.secondMultipleValue();
                        final SubLObject var150 = var139.thirdMultipleValue();
                        var139.resetMultipleValues();
                        final SubLObject var151 = module0205.f13387(var148, (SubLObject)module0453.UNPROVIDED);
                        final SubLObject var152 = module0205.f13388(var148, (SubLObject)module0453.UNPROVIDED);
                        final SubLObject var153 = module0205.f13388(var149, (SubLObject)module0453.UNPROVIDED);
                        SubLObject var154 = f31053(var151, var153, var144);
                        SubLObject var155 = (SubLObject)module0453.NIL;
                        var155 = var154.first();
                        while (module0453.NIL != var154) {
                            var139.resetMultipleValues();
                            final SubLObject var156 = module0235.f15474(var152, var155, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                            final SubLObject var157 = var139.secondMultipleValue();
                            var139.resetMultipleValues();
                            if (module0453.NIL != var156) {
                                final SubLObject var158 = module0202.f12768(module0453.$ic0$, var151, var155);
                                final SubLObject var159 = module0202.f12768(module0453.$ic0$, var155, var153);
                                final SubLObject var160 = module0191.f11990((SubLObject)module0453.$ic26$, var158, var144, (SubLObject)module0453.UNPROVIDED);
                                final SubLObject var161 = module0191.f11990((SubLObject)module0453.$ic26$, var159, var144, (SubLObject)module0453.UNPROVIDED);
                                final SubLObject var162 = (SubLObject)ConsesLow.list(var160);
                                final SubLObject var163 = (SubLObject)ConsesLow.list(var161);
                                final SubLObject var164 = (SubLObject)((module0453.NIL != var150) ? ConsesLow.list(var162, var163) : ConsesLow.list(var163, var162));
                                module0376.f26641(var156, var164);
                            }
                            var154 = var154.rest();
                            var155 = var154.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var155_156, (SubLObject)module0453.$ic145$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var149_150, (SubLObject)module0453.$ic144$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var140, (SubLObject)module0453.$ic143$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31115(final SubLObject var154, final SubLObject var160) {
        if (module0453.NIL != module0173.f10955(module0205.f13387(var154, (SubLObject)module0453.UNPROVIDED))) {
            return Values.values(var154, var160, (SubLObject)module0453.T);
        }
        return Values.values(var160, var154, (SubLObject)module0453.NIL);
    }
    
    public static SubLObject f31116(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (module0453.NIL != module0269.f17710(var4)) {
            return module0358.f23690(f31117(var4));
        }
        return (SubLObject)module0453.$ic15$;
    }
    
    public static SubLObject f31118(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        if (module0453.NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED))) {
            return module0453.$g3595$.getGlobalValue();
        }
        return module0453.$g3596$.getGlobalValue();
    }
    
    public static SubLObject f31119(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31120(var1);
    }
    
    public static SubLObject f31121(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31122(var1);
    }
    
    public static SubLObject f31123(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31124(var1);
    }
    
    public static SubLObject f31122(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (module0453.NIL != module0259.f16975(var2, var3, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31120(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0453.NIL != module0018.$g646$.getDynamicValue(var2)) {
            return f31118(var1, (SubLObject)module0453.UNPROVIDED);
        }
        return module0453.$g3597$.getDynamicValue(var2);
    }
    
    public static SubLObject f31124(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0453.NIL;
        SubLObject var6 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0453.NIL == var4) {
            if (module0453.NIL != module0018.$g646$.getDynamicValue(var2) && module0453.NIL == module0259.f16975(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic28$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
            else if (module0453.NIL != module0259.f16982(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0453.$ic27$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31125(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        if (module0453.NIL != module0173.f10955(module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED))) {
            return module0453.$g3598$.getGlobalValue();
        }
        return module0453.$g3599$.getGlobalValue();
    }
    
    public static SubLObject f31126(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return module0435.f30613(f31125(var1, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31127(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31128(var1);
    }
    
    public static SubLObject f31129(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31130(var1);
    }
    
    public static SubLObject f31131(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return module0305.f20523(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31128(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0453.NIL;
        SubLObject var6 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0453.$ic27$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0453.NIL == var4) {
            if (module0453.NIL == module0173.f10955(var5) || module0453.NIL == module0259.f16975(var5, var6, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                final SubLObject var7 = module0144.$g1870$.currentBinding(var2);
                try {
                    module0144.$g1870$.bind((SubLObject)module0453.NIL, var2);
                    if (module0453.NIL != module0305.f20423(var6, var5, (SubLObject)module0453.NIL)) {
                        module0347.f23330(module0191.f11990((SubLObject)module0453.$ic42$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
                    }
                }
                finally {
                    module0144.$g1870$.rebind(var7, var2);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0453.$ic27$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31130(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        if (module0453.NIL != module0305.f20425(var3, var2, (SubLObject)module0453.NIL)) {
            module0347.f23330(module0191.f11990((SubLObject)module0453.$ic42$, module0205.f13338(var1), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31132(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        SubLObject var16;
        final SubLObject var15 = var16 = module0205.f13385(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0453.NIL;
        SubLObject var18 = (SubLObject)module0453.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic27$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0453.$ic27$);
        var18 = var16.first();
        var16 = var16.rest();
        if (module0453.NIL == var16) {
            if (module0453.NIL != module0259.f16975(var17, var18, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, var1, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0453.$ic27$);
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31133(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31134(var1);
    }
    
    public static SubLObject f31134(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0453.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        SubLObject var7;
        final SubLObject var6 = var7 = module0259.f16990(var4, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED);
        SubLObject var8 = (SubLObject)module0453.NIL;
        var8 = var7.first();
        while (module0453.NIL != var7) {
            var2.resetMultipleValues();
            final SubLObject var9 = module0235.f15474(var5, var8, (SubLObject)module0453.T, (SubLObject)module0453.T);
            final SubLObject var10 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (module0453.NIL != var9) {
                final SubLObject var11 = module0233.f15361(var9, var5);
                final SubLObject var12 = module0202.f12768(var3, var4, var11);
                module0347.f23330(module0191.f11990((SubLObject)module0453.$ic26$, var12, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED), var9, var10);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31135(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        return f31133(var1, (SubLObject)module0453.UNPROVIDED);
    }
    
    public static SubLObject f31136(final SubLObject var1, SubLObject var14) {
        if (var14 == module0453.UNPROVIDED) {
            var14 = (SubLObject)module0453.NIL;
        }
        final SubLObject var15 = module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED);
        return f31137(var15);
    }
    
    public static SubLObject f31138(final SubLObject var1) {
        return f31117(module0205.f13388(var1, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31117(final SubLObject var18) {
        if (module0453.NIL == module0173.f10955(var18)) {
            return (SubLObject)module0453.$ic47$;
        }
        if (module0453.NIL != module0305.f20523(var18)) {
            return (SubLObject)module0453.$ic47$;
        }
        if (module0453.NIL != module0226.f14858(var18, (SubLObject)module0453.UNPROVIDED)) {
            return (SubLObject)module0453.$ic48$;
        }
        return (SubLObject)module0453.$ic47$;
    }
    
    public static SubLObject f31139(final SubLObject var18) {
        return module0052.f3709(module0259.f16985(var18, (SubLObject)module0453.UNPROVIDED, (SubLObject)module0453.UNPROVIDED));
    }
    
    public static SubLObject f31137(final SubLObject var18) {
        return Numbers.max(module0549.f33913(var18), module0217.f14223(var18, (SubLObject)module0453.TWO_INTEGER, module0453.$ic146$));
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
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31141() {
        module0453.$g3588$ = SubLFiles.deflexical("S#34409", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)module0453.$ic20$));
        module0453.$g3589$ = SubLFiles.deflexical("S#34410", module0018.$g659$.getGlobalValue());
        module0453.$g3590$ = SubLFiles.defparameter("S#34411", (SubLObject)module0453.ONE_INTEGER);
        module0453.$g3591$ = SubLFiles.deflexical("S#34412", module0018.$g659$.getGlobalValue());
        module0453.$g3592$ = SubLFiles.deflexical("S#34413", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)module0453.$ic20$));
        module0453.$g3593$ = SubLFiles.defparameter("S#34414", (SubLObject)module0453.$ic49$);
        module0453.$g3594$ = SubLFiles.deflexical("S#34415", (SubLObject)module0453.$ic105$);
        module0453.$g3595$ = SubLFiles.deflexical("S#34416", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)module0453.$ic20$));
        module0453.$g3596$ = SubLFiles.deflexical("S#34417", module0018.$g659$.getGlobalValue());
        module0453.$g3597$ = SubLFiles.defparameter("S#34418", (SubLObject)module0453.ONE_INTEGER);
        module0453.$g3598$ = SubLFiles.deflexical("S#34419", module0018.$g659$.getGlobalValue());
        module0453.$g3599$ = SubLFiles.deflexical("S#34420", Numbers.subtract(module0018.$g659$.getGlobalValue(), (SubLObject)module0453.$ic20$));
        return (SubLObject)module0453.NIL;
    }
    
    public static SubLObject f31142() {
        module0340.f22938(module0453.$ic0$);
        module0340.f22946(module0453.$ic0$, (SubLObject)module0453.$ic1$);
        module0340.f22946(module0453.$ic0$, (SubLObject)module0453.$ic2$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic3$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic4$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic5$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic6$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic7$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic8$);
        module0340.f22944(module0453.$ic0$, (SubLObject)module0453.$ic9$);
        module0358.f23774((SubLObject)module0453.$ic10$, module0453.$ic0$);
        module0358.f23773((SubLObject)module0453.$ic11$, module0453.$ic0$);
        module0358.f23730((SubLObject)module0453.$ic12$, (SubLObject)module0453.$ic13$);
        module0358.f23730((SubLObject)module0453.$ic16$, (SubLObject)module0453.$ic17$);
        module0358.f23730((SubLObject)module0453.$ic18$, (SubLObject)module0453.$ic19$);
        module0340.f22941((SubLObject)module0453.$ic21$, (SubLObject)module0453.$ic22$);
        module0340.f22941((SubLObject)module0453.$ic23$, (SubLObject)module0453.$ic24$);
        module0340.f22941((SubLObject)module0453.$ic29$, (SubLObject)module0453.$ic30$);
        module0340.f22941((SubLObject)module0453.$ic31$, (SubLObject)module0453.$ic32$);
        module0340.f22941((SubLObject)module0453.$ic38$, (SubLObject)module0453.$ic39$);
        module0340.f22941((SubLObject)module0453.$ic40$, (SubLObject)module0453.$ic41$);
        module0340.f22941((SubLObject)module0453.$ic43$, (SubLObject)module0453.$ic44$);
        module0012.f419((SubLObject)module0453.$ic46$);
        module0340.f22941((SubLObject)module0453.$ic50$, (SubLObject)module0453.$ic51$);
        module0340.f22938(module0453.$ic52$);
        module0358.f23774((SubLObject)module0453.$ic10$, module0453.$ic52$);
        module0358.f23773((SubLObject)module0453.$ic11$, module0453.$ic52$);
        module0340.f22941((SubLObject)module0453.$ic56$, (SubLObject)module0453.$ic57$);
        module0340.f22941((SubLObject)module0453.$ic58$, (SubLObject)module0453.$ic59$);
        module0340.f22941((SubLObject)module0453.$ic60$, (SubLObject)module0453.$ic61$);
        module0340.f22941((SubLObject)module0453.$ic62$, (SubLObject)module0453.$ic63$);
        module0340.f22941((SubLObject)module0453.$ic64$, (SubLObject)module0453.$ic65$);
        module0340.f22941((SubLObject)module0453.$ic66$, (SubLObject)module0453.$ic67$);
        module0340.f22941((SubLObject)module0453.$ic68$, (SubLObject)module0453.$ic69$);
        module0340.f22941((SubLObject)module0453.$ic70$, (SubLObject)module0453.$ic71$);
        module0340.f22941((SubLObject)module0453.$ic73$, (SubLObject)module0453.$ic74$);
        module0340.f22941((SubLObject)module0453.$ic75$, (SubLObject)module0453.$ic76$);
        module0340.f22941((SubLObject)module0453.$ic78$, (SubLObject)module0453.$ic79$);
        module0340.f22941((SubLObject)module0453.$ic80$, (SubLObject)module0453.$ic81$);
        module0340.f22941((SubLObject)module0453.$ic82$, (SubLObject)module0453.$ic83$);
        module0340.f22941((SubLObject)module0453.$ic84$, (SubLObject)module0453.$ic85$);
        module0340.f22941((SubLObject)module0453.$ic88$, (SubLObject)module0453.$ic89$);
        module0340.f22941((SubLObject)module0453.$ic90$, (SubLObject)module0453.$ic91$);
        module0340.f22941((SubLObject)module0453.$ic92$, (SubLObject)module0453.$ic93$);
        module0340.f22941((SubLObject)module0453.$ic96$, (SubLObject)module0453.$ic97$);
        module0340.f22941((SubLObject)module0453.$ic98$, (SubLObject)module0453.$ic99$);
        module0340.f22941((SubLObject)module0453.$ic106$, (SubLObject)module0453.$ic107$);
        module0340.f22941((SubLObject)module0453.$ic108$, (SubLObject)module0453.$ic109$);
        module0340.f22941((SubLObject)module0453.$ic110$, (SubLObject)module0453.$ic111$);
        module0340.f22941((SubLObject)module0453.$ic112$, (SubLObject)module0453.$ic113$);
        module0340.f22941((SubLObject)module0453.$ic114$, (SubLObject)module0453.$ic115$);
        module0340.f22941((SubLObject)module0453.$ic116$, (SubLObject)module0453.$ic117$);
        module0340.f22941((SubLObject)module0453.$ic118$, (SubLObject)module0453.$ic119$);
        module0340.f22941((SubLObject)module0453.$ic120$, (SubLObject)module0453.$ic121$);
        module0340.f22941((SubLObject)module0453.$ic122$, (SubLObject)module0453.$ic123$);
        module0340.f22941((SubLObject)module0453.$ic124$, (SubLObject)module0453.$ic125$);
        module0340.f22941((SubLObject)module0453.$ic126$, (SubLObject)module0453.$ic127$);
        module0340.f22941((SubLObject)module0453.$ic128$, (SubLObject)module0453.$ic129$);
        module0340.f22941((SubLObject)module0453.$ic130$, (SubLObject)module0453.$ic131$);
        module0340.f22941((SubLObject)module0453.$ic132$, (SubLObject)module0453.$ic133$);
        module0340.f22941((SubLObject)module0453.$ic134$, (SubLObject)module0453.$ic135$);
        module0340.f22941((SubLObject)module0453.$ic136$, (SubLObject)module0453.$ic137$);
        module0340.f22962((SubLObject)module0453.$ic138$, (SubLObject)module0453.$ic139$);
        module0340.f22938(module0453.$ic146$);
        module0340.f22946(module0453.$ic146$, (SubLObject)module0453.$ic1$);
        module0340.f22946(module0453.$ic146$, (SubLObject)module0453.$ic2$);
        module0340.f22944(module0453.$ic146$, (SubLObject)module0453.$ic3$);
        module0358.f23774((SubLObject)module0453.$ic10$, module0453.$ic146$);
        module0358.f23773((SubLObject)module0453.$ic11$, module0453.$ic146$);
        module0358.f23730((SubLObject)module0453.$ic147$, (SubLObject)module0453.$ic148$);
        module0358.f23730((SubLObject)module0453.$ic149$, (SubLObject)module0453.$ic150$);
        module0340.f22941((SubLObject)module0453.$ic151$, (SubLObject)module0453.$ic152$);
        module0340.f22941((SubLObject)module0453.$ic153$, (SubLObject)module0453.$ic154$);
        module0340.f22941((SubLObject)module0453.$ic155$, (SubLObject)module0453.$ic156$);
        module0340.f22941((SubLObject)module0453.$ic157$, (SubLObject)module0453.$ic158$);
        module0340.f22941((SubLObject)module0453.$ic159$, (SubLObject)module0453.$ic160$);
        module0340.f22941((SubLObject)module0453.$ic161$, (SubLObject)module0453.$ic162$);
        module0340.f22941((SubLObject)module0453.$ic163$, (SubLObject)module0453.$ic164$);
        module0340.f22941((SubLObject)module0453.$ic165$, (SubLObject)module0453.$ic166$);
        return (SubLObject)module0453.NIL;
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
        module0453.$g3588$ = null;
        module0453.$g3589$ = null;
        module0453.$g3590$ = null;
        module0453.$g3591$ = null;
        module0453.$g3592$ = null;
        module0453.$g3593$ = null;
        module0453.$g3594$ = null;
        module0453.$g3595$ = null;
        module0453.$g3596$ = null;
        module0453.$g3597$ = null;
        module0453.$g3598$ = null;
        module0453.$g3599$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic1$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $ic10$ = SubLObjectFactory.makeKeyword("POS");
        $ic11$ = SubLObjectFactory.makeKeyword("NEG");
        $ic12$ = SubLObjectFactory.makeKeyword("ALL-INSTANCES-POS");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34330", "CYC"));
        $ic14$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic15$ = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $ic16$ = SubLObjectFactory.makeKeyword("ALL-ISA-POS");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $ic18$ = SubLObjectFactory.makeKeyword("ALL-ELEMENTOF-POS");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic20$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34319", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#29820", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)") });
        $ic23$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-NEG");
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34332", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#29819", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$isa <fort> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$isa #$Dog #$Predicate))") });
        $ic25$ = SubLObjectFactory.makeInteger(30);
        $ic26$ = SubLObjectFactory.makeKeyword("ISA");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"));
        $ic28$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic29$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS");
        $ic30$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-NAUT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34336", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34337", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString(""), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-NAUT")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34338", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34339", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString(""), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $ic33$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic34$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic35$ = SubLObjectFactory.makeKeyword("GAF");
        $ic36$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic37$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic38$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-POS");
        $ic39$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#29813", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34340", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34342", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa 42 #$Integer)") });
        $ic40$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-NEG");
        $ic41$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34341", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34343", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$isa 42 #$SubLString))") });
        $ic42$ = SubLObjectFactory.makeKeyword("DEFN");
        $ic43$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-ISA");
        $ic44$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1892", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34346", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fort> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)") });
        $ic45$ = SubLObjectFactory.makeSymbol("S#17515", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#34346", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic48$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic49$ = SubLObjectFactory.makeInteger(2300);
        $ic50$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-INSTANCES");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34320", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34321", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34348", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("ISA"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa ?DOG #$Dog)") });
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7306", "CYC"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#25107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5477", "CYC")));
        $ic54$ = SubLObjectFactory.makeKeyword("ELEMENTOF");
        $ic55$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic56$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-CHECK");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34322", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))") });
        $ic58$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ELEMENTOF-CHECK");
        $ic59$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34350", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))") });
        $ic60$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-CHECK");
        $ic61$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34351", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf #$Dog #$Collection)") });
        $ic62$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $ic63$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34352", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient") });
        $ic64$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-SET-CHECK");
        $ic65$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P"))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33891", "CYC")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34353", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)") });
        $ic66$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK");
        $ic67$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34354", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34355", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$elementOf #$Dog #$Predicate))") });
        $ic68$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $ic69$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34356", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary") });
        $ic70$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ELEMENTOF-SET-CHECK");
        $ic71$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34357", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34358", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34359", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))") });
        $ic72$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic73$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-THESETOF-CHECK");
        $ic74$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34360", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $ic75$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-CHECK");
        $ic76$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ALL-INSTANCES")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34362", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $ic77$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic78$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK");
        $ic79$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#26270", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34363", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))") });
        $ic80$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK");
        $ic81$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#26270", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34364", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))") });
        $ic82$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-ELEMENTOF");
        $ic83$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1892", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34365", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <fort> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf #$Dog ?WHAT)") });
        $ic84$ = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ALL-ELEMENTOF");
        $ic85$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1892", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34366", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)") });
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic87$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#25107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5477", "CYC"));
        $ic88$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-UNIFY");
        $ic89$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34367", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34368", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))") });
        $ic90$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-UNIFY");
        $ic91$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34369", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34370", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34371", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("ISA"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf ?DOG #$Dog)") });
        $ic92$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-SET-UNIFY");
        $ic93$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34372", "CYC"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33891", "CYC")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34373", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)") });
        $ic94$ = SubLObjectFactory.makeSymbol("S#15513", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("HL");
        $ic96$ = SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-THESETOF-UNIFY");
        $ic97$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34374", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34376", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $ic98$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-UNIFY");
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ALL-INSTANCES")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34377", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34378", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subcollectionFunctionDefiningRule"));
        $ic102$ = SubLObjectFactory.makeString("Expected ~s to have only one free variable");
        $ic103$ = SubLObjectFactory.makeString("Expected exactly one poslit in ~S");
        $ic104$ = SubLObjectFactory.makeString("Expected exactly one #$termOfUnit neglit in ~S");
        $ic105$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOccursAtFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")));
        $ic106$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY");
        $ic107$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $ic108$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK");
        $ic109$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $ic110$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY");
        $ic111$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $ic112$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK");
        $ic113$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $ic114$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY");
        $ic115$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $ic116$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK");
        $ic117$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $ic118$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY");
        $ic119$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $ic120$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK");
        $ic121$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $ic122$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY");
        $ic123$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOccursAtFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $ic124$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK");
        $ic125$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOccursAtFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $ic126$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY");
        $ic127$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34379", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $ic128$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK");
        $ic129$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $ic130$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY");
        $ic131$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $ic132$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK");
        $ic133$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $ic134$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY");
        $ic135$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $ic136$ = SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK");
        $ic137$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34381", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $ic138$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-ISA-OF-TYPE");
        $ic139$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#34325", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)module0453.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#25167", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34421", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#25169", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34422", "CYC"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34384", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34421", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#25167", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34422", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#25169", "CYC")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34385", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34386", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))") });
        $ic140$ = SubLObjectFactory.makeSymbol("S#15975", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic142$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34273", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34268", "CYC"));
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34270", "CYC"));
        $ic146$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic147$ = SubLObjectFactory.makeKeyword("ALL-QUOTED-INSTANCES-POS");
        $ic148$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34388", "CYC"));
        $ic149$ = SubLObjectFactory.makeKeyword("ALL-QUOTED-ISA-POS");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $ic151$ = SubLObjectFactory.makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS");
        $ic152$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34326", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34327", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa <fort> <fort>)") });
        $ic153$ = SubLObjectFactory.makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG");
        $ic154$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34389", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34390", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$quotedIsa <fort> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$quotedIsa #$Dog #$Predicate))") });
        $ic155$ = SubLObjectFactory.makeKeyword("REMOVAL-QUOTED-ISA-DEFN-POS");
        $ic156$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34328", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34394", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34396", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$quotedIsa 42 #$SubLInteger)") });
        $ic157$ = SubLObjectFactory.makeKeyword("REMOVAL-QUOTED-ISA-DEFN-NEG");
        $ic158$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34395", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34397", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$quotedIsa 42 #$SubLString))") });
        $ic159$ = SubLObjectFactory.makeKeyword("REMOVAL-NAT-QUOTED-ISA");
        $ic160$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34400", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)") });
        $ic161$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-QUOTED-ISA");
        $ic162$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1892", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34401", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa <fort> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$quotedIsa #$Dog ?COL)") });
        $ic163$ = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ALL-QUOTED-ISA");
        $ic164$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1892", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34403", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)") });
        $ic165$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-QUOTED-INSTANCES");
        $ic166$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34404", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34405", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34407", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("ISA"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quotedIsa <not fully-bound> <fort>)") });
    }
    
    public static final class $f31054$UnaryFunction extends UnaryFunction
    {
        public $f31054$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34319"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31054(var15, (SubLObject)$f31054$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31054$BinaryFunction extends BinaryFunction
    {
        public $f31054$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34319"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31054(var15, var16);
        }
    }
    
    public static final class $f31073$UnaryFunction extends UnaryFunction
    {
        public $f31073$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34320"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31073(var15, (SubLObject)$f31073$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31073$BinaryFunction extends BinaryFunction
    {
        public $f31073$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34320"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31073(var15, var16);
        }
    }
    
    public static final class $f31075$UnaryFunction extends UnaryFunction
    {
        public $f31075$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34321"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31075(var15);
        }
    }
    
    public static final class $f31077$UnaryFunction extends UnaryFunction
    {
        public $f31077$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34322"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31077(var15, (SubLObject)$f31077$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31077$BinaryFunction extends BinaryFunction
    {
        public $f31077$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34322"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31077(var15, var16);
        }
    }
    
    public static final class $f31112$UnaryFunction extends UnaryFunction
    {
        public $f31112$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34325"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31112(var15);
        }
    }
    
    public static final class $f31118$UnaryFunction extends UnaryFunction
    {
        public $f31118$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34326"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31118(var15, (SubLObject)$f31118$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31118$BinaryFunction extends BinaryFunction
    {
        public $f31118$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34326"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31118(var15, var16);
        }
    }
    
    public static final class $f31121$UnaryFunction extends UnaryFunction
    {
        public $f31121$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34327"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31121(var15, (SubLObject)$f31121$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31121$BinaryFunction extends BinaryFunction
    {
        public $f31121$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34327"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31121(var15, var16);
        }
    }
    
    public static final class $f31131$UnaryFunction extends UnaryFunction
    {
        public $f31131$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34328"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0453.f31131(var15, (SubLObject)$f31131$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31131$BinaryFunction extends BinaryFunction
    {
        public $f31131$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34328"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0453.f31131(var15, var16);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0453.class
	Total time: 1196 ms
	
	Decompiled with Procyon 0.5.32.
*/