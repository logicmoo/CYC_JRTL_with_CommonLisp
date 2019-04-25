package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0315 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0315";
    public static final String myFingerPrint = "b753115119880742b6b17becdd2cc8fb58ca512b4fa1c02baf5a31c2d4a4c982";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLString $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLString $ic131$;
    private static final SubLInteger $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    
    public static SubLObject f21257(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic2$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21258(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_11 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_12 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21167(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_12, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_11, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21259(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic14$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21260(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f21261(f21258(var2, var3), var3);
    }
    
    public static SubLObject f21262(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic17$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21263(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_15 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_16 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21167(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_16, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_15, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21264(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic22$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21265(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f21266(f21263(var2, var3), var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21267(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic25$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21268(final SubLObject var2, SubLObject var3, SubLObject var17) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic12$;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = var3;
        final SubLObject var21 = module0147.$g2095$.currentBinding(var18);
        final SubLObject var22 = module0147.$g2094$.currentBinding(var18);
        final SubLObject var23 = module0147.$g2096$.currentBinding(var18);
        try {
            module0147.$g2095$.bind(module0147.f9545(var20), var18);
            module0147.$g2094$.bind(module0147.f9546(var20), var18);
            module0147.$g2096$.bind(module0147.f9549(var20), var18);
            SubLObject var24 = (SubLObject)NIL;
            try {
                var18.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var18) && NIL == module0145.$g1942$.getDynamicValue(var18) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var18)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var18) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_19 = module0145.$g1895$.currentBinding(var18);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var18);
                    assert NIL != module0130.f8511(var17) : var17;
                    final SubLObject var7_20 = module0145.$g1897$.currentBinding(var18);
                    try {
                        module0145.$g1897$.bind(var17, var18);
                        var19 = Sequences.remove(var2, f21261(module0314.f21174(var2), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_20, var18);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_19, var18);
                }
            }
            catch (Throwable var25) {
                var24 = Errors.handleThrowable(var25, (SubLObject)$ic8$);
            }
            finally {
                var18.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var23, var18);
            module0147.$g2094$.rebind(var22, var18);
            module0147.$g2095$.rebind(var21, var18);
        }
        return var19;
    }
    
    public static SubLObject f21269(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic28$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21270(final SubLObject var2, SubLObject var3, SubLObject var17) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic12$;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = var3;
        final SubLObject var21 = module0147.$g2095$.currentBinding(var18);
        final SubLObject var22 = module0147.$g2094$.currentBinding(var18);
        final SubLObject var23 = module0147.$g2096$.currentBinding(var18);
        try {
            module0147.$g2095$.bind(module0147.f9545(var20), var18);
            module0147.$g2094$.bind(module0147.f9546(var20), var18);
            module0147.$g2096$.bind(module0147.f9549(var20), var18);
            SubLObject var24 = (SubLObject)NIL;
            try {
                var18.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var18) && NIL == module0145.$g1942$.getDynamicValue(var18) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var18)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var18) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_22 = module0145.$g1895$.currentBinding(var18);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var18);
                    assert NIL != module0130.f8511(var17) : var17;
                    final SubLObject var7_23 = module0145.$g1897$.currentBinding(var18);
                    try {
                        module0145.$g1897$.bind(var17, var18);
                        var19 = Sequences.remove(var2, f21266(module0314.f21174(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_23, var18);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_22, var18);
                }
            }
            catch (Throwable var25) {
                var24 = Errors.handleThrowable(var25, (SubLObject)$ic8$);
            }
            finally {
                var18.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var23, var18);
            module0147.$g2094$.rebind(var22, var18);
            module0147.$g2095$.rebind(var21, var18);
        }
        return var19;
    }
    
    public static SubLObject f21271(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic31$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21272(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_25 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var4);
                    final SubLObject var11 = module0314.f21167(var2);
                    var5 = conses_high.set_difference(var11, f21261(var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0145.$g1895$.rebind(var7_25, var4);
                }
            }
            catch (Throwable var12) {
                var10 = Errors.handleThrowable(var12, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21273(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic34$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21274(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_26 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var4);
                    final SubLObject var11 = module0314.f21167(var2);
                    var5 = conses_high.set_difference(var11, f21266(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0145.$g1895$.rebind(var7_26, var4);
                }
            }
            catch (Throwable var12) {
                var10 = Errors.handleThrowable(var12, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21275(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic37$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21276(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_27 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_28 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21176(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_28, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_27, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21277(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic40$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21278(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_29 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_30 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21176(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_30, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_29, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21279(final SubLObject var1, final SubLObject var31, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic43$, var31, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21280(final SubLObject var31, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = var3;
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var37 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2095$.bind(module0147.f9545(var34), var32);
            module0147.$g2094$.bind(module0147.f9546(var34), var32);
            module0147.$g2096$.bind(module0147.f9549(var34), var32);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var32) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
            }
            final SubLObject var7_32 = module0145.$g1895$.currentBinding(var32);
            try {
                module0145.$g1895$.bind((SubLObject)$ic21$, var32);
                assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                final SubLObject var7_33 = module0145.$g1897$.currentBinding(var32);
                try {
                    module0145.$g1897$.bind((SubLObject)$ic12$, var32);
                    SubLObject var38 = var31;
                    SubLObject var39 = (SubLObject)NIL;
                    var39 = var38.first();
                    while (NIL != var38) {
                        module0314.f21242(var39);
                        var38 = var38.rest();
                        var39 = var38.first();
                    }
                }
                finally {
                    module0145.$g1897$.rebind(var7_33, var32);
                }
            }
            finally {
                module0145.$g1895$.rebind(var7_32, var32);
            }
        }
        finally {
            module0147.$g2096$.rebind(var37, var32);
            module0147.$g2094$.rebind(var36, var32);
            module0147.$g2095$.rebind(var35, var32);
        }
        var33 = module0030.f1625(module0145.$g1924$.getDynamicValue(var32));
        return var33;
    }
    
    public static SubLObject f21281(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic44$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21282(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic47$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic48$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic48$);
                }
                final SubLObject var7_36 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic48$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_37 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0035.f2272(module0314.f21176(var2));
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_37, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_36, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21283(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic49$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21284(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_38 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_39 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21178(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_39, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_38, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21285(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic52$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21286(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_40 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_41 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21178(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_41, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_40, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21287(final SubLObject var1, final SubLObject var2, final SubLObject var42, SubLObject var43, SubLObject var3) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)$ic55$);
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        assert NIL != Types.function_spec_p(var42) : var42;
        return module0316.f21362(var1, (SubLObject)$ic57$, var2, var42, var43, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21288(final SubLObject var2, final SubLObject var42, SubLObject var43, SubLObject var3) {
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)$ic55$);
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = var3;
        final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
        final SubLObject var48 = module0147.$g2094$.currentBinding(var44);
        final SubLObject var49 = module0147.$g2096$.currentBinding(var44);
        try {
            module0147.$g2095$.bind(module0147.f9545(var46), var44);
            module0147.$g2094$.bind(module0147.f9546(var46), var44);
            module0147.$g2096$.bind(module0147.f9549(var46), var44);
            SubLObject var50 = (SubLObject)NIL;
            try {
                var44.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var44) && NIL == module0145.$g1942$.getDynamicValue(var44) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var44)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var44) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_45 = module0145.$g1895$.currentBinding(var44);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var44);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_46 = module0145.$g1897$.currentBinding(var44);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var44);
                        var45 = module0314.f21188(var2, var42, var43);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_46, var44);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_45, var44);
                }
            }
            catch (Throwable var51) {
                var50 = Errors.handleThrowable(var51, (SubLObject)$ic8$);
            }
            finally {
                var44.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var49, var44);
            module0147.$g2094$.rebind(var48, var44);
            module0147.$g2095$.rebind(var47, var44);
        }
        return var45;
    }
    
    public static SubLObject f21289(final SubLObject var1, final SubLObject var2, final SubLObject var42, SubLObject var43, SubLObject var3) {
        if (var43 == UNPROVIDED) {
            var43 = module0145.$g1908$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        assert NIL != Types.function_spec_p(var42) : var42;
        return module0316.f21362(var1, (SubLObject)$ic62$, var2, var42, var43, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21290(final SubLObject var2, final SubLObject var42, SubLObject var43, SubLObject var3) {
        if (var43 == UNPROVIDED) {
            var43 = module0145.$g1908$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = var3;
        final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
        final SubLObject var48 = module0147.$g2094$.currentBinding(var44);
        final SubLObject var49 = module0147.$g2096$.currentBinding(var44);
        try {
            module0147.$g2095$.bind(module0147.f9545(var46), var44);
            module0147.$g2094$.bind(module0147.f9546(var46), var44);
            module0147.$g2096$.bind(module0147.f9549(var46), var44);
            SubLObject var50 = (SubLObject)NIL;
            try {
                var44.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var44) && NIL == module0145.$g1942$.getDynamicValue(var44) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var44)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var44) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_47 = module0145.$g1895$.currentBinding(var44);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var44);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_48 = module0145.$g1897$.currentBinding(var44);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var44);
                        var45 = module0314.f21188(var2, var42, var43);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_48, var44);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_47, var44);
                }
            }
            catch (Throwable var51) {
                var50 = Errors.handleThrowable(var51, (SubLObject)$ic8$);
            }
            finally {
                var44.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var49, var44);
            module0147.$g2094$.rebind(var48, var44);
            module0147.$g2095$.rebind(var47, var44);
        }
        return var45;
    }
    
    public static SubLObject f21291(final SubLObject var1, final SubLObject var2, final SubLObject var49, SubLObject var50, SubLObject var51, SubLObject var3) {
        if (var50 == UNPROVIDED) {
            var50 = module0145.$g1912$.getDynamicValue();
        }
        if (var51 == UNPROVIDED) {
            var51 = module0145.$g1913$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        assert NIL != module0269.f17715(var49) : var49;
        return module0316.f21362(var1, (SubLObject)$ic67$, var2, var49, var50, var51, var3);
    }
    
    public static SubLObject f21292(final SubLObject var2, final SubLObject var52, SubLObject var50, SubLObject var51, SubLObject var3) {
        if (var50 == UNPROVIDED) {
            var50 = module0145.$g1912$.getDynamicValue();
        }
        if (var51 == UNPROVIDED) {
            var51 = module0145.$g1913$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        final SubLObject var55 = var3;
        final SubLObject var56 = module0147.$g2095$.currentBinding(var53);
        final SubLObject var57 = module0147.$g2094$.currentBinding(var53);
        final SubLObject var58 = module0147.$g2096$.currentBinding(var53);
        try {
            module0147.$g2095$.bind(module0147.f9545(var55), var53);
            module0147.$g2094$.bind(module0147.f9546(var55), var53);
            module0147.$g2096$.bind(module0147.f9549(var55), var53);
            SubLObject var59 = (SubLObject)NIL;
            try {
                var53.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var53) && NIL == module0145.$g1942$.getDynamicValue(var53) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var53)) {
                    module0313.f21154(var2, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_53 = module0145.$g1895$.currentBinding(var53);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var53);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_54 = module0145.$g1897$.currentBinding(var53);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var53);
                        assert NIL != Types.fixnump(var50) : var50;
                        final SubLObject var7_55 = module0145.$g1912$.currentBinding(var53);
                        try {
                            module0145.$g1912$.bind(var50, var53);
                            assert NIL != Types.fixnump(var51) : var51;
                            final SubLObject var7_56 = module0145.$g1913$.currentBinding(var53);
                            try {
                                module0145.$g1913$.bind(var51, var53);
                                var54 = module0314.f21200(var2, var52);
                            }
                            finally {
                                module0145.$g1913$.rebind(var7_56, var53);
                            }
                        }
                        finally {
                            module0145.$g1912$.rebind(var7_55, var53);
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_54, var53);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_53, var53);
                }
            }
            catch (Throwable var60) {
                var59 = Errors.handleThrowable(var60, (SubLObject)$ic8$);
            }
            finally {
                var53.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var58, var53);
            module0147.$g2094$.rebind(var57, var53);
            module0147.$g2095$.rebind(var56, var53);
        }
        return var54;
    }
    
    public static SubLObject f21293(final SubLObject var1, final SubLObject var2, final SubLObject var49, SubLObject var50, SubLObject var51, SubLObject var3) {
        if (var50 == UNPROVIDED) {
            var50 = module0145.$g1912$.getDynamicValue();
        }
        if (var51 == UNPROVIDED) {
            var51 = module0145.$g1913$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        assert NIL != module0269.f17715(var49) : var49;
        return module0316.f21362(var1, (SubLObject)$ic73$, var2, var49, var50, var51, var3);
    }
    
    public static SubLObject f21294(final SubLObject var2, final SubLObject var52, SubLObject var50, SubLObject var51, SubLObject var3) {
        if (var50 == UNPROVIDED) {
            var50 = module0145.$g1912$.getDynamicValue();
        }
        if (var51 == UNPROVIDED) {
            var51 = module0145.$g1913$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        final SubLObject var55 = var3;
        final SubLObject var56 = module0147.$g2095$.currentBinding(var53);
        final SubLObject var57 = module0147.$g2094$.currentBinding(var53);
        final SubLObject var58 = module0147.$g2096$.currentBinding(var53);
        try {
            module0147.$g2095$.bind(module0147.f9545(var55), var53);
            module0147.$g2094$.bind(module0147.f9546(var55), var53);
            module0147.$g2096$.bind(module0147.f9549(var55), var53);
            SubLObject var59 = (SubLObject)NIL;
            try {
                var53.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var53) && NIL == module0145.$g1942$.getDynamicValue(var53) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var53)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_57 = module0145.$g1895$.currentBinding(var53);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var53);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_58 = module0145.$g1897$.currentBinding(var53);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var53);
                        assert NIL != Types.fixnump(var50) : var50;
                        final SubLObject var7_59 = module0145.$g1912$.currentBinding(var53);
                        try {
                            module0145.$g1912$.bind(var50, var53);
                            assert NIL != Types.fixnump(var51) : var51;
                            final SubLObject var7_60 = module0145.$g1913$.currentBinding(var53);
                            try {
                                module0145.$g1913$.bind(var51, var53);
                                var54 = module0314.f21200(var2, var52);
                            }
                            finally {
                                module0145.$g1913$.rebind(var7_60, var53);
                            }
                        }
                        finally {
                            module0145.$g1912$.rebind(var7_59, var53);
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_58, var53);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_57, var53);
                }
            }
            catch (Throwable var60) {
                var59 = Errors.handleThrowable(var60, (SubLObject)$ic8$);
            }
            finally {
                var53.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var58, var53);
            module0147.$g2094$.rebind(var57, var53);
            module0147.$g2095$.rebind(var56, var53);
        }
        return var54;
    }
    
    public static SubLObject f21295(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic76$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21296(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var4) && NIL == module0145.$g1942$.getDynamicValue(var4) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var4)) {
                    module0313.f21154(var2, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_61 = module0145.$g1895$.currentBinding(var4);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var4);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_62 = module0145.$g1897$.currentBinding(var4);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var4);
                        var5 = module0314.f21192(var2);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_62, var4);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_61, var4);
                }
            }
            catch (Throwable var11) {
                var10 = Errors.handleThrowable(var11, (SubLObject)$ic8$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f21297(final SubLObject var1, final SubLObject var63, final SubLObject var64, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic79$, var63, var64, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21298(final SubLObject var63, final SubLObject var64, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = var3;
        final SubLObject var70 = module0147.$g2095$.currentBinding(var65);
        final SubLObject var71 = module0147.$g2094$.currentBinding(var65);
        final SubLObject var72 = module0147.$g2096$.currentBinding(var65);
        try {
            module0147.$g2095$.bind(module0147.f9545(var69), var65);
            module0147.$g2094$.bind(module0147.f9546(var69), var65);
            module0147.$g2096$.bind(module0147.f9549(var69), var65);
            final SubLObject var73 = module0145.$g1891$.getDynamicValue(var65);
            if (var73.eql((SubLObject)ONE_INTEGER)) {
                var67 = var63;
                var68 = var64;
            }
            else if (var73.eql((SubLObject)TWO_INTEGER)) {
                var67 = var64;
                var68 = var63;
            }
            SubLObject var74 = (SubLObject)NIL;
            try {
                var65.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var65) && NIL == module0145.$g1942$.getDynamicValue(var65) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var65)) {
                    module0313.f21154(var68, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var65) && NIL == module0145.$g1942$.getDynamicValue(var65) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var65)) {
                    module0313.f21154(var67, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (var63.eql(var64) && NIL != module0226.f14795(module0145.$g1888$.getDynamicValue(var65))) {
                    var66 = (SubLObject)T;
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var65) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                        Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                    }
                    final SubLObject var7_68 = module0145.$g1895$.currentBinding(var65);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic10$, var65);
                        assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                        final SubLObject var7_69 = module0145.$g1897$.currentBinding(var65);
                        try {
                            module0145.$g1897$.bind((SubLObject)$ic12$, var65);
                            var66 = module0314.f21180(var67, var68, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0145.$g1897$.rebind(var7_69, var65);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var7_68, var65);
                    }
                }
            }
            catch (Throwable var75) {
                var74 = Errors.handleThrowable(var75, (SubLObject)$ic8$);
            }
            finally {
                var65.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var72, var65);
            module0147.$g2094$.rebind(var71, var65);
            module0147.$g2095$.rebind(var70, var65);
        }
        return var66;
    }
    
    public static SubLObject f21299(final SubLObject var1, final SubLObject var70, final SubLObject var71, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic80$, var70, var71, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21300(final SubLObject var72, final SubLObject var73, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)NIL;
        final SubLObject var76 = var3;
        final SubLObject var77 = module0147.$g2095$.currentBinding(var74);
        final SubLObject var78 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var79 = module0147.$g2096$.currentBinding(var74);
        try {
            module0147.$g2095$.bind(module0147.f9545(var76), var74);
            module0147.$g2094$.bind(module0147.f9546(var76), var74);
            module0147.$g2096$.bind(module0147.f9549(var76), var74);
            SubLObject var80 = (SubLObject)NIL;
            try {
                var74.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var73, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var72, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (var72.eql(var73) && NIL != module0226.f14795(module0145.$g1888$.getDynamicValue(var74))) {
                    var75 = (SubLObject)T;
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                        Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                    }
                    final SubLObject var7_75 = module0145.$g1895$.currentBinding(var74);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic10$, var74);
                        assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                        final SubLObject var7_76 = module0145.$g1897$.currentBinding(var74);
                        try {
                            module0145.$g1897$.bind((SubLObject)$ic12$, var74);
                            var75 = module0314.f21180(var73, var72, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0145.$g1897$.rebind(var7_76, var74);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var7_75, var74);
                    }
                }
            }
            catch (Throwable var81) {
                var80 = Errors.handleThrowable(var81, (SubLObject)$ic8$);
            }
            finally {
                var74.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var79, var74);
            module0147.$g2094$.rebind(var78, var74);
            module0147.$g2095$.rebind(var77, var74);
        }
        return var75;
    }
    
    public static SubLObject f21301(final SubLObject var1, final SubLObject var70, final SubLObject var71, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var70) : var70;
        assert NIL != module0313.f21137(var71) : var71;
        return module0316.f21362(var1, (SubLObject)$ic81$, var70, var71, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21302(final SubLObject var77) {
        return module0205.f13136(f21303(var77));
    }
    
    public static SubLObject f21303(final SubLObject var77) {
        if (NIL != assertion_handles_oc.f11035(var77)) {
            return module0178.f11303(var77);
        }
        if (NIL != module0191.f11952(var77)) {
            return module0191.f11967(var77);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21304(final SubLObject var72, final SubLObject var73, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)NIL;
        final SubLObject var76 = var3;
        final SubLObject var77 = module0147.$g2095$.currentBinding(var74);
        final SubLObject var78 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var79 = module0147.$g2096$.currentBinding(var74);
        try {
            module0147.$g2095$.bind(module0147.f9545(var76), var74);
            module0147.$g2094$.bind(module0147.f9546(var76), var74);
            module0147.$g2096$.bind(module0147.f9549(var76), var74);
            SubLObject var80 = (SubLObject)NIL;
            try {
                var74.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var73, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var72, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (var72.eql(var73) && NIL != module0226.f14795(module0145.$g1888$.getDynamicValue(var74))) {
                    var75 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic87$, module0202.f12768(module0145.$g1888$.getDynamicValue(var74), var73, var72), var3, (SubLObject)UNPROVIDED));
                }
                else if (NIL != module0145.$g1915$.getDynamicValue(var74)) {
                    final SubLObject var81 = module0314.f21203(var73, var72);
                    SubLObject var82 = (SubLObject)NIL;
                    SubLObject var83 = (SubLObject)NIL;
                    SubLObject var84 = (SubLObject)NIL;
                    var82 = var81;
                    var83 = var82.first();
                    for (var84 = (SubLObject)ZERO_INTEGER; NIL != var82; var82 = var82.rest(), var83 = var82.first(), var84 = Numbers.add((SubLObject)ONE_INTEGER, var84)) {
                        var75 = (SubLObject)ConsesLow.cons(var83, var75);
                        final SubLObject var85 = f21303(var83);
                        final SubLObject var86 = module0205.f13136(var85);
                        if (!module0145.$g1888$.getDynamicValue(var74).eql(var86)) {
                            final SubLObject var87 = module0205.f13204(var85, (SubLObject)UNPROVIDED);
                            if (var84.isZero()) {
                                if (var87.eql(var72)) {
                                    final SubLObject var88 = module0191.f11990((SubLObject)$ic88$, module0202.f12768($ic89$, var86, module0145.$g1888$.getDynamicValue(var74)), var3, (SubLObject)UNPROVIDED);
                                    if (NIL == conses_high.member(var88, var75, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var75 = (SubLObject)ConsesLow.cons(var88, var75);
                                    }
                                }
                                else {
                                    final SubLObject var88 = module0191.f11990((SubLObject)$ic88$, module0202.f12768($ic90$, var86, module0145.$g1888$.getDynamicValue(var74)), var3, (SubLObject)UNPROVIDED);
                                    if (NIL == conses_high.member(var88, var75, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var75 = (SubLObject)ConsesLow.cons(var88, var75);
                                    }
                                }
                            }
                            else {
                                final SubLObject var89 = f21303(ConsesLow.nth(Numbers.subtract(var84, (SubLObject)ONE_INTEGER), var81));
                                final SubLObject var90 = module0205.f13204(var89, (SubLObject)UNPROVIDED);
                                if (var87.eql(var90)) {
                                    final SubLObject var91 = module0191.f11990((SubLObject)$ic88$, module0202.f12768($ic89$, var86, module0145.$g1888$.getDynamicValue(var74)), var3, (SubLObject)UNPROVIDED);
                                    if (NIL == conses_high.member(var91, var75, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var75 = (SubLObject)ConsesLow.cons(var91, var75);
                                    }
                                }
                                else {
                                    final SubLObject var91 = module0191.f11990((SubLObject)$ic88$, module0202.f12768($ic90$, var86, module0145.$g1888$.getDynamicValue(var74)), var3, (SubLObject)UNPROVIDED);
                                    if (NIL == conses_high.member(var91, var75, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var75 = (SubLObject)ConsesLow.cons(var91, var75);
                                    }
                                }
                            }
                        }
                    }
                    var75 = Sequences.nreverse(var75);
                }
                else {
                    var75 = module0314.f21203(var73, var72);
                }
            }
            catch (Throwable var92) {
                var80 = Errors.handleThrowable(var92, (SubLObject)$ic8$);
            }
            finally {
                var74.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var79, var74);
            module0147.$g2094$.rebind(var78, var74);
            module0147.$g2095$.rebind(var77, var74);
        }
        return var75;
    }
    
    public static SubLObject f21305(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic91$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21306(final SubLObject var73, final SubLObject var72, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f21300(var72, var73, var3);
    }
    
    public static SubLObject f21307(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var71) : var71;
        assert NIL != module0313.f21137(var70) : var70;
        return module0316.f21362(var1, (SubLObject)$ic92$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21308(final SubLObject var73, final SubLObject var72, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f21300(var72, var73, var3);
    }
    
    public static SubLObject f21309(final SubLObject var1, final SubLObject var70, final SubLObject var71, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var70) : var70;
        assert NIL != module0313.f21137(var71) : var71;
        return module0316.f21362(var1, (SubLObject)$ic92$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21310(final SubLObject var72, final SubLObject var73, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f21300(var72, var73, var3);
    }
    
    public static SubLObject f21311(final SubLObject var1, final SubLObject var72, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic100$, var72, var87, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21312(final SubLObject var72, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var88 = SubLProcess.currentSubLThread();
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = var3;
        final SubLObject var91 = module0147.$g2095$.currentBinding(var88);
        final SubLObject var92 = module0147.$g2094$.currentBinding(var88);
        final SubLObject var93 = module0147.$g2096$.currentBinding(var88);
        try {
            module0147.$g2095$.bind(module0147.f9545(var90), var88);
            module0147.$g2094$.bind(module0147.f9546(var90), var88);
            module0147.$g2096$.bind(module0147.f9549(var90), var88);
            SubLObject var94 = (SubLObject)NIL;
            try {
                var88.throwStack.push($ic8$);
                if (NIL != Functions.funcall(var87, var72)) {
                    var89 = (SubLObject)T;
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var88) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                        Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                    }
                    final SubLObject var7_88 = module0145.$g1895$.currentBinding(var88);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic21$, var88);
                        assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                        final SubLObject var7_89 = module0145.$g1897$.currentBinding(var88);
                        try {
                            module0145.$g1897$.bind((SubLObject)$ic12$, var88);
                            var89 = module0314.f21183(var72, var87);
                        }
                        finally {
                            module0145.$g1897$.rebind(var7_89, var88);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var7_88, var88);
                    }
                }
            }
            catch (Throwable var95) {
                var94 = Errors.handleThrowable(var95, (SubLObject)$ic8$);
            }
            finally {
                var88.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var93, var88);
            module0147.$g2094$.rebind(var92, var88);
            module0147.$g2095$.rebind(var91, var88);
        }
        return var89;
    }
    
    public static SubLObject f21313(final SubLObject var1, final SubLObject var73, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic101$, var73, var87, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21314(final SubLObject var73, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var88 = SubLProcess.currentSubLThread();
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = var3;
        final SubLObject var91 = module0147.$g2095$.currentBinding(var88);
        final SubLObject var92 = module0147.$g2094$.currentBinding(var88);
        final SubLObject var93 = module0147.$g2096$.currentBinding(var88);
        try {
            module0147.$g2095$.bind(module0147.f9545(var90), var88);
            module0147.$g2094$.bind(module0147.f9546(var90), var88);
            module0147.$g2096$.bind(module0147.f9549(var90), var88);
            SubLObject var94 = (SubLObject)NIL;
            try {
                var88.throwStack.push($ic8$);
                if (NIL != Functions.funcall(var87, var73)) {
                    var89 = (SubLObject)T;
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var88) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                        Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                    }
                    final SubLObject var7_90 = module0145.$g1895$.currentBinding(var88);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic10$, var88);
                        assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                        final SubLObject var7_91 = module0145.$g1897$.currentBinding(var88);
                        try {
                            module0145.$g1897$.bind((SubLObject)$ic12$, var88);
                            var89 = module0314.f21183(var73, var87);
                        }
                        finally {
                            module0145.$g1897$.rebind(var7_91, var88);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var7_90, var88);
                    }
                }
            }
            catch (Throwable var95) {
                var94 = Errors.handleThrowable(var95, (SubLObject)$ic8$);
            }
            finally {
                var88.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var93, var88);
            module0147.$g2094$.rebind(var92, var88);
            module0147.$g2095$.rebind(var91, var88);
        }
        return var89;
    }
    
    public static SubLObject f21315(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var2) : var2;
        return module0316.f21362(var1, (SubLObject)$ic102$, var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21316(final SubLObject var92, SubLObject var3, SubLObject var93) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)NIL;
        final SubLObject var96 = var3;
        final SubLObject var97 = module0147.$g2095$.currentBinding(var94);
        final SubLObject var98 = module0147.$g2094$.currentBinding(var94);
        final SubLObject var99 = module0147.$g2096$.currentBinding(var94);
        try {
            module0147.$g2095$.bind(module0147.f9545(var96), var94);
            module0147.$g2094$.bind(module0147.f9546(var96), var94);
            module0147.$g2096$.bind(module0147.f9549(var96), var94);
            SubLObject var100 = (SubLObject)NIL;
            try {
                var94.throwStack.push($ic8$);
                final SubLObject var7_95 = module0145.$g1941$.currentBinding(var94);
                try {
                    module0145.$g1941$.bind((SubLObject)((NIL != var93) ? module0145.$g1941$.getDynamicValue(var94) : ZERO_INTEGER), var94);
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var92, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                    }
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var92, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                    }
                }
                finally {
                    module0145.$g1941$.rebind(var7_95, var94);
                }
                try {
                    var95 = module0314.f21180(var92, var92, (SubLObject)UNPROVIDED);
                }
                finally {
                    final SubLObject var7_96 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var94));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_96, var94);
                    }
                }
            }
            catch (Throwable var101) {
                var100 = Errors.handleThrowable(var101, (SubLObject)$ic8$);
            }
            finally {
                var94.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var99, var94);
            module0147.$g2094$.rebind(var98, var94);
            module0147.$g2095$.rebind(var97, var94);
        }
        return var95;
    }
    
    public static SubLObject f21317(final SubLObject var1, final SubLObject var97, final SubLObject var98, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var97) : var97;
        assert NIL != module0313.f21137(var98) : var98;
        return module0316.f21362(var1, (SubLObject)$ic105$, var97, var98, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21318(final SubLObject var63, final SubLObject var64, SubLObject var3, SubLObject var93) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)NIL;
        final SubLObject var96 = var3;
        final SubLObject var97 = module0147.$g2095$.currentBinding(var94);
        final SubLObject var98 = module0147.$g2094$.currentBinding(var94);
        final SubLObject var99 = module0147.$g2096$.currentBinding(var94);
        try {
            module0147.$g2095$.bind(module0147.f9545(var96), var94);
            module0147.$g2094$.bind(module0147.f9546(var96), var94);
            module0147.$g2096$.bind(module0147.f9549(var96), var94);
            SubLObject var100 = (SubLObject)NIL;
            SubLObject var101 = (SubLObject)NIL;
            if (module0145.$g1891$.getDynamicValue(var94).numE((SubLObject)ONE_INTEGER)) {
                var100 = var64;
                var101 = var63;
            }
            else {
                var100 = var63;
                var101 = var64;
            }
            SubLObject var102 = (SubLObject)NIL;
            try {
                var94.throwStack.push($ic8$);
                final SubLObject var7_100 = module0145.$g1941$.currentBinding(var94);
                try {
                    module0145.$g1941$.bind((SubLObject)((NIL != var93) ? module0145.$g1941$.getDynamicValue(var94) : ZERO_INTEGER), var94);
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var100, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                    }
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var101, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                    }
                }
                finally {
                    module0145.$g1941$.rebind(var7_100, var94);
                }
                var95 = module0314.f21180(var100, var101, (SubLObject)UNPROVIDED);
            }
            catch (Throwable var103) {
                var102 = Errors.handleThrowable(var103, (SubLObject)$ic8$);
            }
            finally {
                var94.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var99, var94);
            module0147.$g2094$.rebind(var98, var94);
            module0147.$g2095$.rebind(var97, var94);
        }
        return var95;
    }
    
    public static SubLObject f21319(final SubLObject var1, final SubLObject var97, final SubLObject var98, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var97) : var97;
        assert NIL != module0313.f21137(var98) : var98;
        return module0316.f21362(var1, (SubLObject)$ic110$, var97, var98, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21320(final SubLObject var63, final SubLObject var64, SubLObject var3, SubLObject var93) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)NIL;
        final SubLObject var96 = var3;
        final SubLObject var97 = module0147.$g2095$.currentBinding(var94);
        final SubLObject var98 = module0147.$g2094$.currentBinding(var94);
        final SubLObject var99 = module0147.$g2096$.currentBinding(var94);
        try {
            module0147.$g2095$.bind(module0147.f9545(var96), var94);
            module0147.$g2094$.bind(module0147.f9546(var96), var94);
            module0147.$g2096$.bind(module0147.f9549(var96), var94);
            SubLObject var100 = (SubLObject)NIL;
            SubLObject var101 = (SubLObject)NIL;
            if (module0145.$g1891$.getDynamicValue(var94).numE((SubLObject)ONE_INTEGER)) {
                var100 = var64;
                var101 = var63;
            }
            else {
                var100 = var63;
                var101 = var64;
            }
            SubLObject var102 = (SubLObject)NIL;
            try {
                var94.throwStack.push($ic8$);
                final SubLObject var7_101 = module0145.$g1941$.currentBinding(var94);
                try {
                    module0145.$g1941$.bind((SubLObject)((NIL != var93) ? module0145.$g1941$.getDynamicValue(var94) : ZERO_INTEGER), var94);
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var100, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                    }
                    if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var94) && NIL == module0145.$g1942$.getDynamicValue(var94) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var94)) {
                        module0313.f21154(var101, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                    }
                }
                finally {
                    module0145.$g1941$.rebind(var7_101, var94);
                }
                assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                final SubLObject var7_102 = module0145.$g1897$.currentBinding(var94);
                try {
                    module0145.$g1897$.bind((SubLObject)$ic12$, var94);
                    var95 = module0314.f21203(var100, var101);
                    if (NIL != module0145.$g1915$.getDynamicValue(var94)) {
                        SubLObject var103 = (SubLObject)NIL;
                        SubLObject var104 = var95;
                        SubLObject var105 = (SubLObject)NIL;
                        var105 = var104.first();
                        while (NIL != var104) {
                            var103 = (SubLObject)ConsesLow.cons(var105, var103);
                            final SubLObject var106 = f21302(var105);
                            if (!module0145.$g1888$.getDynamicValue(var94).eql(var106)) {
                                SubLObject var34_103 = module0260.f17131(var106, module0145.$g1888$.getDynamicValue(var94), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                SubLObject var107 = (SubLObject)NIL;
                                var107 = var34_103.first();
                                while (NIL != var34_103) {
                                    final SubLObject var108 = var107.first();
                                    SubLObject var109 = (SubLObject)NIL;
                                    if (NIL == var109) {
                                        SubLObject var110 = module0217.f14420(module0204.f13033(var108));
                                        SubLObject var111 = (SubLObject)NIL;
                                        var111 = var110.first();
                                        while (NIL == var109 && NIL != var110) {
                                            if (NIL != module0147.f9507(module0178.f11287(var111))) {
                                                var109 = var111;
                                            }
                                            var110 = var110.rest();
                                            var111 = var110.first();
                                        }
                                    }
                                    if (NIL != var109) {
                                        final SubLObject var112 = var109;
                                        if (NIL == conses_high.member(var112, var103, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var103 = (SubLObject)ConsesLow.cons(var112, var103);
                                        }
                                    }
                                    var34_103 = var34_103.rest();
                                    var107 = var34_103.first();
                                }
                            }
                            var104 = var104.rest();
                            var105 = var104.first();
                        }
                        var95 = Sequences.nreverse(var103);
                    }
                }
                finally {
                    module0145.$g1897$.rebind(var7_102, var94);
                }
            }
            catch (Throwable var113) {
                var102 = Errors.handleThrowable(var113, (SubLObject)$ic8$);
            }
            finally {
                var94.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var99, var94);
            module0147.$g2094$.rebind(var98, var94);
            module0147.$g2095$.rebind(var97, var94);
        }
        return var95;
    }
    
    public static SubLObject f21321(final SubLObject var1, final SubLObject var31, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.listp(var31) : var31;
        return module0316.f21362(var1, (SubLObject)$ic114$, var31, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21261(final SubLObject var109, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var109)) {
            return var109;
        }
        final SubLObject var111 = module0035.f2272(var109);
        SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = var3;
        final SubLObject var114 = module0147.$g2095$.currentBinding(var110);
        final SubLObject var115 = module0147.$g2094$.currentBinding(var110);
        final SubLObject var116 = module0147.$g2096$.currentBinding(var110);
        try {
            module0147.$g2095$.bind(module0147.f9545(var113), var110);
            module0147.$g2094$.bind(module0147.f9546(var113), var110);
            module0147.$g2096$.bind(module0147.f9549(var113), var110);
            SubLObject var117 = var111;
            SubLObject var118 = (SubLObject)NIL;
            var118 = var117.first();
            while (NIL != var117) {
                if (NIL == module0314.f21171(var118)) {
                    module0314.f21243(var118);
                    if (NIL != module0314.f21171(var118)) {
                        module0314.f21251(var118);
                    }
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
            var112 = Sequences.remove_if((SubLObject)$ic119$, var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var116, var110);
            module0147.$g2094$.rebind(var115, var110);
            module0147.$g2095$.rebind(var114, var110);
        }
        return var112;
    }
    
    public static SubLObject f21322(final SubLObject var1, final SubLObject var31, SubLObject var3, SubLObject var112) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = module0145.$g1914$.getDynamicValue();
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.listp(var31) : var31;
        return module0316.f21362(var1, (SubLObject)$ic120$, var31, var3, var112, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21266(final SubLObject var109, SubLObject var3, SubLObject var112) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = module0145.$g1914$.getDynamicValue();
        }
        final SubLObject var113 = module0035.f2272(var109);
        if (NIL != module0035.f1997(var113)) {
            return var113;
        }
        final SubLObject var114 = var112;
        if (var114.eql((SubLObject)$ic124$)) {
            return f21323(var113, var3);
        }
        if (var114.eql((SubLObject)$ic125$)) {
            return f21324(var113, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21324(final SubLObject var109, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = var3;
        final SubLObject var113 = module0147.$g2095$.currentBinding(var110);
        final SubLObject var114 = module0147.$g2094$.currentBinding(var110);
        final SubLObject var115 = module0147.$g2096$.currentBinding(var110);
        try {
            module0147.$g2095$.bind(module0147.f9545(var112), var110);
            module0147.$g2094$.bind(module0147.f9546(var112), var110);
            module0147.$g2096$.bind(module0147.f9549(var112), var110);
            SubLObject var116 = var109;
            SubLObject var117 = (SubLObject)NIL;
            var117 = var116.first();
            while (NIL != var116) {
                if (NIL == module0314.f21171(var117)) {
                    module0314.f21246(var117);
                    if (NIL != module0314.f21171(var117)) {
                        module0314.f21247(var117);
                    }
                }
                var116 = var116.rest();
                var117 = var116.first();
            }
            var111 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic119$), var109, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var115, var110);
            module0147.$g2094$.rebind(var114, var110);
            module0147.$g2095$.rebind(var113, var110);
        }
        return var111;
    }
    
    public static SubLObject f21325(final SubLObject var109, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = var3;
        final SubLObject var113 = module0147.$g2095$.currentBinding(var110);
        final SubLObject var114 = module0147.$g2094$.currentBinding(var110);
        final SubLObject var115 = module0147.$g2096$.currentBinding(var110);
        try {
            module0147.$g2095$.bind(module0147.f9545(var112), var110);
            module0147.$g2094$.bind(module0147.f9546(var112), var110);
            module0147.$g2096$.bind(module0147.f9549(var112), var110);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
            }
            final SubLObject var7_113 = module0145.$g1895$.currentBinding(var110);
            try {
                module0145.$g1895$.bind((SubLObject)$ic10$, var110);
                final SubLObject var116 = Hashtables.make_hash_table(Sequences.length(var109), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var117 = var109;
                SubLObject var118 = (SubLObject)NIL;
                var118 = var117.first();
                while (NIL != var117) {
                    Hashtables.sethash(var118, var116, (SubLObject)T);
                    var117 = var117.rest();
                    var118 = var117.first();
                }
                var117 = var109;
                var118 = (SubLObject)NIL;
                var118 = var117.first();
                while (NIL != var117) {
                    Hashtables.sethash(var118, var116, (SubLObject)NIL);
                    if (NIL == module0314.f21180(var118, var116, Symbols.symbol_function((SubLObject)$ic126$))) {
                        var111 = (SubLObject)ConsesLow.cons(var118, var111);
                    }
                    Hashtables.sethash(var118, var116, (SubLObject)T);
                    var117 = var117.rest();
                    var118 = var117.first();
                }
            }
            finally {
                module0145.$g1895$.rebind(var7_113, var110);
            }
        }
        finally {
            module0147.$g2096$.rebind(var115, var110);
            module0147.$g2094$.rebind(var114, var110);
            module0147.$g2095$.rebind(var113, var110);
        }
        return var111;
    }
    
    public static SubLObject f21323(final SubLObject var109, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = var3;
        final SubLObject var113 = module0147.$g2095$.currentBinding(var110);
        final SubLObject var114 = module0147.$g2094$.currentBinding(var110);
        final SubLObject var115 = module0147.$g2096$.currentBinding(var110);
        try {
            module0147.$g2095$.bind(module0147.f9545(var112), var110);
            module0147.$g2094$.bind(module0147.f9546(var112), var110);
            module0147.$g2096$.bind(module0147.f9549(var112), var110);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
            }
            final SubLObject var7_115 = module0145.$g1895$.currentBinding(var110);
            try {
                module0145.$g1895$.bind((SubLObject)$ic10$, var110);
                SubLObject var116 = var109;
                SubLObject var117 = (SubLObject)NIL;
                var117 = var116.first();
                while (NIL != var116) {
                    if (NIL == module0314.f21180(var117, Sequences.remove(var117, var109, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic127$))) {
                        var111 = (SubLObject)ConsesLow.cons(var117, var111);
                    }
                    var116 = var116.rest();
                    var117 = var116.first();
                }
            }
            finally {
                module0145.$g1895$.rebind(var7_115, var110);
            }
        }
        finally {
            module0147.$g2096$.rebind(var115, var110);
            module0147.$g2094$.rebind(var114, var110);
            module0147.$g2095$.rebind(var113, var110);
        }
        return var111;
    }
    
    public static SubLObject f21326(final SubLObject var1, final SubLObject var31, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.listp(var31) : var31;
        return module0316.f21362(var1, (SubLObject)$ic128$, var31, var116, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21327(final SubLObject var31, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = f21328(var31, var116, var3);
        SubLObject var119 = (SubLObject)NIL;
        final SubLObject var120 = module0145.$g1925$.currentBinding(var117);
        final SubLObject var121 = module0145.$g1924$.currentBinding(var117);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var117), var117);
            module0145.$g1924$.bind((SubLObject)NIL, var117);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
            var119 = f21321(module0145.$g1888$.getDynamicValue(var117), var118, var3);
        }
        finally {
            module0145.$g1924$.rebind(var121, var117);
            module0145.$g1925$.rebind(var120, var117);
        }
        return var119;
    }
    
    public static SubLObject f21328(final SubLObject var109, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        final SubLObject var119 = module0145.$g1925$.currentBinding(var117);
        final SubLObject var120 = module0145.$g1924$.currentBinding(var117);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var117), var117);
            module0145.$g1924$.bind((SubLObject)NIL, var117);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
            var118 = f21322(module0145.$g1888$.getDynamicValue(var117), var109, var3, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1924$.rebind(var120, var117);
            module0145.$g1925$.rebind(var119, var117);
        }
        if (NIL == module0035.f1997(var118)) {
            return f21329(var118, var116, var3);
        }
        if (NIL == var116 || NIL != module0004.f104(var118.first(), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var118;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21329(final SubLObject var109, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var117) && NIL == module0313.f21138((SubLObject)$ic10$)) {
            Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
        }
        final SubLObject var119 = module0145.$g1895$.currentBinding(var117);
        try {
            module0145.$g1895$.bind((SubLObject)$ic10$, var117);
            var118 = module0314.f21185(var109, var116, var3);
        }
        finally {
            module0145.$g1895$.rebind(var119, var117);
        }
        return var118;
    }
    
    public static SubLObject f21330(final SubLObject var1, final SubLObject var31, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.listp(var31) : var31;
        return module0316.f21362(var1, (SubLObject)$ic133$, var31, var116, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21331(final SubLObject var31, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = f21332(var31, var116, var3);
        SubLObject var119 = (SubLObject)NIL;
        final SubLObject var120 = module0145.$g1925$.currentBinding(var117);
        final SubLObject var121 = module0145.$g1924$.currentBinding(var117);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var117), var117);
            module0145.$g1924$.bind((SubLObject)NIL, var117);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
            var119 = f21322(module0145.$g1888$.getDynamicValue(var117), var118, var3, (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1924$.rebind(var121, var117);
            module0145.$g1925$.rebind(var120, var117);
        }
        return var119;
    }
    
    public static SubLObject f21332(final SubLObject var109, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (NIL != var109) {
            SubLObject var118 = (SubLObject)NIL;
            final SubLObject var119 = module0145.$g1925$.currentBinding(var117);
            final SubLObject var120 = module0145.$g1924$.currentBinding(var117);
            try {
                module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var117), var117);
                module0145.$g1924$.bind((SubLObject)NIL, var117);
                module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                var118 = f21321(module0145.$g1888$.getDynamicValue(var117), var109, var3);
            }
            finally {
                module0145.$g1924$.rebind(var120, var117);
                module0145.$g1925$.rebind(var119, var117);
            }
            if (NIL == module0035.f1997(var118)) {
                return f21333(var118, var116, var3);
            }
            if (NIL == var116 || NIL != module0004.f104(var118.first(), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var118;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21333(final SubLObject var109, SubLObject var116, SubLObject var3) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var117) && NIL == module0313.f21138((SubLObject)$ic21$)) {
            Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
        }
        final SubLObject var119 = module0145.$g1895$.currentBinding(var117);
        try {
            module0145.$g1895$.bind((SubLObject)$ic21$, var117);
            var118 = module0314.f21185(var109, var116, var3);
        }
        finally {
            module0145.$g1895$.rebind(var119, var117);
        }
        return var118;
    }
    
    public static SubLObject f21334(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var71) : var71;
        assert NIL != module0313.f21137(var70) : var70;
        return module0316.f21362(var1, (SubLObject)$ic136$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21335(final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        var73 = module0316.f21362(module0145.$g1888$.getDynamicValue(var72), (SubLObject)$ic2$, var71, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var74 = module0316.f21362(module0145.$g1888$.getDynamicValue(var72), (SubLObject)$ic2$, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var75 = f21321(module0145.$g1888$.getDynamicValue(var72), module0035.f2272(ConsesLow.nconc(var74, Sequences.delete(var70, var73, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED);
        return var75;
    }
    
    public static SubLObject f21336(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var71) : var71;
        assert NIL != module0313.f21137(var70) : var70;
        return module0316.f21362(var1, (SubLObject)$ic139$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21337(final SubLObject var70, final SubLObject var71, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        var73 = module0316.f21362(module0145.$g1888$.getDynamicValue(var72), (SubLObject)$ic17$, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var74 = module0316.f21362(module0145.$g1888$.getDynamicValue(var72), (SubLObject)$ic17$, var71, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var75 = f21322(module0145.$g1888$.getDynamicValue(var72), module0035.f2272(ConsesLow.nconc(var74, Sequences.delete(var71, var73, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var75;
    }
    
    public static SubLObject f21338(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic142$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21339(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic143$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21340(final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0145.$g1935$.currentBinding(var72);
        final SubLObject var75 = module0145.$g1921$.currentBinding(var72);
        try {
            module0145.$g1935$.bind(var70, var72);
            module0145.$g1921$.bind((SubLObject)ConsesLow.list(var71), var72);
            final SubLObject var76 = var3;
            final SubLObject var7_127 = module0147.$g2095$.currentBinding(var72);
            final SubLObject var8_128 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var77 = module0147.$g2096$.currentBinding(var72);
            try {
                module0147.$g2095$.bind(module0147.f9545(var76), var72);
                module0147.$g2094$.bind(module0147.f9546(var76), var72);
                module0147.$g2096$.bind(module0147.f9549(var76), var72);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var72) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_128 = module0145.$g1895$.currentBinding(var72);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var72);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_129 = module0145.$g1897$.currentBinding(var72);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var72);
                        var73 = module0314.f21216(var71);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_129, var72);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_128, var72);
                }
            }
            finally {
                module0147.$g2096$.rebind(var77, var72);
                module0147.$g2094$.rebind(var8_128, var72);
                module0147.$g2095$.rebind(var7_127, var72);
            }
        }
        finally {
            module0145.$g1921$.rebind(var75, var72);
            module0145.$g1935$.rebind(var74, var72);
        }
        return var73;
    }
    
    public static SubLObject f21341(final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0145.$g1935$.currentBinding(var72);
        final SubLObject var75 = module0145.$g1921$.currentBinding(var72);
        try {
            module0145.$g1935$.bind(var71, var72);
            module0145.$g1921$.bind((SubLObject)ConsesLow.list(var70), var72);
            final SubLObject var76 = var3;
            final SubLObject var7_131 = module0147.$g2095$.currentBinding(var72);
            final SubLObject var8_132 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var77 = module0147.$g2096$.currentBinding(var72);
            try {
                module0147.$g2095$.bind(module0147.f9545(var76), var72);
                module0147.$g2094$.bind(module0147.f9546(var76), var72);
                module0147.$g2096$.bind(module0147.f9549(var76), var72);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var72) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
                }
                final SubLObject var7_132 = module0145.$g1895$.currentBinding(var72);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic21$, var72);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_133 = module0145.$g1897$.currentBinding(var72);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var72);
                        var73 = module0314.f21216(var70);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_133, var72);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_132, var72);
                }
            }
            finally {
                module0147.$g2096$.rebind(var77, var72);
                module0147.$g2094$.rebind(var8_132, var72);
                module0147.$g2095$.rebind(var7_131, var72);
            }
        }
        finally {
            module0145.$g1921$.rebind(var75, var72);
            module0145.$g1935$.rebind(var74, var72);
        }
        return var73;
    }
    
    public static SubLObject f21342(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0316.f21362(var1, (SubLObject)$ic144$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21343(final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0145.$g1935$.currentBinding(var72);
        final SubLObject var75 = module0145.$g1938$.currentBinding(var72);
        try {
            module0145.$g1935$.bind(var70, var72);
            module0145.$g1938$.bind((SubLObject)NIL, var72);
            final SubLObject var76 = var3;
            final SubLObject var7_135 = module0147.$g2095$.currentBinding(var72);
            final SubLObject var8_136 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var77 = module0147.$g2096$.currentBinding(var72);
            try {
                module0147.$g2095$.bind(module0147.f9545(var76), var72);
                module0147.$g2094$.bind(module0147.f9546(var76), var72);
                module0147.$g2096$.bind(module0147.f9549(var76), var72);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var72) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                    Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                }
                final SubLObject var7_136 = module0145.$g1895$.currentBinding(var72);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic10$, var72);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_137 = module0145.$g1897$.currentBinding(var72);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var72);
                        var73 = module0314.f21217(var71);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_137, var72);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_136, var72);
                }
            }
            finally {
                module0147.$g2096$.rebind(var77, var72);
                module0147.$g2094$.rebind(var8_136, var72);
                module0147.$g2095$.rebind(var7_135, var72);
            }
        }
        finally {
            module0145.$g1938$.rebind(var75, var72);
            module0145.$g1935$.rebind(var74, var72);
        }
        return var73;
    }
    
    public static SubLObject f21344(final SubLObject var1, final SubLObject var71, final SubLObject var70) {
        return module0316.f21362(var1, (SubLObject)$ic145$, var71, var70, (SubLObject)$ic146$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21345(final SubLObject var99, final SubLObject var139, final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = (SubLObject)(ONE_INTEGER.eql(module0145.$g1891$.getDynamicValue(var141)) ? $ic10$ : $ic21$);
        SubLObject var143 = (SubLObject)NIL;
        final SubLObject var144 = module0145.$g1919$.currentBinding(var141);
        final SubLObject var145 = module0145.$g1921$.currentBinding(var141);
        final SubLObject var146 = module0145.$g1920$.currentBinding(var141);
        final SubLObject var147 = module0145.$g1918$.currentBinding(var141);
        try {
            module0145.$g1919$.bind(var139, var141);
            module0145.$g1921$.bind((SubLObject)NIL, var141);
            module0145.$g1920$.bind((SubLObject)NIL, var141);
            module0145.$g1918$.bind((SubLObject)NIL, var141);
            module0145.$g1921$.setDynamicValue((SubLObject)ConsesLow.cons(var99, module0145.$g1921$.getDynamicValue(var141)), var141);
            f21346(var99, var139, var140, var142);
            var143 = module0262.f17367(module0145.$g1918$.getDynamicValue(var141), (SubLObject)UNPROVIDED);
        }
        finally {
            module0145.$g1918$.rebind(var147, var141);
            module0145.$g1920$.rebind(var146, var141);
            module0145.$g1921$.rebind(var145, var141);
            module0145.$g1919$.rebind(var144, var141);
        }
        return var143;
    }
    
    public static SubLObject f21346(final SubLObject var63, final SubLObject var64, final SubLObject var140, final SubLObject var141) {
        if (var140.eql((SubLObject)$ic146$)) {
            return f21347(var63, var141);
        }
        return module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic147$, var140, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21347(final SubLObject var99, final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)NIL;
        final SubLObject var144 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var145 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind((SubLObject)$ic148$, var142);
            module0147.$g2095$.bind($ic149$, var142);
            SubLObject var146 = (SubLObject)NIL;
            try {
                var142.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var142) && NIL == module0145.$g1942$.getDynamicValue(var142) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var142)) {
                    module0313.f21154(var99, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var142) && NIL == module0313.f21138(var141)) {
                    Errors.error((SubLObject)$ic11$, var141);
                }
                final SubLObject var7_144 = module0145.$g1895$.currentBinding(var142);
                try {
                    module0145.$g1895$.bind(var141, var142);
                    assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                    final SubLObject var7_145 = module0145.$g1897$.currentBinding(var142);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic12$, var142);
                        var143 = module0314.f21220(var99);
                    }
                    finally {
                        module0145.$g1897$.rebind(var7_145, var142);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var7_144, var142);
                }
            }
            catch (Throwable var147) {
                var146 = Errors.handleThrowable(var147, (SubLObject)$ic8$);
            }
            finally {
                var142.throwStack.pop();
            }
        }
        finally {
            module0147.$g2095$.rebind(var145, var142);
            module0147.$g2094$.rebind(var144, var142);
        }
        return var143;
    }
    
    public static SubLObject f21348(final SubLObject var111) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f21349(final SubLObject var111) {
        if (NIL != module0549.f33901(var111)) {
            return module0549.f33901(var111);
        }
        return f21348(var111);
    }
    
    public static SubLObject f21350(final SubLObject var52, final SubLObject var70) {
        return module0316.f21362(var52, (SubLObject)$ic150$, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21351(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = Hashtables.make_hash_table(f21349(var146), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var149 = (SubLObject)NIL;
        final SubLObject var150 = module0147.$g2094$.currentBinding(var147);
        final SubLObject var151 = module0147.$g2095$.currentBinding(var147);
        try {
            module0147.$g2094$.bind((SubLObject)$ic151$, var147);
            module0147.$g2095$.bind($ic152$, var147);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var147) && NIL == module0313.f21138((SubLObject)$ic21$)) {
                Errors.error((SubLObject)$ic11$, (SubLObject)$ic21$);
            }
            final SubLObject var7_149 = module0145.$g1895$.currentBinding(var147);
            try {
                module0145.$g1895$.bind((SubLObject)$ic21$, var147);
                assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                final SubLObject var7_150 = module0145.$g1897$.currentBinding(var147);
                final SubLObject var8_151 = module0145.$g1924$.currentBinding(var147);
                try {
                    module0145.$g1897$.bind((SubLObject)$ic12$, var147);
                    module0145.$g1924$.bind(var148, var147);
                    var149 = module0314.f21213(var146);
                }
                finally {
                    module0145.$g1924$.rebind(var8_151, var147);
                    module0145.$g1897$.rebind(var7_150, var147);
                }
            }
            finally {
                module0145.$g1895$.rebind(var7_149, var147);
            }
        }
        finally {
            module0147.$g2095$.rebind(var151, var147);
            module0147.$g2094$.rebind(var150, var147);
        }
        return var149;
    }
    
    public static SubLObject f21352(final SubLObject var111) {
        if (NIL != module0549.f33895(var111)) {
            return module0549.f33895(var111);
        }
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f21353(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = f21350($ic153$, var111);
        final SubLObject var115 = Sequences.length(var114);
        final SubLObject var116 = Hashtables.make_hash_table(var115, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var117 = Hashtables.make_hash_table(f21352(var111), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var118 = module0145.$g1902$.currentBinding(var112);
        try {
            module0145.$g1902$.bind((SubLObject)NIL, var112);
            SubLObject var119 = (SubLObject)NIL;
            Errors.sublisp_break((SubLObject)$ic154$, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject var120 = var114;
            SubLObject var121 = (SubLObject)NIL;
            var121 = var120.first();
            while (NIL != var120) {
                Hashtables.sethash(var121.first(), var116, var121.rest());
                final SubLObject var7_158 = module0147.$g2094$.currentBinding(var112);
                final SubLObject var122 = module0147.$g2095$.currentBinding(var112);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic151$, var112);
                    module0147.$g2095$.bind($ic152$, var112);
                    module0314.f21230(Symbols.symbol_function((SubLObject)$ic155$), var121.first(), (SubLObject)TWO_INTEGER, $ic156$, (SubLObject)$ic12$);
                }
                finally {
                    module0147.$g2095$.rebind(var122, var112);
                    module0147.$g2094$.rebind(var7_158, var112);
                }
                var120 = var120.rest();
                var121 = var120.first();
            }
            Errors.sublisp_break((SubLObject)$ic157$, EMPTY_SUBL_OBJECT_ARRAY);
            var120 = module0145.$g1902$.getDynamicValue(var112);
            SubLObject var123 = (SubLObject)NIL;
            var123 = var120.first();
            while (NIL != var120) {
                final SubLObject var124 = module0178.f11334(var123);
                SubLObject var125 = Hashtables.gethash(var124, var117, (SubLObject)UNPROVIDED);
                final SubLObject var126 = module0178.f11335(var123);
                final SubLObject var127 = Hashtables.gethash(var126, var116, (SubLObject)UNPROVIDED);
                final SubLObject var128 = module0314.f21208(var127, module0178.f11287(var123));
                if (NIL != var128) {
                    var125 = module0035.f2272(ConsesLow.append(var128, var125));
                    Hashtables.sethash(var124, var117, var125);
                }
                var120 = var120.rest();
                var123 = var120.first();
            }
            Errors.sublisp_break((SubLObject)$ic158$, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject var129 = (SubLObject)NIL;
            SubLObject var130 = (SubLObject)NIL;
            final Iterator var131 = Hashtables.getEntrySetIterator(var117);
            try {
                while (Hashtables.iteratorHasNext(var131)) {
                    final Map.Entry var132 = Hashtables.iteratorNextEntry(var131);
                    var129 = Hashtables.getEntryKey(var132);
                    var130 = Hashtables.getEntryValue(var132);
                    var119 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var129, f21322($ic159$, var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var119);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var131);
            }
            var113 = var119;
        }
        finally {
            module0145.$g1902$.rebind(var118, var112);
        }
        return var113;
    }
    
    public static SubLObject f21354(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var168, module0145.$g1902$.getDynamicValue(var169)), var169);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21355(final SubLObject var71, final SubLObject var70) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0145.$g1902$.currentBinding(var72);
        try {
            module0145.$g1902$.bind((SubLObject)NIL, var72);
            SubLObject var75 = (SubLObject)NIL;
            SubLObject var76 = (SubLObject)NIL;
            SubLObject var77 = (SubLObject)NIL;
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            final SubLObject var7_174 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var80 = module0147.$g2095$.currentBinding(var72);
            try {
                module0147.$g2094$.bind((SubLObject)$ic151$, var72);
                module0147.$g2095$.bind($ic152$, var72);
                module0314.f21230(Symbols.symbol_function((SubLObject)$ic155$), var71, (SubLObject)ONE_INTEGER, $ic156$, (SubLObject)$ic12$);
            }
            finally {
                module0147.$g2095$.rebind(var80, var72);
                module0147.$g2094$.rebind(var7_174, var72);
            }
            SubLObject var81;
            var75 = (var81 = module0145.$g1902$.getDynamicValue(var72));
            SubLObject var82 = (SubLObject)NIL;
            var82 = var81.first();
            while (NIL != var81) {
                var76 = module0178.f11287(var82);
                var77 = module0178.f11335(var82);
                var79 = f21344($ic153$, var77, var70);
                if (NIL != var79) {
                    SubLObject var34_176 = var79;
                    SubLObject var83 = (SubLObject)NIL;
                    var83 = var34_176.first();
                    while (NIL != var34_176) {
                        var78 = f21321($ic159$, (SubLObject)ConsesLow.list(var76, var83), (SubLObject)UNPROVIDED);
                        if (NIL != module0035.f1997(var78)) {
                            var73 = (SubLObject)ConsesLow.cons(var78.first(), var73);
                        }
                        var34_176 = var34_176.rest();
                        var83 = var34_176.first();
                    }
                }
                var81 = var81.rest();
                var82 = var81.first();
            }
        }
        finally {
            module0145.$g1902$.rebind(var74, var72);
        }
        var73 = f21322($ic159$, var73, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var73;
    }
    
    public static SubLObject f21356(final SubLObject var1, final SubLObject var71, final SubLObject var70, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0313.f21137(var71) : var71;
        assert NIL != module0313.f21137(var70) : var70;
        return module0316.f21362(var1, (SubLObject)$ic160$, var71, var70, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21357(final SubLObject var73, final SubLObject var72, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)NIL;
        final SubLObject var76 = var3;
        final SubLObject var77 = module0147.$g2095$.currentBinding(var74);
        final SubLObject var78 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var79 = module0147.$g2096$.currentBinding(var74);
        try {
            module0147.$g2095$.bind(module0147.f9545(var76), var74);
            module0147.$g2094$.bind(module0147.f9546(var76), var74);
            module0147.$g2096$.bind(module0147.f9549(var76), var74);
            SubLObject var80 = (SubLObject)NIL;
            try {
                var74.throwStack.push($ic8$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var73, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var74) && NIL == module0145.$g1942$.getDynamicValue(var74) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var74)) {
                    module0313.f21154(var72, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
                }
                if (var72.eql(var73)) {
                    if (NIL != module0226.f14795(module0145.$g1888$.getDynamicValue(var74))) {
                        var75 = (SubLObject)ConsesLow.list(var73);
                    }
                }
                else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && NIL == module0313.f21138((SubLObject)$ic10$)) {
                        Errors.error((SubLObject)$ic11$, (SubLObject)$ic10$);
                    }
                    final SubLObject var7_179 = module0145.$g1895$.currentBinding(var74);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic10$, var74);
                        assert NIL != module0130.f8511((SubLObject)$ic12$) : $ic12$;
                        final SubLObject var7_180 = module0145.$g1897$.currentBinding(var74);
                        try {
                            module0145.$g1897$.bind((SubLObject)$ic12$, var74);
                            var75 = module0314.f21205(var73, var72);
                        }
                        finally {
                            module0145.$g1897$.rebind(var7_180, var74);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var7_179, var74);
                    }
                }
            }
            catch (Throwable var81) {
                var80 = Errors.handleThrowable(var81, (SubLObject)$ic8$);
            }
            finally {
                var74.throwStack.pop();
            }
        }
        finally {
            module0147.$g2096$.rebind(var79, var74);
            module0147.$g2094$.rebind(var78, var74);
            module0147.$g2095$.rebind(var77, var74);
        }
        return var75;
    }
    
    public static SubLObject f21358() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21257", "GT-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21258", "S#12081", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21259", "GT-MIN-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21260", "S#12083", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21262", "GT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21263", "S#12082", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21264", "GT-MAX-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21265", "S#12084", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21267", "GT-CO-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21268", "S#12086", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21269", "GT-CO-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21270", "S#12085", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21271", "GT-REDUNDANT-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21272", "S#12087", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21273", "GT-REDUNDANT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21274", "S#12088", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21275", "GT-ALL-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21276", "S#12089", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21277", "GT-ALL-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21278", "S#12090", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21279", "S#23865", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21280", "S#12092", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21281", "GT-ALL-ACCESSIBLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21282", "S#12091", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21283", "GT-ROOTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21284", "S#12100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21285", "GT-LEAVES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21286", "S#12101", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21287", "GT-COMPOSE-FN-ALL-SUPERIORS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21288", "S#12093", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21289", "GT-COMPOSE-FN-ALL-INFERIORS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21290", "S#12095", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21291", "GT-COMPOSE-PRED-ALL-SUPERIORS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21292", "S#12097", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21293", "GT-COMPOSE-PRED-ALL-INFERIORS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21294", "S#12099", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21295", "GT-ALL-DEPENDENT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21296", "S#12096", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21297", "S#23866", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21298", "S#12102", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21299", "GT-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21300", "S#12103", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21301", "GT-WHY-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21302", "S#23867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21303", "S#23868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21304", "S#12126", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21305", "GT-INFERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21306", "S#12105", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21307", "GT-HAS-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21308", "S#12106", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21309", "GT-HAS-INFERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21310", "S#12107", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21311", "S#20093", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21312", "S#12111", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21313", "S#20091", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21314", "S#12108", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21315", "GT-CYCLES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21316", "S#12113", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21317", "GT-COMPLETES-CYCLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21318", "S#12114", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21319", "GT-WHY-COMPLETES-CYCLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21320", "S#12127", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21321", "GT-MIN-NODES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21261", "S#12117", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21322", "GT-MAX-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21266", "S#12119", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21324", "S#23869", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21325", "S#23870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21323", "S#23871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21326", "GT-MIN-CEILINGS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21327", "S#12120", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21328", "S#23872", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21329", "S#23873", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21330", "GT-MAX-FLOORS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21331", "S#12122", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21332", "S#23874", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21333", "S#23875", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21334", "GT-MIN-SUPERIORS-EXCLUDING", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21335", "S#12123", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21336", "GT-MAX-INFERIORS-EXCLUDING", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21337", "S#12124", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21338", "S#23876", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21339", "S#23877", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21340", "S#12130", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21341", "S#12131", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21342", "S#23878", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21343", "S#12132", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21344", "GT-SUPERIOR-IN-WHAT-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21345", "S#12134", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21346", "S#23879", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21347", "S#23880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21348", "S#23881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21349", "S#23882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21350", "S#23883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21351", "S#12133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21352", "S#23884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21353", "S#23885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21354", "S#23886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21355", "S#23887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21356", "GT-ANY-SUPERIOR-PATH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0315", "f21357", "S#12125", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21359() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21360() {
        module0012.f368((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic15$, (SubLObject)$ic4$, (SubLObject)$ic16$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic4$, (SubLObject)$ic19$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic23$, (SubLObject)$ic4$, (SubLObject)$ic24$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic4$, (SubLObject)$ic27$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic29$, (SubLObject)$ic4$, (SubLObject)$ic30$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic32$, (SubLObject)$ic4$, (SubLObject)$ic33$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)$ic4$, (SubLObject)$ic36$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic38$, (SubLObject)$ic4$, (SubLObject)$ic39$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic41$, (SubLObject)$ic4$, (SubLObject)$ic42$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic45$, (SubLObject)$ic4$, (SubLObject)$ic46$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic50$, (SubLObject)$ic4$, (SubLObject)$ic51$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic53$, (SubLObject)$ic4$, (SubLObject)$ic54$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic58$, (SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic61$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic74$, (SubLObject)$ic69$, (SubLObject)$ic75$, (SubLObject)$ic71$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic77$, (SubLObject)$ic4$, (SubLObject)$ic78$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)$ic86$);
        module0012.f368((SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)$ic96$, (SubLObject)$ic97$);
        module0012.f368((SubLObject)$ic98$, (SubLObject)$ic83$, (SubLObject)$ic99$, (SubLObject)$ic85$, (SubLObject)$ic97$);
        module0012.f368((SubLObject)$ic103$, (SubLObject)$ic4$, (SubLObject)$ic104$, (SubLObject)$ic6$, (SubLObject)$ic97$);
        module0012.f368((SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic97$);
        module0012.f368((SubLObject)$ic111$, (SubLObject)$ic107$, (SubLObject)$ic112$, (SubLObject)$ic109$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic115$, (SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic121$, (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic118$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic129$, (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic118$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic134$, (SubLObject)$ic130$, (SubLObject)$ic135$, (SubLObject)$ic118$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic137$, (SubLObject)$ic94$, (SubLObject)$ic138$, (SubLObject)$ic96$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic140$, (SubLObject)$ic94$, (SubLObject)$ic141$, (SubLObject)$ic96$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic161$, (SubLObject)$ic94$, (SubLObject)$ic162$, (SubLObject)$ic96$, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21358();
    }
    
    public void initializeVariables() {
        f21359();
    }
    
    public void runTopLevelForms() {
        f21360();
    }
    
    static {
        me = (SubLFile)new module0315();
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = makeSymbol("S#23760", "CYC");
        $ic2$ = makeKeyword("SUPERIORS");
        $ic3$ = makeSymbol("GT-SUPERIORS");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic5$ = makeString("Returns direct superiors of FORT via transitive PREDICATE");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("S#23760", "CYC")));
        $ic8$ = makeKeyword("GT-ERROR");
        $ic9$ = makeKeyword("GT-INDEX");
        $ic10$ = makeKeyword("SUPERIOR");
        $ic11$ = makeString("invalid gt mode: ~a");
        $ic12$ = makeKeyword("TRUE");
        $ic13$ = makeSymbol("TRUTH-P");
        $ic14$ = makeKeyword("MIN-SUPERIORS");
        $ic15$ = makeSymbol("GT-MIN-SUPERIORS");
        $ic16$ = makeString("Returns minimal superiors of FORT via transitive PREDICATE");
        $ic17$ = makeKeyword("INFERIORS");
        $ic18$ = makeSymbol("GT-INFERIORS");
        $ic19$ = makeString("Returns direct inferiors of FORT via transitive PREDICATE");
        $ic20$ = makeKeyword("GT-GATHER");
        $ic21$ = makeKeyword("INFERIOR");
        $ic22$ = makeKeyword("MAX-INFERIORS");
        $ic23$ = makeSymbol("GT-MAX-INFERIORS");
        $ic24$ = makeString("Returns maximal inferiors of FORT via transitive PREDICATE");
        $ic25$ = makeKeyword("CO-SUPERIORS");
        $ic26$ = makeSymbol("GT-CO-SUPERIORS");
        $ic27$ = makeString("Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself");
        $ic28$ = makeKeyword("CO-INFERIORS");
        $ic29$ = makeSymbol("GT-CO-INFERIORS");
        $ic30$ = makeString("Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself");
        $ic31$ = makeKeyword("REDUNDANT-SUPERIORS");
        $ic32$ = makeSymbol("GT-REDUNDANT-SUPERIORS");
        $ic33$ = makeString("Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors");
        $ic34$ = makeKeyword("REDUNDANT-INFERIORS");
        $ic35$ = makeSymbol("GT-REDUNDANT-INFERIORS");
        $ic36$ = makeString("Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors");
        $ic37$ = makeKeyword("ALL-SUPERIORS");
        $ic38$ = makeSymbol("GT-ALL-SUPERIORS");
        $ic39$ = makeString("Returns all superiors of FORT via PREDICATE");
        $ic40$ = makeKeyword("ALL-INFERIORS");
        $ic41$ = makeSymbol("GT-ALL-INFERIORS");
        $ic42$ = makeString("Returns all inferiors of FORT via PREDICATE");
        $ic43$ = makeKeyword("UNION-ALL-INFERIORS");
        $ic44$ = makeKeyword("ALL-ACCESSIBLE");
        $ic45$ = makeSymbol("GT-ALL-ACCESSIBLE");
        $ic46$ = makeString("Returns all superiors and all inferiors of FORT via PREDICATE");
        $ic47$ = makeKeyword("GT-EITHER");
        $ic48$ = makeKeyword("ACCESSIBLE");
        $ic49$ = makeKeyword("ROOTS");
        $ic50$ = makeSymbol("GT-ROOTS");
        $ic51$ = makeString("Returns maximal superiors (i.e., roots) of FORT via PREDICATE");
        $ic52$ = makeKeyword("LEAVES");
        $ic53$ = makeSymbol("GT-LEAVES");
        $ic54$ = makeString("Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE");
        $ic55$ = makeSymbol("CONS");
        $ic56$ = makeSymbol("FUNCTION-SPEC-P");
        $ic57$ = makeKeyword("COMPOSE-FN-SUPERIORS");
        $ic58$ = makeSymbol("GT-COMPOSE-FN-ALL-SUPERIORS");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12094", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("CONS"))), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic60$ = makeString("Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")));
        $ic62$ = makeKeyword("COMPOSE-FN-INFERIORS");
        $ic63$ = makeSymbol("GT-COMPOSE-FN-ALL-INFERIORS");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12094", "CYC"), (SubLObject)makeSymbol("S#12032", "CYC")), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic65$ = makeString("Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits");
        $ic66$ = makeSymbol("S#20280", "CYC");
        $ic67$ = makeKeyword("COMPOSE-PRED-SUPERIORS");
        $ic68$ = makeSymbol("GT-COMPOSE-PRED-ALL-SUPERIORS");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#23888", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23889", "CYC"), (SubLObject)makeSymbol("S#12036", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23890", "CYC"), (SubLObject)makeSymbol("S#12037", "CYC")), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic70$ = makeString("Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23888", "CYC"), (SubLObject)makeSymbol("S#20280", "CYC")));
        $ic72$ = makeSymbol("FIXNUMP");
        $ic73$ = makeKeyword("COMPOSE-PRED-INFERIORS");
        $ic74$ = makeSymbol("GT-COMPOSE-PRED-ALL-INFERIORS");
        $ic75$ = makeString("Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE");
        $ic76$ = makeKeyword("ALL-DEPENDENT-INFERIORS");
        $ic77$ = makeSymbol("GT-ALL-DEPENDENT-INFERIORS");
        $ic78$ = makeString("Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT");
        $ic79$ = makeKeyword("BOOLEAN?");
        $ic80$ = makeKeyword("SUPERIOR?");
        $ic81$ = makeKeyword("WHY-SUPERIOR?");
        $ic82$ = makeSymbol("GT-WHY-SUPERIOR?");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic84$ = makeString("Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")));
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("ASSERTION-P")));
        $ic87$ = makeKeyword("REFLEXIVE");
        $ic88$ = makeKeyword("GENLPREDS");
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic91$ = makeKeyword("INFERIOR?");
        $ic92$ = makeKeyword("HAS-SUPERIOR?");
        $ic93$ = makeSymbol("GT-HAS-SUPERIOR?");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic95$ = makeString("Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")));
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic98$ = makeSymbol("GT-HAS-INFERIOR?");
        $ic99$ = makeString("Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?");
        $ic100$ = makeKeyword("GATHER-INFERIOR");
        $ic101$ = makeKeyword("GATHER-SUPERIOR");
        $ic102$ = makeKeyword("CYCLES?");
        $ic103$ = makeSymbol("GT-CYCLES?");
        $ic104$ = makeString("Returns whether FORT is accessible from itself by one or more PREDICATE gafs?");
        $ic105$ = makeKeyword("COMPLETES-CYCLE?");
        $ic106$ = makeSymbol("GT-COMPLETES-CYCLE?");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12128", "CYC"), (SubLObject)makeSymbol("S#12129", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic108$ = makeString("Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12128", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12129", "CYC"), (SubLObject)makeSymbol("S#23760", "CYC")));
        $ic110$ = makeKeyword("WHY-COMPLETES-CYCLE?");
        $ic111$ = makeSymbol("GT-WHY-COMPLETES-CYCLE?");
        $ic112$ = makeString("Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?");
        $ic113$ = makeSymbol("LISTP");
        $ic114$ = makeKeyword("MIN-NODES");
        $ic115$ = makeSymbol("GT-MIN-NODES");
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic117$ = makeString("Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic119$ = makeSymbol("S#23780", "CYC");
        $ic120$ = makeKeyword("MAX-NODES");
        $ic121$ = makeSymbol("GT-MAX-NODES");
        $ic122$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("*GT-MAX-NODES-DIRECTION*")));
        $ic123$ = makeString("Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)");
        $ic124$ = makeKeyword("UP");
        $ic125$ = makeKeyword("DOWN");
        $ic126$ = makeSymbol("GETHASH");
        $ic127$ = makeSymbol("MEMBER?");
        $ic128$ = makeKeyword("MIN-CEILINGS");
        $ic129$ = makeSymbol("GT-MIN-CEILINGS");
        $ic130$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic131$ = makeString("Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
        $ic132$ = makeInteger(128);
        $ic133$ = makeKeyword("MAX-FLOORS");
        $ic134$ = makeSymbol("GT-MAX-FLOORS");
        $ic135$ = makeString("Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
        $ic136$ = makeKeyword("MIN-SUPERIORS-EXCLUDING");
        $ic137$ = makeSymbol("GT-MIN-SUPERIORS-EXCLUDING");
        $ic138$ = makeString("Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)");
        $ic139$ = makeKeyword("MAX-INFERIORS-EXCLUDING");
        $ic140$ = makeSymbol("GT-MAX-INFERIORS-EXCLUDING");
        $ic141$ = makeString("Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)");
        $ic142$ = makeKeyword("ALL-SUPERIOR-EDGES");
        $ic143$ = makeKeyword("ALL-INFERIOR-EDGES");
        $ic144$ = makeKeyword("ALL-PATHS");
        $ic145$ = makeKeyword("SUPERIOR-IN-WHAT-MTS");
        $ic146$ = makeKeyword("HIERARCHICALLY-DIRECT");
        $ic147$ = makeString("illegal value for method of which-mts: ~s");
        $ic148$ = makeSymbol("S#12275", "CYC");
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic150$ = makeKeyword("INFERIORS-WITH-MTS");
        $ic151$ = makeSymbol("S#12274", "CYC");
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic154$ = makeString("before gathering instances");
        $ic155$ = makeSymbol("S#23886", "CYC");
        $ic156$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic157$ = makeString("after instances, before maximin");
        $ic158$ = makeString("after maximin");
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic160$ = makeKeyword("ANY-SUPERIOR-PATH");
        $ic161$ = makeSymbol("GT-ANY-SUPERIOR-PATH");
        $ic162$ = makeString("Returns list of nodes connecting INFERIOR with SUPERIOR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1180 ms
	
	Decompiled with Procyon 0.5.32.
*/