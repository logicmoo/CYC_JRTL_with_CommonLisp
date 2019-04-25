package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0304 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0304";
    public static final String myFingerPrint = "eab2a443c6bd5814cfaf77699d907e7dc0866de6e475fe5a0c7beb9109038098";
    private static SubLSymbol $g2713$;
    private static SubLSymbol $g2714$;
    private static SubLSymbol $g2715$;
    private static SubLSymbol $g2716$;
    private static SubLSymbol $g2717$;
    private static SubLSymbol $g2718$;
    private static SubLSymbol $g2719$;
    private static SubLSymbol $g2720$;
    private static SubLSymbol $g2721$;
    private static SubLSymbol $g2722$;
    private static SubLSymbol $g2723$;
    private static SubLSymbol $g2724$;
    private static SubLSymbol $g2725$;
    private static SubLSymbol $g2726$;
    private static SubLSymbol $g2727$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    
    public static SubLObject f20283(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0304.NIL != Types.integerp(var2) : var2;
        if (module0304.NIL != module0201.f12580(var3)) {
            return (SubLObject)module0304.T;
        }
        SubLObject var6 = (SubLObject)module0304.NIL;
        final SubLObject var7 = module0144.$g1796$.currentBinding(var5);
        final SubLObject var8 = module0144.$g1795$.currentBinding(var5);
        final SubLObject var9 = module0152.$g2116$.currentBinding(var5);
        final SubLObject var10 = module0152.$g2115$.currentBinding(var5);
        final SubLObject var11 = module0152.$g2131$.currentBinding(var5);
        final SubLObject var12 = module0144.$g1831$.currentBinding(var5);
        final SubLObject var13 = module0144.$g1832$.currentBinding(var5);
        final SubLObject var14 = module0144.$g1833$.currentBinding(var5);
        final SubLObject var15 = module0144.$g1755$.currentBinding(var5);
        final SubLObject var16 = module0144.$g1779$.currentBinding(var5);
        final SubLObject var17 = module0144.$g1785$.currentBinding(var5);
        final SubLObject var18 = module0146.$g1960$.currentBinding(var5);
        final SubLObject var19 = module0146.$g2032$.currentBinding(var5);
        final SubLObject var20 = module0144.$g1805$.currentBinding(var5);
        final SubLObject var21 = module0144.$g1806$.currentBinding(var5);
        final SubLObject var22 = module0146.$g2004$.currentBinding(var5);
        try {
            module0144.$g1796$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1795$.bind((SubLObject)module0304.NIL, var5);
            module0152.$g2116$.bind((SubLObject)module0304.NIL, var5);
            module0152.$g2115$.bind((SubLObject)module0304.NIL, var5);
            module0152.$g2131$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1831$.bind(var3, var5);
            module0144.$g1832$.bind(var1, var5);
            module0144.$g1833$.bind(var2, var5);
            module0144.$g1755$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1779$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1785$.bind((SubLObject)module0304.NIL, var5);
            module0146.$g1960$.bind((SubLObject)module0304.NIL, var5);
            module0146.$g2032$.bind(module0309.f20936(module0144.$g1831$.getDynamicValue(var5), module0144.$g1833$.getDynamicValue(var5)), var5);
            module0144.$g1805$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var5) && module0304.NIL != module0309.f20937(module0144.$g1831$.getDynamicValue(var5))), var5);
            module0144.$g1806$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var5) && module0304.NIL != module0309.f20938(module0144.$g1831$.getDynamicValue(var5))), var5);
            module0146.$g2004$.bind(module0279.f18488(module0144.$g1831$.getDynamicValue(var5)), var5);
            var6 = f20284(var1, var2, var3, var4);
        }
        finally {
            module0146.$g2004$.rebind(var22, var5);
            module0144.$g1806$.rebind(var21, var5);
            module0144.$g1805$.rebind(var20, var5);
            module0146.$g2032$.rebind(var19, var5);
            module0146.$g1960$.rebind(var18, var5);
            module0144.$g1785$.rebind(var17, var5);
            module0144.$g1779$.rebind(var16, var5);
            module0144.$g1755$.rebind(var15, var5);
            module0144.$g1833$.rebind(var14, var5);
            module0144.$g1832$.rebind(var13, var5);
            module0144.$g1831$.rebind(var12, var5);
            module0152.$g2131$.rebind(var11, var5);
            module0152.$g2115$.rebind(var10, var5);
            module0152.$g2116$.rebind(var9, var5);
            module0144.$g1795$.rebind(var8, var5);
            module0144.$g1796$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f20285(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0304.NIL;
        if (module0304.NIL == var6) {
            return f20283(var1, var2, var3, var4);
        }
        var7 = module0034.f1857(var6, (SubLObject)module0304.$ic0$, (SubLObject)module0304.UNPROVIDED);
        if (module0304.NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)module0304.$ic0$, (SubLObject)module0304.FOUR_INTEGER, (SubLObject)module0304.NIL, (SubLObject)module0304.EQUAL, (SubLObject)module0304.UNPROVIDED);
            module0034.f1860(var6, (SubLObject)module0304.$ic0$, var7);
        }
        final SubLObject var8 = module0034.f1780(var1, var2, var3, var4);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)module0304.UNPROVIDED);
        if (var9 != module0304.$ic2$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)module0304.NIL;
            var11 = var10.first();
            while (module0304.NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var1.equal(var12.first())) {
                    var12 = var12.rest();
                    if (var2.equal(var12.first())) {
                        var12 = var12.rest();
                        if (var3.equal(var12.first())) {
                            var12 = var12.rest();
                            if (module0304.NIL != var12 && module0304.NIL == var12.rest() && var4.equal(var12.first())) {
                                return module0034.f1959(var13);
                            }
                        }
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var14 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20283(var1, var2, var3, var4)));
        module0034.f1836(var7, var8, var9, var14, (SubLObject)ConsesLow.list(var1, var2, var3, var4));
        return module0034.f1959(var14);
    }
    
    public static SubLObject f20284(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = (SubLObject)((module0304.NIL != module0271.$g2564$.getDynamicValue(var5)) ? module0225.f14773(var3) : module0304.NIL);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0226.f14792(var3) && (!var6.isNumber() || var6.numGE(var2)) && (var2.numG((SubLObject)module0304.ZERO_INTEGER) || (var2.numE((SubLObject)module0304.ZERO_INTEGER) && module0304.NIL != module0213.f14081(var1, var3))) && module0304.NIL != module0309.f20944(var3, var1, var2, var4));
    }
    
    public static SubLObject f20286(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0304.NIL != Types.integerp(var2) : var2;
        if (module0304.NIL != module0201.f12580(var3)) {
            return (SubLObject)module0304.T;
        }
        SubLObject var6 = (SubLObject)module0304.NIL;
        final SubLObject var7 = module0144.$g1796$.currentBinding(var5);
        final SubLObject var8 = module0144.$g1795$.currentBinding(var5);
        final SubLObject var9 = module0152.$g2116$.currentBinding(var5);
        final SubLObject var10 = module0152.$g2115$.currentBinding(var5);
        final SubLObject var11 = module0144.$g1831$.currentBinding(var5);
        final SubLObject var12 = module0144.$g1832$.currentBinding(var5);
        final SubLObject var13 = module0144.$g1833$.currentBinding(var5);
        final SubLObject var14 = module0144.$g1755$.currentBinding(var5);
        final SubLObject var15 = module0144.$g1779$.currentBinding(var5);
        final SubLObject var16 = module0144.$g1785$.currentBinding(var5);
        final SubLObject var17 = module0146.$g1960$.currentBinding(var5);
        final SubLObject var18 = module0146.$g2032$.currentBinding(var5);
        final SubLObject var19 = module0144.$g1805$.currentBinding(var5);
        final SubLObject var20 = module0144.$g1806$.currentBinding(var5);
        final SubLObject var21 = module0146.$g2004$.currentBinding(var5);
        final SubLObject var22 = module0144.$g1853$.currentBinding(var5);
        try {
            module0144.$g1796$.bind((SubLObject)module0304.T, var5);
            module0144.$g1795$.bind((SubLObject)module0304.T, var5);
            module0152.$g2116$.bind((SubLObject)module0304.T, var5);
            module0152.$g2115$.bind((SubLObject)module0304.T, var5);
            module0144.$g1831$.bind(var3, var5);
            module0144.$g1832$.bind(var1, var5);
            module0144.$g1833$.bind(var2, var5);
            module0144.$g1755$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1779$.bind((SubLObject)module0304.NIL, var5);
            module0144.$g1785$.bind((SubLObject)module0304.NIL, var5);
            module0146.$g1960$.bind((SubLObject)module0304.T, var5);
            module0146.$g2032$.bind(module0309.f20936(module0144.$g1831$.getDynamicValue(var5), module0144.$g1833$.getDynamicValue(var5)), var5);
            module0144.$g1805$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var5) && module0304.NIL != module0309.f20937(module0144.$g1831$.getDynamicValue(var5))), var5);
            module0144.$g1806$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var5) && module0304.NIL != module0309.f20938(module0144.$g1831$.getDynamicValue(var5))), var5);
            module0146.$g2004$.bind(module0279.f18488(module0144.$g1831$.getDynamicValue(var5)), var5);
            module0144.$g1853$.bind((SubLObject)module0304.NIL, var5);
            f20284(var1, var2, var3, var4);
            var6 = module0144.$g1853$.getDynamicValue(var5);
        }
        finally {
            module0144.$g1853$.rebind(var22, var5);
            module0146.$g2004$.rebind(var21, var5);
            module0144.$g1806$.rebind(var20, var5);
            module0144.$g1805$.rebind(var19, var5);
            module0146.$g2032$.rebind(var18, var5);
            module0146.$g1960$.rebind(var17, var5);
            module0144.$g1785$.rebind(var16, var5);
            module0144.$g1779$.rebind(var15, var5);
            module0144.$g1755$.rebind(var14, var5);
            module0144.$g1833$.rebind(var13, var5);
            module0144.$g1832$.rebind(var12, var5);
            module0144.$g1831$.rebind(var11, var5);
            module0152.$g2115$.rebind(var10, var5);
            module0152.$g2116$.rebind(var9, var5);
            module0144.$g1795$.rebind(var8, var5);
            module0144.$g1796$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f20287(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var5 = f20286(var1, var2, var3, var4);
        SubLObject var6 = (SubLObject)module0304.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0304.NIL;
        var8 = var7.first();
        while (module0304.NIL != var7) {
            var6 = (SubLObject)ConsesLow.cons(module0274.f18210(var8, (SubLObject)module0304.UNPROVIDED), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0038.f2840(var6);
    }
    
    public static SubLObject f20288(final SubLObject var37, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0304.NIL;
        final SubLObject var40 = module0144.$g1796$.currentBinding(var38);
        final SubLObject var41 = module0144.$g1795$.currentBinding(var38);
        final SubLObject var42 = module0152.$g2116$.currentBinding(var38);
        final SubLObject var43 = module0152.$g2115$.currentBinding(var38);
        final SubLObject var44 = module0152.$g2131$.currentBinding(var38);
        final SubLObject var45 = module0144.$g1785$.currentBinding(var38);
        final SubLObject var46 = module0146.$g1960$.currentBinding(var38);
        final SubLObject var47 = module0271.$g2559$.currentBinding(var38);
        final SubLObject var48 = module0271.$g2561$.currentBinding(var38);
        final SubLObject var49 = module0018.$g696$.currentBinding(var38);
        try {
            module0144.$g1796$.bind((SubLObject)module0304.NIL, var38);
            module0144.$g1795$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2116$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2115$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2131$.bind((SubLObject)module0304.NIL, var38);
            module0144.$g1785$.bind((SubLObject)module0304.NIL, var38);
            module0146.$g1960$.bind((SubLObject)module0304.NIL, var38);
            module0271.$g2559$.bind((SubLObject)module0304.NIL, var38);
            module0271.$g2561$.bind((SubLObject)module0304.NIL, var38);
            module0018.$g696$.bind((SubLObject)module0304.NIL, var38);
            final SubLObject var50 = var4;
            final SubLObject var7_39 = module0147.$g2094$.currentBinding(var38);
            final SubLObject var8_40 = module0147.$g2095$.currentBinding(var38);
            try {
                module0147.$g2094$.bind(module0147.f9531(var50), var38);
                module0147.$g2095$.bind(module0147.f9534(var50), var38);
                var39 = module0274.f18174(var37, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var8_40, var38);
                module0147.$g2094$.rebind(var7_39, var38);
            }
        }
        finally {
            module0018.$g696$.rebind(var49, var38);
            module0271.$g2561$.rebind(var48, var38);
            module0271.$g2559$.rebind(var47, var38);
            module0146.$g1960$.rebind(var46, var38);
            module0144.$g1785$.rebind(var45, var38);
            module0152.$g2131$.rebind(var44, var38);
            module0152.$g2115$.rebind(var43, var38);
            module0152.$g2116$.rebind(var42, var38);
            module0144.$g1795$.rebind(var41, var38);
            module0144.$g1796$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f20289(final SubLObject var37, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0304.NIL;
        final SubLObject var40 = module0144.$g1796$.currentBinding(var38);
        final SubLObject var41 = module0144.$g1795$.currentBinding(var38);
        final SubLObject var42 = module0152.$g2116$.currentBinding(var38);
        final SubLObject var43 = module0152.$g2115$.currentBinding(var38);
        final SubLObject var44 = module0152.$g2131$.currentBinding(var38);
        final SubLObject var45 = module0144.$g1785$.currentBinding(var38);
        final SubLObject var46 = module0146.$g1960$.currentBinding(var38);
        final SubLObject var47 = module0271.$g2559$.currentBinding(var38);
        final SubLObject var48 = module0271.$g2561$.currentBinding(var38);
        final SubLObject var49 = module0018.$g696$.currentBinding(var38);
        try {
            module0144.$g1796$.bind((SubLObject)module0304.NIL, var38);
            module0144.$g1795$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2116$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2115$.bind((SubLObject)module0304.NIL, var38);
            module0152.$g2131$.bind((SubLObject)module0304.NIL, var38);
            module0144.$g1785$.bind((SubLObject)module0304.NIL, var38);
            module0146.$g1960$.bind((SubLObject)module0304.NIL, var38);
            module0271.$g2559$.bind((SubLObject)module0304.NIL, var38);
            module0271.$g2561$.bind((SubLObject)module0304.NIL, var38);
            module0018.$g696$.bind((SubLObject)module0304.NIL, var38);
            final SubLObject var50 = var4;
            final SubLObject var7_41 = module0147.$g2094$.currentBinding(var38);
            final SubLObject var8_42 = module0147.$g2095$.currentBinding(var38);
            try {
                module0147.$g2094$.bind(module0147.f9531(var50), var38);
                module0147.$g2095$.bind(module0147.f9534(var50), var38);
                var39 = module0274.f18060(var37, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var8_42, var38);
                module0147.$g2094$.rebind(var7_41, var38);
            }
        }
        finally {
            module0018.$g696$.rebind(var49, var38);
            module0271.$g2561$.rebind(var48, var38);
            module0271.$g2559$.rebind(var47, var38);
            module0146.$g1960$.rebind(var46, var38);
            module0144.$g1785$.rebind(var45, var38);
            module0152.$g2131$.rebind(var44, var38);
            module0152.$g2115$.rebind(var43, var38);
            module0152.$g2116$.rebind(var42, var38);
            module0144.$g1795$.rebind(var41, var38);
            module0144.$g1796$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f20290(final SubLObject var43) {
        if (module0304.NIL != module0206.f13433(var43)) {
            return f20291(var43);
        }
        SubLObject var45;
        final SubLObject var44 = var45 = module0205.f13207(var43, (SubLObject)module0304.$ic3$);
        SubLObject var46 = (SubLObject)module0304.NIL;
        var46 = var45.first();
        while (module0304.NIL != var45) {
            if (module0304.NIL == f20290(var46)) {
                return (SubLObject)module0304.NIL;
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)module0304.T;
    }
    
    public static SubLObject f20291(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)module0304.T;
        final SubLObject var49 = module0205.f13327(module0205.f13333(var46));
        if (module0304.NIL == module0201.f12580(var49)) {
            final SubLObject var50 = module0144.$g1828$.currentBinding(var47);
            final SubLObject var51 = module0152.$g2101$.currentBinding(var47);
            try {
                module0144.$g1828$.bind(var46, var47);
                module0152.$g2101$.bind((SubLObject)module0304.T, var47);
                SubLObject var52 = (SubLObject)module0304.ZERO_INTEGER;
                SubLObject var54;
                final SubLObject var53 = var54 = module0205.f13207(var46, (SubLObject)module0304.$ic3$);
                SubLObject var55 = (SubLObject)module0304.NIL;
                var55 = var54.first();
                while (module0304.NIL != var54) {
                    var52 = Numbers.add(var52, (SubLObject)module0304.ONE_INTEGER);
                    var48 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != var48 && module0304.NIL != f20285(var55, var52, var49, (SubLObject)module0304.UNPROVIDED));
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
            finally {
                module0152.$g2101$.rebind(var51, var47);
                module0144.$g1828$.rebind(var50, var47);
            }
        }
        return var48;
    }
    
    public static SubLObject f20292(final SubLObject var46, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13327(module0205.f13333(var46));
        SubLObject var49 = (SubLObject)module0304.NIL;
        if (module0304.NIL == module0201.f12580(var48)) {
            final SubLObject var50 = module0144.$g1828$.currentBinding(var47);
            final SubLObject var51 = module0152.$g2101$.currentBinding(var47);
            try {
                module0144.$g1828$.bind(var46, var47);
                module0152.$g2101$.bind((SubLObject)module0304.T, var47);
                SubLObject var52 = (SubLObject)module0304.ZERO_INTEGER;
                SubLObject var54;
                final SubLObject var53 = var54 = module0205.f13207(var46, (SubLObject)module0304.$ic3$);
                SubLObject var55 = (SubLObject)module0304.NIL;
                var55 = var54.first();
                while (module0304.NIL != var54) {
                    var52 = Numbers.add(var52, (SubLObject)module0304.ONE_INTEGER);
                    SubLObject var27_49 = f20286(var55, var52, var48, var4);
                    SubLObject var56 = (SubLObject)module0304.NIL;
                    var56 = var27_49.first();
                    while (module0304.NIL != var27_49) {
                        var49 = (SubLObject)ConsesLow.cons(var56, var49);
                        var27_49 = var27_49.rest();
                        var56 = var27_49.first();
                    }
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
            finally {
                module0152.$g2101$.rebind(var51, var47);
                module0144.$g1828$.rebind(var50, var47);
            }
        }
        return var49;
    }
    
    public static SubLObject f20293(final SubLObject var43, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        SubLObject var44 = (SubLObject)module0304.NIL;
        if (module0304.NIL != module0206.f13433(var43)) {
            return f20292(var43, var4);
        }
        SubLObject var46;
        final SubLObject var45 = var46 = module0205.f13207(var43, (SubLObject)module0304.$ic3$);
        SubLObject var47 = (SubLObject)module0304.NIL;
        var47 = var46.first();
        while (module0304.NIL != var46) {
            SubLObject var27_52 = f20292(var47, var4);
            SubLObject var48 = (SubLObject)module0304.NIL;
            var48 = var27_52.first();
            while (module0304.NIL != var27_52) {
                var44 = (SubLObject)ConsesLow.cons(var48, var44);
                var27_52 = var27_52.rest();
                var48 = var27_52.first();
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return var44;
    }
    
    public static SubLObject f20294(final SubLObject var43, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLObject var44 = f20293(var43, var4);
        SubLObject var45 = (SubLObject)module0304.NIL;
        SubLObject var46 = var44;
        SubLObject var47 = (SubLObject)module0304.NIL;
        var47 = var46.first();
        while (module0304.NIL != var46) {
            var45 = (SubLObject)ConsesLow.cons(module0274.f18210(var47, (SubLObject)module0304.UNPROVIDED), var45);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return module0038.f2840(var45);
    }
    
    public static SubLObject f20295(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0304.NIL != Types.integerp(var2) : var2;
        if (module0304.NIL != module0201.f12580(var3)) {
            return (SubLObject)module0304.T;
        }
        SubLObject var5 = (SubLObject)module0304.NIL;
        final SubLObject var6 = module0144.$g1796$.currentBinding(var4);
        final SubLObject var7 = module0144.$g1795$.currentBinding(var4);
        final SubLObject var8 = module0152.$g2116$.currentBinding(var4);
        final SubLObject var9 = module0152.$g2115$.currentBinding(var4);
        final SubLObject var10 = module0152.$g2131$.currentBinding(var4);
        final SubLObject var11 = module0144.$g1831$.currentBinding(var4);
        final SubLObject var12 = module0144.$g1832$.currentBinding(var4);
        final SubLObject var13 = module0144.$g1833$.currentBinding(var4);
        final SubLObject var14 = module0144.$g1755$.currentBinding(var4);
        final SubLObject var15 = module0144.$g1761$.currentBinding(var4);
        final SubLObject var16 = module0144.$g1780$.currentBinding(var4);
        final SubLObject var17 = module0144.$g1779$.currentBinding(var4);
        final SubLObject var18 = module0144.$g1785$.currentBinding(var4);
        final SubLObject var19 = module0146.$g1960$.currentBinding(var4);
        final SubLObject var20 = module0146.$g2032$.currentBinding(var4);
        final SubLObject var21 = module0144.$g1805$.currentBinding(var4);
        final SubLObject var22 = module0144.$g1806$.currentBinding(var4);
        final SubLObject var23 = module0146.$g2004$.currentBinding(var4);
        try {
            module0144.$g1796$.bind((SubLObject)module0304.NIL, var4);
            module0144.$g1795$.bind((SubLObject)module0304.NIL, var4);
            module0152.$g2116$.bind((SubLObject)module0304.NIL, var4);
            module0152.$g2115$.bind((SubLObject)module0304.NIL, var4);
            module0152.$g2131$.bind((SubLObject)module0304.NIL, var4);
            module0144.$g1831$.bind(var3, var4);
            module0144.$g1832$.bind(var1, var4);
            module0144.$g1833$.bind(var2, var4);
            module0144.$g1755$.bind((SubLObject)module0304.T, var4);
            module0144.$g1761$.bind((SubLObject)module0304.NIL, var4);
            module0144.$g1780$.bind((SubLObject)module0304.T, var4);
            module0144.$g1779$.bind((SubLObject)module0304.T, var4);
            module0144.$g1785$.bind((SubLObject)module0304.NIL, var4);
            module0146.$g1960$.bind((SubLObject)module0304.NIL, var4);
            module0146.$g2032$.bind(module0309.f20936(module0144.$g1831$.getDynamicValue(var4), module0144.$g1833$.getDynamicValue(var4)), var4);
            module0144.$g1805$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var4) && module0304.NIL != module0309.f20937(module0144.$g1831$.getDynamicValue(var4))), var4);
            module0144.$g1806$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0018.$g696$.getDynamicValue(var4) && module0304.NIL != module0309.f20938(module0144.$g1831$.getDynamicValue(var4))), var4);
            module0146.$g2004$.bind(module0279.f18488(module0144.$g1831$.getDynamicValue(var4)), var4);
            var5 = f20284(var1, var2, var3, (SubLObject)module0304.NIL);
        }
        finally {
            module0146.$g2004$.rebind(var23, var4);
            module0144.$g1806$.rebind(var22, var4);
            module0144.$g1805$.rebind(var21, var4);
            module0146.$g2032$.rebind(var20, var4);
            module0146.$g1960$.rebind(var19, var4);
            module0144.$g1785$.rebind(var18, var4);
            module0144.$g1779$.rebind(var17, var4);
            module0144.$g1780$.rebind(var16, var4);
            module0144.$g1761$.rebind(var15, var4);
            module0144.$g1755$.rebind(var14, var4);
            module0144.$g1833$.rebind(var13, var4);
            module0144.$g1832$.rebind(var12, var4);
            module0144.$g1831$.rebind(var11, var4);
            module0152.$g2131$.rebind(var10, var4);
            module0152.$g2115$.rebind(var9, var4);
            module0152.$g2116$.rebind(var8, var4);
            module0144.$g1795$.rebind(var7, var4);
            module0144.$g1796$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f20296(final SubLObject var56) {
        return module0303.f20125(var56);
    }
    
    public static SubLObject f20297(final SubLObject var58, final SubLObject var2, SubLObject var59, SubLObject var4) {
        if (var59 == module0304.UNPROVIDED) {
            var59 = (SubLObject)module0304.NIL;
        }
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert module0304.NIL != module0173.f10955(var58) : var58;
        final SubLObject var61 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == module0144.$g1749$.getDynamicValue(var60));
        final SubLObject var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == module0144.$g1748$.getDynamicValue(var60));
        SubLObject var63 = (SubLObject)module0304.NIL;
        SubLObject var64 = (SubLObject)module0304.NIL;
        if (module0304.NIL == var59) {
            var59 = f20298(var58, (SubLObject)ConsesLow.list(var2), var4);
        }
        if (module0304.NIL != var61 && module0304.NIL != var62) {
            var63 = var59;
        }
        else {
            final SubLObject var65 = var4;
            final SubLObject var66 = module0147.$g2094$.currentBinding(var60);
            final SubLObject var67 = module0147.$g2095$.currentBinding(var60);
            final SubLObject var68 = module0144.$g1832$.currentBinding(var60);
            try {
                module0147.$g2094$.bind(module0147.f9531(var65), var60);
                module0147.$g2095$.bind(module0147.f9534(var65), var60);
                module0144.$g1832$.bind(var58, var60);
                assert module0304.NIL != Types.integerp(var2) : var2;
                final SubLObject var7_63 = module0144.$g1833$.currentBinding(var60);
                final SubLObject var8_64 = module0144.$g1826$.currentBinding(var60);
                try {
                    module0144.$g1833$.bind(var2, var60);
                    module0144.$g1826$.bind((SubLObject)module0304.$ic5$, var60);
                    if (module0304.NIL != var61) {
                        var64 = var59;
                    }
                    else {
                        final SubLObject var7_64 = module0144.$g1881$.currentBinding(var60);
                        final SubLObject var8_65 = module0144.$g1882$.currentBinding(var60);
                        final SubLObject var9_67 = module0144.$g1879$.currentBinding(var60);
                        final SubLObject var69 = module0144.$g1880$.currentBinding(var60);
                        try {
                            module0144.$g1881$.bind(module0149.f9622(), var60);
                            module0144.$g1882$.bind(module0149.f9623(), var60);
                            module0144.$g1879$.bind(module0149.f9624(), var60);
                            module0144.$g1880$.bind(module0149.f9625(), var60);
                            try {
                                final SubLObject var70 = module0139.f9008();
                                final SubLObject var7_65 = module0139.$g1630$.currentBinding(var60);
                                final SubLObject var8_66 = module0139.$g1659$.currentBinding(var60);
                                try {
                                    module0139.$g1630$.bind((SubLObject)module0304.NIL, var60);
                                    module0139.$g1659$.bind(module0139.f9007(), var60);
                                    final SubLObject var7_66 = module0144.$g1855$.currentBinding(var60);
                                    final SubLObject var8_67 = module0139.$g1630$.currentBinding(var60);
                                    try {
                                        module0144.$g1855$.bind(module0139.$g1659$.getDynamicValue(var60), var60);
                                        module0139.$g1630$.bind(var70, var60);
                                        module0259.f16875(var58, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                        SubLObject var71 = var59;
                                        SubLObject var72 = (SubLObject)module0304.NIL;
                                        var72 = var71.first();
                                        while (module0304.NIL != var71) {
                                            if (module0304.NIL != module0173.f10955(var72)) {
                                                final SubLObject var73 = (SubLObject)((module0304.NIL != module0173.f10955(var72)) ? SubLObjectFactory.makeBoolean(module0304.NIL != module0260.f17006(var72, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED) || module0304.NIL != module0260.f17008(var72, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED)) : module0304.NIL);
                                                final SubLObject var7_67 = module0144.$g1831$.currentBinding(var60);
                                                final SubLObject var8_68 = module0144.$g1843$.currentBinding(var60);
                                                final SubLObject var9_68 = module0144.$g1844$.currentBinding(var60);
                                                try {
                                                    module0144.$g1831$.bind(var72, var60);
                                                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0144.$g1781$.getDynamicValue(var60) && module0304.NIL != var73), var60);
                                                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0144.$g1782$.getDynamicValue(var60) && module0304.NIL != var73), var60);
                                                    if (module0304.NIL != module0309.f20981(var72, var58, var2, (SubLObject)module0304.$ic6$)) {
                                                        var64 = (SubLObject)ConsesLow.cons(var72, var64);
                                                    }
                                                }
                                                finally {
                                                    module0144.$g1844$.rebind(var9_68, var60);
                                                    module0144.$g1843$.rebind(var8_68, var60);
                                                    module0144.$g1831$.rebind(var7_67, var60);
                                                }
                                            }
                                            var71 = var71.rest();
                                            var72 = var71.first();
                                        }
                                    }
                                    finally {
                                        module0139.$g1630$.rebind(var8_67, var60);
                                        module0144.$g1855$.rebind(var7_66, var60);
                                    }
                                    module0139.f9011(module0139.$g1659$.getDynamicValue(var60));
                                }
                                finally {
                                    module0139.$g1659$.rebind(var8_66, var60);
                                    module0139.$g1630$.rebind(var7_65, var60);
                                }
                            }
                            finally {
                                final SubLObject var7_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var60);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var60);
                                    module0305.f20348();
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_68, var60);
                                }
                            }
                        }
                        finally {
                            module0144.$g1880$.rebind(var69, var60);
                            module0144.$g1879$.rebind(var9_67, var60);
                            module0144.$g1882$.rebind(var8_65, var60);
                            module0144.$g1881$.rebind(var7_64, var60);
                        }
                    }
                    if (module0304.NIL != var62) {
                        var63 = var64;
                    }
                    else {
                        final SubLObject var74 = module0269.f17705(var58);
                        final SubLObject var75 = module0139.f9008();
                        final SubLObject var7_69 = module0139.$g1630$.currentBinding(var60);
                        final SubLObject var8_69 = module0139.$g1659$.currentBinding(var60);
                        try {
                            module0139.$g1630$.bind((SubLObject)module0304.NIL, var60);
                            module0139.$g1659$.bind(module0139.f9007(), var60);
                            final SubLObject var7_70 = module0144.$g1856$.currentBinding(var60);
                            final SubLObject var8_70 = module0139.$g1630$.currentBinding(var60);
                            try {
                                module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var60), var60);
                                module0139.$g1630$.bind(var75, var60);
                                if (module0304.NIL != var74) {
                                    module0251.f16232(module0137.f8955(module0304.$ic7$), var58, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                    module0251.f16238(module0304.$ic8$, (SubLObject)module0304.UNPROVIDED);
                                }
                                SubLObject var76 = var64;
                                SubLObject var77 = (SubLObject)module0304.NIL;
                                var77 = var76.first();
                                while (module0304.NIL != var76) {
                                    final SubLObject var78 = (SubLObject)((module0304.NIL != module0173.f10955(var77)) ? SubLObjectFactory.makeBoolean(module0304.NIL != module0260.f17006(var77, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED) || module0304.NIL != module0260.f17008(var77, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED)) : module0304.NIL);
                                    final SubLObject var7_71 = module0144.$g1831$.currentBinding(var60);
                                    final SubLObject var8_71 = module0144.$g1843$.currentBinding(var60);
                                    final SubLObject var9_69 = module0144.$g1844$.currentBinding(var60);
                                    try {
                                        module0144.$g1831$.bind(var77, var60);
                                        module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0144.$g1781$.getDynamicValue(var60) && module0304.NIL != var78), var60);
                                        module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL != module0144.$g1782$.getDynamicValue(var60) && module0304.NIL != var78), var60);
                                        if (module0304.NIL != module0309.f20981(var77, var58, var2, (SubLObject)module0304.$ic9$)) {
                                            var63 = (SubLObject)ConsesLow.cons(var77, var63);
                                        }
                                    }
                                    finally {
                                        module0144.$g1844$.rebind(var9_69, var60);
                                        module0144.$g1843$.rebind(var8_71, var60);
                                        module0144.$g1831$.rebind(var7_71, var60);
                                    }
                                    var76 = var76.rest();
                                    var77 = var76.first();
                                }
                            }
                            finally {
                                module0139.$g1630$.rebind(var8_70, var60);
                                module0144.$g1856$.rebind(var7_70, var60);
                            }
                            module0139.f9011(module0139.$g1659$.getDynamicValue(var60));
                        }
                        finally {
                            module0139.$g1659$.rebind(var8_69, var60);
                            module0139.$g1630$.rebind(var7_69, var60);
                        }
                    }
                }
                finally {
                    module0144.$g1826$.rebind(var8_64, var60);
                    module0144.$g1833$.rebind(var7_63, var60);
                }
            }
            finally {
                module0144.$g1832$.rebind(var68, var60);
                module0147.$g2095$.rebind(var67, var60);
                module0147.$g2094$.rebind(var66, var60);
            }
        }
        return var63;
    }
    
    public static SubLObject f20299(final SubLObject var58, final SubLObject var86, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        assert module0304.NIL != module0173.f10955(var58) : var58;
        SubLObject var88 = (SubLObject)module0304.NIL;
        final SubLObject var89 = var4;
        final SubLObject var90 = module0147.$g2094$.currentBinding(var87);
        final SubLObject var91 = module0147.$g2095$.currentBinding(var87);
        try {
            module0147.$g2094$.bind(module0147.f9531(var89), var87);
            module0147.$g2095$.bind(module0147.f9534(var89), var87);
            SubLObject var92 = var86;
            SubLObject var93 = (SubLObject)module0304.NIL;
            var93 = var92.first();
            while (module0304.NIL != var92) {
                final SubLObject var94 = f20298(var58, (SubLObject)ConsesLow.list(var93), var4);
                var88 = ConsesLow.nconc(var88, f20297(var58, var93, var94, (SubLObject)module0304.UNPROVIDED));
                var92 = var92.rest();
                var93 = var92.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var91, var87);
            module0147.$g2094$.rebind(var90, var87);
        }
        return module0035.f2272(var88);
    }
    
    public static SubLObject f20298(final SubLObject var58, final SubLObject var86, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        assert module0304.NIL != module0173.f10955(var58) : var58;
        assert module0304.NIL != Types.consp(var86) : var86;
        SubLObject var88 = (SubLObject)module0304.NIL;
        final SubLObject var89 = var4;
        final SubLObject var90 = module0147.$g2094$.currentBinding(var87);
        final SubLObject var91 = module0147.$g2095$.currentBinding(var87);
        try {
            module0147.$g2094$.bind(module0147.f9531(var89), var87);
            module0147.$g2095$.bind(module0147.f9534(var89), var87);
            final SubLObject var92 = module0305.f20464(var58);
            final SubLObject var7_89 = module0304.$g2714$.currentBinding(var87);
            try {
                module0304.$g2714$.bind(module0030.f1635(var86, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var87);
                final SubLObject var93 = module0139.f9008();
                final SubLObject var7_90 = module0139.$g1630$.currentBinding(var87);
                final SubLObject var8_91 = module0139.$g1659$.currentBinding(var87);
                try {
                    module0139.$g1630$.bind((SubLObject)module0304.NIL, var87);
                    module0139.$g1659$.bind(module0139.f9007(), var87);
                    final SubLObject var7_91 = module0304.$g2715$.currentBinding(var87);
                    final SubLObject var8_92 = module0139.$g1630$.currentBinding(var87);
                    try {
                        module0304.$g2715$.bind(module0139.$g1659$.getDynamicValue(var87), var87);
                        module0139.$g1630$.bind(var93, var87);
                        module0259.f16875(var58, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                        SubLObject var94 = var92;
                        SubLObject var95 = (SubLObject)module0304.NIL;
                        var95 = var94.first();
                        while (module0304.NIL != var94) {
                            module0251.f16232(module0137.f8955(module0304.$ic7$), var95, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                            var94 = var94.rest();
                            var95 = var94.first();
                        }
                        final SubLObject var7_92 = module0304.$g2713$.currentBinding(var87);
                        try {
                            module0304.$g2713$.bind(Hashtables.make_hash_table(Sequences.length(var86), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var87);
                            final SubLObject var96 = (SubLObject)((module0304.NIL != module0035.f1997(var86)) ? module0304.$ic12$ : module0304.$ic13$);
                            final SubLObject var7_93 = module0304.$g2717$.currentBinding(var87);
                            final SubLObject var8_93 = module0304.$g2718$.currentBinding(var87);
                            try {
                                module0304.$g2717$.bind((SubLObject)((module0304.NIL != module0035.f1997(var86)) ? module0226.f14903(var86.first(), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED) : module0304.NIL), var87);
                                module0304.$g2718$.bind((SubLObject)((module0304.NIL != module0035.f1997(var86)) ? var86.first() : module0304.NIL), var87);
                                if (module0304.$g2715$.getDynamicValue(var87).isHashtable()) {
                                    final SubLObject var97 = module0304.$g2715$.getDynamicValue(var87);
                                    SubLObject var98 = (SubLObject)module0304.NIL;
                                    SubLObject var99 = (SubLObject)module0304.NIL;
                                    final Iterator var100 = Hashtables.getEntrySetIterator(var97);
                                    try {
                                        while (Hashtables.iteratorHasNext(var100)) {
                                            final Map.Entry var101 = Hashtables.iteratorNextEntry(var100);
                                            var98 = Hashtables.getEntryKey(var101);
                                            var99 = Hashtables.getEntryValue(var101);
                                            Functions.funcall(var96, var98);
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(var100);
                                    }
                                }
                                else {
                                    module0136.f8870((SubLObject)module0304.THREE_INTEGER, (SubLObject)module0304.$ic14$, module0304.$g2715$.getDynamicValue(var87), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                }
                                final SubLObject var102 = Hashtables.make_hash_table(module0304.$g2719$.getGlobalValue(), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                final SubLObject var103 = module0304.$g2713$.getDynamicValue(var87);
                                SubLObject var104 = (SubLObject)module0304.NIL;
                                SubLObject var105 = (SubLObject)module0304.NIL;
                                final Iterator var106 = Hashtables.getEntrySetIterator(var103);
                                try {
                                    while (Hashtables.iteratorHasNext(var106)) {
                                        final Map.Entry var107 = Hashtables.iteratorNextEntry(var106);
                                        var104 = Hashtables.getEntryKey(var107);
                                        SubLObject var108;
                                        var105 = (var108 = Hashtables.getEntryValue(var107));
                                        SubLObject var109 = (SubLObject)module0304.NIL;
                                        var109 = var108.first();
                                        while (module0304.NIL != var108) {
                                            if (module0304.NIL == Hashtables.gethash(var109, var102, (SubLObject)module0304.UNPROVIDED)) {
                                                Hashtables.sethash(var109, var102, (SubLObject)module0304.T);
                                            }
                                            var108 = var108.rest();
                                            var109 = var108.first();
                                        }
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(var106);
                                }
                                var88 = module0030.f1625(var102);
                            }
                            finally {
                                module0304.$g2718$.rebind(var8_93, var87);
                                module0304.$g2717$.rebind(var7_93, var87);
                            }
                        }
                        finally {
                            module0304.$g2713$.rebind(var7_92, var87);
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var8_92, var87);
                        module0304.$g2715$.rebind(var7_91, var87);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var87));
                }
                finally {
                    module0139.$g1659$.rebind(var8_91, var87);
                    module0139.$g1630$.rebind(var7_90, var87);
                }
            }
            finally {
                module0304.$g2714$.rebind(var7_89, var87);
            }
        }
        finally {
            module0147.$g2095$.rebind(var91, var87);
            module0147.$g2094$.rebind(var90, var87);
        }
        return var88;
    }
    
    public static SubLObject f20300(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = module0304.$g2717$.getDynamicValue(var59);
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.TWO_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.TWO_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_114 = (SubLObject)module0304.NIL;
                        final SubLObject var110_115 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_114) {
                            final SubLObject var67 = module0052.f3695(var66, var110_115);
                            final SubLObject var112_117 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_115.eql(var67));
                            if (module0304.NIL != var112_117) {
                                final SubLObject var68 = module0178.f11334(var67);
                                module0030.f1599(module0304.$g2718$.getDynamicValue(var59), var68, module0304.$g2713$.getDynamicValue(var59));
                            }
                            var109_114 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_117);
                        }
                    }
                    finally {
                        final SubLObject var69 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var69, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        var60 = module0304.$ic17$;
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.TWO_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.TWO_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_115 = (SubLObject)module0304.NIL;
                        final SubLObject var110_116 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_115) {
                            final SubLObject var67 = module0052.f3695(var66, var110_116);
                            final SubLObject var112_118 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_116.eql(var67));
                            if (module0304.NIL != var112_118) {
                                final SubLObject var68 = module0178.f11334(var67);
                                final SubLObject var70 = module0225.f14767(var68);
                                if (var70.isNumber() && module0304.$g2718$.getDynamicValue(var59).numLE(var70)) {
                                    module0030.f1599(module0304.$g2718$.getDynamicValue(var59), var68, module0304.$g2713$.getDynamicValue(var59));
                                }
                            }
                            var109_115 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_118);
                        }
                    }
                    finally {
                        final SubLObject var71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var71, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20301(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = module0304.$ic18$;
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.THREE_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.THREE_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_122 = (SubLObject)module0304.NIL;
                        final SubLObject var110_123 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_122) {
                            final SubLObject var67 = module0052.f3695(var66, var110_123);
                            final SubLObject var112_124 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_123.eql(var67));
                            if (module0304.NIL != var112_124) {
                                final SubLObject var68 = module0178.f11334(var67);
                                final SubLObject var69 = module0178.f11335(var67);
                                if (module0304.NIL != Hashtables.gethash(var69, module0304.$g2714$.getDynamicValue(var59), (SubLObject)module0304.UNPROVIDED)) {
                                    module0030.f1599(var69, var68, module0304.$g2713$.getDynamicValue(var59));
                                }
                            }
                            var109_122 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_124);
                        }
                    }
                    finally {
                        final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var70, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        var60 = module0304.$ic17$;
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.TWO_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.TWO_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_123 = (SubLObject)module0304.NIL;
                        final SubLObject var110_124 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_123) {
                            final SubLObject var67 = module0052.f3695(var66, var110_124);
                            final SubLObject var112_125 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_124.eql(var67));
                            if (module0304.NIL != var112_125) {
                                final SubLObject var68 = module0178.f11334(var67);
                                final SubLObject var71 = module0304.$g2714$.getDynamicValue(var59);
                                SubLObject var72 = (SubLObject)module0304.NIL;
                                SubLObject var73 = (SubLObject)module0304.NIL;
                                final Iterator var74 = Hashtables.getEntrySetIterator(var71);
                                try {
                                    while (Hashtables.iteratorHasNext(var74)) {
                                        final Map.Entry var75 = Hashtables.iteratorNextEntry(var74);
                                        var72 = Hashtables.getEntryKey(var75);
                                        var73 = Hashtables.getEntryValue(var75);
                                        final SubLObject var76 = module0225.f14767(var68);
                                        if (var76.isNumber() && var72.numLE(var76)) {
                                            module0030.f1599(var72, var68, module0304.$g2713$.getDynamicValue(var59));
                                        }
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(var74);
                                }
                            }
                            var109_123 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_125);
                        }
                    }
                    finally {
                        final SubLObject var77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var77, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20302(final SubLObject var3, final SubLObject var2) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0304.NIL;
        final SubLObject var6 = module0304.$g2716$.currentBinding(var4);
        try {
            module0304.$g2716$.bind((SubLObject)module0304.T, var4);
            final SubLObject var7 = module0226.f14903(var2, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
            module0219.f14477((SubLObject)module0304.$ic19$, var3, (SubLObject)module0304.ONE_INTEGER, var7, (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            if (module0304.NIL != module0304.$g2716$.getDynamicValue(var4)) {
                module0219.f14477((SubLObject)module0304.$ic19$, var3, (SubLObject)module0304.ONE_INTEGER, module0304.$ic17$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            }
            var5 = module0304.$g2716$.getDynamicValue(var4);
        }
        finally {
            module0304.$g2716$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f20303(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0178.f11335(var116);
        if (module0304.NIL != module0173.f10955(var118) && module0304.NIL == module0251.f16239(var118, module0304.$g2715$.getDynamicValue(var117))) {
            module0304.$g2716$.setDynamicValue((SubLObject)module0304.NIL, var117);
            module0012.f425();
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20304(final SubLObject var58, final SubLObject var2, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0304.NIL != module0173.f10955(var58) : var58;
        SubLObject var60 = (SubLObject)module0304.NIL;
        final SubLObject var61 = var4;
        final SubLObject var62 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind(module0147.f9531(var61), var59);
            module0147.$g2095$.bind(module0147.f9534(var61), var59);
            final SubLObject var64 = module0305.f20464(var58);
            final SubLObject var7_131 = module0304.$g2720$.currentBinding(var59);
            final SubLObject var8_132 = module0304.$g2721$.currentBinding(var59);
            try {
                module0304.$g2720$.bind(Hashtables.make_hash_table(module0304.$g2722$.getDynamicValue(var59), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var59);
                module0304.$g2721$.bind(var2, var59);
                final SubLObject var65 = module0139.f9008();
                final SubLObject var7_132 = module0139.$g1630$.currentBinding(var59);
                final SubLObject var8_133 = module0139.$g1659$.currentBinding(var59);
                try {
                    module0139.$g1630$.bind((SubLObject)module0304.NIL, var59);
                    module0139.$g1659$.bind(module0139.f9007(), var59);
                    final SubLObject var7_133 = module0304.$g2723$.currentBinding(var59);
                    final SubLObject var8_134 = module0139.$g1630$.currentBinding(var59);
                    try {
                        module0304.$g2723$.bind(module0139.$g1659$.getDynamicValue(var59), var59);
                        module0139.$g1630$.bind(var65, var59);
                        module0259.f16875(var58, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                        SubLObject var66 = var64;
                        SubLObject var67 = (SubLObject)module0304.NIL;
                        var67 = var66.first();
                        while (module0304.NIL != var66) {
                            module0251.f16232(module0137.f8955(module0304.$ic7$), var67, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                            var66 = var66.rest();
                            var67 = var66.first();
                        }
                        final SubLObject var68_137 = module0139.f9008();
                        final SubLObject var7_134 = module0139.$g1630$.currentBinding(var59);
                        final SubLObject var8_135 = module0139.$g1659$.currentBinding(var59);
                        try {
                            module0139.$g1630$.bind((SubLObject)module0304.NIL, var59);
                            module0139.$g1659$.bind(module0139.f9007(), var59);
                            final SubLObject var7_135 = module0304.$g2725$.currentBinding(var59);
                            final SubLObject var8_136 = module0139.$g1630$.currentBinding(var59);
                            try {
                                module0304.$g2725$.bind(module0139.$g1659$.getDynamicValue(var59), var59);
                                module0139.$g1630$.bind(var68_137, var59);
                                module0251.f16232(module0137.f8955(module0304.$ic7$), var58, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                f20305(var2);
                            }
                            finally {
                                module0139.$g1630$.rebind(var8_136, var59);
                                module0304.$g2725$.rebind(var7_135, var59);
                            }
                            module0139.f9011(module0139.$g1659$.getDynamicValue(var59));
                        }
                        finally {
                            module0139.$g1659$.rebind(var8_135, var59);
                            module0139.$g1630$.rebind(var7_134, var59);
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var8_134, var59);
                        module0304.$g2723$.rebind(var7_133, var59);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var59));
                }
                finally {
                    module0139.$g1659$.rebind(var8_133, var59);
                    module0139.$g1630$.rebind(var7_132, var59);
                }
                var60 = module0030.f1625(module0304.$g2720$.getDynamicValue(var59));
            }
            finally {
                module0304.$g2721$.rebind(var8_132, var59);
                module0304.$g2720$.rebind(var7_131, var59);
            }
        }
        finally {
            module0147.$g2095$.rebind(var63, var59);
            module0147.$g2094$.rebind(var62, var59);
        }
        return var60;
    }
    
    public static SubLObject f20306(final SubLObject var142, final SubLObject var2, SubLObject var4) {
        if (var4 == module0304.UNPROVIDED) {
            var4 = (SubLObject)module0304.NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        assert module0304.NIL != module0210.f13576(var142, (SubLObject)module0304.UNPROVIDED) : var142;
        SubLObject var144 = (SubLObject)module0304.NIL;
        final SubLObject var145 = var4;
        final SubLObject var146 = module0147.$g2094$.currentBinding(var143);
        final SubLObject var147 = module0147.$g2095$.currentBinding(var143);
        try {
            module0147.$g2094$.bind(module0147.f9531(var145), var143);
            module0147.$g2095$.bind(module0147.f9534(var145), var143);
            final SubLObject var148 = module0205.f13276(var142);
            final SubLObject var149 = module0226.f14990(var148, var4);
            final SubLObject var150 = module0226.f15006(var148, var4);
            final SubLObject var151 = module0226.f15014(var148, var4, (SubLObject)module0304.UNPROVIDED);
            final SubLObject var152 = module0226.f15016(var148, var4);
            final SubLObject var153 = module0305.f20464(var142);
            final SubLObject var7_148 = module0304.$g2720$.currentBinding(var143);
            final SubLObject var8_149 = module0304.$g2721$.currentBinding(var143);
            try {
                module0304.$g2720$.bind(Hashtables.make_hash_table(module0304.$g2722$.getDynamicValue(var143), (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var143);
                module0304.$g2721$.bind(var2, var143);
                final SubLObject var154 = module0139.f9008();
                final SubLObject var7_149 = module0139.$g1630$.currentBinding(var143);
                final SubLObject var8_150 = module0139.$g1659$.currentBinding(var143);
                try {
                    module0139.$g1630$.bind((SubLObject)module0304.NIL, var143);
                    module0139.$g1659$.bind(module0139.f9007(), var143);
                    final SubLObject var7_150 = module0304.$g2723$.currentBinding(var143);
                    final SubLObject var8_151 = module0139.$g1630$.currentBinding(var143);
                    try {
                        module0304.$g2723$.bind(module0139.$g1659$.getDynamicValue(var143), var143);
                        module0139.$g1630$.bind(var154, var143);
                        SubLObject var155 = var149;
                        SubLObject var156 = (SubLObject)module0304.NIL;
                        var156 = var155.first();
                        while (module0304.NIL != var155) {
                            module0251.f16232(module0137.f8955(module0304.$ic7$), var156, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                            var155 = var155.rest();
                            var156 = var155.first();
                        }
                        var155 = var150;
                        var156 = (SubLObject)module0304.NIL;
                        var156 = var155.first();
                        while (module0304.NIL != var155) {
                            module0251.f16232(module0137.f8955(module0304.$ic7$), var156, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                            var155 = var155.rest();
                            var156 = var155.first();
                        }
                        var155 = var153;
                        SubLObject var157 = (SubLObject)module0304.NIL;
                        var157 = var155.first();
                        while (module0304.NIL != var155) {
                            module0251.f16232(module0137.f8955(module0304.$ic7$), var157, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                            var155 = var155.rest();
                            var157 = var155.first();
                        }
                        final SubLObject var68_155 = module0139.f9008();
                        final SubLObject var7_151 = module0139.$g1630$.currentBinding(var143);
                        final SubLObject var8_152 = module0139.$g1659$.currentBinding(var143);
                        try {
                            module0139.$g1630$.bind((SubLObject)module0304.NIL, var143);
                            module0139.$g1659$.bind(module0139.f9007(), var143);
                            final SubLObject var7_152 = module0304.$g2725$.currentBinding(var143);
                            final SubLObject var8_153 = module0139.$g1630$.currentBinding(var143);
                            try {
                                module0304.$g2725$.bind(module0139.$g1659$.getDynamicValue(var143), var143);
                                module0139.$g1630$.bind(var68_155, var143);
                                SubLObject var158 = var151;
                                SubLObject var159 = (SubLObject)module0304.NIL;
                                var159 = var158.first();
                                while (module0304.NIL != var158) {
                                    module0251.f16232(module0137.f8955(module0304.$ic7$), var159, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                    var158 = var158.rest();
                                    var159 = var158.first();
                                }
                                var158 = var152;
                                var159 = (SubLObject)module0304.NIL;
                                var159 = var158.first();
                                while (module0304.NIL != var158) {
                                    module0251.f16232(module0137.f8955(module0304.$ic7$), var159, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED);
                                    var158 = var158.rest();
                                    var159 = var158.first();
                                }
                                f20305(var2);
                            }
                            finally {
                                module0139.$g1630$.rebind(var8_153, var143);
                                module0304.$g2725$.rebind(var7_152, var143);
                            }
                            module0139.f9011(module0139.$g1659$.getDynamicValue(var143));
                        }
                        finally {
                            module0139.$g1659$.rebind(var8_152, var143);
                            module0139.$g1630$.rebind(var7_151, var143);
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var8_151, var143);
                        module0304.$g2723$.rebind(var7_150, var143);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var143));
                }
                finally {
                    module0139.$g1659$.rebind(var8_150, var143);
                    module0139.$g1630$.rebind(var7_149, var143);
                }
                var144 = module0030.f1625(module0304.$g2720$.getDynamicValue(var143));
            }
            finally {
                module0304.$g2721$.rebind(var8_149, var143);
                module0304.$g2720$.rebind(var7_148, var143);
            }
        }
        finally {
            module0147.$g2095$.rebind(var147, var143);
            module0147.$g2094$.rebind(var146, var143);
        }
        return var144;
    }
    
    public static SubLObject f20305(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0304.$g2724$.currentBinding(var3);
        final SubLObject var5 = module0304.$g2726$.currentBinding(var3);
        try {
            module0304.$g2724$.bind(module0226.f14903(var2, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var3);
            module0304.$g2726$.bind(module0226.f14947(var2, (SubLObject)module0304.UNPROVIDED, (SubLObject)module0304.UNPROVIDED), var3);
            if (module0304.NIL != module0173.f10955(module0304.$g2724$.getDynamicValue(var3))) {
                final SubLObject var6 = module0304.$g2723$.getDynamicValue(var3);
                SubLObject var7 = (SubLObject)module0304.NIL;
                SubLObject var8 = (SubLObject)module0304.NIL;
                final Iterator var9 = Hashtables.getEntrySetIterator(var6);
                try {
                    while (Hashtables.iteratorHasNext(var9)) {
                        final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                        var7 = Hashtables.getEntryKey(var10);
                        var8 = Hashtables.getEntryValue(var10);
                        f20307(var7);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var9);
                }
            }
            if (module0304.NIL != module0173.f10955(module0304.$g2726$.getDynamicValue(var3))) {
                final SubLObject var6 = module0304.$g2725$.getDynamicValue(var3);
                SubLObject var11 = (SubLObject)module0304.NIL;
                SubLObject var8 = (SubLObject)module0304.NIL;
                final Iterator var9 = Hashtables.getEntrySetIterator(var6);
                try {
                    while (Hashtables.iteratorHasNext(var9)) {
                        final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                        var11 = Hashtables.getEntryKey(var10);
                        var8 = Hashtables.getEntryValue(var10);
                        f20308(var11);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var9);
                }
            }
            SubLObject var6 = module0304.$g2720$.getDynamicValue(var3);
            SubLObject var12 = (SubLObject)module0304.NIL;
            SubLObject var13 = (SubLObject)module0304.NIL;
            Iterator var9 = Hashtables.getEntrySetIterator(var6);
            try {
                while (Hashtables.iteratorHasNext(var9)) {
                    final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                    var12 = Hashtables.getEntryKey(var10);
                    var13 = Hashtables.getEntryValue(var10);
                    if (module0304.NIL == f20309(var12)) {
                        Hashtables.remhash(var12, module0304.$g2720$.getDynamicValue(var3));
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var9);
            }
            var6 = module0304.$g2720$.getDynamicValue(var3);
            var12 = (SubLObject)module0304.NIL;
            var13 = (SubLObject)module0304.NIL;
            var9 = Hashtables.getEntrySetIterator(var6);
            try {
                while (Hashtables.iteratorHasNext(var9)) {
                    final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                    var12 = Hashtables.getEntryKey(var10);
                    var13 = Hashtables.getEntryValue(var10);
                    if (module0304.NIL == f20310(var12)) {
                        Hashtables.remhash(var12, module0304.$g2720$.getDynamicValue(var3));
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var9);
            }
        }
        finally {
            module0304.$g2726$.rebind(var5, var3);
            module0304.$g2724$.rebind(var4, var3);
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20307(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = module0304.$g2724$.getDynamicValue(var95);
        if (module0304.NIL != module0158.f10010(var94, (SubLObject)module0304.TWO_INTEGER, var96)) {
            final SubLObject var97 = module0158.f10011(var94, (SubLObject)module0304.TWO_INTEGER, var96);
            SubLObject var98 = (SubLObject)module0304.NIL;
            final SubLObject var99 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var98) {
                final SubLObject var100 = module0052.f3695(var97, var99);
                final SubLObject var101 = (SubLObject)SubLObjectFactory.makeBoolean(!var99.eql(var100));
                if (module0304.NIL != var101) {
                    SubLObject var102 = (SubLObject)module0304.NIL;
                    try {
                        var102 = module0158.f10316(var100, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_164 = (SubLObject)module0304.NIL;
                        final SubLObject var110_165 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_164) {
                            final SubLObject var103 = module0052.f3695(var102, var110_165);
                            final SubLObject var112_166 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_165.eql(var103));
                            if (module0304.NIL != var112_166) {
                                final SubLObject var104 = module0178.f11334(var103);
                                Hashtables.sethash(var104, module0304.$g2720$.getDynamicValue(var95), (SubLObject)module0304.T);
                            }
                            var109_164 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_166);
                        }
                    }
                    finally {
                        final SubLObject var105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var95);
                            if (module0304.NIL != var102) {
                                module0158.f10319(var102);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var105, var95);
                        }
                    }
                }
                var98 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var101);
            }
        }
        var96 = module0304.$ic17$;
        if (module0304.NIL != module0158.f10010(var94, (SubLObject)module0304.TWO_INTEGER, var96)) {
            final SubLObject var97 = module0158.f10011(var94, (SubLObject)module0304.TWO_INTEGER, var96);
            SubLObject var98 = (SubLObject)module0304.NIL;
            final SubLObject var99 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var98) {
                final SubLObject var100 = module0052.f3695(var97, var99);
                final SubLObject var101 = (SubLObject)SubLObjectFactory.makeBoolean(!var99.eql(var100));
                if (module0304.NIL != var101) {
                    SubLObject var102 = (SubLObject)module0304.NIL;
                    try {
                        var102 = module0158.f10316(var100, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_165 = (SubLObject)module0304.NIL;
                        final SubLObject var110_166 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_165) {
                            final SubLObject var103 = module0052.f3695(var102, var110_166);
                            final SubLObject var112_167 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_166.eql(var103));
                            if (module0304.NIL != var112_167) {
                                final SubLObject var104 = module0178.f11334(var103);
                                final SubLObject var106 = module0225.f14767(var104);
                                if (var106.isNumber() && module0304.$g2721$.getDynamicValue(var95).numLE(var106)) {
                                    Hashtables.sethash(var104, module0304.$g2720$.getDynamicValue(var95), (SubLObject)module0304.T);
                                }
                            }
                            var109_165 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_167);
                        }
                    }
                    finally {
                        final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var95);
                            if (module0304.NIL != var102) {
                                module0158.f10319(var102);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var107, var95);
                        }
                    }
                }
                var98 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var101);
            }
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20309(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0304.NIL;
        final SubLObject var6 = module0304.$g2727$.currentBinding(var4);
        try {
            module0304.$g2727$.bind((SubLObject)module0304.T, var4);
            module0219.f14477((SubLObject)module0304.$ic21$, var3, (SubLObject)module0304.ONE_INTEGER, module0304.$g2724$.getDynamicValue(var4), (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            if (module0304.NIL != module0304.$g2727$.getDynamicValue(var4)) {
                module0219.f14477((SubLObject)module0304.$ic21$, var3, (SubLObject)module0304.ONE_INTEGER, module0304.$ic17$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            }
            var5 = module0304.$g2727$.getDynamicValue(var4);
        }
        finally {
            module0304.$g2727$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f20311(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0178.f11335(var116);
        if (module0304.NIL != module0173.f10955(var118) && module0304.NIL == module0251.f16239(var118, module0304.$g2723$.getDynamicValue(var117))) {
            module0304.$g2727$.setDynamicValue((SubLObject)module0304.NIL, var117);
            module0012.f425();
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20308(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = module0304.$g2726$.getDynamicValue(var59);
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.TWO_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.TWO_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_170 = (SubLObject)module0304.NIL;
                        final SubLObject var110_171 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_170) {
                            final SubLObject var67 = module0052.f3695(var66, var110_171);
                            final SubLObject var112_172 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_171.eql(var67));
                            if (module0304.NIL != var112_172) {
                                final SubLObject var68 = module0178.f11334(var67);
                                Hashtables.sethash(var68, module0304.$g2720$.getDynamicValue(var59), (SubLObject)module0304.T);
                            }
                            var109_170 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_172);
                        }
                    }
                    finally {
                        final SubLObject var69 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var69, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        var60 = module0304.$ic22$;
        if (module0304.NIL != module0158.f10010(var58, (SubLObject)module0304.TWO_INTEGER, var60)) {
            final SubLObject var61 = module0158.f10011(var58, (SubLObject)module0304.TWO_INTEGER, var60);
            SubLObject var62 = (SubLObject)module0304.NIL;
            final SubLObject var63 = (SubLObject)module0304.NIL;
            while (module0304.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0304.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0304.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0304.$ic15$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.NIL);
                        SubLObject var109_171 = (SubLObject)module0304.NIL;
                        final SubLObject var110_172 = (SubLObject)module0304.NIL;
                        while (module0304.NIL == var109_171) {
                            final SubLObject var67 = module0052.f3695(var66, var110_172);
                            final SubLObject var112_173 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_172.eql(var67));
                            if (module0304.NIL != var112_173) {
                                final SubLObject var68 = module0178.f11334(var67);
                                final SubLObject var70 = module0225.f14767(var68);
                                if (var70.isNumber() && module0304.$g2721$.getDynamicValue(var59).numLE(var70)) {
                                    Hashtables.sethash(var68, module0304.$g2720$.getDynamicValue(var59), (SubLObject)module0304.T);
                                }
                            }
                            var109_171 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var112_173);
                        }
                    }
                    finally {
                        final SubLObject var71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0304.T, var59);
                            if (module0304.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var71, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0304.NIL == var65);
            }
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20310(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0304.NIL;
        final SubLObject var6 = module0304.$g2727$.currentBinding(var4);
        try {
            module0304.$g2727$.bind((SubLObject)module0304.T, var4);
            module0219.f14477((SubLObject)module0304.$ic23$, var3, (SubLObject)module0304.ONE_INTEGER, module0304.$g2726$.getDynamicValue(var4), (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            if (module0304.NIL != module0304.$g2727$.getDynamicValue(var4)) {
                module0219.f14477((SubLObject)module0304.$ic23$, var3, (SubLObject)module0304.ONE_INTEGER, module0304.$ic22$, (SubLObject)module0304.$ic16$, (SubLObject)module0304.UNPROVIDED);
            }
            var5 = module0304.$g2727$.getDynamicValue(var4);
        }
        finally {
            module0304.$g2727$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f20312(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0178.f11335(var116);
        if (module0304.NIL != module0173.f10955(var118) && module0304.NIL == module0251.f16239(var118, module0304.$g2725$.getDynamicValue(var117))) {
            module0304.$g2727$.setDynamicValue((SubLObject)module0304.NIL, var117);
            module0012.f425();
        }
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20313() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20283", "S#22928", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20285", "S#21917", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20284", "S#22929", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20286", "S#22930", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20287", "S#22931", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20288", "S#22932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20289", "S#22933", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20290", "S#22934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20291", "S#22935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20292", "S#22936", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20293", "S#20890", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20294", "S#22937", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20295", "S#22938", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20296", "S#15431", 1, 0, false);
        new $f20296$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20297", "S#22780", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20299", "S#22939", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20298", "S#22940", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20300", "S#22941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20301", "S#22942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20302", "S#22943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20303", "S#22944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20304", "S#22945", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20306", "S#22946", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20305", "S#22947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20307", "S#22948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20309", "S#22949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20311", "S#22950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20308", "S#22951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20310", "S#22952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0304", "f20312", "S#22953", 1, 0, false);
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20314() {
        module0304.$g2713$ = SubLFiles.defparameter("S#22954", (SubLObject)module0304.NIL);
        module0304.$g2714$ = SubLFiles.defparameter("S#22955", (SubLObject)module0304.NIL);
        module0304.$g2715$ = SubLFiles.defparameter("S#22956", (SubLObject)module0304.NIL);
        module0304.$g2716$ = SubLFiles.defparameter("S#22957", (SubLObject)module0304.NIL);
        module0304.$g2717$ = SubLFiles.defparameter("S#22958", (SubLObject)module0304.NIL);
        module0304.$g2718$ = SubLFiles.defparameter("S#22959", (SubLObject)module0304.NIL);
        module0304.$g2719$ = SubLFiles.deflexical("S#22960", (SubLObject)module0304.$ic10$);
        module0304.$g2720$ = SubLFiles.defparameter("S#22961", (SubLObject)module0304.NIL);
        module0304.$g2721$ = SubLFiles.defparameter("S#22962", (SubLObject)module0304.NIL);
        module0304.$g2722$ = SubLFiles.defparameter("S#22963", (SubLObject)module0304.$ic10$);
        module0304.$g2723$ = SubLFiles.defparameter("S#22964", (SubLObject)module0304.NIL);
        module0304.$g2724$ = SubLFiles.defparameter("S#22965", (SubLObject)module0304.NIL);
        module0304.$g2725$ = SubLFiles.defparameter("S#22966", (SubLObject)module0304.NIL);
        module0304.$g2726$ = SubLFiles.defparameter("S#22967", (SubLObject)module0304.NIL);
        module0304.$g2727$ = SubLFiles.defparameter("S#22968", (SubLObject)module0304.NIL);
        return (SubLObject)module0304.NIL;
    }
    
    public static SubLObject f20315() {
        module0034.f1895((SubLObject)module0304.$ic0$);
        return (SubLObject)module0304.NIL;
    }
    
    public void declareFunctions() {
        f20313();
    }
    
    public void initializeVariables() {
        f20314();
    }
    
    public void runTopLevelForms() {
        f20315();
    }
    
    static {
        me = (SubLFile)new module0304();
        module0304.$g2713$ = null;
        module0304.$g2714$ = null;
        module0304.$g2715$ = null;
        module0304.$g2716$ = null;
        module0304.$g2717$ = null;
        module0304.$g2718$ = null;
        module0304.$g2719$ = null;
        module0304.$g2720$ = null;
        module0304.$g2721$ = null;
        module0304.$g2722$ = null;
        module0304.$g2723$ = null;
        module0304.$g2724$ = null;
        module0304.$g2725$ = null;
        module0304.$g2726$ = null;
        module0304.$g2727$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#21917", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic2$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic3$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic4$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic5$ = SubLObjectFactory.makeKeyword("STRONG-FORT");
        $ic6$ = SubLObjectFactory.makeKeyword("ISA");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic9$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic10$ = SubLObjectFactory.makeInteger(512);
        $ic11$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic12$ = SubLObjectFactory.makeSymbol("S#22941", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#22942", "CYC");
        $ic14$ = SubLObjectFactory.makeString("no mapping method defiend for sbhl-table ~s");
        $ic15$ = SubLObjectFactory.makeKeyword("GAF");
        $ic16$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argsIsa"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#22944", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12585", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#22950", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argsGenl"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#22953", "CYC");
    }
    
    public static final class $f20296$UnaryFunction extends UnaryFunction
    {
        public $f20296$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15431"));
        }
        
        public SubLObject processItem(final SubLObject var57) {
            return module0304.f20296(var57);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0304.class
	Total time: 887 ms
	
	Decompiled with Procyon 0.5.32.
*/