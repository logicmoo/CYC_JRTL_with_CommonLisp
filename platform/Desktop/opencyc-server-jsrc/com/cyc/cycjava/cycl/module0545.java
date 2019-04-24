package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var1 == module0545.UNPROVIDED) {
            var1 = module0545.$g3965$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = conses_high.second(conses_high.assoc(var1, module0545.$g3966$.getDynamicValue(var2), (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED));
        if (module0545.NIL == var3) {
            Errors.error((SubLObject)module0545.$ic1$, var1);
        }
        return var3;
    }
    
    public static SubLObject f33727(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f33726(module0545.$g3965$.getDynamicValue(var5));
        if (module0545.NIL != var6) {
            return Functions.funcall(var6, var4);
        }
        Errors.error((SubLObject)module0545.$ic2$, module0545.$g3965$.getDynamicValue(var5));
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33728(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)module0545.UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        f33729(var5, var6);
        f33730(var5, var6, var7, var8);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33731(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)module0545.UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        f33730(var5, var6, var7, var8);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33732(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)module0545.UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        f33729(var5, var6);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33733(final SubLObject var4) {
        final SubLObject var5 = module0538.f33478(var4, (SubLObject)module0545.UNPROVIDED);
        final SubLObject var6 = module0178.f11287(var4);
        final SubLObject var7 = module0178.f11293(var4);
        final SubLObject var8 = module0178.f11291(var4);
        final SubLObject var9 = (SubLObject)((module0545.NIL != module0178.f11341(var4)) ? module0545.$ic3$ : module0545.$ic4$);
        f33734((SubLObject)module0545.$ic5$, var9, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        f33734((SubLObject)module0545.$ic6$, var5, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        f33734((SubLObject)module0545.$ic7$, var6, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        f33734((SubLObject)module0545.$ic8$, var7, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        f33734((SubLObject)module0545.$ic9$, var8, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33735(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = conses_high.second(conses_high.assoc(var11, module0545.$g3968$.getDynamicValue(var12), (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED));
        if (module0545.NIL == var13) {
            Errors.error((SubLObject)module0545.$ic11$, var11);
        }
        return var13;
    }
    
    public static SubLObject f33736(final SubLObject var4) {
        if (module0545.NIL != module0178.f11375(var4)) {
            if (module0545.NIL != module0178.f11341(var4)) {
                f33733(var4);
            }
            else {
                f33727(var4);
            }
        }
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33737(final SubLObject var4) {
        if (module0545.NIL != module0178.f11375(var4) && module0545.NIL == module0178.f11341(var4)) {
            f33727(var4);
        }
        else {
            f33733(var4);
        }
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33738(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0545.NIL;
        SubLObject var16 = (SubLObject)module0545.NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_17 = var16;
            f33739(var16_17);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = module0545.$g3965$.currentBinding(var14);
            final SubLObject var19 = module0545.$g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                module0545.$g3965$.bind(var1, var14);
                module0545.$g3964$.bind(var16_17, var14);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var14);
                module0147.$g2095$.bind(module0545.$ic17$, var14);
                module0219.f14491(var17, var12);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                module0545.$g3964$.rebind(var19, var14);
                module0545.$g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33740(final SubLObject var12, final SubLObject var23, final SubLObject var24, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0545.NIL;
        SubLObject var27 = (SubLObject)module0545.NIL;
        try {
            var27 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var27.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_26 = var27;
            f33739(var16_26);
            final SubLObject var28 = f33735(var11);
            final SubLObject var29 = module0545.$g3965$.currentBinding(var25);
            final SubLObject var30 = module0545.$g3964$.currentBinding(var25);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var25);
            try {
                module0545.$g3965$.bind(var1, var25);
                module0545.$g3964$.bind(var16_26, var25);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var25);
                module0147.$g2095$.bind(module0545.$ic17$, var25);
                module0219.f14477(var28, var12, var23, var24, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var32, var25);
                module0147.$g2094$.rebind(var31, var25);
                module0545.$g3964$.rebind(var30, var25);
                module0545.$g3965$.rebind(var29, var25);
            }
            var26 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f33741(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0545.NIL;
        SubLObject var16 = (SubLObject)module0545.NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_28 = var16;
            f33739(var16_28);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = module0545.$g3965$.currentBinding(var14);
            final SubLObject var19 = module0545.$g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                module0545.$g3965$.bind(var1, var14);
                module0545.$g3964$.bind(var16_28, var14);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var14);
                module0147.$g2095$.bind(module0545.$ic17$, var14);
                module0219.f14502(var17, var12, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                module0545.$g3964$.rebind(var19, var14);
                module0545.$g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33742(final SubLObject var24, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0545.NIL;
        SubLObject var27 = (SubLObject)module0545.NIL;
        try {
            var27 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var27.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_30 = var27;
            f33739(var16_30);
            final SubLObject var28 = f33735(var11);
            final SubLObject var29 = module0545.$g3965$.currentBinding(var25);
            final SubLObject var30 = module0545.$g3964$.currentBinding(var25);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var25);
            try {
                module0545.$g3965$.bind(var1, var25);
                module0545.$g3964$.bind(var16_30, var25);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var25);
                module0147.$g2095$.bind(module0545.$ic17$, var25);
                module0219.f14481(var28, var24, (SubLObject)module0545.$ic18$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
                module0219.f14481(var28, var24, (SubLObject)module0545.$ic19$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var32, var25);
                module0147.$g2094$.rebind(var31, var25);
                module0545.$g3964$.rebind(var30, var25);
                module0545.$g3965$.rebind(var29, var25);
            }
            var26 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f33743(final SubLObject var31, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0545.NIL;
        SubLObject var34 = (SubLObject)module0545.NIL;
        try {
            var34 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var34.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_33 = var34;
            f33739(var16_33);
            final SubLObject var35 = f33735(var11);
            final SubLObject var36 = module0545.$g3965$.currentBinding(var32);
            final SubLObject var37 = module0545.$g3964$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var39 = module0147.$g2095$.currentBinding(var32);
            try {
                module0545.$g3965$.bind(var1, var32);
                module0545.$g3964$.bind(var16_33, var32);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var32);
                module0147.$g2095$.bind(module0545.$ic17$, var32);
                module0219.f14483(var35, var31, (SubLObject)module0545.$ic18$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
                module0219.f14483(var35, var31, (SubLObject)module0545.$ic19$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var39, var32);
                module0147.$g2094$.rebind(var38, var32);
                module0545.$g3964$.rebind(var37, var32);
                module0545.$g3965$.rebind(var36, var32);
            }
            var33 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var32);
                if (var34.isStream()) {
                    streams_high.close(var34, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var40, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f33744(final SubLObject var31, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0545.NIL;
        SubLObject var34 = (SubLObject)module0545.NIL;
        try {
            var34 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var34.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_35 = var34;
            f33739(var16_35);
            final SubLObject var35 = f33735(var11);
            final SubLObject var36 = module0545.$g3965$.currentBinding(var32);
            final SubLObject var37 = module0545.$g3964$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var39 = module0147.$g2095$.currentBinding(var32);
            try {
                module0545.$g3965$.bind(var1, var32);
                module0545.$g3964$.bind(var16_35, var32);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var32);
                module0147.$g2095$.bind(module0545.$ic17$, var32);
                module0219.f14485(var35, var31, (SubLObject)module0545.$ic18$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
                module0219.f14485(var35, var31, (SubLObject)module0545.$ic19$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var39, var32);
                module0147.$g2094$.rebind(var38, var32);
                module0545.$g3964$.rebind(var37, var32);
                module0545.$g3965$.rebind(var36, var32);
            }
            var33 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var32);
                if (var34.isStream()) {
                    streams_high.close(var34, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var40, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f33745(final SubLObject var36, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0545.NIL;
        SubLObject var39 = (SubLObject)module0545.NIL;
        try {
            var39 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var39.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_38 = var39;
            f33739(var16_38);
            final SubLObject var40 = f33735(var11);
            final SubLObject var41 = module0545.$g3965$.currentBinding(var37);
            final SubLObject var42 = module0545.$g3964$.currentBinding(var37);
            final SubLObject var43 = module0147.$g2094$.currentBinding(var37);
            final SubLObject var44 = module0147.$g2095$.currentBinding(var37);
            try {
                module0545.$g3965$.bind(var1, var37);
                module0545.$g3964$.bind(var16_38, var37);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var37);
                module0147.$g2095$.bind(module0545.$ic17$, var37);
                module0219.f14486(var40, var36, (SubLObject)module0545.$ic18$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
                module0219.f14486(var40, var36, (SubLObject)module0545.$ic19$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var44, var37);
                module0147.$g2094$.rebind(var43, var37);
                module0545.$g3964$.rebind(var42, var37);
                module0545.$g3965$.rebind(var41, var37);
            }
            var38 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var37);
                if (var39.isStream()) {
                    streams_high.close(var39, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var45, var37);
            }
        }
        return var38;
    }
    
    public static SubLObject f33746(final SubLObject var12, final SubLObject var13, SubLObject var11, SubLObject var1) {
        if (var11 == module0545.UNPROVIDED) {
            var11 = (SubLObject)module0545.$ic12$;
        }
        if (var1 == module0545.UNPROVIDED) {
            var1 = (SubLObject)module0545.$ic13$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0545.NIL;
        SubLObject var16 = (SubLObject)module0545.NIL;
        try {
            var16 = compatibility.open_text(var13, (SubLObject)module0545.$ic14$);
            if (!var16.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var13);
            }
            final SubLObject var16_40 = var16;
            f33739(var16_40);
            final SubLObject var17 = f33735(var11);
            final SubLObject var18 = module0545.$g3965$.currentBinding(var14);
            final SubLObject var19 = module0545.$g3964$.currentBinding(var14);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
            try {
                module0545.$g3965$.bind(var1, var14);
                module0545.$g3964$.bind(var16_40, var14);
                module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var14);
                module0147.$g2095$.bind(module0545.$ic17$, var14);
                module0219.f14498(var17, var12, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var21, var14);
                module0147.$g2094$.rebind(var20, var14);
                module0545.$g3964$.rebind(var19, var14);
                module0545.$g3965$.rebind(var18, var14);
            }
            var15 = (SubLObject)module0545.T;
        }
        finally {
            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var22, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f33747(final SubLObject var16) {
        PrintLow.format(var16, (SubLObject)module0545.$ic20$);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33739(final SubLObject var16) {
        f33747(var16);
        PrintLow.format(var16, (SubLObject)module0545.$ic21$);
        PrintLow.format(var16, (SubLObject)module0545.$ic22$, module0051.f3552((SubLObject)module0545.UNPROVIDED));
        PrintLow.format(var16, (SubLObject)module0545.$ic23$, module0011.f351(), module0018.f971());
        PrintLow.format(var16, (SubLObject)module0545.$ic24$);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33734(final SubLObject var41, SubLObject var42, SubLObject var43, SubLObject var44, SubLObject var45) {
        if (var42 == module0545.UNPROVIDED) {
            var42 = (SubLObject)module0545.NIL;
        }
        if (var43 == module0545.UNPROVIDED) {
            var43 = (SubLObject)module0545.NIL;
        }
        if (var44 == module0545.UNPROVIDED) {
            var44 = (SubLObject)module0545.NIL;
        }
        if (var45 == module0545.UNPROVIDED) {
            var45 = (SubLObject)module0545.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        return PrintLow.format(module0545.$g3964$.getDynamicValue(var46), var41, new SubLObject[] { var42, var43, var44, var45 });
    }
    
    public static SubLObject f33730(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        f33734((SubLObject)module0545.$ic25$, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        module0194.f12114(var6, module0545.$g3964$.getDynamicValue(var10), (SubLObject)module0545.ONE_INTEGER);
        f33734((SubLObject)module0545.$ic26$, var7, var8, var9, (SubLObject)module0545.UNPROVIDED);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33729(final SubLObject var6, final SubLObject var7) {
        f33734((SubLObject)module0545.$ic27$, var6, var7, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33748(final SubLObject var46, SubLObject var47) {
        if (var47 == module0545.UNPROVIDED) {
            var47 = (SubLObject)module0545.ZERO_INTEGER;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert module0545.NIL != Types.stringp(var46) : var46;
        assert module0545.NIL != Types.integerp(var47) : var47;
        var48.resetMultipleValues();
        final SubLObject var49 = f33749(var46, var47);
        final SubLObject var50 = var48.secondMultipleValue();
        final SubLObject var51 = var48.thirdMultipleValue();
        var48.resetMultipleValues();
        if (var49 == module0545.$ic30$) {
            PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic31$, var46);
            return (SubLObject)module0545.NIL;
        }
        if (var49 == module0545.$ic32$) {
            PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic33$);
            PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic34$, var47);
            PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic35$, Numbers.subtract(var50, var47));
            return (SubLObject)module0545.T;
        }
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic36$);
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic34$, var47);
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic35$, Numbers.subtract(var50, var47));
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic37$, var51);
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic38$, var49);
        PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic39$, var50);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33749(final SubLObject var46, SubLObject var47) {
        if (var47 == module0545.UNPROVIDED) {
            var47 = (SubLObject)module0545.ZERO_INTEGER;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (module0545.NIL != Filesys.probe_file(var46)) {
            SubLObject var49 = (SubLObject)module0545.ZERO_INTEGER;
            SubLObject var50 = (SubLObject)module0545.ZERO_INTEGER;
            SubLObject var51 = (SubLObject)module0545.$ic32$;
            SubLObject var52 = (SubLObject)module0545.NIL;
            SubLObject var53 = (SubLObject)module0545.NIL;
            try {
                var53 = compatibility.open_text(var46, (SubLObject)module0545.$ic40$);
                if (!var53.isStream()) {
                    Errors.error((SubLObject)module0545.$ic15$, var46);
                }
                final SubLObject var16_56 = var53;
                try {
                    var48.throwStack.push(module0545.$ic41$);
                    final SubLObject var54 = streams_high.file_length(var16_56);
                    final SubLObject var55 = module0012.$g75$.currentBinding(var48);
                    final SubLObject var56 = module0012.$g76$.currentBinding(var48);
                    final SubLObject var57 = module0012.$g77$.currentBinding(var48);
                    final SubLObject var58 = module0012.$g78$.currentBinding(var48);
                    try {
                        module0012.$g75$.bind((SubLObject)module0545.ZERO_INTEGER, var48);
                        module0012.$g76$.bind((SubLObject)module0545.NIL, var48);
                        module0012.$g77$.bind((SubLObject)module0545.T, var48);
                        module0012.$g78$.bind(Time.get_universal_time(), var48);
                        module0012.f478((SubLObject)module0545.$ic42$);
                        SubLObject var59;
                        SubLObject var60;
                        for (var59 = (SubLObject)module0545.NIL, var59 = f33750(var16_56); var59 != module0545.$ic43$ && var59 != module0545.$ic44$; var59 = f33750(var16_56)) {
                            if (var47.numG((SubLObject)module0545.ZERO_INTEGER)) {
                                var47 = Numbers.subtract(var47, (SubLObject)module0545.ONE_INTEGER);
                            }
                            else {
                                var60 = f33751(var59);
                                if (module0545.NIL != var60) {
                                    PrintLow.format((SubLObject)module0545.T, (SubLObject)module0545.$ic45$, var59, var50);
                                    Dynamic.sublisp_throw((SubLObject)module0545.$ic41$, var60);
                                }
                            }
                            var50 = compatibility.get_file_position(var16_56);
                            module0012.note_percent_progress(var50, var54);
                            var49 = Numbers.add(var49, (SubLObject)module0545.ONE_INTEGER);
                            var52 = var59;
                        }
                        if (var59 == module0545.$ic43$) {
                            Dynamic.sublisp_throw((SubLObject)module0545.$ic41$, PrintLow.format((SubLObject)module0545.NIL, (SubLObject)module0545.$ic46$, var52, var50));
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
                    var51 = Errors.handleThrowable(var61, (SubLObject)module0545.$ic41$);
                }
                finally {
                    var48.throwStack.pop();
                }
            }
            finally {
                final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0545.T, var48);
                    if (var53.isStream()) {
                        streams_high.close(var53, (SubLObject)module0545.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var62, var48);
                }
            }
            return Values.values(var51, var49, var50);
        }
        return Values.values((SubLObject)module0545.$ic30$, (SubLObject)module0545.ZERO_INTEGER, (SubLObject)module0545.ZERO_INTEGER);
    }
    
    public static SubLObject f33750(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var17.resetMultipleValues();
        final SubLObject var18 = reader.read_ignoring_errors(var16, (SubLObject)module0545.NIL, (SubLObject)module0545.$ic44$);
        final SubLObject var19 = var17.secondMultipleValue();
        var17.resetMultipleValues();
        return (module0545.NIL != var18) ? var18 : var19;
    }
    
    public static SubLObject f33751(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0545.NIL;
        try {
            var59.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var61 = Errors.$error_handler$.currentBinding(var59);
            try {
                Errors.$error_handler$.bind((SubLObject)module0545.$ic47$, var59);
                try {
                    final SubLObject var19_63 = Errors.$continue_cerrorP$.currentBinding(var59);
                    final SubLObject var62 = module0111.$g1406$.currentBinding(var59);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)module0545.T, var59);
                        module0111.$g1406$.bind((SubLObject)module0545.NIL, var59);
                        module0538.f33316();
                        module0112.f7688(var58);
                    }
                    finally {
                        module0111.$g1406$.rebind(var62, var59);
                        Errors.$continue_cerrorP$.rebind(var19_63, var59);
                    }
                    if (module0545.NIL == var60 && module0545.NIL != module0538.f33324()) {
                        SubLObject var64;
                        final SubLObject var63 = var64 = module0538.f33325();
                        SubLObject var65 = (SubLObject)module0545.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0545.$ic48$);
                        var65 = var64.first();
                        var64 = var64.rest();
                        final SubLObject var66 = (SubLObject)(var64.isCons() ? var64.first() : module0545.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var64, var63, (SubLObject)module0545.$ic48$);
                        final SubLObject var67;
                        var64 = (var67 = var64.rest());
                        Functions.apply(Symbols.symbol_function((SubLObject)module0545.$ic49$), Sequences.cconcatenate((SubLObject)module0545.$ic50$, (module0545.NIL != var66) ? var66 : PrintLow.format((SubLObject)module0545.NIL, (SubLObject)module0545.$ic51$, var65)), new SubLObject[] { var58, var67 });
                    }
                }
                catch (Throwable var68) {
                    Errors.handleThrowable(var68, (SubLObject)module0545.NIL);
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
        assert module0545.NIL != module0128.f8449(var68) : var68;
        assert module0545.NIL != Types.stringp(var46) : var46;
        SubLObject var69 = (SubLObject)module0545.NIL;
        try {
            var69 = compatibility.open_text(var46, (SubLObject)module0545.$ic14$);
            if (!var69.isStream()) {
                Errors.error((SubLObject)module0545.$ic15$, var46);
            }
            final SubLObject var16_70 = var69;
            f33753(var68, var16_70);
        }
        finally {
            final SubLObject var70 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0545.T);
                if (var69.isStream()) {
                    streams_high.close(var69, (SubLObject)module0545.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var70);
            }
        }
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33753(final SubLObject var68, SubLObject var16) {
        if (var16 == module0545.UNPROVIDED) {
            var16 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        f33739(var16);
        PrintLow.format(var16, (SubLObject)module0545.$ic53$, var68);
        PrintLow.format(var16, (SubLObject)module0545.$ic54$, module0166.f10743(var68), module0166.f10757(var68));
        final SubLObject var70 = module0545.$g3969$.currentBinding(var69);
        final SubLObject var71 = module0545.$g3970$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var73 = module0147.$g2095$.currentBinding(var69);
        try {
            module0545.$g3969$.bind(Hashtables.make_hash_table(module0217.f14357(var68), (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED), var69);
            module0545.$g3970$.bind(var16, var69);
            module0147.$g2094$.bind((SubLObject)module0545.$ic16$, var69);
            module0147.$g2095$.bind(module0545.$ic17$, var69);
            SubLObject var74 = (SubLObject)module0545.$ic56$;
            SubLObject var75 = (SubLObject)module0545.NIL;
            var75 = var74.first();
            while (module0545.NIL != var74) {
                module0219.f14477(Symbols.symbol_function((SubLObject)module0545.$ic55$), var68, (SubLObject)module0545.ONE_INTEGER, var75, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
                var74 = var74.rest();
                var75 = var74.first();
            }
            module0219.f14477(Symbols.symbol_function((SubLObject)module0545.$ic55$), var68, (SubLObject)module0545.ONE_INTEGER, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED, (SubLObject)module0545.UNPROVIDED);
            module0219.f14491(Symbols.symbol_function((SubLObject)module0545.$ic55$), var68);
        }
        finally {
            module0147.$g2095$.rebind(var73, var69);
            module0147.$g2094$.rebind(var72, var69);
            module0545.$g3970$.rebind(var71, var69);
            module0545.$g3969$.rebind(var70, var69);
        }
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33754(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (module0545.NIL == Hashtables.gethash(var72, module0545.$g3969$.getDynamicValue(var73), (SubLObject)module0545.UNPROVIDED)) {
            Hashtables.sethash(var72, module0545.$g3969$.getDynamicValue(var73), (SubLObject)module0545.T);
            if (module0545.NIL != module0178.f11375(var72)) {
                final SubLObject var74 = module0545.$g3970$.getDynamicValue(var73);
                final SubLObject var75 = module0289.f19396(var72);
                final SubLObject var76 = module0173.f10958(module0178.f11287(var72));
                final SubLObject var77 = module0178.f11291(var72);
                final SubLObject var78 = module0178.f11293(var72);
                PrintLow.format(var74, (SubLObject)module0545.$ic57$);
                module0194.f12114(var75, var74, (SubLObject)module0545.ONE_INTEGER);
                PrintLow.format(var74, (SubLObject)module0545.$ic58$, var76);
                PrintLow.format(var74, (SubLObject)module0545.$ic59$, var78, var77);
            }
        }
        return (SubLObject)module0545.NIL;
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
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33756() {
        module0545.$g3964$ = SubLFiles.defparameter("S#37149", (SubLObject)module0545.T);
        module0545.$g3965$ = SubLFiles.defparameter("S#37150", (SubLObject)module0545.NIL);
        module0545.$g3966$ = SubLFiles.defparameter("S#37151", (SubLObject)module0545.$ic0$);
        module0545.$g3967$ = SubLFiles.defparameter("S#37152", (SubLObject)module0545.NIL);
        module0545.$g3968$ = SubLFiles.defparameter("S#37153", (SubLObject)module0545.$ic10$);
        module0545.$g3969$ = SubLFiles.defparameter("S#37154", (SubLObject)module0545.NIL);
        module0545.$g3970$ = SubLFiles.defparameter("S#37155", (SubLObject)module0545.NIL);
        return (SubLObject)module0545.NIL;
    }
    
    public static SubLObject f33757() {
        return (SubLObject)module0545.NIL;
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
        module0545.$g3964$ = null;
        module0545.$g3965$ = null;
        module0545.$g3966$ = null;
        module0545.$g3967$ = null;
        module0545.$g3968$ = null;
        module0545.$g3969$ = null;
        module0545.$g3970$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNASSERT-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("S#37123", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("S#37124", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("S#37125", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMMENTED"), (SubLObject)SubLObjectFactory.makeSymbol("S#37126", "CYC")));
        $ic1$ = SubLObjectFactory.makeString("~S was not a valid batch-ke output-method");
        $ic2$ = SubLObjectFactory.makeString("~a is not a known batch ke output method");
        $ic3$ = SubLObjectFactory.makeString("CODE Assertion");
        $ic4$ = SubLObjectFactory.makeString("REMOTE Assertion");
        $ic5$ = SubLObjectFactory.makeString("~%~%;; ~A");
        $ic6$ = SubLObjectFactory.makeString("~%;; Formula:  ~S");
        $ic7$ = SubLObjectFactory.makeString("~%;; Mt:       ~S");
        $ic8$ = SubLObjectFactory.makeString("~%;; Strength: ~S");
        $ic9$ = SubLObjectFactory.makeString("~%;; Dir:      ~S");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#37128", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL-AND-COMMENTED-REMOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#37129", "CYC")));
        $ic11$ = SubLObjectFactory.makeString("~S was not a valid batch-ke inclusion-level");
        $ic12$ = SubLObjectFactory.makeKeyword("LOCAL");
        $ic13$ = SubLObjectFactory.makeKeyword("UNASSERT-ASSERT");
        $ic14$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic15$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic18$ = SubLObjectFactory.makeKeyword("POS");
        $ic19$ = SubLObjectFactory.makeKeyword("NEG");
        $ic20$ = SubLObjectFactory.makeString(";;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");
        $ic21$ = SubLObjectFactory.makeString("~%;;");
        $ic22$ = SubLObjectFactory.makeString("~%;; Created on ~A");
        $ic23$ = SubLObjectFactory.makeString("~%;; CycL ~A  KB ~S");
        $ic24$ = SubLObjectFactory.makeString("~%~%");
        $ic25$ = SubLObjectFactory.makeString("~%(ke-assert '");
        $ic26$ = SubLObjectFactory.makeString("~% ~s ~s ~s)");
        $ic27$ = SubLObjectFactory.makeString("~%~%(ke-unassert '~s ~s)");
        $ic28$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic29$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic30$ = SubLObjectFactory.makeKeyword("FILE-NOT-FOUND");
        $ic31$ = SubLObjectFactory.makeString("~%File ~A was not found, or is inaccessible");
        $ic32$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic33$ = SubLObjectFactory.makeString("~%File completely processed");
        $ic34$ = SubLObjectFactory.makeString("~%~S initial operations skipped");
        $ic35$ = SubLObjectFactory.makeString("~%~S operations successfully processed");
        $ic36$ = SubLObjectFactory.makeString("~%File incompletely processed:");
        $ic37$ = SubLObjectFactory.makeString("~%Error after file position ~S:");
        $ic38$ = SubLObjectFactory.makeString("~%~%~A");
        $ic39$ = SubLObjectFactory.makeString("~%~%After fixing the file, use a skip value of ~S to continue.");
        $ic40$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic41$ = SubLObjectFactory.makeKeyword("ABORT-KE-LOAD");
        $ic42$ = SubLObjectFactory.makeString("Loading KE forms");
        $ic43$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic44$ = SubLObjectFactory.makeKeyword("EOF");
        $ic45$ = SubLObjectFactory.makeString("Eval error in form ~S starting at position ~S");
        $ic46$ = SubLObjectFactory.makeString("Read error in form after ~S starting at position ~S");
        $ic47$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#159", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic49$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic50$ = SubLObjectFactory.makeString("Last operation: ~S~%");
        $ic51$ = SubLObjectFactory.makeString("FI error: ~A");
        $ic52$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic53$ = SubLObjectFactory.makeString(";; Archive of ~S");
        $ic54$ = SubLObjectFactory.makeString("~%~%(fi-find-or-create ~S ~S)");
        $ic55$ = SubLObjectFactory.makeSymbol("S#37148", "CYC");
        $ic56$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $ic57$ = SubLObjectFactory.makeString("~%~%(ke-assert '");
        $ic58$ = SubLObjectFactory.makeString("~% '~S");
        $ic59$ = SubLObjectFactory.makeString("~% ~S ~S)");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0545.class
	Total time: 309 ms
	
	Decompiled with Procyon 0.5.32.
*/