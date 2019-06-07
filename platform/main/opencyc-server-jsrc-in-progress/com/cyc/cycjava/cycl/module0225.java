package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0225 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0225";
    public static final String myFingerPrint = "ac3870d4ce78939d5a6ff1bfec6f9dd521ab64e0378e09953b55cd2373b58e04";
    private static SubLSymbol $g2409$;
    private static SubLSymbol $g2410$;
    private static SubLSymbol $g2411$;
    private static SubLSymbol $g2412$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    
    public static SubLObject f14735() {
        $g2410$.setGlobalValue(Hashtables.make_hash_table(module0549.f33895($ic1$), $g2409$.getGlobalValue(), (SubLObject)UNPROVIDED));
        return $g2410$.getGlobalValue();
    }
    
    public static SubLObject f14736(final SubLObject var1) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.gethash_without_values(var1, $g2410$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14737(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.sethash(var1, $g2410$.getGlobalValue(), var2);
    }
    
    public static SubLObject f14738(final SubLObject var1) {
        Hashtables.remhash(var1, $g2410$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f14739(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            return f14736(var1);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic3$), module0132.$g1555$.getGlobalValue())) {
            return f14739(module0172.f10921(var1));
        }
        if (NIL != module0202.f12895(var1)) {
            return module0202.f12897(var1);
        }
        if (NIL != module0202.f12899(var1)) {
            return module0202.f12901(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14740(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f14739(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        if (NIL == var3 && NIL != module0172.f10917(var1)) {
            final SubLObject var5 = module0434.f30576((SubLObject)$ic7$, (SubLObject)ConsesLow.listS($ic8$, var1, (SubLObject)$ic9$), $ic10$, (SubLObject)$ic11$);
            return Values.values(var5.first(), module0035.sublisp_boolean(var5));
        }
        return Values.values(var3, var4);
    }
    
    public static SubLObject f14741() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = (SubLObject)$ic12$;
        final SubLObject var6 = module0012.$g73$.currentBinding(var4);
        final SubLObject var7 = module0012.$g65$.currentBinding(var4);
        final SubLObject var8 = module0012.$g67$.currentBinding(var4);
        final SubLObject var9 = module0012.$g68$.currentBinding(var4);
        final SubLObject var10 = module0012.$g66$.currentBinding(var4);
        final SubLObject var11 = module0012.$g69$.currentBinding(var4);
        final SubLObject var12 = module0012.$g70$.currentBinding(var4);
        final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var4);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var4);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
            module0012.$g70$.bind((SubLObject)T, var4);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var5) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
            module0012.f474(var5);
            f14742();
            f14743();
            f14744();
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var13, var4);
            module0012.$g70$.rebind(var12, var4);
            module0012.$g69$.rebind(var11, var4);
            module0012.$g66$.rebind(var10, var4);
            module0012.$g68$.rebind(var9, var4);
            module0012.$g67$.rebind(var8, var4);
            module0012.$g65$.rebind(var7, var4);
            module0012.$g73$.rebind(var6, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14742() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != $g2410$.getGlobalValue()) {
            Hashtables.clrhash($g2410$.getGlobalValue());
        }
        else {
            f14735();
        }
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)$ic13$, var4);
            module0147.$g2095$.bind($ic14$, var4);
            final SubLObject var7 = $ic8$;
            if (NIL != module0158.f10038(var7)) {
                final SubLObject var8 = (SubLObject)NIL;
                final SubLObject var9_18 = module0012.$g73$.currentBinding(var4);
                final SubLObject var10_19 = module0012.$g65$.currentBinding(var4);
                final SubLObject var9 = module0012.$g67$.currentBinding(var4);
                final SubLObject var10 = module0012.$g68$.currentBinding(var4);
                final SubLObject var11 = module0012.$g66$.currentBinding(var4);
                final SubLObject var12 = module0012.$g69$.currentBinding(var4);
                final SubLObject var13 = module0012.$g70$.currentBinding(var4);
                final SubLObject var14 = module0012.$silent_progressP$.currentBinding(var4);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var4);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g70$.bind((SubLObject)T, var4);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var8) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
                    module0012.f474(var8);
                    final SubLObject var15 = module0158.f10039(var7);
                    SubLObject var16 = (SubLObject)NIL;
                    final SubLObject var17 = (SubLObject)NIL;
                    while (NIL == var16) {
                        final SubLObject var18 = module0052.f3695(var15, var17);
                        final SubLObject var19 = (SubLObject)makeBoolean(!var17.eql(var18));
                        if (NIL != var19) {
                            module0012.f476();
                            SubLObject var20 = (SubLObject)NIL;
                            try {
                                var20 = module0158.f10316(var18, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                SubLObject var21_26 = (SubLObject)NIL;
                                final SubLObject var22_27 = (SubLObject)NIL;
                                while (NIL == var21_26) {
                                    final SubLObject var21 = module0052.f3695(var20, var22_27);
                                    final SubLObject var24_29 = (SubLObject)makeBoolean(!var22_27.eql(var21));
                                    if (NIL != var24_29) {
                                        f14745(var21);
                                    }
                                    var21_26 = (SubLObject)makeBoolean(NIL == var24_29);
                                }
                            }
                            finally {
                                final SubLObject var9_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                    if (NIL != var20) {
                                        module0158.f10319(var20);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var9_19, var4);
                                }
                            }
                        }
                        var16 = (SubLObject)makeBoolean(NIL == var19);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var14, var4);
                    module0012.$g70$.rebind(var13, var4);
                    module0012.$g69$.rebind(var12, var4);
                    module0012.$g66$.rebind(var11, var4);
                    module0012.$g68$.rebind(var10, var4);
                    module0012.$g67$.rebind(var9, var4);
                    module0012.$g65$.rebind(var10_19, var4);
                    module0012.$g73$.rebind(var9_18, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return Hashtables.hash_table_count($g2410$.getGlobalValue());
    }
    
    public static SubLObject f14745(final SubLObject var28) {
        final SubLObject var29 = module0178.f11334(var28);
        if (NIL != module0173.f10955(var29)) {
            final SubLObject var30 = module0178.f11335(var28);
            return f14746(var29, var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14747(final SubLObject var1) {
        final SubLObject var2 = module0220.f14556(var1, $ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        return f14746(var1, var2);
    }
    
    public static SubLObject f14746(final SubLObject var1, SubLObject var2) {
        var2 = f14748(var2);
        assert NIL != Types.integerp(var2) : var2;
        f14737(var1, var2);
        return var2;
    }
    
    public static SubLObject f14748(SubLObject var2) {
        if (!var2.isInteger() && NIL != module0131.f8560()) {
            var2 = module0610.f37220(var2);
        }
        return var2;
    }
    
    public static SubLObject f14749(final SubLObject var1, SubLObject var2) {
        var2 = f14748(var2);
        assert NIL != Types.integerp(var2) : var2;
        final SubLObject var3 = f14739(var1);
        if (NIL != var3 && !var3.eql(var2)) {
            Errors.error((SubLObject)$ic18$, var1, var3, var2);
        }
        f14737(var1, var2);
        return var2;
    }
    
    public static SubLObject f14750(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = $ic8$;
        if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var5);
            SubLObject var7 = var3;
            final SubLObject var8 = (SubLObject)NIL;
            while (NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)makeBoolean(!var8.eql(var9));
                if (NIL != var10) {
                    SubLObject var11 = (SubLObject)NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                        SubLObject var21_36 = var3;
                        final SubLObject var22_37 = (SubLObject)NIL;
                        while (NIL == var21_36) {
                            final SubLObject var12 = module0052.f3695(var11, var22_37);
                            final SubLObject var24_38 = (SubLObject)makeBoolean(!var22_37.eql(var12));
                            if (NIL != var24_38) {
                                final SubLObject var13 = module0178.f11335(var12);
                                if (var2.numE(var13)) {
                                    var3 = module0226.f15088(var12, (SubLObject)$ic16$);
                                }
                                else {
                                    var4 = var13;
                                }
                            }
                            var21_36 = (SubLObject)makeBoolean(NIL == var24_38 || NIL != var3);
                        }
                    }
                    finally {
                        final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                        }
                    }
                }
                var7 = (SubLObject)makeBoolean(NIL == var10 || NIL != var3);
            }
        }
        if (NIL == var3) {
            f14738(var1);
        }
        if (NIL != var4) {
            f14737(var1, var4);
        }
        return var1;
    }
    
    public static SubLObject f14751() {
        $g2411$.setGlobalValue(Hashtables.make_hash_table(module0549.f33895($ic20$), $g2409$.getGlobalValue(), (SubLObject)UNPROVIDED));
        return $g2411$.getGlobalValue();
    }
    
    public static SubLObject f14752(final SubLObject var1) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.gethash_without_values(var1, $g2411$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14753(final SubLObject var1, final SubLObject var40) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.sethash(var1, $g2411$.getGlobalValue(), var40);
    }
    
    public static SubLObject f14754(final SubLObject var1) {
        Hashtables.remhash(var1, $g2411$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f14755(final SubLObject var1) {
        final SubLObject var2 = f14756(var1);
        return (SubLObject)((NIL != var2) ? var2 : ZERO_INTEGER);
    }
    
    public static SubLObject f14756(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var2 = f14752(var1);
            if (NIL != var2) {
                return var2;
            }
            return f14757(var1);
        }
        else {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic3$), module0132.$g1555$.getGlobalValue())) {
                return f14755(module0172.f10921(var1));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f14743() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != $g2411$.getGlobalValue()) {
            Hashtables.clrhash($g2411$.getGlobalValue());
        }
        else {
            f14751();
        }
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)$ic13$, var4);
            module0147.$g2095$.bind($ic14$, var4);
            final SubLObject var7 = $ic21$;
            if (NIL != module0158.f10038(var7)) {
                final SubLObject var8 = (SubLObject)NIL;
                final SubLObject var9_42 = module0012.$g73$.currentBinding(var4);
                final SubLObject var10_43 = module0012.$g65$.currentBinding(var4);
                final SubLObject var9 = module0012.$g67$.currentBinding(var4);
                final SubLObject var10 = module0012.$g68$.currentBinding(var4);
                final SubLObject var11 = module0012.$g66$.currentBinding(var4);
                final SubLObject var12 = module0012.$g69$.currentBinding(var4);
                final SubLObject var13 = module0012.$g70$.currentBinding(var4);
                final SubLObject var14 = module0012.$silent_progressP$.currentBinding(var4);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var4);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g70$.bind((SubLObject)T, var4);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var8) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
                    module0012.f474(var8);
                    final SubLObject var15 = module0158.f10039(var7);
                    SubLObject var16 = (SubLObject)NIL;
                    final SubLObject var17 = (SubLObject)NIL;
                    while (NIL == var16) {
                        final SubLObject var18 = module0052.f3695(var15, var17);
                        final SubLObject var19 = (SubLObject)makeBoolean(!var17.eql(var18));
                        if (NIL != var19) {
                            module0012.f476();
                            SubLObject var20 = (SubLObject)NIL;
                            try {
                                var20 = module0158.f10316(var18, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                SubLObject var21_44 = (SubLObject)NIL;
                                final SubLObject var22_45 = (SubLObject)NIL;
                                while (NIL == var21_44) {
                                    final SubLObject var21 = module0052.f3695(var20, var22_45);
                                    final SubLObject var24_46 = (SubLObject)makeBoolean(!var22_45.eql(var21));
                                    if (NIL != var24_46) {
                                        f14758(var21);
                                    }
                                    var21_44 = (SubLObject)makeBoolean(NIL == var24_46);
                                }
                            }
                            finally {
                                final SubLObject var9_43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                    if (NIL != var20) {
                                        module0158.f10319(var20);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var9_43, var4);
                                }
                            }
                        }
                        var16 = (SubLObject)makeBoolean(NIL == var19);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var14, var4);
                    module0012.$g70$.rebind(var13, var4);
                    module0012.$g69$.rebind(var12, var4);
                    module0012.$g66$.rebind(var11, var4);
                    module0012.$g68$.rebind(var10, var4);
                    module0012.$g67$.rebind(var9, var4);
                    module0012.$g65$.rebind(var10_43, var4);
                    module0012.$g73$.rebind(var9_42, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return Hashtables.hash_table_count($g2411$.getGlobalValue());
    }
    
    public static SubLObject f14758(final SubLObject var28) {
        final SubLObject var29 = module0178.f11334(var28);
        if (NIL != module0173.f10955(var29)) {
            final SubLObject var30 = module0178.f11335(var28);
            return f14759(var29, var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14757(final SubLObject var1) {
        final SubLObject var2 = module0220.f14556(var1, $ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        return f14759(var1, var2);
    }
    
    public static SubLObject f14759(final SubLObject var1, SubLObject var40) {
        var40 = f14748(var40);
        assert NIL != Types.integerp(var40) : var40;
        f14753(var1, var40);
        return var40;
    }
    
    public static SubLObject f14760(final SubLObject var1, SubLObject var40) {
        var40 = f14748(var40);
        assert NIL != Types.integerp(var40) : var40;
        final SubLObject var41 = f14755(var1);
        if (NIL != var41 && !var41.eql(var40)) {
            Errors.error((SubLObject)$ic22$, var1, var41, var40);
        }
        f14753(var1, var40);
        return var40;
    }
    
    public static SubLObject f14761(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = $ic21$;
        if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var3)) {
            final SubLObject var4 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var3);
            SubLObject var5 = var2;
            final SubLObject var6 = (SubLObject)NIL;
            while (NIL == var5) {
                final SubLObject var7 = module0052.f3695(var4, var6);
                final SubLObject var8 = (SubLObject)makeBoolean(!var6.eql(var7));
                if (NIL != var8) {
                    SubLObject var9 = (SubLObject)NIL;
                    try {
                        var9 = module0158.f10316(var7, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                        SubLObject var21_48 = var2;
                        final SubLObject var22_49 = (SubLObject)NIL;
                        while (NIL == var21_48) {
                            final SubLObject var10 = module0052.f3695(var9, var22_49);
                            final SubLObject var24_50 = (SubLObject)makeBoolean(!var22_49.eql(var10));
                            if (NIL != var24_50) {
                                var2 = module0226.f15088(var10, (SubLObject)$ic16$);
                            }
                            var21_48 = (SubLObject)makeBoolean(NIL == var24_50 || NIL != var2);
                        }
                    }
                    finally {
                        final SubLObject var11 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var9) {
                                module0158.f10319(var9);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var11);
                        }
                    }
                }
                var5 = (SubLObject)makeBoolean(NIL == var8 || NIL != var2);
            }
        }
        if (NIL == var2) {
            f14754(var1);
        }
        return var1;
    }
    
    public static SubLObject f14762(final SubLObject var1) {
        final SubLObject var2 = f14739(var1);
        if (NIL != var2) {
            return var2;
        }
        return f14755(var1);
    }
    
    public static SubLObject f14763() {
        $g2412$.setGlobalValue(Hashtables.make_hash_table(module0549.f33895($ic20$), $g2409$.getGlobalValue(), (SubLObject)UNPROVIDED));
        return $g2412$.getGlobalValue();
    }
    
    public static SubLObject f14764(final SubLObject var1) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.gethash_without_values(var1, $g2412$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14765(final SubLObject var1, final SubLObject var51) {
        assert NIL != module0173.f10955(var1) : var1;
        return Hashtables.sethash(var1, $g2412$.getGlobalValue(), var51);
    }
    
    public static SubLObject f14766(final SubLObject var1) {
        Hashtables.remhash(var1, $g2412$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f14767(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var2 = f14764(var1);
            if (NIL != var2) {
                return var2;
            }
            return f14768(var1);
        }
        else {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic3$), module0132.$g1555$.getGlobalValue())) {
                return f14767(module0172.f10921(var1));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f14744() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != $g2412$.getGlobalValue()) {
            Hashtables.clrhash($g2412$.getGlobalValue());
        }
        else {
            f14763();
        }
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)$ic13$, var4);
            module0147.$g2095$.bind($ic14$, var4);
            final SubLObject var7 = $ic24$;
            if (NIL != module0158.f10038(var7)) {
                final SubLObject var8 = (SubLObject)NIL;
                final SubLObject var9_53 = module0012.$g73$.currentBinding(var4);
                final SubLObject var10_54 = module0012.$g65$.currentBinding(var4);
                final SubLObject var9 = module0012.$g67$.currentBinding(var4);
                final SubLObject var10 = module0012.$g68$.currentBinding(var4);
                final SubLObject var11 = module0012.$g66$.currentBinding(var4);
                final SubLObject var12 = module0012.$g69$.currentBinding(var4);
                final SubLObject var13 = module0012.$g70$.currentBinding(var4);
                final SubLObject var14 = module0012.$silent_progressP$.currentBinding(var4);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var4);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
                    module0012.$g70$.bind((SubLObject)T, var4);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var8) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
                    module0012.f474(var8);
                    final SubLObject var15 = module0158.f10039(var7);
                    SubLObject var16 = (SubLObject)NIL;
                    final SubLObject var17 = (SubLObject)NIL;
                    while (NIL == var16) {
                        final SubLObject var18 = module0052.f3695(var15, var17);
                        final SubLObject var19 = (SubLObject)makeBoolean(!var17.eql(var18));
                        if (NIL != var19) {
                            module0012.f476();
                            SubLObject var20 = (SubLObject)NIL;
                            try {
                                var20 = module0158.f10316(var18, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                SubLObject var21_55 = (SubLObject)NIL;
                                final SubLObject var22_56 = (SubLObject)NIL;
                                while (NIL == var21_55) {
                                    final SubLObject var21 = module0052.f3695(var20, var22_56);
                                    final SubLObject var24_57 = (SubLObject)makeBoolean(!var22_56.eql(var21));
                                    if (NIL != var24_57) {
                                        f14769(var21);
                                    }
                                    var21_55 = (SubLObject)makeBoolean(NIL == var24_57);
                                }
                            }
                            finally {
                                final SubLObject var9_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                    if (NIL != var20) {
                                        module0158.f10319(var20);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var9_54, var4);
                                }
                            }
                        }
                        var16 = (SubLObject)makeBoolean(NIL == var19);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var14, var4);
                    module0012.$g70$.rebind(var13, var4);
                    module0012.$g69$.rebind(var12, var4);
                    module0012.$g66$.rebind(var11, var4);
                    module0012.$g68$.rebind(var10, var4);
                    module0012.$g67$.rebind(var9, var4);
                    module0012.$g65$.rebind(var10_54, var4);
                    module0012.$g73$.rebind(var9_53, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return Hashtables.hash_table_count($g2412$.getGlobalValue());
    }
    
    public static SubLObject f14769(final SubLObject var28) {
        final SubLObject var29 = module0178.f11334(var28);
        if (NIL != module0173.f10955(var29)) {
            final SubLObject var30 = module0178.f11335(var28);
            return f14770(var29, var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14768(final SubLObject var1) {
        final SubLObject var2 = module0220.f14556(var1, $ic24$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        return f14770(var1, var2);
    }
    
    public static SubLObject f14770(final SubLObject var1, SubLObject var51) {
        var51 = f14748(var51);
        assert NIL != Types.integerp(var51) : var51;
        f14765(var1, var51);
        return var51;
    }
    
    public static SubLObject f14771(final SubLObject var1, SubLObject var51) {
        var51 = f14748(var51);
        assert NIL != Types.integerp(var51) : var51;
        final SubLObject var52 = f14767(var1);
        if (NIL != var52 && !var52.eql(var51)) {
            Errors.error((SubLObject)$ic25$, var1, var52, var51);
        }
        f14765(var1, var51);
        return var51;
    }
    
    public static SubLObject f14772(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = $ic24$;
        if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var3)) {
            final SubLObject var4 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var3);
            SubLObject var5 = var2;
            final SubLObject var6 = (SubLObject)NIL;
            while (NIL == var5) {
                final SubLObject var7 = module0052.f3695(var4, var6);
                final SubLObject var8 = (SubLObject)makeBoolean(!var6.eql(var7));
                if (NIL != var8) {
                    SubLObject var9 = (SubLObject)NIL;
                    try {
                        var9 = module0158.f10316(var7, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                        SubLObject var21_59 = var2;
                        final SubLObject var22_60 = (SubLObject)NIL;
                        while (NIL == var21_59) {
                            final SubLObject var10 = module0052.f3695(var9, var22_60);
                            final SubLObject var24_61 = (SubLObject)makeBoolean(!var22_60.eql(var10));
                            if (NIL != var24_61) {
                                var2 = module0226.f15088(var10, (SubLObject)$ic16$);
                            }
                            var21_59 = (SubLObject)makeBoolean(NIL == var24_61 || NIL != var2);
                        }
                    }
                    finally {
                        final SubLObject var11 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var9) {
                                module0158.f10319(var9);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var11);
                        }
                    }
                }
                var5 = (SubLObject)makeBoolean(NIL == var8 || NIL != var2);
            }
        }
        if (NIL == var2) {
            f14766(var1);
        }
        return var1;
    }
    
    public static SubLObject f14773(final SubLObject var1) {
        final SubLObject var2 = f14739(var1);
        if (NIL != var2) {
            return var2;
        }
        return f14767(var1);
    }
    
    public static SubLObject f14774(final SubLObject var1, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        final SubLObject var63 = f14739(var1);
        if (var63.isInteger()) {
            return Numbers.numE(var63, var62);
        }
        if (NIL != f14775(var1)) {
            final SubLObject var64 = f14755(var1);
            final SubLObject var65 = f14767(var1);
            return (SubLObject)makeBoolean((NIL == var64 || var62.numGE(var64)) && (NIL == var65 || var62.numLE(var65)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14776(final SubLObject var63, final SubLObject var62) {
        SubLObject var64 = var63;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            if (NIL != f14774(var65, var62)) {
                return (SubLObject)T;
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14777(final SubLObject var1, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        final SubLObject var63 = f14739(var1);
        if (var63.isInteger()) {
            return Numbers.numGE(var63, var62);
        }
        if (NIL != f14775(var1)) {
            final SubLObject var64 = f14767(var1);
            return (SubLObject)makeBoolean(NIL == var64 || var62.numLE(var64));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14778(final SubLObject var1, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        final SubLObject var63 = f14739(var1);
        if (var63.isInteger()) {
            return Numbers.numG(var63, var62);
        }
        if (NIL != f14775(var1)) {
            final SubLObject var64 = f14767(var1);
            return (SubLObject)makeBoolean(NIL == var64 || var62.numL(var64));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14779(final SubLObject var1, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        final SubLObject var63 = f14739(var1);
        if (var63.isInteger()) {
            return Numbers.numLE(var63, var62);
        }
        if (NIL != f14775(var1)) {
            final SubLObject var64 = f14755(var1);
            return (SubLObject)makeBoolean(NIL == var64 || var62.numGE(var64));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14780(final SubLObject var1, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        final SubLObject var63 = f14739(var1);
        if (var63.isInteger()) {
            return Numbers.numL(var63, var62);
        }
        if (NIL != f14775(var1)) {
            final SubLObject var64 = f14755(var1);
            return (SubLObject)makeBoolean(NIL == var64 || var62.numG(var64));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14781(final SubLObject var1) {
        return Equality.eql(f14739(var1), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f14782(final SubLObject var65) {
        if (var65.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var65.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        return var65;
    }
    
    public static SubLObject f14783(final SubLObject var67) {
        if (NIL != module0202.f12611(var67)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL != module0202.f12612(var67)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (NIL != module0202.f12613(var67)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (NIL != module0202.f12614(var67)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (NIL != module0202.f12615(var67)) {
            return (SubLObject)FIVE_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14775(final SubLObject var1) {
        return module0269.f17808(var1, module0132.$g1555$.getGlobalValue());
    }
    
    public static SubLObject f14784(final SubLObject var1) {
        assert NIL != module0269.f17734(var1) : var1;
        if (NIL != module0269.f17721(var1)) {
            final SubLObject var2 = f14773(var1);
            final SubLObject var3 = f14762(var1);
            SubLObject var4 = (SubLObject)NIL;
            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic21$, var1, var3), var4);
            if (NIL != var2) {
                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic24$, var1, var2), var4);
            }
            return Sequences.nreverse(var4);
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic8$, var1, f14739(var1)));
    }
    
    public static SubLObject f14785() {
        return Types.sublisp_null($g2410$.getGlobalValue());
    }
    
    public static SubLObject f14786() {
        return f14741();
    }
    
    public static SubLObject f14787(final SubLObject var71) {
        module0021.f1038($g2410$.getGlobalValue(), var71);
        module0021.f1038($g2411$.getGlobalValue(), var71);
        module0021.f1038($g2412$.getGlobalValue(), var71);
        module0021.f1038((SubLObject)NIL, var71);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14788(final SubLObject var71) {
        SubLObject var72 = (SubLObject)NIL;
        $g2410$.setGlobalValue(module0021.f1060(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2411$.setGlobalValue(module0021.f1060(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2412$.setGlobalValue(module0021.f1060(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        var72 = module0021.f1060(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14789() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14735", "S#17519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14736", "S#17520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14737", "S#17521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14738", "S#17522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14739", "ARITY", 1, 0, false);
        new $f14739$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14740", "S#17523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14741", "S#17524", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14742", "S#17525", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14745", "S#17526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14747", "S#17527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14746", "S#17528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14748", "S#17529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14749", "S#17530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14750", "S#17531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14751", "S#17532", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14752", "S#17533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14753", "S#17534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14754", "S#17535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14755", "S#17536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14756", "S#17537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14743", "S#17538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14758", "S#17539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14757", "S#17540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14759", "S#17541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14760", "S#17542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14761", "S#17543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14762", "S#17544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14763", "S#17545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14764", "S#17546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14765", "S#17547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14766", "S#17548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14767", "S#17549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14744", "S#17550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14769", "S#17551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14768", "S#17552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14770", "S#17553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14771", "S#17554", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14772", "S#17555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14773", "S#17556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14774", "S#17557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14776", "S#17558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14777", "S#17559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14778", "S#17560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14779", "S#17561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14780", "S#17562", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14781", "S#17398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14782", "S#17399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14783", "S#17563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14775", "S#17564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14784", "S#17565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14785", "S#16690", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14786", "S#16691", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14787", "S#17566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0225", "f14788", "S#17567", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14790() {
        $g2409$ = SubLFiles.deflexical("S#17568", Symbols.symbol_function((SubLObject)EQL));
        $g2410$ = SubLFiles.deflexical("S#17569", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2410$.getGlobalValue() : NIL));
        $g2411$ = SubLFiles.deflexical("S#17570", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g2411$.getGlobalValue() : NIL));
        $g2412$ = SubLFiles.deflexical("S#17571", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic23$)) ? $g2412$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14791() {
        module0003.f57((SubLObject)$ic0$);
        module0012.f368((SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic19$);
        module0003.f57((SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f14789();
    }
    
    public void initializeVariables() {
        f14790();
    }
    
    public void runTopLevelForms() {
        f14791();
    }
    
    static {
        me = (SubLFile)new module0225();
        $g2409$ = null;
        $g2410$ = null;
        $g2411$ = null;
        $g2412$ = null;
        $ic0$ = makeSymbol("S#17569", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic2$ = makeSymbol("FORT-P");
        $ic3$ = makeSymbol("S#12629", "CYC");
        $ic4$ = makeSymbol("ARITY");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"));
        $ic6$ = makeString("Return the arity for relation constant RELATION.");
        $ic7$ = makeSymbol("?X");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("arity"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("?X"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)NIL);
        $ic12$ = makeString("Initializing all arities...");
        $ic13$ = makeSymbol("S#12274", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic15$ = makeKeyword("GAF");
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeSymbol("INTEGERP");
        $ic18$ = makeString("Trying to overload arity for ~A from ~A to ~A");
        $ic19$ = makeSymbol("S#17570", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("VariableArityRelation"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("arityMin"));
        $ic22$ = makeString("Trying to overload arityMin for ~A from ~A to ~A");
        $ic23$ = makeSymbol("S#17571", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("arityMax"));
        $ic25$ = makeString("Trying to overload arityMax for ~A from ~A to ~A");
        $ic26$ = makeSymbol("RELATION-P");
    }
    
    public static final class $f14739$UnaryFunction extends UnaryFunction
    {
        public $f14739$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ARITY"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f14739(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 440 ms
	
	Decompiled with Procyon 0.5.32.
*/