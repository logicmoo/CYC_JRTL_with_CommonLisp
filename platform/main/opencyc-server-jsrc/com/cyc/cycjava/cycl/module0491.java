package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0491 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0491";
    public static final String myFingerPrint = "b279237f86fc33ed003c588d5bd1ff3625fe04307a44cf6f4e9d21bdcb120af1";
    public static SubLSymbol $g3734$;
    private static SubLSymbol $g3735$;
    public static SubLSymbol $g3736$;
    private static SubLSymbol $g3737$;
    private static SubLSymbol $g3738$;
    public static SubLSymbol $g3739$;
    private static SubLSymbol $g3740$;
    private static SubLSymbol $g3741$;
    public static SubLSymbol $g3742$;
    private static SubLSymbol $g3743$;
    private static SubLSymbol $g3744$;
    public static SubLSymbol $g3745$;
    private static SubLSymbol $g3746$;
    private static SubLSymbol $g3747$;
    public static SubLSymbol $g3748$;
    private static SubLSymbol $g3749$;
    public static SubLSymbol $g3750$;
    private static SubLSymbol $g3751$;
    public static SubLSymbol $g3752$;
    private static SubLSymbol $g3753$;
    public static SubLSymbol $g3754$;
    private static SubLSymbol $g3755$;
    private static SubLSymbol $g3756$;
    public static SubLSymbol $g3757$;
    private static SubLSymbol $g3758$;
    public static SubLSymbol $g3759$;
    private static SubLSymbol $g3760$;
    private static SubLSymbol $g3761$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLInteger $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLList $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLList $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    
    public static SubLObject f32034(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0146.$g1962$.currentBinding(var2);
        try {
            module0146.$g1962$.bind((SubLObject)$ic0$, var2);
            var1 = module0205.f13144(var1);
        }
        finally {
            module0146.$g1962$.rebind(var3, var2);
        }
        return var1;
    }
    
    public static SubLObject f32035(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3734$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32036(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        if (NIL != module0217.f14342(var9)) {
            return assertion_handles_oc.f11019();
        }
        return module0217.f14336(var9);
    }
    
    public static SubLObject f32037(final SubLObject var10, final SubLObject var11) {
        return Equality.equal(var11, module0178.f11303(var10));
    }
    
    public static SubLObject f32038(final SubLObject var10, final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        SubLObject var14 = module0202.f12768($ic18$, var10, var12);
        if (NIL != var13) {
            var14 = module0205.f13338(var14);
        }
        return f32039(var14, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32039(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3736$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32040(final SubLObject var10, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        try {
            var15.throwStack.push($ic24$);
            final SubLObject var17 = Errors.$error_handler$.currentBinding(var15);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic25$), var15);
                try {
                    return module0538.f33478(var10, var14);
                }
                catch (Throwable var18) {
                    Errors.handleThrowable(var18, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var17, var15);
            }
        }
        catch (Throwable var19) {
            var16 = Errors.handleThrowable(var19, (SubLObject)$ic24$);
        }
        finally {
            var15.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32041(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic31$, var9);
            module0147.$g2095$.bind($ic32$, var9);
            var11 = module0349.f23451(var10, (SubLObject)$ic2$);
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return var11;
    }
    
    public static SubLObject f32042(final SubLObject var10, final SubLObject var21, final SubLObject var18) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var10)) {
            final SubLObject var23 = module0178.f11285(var10);
            var22.resetMultipleValues();
            final SubLObject var24 = module0235.f15474(var21, var10, (SubLObject)T, (SubLObject)T);
            final SubLObject var25 = var22.secondMultipleValue();
            var22.resetMultipleValues();
            if (NIL != var24) {
                var22.resetMultipleValues();
                final SubLObject var26 = module0235.f15476(var18, var23, (SubLObject)T, (SubLObject)T);
                final SubLObject var27 = var22.secondMultipleValue();
                final SubLObject var28 = var22.thirdMultipleValue();
                var22.resetMultipleValues();
                if (NIL != var26 && NIL == module0233.f15405(var24, var26)) {
                    module0347.f23330(f32038(var10, var23, (SubLObject)NIL), ConsesLow.nconc(var24, var26), ConsesLow.append(var25, var28));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32043(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return f32041(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32044(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0202.f12834(var7, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic31$, var9);
            module0147.$g2095$.bind($ic32$, var9);
            final SubLObject var14 = module0349.f23449(var11, (SubLObject)$ic2$);
            final SubLObject var16;
            final SubLObject var15 = var16 = module0158.f10294(var14);
            if (var16.eql((SubLObject)$ic33$)) {
                var9.resetMultipleValues();
                final SubLObject var17 = module0158.f10297(var14);
                final SubLObject var18 = var9.secondMultipleValue();
                final SubLObject var19 = var9.thirdMultipleValue();
                var9.resetMultipleValues();
                if (NIL != var18) {
                    if (NIL != var19) {
                        final SubLObject var20 = var19;
                        if (NIL != module0158.f10010(var17, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var17, var18, var20);
                            SubLObject var22 = (SubLObject)NIL;
                            final SubLObject var23 = (SubLObject)NIL;
                            while (NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                                if (NIL != var25) {
                                    SubLObject var26 = (SubLObject)NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                        SubLObject var36_41 = (SubLObject)NIL;
                                        final SubLObject var37_42 = (SubLObject)NIL;
                                        while (NIL == var36_41) {
                                            final SubLObject var27 = module0052.f3695(var26, var37_42);
                                            final SubLObject var39_43 = (SubLObject)makeBoolean(!var37_42.eql(var27));
                                            if (NIL != var39_43) {
                                                f32042(var27, var10, var11);
                                            }
                                            var36_41 = (SubLObject)makeBoolean(NIL == var39_43);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                            if (NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_44, var9);
                                        }
                                    }
                                }
                                var22 = (SubLObject)makeBoolean(NIL == var25);
                            }
                        }
                    }
                    else {
                        final SubLObject var20 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var17, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var17, var18, var20);
                            SubLObject var22 = (SubLObject)NIL;
                            final SubLObject var23 = (SubLObject)NIL;
                            while (NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                                if (NIL != var25) {
                                    SubLObject var26 = (SubLObject)NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                        SubLObject var36_42 = (SubLObject)NIL;
                                        final SubLObject var37_43 = (SubLObject)NIL;
                                        while (NIL == var36_42) {
                                            final SubLObject var27 = module0052.f3695(var26, var37_43);
                                            final SubLObject var39_44 = (SubLObject)makeBoolean(!var37_43.eql(var27));
                                            if (NIL != var39_44) {
                                                f32042(var27, var10, var11);
                                            }
                                            var36_42 = (SubLObject)makeBoolean(NIL == var39_44);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                            if (NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_45, var9);
                                        }
                                    }
                                }
                                var22 = (SubLObject)makeBoolean(NIL == var25);
                            }
                        }
                    }
                }
                else if (NIL != var19) {
                    final SubLObject var20 = var19;
                    if (NIL != module0158.f10010(var17, (SubLObject)NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, (SubLObject)NIL, var20);
                        SubLObject var22 = (SubLObject)NIL;
                        final SubLObject var23 = (SubLObject)NIL;
                        while (NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                            if (NIL != var25) {
                                SubLObject var26 = (SubLObject)NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_43 = (SubLObject)NIL;
                                    final SubLObject var37_44 = (SubLObject)NIL;
                                    while (NIL == var36_43) {
                                        final SubLObject var27 = module0052.f3695(var26, var37_44);
                                        final SubLObject var39_45 = (SubLObject)makeBoolean(!var37_44.eql(var27));
                                        if (NIL != var39_45) {
                                            f32042(var27, var10, var11);
                                        }
                                        var36_43 = (SubLObject)makeBoolean(NIL == var39_45);
                                    }
                                }
                                finally {
                                    final SubLObject var3_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_46, var9);
                                    }
                                }
                            }
                            var22 = (SubLObject)makeBoolean(NIL == var25);
                        }
                    }
                }
                else {
                    final SubLObject var20 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var17, (SubLObject)NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, (SubLObject)NIL, var20);
                        SubLObject var22 = (SubLObject)NIL;
                        final SubLObject var23 = (SubLObject)NIL;
                        while (NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                            if (NIL != var25) {
                                SubLObject var26 = (SubLObject)NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_44 = (SubLObject)NIL;
                                    final SubLObject var37_45 = (SubLObject)NIL;
                                    while (NIL == var36_44) {
                                        final SubLObject var27 = module0052.f3695(var26, var37_45);
                                        final SubLObject var39_46 = (SubLObject)makeBoolean(!var37_45.eql(var27));
                                        if (NIL != var39_46) {
                                            f32042(var27, var10, var11);
                                        }
                                        var36_44 = (SubLObject)makeBoolean(NIL == var39_46);
                                    }
                                }
                                finally {
                                    final SubLObject var3_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_47, var9);
                                    }
                                }
                            }
                            var22 = (SubLObject)makeBoolean(NIL == var25);
                        }
                    }
                }
            }
            else if (var16.eql((SubLObject)$ic35$)) {
                final SubLObject var28 = module0158.f10299(var14);
                if (NIL != module0158.f10038(var28)) {
                    final SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var3_48 = module0012.$g73$.currentBinding(var9);
                    final SubLObject var20_60 = module0012.$g65$.currentBinding(var9);
                    final SubLObject var30 = module0012.$g67$.currentBinding(var9);
                    final SubLObject var31 = module0012.$g68$.currentBinding(var9);
                    final SubLObject var32 = module0012.$g66$.currentBinding(var9);
                    final SubLObject var33 = module0012.$g69$.currentBinding(var9);
                    final SubLObject var34 = module0012.$g70$.currentBinding(var9);
                    final SubLObject var35 = module0012.$silent_progressP$.currentBinding(var9);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var9);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var9), var9);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var9);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g70$.bind((SubLObject)T, var9);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var29) ? module0012.$silent_progressP$.getDynamicValue(var9) : T), var9);
                        module0012.f474(var29);
                        final SubLObject var36 = module0158.f10039(var28);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                module0012.f476();
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_45 = (SubLObject)NIL;
                                    final SubLObject var37_46 = (SubLObject)NIL;
                                    while (NIL == var36_45) {
                                        final SubLObject var42 = module0052.f3695(var41, var37_46);
                                        final SubLObject var39_47 = (SubLObject)makeBoolean(!var37_46.eql(var42));
                                        if (NIL != var39_47) {
                                            f32042(var42, var10, var11);
                                        }
                                        var36_45 = (SubLObject)makeBoolean(NIL == var39_47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_49, var9);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var35, var9);
                        module0012.$g70$.rebind(var34, var9);
                        module0012.$g69$.rebind(var33, var9);
                        module0012.$g66$.rebind(var32, var9);
                        module0012.$g68$.rebind(var31, var9);
                        module0012.$g67$.rebind(var30, var9);
                        module0012.$g65$.rebind(var20_60, var9);
                        module0012.$g73$.rebind(var3_48, var9);
                    }
                }
            }
            else if (var16.eql((SubLObject)$ic36$)) {
                SubLObject var43 = module0218.f14453(module0158.f10301(var14), (SubLObject)UNPROVIDED);
                SubLObject var44 = (SubLObject)NIL;
                var44 = var43.first();
                while (NIL != var43) {
                    if (NIL == module0130.f8518((SubLObject)$ic2$) || NIL != module0178.f11343(var44, module0130.f8518((SubLObject)$ic2$))) {
                        f32042(var44, var10, var11);
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
            else {
                module0158.f10295(var14, var15);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32045(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return f32041(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32046(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0202.f12834(var7, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic31$, var9);
            module0147.$g2095$.bind($ic32$, var9);
            final SubLObject var14 = module0349.f23449(var11, (SubLObject)$ic2$);
            final SubLObject var16;
            final SubLObject var15 = var16 = module0158.f10294(var14);
            if (var16.eql((SubLObject)$ic33$)) {
                var9.resetMultipleValues();
                final SubLObject var17 = module0158.f10297(var14);
                final SubLObject var18 = var9.secondMultipleValue();
                final SubLObject var19 = var9.thirdMultipleValue();
                var9.resetMultipleValues();
                if (NIL != var18) {
                    if (NIL != var19) {
                        final SubLObject var20 = var19;
                        if (NIL != module0158.f10010(var17, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var17, var18, var20);
                            SubLObject var22 = (SubLObject)NIL;
                            final SubLObject var23 = (SubLObject)NIL;
                            while (NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                                if (NIL != var25) {
                                    SubLObject var26 = (SubLObject)NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                        SubLObject var36_73 = (SubLObject)NIL;
                                        final SubLObject var37_74 = (SubLObject)NIL;
                                        while (NIL == var36_73) {
                                            final SubLObject var27 = module0052.f3695(var26, var37_74);
                                            final SubLObject var39_75 = (SubLObject)makeBoolean(!var37_74.eql(var27));
                                            if (NIL != var39_75) {
                                                f32042(var27, var10, var11);
                                            }
                                            var36_73 = (SubLObject)makeBoolean(NIL == var39_75);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                            if (NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_76, var9);
                                        }
                                    }
                                }
                                var22 = (SubLObject)makeBoolean(NIL == var25);
                            }
                        }
                    }
                    else {
                        final SubLObject var20 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var17, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var17, var18, var20);
                            SubLObject var22 = (SubLObject)NIL;
                            final SubLObject var23 = (SubLObject)NIL;
                            while (NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                                if (NIL != var25) {
                                    SubLObject var26 = (SubLObject)NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                        SubLObject var36_74 = (SubLObject)NIL;
                                        final SubLObject var37_75 = (SubLObject)NIL;
                                        while (NIL == var36_74) {
                                            final SubLObject var27 = module0052.f3695(var26, var37_75);
                                            final SubLObject var39_76 = (SubLObject)makeBoolean(!var37_75.eql(var27));
                                            if (NIL != var39_76) {
                                                f32042(var27, var10, var11);
                                            }
                                            var36_74 = (SubLObject)makeBoolean(NIL == var39_76);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                            if (NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_77, var9);
                                        }
                                    }
                                }
                                var22 = (SubLObject)makeBoolean(NIL == var25);
                            }
                        }
                    }
                }
                else if (NIL != var19) {
                    final SubLObject var20 = var19;
                    if (NIL != module0158.f10010(var17, (SubLObject)NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, (SubLObject)NIL, var20);
                        SubLObject var22 = (SubLObject)NIL;
                        final SubLObject var23 = (SubLObject)NIL;
                        while (NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                            if (NIL != var25) {
                                SubLObject var26 = (SubLObject)NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_75 = (SubLObject)NIL;
                                    final SubLObject var37_76 = (SubLObject)NIL;
                                    while (NIL == var36_75) {
                                        final SubLObject var27 = module0052.f3695(var26, var37_76);
                                        final SubLObject var39_77 = (SubLObject)makeBoolean(!var37_76.eql(var27));
                                        if (NIL != var39_77) {
                                            f32042(var27, var10, var11);
                                        }
                                        var36_75 = (SubLObject)makeBoolean(NIL == var39_77);
                                    }
                                }
                                finally {
                                    final SubLObject var3_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_78, var9);
                                    }
                                }
                            }
                            var22 = (SubLObject)makeBoolean(NIL == var25);
                        }
                    }
                }
                else {
                    final SubLObject var20 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var17, (SubLObject)NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, (SubLObject)NIL, var20);
                        SubLObject var22 = (SubLObject)NIL;
                        final SubLObject var23 = (SubLObject)NIL;
                        while (NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                            if (NIL != var25) {
                                SubLObject var26 = (SubLObject)NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_76 = (SubLObject)NIL;
                                    final SubLObject var37_77 = (SubLObject)NIL;
                                    while (NIL == var36_76) {
                                        final SubLObject var27 = module0052.f3695(var26, var37_77);
                                        final SubLObject var39_78 = (SubLObject)makeBoolean(!var37_77.eql(var27));
                                        if (NIL != var39_78) {
                                            f32042(var27, var10, var11);
                                        }
                                        var36_76 = (SubLObject)makeBoolean(NIL == var39_78);
                                    }
                                }
                                finally {
                                    final SubLObject var3_79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_79, var9);
                                    }
                                }
                            }
                            var22 = (SubLObject)makeBoolean(NIL == var25);
                        }
                    }
                }
            }
            else if (var16.eql((SubLObject)$ic35$)) {
                final SubLObject var28 = module0158.f10299(var14);
                if (NIL != module0158.f10038(var28)) {
                    final SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var3_80 = module0012.$g73$.currentBinding(var9);
                    final SubLObject var20_90 = module0012.$g65$.currentBinding(var9);
                    final SubLObject var30 = module0012.$g67$.currentBinding(var9);
                    final SubLObject var31 = module0012.$g68$.currentBinding(var9);
                    final SubLObject var32 = module0012.$g66$.currentBinding(var9);
                    final SubLObject var33 = module0012.$g69$.currentBinding(var9);
                    final SubLObject var34 = module0012.$g70$.currentBinding(var9);
                    final SubLObject var35 = module0012.$silent_progressP$.currentBinding(var9);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var9);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var9), var9);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var9);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0012.$g70$.bind((SubLObject)T, var9);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var29) ? module0012.$silent_progressP$.getDynamicValue(var9) : T), var9);
                        module0012.f474(var29);
                        final SubLObject var36 = module0158.f10039(var28);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                module0012.f476();
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic34$, module0130.f8518((SubLObject)$ic2$), (SubLObject)NIL);
                                    SubLObject var36_77 = (SubLObject)NIL;
                                    final SubLObject var37_78 = (SubLObject)NIL;
                                    while (NIL == var36_77) {
                                        final SubLObject var42 = module0052.f3695(var41, var37_78);
                                        final SubLObject var39_79 = (SubLObject)makeBoolean(!var37_78.eql(var42));
                                        if (NIL != var39_79) {
                                            f32042(var42, var10, var11);
                                        }
                                        var36_77 = (SubLObject)makeBoolean(NIL == var39_79);
                                    }
                                }
                                finally {
                                    final SubLObject var3_81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_81, var9);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var35, var9);
                        module0012.$g70$.rebind(var34, var9);
                        module0012.$g69$.rebind(var33, var9);
                        module0012.$g66$.rebind(var32, var9);
                        module0012.$g68$.rebind(var31, var9);
                        module0012.$g67$.rebind(var30, var9);
                        module0012.$g65$.rebind(var20_90, var9);
                        module0012.$g73$.rebind(var3_80, var9);
                    }
                }
            }
            else if (var16.eql((SubLObject)$ic36$)) {
                SubLObject var43 = module0218.f14453(module0158.f10301(var14), (SubLObject)UNPROVIDED);
                SubLObject var44 = (SubLObject)NIL;
                var44 = var43.first();
                while (NIL != var43) {
                    if (NIL == module0130.f8518((SubLObject)$ic2$) || NIL != module0178.f11343(var44, module0130.f8518((SubLObject)$ic2$))) {
                        f32042(var44, var10, var11);
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
            else {
                module0158.f10295(var14, var15);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32047(final SubLObject var10, final SubLObject var95) {
        return Equality.equal(var95, assertion_handles_oc.f11025(var10));
    }
    
    public static SubLObject f32048(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3739$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32049(final SubLObject var96) {
        return module0004.f104(var96, $g3741$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32050(final SubLObject var97) {
        if (var97.eql((SubLObject)$ic53$)) {
            return $ic54$;
        }
        if (var97.eql((SubLObject)$ic55$)) {
            return $ic56$;
        }
        if (var97.eql((SubLObject)$ic57$)) {
            return $ic58$;
        }
        Errors.error((SubLObject)$ic59$, var97);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32051(final SubLObject var98) {
        if (var98.eql($ic54$)) {
            return (SubLObject)$ic53$;
        }
        if (var98.eql($ic56$)) {
            return (SubLObject)$ic55$;
        }
        if (var98.eql($ic58$)) {
            return (SubLObject)$ic57$;
        }
        Errors.error((SubLObject)$ic60$, var98);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32052(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3742$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32053(final SubLObject var96) {
        return module0004.f104(var96, $g3744$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32054(final SubLObject var99) {
        if (var99.eql((SubLObject)$ic70$)) {
            return $ic71$;
        }
        if (var99.eql((SubLObject)$ic72$)) {
            return $ic73$;
        }
        Errors.error((SubLObject)$ic74$, var99);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32055(final SubLObject var100) {
        if (var100.eql($ic71$)) {
            return (SubLObject)$ic70$;
        }
        if (var100.eql($ic73$)) {
            return (SubLObject)$ic72$;
        }
        Errors.error((SubLObject)$ic75$, var100);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32056(final SubLObject var10, final SubLObject var99) {
        assert NIL != assertion_handles_oc.f11035(var10) : var10;
        assert NIL != module0130.f8507(var99) : var99;
        return Equality.eql(var99, module0178.f11293(var10));
    }
    
    public static SubLObject f32057(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3745$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32058(final SubLObject var96) {
        return module0004.f104(var96, $g3747$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32059(final SubLObject var101) {
        if (var101.eql((SubLObject)$ic87$)) {
            return $ic88$;
        }
        if (var101.eql((SubLObject)$ic89$)) {
            return $ic90$;
        }
        if (var101.eql((SubLObject)$ic91$)) {
            return $ic92$;
        }
        Errors.error((SubLObject)$ic93$, var101);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32060(final SubLObject var102) {
        if (var102.eql($ic88$)) {
            return (SubLObject)$ic87$;
        }
        if (var102.eql($ic90$)) {
            return (SubLObject)$ic89$;
        }
        if (var102.eql($ic92$)) {
            return (SubLObject)$ic91$;
        }
        Errors.error((SubLObject)$ic94$, var102);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32061(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3748$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32062(final SubLObject var10, final SubLObject var103) {
        assert NIL != assertion_handles_oc.f11035(var10) : var10;
        assert NIL != module0173.f10955(var103) : var103;
        if (var103.eql($ic104$)) {
            return module0178.f11375(var10);
        }
        if (var103.eql($ic105$)) {
            return module0178.f11376(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32063(final SubLObject var10) {
        assert NIL != assertion_handles_oc.f11035(var10) : var10;
        SubLObject var11 = (SubLObject)NIL;
        if (NIL != module0178.f11375(var10)) {
            var11 = (SubLObject)ConsesLow.cons($ic104$, var11);
        }
        if (NIL != module0178.f11376(var10)) {
            var11 = (SubLObject)ConsesLow.cons($ic105$, var11);
        }
        return Sequences.nreverse(var11);
    }
    
    public static SubLObject f32064(SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        var1 = f32034(var1);
        var4 = $g3750$.getGlobalValue();
        final SubLObject var5 = module0191.f11990((SubLObject)$ic6$, var1, var4, (SubLObject)$ic7$);
        final SubLObject var6 = (SubLObject)NIL;
        return Values.values(var5, var6);
    }
    
    public static SubLObject f32065(final SubLObject var10, final SubLObject var105) {
        return Equality.equal(var105, module0178.f11295(var10));
    }
    
    public static SubLObject f32066(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        final SubLObject var107 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic115$, var105);
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = assertion_handles_oc.f11010();
        final SubLObject var110 = var107;
        final SubLObject var111 = module0065.f4733(var109);
        SubLObject var112 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var110) : var110;
        final SubLObject var113 = module0012.$g75$.currentBinding(var106);
        final SubLObject var114 = module0012.$g76$.currentBinding(var106);
        final SubLObject var115 = module0012.$g77$.currentBinding(var106);
        final SubLObject var116 = module0012.$g78$.currentBinding(var106);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var106);
            module0012.$g76$.bind((SubLObject)NIL, var106);
            module0012.$g77$.bind((SubLObject)T, var106);
            module0012.$g78$.bind(Time.get_universal_time(), var106);
            module0012.f478(var110);
            final SubLObject var112_113 = var109;
            if (NIL == module0065.f4772(var112_113, (SubLObject)$ic117$)) {
                final SubLObject var114_115 = var112_113;
                if (NIL == module0065.f4775(var114_115, (SubLObject)$ic117$)) {
                    final SubLObject var117 = module0065.f4740(var114_115);
                    final SubLObject var118 = (SubLObject)NIL;
                    SubLObject var119;
                    SubLObject var120;
                    SubLObject var121;
                    SubLObject var122;
                    for (var119 = Sequences.length(var117), var120 = (SubLObject)NIL, var120 = (SubLObject)ZERO_INTEGER; var120.numL(var119); var120 = Numbers.add(var120, (SubLObject)ONE_INTEGER)) {
                        var121 = ((NIL != var118) ? Numbers.subtract(var119, var120, (SubLObject)ONE_INTEGER) : var120);
                        var122 = Vectors.aref(var117, var121);
                        if (NIL == module0065.f4749(var122) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                            if (NIL != module0065.f4749(var122)) {
                                var122 = (SubLObject)$ic117$;
                            }
                            module0012.note_percent_progress(var112, var111);
                            var112 = Numbers.add(var112, (SubLObject)ONE_INTEGER);
                            if (NIL != f32065(var122, var105)) {
                                var108 = (SubLObject)ConsesLow.cons(var122, var108);
                            }
                        }
                    }
                }
                final SubLObject var122_123 = var112_113;
                if (NIL == module0065.f4777(var122_123) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                    final SubLObject var123 = module0065.f4738(var122_123);
                    SubLObject var124 = module0065.f4739(var122_123);
                    final SubLObject var125 = module0065.f4734(var122_123);
                    final SubLObject var126 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic117$)) ? NIL : $ic117$);
                    while (var124.numL(var125)) {
                        final SubLObject var127 = Hashtables.gethash_without_values(var124, var123, var126);
                        if (NIL == module0065.f4773((SubLObject)$ic117$) || NIL == module0065.f4749(var127)) {
                            module0012.note_percent_progress(var112, var111);
                            var112 = Numbers.add(var112, (SubLObject)ONE_INTEGER);
                            if (NIL != f32065(var127, var105)) {
                                var108 = (SubLObject)ConsesLow.cons(var127, var108);
                            }
                        }
                        var124 = Numbers.add(var124, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var116, var106);
            module0012.$g77$.rebind(var115, var106);
            module0012.$g76$.rebind(var114, var106);
            module0012.$g75$.rebind(var113, var106);
        }
        return Sequences.nreverse(var108);
    }
    
    public static SubLObject f32067(final SubLObject var105, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)$ic118$;
        }
        final SubLObject var128 = var127;
        if (var128.eql((SubLObject)$ic118$)) {
            final SubLObject var129 = assertion_handles_oc.f11008();
            final SubLObject var130 = (SubLObject)ConsesLow.list(var105);
            return module0052.f3781(var129, (SubLObject)$ic119$, var130);
        }
        if (var128.eql((SubLObject)$ic120$)) {
            return module0052.f3709(f32066(var105));
        }
        return Errors.error((SubLObject)$ic121$, var127);
    }
    
    public static SubLObject f32068() {
        final SubLObject var130 = module0339.f22757();
        return (SubLObject)makeBoolean(NIL == var130 || NIL != inference_datastructures_inference_oc.f25604(var130));
    }
    
    public static SubLObject f32069() {
        return Numbers.integerDivide(assertion_handles_oc.f11019(), Numbers.max((SubLObject)ONE_INTEGER, module0549.f33895($ic128$)));
    }
    
    public static SubLObject f32070(final SubLObject var105) {
        return module0048.f3274(f32069());
    }
    
    public static SubLObject f32071(final SubLObject var105) {
        final SubLObject var106 = (SubLObject)((NIL != f32068()) ? $ic120$ : $ic118$);
        return f32067(var105, var106);
    }
    
    public static SubLObject f32072(final SubLObject var10, final SubLObject var131) {
        return Equality.eql(var131, module0178.f11296(var10));
    }
    
    public static SubLObject f32073(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        assert NIL != module0051.f3603(var131) : var131;
        final SubLObject var133 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic136$, module0051.f3617(var131));
        SubLObject var134 = (SubLObject)NIL;
        final SubLObject var135 = assertion_handles_oc.f11010();
        final SubLObject var136 = var133;
        final SubLObject var137 = module0065.f4733(var135);
        SubLObject var138 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var136) : var136;
        final SubLObject var139 = module0012.$g75$.currentBinding(var132);
        final SubLObject var140 = module0012.$g76$.currentBinding(var132);
        final SubLObject var141 = module0012.$g77$.currentBinding(var132);
        final SubLObject var142 = module0012.$g78$.currentBinding(var132);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var132);
            module0012.$g76$.bind((SubLObject)NIL, var132);
            module0012.$g77$.bind((SubLObject)T, var132);
            module0012.$g78$.bind(Time.get_universal_time(), var132);
            module0012.f478(var136);
            final SubLObject var112_132 = var135;
            if (NIL == module0065.f4772(var112_132, (SubLObject)$ic117$)) {
                final SubLObject var114_133 = var112_132;
                if (NIL == module0065.f4775(var114_133, (SubLObject)$ic117$)) {
                    final SubLObject var143 = module0065.f4740(var114_133);
                    final SubLObject var144 = (SubLObject)NIL;
                    SubLObject var145;
                    SubLObject var146;
                    SubLObject var147;
                    SubLObject var148;
                    for (var145 = Sequences.length(var143), var146 = (SubLObject)NIL, var146 = (SubLObject)ZERO_INTEGER; var146.numL(var145); var146 = Numbers.add(var146, (SubLObject)ONE_INTEGER)) {
                        var147 = ((NIL != var144) ? Numbers.subtract(var145, var146, (SubLObject)ONE_INTEGER) : var146);
                        var148 = Vectors.aref(var143, var147);
                        if (NIL == module0065.f4749(var148) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                            if (NIL != module0065.f4749(var148)) {
                                var148 = (SubLObject)$ic117$;
                            }
                            module0012.note_percent_progress(var138, var137);
                            var138 = Numbers.add(var138, (SubLObject)ONE_INTEGER);
                            if (NIL != f32072(var148, var131)) {
                                var134 = (SubLObject)ConsesLow.cons(var148, var134);
                            }
                        }
                    }
                }
                final SubLObject var122_134 = var112_132;
                if (NIL == module0065.f4777(var122_134) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                    final SubLObject var149 = module0065.f4738(var122_134);
                    SubLObject var150 = module0065.f4739(var122_134);
                    final SubLObject var151 = module0065.f4734(var122_134);
                    final SubLObject var152 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic117$)) ? NIL : $ic117$);
                    while (var150.numL(var151)) {
                        final SubLObject var153 = Hashtables.gethash_without_values(var150, var149, var152);
                        if (NIL == module0065.f4773((SubLObject)$ic117$) || NIL == module0065.f4749(var153)) {
                            module0012.note_percent_progress(var138, var137);
                            var138 = Numbers.add(var138, (SubLObject)ONE_INTEGER);
                            if (NIL != f32072(var153, var131)) {
                                var134 = (SubLObject)ConsesLow.cons(var153, var134);
                            }
                        }
                        var150 = Numbers.add(var150, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var142, var132);
            module0012.$g77$.rebind(var141, var132);
            module0012.$g76$.rebind(var140, var132);
            module0012.$g75$.rebind(var139, var132);
        }
        return Sequences.nreverse(var134);
    }
    
    public static SubLObject f32074(final SubLObject var131, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)$ic118$;
        }
        assert NIL != module0051.f3603(var131) : var131;
        final SubLObject var132 = var127;
        if (var132.eql((SubLObject)$ic118$)) {
            final SubLObject var133 = assertion_handles_oc.f11008();
            final SubLObject var134 = (SubLObject)ConsesLow.list(var131);
            return module0052.f3781(var133, (SubLObject)$ic137$, var134);
        }
        if (var132.eql((SubLObject)$ic120$)) {
            return module0052.f3709(f32073(var131));
        }
        return Errors.error((SubLObject)$ic121$, var127);
    }
    
    public static SubLObject f32075() {
        return Numbers.integerDivide(assertion_handles_oc.f11019(), Numbers.integerDivide(Numbers.subtract(module0051.f3643(module0051.f3605(), (SubLObject)UNPROVIDED), module0051.f3643($g3756$.getGlobalValue(), (SubLObject)UNPROVIDED)), module0051.$g995$.getGlobalValue()));
    }
    
    public static SubLObject f32076(final SubLObject var131) {
        return module0048.f3274(f32075());
    }
    
    public static SubLObject f32077(final SubLObject var131) {
        final SubLObject var132 = (SubLObject)((NIL != f32068()) ? $ic120$ : $ic118$);
        return f32074(var131, var132);
    }
    
    public static SubLObject f32078(final SubLObject var10, final SubLObject var135) {
        return Equality.equal(var135, module0178.f11297(var10));
    }
    
    public static SubLObject f32079(final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic151$, var135);
        SubLObject var138 = (SubLObject)NIL;
        final SubLObject var139 = assertion_handles_oc.f11010();
        final SubLObject var140 = var137;
        final SubLObject var141 = module0065.f4733(var139);
        SubLObject var142 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var140) : var140;
        final SubLObject var143 = module0012.$g75$.currentBinding(var136);
        final SubLObject var144 = module0012.$g76$.currentBinding(var136);
        final SubLObject var145 = module0012.$g77$.currentBinding(var136);
        final SubLObject var146 = module0012.$g78$.currentBinding(var136);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var136);
            module0012.$g76$.bind((SubLObject)NIL, var136);
            module0012.$g77$.bind((SubLObject)T, var136);
            module0012.$g78$.bind(Time.get_universal_time(), var136);
            module0012.f478(var140);
            final SubLObject var112_136 = var139;
            if (NIL == module0065.f4772(var112_136, (SubLObject)$ic117$)) {
                final SubLObject var114_137 = var112_136;
                if (NIL == module0065.f4775(var114_137, (SubLObject)$ic117$)) {
                    final SubLObject var147 = module0065.f4740(var114_137);
                    final SubLObject var148 = (SubLObject)NIL;
                    SubLObject var149;
                    SubLObject var150;
                    SubLObject var151;
                    SubLObject var152;
                    for (var149 = Sequences.length(var147), var150 = (SubLObject)NIL, var150 = (SubLObject)ZERO_INTEGER; var150.numL(var149); var150 = Numbers.add(var150, (SubLObject)ONE_INTEGER)) {
                        var151 = ((NIL != var148) ? Numbers.subtract(var149, var150, (SubLObject)ONE_INTEGER) : var150);
                        var152 = Vectors.aref(var147, var151);
                        if (NIL == module0065.f4749(var152) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                            if (NIL != module0065.f4749(var152)) {
                                var152 = (SubLObject)$ic117$;
                            }
                            module0012.note_percent_progress(var142, var141);
                            var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                            if (NIL != f32078(var152, var135)) {
                                var138 = (SubLObject)ConsesLow.cons(var152, var138);
                            }
                        }
                    }
                }
                final SubLObject var122_138 = var112_136;
                if (NIL == module0065.f4777(var122_138) || NIL == module0065.f4773((SubLObject)$ic117$)) {
                    final SubLObject var153 = module0065.f4738(var122_138);
                    SubLObject var154 = module0065.f4739(var122_138);
                    final SubLObject var155 = module0065.f4734(var122_138);
                    final SubLObject var156 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic117$)) ? NIL : $ic117$);
                    while (var154.numL(var155)) {
                        final SubLObject var157 = Hashtables.gethash_without_values(var154, var153, var156);
                        if (NIL == module0065.f4773((SubLObject)$ic117$) || NIL == module0065.f4749(var157)) {
                            module0012.note_percent_progress(var142, var141);
                            var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                            if (NIL != f32078(var157, var135)) {
                                var138 = (SubLObject)ConsesLow.cons(var157, var138);
                            }
                        }
                        var154 = Numbers.add(var154, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var146, var136);
            module0012.$g77$.rebind(var145, var136);
            module0012.$g76$.rebind(var144, var136);
            module0012.$g75$.rebind(var143, var136);
        }
        return Sequences.nreverse(var138);
    }
    
    public static SubLObject f32080(final SubLObject var135, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)$ic118$;
        }
        final SubLObject var136 = var127;
        if (var136.eql((SubLObject)$ic118$)) {
            final SubLObject var137 = assertion_handles_oc.f11008();
            final SubLObject var138 = (SubLObject)ConsesLow.list(var135);
            return module0052.f3781(var137, (SubLObject)$ic152$, var138);
        }
        if (var136.eql((SubLObject)$ic120$)) {
            return module0052.f3709(f32079(var135));
        }
        return Errors.error((SubLObject)$ic121$, var127);
    }
    
    public static SubLObject f32081() {
        return Numbers.integerDivide(assertion_handles_oc.f11019(), Numbers.max((SubLObject)ONE_INTEGER, module0549.f33895($ic159$)));
    }
    
    public static SubLObject f32082(final SubLObject var135) {
        return module0048.f3274(f32081());
    }
    
    public static SubLObject f32083(final SubLObject var135) {
        final SubLObject var136 = (SubLObject)((NIL != f32068()) ? $ic120$ : $ic118$);
        return f32080(var135, var136);
    }
    
    public static SubLObject f32084(final SubLObject var139) {
        return module0048.f3274(f32075());
    }
    
    public static SubLObject f32085(final SubLObject var140) {
        return (SubLObject)SEVENTEEN_INTEGER;
    }
    
    public static SubLObject f32086(final SubLObject var140) {
        final SubLObject var141 = Mapping.mapcar((SubLObject)$ic179$, module0232.f15308(var140));
        SubLObject var142 = (SubLObject)NIL;
        SubLObject var143 = (SubLObject)NIL;
        SubLObject var144 = (SubLObject)NIL;
        SubLObject var145 = (SubLObject)NIL;
        var143 = var141;
        var144 = var143.first();
        for (var145 = (SubLObject)ZERO_INTEGER; NIL != var143; var143 = var143.rest(), var144 = var143.first(), var145 = Numbers.add((SubLObject)ONE_INTEGER, var145)) {
            if (NIL != module0173.f10955(module0205.f13204(var144, (SubLObject)UNPROVIDED)) && NIL != f32087(var144)) {
                final SubLObject var146 = module0205.f13203(var144, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12067(var146)) {
                    SubLObject var143_147 = (SubLObject)NIL;
                    SubLObject var147 = (SubLObject)NIL;
                    SubLObject var148 = (SubLObject)NIL;
                    var143_147 = var141;
                    var147 = var143_147.first();
                    for (var148 = (SubLObject)ZERO_INTEGER; NIL != var143_147; var143_147 = var143_147.rest(), var147 = var143_147.first(), var148 = Numbers.add((SubLObject)ONE_INTEGER, var148)) {
                        if (NIL != f32088(var147) && module0205.f13203(var147, (SubLObject)UNPROVIDED).eql(var146)) {
                            SubLObject var149 = (SubLObject)ConsesLow.list(var145, var148);
                            final SubLObject var150 = module0205.f13204(var147, (SubLObject)UNPROVIDED);
                            if (NIL != module0193.f12067(var150) && !var150.eql(var146)) {
                                SubLObject var143_148 = (SubLObject)NIL;
                                SubLObject var151 = (SubLObject)NIL;
                                SubLObject var152 = (SubLObject)NIL;
                                var143_148 = var141;
                                var151 = var143_148.first();
                                for (var152 = (SubLObject)ZERO_INTEGER; NIL != var143_148; var143_148 = var143_148.rest(), var151 = var143_148.first(), var152 = Numbers.add((SubLObject)ONE_INTEGER, var152)) {
                                    if (NIL != f32089(var151) && ((module0205.f13204(var151, (SubLObject)UNPROVIDED).isInteger() && module0205.f13203(var151, (SubLObject)UNPROVIDED).eql(var150)) || (module0205.f13203(var151, (SubLObject)UNPROVIDED).isInteger() && module0205.f13204(var151, (SubLObject)UNPROVIDED).eql(var150)))) {
                                        var149 = (SubLObject)ConsesLow.cons(var152, var149);
                                    }
                                }
                                var142 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)NIL, Sort.sort(var149, Symbols.symbol_function((SubLObject)$ic180$), (SubLObject)UNPROVIDED)), var142);
                            }
                        }
                    }
                }
            }
        }
        return var142;
    }
    
    public static SubLObject f32087(final SubLObject var155) {
        return Equality.eql(module0205.f13132(var155), $ic113$);
    }
    
    public static SubLObject f32088(final SubLObject var155) {
        return Equality.eql(module0205.f13132(var155), $ic133$);
    }
    
    public static SubLObject f32089(final SubLObject var155) {
        return module0004.f104(module0205.f13132(var155), $g3761$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32090(final SubLObject var140) {
        final SubLObject var141 = Mapping.mapcar((SubLObject)$ic179$, module0232.f15308(var140));
        final SubLObject var142 = Sequences.find_if((SubLObject)$ic181$, var141, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var143 = Sequences.find_if((SubLObject)$ic182$, var141, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var144 = module0035.f2110((SubLObject)$ic183$, var141, (SubLObject)UNPROVIDED);
        final SubLObject var145 = module0205.f13203(var142, (SubLObject)UNPROVIDED);
        final SubLObject var146 = module0205.f13204(var142, (SubLObject)UNPROVIDED);
        final SubLObject var147 = module0205.f13204(var143, (SubLObject)UNPROVIDED);
        final SubLObject var148 = (SubLObject)ConsesLow.list(module0035.f2333((SubLObject)ConsesLow.list((SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)$ic186$, (SubLObject)$ic187$, (SubLObject)$ic188$), (SubLObject)ConsesLow.list(var146, var145, var147, var144, var141)));
        return module0052.f3785(assertion_handles_oc.f11008(), (SubLObject)$ic189$, var148);
    }
    
    public static SubLObject f32091(final SubLObject var10, final SubLObject var129) {
        final SubLThread var130 = SubLProcess.currentSubLThread();
        final SubLObject var131 = conses_high.getf(var129, (SubLObject)$ic184$, (SubLObject)UNPROVIDED);
        final SubLObject var132 = conses_high.getf(var129, (SubLObject)$ic185$, (SubLObject)UNPROVIDED);
        final SubLObject var133 = conses_high.getf(var129, (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
        final SubLObject var134 = conses_high.getf(var129, (SubLObject)$ic187$, (SubLObject)UNPROVIDED);
        final SubLObject var135 = conses_high.getf(var129, (SubLObject)$ic188$, (SubLObject)UNPROVIDED);
        final SubLObject var136 = module0178.f11295(var10);
        final SubLObject var137 = module0178.f11296(var10);
        if (var133.isInteger()) {
            if (var136.eql(var131) && var137.eql(var133)) {
                var130.resetMultipleValues();
                final SubLObject var138 = module0235.f15474(var132, var10, (SubLObject)T, (SubLObject)T);
                final SubLObject var139 = var130.secondMultipleValue();
                var130.resetMultipleValues();
                final SubLObject var140 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(module0500.f32237((SubLObject)ConsesLow.list($ic113$, var10, var136)), module0500.f32237((SubLObject)ConsesLow.list($ic133$, var10, var137)), var139));
                return Values.values((SubLObject)ConsesLow.list(var138, var140), (SubLObject)T);
            }
        }
        else if (var136.eql(var131)) {
            SubLObject var141 = (SubLObject)NIL;
            if (NIL == var141) {
                SubLObject var142 = var134;
                SubLObject var143 = (SubLObject)NIL;
                var143 = var142.first();
                while (NIL == var141 && NIL != var142) {
                    final SubLObject var144 = module0205.f13250(var137, var133, var143, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == module0229.f15243(var144)) {
                        var141 = (SubLObject)T;
                    }
                    var142 = var142.rest();
                    var143 = var142.first();
                }
            }
            if (NIL == var141) {
                var130.resetMultipleValues();
                final SubLObject var145 = module0235.f15474(var132, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var146 = var130.secondMultipleValue();
                var130.resetMultipleValues();
                var130.resetMultipleValues();
                final SubLObject var147 = module0235.f15474(var133, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var148 = var130.secondMultipleValue();
                var130.resetMultipleValues();
                final SubLObject var149 = ConsesLow.append(var145, var147);
                final SubLObject var150 = ConsesLow.append(var146, var148);
                SubLObject var151 = (SubLObject)NIL;
                SubLObject var152 = var135;
                SubLObject var153 = (SubLObject)NIL;
                var153 = var152.first();
                while (NIL != var152) {
                    if (module0205.f13132(var153).eql($ic133$)) {
                        var151 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(module0500.f32237(module0202.f12768($ic133$, var10, var137)), var150), var151);
                    }
                    else if (module0205.f13132(var153).eql($ic113$)) {
                        var151 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(module0500.f32237(module0202.f12768($ic113$, var10, var136)), var150), var151);
                    }
                    else {
                        var151 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(module0438.f30664(module0233.f15362(var149, var153), (SubLObject)UNPROVIDED), var150), var151);
                    }
                    var152 = var152.rest();
                    var153 = var152.first();
                }
                var151 = Sequences.nreverse(var151);
                return Values.values((SubLObject)ConsesLow.list(var149, var151), (SubLObject)T);
            }
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f32092() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32034", "S#35389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32035", "S#35390", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32036", "S#35391", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32037", "S#35392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32038", "S#35393", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32039", "S#35394", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32040", "S#35395", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32041", "S#35396", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32042", "S#35397", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32043", "S#35398", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32044", "S#35399", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32045", "S#35400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32046", "S#35401", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32047", "S#35402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32048", "S#35403", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32049", "S#35404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32050", "S#35405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32051", "S#35406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32052", "S#35407", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32053", "S#35408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32054", "S#35409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32055", "S#35410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32056", "S#35411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32057", "S#35412", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32058", "S#35413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32059", "S#35414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32060", "S#35415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32061", "S#35416", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32062", "S#35417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32063", "S#35418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32064", "S#35419", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32065", "S#35420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32066", "S#35421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32067", "S#35422", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32068", "S#35423", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32069", "S#35424", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32070", "S#35425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32071", "S#35426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32072", "S#35427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32073", "S#35428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32074", "S#35429", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32075", "S#35430", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32076", "S#35431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32077", "S#35432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32078", "S#35433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32079", "S#35434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32080", "S#35435", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32081", "S#35436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32082", "S#35437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32083", "S#35438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32084", "S#35439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32085", "S#35440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32086", "S#35441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32087", "S#35442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32088", "S#35443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32089", "S#35444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32090", "S#35445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0491", "f32091", "S#35446", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32093() {
        $g3734$ = SubLFiles.deflexical("S#35447", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g3734$.getGlobalValue() : $ic5$);
        $g3735$ = SubLFiles.defparameter("S#35448", module0018.$g659$.getGlobalValue());
        $g3736$ = SubLFiles.deflexical("S#35449", (NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g3736$.getGlobalValue() : $ic5$);
        $g3737$ = SubLFiles.defparameter("S#35450", module0018.$g659$.getGlobalValue());
        $g3738$ = SubLFiles.defparameter("S#35451", module0018.$g659$.getGlobalValue());
        $g3739$ = SubLFiles.deflexical("S#35452", (NIL != Symbols.boundp((SubLObject)$ic42$)) ? $g3739$.getGlobalValue() : $ic5$);
        $g3740$ = SubLFiles.defparameter("S#35453", module0018.$g659$.getGlobalValue());
        $g3741$ = SubLFiles.deflexical("S#35454", (SubLObject)$ic52$);
        $g3742$ = SubLFiles.deflexical("S#35455", (NIL != Symbols.boundp((SubLObject)$ic61$)) ? $g3742$.getGlobalValue() : $ic5$);
        $g3743$ = SubLFiles.defparameter("S#35456", module0018.$g659$.getGlobalValue());
        $g3744$ = SubLFiles.deflexical("S#35457", (SubLObject)$ic69$);
        $g3745$ = SubLFiles.deflexical("S#35458", (NIL != Symbols.boundp((SubLObject)$ic78$)) ? $g3745$.getGlobalValue() : $ic5$);
        $g3746$ = SubLFiles.defparameter("S#35459", module0018.$g659$.getGlobalValue());
        $g3747$ = SubLFiles.deflexical("S#35460", (SubLObject)$ic86$);
        $g3748$ = SubLFiles.deflexical("S#35461", (NIL != Symbols.boundp((SubLObject)$ic95$)) ? $g3748$.getGlobalValue() : $ic5$);
        $g3749$ = SubLFiles.defparameter("S#35462", module0018.$g659$.getGlobalValue());
        $g3750$ = SubLFiles.deflexical("S#35463", (NIL != Symbols.boundp((SubLObject)$ic106$)) ? $g3750$.getGlobalValue() : $ic5$);
        $g3751$ = SubLFiles.defparameter("S#35464", module0018.$g659$.getGlobalValue());
        $g3752$ = SubLFiles.deflexical("S#35465", (NIL != Symbols.boundp((SubLObject)$ic114$)) ? $g3752$.getGlobalValue() : $ic5$);
        $g3753$ = SubLFiles.defparameter("S#35466", module0018.$g659$.getGlobalValue());
        $g3754$ = SubLFiles.deflexical("S#35467", (NIL != Symbols.boundp((SubLObject)$ic134$)) ? $g3754$.getGlobalValue() : $ic5$);
        $g3755$ = SubLFiles.defparameter("S#35468", module0018.$g659$.getGlobalValue());
        $g3756$ = SubLFiles.deflexical("S#35469", (SubLObject)$ic144$);
        $g3757$ = SubLFiles.deflexical("S#35470", (NIL != Symbols.boundp((SubLObject)$ic150$)) ? $g3757$.getGlobalValue() : $ic5$);
        $g3758$ = SubLFiles.defparameter("S#35471", module0018.$g659$.getGlobalValue());
        $g3759$ = SubLFiles.deflexical("S#35472", (NIL != Symbols.boundp((SubLObject)$ic165$)) ? $g3759$.getGlobalValue() : $ic5$);
        $g3760$ = SubLFiles.defparameter("S#35473", module0018.$g659$.getGlobalValue());
        $g3761$ = SubLFiles.deflexical("S#35474", (SubLObject)$ic178$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32094() {
        module0340.f22938($ic1$);
        module0358.f23774((SubLObject)$ic2$, $ic1$);
        module0358.f23773((SubLObject)$ic3$, $ic1$);
        module0003.f57((SubLObject)$ic4$);
        module0132.f8593((SubLObject)$ic4$, $ic1$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0340.f22938($ic18$);
        module0358.f23773((SubLObject)$ic3$, $ic18$);
        module0003.f57((SubLObject)$ic19$);
        module0132.f8593((SubLObject)$ic19$, $ic18$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0340.f22938($ic41$);
        module0358.f23774((SubLObject)$ic2$, $ic41$);
        module0358.f23773((SubLObject)$ic3$, $ic41$);
        module0003.f57((SubLObject)$ic42$);
        module0132.f8593((SubLObject)$ic42$, $ic41$);
        module0340.f22941((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0340.f22941((SubLObject)$ic45$, (SubLObject)$ic46$);
        module0340.f22941((SubLObject)$ic47$, (SubLObject)$ic48$);
        module0340.f22941((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0340.f22938($ic51$);
        module0358.f23771((SubLObject)$ic2$, $ic51$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic3$, $ic51$);
        module0003.f57((SubLObject)$ic61$);
        module0132.f8593((SubLObject)$ic61$, $ic51$);
        module0340.f22941((SubLObject)$ic62$, (SubLObject)$ic63$);
        module0340.f22941((SubLObject)$ic64$, (SubLObject)$ic65$);
        module0340.f22941((SubLObject)$ic66$, (SubLObject)$ic67$);
        module0340.f22938($ic68$);
        module0358.f23771((SubLObject)$ic2$, $ic68$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic3$, $ic68$);
        module0003.f57((SubLObject)$ic78$);
        module0132.f8593((SubLObject)$ic78$, $ic68$);
        module0340.f22941((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0340.f22941((SubLObject)$ic81$, (SubLObject)$ic82$);
        module0340.f22941((SubLObject)$ic83$, (SubLObject)$ic84$);
        module0340.f22938($ic85$);
        module0358.f23771((SubLObject)$ic2$, $ic85$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic3$, $ic85$);
        module0003.f57((SubLObject)$ic95$);
        module0132.f8593((SubLObject)$ic95$, $ic85$);
        module0340.f22941((SubLObject)$ic96$, (SubLObject)$ic97$);
        module0340.f22941((SubLObject)$ic98$, (SubLObject)$ic99$);
        module0340.f22941((SubLObject)$ic100$, (SubLObject)$ic101$);
        module0340.f22938($ic102$);
        module0358.f23771((SubLObject)$ic2$, $ic102$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic3$, $ic102$);
        module0003.f57((SubLObject)$ic106$);
        module0132.f8593((SubLObject)$ic106$, $ic102$);
        module0340.f22941((SubLObject)$ic107$, (SubLObject)$ic108$);
        module0340.f22941((SubLObject)$ic109$, (SubLObject)$ic110$);
        module0340.f22941((SubLObject)$ic111$, (SubLObject)$ic112$);
        module0340.f22938($ic113$);
        module0358.f23774((SubLObject)$ic2$, $ic113$);
        module0358.f23773((SubLObject)$ic3$, $ic113$);
        module0003.f57((SubLObject)$ic114$);
        module0132.f8593((SubLObject)$ic114$, $ic113$);
        module0340.f22941((SubLObject)$ic122$, (SubLObject)$ic123$);
        module0340.f22941((SubLObject)$ic124$, (SubLObject)$ic125$);
        module0340.f22941((SubLObject)$ic126$, (SubLObject)$ic127$);
        module0340.f22941((SubLObject)$ic129$, (SubLObject)$ic130$);
        module0358.f23730((SubLObject)$ic131$, (SubLObject)$ic132$);
        module0340.f22938($ic133$);
        module0358.f23774((SubLObject)$ic2$, $ic133$);
        module0358.f23773((SubLObject)$ic3$, $ic133$);
        module0003.f57((SubLObject)$ic134$);
        module0132.f8593((SubLObject)$ic134$, $ic133$);
        module0340.f22941((SubLObject)$ic138$, (SubLObject)$ic139$);
        module0340.f22941((SubLObject)$ic140$, (SubLObject)$ic141$);
        module0340.f22941((SubLObject)$ic142$, (SubLObject)$ic143$);
        module0340.f22941((SubLObject)$ic145$, (SubLObject)$ic146$);
        module0358.f23730((SubLObject)$ic147$, (SubLObject)$ic148$);
        module0340.f22938($ic149$);
        module0358.f23774((SubLObject)$ic2$, $ic149$);
        module0358.f23773((SubLObject)$ic3$, $ic149$);
        module0003.f57((SubLObject)$ic150$);
        module0132.f8593((SubLObject)$ic150$, $ic149$);
        module0340.f22941((SubLObject)$ic153$, (SubLObject)$ic154$);
        module0340.f22941((SubLObject)$ic155$, (SubLObject)$ic156$);
        module0340.f22941((SubLObject)$ic157$, (SubLObject)$ic158$);
        module0340.f22941((SubLObject)$ic160$, (SubLObject)$ic161$);
        module0358.f23730((SubLObject)$ic162$, (SubLObject)$ic163$);
        module0340.f22938($ic164$);
        module0358.f23774((SubLObject)$ic2$, $ic164$);
        module0358.f23773((SubLObject)$ic3$, $ic164$);
        module0003.f57((SubLObject)$ic165$);
        module0132.f8593((SubLObject)$ic165$, $ic164$);
        module0340.f22941((SubLObject)$ic166$, (SubLObject)$ic167$);
        module0340.f22941((SubLObject)$ic168$, (SubLObject)$ic169$);
        module0340.f22941((SubLObject)$ic170$, (SubLObject)$ic171$);
        module0340.f22941((SubLObject)$ic172$, (SubLObject)$ic173$);
        module0358.f23730((SubLObject)$ic174$, (SubLObject)$ic175$);
        module0340.f22962((SubLObject)$ic176$, (SubLObject)$ic177$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32092();
    }
    
    public void initializeVariables() {
        f32093();
    }
    
    public void runTopLevelForms() {
        f32094();
    }
    
    static {
        me = (SubLFile)new module0491();
        $g3734$ = null;
        $g3735$ = null;
        $g3736$ = null;
        $g3737$ = null;
        $g3738$ = null;
        $g3739$ = null;
        $g3740$ = null;
        $g3741$ = null;
        $g3742$ = null;
        $g3743$ = null;
        $g3744$ = null;
        $g3745$ = null;
        $g3746$ = null;
        $g3747$ = null;
        $g3748$ = null;
        $g3749$ = null;
        $g3750$ = null;
        $g3751$ = null;
        $g3752$ = null;
        $g3753$ = null;
        $g3754$ = null;
        $g3755$ = null;
        $g3756$ = null;
        $g3757$ = null;
        $g3758$ = null;
        $g3759$ = null;
        $g3760$ = null;
        $g3761$ = null;
        $ic0$ = makeSymbol("ASSERTION-EL-IST-FORMULA");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("assertionMt"));
        $ic2$ = makeKeyword("POS");
        $ic3$ = makeKeyword("NEG");
        $ic4$ = makeSymbol("S#35447", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic6$ = makeKeyword("OPAQUE");
        $ic7$ = makeKeyword("TRUE-MON");
        $ic8$ = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35448", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#12750", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35390", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <hlmt-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$LogicalTruthMt)") });
        $ic10$ = makeKeyword("REMOVAL-ASSERTION-MT-PRUNE-POS");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("ASSERTION"))), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("CLOSED-HLMT"))))), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
        $ic12$ = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-NEG");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35448", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#12750", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35390", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionMt <assertion> <hlmt-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not \n      (#$assertionMt \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        #$BookkeepingMt))") });
        $ic14$ = makeKeyword("REMOVAL-ASSERTION-MT-UNIFY");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-MT"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35390", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $ic16$ = makeKeyword("REMOVAL-ASSERTION-MT-LOOKUP");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST"), makeSymbol("S#35391", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("GATHER-MT-INDEX"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionMt")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#35390", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <variable> <hlmt-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt ?ASSERTION #$LogicalTruthMt)") });
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("assertionSentence"));
        $ic19$ = makeSymbol("S#35449", "CYC");
        $ic20$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-POS");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35450", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#14349", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35392", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35394", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence \n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      (#$isa #$Thing #$Collection))") });
        $ic22$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-NEG");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35450", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#14349", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35392", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35394", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionSentence <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionSentence \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        (#$genls #$Collection #$Thing)))") });
        $ic24$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic25$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic26$ = makeSymbol("S#5859", "CYC");
        $ic27$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNIFY");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35395", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35394", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $ic29$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-LOOKUP");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35451", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#14349", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), (SubLObject)makeKeyword("INPUT"), constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#14349", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#35394", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$isa #$Thing #$Collection))") });
        $ic31$ = makeSymbol("S#12274", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic33$ = makeKeyword("GAF-ARG");
        $ic34$ = makeKeyword("GAF");
        $ic35$ = makeKeyword("PREDICATE-EXTENT");
        $ic36$ = makeKeyword("OVERLAP");
        $ic37$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-PRED-LOOKUP");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("S#35398", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35399", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> (<predicate> ...)) \n    using only GAF indexing of assertions indexed by <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$interArgIsa1-3 ?PRED ?COL1 ?COL2))") });
        $ic39$ = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-ARG-LOOKUP");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionSentence")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#33904", "CYC")))), makeKeyword("COST"), makeSymbol("S#35400", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35401", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> (<not fully-bound> ... <fort> ...)) \n     using only KB GAF indexing of assertions indexed by <fort>."), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (?PRED ?ARG1 ?ARG2 #$ShowerHead))") });
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("assertionID"));
        $ic42$ = makeSymbol("S#35452", "CYC");
        $ic43$ = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-POS");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35453", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1519", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35402", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35403", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      163059)") });
        $ic45$ = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-NEG");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35453", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1519", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35402", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35403", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionID <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionID \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        123456))") });
        $ic47$ = makeKeyword("REMOVAL-ASSERTION-ID-UNIFY");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-ID"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35403", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ID)") });
        $ic49$ = makeKeyword("REMOVAL-ASSERTION-ID-LOOKUP");
        $ic50$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1519", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FIND-ASSERTION-BY-ID"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionID")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#35403", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <not-fully-bound> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID ?ASSERTION 123456)") });
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("assertionDirection"));
        $ic52$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Forward-AssertionDirection")), constant_handles_oc.f8479((SubLObject)makeString("Backward-AssertionDirection")), constant_handles_oc.f8479((SubLObject)makeString("Code-AssertionDirection")));
        $ic53$ = makeKeyword("FORWARD");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("Forward-AssertionDirection"));
        $ic55$ = makeKeyword("BACKWARD");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("Backward-AssertionDirection"));
        $ic57$ = makeKeyword("CODE");
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("Code-AssertionDirection"));
        $ic59$ = makeString("~S was not a direction-p");
        $ic60$ = makeString("~S was not a cycl-direction-p");
        $ic61$ = makeSymbol("S#35455", "CYC");
        $ic62$ = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-POS");
        $ic63$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35404", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35456", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35475", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35475", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35475", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35406", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35475", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#12717", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#5432", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35407", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDirection <assertion> <constant>)\n    where <constant> is a CycL direction"), makeKeyword("EXAMPLE"), makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Forward-AssertionDirection)") });
        $ic64$ = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-NEG");
        $ic65$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35404", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35456", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35475", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35475", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35475", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35406", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35475", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#12717", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#5432", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35407", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDirection <assertion> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Backward-AssertionDirection))") });
        $ic66$ = makeKeyword("REMOVAL-ASSERTION-DIRECTION-UNIFY");
        $ic67$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-DIRECTION"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35405", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35407", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDirection <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?DIRECTION)") });
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("assertionStrength"));
        $ic69$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Default-JustificationStrength")), constant_handles_oc.f8479((SubLObject)makeString("Monotonic-JustificationStrength")));
        $ic70$ = makeKeyword("DEFAULT");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("Default-JustificationStrength"));
        $ic72$ = makeKeyword("MONOTONIC");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("Monotonic-JustificationStrength"));
        $ic74$ = makeString("~S was not a el-strength-p");
        $ic75$ = makeString("~S was not a cycl-strength-p");
        $ic76$ = makeSymbol("ASSERTION-P");
        $ic77$ = makeSymbol("EL-STRENGTH-P");
        $ic78$ = makeSymbol("S#35458", "CYC");
        $ic79$ = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-POS");
        $ic80$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35408", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35459", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35476", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35476", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35476", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35410", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35476", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#13918", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35411", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13918", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35412", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionStrength <assertion> <constant>)\n    where <constant> is a CycL justification strength"), makeKeyword("EXAMPLE"), makeString("(#$assertionStrength\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Monotonic-JustificationStrength)") });
        $ic81$ = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-NEG");
        $ic82$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35408", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35459", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35476", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35476", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35476", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35410", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35476", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#13918", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35411", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13918", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35412", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionStrength <assertion> <constant>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Default-JustificationStrength))") });
        $ic83$ = makeKeyword("REMOVAL-ASSERTION-STRENGTH-UNIFY");
        $ic84$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-STRENGTH"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35409", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35412", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionStength <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?STRENGTH)") });
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("assertionTruth"));
        $ic86$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth")), constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth")), constant_handles_oc.f8479((SubLObject)makeString("Unknown-JustificationTruth")));
        $ic87$ = makeKeyword("TRUE");
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic89$ = makeKeyword("FALSE");
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth"));
        $ic91$ = makeKeyword("UNKNOWN");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("Unknown-JustificationTruth"));
        $ic93$ = makeString("~S was not a truth-p");
        $ic94$ = makeString("~S was not a cycl-truth-p");
        $ic95$ = makeSymbol("S#35461", "CYC");
        $ic96$ = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-POS");
        $ic97$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35413", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35462", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35477", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35477", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35477", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35415", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35477", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-HAS-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12576", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35416", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionTruth <assertion> <constant>)\n    where <constant> is a CycL justification truth"), makeKeyword("EXAMPLE"), makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$True-JustificationTruth)") });
        $ic98$ = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-NEG");
        $ic99$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35413", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35462", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35477", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35477", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35477", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35415", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35477", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-HAS-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12576", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35416", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionTruth <assertion> <constant>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionTruth \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$False-JustificationTruth))") });
        $ic100$ = makeKeyword("REMOVAL-ASSERTION-TRUTH-UNIFY");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-TRUTH"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35414", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35416", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionTruth <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?TRUTH)") });
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute"));
        $ic103$ = makeSymbol("FORT-P");
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("AssertedBelief"));
        $ic105$ = constant_handles_oc.f8479((SubLObject)makeString("SupportedByMaterialImplication"));
        $ic106$ = makeSymbol("S#35463", "CYC");
        $ic107$ = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-POS");
        $ic108$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35464", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1504", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1504", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#1504", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35417", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1504", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35419", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$AssertedBelief)") });
        $ic109$ = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-NEG");
        $ic110$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35464", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1504", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1504", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#1504", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35417", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1504", "CYC"))))), makeKeyword("SUPPORT"), makeSymbol("S#35419", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionJustificationAttribute <assertion> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionJustificationAttribute \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        #$SupportedByMaterialImplication))") });
        $ic111$ = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-UNIFY");
        $ic112$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35418", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#35419", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ATT)") });
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy"));
        $ic114$ = makeSymbol("S#35465", "CYC");
        $ic115$ = makeString("Computing assertions asserted by ~S");
        $ic116$ = makeSymbol("STRINGP");
        $ic117$ = makeKeyword("SKIP");
        $ic118$ = makeKeyword("LATENCY");
        $ic119$ = makeSymbol("S#35420", "CYC");
        $ic120$ = makeKeyword("TOTAL-TIME");
        $ic121$ = makeString("~S was not one of :latency or :total-time");
        $ic122$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-POS");
        $ic123$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35466", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#710", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35420", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35465", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Pace)") });
        $ic124$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-NEG");
        $ic125$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35466", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#710", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35420", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35465", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertBy <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Lenat))") });
        $ic126$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-UNIFY");
        $ic127$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTED-BY"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35465", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHO)") });
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist"));
        $ic129$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP");
        $ic130$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35425", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35426", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#710", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35465", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy ?ASSERTION #$Lenat)") });
        $ic131$ = makeKeyword("DISPREFER-ASSERTION-ASSERT-BY-LOOKUP");
        $ic132$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime"));
        $ic134$ = makeSymbol("S#35467", "CYC");
        $ic135$ = makeSymbol("S#4999", "CYC");
        $ic136$ = makeString("Computing assertions asserted on ~A");
        $ic137$ = makeSymbol("S#35427", "CYC");
        $ic138$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-POS");
        $ic139$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35468", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35478", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35478", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35427", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35467", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      20020411)") });
        $ic140$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-NEG");
        $ic141$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35468", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35478", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35478", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35427", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35467", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertTime <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      19950524))") });
        $ic142$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-UNIFY");
        $ic143$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTED-WHEN"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35467", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)") });
        $ic144$ = makeInteger(19950522);
        $ic145$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP");
        $ic146$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35478", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35431", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35478", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35432", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35478", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35467", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <variable> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime ?ASSERTION 19950524)") });
        $ic147$ = makeKeyword("DISPREFER-ASSERTION-ASSERT-TIME-LOOKUP");
        $ic148$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose"));
        $ic150$ = makeSymbol("S#35470", "CYC");
        $ic151$ = makeString("Computing assertions asserted for ~S");
        $ic152$ = makeSymbol("S#35433", "CYC");
        $ic153$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-POS");
        $ic154$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35471", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25812", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#25812", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35470", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$GeneralCycKE)") });
        $ic155$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-NEG");
        $ic156$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35471", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25812", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#25812", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35470", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertPurpose <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$HPKBProject))") });
        $ic157$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-UNIFY");
        $ic158$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTED-WHY"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35470", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHY)") });
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("Cyc-BasedProject"));
        $ic160$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $ic161$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25812", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35437", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25812", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35438", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25812", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35470", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose ?ASSERTION #$HPKBProject)\n    (#$thereExists ?ASSERTION\n      (#$assertionAssertPurpose ?ASSERTION #$GeneralCycKE))") });
        $ic162$ = makeKeyword("DISPREFER-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $ic163$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertPurpose")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic164$ = constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate"));
        $ic165$ = makeSymbol("S#35472", "CYC");
        $ic166$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-POS");
        $ic167$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35473", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35479", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#14102", "CYC"))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35479", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#14140", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35472", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <cycl-date>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 11 (#$MonthFn #$April (#$YearFn 2002))))") });
        $ic168$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-NEG");
        $ic169$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35473", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35479", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#14102", "CYC"))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#35479", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#14140", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35472", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertDate <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995)))))") });
        $ic170$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-UNIFY");
        $ic171$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#14139", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35472", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)\n    (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn ?DATE ?MONTH))") });
        $ic172$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP");
        $ic173$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35479", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35439", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35479", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC"))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#14102", "CYC")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#14141", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35479", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35472", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <variable> <cycl-date>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate ?ASSERTION (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995))))") });
        $ic174$ = makeKeyword("DISPREFER-ASSERTION-ASSERT-DATE-LOOKUP");
        $ic175$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic176$ = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-AND-TIME-CONJUNCTIVE");
        $ic177$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionAssertBy")), constant_handles_oc.f8479((SubLObject)makeString("assertionAssertTime"))), makeKeyword("APPLICABILITY"), makeSymbol("S#35441", "CYC"), makeKeyword("COST"), makeSymbol("S#35440", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35445", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <fully-bound>))\n    or\n    (#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <not-fully-bound 0>)\n           [(<number comparison pred> <not-fully-bound 0> <fully-bound>)]..."), makeKeyword("EXAMPLE"), makeString("(#$and (#$assertionAssertBy ?ASSERTION #$Guest)\n           (#$assertionAssertTime ?ASSERTION ?TIME)\n           (#$greaterThanOrEqualTo ?TIME 19000101)\n           (#$lessThan ?TIME 20000101)") });
        $ic178$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lessThanOrEqualTo")), constant_handles_oc.f8479((SubLObject)makeString("lessThan")), constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), constant_handles_oc.f8479((SubLObject)makeString("greaterThan")));
        $ic179$ = makeSymbol("S#16021", "CYC");
        $ic180$ = makeSymbol("<");
        $ic181$ = makeSymbol("S#35442", "CYC");
        $ic182$ = makeSymbol("S#35443", "CYC");
        $ic183$ = makeSymbol("S#35444", "CYC");
        $ic184$ = makeKeyword("CYCLIST");
        $ic185$ = makeKeyword("ASSERTION-VAR");
        $ic186$ = makeKeyword("ASSERT-TIME-ARG2");
        $ic187$ = makeKeyword("TIME-COMPARISON-ASENTS");
        $ic188$ = makeKeyword("ASENTS");
        $ic189$ = makeSymbol("S#35446", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1711 ms
	
	Decompiled with Procyon 0.5.32.
*/