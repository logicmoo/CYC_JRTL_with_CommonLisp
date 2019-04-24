package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0820 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0820";
    public static final String myFingerPrint = "dd8e82e7f613bd4be9dececee4e4617d6338edb58d6d6146c3ff75ce440d5516";
    public static SubLSymbol $g6524$;
    private static SubLSymbol $g6525$;
    private static SubLSymbol $g6526$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLList $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    
    public static SubLObject f52652(final SubLObject var1) {
        return Types.stringp(var1);
    }
    
    public static SubLObject f52653() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0813.f52032();
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52654() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51519();
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52655() {
        return f52654();
    }
    
    public static SubLObject f52656() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0820.NIL;
        if (module0820.NIL == var3) {
            return f52655();
        }
        var4 = module0034.f1857(var3, (SubLObject)module0820.$ic1$, (SubLObject)module0820.UNPROVIDED);
        if (module0820.NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)module0820.$ic1$, (SubLObject)module0820.ZERO_INTEGER, (SubLObject)module0820.NIL, (SubLObject)module0820.EQ, (SubLObject)module0820.UNPROVIDED);
            module0034.f1860(var3, (SubLObject)module0820.$ic1$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0820.UNPROVIDED);
        if (var5 == module0820.$ic2$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52655()));
            module0034.f1812(var4, var5, (SubLObject)module0820.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f52657(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = f52658(var7);
        final SubLObject var10 = f52658(var8);
        if (!var9.isInteger()) {
            return (SubLObject)module0820.NIL;
        }
        if (var10.isInteger()) {
            return Numbers.numL(var9, var10);
        }
        return (SubLObject)module0820.T;
    }
    
    public static SubLObject f52659(final SubLObject var1) {
        return Sequences.position(var1, f52656(), Symbols.symbol_function((SubLObject)module0820.EQUAL), (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
    }
    
    public static SubLObject f52658(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0820.NIL;
        if (module0820.NIL == var3) {
            return f52659(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)module0820.$ic3$, (SubLObject)module0820.UNPROVIDED);
        if (module0820.NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)module0820.$ic3$, (SubLObject)module0820.ONE_INTEGER, (SubLObject)module0820.NIL, (SubLObject)module0820.EQUAL, (SubLObject)module0820.UNPROVIDED);
            module0034.f1860(var3, (SubLObject)module0820.$ic3$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)module0820.$ic2$);
        if (var5 == module0820.$ic2$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52659(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)module0820.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f52660(final SubLObject var8, final SubLObject var7) {
        return f52657(var7, var8);
    }
    
    public static SubLObject f52661(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                var13 = Sort.sort(conses_high.copy_list(var11), Symbols.symbol_function((SubLObject)module0820.$ic5$), (SubLObject)module0820.UNPROVIDED);
            }
            finally {
                final SubLObject var15_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_18, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return var13;
    }
    
    public static SubLObject f52662(final SubLObject var7, final SubLObject var8) {
        return f52657(var7, var8);
    }
    
    public static SubLObject f52663(final SubLObject var8, final SubLObject var7) {
        return f52662(var7, var8);
    }
    
    public static SubLObject f52664(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51524(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52665() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51520();
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52666(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51525(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52667(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51526(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52668(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51527(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52669(final SubLObject var19) {
        assert module0820.NIL != Types.symbolp(var19) : var19;
        return Types.macro_operator_p(var19);
    }
    
    public static SubLObject f52670(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51534(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52671(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51543(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52672(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51535(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52673(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51544(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52674(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        if (module0820.NIL != f52670(var19)) {
            final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
            if (var21.eql((SubLObject)module0820.$ic0$)) {
                return module0809.f51528(var19);
            }
        }
        return module0004.f86(var19);
    }
    
    public static SubLObject f52675(final SubLObject var20) {
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22;
        final SubLObject var21 = var22 = module0811.f51812(var20);
        if (var22.eql((SubLObject)module0820.$ic8$)) {
            return (SubLObject)module0820.$ic9$;
        }
        if (var22.eql((SubLObject)module0820.$ic10$)) {
            return (SubLObject)module0820.NIL;
        }
        return var21;
    }
    
    public static SubLObject f52676(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51540(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52677(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51545(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52678(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51541(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52679(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51546(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52680(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51547(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52681(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51550(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52682(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51558(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52683(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51557(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52684(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51554(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52685(final SubLObject var22, final SubLObject var19) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var22) : var22;
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var24 = module0820.$g6524$.getDynamicValue(var23);
        if (var24.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51553(var22, var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52686(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51601(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52687(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51561(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52688(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51560(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52689(final SubLObject var22, final SubLObject var20) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var22) : var22;
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var24 = module0820.$g6524$.getDynamicValue(var23);
        if (var24.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51559(var22, var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52690(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51603(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52691(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51572(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52692(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var3 = module0820.$g6524$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51564(var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52693(final SubLObject var22, final SubLObject var1) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var22) : var22;
        assert module0820.NIL != f52652(var1) : var1;
        final SubLObject var24 = module0820.$g6524$.getDynamicValue(var23);
        if (var24.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51562(var22, var1);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52694(final SubLObject var1, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51571(var1, var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52695(final SubLObject var1, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var1) : var1;
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51563(var1, var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52696(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51578(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52697(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51574(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52698(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51573(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52699(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51576(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52700(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51611(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52701(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51599(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52702(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51580(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52703(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51595(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52704(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51597(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52705(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51613(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52706(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var19) : var19;
        final SubLObject var21 = module0820.$g6524$.getDynamicValue(var20);
        if (var21.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51618(var19);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52707(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0820.NIL != Types.symbolp(var20) : var20;
        final SubLObject var22 = module0820.$g6524$.getDynamicValue(var21);
        if (var22.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51621(var20);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52708(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var23) : var23;
        final SubLObject var25 = module0820.$g6524$.getDynamicValue(var24);
        if (var25.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51615(var23);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52709(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var24) : var24;
        final SubLObject var26 = module0820.$g6524$.getDynamicValue(var25);
        if (var26.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51607(var24);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52710(final SubLObject var24, final SubLObject var23) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0820.NIL != f52652(var24) : var24;
        assert module0820.NIL != f52652(var23) : var23;
        final SubLObject var26 = module0820.$g6524$.getDynamicValue(var25);
        if (var26.eql((SubLObject)module0820.$ic0$)) {
            return module0809.f51616(var24, var23);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52711(final SubLObject var25, SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = (SubLObject)module0820.NIL;
        }
        SubLObject var26 = var25;
        SubLObject var27 = (SubLObject)module0820.NIL;
        var27 = var26.first();
        while (module0820.NIL != var26) {
            final SubLObject var29;
            final SubLObject var28 = var29 = f52670(var27);
            if (module0820.NIL == conses_high.member(var29, var11, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var29, var11);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var11;
    }
    
    public static SubLObject f52712(final SubLObject var29, SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = (SubLObject)module0820.NIL;
        }
        SubLObject var30 = var29;
        SubLObject var31 = (SubLObject)module0820.NIL;
        var31 = var30.first();
        while (module0820.NIL != var30) {
            final SubLObject var33;
            final SubLObject var32 = var33 = f52676(var31);
            if (module0820.NIL == conses_high.member(var33, var11, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var33, var11);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var11;
    }
    
    public static SubLObject f52713(final SubLObject var30) {
        SubLObject var31 = (SubLObject)module0820.NIL;
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)module0820.NIL;
        var33 = var32.first();
        while (module0820.NIL != var32) {
            SubLObject var26_33;
            final SubLObject var34 = var26_33 = f52698(var33);
            SubLObject var35 = (SubLObject)module0820.NIL;
            var35 = var26_33.first();
            while (module0820.NIL != var26_33) {
                final SubLObject var36 = var35;
                if (module0820.NIL == conses_high.member(var36, var31, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var31 = (SubLObject)ConsesLow.cons(var36, var31);
                }
                var26_33 = var26_33.rest();
                var35 = var26_33.first();
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        return f52711(var31, (SubLObject)module0820.UNPROVIDED);
    }
    
    public static SubLObject f52714(final SubLObject var35, SubLObject var36) {
        if (var36 == module0820.UNPROVIDED) {
            var36 = (SubLObject)module0820.NIL;
        }
        final SubLObject var37 = module0077.f5313(Symbols.symbol_function((SubLObject)module0820.EQUALP), (SubLObject)module0820.UNPROVIDED);
        SubLObject var38 = (SubLObject)module0820.NIL;
        var38 = (SubLObject)ConsesLow.cons(var35, var38);
        while (module0820.NIL != var38) {
            final SubLObject var39 = var38.first();
            var38 = var38.rest();
            if (module0820.NIL != f52652(var39)) {
                if (module0820.NIL != var36) {
                    PrintLow.format((SubLObject)module0820.T, (SubLObject)module0820.$ic11$, var39);
                }
                if (module0820.NIL != module0077.f5320(var39, var37)) {
                    continue;
                }
                module0077.f5326(var39, var37);
                SubLObject var41;
                final SubLObject var40 = var41 = f52708(var39);
                SubLObject var42 = (SubLObject)module0820.NIL;
                var42 = var41.first();
                while (module0820.NIL != var41) {
                    if (module0820.NIL == module0077.f5320(var42, var37)) {
                        var38 = (SubLObject)ConsesLow.cons(var42, var38);
                    }
                    var41 = var41.rest();
                    var42 = var41.first();
                }
            }
        }
        return module0077.f5312(var37);
    }
    
    public static SubLObject f52715(final SubLObject var42, SubLObject var43) {
        if (var43 == module0820.UNPROVIDED) {
            var43 = (SubLObject)module0820.NIL;
        }
        return conses_high.set_difference(f52716(var42, var43), var42, (SubLObject)module0820.EQUAL, (SubLObject)module0820.UNPROVIDED);
    }
    
    public static SubLObject f52716(final SubLObject var42, SubLObject var43) {
        if (var43 == module0820.UNPROVIDED) {
            var43 = (SubLObject)module0820.NIL;
        }
        SubLObject var44 = var42;
        SubLObject var45 = (SubLObject)module0820.NIL;
        var45 = var44.first();
        while (module0820.NIL != var44) {
            var43 = f52717(var45, var43);
            var44 = var44.rest();
            var45 = var44.first();
        }
        return var43;
    }
    
    public static SubLObject f52717(final SubLObject var44, SubLObject var43) {
        if (var43 == module0820.UNPROVIDED) {
            var43 = (SubLObject)module0820.NIL;
        }
        return f52718(var44, f52719(var44, var43));
    }
    
    public static SubLObject f52719(final SubLObject var44, SubLObject var43) {
        if (var43 == module0820.UNPROVIDED) {
            var43 = (SubLObject)module0820.NIL;
        }
        SubLObject var45 = f52680(var44);
        SubLObject var46 = (SubLObject)module0820.NIL;
        var46 = var45.first();
        while (module0820.NIL != var45) {
            SubLObject var26_45 = f52698(var46);
            SubLObject var47 = (SubLObject)module0820.NIL;
            var47 = var26_45.first();
            while (module0820.NIL != var26_45) {
                final SubLObject var49;
                final SubLObject var48 = var49 = f52670(var47);
                if (module0820.NIL == conses_high.member(var49, var43, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var43 = (SubLObject)ConsesLow.cons(var49, var43);
                }
                var26_45 = var26_45.rest();
                var47 = var26_45.first();
            }
            SubLObject var26_46 = f52699(var46);
            SubLObject var50 = (SubLObject)module0820.NIL;
            var50 = var26_46.first();
            while (module0820.NIL != var26_46) {
                final SubLObject var51 = var50;
                if (module0820.NIL == conses_high.member(var51, var43, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var43 = (SubLObject)ConsesLow.cons(var51, var43);
                }
                var26_46 = var26_46.rest();
                var50 = var26_46.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var43;
    }
    
    public static SubLObject f52718(final SubLObject var44, SubLObject var43) {
        if (var43 == module0820.UNPROVIDED) {
            var43 = (SubLObject)module0820.NIL;
        }
        SubLObject var45 = f52681(var44);
        SubLObject var46 = (SubLObject)module0820.NIL;
        var46 = var45.first();
        while (module0820.NIL != var45) {
            SubLObject var26_47 = f52703(var46);
            SubLObject var47 = (SubLObject)module0820.NIL;
            var47 = var26_47.first();
            while (module0820.NIL != var26_47) {
                final SubLObject var49;
                final SubLObject var48 = var49 = f52670(var47);
                if (module0820.NIL == conses_high.member(var49, var43, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var43 = (SubLObject)ConsesLow.cons(var49, var43);
                }
                var26_47 = var26_47.rest();
                var47 = var26_47.first();
            }
            SubLObject var26_48 = f52704(var46);
            SubLObject var50 = (SubLObject)module0820.NIL;
            var50 = var26_48.first();
            while (module0820.NIL != var26_48) {
                final SubLObject var51 = var50;
                if (module0820.NIL == conses_high.member(var51, var43, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var43 = (SubLObject)ConsesLow.cons(var51, var43);
                }
                var26_48 = var26_48.rest();
                var50 = var26_48.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var43;
    }
    
    public static SubLObject f52720(final SubLObject var49, final SubLObject var50) {
        SubLObject var51 = (SubLObject)module0820.NIL;
        SubLObject var52 = (SubLObject)module0820.NIL;
        SubLObject var53 = f52680(var49);
        SubLObject var54 = (SubLObject)module0820.NIL;
        var54 = var53.first();
        while (module0820.NIL != var53) {
            SubLObject var26_51 = f52698(var54);
            SubLObject var55 = (SubLObject)module0820.NIL;
            var55 = var26_51.first();
            while (module0820.NIL != var26_51) {
                if (module0820.NIL != Strings.string_equal(var50, f52670(var55), (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED)) {
                    final SubLObject var56 = var55;
                    if (module0820.NIL == conses_high.member(var56, var51, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                        var51 = (SubLObject)ConsesLow.cons(var56, var51);
                    }
                }
                var26_51 = var26_51.rest();
                var55 = var26_51.first();
            }
            var53 = var53.rest();
            var54 = var53.first();
        }
        var53 = f52681(var49);
        SubLObject var57 = (SubLObject)module0820.NIL;
        var57 = var53.first();
        while (module0820.NIL != var53) {
            SubLObject var26_52 = f52703(var57);
            SubLObject var55 = (SubLObject)module0820.NIL;
            var55 = var26_52.first();
            while (module0820.NIL != var26_52) {
                if (module0820.NIL != Strings.string_equal(var50, f52670(var55), (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED)) {
                    final SubLObject var56 = var55;
                    if (module0820.NIL == conses_high.member(var56, var52, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                        var52 = (SubLObject)ConsesLow.cons(var56, var52);
                    }
                }
                var26_52 = var26_52.rest();
                var55 = var26_52.first();
            }
            var53 = var53.rest();
            var57 = var53.first();
        }
        return Values.values(var51, var52);
    }
    
    public static SubLObject f52721(final SubLObject var53, final SubLObject var50) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)module0820.NIL;
        SubLObject var56 = (SubLObject)module0820.NIL;
        SubLObject var57 = var53;
        SubLObject var58 = (SubLObject)module0820.NIL;
        var58 = var57.first();
        while (module0820.NIL != var57) {
            var54.resetMultipleValues();
            final SubLObject var59 = f52720(var58, var50);
            final SubLObject var60 = var54.secondMultipleValue();
            var54.resetMultipleValues();
            if (module0820.NIL != var59) {
                if (module0820.NIL == var55) {
                    var55 = var59;
                }
                else {
                    var55 = conses_high.union(var59, var55, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
                }
            }
            if (module0820.NIL != var60) {
                if (module0820.NIL == var56) {
                    var56 = var60;
                }
                else {
                    var56 = conses_high.union(var60, var56, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
                }
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return Values.values(var55, var56);
    }
    
    public static SubLObject f52722(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0820.NIL;
        SubLObject var59 = (SubLObject)module0820.NIL;
        final SubLObject var60 = module0820.$g6525$.currentBinding(var57);
        final SubLObject var61 = module0820.$g6526$.currentBinding(var57);
        try {
            module0820.$g6525$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED), var57);
            module0820.$g6526$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED), var57);
            SubLObject var62 = f52684(var56);
            SubLObject var63 = (SubLObject)module0820.NIL;
            var63 = var62.first();
            while (module0820.NIL != var62) {
                f52723(var63);
                var62 = var62.rest();
                var63 = var62.first();
            }
            var62 = f52682(var56);
            SubLObject var64 = (SubLObject)module0820.NIL;
            var64 = var62.first();
            while (module0820.NIL != var62) {
                f52724(var64);
                var62 = var62.rest();
                var64 = var62.first();
            }
            var58 = module0077.f5312(module0820.$g6525$.getDynamicValue(var57));
            var59 = module0077.f5312(module0820.$g6526$.getDynamicValue(var57));
        }
        finally {
            module0820.$g6526$.rebind(var61, var57);
            module0820.$g6525$.rebind(var60, var57);
        }
        var58 = Sort.sort(var58, Symbols.symbol_function((SubLObject)module0820.$ic12$), Symbols.symbol_function((SubLObject)module0820.$ic13$));
        var59 = Sort.sort(var59, Symbols.symbol_function((SubLObject)module0820.$ic12$), Symbols.symbol_function((SubLObject)module0820.$ic13$));
        return Values.values(var58, var59);
    }
    
    public static SubLObject f52725(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)module0820.NIL;
        SubLObject var65 = (SubLObject)module0820.NIL;
        final SubLObject var66 = module0820.$g6525$.currentBinding(var63);
        final SubLObject var67 = module0820.$g6526$.currentBinding(var63);
        try {
            module0820.$g6525$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED), var63);
            module0820.$g6526$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED), var63);
            SubLObject var68 = f52688(var62);
            SubLObject var69 = (SubLObject)module0820.NIL;
            var69 = var68.first();
            while (module0820.NIL != var68) {
                f52723(var69);
                var68 = var68.rest();
                var69 = var68.first();
            }
            var68 = f52682(var62);
            SubLObject var70 = (SubLObject)module0820.NIL;
            var70 = var68.first();
            while (module0820.NIL != var68) {
                f52724(var70);
                var68 = var68.rest();
                var70 = var68.first();
            }
            var64 = module0077.f5312(module0820.$g6525$.getDynamicValue(var63));
            var65 = module0077.f5312(module0820.$g6526$.getDynamicValue(var63));
        }
        finally {
            module0820.$g6526$.rebind(var67, var63);
            module0820.$g6525$.rebind(var66, var63);
        }
        var64 = Sort.sort(var64, Symbols.symbol_function((SubLObject)module0820.$ic12$), Symbols.symbol_function((SubLObject)module0820.$ic13$));
        var65 = Sort.sort(var65, Symbols.symbol_function((SubLObject)module0820.$ic12$), Symbols.symbol_function((SubLObject)module0820.$ic13$));
        return Values.values(var64, var65);
    }
    
    public static SubLObject f52723(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0820.NIL == module0077.f5320(var19, module0820.$g6525$.getDynamicValue(var20))) {
            module0077.f5326(var19, module0820.$g6525$.getDynamicValue(var20));
            SubLObject var21 = f52684(var19);
            SubLObject var22 = (SubLObject)module0820.NIL;
            var22 = var21.first();
            while (module0820.NIL != var21) {
                f52723(var22);
                var21 = var21.rest();
                var22 = var21.first();
            }
            var21 = f52682(var19);
            SubLObject var23 = (SubLObject)module0820.NIL;
            var23 = var21.first();
            while (module0820.NIL != var21) {
                f52724(var23);
                var21 = var21.rest();
                var23 = var21.first();
            }
        }
        return var19;
    }
    
    public static SubLObject f52724(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0820.NIL == module0077.f5320(var20, module0820.$g6526$.getDynamicValue(var21))) {
            module0077.f5326(var20, module0820.$g6526$.getDynamicValue(var21));
            SubLObject var22 = f52688(var20);
            SubLObject var23 = (SubLObject)module0820.NIL;
            var23 = var22.first();
            while (module0820.NIL != var22) {
                f52723(var23);
                var22 = var22.rest();
                var23 = var22.first();
            }
            var22 = f52687(var20);
            SubLObject var24 = (SubLObject)module0820.NIL;
            var24 = var22.first();
            while (module0820.NIL != var22) {
                f52724(var24);
                var22 = var22.rest();
                var24 = var22.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f52726(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        var57.resetMultipleValues();
        final SubLObject var58 = f52722(var56);
        final SubLObject var59 = var57.secondMultipleValue();
        var57.resetMultipleValues();
        SubLObject var60 = (SubLObject)module0820.NIL;
        SubLObject var61 = var58;
        SubLObject var62 = (SubLObject)module0820.NIL;
        var62 = var61.first();
        while (module0820.NIL != var61) {
            final SubLObject var63 = f52670(var62);
            if (module0820.NIL != var63) {
                final SubLObject var64 = var63;
                if (module0820.NIL == conses_high.member(var64, var60, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var60 = (SubLObject)ConsesLow.cons(var64, var60);
                }
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        var61 = var59;
        SubLObject var65 = (SubLObject)module0820.NIL;
        var65 = var61.first();
        while (module0820.NIL != var61) {
            final SubLObject var63 = f52676(var65);
            if (module0820.NIL != var63) {
                final SubLObject var64 = var63;
                if (module0820.NIL == conses_high.member(var64, var60, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var60 = (SubLObject)ConsesLow.cons(var64, var60);
                }
            }
            var61 = var61.rest();
            var65 = var61.first();
        }
        var60 = Sort.sort(var60, Symbols.symbol_function((SubLObject)module0820.$ic12$), (SubLObject)module0820.UNPROVIDED);
        return var60;
    }
    
    public static SubLObject f52727(final SubLObject var56) {
        final SubLObject var57 = f52726(var56);
        final SubLObject var58 = module0035.f2378(var57, Symbols.symbol_function((SubLObject)module0820.$ic14$), (SubLObject)module0820.UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f52728(final SubLObject var66) {
        return f52727(var66);
    }
    
    public static SubLObject f52729(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0034.$g879$.getDynamicValue(var67);
        SubLObject var69 = (SubLObject)module0820.NIL;
        if (module0820.NIL == var68) {
            return f52728(var66);
        }
        var69 = module0034.f1857(var68, (SubLObject)module0820.$ic15$, (SubLObject)module0820.UNPROVIDED);
        if (module0820.NIL == var69) {
            var69 = module0034.f1807(module0034.f1842(var68), (SubLObject)module0820.$ic15$, (SubLObject)module0820.ONE_INTEGER, (SubLObject)module0820.NIL, (SubLObject)module0820.EQ, (SubLObject)module0820.UNPROVIDED);
            module0034.f1860(var68, (SubLObject)module0820.$ic15$, var69);
        }
        SubLObject var70 = module0034.f1814(var69, var66, (SubLObject)module0820.$ic2$);
        if (var70 == module0820.$ic2$) {
            var70 = Values.arg2(var67.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52728(var66)));
            module0034.f1816(var69, var66, var70, (SubLObject)module0820.UNPROVIDED);
        }
        return module0034.f1959(var70);
    }
    
    public static SubLObject f52730(final SubLObject var56, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        var66.resetMultipleValues();
        final SubLObject var67 = f52722(var56);
        final SubLObject var68 = var66.secondMultipleValue();
        var66.resetMultipleValues();
        SubLObject var69 = (SubLObject)module0820.NIL;
        SubLObject var70 = (SubLObject)module0820.NIL;
        SubLObject var71 = var67;
        SubLObject var72 = (SubLObject)module0820.NIL;
        var72 = var71.first();
        while (module0820.NIL != var71) {
            if (var65.equal(f52670(var72))) {
                var69 = (SubLObject)ConsesLow.cons(var72, var69);
            }
            var71 = var71.rest();
            var72 = var71.first();
        }
        var71 = var68;
        SubLObject var73 = (SubLObject)module0820.NIL;
        var73 = var71.first();
        while (module0820.NIL != var71) {
            if (var65.equal(f52676(var73))) {
                var70 = (SubLObject)ConsesLow.cons(var73, var70);
            }
            var71 = var71.rest();
            var73 = var71.first();
        }
        return Values.values(Sequences.nreverse(var69), Sequences.nreverse(var70));
    }
    
    public static SubLObject f52731(final SubLObject var22, final SubLObject var69) {
        final SubLObject var70 = module0067.f4880(Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED);
        final SubLObject var71 = module0055.f4017();
        SubLObject var72 = (SubLObject)module0820.NIL;
        module0067.f4886(var70, var22, (SubLObject)module0820.NIL);
        module0055.f4021(var22, var71);
        while (module0820.NIL == module0055.f4019(var71)) {
            final SubLObject var73 = module0055.f4023(var71);
            final SubLObject var74 = f52684(var73);
            if (module0820.NIL == var72) {
                SubLObject var75 = var74;
                SubLObject var76 = (SubLObject)module0820.NIL;
                var76 = var75.first();
                while (module0820.NIL == var72 && module0820.NIL != var75) {
                    if (module0820.$ic16$ == module0067.f4885(var70, var76, (SubLObject)module0820.$ic16$)) {
                        module0067.f4886(var70, var76, var73);
                        var72 = Equality.eq(var76, var69);
                        if (module0820.NIL != var72) {
                            module0055.f4018(var71);
                        }
                        else {
                            module0055.f4021(var76, var71);
                        }
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        SubLObject var77 = (SubLObject)module0820.NIL;
        if (module0820.NIL != var72) {
            SubLObject var78;
            for (var78 = (SubLObject)module0820.NIL, var78 = var69; module0820.NIL != var78; var78 = module0067.f4885(var70, var78, (SubLObject)module0820.UNPROVIDED)) {
                var77 = (SubLObject)ConsesLow.cons(var78, var77);
            }
        }
        return Values.values(var77, module0067.f4861(var70));
    }
    
    public static SubLObject f52732(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        var63.resetMultipleValues();
        final SubLObject var64 = f52725(var62);
        final SubLObject var65 = var63.secondMultipleValue();
        var63.resetMultipleValues();
        SubLObject var66 = (SubLObject)module0820.NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0820.NIL;
        var68 = var67.first();
        while (module0820.NIL != var67) {
            final SubLObject var69 = f52670(var68);
            if (module0820.NIL != var69) {
                final SubLObject var70 = var69;
                if (module0820.NIL == conses_high.member(var70, var66, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var66 = (SubLObject)ConsesLow.cons(var70, var66);
                }
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        var67 = var65;
        SubLObject var71 = (SubLObject)module0820.NIL;
        var71 = var67.first();
        while (module0820.NIL != var67) {
            final SubLObject var69 = f52676(var71);
            if (module0820.NIL != var69) {
                final SubLObject var70 = var69;
                if (module0820.NIL == conses_high.member(var70, var66, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                    var66 = (SubLObject)ConsesLow.cons(var70, var66);
                }
            }
            var67 = var67.rest();
            var71 = var67.first();
        }
        var66 = Sort.sort(var66, Symbols.symbol_function((SubLObject)module0820.$ic12$), (SubLObject)module0820.UNPROVIDED);
        return var66;
    }
    
    public static SubLObject f52733(final SubLObject var62) {
        final SubLObject var63 = f52732(var62);
        final SubLObject var64 = module0035.f2378(var63, Symbols.symbol_function((SubLObject)module0820.$ic14$), (SubLObject)module0820.UNPROVIDED);
        return var64;
    }
    
    public static SubLObject f52734(final SubLObject var75) {
        return f52733(var75);
    }
    
    public static SubLObject f52735(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        final SubLObject var77 = module0034.$g879$.getDynamicValue(var76);
        SubLObject var78 = (SubLObject)module0820.NIL;
        if (module0820.NIL == var77) {
            return f52734(var75);
        }
        var78 = module0034.f1857(var77, (SubLObject)module0820.$ic17$, (SubLObject)module0820.UNPROVIDED);
        if (module0820.NIL == var78) {
            var78 = module0034.f1807(module0034.f1842(var77), (SubLObject)module0820.$ic17$, (SubLObject)module0820.ONE_INTEGER, (SubLObject)module0820.NIL, (SubLObject)module0820.EQ, (SubLObject)module0820.UNPROVIDED);
            module0034.f1860(var77, (SubLObject)module0820.$ic17$, var78);
        }
        SubLObject var79 = module0034.f1814(var78, var75, (SubLObject)module0820.$ic2$);
        if (var79 == module0820.$ic2$) {
            var79 = Values.arg2(var76.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52734(var75)));
            module0034.f1816(var78, var75, var79, (SubLObject)module0820.UNPROVIDED);
        }
        return module0034.f1959(var79);
    }
    
    public static SubLObject f52736(final SubLObject var62, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        var66.resetMultipleValues();
        final SubLObject var67 = f52725(var62);
        final SubLObject var68 = var66.secondMultipleValue();
        var66.resetMultipleValues();
        SubLObject var69 = (SubLObject)module0820.NIL;
        SubLObject var70 = (SubLObject)module0820.NIL;
        SubLObject var71 = var67;
        SubLObject var72 = (SubLObject)module0820.NIL;
        var72 = var71.first();
        while (module0820.NIL != var71) {
            if (var65.equal(f52670(var72))) {
                var69 = (SubLObject)ConsesLow.cons(var72, var69);
            }
            var71 = var71.rest();
            var72 = var71.first();
        }
        var71 = var68;
        SubLObject var73 = (SubLObject)module0820.NIL;
        var73 = var71.first();
        while (module0820.NIL != var71) {
            if (var65.equal(f52676(var73))) {
                var70 = (SubLObject)ConsesLow.cons(var73, var70);
            }
            var71 = var71.rest();
            var73 = var71.first();
        }
        return Values.values(Sequences.nreverse(var69), Sequences.nreverse(var70));
    }
    
    public static SubLObject f52737(final SubLObject var76, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = f52738(var76);
        final SubLObject var80 = f52738(var77);
        final SubLObject var81 = (SubLObject)ConsesLow.list((SubLObject)module0820.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0820.$ic19$, var79), var80);
        SubLObject var82 = (SubLObject)module0820.NIL;
        final SubLObject var83 = module0283.$g2626$.currentBinding(var78);
        final SubLObject var84 = module0283.$g2627$.currentBinding(var78);
        final SubLObject var85 = module0283.$g2628$.currentBinding(var78);
        final SubLObject var86 = module0283.$g2629$.currentBinding(var78);
        final SubLObject var87 = module0283.$g2630$.currentBinding(var78);
        try {
            module0283.$g2626$.bind((SubLObject)module0820.$ic20$, var78);
            module0283.$g2627$.bind((SubLObject)module0820.$ic18$, var78);
            module0283.$g2628$.bind((SubLObject)module0820.$ic19$, var78);
            module0283.$g2629$.bind((SubLObject)module0820.T, var78);
            module0283.$g2630$.bind((SubLObject)module0820.NIL, var78);
            var82 = module0283.f18771(module0283.f18769(module0283.f18761(module0283.f18771(module0283.f18766(var81)))));
        }
        finally {
            module0283.$g2630$.rebind(var87, var78);
            module0283.$g2629$.rebind(var86, var78);
            module0283.$g2628$.rebind(var85, var78);
            module0283.$g2627$.rebind(var84, var78);
            module0283.$g2626$.rebind(var83, var78);
        }
        return var82;
    }
    
    public static SubLObject f52738(final SubLObject var85) {
        return module0036.f2531(var85, Symbols.symbol_function((SubLObject)module0820.$ic21$), Symbols.symbol_function((SubLObject)module0820.$ic22$), (SubLObject)module0820.UNPROVIDED);
    }
    
    public static SubLObject f52739(final SubLObject var85) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var85.isSymbol() && !var85.isKeyword() && var85 != module0820.T && var85 != module0820.NIL);
    }
    
    public static SubLObject f52740(final SubLObject var31) {
        return Symbols.make_keyword(Symbols.symbol_name(var31));
    }
    
    public static SubLObject f52741(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic23$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_88 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52742(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_88, var12);
                }
            }
            finally {
                final SubLObject var15_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_89, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52742(final SubLObject var92) {
        final SubLObject var93 = f52664(var92);
        SubLObject var94 = (SubLObject)module0820.NIL;
        SubLObject var95 = f52680(var92);
        SubLObject var96 = (SubLObject)module0820.NIL;
        var96 = var95.first();
        while (module0820.NIL != var95) {
            SubLObject var26_95;
            final SubLObject var97 = var26_95 = f52684(var96);
            SubLObject var98 = (SubLObject)module0820.NIL;
            var98 = var26_95.first();
            while (module0820.NIL != var26_95) {
                final SubLObject var99 = f52670(var98);
                if (module0820.NIL != var99) {
                    final SubLObject var100 = f52664(var99);
                    final SubLObject var101 = f52743(var93, var100);
                    if (module0820.NIL != var101) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var96, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var98, var99, var100), var101), var94);
                    }
                }
                var26_95 = var26_95.rest();
                var98 = var26_95.first();
            }
            SubLObject var26_96;
            final SubLObject var102 = var26_96 = f52682(var96);
            SubLObject var103 = (SubLObject)module0820.NIL;
            var103 = var26_96.first();
            while (module0820.NIL != var26_96) {
                final SubLObject var99 = f52676(var103);
                if (module0820.NIL != var99) {
                    final SubLObject var100 = f52664(var99);
                    final SubLObject var101 = f52743(var93, var100);
                    if (module0820.NIL != var101) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var96, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var103, var99, var100), var101), var94);
                    }
                }
                var26_96 = var26_96.rest();
                var103 = var26_96.first();
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        var95 = f52681(var92);
        SubLObject var104 = (SubLObject)module0820.NIL;
        var104 = var95.first();
        while (module0820.NIL != var95) {
            SubLObject var26_97;
            final SubLObject var97 = var26_97 = f52688(var104);
            SubLObject var98 = (SubLObject)module0820.NIL;
            var98 = var26_97.first();
            while (module0820.NIL != var26_97) {
                final SubLObject var99 = f52670(var98);
                if (module0820.NIL != var99) {
                    final SubLObject var100 = f52664(var99);
                    final SubLObject var101 = f52743(var93, var100);
                    if (module0820.NIL != var101) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var104, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var98, var99, var100), var101), var94);
                    }
                }
                var26_97 = var26_97.rest();
                var98 = var26_97.first();
            }
            SubLObject var26_98;
            final SubLObject var102 = var26_98 = f52687(var104);
            SubLObject var103 = (SubLObject)module0820.NIL;
            var103 = var26_98.first();
            while (module0820.NIL != var26_98) {
                final SubLObject var99 = f52676(var103);
                if (module0820.NIL != var99) {
                    final SubLObject var100 = f52664(var99);
                    final SubLObject var101 = f52743(var93, var100);
                    if (module0820.NIL != var101) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var104, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var103, var99, var100), var101), var94);
                    }
                }
                var26_98 = var26_98.rest();
                var103 = var26_98.first();
            }
            var95 = var95.rest();
            var104 = var95.first();
        }
        SubLObject var106;
        final SubLObject var105 = var106 = f52692(var92);
        SubLObject var107 = (SubLObject)module0820.NIL;
        var107 = var106.first();
        while (module0820.NIL != var106) {
            final SubLObject var108 = f52670(var107);
            if (module0820.NIL != var108) {
                final SubLObject var109 = f52664(var108);
                final SubLObject var110 = f52743(var93, var109);
                if (module0820.NIL != var110) {
                    var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var107, var108, var109), var110), var94);
                }
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        final SubLObject var111 = var106 = f52691(var92);
        SubLObject var112 = (SubLObject)module0820.NIL;
        var112 = var106.first();
        while (module0820.NIL != var106) {
            final SubLObject var108 = f52676(var112);
            if (module0820.NIL != var108) {
                final SubLObject var109 = f52664(var108);
                final SubLObject var110 = f52743(var93, var109);
                if (module0820.NIL != var110) {
                    var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92, var93), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var112, var108, var109), var110), var94);
                }
            }
            var106 = var106.rest();
            var112 = var106.first();
        }
        return Sequences.nreverse(var94);
    }
    
    public static SubLObject f52744(final SubLObject var76, final SubLObject var77) {
        return f52737(var76, var77);
    }
    
    public static SubLObject f52743(final SubLObject var76, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = module0034.$g879$.getDynamicValue(var78);
        SubLObject var80 = (SubLObject)module0820.NIL;
        if (module0820.NIL == var79) {
            return f52744(var76, var77);
        }
        var80 = module0034.f1857(var79, (SubLObject)module0820.$ic27$, (SubLObject)module0820.UNPROVIDED);
        if (module0820.NIL == var80) {
            var80 = module0034.f1807(module0034.f1842(var79), (SubLObject)module0820.$ic27$, (SubLObject)module0820.TWO_INTEGER, (SubLObject)module0820.NIL, (SubLObject)module0820.EQUAL, (SubLObject)module0820.UNPROVIDED);
            module0034.f1860(var79, (SubLObject)module0820.$ic27$, var80);
        }
        final SubLObject var81 = module0034.f1782(var76, var77);
        final SubLObject var82 = module0034.f1814(var80, var81, (SubLObject)module0820.UNPROVIDED);
        if (var82 != module0820.$ic2$) {
            SubLObject var83 = var82;
            SubLObject var84 = (SubLObject)module0820.NIL;
            var84 = var83.first();
            while (module0820.NIL != var83) {
                SubLObject var85 = var84.first();
                final SubLObject var86 = conses_high.second(var84);
                if (var76.equal(var85.first())) {
                    var85 = var85.rest();
                    if (module0820.NIL != var85 && module0820.NIL == var85.rest() && var77.equal(var85.first())) {
                        return module0034.f1959(var86);
                    }
                }
                var83 = var83.rest();
                var84 = var83.first();
            }
        }
        final SubLObject var87 = Values.arg2(var78.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52744(var76, var77)));
        module0034.f1836(var80, var81, var82, var87, (SubLObject)ConsesLow.list(var76, var77));
        return module0034.f1959(var87);
    }
    
    public static SubLObject f52745(SubLObject var110, SubLObject var111) {
        if (var110 == module0820.UNPROVIDED) {
            var110 = f52741((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var112 = var110;
        SubLObject var113 = (SubLObject)module0820.NIL;
        var113 = var112.first();
        while (module0820.NIL != var112) {
            f52746(var113, var111);
            var112 = var112.rest();
            var113 = var112.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52746(final SubLObject var112, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(var112, var112, (SubLObject)module0820.$ic28$);
        final SubLObject var113 = var112.rest();
        SubLObject var114 = var112.first();
        SubLObject var115 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var112, (SubLObject)module0820.$ic28$);
        var115 = var114.first();
        final SubLObject var116;
        var114 = (var116 = var114.rest());
        var114 = var113;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var112, (SubLObject)module0820.$ic28$);
        final SubLObject var118_119 = var114.rest();
        var114 = var114.first();
        SubLObject var117 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var112, (SubLObject)module0820.$ic28$);
        var117 = var114.first();
        final SubLObject var118;
        var114 = (var118 = var114.rest());
        var114 = var118_119;
        SubLObject var119 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var112, (SubLObject)module0820.$ic28$);
        var119 = var114.first();
        var114 = var114.rest();
        if (module0820.NIL == var114) {
            SubLObject var120 = var115;
            if (var120.eql((SubLObject)module0820.$ic26$)) {
                SubLObject var124_125;
                final SubLObject var122_123 = var124_125 = var116;
                SubLObject var121 = (SubLObject)module0820.NIL;
                SubLObject var122 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var124_125, var122_123, (SubLObject)module0820.$ic29$);
                var121 = var124_125.first();
                var124_125 = var124_125.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var124_125, var122_123, (SubLObject)module0820.$ic29$);
                var122 = var124_125.first();
                var124_125 = var124_125.rest();
                if (module0820.NIL == var124_125) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic30$, var121);
                    f52747(var122, var111);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var122_123, (SubLObject)module0820.$ic29$);
                }
            }
            else if (var120.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var129_130;
                final SubLObject var127_128 = var129_130 = var116;
                SubLObject var123 = (SubLObject)module0820.NIL;
                SubLObject var124 = (SubLObject)module0820.NIL;
                SubLObject var125 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)module0820.$ic31$);
                var123 = var129_130.first();
                var129_130 = var129_130.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)module0820.$ic31$);
                var124 = var129_130.first();
                var129_130 = var129_130.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)module0820.$ic31$);
                var125 = var129_130.first();
                var129_130 = var129_130.rest();
                if (module0820.NIL == var129_130) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic32$, var123, var124);
                    f52747(var125, var111);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var127_128, (SubLObject)module0820.$ic31$);
                }
            }
            else if (var120.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var134_135;
                final SubLObject var132_133 = var134_135 = var116;
                SubLObject var123 = (SubLObject)module0820.NIL;
                SubLObject var124 = (SubLObject)module0820.NIL;
                SubLObject var125 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)module0820.$ic31$);
                var123 = var134_135.first();
                var134_135 = var134_135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)module0820.$ic31$);
                var124 = var134_135.first();
                var134_135 = var134_135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)module0820.$ic31$);
                var125 = var134_135.first();
                var134_135 = var134_135.rest();
                if (module0820.NIL == var134_135) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic33$, var123, var124);
                    f52747(var125, var111);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var132_133, (SubLObject)module0820.$ic31$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic34$);
            var120 = var117;
            if (var120.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var138_139;
                final SubLObject var136_137 = var138_139 = var118;
                SubLObject var126 = (SubLObject)module0820.NIL;
                SubLObject var124 = (SubLObject)module0820.NIL;
                SubLObject var127 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var138_139, var136_137, (SubLObject)module0820.$ic35$);
                var126 = var138_139.first();
                var138_139 = var138_139.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var138_139, var136_137, (SubLObject)module0820.$ic35$);
                var124 = var138_139.first();
                var138_139 = var138_139.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var138_139, var136_137, (SubLObject)module0820.$ic35$);
                var127 = var138_139.first();
                var138_139 = var138_139.rest();
                if (module0820.NIL == var138_139) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic36$, var126, var124);
                    f52747(var127, var111);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var136_137, (SubLObject)module0820.$ic35$);
                }
            }
            else if (var120.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var144_145;
                final SubLObject var142_143 = var144_145 = var118;
                SubLObject var126 = (SubLObject)module0820.NIL;
                SubLObject var124 = (SubLObject)module0820.NIL;
                SubLObject var127 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0820.$ic35$);
                var126 = var144_145.first();
                var144_145 = var144_145.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0820.$ic35$);
                var124 = var144_145.first();
                var144_145 = var144_145.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0820.$ic35$);
                var127 = var144_145.first();
                var144_145 = var144_145.rest();
                if (module0820.NIL == var144_145) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic37$, var126, var124);
                    f52747(var127, var111);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var142_143, (SubLObject)module0820.$ic35$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic38$, f52748(var119));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var112, (SubLObject)module0820.$ic28$);
        }
        return var112;
    }
    
    public static SubLObject f52747(final SubLObject var146, final SubLObject var111) {
        return PrintLow.format(var111, (SubLObject)module0820.$ic39$, f52748(var146));
    }
    
    public static SubLObject f52748(final SubLObject var146) {
        return (SubLObject)((module0820.T == var146) ? module0820.$ic40$ : var146);
    }
    
    public static SubLObject f52749(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var14 = var11;
        module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic41$, var12);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
        module0012.$g83$.setDynamicValue(Sequences.length(var14), var12);
        module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
        final SubLObject var15 = module0012.$g75$.currentBinding(var12);
        final SubLObject var16 = module0012.$g76$.currentBinding(var12);
        final SubLObject var17 = module0012.$g77$.currentBinding(var12);
        final SubLObject var18 = module0012.$g78$.currentBinding(var12);
        try {
            module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
            module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
            module0012.$g77$.bind((SubLObject)module0820.T, var12);
            module0012.$g78$.bind(Time.get_universal_time(), var12);
            module0012.f478(module0012.$g82$.getDynamicValue(var12));
            SubLObject var19 = var14;
            SubLObject var20 = (SubLObject)module0820.NIL;
            var20 = var19.first();
            while (module0820.NIL != var19) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                SubLObject var22;
                final SubLObject var21 = var22 = f52750(var20);
                SubLObject var23 = (SubLObject)module0820.NIL;
                var23 = var22.first();
                while (module0820.NIL != var22) {
                    var13 = (SubLObject)ConsesLow.cons(var23, var13);
                    var22 = var22.rest();
                    var23 = var22.first();
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var18, var12);
            module0012.$g77$.rebind(var17, var12);
            module0012.$g76$.rebind(var16, var12);
            module0012.$g75$.rebind(var15, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52750(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        SubLObject var94 = f52680(var92);
        SubLObject var95 = (SubLObject)module0820.NIL;
        var95 = var94.first();
        while (module0820.NIL != var94) {
            SubLObject var26_150;
            final SubLObject var96 = var26_150 = f52684(var95);
            SubLObject var97 = (SubLObject)module0820.NIL;
            var97 = var26_150.first();
            while (module0820.NIL != var26_150) {
                final SubLObject var98 = f52670(var97);
                if (module0820.NIL != var98 && !var92.equal(var98) && module0820.NIL != module0811.f51804(var97)) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var97, var98)), var93);
                }
                var26_150 = var26_150.rest();
                var97 = var26_150.first();
            }
            SubLObject var26_151;
            final SubLObject var99 = var26_151 = f52682(var95);
            SubLObject var100 = (SubLObject)module0820.NIL;
            var100 = var26_151.first();
            while (module0820.NIL != var26_151) {
                final SubLObject var98 = f52676(var100);
                if (module0820.NIL != var98 && !var92.equal(var98) && module0820.NIL != module0811.f51803(var100)) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var100, var98)), var93);
                }
                var26_151 = var26_151.rest();
                var100 = var26_151.first();
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        var94 = f52681(var92);
        SubLObject var101 = (SubLObject)module0820.NIL;
        var101 = var94.first();
        while (module0820.NIL != var94) {
            SubLObject var26_152;
            final SubLObject var96 = var26_152 = f52688(var101);
            SubLObject var97 = (SubLObject)module0820.NIL;
            var97 = var26_152.first();
            while (module0820.NIL != var26_152) {
                final SubLObject var98 = f52670(var97);
                if (module0820.NIL != var98 && !var92.equal(var98) && module0820.NIL != module0811.f51804(var97)) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var101, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var97, var98)), var93);
                }
                var26_152 = var26_152.rest();
                var97 = var26_152.first();
            }
            SubLObject var26_153;
            final SubLObject var99 = var26_153 = f52687(var101);
            SubLObject var100 = (SubLObject)module0820.NIL;
            var100 = var26_153.first();
            while (module0820.NIL != var26_153) {
                final SubLObject var98 = f52676(var100);
                if (module0820.NIL != var98 && !var92.equal(var98) && module0820.NIL != module0811.f51803(var100)) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var101, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var100, var98)), var93);
                }
                var26_153 = var26_153.rest();
                var100 = var26_153.first();
            }
            var94 = var94.rest();
            var101 = var94.first();
        }
        SubLObject var103;
        final SubLObject var102 = var103 = f52692(var92);
        SubLObject var104 = (SubLObject)module0820.NIL;
        var104 = var103.first();
        while (module0820.NIL != var103) {
            final SubLObject var105 = f52670(var104);
            if (module0820.NIL != var105 && !var92.equal(var105) && module0820.NIL != module0811.f51804(var104)) {
                var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var104, var105)), var93);
            }
            var103 = var103.rest();
            var104 = var103.first();
        }
        final SubLObject var106 = var103 = f52691(var92);
        SubLObject var107 = (SubLObject)module0820.NIL;
        var107 = var103.first();
        while (module0820.NIL != var103) {
            final SubLObject var105 = f52676(var107);
            if (module0820.NIL != var105 && !var92.equal(var105) && module0820.NIL != module0811.f51803(var107)) {
                var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var107, var105)), var93);
            }
            var103 = var103.rest();
            var107 = var103.first();
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f52751(SubLObject var154, SubLObject var111) {
        if (var154 == module0820.UNPROVIDED) {
            var154 = f52749((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var155 = var154;
        SubLObject var156 = (SubLObject)module0820.NIL;
        var156 = var155.first();
        while (module0820.NIL != var155) {
            f52752(var156, var111);
            var155 = var155.rest();
            var156 = var155.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52752(final SubLObject var155, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)module0820.$ic42$);
        final SubLObject var156 = var155.rest();
        SubLObject var157 = var155.first();
        SubLObject var158 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        var158 = var157.first();
        final SubLObject var159;
        var157 = (var159 = var157.rest());
        var157 = var156;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        final SubLObject var159_160 = var157.rest();
        var157 = var157.first();
        SubLObject var160 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        var160 = var157.first();
        final SubLObject var161;
        var157 = (var161 = var157.rest());
        var157 = var159_160;
        if (module0820.NIL == var157) {
            SubLObject var162 = var158;
            if (var162.eql((SubLObject)module0820.$ic26$)) {
                SubLObject var163_164;
                final SubLObject var161_162 = var163_164 = var159;
                SubLObject var163 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var163_164, var161_162, (SubLObject)module0820.$ic43$);
                var163 = var163_164.first();
                var163_164 = var163_164.rest();
                if (module0820.NIL == var163_164) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic30$, var163);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var161_162, (SubLObject)module0820.$ic43$);
                }
            }
            else if (var162.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var167_168;
                final SubLObject var165_166 = var167_168 = var159;
                SubLObject var164 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var167_168, var165_166, (SubLObject)module0820.$ic44$);
                var164 = var167_168.first();
                var167_168 = var167_168.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var167_168, var165_166, (SubLObject)module0820.$ic44$);
                var165 = var167_168.first();
                var167_168 = var167_168.rest();
                if (module0820.NIL == var167_168) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic32$, var164, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var165_166, (SubLObject)module0820.$ic44$);
                }
            }
            else if (var162.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var171_172;
                final SubLObject var169_170 = var171_172 = var159;
                SubLObject var164 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var171_172, var169_170, (SubLObject)module0820.$ic44$);
                var164 = var171_172.first();
                var171_172 = var171_172.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var171_172, var169_170, (SubLObject)module0820.$ic44$);
                var165 = var171_172.first();
                var171_172 = var171_172.rest();
                if (module0820.NIL == var171_172) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic33$, var164, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var169_170, (SubLObject)module0820.$ic44$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic45$);
            var162 = var160;
            if (var162.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var175_176;
                final SubLObject var173_174 = var175_176 = var161;
                SubLObject var166 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var175_176, var173_174, (SubLObject)module0820.$ic46$);
                var166 = var175_176.first();
                var175_176 = var175_176.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var175_176, var173_174, (SubLObject)module0820.$ic46$);
                var165 = var175_176.first();
                var175_176 = var175_176.rest();
                if (module0820.NIL == var175_176) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic36$, var166, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var173_174, (SubLObject)module0820.$ic46$);
                }
            }
            else if (var162.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var179_180;
                final SubLObject var177_178 = var179_180 = var161;
                SubLObject var166 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var179_180, var177_178, (SubLObject)module0820.$ic46$);
                var166 = var179_180.first();
                var179_180 = var179_180.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var179_180, var177_178, (SubLObject)module0820.$ic46$);
                var165 = var179_180.first();
                var179_180 = var179_180.rest();
                if (module0820.NIL == var179_180) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic37$, var166, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var177_178, (SubLObject)module0820.$ic46$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)module0820.$ic42$);
        }
        return var155;
    }
    
    public static SubLObject f52753(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic47$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_182 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52754(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_182, var12);
                }
            }
            finally {
                final SubLObject var15_183 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_183, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52754(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        SubLObject var94 = f52680(var92);
        SubLObject var95 = (SubLObject)module0820.NIL;
        var95 = var94.first();
        while (module0820.NIL != var94) {
            final SubLObject var96 = f52671(var95);
            SubLObject var26_188;
            final SubLObject var97 = var26_188 = f52683(var95);
            SubLObject var98 = (SubLObject)module0820.NIL;
            var98 = var26_188.first();
            while (module0820.NIL != var26_188) {
                final SubLObject var99 = f52676(var98);
                if (module0820.NIL != var99) {
                    final SubLObject var100 = f52677(var98);
                    if (module0820.NIL != f52755(var92, var96, var99, var100, (SubLObject)module0820.$ic25$, var98)) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var98, var99)), var93);
                    }
                }
                var26_188 = var26_188.rest();
                var98 = var26_188.first();
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f52756(SubLObject var154, SubLObject var111) {
        if (var154 == module0820.UNPROVIDED) {
            var154 = f52753((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var155 = var154;
        SubLObject var156 = (SubLObject)module0820.NIL;
        var156 = var155.first();
        while (module0820.NIL != var155) {
            f52757(var156, var111);
            var155 = var155.rest();
            var156 = var155.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52757(final SubLObject var155, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)module0820.$ic42$);
        final SubLObject var156 = var155.rest();
        SubLObject var157 = var155.first();
        SubLObject var158 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        var158 = var157.first();
        final SubLObject var159;
        var157 = (var159 = var157.rest());
        var157 = var156;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        final SubLObject var194_195 = var157.rest();
        var157 = var157.first();
        SubLObject var160 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic42$);
        var160 = var157.first();
        final SubLObject var161;
        var157 = (var161 = var157.rest());
        var157 = var194_195;
        if (module0820.NIL == var157) {
            SubLObject var162 = var158;
            if (var162.eql((SubLObject)module0820.$ic26$)) {
                SubLObject var198_199;
                final SubLObject var196_197 = var198_199 = var159;
                SubLObject var163 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var198_199, var196_197, (SubLObject)module0820.$ic43$);
                var163 = var198_199.first();
                var198_199 = var198_199.rest();
                if (module0820.NIL == var198_199) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic30$, var163);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var196_197, (SubLObject)module0820.$ic43$);
                }
            }
            else if (var162.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var202_203;
                final SubLObject var200_201 = var202_203 = var159;
                SubLObject var164 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var202_203, var200_201, (SubLObject)module0820.$ic44$);
                var164 = var202_203.first();
                var202_203 = var202_203.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var202_203, var200_201, (SubLObject)module0820.$ic44$);
                var165 = var202_203.first();
                var202_203 = var202_203.rest();
                if (module0820.NIL == var202_203) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic32$, var164, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var200_201, (SubLObject)module0820.$ic44$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic48$);
            var162 = var160;
            if (var162.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var206_207;
                final SubLObject var204_205 = var206_207 = var161;
                SubLObject var166 = (SubLObject)module0820.NIL;
                SubLObject var165 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0820.$ic46$);
                var166 = var206_207.first();
                var206_207 = var206_207.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0820.$ic46$);
                var165 = var206_207.first();
                var206_207 = var206_207.rest();
                if (module0820.NIL == var206_207) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic37$, var166, var165);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var204_205, (SubLObject)module0820.$ic46$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic49$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)module0820.$ic42$);
        }
        return var155;
    }
    
    public static SubLObject f52758(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic50$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_209 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52759(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_209, var12);
                }
            }
            finally {
                final SubLObject var15_210 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_210, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52759(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = (SubLObject)module0820.NIL;
        SubLObject var95 = f52680(var92);
        SubLObject var96 = (SubLObject)module0820.NIL;
        var96 = var95.first();
        while (module0820.NIL != var95) {
            final SubLObject var97 = f52671(var96);
            SubLObject var26_213;
            final SubLObject var98 = var26_213 = f52684(var96);
            SubLObject var99 = (SubLObject)module0820.NIL;
            var99 = var26_213.first();
            while (module0820.NIL != var26_213) {
                if (module0820.NIL != f52669(var99)) {
                    final SubLObject var100 = f52670(var99);
                    if (module0820.NIL != var100) {
                        final SubLObject var101 = f52671(var99);
                        var93.resetMultipleValues();
                        final SubLObject var102 = f52760(var92, var97, var100, var101, var99);
                        final SubLObject var103 = var93.secondMultipleValue();
                        var93.resetMultipleValues();
                        if (module0820.NIL != var102 || module0820.NIL != var103) {
                            var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var96, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var99, var100), var102, var103), var94);
                        }
                    }
                }
                var26_213 = var26_213.rest();
                var99 = var26_213.first();
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        var95 = f52681(var92);
        SubLObject var104 = (SubLObject)module0820.NIL;
        var104 = var95.first();
        while (module0820.NIL != var95) {
            final SubLObject var97 = f52677(var104);
            SubLObject var26_214;
            final SubLObject var98 = var26_214 = f52688(var104);
            SubLObject var99 = (SubLObject)module0820.NIL;
            var99 = var26_214.first();
            while (module0820.NIL != var26_214) {
                final SubLObject var100 = f52670(var99);
                if (module0820.NIL != var100) {
                    final SubLObject var101 = f52671(var99);
                    var93.resetMultipleValues();
                    final SubLObject var102 = f52755(var92, var97, var100, var101, (SubLObject)module0820.$ic24$, var99);
                    final SubLObject var103 = var93.secondMultipleValue();
                    var93.resetMultipleValues();
                    if (module0820.NIL != var102 || module0820.NIL != var103) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var104, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var99, var100), var102, var103), var94);
                    }
                }
                var26_214 = var26_214.rest();
                var99 = var26_214.first();
            }
            SubLObject var26_215;
            final SubLObject var105 = var26_215 = f52687(var104);
            SubLObject var106 = (SubLObject)module0820.NIL;
            var106 = var26_215.first();
            while (module0820.NIL != var26_215) {
                final SubLObject var100 = f52676(var106);
                if (module0820.NIL != var100) {
                    final SubLObject var101 = f52677(var106);
                    var93.resetMultipleValues();
                    final SubLObject var102 = f52755(var92, var97, var100, var101, (SubLObject)module0820.$ic25$, var106);
                    final SubLObject var103 = var93.secondMultipleValue();
                    var93.resetMultipleValues();
                    if (module0820.NIL != var102 || module0820.NIL != var103) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var104, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var106, var100), var102, var103), var94);
                    }
                }
                var26_215 = var26_215.rest();
                var106 = var26_215.first();
            }
            var95 = var95.rest();
            var104 = var95.first();
        }
        SubLObject var108;
        final SubLObject var107 = var108 = f52692(var92);
        SubLObject var109 = (SubLObject)module0820.NIL;
        var109 = var108.first();
        while (module0820.NIL != var108) {
            final SubLObject var110 = f52670(var109);
            if (module0820.NIL != var110) {
                final SubLObject var111 = f52671(var109);
                SubLObject var26_216;
                final SubLObject var112 = var26_216 = f52695(var92, var109);
                SubLObject var113 = (SubLObject)module0820.NIL;
                var113 = var26_216.first();
                while (module0820.NIL != var26_216) {
                    var93.resetMultipleValues();
                    final SubLObject var102 = f52755(var92, var113, var110, var111, (SubLObject)module0820.$ic24$, var109);
                    final SubLObject var103 = var93.secondMultipleValue();
                    var93.resetMultipleValues();
                    if (module0820.NIL != var102 || module0820.NIL != var103) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92, var113), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var109, var110), var102, var103), var94);
                    }
                    var26_216 = var26_216.rest();
                    var113 = var26_216.first();
                }
            }
            var108 = var108.rest();
            var109 = var108.first();
        }
        final SubLObject var114 = var108 = f52691(var92);
        SubLObject var115 = (SubLObject)module0820.NIL;
        var115 = var108.first();
        while (module0820.NIL != var108) {
            final SubLObject var110 = f52676(var115);
            if (module0820.NIL != var110) {
                final SubLObject var111 = f52677(var115);
                SubLObject var26_217;
                final SubLObject var112 = var26_217 = f52694(var92, var115);
                SubLObject var113 = (SubLObject)module0820.NIL;
                var113 = var26_217.first();
                while (module0820.NIL != var26_217) {
                    var93.resetMultipleValues();
                    final SubLObject var102 = f52755(var92, var113, var110, var111, (SubLObject)module0820.$ic25$, var115);
                    final SubLObject var103 = var93.secondMultipleValue();
                    var93.resetMultipleValues();
                    if (module0820.NIL != var102 || module0820.NIL != var103) {
                        var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92, var113), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var115, var110), var102, var103), var94);
                    }
                    var26_217 = var26_217.rest();
                    var113 = var26_217.first();
                }
            }
            var108 = var108.rest();
            var115 = var108.first();
        }
        return Sequences.nreverse(var94);
    }
    
    public static SubLObject f52760(final SubLObject var220, final SubLObject var221, final SubLObject var222, final SubLObject var223, final SubLObject var224) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        SubLObject var226 = (SubLObject)module0820.NIL;
        SubLObject var227 = (SubLObject)module0820.NIL;
        final SubLObject var228 = f52729(var224);
        if (module0820.NIL != var228 && module0820.NIL == f52657(var228, var220)) {
            var225.resetMultipleValues();
            final SubLObject var226_227 = f52730(var224, var228);
            final SubLObject var228_229 = var225.secondMultipleValue();
            var225.resetMultipleValues();
            var226 = var226_227;
            var227 = var228_229;
        }
        if ((module0820.NIL != f52660(var222, var220) || (var220.equal(var222) && var223.numG(var221))) && module0820.NIL == conses_high.member(var224, var226, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
            var226 = (SubLObject)ConsesLow.cons(var224, var226);
        }
        return Values.values(var226, var227);
    }
    
    public static SubLObject f52755(final SubLObject var220, final SubLObject var221, final SubLObject var64, final SubLObject var190, final SubLObject var230, final SubLObject var231) {
        final SubLThread var232 = SubLProcess.currentSubLThread();
        SubLObject var233 = (SubLObject)module0820.NIL;
        SubLObject var234 = (SubLObject)module0820.NIL;
        final SubLObject var235 = (module0820.$ic24$ == var230) ? f52729(var231) : f52735(var231);
        if (module0820.NIL != var235 && module0820.NIL == f52657(var235, var220)) {
            var232.resetMultipleValues();
            final SubLObject var236 = (module0820.$ic24$ == var230) ? f52730(var231, var235) : f52736(var231, var235);
            final SubLObject var237 = var232.secondMultipleValue();
            var232.resetMultipleValues();
            if (module0820.NIL != f52660(var235, var220)) {
                var233 = var236;
                var234 = var237;
            }
            else {
                SubLObject var238 = var236;
                SubLObject var239 = (SubLObject)module0820.NIL;
                var239 = var238.first();
                while (module0820.NIL != var238) {
                    final SubLObject var240 = f52671(var239);
                    if (var240.numG(var221)) {
                        final SubLObject var241 = var239;
                        if (module0820.NIL == conses_high.member(var241, var233, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                            var233 = (SubLObject)ConsesLow.cons(var241, var233);
                        }
                    }
                    var238 = var238.rest();
                    var239 = var238.first();
                }
                var238 = var237;
                SubLObject var242 = (SubLObject)module0820.NIL;
                var242 = var238.first();
                while (module0820.NIL != var238) {
                    final SubLObject var240 = f52677(var242);
                    if (var240.numG(var221)) {
                        final SubLObject var241 = var242;
                        if (module0820.NIL == conses_high.member(var241, var234, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                            var234 = (SubLObject)ConsesLow.cons(var241, var234);
                        }
                    }
                    var238 = var238.rest();
                    var242 = var238.first();
                }
                var233 = Sequences.nreverse(var233);
                var234 = Sequences.nreverse(var234);
            }
        }
        if ((module0820.NIL != f52660(var64, var220) || (var220.equal(var64) && var190.numG(var221))) && module0820.NIL == conses_high.member(var231, var233, Symbols.symbol_function((SubLObject)module0820.EQL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
            var233 = (SubLObject)ConsesLow.cons(var231, var233);
        }
        return Values.values(var233, var234);
    }
    
    public static SubLObject f52761(final SubLObject var220, final SubLObject var221, final SubLObject var75) {
        final SubLObject var222 = f52676(var75);
        if (module0820.NIL != var222) {
            final SubLObject var223 = f52677(var75);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0820.NIL != f52660(var222, var220) || (var220.equal(var222) && var223.numG(var221)));
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52762(SubLObject var154, SubLObject var111) {
        if (var154 == module0820.UNPROVIDED) {
            var154 = f52758((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var155 = var154;
        SubLObject var156 = (SubLObject)module0820.NIL;
        var156 = var155.first();
        while (module0820.NIL != var155) {
            f52763(var156, var111);
            var155 = var155.rest();
            var156 = var155.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52763(final SubLObject var155, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)module0820.$ic51$);
        final SubLObject var156 = var155.rest();
        SubLObject var157 = var155.first();
        SubLObject var158 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
        var158 = var157.first();
        final SubLObject var159;
        var157 = (var159 = var157.rest());
        var157 = var156;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
        final SubLObject var241_242 = var157.rest();
        var157 = var157.first();
        SubLObject var160 = (SubLObject)module0820.NIL;
        SubLObject var161 = (SubLObject)module0820.NIL;
        SubLObject var162 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
        var160 = var157.first();
        var157 = var157.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
        var161 = var157.first();
        var157 = var157.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
        var162 = var157.first();
        var157 = var157.rest();
        if (module0820.NIL == var157) {
            var157 = var241_242;
            SubLObject var163 = (SubLObject)module0820.NIL;
            SubLObject var164 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
            var163 = var157.first();
            var157 = var157.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var157, var155, (SubLObject)module0820.$ic51$);
            var164 = var157.first();
            var157 = var157.rest();
            if (module0820.NIL == var157) {
                SubLObject var165 = var158;
                if (var165.eql((SubLObject)module0820.$ic26$)) {
                    SubLObject var245_246;
                    final SubLObject var243_244 = var245_246 = var159;
                    SubLObject var1_247 = (SubLObject)module0820.NIL;
                    SubLObject var166 = (SubLObject)module0820.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)module0820.$ic52$);
                    var1_247 = var245_246.first();
                    var245_246 = var245_246.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)module0820.$ic52$);
                    var166 = var245_246.first();
                    var245_246 = var245_246.rest();
                    if (module0820.NIL == var245_246) {
                        PrintLow.format(var111, (SubLObject)module0820.$ic53$, var1_247, var166);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var243_244, (SubLObject)module0820.$ic52$);
                    }
                }
                else if (var165.eql((SubLObject)module0820.$ic24$)) {
                    SubLObject var251_252;
                    final SubLObject var249_250 = var251_252 = var159;
                    SubLObject var167 = (SubLObject)module0820.NIL;
                    SubLObject var1_248 = (SubLObject)module0820.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var251_252, var249_250, (SubLObject)module0820.$ic44$);
                    var167 = var251_252.first();
                    var251_252 = var251_252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var251_252, var249_250, (SubLObject)module0820.$ic44$);
                    var1_248 = var251_252.first();
                    var251_252 = var251_252.rest();
                    if (module0820.NIL == var251_252) {
                        PrintLow.format(var111, (SubLObject)module0820.$ic32$, var167, var1_248);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var249_250, (SubLObject)module0820.$ic44$);
                    }
                }
                else if (var165.eql((SubLObject)module0820.$ic25$)) {
                    SubLObject var256_257;
                    final SubLObject var254_255 = var256_257 = var159;
                    SubLObject var167 = (SubLObject)module0820.NIL;
                    SubLObject var1_249 = (SubLObject)module0820.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var256_257, var254_255, (SubLObject)module0820.$ic44$);
                    var167 = var256_257.first();
                    var256_257 = var256_257.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var256_257, var254_255, (SubLObject)module0820.$ic44$);
                    var1_249 = var256_257.first();
                    var256_257 = var256_257.rest();
                    if (module0820.NIL == var256_257) {
                        PrintLow.format(var111, (SubLObject)module0820.$ic33$, var167, var1_249);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var254_255, (SubLObject)module0820.$ic44$);
                    }
                }
                PrintLow.format(var111, (SubLObject)module0820.$ic34$);
                var165 = var160;
                if (var165.eql((SubLObject)module0820.$ic24$)) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic36$, var161, var162);
                }
                else if (var165.eql((SubLObject)module0820.$ic25$)) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic37$, var161, var162);
                }
                PrintLow.format(var111, (SubLObject)module0820.$ic54$);
                if (module0820.NIL == var164 && module0820.NIL != module0035.f1997(var163) && var161.eql(var163.first())) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic55$);
                }
                else {
                    PrintLow.format(var111, (SubLObject)module0820.$ic56$);
                    SubLObject var168 = var163;
                    SubLObject var169 = (SubLObject)module0820.NIL;
                    var169 = var168.first();
                    while (module0820.NIL != var168) {
                        PrintLow.format(var111, (SubLObject)module0820.$ic57$, var169);
                        var168 = var168.rest();
                        var169 = var168.first();
                    }
                    var168 = var164;
                    SubLObject var170 = (SubLObject)module0820.NIL;
                    var170 = var168.first();
                    while (module0820.NIL != var168) {
                        PrintLow.format(var111, (SubLObject)module0820.$ic58$, var170);
                        var168 = var168.rest();
                        var170 = var168.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)module0820.$ic51$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)module0820.$ic51$);
        }
        return var155;
    }
    
    public static SubLObject f52764(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic59$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_262 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52765(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_262, var12);
                }
            }
            finally {
                final SubLObject var15_263 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_263, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52765(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = (SubLObject)module0820.NIL;
        SubLObject var95 = f52680(var92);
        SubLObject var96 = (SubLObject)module0820.NIL;
        var96 = var95.first();
        while (module0820.NIL != var95) {
            final SubLObject var97 = f52671(var96);
            SubLObject var26_266;
            final SubLObject var98 = var26_266 = f52684(var96);
            SubLObject var99 = (SubLObject)module0820.NIL;
            var99 = var26_266.first();
            while (module0820.NIL != var26_266) {
                if (module0820.NIL != f52669(var99)) {
                    final SubLObject var100 = f52670(var99);
                    if (module0820.NIL != var100) {
                        final SubLObject var101 = f52671(var99);
                        var93.resetMultipleValues();
                        final SubLObject var102 = f52760(var92, var97, var100, var101, var99);
                        final SubLObject var103 = var93.secondMultipleValue();
                        var93.resetMultipleValues();
                        if (module0820.NIL != var102 || module0820.NIL != var103) {
                            var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var96, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var99, var100), var102, var103), var94);
                        }
                    }
                }
                var26_266 = var26_266.rest();
                var99 = var26_266.first();
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        var95 = f52681(var92);
        SubLObject var104 = (SubLObject)module0820.NIL;
        var104 = var95.first();
        while (module0820.NIL != var95) {
            final SubLObject var97 = f52677(var104);
            SubLObject var26_267;
            final SubLObject var98 = var26_267 = f52688(var104);
            SubLObject var99 = (SubLObject)module0820.NIL;
            var99 = var26_267.first();
            while (module0820.NIL != var26_267) {
                if (module0820.NIL != f52669(var99)) {
                    final SubLObject var100 = f52670(var99);
                    if (module0820.NIL != var100) {
                        final SubLObject var101 = f52671(var99);
                        var93.resetMultipleValues();
                        final SubLObject var102 = f52760(var92, var97, var100, var101, var99);
                        final SubLObject var103 = var93.secondMultipleValue();
                        var93.resetMultipleValues();
                        if (module0820.NIL != var102 || module0820.NIL != var103) {
                            var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var104, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var99, var100), var102, var103), var94);
                        }
                    }
                }
                var26_267 = var26_267.rest();
                var99 = var26_267.first();
            }
            var95 = var95.rest();
            var104 = var95.first();
        }
        SubLObject var106;
        final SubLObject var105 = var106 = f52692(var92);
        SubLObject var107 = (SubLObject)module0820.NIL;
        var107 = var106.first();
        while (module0820.NIL != var106) {
            if (module0820.NIL != f52669(var107)) {
                final SubLObject var108 = f52670(var107);
                if (module0820.NIL != var108) {
                    final SubLObject var109 = f52671(var107);
                    SubLObject var26_268;
                    final SubLObject var110 = var26_268 = f52695(var92, var107);
                    SubLObject var111 = (SubLObject)module0820.NIL;
                    var111 = var26_268.first();
                    while (module0820.NIL != var26_268) {
                        var93.resetMultipleValues();
                        final SubLObject var102 = f52760(var92, var111, var108, var109, var107);
                        final SubLObject var103 = var93.secondMultipleValue();
                        var93.resetMultipleValues();
                        if (module0820.NIL != var102 || module0820.NIL != var103) {
                            var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92, var111), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var107, var108), var102, var103), var94);
                        }
                        var26_268 = var26_268.rest();
                        var111 = var26_268.first();
                    }
                }
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        return Sequences.nreverse(var94);
    }
    
    public static SubLObject f52766(SubLObject var154, SubLObject var111) {
        if (var154 == module0820.UNPROVIDED) {
            var154 = f52764((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f52762(var154, var111);
    }
    
    public static SubLObject f52767(final SubLObject var155, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f52763(var155, var111);
    }
    
    public static SubLObject f52768(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic60$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_270 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52769(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_270, var12);
                }
            }
            finally {
                final SubLObject var15_271 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_271, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52769(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        SubLObject var94 = f52680(var92);
        SubLObject var95 = (SubLObject)module0820.NIL;
        var95 = var94.first();
        while (module0820.NIL != var94) {
            SubLObject var26_274;
            final SubLObject var96 = var26_274 = f52684(var95);
            SubLObject var97 = (SubLObject)module0820.NIL;
            var97 = var26_274.first();
            while (module0820.NIL != var26_274) {
                if (module0820.NIL == f52667(var97)) {
                    final SubLObject var98 = f52670(var97);
                    if (module0820.NIL == var98) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var97)), var93);
                    }
                }
                var26_274 = var26_274.rest();
                var97 = var26_274.first();
            }
            SubLObject var26_275;
            final SubLObject var99 = var26_275 = f52682(var95);
            SubLObject var100 = (SubLObject)module0820.NIL;
            var100 = var26_275.first();
            while (module0820.NIL != var26_275) {
                if (module0820.NIL == f52668(var100)) {
                    final SubLObject var98 = f52676(var100);
                    if (module0820.NIL == var98) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var100)), var93);
                    }
                }
                var26_275 = var26_275.rest();
                var100 = var26_275.first();
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        var94 = f52681(var92);
        SubLObject var101 = (SubLObject)module0820.NIL;
        var101 = var94.first();
        while (module0820.NIL != var94) {
            SubLObject var26_276;
            final SubLObject var96 = var26_276 = f52688(var101);
            SubLObject var97 = (SubLObject)module0820.NIL;
            var97 = var26_276.first();
            while (module0820.NIL != var26_276) {
                if (module0820.NIL == f52667(var97)) {
                    final SubLObject var98 = f52670(var97);
                    if (module0820.NIL == var98) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var101, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var97)), var93);
                    }
                }
                var26_276 = var26_276.rest();
                var97 = var26_276.first();
            }
            SubLObject var26_277;
            final SubLObject var99 = var26_277 = f52687(var101);
            SubLObject var100 = (SubLObject)module0820.NIL;
            var100 = var26_277.first();
            while (module0820.NIL != var26_277) {
                if (module0820.NIL == f52668(var100)) {
                    final SubLObject var98 = f52676(var100);
                    if (module0820.NIL == var98) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var101, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var100)), var93);
                    }
                }
                var26_277 = var26_277.rest();
                var100 = var26_277.first();
            }
            var94 = var94.rest();
            var101 = var94.first();
        }
        SubLObject var103;
        final SubLObject var102 = var103 = f52692(var92);
        SubLObject var104 = (SubLObject)module0820.NIL;
        var104 = var103.first();
        while (module0820.NIL != var103) {
            if (module0820.NIL == f52667(var104)) {
                final SubLObject var105 = f52670(var104);
                if (module0820.NIL == var105) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var104)), var93);
                }
            }
            var103 = var103.rest();
            var104 = var103.first();
        }
        final SubLObject var106 = var103 = f52691(var92);
        SubLObject var107 = (SubLObject)module0820.NIL;
        var107 = var103.first();
        while (module0820.NIL != var103) {
            if (module0820.NIL == f52668(var107)) {
                final SubLObject var105 = f52676(var107);
                if (module0820.NIL == var105) {
                    var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92), (SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var107)), var93);
                }
            }
            var103 = var103.rest();
            var107 = var103.first();
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f52770(SubLObject var278, SubLObject var111) {
        if (var278 == module0820.UNPROVIDED) {
            var278 = f52768((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var279 = var278;
        SubLObject var280 = (SubLObject)module0820.NIL;
        var280 = var279.first();
        while (module0820.NIL != var279) {
            f52771(var280, var111);
            var279 = var279.rest();
            var280 = var279.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52771(final SubLObject var279, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(var279, var279, (SubLObject)module0820.$ic42$);
        final SubLObject var280 = var279.rest();
        SubLObject var281 = var279.first();
        SubLObject var282 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var281, var279, (SubLObject)module0820.$ic42$);
        var282 = var281.first();
        final SubLObject var283;
        var281 = (var283 = var281.rest());
        var281 = var280;
        cdestructuring_bind.destructuring_bind_must_consp(var281, var279, (SubLObject)module0820.$ic42$);
        final SubLObject var283_284 = var281.rest();
        var281 = var281.first();
        SubLObject var284 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var281, var279, (SubLObject)module0820.$ic42$);
        var284 = var281.first();
        final SubLObject var285;
        var281 = (var285 = var281.rest());
        var281 = var283_284;
        if (module0820.NIL == var281) {
            SubLObject var286 = var282;
            if (var286.eql((SubLObject)module0820.$ic26$)) {
                SubLObject var287_288;
                final SubLObject var285_286 = var287_288 = var283;
                SubLObject var287 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var287_288, var285_286, (SubLObject)module0820.$ic43$);
                var287 = var287_288.first();
                var287_288 = var287_288.rest();
                if (module0820.NIL == var287_288) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic30$, var287);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var285_286, (SubLObject)module0820.$ic43$);
                }
            }
            else if (var286.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var291_292;
                final SubLObject var289_290 = var291_292 = var283;
                SubLObject var288 = (SubLObject)module0820.NIL;
                SubLObject var289 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var291_292, var289_290, (SubLObject)module0820.$ic44$);
                var288 = var291_292.first();
                var291_292 = var291_292.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var291_292, var289_290, (SubLObject)module0820.$ic44$);
                var289 = var291_292.first();
                var291_292 = var291_292.rest();
                if (module0820.NIL == var291_292) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic32$, var288, var289);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var289_290, (SubLObject)module0820.$ic44$);
                }
            }
            else if (var286.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var295_296;
                final SubLObject var293_294 = var295_296 = var283;
                SubLObject var288 = (SubLObject)module0820.NIL;
                SubLObject var289 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var295_296, var293_294, (SubLObject)module0820.$ic44$);
                var288 = var295_296.first();
                var295_296 = var295_296.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var295_296, var293_294, (SubLObject)module0820.$ic44$);
                var289 = var295_296.first();
                var295_296 = var295_296.rest();
                if (module0820.NIL == var295_296) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic33$, var288, var289);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var293_294, (SubLObject)module0820.$ic44$);
                }
            }
            PrintLow.format(var111, (SubLObject)module0820.$ic61$);
            var286 = var284;
            if (var286.eql((SubLObject)module0820.$ic24$)) {
                SubLObject var299_300;
                final SubLObject var297_298 = var299_300 = var285;
                SubLObject var290 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var299_300, var297_298, (SubLObject)module0820.$ic62$);
                var290 = var299_300.first();
                var299_300 = var299_300.rest();
                if (module0820.NIL == var299_300) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic63$, var290);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var297_298, (SubLObject)module0820.$ic62$);
                }
            }
            else if (var286.eql((SubLObject)module0820.$ic25$)) {
                SubLObject var303_304;
                final SubLObject var301_302 = var303_304 = var285;
                SubLObject var290 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var303_304, var301_302, (SubLObject)module0820.$ic62$);
                var290 = var303_304.first();
                var303_304 = var303_304.rest();
                if (module0820.NIL == var303_304) {
                    PrintLow.format(var111, (SubLObject)module0820.$ic64$, var290);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var301_302, (SubLObject)module0820.$ic62$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var279, (SubLObject)module0820.$ic42$);
        }
        return var279;
    }
    
    public static SubLObject f52772(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                SubLObject var19 = var11;
                SubLObject var20 = (SubLObject)module0820.NIL;
                var20 = var19.first();
                while (module0820.NIL != var19) {
                    SubLObject var26_307;
                    final SubLObject var21 = var26_307 = f52773(var20);
                    SubLObject var22 = (SubLObject)module0820.NIL;
                    var22 = var26_307.first();
                    while (module0820.NIL != var26_307) {
                        final SubLObject var23 = var22;
                        if (module0820.NIL == conses_high.member(var23, var13, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                            var13 = (SubLObject)ConsesLow.cons(var23, var13);
                        }
                        var26_307 = var26_307.rest();
                        var22 = var26_307.first();
                    }
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            finally {
                final SubLObject var15_309 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_309, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52773(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        SubLObject var94 = f52680(var92);
        SubLObject var95 = (SubLObject)module0820.NIL;
        var95 = var94.first();
        while (module0820.NIL != var94) {
            if (module0820.NIL != f52672(var95)) {
                final SubLObject var96 = f52673(var95);
                var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var95, var96), var93);
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        var94 = f52681(var92);
        SubLObject var97 = (SubLObject)module0820.NIL;
        var97 = var94.first();
        while (module0820.NIL != var94) {
            if (module0820.NIL != f52678(var97)) {
                final SubLObject var96 = f52679(var97);
                var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var97, var96), var93);
            }
            var94 = var94.rest();
            var97 = var94.first();
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f52774(SubLObject var311, SubLObject var111) {
        if (var311 == module0820.UNPROVIDED) {
            var311 = f52772((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var312 = var311;
        SubLObject var313 = (SubLObject)module0820.NIL;
        var313 = var312.first();
        while (module0820.NIL != var312) {
            f52775(var313, var111);
            var312 = var312.rest();
            var313 = var312.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52775(final SubLObject var312, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var313 = (SubLObject)module0820.NIL;
        SubLObject var314 = (SubLObject)module0820.NIL;
        SubLObject var315 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var312, var312, (SubLObject)module0820.$ic65$);
        var313 = var312.first();
        SubLObject var316 = var312.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var316, var312, (SubLObject)module0820.$ic65$);
        var314 = var316.first();
        var316 = var316.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var316, var312, (SubLObject)module0820.$ic65$);
        var315 = var316.first();
        var316 = var316.rest();
        if (module0820.NIL == var316) {
            final SubLObject var317 = var313;
            if (var317.eql((SubLObject)module0820.$ic24$)) {
                PrintLow.format(var111, (SubLObject)module0820.$ic66$, var314);
            }
            else if (var317.eql((SubLObject)module0820.$ic25$)) {
                PrintLow.format(var111, (SubLObject)module0820.$ic67$, var314);
            }
            SubLObject var318 = var315;
            SubLObject var319 = (SubLObject)module0820.NIL;
            var319 = var318.first();
            while (module0820.NIL != var318) {
                SubLObject var318_319;
                final SubLObject var316_317 = var318_319 = var319;
                SubLObject var320 = (SubLObject)module0820.NIL;
                SubLObject var321 = (SubLObject)module0820.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var318_319, var316_317, (SubLObject)module0820.$ic68$);
                var320 = var318_319.first();
                var318_319 = (var321 = var318_319.rest());
                PrintLow.format(var111, (SubLObject)module0820.$ic69$, var320, var321);
                var318 = var318.rest();
                var319 = var318.first();
            }
            streams_high.terpri(var111);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var312, (SubLObject)module0820.$ic65$);
        }
        return var312;
    }
    
    public static SubLObject f52776(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                SubLObject var19 = var11;
                SubLObject var20 = (SubLObject)module0820.NIL;
                var20 = var19.first();
                while (module0820.NIL != var19) {
                    SubLObject var26_323;
                    final SubLObject var21 = var26_323 = f52777(var20);
                    SubLObject var22 = (SubLObject)module0820.NIL;
                    var22 = var26_323.first();
                    while (module0820.NIL != var26_323) {
                        final SubLObject var23 = var22;
                        if (module0820.NIL == conses_high.member(var23, var13, Symbols.symbol_function((SubLObject)module0820.EQUAL), Symbols.symbol_function((SubLObject)module0820.IDENTITY))) {
                            var13 = (SubLObject)ConsesLow.cons(var23, var13);
                        }
                        var26_323 = var26_323.rest();
                        var22 = var26_323.first();
                    }
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            finally {
                final SubLObject var15_325 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_325, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f52777(final SubLObject var92) {
        final SubLObject var93 = (SubLObject)module0820.$ic70$;
        final SubLObject var94 = f52670(var93);
        if (module0820.NIL != f52657(var92, var94)) {
            SubLObject var95 = (SubLObject)module0820.NIL;
            SubLObject var96 = f52680(var92);
            SubLObject var97 = (SubLObject)module0820.NIL;
            var97 = var96.first();
            while (module0820.NIL != var96) {
                if (module0820.NIL != f52685(var93, var97)) {
                    var95 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic24$, var97, var92), var95);
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
            var96 = f52681(var92);
            SubLObject var98 = (SubLObject)module0820.NIL;
            var98 = var96.first();
            while (module0820.NIL != var96) {
                if (module0820.NIL != f52689(var93, var98)) {
                    var95 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic25$, var98, var92), var95);
                }
                var96 = var96.rest();
                var98 = var96.first();
            }
            if (module0820.NIL != f52693(var93, var92)) {
                var95 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic26$, var92), var95);
            }
            return Sequences.nreverse(var95);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52778(SubLObject var278, SubLObject var111) {
        if (var278 == module0820.UNPROVIDED) {
            var278 = f52776((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var279 = var278;
        SubLObject var280 = (SubLObject)module0820.NIL;
        var280 = var279.first();
        while (module0820.NIL != var279) {
            f52779(var280, var111);
            var279 = var279.rest();
            var280 = var279.first();
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52779(final SubLObject var279, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var280 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var279, var279, (SubLObject)module0820.$ic71$);
        var280 = var279.first();
        final SubLObject var282;
        final SubLObject var281 = var282 = var279.rest();
        final SubLObject var283 = var280;
        if (var283.eql((SubLObject)module0820.$ic26$)) {
            SubLObject var330_331;
            final SubLObject var328_329 = var330_331 = var282;
            SubLObject var284 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var330_331, var328_329, (SubLObject)module0820.$ic43$);
            var284 = var330_331.first();
            var330_331 = var330_331.rest();
            if (module0820.NIL == var330_331) {
                PrintLow.format(var111, (SubLObject)module0820.$ic30$, var284);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var328_329, (SubLObject)module0820.$ic43$);
            }
        }
        else if (var283.eql((SubLObject)module0820.$ic24$)) {
            SubLObject var334_335;
            final SubLObject var332_333 = var334_335 = var282;
            SubLObject var285 = (SubLObject)module0820.NIL;
            SubLObject var286 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var334_335, var332_333, (SubLObject)module0820.$ic46$);
            var285 = var334_335.first();
            var334_335 = var334_335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var334_335, var332_333, (SubLObject)module0820.$ic46$);
            var286 = var334_335.first();
            var334_335 = var334_335.rest();
            if (module0820.NIL == var334_335) {
                PrintLow.format(var111, (SubLObject)module0820.$ic32$, var285, var286);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var332_333, (SubLObject)module0820.$ic46$);
            }
        }
        else if (var283.eql((SubLObject)module0820.$ic25$)) {
            SubLObject var338_339;
            final SubLObject var336_337 = var338_339 = var282;
            SubLObject var285 = (SubLObject)module0820.NIL;
            SubLObject var286 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var338_339, var336_337, (SubLObject)module0820.$ic46$);
            var285 = var338_339.first();
            var338_339 = var338_339.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var338_339, var336_337, (SubLObject)module0820.$ic46$);
            var286 = var338_339.first();
            var338_339 = var338_339.rest();
            if (module0820.NIL == var338_339) {
                PrintLow.format(var111, (SubLObject)module0820.$ic33$, var285, var286);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var336_337, (SubLObject)module0820.$ic46$);
            }
        }
        PrintLow.format(var111, (SubLObject)module0820.$ic72$);
        return var279;
    }
    
    public static SubLObject f52780(SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var112 = (SubLObject)module0820.NIL;
        SubLObject var113 = (SubLObject)module0820.NIL;
        SubLObject var114 = (SubLObject)module0820.NIL;
        final Iterator var115 = Hashtables.getEntrySetIterator(module0012.$g43$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var115)) {
                final Map.Entry var116 = Hashtables.iteratorNextEntry(var115);
                var113 = Hashtables.getEntryKey(var116);
                var114 = Hashtables.getEntryValue(var116);
                final SubLObject var117 = f52781(var113);
                if (module0820.NIL != var117) {
                    var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var113, var117), var112);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var115);
        }
        if (module0820.NIL != var112) {
            final SubLObject var118 = (SubLObject)ConsesLow.list((SubLObject)module0820.$ic73$, var112);
            f52782(var118, var111);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52783(final SubLObject var155, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var156 = (SubLObject)module0820.NIL;
        SubLObject var157 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)module0820.$ic74$);
        var156 = var155.first();
        final SubLObject var158 = var157 = var155.rest();
        PrintLow.format(var111, (SubLObject)module0820.$ic75$, var156, var157);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52781(final SubLObject var341) {
        assert module0820.NIL != module0012.f381(var341) : var341;
        SubLObject var342 = (SubLObject)module0820.NIL;
        SubLObject var343 = f52784(var341);
        SubLObject var344 = (SubLObject)module0820.NIL;
        var344 = var343.first();
        while (module0820.NIL != var343) {
            if (module0820.NIL == module0012.f381(var344) && module0820.NIL == module0012.f380(var344)) {
                var342 = (SubLObject)ConsesLow.cons(var344, var342);
            }
            var343 = var343.rest();
            var344 = var343.first();
        }
        return var342;
    }
    
    public static SubLObject f52785(SubLObject var11) {
        if (var11 == module0820.UNPROVIDED) {
            var11 = f52654();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0820.NIL;
        final SubLObject var15;
        final SubLObject var14 = var15 = module0034.f1854((SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        final SubLObject var16 = module0034.$g879$.currentBinding(var12);
        try {
            module0034.$g879$.bind(var15, var12);
            SubLObject var17 = (SubLObject)module0820.NIL;
            if (module0820.NIL != var15 && module0820.NIL == module0034.f1842(var15)) {
                var17 = module0034.f1869(var15);
                final SubLObject var18 = Threads.current_process();
                if (module0820.NIL == var17) {
                    module0034.f1873(var15, var18);
                }
                else if (!var17.eql(var18)) {
                    Errors.error((SubLObject)module0820.$ic4$);
                }
            }
            try {
                final SubLObject var19 = var11;
                module0012.$g82$.setDynamicValue((SubLObject)module0820.$ic77$, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0820.ZERO_INTEGER, var12);
                final SubLObject var15_350 = module0012.$g75$.currentBinding(var12);
                final SubLObject var20 = module0012.$g76$.currentBinding(var12);
                final SubLObject var21 = module0012.$g77$.currentBinding(var12);
                final SubLObject var22 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0820.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0820.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0820.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var23 = var19;
                    SubLObject var24 = (SubLObject)module0820.NIL;
                    var24 = var23.first();
                    while (module0820.NIL != var23) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0820.ONE_INTEGER), var12);
                        SubLObject var26;
                        final SubLObject var25 = var26 = f52786(var24);
                        SubLObject var27 = (SubLObject)module0820.NIL;
                        var27 = var26.first();
                        while (module0820.NIL != var26) {
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var22, var12);
                    module0012.$g77$.rebind(var21, var12);
                    module0012.$g76$.rebind(var20, var12);
                    module0012.$g75$.rebind(var15_350, var12);
                }
            }
            finally {
                final SubLObject var15_351 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0820.T, var12);
                    if (module0820.NIL != var15 && module0820.NIL == var17) {
                        module0034.f1873(var15, (SubLObject)module0820.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_351, var12);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var16, var12);
        }
        var13 = Sequences.nreverse(var13);
        return var13;
    }
    
    public static SubLObject f52786(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        final SubLObject var94 = f52773(var92);
        if (module0820.NIL != var94) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic78$, var94), var93);
        }
        final SubLObject var95 = f52769(var92);
        if (module0820.NIL != var95) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic79$, var95), var93);
        }
        final SubLObject var96 = f52750(var92);
        if (module0820.NIL != var96) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic80$, var96), var93);
        }
        final SubLObject var97 = f52777(var92);
        if (module0820.NIL != var97) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic81$, var97), var93);
        }
        final SubLObject var98 = f52759(var92);
        if (module0820.NIL != var98) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic82$, var98), var93);
        }
        final SubLObject var99 = f52754(var92);
        if (module0820.NIL != var99) {
            var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0820.$ic83$, var99), var93);
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f52787(SubLObject var354, SubLObject var111) {
        if (var354 == module0820.UNPROVIDED) {
            var354 = f52785((SubLObject)module0820.UNPROVIDED);
        }
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (module0820.NIL == var354) {
            PrintLow.format(var111, (SubLObject)module0820.$ic84$);
        }
        else {
            SubLObject var355 = var354;
            SubLObject var356 = (SubLObject)module0820.NIL;
            var356 = var355.first();
            while (module0820.NIL != var355) {
                f52782(var356, var111);
                var355 = var355.rest();
                var356 = var355.first();
            }
        }
        streams_high.terpri(var111);
        streams_high.force_output(var111);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52782(final SubLObject var346, SubLObject var111) {
        if (var111 == module0820.UNPROVIDED) {
            var111 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var347 = (SubLObject)module0820.NIL;
        SubLObject var348 = (SubLObject)module0820.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var346, var346, (SubLObject)module0820.$ic85$);
        var347 = var346.first();
        SubLObject var349 = var346.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var349, var346, (SubLObject)module0820.$ic85$);
        var348 = var349.first();
        var349 = var349.rest();
        if (module0820.NIL == var349) {
            final SubLObject var350 = var347;
            if (var350.eql((SubLObject)module0820.$ic78$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52775(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic79$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52771(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic80$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52752(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic81$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52779(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic82$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52763(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic83$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52757(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else if (var350.eql((SubLObject)module0820.$ic73$)) {
                SubLObject var351 = var348;
                SubLObject var352 = (SubLObject)module0820.NIL;
                var352 = var351.first();
                while (module0820.NIL != var351) {
                    f52783(var352, var111);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
            }
            else {
                Errors.error((SubLObject)module0820.$ic86$, var347);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var346, (SubLObject)module0820.$ic85$);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52788(SubLObject var354) {
        if (var354 == module0820.UNPROVIDED) {
            var354 = f52785((SubLObject)module0820.UNPROVIDED);
        }
        SubLObject var355 = (SubLObject)module0820.ZERO_INTEGER;
        SubLObject var356 = var354;
        SubLObject var357 = (SubLObject)module0820.NIL;
        var357 = var356.first();
        while (module0820.NIL != var356) {
            SubLObject var359;
            final SubLObject var358 = var359 = var357;
            SubLObject var360 = (SubLObject)module0820.NIL;
            SubLObject var361 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var359, var358, (SubLObject)module0820.$ic85$);
            var360 = var359.first();
            var359 = var359.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var359, var358, (SubLObject)module0820.$ic85$);
            var361 = var359.first();
            var359 = var359.rest();
            if (module0820.NIL == var359) {
                var355 = Numbers.add(var355, Sequences.length(var361));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var358, (SubLObject)module0820.$ic85$);
            }
            var356 = var356.rest();
            var357 = var356.first();
        }
        return var355;
    }
    
    public static SubLObject f52789(SubLObject var354) {
        if (var354 == module0820.UNPROVIDED) {
            var354 = f52785((SubLObject)module0820.UNPROVIDED);
        }
        final SubLObject var355 = module0067.f4880(Symbols.symbol_function((SubLObject)module0820.EQUAL), (SubLObject)module0820.ZERO_INTEGER);
        SubLObject var356 = var354;
        SubLObject var357 = (SubLObject)module0820.NIL;
        var357 = var356.first();
        while (module0820.NIL != var356) {
            SubLObject var359;
            final SubLObject var358 = var359 = var357;
            SubLObject var360 = (SubLObject)module0820.NIL;
            SubLObject var361 = (SubLObject)module0820.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var359, var358, (SubLObject)module0820.$ic85$);
            var360 = var359.first();
            var359 = var359.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var359, var358, (SubLObject)module0820.$ic85$);
            var361 = var359.first();
            var359 = var359.rest();
            if (module0820.NIL == var359) {
                final SubLObject var362 = var361.first();
                final SubLObject var363 = module0035.f2439(Symbols.symbol_function((SubLObject)module0820.$ic87$), var362, (SubLObject)module0820.UNPROVIDED);
                if (var363.isString()) {
                    module0084.f5775(var355, var363, Sequences.length(var361));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var358, (SubLObject)module0820.$ic85$);
            }
            var356 = var356.rest();
            var357 = var356.first();
        }
        SubLObject var364 = module0084.f5780(var355);
        var364 = Sort.sort(var364, Symbols.symbol_function((SubLObject)module0820.$ic88$), Symbols.symbol_function((SubLObject)module0820.$ic89$));
        return var364;
    }
    
    public static SubLObject f52790(final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0820.$ic90$;
        SubLObject var62 = f52698(var60);
        SubLObject var63 = (SubLObject)module0820.NIL;
        var63 = var62.first();
        while (module0820.NIL != var62) {
            final SubLObject var64 = f52684(var63);
            if (module0820.$ic90$ == var61) {
                var61 = conses_high.copy_list(var64);
            }
            else {
                var61 = conses_high.nintersection(var61, conses_high.copy_list(var64), Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED);
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        if (module0820.$ic90$ != var61) {
            return Sequences.delete(var60, var61, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED, (SubLObject)module0820.UNPROVIDED);
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52791(final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0820.$ic90$;
        SubLObject var62 = f52698(var60);
        SubLObject var63 = (SubLObject)module0820.NIL;
        var63 = var62.first();
        while (module0820.NIL != var62) {
            final SubLObject var64 = f52682(var63);
            if (module0820.$ic90$ == var61) {
                var61 = conses_high.copy_list(var64);
            }
            else {
                var61 = conses_high.nintersection(var61, conses_high.copy_list(var64), Symbols.symbol_function((SubLObject)module0820.EQ), (SubLObject)module0820.UNPROVIDED);
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        if (module0820.$ic90$ != var61) {
            return var61;
        }
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52784(final SubLObject var341) {
        return Values.values(f52790(var341), f52791(var341));
    }
    
    public static SubLObject f52792(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0820.NIL;
        SubLObject var94 = f52680(var92);
        SubLObject var95 = (SubLObject)module0820.NIL;
        var95 = var94.first();
        while (module0820.NIL != var94) {
            if (module0820.NIL == module0015.f874(var95) && module0820.NIL == module0012.f420(var95) && module0820.NIL == module0002.f40(var95) && module0820.NIL == f52698(var95) && module0820.NIL == module0038.f2684(Symbols.symbol_name(var95), (SubLObject)module0820.$ic91$) && module0820.NIL == module0038.f2684(Symbols.symbol_name(var95), (SubLObject)module0820.$ic92$)) {
                var93 = (SubLObject)ConsesLow.cons(var95, var93);
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        return var93;
    }
    
    public static SubLObject f52793() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52652", "S#58000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52653", "S#58001", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52654", "S#58002", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52655", "S#58003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52656", "S#58004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52657", "S#58005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52659", "S#58006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52658", "S#58007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52660", "S#58008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52661", "S#58009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52662", "S#58010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52663", "S#58011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52664", "S#58012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52665", "S#58013", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52666", "S#58014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52667", "S#58015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52668", "S#58016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52669", "S#58017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52670", "S#58018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52671", "S#58019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52672", "S#58020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52673", "S#58021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52674", "S#58022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52675", "S#58023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52676", "S#58024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52677", "S#58025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52678", "S#58026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52679", "S#58027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52680", "S#58028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52681", "S#58029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52682", "S#58030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52683", "S#58031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52684", "S#58032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52685", "S#58033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52686", "S#58034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52687", "S#58035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52688", "S#58036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52689", "S#58037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52690", "S#58038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52691", "S#58039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52692", "S#58040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52693", "S#58041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52694", "S#58042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52695", "S#58043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52696", "S#58044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52697", "S#58045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52698", "S#58046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52699", "S#58047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52700", "S#58048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52701", "S#58049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52702", "S#58050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52703", "S#58051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52704", "S#58052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52705", "S#58053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52706", "S#58054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52707", "S#58055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52708", "S#58056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52709", "S#58057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52710", "S#58058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52711", "S#58059", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52712", "S#58060", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52713", "S#58061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52714", "S#58062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52715", "S#58063", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52716", "S#58064", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52717", "S#58065", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52719", "S#58066", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52718", "S#58067", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52720", "S#58068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52721", "S#58069", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52722", "S#58070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52725", "S#58071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52723", "S#58072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52724", "S#58073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52726", "S#58074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52727", "S#58075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52728", "S#58076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52729", "S#58077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52730", "S#58078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52731", "S#58079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52732", "S#58080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52733", "S#58081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52734", "S#58082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52735", "S#58083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52736", "S#58084", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52737", "S#58085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52738", "S#58086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52739", "S#58087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52740", "S#58088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52741", "S#58089", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52742", "S#58090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52744", "S#58091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52743", "S#58092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52745", "S#58093", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52746", "S#58094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52747", "S#58095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52748", "S#58096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52749", "S#58097", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52750", "S#58098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52751", "S#58099", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52752", "S#58100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52753", "S#58101", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52754", "S#58102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52756", "S#58103", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52757", "S#58104", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52758", "S#58105", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52759", "S#58106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52760", "S#58107", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52755", "S#58108", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52761", "S#58109", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52762", "S#58110", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52763", "S#58111", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52764", "S#58112", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52765", "S#58113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52766", "S#58114", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52767", "S#58115", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52768", "S#58116", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52769", "S#58117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52770", "S#58118", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52771", "S#58119", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52772", "S#58120", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52773", "S#58121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52774", "S#58122", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52775", "S#58123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52776", "S#58124", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52777", "S#58125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52778", "S#58126", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52779", "S#58127", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52780", "S#58128", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52783", "S#58129", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52781", "S#58130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52785", "S#58131", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52786", "S#58132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52787", "S#58133", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52782", "S#58134", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52788", "S#58135", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52789", "S#58136", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52790", "S#58137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52791", "S#58138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52784", "S#58139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0820", "f52792", "S#58140", 1, 0, false);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52794() {
        module0820.$g6524$ = SubLFiles.defvar("S#58141", (SubLObject)module0820.$ic0$);
        module0820.$g6525$ = SubLFiles.defparameter("S#58142", (SubLObject)module0820.NIL);
        module0820.$g6526$ = SubLFiles.defparameter("S#58143", (SubLObject)module0820.NIL);
        return (SubLObject)module0820.NIL;
    }
    
    public static SubLObject f52795() {
        module0034.f1895((SubLObject)module0820.$ic1$);
        module0034.f1895((SubLObject)module0820.$ic3$);
        module0034.f1895((SubLObject)module0820.$ic15$);
        module0034.f1895((SubLObject)module0820.$ic17$);
        module0034.f1895((SubLObject)module0820.$ic27$);
        return (SubLObject)module0820.NIL;
    }
    
    public void declareFunctions() {
        f52793();
    }
    
    public void initializeVariables() {
        f52794();
    }
    
    public void runTopLevelForms() {
        f52795();
    }
    
    static {
        me = (SubLFile)new module0820();
        module0820.$g6524$ = null;
        module0820.$g6525$ = null;
        module0820.$g6526$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("NEW");
        $ic1$ = SubLObjectFactory.makeSymbol("S#58004", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic3$ = SubLObjectFactory.makeSymbol("S#58007", "CYC");
        $ic4$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic5$ = SubLObjectFactory.makeSymbol("S#58005", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#58000", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic8$ = SubLObjectFactory.makeKeyword("DYNAMIC");
        $ic9$ = SubLObjectFactory.makeKeyword("SPECIAL");
        $ic10$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic11$ = SubLObjectFactory.makeString("Checking ~A for dependencies.~%");
        $ic12$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic13$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic14$ = SubLObjectFactory.makeSymbol("S#58008", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#58077", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("UNSEEN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#58083", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("OR");
        $ic19$ = SubLObjectFactory.makeKeyword("NOT");
        $ic20$ = SubLObjectFactory.makeKeyword("AND");
        $ic21$ = SubLObjectFactory.makeSymbol("S#58087", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#58088", "CYC");
        $ic23$ = SubLObjectFactory.makeString("Identifying module-level feature problems");
        $ic24$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic25$ = SubLObjectFactory.makeKeyword("GLOBAL");
        $ic26$ = SubLObjectFactory.makeKeyword("MODULE");
        $ic27$ = SubLObjectFactory.makeSymbol("S#58092", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58144", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58145", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58147", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#58148", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58149", "CYC"));
        $ic30$ = SubLObjectFactory.makeString("~%Top-level form in ~A~%");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58149", "CYC"));
        $ic32$ = SubLObjectFactory.makeString("~%Method ~A in ~A~%");
        $ic33$ = SubLObjectFactory.makeString("~%Global ~A in ~A~%");
        $ic34$ = SubLObjectFactory.makeString(" references");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58152", "CYC"));
        $ic36$ = SubLObjectFactory.makeString("~%method ~A from ~A~%");
        $ic37$ = SubLObjectFactory.makeString("~%global ~A from ~A~%");
        $ic38$ = SubLObjectFactory.makeString("~%which will have problems when :~%  ~A~%");
        $ic39$ = SubLObjectFactory.makeString("assuming ~A");
        $ic40$ = SubLObjectFactory.makeString("no features");
        $ic41$ = SubLObjectFactory.makeString("Identifying privacy violations");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58144", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58145", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58147", "CYC")));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic45$ = SubLObjectFactory.makeString(" references private");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic47$ = SubLObjectFactory.makeString("Identifying early rebinding violations");
        $ic48$ = SubLObjectFactory.makeString(" rebinds");
        $ic49$ = SubLObjectFactory.makeString(" before it is defined~%");
        $ic50$ = SubLObjectFactory.makeString("Identifying early reference violations");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58144", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58145", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#58153", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58154", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $ic53$ = SubLObjectFactory.makeString("~%Top-level form in ~A at ~S~%");
        $ic54$ = SubLObjectFactory.makeString(" before it is");
        $ic55$ = SubLObjectFactory.makeString(" defined~%");
        $ic56$ = SubLObjectFactory.makeString(" completely defined due to~%");
        $ic57$ = SubLObjectFactory.makeString("method ~A~%");
        $ic58$ = SubLObjectFactory.makeString("global ~A~%");
        $ic59$ = SubLObjectFactory.makeString("Identifying early macro use violations");
        $ic60$ = SubLObjectFactory.makeString("Identifying undefined references");
        $ic61$ = SubLObjectFactory.makeString(" references undefined");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58151", "CYC"));
        $ic63$ = SubLObjectFactory.makeString("~%method ~A~%");
        $ic64$ = SubLObjectFactory.makeString("~%global ~A~%");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58144", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58155", "CYC"));
        $ic66$ = SubLObjectFactory.makeString("~%Method ~A has multiple definitions in");
        $ic67$ = SubLObjectFactory.makeString("~%Global ~A has multiple definitions in");
        $ic68$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-POSITION"));
        $ic69$ = SubLObjectFactory.makeString("~%  ~A at position ~S");
        $ic70$ = SubLObjectFactory.makeSymbol("S#10575", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#58147", "CYC"));
        $ic72$ = SubLObjectFactory.makeString("references #$ before it is completely defined~%");
        $ic73$ = SubLObjectFactory.makeKeyword("API-MACRO-VISIBILITY");
        $ic74$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#31", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58156", "CYC"));
        $ic75$ = SubLObjectFactory.makeString("~&API macro ~A expands to non-API methods~% ~S~%");
        $ic76$ = SubLObjectFactory.makeSymbol("S#385", "CYC");
        $ic77$ = SubLObjectFactory.makeString("Determining build problems");
        $ic78$ = SubLObjectFactory.makeKeyword("MULTIPLE-DEFINITIONS");
        $ic79$ = SubLObjectFactory.makeKeyword("UNDEFINED-REFERENCES");
        $ic80$ = SubLObjectFactory.makeKeyword("PRIVACY-VIOLATIONS");
        $ic81$ = SubLObjectFactory.makeKeyword("EARLY-CONSTANT-REFERENCES");
        $ic82$ = SubLObjectFactory.makeKeyword("EARLY-REFERENCE-VIOLATIONS");
        $ic83$ = SubLObjectFactory.makeKeyword("EARLY-REBINDING-VIOLATIONS");
        $ic84$ = SubLObjectFactory.makeString("~%No build problems!");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58157", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58158", "CYC"));
        $ic86$ = SubLObjectFactory.makeString("Unknown build problem class ~S");
        $ic87$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic88$ = SubLObjectFactory.makeSymbol(">");
        $ic89$ = SubLObjectFactory.makeSymbol("CDR");
        $ic90$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic91$ = SubLObjectFactory.makeString("CLEAR");
        $ic92$ = SubLObjectFactory.makeString("REMOVE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0820.class
	Total time: 934 ms
	
	Decompiled with Procyon 0.5.32.
*/