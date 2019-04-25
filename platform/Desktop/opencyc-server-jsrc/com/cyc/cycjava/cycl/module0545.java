package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0545 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0545";
    public static final String myFingerPrint = "e3c54f72709dab935a69074b21f1fdb11ece8e0e15423074327848c50c16cf8b";
    private static SubLSymbol $g3964$;
    private static SubLSymbol $g3965$;
    private static SubLSymbol $g3966$;
    private static SubLSymbol $g3967$;
    private static SubLSymbol $g3968$;
    private static SubLSymbol $g3969$;
    private static SubLSymbol $g3970$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    
    public static SubLObject f33726(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = $g3965$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = conses_high.second(conses_high.assoc(var1, $g3966$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (NIL == var3) {
            Errors.error((SubLObject)$ic1$, var1);
        }
        return var3;
    }
    
    public static SubLObject f33727(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f33726($g3965$.getDynamicValue(var5));
        if (NIL != var6) {
            return Functions.funcall(var6, var4);
        }
        Errors.error((SubLObject)$ic2$, $g3965$.getDynamicValue(var5));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33728(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        f33729(var5, var6);
        f33730(var5, var6, var7, var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33731(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        f33730(var5, var6, var7, var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33732(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        f33729(var5, var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33733(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        final SubLObject var9 = (SubLObject)((NIL != module0178.f11341(var4)) ? $ic3$ : $ic4$);
        f33734((SubLObject)$ic5$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f33734((SubLObject)$ic6$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f33734((SubLObject)$ic7$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f33734((SubLObject)$ic8$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f33734((SubLObject)$ic9$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33735(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = conses_high.second(conses_high.assoc(var11, $g3968$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (NIL == var13) {
            Errors.error((SubLObject)$ic11$, var11);
        }
        return var13;
    }
    
    public static SubLObject f33736(final SubLObject var4) {
        if (NIL != module0178.f11375(var4)) {
            if (NIL != module0178.f11341(var4)) {
                f33733(var4);
            }
            else {
                f33727(var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33737(final SubLObject var4) {
        if (NIL != module0178.f11375(var4) && NIL == module0178.f11341(var4)) {
            f33727(var4);
        }
        else {
            f33733(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33738(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_17 = var16;
            f33739(var16_17);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = $g3965$.currentBinding(var14);
            final SubLObject var19 = $g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                $g3965$.bind(var1, var14);
                $g3964$.bind(var16_17, var14);
                module0147.$g2094$.bind((SubLObject)$ic16$, var14);
                module0147.$g2095$.bind($ic17$, var14);
                module0219.f14491(var17, var12);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                $g3964$.rebind(var19, var14);
                $g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33740(final SubLObject var12, final SubLObject var23, final SubLObject var24, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        try {
            var27 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var27.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_26 = var27;
            f33739(var16_26);
            final SubLObject var28 = f33735(var11);
            final SubLObject var29 = $g3965$.currentBinding(var25);
            final SubLObject var30 = $g3964$.currentBinding(var25);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var25);
            try {
                $g3965$.bind(var1, var25);
                $g3964$.bind(var16_26, var25);
                module0147.$g2094$.bind((SubLObject)$ic16$, var25);
                module0147.$g2095$.bind($ic17$, var25);
                module0219.f14477(var28, var12, var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var32, var25);
                module0147.$g2094$.rebind(var31, var25);
                $g3964$.rebind(var30, var25);
                $g3965$.rebind(var29, var25);
            }
            var26 = (SubLObject)T;
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f33741(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_28 = var16;
            f33739(var16_28);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = $g3965$.currentBinding(var14);
            final SubLObject var19 = $g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                $g3965$.bind(var1, var14);
                $g3964$.bind(var16_28, var14);
                module0147.$g2094$.bind((SubLObject)$ic16$, var14);
                module0147.$g2095$.bind($ic17$, var14);
                module0219.f14502(var17, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                $g3964$.rebind(var19, var14);
                $g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33742(final SubLObject var24, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        try {
            var27 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var27.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_30 = var27;
            f33739(var16_30);
            final SubLObject var28 = f33735(var11);
            final SubLObject var29 = $g3965$.currentBinding(var25);
            final SubLObject var30 = $g3964$.currentBinding(var25);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var25);
            try {
                $g3965$.bind(var1, var25);
                $g3964$.bind(var16_30, var25);
                module0147.$g2094$.bind((SubLObject)$ic16$, var25);
                module0147.$g2095$.bind($ic17$, var25);
                module0219.f14481(var28, var24, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0219.f14481(var28, var24, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var32, var25);
                module0147.$g2094$.rebind(var31, var25);
                $g3964$.rebind(var30, var25);
                $g3965$.rebind(var29, var25);
            }
            var26 = (SubLObject)T;
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f33743(final SubLObject var31, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var34.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_33 = var34;
            f33739(var16_33);
            final SubLObject var35 = f33735(var11);
            final SubLObject var36 = $g3965$.currentBinding(var32);
            final SubLObject var37 = $g3964$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var39 = module0147.$g2095$.currentBinding(var32);
            try {
                $g3965$.bind(var1, var32);
                $g3964$.bind(var16_33, var32);
                module0147.$g2094$.bind((SubLObject)$ic16$, var32);
                module0147.$g2095$.bind($ic17$, var32);
                module0219.f14483(var35, var31, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0219.f14483(var35, var31, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var39, var32);
                module0147.$g2094$.rebind(var38, var32);
                $g3964$.rebind(var37, var32);
                $g3965$.rebind(var36, var32);
            }
            var33 = (SubLObject)T;
        }
        finally {
            final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                if (var34.isStream()) {
                    streams_high.close(var34, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var40, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f33744(final SubLObject var31, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var34.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_35 = var34;
            f33739(var16_35);
            final SubLObject var35 = f33735(var11);
            final SubLObject var36 = $g3965$.currentBinding(var32);
            final SubLObject var37 = $g3964$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var39 = module0147.$g2095$.currentBinding(var32);
            try {
                $g3965$.bind(var1, var32);
                $g3964$.bind(var16_35, var32);
                module0147.$g2094$.bind((SubLObject)$ic16$, var32);
                module0147.$g2095$.bind($ic17$, var32);
                module0219.f14485(var35, var31, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0219.f14485(var35, var31, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var39, var32);
                module0147.$g2094$.rebind(var38, var32);
                $g3964$.rebind(var37, var32);
                $g3965$.rebind(var36, var32);
            }
            var33 = (SubLObject)T;
        }
        finally {
            final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                if (var34.isStream()) {
                    streams_high.close(var34, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var40, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f33745(final SubLObject var36, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        try {
            var39 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var39.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_38 = var39;
            f33739(var16_38);
            final SubLObject var40 = f33735(var11);
            final SubLObject var41 = $g3965$.currentBinding(var37);
            final SubLObject var42 = $g3964$.currentBinding(var37);
            final SubLObject var43 = module0147.$g2094$.currentBinding(var37);
            final SubLObject var44 = module0147.$g2095$.currentBinding(var37);
            try {
                $g3965$.bind(var1, var37);
                $g3964$.bind(var16_38, var37);
                module0147.$g2094$.bind((SubLObject)$ic16$, var37);
                module0147.$g2095$.bind($ic17$, var37);
                module0219.f14486(var40, var36, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0219.f14486(var40, var36, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var44, var37);
                module0147.$g2094$.rebind(var43, var37);
                $g3964$.rebind(var42, var37);
                $g3965$.rebind(var41, var37);
            }
            var38 = (SubLObject)T;
        }
        finally {
            final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var37);
                if (var39.isStream()) {
                    streams_high.close(var39, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var45, var37);
            }
        }
        return var38;
    }
    
    public static SubLObject f33746(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic12$;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)$ic15$, var13);
            }
            final SubLObject var16_40 = var16;
            f33739(var16_40);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = $g3965$.currentBinding(var14);
            final SubLObject var19 = $g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                $g3965$.bind(var1, var14);
                $g3964$.bind(var16_40, var14);
                module0147.$g2094$.bind((SubLObject)$ic16$, var14);
                module0147.$g2095$.bind($ic17$, var14);
                module0219.f14498(var17, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                $g3964$.rebind(var19, var14);
                $g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33747(final SubLObject var16) {
        PrintLow.format(var16, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33739(final SubLObject var16) {
        f33747(var16);
        PrintLow.format(var16, (SubLObject)$ic21$);
        PrintLow.format(var16, (SubLObject)$ic22$, module0051.f3552((SubLObject)UNPROVIDED));
        PrintLow.format(var16, (SubLObject)$ic23$, module0011.f351(), module0018.f971());
        PrintLow.format(var16, (SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33734(final SubLObject var41, SubLObject var42, SubLObject var43, SubLObject var44, SubLObject var45) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        return PrintLow.format($g3964$.getDynamicValue(var46), var41, new SubLObject[] { var42, var43, var44, var45 });
    }
    
    public static SubLObject f33730(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        f33734((SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0194.f12114(var6, $g3964$.getDynamicValue(var10), (SubLObject)ONE_INTEGER);
        f33734((SubLObject)$ic26$, var7, var8, var9, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33729(final SubLObject var6, final SubLObject var7) {
        f33734((SubLObject)$ic27$, var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33748(final SubLObject var46, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var46) : var46;
        assert NIL != Types.integerp(var47) : var47;
        var48.resetMultipleValues();
        final SubLObject var49 = f33749(var46, var47);
        final SubLObject var50 = var48.secondMultipleValue();
        final SubLObject var51 = var48.thirdMultipleValue();
        var48.resetMultipleValues();
        if (var49 == $ic30$) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic31$, var46);
            return (SubLObject)NIL;
        }
        if (var49 == $ic32$) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic33$);
            PrintLow.format((SubLObject)T, (SubLObject)$ic34$, var47);
            PrintLow.format((SubLObject)T, (SubLObject)$ic35$, Numbers.subtract(var50, var47));
            return (SubLObject)T;
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic36$);
        PrintLow.format((SubLObject)T, (SubLObject)$ic34$, var47);
        PrintLow.format((SubLObject)T, (SubLObject)$ic35$, Numbers.subtract(var50, var47));
        PrintLow.format((SubLObject)T, (SubLObject)$ic37$, var51);
        PrintLow.format((SubLObject)T, (SubLObject)$ic38$, var49);
        PrintLow.format((SubLObject)T, (SubLObject)$ic39$, var50);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33749(final SubLObject var46, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(var46)) {
            SubLObject var49 = (SubLObject)ZERO_INTEGER;
            SubLObject var50 = (SubLObject)ZERO_INTEGER;
            SubLObject var51 = (SubLObject)$ic32$;
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = (SubLObject)NIL;
            try {
                var53 = compatibility.open_text(var46, (SubLObject)$ic40$);
                if (!var53.isStream()) {
                    Errors.error((SubLObject)$ic15$, var46);
                }
                final SubLObject var16_56 = var53;
                try {
                    var48.throwStack.push($ic41$);
                    final SubLObject var54 = streams_high.file_length(var16_56);
                    final SubLObject var55 = module0012.$g75$.currentBinding(var48);
                    final SubLObject var56 = module0012.$g76$.currentBinding(var48);
                    final SubLObject var57 = module0012.$g77$.currentBinding(var48);
                    final SubLObject var58 = module0012.$g78$.currentBinding(var48);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var48);
                        module0012.$g76$.bind((SubLObject)NIL, var48);
                        module0012.$g77$.bind((SubLObject)T, var48);
                        module0012.$g78$.bind(Time.get_universal_time(), var48);
                        module0012.f478((SubLObject)$ic42$);
                        SubLObject var59;
                        SubLObject var60;
                        for (var59 = (SubLObject)NIL, var59 = f33750(var16_56); var59 != $ic43$ && var59 != $ic44$; var59 = f33750(var16_56)) {
                            if (var47.numG((SubLObject)ZERO_INTEGER)) {
                                var47 = Numbers.subtract(var47, (SubLObject)ONE_INTEGER);
                            }
                            else {
                                var60 = f33751(var59);
                                if (NIL != var60) {
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic45$, var59, var50);
                                    Dynamic.sublisp_throw((SubLObject)$ic41$, var60);
                                }
                            }
                            var50 = compatibility.get_file_position(var16_56);
                            module0012.note_percent_progress(var50, var54);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            var52 = var59;
                        }
                        if (var59 == $ic43$) {
                            Dynamic.sublisp_throw((SubLObject)$ic41$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic46$, var52, var50));
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var58, var48);
                        module0012.$g77$.rebind(var57, var48);
                        module0012.$g76$.rebind(var56, var48);
                        module0012.$g75$.rebind(var55, var48);
                    }
                }
                catch (Throwable var61) {
                    var51 = Errors.handleThrowable(var61, (SubLObject)$ic41$);
                }
                finally {
                    var48.throwStack.pop();
                }
            }
            finally {
                final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var48);
                    if (var53.isStream()) {
                        streams_high.close(var53, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var62, var48);
                }
            }
            return Values.values(var51, var49, var50);
        }
        return Values.values((SubLObject)$ic30$, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f33750(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var17.resetMultipleValues();
        final SubLObject var18 = reader.read_ignoring_errors(var16, (SubLObject)NIL, (SubLObject)$ic44$);
        final SubLObject var19 = var17.secondMultipleValue();
        var17.resetMultipleValues();
        return (NIL != var18) ? var18 : var19;
    }
    
    public static SubLObject f33751(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)NIL;
        try {
            var59.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var61 = Errors.$error_handler$.currentBinding(var59);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic47$, var59);
                try {
                    final SubLObject var19_63 = Errors.$continue_cerrorP$.currentBinding(var59);
                    final SubLObject var62 = module0111.$g1406$.currentBinding(var59);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)T, var59);
                        module0111.$g1406$.bind((SubLObject)NIL, var59);
                        module0538.f33316();
                        module0112.f7688(var58);
                    }
                    finally {
                        module0111.$g1406$.rebind(var62, var59);
                        Errors.$continue_cerrorP$.rebind(var19_63, var59);
                    }
                    if (NIL == var60 && NIL != module0538.f33324()) {
                        SubLObject var64;
                        final SubLObject var63 = var64 = module0538.f33325();
                        SubLObject var65 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic48$);
                        var65 = var64.first();
                        var64 = var64.rest();
                        final SubLObject var66 = (SubLObject)(var64.isCons() ? var64.first() : NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var64, var63, (SubLObject)$ic48$);
                        final SubLObject var67;
                        var64 = (var67 = var64.rest());
                        Functions.apply(Symbols.symbol_function((SubLObject)$ic49$), Sequences.cconcatenate((SubLObject)$ic50$, (NIL != var66) ? var66 : PrintLow.format((SubLObject)NIL, (SubLObject)$ic51$, var65)), new SubLObject[] { var58, var67 });
                    }
                }
                catch (Throwable var68) {
                    Errors.handleThrowable(var68, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var61, var59);
            }
        }
        catch (Throwable var69) {
            var60 = Errors.handleThrowable(var69, module0003.$g3$.getGlobalValue());
        }
        finally {
            var59.throwStack.pop();
        }
        return var60;
    }
    
    public static SubLObject f33752(final SubLObject var68, final SubLObject var46) {
        assert NIL != constant_handles_oc.f8449(var68) : var68;
        assert NIL != Types.stringp(var46) : var46;
        SubLObject var69 = (SubLObject)NIL;
        try {
            var69 = compatibility.open_text(var46, (SubLObject)$ic14$);
            if (!var69.isStream()) {
                Errors.error((SubLObject)$ic15$, var46);
            }
            final SubLObject var16_70 = var69;
            f33753(var68, var16_70);
        }
        finally {
            final SubLObject var70 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var69.isStream()) {
                    streams_high.close(var69, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var70);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33753(final SubLObject var68, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        f33739(var16);
        PrintLow.format(var16, (SubLObject)$ic53$, var68);
        PrintLow.format(var16, (SubLObject)$ic54$, constants_high_oc.f10743(var68), constants_high_oc.f10757(var68));
        final SubLObject var70 = $g3969$.currentBinding(var69);
        final SubLObject var71 = $g3970$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var73 = module0147.$g2095$.currentBinding(var69);
        try {
            $g3969$.bind(Hashtables.make_hash_table(module0217.f14357(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var69);
            $g3970$.bind(var16, var69);
            module0147.$g2094$.bind((SubLObject)$ic16$, var69);
            module0147.$g2095$.bind($ic17$, var69);
            SubLObject var74 = (SubLObject)$ic56$;
            SubLObject var75 = (SubLObject)NIL;
            var75 = var74.first();
            while (NIL != var74) {
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic55$), var68, (SubLObject)ONE_INTEGER, var75, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var74 = var74.rest();
                var75 = var74.first();
            }
            module0219.f14477(Symbols.symbol_function((SubLObject)$ic55$), var68, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0219.f14491(Symbols.symbol_function((SubLObject)$ic55$), var68);
        }
        finally {
            module0147.$g2095$.rebind(var73, var69);
            module0147.$g2094$.rebind(var72, var69);
            $g3970$.rebind(var71, var69);
            $g3969$.rebind(var70, var69);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33754(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (NIL == Hashtables.gethash(var72, $g3969$.getDynamicValue(var73), (SubLObject)UNPROVIDED)) {
            Hashtables.sethash(var72, $g3969$.getDynamicValue(var73), (SubLObject)T);
            if (NIL != module0178.f11375(var72)) {
                final SubLObject var74 = $g3970$.getDynamicValue(var73);
                final SubLObject var75 = module0289.f19396(var72);
                final SubLObject var76 = module0173.f10958(module0178.f11287(var72));
                final SubLObject var77 = module0178.f11291(var72);
                final SubLObject var78 = module0178.f11293(var72);
                PrintLow.format(var74, (SubLObject)$ic57$);
                module0194.f12114(var75, var74, (SubLObject)ONE_INTEGER);
                PrintLow.format(var74, (SubLObject)$ic58$, var76);
                PrintLow.format(var74, (SubLObject)$ic59$, var78, var77);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33755() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33726", "S#37121", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33727", "S#37122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33728", "S#37123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33731", "S#37124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33732", "S#37125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33733", "S#37126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33735", "S#37127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33736", "S#37128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33737", "S#37129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33738", "S#37130", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33740", "S#37131", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33741", "S#37132", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33742", "S#37133", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33743", "S#37134", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33744", "S#37135", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33745", "S#37136", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33746", "S#37137", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33747", "S#37138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33739", "S#37139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33734", "S#37140", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33730", "S#37141", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33729", "S#37142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33748", "LOAD-API", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33749", "S#37143", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33750", "S#37144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33751", "S#37145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33752", "S#37146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33753", "S#37147", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0545", "f33754", "S#37148", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33756() {
        $g3964$ = SubLFiles.defparameter("S#37149", (SubLObject)T);
        $g3965$ = SubLFiles.defparameter("S#37150", (SubLObject)NIL);
        $g3966$ = SubLFiles.defparameter("S#37151", (SubLObject)$ic0$);
        $g3967$ = SubLFiles.defparameter("S#37152", (SubLObject)NIL);
        $g3968$ = SubLFiles.defparameter("S#37153", (SubLObject)$ic10$);
        $g3969$ = SubLFiles.defparameter("S#37154", (SubLObject)NIL);
        $g3970$ = SubLFiles.defparameter("S#37155", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33757() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33755();
    }
    
    public void initializeVariables() {
        f33756();
    }
    
    public void runTopLevelForms() {
        f33757();
    }
    
    static {
        me = (SubLFile)new module0545();
        $g3964$ = null;
        $g3965$ = null;
        $g3966$ = null;
        $g3967$ = null;
        $g3968$ = null;
        $g3969$ = null;
        $g3970$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("UNASSERT-ASSERT"), (SubLObject)makeSymbol("S#37123", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERT"), (SubLObject)makeSymbol("S#37124", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("UNASSERT"), (SubLObject)makeSymbol("S#37125", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("COMMENTED"), (SubLObject)makeSymbol("S#37126", "CYC")));
        $ic1$ = makeString("~S was not a valid batch-ke output-method");
        $ic2$ = makeString("~a is not a known batch ke output method");
        $ic3$ = makeString("CODE Assertion");
        $ic4$ = makeString("REMOTE Assertion");
        $ic5$ = makeString("~%~%;; ~A");
        $ic6$ = makeString("~%;; Formula:  ~S");
        $ic7$ = makeString("~%;; Mt:       ~S");
        $ic8$ = makeString("~%;; Strength: ~S");
        $ic9$ = makeString("~%;; Dir:      ~S");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("LOCAL"), (SubLObject)makeSymbol("S#37128", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("LOCAL-AND-COMMENTED-REMOTE"), (SubLObject)makeSymbol("S#37129", "CYC")));
        $ic11$ = makeString("~S was not a valid batch-ke inclusion-level");
        $ic12$ = makeKeyword("LOCAL");
        $ic13$ = makeKeyword("UNASSERT-ASSERT");
        $ic14$ = makeKeyword("OUTPUT");
        $ic15$ = makeString("Unable to open ~S");
        $ic16$ = makeSymbol("S#12274", "CYC");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic18$ = makeKeyword("POS");
        $ic19$ = makeKeyword("NEG");
        $ic20$ = makeString(";;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");
        $ic21$ = makeString("~%;;");
        $ic22$ = makeString("~%;; Created on ~A");
        $ic23$ = makeString("~%;; CycL ~A  KB ~S");
        $ic24$ = makeString("~%~%");
        $ic25$ = makeString("~%(ke-assert '");
        $ic26$ = makeString("~% ~s ~s ~s)");
        $ic27$ = makeString("~%~%(ke-unassert '~s ~s)");
        $ic28$ = makeSymbol("STRINGP");
        $ic29$ = makeSymbol("INTEGERP");
        $ic30$ = makeKeyword("FILE-NOT-FOUND");
        $ic31$ = makeString("~%File ~A was not found, or is inaccessible");
        $ic32$ = makeKeyword("SUCCESS");
        $ic33$ = makeString("~%File completely processed");
        $ic34$ = makeString("~%~S initial operations skipped");
        $ic35$ = makeString("~%~S operations successfully processed");
        $ic36$ = makeString("~%File incompletely processed:");
        $ic37$ = makeString("~%Error after file position ~S:");
        $ic38$ = makeString("~%~%~A");
        $ic39$ = makeString("~%~%After fixing the file, use a skip value of ~S to continue.");
        $ic40$ = makeKeyword("INPUT");
        $ic41$ = makeKeyword("ABORT-KE-LOAD");
        $ic42$ = makeString("Loading KE forms");
        $ic43$ = makeKeyword("ERROR");
        $ic44$ = makeKeyword("EOF");
        $ic45$ = makeString("Eval error in form ~S starting at position ~S");
        $ic46$ = makeString("Read error in form after ~S starting at position ~S");
        $ic47$ = makeSymbol("S#38", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic49$ = makeSymbol("ERROR");
        $ic50$ = makeString("Last operation: ~S~%");
        $ic51$ = makeString("FI error: ~A");
        $ic52$ = makeSymbol("CONSTANT-P");
        $ic53$ = makeString(";; Archive of ~S");
        $ic54$ = makeString("~%~%(fi-find-or-create ~S ~S)");
        $ic55$ = makeSymbol("S#37148", "CYC");
        $ic56$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")));
        $ic57$ = makeString("~%~%(ke-assert '");
        $ic58$ = makeString("~% '~S");
        $ic59$ = makeString("~% ~S ~S)");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 309 ms
	
	Decompiled with Procyon 0.5.32.
*/